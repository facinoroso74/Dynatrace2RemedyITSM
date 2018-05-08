package it.reply.sytel.adr.web.dto;

import java.io.Serializable;

import it.reply.sytel.adr.domain.Configuration;

public class ConfigurationTableResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4677171240244035133L;
	private int counter;
	private Iterable<Configuration> data;
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public Iterable<Configuration> getData() {
		return data;
	}
	public void setData(Iterable<Configuration> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ConfigurationTableResponse [counter=" + counter + ", data=" + data + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		ConfigurationTableResponse other = (ConfigurationTableResponse) obj;
		if (counter != other.counter)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	public ConfigurationTableResponse(int counter, Iterable<Configuration> data) {
		super();
		this.counter = counter;
		this.data = data;
	}
	
	
	
}
