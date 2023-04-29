@Regression
Feature: Creation of Costing Process Request

  Background: 
    Given Go to Test Environment

      
  #Scenario - 1
  @CostingProcessRequest 
  Scenario Outline: To verify whether the landing page of Product Master
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Validate whether the user is able to click on Costing
    Then Validate whether the user is able to click the Costing Process Request
   # Then Validate the Title name of Costing Process Landing Page
   

    Examples: 
      | Username   |
      | KKB |
      
  #Scenario - 2
  @CostingProcessRequest 
  Scenario Outline: To verify whether the landing page of Product Master
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Validate whether the user is able to click on Costing
    Then Validate whether the user is able to click the Costing Process Request
    Then Validate the Title name of Costing Process Landing Page
    Then Click on Create Request to initiate the Process
    Then Click on Confirmation Pop Up to start the Process
    Then Logout

    Examples: 
      | Username   |
      | KKB |