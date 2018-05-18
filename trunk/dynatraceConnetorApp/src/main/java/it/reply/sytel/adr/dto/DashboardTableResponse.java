package it.reply.sytel.adr.dto;

import java.io.Serializable;
import java.util.ArrayList;

import it.reply.sytel.adr.domain.Dashboard;

public class DashboardTableResponse
  implements Serializable
{
  private static final long serialVersionUID = -4677171240244035133L;
  private Iterable<DashboardForTable> data;
  
  public Iterable<DashboardForTable> getData()
  {
    return this.data;
  }
  
  public DashboardTableResponse(Iterable<Dashboard> dashBoardList)
  {
    this.data = new ArrayList<DashboardForTable>();
    for (Dashboard dashboard : dashBoardList)
    {
    	DashboardForTable dashboardForTable = new DashboardForTable();
    	dashboardForTable.setCheckbox("");
    	dashboardForTable.setDashboardId(dashboard.getDashboardId());
    	dashboardForTable.setAppPwd(dashboard.getAppPwd());
    	dashboardForTable.setAppUrl(dashboard.getAppUrl());
    	dashboardForTable.setAppUser(dashboard.getAppUser());
    	dashboardForTable.setDescription(dashboard.getDescription());
    	dashboardForTable.setName(dashboard.getName());
    	    	   
        ((ArrayList<DashboardForTable>)this.data).add(dashboardForTable);
    }
  }
}
