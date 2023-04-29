@AMSLogsheet
Feature: Verify the Logsheet Page

  Background: 
    Given Go to Test Environments

  Scenario: To verify the login functionality
    Then clicks the Otheruser button
    Then enters username
    Then enters password
    Then clicks the Login button
    Then clicks the profile button
    Then clicks the signout button


  Scenario: To verify the logsheet menu options
    Then clicks the Otheruser button
    Then enters username
    Then enters password
    Then clicks the Login button
    Then clicks the menu button
    Then move to the asset mgmt
    Then move to the AMS 4.0
    Then move to the Operations & Maintenance
    Then move to LogSheet
    Then clicks the profile button
    Then clicks the signout button
   
	
  Scenario: To verify the landing page
    Then clicks the Otheruser button
    Then enters username
    Then enters password
    Then clicks the Login button
    Then clicks the menu button
    Then move to the asset mgmt
    Then move to the AMS 4.0
    Then move to the Operations & Maintenance
    Then move to LogSheet
    Then select jobcode from dropdown
    Then select assetcode from dropdown
    Then select date from dropdown
    Then clicks go button
    Then clicks refresh button
    Then clicks the profile button
    Then clicks the signout button
    Then close the browser

  Scenario: To verify the icons in landing page
    Then clicks the Otheruser button
    Then enters username
    Then enters password
    Then clicks the Login button
    Then clicks the menu button
    Then move to the asset mgmt
    Then move to the AMS 4.0
    Then move to the Operations & Maintenance
    Then move to LogSheet
    Then select jobcode from dropdown
    Then select assetcode from dropdown
    Then select date from dropdown
    Then clicks go button
    Then clicks refresh button
    Then clicks i icon
    Then clicks iot icon
    Then clicks the profile button
    Then clicks the signout button

	Scenario: To verify asset information
    Then clicks the Otheruser button
    Then enters username
    Then enters password
    Then clicks the Login button
    Then clicks the menu button
    Then move to the asset mgmt
    Then move to the AMS 4.0
    Then move to the Operations & Maintenance
    Then move to LogSheet
    Then select jobcode from dropdown
    Then select assetcode from dropdown
    Then clicks i icon
    Then compare the values asset info with db
    Then close the connection