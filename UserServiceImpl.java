package com.eapp.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eapp.dao.UserDetailsDAO;
import com.eapp.entity.UserDetails;

@Component
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDetailsDAO userDetailsDAO;
	
	@Override
	public UserDetails getUserById(long id){
		return userDetailsDAO.get(UserDetails.class, id);
	}
	
	@Override
	public UserDetails createUser(UserDetails user){
		return userDetailsDAO.create(user);
	}
	
	@Override 
	public UserDetails updateUser(UserDetails user){
		return userDetailsDAO.update(user);
	}
	
	@Override 
	public Optional<UserDetails> findUserByUsernameAndPassword(String username, String password){
		Map<String, Object> params = new HashMap<>();
		params.put("username", username);
		params.put("password", password);	
		Optional<UserDetails> user = userDetailsDAO.findFirstByNamedQuery(UserDetails.FIND_USER_BY_USERNAME_AND_PASSWORD, params );
		return user;
	}
}
