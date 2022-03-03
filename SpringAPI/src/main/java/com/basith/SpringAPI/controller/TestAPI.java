package com.basith.SpringAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestAPI {

	@GetMapping("check")
	public String test() {
		return "working";
	}
	
	
}
