package stepdefinition.Final_Approval.Create;

import java.time.Duration;
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
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import stepdefinition.Induction_Dashboard.Profile_Basic;
import stepdefinition.Induction_Dashboard.Profile_EHS;
import stepdefinition.Induction_Dashboard.Profile_Medical_test;
import stepdefinition.Induction_Dashboard.Profile_Skill_Analysis;
import stepdefinition.Induction_Dashboard.Profile_Wage;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Final_Approval {

	public static int FA_Count;
	public static int FA_Workmen_Count;
	public static String Selected_Eye;
	public static String Selected_Workmen_Profile;
	public static String Selected_Workmen_Profile_Count;

	// Page Factory
	public Final_Approval() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************
	public static ConfigFileReader configFileReader;

	@Given("^Login and Navigate to Final Approval$")
	public static void Login_and_Navigate_to_Final_Approval() throws Throwable {

		Login.Induction_Approver_login();
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
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_finalApproval));
		Thread.sleep(5000);
		FA_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_FA_Count.getText());
		ObjectsReporsitory.Induction_finalApproval.click();

		FA_Workmen_Count = ObjectsReporsitory.FA_Workmen_Count_AllElements.size();
		System.out.println("Workmen Count in Dashboard for Final Approval : " + FA_Count);
		System.out.println("Workmen Count in Final Approval : " + FA_Workmen_Count);
		System.out.println("-------------------------------------------------------");
		if (FA_Count == FA_Workmen_Count) {
			System.out.println("Workmen Count in Dashboard & Workman Count in Final Approval are Matched");
			System.out.println("-------------------------------------------------------");
		} else {
			System.out
					.println("**Error : Workmen Count in Dashboard & Workman Count in Final Approval are Not Matched");
			System.out.println("-------------------------------------------------------");
		}
		System.out.println("Count : " + FA_Workmen_Count);
