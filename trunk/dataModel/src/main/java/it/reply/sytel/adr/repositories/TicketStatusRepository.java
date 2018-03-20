package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.TicketStatus;

@Transactional
public interface TicketStatusRepository extends CrudRepository<TicketStatus, Long> {
	
	 public TicketStatus findByName(String name);
	 
}
