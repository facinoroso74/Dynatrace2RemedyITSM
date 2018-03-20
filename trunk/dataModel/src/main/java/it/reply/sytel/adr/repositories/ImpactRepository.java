package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.Impact;

@Transactional
public interface ImpactRepository extends CrudRepository<Impact, Long> {
	
	 public Impact findByName(String name);
	 
}
