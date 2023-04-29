@Workforce_Allocation_Workman_Profile_EHS
Feature: Feature : Workforce Allocation (89570) UserStory: Workmen EHS Details View (89592)
  **********************************************************************************************
  UserStory: Workmen Details View (89592)
  *********************************************
  Description : As a EIP User i should be able to View Details of Workman in Profile from Dashboard by searching them
  						Workmen profile include the details such as Basic Details, SkillAnalysis, Medical Test, EHS & Wage.
  ***************************************************************************************************************************************

  @Workforce_Allocation_Workman_Profile_Dashboard_EHS_Details
  Scenario: Verify EHS Details displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Skill Description in EHS are displayed correctly in profile
    Then verify job in EHS are displayed correctly in profile
    Then verify Training Date in EHS are displayed correctly in profile
