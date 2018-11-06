package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class SchedulatorConfiguration implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7857057597065413965L;
	private String name;
	private String patternSchedulator;
	private boolean started;
	private int retentionDays;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatternSchedulator() {
		return patternSchedulator;
	}
	public void setPatternSchedulator(String patternSchedulator) {
		this.patternSchedulator = patternSchedulator;
	}
	public boolean isStarted() {
		return started;
	}
	public void setStarted(boolean started) {
		this.started = started;
	}
	public int getRetentionDays() {
		return retentionDays;
	}
	public void setRetentionDays(int retentionDays) {
		this.retentionDays = retentionDays;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patternSchedulator == null) ? 0 : patternSchedulator.hashCode());
		result = prime * result + retentionDays;
		result = prime * result + (started ? 1231 : 1237);
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patternSchedulator == null) {
			if (other.patternSchedulator != null)
				return false;
		} else if (!patternSchedulator.equals(other.patternSchedulator))
			return false;
		if (retentionDays != other.retentionDays)
			return false;
		if (started != other.started)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SchedulatorConfiguration [name=" + name + ", patternSchedulator=" + patternSchedulator + ", started="
				+ started + ", retentionDays=" + retentionDays + "]";
	}
	
}
