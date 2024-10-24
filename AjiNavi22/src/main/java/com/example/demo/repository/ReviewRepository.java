package com.example.demo.repository;

import java.util.List;

import com.example.demo.entitiy.Review;

public interface ReviewRepository {

	void add(Review review);
	
	List<Review> selectByRestaurantId(int restaurantId);
}
