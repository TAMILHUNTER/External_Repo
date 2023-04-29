@Invoice_Registration_For_Action_Common
Feature: FAS-Accounts Payable (290) UserStory: FAS-ACP-Invoice Registration (291)
  ******************************************************************************************
  UserStory: FAS-ACP-Invoice Registration (291)
  **********************************************  
  Description :  As a EIP User i should be able to Create Invoice Registration from For Action
  **********************************************************************************************

  @Invoice_Registration_For_Action_Advanced_Search
  Scenario: Verify User can be able to Search Invoice Documents from Advanced Search option
    Description :  As a EIP User i should be able to Search Invoice Documents from Advanced Search option

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Read Dashboard Tips
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Document Purchase Order for PO Advance
    Then Verify User can be able to search Invoices by Document Purchase Order for MRN
    Then Verify User can be able to search Invoices by Document Work Order
    Then Verify User can be able to search Invoices by Document MRN
    Then Verify User can be able to search Invoices by Job
    Then Verify User can be able to search Invoices by Selecting Multiple job
    Then Verify User can be able to Deselecting the job
    Then Verify User can be able to search Invoices by Selecting All job
    Then Verify User can be able to Deselecting All job
    Then Verify User can be able to search Invoices by Vendor
    Then Verify Vendor Details are displayed correctly
    Then Verify User can be able to search Invoices by Cluster Elements Independent Company
    Then Verify User can be able to search Invoices by Cluster Elements Strategic Bussiness Group
    Then Verify User can be able to search Invoices by Cluster Elements Bussiness Unit
    Then Verify User can be able to search Invoices by Cluster Elements Segment
    Then Verify User can be able to search Invoices by Cluster Elements Cluster Office
    Then Verify User can be able to search Invoices by Cluster Elements Region
    Then Verify User can be able to search Invoices by Cluster Elements Location
    Then Verify User can be able to search Invoices by Cluster Elements Zone
    Then Verify User can be able to search Invoices by Cluster Elements Area
    Then Verify User can be able to search Invoices by Cluster Elements Combined
    Then Verify User can be able to search Invoices by Date

  @Invoice_Registration_For_Action_List
  Scenario: Verify User can be able to view List Details of Invoice Documents
    Description :  As a EIP User i should be able to view List Details of Invoice Documents

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Change List of Records for the past days
    Then Verify User can be able to Change List of Records displayed per page
    Then Verify User can be able to Refresh List Records

  @Invoice_Registration_For_Action_Filter
  Scenario: Verify User can be able to view List Details of Invoice Documents
    Description :  As a EIP User i should be able to view List Details of Invoice Documents

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Filter List of Records by Order No
    Then Verify User can be able to Filter List of Records by Order Type
    Then Verify User can be able to Filter List of Records by Order Date
    Then Verify User can be able to Filter List of Records by Type
    Then Verify User can be able to Filter List of Records by Currency
    Then Verify User can be able to Filter List of Records by Order Amount
    Then Verify User can be able to Filter List of Records by Tolarance Amount
    Then Verify User can be able to Filter List of Records by Tolarance MRN or Bill Count
    Then Verify User can be able to Filter List of Records by Tolarance Invoice Regn Count
    Then Verify User can be able to Filter List of Records by Tolarance Cheque number
    Then Verify User can be able to Filter List of Records by Tolarance Cheque Date
    Then Verify User can be able to Filter List of Records by Tolarance Cheque Amount
    Then Verify User can be able to Filter List of Records by Payment Transaction Ref No
    Then Verify User can be able to Filter List of Records by NEFT Unique Ref No
    Then Verify User can be able to Filter List of Records by Payment Transaction Date
    Then Verify User can be able to Filter List of Records by Payment Mode
    Then Verify User can be able to Filter List of Records by NEFT Amount
    Then Verify User can be able to Filter List of Records by Claim

  @Invoice_Registration_For_Action_Settings_Freeze_and_unFreeze
  Scenario: Verify User can be able to Freeze or Unfreeze column in settings menu
    Description :  As a EIP User i should be able to Freeze or Unfreeze column in settings menu

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Freeze Order No Column in the List
    Then Verify User can be able to Un Freeze Order No Column in the List
    Then Verify User can be able to Freeze Order Date Column in the List
    Then Verify User can be able to Un Freeze Order Date Column in the List
    Then Verify User can be able to Freeze Type Column in the List
    Then Verify User can be able to Un Freeze Type Column in the List
    Then Verify User can be able to Freeze Currency Column in the List
    Then Verify User can be able to Un Freeze Currency Column in the List
    Then Verify User can be able to Freeze Order Amount Column in the List
    Then Verify User can be able to Un Freeze Order Amount Column in the List
    Then Verify User can be able to Freeze Tolarance Amount Column in the List
    Then Verify User can be able to Un Freeze Tolarance Amount Column in the List
    Then Verify User can be able to Freeze Tolarance MRN or Bill Count Column in the List
    Then Verify User can be able to Un Freeze Tolarance MRN or Bill Count Column in the List
    Then Verify User can be able to Freeze Tolarance Invoice Regn Count Column in the List
    Then Verify User can be able to Un Freeze Tolarance Invoice Regn Count Column in the List
    Then Verify User can be able to Freeze Tolarance Cheque number Column in the List
    Then Verify User can be able to Un Freeze Tolarance Cheque number Column in the List
    Then Verify User can be able to Freeze Tolarance Cheque Date Column in the List
    Then Verify User can be able to Un Freeze Tolarance Cheque Date Column in the List
    Then Verify User can be able to Freeze Tolarance Cheque Amount Column in the List
    Then Verify User can be able to Un Freeze Tolarance Cheque Amount Column in the List
    Then Verify User can be able to Freeze Payment Transaction Ref No Column in the List
    Then Verify User can be able to Un Freeze Payment Transaction Ref No Column in the List
    Then Verify User can be able to Freeze NEFT Unique Ref No Column in the List
    Then Verify User can be able to Un Freeze NEFT Unique Ref No Column in the List
    Then Verify User can be able to Freeze Payment Transaction Date Column in the List
    Then Verify User can be able to Un Freeze Payment Transaction Date Column in the List
    Then Verify User can be able to Freeze Payment Mode Column in the List
    Then Verify User can be able to Un Freeze Payment Mode Column in the List
    Then Verify User can be able to Freeze NEFT Amount Column in the List
    Then Verify User can be able to Un Freeze NEFT Amount Column in the List
    Then Verify User can be able to Freeze Claim Column in the List
    Then Verify User can be able to Un Freeze Claim Column in the List

  @Invoice_Registration_For_Action_Settings_Freeze_and_unFreeze_Random
  Scenario: Verify User can be able to Freeze or Unfreeze Random column in settings menu
    Description :  As a EIP User i should be able to Freeze or Unfreeze Random column in settings menu

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Freeze Column in the List_Random
    Then Verify User can be able to Un Freeze Column in the List_Random

  @Invoice_Registration_For_Action_Settings_Disable_or_Enable_Column_View
  Scenario: Verify User can be able to Disable or Enable column view in settings menu
    Description :  As a EIP User i should be able Enable or Disable column view in settings menu

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Disable Order No Column View  in the Document List View
    Then Verify User can be able to Enable Order No Column View  in the Document List View
    Then Verify User can be able to Disable Order Date Column View  in the Document List View
    Then Verify User can be able to Enable Order Date Column View  in the Document List View
    Then Verify User can be able to Disable Type Column View  in the Document List View
    Then Verify User can be able to Enable Type Column View  in the Document List View
    Then Verify User can be able to Disable Currency Column View  in the Document List View
    Then Verify User can be able to Enable Currency Column View  in the Document List View
    Then Verify User can be able to Disable Order Amount Column View  in the Document List View
    Then Verify User can be able to Enable Order Amount Column View  in the Document List View
    Then Verify User can be able to Disable Tolarance Amount Column View  in the Document List View
    Then Verify User can be able to Enable Tolarance Amount Column View  in the Document List View
    Then Verify User can be able to Disable Tolarance MRN or Bill Count Column View  in the Document List View
    Then Verify User can be able to Enable Tolarance MRN or Bill Count Column View  in the Document List View
    Then Verify User can be able to Disable Tolarance Invoice Regn Count Column View  in the Document List View
    Then Verify User can be able to Enable Tolarance Invoice Regn Count Column View  in the Document List View
    Then Verify User can be able to Disable Tolarance Cheque number Column View  in the Document List View
    Then Verify User can be able to Enable Tolarance Cheque number Column View  in the Document List View
    Then Verify User can be able to Disable Tolarance Cheque Date Column View  in the Document List View
    Then Verify User can be able to Enable Tolarance Cheque Date Column View  in the Document List View
    Then Verify User can be able to Disable Tolarance Cheque Amount Column View  in the Document List View
    Then Verify User can be able to Enable Tolarance Cheque Amount Column View  in the Document List View
    Then Verify User can be able to Disable Payment Transaction Ref No Column View  in the Document List View
    Then Verify User can be able to Enable Payment Transaction Ref No Column View  in the Document List View
    Then Verify User can be able to Disable NEFT Unique Ref No Column View  in the Document List View
    Then Verify User can be able to Enable NEFT Unique Ref No Column View  in the Document List View
    Then Verify User can be able to Disable Payment Transaction Date Column View  in the Document List View
    Then Verify User can be able to Enable Payment Transaction Date Column View  in the Document List View
    Then Verify User can be able to Disable Payment Mode Column View  in the Document List View
    Then Verify User can be able to Enable Payment Mode Column View  in the Document List View
    Then Verify User can be able to Disable NEFT Amount Column View  in the Document List View
    Then Verify User can be able to Enable NEFT Amount Column View  in the Document List View
    Then Verify User can be able to Disable Claim Column View  in the Document List View
    Then Verify User can be able to Enable Claim Column View  in the Document List View

  @Invoice_Registration_For_Action_Settings_Disable_or_Enable_Column_View_Random
  Scenario: Verify User can be able to Disable or Enable Random column view in settings menu
    Description :  As a EIP User i should be able Disable or Enable Random column view in settings menu

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Disable Column View in the Document List View_Random
    Then Verify User can be able to Enable Column View in the Document List View_Random

  @Invoice_Registration_For_Action_Settings_Change_Column_Position
  Scenario: Verify User can be able to Change Column Position
    Description :  As a EIP User i should be able to Change Column Position

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Change Column Position

  @Invoice_Registration_For_Action_Expand_or_Collapse
  Scenario: Verify User can be able to Expand or Collapse column view
    Description :  As a EIP User i should be able Verify User can be able to Expand or Collapse column view

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Expand column view
    Then Verify User can be able to Minimize column view

  @Invoice_Registration_For_Action_Pagination
  Scenario: Verify User can be able to Switch between pages
    Description :  As a EIP User i should be able Verify User can be able to Switch between pages

    Given Login as EIP User
    Then Navigate to Invoice Registration
    Then Verify User can be able to Skip Dashboard Tips
    Then Verify User can be able to search Invoices by Manual Date
    Then Verify User can be able to Go to Next Page
    Then Verify User can be able to Go to Previous Page
    Then Verify User can be able to Go to Last Page
    Then Verify User can be able to Go to First Page
    Then Verify User can be able to Go to Random Page
    Then Verify User can be able to Go to Custom Page
