@Smoke
Feature: Smoke_Suite
  *********************************************
  Description :  Running_Smoke_Suite_Test_cases
  ************************************************

  @Smoke_Induction_Create_Basic_Details_Submit_workman_details
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    Then Verify save and submit workman details


  @Smoke_Induction__SkillAnalysis_Create_Random
  Scenario: Verify User can be Perform Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Search Workmen Profile SkillAnalysis
    Then Verify User can be able to View Workmen profile
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify User can be able to select workmen and Proceed to Skill Test Manual
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    #Then Verify User can be able to upload Manual Test Documents
    Then Verify User can be able to Accept or Reject Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    #Then Verify User can be able to add attachment
    Then Verify User can be able to view Workmen profile table

  @Smoke_Induction__Paramedics_Create
  Scenario: Verify User can be save Paramedics details of Workmen
    Given Login and Navigate to Paramedics
    Then Verify User can be able to search Workmen Profile Paramedics
    Then Verify User can be able to View Workmen profile_Paramedics
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify User can be able to Enter Medical Examination Date
    Then Verify User can be able to add paramedics details
    Then Verify User can be able to save paramedics details

  @Smoke_Induction__MedicalTest_Create
  Scenario: Verify User can be Perform Medical Test for Workmen
    Given Login and Navigate to MedicalTest
    Then Verify User can be able to search Workmen Profile Medical Test
    Then Verify User can be able to View Workmen profile medical Test
    Then Verify Basic details in Workmen profile are displayed correctly for medical test
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify Next Medical Examination due date displayed
    Then Verify the Paramedics details displayed Medical Test
    Then Verify the user can be able to create medical certificate
    #Then Verify the user can be able to download medical certificate - Need Implementation
    Then Verify the user can be able to update Skin Temperature
    Then Verify the user can be able to update Color of Eyes
    Then Verify the user can be able to update Complextion
    Then Verify the user can be able to enter BP
    Then Verify the user can be able to provide workmen medical status
    Then Verify the user can be able to add workmen medical fitness status
    Then Verify the user can be able to add Medical Officer Details
    Then Verify the user can be able to submit medical Test details


  @Smoke_Induction__EHS_Create
  Scenario: Verify User can be Perform EHS - Safety Training for Workmen
    Given Login and Navigate to EHS
    Then Verify User can be able to search Workmen Profile EHS
    Then Verify User can be able to View Workmen profile EHS
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify user can be able to select workmen profile for EHS training
    Then Verify user can be able to select Training Program
    Then Verify user can be able to Submit Trainings
    #Then Verify user can be able to add EHS Material Issue - Not Developed Yet
    Then Verify user can be able to view Trainig Program

  @Smoke_Induction__Wage_Create
  Scenario: Verify User can be add wage details of a Workmen
    Given Login and Navigate to Wage
    Then Verify User can be able to View Workmen profile Wage
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify user can be able to select project Location
    Then Verify user can be able to select project Zone
    Then Verify user can be able to select Payout Duration
    Then Verify user can be able to enter Basic Earnings
    Then Verify user can be able to enter HRA Earnings
    Then Verify user can be able to enter Fixed Other Allowances in Earnings
    #Then Verify user can be able to enter Multiple Fixed Other Allowances in Earnings # Need to Implement
    #Then Verify user can be able to enter Other Allowances calculated by Percentage in Earnings   # Issue Raised
    #Then Verify Other Allowances amount calculated correctly
    Then Verify Total Provisional Earnings is displayed correctly
    Then Verify user can be able to enter PF Deduction
    Then Verify user can be able to enter ESI Deduction
    Then Verify user can be able to enter Professional Tax Deduction
    Then Verify user can be able to Other Recoveries in Deduction
    #Then Verify user can be able to enter Multiple Fixed Other Recoveries in Deductions # Need to Implement
    #Then Verify user can be able to enter Other Recoveries calculated by Percentage in Deductions   # Issue Raised
    Then Verify Total Provisional Deductions is displayed correctly
    Then Verify Total Wage amount is displayed correctly
    Then Verify user can be able to save Wage details
		
  @Smoke_Induction__Final_Approval_approve
  Scenario: Verify User can be able to Approve Workmen Induction Details
    Given Login and Navigate to Final Approval
    #Then Verify User can be able to search workmen by filter          # Issue Raised
    Then Verify User can be able to Expand and Collapse final approval window
    #Then Verify User can be able to Switch Pages in final approval window 		# Issue Raised
    Then Verify User can be able to View Workmen profile FA
    Then Verify Basic details in Workmen profile are displayed correctly FA
    Then Verify Skill Analysis in Workmen profile are displayed correctly FA
    Then Verify Medical Test in Workmen profile are displayed correctly FA
    Then Verify EHS in Workmen profile are displayed correctly FA
    Then Verify Wage in Workmen profile are displayed correctly FA
    Then Verify User can be able to Select Workmen Profile
    Then Verify Selected Workmen Profile Count Displayed
    Then Verify User can be able to Approve Induction details of Selected Workmen Profile
		
  @Smoke_Induction__Search_Domestic_Workmen
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Aadhaar
    Then Verify User can be able to Search Domestic Workmen With Workmen Number
    Then Verify User can be able to Search Domestic Workmen With Name and Father Name
    #Then Verify User can be able to Search Domestic Workmen With VisaPro ID #Issue 100085 Reported
    Then Verify User can be able to Search Domestic Workmen With Passport Number
    
  @Smoke_Daily_Attendance_upload
  Scenario: Verify user can be able to upload Daily Attendance of a workmen
    Given Login and Navigate to Attendance
    Then Verify User can be able to Upload Attendance Data via Cap file
    
 @Smoke_GatePass_Issue
  Scenario: Verify user can be able to Issue Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Issue Gate Pass

    
      @Smoke_DLR_Entry
  Scenario: Verify User can be able to Enter DLR for Job
    Description :  As a EIP User i should be able to Enter DLR for Job

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Selecting Current job for DLR Entery
    Then Selecting Date for DLR Entery
    Then Enter DLR Entry for Day shift Workmen
    Then Enter DLR Entry for Night shift Workmen
    Then DLR Entry Total Calculated Correctly
    Then Enter DLR Breakup Workmen Strenght
    Then Enter DLR Breakup Workmen at site
    Then Enter DLR Breakup Workmen Inducted
    Then Enter DLR Breakup Workmen Released
    Then Enter DLR Breakup Workmen Expected to Released
    Then Enter DLR Breakup Workmen Under Quarantine
    Then Enter DLR Breakup Workmen Affected by Covid
    Then DLR Breakup Calculated Correctly
    Then Verify User can be able to Save DLR Entry
    
      @Smoke_Add_Workmen_to_Room
 		Scenario: Add workmen to room
    Description :  As a EIP User i should be able to Add workmen to room

    Given Login and Navigate to Camp Management
		Then Verify User can be able to select room
    Then Verify User can be able to Add workmen to room
    Then Verify User can be able to view workmen details in room   
    
    	@Smoke_Configuration_RoleMapping
  	Scenario: Verify User can be able to map role for user
    Description :  As a EIP User i should be able to map role for user

		Given Login and Navigate to Configuration
		Then Verify User can be able to select Job
		Then Verify user can be able to Navigate to Role Mapping
		Then Verify user can be able to add Time Office role for user
		Then Verify user can be able to add IR Manager role for user 
		Then Verify user can be able to add Accounts role for user 
		Then Verify user can be able to add Skill Approver role for user 
		Then Verify user can be able to add Paramedics role for user 
		Then Verify user can be able to add Medical Officer role for user
		Then Verify user can be able to add Safety Officer role for user 
