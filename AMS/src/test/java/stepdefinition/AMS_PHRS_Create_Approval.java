package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.AMS_PHRS_Page;

import object_repository.Login_Objects;



public class AMS_PHRS_Create_Approval {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public AMS_PHRS_Create_Approval() {
		PageFactory.initElements(Webdriver.driver, AMS_PHRS_Page.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 12000);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
	public static Actions actions = new Actions(Webdriver.driver);

	// **************** Start import methods for step definition
	// ********************

	/*
	 * @Then("^Enter Purchase in Search Menu as$") public void
	 * Enter_Purchase_in_Search_Menu_as(String SM) throws Throwable { // Write
	 * code here that turns the phrase above into concrete actions
	 * 
	 * SCM_Purchase_Request.EnterPerchase.sendKeys("purchase"); }
	 */
	@Given("^Go to Test Environment$")
	public void go_to_Test_Environment() throws Throwable {
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		
	}
	@Then("^Enter the Password$")
	public void enter_the_Password() throws Throwable {
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
	}
	@Then("^Enter PHRS in Search Menu as (.*)$")
	public void Enter_PHRS_in_Search_Menu_as(String PHRS) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(500);
		AMS_PHRS_Page.EnterPHRS.sendKeys(PHRS);
	}
	
	@Then("^select menu from home page$")
	public void select_menu_from_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("Before Menu Click");
		//Thread.sleep(800);
		AMS_PHRS_Page.Menu.click();
		
		/*JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		js.executeScript("arguments[0].click()", AMS_PHRS_Page.Menu);*/
	}
	
	@Then("^select Asset Mgmt from home page$")
	public void select_Asset_Mgmt_from_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("Before Menu Click");
		Thread.sleep(800);
		AMS_PHRS_Page.AssetMgmt.click();
		
		/*JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		js.executeScript("arguments[0].click()", AMS_PHRS_Page.Menu);*/
	}
	
	@Then("^select Asset Mgmt tree from home page$")
	public void select_Asset_Mgmt_tree_from_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("Before Menu Click");
		//Thread.sleep(800);
		AMS_PHRS_Page.AssetTree.click();
		
		/*JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		js.executeScript("arguments[0].click()", AMS_PHRS_Page.Menu);*/
	}
	
	@Then("^select AMSDocument from home page$")
	public void select_AMS_Document_from_home_page() throws Throwable {
		
		AMS_PHRS_Page.AMSDocument.click();
		
		/*JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		js.executeScript("arguments[0].click()", AMS_PHRS_Page.Menu);*/
	}
	
	
	
	
	@Then("^select PMHiring from home page$")
	public void select_PMHiring_from_home_page() throws Throwable {
		
		AMS_PHRS_Page.PMHiring.click();
		 
		
	}

	
	
	@Then("^select PHRCreation from home page$")
	public void select_PHRCreation_from_home_page() throws Throwable {
		
		AMS_PHRS_Page.PHRCreation.click();
	
	}
	
	
	
	/*@Then("^Enter JobCode in Plant Hire Request Creation$")
	public void Enter_JobCode_in_Plant_Hire_Request_Creation(String Jobcode) throws Throwable {
		Thread.sleep(800);
		AMS_PHRS_Page.JobCode.sendKeys(Jobcode, Keys.TAB);
		
	}*/
	
	@Then("^Enter JobCode in Plant Hire Request Creation (.*)$")
	public void enter_JobCode_in_Plant_Hire_Request_Creation(String job) throws Throwable {
		
		AMS_PHRS_Page.JobCode.sendKeys(job);
	}
		
	
	@Then("^Select JobCode in Plant Hire Request Creation (.*)$")
	public void Select_JobCode_in_Plant_Hire_Request_Creation(String jobcode) throws Throwable {
		AMS_PHRS_Page.SelectJobCode.click();
		List<WebElement> jobCode = AMS_PHRS_Page.job;
	
		if(jobCode.size()>0) {
		for (WebElement webElement : jobCode) {
		
		if(webElement.getText().equals(jobcode)) {
		webElement.click();
		break;
		}
	}
}
}
	
	
	@Then("^select JobCode Plant Hire Request Creation$")
	public void Select_JobCode_Plant_Hire_Request_Creation() throws Throwable {
		
		AMS_PHRS_Page.SelectJobCode.click();
		AMS_PHRS_Page.SelectJobCode.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	
	}
	
	
	
	@Then("^select GetList Plant Hire Request Creation$")
	public void Select_GetList_Plant_Hire_Request_Creation() throws Throwable {
		
		AMS_PHRS_Page.GetList.click();
	}
	
	
	
	@Then("^Verify GetList is clickable or not in Plant Hire Request Creation$")
	public void Verify_GetList_is_clickable_or_not_in_Plant_Hire_Request_Creation() throws Throwable {
		
		assertEquals(true, AMS_PHRS_Page.GetList.isEnabled());
	}
	
	@Then("^select Raise Request Plant Hire Request Creation$")
	public void Select_Raise_Request_Plant_Hire_Request_Creation() throws Throwable {
		
		AMS_PHRS_Page.RaiseRequest.click();
	}

	@Then("^Enter Bulldozer in Asset Description (.*)$")
	public void Enter_Bulldozer_in_Asset_Description(String AssetDescription) throws Throwable {
		AMS_PHRS_Page.AssetDescription.sendKeys(AssetDescription);
	}
	
	
	@Then("^Enter Quantity in Requirment QTY(.*)$")
	public void Enter_Quantity_in_Requirment_QTY(String Quantity) throws Throwable {
		AMS_PHRS_Page.Quantity.clear();
		AMS_PHRS_Page.Quantity.sendKeys(Quantity);
	}
	
	@Then("^Enter Specification or Additional Inputs(.*)$")
	public void Enter_Specification_or_Additional_Inputs(String Specification) throws Throwable {
		AMS_PHRS_Page.Specification.sendKeys(Specification);
	}
	
	
	@Then("^Enter Capacity in the Plant Hire Request Creation(.*)$")
	public void Enter_Capacity_in_the_Plant_Hire_Request_Creation(String Capacity) throws Throwable {
		AMS_PHRS_Page.Capacity.sendKeys(Capacity);
	}
	
	/*@Then("^select  Plant Hire Request Creation$")
	public void Select_JobCode_Plant_Hire_Request_Creation() throws Throwable {
		
		AMS_PHRS_Page.SelectJobCode.click();
		AMS_PHRS_Page.SelectJobCode.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	*/
	
	
