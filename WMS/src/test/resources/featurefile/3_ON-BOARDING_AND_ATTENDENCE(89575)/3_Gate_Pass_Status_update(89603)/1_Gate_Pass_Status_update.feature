@Gate_Pass_Status_update
Feature: Feature : On-Boarding & Attendance (89575) UserStory: Gate_Pass_Status_update (89603)
  **********************************************************************************************
  UserStory: Gate_Pass_Status_update (89603)
  *********************************************
  Description : As a EIP User i should be able to Create / View Workmen Gate Pass
  ***************************************************************************************************************************************

  @GatePass_Renewal
  Scenario: Verify user can be able to Renew Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Renew Gate Pass No Records
    Then Verify User can be able to Renew Gate Pass With Records

  @GatePass_Blacklist
  Scenario: Verify user can be able to Blacklist Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Blacklist Workmen

  @GatePass_Temporary_Release
  Scenario: Verify user can be able to Temporary Release Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Temporary Release Workmen

  @GatePass_Permanent_Release
  Scenario: Verify user can be able to Permanent Release Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Permanent Release Workmen

  #@GatePass_Generate_Print
  #Scenario: Verify user can be able to Generate Print
    #Given Login and Navigate to Gate Pass
    #Then Verify User can be able to Generate Print  # Not Feasibile 
