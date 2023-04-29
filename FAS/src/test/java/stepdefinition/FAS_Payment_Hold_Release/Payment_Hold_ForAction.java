package stepdefinition.FAS_Payment_Hold_Release;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnField;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import stepdefinition.Webdriver;

public class Payment_Hold_ForAction {
	
static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30); 
	
	public static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	
	static boolean status;
	public static int Payment_Hold_Amnt;
	
	public Payment_Hold_ForAction() {

		PageFactory.initElements(Webdriver.driver, object_repository.Praveen.object_repository.class);
	}
	
	@Then("^user should able to Click to Create hold Payment Hold Release page$")
	public static void user_should_able_to_Click_to_Create_hold_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Create));
		status = object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Create.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_Release_ForAction_Create is Enabled");
		Thread.sleep(4000);
		object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Create.click();
		System.out.println("Payment Hold Release page Payment_Hold_Release_ForAction_Create is Enabled");
		Thread.sleep(3000);
		
	}
	
	@Then("^user should able to Click to Create Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Click_to_Create_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Create_ReleasebleDedutions));
		status = object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Create_ReleasebleDedutions.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_Release_ForAction_Create_ReleasebleDedutions is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Create_ReleasebleDedutions.click();
		System.out.println("Payment Hold Release page Payment_Hold_Release_ForAction_Create_ReleasebleDedutions is Enabled");
	}

	
	@Then("^user should able to Click to Select Releaseble Dedutions Vendor Payment Hold Release page$")
	public static void user_should_able_to_Click_to_Select_Releaseble_Dedutions_Vendor_Payment_Hold_Release_page() throws Throwable {
		 if(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor));
				status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.isEnabled();
				assertTrue(status);
				Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor is Enabled");
				try {
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.click();
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.sendKeys(ConfigFileReader.getVendor_Code());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.sendKeys(Keys.TAB);
				
					 
				}catch (Exception e) {
					Thread.sleep(2000);
					js.executeScript("arguments[0].click();",object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.sendKeys(ConfigFileReader.getVendor_Code());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor.sendKeys(Keys.TAB);
				}
				  
				  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor is Enabled.");
				  }else {			  
					  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor is not Enabled");
				  }
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor is Enabled");
	}
	
	@Then("^user should able to capture Releaseble Dedutions Date Payment Hold Release page$")
	public static void user_should_able_to_capture_Releaseble_Dedutions_Date_Payment_Hold_Release_page() throws Throwable {
		 if(object_repository.Praveen.object_repository.RD_Date.isEnabled()) {
//			Actions action=new Actions(Webdriver.driver);	
			 wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.RD_Date));
				status = object_repository.Praveen.object_repository.RD_Date.isEnabled();
				assertTrue(status);
				Reporter.addScenarioLog("Payment Hold Release page RD_Date is Enabled");
				try {
//					object_repository.Praveen.object_repository.RD_Date.click();
//					action.sendKeys(Keys.CLEAR).perform();
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.RD_Date.sendKeys(ConfigFileReader.getSchedule_Date());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.RD_Date.sendKeys(Keys.TAB);
				
					 
				} catch (Exception e) {
					Thread.sleep(2000);
//					js.executeScript("arguments[0].click();",object_repository.Praveen.object_repository.RD_Date);
//					action.sendKeys(Keys.CLEAR).perform();
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.RD_Date.sendKeys(ConfigFileReader.getSchedule_Date());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.RD_Date.sendKeys(Keys.TAB);
				}
				  
				  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page RD_Date is Enabled.");
				  }else {			  
					  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page RD_Date is not Enabled");
				  }
		System.out.println("Payment Hold Release page RD_Date is Enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_CalendarClick));
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_CalendarClick.click();
	
	}
	
	
	@Then("^user should able to Select INR Currency Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Select_INR_Currency_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		
		 if(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency));
				status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.isEnabled();
				assertTrue(status);
				Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_currency is Enabled");
				try {
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.click();
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.sendKeys(ConfigFileReader.getCurrency());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.sendKeys(Keys.TAB);
				
					 
				}catch (Exception e) {
					Thread.sleep(2000);
					js.executeScript("arguments[0].click();",object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.sendKeys(ConfigFileReader.getCurrency());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_currency.sendKeys(Keys.TAB);
				}
				  
				  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_currency INR is Enabled.");
				  }else {			  
					  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_currency INR is not Enabled");
				  }
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_currency INR is Enabled");
	
	}
	

	@Then("^user should able to Search Document No Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Search_Document_No_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		
		 if(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo));
				status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.isEnabled();
				assertTrue(status);
				Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo is Enabled");
				try {
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.click();
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.sendKeys(ConfigFileReader.getDocument_No());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.sendKeys(Keys.TAB);
				
					 
				}catch (Exception e) {
					Thread.sleep(2000);
					js.executeScript("arguments[0].click();",object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.sendKeys(ConfigFileReader.getDocument_No());
					Thread.sleep(2000);
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo.sendKeys(Keys.TAB);
				}
				  
				  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo is Enabled.");
				  }else {			  
					  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo is not Enabled");
				  }
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo is Enabled");
	
	}
	
	
	@Then("^user should able to Click Search button Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Click_Search_button_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_SearchBtn));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_SearchBtn.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_SearchBtn is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_SearchBtn.click();
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_SearchBtn is Enabled");
	}
	
	//27.10.2022 - Test
	
	@Then("^user should able to select first Doc Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_select_first_Doc_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_ItemsSearchNo1));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_ItemsSearchNo1.isEnabled();
		assertTrue(status);
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_ItemsSearchNo1.isEnabled()) {
			try {
				object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_ItemsSearchNo1.click();
			} catch (Exception e) {
				js.executeScript("arguments.click();",object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_ItemsSearchNo1);
			}
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_SelectPass));
			status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_SelectPass.isEnabled();
			assertTrue(status);
			Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_SelectPass is Enabled");
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_SelectPass.click();
			System.out.println("Payment Hold Release page ForAction_Create_RD_SelectPass is Enabled");
			
			
		} else {
			System.out.println("None of the Releasable Deduction Document is available");
		}
		
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_ItemsSearchNo1 is Enabled");
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_ItemsSearchNo1 is Enabled");
	
	
	
	}
	
	@Then("^user should able to Click Post button Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Click_Post_button_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Post));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Post.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Post is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Post.click();
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Post is Enabled");
	}

	// ''' 
	
	
	@Then("^user should able to Capture HoldType Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Capture_HoldType_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldType));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldType.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_HoldType is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldType.click();
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_HoldType is Enabled");

		//
		
	/*	List<WebElement> DropdownResult = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HT_dropdown;
		for (WebElement webElement : DropdownResult) {
			if(webElement.getText().equals(ConfigFileReader.getHold_Type())) {
				System.out.println("Selected Hold Type is :" +webElement.getText());
				webElement.click();
				break;*/
		
	List<WebElement> DropdownResult = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HT_dropdown;
	for (WebElement webElement : DropdownResult) {
		Thread.sleep(3000);
		System.out.println("List of Hold Type = "+ webElement.getText());
		Thread.sleep(3000);
		if(webElement.getText().equals(ConfigFileReader.getHold_Type())){
			System.out.println("Selected Hold Type is :" + webElement.getText());
			webElement.getText();
			webElement.click();
			break;
			}else {
				System.out.println("Hold Amount is not available in Hold Type list");
				}
			}	 System.out.println("Hold Amount is available in Hold Type list");
	System.out.println("===========================");
			Screenshot.Screenshotforscenario();
//			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldType));
//			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldType.sendKeys(Keys.TAB);
			Actions action=new Actions(Webdriver.driver);
			action.sendKeys(Keys.TAB);
		//
		
//	if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HT_HldAmount.isDisplayed()) {
//		 try {
//			 object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HT_dropdown.click();
//		} catch (Exception e) {
//			js.executeScript("arguments[0].click();",object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HT_dropdown);
//		}
//		
	}
	
	@Then("^user should able to Send Hold Value Amount in Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Send_Hold_Value_Amount_in_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldValue));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldValue.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_HoldValue is Enabled");
