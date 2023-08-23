package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test_1 {
	
	@Value("23")
	public int regNum;
	
	@Value("PREMNATH S")
	public String name;
	
	@RequestMapping("/dp")
	public String display()
	{
		return "My name is "+ name +" and Register number is "+regNum;
	}
}
