package com.eapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/weather")
	public String weather(Map<String, Object> model) {
		model.put("message", this.message);
		return "weather";
	}
	
	@RequestMapping("/health")
	public String who(Map<String, Object> model) {
		model.put("message", this.message);
		return "health";
	}
	
	@RequestMapping("/horoscope")
	public String test1(Map<String, Object> model) {
		model.put("message", this.message);
		return "horoscope";
	}
	
	@RequestMapping("/technology")
	public String test2(Map<String, Object> model) {
		model.put("message", this.message);
		return "technology";
	}

}
