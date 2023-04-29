@RFQSRServiceBQ
Feature: Verify the SR RFQ Creation

  Background: 
    Given Go to Test Environment

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
    #Then Enter DeliveryDate in Request Essentials
    Then Select Submit in Request Essentials
    Then Service Request Accept

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


  

  Scenario: Domestic Job Attachment RFQ Service Verification
       Then Request For Quote Login and Select RFQ Create Service
    Then After Login Service Request For Quote Add Service page
    Then Add RFQ Values from SR Request For Quote Create Page
    Then Verify to Enter Vendor Service RFQ Create page and Add the Vendor Type then Move to Payment Terms
    And Enter Service Payment Terms RFQ Create page
    And Enter Other Terms Page on SR RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create

  
  