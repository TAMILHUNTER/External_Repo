package stepdefinition.Job_Switch.Verification;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class SwitchJob_Verification {

	public static int popup_validation;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify Error message dipsplayed if user select job code that user does not have access$")
	public static void Verify_Error_message_dipsplayed_if_user_select_job_code_that_user_does_not_have_access()
			throws Throwable {
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		System.out.println("Current Job : " + Current_job);
		System.out.println("Switching job to : " + ConfigFileReader.getswitchJob_Verification());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Edit_job));
		ObjectsReporsitory.Induction_Edit_job.click();
		ObjectsReporsitory.Induction_Edit_job_dr.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.clear();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.click();
		ObjectsReporsitory.Induction_Jobcode_Dashboard.sendKeys(ConfigFileReader.getswitchJob_Verification());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_Save_Job));
		ObjectsReporsitory.Induction_Save_Job.click();
		Thread.sleep(5000);
		Basic.Error_popup_validation();
	}

}
