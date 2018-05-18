package it.reply.sytel.adr.restServices;

import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.dto.ConfigurationTableResponse;
import it.reply.sytel.adr.repositories.ConfigurationRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/ticketconfiguration"})
public class ConfigurationController
{
  private Logger log = LogManager.getLogger(getClass());
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
      this.log.info("configuration to create:[" + configuration + "]");
      
      return (Configuration)this.configurationRepository.save(configuration);
    }
    catch (Exception e)
    {
      this.log.error("Exception on addNewConfiguration", e);
      throw new RuntimeException("Exception on addNewConfiguration", e);
    }
  }
  
  @RequestMapping({"/read"})
  public Configuration read(@RequestParam String tipoIncident, @RequestParam String sorgenteSistema)
  {
    this.log.debug("Configuration--> called read method");
    Configuration configuration = this.configurationRepository.findByTipoIncidentAndSorgenteSistema(tipoIncident, sorgenteSistema);
    return configuration;
  }
  
  @RequestMapping({"/readByID"})
  public Configuration read(@RequestParam Long configurationId)
  {
    this.log.debug("Configuration--> called readByID method");
    Configuration configuration = this.configurationRepository.findByconfigurationId(configurationId);
    return configuration;
  }
  
  @RequestMapping({"/readAll"})
  public ConfigurationTableResponse readAll()
  {
    this.log.debug("Configuration--> called readAll method");
    
    Iterable<Configuration> data = this.configurationRepository.findAll();
    return new ConfigurationTableResponse(data);
  }
  
  @RequestMapping({"/delete"})
  public void delete(@RequestParam Long configurationId)
  {
    this.log.debug("Deleting the ConfigurationId:[" + configurationId + "]");
    this.configurationRepository.delete(configurationId);
  }
}
