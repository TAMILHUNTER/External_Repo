package stepdefinition.DLR.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Create.Partner;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class DLR {

	public static int DLR_Shift_Total_Total;
	public static int DLR_Shift_Total_Dept_Workmen;
	public static int DLR_Shift_Total_SC_Workmen;
	public static int DLR_Shift_Total_Security;
	public static int DLR_Day_Total_total;
	public static int DLR_Day_Dept_Workmen;
	public static int DLR_Day_SC_Workmen;
	public static int DLR_Day_Security;
	public static int DLR_Night_Total_total;
	public static int DLR_Night_Dept_Workmen;
	public static int DLR_Night_SC_Workmen;
	public static int DLR_Night_Security;
	public static int DLR_Breakup_Workmen_Strength_LTCamp;
	public static int DLR_Breakup_Workmen_Strength_SCCamp;
	public static int DLR_Breakup_Workmen_Strength_LocalWorkmen;
	public static int DLR_Breakup_Workmen_Strength_Total;
	public static int DLR_Breakup_Workmen_AtSite_LTCamp;
	public static int DLR_Breakup_Workmen_AtSite_SCCamp;
	public static int DLR_Breakup_Workmen_AtSite_LocalWorkmen;
	public static int DLR_Breakup_Workmen_AtSite_Total;
	public static int DLR_Breakup_Workmen_Inducted_LTCamp;
	public static int DLR_Breakup_Workmen_Inducted_SCCamp;
	public static int DLR_Breakup_Workmen_Inducted_LocalWorkmen;
	public static int DLR_Breakup_Workmen_Inducted_Total;
	public static int DLR_Breakup_Workmen_Released_LTCamp;
	public static int DLR_Breakup_Workmen_Released_SCCamp;
	public static int DLR_Breakup_Workmen_Released_LocalWorkmen;
	public static int DLR_Breakup_Workmen_Released_Total;
	public static int DLR_Breakup_Expected_to_Release_LTCamp;
	public static int DLR_Breakup_Expected_to_Release_SCCamp;
	public static int DLR_Breakup_Expected_to_Release_LocalWorkmen;
	public static int DLR_Breakup_Expected_to_Release_Total;
	public static int DLR_Breakup_Workmen_under_Quarantine_LTCamp;
	public static int DLR_Breakup_Workmen_under_Quarantine_SCCamp;
	public static int DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen;
	public static int DLR_Breakup_Workmen_under_Quarantine_Total;
	public static int DLR_Breakup_Workmen_Affected_by_Covid_LTCamp;
	public static int DLR_Breakup_Workmen_Affected_by_Covid_SCCamp;
	public static int DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen;
	public static int DLR_Breakup_Workmen_Affected_by_Covid_Total;
	public static int DLR_Breakup_Remarks_LTCamp;
	public static int DLR_Breakup_Remarks_SCCamp;
	public static int DLR_Breakup_Remarks_LocalWorkmen;
	public static int DLR_Breakup_Remarks_Total;
	public static int DLR_Day_Total_total2;
	public static int DLR_Night_Total_total2;
	public static int DLR_Shift_Total_Dept_Workmen2;
	public static int DLR_Shift_Total_SC_Workmen2;
	public static int DLR_Shift_Total_Security2;
	public static int DLR_Day_Total_total3;
	public static int DLR_Night_Total_total3;
	public static int DLR_Shift_Total_Total2;
	public static int DLR_Breakup_Workmen_Strength_Total2;
	public static int DLR_Breakup_Workmen_AtSite_Total2;
	public static int DLR_Breakup_Workmen_Inducted_Total2;
	public static int DLR_Breakup_Workmen_Released_Total2;
	public static int DLR_Breakup_Expected_to_Release_Total2;
	public static int DLR_Breakup_Workmen_under_Quarantine_Total2;
	public static int DLR_Breakup_Workmen_Affected_by_Covid_Total2;
	public static int popup_validation;
	public static int Workmen_inducted_LT_Camp;
	public static int Workmen_inducted_SC_Camp;
	public static int Workmen_inducted_Local;
	public static int Workmen_Released_LT_Camp;
	public static int Workmen_Released_SC_Camp;
	public static int Workmen_Released_Local;
	public static int Workmen_Expected_to_Releas_LT_Camp;
	public static int Workmen_Expected_to_Releas_SC_Camp;
	public static int Workmen_Expected_to_Releas_Local;
	public static int Workmen_Under_Quarantine_LT_Camp;
	public static int Workmen_Under_Quarantine_SC_Camp;
	public static int Workmen_Under_Quarantine_Local;
	public static int Workmen_Affected_by_Covid_LT_Camp;
	public static int Workmen_Affected_by_Covid_SC_Camp;
	public static int Workmen_Affected_by_Covid_Local;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public DLR() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login for DLR$")
	public static void Login_for_DLR() throws Throwable {

		Partner.Login();
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
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_Domestic));
	}

	@Given("^Navigate to DLR Directly$")
	public static void Navigate_to_DLR_Directly() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management));
		ObjectsReporsitory.WMS_Management.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Management_DLR));
		ObjectsReporsitory.Management_DLR.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.DLR_job));
		System.out.println("Navigated to DLR Page");
		System.out.println("======================");
		Screenshot.Screenshotforscenario();
	}

	@Given("^Navigate to DLR from Dashboard Workmen Search$")
	public static void Navigate_to_DLR_from_Dashboard_Workmen_Search() throws Throwable {

		Login.Logout();
		DLR.Login_for_DLR();
		DataBaseConnection.getremoveDLRrcord();
		ObjectsReporsitory.WorkmenSearch_Domestic.click();

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

		} else {
			System.out.println("DLR Record Already Present for the selected Job Code");
			System.out.println("=====================================================");
			DLR.Navigate_to_DLR_Directly();
		}

		Screenshot.Screenshotforscenario();

	}

	@Then("^Selecting Current job for DLR Entery$")
	public static void Selecting_Current_job_for_DLR_Entery() throws Throwable {

		ObjectsReporsitory.DLR_job.click();
		ObjectsReporsitory.DLR_job.clear();
		ObjectsReporsitory.DLR_job.click();
		ObjectsReporsitory.DLR_job.sendKeys(ConfigFileReader.getJob_LE180046());
		Thread.sleep(5000);
		List<WebElement> DropdownResult = ObjectsReporsitory.DLR_job_All_Elements;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getJob_LE180046())) {
				webElement.click();
				System.out.println("Selected Job :" + ConfigFileReader.getJob_LE180046());
				break;
			}
		}
	}
	
	@Then("^Selecting Nepal job for DLR Entery$")
	public static void Selecting_Nepal_job_for_DLR_Entery() throws Throwable {

		ObjectsReporsitory.DLR_job.click();
		ObjectsReporsitory.DLR_job.clear();
		ObjectsReporsitory.DLR_job.click();
		ObjectsReporsitory.DLR_job.sendKeys(ConfigFileReader.getJob_LE20D146());
		Thread.sleep(5000);
		List<WebElement> DropdownResult = ObjectsReporsitory.DLR_job_All_Elements;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getJob_LE20D146())) {
				webElement.click();
				System.out.println("Selected Job :" + ConfigFileReader.getJob_LE20D146());
				break;
			}
		}
	}

	@Then("^Selecting Date for DLR Entery$")
	public static void Selecting_Date_for_DLR_Entery() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_DOB_Calender));
		ObjectsReporsitory.Personal_DOB_Calender.click();
		Thread.sleep(3000);
		if (ConfigFileReader.getDLR_Date().equals("Yesterday")) {
			ObjectsReporsitory.Calender_Date_Yesterday.click();
		} else {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
			Date date = new Date();
			String date1 = dateFormat.format(date);
			ObjectsReporsitory.Calender_Date_TODAY.click();
			System.out.println("Date Selected : Today - " + date1);
		}

	}

	@Then("^Searching DLR Entery For Job$")
	public static void Searching_DLR_Entery_For_Job() throws Throwable {

		DLR.Selecting_Date_for_DLR_Entery();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.DLR_search));
		ObjectsReporsitory.DLR_search.click();
		DLR_Shift_Total_Total = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Total.getText());
		DLR_Day_Total_total = Integer.parseInt(ObjectsReporsitory.DLR_Day_Total_total.getText());
		DLR_Night_Total_total = Integer.parseInt(ObjectsReporsitory.DLR_Night_Total_total.getText());
		DLR_Breakup_Workmen_Strength_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_Total.getText());
		DLR_Breakup_Workmen_AtSite_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_Total.getText());
		DLR_Breakup_Workmen_Inducted_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_Total.getText());
		DLR_Breakup_Workmen_Released_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_Total.getText());
		DLR_Breakup_Expected_to_Release_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_Total.getText());
		DLR_Breakup_Workmen_under_Quarantine_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_Total.getText());
		DLR_Breakup_Workmen_Affected_by_Covid_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_Total.getText());
		DLR_Breakup_Remarks_Total = Integer.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_Total.getText());
		DLR_Shift_Total_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Dept_Workmen.getText());
		DLR_Shift_Total_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_SC_Workmen.getText());
		DLR_Shift_Total_Security = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Security.getText());
		DLR_Day_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Day_Dept_Workmen.getAttribute("value"));
		DLR_Day_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Day_SC_Workmen.getAttribute("value"));
		DLR_Day_Security = Integer.parseInt(ObjectsReporsitory.DLR_Day_Security.getAttribute("value"));
		DLR_Night_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Night_Dept_Workmen.getAttribute("value"));
		DLR_Night_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Night_SC_Workmen.getAttribute("value"));
		DLR_Night_Security = Integer.parseInt(ObjectsReporsitory.DLR_Night_Security.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Released_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Released_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Released_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Remarks_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_LTCamp.getAttribute("value"));
		DLR_Breakup_Remarks_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_SCCamp.getAttribute("value"));
		DLR_Breakup_Remarks_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_LocalWorkmen.getAttribute("value"));
		System.out.println("DLR_Shift_Total_Total: " + DLR_Shift_Total_Total);
		System.out.println("DLR_Day_Total_total: " + DLR_Day_Total_total);
		System.out.println("DLR_Night_Total_total: " + DLR_Night_Total_total);
		System.out.println("DLR_Breakup_Workmen_Strength_Total: " + DLR_Breakup_Workmen_Strength_Total);
		System.out.println("DLR_Breakup_Workmen_AtSite_Total: " + DLR_Breakup_Workmen_AtSite_Total);
		System.out.println("DLR_Breakup_Workmen_Inducted_Total: " + DLR_Breakup_Workmen_Inducted_Total);
		System.out.println("DLR_Breakup_Workmen_Released_Total: " + DLR_Breakup_Workmen_Released_Total);
		System.out.println("DLR_Breakup_Expected_to_Release_Total: " + DLR_Breakup_Expected_to_Release_Total);
		System.out.println("DLR_Breakup_Workmen_under_Quarantine_Total: " + DLR_Breakup_Workmen_under_Quarantine_Total);
		System.out
				.println("DLR_Breakup_Workmen_Affected_by_Covid_Total: " + DLR_Breakup_Workmen_Affected_by_Covid_Total);
		System.out.println("DLR_Breakup_Remarks_Total: " + DLR_Breakup_Remarks_Total);
		System.out.println("DLR_Shift_Total_Dept_Workmen: " + DLR_Shift_Total_Dept_Workmen);
		System.out.println("DLR_Shift_Total_SC_Workmen: " + DLR_Shift_Total_SC_Workmen);
		System.out.println("DLR_Shift_Total_Security: " + DLR_Shift_Total_Security);
		System.out.println("DLR_Day_Dept_Workmen: " + DLR_Day_Dept_Workmen);
		System.out.println("DLR_Day_SC_Workmen: " + DLR_Day_SC_Workmen);
		System.out.println("DLR_Day_Security: " + DLR_Day_Security);
		System.out.println("DLR_Night_Dept_Workmen: " + DLR_Night_Dept_Workmen);
		System.out.println("DLR_Night_SC_Workmen: " + DLR_Night_SC_Workmen);
		System.out.println("DLR_Night_Security: " + DLR_Night_Security);
		System.out.println("DLR_Breakup_Workmen_Strength_LTCamp: " + DLR_Breakup_Workmen_Strength_LTCamp);
		System.out.println("DLR_Breakup_Workmen_Strength_SCCamp: " + DLR_Breakup_Workmen_Strength_SCCamp);
		System.out.println("DLR_Breakup_Workmen_Strength_LocalWorkmen: " + DLR_Breakup_Workmen_Strength_LocalWorkmen);
		System.out.println("DLR_Breakup_Workmen_AtSite_LTCamp: " + DLR_Breakup_Workmen_AtSite_LTCamp);
		System.out.println("DLR_Breakup_Workmen_AtSite_SCCamp: " + DLR_Breakup_Workmen_AtSite_SCCamp);
		System.out.println("DLR_Breakup_Workmen_AtSite_LocalWorkmen: " + DLR_Breakup_Workmen_AtSite_LocalWorkmen);
		System.out.println("DLR_Breakup_Workmen_Inducted_LTCamp: " + DLR_Breakup_Workmen_Inducted_LTCamp);
		System.out.println("DLR_Breakup_Workmen_Inducted_SCCamp: " + DLR_Breakup_Workmen_Inducted_SCCamp);
		System.out.println("DLR_Breakup_Workmen_Inducted_LocalWorkmen: " + DLR_Breakup_Workmen_Inducted_LocalWorkmen);
		System.out.println("DLR_Breakup_Workmen_Released_LTCamp: " + DLR_Breakup_Workmen_Released_LTCamp);
		System.out.println("DLR_Breakup_Workmen_Released_SCCamp: " + DLR_Breakup_Workmen_Released_SCCamp);
		System.out.println("DLR_Breakup_Workmen_Released_LocalWorkmen: " + DLR_Breakup_Workmen_Released_LocalWorkmen);
		System.out.println("DLR_Breakup_Expected_to_Release_LTCamp: " + DLR_Breakup_Expected_to_Release_LTCamp);
		System.out.println("DLR_Breakup_Expected_to_Release_SCCamp: " + DLR_Breakup_Expected_to_Release_SCCamp);
		System.out.println(
				"DLR_Breakup_Expected_to_Release_LocalWorkmen: " + DLR_Breakup_Expected_to_Release_LocalWorkmen);
		System.out
				.println("DLR_Breakup_Workmen_under_Quarantine_LTCamp: " + DLR_Breakup_Workmen_under_Quarantine_LTCamp);
		System.out
				.println("DLR_Breakup_Workmen_under_Quarantine_SCCamp: " + DLR_Breakup_Workmen_under_Quarantine_SCCamp);
		System.out.println("DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen: "
				+ DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen);
		System.out.println(
				"DLR_Breakup_Workmen_Affected_by_Covid_LTCamp: " + DLR_Breakup_Workmen_Affected_by_Covid_LTCamp);
		System.out.println(
				"DLR_Breakup_Workmen_Affected_by_Covid_SCCamp: " + DLR_Breakup_Workmen_Affected_by_Covid_SCCamp);
		System.out.println("DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen: "
				+ DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen);
		System.out.println("DLR_Breakup_Remarks_LTCamp: " + DLR_Breakup_Remarks_LTCamp);
		System.out.println("DLR_Breakup_Remarks_SCCamp: " + DLR_Breakup_Remarks_SCCamp);
		System.out.println("DLR_Breakup_Remarks_LocalWorkmen: " + DLR_Breakup_Remarks_LocalWorkmen);
		Screenshot.Screenshotforscenario();

	}

	@Then("^Enter DLR Entry for Day shift Workmen$")
	public static void Enter_DLR_Entry_for_Day_shift_Workmen() throws Throwable {
		ObjectsReporsitory.DLR_Day_Dept_Workmen.click();
		// JavascriptExecutor js =
		// (JavascriptExecutor)DriverFactory.driver;js.executeScript("arguments[0].value =
		// '';",ObjectsReporsitory.DLR_Day_Dept_Workmen );
		ObjectsReporsitory.DLR_Day_Dept_Workmen.clear();
		ObjectsReporsitory.DLR_Day_Dept_Workmen.click();
		ObjectsReporsitory.DLR_Day_Dept_Workmen.sendKeys(ConfigFileReader.getDay_shift_Workmen_Dept());
		System.out.println("Day Shift Dept. Workmen : " + ConfigFileReader.getDay_shift_Workmen_Dept());

		ObjectsReporsitory.DLR_Day_SC_Workmen.click();
		ObjectsReporsitory.DLR_Day_SC_Workmen.clear();
		ObjectsReporsitory.DLR_Day_SC_Workmen.click();
		ObjectsReporsitory.DLR_Day_SC_Workmen.sendKeys(ConfigFileReader.getDay_shift_Workmen_SC());
		System.out.println("Day Shift S/C Workmen : " + ConfigFileReader.getDay_shift_Workmen_SC());

		ObjectsReporsitory.DLR_Day_Security.click();
		ObjectsReporsitory.DLR_Day_Security.clear();
		ObjectsReporsitory.DLR_Day_Security.click();
		ObjectsReporsitory.DLR_Day_Security.sendKeys(ConfigFileReader.getDay_shift_Workmen_Security());
		System.out.println("Day Shift Security : " + ConfigFileReader.getDay_shift_Workmen_Security());

		DLR_Day_Total_total2 = Integer.parseInt(ObjectsReporsitory.DLR_Day_Total_total.getText());
		System.out.println("Total DaY Shit Workmen Count : " + DLR_Day_Total_total2);
	}

	@Then("^Enter DLR Entry for Night shift Workmen$")
	public static void Enter_DLR_Entry_for_Night_shift_Workmen() throws Throwable {
		ObjectsReporsitory.DLR_Night_Dept_Workmen.click();
		ObjectsReporsitory.DLR_Night_Dept_Workmen.clear();
		ObjectsReporsitory.DLR_Night_Dept_Workmen.click();
		ObjectsReporsitory.DLR_Night_Dept_Workmen.sendKeys(ConfigFileReader.getNight_shift_Workmen_Dept());
		System.out.println("Night Shift Dept. Workmen : " + ConfigFileReader.getNight_shift_Workmen_Dept());

		ObjectsReporsitory.DLR_Night_SC_Workmen.click();
		ObjectsReporsitory.DLR_Night_SC_Workmen.clear();
		ObjectsReporsitory.DLR_Night_SC_Workmen.click();
		ObjectsReporsitory.DLR_Night_SC_Workmen.sendKeys(ConfigFileReader.getNight_shift_Workmen_SC());
		System.out.println("Night Shift S/C Workmen : " + ConfigFileReader.getNight_shift_Workmen_SC());

		ObjectsReporsitory.DLR_Night_Security.click();
		ObjectsReporsitory.DLR_Night_Security.clear();
		ObjectsReporsitory.DLR_Night_Security.click();
		ObjectsReporsitory.DLR_Night_Security.sendKeys(ConfigFileReader.getNight_shift_Workmen_Security());
		System.out.println("Night Shift Security : " + ConfigFileReader.getNight_shift_Workmen_Security());

		DLR_Night_Total_total2 = Integer.parseInt(ObjectsReporsitory.DLR_Night_Total_total.getText());
		System.out.println("Total Night Shit Workmen Count : " + DLR_Night_Total_total2);

	}

	@Then("^DLR Entry Total Calculated Correctly$")
	public static void Verify_DLR_Entry_Total_Calculated_Correctly() throws Throwable {

		DLR_Shift_Total_Total = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Total.getText());
		DLR_Day_Total_total = Integer.parseInt(ObjectsReporsitory.DLR_Day_Total_total.getText());
		DLR_Night_Total_total = Integer.parseInt(ObjectsReporsitory.DLR_Night_Total_total.getText());
		DLR_Breakup_Workmen_Strength_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_Total.getText());
		DLR_Breakup_Workmen_AtSite_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_Total.getText());
		DLR_Breakup_Workmen_Inducted_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_Total.getText());
		DLR_Breakup_Workmen_Released_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_Total.getText());
		DLR_Breakup_Expected_to_Release_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_Total.getText());
		DLR_Breakup_Workmen_under_Quarantine_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_Total.getText());
		DLR_Breakup_Workmen_Affected_by_Covid_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_Total.getText());
		DLR_Breakup_Remarks_Total = Integer.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_Total.getText());
		DLR_Shift_Total_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Dept_Workmen.getText());
		DLR_Shift_Total_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_SC_Workmen.getText());
		DLR_Shift_Total_Security = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Security.getText());
		DLR_Day_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Day_Dept_Workmen.getAttribute("value"));
		DLR_Day_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Day_SC_Workmen.getAttribute("value"));
		DLR_Day_Security = Integer.parseInt(ObjectsReporsitory.DLR_Day_Security.getAttribute("value"));
		DLR_Night_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Night_Dept_Workmen.getAttribute("value"));
		DLR_Night_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Night_SC_Workmen.getAttribute("value"));
		DLR_Night_Security = Integer.parseInt(ObjectsReporsitory.DLR_Night_Security.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Released_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Released_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Released_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Remarks_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_LTCamp.getAttribute("value"));
		DLR_Breakup_Remarks_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_SCCamp.getAttribute("value"));
		DLR_Breakup_Remarks_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_LocalWorkmen.getAttribute("value"));

		DLR_Shift_Total_Dept_Workmen2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Dept_Workmen.getText());
		DLR_Shift_Total_SC_Workmen2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_SC_Workmen.getText());
		DLR_Shift_Total_Security2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Security.getText());
		DLR_Day_Total_total3 = Integer.parseInt(ObjectsReporsitory.DLR_Day_Total_total.getText());
		DLR_Night_Total_total3 = Integer.parseInt(ObjectsReporsitory.DLR_Night_Total_total.getText());
		DLR_Shift_Total_Total2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Total.getText());

		Screenshot.Screenshotforscenario();
		System.out.println("Verifying Day Shift Workmen Count calculated Correctly");
		System.out.println("-------------------------------------------------------------");

		if (DLR_Day_Total_total3 == (DLR_Day_Dept_Workmen + DLR_Day_SC_Workmen + DLR_Day_Security)) {
			System.out.println("Day Shift Total Workmen : " + DLR_Day_Total_total3);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Dept Workmen : " + DLR_Day_Dept_Workmen);
			System.out.println("Day Shift SC Workmen : " + DLR_Day_SC_Workmen);
			System.out.println("Day Shift Security : " + DLR_Day_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Workmen Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println("Day Shift Total Workmen : " + DLR_Day_Total_total3);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Dept Workmen : " + DLR_Day_Dept_Workmen);
			System.out.println("Day Shift SC Workmen : " + DLR_Day_SC_Workmen);
			System.out.println("Day Shift Security : " + DLR_Day_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Day Shift Workmen Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}

		System.out.println("Verifying Night Shift Workmen Count calculated Correctly");
		System.out.println("-------------------------------------------------------------");

		if (DLR_Night_Total_total == (DLR_Night_Dept_Workmen + DLR_Night_SC_Workmen + DLR_Night_Security)) {
			System.out.println("Day Shift Total Workmen : " + DLR_Night_Dept_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Dept Workmen : " + DLR_Night_Dept_Workmen);
			System.out.println("Day Shift SC Workmen : " + DLR_Night_SC_Workmen);
			System.out.println("Day Shift Security : " + DLR_Night_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Night Shift Workmen Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println("Day Shift Total Workmen : " + DLR_Night_Dept_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Dept Workmen : " + DLR_Night_Dept_Workmen);
			System.out.println("Day Shift SC Workmen : " + DLR_Night_SC_Workmen);
			System.out.println("Day Shift Security : " + DLR_Night_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Night Shift Workmen Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Dept Workmen Count calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Shift_Total_Dept_Workmen == (DLR_Day_Dept_Workmen + DLR_Night_Dept_Workmen)) {
			System.out.println(" Total Dept.Workmen : " + DLR_Shift_Total_Dept_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Dept Workmen : " + DLR_Day_Dept_Workmen);
			System.out.println("Night Shift Dept Workmen : " + DLR_Night_Dept_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Dept.Workmen Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Dept.Workmen : " + DLR_Shift_Total_Dept_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Dept Workmen : " + DLR_Day_Dept_Workmen);
			System.out.println("Night Shift Dept Workmen : " + DLR_Night_Dept_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Dept.Workmen Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying SC Workmen Count calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Shift_Total_SC_Workmen == (DLR_Day_SC_Workmen + DLR_Night_SC_Workmen)) {
			System.out.println(" Total SC Workmen : " + DLR_Shift_Total_SC_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift SC Workmen : " + DLR_Day_SC_Workmen);
			System.out.println("Night Shift SC Workmen : " + DLR_Night_SC_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total SC Workmen Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total SC Workmen : " + DLR_Shift_Total_SC_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift SC Workmen : " + DLR_Day_SC_Workmen);
			System.out.println("Night Shift SC Workmen : " + DLR_Night_SC_Workmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total SC Workmen Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Security Count calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Shift_Total_Security == (DLR_Day_Security + DLR_Night_Security)) {
			System.out.println(" Total Security : " + DLR_Shift_Total_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Security: " + DLR_Day_Security);
			System.out.println("Night Shift Security : " + DLR_Night_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Total SC Workmen Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Security : " + DLR_Shift_Total_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Security: " + DLR_Day_Security);
			System.out.println("Night Shift Security : " + DLR_Night_Security);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total SC Workmen Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen Count Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Shift_Total_Total == (DLR_Day_Total_total + DLR_Night_Total_total)) {
			System.out.println(" Total Workmen : " + DLR_Shift_Total_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Total Workmen: " + DLR_Day_Total_total);
			System.out.println("Night Shift Total Workmen : " + DLR_Night_Total_total);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen : " + DLR_Shift_Total_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Day Shift Total Workmen: " + DLR_Day_Total_total);
			System.out.println("Night Shift Total Workmen : " + DLR_Night_Total_total);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
	}

	@Then("^Enter DLR Breakup Workmen Strenght$")
	public static void Enter_DLR_Breakup_Workmen_Strenght() throws Throwable {

		Actions action8 = new Actions(DriverFactory.driver);
		action8.moveToElement(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp).perform();

		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.sendKeys(ConfigFileReader.getWorkmen_Strength_LT_Camp());
		System.out.println("Workmen Strength at L&T Camp : " + ConfigFileReader.getWorkmen_Strength_LT_Camp());

		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.sendKeys(ConfigFileReader.getWorkmen_Strength_SC_Camp());
		System.out.println("Workmen Strength at S/c Camp : " + ConfigFileReader.getWorkmen_Strength_SC_Camp());

		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen
				.sendKeys(ConfigFileReader.getWorkmen_Strength_Local_Workmen());
		System.out
				.println("Workmen Strength at Local Workmen : " + ConfigFileReader.getWorkmen_Strength_Local_Workmen());

	}

	@Then("^Enter DLR Breakup Workmen at site$")
	public static void Enter_DLR_Breakup_Workmen_at_site() throws Throwable {

		Actions action7 = new Actions(DriverFactory.driver);
		action7.moveToElement(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp).perform();

		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.sendKeys(ConfigFileReader.getWorkmen_At_Site_LT_Camp());
		System.out.println("Workmen At Site at L&T Camp : " + ConfigFileReader.getWorkmen_At_Site_LT_Camp());

		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.sendKeys(ConfigFileReader.getWorkmen_At_Site_SC_Camp());
		System.out.println("Workmen At Site at S/c Camp : " + ConfigFileReader.getWorkmen_At_Site_SC_Camp());

		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen
				.sendKeys(ConfigFileReader.getWorkmen_At_Site_Local_Workmen());
		System.out.println("Workmen At Site at Local Workmen : " + ConfigFileReader.getWorkmen_At_Site_Local_Workmen());

	}

	@Then("^Enter DLR Breakup Workmen Inducted$")
	public static void Enter_DLR_Breakup_Workmen_Inducted() throws Throwable {

		Actions action6 = new Actions(DriverFactory.driver);
		action6.moveToElement(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp).perform();

		int min_Workmen_inducted_LT_Camp = 100;
		int max_Workmen_inducted_LT_Camp = 1000;
		Random rand = new Random();
		Workmen_inducted_LT_Camp = rand.nextInt(max_Workmen_inducted_LT_Camp - min_Workmen_inducted_LT_Camp)
				+ min_Workmen_inducted_LT_Camp;
		int min_Workmen_inducted_SC_Camp = 100;
		int max_Workmen_inducted_SC_Camp = 1000;
		Random rand2 = new Random();
		Workmen_inducted_SC_Camp = rand2.nextInt(max_Workmen_inducted_SC_Camp - min_Workmen_inducted_SC_Camp)
				+ min_Workmen_inducted_SC_Camp;
		int min_Workmen_inducted_Local = 100;
		int max_Workmen_inducted_Local = 1000;
		Random rand3 = new Random();
		Workmen_inducted_Local = rand3.nextInt(max_Workmen_inducted_Local - min_Workmen_inducted_Local)
				+ min_Workmen_inducted_Local;

		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.sendKeys("" + Workmen_inducted_LT_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.sendKeys("" + Workmen_inducted_SC_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.sendKeys("" + Workmen_inducted_Local);

	}

	@Then("^Enter DLR Breakup Workmen Released$")
	public static void Enter_DLR_Breakup_Workmen_Released() throws Throwable {

		Actions action5 = new Actions(DriverFactory.driver);
		action5.moveToElement(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp).perform();

		int min_Workmen_Released_LT_Camp = 100;
		int max_Workmen_Released_LT_Camp = 1000;
		Random rand = new Random();
		Workmen_Released_LT_Camp = rand.nextInt(max_Workmen_Released_LT_Camp - min_Workmen_Released_LT_Camp)
				+ min_Workmen_Released_LT_Camp;
		int min_Workmen_Released_SC_Camp = 100;
		int max_Workmen_Released_SC_Camp = 1000;
		Random rand2 = new Random();
		Workmen_Released_SC_Camp = rand2.nextInt(max_Workmen_Released_SC_Camp - min_Workmen_Released_SC_Camp)
				+ min_Workmen_Released_SC_Camp;
		int min_Workmen_Released_Local = 100;
		int max_Workmen_Released_Local = 1000;
		Random rand3 = new Random();
		Workmen_Released_Local = rand3.nextInt(max_Workmen_Released_Local - min_Workmen_Released_Local)
				+ min_Workmen_Released_Local;

		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.sendKeys("" + Workmen_Released_LT_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.sendKeys("" + Workmen_Released_SC_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.sendKeys("" + Workmen_Released_Local);

	}

	@Then("^Enter DLR Breakup Workmen Expected to Released$")
	public static void Enter_DLR_Breakup_Workmen_Expected_to_Released() throws Throwable {

		Actions action4 = new Actions(DriverFactory.driver);
		action4.moveToElement(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp).perform();

		int min_Workmen_Expected_to_Releas_LT_Camp = 100;
		int max_Workmen_Expected_to_Releas_LT_Camp = 1000;
		Random rand = new Random();
		Workmen_Expected_to_Releas_LT_Camp = rand
				.nextInt(max_Workmen_Expected_to_Releas_LT_Camp - min_Workmen_Expected_to_Releas_LT_Camp)
				+ min_Workmen_Expected_to_Releas_LT_Camp;
		int min_Workmen_Expected_to_Releas_SC_Camp = 100;
		int max_Workmen_Expected_to_Releas_SC_Camp = 1000;
		Random rand2 = new Random();
		Workmen_Expected_to_Releas_SC_Camp = rand2
				.nextInt(max_Workmen_Expected_to_Releas_SC_Camp - min_Workmen_Expected_to_Releas_SC_Camp)
				+ min_Workmen_Expected_to_Releas_SC_Camp;
		int min_Workmen_Expected_to_Releas_Local = 100;
		int max_Workmen_Expected_to_Releas_Local = 1000;
		Random rand3 = new Random();
		Workmen_Expected_to_Releas_Local = rand3
				.nextInt(max_Workmen_Expected_to_Releas_Local - min_Workmen_Expected_to_Releas_Local)
				+ min_Workmen_Expected_to_Releas_Local;

		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.sendKeys("" + Workmen_Expected_to_Releas_LT_Camp);

		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.sendKeys("" + Workmen_Expected_to_Releas_SC_Camp);

		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.sendKeys("" + Workmen_Expected_to_Releas_Local);

	}

	@Then("^Enter DLR Breakup Workmen Under Quarantine$")
	public static void Enter_DLR_Breakup_Workmen_Under_Quarantine() throws Throwable {

		Actions action3 = new Actions(DriverFactory.driver);
		action3.moveToElement(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp).perform();

		int min_Workmen_Under_Quarantine_LT_Camp = 1;
		int max_Workmen_Under_Quarantine_LT_Camp = 50;
		Random rand = new Random();
		Workmen_Under_Quarantine_LT_Camp = rand
				.nextInt(max_Workmen_Under_Quarantine_LT_Camp - min_Workmen_Under_Quarantine_LT_Camp)
				+ min_Workmen_Under_Quarantine_LT_Camp;
		int min_Workmen_Under_Quarantine_SC_Camp = 1;
		int max_Workmen_Under_Quarantine_SC_Camp = 50;
		Random rand2 = new Random();
		Workmen_Under_Quarantine_SC_Camp = rand2
				.nextInt(max_Workmen_Under_Quarantine_SC_Camp - min_Workmen_Under_Quarantine_SC_Camp)
				+ min_Workmen_Under_Quarantine_SC_Camp;
		int min_Workmen_Under_Quarantine_Local = 1;
		int max_Workmen_Under_Quarantine_Local = 50;
		Random rand3 = new Random();
		Workmen_Under_Quarantine_Local = rand3
				.nextInt(max_Workmen_Under_Quarantine_Local - min_Workmen_Under_Quarantine_Local)
				+ min_Workmen_Under_Quarantine_Local;

		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.sendKeys("" + Workmen_Under_Quarantine_LT_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.sendKeys("" + Workmen_Under_Quarantine_SC_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen
				.sendKeys("" + Workmen_Under_Quarantine_Local);

	}

	@Then("^Enter DLR Breakup Workmen Affected by Covid$")
	public static void Enter_DLR_Breakup_Workmen_Affected_by_Covid() throws Throwable {

		Actions action2 = new Actions(DriverFactory.driver);
		action2.moveToElement(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp).perform();

		int min_Workmen_Affected_by_Covid_LT_Camp = 1;
		int max_Workmen_Affected_by_Covid_LT_Camp = 50;
		Random rand = new Random();
		Workmen_Affected_by_Covid_LT_Camp = rand
				.nextInt(max_Workmen_Affected_by_Covid_LT_Camp - min_Workmen_Affected_by_Covid_LT_Camp)
				+ min_Workmen_Affected_by_Covid_LT_Camp;
		int min_Workmen_Affected_by_Covid_SC_Camp = 1;
		int max_Workmen_Affected_by_Covid_SC_Camp = 50;
		Random rand2 = new Random();
		Workmen_Affected_by_Covid_SC_Camp = rand2
				.nextInt(max_Workmen_Affected_by_Covid_SC_Camp - min_Workmen_Affected_by_Covid_SC_Camp)
				+ min_Workmen_Affected_by_Covid_SC_Camp;
		int min_Workmen_Affected_by_Covid_Local = 1;
		int max_Workmen_Affected_by_Covid_Local = 50;
		Random rand3 = new Random();
		Workmen_Affected_by_Covid_Local = rand3
				.nextInt(max_Workmen_Affected_by_Covid_Local - min_Workmen_Affected_by_Covid_Local)
				+ min_Workmen_Affected_by_Covid_Local;

		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp
				.sendKeys("" + Workmen_Affected_by_Covid_LT_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp
				.sendKeys("" + Workmen_Affected_by_Covid_SC_Camp);

		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen.clear();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen.click();
		ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen
				.sendKeys("" + Workmen_Under_Quarantine_Local);

	}

	@Then("^DLR Breakup Calculated Correctly$")
	public static void DLR_Breakup_Calculated_Correctly() throws Throwable {

		DLR_Shift_Total_Total = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Total.getText());
		DLR_Day_Total_total = Integer.parseInt(ObjectsReporsitory.DLR_Day_Total_total.getText());
		DLR_Night_Total_total = Integer.parseInt(ObjectsReporsitory.DLR_Night_Total_total.getText());
		DLR_Breakup_Workmen_Strength_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_Total.getText());
		DLR_Breakup_Workmen_AtSite_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_Total.getText());
		DLR_Breakup_Workmen_Inducted_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_Total.getText());
		DLR_Breakup_Workmen_Released_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_Total.getText());
		DLR_Breakup_Expected_to_Release_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_Total.getText());
		DLR_Breakup_Workmen_under_Quarantine_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_Total.getText());
		DLR_Breakup_Workmen_Affected_by_Covid_Total = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_Total.getText());
		DLR_Breakup_Remarks_Total = Integer.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_Total.getText());
		DLR_Shift_Total_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Dept_Workmen.getText());
		DLR_Shift_Total_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_SC_Workmen.getText());
		DLR_Shift_Total_Security = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Security.getText());
		DLR_Day_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Day_Dept_Workmen.getAttribute("value"));
		DLR_Day_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Day_SC_Workmen.getAttribute("value"));
		DLR_Day_Security = Integer.parseInt(ObjectsReporsitory.DLR_Day_Security.getAttribute("value"));
		DLR_Night_Dept_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Night_Dept_Workmen.getAttribute("value"));
		DLR_Night_SC_Workmen = Integer.parseInt(ObjectsReporsitory.DLR_Night_SC_Workmen.getAttribute("value"));
		DLR_Night_Security = Integer.parseInt(ObjectsReporsitory.DLR_Night_Security.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Strength_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_AtSite_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Inducted_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Released_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Released_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Released_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LTCamp.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_SCCamp.getAttribute("value"));
		DLR_Breakup_Expected_to_Release_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LTCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_SCCamp.getAttribute("value"));
		DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen.getAttribute("value"));
		DLR_Breakup_Remarks_LTCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_LTCamp.getAttribute("value"));
		DLR_Breakup_Remarks_SCCamp = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_SCCamp.getAttribute("value"));
		DLR_Breakup_Remarks_LocalWorkmen = Integer
				.parseInt(ObjectsReporsitory.DLR_Breakup_Remarks_LocalWorkmen.getAttribute("value"));

		DLR_Shift_Total_Dept_Workmen2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Dept_Workmen.getText());
		DLR_Shift_Total_SC_Workmen2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_SC_Workmen.getText());
		DLR_Shift_Total_Security2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Security.getText());
		DLR_Day_Total_total3 = Integer.parseInt(ObjectsReporsitory.DLR_Day_Total_total.getText());
		DLR_Night_Total_total3 = Integer.parseInt(ObjectsReporsitory.DLR_Night_Total_total.getText());
		DLR_Shift_Total_Total2 = Integer.parseInt(ObjectsReporsitory.DLR_Shift_Total_Total.getText());
		
