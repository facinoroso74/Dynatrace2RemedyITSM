package it.reply.sytel.adr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.reply.sytel.adr.domain.Configuration;

@Transactional
public interface ConfigurationRepository extends CrudRepository<Configuration, Long> {
	
	/**
	   * This method will find an Boooking instance in the database by its departure.
	   * Note that this method is not implemented and its working code will be
	   * automatically generated from its signature by Spring Data JPA.
	   */
	public Configuration findByDescrizioneAndSorgenteSistema(String descrizione,String sorgenteSistema);
	
	public Configuration findByDescrizioneAndDashboard(String descrizione,String dashboard);

	public Configuration findByconfigurationId(Long configurationId);
	
	public Configuration findByDescrizione(String descrizione);
	  
}
