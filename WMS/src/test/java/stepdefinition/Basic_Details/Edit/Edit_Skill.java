package stepdefinition.Basic_Details.Edit;

import static org.junit.Assert.fail;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Edit_Skill {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Skill() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Skill$")
	public static void Select_Workman_and_Navigate_to_Skill() throws Throwable {

		Edit_Communication_Details.Select_Workman_and_Navigate_to_Communication();
		ObjectsReporsitory.Induction_skillDeployment.click();
		System.out.println("Navigated to Skill");
	}
	

	@Then("^Verify user can able to update skill Category$")
	public static void Verify_user_can_able_to_update_skill_Category() throws Throwable {
		ObjectsReporsitory.skillCategory_value.clear();
		ObjectsReporsitory.skillCategory_value.sendKeys(ConfigFileReader.getSkill_Category_Update());
		;
		List<WebElement> DropdownResult = ObjectsReporsitory.skillCategory_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkill_Category_Update())) {
				webElement.click();
				System.out.println("Skill Category:" + ConfigFileReader.getSkill_Category_Update());
				break;
			}
		}

		actions.moveToElement(ObjectsReporsitory.deployment_Header);
		actions.perform();
		ObjectsReporsitory.skill_save.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getSkillCategoryUpdate();
	}

	@Then("^Verify user can able to update skill Group$")
	public static void Verify_user_can_able_to_update_skill_Group() throws Throwable {
		ObjectsReporsitory.skillGroup_value.clear();
		ObjectsReporsitory.skillGroup_value.sendKeys(ConfigFileReader.getSkill_Group_Update());
		;
		List<WebElement> DropdownResult = ObjectsReporsitory.skillGroup_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkill_Group_Update())) {
				webElement.click();
				System.out.println("Skill Group:" + ConfigFileReader.getSkill_Group_Update());
				break;
			}
		}

		actions.moveToElement(ObjectsReporsitory.deployment_Header);
		actions.perform();
		ObjectsReporsitory.skill_save.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getSkillGroupUpdate();
	}

	@Then("^Verify user can able to update skill Description$")
	public static void Verify_user_can_able_to_update_skill_Description() throws Throwable {
		ObjectsReporsitory.skillDesc_value.clear();
		ObjectsReporsitory.skillDesc_value.sendKeys(ConfigFileReader.getSkill_Description_Update());
		;
		List<WebElement> DropdownResult = ObjectsReporsitory.skillDescription_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkill_Description_Update())) {
				webElement.click();
				System.out.println("Skill Desc:" + ConfigFileReader.getSkill_Description_Update());
				break;
			}
		}

		actions.moveToElement(ObjectsReporsitory.deployment_Header);
		actions.perform();
		ObjectsReporsitory.skill_save.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getSkillDescUpdate();
	}

	@Then("^Verify user can able to update skill Type$")
	public static void Verify_user_can_able_to_update_skill_Type() throws Throwable {

		if (ObjectsReporsitory.skillType_value.getAttribute("value").equals("19 - Skilled")) {
			ObjectsReporsitory.skillType_value.clear();
			ObjectsReporsitory.skillType_value.sendKeys("20 - UnSkilled");
			List<WebElement> DropdownResult = ObjectsReporsitory.skillType_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals("20 - UnSkilled")) {
					webElement.click();
					System.out.println("Skill Type: 20 - UnSkilled");
					break;
				}
			}
		} else if (ObjectsReporsitory.skillType_value.getAttribute("value").equals("20 - UnSkilled")) {
			ObjectsReporsitory.skillType_value.clear();
			ObjectsReporsitory.skillType_value.sendKeys("21 - Semi Skilled");
			List<WebElement> DropdownResult = ObjectsReporsitory.skillType_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals("21 - Semi Skilled")) {
					webElement.click();
					System.out.println("Skill Type: 21 - Semi Skilled");
					break;
				}
			}
		} else if (ObjectsReporsitory.skillType_value.getAttribute("value").equals("21 - Semi Skilled")) {
			ObjectsReporsitory.skillType_value.clear();
			ObjectsReporsitory.skillType_value.sendKeys("19 - Skilled");
			List<WebElement> DropdownResult = ObjectsReporsitory.skillType_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals("19 - Skilled")) {
					webElement.click();
					System.out.println("Skill Type: 19 - Skilled");
					break;
				}
			}
		} else {
			System.out.println("Skill Type is Empty");
			fail();
		}

		actions.moveToElement(ObjectsReporsitory.deployment_Header);
		actions.perform();
		ObjectsReporsitory.skill_save.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getSkillTypeUpdate();

	}
}