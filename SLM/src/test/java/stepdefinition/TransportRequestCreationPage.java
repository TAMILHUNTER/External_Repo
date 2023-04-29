package stepdefinition;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import object_repository.Locators.CommonControlObject;
import object_repository.Locators.TransportRequestObjects;
import repository.Actions.DocumentSelections;
import repository.Actions.TransportRequestCreationPageActions;

public class TransportRequestCreationPage {
	/*private static final String JavascriptExecutor = null;*/
	WebDriverWait wait=new WebDriverWait(Webdriver.driver, 5000);
	@Then("^As a user i should able to select from job$")
	public void as_a_user_i_should_able_to_select_from_job(DataTable fromjob) throws Throwable {
		List<String> fromJob=fromjob.asList(String.class);
		TransportRequestCreationPageActions.selectFromjob(fromJob.get(0));
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.fromJobClick));
		TransportRequestObjects.fromJobClick.click();
		Thread.sleep(3000);
		TransportRequestObjects.fromJobClick.sendKeys("LE180046 - Raheja");
		Thread.sleep(2000);
		TransportRequestObjects.fromJobClick.sendKeys(Keys.TAB);
		
	}

	@Then("^As a user i should able to select from warehouse$")
	public void as_a_user_i_should_able_to_select_from_warehouse(DataTable fromWareHouse) throws Throwable {
		List<String> fromwareHouse=fromWareHouse.asList(String.class);
		TransportRequestCreationPageActions.selectFromWareHouse(fromwareHouse.get(0));	
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.fromWarehoueClick));
		TransportRequestObjects.fromWarehoueClick.click();
		Thread.sleep(3000);
//		TransportRequestObjects.fromWarehoueClick.sendKeys("2699 - STEEL SERVICE CENTRE");
//		Thread.sleep(2000);
		TransportRequestObjects.fromWarehoueClick.sendKeys(Keys.TAB);
	}
 
	@Then("^As a user i should able to select to job$")
	public void as_a_user_i_should_able_to_select_to_job(DataTable toJob) throws Throwable {
		List<String> toJobs=toJob.asList(String.class);		
		TransportRequestCreationPageActions.selectToJob(toJobs.get(0));
		
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.toJobClick));
		TransportRequestObjects.toJobClick.click();
		Thread.sleep(3000);
		TransportRequestObjects.toJobClick.sendKeys("LE180046 - Raheja");
		Thread.sleep(2000);
		TransportRequestObjects.toJobClick.sendKeys(Keys.TAB);
	}    

	@Then("^As a user i should able to select to warehouse$")
	public void as_a_user_i_should_able_to_select_to_warehouse(DataTable toWareHouse) throws Throwable {
		List<String> towareHouse=toWareHouse.asList(String.class);
		TransportRequestCreationPageActions.selectToWareHouse(towareHouse.get(0));	  
		
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.toWarehouseClick));
		TransportRequestObjects.toWarehouseClick.click();
		Thread.sleep(3000);
