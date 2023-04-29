@Basic_Details_Create_International_workmen
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Create International Workmen
  ******************************************************************************************

  @Basic_Details_Create_International_workmen_Nepal
  Scenario: Create International Workmen
    Description :  As a EIP User i should be able to Create International Workmen

    Given Login and Select International Job then navigate to Basic details
    Then Verify user can able to Fill Partner Details
    Then Verify user can able to Fill Personal Details
    Then Verify user can able to Fill Communication Details
    Then Verify user can able to Fill Skill Details
    Then Verify user can able to Fill Deployment Details
    Then Verify user can able to Fill Educational Details
    Then Verify user can able to Fill Experience Details
    Then Verify user can able to Fill Statutory Details
    Then Verify user can able to Fill Bank Details
    Then Verify user can able to Save and Submit Workmen Details 
    

