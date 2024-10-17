package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entitiy.Restaurant;
import com.example.demo.form.RestaurantSearchForm;

@Controller
public class RestaurantListController {

//	最初の検索画面
	@GetMapping("/top")
	private String restaurantList(@ModelAttribute RestaurantSearchForm form) {
		return "restaurant-list";
	}
	
//	検索リクエスト
	@PostMapping("/restaurant-search")
	private String restaurantSearch(
			@ModelAttribute RestaurantSearchForm form,
			Model model) {
		
//		テストデータ
		List<Restaurant> list = new ArrayList<Restaurant>();
		list.add(new Restaurant(1, "店舗1", "キャッチ①", 3.5));
		list.add(new Restaurant(2, "店舗2", "キャッチ2", 0.0));
		list.add(new Restaurant(3, "店舗3", "キャッチ3", 4.44444));
		
		model.addAttribute("restaurantList", list);
		
		return "restaurant-list";

	}
}
