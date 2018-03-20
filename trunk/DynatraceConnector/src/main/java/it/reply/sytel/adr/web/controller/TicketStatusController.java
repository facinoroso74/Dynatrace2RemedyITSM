/**
 * 
 */
package it.reply.sytel.adr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.TicketStatus;
import it.reply.sytel.adr.repositories.TicketStatusRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
@RequestMapping("/ticketstatus")
public class TicketStatusController {
	
	@Autowired
	TicketStatusRepository ticketstatusRepository;
	/**
	 * GET /create  --> Create a new booking and save it in the database.
	 */
	@RequestMapping("/create")
	public TicketStatus create(TicketStatus ticketstatus) {
		ticketstatus = ticketstatusRepository.save(ticketstatus);
	    return ticketstatus;
	}
	
	/**
	 * GET /read  --> Read a booking by booking id from the database.
	 */
	@RequestMapping("/read")
	public TicketStatus read(@RequestParam String name) {
		TicketStatus ticketStatus= ticketstatusRepository.findByName(name);
	    return ticketStatus;
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
