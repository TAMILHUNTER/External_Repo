@Regression
Feature: Regression
  *********************************************
  Description :  Running_Regression_Test_cases
  *********************************************

  @Induction_Create_Basic_Details_Submit_workman_details_Regression
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    Then Verify save and submit workman details

  @Induction_SkillAnalysis_Create_Regression
  Scenario: Verify User can be Perform Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    #Then Verify User can be able to upload Manual Test Documents
    Then Verify User can be able to Accept or Reject Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    #Then Verify User can be able to add attachment
    Then Verify User can be able to view Workmen profile table

  #Then Verify User can be able to remove record
  @Induction_Paramedics_Create_Regression
  Scenario: Verify User can be save Paramedics details of Workmen
    Given Login and Navigate to Paramedics
    Then Verify User can be able to Enter Medical Examination Date
    Then Verify User can be able to add paramedics details
    Then Verify User can be able to save paramedics details
    Then Verify User can be able to fetch paramedics details

  @Induction_MedicalTest_Create_Regression
  Scenario: Verify User can be Perform Medical Test for Workmen
    Given Login and Navigate to MedicalTest
    Then Verify Next Medical Examination due date displayed
    Then Verify the Paramedics details displayed Medical Test
    Then Verify the user can be able to create medical certificate
    #Then Verify the user can be able to download medical certificate - Need Implementation
    Then Verify the user can be able to update Skin Temperature
    Then Verify the user can be able to enter BP
    Then Verify the user can be able to provide workmen medical status
    Then Verify the user can be able to add workmen medical fitness status
    Then Verify the user can be able to add Medical Officer Details
    Then Verify the user can be able to submit medical Test details

  @Induction_EHS_Create_Regression
  Scenario: Verify User can be Perform EHS - Safety Training for Workmen
    Given Login and Navigate to EHS
    #Then Verify User can be able to search Workmen Profile EHS -- Issue Raised
    Then Verify User can be able to View Workmen profile EHS
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify user can be able to select workmen profile for EHS training
    Then Verify user can be able to select Training Program
    Then Verify user can be able to Submit Trainings
    #Then Verify user can be able to add EHS Material Issue - Not Developed Yet
    Then Verify user can be able to view Trainig Program

  @Induction_View_Workman_Profile_Dashboard_Regression
  Scenario: View Workman Profile
    Given Navigate to Induction Dashboard
    Then Search workmen by Aadhar
    Then Search workmen by Employee ID
    Then Verify User can able to View workman Profile

  @Induction_Workman_Profile_Dashboard_Personal_Details_Regression
  Scenario: Verify Personal in Basic Details are displayed Correctly in Workman Profile
    # Given Navigate to Induction Dashboard and search workmen and View workman Profile
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

  @Induction_Workman_Profile_Dashboard_Partner_Details_Regression
  Scenario: Verify Partner details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Partner details is displayed
    Then verify Partner name in Personal details are displayed correctly in profile
    Then Verify Partner address in Personal details is displayed in profile
    Then Verify Partner Contact number in Personal details is displayed in profile
    Then Verify Partner Email ID in Personal details is displayed in profile

  @Induction_Workman_Profile_Dashboard_Communication_Details_Regression
  Scenario: Verify Communication details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
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

  @Induction_Workman_Profile_Dashboard_Skill_Details_Regression
  Scenario: Verify Skill details in in Workman Profile are displayed Correctly
    # Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then verify Skill Category in Basic Details are displayed correctly in profile
    Then verify Skill Group in Basic Details are displayed correctly in profile
    Then verify Skill Description in Basic Details are displayed correctly in profile
    Then verify Skill Type in Basic Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Deployment_Details_Regression
  Scenario: Verify Deployment details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Deployment in Basic Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Education_Details_Regression
  Scenario: Verify Education details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Qualification in Education Details are displayed correctly in profile
    Then Verify Branch in Education Details are displayed correctly in profile
    Then Verify Discipline in Education Details are displayed correctly in profile
    Then Verify School or College in Education Details are displayed correctly in profile
    Then Verify Board or University in Education Details are displayed correctly in profile
    Then Verify Year of Passing in Education Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Experience_Details_Regression
  Scenario: Verify Experience details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Organisation Name in Experience Details are displayed correctly in profile
    Then Verify Project Location in Experience Details are displayed correctly in profile
    Then Verify Project Code or Name in Experience Details are displayed correctly in profile
    Then Verify Skill Category in Experience Details are displayed correctly in profile
    Then Verify Skill Group in Experience Details are displayed correctly in profile
    Then Verify Skill Description in Experience Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Statutory_Details_Regression
  Scenario: Verify Statutory details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Aadhar No in Statutory Details are displayed correctly in profile
    Then Verify Driving License No in Statutory Details are displayed correctly in profile
    Then Verify PAN Card No in Statutory Details are displayed correctly in profile
    Then Verify PF No in Statutory Details are displayed correctly in profile
    Then Verify UAN No in Statutory Details are displayed correctly in profile
    Then Verify ESI No in Statutory Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_PF_Nominee_Details_Regression
  Scenario: Verify PF Nominee details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Name in PF Nominee Details are displayed correctly in profile
    Then Verify Relationship in PF Nominee Details are displayed correctly in profile
    Then Verify Allocation Percentage in PF Nominee Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Bank_Details_Regression
  Scenario: Verify Bank details in in Workman Profile are displayed Correctly
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Account Name in Bank Details are displayed correctly in profile
    Then Verify Account No in Bank Details are displayed correctly in profile
    Then Verify IFSC Or IBAN or SWIFT Code in Bank Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Wage_Details_Regression
  Scenario: Verify Wage Details displayed Correctly in Workman Profile
    #  Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then verify Wage details are displayed correctly in profile

  @Induction_Skill_Analysis_Workman_Search_By_Name_Regression
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Name

  @Induction_Skill_Analysis_Workman_Search_By_ID_Regression
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by ID

  @Induction_Skill_Analysis_Workman_Search_By_Skill_Regression
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Skill

  @Induction_Skill_Analysis_Workman_Search_By_Partner_Regression
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Partner Name
  #@Induction_Paramedics_Workman_Search_By_Name_Regression
  #Scenario: Search Workman Profile By Workman Name
    #Given Login and Navigate to Paramedics
    #Then Verify User can able to search Workman by Name
