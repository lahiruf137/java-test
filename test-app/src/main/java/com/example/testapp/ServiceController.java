package com.example.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class ServiceController {
	
	@Autowired
	private String getMessage;
	
	@ResponseBody
	@GetMapping
	public String p1() {
		return this.getMessage;
	}

}
