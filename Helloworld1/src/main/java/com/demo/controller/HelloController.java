package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloworld")
	 public String hello(){
		return "Hi Hello World1";
			
	}
	@RequestMapping("/helloworld1")
	 public String hello1(){
		return "Hi Hello World2";
			
	}
	
}