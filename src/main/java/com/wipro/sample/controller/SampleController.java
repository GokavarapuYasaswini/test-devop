package com.wipro.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController
{
	
	@GetMapping("/")
	public String getMessage() 
	{
		return "Welcome ...deployment success!!";
	}


}
