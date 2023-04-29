@RFQRateDiscoveryMultiMaterialRegressionPart2

Feature: Regression for RFQ Creation

  Background: 
    Given Go to Test Environment


  Scenario: Domestic Job Material Rate Discovery RFQ Create Using Multi Vendor and Other cost Lumpsum Regression
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Rate Discovery RFQ Create
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Cart Verification
    And Rate Discovery Material Category Verification
    And Rate Discovery Material Group Verification
    And Rate Discovery Multi material Choose Items Verification
    And Rate Discovery Choose Items Post And Move Verification
    And Verify the Scope Of Rate Discovery RFQ Enter in Crate RFQ Page
    And Enter Multi Quantity in RFQ Create Page
    And Enter Multi Sugg Rate in RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
    # And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Verify to Enter Multi Vendor RFQ Create page and Add the Vendor Type
    #And Verify to Add Vendor Button in RFQ Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms for multi material
    Then Verifiy the Payment Terms in RFQ Create
    And Verify and Enter Other Cost in Rate Discovery Other Terms Page Multi Material on RFQ Create
    And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    And Verify and Enter Additional Details in Rate Discovery Other Terms Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  Scenario: Domestic Job RD RFQ Other cost Lumpsum Vendor One BQ Regression
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
     Then Page Down RFQ Bidders Quote Multi Material
    Then Enter Multi Rate in Material Details
    Then Select Multi Nature code in Bidders Quote
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Select Other Cost in RFQ BQ Additional Details
    Then Select Category Other Cost in RFQ BQ Other Cost Details
    Then Select Category From the list Other Cost in RFQ BQ Other Cost Details
    Then Select Lumpsum Other Cost Option in RFQ BQ Page
    Then Enter Unit Value Other Cost in RFQ BQ Other Cost Details
    Then Enter Remarks Other Cost in RFQ BQ Other Cost Details
    Then Select Post Other Cost in RFQ BQ Other Cost Details
    # Then Page Down RFQ Bidders Quote Shipment Details
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

  Scenario: Domestic Job RD RFQ Other cost Lumpsum Vendor Second BQ Regression
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote Multi Material
    Then Enter Multi Rate in Material Details
    Then Select Multi Nature code in Bidders Quote
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Select Other Cost in RFQ BQ Additional Details
    Then Select Category Other Cost in RFQ BQ Other Cost Details
    Then Select Category From the list Other Cost in RFQ BQ Other Cost Details
    Then Select Lumpsum Other Cost Option in RFQ BQ Page
    Then Enter Unit Value Other Cost in RFQ BQ Other Cost Details
    Then Enter Remarks Other Cost in RFQ BQ Other Cost Details
    Then Select Post Other Cost in RFQ BQ Other Cost Details
    # Then Page Down RFQ Bidders Quote Shipment Details
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

  Scenario: Material TCC Page Other cost Lumpsum Multi Vendor Regression
    Then Request For Quote Login for TCC
    Then Select Filter icon
    And Enter Domestic Job RFQ No from DB TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Other Cost Multi vendor Verificaction
    Then Other Cost Multi Next vendor Verificaction
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Verify the Status after close the TCC in Request For Quote
    Then Logout

  Scenario: Domestic Job Material Rate Discovery RFQ Create Using Multi Vendor and Other cost Percentage Regression
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Rate Discovery RFQ Create
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Cart Verification
    And Rate Discovery Material Category Verification
    And Rate Discovery Material Group Verification
    And Rate Discovery Multi material Choose Items Verification
    And Rate Discovery Choose Items Post And Move Verification
    And Verify the Scope Of Rate Discovery RFQ Enter in Crate RFQ Page
    And Enter Multi Quantity in RFQ Create Page
    And Enter Multi Sugg Rate in RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
    # And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Verify to Enter Multi Vendor RFQ Create page and Add the Vendor Type
    #And Verify to Add Vendor Button in RFQ Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms for multi material
    Then Verifiy the Payment Terms in RFQ Create
    And Verify and Enter Other Cost in Rate Discovery Other Terms Page Multi Material on RFQ Create
    And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    And Verify and Enter Additional Details in Rate Discovery Other Terms Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  Scenario: Domestic Job RD RFQ Other cost Percentage BQ Regression
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote Multi Material
    Then Enter Multi Rate in Material Details
    Then Select Multi Nature code in Bidders Quote
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Select Other Cost in RFQ BQ Additional Details
    Then Select Category Other Cost in RFQ BQ Other Cost Details
    Then Select Category From the list Other Cost in RFQ BQ Other Cost Details
    Then Select Other Cost Option in RFQ BQ Other Cost Details
    Then Enter Unit Value Other Cost in RFQ BQ Other Cost Details
    Then Enter Remarks Other Cost in RFQ BQ Other Cost Details
    Then Select Post Other Cost in RFQ BQ Other Cost Details
    # Then Page Down RFQ Bidders Quote Shipment Details
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

  Scenario: Domestic Job RD RFQ Other cost Percentage BQ Regression
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote Multi Material
    Then Enter Multi Rate in Material Details
    Then Select Multi Nature code in Bidders Quote
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Select Other Cost in RFQ BQ Additional Details
    Then Select Category Other Cost in RFQ BQ Other Cost Details
    Then Select Category From the list Other Cost in RFQ BQ Other Cost Details
    Then Select Other Cost Option in RFQ BQ Other Cost Details
    Then Enter Unit Value Other Cost in RFQ BQ Other Cost Details
    Then Enter Remarks Other Cost in RFQ BQ Other Cost Details
    Then Select Post Other Cost in RFQ BQ Other Cost Details
    # Then Page Down RFQ Bidders Quote Shipment Details
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

  Scenario: Material TCC Page Other cost Lumpsum Multi Vendor Regression
    Then Request For Quote Login for TCC
    Then Select Filter icon
    And Enter Domestic Job RFQ No from DB TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Other Cost Multi vendor Verificaction
    Then Other Cost Multi Next vendor Verificaction
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Verify the Status after close the TCC in Request For Quote
    Then Logout

  Scenario: Domestic Job Material Rate Discovery RFQ Create Using Multi Vendor and Other cost Percentage and Lumpsum Regression
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Verify RFQ Navication menu
    Then Request For Quote Home Page Verification
    Then Verify to Select Request For Quote Create icon
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Rate Discovery RFQ Create
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Cart Verification
    And Rate Discovery Material Category Verification
    And Rate Discovery Material Group Verification
    And Rate Discovery Multi material Choose Items Verification
    And Rate Discovery Choose Items Post And Move Verification
    And Verify the Scope Of Rate Discovery RFQ Enter in Crate RFQ Page
    And Enter Multi Quantity in RFQ Create Page
    And Enter Multi Sugg Rate in RFQ Create Page
    And Request For Quote Choose Vendors Page Verification
    # And Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Verify to Enter Multi Vendor RFQ Create page and Add the Vendor Type
    #And Verify to Add Vendor Button in RFQ Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Reference Date in Payment Terms RFQ Create
    Then Select Rate Discovery Document Payment Terms for multi material
    Then Verifiy the Payment Terms in RFQ Create
    And Verify and Enter Other Cost in Rate Discovery Other Terms Page Multi Material on RFQ Create
    And Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create
    And Verify and Enter Additional Details in Rate Discovery Other Terms Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  Scenario: Domestic Job RD RFQ Other cost Percentage BQ Regression
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
     Then Page Down RFQ Bidders Quote Multi Material
    Then Enter Multi Rate in Material Details
    Then Select Multi Nature code in Bidders Quote
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Select Other Cost in RFQ BQ Additional Details
    Then Select Category Other Cost in RFQ BQ Other Cost Details
    Then Select Category From the list Other Cost in RFQ BQ Other Cost Details
    Then Select Other Cost Option in RFQ BQ Other Cost Details
    Then Enter Unit Value Other Cost in RFQ BQ Other Cost Details
    Then Enter Remarks Other Cost in RFQ BQ Other Cost Details
    Then Select Post Other Cost in RFQ BQ Other Cost Details
    # Then Page Down RFQ Bidders Quote Shipment Details
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

  Scenario: Domestic Job RD RFQ Other cost Lumpsum Vendor Second BQ Regression
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job RFQ No from DB
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Page Down RFQ Bidders Quote Multi Material
    Then Enter Multi Rate in Material Details
    Then Select Multi Nature code in Bidders Quote
    Then Select Save draft in Material Details
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    #Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    Then Select GST Register No in Shipment Details
    Then Select Other Cost in RFQ BQ Additional Details
    Then Select Category Other Cost in RFQ BQ Other Cost Details
    Then Select Category From the list Other Cost in RFQ BQ Other Cost Details
    Then Select Lumpsum Other Cost Option in RFQ BQ Page
    Then Enter Unit Value Other Cost in RFQ BQ Other Cost Details
    Then Enter Remarks Other Cost in RFQ BQ Other Cost Details
    Then Select Post Other Cost in RFQ BQ Other Cost Details
    # Then Page Down RFQ Bidders Quote Shipment Details
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

  Scenario: Material TCC Page Other cost Lumpsum Multi Vendor Regression
    Then Request For Quote Login for TCC
    Then Select Filter icon
    And Enter Domestic Job RFQ No from DB TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Other Cost Multi vendor Verificaction
    Then Other Cost Multi Next vendor Verificaction
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Verify the Status after close the TCC in Request For Quote
    Then Logout
