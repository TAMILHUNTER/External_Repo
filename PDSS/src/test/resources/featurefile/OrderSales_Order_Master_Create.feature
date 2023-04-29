@Regression 
Feature: Order Master - CREATE

  Background: 
    Given Go to Test Environment



  #Test Case - 1
  @OrderMasterCreate @PDSS
  Scenario Outline: To verify the landing page of Create in Order Master
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
    Then Click on Create in Order Master
     Then Logout

    Examples: 
      | Username   |
      | SUMANTA.KM |

  #Test Case - 2
  @OrderMasterCreatse @PDSSsdfdfwwww @cimissue
  Scenario Outline: To verify whether order is created successfully
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Change the Order Expiry Date
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button in the Create Page of Order Master
     Then Logout

    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | ExpiryDate | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | DO01900  | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27-09-2028 | 27/04/2017   |

  #Test Case - 3
  @OrderMasterCreate @PDSS
  Scenario Outline: To verify whether order is created successfully for Updation
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Change the Order Expiry Date
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button in the Create Page of Order Master
     Then Logout

    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | ExpiryDate | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | DO01900  | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27-09-2028 | 27/04/2017   |

  #Test Case - 4
  @OrderMasterCreated @PDSS
  Scenario Outline: To verify whether order is created successfully for Closure
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Change the Order Expiry Date
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button in the Create Page of Order Master
     Then Logout

    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | ExpiryDate | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | DO01900  | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27-09-2028 | 27/04/2017   |

  #Test Case - 5
  @OrderMasterCreate @PDSS
  Scenario Outline: To verify whether order is created successfully for Approval
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Change the Order Expiry Date
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button in the Create Page of Order Master
     Then Logout

    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | ExpiryDate | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | DO01900  | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27-09-2028 | 27/04/2017   |

  #Test Case - 6
  @OrderMasterCreate @PDSS
  Scenario Outline: To verify the whether order expiry date is greater than Order Start Date.
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Set the Order Expiry Date as <Exp>
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button
    Then Check the validation message for Order Expiry Date when it is greater than start date
 Then Logout
    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | Exp        | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | CO0173   | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27/04/2021 | 27/04/2017   |

  #Test Case - 7
  @OrderMasterCreate @PDSS
  Scenario Outline: To verify the whether order expiry date is lesser than Order Finish Date.
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Set the Order Expiry Date as <Exp>
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button
    Then Check the validation message for Order Expiry Date when it is lesser than finish date
 Then Logout
    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | Exp        | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | CO0173   | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27/03/2022 | 27/03/2018   |

  #Test Case - 8
  @OrderMasterCreate @PDSS
  Scenario Outline: To verify the whether order reference date is lesser than or equal to Order Start Date.
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
    Then Click on Create in Order Master
    Then Click on Order Type
    Then Select the Order Type
    Then Enter the Order Description as <OrderDesc>
    Then Enter the Job Code as <JobCode>
    Then Select the Job Code
    Then Set the Order Expiry Date as <Exp>
    Then Enter the Customer as <Customer>
    Then Select the Customer
    Then Click the Customer Branch
    Then Select the Customer Branch
    Then Enter the Order Reference Number as <OrderRefNumber>
    Then Enter the Tender Reference Number as <TenderRefNumber>
    Then Enter the Tender Description as <TenderDescription>
    Then Enter the Our Reference Number as <OurRefNumber>
    Then Select the Order Reference Date as <OrderRefDate>
    Then Click on Despatch
    Then Enter the Invoice Message as <InvoiceMessage>
    Then Click on Ok button of Despatch Pop up
    Then Click on Commercial
    Then Click on Billing Type
    Then Choose the Billing Type as Direct Billing
    Then Enter the Order Value as <OrderValue>
    Then Click on Ok button of Commercial Pop up
    Then Click on Submit button
    Then Check the validation message for Order Reference Date should be lesser than or equal to Order date
 Then Logout
    Examples: 
      | Username   | OrderDesc       | JobCode  | Customer | OrderRefNumber | TenderRefNumber | TenderDescription | OurRefNumber | InvoiceMessage   | OrderValue | Exp        | OrderRefDate |
      | SUMANTA.KM | Automated Order | LE21M006 | CO0173   | ORN453535      | TRN345435       | Good Tender       | ORN676       | Despatch on June |     200000 | 27/06/2022 | 27/06/2022   |
