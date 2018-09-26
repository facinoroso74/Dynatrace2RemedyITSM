/*
 * Copyright (c) 2005 Sytel/Reply - All right reserved
 *
 * Created on dd-mmm-yyyy
 *
 * $Date: 2010/07/26 09:06:39 $
 * $Header: /usr/Repositories/Reply/XAWES/Java/Engine/Core/Deliver/src/java/it/reply/sytel/xawes/deliver/dao/configuration/impl/ConfigServicesFile.java,v 1.7 2010/07/26 09:06:39 m.pantaleone Exp $
 * $Id: ConfigServicesFile.java,v 1.7 2010/07/26 09:06:39 m.pantaleone Exp $
 * $Name:  $
 * $Locker:  $
 * $Revision: 1.7 $
 * $State: Exp $
 */
package it.reply.sytel.adr.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.dao.configuration.ConfigurationService;
import it.reply.sytel.adr.core.dao.exception.ConfigurationException;
import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.repositories.ConfigurationRepository;
import it.reply.sytel.adr.repositories.DashboardRepository;
import it.reply.sytel.adr.repositories.RemedyConfigurationRepository;

/**
 * @author MPantaleone
 *
 * carico il file di configurazione config.xml
 * e setto la HashMap
 */
public class ConfigServicesDB implements ConfigurationService {
	
	private Logger log = LogManager.getLogger(getClass());
	
    @Autowired
    private DashboardRepository dashboardRepository;
    
//    @Autowired
//    private ConfigurationRepository configurationRepository; 
    
    @Autowired
    private RemedyConfigurationRepository remedyConfigurationRepository; 
    
	private Map<String,Object> map;


//	private void buildMapIncidentConfigurationBySorgenteSistema() {
//		
//		//Iterable<Configuration> incidentConfigurationList = configurationRepository.findAll();
//		HashMap< String, List<Configuration>> mapIncidentConfiguration = new HashMap<String,List<Configuration>>();
//		
//		for (Configuration incidentConfiguration : incidentConfigurationList) {
//
//			if (mapIncidentConfiguration.get(incidentConfiguration.getSorgenteSistema()) == null ) {
//				
//				List<Configuration> incidentConfigurationBySorgenteSistemaList = new ArrayList<Configuration>();
//				incidentConfigurationBySorgenteSistemaList.add(incidentConfiguration);
//				mapIncidentConfiguration.put(incidentConfiguration.getSorgenteSistema(), incidentConfigurationBySorgenteSistemaList);
//				
//			}else {
//				List<Configuration> incidentConfigurationBySorgenteSistemaList  = mapIncidentConfiguration.get(incidentConfiguration.getSorgenteSistema());
//				incidentConfigurationBySorgenteSistemaList.add(incidentConfiguration);
//			}
//			
//		}
//		
//		log.info("---------Configuration begin----------");
//		Set<String> keys = mapIncidentConfiguration.keySet();
//		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
//			String key = (String) iterator.next();
//			log.info(mapIncidentConfiguration.get(key));
//		}
//		log.info("---------Configuration end------------");
//		
//		map.put(ADRConstants.INCIDENT_CONFIGURATION_CONFIG_MAP, mapIncidentConfiguration);
//		
//	}
	
    public void init() {
    	
    	log.info("connecting to DB for getting the configuration...");
    	
    	map = new HashMap<String,Object>();
		
    	map.put(ADRConstants.DASH_BOARD_CONFIG_LIST, dashboardRepository.findAll());
    	map.put(ADRConstants.REMEDY_CONFIGURATION, remedyConfigurationRepository.findAll());
    	//buildMapIncidentConfigurationBySorgenteSistema();
		log.info("connecting to DB for getting the configuration...DONE");
    }
  
	/* (non-Javadoc)
     * @see it.reply.sytel.xawes.shunter.dao.configuration.DaoConfig#getConfig()
     */
    public Map<String,Object> getConfig() throws ConfigurationException {
    	return this.map;
    }

//	public ConnectorConfigurationDAO getConnectorConfigurationDAO() {
//		return connectorConfigurationDAO;
//	}
//
//	public void setConnectorConfigurationDAO(ConnectorConfigurationDAO connectorConfigurationDAO) {
//		this.connectorConfigurationDAO = connectorConfigurationDAO;
//	}
	
}

