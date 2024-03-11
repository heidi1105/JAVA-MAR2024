package com.heidichen.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	// -------------------- SESSIONS ----------------------
	@GetMapping("/sessions")
	public String sessionHome(HttpSession session) {
		// if the session is not available, set the count to 0
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}else {
			// get the session variable & CAST it into the correct datatype
			Integer countFromSession = (Integer)session.getAttribute("count");
			
			// reset the count into count+1
			session.setAttribute("count", countFromSession +1 );
		}

		
		
		return "sessions/home.jsp";
	}
	
	@GetMapping("/sessions/display")
	public String sessionDisplayWithoutUpdate() {
		return "sessions/display.jsp";
	}
	
	@GetMapping("/sessions/clear")
	public String clearSession(HttpSession session) {
		// session.invalidate();
		session.removeAttribute("count");
		return "redirect:/sessions";
	}
	
	// -------------------- FORM ----------------------
	@GetMapping("/reviews/form")
	public String displayReviewForm() {
		return "reviewForm/reviewForm.jsp";
	}
	
	// http://localhost:8080/process?title=Chocolate&reviewer=Heidi&rating=9&description=Very+good
	@PostMapping("/process")
	public String reviewFormProcess(
			@RequestParam("title") String title,
			@RequestParam("reviewer") String reviewer,
			@RequestParam("rating") Integer rating,
			@RequestParam("description") String description, 
			HttpSession session
			) {
		session.setAttribute("title", title);
		session.setAttribute("reviewer", reviewer);
		session.setAttribute("rating", rating);
		session.setAttribute("description", description);
		return "redirect:/reviews/result";
		// Reach localhost:8080/reviews/result in the browser
	}
	
	@GetMapping("/reviews/result")
	public String displayReviewResult() {
		return "reviewForm/reviewResult.jsp";
	}
	
}