//		if (FA_Workmen_Count > 0) {
//			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
//			System.out.println("Navigated to EHS");
//		} 
	}

	@Then("^Verify User can be able to Expand and Collapse final approval window$")
	public static void Verify_User_can_be_able_to_Expand_Collapse_final_approval_window() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_Expand));
		ObjectsReporsitory.FA_Expand.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_collapse));
		Screenshot.Screenshotforscenario();
		System.out.println("Final Approval window expanded");
		ObjectsReporsitory.FA_collapse.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_Expand));
		System.out.println("Final Approval window Collapsed");

	}

	@Then("^Verify User can be able to View Workmen profile FA$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile_Wage() throws Throwable {

		List<WebElement> Workmen_Eye = ObjectsReporsitory.FA_Workmen_Prifile_Eye_AllElements;
		Random rand_Eye = new Random();
		int Eye = rand_Eye.nextInt(ObjectsReporsitory.FA_Workmen_Prifile_Eye_AllElements.size());
		Selected_Eye = ObjectsReporsitory.FA_Workmen_Prifile_Eye_AllElements.get(Eye).getText();

		for (WebElement webElement : Workmen_Eye) {
			if (webElement.getText().equals(Selected_Eye)) {
				webElement.click();
				System.out.println("Workmen Profile Selected");
				break;
			}
		}
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify Basic details in Workmen profile are displayed correctly FA$")
	public static void Verify_Basic_in_details_Workmen_profile_are_displayed_correctly_FA() throws Throwable {

		Profile_Basic.verify_workman_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Father_name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_DOB_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Gender_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Blood_Group_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Languages_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Marital_Status_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Spouse_Name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_No_Of_Childrens_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Enabled_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Number_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_details_is_displayed();
		Profile_Basic.verify_Partner_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_address_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Contact_number_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Email_ID_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.verify_Mobile_Number_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Emergency_Contact_Name_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Relationship_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Mobile_Number_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Address_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Village_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_District_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_State_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_PinCode_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Category_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Group_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Description_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Type_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Deployment_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Qualification_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Branch_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Discipline_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_School_or_College_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Board_or_University_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Year_of_Passing_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Organisation_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Location_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Code_or_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Category_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Group_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Description_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Aadhar_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Driving_License_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PAN_Card_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PF_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_UAN_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_ESI_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Name_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Relationship_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Allocation_Percentage_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_Name_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_No_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_IFSC_Or_IBAN_or_SWIFT_Code_in_Bank_Details_are_displayed_correctly_in_profile();

	}

	@Then("^Verify Skill Analysis in Workmen profile are displayed correctly FA$")
	public static void Verify_Skill_Analysis_in_Workmen_profile_are_displayed_correctly_FA() throws Throwable {
		Profile_Skill_Analysis.verify_Skill_Description_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Project_Description_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Skill_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Percentage_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Test_Taken_on_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Status_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Restest_Date_in_Skill_Analysis_are_displayed_correctly_in_profile();

	}

	@Then("^Verify Medical Test in Workmen profile are displayed correctly FA$")
	public static void Verify_Medical_Test_in_Workmen_profile_are_displayed_correctly_FA() throws Throwable {
		Profile_Medical_test.verify_Medicaltest_Due_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Skin_Temperature_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diabetics_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_SPO2_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Systolic_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diastolic_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Height_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Weight_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_BMI_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Identification_Marks_1_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Identification_Marks_2_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Heart_Rate_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_the_secound_Skin_Temperature_in_Medical_Test_is_displayed_correctly_in_profile();
		Profile_Medical_test.verify_BP_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Varicose_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Seizure_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Vertigo_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Acrophobia_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diabetes_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Stroke_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Heart_Disease_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Major_Illness_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Respiratory_Diseases_in_Medical_Test_are_displayed_correctly_in_profile();

	}

	@Then("^Verify EHS in Workmen profile are displayed correctly FA$")
	public static void Verify_EHS_in_Workmen_profile_are_displayed_correctly_FA() throws Throwable {
		Profile_EHS.verify_Skill_Description_in_EHS_are_displayed_correctly_in_profile();
		Profile_EHS.verify_job_in_EHS_are_displayed_correctly_in_profile();
		Profile_EHS.verify_Training_Date_in_EHS_are_displayed_correctly_in_profile();
	}

	@Then("^Verify Wage in Workmen profile are displayed correctly FA$")
	public static void Verify_Wage_in_Workmen_profile_are_displayed_correctly_FA() throws Throwable {
		Profile_Wage.verify_Wage_details_are_displayed_correctly_in_profile();
		Actions actions = new Actions(DriverFactory.driver);
		actions.sendKeys(Keys.ESCAPE);
		actions.perform();

	}

	@Then("^Verify User can be able to Select Workmen Profile$")
	public static void Verify_User_can_be_able_to_Select_Workmen_Profile() throws Throwable {

		List<WebElement> Workmen_Profile_Select = ObjectsReporsitory.FA_Workmen_Prifile_AllElements;
		Random rand_Workmen_Profile_Select = new Random();
		int Workmen_Profile = rand_Workmen_Profile_Select
				.nextInt(ObjectsReporsitory.FA_Workmen_Prifile_AllElements.size());
		Selected_Workmen_Profile = ObjectsReporsitory.FA_Workmen_Prifile_AllElements.get(Workmen_Profile).getText();

		for (WebElement webElement : Workmen_Profile_Select) {
			if (webElement.getText().equals(Selected_Workmen_Profile)) {
				webElement.click();
				System.out.println("Workmen Profile Selected :" + Selected_Workmen_Profile);
				break;
			}
		}
		Screenshot.Screenshotforscenario();

		@SuppressWarnings("unused")
		boolean checkboxselected = ObjectsReporsitory.FA_Workmen_Prifile_AllElements.get(Workmen_Profile).isSelected();
		if (checkboxselected = true) {
			System.out.println("CheckBox is Selected - Workmen Profile Selected for Final Approval");
			System.out.println("--------------------------------------------------------");
		} else {
			System.out.println("CheckBox is not Selected yet");
			System.out.println("-----------------------------");
			Final_Approval.Verify_User_can_be_able_to_Select_Workmen_Profile();
		}

	}

	@Then("^Verify Selected Workmen Profile Count Displayed$")
	public static void Verify_Selected_Workmen_Profile_Count_Displayed() throws Throwable {
		Selected_Workmen_Profile_Count = ObjectsReporsitory.FA_Workmen_Prifile_Selected.getText();
		System.out.println("" + Selected_Workmen_Profile_Count);
		System.out.println("-------------------------------");
	}

	@Then("^Verify User can be able to Approve Induction details of Selected Workmen Profile$")
	public static void Verify_User_can_be_able_to_Approve_Induction_details_of_Slected_Workmen_Profile()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.FA_Submit));
		ObjectsReporsitory.FA_Submit.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
	}
}
