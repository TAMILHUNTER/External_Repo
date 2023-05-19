@Induction_Create_Basic_Details
Feature: Feature : Induction (89564) UserStory : Workman Basic Details (89579)
  *********************************************
  UserStory: Workman Basic Details (89579) 
  *********************************************
  Description :  As a EIP User i should be able to Create workman Basic Details
  ******************************************************************************************

  @Induction_Create_Basic_Details_Partner
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

  @Induction_Create_Basic_Details_Personal
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
    #Then verify user can able to select Police Verification Certificate
    Then verify user can able to select Nationality
    Then verify user can able to provide CSTI and NAPS
    Then verify user can able to save Personal details

  @Induction_Create_Basic_Details_Communication
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

  @Induction_Create_Basic_Details_Skill
  Scenario: Skill
    Description :  As a EIP User i should be able to Fill Workmen Skill Details

    Given Fill Partner Personal communication details then navigate to Skill
    Then Verify user can able to select skill category
    Then Verify user can able to select skill group
    Then Verify user can able to select skill description
    Then Verify user can able to select skill Type
    Then Verify user can able to save skill

  @Induction_Create_Basic_Details_Deployment
  Scenario: Deployment
    Description :  As a EIP User i should be able to Fill Workmen Deployment Details

    Given Fill Partner Personal communication Skill details then navigate to Deployment
    Then Verify user can able to click deployemnt
    Then Verify user can able to select deployemnt from tree
    Then Verify user can able to save deployemnt
    Then Verify user can able to select deployemnt from subtree
    Then Verify user can able to save deployemnt subtree

  @Induction_Create_Basic_Details_Education
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

  @Induction_Create_Basic_Details_Experience
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

  @Induction_Create_Basic_Details_Statutory
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
  @Induction_Create_Basic_Details_Bank
  Scenario: Bank
    Description :  As a EIP User i should be able to Fill Workmen Bank Details

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank
    Then Verify user can able to add Bank Account name
    Then Verify user can able to add Bank Account Number
    Then Verify user can able to add Bank Account Type
    Then Verify user can able to add Bank Account Details

  @Induction_Create_Basic_Details_Submit_workman_details
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

    Given Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details
    Then Verify save and submit workman details
    
  @Induction_Create_Nepal_Workmen_LE20D146
  Scenario: Create and Submit workman details
    Description :  As a EIP User i should be able to Submit Workmen Details for Induction

   Given Login
   And Navigate to Induction
   Then Verify and switch nepal Job LE20D146
   Then Swicth to International induction Selection
   Then Verify and fill DLR for nepal job LE20D146
   Then Verify user can be able to Search international workmen and proceed for induction
   Then Verify user can be able to Fill Partner Details
   Then Verify user can be able to Fill Personal Details
   Then Verify user can be able to Fill Communication Details
   Then Verify user can be able to Fill Skill Details
   Then Verify user can be able to Fill Deployment Details
   Then Verify user can be able to Fill Education Details
   Then Verify user can be able to Fill Experience Details
	 Then Verify user can be able to Fill Satutory Details
	 Then Verify user can be able to Fill Bank Details
	 Then Verify user can be able to Submit workmen Details   
    
   
    
