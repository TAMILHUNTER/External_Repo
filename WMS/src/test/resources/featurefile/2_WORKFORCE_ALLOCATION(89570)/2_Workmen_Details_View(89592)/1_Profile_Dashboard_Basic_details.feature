@Workforce_Allocation_Workman_Profile_Basic_details
Feature: Feature : Workforce Allocation (89570) UserStory: Workmen Basic Details View (89592)
  **********************************************************************************************
  UserStory: Workmen Details View (89592)
  *********************************************
  Description : As a EIP User i should be able to View Details of Workman in Profile from Dashboard by searching them
  						Workmen profile include the details such as Basic Details, SkillAnalysis, Medical Test, EHS & Wage.
  ***************************************************************************************************************************************

  @Workforce_Allocation_Workman_Profile_Dashboard_Personal_Details
  Scenario: Verify Personal in Basic Details are displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify workman name in Personal details are displayed correctly in profile
    Then verify workman Father name in Personal details are displayed correctly in profile
    Then verify workman DOB in Personal details are displayed correctly in profile
    Then verify workman Gender in Personal details are displayed correctly in profile
    Then verify workman Blood Group in Personal details are displayed correctly in profile
    Then verify Languages in Personal details are displayed correctly in profile
    Then verify workman Marital Status in Personal details are displayed correctly in profile
    Then verify Spouse Name in Personal details are displayed correctly in profile
    Then verify No Of Childrens in Personal details are displayed correctly in profile
    Then verify CSTI or NAPS Enabled in Personal details are displayed correctly in profile
    Then verify CSTI or NAPS Number in Personal details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Partner_Details
  Scenario: Verify Partner details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Partner details is displayed
    Then verify Partner name in Personal details are displayed correctly in profile
    Then Verify Partner address in Personal details is displayed in profile
    Then Verify Partner Contact number in Personal details is displayed in profile
    Then Verify Partner Email ID in Personal details is displayed in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Communication_Details
  Scenario: Verify Communication details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Mobile Number in Communication details are displayed correctly in profile
    Then Verify Permanent Address in Communication details is displayed correctly in profile
    Then Verify Permanent Address Village in Communication details is displayed correctly in profile
    Then Verify Permanent Address District in Communication details is displayed correctly in profile
    Then Verify Permanent Address State in Communication details is displayed correctly in profile
    Then Verify Permanent Address PinCode in Communication details is displayed correctly in profile
    Then Verify Temporary Address in Communication details is displayed correctly in profile
    Then Verify Temporary Address Village in Communication details is displayed correctly in profile
    Then Verify Temporary Address District in Communication details is displayed correctly in profile
    Then Verify Temporary Address State in Communication details is displayed correctly in profile
    Then Verify Temporary Address PinCode in Communication details is displayed correctly in profile
    Then Verify Emergency Contact Name in Communication details is displayed correctly in profile
    Then Verify Emergency Contact Relationship in Communication details is displayed correctly in profile
    Then Verify Emergency Contact Mobile Number in Communication details is displayed correctly in profile
    Then Verify Emergency Contact Address in Communication details is displayed correctly in profile
    Then Verify Emergency Contact Village in Communication details is displayed correctly in profile
    Then Verify Emergency Contact District in Communication details is displayed correctly in profile
    Then Verify Emergency Contact State in Communication details is displayed correctly in profile
    Then Verify Emergency Contact PinCode in Communication details is displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Skill_Details
  Scenario: Verify Skill details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Skill Category in Basic Details are displayed correctly in profile
    Then verify Skill Group in Basic Details are displayed correctly in profile
    Then verify Skill Description in Basic Details are displayed correctly in profile
    Then verify Skill Type in Basic Details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Deployment_Details
  Scenario: Verify Deployment details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Deployment in Basic Details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Education_Details
  Scenario: Verify Education details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Qualification in Education Details are displayed correctly in profile
    Then Verify Branch in Education Details are displayed correctly in profile
    Then Verify Discipline in Education Details are displayed correctly in profile
    Then Verify School or College in Education Details are displayed correctly in profile
    Then Verify Board or University in Education Details are displayed correctly in profile
    Then Verify Year of Passing in Education Details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Experience_Details
  Scenario: Verify Experience details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Organisation Name in Experience Details are displayed correctly in profile
    Then Verify Project Location in Experience Details are displayed correctly in profile
    Then Verify Project Code or Name in Experience Details are displayed correctly in profile
    Then Verify Skill Category in Experience Details are displayed correctly in profile
    Then Verify Skill Group in Experience Details are displayed correctly in profile
    Then Verify Skill Description in Experience Details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Statutory_Details
  Scenario: Verify Statutory details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Aadhar No in Statutory Details are displayed correctly in profile
    Then Verify Driving License No in Statutory Details are displayed correctly in profile
    Then Verify PAN Card No in Statutory Details are displayed correctly in profile
    Then Verify PF No in Statutory Details are displayed correctly in profile
    Then Verify UAN No in Statutory Details are displayed correctly in profile
    Then Verify ESI No in Statutory Details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_PF_Nominee_Details
  Scenario: Verify PF Nominee details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Name in PF Nominee Details are displayed correctly in profile
    Then Verify Relationship in PF Nominee Details are displayed correctly in profile
    Then Verify Allocation Percentage in PF Nominee Details are displayed correctly in profile

  @Workforce_Allocation_Workman_Profile_Dashboard_Bank_Details
  Scenario: Verify Bank details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Account Name in Bank Details are displayed correctly in profile
    Then Verify Account No in Bank Details are displayed correctly in profile
    Then Verify IFSC Or IBAN or SWIFT Code in Bank Details are displayed correctly in profile
