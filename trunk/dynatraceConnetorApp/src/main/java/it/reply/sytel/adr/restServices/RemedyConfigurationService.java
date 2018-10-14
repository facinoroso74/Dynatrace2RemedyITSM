package it.reply.sytel.adr.restServices;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.dto.RemedyConfigurationTableResponse;
import it.reply.sytel.adr.repositories.RemedyConfigurationRepository;

@RestController
@RequestMapping({"/remedy"})
public class RemedyConfigurationService
{
  //private Logger log = LogManager.getLogger(getClass());
  
  @Autowired
  RemedyConfigurationRepository remedyConfigurationRepository;
   
  @RequestMapping(value={"/addNew"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public RemedyConfiguration addNew(RemedyConfiguration remedyConfiguration)
  {
    try
    {
      //this.log.info("remedyConfiguration to create:[" + remedyConfiguration + "]");
      
      return (RemedyConfiguration)this.remedyConfigurationRepository.save(remedyConfiguration);
    }
    catch (Exception e)
    {
      //this.log.error("Exception on addNewRemedyConfiguration", e);
      throw new RuntimeException("Exception on addNewRemedyConfiguration", e);
    }
  }
  
  @RequestMapping({"/read"})
  public RemedyConfiguration read(@RequestParam Long remedyConfigurationId)
  {
    //this.log.debug("RemedyConfiguration--> called read method");
    RemedyConfiguration remedyConfiguration = this.remedyConfigurationRepository.findByRemedyConfigurationId(remedyConfigurationId);
    return remedyConfiguration;
  }
  
  @RequestMapping({"/readAll"})
  public RemedyConfigurationTableResponse readAll()
  {
  //  this.log.debug("Dashboard--> called readAll method");
    
    Iterable<RemedyConfiguration> data = this.remedyConfigurationRepository.findAll();
    return new RemedyConfigurationTableResponse(data);
  }
  
  @RequestMapping({"/delete"})
  public void delete(@RequestParam Long remedyConfigurationId)
  {
    //this.log.debug("Deleting the dashboardId:[" + remedyConfigurationId + "]");
    this.remedyConfigurationRepository.deleteById(remedyConfigurationId);
  }
  
  
  @RequestMapping(value={"/put"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public RemedyConfiguration put(RemedyConfiguration remedyConfiguration)
  {
    try
    {
      //this.log.info("remedyConfiguration to edit:[" + remedyConfiguration + "]");
      
      return (RemedyConfiguration)this.remedyConfigurationRepository.save(remedyConfiguration);
    }
    catch (Exception e)
    {
      //this.log.error("Exception on editRemedyConfiguration", e);
      throw new RuntimeException("Exception on editRemedyConfiguration", e);
    }
  }
  
  
}
