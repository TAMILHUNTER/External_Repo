@Induction_Dashboard_search_workmen_Verification
Feature: Feature : Induction (89564) UserStory: Workmen Search (89577)
  *********************************************
  UserStory: Workmen Search (89577)
  *********************************************
   Description : Verify Error message is displayed when Workmen Search fields filled with differend values
  ***************************************************************************************************************************************
#Domestic
  @Induction_Dashboard_search_Domestic_workmen_Verification_no_input
  Scenario: Verify Error message is displayed when  Workmen Search fields when no data filled
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is not filled
    Then Verify Error message dipsplayed if Workmen number is not filled
    Then Verify Error message dipsplayed if name and father name are not filled
    Then Verify Error message dipsplayed if visaproID is not filled
    Then Verify Error message dipsplayed if Passport number is not filled

  @Induction_Dashboard_search_Domestic_workmen_Verification_Boundary_min
  Scenario: Verify Error message is displayed when  Workmen Search fields with min boundary value
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is filled with min boundary value
    Then Verify Error message dipsplayed if Workmen number is filled with min boundary value
    Then Verify Error message dipsplayed if name and father name are filled with min boundary value
    Then Verify Error message dipsplayed if visaproID is filled with min boundary value
    Then Verify Error message dipsplayed if Passport number is filled with min boundary value

  @Induction_Dashboard_search_Domestic_workmen_Verification_Boundary_max
  Scenario: Verify Error message is displayed when  Workmen Search fields with max boundary value
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is filled with max boundary value
    Then Verify Error message dipsplayed if Workmen number is filled with max boundary value
    Then Verify Error message dipsplayed if name and father name are filled with max boundary value
    Then Verify Error message dipsplayed if visaproID is filled with max boundary value
    Then Verify Error message dipsplayed if Passport number is filled with max boundary value

  @Induction_Dashboard_search_Domestic_workmen_Verification_Special_Char
  Scenario: Verify Error message is displayed when  Workmen Search fields filled with 
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is filled with Special Charectors
    Then Verify Error message dipsplayed if Workmen number is filled with Special Charectors
    Then Verify Error message dipsplayed if name and father name are filled with Special Charectors
    Then Verify Error message dipsplayed if visaproID is filled with Special Charectors
    Then Verify Error message dipsplayed if Passport number is filled with Special Charectors
    
#International
      @Induction_Dashboard_search_International_workmen_Verification_no_input
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is not filled
    Then Verify Error message dipsplayed if name and father name are not filled
    Then Verify Error message dipsplayed if visaproID is not filled
    Then Verify Error message dipsplayed if Passport number is not filled

  @Induction_Dashboard_search_International_workmen_Verification_Boundary_min
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is filled with min boundary value
    Then Verify Error message dipsplayed if name and father name are filled with min boundary value
    Then Verify Error message dipsplayed if visaproID is filled with min boundary value
    Then Verify Error message dipsplayed if Passport number is filled with min boundary value

  @Induction_Dashboard_search_International_workmen_Verification_Boundary_max
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is filled with max boundary value
    Then Verify Error message dipsplayed if name and father name are filled with max boundary value
    Then Verify Error message dipsplayed if visaproID is filled with max boundary value
    Then Verify Error message dipsplayed if Passport number is filled with max boundary value
    
      @Induction_Dashboard_search_International_workmen_Verification_Special_Char
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is filled with Special Charectors
    Then Verify Error message dipsplayed if name and father name are filled with Special Charectors
    Then Verify Error message dipsplayed if visaproID is filled with Special Charectors
    Then Verify Error message dipsplayed if Passport number is filled with Special Charectors