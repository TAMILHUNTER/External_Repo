@RFQSRServiceEndToEnd
Feature: Verify the SR RFQ Creation

  Background: 
    Given Go to Test Environment
    @SR
    Scenario: Service Request Creation
    Then Purchases Request Login
    Then Select Service in Purchases
    Then Click Create Request Icon in Service
    Then Enter Job in Request Essentials SR
    Then Select Payment Centre
    Then Select Service Group
    Then Select WO Period
    Then Select Service Category in Create Service Request Page 
    Then Select Group in Create Service Request Page
    Then Enter Nature of scope in Create Service Request Page 
    Then Select Cart in Create Service Request Page
    Then Enter Choose Items SR domestic Job in Service Cart
    Then Select Item Service Group SR in Service Cart
    Then Select Arrow To Move Choose Items in Cart
    Then Select Post Icon To Post the Selected Items in Cart
    Then Select Cost Package in SR Request Essentials
    Then Enter Cost Package in SR Request Essentials 
    Then Enter SR Quantity in Request Essentials
    Then Enter SR Sugg Rate in Request Essentials
    Then Select Submit in Request Essentials
    Then Service Request Accept
    
     Scenario: Domestic Job Service RFQ Ato BQ Choose Vendors Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Auto SR BQ RFQ Create
    And Close and Logout
    
