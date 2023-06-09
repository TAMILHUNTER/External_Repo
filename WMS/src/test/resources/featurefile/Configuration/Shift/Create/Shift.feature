@Configuration_Shift
Feature: Feature : Configuration ()
  *********************************************
  UserStory: Calender () 
  *********************************************
  Description :  As a EIP User i should be able to add calender for Holidays
  ******************************************************************************************

  @Configuration_Shift_View
  Scenario: Verify User can be able to View Shift for the selected Job
    Description :  As a EIP User i should be able to View Shift for the selected Job

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job

  @Configuration_View_Shift_in_Master
  Scenario: Verify User can be able to View Shift in Master
    Description :  As a EIP User i should be able to View Shift in Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master

  @Configuration_Add_Shift_to_Master
  Scenario: Verify User can be able to Add Shift to Master
    Description :  As a EIP User i should be able to Add Shift to Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master
    Then Verify user can be able to Add Shift Code to add Shift in master
    Then Verify user can be able to Add Shift Description to add Shift in master
    Then Verify user can be able to Add Shift From Hour to add Shift in master
    Then Verify user can be able to Add Shift To Hour to add Shift in master
    Then Verify user can be able to Add Break From Hour to add Shift in master
    Then Verify user can be able to Add Break To Hour to add Shift in master
    Then Verify user can be able to Add Shift to Shift Master

  @Configuration_Add_Shift_to_Job
  Scenario: Verify User can be able to Add Shift to Master
    Description :  As a EIP User i should be able to Add Shift to Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master
    Then Verify user can be able to Add Shift to Job
    Then Verify user can be able to save Shift for the selected job
    Then Verify user can be able to view exhisting Shift for the selected job

  @Configuration_View_Shift_in_Master_filter
  Scenario: Verify User can be able to Filter Shift in Master
    Description :  As a EIP User i should be able to Filter Shift in Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to filter records by Shift code in master
    Then Verify user can be able to filter records by Shift Desc in master
    #		Issue Reported
    #		Then Verify user can be able to filter records by Shift From Hour in master
    #		Then Verify user can be able to filter records by Shift To Hour in master
    #		Then Verify user can be able to filter records by Break From Hour in master
    #		Then Verify user can be able to filter records by Break To Hour in master
    Then Verify user can be able to filter records by Status in master

  @Configuration_Delete_Shift_from_Master
  Scenario: Verify User can be able to Delete Shift from Master
    Description :  As a EIP User i should be able to Delete Shift from Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to delete Shift from Master
    Then Verify user can be able to view exhisting Shift for the selected job

  @Configuration_Edit_Shift_from_Master
  Scenario: Verify User can be able to Edit Shift from Master
    Description :  As a EIP User i should be able to Edit Shift from Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to select Shift record from Master for Edit Shift record
    Then Verify user can be able to Edit Shift Description from Master
    Then Verify user can be able to Edit Shift From Hour from Master
    Then Verify user can be able to Edit Shift To Hour from Master
    Then Verify user can be able to Edit Break From Hour from Master
    Then Verify user can be able to Edit Break To Hour from Master
    Then Verify user can be able to Add Shift to Shift Master
    Then Verify user can be able to view Shifts available in master

  @Configuration_Edit_Status_of_Shift_from_Master
  Scenario: Verify User can be able to Edit Status of Shift from Master
    Description :  As a EIP User i should be able to Edit Status of Shift from Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to Edit Shift Status
    Then Verify user can be able to view Shifts available in master

  @Configuration_Remove_Shift_from_Job
  Scenario: Verify User can be able to Remove shift from Job
    Description :  As a EIP User i should be able to Remove shift from Job

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify exhisting Shift for the selected job
    Then Verify user can be able to Remove Shift from job
