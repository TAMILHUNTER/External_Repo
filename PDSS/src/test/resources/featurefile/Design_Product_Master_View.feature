@Regression
Feature: Product Master - VIEW

  #Test Case - 1
  @ProductMasterView @Sanity
  Scenario Outline: To verify the landing page of Product Master
    Given Go to Test Environment
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Products
    Then Logout

    Examples: 
      | Username |
      | sudipta  |
