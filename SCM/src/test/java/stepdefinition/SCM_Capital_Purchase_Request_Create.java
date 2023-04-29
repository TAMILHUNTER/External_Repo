package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import action_SCM.Commoncontrol;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.EIP_Menu;
import object_repository.SCM_CPRS_Page;

public class SCM_Capital_Purchase_Request_Create {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public SCM_Capital_Purchase_Request_Create() {
		PageFactory.initElements(Webdriver.driver, SCM_CPRS_Page.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);
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

	


@Then("^Enter CPRS in Search Menu as (.*)$")
public void Enter_CPRS_in_Search_Menu_as(String CPRS) throws Throwable {
	Thread.sleep(5000);
	SCM_CPRS_Page.EnterCPRS.click();
	
	// Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.EnterCPRS));
	SCM_CPRS_Page.EnterCPRS.sendKeys(CPRS);
}

@Then("^Select CPRS Menu$")
public void Select_CPRS_Menu() throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.HomeMenu.click();
	//assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
	System.out.println("SCM Menu = "+EIP_Menu.SCM.getText());
	Thread.sleep(300);
	SCM_CPRS_Page.SCM.click();
	
	System.out.println("SCM Menu = "+EIP_Menu.Request.getText());
	SCM_CPRS_Page.Request.click();
	
	Thread.sleep(300);
	SCM_CPRS_Page.CPRS.click();
	
}


@Then("^Enter Asset Request in Search Menu as (.*)$")
public void Enter_Asset_Request_in_Search_Menu_as(String CPRS) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.EnterCPRS));
	SCM_CPRS_Page.EnterCPRS.sendKeys(CPRS);

}

@Then("^Select Capital Purchase Request in Search Menu$")
public void Select_Capital_Purchase_Request_in_Search_Menu() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.SelectCPRS));
	SCM_CPRS_Page.SelectCPRS.click();
}

@Then("^Select Asset Request in Search Menu$")
public void Select_Asset_Request_in_Search_Menu() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.SelectAssetRequest));
	SCM_CPRS_Page.SelectAssetRequest.click();
}



@Then("^Select Create Capital Purchase Request icon$")
public void Select_Create_Capital_Purchase_Request_icon() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.Create));
	boolean createiconstatus = SCM_CPRS_Page.Create.isEnabled();
	if(createiconstatus==true) {
		Thread.sleep(1500);
		SCM_CPRS_Page.Create.click();	
	}
	
	
}

@Then("^Select Go button for mandatory field validation$")
public void Select_Go_button_for_mandatory_field_validation() throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.CPRSGo.click();
}

@Then("^Title of Alert Message validation$")
public void Title_of_Alert_Message_validation() throws Throwable {
	Thread.sleep(1000);
	
	assertEquals("Error", SCM_CPRS_Page.AlertHead.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertHead.getText());
}


@Then("^Alert Message validation$")
public void Alert_Message_validation() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("IC is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for after IC select$")
public void Alert_Message_validation_for_after_IC_select() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Cluster is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}


@Then("^Alert Message validation for after Job and Cluster select$")
public void Alert_Message_validation_for_after_Job_and_Cluster_select() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Request category is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for select submit button not fill the details of CPRS value$")
public void Alert_Message_validation_for_select_submit_button_not_fill_the_details_of_CPRS_value() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Please add atleast one asset group", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}


@Then("^Alert Message validation for select submit button not fill the details of Scope$")
public void Alert_Message_validation_for_select_submit_button_not_fill_the_details_of_Scope() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Scope of work is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}


@Then("^Alert Message validation for select Post button in Asset Attributes$")
public void Alert_Message_validation_for_select_Post_button_in_Asset_Attributes() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Asset make is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for select Post button in Asset Attributes after select Asset make$")
public void Alert_Message_validation_for_select_Post_button_in_Asset_Attributes_after_select_Asset_make() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Asset model is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for select Post button in Asset Attributes after select Asset make and Asset model$")
public void Alert_Message_validation_for_select_Post_button_in_Asset_Attributes_after_select_Asset_make_and_Asset_model() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Asset capacity is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for select save button in Delivery Schedule$")
public void Alert_Message_validation_for_select_save_button_in_in_Delivery_Schedule() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Warehouse is required", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for select save button in Delivery Schedule after select Warehouse$")
public void Alert_Message_validation_for_select_save_button_in_in_Delivery_Schedule_after_select_Warehouse() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Quantity should not be a zero", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}


@Then("^Alert Message validation for select save button in Delivery Schedule after enter Quantity$")
public void Alert_Message_validation_for_select_save_button_in_Delivery_Schedule_after_enter_Quantity() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Please add delivery schedule data and then post", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}


@Then("^Alert Message validation for select Post button in Additional Information$")
public void Alert_Message_validation_for_select_save_button_in_Additional_Information() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Deployment work attributes is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}

@Then("^Alert Message validation for select Post button in Additional Information after enter Deployment work attributes$")
public void Alert_Message_validation_for_select_save_button_in_Additional_Information_after_enter_Deployment_work_attributes() throws Throwable {
	Thread.sleep(500);
	
	assertEquals("Scope of work qty is mandatory", SCM_CPRS_Page.AlertMessg.getText());
	System.out.println("Create - CPRS Page = "+SCM_CPRS_Page.AlertMessg.getText());
}





