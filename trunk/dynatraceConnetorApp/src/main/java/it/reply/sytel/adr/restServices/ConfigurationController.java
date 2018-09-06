package it.reply.sytel.adr.restServices;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.dto.ConfigurationTableResponse;
import it.reply.sytel.adr.repositories.ConfigurationRepository;

@RestController
@RequestMapping({"/ticketconfiguration"})
public class ConfigurationController
{
	private static final Logger log = LogManager.getLogger(ConfigurationController.class);
  
  @Autowired
  ConfigurationRepository configurationRepository;
  
  @RequestMapping({"/create"})
  public Configuration create(Configuration configuration)
  {
    configuration = (Configuration)this.configurationRepository.save(configuration);
    return configuration;
  }
  
  @RequestMapping(value={"/addNew"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Configuration addNewConfiguration(Configuration configuration)
  {
    try
    {
      log.info("configuration to create:[" + configuration + "]");
      
      return (Configuration)this.configurationRepository.save(configuration);
    }
    catch (Exception e)
    {
      log.error("Exception on addNewConfiguration", e);
      throw new RuntimeException("Exception on addNewConfiguration", e);
    }
  }
  
  @RequestMapping({"/read"})
  public Configuration read(@RequestParam String tipoIncident, @RequestParam String sorgenteSistema)
  {
    log.debug("Configuration--> called read method");
    Configuration configuration = this.configurationRepository.findByTipoIncidentAndSorgenteSistema(tipoIncident, sorgenteSistema);
    return configuration;
  }
  
  @RequestMapping({"/readByID"})
  public Configuration read(@RequestParam Long configurationId)
  {
    log.debug("Configuration--> called readByID method");
    Configuration configuration = this.configurationRepository.findByconfigurationId(configurationId);
    return configuration;
  }
  
  @RequestMapping({"/readAll"})
  public ConfigurationTableResponse readAll()
  {
    log.debug("Configuration--> called readAll method");
    
    Iterable<Configuration> data = this.configurationRepository.findAll();
    return new ConfigurationTableResponse(data);
  }
  
  @RequestMapping({"/delete"})
  public void delete(@RequestParam Long configurationId)
  {
    log.debug("Deleting the ConfigurationId:[" + configurationId + "]");
    this.configurationRepository.delete(configurationId);
  }
  
  
  @RequestMapping(value={"/put"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Configuration put(Configuration configuration)
  {
    try
    {
      log.info("configuration to edit:[" + configuration + "]");
      
      return (Configuration)this.configurationRepository.save(configuration);
    }
    catch (Exception e)
    {
      log.error("Exception on editConfiguration", e);
      throw new RuntimeException("Exception on editConfiguration", e);
    }
  }
}
