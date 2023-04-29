@Material_RFQ_Creation_Using_Purchase_Request_Single_Material_Domestic_Job
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment

  @Create_Purchase_Request
  Scenario: Purchase Request Creation Single Material Domestic Job
    Then Purchases Request Login
    Then Select Material in Purchases
    Then Click Create Request Icon in Purchases
    Then Enter Job in Request Essentials
    Then Select Warehouse in Request Essentials domestic Job
    Then Enter Purchase Group in Request Essentials
    Then Enter planning Category in Request Essentials
    Then Select Supply at in Request Essentials
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
    #Then Enter Sugg Rate in Request Essentials
    Then Enter DeliveryDate in Request Essentials
    Then Select Submit in Request Essentials
    Then Purchases Request Accept

  @First_Level_of_Approval_for_Purchase_Request
  Scenario: First Level of Approval for Purchase Request Single Material Domestic Job
    Then Click on Other User
    Then Enter the Username from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search
    Then Enter Domestic Job Doc No from DB
    Then Select Search Icon in Advance Search
    Then Mouseover in PR Numner
    Then Select Approve for Purchases Request
    Then Select Ok In Approval Sucess Alert

  @Second_Level_of_Approval_for_Purchase_Request
  Scenario: Second Level of Approval for Purchase Request Single Material Domestic Job
    Then Click on Other User
    Then Enter the Username from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search
    Then Enter Domestic Job Doc No from DB
    Then Select Search Icon in Advance Search
    Then Mouseover in PR Numner
    Then Select Approve for Purchases Request
    Then Select Ok In Approval Sucess Alert

  @General_Consource_for_Purchase_Request
  Scenario: General Consource for Purchase Request after complete the approval for Single Material Domestic Job
    Then Click on Other User
    Then Enter the Username from db
    Then Enter the Password
    Then Click on Login
    Then Enter General Consource in Search Menu
    Then Select Advance Search GC
    Then Send Domestic Job PR No from DB in Allocation
    Then Select Search Icon in Advance Search
    Then Select eSource Allocation
    Then Select Add To Cart after fill the eSource Allocation
    Then Select Cart in eSource Allocation
    Then Enter Buyer Name in Need To Allocate
    Then Choose Domestic Job buyers in Need To Allocate
    Then Select Allocate in Need To Allocate
    Then Request Created Successfully and Accepted
    Then Select Close icon In Need To Allocate

  @Request_For_Quote_Create_using_Purchase_Request
  Scenario: RFQ Create using Purchase Request for Single Material Domestic Job
    Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon
    Then Verify Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Verify that after select Search Icon to list the Latest Purchase Request number in Grid
    And Verify that Select Purchase Request number in the Grid
    And Verify that Select Next Icon with Allocation No navigate to Add RFQ Values
    And Verify that Scope Of RFQ Enter in Crate RFQ Page
    And Enter Quantity in Purchase Request RFQ Create Page1
    And Select Expand List in Details of RFQ Value
    And Select Delivery Schedule in Details of RFQ Value
    And Verify to Enter Quality at Delivery Schedule in Details of PR RFQ Value
    And Select HSN in Purchase Request RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in RFQ Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms
    Then Verifiy the Payment Terms in RFQ Create
    #And Verify and Enter Other Cost in Rate Discovery Other Terms Page on RFQ Create
    #And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    #And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    And Verify and Enter Additional Details in Other Terms Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  @Edit_Request_For_Quote_using_Purchase_Request
  Scenario: Edit Request For Quote using Purchase Request for Single Material Domestic Job
    Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Select Advance Search Icon in Home Page
    Then Select RFQ Number for Edit
    Then Enter RFQ Number from DB for Edit
    Then Select Search Icon
    Then Edit RFQ Number
    And Request For Quote Choose Vendors Page Verification
    And Verify to Edit Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Verify and Edit Additional Details in Rate Discovery Other Terms Page on RFQ Create
    Then Verify and Edit Attachment in Other Terms Page on RFQ Create

  @Bidders_Quote_for_Single_Material_Request_For_Quote
  Scenario: Bidders Quote for Single Material Request For Quote using Purchase Request Domestic Job
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote SD
    Then Enter Rate in Material Details
    Then Enter HSN in Creation Bidders Quote
    Then Nature code in Material Details BQ
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
    #Then Click Trade Terms in Techno Commercials
    #Then Select Trade Terms in Additional Details
    Then Select TC Save icon
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials
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

  @Techno_Commercial_Comparison_for_Single_Material_Request_For_Quote
  Scenario: Techno Commercial Comparison using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Request For Quote Login for RFQ TCC
    Then Select Filter icon
    And Enter Domestic Job RFQ No from DB TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Logout

  @Save_Draft_the_Techno_Commercial_Document_for_Single_Material_Request_For_Quote
  Scenario: Save Draft the Techno Commercial Document using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Request For Quote Login for TCD
    Then Select Material in Techno Commercial Document
    Then Select Filter Icon in Techno Commercial Document Page
    Then Enter RFQ No from DB TCD
    Then Mouseover in TCD Numner
    Then Select Create Button in TCD Create
    Then Select TCD Job in Techno Commercial Document
    Then Select TCD Job from the list in Techno Commercial Document
    Then Select TCD Vendor in Techno Commercial Document
    Then Select TCD Vendor from the list in Techno Commercial Document
    Then Select Go icon in Techno Commercial Document
    Then Enter Alloc Qty in Techno Commercial Allocation
    Then Select Delivery Schedule
    Then Select Save Icon Delivery Schedule
    Then Click Payment Center in Job Details
    Then Select Payment Center in Job Details
    Then Select Calendar in Job Details
    Then Select date in Calendar
    Then Enter Comments in Techno Commercial Allocation
    Then Select Save Draft Button in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept
    Then DS Code Verify after Save Draft the TCD

  @Submit_the_Save_Draft_Techno_Commercial_Document_for_Single_Material_Request_For_Quote
  Scenario: Submit the Save Draft the Techno Commercial Document using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Request For Quote Login for TCD
    Then Select Material in Techno Commercial Document
    Then Select For Auction in Material Techno Commercial Document
    Then Select Filter Icon in Techno Commercial Document Page
    And Enter Domestic Job RFQ No from DB TCC
    Then Select Edit icon in For Auction Saved RFQ Number at TCD
    Then Select Vendor in Save Draft RFQ number to Create TCD
    Then Select Submit in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept
    Then DS Code Verify after Submit the TCD

  @Reject_the_Techno_Commercial_Document_in_First_level_Approval
  Scenario: Reject the Techno Commercial Document in First level Approval using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Click on Other User
    Then Enter the Username for TCD from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
    Then Mouseover TCD Numner in Approval
    Then Enter Remarks When Reject TCD Number in Work Bench
    Then Select Reject TCD Number Work Bench
    Then DS Code Verify after Reject TCD

  #Then Mouseover TCD Numner in Approval
  #Then Select Reject TCD Number Work Bench
  @Re_Create_Techno_Commercial_Document_after_Reject_the_first_level_Approval
  Scenario: Re Create Techno Commercial Document after Reject the first level Approval using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Request For Quote Login for TCD
    Then Select Material in Techno Commercial Document
    Then Select Rejected Menu in Techno Commercial Document for Re Create TCD
    Then Select Filter Icon in Techno Commercial Document Page
    Then Enter TCD No from TCD DB for Re Create TCD
    Then Edit and Re Create TCD
    Then Select Vendor in TDC Edit after Reject the TCD
    Then Select Submit in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept
    Then DS Code Verify after Submit the TCD

  @First_level_Approval_in_Techno_Commercial_Document
  Scenario: First level Approval in Techno Commercial Document for using Single Material Request For Quote using Purchase Request Domestic Job
    Then Click on Other User
    Then Enter the Username for TCD from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
    Then Mouseover TCD Numner in Approval
    Then Select TCD Approval button
    Then TCD Approval Alert Accept
    Then DS Code Verify First Level Approval the TCD

  @Reject_the_Techno_Commercial_Document_in_Second_level_Approval
  Scenario: Reject the Techno Commercial Document in Second level Approval using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Click on Other User
    Then Enter the Username for TCD from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
    Then Mouseover TCD Numner in Approval
    Then Enter Remarks When Reject TCD Number in Work Bench
    Then Select Reject TCD Number Work Bench
    Then DS Code Verify after Reject TCD

  @Re_Create_Techno_Commercial_Document_after_Reject_the_Second_level_Approval
  Scenario: Re Create Techno Commercial Document after Reject the Second level Approval using for Single Material Request For Quote using Purchase Request Domestic Job
    Then Request For Quote Login for TCD
    Then Select Material in Techno Commercial Document
    Then Select Rejected Menu in Techno Commercial Document for Re Create TCD
    Then Select Filter Icon in Techno Commercial Document Page
    Then Enter TCD No from TCD DB for Re Create TCD
    Then Edit and Re Create TCD
    Then Select Vendor in TDC Edit after Reject the TCD
    Then Select Submit in TCD
    Then Select Post button in constzon view
    Then TCD Information Alert Accept
    Then DS Code Verify after Submit the TCD

  @First_level_Approval_After_Re_Create_Techno_Commercial_Document
  Scenario: First level Approval after re create Techno Commercial Document for using Single Material Request For Quote using Purchase Request Domestic Job
    Then Click on Other User
    Then Enter the Username for TCD from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
    Then Mouseover TCD Numner in Approval
    Then Select TCD Approval button
    Then TCD Approval Alert Accept
    Then DS Code Verify First Level Approval the TCD

  @Second_level_Approval_After_Re_Create_Techno_Commercial_Document
  Scenario: Second level Approval after re create Techno Commercial Document for using Single Material Request For Quote using Purchase Request Domestic Job
    Then Click on Other User
    Then Enter the Username for TCD from db
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in TCD
    Then Enter Doc No from TCD DB
    Then Select TCD Search Icon in Advance Search
    Then Move to View Details TCD
    Then Mouseover TCD Numner in Approval
    Then Select TCD Approval button
    Then TCD Approval Alert Accept
    Then DS Code Verify Second Level Approval the TCD
  #@RFQTCD
  #Scenario: TCD using Purchase Request for Single Material Domestic Job
    #Then Request For Quote Login for TCD
    #Then Select Material in Techno Commercial Document
    #Then Select Filter Icon in Techno Commercial Document Page
    #Then Enter RFQ No from DB TCD
    #Then Mouseover in TCD Numner
    #Then Select Create Button in TCD Create
    #Then Select TCD Job in Techno Commercial Document
    #Then Select TCD Job from the list in Techno Commercial Document
    #Then Select TCD Vendor in Techno Commercial Document
    #Then Select TCD Vendor from the list in Techno Commercial Document
    #Then Select Go icon in Techno Commercial Document
    #Then Enter Alloc Qty in Techno Commercial Allocation
    #Then Select Delivery Schedule
    #Then Select Save Icon Delivery Schedule
    #Then Click Payment Center in Job Details
    #Then Select Payment Center in Job Details
    #Then Select Calendar in Job Details
    #Then Select date in Calendar
    #Then Enter Comments in Techno Commercial Allocation
    #Then Select Submit in TCD
    #Then Select Post button in constzon view
    #Then TCD Information Alert Accept
