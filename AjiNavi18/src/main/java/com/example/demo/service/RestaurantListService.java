package com.example.demo.service;

import java.util.List;

import com.example.demo.entitiy.Restaurant;

public interface RestaurantListService {

	List<Restaurant> findByNameWildcard(String restaurantName);
}
