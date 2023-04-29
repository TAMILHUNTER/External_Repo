@Payment_Hold_Release

Feature: 	 FAS-Accounts Payable (290) UserStory: FAS-ACP-Payment Hold & Release (294 & 298)
*******************************************************************************************
UserStory: FAS-ACP-Payment Hold & Release (294 & 298)
**********************************************  
Description :  As a EIP User i should be able to Login EIP & Navigate to Payment Hold & Release page
**********************************************************************************************

@Login_Payment_Hold_Release
  Scenario: Verify User can be able to Login then Navigate to Payment Hold & Release page
  Description :  As a EIP User i should be able to Select Partner and verify Details
    Given user should be able to login Creator login username
    And user should able to Navigate to Menu Accounts Payable
    Then user should able to Navigate to Account Payment Hold Release page
   
@Payment_Hold
  Scenario: Verify User can be able to Hold The Doc Payment In ForAction Tab
  Description :  As a EIP User i should be able to Select Partner and verify Details
    Given user should be able to login Creator login username
    And user should able to Navigate to Menu Accounts Payable
    Then user should able to Navigate to Account Payment Hold Release page
    Then user should able to Click to Create hold Payment Hold Release page
    Then user should able to Click to Create Releaseble Dedutions Payment Hold Release page
    Then user should able to Click to Select Releaseble Dedutions Vendor Payment Hold Release page
    Then user should able to capture Releaseble Dedutions Date Payment Hold Release page
    Then user should able to Select INR Currency Releaseble Dedutions Payment Hold Release page
    #Then user should able to Search Document No Releaseble Dedutions Payment Hold Release page
    Then user should able to Click Search button Releaseble Dedutions Payment Hold Release page
    Then user should able to select first Doc Releaseble Dedutions Payment Hold Release page
    Then user should able to Click Post button Releaseble Dedutions Payment Hold Release page
    Then user should able to Capture HoldType Releaseble Dedutions Payment Hold Release page
    Then user should able to Send Hold Value Amount in Releaseble Dedutions Payment Hold Release page
    Then user should able to Select Submit button Releaseble Dedutions Payment Hold Release page

@Payment_Hold_DocVerify
  Scenario: Verify User can be able to View & Verify Payment Hold Doc in InProgress Tab
  Description :  As a EIP User i should be able to Select Partner and verify Details
    Given user should be able to login Creator login username
    And user should able to Navigate to Menu Accounts Payable
    Then user should able to Navigate to Account Payment Hold Release page
    Then user should able to navigate InProgress Tab Releaseble Dedutions Payment Hold Release page
    Then user should able to Verify Doc Releaseble Dedutions Payment Hold Release page
    #Then verified user can able to Release the hold payment value Releaseble Dedutions Payment Hold Release page
    #Then user should able to Verify Doc Releaseble Dedutions Payment Hold Release page

@Payment_Hold_UsingCart
  Scenario: Verify User can be able to Hold The Doc Payment using cart In ForAction Tab
  Description :  As a EIP User i should be able to Select Partner and verify Details
    Given user should be able to login Creator login username
    And user should able to Navigate to Menu Accounts Payable
    Then user should able to Navigate to Account Payment Hold Release page
    Then user should able to Click to Create hold Payment Hold Release page
    Then user should able to Click to Create Releaseble Dedutions Payment Hold Release page
    Then user should able to select Next in Releaseble Dedutions Payment Hold Release page
    Then user should able to Click to Select Releaseble Dedutions Vendor Payment Hold Release page
    Then user should able to capture Releaseble Dedutions Date Payment Hold Release page
    Then user should able to Select INR Currency Releaseble Dedutions Payment Hold Release page
    #Then user should able to Search Document No Releaseble Dedutions Payment Hold Release page
    Then user should able to Click Search button Releaseble Dedutions Payment Hold Release page
    Then user should able to select first Doc Releaseble Dedutions Payment Hold Release page
    Then user should able to Click Post button Releaseble Dedutions Payment Hold Release page
    Then user should able to Capture HoldType Releaseble Dedutions Payment Hold Release page
    Then user should able to Send Hold Value Amount in Releaseble Dedutions Payment Hold Release page
    Then user should able to Select Submit button Releaseble Dedutions Payment Hold Release page
    
    @DocHold_Payment_Release
    Scenario: Verify User can be able to View & Verify Payment Hold Doc in InProgress Tab
  Description :  As a EIP User i should be able to Select Partner and verify Details
    Given user should be able to login Creator login username
    And user should able to Navigate to Menu Accounts Payable
    Then user should able to Navigate to Account Payment Hold Release page
    Then user should able to navigate InProgress Tab Releaseble Dedutions Payment Hold Release page
     Then user should able to select Doc InProgress Tab Releaseble Dedutions Payment Hold Release page
    Then verified user can able to Release the hold payment value Releaseble Dedutions Payment Hold Release page
    Then user should able to Verify Doc Releaseble Dedutions Payment Hold Release page
    
    
   
