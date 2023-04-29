@Regression_EDMSENG
Feature: Engineering Schedule Document
  
  As a user after login i should able to create Engineering Schedule Document.

  @EngineeringScheduleCreate @Menus
  Scenario: Create a new Engineering Schedule Document
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then as a user i should able to click all tab
    Then user should able to Switch and Select to Project Gandhi
    Then user should able to click create icon
    Then user should able to select Discipline
    Then user should able to select Structure
    Then user should able to select the Area
    Then user should able to select Document DWG
    Then user should able to select Doc Type
    Then user should able to select Print Size
    Then user should able to capture Title
    Then user should able to select Revision category
    Then user should able to capture EnggMan Hrs
    Then user should able to capture DraftMan Hrs
    Then user should able to capture Weightage
    Then user should able to select ApproBy
    Then user should able to select Doc Workflow
    Then user should able to capture Wf Calender in Respentive Calendar
    Then user should able to view Gfc Calender
    Then user should able to capture Doc Comment
    Then user should able to click Doc Row
    Then user should able to click Doc Revision Toggle
    Then user should able to select Document Status
    #Then user should able to click Doc Revision
    Then user should able to select AuthorisedBy
    Then user should able to click QR CodeActive
    Then user should able to capture Document Reference
    Then user should able to capture NoOfSheets in Document
    Then user should able to save the Created Document
    Then user should able to click DocSaveOk the Created Document
  	Then user should able to click Logout button
  
   @EngineeringScheduleCreateWithKKNPP_Project @Menus
  Scenario: Create a new Engineering Schedule Document with O17092 - KKNPP 3 & 4 Main Plant Project
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then user should able to Switch and Select to KKNPP Project
    Then as a user i should able to click all tab
    Then user should able to click create icon
    Then user should able to select Discipline
    Then user should able to select Structure
    Then user should able to select the Area
    Then user should able to select Document DWG
    Then user should able to select Print Size
    Then user should able to capture Title
    Then user should able to select Revision category
    Then user should able to capture EnggMan Hrs
    Then user should able to capture DraftMan Hrs
    Then user should able to capture Weightage
    Then user should able to select ApproBy
    Then user should able to select Doc Workflow
    Then user should able to capture Calender in Respentive Calendar
    Then user should able to view Gfc Calender
    Then user should able to capture Doc Comment
    Then user should able to click Doc Row
    Then user should able to click Doc Revision Toggle
    Then user should able to select Document Status
    #Then user should able to click Doc Revision
    Then user should able to select AuthorisedBy
    Then user should able to click QR CodeActive
    Then user should able to capture Document Reference
    Then user should able to capture NoOfSheets in Document
    Then user should able to save the Created Document
    Then user should able to click DocSaveOk the Created Document
  	Then user should able to click Logout button

  @EngineeringScheduleMandatoryField @Menus
  Scenario: Engineering Schedule Document Mandatory Field Check
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then user should able to Switch and Select to Project Gandhi
    Then click Engineering Schedule Page Mandatory field check
    Then Verify Engineering Schedule Doc Mandatory field check
    Then Verify Engineering Schedule Doc Schedule Mandatory field check
    Then Verify Engineering Schedule Doc Revision Mandatory field check
   	Then user should able to click Logout button
  
  @EngineeringSchedule_CommonControl @Menus
  Scenario: Engineering Schedule Document Common Control Check
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then user should able to Switch and Select to Project Gandhi
    Then as a user is should able to click For Action Tab
    Then as a user is should able to click Rejected Tab
    Then as a user is should able to click Approved Tab
    Then as a user is should able to click InProgress Tab
    Then as a user is should able to click Completed Tab
    Then as a user i should able to click all tab
    Then user should able to click the filter icon
    Then user should able to click the search button
    Then user should able to click and Download Excel sheet
    Then user should able to click the Viewdays button
    Then user should able to click and Export Excel sheet
    Then user should able to click the ShowNo
    Then user should able to Page Expand the Eng Page
    #Then user should able to Page Collapse the Eng Page
    #Then user should able to clear the Project
    #Then user should able to change LIC as Project
    #Then user should able to change MAHSR as Project
    Then Verify As a user i should able to choose and switch Project in Engineering Schedule Doc
    Then user should able to click Logout button

  @EngineeringSchedule_CreateReject @Menus
  Scenario: Engineering Schedule Document ( Create & Reject  )
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then user should able to Switch and Select to Project Gandhi
    Then as a user i should able to click all tab
    Then user should able to click create icon
    Then user should able to create Engineering Schedule Doc With C4 Template Workflow
    Then as a user is should able to create and Reject Doc
    Then user should able to click Logout button

  @EngineeringSchedule_CreateApprove
  Scenario: Engineering Schedule Document Create & Approve
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then as a user i should able to click all tab
    Then user should able to click create icon
    Then user should able to create Engineering Schedule Doc With C4 Template Workflow
    Then as a user is should able to approve In ForAction Tab
    Then user should able to click Logout button

  @EngineeringSchedule_Mail
  Scenario: Create a Mail againt Engineering Schedule Doc
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then as a user is should able to click Document Mail
    Then as a user is should able to click AttachFile in Mail
    Then as a user is should able to select Document in AttachFile
    Then as a user is should able to select Document Num in AttachFile Mail
    Then as a user is should able to click Submit the AttachFile Mail
    Then as a user is should able to select ProjectCode Mail
    Then as a user is should able to capture Demo Project Mail
    Then as a user is should able to select Discipline in Mail
    Then as a user is should able to capture Discipline Architecture in Mail
    Then as a user is should able to select FromOrg in Mail
    Then as a user is should able to capture FromOrg LNT in Mail
    Then as a user is should able to select ToOrg in Mail
    Then as a user is should able to capture ToOrg2 in Mail
    #Then as a user is should able to select MsgSerial No in Mail
    #Then as a user is should able to select Serial No in Mail
    Then as a user is should able to select Mail Type in Mail
    Then as a user is should able to capture Letter Mail Type in Mail
    #Then as a user is should able to click Confidential Toggle in Mail
    Then as a user is should able to select Msg Group in Mail
    Then as a user is should able to capture Test as Msg Group in Mail
    Then as a user is should able to click ResToggle in Mail
    Then as a user is should able to capture Subject in Mail
    #Then as a user is should able to capture Comment in Mail
    Then as a user is should able to selected Doc Delete in Mail
    Then as a user is should able to cilck Send in Mail
    #  Then as a user is should able to cilck Save as Draft in Mail
    # Then as a user is should able to select Attachmen File in Mail
    #  Then as a user is should able to select Document Email in table
    # Then as a user is should able to select Email in Page
    # Then as a user is should able to select Mail in Email Page
    # Then as a user is should able to select Email in Transmittal
    #  Then as a user is should able to click close in Mail
    Then user should able to click Logout button

