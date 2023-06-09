package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
import net.bytebuddy.utility.RandomString;
import io.cucumber.java.en.Given;

public class Experience {

	public static String Selected_ProjectSkill;
	public static String Selected_ProjectSkillDesc;
	public static String Selected_ProjectSkillGroup;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Experience() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication Skill Deployment Education details then navigate to Experience$")
	public static void Fill_Partner_Personal_communication_Skill_Deployment_Education_details_then_navigate_to_Experience()
			throws Throwable {

		Education.Fill_Partner_Personal_communication_Skill_Deployment_details_then_navigate_to_Education();
		Education.Verify_user_can_able_to_add_Education();
		Education.Verify_user_can_able_to_select_Qualification();
		Education.Verify_user_can_able_to_select_Branch_based_on_Qualification_and_enter_discipiline();
		Education.Verify_user_can_able_to_enter_schoolORCollege();
		Education.Verify_user_can_able_to_enter_BoardORUniversity();
		Education.Verify_user_can_able_to_enter_Year_of_Passing();
		Education.Verify_user_can_able_to_save_education();
		// Education.Verify_user_can_able_to_Edit_education();
		// Education.Verify_user_can_able_to_Delete_Education();
	}

	@Then("^Verify user can able to add Experience$")
	public static void Verify_user_can_able_to_add_Experience() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_Side_educationExperience.click();
			Actions actions = new Actions(DriverFactory.driver);
			actions.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions.perform();
			ObjectsReporsitory.Experience_addExperience_btn.click();
		} else if (ConfigFileReader.getExperience_Applicable().equals("No")) {

			ObjectsReporsitory.Experience_Applicable_Checkbox.click();
			System.out.println("Workmen Not Experienced - No Experience History");
		}
	}

	@Then("^Verify user can able to add Duration$")
	public static void Verify_user_can_able_to_add_Duration() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			ObjectsReporsitory.Experience_durationFrom.click();
			ObjectsReporsitory.Experience_durationFrom
					.sendKeys(ConfigFileReader.getExperience1_From_month() + Keys.TAB);
			ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience1_From_Year());
			System.out.println(
					"Experience 1- Worked From :" + ObjectsReporsitory.Experience_durationFrom.getAttribute("value"));
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience1_To_month() + Keys.TAB);
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience1_To_Year());
			System.out.println(
					"Experience 1- Worked To :" + ObjectsReporsitory.Experience_durationTo.getAttribute("value"));
		}
	}

	@Then("^Verify user can able to add Project details$")
	public static void Verify_user_can_able_to_add_Project_details() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			ObjectsReporsitory.Experience_organisation_Location
					.sendKeys(ConfigFileReader.getExperience_OrgLocation() + " " + RandomString.make(10));
			System.out.println("Orgnaizqation Name : "
					+ ObjectsReporsitory.Experience_organisation_Location.getAttribute("value"));
			ObjectsReporsitory.Experience_projectLocation
					.sendKeys(ConfigFileReader.getExperience_ProjectLocation() + " " + RandomString.make(10));
			System.out.println(
					"project Location : " + ObjectsReporsitory.Experience_projectLocation.getAttribute("value"));
			ObjectsReporsitory.Experience_projectCode
					.sendKeys(ConfigFileReader.getExperience_ProjectCode_Name() + " " + RandomString.make(10));
			System.out.println("project Code/Name:" + ObjectsReporsitory.Experience_projectCode.getAttribute("value"));
		}
	}

	@Then("^Verify user can able to add Project Skill$")
	public static void Verify_user_can_able_to_add_Project_Skill() throws Throwable {

		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {

			ObjectsReporsitory.Experience_Skillcatogory.click();
			Thread.sleep(3000);
			List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
			Thread.sleep(3000);
			if (ConfigFileReader.getExperience_Skill_values().contains("Random")) {

				System.out.println("Selecting Random Project Skill");
				Random rand654a7 = new Random();
				int Skillcatogory = rand654a7.nextInt(ObjectsReporsitory.Experience_Skillcatogory_DR.size());
				Selected_ProjectSkill = ObjectsReporsitory.Experience_Skillcatogory_DR.get(Skillcatogory).getText();

				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals(Selected_ProjectSkill)) {
						webElement.click();
						Thread.sleep(3000);
						System.out.println("Selected Project Skill :"
								+ ObjectsReporsitory.Experience_Skillcatogory.getAttribute("value"));
						break;
					}
				}

			} else {
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().contains(ConfigFileReader.getExperience_Skill_Category())) {
						webElement.click();
						System.out.println("Skillcatogory:" + ConfigFileReader.getExperience_Skill_Category());
						break;
					}
				}
			}

			Thread.sleep(3000);

			ObjectsReporsitory.Experience_SkillGroup.click();
			Thread.sleep(3000);
			List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;

			if (ConfigFileReader.getExperience_Skill_values().contains("Random")) {

				System.out.println("Selecting Random Project Skill Group");
				Random rand654aa7 = new Random();
				int SkillGroup = rand654aa7.nextInt(ObjectsReporsitory.Experience_SkillGroup_DR.size());
				Selected_ProjectSkillGroup = ObjectsReporsitory.Experience_SkillGroup_DR.get(SkillGroup).getText();

				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals(Selected_ProjectSkillGroup)) {
						webElement.click();
						Thread.sleep(3000);
						System.out.println("Selected Project Skill Group :"
								+ ObjectsReporsitory.Experience_SkillGroup.getAttribute("value"));
						break;
					}
				}

			} else {

				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().contains(ConfigFileReader.getExperience_Skill_Group())) {
						webElement.click();
						System.out.println("Skill_Group:" + ConfigFileReader.getExperience_Skill_Group());
						break;
					}
				}
			}

			ObjectsReporsitory.Experience_Skilldesc.click();
			Thread.sleep(3000);
			List<WebElement> DropdownResult3 = ObjectsReporsitory.Experience_SkillDesc_DR;
			Thread.sleep(3000);
			if (ConfigFileReader.getExperience_Skill_values().contains("Random")) {

				System.out.println("Selecting Random Project Skill Desc");
				Random randomselection3 = new Random();
				int SkillDesc = randomselection3.nextInt(ObjectsReporsitory.Experience_SkillDesc_DR.size());
				System.out.println("Size of the element : " + ObjectsReporsitory.Experience_SkillDesc_DR.size());

				Selected_ProjectSkillDesc = ObjectsReporsitory.Experience_SkillDesc_DR.get(SkillDesc).getText();

				for (WebElement webElement : DropdownResult3) {
					if (webElement.getText().equals(Selected_ProjectSkillDesc)) {
						webElement.click();
						Thread.sleep(3000);
						System.out.println("Selected Project Skill Desc :"
								+ ObjectsReporsitory.Experience_Skilldesc.getAttribute("value"));
						break;
					}
				}

			} else {
				for (WebElement webElement : DropdownResult3) {
					if (webElement.getText().contains(ConfigFileReader.getExperience_Skill_Description())) {
						webElement.click();
						System.out.println("Skill_Description:" + ConfigFileReader.getExperience_Skill_Description());
						break;
					}
				}
			}
		}
	}

	@Then("^Verify user can able to add Experience details$")
	public static void Verify_user_can_able_to_add_Experience_details() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			System.out.println("Experience details are saved");
			Screenshot.Screenshotforscenario();
			Basic.popup_validation();
			Basic.PageLoader_Validation();
		}
	}

	@Then("^Verify user can able to view Previous Job Experience details$")
	public static void Verify_user_can_able_to_view_Previous_Job_Experience_details() throws Throwable {

		if (ObjectsReporsitory.Experience_Old_Job_Experience_Record.getText().contains("No records available")) {
			System.out.println("Workmen don't have any Pervious Job Experience");
			System.out.println("----------------------------------------------");
		} else {
			int experience_records_count = ObjectsReporsitory.Experience_Old_Job_Experience_List.size();
			System.out.println("Workmen has " + experience_records_count + "previous job experience");
			for (int k = 0; k > experience_records_count; k++) {
				System.out.println("Workmen previous job experience");
				System.out.println("----------------------------------");
				System.out.println("Job Code " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[1])")));
				System.out.println("Join Date " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[2])")));
				System.out.println("Release Date " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[3])")));
				System.out.println("Skill Type " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[4])")));
				System.out.println("Skill Category " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[5])")));
				System.out.println("Skill Group " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[6])")));
				System.out.println("Skill Desc " + DriverFactory.driver
						.findElements(By.xpath("((//kendo-grid-list//table)[3]//tbody[" + k + "]//tr//td)[7])")));
				System.out.println("----------------------------------");

			}

		}

	}

	@Then("^Verify user can able to edit Experience details$")
	public static void Verify_user_can_able_to_edit_Experience_details() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			// *************Experience 2
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_addExperience_btn));
			ObjectsReporsitory.Experience_addExperience_btn.click();
			ObjectsReporsitory.Experience_durationFrom.click();
			ObjectsReporsitory.Experience_durationFrom
					.sendKeys(ConfigFileReader.getExperience2_From_month() + Keys.TAB);
			ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience2_From_Year());
			System.out.println(
					"Experience 2- Worked From :" + ObjectsReporsitory.Experience_durationFrom.getAttribute("value"));
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience2_To_month() + Keys.TAB);
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience2_To_Year());
			System.out.println(
					"Experience 2- Worked To :" + ObjectsReporsitory.Experience_durationTo.getAttribute("value"));
			ObjectsReporsitory.Experience_organisation_Location.sendKeys(ConfigFileReader.getExperience_OrgName2());
			System.out.println("Orgnaizqation Name2:" + ConfigFileReader.getExperience_OrgName2());
			ObjectsReporsitory.Experience_projectLocation.sendKeys(ConfigFileReader.getExperience_ProjectLocation2());
			System.out.println("project Location2:" + ConfigFileReader.getExperience_ProjectLocation2());
			ObjectsReporsitory.Experience_projectCode.sendKeys(ConfigFileReader.getExperience_ProjectCode_Name2());
			System.out.println("project Code/Name2:" + ConfigFileReader.getExperience_ProjectCode_Name2());
			ObjectsReporsitory.Experience_Skillcatogory.click();
			List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Category2())) {
					webElement.click();
					System.out.println("Skillcatogory2:" + ConfigFileReader.getExperience_Skill_Category2());
					break;
				}
			}
			ObjectsReporsitory.Experience_SkillGroup.click();
			List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Group2())) {
					webElement.click();
					System.out.println("Skill_Group2:" + ConfigFileReader.getExperience_Skill_Group2());
					break;
				}
			}
			ObjectsReporsitory.Experience_Skilldesc.click();
			List<WebElement> DropdownResult3 = ObjectsReporsitory.Experience_SkillDesc_DR;
			for (WebElement webElement : DropdownResult3) {
				if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Description2())) {
					webElement.click();
					System.out.println("Skill_Description2:" + ConfigFileReader.getExperience_Skill_Description2());
					break;
				}
			}
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			System.out.println("Experience2 details are saved");
			// *************Experience 3
			ObjectsReporsitory.Experience_addExperience_btn.click();
			ObjectsReporsitory.Experience_durationFrom.click();
			ObjectsReporsitory.Experience_durationFrom
					.sendKeys(ConfigFileReader.getExperience3_From_month() + Keys.TAB);
			ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience3_From_Year());
			System.out.println(
					"Experience 3- Worked From :" + ObjectsReporsitory.Experience_durationFrom.getAttribute("value"));
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience3_To_month() + Keys.TAB);
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience3_To_Year());
			System.out.println(
					"Experience 3- Worked To :" + ObjectsReporsitory.Experience_durationTo.getAttribute("value"));
			ObjectsReporsitory.Experience_organisation_Location.sendKeys(ConfigFileReader.getExperience_OrgName3());
			System.out.println("Orgnaizqation Name3:" + ConfigFileReader.getExperience_OrgName3());
			ObjectsReporsitory.Experience_projectLocation.sendKeys(ConfigFileReader.getExperience_ProjectLocation3());
			System.out.println("project Location3:" + ConfigFileReader.getExperience_ProjectLocation3());
			ObjectsReporsitory.Experience_projectCode.sendKeys(ConfigFileReader.getExperience_ProjectCode_Name3());
			System.out.println("project Code/Name3:" + ConfigFileReader.getExperience_ProjectCode_Name3());
			ObjectsReporsitory.Experience_Skillcatogory.click();
			List<WebElement> DropdownResult4 = ObjectsReporsitory.Experience_Skillcatogory_DR;
			for (WebElement webElement : DropdownResult4) {
				if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Category3())) {
					webElement.click();
					System.out.println("Skillcatogory3:" + ConfigFileReader.getExperience_Skill_Category3());
					break;
				}
			}
			ObjectsReporsitory.Experience_SkillGroup.click();
			List<WebElement> DropdownResult5 = ObjectsReporsitory.Experience_SkillGroup_DR;
			for (WebElement webElement : DropdownResult5) {
				if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Group3())) {
					webElement.click();
					System.out.println("Skill_Group3:" + ConfigFileReader.getExperience_Skill_Group3());
					break;
				}
			}
			ObjectsReporsitory.Experience_Skilldesc.click();
			List<WebElement> DropdownResult6 = ObjectsReporsitory.Experience_SkillDesc_DR;
			for (WebElement webElement : DropdownResult6) {
				if (webElement.getText().equals(ConfigFileReader.getExperience_Skill_Description3())) {
					webElement.click();
					System.out.println("Skill_Description3:" + ConfigFileReader.getExperience_Skill_Description3());
					break;
				}
			}
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			System.out.println("Experience3 details are saved");
			// *************End of Experience
			ObjectsReporsitory.Experience_edit.click();
			ObjectsReporsitory.Experience_organisation_Location.clear();
			ObjectsReporsitory.Experience_organisation_Location.sendKeys("Edited Details");
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			System.out.println("Experience details are Edited");
		}
	}

	@Then("^Verify user can able to delete Experience details$")
	public static void Verify_user_can_able_to_delete_Experience_details() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			ObjectsReporsitory.Experience_delete.click();
			System.out.println("Experience details are Deleted");
		}
	}

	@Then("^Verify user can able to save Experience details$")
	public static void Verify_user_can_able_to_save_Experience_details() throws Throwable {
		if (ConfigFileReader.getExperience_Applicable().equals("Yes")) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Experience_saveNext);
			Basic.PageLoader_Validation();
			// ObjectsReporsitory.Experience_saveNext.click();
			System.out.println("Experience details are saved");
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			Basic.PageLoader_Validation();
		}
	}
}
