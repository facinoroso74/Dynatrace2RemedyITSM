package it.reply.sytel.adr.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import it.reply.sytel.adr.domain.DynatraceIncidentBean;


public class DynatraceIncidentTableResponse implements Serializable{
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 2815243873284981181L;

	private Iterable<DynatraceIncidentForTable> data;
  
	private SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss,SSS");
	
	public Iterable<DynatraceIncidentForTable> getData(){
		return this.data;
	}
  
	public DynatraceIncidentTableResponse(Iterable<DynatraceIncidentBean> dataList){
	    this.data = new ArrayList<DynatraceIncidentForTable>();
	    for (DynatraceIncidentBean dynatraceIncidentBean : dataList)
	    {
	    	DynatraceIncidentForTable dynatraceIncidentForTable = new DynatraceIncidentForTable();
	    	dynatraceIncidentForTable.setCheckbox("");
	    	
	    	dynatraceIncidentForTable.setActions(dynatraceIncidentBean.getActions());
	    	dynatraceIncidentForTable.setConditions(dynatraceIncidentBean.getConditions());
	    	dynatraceIncidentForTable.setConfimedBy(dynatraceIncidentBean.getConfirmedBy());
	    	dynatraceIncidentForTable.setConfirmation(dynatraceIncidentBean.getConfirmation());
	    	dynatraceIncidentForTable.setDashboardName(dynatraceIncidentBean.getDashboardname());
	    	if(dynatraceIncidentBean.getDatains()!=null)
	    		dynatraceIncidentForTable.setDataIns(format.format(new Date(dynatraceIncidentBean.getDatains().getTime()) ));
	    	if(dynatraceIncidentBean.getDataupdate()!=null)
	    		dynatraceIncidentForTable.setDataUpdate(format.format(new Date(dynatraceIncidentBean.getDataupdate().getTime()) ));
	    	dynatraceIncidentForTable.setDuration(dynatraceIncidentBean.getDuration());
	    	if(dynatraceIncidentBean.getEndevent()!=null)
	    		dynatraceIncidentForTable.setEndEvent(format.format(new Date(dynatraceIncidentBean.getEndevent().getTime()) ));
	    	dynatraceIncidentForTable.setHeatfield(dynatraceIncidentBean.getHeatfield());
	    	dynatraceIncidentForTable.setId(dynatraceIncidentBean.getId());
	    	dynatraceIncidentForTable.setIncidentType(dynatraceIncidentBean.getIncidentType());
	    	dynatraceIncidentForTable.setMeasures(dynatraceIncidentBean.getMeasures());
	    	dynatraceIncidentForTable.setName(dynatraceIncidentBean.getName());
	    	if(dynatraceIncidentBean.getRemedyticketcreatedate()!=null)
	    		dynatraceIncidentForTable.setRemedyTicketCreateDate(format.format(new Date(dynatraceIncidentBean.getRemedyticketcreatedate().getTime()) ));
	    	dynatraceIncidentForTable.setRemedyTicketID(dynatraceIncidentBean.getRemedyticketid());
	    	dynatraceIncidentForTable.setRemedyTicketIDStatus(dynatraceIncidentBean.getRemedyticketidstatus());
	    	dynatraceIncidentForTable.setSensitivity(dynatraceIncidentBean.getSensitivity());
	    	dynatraceIncidentForTable.setSession(dynatraceIncidentBean.getSession());
	    	dynatraceIncidentForTable.setSource(dynatraceIncidentBean.getSource());
	    	if(dynatraceIncidentBean.getStartevent()!=null)
	    		dynatraceIncidentForTable.setStartEvent(format.format(new Date(dynatraceIncidentBean.getStartevent().getTime()) ));
	    	dynatraceIncidentForTable.setState(dynatraceIncidentBean.getState());
	    	dynatraceIncidentForTable.setThresholds(dynatraceIncidentBean.getThresholds());
	    	dynatraceIncidentForTable.setRemedyresponse(dynatraceIncidentBean.getRemedyresponse());
	        ((ArrayList<DynatraceIncidentForTable>)this.data).add(dynatraceIncidentForTable);
	    }
	 }
	
}
