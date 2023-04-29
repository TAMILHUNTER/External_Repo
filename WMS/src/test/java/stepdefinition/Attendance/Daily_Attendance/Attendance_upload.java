package stepdefinition.Attendance.Daily_Attendance;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import test.DataBaseConnection;
import utils.DriverFactory;

public class Attendance_upload {

	public static int Search_Aadhaar_Number;
	public static int popup_validation;
	public static String Month;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Attendance_upload() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login and Navigate to Attendance$")
	public static void Login_and_Navigate_to_Gate_Pass() throws Throwable {

		Login.Use_Login_Attendance_Creator();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		ObjectsReporsitory.WMS_induction.click();
		Thread.sleep(5000);
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
		ObjectsReporsitory.Menu_Attendance.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		System.out.println("Navigated to Attendance");

	}

	@Then("^Verify User can be able to Upload Attendance Data via Cap file$")
	public static void Verify_User_can_be_able_to_Upload_Attendance_Data_via_Cap_file() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		ObjectsReporsitory.Attendance_uploadCAP
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile());
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Hehehehe : " + popup_validation);
		Thread.sleep(5000);
		if (popup_validation == 1) {

			System.out.println("Attendance File Uploaded Successfully");
			System.out.println("=======================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();

		} else {
			System.out.println("File Not Uploaded");
		}

	}

	@Then("^Upload All Attendance Data for the year$")
	public static void Upload_All_Attendance_Data_for_the_year() throws Throwable {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MMMMMMMMM");
		Month = formatter.format(date).substring(0, 3);
		System.out.println("Current Month : " + Month);

		if (Month.equals("Jan")) {

			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
		} else if ((Month.equals("Feb"))) {
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
		}

		else if ((Month.equals("Dec"))) {

			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile7());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jul Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile8());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Aug Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile9());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Sep Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile10());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Oct Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile11());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Nov Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile12());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Dec Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

		}

		else if ((Month.equals("Nov"))) {

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());
			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile7());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jul Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile8());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Aug Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile9());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Sep Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile10());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Oct Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile11());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Nov Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

		}

		else if ((Month.equals("Oct"))) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());
			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile7());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jul Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile8());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Aug Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile9());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Sep Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile10());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Oct Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

		}

		else if ((Month.equals("Sep"))) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());
			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile7());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jul Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile8());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Aug Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile9());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Sep Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

		}

		else if ((Month.equals("Aug"))) {// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile7());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jul Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile8());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Aug Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
		} else if ((Month.equals("Jul"))) {// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile7());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jul Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

		} else if ((Month.equals("Jun"))) {// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile6());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jun Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
		} else if ((Month.equals("May"))) {// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile5());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("May Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
		} else if ((Month.equals("Apr"))) {// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile4());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Apr Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
		} else if ((Month.equals("Mar"))) {// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile1());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Jan Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************
			// ********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile2());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Feb Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}
			// ********************************************End************************************************

//********************************************Start************************************************
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
			ObjectsReporsitory.WMS_induction2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_Attendance));
			ObjectsReporsitory.Menu_Attendance.click();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
			ObjectsReporsitory.Attendance_uploadCAP
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_CapFile3());

			popup_validation = ObjectsReporsitory.basic_popup_validation.size();

			Thread.sleep(5000);
			if (popup_validation == 1) {

				System.out.println("Mar Month Attendance File Uploaded Successfully");
				System.out.println("=======================================");
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Screenshot.Screenshotforscenario();
				Thread.sleep(5000);
				Basic.popup_handle();

			} else {
				System.out.println("File Not Uploaded");
			}

