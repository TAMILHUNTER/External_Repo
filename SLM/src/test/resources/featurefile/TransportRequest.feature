@Transport_Request
Feature: Transport Request.
  As a user i should able to create Transport Request.

  @Request_Landing_Page @RegressionTesting
  Scenario: Transport Request landing page.
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    Then As a user i should able to view the Transport Request landing page.
    Then Verify the movement type is displayed as Vendor to Site PO
    Then Verify the landing page displayed with tabs[Source, For Actions, In Progress and All]
    Then as a user i should able to switch between the tabs
    Then as a user i should able to change the viewing list and able to view the records based on <days>
      | 90 |
    Then as a user i should able to change the number of <rows> to be displayed in the grid
      |20|
    Then as a user i should able to search the <record> using advance search
      | LE/LE190313/FRQ/22/000001 |
    Then as a user i should able to clear the search terms inputfields
    Then as a user i should able to navigate through the pages
    Then as a user i should able to min and max the grid.
    Then as a user i should able to change the <Document Type> 
      | Intercarting |
    #Then as a user i should able to select one <record> from source tab and should able to create Transport Request verify the create window
      #| LE/LE180046/POD/22/000036 |
    #Then as a user i should able to select multiple records from source tab and should able to create Transport Request & verify the create window

  @Transport_Request_Creation_RatePerVehicle @RegressionTesting
  Scenario: Transport Request creation rate per vehicle
    Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    Then As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE180046 - Raheja |
    Then As a user i should able to select from warehouse
      | 2699 - STEEL SERVICE CENTRE |
    Then As a user i should able to select to job
      | LE180046 - Raheja |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    Then Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    Then as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |4 - Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per Vehicle|
    Then as a user i should able to filter the created records using filter icon
    
    @Transport_Request_Creation_Non_rate_rate_per_vehicle @RegressionTesting
  Scenario: Transport Request creation rate per vehicle non rate contract
    Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    And As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE180046 - Raheja |
    Then As a user i should able to select from warehouse
      | 2699 - STEEL SERVICE CENTRE |
    Then As a user i should able to select to job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    And Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    And as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |5 - Non Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per Vehicle|
    Then as a user i should able to filter the created records using filter icon
    
    
    @Transport_Request_Creation_Non_rate_Rate_Per_MT @TransportRequest
  Scenario: Transport Request creation rate per vehicle non rate contract
    Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    And As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select from warehouse
      | 3115 - Head Quarters - Stores (MANAPAKKAM) |
    Then As a user i should able to select to job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    And Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    And as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |5 - Non Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per MT|
    Then as a user i should able to filter the created records using filter icon
    	
   @Transport_Request_Creation_mt @TransportRequest
  Scenario: Transport Request creation rate per MT
    Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    And As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select from warehouse
      | 3115 - Head Quarters - Stores (MANAPAKKAM) |
    Then As a user i should able to select to job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    And Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    And as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |4 - Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per MT|
    Then as a user i should able to filter the created records using filter icon
    
    
    @Transport_Request_Creation_And_SendBack_From_Transporter_Login @TransportRequest
  Scenario: ransport Request Creation & SendBack_From_Transporter_Login
    Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    And As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select from warehouse
      | 3115 - Head Quarters - Stores (MANAPAKKAM) |
    Then As a user i should able to select to job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    And Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    And as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |4 - Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per MT|
    Then as a user i should able to filter the created records using filter icon
    Then Login to the transporter login
    Then Search the FRQ number under for action tab
    Then Verify the From, to, number of vehicles, currency, distance, send back and acknowledge details are visible
    Then Verify transporter able to send back the transport request
    And Verify the send back request displayed under for action in creator login
    
    
    @Transport_request_create_recall @TransportRequest
    Scenario: Transport Request creation and recall
   	Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    And As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select from warehouse
      | 3115 - Head Quarters - Stores (MANAPAKKAM) |
    Then As a user i should able to select to job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    And Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    And as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |4 - Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per MT|    
    Then as a user i should able to filter the created records using filter icon
    Then as a user i should able to recall the created request
    Then verify the recalled request saved under draft mode
    
    
    @Transport_request_create_cancel @TransportRequest
    Scenario: Transport Request creation and cancel
   	Given As a user i should able to view the home page 
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    And As a user i should able to view the Transport Request landing page.
    Then as a user i should able to change the <Document Type>
      | Intercarting |
    Then As a user i should able to select from job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select from warehouse
      | 3115 - Head Quarters - Stores (MANAPAKKAM) |
    Then As a user i should able to select to job
      | LE120406 - CF SILO AT PRISM CEMENT LTD, SATNA |
    Then As a user i should able to select to warehouse
      | 3116 - FORM WORK COMPETENCY CELL -HQ |
    Then As a user is hould able to click create icon to create a request
    And Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse
    Then i should able to capture document number or reference number
      | TRCreation |
    Then As a user i should able to view Consignor Details & Consignee Details
    Then as a user if i try to skip the material step error message should displayed
    And as the movement type is intercarting i should able to select Materials from Material Cart
    Then i should able to view Material Cart page to capture Material Category, Group and Item
      | Reinforc |
      | Reinforc |
      | Reinforc |
    Then as a user is should able to min and max the gird view
    #Then as a user i should able to filter the records
    #Then user should able to capture the terms and condtions
    Then as a user i should able to capture shipment quantity againts the selected items negative values are not allowed
    Then as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity
    Then as a user i should able to capture the packing details
    Then then as a user i should able to capture the location details
    |4 - Rate Contract|
    Then as a user i should able to capture the vechile details
    |Rate per MT|    
    Then as a user i should able to filter the created records using filter icon
    Then as a user i should able to cancell the created request
    Then verify the cancelled request updated as cancell
    
    
		@Transport_request_search_FRQNumber
  	Scenario: Transport Request search using FRQNumber
  	Given As a user i should able to view the home page 
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    Then as a user i should able to change the Document Type
      | Intercarting |
    Then verify users are able to click advance search icon
    Then verify users are able to click and pass the FRQ Number
    Then verify users are able to click the search button
    Then verify users are able to view the searched FRQ Number
    
    @Transport_request_search_clear
  Scenario: Transport Request search and clear parameter
  Given As a user i should able to view the home page 
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    Then as a user i should able to change the Document Type
      | Intercarting |
    Then verify users are able to click advance search icon
    Then verify users are able to click and pass the FRQ Number
    Then verify users are able to click the search button
    Then verify users are able to view the searched FRQ Number
    Then verify users are able to clear the searched results
    
    
    @Transport_request_search_using_date
    Scenario: Search Transport Request between days
    Given As a user i should able to view the home page 
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then As a user i should able to select Transport Request.
    Then as a user i should able to change the Document Type
      | Intercarting |
    Then verify users are able to click advance search icon
    Then verify users are able to click the calendar icon
    Then verify users are able to select date range to search
    Then verify users are able to click the search button        