package com.capgemini.cox.csvpsqlDb.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.capgemini.cox.csvpsqlDb.dao.CustomerDao;
import com.capgemini.cox.csvpsqlDb.model.Customer;


public class Writer implements ItemWriter<Customer> {

	private final CustomerDao customerDao;

	public Writer(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void write(List<? extends Customer> customers) throws Exception {
		customerDao.insert(customers);
	}

}
