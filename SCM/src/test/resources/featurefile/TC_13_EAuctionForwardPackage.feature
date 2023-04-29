@eAuctionForwardPackageEndToEnd
Feature: Verify the eAuction Creation

  Background: 
    Given Go to Test Environment

  Scenario: eAuction Forward Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction FDRD Create Schedule Essentials
    Then Select Auction Type Forward for eAuction Create
    Then Enter Desciption Forward Rate discovery for Bid Values eAuction Create
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

  Scenario Outline: eAuction Forward BQ
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
    Then Enter Your Bid value in Reverse Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario: eAuction Forward TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Package Forward Rate Discovery Base Rate Applicable Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction FDRD Create Schedule Essentials
    Then Select Auction Type Forward for eAuction Create
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

  Scenario Outline: eAuction Package Forward Rate Discovery BQ
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
    Then Enter Your Bid value in Forward Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario: eAuction Package Forward Rate Discovery TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Package Forward Rate Discovery Base Rate Applicable Multi Vendor and Multi Material Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction FDRD Create Schedule Essentials
    Then Select Auction Type Forward for eAuction Create
    Then Select Base Rate Applicable for eAuction Create
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor A BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor B BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor C BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor D BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor  BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Package Forward Rate Discovery TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Package Forward Rate Discovery Base Rate Applicable Multi Vendor and Multi Material Partial Bidding Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Select Partial Bidding Create eAuction
    Then Enter Scope Of eAuction FDRD Create Schedule Essentials
    Then Select Auction Type Forward for eAuction Create
    Then Select Base Rate Applicable for eAuction Create
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor A BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor B BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor C BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi Vendor D BQ
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

  Scenario Outline: eAuction Package Forward Rate Discovery Multi A1 Vendor  BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi B1 Vendor  BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi C1 Vendor  BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  
  Scenario Outline: eAuction Package Forward Rate Discovery Multi D1 Vendor  BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi A2 Vendor  BQ
    Then RFQ Bidders Quote Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi B2 Vendor  BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi C2 Vendor  BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Forward Rate Discovery Multi D2 Vendor  BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Rank Order Forward TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Rank Order Forward Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction ROFRD Create Schedule Essentials
    Then Select Auction Type Rank Order Forward for eAuction Create
    Then Enter Desciption Rank Order Forward Rate discovery for Bid Values eAuction Create
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

  Scenario Outline: eAuction Rank Order Forward BQ
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
    Then Enter Your Bid value in Reverse Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario: eAuction Rank Order Forward TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Package Rank Order Forward Rate Discovery Base Rate Applicable Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction ROFRD Create Schedule Essentials
    Then Select Auction Type Rank Order Forward for eAuction Create
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery BQ
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
    Then Enter Your Bid value in Rank Order Forward Auction
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Username   | Search | Buyer        | Rate | BQHSN    | TAN        |
      | KNOWELL123 | RFQ    | ARULSELVAN R |    5 | 04021010 | 1111111111 |

  Scenario: eAuction Package Rank Order Forward Rate Discovery TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Package Rank Order Forward Rate Discovery Base Rate Applicable Multi Vendor and Multi Material Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Enter Scope Of eAuction ROFRD Create Schedule Essentials
    Then Select Auction Type Rank Order Forward for eAuction Create
    Then Select Base Rate Applicable for eAuction Create
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor A BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor B BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor C BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor D BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor  BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor ROF D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Package Rank Order Forward Rate Discovery TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout

  Scenario: eAuction Package Rank Order Forward Rate Discovery Base Rate Applicable Multi Vendor and Multi Material Partial Bidding Verification
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication menu Package
    Then Select Partial Bidding Create eAuction
    Then Enter Scope Of eAuction ROFRD Create Schedule Essentials
    Then Select Auction Type Rank Order Forward for eAuction Create
    Then Select Base Rate Applicable for eAuction Create
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor A BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor B BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor C BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi Vendor D BQ
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

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi A1 Vendor  BQ
    Then RFQ Bidders Quote Login
    Then Auction Start Date update
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi B1 Vendor  BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi C1 Vendor  BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi D1 Vendor  BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select Place Bid in Bidders Quote
    Then Enter Your Bid value Vendor First Single ROF D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi A2 Vendor  BQ
    Then RFQ Bidders Quote Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single A
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi B2 Vendor  BQ
    Then RFQ Bidders Quote Vendor THOMPSONENG Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single B
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi C2 Vendor  BQ
    Then RFQ Bidders Quote Vendor CHENNAIAGENCIES Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single C
    Then Select Close in Creation Bidders Quote For Reverse Auction
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario Outline: eAuction Package Rank Order Forward Rate Discovery Multi D2 Vendor  BQ
    Then RFQ Bidders Quote Vendor dpind Login
    Then Select InProgress Auction VB Page
    Then Select Show Advance Search
    Then Enter Domestic Job Auction No from DB
    Then Select Buyer in Bidders Quote as <Buyer>
    Then Select Search icon in Bidders Quote
    Then Select ReBid Auction VB Page
    Then Enter Your Bid value Vendor Second Single D
    Then Select Close in Creation Bidders Quote For Reverse Auction
    Then Auction End Date update
    Then Auction Final Result DB
    And Logout

    Examples: 
      | Buyer        |
      | ARULSELVAN R |

  Scenario: eAuction Rank Order Forward TCC
    Then eAuction Login and Select Auction Create
    Then Verify eAuction Navication to Package All Menu
    And Enter Reverse eAuction No from DB
    Then Mouseover in RFQ Numner TCC
    Then Select Comparison in Request For Quote
    Then Select TCC Close in Techno Commercial Comparison
    Then Accept Alert
    Then Refresh eAuction Navication to Package
    And Logout