@Then("^Alert Accept for mandatory field validation$")
public void Alert_Accept_for_mandatory_field_validation() throws Throwable {
Thread.sleep(600);
	SCM_CPRS_Page.AlertAccept.click();
}








@Then("^Capital Purchase Request home page verification$")
public void Capital_Purchase_Request_home_page_verification() throws Throwable {
	assertEquals("For Action", SCM_CPRS_Page.ForAuction.getText());
	
	System.out.println("Tab 1 = "+SCM_CPRS_Page.ForAuction.getText());
	assertEquals("Rejected", SCM_CPRS_Page.Rejet.getText());
	
	System.out.println("Tab 2 = "+SCM_CPRS_Page.Rejet.getText());
	assertEquals("Approved", SCM_CPRS_Page.Approved.getText());
	
	System.out.println("Tab 3 = "+SCM_CPRS_Page.Approved.getText());
	assertEquals("All", SCM_CPRS_Page.All.getText());
	 
	System.out.println("Tab 4 = "+SCM_CPRS_Page.All.getText());
	assertEquals(true, SCM_CPRS_Page.Create.isEnabled()); 
	
	
	
}

@Then("^Select Add Asset Request Create icon$")
public void Select_Add_Asset_Request_Create_icon() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.AddCreate));
	Thread.sleep(5000);
	SCM_CPRS_Page.AddCreate.click();
}



@Then("^Enter IC in Create CPRS as (.*)$")
public void Enter_IC_in_Create_CPRS_as(String IC) throws Throwable {
	
	
	SCM_CPRS_Page.EnterIC.sendKeys(IC, Keys.TAB);
}

@Then("^Select IC from Create CPRS Page (.*)$")
public void Select_IC_from_Create_CPRS_Page(String IC) throws Throwable {

	SCM_CPRS_Page.EnterIC.click();
	
	List<WebElement> icList = SCM_CPRS_Page.ICList;
	if(icList.size()>0) {
		for (WebElement webElement : icList) {
			if(webElement.getText().equals(IC)) {
				webElement.click();
				break;
			}
		}
	}
	
}

@Then("^Verify to Select IC from the List in Create CPRS Page (.*)$")
public void Verify_to_Select_IC_from_the_List_in_Create_CPRS_Page(String IC) throws Throwable {

	SCM_CPRS_Page.EnterIC.click();
	
	List<WebElement> icList = SCM_CPRS_Page.ICList;
	if(icList.size()>0) {
		for (WebElement webElement : icList) {
			if(webElement.getText().equals(IC)) {
				webElement.click();
				break;
			}
		}
	}
	
}

@Then("^Verify to Select Job from the List in Create CPRS Page(.*)$")
public void Verify_to_Select_Job_from_the_List_in_Create_CPRS_Page(String CPRSJob) throws Throwable {

	SCM_CPRS_Page.Job.click();
	SCM_CPRS_Page.Job.sendKeys(CPRSJob, Keys.TAB);
	
	/*List<WebElement> jobList = SCM_CPRS_Page.JobList;
	if(jobList.size()>0) {
		for (WebElement webElement : jobList) {
			
			//System.out.println(jobList.size());
			if(webElement.getText().equals(CPRSJob)) {
				webElement.click();
				break;
			}
		}
	}*/
	
}


@Then("^Enter IC in Create Asset Request as (.*)$")
public void Enter_IC_in_Create_Asset_Request_as(String ARIC) throws Throwable {
	Thread.sleep(1500);
	
	SCM_CPRS_Page.EnterICAR.sendKeys(ARIC, Keys.TAB);
}

@Then("^Enter Job in Create CPRS as (.*)$")
public void Enter_Job_in_Create_CPRS_as(String Job) throws Throwable {
	
	Thread.sleep(1000);
	SCM_CPRS_Page.Job.sendKeys(Job, Keys.TAB);
}




@Then("^Verify to Select Request Category from the List in Create CPRS Page(.*)$")
public void Verify_to_Select_Request_Category_from_the_List_in_Create_CPRS_Page(String Category) throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.Category.click();
	SCM_CPRS_Page.Category.sendKeys(Category, Keys.TAB);
	
/*	List<WebElement> catList = SCM_CPRS_Page.JobList;
	System.out.println(""+catList.size());
	//if(catList.size()>0) {
		for (WebElement webElement : catList) {
			if(webElement.getText().equals(Category)) {
				System.out.println(webElement.getText());
				webElement.click();
				break;
			}
		//}
	}*/
	
}

@Then("^Verify to Select Sub Category from the List in Create CPRS Page(.*)$")
public void Verify_to_Select_Sub_Category_from_the_List_in_Create_CPRS_Page(String subcategory) throws Throwable {

	SCM_CPRS_Page.subcategory.click();
	SCM_CPRS_Page.subcategory.sendKeys(subcategory, Keys.TAB);
	/*List<WebElement> subCatList = SCM_CPRS_Page.JobList;
	if(subCatList.size()>0) {
		for (WebElement webElement : subCatList) {
			if(webElement.getText().equals(subcategory)) {
				webElement.click();
				break;
			}
		}*/
	}
	
//}




@Then("^Enter Job in Create Asset Request as (.*)$")
public void Enter_Job_in_Create_Asset_Request_as(String ARJob) throws Throwable {
	
	
	SCM_CPRS_Page.Job.sendKeys(ARJob, Keys.TAB);
}