@EngineeringSchedule_CreateMail_SaveAsDraft
  Scenario: Create & Save as Draft a Mail againt Engineering Schedule Doc
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then as a user is should able to click Document Mail
    Then as a user is should able to click AttachFile in Mail
    Then as a user is should able to select Document in AttachFile
    Then as a user is should able to select Document Num in AttachFile Mail
    Then as a user is should able to click Submit the AttachFile Mail
    Then as a user is should able to select ProjectCode Mail
    Then as a user is should able to capture Demo Project Mail
    Then as a user is should able to select Discipline in Mail
    Then as a user is should able to capture Discipline Architecture in Mail
    Then as a user is should able to select FromOrg in Mail
    Then as a user is should able to capture FromOrg LNT in Mail
    Then as a user is should able to select ToOrg in Mail
    Then as a user is should able to capture ToOrg2 in Mail
    #Then as a user is should able to select MsgSerial No in Mail
    #Then as a user is should able to select Serial No in Mail
    Then as a user is should able to select Mail Type in Mail
    Then as a user is should able to capture Letter Mail Type in Mail
    #Then as a user is should able to click Confidential Toggle in Mail
    Then as a user is should able to select Msg Group in Mail
    Then as a user is should able to capture Test as Msg Group in Mail
    Then as a user is should able to click ResToggle in Mail
    Then as a user is should able to capture Subject in Mail
    #Then as a user is should able to capture Comment in Mail
    Then as a user is should able to selected Doc Delete in Mail
    #Then as a user is should able to cilck Send in Mail
    Then as a user is should able to cilck Save as Draft in Mail
    # Then as a user is should able to select Attachmen File in Mail
    #  Then as a user is should able to select Document Email in table
    # Then as a user is should able to select Email in Page
    # Then as a user is should able to select Mail in Email Page
    # Then as a user is should able to select Email in Transmittal
    #  Then as a user is should able to click close in Mail
    Then user should able to click Logout button



  @EngineeringSchedule_Mail_Mandatory
  Scenario: Verify Mail Mandatory field check
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu
    Then as a user is should able to Verify Mail Mandatory field check
    Then as a user is should able to cilck Send in Mail
    Then user should able to click Logout button
    
    
 	@EngineeringSchedule_Create_StartWorkflow
	Scenario: Engineering Schedule Document Create & Start Workflow
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu 
    Then as a user i should able to click all tab
    Then user should able to click create icon
    Then user should able to create Engineering Schedule Doc With C4 Template Workflow
    Then as a user is should able to approve In ForAction Tab
    Then as a user is should able to click Approved Tab
    Then as a user is should able to Initiate C4 Template Workflow
    Then user should able to click Logout button
   
	@EngineeringSchedule_StartWorkflowPP
	Scenario: Engineering Schedule Document Start Workflow
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu 
    Then as a user i should able to click all tab  
    Then as a user is should able to click Approved Tab
    Then as a user is should able to Initiate C4 Template Workflow
    Then user should able to click Logout button
    
  @EngineeringSchedule_StartGFCWorkflow
	Scenario: Engineering Schedule Document Start GFC Workflow
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click the home page main menu
    Then user should able to Click Engineering Schedule in Main Menu 
    Then as a user i should able to click all tab  
    Then user should able to Initiate GFC Workflow
    Then user should able to click Logout button
    
