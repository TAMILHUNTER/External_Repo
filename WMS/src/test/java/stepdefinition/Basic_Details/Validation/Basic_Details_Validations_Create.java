package stepdefinition.Basic_Details.Validation;

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
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Create.Communication;
import stepdefinition.Basic_Details.Create.Partner;
import stepdefinition.Basic_Details.Create.Personal;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;

public class Basic_Details_Validations_Create {

	public static int Search_Aadhaar_Number;
	public static int popup_validation;
	public static String Popup_Message;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Basic_Details_Validations_Create() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify user can able to Validate Partner field$")
	public static void Verify_user_can_able_to_Validate_Partner_field() throws Throwable {

		// Partner
		Partner.Verify_user_can_able_to_select_the_Worktype();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.partnerbar));
		ObjectsReporsitory.partnerbar.click();
		Actions actions2323 = new Actions(DriverFactory.driver);
		actions2323.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actions2323.perform();
		ObjectsReporsitory.Partner_next.click();
		Basic.PageLoader_Validation();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Worktype field$")
	public static void Verify_user_can_able_to_Validate_Worktype_field() throws Throwable {

		// Partner
		Partner.Verify_user_can_able_to_select_the_Existing_Partner_by_ID();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.partnerbar));
		ObjectsReporsitory.partnerbar.click();
		Actions actions2323 = new Actions(DriverFactory.driver);
		actions2323.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actions2323.perform();
		ObjectsReporsitory.Partner_next.click();
		Basic.PageLoader_Validation();
		System.out.println("Partner details are Saved");

		Actions actionsasd = new Actions(DriverFactory.driver);
		actionsasd.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionsasd.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_next));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Partner_next);
		// ObjectsReporsitory.Partner_next.click();
		Actions actionsasdqw = new Actions(DriverFactory.driver);
		actionsasdqw.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsasdqw.perform();
		System.out.println("Navigated to Basicdetails - Personal");

		// Personal
		Personal.Verify_user_can_able_to_enter_name_and_fathername();
		Personal.Verify_user_can_able_to_select_DOB();
		Personal.Verify_user_age_auto_calculated();
		Personal.Verify_user_able_to_capture_image();
		Personal.Verify_user_able_to_add_Language();
		Personal.verify_user_can_able_to_select_gender();
		Personal.Verify_user_can_able_to_select_blood_group();
		Personal.verify_user_can_able_to_select_marital_status();
		Personal.verify_user_can_able_to_enter_spouse_name();
		Personal.verify_user_can_able_to_provide_CSTI_and_NAPS();
		Personal.verify_user_can_able_to_enter_religion();
		Personal.verify_user_can_able_to_enter_Nearest_police_station();
		Personal.verify_user_can_able_to_select_Nationality();
		Personal.verify_user_can_able_to_save_Personal_details();

		// Communication
		Communication.Verify_user_can_able_to_enter_mobile_number();
		Communication.Verify_user_can_able_to_Select_Country();
		// Communication.Verify_user_can_able_to_enter_pincode();
		Communication.Verify_address_autofetched_based_on_pincode_entered();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege();
		Communication.Verify_user_can_able_to_enter_Temporary_address();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_Name_and_number();
		Communication.Verify_user_can_able_to_select_relationship_with_employee();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_address_pincode();
		Communication.Verify_address_autofetched_based_on_pincode_entered_for_Emergency_Contact();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege_for_Emergency_Contact();
		// Communication.Verify_user_can_able_to_save_communication_details();
		Actions actionassdwq = new Actions(DriverFactory.driver);
		actionassdwq.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionassdwq.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Duplicate Workmen$")
	public static void Verify_user_can_able_to_Validate_Duplicate_Workmen() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobj.perform();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.clear();
		ObjectsReporsitory.Personal_workmanName.click();
		DataBaseConnection.GetWorkmanName_Verification();

		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.clear();
		ObjectsReporsitory.Personal_fatherName.click();
		DataBaseConnection.GetWorkmanFatherName_Verification();

		test.kendo_Calender_Robot.kendo_Calender_action_DOB();
		System.out.println("Workman DOB Entered : " + ObjectsReporsitory.Personal_DOB.getAttribute("value"));

		Personal.Verify_user_able_to_capture_image();
		Personal.Verify_user_able_to_add_Language();
		Personal.verify_user_can_able_to_select_gender();
		Personal.Verify_user_can_able_to_select_blood_group();
		Personal.verify_user_can_able_to_select_marital_status();
		Personal.verify_user_can_able_to_enter_spouse_name();
		Personal.verify_user_can_able_to_provide_CSTI_and_NAPS();
		Personal.verify_user_can_able_to_enter_religion();
		Personal.verify_user_can_able_to_select_Nationality();
		Personal.verify_user_can_able_to_enter_Nearest_police_station();
		Personal.verify_user_can_able_to_save_Personal_details();

		Communication.Verify_user_can_able_to_enter_mobile_number();
		Communication.Verify_user_can_able_to_Select_Country();
		// Communication.Verify_user_can_able_to_enter_pincode();
		Communication.Verify_address_autofetched_based_on_pincode_entered();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege();
		Communication.Verify_user_can_able_to_enter_Temporary_address();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_Name_and_number();
		Communication.Verify_user_can_able_to_select_relationship_with_employee();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_address_pincode();
		Communication.Verify_address_autofetched_based_on_pincode_entered_for_Emergency_Contact();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege_for_Emergency_Contact();

		// Communication.Verify_user_can_able_to_save_communication_details();
		Actions actionassdwq = new Actions(DriverFactory.driver);
		actionassdwq.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionassdwq.perform();
		ObjectsReporsitory.Communication_saveNext.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Nationality$")
	public static void Verify_user_can_able_to_Validate_Nationality() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_nationality);
		actionobj.perform();
		ObjectsReporsitory.Personal_nationality.click();
		ObjectsReporsitory.Personal_nationality.clear();

		Actions actionassd = new Actions(DriverFactory.driver);
		actionassd.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionassd.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate workmenname$")
	public static void Verify_user_can_able_to_Validate_workmenname() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_nationality);
		actionobj.perform();
		ObjectsReporsitory.Personal_nationality.click();
		ObjectsReporsitory.Personal_nationality.clear();

		Personal.verify_user_can_able_to_select_Nationality();

		Actions actionobjasd = new Actions(DriverFactory.driver);
		actionobjasd.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobjasd.perform();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.clear();

		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.clear();

		Actions actionassd = new Actions(DriverFactory.driver);
		actionassd.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionassd.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate fathername$")
	public static void Verify_user_can_able_to_Validate_fathername() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobj.perform();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.clear();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.sendKeys(ConfigFileReader.getWorkman_name() + RandomString.make(10));

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate DOB$")
	public static void Verify_user_can_able_to_Validate_DOB() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_fatherName);
		actionobj.perform();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.clear();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName
				.sendKeys(ConfigFileReader.getWorkman_Father_name() + RandomString.make(10));

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_maritalStatus);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate DOB field with date value less then statutory norms$")
	public static void Verify_user_can_able_to_Validate_DOB_field_with_date_value_less_then_statutory_norms()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_maritalStatus);
		actionobj.perform();
		test.kendo_Calender_Robot.kendo_Calender_action_DOB_Today();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate DOB field with date value more then statutory norms$")
	public static void Verify_user_can_able_to_Validate_DOB_field_with_date_value_more_then_statutory_norms()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_maritalStatus);
		actionobj.perform();
		test.kendo_Calender_Robot.kendo_Calender_action_DOB_more_then_Statudary_norms();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen gender$")
	public static void Verify_user_can_able_to_Validate_Workmen_gender() throws Throwable {
		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_maritalStatus);
		actionobj.perform();
		Personal.Verify_user_can_able_to_select_DOB();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

		Personal.Verify_user_can_able_to_select_DOB();

		Actions actionsave123 = new Actions(DriverFactory.driver);
		actionsave123.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave123.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen marital status$")
	public static void Verify_user_can_able_to_Validate_Workmen_marital_status() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_maritalStatus);
		actionobj.perform();
		Personal.verify_user_can_able_to_select_gender();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen blood group$")
	public static void Verify_user_can_able_to_Validate_Workmen_blood_group() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_maritalStatus);
		actionobj.perform();
		Personal.verify_user_can_able_to_select_marital_status();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen image$")
	public static void Verify_user_can_able_to_Validate_Workmen_image() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_bloodGroup);
		actionobj.perform();
		Personal.Verify_user_can_able_to_select_blood_group();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen spouse name$")
	public static void Verify_user_can_able_to_Validate_Workmen_spouse_name() throws Throwable {

		if (ConfigFileReader.getMarital_status().contains("Married")) {
			Actions actionobj = new Actions(DriverFactory.driver);
			actionobj.moveToElement(ObjectsReporsitory.Personal_picture);
			actionobj.perform();
			Personal.Verify_user_able_to_capture_image();

			Actions actionsave = new Actions(DriverFactory.driver);
			actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
			actionsave.perform();
			ObjectsReporsitory.Personal_saveNext.click();
			Verification_Popup.Validation_popup_handle();
		} else if (ConfigFileReader.getMarital_status().contains("Married")) {

			System.out.println("Marital Status Set As 'Single' ");
			System.out.println("--------------------------------------------------------");

		}
	}

	@Then("^Verify user can able to Validate Workmen Language$")
	public static void Verify_user_can_able_to_Validate_Workmen_Language() throws Throwable {

		if (ConfigFileReader.getMarital_status().contains("Married")) {

			Actions actionobj = new Actions(DriverFactory.driver);
			actionobj.moveToElement(ObjectsReporsitory.Personal_guardianSpouse);
			actionobj.perform();
			Personal.verify_user_can_able_to_enter_spouse_name();

			Actions actionsave = new Actions(DriverFactory.driver);
			actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
			actionsave.perform();
			ObjectsReporsitory.Personal_saveNext.click();
			Verification_Popup.Validation_popup_handle();

		} else if (ConfigFileReader.getMarital_status().contains("Single")) {

			System.out.println("Marital Status Set As 'Single' ");
			System.out.println("--------------------------------------------------------");

			Actions actionobj = new Actions(DriverFactory.driver);
			actionobj.moveToElement(ObjectsReporsitory.Personal_picture);
			actionobj.perform();
			Personal.Verify_user_able_to_capture_image();

			Actions actionsave = new Actions(DriverFactory.driver);
			actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
			actionsave.perform();
			ObjectsReporsitory.Personal_saveNext.click();
			Verification_Popup.Validation_popup_handle();

		}
	}

	@Then("^Verify user can able to Validate Workmen CSTI if enabled$")
	public static void Verify_user_can_able_to_Validate_Workmen_CSTI_if_enabled() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_languagesKnown);
		actionobj.perform();

		// **************************************************************************************************************************
		Actions actionobjqeqw = new Actions(DriverFactory.driver);
		actionobjqeqw.moveToElement(ObjectsReporsitory.Personal_languagesKnown);
		actionobjqeqw.perform();
		ObjectsReporsitory.Personal_languagesKnown.click();
		// Adding Language 1:

		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Personal_Language_addLanguage);
		// ObjectsReporsitory.Personal_Language_addLanguage.click();
		ObjectsReporsitory.Personal_Language_addLanguage_dr.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_Language_Languageselect_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getLanguage1())) {
				webElement.click();
				System.out.println("Language Selected:" + ConfigFileReader.getLanguage1());
				break;
			}
		}
		if (ConfigFileReader.getL1Read().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Read));
			ObjectsReporsitory.Personal_Language_Read.click();
		} else if (ConfigFileReader.getL1Read().equals("True")) {
			System.out.println("Language Read Unchecked");
		}
		if (ConfigFileReader.getL1Write().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Write));
			ObjectsReporsitory.Personal_Language_Write.click();
		} else if (ConfigFileReader.getL1Write().equals("True")) {
			System.out.println("Language Write Unchecked");
		}
		if (ConfigFileReader.getL1speak().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Speak));
			ObjectsReporsitory.Personal_Language_Speak.click();
		} else if (ConfigFileReader.getL1speak().equals("True")) {
			System.out.println("Language Speak Unchecked");
		}
		ObjectsReporsitory.Personal_Language_Save.click();
		System.out.println("Language " + ConfigFileReader.getLanguage1() + " added successfully");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_closewindow));
		ObjectsReporsitory.Personal_Language_closewindow.click();
		Thread.sleep(3000);

		// **************************************************************************************************************************

		Actions actionobjqeqwrweqr = new Actions(DriverFactory.driver);
		actionobjqeqwrweqr.moveToElement(ObjectsReporsitory.Personal_CSTI);
		actionobjqeqwrweqr.perform();

		ObjectsReporsitory.Personal_CSTI.click();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen NAPS if enabled$")
	public static void Verify_user_can_able_to_Validate_Workmen_NAPS_if_enabled() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_guardianSpouse);
		actionobj.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Personal_CSTI.click();
		Thread.sleep(2000);
		ObjectsReporsitory.Personal_NAPS.click();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actionsave.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen mobile number$")
	public static void Verify_user_can_able_to_Validate_Workmen_mobile_number() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_relationshipWithEmployee);
		actionobj.perform();

		ObjectsReporsitory.Communication_EC_relationshipWithEmployee.click();

		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_relationshipWithEmployee_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getEmergency_Contact_Relation())) {
				webElement.click();
				System.out.println("Emergency contact relation with employee: "
						+ ConfigFileReader.getEmergency_Contact_Relation());
				break;
			}
		}

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Permanent address pincode$")
	public static void Verify_user_can_able_to_Validate_Workmen_Permanent_address_pincode() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Address);
		actionobj.perform();
		ObjectsReporsitory.Communication_Address.click();
		ObjectsReporsitory.Communication_Address.clear();
		ObjectsReporsitory.Communication_Address.click();
		ObjectsReporsitory.Communication_Address.sendKeys(ConfigFileReader.getPermanent_Address());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Permanent address$")
	public static void Verify_user_can_able_to_Validate_Workmen_Permanent_address() throws Throwable {

		Actions actionobjas = new Actions(DriverFactory.driver);
		actionobjas.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionobjas.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Permanent address village$")
	public static void Verify_user_can_able_to_Validate_Workmen_Permanent_address_village() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.clear();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.sendKeys(ConfigFileReader.getPermanent_Address_pincode());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Temporary address$")
	public static void Verify_user_can_able_to_Validate_Workmen_Temporary_address() throws Throwable {
		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_villageTown);
		actionobj.perform();
		ObjectsReporsitory.Communication_villageTown.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains(ConfigFileReader.getPermanent_Address_Village())) {
				webElement.click();
				System.out.println("Permanent Address Village:" + ConfigFileReader.getPermanent_Address_Village());
				break;
			}
		}

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Temporary address pincode$")
	public static void Verify_user_can_able_to_Validate_Workmen_Temporary_address_pincode() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Temp_address);
		actionobj.perform();
		ObjectsReporsitory.Communication_Temp_address.click();
		ObjectsReporsitory.Communication_Temp_address.clear();
		ObjectsReporsitory.Communication_Temp_address.click();
		ObjectsReporsitory.Communication_Temp_address.sendKeys(ConfigFileReader.getTemporary_Address());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Temporary address village$")
	public static void Verify_user_can_able_to_Validate_Workmen_Temporary_address_village() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Temp_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.clear();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.sendKeys(ConfigFileReader.getTemporary_Address_Pincode());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Emergency Contact Name$")
	public static void Verify_user_can_able_to_Validate_Workmen_Emergency_Contact_Name() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_MobileNumber);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.clear();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.sendKeys(ConfigFileReader.getEmergency_Contact_Mobile());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Emergency Contact number$")
	public static void Verify_user_can_able_to_Validate_Workmen_Emergency_Contact_number() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_address);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_address.click();
		ObjectsReporsitory.Communication_EC_address.clear();
		ObjectsReporsitory.Communication_EC_address.click();
		ObjectsReporsitory.Communication_EC_address.sendKeys(ConfigFileReader.getEmergency_Contact_Address());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Emergency Contact Relationship with employee$")
	public static void Verify_user_can_able_to_Validate_Workmen_Emergency_Contact_Relationship_with_employee()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_villageTown);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_villageTown.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getEmergency_Contact_Village())) {
				webElement.click();
				System.out.println("Emergency Contact Village:" + ConfigFileReader.getEmergency_Contact_Village());
				break;
			}
		}

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Emergency Contact address pincode$")
	public static void Verify_user_can_able_to_Validate_Workmen_Emergency_Contact_address_pincode() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_name);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.clear();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.sendKeys(ConfigFileReader.getEmergency_Contact_Name());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Emergency address$")
	public static void Verify_user_can_able_to_Validate_Workmen_Emergency_address() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Temp_villageTown);
		actionobj.perform();
		ObjectsReporsitory.Communication_Temp_villageTown.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_temp_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getTemporary_Address_Village())) {
				webElement.click();
				System.out.println("Temporary Address Village:" + ConfigFileReader.getTemporary_Address_Village());
				break;
			}
		}

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Emergency address village$")
	public static void Verify_user_can_able_to_Validate_Workmen_Emergency_address_village() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.clear();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.sendKeys(ConfigFileReader.getEmergency_Contact_Pincode());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actionsave.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_saveNext.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen skill category$")
	public static void Verify_user_can_able_to_Validate_Workmen_skill_category() throws Throwable {
		Actions actionobjas = new Actions(DriverFactory.driver);
		actionobjas.moveToElement(ObjectsReporsitory.skill_save);
		actionobjas.perform();
		Thread.sleep(2000);
		ObjectsReporsitory.skill_save.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen skill group$")
	public static void Verify_user_can_able_to_Validate_Workmen_skill_group() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.skillCategory);
		actionsobj.perform();
		ObjectsReporsitory.skillCategory.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillCategory_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkill_Category())) {
				webElement.click();
				System.out.println("Skill Category:" + ConfigFileReader.getSkill_Category());
				break;
			}
		}
		Thread.sleep(2000);
		ObjectsReporsitory.skill_save.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen skill description$")
	public static void Verify_user_can_able_to_Validate_Workmen_skill_description() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.skillGroup);
		actionsobj.perform();
		ObjectsReporsitory.skillGroup.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillGroup_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkill_Group())) {
				webElement.click();
				System.out.println("Skill Group:" + ConfigFileReader.getSkill_Group());
				break;
			}
		}
		Thread.sleep(2000);
		ObjectsReporsitory.skill_save.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen skill Type$")
	public static void Verify_user_can_able_to_Validate_Workmen_skill_Type() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.skillDescription);
		actionsobj.perform();
		ObjectsReporsitory.skillDescription.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillDescription_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkill_Description())) {
				webElement.click();
				System.out.println("Skill Description:" + ConfigFileReader.getSkill_Description());
				break;
			}
		}
		Thread.sleep(2000);
		ObjectsReporsitory.skill_save.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen deployemnt$")
	public static void Verify_user_can_able_to_Validate_Workmen_deployemnt() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.deployment_Picker));
		ObjectsReporsitory.deployment_Picker.click();
		try {
			if (ObjectsReporsitory.deployment_Tree_Checked_First.isSelected()) {

				System.out.println("Deployement Tree already Selected");
				System.out.println("Unselecting Selected Deployment Site");
				ObjectsReporsitory.deployment_Tree_Checked_First.click();
			} else {
				System.out.println("No Deployement Tree Selected");
			}
		} catch (Exception e) {
			System.out.println("No Deployement Tree Found for the User Job");
		}

		Actions actions50 = new Actions(DriverFactory.driver);
		actions50.moveToElement(ObjectsReporsitory.deployment_save);
		actions50.perform();
		ObjectsReporsitory.deployment_save.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Education Applicable$")
	public static void Verify_user_can_able_to_Validate_Workmen_Education_Applicable() throws Throwable {

		System.out.println("Education Details - Not Applicable Checkbox is Checked : "
				+ ObjectsReporsitory.Education_Applicable_Checkbox.isSelected());

		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {
			System.out.println("Experience Not Applicable Checkbox is Checked : unselecting Checkbox ");
			ObjectsReporsitory.Education_Applicable_Checkbox.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Education_addEducation_btn));
		} else {
			System.out.println("Education Not Applicable Checkbox is Not Checked");
		}

		ObjectsReporsitory.Education_Side_educationExperience.click();

		Actions actionsaddedu = new Actions(DriverFactory.driver);
		actionsaddedu.moveToElement(ObjectsReporsitory.Education_addEducation_btn);
		actionsaddedu.perform();
		ObjectsReporsitory.Education_addEducation_btn.click();
	}

	@Then("^Verify user can able to Validate Workmen Qualification$")
	public static void Verify_user_can_able_to_Validate_Workmen_Qualification() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Education_save));

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Education_save);
		actionsedusave.perform();
		ObjectsReporsitory.Education_save.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Branch based on Qualification$")
	public static void Verify_user_can_able_to_Validate_Workmen_Branch_based_on_Qualification() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_qualification);
		actionsobj.perform();

		ObjectsReporsitory.Education_qualification.click();
		ObjectsReporsitory.Education_qualification.sendKeys(ConfigFileReader.getEducation_Quallification());
		List<WebElement> DropdownResult = ObjectsReporsitory.Education_qualification_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains(ConfigFileReader.getEducation_Quallification())) {
				webElement.click();
				System.out.println("Qualification:" + ConfigFileReader.getEducation_Quallification());
				break;
			}
		}

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Education_save);
		actionsedusave.perform();
		ObjectsReporsitory.Education_save.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen schoolORCollege$")
	public static void Verify_user_can_able_to_Validate_Workmen_schoolORCollege() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_Branch);
		actionsobj.perform();

		ObjectsReporsitory.Education_Branch.click();
		ObjectsReporsitory.Education_Branch.sendKeys(ConfigFileReader.getEducation_Branch());
		// Defect Raised
		Thread.sleep(2000);

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Education_save);
		actionsedusave.perform();
		ObjectsReporsitory.Education_save.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen BoardORUniversity$")
	public static void Verify_user_can_able_to_Validate_Workmen_BoardORUniversity() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_Branch);
		actionsobj.perform();

		ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_SchoolORCollege());
		System.out.println("School / College :" + ConfigFileReader.getEducation_SchoolORCollege());
		Thread.sleep(2000);

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Education_save);
		actionsedusave.perform();
		ObjectsReporsitory.Education_save.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Year of Passing$")
	public static void Verify_user_can_able_to_Validate_Workmen_Year_of_Passing() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_Branch);
		actionsobj.perform();

		ObjectsReporsitory.Education_BoardORUniversity.sendKeys(ConfigFileReader.getEducation_BoardORUniversity());
		System.out.println("Board/University :" + ConfigFileReader.getEducation_BoardORUniversity());
		Thread.sleep(2000);

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Education_save);
		actionsedusave.perform();
		ObjectsReporsitory.Education_save.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Discipline with numberic input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Discipline_with_numberic_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_Discipiline);
		actionsobj.perform();

		ObjectsReporsitory.Education_Discipiline.click();
		ObjectsReporsitory.Education_Discipiline.clear();
		ObjectsReporsitory.Education_Discipiline.click();
		ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Discipiline Field Value : "
				+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length());
		if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in Discipiline Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length()
					+ " Length Numeric Value in Discipiline Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Discipline with max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Discipline_with_max_alphabets_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_Discipiline);
		actionsobj.perform();

		ObjectsReporsitory.Education_Discipiline.click();
		ObjectsReporsitory.Education_Discipiline.clear();
		ObjectsReporsitory.Education_Discipiline.click();
		ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Discipiline Field Value : "
				+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length());
		if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Discipiline Field");
		} else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length()
					+ " Length alphabets Value in Discipiline Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length()
					+ " Length alphabets Value in Discipiline Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Discipline with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Discipline_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_Discipiline);
		actionsobj.perform();

		ObjectsReporsitory.Education_Discipiline.click();
		ObjectsReporsitory.Education_Discipiline.clear();
		ObjectsReporsitory.Education_Discipiline.click();
		ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Discipiline Field Value : "
				+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length());
		if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special characters Value in Discipiline Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_Discipiline.getAttribute("value").length()
					+ " Length Special characters Value in Discipiline Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen schoolORCollege with numberic input$")
	public static void Verify_user_can_able_to_Validate_Workmen_schoolORCollege_with_numberic_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_SchoolORCollege);
		actionsobj.perform();

		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege.clear();
		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the SchoolORCollege Field Value : "
				+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length());
		if (ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in SchoolORCollege Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length()
					+ " Length Numeric Value in SchoolORCollege Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen schoolORCollege with max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_schoolORCollege_with_max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_SchoolORCollege);
		actionsobj.perform();

		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege.clear();
		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege
				.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the SchoolORCollege Field Value : "
				+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length());
		if (ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in SchoolORCollege Field");
		} else if (ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length()
					+ " Length alphabets Value in SchoolORCollege Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length()
					+ " Length alphabets Value in SchoolORCollege Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen schoolORCollege with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_schoolORCollege_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_SchoolORCollege);
		actionsobj.perform();

		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege.clear();
		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege
				.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the SchoolORCollege Field Value : "
				+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length());
		if (ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length() == 0) {
			System.out
					.println("Application Not allowing to Enter Any Special characters Value in SchoolORCollege Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length()
					+ " Length Special characters Value in SchoolORCollege Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen BoardORUniversity with numberic input$")
	public static void Verify_user_can_able_to_Validate_Workmen_BoardORUniversity_with_numberic_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_SchoolORCollege);
		actionsobj.perform();

		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege.clear();
		ObjectsReporsitory.Education_SchoolORCollege.click();
		ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the SchoolORCollege Field Value : "
				+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length());
		if (ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any numberic Value in SchoolORCollege Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_SchoolORCollege.getAttribute("value").length()
					+ " Length numberic Value in SchoolORCollege Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen BoardORUniversity with max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_BoardORUniversity_with_max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_BoardORUniversity);
		actionsobj.perform();

		ObjectsReporsitory.Education_BoardORUniversity.click();
		ObjectsReporsitory.Education_BoardORUniversity.clear();
		ObjectsReporsitory.Education_BoardORUniversity.click();
		ObjectsReporsitory.Education_BoardORUniversity.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the BoardORUniversity Field Value : "
				+ ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length());
		if (ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in BoardORUniversity Field");
		} else if (ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length()
					+ " Length alphabets Value in BoardORUniversity Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length()
					+ " Length alphabets Value in BoardORUniversity Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen BoardORUniversity with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_BoardORUniversity_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_BoardORUniversity);
		actionsobj.perform();

		ObjectsReporsitory.Education_BoardORUniversity.click();
		ObjectsReporsitory.Education_BoardORUniversity.clear();
		ObjectsReporsitory.Education_BoardORUniversity.click();
		ObjectsReporsitory.Education_BoardORUniversity
				.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the BoardORUniversity Field Value : "
				+ ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length());
		if (ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special characters Value in BoardORUniversity Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_BoardORUniversity.getAttribute("value").length()
					+ " Length Special characters Value in BoardORUniversity Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen YearofPassing with max numberic input$")
	public static void Verify_user_can_able_to_Validate_Workmen_BoardORUniversity_with_max_numberic_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_yearofPassing);
		actionsobj.perform();

		ObjectsReporsitory.Education_yearofPassing.click();
		ObjectsReporsitory.Education_yearofPassing.clear();
		ObjectsReporsitory.Education_yearofPassing.click();
		ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the YearofPassing Field Value : "
				+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length());
		if (ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any numberic Value in YearofPassing Field");
		} else if (ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length() > 4) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length()
					+ " Length numberic Value in YearofPassing Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length()
					+ " Length numberic Value in YearofPassing Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen YearofPassing with alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_BoardORUniversity_with_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_yearofPassing);
		actionsobj.perform();

		ObjectsReporsitory.Education_yearofPassing.click();
		ObjectsReporsitory.Education_yearofPassing.clear();
		ObjectsReporsitory.Education_yearofPassing.click();
		ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the YearofPassing Field Value : "
				+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length());
		if (ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in YearofPassing Field");
		} else if (ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length()
					+ " Length alphabets Value in YearofPassing Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length()
					+ " Length alphabets Value in YearofPassing Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen YearofPassing with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_YearofPassing_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Education_yearofPassing);
		actionsobj.perform();

		ObjectsReporsitory.Education_yearofPassing.click();
		ObjectsReporsitory.Education_yearofPassing.clear();
		ObjectsReporsitory.Education_yearofPassing.click();
		ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the YearofPassing Field Value : "
				+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length());
		if (ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special characters Value in YearofPassing Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Education_yearofPassing.getAttribute("value").length()
					+ " Length Special characters Value in YearofPassing Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Experience Applicable$")
	public static void Verify_user_can_able_to_Validate_Workmen_Experience_Applicable() throws Throwable {

		System.out.println("Experience Details - Not Applicable Checkbox is Checked : "
				+ ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected());

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {
			System.out.println("Experience Not Applicable Checkbox is Checked : unselecting Checkbox ");
			ObjectsReporsitory.Experience_Applicable_Checkbox.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_addExperience_btn));
		} else {
			System.out.println("Experience Not Applicable Checkbox is Not Checked");
		}

		ObjectsReporsitory.Education_Side_educationExperience.click();

		Actions actionsaddedu = new Actions(DriverFactory.driver);
		actionsaddedu.moveToElement(ObjectsReporsitory.Experience_addExperience_btn);
		actionsaddedu.perform();
		ObjectsReporsitory.Experience_addExperience_btn.click();

	}

	@Then("^Verify user can able to Validate Workmen Project Skill Category$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Skill_category() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_addExperience_savebtn));

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Project Skill Group$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Skill_Group() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_Skillcatogory);
		actionobj.perform();

		ObjectsReporsitory.Experience_Skillcatogory.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains(ConfigFileReader.getExperience_Skill_Category())) {
				webElement.click();
				System.out.println("Skillcatogory:" + ConfigFileReader.getExperience_Skill_Category());
				break;
			}
		}

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().equals("Please Select Skill Group")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}

	}

	@Then("^Verify user can able to Validate Workmen Project Skill Description$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Skill_Description() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_SkillGroup);
		actionobj.perform();

		ObjectsReporsitory.Experience_SkillGroup.click();
		List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
		for (WebElement webElement : DropdownResult2) {
			if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Group())) {
				webElement.click();
				System.out.println("Skill_Group:" + ConfigFileReader.getExperience_Skill_Group());
				break;
			}
		}

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().equals("Please Select Skill Description")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}

	}

	@Then("^Verify user can able to Validate Workmen Duration From$")
	public static void Verify_user_can_able_to_Validate_Workmen_Duration_From() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_Skilldesc);
		actionobj.perform();

		ObjectsReporsitory.Experience_Skilldesc.click();
		List<WebElement> DropdownResult3 = ObjectsReporsitory.Experience_SkillDesc_DR;
		for (WebElement webElement : DropdownResult3) {
			if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Description())) {
				webElement.click();
				System.out.println("Skill_Description:" + ConfigFileReader.getExperience_Skill_Description());
				break;
			}
		}

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Duration From with future date$")
	public static void Verify_user_can_able_to_Validate_Workmen_Duration_From_with_future_date() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_Skilldesc);
		actionobj.perform();

		ObjectsReporsitory.Experience_durationFrom.click();
		ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience1_From_month() + Keys.TAB);
		ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience1_From_Future_Year());
		System.out.println(
				"Experience 1- Worked From :" + ObjectsReporsitory.Experience_durationFrom.getAttribute("value"));

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Duration To$")
	public static void Verify_user_can_able_to_Validate_Workmen_Duration_To() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_durationFrom);
		actionobj.perform();

		ObjectsReporsitory.Experience_durationFrom.click();
		ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience1_From_month() + Keys.TAB);
		ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience1_From_Year());
		System.out.println(
				"Experience 1- Worked From :" + ObjectsReporsitory.Experience_durationFrom.getAttribute("value"));

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().equals("Invalid End Date")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}

	}

	@Then("^Verify user can able to Validate Workmen Duration To with future date$")
	public static void Verify_user_can_able_to_Validate_Workmen_Duration_To_with_future_date() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_durationTo);
		actionobj.perform();

		ObjectsReporsitory.Experience_durationTo.click();
		ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience1_To_month() + Keys.TAB);
		ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience1_To_Year_Future_Year());
		System.out
				.println("Experience 1- Worked To :" + ObjectsReporsitory.Experience_durationTo.getAttribute("value"));

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Project Organization Name$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Organization_Name() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_durationTo);
		actionobj.perform();

		ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience1_To_month() + Keys.TAB);
		ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience1_To_Year());
		System.out
				.println("Experience 1- Worked To :" + ObjectsReporsitory.Experience_durationTo.getAttribute("value"));

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Project Location$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Location() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_organisation_Location);
		actionobj.perform();

		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location.clear();
		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location.sendKeys(ConfigFileReader.getExperience_OrgLocation());
		System.out.println("Orgnaizqation Name:" + ConfigFileReader.getExperience_OrgLocation());

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().equals("Enter Project Location")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}
	}

	@Then("^Verify user can able to Validate Workmen Project CodeOrName$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_CodeOrName() throws Throwable {
		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Experience_projectLocation);
		actionobj.perform();

		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation.clear();
		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation.sendKeys(ConfigFileReader.getExperience_ProjectLocation());
		System.out.println("project Location:" + ConfigFileReader.getExperience_ProjectLocation());

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.Experience_addExperience_savebtn);
		actionsedusave.perform();
		ObjectsReporsitory.Experience_addExperience_savebtn.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Project Organization Name With Max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Organization_Name_With_Max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_organisation_Location);
		actionsobj.perform();

		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location.clear();
		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location
				.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Organization Name Field Value : "
				+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Organization Name Field");
		}

		else if (ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length()
					+ " Length alphabets Value in Organization Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length()
					+ " Length alphabets Value in Organization Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Project Organization Name With Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Organization_Name_With_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_organisation_Location);
		actionsobj.perform();

		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location.clear();
		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location
				.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Organization Name Field Value : "
				+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special Char Value in Organization Name Field");
		}

		else if (ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length()
					+ " Length Special Char Value in Organization Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length()
					+ " Length Special Char Value in Organization Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Project Organization Name With Numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Organization_Name_With_Numeric_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_organisation_Location);
		actionsobj.perform();

		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location.clear();
		ObjectsReporsitory.Experience_organisation_Location.click();
		ObjectsReporsitory.Experience_organisation_Location
				.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Organization Name Field Value : "
				+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in Organization Name Field");
		}

		else if (ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length()
					+ " Length Numeric Value in Organization Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length()
					+ " Length Numeric Value in Organization Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Project Location with Max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Location_with_Max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_projectLocation);
		actionsobj.perform();

		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation.clear();
		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation
				.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the projectLocation Field Value : "
				+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in projectLocation Field");
		}

		else if (ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length()
					+ " Length alphabets Value in projectLocation Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length()
					+ " Length alphabets Value in projectLocation Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen Project Location with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Location_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_projectLocation);
		actionsobj.perform();

		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation.clear();
		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation
				.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the projectLocation Field Value : "
				+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length() == 0) {
			System.out
					.println("Application Not allowing to Enter Any Special characters Value in projectLocation Field");
		}

		else if (ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length()
					+ " Length Special characters Value in projectLocation Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length()
					+ " Length Special characters Value in projectLocation Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen Project Location with Numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_Location_with_Numeric_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_projectLocation);
		actionsobj.perform();

		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation.clear();
		ObjectsReporsitory.Experience_projectLocation.click();
		ObjectsReporsitory.Experience_projectLocation.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the projectLocation Field Value : "
				+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in projectLocation Field");
		}

		else if (ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length()
					+ " Length Numeric Value in projectLocation Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_projectLocation.getAttribute("value").length()
					+ " Length Numeric Value in projectLocation Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen Project CodeOrName With Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_CodeOrName_With_Max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_projectCode);
		actionsobj.perform();

		ObjectsReporsitory.Experience_projectCode.click();
		ObjectsReporsitory.Experience_projectCode.clear();
		ObjectsReporsitory.Experience_projectCode.click();
		ObjectsReporsitory.Experience_projectCode.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Project Code/Name Field Value : "
				+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_projectCode.getAttribute("value").length() == 0) {
			System.out
					.println("Application Not allowing to Enter Any Special characters Value in projectLocation Field");
		}

		else if (ObjectsReporsitory.Experience_projectCode.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length()
					+ " Length Special characters Value in Project Code/Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length()
					+ " Length Special characters Value in Project Code/Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Project CodeOrName With Max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_CodeOrName_Max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_projectCode);
		actionsobj.perform();

		ObjectsReporsitory.Experience_projectCode.click();
		ObjectsReporsitory.Experience_projectCode.clear();
		ObjectsReporsitory.Experience_projectCode.click();
		ObjectsReporsitory.Experience_projectCode.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Project Code/Name Field Value : "
				+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_projectCode.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in projectLocation Field");
		}

		else if (ObjectsReporsitory.Experience_projectCode.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length()
					+ " Length alphabets in Project Code/Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length()
					+ " Length alphabets in Project Code/Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Project CodeOrName With Numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Project_CodeOrName_With_Numeric_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Experience_projectCode);
		actionsobj.perform();

		ObjectsReporsitory.Experience_projectCode.click();
		ObjectsReporsitory.Experience_projectCode.clear();
		ObjectsReporsitory.Experience_projectCode.click();
		ObjectsReporsitory.Experience_projectCode.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Project Code/Name Field Value : "
				+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length());
		if (ObjectsReporsitory.Experience_projectCode.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in projectLocation Field");
		}

		else if (ObjectsReporsitory.Experience_projectCode.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length()
					+ " Length Numeric in Project Code/Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.Experience_projectCode.getAttribute("value").length()
					+ " Length Numeric in Project Code/Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen invalid Aadhaar number$")
	public static void Verify_user_can_able_to_Validate_Workmen_invalid_Aadhaar_number() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_Aadhaar));
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys(ConfigFileReader.Statutory_Aadhaar_Update());

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();

		Verification_Popup.Validation_popup_handle();
		
		Actions actionsobjdasd = new Actions(DriverFactory.driver);
		actionsobjdasd.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobjdasd.perform();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_Aadhaar));
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(328);
		long number3 = rnd.nextInt(65);
		long number4 = rnd.nextInt(652);
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("64" + number1 + number2 + number3 + number4);

		Search_Aadhaar_Number = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);
		if (Search_Aadhaar_Number < 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();

			Actions actions_key1 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key1.perform();
			ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("5");
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else if (Search_Aadhaar_Number > 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();
			Actions actions_key2 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key2.perform();
			Actions actions_key3 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.BACK_SPACE);
			actions_key3.perform();
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else {
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		Actions actionsedusaveasd = new Actions(DriverFactory.driver);
		actionsedusaveasd.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusaveasd.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Aadhaar$")
	public static void Verify_user_can_able_to_Validate_Workmen_Aadhaar() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_Aadhaar));
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen Workpermit$")
	public static void Verify_user_can_able_to_Validate_Workmen_Workpermit_expiry() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		// ***************************************************************************************************************************************************************************************************

		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(328);
		long number3 = rnd.nextInt(65);
		long number4 = rnd.nextInt(652);
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("64" + number1 + number2 + number3 + number4);

		Search_Aadhaar_Number = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);
		if (Search_Aadhaar_Number < 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();

			Actions actions_key1 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key1.perform();
			ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("5");
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else if (Search_Aadhaar_Number > 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();
			Actions actions_key2 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key2.perform();
			Actions actions_key3 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.BACK_SPACE);
			actions_key3.perform();
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else {
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		}

		// ***************************************************************************************************************************************************************************************************

		ObjectsReporsitory.statutoryDetails_WorkPermit.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit.clear();
		ObjectsReporsitory.statutoryDetails_WorkPermit.click();

		Random rnd44 = new Random();
		long number1212 = rnd44.nextInt(1234567892);
		long number1213 = rnd44.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_WorkPermit.sendKeys("" + number1212 + number1213);
		System.out
				.println("Work Permit Number :" + ObjectsReporsitory.statutoryDetails_WorkPermit.getAttribute("value"));

		// ***************************************************************************************************************************************************************************************************

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Labourcard expiry$")
	public static void Verify_user_can_able_to_Validate_Workmen_Labourcard_expiry() throws Throwable {

		ObjectsReporsitory.statutoryDetails_labour.click();
		ObjectsReporsitory.statutoryDetails_labour.clear();
		ObjectsReporsitory.statutoryDetails_labour.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_labour.sendKeys("" + number1 + number2);
		System.out.println("Labour Card Number :" + ObjectsReporsitory.statutoryDetails_labour.getAttribute("value"));

		// ***************************************************************************************************************************************************************************************************

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();

		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Name$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Name() throws Throwable {

		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutory_Add_PF_Nominee);
		actions103.perform();
		ObjectsReporsitory.statutory_Add_PF_Nominee.click();

		Actions actions104 = new Actions(DriverFactory.driver);
		actions104.moveToElement(ObjectsReporsitory.PFNomieeDetails_save);
		actions104.perform();
		ObjectsReporsitory.PFNomieeDetails_save.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Relationship$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Relationship() throws Throwable {

		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Name);
		actions103.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.sendKeys(ConfigFileReader.getPF_Nominee_Name1());

		Actions actions104 = new Actions(DriverFactory.driver);
		actions104.moveToElement(ObjectsReporsitory.PFNomieeDetails_save);
		actions104.perform();
		ObjectsReporsitory.PFNomieeDetails_save.click();

		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Allocation Percentage$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Allocation_Percentage() throws Throwable {

		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Relationship);
		actions103.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Relationship.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getPF_Nominee_Relation1())) {
				webElement.click();
				System.out.println("Relationship Selected : " + ConfigFileReader.getPF_Nominee_Relation1());
				break;
			}
		}

		Actions actions104 = new Actions(DriverFactory.driver);
		actions104.moveToElement(ObjectsReporsitory.PFNomieeDetails_save);
		actions104.perform();
		ObjectsReporsitory.PFNomieeDetails_save.click();

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().contains("Enter Allocation percentage")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}

	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Allocation Percentage greater then 100 percentage$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Allocation_Percentage_greater_then_100_percentage()
			throws Throwable {

		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Percentage);
		actions103.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys(ConfigFileReader.getPF_Nominee_Percentage2());

		Actions actions104 = new Actions(DriverFactory.driver);
		actions104.moveToElement(ObjectsReporsitory.PFNomieeDetails_save);
		actions104.perform();
		ObjectsReporsitory.PFNomieeDetails_save.click();
		Verification_Popup.Validation_popup_handle();
	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Allocation Percentage less then 100 percentage$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Allocation_Percentage_less_then_100_percentage()
			throws Throwable {

		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Percentage);
		actions103.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys(ConfigFileReader.getPF_Nominee_Percentage3());

		Actions actions104 = new Actions(DriverFactory.driver);
		actions104.moveToElement(ObjectsReporsitory.PFNomieeDetails_save);
		actions104.perform();
		ObjectsReporsitory.PFNomieeDetails_save.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate workmenname field with Numeric$")
	public static void Verify_user_can_able_to_Validate_workmenname_field_with_Numeric() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_nationality);
		actionobj.perform();
		ObjectsReporsitory.Personal_nationality.click();
		ObjectsReporsitory.Personal_nationality.clear();

		Personal.verify_user_can_able_to_select_Nationality();

		Actions actionobjasd = new Actions(DriverFactory.driver);
		actionobjasd.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobjasd.perform();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.clear();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Workmenname Field Value : "
				+ ObjectsReporsitory.Personal_workmanName.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_workmanName.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Numberic Value in Workman Name Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_workmanName.getAttribute("value").length()
					+ "Length Numberic Value in Workman Name Field");
		}

	}

	@Then("^Verify user can able to Validate workmenname field with Special characters$")
	public static void Verify_user_can_able_to_Validate_workmenname_field_with_Special_characters() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobj.perform();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.clear();
		ObjectsReporsitory.Personal_workmanName.click();
		ObjectsReporsitory.Personal_workmanName.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Workmenname Field Value : "
				+ ObjectsReporsitory.Personal_workmanName.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_workmanName.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Special Char in Workman Name Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_workmanName.getAttribute("value").length()
					+ "Length Special Char  in Workman Name Field");
		}
	}

	@Then("^Verify user can able to Validate fathername with min Numeric value$")
	public static void Verify_user_can_able_to_Validate_fathername_with_min_Numeric_value() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobj.perform();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.clear();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Workmen Father's name Field Value : "
				+ ObjectsReporsitory.Personal_fatherName.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_fatherName.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Numberic Value in Workman Father's Name Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_workmanName.getAttribute("value").length()
					+ "Length Numberic Value in Workman Father's Name Field");
		}
	}

	@Then("^Verify user can able to Validate fathername with min Special characters$")
	public static void Verify_user_can_able_to_Validate_fathername_with_min_Special_characters() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actionobj.perform();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.clear();
		ObjectsReporsitory.Personal_fatherName.click();
		ObjectsReporsitory.Personal_fatherName.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Workmen Father's name Field Value : "
				+ ObjectsReporsitory.Personal_fatherName.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_fatherName.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Special Char in Workman Father's Name Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_workmanName.getAttribute("value").length()
					+ "Length Special Char in Workman Father's Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen spouse name with Numeric value$")
	public static void Verify_user_can_able_to_Validate_Workmen_spouse_name_with_Numeric_value() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_guardianSpouse);
		actionobj.perform();
		ObjectsReporsitory.Personal_guardianSpouse.click();
		ObjectsReporsitory.Personal_guardianSpouse.clear();
		ObjectsReporsitory.Personal_guardianSpouse.click();
		ObjectsReporsitory.Personal_guardianSpouse.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Workmen Spouse Name Field Value : "
				+ ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Numberic Value in Workman Spouse Name Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value").length()
					+ "Length Numberic Value in Workman Spouse Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen spouse name with Special characters$")
	public static void Verify_user_can_able_to_Validate_Workmen_spouse_name_with_Special_characters() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_guardianSpouse);
		actionobj.perform();
		ObjectsReporsitory.Personal_guardianSpouse.click();
		ObjectsReporsitory.Personal_guardianSpouse.clear();
		ObjectsReporsitory.Personal_guardianSpouse.click();
		ObjectsReporsitory.Personal_guardianSpouse.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Workmen Spouse Name Field Value : "
				+ ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Special Char in Workman Spouse Name Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value").length()
					+ "Length Special Char Value in Workman Spouse Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen CSTI with Numeric value if enabled$")
	public static void Verify_user_can_able_to_Validate_Workmen_CSTI_with_Numeric_value_value_if_enabled()
			throws Throwable {

		Actions actionobjqeqwrweqr = new Actions(DriverFactory.driver);
		actionobjqeqwrweqr.moveToElement(ObjectsReporsitory.Personal_CSTI);
		actionobjqeqwrweqr.perform();

		if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			System.out.println("Enabling CSTI NOW");
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("false")) {
			System.out.println("CSTI Enabled already");
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("false")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			System.out.println("Enabling CSTI NOW");
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Nothing is Enabled");
			System.out.println("Enabling CSTI");
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);

		}

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_cSTINumber);
		actionobj.perform();
		ObjectsReporsitory.Personal_cSTINumber.click();
		ObjectsReporsitory.Personal_cSTINumber.clear();
		ObjectsReporsitory.Personal_cSTINumber.click();
		ObjectsReporsitory.Personal_cSTINumber.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the CSTI Number Field Value : "
				+ ObjectsReporsitory.Personal_cSTINumber.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_cSTINumber.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Numberic Value in CSTINUmber Field");
		} else {
			System.out.println("Working as expected :  user Can be able to Enter "
					+ ObjectsReporsitory.Personal_cSTINumber.getAttribute("value").length()
					+ "Length Numberic Value in Workman Spouse Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen CSTI with Special characters value if enabled$")
	public static void Verify_user_can_able_to_Validate_Workmen_CSTI_with_Special_characters_if_enabled()
			throws Throwable {

		Actions actionobjqeqwrweqr = new Actions(DriverFactory.driver);
		actionobjqeqwrweqr.moveToElement(ObjectsReporsitory.Personal_CSTI);
		actionobjqeqwrweqr.perform();

		if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			System.out.println("Enabling CSTI NOW");
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("false")) {
			System.out.println("CSTI Enabled already");
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("false")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			System.out.println("Enabling CSTI NOW");
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Nothing is Enabled");
			System.out.println("Enabling CSTI");
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);

		}

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_cSTINumber);
		actionobj.perform();
		ObjectsReporsitory.Personal_cSTINumber.click();
		ObjectsReporsitory.Personal_cSTINumber.clear();
		ObjectsReporsitory.Personal_cSTINumber.click();
		ObjectsReporsitory.Personal_cSTINumber.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the CSTI Number Field Value : "
				+ ObjectsReporsitory.Personal_cSTINumber.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_cSTINumber.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any special Char in CSTINUmber Field");
		} else {
			System.out.println("Working as expected :  user Can be able to Enter "
					+ ObjectsReporsitory.Personal_cSTINumber.getAttribute("value").length()
					+ "Length special Char in Workman Spouse Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen NAPS with Numeric value if enabled$")
	public static void Verify_user_can_able_to_Validate_Workmen_NAPS_with_Numeric_value_value_if_enabled()
			throws Throwable {

		Actions actionobjqeqwrweqr = new Actions(DriverFactory.driver);
		actionobjqeqwrweqr.moveToElement(ObjectsReporsitory.Personal_CSTI);
		actionobjqeqwrweqr.perform();

		if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			Thread.sleep(2000);
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("false")) {
			System.out.println("CSTI Enabled already");
			System.out.println("Enabling NAPS NOW");
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("false")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			Thread.sleep(2000);
		} else {
			System.out.println("Nothing is Enabled");
			System.out.println("Enabling NAPS");
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);

		}

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_nAPSNumber);
		actionobj.perform();
		ObjectsReporsitory.Personal_nAPSNumber.click();
		ObjectsReporsitory.Personal_nAPSNumber.clear();
		ObjectsReporsitory.Personal_nAPSNumber.click();
		ObjectsReporsitory.Personal_nAPSNumber.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the NAPS Number Field Value : "
				+ ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Numberic Value in NAPS Number Field");
		} else {
			System.out.println("Working as expected :  user Can be able to Enter "
					+ ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value").length()
					+ "Length Numberic Value in Workman Spouse Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen NAPS with Special characters value if enabled$")
	public static void Verify_user_can_able_to_Validate_Workmen_NAPS_with_Special_characters_value_if_enabled()
			throws Throwable {

		Actions actionobjqeqwrweqr = new Actions(DriverFactory.driver);
		actionobjqeqwrweqr.moveToElement(ObjectsReporsitory.Personal_CSTI);
		actionobjqeqwrweqr.perform();

		if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			Thread.sleep(2000);
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("true")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("false")) {
			System.out.println("CSTI Enabled already");
			System.out.println("Enabling NAPS NOW");
			ObjectsReporsitory.Personal_CSTI.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);
		}

		else if (ObjectsReporsitory.Personal_CSTI.getAttribute("aria-checked").equals("false")
				&& ObjectsReporsitory.Personal_NAPS.getAttribute("aria-checked").equals("true")) {
			System.out.println("NAPS Enabled already");
			Thread.sleep(2000);
		} else {
			System.out.println("Nothing is Enabled");
			System.out.println("Enabling NAPS");
			ObjectsReporsitory.Personal_NAPS.click();
			Thread.sleep(2000);

		}

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_nAPSNumber);
		actionobj.perform();
		ObjectsReporsitory.Personal_nAPSNumber.click();
		ObjectsReporsitory.Personal_nAPSNumber.clear();
		ObjectsReporsitory.Personal_nAPSNumber.click();
		ObjectsReporsitory.Personal_nAPSNumber.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the NAPS Number Field Value : "
				+ ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any special Char in NAPS Number Field");
		} else {
			System.out.println("Working as expected :  user Can be able to Enter "
					+ ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value").length()
					+ "Length special Char in Workman Spouse Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen No of Children with max Numeric value$")
	public static void Verify_user_can_able_to_Validate_Workmen_No_of_Children_with_max_Numeric_value()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_NoofChilderen);
		actionobj.perform();
		ObjectsReporsitory.Personal_NoofChilderen.click();
		ObjectsReporsitory.Personal_NoofChilderen.clear();
		ObjectsReporsitory.Personal_NoofChilderen.click();
		ObjectsReporsitory.Personal_NoofChilderen.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Workmen Spouse Name Field Value : "
				+ ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value").length() == 0) {
			System.out
					.println("Application not allowing to Enter Any Numberic Value in Workman no of Childerens Field");
		} else {
			System.out.println("Working as expected : user Can be able to Enter "
					+ ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value").length()
					+ "Length Numberic Value in Workman no of Childerens Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen No of Children with Special characters$")
	public static void Verify_user_can_able_to_Validate_Workmen_No_of_Children_with_Special_characters()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Personal_NoofChilderen);
		actionobj.perform();
		ObjectsReporsitory.Personal_NoofChilderen.click();
		ObjectsReporsitory.Personal_NoofChilderen.clear();
		ObjectsReporsitory.Personal_NoofChilderen.click();
		ObjectsReporsitory.Personal_NoofChilderen.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Workmen Spouse Name Field Value : "
				+ ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value").length());
		if (ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value").length() == 0) {
			System.out.println("Application not allowing to Enter Any Special Char in Workman no of Childerens Field");
		} else {
			System.out.println("user Can be able to Enter "
					+ ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value").length()
					+ "Length Special Char in Workman no of Childerens Field");
		}

	}

	@Then("^Verify user can able to Validate Mobilenumber field with Max Numeric$")
	public static void Verify_user_can_able_to_Validate_Mobilenumber_field_with_Max_Numeric() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.communication_Mobilenumber);
		actionobj.perform();
		ObjectsReporsitory.communication_Mobilenumber.click();
		ObjectsReporsitory.communication_Mobilenumber.clear();
		ObjectsReporsitory.communication_Mobilenumber.click();
		ObjectsReporsitory.communication_Mobilenumber.sendKeys(ConfigFileReader.getVerification_Numeric_Max());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length());
		if (ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numberic Value in Mobilenumber Field");
		} else if (ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length() == 10) {
			System.out.println("Working as expected : user Can be able to Enter "
					+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length()
					+ "Length Numberic Value in Mobilenumber Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length()
					+ "Length Numberic Value in Mobilenumber Field");
		}

	}

	@Then("^Verify user can able to Validate Mobilenumber field with alphabets$")
	public static void Verify_user_can_able_to_Validate_Mobilenumber_field_with_alphabets() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.communication_Mobilenumber);
		actionobj.perform();
		ObjectsReporsitory.communication_Mobilenumber.click();
		ObjectsReporsitory.communication_Mobilenumber.clear();
		ObjectsReporsitory.communication_Mobilenumber.click();
		ObjectsReporsitory.communication_Mobilenumber.sendKeys(ConfigFileReader.getVerification_Numeric_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length());
		if (ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Mobilenumber Field");
		} else if (ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length() == 10) {
			System.out.println("Working as expected : user Can be able to Enter "
					+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length()
					+ "Length alphabets Value in Mobilenumber Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length()
					+ "Length alphabets Value in Mobilenumber Field");
		}
	}

	@Then("^Verify user can able to Validate Mobilenumber field with Special characters$")
	public static void Verify_user_can_able_to_Validate_Mobilenumber_field_with_Special_characters() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.communication_Mobilenumber);
		actionobj.perform();
		ObjectsReporsitory.communication_Mobilenumber.click();
		ObjectsReporsitory.communication_Mobilenumber.clear();
		ObjectsReporsitory.communication_Mobilenumber.click();
		ObjectsReporsitory.communication_Mobilenumber.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length());
		if (ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special characters Value in Mobilenumber Field");
		} else if (ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length() == 10) {
			System.out.println("Working as expected : user Can be able to Enter "
					+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length()
					+ "Length Special characters Value in Mobilenumber Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.communication_Mobilenumber.getAttribute("value").length()
					+ "Length Special characters Value in Mobilenumber Field");
		}

	}

	@Then("^Verify user can able to Validate Permanent address pincode field with Max Numeric$")
	public static void Verify_user_can_able_to_Validate_Permanent_address_pincode_field_with_Max_Numeric()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.clear();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.sendKeys(ConfigFileReader.getVerification_Numeric_Max());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.Communication_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_pincode.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_pincode.getAttribute("value").length()
					+ "Length Numeric Value in pincode Field");
		}

	}

	@Then("^Verify user can able to Validate Permanent address pincode field with alphabets$")
	public static void Verify_user_can_able_to_Validate_Permanent_address_pincode_field_with_alphabets()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.clear();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.sendKeys(ConfigFileReader.getVerification_Numeric_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.Communication_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_pincode.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_pincode.getAttribute("value").length()
					+ "Length alphabets Value in pincode Field");
		}
	}

	@Then("^Verify user can able to Validate Permanent address pincode field with Special characters$")
	public static void Verify_user_can_able_to_Validate_Permanent_address_pincode_field_with_Special_characters()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.clear();
		ObjectsReporsitory.Communication_pincode.click();
		ObjectsReporsitory.Communication_pincode.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.Communication_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_pincode.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special Char Value in pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_pincode.getAttribute("value").length()
					+ "Length Special Char Value in pincode Field");
		}

	}

	@Then("^Verify user can able to Validate Temporary address pincode field with Max Numeric$")
	public static void Verify_user_can_able_to_Validate_Temporary_address_pincode_field_with_Max_Numeric()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Temp_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.clear();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.sendKeys(ConfigFileReader.getVerification_Numeric_Max());
		Thread.sleep(2000);
		System.out.println("Length of the Mobilenumber Field Value : "
				+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Numeric Char Value in Temporary address pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length()
					+ "Length Numeric Char Value in Temporary address pincode Field");
		}

	}

	@Then("^Verify user can able to Validate Temporary address pincode field with alphabets$")
	public static void Verify_user_can_able_to_Validate_Temporary_address_pincode_field_with_alphabets()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Temp_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.clear();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.sendKeys(ConfigFileReader.getVerification_Numeric_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Temp_pincode Field Value : "
				+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Char Value in Temp_pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length()
					+ "Length alphabets Char Value in Temp_pincode Field");
		}

	}

	@Then("^Verify user can able to Validate Temporary address pincode field with Special characters$")
	public static void Verify_user_can_able_to_Validate_Temporary_address_pincode_field_with_Special_characters()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_Temp_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.clear();
		ObjectsReporsitory.Communication_Temp_pincode.click();
		ObjectsReporsitory.Communication_Temp_pincode.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Temp_pincode Field Value : "
				+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special characters Char Value in Temp_pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value").length()
					+ "Length Special characters Value in Temp_pincode Field");
		}
	}

	@Then("^Verify user can able to Validate Emergency Contact address pincode Max field with Numeric$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_address_pincode_Max_field_with_Numeric()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.clear();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.sendKeys(ConfigFileReader.getVerification_Numeric_Max());
		Thread.sleep(2000);
		System.out.println("Length of the EC_pincode Field Value : "
				+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Numeric Char Value in Emergency Contact Address Pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length()
					+ "Length Numeric Value in Emergency Contact Address Pincode  Field");
		}

	}

	@Then("^Verify user can able to Validate Emergency Contact address address pincode field with alphabets$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_address_address_pincode_field_with_alphabets()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.clear();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.sendKeys(ConfigFileReader.getVerification_Numeric_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the EC_pincode Field Value : "
				+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any alphabets Value in Emergency Contact Address Pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length()
					+ "Length alphabets Value in Emergency Contact Address Pincode Field");
		}

	}

	@Then("^Verify user can able to Validate Emergency Contact address pincode field with Special characters$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_address_pincode_field_with_Special_characters()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.clear();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the EC_pincode Field Value : "
				+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special Charecters in Emergency Contact Address Pincode Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length()
					+ "Length Special Charecters in Emergency Contact Address Pincode Field");
		}

	}

	@Then("^Verify user can able to Validate Emergency Contact Name field with Numeric$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_Name_field_with_Numeric() throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.clear();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.sendKeys(ConfigFileReader.getVerification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Emergency Contact Name Field Value : "
				+ ObjectsReporsitory.Communication_EC_name.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Numeric Charecters in Emergency Contact Name Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_name.getAttribute("value").length()
					+ "Length Numeric Charecters in Emergency Contact Name Field");
		}
	}

	@Then("^Verify user can able to Validate Emergency Contact Name field with Special characters$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_Name_field_with_Special_characters()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_pincode);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.clear();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Emergency Contact Name Field Value : "
				+ ObjectsReporsitory.Communication_EC_name.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_pincode.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special Charecters in Emergency Contact Name Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_name.getAttribute("value").length()
					+ "Length Special Charecters in Emergency Contact Name Field");
		}
	}

	@Then("^Verify user can able to Validate Emergency Contact Mobile Number field with Max Numeric$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_Mobile_Number_field_with_Max_Numeric()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_MobileNumber);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.clear();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.sendKeys(ConfigFileReader.getVerification_Numeric_Max());
		Thread.sleep(2000);
		System.out.println("Length of the Emergency Contact Mobile Number Field Value : "
				+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special Charecters in Emergency Contact Name Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length()
					+ "Length Numeric Charecters in Emergency Contact Mobile Number Field");
		}

	}

	@Then("^Verify user can able to Validate Emergency Contact Mobile Number field with alphabets$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_Mobile_Number_field_with_alphabets()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_MobileNumber);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.clear();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.sendKeys(ConfigFileReader.getVerification_Numeric_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Emergency Contact Mobile Number Field Value : "
				+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any alphabets Charecters in Emergency Contact Name Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length()
					+ "Length alphabets Charecters in Emergency Contact Mobile Number Field");
		}

	}

	@Then("^Verify user can able to Validate Emergency Contact Mobile Number field with Special characters$")
	public static void Verify_user_can_able_to_Validate_Emergency_Contact_Mobile_Number_field_with_Special_characters()
			throws Throwable {

		Actions actionobj = new Actions(DriverFactory.driver);
		actionobj.moveToElement(ObjectsReporsitory.Communication_EC_MobileNumber);
		actionobj.perform();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.clear();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.sendKeys(ConfigFileReader.getVerification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Emergency Contact Mobile Number Field Value : "
				+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special Charecters in Emergency Contact Name Field");
		} else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value").length()
					+ "Length Special Charecters in Emergency Contact Mobile Number Field");
		}

	}

