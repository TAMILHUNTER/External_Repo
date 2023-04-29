package stepdefinition;

import static org.junit.Assert.assertEquals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.model.ScreenCapture;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import object_repository.Locators.TransportRequestObjects;
import repository.Actions.CommonControlActions;

public class TransportRequestLandingPage {
	String days;
	static WebDriverWait wait=new WebDriverWait(Webdriver.driver, 10000);
	public  TransportRequestLandingPage() {
		PageFactory.initElements(Webdriver.driver, TransportRequestObjects.class);	
	}
	
	@Then("^As a user i should able to select Transport Request\\.$")
	public void as_a_user_i_should_able_to_select_Transport_Request() throws Throwable {
		TransportRequestObjects.transportRequest.click();	      
	}

	@Then("^As a user i should able to view the Transport Request landing page\\.$")
	public void as_a_user_i_should_able_to_view_the_Transport_Request_landing_page() throws Throwable {
		Webdriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    assertEquals("Transport Request", TransportRequestObjects.transportRequestTitle.getText());	      
	}

	@Then("^Verify the movement type is displayed as Vendor to Site PO$")  
	public void verify_the_movement_type_is_displayed_as_Vendor_to_Site_PO() throws Throwable {
		wait.until(ExpectedConditions.textToBePresentInElementValue(TransportRequestObjects.documentType, "Vendor to Site (PO)"));
	    assertEquals("Vendor to Site (PO)", TransportRequestObjects.documentType.getAttribute("value"));
	}  

	@Then("^Verify the landing page displayed with tabs\\[Source, For Actions, In Progress and All\\]$")
	public void verify_the_landing_page_displayed_with_tabs_Source_For_Actions_In_Progress_and_All() throws Throwable {
	    assertEquals("Source", TransportRequestObjects.source.getText());
	    assertEquals("For Action", TransportRequestObjects.forAction.getText());
	    assertEquals("In Progress", TransportRequestObjects.inProgress.getText());
	    assertEquals("All", TransportRequestObjects.all.getText());
	}

	@Then("^as a user i should able to change the viewing list and able to view the records based on <days>$")
	public static void as_as_a_user_i_should_able_to_change_the_viewing_list_and_able_to_view_the_records_based_on_days(DataTable days) throws Throwable {
		List<String> numberofdays=days.asList(String.class);
		TransportRequestObjects.numberofdays.click();
		String viewdays=numberofdays.get(0);
		System.out.println(viewdays);	
		Actions actions=new Actions(Webdriver.driver);
		actions.sendKeys(Keys.END);
		actions.sendKeys(Keys.ENTER);
//		Robot lastdays=new Robot();
//		lastdays.keyPress(KeyEvent.VK_END);
//		lastdays.keyPress(KeyEvent.VK_ENTER);
//		lastdays.keyRelease(KeyEvent.VK_ENTER);
//		lastdays.keyRelease(KeyEvent.VK_END);
//		assertEquals(viewdays, TransportRequestObjects.numberofdays.getText());
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate= formatter.format(date);
		System.out.println(strDate);
//		TransportRequestObjects.getDate.getText();
//		System.out.println("Before Year & Date change");
//		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.advanceSearch));
//		TransportRequestObjects.advanceSearch.click();
//		
//		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.TRCalendar));
//		TransportRequestObjects.TRCalendar.click();
//		Thread.sleep(3000);	
//		try {
//			 System.out.println("try Year & Date change");
//			TransportRequestObjects.TRCalendar.clear();
//		} catch (Exception e) {	
//			TransportRequestObjects.TRCalendar.sendKeys(Keys.CONTROL);
//			TransportRequestObjects.TRCalendar.sendKeys("A");
//			 System.out.println("catch Year & Date change");
//		}
//		TransportRequestObjects.TRCalendar.sendKeys("19-Oct-2019 - 19-Oct-2022");
//		    TransportRequestObjects.search.click();
//		    System.out.println("After Year & Date change");
	}

