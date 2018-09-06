package it.reply.sytel.adr.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.DynatraceIncidentBean;

@Transactional
public interface DynatraceIncidentRepository extends CrudRepository<DynatraceIncidentBean, Serializable>{

	public DynatraceIncidentBean findById(Long id);
	
}
