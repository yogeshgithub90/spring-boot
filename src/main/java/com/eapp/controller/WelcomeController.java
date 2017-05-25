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
	
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/weather")
	public String weather(Map<String, Object> model) {
		model.put("message", this.message);
		return "weather";
	}
	
	@RequestMapping("/who")
	public String who(Map<String, Object> model) {
		model.put("message", this.message);
		return "who";
	}
	
	@RequestMapping("/test1")
	public String test1(Map<String, Object> model) {
		model.put("message", this.message);
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2(Map<String, Object> model) {
		model.put("message", this.message);
		return "test2";
	}

}
