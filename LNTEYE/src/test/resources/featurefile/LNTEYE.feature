 @LNTEYE
Feature: LNTEYE project-Overall Project Performance/Resources,Projectoverview,SCM material

  Scenario: verifying values present in Projectoverview under the Overall Project Performance - project with INR job
    Given Login to LNTEYE
    Then Go to Project overview page for INR Job
    Then Compare both table and page values of OCV
    Then Compare both table and page values of RCV
    Then Compare both table and page values of Orginal_Cost
    Then Compare both table and page values of Revised_Estimate
    Then Compare both table and page values of Cost
    Then Compare both table and page values of Cost_As_On_Date
    Then Compare both table and page values of Invoiced
    Then Compare both table and page values of Outstanding
    Then Compare both table and page values of Sales_Over_Invoice
    Then Compare both table and page values of Net_Working_Capital
    Then Compare both table and page values of Time_Completion
    Then Compare both table and page values of Cost_Completion
    Then Compare both table and page values of Invoice_Completion
    Then Compare both table and page values of Projected_End_Margin
    Then Compare both table and page values of ACE_GM
    Then Compare both table and page values of JCR_GM
    Then Compare both table and page values of project_Revised_Estimate
    Then Compare both table and page values of JCR_RCV
    Then Compare both table and page values of Actual_Start_Date
    Then Compare both table and page values of Contractual_End_Date
    Then Compare both table and page values of Expected_End_Date
    Then Logout from LNTEYE


  Scenario: verifying values present in Resources - under the Overall Project Performance - project with INR job
    Given Login to LNTEYE
    Then Go to Project overview page for INR Job
    Then click on the Resourcemenu
    Then Compare both table and page values of  Material_Planned_Cost;
    Then Compare both table and page values of PO_Commitment_Made
    Then Compare both table and page values of Material_Received
    Then Compare both table and page values of Stock_90_days
    Then Compare both table and page values of Stock_days
    Then Compare both table and page values of Service_Planned_Cost
    Then Compare both table and page values of WO_Commitment_Made
    Then Compare both table and page values of Work_done_Billed
    Then Compare both table and page values of PM_Planned_Cost
    Then Compare both table and page values of PM_Spend_Date
   # Then Compare both table and page values of Assets_Deployed
    Then Compare both table and page values of Surplus_Asset
    Then Compare both table and page values of Staff_Planned_Cost
    Then Compare both table and page values of Staff_Spend_Date;
    Then Compare both table and page values of Staff_Employed
    Then Compare both table and page values of  Workmen_Employed
    Then Compare both table and page values of Provisional_Cost
    Then Logout from LNTEYE
    
   

    Scenario: verifying values present in SCM Material- under the Overall Project Performance - project with INR job
    Given Login to LNTEYE
    Then Go to Project overview page for INR Job
    Then click on the Supplychain
    Then Compare both table and page values of  PO
    Then select the material group list 
    Then Compare both table and page values of Material details in the kendo grid 
    #Then Logout from LNTEYE