@Then("^Enter Request Category in Create CPRS as (.*)$")
public void Enter_Request_Category_in_Create_CPRS_as(String Category) throws Throwable {
	
	Thread.sleep(1000);
	SCM_CPRS_Page.Category.sendKeys(Category, Keys.TAB, Keys.TAB, Keys.ENTER);
}

@Then("^Enter Asset Group in Create CPRS as (.*)$")
public void Enter_Asset_Group_in_Create_CPRS_as(String AssetGroup) throws Throwable {
	Thread.sleep(1500);
	
	SCM_CPRS_Page.AssetGroup.sendKeys(AssetGroup, Keys.TAB);
}


@Then("^Select Asset Attributes in CPRS Create$")
public void Select_Asset_Attributes_in_CPRS_Create() throws Throwable {
	
	SCM_CPRS_Page.AssetAttributes.click();
}

@Then("^Select Asset Make in Asset Attributes as(.*)$")
public void Select_Asset_Make_in_Asset_Attributesy_as(String AssetMake) throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.AssetMake.sendKeys(AssetMake, Keys.TAB);
}

@Then("^Select Asset Model in Asset Attributes as(.*)$")
public void Select_Asset_Model_in_Asset_Attributesy_as(String AssetModel) throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.AssetModel.sendKeys(AssetModel, Keys.TAB);
}

@Then("^Enter Capacity in Asset Attributes as(.*)$")
public void Enter_Capacity_in_Asset_Attributesy_as(String Capacity) throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.Capacity.sendKeys(Capacity);
}

@Then("^Select Post Icon in Asset Attributes$")
public void Select_Post_Icon_in_Asset_Attributes() throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.PostAssetAttributes.click();
}
@Then("^Select Purchase Type in CPRS Create as(.*)$")
public void Select_Purchase_Type_in_CPRS_Create_as(String PurchaseType) throws Throwable {
	Thread.sleep(700);
	SCM_CPRS_Page.PurchaseType.sendKeys(PurchaseType, Keys.TAB);
}

@Then("^Enter Required Quantity in CPRS Create as(.*)$")
public void Enter_Required_Quantity_in_CPRS_Create_as(String RequiredQuantity) throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.RequiredQuantity.sendKeys(RequiredQuantity);
}

@Then("^Select Delivery Schedule in Asset Attributes$")
public void Select_Delivery_Schedule_in_Asset_Attributes() throws Throwable {
	
	SCM_CPRS_Page.DeliverySchedule.click();
}

@Then("^Select Warehouse in CPRS Create as(.*)$")
public void Select_Warehouse_in_CPRS_Create_as(String Warehouse) throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.Warehouse.sendKeys(Warehouse, Keys.TAB);
}

@Then("^Select Warehouse in Asset Request Create as(.*)$")
public void Select_Warehouse_in_Asset_Request_Create_as(String ARWarehouse) throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.WarehouseAR.sendKeys(ARWarehouse, Keys.TAB);
}


@Then("^Enter Required Quantity in Delivery Schedule as(.*)$")
public void Enter_Required_Quantity_in_Delivery_Schedule_as(String RequiredQuantityDS) throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.RequiredQuantityDS.sendKeys(RequiredQuantityDS);
}

@Then("^Select Save Delivery Schedule$")
public void Select_Save_Delivery_Schedule() throws Throwable {
	
	SCM_CPRS_Page.SaveDS.click();
}

@Then("^Select Post Delivery Schedule$")
public void Select_Post_Delivery_Schedule() throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.PostDS.click();
}


@Then("^Enter Suggested Rate in CPRS Create as(.*)$")
public void Enter_Suggested_Rate_in_CPRS_Create_as(String SuggestedRate) throws Throwable {
	SCM_CPRS_Page.SuggestedRate.click();
	SCM_CPRS_Page.SuggestedRate.clear();
	
	SCM_CPRS_Page.SuggestedRate.sendKeys(SuggestedRate, Keys.TAB);
}


@Then("^Select Additional Information in Create CPRS$")
public void Select_Additional_Information_in_Create_CPRS() throws Throwable {
	
	SCM_CPRS_Page.AdditionalInformation.click();
}
@Then("^Select Procurement Justification in Additional Information$")
public void Select_Procurement_Justification_in_Additional_Information() throws Throwable {
	
	SCM_CPRS_Page.ProcurementJustification.click();
}


@Then("^Select Procurement Justification from List in Additional Information$")
public void Select_Procurement_Justification_from_List_in_Additional_Information() throws Throwable {
	
	//SCM_CPRS_Page.selectProcurementJustification.click();
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.selectProcurementJustification);
	
}

@Then("^Select Scope of Work Qlt in Additional Information$")
public void Select_Scope_of_Work_Qlt_in_Additional_Information() throws Throwable {
	
	//SCM_CPRS_Page.selectProcurementJustification.click();
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.UnitofMeasurement);
	
}


@Then("^Enter Deployement Work Attributes in Additional Information as(.*)$")
public void Enter_Deployement_Work_Attributes_in_Additional_Information_as(String DeployementWorkAttributes) throws Throwable {

	
	
	SCM_CPRS_Page.DeployementWorkAttributes.sendKeys(DeployementWorkAttributes, Keys.TAB);
}

