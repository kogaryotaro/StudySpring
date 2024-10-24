package com.example.demo.form;

import java.sql.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ReviewRegistForm {
	@NotNull(message="入力してください")
	@Min(value=1, message="正の整数を入力してください。")
	private Integer restaurantId;
	
	private String restaurantName;
	
	@Size(min=1, max=16, message="1文字から16文字で指定して下さい")
	private String userId;
	
	@Past(message="今日より前の日付を指定して下さい")
	private Date visitDate;
	
	@NotNull(message="入力して！")
	@Min(value=1, message="5段階評価")
	@Max(value=5, message="5段階評価")
	private Integer rating;
	
	@Size(min=6, max=50, message="短すぎても長すぎてもダメ")
	private String comment;
}