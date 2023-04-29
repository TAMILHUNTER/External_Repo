package stepdefinition.Induction_Dashboard;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Edit.Edit_Personal_Details;
import stepdefinition.DLR.Create.DLR;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class View_Profile {

	static int Skill_Analyisis_Count;
	public static int popup_validation;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static String SpouseName;
	public static String NoOfChildren;
	public static String WorkmeNameSearchResult;
	public static String CstiOrNaps;
	public static String WorkmanPartnerNameWMS;
	public static String WorkmanMobileNumberWMS;
	public static String PermanentAddressWMS;
	public static String PermanentVillageWMS;
	public static String TemporaryAddressWMS;
	public static String TemporaryVillageWMS;
	public static String ECNameWMS;
	public static String ECMobileNumberWMS;
	public static String ECRelationshipWMS;
	public static String ECAddressWMS;
	public static String ECVillageWMS;
	public static String PermanentPincode;
	public static String ECPincode;
	public static String Skill_Category;
	public static String Skill_Group;
	public static String Skill_Description;
	public static String Skill_Type;
	public static String Deployment;
	public static String Workmanname;
	public static String WorkmanNumber;
	public static String WorkmanJob;
	public static String WorkmanSkill;
	public static String WorkmanStatus;
	public static String WorkmenGender;
	public static String WorkmenAadhaar;
	public static String WorkmenPartner;
	public static String WorkmenStatus;
	public static String WorkmenJobCode;
	public static String WorkmenSkill;
	public static String WorkmenWorkType;

// Page Factory
	public View_Profile() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Navigate to Induction Dashboard View Profile$")
	public static void Navigate_to_Induction_Dashboard_View_Profile() throws Throwable {
		Edit_Personal_Details.Navigate_to_Workman_serarch();
	}

	@Given("^Navigate to Induction Dashboard and select Domestic for search$")
	public static void Navigate_to_Induction_Dashboard_and_select_Domestic_for_search() throws Throwable {
		DriverFactory.driver.manage().deleteAllCookies();
		Login.Use_Login_Induction_Basic();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		ObjectsReporsitory.WMS_induction.click();
		Basic.PageLoader_Validation();
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

	}

	@Given("^Navigate to Induction Dashboard and select International for search$")
	public static void Navigate_to_Induction_Dashboard_and_select_International_for_search() throws Throwable {
		DriverFactory.driver.manage().deleteAllCookies();
		Login.Use_Login_for_InternationalJob();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		ObjectsReporsitory.WMS_induction.click();
		Basic.PageLoader_Validation();
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.contains(ConfigFileReader.getSwitch_international_job_LE20D146())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getSwitch_international_job_LE20D146());
		} else {
			SwitchJob_Create.SwitchJob_LE20D146();
		}
		// New Implementation
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_International));
		ObjectsReporsitory.WorkmenSearch_International.click();

		// DLR

		Edit_Personal_Details.CheckDLR_International();

	}

	@Then("^Search workmen by Employee ID$")
	public static void Search_workmen_by_Employee_ID() throws Throwable {
		System.out.println("Search workmen by Workmen Number");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Number();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

	// ****************************************************************************************************************************
	@Then("^Search Domestic workmen by Employee ID$")
	public static void Search_workmen_by_Employee_ID_Domestic() throws Throwable {
		System.out.println("Search workmen by Workmen Number");
		System.out.println("==============================");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();
		DataBaseConnection.GetWorkmannumber_Domestic();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

	// ****************************************************************************************************************************
	@Then("^Search workmen by Aadhar$")
	public static void Search_workmen_by_Aadhar() throws Throwable {
		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Aadhar();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmenPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails));
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmenPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);

	}

	// ************************************************************************************************************

	@Then("^Search domestic workmen by Aadhar$")
	public static void Search_workmen_by_Aadhar_domestic() throws Throwable {
		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();
		DataBaseConnection.GetWorkmanAadhar_domestic();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmenPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails));
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmenPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);

	}

	// ************************************************************************************************************

	@Then("^Verify User can able to View workman Profile$")
	public static void Verify_User_can_able_to_View_workman_Profile() throws Throwable {
		System.out.println("Search workmen by ID & View workman Profile ");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		Thread.sleep(5000);
		View_Profile.Search_workmen_by_Employee_ID();
		System.out.println("END : Search workmen by ID & View workman Profile");
		System.out.println("==============================");

	}

	public static void Search_workmen_by_Name_FatherName() throws Throwable {
		System.out.println("Search workmen by Name & Father Name");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Name();
		Edit_Personal_Details.Search_Workman_by_FatherName();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String WorkmanStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmanPartnername = ObjectsReporsitory.Dashboard_Workmen_Partner_Name.getText().substring(2);
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("WorkmanStatus    :" + WorkmanStatus);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner ID :" + WorkmanPartner);
		System.out.println("WorkmenPartner Name :" + WorkmanPartnername);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}
	
	
	//****************************************************************************************

	
	public static void Search_workmen_by_Name_FatherName_Domestic() throws Throwable {
		System.out.println("Search workmen by Name & Father Name");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Name_Domestic();
		Edit_Personal_Details.Search_Workman_by_FatherName_Domestic();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String WorkmanStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmanPartnername = ObjectsReporsitory.Dashboard_Workmen_Partner_Name.getText().substring(2);
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("WorkmanStatus    :" + WorkmanStatus);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner ID :" + WorkmanPartner);
		System.out.println("WorkmenPartner Name :" + WorkmanPartnername);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}
	
	//****************************************************************************************

	public static void Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_alone() throws Throwable {
		System.out.println("Search workmen by Name Alone");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Multiple_Name_Domestic();
		ObjectsReporsitory.Dashboard_SearchWorkmenFather_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmenFather_Name.clear();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

	public static void Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_FatherName_alone()
			throws Throwable {
		System.out.println("Search workmen by Father Name Alone");
		System.out.println("==============================");
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		Edit_Personal_Details.Search_Workman_by_FatherName_multiple();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

	public static void Search_workmen_by_Passport_no() throws Throwable {
		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Passport_no();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

	public static void Search_workmen_by_Name_multiple() throws Throwable {

		WorkmeNameSearchResult = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_First.getText();
		if (WorkmeNameSearchResult.contains("No records")) {

			System.out.println("No Workmen Found for the search input");
			System.out.println("--------------------------------------");
			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_close));
			ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_close.click();

		} else {
			List<WebElement> listElement_Search_Results1 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_Addhaar_AllElemet;
			for (int i = 0; i < listElement_Search_Results1.size(); i++) {
				System.out.println(
						"Workmen Aadhaar Number " + (i + 1) + " : " + listElement_Search_Results1.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results2 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenName_AllElemet;
			for (int i2 = 0; i2 < listElement_Search_Results2.size(); i2++) {
				System.out.println("Workmen Name " + (i2 + 1) + " : " + listElement_Search_Results2.get(i2).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results3 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenNumber_AllElemet;
			for (int i3 = 0; i3 < listElement_Search_Results3.size(); i3++) {
				System.out
						.println("Workmen Number " + (i3 + 1) + " : " + listElement_Search_Results3.get(i3).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results4 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenJob_AllElemet;
			for (int i4 = 0; i4 < listElement_Search_Results4.size(); i4++) {
				System.out.println("Workmen Job " + (i4 + 1) + " : " + listElement_Search_Results4.get(i4).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results5 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenStatus_AllElemet;
			for (int i5 = 0; i5 < listElement_Search_Results5.size(); i5++) {
				System.out
						.println("Workmen Status " + (i5 + 1) + " : " + listElement_Search_Results5.get(i5).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results6 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenSkill_AllElemet;
			for (int i6 = 0; i6 < listElement_Search_Results6.size(); i6++) {
				System.out.println("Workmen Skill " + (i6 + 1) + " : " + listElement_Search_Results6.get(i6).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results7 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenNumber_AllElemet;
			for (int i7 = 0; i7 < listElement_Search_Results7.size(); i7++) {
				System.out.println("Father's Name " + (i7 + 1) + " : " + listElement_Search_Results7.get(i7).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results8 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenGender_AllElemet;
			for (int i8 = 0; i8 < listElement_Search_Results8.size(); i8++) {
				System.out
						.println("Workmen Gender " + (i8 + 1) + " : " + listElement_Search_Results8.get(i8).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			List<WebElement> listElement_Search_Results9 = ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenWorkType_AllElemet;
			for (int i9 = 0; i9 < listElement_Search_Results9.size(); i9++) {
				System.out.println("Work Type " + (i9 + 1) + " : " + listElement_Search_Results9.get(i9).getText());
			}
			System.out.println("-----------------------------------------------------------------------");

			Random rand11 = new Random();
			int RandomWorkmen = rand11.nextInt(
					ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenNumber_AllElemet.size());
			ObjectsReporsitory.Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenNumber_AllElemet.get(RandomWorkmen)
					.click();
			System.out.println("Workmen Selected ");
			System.out.println("-----------------------------------------------------------------------");
			Thread.sleep(5000);
		}
	}

	public static void Search_workmen_by_Employee_ID_Internatioanl() throws Throwable {
		System.out.println("Search workmen by Workmen Number");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Number_international();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

	public static void Search_workmen_by_Passport_no_International() throws Throwable {
		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Passport_no_international();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_other();
		String Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		String WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		String WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		String WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		String WorkmanPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		String WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		String WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		String WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		String WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmanSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmanPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmanPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
	}

}
