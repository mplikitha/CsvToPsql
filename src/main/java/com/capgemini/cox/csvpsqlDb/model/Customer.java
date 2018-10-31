package com.capgemini.cox.csvpsqlDb.model;

public class Customer {

	
	private String priority;
	private String issue_key;
	private String issue_id;
	private String summary;
	private String status;
	private String created;
	private String custom_field_start_date;
	private String resolved;
	private String custom_field_Onshore_Offshore;
	private String custom_field_COX_Candidate_Level;
	private String custom_field_COX_Capgemini_Lead;
	private String custom_field_COX_Hiring_Manager;
	private String custom_field_COX_Role_Skillset;
	private String custom_field_COX_Tier_Level;
	private String custom_field_Position_Backfill_New;
	private String custom_field_Cap_SL_BU;
	private String custom_field_Opportunity_Stage;
	private String custom_field_COR;
	private String custom_field_COX_COR;

	public Customer() {
		
	}

	public Customer(String priority, String issue_key, String issue_id, String summary, String status, String created,
			String custom_field_start_date, String resolved, String custom_field_Onshore_Offshore,
			String custom_field_COX_Candidate_Level, String custom_field_COX_Capgemini_Lead,
			String custom_field_COX_Hiring_Manager, String custom_field_COX_Role_Skillset,
			String custom_field_COX_Tier_Level, String custom_field_Position_Backfill_New,
			String custom_field_Cap_SL_BU, String custom_field_Opportunity_Stage, String custom_field_COR,
			String custom_field_COX_COR) {
		this.priority = priority;
		this.issue_key = issue_key;
		this.issue_id = issue_id;
		this.summary = summary;
		this.status = status;
		this.created = created;
		this.custom_field_start_date = custom_field_start_date;
		this.resolved = resolved;
		this.custom_field_Onshore_Offshore = custom_field_Onshore_Offshore;
		this.custom_field_COX_Candidate_Level = custom_field_COX_Candidate_Level;
		this.custom_field_COX_Capgemini_Lead = custom_field_COX_Capgemini_Lead;
		this.custom_field_COX_Hiring_Manager = custom_field_COX_Hiring_Manager;
		this.custom_field_COX_Role_Skillset = custom_field_COX_Role_Skillset;
		this.custom_field_COX_Tier_Level = custom_field_COX_Tier_Level;
		this.custom_field_Position_Backfill_New = custom_field_Position_Backfill_New;
		this.custom_field_Cap_SL_BU = custom_field_Cap_SL_BU;
		this.custom_field_Opportunity_Stage = custom_field_Opportunity_Stage;
		this.custom_field_COR = custom_field_COR;
		this.custom_field_COX_COR = custom_field_COX_COR;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getIssue_key() {
		return issue_key;
	}

	public void setIssue_key(String issue_key) {
		this.issue_key = issue_key;
	}

	public String getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(String issue_id) {
		this.issue_id = issue_id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getCustom_field_start_date() {
		return custom_field_start_date;
	}

	public void setCustom_field_start_date(String custom_field_start_date) {
		this.custom_field_start_date = custom_field_start_date;
	}

	public String getResolved() {
		return resolved;
	}

	public void setResolved(String resolved) {
		this.resolved = resolved;
	}

	public String getCustom_field_Onshore_Offshore() {
		return custom_field_Onshore_Offshore;
	}

	public void setCustom_field_Onshore_Offshore(String custom_field_Onshore_Offshore) {
		this.custom_field_Onshore_Offshore = custom_field_Onshore_Offshore;
	}

	public String getCustom_field_COX_Candidate_Level() {
		return custom_field_COX_Candidate_Level;
	}

	public void setCustom_field_COX_Candidate_Level(String custom_field_COX_Candidate_Level) {
		this.custom_field_COX_Candidate_Level = custom_field_COX_Candidate_Level;
	}

	public String getCustom_field_COX_Capgemini_Lead() {
		return custom_field_COX_Capgemini_Lead;
	}

	public void setCustom_field_COX_Capgemini_Lead(String custom_field_COX_Capgemini_Lead) {
		this.custom_field_COX_Capgemini_Lead = custom_field_COX_Capgemini_Lead;
	}

	public String getCustom_field_COX_Hiring_Manager() {
		return custom_field_COX_Hiring_Manager;
	}

	public void setCustom_field_COX_Hiring_Manager(String custom_field_COX_Hiring_Manager) {
		this.custom_field_COX_Hiring_Manager = custom_field_COX_Hiring_Manager;
	}

	public String getCustom_field_COX_Role_Skillset() {
		return custom_field_COX_Role_Skillset;
	}

	public void setCustom_field_COX_Role_Skillset(String custom_field_COX_Role_Skillset) {
		this.custom_field_COX_Role_Skillset = custom_field_COX_Role_Skillset;
	}

	public String getCustom_field_COX_Tier_Level() {
		return custom_field_COX_Tier_Level;
	}

	public void setCustom_field_COX_Tier_Level(String custom_field_COX_Tier_Level) {
		this.custom_field_COX_Tier_Level = custom_field_COX_Tier_Level;
	}

	public String getCustom_field_Position_Backfill_New() {
		return custom_field_Position_Backfill_New;
	}

	public void setCustom_field_Position_Backfill_New(String custom_field_Position_Backfill_New) {
		this.custom_field_Position_Backfill_New = custom_field_Position_Backfill_New;
	}

	public String getCustom_field_Cap_SL_BU() {
		return custom_field_Cap_SL_BU;
	}

	public void setCustom_field_Cap_SL_BU(String custom_field_Cap_SL_BU) {
		this.custom_field_Cap_SL_BU = custom_field_Cap_SL_BU;
	}

	public String getCustom_field_Opportunity_Stage() {
		return custom_field_Opportunity_Stage;
	}

	public void setCustom_field_Opportunity_Stage(String custom_field_Opportunity_Stage) {
		this.custom_field_Opportunity_Stage = custom_field_Opportunity_Stage;
	}

	public String getCustom_field_COR() {
		return custom_field_COR;
	}

	public void setCustom_field_COR(String custom_field_COR) {
		this.custom_field_COR = custom_field_COR;
	}

	public String getCustom_field_COX_COR() {
		return custom_field_COX_COR;
	}

	public void setCustom_field_COX_COR(String custom_field_COX_COR) {
		this.custom_field_COX_COR = custom_field_COX_COR;
	}
}
