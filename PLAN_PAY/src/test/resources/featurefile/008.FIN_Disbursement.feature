
@Disbursement
Feature: Collection and Disbursement

  UserStory: Full Flow
  
  Description :  As a EIP User i should be able to Create Collection and Disbursement
  
   Scenario: Collection and Disbursement Creation
   
   Given Login Function Disbursement
   And Navigate Menu From Disbursement
   And Select Document Type
   And Click on Go Icon
   And Click  Filter Icon
   And Pass Document No From DB Connection 
   And Click on Disburse
   And PopHandle in Select Material
   And Select Bank Name
   And Submit Disbursement
   And Handle Popup Confirmation
   And Signout Function Disbursement