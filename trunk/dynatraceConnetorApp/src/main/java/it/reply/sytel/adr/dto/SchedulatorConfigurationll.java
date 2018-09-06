package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class SchedulatorConfigurationll implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7857057597065413965L;
	private String name;
	private String patternSchedulator;
	private boolean started;
	
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
	
}