@SRM
  Scenario: Service Request Multi Creation
    Then Purchases Request Login
    Then Select Service in Purchases
    Then Click Create Request Icon in Service
    Then Enter Job in Request Essentials SR
    Then Select Payment Centre
    Then Select Service Group
    Then Select WO Period
    Then Select Service Category in Create Service Request Page 
    Then Select Group in Create Service Request Page
    Then Enter Nature of scope in Create Service Request Page 
    Then Select Cart in Create Service Request Page
    Then Enter Choose Items SR domestic Job in Service Cart
    Then Select Item Service Group SR in Service Cart
    Then Select Arrow To Move Choose Items in Cart
    Then Select Post Icon To Post the Selected Items in Cart
    Then Select Cost Package in SR Request Essentials
    Then Enter Cost Package in SR Request Essentials 
    Then Enter SR Quantity in Request Essentials
    Then Enter SR Sugg Rate in Request Essentials
    Then Select Cart in Create Service Request Page
    Then Enter Choose Items SR domestic Job in Service Cart
    Then Select Item Service Group SR in Service Cart
    Then Select Arrow To Move Choose Items in Cart
    Then Select Post Icon To Post the Selected Items in Cart
    Then Select Cost Next Package in SR Request Essentials
    Then Enter Next Cost Package in SR Request Essentials 
    Then Enter SR Next Quantity in Request Essentials
    Then Enter SR Next Sugg Rate in Request Essentials
    Then Select Submit in Request Essentials
    Then Service Request Accept
    
    @SRMA
    Scenario Outline: Domestic Job Purchase Request Approval
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search
    Then Enter Domestic Job SR No from DB 
    Then Select Search Icon in final Approval 
    Then Mouseover in PR Numner
    Then Select Approve for Purchases Request
    Then Select Ok In Approval Sucess Alert

    Examples: 
      | documentType |
      | SR           |
    
    
    @AutoRFQBQSR
     Scenario: Domestic Job Service RFQ Ato BQ Choose Vendors Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Auto SR BQ RFQ Create
    And Close and Logout
    
    

  

  Scenario: Domestic Job Service RFQ Home Page Verification
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Request For Quote Login and Select Navigate to RFQ Home Page
    #Then Verify To list RFQ menu after Enter RFQ in Search Menu
    #Then Verify to Navigate the Request For Quote Home Page after select RFQ in Search Menu Result
    Then Request For Quote Home Page Verification
    Then Select Service in Request For Quote
    Then Verify to Select Request For Quote Create icon


  Scenario: Domestic Job Service Add Service Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then Verfy Error Alert to Select Next Icon without Allocation No in Service RFQ
    And Error Alert Verification in Add Material
    Then Select Service Item View in Create RFQ
    Then Select SR Number View in Based On
    Then Verify to select Filter in RFQ Create Page
    And Verify to Enter Latest Service Request from DB in Filter
    And Verify that Select Service Request number in the Grid
    And Close and Logout

  Scenario: Domestic Job Service Add RFQ Value Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    And Add RFQ Values Verification in RFQ Create
    And Verify that Service Scope Of RFQ Enter in Crate RFQ Page
    And Enter Service Quantity in RFQ Create Page
    And Select Expand List in Details of SR RFQ Value
    And Select Service Delivery Schedule in Details of RFQ Value
    And Enter Quality at Delivery Schedule in Details of RFQ Value
    And Select SR Save and Close Button then Accept Alert in Delivery Schedule
    Then Select SAC Code in SR RFQ Create
    #And Logout

  Scenario: Domestic Job Service RFQ Choose Vendors Verification
      Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Service RFQ Create
    And Close and Logout


  Scenario: Domestic Job Service RFQ Payment Terms Verification
      Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    Then Verify to Enter Vendor Service RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Service Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Service Reference Date in Payment Terms RFQ Create
    Then Select Service Document Payment Terms
    Then Verifiy the Service Payment Terms in RFQ Create
    And Close and Logout


  Scenario: Domestic Job Service RFQ Other Terms Verification
      Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    Then Verify to Enter Vendor Service RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Service Payment Terms RFQ Create page
    And Verify and Enter Liquidity Damage in Service Other Terms Page on RFQ Create
    And Verify and Enter Defect Liablility Period in Service Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on SR RFQ Create
    And Verify and Enter Additional Details in Service Other Terms Page on RFQ Create
    And Close and Logout

  Scenario: Domestic Job Attachment RFQ Service Verification
       Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    Then Verify to Enter Vendor Service RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Service Payment Terms RFQ Create page
    And Enter Other Terms Page on SR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  Scenario: Domestic Job Service RFQ Auto BQ Home Page Verification
    Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
   Then Request For Quote Login and Select Navigate to RFQ Home Page
    Then Request For Quote Home Page Verification
    Then Select Service in Request For Quote
    Then Verify to Select Request For Quote Create icon

  Scenario: Domestic Job Service RFQ Auto BQ Add Service Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then Verfy Error Alert to Select Next Icon without Allocation No in Service RFQ
    And Error Alert Verification in Add Material
    Then Select Service Item View in Create RFQ
    Then Select SR Number View in Based On
    Then Verify to select Filter in RFQ Create Page
    And Verify to Enter Latest Service Request from DB in Filter
    And Verify that Select Service Request number in the Grid
    And Close and Logout

  
  Scenario: Domestic Job Service Add RFQ Value Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    And Add RFQ Values Verification in RFQ Create
    And Verify that Service Scope Of RFQ Enter in Crate RFQ Page
    And Enter Service Quantity in RFQ Create Page
    And Select Expand List in Details of SR RFQ Value
    And Select Service Delivery Schedule in Details of RFQ Value
    And Enter Quality at Delivery Schedule in Details of RFQ Value
    And Select SR Save and Close Button then Accept Alert in Delivery Schedule
    Then Select SAC Code in SR RFQ Create
    #And Logout

  Scenario: Domestic Job Service RFQ Ato BQ Choose Vendors Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Auto SR BQ RFQ Create
    And Close and Logout

  Scenario: Domestic Job Service RFQ Payment Terms Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor Service RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Service Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Service Reference Date in Payment Terms RFQ Create
    Then Select Service Document Payment Terms
    Then Verifiy the Service Payment Terms in RFQ Create
    And Close and Logout

  Scenario: Domestic Job Service RFQ Other Terms Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page 
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor Service RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Service Payment Terms RFQ Create page
    And Verify and Enter Liquidity Damage in Service Other Terms Page on RFQ Create
    And Verify and Enter Defect Liablility Period in Service Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on SR RFQ Create
    And Verify and Enter Additional Details in Service Other Terms Page on RFQ Create
    And Close and Logout

  
  Scenario: Domestic Job Service Attachment RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page 
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor Service RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Service Payment Terms RFQ Create page
    And Enter Other Terms Page on SR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
