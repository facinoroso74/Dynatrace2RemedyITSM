package it.reply.sytel.adr.remedyAdapter;

import hpdIncidentInterfaceWS.HelpDeskQueryServiceResponseDocument;
import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.vo.DynatraceIncident;

public interface RemedyClientToClose {

	public HelpDeskQueryServiceResponseDocument getIncidentFromRemedy(DynatraceIncident dynatraceIncident,RemedyConfiguration remedyConfiguration);
	
	public String closeTicketToRemedy(DynatraceIncident dynatraceIncident,RemedyConfiguration remedyConfiguration);

	public void resolveTicket(String remedyTicketId, HelpDeskQueryServiceResponseDocument helpDeskQueryServiceResponseDocument, RemedyConfiguration remedyConfiguration);
	
}
