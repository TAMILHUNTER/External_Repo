@Camp_Create
Feature: Feature : Management () 
  *********************************************
  UserStory: Camp Management () 
  *********************************************
  Description :  As a EIP User i should be able to Create Camp for Workmen
  ******************************************************************************************

 		@Add_New_Camp
  	Scenario: Add New Camp
    Description :  As a EIP User i should be able to Add New Camp

		Given Login and Navigate to Camp Management
    Then Verify User can be able to add camp name
    Then Verify User can be able to add camp address
    Then Verify User can be able to add camp Pincode
    Then Verify User can be able to save camp details   
    
 		@Add_Camp_Structure
  	Scenario: Add Camp Structure
    Description :  As a EIP User i should be able to Add Camp Structure

    Given Login and Navigate to Camp Management
    Then Verify User can be able to Add Camp Structure name
    Then Verify User can be able to Add Room count to Camp Structure
    Then Verify User can be able to save camp Structure details
    
    
    
    @Add_Camp_Structure_Room
  	Scenario: Add Camp Structure Room
    Description :  As a EIP User i should be able to Add Camp Structure Room

    Given Login and Navigate to Camp Management
		Then Verify User can be able to Add Camp room name
    Then Verify User can be able to Add max bed count in room
    Then Verify User can be able to Add area size of room
    Then Verify User can be able to save camp room details
    
    @Add_Workmen_to_Room
 		Scenario: Add workmen to room
    Description :  As a EIP User i should be able to Add workmen to room

    Given Login and Navigate to Camp Management
		Then Verify User can be able to select room
    Then Verify User can be able to Add workmen to room
    Then Verify User can be able to view workmen details in room
 