//		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldValue.click();
		Thread.sleep(2000);
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_HoldValue.sendKeys(ConfigFileReader.getHold_Value());
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_HoldValue is Enabled");
	Thread.sleep(3000);
	Screenshot.Screenshotforscenario();
	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Remarks.click();
	if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes));
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
		System.out.println("Excess hold value in this invoice will be adjusted against total due payment on release. Do you want to proceed? -- >  Pop-up msg will be handled");
	} else {
System.out.println("pop-up msg is not displayed");
	}
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Remarks));
	status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Remarks.isEnabled();
	assertTrue(status);
	Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Remarks is Enabled");
//	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Remarks.click();
	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Remarks.sendKeys(ConfigFileReader.getRemarks_Pk());
	System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Remarks is Enabled");
	
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Clone));
	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Clone.click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Dlt2));
	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Dlt2.click();
	if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
		
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
		System.out.println("Pop-up msg will be handled & clone will be deleted");
	} else {
System.out.println("pop-up msg is not displayed");
	}
	
	}
	
	@Then("^user should able to Select Submit button Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Select_Submit_button_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Submit is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Submit is Enabled");
		Screenshot.Screenshotforscenario();
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
			
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
			System.out.println("Pop-up msg will be handled & clone will be deleted");
		} else {
	System.out.println("pop-up msg is not displayed");
		}Screenshot.Screenshotforscenario();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_DocTraceInfo));
	status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_DocTraceInfo.isEnabled();
	assertTrue(status);
	Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_DocTraceInfo is Enabled");
	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_DocTraceInfo.click();
	System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_DocTraceInfo is Enabled");
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Popup_Close));
	object_repository.Praveen.object_repository.Popup_Close.click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Popup_Close));
	object_repository.Praveen.object_repository.Popup_Close.click();
	Thread.sleep(3000);
	
	}
	
	@Then("^user should able to navigate InProgress Tab Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_navigate_InProgress_Tab_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_Release_InProgressTab));
		status = object_repository.Praveen.object_repository.Payment_Hold_Release_InProgressTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_Release_InProgressTab is Enabled");
		Thread.sleep(3000);
		object_repository.Praveen.object_repository.Payment_Hold_Release_InProgressTab.click();
		System.out.println("Payment Hold Release page Payment_Hold_Release_InProgressTab is Enabled");
	}
	
	
	//05.11.2022
	
	@Then("^user should able to select Doc InProgress Tab Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_select_Doc_InProgress_Tab_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
	Thread.sleep(3000);		
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Filter));
		
		try {
			object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Filter.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();",object_repository.Praveen.object_repository.Payment_Hold_Release_ForAction_Filter);
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_Filter_Reqno));
		object_repository.Praveen.object_repository.Payment_Release_Filter_Reqno.sendKeys(ConfigFileReader.getHold_ReqNumber());
	System.out.println("Given Request No : "+ConfigFileReader.getHold_ReqNumber());
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_InprogressDoc1));
		status = object_repository.Praveen.object_repository.Payment_Release_InprogressDoc1.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Release_InprogressDoc1 is Enabled");
		object_repository.Praveen.object_repository.Payment_Release_InprogressDoc1.click();
		System.out.println("Payment Hold Release page Hold Document is Enabled in InProgress Tab");
		
	}
	//
	
	@Then("^user should able to Verify Doc Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_Verify_Doc_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_InprogressDoc1));
		status = object_repository.Praveen.object_repository.Payment_Release_InprogressDoc1.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Release_InprogressDoc1 is Enabled");
		object_repository.Praveen.object_repository.Payment_Release_InprogressDoc1.click();
		System.out.println("Payment Hold Release page Hold Document is Enabled in InProgress Tab");
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_DocNoTxt));
		object_repository.Praveen.object_repository.Payment_Release_DocNoTxt.getText();
		System.out.println("Payment Hold Document No. :"+object_repository.Praveen.object_repository.Payment_Release_DocNoTxt.getText());
		
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Praveen.object_repository.Payment_Release_DocPopup).perform();
		Thread.sleep(3000);
		if (object_repository.Praveen.object_repository.Payment_Release_DocPopup.isEnabled()) {
			try {
				object_repository.Praveen.object_repository.Payment_Release_DocPopup_HoldType.getText();
				System.out.println("Selected Hold Type is :"+object_repository.Praveen.object_repository.Payment_Release_DocPopup_HoldType.getText());
			} catch (Exception e) {
				System.out.println("Hold type is enabled");
			}
		} else {
System.out.println("Hold Type not Enabled");
		}
		
	if (object_repository.Praveen.object_repository.Payment_Release_DocPopup.isEnabled()) {
		try {
			object_repository.Praveen.object_repository.Payment_Release_DocPopup_HoldValue.getText();
			System.out.println("Selected Hold Value is :" +object_repository.Praveen.object_repository.Payment_Release_DocPopup_HoldValue.getText());
		} catch (Exception e) {
			System.out.println("Hold Value is enabled");
		}
	} else {
System.out.println("Hold Value not Displayed");
	}	
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_DocReference));
	status = object_repository.Praveen.object_repository.Payment_Release_DocReference.isEnabled();
	assertTrue(status);
	Reporter.addScenarioLog("Payment Hold Release page Payment_Release_DocReference is Enabled");
	object_repository.Praveen.object_repository.Payment_Release_DocReference.click();
	System.out.println("Payment Hold Release page Hold Document Reference is Enabled in InProgress Tab");
	Thread.sleep(3000);
