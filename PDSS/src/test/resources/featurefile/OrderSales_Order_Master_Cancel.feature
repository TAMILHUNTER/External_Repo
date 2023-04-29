@Regression
Feature: Order Master - CANCEL

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @OrderMasterCancel @PDSS @Regression1
  Scenario Outline: To verify the landing page of Cancel page of Order Master
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
    Then Click on Cancel in Order Master
     Then Logout

    Examples: 
      | Username  |
      | Kumarendu |

  #Test Case - 2
  @OrderMasterCancel @PDSSdfdf @Regression1
  Scenario Outline: To verify whether Order is able to Cancel
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
    Then Click on Cancel in Order Master
    Then Enter the Order Number in the Cancel Page of Order Master
    Then Select the Order Number in the Cancel Page of Order Master
    Then Click on Go button in the Cancel page of Order Master
    Then Click the Check Box in the Cancel Page to Approve the Order
    Then Click on Submit in the Cancel Page of Order Master
     Then Logout

    Examples: 
      | Username  |
      | Kumarendu |

  #Test Case - 3
  @OrderMasterCancel @PDSS @Regression1
  Scenario Outline: To verify whether multiple Orders are able to Cancel
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
    Then Click on Cancel in Order Master
    Then Click on Go button in the Cancel page of Order Master
    Then Click the Check Box in the Cancel Page to Approve the Order
    Then Click the Second Check Box in the Cancel Page to Approve the Order
    Then Click on Submit in the Cancel Page of Order Master
     Then Logout

    Examples: 
      | Username  |
      | Kumarendu |

  #Test Case - 4
  @OrderMasterCancel @PDSS @Regression1
  Scenario Outline: To verify whether the validation message for Selecting the Document is displayed
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
    Then Click on Cancel in Order Master
    Then Enter the Order Number in the Cancel Page of Order Master
    Then Select the Order Number in the Cancel Page of Order Master
    Then Click on Go button in the Cancel page of Order Master
    Then Click on Submit in the Cancel Page of Order Master
    Then Validate the validation message gets displayed when the user is not selected the Check Box
 Then Logout
    Examples: 
      | Username  |
      | Kumarendu |

  #Test Case - 5
  @OrderMasterCancel @PDSS @Regression1
  Scenario Outline: To verify whether the validation message for entering the Order is displayed
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
    Then Click on Cancel in Order Master
    Then Click on Submit in the Cancel Page of Order Master
    Then Validate the validation message gets displayed when the user is not selected the Check Box
 Then Logout
    Examples: 
      | Username  |
      | Kumarendu |
