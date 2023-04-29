package stepdefinition;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Then;
import object_repository.Locators.CommonControlObject;
import repository.Actions.CommonControlActions;
import repository.Actions.CreateRCAction;
import repository.Actions.RateContractViewPageActions;

public class ViewRC {
	RateContractViewPageActions viewrc=new RateContractViewPageActions();
	@Then("^as a user i should able to click and view the created RC\\.$")  
	public void as_a_user_i_should_able_to_click_and_view_the_created_RC() throws Throwable {
		CreateRCAction.verifyCreatedRC();
	} 

	@Then("^verify the landing page title$")
	public void verify_the_landing_page_title() throws Throwable {
	      assertEquals("Transport Rate Contract", CommonControlObject.landingPageTitle.getText());     
	}  

	@Then("^verify the ForAction, Inprogress, Authorized, Expired and All tabs are displayed$")
	public void verify_the_ForAction_Inprogress_Authorized_Expired_and_All_tabs_are_displayed() throws Throwable {
	     assertEquals(true, CommonControlObject.all.isDisplayed());
	     assertEquals(true, CommonControlObject.forAction.isDisplayed());
	     assertEquals(true, CommonControlObject.inprogress.isDisplayed());
	     assertEquals(true, CommonControlObject.expired.isDisplayed());
	     assertEquals(true, CommonControlObject.authorized.isDisplayed());
	}
 
	@Then("^verify the users are able to navigate between the tabs$")
	public void verify_the_users_are_able_to_navigate_between_the_tabs() throws Throwable {
		  CommonControlActions.allTab();
	      CommonControlActions.forActionTab();
	      CommonControlActions.inProgressTab();
	      CommonControlActions.authorizedTab();
	      CommonControlActions.expiredTab();
	}
	/*@Then("^as a user i should able to click all tab$")
	public void as_a_user_i_should_able_to_click_all_tab() throws Throwable {
		CommonControlActions.allTab();     
	}*/
 
	/*@Then("^as a user i should able to navigate to last page$")
	public void as_a_user_i_should_able_to_navigate_to_last_page() throws Throwable {
		CommonControlActions.lastPage();
	}*/

	/*@Then("^as a user i should able to navigate to first page$")
	public void as_a_user_i_should_able_to_navigate_to_first_page() throws Throwable {
		CommonControlActions.firstPage();
	}*/

	/*@Then("^as a user i should able to navigate to next page$")
	public void as_a_user_i_should_able_to_navigate_to_next_page() throws Throwable {
		CommonControlActions.nextPage();
	}
	 */
	/*@Then("^as a user i should able to navigate to previous page$")
	public void as_a_user_i_should_able_to_navigate_to_previous_page() throws Throwable {
		CommonControlActions.previousPage();    
	}*/
	
	@Then("^as a user is should able to click for action tab$")
	public void as_a_user_is_should_able_to_click_for_action_tab() throws Throwable {
	      CommonControlActions.forActionTab();
	}

	@Then("^as a user i should able to click inprogress tab$")
	public void as_a_user_i_should_able_to_click_inprogress_tab() throws Throwable {
	    CommonControlActions.inProgressTab();
	}

	@Then("^as a user i should able to click Authorized tab$")
	public void as_a_user_i_should_able_to_click_Authorized_tab() throws Throwable {
		 CommonControlActions.authorizedTab();
	}

	@Then("^as a user i should able to navigate to Expired page$")
	public void as_a_user_i_should_able_to_navigate_to_Expired_page() throws Throwable {
		CommonControlActions.expiredTab();
	}
	
	@Then("^as a user i should able to change choose number of records to view using show item dropdown$")
	public void as_a_user_i_should_able_to_change_choose_number_of_records_to_view_using_show_item_dropdown() throws Throwable {
	    CommonControlActions.NumberOfItems();
	}
	
	@Then("^as a user i should able to min and max the grid$")
	public void as_a_user_i_should_able_to_min_and_max_the_grid() throws Throwable {
		CommonControlActions.gridMinAndMax();
	}
	@Then("^verify the created rate contract with rate type as Rate Per MT$")
	public void verify_the_created_rate_contract_with_rate_type_as_Rate_Per_MT() throws Throwable {
	   
	}
	
	@Then("^as a user i should able to attach a file using attachment icon$")
	public void as_a_user_i_should_able_to_attach_a_file_using_attachment_icon() throws Throwable {
		CreateRCAction.uploadAttachment();
	}
	@Then("^as a user i should able to search the document to attach a file$")
	public void as_a_user_i_should_able_to_search_the_document_to_attach_a_file() throws Throwable {
	   CommonControlActions.fileUpload();
	   
	}
	/*@Then("^verify user is able to click the view attachment icon$")
	public void verify_user_is_able_to_click_the_view_attachment_icon() throws Throwable {
	    
	}
*/
	/*@Then("^verify user is able to download the attachment$")
	public void verify_user_is_able_to_download_the_attachment() throws Throwable {
	   
	}*/

	/*@Then("^verify the downloaded file$")
	public void verify_the_downloaded_file() throws Throwable {
	   
	}*/
} 
  