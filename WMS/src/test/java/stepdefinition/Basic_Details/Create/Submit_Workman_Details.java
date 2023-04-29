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

}
