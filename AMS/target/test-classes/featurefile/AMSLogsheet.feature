@LogSheet
Feature: AMS LogSheet

  Background: 
    Given Navigate to Test Enviroment

  @Verify_AMS_Login
  Scenario: Verify AMS Login
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login

  @Verify_AMSMenu
  Scenario: Verify Logsheet AMSMenu
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu

  @Verify_Landingpage
  Scenario: Verify AMS Logsheet Landing Page
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page

  @Verify_DayBased_LogSheet_Creation
  Scenario: Verify Day Based Log sheet Creation
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page
    Then Enter the End meter reading in the creation page
    And Enter the Quantity in the Production Entry
    Then click the submit button to submit the Log sheet



  @Verify_LogSheet_with_Maintenance_and_OT
  Scenario:  verify Maintenance Day Log sheet Creation with OT
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page
    Then Click the Maintenance toggle button in the Log sheet creation page
    And Enter the Maintenance End Reading in the Log Sheet
    And Enter the over time in the maintenance day log sheet
    Then Enter the production Quantity for maintenance OT
    Then click the submit button to submit the Log sheet

  @Verify_Logsheet_for_HiredAsset_with_Idle_Breakdown
  Scenario: Verify Hired Day based Log sheet with Idle hours
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page
    Then Enter the End meter reading in the creation page
    And Enter the Idle hours in the Hired Day based Log sheet
    Then Enter the BreakDown hours in the Hired Day based Log sheet
    And Enter the Quantity in the Production Entry
    Then click the submit button to submit the Log sheet

  @Verify_the_Delete_functionality_of_LogSheet
  Scenario: verify Delete log sheet in the creation page
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page
    Then Click the Date Left arrow in the creation page
    And Click the Delete button in the Log sheet Creation page to delete Log sheet
    
  @Validation_of_Uploaded_image&Remarks
  Scenario: Validation of mobile uploaded images and Remarks
   Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page
    Then Click the Remarks button in the Log sheet Creation Page
    
     
     @Verify_the_TimeBased_logSheet_creation
  Scenario: Verify Time Based Log sheet Creation
    Then Click on Other User
    Then Enter user name in AMS
    Then Enter the Password in AMS
    Then Click on Login
    And Verify the AMS Menu
    Then Click the Asset mgmt in menu
    And Click the Operations and Maintenance in menu
    Then Click the LogSheet in menu
    And Click the JobCode in the Job selection
    Then Enter the Job code in the Job
    And Enter the Asset code in the Asset place holder
    And Click create new Logsheet button in the landing page
    Then Click the Time Based button in the creation page
    And Click Yes button in the Confirmation popup
    Then Click the Work button in the Time Based Log sheet creation
    And Enter the End meter reading in the Time Based creation page
    And Click the start time in the Time Based log sheet creation
    Then Select the Start time from the timer
    And Click the set option in the timer
    Then Click the End time in the Time Based log sheet creation
    And Select the End time from the timer
    Then Click the set option in the End timer
    And Click the save icon in the time based log sheet
    Then Enter the Quantity in the Time Based Production Entry
    And click the submit button to submit the Time Based Log sheet 
    
