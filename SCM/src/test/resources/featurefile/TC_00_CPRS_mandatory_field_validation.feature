@CPRSCreationmandatoryfieldvalidation
Feature: Verify CPRS Creation for Vehicles and Plant Machinery , Approval and Asset Request Page

  Background: 
    Given Go to Test Environment

  Scenario Outline: Capital Purchase Request mandatory field validation
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    #Then Click on Login
    #Then Enter CPRS in Search Menu as <CPRS>
    #Then Select Capital Purchase Request in Search Menu
    Then Select CPRS Menu
    Then Select Create Capital Purchase Request icon
    Then Select Go button for mandatory field validation 
    And Title of Alert Message validation
    And Alert Message validation
    Then Alert Accept for mandatory field validation
    Then Verify to Select IC from the List in Create CPRS Page <IC>
    Then Select Go button for mandatory field validation 
    And Title of Alert Message validation 
    And Alert Message validation for after IC select
    Then Alert Accept for mandatory field validation 
    Then Enter Job in Create CPRS as <Job> 
    Then Select Go button for mandatory field validation
    And Title of Alert Message validation
    And Alert Message validation for after Job and Cluster select 
    Then Alert Accept for mandatory field validation
    Then Enter Request Category in Create CPRS as <Category>
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Enter Asset Group in Create CPRS as <AssetGroup>
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Select Asset Attributes in CPRS Create
    Then Select Post Icon in Asset Attributes
    And Title of Alert Message validation
    And Alert Message validation for select Post button in Asset Attributes
    Then Alert Accept for mandatory field validation
    Then Select Asset Make in Asset Attributes as <AssetMake>
    Then Select Post Icon in Asset Attributes
    And Title of Alert Message validation
    And Alert Message validation for select Post button in Asset Attributes after select Asset make
    Then Alert Accept for mandatory field validation
    Then Select Asset Model in Asset Attributes as <AssetModel>
    Then Select Post Icon in Asset Attributes
    And Title of Alert Message validation
    And Alert Message validation for select Post button in Asset Attributes after select Asset make and Asset model
    Then Alert Accept for mandatory field validation
    Then Enter Capacity in Asset Attributes as <Capacity>
    Then Select Post Icon in Asset Attributes
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Select Purchase Type in CPRS Create as <PurchaseType>
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Enter Required Quantity in CPRS Create as <RequiredQuantity>
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Select Delivery Schedule in Asset Attributes
    Then Select Save Delivery Schedule
    And Title of Alert Message validation
    And Alert Message validation for select save button in Delivery Schedule
    Then Alert Accept for mandatory field validation
    Then Select Warehouse in CPRS Create as <Warehouse>
    Then Select Save Delivery Schedule
    And Title of Alert Message validation
    And Alert Message validation for select save button in Delivery Schedule after select Warehouse
    Then Alert Accept for mandatory field validation
    Then Enter Required Quantity in Delivery Schedule as <RequiredQuantityDS>
    Then Select Post Delivery Schedule
    And Title of Alert Message validation
    And Alert Message validation for select save button in Delivery Schedule after enter Quantity
    Then Alert Accept for mandatory field validation
    Then Select Save Delivery Schedule
    Then Select Post Delivery Schedule
    Then Enter Suggested Rate in CPRS Create as <SuggestedRate>
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Select Additional Information in Create CPRS
    Then Select Procurement Justification in Additional Information
    Then Select Procurement Justification from List in Additional Information
    Then Select Post Icon in Additional Information
    And Title of Alert Message validation
    And Alert Message validation for select Post button in Additional Information
    Then Alert Accept for mandatory field validation
    Then Select Scope of Work Qlt in Additional Information
    Then Enter Deployement Work Attributes in Additional Information as <DeployementWorkAttributes>
    Then Select Unit of Measurement in Additional Information as <UnitofMeasurement>
    Then Select Post Icon in Additional Information
    And Title of Alert Message validation
    And Alert Message validation for select Post button in Additional Information after enter Deployment work attributes
    Then Alert Accept for mandatory field validation
    Then Enter Suggested Rate in Additional Information as <ScopeofWorkQuantity>
    Then Select Post Icon in Additional Information
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of CPRS value
    Then Alert Accept for mandatory field validation
    Then Enter Deployment In Current Job in Create CPRS as <DeploymentInCurrentJob>
    Then Enter Deployment In Future Job in Create CPRS as <DeploymentInFutureJob>
    Then Select Save Icon in Create CPRS
    Then Select Submit Icon in Create CPRS
    And Title of Alert Message validation
    And Alert Message validation for select submit button not fill the details of Scope
    Then Alert Accept for mandatory field validation
    Then Move to Scope of work
    Then Enter Scope of work in Create CPRS as <Scopeofwork>
    Then Select Submit Icon in Create CPRS
    Then Alert Accept in Create CPRS

    Examples: 
      | Username      | CPRS | IC                    | Job      | Category | AssetGroup | AssetMake | AssetModel | Capacity | PurchaseType | RequiredQuantity | Warehouse | RequiredQuantityDS | SuggestedRate | DeployementWorkAttributes | UnitofMeasurement     | ScopeofWorkQuantity | DeploymentInCurrentJob | DeploymentInFutureJob | Scopeofwork                     |
      | pravichandran | CPRS | Buildings & Factories | LE180046 | Vehicles |       4017 |        63 |        454 |       10 | New          |               10 |      2699 |                 10 |           100 |                        10 | Kilometres per second |                  10 |                      1 |                     1 | Create Capital Purchase Request |

  