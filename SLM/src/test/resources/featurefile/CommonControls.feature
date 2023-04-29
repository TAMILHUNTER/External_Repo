@RegressionTesting
Feature: Common Control
  
  As a creator i should able to create Rate Contract

  @CommmonControlSearch
  Scenario: Search
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to click the seach icon
   And user should able to pass the search document number
   	 | LE/LE180046/TRC/22/000613 |
    And user should able to click the search button
    And user should able to find the related search result
     
    @CommonControlFilter 
    Scenario: Filter
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to click the filter icon
   And user should able to pass the filter document number
       | LE/LE180046/TRC/22/000613 |
   # And user should able to find the related filtered result