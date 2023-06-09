@E2E
Feature: End_to_End
  *********************************************  
  Description :  Running_End_to_End_Test_cases
  *********************************************

  @E2E_Induction_Create_Basic_Details_Partner
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

  @E2E_Induction_Create_Basic_Details_Personal
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
    Then verify user can able to enter religion
    Then verify user can able to enter Nearest police station
    Then verify user can able to select Nationality
    Then verify user can able to provide CSTI and NAPS
    Then verify user can able to save Personal details

  @E2E_Induction_Create_Basic_Details_Communication
  Scenario: Communication
    Description :  As a EIP User i should be able to Fill Workmen Communication Details

    Given Fill Partner and Personal details then navigate to communication
    Then Verify user can able to enter mobile number
    Then Verify user can able to Select Country
    Then Verify address autofetched based on pincode entered
    Then Verify user can able to enter address and select villege
    Then Verify user can able to enter Temporary address
    Then Verify user can able to enter Emergency Contact Name and number
    Then Verify user can able to select relationship with employee
    Then Verify user can able to enter Emergency Contact address pincode
    Then Verify address autofetched based on pincode entered for Emergency Contact
    Then Verify user can able to enter address and select villege for Emergency Contact
    Then Verify user can able to save communication details

  @E2E_Induction_Create_Basic_Details_Skill
  Scenario: Skill
    Description :  As a EIP User i should be able to Fill Workmen Skill Details

    Given Fill Partner Personal communication details then navigate to Skill
    Then Verify user can able to select skill category
    Then Verify user can able to select skill group
    Then Verify user can able to select skill description
    Then Verify user can able to select skill Type
    Then Verify user can able to save skill

  @E2E_Induction_Create_Basic_Details_Deployment
  Scenario: Deployment
    Description :  As a EIP User i should be able to Fill Workmen Deployment Details

    Given Fill Partner Personal communication Skill details then navigate to Deployment
    Then Verify user can able to click deployemnt
    Then Verify user can able to select deployemnt from tree
    Then Verify user can able to save deployemnt
    Then Verify user can able to select deployemnt from subtree
    Then Verify user can able to save deployemnt subtree

  @E2E_Induction_Create_Basic_Details_Education
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

  @E2E_Induction_Create_Basic_Details_Experience
  Scenario: Experience
    Description :  As a EIP User i should be able to Fill Workmen Experience Details

    Given Fill Partner Personal communication Skill Deployment Education details then navigate to Experience
    Then Verify user can able to add Experience
    Then Verify user can able to add Duration
    Then Verify user can able to add Project details
    Then Verify user can able to add Project Skill
    Then Verify user can able to add Experience details
    #Then Verify user can able to edit Experience details # Issue Raised
    #Then Verify user can able to delete Experience details # Issue Raised
    Then Verify user can able to view Previous Job Experience details
    Then Verify user can able to save Experience details

  @E2E_Induction_Create_Basic_Details_Statutory
  Scenario: Statutory
    Description :  As a EIP User i should be able to Fill Workmen Statutory Details

    Given Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory
    #Then Verify User can able to Add Aadhaar
    Then Verify User can able to upload attachment for Aadhaar
    Then Verify User can able to Add Driving License
    Then Verify User can able to upload attachment for Driving License
    Then Verify User can able to add Driving License expiry
    Then Verify User can able to Add PAN card
    Then Verify User can able to upload attachment PAN card
    Then Verify User can able to Add Workpermit No
    Then Verify User can able to upload attachment for Workpermit
    Then Verify User can able to Add Workpermit expiry
    Then Verify User can able to Add Labourcard No
    Then Verify User can able to upload attachment for Labourcard
    Then Verify User can able to Add Labourcard expiry
    Then Verify User can able to Add VisaProID
    Then Verify User can able to upload attachment for VisaProID
    Then Verify User can able to Add Visa number
    Then Verify User can able to upload attachment for Visa
    Then Verify User can able to Add PF No
    Then Verify User can able to upload attachment for PF
    Then Verify User can able to Add UAN No
    Then Verify User can able to upload attachment for UAN
    Then Verify User can able to Add ESI No
    Then Verify User can able to upload attachment for ESI
    Then Verify User can able save Statutory Details
    Then Verify User can able Add PF Nominee Details
    Then Verify User can able Submit PF Nominee Details

  #Then Verify User can able Edit PF Nominee Details
  #Then Verify User can able Delete PF Nominee Details
  @E2E_Induction_Create_Basic_Details_Bank
  Scenario: Bank
    Description :  As a EIP User i should be able to Fill Workmen Bank Details

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to add Bank Account name
    Then Verify user can able to add Bank Account Number
    Then Verify user can able to add Bank Account Type
    Then Verify user can able to add Bank Account Details

  @E2E_Induction_Create_Basic_Details_Submit_workman_details
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    Then Verify save and submit workman details

  @E2E_Induction_Workmen_search
  Scenario: Verify User can able to Search Workman
    Given Navigate to Workman serarch
    Then Search Workman by Number
    Then Verify Workment Details fetched correctly when searching by Workmen number
    Then Verify User can be able to view Workmen profile Completion Status
    Then Verify User can be able to view Workmen profile Completion Percentage
    Then Search Workman by Aadhar
    Then Verify Workment Details fetched correctly when searching by Workmen Aadhar
    Then Verify User can be able to view Workmen profile Completion Status
    Then Verify User can be able to view Workmen profile Completion Percentage

  @E2E_Induction_Edit_Basic_Details_Partner
  Scenario: Verify User can able to Edit Partner Details
    Given Select Workman and Navigate to Partner
    Then Verify user can able to update Worktype
    Then Verify user can able to update Partner

  @E2E_Induction_Edit_Basic_Details_Personal
  Scenario: Verify User can able to update Workman Personal Details
    Given Select Workman and Navigate to personal
    Then Verify user can able to update workmanname
    Then Verify user can able to update workmanFatherName
    Then Verify user can able to update DOB
    Then Verify user can able to update workman image
    Then Verify user can able to update Language
    Then Verify user can able to update Gender
    Then Verify user can able to update Blood Group
    Then Verify user can able to update Marital Status
    Then Verify user can able to update spouse Name
    Then Verify user can able to update no of Children
    Then Verify user can able to update CSTI and NAPS
    Then Verify user can able to update Religion
    Then Verify user can able to update Nearest police Station
    Then Verify user can able to update Nationality

  @E2E_Induction_Edit_Basic_Details_Communication
  Scenario: Verify User can able to edit workman communication Details
    Given Select Workman and Navigate to Communication
    Then Verify user can able to update mobile number
    Then Verify user can able to update Permanent Address Pincode
    Then Verify user can able to update Permanent Address
    Then Verify user can able to update Permanent Address city
    Then Verify user can able to update Temporary Address Pincode
    Then Verify user can able to update Temporary Address
    Then Verify user can able to update Temporary Address city
    Then Verify user can able to update Emergency Contact Name
    Then Verify user can able to update Emergency Contact Mobile Number
    Then Verify user can able to update Emergency Contact Relationship
    Then Verify user can able to update Emergency Contact Pincode
    Then Verify user can able to update Emergency Contact Address
    Then Verify user can able to update Emergency Contact Address city

  @E2E_Induction_Edit_Basic_Details_Skill
  Scenario: Verify User can able to edit workman Skill Details
    Given Select Workman and Navigate to Skill
    Then Verify user can able to update skill Category
    Then Verify user can able to update skill Group
    Then Verify user can able to update skill Description
    Then Verify user can able to update skill Type

  @E2E_Induction_Edit_Basic_Details_Deployment
  Scenario: Verify User can able to edit workman Deployment Details
    Given Select Workman and Navigate to deployemnt
    Then Verify user can able to Edit deployemnt

  # Issue Reported 96811
  @E2E_Induction_Edit_Basic_Details_Education
  Scenario: Verify User can able to edit workman Education Details
    Given Select Workman and Navigate to Education
    Then Verify user can able to Edit Qualification
    Then Verify user can able to Edit Branch
    Then Verify user can able to Edit Discipiline
    Then Verify user can able to Edit School Or College
    Then Verify user can able to Edit School Or Board or University
    Then Verify user can able to Edit School Or Year of Passing

  # Issue Reported 96777
  @E2E_Induction_Edit_Basic_Details_Experience
  Scenario: Verify User can able to edit workman Experience Details
    Given Select Workman and Navigate to Experience
    Then Verify user can able to Edit Duration
    Then Verify user can able to Edit Organisation Name
    Then Verify user can able to Edit Project Location
    Then Verify user can able to Edit Project Code
    Then Verify user can able to Edit Skill Category
    Then Verify user can able to Edit Skill Group
    Then Verify user can able to Edit Skill Description

  @E2E_Induction_Edit_Basic_Details_Statutory
  Scenario: Verify User can able to edit workman Statutory Details
    Given Select Workman and Navigate to Statutory Details
    Then Verify User can able to Edit Aadhaar
    Then Verify User can able to Edit Driving License
    Then Verify User can able to Edit PAN card
    Then Verify User can able to Edit PF No
    Then Verify User can able to Edit UAN No
    Then Verify User can able to Edit ESI No
    Then Verify User can able to Edit Workpermit No
    Then Verify User can able to Edit Workpermit expiry
    Then Verify User can able to Edit Labourcard No
    Then Verify User can able to Edit Labourcard expiry
    Then Verify User can able Edit PF Nominee NameUpdate
    Then Verify User can able Edit PF Nominee RelationshipUpdate
    Then Verify User can able Edit PF Nominee Allocation PercentageUpdate

  @E2E_Induction_Edit_Basic_Details_Domestic_Bank
  Scenario: Verify User can able to edit Bank Details
    Given Select Workman and Navigate to Bank
    Then Verify User can able to Edit Domestic Account Details_Update

  #No Data Found
  #@E2E_Induction_Edit_Basic_Details_Domestic_International
  #Scenario: Verify User can able to edit Bank Details
  #Given Select Workman and Navigate to Bank
  #Then Verify user can be able to change bank account type
  #Then Verify User can able to Edit International Bank Type Swift
  #Then Verify User can able to Edit International Bank Type IBAN
  #Induction Validation for Basic details
  @E2E_Induction_Basic_Details_Validations_PartnerName
  Scenario: Partner_Name Validation
    Description :  As a EIP User i should be able to Validate Partner Name fields while creating Partner

    Given Login
    And Navigate to BasicDetails
    Then Verify user can able to Validate Partner field

  @E2E_Induction_Basic_Details_Validations_WorkType
  Scenario: Partner_WorkType Validation
    Description :  As a EIP User i should be able to Validate WorkType fields while creating Partner

    Given Login
    And Navigate to BasicDetails
    Then Verify user can able to Validate Worktype field

  @E2E_Induction_Basic_Details_Validations_Dupliate_Workmen
  Scenario: Duplicate_Workmen
    Description :  As a EIP User i should be able to Validate weather user can be able to create duplicate workmen

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate Duplicate Workmen

  @E2E_Induction_Basic_Details_Personal_Validations_Nodata
  Scenario: Personal Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Personal fields while creating Workmen with No inputs Provided

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate Nationality
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

  @E2E_Induction_Basic_Details_Personal_Validations_Numeric_Special_MaxValues
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

  @E2E_Induction_Basic_Details_Communication_Validations_Nodata
  Scenario: Communication Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Communication fields while creating Workmen with No inputs Provided

    Given Fill Partner and Personal details then navigate to communication
    Then Verify user can able to Validate Workmen Permanent address
    Then Verify user can able to Validate Workmen Permanent address pincode
    Then Verify user can able to Validate Workmen Permanent address village
    Then Verify user can able to Validate Workmen Temporary address
    Then Verify user can able to Validate Workmen Temporary address pincode
    Then Verify user can able to Validate Workmen Temporary address village
    Then Verify user can able to Validate Workmen Emergency address
    Then Verify user can able to Validate Workmen Emergency Contact number
    Then Verify user can able to Validate Workmen Emergency Contact Name
    Then Verify user can able to Validate Workmen Emergency Contact address pincode
    Then Verify user can able to Validate Workmen Emergency address village
    Then Verify user can able to Validate Workmen Emergency Contact Relationship with employee
    Then Verify user can able to Validate Workmen mobile number

  @E2E_Induction_Basic_Details_Communication_Validations_Numeric_Special_MaxValues
  Scenario: Communication Fields Validations with Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Communication fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner details and navigate to Personal
    Then Verify user can able to Validate Mobilenumber field with Max Numeric
    Then Verify user can able to Validate Mobilenumber field with alphabets
    Then Verify user can able to Validate Mobilenumber field with Special characters
    Then Verify user can able to Validate Permanent address pincode field with Max Numeric
    Then Verify user can able to Validate Permanent address pincode field with alphabets
    Then Verify user can able to Validate Permanent address pincode field with Special characters
    Then Verify user can able to Validate Temporary address pincode field with Max Numeric
    Then Verify user can able to Validate Temporary address pincode field with alphabets
    Then Verify user can able to Validate Temporary address pincode field with Special characters
    Then Verify user can able to Validate Emergency Contact address pincode Max field with Numeric
    Then Verify user can able to Validate Emergency Contact address address pincode field with alphabets
    Then Verify user can able to Validate Emergency Contact address pincode field with Special characters
    Then Verify user can able to Validate Emergency Contact Name field with Numeric
    Then Verify user can able to Validate Emergency Contact Name field with Special characters
    Then Verify user can able to Validate Emergency Contact Mobile Number field with Max Numeric
    Then Verify user can able to Validate Emergency Contact Mobile Number field with alphabets
    Then Verify user can able to Validate Emergency Contact Mobile Number field with Special characters

  @E2E_Induction_Basic_Details_Skill_Validations_Nodata
  Scenario: Communication Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Skill fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication details then navigate to Skill
    Then Verify user can able to Validate Workmen skill category
    Then Verify user can able to Validate Workmen skill group
    Then Verify user can able to Validate Workmen skill description
    Then Verify user can able to Validate Workmen skill Type

  @E2E_Induction_Basic_Details_Deployment_Validations_Nodata
  Scenario: Communication Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Deployment fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill details then navigate to Deployment
    # Defect Raised
    Then Verify user can able to Validate Workmen deployemnt

  @E2E_Induction_Basic_Details_Education_Validations_Nodata
  Scenario: Education Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Education fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment details then navigate to Education
    Then Verify user can able to Validate Workmen Education Applicable
    Then Verify user can able to Validate Workmen Qualification
    Then Verify user can able to Validate Workmen Branch based on Qualification
    Then Verify user can able to Validate Workmen schoolORCollege
    Then Verify user can able to Validate Workmen BoardORUniversity
    Then Verify user can able to Validate Workmen Year of Passing

  @E2E_Induction_Basic_Details_Education_Validations_Numeric_Special_MaxValues
  Scenario: Education Fields Validations with Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Education fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner Personal communication Skill Deployment details then navigate to Education
    Then Verify user can able to Validate Workmen Education Applicable
    Then Verify user can able to Validate Workmen Discipline with numberic input
    Then Verify user can able to Validate Workmen Discipline with max alphabets input
    Then Verify user can able to Validate Workmen Discipline with Special characters input
    Then Verify user can able to Validate Workmen schoolORCollege with numberic input
    Then Verify user can able to Validate Workmen schoolORCollege with max alphabets input
    Then Verify user can able to Validate Workmen schoolORCollege with Special characters input
    Then Verify user can able to Validate Workmen BoardORUniversity with numberic input
    Then Verify user can able to Validate Workmen BoardORUniversity with max alphabets input
    Then Verify user can able to Validate Workmen BoardORUniversity with Special characters input
    Then Verify user can able to Validate Workmen YearofPassing with max numberic input
    Then Verify user can able to Validate Workmen YearofPassing with alphabets input
    Then Verify user can able to Validate Workmen YearofPassing with Special characters input

  @E2E_Induction_Basic_Details_Experience_Validations_Nodata
  Scenario: Experience Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Experience fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education details then navigate to Experience
    Then Verify user can able to Validate Workmen Experience Applicable
    Then Verify user can able to Validate Workmen Project Skill Category
    #Issue Report
    Then Verify user can able to Validate Workmen Project Skill Group
    #Issue Report
    Then Verify user can able to Validate Workmen Project Skill Description
    Then Verify user can able to Validate Workmen Duration From
    Then Verify user can able to Validate Workmen Duration From with future date
    #Issue Report
    Then Verify user can able to Validate Workmen Duration To
    Then Verify user can able to Validate Workmen Duration To with future date
    #Issue Report
    Then Verify user can able to Validate Workmen Project Organization Name
    #Issue Report
    Then Verify user can able to Validate Workmen Project Location
    Then Verify user can able to Validate Workmen Project CodeOrName

  @E2E_Induction_Basic_Details_Experience_Validations_Numeric_Special_MaxValues
  Scenario: Experience Fields Validations with Numeric , Special Charecters & MaxValues
    Description :   As a EIP User i should be able to Validate Experience fields while creating Workmen with Numeric , Special Charecters & MaxValues inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education details then navigate to Experience
    Then Verify user can able to Validate Workmen Experience Applicable
    Then Verify user can able to Validate Workmen Project Organization Name With Max alphabets input
    Then Verify user can able to Validate Workmen Project Organization Name With Special characters input
    Then Verify user can able to Validate Workmen Project Organization Name With Numeric input
    Then Verify user can able to Validate Workmen Project Location with Max alphabets input
    Then Verify user can able to Validate Workmen Project Location with Special characters input
    Then Verify user can able to Validate Workmen Project Location with Numeric input
    Then Verify user can able to Validate Workmen Project CodeOrName With Max alphabets input
    Then Verify user can able to Validate Workmen Project CodeOrName With Special characters input
    Then Verify user can able to Validate Workmen Project CodeOrName With Numeric input

  @E2E_Induction_Basic_Details_Statutory_Validations_Nodata
  Scenario: Statutory Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Statutory fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory
    Then Verify user can able to Validate Workmen Aadhaar
    Then Verify user can able to Validate Workmen invalid Aadhaar number
    #Issue Report
    Then Verify user can able to Validate Workmen Workpermit
    Then Verify user can able to Validate Workmen Labourcard expiry
    Then Verify user can able to Validate Workmen PF Nominee Name
    Then Verify user can able to Validate Workmen PF Nominee Relationship
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage greater then 100 percentage
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage less then 100 percentage

  @E2E_Induction_Basic_Details_Statutory_Validations_Nodata
  Scenario: Statutory Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Statutory fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory
    Then Verify user can able to Validate Workmen Aadhaar number with max numeric input
    Then Verify user can able to Validate Workmen Aadhaar number with alphabets input
    Then Verify user can able to Validate Workmen Aadhaar number with Special characters input
    #Issue Report
    Then Verify user can able to Validate Workmen Workpermit expiry with past date
    Then Verify user can able to Validate Workmen Labourcard expiry with past date
    Then Verify user can able to Validate Workmen PF Nominee Name with max alphabets input
    Then Verify user can able to Validate Workmen PF Nominee Name with numeric input
    Then Verify user can able to Validate Workmen PF Nominee Name with Special characters input
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage with max numeric input
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage with alphabets input
    Then Verify user can able to Validate Workmen PF Nominee Allocation Percentage with Special characters input

  @E2E_Induction_Basic_Details_Bank_Validations_Nodata
  Scenario: Bank Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Bank fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to Validate Workmen Bank Account IFSC or IBAN or SWIFT Code
    Then Verify user can able to Validate Workmen Bank Account Name
    Then Verify user can able to Validate Workmen Bank Account Number

  @E2E_Induction_Basic_Details_Bank_Validations_Nodata
  Scenario: Bank Fields Validations with No Data
    Description :  As a EIP User i should be able to Validate Bank fields while creating Workmen with No inputs Provided

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to Validate Workmen Bank Account Name with max alphabets input
    Then Verify user can able to Validate Workmen Bank Account Name with numeric input
    Then Verify user can able to Validate Workmen Bank Account Name with Special characters input
    Then Verify user can able to Validate Workmen Bank Account Number with alphabets input
    Then Verify user can able to Validate Workmen Bank Account Number with alphabets input
    Then Verify user can able to Validate Workmen Bank Account Number with max numeric input
    Then Verify user can able to Validate Workmen Bank Account Number with Special characters input

  @E2E_Induction__SkillAnalysis_Create_Random
  Scenario: Verify User can be Perform Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Search Workmen Profile SkillAnalysis
    Then Verify User can be able to View Workmen profile
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify User can be able to select workmen and Proceed to Skill Test Manual
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    #Then Verify User can be able to upload Manual Test Documents
    Then Verify User can be able to Accept or Reject Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    #Then Verify User can be able to add attachment
    Then Verify User can be able to view Workmen profile table

  #Then Verify User can be able to remove record
  @E2E_Induction__SkillAnalysis_Create_Accept
  Scenario: Verify User can be able to approve Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    Then Verify User can be able to Accept Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    Then Verify User can be able to view Workmen profile table

  @E2E_Induction__SkillAnalysis_Create_Reject
  Scenario: Verify User can be able to Reject Skill Analysis for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    Then Verify User can be able to Reject Workmen Skill Analysis
    Then Verify User can be able to View Skill Test History
    Then Verify User can be able to view Workmen profile table

  @E2E_Induction__SkillAnalysis_Remove_record
  Scenario: Verify User can be able to remove record from Skill Analysis list
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select multiple workmen and Proceed to Skill Test
    Then Verify User can be able verify Skill Analysis Details
    Then Verify User can be able to Enter Skill Analysis Details
    Then Verify User can be able to remove record

  @E2E_Induction__SkillAnalysis_Create_Validation_With_noInput
  Scenario: Verify User can be Validate Skill Analysis fields for Manual Test
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select Single workmen and Proceed to Skill Test
    Then Verify User can be able to Validate Total Questions with no input
    Then Verify User can be able to Validate Test Status with no input
    Then Verify User can be able to Validate Skill type with no input
    Then Verify User can be able to Validate Retest Date with no input
    Then Verify User can be able to Validate Retest Date with Past Date
    Then Verify User can be able to Validate Retest Date with Current Date
    Then Verify User can be able to Validate Correct error message if Total Answers is more then Total Questions

  @E2E_Induction__SkillAnalysis_Create_Validation_With_multipleInput
  Scenario: Verify User can be Validate Skill Analysis fields for Manual Test with Numeric , Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to Skill Analysis
    Then Verify User can be able to select Single workmen and Proceed to Skill Test
    Then Verify User can be able to Validate Total Questions with max numeric input
    Then Verify User can be able to Validate Total Questions with alphabets input
    Then Verify User can be able to Validate Total Questions with Special characters input
    Then Verify User can be able to Validate Total Answers with max numeric input
    Then Verify User can be able to Validate Total Answers with alphabets input
    Then Verify User can be able to Validate Total Answers with Special characters input

  @E2E_Induction__Paramedics_Create
  Scenario: Verify User can be save Paramedics details of Workmen
    Given Login and Navigate to Paramedics
    Then Verify User can be able to search Workmen Profile Paramedics
    Then Verify User can be able to View Workmen profile_Paramedics
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify User can be able to Enter Medical Examination Date
    Then Verify User can be able to add paramedics details
    Then Verify User can be able to save paramedics details

  #Then Verify User can be able to fetch paramedics details
  @E2E_Induction__Paramedics_Create_Validation_With_noInput
  Scenario: Verify User can be Validate Paramedics fields
    Given Login and Navigate to Paramedics
    Then Verify User can be able to Select Workmen Profile for Paramedics
    Then Verify User can be able to Validate Medical Exam Date field with no input
    Then Verify User can be able to Validate Medical Exam Date field with Past Date
    Then Verify User can be able to Validate Medical Exam Date field with Current date

  #Issue Report
  #Then Verify User can be able to Validate SkinTemp field With no input
  #Then Verify User can be able to Validate SPO2 With field no input
  #Then Verify User can be able to Validate Diastolic field With no input
  #Then Verify User can be able to Validate Weight field With no input
  #Then Verify User can be able to Validate Identification Mark1 field With no input
  @E2E_Induction__Paramedics_Create_Validation_With_multipleInput
  Scenario: Verify User can be Validate Paramedics fields with Numeric , Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to Paramedics
    Then Verify User can be able to Select Workmen Profile for Paramedics
    Then Verify User can be able to Validate SkinTemp field With max numeric input
    Then Verify User can be able to Validate SkinTemp field With alphabets input
    Then Verify User can be able to Validate SkinTemp field With Special Charecters input
    Then Verify User can be able to Validate Diabetics field With max numeric input
    Then Verify User can be able to Validate Diabetics field With alphabets input
    Then Verify User can be able to Validate Diabetics field With Special Charecters input
    Then Verify User can be able to Validate SPO2 With field with max numeric input
    Then Verify User can be able to Validate SPO2 With field With alphabets input
    Then Verify User can be able to Validate SPO2 With field With Special Charecters input
    Then Verify User can be able to Validate Systolic field With max numeric input
    Then Verify User can be able to Validate Systolic field With alphabets input
    Then Verify User can be able to Validate Systolic field With Special Charecters input
    Then Verify User can be able to Validate Diastolic field With max numeric input
    Then Verify User can be able to Validate Diastolic field With alphabets input
    Then Verify User can be able to Validate Diastolic field With Special Charecters input
    Then Verify User can be able to Validate Height field With max numeric input
    Then Verify User can be able to Validate Height field With alphabets input
    Then Verify User can be able to Validate Height field With Special Charecters input
    Then Verify User can be able to Validate Weight field With max numeric input
    Then Verify User can be able to Validate Weight field With alphabets input
    Then Verify User can be able to Validate Weight field With Special Charecters input
    Then Verify User can be able to Validate BMI field With max numeric input
    Then Verify User can be able to Validate BMI field With alphabets input
    Then Verify User can be able to Validate BMI field With Special Charecters input
    Then Verify User can be able to Validate Identification Mark1 field With max alphabets input
    Then Verify User can be able to Validate Identification Mark1 field With numeric input
    Then Verify User can be able to Validate Identification Mark1 field With Special Charecters input
    Then Verify User can be able to Validate Identification Mark2 field With max alphabets input
    Then Verify User can be able to Validate Identification Mark2 field With numeric input
    Then Verify User can be able to Validate Identification Mark2 field With Special Charecters input
    Then Verify User can be able to Validate Heartrate field With max numeric input
    Then Verify User can be able to Validate Heartrate field With alphabets input
    Then Verify User can be able to Validate Heartrate field With Special Charecters input

  @E2E_Induction__MedicalTest_Create
  Scenario: Verify User can be Perform Medical Test for Workmen
    Given Login and Navigate to MedicalTest
    Then Verify User can be able to search Workmen Profile Medical Test
    Then Verify User can be able to View Workmen profile medical Test
    Then Verify Basic details in Workmen profile are displayed correctly for medical test
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify Next Medical Examination due date displayed
    Then Verify the Paramedics details displayed Medical Test
    Then Verify the user can be able to create medical certificate
    #Then Verify the user can be able to download medical certificate - Need Implementation
    Then Verify the user can be able to update Skin Temperature
    Then Verify the user can be able to update Color of Eyes
    Then Verify the user can be able to update Complextion
    Then Verify the user can be able to enter BP
    Then Verify the user can be able to provide workmen medical status
    Then Verify the user can be able to add workmen medical fitness status
    Then Verify the user can be able to add Medical Officer Details
    Then Verify the user can be able to submit medical Test details

  @E2E_Induction__MedicalTest_Create_Verification_With_noInput
  Scenario: Verify User can be Validate Medical Test fields with no input
    Given Login and Navigate to MedicalTest
    Then Select Workmen for Medical Test Verification
    Then Verify User can be able to Validate Skin Temp field with no input
    #Issue Report
    Then Verify User can be able to Validate BP field with no input
    Then Verify User can be able to Validate Medical Officer Name field with no input
    Then Verify User can be able to Validate Medical Registration Number field with no input

  @E2E_Induction__MedicalTest_Create_Verification_With_multipleInput
  Scenario: Verify User can be Validate Medical Test fields with Numeric,alphabets,Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to MedicalTest
    Then Select Workmen for Medical Test Verification
    Then Verify User can be able to Validate Skin Temp field with Numeric input
    Then Verify User can be able to Validate Skin Temp field with alphabets input
    Then Verify User can be able to Validate Skin Temp field with Special Charecters input
    Then Verify User can be able to Validate BP field with Numeric input
    Then Verify User can be able to Validate BP field with alphabets input
    Then Verify User can be able to Validate BP field with Special Charecters input
    Then Verify User can be able to Validate Medical Officer field with Numeric input
    Then Verify User can be able to Validate Medical Officer field with alphabets input
    Then Verify User can be able to Validate Medical Officer field with Special Charecters input
    Then Verify User can be able to Validate Registration Number field with Numeric input
    Then Verify User can be able to Validate Registration Number field with alphabets input
    Then Verify User can be able to Validate Registration Number field with Special Charecters input

  @E2E_Induction__EHS_Create
  Scenario: Verify User can be Perform EHS - Safety Training for Workmen
    Given Login and Navigate to EHS
    Then Verify User can be able to search Workmen Profile EHS
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

  @E2E_Induction__EHS_Create_Validation_With_No_input
  Scenario: Verify User can be Perform EHS - Safety Training for Workmen
    Given Login and Navigate to EHS
    Then Verify user can be able to select workmen profile for EHS safty training Validation
    Then Verify user can be able to Validate if no training selected

  @E2E_Induction__Wage_Create
  Scenario: Verify User can be add wage details of a Workmen
    Given Login and Navigate to Wage
    Then Verify User can be able to View Workmen profile Wage
    Then Verify Basic details in Workmen profile are displayed correctly
    Then Verify Skill Analysis in Workmen profile are displayed correctly
    Then Verify Medical Test in Workmen profile are displayed correctly
    Then Verify EHS in Workmen profile are displayed correctly
    Then Verify Wage in Workmen profile are displayed correctly
    Then Verify user can be able to select project Location
    Then Verify user can be able to select project Zone
    Then Verify user can be able to select Payout Duration
    Then Verify user can be able to enter Basic Earnings
    Then Verify user can be able to enter HRA Earnings
    Then Verify user can be able to enter Fixed Other Allowances in Earnings
    #Then Verify user can be able to enter Multiple Fixed Other Allowances in Earnings # Need to Implement
    #Then Verify user can be able to enter Other Allowances calculated by Percentage in Earnings   # Issue Raised
    #Then Verify Other Allowances amount calculated correctly
    Then Verify Total Provisional Earnings is displayed correctly
    Then Verify user can be able to enter PF Deduction
    Then Verify user can be able to enter ESI Deduction
    Then Verify user can be able to enter Professional Tax Deduction
    Then Verify user can be able to Other Recoveries in Deduction
    #Then Verify user can be able to enter Multiple Fixed Other Recoveries in Deductions # Need to Implement
    #Then Verify user can be able to enter Other Recoveries calculated by Percentage in Deductions   # Issue Raised
    Then Verify Total Provisional Deductions is displayed correctly
    Then Verify Total Wage amount is displayed correctly
    Then Verify user can be able to save Wage details

  #Issue Report
  #@E2E_Induction__Wage_Create_no_input
  #Scenario: Verify User can be able to Validate wage fields with no input
  #Given Login and Navigate to Wage
  #Then Verify user can be able to select workmen profile for Wage Validation
  #Then Verify user can be able to Validate Basic Earnings with no input
  #Issue Report
  #Then Verify user can be able to Validate HRA Earnings with no input
  #Then Verify user can be able to Validate other allowance Reason with no input
  #Then Verify user can be able to Validate other allowance with dependent not selected
  #Then Verify user can be able to Validate other allowance Value with no input
  #Issue Report
  #Then Verify user can be able to Validate if PF Deduction is enabled
  #Then Verify user can be able to Validate if ESI Deduction is enabled
  #Then Verify user can be able to Validate if Professional Tax Deduction is enabled
  # Then Verify user can be able to Validate other recoveries Reason with no input
  #Then Verify user can be able to Validate other recoveries with dependent not selected
  #Then Verify user can be able to Validate other recoveries with no input
  @E2E_Induction__Wage_Create_With_multipleInput
  Scenario: Verify User can be able to Validate wage fields with Numeric,alphabets,Special Charecters & MaxValues inputs Provided
    Given Login and Navigate to Wage
    Then Verify user can be able to select workmen profile for Wage Validation
    #Issue Report
    Then Verify user can be able to Validate Basic Earnings with max numeric input
    Then Verify user can be able to Validate Basic Earnings with alphabets input
    Then Verify user can be able to Validate Basic Earnings with Special Charecters input
    Then Verify user can be able to Validate HRA Earnings with max numeric input
    Then Verify user can be able to Validate HRA Earnings with alphabets input
    Then Verify user can be able to Validate HRA Earnings with Special Charecters input
    Then Verify user can be able to Validate other allowance with max numeric input
    Then Verify user can be able to Validate other allowance with alphabets input
    Then Verify user can be able to Validate other allowance with Special Charecters input
    Then Verify user can be able to Validate PF Deduction with max numeric input
    Then Verify user can be able to Validate PF Deduction with alphabets input
    Then Verify user can be able to Validate PF Deduction with Special Charecters input
    Then Verify user can be able to Validate if ESI Deduction with max numeric input
    Then Verify user can be able to Validate if ESI Deduction with alphabets input
    Then Verify user can be able to Validate if ESI Deduction with Special Charecters input
    Then Verify user can be able to Validate if Professional Tax Deduction with max numeric input
    Then Verify user can be able to Validate if Professional Tax Deduction with alphabets input
    Then Verify user can be able to Validate if Professional Tax Deduction with Special Charecters input
    Then Verify user can be able to Validate other recoveries with max numeric input
    Then Verify user can be able to Validate other recoveries with alphabets input
    Then Verify user can be able to Validate other recoveries with Special Charecters input

  @E2E_Induction__Final_Approval_approve
  Scenario: Verify User can be able to Approve Workmen Induction Details
    Given Login and Navigate to Final Approval
    #Then Verify User can be able to search workmen by filter          # Issue Raised
    Then Verify User can be able to Expand and Collapse final approval window
    #Then Verify User can be able to Switch Pages in final approval window 		# Issue Raised
    Then Verify User can be able to View Workmen profile FA
    Then Verify Basic details in Workmen profile are displayed correctly FA
    Then Verify Skill Analysis in Workmen profile are displayed correctly FA
    Then Verify Medical Test in Workmen profile are displayed correctly FA
    Then Verify EHS in Workmen profile are displayed correctly FA
    Then Verify Wage in Workmen profile are displayed correctly FA
    Then Verify User can be able to Select Workmen Profile
    Then Verify Selected Workmen Profile Count Displayed
    Then Verify User can be able to Approve Induction details of Selected Workmen Profile

  #@E2E_Induction__Final_Approval_Reject  	 # Need Clarification on this scenario with Dev
  #Scenario: Verify User can be able to Approve Workmen Induction Details
  #Given Login and Navigate to Final Approval
  #Then Verify User can be able to search workmen by filter          # Issue Raised
  #Then Verify User can be able to View Workmen profile FA
  #Then Verify Basic details in Workmen profile are displayed correctly
  #Then Verify Skill Analysis in Workmen profile are displayed correctly
  #Then Verify Medical Test in Workmen profile are displayed correctly
  #Then Verify EHS in Workmen profile are displayed correctly
  #Then Verify Wage in Workmen profile are displayed correctly
  #Then Verify User can be able to Select Workmen Profile
  #Then Verify Selected Workmen Profile Count Displayed
  #Then Verify User can be able to Approve Induction details of Selected Workmen Profile
  @E2E_Induction__View_Workman_Profile_Dashboard_Eye
  Scenario: View Workman Profile
    Given Navigate to Induction Dashboard
    Then Search workmen by Aadhar
    Then Search workmen by Employee ID
    Then Verify User can able to View workman Profile

  @E2E_Induction__Search_Domestic_Workmen
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Aadhaar
    Then Verify User can be able to Search Domestic Workmen With Workmen Number
    Then Verify User can be able to Search Domestic Workmen With Name and Father Name
    #Then Verify User can be able to Search Domestic Workmen With VisaPro ID #Issue 100085 Reported
    Then Verify User can be able to Search Domestic Workmen With Passport Number

  @E2E_Induction__Search_Domestic_Workmen_multiple
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Name alone
    Then Verify User can be able to Search Domestic Workmen With FatherName alone

  @E2E_Induction__Search_International_Workmen
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select International for search
    Then Verify User can be able to Search International Workmen With Workmen Number
    Then Verify User can be able to Search International Workmen With Passport Number

  @E2E_Induction__Search_Workmen_Profile_Completion_Status
  Scenario: Verify User can be able to Search Domestic Workmen
    Given Navigate to Induction Dashboard and select Domestic for search
    Then Verify User can be able to Search Domestic Workmen With Workmen Number
    Then Verify User can be able to view Workmen profile Completion Status
    Then Verify User can be able to view Workmen profile Completion Percentage

  #Domestic
  @E2E_Induction__Dashboard_search_Domestic_workmen_Verification_no_input
  Scenario: Verify Error message is displayed when  Workmen Search fields when no data filled
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is not filled
    Then Verify Error message dipsplayed if Workmen number is not filled
    Then Verify Error message dipsplayed if name and father name are not filled
    Then Verify Error message dipsplayed if visaproID is not filled
    Then Verify Error message dipsplayed if Passport number is not filled

  @E2E_Induction__Dashboard_search_Domestic_workmen_Verification_Boundary_min
  Scenario: Verify Error message is displayed when  Workmen Search fields with min boundary value
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is filled with min boundary value
    Then Verify Error message dipsplayed if Workmen number is filled with min boundary value
    Then Verify Error message dipsplayed if name and father name are filled with min boundary value
    Then Verify Error message dipsplayed if visaproID is filled with min boundary value
    Then Verify Error message dipsplayed if Passport number is filled with min boundary value

  @E2E_Induction__Dashboard_search_Domestic_workmen_Verification_Boundary_max
  Scenario: Verify Error message is displayed when  Workmen Search fields with max boundary value
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is filled with max boundary value
    Then Verify Error message dipsplayed if Workmen number is filled with max boundary value
    Then Verify Error message dipsplayed if name and father name are filled with max boundary value
    Then Verify Error message dipsplayed if visaproID is filled with max boundary value
    Then Verify Error message dipsplayed if Passport number is filled with max boundary value

  @E2E_Induction__Dashboard_search_Domestic_workmen_Verification_Special_Char
  Scenario: Verify Error message is displayed when  Workmen Search fields filled with
    Given Navigate to Induction Dashboard
    Then Verify Error message dipsplayed if aadhaar number is filled with Special Charectors
    Then Verify Error message dipsplayed if Workmen number is filled with Special Charectors
    Then Verify Error message dipsplayed if name and father name are filled with Special Charectors
    Then Verify Error message dipsplayed if visaproID is filled with Special Charectors
    Then Verify Error message dipsplayed if Passport number is filled with Special Charectors

  #International
  @E2E_Induction__Dashboard_search_International_workmen_Verification_no_input
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is not filled
    Then Verify Error message dipsplayed if name and father name are not filled
    Then Verify Error message dipsplayed if visaproID is not filled
    Then Verify Error message dipsplayed if Passport number is not filled

  @E2E_Induction__Dashboard_search_International_workmen_Verification_Boundary_min
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is filled with min boundary value
    Then Verify Error message dipsplayed if name and father name are filled with min boundary value
    Then Verify Error message dipsplayed if visaproID is filled with min boundary value
    Then Verify Error message dipsplayed if Passport number is filled with min boundary value

  @E2E_Induction__Dashboard_search_International_workmen_Verification_Boundary_max
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is filled with max boundary value
    Then Verify Error message dipsplayed if name and father name are filled with max boundary value
    Then Verify Error message dipsplayed if visaproID is filled with max boundary value
    Then Verify Error message dipsplayed if Passport number is filled with max boundary value

  @E2E_Induction__Dashboard_search_International_workmen_Verification_Special_Char
  Scenario: Verify Error message is displayed when  Workmen Search fields
    Given Navigate to Induction Dashboard and select International for search
    Then Verify Error message dipsplayed if Workmen number is filled with Special Charectors
    Then Verify Error message dipsplayed if name and father name are filled with Special Charectors
    Then Verify Error message dipsplayed if visaproID is filled with Special Charectors
    Then Verify Error message dipsplayed if Passport number is filled with Special Charectors

  @E2E_Induction__Skill_Analysis_Workman_Search_By_Name
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Name

  @E2E_Induction__Skill_Analysis_Workman_Search_By_ID
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by ID

  @E2E_Induction__Skill_Analysis_Workman_Search_By_Skill
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Skill

  @E2E_Induction__Skill_Analysis_Workman_Search_By_Partner
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to Skill Analysis
    Then Verify User can able to search Workman by Partner Name

  @E2E_Induction__Paramedics_Workman_Search_By_Name
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by Name

  @E2E_Induction__Paramedics_Workman_Search_By_ID
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by ID

  @E2E_Induction__Paramedics_Workman_Search_By_Skill
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by Skill

  @E2E_Induction__Paramedics_Workman_Search_By_Partner
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to Paramedics
    Then Verify User can able to search Workman by Partner Name

  @E2E_Induction__Medical_Test_Workman_Search_By_Name
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by Name

  @E2E_Induction__Medical_Test_Workman_Search_By_ID
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by ID

  @E2E_Induction__Medical_Test_Workman_Search_By_Skill
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by Skill

  @E2E_Induction__Medical_Test_Workman_Search_By_Partner
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to MedicalTest
    Then Verify User can able to search Workman by Partner Name

  @E2E_Induction__EHS_Workman_Search_By_Name
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Name

  @E2E_Induction__EHS_Workman_Search_By_ID
  Scenario: Search Workman Profile By Workman ID
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by ID

  @E2E_Induction__EHS_Workman_Search_By_Skill
  Scenario: Search Workman Profile By Workman Skill
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Skill

  @E2E_Induction__EHS_Workman_Search_By_Partner
  Scenario: Search Workman Profile By Workman Partner Name
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Partner Name

  @E2E_Induction__Wage_Workman_Search_By_Name
  Scenario: Search Workman Profile By Workman Name
    Given Login and Navigate to EHS
    Then Verify User can able to search Workman by Name

  #@E2E_Induction__Wage_Workman_Search
  #
  #
  #				  @E2E_Induction__Wage_Workman_Search_By_ID
  #				  Scenario: Search Workman Profile By Workman ID
  #				    Given Login and Navigate to Wage
  #				    Then Verify User can able to search Workman by ID
  #
  #				  @E2E_Induction__Wage_Workman_Search_By_Skill
  #				  Scenario: Search Workman Profile By Workman Skill
  #				    Given Login and Navigate to Wage
  #				    Then Verify User can able to search Workman by Skill
  #
  #				  @E2E_Induction__Wage_Workman_Search_By_Partner
  #				  Scenario: Search Workman Profile By Workman Partner Name
  #				    Given Login and Navigate to Wage
  #				    Then Verify User can able to search Workman by Partner Name
  #
  #				  @E2E_Induction__Wage_Workman_Search_By_Name
  #				  Scenario: Search Workman Profile By Workman Name
  #				    Given Login and Navigate to Wage
  #				    Then Verify User can able to search Workman by Name
  # Need to work on another job
  #@E2E_Induction__Job_Switch_by_Domestic_aadhaar
  #Scenario: Verify User Can be able to Switch Workmen Job Domestic
  #Given Navigate to Induction Dashboard
  #Then Verify User can be able to Switch Job Domestic
  #Then Verify Domestic Job DLR Entry
  #Then Verify User can be able to Search workmen by Aadhar for Switch
  #Then Verify User can be able to navigate to Basic Details
  #Then Verify User can be able to Edit Basic Details
  #Then Verify Workmen Job Successfully Switched
  #
  #@E2E_Induction__Job_Switch_by_Domestic_passport
  #Scenario: Verify User Can be able to Switch Workmen Job Domestic
  #Given Navigate to Induction Dashboard
  #Then Verify User can be able to Switch Job Domestic
  #Then Verify Domestic Job DLR Entry
  #Then Verify User can be able to Search workmen by Passport for Switch Domestic
  #Then Verify User can be able to navigate to Basic Details
  #Then Verify User can be able to Edit Basic Details
  #Then Verify Workmen Job Successfully Switched
  #
  #@E2E_Induction__Job_Switch_by_International_passport
  #Scenario: Verify User Can be able to Switch Workmen Job International
  #Given Navigate to Induction Dashboard
  #Then Verify User can be able to Switch Job International
  #Then Verify Domestic Job DLR Entry
  #Then Verify User can be able to Search workmen by Passport for Switch Domestic
  #Then Verify User can be able to navigate to Basic Details
  #Then Verify User can be able to Edit Basic Details
  #Then Verify Workmen Job Successfully Switched
  #
  #@E2E_Induction__Job_Switch_Verification_input
  #Scenario: Verify User Can be able to verify Switch Workmen Job fields
  #Given Navigate to Induction Dashboard
  #Then Verify Error message dipsplayed if user select job code that user does not have access
  @E2E_Workforce_Allocation_Workman_Search_DashBorad
  Scenario: Verify Personal in Basic Details are displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Personal_Details
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

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Partner_Details
  Scenario: Verify Partner details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Partner details is displayed
    Then verify Partner name in Personal details are displayed correctly in profile
    Then Verify Partner address in Personal details is displayed in profile
    Then Verify Partner Contact number in Personal details is displayed in profile
    Then Verify Partner Email ID in Personal details is displayed in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Communication_Details
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

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Skill_Details
  Scenario: Verify Skill details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Skill Category in Basic Details are displayed correctly in profile
    Then verify Skill Group in Basic Details are displayed correctly in profile
    Then verify Skill Description in Basic Details are displayed correctly in profile
    Then verify Skill Type in Basic Details are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Deployment_Details
  Scenario: Verify Deployment details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Deployment in Basic Details are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Education_Details
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

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Experience_Details
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

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Statutory_Details
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

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_PF_Nominee_Details
  Scenario: Verify PF Nominee details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Name in PF Nominee Details are displayed correctly in profile
    Then Verify Relationship in PF Nominee Details are displayed correctly in profile
    Then Verify Allocation Percentage in PF Nominee Details are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Bank_Details
  Scenario: Verify Bank details in in Workman Profile are displayed Correctly
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then Verify Account Name in Bank Details are displayed correctly in profile
    Then Verify Account No in Bank Details are displayed correctly in profile
    Then Verify IFSC Or IBAN or SWIFT Code in Bank Details are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Skill_Analysis_Details
  Scenario: Verify Medical Details displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Skill Description in Skill Analysis are displayed correctly in profile
    Then verify Project Description in Skill Analysis are displayed correctly in profile
    Then verify Skill in Skill Analysis are displayed correctly in profile
    Then verify Percentage in Skill Analysis are displayed correctly in profile
    Then verify Test Taken on in Skill Analysis are displayed correctly in profile
    Then verify Status in Skill Analysis are displayed correctly in profile
    Then verify Restest Date in Skill Analysis are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Medical_test_Details
  Scenario: Verify Skill Details displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Medicaltest Due in Medical Test are displayed correctly in profile
    Then verify Fitness Status in Medical Test are displayed correctly in profile
    Then verify Fitness Status in Medical Test are displayed correctly in profile
    Then verify Skin Temperature in Medical Test are displayed correctly in profile
    Then verify Diabetics in Medical Test are displayed correctly in profile
    Then verify SPO2 in Medical Test are displayed correctly in profile
    Then verify Systolic in Medical Test are displayed correctly in profile
    Then verify Diastolic in Medical Test are displayed correctly in profile
    Then verify Height in Medical Test are displayed correctly in profile
    Then verify Weight in Medical Test are displayed correctly in profile
    Then verify BMI in Medical Test are displayed correctly in profile
    Then verify Identification Marks 1 in Medical Test are displayed correctly in profile
    Then verify Identification Marks 2 in Medical Test are displayed correctly in profile
    Then verify Heart Rate in Medical Test are displayed correctly in profile
    Then verify the secound Skin Temperature in Medical Test is displayed correctly in profile
    Then verify BP in Medical Test are displayed correctly in profile
    Then verify Varicose in Medical Test are displayed correctly in profile
    Then verify Seizure in Medical Test are displayed correctly in profile
    Then verify Vertigo in Medical Test are displayed correctly in profile
    Then verify Acrophobia in Medical Test are displayed correctly in profile
    Then verify Diabetes in Medical Test are displayed correctly in profile
    Then verify Stroke in Medical Test are displayed correctly in profile
    Then verify Heart Disease in Medical Test are displayed correctly in profile
    Then verify Major Illness in Medical Test are displayed correctly in profile
    Then verify Respiratory Diseases in Medical Test are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_EHS_Details
  Scenario: Verify EHS Details displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Skill Description in EHS are displayed correctly in profile
    Then verify job in EHS are displayed correctly in profile
    Then verify Training Date in EHS are displayed correctly in profile

  @E2E_Workforce_Allocation_Workman_Profile_Dashboard_Wage_Details
  Scenario: Verify Wage Details displayed Correctly in Workman Profile
    Given Navigate to Induction Dashboard
    Then Verify User can be able to Search workman Profile
    Then Verify User can be able to View workman Profile
    Then verify Wage details are displayed correctly in profile

  @E2E_Daily_Attendance_upload
  Scenario: Verify user can be able to upload Daily Attendance of a workmen
    Given Login and Navigate to Attendance
    Then Verify User can be able to Upload Attendance Data via Cap file

  @E2E_Daily_Attendance_upload_for_Year
  Scenario: Verify user can be able to View Attendance Summary
    Given Login and Navigate to Attendance
    Then Upload All Attendance Data for the year

  @E2E_Daily_Attendance_View
  Scenario: Verify user can be able to upload Daily Attendance of a workmen
    Given Login and Navigate to Attendance
    Then Verify User can be able to view attendance record
    Then Verify User can be able to expand or collapse attendance view grid

  @E2E_Daily_Attendance_upload_Validation
  Scenario: Verify user can be able to validate Attendance upload fields
    Given Login and Navigate to Attendance
    Then Verify User can be able to Upload Attendance Data via txt file
    Then Verify User can be able to Upload Attendance Data via pdf file
    Then Verify User can be able to Upload Attendance Data via image file
    Then Verify User can be able to Upload Attendance Data via excel file
    Then Verify User can be able to Upload Attendance Data with wrong cap file format

  # Issue Report
  #@E2E_Daily_Attendance_view_Validation
  #Scenario: Verify user can be able to validate Attendance view fields
  #Given Login and Navigate to Attendance
  #Then Verify User can be able to use filter
  @E2E_GatePass_Search_Workmen
  Scenario: Verify user can be able to search Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to search Workmen Profile Gate Pass
    Then Verify User can be able to View Workmen profile Gate Pass

  @E2E_GatePass_Issue
  Scenario: Verify user can be able to Issue Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Issue Gate Pass

  @E2E_GatePass_Load
  Scenario: Verify user can be able to Issue Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to load more workmen profile by clicking Load more option

  @E2E_GatePass__Renewal
  Scenario: Verify user can be able to Renew Gate Pass
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Renew Gate Pass No Records
    Then Verify User can be able to Renew Gate Pass With Records

  @E2E_GatePass__Blacklist
  Scenario: Verify user can be able to Blacklist Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Blacklist Workmen

  @E2E_GatePass__Temporary_Release
  Scenario: Verify user can be able to Temporary Release Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Temporary Release Workmen

  @E2E_GatePass__Permanent_Release
  Scenario: Verify user can be able to Permanent Release Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Permanent Release Workmen

  #@E2E_GatePass__Generate_Print
  #Scenario: Verify user can be able to Generate Print
  #Given Login and Navigate to Gate Pass
  #Then Verify User can be able to Generate Print  # Not Feasibile
  @E2E_GatePass__Blacklist
  Scenario: Verify user can be able to Blacklist Workmen
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to Blacklist Workmen without reason

  @E2E_GatePass__Generate_Print
  Scenario: Verify user can be able to Generate Print
    Given Login and Navigate to Gate Pass
    Then Verify User can be able to validate Generate Print from Date field
    Then Verify User can be able to validate Generate Print To Date field
    Then Verify User can be able to validate TimeKeeper field

  @E2E_Attendance_Summery_View
  Scenario: Verify user can be able to View Attendance Summary
    Given Login and Navigate to Attendance
    Then Verify user can be able to View Attendance Summary By selecting Date
    Then Verify user can be able to View Attendance Summary details is Displayed

  @E2E_Attendance_Summery_View_Search
  Scenario: Verify user can be able to Search Workmen Attendance Summary
    Given Login and Navigate to Attendance

  #Then Verify user can be able to Search Workmen
  @E2E_Training_Dashboard_ViewTrainings
  Scenario: Training Dashboard View
    Description :  As a EIP User i should be able to View Workmen Training from Dashboard

    Given Login as Training Creator and Navigate to Training
    Then Verify user can be able to select IC
    Then Verify user can be able to select SBG
    Then Verify user can be able to select BU
    Then Verify user can be able to select Cluster
    Then Verify user can be able to select Job
    Then Verify user can be able to select Date

  @E2E_Navigate_To_DLR
  Scenario: Verify User can be able to Navigate to DLR
    Description :  As a EIP User i should be able to Navigate DLR Page

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Navigate to DLR from Dashboard Workmen Search

  @E2E_DLR_View
  Scenario: Verify User can be able to View DLR for selected Job
    Description :  As a EIP User i should be able to View DLR for Selected Job

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Selecting Current job for DLR Entery
    Then Selecting Date for DLR Entery
    Then Searching DLR Entery For Job

  @E2E_DLR_Entry
  Scenario: Verify User can be able to Enter DLR for Job
    Description :  As a EIP User i should be able to Enter DLR for Job

    Given Login for DLR
    Then Navigate to DLR Directly
    Then Selecting Current job for DLR Entery
    Then Selecting Date for DLR Entery
    Then Enter DLR Entry for Day shift Workmen
    Then Enter DLR Entry for Night shift Workmen
    Then DLR Entry Total Calculated Correctly
    Then Enter DLR Breakup Workmen Strenght
    Then Enter DLR Breakup Workmen at site
    Then Enter DLR Breakup Workmen Inducted
    Then Enter DLR Breakup Workmen Released
    Then Enter DLR Breakup Workmen Expected to Released
    Then Enter DLR Breakup Workmen Under Quarantine
    Then Enter DLR Breakup Workmen Affected by Covid
    Then DLR Breakup Calculated Correctly
    Then Verify User can be able to Save DLR Entry

  #Configuration
  #Configuration- Add Camp
  @Add_New_Camp_E2E
  Scenario: Add New Camp
    Description :  As a EIP User i should be able to Add New Camp

    Given Login and Navigate to Camp Management
    Then Verify User can be able to add camp name
    Then Verify User can be able to add camp address
    Then Verify User can be able to add camp Pincode
    Then Verify User can be able to save camp details

  @Add_Camp_Structure_E2E
  Scenario: Add Camp Structure
    Description :  As a EIP User i should be able to Add Camp Structure

    Given Login and Navigate to Camp Management
    Then Verify User can be able to Add Camp Structure name
    Then Verify User can be able to Add Room count to Camp Structure
    Then Verify User can be able to save camp Structure details

  @Add_Camp_Structure_Room_E2E
  Scenario: Add Camp Structure Room
    Description :  As a EIP User i should be able to Add Camp Structure Room

    Given Login and Navigate to Camp Management
    Then Verify User can be able to Add Camp room name
    Then Verify User can be able to Add max bed count in room
    Then Verify User can be able to Add area size of room
    Then Verify User can be able to save camp room details

  @Add_Workmen_to_Room_E2E
  Scenario: Add workmen to room
    Description :  As a EIP User i should be able to Add workmen to room

    Given Login and Navigate to Camp Management
    Then Verify User can be able to select room
    Then Verify User can be able to Add workmen to room
    Then Verify User can be able to view workmen details in room

  #Configuration
  #Configuration- Role Mapping
  @Configuration_RoleMapping_E2E
  Scenario: Verify User can be able to map role for user
    Description :  As a EIP User i should be able to map role for user

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Role Mapping
    Then Verify user can be able to add Time Office role for user
    Then Verify user can be able to add IR Manager role for user
    Then Verify user can be able to add Accounts role for user
    Then Verify user can be able to add Skill Approver role for user
    Then Verify user can be able to add Paramedics role for user
    Then Verify user can be able to add Medical Officer role for user
    Then Verify user can be able to add Safety Officer role for user

  @Remove_RoleMapping_E2E
  Scenario: Verify User can be able to remove role for user
    Description :  As a EIP User i should be able to remove role for user

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Role Mapping
    Then Verify user can be able to Remove Time Office role for user
    Then Verify user can be able to Remove IR Manager role for user
    Then Verify user can be able to Remove Accounts role for user
    Then Verify user can be able to Remove Skill Approver role for user
    Then Verify user can be able to Remove Paramedics role for user
    Then Verify user can be able to Remove Medical Officer role for user
    Then Verify user can be able to Remove Safety Officer role for user

  #Configuration
  #Configuration- Calender
  @Add_Festival_or_National_Holidays_Calender_E2E
  Scenario: Verify User can be able to add Festival/National Holidays to calender
    Description :  As a EIP User i should be able to add Festival/National Holidays to calender

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Calender
    Then Verify user can be able to select Year for Calender Master
    Then Verify user can be able to view Total Holidays for selected Year
    Then Verify user can be able to view existing Festival or National Holidays for selected Year
    Then Verify user can be able to view existing Regular Holidays for selected Year
    Then Verify user can be able to select Year to add Festival or National Holiday
    Then Verify user can be able to select month to add Festival or National Holiday
    Then Verify user can be able to select date to add Festival or National Holiday
    Then Verify user can be able to view date selected for Festival or National Holiday
    Then Verify user can be able to select Holiday type
    Then Verify user can be able to description of Holiday
    Then Verify user can be able to save Holiday
    Then Verify user can be able to submit saved Holiday list

  @Add_Regular_Holidays_Calender_E2E
  Scenario: Verify User can be able to add Regular Holidays to calender
    Description :  As a EIP User i should be able to add Regular Holidays to calender

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Calender
    Then Verify user can be able to select Year for Calender Master
    Then Verify user can be able to view Total Holidays for selected Year
    Then Verify user can be able to view existing Regular Holidays for selected Year
    Then Verify user can be able to select Regular Holiday type
    Then Verify user can be able to select Regular Holiday Day
    Then Verify user can be able to save Regular Holiday
    Then Verify user can be able to submit saved Holiday list

  @Add_Festival_or_National_and_Regular_Holidays_Calender_E2E
  Scenario: Verify User can be able to add Festival/National and Regular Holidays to calender
    Description :  As a EIP User i should be able to add Festival/National and Regular Holidays to calender

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Calender
    Then Verify user can be able to select Year for Calender Master
    Then Verify user can be able to view Total Holidays for selected Year
    Then Verify user can be able to view existing Festival or National Holidays for selected Year
    Then Verify user can be able to view existing Regular Holidays for selected Year
    Then Verify user can be able to select Year to add Festival or National Holiday
    Then Verify user can be able to select month to add Festival or National Holiday
    Then Verify user can be able to select date to add Festival or National Holiday
    Then Verify user can be able to view date selected for Festival or National Holiday
    Then Verify user can be able to select Holiday type
    Then Verify user can be able to description of Holiday
    Then Verify user can be able to save Holiday
    Then Verify user can be able to select Regular Holiday type
    Then Verify user can be able to select Regular Holiday Day
    Then Verify user can be able to save Regular Holiday
    Then Verify user can be able to submit saved Holiday list

  @Remove_Festival_or_National_Holidays_Calender_E2E
  Scenario: Verify User can be able to remove Festival/National Holidays to calender
    Description :  As a EIP User i should be remove to add Festival/National Holidays to calender

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Calender
    Then Verify user can be able to select Year for Calender Master
    Then Verify user can be able to view Total Holidays for selected Year
    Then Verify user can be able to Remove existing Festival or National Holidays for selected Year

  #Configuration
  #Configuration- Shift
  @Configuration_Shift_View_E2E
  Scenario: Verify User can be able to View Shift for the selected Job
    Description :  As a EIP User i should be able to View Shift for the selected Job

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job

  @Configuration_View_Shift_in_Master_E2E
  Scenario: Verify User can be able to View Shift in Master
    Description :  As a EIP User i should be able to View Shift in Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master

  @Configuration_Add_Shift_to_Master_E2E
  Scenario: Verify User can be able to Add Shift to Master
    Description :  As a EIP User i should be able to Add Shift to Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master
    Then Verify user can be able to Add Shift Code to add Shift in master
    Then Verify user can be able to Add Shift Description to add Shift in master
    Then Verify user can be able to Add Shift From Hour to add Shift in master
    Then Verify user can be able to Add Shift To Hour to add Shift in master
    Then Verify user can be able to Add Break From Hour to add Shift in master
    Then Verify user can be able to Add Break To Hour to add Shift in master
    Then Verify user can be able to Add Shift to Shift Master

  @Configuration_Add_Shift_to_Job_E2E
  Scenario: Verify User can be able to Add Shift to Master
    Description :  As a EIP User i should be able to Add Shift to Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master
    Then Verify user can be able to Add Shift to Job
    Then Verify user can be able to save Shift for the selected job
    Then Verify user can be able to view exhisting Shift for the selected job

  @Configuration_View_Shift_in_Master_filter_E2E
  Scenario: Verify User can be able to Filter Shift in Master
    Description :  As a EIP User i should be able to Filter Shift in Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to view exhisting Shift for the selected job
    Then Verify user can be able to view Shifts available in master
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to filter records by Shift code in master
    Then Verify user can be able to filter records by Shift Desc in master
    #		Issue Reported
    #		Then Verify user can be able to filter records by Shift From Hour in master
    #		Then Verify user can be able to filter records by Shift To Hour in master
    #		Then Verify user can be able to filter records by Break From Hour in master
    #		Then Verify user can be able to filter records by Break To Hour in master
    Then Verify user can be able to filter records by Status in master

  @Configuration_Delete_Shift_from_Master_E2E
  Scenario: Verify User can be able to Delete Shift from Master
    Description :  As a EIP User i should be able to Delete Shift from Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to delete Shift from Master
    Then Verify user can be able to view exhisting Shift for the selected job

  @Configuration_Edit_Shift_from_Master_E2E
  Scenario: Verify User can be able to Edit Shift from Master
    Description :  As a EIP User i should be able to Edit Shift from Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to select Shift record from Master for Edit Shift record
    Then Verify user can be able to Edit Shift Description from Master
    Then Verify user can be able to Edit Shift From Hour from Master
    Then Verify user can be able to Edit Shift To Hour from Master
    Then Verify user can be able to Edit Break From Hour from Master
    Then Verify user can be able to Edit Break To Hour from Master
    Then Verify user can be able to Add Shift to Shift Master
    Then Verify user can be able to view Shifts available in master

  @Configuration_Edit_Status_of_Shift_from_Master_E2E
  Scenario: Verify User can be able to Edit Status of Shift from Master
    Description :  As a EIP User i should be able to Edit Status of Shift from Master

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify Shift Master Records
    Then Verify user can be able to Edit Shift Status
    Then Verify user can be able to view Shifts available in master

  @Configuration_Remove_Shift_from_Job_E2E
  Scenario: Verify User can be able to Remove shift from Job
    Description :  As a EIP User i should be able to Remove shift from Job

    Given Login and Navigate to Configuration
    Then Verify User can be able to select Job
    Then Verify user can be able to Navigate to Shift
    Then Verify user can be able to Verify exhisting Shift for the selected job
    Then Verify user can be able to Remove Shift from job
