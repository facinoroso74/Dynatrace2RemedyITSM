package it.reply.sytel.adr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController
{
  @RequestMapping({"/home"})
  String home()
  {
    return "app.homepage";
  }
  
  @RequestMapping({"/incidentConfiguration"})
  String configuration()
  {
    return "app.incidentConfiguration";
  }
  
  @RequestMapping({"/addIncidentConfiguration"})
  String addconfiguration()
  {
    return "app.addIncidentConfiguration";
  }
  
  @RequestMapping({"/editIncidentConfiguration"})
  String editconfiguration()
  {
    return "app.editIncidentConfiguration";
  }
  
  @RequestMapping({"/dashboard"})
  String dashboard()
  {
    return "app.dashboardConfiguration";
  }
  
  @RequestMapping({"/addDashboard"})
  String adddashboard()
  {
    return "app.addDashboardConfiguration";
  }
  
  @RequestMapping({"/editDashboard"})
  String editdashboard()
  {
    return "app.editDashboardConfiguration";
  }
  
  @RequestMapping({"/remedyConfiguration"})
  String remedyConfiguration()
  {
    return "app.remedyConfiguration";
  }
  
  @RequestMapping({"/addRemedyConfiguration"})
  String addRemedyConfiguration()
  {
    return "app.addRemedyConfiguration";
  }
  
  @RequestMapping({"/editRemedyConfiguration"})
  String editRemedyConfiguration()
  {
    return "app.editRemedyConfiguration";
  }
  
  @RequestMapping({"/dynatraceIncidents"})
  String incidents()
  {
    return "app.dynatraceIncidents";
  }
  
  @RequestMapping({"/schedulerManager"})
  String schedulerManager()
  {
    return "app.schedulerManager";
  }
}
