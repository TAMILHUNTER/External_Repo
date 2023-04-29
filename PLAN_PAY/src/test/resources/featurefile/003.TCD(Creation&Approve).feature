@EIP_TCD
Feature: TCD Creation and Approve

  Background: 
    Given Go to Test Environment

  Scenario: Verify to TCD
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Navigate From Menu to TCD
    Then Click on Service
    Then Click on Filter
    Then Pass to RFQ Number from DB
    And MouseOver to Click on Create Icon
    And Select Job and Vendor
    And Pass to Alloc QTY
    And Full in TDS Details
    And Submit on Mateial
    And Post On Material
    And SignOut

  
  Scenario: Level1 Approve
    Then Click On Other user1
    Then Enter Vailed Username1
    And Enter Vailed password1
    And Click On Login1
    And Click Filter Icon1
    And Enter DB From Recent TCD Document No1
    And Mouse Over to Approve1
    And Sign out1

 
  Scenario: Level2 Approve
    When Click On Other User
    And Enter Vailed Username
    And Enter Vailed password
    And Click On Login
    And Click Filter Icon
    And Enter DB From Recent TCD Document No
    And Mouse Over to Approve
    And Sign out
