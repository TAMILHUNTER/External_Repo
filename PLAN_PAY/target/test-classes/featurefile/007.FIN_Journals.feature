
@Journals
Feature: Finance Journals

	UserStroy : Stright Case Full Flow
	
	Description : As A EIP User i Should be able to Finance Journals
	
	Scenario: Journals From Single Material 
	
	Given Login Function Journals
	And Navigate Menu From Journals
	And Click on Filter Icon Journals
	And Pass Invoice Regs No From DB Connection
	And Edit Journals Material
	And Check Work Order No in page
	And Submit Journals
	And signout Function