@Then("^Select Unit of Measurement in Additional Information as(.*)$")
public void Select_Unit_of_Measurement_in_Additional_Information_as(String UnitofMeasurement) throws Throwable {
	
	SCM_CPRS_Page.UnitofMeasurement.sendKeys(UnitofMeasurement, Keys.TAB);
}


@Then("^Enter Suggested Rate in Additional Information as(.*)$")
public void Enter_Scope_of_Work_Quantity_in_Additional_Information_as(String ScopeofWorkQuantity) throws Throwable {
	Thread.sleep(800);
	SCM_CPRS_Page.ScopeofWorkQuantity.sendKeys(ScopeofWorkQuantity, Keys.TAB);
}
@Then("^Select Post Icon in Additional Information$")
public void Select_Post_Icon_in_Additional_Information() throws Throwable {
	Thread.sleep(800);
	SCM_CPRS_Page.PostAI.click();
}

@Then("^Enter Deployment In Current Job in Create CPRS as(.*)$")
public void Enter_Deployment_In_Current_Job_in_Create_CPRS_as(String DeploymentInCurrentJob) throws Throwable {
	
	SCM_CPRS_Page.DeploymentInCurrentJob.sendKeys(DeploymentInCurrentJob);
}

@Then("^Enter Deployment In Future Job in Create CPRS as(.*)$")
public void Enter_Deployment_In_Future_Job_in_Create_CPRS_as(String DeploymentInFutureJob) throws Throwable {
	
	SCM_CPRS_Page.DeploymentInFutureJob.sendKeys(DeploymentInFutureJob);
}

@Then("^Select Submit Icon in Create CPRS$")
public void Select_Submit_Icon_in_Create_CPRS() throws Throwable {
	Thread.sleep(500);
	SCM_CPRS_Page.Submit.click();
}

@Then("^Move to Scope of work$")
public void Move_to_Scope_of_work() throws Throwable {
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.MovetoScopeofwork);
}

@Then("^Enter Scope of work in Create CPRS as(.*)$")
public void Enter_Scope_of_work_in_Create_CPRS_as(String Scopeofwork) throws Throwable {
	
	SCM_CPRS_Page.Scopeofwork.sendKeys(Scopeofwork);
}

@Then("^Select Save Icon in Create CPRS$")
public void Select_Save_Icon_in_Create_CPRS() throws Throwable {
	
	SCM_CPRS_Page.SaveAuction.click();
}

@Then("^Alert Accept in Create CPRS$")
public void Alert_Accept_in_Create_CPRS() throws Throwable {
	
	SCM_CPRS_Page.AlertAcceptCPRSCreate.click();
	Login_Steps.Logout();
}

@Then("^Select Advance Search in CPRS$")
public void Select_Advance_Search_in_CPRS() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.AdvanceSearch));
	Thread.sleep(600);
	SCM_CPRS_Page.AdvanceSearch.click();
}



@Then("^Select Advance Search in TCD$")
public void Select_Advance_Search_in_TCD() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.AdvanceSearch));
	Thread.sleep(1000);
	SCM_CPRS_Page.AdvanceSearch.click();
}

@Then("^Select Advance Search in Asset Request$")
public void Select_Advance_Search_in_Asset_Request() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.AdvanceSearch));
	SCM_CPRS_Page.AdvanceSearch.click();
}

@Then("^Enter Doc No from CPRS DB$")
public void Enter_Doc_No_from_CPRS_DB() throws Throwable {
	//Thread.sleep(500);
	
	DataBaseConnection.GetCPRSFromDB();
}


@Then("^Enter Doc No from TCD DB$")
public void Enter_Doc_No_from_TCD_DB() throws Throwable {
	//Thread.sleep(500);
	 //EIP_Menu.DocTCD.click();
	DataBaseConnection.GetTCDFromDBApproval();
}


@Then("^Enter TCD No from TCD DB for Re Create TCD$")
public void Enter_TCD_No_from_TCD_DB_for_Re_Create_TCD() throws Throwable {
	Thread.sleep(1000);
	 //EIP_Menu.DocTCD.click();
	DataBaseConnection.GetRejectTCDFromDB();
}

@Then("^Edit and Re Create TCD$")
public void Edit_and_Re_Create_TCD() throws Throwable {
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.MOTCDRejectfilter));
	Thread.sleep(500);
	Actions actions = new Actions(Webdriver.driver);
	Thread.sleep(1000);
	actions.moveToElement(EIP_Menu.MOTCDRejectfilter);
	actions.perform();
	
	System.out.println("Mouse Over to TCD Number");
	
	Thread.sleep(1000);
	try {
		EIP_Menu.EditTCD.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.EditTCD);

	}
	
	System.out.println("Select Edit icon in TCD Reject Menu");
	
	
}

@Then("^Select Vendor in TDC Edit after Reject the TCD$")
public void Select_Vendor_in_TDC_Edit_after_Reject_the_TCD() throws Throwable {
	Thread.sleep(500);
	try {
		EIP_Menu.SelectVendorEditTCD.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.SelectVendorEditTCD);

	}
	
	Thread.sleep(500);
	try {
		EIP_Menu.ServCate.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.ServCate);

		
	
	}
	
	System.out.println("Select Vendor in TDC Edit after Reject the TCD");
	
	Thread.sleep(500);
	try {
		EIP_Menu.SelectGo.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.SelectGo);

		
	
	}
	System.out.println("Select Go button in TDC Edit after Reject the TCD");
	
	Thread.sleep(500);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.TCDSubmit);
	
	
	
}


