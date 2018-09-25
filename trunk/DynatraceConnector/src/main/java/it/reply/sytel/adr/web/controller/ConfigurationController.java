/**
 * 
 */
package it.reply.sytel.adr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.repositories.ConfigurationRepository;
import it.reply.sytel.adr.web.dto.ConfigurationTableResponse;

/**
 * @author Michele Pantaleone
 *
 */
@RestController
@RequestMapping("/configuration")
public class ConfigurationController {
	
	
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
	
	/**
	 * GET /read  --> Read a configuration by Key from the database.
	 */
	@RequestMapping("/read")
	public Configuration read(@RequestParam String tipoIncident,@RequestParam String sorgenteSistema) {
		Configuration configuration= configurationRepository.findByDescrizioneAndSorgenteSistema(tipoIncident, sorgenteSistema);
	    return configuration;
	}
	
	@RequestMapping("/readAll")
	public ConfigurationTableResponse readAll() {
		Iterable<Configuration> data= configurationRepository.findAll();
		int size = ((List<Configuration>)data).size();
		return new ConfigurationTableResponse(size,data);
		
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