	@Then("^as a user i should able to change the number of <rows> to be displayed in the grid$")
	public void as_a_user_i_should_able_to_change_the_number_of_rows_to_be_displayed_in_the_grid(DataTable rows) throws Throwable {
		Thread.sleep(4000);
		List<String> numberofrows=rows.asList(String.class);
		TransportRequestObjects.all.click();
		Thread.sleep(4000);
		//TransportRequestObjects.numberofdays.sendKeys(numberofrows.get(0));
		TransportRequestObjects.show.click();
		Thread.sleep(2000);
		TransportRequestObjects.show.sendKeys(numberofrows.get(0));
		TransportRequestObjects.show.click();  
		Thread.sleep(2000);
		System.out.println(TransportRequestObjects.pageRecordView.getText().substring(4, 6));
		Thread.sleep(2000);
//		assertEquals(numberofrows.get(0), TransportRequestObjects.pageRecordView.getText().substring(4, 6));
		
	}

	@Then("^as a user i should able to search the <record> using advance search$")
	public void as_a_user_i_should_able_to_search_the_record_using_advance_search(DataTable record) throws Throwable {
		List<String> recordnumbertosearch=record.asList(String.class);
	    TransportRequestObjects.advanceSearch.click();
	    TransportRequestObjects.documentNo.sendKeys(recordnumbertosearch.get(0));
	    TransportRequestObjects.search.click();
	    assertEquals(TransportRequestObjects.result.getText(), recordnumbertosearch.get(0));
	}

	@Then("^as a user i should able to clear the search terms inputfields$")
	public void as_as_a_user_i_should_able_to_clear_the_search_terms_inputfields() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.clear));
		TransportRequestObjects.clear.click();
//		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.TRCalendar));
//	Thread.sleep(3000);
//		TransportRequestObjects.TRCalendar.clear();
//	    TransportRequestObjects.TRCalendar.sendKeys("19-Oct-2019 - 19-Oct-2022");
	
	}
 
	@Then("^as a user i should able to navigate through the pages$")
	public void as_as_a_user_i_should_able_to_navigate_through_the_pages() throws Throwable {
		Thread.sleep(2000);
		CommonControlActions.lastPage();
		Thread.sleep(3000);
		CommonControlActions.previousPage();
		Thread.sleep(2000);
		CommonControlActions.nextPage();
		Thread.sleep(2000);
		CommonControlActions.firstPage();    
	} 

	@Then("^as a user i should able to min and max the grid\\.$")
	public void as_as_a_user_i_should_able_to_min_and_max_the_grid() throws Throwable {
		System.out.println("Before Expand");
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.expand));
	    TransportRequestObjects.expand.click();
	    System.out.println("After Expand");
	    wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.compress));
	    if(TransportRequestObjects.compress.isEnabled()) {
	    	System.out.println("Before compress");
	    	assertEquals(true, true);
	    	TransportRequestObjects.compress.click();
	    	System.out.println("After compress");
	    }	      
	}

	@Then("^as a user i should able to change the <Document Type>$")
	public void as_a_user_i_should_able_to_change_the_Document_Type(DataTable arg1) throws Throwable {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.cleardocumentType));
			Thread.sleep(2000);
			TransportRequestObjects.cleardocumentType.click();
			
		}catch(Exception e) {
			Thread.sleep(2000);
			((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", TransportRequestObjects.cleardocumentType);
		}
		Thread.sleep(2000);
		System.out.println("Before -- > as a user i should able to change the <Document Type>");
		//TransportRequestObjects.cleardocumentType.click();
		//TransportRequestObjects.documentType.click();
		List<String> doctypeChange=arg1.asList(String.class);
		List<WebElement> selectDocumentType = TransportRequestObjects.documentTypeSelection;
		for (WebElement webElement : selectDocumentType) {
			if(webElement.getText().equals(doctypeChange.get(0))){
				webElement.click();
			}			
		}
		Thread.sleep(2000);
		 assertEquals(doctypeChange.get(0), TransportRequestObjects.documentType.getAttribute("value"));
	System.out.println("After -- > as a user i should able to change the <Document Type>");
	} 

	@Then("^as a user i should able to switch between the tabs$")
	public void as_a_user_i_should_able_to_switch_between_the_tabs() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.forAction));
		((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", TransportRequestObjects.forAction);
//		   TransportRequestObjects.forAction.click();
			Thread.sleep(2000);
		    if(TransportRequestObjects.forAction.isSelected()) {
		    	assertEquals("For Action", TransportRequestObjects.forAction.getText());
		    }
		    Thread.sleep(3000);
		    wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.inProgress));
		    Thread.sleep(3000);
