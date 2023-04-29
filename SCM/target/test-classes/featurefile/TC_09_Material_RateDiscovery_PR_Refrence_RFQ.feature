@MaterialRateDiscoveryPurchaseRequestBasedRefrenceRFQEndToEnd
Feature: Verify the RFQ Creation

  Background: 
    Given Go to Test Environment
    
    
    Scenario: Domestic Job Material Rate Discovery Attachment Auto BQ RFQ Material Verification
    Then Request For Quote Login and Select RFQ Create
    And Verify and Select Rate Discovery Button RFQ Create
    And Verify and Enter Details on Material Cart in Rate Discovery RFQ Create
    And Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page
    And Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms
    And Enter Payment Terms  Rate discovery RFQ Create page
    And Enter Other Terms Rate Discovery Page on RFQ Create
    Then Verify and Select Attachment in Other Terms Page on RFQ Create
    
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
      
      
      

    Scenario: Domestic Job Material Refrence RFQ
    Then Request For Quote Login and Select RFQ Create
    Then Verfy Error Alert to Select Next Icon without Allocation No
    And Error Alert Verification in Add Material
    Then Verify to select Advance Search in RFQ Create Page
    And Verify to Enter Latest Purchase Request from DB in the Advance Search
    And Verify that after select Search Icon to list the Latest Purchase Request number in Grid
    And Verify that Select Purchase Request number in the Grid
    #And Verfy that Select Next Icon with Allocation No navigate to Add RFQ Values
    #And Verfy that Select Previous Icon navigate to Add Material Page
    And Verfy that Select Next Icon navigate to Add RFQ Values
    And Enter RFQ No from DB in Refrence RFQ Field
    Then Select RFQ No from List in Refrence RFQ Field
    Then Accept Alert Validation
    And Accept Alert
    And Logout
    

 