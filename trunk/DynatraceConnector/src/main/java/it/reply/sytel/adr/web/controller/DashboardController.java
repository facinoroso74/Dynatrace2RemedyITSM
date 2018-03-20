/**
 * 
 */
package it.reply.sytel.adr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.domain.Dashboard;
import it.reply.sytel.adr.repositories.DashboardRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	DashboardRepository dashBoardRepository;
	/**
	 * GET /create  --> Create a new booking and save it in the database.
	 */
//	@RequestMapping("/create")
//	public Booking create(Booking booking) {
//		booking.setTravelDate(new Date());
//		booking = dashBoardRepository.save(booking);
//	    return booking;
//	}
//	
	/**
	 * GET /read  --> Read a booking by booking id from the database.
	 */
	@RequestMapping("/read")
	public Dashboard read(@RequestParam String name) {
		Dashboard dashboard= dashBoardRepository.findByName(name);
	    return dashboard;
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
