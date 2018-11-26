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

	@Column
	String summary;
	
	@Column
	String categorizationTier1;
	@Column
	String categorizationTier2;
	@Column
	String categorizationTier3;
	
	@Column
	String hpdci;
	
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

	public String getCategorizationTier1() {
		return categorizationTier1;
	}

	public void setCategorizationTier1(String categorizationTier1) {
		this.categorizationTier1 = categorizationTier1;
	}

	public String getCategorizationTier2() {
		return categorizationTier2;
	}

	public void setCategorizationTier2(String categorizationTier2) {
		this.categorizationTier2 = categorizationTier2;
	}

	public String getCategorizationTier3() {
		return categorizationTier3;
	}

	public void setCategorizationTier3(String categorizationTier3) {
		this.categorizationTier3 = categorizationTier3;
	}

		
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getHpdci() {
		return hpdci;
	}

	public void setHpdci(String hpdc) {
		this.hpdci = hpdc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorizationTier1 == null) ? 0 : categorizationTier1.hashCode());
		result = prime * result + ((categorizationTier2 == null) ? 0 : categorizationTier2.hashCode());
		result = prime * result + ((categorizationTier3 == null) ? 0 : categorizationTier3.hashCode());
		result = prime * result + ((configurationId == null) ? 0 : configurationId.hashCode());
		result = prime * result + ((dashboard == null) ? 0 : dashboard.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((hpdci == null) ? 0 : hpdci.hashCode());
		result = prime * result + ((idEvento == null) ? 0 : idEvento.hashCode());
		result = prime * result + ((impact == null) ? 0 : impact.hashCode());
		result = prime * result + ((sorgenteSistema == null) ? 0 : sorgenteSistema.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
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
		if (categorizationTier1 == null) {
			if (other.categorizationTier1 != null)
				return false;
		} else if (!categorizationTier1.equals(other.categorizationTier1))
			return false;
		if (categorizationTier2 == null) {
			if (other.categorizationTier2 != null)
				return false;
		} else if (!categorizationTier2.equals(other.categorizationTier2))
			return false;
		if (categorizationTier3 == null) {
			if (other.categorizationTier3 != null)
				return false;
		} else if (!categorizationTier3.equals(other.categorizationTier3))
			return false;
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
		if (hpdci == null) {
			if (other.hpdci != null)
				return false;
		} else if (!hpdci.equals(other.hpdci))
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
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
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
				+ ", sorgenteSistema=" + sorgenteSistema + ", summary=" + summary + ", categorizationTier1="
				+ categorizationTier1 + ", categorizationTier2=" + categorizationTier2 + ", categorizationTier3="
				+ categorizationTier3 + ", hpdc=" + hpdci + "]";
	}

}
