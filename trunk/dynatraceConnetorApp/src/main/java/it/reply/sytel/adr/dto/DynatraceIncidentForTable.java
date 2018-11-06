package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class DynatraceIncidentForTable implements Serializable{
  
  	/**
	 * 
	 */
	private static final long serialVersionUID = 2877167415518580193L;
	
	String checkbox = "";
	Long id;
	private String name;
	private String incidentType;
	private String heatfield;
	
	private String state;

	private String startEvent;
	
	private String duration;
	
	private String endEvent;
	
	private String source;
	
	private String session;
	
	private String confimedBy;
	
	private String confirmation;
	
	private String sensitivity;
	
	private String conditions;
	
	private String thresholds;
	
	private String actions;
	
	private String measures;
	
	private String dataIns;
	
	private String dataUpdate;
	
	private String remedyTicketID;
	
	private String remedyTicketIDStatus;
	
	private String remedyTicketCreateDate;
	
	private String dashboardName;

	private String remedyresponse;
	
	public String getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIncidentType() {
		return incidentType;
	}

	public void setIncidentType(String incidentType) {
		this.incidentType = incidentType;
	}

	
	public String getHeatfield() {
		return heatfield;
	}

	public void setHeatfield(String heatfield) {
		this.heatfield = heatfield;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public String getStartEvent() {
		return startEvent;
	}

	public void setStartEvent(String startEvent) {
		this.startEvent = startEvent;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getConfimedBy() {
		return confimedBy;
	}

	public void setConfimedBy(String confimedBy) {
		this.confimedBy = confimedBy;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(String sensitivity) {
		this.sensitivity = sensitivity;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getThresholds() {
		return thresholds;
	}

	public void setThresholds(String thresholds) {
		this.thresholds = thresholds;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public String getMeasures() {
		return measures;
	}

	public void setMeasures(String measures) {
		this.measures = measures;
	}

	
	public String getRemedyTicketID() {
		return remedyTicketID;
	}

	public void setRemedyTicketID(String remedyTicketID) {
		this.remedyTicketID = remedyTicketID;
	}

	public String getRemedyTicketIDStatus() {
		return remedyTicketIDStatus;
	}

	public void setRemedyTicketIDStatus(String remedyTicketIDStatus) {
		this.remedyTicketIDStatus = remedyTicketIDStatus;
	}

	

	public String getEndEvent() {
		return endEvent;
	}

	public void setEndEvent(String endEvent) {
		this.endEvent = endEvent;
	}

	public String getDataIns() {
		return dataIns;
	}

	public void setDataIns(String dataIns) {
		this.dataIns = dataIns;
	}

	public String getDataUpdate() {
		return dataUpdate;
	}

	public void setDataUpdate(String dataUpdate) {
		this.dataUpdate = dataUpdate;
	}

	public String getRemedyTicketCreateDate() {
		return remedyTicketCreateDate;
	}

	public void setRemedyTicketCreateDate(String remedyTicketCreateDate) {
		this.remedyTicketCreateDate = remedyTicketCreateDate;
	}

	public String getDashboardName() {
		return dashboardName;
	}

	public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}

	public String getRemedyresponse() {
		return remedyresponse;
	}

	public void setRemedyresponse(String remedyResponse) {
		this.remedyresponse = remedyResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		result = prime * result + ((checkbox == null) ? 0 : checkbox.hashCode());
		result = prime * result + ((conditions == null) ? 0 : conditions.hashCode());
		result = prime * result + ((confimedBy == null) ? 0 : confimedBy.hashCode());
		result = prime * result + ((confirmation == null) ? 0 : confirmation.hashCode());
		result = prime * result + ((dashboardName == null) ? 0 : dashboardName.hashCode());
		result = prime * result + ((dataIns == null) ? 0 : dataIns.hashCode());
		result = prime * result + ((dataUpdate == null) ? 0 : dataUpdate.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((endEvent == null) ? 0 : endEvent.hashCode());
		result = prime * result + ((heatfield == null) ? 0 : heatfield.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((incidentType == null) ? 0 : incidentType.hashCode());
		result = prime * result + ((measures == null) ? 0 : measures.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((remedyresponse == null) ? 0 : remedyresponse.hashCode());
		result = prime * result + ((remedyTicketCreateDate == null) ? 0 : remedyTicketCreateDate.hashCode());
		result = prime * result + ((remedyTicketID == null) ? 0 : remedyTicketID.hashCode());
		result = prime * result + ((remedyTicketIDStatus == null) ? 0 : remedyTicketIDStatus.hashCode());
		result = prime * result + ((sensitivity == null) ? 0 : sensitivity.hashCode());
		result = prime * result + ((session == null) ? 0 : session.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((startEvent == null) ? 0 : startEvent.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((thresholds == null) ? 0 : thresholds.hashCode());
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
		DynatraceIncidentForTable other = (DynatraceIncidentForTable) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		if (checkbox == null) {
			if (other.checkbox != null)
				return false;
		} else if (!checkbox.equals(other.checkbox))
			return false;
		if (conditions == null) {
			if (other.conditions != null)
				return false;
		} else if (!conditions.equals(other.conditions))
			return false;
		if (confimedBy == null) {
			if (other.confimedBy != null)
				return false;
		} else if (!confimedBy.equals(other.confimedBy))
			return false;
		if (confirmation == null) {
			if (other.confirmation != null)
				return false;
		} else if (!confirmation.equals(other.confirmation))
			return false;
		if (dashboardName == null) {
			if (other.dashboardName != null)
				return false;
		} else if (!dashboardName.equals(other.dashboardName))
			return false;
		if (dataIns == null) {
			if (other.dataIns != null)
				return false;
		} else if (!dataIns.equals(other.dataIns))
			return false;
		if (dataUpdate == null) {
			if (other.dataUpdate != null)
				return false;
		} else if (!dataUpdate.equals(other.dataUpdate))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (endEvent == null) {
			if (other.endEvent != null)
				return false;
		} else if (!endEvent.equals(other.endEvent))
			return false;
		if (heatfield == null) {
			if (other.heatfield != null)
				return false;
		} else if (!heatfield.equals(other.heatfield))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (incidentType == null) {
			if (other.incidentType != null)
				return false;
		} else if (!incidentType.equals(other.incidentType))
			return false;
		if (measures == null) {
			if (other.measures != null)
				return false;
		} else if (!measures.equals(other.measures))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (remedyresponse == null) {
			if (other.remedyresponse != null)
				return false;
		} else if (!remedyresponse.equals(other.remedyresponse))
			return false;
		if (remedyTicketCreateDate == null) {
			if (other.remedyTicketCreateDate != null)
				return false;
		} else if (!remedyTicketCreateDate.equals(other.remedyTicketCreateDate))
			return false;
		if (remedyTicketID == null) {
			if (other.remedyTicketID != null)
				return false;
		} else if (!remedyTicketID.equals(other.remedyTicketID))
			return false;
		if (remedyTicketIDStatus == null) {
			if (other.remedyTicketIDStatus != null)
				return false;
		} else if (!remedyTicketIDStatus.equals(other.remedyTicketIDStatus))
			return false;
		if (sensitivity == null) {
			if (other.sensitivity != null)
				return false;
		} else if (!sensitivity.equals(other.sensitivity))
			return false;
		if (session == null) {
			if (other.session != null)
				return false;
		} else if (!session.equals(other.session))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (startEvent == null) {
			if (other.startEvent != null)
				return false;
		} else if (!startEvent.equals(other.startEvent))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (thresholds == null) {
			if (other.thresholds != null)
				return false;
		} else if (!thresholds.equals(other.thresholds))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DynatraceIncidentForTable [checkbox=" + checkbox + ", id=" + id + ", name=" + name + ", incidentType="
				+ incidentType + ", heatfield=" + heatfield + ", state=" + state + ", startEvent=" + startEvent
				+ ", duration=" + duration + ", endEvent=" + endEvent + ", source=" + source + ", session=" + session
				+ ", confimedBy=" + confimedBy + ", confirmation=" + confirmation + ", sensitivity=" + sensitivity
				+ ", conditions=" + conditions + ", thresholds=" + thresholds + ", actions=" + actions + ", measures="
				+ measures + ", dataIns=" + dataIns + ", dataUpdate=" + dataUpdate + ", remedyTicketID="
				+ remedyTicketID + ", remedyTicketIDStatus=" + remedyTicketIDStatus + ", remedyTicketCreateDate="
				+ remedyTicketCreateDate + ", dashboardName=" + dashboardName + ", remedyResponse=" + remedyresponse
				+ "]";
	}

}
