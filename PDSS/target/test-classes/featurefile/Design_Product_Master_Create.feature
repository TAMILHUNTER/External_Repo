@Regression 
Feature: Product Master - CREATE

  Background: 
    Given Go to Test Environment

  #Test Case - 1
  @ProductMasterCreate @PDSS  @Sanity 
  Scenario Outline: To verify whether the landing page of Product Master
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
    Then Logout

    Examples: 
      | Username   |
      | sumanta.km |

  #Test Case - 2
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
  @ProductMasterCreate @PDSS
  Scenario Outline: To verify whether the Design Product gets Created Successfully
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
    Then Select the Parent Product
    And Enter the Required Quantity as <quantity>
    Then Click on Submit in the Create page of Product Master
    Then Close the Success Message and Call Planning API
     Then Logout

    Examples: 
      | Username   | product | description | quantity |
      | sumanta.km | etrf    | dsf         |        1 |

  #Test Case - 4
  @ProductMasterCreate @PDSS
  Scenario Outline: To verify whether the Design Product is not getting created with 2 characters
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
    Then Select the Parent Product
    And Enter the Required Quantity as <quantity>
    Then Click on Submit in the Create page of Product Master
    Then Validate whether Design Product is not getting created with 2 characters
     Then Logout

    Examples: 
      | Username   | product | description | quantity |
      | sumanta.km | e       | dsf         |        1 |

  #Test Case - 5
  @ProductMasterCreate @PDSS
  Scenario Outline: To verify whether the Customer Product is not getting created with 2 characters
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
    Then Validate whether Customer Product is not getting created with 2 characters
     Then Logout

    Examples: 
      | Username   | product | description | Type | quantity |
      | sumanta.km | e       | dsf         |    2 |        1 |
