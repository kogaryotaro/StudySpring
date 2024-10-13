package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.ReviewRegistForm;

@Controller
public class ReviewController {
	
	@GetMapping("/show-review-form")
	public String showReviewForm() {
		return "regist-review";
	}
	
	@PostMapping("/regist-review")
	public String registReview(@ModelAttribute ReviewRegistForm form) {
		System.out.println(form);
		return "confirm-regist-review";
	}

}
