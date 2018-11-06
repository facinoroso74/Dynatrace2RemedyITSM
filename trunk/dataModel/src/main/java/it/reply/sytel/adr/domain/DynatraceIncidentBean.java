package it.reply.sytel.adr.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INCIDENT")
public class DynatraceIncidentBean implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 655245841062153020L;

//	ID                     INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
//	name                   VARCHAR(250),
//	heatfield              VARCHAR(250),
//	state                  VARCHAR(250),
//	startEvent             TIMESTAMP,
//	duration               VARCHAR(250),
//	endEvent               TIMESTAMP,
//	source                 VARCHAR(250),
//	session                VARCHAR(250),
//	confirmed_by           VARCHAR(250),
//	confirmation           VARCHAR(250),
//	sensitivity            VARCHAR(250),
//	conditions             VARCHAR(250),
//	thresholds             VARCHAR(250),
//	actions                VARCHAR(250),
//	measures               VARCHAR(250),
//	dataIns                TIMESTAMP,
//	dataUpdate             TIMESTAMP,
//	remedyTicketID         VARCHAR(250),
//	remedyTicketIDStatus   VARCHAR(250),
//	remedyTicketIDStatus   TIMESTAMP,	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column
	private String name;
	
	@Column
	private String incidentType;
	
	
	@Column
	private String heatfield;
	
	@Column
	private String state;

	@Column
	private Timestamp startevent;
		
	@Column
	private String duration;
	
	@Column
	private Timestamp endevent;
	
	@Column
	private String source;
	
	@Column
	private String session;
	
	@Column
	private String confirmedBy;
	
	@Column
	private String confirmation;
	
	@Column
	private String sensitivity;
	
	@Column
	private String conditions;
	
	@Column
	private String thresholds;
	
	@Column
	private String actions;
	
	@Column
	private String measures;
	
	@Column
	private Timestamp datains;
	
	@Column
	private Timestamp dataupdate;
	
	@Column
	private String remedyticketid;
	
	@Column
	private String remedyticketidstatus;
	
	@Column
	private Timestamp remedyticketcreatedate;
	
	@Column
	private String dashboardname;

	@Column
	private String remedyresponse;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getConfirmedBy() {
		return confirmedBy;
	}

	public void setConfirmedBy(String confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public String getDashboardname() {
		return dashboardname;
	}

	public void setDashboardname(String dashboardname) {
		this.dashboardname = dashboardname;
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

	public Timestamp getStartevent() {
		return startevent;
	}

	public void setStartevent(Timestamp startevent) {
		this.startevent = startevent;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	
	public Timestamp getEndevent() {
		return endevent;
	}

	public void setEndevent(Timestamp endevent) {
		this.endevent = endevent;
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

	public Timestamp getDatains() {
		return datains;
	}

	public void setDatains(Timestamp datains) {
		this.datains = datains;
	}

	public Timestamp getDataupdate() {
		return dataupdate;
	}

	public void setDataupdate(Timestamp dataupdate) {
		this.dataupdate = dataupdate;
	}

	public String getRemedyticketid() {
		return remedyticketid;
	}

	public void setRemedyticketid(String remedyticketid) {
		this.remedyticketid = remedyticketid;
	}

	public String getRemedyticketidstatus() {
		return remedyticketidstatus;
	}

	public void setRemedyticketidstatus(String remedyticketidstatus) {
		this.remedyticketidstatus = remedyticketidstatus;
	}

	public Timestamp getRemedyticketcreatedate() {
		return remedyticketcreatedate;
	}

	public void setRemedyticketcreatedate(Timestamp remedyticketcreatedate) {
		this.remedyticketcreatedate = remedyticketcreatedate;
	}

	public String getRemedyresponse() {
		return remedyresponse;
	}

	public void setRemedyresponse(String remedyresponse) {
		this.remedyresponse = remedyresponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		result = prime * result + ((conditions == null) ? 0 : conditions.hashCode());
		result = prime * result + ((confirmation == null) ? 0 : confirmation.hashCode());
		result = prime * result + ((confirmedBy == null) ? 0 : confirmedBy.hashCode());
		result = prime * result + ((dashboardname == null) ? 0 : dashboardname.hashCode());
		result = prime * result + ((datains == null) ? 0 : datains.hashCode());
		result = prime * result + ((dataupdate == null) ? 0 : dataupdate.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((endevent == null) ? 0 : endevent.hashCode());
		result = prime * result + ((heatfield == null) ? 0 : heatfield.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((incidentType == null) ? 0 : incidentType.hashCode());
		result = prime * result + ((measures == null) ? 0 : measures.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((remedyresponse == null) ? 0 : remedyresponse.hashCode());
		result = prime * result + ((remedyticketcreatedate == null) ? 0 : remedyticketcreatedate.hashCode());
		result = prime * result + ((remedyticketid == null) ? 0 : remedyticketid.hashCode());
		result = prime * result + ((remedyticketidstatus == null) ? 0 : remedyticketidstatus.hashCode());
		result = prime * result + ((sensitivity == null) ? 0 : sensitivity.hashCode());
		result = prime * result + ((session == null) ? 0 : session.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((startevent == null) ? 0 : startevent.hashCode());
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
		DynatraceIncidentBean other = (DynatraceIncidentBean) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		if (conditions == null) {
			if (other.conditions != null)
				return false;
		} else if (!conditions.equals(other.conditions))
			return false;
		if (confirmation == null) {
			if (other.confirmation != null)
				return false;
		} else if (!confirmation.equals(other.confirmation))
			return false;
		if (confirmedBy == null) {
			if (other.confirmedBy != null)
				return false;
		} else if (!confirmedBy.equals(other.confirmedBy))
			return false;
		if (dashboardname == null) {
			if (other.dashboardname != null)
				return false;
		} else if (!dashboardname.equals(other.dashboardname))
			return false;
		if (datains == null) {
			if (other.datains != null)
				return false;
		} else if (!datains.equals(other.datains))
			return false;
		if (dataupdate == null) {
			if (other.dataupdate != null)
				return false;
		} else if (!dataupdate.equals(other.dataupdate))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (endevent == null) {
			if (other.endevent != null)
				return false;
		} else if (!endevent.equals(other.endevent))
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
		if (remedyticketcreatedate == null) {
			if (other.remedyticketcreatedate != null)
				return false;
		} else if (!remedyticketcreatedate.equals(other.remedyticketcreatedate))
			return false;
		if (remedyticketid == null) {
			if (other.remedyticketid != null)
				return false;
		} else if (!remedyticketid.equals(other.remedyticketid))
			return false;
		if (remedyticketidstatus == null) {
			if (other.remedyticketidstatus != null)
				return false;
		} else if (!remedyticketidstatus.equals(other.remedyticketidstatus))
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
		if (startevent == null) {
			if (other.startevent != null)
				return false;
		} else if (!startevent.equals(other.startevent))
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
		return "DynatraceIncidentBean [id=" + id + ", name=" + name + ", incidentType=" + incidentType + ", heatfield="
				+ heatfield + ", state=" + state + ", startevent=" + startevent + ", duration=" + duration
				+ ", endevent=" + endevent + ", source=" + source + ", session=" + session + ", confirmedBy="
				+ confirmedBy + ", confirmation=" + confirmation + ", sensitivity=" + sensitivity + ", conditions="
				+ conditions + ", thresholds=" + thresholds + ", actions=" + actions + ", measures=" + measures
				+ ", datains=" + datains + ", dataupdate=" + dataupdate + ", remedyticketid=" + remedyticketid
				+ ", remedyticketidstatus=" + remedyticketidstatus + ", remedyticketcreatedate="
				+ remedyticketcreatedate + ", dashboardname=" + dashboardname + ", remedyresponse=" + remedyresponse
				+ "]";
	}

	


}
