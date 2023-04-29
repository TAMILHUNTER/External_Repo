package stepdefinition.Basic_Details.Create;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import stepdefinition.DLR.Create.DLR;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Partner {

	public static int Search_Aadhaar_Number;
	public static int popup_validation;
	public static int length_of_spinner;
	public static String Selected_Partner_ID;
	public static String Selected_Worktype;
	public static String Search_PassportNumber;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Partner() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(30));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login$")
	public static void Login() throws InterruptedException {
		stepdefinition.Login.Use_Login_Induction_Basic();

	}
	
	

	@And("^Navigate to BasicDetails$")
	public static void Navigate_to_BasicDetails() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		// ObjectsReporsitory.Menu_Navigation_Open.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS40));
		ObjectsReporsitory.WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
		ObjectsReporsitory.WMS_induction2.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		// ObjectsReporsitory.Menu_Navigation_Close.click();
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}

		// New Implementation
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_Domestic));
		ObjectsReporsitory.WorkmenSearch_Domestic.click();
		Thread.sleep(5000);

		// DLR

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);
		if (popup_validation == 1) {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.DLR_job));
			System.out.println("Navigated to DLR Page");
			System.out.println("======================");
			DLR.Selecting_Current_job_for_DLR_Entery();
			DLR.Selecting_Date_for_DLR_Entery();
			// DLR.Searching_DLR_Entery_For_Job(); // No Need for Flow Execution
			DLR.Enter_DLR_Entry_for_Day_shift_Workmen();
			DLR.Enter_DLR_Entry_for_Night_shift_Workmen();
			DLR.Verify_DLR_Entry_Total_Calculated_Correctly();
			DLR.Enter_DLR_Breakup_Workmen_Strenght();
			DLR.Enter_DLR_Breakup_Workmen_at_site();
			DLR.Enter_DLR_Breakup_Workmen_Inducted();
			DLR.Enter_DLR_Breakup_Workmen_Released();
			DLR.Enter_DLR_Breakup_Workmen_Expected_to_Released();
			DLR.Enter_DLR_Breakup_Workmen_Under_Quarantine();
			DLR.Enter_DLR_Breakup_Workmen_Affected_by_Covid();
			DLR.DLR_Breakup_Calculated_Correctly();
			DLR.Verify_User_can_be_able_to_Save_DLR_Entry();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.DLR_Back));
			ObjectsReporsitory.DLR_Back.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_Domestic));
			ObjectsReporsitory.WorkmenSearch_Domestic.click();

		} else {
			System.out.println("DLR Record For Selected Job Already Present");
			System.out.println("============================================");
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		System.out.println("Search workmen by Aadhaar");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_Aadhar));
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_employeeAadhaar));
		ObjectsReporsitory.Dashboard_employeeAadhaar.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(328);
		long number3 = rnd.nextInt(65);
		long number4 = rnd.nextInt(652);
		ObjectsReporsitory.Dashboard_employeeAadhaar.sendKeys("64" + number1 + number2 + number3 + number4);

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_employeeAadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);
		if (Search_Aadhaar_Number < 12) {
			ObjectsReporsitory.Dashboard_employeeAadhaar.click();

			Actions actions_key1 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key1.perform();
			ObjectsReporsitory.Dashboard_employeeAadhaar.sendKeys("5");
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.Dashboard_employeeAadhaar.getAttribute("value"));
		} else if (Search_Aadhaar_Number > 12) {
			ObjectsReporsitory.Dashboard_employeeAadhaar.click();
			Actions actions_key2 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key2.perform();
			Actions actions_key3 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.BACK_SPACE);
			actions_key3.perform();
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.Dashboard_employeeAadhaar.getAttribute("value"));
		} else {
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.Dashboard_employeeAadhaar.getAttribute("value"));
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		System.out.println("Popup Response : " + ObjectsReporsitory.popup.getText());
		System.out.println(ObjectsReporsitory.popup_text.getText());
		System.out.println("***************************************");
		ObjectsReporsitory.WorkmanSearchPopup_ok.click();
		System.out.println("No Workmen Found : Continue for Induction");
		System.out.println("***************************************");
		System.out.println("Popup Response : " + ObjectsReporsitory.popup_head.getText());
		System.out.println(ObjectsReporsitory.popup_text.getText());
		System.out.println("***************************************");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_Confirmation_Yes));
		ObjectsReporsitory.WorkmanSearchPopup_Confirmation_Yes.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_partnername));
		System.out.println("Navigated to Basicdetails");
		// New Implementation End
	}

	@Then("^Verify user can able to select the Existing Partner by Name$")
	public static void verify_user_can_able_to_select_the_Existing_Partner_by_Name() throws Throwable {
		ObjectsReporsitory.Partner_partnername.click();
		ObjectsReporsitory.Partner_partnername.clear();
		ObjectsReporsitory.Partner_partnername.sendKeys(ConfigFileReader.getpartner_name());
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_partner_first_Partner));
		List<WebElement> DropdownResult2 = ObjectsReporsitory.Partner_partner_DR;
		Thread.sleep(3000);
		for (WebElement webElement : DropdownResult2) {
			if (webElement.getText().equals(ConfigFileReader.getpartner_dr_details_name())) {
				webElement.click();
				Thread.sleep(3000);
				System.out.println("Partner Selected : " + ConfigFileReader.getpartner_dr_details_name());
				break;
			}
		}
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		// wait.until(ExpectedConditions.textToBePresentInElement(
		// ObjectsReporsitory.Partner_partnername, "PI0301017377000 - GANESAN. T"));
	}

	@Then("^Verify user can able to select the Existing Partner by ID$")
	public static void Verify_user_can_able_to_select_the_Existing_Partner_by_ID() throws Throwable {
		ObjectsReporsitory.Partner_partnername.click();
		ObjectsReporsitory.Partner_partnername.clear();
		ObjectsReporsitory.Partner_partnername.click();
		ObjectsReporsitory.Partner_partnername.sendKeys(ConfigFileReader.getpartner_id());
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_partner_first_Partner));
		List<WebElement> DropdownResult3 = ObjectsReporsitory.Partner_partner_DR;

		if (ConfigFileReader.getselectPartner_Value().equals("Random")) {
			System.out.println("Selecting Random Partner");
			Random rand654 = new Random();
			int Partner_ID = rand654.nextInt(ObjectsReporsitory.Partner_partner_DR.size());
			Selected_Partner_ID = ObjectsReporsitory.Partner_partner_DR.get(Partner_ID).getText();

			for (WebElement webElement : DropdownResult3) {
				if (webElement.getText().equals(Selected_Partner_ID)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(
							"Partner ID Selected :" + ObjectsReporsitory.Partner_partnername.getAttribute("value"));
					break;
				}
			}
		} else {

			for (WebElement webElement : DropdownResult3) {
				if (webElement.getText().contains(ConfigFileReader.getpartner_dr_details_ID())) {
					webElement.click();
					System.out.println("Partner ID Selected : " + ObjectsReporsitory.Partner_partnername.getAttribute("value"));
					break;
				}
			}

		}

		Thread.sleep(3000);
	}

	@Then("^Verify user can able to select the Worktype$")
	public static void Verify_user_can_able_to_select_the_Worktype() throws InterruptedException {
		ObjectsReporsitory.Partner_workType.click();
		List<WebElement> DropdownResult4 = ObjectsReporsitory.Partner_workType_DR;

		if (ConfigFileReader.getselectWorktype_Value().contains("Random")) {
			System.out.println("Selecting Random Worktype");
			Random rand6547 = new Random();
			int Worktype = rand6547.nextInt(ObjectsReporsitory.Partner_workType_DR.size());
			Selected_Worktype = ObjectsReporsitory.Partner_workType_DR.get(Worktype).getText();

			for (WebElement webElement : DropdownResult4) {
				if (webElement.getText().equals(Selected_Worktype)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Work Type :" + ObjectsReporsitory.Partner_workType.getText());
					break;
				}
			}
		} else {

			for (WebElement webElement : DropdownResult4) {
				if (webElement.getText().equals(ConfigFileReader.getpartner_Worktype())) {
					webElement.click();
					System.out.println("WorkType Selected :" + ObjectsReporsitory.Partner_workType.getText());
					break;
				}
			}

		}

	}

	@Then("^Verify user can able to view partner details$")
	public static void Verify_user_can_able_to_view_partner_details() throws InterruptedException {
		String Partner_Name = ObjectsReporsitory.Partner_patnerName.getText();
		String Partner_Address = ObjectsReporsitory.Partner_Address.getText();
		String Partner_Contact = ObjectsReporsitory.Partner_Contact.getText();
		String Partner_Mail = ObjectsReporsitory.Partner_Mail.getText();
		System.out.println("Partner_Name : " + Partner_Name);
		System.out.println("Partner_Address : " + Partner_Address);
		System.out.println("Partner_Contact : " + Partner_Contact);
		System.out.println("Partner_Mail : " + Partner_Mail);
	}

	@Then("^Verify user can able to view partner work details$")
	public static void Verify_user_can_able_to_view_partner_work_details() throws InterruptedException, IOException {

		// Need to work
		Basic.PageLoader_Validation();
		String Partner_workManenroled = ObjectsReporsitory.Partner_workManenroled.getText();
		String Partner_Current_Jobs = ObjectsReporsitory.Partner_Current_Jobs.getText();
		String Partner_Workmen_Available = ObjectsReporsitory.Partner_Workmen_Available.getText();
		String Partner_Years_at_LT = ObjectsReporsitory.Partner_Years_at_LT.getText();
		String Partner_Work_Orders = ObjectsReporsitory.Partner_Work_Orders.getText();
		String Partner_IC_Associated = ObjectsReporsitory.Partner_IC_Associated.getText();
		System.out.println("Partner_Workmen Enroled : " + Partner_workManenroled);
		System.out.println("Partner_Current_Jobs : " + Partner_Current_Jobs);
		System.out.println("Partner_Workmen_Available : " + Partner_Workmen_Available);
		System.out.println("Partner_Years_at_LT : " + Partner_Years_at_LT);
		System.out.println("Partner_Work_Orders : " + Partner_Work_Orders);
		System.out.println("Partner_IC_Associated : " + Partner_IC_Associated);
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify user can able to Save$")
	public static void Verify_user_can_able_to_Save() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.partnerbar));
		ObjectsReporsitory.partnerbar.click();
		Actions actions2323 = new Actions(DriverFactory.driver);
		actions2323.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actions2323.perform();
		ObjectsReporsitory.Partner_next.click();
		Basic.PageLoader_Validation();
		System.out.println("Partner details are Saved");
		ObjectsReporsitory.Induction_communication.click();

	}
}
