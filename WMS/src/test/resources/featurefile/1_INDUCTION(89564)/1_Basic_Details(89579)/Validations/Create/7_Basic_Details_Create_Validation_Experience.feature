@Induction_Basic_Details_Experience_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Experience fields while creating workman Basic Details - Experience
  ******************************************************************************************

  @Induction_Basic_Details_Experience_Validations_Nodata
  Scenario: Experience Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Experience fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education details then navigate to Experience
    Then Verify user can able to Validate Workmen Experience Applicable
    Then Verify user can able to Validate Workmen Project Skill Category
    #Issue Report
    Then Verify user can able to Validate Workmen Project Skill Group
    #Issue Report
    Then Verify user can able to Validate Workmen Project Skill Description
    Then Verify user can able to Validate Workmen Duration From
    Then Verify user can able to Validate Workmen Duration From with future date
    #Issue Report
    Then Verify user can able to Validate Workmen Duration To
    Then Verify user can able to Validate Workmen Duration To with future date
    #Issue Report
    Then Verify user can able to Validate Workmen Project Organization Name
    #Issue Report
    Then Verify user can able to Validate Workmen Project Location
    Then Verify user can able to Validate Workmen Project CodeOrName

  @Induction_Basic_Details_Experience_Validations_Numeric_Special_MaxValues
  Scenario: Experience Fields Validations with Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Experience fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education details then navigate to Experience
    Then Verify user can able to Validate Workmen Experience Applicable
    Then Verify user can able to Validate Workmen Project Organization Name With Max alphabets input
    Then Verify user can able to Validate Workmen Project Organization Name With Special characters input
    Then Verify user can able to Validate Workmen Project Organization Name With Numeric input
    Then Verify user can able to Validate Workmen Project Location with Max alphabets input
    Then Verify user can able to Validate Workmen Project Location with Special characters input
    Then Verify user can able to Validate Workmen Project Location with Numeric input
    Then Verify user can able to Validate Workmen Project CodeOrName With Max alphabets input
    Then Verify user can able to Validate Workmen Project CodeOrName With Special characters input
    Then Verify user can able to Validate Workmen Project CodeOrName With Numeric input
    
