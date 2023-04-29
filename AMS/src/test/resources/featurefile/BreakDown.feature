@BreakDown
Feature: BreakDown Creation

  Background: 
    Given Navigate to Test Enviroment

  @BreakDown_Hired_TIme_Based
  Scenario: Verify the Breakdown entry for hired asset_Time based
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Select the JobCode
    Then Select the Hired Asset code
    Then Give the dutation
    Then Give Go
    Then click refresh button
    Then Give Go
    Then Click Create new LogSheet button
    Then Move to TimeBased tab
    Then Click Work entry
    Then enter Endmeter reading
    Then enter Start time
    And Enter End time
    Then Click action Save button
    Then Enter production Quantity
    Then Click Breakdown button
    Then give end time
    Then Click action save for breakdown entry
    Then Click Submit button to submit logsheet

  @BreakDown_Hired_Day_Based
  Scenario: Verify the Breakdown entry for hired asset_Day based
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Select the JobCode
    Then Select the Hired Asset code
    Then Give the dutation
    Then Give Go
    Then click refresh button
    Then Give Go
    Then Click Create new LogSheet button
    Then Give DayBased Endmeter Reading
    Then Give breakdown hours
    Then Give Day based Production quantity
    Then Click Submit button to submit logsheet

  @BreakDown_Owned_Asset
  Scenario: Verify the Breakdown entry for Owned asset
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Select the JobCode
    Then Select the owned Asset code
    Then Give the dutation
    Then Give Go
    Then Click Create new LogSheet button
    Then Click breakdown hyperlink button
    Then Select breakdown type
    Then Give Breakdown time
    Then Give Nature of Defects
    And Give Exp.Commissioning Date
    Then Give Exp.Commissioning time
    Then Give Remarks for Breakdown
    Then Click Submit

  @DER_with_Sub_Assembly
  Scenario: Verify the DER Creation
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
    Then Give CauseOfFailure
    Then Go to sub Assembly
    Then Give Sub Assembly
    And Give Agency name
    And Give Nature of repair
    And Enter Spares Cost
    And Give Save
    And Give Save as Draft

  @DER_with_Major_Sapres
  Scenario: Verify the DER Creation
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
    Then Click Major Sapres tab
    Then Give Materials
    Then Give PartNo
    Then Give PartName
    Then Give Quantity
    Then Enter Amount
    Then Give MajorSparesRemarks
    Then Give Major spares Save
    And Give Submit
