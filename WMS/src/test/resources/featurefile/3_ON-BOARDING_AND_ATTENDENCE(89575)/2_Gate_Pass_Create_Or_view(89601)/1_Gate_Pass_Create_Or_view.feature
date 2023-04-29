@Gate_Pass_Create_Or_view
Feature: Feature : On-Boarding & Attendance (89575) UserStory: Gate Pass - Create / view (89601)
  **********************************************************************************************
  UserStory: Gate Pass - Create / view (89601)
  *********************************************
  Description : As a EIP User i should be able to Create / View Workmen Gate Pass
  ***************************************************************************************************************************************

  @GatePass_Search_Workmen
  Scenario: Verify user can be able to search Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to search Workmen Profile Gate Pass
    Then Verify User can be able to View Workmen profile Gate Pass

  @GatePass_Issue
  Scenario: Verify user can be able to Issue Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Issue Gate Pass

  @GatePass_Load
  Scenario: Verify user can be able to Issue Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to load more workmen profile by clicking Load more option
  