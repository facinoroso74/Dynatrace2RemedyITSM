/**
 * 
 */
package it.reply.sytel.adr.restServices;

import javax.management.RuntimeErrorException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.dto.ConfigurationTableResponse;
import it.reply.sytel.adr.repositories.ConfigurationRepository;

/**
 * @author Michele Pantaleone
 *
 */
@RestController
@RequestMapping("/ticketconfiguration")
public class ConfigurationController {
	
	private Logger log=LogManager.getLogger(getClass());
	
	
	@Autowired
	ConfigurationRepository configurationRepository;
	/**
	 * GET /create  --> Create a new configuration and save it in the database.
	 */
	@RequestMapping("/create")
	public Configuration create(Configuration configuration) {
		configuration = configurationRepository.save(configuration);
	    return configuration;
	}
	
	@RequestMapping(value="/addNew", method = RequestMethod.POST)
    //@ResponseStatus(HttpStatus.OK)
	public Configuration addNewConfiguration(Configuration configuration) {
		
		try {
			
			log.info("configuration to create:["+configuration+"]");
			
			configuration = configurationRepository.save(configuration);
		    return configuration;
		    
		}catch (Exception e) {
			log.error("Exception on addNewConfiguration",e);
			throw new RuntimeException("Exception on addNewConfiguration",e);
		}
	}
	
	/**
	 * GET /read  --> Read a configuration by Key from the database.
	 */
	@RequestMapping("/read")
	public Configuration read(@RequestParam String tipoIncident,@RequestParam String sorgenteSistema) {
		log.debug("Configuration--> called read method");
		Configuration configuration= configurationRepository.findByTipoIncidentAndSorgenteSistema(tipoIncident, sorgenteSistema);
	    return configuration;
	}
	
	/**
	 * GET /read  --> Read a configuration by Key from the database.
	 */
	@RequestMapping("/readByID")
	public Configuration read(@RequestParam Long configurationId) {
		log.debug("Configuration--> called readByID method");
		Configuration configuration= configurationRepository.findByconfigurationId(configurationId);
	    return configuration;
	}
	
	
	
	@RequestMapping("/readAll")
	public ConfigurationTableResponse readAll() {
		log.debug("Configuration--> called readAll method");
		
		Iterable<Configuration> data= configurationRepository.findAll();
		return new ConfigurationTableResponse(data);
		
	}
	
	@RequestMapping("/delete")
	public void delete(@RequestParam Long configurationId) {
		log.debug("Deleting the ConfigurationId:["+configurationId+"]");
		configurationRepository.delete(configurationId);
	}
	
	/**
	 * GET /update  --> Update a booking record and save it in the database.
	 */
//	@RequestMapping("/update")
//	public Booking update(@RequestParam Long bookingId, @RequestParam String psngrName) {
//		Booking booking = bookingRepository.findOne(bookingId);
//		booking.setPsngrName(psngrName);
//		booking = bookingRepository.save(booking);
//	    return booking;
//	}
	
	/**
	 * GET /delete  --> Delete a booking from the database.
	 */
//	@RequestMapping("/delete")
//	public String delete(@RequestParam Long bookingId) {
//		bookingRepository.delete(bookingId);
//	    return "booking #"+bookingId+" deleted successfully";
//	}
}
