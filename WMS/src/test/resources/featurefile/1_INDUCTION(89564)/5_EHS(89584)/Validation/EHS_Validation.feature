@Induction_EHS_Validation
Feature: Feature : Induction (89564) UserStory: EHS - Safety Training (89584)
  *********************************************
  UserStory: EHS - Safety Training (89584)
  *********************************************
  Description : As a EIP User i should be able to Validate ( EHS - Safety Training )
  ****************************************************************************************************

  @Induction_EHS_Create_Validation_With_No_input
  Scenario: Verify User can be Perform EHS - Safety Training for Workmen
    Given Login and Navigate to EHS
    Then Verify user can be able to select workmen profile for EHS safty training Validation
    Then Verify user can be able to Validate if no training selected
