package com.example.demo.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class Helloservice {
	@Value("name")//value is from properties file
	String strMessage;
	String port;
	@Autowired//is a refernce to properties file
	Environment environment;
	@GetMapping
	public  String welcome(){
		String port=environment.getProperty("server.port");
		//return "Programming Microservices "+strMessage;
		return "Programming Microservices "+port;
		
	}
	@GetMapping("/status")
	public String status() {
		return "up and running->>";
	}
}
