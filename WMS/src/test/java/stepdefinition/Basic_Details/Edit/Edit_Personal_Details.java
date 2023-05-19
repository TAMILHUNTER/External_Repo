package stepdefinition.Basic_Details.Edit;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Basic_Details.Create.Personal;
import stepdefinition.DLR.Create.DLR;
import stepdefinition.Induction_Dashboard.Profile_Basic;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Edit_Personal_Details {

	public static int popup_validation;
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
	public static String Selected_religionStatus;
	public static String Selected_nationalityStatus;
	public static String Selected_Worktype;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Personal_Details() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Navigate to Workman serarch$")
	public static void Navigate_to_Workman_serarch() throws Throwable {
		DriverFactory.driver.manage().deleteAllCookies();
		Login.Use_Login_Induction_Basic();
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
		if (ConfigFileReader.getWorkmen_search_By().endsWith("Domestic")) {
			ObjectsReporsitory.WorkmenSearch_Domestic.click();
		} else if (ConfigFileReader.getWorkmen_search_By().endsWith("International")) {
			ObjectsReporsitory.WorkmenSearch_International.click();
		}

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

	@Then("^Search Workman by Number$")
	public static void Search_Workman_by_Number() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();
		DataBaseConnection.GetWorkmannumber();

	}

	@Then("^Search Workman by Number international$")
	public static void Search_Workman_by_Number_international() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();
		DataBaseConnection.GetWorkmannumber_international();

	}

	@Then("^Search Workman by Name$")
	public static void Search_Workman_by_Name() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);

		List<WebElement> listElement_Search_By_options_Results = ObjectsReporsitory.Dashboard_SearchBy_All_option;
		for (WebElement webElement66 : listElement_Search_By_options_Results) {
			if (webElement66.getText().contains(ConfigFileReader.getSearch_By_Name())) {
				webElement66.click();
				System.out.println(
						"Search Workmen By : " + dataProviders.ConfigFileReader.getSearch_By_Name() + " is Selected");
				break;
			} else {
				System.out.println("Search Workmen By Workmen Name Option is Not displayed");
			}
		}

		DataBaseConnection.GetWorkmanname();

	}

	// ****************************************************************************************
	@Then("^Search Domestic Workman by Name$")
	public static void Search_Workman_by_Name_Domestic() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);

		List<WebElement> listElement_Search_By_options_Results = ObjectsReporsitory.Dashboard_SearchBy_All_option;
		for (WebElement webElement66 : listElement_Search_By_options_Results) {
			if (webElement66.getText().contains(ConfigFileReader.getSearch_By_Name())) {
				webElement66.click();
				System.out.println(
						"Search Workmen By : " + dataProviders.ConfigFileReader.getSearch_By_Name() + " is Selected");
				break;
			} else {
				System.out.println("Search Workmen By Workmen Name Option is Not displayed");
			}
		}

		DataBaseConnection.GetWorkmanname_Domestic();

	}

	// ****************************************************************************************

	// ****************************************************************************************
	@Then("^Search Domestic Multiple Workman by Name$")
	public static void Search_Workman_by_Multiple_Name_Domestic() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);

		List<WebElement> listElement_Search_By_options_Results = ObjectsReporsitory.Dashboard_SearchBy_All_option;
		for (WebElement webElement66 : listElement_Search_By_options_Results) {
			if (webElement66.getText().contains(ConfigFileReader.getSearch_By_Name())) {
				webElement66.click();
				System.out.println(
						"Search Workmen By : " + dataProviders.ConfigFileReader.getSearch_By_Name() + " is Selected");
				break;
			} else {
				System.out.println("Search Workmen By Workmen Name Option is Not displayed");
			}
		}

		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.sendKeys(ConfigFileReader.getSearch_By_Name_value());

	}

	// ****************************************************************************************

	@Then("^Search Workman by FatherNameName$")
	public static void Search_Workman_by_FatherName() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);

		List<WebElement> listElement_Search_By_options_Results = ObjectsReporsitory.Dashboard_SearchBy_All_option;
		for (WebElement webElement688 : listElement_Search_By_options_Results) {
			if (webElement688.getText().contains(ConfigFileReader.getSearch_By_Name())) {
				webElement688.click();
				System.out.println(
						"Search Workmen By : " + dataProviders.ConfigFileReader.getSearch_By_Name() + " is Selected");
				break;
			}
		}

		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.sendKeys(ConfigFileReader.getSearch_By_FatherName_value());

	}

	// ****************************************************************************************

	// ****************************************************************************************

	@Then("^Search Multiple records Workman by FatherNameName$")
	public static void Search_Workman_by_FatherName_multiple() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);

		List<WebElement> listElement_Search_By_options_Results = ObjectsReporsitory.Dashboard_SearchBy_All_option;
		for (WebElement webElement688 : listElement_Search_By_options_Results) {
			if (webElement688.getText().contains(ConfigFileReader.getSearch_By_Name())) {
				webElement688.click();
				System.out.println(
						"Search Workmen By : " + dataProviders.ConfigFileReader.getSearch_By_Name() + " is Selected");
				break;
			}
		}

		DataBaseConnection.GetWorkmanFathername_Multiple();

	}

	// ****************************************************************************************

	@Then("^Search Domestic Workman by FatherNameName$")
	public static void Search_Workman_by_FatherName_Domestic() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);

		List<WebElement> listElement_Search_By_options_Results = ObjectsReporsitory.Dashboard_SearchBy_All_option;
		for (WebElement webElement688 : listElement_Search_By_options_Results) {
			if (webElement688.getText().contains(ConfigFileReader.getSearch_By_Name())) {
				webElement688.click();
				System.out.println(
						"Search Workmen By : " + dataProviders.ConfigFileReader.getSearch_By_Name() + " is Selected");
				break;
			}
		}

		DataBaseConnection.GetWorkmanFathername_Domestic();

	}

	// ****************************************************************************************

	@Then("^Search Workman by Passport Number$")
	public static void Search_Workman_by_Passport_no() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		DataBaseConnection.GetWorkmanPassportnumber();

	}

	@Then("^Search Workman by Passport Number international$")
	public static void Search_Workman_by_Passport_no_international() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		DataBaseConnection.GetWorkmanPassportnumberinternational();

	}

	@Then("^Verify Workment Details fetched correctly when searching by Workmen number$")
	public static void Verify_Workment_Details_fetched_correctly_when_searching_by_Workmen_number() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.popup_validation_other();
		Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		WorkmenPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmen Details");
		System.out.println("-------------------");
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		System.out.println("-------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify Workment Details fetched correctly when searching by Workmen Aadhar$")
	public static void Verify_Workment_Details_fetched_correctly_when_searching_by_Workmen_Aadhar() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.popup_validation_other();
		Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		WorkmenPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmen Details");
		System.out.println("-------------------");
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		System.out.println("-------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^Search Workman by Aadhar$")
	public static void Search_Workman_by_Aadhar() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();
		DataBaseConnection.GetWorkmanAadhar();

	}

	@Then("^Select Workman and Navigate to personal$")
	public static void Select_Workman_and_Navigate_to_personal() throws Throwable {

		Edit_Personal_Details.Navigate_to_Workman_serarch();
		Edit_Personal_Details.Search_Workman_by_Number();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.popup_validation_other();
		Profile_Basic.Verify_User_can_be_able_to_view_Workmen_profile_Completion_Status();
		Profile_Basic.Verify_User_can_be_able_to_view_Workmen_profile_Completion_Percentage();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_basicDetails));
		ObjectsReporsitory.Induction_basicDetails.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_workmanName));
		wait.until(
				ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Personal_workmanName, "ng-reflect-model"));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_partner));
		ObjectsReporsitory.Induction_partner.click();
		wait.until(
				ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Partner_partnername, "ng-reflect-model"));

		ObjectsReporsitory.Partner_workType_Edit.click();

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

		Actions actions1 = new Actions(DriverFactory.driver);
		actions1.moveToElement(ObjectsReporsitory.Partner_next);
		actions1.perform();
		ObjectsReporsitory.Partner_next.click();

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

	}

	@Then("^Verify user can able to update workmanname$")
	public static void Verify_user_can_able_to_update_workmanname() throws Throwable {

		// Edit_Personal_Details.Select_Workman_and_Navigate_to_personal();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.clear();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName
				.sendKeys(ConfigFileReader.getWorkman_name_update() + RandomString.make(10));

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();

		DataBaseConnection.getverifyupdateworkmanname();
	}

	@Then("^Verify user can able to update workmanFatherName$")
	public static void Verify_user_can_able_to_update_workmanFatherName() throws Throwable {

		ObjectsReporsitory.Induction_personal.click();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.clear();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName
				.sendKeys(ConfigFileReader.getWorkman_Father_name_update() + RandomString.make(10));

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.PageLoader_Validation();
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();

		DataBaseConnection.getverifyupdateworkmanfathername();
	}

	@Then("^Verify user can able to update DOB$")
	public static void Verify_user_can_able_to_update_DOB() throws Throwable {

		ObjectsReporsitory.Induction_personal.click();
		test.kendo_Calender_Robot.kendo_Calender_action_DOB();
		Actions actions111 = new Actions(DriverFactory.driver);
		actions111.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
		actions111.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		ObjectsReporsitory.Induction_communication.click();
		Actions actions112 = new Actions(DriverFactory.driver);
		actions112.moveToElement(ObjectsReporsitory.skill_header);
		actions112.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Screenshot.Screenshotforscenario();
		Basic.PageLoader_Validation();
		Basic.popup_handle();
		DataBaseConnection.getverifyupdateworkmanDOB();
		System.out.println("Verify age auto calculated");
		Personal.Verify_user_age_auto_calculated();

		Actions actions113 = new Actions(DriverFactory.driver);
		actions113.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions113.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

	}

	@Then("^Verify user can able to update workman image$")
	public static void Verify_user_can_able_to_update_workman_image() throws Throwable {

		ObjectsReporsitory.Induction_personal.click();
		ObjectsReporsitory.Personal_picture.click();
		ObjectsReporsitory.Personal_takeASnapshot.click();
		ObjectsReporsitory.Personal_close.click();
		System.out.println("Workman Image Captured");

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
	}

	@Then("^Verify user can able to update Language$")
	public static void Verify_user_can_able_to_update_Language() throws Throwable {
		System.out.println("Update : Add Language");
		ObjectsReporsitory.Induction_personal.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_languagesKnown));
		Personal.Verify_user_able_to_add_Language();

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Screenshot.Screenshotforscenario();
		Basic.popup_Handle2();
		Thread.sleep(2000);
		DataBaseConnection.getverifyupdateworkmanLanguage();

	}

	@Then("^Verify user can able to update Gender$")
	public static void Verify_user_can_able_to_update_Gender() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_personal));
		ObjectsReporsitory.Induction_personal.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_personal));
		String Gender = ConfigFileReader.getGender_update();
		if (Gender.equals("Male")) {
			ObjectsReporsitory.Personal_Gender_Male.click();
		}
		if (Gender.equals("Female")) {
			ObjectsReporsitory.Personal_Gender_female.click();
		}
		if (Gender.equals("Others")) {
			ObjectsReporsitory.Personal_Gender_others.click();
		}
		System.out.println(Gender + " : Gender Selected");
		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateworkmanGender();
	}

	@Then("^Verify user can able to update Blood Group$")
	public static void Verify_user_can_able_to_update_Blood_Group() throws Throwable {

		ObjectsReporsitory.Induction_personal.click();
		ObjectsReporsitory.Personal_bloodGroup.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_bloodGroup_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getBlood_Group_update())) {
				webElement.click();
				System.out.println(
						"Blood Group Selected:" + ObjectsReporsitory.Personal_bloodGroup.getAttribute("value"));
				break;
			}
		}
		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//				Actions actions4 = new Actions(DriverFactory.driver);
