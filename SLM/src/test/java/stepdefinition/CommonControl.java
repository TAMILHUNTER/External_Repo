package stepdefinition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import repository.Actions.CommonControlActions;

public class CommonControl {
	 String documentNumbers;
	@Given("^user should able to click the seach icon$")
	public void user_should_able_to_click_the_seach_icon() throws Throwable {
		Webdriver.driver.navigate().refresh();
	    CommonControlActions.clickSearchicon();
	}    
	@Given("^user should able to pass the search document number$")
	public void user_should_able_to_pass_the_search_document_number(DataTable documentNumber) throws Throwable {
		List<String> number=documentNumber.asList(String.class);		
		documentNumbers=number.get(0);
		CommonControlActions.sendDocumentNumber(documentNumbers);
	}  
 
	@Given("^user should able to click the search button$")
	public void user_should_able_to_click_the_search_button() throws Throwable {
	    CommonControlActions.searchResultbutton();
	} 
 
	@Given("^user should able to find the related search result$")
	public void user_should_able_to_find_the_related_search_result() throws Throwable {
	    CommonControlActions.searchResult();
	}   

	@Given("^user should able to click the filter icon$")
	public void user_should_able_to_click_the_filter_icon() throws Throwable {
	     CommonControlActions.clickFilter(); 
	}
	
	@Given("^user should able to pass the filter document number$")
	public void user_should_able_to_pass_the_filter_document_number(DataTable documentNumber) throws Throwable {
		List<String> number=documentNumber.asList(String.class);
		documentNumbers=number.get(0);
		CommonControlActions.sendDocNumberToFilter(documentNumbers);	
	}
	
	@Given("^user should able to find the related filtered result$")
	public void user_should_able_to_find_the_related_filtered_result() throws Throwable {
		Thread.sleep(5000);
		CommonControlActions.filtersearchResult(documentNumbers);
	}
	
}  
