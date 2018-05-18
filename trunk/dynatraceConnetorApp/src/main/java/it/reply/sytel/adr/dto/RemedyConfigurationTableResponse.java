package it.reply.sytel.adr.dto;

import java.io.Serializable;
import java.util.ArrayList;

import it.reply.sytel.adr.domain.Dashboard;
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
    	remedyConfigurationForTable.setUrl(remedyConfiguration.getUrl());
    	remedyConfigurationForTable.setUsername(remedyConfiguration.getUsername());
    	    	   
        ((ArrayList<RemedyConfigurationForTable>)this.data).add(remedyConfigurationForTable);
    }
  }
}