//		TransportRequestObjects.toWarehouseClick.sendKeys("3116 - FORM WORK COMPETENCY CELL -HQ");
//		Thread.sleep(2000);
		TransportRequestObjects.toWarehouseClick.sendKeys(Keys.TAB);
		
	}

	@Then("^As a user is hould able to click create icon to create a request$")
	public void as_a_user_is_hould_able_to_click_create_icon_to_create_a_request() throws Throwable {
		TransportRequestCreationPageActions.Create();	    
	}

	@Then("^Verify the creation page is opend with prefilled information such as DocumentType, FromJob, ToJob, CurrencyType, FromWareHouse, ToWareHouse$")
	public void verify_the_creation_page_is_opend_with_prefilled_information_such_as_DocumentType_FromJob_ToJob_CurrencyType_FromWareHouse_ToWareHouse() throws Throwable {
		TransportRequestCreationPageActions.documentType();
	    TransportRequestCreationPageActions.verifyFromAndTojobs();
	    TransportRequestCreationPageActions.currencyType();
	}

	@Then("^As a user i should able to view Consignor Details & Consignee Details$")
	public void as_a_user_i_should_able_to_view_Consignor_Details_Consignee_Details() throws Throwable {
	    TransportRequestCreationPageActions.viewConsignorandViewConsignee();
	}

	@Then("^i should able to capture document number or reference number$")
	public void i_should_able_to_capture_document_number_or_reference_number(DataTable documentNo) throws Throwable {
		List<String> documentNos=documentNo.asList(String.class);
		TransportRequestCreationPageActions.captureDocumentReference(documentNos);
	}

	@Then("^as the movement type is intercarting i should able to select Materials from Material Cart$")
	public void as_the_movement_type_is_intercarting_i_should_able_to_select_Materials_from_Material_Cart() throws Throwable {
		TransportRequestObjects.materialcart.isEnabled();
	}

	@Then("^as a user if i try to skip the material step error message should displayed$")
	public void as_a_user_if_i_try_to_skip_the_material_step_error_message_should_displayed() throws Throwable {
		TransportRequestCreationPageActions.SkipMaterial();
	}

	@Then("^i should able to view Material Cart page to capture Material Category, Group and Item$")
	public void i_should_able_to_view_Material_Cart_page_to_capture_Material_Category_Group_and_Item(DataTable arg1) throws Throwable {
		if(TransportRequestObjects.materialcart.isEnabled()) {
			TransportRequestObjects.materialcart.click();
			TransportRequestCreationPageActions.captureMaterials(); 
		}		
	}
	@Then("^as a user i should able to capture shipment quantity againts the selected items negative values are not allowed$")
	public void as_a_user_i_should_able_to_capture_shipment_quantity_againts_the_selected_items_negative_values_are_not_allowed() throws Throwable {
	    TransportRequestCreationPageActions.shipmentQuantity();
	}

	@Then("^as a user i should able to capture sale order quanity againts the items and system should not allow to capture more than the shipment quantity$")
	public void as_a_user_i_should_able_to_capture_sale_order_quanity_againts_the_items_and_system_should_not_allow_to_capture_more_than_the_shipment_quantity() throws Throwable {
		TransportRequestCreationPageActions.saleOrder();    
	}

	@Then("^as a user i should able to capture the packing details$")
	public void as_a_user_i_should_able_to_capture_the_packing_details() throws Throwable {
	    TransportRequestCreationPageActions.packing();
	}

	@Then("^then as a user i should able to capture the location details$")
	public void then_as_a_user_i_should_able_to_capture_the_location_details(DataTable transportType) throws Throwable {
		List<String> transporttype=transportType.asList(String.class);
		TransportRequestCreationPageActions.location(transporttype.get(0));
		
	}

	@Then("^as a user i should able to capture the vechile details$")
	public void as_a_user_i_should_able_to_capture_the_vechile_details(DataTable transporter) throws Throwable {
		List<String> transporters=transporter.asList(String.class);
		 TransportRequestCreationPageActions.vechile(transporters.get(0));
	}

	@Then("^as a user is should able to min and max the gird view$")
	public void as_a_user_is_should_able_to_min_and_max_the_gird_view() throws Throwable {
		TransportRequestCreationPageActions.materilGrid();
	}  

	@Then("^as a user i should able to filter the created records using filter icon$")
	public void as_a_user_i_should_able_to_filter_the_created_records_using_filter_icon() throws Throwable {	    
		TransportRequestCreationPageActions.verifingStatus();
	}  

	@Then("^after successful material details capturing i should able to move to packing information page using next\\.$")
	public void after_successful_material_details_capturing_i_should_able_to_move_to_packing_information_page_using_next() throws Throwable {
	      
	    
	}
	
	@Then("^as a user i should able to filter the records$")
	public void as_a_user_i_should_able_to_filter_the_records() throws Throwable {
		TransportRequestCreationPageActions.filterMaterials();
	}

	@Then("^as a user i should able to add terms and conditions$")
	public void as_a_user_i_should_able_to_add_terms_and_conditions() throws Throwable {
		TransportRequestCreationPageActions.captureTermsAndConditions();
	}

	@Then("^verify users are able to click advance search icon$")
	public void verify_users_are_able_to_click_advance_search_icon() throws Throwable {
		  CommonControlObject.all.click();
	      CommonControlObject.advanceSearch.click();
	}

	@Then("^verify users are able to click and pass the FRQ Number$")
	public void verify_users_are_able_to_click_and_pass_the_FRQ_Number() throws Throwable {
		 DocumentSelections.searchDocument(); 
	}

	@Then("^verify users are able to click the search button$")
	public void verify_users_are_able_to_click_the_search_button() throws Throwable {
	      TransportRequestObjects.searchButton.click();
	}

	@Then("^verify users are able to view the searched FRQ Number$")
	public void verify_users_are_able_to_view_the_searched_FRQ_Number() throws Throwable {
		TransportRequestCreationPageActions.verifySearchedDoc();
	}
	
	@Then("^verify users are able to clear the searched results$")
	public void verify_users_are_able_to_clear_the_searched_results() throws Throwable {
		TransportRequestCreationPageActions.clearSearchParameter();
	}
	
	@Then("^verify users are able to click the calendar icon$")
	public void verify_users_are_able_to_click_the_calendar_icon() throws Throwable {
		TransportRequestCreationPageActions.clickcalendar();
	}

	@Then("^verify users are able to select date range to search$")
	public void verify_users_are_able_to_select_date_range_to_search() throws Throwable {
		TransportRequestCreationPageActions.selectDateRange();
	}
	
	@Then("^as a user i should able to recall the created request$")
	public void as_a_user_i_should_able_to_recall_the_created_request() throws Throwable {
		TransportRequestCreationPageActions.recall();
	}
	
	@Then("^verify the recalled request saved under draft mode$")
	public void verify_the_recalled_request_saved_under_draft_mode() throws Throwable {
			//Webdriver.driver.navigate().refresh();
			Thread.sleep(10000);
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.all));
			CommonControlObject.all.click();
			CommonControlObject.advanceSearch.click();
			DocumentSelections.searchDocument();
			TransportRequestObjects.searchButton.click();
			
			//WebElement problematicElement= Webdriver.driver.findElement(By.xpath("//div[@id='blah']"));
			//((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView()", TransportRequestObjects.scroll);
			assertEquals("Draft", TransportRequestObjects.documentNumberStatus.getText());
	}
	
	@Then("^as a user i should able to cancell the created request$")
	public void as_a_user_i_should_able_to_cancell_the_created_request() throws Throwable{
		TransportRequestCreationPageActions.cancell();
	}
	
	@Then("^verify the cancelled request updated as cancell$")
	public void verify_the_cancelled_request_updated_as_cancell() throws Throwable{
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.all));
		CommonControlObject.all.click();
		CommonControlObject.advanceSearch.click();
		DocumentSelections.searchDocument();
		TransportRequestObjects.searchButton.click();
		assertEquals("Cancelled", TransportRequestObjects.documentNumberStatus.getText());
	}
}