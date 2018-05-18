package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class RemedyConfigurationForTable implements Serializable{
  
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6100465214129944028L;
	String checkbox = "";
  	Long remedyConfigurationId;
	String username;
	String password;
	String url;
	
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	public Long getRemedyConfigurationId() {
		return remedyConfigurationId;
	}
	public void setRemedyConfigurationId(Long remedyConfigurationId) {
		this.remedyConfigurationId = remedyConfigurationId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
