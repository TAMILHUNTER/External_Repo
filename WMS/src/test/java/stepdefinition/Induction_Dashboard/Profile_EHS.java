package stepdefinition.Induction_Dashboard;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
//import object_repository.WorkmenProfile;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
public class Profile_EHS {

// Page Factory
	public Profile_EHS() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
		//PageFactory.initElements(DriverFactory.driver, WorkmenProfile.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^verify Skill Description in EHS are displayed correctly in profile")
	public static void verify_Skill_Description_in_EHS_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_EHS);		//Skill_Analysis_Objects.Profile_EHS.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_EHS_Skill_desc.getText().equals("No records available.")) {
			System.out.println("Workmen EHS not Completed Yet- Skill Description Details Not Available");
		}

		else {
			System.out.println("Skill Description  : " + Skill_Analysis_Objects.Profile_EHS_Skill_desc.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify job in EHS are displayed correctly in profile")
	public static void verify_job_in_EHS_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_EHS);		//Skill_Analysis_Objects.Profile_EHS.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_EHS_Skill_desc.getText().equals("No records available.")) {
			System.out.println("Workmen EHS not Completed Yet- Job Details Not Available");
		}

		else {
			System.out.println("Job  : " + Skill_Analysis_Objects.Profile_EHS_job.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Training Date in EHS are displayed correctly in profile")
	public static void verify_Training_Date_in_EHS_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_EHS);		//Skill_Analysis_Objects.Profile_EHS.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_EHS_Skill_desc.getText().equals("No records available.")) {
			System.out.println("Workmen EHS not Completed Yet- Training Date Details Not Available");
		}

		else {
			System.out.println("Training Date : " + Skill_Analysis_Objects.Profile_EHS_TrainingDate.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();
	}
}
