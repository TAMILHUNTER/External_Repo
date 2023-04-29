package stepdefinition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import object_repository.Locators.CreateRCObjects;
import repository.Actions.CommonControlActions;
import repository.Actions.CreateRCAction;
import repository.Actions.LoginActions;
import repository.Actions.MandatoryFieldChecksRC;

public class CreateRC {
	public CreateRC() {
		PageFactory.initElements(Webdriver.driver, CreateRCObjects.class);
	}
	
	@Given("^user should able to open Rate Contract using create icon$") 
	public void user_should_able_to_open_Rate_Contract_using_create_icon() throws Throwable {
		CreateRCAction.createRC();	
	}   
	@Given("^user should able to select the job$")
	public void user_should_able_to_select_the_job() throws Throwable {
		CreateRCAction.selectJob(); 
	}    
	@Given("^user should able to select the rate contractors name$")
	public void user_should_able_to_select_the_rate_contractors_name() throws Throwable {
		CreateRCAction.selectRateContractorsName();     
	}
	
	@Given("^user should able to select the rc type$")
	public void user_should_able_to_select_the_rc_type() throws Throwable {
		CreateRCAction.selectRCType();
	}
	
	@Given("^user should able to select the rc scope$")
	public void user_should_able_to_select_the_rc_scope() throws Throwable {
		CreateRCAction.selectRcScope();      
	}
	
	@Given("^user should able to select the effective Date$")
	public void user_should_able_to_select_the_effective_Date() throws Throwable {
		CreateRCAction.selectEffectiveDate();
	}
	
	@Given("^user should able to capture the reference number$")
	public void user_should_able_to_capture_the_reference_number() throws Throwable {
		CreateRCAction.captureReferenceNumber();
	}
	
	@Given("^user should able to select the currency type$")
	public void user_should_able_to_select_the_currency_type() throws Throwable {
	    CreateRCAction.selectCurrencyType();
	}
	
	@Given("^user should able to select transport mode$")
	public void user_should_able_to_select_transport_mode() throws Throwable {
		CreateRCAction.selectTransportMode();
	}
	
	@Given("^user should able to capture the internal remarks$")
	public void user_should_able_to_capture_the_internal_remarks() throws Throwable {
		CreateRCAction.captureTheInternalRemarks();
	}
	
	@Given("^user should able to capture the external remarks$")
	public void user_should_able_to_capture_the_external_remarks() throws Throwable {
		CreateRCAction.captureExternalRemarks();      
		}
	
	@Given("^user should able to capture the additional charges$")
	public void user_should_able_to_capture_the_additional_charges() throws Throwable {
		CreateRCAction.additionCharges();
	}
	
	@Given("^user should able to capture the terms and condtions$")
	public void user_should_able_to_capture_the_terms_and_condtions() throws Throwable {
	    CreateRCAction.termsandCondition();  
	}
	
	@Given("^user should able to capture the vehicle Type$")
	public void user_should_able_to_capture_the_vehicle_Type() throws Throwable {
	      CreateRCAction.vehicleType();
	}
	
	@Given("^user should able to capture the min Guaranty Weight$")
	public void user_should_able_to_capture_the_min_Guaranty_Weight() throws Throwable {
		CreateRCAction.minGuarantyWeight();
	}
	
	@Given("^user should able to capture the max Weight Capacity$")
	public void user_should_able_to_capture_the_max_Weight_Capacity() throws Throwable {
		CreateRCAction.maxWeightCapacity();
	}
	
	@Given("^user should able to select the from County$")
	public void user_should_able_to_select_the_from_County() throws Throwable {
		CreateRCAction.fromCounty();
	}
	
	@Given("^user should able to select the to Country$")
	public void user_should_able_to_select_the_to_Country() throws Throwable {
		CreateRCAction.toCountry();
	}
	
	@Given("^user should able to select the from State$")
	public void user_should_able_to_select_the_from_State() throws Throwable {
		CreateRCAction.fromState();
	}
	
	@Given("^user should able to select the to State$")
	public void user_should_able_to_select_the_to_State() throws Throwable {
		CreateRCAction.toState(); 
	}
	
	@Given("^user should able to select the to City$")
	public void user_should_able_to_select_the_to_City() throws Throwable {
		CreateRCAction.toCity();
	}
	
	@Given("^user should able to select the from City$")
	public void user_should_able_to_select_the_from_City() throws Throwable {
	      CreateRCAction.fromCity();
	}
	
