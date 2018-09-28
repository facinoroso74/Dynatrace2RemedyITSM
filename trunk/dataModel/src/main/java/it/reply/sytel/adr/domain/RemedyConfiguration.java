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
	String status;
	
	@Column
	String service_type;
	
	@Column
	String reported_source;
	
	@Column
	String first_name;
	
	@Column
	String last_name;
	
	@Column
	String action;
	
	@Column
	String create_request;
	 
	@Column
	String sede_int;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getReported_source() {
		return reported_source;
	}

	public void setReported_source(String reported_source) {
		this.reported_source = reported_source;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCreate_request() {
		return create_request;
	}

	public void setCreate_request(String create_request) {
		this.create_request = create_request;
	}

	public String getSede_int() {
		return sede_int;
	}

	public void setSede_int(String sede_int) {
		this.sede_int = sede_int;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((create_request == null) ? 0 : create_request.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((remedyConfigurationId == null) ? 0 : remedyConfigurationId.hashCode());
		result = prime * result + ((reported_source == null) ? 0 : reported_source.hashCode());
		result = prime * result + ((sede_int == null) ? 0 : sede_int.hashCode());
		result = prime * result + ((service_type == null) ? 0 : service_type.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (create_request == null) {
			if (other.create_request != null)
				return false;
		} else if (!create_request.equals(other.create_request))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
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
		if (reported_source == null) {
			if (other.reported_source != null)
				return false;
		} else if (!reported_source.equals(other.reported_source))
			return false;
		if (sede_int == null) {
			if (other.sede_int != null)
				return false;
		} else if (!sede_int.equals(other.sede_int))
			return false;
		if (service_type == null) {
			if (other.service_type != null)
				return false;
		} else if (!service_type.equals(other.service_type))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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
				+ ", password=" + password + ", status=" + status + ", service_type=" + service_type
				+ ", reported_source=" + reported_source + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", action=" + action + ", create_request=" + create_request + ", sede_int=" + sede_int + "]";
	}

}
