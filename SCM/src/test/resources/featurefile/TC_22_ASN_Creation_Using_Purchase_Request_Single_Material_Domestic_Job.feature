@ASN_Creation_Using_Purchase_Request_Single_Material_Domestic_Job
Feature: Verify the ASN Creation

  Background: 
    Given Go to Test Environment

  @Verify_ASN_Create_for_Single_Material
  Scenario: Verify ASN Create for Single Material Domestic Job
    Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify ASN Navication menu
    Then Select filter button in ASN Page to filter latest POA Number
    Then Enter PO Number in ASN Page to filter latest POA Number
    Then Logout

  @ASN_Create_for_Single_Material
  Scenario: ASN Create for Single Material Domestic Job
    Then Click on Other User
    Then Enter EIP QA RFQ Username
    Then Enter the Password
    Then Click on Login
    Then Verify ASN Navication menu
    Then Select filter button in ASN Page to filter latest POA Number
    Then Enter PO Number in ASN Page to filter latest POA Number
    Then Select Create Icon in latest POA Number
    Then Select Expand List in latest POA Details
    Then Select Exp Delivery Date Toggle calendar in latest POA Details
    Then Enter POA Exp quantity in latest POA Details
    Then Select Submit button in latest POA Details
    Then Enter Invoice No in Supplier Invoice Details
    Then Select Invoice Date in Supplier Invoice Details
    Then Enter Invoice Value in Supplier Invoice Details
    Then Enter Supplier ASN Reference Number in Supplier Invoice Details
    Then Select Supplier ASN Reference Date in Supplier Invoice Details
    Then Enter Remarks in Supplier Invoice Details
    Then Enter DC Number in DC Details
    Then Enter DC Date in DC Details
    Then Enter Delivery Order Number in DC Details
    Then Enter Delivery Order Date in DC Details
    Then Enter Material Quantity in Material Details
    Then Enter Transporter in Transportation Details
    Then Enter Vehicle Number in Transportation Details
    Then Enter VR GC Number in Transportation Details
    Then Enter VR GCN RR Date in Transportation Details
    Then Enter Town in Transportation Details
    Then Enter Pin in Transportation Details
    Then Enter E-Way Bill number in Transportation Details
    Then Enter E-Way Bill Date in Transportation Details
    Then Enter Vendor Mobile number in Transportation Details
    #Then Enter Weighment Type in Weighment Details
    #Then Enter Weightment Slip No in Weighment Details
    #Then Enter Gross Weight in Weighment Details
    #Then Enter Tare Weight in Weighment Details
    #Then Enter Date in Weighment Details
    #Then Enter Toggle Tile List in Weighment Details
    # -----Then Enter Date Out in  Weighment Details
    #Then Enter Out Toggle Tile List in Weighment Details
    #Then Enter Package Code Slip No in Packing Details
    #Then Select Package Type  in Packing Details
    #Then Enter Package Quantity in Packing Details
    #Then Enter Package Gross Weight KG in Packing Details
    #Then Enter Package Net Weight KG in Packing Details
    #Then Select Dimension UOM in Packing Details
    #Then Enter Package Dimensions L in Packing Details
    #Then Enter Package Dimensions B in Packing Details
    #Then Enter Package Dimensions H in Packing Details
    #Then Enter Package Dimensions Remarks in Packing Details
    Then Select Post Shipment Details in Packing Details
    Then Select ASN Submit button
