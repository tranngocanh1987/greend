package com.develop.struts2.utils;

import java.util.ArrayList;
import java.util.List;

import com.develop.struts2.bean.CustomerBean;
import com.develop.struts2.bean.UserBean;

import com.develop.struts2.model.Customer;
import com.develop.struts2.model.User;


public class CommonUtility {

	public static Customer createModel(CustomerBean customerBean) {
		Customer customer = new Customer();
		customer.setTypeId(customerBean.getTypeID());
		customer.setTypeName(customerBean.getTyeName());
		customer.setDescription(customerBean.getDescription());
		customer.setRecordStat(customerBean.getRecordStat());
		return customer;
	}

	public static List<CustomerBean> createCustomerBeanList(List<Customer> customers) {
		List<CustomerBean> beans = new ArrayList<CustomerBean>();
		CustomerBean bean = null;
		for (Customer customer : customers) {
			bean = new CustomerBean();
			bean.setTypeID(customer.getTypeId());
			bean.setTypeName(customer.getTypeName());
			bean.setDescription(customer.getDescription());
			bean.setRecordStat(customer.getRecordStat());

			beans.add(bean);
		}
		return beans;

	}
	

	public static User createUserModel(UserBean userBean) {
		User user = new User();
		
		user.setId(userBean.getId());
		user.setUsername(userBean.getUsername());
		user.setPassword(userBean.getPassword());
		user.setEnable(userBean.isEnable());
		user.setCustType(userBean.getCustType());
		user.setAccountNonExpired(userBean.isAccountNonExpired());
		user.setAccountNonLocked(userBean.isAccountNonLocked());
		user.setCredentialsNonExpired(userBean.isCredentialsNonExpired());

		user.setEmail(userBean.getEmail());
		user.setAvatar(userBean.getAvatar());
		user.setMobileNo(userBean.getMobileNo());
		user.setAddress01(userBean.getAddress01());
		user.setAddress02(userBean.getAddress02());
		user.setAddress03(userBean.getAddress03());
		user.setGenderCode(userBean.getGenderCode());
		user.setBirthDay(userBean.getBirthDay());
		user.setHeight(userBean.getHeight());
		user.setWeight(userBean.getWeight());
		user.setReligion(userBean.getReligion());
		user.setImgBehind(userBean.getImgBehind());
		user.setImgFront(userBean.getImgFront());
		user.setStatus(userBean.getStatus());
		
		return user;
	}

	public static List<UserBean> createUserBeanList(List<User> users) {
		List<UserBean> beans = new ArrayList<UserBean>();
		UserBean bean = null;
		for (User user : users) {
			bean = new UserBean();
			
			bean.setId(user.getId());
			bean.setUsername(user.getUsername());
			bean.setPassword(user.getPassword());
			bean.setEnable(user.isEnable());
			bean.setCustType(user.getCustType());
			bean.setAccountNonExpired(user.isAccountNonExpired());
			bean.setAccountNonLocked(user.isAccountNonLocked());
			bean.setCredentialsNonExpired(user.isCredentialsNonExpired());
			
			bean.setEmail(user.getEmail());
			bean.setAvatar(user.getAvatar());
			bean.setMobileNo(user.getMobileNo());
			bean.setAddress01(user.getAddress01());
			bean.setAddress02(user.getAddress02());
			bean.setAddress03(user.getAddress03());
			bean.setGenderCode(user.getGenderCode());
			bean.setBirthDay(user.getBirthDay());
			bean.setHeight(user.getHeight());
			bean.setWeight(user.getWeight());
			bean.setReligion(user.getReligion());
			bean.setImgBehind(user.getImgBehind());
			bean.setImgFront(user.getImgFront());

			beans.add(bean);
		}
		return beans;

	}

}
