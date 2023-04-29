@Transmittal @Regression_EDMS
Feature: Transmittal Template page
  
  As a user after login i should able to create New Transmittal againt the Created Document.

  @Create_NewTransmittal
  Scenario: Create New Transmittal in Main Menu Transmittal Page
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then as a user i should able to click main menu in home page TT
    Then user should able to Click Transmittal in Main Menu
    Then user should able to Click Create button in Transmittal page
    Then user should able to Click New Transmittal in Transmittal page
    Then user should able to Click TransmittalTemplate C4 in Transmittal page
    Then as a user is should able to click AttachFile in Transmittal
    #Then as a user is should able to select Document in AttachFile Transmittal
    Then as a user is should able to select Document Num in AttachFile Transmittal
    Then as a user is should able to click Submit the AttachFile Transmittal
    Then user should able to select Descipline TT in Transmittal page
    Then user should able to capture Architecture Desipline in Transmittal page
    Then user should able to select FromOrg in Transmittal page
    Then user should able to capture FromOrg Org1 in Transmittal page
    Then user should able to select ToOrg in Transmittal page
    Then user should able to capture ToOrg LNT in Transmittal page
    Then user should able to click Confidential Toggle in Transmittal page
    Then user should able to select Transmittal CC in Transmittal page
    Then user should able to select CC Praveen in Transmittal page
    Then user should able to click Transmittal ResponseYES in Transmittal page
    Then user should able to click Transmittal ResponseNO in Transmittal page
    Then user should able to capture CC GroupBy in Transmittal page
    Then user should able to select CC GroupBy Distribution in Transmittal page
    Then user should able to click CC GroupBy EDIT in Transmittal page
    Then user should able to capture Category CC in Transmittal page
    Then user should able to capture Category GdForConstruction CC in Transmittal page
    Then user should able to capture Type CC TT in Transmittal page
    Then user should able to capture Type SelectAll CC in Transmittal page
    Then user should able to capture Remarks CC in Transmittal page
    Then user should able to click Save button CC in Transmittal page
    #Then user should able to click Cancel CC in Transmittal page
    Then user should able to select AttachDoc TT in Transmittal page
    Then user should able to capture AttachDoc Qty in Transmittal page
    Then user should able to AttachDoc Category in Transmittal page
    Then user should able to select AttachDoc Category FI in Transmittal page
    Then user should able to select AttachDoc Type in Transmittal page
    Then user should able to capture AttachDoc TypeBox in Transmittal page
    #Then user should able to select AttachDoc TypeBox2 in Transmittal page
    #Then user should able to select AttachDoc TypeBox3 in Transmittal page
    #Then user should able to select AttachDoc TypeBox4 in Transmittal page
    Then user should able to capture Attach Remarks in Transmittal page
    #Then user should able to Click AttachDoc BulkUpload in Transmittal page
    Then user should able to Upload AttachDoc in Transmittal page
    Then user should able to click AttachDoc Save in Transmittal page
    Then user should able to Preview and Submit the Transmittal in Transmittal page
    Then user should able to click Logout button
    
    
  #@CreateTransmittal
  #Scenario: Create New Transmittal againt the Created Document
    #Given as a user i should able to view EDMS home page
    #Then click otheruser login button
    #Then enter username and password
    #Then click Log in button
    #Then user should be able to login successfully
    #Then as a user i should able to click main menu in home page TT
    #Then user should able to Click Transmittal in Main Menu
    #Then user should able to Click Create button in Transmittal page
    #Then as a user is should able to Create SD workflow Transmittal Template
    #Then user should able to click Logout button
