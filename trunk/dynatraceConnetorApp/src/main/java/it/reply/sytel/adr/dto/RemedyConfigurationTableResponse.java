package it.reply.sytel.adr.dto;

import java.io.Serializable;
import java.util.ArrayList;

import it.reply.sytel.adr.domain.RemedyConfiguration;

public class RemedyConfigurationTableResponse
  implements Serializable
{
  private static final long serialVersionUID = -4677171240244035133L;
  private Iterable<RemedyConfigurationForTable> data;
  
  public Iterable<RemedyConfigurationForTable> getData()
  {
    return this.data;
  }
  
  public RemedyConfigurationTableResponse(Iterable<RemedyConfiguration> remedyConfigurationList)
  {
    this.data = new ArrayList<RemedyConfigurationForTable>();
    for (RemedyConfiguration remedyConfiguration : remedyConfigurationList)
    {
    	RemedyConfigurationForTable remedyConfigurationForTable = new RemedyConfigurationForTable();
    	remedyConfigurationForTable.setCheckbox("");
    	remedyConfigurationForTable.setRemedyConfigurationId(remedyConfiguration.getRemedyConfigurationId());
    	remedyConfigurationForTable.setPassword(remedyConfiguration.getPassword());
    	remedyConfigurationForTable.setUsername(remedyConfiguration.getUsername());
    	remedyConfigurationForTable.setStatus(remedyConfiguration.getStatus());
    	remedyConfigurationForTable.setService_type(remedyConfiguration.getService_type());
    	remedyConfigurationForTable.setReported_source(remedyConfiguration.getReported_source());
    	remedyConfigurationForTable.setFirst_name(remedyConfiguration.getFirst_name());
    	remedyConfigurationForTable.setLast_name(remedyConfiguration.getLast_name());
    	remedyConfigurationForTable.setAction(remedyConfiguration.getAction());
    	remedyConfigurationForTable.setCreate_request(remedyConfiguration.getCreate_request());
    	remedyConfigurationForTable.setSede_int(remedyConfiguration.getSede_int());
    	remedyConfigurationForTable.setStatusResolved(remedyConfiguration.getStatusResolved());
    	remedyConfigurationForTable.setStatusReasonResolved(remedyConfiguration.getStatusReasonResolved());
    	remedyConfigurationForTable.setActionResolved(remedyConfiguration.getActionResolved());
    	remedyConfigurationForTable.setResolutionResolved(remedyConfiguration.getResolutionResolved());
    	
        ((ArrayList<RemedyConfigurationForTable>)this.data).add(remedyConfigurationForTable);
    }
  }
}
