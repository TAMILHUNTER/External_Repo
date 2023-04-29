@Regression_EDMS @RepositoryDocumentSmoke
Feature: Repository Document
  
  As a user after login i should able to create Repository Document.

  @RepositoryDocumentCreate @Menus
  Scenario: Create a New Repository Document
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then user should able to Switch and Select to Project Gandhi
    Then As a user i should able to click create button in Repository Doc
    Then As a user i should able to Select Discipline button in Repository Doc
    Then As a user i should able to Choose Area button in Repository Doc
    Then As a user i should able to capture Document type in Repository Doc
    Then As a user i should able to Choose Structure in Repository Doc
    Then As a user i should able to select PrintSize button in Repository Doc
    Then As a user i should able to capture Title type in Repository Doc
    Then As a user i should able to select Calendar Date in Repository Doc
    Then As a user i should able to Choose Status in Repository Doc
    Then As a user i should able to select Approved By in Repository Doc
    Then As a user i should able to capture Reference in Repository Doc
    Then As a user i should able to capture Comment in Repository Doc
    Then As a user i should able to click QRcode toggle in Repository Doc
    #Then choose FileLocColumn in Repo
    #Then choose Location in Repo
    #Then choose LocChennai in Repo
    #Then choose Building in Repo
    #Then choose BuildingTwr in Repo
    #Then choose Floor in Repo
    #Then select floor1 in Repo
    #Then click Rack Btn
    #Then choose RackQA in Repo
    #Then click Shelf in Repo
    #Then choose Shelf4 in Repo
    #Then choose FileNo in Repo
    Then As a user i should able to Save Created Doc in Repository Doc
    Then As a user i should able to Upload File Againt Created Doc in Repository Doc
    Then user should able to click Logout button

  @RepositoryDocumentReset @Menus
  Scenario: Create a New Repository Doc Reset & Cancel
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then user should able to Switch and Select to Project Gandhi
    Then As a user i should able to click create button in Repository Doc
    Then As a user i should able to Select Discipline button in Repository Doc
    Then As a user i should able to Choose Area button in Repository Doc
    Then As a user i should able to capture Document type in Repository Doc
    Then As a user i should able to Choose Structure in Repository Doc
    Then As a user i should able to select PrintSize button in Repository Doc
    Then As a user i should able to capture Title type in Repository Doc
    Then As a user i should able to select Calendar Date in Repository Doc
    Then As a user i should able to Choose Status in Repository Doc
    Then As a user i should able to select Approved By in Repository Doc
    Then As a user i should able to capture Reference in Repository Doc
    Then As a user i should able to capture Comment in Repository Doc
    Then As a user i should able to click QRcode toggle in Repository Doc
    #Then choose FileLocColumn in Repo
    #Then choose Location in Repo
    #Then choose LocChennai in Repo
    #Then choose Building in Repo
    #Then choose BuildingTwr in Repo
    #Then choose Floor in Repo
    #Then select floor1 in Repo
    #Then click Rack Btn
    #Then choose RackQA in Repo
    #Then click Shelf in Repo
    #Then choose Shelf4 in Repo
    #Then choose FileNo in Repo
    Then As a user i should able to Reset the Created Doc in Repository Doc
    Then As a user i should able to click Cancel Button in Repository Doc
    Then user should able to click Logout button

  @RepositoryDocumentCommonControl @Menus
  Scenario: Repository Document Common Control
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then As a user i should able to Navigate ApprovedTab in Repository Doc
    Then As a user i should able to Navigate RejectTab in Repository Doc
    Then As a user i should able to Navigate ForActionTab in Repository Doc
    Then As a user i should able to Navigate InprogressTab in Repository Doc
    Then As a user i should able to Navigate AllTab in Repository Doc
    Then Verify User can be able to Filter List of Records in Repository Doc
    Then Verify User can be able to Search List of Records in Repository Doc
    Then As a user i should able to switch MyDoc in Repository Doc
    Then As a user i should able to switch MyOrgDoc in Repository Doc
    Then As a user i should able to switch AllDoc in Repository Doc
    Then As a user i should able to Click Latest Revision toggle in Repository Doc
    Then As a user i should able to Download Excel sheet for Repository Doc
    Then As a user i should able to capture Viewdays in Repository Doc
    Then As a user i should able to Export Excel sheet for Repository Doc
    Then As a user i should able to click ShowNo Button in Repository Doc
    Then As a user i should able to capture PageExpand in Repository Doc
    #Then choose PageCollapse in Repo
    Then Verify As a user i should able to choose and switch Project in Repository Doc
    Then user should able to click Logout button

  @RepositoryDocument_Mandatory @Menus
  Scenario: Verify Mandatory field check
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then user should able to Switch and Select to Project Gandhi
    Then As a user i should able to click create button in Repository Doc
    Then As a user i should able to Verify Document Mandatory field check in Repository Doc
    Then As a user i should able to Verify Document Revision field check in Repository Doc
    Then user should able to click Logout button

  @RepositoryDocument_Mail 
  Scenario: Create a Mail againt Repository Doc
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then click DocMail in Repo
    Then click AttachFile Mail in Repo
    Then select Document for AttachMail in Repo
    Then click DocNumber AttachMail in Repo
    Then click MailAttachment Submit in Repo
    Then select ProjectCode Mail in Repo
    Then click DemoProject Mail in Repo
    Then click Discipline Mail in Repo
    Then select Discipline Architecture Mail in Repo
    Then click FromOrgMail in Repo
    Then click FromOrgLNT Mail in Repo
    Then select ToOrg Mail in Repo
    Then select ToOrg2 Mail in Repo
    Then click MsgSerialNo Mail in Repo
    Then click SerialNo Mail in Repo
    Then select MailType in Repo
    Then click Letter MailType in Repo
    Then click Confidential Toggle Mail in Repo
    Then select MsgGroup Mail in Repo
    Then click MsgGroupTest Mail in Repo
    Then click ResToggle Yes Mail in Repo
    Then select Subject Mail in Repo
    #   Then click Cmnt Mail in Repo
    Then click Doc_DeleteIn Mail in Repo
    Then select Mail Send in Repo
    # Then click MailSave Draft in Repo
    # Then click Mail AttachFiles in Repo
    #  Then select Email DocTable in Repo
    # Then click EMail Page in Repo
    # Then click Mail_in_Email in Repo
    # Then select Email_Transmittal in Repo
    #  Then select Email_Close in Repo
    Then user should able to click Logout button
    
  @RepositoryDocument_Mail_SaveAsDraft
  Scenario: Create And Save As Draft a Mail againt Repository Doc
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then click DocMail in Repo
    Then click AttachFile Mail in Repo
    Then select Document for AttachMail in Repo
    Then click DocNumber AttachMail in Repo
    Then click MailAttachment Submit in Repo
    Then select ProjectCode Mail in Repo
    Then click DemoProject Mail in Repo
    Then click Discipline Mail in Repo
    Then select Discipline Architecture Mail in Repo
    Then click FromOrgMail in Repo
    Then click FromOrgLNT Mail in Repo
    Then select ToOrg Mail in Repo
    Then select ToOrg2 Mail in Repo
    Then click MsgSerialNo Mail in Repo
    Then click SerialNo Mail in Repo
    Then select MailType in Repo
    Then click Letter MailType in Repo
    Then click Confidential Toggle Mail in Repo
    Then select MsgGroup Mail in Repo
    Then click MsgGroupTest Mail in Repo
    Then click ResToggle Yes Mail in Repo
    Then select Subject Mail in Repo
    #Then click Cmnt Mail in Repo
    Then click Doc_DeleteIn Mail in Repo
    #Then select Mail Send in Repo
    Then click MailSave Draft in Repo
    # Then click Mail AttachFiles in Repo
    #  Then select Email DocTable in Repo
    # Then click EMail Page in Repo
    # Then click Mail_in_Email in Repo
    # Then select Email_Transmittal in Repo
    #  Then select Email_Close in Repo
    Then user should able to click Logout button

  @RepositoryDocument_Mail_Mandatory 
  Scenario: Verify Mail Mandatory field check
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then Verify Mail Mandatory field check
    Then select Mail Send in Repo
    Then user should able to click Logout button


