package com.example.demo.service;

import java.util.List;

import com.example.demo.entitiy.Review;

public interface ReviewListService {

	List<Review> findByRestaurantId(int restaurantId);
}
