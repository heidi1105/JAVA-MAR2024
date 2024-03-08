package com.heidichen.springjspdemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String displayDemoPage() {
		return "demo.jsp";
	}
	
	@GetMapping("/jstl")
	public String displayJstlDemoPage(Model model) {
		Integer happiness = 10;
		String hackerCode = "<script>alert('Hi') </script>";
		model.addAttribute("name", "Pepper");
		model.addAttribute("jspHappiness", happiness);
		model.addAttribute("hackerCode", hackerCode);
		
		ArrayList<String> skills = new ArrayList<String>();
		skills.add("Hack the code!");
		skills.add("Bootstrap");
		skills.add("Tailwind");
		
		model.addAttribute("jspSkills", skills);
		
		// The following are for reference. You do not need them to use jstl in jsp
		if(happiness > 5) {
			System.out.println("I am very happy");
		}
		
		if(happiness < 5) {
			System.out.println("Happiness is less than 5");
		}else {
			System.out.println("Happiness is more than 5");
		}
		
		for(String eachSkill: skills) {
			System.out.println(eachSkill);
		}
		
		
		
		
		return "jstlDemo.jsp";
	}
}






