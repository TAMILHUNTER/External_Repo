@Regression
Feature: Order Master - EDIT

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @OrderMasterUpdate @PDSS
  Scenario Outline: To verify the landing page of Edit page of Order Master
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Order and Sales
    Then Click on Manufacturing Orders
    Then Click on Edit in Order Master
 Then Logout
    Examples: 
      | Username   |
      | SUMANTA.KM |
