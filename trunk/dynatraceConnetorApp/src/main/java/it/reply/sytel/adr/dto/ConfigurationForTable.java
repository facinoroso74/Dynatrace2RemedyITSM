package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class ConfigurationForTable
  implements Serializable
{
  private static final long serialVersionUID = 4530885422464761592L;
  String checkbox = "";
  Long configurationId;
  String tipoIncident;
  String descrizione;
  String dashboard;
  String firstName;
  String lastName;
  String serviceType;
  String status;
  String impact;
  String urgency;
  String reportedSource;
  String action;
  String createRequest;
  String summary;
  String sorgenteSistema;
  String assignedGroup;
  String assignedSupportCompany;
  String assignedSupportOrganization;
  
  public String getCheckbox()
  {
    return this.checkbox;
  }
  
  public void setCheckbox(String checkbox)
  {
    this.checkbox = checkbox;
  }
  
  public Long getConfigurationId()
  {
    return this.configurationId;
  }
  
  public void setConfigurationId(Long configurationId)
  {
    this.configurationId = configurationId;
  }
  
  public String getTipoIncident()
  {
    return this.tipoIncident;
  }
  
  public void setTipoIncident(String tipoIncident)
  {
    this.tipoIncident = tipoIncident;
  }
  
  public String getDescrizione()
  {
    return this.descrizione;
  }
  
  public void setDescrizione(String descrizione)
  {
    this.descrizione = descrizione;
  }
  
  public String getDashboard()
  {
    return this.dashboard;
  }
  
  public void setDashboard(String dashboard)
  {
    this.dashboard = dashboard;
  }
  
  public String getFirstName()
  {
    return this.firstName;
  }
  
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  
  public String getLastName()
  {
    return this.lastName;
  }
  
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  
  public String getServiceType()
  {
    return this.serviceType;
  }
  
  public void setServiceType(String serviceType)
  {
    this.serviceType = serviceType;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public String getImpact()
  {
    return this.impact;
  }
  
  public void setImpact(String impact)
  {
    this.impact = impact;
  }
  
  public String getUrgency()
  {
    return this.urgency;
  }
  
  public void setUrgency(String urgency)
  {
    this.urgency = urgency;
  }
  
  public String getReportedSource()
  {
    return this.reportedSource;
  }
  
  public void setReportedSource(String reportedSource)
  {
    this.reportedSource = reportedSource;
  }
  
  public String getAction()
  {
    return this.action;
  }
  
  public void setAction(String action)
  {
    this.action = action;
  }
  
  public String getCreateRequest()
  {
    return this.createRequest;
  }
  
  public void setCreateRequest(String createRequest)
  {
    this.createRequest = createRequest;
  }
  
  public String getSummary()
  {
    return this.summary;
  }
  
  public void setSummary(String summary)
  {
    this.summary = summary;
  }
  
  public String getSorgenteSistema()
  {
    return this.sorgenteSistema;
  }
  
  public void setSorgenteSistema(String sorgenteSistema)
  {
    this.sorgenteSistema = sorgenteSistema;
  }
  
  public String getAssignedGroup()
  {
    return this.assignedGroup;
  }
  
  public void setAssignedGroup(String assignedGroup)
  {
    this.assignedGroup = assignedGroup;
  }
  
  public String getAssignedSupportCompany()
  {
    return this.assignedSupportCompany;
  }
  
  public void setAssignedSupportCompany(String assignedSupportCompany)
  {
    this.assignedSupportCompany = assignedSupportCompany;
  }
  
  public String getAssignedSupportOrganization()
  {
    return this.assignedSupportOrganization;
  }
  
  public void setAssignedSupportOrganization(String assignedSupportOrganization)
  {
    this.assignedSupportOrganization = assignedSupportOrganization;
  }
  
  public int hashCode()
  {
    int prime = 31;
    int result = 1;
    result = 31 * result + (this.action == null ? 0 : this.action.hashCode());
    result = 31 * result + (this.assignedGroup == null ? 0 : this.assignedGroup.hashCode());
    result = 31 * result + (this.assignedSupportCompany == null ? 0 : this.assignedSupportCompany.hashCode());
    result = 31 * result + (this.assignedSupportOrganization == null ? 0 : this.assignedSupportOrganization.hashCode());
    result = 31 * result + (this.checkbox == null ? 0 : this.checkbox.hashCode());
    result = 31 * result + (this.configurationId == null ? 0 : this.configurationId.hashCode());
    result = 31 * result + (this.createRequest == null ? 0 : this.createRequest.hashCode());
    result = 31 * result + (this.dashboard == null ? 0 : this.dashboard.hashCode());
    result = 31 * result + (this.descrizione == null ? 0 : this.descrizione.hashCode());
    result = 31 * result + (this.firstName == null ? 0 : this.firstName.hashCode());
    result = 31 * result + (this.impact == null ? 0 : this.impact.hashCode());
    result = 31 * result + (this.lastName == null ? 0 : this.lastName.hashCode());
    result = 31 * result + (this.reportedSource == null ? 0 : this.reportedSource.hashCode());
    result = 31 * result + (this.serviceType == null ? 0 : this.serviceType.hashCode());
    result = 31 * result + (this.sorgenteSistema == null ? 0 : this.sorgenteSistema.hashCode());
    result = 31 * result + (this.status == null ? 0 : this.status.hashCode());
    result = 31 * result + (this.summary == null ? 0 : this.summary.hashCode());
    result = 31 * result + (this.tipoIncident == null ? 0 : this.tipoIncident.hashCode());
    result = 31 * result + (this.urgency == null ? 0 : this.urgency.hashCode());
    return result;
  }
  
  public boolean equals(Object obj)
  {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ConfigurationForTable other = (ConfigurationForTable)obj;
    if (this.action == null)
    {
      if (other.action != null) {
        return false;
      }
    }
    else if (!this.action.equals(other.action)) {
      return false;
    }
    if (this.assignedGroup == null)
    {
      if (other.assignedGroup != null) {
        return false;
      }
    }
    else if (!this.assignedGroup.equals(other.assignedGroup)) {
      return false;
    }
    if (this.assignedSupportCompany == null)
    {
      if (other.assignedSupportCompany != null) {
        return false;
      }
    }
    else if (!this.assignedSupportCompany.equals(other.assignedSupportCompany)) {
      return false;
    }
    if (this.assignedSupportOrganization == null)
    {
      if (other.assignedSupportOrganization != null) {
        return false;
      }
    }
    else if (!this.assignedSupportOrganization.equals(other.assignedSupportOrganization)) {
      return false;
    }
    if (this.checkbox == null)
    {
      if (other.checkbox != null) {
        return false;
      }
    }
    else if (!this.checkbox.equals(other.checkbox)) {
      return false;
    }
    if (this.configurationId == null)
    {
      if (other.configurationId != null) {
        return false;
      }
    }
    else if (!this.configurationId.equals(other.configurationId)) {
      return false;
    }
    if (this.createRequest == null)
    {
      if (other.createRequest != null) {
        return false;
      }
    }
    else if (!this.createRequest.equals(other.createRequest)) {
      return false;
    }
    if (this.dashboard == null)
    {
      if (other.dashboard != null) {
        return false;
      }
    }
    else if (!this.dashboard.equals(other.dashboard)) {
      return false;
    }
    if (this.descrizione == null)
    {
      if (other.descrizione != null) {
        return false;
      }
    }
    else if (!this.descrizione.equals(other.descrizione)) {
      return false;
    }
    if (this.firstName == null)
    {
      if (other.firstName != null) {
        return false;
      }
    }
    else if (!this.firstName.equals(other.firstName)) {
      return false;
    }
    if (this.impact == null)
    {
      if (other.impact != null) {
        return false;
      }
    }
    else if (!this.impact.equals(other.impact)) {
      return false;
    }
    if (this.lastName == null)
    {
      if (other.lastName != null) {
        return false;
      }
    }
    else if (!this.lastName.equals(other.lastName)) {
      return false;
    }
    if (this.reportedSource == null)
    {
      if (other.reportedSource != null) {
        return false;
      }
    }
    else if (!this.reportedSource.equals(other.reportedSource)) {
      return false;
    }
    if (this.serviceType == null)
    {
      if (other.serviceType != null) {
        return false;
      }
    }
    else if (!this.serviceType.equals(other.serviceType)) {
      return false;
    }
    if (this.sorgenteSistema == null)
    {
      if (other.sorgenteSistema != null) {
        return false;
      }
    }
    else if (!this.sorgenteSistema.equals(other.sorgenteSistema)) {
      return false;
    }
    if (this.status == null)
    {
      if (other.status != null) {
        return false;
      }
    }
    else if (!this.status.equals(other.status)) {
      return false;
    }
    if (this.summary == null)
    {
      if (other.summary != null) {
        return false;
      }
    }
    else if (!this.summary.equals(other.summary)) {
      return false;
    }
    if (this.tipoIncident == null)
    {
      if (other.tipoIncident != null) {
        return false;
      }
    }
    else if (!this.tipoIncident.equals(other.tipoIncident)) {
      return false;
    }
    if (this.urgency == null)
    {
      if (other.urgency != null) {
        return false;
      }
    }
    else if (!this.urgency.equals(other.urgency)) {
      return false;
    }
    return true;
  }
  
  public String toString()
  {
    return 
          "ConfigurationForTable [checkbox=" + this.checkbox + ", configurationId=" + this.configurationId + ", tipoIncident=" + this.tipoIncident + ", descrizione=" + this.descrizione + ", dashboard=" + this.dashboard + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", serviceType=" + this.serviceType + ", status=" + this.status + ", impact=" + this.impact + ", urgency=" + this.urgency + ", reportedSource=" + this.reportedSource + ", action=" + this.action + ", createRequest=" + this.createRequest + ", summary=" + this.summary + ", sorgenteSistema=" + this.sorgenteSistema + ", assignedGroup=" + this.assignedGroup + ", assignedSupportCompany=" + this.assignedSupportCompany + ", assignedSupportOrganization=" + this.assignedSupportOrganization + "]";
  }
}
