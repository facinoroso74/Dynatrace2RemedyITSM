package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.ServiceType;

@Transactional
public interface ServiceTypeRepository extends CrudRepository<ServiceType, Long> {
	
	 public ServiceType findByName(String name);
	 
}