//		    TransportRequestObjects.inProgress.click();
		    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", TransportRequestObjects.inProgress);
		    if(TransportRequestObjects.inProgress.isSelected()) {
		    	assertEquals("In Progress", TransportRequestObjects.inProgress.getText());
		    }
		    wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.all));
		    try {
		    	 TransportRequestObjects.all.click();
			} catch (Exception e) {
				((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", TransportRequestObjects.all);
			}
		   
		    if(TransportRequestObjects.all.isSelected()) {
		    	assertEquals("All", TransportRequestObjects.all.getText());
		    }
		    wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.source));
		    TransportRequestObjects.source.click();		    
		    if(TransportRequestObjects.source.isSelected()) {
		    	assertEquals("Source", TransportRequestObjects.source.getText());
		    }		    
	}
	
	@Then("^as a user i should able to select one <record> from source tab and should able to create Transport Request verify the create window$")
	public void as_a_user_i_should_able_to_select_one_record_from_source_tab_and_should_able_to_create_Transport_Request_verify_the_create_window(DataTable record) throws Throwable {
		System.out.println("++++++++++++++++++");
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.Clear_Doctype));
		Thread.sleep(2000);
		TransportRequestObjects.Clear_Doctype.click();
//		TransportRequestObjects.documentType.clear();
		System.out.println("-------------------");
		List<WebElement> select = TransportRequestObjects.documentTypeSelection;
		for (WebElement webElement : select) {
			if(webElement.getText().equals("Vendor to Site (PO)")) {
				webElement.click();
				break;
			}
		}
		System.out.println("=========================");
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.source));
		TransportRequestObjects.source.click();
		System.out.println("************************");
		List<String> recordselect=record.asList(String.class);
		List<WebElement> foundrecord = TransportRequestObjects.matchresult;
		List<WebElement> selectSource = TransportRequestObjects.selectSourceRecord;
		for(int i=0;i<=foundrecord.size();i++) {
			Thread.sleep(3000);
			if(foundrecord.get(i).getText().equals(recordselect.get(0))) {
				Thread.sleep(2000);
				System.out.println("Source = "+foundrecord.get(i).getText());
				System.out.println("Check Box Index = "+selectSource.get(i));
				selectSource.get(i).click();
				
				break;
			}
		}
		System.out.println("///////////////////////////////////");
		
		/*for (WebElement webElement : foundrecord) {
			if(webElement.getText().equals(recordselect.get(0))) {
				assertEquals(webElement.getText(), recordselect.get(0));
				TransportRequestObjects.selected.click();
				break; 
			}			
		}	*/	
		assertEquals(true, TransportRequestObjects.selected.isSelected());	 
		System.out.println("''''''''''''''''''''''''''''");
	}
	
	@Then("^as a user i should able to select multiple records from source tab and should able to create Transport Request & verify the create window$")
	public void as_a_user_i_should_able_to_select_multiple_records_from_source_tab_and_should_able_to_create_Transport_Request_verify_the_create_window() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.selectAll));
		try {
			Thread.sleep(2000);
			TransportRequestObjects.selectAll.click();
		} catch (Exception e) {
			Thread.sleep(2000);
			((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", TransportRequestObjects.selectAll);
		}
		
		List<WebElement> verifyall = TransportRequestObjects.verifyselectAll;
		for (WebElement webElement : verifyall) {
			boolean status = webElement.isSelected();
			if(status==true) {
				assertEquals(true, status);
			}
		}
	}
}