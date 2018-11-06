package it.reply.sytel.adr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.dao.exc.DaoException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public class IncidentDAOImpl implements IncidentDAO {
	
	//network
	public static final String DRIVER_DB = "org.apache.derby.jdbc.ClientDriver";

	private String protocol;
	private String port;
	private String dbName;
//	private  String connectionURL = "jdbc:derby:"+protocol + dbName; 
//	
	javax.sql.DataSource ds=null;
	
	
	private static final String SQL_INSERT_INCIDENT="INSERT INTO INCIDENT(name,heatfield,state,startEvent,duration,"
																	   + "endEvent,source,session,confirmed_by,confirmation,"
																	   + "sensitivity,conditions,thresholds,actions,measures,"
																	   + "datains,dataupdate,remedyTicketId,remedyTicketIdStatus,remedyTicketCreateDate,"
																	   + "dashboardName,incident_type) "
																+ "VALUES"
																		+ "(?,?,?,?,?,"
																		+  "?,?,?,?,?,"
																		+  "?,?,?,?,?,"
																		+  "?,?,?,?,?,"
																		+  "?,?)";
			
	private static final String SQL_UPDATE_INCIDENT_DATE_UPDATE="UPDATE INCIDENT set dataupdate=? where name=? and startEvent=?";
	

	private static final String SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA="UPDATE INCIDENT "
			+ 	"set REMEDYTICKETID=?, "
			+	" REMEDYTICKETIDSTATUS=?, "
			+	" REMEDYTICKETCREATEDATE=?,"
			+   " remedyResponse=? "
			+ "where "
			+ 	" name=? "
			+ 	" and startEvent=?";
	
	private static final String SQL_UPDATE_INCIDENT_WITH_ERROR="UPDATE INCIDENT "
			+ 	"set remedyResponse=? "
			+ "where "
			+ 	" name=? "
			+ 	" and startEvent=?";
	
	private static final String SQL_UPDATE_INCIDENT_STATUS="UPDATE INCIDENT "
			+ 	"set remedyTicketIDStatus=? "
			+ "where "
			+ 	" name=? "
			+ 	" and startEvent=?";
	

	private static final String SQL_DELETE_OLD_INCIDENT="DELETE FROM incident "
															+ " WHERE "
															+ " {fn TIMESTAMPDIFF( SQL_TSI_DAY, DATAINS, CURRENT_TIMESTAMP)} > ? "
															+ " and (remedyticketidstatus='Resolved' OR remedyticketidstatus='Closed')";
	
	
	private static final String SQL_CHECK_INCIDENT_EXIST="SELECT "
																		+ " 	name,"
																	    + " 	startEvent"
																	    + " FROM "
																	    + "     INCIDENT "
																	    + " WHERE "
																	    + " name=?"
																	    + " and startEvent=? "
																	    + " and dashboardName=?";
	
	private static final String SQL_GET_INCIDENT_WITHOUT_REMEDY_TICKET_ID="SELECT "
																			+ " * "
																		    + " FROM "
																		    + "     INCIDENT "
																		    + " WHERE "
																		    + " 	REMEDYTICKETID is null";
	
	
	private static final String SQL_SELECT_INCIDENT_NO_MORE_EXIST="SELECT "
			+ " 	name,"
		    + " 	startEvent,"
		    + "     dashboardName"
		    + " FROM "
		    + "     INCIDENT "
		    + " WHERE "
		    + " dataupdate<?";
	
	private static final String SQL_DELETE_INCIDENT_BY_KEY="DELETE from INCIDENT "
																+ "where "
																+ 	" name=? "
																+ 	" and startEvent=?";
	
	private static final String SQL_UPDATE_INCIDENT_WITH_ENDDATE="UPDATE INCIDENT "
																		+ "set endEvent=? "
																		+ "where "
																		+ "name=? "
																		+ "and startEvent=?";
																		
	
	private static final String SQL_CHECK_INCIDENT_TO_UPDATE_WITHOUT_ENDDATE="SELECT "
															+ " 	name,"
														    + " 	startEvent"
														    + " FROM "
														    + "     INCIDENT "
														    + " WHERE "
														    + " name=?"
														    + " and startEvent=? "
														    + " and dashboardName=?"
															+ " and remedyTicketIdStatus=?"
															+ " and remedyTicketID is not null "
															+ " and endEvent is null";
	
	private static final String SQL_CHECK_INCIDENT_TO_UPDATE_WITH_ENDDATE="SELECT "
																			+ " * "
																		    + " FROM "
																		    + "     INCIDENT "
																		    + " WHERE "
																			+ " remedyTicketIdStatus=?"
																			+ " and remedyTicketID is not null "
																			+ " and endEvent is not null";
	//TODO
	//+ " and endEvent is not null";
	
	public IncidentDAOImpl() {
	}
	
	public void init() {
			
		ds = new org.apache.derby.jdbc.ClientDataSource();
		((org.apache.derby.jdbc.ClientDataSource) ds).setServerName(this.protocol);
		((org.apache.derby.jdbc.ClientDataSource) ds).setPortNumber((Integer.parseInt(this.port)));
		//((org.apache.derby.jdbc.ClientDataSource) ds).setDatabaseName("d:/DerbyDB/IncidentDB;create=false");
		((org.apache.derby.jdbc.ClientDataSource) ds).setDatabaseName(this.dbName);
		//((org.apache.derby.jdbc.ClientDataSource) ds).setTraceDirectory("d:/DerbyDB/myTraceDir");
	}

	private Logger log = LogManager.getLogger(getClass());
	
	
	private void closeResource(Connection conn, Statement stmt, ResultSet rslt) {
		
		if(rslt!=null)
			try {
				rslt.close();
			} catch (SQLException e) {
				throw new DaoException("Exception on close ResultSet",e);
			}
		if(stmt!=null)
			try {
				stmt.close();
			} catch (SQLException e) {
				throw new DaoException("Exception on close statement",e);
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DaoException("Exception on close connection",e);
			}			
	}
		
	private void checkKey(DynatraceIncidentKey dynatraceIncidentKey) {
		if(dynatraceIncidentKey.getName()==null || dynatraceIncidentKey.getStartEvent()==null)
			throw new DaoException("Excpetion on IncidentDAOImpl. Some key field is null. Name:["+dynatraceIncidentKey.getName()+"] startEvent:["+dynatraceIncidentKey.getStartEvent()+"]");
	}
	
		
	@Override
	public void insertDynatraceIncident(DynatraceIncident dynatraceIncident) {
		
		PreparedStatement stmt=null;
		
		try{
			checkKey(dynatraceIncident.getDynatraceIncidentKey());
			
			Connection conn=ds.getConnection();
			
			stmt=conn.prepareStatement(SQL_INSERT_INCIDENT);
			
			stmt.setString(1, dynatraceIncident.getDynatraceIncidentKey().getName());
			stmt.setString(2, dynatraceIncident.getHeatfield());
			stmt.setString(3, dynatraceIncident.getState());
			stmt.setTimestamp(4, dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
			stmt.setString(5, dynatraceIncident.getDuration());
			stmt.setTimestamp(6, dynatraceIncident.getEndEvent());
			stmt.setString(7, dynatraceIncident.getSource());
			stmt.setString(8, dynatraceIncident.getSession());
			stmt.setString(9, dynatraceIncident.getConfimed_by());
			stmt.setString(10, dynatraceIncident.getConfirmation());
			stmt.setString(11, dynatraceIncident.getSensitivity());
			stmt.setString(12, dynatraceIncident.getConditions());
			stmt.setString(13, dynatraceIncident.getThresholds());
			stmt.setString(14, dynatraceIncident.getActions());
			stmt.setString(15, dynatraceIncident.getMeasures());
			stmt.setTimestamp(16, dynatraceIncident.getDataIns());
			stmt.setTimestamp(17, dynatraceIncident.getDataUpdate());
			stmt.setString(18, dynatraceIncident.getRemedyTicketID());
			stmt.setString(19, dynatraceIncident.getRemedyTicketIDStatus());
			stmt.setTimestamp(20, dynatraceIncident.getRemedyTicketCreateDate());
			stmt.setString(21, dynatraceIncident.getDynatraceIncidentKey().getDashboarName());
			stmt.setString(22, dynatraceIncident.getIncidentType());
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
		} catch (Exception e) {
			throw new DaoException("Excpeption into insertDynatraceIncident:["+dynatraceIncident+"]",e);
		} finally {
			closeResource(null,stmt,null);
		}

	}

	@Override
	public boolean alreadyExistsDynatraceIncident(DynatraceIncidentKey dynatraceIncidentKey){
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_CHECK_INCIDENT_EXIST);
			stmt.setString(1, dynatraceIncidentKey.getName());
			stmt.setTimestamp(2, dynatraceIncidentKey.getStartEvent());
			stmt.setString(3, dynatraceIncidentKey.getDashboarName());
			
			rslt=stmt.executeQuery();
			
			int total=0;
			while (rslt.next()){
				total++;
				
				log.debug("name:["+ rslt.getString("name")+ " startEvent:[" + rslt.getTimestamp("startEvent")+"]");
			}
						
			if(total>0)
				return true;
			
			return false;
					
		}catch (Exception e) {
			throw new DaoException("Exception alreadyExistsDynatraceIncident. dynatraceIncidentKey:["+dynatraceIncidentKey+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}


	



	@Override
	public void updateDynatraceIncidentDateUpdate(DynatraceIncidentKey dynatraceIncidentKey,Timestamp now) {

		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_DATE_UPDATE);
			stmt.setTimestamp(1, now);
			stmt.setString(2,dynatraceIncidentKey.getName());
			stmt.setTimestamp(3, dynatraceIncidentKey.getStartEvent());
						
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
			if(total==0)
				throw new DaoException("the DynatraceIncident "+dynatraceIncidentKey+" not updated into table for DATAUPDATE");
			
		}catch (Exception e) {
			throw new DaoException("Exception updateDynatraceIncidentDateUpdate. dynatraceIncidentKey:["+dynatraceIncidentKey+"] and dateupdate:["+now+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public List<DynatraceIncident> getDynatraceIncidentWithoutRemedyTicketID() {
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		List<DynatraceIncident> dynatraceIncidentList = new ArrayList<DynatraceIncident>();
		
		try{
		    
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_GET_INCIDENT_WITHOUT_REMEDY_TICKET_ID);
			
			rslt=stmt.executeQuery();
			
			while (rslt.next()){
				
				DynatraceIncident dynatraceIncident = new DynatraceIncident();
				DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
				dynatraceIncidentKey.setName(rslt.getString("name"));
				dynatraceIncidentKey.setStartEvent(rslt.getTimestamp("startEvent"));
				dynatraceIncidentKey.setDashboarName(rslt.getString("dashboardName"));
				
				dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey);
				dynatraceIncident.setActions(rslt.getString("actions"));
				dynatraceIncident.setConditions(rslt.getString("conditions"));
				dynatraceIncident.setConfimed_by(rslt.getString("confirmed_by"));
				dynatraceIncident.setConfirmation(rslt.getString("confirmation"));
				dynatraceIncident.setDataIns(rslt.getTimestamp("dataIns"));
				dynatraceIncident.setDataUpdate(rslt.getTimestamp("dataupdate"));
				dynatraceIncident.setDuration(rslt.getString("duration"));
				dynatraceIncident.setEndEvent(rslt.getTimestamp("endEvent"));
				dynatraceIncident.setHeatfield(rslt.getString("heatfield"));
				dynatraceIncident.setId(rslt.getInt("id"));
				dynatraceIncident.setMeasures(rslt.getString("measures"));
				dynatraceIncident.setSensitivity(rslt.getString("sensitivity"));
				dynatraceIncident.setSession(rslt.getString("session"));
				dynatraceIncident.setSource(rslt.getString("source"));
				dynatraceIncident.setState(rslt.getString("state"));
				dynatraceIncident.setThresholds(rslt.getString("thresholds"));
				
				dynatraceIncident.setIncidentType(rslt.getString("incident_type"));
				
				dynatraceIncidentList.add(dynatraceIncident);
				
			}
				
			return dynatraceIncidentList;
					
		}catch (Exception e) {
			throw new DaoException("Exception getDynatraceIncidentWithoutRemedyTicketID", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}


	@Override
	public void updateDynatraceIncidentAfterRemedyCall(DynatraceIncident dynatraceIncident) {

		//SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA);
			stmt.setString(1, dynatraceIncident.getRemedyTicketID());
			stmt.setString(2,dynatraceIncident.getRemedyTicketIDStatus());
			stmt.setTimestamp(3, dynatraceIncident.getRemedyTicketCreateDate());
			stmt.setString(4, "OK");
			
			stmt.setString(5, dynatraceIncident.getDynatraceIncidentKey().getName());
			stmt.setTimestamp(6, dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
			if(total==0)
				throw new DaoException("the DynatraceIncident "+dynatraceIncident+" not updated into table for DataInsert Remedyticket");
			
		}catch (Exception e) {
			throw new DaoException("Exception updateDynatraceIncidentAfterRemedyCall. dynatraceIncident:["+dynatraceIncident+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public List<DynatraceIncidentKey> getAllDynatraceIncidentNotMoreExist(Timestamp now) {
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		List<DynatraceIncidentKey> dynatraceIncidentKeyList = new ArrayList<DynatraceIncidentKey>();
		
		try{
		    
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_INCIDENT_NO_MORE_EXIST);
			
			stmt.setTimestamp(1, now);
			
			rslt=stmt.executeQuery();
			
			while (rslt.next()){
				
				DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
				dynatraceIncidentKey.setName(rslt.getString("name"));
				dynatraceIncidentKey.setStartEvent(rslt.getTimestamp("startEvent"));
				dynatraceIncidentKey.setDashboarName(rslt.getString("dashboardName"));
				
				dynatraceIncidentKeyList.add(dynatraceIncidentKey);
				
			}
				
			return dynatraceIncidentKeyList;
					
		}catch (Exception e) {
			throw new DaoException("Exception getAllDynatraceIncidentNotMoreExist with sysdate:["+now+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public void deleteDynaraceIncident(DynatraceIncidentKey dynatraceIncidentKey) {
		
		//SQL_UPDATE_INCIDENT_WITH_REMEDY_DATA
				PreparedStatement stmt=null;
				Connection conn = null;
				ResultSet rslt=null;
				
				try{
				    
					conn = ds.getConnection();
					
					stmt = conn.prepareStatement(SQL_DELETE_INCIDENT_BY_KEY);
					stmt.setString(1, dynatraceIncidentKey.getName());
					stmt.setTimestamp(2,dynatraceIncidentKey.getStartEvent());
					
					int total=stmt.executeUpdate();
					
					if(log.isDebugEnabled())
						log.debug("delete " + total + " rows");
							
					if(total==0)
						throw new DaoException("the DynatraceIncident "+dynatraceIncidentKey+" not delete into table");
					
				}catch (Exception e) {
					throw new DaoException("Exception deleteDynaraceIncident. dynatraceIncidentKey:["+dynatraceIncidentKey+"]", e);
				} finally {
					closeResource(null, stmt, rslt);
				}
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	@Override
	public void updateDynatraceIncidentEndDateUpdate(DynatraceIncident dynatraceIncident) {
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_WITH_ENDDATE);
			stmt.setTimestamp(1, dynatraceIncident.getEndEvent());
			stmt.setString(2, dynatraceIncident.getDynatraceIncidentKey().getName());
			stmt.setTimestamp(3,dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Update Executed. " + total + " rows");
					
			if(total==0)
				log.debug("the DynatraceIncident "+dynatraceIncident.getDynatraceIncidentKey()+" has been not updated because the remedyTicketId is not null");
			
		}catch (Exception e) {
			throw new DaoException("Exception updateDynatraceIncident. DynatraceIncidentKey:["+dynatraceIncident.getDynatraceIncidentKey()+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public boolean isDynatraceIncidentWithTicketIDAndStatusNewWithoutEndDate(DynatraceIncidentKey dynatraceIncidentKey) {
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
//			+ " name=?"
//			+ " and startEvent=? "
//			+ " and dashboardName=?"
//			+ " and status=?"
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_CHECK_INCIDENT_TO_UPDATE_WITHOUT_ENDDATE);
			
			stmt.setString(1,dynatraceIncidentKey.getName());
			stmt.setTimestamp(2,dynatraceIncidentKey.getStartEvent());
			stmt.setString(3,dynatraceIncidentKey.getDashboarName());
			stmt.setString(4,"New");
			
			rslt=stmt.executeQuery();
			
			while (rslt.next()){
				return true;
			}
			return false;
					
		}catch (Exception e) {
			throw new DaoException("Exception isDynatraceIncidentWithTicketIDAndStatusNewAndEndDate with dynatraceIncidentKey:["+dynatraceIncidentKey+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}
	
	@Override
	public List<DynatraceIncident> getDynatraceIncidentWithTicketIDAndStatusNewAndEndDate(){
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		List<DynatraceIncident> dynatraceIncidentList = new ArrayList<DynatraceIncident>();
		
		try{

			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_CHECK_INCIDENT_TO_UPDATE_WITH_ENDDATE);
			
			stmt.setString(1,"New");
						
			rslt=stmt.executeQuery();
			
			while (rslt.next()){
				
				DynatraceIncident dynatraceIncident = new DynatraceIncident();
				DynatraceIncidentKey dynatraceIncidentKey2 = new DynatraceIncidentKey();
				dynatraceIncidentKey2.setName(rslt.getString("name"));
				dynatraceIncidentKey2.setStartEvent(rslt.getTimestamp("startEvent"));
				dynatraceIncidentKey2.setDashboarName(rslt.getString("dashboardName"));
				
				dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey2);
				dynatraceIncident.setActions(rslt.getString("actions"));
				dynatraceIncident.setConditions(rslt.getString("conditions"));
				dynatraceIncident.setConfimed_by(rslt.getString("confirmed_by"));
				dynatraceIncident.setConfirmation(rslt.getString("confirmation"));
				dynatraceIncident.setDataIns(rslt.getTimestamp("dataIns"));
				dynatraceIncident.setDataUpdate(rslt.getTimestamp("dataupdate"));
				dynatraceIncident.setDuration(rslt.getString("duration"));
				dynatraceIncident.setEndEvent(rslt.getTimestamp("endEvent"));
				dynatraceIncident.setHeatfield(rslt.getString("heatfield"));
				dynatraceIncident.setId(rslt.getInt("id"));
				dynatraceIncident.setMeasures(rslt.getString("measures"));
				dynatraceIncident.setSensitivity(rslt.getString("sensitivity"));
				dynatraceIncident.setSession(rslt.getString("session"));
				dynatraceIncident.setSource(rslt.getString("source"));
				dynatraceIncident.setState(rslt.getString("state"));
				dynatraceIncident.setThresholds(rslt.getString("thresholds"));
				
				dynatraceIncident.setIncidentType(rslt.getString("incident_type"));
				dynatraceIncident.setRemedyTicketID(rslt.getString("remedyTicketID"));
				dynatraceIncident.setRemedyTicketIDStatus(rslt.getString("remedyTicketIDStatus"));
				
				dynatraceIncidentList.add(dynatraceIncident);
				
			}
			
			return dynatraceIncidentList;
			
		}catch (Exception e) {
			throw new DaoException("Exception getDynatraceIncidentWithTicketIDAndStatusNewAndEndDate", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public void updateDynatraceIncidentCallWithStatusWithError(DynatraceIncident dynatraceIncident) {
		
				PreparedStatement stmt=null;
				Connection conn = null;
				ResultSet rslt=null;
				
				try{
				    
					conn = ds.getConnection();
					
					stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_WITH_ERROR);
					
					stmt.setString(1, "ERROR");
					stmt.setString(2, dynatraceIncident.getDynatraceIncidentKey().getName());
					stmt.setTimestamp(3, dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
					
					int total=stmt.executeUpdate();
					
					if(log.isDebugEnabled())
						log.debug("Updated " + total + " rows");
							
					if(total==0)
						throw new DaoException("the DynatraceIncident "+dynatraceIncident+" not updated for ERROR");
					
				}catch (Exception e) {
					throw new DaoException("Exception updateDynatraceIncidentCallWithStatusWithError. dynatraceIncident:["+dynatraceIncident+"]", e);
				} finally {
					closeResource(null, stmt, rslt);
				}
	}

	@Override
	public void setDynatraceIncidentStatus(DynatraceIncident dynatraceIncident, String status) {
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_UPDATE_INCIDENT_STATUS);
			
			stmt.setString(1, status);
			stmt.setString(2, dynatraceIncident.getDynatraceIncidentKey().getName());
			stmt.setTimestamp(3, dynatraceIncident.getDynatraceIncidentKey().getStartEvent());
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
					
			if(total==0)
				throw new DaoException("the DynatraceIncident status for "+dynatraceIncident+" not updated");
			
		}catch (Exception e) {
			throw new DaoException("Exception setDynatraceIncidentStatus. dynatraceIncident:["+dynatraceIncident+"]", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}

	@Override
	public int deleteOldDynatraceIncidents(int retentionDays) {
		
		PreparedStatement stmt=null;
		Connection conn = null;
		ResultSet rslt=null;
		
		try{
		    
			conn = ds.getConnection();
			
			stmt = conn.prepareStatement(SQL_DELETE_OLD_INCIDENT);
			
			stmt.setInt(1, retentionDays);
			
			int total=stmt.executeUpdate();
			
			if(log.isDebugEnabled())
				log.debug("Updated " + total + " rows");
			
			return total;
			
		}catch (Exception e) {
			throw new DaoException("Exception deleteOldDynatraceIncidents", e);
		} finally {
			closeResource(null, stmt, rslt);
		}
	}
	

}
