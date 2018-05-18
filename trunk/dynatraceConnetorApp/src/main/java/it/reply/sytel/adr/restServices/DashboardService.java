package it.reply.sytel.adr.restServices;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.Dashboard;
import it.reply.sytel.adr.dto.DashboardTableResponse;
import it.reply.sytel.adr.repositories.DashboardRepository;

@RestController
@RequestMapping({"/dashboard"})
public class DashboardService
{
  private Logger log = LogManager.getLogger(getClass());
  
  @Autowired
  DashboardRepository dashboardRepository;
   
  @RequestMapping(value={"/addNew"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Dashboard addNew(Dashboard dashboard)
  {
    try
    {
      this.log.info("Dashboard to create:[" + dashboard + "]");
      
      return (Dashboard)this.dashboardRepository.save(dashboard);
    }
    catch (Exception e)
    {
      this.log.error("Exception on addNewDashboard", e);
      throw new RuntimeException("Exception on addNewDashboard", e);
    }
  }
  
  @RequestMapping({"/read"})
  public Dashboard read(@RequestParam Long dashboardId)
  {
    this.log.debug("Dashboard--> called read method");
    Dashboard dashboard = this.dashboardRepository.findOne(dashboardId);
    return dashboard;
  }
  
  @RequestMapping({"/readAll"})
  public DashboardTableResponse readAll()
  {
    this.log.debug("Dashboard--> called readAll method");
    
    Iterable<Dashboard> data = this.dashboardRepository.findAll();
    return new DashboardTableResponse(data);
  }
  
  @RequestMapping({"/delete"})
  public void delete(@RequestParam Long dashboardId)
  {
    this.log.debug("Deleting the dashboardId:[" + dashboardId + "]");
    this.dashboardRepository.delete(dashboardId);
  }
  
  
  @RequestMapping(value={"/put"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public Dashboard put(Dashboard dashboard)
  {
    try
    {
      this.log.info("dashboard to edit:[" + dashboard + "]");
      
      return (Dashboard)this.dashboardRepository.save(dashboard);
    }
    catch (Exception e)
    {
      this.log.error("Exception on editDashboard", e);
      throw new RuntimeException("Exception on editDashboard", e);
    }
  }
  
  
}
