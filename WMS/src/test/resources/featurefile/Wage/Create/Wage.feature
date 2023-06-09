@Wage_Master
Feature: Feature : Wage () 
  *********************************************
  UserStory: Wage () 
  *********************************************
  Description :  As a EIP User i should be able to View Wage Details
  ******************************************************************************************

 		@Wage_Master_View
  	Scenario: Verify User can be able to View Wage Details
    Description :  As a EIP User i should be able to View Wage Details

		Given Login and Navigate to Main Wage
		Then Verify User can be able to select State
		Then Verify User can be able to select Shedule of Employment
		Then Verify User can be able to Get Wage Data

		