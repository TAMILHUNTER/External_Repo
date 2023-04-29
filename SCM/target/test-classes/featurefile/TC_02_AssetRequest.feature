@AssetRequest
Feature: Asset Request

  Background: 
    Given Go to Test Environment

  Scenario Outline: Asset Request Creation
    Then Click on Other User
    Then Enter the Username as <Username> 
    Then Enter the Password
    #Then Click on Login
    Then Enter Asset Request in Search Menu as <AssetRequest>
    Then Select Asset Request in Search Menu
    Then Select Add Asset Request Create icon 
    Then Enter IC in Create Asset Request as <ARIC>
    Then Enter Job in Create Asset Request as <ARJob> 
    Then Select Warehouse in Asset Request Create as <ARWarehouse> 
    Then Enter CPRS Number From DB to Create Asset Request
    Then Select Go Icon in Create Asset Request
    Then Enter Asset Group in Create Asset Request as <ARAssetGroup> 
    Then Enter Material in Create Asset Request as <Material>
    Then Enter AR Quantity in Create Asset Request as <ARQuantity>
    Then Select Delivery Schedule in Create Asset Request
    Then Enter AR Required Quantity in Delivery Schedule as <ARRequiredQuantity>
    Then Select Save icon in Delivery Schedule
    Then Select AR Save icon in Delivery Schedule
    Then Enter AR suggested Rate in Asset Request Details as <ARsuggestedRate>
    Then Select Save icon Asset Request Details in Create Asset Request
    Then Select Submit icon in Create Asset Request

    Examples: 
      | Username | AssetRequest  | ARIC                  | ARJob    | ARWarehouse | ARAssetGroup | Material        | ARQuantity | ARRequiredQuantity | ARsuggestedRate |
      | AVJ      | Asset Request | Buildings & Factories | LE180046 |        2699 |         4017 | 0C56M0001000000 |         10 |                 10 |             100 |

  Scenario Outline: Asset Request Authorization Level One
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in Asset Request 
    Then Enter Doc No from Asset Request DB
    Then Select AR Search Icon in Workbench For Action
    Then Move to View Details 
    Then Select Asset Request Number in Workbench For Action 
    Then Move to Approve Icon in Workbench For Action
    Then Select Approve icon in Asset Request
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in Asset Request Approval

    Examples: 
      | documentType | Comment                |
      | AR           | Approved Asset Request |

  Scenario Outline: Asset Request Authorization Level Two
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in Asset Request
    Then Enter Doc No from Asset Request DB
    Then Select AR Search Icon in Workbench For Action
    Then Move to View Details
    Then Select Asset Request Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select Approve icon in Asset Request
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in Asset Request Approval

    Examples:  
      | documentType | Comment                |
      | AR           | Approved Asset Request |

  Scenario Outline: Asset Request Authorization Final Level
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in Asset Request
    Then Enter AR PR Doc No from Asset Request DB
    Then Select AR Search Icon in Workbench For Action 
    Then Move to View Details
    Then Select Asset Request Number in Workbench For Action
    Then Select Advance Search in eSource Allocation
    Then Enter PR Num Asset Request Allocation Advance Search from DB
    #Then Send PR No from DB in Allocation
    Then Select Search Icon in final Approval
    Then Select eSource Allocation
    Then Select Add To Cart after fill the eSource Allocation
    Then Select Cart in eSource Allocation
    Then Enter Buyer Name in Need To Allocate as <BuyerName>
    Then In Asset Request Choose your buyers in Need To Allocate
    Then Select Allocate in Need To Allocate
    Then Request Created Successfully and Accepted
    Then Select Close icon In Need To Allocate

    Examples: 
      | documentType | Comment                | BuyerName |
      | PRCPRS       | Approved Asset Request | aruls     |

  Scenario: Capital PR RFQ Creation
    Then Request For Quote Login and Select RFQ Create
    Then Search PR
    Then Enter Capital PR from DB
    Then Select Search Icon
    Then Select PR
    Then Select Next Icon
    Then Select Yes in Confirmation Alert
    Then Add Capital Auto PR RFQ Values from Request For Quote Create Page
    Then Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Payment Terms RFQ Create page
    And Enter Other Terms Page on Capital PR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create


  Scenario Outline: Domestic Job Capital PR BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote SD
    Then Enter Rate in Material Details as <Rate>
    Then Enter HSN in Creation Bidders Quote as <BQHSN>
    # Then Nature code in Material Details BQ
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
    Then Select Buyer in Bidders Quote as <Buyer>
    
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Page Down RFQ Bidders Quote InProgress
    Then Select Submit Icon
    Then Accept Alert
    Then Select TCClose in Creation Bidders Quote
    Then Select Close in Creation Bidders Quote

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |  5 | 04021010 | 1111111111 |


  Scenario Outline: Capital PR TCC Page
    Then Request For Quote Login for TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Logout

    Examples: 
      | Username | Search |
      | aruls    | RFQ    |

  Scenario Outline: Capital PR TCD Page
    Then Request For Quote Login for TCD
    Then Select Capital in Techno Commercial Document
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
    #Then Select Delivery Schedule
    #Then Select Delivery Schedule Calendar
    #Then Select Current Date Delivery Schedule Calendar
   # Then Select Save Icon Delivery Schedule
    Then Click Payment Center in Job Details
    #Then Select Payment Center in Job Details
    Then Select Calendar in Job Details
    Then Select date in Calendar
    Then Enter Comments in Techno Commercial Allocation as <Comments>
    Then Select Submit in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept
    Then Logout

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
      
      @test
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
      
