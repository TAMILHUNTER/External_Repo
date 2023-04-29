@Verify_Material_RFQ_Creation
Feature: Verify the Material RFQ Creation

  Background: 
    Given Go to Test Environment

  
  @Material_RFQ_Creation_Home_Page_End_To_End_Verification
  Scenario: Verify to RFQ Create for Material in End To End Verification
    Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify Request for Quote Home Page
    Then Logout
    
    @Material_RFQ_Creation_Select_Service_End_To_End_Verification
  	Scenario: Verify Service also select in RFQ Create for Material in End To End Verification
  	Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify to select Service in Request for Quote Home Page
    Then Logout
    
    
    
    @Material_RFQ_Creation_Verify_to_Check_user_able_to_view_RFQ_status_in_Graphical_view
  	Scenario: Verify to Check user able to view RFQ status in Graphical view for End To End Verification
  		Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify to Navigate Material Request for Quote Home Page
    Then Verify to check user able to view RFQ status Graphical view in Request for Quote Home Page
    Then Logout
    
    
     @Material_RFQ_Creation_Verify_to_Graphical_view_should_display_three_graphs_RFQ_status_in_Graphical_view
  	Scenario: Verify to Graphical view should display three graphs RFQ status in Graphical view for End To End Verification
  	Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify to Navigate Material Request for Quote Home Page
    Then Verify Graphical view should display three graphs Graphical view in Request for Quote Home Page
    Then Verify to Select Request For Quote Create icon
    Then Verify Error Alert to Select Next Icon without Allocation No
    Then Error Alert Verification in Add Material
    Then Verify to select Advance Search in RFQ Create Page
    Then Verify to Enter Latest Purchase Request from DB in the Advance Search
    Then Verify that after select Search Icon to list the Latest Purchase Request number in Grid
    Then Verify that Select Purchase Request number in the Grid
    Then Verify that Select Next Icon with Allocation No navigate to Add RFQ Values
    Then Verify that Scope Of RFQ Enter in Crate RFQ Page
    Then Enter Quantity in Purchase Request RFQ Create Page1
    Then Select Expand List in Details of RFQ Value
    Then Select Delivery Schedule in Details of RFQ Value
    Then Verify to Enter Quality at Delivery Schedule in Details of PR RFQ Value
    Then Select HSN in Purchase Request RFQ Create Page
    Then Request For Quote Choose Vendors Page Verification
    Then Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in RFQ Create
    #Then Verify to select Save Deaft RFQ Number
    #Then Select Advance Search Icon in Home Page
    #Then Enter RFQ No from DB For Auction RFQ Home Page
    #Then Select Search icon for Search RFQ in Advance Search
      And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms
    Then Verifiy the Payment Terms in RFQ Create
    And Verify and Enter Additional Details in Other Terms Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    
    
    
    
    
    #Then Request For Quote Home Page Verification
    #Then Verify to Select Request For Quote Create icon
    #Then Verify Error Alert to Select Next Icon without Allocation No
    #And Error Alert Verification in Add Material
    #Then Verify to select Advance Search in RFQ Create Page
    #And Verify to Enter Latest Purchase Request from DB in the Advance Search
    #And Verify that after select Search Icon to list the Latest Purchase Request number in Grid
    #And Verify that Select Purchase Request number in the Grid
    #And Verify that Select Next Icon with Allocation No navigate to Add RFQ Values
    #And Verify that Scope Of RFQ Enter in Crate RFQ Page
    #And Enter Quantity in Purchase Request RFQ Create Page1
    #And Select Expand List in Details of RFQ Value
    #And Select Delivery Schedule in Details of RFQ Value
    #And Verify to Enter Quality at Delivery Schedule in Details of PR RFQ Value
    #And Select HSN in Purchase Request RFQ Create Page
    #And Request For Quote Choose Vendors Page Verification
    #And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    #And Verify to Add Vendor Button in RFQ Create
    #And Enter Release in Payment Terms Page
    #And Select Event Payment Terms RFQ Create
    #And Select Reference Value in Payment Terms RFQ Create Page
    #And Enter Credit Days in Payment Terms RFQ Create
    #And Select Payment Mode in Payment Terms RFQ Create
    #And Select Reference Date in Payment Terms RFQ Create
    #Then Select Rate Discovery Document Payment Terms
    #Then Verifiy the Payment Terms in RFQ Create
    #And Verify and Enter Other Cost in Rate Discovery Other Terms Page on RFQ Create
    #And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    #And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    #And Verify and Enter Additional Details in Other Terms Page on RFQ Create
    #Then Verify and Select Attachment in Other Terms Page on RFQ Create

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

 