@Then("^Verify and validate Raise Request is clickable or not in Plant Hire Request Creation$")
public void Verify_Raise_Request_is_clickable_or_not_in_Plant_Hire_Request_Creation() throws Throwable {
	
	assertEquals(true, AMS_PHRS_Page.RaiseRequest.isEnabled());
	assertEquals("Raise Request", AMS_PHRS_Page.RaiseRequest.getText());

	System.out.println("Action = "+AMS_PHRS_Page.RaiseRequest.getText());
}

@Then("^Enter Normal Work hours Day in the Plant Hire Request Creation(.*)$")
public void Enter_Normal_Work_hours_Day_in_the_Plant_Hire_Request_Creation(String NormalWorkhoursDay) throws Throwable {
	AMS_PHRS_Page.NormalWorkhoursDay.sendKeys(NormalWorkhoursDay);
}

@Then("^Enter No of OT Hourss Day in the Plant Hire Request Creation(.*)$")
public void Enter_No_of_OT_Hourss_Day_in_the_Plant_Hire_Request_Creation(String NoofOTHourssDay) throws Throwable {
	AMS_PHRS_Page.NoofOTHourssDay.sendKeys(NoofOTHourssDay);
}

@Then("^Enter Operator Charges Month in the Plant Hire Request Creation(.*)$")
public void Enter_Operator_Charges_Month_in_the_Plant_Hire_Request_Creation(String OperatorChargesMonth) throws Throwable {
	AMS_PHRS_Page.OperatorChargesMonth.sendKeys(OperatorChargesMonth);
}

@Then("^Enter No of OT Hours Month in the Plant Hire Request Creation(.*)$")
public void Enter_No_of_OT_Hours_Month_in_the_Plant_Hire_Request_Creation(String NoofOTHoursMonth) throws Throwable {
	AMS_PHRS_Page.NoofOTHoursMonth.sendKeys(NoofOTHoursMonth);
}

@Then("^Enter Reason for Hiring in Additional Inputs(.*)$")
public void Enter_Reason_for_Hiring_in_Additional_Inputs(String ReasonforHiring) throws Throwable {
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", AMS_PHRS_Page.SubmitRequest);
	
	AMS_PHRS_Page.ReasonforHiring.click();
	Thread.sleep(300);
	AMS_PHRS_Page.ReasonforHiring.sendKeys(ReasonforHiring);
}

