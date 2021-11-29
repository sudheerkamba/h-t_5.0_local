package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.exceptions.FlightTicketException;
import com.project.entities.TicketModel;
import com.project.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository repo;

	public TicketModel bookTicket(TicketModel model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}

	public List<TicketModel> getTicket() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public TicketModel getTicketDetailsById(@PathVariable Long id) throws FlightTicketException {
		// TODO Auto-generated method stub
		Optional<TicketModel> tckt=repo.findById(id);
		if(tckt.isPresent()) {
			return tckt.get();
		}
		else
		throw new FlightTicketException("Invalid ticket");
		
	}

	public List<TicketModel> getTicketDetailsByEmailId(String emailId) throws FlightTicketException {
		// TODO Auto-generated method stub
		Optional<List<TicketModel>> tckt=repo.getTicketDetailsByEmailId( emailId);
		if(tckt.isPresent()) {
			return tckt.get();
		}
		else
		throw new FlightTicketException("Ticket Details Not Found");
	}

}
