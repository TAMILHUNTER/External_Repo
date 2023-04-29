@RFQRateDiscoveryMaterialEndToEnd
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment

  Scenario: Domestic Job Material Rate Discovery RFQ Home Page Verification
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu 
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon 

  Scenario: Domestic Job Material Rate Discovery RFQ Add Material Verification
    Then Request For Quote Login and Select RFQ Create
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Rate Discovery RFQ Create 
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Cart Verification 
    And Rate Discovery Material Category Verification 
    And Rate Discovery Material Group Verification
    And Rate Discovery Choose Items Verification
    And Rate Discovery Choose Items Post And Move Verification
    Then Close and Logout RFQ Page 


  Scenario: Domestic Job Material Rate Discovery RFQ Add RFQ Values Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Verify the Scope Of RFQ Enter in Crate RFQ Page
    And Enter Quantity in RFQ Create Page
    And Enter Sugg Rate and Save Draft in RFQ Create Page

 
  Scenario: Domestic Job Material Rate Discovery RFQ Choose Vendors Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
       # And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in RFQ Create

  Scenario: Domestic Job Material Rate Discovery RFQ Payment Terms Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create 
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms
    Then Verifiy the Payment Terms in RFQ Create
    Then Close and Logout RFQ Page

  Scenario: Domestic Job Material Rate Discovery RFQ Other Terms Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Payment Terms  Rate discovery RFQ Create page
    # And Verify and Enter Liquidity Damage in Other Terms Page Rate Discovery on RFQ Create
    And Verify and Enter Other Cost in Rate Discovery Other Terms Page on RFQ Create
    And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    And Verify and Enter Additional Details in Rate Discovery Other Terms Page on RFQ Create
    Then Close and Logout RFQ Page


  Scenario: Domestic Job Material Rate Discovery Attachment RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Payment Terms  Rate discovery RFQ Create page
    And Enter Other Terms Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create


Scenario Outline: Domestic Job RD RFQ BQ
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
		Then Logout
    Examples: 
      | Username | Search |
      | aruls    | RFQ    |
      
      
     
  

  Scenario: Domestic Job Material Rate Discovery Auto BQ RFQ Home Page Verification
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon

  Scenario: Domestic Job Material Rate Discovery Auto BQ RFQ Add Material Verification
    Then Request For Quote Login and Select RFQ Create
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Rate Discovery RFQ Create
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Cart Verification
    And Rate Discovery Material Category Verification
    And Rate Discovery Material Group Verification
    And Rate Discovery Choose Items Verification
    And Rate Discovery Choose Items Post And Move Verification
    Then Close and Logout RFQ Page

  Scenario: Domestic Job Material Rate Discovery Auto BQ RFQ Add RFQ Values Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Verify the Scope Of RFQ Enter in Crate RFQ Page
    And Enter Quantity in RFQ Create Page
    And Enter Sugg Rate and Save Draft in RFQ Create Page

  Scenario: Domestic Job Material Rate Discovery Auto BQ RFQ Choose Vendors Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
    #And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    Then Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Auto BQ RFQ Create

  Scenario: Domestic Job Material Rate Discovery Auto BQ RFQ Payment Terms Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms
    Then Verifiy the Payment Terms in RFQ Create
    Then Close and Logout RFQ Page

  Scenario: Domestic Job Material Rate Discovery RFQ Auto BQ Other Terms Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Payment Terms  Rate discovery RFQ Create page
    # And Verify and Enter Liquidity Damage in Other Terms Page Rate Discovery on RFQ Create
    And Verify and Enter Other Cost in Rate Discovery Other Terms Page on RFQ Create
    And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    And Verify and Enter Additional Details in Rate Discovery Other Terms Page on RFQ Create
    Then Close and Logout RFQ Page


  Scenario: Domestic Job Material Rate Discovery Attachment Auto BQ RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Payment Terms  Rate discovery RFQ Create page
    And Enter Other Terms Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    
    
    
