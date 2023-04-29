@Induction_Basic_Details_Skill_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Skill fields while creating workman Basic Details - Skill
  ******************************************************************************************

  @Induction_Basic_Details_Skill_Validations_Nodata
  Scenario: Communication Fields Validations with No Data 
    Description :  As a EIP User i should be able to Validate Skill fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication details then navigate to Skill
    Then Verify user can able to Validate Workmen skill category
    Then Verify user can able to Validate Workmen skill group
    Then Verify user can able to Validate Workmen skill description
    Then Verify user can able to Validate Workmen skill Type