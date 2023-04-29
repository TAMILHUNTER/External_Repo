@DER_Approval
Feature: Create DER & DER Approval

  Background: 
    Given Navigate to Test Enviroment

  @DER_Approval_Level1_Rejection
  Scenario: First level Rejection of DER
    Then Click on Other User
    Then Enter First level Approver user ID in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Go to Approver WworkBench
    Then Click filter to find current DER
    Then Click the DER
    Then Click Reject button
    Then Give rejection remark
    Then Click yes to reject the DER

  @DER_Resubmit_and_Level1_Approve
  Scenario: ReSubmit the DER and approve in Level 1
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the BreakDownEntry in menu
    And Select the BreakDownJobCode
    Then Select the BreakDown Asset code
    Then Give the BreakDown dutation
    Then Give Search
    Then Click Breakdown Asset
    And Click Detailed Estimatimation Tab
    And Click Major Sapres tab
    And Give Submit
    And SignOut from current user
    Then Click on Other User
    Then Enter First level Approver user ID in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Go to Approver WworkBench
    Then Click filter to find current DER
    Then Click the DER
    Then Click Approve

  @DER_Approval_Level2_Rejection
  Scenario: Second level Rejection of DER
    Then Click on Other User
    Then Enter second level Approver user ID in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Go to Approver WworkBench
    Then Click filter to find current DER
    Then Click the DER
    Then Click Reject button
    Then Give rejection remark
    Then Click yes to reject the DER

  @Resubmit_the_DER_Approve_in_Both_Levels
  Scenario: Resubmit the DER and Approve in both levels
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the BreakDownEntry in menu
    And Select the BreakDownJobCode
    Then Select the BreakDown Asset code
    Then Give the BreakDown dutation
    Then Give Search
    Then Click Breakdown Asset
    And Click Detailed Estimatimation Tab
    And Click Major Sapres tab
    And Give Submit
    And SignOut from current user
    Then Click on Other User
    Then Enter First level Approver user ID in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Go to Approver WworkBench
    Then Click filter to find current DER
    Then Click the DER
    Then Click Approve
    And SignOut from current user
    Then Click on Other User
    Then Enter second level Approver user ID in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Go to Approver WworkBench
    Then Click filter to find current DER
    Then Click the DER
    Then Click Approve

  @Commissioning
  Scenario: Verify BreakDown PAge
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the BreakDownEntry in menu
    And Select the BreakDownJobCode
    Then Select the BreakDown Asset code
    Then Give the BreakDown dutation
    Then Give Search
    Then Click Breakdown Asset
    Then Click Commissiong tab
    Then Enter Commissioning Date
    And Enter Next Maintanence Date
    Then Select Done by
    Then Give P&M Incharge
    Then Give Work Done
    And Give remarks
    And Check and print the Primary Engine Meter Type
    Then Click Commissioning Submit

  