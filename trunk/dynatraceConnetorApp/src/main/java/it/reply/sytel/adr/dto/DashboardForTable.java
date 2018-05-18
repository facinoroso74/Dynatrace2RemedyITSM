package it.reply.sytel.adr.dto;

import java.io.Serializable;

public class DashboardForTable implements Serializable{
  
  	/**
	 * 
	 */
	private static final long serialVersionUID = 2877167415518580193L;
	
	String checkbox = "";
  	Long dashboardId;
	String name;
	String description;
	String appUrl;
	String appUser;
	String appPwd;
	
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	public Long getDashboardId() {
		return dashboardId;
	}
	public void setDashboardId(Long dashboardId) {
		this.dashboardId = dashboardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAppUrl() {
		return appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	public String getAppUser() {
		return appUser;
	}
	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}
	public String getAppPwd() {
		return appPwd;
	}
	public void setAppPwd(String appPwd) {
		this.appPwd = appPwd;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appPwd == null) ? 0 : appPwd.hashCode());
		result = prime * result + ((appUrl == null) ? 0 : appUrl.hashCode());
		result = prime * result + ((appUser == null) ? 0 : appUser.hashCode());
		result = prime * result + ((checkbox == null) ? 0 : checkbox.hashCode());
		result = prime * result + ((dashboardId == null) ? 0 : dashboardId.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		DashboardForTable other = (DashboardForTable) obj;
		if (appPwd == null) {
			if (other.appPwd != null)
				return false;
		} else if (!appPwd.equals(other.appPwd))
			return false;
		if (appUrl == null) {
			if (other.appUrl != null)
				return false;
		} else if (!appUrl.equals(other.appUrl))
			return false;
		if (appUser == null) {
			if (other.appUser != null)
				return false;
		} else if (!appUser.equals(other.appUser))
			return false;
		if (checkbox == null) {
			if (other.checkbox != null)
				return false;
		} else if (!checkbox.equals(other.checkbox))
			return false;
		if (dashboardId == null) {
			if (other.dashboardId != null)
				return false;
		} else if (!dashboardId.equals(other.dashboardId))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DashboardForTable [checkbox=" + checkbox + ", dashboardId=" + dashboardId + ", name=" + name
				+ ", description=" + description + ", appUrl=" + appUrl + ", appUser=" + appUser + ", appPwd=" + appPwd
				+ "]";
	}
	
	
}