//****************************************************************************************************************************************************

	@Then("^Verify user can able to Validate Workmen Aadhaar number with max numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Aadhaar_number_with_max_numeric_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Aadhaar Field Value : "
				+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length());
		if (ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Aadhaar Field");
		} else if (ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length() > 12) {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length()
					+ " Length Numeric Value in Aadhaar Field");
		}

		else {
			System.out.println("User Can be able to Enter "
					+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length()
					+ " Length Numeric Value in Aadhaar Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Aadhaar number with alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Aadhaar_number_with_alphabets_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Aadhaar Field Value : "
				+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length());
		if (ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Aadhaar Field");
		} else if (ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length() > 12) {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length()
					+ " Length alphabets Value in Aadhaar Field");
		}

		else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length()
					+ " Length alphabets Value in Aadhaar Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Aadhaar number with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Aadhaar_number_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Aadhaar Field Value : "
				+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length());
		if (ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special characters Value in Aadhaar Field");
		} else if (ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length() > 12) {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length()
					+ " Length Special characters Value in Aadhaar Field");
		}

		else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length()
					+ " Length Special characters Value in Aadhaar Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Workpermit expiry with past date$")
	public static void Verify_user_can_able_to_Validate_Workmen_Workpermit_expiry_with_past_date() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		// ***************************************************************************************************************************************************************************************************

		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(328);
		long number3 = rnd.nextInt(65);
		long number4 = rnd.nextInt(652);
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("64" + number1 + number2 + number3 + number4);

		Search_Aadhaar_Number = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);
		if (Search_Aadhaar_Number < 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();

			Actions actions_key1 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key1.perform();
			ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("5");
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else if (Search_Aadhaar_Number > 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();
			Actions actions_key2 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key2.perform();
			Actions actions_key3 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.BACK_SPACE);
			actions_key3.perform();
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else {
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		}

		// ***************************************************************************************************************************************************************************************************

		ObjectsReporsitory.statutoryDetails_WorkPermit.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit.clear();
		ObjectsReporsitory.statutoryDetails_WorkPermit.click();

		Random rnd44 = new Random();
		long number1212 = rnd44.nextInt(1234567892);
		long number1213 = rnd44.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_WorkPermit.sendKeys("" + number1212 + number1213);
		System.out
				.println("Work Permit Number :" + ObjectsReporsitory.statutoryDetails_WorkPermit.getAttribute("value"));

		// ***************************************************************************************************************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit_expiry));
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry
				.sendKeys(ConfigFileReader.getWorkpermit_Expiry_Date_Month());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry
				.sendKeys(ConfigFileReader.getWorkpermit_Expiry_PastYear());
		Thread.sleep(2000);

		System.out.println("Workpermit Expiry Date : "
				+ ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.getAttribute("value"));

		// ***************************************************************************************************************************************************************************************************

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().contains("Expiry Date")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}

	}

	@Then("^Verify user can able to Validate Workmen Labourcard expiry with past date$")
	public static void Verify_user_can_able_to_Validate_Workmen_Labourcard_expiry_with_past_date() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.statutoryDetails_Aadhaar);
		actionsobj.perform();

		// ***************************************************************************************************************************************************************************************************

		ObjectsReporsitory.statutoryDetails_Aadhaar.click();
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
		ObjectsReporsitory.statutoryDetails_Aadhaar.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(328);
		long number3 = rnd.nextInt(65);
		long number4 = rnd.nextInt(652);
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("64" + number1 + number2 + number3 + number4);

		Search_Aadhaar_Number = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);
		if (Search_Aadhaar_Number < 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();

			Actions actions_key1 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key1.perform();
			ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("5");
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else if (Search_Aadhaar_Number > 12) {
			ObjectsReporsitory.statutoryDetails_Aadhaar.click();
			Actions actions_key2 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.END);
			actions_key2.perform();
			Actions actions_key3 = new Actions(DriverFactory.driver);
			actions.sendKeys(Keys.BACK_SPACE);
			actions_key3.perform();
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		} else {
			System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
		}

		// ***************************************************************************************************************************************************************************************************

		ObjectsReporsitory.statutoryDetails_WorkPermit.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit.clear();
		// ***************************************************************************************************************************************************************************************************
		ObjectsReporsitory.statutoryDetails_labour.click();
		ObjectsReporsitory.statutoryDetails_labour.clear();
		ObjectsReporsitory.statutoryDetails_labour.click();

		Random rndas = new Random();
		long number12e = rndas.nextInt(1234567892);
		long number2wd = rndas.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_labour.sendKeys("" + number12e + number2wd);
		System.out.println("Labour Card Number :" + ObjectsReporsitory.statutoryDetails_labour.getAttribute("value"));

		// ***************************************************************************************************************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour_expiry));
		ObjectsReporsitory.statutoryDetails_labour_expiry.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.statutoryDetails_labour_expiry.sendKeys(ConfigFileReader.getLabourcard_Expiry_Date_Month());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.statutoryDetails_labour_expiry.sendKeys(ConfigFileReader.getLabourcard_Expiry_PastYear());
		Thread.sleep(2000);

		System.out.println("Labour Card Expiry Date : "
				+ ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.getAttribute("value"));

		// ***************************************************************************************************************************************************************************************************

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().contains("Expiry Date")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else {
					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error : Wrong Popup Error Message Displayed");
					System.out.println("--------------------------------------------------------");
				}
			}
		}

		Actions actionsedusave = new Actions(DriverFactory.driver);
		actionsedusave.moveToElement(ObjectsReporsitory.statutoryDetails_save);
		actionsedusave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();

	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Name with max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Name_with_max_alphabets_input()
			throws Throwable {

		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutory_Add_PF_Nominee);
		actions103.perform();
		ObjectsReporsitory.statutory_Add_PF_Nominee.click();

		Actions actions10323we = new Actions(DriverFactory.driver);
		actions10323we.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Name);
		actions10323we.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name
				.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());

		Thread.sleep(2000);
		System.out.println("Length of the PF Nominee Name Field Value : "
				+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length());
		if (ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Organization Name Field");
		}

		else if (ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length()
					+ " Length alphabets Value in PF Nominee Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length()
					+ " Length alphabets Value in PF Nominee Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Name with numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Name_with_numeric_input() throws Throwable {

		Actions actions10323we = new Actions(DriverFactory.driver);
		actions10323we.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Name);
		actions10323we.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());

		Thread.sleep(2000);
		System.out.println("Length of the PF Nominee Name Field Value : "
				+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length());
		if (ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any numeric Value in Organization Name Field");
		}

		else if (ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length()
					+ " Length numeric Value in PF Nominee Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length()
					+ " Length numeric Value in PF Nominee Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Name with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Name_with_Special_characters_input()
			throws Throwable {

		Actions actions10323we = new Actions(DriverFactory.driver);
		actions10323we.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Name);
		actions10323we.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Name.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name
				.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());

		Thread.sleep(2000);
		System.out.println("Length of the PF Nominee Name Field Value : "
				+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length());
		if (ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special characters Value in Organization Name Field");
		}

		else if (ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length()
					+ " Length Special characters Value in PF Nominee Name Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length()
					+ " Length Special characters Value in PF Nominee Name Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Allocation Percentage with max numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Allocation_Percentage_with_max_numeric_input()
			throws Throwable {

		Actions actions10323we = new Actions(DriverFactory.driver);
		actions10323we.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Percentage);
		actions10323we.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage
				.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());

		Thread.sleep(2000);
		System.out.println("Length of the PF Allocation Percentage Field Value : "
				+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length());
		if (ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any numeric Value in Allocation Percentage Field");
		}

		else if (ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length() > 3) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length()
					+ " Length numeric Value in PF Allocation Percentage Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length()
					+ " Length numeric Value in PF Allocation Percentage Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Allocation Percentage with alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Allocation_Percentage_with_alphabets_input()
			throws Throwable {

		Actions actions10323we = new Actions(DriverFactory.driver);
		actions10323we.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Percentage);
		actions10323we.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage
				.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());

		Thread.sleep(2000);
		System.out.println("Length of the PF Allocation Percentage Field Value : "
				+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length());
		if (ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Allocation Percentage Field");
		}

		else if (ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length()
					+ " Length alphabets Value in PF Allocation Percentage Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length()
					+ " Length alphabets Value in PF Allocation Percentage Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen PF Nominee Allocation Percentage with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_PF_Nominee_Allocation_Percentage_with_Special_characters_input()
			throws Throwable {

		Actions actions10323we = new Actions(DriverFactory.driver);
		actions10323we.moveToElement(ObjectsReporsitory.statutory_PF_Nominee_Percentage);
		actions10323we.perform();

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage
				.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());

		Thread.sleep(2000);
		System.out.println("Length of the PF Allocation Percentage Field Value : "
				+ ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value").length());
		if (ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length() == 0) {
			System.out.println(
					"Application Not allowing to Enter Any Special characters Value in Allocation Percentage Field");
		}

		else if (ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length() > 100) {
			System.out.println("Error : User Can be able to Enter more then "
					+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length()
					+ " Length Special characters Value in PF Allocation Percentage Field");
		} else {
			System.out.println("Error : User Can be able to Enter "
					+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value").length()
					+ " Length Special characters Value in PF Allocation Percentage Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Bank Account IFSC or IBAN or SWIFT Code$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_IFSC_or_IBAN_or_SWIFT_Code()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountName);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.clear();
		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.sendKeys(ConfigFileReader.getBank_AccountName());
		System.out.println("Bank Name:" + ConfigFileReader.getBank_AccountName());

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_domestic));
		ObjectsReporsitory.Bank_Account_domestic.click();

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.saveSubmit);
		actionsave.perform();
		ObjectsReporsitory.saveSubmit.click();
		Verification_Popup.Validation_popup_handle();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_international));
		ObjectsReporsitory.Bank_Account_international.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_International_iBAN));
		ObjectsReporsitory.Bank_International_iBAN.click();

		Actions actionsave2 = new Actions(DriverFactory.driver);
		actionsave2.moveToElement(ObjectsReporsitory.saveSubmit);
		actionsave2.perform();
		ObjectsReporsitory.saveSubmit.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Bank Account Name$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Name() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountName);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.clear();
		// ************************************************************************************************************************************************************************
		if (ConfigFileReader.getBank_Account_Type().equals("Domestic")) {
			ObjectsReporsitory.Bank_Account_domestic.click();
			System.out.println("Bank Account Type:" + ConfigFileReader.getBank_Account_Type());
		} else if (ConfigFileReader.getBank_Account_Type().equals("International")) {
			ObjectsReporsitory.Bank_Account_international.click();
			System.out.println("Bank Account Type:" + ConfigFileReader.getBank_Account_Type());
		}

		// ************************************************************************************************************************************************************************

		if (ConfigFileReader.getBank_Account_Type().equals("Domestic")) {
			ObjectsReporsitory.Bank_iFSCCode.sendKeys(ConfigFileReader.getBank_IFSC_Code_Half());
			Thread.sleep(2000);
			List<WebElement> DropdownResult = ObjectsReporsitory.Bank_iFSCCode_Result_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getBank_IFSC_Code_full())) {
					webElement.click();
					System.out.println("IFSC Code:" + ConfigFileReader.getBank_IFSC_Code_full());
					break;
				}
			}
		} else if (ConfigFileReader.getBank_Account_Type().equals("International")) {
			System.out.println("Selected Bank Account Type As:" + ConfigFileReader.getBank_Account_Type());
			if (ConfigFileReader.getBank_InterNationalType().equals("IBAN")) {
				ObjectsReporsitory.Bank_International_iBAN.click();
				ObjectsReporsitory.Bank_International_iBANCode
						.sendKeys(ConfigFileReader.getBank_International_IBANCode_Half());
				// Need to implement for dropdown values select
			} else if (ConfigFileReader.getBank_InterNationalType().equals("SWIFT")) {
				ObjectsReporsitory.Bank_International_sWIFT.click();
				ObjectsReporsitory.Bank_International_sWIFTCode
						.sendKeys(ConfigFileReader.getBank_International_SWIFTCode_Half());
				// Need to implement for dropdown values select
			}
		}

		// ************************************************************************************************************************************************************************

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.saveSubmit);
		actionsave.perform();
		ObjectsReporsitory.saveSubmit.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Bank Account Number$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Number() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountName);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.clear();
		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.sendKeys(ConfigFileReader.getBank_AccountName());
		System.out.println("Bank Account Name:" + ConfigFileReader.getBank_AccountName());

		Actions actionsave = new Actions(DriverFactory.driver);
		actionsave.moveToElement(ObjectsReporsitory.saveSubmit);
		actionsave.perform();
		ObjectsReporsitory.saveSubmit.click();
		Verification_Popup.Validation_popup_handle();

	}

	@Then("^Verify user can able to Validate Workmen Bank Account Name with max alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Name_with_max_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountName);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.clear();
		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Bank Account Name Field Value : "
				+ ObjectsReporsitory.Bank_AccountName.getAttribute("value").length());
		if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").length() == 0) {
			System.out.println(
					"Error : Application Not allowing to Enter Any alphabets Value in Bank Account Name Field");
		} else if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").length() > 100) {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountName.getAttribute("value").length()
							+ " Length alphabets Value in Bank Account Name Field");
		}

		else {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountName.getAttribute("value").length()
							+ " Length alphabets Value in Bank Account Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Bank Account Name with numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Name_with_numeric_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountName);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.clear();
		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Bank Account Name Field Value : "
				+ ObjectsReporsitory.Bank_AccountName.getAttribute("value").length());
		if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").length() == 0) {
			System.out
					.println("Error : Application Not allowing to Enter Any numeric Value in Bank Account Name Field");
		} else if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").length() > 100) {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountName.getAttribute("value").length()
							+ " Length Numeric Value in Bank Account Name Field");
		}

		else {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountName.getAttribute("value").length()
							+ " Length numeric Value in Bank Account Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Bank Account Name with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Name_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountName);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.clear();
		ObjectsReporsitory.Bank_AccountName.click();
		ObjectsReporsitory.Bank_AccountName.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Bank Account Name Field Value : "
				+ ObjectsReporsitory.Bank_AccountName.getAttribute("value").length());
		if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").length() == 0) {
			System.out.println(
					"Error : Application Not allowing to Enter Any Special characters Value in Bank Account Name Field");
		} else if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").length() > 100) {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountName.getAttribute("value").length()
							+ " Length Special characters Value in Bank Account Name Field");
		}

		else {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountName.getAttribute("value").length()
							+ " Length Special characters Value in Bank Account Name Field");
		}

	}

	@Then("^Verify user can able to Validate Workmen Bank Account Number with alphabets input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Number_with_alphabets_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountNumber);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountNumber.click();
		ObjectsReporsitory.Bank_AccountNumber.clear();
		ObjectsReporsitory.Bank_AccountNumber.click();
		ObjectsReporsitory.Bank_AccountNumber.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Bank Account Number Field Value : "
				+ ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length() == 0) {
			System.out.println(
					"Error : Application Not allowing to Enter Any alphabets Value in Bank Account Number Field");
		} else if (ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length() > 100) {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length()
							+ " Length alphabets Value in Bank Account Number Field");
		}

		else {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length()
							+ " Length alphabets Value in Bank Account Number Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen Bank Account Number with max numeric input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Number_with_max_numeric_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountNumber);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountNumber.click();
		ObjectsReporsitory.Bank_AccountNumber.clear();
		ObjectsReporsitory.Bank_AccountNumber.click();
		ObjectsReporsitory.Bank_AccountNumber.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Bank Account Number Field Value : "
				+ ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length() == 0) {
			System.out.println(
					"Error : Application Not allowing to Enter Any Numeric Value in Bank Account Number Field");
		} else if (ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length() > 100) {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length()
							+ " Length Numeric Value in Bank Account Number Field");
		}

		else {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length()
							+ " Length Numeric Value in Bank Account Number Field");
		}
	}

	@Then("^Verify user can able to Validate Workmen Bank Account Number with Special characters input$")
	public static void Verify_user_can_able_to_Validate_Workmen_Bank_Account_Number_with_Special_characters_input()
			throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Bank_AccountNumber);
		actionsobj.perform();

		ObjectsReporsitory.Bank_AccountNumber.click();
		ObjectsReporsitory.Bank_AccountNumber.clear();
		ObjectsReporsitory.Bank_AccountNumber.click();
		ObjectsReporsitory.Bank_AccountNumber.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Bank Account Number Field Value : "
				+ ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length());
		if (ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length() == 0) {
			System.out.println(
					"Error : Application Not allowing to Enter Any Special characters Value in Bank Account Number Field");
		} else if (ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length() > 100) {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length()
							+ " Length Special characters Value in Bank Account Number Field");
		}

		else {
			System.out.println(
					"User Can be able to Enter " + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value").length()
							+ " Length Special characters Value in Bank Account Number Field");
		}

	}

}