@Then("^Enter Scope of Work in Additional Inputs(.*)$")
public void Enter_Scope_of_Work_in_Additional_Inputs(String ScopeofWork) throws Throwable {
	AMS_PHRS_Page.ScopeofWork.click();
	Thread.sleep(300);
	AMS_PHRS_Page.ScopeofWork.sendKeys(ScopeofWork);

}

@Then("^Enter Scope Of Work Qty Equipment in Additional Inputs(.*)$")
public void Enter_Scope_Of_Work_Qty_Equipment_in_Additional_Inputs(String ScopeOfWorkQtyEquipment) throws Throwable {
	AMS_PHRS_Page.ScopeOfWorkQtyEquipment.click();
	Thread.sleep(300);
	AMS_PHRS_Page.ScopeOfWorkQtyEquipment.sendKeys(ScopeOfWorkQtyEquipment);

}

@Then("^Enter Specific requirments in Additional Inputs(.*)$")
public void Enter_Specific_requirments_in_Additional_Inputs(String Specificrequirments) throws Throwable {
	AMS_PHRS_Page.Specificrequirments.click();
	Thread.sleep(300);
	AMS_PHRS_Page.Specificrequirments.sendKeys(Specificrequirments);

}

@Then("^Enter Send Email To in Additional Inputs(.*)$")
public void Enter_Send_Email_To_in_Additional_Inputs(String SendEmailTo) throws Throwable {
	
	AMS_PHRS_Page.SendEmailTo.click();
	Thread.sleep(5000);
	/*AMS_PHRS_Page.SendEmailTo.sendKeys(SendEmailTo + Keys.chord(Keys.LEFT_SHIFT,Keys.NUMPAD2)+"lntecc"+Keys.DECIMAL+"com");*/
	AMS_PHRS_Page.SendEmailTo.sendKeys(SendEmailTo);//+ "&#64;" +"lntecc"+Keys.DECIMAL+"com");
	
	//AMS_PHRS_Page.SendEmailTo.sendKeys("lntecc"+Keys.DECIMAL+"com");

}

@Then("^Enter Send Email CC in Additional Inputs(.*)$")
public void Enter_Send_Email_CC_in_Additional_Inputs(String SendEmailCC) throws Throwable {
	AMS_PHRS_Page.SendEmailCC.click();
	Thread.sleep(5000);
	AMS_PHRS_Page.SendEmailCC.sendKeys(SendEmailCC);

}

@Then("^select Submit Request in Additional Inputs$")
public void Select_Submit_Request_in_Additional_Inputs() throws Throwable {
	
	AMS_PHRS_Page.SubmitRequest.click();
}


@Then("^Verify Submit Request is clickable or not in Additional Inputs$")
public void Verify_Submit_Request_is_clickable_or_not_in_Additional_Inputs() throws Throwable {
	
	assertEquals(true, AMS_PHRS_Page.SubmitRequest.isEnabled());
}

@Then("^Enter FilterText in Plant Hire send Request(.*)$")
public void enter_FilterText_in_Plant_Hire_send_Request(String FilterText) throws Throwable {
	
	AMS_PHRS_Page.FilterText.sendKeys(FilterText);
}

@Then("^Select Employees in Plant Hire send Request(.*)$")
public void select_Employees_from_the_box() throws Throwable {

	AMS_PHRS_Page.Employees.click();
}

@Then("^select EmployeeName from the box$")
public void select_EmployeeName_from_the_box() throws Throwable {

	AMS_PHRS_Page.EmployeeName.click();

}

@Then("^Enter test in the message box(.*)$")
public void Enter_test_in_the_message_box(String MessageText) throws Throwable {
	AMS_PHRS_Page.MessageText.click();
	Thread.sleep(5000);
	AMS_PHRS_Page.MessageText.sendKeys(MessageText);
}

@Then("^Click Send in Plant Hire send Request$")
public void Click_Send_in_Plant_Hire_send_Request() throws Throwable {
	
	AMS_PHRS_Page.ClickSend.click();
}

@Then("^select Baneswar from the ReceivedBy and Status$")
public void select_Baneswar_from_the_ReceivedBy_and_Status() throws Throwable {

	AMS_PHRS_Page.SelectBaneswar.click();

}
@Then("^Click Done from Plant Hire send Request$")
public void Click_Done_from_Plant_Hire_send_Request() throws Throwable {

	AMS_PHRS_Page.ClickDone.click();
}

@Then("^Click Advance Search icon in Work Bench$")
public void Click_Advance_Search_icon_in_Work_Bench() throws Throwable {
	
	AMS_PHRS_Page.AdvanceSearchIcon.click();
}


