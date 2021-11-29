package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.FlightTicketException;
import com.project.entities.TicketModel;

import com.project.services.BookingService;
import com.project.services.TicketService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class TicketController {
	
	@Autowired
	TicketService service;

	@GetMapping("/ticket/{id}")
	public TicketModel getTicketDetailsById(@PathVariable int id) throws FlightTicketException {
		
		return service.getTicketDetailsById(id);
	}
	@GetMapping("/tickets/{mailID}")
	public TicketModel getTicketDetailsByEmailId(@PathVariable String emailId) {
		
		return service.getTicketDetailsByEmailId(emailId);
	}
	
	
	
}
