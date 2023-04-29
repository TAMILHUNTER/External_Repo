@RegressionTesting @RateContract
Feature: Rate Contract Creation
  
  As a creator i should able to create Rate Contract

  @RateContractCreateSaveAsDraft
  Scenario: Create Rate Contract and save as draft 
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password 
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to open Rate Contract using create icon
    And user should able to select the job
    And user should able to select the rate contractors name
    And user should able to select the currency type
    And user should able to select the rc type
    And user should able to select the rc scope
    And user should able to select the effective Date
    And user should able to capture the reference number
    And user should able to select transport mode
    And user should able to capture the internal remarks
    And user should able to capture the external remarks
    And user should able to capture the additional charges
    And user should able to capture the terms and condtions
    And user should able to capture the vehicle Type
    And user should able to capture the min Guaranty Weight
    And user should able to capture the max Weight Capacity
    And user should able to select the from County
    And user should able to select the to Country
    And user should able to select the from State
    And user should able to select the to State
    And user should able to select the to City
    And user should able to select the from City
    And user should able to select the from Location
    And user should able to select the to Location
    And user should able to select the terrain Type
    And user should able to capture approxDistanceIn
    And user should able to capture rate Per Vehicle
    And user should able to capture approx Transit Hour
    And user should able to capture add Transport Details
    And user should able to capture payment Release
    And user should able to capture payment Events
    And user should able to capture referecne Value
    And user should able to capture credit Days
    And user should able to capture Payment Mode
    And user should able to capture Ref Date Value
    And user should able to capture lstDocumentList
    And user should able to capture selectAll
    And user should able to save the rc as saveDraft

  @RateContract_editandverify
  Scenario: Edit the Created RC and cross verify the captured information
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to edit saved Rate Contract
   # And user should prepopulated with the captured informatioins

  @RateContract_Create
  Scenario: Submit the Create Rate Contract
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to edit saved Rate Contract
    And user should able to submit the Rate Contract
    #And user submited Rate Contract status should updated with inprogress

  @ApproveCreatedRC
  Scenario: Approve the created Rate Contract
    Given As a user i should able to view the home page
    And As a approver i should able to login the RateContract
    And As a approver i should able to navigate to RateContract
    And As a approver i should able to approve the RateContract under foraction tab

  @ViewCreatedRC
    Scenario: ViewRC
    Given As a user i should able to view the home page
   And As user i should able to click otheruser login button
   And enter username and password
   And click Log in button
   And user should be able to login successfully
   And user should able to click main menu
   And user should able to enter main menu
   And user should able to navigate to Supply Chain Management
   And user should able to navigate to submenu Logistics
   And user should able to navigate to submenu Master
   And user should landed in Rate Contract
   And user should able to click the seach icon
 #	 And user should able to pass the document number to search
 	#		| LE/LE180046/TRC/22/000605 |
	# And user should able to click the search button
  #And user should able to find the related search result
  # Then as a user i should able to click and view the created RC.
    
  @RateContract_Create_And_Reject
  Scenario: Reject the created Rate Contract
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then user should able to create the Rate Contract
    Then user should able to save the rc as saveDraft
    Then user should able to edit saved Rate Contract
    Then user should able to submit the Rate Contract
    Then approver should able to reject the created RC

  @RateContract_Create_Cancel
  Scenario: Create Rate Contract and cancel
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to open Rate Contract using create icon
    And user should able to select the job
    And user should able to select the rate contractors name
    And user should able to select the currency type
    And user should able to select the rc type
    And user should able to select the rc scope
    And user should able to select the effective Date
    And user should able to capture the reference number
    And user should able to select transport mode
    And user should able to capture the internal remarks
    And user should able to capture the external remarks
    And user should able to capture the additional charges
    And user should able to capture the terms and condtions
    And user should able to capture the vehicle Type
    And user should able to capture the min Guaranty Weight
    And user should able to capture the max Weight Capacity
    And user should able to select the from County
    And user should able to select the to Country
    And user should able to select the from State
    And user should able to select the to State
    And user should able to select the to City
    And user should able to select the from City
    And user should able to select the from Location
    And user should able to select the to Location
    And user should able to select the terrain Type 
    And user should able to capture approxDistanceIn
    And user should able to capture rate Per Vehicle
    And user should able to capture approx Transit Hour
    And user should able to capture add Transport Details
    And user should able to capture payment Release
    And user should able to capture payment Events
    And user should able to capture referecne Value
    And user should able to capture credit Days
    And user should able to capture Payment Mode
    And user should able to capture Ref Date Value
    And user should able to capture lstDocumentList
    And user should able to capture selectAll
    And user should able to save the rc as saveDraft
    And user should able to cancel the created rate contract

  @RateContract_Create_Recall
  Scenario: Create Rate Contract and Recall
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then user should able to create the Rate Contract
    Then user should able to save the rc as saveDraft
    Then user should able to edit saved Rate Contract
    Then user should able to submit the Rate Contract
    And user should able to recall the created Rate Contract

  @LandingPageRateContract_tabs
  Scenario: Tabs Verifications
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then verify the landing page title
    Then verify the ForAction, Inprogress, Authorized, Expired and All tabs are displayed
    Then verify the users are able to navigate between the tabs

  @LandingPageRateContract_PageNavigation
  Scenario: PageNavigation Verifications
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then as a user i should able to click all tab
    Then as a user i should able to navigate to last page
    Then as a user i should able to navigate to first page
    Then as a user i should able to navigate to next page
    Then as a user i should able to navigate to previous page
    Then as a user is should able to click for action tab
    Then as a user i should able to navigate to last page
    Then as a user i should able to navigate to first page
    Then as a user i should able to navigate to next page
    Then as a user i should able to navigate to previous page
    Then as a user i should able to click inprogress tab
    Then as a user i should able to navigate to last page
    Then as a user i should able to navigate to first page
    Then as a user i should able to navigate to next page
    Then as a user i should able to navigate to previous page
    Then as a user i should able to click Authorized tab
    Then as a user i should able to navigate to last page
    Then as a user i should able to navigate to first page
    Then as a user i should able to navigate to next page
    Then as a user i should able to navigate to previous page

  
  @LandingPageRateContract_NumberofRecordsShow
  Scenario: Number of records to display verification
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then as a user i should able to click all tab
    Then as a user i should able to change choose number of records to view using show item dropdown

  @LandingPageRateContract_gridMinMax
  Scenario: Grind Min and Max
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then as a user i should able to min and max the grid

  @LandingPageRateContract_filter
  Scenario: Filter Rate Contract
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    And user should able to click the filter icon
    And user should able to pass the filter document number
      | LE/LE180046/TRC/22/000605 |
   # And user should able to find the related filtered result

  @LandingPageRateContract_SearchRateContract
  Scenario: Number of records to display verification
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    And user should able to click the seach icon
    And user should able to pass the search document number
      | LE/LE180046/TRC/22/000617 |
    And user should able to click the search button
    And user should able to find the related search result
    
    
  @RateContract_Mandatory_Field_Check
  Scenario: Rate Contract Mandatory Field check
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then user should able to open Rate Contract using create icon
    Then Verify error message are displayed if Essentials details are not captured
    Then Verify error message are displayed if Transportation Details are not captured
    Then Verify error message are displayed if payment terms are not captured upto 100%
    And user should able to capture payment Release
    And user should able to capture payment Events
    And user should able to capture referecne Value
    And user should able to capture credit Days
    And user should able to capture Payment Mode
    And user should able to capture Ref Date Value
    And user should able to capture lstDocumentList
   # And user should able to capture selectAll
   # And user should able to save the rc as saveDraft
  #  And user should able to cancel the created rate contract

  @RateContract_ActionIcons
  Scenario: Rate Contract Action Icons
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then user should able to click the seach icon
    Then user should able to pass the search document number
      | LE/LE160645/TRC/22/000001 |
    Then user should able to click the search button
    Then user should able to find the related search result
    Then verify drafted rc having edit, chat,attachmentView and cancell icon
    Then user should able to click the seach icon
    Then user should able to pass the search document number
      | LE/LE180046/TRC/22/000062 |
    Then user should able to click the search button
    Then user should able to find the related search result
    Then verify created rc having recall,workflowview,chat and attachmentview
    Then user should able to click the seach icon
    Then user should able to pass the search document number
      | LE/LE180046/TRC/22/000022 |
    Then user should able to click the search button
    Then user should able to find the related search result
    Then verify authorized rc having workflowview,chat and attachmentview

 
  @RateContract_workflow_Trace
  Scenario: Rate Contract workflow trace
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then user should able to click the seach icon
    Then user should able to pass the search document number
      | LE/LE180046/TRC/22/000620 |
    Then user should able to click the search button
    Then user should able to find the related search result
    Then verify able to view the workflow trace

  @RateContract_ApproverVerification
  Scenario: Approver Login Icon Verifications
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then Approver should able to enter username and password 
    Then click Log in button
    Then approver should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract 
    Then user should able to click the seach icon
    Then user should able to pass the search document number
      | LE/LE180046/TRC/22/000442 |
    Then user should able to click the search button
    Then user should able to find the related search result
 #   Then verify the approver icons approve, reject,edit,workflow,discussion and document view
 
  @RateContract_Verify_Landing_Page
  Scenario: Create and Verify Landing Page Details
    Given As a user i should able to view the home page
    Then As user i should able to click otheruser login button
    Then enter username and password
    Then click Log in button
    Then user should be able to login successfully
    Then user should able to click main menu
    Then user should able to enter main menu
    Then user should able to navigate to Supply Chain Management
    Then user should able to navigate to submenu Logistics
    Then user should able to navigate to submenu Master
    Then user should landed in Rate Contract
    Then user should able to create the Rate Contract
    Then user should able to save the rc as saveDraft
    Then user should able to edit saved Rate Contract
    Then user should able to submit the Rate Contract
    And verify Rc Number, RCDate, Rate Contract, RC Type,Effective From, Effective To, Currency, ReferenceNo, Status

  @ApproveLandingPage
  Scenario: Approver Landing Page Grid Details verification
    Given As a user i should able to view the home page
    And As a approver i should able to login the RateContract
    And As a approver i should able to navigate to RateContract
    And verify Rc Number, RCDate, Rate Contract, RC Type,Effective From, Effective To, Currency, ReferenceNo, Status

    
    
  @RateContractCreateSaveAsDraftRatePerMt
  Scenario: Create Rate Contract and save as draft(MT)
    Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to open Rate Contract using create icon
    And user should able to select the job
    And user should able to select the rate contractors name
    And user should able to select the currency type
    And user should able to select the rc type
    And user should able to select the rc scope
    And user should able to select the effective Date
    And user should able to capture the reference number
    And user should able to select transport mode
    And user should able to capture the internal remarks
    And user should able to capture the external remarks
    And user should able to capture the additional charges
    And user should able to capture the terms and condtions
    And user should able to capture the vehicle Type
    And user should able to capture the min Guaranty Weight
    And user should able to capture the max Weight Capacity
    And user should able to select the from County
    And user should able to select the to Country
    And user should able to select the from State
    And user should able to select the to State
    And user should able to select the to City
    And user should able to select the from City
    And user should able to select the from Location
    And user should able to select the to Location
    And user should able to select the terrain Type
    And user should able to capture approxDistanceIn
    And user should able to capture rate Per MT
    And user should able to capture approx Transit Hour
    And user should able to capture add Transport Details
    And user should able to capture payment Release
    And user should able to capture payment Events
    And user should able to capture referecne Value
    And user should able to capture credit Days
    And user should able to capture Payment Mode
    And user should able to capture Ref Date Value
    And user should able to capture lstDocumentList
    And user should able to capture selectAll
    And user should able to save the rc as saveDraft
	And user should able to edit saved Rate Contract
	And user should able to submit the Rate Contract
	And user submited Rate Contract status should updated with inprogress

	
	@RatePerMTVerification
  Scenario: Verify Created rc with Rate Per MT
		Given As a user i should able to view the home page
    And As user i should able to click otheruser login button
    And enter username and password
    And click Log in button
    And user should be able to login successfully
    And user should able to click main menu
    And user should able to enter main menu
    And user should able to navigate to Supply Chain Management
    And user should able to navigate to submenu Logistics
    And user should able to navigate to submenu Master
    And user should landed in Rate Contract
    And user should able to open Rate Contract using create icon
    And user should able to select the job
    And user should able to select the rate contractors name
    And user should able to select the currency type
    And user should able to select the rc type
    And user should able to select the rc scope
    And user should able to select the effective Date
    And user should able to capture the reference number
    And user should able to select transport mode
    And user should able to capture the internal remarks
    And user should able to capture the external remarks
    And user should able to capture the additional charges
    And user should able to capture the terms and condtions
    And user should able to capture the vehicle Type
    And user should able to capture the min Guaranty Weight
    And user should able to capture the max Weight Capacity
    And user should able to select the from County
    And user should able to select the to Country
    And user should able to select the from State
    And user should able to select the to State
    And user should able to select the to City
    And user should able to select the from City
    And user should able to select the from Location
    And user should able to select the to Location
    And user should able to select the terrain Type
    And user should able to capture approxDistanceIn
    And user should able to capture rate Per MT
    And user should able to capture approx Transit Hour
    And user should able to capture add Transport Details
    And user should able to capture payment Release
    And user should able to capture payment Events
    And user should able to capture referecne Value
    And user should able to capture credit Days
    And user should able to capture Payment Mode
    And user should able to capture Ref Date Value
    And user should able to capture lstDocumentList
    And user should able to capture selectAll
    And user should able to save the rc as saveDraft
		And user should able to edit saved Rate Contract
		And user should able to submit the Rate Contract
   Then user submited Rate Contract status should updated with inprogress
   Then user should able to click the seach icon
   #Then as a user i should able to click and view the created RC.
 
 
 
 
