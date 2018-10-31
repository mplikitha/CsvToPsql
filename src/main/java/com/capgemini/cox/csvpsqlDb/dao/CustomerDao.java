package com.capgemini.cox.csvpsqlDb.dao;

import java.util.List;

import com.capgemini.cox.csvpsqlDb.model.Customer;

public interface CustomerDao {
	public void insert(List<? extends Customer> customers);
	List<Customer> loadAllCustomers();
}
