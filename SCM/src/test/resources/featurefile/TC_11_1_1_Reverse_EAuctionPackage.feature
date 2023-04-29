@eAuctionPackageReverseRateDiscoveryPartOne
Feature: Verify the eAuction Creation

  Background: 
    Given Go to Test Environment

  @eAuctionPackageReverseRateDiscovery
  Scenario: eAuction Package Reverse Rate Discovery Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction RRD Create Schedule Essentials
    Then Select Auction Source Reverse for eAuction Create
    Then Enter Desciption Reverse Rate discovery for Bid Values eAuction Create
    Then Verify to Enter Vendor eAuction Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Rate Discovery Auction Create
    Then Verify and Select Attachment in Other Terms Page on Revers Auction Create

  @eAuctionPackageReverseRateDiscoveryBQ
  Scenario: eAuction Package Reverse Rate Discovery BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    ##Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    And Select Save button in BQ Shipment Details Techno Commercials
    Then Accept Alert
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials Auction
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

  @eAuctionPackageReverseRateDiscoveryTCC
  Scenario: eAuction Package Reverse Rate Discovery TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  @eAuctionPackageReverseRateDiscoveryBaseRateApplicable
  Scenario: eAuction Package Reverse Rate Discovery Base Rate Applicable Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction RRD Create Schedule Essentials
    Then Select Auction Source Reverse for eAuction Create
    Then Select Base Rate Applicable for eAuction Create
    Then Enter Desciption Reverse Rate discovery for Bid Values eAuction Create
    Then Verify to Enter Vendor eAuction Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Rate Discovery Auction Create
    Then Verify and Select Attachment in Other Terms Page on Revers Auction Create

  @eAuctionPackageReverseRateDiscoveryBaseRateApplicableBQ
  Scenario: eAuction Package Reverse Rate Discovery Base Rate Applicable BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    And Select Save button in BQ Shipment Details Techno Commercials
    Then Accept Alert
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials Auction
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

  @eAuctionPackageReverseRateDiscoveryBaseRateApplicableTCC
  Scenario: eAuction Package Reverse Rate Discovery Base Rate Applicable TCC
   Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  @eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBids
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Post All Bids Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction RRD Create Schedule Essentials
    Then Select Auction Source Reverse for eAuction Create
    Then Enter Desciption Reverse Rate discovery for Multi material Bid Values eAuction Create
    Then Verify to Enter Vendor eAuction Create page and Add the Multi Vendor Type
    Then Verify to Add Vendor Button in eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Multi Reverse Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Rate Discovery Auction Create
    Then Verify and Select Attachment in Other Terms Page on Revers Auction Create

  @eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorA
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor A BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    And Select Save button in BQ Shipment Details Techno Commercials
    Then Accept Alert
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials Auction
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

  @eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorB
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Vendors Shipment Details
    And Select Save button in BQ Shipment Details Techno Commercials
    Then Accept Alert
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials Auction
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

  @eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorC
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    #Then Select Bill From in Shipment Details
    And Select Save button in BQ Shipment Details Techno Commercials
    Then Accept Alert
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials Auction
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

  @eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorD
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Acknowledge in Bidders Quote
    Then Select agree terms in Bidders Quote
    Then Select Submit icon in Bidders Quote
    Then Accept Alert
    Then Select Techno Commercials in Creation Bidders Quote
    Then Page down in Material Details BQ PT
    Then Select Save draft in Material Details BQ
    Then Accept Alert
    Then Select Additional Details in Techno Commercials
    Then Select Bill From in Shipment Details
    And Select Save button in BQ Shipment Details Techno Commercials
    Then Accept Alert
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials Auction
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

  @eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAA
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor A Bid BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Post All Bids for Vendor A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAB
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor B Bid BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Post All Bids for Vendor B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout
@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAC
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor C Bid BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Post All Bids for Vendor C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout
@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsVendorAD
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material Vendor D Bid BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    #Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Post All Bids for Vendor D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout
@eAuctionPackageReverseRateDiscoveryMultiVendorandMultiMaterialPostAllBidsTCC
  Scenario: eAuction Package Reverse Rate Discovery Multi Vendor and Multi Material TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout
