@eAuctionMaterialEndToEnd
Feature: Verify the eAuction Creation

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

  Scenario: eAuction Reverse Purchase Request Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    And Select HSN Next Icon navigate to Choose Vendor
    And Select Next Icon After select HSN
    Then Verify to Enter Vendor eAuction Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Purchase Request BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Place Bid in Bidders Quote
    Then Select Nature code in Bidders Quote
    Then Enter Your Bid value in Reverse Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario: eAuction Material Reverse Purchase Request TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Reverse Purchase Request Base Rate Applicable Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    Then Select Base Rate Applicable for eAuction Create
    And Select HSN Next Icon navigate to Choose Vendor
    And Select Next Icon After select HSN
    Then Verify to Enter Vendor eAuction Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Purchase Request Base Rate Applicable BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Place Bid in Bidders Quote
    Then Select Nature code in Bidders Quote
    Then Enter Your Bid value in Reverse Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario: eAuction Material Reverse Purchase Request Base Rate Applicable TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout
    
   
   Scenario: eAuction Reverse Purchase Request Multiple Vendors Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    #Then Select Base Rate Applicable for eAuction Create
    And Select HSN Next Icon navigate to Choose Vendor
    And Select Next Icon After select HSN
    Then Verify to Enter Multi Vendor Type in Material eAuction Create page
    # Then Verify to Add Vendor Button in eAuction Create
    #Then Verify to Enter Vendor eAuction Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Purchase Request Multiple Vendors A BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Purchase Request Multiple Vendors B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username    | Search | Buyer        | Rate | BQHSN    | TAN        |
      | THOMPSONENG | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Purchase Request Multiple Vendors C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username        | Search | Buyer        | Rate | BQHSN    | TAN        |
      | CHENNAIAGENCIES | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Purchase Request Multiple Vendors D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username | Search | Buyer        | Rate | BQHSN    | TAN        |
      | dpind    | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor A BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Material Reverse Purchase Request Multiple Vendors TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout 
    
    

  Scenario: eAuction Reverse Purchase Request Base Rate Applicable Multiple Vendors Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    Then Select Base Rate Applicable for eAuction Create
    And Select HSN Next Icon navigate to Choose Vendor
    And Select Next Icon After select HSN
    Then Verify to Enter Multi Vendor Type in Material eAuction Create page
    # Then Verify to Add Vendor Button in eAuction Create
    #Then Verify to Enter Vendor eAuction Create page and Add the Vendor Type
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Purchase Request Base Rate Applicable Multiple Vendors A BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Purchase Request Base Rate Applicable Multiple Vendors B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username    | Search | Buyer        | Rate | BQHSN    | TAN        |
      | THOMPSONENG | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Purchase Request Base Rate Applicable Multiple Vendors C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username        | Search | Buyer        | Rate | BQHSN    | TAN        |
      | CHENNAIAGENCIES | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Purchase Request Base Rate Applicable Multiple Vendors D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username | Search | Buyer        | Rate | BQHSN    | TAN        |
      | dpind    | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor A BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Reverse Purchase Request Multi Vendor D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Material Reverse Purchase Request Base Rate Applicable Multiple Vendors TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: Purchase Request Creation Domestic Multiple material Job
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
    Then Enter Choose Items PR domestic Multiple material in Material Cart
    Then Enter Choose Items PR domestic Multiple material in Material1 Cart
    Then Enter Choose Items PR domestic Multiple material in Material2 Cart
    Then Enter Choose Items PR domestic Multiple material in Material3 Cart
    Then Select Post Icon To Post the Selected Items in Cart
    Then Select Cost Package in Request Essentials
    Then Enter Cost Package in Request Essentials
    Then Enter Quantity in Request Essentials
    Then Enter Sugg Rate in Request Essentials first Material
    Then Enter DeliveryDate in Request Essentials
    Then Enter Second Quantity in Request Essentials
    Then Enter Third Quantity in Request Essentials
    Then Enter Fourth Quantity in Request Essentials
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
@PR
  Scenario: eAuction Reverse Multiple Material Purchase Request Multiple Vendors Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    And Select Multi HSN Purchase Request
    # And Select HSN Next Icon navigate to Choose Vendor
    And Select Next Icon After select HSN
    Then Verify to Enter Multi Vendor Type in PR Material eAuction Create page
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Multi Vendor Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors A BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username    | Search | Buyer        | Rate | BQHSN    | TAN        |
      | THOMPSONENG | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username        | Search | Buyer        | Rate | BQHSN    | TAN        |
      | CHENNAIAGENCIES | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username | Search | Buyer        | Rate | BQHSN    | TAN        |
      | dpind    | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor A BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Multiple Material Reverse Purchase Request Multiple Vendors TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Reverse Purchase Request Multiple Material Base Rate Applicable Multiple Vendors Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    Then Select Base Rate Applicable for eAuction Create
    And Select Multi HSN Purchase Request
    And Select Next Icon After select HSN
    Then Verify to Enter Multi Vendor Type in PR Material eAuction Create page
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Multi Vendor Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors A BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username    | Search | Buyer        | Rate | BQHSN    | TAN        |
      | THOMPSONENG | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username        | Search | Buyer        | Rate | BQHSN    | TAN        |
      | CHENNAIAGENCIES | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username | Search | Buyer        | Rate | BQHSN    | TAN        |
      | dpind    | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor A BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor A Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor B BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor B Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor C BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor C Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor D BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor D Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Multiple Material Reverse Purchase Request Multiple Vendors TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    And Text Verification Before TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    Then Text Verification After TCC
    And Logout

  Scenario: eAuction Reverse Purchase Request Multiple Material Base Rate Applicable Multiple Vendors Partial Bidding Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Material
    Then Select Partial Bidding Create eAuction
    Then Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials
    Then Select eAuction Reverse Purchase Request for eAuction Create
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Select Reverse Purchase Request
    And Verify that Select Purchase Request number in the Grid
    And Select Next Icon navigate to Bit Values
    Then Select Base Rate Applicable for eAuction Create
    And Select Multi HSN Purchase Request
    And Select Next Icon After select HSN
    Then Verify to Enter Multi Vendor Type in PR Material eAuction Create page
    Then Verify to Add Vendor Button in Reverse Purchase Request eAuction Create
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms Auction Create
    And Select Reference Value in Payment Terms Auction Create Page
    And Enter Credit Days in Payment Terms Auction Create
    And Select Payment Mode in Payment Terms Auction Create
    And Select Reference Date in Payment Terms Auction Create
    Then Select Document Payment Terms Reverse Purchase Request Multi Vendor Auction
    Then Verifiy the Payment Terms in Auction Create
    Then Verify and Enter Additional Details in Other Terms Page on Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors A Partial Bidding BQ
    Then RFQ Bidders Quote Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors B Partial Bidding BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username    | Search | Buyer        | Rate | BQHSN    | TAN        |
      | THOMPSONENG | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors C Partial Bidding BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username        | Search | Buyer        | Rate | BQHSN    | TAN        |
      | CHENNAIAGENCIES | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Reverse Multiple Material Purchase Request Multiple Vendors D Partial Bidding BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
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
    Then Click Trade Terms in Auction Techno Commercials
    Then Select Auction Trade Terms in Additional Details
    And Select Save button in BQ Trade details Techno Commercials
    Then Accept Alert
    Then Click Request Essentials in Techno Commercials
    Then Enter TAN Request Essentials as <TAN>
    Then Page Down RFQ Bidders Quote Request Essentials
    And Select Save button in BQ Request Essentials Techno Commercials
    Then Accept Alert
    Then Page Up RFQ Bidders Quote
    Then Select Close in Creation Bidders Quote For Auction
    And Logout

    Examples: 
      | Username | Search | Buyer        | Rate | BQHSN    | TAN        |
      | dpind    | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor A Partial Bidding BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor A Partial Bidding Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor B Partial Bidding BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor B Partial Bidding Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor C Partial Bidding BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor C Partial Bidding Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Multiple Material Reverse Purchase Request Multi Vendor D Partial Bidding BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor D Partial Bidding Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Multiple Material Reverse Purchase Request Multiple Vendors TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Material All Menu
    And Enter Reverse eAuction No from DB
    And Text Verification Before TCC
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    Then Text Verification After TCC
    And Logout

  @PR
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
@PR1
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
@PR2
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
@PR3
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
      
      @PR4
      Scenario: Domestic Job Material RFQ Auto BQ Material Verification
    Then Request For Quote Login and Select RFQ Create
    Then After Login Request For Quote Add Material page
    Then Add RFQ Values from Request For Quote Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Payment Terms RFQ Create page
    And Enter Other Terms Page on Auction RFQ Create 
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    @PR5
    Scenario: eAuction Reverse Request For Quote Verification
    Then eAuction Login and Select Auction Create 
    Then Verify eAuction Navication menu Material
    Then Enter Scope Of eAuction Reverse Request For Quote Create Schedule Essentials
    Then Select eAuction Reverse Request For Quote for eAuction Create
    And Select Next Icon in Schedule Essentials Auction Payment
    And Select Next Icon in Auction Bid Values
    And Accept Alert in eAuction
    And Select Next Icon in Auction Vendors
    And Accept Alert in eAuction
    And Select Next Icon in Payment Terms Auction Payment
    And Accept Alert in eAuction
    #And Enter Other Terms Page on Auction RFQ Create
   Then Verify and Enter Additional Details in Other Terms Page on Refrence RFQ Auction Create
    Then Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create
  