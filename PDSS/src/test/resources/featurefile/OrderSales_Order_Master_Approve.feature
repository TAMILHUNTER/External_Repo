@Regression
Feature: Order Master - APPROVAL

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @OrderApproval @PDSS @OrderMaster @Regression1
  Scenario Outline: To verify the landing page of Approval page in the Order Master
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Order and Sales
    Then Click on Manufacturing Orders
    Then Click on Approval in Order Master
     Then Logout

    Examples: 
      | Username |
      | KKB      |

  #Test Case - 2
  @OrderApprovalCheckF @PDSS @Regression1
  Scenario Outline: To verify whether the validation message gets displayed when no orders are selected for approval
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Order and Sales
    Then Click on Manufacturing Orders
    Then Click on Approval in Order Master
    Then Click on Submit in the Approval Page of Order Master
    Then Validate the validation message gets displayed when the user not selected any order for approval
     Then Logout

    Examples: 
      | Username |
      | KKB      |

  #Test Case - 3
  @OrderApprovalF @PDSS @Regression10
  Scenario Outline: To verify whether the Order gets Approved
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Order and Sales
    Then Click on Manufacturing Orders
    Then Click on Approval in Order Master
    Then Enter the Order Number in the Approval Page of Order Master
    Then Select the Order Number in the Approval Page of Order Master
    Then Click on Go button in the Approval page of Order Master
    Then Click the Check Box in the Approval Page to Approve the Order
    Then Click on Submit in the Approval Page of Order Master
     Then Logout

    Examples: 
      | Username |
      | KKB      |

  #Test Case - 4
  @OrderApproval @PDSS @Multi @Regression1
  Scenario Outline: To verify whether the multiple Order gets Approved
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Order and Sales
    Then Click on Manufacturing Orders
    Then Click on Approval in Order Master
    Then Click on Go button in the Approval page of Order Master
    Then Click the Check Box in the Approval Page to Approve the Order
    Then Click the Second Check Box in the Approval Page to Approve the Order
    Then Click on Submit in the Approval Page of Order Master
     Then Logout

    Examples: 
      | Username |
      | KKB      |

  #Test Case - 5
  @OrderApproval @PDSS @Regression1
  Scenario Outline: To verify whether the Order gets Rejected
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Order and Sales
    Then Click on Manufacturing Orders
    Then Click on Approval in Order Master
    Then Enter the Order Number in the Approval Page of Order Master
    Then Select the Order Number in the Approval Page of Order Master
    Then Click on Go button in the Approval page of Order Master
    Then Click the Reject Check Box in the Approval Page to Approve the Order
    Then Click on Submit in the Approval Page of Order Master
     Then Logout

    Examples: 
      | Username |
      | KKB      |
