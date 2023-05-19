Feature: INDUCTION (89564)
  UserStory: Workman Basic Details (89579) 
  
  Description :  As a EIP User i should be able to Edit workman Basic Details

  @Induction_Workmen_search
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

  @Induction_Edit_Basic_Details_Partner
  Scenario: Verify User can able to Edit Partner Details
    Given Select Workman and Navigate to Partner
    Then Verify user can able to update Worktype
    Then Verify user can able to update Partner

  @Induction_Edit_Basic_Details_Personal
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

  @Induction_Edit_Basic_Details_Communication
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

  @Induction_Edit_Basic_Details_Skill
  Scenario: Verify User can able to edit workman Skill Details
    Given Select Workman and Navigate to Skill
    Then Verify user can able to update skill Category
    Then Verify user can able to update skill Group
    Then Verify user can able to update skill Description
    Then Verify user can able to update skill Type


@Induction_Edit_Basic_Details_Deployment
  Scenario: Verify User can able to edit workman Deployment Details
    Given Select Workman and Navigate to deployemnt
    Then Verify user can able to Edit deployemnt
    
    
# Issue Reported 96811
  @Induction_Edit_Basic_Details_Education 
  Scenario: Verify User can able to edit workman Education Details
    Given Select Workman and Navigate to Education
    Then Verify user can able to Edit Qualification
    Then Verify user can able to Edit Branch
    Then Verify user can able to Edit Discipiline
    Then Verify user can able to Edit School Or College
    Then Verify user can able to Edit School Or Board or University
    Then Verify user can able to Edit School Or Year of Passing

# Issue Reported 96777
  @Induction_Edit_Basic_Details_Experience 
  Scenario: Verify User can able to edit workman Experience Details
    Given Select Workman and Navigate to Experience
    Then Verify user can able to Edit Duration
    Then Verify user can able to Edit Organisation Name
    Then Verify user can able to Edit Project Location
    Then Verify user can able to Edit Project Code
    Then Verify user can able to Edit Skill Category
    Then Verify user can able to Edit Skill Group
    Then Verify user can able to Edit Skill Description

  @Induction_Edit_Basic_Details_Statutory
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

  @Induction_Edit_Basic_Details_Domestic_Bank
  Scenario: Verify User can able to edit Bank Details
    Given Select Workman and Navigate to Bank
    Then Verify User can able to Edit Domestic Account Details_Update

#No Data Found
  #@Induction_Edit_Basic_Details_Domestic_International
  #Scenario: Verify User can able to edit Bank Details
    #Given Select Workman and Navigate to Bank
    #Then Verify user can be able to change bank account type
    #Then Verify User can able to Edit International Bank Type Swift
    #Then Verify User can able to Edit International Bank Type IBAN    