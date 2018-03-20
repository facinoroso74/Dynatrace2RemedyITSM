package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.Urgency;

@Transactional
public interface UrgencyRepository extends CrudRepository<Urgency, Long> {
	
	 public Urgency findByName(String name);
	 
}
