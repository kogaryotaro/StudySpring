package com.example.demo.form;

import java.sql.Date;

import lombok.Data;

@Data
public class ReviewRegistForm {

	private int restaurantId;
	private String userId;
	private Date visitDate;
	private int rating;
	private String comment;
}
