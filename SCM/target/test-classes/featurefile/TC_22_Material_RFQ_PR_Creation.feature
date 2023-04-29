@RFQPRMaterialBQTCCTCD
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment

  Scenario: Purchase Request Creation Domestic Job
    Then Purchases Request Login
    Then Select Material in Purchases
    Then Click Create Request Icon in Purchases
    Then Enter Job in Request Essentials
    Then Select Warehouse in Request Essentials domestic Job
    Then Enter Purchase Group in Request Essentials
    Then Enter planning Category in Request Essentials
    Then Enter Remarks in Request Essentials
    Then Select cart after fill the Request Essentials in Purchase Request
    Then Select Material Group PR in Material Cart
    Then Select All Material Group in Material Cart
    Then Enter Choose Items PR domestic Job in Material Cart
    Then Select Item Material Group PR in Material Cart
    Then Select Arrow To Move Choose Items in Cart
    Then Select Post Icon To Post the Selected Items in Cart
    Then Select Cost Package in Request Essentials
    Then Enter Cost Package in Request Essentials
    Then Enter Quantity in Request Essentials
    Then Enter Sugg Rate in Request Essentials 
    Then Enter DeliveryDate in Request Essentials
    Then Select Submit in Request Essentials
    Then Purchases Request Accept


  Scenario Outline: Domestic Job Purchase Request Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search
    Then Enter Domestic Job Doc No from DB
    Then Select Search Icon in final Approval
    Then Mouseover in PR Numner
    Then Select Approve for Purchases Request 
    Then Select Ok In Approval Sucess Alert

    Examples: 
      | documentType  |
      | PRDomesticJob |


  Scenario Outline: Domestic Job Purchase Request Second Level Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search
    Then Enter Domestic Job Doc No from DB
    Then Select Search Icon in final Approval
    Then Mouseover in PR Numner
    Then Select Approve for Purchases Request
    Then Select Ok In Approval Sucess Alert

    Examples: 
      | documentType  |
      | PRDomesticJob |

  Scenario Outline: Domestic Job Purchase Request Final Level Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Enter General Consource in Search Menu
    #Then Select General Consource in Search Menu
    Then Select Advance Search GC
    Then Send Domestic Job PR No from DB in Allocation
    Then Select Search Icon in final Approval
    Then Select eSource Allocation
    Then Select Add To Cart after fill the eSource Allocation
    Then Select Cart in eSource Allocation
    Then Enter Buyer Name in Need To Allocate as <BuyerName>
    Then Choose Domestic Job buyers in Need To Allocate
    Then Select Allocate in Need To Allocate
    Then Request Created Successfully and Accepted
    Then Select Close icon In Need To Allocate

    Examples: 
      | documentType  | GC              | BuyerName |
      | PRDomesticJob | General Request | aruls     |

  Scenario: Domestic Job Material Attachment RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create
    Then After Login Request For Quote Add Material page
    Then Add RFQ Values from Request For Quote Create Page
    Then Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Payment Terms RFQ Create page
    And Enter Other Terms Page on PR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  Scenario Outline: Domestic Job PR RFQ BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote SD
    Then Enter Rate in Material Details as <Rate>
    Then Enter HSN in Creation Bidders Quote as <BQHSN>
    #Then Nature code in Material Details BQ
    #Then Select Nature code in BQ
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Page Down RFQ Bidders Quote Shipment Details
    Then Select Save icon in Shipment Details BQ
    Then Accept Alert
    Then Click Trade Details in Techno Commercials
    Then Click Trade Terms in Techno Commercials
    Then Select Trade Terms in Additional Details
    Then Select TC Save icon
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    Then Click Save in  Request Essentials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    Then Select In Progress in Bidders Quote
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Page Down RFQ Bidders Quote InProgress
    Then Select Submit Icon
    Then Accept Alert
    Then Select TCClose in Creation Bidders Quote
    Then Select Close in Creation Bidders Quote

    Examples: 
      | Username   | Search | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    |  100 | 04021010 | 1111111111 |

  Scenario Outline: Material TCC Page
    Then Request For Quote Login for TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert

    Examples: 
      | Username | Search |
      | aruls    | RFQ    |

  Scenario Outline: Material TCD Page
    Then Request For Quote Login for TCD
    Then Select Material in Techno Commercial Document
    Then Select filter in TCD
    Then Enter RFQ No from DB TCD
    Then Mouseover in TCD Numner
    Then Select Create Button in TCD Create
    Then Select TCD Job in Techno Commercial Document
    Then Select TCD Job from the list in Techno Commercial Document
    Then Select TCD Vendor in Techno Commercial Document
    Then Select TCD Vendor from the list in Techno Commercial Document
    Then Select Go icon in Techno Commercial Document
    Then Enter Alloc Qty in Techno Commercial Allocation as <AllocQty>
    Then Select Delivery Schedule
    Then Select Delivery Schedule Calendar
    Then Select Current Date Delivery Schedule Calendar
    Then Select Save Icon Delivery Schedule
    Then Click Payment Center in Job Details
    #Then Select Payment Center in Job Details
    Then Select Calendar in Job Details
    Then Select date in Calendar
    Then Enter Comments in Techno Commercial Allocation as <Comments>
    Then Select Submit in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept

    Examples: 
      | Username | Search | AllocQty | Comments                         |
      | aruls    | TCD    |        1 | Material PR RFQ BQ TCC Completed |
      
       Scenario Outline: TCD Level One Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
   Then  Mouseover TCD Numner in Approval
    Then Select TCD Approval button
     Then TCD Approval Alert Accept
    
    Examples: 
      | documentType | 
      | tcd         |
      
      
      Scenario Outline: TCD Level Two Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
   Then  Mouseover TCD Numner in Approval
    Then Select TCD Approval button
     Then TCD Approval Alert Accept
    
    Examples: 
      | documentType | 
      | tcd         |
      
      

  Scenario: Domestic Job Material Attachment Auto BQ RFQ
    Then Request For Quote Login and Select RFQ Create
    Then After Login Request For Quote Add Material page
    Then Add RFQ Values from Request For Quote Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Payment Terms RFQ Create page
    And Enter Other Terms Page on PR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    
    
   
    Scenario Outline: Material TCD Page
    Then Request For Quote Login for TCD
    Then Select Material in Techno Commercial Document
    Then Select filter in TCD
    Then Enter RFQ No from DB TCD
    Then Mouseover in TCD Numner
    Then Select Create Button in TCD Create
    Then Select TCD Job in Techno Commercial Document
    Then Select TCD Job from the list in Techno Commercial Document
    Then Select TCD Vendor in Techno Commercial Document
    Then Select TCD Vendor from the list in Techno Commercial Document
    Then Select Go icon in Techno Commercial Document
    
    Then Select BQ Edit icon in Techno Commercial Document
    Then Select Techno Commercials in Creation Bidders Quote
    
    Then Enter Alloc Qty in Techno Commercial Allocation as <AllocQty>
    Then Select Delivery Schedule
    Then Select Delivery Schedule Calendar
    Then Select Current Date Delivery Schedule Calendar
    Then Select Save Icon Delivery Schedule
    Then Click Payment Center in Job Details
    #Then Select Payment Center in Job Details
    Then Select Calendar in Job Details
    Then Select date in Calendar
    Then Enter Comments in Techno Commercial Allocation as <Comments>
    Then Select Submit in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept

    Examples: 
      | Username | Search | AllocQty | Comments                         |
      | aruls    | TCD    |        1 | Material PR RFQ BQ TCC Completed |
      
       Scenario Outline: TCD Level One Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
   Then  Mouseover TCD Numner in Approval
    Then Select TCD Approval button
     Then TCD Approval Alert Accept
    
    Examples: 
      | documentType | 
      | tcd         |
      
      
      Scenario Outline: TCD Level Two Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
   Then  Mouseover TCD Numner in Approval
    Then Select TCD Approval button
     Then TCD Approval Alert Accept
    
    Examples: 
      | documentType | 
      | tcd         |
