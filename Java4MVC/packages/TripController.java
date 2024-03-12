package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

@Controller
public class TripController {

	// import service
	private final TripService tripService;

	public TripController(TripService tripService) {
		this.tripService = tripService;
	}
	
	@GetMapping("/trips")
	public String displayTripDashboard(Model model) {
		// 1. get the list of trip from service
		List<Trip> tripList = tripService.allTrips();
		
		// 2. store it in Model model for jsp to use
		model.addAttribute("tripList", tripList);
		
		return "tripDashboard.jsp";
	}
	
	// Find one
	@GetMapping("/trips/{id}")
	public String displayTripDetails(@PathVariable("id")Long id, Model model) {
		// 1. get the id from PathVariable
		// 2. get the Trip from service based on the id from pathvariable
		Trip oneTrip = tripService.oneTrip(id);
		// 3. store it in Model model
		model.addAttribute("oneTrip", oneTrip);
		
		return "tripDetails.jsp";
	}
	
	
	
	
}
