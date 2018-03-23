package it.reply.sytel.adr.remedyAdapter;

import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.vo.DynatraceIncident;

public interface RemedyClient {

	public String createIncident(DynatraceIncident dynatraceIncident,RemedyConfiguration remedyConfiguration,Configuration incidentTypeConfiguration);
	
}
