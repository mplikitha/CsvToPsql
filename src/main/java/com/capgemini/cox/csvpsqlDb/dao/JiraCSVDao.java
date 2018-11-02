package com.capgemini.cox.csvpsqlDb.dao;

import java.util.List;

import com.capgemini.cox.csvpsqlDb.model.JiraCSV;

public interface JiraCSVDao {
	public void insert(List<? extends JiraCSV> customers);
	List<JiraCSV> loadAllCustomers();
}
