@FIN_BankPaymentBooking
Feature: FAS-Cash and Bank Voucher (283) FAS_CBV_Cash_and_Bank_Enhancements(453)
  ******************************************************************************************
  UserStory: FAS_CBV_Cash_and_Bank_Enhancements(453)
  **********************************************  
  Description :  Verify User can be able to create a Cash Bank Request
  **********************************************************************************************

  Background: 
    Given Go to Test Environment

  @FIN_Validation
  Scenario: Create General Request - FIN Page Navigation and Home Page Validation in Bank Payment Booking
    Then Select otheruser in EIP40 login page
    Then Enter Username in EIP40 login page
    Then Enter Password in EIP40 login page
    Then Select Login Button in EIP40 login page
    Then Select Access Based Menu in EIP40 Home Page
    Then Select Finance in Access Based Menu
    Then Select Financial Accounts in Access Based Menu
    Then Select GeneralCashBankRequest in Access Based Menu
    Then Verify whether the Header of General Cash / Bank Request is displayed in FIN Home page
    Then Verify whether the Menu of For Action is Available in General Cash Bank Request Page
    Then Verify whether the Menu of In Progress is Available in General Cash Bank Request Page
    Then Verify whether the Menu of Approved is Available in General Cash Bank Request Page
    Then Verify whether the Menu of Paid and Received is Available in General Cash Bank Request Page
    Then Verify whether the Menu of All is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Document No is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Remarks is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Document Type is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Currency is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Total Amount is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Mode is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Favouring is Available in General Cash Bank Request Page
    Then Verify whether the Column Name of Status is Available in General Cash Bank Request Page

  @Navigation
  Scenario: Create General Request - FIN Page Navigation to Bank Payment Booking
    Then EIP 4 0 Login Page
    Then Navigate to General Cash Bank Request Page
    Then Select Create Button in General Cash Bank Request Page
    Then Verify whether the Text of Create Request is Available in General Cash Bank Request Page
    #Then Verify whether the Text of  Register Details  is Available in General Cash Bank Request Page
    Then Verify whether the Text of  Page Details  is Available in General Cash Bank Request Page
    Then Select Job Cart in General Cash Bank Request Page
    Then Verify whether the Text of Job Cart is Available in General Cash Bank Request Page
    Then Verify whether the Header of Job Cart is Available in General Cash Bank Request Page
    Then Verify whether the Header of Selected Items is Available in General Cash Bank Request Page
    Then Select Post Button in General Cash Bank Request Page
    Then Verify whether the Text of Validation Message is Available in General Cash Bank Request Page
    Then Select OK Button in General Cash Bank Request Page
    Then Select Close Icon to close the Job Cart
    Then Select Upload Document in General Cash Bank Request Page

  # Then Select Cancel Icon in Upload Document
  # Then Select Upload Document Button in Attached Document
  #Then Select Close Button in Attached Document
  @Create
  Scenario: Create General Request - FIN Page Navigation to Bank Payment Booking
    Then EIP 4 0 Login Page
    Then Navigate to General Cash Bank Request Page
    Then Select Create Button in General Cash Bank Request Page
    Then Select Document type in General Cash Bank Request Page
    Then Select Register Type in General Cash Bank Request Page
    Then Select Job Code in General Cash Bank Request Page
    Then Select Accounting Center in General Cash Bank Request Page
    Then Select Voucher Amount in General Cash Bank Request Page
    Then Select Favouring in General Cash Bank Request Page
    Then Select Purpose in General Cash Bank Request Page
    Then Select Mode in General Cash Bank Request Page
    Then Select Due Date in General Cash Bank Request Page
    Then Select Job Cart Icon in General Cash Bank Request Page