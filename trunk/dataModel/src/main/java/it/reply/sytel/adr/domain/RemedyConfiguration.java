package it.reply.sytel.adr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REMEDY_CONFIGURATION")
public class RemedyConfiguration implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5203748280377837015L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long remedyConfigurationId;
	@Column
	String username;
	@Column
	String password;
	
	@Column
	String url;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((remedyConfigurationId == null) ? 0 : remedyConfigurationId.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		RemedyConfiguration other = (RemedyConfiguration) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (remedyConfigurationId == null) {
			if (other.remedyConfigurationId != null)
				return false;
		} else if (!remedyConfigurationId.equals(other.remedyConfigurationId))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RemedyConfiguration [remedyConfigurationId=" + remedyConfigurationId + ", username=" + username
				+ ", password=" + password + ", url=" + url + "]";
	}
	
	
}
