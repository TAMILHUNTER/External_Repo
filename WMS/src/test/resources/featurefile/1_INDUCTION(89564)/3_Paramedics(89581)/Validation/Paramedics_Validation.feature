@Induction_Paramedics_Validation
Feature: Feature : Induction (89564) UserStory: Paramedics (89581)
  *********************************************
  UserStory: Paramedics (89581)
  *********************************************
  Description : As a EIP User i should be able to Validate Paramedics fields
  ******************************************************************************************

  @Induction_Paramedics_Create_Validation_With_noInput
  Scenario: Verify User can be Validate Paramedics fields
    Given Login and Navigate to Paramedics
    Then Verify User can be able to Select Workmen Profile for Paramedics
    Then Verify User can be able to Validate Medical Exam Date field with no input
    Then Verify User can be able to Validate Medical Exam Date field with Past Date
    Then Verify User can be able to Validate Medical Exam Date field with Current date
    #Issue Report
    #Then Verify User can be able to Validate SkinTemp field With no input
    #Then Verify User can be able to Validate SPO2 With field no input
    #Then Verify User can be able to Validate Diastolic field With no input
    #Then Verify User can be able to Validate Weight field With no input
    #Then Verify User can be able to Validate Identification Mark1 field With no input

  @Induction_Paramedics_Create_Validation_With_multipleInput
  Scenario: Verify User can be Validate Paramedics fields with Numeric , Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to Paramedics
    Then Verify User can be able to Select Workmen Profile for Paramedics
    Then Verify User can be able to Validate SkinTemp field With max numeric input
    Then Verify User can be able to Validate SkinTemp field With alphabets input
    Then Verify User can be able to Validate SkinTemp field With Special Charecters input
    Then Verify User can be able to Validate Diabetics field With max numeric input
    Then Verify User can be able to Validate Diabetics field With alphabets input
    Then Verify User can be able to Validate Diabetics field With Special Charecters input
    Then Verify User can be able to Validate SPO2 With field with max numeric input
    Then Verify User can be able to Validate SPO2 With field With alphabets input
    Then Verify User can be able to Validate SPO2 With field With Special Charecters input
    Then Verify User can be able to Validate Systolic field With max numeric input
    Then Verify User can be able to Validate Systolic field With alphabets input
    Then Verify User can be able to Validate Systolic field With Special Charecters input
    Then Verify User can be able to Validate Diastolic field With max numeric input
    Then Verify User can be able to Validate Diastolic field With alphabets input
    Then Verify User can be able to Validate Diastolic field With Special Charecters input
    Then Verify User can be able to Validate Height field With max numeric input
    Then Verify User can be able to Validate Height field With alphabets input
    Then Verify User can be able to Validate Height field With Special Charecters input
    Then Verify User can be able to Validate Weight field With max numeric input
    Then Verify User can be able to Validate Weight field With alphabets input
    Then Verify User can be able to Validate Weight field With Special Charecters input
    Then Verify User can be able to Validate BMI field With max numeric input
    Then Verify User can be able to Validate BMI field With alphabets input
    Then Verify User can be able to Validate BMI field With Special Charecters input
    Then Verify User can be able to Validate Identification Mark1 field With max alphabets input
    Then Verify User can be able to Validate Identification Mark1 field With numeric input
    Then Verify User can be able to Validate Identification Mark1 field With Special Charecters input
    Then Verify User can be able to Validate Identification Mark2 field With max alphabets input
    Then Verify User can be able to Validate Identification Mark2 field With numeric input
    Then Verify User can be able to Validate Identification Mark2 field With Special Charecters input
    Then Verify User can be able to Validate Heartrate field With max numeric input
    Then Verify User can be able to Validate Heartrate field With alphabets input
    Then Verify User can be able to Validate Heartrate field With Special Charecters input
