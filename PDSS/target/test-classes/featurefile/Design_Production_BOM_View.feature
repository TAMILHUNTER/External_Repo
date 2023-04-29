@Regression
Feature: Production BOM - VIEW

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @ProductionBOM @PDSS @Regressionss
  Scenario Outline: To verify the landing page of Production BOM
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
     Then Logout

    Examples: 
      | Username |
      | sudipta  |

  #Test Case - 2
  @ProductionBOMCreate @PDSS
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
  @ProductionBOMView @PDSS
  Scenario Outline: Verify whether the View Page displays the Part Details of Bill of Material Created
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
    Then Enter the Order Number in View Page of Production BOM as <Order>
    Then Select the Product Code in View Page of Production BOM
    Then Click on Part Details in the View Page of Production BOM
     Then Logout

    Examples: 
      | Username | Order     |
      | sudipta  | KWL190001 |

  #Test Case - 4
  @ProductionBOMView @PDSS
  Scenario Outline: Verify whether the View Page displays the Drawing Details of Bill of Material Created
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
    Then Enter the Order Number in View Page of Production BOM as <Order>
    Then Select the Product Code in View Page of Production BOM
    Then Click on Part Details in the View Page of Production BOM
    Then Click on Drawing Details in the View Page of Production BOM
     Then Logout

    Examples: 
      | Username | Order     |
      | sudipta  | KWL190001 |

  #Test Case - 5
  @ProductionBOMView @PDSS
  Scenario Outline: Verify whether the View Page displays the Finished Components Details of Bill of Material Created
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
    Then Enter the Order Number in View Page of Production BOM as <Order>
    Then Select the Product Code in View Page of Production BOM
    Then Click on Finished Components Details in the View Page of Production BOM
     Then Logout

    Examples: 
      | Username | Order     |
      | sudipta  | KWL190001 |

  #Test Case - 6
  @ProductionBOMView @PDSS
  Scenario Outline: Verify whether the View Page displays the Accessories Details of Bill of Material Created
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
    Then Enter the Order Number in View Page of Production BOM as <Order>
    Then Select the Product Code in View Page of Production BOM
    Then Click on Accessories Details in the View Page of Production BOM
     Then Logout

    Examples: 
      | Username | Order     |
      | sudipta  | KWL190001 |

  #Test Case - 7
  @ProductionBOMViewF @PDSSP
  Scenario Outline: Verify whether the View Page displays the BOM Association Details of Bill of Material Created
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
    Then Enter the Order Number in View Page of Production BOM as <Order>
    Then Select the Product Code in View Page of Production BOM
    Then Click on BOM Association Details in the View Page of Production BOM
     Then Logout

    Examples: 
      | Username | Order     | Product |
      | sudipta  | KWL190001 |dfdf|
