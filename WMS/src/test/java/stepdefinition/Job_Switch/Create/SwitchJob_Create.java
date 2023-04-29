package stepdefinition.Job_Switch.Create;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Edit.Edit_Personal_Details;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;

public class SwitchJob_Create {

	public static int popup_validation;
	public static int length_of_spinner;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************
	

	public static void SwitchJob_LE180046() throws InterruptedException {

		Basic.PageLoader_Validation();
		System.out.println("Switching job to : " + ConfigFileReader.getJob_LE180046());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		ObjectsReporsitory.Induction_Edit_job.click();
		ObjectsReporsitory.Induction_Edit_job_dr.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.clear();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.sendKeys(ConfigFileReader.getJob_LE180046());
		List<WebElement> DropdownResult = ObjectsReporsitory.Induction_Edit_job_dr_Values;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getJob_LE180046())) {
				webElement.click();
				System.out.println("Selected Job:" + ConfigFileReader.getJob_LE180046());
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Save_Job));
		ObjectsReporsitory.Induction_Save_Job.click();

		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		wait.until(
				ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Induction_Jobcode, "LE180046-Raheja"));
		System.out.println("Successfully Switched to Job: " + ConfigFileReader.getJob_LE180046());
		String Current_job_full = ObjectsReporsitory.Induction_Jobcode.getText();
		String Current_BU = ObjectsReporsitory.Induction_BU.getText();
		String Current_IC = ObjectsReporsitory.Induction_IC.getText();
		System.out.println("--------------------------------------------------");
		System.out.println("Job Name : " + Current_job_full);
		System.out.println("BU : " + Current_BU);
		System.out.println("IC : " + Current_IC);
		System.out.println("--------------------------------------------------");

	}

	public static void SwitchJob_AABRI015() throws Throwable {

		Basic.PageLoader_Validation();
		System.out.println("Switching job to : " + ConfigFileReader.getSwitch_job());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		ObjectsReporsitory.Induction_Edit_job.click();
		ObjectsReporsitory.Induction_Edit_job_dr.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.clear();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.sendKeys(ConfigFileReader.getSwitch_job());
		List<WebElement> DropdownResult2 = ObjectsReporsitory.Induction_Edit_job_dr_Values;
		for (WebElement webElement2 : DropdownResult2) {
			if (webElement2.getText().contains(ConfigFileReader.getSwitch_job())) {
				webElement2.click();
				System.out.println("Selected Job:" + ConfigFileReader.getSwitch_job());
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Save_Job));
		ObjectsReporsitory.Induction_Save_Job.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Induction_Jobcode,
				"AABRI015-HCI IC - Ahmedabad Office"));
		System.out.println("Successfully Switched to Job: " + ConfigFileReader.getSwitch_job());
		String Current_job_full = ObjectsReporsitory.Induction_Jobcode.getText();
		String Current_BU = ObjectsReporsitory.Induction_BU.getText();
		String Current_IC = ObjectsReporsitory.Induction_IC.getText();
		System.out.println("--------------------------------------------------");
		System.out.println("Job Name : " + Current_job_full);
		System.out.println("BU : " + Current_BU);
		System.out.println("IC : " + Current_IC);
		System.out.println("--------------------------------------------------");

	}

	public static void SwitchJob_LE120309() throws Throwable {

		Basic.PageLoader_Validation();
		System.out.println("Switching job to : " + ConfigFileReader.getSwitch_international_job());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		ObjectsReporsitory.Induction_Edit_job.click();
		ObjectsReporsitory.Induction_Edit_job_dr.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.clear();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.sendKeys(ConfigFileReader.getSwitch_international_job());
		List<WebElement> DropdownResult2 = ObjectsReporsitory.Induction_Edit_job_dr_Values;
		for (WebElement webElement2 : DropdownResult2) {
			if (webElement2.getText().contains(ConfigFileReader.getSwitch_international_job())) {
				webElement2.click();
				System.out.println("Selected Job:" + ConfigFileReader.getSwitch_international_job());
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Save_Job));
		ObjectsReporsitory.Induction_Save_Job.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Induction_Jobcode,
				"LE120309-QATAR OPERATIONS - WET IC"));
		System.out.println("Successfully Switched to Job: " + ConfigFileReader.getSwitch_international_job());
		String Current_job_full = ObjectsReporsitory.Induction_Jobcode.getText();
		String Current_BU = ObjectsReporsitory.Induction_BU.getText();
		String Current_IC = ObjectsReporsitory.Induction_IC.getText();
		System.out.println("--------------------------------------------------");
		System.out.println("Job Name : " + Current_job_full);
		System.out.println("BU : " + Current_BU);
		System.out.println("IC : " + Current_IC);
		System.out.println("--------------------------------------------------");

	}
	
	
	public static void SwitchJob_LE20D146() throws Throwable {

		Basic.PageLoader_Validation();
		System.out.println("Switching job to LE20D146-Dept Code - Nepal Project - SS BU - PTD D");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		ObjectsReporsitory.Induction_Edit_job.click();
		ObjectsReporsitory.Induction_Edit_job_dr.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.clear();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.sendKeys(ConfigFileReader.getSwitch_international_job_LE20D146());
		List<WebElement> DropdownResult2 = ObjectsReporsitory.Induction_Edit_job_dr_Values;
		for (WebElement webElement2 : DropdownResult2) {
			if (webElement2.getText().contains(ConfigFileReader.getSwitch_international_job_LE20D146())) {
				webElement2.click();
				System.out.println("Selected Job:" + ConfigFileReader.getSwitch_international_job_LE20D146());
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Save_Job));
		ObjectsReporsitory.Induction_Save_Job.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Induction_Jobcode,
				"LE20D146-Dept Code - Nepal Project - SS BU - PTD D"));
		System.out.println("Successfully Switched to Job: " + ConfigFileReader.getSwitch_international_job_LE20D146());
		String Current_job_full = ObjectsReporsitory.Induction_Jobcode.getText();
		String Current_BU = ObjectsReporsitory.Induction_BU.getText();
		String Current_IC = ObjectsReporsitory.Induction_IC.getText();
		System.out.println("--------------------------------------------------");
		System.out.println("Job Name : " + Current_job_full);
		System.out.println("BU : " + Current_BU);
		System.out.println("IC : " + Current_IC);
		System.out.println("--------------------------------------------------");

	}

	@Then("^Verify User can be able to Search workmen by Aadhar for Switch$")
	public static void Search_workmen_by_Aadhar_for_Switch() throws Throwable {

		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();
		DataBaseConnection.GetWorkmanAadharSwitch();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));

		ObjectsReporsitory.Dashboard_submit.click();

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);
		if (popup_validation == 1) {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();

		} else {
			System.out.println("Searched Workmen Currently Availble in the selected Job");
			System.out.println("--------------------------------------------------------");
			System.out.println("Kindly select Different Job to proceed");
			System.out.println("--------------------------------------------------------");
		}

	}

	@Then("^Verify User can be able to Search workmen by Passport for Switch Domestic$")
	public static void Verify_User_can_be_able_to_Search_workmen_by_Passport_for_Switch_Domestic() throws Throwable {

		System.out.println("Search workmen by Passport");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		DataBaseConnection.GetWorkmanPassportSwitch();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.popup_validation_other();
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);
		if (popup_validation == 1) {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();

		} else {
			System.out.println("Searched Workmen Currently Availble in the selected Job");
			System.out.println("--------------------------------------------------------");
			System.out.println("Kindly select Different Job to proceed");
			System.out.println("--------------------------------------------------------");
		}

	}

	@Then("^Verify Domestic Job DLR Entry$")
	public static void Verify_Domestic_Job_DLR_Entry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_Domestic));
		ObjectsReporsitory.WorkmenSearch_Domestic.click();
		Edit_Personal_Details.CheckDLR_Domestic();
	}

	@Then("^Verify User can be able to navigate to Basic Details$")
	public static void Verify_User_can_be_able_to_navigate_to_Basic_Details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_basicDetails));
		ObjectsReporsitory.Induction_basicDetails.click();
		Thread.sleep(5000);

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);
		if (popup_validation == 1) {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();
			System.out.println("--------------------------------------------------------");
			System.out.println("Kindly Add role to user for Selected Job");
			System.out.println("--------------------------------------------------------");

		} else {
			System.out.println("User Has Role to Edit Basic Details in Selected job");
			System.out.println("--------------------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_partnername));
			System.out.println("Navigated to Basicdetails");
		}

	}

	@Then("^Verify User can be able to Edit Basic Details$")
	public static void Verify_User_can_be_able_to_Edit_Basic_Details() throws Throwable {

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);
		if (popup_validation == 1) {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();
			System.out.println("--------------------------------------------------------");
			System.out.println("Kindly Add role to user for Selected Job");
			System.out.println("--------------------------------------------------------");

		} else {
			System.out.println("Editing Basic Details");
			System.out.println("--------------------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_personal));
			ObjectsReporsitory.Induction_personal.click();
			ObjectsReporsitory.Personal_fatherName.click();
			ObjectsReporsitory.Personal_fatherName.clear();
			ObjectsReporsitory.Personal_fatherName.click();
			ObjectsReporsitory.Personal_fatherName
					.sendKeys(ConfigFileReader.getWorkman_Father_name_update() + RandomString.make(10));
			Actions actions2121 = new Actions(DriverFactory.driver);
			actions2121.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
			actions2121.perform();
			ObjectsReporsitory.Personal_saveNext.click();
			ObjectsReporsitory.Induction_communication.click();
			Actions actions212QW1 = new Actions(DriverFactory.driver);
			actions212QW1.moveToElement(ObjectsReporsitory.skill_header);
			actions212QW1.perform();
			ObjectsReporsitory.Communication_saveNext.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			Actions actions2132QW1 = new Actions(DriverFactory.driver);
			actions2132QW1.moveToElement(ObjectsReporsitory.deployment_Header);
			actions2132QW1.perform();
			ObjectsReporsitory.skill_save.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();

		}

	}

	@Then("^Verify Workmen Job Successfully Switched$")
	public static void Verify_Workmen_Job_Successfully_Switched() throws Throwable {

		DataBaseConnection.GetWorkmanJob();
	}

}
