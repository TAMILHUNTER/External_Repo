@Induction_Basic_Details_Communication_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Communication fields while creating workman Basic Details - Communication
  ******************************************************************************************

  @Induction_Basic_Details_Communication_Validations_Nodata
  Scenario: Communication Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Communication fields while creating Workmen with No inputs Provided

    Given Fill Partner and Personal details then navigate to communication
    Then Verify user can able to Validate Workmen Permanent address
    Then Verify user can able to Validate Workmen Permanent address pincode
    Then Verify user can able to Validate Workmen Permanent address village
    Then Verify user can able to Validate Workmen Temporary address
    Then Verify user can able to Validate Workmen Temporary address pincode
    Then Verify user can able to Validate Workmen Temporary address village
    Then Verify user can able to Validate Workmen Emergency address
    Then Verify user can able to Validate Workmen Emergency Contact number
    Then Verify user can able to Validate Workmen Emergency Contact Name
    Then Verify user can able to Validate Workmen Emergency Contact address pincode
    Then Verify user can able to Validate Workmen Emergency address village
    Then Verify user can able to Validate Workmen Emergency Contact Relationship with employee
    Then Verify user can able to Validate Workmen mobile number

  @Induction_Basic_Details_Communication_Validations_Numeric_Special_MaxValues
  Scenario: Communication Fields Validations with Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Communication fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate Mobilenumber field with Max Numeric
    Then Verify user can able to Validate Mobilenumber field with alphabets
    Then Verify user can able to Validate Mobilenumber field with Special characters
    Then Verify user can able to Validate Permanent address pincode field with Max Numeric
    Then Verify user can able to Validate Permanent address pincode field with alphabets
    Then Verify user can able to Validate Permanent address pincode field with Special characters
    Then Verify user can able to Validate Temporary address pincode field with Max Numeric
    Then Verify user can able to Validate Temporary address pincode field with alphabets
    Then Verify user can able to Validate Temporary address pincode field with Special characters
    Then Verify user can able to Validate Emergency Contact address pincode Max field with Numeric
    Then Verify user can able to Validate Emergency Contact address address pincode field with alphabets
    Then Verify user can able to Validate Emergency Contact address pincode field with Special characters
    Then Verify user can able to Validate Emergency Contact Name field with Numeric
    Then Verify user can able to Validate Emergency Contact Name field with Special characters
    Then Verify user can able to Validate Emergency Contact Mobile Number field with Max Numeric
    Then Verify user can able to Validate Emergency Contact Mobile Number field with alphabets
    Then Verify user can able to Validate Emergency Contact Mobile Number field with Special characters
