@EIP_RFQ
Feature: RFQ Creation

  Background: 
    Given Go to Test Environment

  Scenario: Domestic Job Service Attachment RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    And Service Request For Quote Choose Vendors Page Verification
    And Verify to Enter Vendor Service RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Service Payment Terms RFQ Create page
    And Enter Other Terms Page on SR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
