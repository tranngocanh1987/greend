package com.develop.struts2.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.develop.struts2.bean.CustomerBean;
import com.develop.struts2.bean.UserBean;
import com.develop.struts2.service.UserService;
import com.develop.struts2.utils.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<UserBean> {

	private static final long serialVersionUID = 1L;
	@Autowired
	private UserBean bean;
	@Autowired
	private UserService service;
	private List<UserBean> users;

	public String execute() {
		users = CommonUtility.createUserBeanList(service.getUserList());
		return "user";
	}

	public String addUser() {
		service.saveUser(CommonUtility.createUserModel(bean));
		users = CommonUtility.createUserBeanList(service.getUserList());
		return "addUser";
	}

	public String listUser() {
		users = CommonUtility.createUserBeanList(service.getUserList());
		return "users";
	}
	
	public String updateUser()
	{
		service.updateUser(CommonUtility.createUserModel(bean));
		users = CommonUtility.createUserBeanList(service.getUserList());
		return "updateUser";
	}
	
	public String searchUser() {
		users = CommonUtility.createUserBeanList(service.searchUsers(bean.getUsername()));
		return "searchUser";
	}

	public UserBean getModel() {
		return bean;
	}

	public List<UserBean> getUsers() {
		return users;
	}

	public void setUsers(List<UserBean> users) {
		this.users = users;
	}

}
