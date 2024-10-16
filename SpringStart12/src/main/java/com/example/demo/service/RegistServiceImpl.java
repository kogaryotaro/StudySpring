package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entitiy.Review;
import com.example.demo.repository.RegistRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService {

	private final RegistRepository repository;
	@Override
	public void regist(Review review) {

		repository.add(review);

	}

}
