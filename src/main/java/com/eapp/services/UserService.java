package com.eapp.services;

import java.util.Optional;

import com.eapp.entity.UserDetails;

public interface UserService {

	UserDetails getUserById(long id);

	UserDetails createUser(UserDetails user);

	UserDetails updateUser(UserDetails user);

	Optional<UserDetails> findUserByUsernameAndPassword(String username, String password);

}
