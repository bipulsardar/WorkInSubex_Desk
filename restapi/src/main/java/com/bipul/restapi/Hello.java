package com.bipul.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController

public class Hello {
	@GetMapping("/bipul")
	public String hello()
	{
		return "Hello World";
	}
	
}
