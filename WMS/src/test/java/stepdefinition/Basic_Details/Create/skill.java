package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class skill {

	public static String Selected_SkillCategory;
	public static String Selected_skillGroup;
	public static String Selected_skillDescription;
	public static String Selected_skillType;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public skill() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication details then navigate to Skill$")
	public static void Fill_Partner_Personal_communication_details_then_navigate_to_Skill() throws Throwable {
		Communication.Fill_Partner_and_Personal_details_then_navigate_to_communication();
		Communication.Verify_user_can_able_to_enter_mobile_number();
		// Communication.Verify_user_can_able_to_enter_pincode();
		Communication.Verify_user_can_able_to_Select_Country();
		Communication.Verify_address_autofetched_based_on_pincode_entered();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege();
		Communication.Verify_user_can_able_to_enter_Temporary_address();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_Name_and_number();
		// Communication.Verify_user_can_able_to_verify_mobile_number_of_Emergency_Contact();
		Communication.Verify_user_can_able_to_select_relationship_with_employee();
		Communication.Verify_user_can_able_to_enter_Emergency_Contact_address_pincode();
		Communication.Verify_address_autofetched_based_on_pincode_entered_for_Emergency_Contact();
		Communication.Verify_user_can_able_to_enter_address_and_select_villege_for_Emergency_Contact();
		Communication.Verify_user_can_able_to_save_communication_details();
		System.out.println("Navigated to Skill");
	}

	@Then("^Verify user can able to select skill category$")
	public static void Verify_user_can_able_to_select_skill_category() throws Throwable {
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.skill_save);
		actions.perform();
		ObjectsReporsitory.skillCategory.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillCategory_DR;

		if (ConfigFileReader.getselect_skillCategory_Value().contains("Random")) {
			System.out.println("Selecting Random skillCategory");
			Random rand7852 = new Random();
			int skillCategory = rand7852.nextInt(ObjectsReporsitory.skillCategory_DR.size());
			Selected_SkillCategory = ObjectsReporsitory.skillCategory_DR.get(skillCategory).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_SkillCategory)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(
							ObjectsReporsitory.skillCategory.getAttribute("value") + " : skillCategory Selected ");
					break;
				}
			}

		} else {

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkill_Category())) {
					webElement.click();
					System.out.println("Skill Category:" + ConfigFileReader.getSkill_Category());
					break;
				}
			}
		}
	}

	@Then("^Verify user can able to select skill group$")
	public static void Verify_user_can_able_to_select_skill_group() throws Throwable {
		ObjectsReporsitory.skillGroup.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillGroup_DR;

		if (ConfigFileReader.getselect_skillGroup_Value().contains("Random")) {
			System.out.println("Selecting Random skillGroup");
			Random rand7852 = new Random();
			int skillGroup = rand7852.nextInt(ObjectsReporsitory.skillGroup_DR.size());
			Selected_skillGroup = ObjectsReporsitory.skillGroup_DR.get(skillGroup).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_skillGroup)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(ObjectsReporsitory.skillGroup.getAttribute("value") + " : skillGroup Selected ");
					break;
				}
			}

		} else {

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkill_Group())) {
					webElement.click();
					System.out.println("Skill Group:" + ConfigFileReader.getSkill_Group());
					break;
				}
			}

		}
		// Need to validate with DB
	}

	@Then("^Verify user can able to select skill description$")
	public static void Verify_user_can_able_to_select_skill_description() throws Throwable {
		ObjectsReporsitory.skillDescription.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillDescription_DR;
		if (ConfigFileReader.getselect_skillDescription_Value().contains("Random")) {
			System.out.println("Selecting Random skillDescription");
			Random rand7852 = new Random();
			int skillDescription = rand7852.nextInt(ObjectsReporsitory.skillDescription_DR.size());
			Selected_skillDescription = ObjectsReporsitory.skillDescription_DR.get(skillDescription).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_skillDescription)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(ObjectsReporsitory.skillDescription.getAttribute("value")
							+ " : skillDescription Selected ");
					break;
				}
			}

		} else {
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkill_Description())) {
					webElement.click();
					System.out.println("Skill Description:" + ConfigFileReader.getSkill_Description());
					break;
				}
			}
		}
		// Need to validate with DB
	}

	@Then("^Verify user can able to select skill Type$")
	public static void Verify_user_can_able_to_select_skill_Type() throws Throwable {
		ObjectsReporsitory.skillType.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.skillType_DR;
		if (ConfigFileReader.getselect_skillType_Value().contains("Random")) {
			System.out.println("Selecting Random skillType");
			Random rand7852 = new Random();
			int skillType = rand7852.nextInt(ObjectsReporsitory.skillType_DR.size());
			Selected_skillType = ObjectsReporsitory.skillType_DR.get(skillType).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_skillType)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(ObjectsReporsitory.skillType.getAttribute("value") + " : skillType Selected ");
					break;
				}
			}

		} else {
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkill_Type())) {
					webElement.click();
					System.out.println("Skill Description:" + ConfigFileReader.getSkill_Type());
					break;
				}
			}
		}
	}

	@Then("^Verify user can able to save skill$")
	public static void Verify_user_can_able_to_save_skill() throws Throwable {
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.deployment_Header);
		actions.perform();
		ObjectsReporsitory.skill_save.click();
		Screenshot.Screenshotforscenario();
		Basic.PageLoader_Validation();
		Basic.popup_handle();
	}
}
