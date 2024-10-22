package com.example.demo.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entitiy.Review;
import com.example.demo.form.ReviewSearchForm;

@Controller
public class ReviewListController {

//	検索リクエスト
	@PostMapping("/search-review")
	private String searchReview(
			@ModelAttribute ReviewSearchForm form,
			Model model) {
		
		List<Review> list = new ArrayList<Review>();
		
		//テストデータ
		//--1--
		Review review = new Review();
		review.setReviewId(1);
		review.setRestaurantId(1);
		review.setUserId("user1");
		review.setVisitDate(Date.valueOf("2027-07-01"));
		review.setRating(3);
		review.setComment("comment1");
		list.add(review);
		//--2--
		review = new Review();
		review.setReviewId(2);
		review.setRestaurantId(1);
		review.setUserId("user2");
		review.setVisitDate(Date.valueOf("2027-07-02"));
		review.setRating(4);
		review.setComment("comment2");
		list.add(review);
		//テストデータ(おわり)
		
		if(list.size() >0) {
			model.addAttribute("reviewList", list);
		}
		
		return "review-list";
	}
}
