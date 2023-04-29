#@Browser_Compatibility_Edge
#Feature: Browser_Compatibility
  #*********************************************
  #Description :  Running_Smoke_Suite_Test_cases
  #************************************************
#
#
  #@Induction_Create_Basic_Details_Submit_workman_details_smoke
  #Scenario: Create and Submit workman details
    #Description :  As a EIP User i should be able to Submit Workmen Details for Induction
#
    #Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    #Then Verify save and submit workman details
#
  #@Induction_SkillAnalysis_Create_Smoke
  #Scenario: Verify User can be Perform Skill Analysis for Manual Test
    #Given Login and Navigate to Skill Analysis
    #Then Verify User can be able to select workmen and Proceed to Skill Test
    #Then Verify User can be able verify Skill Analysis Details
    #Then Verify User can be able to Enter Skill Analysis Details
    #Then Verify User can be able to upload Manual Test Documents
    #Then Verify User can be able to Accept or Reject Workmen Skill Analysis
    #Then Verify User can be able to View Skill Test History
    #Then Verify User can be able to add attachment
    #Then Verify User can be able to view Workmen profile table
#
  #Then Verify User can be able to remove record
  #@Induction_Paramedics_Create_Smoke
  #Scenario: Verify User can be save Paramedics details of Workmen
    #Given Login and Navigate to Paramedics
    #Then Verify User can be able to Enter Medical Examination Date
    #Then Verify User can be able to add paramedics details
    #Then Verify User can be able to save paramedics details
    #Then Verify User can be able to fetch paramedics details
#
  #@Induction_MedicalTest_Create_Smoke
  #Scenario: Verify User can be Perform Medical Test for Workmen
    #Given Login and Navigate to MedicalTest
    #Then Verify Next Medical Examination due date displayed
    #Then Verify the Paramedics details displayed Medical Test
    #Then Verify the user can be able to create medical certificate
    #Then Verify the user can be able to download medical certificate - Need Implementation
    #Then Verify the user can be able to update Skin Temperature
    #Then Verify the user can be able to enter BP
    #Then Verify the user can be able to provide workmen medical status
    #Then Verify the user can be able to add workmen medical fitness status
    #Then Verify the user can be able to add Medical Officer Details
    #Then Verify the user can be able to submit medical Test details
#
  #@Induction_EHS_Create_Smoke
  #Scenario: Verify User can be Perform EHS - Safety Training for Workmen
    #Given Login and Navigate to EHS
    #Then Verify User can be able to search Workmen Profile EHS -- Issue Raised
    #Then Verify User can be able to View Workmen profile EHS
    #Then Verify Basic details in Workmen profile are displayed correctly
    #Then Verify Skill Analysis in Workmen profile are displayed correctly
    #Then Verify Medical Test in Workmen profile are displayed correctly
    #Then Verify EHS in Workmen profile are displayed correctly
    #Then Verify Wage in Workmen profile are displayed correctly
    #Then Verify user can be able to select workmen profile for EHS training
    #Then Verify user can be able to select Training Program
    #Then Verify user can be able to Submit Trainings
    #Then Verify user can be able to add EHS Material Issue - Not Developed Yet
    #Then Verify user can be able to view Trainig Program
#
  #@Induction_View_Workman_Profile_Dashboard_smoke
  #Scenario: View Workman Profile
    #Given Navigate to Induction Dashboard
    #Then Search workmen by Aadhar
    #Then Search workmen by Employee ID
    #Then Verify User can able to View workman Profile
