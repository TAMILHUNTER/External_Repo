@Regression_EDMS
Feature: Menu traverse
  
  As a user after login i should able to traverse all the repected menu.

  @Menus @Menus1
  Scenario: User should able to navigate Menu traverse
    Given as a user i should able to view EDMS home page
    When click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And as a user i should able to click EDMS home page main menu
    Then user should able to select Repository Document in Main Menu
    Then user should able to select Engineering Schedule Doc in Main Menu
    Then user should able to select Respond Workflow in Main Menu
    Then user should able to select Communication in Main Menu
    Then user should able to select Transmittal in Main Menu
    Then user should able to select Project Configuration in Main Menu
    Then user should able to select Masters in Main Menu
    Then user should able to select Dashboard Reports in Main Menu
