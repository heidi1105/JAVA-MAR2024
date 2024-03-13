package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

import jakarta.validation.Valid;

@Controller
public class TripController {

	// import service
	private final TripService tripService;

	public TripController(TripService tripService) {
		this.tripService = tripService;
	}
	
//	@Autowired
//	private TripService tripService;
	
	@GetMapping("/trips")
	public String displayDashboardPage(Model model) {
		// 1. get the triplist from service
		List<Trip> tripList = tripService.allTrips();
		// 2. store the triplist in the Model model
		model.addAttribute("tripList", tripList);
		return "tripDashboard.jsp";
	}
	
	
	// Details : 1. Store the id from route
	@GetMapping("/trips/{id}")
	public String displayDetailsPage(@PathVariable("id") Long id, Model model) {
		// 2. get the trip from service with the id
		Trip oneTrip = tripService.oneTrip(id);
		// 3. store it in Model model
		model.addAttribute("oneTrip", oneTrip);
		return "tripDetails.jsp";
	}
	
	
	// CREATE
	// Render the form page
	@GetMapping("/trips/new")
	public String renderCreateForm(Model model) {
		// @ModelAttribute("Book") Book book
		// - create a empty Book and store it in Model model
		Trip emptyTrip = new Trip();
		model.addAttribute("newTrip", emptyTrip);
		return "newTrip.jsp";
	}
	
	
	// Process the form
	@PostMapping("/trips/new")
	public String processCreateForm(
			@Valid @ModelAttribute("newTrip") Trip newTrip,
			BindingResult result, Model model) {
		// check if there is any error
		if(result.hasErrors()) { // errors are bound into that ModelAttribute
			return "newTrip.jsp";
		}else {
			tripService.createTrip(newTrip);
			return "redirect:/trips";	
		}
	}
	
	// Edit
	// RENDER THE FORM PAGE
	// 1. get the id from Path
	@GetMapping("/trips/{id}/edit")
	public String renderEditPage(@PathVariable("id") Long id, Model model) {
		// 2. get the trip from the service with the id
		Trip oneTrip = tripService.oneTrip(id);
		// 3. store it in Model model with the name as the form:form modelAttribute
		model.addAttribute("trip", oneTrip);
		return "editTrip.jsp";
		// 4. jsp: SAME AS CREATE but update the action & method --> PUT
	}
	
	// PROCESS EDIT (same as Create process)
	@PutMapping("/trips/{id}/edit")
	public String processEdit(
			@Valid @ModelAttribute("trip") Trip trip, BindingResult result
			) {
		if(result.hasErrors()) {
			return "editTrip.jsp";
		}else {
			tripService.updateTrip(trip);
			return "redirect:/trips";
		}
	}
	
	// DELETE PROCESS
	@DeleteMapping("/trips/{id}/delete")
	public String processDelete(@PathVariable("id")Long id) {
		tripService.deleteTripById(id);
		return "redirect:/trips";
	}
		
	
}



