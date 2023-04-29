package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import java.util.Random;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import stepdefinition.DLR.Create.DLR;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;

public class Create_Workmen {

	public static int popup_validation;
	
	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Create_Workmen() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login and Select International Job then navigate to Basic details$")
	public static void Login_and_Select_International_Job() throws Throwable {
		stepdefinition.Login.Use_Login_for_InternationalJob();

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
		if (Current_job.contains(ConfigFileReader.getJob_LE20D146())) {
			System.out.println("User Currenlty set on Job " + Current_job);
		} else {
			SwitchJob_Create.SwitchJob_LE20D146();
		}

		// New Implementation
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_International));
		ObjectsReporsitory.WorkmenSearch_International.click();
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
			DLR.Selecting_Nepal_job_for_DLR_Entery();
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
			System.out.println("DLR Record For Selected Job Already Present");
			System.out.println("============================================");
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		// ObjectsReporsitory.Dashboard_SearchBy_select.click();
		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchWorkmen_Passport));
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input));
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(328);
		long number3 = rnd.nextInt(65);
		long number4 = rnd.nextInt(652);
		ObjectsReporsitory.Dashboard_employeeAadhaar.sendKeys("64" + number1 + number2 + number3 + number4);

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
//		System.out.println("Popup Response : " + ObjectsReporsitory.popup.getText());
//		System.out.println(ObjectsReporsitory.popup_text.getText());
//		System.out.println("***************************************");
//		ObjectsReporsitory.WorkmanSearchPopup_ok.click();
//		System.out.println("No Workmen Found : Continue for Induction");
//		System.out.println("***************************************");
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
	
	@Then("^Verify user can able to Fill Partner Details$")
	public static void Verify_user_can_able_to_Fill_Partner_Details() throws Throwable {
		Partner.Verify_user_can_able_to_select_the_Existing_Partner_by_ID();
		Partner.Verify_user_can_able_to_select_the_Worktype();
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_next));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Partner_next);
		actions.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions.perform();
		System.out.println("Navigated to Basicdetails - Personal");
	}
	
	@Then("^Verify user can able to Fill Personal Details$")
	public static void Verify_user_can_able_to_Fill_Personal_Details() throws Throwable {

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
		//Personal.verify_user_can_able_to_select_Police_Verification_Certificate();
		Personal.verify_user_can_able_to_select_Nationality();
		Personal.verify_user_can_able_to_provide_CSTI_and_NAPS();
		Personal.verify_user_can_able_to_save_Personal_details();
	}
	
	@Then("^Verify user can able to Fill Communication Details$")
	public static void Verify_user_can_able_to_Fill_Communication_Details() throws Throwable {

		Communication.Verify_user_can_able_to_enter_mobile_number();
		Communication.Verify_user_can_able_to_Select_Country();
		Communication.Verify_address_autofetched_based_on_pincode_entered();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege();
		Communication.Verify_user_can_able_to_enter_Temporary_address();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_Name_and_number();
		Communication.Verify_user_can_able_to_select_relationship_with_employee();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_address_pincode();
		Communication.Verify_address_autofetched_based_on_pincode_entered_for_Emergency_Contact();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege_for_Emergency_Contact();
		Communication.Verify_user_can_able_to_save_communication_details();
	}
	
	@Then("^Verify user can able to Fill Skill Details$")
	public static void Verify_user_can_able_to_Fill_Skill_Details() throws Throwable {

		skill.Verify_user_can_able_to_select_skill_category();
		skill.Verify_user_can_able_to_select_skill_group();
		skill.Verify_user_can_able_to_select_skill_description();
		skill.Verify_user_can_able_to_select_skill_Type();
		skill.Verify_user_can_able_to_save_skill();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_skillDeployment));
		ObjectsReporsitory.Induction_skillDeployment.click();
		System.out.println("Navigated to Deployment");
	}
	
	@Then("^Verify user can able to Fill Deployment Details$")
	public static void Verify_user_can_able_to_Fill_Deployment_Details() throws Throwable {

		Deployment.Verify_user_can_able_to_click_deployemnt();
		Deployment.Verify_user_can_able_to_select_deployemnt_from_tree();
		Deployment.Verify_user_can_able_to_save_deployemnt();
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.Education_addEducation_btn);
		actions.perform();
		System.out.println("Navigated to Education & Training");

	}
	
	@Then("^Verify user can able to Fill Educational Details$")
	public static void Verify_user_can_able_to_Fill_Educational_Details() throws Throwable {

		Education.Verify_user_can_able_to_add_Education();
		Education.Verify_user_can_able_to_select_Qualification();
		Education.Verify_user_can_able_to_select_Branch_based_on_Qualification_and_enter_discipiline();
		Education.Verify_user_can_able_to_enter_schoolORCollege();
		Education.Verify_user_can_able_to_enter_BoardORUniversity();
		Education.Verify_user_can_able_to_enter_Year_of_Passing();
		Education.Verify_user_can_able_to_save_education();

	}
	
	@Then("^Verify user can able to Fill Experience Details$")
	public static void Verify_user_can_able_to_Fill_Experience_Details() throws Throwable {

		Experience.Verify_user_can_able_to_add_Experience();
		Experience.Verify_user_can_able_to_add_Duration();
		Experience.Verify_user_can_able_to_add_Project_details();
		Experience.Verify_user_can_able_to_add_Project_Skill();
		Experience.Verify_user_can_able_to_add_Experience_details();
		Experience.Verify_user_can_able_to_view_Previous_Job_Experience_details();
		Experience.Verify_user_can_able_to_save_Experience_details();
		ObjectsReporsitory.Induction_statutoryDetails.click();
		Actions actions101 = new Actions(DriverFactory.driver);
		actions101.moveToElement(ObjectsReporsitory.statutoryDetails_PFNominee_Header);
		actions101.perform();
		System.out.println("Navigated to Statutory");

	}
	
	@Then("^Verify user can able to Fill Statutory Details$")
	public static void Verify_user_can_able_to_Fill_Statutory_Details() throws Throwable {

//		Statutory.Verify_User_can_able_to_Add_Aadhaar();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_Aadhaar();
//		Statutory.Verify_User_Can_able_to_Add_Driving_License();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_Driving_License();
//		Statutory.Verify_User_can_able_to_add_Driving_License_expiry();
//		Statutory.Verify_User_can_able_to_Add_PAN_card();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_PAN_card();
		
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.clear();
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.sendKeys("" + number1 + number2);
		System.out
				.println("Work Permit Number :" + ObjectsReporsitory.statutoryDetails_WorkPermit_international.getAttribute("value"));
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_WP_international));
		ObjectsReporsitory.Upload_WP_international.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Workpermit Document Upload Successfully");
		System.out.println("-------------------------------------");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit_expiry_international));
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry_international.click();
		Basic.Set_Expiry();
		System.out.println("Workpermit Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_WorkPermit_expiry_international.getText());
		
		
		
		ObjectsReporsitory.statutoryDetails_labour_international.click();
		ObjectsReporsitory.statutoryDetails_labour_international.clear();
		ObjectsReporsitory.statutoryDetails_labour_international.click();

		Random rnd4 = new Random();
		long number3 = rnd4.nextInt(1234567892);
		long number4 = rnd4.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_labour_international.sendKeys("" + number3 + number4);
		System.out.println("Labour Card Number :" + ObjectsReporsitory.statutoryDetails_labour_international.getAttribute("value"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_labour_international));
		ObjectsReporsitory.Upload_labour_international.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Labour card Document Upload Successfully");
		System.out.println("-------------------------------------");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour_expiry_international));
		ObjectsReporsitory.statutoryDetails_labour_expiry_international.click();
		Basic.Set_Expiry();
		System.out.println("Labour card Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_labour_expiry_international.getText());
		
		
//		ObjectsReporsitory.Passport_international.click();
//		ObjectsReporsitory.Passport_international.clear();
//		ObjectsReporsitory.Passport_international.click();
//
//		Random rnd5 = new Random();
//		long number5 = rnd5.nextInt(1234567892);
//		long number6 = rnd5.nextInt(328525641);
//		ObjectsReporsitory.Passport_international.sendKeys("" + number5 + number6);
//		System.out.println("Passport Number :" + ObjectsReporsitory.Passport_international.getAttribute("value"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_Passport_international));
		ObjectsReporsitory.Upload_Passport_international.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Passport Upload Successfully");
		System.out.println("-------------------------------------");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_Passport_expiry_international));
		ObjectsReporsitory.statutoryDetails_Passport_expiry_international.click();
		Basic.Set_Expiry();
		System.out.println("Passport Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_Passport_expiry_international.getText());
		
		
		Statutory.Verify_User_can_able_save_Statutory_Details();
		Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
		Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();
		
//		Statutory.Verify_User_can_able_to_Add_VisaProID();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_VisaProID();
//		Statutory.Verify_User_can_able_to_Add_Visa_number();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_visa();
//		Statutory.Verify_User_can_able_to_Add_PF_No();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_PF();
//		Statutory.Verify_User_can_able_to_Add_UAN_No();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_UAN();
//		Statutory.Verify_User_can_able_to_Add_ESI_No();
//		Statutory.Verify_User_can_able_to_upload_attachment_for_ESI();
//		Statutory.Verify_User_can_able_save_Statutory_Details();
//		Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
//		Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();
		ObjectsReporsitory.Induction_bankDetails.click();
		System.out.println("Navigated to Bank");
		Thread.sleep(3000);

	}
	
	@Then("^Verify user can able to Fill Bank Details$")
	public static void Verify_user_can_able_to_Fill_Bank_Details() throws Throwable {
		
		Bank.Verify_user_can_able_to_add_Bank_Account_name();
		Bank.Verify_user_can_able_to_add_Bank_Account_Number();
		Bank.Verify_user_can_able_to_add_Bank_Account_Type();
		Bank.Verify_user_can_able_to_add_Bank_Account_Details();
		
	}
	
	@Then("^Verify user can able to Save and Submit Workmen Details$")
	public static void Verify_user_can_able_to_Save_and_Submit_Workmen_Details () throws Throwable {
		
		Submit_Workman_Details.Verify_save_and_submit_workman_details();
	}
}
