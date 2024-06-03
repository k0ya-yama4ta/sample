package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String rootIndex() {
		return "index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	

}
