@DLR
Feature: Daily labour Record (DLR) 
  *********************************************
  Description :  Verify User can be able to Track Daily Labour Record
  ************************************************

  @Navigate_To_DLR
  Scenario: Verify User can be able to Navigate to DLR
    Description :  As a EIP User i should be able to Navigate DLR Page

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Navigate to DLR from Dashboard Workmen Search

  @DLR_View
  Scenario: Verify User can be able to View DLR for selected Job
    Description :  As a EIP User i should be able to View DLR for Selected Job

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Selecting Current job for DLR Entery
    Then Selecting Date for DLR Entery
    Then Searching DLR Entery For Job

  @DLR_Entry
  Scenario: Verify User can be able to Enter DLR for Job
    Description :  As a EIP User i should be able to Enter DLR for Job

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Selecting Current job for DLR Entery
    Then Selecting Date for DLR Entery
    Then Enter DLR Entry for Day shift Workmen
    Then Enter DLR Entry for Night shift Workmen
    Then DLR Entry Total Calculated Correctly
    Then Enter DLR Breakup Workmen Strenght
    Then Enter DLR Breakup Workmen at site
    Then Enter DLR Breakup Workmen Inducted
    Then Enter DLR Breakup Workmen Released
    Then Enter DLR Breakup Workmen Expected to Released
    Then Enter DLR Breakup Workmen Under Quarantine
    Then Enter DLR Breakup Workmen Affected by Covid
    Then DLR Breakup Calculated Correctly
    Then Verify User can be able to Save DLR Entry