//********************************************End************************************************
		}
		System.out.println("Attendance Data uploaded untill " + Month + " Month");
		System.out.println("-----------------------------------------------------");
	}

	@Then("^Verify user can be able to View Attendance Summary By selecting Date$")
	public static void Verify_user_can_be_able_to_View_Attendance_Summary_By_selecting_Date() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.AttendanceDate));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_select_calender));
		ObjectsReporsitory.Datepicker_select_calender.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_select_calender_header));
		ObjectsReporsitory.Datepicker_7Datepreceding.click();
		// test.kendo_Calender_Hardcoded.kendo_Calender_Attendance();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify user can be able to View Attendance Summary details is Displayed$")
	public static void Verify_user_can_be_able_to_View_Attendance_Summary_details_is_Displayed() throws Throwable {

		Thread.sleep(2000);
		if (ObjectsReporsitory.Attendance_Summery_data.getText().equals("No records available.")) {
			System.out.println("No Attendance Data found for the Selected Date");
		}

		else {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("WorkmenNumber : " + ObjectsReporsitory.Attendance_Summery_WorkmenNumber.getText());
			System.out.println("WorkmenName : " + ObjectsReporsitory.Attendance_Summery_WorkmenName.getText());
			System.out.println("SubContractor : " + ObjectsReporsitory.Attendance_Summery_SubContractor.getText());
			System.out.println("Shitcode : " + ObjectsReporsitory.Attendance_Summery_Shitcode.getText());
			System.out.println("InTime : " + ObjectsReporsitory.Attendance_Summery_InTime.getText());
			System.out.println("OutTime : " + ObjectsReporsitory.Attendance_Summery_OutTime.getText());
			System.out.println("CostPackage : " + ObjectsReporsitory.Attendance_Summery_CostPackage.getText());
			System.out.println("Source : " + ObjectsReporsitory.Attendance_Summery_Source.getText());
			System.out.println("ServerName : " + ObjectsReporsitory.Attendance_Summery_ServerName.getText());
			System.out.println("MachineID : " + ObjectsReporsitory.Attendance_Summery_MachineID.getText());
			System.out.println("LogUserID : " + ObjectsReporsitory.Attendance_Summery_LogUserID.getText());
			System.out.println("------------------------------------------------------------------------------");
		}

	}

	@Then("^Verify User can be able to Upload Attendance Data via txt file$")
	public static void Verify_User_can_be_able_to_Upload_Attendance_Data_via_txt_file() throws Throwable {

		System.out.println("Uploading TXT file");
		System.out.println("----------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		ObjectsReporsitory.Attendance_uploadCAP
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_txtFile());
		Thread.sleep(5000);
		Verification_Popup_Attendance.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Upload Attendance Data via pdf file$")
	public static void Verify_User_can_be_able_to_Upload_Attendance_Data_via_pdf_file() throws Throwable {

		System.out.println("Uploading PDF file");
		System.out.println("----------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		ObjectsReporsitory.Attendance_uploadCAP
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_pdfFile());
		Thread.sleep(5000);
		Verification_Popup_Attendance.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Upload Attendance Data via excel file$")
	public static void Verify_User_can_be_able_to_Upload_Attendance_Data_via_excel_file() throws Throwable {

		System.out.println("Uploading Excel file");
		System.out.println("----------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		ObjectsReporsitory.Attendance_uploadCAP
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_excelFile());
		Thread.sleep(5000);
		Verification_Popup_Attendance.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Upload Attendance Data via image file$")
	public static void Verify_User_can_be_able_to_Upload_Attendance_Data_via_image_file() throws Throwable {

		System.out.println("Uploading Image file");
		System.out.println("----------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		ObjectsReporsitory.Attendance_uploadCAP
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_jpegFile());
		Thread.sleep(5000);
		Verification_Popup_Attendance.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Upload Attendance Data with wrong cap file format$")
	public static void Verify_User_can_be_able_to_Upload_Attendance_Data_with_wrong_cap_file_format() throws Throwable {

		System.out.println("Uploading Wrong format cap file");
		System.out.println("----------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Attendance_uploadCAP));
		ObjectsReporsitory.Attendance_uploadCAP
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getAttendance_invalidcap());
		Thread.sleep(5000);
		Verification_Popup_Attendance.Validation_popup_handle();

	}

	@Then("^Verify User can be able to view attendance record$")
	public static void Verify_User_can_be_able_to_view_attendance_record() throws Throwable {

		DataBaseConnection.GetattendanceDate();

		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();

		if (ObjectsReporsitory.Attendacne_record.getText().contains("No records available")) {
			
			System.out.println(" Attendance records not available for the selected date");

		} else {
			for (int i = 0; i < ObjectsReporsitory.Attendacne_WorkmenNumber.size(); i++) {
				System.out.println(
						"Workmen Number " + (i + 1) + ObjectsReporsitory.Attendacne_WorkmenNumber.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_WorkmenName.size(); i++) {
				System.out.println(
						"Workmen Name " + (i + 1) + ObjectsReporsitory.Attendacne_WorkmenName.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_subcontractor.size(); i++) {
				System.out.println(
						"Sub Contractor " + (i + 1) + ObjectsReporsitory.Attendacne_subcontractor.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_shiftcode.size(); i++) {
				System.out.println("Shift Code " + (i + 1) + ObjectsReporsitory.Attendacne_shiftcode.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_inTime.size(); i++) {
				System.out.println("In Time " + (i + 1) + ObjectsReporsitory.Attendacne_inTime.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_outtime.size(); i++) {
				System.out.println("Out Time " + (i + 1) + ObjectsReporsitory.Attendacne_outtime.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_costpackage.size(); i++) {
				System.out.println(
						"Cost Package " + (i + 1) + ObjectsReporsitory.Attendacne_costpackage.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_source.size(); i++) {
				System.out.println("Source " + (i + 1) + ObjectsReporsitory.Attendacne_source.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_servername.size(); i++) {
				System.out
						.println("Server Name " + (i + 1) + ObjectsReporsitory.Attendacne_WorkmenName.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_machineID.size(); i++) {
				System.out.println("Machine ID " + (i + 1) + ObjectsReporsitory.Attendacne_machineID.get(i).getText());
			}

			for (int i = 0; i < ObjectsReporsitory.Attendacne_LoguserID.size(); i++) {
				System.out.println("LogUserID " + (i + 1) + ObjectsReporsitory.Attendacne_LoguserID.get(i).getText());
			}
		}

	}
	
	
	@Then("^Verify User can be able to expand or collapse attendance view grid$")
	public static void Verify_User_can_be_able_to_Expand_Collapse_attendance_window() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_Expand));
		ObjectsReporsitory.FA_Expand.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_collapse));
		Screenshot.Screenshotforscenario();
		System.out.println("Attendance window expanded");
		ObjectsReporsitory.FA_collapse.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_Expand));
		System.out.println("Attendance window Collapsed");
		
		
	}

}
