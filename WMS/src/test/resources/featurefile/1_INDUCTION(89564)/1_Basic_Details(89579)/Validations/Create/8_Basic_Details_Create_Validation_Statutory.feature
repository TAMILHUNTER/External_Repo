@Induction_Basic_Details_Statutory_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Statutory fields while creating workman Basic Details - Statutory
  ******************************************************************************************

  @Induction_Basic_Details_Statutory_Validations_Nodata
  Scenario: Statutory Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Statutory fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory
    Then Verify user can able to Validate Workmen Aadhaar
    Then Verify user can able to Validate Workmen invalid Aadhaar number
    #Issue Report
    Then Verify user can able to Validate Workmen Workpermit
    Then Verify user can able to Validate Workmen Labourcard expiry
    Then Verify user can able to Validate Workmen PF Nominee Name
    Then Verify user can able to Validate Workmen PF Nominee Relationship
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage greater then 100 percentage
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage less then 100 percentage

  @Induction_Basic_Details_Statutory_Validations_Nodata
  Scenario: Statutory Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Statutory fields while creating Workmen with No inputs Provided
    
    Given Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory
    Then Verify user can able to Validate Workmen Aadhaar number with max numeric input
    Then Verify user can able to Validate Workmen Aadhaar number with alphabets input
    Then Verify user can able to Validate Workmen Aadhaar number with Special characters input
    #Issue Report
    Then Verify user can able to Validate Workmen Workpermit expiry with past date
    Then Verify user can able to Validate Workmen Labourcard expiry with past date
    Then Verify user can able to Validate Workmen PF Nominee Name with max alphabets input
    Then Verify user can able to Validate Workmen PF Nominee Name with numeric input
    Then Verify user can able to Validate Workmen PF Nominee Name with Special characters input
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage with max numeric input
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage with alphabets input
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage with Special characters input

