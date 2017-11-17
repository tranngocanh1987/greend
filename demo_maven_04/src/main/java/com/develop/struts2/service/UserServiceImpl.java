package com.develop.struts2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.develop.struts2.dao.UserDao;
import com.develop.struts2.model.User;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class UserServiceImpl implements UserService{

	 @Autowired
	 private UserDao dao;
	 
	public void saveUser(User user) {
		dao.saveUser(user);	
	}

	public List<User> getUserList() {
		return dao.getUserList();
	}

	public void updateUser(User user) {
		dao.updateUser(user);	
	}

	public List<User> searchUsers(String username) {
		return dao.searchUser(username);
	}

}