//    List<WebElement> p=Webdriver.driver.findElements(By.xpath(object_repository.Praveen.object_repository.Payment_Release_DocRef_History));
//    //getText() to obtain text
//    String s= ((WebElement) p).getText();
    System.out.println("Text content is : " + object_repository.Praveen.object_repository.Payment_Release_DocRef_History);
	/*System.out.println("Method No 1");
    List<WebElement> selectFromJob = Webdriver.driver.findElements(By.xpath(object_repository.Praveen.object_repository.Payment_Release_DocRef_History));
	for (WebElement webElement : selectFromJob) {
		Thread.sleep(3000);System.out.println("Method No 2");
		System.out.println("List of jobs = "+ webElement.getText());
		if(webElement.getText().equals("Hold & Release History")){
			System.out.println("Method No 1");
			webElement.getText();
			webElement.click();
			break;
			
		}	
	}	
	System.out.println("Method No 3");*/
	
	/*wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_DocRef_History));
	status = object_repository.Praveen.object_repository.Payment_Release_DocRef_History.isEnabled();
	assertTrue(status);
	Reporter.addScenarioLog("Payment Hold Release page Payment_Release_DocRef_History is Enabled");
	object_repository.Praveen.object_repository.Payment_Release_DocRef_History.getText();
	System.out.println("View :"+	object_repository.Praveen.object_repository.Payment_Release_DocRef_History.getText());*/
	
	
	
	System.out.println("Payment Hold Release page Hold Document Reference History is Enabled in InProgress Tab");
	
	if (object_repository.Praveen.object_repository.Payment_Release_DocRef_HistoryActionBy.equals("VINOTH KUMAR P ")) {
		object_repository.Praveen.object_repository.Payment_Release_DocRef_HistoryActionBy.getText();
		System.out.println("Requested Date :"+	object_repository.Praveen.object_repository.Payment_Release_DocRef_HistoryActionBy.getText());
		System.out.println("Payment Hold Release page Hold Document Reference Action Taken By is Enabled in InProgress Tab");
	} else {
System.out.println("Action not Taken By VINOTH KUMAR P");
	}
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Popup_Close));
	object_repository.Praveen.object_repository.Popup_Close.click();
	
	if (object_repository.Praveen.object_repository.Payment_Release_DocDate.isEnabled()) {
		object_repository.Praveen.object_repository.Payment_Release_DocDate.getText();
		System.out.println("Requested Date :"+	object_repository.Praveen.object_repository.Payment_Release_DocDate.getText());
		System.out.println("Payment Hold Release page Hold Document Requested Date is Enabled in InProgress Tab");
	} else {
System.out.println("Payment Hold Release page Hold Document cannot be able to find Requested Date in InProgress Tab");
	}
	
	
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_DocRemarks));
	status = object_repository.Praveen.object_repository.Payment_Release_DocRemarks.isEnabled();
	assertTrue(status);
	Reporter.addScenarioLog("Payment Hold Release page Payment_Release_DocRemarks is Enabled");
