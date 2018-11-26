package it.reply.sytel.adr.dynatraceClient.imp;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.xmlbeans.XmlException;

import it.reply.sytel.adr.dynatraceClient.DynatraceClient;
import it.reply.sytel.adr.dynatraceClient.RestClient;
import it.reply.sytel.adr.dynatraceClient.exc.BuildMapDynatraceIncidentFromDashboardreportException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;
import noNamespace.DashboardreportDocument;
import noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet;
import noNamespace.IncidentsoverviewdashletDocument.Incidentsoverviewdashlet.Incidentoverviewrecords.Incidentoverviewrecord;

public class DynatraceClientImpl implements DynatraceClient{

	private RestClient restClient;
	private org.apache.logging.log4j.Logger log = LogManager.getLogger(getClass());
	
	@Override
	public Map<DynatraceIncidentKey, DynatraceIncident> getDynatraceIncidents(String dashboardName,String appUrl,String user,String pwd) {
		String dashboardreportBuffer = restClient.invokeRestService(appUrl, user, pwd);
		return buildMapDynatraceIncidentFromDashboardreport(dashboardName,dashboardreportBuffer);
	}
	
	private boolean checkIncidentoverviewrecordToWork(noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord) {
		if(incidentoverviewrecord.getName()!=null &&  incidentoverviewrecord.getStart()!=null)
			return true;
		return false;
	}
	
