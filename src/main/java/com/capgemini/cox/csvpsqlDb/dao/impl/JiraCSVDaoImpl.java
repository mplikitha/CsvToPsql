package com.capgemini.cox.csvpsqlDb.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.capgemini.cox.csvpsqlDb.dao.JiraCSVDao;
import com.capgemini.cox.csvpsqlDb.model.JiraCSV;

@Repository
public class JiraCSVDaoImpl extends JdbcDaoSupport implements JiraCSVDao {
	private static final Logger log = LoggerFactory.getLogger(JiraCSVDaoImpl.class);
	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public void insert(List<? extends JiraCSV> Customers) {
		String sql = "INSERT INTO jiracsv "
				+ "( priority, issue_key, issue_id, summary, status, created, custom_field_start_date, resolved, custom_field_Onshore_Offshore, custom_field_COX_Candidate_Level, custom_field_COX_Capgemini_Lead, custom_field_COX_Hiring_Manager, custom_field_COX_Role_Skillset,custom_field_COX_Tier_Level, custom_field_Position_Backfill_New, custom_field_Cap_SL_BU,custom_field_Opportunity_Stage, custom_field_COR, custom_field_COX_COR) VALUES ( ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				JiraCSV customer = Customers.get(i);
//				ps.setLong(1, customer.getId());
				ps.setString(1, customer.getPriority());
				ps.setString(2, customer.getIssue_key());
				ps.setInt(3, customer.getIssue_id());
				ps.setString(4, customer.getSummary());
				ps.setString(5, customer.getStatus());
				ps.setString(6, customer.getCreated());
				ps.setString(7, customer.getCustom_field_start_date());
				ps.setString(8, customer.getResolved());
				ps.setString(9, customer.getCustom_field_Onshore_Offshore());
				ps.setString(10, customer.getCustom_field_COX_Candidate_Level());
				ps.setString(11, customer.getCustom_field_COX_Capgemini_Lead());
				ps.setString(12, customer.getCustom_field_COX_Hiring_Manager());
				ps.setString(13, customer.getCustom_field_COX_Role_Skillset());
				ps.setString(14, customer.getCustom_field_COX_Tier_Level());
				ps.setString(15, customer.getCustom_field_Position_Backfill_New());
				ps.setString(16, customer.getCustom_field_Cap_SL_BU());
				ps.setString(17, customer.getCustom_field_Opportunity_Stage());
				ps.setString(18, customer.getCustom_field_COR());
				ps.setString(19, customer.getCustom_field_COX_COR());
			}

			public int getBatchSize() {
				return Customers.size();
			}
		});

	}

	@Override
	public List<JiraCSV> loadAllCustomers() {
		String sql = "SELECT * FROM jiracsv";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<JiraCSV> result = new ArrayList<JiraCSV>();
		for (Map<String, Object> row : rows) {
			JiraCSV customer = new JiraCSV();
//			customer.setId((int) row.get("id"));
			customer.setPriority((String) row.get("Priority"));
			customer.setIssue_key((String) row.get("Issue_key"));
//			customer.setIssue_id((int) row.get("Issue_id"));
			customer.setSummary((String) row.get("Summary"));
			customer.setStatus((String) row.get("Status"));
			customer.setCreated((String) row.get("Created"));
			customer.setCustom_field_start_date((String) row.get("Custom_field_start_date"));
			customer.setResolved((String) row.get("Resolved"));
			customer.setCustom_field_Onshore_Offshore((String) row.get("Custom_field_Onshore_Offshore"));
			customer.setCustom_field_COX_Candidate_Level((String) row.get("Custom_field_COX_Candidate_Level"));
			customer.setCustom_field_COX_Capgemini_Lead((String) row.get("Custom_field_COX_Capgemini_Lead"));
			customer.setCustom_field_COX_Hiring_Manager((String) row.get("Custom_field_COX_Hiring_Manager"));
			customer.setCustom_field_COX_Role_Skillset((String) row.get("Custom_field_COX_Role_Skillset"));
			customer.setCustom_field_COX_Tier_Level((String) row.get("Custom_field_COX_Tier_Level"));
			customer.setCustom_field_Position_Backfill_New((String) row.get("Custom_field_Position_Backfill_New"));
			customer.setCustom_field_Cap_SL_BU((String) row.get("Custom_field_Cap_SL_BU"));
			customer.setCustom_field_Opportunity_Stage((String) row.get("Custom_field_Opportunity_Stage"));
			customer.setCustom_field_COR((String) row.get("Custom_field_COR"));
			customer.setCustom_field_COX_COR((String) row.get("Custom_field_COX_COR"));
			result.add(customer);
		}
		for (JiraCSV results : result) {
			log.info("Found <" + results + "> in the database.");
		}
		return result;
	}
}
