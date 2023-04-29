@Material_RFQ_Creation_Using_Purchase_Request_Single_Material_Domestic_Job
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment


  @RQFAutoBQ
  Scenario: RFQ Create using Purchase Request for Single Material Domestic Job
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Verify that after select Search Icon to list the Latest Purchase Request number in Grid
    And Verify that Select Purchase Request number in the Grid
    And Verfy that Select Next Icon with Allocation No navigate to Add RFQ Values
    And Verify that Scope Of RFQ Enter in Crate RFQ Page
    And Enter Quantity in Purchase Request RFQ Create Page1
    And Select Expand List in Details of RFQ Value
    And Select Delivery Schedule in Details of RFQ Value
    And Verify to Enter Quality at Delivery Schedule in Details of PR RFQ Value
    And Select HSN in Purchase Request RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button and Select Auto BQ in RFQ Create
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

  
  

  @TCDAfterSD
  Scenario: Select Save Draft TCD number to Submit and verify DS Code using Purchase Request for Single Material Domestic Job
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

  @TCDRej
  Scenario: TCD Level One Reject and Verify DC Code
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
  @ReTCD
  Scenario: TCD using Purchase Request for Single Material Domestic Job
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

  @FirstLevelApp
  Scenario: TCD Level One Approval
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

  @TCD2Rej
  Scenario: TCD Second Level Reject and Verify DC Code
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

  @ReTCD1
  Scenario: TCD using Purchase Request for Single Material Domestic Job
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

  @First1LevelApp
  Scenario: TCD Level One Approval
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

  @First2LevelApp
  Scenario: TCD Second Level Approval
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