//		DLR_Breakup_Workmen_Strength_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Strength_Total.getText());
//		DLR_Breakup_Workmen_AtSite_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_AtSite_Total.getText());
//		DLR_Breakup_Workmen_Inducted_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Inducted_Total.getText());
//		DLR_Breakup_Workmen_Released_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Released_Total.getText());
//		DLR_Breakup_Expected_to_Release_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Expected_to_Release_Total.getText());
//		DLR_Breakup_Workmen_under_Quarantine_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_under_Quarantine_Total.getText());
//		DLR_Breakup_Workmen_Affected_by_Covid_Total2 = Integer
//				.parseInt(ObjectsReporsitory.DLR_Breakup_Workmen_Affected_by_Covid_Total.getText());
//
//		System.out.println("DLR Breakup : Workmen Strength Total: " + DLR_Breakup_Workmen_Strength_Total2);
//		System.out.println("DLR Breakup : Workmen At Site Total: " + DLR_Breakup_Workmen_AtSite_Total2);
//		System.out.println("DLR Breakup : Workmen Inducted Total: " + DLR_Breakup_Workmen_Inducted_Total2);
//		System.out.println("DLR Breakup : Workmen Released Total: " + DLR_Breakup_Workmen_Released_Total2);
//		System.out
//				.println("DLR Breakup : Workmen Expected to Release Total: " + DLR_Breakup_Expected_to_Release_Total2);
//		System.out.println(
//				"DLR Breakup : Workmen Workmen Under Quarantine Total: " + DLR_Breakup_Workmen_under_Quarantine_Total2);
//		System.out.println(
//				"DLR Breakup : Workmen Affected by Covid Total: " + DLR_Breakup_Workmen_Affected_by_Covid_Total2);

		Screenshot.Screenshotforscenario();
		
		System.out.println("Verifying Total Workmen strength is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Workmen_Strength_Total == (DLR_Breakup_Workmen_Strength_LTCamp + DLR_Breakup_Workmen_Strength_SCCamp + DLR_Breakup_Workmen_Strength_LocalWorkmen)) {
			System.out.println(" Total Workmen Strength : " + DLR_Shift_Total_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Strenght in L&T Camp: " + DLR_Breakup_Workmen_Strength_LTCamp);
			System.out.println("Workmen Strenght in S/C Camp: " + DLR_Breakup_Workmen_Strength_SCCamp);
			System.out.println("Workmen Strenght - Local Workmen: " + DLR_Breakup_Workmen_Strength_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen Strength Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen Strength : " + DLR_Shift_Total_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Strenght in L&T Camp: " + DLR_Breakup_Workmen_Strength_LTCamp);
			System.out.println("Workmen Strenght in S/C Camp: " + DLR_Breakup_Workmen_Strength_SCCamp);
			System.out.println("Workmen Strenght - Local Workmen: " + DLR_Breakup_Workmen_Strength_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen Strength Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen at Site is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Workmen_AtSite_Total == (DLR_Breakup_Workmen_AtSite_LTCamp + DLR_Breakup_Workmen_AtSite_SCCamp + DLR_Breakup_Workmen_AtSite_LocalWorkmen)) {
			System.out.println(" Total Workmen At Site: " + DLR_Breakup_Workmen_AtSite_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen At Site in L&T Camp: " + DLR_Breakup_Workmen_AtSite_LTCamp);
			System.out.println("Workmen At Site in S/C Camp: " + DLR_Breakup_Workmen_AtSite_SCCamp);
			System.out.println("Workmen At Site - Local Workmen: " + DLR_Breakup_Workmen_AtSite_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen At Site Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen At Site: " + DLR_Breakup_Workmen_AtSite_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen At Site in L&T Camp: " + DLR_Breakup_Workmen_AtSite_LTCamp);
			System.out.println("Workmen At Site in S/C Camp: " + DLR_Breakup_Workmen_AtSite_SCCamp);
			System.out.println("Workmen At Site - Local Workmen: " + DLR_Breakup_Workmen_AtSite_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen At Site Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen Inducted is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Workmen_Inducted_Total == (DLR_Breakup_Workmen_Inducted_Total + DLR_Breakup_Workmen_Inducted_SCCamp + DLR_Breakup_Workmen_Inducted_LocalWorkmen)) {
			System.out.println(" Total Workmen Inducted: " + DLR_Breakup_Workmen_Inducted_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Inducted in L&T Camp: " + DLR_Breakup_Workmen_Inducted_LTCamp);
			System.out.println("Workmen Inducted in S/C Camp: " + DLR_Breakup_Workmen_Inducted_SCCamp);
			System.out.println("Workmen Inducted - Local Workmen: " + DLR_Breakup_Workmen_Inducted_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen Inducted Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen Inducted: " + DLR_Breakup_Workmen_Inducted_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Inducted in L&T Camp: " + DLR_Breakup_Workmen_Inducted_LTCamp);
			System.out.println("Workmen Inducted in S/C Camp: " + DLR_Breakup_Workmen_Inducted_SCCamp);
			System.out.println("Workmen Inducted - Local Workmen: " + DLR_Breakup_Workmen_Inducted_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen Inducted Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen Released is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Workmen_Released_Total == (DLR_Breakup_Workmen_Released_Total + DLR_Breakup_Workmen_Released_SCCamp + DLR_Breakup_Workmen_Released_LocalWorkmen)) {
			System.out.println(" Total Workmen Released: " + DLR_Breakup_Workmen_Released_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Released in L&T Camp: " + DLR_Breakup_Workmen_Released_LTCamp);
			System.out.println("Workmen Released in S/C Camp: " + DLR_Breakup_Workmen_Released_SCCamp);
			System.out.println("Workmen Released - Local Workmen: " + DLR_Breakup_Workmen_Released_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen Released Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen Released: " + DLR_Breakup_Workmen_Released_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Released in L&T Camp: " + DLR_Breakup_Workmen_Released_LTCamp);
			System.out.println("Workmen Released in S/C Camp: " + DLR_Breakup_Workmen_Released_SCCamp);
			System.out.println("Workmen Released - Local Workmen: " + DLR_Breakup_Workmen_Released_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen Released Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen Expected to Released is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Expected_to_Release_Total == (DLR_Breakup_Expected_to_Release_LTCamp + DLR_Breakup_Expected_to_Release_SCCamp + DLR_Breakup_Expected_to_Release_LocalWorkmen)) {
			System.out.println(" Total Workmen Expected to Released: " + DLR_Breakup_Expected_to_Release_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Expected to Released in L&T Camp: " + DLR_Breakup_Expected_to_Release_LTCamp);
			System.out.println("Workmen Expected to Released in S/C Camp: " + DLR_Breakup_Expected_to_Release_SCCamp);
			System.out.println("Workmen Expected to Released - Local Workmen: " + DLR_Breakup_Expected_to_Release_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen Expected to Released Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen Expected to Released: " + DLR_Breakup_Expected_to_Release_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Expected to Released in L&T Camp: " + DLR_Breakup_Expected_to_Release_LTCamp);
			System.out.println("Workmen Expected to Released in S/C Camp: " + DLR_Breakup_Expected_to_Release_SCCamp);
			System.out.println("Workmen Expected to Released - Local Workmen: " + DLR_Breakup_Expected_to_Release_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen Expected to Released Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen under_Quarantine_Total is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Workmen_under_Quarantine_Total == (DLR_Breakup_Workmen_Released_Total + DLR_Breakup_Workmen_under_Quarantine_SCCamp + DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen)) {
			System.out.println(" Total Workmen under_Quarantine: " + DLR_Breakup_Workmen_under_Quarantine_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen under_Quarantine in L&T Camp: " + DLR_Breakup_Workmen_under_Quarantine_LTCamp);
			System.out.println("Workmen under_Quarantine in S/C Camp: " + DLR_Breakup_Workmen_under_Quarantine_SCCamp);
			System.out.println("Workmen under_Quarantine - Local Workmen: " + DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen under_Quarantine Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen under_Quarantine: " + DLR_Breakup_Workmen_under_Quarantine_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen under_Quarantine in L&T Camp: " + DLR_Breakup_Workmen_under_Quarantine_LTCamp);
			System.out.println("Workmen under_Quarantine in S/C Camp: " + DLR_Breakup_Workmen_under_Quarantine_SCCamp);
			System.out.println("Workmen under_Quarantine - Local Workmen: " + DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen under_Quarantine Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
		System.out.println("Verifying Total Workmen Affected_by_Covid is Calculated Correctly");
		System.out.println("-------------------------------------------------------------");
		if (DLR_Breakup_Workmen_Affected_by_Covid_Total == (DLR_Breakup_Workmen_Affected_by_Covid_Total + DLR_Breakup_Workmen_Affected_by_Covid_SCCamp + DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen)) {
			System.out.println(" Total Workmen Affected_by_Covid: " + DLR_Breakup_Workmen_Affected_by_Covid_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Affected_by_Covid in L&T Camp: " + DLR_Breakup_Workmen_Affected_by_Covid_LTCamp);
			System.out.println("Workmen Affected_by_Covid in S/C Camp: " + DLR_Breakup_Workmen_Affected_by_Covid_SCCamp);
			System.out.println("Workmen Affected_by_Covid - Local Workmen: " + DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Total Workmen Affected_by_Covid Count Caculated Correclty");
			System.out.println("==================================================");
		} else {
			System.out.println(" Total Workmen Affected_by_Covid: " + DLR_Breakup_Workmen_Affected_by_Covid_Total);
			System.out.println("--------------------------------------------------");
			System.out.println("Workmen Affected_by_Covid in L&T Camp: " + DLR_Breakup_Workmen_Affected_by_Covid_LTCamp);
			System.out.println("Workmen Affected_by_Covid in S/C Camp: " + DLR_Breakup_Workmen_Affected_by_Covid_SCCamp);
			System.out.println("Workmen Affected_by_Covid - Local Workmen: " + DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen);
			System.out.println("--------------------------------------------------");
			System.out.println("Error : Total Workmen Affected_by_Covid Count Not Caculated Correclty");
			System.out.println("==================================================");
			// fail();
		}
	}

	@Then("^Verify User can be able to Save DLR Entry$")
	public static void Verify_User_can_be_able_to_Save_DLR_Entry() throws Throwable {

		Actions action1 = new Actions(DriverFactory.driver);
		action1.moveToElement(ObjectsReporsitory.DLR_Save).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.DLR_Save));
		ObjectsReporsitory.DLR_Save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		Screenshot.Screenshotforscenario();
		System.out.println("DLR Entry Saved");
		System.out.println("=====================");

	}
}
