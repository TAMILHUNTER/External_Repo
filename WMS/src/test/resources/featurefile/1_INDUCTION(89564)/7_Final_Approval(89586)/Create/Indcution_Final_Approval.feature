@Induction_Final_Approval
Feature: Feature : Induction (89564) UserStory: Final Approval (89586)
*********************************************
  UserStory: Final Approval (89586)
  *********************************************
  Description : As a EIP Induction Approver User i should be able to Approve or Reject Workmen Induction Details
******************************************************************************************************************
  @Induction_Final_Approval_approve
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
    
  #@Induction_Final_Approval_Reject  	 # Need Clarification on this scenario with Dev
  #Scenario: Verify User can be able to Approve Workmen Induction Details
    #Given Login and Navigate to Final Approval
    #Then Verify User can be able to search workmen by filter          # Issue Raised 
    #Then Verify User can be able to View Workmen profile FA
    #Then Verify Basic details in Workmen profile are displayed correctly
    #Then Verify Skill Analysis in Workmen profile are displayed correctly
    #Then Verify Medical Test in Workmen profile are displayed correctly
    #Then Verify EHS in Workmen profile are displayed correctly
    #Then Verify Wage in Workmen profile are displayed correctly
    #Then Verify User can be able to Select Workmen Profile
    #Then Verify Selected Workmen Profile Count Displayed
    #Then Verify User can be able to Approve Induction details of Selected Workmen Profile

    

  
  

