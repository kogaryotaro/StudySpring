package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	
	@PostMapping("/post-param")
	public String postParam(@RequestParam String greeting, Model model) {
		model.addAttribute("mGreeting", greeting);
		
		return "display";
	}

}
