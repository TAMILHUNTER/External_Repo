@RFQRateDiscoveryService
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment

   Scenario: Domestic Job Service Rate Discovery Attachment RFQ Material Verification
         Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter RD Service Payment Terms RFQ Create page
    And Enter Other Terms SR Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create




  

  Scenario: Domestic Job Service Rate Discovery Attachment Auto BQ RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create Service
    And Verify and Enter Details on Service Cart in Rate Discovery RFQ Create
    And Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create
   And Verify to Enter Vendor Service RD RFQ Auto BQCreate page and Add the Vendor Type then Move to Payment Terms
      
    And Enter RD Service Payment Terms RFQ Create page
    And Enter Other Terms SR Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    
    
    
