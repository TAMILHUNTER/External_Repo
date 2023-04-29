package stepdefinition.Induction_Dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
//import object_repository.WorkmenProfile;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class Profile_Skill_Analysis {

// Page Factory
	public Profile_Skill_Analysis() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
		//PageFactory.initElements(DriverFactory.driver, WorkmenProfile.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^verify Skill Description in Skill Analysis are displayed correctly in profile")
	public static void verify_Skill_Description_in_Skill_Analysis_are_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);
		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Skill Description Not Available");
		}

		else {
			System.out.println("Skill Description : " + Skill_Analysis_Objects.Profile_Skill_Description.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Project Description in Skill Analysis are displayed correctly in profile")
	public static void verify_Project_Description_in_Skill_Analysis_are_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Project Description Not Available");
		}

		else {
			System.out.println("Project Description : " + Skill_Analysis_Objects.Profile_Skill_Project_Description.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Skill in Skill Analysis are displayed correctly in profile")
	public static void verify_Skill_in_Skill_Analysis_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Skill Not Available");
		}

		else {
			System.out.println("Skill Type : " + Skill_Analysis_Objects.Profile_Skill_SkillType.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Percentage in Skill Analysis are displayed correctly in profile")
	public static void verify_Percentage_in_Skill_Analysis_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Percentage Not Available ");
		}

		else {
			System.out.println("Percentage : " + Skill_Analysis_Objects.Profile_Skill_Percentage.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Test Taken on in Skill Analysis are displayed correctly in profile")
	public static void verify_Test_Taken_on_in_Skill_Analysis_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Test Taken Not Available");
		}

		else {
			System.out.println("Test Taken on : " + Skill_Analysis_Objects.Profile_Skill_TestTakenOn.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Status in Skill Analysis are displayed correctly in profile")
	public static void verify_Status_in_Skill_Analysis_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Status Not Available");
		}

		else {
			System.out.println("Status : " + Skill_Analysis_Objects.Profile_Skill_Status.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Restest Date in Skill Analysis are displayed correctly in profile")
	public static void verify_Restest_Date_in_Skill_Analysis_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", Skill_Analysis_Objects.Profile_Skill_Analysis);		//Skill_Analysis_Objects.Profile_Skill_Analysis.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Skill_Description.getText().equals("No records available.")) {
			System.out.println("Workmen Skill not yet Analysed - Retest Date Not Available");
		}

		else {
			System.out.println("Restest Date : " + Skill_Analysis_Objects.Profile_Skill_RetestDate.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();
	}
}
