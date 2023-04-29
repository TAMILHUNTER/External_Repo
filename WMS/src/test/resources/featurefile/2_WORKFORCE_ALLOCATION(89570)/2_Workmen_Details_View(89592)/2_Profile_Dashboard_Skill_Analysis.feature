@Workforce_Allocation_Workman_Profile_Skill_Analysis
Feature: Feature : Workforce Allocation (89570) UserStory: Workmen Skill Details View (89592)
  **********************************************************************************************
  UserStory: Workmen Details View (89592)
  *********************************************
  Description : As a EIP User i should be able to View Details of Workman in Profile from Dashboard by searching them
  						Workmen profile include the details such as Basic Details, SkillAnalysis, Medical Test, EHS & Wage.
  ***************************************************************************************************************************************

  @Workforce_Allocation_Workman_Profile_Dashboard_Skill_Analysis_Details
  Scenario: Verify Medical Details displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Skill Description in Skill Analysis are displayed correctly in profile
    Then verify Project Description in Skill Analysis are displayed correctly in profile
    Then verify Skill in Skill Analysis are displayed correctly in profile
    Then verify Percentage in Skill Analysis are displayed correctly in profile
    Then verify Test Taken on in Skill Analysis are displayed correctly in profile
    Then verify Status in Skill Analysis are displayed correctly in profile
    Then verify Restest Date in Skill Analysis are displayed correctly in profile
