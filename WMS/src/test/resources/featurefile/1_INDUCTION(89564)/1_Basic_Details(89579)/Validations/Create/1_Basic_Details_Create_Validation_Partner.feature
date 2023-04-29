@Induction_Basic_Details_Partner_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate fields while creating workman Basic Details - Partner
  ******************************************************************************************

  @Induction_Basic_Details_Validations_PartnerName
  Scenario: Partner_Name Validation
    Description :  As a EIP User i should be able to Validate Partner Name fields while creating Partner

    Given Login
    And Navigate to BasicDetails
    Then Verify user can able to Validate Partner field

  @Induction_Basic_Details_Validations_WorkType
  Scenario: Partner_WorkType Validation
    Description :  As a EIP User i should be able to Validate WorkType fields while creating Partner

    Given Login
    And Navigate to BasicDetails
    Then Verify user can able to Validate Worktype field

 