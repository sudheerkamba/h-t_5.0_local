package com.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.exceptions.EmployeeException;
import com.example.demo.exceptions.FlightTicketException;
import com.project.entities.TicketModel;
import com.project.repository.PassengersRepository;
import com.project.repository.TicketModelRepository;


@Service
public class TicketService {
	
	@Autowired
	TicketModelRepository ticketRepo;
	
	PassengersRepository passngRepo;
	

	public TicketModel getTicketDetailsById(int id) throws FlightTicketException {
		// TODO Auto-generated method stub
		Optional<TicketModel> tckt=ticketRepo.findById(id);
		if(tckt.isPresent()) {
			TicketModel model= tckt.get();
			passngRepo.get
			
			
		}
		else
		throw new FlightTicketException("Invalid ticket");
		return ticketRepo.findById(id).get();
	}

	public TicketModel getTicketDetailsById(String emaiId) {
		// TODO Auto-generated method stub
		return null;
	}

}