@Then("^Select Vendor in Save Draft RFQ number to Create TCD$")
public void Select_Vendor_in_Save_Draft_RFQ_number_to_Create_TCD() throws Throwable {
	Thread.sleep(500);
	try {
		EIP_Menu.SelectVendorEditTCD.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.SelectVendorEditTCD);

	}
	
	Thread.sleep(500);
	try {
		EIP_Menu.ServCate.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.ServCate);

		
	
	}
	
	System.out.println("Select Vendor in Save Draft RFQ number");
	
	Thread.sleep(500);
	try {
		EIP_Menu.SelectGo.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.SelectGo);

		
	
	}
	System.out.println("Select Go Button in Save Draft RFQ number TCD Create");
	
	Thread.sleep(500);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.TCDSubmit);
	
	
	
}






@Then("^Enter Doc No from Asset Request DB$")
public void Enter_Doc_No_from_Asset_Request_DB() throws Throwable {
	//Thread.sleep(500);
	
	DataBaseConnection.GetAssetRequestARCARFirstAndSecondLavelFromDB();
}
///112

@Then("^Enter PR Doc No from Asset Request DB$")
public void Enter_PR_Doc_No_from_Asset_Request_DB() throws Throwable {
	//Thread.sleep(500);
	
	DataBaseConnection.SendPRFromDB();
}


@Then("^Enter AR PR Doc No from Asset Request DB$")
public void Enter_AR_PR_Doc_No_from_Asset_Request_DB() throws Throwable {
	//Thread.sleep(500);
	Thread.sleep(2000);
	DataBaseConnection.AssetRequestPRFromDB();
}


@Then("^Enter PR Num Asset Request Allocation Advance Search from DB$")
public void Enter_PR_Num_Asset_Request_Allocation_Advance_Search_from_DB() throws Throwable {
	//Thread.sleep(500);
	Thread.sleep(2000);
	DataBaseConnection.GetPRAssetRequestAllocationFromDB();
}




@Then("^Enter CPRS Number From DB to Create Asset Request$")
public void Enter_CPRS_Number_From_DB_to_Create_Asset_Request() throws Throwable {
	Thread.sleep(1500);
	
	DataBaseConnection.GetCPRSFromDBAR();
}

@Then("^Select CPRS Search Icon in Workbench For Action$")
public void Select_CPRS_Search_Icon_in_Workbench_For_Action() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.SearchIcon));
	//SCM_CPRS_Page.SearchIcon.click();
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.SearchIcon);

}


@Then("^Select TCD Search Icon in Advance Search$")
public void Select_TCD_Search_Icon_in_Advance_Search() throws Throwable {
	//wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.SearchIcon));
	//SCM_CPRS_Page.SearchIcon.click();
	
	Thread.sleep(2500);
		
	try {
		SCM_CPRS_Page.SearchIcon.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", EIP_Menu.SearchIcon);

	}

}

@Then("^Select AR Search Icon in Workbench For Action$")
public void Select_AR_Search_Icon_in_Workbench_For_Action() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.ARSearchIcon));
	SCM_CPRS_Page.ARSearchIcon.click();
	/*JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.ARSearchIcon);
*/
}

@Then("^Select Reject TCD Number Work Bench$")
public void Select_Reject_TCD_Number_Work_Bench() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DocNo));
	Thread.sleep(500);
	Actions actions = new Actions(Webdriver.driver);
	Thread.sleep(3000);
	actions.moveToElement(EIP_Menu.DocNo);
	actions.perform();

	
	Thread.sleep(2000);
	
	
		
	try {
		SCM_CPRS_Page.TCDReject.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", SCM_CPRS_Page.TCDReject);

	}
	
	Thread.sleep(500);
	
	System.out.println("TCD Reject Alert Text = " + SCM_CPRS_Page.TCDRejectAlertText.getText());

	Thread.sleep(1500);
	
	
	try {
		SCM_CPRS_Page.TCDRejectAlertAccept.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", SCM_CPRS_Page.TCDRejectAlertAccept);

	}
	Login_Steps.Logout();

}


@Then("^Enter Remarks When Reject TCD Number in Work Bench$")
public void Enter_Remarks_when_Reject_TCD_in_Number_Work_Bench() throws Throwable {
	
	Thread.sleep(2000);
	
	try {
		SCM_CPRS_Page.TCDReject.click();
	} catch (Exception e) {
		jse.executeScript("arguments[0].click();", SCM_CPRS_Page.TCDReject);

	}
	
	Commoncontrol.eAuctionAlert();
	
	Thread.sleep(500);
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.MovetoReceivedDate);
	Thread.sleep(2000);
		
	
		SCM_CPRS_Page.TCDRemarks.sendKeys(ConfigFileReader.getTCD_RejectRemarks());
	
	
	
	
	//Commoncontrol.eAuctionAlert();

}






@Then("^Move to View Details$")
public void Move_to_View_Details() throws Throwable {
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.ViewDetails);
}


@Then("^Move to View Details TCD$")
public void Move_to_View_Details_TCD() throws Throwable {
	Thread.sleep(2500);
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.ViewDetails);
}

@Then("^Select TCD Approval button$")
public void Select_TCD_Approval_button() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAppBut));
	Thread.sleep(800);
	EIP_Menu.SelectAppBut.click();

}




