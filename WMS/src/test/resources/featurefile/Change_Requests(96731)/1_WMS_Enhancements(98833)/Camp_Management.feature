@Camp_Management
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

  