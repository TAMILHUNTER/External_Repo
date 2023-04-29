@RespondWorkflowSmoke 

Feature: Engineering Schedule Document Respond Workflow
  
  As a user after login i should able to Workflow Action for created Engineering Schedule Document.

  @CreateDoc_StartWorkflow_SD_DraftingInprgoress
  Scenario: Engineering Schedule Document Create & Start Workflow Action
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click main menu in home page
    Then user should able to Click Engineering Schedule in Main Menu WF
    Then as a user i should able to click all tab WF
    Then user should able to click create icon WF
    Then user should able to create Engineering Schedule Doc With C4 Template Workflow WF
    Then as a user is should able to approve In ForAction Tab WF
    Then as a user is should able to click Approved Tab WF
    Then as a user is should able to Initiate C4 Template Workflow WF
    Then as a user i should able to click main menu in home page
    Then user should able to Click Respond Workflow in Main Menu
    Then as a user i should able to Select Doc
    Then user should able to click and open the doc
    Then user should able to click Selected Doc Close
    Then user should able to click WFAction
    Then user should able to Click Respond Workflow C4WfPage GeneralComment
    Then as a user i should able to Click WFAttach
    Then user should able to click BrowseFile Upload in Attach
    Then user should able to click TenderQty NotApplicable
    Then user should able to Click Respond Workflow DocCategory
    Then as a user i should able to Select DocApproved in DocCategory
    Then user should able to click WfApprove
    Then user should able to click CnfrmYes
    Then as a user is should able to check workflow history WF
    Then as a user i should able to Select Doc
    Then user should able to click and open the doc
    Then user should able to click Selected Doc Close
    Then user should able to click WFAction
    Then user should able to Click Respond Workflow C4WfPage GeneralComment
    Then as a user i should able to Click WFAttach
    Then user should able to click BrowseFile Upload in Attach
    #Then user should able to click TenderQty NotApplicable
    Then user should able to Click Respond Workflow DocCategory
    Then as a user i should able to Select DocApproved in DocCategory
    Then user should able to click WfApprove
    Then user should able to click CnfrmYes
    Then as a user is should able to Checking Inprogress SD workflow WF
    Then as a user is should able to check workflow history WF
    Then user should able to click Logout button

  @Respond_Workflow
  Scenario: Respond Workflow for Created Engineering Schedule Document
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click main menu in home page
    Then user should able to Click Respond Workflow in Main Menu
    Then as a user i should able to Select Doc
    Then user should able to click and open the doc
    Then user should able to click Selected Doc Close
    Then user should able to click WFAction
    #Then user should able to Click Respond Workflow C4WfPage GeneralComment
    Then as a user i should able to Click WFAttach
    Then user should able to click BrowseFile Upload in Attach
    #Then user should able to click TenderQty NotApplicable
    #Then user should able to Click Respond Workflow DocCategory
    #Then as a user i should able to Select DocApproved in DocCategory
    Then user should able to click WfApprove
    Then user should able to click CnfrmYes
    Then as a user is should able to Checking Inprogress SD workflow Revert WF
    Then as a user is should able to check workflow history WF
    Then as a user i should able to Select Doc
    Then user should able to click and open the doc
    Then user should able to click Selected Doc Close
    Then user should able to click WFAction
    Then user should able to Click Respond Workflow C4WfPage GeneralComment
    Then as a user i should able to Click WFAttach
    Then user should able to click BrowseFile Upload in Attach
    Then user should able to click TenderQty NotApplicable
    Then user should able to Click Respond Workflow DocCategory
    Then as a user i should able to Select DocApproved in DocCategory
    Then user should able to click WfApprove
    Then user should able to click CnfrmYes
    Then as a user is should able to Checking Inprogress SD workflow WF
    Then as a user is should able to check workflow history WF
    Then user should able to click Logout button

  @Respond_Workflow_CI_SD
  Scenario: Respond Workflow for Created Engineering Schedule Document
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click main menu in home page
    Then user should able to Click Respond Workflow in Main Menu
    Then as a user is should able to Checking Inprogress SD workflow WF
    Then as a user is should able to Create SD workflow Transmittal Template WF
    Then as a user is should able to check workflow history WF
    
    
   @Respond_Workflow_CreateGFC
  	Scenario: GFC WF for Created Engineering Schedule Document
	 Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    #Then as a user i should able to click main menu in home page
    #Then user should able to Click Engineering Schedule in Main Menu WF
    #Then as a user i should able to click all tab WF
    #Then user should able to click create icon WF
    #Then user should able to create Engineering Schedule Doc With GFC Workflow WF
    #Then as a user is should able to approve In ForAction Tab WF
    #Then as a user is should able to click Approved Tab WF
    #Then user should able to Initiate GFC Workflow In WF page
    Then as a user i should able to click main menu in home page
    Then user should able to Click Respond Workflow in Main Menu
    Then user should able to Take GFC CI Workflow Action in WF Page
    Then as a user is should able to check workflow history WF
    
    
    

  @Respond_Workflow_GFCWF
  Scenario: GFC Respond Workflow for Created Engineering Schedule Document
    Given as a user i should able to view EDMS home page
    #Then click otheruser login button
    #Then enter username and password
    #Then click Log in button
    #Then user should be able to login successfully
    #Then as a user i should able to click main menu in home page
    #Then user should able to Click Respond Workflow in Main Menu
    #Then user should able to Take GFC CI Workflow Action in WF Page
    #Then as a user is should able to check workflow history WF
    #Then user should able to click Logout button
    Then click otheruser login button
    Then enter usernamePk and passwordPk
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click main menu in home page
    Then user should able to Click Respond Workflow in Main Menu
    Then as a user i should able to Select Doc
    Then as a user is should able to check workflow history WF
    Then user should able to click WFAction
