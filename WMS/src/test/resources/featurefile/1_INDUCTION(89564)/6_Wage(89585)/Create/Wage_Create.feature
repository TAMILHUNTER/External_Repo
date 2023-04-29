@Induction_Wage
Feature: Feature : Induction (89564) UserStory: Wage (89585)
*********************************************
  UserStory: Wage (89585)
  *********************************************
  Description : As a EIP User i should be able to Enter Wage Details of a workmen
******************************************************************************************
  @Induction_Wage_Create
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
		