package com.develop.struts2.utils;

import java.util.ArrayList;
import java.util.List;

import com.develop.struts2.bean.CustomerBean;
import com.develop.struts2.model.Customer;


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
}
