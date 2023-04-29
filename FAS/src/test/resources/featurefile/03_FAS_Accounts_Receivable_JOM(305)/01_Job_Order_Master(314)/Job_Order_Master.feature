@Job_Order_Master
Feature: FAS_Accounts_Receivable_JOM(305) User Story : Job_Order_Master(314)
  ******************************************************************************************
  User Story: Job_Order_Master(314)
  *******************************************************
  Description :  The user able to create the Job order for the particular job by using the Job order master page
  **********************************************************************************************

  @Verify_the_user_can_able_to_Login_in_EIP4.0
  Scenario: Verify the user can able to Login in EIP4
    Given Verify the user can be able to Login EIP4 with valid credentails
    Given Verify the user can be unable to Login EIP4 with invalid username
    Given Verify the user can be unable to Login EIP4 with invalid Password
    Given Verify the user if given incorrect username and password then the validation popup should shows like invalid credentials
    
  @Verify_user_can_be_able_to_Login_and_navigate_to_JOM_through_Search_manu
  Scenario: Verify user can be able to Login and navigate to JOM through Search manu
    Given Verify user can be able to Login and navigate to JOM through Search manu
    Given Verify search manu need to search based on the valid inputs given by user
    Given Verify search manu should not search if user given invalid inputs
    
    @Verify_user_can_be_able_to_Login_and_navigate_to_JOM_through_Access_based_manu
  Scenario: Verify user can be able to Login and navigate to JOM through Access based manu
    Given Verify user can be able to Login and navigate to Finance through Access based manu
    Given Verify whether the user can be able to navigate the Accountsreceivable through Access based manu
    Given Verify whether the user can be able to navigate the Master through Access based manu
    Given Verify whether the user can be able to navigate the Job Order Master page through Access based manu

  @Verify_the_user_able_to_Create_the_job_order_in_job_order_master_page_and_save_as_draft
  Scenario: Verify the user able to Create the job order in job order master page and save as draft
    Given Verify whether the user can be able to navigate the Job Order Master page through Access based manu
    Given Verify whether the user can be able select the job value in job order creation dropdown
    Given Verify user should be able to select the customer value based on the job dropdown
    Given Verify the user able to enter the customer order no value
    Given Verify the user able to select the customer order date
    Given Verify the user able to select the invoice type value by using the invoice type dropdown
    Given Verify the user can be able to enter the order value
    Given Verify the user can be able to select the currency type by using the currency type dropdown
    Given Verify the user can be able to select the pricing type by using the pricing type dropdown
    Given Verify whether the user can be able to create stage for job details
    Given Verify whether the user can be able to create consigneelink details
    Given Verify whether the user can be able to select the main group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for main group in invoice group details
    Given Verify whether the user can be able to enter the group description for main group in invoice group details
    Given Verify whether the user can be able to select the sub group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for sub group in invoice group details
    Given Verify whether the user can be able to enter the group description for sub group in invoice group details
    Given Verify whether the user can be able to enter the percentage for payment terms-other then advance details
    Given Verify whether the user can be able to select the event for payment terms-other then advance details by using event dropdown
    Given Verify whether the user can be able to select the Required document for payment terms-other then advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.days for payment terms-other then advance details
    Given Verify whether the user can be able to enter the remarks for payment terms-other then advance details
    Given Verify whether the user can be able to select the Advance type for contract terms-advance details by using Advance type dropdown
    Given Verify whether the user can be able to select the Required document for contract terms-advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.installments for contract terms-advance details
    Given Verify whether the user can be able to enter the Advance percentage or amount for contract terms-advance details
    Given Verify whether the user can be able to select the event for contract terms-advance details by using event dropdown
    Given Verify whether the user can be able to enter the no.of.credit days for contract terms-advance details
    Given Verify whether the user can be able to select the recovery type for contract terms-recovery releasable details by using recovery type dropdown
    Given Verify whether the user can be able to enter the Recovery percentage for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the Releasable date for contract terms-recovery releasable details
    Given Verify whether the user can be able to select the type for contract terms-recovery non releasable details by using type dropdown
    Given Verify whether the user can be able to enter the percentage for contract terms-recovery non releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery non releasable details
    Given Verify whether the user can be able to select the Activity for invoice process cycle details by using type Activity dropdown
    Given Verify whether the user can be able to enter the no.of.days for invoice process cycle details
    Given Verify whether the user can be able to enter the remarks for invoice process cycle details
    Given Verify whether the user can be able to save the entire job order created details by using the save as draft
    
    @Verify_the_user_able_to_Create_the_job_order_in_job_order_master_page_and_submit
  Scenario: Verify the user able to Create the job order in job order master page
    Given Verify whether the user can be able to navigate the Job Order Master page through Access based manu
    Given Verify whether the user can be able select the job value in job order creation dropdown
    Given Verify user should be able to select the customer value based on the job dropdown
    Given Verify the user able to enter the customer order no value
    Given Verify the user able to select the customer order date
    Given Verify the user able to select the invoice type value by using the invoice type dropdown
    Given Verify the user can be able to enter the order value
    Given Verify the user can be able to select the currency type by using the currency type dropdown
    Given Verify the user can be able to select the pricing type by using the pricing type dropdown
    Given Verify whether the user can be able to create stage for job details
    Given Verify whether the user can be able to create consigneelink details
    Given Verify whether the user can be able to select the main group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for main group in invoice group details
    Given Verify whether the user can be able to enter the group description for main group in invoice group details
    Given Verify whether the user can be able to select the sub group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for sub group in invoice group details
    Given Verify whether the user can be able to enter the group description for sub group in invoice group details
    Given Verify whether the user can be able to enter the percentage for payment terms-other then advance details
    Given Verify whether the user can be able to select the event for payment terms-other then advance details by using event dropdown
    Given Verify whether the user can be able to select the Required document for payment terms-other then advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.days for payment terms-other then advance details
    Given Verify whether the user can be able to enter the remarks for payment terms-other then advance details
    Given Verify whether the user can be able to select the Advance type for contract terms-advance details by using Advance type dropdown
    Given Verify whether the user can be able to select the Required document for contract terms-advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.installments for contract terms-advance details
    Given Verify whether the user can be able to enter the Advance percentage or amount for contract terms-advance details
    Given Verify whether the user can be able to select the event for contract terms-advance details by using event dropdown
    Given Verify whether the user can be able to enter the no.of.credit days for contract terms-advance details
    Given Verify whether the user can be able to select the recovery type for contract terms-recovery releasable details by using recovery type dropdown
    Given Verify whether the user can be able to enter the Recovery percentage for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the Releasable date for contract terms-recovery releasable details
    Given Verify whether the user can be able to select the type for contract terms-recovery non releasable details by using type dropdown
    Given Verify whether the user can be able to enter the percentage for contract terms-recovery non releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery non releasable details
    Given Verify whether the user can be able to select the Activity for invoice process cycle details by using type Activity dropdown
    Given Verify whether the user can be able to enter the no.of.days for invoice process cycle details
    Given Verify whether the user can be able to enter the remarks for invoice process cycle details
    Given Verify whether the user can be able to save and submit the entire job order created details by using the submit button
    
    @Verify_user_can_be_able_to_Login_and_create_the_Job_order_through_Search_manu
     Scenario: Verify user can be able to Login and create the Job order through Search manu
    Given Verify user can be able to Login and create the Job order through Search manu
    Given Verify whether the user can be able select the job value in job order creation dropdown
    Given Verify user should be able to select the customer value based on the job dropdown
    Given Verify the user able to enter the customer order no value
    Given Verify the user able to select the customer order date
    Given Verify the user able to select the invoice type value by using the invoice type dropdown
    Given Verify the user can be able to enter the order value
    Given Verify the user can be able to select the currency type by using the currency type dropdown
    Given Verify the user can be able to select the pricing type by using the pricing type dropdown
    Given Verify whether the user can be able to create stage for job details
    Given Verify whether the user can be able to create consigneelink details
    Given Verify whether the user can be able to select the main group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for main group in invoice group details
    Given Verify whether the user can be able to enter the group description for main group in invoice group details
    Given Verify whether the user can be able to select the sub group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for sub group in invoice group details
    Given Verify whether the user can be able to enter the group description for sub group in invoice group details
    Given Verify whether the user can be able to enter the percentage for payment terms-other then advance details
    Given Verify whether the user can be able to select the event for payment terms-other then advance details by using event dropdown
    Given Verify whether the user can be able to select the Required document for payment terms-other then advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.days for payment terms-other then advance details
    Given Verify whether the user can be able to enter the remarks for payment terms-other then advance details
    Given Verify whether the user can be able to select the Advance type for contract terms-advance details by using Advance type dropdown
    Given Verify whether the user can be able to select the Required document for contract terms-advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.installments for contract terms-advance details
    Given Verify whether the user can be able to enter the Advance percentage or amount for contract terms-advance details
    Given Verify whether the user can be able to select the event for contract terms-advance details by using event dropdown
    Given Verify whether the user can be able to enter the no.of.credit days for contract terms-advance details
    Given Verify whether the user can be able to select the recovery type for contract terms-recovery releasable details by using recovery type dropdown
    Given Verify whether the user can be able to enter the Recovery percentage for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the Releasable date for contract terms-recovery releasable details
    Given Verify whether the user can be able to select the type for contract terms-recovery non releasable details by using type dropdown
    Given Verify whether the user can be able to enter the percentage for contract terms-recovery non releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery non releasable details
    Given Verify whether the user can be able to select the Activity for invoice process cycle details by using type Activity dropdown
    Given Verify whether the user can be able to enter the no.of.days for invoice process cycle details
    Given Verify whether the user can be able to enter the remarks for invoice process cycle details
    Given Verify whether the user can be able to save the entire job order created details by using the save as draft
    
    @Verify_user_can_be_able_to_Login_and_create_the_Job_order_through_Access_based_manu
    Scenario: Verify user can be able to Login and create the Job order through Access based manu
    Given Verify whether the user can be able to navigate the Job Order Master page through Access based manu
    Given Verify whether the user can be able select the job value in job order creation dropdown
    Given Verify user should be able to select the customer value based on the job dropdown
    Given Verify the user able to enter the customer order no value
    Given Verify the user able to select the customer order date
    Given Verify the user able to select the invoice type value by using the invoice type dropdown
    Given Verify the user can be able to enter the order value
    Given Verify the user can be able to select the currency type by using the currency type dropdown
    Given Verify the user can be able to select the pricing type by using the pricing type dropdown
    Given Verify whether the user can be able to create stage for job details
    Given Verify whether the user can be able to create consigneelink details
    Given Verify whether the user can be able to select the main group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for main group in invoice group details
    Given Verify whether the user can be able to enter the group description for main group in invoice group details
    Given Verify whether the user can be able to select the sub group by using group tag in invoice group details
    Given Verify whether the user can be able to enter the group code for sub group in invoice group details
    Given Verify whether the user can be able to enter the group description for sub group in invoice group details
    Given Verify whether the user can be able to enter the percentage for payment terms-other then advance details
    Given Verify whether the user can be able to select the event for payment terms-other then advance details by using event dropdown
    Given Verify whether the user can be able to select the Required document for payment terms-other then advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.days for payment terms-other then advance details
    Given Verify whether the user can be able to enter the remarks for payment terms-other then advance details
    Given Verify whether the user can be able to select the Advance type for contract terms-advance details by using Advance type dropdown
    Given Verify whether the user can be able to select the Required document for contract terms-advance details by using Required document checkbox
    Given Verify whether the user can be able to enter the no.of.installments for contract terms-advance details
    Given Verify whether the user can be able to enter the Advance percentage or amount for contract terms-advance details
    Given Verify whether the user can be able to select the event for contract terms-advance details by using event dropdown
    Given Verify whether the user can be able to enter the no.of.credit days for contract terms-advance details
    Given Verify whether the user can be able to select the recovery type for contract terms-recovery releasable details by using recovery type dropdown
    Given Verify whether the user can be able to enter the Recovery percentage for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery releasable details
    Given Verify whether the user can be able to enter the Releasable date for contract terms-recovery releasable details
    Given Verify whether the user can be able to select the type for contract terms-recovery non releasable details by using type dropdown
    Given Verify whether the user can be able to enter the percentage for contract terms-recovery non releasable details
    Given Verify whether the user can be able to enter the starting invoice number for contract terms-recovery non releasable details
    Given Verify whether the user can be able to select the Activity for invoice process cycle details by using type Activity dropdown
    Given Verify whether the user can be able to enter the no.of.days for invoice process cycle details
    Given Verify whether the user can be able to enter the remarks for invoice process cycle details
    Given Verify whether the user can be able to save the entire job order created details by using the save as draft
    
    
      @Verify_the_user_able_to_Edit_the_job_order_in_job_order_master_page
  Scenario: Verify the user able to edit the job order in job order master page
    Given Verify whether the user can be able to navigate the Job Order Master page through Access based manu
    Given Verify whether the user can be able to filter the created job order by using job order number
    Given Verify whether the user can be able to enter the created job order number
    Given Verify whether the user can be able to edit the created job order by using job order number
    Given Verify whether the user can be able to edit the customer order number in job order
    Given Verify the user able to edit the customer order date in job order
    Given Verify the user can be able to edit the order value in job order
    Given Verify the user can be able to clear the pricing value in job order
    Given Verify the user can be able to edit the pricing value by using pricing dropdown in job order
    Given Verify the user can be able to edit the pricing value in job order
    Given Verify whether the user can be able to Edit stage for job details
    Given Verify whether the user can be able to edit percentage for stage details
    Given Verify whether the user can be able to edit remarks for stage details
    Given Verify whether the user can be able to edit percentages for stage details
    Given Verify whether the user can be able to edit remarks and save for stage details
    Given Verify whether the user can be able to edit consigneelink details
    Given Verify whether the user can be able to edit the group description for main group in invoice group details
    Given Verify whether the user can be able to edit the group description for sub group in invoice group details
  

  