//	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Remarks.click();
	object_repository.Praveen.object_repository.Payment_Release_DocRemarks.sendKeys(ConfigFileReader.getRemarks_Pk());
	System.out.println("Payment Hold Release page Hold Document Remarks is Enabled in InProgress Tab");
	Thread.sleep(4000);
	
	}
	
	
	//Using Card
	
	
	@Then("^user should able to select Next in Releaseble Dedutions Payment Hold Release page$")
	public static void user_should_able_to_select_Next_in_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Next));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Next.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Next is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Next.click();
		System.out.println("Payment Hold Release page Payment_Hold_ForAction_Create_RD_Next is Enabled");
//		object_repository.Praveen.object_repository.Payment_Hold_ForAction_RD_CreateNew.getText();
		
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_CN_ExlDwnld.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_CN_ExlDwnld));
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_CN_ExlDwnld.click();
			Screenshot.Screenshotforscenario();
			System.out.println("User should able to download the EXCEL Sheet");
		} else {
			Screenshot.Screenshotforscenario();
System.out.println("User not able to download Excel sheet");
		}
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_CN_ExlDwnld));
		
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Cart.isEnabled()) {
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Cart.click();
			System.out.println("user should able to select hold type using Cart");
		} else {
			System.out.println("user not able to select hold type using Cart");
		}	
	}
	
	@Then("^verified user can able to Release the hold payment value Releaseble Dedutions Payment Hold Release page$")
	public static void verified_user_can_able_to_Release_the_hold_payment_value_Releaseble_Dedutions_Payment_Hold_Release_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_Doc));
		status = object_repository.Praveen.object_repository.Payment_Release_Doc.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Payment Hold Release page Payment_Release_Doc is Enabled");
		object_repository.Praveen.object_repository.Payment_Release_Doc.click();
		System.out.println("Payment Hold Release page Payment_Release_Doc is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
//		System.out.println("Popup Response :" + object_repository.Praveen.object_repository.popup.getText());
		object_repository.Praveen.object_repository.Payment_Release_RDtxt.click();
		
		System.out.println(" Hold Value : "  + object_repository.Praveen.object_repository.HoldValue_AmntTxt);
			Thread.sleep(2000);
//	object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.click();
	object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.sendKeys(ConfigFileReader.getRelease_Value());
	
		System.out.println("Payment Release Value againt the Doc is : "+ConfigFileReader.getRelease_Value());
		
		System.out.println("InProgress Tab Hold Payment Release option is Enabled");
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");

		Thread.sleep(2000);
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
	
			Basic.popup_handlepk();
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
			object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.clear();
			System.out.println("Payment_ReleaseValue_Amnt has been cleared");
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
			object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.sendKeys("100");
			System.out.println("Payment Release Value againt the Doc is : ' 100 '");
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
			status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
			assertTrue(status);
			Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");

			Thread.sleep(2000);
				object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
			Basic.popup_handlepk();
		} else {
System.out.println("Payment_ReleaseValue_Amnt not displayed");
		}
		