	@Given("^user should able to select the from Location$")
	public void user_should_able_to_select_the_from_Location() throws Throwable {
	      CreateRCAction.fromLocation();
	}
	
	@Given("^user should able to select the to Location$")
	public void user_should_able_to_select_the_to_Location() throws Throwable {
		CreateRCAction.toLocation();
	}
	
	@Given("^user should able to select the terrain Type$")
	public void user_should_able_to_select_the_terrain_Type() throws Throwable {
		CreateRCAction.terrainType();
	}
	
	@Given("^user should able to capture approxDistanceIn$")
	public void user_should_able_to_capture_approxDistanceIn() throws Throwable {
	      CreateRCAction.approxDistanceIn();
	}
	
	@Given("^user should able to capture rate Per Vehicle$")
	public void user_should_able_to_capture_rate_Per_Vehicle() throws Throwable {
	      CreateRCAction.ratePerMT();
	}
	
	@Given("^user should able to capture approx Transit Hour$")
	public void user_should_able_to_capture_approx_Transit_Hour() throws Throwable {
	     CreateRCAction.approxTransitHour(); 
	}
	
	@Given("^user should able to capture add Transport Details$")
	public void user_should_able_to_capture_add_Transport_Details() throws Throwable {
	      CreateRCAction.addTransportDetails();
	}
	
	@Given("^user should able to capture payment Release$")
	public void user_should_able_to_capture_payment_Release() throws Throwable {
	      CreateRCAction.paymentRelease();
	}
	
	@Given("^user should able to capture payment Events$")
	public void user_should_able_to_capture_payment_Events() throws Throwable {
	      CreateRCAction.paymentEvents();
	}
	
	@Given("^user should able to capture referecne Value$")
	public void user_should_able_to_capture_referecne_Value() throws Throwable {
		CreateRCAction.referecneValue();
	}
	
	@Given("^user should able to capture credit Days$")
	public void user_should_able_to_capture_credit_Days() throws Throwable {
		CreateRCAction.creditDays();
	}
	
	@Given("^user should able to capture Payment Mode$")
	public void user_should_able_to_capture_Payment_Mode() throws Throwable {
		CreateRCAction.PaymentMode();
	}
	 
	@Given("^user should able to capture Ref Date Value$")
	public void user_should_able_to_capture_Ref_Date_Value() throws Throwable {
		CreateRCAction.RefDateValue();
	}
	 
	@Given("^user should able to capture lstDocumentList$")
	public void user_should_able_to_capture_lstDocumentList() throws Throwable {
		CreateRCAction.lstDocumentList(); 
	} 
	
	@Given("^user should able to capture selectAll$")
	public void user_should_able_to_capture_selectAll() throws Throwable {
	      CreateRCAction.selectAll();
	}
	
	@Given("^user should able to save the rc as saveDraft$")
	public void user_should_able_to_save_the_rc_as_saveDraft() throws Throwable {
	      CreateRCAction.saveDraft();      
	}
	
	@Given("^user should able to edit saved Rate Contract$")
	public void user_should_able_to_edit_saved_Rate_Contract() throws Throwable {
	    CreateRCAction.editCreatedRateContract();
	}
	
	@Given("^user should prepopulated with the captured informatioins$")
	public void user_should_prepopulated_with_the_captured_informatioins() throws Throwable {
		 CreateRCAction.verifyTheCapturedRateContract();
	}
	
	@Given("^user should able to submit the Rate Contract$")
	public void user_should_able_to_submit_the_Rate_Contract() throws Throwable {
	    CreateRCAction.submitRateContract();
	}
	
	@Given("^user submited Rate Contract status should updated with inprogress$")
	public void user_submited_Rate_Contract_status_should_updated_with_inprogress() throws Throwable {
	    CreateRCAction.verifySubmitedRateContractStatus();
	}
	
	@Given("^Verify error message are displayed if Essentials details are not captured$")
	public void verify_error_message_are_displayed_if_Essentials_details_are_not_captured() throws Throwable {
		MandatoryFieldChecksRC.essentialsDetails();
	}
	
	@Given("^Verify error message are displayed if Transportation Details are not captured$")
	public void verify_error_message_are_displayed_if_Transportation_Details_are_not_captured() throws Throwable {
		MandatoryFieldChecksRC.TransportDetails();
	}
	
	@Given("^Verify error message are displayed if payment terms are not captured upto (\\d+)%$")
	public void verify_error_message_are_displayed_if_payment_terms_are_not_captured_upto(int arg1) throws Throwable {
		MandatoryFieldChecksRC.paymentTerms();
		CreateRCObjects.saveDraft.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Payment Terms should not be less than 100 %", CreateRCObjects.ErrorMessage.getText());
	    CreateRCObjects.ok.click();
	}
	