	private void loopOverIncidentoverviewrecordArray(String dashboardName,String incidentTypeFather,Map<DynatraceIncidentKey, DynatraceIncident> dynatraceIncidentMap,noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] incidentoverviewrecordArray) {
		
		//log.debug("loopOverIncidentoverviewrecordArray calling...");
		
				
		for (int i = 0; i < incidentoverviewrecordArray.length; i++) {
			
			if(checkIncidentoverviewrecordToWork(incidentoverviewrecordArray[i])) {
				
				if(log.isDebugEnabled()) {
					log.debug("------ALLARME-----:["+incidentoverviewrecordArray[i].xmlText()+"] incidentType:["+incidentTypeFather+"]");
				}
				DynatraceIncident dynatraceIncident = buildDynatraceIncident(dashboardName,incidentoverviewrecordArray[i],incidentTypeFather);
				dynatraceIncidentMap.put(dynatraceIncident.getDynatraceIncidentKey(), dynatraceIncident);
			}
			
			String incidentTypeChild=incidentoverviewrecordArray[i].getName();
			if(log.isDebugEnabled())
				log.debug("incidentTypeChild:["+incidentTypeChild+"]");
			
			noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord[] incidentoverviewrecordArrayChildren = incidentoverviewrecordArray[i].getIncidentoverviewrecordArray();

		if(incidentoverviewrecordArrayChildren!=null);
			loopOverIncidentoverviewrecordArray(dashboardName,incidentTypeChild,dynatraceIncidentMap,incidentoverviewrecordArrayChildren);
		}
		
		//log.debug("loopOverIncidentoverviewrecordArray calling... DONE");
	}

	
	private DynatraceIncident buildDynatraceIncident(String dashboardName, noNamespace.IncidentoverviewrecordDocument.Incidentoverviewrecord incidentoverviewrecord,String incidentTypeFather) {
		DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
		dynatraceIncidentKey.setName(incidentoverviewrecord.getName());
		dynatraceIncidentKey.setStartEvent(new Timestamp(incidentoverviewrecord.getStart().getTimeInMillis()));
		dynatraceIncidentKey.setDashboarName(dashboardName);
		
		DynatraceIncident dynatraceIncident = new DynatraceIncident();
		dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey);
		
		dynatraceIncident.setHeatfield(incidentoverviewrecord.getHeatfield());
		dynatraceIncident.setState(incidentoverviewrecord.getState());
		dynatraceIncident.setDuration(incidentoverviewrecord.getDuration());
		if(incidentoverviewrecord.getEnd()!=null)
			dynatraceIncident.setEndEvent(new Timestamp(incidentoverviewrecord.getEnd().getTimeInMillis()));
		dynatraceIncident.setSource(incidentoverviewrecord.getSource());
		dynatraceIncident.setSession(incidentoverviewrecord.getSession());
		dynatraceIncident.setConfimed_by(incidentoverviewrecord.getConfirmedBy());
		dynatraceIncident.setSensitivity(incidentoverviewrecord.getSensitivity());
		dynatraceIncident.setConditions(incidentoverviewrecord.getConditions());
		dynatraceIncident.setThresholds(incidentoverviewrecord.getThresholds());
		dynatraceIncident.setActions(incidentoverviewrecord.getActions());
		dynatraceIncident.setMeasures(incidentoverviewrecord.getMeasures());
		dynatraceIncident.setIncidentType(incidentTypeFather);
		
		return dynatraceIncident;
	}
	
	public Map<DynatraceIncidentKey, DynatraceIncident> buildMapDynatraceIncidentFromDashboardreport(String dashboardName,String dashboardreportBuffer) {
		try {
			
			Map<DynatraceIncidentKey, DynatraceIncident> dynatraceIncidentMap = new HashMap<DynatraceIncidentKey, DynatraceIncident>();
			DashboardreportDocument dashboardreportDocument = DashboardreportDocument.Factory.parse(dashboardreportBuffer);
			Incidentsoverviewdashlet[] incidentsoverviewdashletsArr= dashboardreportDocument.getDashboardreport().getData().getIncidentsoverviewdashletArray();
			
			if(incidentsoverviewdashletsArr.length!=0){
				Incidentoverviewrecord[] incidentoverviewrecordArray = incidentsoverviewdashletsArr[0].getIncidentoverviewrecords().getIncidentoverviewrecordArray();
				//devo ciclare opportunamente l'array incidentoverviewrecordArray
				//e prendere tutti i nodi che presentano gli attributi name e start
				//quando li trovo devo popolare la mappa
				
				String incidentType=incidentsoverviewdashletsArr[0].getName();
				
				if(log.isDebugEnabled())
					log.debug("---------FirstIncidentType:["+incidentType+"]----------------");
				
				if(incidentoverviewrecordArray.length!=0)
					loopOverIncidentoverviewrecordArray(dashboardName,incidentType,dynatraceIncidentMap,incidentoverviewrecordArray[0].getIncidentoverviewrecordArray());
			}

			return dynatraceIncidentMap;
			
		} catch (XmlException e) {
			throw new BuildMapDynatraceIncidentFromDashboardreportException("Exception on building the map from content:["+dashboardreportBuffer+"]");
		}
	}
	
	public RestClient getRestClient() {
		return restClient;
	}

	public void setRestClient(RestClient restClient) {
		this.restClient = restClient;
	}

	public static void main(String[] args) {
		
		String dashboardreportBuffer="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
		"<dashboardreport name=\"ADBM_TEST_REMEDY_INTEGRATION\" version=\"7.0.10.1010\" reportdate=\"2018-03-21T18:14:58.485+01:00\" description=\"\">\r\n" + 
		"  <source name=\"ADBM_TEST\">\r\n" + 
		"    <filters summary=\"last 24 hours\">\r\n" + 
		"      <filter>tf:Last24h</filter>\r\n" + 
		"    </filters>\r\n" + 
		"  </source>\r\n" + 
		"  <data>\r\n" + 
		"    <incidentsoverviewdashlet name=\"Incidents\" description=\"\" displaysource=\"Base\">\r\n" + 
		"      <source>\r\n" + 
		"        <filters summary=\"Incident Rules, last 24 hours\">\r\n" + 
		"          <filter>tfLast24h</filter>\r\n" + 
		"          <filter></filter>\r\n" + 
		"        </filters>\r\n" + 
		"      </source>\r\n" + 
		"      <incidentoverviewrecords structuretype=\"tree\">\r\n" + 
		"        <incidentoverviewrecord name=\"ADBM_TEST (6)\">\r\n" + 
		"          <incidentoverviewrecord name=\"Agent Instrumentation Disabled\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Application Process Out-of-Memory\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Application Process Unavailable (unexpected)\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Application Process Unhealthy\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"CURRENT_Q_DEPTH (6)\">\r\n" + 
		"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_ANAGRAFICA] (ARAPPX02_QM_THRESHOULD_10@192.168.175.144) ARAPPX02_QM_THRESHOULD_10 upper bound exceeded\" start=\"2018-03-08T16:40:10.000+01:00\" source=\"ARAPPX02_QM_THRESHOLD_10@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
		"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_NAS] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T22:56:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
		"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_UFIS_ADR] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T19:29:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
		"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;ADBM_QU_UFIS_TEST] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T22:10:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
		"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;LM_QU_ADBM] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-12T00:47:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
		"            <incidentoverviewrecord name=\"Queue Group/CURRENT_Q_DEPTH: CURRENT_Q_DEPTH [Queue Name-&gt;TELEX_QU_ADBM] (ARAPPX02_QM - Test1@192.168.175.144) ARAPPX02_QM - Test1 upper bound exceeded\" start=\"2018-03-19T16:45:10.000+01:00\" source=\"ARAPPX02_QM - Test1@192.168.175.144\"></incidentoverviewrecord>\r\n" + 
		"          </incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Database Agent Connection Issue\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Failure rate too high\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"JDBC Connection Pool Percent Used\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"JDBC Connection Pool Waiting Thread Count\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Potentially stuck Java VM detected\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Response time degraded\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Response time degraded for slow requests\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Status of the QM\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Thread Declared Hung\"></incidentoverviewrecord>\r\n" + 
		"          <incidentoverviewrecord name=\"Total GC Collection Time\">\r\n" + 
		"                <incidentoverviewrecord name=\"Java Virtual Machine/Total GC Collection Time: Total GC Collection Time (WebSphere_ADBM_TEST[arappx03Cell01-app_adbm_mercuriox2]@mercurio) upper bound exceeded\" start=\"2018-03-23T03:00:20.000+01:00\" duration=\"10000\" end=\"2018-03-23T03:00:30.000+01:00\" source=\"WebSphere_ADBM_TEST[arappx03Cell01-app_adbm_mercuriox2]@mercurio all-applications\">"+
		"                </incidentoverviewrecord>\r\n" +
		"          </incidentoverviewrecord>\r\n" +
		"        </incidentoverviewrecord>\r\n" + 
		"      </incidentoverviewrecords>\r\n" + 
		"    </incidentsoverviewdashlet>\r\n" + 
		"  </data>\r\n" + 
		"</dashboardreport>";
		
		try {
			DashboardreportDocument dashboardreportDocument = DashboardreportDocument.Factory.parse(dashboardreportBuffer);
			DynatraceClientImpl dynatraceClient = new DynatraceClientImpl();
			dynatraceClient.buildMapDynatraceIncidentFromDashboardreport("ADBM", dashboardreportBuffer);
			System.out.println("DONE");
		} catch (XmlException e) {
			e.printStackTrace();
		}
		
	}
}
