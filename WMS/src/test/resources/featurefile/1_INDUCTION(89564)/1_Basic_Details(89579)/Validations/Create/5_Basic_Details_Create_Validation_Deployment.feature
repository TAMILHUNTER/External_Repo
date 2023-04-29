@Induction_Basic_Details_Deployment_Validations_Create
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Validate Deployment fields while creating workman Basic Details - Deployment
  ******************************************************************************************

  @Induction_Basic_Details_Deployment_Validations_Nodata
  Scenario: Communication Fields Validations with No Data 
    Description :  As a EIP User i should be able to Validate Deployment fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill details then navigate to Deployment
    # Defect Raised
    Then Verify user can able to Validate Workmen deployemnt
