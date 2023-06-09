@Configuration_Calender
Feature: Feature : Configuration () 
  *********************************************
  UserStory: Calender () 
  *********************************************
  Description :  As a EIP User i should be able to add calender for Holidays
  ******************************************************************************************

 		@Add_Festival_or_National_Holidays_Calender
  	Scenario: Verify User can be able to add Festival/National Holidays to calender 
    Description :  As a EIP User i should be able to add Festival/National Holidays to calender 

		Given Login and Navigate to Configuration
		Then Verify User can be able to select Job
		Then Verify user can be able to Navigate to Calender
		Then Verify user can be able to select Year for Calender Master
		Then Verify user can be able to view Total Holidays for selected Year
		Then Verify user can be able to view existing Festival or National Holidays for selected Year
		Then Verify user can be able to view existing Regular Holidays for selected Year
		Then Verify user can be able to select Year to add Festival or National Holiday
		Then Verify user can be able to select month to add Festival or National Holiday
		Then Verify user can be able to select date to add Festival or National Holiday
		Then Verify user can be able to view date selected for Festival or National Holiday
		Then Verify user can be able to select Holiday type
		Then Verify user can be able to description of Holiday
		Then Verify user can be able to save Holiday
		Then Verify user can be able to submit saved Holiday list
		
		@Add_Regular_Holidays_Calender
  	Scenario: Verify User can be able to add Regular Holidays to calender 
    Description :  As a EIP User i should be able to add Regular Holidays to calender 

		Given Login and Navigate to Configuration
		Then Verify User can be able to select Job
		Then Verify user can be able to Navigate to Calender
		Then Verify user can be able to select Year for Calender Master
		Then Verify user can be able to view Total Holidays for selected Year
		Then Verify user can be able to view existing Regular Holidays for selected Year
		Then Verify user can be able to select Regular Holiday type
		Then Verify user can be able to select Regular Holiday Day
		Then Verify user can be able to save Regular Holiday
		Then Verify user can be able to submit saved Holiday list
		
			@Add_Festival_or_National_and_Regular_Holidays_Calender
  	Scenario: Verify User can be able to add Festival/National and Regular Holidays to calender 
    Description :  As a EIP User i should be able to add Festival/National and Regular Holidays to calender
    
    Given Login and Navigate to Configuration
		Then Verify User can be able to select Job
		Then Verify user can be able to Navigate to Calender
		Then Verify user can be able to select Year for Calender Master
		Then Verify user can be able to view Total Holidays for selected Year
		Then Verify user can be able to view existing Festival or National Holidays for selected Year
		Then Verify user can be able to view existing Regular Holidays for selected Year
		Then Verify user can be able to select Year to add Festival or National Holiday
		Then Verify user can be able to select month to add Festival or National Holiday
		Then Verify user can be able to select date to add Festival or National Holiday
		Then Verify user can be able to view date selected for Festival or National Holiday
		Then Verify user can be able to select Holiday type
		Then Verify user can be able to description of Holiday
		Then Verify user can be able to save Holiday
		Then Verify user can be able to select Regular Holiday type
		Then Verify user can be able to select Regular Holiday Day
		Then Verify user can be able to save Regular Holiday
		Then Verify user can be able to submit saved Holiday list
		
		
		
		@Remove_Festival_or_National_Holidays_Calender
  	Scenario: Verify User can be able to remove Festival/National Holidays to calender 
    Description :  As a EIP User i should be able to remove Festival/National Holidays to calender 

		Given Login and Navigate to Configuration
		Then Verify User can be able to select Job
		Then Verify user can be able to Navigate to Calender
		Then Verify user can be able to select Year for Calender Master
		Then Verify user can be able to view Total Holidays for selected Year
		Then Verify user can be able to Remove existing Festival or National Holidays for selected Year
		