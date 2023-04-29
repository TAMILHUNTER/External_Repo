@Daily_Attendance_Validation
Feature: Feature : On-Boarding & Attendance (89575) UserStory: Daily Attendance(89582)
  **********************************************************************************************
  UserStory: Daily Attendance(89582)
  *********************************************
  Description : As a EIP User i should be able to Upload Daily Attendance of a Workmen
  ***************************************************************************************************************************************

  @Daily_Attendance_upload_Validation
  Scenario: Verify user can be able to validate Attendance upload fields 
    Given Login and Navigate to Attendance
    Then Verify User can be able to Upload Attendance Data via txt file
    Then Verify User can be able to Upload Attendance Data via pdf file
    Then Verify User can be able to Upload Attendance Data via image file
    Then Verify User can be able to Upload Attendance Data via excel file
    Then Verify User can be able to Upload Attendance Data with wrong cap file format

  # Issue Report
  #@Daily_Attendance_view_Validation
  #Scenario: Verify user can be able to validate Attendance view fields 
    #Given Login and Navigate to Attendance
    #Then Verify User can be able to use filter
