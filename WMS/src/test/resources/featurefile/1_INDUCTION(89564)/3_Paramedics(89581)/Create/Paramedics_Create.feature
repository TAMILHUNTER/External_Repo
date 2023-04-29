@Induction_Paramedics
Feature: Feature : Induction (89564) UserStory: Paramedics (89581)
*********************************************
  UserStory: Paramedics (89581)
  *********************************************
  Description : As a EIP User i should be able to Enter Paramedics Details of a workmen
******************************************************************************************
  @Induction_Paramedics_Create
  Scenario: Verify User can be save Paramedics details of Workmen
    Given Login and Navigate to Paramedics
    Then Verify User can be able to search Workmen Profile Paramedics
    Then Verify User can be able to View Workmen profile_Paramedics
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify User can be able to Enter Medical Examination Date
    Then Verify User can be able to add paramedics details
    Then Verify User can be able to save paramedics details
   #Then Verify User can be able to fetch paramedics details
  

