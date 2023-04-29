@Daily_Attendance
Feature: Feature : On-Boarding & Attendance (89575) UserStory: Daily Attendance(89582)
  **********************************************************************************************
  UserStory: Daily Attendance(89582)
  *********************************************
  Description : As a EIP User i should be able to Upload Daily Attendance of a Workmen
  ***************************************************************************************************************************************

  @Daily_Attendance_upload
  Scenario: Verify user can be able to upload Daily Attendance of a workmen
    Given Login and Navigate to Attendance
    Then Verify User can be able to Upload Attendance Data via Cap file

  @Daily_Attendance_upload_for_Year
  Scenario: Verify user can be able to View Attendance Summary
    Given Login and Navigate to Attendance
    Then Upload All Attendance Data for the year

  @Daily_Attendance_View
  Scenario: Verify user can be able to upload Daily Attendance of a workmen
    Given Login and Navigate to Attendance
    Then Verify User can be able to view attendance record
    Then Verify User can be able to expand or collapse attendance view grid