@Then("^Verify Advance Search Icon is clickable or not in Work Bench$")
public void Verify_Advance_Search_Icon_is_clickable_or_not_in_Work_Bench() throws Throwable {
	
	assertEquals(true, AMS_PHRS_Page.AdvanceSearchIcon.isEnabled());
}


@Then("^Enter DocumentNo in the text bar(.*)$")
public void Enter_DocumentNo_in_the_text_bar(String DocumentNo) throws Throwable {
	AMS_PHRS_Page.DocumentNo.click();
	Thread.sleep(5000);
	AMS_PHRS_Page.DocumentNo.sendKeys(DocumentNo);
}



@Then("^Enter PHRS Number from DB$")
public void Enter_PHRS_Number_from_DB() throws Throwable {
	//DataBaseConnection.EnterPHRSNumber();
}


@Then("^Select Search Button in Advance Search$")
public void Select_Search_Button_in_Advance_Search() throws Throwable {
	
	AMS_PHRS_Page.ClickSearch.click();
}


@Then("^Select Latest PHRS number from list$")
public void Select_Latest_PHRS_number_from_list() throws Throwable {
	
	AMS_PHRS_Page.SelectPHRSnum.click();
}

@Then("^Enter Vendorcode in the Plant Hire Request Confirmation(.*)$")
public void Enter_Vendorcode_in_the_Plant_Hire_Request_Confirmation(String Vendorcode) throws Throwable {
	//AMS_PHRS_Page.Vendorcode.click();
	Thread.sleep(500);
	
	AMS_PHRS_Page.Vendorcode.sendKeys(Vendorcode+Keys.TAB);
	
	//AMS_PHRS_Page.SelectVendorcode.click();
	//AMS_PHRS_Page.Vendorcode.sendKeys(Keys.DELETE+Vendorcode);
}

@Then("^Select Vendor code from the Plant Hire Request Confirmation list$")
public void Select_Vendor_code_from_the_Plant_Hire_Request_Confirmation_list() throws Throwable {
	
	//AMS_PHRS_Page.SelectVendorcode.click();
	//AMS_PHRS_Page.SelectVendorcode.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	

}

/*@Then("^Select Vendor code Description in Plant Hire Request Confirmation(.*)$")
public void Select_Vendor_code_Description_in_Plant_Hire_Request_Confirmation(String VendorcodeDesc) throws Throwable {
	AMS_PHRS_Page.SelectVendorcode.click();
	List<WebElement> VendorcodeDesc = AMS_PHRS_Page.code;
	if(VendorcodeDesc.size()>0) {
	for (WebElement webElement : VendorcodeDesc) {
	if(webElement.getText().equals(VendorcodeDesc)) {
	webElement.click();
	break;
	}
	}
	}*/

@Then("^Enter Contact Person name in the Hirer and Equipment details(.*)$")
public void Enter_Contact_Person_name_in_the_Hirer_and_Equipment_details(String ContactPerson) throws Throwable {
	System.out.println(ContactPerson);
	Thread.sleep(3000);
	AMS_PHRS_Page.ContactPerson.sendKeys(ContactPerson);
	/*AMS_PHRS_Page.ContactPerson.sendKeys(ContactPerson+Keys.HOME+Keys.DELETE+ContactPerson);*/
	/*JavascriptExecutor j = (JavascriptExecutor)Webdriver.driver;
	j.executeScript ("AMS_PHRS_Page.ContactPerson.value="+ContactPerson);*/
}

@Then("^Enter Contact No in the Hirer and Equipment details(.*)$")
public void Enter_Contact_No_in_the_Hirer_and_Equipment_details(String ContactNo) throws Throwable {
	
	boolean status = AMS_PHRS_Page.ContactNo.isEnabled();
	if(status==true) {
		AMS_PHRS_Page.ContactNo.sendKeys(ContactNo);
	}
	
}

@Then("^Enter Make in the Hirer and Equipment details(.*)$")
public void Enter_Make_in_the_Hirer_and_Equipment_details(String Make) throws Throwable {
	//AMS_PHRS_Page.Make.click();
	
	AMS_PHRS_Page.Make.sendKeys(Keys.BACK_SPACE+Make);
}

@Then("^Enter Model in the Hirer and Equipment details(.*)$")
public void Enter_Model_in_the_Hirer_and_Equipment_details(String Model) throws Throwable {
	//AMS_PHRS_Page.Model.click();
	
	AMS_PHRS_Page.Model.sendKeys(Keys.BACK_SPACE+Model);
}


