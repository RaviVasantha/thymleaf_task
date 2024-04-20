package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymleafController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("pageTitle","Home page");
		model.addAttribute("message","This is a thymeleaf template example.");
		return "index";
		
	}

}
