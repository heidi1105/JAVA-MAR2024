package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

@RestController
@RequestMapping("/api")
public class APIController {

	// To import the class to use
	private final TripService tripService;

	public APIController(TripService tripService) {
		this.tripService = tripService;
	}
	
	@GetMapping("/trips") // GET: /api/trips --> all trips
	public List<Trip> findAll(){
		return tripService.allTrips();
	}
	
	// Process of create
	@PostMapping("/trips") // POST: /api/trips --> create a trip
	public Trip addTrip(
			@RequestParam("location") String location,
			@RequestParam("tripLength") Integer tripLength,
			@RequestParam("description") String description,
			@RequestParam("owner") String owner
			) {
		Trip newTrip  = new Trip(location, tripLength, description, owner);
		return tripService.createTrip(newTrip);
	}
	
	// Find one
	
	// Update
	
	// Delete
	
}











