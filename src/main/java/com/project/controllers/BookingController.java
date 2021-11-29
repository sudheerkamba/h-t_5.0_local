package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.project.entities.TicketModel;
import com.project.exceptions.FlightTicketException;
import com.project.services.BookingService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class BookingController {
	
	@Autowired
	BookingService service;

	@PostMapping("/booking/{id}")
	public TicketModel bookTicket(@RequestBody TicketModel model,@PathVariable Long id) {
		
		return service.bookTicket(model);
	}
	@GetMapping("/ticket/{id}")
	public TicketModel getTicketDetailsById(@PathVariable Long id) throws FlightTicketException {
		
		return service.getTicketDetailsById(id);
	}
	@GetMapping("/tickets/{mailID}")
	public List<TicketModel> getTicketDetailsByEmailId(@PathVariable String emailId) throws FlightTicketException {
		
		return service.getTicketDetailsByEmailId(emailId);
	}
	
	
	
}
