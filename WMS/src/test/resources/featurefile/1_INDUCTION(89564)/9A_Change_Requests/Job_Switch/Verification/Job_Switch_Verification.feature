@Induction_Job_Switch_Verification
Feature: Feature : Induction (89564) UserStory: NA
  *********************************************
  UserStory: NA
  *********************************************
  Description :  Verify User Can be able to verify Switch Workmen Job fields
  ***************************************************************************************************************************************

  @Induction_Job_Switch_Verification_input
  Scenario: Verify User Can be able to verify Switch Workmen Job fields
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if user select job code that user does not have access


 