package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.Dashboard;

@Transactional
public interface DashboardRepository extends CrudRepository<Dashboard, Long> {
	
	 public Dashboard findByName(String name);
	 public Dashboard findByDashboardId(Long id);
	 
}
