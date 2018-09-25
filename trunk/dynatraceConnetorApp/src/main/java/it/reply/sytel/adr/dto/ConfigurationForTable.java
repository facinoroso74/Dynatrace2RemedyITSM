package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class ConfigurationForTable
  implements Serializable
{
	
  private static final long serialVersionUID = 4530885422464761592L;
  String checkbox = "";
  Long   configurationId;
  String idEvento;
  String descrizione;
  String dashboard;
  String impact;
  String urgency;
  String sorgenteSistema;
  
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
  
  
  public String getSorgenteSistema()
  {
    return this.sorgenteSistema;
  }
  
  public void setSorgenteSistema(String sorgenteSistema)
  {
    this.sorgenteSistema = sorgenteSistema;
  }

public String getIdEvento() {
	return idEvento;
}

public void setIdEvento(String idEvento) {
	this.idEvento = idEvento;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((checkbox == null) ? 0 : checkbox.hashCode());
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
	ConfigurationForTable other = (ConfigurationForTable) obj;
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
	return "ConfigurationForTable [checkbox=" + checkbox + ", configurationId=" + configurationId + ", idEvento="
			+ idEvento + ", descrizione=" + descrizione + ", dashboard=" + dashboard + ", impact=" + impact
			+ ", urgency=" + urgency + ", sorgenteSistema=" + sorgenteSistema + "]";
}

	
}
