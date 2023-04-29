
@EIP40_SR
Feature: Service Request Creation and Approve
  
  UserStory: Full Flow
  
  Description :  As a EIP User i should be able to  Service Request

  Scenario: Stright Flow Creation Functions
    Given Login Stright Flow username and Pasword
    And Navigate From Menu to SR In Stright Flow
    And Creation from SR Stright Flow
    And Stright Material Card
    And Stright WBS and Cost Package
    And Stright Quantiy and Rate
    And Submit Card material in Stright
    And Signout in Stright

  Scenario: Stright Flow Approver Functions
    When Login Stright Flow Approver Username nd Password
    And Approver Stright Flow Navigate From Menu to SR
    And Checking ForAction Function Full Flow Stright Case
    And Checking All Function in Approver Fro Stright Flow
    And Sign out Approver Stright Flow

  Scenario: Checking Process and Document View Function
    Then Login Document View and Process Username nd Password
    And Navigate From Menu to SR Document View and Process
    #And Document View
    And Process Flow Details
    And Sign Out For Flow Details
