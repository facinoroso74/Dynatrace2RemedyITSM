package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.RemedyConfiguration;

@Transactional
public interface RemedyConfigurationRepository extends CrudRepository<RemedyConfiguration, Long> {
	
	
}
