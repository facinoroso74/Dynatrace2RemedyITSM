package it.reply.sytel.adr.dto;

import it.reply.sytel.adr.domain.Configuration;
import java.io.Serializable;
import java.util.ArrayList;

public class ConfigurationTableResponse
  implements Serializable
{
  private static final long serialVersionUID = -4677171240244035133L;
  private Iterable<ConfigurationForTable> data;
  
  public Iterable<ConfigurationForTable> getData()
  {
    return this.data;
  }
  
  public ConfigurationTableResponse(Iterable<Configuration> configurationList)
  {
    this.data = new ArrayList<ConfigurationForTable>();
    for (Configuration configuration : configurationList)
    {
      ConfigurationForTable configurationForTable = new ConfigurationForTable();
      configurationForTable.setCheckbox("");
      configurationForTable.setConfigurationId(configuration.getConfigurationId());
      configurationForTable.setTipoIncident(configuration.getTipoIncident());
      configurationForTable.setDescrizione(configuration.getDescrizione());
      configurationForTable.setDashboard(configuration.getDashboard());
      configurationForTable.setFirstName(configuration.getFirstName());
      configurationForTable.setLastName(configuration.getLastName());
      configurationForTable.setServiceType(configuration.getServiceType());
      configurationForTable.setStatus(configuration.getStatus());
      configurationForTable.setImpact(configuration.getImpact());
      configurationForTable.setUrgency(configuration.getUrgency());
      configurationForTable.setReportedSource(configuration.getReportedSource());
      configurationForTable.setAction(configuration.getAction());
      configurationForTable.setCreateRequest(configuration.getCreateRequest());
      configurationForTable.setSummary(configuration.getSummary());
      configurationForTable.setSorgenteSistema(configuration.getSorgenteSistema());
      configurationForTable.setAssignedGroup(configuration.getAssignedGroup());
      configurationForTable.setAssignedSupportCompany(configuration.getAssignedSupportCompany());
      configurationForTable.setAssignedSupportOrganization(configuration.getAssignedSupportOrganization());
      
      ((ArrayList<ConfigurationForTable>)this.data).add(configurationForTable);
    }
  }
}
