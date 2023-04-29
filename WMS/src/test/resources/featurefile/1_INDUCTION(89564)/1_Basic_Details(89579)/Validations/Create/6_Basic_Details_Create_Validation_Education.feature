@Induction_Basic_Details_Education_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Education fields while creating workman Basic Details - Education
  ******************************************************************************************

  @Induction_Basic_Details_Education_Validations_Nodata
  Scenario: Education Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Education fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment details then navigate to Education
    Then Verify user can able to Validate Workmen Education Applicable
    Then Verify user can able to Validate Workmen Qualification
    Then Verify user can able to Validate Workmen Branch based on Qualification
    Then Verify user can able to Validate Workmen schoolORCollege
    Then Verify user can able to Validate Workmen BoardORUniversity
    Then Verify user can able to Validate Workmen Year of Passing

  @Induction_Basic_Details_Education_Validations_Numeric_Special_MaxValues
  Scenario: Education Fields Validations with Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Education fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner Personal communication Skill Deployment details then navigate to Education
    Then Verify user can able to Validate Workmen Education Applicable
    Then Verify user can able to Validate Workmen Discipline with numberic input
    Then Verify user can able to Validate Workmen Discipline with max alphabets input
    Then Verify user can able to Validate Workmen Discipline with Special characters input
    Then Verify user can able to Validate Workmen schoolORCollege with numberic input
    Then Verify user can able to Validate Workmen schoolORCollege with max alphabets input
    Then Verify user can able to Validate Workmen schoolORCollege with Special characters input
    Then Verify user can able to Validate Workmen BoardORUniversity with numberic input
    Then Verify user can able to Validate Workmen BoardORUniversity with max alphabets input
    Then Verify user can able to Validate Workmen BoardORUniversity with Special characters input
    Then Verify user can able to Validate Workmen YearofPassing with max numberic input
    Then Verify user can able to Validate Workmen YearofPassing with alphabets input
    Then Verify user can able to Validate Workmen YearofPassing with Special characters input
    
