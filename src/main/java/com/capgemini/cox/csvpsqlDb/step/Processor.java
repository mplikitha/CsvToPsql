package com.capgemini.cox.csvpsqlDb.step;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.capgemini.cox.csvpsqlDb.model.JiraCSV;


public class Processor implements ItemProcessor<JiraCSV, JiraCSV> {

	private static final Logger log = LoggerFactory.getLogger(Processor.class);

	@Override
	public JiraCSV process(JiraCSV customer) throws Exception {
		final String priority = customer.getPriority();
		final String issue_key = customer.getIssue_key();
		final int issue_id = customer.getIssue_id();
		final String summary = customer.getSummary();
		final String status = customer.getStatus();
		final String created = customer.getCreated();
		final String custom_field_start_date = customer.getCustom_field_start_date();
		final String resolved = customer.getResolved();
		final String custom_field_Onshore_Offshore = customer.getCustom_field_Onshore_Offshore();
		final String custom_field_COX_Candidate_Level = customer.getCustom_field_COX_Candidate_Level();
		final String custom_field_COX_Capgemini_Lead = customer.getCustom_field_COX_Capgemini_Lead();
		final String custom_field_COX_Hiring_Manager = customer.getCustom_field_COX_Hiring_Manager();
		final String custom_field_COX_Role_Skillset = customer.getCustom_field_COX_Role_Skillset();
		final String custom_field_COX_Tier_Level = customer.getCustom_field_COX_Tier_Level();
		final String custom_field_Position_Backfill_New = customer.getCustom_field_Position_Backfill_New();
		final String custom_field_Cap_SL_BU = customer.getCustom_field_Cap_SL_BU();
		final String custom_field_Opportunity_Stage = customer.getCustom_field_Opportunity_Stage();
		final String custom_field_COR = customer.getCustom_field_COR();
		final String custom_field_COX_COR = customer.getCustom_field_COX_COR();
		//final Date imported_at = customer.getImported_at();
		final JiraCSV fixedCustomer = new JiraCSV(priority, issue_key, issue_id, summary, status, created,
				custom_field_start_date, resolved, custom_field_Onshore_Offshore, custom_field_COX_Candidate_Level,
				custom_field_COX_Capgemini_Lead, custom_field_COX_Hiring_Manager, custom_field_COX_Role_Skillset,
				custom_field_COX_Tier_Level, custom_field_Position_Backfill_New, custom_field_Cap_SL_BU,
				custom_field_Opportunity_Stage, custom_field_COR, custom_field_COX_COR);

		log.info("Converting (" + customer + ") into (" + fixedCustomer + ")");

		return fixedCustomer;
	}
}
