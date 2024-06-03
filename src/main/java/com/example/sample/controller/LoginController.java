package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sample.repo.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class LoginController {
	
	private final UserRepository userRepository;

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
	
}
