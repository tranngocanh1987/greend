package com.develop.struts2.service;

import java.util.List;

import com.develop.struts2.model.User;

public interface UserService {
	void saveUser(User user);
	void updateUser(User user); 
	List<User> getUserList();
	List<User> searchUsers(String username);
}
