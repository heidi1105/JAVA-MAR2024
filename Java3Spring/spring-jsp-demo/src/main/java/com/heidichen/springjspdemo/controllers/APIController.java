package com.heidichen.springjspdemo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//1. Add this annotation to specify this file can render routes
@RestController
@RequestMapping("/api")
public class APIController {
	
	 // 2. Add the RequestMapping annotation and the corresponding method
	@RequestMapping("/test") 
	public String apiTest() { // 2.1 when it reaches localhost:8080/api/test
		return "Hello Spring";  // 2.2 Response with the return of this method
	}
	
	// Option 1: RequestMapping without specification will be Get
	@RequestMapping("/option1")
	public String option1Mapping() {
		return "Option 1: default RequestMapping";
	}
	
	// Option 2: RequestMapping with specification
	@RequestMapping(value="/option2", method=RequestMethod.GET)
	public String option2Mapping() {
		return "Option 2: Longhanded RequestMapping";
	}
	
	// Option 3: GetMapping / PostMapping / PutMapping / DeleteMapping
	@GetMapping("/option3")
	public String option3Mapping() {
		return "Option 3: GetMapping";
	}
	
	// RequestParam 
	// localhost:8080/api/search?festival=easter
	@GetMapping("/search")
	public String queryForFestival(
			@RequestParam(value="festival", required=false)String fest,
			@RequestParam(value="count", required=false)Integer countInMethod
			) {
		if(fest == null) {
			return "You did not search for any festival";
		}else {
			return "You searched for the festival: "+ fest + " for " + countInMethod + " times";			
		}
	}
	
	// PathVariable
	// localhost:8080/api/activity/karaoke/5
	@GetMapping("/activity/{activityName}/{activityId}")
	public String findOneActivity(
			@PathVariable("activityName")String name,
			@PathVariable("activityId")Integer id) {
		return "You are in the details page of activity ID " + id + " with the name: " + name;
	}
		
}










