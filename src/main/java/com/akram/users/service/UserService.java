package com.akram.users.service;

import java.util.List;

import com.akram.users.entities.Role;
import com.akram.users.entities.User;
import com.akram.users.service.reegister.RegistationRequest;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	
	User registerUser(RegistationRequest request);
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);


}