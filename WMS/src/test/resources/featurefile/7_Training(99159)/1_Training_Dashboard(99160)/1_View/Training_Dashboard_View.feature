@Training_Dashboard
Feature: Feature : Training (99159) UserStory : Workman Basic Details (99160)
  *********************************************
  UserStory: Training (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Create workman Training
  ******************************************************************************************

  @Training_Dashboard_ViewTrainings
  Scenario: Training Dashboard View
    Description :  As a EIP User i should be able to View Workmen Training from Dashboard

    Given Login as Training Creator and Navigate to Training
    Then Verify user can be able to select IC
    Then Verify user can be able to select SBG
    Then Verify user can be able to select BU
    Then Verify user can be able to select Cluster
    Then Verify user can be able to select Job
    Then Verify user can be able to select Date
