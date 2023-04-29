@Regression_EDMS
Feature: Login
  As a user i should be able to login EIP Portal

  @Login @Menus
  Scenario: Login
    Given as a user i should able to view EDMS home page
    When click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    Then user should able to click Logout button
    #Then click otheruser login button
    #Then enter usernamePk and passwordPk
    #Then click Log in button
    #Then user should be able to login successfully
    #Then user should able to click Logout button
    
    
  @NagativeLoginScenario
  Scenario: Nagative Login Scenario
    Given as a user i should able to view EDMS home page
    When click otheruser login button
    Then enter Invalid username and Valid password
    And click Log in button
    And user should be able to login successfully
    Then enter Valid username and Invalid password
    Then click Log in button
    Then user should be able to login successfully
    Then enter Invalid username and Invalid password
    And click Log in button
    And user should be able to login successfully