	@Given("^verify drafted rc having edit, chat,attachmentView and cancell icon$")
	public void verify_drafted_rc_having_edit_chat_attachmentView_and_cancell_icon() throws Throwable {
		CreateRCObjects.forAction.click();
		CreateRCObjects.refresh.click();
		assertEquals(true,CreateRCObjects.edit.isEnabled());
		assertEquals(true,CreateRCObjects.chat.isEnabled());
	    assertEquals(true, CreateRCObjects.attachmentViewer.isEnabled());
	    assertEquals(true,CreateRCObjects.cancel.isEnabled());
	}
	
	@Given("^verify created rc having recall,workflowview,chat and attachmentview$")
	public void verify_created_rc_having_recall_workflowview_chat_and_attachmentview() throws Throwable {
		CreateRCObjects.inprogress.click();
	    CreateRCObjects.refresh.click();
	    assertEquals(true,CreateRCObjects.recall.isEnabled());
	    assertEquals(true,CreateRCObjects.chat.isEnabled());
	    assertEquals(true, CreateRCObjects.attachmentViewer.isEnabled());
	    assertEquals(true,CreateRCObjects.viewWorkflow.isEnabled());
	}
	
	@Given("^verify authorized rc having workflowview,chat and attachmentview$")
	public void verify_authorized_rc_having_workflowview_chat_and_attachmentview() throws Throwable {
		CreateRCObjects.authorized.click();
		CreateRCObjects.refresh.click();
		assertEquals(true,CreateRCObjects.chat.isEnabled());
	    assertEquals(true, CreateRCObjects.attachmentViewer.isEnabled());
	    assertEquals(true,CreateRCObjects.viewWorkflow.isEnabled());
	}
	
	@Given("^verify expired rc having workflowview,chat and attachmentview$")
	public void verify_expired_rc_having_workflowview_chat_and_attachmentview() throws Throwable {
		CreateRCObjects.expired.click();
		assertEquals(true,CreateRCObjects.edit.isEnabled());
		assertEquals(true,CreateRCObjects.chat.isEnabled());
	    assertEquals(true, CreateRCObjects.attachmentViewer.isEnabled());
	    assertEquals(true,CreateRCObjects.viewWorkflow.isEnabled());
	}
	@Given("^user should able to cancel the created rate contract$")
	public void user_should_able_to_cancel_the_created_rate_contract() throws Throwable {
	    CreateRCAction.cancelRateContract();
	}
	@Given("^user should able to recall the created Rate Contract$")
	public void user_should_able_to_recall_the_created_Rate_Contract() throws Throwable {
		CreateRCAction.recall();
	} 
	
	@Given("^verify able to view the workflow trace$")
	public void verify_able_to_view_the_workflow_trace() throws Throwable {
	    CreateRCObjects.viewWorkflow.click();
	    CreateRCObjects.workflowHistoryExpand.click();
	    WebDriverWait wait=new WebDriverWait(Webdriver.driver, 5000);
	    wait.until(ExpectedConditions.textToBePresentInElement(CreateRCObjects.createrStatus, "Completed"));
	    assertEquals("History", CreateRCObjects.workflowHistory.getText());
	    assertEquals("KARTHIKEYAN S", CreateRCObjects.creater.getText());
	    assertEquals("RAJASEKARAN K", CreateRCObjects.approver.getText());
	    assertEquals("Completed", CreateRCObjects.createrStatus.getText());
	    assertEquals("Initiator", CreateRCObjects.createrActionStatus.getText());
	    assertEquals("Workflow Initiated", CreateRCObjects.createrActionRemarks.getText());
//	    assertEquals("approve", CreateRCObjects.approverActionRemarks.getText());
//	    assertEquals("Approved", CreateRCObjects.approverActionStatus.getText());
//	    assertEquals("Completed", CreateRCObjects.approverrStatus.getText());
	} 
	@Given("^user should able to create the Rate Contract$")
	public void user_should_able_to_create_the_Rate_Contract() throws Throwable {
		CreateRCAction.createRC();
		CreateRCAction.selectJob();
		CreateRCAction.selectRateContractorsName();
		CreateRCAction.selectRCType();
		CreateRCAction.selectRcScope();
		CreateRCAction.selectEffectiveDate();
		CreateRCAction.captureReferenceNumber();
		CreateRCAction.selectCurrencyType();
		CreateRCAction.selectTransportMode();
		CreateRCAction.captureTheInternalRemarks();
		CreateRCAction.captureExternalRemarks();
		CreateRCAction.additionCharges();
		CreateRCAction.termsandCondition();
		CreateRCAction.vehicleType();
		CreateRCAction.minGuarantyWeight();
		CreateRCAction.maxWeightCapacity();
		CreateRCAction.fromCounty();
		CreateRCAction.toCountry();
		CreateRCAction.fromState();
		CreateRCAction.toState();
		CreateRCAction.fromCity();
		CreateRCAction.toCity();
		CreateRCAction.fromLocation();
		CreateRCAction.toLocation();
		CreateRCAction.terrainType();
		CreateRCAction.approxDistanceIn();
		CreateRCAction.ratePerMT();
		CreateRCAction.approxTransitHour();
		CreateRCAction.addTransportDetails();
		CreateRCAction.paymentRelease();
		CreateRCAction.paymentEvents();
		CreateRCAction.referecneValue();
		CreateRCAction.creditDays();
		CreateRCAction.PaymentMode();
		CreateRCAction.RefDateValue();
		CreateRCAction.lstDocumentList();
		CreateRCAction.selectAll();
	} 
	
