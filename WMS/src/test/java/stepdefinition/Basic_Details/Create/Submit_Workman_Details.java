package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Submit_Workman_Details {

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Submit_Workman_Details() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication Skill Deployment Education Experience Statutory bank details$")
	public static void Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_Statutory_bank_details()
			throws Throwable {

		Bank.Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_Statutory_details_then_navigate_to_bank();
		Bank.Verify_user_can_able_to_add_Bank_Account_name();
		Bank.Verify_user_can_able_to_add_Bank_Account_Number();
		Bank.Verify_user_can_able_to_add_Bank_Account_Type();
		Bank.Verify_user_can_able_to_add_Bank_Account_Details();

	}

	@Then("^Verify save and submit workman details$")
	public static void Verify_save_and_submit_workman_details() throws Throwable {

		ObjectsReporsitory.saveSubmit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();

	}

	@Then("^Verify user can be able to Fill Partner Details$")
	public static void Verify_user_can_be_able_to_Fill_Partner_Details() throws Throwable {

		Partner.Verify_user_can_able_to_select_the_Existing_Partner_by_ID();
		Partner.Verify_user_can_able_to_select_the_Worktype();
		Partner.Verify_user_can_able_to_view_partner_details();
		Partner.Verify_user_can_able_to_view_partner_work_details();
		Partner.Verify_user_can_able_to_Save();

	}

	@Then("^Verify user can be able to Fill Personal Details$")
	public static void Verify_user_can_be_able_to_Fill_Personal_Details() throws Throwable {

		Personal.Verify_user_can_able_to_enter_name_and_fathername();
		Personal.Verify_user_can_able_to_select_DOB();
		Personal.Verify_user_age_auto_calculated();
		Personal.Verify_user_able_to_capture_image();
		Personal.Verify_user_able_to_add_Language();
		Personal.verify_user_can_able_to_select_gender();
		Personal.Verify_user_can_able_to_select_blood_group();
		Personal.verify_user_can_able_to_select_marital_status();
		Personal.verify_user_can_able_to_enter_spouse_name();
		Personal.verify_user_can_able_to_enter_religion();
		Personal.verify_user_can_able_to_enter_Nearest_police_station();
		Personal.verify_user_can_able_to_select_Nationality();
		Personal.verify_user_can_able_to_provide_CSTI_and_NAPS();
		Personal.verify_user_can_able_to_save_Personal_details();

	}

	@Then("^Verify user can be able to Fill Communication Details$")
	public static void Verify_user_can_be_able_to_Fill_Communication_Details() throws Throwable {

		Communication.Verify_user_can_able_to_enter_mobile_number();
		Communication.Verify_user_can_able_to_Select_International_Country_Nepal();
		Communication.Verify_user_can_able_to_enter_International_address();
		Communication.Verify_user_can_able_to_enter_Temporary_address_international_Nepal();
		;
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_Name_and_number();
		Communication.Verify_user_can_able_to_select_relationship_with_employee();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_address_Nepal();
		Communication.Verify_user_can_able_to_save_communication_details();

	}

	@Then("^Verify user can be able to Fill Skill Details$")
	public static void Verify_user_can_be_able_to_Fill_Skill_Details() throws Throwable {

		skill.Verify_user_can_able_to_select_skill_category();
		skill.Verify_user_can_able_to_select_skill_group();
		skill.Verify_user_can_able_to_select_skill_description();
		skill.Verify_user_can_able_to_select_skill_Type();
		skill.Verify_user_can_able_to_save_skill();

	}

	@Then("^Verify user can be able to Fill Deployment Details$")
	public static void Verify_user_can_be_able_to_Fill_Deployment_Details() throws Throwable {

		Deployment.Verify_user_can_able_to_click_deployemnt();
		Deployment.Verify_user_can_able_to_select_deployemnt_from_tree();
		Deployment.Verify_user_can_able_to_save_deployemnt();

	}

	@Then("^Verify user can be able to Fill Education Details$")
	public static void Verify_user_can_be_able_to_Fill_Education_Details() throws Throwable {

		Education.Verify_user_can_able_to_add_Education();
		Education.Verify_user_can_able_to_select_Qualification();
		Education.Verify_user_can_able_to_select_Branch_based_on_Qualification_and_enter_discipiline();
		Education.Verify_user_can_able_to_enter_schoolORCollege();
		Education.Verify_user_can_able_to_enter_BoardORUniversity();
		Education.Verify_user_can_able_to_enter_Year_of_Passing();
		Education.Verify_user_can_able_to_save_education();
	}

	@Then("^Verify user can be able to Fill Experience Details$")
	public static void Verify_user_can_be_able_to_Fill_Experience_Details() throws Throwable {

		Experience.Verify_user_can_able_to_add_Experience();
		Experience.Verify_user_can_able_to_add_Duration();
		Experience.Verify_user_can_able_to_add_Project_details();
		Experience.Verify_user_can_able_to_add_Project_Skill();
		Experience.Verify_user_can_able_to_add_Experience_details();
		Experience.Verify_user_can_able_to_view_Previous_Job_Experience_details();
		Experience.Verify_user_can_able_to_save_Experience_details();
	}

	@Then("^Verify user can be able to Fill Satutory Details$")
	public static void Verify_user_can_be_able_to_Fill_Satutory_Details() throws Throwable {

		Statutory.Verify_User_can_able_to_Add_international_Workpermit_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_international_Workpermit();
		Statutory.Verify_User_can_able_to_Add_Workpermit_expiry();
		Statutory.Verify_User_can_able_to_Add_international_Labourcard_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_international_Labourcard();
		Statutory.Verify_User_can_able_to_Add_International_Labourcard_expiry();
		Statutory.Verify_User_can_able_to_Add_passport_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_Passport();
		Statutory.Verify_User_can_able_to_Add_passport_expiry();
		Statutory.Verify_User_can_able_save_Statutory_Details();
		Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
		Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();

	}

	@Then("^Verify user can be able to Fill Bank Details$")
	public static void Verify_user_can_be_able_to_Fill_Bank_Details() throws Throwable {

		Bank.Verify_user_can_able_to_add_Bank_Account_name();
		Bank.Verify_user_can_able_to_add_Bank_Account_Number();
		Bank.Verify_user_can_able_to_add_Bank_Account_Type();
		Bank.Verify_user_can_able_to_add_Bank_Account_Details();

	}

	@Then("^Verify user can be able to Submit workmen Details$")
	public static void Verify_user_can_be_able_to_Submit_workmen_Details() throws Throwable {
		ObjectsReporsitory.saveSubmit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
	}

}
