@Induction_Basic_Details_Personal_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Personal fields while creating workman Basic Details - Personal
  ******************************************************************************************

  @Induction_Basic_Details_Validations_Dupliate_Workmen
  Scenario: Duplicate_Workmen
    Description :  As a EIP User i should be able to Validate weather user can be able to create duplicate workmen

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate Duplicate Workmen
    
  @Induction_Basic_Details_Personal_Validations_Nodata
  Scenario: Personal Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Personal fields while creating Workmen with No inputs Provided

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate workmenname
    Then Verify user can able to Validate fathername
    Then Verify user can able to Validate DOB
    Then Verify user can able to Validate DOB field with date value less then statutory norms
    Then Verify user can able to Validate DOB field with date value more then statutory norms
    Then Verify user can able to Validate Workmen gender
    Then Verify user can able to Validate Workmen marital status
    Then Verify user can able to Validate Workmen blood group
    Then Verify user can able to Validate Workmen image
    Then Verify user can able to Validate Workmen spouse name
    Then Verify user can able to Validate Workmen Language
    Then Verify user can able to Validate Workmen CSTI if enabled
    Then Verify user can able to Validate Workmen NAPS if enabled
    
    @Induction_Basic_Details_Personal_Validations_Numeric_Special_MaxValues
  Scenario: Personal Fields Validations with No Data Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Personal fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate workmenname field with Numeric 
    Then Verify user can able to Validate workmenname field with Special characters
    Then Verify user can able to Validate fathername with min Numeric value
    Then Verify user can able to Validate fathername with min Special characters
    Then Verify user can able to Validate Workmen spouse name with Numeric value
    Then Verify user can able to Validate Workmen spouse name with Special characters
    Then Verify user can able to Validate Workmen No of Children with max Numeric value
    Then Verify user can able to Validate Workmen No of Children with Special characters
    Then Verify user can able to Validate Workmen CSTI with Numeric value if enabled
    Then Verify user can able to Validate Workmen CSTI with Special characters value if enabled
    Then Verify user can able to Validate Workmen NAPS with Numeric value if enabled
    Then Verify user can able to Validate Workmen NAPS with Special characters value if enabled