@RepositoryDocumentCreateWithoutDocUpload @Menus
  Scenario: Create a New Repository Document without document upload
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then user should able to Switch and Select to Project Gandhi
    Then As a user i should able to click create button in Repository Doc
    Then As a user i should able to Select Discipline button in Repository Doc
    Then As a user i should able to Choose Area button in Repository Doc
    Then As a user i should able to capture Document type in Repository Doc
    Then As a user i should able to Choose Structure in Repository Doc
    Then As a user i should able to select PrintSize button in Repository Doc
    Then As a user i should able to capture Title type in Repository Doc
    Then As a user i should able to select Calendar Date in Repository Doc
    Then As a user i should able to Choose Status in Repository Doc
    Then As a user i should able to select Approved By in Repository Doc
    Then As a user i should able to capture Reference in Repository Doc
    Then As a user i should able to capture Comment in Repository Doc
    Then As a user i should able to click QRcode toggle in Repository Doc
    #Then choose FileLocColumn in Repo
    #Then choose Location in Repo
    #Then choose LocChennai in Repo
    #Then choose Building in Repo
    #Then choose BuildingTwr in Repo
    #Then choose Floor in Repo
    #Then select floor1 in Repo
    #Then click Rack Btn
    #Then choose RackQA in Repo
    #Then click Shelf in Repo
    #Then choose Shelf4 in Repo
    #Then choose FileNo in Repo
    Then As a user i should able to Save Created Doc in Repository Doc
    Then user i should able to close the FileUpload popup in Repo
		Then user should able to click Logout button


  @RepositoryDocumentFileUpload @Menus
  Scenario: File upload in Inprogress tab Repository Document
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then Verify As a user i should able to Upload File Againt Created Doc in Repository Doc
    Then user should able to click Logout button
    
    @RepositoryDocumentFileUploadReject @Menus
  Scenario: File upload in Inprogress tab Repository Document
    Given as a user i should able to view EDMS home page
    Then click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter Repository Doc
    Then Verify As a user i should able to Reject Upload File Againt Created Doc in Repository Doc
    Then user should able to click Logout button
