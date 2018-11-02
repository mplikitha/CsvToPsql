DROP TABLE IF EXISTS jiracsv;

CREATE TABLE jiracsv  (
    priority VARCHAR(200),
    issue_key VARCHAR(200),
    issue_id INT NOT NULL,
    summary VARCHAR(200),
    status VARCHAR(200),
    created VARCHAR(200),
    custom_field_start_date VARCHAR(200),
    resolved VARCHAR(200),
    custom_field_Onshore_Offshore VARCHAR(200),
    custom_field_COX_Candidate_Level VARCHAR(200),
    custom_field_COX_Capgemini_Lead VARCHAR(200),
    custom_field_COX_Hiring_Manager VARCHAR(200),
    custom_field_COX_Role_Skillset VARCHAR(200),
    custom_field_COX_Tier_Level VARCHAR(200),
    custom_field_Position_Backfill_New VARCHAR(200),
    custom_field_Cap_SL_BU VARCHAR(200),
    custom_field_Opportunity_Stage VARCHAR(200),
    custom_field_COR VARCHAR(200),
    custom_field_COX_COR VARCHAR(200),
     created_at TIMESTAMPTZ NOT NULL DEFAULT NOW()
);