//				actions4.moveToElement(ObjectsReporsitory.skill_save);
//				actions4.perform();
//				ObjectsReporsitory.skill_save.click();
//				Thread.sleep(2000);
//				Screenshot.Screenshotforscenario();
//				Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateworkmanBloodGroup();
	}

	@Then("^Verify user can able to update Marital Status$")
	public static void Verify_user_can_able_to_update_Marital_Status() throws Throwable {

		ObjectsReporsitory.Induction_personal.click();
		ObjectsReporsitory.Personal_maritalStatus.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_maritalStatus_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getMarital_status_update())) {
				webElement.click();
				System.out.println(
						"Marital Status Selected:" + ObjectsReporsitory.Personal_maritalStatus_Choosen.getText());
				break;
			}
		}
		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//				Actions actions4 = new Actions(DriverFactory.driver);
//				actions4.moveToElement(ObjectsReporsitory.skill_save);
//				actions4.perform();
//				ObjectsReporsitory.skill_save.click();
//				Thread.sleep(2000);
//				Screenshot.Screenshotforscenario();
//				Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateworkmanMaritalStatus();
	}

	@Then("^Verify user can able to update spouse Name$")
	public static void Verify_user_can_able_to_update_spouse_Name() throws Throwable {

		if (ObjectsReporsitory.Personal_maritalStatus.getText().equals("Single")) {
			System.out.println("Workman Marital status set as Single");
		} else {
			ObjectsReporsitory.Induction_personal.click();
			Actions actions128 = new Actions(DriverFactory.driver);
			actions128.moveToElement(ObjectsReporsitory.Personal_guardianSpouse);
			actions128.perform();
			ObjectsReporsitory.Personal_guardianSpouse.clear();
			ObjectsReporsitory.Personal_guardianSpouse
					.sendKeys(ConfigFileReader.getspouse_name_update() + RandomString.make(10));
			// ***************************************************************************
			Actions actions2 = new Actions(DriverFactory.driver);
			actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
			actions2.perform();
			ObjectsReporsitory.Personal_saveNext.click();

			Actions actions3 = new Actions(DriverFactory.driver);
			actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
			actions3.perform();
			ObjectsReporsitory.Communication_saveNext.click();
			Thread.sleep(2000);
			Basic.popup_Handle2();
			Thread.sleep(2000);

//			Actions actions4 = new Actions(DriverFactory.driver);
//			actions4.moveToElement(ObjectsReporsitory.skill_save);
//			actions4.perform();
//			ObjectsReporsitory.skill_save.click();
//			Thread.sleep(2000);
//			Screenshot.Screenshotforscenario();
//			Basic.popup_Handle2();
			// ***************************************************************************
			DataBaseConnection.getverifyupdateworkmanspousename();
		}
	}

	@Then("^Verify user can able to update no of Children$")
	public static void Verify_user_can_able_to_update_no_of_Children() throws Throwable {

		if (ObjectsReporsitory.Personal_maritalStatus.getText().equals("Single")) {
			System.out.println("Workman Marital status set as Single");
		} else {
			ObjectsReporsitory.Induction_personal.click();
			Actions actions129 = new Actions(DriverFactory.driver);
			actions129.moveToElement(ObjectsReporsitory.Personal_NoofChilderen);
			actions129.perform();
			ObjectsReporsitory.Personal_NoofChilderen.clear();
			ObjectsReporsitory.Personal_NoofChilderen.sendKeys(ConfigFileReader.getNo_of_childeren_update());
			// ***************************************************************************
			Actions actions2 = new Actions(DriverFactory.driver);
			actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
			actions2.perform();
			ObjectsReporsitory.Personal_saveNext.click();

			Actions actions3 = new Actions(DriverFactory.driver);
			actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
			actions3.perform();
			ObjectsReporsitory.Communication_saveNext.click();
			Thread.sleep(2000);
			Basic.popup_Handle2();
			Thread.sleep(2000);

//			Actions actions4 = new Actions(DriverFactory.driver);
//			actions4.moveToElement(ObjectsReporsitory.skill_save);
//			actions4.perform();
//			ObjectsReporsitory.skill_save.click();
//			Thread.sleep(2000);
//			Screenshot.Screenshotforscenario();
//			Basic.popup_Handle2();
			// ***************************************************************************
			DataBaseConnection.getverifyupdateworkmanNoofChilderen();
		}
	}

	@Then("^Verify user can able to update CSTI and NAPS$")
	public static void Verify_user_can_able_to_update_CSTI_and_NAPS() throws Throwable {

		String CSTI_Enable_update = ConfigFileReader.getEnable_CSTI_update();
		String NAPS_Enable_update = ConfigFileReader.getEnable_NAPS_update();

		ObjectsReporsitory.Induction_personal.click();
		Actions actions130 = new Actions(DriverFactory.driver);
		actions130.moveToElement(ObjectsReporsitory.communicationDetails_Head);
		actions130.perform();

		if (CSTI_Enable_update.equals("True") && NAPS_Enable_update.equals("True")) {

			if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")) {
				System.out.println("CSTI Enabled");
			} else {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_CSTI));
				ObjectsReporsitory.Personal_CSTI_label.click();
			}
			if (ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
				System.out.println("NAPS Enabled");

			} else {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_NAPS));
				ObjectsReporsitory.Personal_NAPS_label.click();
			}
			ObjectsReporsitory.Personal_nAPSNumber.clear();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_nAPSNumber));
			ObjectsReporsitory.Personal_nAPSNumber.sendKeys(ConfigFileReader.getNAPS_update());
		}

		else if (CSTI_Enable_update.equals("False") && NAPS_Enable_update.equals("True")) {
			if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")) {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_CSTI));
				ObjectsReporsitory.Personal_CSTI_label.click();
			} else {
				System.out.println("CSTI Disabled");
			}
			if (ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
				System.out.println("NAPS Enabled");
			} else {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_NAPS));
				ObjectsReporsitory.Personal_NAPS_label.click();
			}
			ObjectsReporsitory.Personal_nAPSNumber.clear();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_nAPSNumber));
			ObjectsReporsitory.Personal_nAPSNumber.sendKeys(ConfigFileReader.getNAPS_update());
		}

		else if (CSTI_Enable_update.equals("True") && NAPS_Enable_update.equals("False")) {
			if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")) {
				System.out.println("CSTI Enabled");
			} else {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_CSTI));
				ObjectsReporsitory.Personal_CSTI_label.click();
			}
			if (ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_NAPS));
				ObjectsReporsitory.Personal_NAPS_label.click();
				System.out.println("NAPS Disabled");
			}
			ObjectsReporsitory.Personal_cSTINumber.clear();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_cSTINumber));
			ObjectsReporsitory.Personal_cSTINumber.sendKeys(ConfigFileReader.getCSTI_update());
		}
		if (CSTI_Enable_update.equals("False") && NAPS_Enable_update.equals("False")) {
			if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")) {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_CSTI));
				ObjectsReporsitory.Personal_CSTI_label.click();
			} else {
				System.out.println("CSTI Disbaled");
			}
			if (ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_NAPS));
				ObjectsReporsitory.Personal_NAPS_label.click();
			}

			else {
				System.out.println("NAPS Disabled");
			}

			System.out.println("CSTI & NAPS are Disabled");

		}
		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//				Actions actions4 = new Actions(DriverFactory.driver);
