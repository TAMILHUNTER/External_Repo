
@Bill
Feature: Bill Creation

	UserStroy : Stright Case Full Flow
	
	Description : As A EIP User i Should be able to Bill Create
	
	Scenario: Bill Create Single Material
	
	Given Login UserName and Password For Bill Creation
	And Navigate From Menu to Bill Create
	And Click on Filter Icon To Pass value 
	And Create to Bill Create
	And Click On Measurment Details 
	And Select Material in Radio Box
	And Approve Qty
	And Select On Measurment Material 
	And This Qty Change
	And Save Measurement Approve Qty
	And Close to Page Measurment in This Qty
	And Submit Measurment and Pop Handle 
	And Sign Out
  
	Scenario: Bill Deduction Single Material
	
	When Login UserName and Password For Bill Deduction
	And Navigate From Menu to Bill Deduction
	And Click on Inprogess to Select Material 
	And MouseOver to Click on Bill Deduction Icon  
	And TDS Update Click to Select to selection
	And save to TDS Update
	And Sub contractor Invoice Value Pass 
	And Invoice Date Select
	And Select on Payment Type
	And Submit to Bill Deduction
	And Sign Out1
	
	Scenario: Bill Approve Single Material
	Then Login UserName and Password For Bill Approve
	And Click to Filter Icon 
	And Click Document No and pass value
	And MouseOver to Document No
	And Approve to Bill 
	And Sign Out2
	 