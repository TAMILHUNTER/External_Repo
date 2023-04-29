@CPRSCreationAndApprovalFORPM
Feature: Verify CPRS Creation for Vehicles and Plant Machinery , Approval and Asset Request Page

  Background: 
    Given Go to Test Environment

  Scenario Outline: Capital Purchase Request mandatory field validation
   
     Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    # Then Click on Login
    Then Enter CPRS in Search Menu as <CPRS>
    Then Select Capital Purchase Request in Search Menu
    Then Select Create Capital Purchase Request icon
    Then Enter IC in Create CPRS as <IC>
    Then Enter Job in Create CPRS as <Job>
    Then Enter Request Category in Create CPRS as <Category>
    Then Enter Asset Group in Create CPRS as <AssetGroup> 
    Then Select Asset Attributes in CPRS Create
    Then Select Asset Make in Asset Attributes as <AssetMake>
    Then Select Asset Model in Asset Attributes as <AssetModel>
    Then Enter Capacity in Asset Attributes as <Capacity>
    Then Select Post Icon in Asset Attributes
    Then Select Purchase Type in CPRS Create as <PurchaseType>
    Then Enter Required Quantity in CPRS Create as <RequiredQuantity>
    Then Select Delivery Schedule in Asset Attributes
    Then Select Warehouse in CPRS Create as <Warehouse> 
    Then Enter Required Quantity in Delivery Schedule as <RequiredQuantityDS>
    Then Select Save Delivery Schedule
    Then Select Post Delivery Schedule
    Then Enter Suggested Rate in CPRS Create as <SuggestedRate>
    Then Select Additional Information in Create CPRS
    Then Select Procurement Justification in Additional Information
    Then Select Procurement Justification from List in Additional Information
    Then Select Scope of Work Qlt in Additional Information
    Then Enter Deployement Work Attributes in Additional Information as <DeployementWorkAttributes>
    Then Select Unit of Measurement in Additional Information as <UnitofMeasurement>
    Then Enter Suggested Rate in Additional Information as <ScopeofWorkQuantity>
    Then Select Post Icon in Additional Information
    Then Enter Deployment In Current Job in Create CPRS as <DeploymentInCurrentJob>
    Then Enter Deployment In Future Job in Create CPRS as <DeploymentInFutureJob>
    Then Select Save Icon in Create CPRS
    Then Move to Scope of work
    Then Enter Scope of work in Create CPRS as <Scopeofwork>
    Then Select Submit Icon in Create CPRS
    Then Alert Accept in Create CPRS

    Examples: 
      | Username      | CPRS | IC                    | Job      | Category | AssetGroup | AssetMake | AssetModel | Capacity | PurchaseType | RequiredQuantity | Warehouse | RequiredQuantityDS | SuggestedRate | DeployementWorkAttributes | UnitofMeasurement     | ScopeofWorkQuantity | DeploymentInCurrentJob | DeploymentInFutureJob | Scopeofwork                     |
      | pravichandran | CPRS | Buildings & Factories | LE180046 | Plant & Machinery |      0176 |        586 |        1621 |       10 | New          |               10 |      2699 |                 10 |           100 |                        10 | Kilometres per second |                  10 |                      1 |                     1 | Create Capital Purchase Request for Plant & Machinery |

  Scenario Outline: CPRS Level One Approval Resource Allocation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           |
      | CPRS         | Approved Capital purchase request |

  Scenario Outline: CPRS  Level Two Approval Resource Allocation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           |
      | CPRS         | Approved Capital purchase request |



  Scenario Outline: CPRS Level Three Approval Quantity Allocation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select Quantity Allocation in Capital purchase request and sanction
    Then Enter Sanction Quantity in Quantity Allocation as <SanctionQuantity>
    Then Enter Sanction Quantity Remarks in Quantity Allocation as <QntRemarks>
    Then Select Save icon in Quantity Allocation
    Then Move to View Details
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           | SanctionQuantity | QntRemarks |
      | CPRS         | Approved Capital purchase request |               10 | New        |
      
      
   
        Scenario Outline: CPRS Level Fourth Approval Resource Allocation
  Then Click on Other User
  Then Enter the Username from db <documentType>
  Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

Examples: 
| documentType | Comment                           |
| CPRS         | Approved Capital purchase request |


  Scenario Outline: CPRS Fifth Level Approval Quantity Allocation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           |
      | CPRS         | Approved Capital purchase request |


  Scenario Outline: CPRS Approval Sixth Level Budget Allocation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select Budget Allocation in Capital purchase request and sanction
    Then Select Sanction Reference Number in Budget Allocation PM
    Then Enter Estimation Cost Of Acquisition  Per Equipment in Budget Allocation as <EstimationCostOfAcquisition>
    Then Select Cash Out flow Quarter in Budget Allocation
    Then Select Add Cash Out flow Quarter in Budget Allocation
    Then Enter Cash Out flow Quarter in Budget Allocation as <EnterCashOutflowQuarter>
    Then Enter Cash flow Amount in Budget Allocation as <EnterCashflowAmount>
    Then Select Post Icon in Cash Quarter
    Then Select Post Icon in Budget Allocation
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | EstimationCostOfAcquisition | EnterCashOutflowQuarter | EnterCashflowAmount |
      | CPRS         |                         100 | Q-2(2022-2023)          |                1000 |


  Scenario Outline: CPRS Seventh Level Approval Budget Allocation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           |
      | CPRS         | Approved Capital purchase request |


  Scenario Outline: CPRS Eighth Level Approval Technical Evaluation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select Technical Evaluation in Capital purchase request and sanction
    Then Select Suggested Make Mode in Technical Evaluation
    Then Select Add Cash Out flow Quarter in Budget Allocation
    Then Enter Asset Make in Suggested Make Mode as <AssetMakeSuggestedMakeMode>
    Then Enter Asset Model in Suggested Make Mode as <AssetModelSuggestedMakeMode>
    Then Enter Quantity in Suggested Make Mode as <Quantity>
    Then Select Post Icon in Technical Evaluation
    Then Enter Decision Criteria in Technical Evaluation as <DecisionCriteria>
    Then Select Submit Icon in Technical Evaluation
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | AssetMakeSuggestedMakeMode | AssetModelSuggestedMakeMode | Quantity | DecisionCriteria |
      | CPRS         |                         586 |                         1621 |       10 | Request Accepted |

  Scenario Outline: CPRS Nineth Level Approval Technical Evaluation Two
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           |
      | CPRS         | Approved Capital purchase request |

  Scenario Outline: CPRS Tenth Level Approval Technical Evaluation
    Then Click on Other User
    Then Enter the Username from db <documentType>
    Then Enter the Password
    Then Click on Login
    Then Select Advance Search in CPRS
    Then Enter Doc No from CPRS DB
    Then Select CPRS Search Icon in Workbench For Action
    Then Move to View Details
    Then Select CPRS Number in Workbench For Action
    Then Move to Approve Icon in Workbench For Action
    Then Select CPRS Approve icon in Capital purchase request and sanction
    Then Enter Comments in Comments For Approve as <Comment>
    Then Select Save icon Comments For Approve
    Then Alert Accept in CPRS Approval

    Examples: 
      | documentType | Comment                           |
      | CPRS         | Approved Capital purchase request |
      
      

 