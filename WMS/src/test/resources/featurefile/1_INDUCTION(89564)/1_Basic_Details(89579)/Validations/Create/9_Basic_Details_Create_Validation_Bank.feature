@Induction_Basic_Details_Bank_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Bank fields while creating workman Basic Details - Bank
  ******************************************************************************************

  @Induction_Basic_Details_Bank_Validations_Nodata
  Scenario: Bank Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Bank fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to Validate Workmen Bank Account IFSC or IBAN or SWIFT Code
    Then Verify user can able to Validate Workmen Bank Account Name
    Then Verify user can able to Validate Workmen Bank Account Number

  @Induction_Basic_Details_Bank_Validations_Nodata
  Scenario: Bank Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Bank fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to Validate Workmen Bank Account Name with max alphabets input
    Then Verify user can able to Validate Workmen Bank Account Name with numeric input
    Then Verify user can able to Validate Workmen Bank Account Name with Special characters input
    Then Verify user can able to Validate Workmen Bank Account Number with alphabets input
    Then Verify user can able to Validate Workmen Bank Account Number with alphabets input
    Then Verify user can able to Validate Workmen Bank Account Number with max numeric input
    Then Verify user can able to Validate Workmen Bank Account Number with Special characters input

