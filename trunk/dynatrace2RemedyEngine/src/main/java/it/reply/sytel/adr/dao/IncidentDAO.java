package it.reply.sytel.adr.dao;

import java.sql.Timestamp;
import java.util.List;

import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public interface IncidentDAO {

	public void insertDynatraceIncident(DynatraceIncident dynatraceIncident);

	public List<DynatraceIncident> getDynatraceIncidentWithoutRemedyTicketID();
	
	public boolean alreadyExistsDynatraceIncident(DynatraceIncidentKey dynatraceIncidentKey);
	
	public void updateDynatraceIncidentDateUpdate(DynatraceIncidentKey dynatraceIncidentKey,Timestamp now);
	
	public void updateDynatraceIncidentAfterRemedyCall(DynatraceIncident dynatraceIncident);

	public List<DynatraceIncidentKey> getAllDynatraceIncidentNotMoreExist(Timestamp now);

	public void deleteDynaraceIncident(DynatraceIncidentKey dynatraceIncidentKey);

	public void updateDynatraceIncidentEndDateUpdate(DynatraceIncident dynatraceIncident);

	public boolean isDynatraceIncidentWithTicketIDAndStatusNewWithoutEndDate(DynatraceIncidentKey dynatraceIncidentKey);
	
	public List<DynatraceIncident> getDynatraceIncidentWithTicketIDAndStatusNewAndEndDate();

	public void updateDynatraceIncidentCallWithStatusWithError(DynatraceIncident dynatraceIncident);

	public void setDynatraceIncidentStatus(DynatraceIncident dynatraceIncident, String status);

	public int deleteOldDynatraceIncidents(int retentionDays);

}