@Then("^Select CPRS Number in Workbench For Action$")
public void Select_CPRS_Number_in_Workbench_For_Action() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.SelectCPRSNum));
	SCM_CPRS_Page.SelectCPRSNum.click();

}
@Then("^Select Asset Request Number in Workbench For Action$")
public void Select_Asset_Request_Number_in_Workbench_For_Action() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.SelectARNum));
	SCM_CPRS_Page.SelectARNum.click();

}

@Then("^Select Approve icon in Asset Request$")
public void Select_Approve_icon_in_Asset_Request() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.ARApprove));
	SCM_CPRS_Page.ARApprove.click();

}



@Then("^Move to Approve Icon in Workbench For Action$")
public void Select_Search_Icon_in_Workbench_For_Action() throws Throwable {
	Thread.sleep(800);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.MoveToAPP);

}

@Then("^Select Quantity Allocation in Capital purchase request and sanction$")
public void Select_Quantity_Allocation_in_Capital_purchase_request_and_sanction() throws Throwable {
	Thread.sleep(800);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.QuantityAllocation);
	Thread.sleep(5000);
	//SCM_CPRS_Page.QuantityAllocation.click();
	try {
		SCM_CPRS_Page.QuantityAllocation.click();
		} catch (Exception e) {
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click();", SCM_CPRS_Page.QuantityAllocation);
		}
}




@Then("^Select CPRS Approve icon in Capital purchase request and sanction$")
public void Select_CPRS_Approve_icon_in_Capital_purchase_request_and_sanction() throws Throwable {
	
	//SCM_CPRS_Page.selectProcurementJustification.click();
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.CPRSApprove);

	
}
@Then("^Enter Comments in Comments For Approve as(.*)$")
public void Enter_Comments_in_Comments_For_Approve_as(String Comment) throws Throwable {
	
	SCM_CPRS_Page.Cmd.sendKeys(Comment);
}
@Then("^Select Save icon Comments For Approve$")
public void Select_Save_icon_Comments_For_Approve() throws Throwable {
	
	//SCM_CPRS_Page.selectProcurementJustification.click();
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.SaveCmd);
	
}

@Then("^Enter Sanction Quantity in Quantity Allocation as(.*)$")
public void Enter_Sanction_Quantity_in_Quantity_Allocation_as(String SanctionQuantity) throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.SanctionQuantity.sendKeys(SanctionQuantity);
}

@Then("^Enter Sanction Quantity Remarks in Quantity Allocation as(.*)$")
public void Enter_Sanction_Quantity_Remarks_in_Quantity_Allocation_as(String QntRemarks) throws Throwable {
	
	SCM_CPRS_Page.QntRemarks.sendKeys(QntRemarks);
}

@Then("^Select Save icon in Quantity Allocation$")
public void Select_Save_icon_in_Quantity_Allocation() throws Throwable {
	
	//SCM_CPRS_Page.selectProcurementJustification.click();
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.SaveQulAll);
	

	
	
}
@Then("^Alert Accept in CPRS Approval$")
public void Alert_Accept_in_CPRS_Approval() throws Throwable {
	
	SCM_CPRS_Page.AlertAcceptCPRS.click();
	Login_Steps.Logout();
}

@Then("^Alert Accept in Asset Request Approval$")
public void Alert_Accept_in_Asset_Request_Approval() throws Throwable {
	
	SCM_CPRS_Page.AlertAcceptCPRS.click();
	Login_Steps.Logout();
}

@Then("^Select Budget Allocation in Capital purchase request and sanction$")
public void Select_Budget_Allocation_in_Capital_purchase_request_and_sanction() throws Throwable {
	Thread.sleep(800);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.BudgetAllocation);
	Thread.sleep(500);
	SCM_CPRS_Page.BudgetAllocation.click();
}

@Then("^Select Sanction Reference Number in Budget Allocation$")
public void Select_Sanction_Reference_Number_in_Budget_Allocation() throws Throwable {
	
	SCM_CPRS_Page.SanctionReferenceNumber.click();
	SCM_CPRS_Page.SanctionReferenceNumber.sendKeys(Keys.TAB);
}

@Then("^Select Sanction Reference Number in Budget Allocation PM$")
public void Select_Sanction_Reference_Number_in_Budget_Allocation_PM() throws Throwable {
	
	SCM_CPRS_Page.SanctionReferenceNumber.click();
	SCM_CPRS_Page.SanctionPM.click();
}


@Then("^Enter Estimation Cost Of Acquisition  Per Equipment in Budget Allocation as(.*)$")
public void Enter_Estimation_Cost_Of_Acquisition_Per_Equipment_in_Budget_Allocation(String EstimationCostOfAcquisition) throws Throwable {
	
	
	SCM_CPRS_Page.EstimationCostOfAcquisition.sendKeys(EstimationCostOfAcquisition);
}

@Then("^Select Cash Out flow Quarter in Budget Allocation$")
public void Select_Cash_Out_flow_Quarter_in_Budget_Allocation() throws Throwable {
	
	SCM_CPRS_Page.CashOutflowQuarter.click();


}
@Then("^Select Add Cash Out flow Quarter in Budget Allocation$")
public void Select_Add_Cash_Out_flow_Quarter_in_Budget_Allocation() throws Throwable {
	
	SCM_CPRS_Page.AddCashOutflowQuarter.click();


}

