package it.reply.sytel.adr.restServices;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.DynatraceIncidentBean;
import it.reply.sytel.adr.dto.DynatraceIncidentTableResponse;
import it.reply.sytel.adr.repositories.DynatraceIncidentRepository;


@RestController
@RequestMapping({"/dynatraceIncident"})
public class DynatraceIncident
{
  private Logger log = LogManager.getLogger(getClass());
  
  @Autowired
  DynatraceIncidentRepository dynatraceIncidentRepository;
   
   
  @RequestMapping({"/readAll"})
  public DynatraceIncidentTableResponse readAll()
  {
    this.log.debug("Dashboard--> called readAll method");
    
    Iterable<DynatraceIncidentBean> data = this.dynatraceIncidentRepository.findAll();
    return new DynatraceIncidentTableResponse(data);
  }
  
  @RequestMapping({"/delete"})
  public void delete(@RequestParam Long dynatraceIncidentId)
  {
    this.log.debug("Deleting the dashboardId:[" + dynatraceIncidentId + "]");
    this.dynatraceIncidentRepository.delete(dynatraceIncidentId);
  }
  
  @RequestMapping({"/read"})
  public DynatraceIncidentBean read(@RequestParam Long dynatraceIncidentId)
  {
    this.log.debug("Deleting the dynatraceIncidentId:[" + dynatraceIncidentId + "]");
    return this.dynatraceIncidentRepository.findById(dynatraceIncidentId);
  }
}
