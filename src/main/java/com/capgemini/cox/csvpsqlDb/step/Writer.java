package com.capgemini.cox.csvpsqlDb.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.capgemini.cox.csvpsqlDb.dao.JiraCSVDao;
import com.capgemini.cox.csvpsqlDb.model.JiraCSV;


public class Writer implements ItemWriter<JiraCSV> {

	private final JiraCSVDao customerDao;

	public Writer(JiraCSVDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void write(List<? extends JiraCSV> customers) throws Exception {
		customerDao.insert(customers);
	}

}