@Then("^Enter Cash Out flow Quarter in Budget Allocation as(.*)$")
public void Enter_Cash_Out_flow_Quarter_in_Budget_Allocation(String EnterCashOutflowQuarter) throws Throwable {
	
	SCM_CPRS_Page.EnterCashOutflowQuarter.sendKeys(EnterCashOutflowQuarter, Keys.TAB);


}
@Then("^Enter Cash flow Amount in Budget Allocation as(.*)$")
public void Enter_Cash_flow_Amount_in_Budget_Allocation(String EnterCashflowAmount) throws Throwable {
	Thread.sleep(800);
	SCM_CPRS_Page.EnterCashflowAmount.click();
	SCM_CPRS_Page.EnterCashflowAmount.clear();
	SCM_CPRS_Page.EnterCashflowAmount.sendKeys(EnterCashflowAmount);

}
@Then("^Select Post Icon in Cash Quarter$")
public void Select_Post_Icon_Cash_Quarter_in_Budget_Allocation() throws Throwable {
	
	SCM_CPRS_Page.SelectPostCashQuarter.click();

}
@Then("^Select Post Icon in Budget Allocation$")
public void Select_Post_Icon_in_Budget_Allocation() throws Throwable {
	
	SCM_CPRS_Page.SelectPostBudgetAllocation.click();

}

@Then("^Select Technical Evaluation in Capital purchase request and sanction$")
public void Select_Technical_Evaluation_in_Capital_purchase_request_and_sanction() throws Throwable {
	Thread.sleep(800);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.SelectTechnicalEvaluation);
	Thread.sleep(500);
	SCM_CPRS_Page.SelectTechnicalEvaluation.click();
}

@Then("^Select Suggested Make Mode in Technical Evaluation$")
public void Select_Suggested_Make_Mode_in_Technical_Evaluation() throws Throwable {
	Thread.sleep(800);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView();", SCM_CPRS_Page.SuggestedMakeMode);
	
	
	Thread.sleep(800);
	SCM_CPRS_Page.SuggestedMakeMode.click();
}

@Then("^Enter Asset Make in Suggested Make Mode as(.*)$")
public void Enter_Asset_Make_in_Suggested_Make_Mode_as(String AssetMakeSuggestedMakeMode) throws Throwable {
	
	SCM_CPRS_Page.AssetMakeSuggestedMakeMode.sendKeys(AssetMakeSuggestedMakeMode, Keys.TAB);


}
@Then("^Enter Asset Model in Suggested Make Mode as(.*)$")
public void Enter_Asset_Model_in_Suggested_Make_Mode_as(String AssetModelSuggestedMakeMode) throws Throwable {
	
	SCM_CPRS_Page.AssetModelSuggestedMakeMode.sendKeys(AssetModelSuggestedMakeMode, Keys.TAB);


}

@Then("^Enter Quantity in Suggested Make Mode as(.*)$")
public void Enter_Quantity_in_Suggested_Make_Mode_as(String Quantity) throws Throwable {
	Thread.sleep(800);
	SCM_CPRS_Page.Quantity.click();
	SCM_CPRS_Page.Quantity.clear();
	SCM_CPRS_Page.Quantity.sendKeys(Quantity);

}
	
@Then("^Select Post Icon in Technical Evaluation$")
public void Select_Post_Icon_in_Technical_Evaluation() throws Throwable {
	
	SCM_CPRS_Page.PostTechnicalEvaluation.click();
}

@Then("^Select Submit Icon in Technical Evaluation$")
public void Select_Submit_Icon_in_Technical_Evaluation() throws Throwable {
	
	SCM_CPRS_Page.SubmitTechnicalEvaluation.click();
}

