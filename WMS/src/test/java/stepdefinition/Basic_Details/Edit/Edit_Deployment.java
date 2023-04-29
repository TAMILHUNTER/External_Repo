package stepdefinition.Basic_Details.Edit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Create.Deployment;
import stepdefinition.Basic;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Edit_Deployment {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Deployment() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to deployemnt$")
	public static void Select_Workman_and_Navigate_to_Skill() throws Throwable {

		Edit_Skill.Select_Workman_and_Navigate_to_Skill();
		ObjectsReporsitory.Induction_skillDeployment.click();
		Actions actions532 = new Actions(DriverFactory.driver);
		actions532.moveToElement(ObjectsReporsitory.deployment_Picker);
		actions532.perform();
		System.out.println("Navigated to Deployment");
	}
	
	@Then("^Verify user can able to Edit deployemnt$")
	public static void Verify_user_can_able_to_Edit_deployemnt() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.deployment_Picker));
		ObjectsReporsitory.deployment_Picker.click();
		try {
			if (ObjectsReporsitory.deployment_Tree_Checked_First.isSelected()) {
				System.out.println("Deployement Tree already Selected");
			} else {
				ObjectsReporsitory.deployment_Tree_Checked_First.click();
			}
		} catch (Exception e) {
			System.out.println("No Deployement Tree Found for the User Job");
		}
		
		Actions actions50 = new Actions(DriverFactory.driver);
		actions50.moveToElement(ObjectsReporsitory.deployment_save);
		actions50.perform();
		ObjectsReporsitory.deployment_save.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		
		ObjectsReporsitory.Induction_skillDeployment.click();
		Actions actions51 = new Actions(DriverFactory.driver);
		actions51.moveToElement(ObjectsReporsitory.Education_Header);
		actions51.perform();
		Deployment.Verify_user_can_able_to_click_deployemnt();
		Deployment.Verify_user_can_able_to_select_deployemnt_from_tree();
		
		Deployment.Verify_user_can_able_to_save_deployemnt();
		DataBaseConnection.getdeployment();
	}

}