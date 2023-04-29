@Smoke
Feature: Menu traverse
  
  As a user after login i should able to traverse to Transport Request.

  @Menus
  Scenario: Menu traverse
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