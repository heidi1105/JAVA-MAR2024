package com.heidichen.mvcdemo.services;

import java.util.List;
import java.util.Optional;

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

	// find one
	public Trip oneTrip(Long id) {
		Optional<Trip> optionalTrip = tripRepo.findById(id);
		if(optionalTrip.isPresent()) {
			return optionalTrip.get();
		}else {
			return null;
		}	
	}
	
	
	// Update
	public Trip updateTrip(Trip oneTrip) {
		return tripRepo.save(oneTrip);
	}
	
	// DELETE
	public void deleteTripById(Long id) {
		tripRepo.deleteById(id);
	}
	
	
}












