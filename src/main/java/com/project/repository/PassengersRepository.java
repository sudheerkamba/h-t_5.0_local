package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Passengers;


public interface PassengersRepository extends JpaRepository<Passengers, Integer>{

}
