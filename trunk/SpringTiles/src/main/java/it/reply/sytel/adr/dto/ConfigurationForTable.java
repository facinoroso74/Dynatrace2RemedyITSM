package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class ConfigurationForTable implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4530885422464761592L;

	String checkbox="";
	
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

	public String getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}

	public Long getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Long configurationId) {
		this.configurationId = configurationId;
	}

	public String getTipoIncident() {
		return tipoIncident;
	}

	public void setTipoIncident(String tipoIncident) {
		this.tipoIncident = tipoIncident;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDashboard() {
		return dashboard;
	}

	public void setDashboard(String dashboard) {
		this.dashboard = dashboard;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public String getReportedSource() {
		return reportedSource;
	}

	public void setReportedSource(String reportedSource) {
		this.reportedSource = reportedSource;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCreateRequest() {
		return createRequest;
	}

	public void setCreateRequest(String createRequest) {
		this.createRequest = createRequest;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSorgenteSistema() {
		return sorgenteSistema;
	}

	public void setSorgenteSistema(String sorgenteSistema) {
		this.sorgenteSistema = sorgenteSistema;
	}

	public String getAssignedGroup() {
		return assignedGroup;
	}

	public void setAssignedGroup(String assignedGroup) {
		this.assignedGroup = assignedGroup;
	}

	public String getAssignedSupportCompany() {
		return assignedSupportCompany;
	}

	public void setAssignedSupportCompany(String assignedSupportCompany) {
		this.assignedSupportCompany = assignedSupportCompany;
	}

	public String getAssignedSupportOrganization() {
		return assignedSupportOrganization;
	}

	public void setAssignedSupportOrganization(String assignedSupportOrganization) {
		this.assignedSupportOrganization = assignedSupportOrganization;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((assignedGroup == null) ? 0 : assignedGroup.hashCode());
		result = prime * result + ((assignedSupportCompany == null) ? 0 : assignedSupportCompany.hashCode());
		result = prime * result + ((assignedSupportOrganization == null) ? 0 : assignedSupportOrganization.hashCode());
		result = prime * result + ((checkbox == null) ? 0 : checkbox.hashCode());
		result = prime * result + ((configurationId == null) ? 0 : configurationId.hashCode());
		result = prime * result + ((createRequest == null) ? 0 : createRequest.hashCode());
		result = prime * result + ((dashboard == null) ? 0 : dashboard.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((impact == null) ? 0 : impact.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((reportedSource == null) ? 0 : reportedSource.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
		result = prime * result + ((sorgenteSistema == null) ? 0 : sorgenteSistema.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result + ((tipoIncident == null) ? 0 : tipoIncident.hashCode());
		result = prime * result + ((urgency == null) ? 0 : urgency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfigurationForTable other = (ConfigurationForTable) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (assignedGroup == null) {
			if (other.assignedGroup != null)
				return false;
		} else if (!assignedGroup.equals(other.assignedGroup))
			return false;
		if (assignedSupportCompany == null) {
			if (other.assignedSupportCompany != null)
				return false;
		} else if (!assignedSupportCompany.equals(other.assignedSupportCompany))
			return false;
		if (assignedSupportOrganization == null) {
			if (other.assignedSupportOrganization != null)
				return false;
		} else if (!assignedSupportOrganization.equals(other.assignedSupportOrganization))
			return false;
		if (checkbox == null) {
			if (other.checkbox != null)
				return false;
		} else if (!checkbox.equals(other.checkbox))
			return false;
		if (configurationId == null) {
			if (other.configurationId != null)
				return false;
		} else if (!configurationId.equals(other.configurationId))
			return false;
		if (createRequest == null) {
			if (other.createRequest != null)
				return false;
		} else if (!createRequest.equals(other.createRequest))
			return false;
		if (dashboard == null) {
			if (other.dashboard != null)
				return false;
		} else if (!dashboard.equals(other.dashboard))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (impact == null) {
			if (other.impact != null)
				return false;
		} else if (!impact.equals(other.impact))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (reportedSource == null) {
			if (other.reportedSource != null)
				return false;
		} else if (!reportedSource.equals(other.reportedSource))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
			return false;
		if (sorgenteSistema == null) {
			if (other.sorgenteSistema != null)
				return false;
		} else if (!sorgenteSistema.equals(other.sorgenteSistema))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		if (tipoIncident == null) {
			if (other.tipoIncident != null)
				return false;
		} else if (!tipoIncident.equals(other.tipoIncident))
			return false;
		if (urgency == null) {
			if (other.urgency != null)
				return false;
		} else if (!urgency.equals(other.urgency))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConfigurationForTable [checkbox=" + checkbox + ", configurationId=" + configurationId
				+ ", tipoIncident=" + tipoIncident + ", descrizione=" + descrizione + ", dashboard=" + dashboard
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", serviceType=" + serviceType + ", status="
				+ status + ", impact=" + impact + ", urgency=" + urgency + ", reportedSource=" + reportedSource
				+ ", action=" + action + ", createRequest=" + createRequest + ", summary=" + summary
				+ ", sorgenteSistema=" + sorgenteSistema + ", assignedGroup=" + assignedGroup
				+ ", assignedSupportCompany=" + assignedSupportCompany + ", assignedSupportOrganization="
				+ assignedSupportOrganization + "]";
	}
	
}