@Induction_Dashboard_View_Workman_Profile
Feature: Feature : Induction (89564) UserStory: Workmen Search (89577)
  *********************************************
  UserStory: Workmen Search (89577)
  *********************************************
  Description : As a EIP User i should be able to View Workman Profile in Dashboard 
  						Existing Workmen profile Should be displayed in Induction Dashboard while searching
  ***************************************************************************************************************************************

  @Induction_View_Workman_Profile_Dashboard_Eye
  Scenario: View Workman Profile
    Given Navigate to Induction Dashboard
    Then Search workmen by Aadhar
    Then Search workmen by Employee ID
    Then Verify User can able to View workman Profile

  @Induction_Search_Domestic_Workmen
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Aadhaar
    Then Verify User can be able to Search Domestic Workmen With Workmen Number
    Then Verify User can be able to Search Domestic Workmen With Name and Father Name
    #Then Verify User can be able to Search Domestic Workmen With VisaPro ID #Issue 100085 Reported
    Then Verify User can be able to Search Domestic Workmen With Passport Number

  @Induction_Search_Domestic_Workmen_multiple
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Name alone
    Then Verify User can be able to Search Domestic Workmen With FatherName alone

  @Induction_Search_International_Workmen
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select International for search
    Then Verify User can be able to Search International Workmen With Workmen Number
    Then Verify User can be able to Search International Workmen With Passport Number

  @Induction_Search_Workmen_Profile_Completion_Status
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Workmen Number
    Then Verify User can be able to view Workmen profile Completion Status
    Then Verify User can be able to view Workmen profile Completion Percentage
