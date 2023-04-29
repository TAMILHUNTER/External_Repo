
@Scrutiny
Feature: Finance Scrutiny

	UserStroy : Stright Case Full Flow
	
	Description : As A EIP User i Should be able to Finance Scrutiny
	
	Scenario: Scrutiny From Single Material
	
	Given Login Function
	And Navigate Menu From Scrutiny
	And Click on Filter Icon 
	And Pass Invoice Reg No From DB Connection
	And Edit Scrutinize Material
	And Get Work Order No In Text
	And Submit Scrutinize
	And Signout Function
	
 