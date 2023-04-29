@Regression
Feature: Product Master - EDIT

 

  #Test Case - 1
  @ProductMasterEdit @PDSS @Sanity
  Scenario Outline: To verify the landing page of Edit in Product Msater
      Given Go to Test Environment
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
    Then Click on Edit in Product Master
     Then Logout

    Examples: 
      | Username   |
      | sumanta.km |

  #Test Case - 2
  @ProductMasterEdit @PDSSerer @Pipelines
  Scenario Outline: To verify whether the Customer Product is updated successfully or not
        Given Go to Test Environment
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
    Then Click on Edit in Product Master
    And Enter the Order Number in Product Master Edit Page as <order>
    Then Click on Go button in the Edit page of Product Master
    Then Click on Edit icon in the Grid for the respective Product
    And Update the Required Quantity as <quantity>
    Then Click on update in the Edit page of Product Master
    Then Validate whether Product is Successfully updated
     Then Logout

    Examples: 
      | Username   | order     | quantity |
      | sumanta.km | KWL200117 |        1 |
