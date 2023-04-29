package stepdefinition.Basic_Details.Create;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Deployment {

	public static String Selected_Deployment;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Deployment() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication Skill details then navigate to Deployment$")
	public static void Fill_Partner_Personal_communication_Skill_details_then_navigate_to_Deployment()
			throws Throwable {

		skill.Fill_Partner_Personal_communication_details_then_navigate_to_Skill();
		skill.Verify_user_can_able_to_select_skill_category();
		skill.Verify_user_can_able_to_select_skill_group();
		skill.Verify_user_can_able_to_select_skill_description();
		skill.Verify_user_can_able_to_select_skill_Type();
		skill.Verify_user_can_able_to_save_skill();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_skillDeployment));
		ObjectsReporsitory.Induction_skillDeployment.click();
		System.out.println("Navigated to Deployment");
//		actions.moveToElement(ObjectsReporsitory.Education_Header);
//		actions.perform();
	}

	@Then("^Verify user can able to click deployemnt$")
	public static void Verify_user_can_able_to_click_deployemnt() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.deployment_Picker));
		ObjectsReporsitory.deployment_Picker.click();
	}

	@Then("^Verify user can able to select deployemnt from tree$")
	public static void Verify_user_can_able_to_select_deployemnt_from_tree() throws Throwable {

//		if(ObjectsReporsitory.deployment_Notexpanded_A.isDisplayed()) {
//			ObjectsReporsitory.deployment_Notexpanded_A.click();
//		}
//		else if(ObjectsReporsitory.deployment_Notexpanded_B.isDisplayed()){
//			ObjectsReporsitory.deployment_Notexpanded_B.click();
//		}
//		List<WebElement> DropdownResult = ObjectsReporsitory.deployment_Tree_List;
//		for (WebElement webElement : DropdownResult) {
//			if (webElement.getText().equals(ConfigFileReader.getDeployment_Tree())) {
//				webElement.click();
//				System.out.println("Deployment Site Selected : " + ConfigFileReader.getDeployment_Tree());
//				break;
//			}
//		}

		try {
			if (ObjectsReporsitory.deployment_Tree_Checked_First.isSelected()) {
				System.out.println("Deployement Tree already Selected");
			} else {
				List<WebElement> DropdownResult = ObjectsReporsitory.deployment_Tree_Checked;

				Random rand654 = new Random();
				int Language1 = rand654.nextInt(ObjectsReporsitory.deployment_Tree_Checked.size());
				Selected_Deployment = ObjectsReporsitory.deployment_Tree_Checked.get(Language1).getText();

				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals(Selected_Deployment)) {
						webElement.click();
						Thread.sleep(3000);
						System.out.println("Selected Language Deployment");
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("-------------------------------");
			System.out.println("Deployement Tree is Selected Now");
		}

	}

	@Then("^Verify user can able to save deployemnt$")
	public static void Verify_user_can_able_to_save_deployemnt() throws Throwable {
		Actions actions50 = new Actions(DriverFactory.driver);
		actions50.moveToElement(ObjectsReporsitory.deployment_save);
		actions50.perform();
		ObjectsReporsitory.deployment_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		Basic.PageLoader_Validation();
	}

	@Then("^Verify user can able to select deployemnt from subtree$")
	public static void Verify_user_can_able_to_select_deployemnt_from_subtree() throws Throwable {

		ObjectsReporsitory.Induction_skillDeployment.click();
		Actions actions51 = new Actions(DriverFactory.driver);
		actions51.moveToElement(ObjectsReporsitory.Education_Header);
		actions51.perform();
		Deployment.Verify_user_can_able_to_click_deployemnt();
		Deployment.Verify_user_can_able_to_select_deployemnt_from_tree();
//		if(ObjectsReporsitory.deployment_Notexpanded_A.isDisplayed()) {
//			ObjectsReporsitory.deployment_Notexpanded_A.click();
//		}
//		else if(ObjectsReporsitory.deployment_Notexpanded_B.isDisplayed()){
//			ObjectsReporsitory.deployment_Notexpanded_B.click();
//		}
//		List<WebElement> DropdownResult = ObjectsReporsitory.deployment_Tree_List;
//		for (WebElement webElement : DropdownResult) {
//			if (webElement.getText().equals(ConfigFileReader.getDeployment_SubTree())) {
//				webElement.click();
//				System.out.println("Deployment Sub Tree Selected : " + ConfigFileReader.getDeployment_SubTree());
//				break;
//			}
//		}

	}

	@Then("^Verify user can able to save deployemnt subtree$")
	public static void Verify_user_can_able_to_save_deployemnt_subtree() throws Throwable {
		Deployment.Verify_user_can_able_to_save_deployemnt();
		Basic.PageLoader_Validation();
	}
}
