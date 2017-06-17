package com.eapp.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eapp.entity.Address;
import com.eapp.entity.UserDetails;
import com.eapp.services.AddressService;
import com.eapp.services.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String registerPage(){
		return "register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String saveNewUser(@RequestParam("name") String name,  @RequestParam("address") String address,
			@RequestParam("username") String username, @RequestParam("password") String password) {
		Address addressObj = addressService.create(createAddress(address));
		UserDetails user = createUser(name, "employee", username, password);
		user.setAddresses(addressObj);
		userService.createUser(user);
		return "login";
	} 
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String loginUser(Map<String, Object> map, @RequestParam("username") String username, @RequestParam("password") String password){
		Optional<UserDetails> user = userService.findUserByUsernameAndPassword(username, password);
		if (user.isPresent()) {
			map.put("userDto", user.get());
			return "home";
		}
		map.put("message", "The details dont match with our records, please login again.");
		return "login";
	}
	
	private UserDetails createUser(String name, String role, String username, String password){
		UserDetails user = new UserDetails(name, role, username, password);
		return user;
	}
	
	private Address createAddress(String address){
		Address adress = new Address(address);
		return adress;
	}
}
