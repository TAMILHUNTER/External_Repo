@Regression 
Feature: Production BOM - CREATE

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @ProductionBOM @PDSS @Checkdate @Sanity @Testthis
  Scenario Outline: To verify the landing page of Production BOM
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on Profile to logout
    Then Click on Logout

    Examples: 
      | Username |
      | sudipta  |

  #Test Case - 2
  @ProductionBOMCreateF @PDSS @Testthis
  Scenario Outline: Verify whether the Order Number field is fetching the Orders through API
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Production BOM
    Then Click on Create in Production BOM
    Then Enter the Order Number in Create Page of Production BOM as <Order>
     Then Logout

    Examples: 
      | Username | Order     |
      | sudipta  | KWL190001 |

  #Test Case - 3
  @ProductMasterCreate @PDSS
  Scenario Outline: To verify whether the Customer Product gets Created Successfully
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Products
    Then Click on Create in Product Master
    And Enter the Order Number in Product Master Create Page
    And Enter the Product Name in the Product Master Create as <product>
    And Enter the Product Description as <description>
    And Select the Product Type as <Type>
    And Enter the Required Quantity as <quantity>
    Then Click on Submit in the Create page of Product Master
    Then Close the Success Message and Call Planning API
    Then Close the API Success Message
     Then Logout

    Examples: 
      | Username   | product | description | Type | quantity |
      | sumanta.km | ffDf    | dsf         |    2 |    50000 |

  #Test Case - 3
  @ProductionBOMCreate @PDSS @dfdfdf
  Scenario Outline: Verify whether the Bill of Material is getting created through Excel Upload
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Production BOM
    Then Click on Create in Production BOM
    Then Enter the Order Number in Create Page of Production BOM as <Order>
    Then Click on the Product Code in Create Page of Production BOM
    Then Enter the Product Code in Create Page of Production BOM
    Then Select the Product Code in Create Page of Production BOM
    Then Click on Excel Upload in Create Page of Production BOM
    Then Check whether the Excel Template is getting downloaded in Create Page of Production BOM
     Then Logout

    Examples: 
      | Username | Order     |
      | sudipta  | KWL210870 |

  #Test Case - 4
  @PDSS @CopyBOMssdsdg
  Scenario Outline: To verify whether the Customer Product gets Created Successfully
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Products
    Then Click on Create in Product Master
    And Enter the Order Number for BOM as <Order>
    And Enter the Product Name in the Product Master Create as <product>
    And Enter the Product Description as <description>
    And Select the Product Type as <Type>
    And Enter the Required Quantity as <quantity>
    Then Click on Submit in the Create page of Product Master
    Then Close the Success Message and Call Planning API
    Then Close the API Success Message
     Then Logout

    Examples: 
      | Username   | Order     | product | description | Type | quantity |
      | sumanta.km | KWL210870 | AC      | dsf         |    2 |    50000 |

  #Test Case - 5
  @ProductionBOMCreate @PDSS @Pipeline
  Scenario Outline: Verify whether the Copy BOM can be done only for the same Product Type
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Production BOM
    Then Click on Create in Production BOM
    Then Enter the Order Number in Create Page of Production BOM as <Order>
    Then Click on the Product Code in Create Page of Production BOM
    Then Enter the Product Code in Create Page of Production BOM
    Then Click on the Product Code in Create Page of Production BOM
    Then Select the Product Code in Create Page of Production BOM
    Then Click on Copy BOM in Create Page of Production BOM
    Then Enter the Source Order Number in the Create Page of Production BOM as <SourceOrder>
    Then Select the Source Order Number in the Create Page of Production BOM
    Then Click on the Source Product Code in the Create Page of Production BOM
    Then Enter the Source Product Code in the Create Page of Production BOM as <SourceProductCode>
    Then Select the Source Product Code in the Create Page of Production BOM
    Then Click on Submit to do Copy BOM
     Then Logout

    Examples: 
      | Username | Order     | SourceOrder | SourceProductCode |
      | sudipta  | KWL210870 | KWL190001   | KSM303            |

  #Test Case - 6
  @ProductionBOMCreate @PDSS @CopyBOM
  Scenario Outline: To verify whether the Customer Product gets Created Successfully
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Products
    Then Click on Create in Product Master
    And Enter the Order Number in Product Master Create Page
    And Enter the Product Name in the Product Master Create as <product>
    And Enter the Product Description as <description>
    And Select the Product Type as <Type>
    And Enter the Required Quantity as <quantity>
    Then Click on Submit in the Create page of Product Master
    Then Close the Success Message and Call Planning API
    Then Close the API Success Message
     Then Logout

    Examples: 
      | Username   | product | description | Type | quantity |
      | sumanta.km | CP      | dsf         |    2 |    50000 |

  #Test Case - 7
  @ProductionBOMCreate @PDSS @CopyBOMdFf
  Scenario Outline: Verify whether the Copy BOM can be done only for the same Product Type
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on Document
    Then Click on Design
    Then Click on Production BOM
    Then Click on Create in Production BOM
    Then Enter the Order Number in Create Page of Production BOM as <Order>
    Then Click on the Product Code in Create Page of Production BOM
    Then Enter the Product Code in Create Page of Production BOM
    Then Select the Product Code in Create Page of Production BOM
    Then Click on Copy BOM in Create Page of Production BOM
    Then Enter the Source Order Number in the Create Page of Production BOM as <SourceOrder>
    Then Select the Source Order Number in the Create Page of Production BOM
    Then Click on the Source Product Code in the Create Page of Production BOM
    Then Enter the Source Product Code in the Create Page of Production BOM as <SourceProductCode>
    Then Select the Source Product Code in the Create Page of Production BOM
    Then Click on Submit to do Copy BOM
    Then Validate the error message for Copy BOM as Product should be of same type
     Then Logout

    Examples: 
      | Username | Order     | SourceOrder | SourceProductCode |
      | sudipta  | KWL210866 | KWL190001   | KSM303            |