@Then("^Enter Equipment Capacity in the Hirer and Equipment details(.*)$")
public void Enter_Equipment_Capacity_in_the_Hirer_and_Equipment_details(String EquipmentCapacity) throws Throwable {

	AMS_PHRS_Page.EquipmentCapacity.sendKeys(Keys.BACK_SPACE+EquipmentCapacity);
}

@Then("^Enter OTRate Fixed with Hire Terms(.*)$")
public void Enter_OTRate_Fixed_with_Hire_Terms(String OTRateFixedwith) throws Throwable {
	
	AMS_PHRS_Page.OTRateFixedwith.sendKeys(Keys.BACK_SPACE+OTRateFixedwith);
	
}
@Then("^Enter Working Hoursday in Hire Rate Calculator(.*)$")
public void Enter_Working_Hoursday_in_Hire_Rate_Calculator(String WorkingHoursday) throws Throwable {
	
	AMS_PHRS_Page.WorkingHoursday.sendKeys(WorkingHoursday);
	
}

@Then("^Page Down Plant Hire Request Confirmation$")
public void Page_Down_Plant_Hire_Request_Confirmation() throws Throwable {
((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", AMS_PHRS_Page.HireTermOperatorDetails);

AMS_PHRS_Page.HireTermOperatorDetails.click();

Thread.sleep(300);
}

@Then("^Enter Working Hours month in Hire Rate Calculator(.*)$")
public void Enter_Working_Hour_smonth_in_Hire_Rate_Calculator(String WorkingHoursmonth) throws Throwable {
	
	Thread.sleep(500);
	
	AMS_PHRS_Page.WorkingHoursmonth.sendKeys(WorkingHoursmonth);
	
}

@Then("^Enter S Working Hoursday in Hire Rate Calculator(.*)$")
public void Enter_S_Working_Hours_day_in_Hire_Rate_Calculator(String SWorkingHoursday) throws Throwable {
	Thread.sleep(500);
	AMS_PHRS_Page.SWorkingHoursday.sendKeys(SWorkingHoursday);
	
}

@Then("^Enter S Working Hours month in Hire Rate Calculator(.*)$")
public void Enter_S_Working_Hours_month_in_Hire_Rate_Calculator(String SWorkingHoursmonth) throws Throwable {
	Thread.sleep(500);
	AMS_PHRS_Page.SWorkingHoursmonth.sendKeys(SWorkingHoursmonth);
	
}

@Then("^Enter S Expected OT hours month in Hire Rate Calculator(.*)$")
public void Enter_S_Expected_OT_hours_month_in_Hire_Rate_Calculator(String SExpectedOThoursmonth) throws Throwable {
	Thread.sleep(500);
	AMS_PHRS_Page.SExpectedOThoursmonth.sendKeys(SExpectedOThoursmonth);
	
}
@Then("^Enter Expected OT hours month in Hire Rate Calculator(.*)$")
public void Enter_Expected_OT_hours_month_in_Hire_Rate_Calculator(String ExpectedOThoursmonth) throws Throwable {
	Thread.sleep(500);
	AMS_PHRS_Page.ExpectedOThoursmonth.sendKeys(ExpectedOThoursmonth);
	
}




@Then("^Select Operatorcharges in Hire Terms Operator Details$")
public void Select_Operatorcharges_in_Hire_Terms_Operator_Details() throws Throwable {

	AMS_PHRS_Page.Operatorcharges.click();
}
@Then("^Select Accommodation Charges in Hire Terms Operator Details$")
public void Select_Accommodation_Charges_in_Hire_Terms_Operator_Details() throws Throwable {
Thread.sleep(1000);
	AMS_PHRS_Page.AccommodationCharges.click();
	AMS_PHRS_Page.AccommodationCharges.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	/*JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", AMS_PHRS_Page.AccommodationCharges);*/
}

@Then("^Select second Accommodation Charges in Hire Terms Operator Details$")
public void Select_second_Accommodation_Charges_in_Hire_Terms_Operator_Details(String AccommodationChargesforOM) throws Throwable {
	
	List<WebElement> Accommodation = AMS_PHRS_Page.AccommodationChargesforOM;
	
	for (WebElement webElement : Accommodation) {
	if(webElement.getText().equals(AccommodationChargesforOM)) {
	webElement.click();
	break;
	}
	}
}


}


	
/*@Then("^Select second Accommodation Charges in Hire Terms Operator Details(.*)$")
public void Select_second_Accommodation_Charges_in_Hire_Terms_Operator_Details() throws Throwable {

	AMS_PHRS_Page.AccommodationChargesforOM.click();
}*/
	





	

	
	
	
	

	

	
	

