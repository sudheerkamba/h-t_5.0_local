package com.project.repository;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.QueryParam;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.TicketModel;

public interface BookingRepository extends JpaRepository<TicketModel, Long>{
	
	@QueryParam("select com.project.entities.TicketModel T,com.project.entities.Passengers P from T join P where T.emailId=?1")
	public Optional<List<TicketModel>> getTicketDetailsByEmailId(String emailId);
		

}
