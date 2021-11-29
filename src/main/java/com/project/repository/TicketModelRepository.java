package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.TicketModel;

public interface TicketModelRepository extends JpaRepository<TicketModel, Integer>{

}
