@Induction_SkillAnalysis_Create
Feature: Feature : Induction (89564) UserStory: Skill Analysis (89580)
  *********************************************
  UserStory: Skill Analysis (89580)
  *********************************************
  Description : As a EIP User i should be able to Enter Skill Details of a workmen
  ******************************************************************************************

  @Induction_SkillAnalysis_Create_Random
  Scenario: Verify User can be Perform Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Search Workmen Profile SkillAnalysis
    Then Verify User can be able to View Workmen profile
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify User can be able to select workmen and Proceed to Skill Test Manual
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    #Then Verify User can be able to upload Manual Test Documents
    Then Verify User can be able to Accept or Reject Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    #Then Verify User can be able to add attachment
    Then Verify User can be able to view Workmen profile table

  #Then Verify User can be able to remove record
  @Induction_SkillAnalysis_Create_Accept
  Scenario: Verify User can be able to approve Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    Then Verify User can be able to Accept Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    Then Verify User can be able to view Workmen profile table

  @Induction_SkillAnalysis_Create_Reject
  Scenario: Verify User can be able to Reject Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    Then Verify User can be able to Reject Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    Then Verify User can be able to view Workmen profile table


@Induction_SkillAnalysis_Remove_record
  Scenario: Verify User can be able to remove record from Skill Analysis list
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select multiple workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    Then Verify User can be able to remove record

