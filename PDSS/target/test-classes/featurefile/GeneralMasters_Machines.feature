@Regression
Feature: Creation of Machines

  Background: 
    Given Go to Test Environment

  #Scenario - 1
  @Machines
  Scenario Outline: To verify whether the landing page of Machines
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on General Masters
    Then Click on Machines
    Then Verify whether the landing page of Machine

    Examples: 
      | Username   |
      | sumanta.km |

  #Scenario - 2
  @Machinesss @validations
  Scenario Outline: To verify the Mandatory Validations in Machine Page
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on General Masters
    Then Click on Machines
    Then Verify whether the landing page of Machine
    Then Click on Create button in the Machine
    Then Click on Save button in the Machine
    Then Validate the Mandatory field of Description in the Create page of Machine
    Then Validate the Mandatory field of Short Description in the Create page of Machine
    Then Validate the Mandatory field of Machine Group in the Create page of Machine
    Then Logout

    Examples: 
      | Username   |
      | sumanta.km |

  #Scenario - 3
  @Machinesss @validations
  Scenario Outline: To verify the Description field accepts characters
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on General Masters
    Then Click on Machines
    Then Verify whether the landing page of Machine
    Then Click on Create button in the Machine
    Then Enter the Description <Description>
    Then Logout

    Examples: 
      | Username   | Description |
      | sumanta.km | CNC Machine |

  #Scenario - 4
  @Machinesss
  Scenario Outline: To verify the Short Description field accepts characters
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on General Masters
    Then Click on Machines
    Then Verify whether the landing page of Machine
    Then Click on Create button in the Machine
    Then Enter the Description <Description>
    Then Enter the Description <ShortDescription>
    Then Logout

    Examples: 
      | Username   | Description | ShortDescription |
      | sumanta.km | CNC Machine | CNC              |

  #Scenario - 4
  @Machinesss
  Scenario Outline: To verify the Machine Group Dropdown is Selected
    Then Click on Other User
    Then Enter the Username as <Username>
    Then Enter the Password
    Then Click on Login
    Then Click on Access Based Menu
    Then Click on Business apps
    Then Click on PDSS
    Then Click on PDSS Menu
    Then Click on General Masters
    Then Click on Machines
    Then Verify whether the landing page of Machine
    Then Click on Create button in the Machine
    Then Enter the Description <Description>
    Then Enter the Short Description <ShortDescription>
    Then Select the Machine Group
    Then Click on Save button in the Machine
    Then Logout

    Examples: 
      | Username   | Description | ShortDescription |
      | sumanta.km | CNC Machine | CNC              |
