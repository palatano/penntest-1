package com.example.nctesting1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
public class DemoApplication {

	/*
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	} */

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}
}
