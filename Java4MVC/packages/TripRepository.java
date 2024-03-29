package com.heidichen.mvcdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heidichen.mvcdemo.models.Trip;

@Repository // generate queries 
public interface TripRepository extends CrudRepository<Trip, Long>{
	
	List<Trip> findAll(); // List: interface, ArrayList : Class
	
}
