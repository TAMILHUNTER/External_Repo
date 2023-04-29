@Smoke
Feature: Smoke_Suite
  *********************************************
  Description :  Running_Smoke_Suite_Test_cases
  ************************************************

  @Induction_Create_Basic_Details_Submit_workman_details_Smoke
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    Then Verify save and submit workman details

  @Induction_SkillAnalysis_Create_Smoke
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

  #Then Verify User can be able to remove record
  @Induction_Paramedics_Create_Smoke
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
   #Then Verify User can be able to fetch paramedics details

  @Induction_MedicalTest_Create_Smoke
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


  @Induction_EHS_Create_Smoke
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

 @Induction_Wage_Create_Smoke
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
		
		@Induction_Final_Approval_approve_Smoke
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
		
		@Workforce_Allocation_Workman_Search_DashBorad_Smoke
  Scenario: Verify Personal in Basic Details are displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    
      @Daily_Attendance_upload_Smoke
  Scenario: Verify user can be able to upload Daily Attendance of a workmen
    Given Login and Navigate to Attendance
    Then Verify User can be able to Upload Attendance Data via Cap file
    
      @GatePass_Issue_Smoke
  Scenario: Verify user can be able to Issue Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Issue Gate Pass
    
    
  @Induction_View_Workman_Profile_Dashboard_smoke
  Scenario: View Workman Profile
    Given Navigate to Induction Dashboard
    Then Search workmen by Aadhar
    Then Search workmen by Employee ID
    Then Verify User can able to View workman Profile
