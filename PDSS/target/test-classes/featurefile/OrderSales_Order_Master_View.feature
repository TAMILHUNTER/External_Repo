@Regression
Feature: Order Master - VIEW

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @OrderMasterView @PDSS
  Scenario Outline: To verify the landing page of View page of Order Master
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
 Then Logout
    Examples: 
      | Username   |
      | SUMANTA.KM |
