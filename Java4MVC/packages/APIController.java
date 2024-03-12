package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<Trip> findAllTrips(){
		return tripService.allTrips();
	}
	
	// Process of create
	@PostMapping("/trips") // POST: /api/trips --> create a trip
	public Trip addTrip(
			@ModelAttribute("newTrip") Trip newTrip
			) {
		return tripService.createTrip(newTrip);
	}
	
	/* BEHIND THE SCNENE OF ModelAttribute
	@PostMapping("/trips") // POST: /api/trips --> create a trip
	public Trip addTrip(
			@RequestParam("location") String location,
			@RequestParam("tripLength") Integer tripLength,
			@RequestParam("description") String description,
			@RequestParam("owner") String owner
			) {
		Trip newTrip = new Trip();
		
		newTrip.setDescription(description);
		newTrip.setLocation(location);
		newTrip.setOwner(owner);
		newTrip.setTripLength(tripLength);
		
//		Trip newTrip  = new Trip(location, tripLength, description, owner);
		return tripService.createTrip(newTrip);
	}
	*/
	
	
	// Find one
	// localhost:8080/api/trips/2
	@GetMapping("/trips/{id}")
	public Trip oneTrip(
			@PathVariable("id") Long id) {
		return tripService.oneTrip(id);
	}
	
	
	// Update process
	@PutMapping("/trips/{id}")
	public Trip editTrip(
			@ModelAttribute("oneTrip") Trip oneTrip) {
		return tripService.updateTrip(oneTrip);
	}
	
//	// Update process
//	@PutMapping("/trips/{id}")
//	public Trip editTrip(
//			@PathVariable("id") Long id,
//			@RequestParam("location") String location,
//			@RequestParam("tripLength") Integer tripLength,
//			@RequestParam("description") String description,
//			@RequestParam("owner") String owner) {
//		// 1. get the trip from service
//		Trip oneTrip = tripService.oneTrip(id);
//		
//		// 2. update all the fields
//		oneTrip.setLocation(location);
//		oneTrip.setDescription(description);
//		oneTrip.setOwner(owner);
//		oneTrip.setTripLength(tripLength);
//		
//		// 3. save
//		return tripService.updateTrip(oneTrip);
//	}
//	
	
	// Delete
	@DeleteMapping("/trips/{id}")
	public void deleteTrip(@PathVariable("id")Long id) {
		tripService.deleteTripById(id);
	}
	
}











