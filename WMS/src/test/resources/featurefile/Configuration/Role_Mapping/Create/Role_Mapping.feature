@Configuration_RoleMapping
Feature: Feature : Configuration () 
  *********************************************
  UserStory: Role Mapping () 
  *********************************************
  Description :  As a EIP User i should be able to map role for user
  ******************************************************************************************

 		@Add_RoleMapping
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
		
		
		@Remove_RoleMapping
  	Scenario: Verify User can be able to remove role for user
    Description :  As a EIP User i should be able to remove role for user

		Given Login and Navigate to Configuration
		Then Verify User can be able to select Job
		Then Verify user can be able to Navigate to Role Mapping
		Then Verify user can be able to Remove Time Office role for user
		Then Verify user can be able to Remove IR Manager role for user 
		Then Verify user can be able to Remove Accounts role for user 
		Then Verify user can be able to Remove Skill Approver role for user 
		Then Verify user can be able to Remove Paramedics role for user 
		Then Verify user can be able to Remove Medical Officer role for user
		Then Verify user can be able to Remove Safety Officer role for user 