//Test
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
			System.out.println("Payment_ReleaseValue_Amnt not displayed");
			
			Basic.popup_handlepk();
		} else {
wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.clear();
System.out.println("Payment_ReleaseValue_Amnt has been cleared");
wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.sendKeys("10");
System.out.println("Payment Release Value againt the Doc is : ' 10 '");
wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
assertTrue(status);
Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");

Thread.sleep(2000);
	object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
Basic.popup_handlepk();
		}
		

		Thread.sleep(5000);

	}

		
		/*if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
			System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
		} else {
	System.out.println("pop-up msg is not displayed");
		}Screenshot.Screenshotforscenario();
		if (object_repository.Praveen.object_repository.Success_Ok.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
			status = object_repository.Praveen.object_repository.Success_Ok.isEnabled();
			assertTrue(status);
			Reporter.addScenarioLog("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
			object_repository.Praveen.object_repository.Success_Ok.click();
			System.out.println("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
			Thread.sleep(4000);
		
		if (object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release));
			System.out.println("Error msg Displayed : "+object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release.getText());
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
			object_repository.Praveen.object_repository.Success_Ok.click();
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
			object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.sendKeys("100");
			System.out.println("Payment Release Value againt the Doc is : ' 100 '");
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
			status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
			assertTrue(status);
			Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
			System.out.println("InProgress Tab Hold Payment Release option is Enabled");
			Screenshot.Screenshotforscenario();
			if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
				object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
				System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
			} else {
		System.out.println("pop-up msg is not displayed");
			}Screenshot.Screenshotforscenario();
			if (object_repository.Praveen.object_repository.Success_Ok.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
				status = object_repository.Praveen.object_repository.Success_Ok.isEnabled();
				assertTrue(status);
				Reporter.addScenarioLog("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
				object_repository.Praveen.object_repository.Success_Ok.click();
				System.out.println("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
				Thread.sleep(4000);
			} else {
				System.out.println("========================");
			}
		}
			if (object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release));
				System.out.println("Error msg Displayed : "+object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release.getText());
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
				object_repository.Praveen.object_repository.Success_Ok.click();
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
				object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.sendKeys("50");
				System.out.println("Payment Release Value againt the Doc is : ' 50 '");
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
				status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
				assertTrue(status);
				Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");
				object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
				System.out.println("InProgress Tab Hold Payment Release option is Enabled");
				Screenshot.Screenshotforscenario();
				if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
					System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
				} else {
			System.out.println("pop-up msg is not displayed");
				}Screenshot.Screenshotforscenario();
				if (object_repository.Praveen.object_repository.Success_Ok.isEnabled()) {
					wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
					status = object_repository.Praveen.object_repository.Success_Ok.isEnabled();
					assertTrue(status);
					Reporter.addScenarioLog("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
					object_repository.Praveen.object_repository.Success_Ok.click();
					System.out.println("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
					Thread.sleep(4000);
				} else {
					System.out.println("========================");
				} }
				if (object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release.isEnabled()) {
					wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release));
					System.out.println("Error msg Displayed : "+object_repository.Praveen.object_repository.Payment_Release_ErrorPopup_Release.getText());
					wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
					object_repository.Praveen.object_repository.Success_Ok.click();
					wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt));
					object_repository.Praveen.object_repository.Payment_ReleaseValue_Amnt.sendKeys("10");
					System.out.println("Payment Release Value againt the Doc is : ' 10 '");
					wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
					status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
					assertTrue(status);
					Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");
					object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
					System.out.println("InProgress Tab Hold Payment Release option is Enabled");
					Screenshot.Screenshotforscenario();
					if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
						object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
						System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
					} else {
				System.out.println("pop-up msg is not displayed");
					}Screenshot.Screenshotforscenario();
					if (object_repository.Praveen.object_repository.Success_Ok.isEnabled()) {
						wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
						status = object_repository.Praveen.object_repository.Success_Ok.isEnabled();
						assertTrue(status);
						Reporter.addScenarioLog("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
						object_repository.Praveen.object_repository.Success_Ok.click();
						System.out.println("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
						Thread.sleep(4000);
					} else {
						System.out.println("========================");
					}
				
		}} else {
			System.out.println("========================");*/
//		}
		//
		
		/*wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");
		object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();
		System.out.println("InProgress Tab Hold Payment Release option is Enabled");
		Screenshot.Screenshotforscenario();
		if (object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.isEnabled()) {
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
			System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
		} else {
	System.out.println("pop-up msg is not displayed");
		}Screenshot.Screenshotforscenario();
	
	wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
	status = object_repository.Praveen.object_repository.Success_Ok.isEnabled();
	assertTrue(status);
	Reporter.addScenarioLog("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
	object_repository.Praveen.object_repository.Success_Ok.click();
	System.out.println("Payment Hold Release page Released the hold payment value & Success_Ok is Enabled");
	Thread.sleep(4000);*/	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
