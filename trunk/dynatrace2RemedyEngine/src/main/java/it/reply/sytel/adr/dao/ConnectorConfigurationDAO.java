package it.reply.sytel.adr.dao;

import java.util.List;

import it.reply.sytel.adr.domain.Dashboard;

public interface ConnectorConfigurationDAO {

	public List<Dashboard> getDashboardConfigurations();
	
}
