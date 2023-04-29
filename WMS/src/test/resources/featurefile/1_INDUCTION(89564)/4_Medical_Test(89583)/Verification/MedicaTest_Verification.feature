@Induction_MedicalTest_Verification
Feature: Feature : Induction (89564) UserStory: Medical Test (89583)
  *********************************************
  UserStory: Medical Test (89583)
  *********************************************
  Description : As a EIP User i should be able to Validate Medical Test fields
  ******************************************************************************************

  @Induction_MedicalTest_Create_Verification_With_noInput
  Scenario: Verify User can be Validate Medical Test fields with no input
    Given Login and Navigate to MedicalTest
    Then Select Workmen for Medical Test Verification
    Then Verify User can be able to Validate Skin Temp field with no input
    #Issue Report
    Then Verify User can be able to Validate BP field with no input
    Then Verify User can be able to Validate Medical Officer Name field with no input
    Then Verify User can be able to Validate Medical Registration Number field with no input

  @Induction_MedicalTest_Create_Verification_With_multipleInput
  Scenario: Verify User can be Validate Medical Test fields with Numeric,alphabets,Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to MedicalTest
    Then Select Workmen for Medical Test Verification
    Then Verify User can be able to Validate Skin Temp field with Numeric input
    Then Verify User can be able to Validate Skin Temp field with alphabets input
    Then Verify User can be able to Validate Skin Temp field with Special Charecters input
    Then Verify User can be able to Validate BP field with Numeric input
    Then Verify User can be able to Validate BP field with alphabets input
    Then Verify User can be able to Validate BP field with Special Charecters input
    Then Verify User can be able to Validate Medical Officer field with Numeric input
    Then Verify User can be able to Validate Medical Officer field with alphabets input
    Then Verify User can be able to Validate Medical Officer field with Special Charecters input
    Then Verify User can be able to Validate Registration Number field with Numeric input
    Then Verify User can be able to Validate Registration Number field with alphabets input
    Then Verify User can be able to Validate Registration Number field with Special Charecters input