	@Given("^approver should able to reject the created RC$")
	public void approver_should_able_to_reject_the_created_RC() throws Throwable {
		CreateRCObjects.profileIcon.click();
		CreateRCObjects.signOut.click();
		CreateRCAction.rejectRC();
		CreateRCAction.approverMenu();
		CreateRCAction.rejectFromForActionTab();
	}
	
	@Then("^Approver should able to enter username and password$")
	public void approver_should_able_to_enter_username_and_password() throws Throwable {
	    LoginActions.approver();
	}
	
	@Then("^verify the approver icons approve, reject,edit,workflow,discussion and document view$")
	public void verify_the_approver_icons_approve_reject_edit_workflow_discussion_and_document_view() throws Throwable {
		assertEquals(true, CreateRCObjects.viewWorkflowIcon.isDisplayed());
		assertEquals(true, CreateRCObjects.attachmentView.isDisplayed());
		assertEquals(true, CreateRCObjects.discussion.isDisplayed());
		CreateRCObjects.forAction.click();
		assertEquals(true, CreateRCObjects.approveIcon.isDisplayed());
		assertEquals(true, CreateRCObjects.rejectIcon.isDisplayed());	
	}
	
	@Then("^verify Rc Number, RCDate, Rate Contract, RC Type,Effective From, Effective To, Currency, ReferenceNo, Status$")
	public void verify_Rc_Number_RCDate_Rate_Contract_RC_Type_Effective_From_Effective_To_Currency_ReferenceNo_Status() throws Throwable {
	    CreateRCAction.landingPageVerification();
	}
	@Given("^user should able to capture rate Per MT$")
	public void user_should_able_to_capture_rate_Per_MT() throws Throwable {
	    CreateRCAction.ratePerMT();
	}
	@Then("^verify user is able to click the view attachment icon$")
	public void verify_user_is_able_to_click_the_view_attachment_icon() throws Throwable {
	   CommonControlActions.fileDownload();
	   
	}

	@Then("^verify user is able to download the attachment$")
	public void verify_user_is_able_to_download_the_attachment() throws Throwable {
	   
	}

	@Then("^verify the downloaded file$")
	public void verify_the_downloaded_file() throws Throwable {
	   
	}

	@Then("^as a user i should able to click all tab$")
	public void as_a_user_i_should_able_to_click_all_tab() throws Throwable {
		CommonControlActions.allTab();     
	} 
	 
	@Then("^as a user i should able to navigate to last page$")
	public void as_a_user_i_should_able_to_navigate_to_last_page() throws Throwable {
		CommonControlActions.lastPage();
	}
	
	@Then("^as a user i should able to navigate to first page$")
	public void as_a_user_i_should_able_to_navigate_to_first_page() throws Throwable {
		CommonControlActions.firstPage();
	}
	
	@Then("^as a user i should able to navigate to next page$")
	public void as_a_user_i_should_able_to_navigate_to_next_page() throws Throwable {
		CommonControlActions.nextPage();
	}
	 
	@Then("^as a user i should able to navigate to previous page$")
	public void as_a_user_i_should_able_to_navigate_to_previous_page() throws Throwable {
		CommonControlActions.previousPage();    
	} 
}
