package com.heidichen.mvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.repositories.TripRepository;

@Service
public class TripService {

	// add repo as the dependency
	private final TripRepository tripRepo;
	
	public TripService(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}
	
	// FIND ALL
	public List<Trip> allTrips(){
		return tripRepo.findAll();
	}
	
	// Create a trip
	public Trip createTrip(Trip newTrip) {
		return tripRepo.save(newTrip);
	}
	
}












