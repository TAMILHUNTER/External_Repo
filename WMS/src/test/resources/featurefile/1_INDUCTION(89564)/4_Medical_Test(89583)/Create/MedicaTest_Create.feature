@Induction_MedicalTest
Feature: Feature : Induction (89564) UserStory: Medical Test (89583)
*********************************************
  UserStory: Medical Test (89583)
  *********************************************
  Description : As a EIP User i should be able to Enter Medical Test Details of a workmen
******************************************************************************************
  @Induction_MedicalTest_Create
  Scenario: Verify User can be Perform Medical Test for Workmen
    Given Login and Navigate to MedicalTest
    Then Verify User can be able to search Workmen Profile Medical Test
    Then Verify User can be able to View Workmen profile medical Test
    Then Verify Basic details in Workmen profile are displayed correctly for medical test
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify Next Medical Examination due date displayed
    Then Verify the Paramedics details displayed Medical Test
    Then Verify the user can be able to create medical certificate
    #Then Verify the user can be able to download medical certificate - Need Implementation
    Then Verify the user can be able to update Skin Temperature
    Then Verify the user can be able to update Color of Eyes
    Then Verify the user can be able to update Complextion
    Then Verify the user can be able to enter BP
    Then Verify the user can be able to provide workmen medical status
    Then Verify the user can be able to add workmen medical fitness status
    Then Verify the user can be able to add Medical Officer Details
    Then Verify the user can be able to submit medical Test details

   


