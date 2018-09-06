package it.reply.sytel.adr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEDULATOR_CONFIGURATION")
public class SchedulatorConfiguration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5724804922359556209L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long schedulatorConfigurationId;
	@Column
	String name;
	@Column
	String crontime;
	@Column
	String status;
	
	public Long getSchedulatorConfigurationId() {
		return schedulatorConfigurationId;
	}
	public void setSchedulatorConfigurationId(Long schedulatorConfigurationId) {
		this.schedulatorConfigurationId = schedulatorConfigurationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCrontime() {
		return crontime;
	}
	public void setCrontime(String crontime) {
		this.crontime = crontime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crontime == null) ? 0 : crontime.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schedulatorConfigurationId == null) ? 0 : schedulatorConfigurationId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		SchedulatorConfiguration other = (SchedulatorConfiguration) obj;
		if (crontime == null) {
			if (other.crontime != null)
				return false;
		} else if (!crontime.equals(other.crontime))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schedulatorConfigurationId == null) {
			if (other.schedulatorConfigurationId != null)
				return false;
		} else if (!schedulatorConfigurationId.equals(other.schedulatorConfigurationId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SchedulatorConfiguration [schedulatorConfigurationId=" + schedulatorConfigurationId + ", name=" + name
				+ ", crontime=" + crontime + ", status=" + status + "]";
	}
	
	
}
