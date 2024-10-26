package com.example.demo.repository;

import java.util.List;

import com.example.demo.entitiy.Restaurant;

public interface RestaurantRepository {

	List<Restaurant> selectByNameWildcard(String restaurantName);
}
