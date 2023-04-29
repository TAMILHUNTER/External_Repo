@Induction_Wage_Validation
Feature: Feature : Induction (89564) UserStory: Wage (89585)
  *********************************************
  UserStory: Wage (89585)
  *********************************************
  Description : As a EIP User i should be able to Validate Wage Fields
  ******************************************************************************************

  @Induction_Wage_Create_no_input
  Scenario: Verify User can be able to Validate wage fields with no input
    Given Login and Navigate to Wage
    Then Verify user can be able to select workmen profile for Wage Validation
    Then Verify user can be able to Validate Basic Earnings with no input
    #Issue Report
    #Then Verify user can be able to Validate HRA Earnings with no input
    #Then Verify user can be able to Validate other allowance Reason with no input
    #Then Verify user can be able to Validate other allowance with dependent not selected
    Then Verify user can be able to Validate other allowance Value with no input
    #Issue Report
    #Then Verify user can be able to Validate if PF Deduction is enabled
    #Then Verify user can be able to Validate if ESI Deduction is enabled
    #Then Verify user can be able to Validate if Professional Tax Deduction is enabled
    #Then Verify user can be able to Validate other recoveries Reason with no input
    #Then Verify user can be able to Validate other recoveries with dependent not selected
    Then Verify user can be able to Validate other recoveries with no input

  @Induction_Wage_Create_With_multipleInput
  Scenario: Verify User can be able to Validate wage fields with Numeric,alphabets,Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to Wage
    Then Verify user can be able to select workmen profile for Wage Validation
    #Issue Report
    Then Verify user can be able to Validate Basic Earnings with max numeric input
    Then Verify user can be able to Validate Basic Earnings with alphabets input
    Then Verify user can be able to Validate Basic Earnings with Special Charecters input
    Then Verify user can be able to Validate HRA Earnings with max numeric input
    Then Verify user can be able to Validate HRA Earnings with alphabets input
    Then Verify user can be able to Validate HRA Earnings with Special Charecters input
    Then Verify user can be able to Validate other allowance with max numeric input
    Then Verify user can be able to Validate other allowance with alphabets input
    Then Verify user can be able to Validate other allowance with Special Charecters input
    Then Verify user can be able to Validate PF Deduction with max numeric input
    Then Verify user can be able to Validate PF Deduction with alphabets input
    Then Verify user can be able to Validate PF Deduction with Special Charecters input
    Then Verify user can be able to Validate if ESI Deduction with max numeric input
    Then Verify user can be able to Validate if ESI Deduction with alphabets input
    Then Verify user can be able to Validate if ESI Deduction with Special Charecters input
    Then Verify user can be able to Validate if Professional Tax Deduction with max numeric input
    Then Verify user can be able to Validate if Professional Tax Deduction with alphabets input
    Then Verify user can be able to Validate if Professional Tax Deduction with Special Charecters input
    Then Verify user can be able to Validate other recoveries with max numeric input
    Then Verify user can be able to Validate other recoveries with alphabets input
    Then Verify user can be able to Validate other recoveries with Special Charecters input
