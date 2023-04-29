@E2E
Feature: End_to_End
*********************************************  
  Description :  Running_End_to_End_Test_cases
*********************************************
  @Induction_Create_Basic_Details_Partner_E2E
  Scenario: Partner
    Description :  As a EIP User i should be able to Select Partner and verify Details

    Given Login
    And Navigate to BasicDetails
    Then Verify user can able to select the Existing Partner by Name
    Then Verify user can able to select the Existing Partner by ID
    Then Verify user can able to select the Worktype
    Then Verify user can able to view partner details
    Then Verify user can able to view partner work details
    Then Verify user can able to Save

  @Induction_Create_Basic_Details_Personal_E2E
  Scenario: Personal
    Description :  As a EIP User i should be able to Fill Workmen Personal Details

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to enter name and fathername
    Then Verify user can able to select DOB
    Then Verify user age auto calculated
    Then Verify user able to capture image
    Then Verify user able to add Language
    Then Verify user able to Edit Language
    Then Verify user able to Delete Language
    Then verify user can able to select gender
    Then Verify user can able to select blood group
    Then verify user can able to select marital status
    Then verify user can able to enter spouse name
    Then verify user can able to provide CSTI and NAPS
    Then verify user can able to save Personal details

  @Induction_Create_Basic_Details_Communication_E2E
  Scenario: Communication
    Description :  As a EIP User i should be able to Fill Workmen Communication Details

    Given Fill Partner and Personal details then navigate to communication
    Then Verify user can able to enter mobile number
    #Then Verify user can able to enter pincode
    Then Verify address autofetched based on pincode entered
    Then Verify user can able to enter address and select villege
    Then Verify user can able to enter Temporary address
    Then Verify user can able to enter Emergency Contact Name and number
    Then Verify user can able to select relationship with employee
    Then Verify user can able to enter Emergency Contact address pincode
    Then Verify address autofetched based on pincode entered for Emergency Contact
    Then Verify user can able to enter address and select villege for Emergency Contact
    Then Verify user can able to save communication details

  @Induction_Create_Basic_Details_Skill_E2E
  Scenario: Skill
    Description :  As a EIP User i should be able to Fill Workmen Skill Details

    Given Fill Partner Personal communication details then navigate to Skill
    Then Verify user can able to select skill category
    Then Verify user can able to select skill group
    Then Verify user can able to select skill description
    Then Verify user can able to select skill Type
    Then Verify user can able to save skill

  @Induction_Create_Basic_Details_Deployment_E2E
  Scenario: Deployment
    Description :  As a EIP User i should be able to Fill Workmen Deployment Details

    Given Fill Partner Personal communication Skill details then navigate to Deployment
    Then Verify user can able to click deployemnt
    Then Verify user can able to select deployemnt from tree
    Then Verify user can able to save deployemnt
    Then Verify user can able to select deployemnt from subtree
    Then Verify user can able to save deployemnt subtree

  @Induction_Create_Basic_Details_Education_E2E
  Scenario: Education
    Description :  As a EIP User i should be able to Fill Workmen Education Details

    Given Fill Partner Personal communication Skill Deployment details then navigate to Education
    Then Verify user can able to add Education
    Then Verify user can able to select Qualification
    Then Verify user can able to select Branch  based on Qualification and enter discipiline
    Then Verify user can able to enter schoolORCollege
    Then Verify user can able to enter BoardORUniversity
    Then Verify user can able to enter Year of Passing
    Then Verify user can able to save education
    Then Verify user can able to Edit education
    Then Verify user can able to Delete Education
    Then Verify user can able to cancel add Education

  @Induction_Create_Basic_Details_Experience_E2E
  Scenario: Experience
    Description :  As a EIP User i should be able to Fill Workmen Experience Details

    Given Fill Partner Personal communication Skill Deployment Education details then navigate to Experience
    Then Verify user can able to add Experience
    Then Verify user can able to add Duration
    Then Verify user can able to add Project details
    Then Verify user can able to add Project Skill
    Then Verify user can able to add Experience details
    Then Verify user can able to edit Experience details
    Then Verify user can able to delete Experience details
    Then Verify user can able to save Experience details

  @Induction_Create_Basic_Details_Statutory_E2E
  Scenario: Statutory
    Description :  As a EIP User i should be able to Fill Workmen Statutory Details

    Given Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory
    Then Verify User can able to Add Aadhaar
    Then Verify User can able to Add Driving License
    Then Verify User can able to Add PAN card
    Then Verify User can able to Add PF No
    Then Verify User can able to Add UAN No
    Then Verify User can able to Add ESI No
    Then Verify User can able save Statutory Details
    Then Verify User can able Add PF Nominee Details
    Then Verify User can able Submit PF Nominee Details
	  #Then Verify User can able Edit PF Nominee Details
  	#Then Verify User can able Delete PF Nominee Details

  @Induction_Create_Basic_Details_Bank_E2E
  Scenario: Bank
    Description :  As a EIP User i should be able to Fill Workmen Bank Details

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to add Bank Account name
    Then Verify user can able to add Bank Account Number
    Then Verify user can able to add Bank Account Type
    Then Verify user can able to add Bank Account Details

  @Induction_Create_Basic_Details_Submit_workman_details_E2E
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    Then Verify save and submit workman details

  @Induction_SkillAnalysis_Create_E2E
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
	  
  @Induction_Paramedics_Create_E2E
  Scenario: Verify User can be save Paramedics details of Workmen
    Given Login and Navigate to Paramedics
    Then Verify User can be able to Enter Medical Examination Date
    Then Verify User can be able to add paramedics details
    Then Verify User can be able to save paramedics details
    Then Verify User can be able to fetch paramedics details

  @Induction_MedicalTest_Create_E2E
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

  @Induction_EHS_Create_E2E
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

  @Induction_View_Workman_Profile_Dashboard_E2E
  Scenario: View Workman Profile
    Given Navigate to Induction Dashboard
    Then Search workmen by Aadhar
    Then Search workmen by Employee ID
    Then Verify User can able to View workman Profile

  @Induction_Workman_Profile_Dashboard_Personal_Details_E2E
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

  @Induction_Workman_Profile_Dashboard_Partner_Details_E2E
  Scenario: Verify Partner details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Partner details is displayed
    Then verify Partner name in Personal details are displayed correctly in profile
    Then Verify Partner address in Personal details is displayed in profile
    Then Verify Partner Contact number in Personal details is displayed in profile
    Then Verify Partner Email ID in Personal details is displayed in profile

  @Induction_Workman_Profile_Dashboard_Communication_Details_E2E
  Scenario: Verify Communication details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
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

  @Induction_Workman_Profile_Dashboard_Skill_Details_E2E
  Scenario: Verify Skill details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then verify Skill Category in Basic Details are displayed correctly in profile
    Then verify Skill Group in Basic Details are displayed correctly in profile
    Then verify Skill Description in Basic Details are displayed correctly in profile
    Then verify Skill Type in Basic Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Deployment_Details_E2E
  Scenario: Verify Deployment details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Deployment in Basic Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Education_Details_E2E
  Scenario: Verify Education details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Qualification in Education Details are displayed correctly in profile
    Then Verify Branch in Education Details are displayed correctly in profile
    Then Verify Discipline in Education Details are displayed correctly in profile
    Then Verify School or College in Education Details are displayed correctly in profile
    Then Verify Board or University in Education Details are displayed correctly in profile
    Then Verify Year of Passing in Education Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Experience_Details_E2E
  Scenario: Verify Experience details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Organisation Name in Experience Details are displayed correctly in profile
    Then Verify Project Location in Experience Details are displayed correctly in profile
    Then Verify Project Code or Name in Experience Details are displayed correctly in profile
    Then Verify Skill Category in Experience Details are displayed correctly in profile
    Then Verify Skill Group in Experience Details are displayed correctly in profile
    Then Verify Skill Description in Experience Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Statutory_Details_E2E
  Scenario: Verify Statutory details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Aadhar No in Statutory Details are displayed correctly in profile
    Then Verify Driving License No in Statutory Details are displayed correctly in profile
    Then Verify PAN Card No in Statutory Details are displayed correctly in profile
    Then Verify PF No in Statutory Details are displayed correctly in profile
    Then Verify UAN No in Statutory Details are displayed correctly in profile
    Then Verify ESI No in Statutory Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_PF_Nominee_Details_E2E
  Scenario: Verify PF Nominee details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Name in PF Nominee Details are displayed correctly in profile
    Then Verify Relationship in PF Nominee Details are displayed correctly in profile
    Then Verify Allocation Percentage in PF Nominee Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Bank_Details_E2E
  Scenario: Verify Bank details in in Workman Profile are displayed Correctly
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then Verify Account Name in Bank Details are displayed correctly in profile
    Then Verify Account No in Bank Details are displayed correctly in profile
    Then Verify IFSC Or IBAN or SWIFT Code in Bank Details are displayed correctly in profile

  @Induction_Workman_Profile_Dashboard_Wage_Details_E2E
  Scenario: Verify Wage Details displayed Correctly in Workman Profile
  #   Given Navigate to Induction Dashboard and search workmen and View workman Profile
    Then verify Wage details are displayed correctly in profile

  @Induction_Skill_Analysis_Workman_Search_By_Name_E2E
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Name

  @Induction_Skill_Analysis_Workman_Search_By_ID_E2E
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by ID

  @Induction_Skill_Analysis_Workman_Search_By_Skill_E2E
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Skill

  @Induction_Skill_Analysis_Workman_Search_By_Partner_E2E
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Partner Name

  @Induction_Paramedics_Workman_Search_By_Name_E2E
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by Name

  @Induction_Paramedics_Workman_Search_By_ID_E2E
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by ID

  @Induction_Paramedics_Workman_Search_By_Skill_E2E
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by Skill

  @Induction_Paramedics_Workman_Search_By_Partner_E2E
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by Partner Name

  @Induction_Medical_Test_Workman_Search_By_Name_E2E
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by Name

  @Induction_Medical_Test_Workman_Search_By_ID_E2E
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by ID

  @Induction_Medical_Test_Workman_Search_By_Skill_E2E
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by Skill

  @Induction_Medical_Test_Workman_Search_By_Partner_E2E
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by Partner Name

  @Induction_EHS_Workman_Search_By_Name_E2E
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Name

  @Induction_EHS_Workman_Search_By_ID_E2E
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by ID

  @Induction_EHS_Workman_Search_By_Skill_E2E
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Skill

  @Induction_EHS_Workman_Search_By_Partner_E2E
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Partner Name

  @Induction_Wage_Workman_Search_By_Name_E2E
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Name
