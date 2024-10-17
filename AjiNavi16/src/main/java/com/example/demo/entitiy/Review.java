package com.example.demo.entitiy;

import java.sql.Date;

import lombok.Data;

@Data
public class Review {
	
	private Integer restaurantId;
	private String userId;
	private Date visitDate;
	private Integer rating;
	private String comment;
}
