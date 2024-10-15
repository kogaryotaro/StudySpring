package com.example.demo.mock;

import org.springframework.stereotype.Service;

import com.example.demo.service.RegistService;

@Service
public class RegistServiceMock implements RegistService {

	@Override
	public String regist() {

		return "テスト的に動いたらしいよ。";
	}

}
