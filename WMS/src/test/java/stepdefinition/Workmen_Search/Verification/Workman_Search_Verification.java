package stepdefinition.Workmen_Search.Verification;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic;
import stepdefinition.Induction_Dashboard.View_Profile;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class Workman_Search_Verification {

	public static int Search_Aadhaar_Number;
	public static int Skill_Analyisis_Count;
	public static int Skill_Card_Count;
	public static String Skill_Analyisis_Value;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static int Paramedics_Count;
	public static int Paramedics_Card_Count;
	public static String Paramedics_Value;

// Page Factory
	public Workman_Search_Verification() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
	
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify Error message dipsplayed if aadhaar number is not filled$")
	public static void Verify_Error_message_dipsplayed_if_aadhaar_number_is_not_filled() throws Throwable {

		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.Error_popup_validation();
	}

	@Then("^Verify Error message dipsplayed if Workmen number is not filled$")
	public static void Verify_Error_message_dipsplayed_if_Workmen_number_is_not_filled() throws Throwable {

		System.out.println("Search workmen by WorkmenID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

	@Then("^Verify Error message dipsplayed if name and father name are not filled$")
	public static void Verify_Error_message_dipsplayed_if_name_and_father_name_are_not_filled() throws Throwable {

		System.out.println("Search workmen by Name / Father's name");
		System.out.println("==============================");
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
				System.out.println("Search Workmen By Option Workmen Name is Not displayed");
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.Error_popup_validation();
	}

	@Then("^Verify Error message dipsplayed if visaproID is not filled$")
	public static void Verify_Error_message_dipsplayed_if_visaproID_is_not_filled() throws Throwable {

		System.out.println("Search workmen by VisaproID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.Error_popup_validation();

	}

	@Then("^Verify Error message dipsplayed if Passport number is not filled$")
	public static void Verify_Error_message_dipsplayed_if_Passport_number_is_not_filled() throws Throwable {

		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.Error_popup_validation_Reg();

	}

	// Boundary Min

	@Then("^Verify Error message dipsplayed if aadhaar number is filled with min boundary value$")
	public static void Verify_Error_message_dipsplayed_if_aadhaar_number_is_Filled_with_Min_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();

		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.clear();
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Min());

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.Error_popup_validation();
	}

	@Then("^Verify Error message dipsplayed if Workmen number is filled with min boundary value$")
	public static void Verify_Error_message_dipsplayed_if_Workmen_number_is_Filled_with_Min_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by WorkmenID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();

		ObjectsReporsitory.Dashboard_employeeId.click();
		ObjectsReporsitory.Dashboard_employeeId.clear();
		ObjectsReporsitory.Dashboard_employeeId.click();
		ObjectsReporsitory.Dashboard_employeeId.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Min());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

	@Then("^Verify Error message dipsplayed if name and father name are filled with min boundary value$")
	public static void Verify_Error_message_dipsplayed_if_name_and_father_name_are_Filled_with_Min_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by Name / Father's name");
		System.out.println("==============================");
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
				System.out.println("Search Workmen By Option Workmen Name is Not displayed");
			}
		}
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Min());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.Error_popup_validation();
	}

	@Then("^Verify Error message dipsplayed if visaproID is filled with min boundary value$")
	public static void Verify_Error_message_dipsplayed_if_visaproID_is_Filled_with_Min_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by VisaproID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID.click();

		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.clear();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Min());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation();

	}

	@Then("^Verify Error message dipsplayed if Passport number is filled with min boundary value$")
	public static void Verify_Error_message_dipsplayed_if_Passport_number_is_Filled_with_Min_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();

		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Min());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

	// Boundary Max

	@Then("^Verify Error message dipsplayed if aadhaar number is filled with max boundary value$")
	public static void Verify_Error_message_dipsplayed_if_aadhaar_number_is_Filled_with_max_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();

		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.clear();
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Max());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_employeeAadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);
		System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of aadhaar Number");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();
	}

	@Then("^Verify Error message dipsplayed if Workmen number is filled with max boundary value$")
	public static void Verify_Error_message_dipsplayed_if_Workmen_number_is_Filled_with_max_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by WorkmenID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();

		ObjectsReporsitory.Dashboard_employeeId.click();
		ObjectsReporsitory.Dashboard_employeeId.clear();
		ObjectsReporsitory.Dashboard_employeeId.click();
		ObjectsReporsitory.Dashboard_employeeId.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Max());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_employeeId.getAttribute("value").length();
		System.out.println("Length of the Workmen Number : " + Search_Aadhaar_Number);
		System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Workmen Number");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

	@Then("^Verify Error message dipsplayed if name and father name are filled with max boundary value$")
	public static void Verify_Error_message_dipsplayed_if_name_and_father_name_are_Filled_with_max_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by Name / Father's name");
		System.out.println("==============================");
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
				System.out.println("Search Workmen By Option Workmen Name is Not displayed");
			}
		}
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Max());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_SearchWorkmen_Name.getAttribute("value").length();
		System.out.println("Length of the Workmen Name : " + Search_Aadhaar_Number);
		System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Name");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.Error_popup_validation();
	}

	@Then("^Verify Error message dipsplayed if visaproID is filled with max boundary value$")
	public static void Verify_Error_message_dipsplayed_if_visaproID_is_Filled_with_max_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by VisaproID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.clear();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Max());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.getAttribute("value").length();
		System.out.println("Length of the VIsapro Number : " + Search_Aadhaar_Number);
		System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of VisaproID");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation();

	}

	@Then("^Verify Error message dipsplayed if Passport number is filled with max boundary value$")
	public static void Verify_Error_message_dipsplayed_if_Passport_number_is_Filled_with_max_boundary_Value()
			throws Throwable {

		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_boundary_Max());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.getAttribute("value")
				.length();
		System.out.println("Length of the Passport Number : " + Search_Aadhaar_Number);
		System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Passport");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

