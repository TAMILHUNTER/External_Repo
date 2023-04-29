@Invoice_Registration_For_Action_Create
Feature: FAS-Accounts Payable (290) UserStory: FAS-ACP-Invoice Registration (291)
  ******************************************************************************************
  UserStory: FAS-ACP-Invoice Registration (291)
  **********************************************  
  Description :  As a EIP User i should be able to Create Invoice Registration from For Action
  **********************************************************************************************

  @Invoice_Registration_For_Action_Create_Invoice_against_Purchase_Order
  Scenario: Verify User can be able to Create Invoice Registration against Purchase Order
    Description :  As a EIP User i should be able to Create Invoice Registration against Purchase Order

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Document Purchase Order for PO Advance_Create
    Then Verify User can be able to Create Invoice Registration against PO Number
    

  @Invoice_Registration_For_Action_Create_Purchase_Order_Details
  Scenario: Verify User can be able to View Purchase Order Details
    Description :  As a EIP User i should be able to View Purchase Order Details
     Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Document Purchase Order for PO Advance_Create
    Then Verify User can be able to View Details of PO Number
    Then Verify User can be able to View Process Folow of PO
    Then Verify User can be able to View PO Details
    #Then Verify User can be able to View Material List of PO
    #Then Verify User can be able to View Payment Terms of PO
    #Then Verify User can be able to View Liquidity Damage of PO
    #Then Verify User can be able to View Other Cost of PO
    #Then Verify User can be able to View Defect Liability Period of PO
    #Then Verify User can be able to View Additional Terms and Conditions of PO
    #Then Verify User can be able to View Tax Details of PO
    #Then Verify User can be able to View Shipment Details of PO
    #Then Verify User can be able to View Trade Details of PO
    #Then Verify User can be able to View Essential Details of PO