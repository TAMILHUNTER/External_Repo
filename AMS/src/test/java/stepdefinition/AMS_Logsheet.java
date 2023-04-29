package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.AMS_Logsheet_Objects;
import object_repository.Login_Objects;

public class AMS_Logsheet {

	// Read Configuration
	public static ConfigFileReader configFileReader;
	public static JavascriptExecutor js;

	public AMS_Logsheet() {
		PageFactory.initElements(Webdriver.driver, AMS_Logsheet_Objects.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
	public static Actions actions = new Actions(Webdriver.driver);
	public static String ponumberCheck, frqNumber;
	
	@Then("^Verify the AMS Menu$")
	public static void Verify_the_Goods_Inward_Note_Navigation_Menu() throws Throwable {
		//AMSLogsheetMenu
		
	}
//	
//
//	@Then("^Click the Asset mgmt in menu$")
//	public static void Click_the_Asset_mgmt_in_menu() throws Throwable {
//		AMS_Logsheet_Objects.AssetMgmt.click();
//
//	}
//
//	@Then("^Click the Operations and Maintenance in menu$")
//	public static void Click_the_Operations_and_Maintenance_in_menu() throws Throwable {
//		AMS_Logsheet_Objects.OAM.click();
//	}
//
//	@Then("^Click the LogSheet in menu$")
//	public static void Click_the_LogSheet_in_menu() throws Throwable {
//		AMS_Logsheet_Objects.LogSheet.click();
//	}
//
	@Then("^Click the JobCode in the Job selection$")
	public static void Click_the_JobCode_in_the_Job_selection() throws Throwable {
		AMS_Logsheet_Objects.JobCode.click();
		
	}

	@Then("^Enter the Job code in the Job$")
	public static void Enter_the_Job_code_in_the_Job() throws Throwable {
		//Thread.sleep(500);
		AMS_Logsheet_Objects.JobCode.sendKeys(ConfigFileReader.getLogjob() + Keys.TAB);

	}

	@Then("^Enter the Asset code in the Asset place holder$")
	public static void Enter_the_Asset_code_in_the_Asset_place_holder() throws Throwable {
		Thread.sleep(500);
		AMS_Logsheet_Objects.AssetCode.sendKeys(ConfigFileReader.getLogAsset()+ Keys.TAB);
		AMS_Logsheet_Objects.Duration.clear();

	}

	@Then("^Click create new Logsheet button in the landing page$")
	public static void Click_create_new_Logsheet_button_in_the_landing_page() throws Throwable {
		Thread.sleep(7000);
		AMS_Logsheet_Objects.Clickcreate.click();
		Thread.sleep(3000);
	}

	@Then("^Enter the End meter reading in the creation page$")
	public static void Enter_the_End_meter_reading_in_the_creation_page() throws Throwable {
		Thread.sleep(5000);
		String text = AMS_Logsheet_Objects.StartMeterReading.getText();
		System.out.println(text);	
		Integer integer = Integer.valueOf(text);
		int integer1 = integer + 10;
		String string2 = String.valueOf(integer1);
		AMS_Logsheet_Objects.EndMeter.sendKeys(string2 + Keys.TAB);
	
	}
	@Then("^Enter the Quantity in the Production Entry$")
	public static void Enter_the_Quantity_in_the_Production_Entry() throws Throwable {
		//Thread.sleep(500);
		AMS_Logsheet_Objects.Quantity.sendKeys(ConfigFileReader.getQuantity() + Keys.TAB);

	}
	@Then("^click the submit button to submit the Log sheet$")
	public static void click_the_submit_button_to_submit_the_Log_sheet() throws Throwable {
		AMS_Logsheet_Objects.submit.click();
		//Thread.sleep(3000);
	}
	@Then("^Click the Time Based button in the creation page$")
	public static void click_the_Time_Based_button_in_the_creation_page() throws Throwable {
		Thread.sleep(3000);
		AMS_Logsheet_Objects.TimeBased.click();
		//Thread.sleep(3000);
		
		
	}
	@Then("^Click Yes button in the Confirmation popup$")
	public static void Click_Yes_button_in_the_Confirmation_popup() throws Throwable {
		AMS_Logsheet_Objects.ClickYes.click();
	}	
	
	@Then("^Click the Work button in the Time Based Log sheet creation$")
	public static void Click_the_Work_button_in_the_Time_Based_Log_sheet_creation() throws Throwable {
		AMS_Logsheet_Objects.ClickWorkbtn.click();
	}
	@Then("^Enter the End meter reading in the Time Based creation page$")
	public static void Enter_the_End_meter_reading_in_the_Time_Based_creation_page() throws Throwable {
		//Thread.sleep(5000);
		String text = AMS_Logsheet_Objects.TStartmeter.getText();
		System.out.println(text);	
		Integer integer = Integer.valueOf(text); 
		int integer1 = integer + 10;
		String string2 = String.valueOf(integer1);
		AMS_Logsheet_Objects.TEndMeter.sendKeys(string2 + Keys.TAB); 
		System.out.println(string2);
	}
	
	@Then("^Click the start time in the Time Based log sheet creation$")
	public static void Click_the_start_time_in_the_Time_Based_log_sheet_creation() throws Throwable {
		Thread.sleep(5000);
		PageFactory.initElements(Webdriver.driver, AMS_Logsheet_Objects.class);
		
		AMS_Logsheet_Objects.StartTime.click();
	
	}
	
	@Then("^Select the Start time from the timer$")
	public static void Select_the_Start_time_from_the_timer() throws Throwable {
		
		Thread.sleep(3000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
		AMS_Logsheet_Objects.StartTimeSet);
		
		Thread.sleep(5000);
//		Actions a= new Actions( Webdriver.driver);
//		a.moveToElement(AMS_Logsheet_Objects.submit).perform();
		AMS_Logsheet_Objects.SelectstartTime.click();
		
		
		
	}	
	@Then("^Click the set option in the timer$")
	public static void Click_the_set_option_in_the_timer() throws Throwable {
		try {
            Thread.sleep(3000);
            js.executeScript("arguments[0].click();",AMS_Logsheet_Objects.StartTimeSet);
        }catch(Exception e) {
            Thread.sleep(3000);
            AMS_Logsheet_Objects.StartTimeSet.click();
        }
		
	}
	@Then("^Click the End time in the Time Based log sheet creation$")
	public static void Click_the_End_time_in_the_Time_Based_log_sheet_creation() throws Throwable {
		AMS_Logsheet_Objects.EndTime.click();
		
	}
	@Then("^Select the End time from the timer$")
	public static void Select_the_End_time_from_the_timer() throws Throwable {
		
		try {
            Thread.sleep(3000);
            js.executeScript("arguments[0].click();",AMS_Logsheet_Objects.SelectEndTime);
        }catch(Exception e) {
            Thread.sleep(3000);
            AMS_Logsheet_Objects.SelectEndTime.click();
        }
		
		Thread.sleep(3000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
		AMS_Logsheet_Objects.StartTimeSet);
		Thread.sleep(5000);
		
	}
	@Then("^Click the set option in the End timer$")
	public static void Click_the_set_option_in_the_End_timer() throws Throwable {
		Thread.sleep(10000);
		AMS_Logsheet_Objects.EndTimeSet.click();
		
	} 
	
	
	public static void Logout() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.Home));
		Login_Objects.Home.click();
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.profileDr));
		Login_Objects.profileDr.click();
		Login_Objects.Signout.click();



		}
	
	@Then("^Click the save icon in the time based log sheet$")
	public static void Click_the_save_icon_in_the_time_based_log_sheet() throws Throwable {
		Thread.sleep(3000);
		AMS_Logsheet_Objects.TSaveIcon.click();
	}
	@Then("^Enter the Quantity in the Time Based Production Entry$")
	public static void Enter_the_Quantity_in_the_Time_Based_Production_Entry() throws Throwable {
		//Thread.sleep(500);
		AMS_Logsheet_Objects.TQuantity.sendKeys(ConfigFileReader.getTQuantity());

	}
	@Then("^click the submit button to submit the Time Based Log sheet$")
	public static void click_the_submit_button_to_submit_the_Time_Based_Log_sheet() throws Throwable {
		AMS_Logsheet_Objects.submit.click();
	}
	
	@Then("^Click the Maintenance toggle button in the Log sheet creation page$")
	public static void Click_the_Maintenance_toggle_button_in_the_Log_sheet_creation_page() throws Throwable {
		Thread.sleep(3000);
		AMS_Logsheet_Objects.Maintenance.click();
	}
	
	@Then("^Enter the Maintenance End Reading in the Log Sheet$")
	public static void Enter_the_Maintenance_End_Reading_in_the_Log_Sheet() throws Throwable {
		AMS_Logsheet_Objects.MEndReading.clear();
		String text = AMS_Logsheet_Objects.StartMeterReading.getText();
		System.out.println(text);	
		Integer integer = Integer.valueOf(text);
		int integer1 = integer + 5;
		String string2 = String.valueOf(integer1);
		AMS_Logsheet_Objects.MEndReading.sendKeys(string2 + Keys.TAB);

	}
	@Then("^Enter the over time in the maintenance day log sheet$")
	public static void Enter_the_over_time_in_the_maintenance_day_log_sheet() throws Throwable {
		Thread.sleep(5000);
		//AMS_Logsheet_Objects.MOverTime.sendKeys(ConfigFileReader.getMOT()+ Keys.TAB);
		
	}
	
	@Then("^Enter the production Quantity for maintenance OT$")
	public void enter_the_production_Quantity_for_maintenance_OT() throws Throwable {
		AMS_Logsheet_Objects.MQuantity.click();
		Thread.sleep(3000);
		AMS_Logsheet_Objects.MQuantity.clear();
		AMS_Logsheet_Objects.MQuantity.sendKeys(ConfigFileReader.getMQuantity());
	}
	@Then("^Enter the Idle hours in the Hired Day based Log sheet$")
	public void Enter_the_Idle_hours_in_the_Hired_Day_based_Log_sheet() throws Throwable {
		Thread.sleep(2000);
		AMS_Logsheet_Objects.HiredDayIdle.click();
		AMS_Logsheet_Objects.HiredDayIdle.clear();
		AMS_Logsheet_Objects.HiredDayIdle.sendKeys(ConfigFileReader.getHIdle());
	}

	@Then("^Enter the BreakDown hours in the Hired Day based Log sheet$")
	public void Enter_the_BreakDown_hours_in_the_Hired_Day_based_Log_sheet() throws Throwable {
		Thread.sleep(2000);
		AMS_Logsheet_Objects.HireBreakdown.click();
		AMS_Logsheet_Objects.HireBreakdown.clear();
		AMS_Logsheet_Objects.HireBreakdown.sendKeys(ConfigFileReader.getHBreakDown());
	}

	@Then("^Click the Date Left arrow in the creation page$")
	public static void Click_the_Date_Left_arrow_in_the_creation_page() throws Throwable {
		Thread.sleep(3000);
		AMS_Logsheet_Objects.DateLeft.click();
	}
	
	@Then("^Click the Delete button in the Log sheet Creation page to delete Log sheet$")
	public static void Click_the_Delete_button_in_the_Log_sheet_Creation_page_to_delete_Log_sheet() throws Throwable {
		Thread.sleep(3000);
		AMS_Logsheet_Objects.Delete.click();
		}
	
	@Then("^Click the Remarks button in the Log sheet Creation Page$")
	public static void Click_the_Remarks_button_in_the_Log_sheet_Creation_Page() throws Throwable {
		Thread.sleep(3000);
		AMS_Logsheet_Objects.RemarksBtn.click();
	}
}




