@RFQRateDiscoveryServiceEndToEnd
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment

  Scenario: Domestic Job Material Rate Discovery RFQ Home Page Verification
     Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Request For Quote Login and Select Navigate to RFQ Home Page
    Then Request For Quote Home Page Verification
    Then Select Service in Request For Quote
    Then Verify to Select Request For Quote Create icon 


  Scenario: Domestic Job Service Rate Discovery RFQ Add Service Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then Verfy Error Alert to Select Next Icon without Allocation No in Service RFQ
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button Service RFQ Create
    And Verify and Rate Discovery Service RFQ Create 
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Service Category Verification
    And Rate Discovery Service Group Verification
    And Service Rate Discovery Choose Items Verification
    And Service Rate Discovery Choose Items Post And Move Verification 
    Then Close and Logout RFQ Page


  Scenario: Domestic Job Service Rate Discovery RFQ Add RFQ Values Verification
   Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify the Scope Of RFQ Enter in Crate Service RD RFQ Page
    And Enter RD Service Quantity in RFQ Create Page
    And Enter SR RD Sugg Rate and Save Draft in RFQ Create Page
    Then Select SAC Code in SR RFQ Create

 
  Scenario: Domestic Job Service Rate Discovery RFQ Choose Vendors Verification
  Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
    
    
    And Service Request For Quote RD Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Service RD RFQ Create
    And Close and Logout
    
 
  Scenario: Domestic Job Service Rate Discovery RFQ Payment Terms Verification
  Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Create page and Add the Vendor Type then Move to Payment Terms
      
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Service Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Service Reference Date in Payment Terms RFQ Create
    Then Select Service Document Payment Terms RD
    Then Verifiy the Service RD Payment Terms in RFQ Create
    And Close and Logout
    
  
  Scenario: Domestic Job Service Rate Discovery RFQ Other Terms Verification
     Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter RD Service Payment Terms RFQ Create page
    
    And Verify and Enter Liquidity Damage in RD Service Other Terms Page on RFQ Create
    And Verify and Enter Defect Liablility Period in RD Service Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on SR RFQ Create
    And Verify and Enter Additional Details in SR Rate Discovery Other Terms Page on RFQ Create
    And Close and Logout


  Scenario: Domestic Job Service Rate Discovery Attachment RFQ Material Verification
         Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter RD Service Payment Terms RFQ Create page
    And Enter Other Terms SR Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create




  Scenario: Domestic Job Material Rate Discovery RFQ Auto BQ Home Page Verification
     Then Click on Other User
    Then Enter EIP QA Username
    Then Enter the Password
    Then Click on Login
    Then Request For Quote Login and Select Navigate to RFQ Home Page
    Then Request For Quote Home Page Verification
    Then Select Service in Request For Quote
    Then Verify to Select Request For Quote Create icon


  Scenario: Domestic Job Service Rate Discovery RFQ Auto BQ Add Service Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then Verfy Error Alert to Select Next Icon without Allocation No in Service RFQ
    And Error Alert Verification in Add Material
    And Verify and Select Rate Discovery Button Service RFQ Create
    And Verify and Rate Discovery Service RFQ Create 
    And Verify and Select Add Cart Rate Discovery in RFQ Create
    And Rate Discovery Service Category Verification
    And Rate Discovery Service Group Verification
    And Service Rate Discovery Choose Items Verification
    And Service Rate Discovery Choose Items Post And Move Verification 
    Then Close and Logout RFQ Page


  Scenario: Domestic Job Service Rate Discovery RFQ Auto BQ Add RFQ Values Verification
    Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify the Scope Of RFQ Enter in Crate Service RD RFQ Page
    And Enter RD Service Quantity in RFQ Create Page
    And Enter SR RD Sugg Rate and Save Draft in RFQ Create Page
    Then Select SAC Code in SR RFQ Create


  Scenario: Domestic Job Service Rate Discovery Auto BQ RFQ Choose Vendors Verification
  Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
      
    And Service Request For Quote RD Choose Vendors Page Verification
    And Verify to Enter Vendor RFQ Create page and Add the Vendor Type
    And Verify to Add Vendor Button in Auto BQ SR RD RFQ Create
    And Close and Logout
  
  

 Scenario: Domestic Job Service Rate Discovery RFQ Auto BQ Payment Terms Verification
  Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Auto BQCreate page and Add the Vendor Type then Move to Payment Terms
      
    And Enter Release in Payment Terms Page
    And Select Event Payment Terms RFQ Create
    And Select Service Reference Value in Payment Terms RFQ Create Page
    And Enter Credit Days in Payment Terms RFQ Create
    And Select Payment Mode in Payment Terms RFQ Create
    And Select Service Reference Date in Payment Terms RFQ Create
    Then Select Service Document Payment Terms RD
    Then Verifiy the Service RD Payment Terms in RFQ Create
    And Close and Logout


  Scenario: Domestic Job Service Rate Discovery RFQ Auto BQ Other Terms Verification
    Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Auto BQCreate page and Add the Vendor Type then Move to Payment Terms
      
   And Enter RD Service Payment Terms RFQ Create page
   
    And Verify and Enter Liquidity Damage in RD Service Other Terms Page on RFQ Create
    And Verify and Enter Defect Liablility Period in RD Service Other Terms Page on RFQ Create
    And Verify and Enter Special Terms Qualifications in Other Terms Page on SR RFQ Create
    And Verify and Enter Additional Details in SR Rate Discovery Other Terms Page on RFQ Create
    And Close and Logout

  Scenario: Domestic Job Service Rate Discovery Attachment Auto BQ RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Auto BQCreate page and Add the Vendor Type then Move to Payment Terms
      
    And Enter RD Service Payment Terms RFQ Create page
    And Enter Other Terms SR Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    
    
    
