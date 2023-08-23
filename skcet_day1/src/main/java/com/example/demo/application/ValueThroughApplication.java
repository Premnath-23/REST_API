package com.example.demo.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueThroughApplication {
	
	@Value(value="${nameMe}")
	public String StudentName;
	
	@Value("23")
	public int regNum;
	
	@Value(value="${age:20}")
	public int age;
	
	@GetMapping("/show")
	public String displaystudent()
	{
		return "My name is "+StudentName +" and Register number is "+regNum+ " and my age is "+age;
	}
}
