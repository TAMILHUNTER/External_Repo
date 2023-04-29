@Gate_Pass_Status_update_Validation
Feature: Feature : On-Boarding & Attendance (89575) UserStory: Gate_Pass_Status_update (89603)
  **********************************************************************************************
  UserStory: Gate_Pass_Status_update (89603)
  *********************************************
  Description : As a EIP User i should be able to validate Gate Pass fields
  ***************************************************************************************************************************************

  @GatePass_Blacklist
  Scenario: Verify user can be able to Blacklist Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Blacklist Workmen without reason

  @GatePass_Generate_Print
  Scenario: Verify user can be able to Generate Print
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to validate Generate Print from Date field
    Then Verify User can be able to validate Generate Print To Date field
    Then Verify User can be able to validate TimeKeeper field