#
  #@Induction_Paramedics_Workman_Search_By_ID_Regression
  #Scenario: Search Workman Profile By Workman ID
    #Given Login and Navigate to Paramedics
    #Then Verify User can able to search Workman by ID
#
  #@Induction_Paramedics_Workman_Search_By_Skill_Regression
  #Scenario: Search Workman Profile By Workman Skill
    #Given Login and Navigate to Paramedics
    #Then Verify User can able to search Workman by Skill
#
  #@Induction_Paramedics_Workman_Search_By_Partner_Regression
  #Scenario: Search Workman Profile By Workman Partner Name
    #Given Login and Navigate to Paramedics
    #Then Verify User can able to search Workman by Partner Name
#
  #@Induction_Medical_Test_Workman_Search_By_Name_Regression
  #Scenario: Search Workman Profile By Workman Name
    #Given Login and Navigate to MedicalTest
    #Then Verify User can able to search Workman by Name
#
  #@Induction_Medical_Test_Workman_Search_By_ID_Regression
  #Scenario: Search Workman Profile By Workman ID
    #Given Login and Navigate to MedicalTest
    #Then Verify User can able to search Workman by ID
#
  #@Induction_Medical_Test_Workman_Search_By_Skill_Regression
  #Scenario: Search Workman Profile By Workman Skill
    #Given Login and Navigate to MedicalTest
    #Then Verify User can able to search Workman by Skill
#
  #@Induction_Medical_Test_Workman_Search_By_Partner_Regression
  #Scenario: Search Workman Profile By Workman Partner Name
    #Given Login and Navigate to MedicalTest
    #Then Verify User can able to search Workman by Partner Name
#
  #@Induction_EHS_Workman_Search_By_Name_Regression
  #Scenario: Search Workman Profile By Workman Name
    #Given Login and Navigate to EHS
    #Then Verify User can able to search Workman by Name
#
  #@Induction_EHS_Workman_Search_By_ID_Regression
  #Scenario: Search Workman Profile By Workman ID
    #Given Login and Navigate to EHS
    #Then Verify User can able to search Workman by ID
#
  #@Induction_EHS_Workman_Search_By_Skill_Regression
  #Scenario: Search Workman Profile By Workman Skill
    #Given Login and Navigate to EHS
    #Then Verify User can able to search Workman by Skill
#
  #@Induction_EHS_Workman_Search_By_Partner_Regression
  #Scenario: Search Workman Profile By Workman Partner Name
    #Given Login and Navigate to EHS
    #Then Verify User can able to search Workman by Partner Name
#
  #@Induction_Wage_Workman_Search_By_Name_Regression
  #Scenario: Search Workman Profile By Workman Name
    #Given Login and Navigate to EHS
    #Then Verify User can able to search Workman by Name