@Then("^Enter Decision Criteria in Technical Evaluation as(.*)$")
public void Enter_Decision_Criteria_in_Technical_Evaluation(String DecisionCriteria) throws Throwable {
	Thread.sleep(800);
	
	((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", SCM_CPRS_Page.DecisionCriteria);
	SCM_CPRS_Page.DecisionCriteria.sendKeys(DecisionCriteria);
	
}



@Then("^Select Go Icon in Create Asset Request$")
public void Select_Go_Icon_in_Create_Asset_Request() throws Throwable {
	
	SCM_CPRS_Page.Go.click();
}

@Then("^Verify Go Icon is Active to Add the Details in Create Asset Request$")
public void Verify_Go_Icon_is_Active_to_Add_the_Details_in_Create_Asset_Request() throws Throwable {
	
	assertEquals("Go", SCM_CPRS_Page.Go.getText());
	 
	System.out.println("Button Text = "+SCM_CPRS_Page.Go.getText());
	
	assertEquals(true, SCM_CPRS_Page.Go.isEnabled());
	
	SCM_CPRS_Page.Go.click();
}


@Then("^Enter Asset Group in Create Asset Request as(.*)$")
public void Enter_Asset_Group_in_Create_Asset_Request_as(String ARAssetGroup) throws Throwable {
	Thread.sleep(5000);
	SCM_CPRS_Page.ARAssetGroup.sendKeys(ARAssetGroup);
	Thread.sleep(5000);
	SCM_CPRS_Page.ARAssetGroup.sendKeys(Keys.TAB);

}

@Then("^Enter Material in Create Asset Request as(.*)$")
public void Enter_Material_in_Create_Asset_Request_as(String Material) throws Throwable {
/*	Thread.sleep(500);
	SCM_CPRS_Page.Material.sendKeys(Material);
	Thread.sleep(3000);
	SCM_CPRS_Page.Material.sendKeys(Keys.TAB);*/
	//wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.listOfMaterial));
	Thread.sleep(500);
	SCM_CPRS_Page.Material.sendKeys("0");
	Thread.sleep(500);
	SCM_CPRS_Page.Material.sendKeys("0");
	Thread.sleep(500);
	SCM_CPRS_Page.Material.sendKeys("0");
	Thread.sleep(500);
	SCM_CPRS_Page.Material.sendKeys("0");
	Thread.sleep(500);
	SCM_CPRS_Page.Material.sendKeys("0");
	
	Thread.sleep(2000);
	SCM_CPRS_Page.Material.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	/*
	List<WebElement> materiallist = SCM_CPRS_Page.listOfMaterial;
	for (WebElement webElement : materiallist) {
		if(webElement.getText().substring(0, 14).equalsIgnoreCase("0C51M0001000000")) {
			webElement.click();
			break;
		}
	}*/
}


	
	
	/*	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.Material);
	SCM_CPRS_Page.Material.sendKeys(Material);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_BACK_SPACE);
	//robot.keyPress(KeyEvent.VK_BACK_SPACE);
	SCM_CPRS_Page.Material.sendKeys("0", Keys.ARROW_DOWN, Keys.ENTER);*/

//}


@Then("^Enter AR Quantity in Create Asset Request as(.*)$")
public void Enter_AR_Quantity_in_Create_Asset_Request_as(String ARQuantity) throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.ARQuantity.sendKeys(ARQuantity);

}

@Then("^Select Delivery Schedule in Create Asset Request$")
public void Select_Delivery_Schedule_in_Create_Asset_Request() throws Throwable {
	Thread.sleep(3000);
	SCM_CPRS_Page.ARDeliverySchedule.click();
}

@Then("^Enter AR Required Quantity in Delivery Schedule as(.*)$")
public void Enter_AR_Required_Quantity_in_Delivery_Schedule_as(String ARRequiredQuantity) throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.ARRequiredQuantity.sendKeys(ARRequiredQuantity);

}

@Then("^Select Save icon in Delivery Schedule$")
public void Select_Save_icon_in_Delivery_Schedule() throws Throwable {
	Thread.sleep(1000);
	SCM_CPRS_Page.ARSaveDS.click();
}

@Then("^Select AR Save icon in Delivery Schedule$")
public void Select_AR_Save_icon_in_Delivery_Schedule() throws Throwable {
	
	SCM_CPRS_Page.ARRSaveDS.click();
}

@Then("^Enter AR suggested Rate in Asset Request Details as(.*)$")
public void Enter_AR_suggested_Rate_in_Asset_Request_Details_as(String ARsuggestedRate) throws Throwable {
	Thread.sleep(800);
	SCM_CPRS_Page.ARsuggestedRate.sendKeys(ARsuggestedRate, Keys.TAB);

}

@Then("^Select Save icon Asset Request Details in Create Asset Request$")
public void Select_Save_icon_Asset_Request_Details_in_Create_Asset_Request() throws Throwable {
	
	SCM_CPRS_Page.SaveAssetRequestDetails.click();

}

@Then("^Select Submit icon in Create Asset Request$")
public void Select_Submit_icon_in_Create_Asset_Request() throws Throwable {
	
	SCM_CPRS_Page.SubmitCreateAssetRequest.click();
	//Login_Steps.Logout();

}

@Then("^Select Advance Search in eSource Allocation$")
public void Select_Advance_Search_in_eSource_Allocation() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(SCM_CPRS_Page.AdvanceSearchGC));
	
	
	JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	js.executeScript("arguments[0].click()", SCM_CPRS_Page.AdvanceSearchGC);
}

@Then("^In Asset Request Choose your buyers in Need To Allocate$")
public void In_Asset_RequestChoose_your_buyers_in_Need_To_Allocate() throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	//wait.until(ExpectedConditions.elementToBeClickable(SCM_Purchase_Request.Chooseyourbuyers));
	Thread.sleep(1000);
	 SCM_CPRS_Page.ARChooseyourbuyers.click();
}


@Then("^Enter TCD in Search Menu as(.*)$")
public void Enter_TCD_in_Search_Menu_as(String SendTCD) throws Throwable {
	SCM_CPRS_Page.SearchMenuTCD.sendKeys(SendTCD);


}

@Then("^select TCD in Search Menu$")
public void select_TCD_in_Search_Menu() throws Throwable {
	SCM_CPRS_Page.selectTCDCD.click();


}




@Then("^select material in tcd$")
public void select_material_in_tcd() throws Throwable {
	SCM_CPRS_Page.selectmaterialtcd.click();


}
@Then("^select Menu in Home$")
public void select_Menu_in_Home() throws Throwable {
	SCM_CPRS_Page.Menu.click();


}
@Then("^select Asset Mgmt in Home$")
public void select_Asset_Mgmt_in_Home() throws Throwable {
	SCM_CPRS_Page.AssetMgmt.click();


}



@Then("^select Asset Mgmt tree in Home$")
public void select_Asset_Mgmt_tree_in_Home() throws Throwable {
	SCM_CPRS_Page.Assettree.click();


}


 @Then("^Navigate To AMSDocument$")
public void Navigate_To_AMS_Document() throws Throwable {
	SCM_CPRS_Page.AMSDoc.click();


}


}
