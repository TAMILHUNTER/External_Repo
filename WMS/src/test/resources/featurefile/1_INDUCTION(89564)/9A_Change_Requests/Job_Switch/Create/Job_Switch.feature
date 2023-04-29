@Induction_Job_Switch
Feature: Feature : Induction (89564) UserStory: NA
  *********************************************
  UserStory: NA
  *********************************************
  Description :  Verify User Can be able to Switch Workmen Job
  ***************************************************************************************************************************************

  @Induction_Job_Switch_by_Domestic_aadhaar
  Scenario: Verify User Can be able to Switch Workmen Job Domestic
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Switch Job Domestic
    Then Verify Domestic Job DLR Entry
    Then Verify User can be able to Search workmen by Aadhar for Switch
    Then Verify User can be able to navigate to Basic Details
    Then Verify User can be able to Edit Basic Details
    Then Verify Workmen Job Successfully Switched

  @Induction_Job_Switch_by_Domestic_passport
  Scenario: Verify User Can be able to Switch Workmen Job Domestic
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Switch Job Domestic
    Then Verify Domestic Job DLR Entry
    Then Verify User can be able to Search workmen by Passport for Switch Domestic
    Then Verify User can be able to navigate to Basic Details
    Then Verify User can be able to Edit Basic Details
    Then Verify Workmen Job Successfully Switched

      @Induction_Job_Switch_by_International_passport
  Scenario: Verify User Can be able to Switch Workmen Job International
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Switch Job International
    Then Verify Domestic Job DLR Entry
    Then Verify User can be able to Search workmen by Passport for Switch Domestic
    Then Verify User can be able to navigate to Basic Details
    Then Verify User can be able to Edit Basic Details
    Then Verify Workmen Job Successfully Switched