//Special Char

	@Then("^Verify Error message dipsplayed if aadhaar number is filled with Special Charectors$")
	public static void Verify_Error_message_dipsplayed_if_aadhaar_number_is_Filled_with_Special_Charectors()
			throws Throwable {

		System.out.println("Search workmen by Aadhar");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_Aadhar.click();

		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.clear();
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_Special_Char());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_employeeAadhaar.getAttribute("value").length();
		System.out.println("Length of the Aadhaar Number : " + Search_Aadhaar_Number);

		if (Search_Aadhaar_Number > 0) {
			System.out.println("Application Allowing Special Char in Addhaar input field");
			System.out.println(
					"Application Allows only " + Search_Aadhaar_Number + " Digits of aadhaar Number as special Char");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Application Does't allow Special Char in Addhar Field");
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();
	}

	@Then("^Verify Error message dipsplayed if Workmen number is filled with Special Charectors$")
	public static void Verify_Error_message_dipsplayed_if_Workmen_number_is_Filled_with_Special_Charectors()
			throws Throwable {

		System.out.println("Search workmen by WorkmenID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_WorkmenID.click();

		ObjectsReporsitory.Dashboard_employeeId.click();
		ObjectsReporsitory.Dashboard_employeeId.clear();
		ObjectsReporsitory.Dashboard_employeeId.click();
		ObjectsReporsitory.Dashboard_employeeId.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_Special_Char());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_employeeId.getAttribute("value").length();
		System.out.println("Length of the Workmen Number : " + Search_Aadhaar_Number);
		
		if (Search_Aadhaar_Number > 0) {
			System.out.println("Application Allowing Special Char in Workmen number input field");
			System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Workmen Number as special Char");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Application Does't allow Special Char in Workmen Number Field");
		}


		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

	@Then("^Verify Error message dipsplayed if name and father name are filled with Special Charectors$")
	public static void Verify_Error_message_dipsplayed_if_name_and_father_name_are_Filled_with_Special_Charectors()
			throws Throwable {

		System.out.println("Search workmen by Name / Father's name");
		System.out.println("==============================");
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
				System.out.println("Search Workmen By Option Workmen Name is Not displayed");
			}
		}
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_Special_Char());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_SearchWorkmen_Name.getAttribute("value").length();
		System.out.println("Length of the Workmen Name : " + Search_Aadhaar_Number);

		
		if (Search_Aadhaar_Number > 0) {
			System.out.println("Application Allowing Special Char in Workmen Name input field");
			System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Workmen Name as special Char");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Application Does't allow Special Char in Workmen Name Field");
		}

		

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		View_Profile.Search_workmen_by_Name_multiple();
		Basic.Error_popup_validation();
	}

	@Then("^Verify Error message dipsplayed if visaproID is filled with Special Charectors$")
	public static void Verify_Error_message_dipsplayed_if_visaproID_is_Filled_with_Special_Charectors()
			throws Throwable {

		System.out.println("Search workmen by VisaproID");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.clear();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.click();
		ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_Special_Char());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_SearchBy_VisaproID_input.getAttribute("value").length();
		System.out.println("Length of the VIsapro Number : " + Search_Aadhaar_Number);
		
	
		if (Search_Aadhaar_Number > 0) {
			System.out.println("Application Allowing Special Char in Workmen VIsaproID input field");
			System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Workmen VIsaproID as special Char");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Application Does't allow Special Char in Workmen VIsaproID Field");
		}
		

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation();

	}

	@Then("^Verify Error message dipsplayed if Passport number is filled with Special Charectors$")
	public static void Verify_Error_message_dipsplayed_if_Passport_number_is_Filled_with_Special_Charectors()
			throws Throwable {

		System.out.println("Search workmen by Passport Number");
		System.out.println("==============================");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchBy_select));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Dashboard_SearchBy_select);
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input
				.sendKeys(ConfigFileReader.getVerification_WorkmenSaerch_Special_Char());

		Search_Aadhaar_Number = ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.getAttribute("value")
				.length();
		System.out.println("Length of the Passport Number : " + Search_Aadhaar_Number);
		
		
		if (Search_Aadhaar_Number > 0) {
			System.out.println("Application Allowing Special Char in Workmen Passport input field");
			System.out.println("Application Allows only " + Search_Aadhaar_Number + " Digits of Workmen Passport as special Char");
			System.out.println("----------------------------------------------------------------------");
		} else {
			System.out.println("Application Does't allow Special Char in Workmen Passport Field");
		}
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.PageLoader_Validation();
		Basic.Error_popup_validation_Reg();

	}

}