//				actions4.moveToElement(ObjectsReporsitory.skill_save);
//				actions4.perform();
//				ObjectsReporsitory.skill_save.click();
//				Thread.sleep(2000);
//				Screenshot.Screenshotforscenario();
//				Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateCSTIOrNAPS();

	}

	@Then("^Verify user can able to update Religion$")
	public static void Verify_user_can_able_to_update_Religion() throws Throwable {

		ObjectsReporsitory.Induction_personal.click();
		Actions actions129 = new Actions(DriverFactory.driver);
		actions129.moveToElement(ObjectsReporsitory.Personal_religion);
		actions129.perform();

		ObjectsReporsitory.Personal_religion.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_religion_DR;

		System.out.println("Updating Religion Status");
		Random rand78522a = new Random();
		int religion = rand78522a.nextInt(ObjectsReporsitory.Personal_religion_DR.size());
		Selected_religionStatus = ObjectsReporsitory.Personal_religion_DR.get(religion).getText();

		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(Selected_religionStatus)) {
				webElement.click();
				Thread.sleep(3000);
				System.out.println("Workmen's Religion is " + ObjectsReporsitory.Personal_religion.getText());
				break;
			}
		}

		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************

	}

	@Then("^Verify user can able to update Nearest police Station$")
	public static void Verify_user_can_able_to_update_Nearest_police_Station() throws Throwable {

		ObjectsReporsitory.Personal_nearestPoliceStation.click();
		ObjectsReporsitory.Personal_nearestPoliceStation.clear();
		ObjectsReporsitory.Personal_nearestPoliceStation.click();
		ObjectsReporsitory.Personal_nearestPoliceStation
				.sendKeys(ConfigFileReader.getnearestpolicestation() + RandomString.make(10));
		System.out
				.println("Update Nearest police Station " + ObjectsReporsitory.Personal_nearestPoliceStation.getText());

		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************

	}

	@Then("^Verify user can able to update Nationality$")
	public static void Verify_user_can_able_to_update_Nationality() throws Throwable {

		ObjectsReporsitory.Personal_nationality.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_nationality_DR;

		System.out.println("Updating Nationality Status");
		Random rand785223a = new Random();
		int nationality = rand785223a.nextInt(ObjectsReporsitory.Personal_nationality_DR.size());
		Selected_nationalityStatus = ObjectsReporsitory.Personal_nationality_DR.get(nationality).getText();

		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(Selected_nationalityStatus)) {
				webElement.click();
				Thread.sleep(3000);
				System.out
						.println("UpdatWorkmen's Nationality is " + ObjectsReporsitory.Personal_nationality.getText());
				break;
			}
		}

		// ***************************************************************************
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************

	}

	public static void CheckDLR_Domestic() throws Throwable {
		// DLR

		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText().substring(0, 8);
		System.out.println("Current Job : " + Current_job);

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

			ObjectsReporsitory.DLR_job.click();
			ObjectsReporsitory.DLR_job.clear();
			ObjectsReporsitory.DLR_job.click();
			ObjectsReporsitory.DLR_job.sendKeys(Current_job);
			Thread.sleep(5000);
			List<WebElement> DropdownResult = ObjectsReporsitory.DLR_job_All_Elements;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(Current_job)) {
					webElement.click();
					System.out.println("Selected Job :" + Current_job);
					break;
				} else {

					System.out.println("Error : job Not Found");
				}
			}

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
			System.out.println("DLR Record For Selected Domestic Job Already Present");
			System.out.println("============================================");
		}
	}

	public static void CheckDLR_International() throws Throwable {
		// DLR

		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText().substring(0, 8);
		System.out.println("Current Job : " + Current_job);

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

			ObjectsReporsitory.DLR_job.click();
			ObjectsReporsitory.DLR_job.clear();
			ObjectsReporsitory.DLR_job.click();
			ObjectsReporsitory.DLR_job.sendKeys(Current_job);
			Thread.sleep(5000);
			List<WebElement> DropdownResult = ObjectsReporsitory.DLR_job_All_Elements;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(Current_job)) {
					webElement.click();
					System.out.println("Selected Job :" + Current_job);
					break;
				} else {

					System.out.println("Error : job Not Found");
				}
			}

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
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_International));
			ObjectsReporsitory.WorkmenSearch_International.click();

		} else {
			System.out.println("DLR Record For Selected International Job Already Present");
			System.out.println("============================================");
		}
	}

}
