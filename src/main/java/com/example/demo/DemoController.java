package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	@GetMapping("/")
	public String home()
	{
		return "<h3 align='center'>Welcome to Sample Web Page Deployed on Railway</h3>";
	}
	
	@GetMapping("add/{a}/{b}")
	public String add(@PathVariable int a, @PathVariable int b)
	{
		return Integer.toString(a+b);
	}
	
}
