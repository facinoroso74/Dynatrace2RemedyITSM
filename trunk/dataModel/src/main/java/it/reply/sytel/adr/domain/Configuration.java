package it.reply.sytel.adr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIGURATION")
public class Configuration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5886381252212107730L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long configurationId;
	
	@Column
	String idEvento;
	@Column
	String descrizione;
	@Column
	String dashboard;
	
	@Column
	String impact;
	@Column
	String urgency;
	
	@Column
	String sorgenteSistema;

	public Long getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Long configurationId) {
		this.configurationId = configurationId;
	}

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
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

	public String getSorgenteSistema() {
		return sorgenteSistema;
	}

	public void setSorgenteSistema(String sorgenteSistema) {
		this.sorgenteSistema = sorgenteSistema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((configurationId == null) ? 0 : configurationId.hashCode());
		result = prime * result + ((dashboard == null) ? 0 : dashboard.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((idEvento == null) ? 0 : idEvento.hashCode());
		result = prime * result + ((impact == null) ? 0 : impact.hashCode());
		result = prime * result + ((sorgenteSistema == null) ? 0 : sorgenteSistema.hashCode());
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
		Configuration other = (Configuration) obj;
		if (configurationId == null) {
			if (other.configurationId != null)
				return false;
		} else if (!configurationId.equals(other.configurationId))
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
		if (idEvento == null) {
			if (other.idEvento != null)
				return false;
		} else if (!idEvento.equals(other.idEvento))
			return false;
		if (impact == null) {
			if (other.impact != null)
				return false;
		} else if (!impact.equals(other.impact))
			return false;
		if (sorgenteSistema == null) {
			if (other.sorgenteSistema != null)
				return false;
		} else if (!sorgenteSistema.equals(other.sorgenteSistema))
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
		return "Configuration [configurationId=" + configurationId + ", idEvento=" + idEvento + ", descrizione="
				+ descrizione + ", dashboard=" + dashboard + ", impact=" + impact + ", urgency=" + urgency
				+ ", sorgenteSistema=" + sorgenteSistema + "]";
	}
	
	
	
	
	
}
