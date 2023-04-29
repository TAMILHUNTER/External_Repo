@Regression
Feature: Order Master - CLOSE

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @OrderMasterClose @PDSS @Doubt
  Scenario Outline: To verify the landing page of Close page of Order Master
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
    Then Click on Close in Order Master
     Then Logout

    Examples: 
      | Username |
      | kkb      |

  #Test Case - 2
  @OrderMasterClose @PDSSsdfdf
  Scenario Outline: To verify the Approved Order is able to Close
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
    Then Click on Close in Order Master
    Then Enter the Order Number in the Close Page of Order Master
    Then Select the Order Number in the Close Page of Order Master
    Then Click on Go button in the Close page of Order Master
    Then Click the Check Box in the Close Page to Approve the Order
    Then Click on Submit in the Close Page of Order Master
 Then Logout
    Examples: 
      | Username |
      | kkb      |

  #Test Case - 3
  @OrderMasterClose @PDSS @Checkbox
  Scenario Outline: To verify the multiple Approved Orders are able to Close
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
    Then Click on Close in Order Master
    Then Click on Go button in the Close page of Order Master
    Then Click the Check Box in the Close Page to Approve the Order
    Then Click on Submit in the Close Page of Order Master
 Then Logout
    Examples: 
      | Username |
      | kkb      |

  #Test Case - 4
  @OrderMasterClose @PDSS
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
    Then Click on Close in Order Master
    Then Enter the Order Number in the Close Page of Order Master
    Then Select the Order Number in the Close Page of Order Master
    Then Click on Go button in the Close page of Order Master
    Then Click on Submit in the Close Page of Order Master
    Then Validate the validation message gets displayed when the user is not selected the Check Box
 Then Logout
    Examples: 
      | Username |
      | KKB      |

  #Test Case - 5
  @OrderMasterClose @PDSS
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
    Then Click on Close in Order Master
    Then Click on Submit in the Close Page of Order Master
    Then Validate the validation message gets displayed when the user is not selected the Check Box
 Then Logout
    Examples: 
      | Username |
      | KKB      |
