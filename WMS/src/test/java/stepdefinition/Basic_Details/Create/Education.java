package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Education {

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Education() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication Skill Deployment details then navigate to Education$")
	public static void Fill_Partner_Personal_communication_Skill_Deployment_details_then_navigate_to_Education()
			throws Throwable {

		Deployment.Fill_Partner_Personal_communication_Skill_details_then_navigate_to_Deployment();
		Deployment.Verify_user_can_able_to_click_deployemnt();
		Deployment.Verify_user_can_able_to_select_deployemnt_from_tree();
		Deployment.Verify_user_can_able_to_save_deployemnt();
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.Education_addEducation_btn);
		actions.perform();
		System.out.println("Navigated to Education & Training");

	}

	@Then("^Verify user can able to add Education$")
	public static void Verify_user_can_able_to_add_Education() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_Side_educationExperience.click();
			Actions actions = new Actions(DriverFactory.driver);
			actions.moveToElement(ObjectsReporsitory.Experience_Head);
			actions.perform();
			ObjectsReporsitory.Education_addEducation_btn.click();
		} else if (ConfigFileReader.getEducation_Applicable().equals("No")) {

			ObjectsReporsitory.Education_Applicable_Checkbox.click();
			System.out.println("Workmen Not Educated - No Educational History");
		}

	}

	@Then("^Verify user can able to select Qualification$")
	public static void Verify_user_can_able_to_select_Qualification() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_qualification.sendKeys(ConfigFileReader.getEducation_Quallification());
			List<WebElement> DropdownResult = ObjectsReporsitory.Education_qualification_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getEducation_Quallification())) {
					webElement.click();
					System.out.println("Qualification:" + ConfigFileReader.getEducation_Quallification());
					break;
				}
			}
		}
	}

	@Then("^Verify user can able to select Branch  based on Qualification and enter discipiline$")
	public static void Verify_user_can_able_to_select_Branch_based_on_Qualification_and_enter_discipiline()
			throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			if (ConfigFileReader.getEducation_Quallification().contains("SCHOOL")) {
				System.out.println("Branch & discipiline Not difined for qualification type school");
			}
			 else {
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys(ConfigFileReader.getEducation_Branch());
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals(ConfigFileReader.getEducation_Branch())) {
						webElement.click();
						System.out.println("Branch:" + ConfigFileReader.getEducation_Branch());
						break;
					}
				}
			Thread.sleep(3000);
				
				ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Discipiline());
				System.out.println("Discipiline:" + ConfigFileReader.getEducation_Discipiline());
			}
		}
	}

	@Then("^Verify user can able to enter schoolORCollege$")
	public static void Verify_user_can_able_to_enter_schoolORCollege() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_SchoolORCollege());
			System.out.println("School / College :" + ConfigFileReader.getEducation_SchoolORCollege());
		}
	}

	@Then("^Verify user can able to enter BoardORUniversity$")
	public static void Verify_user_can_able_to_enter_BoardORUniversity() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_BoardORUniversity.sendKeys(ConfigFileReader.getEducation_BoardORUniversity());
			System.out.println("Board/University :" + ConfigFileReader.getEducation_BoardORUniversity());
		}
	}

	@Then("^Verify user can able to enter Year of Passing$")
	public static void Verify_user_can_able_to_enter_Year_of_Passing() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year());
			System.out.println("Year Of Passing : " + ConfigFileReader.getEducation_YearofPassing_Year());
		}
	}

	@Then("^Verify user can able to save education$")
	public static void Verify_user_can_able_to_save_education() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			System.out.println("Education details are saved");
		}
	}

	@Then("^Verify user can able to Edit education$")
	public static void Verify_user_can_able_to_Edit_education() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			// ******************************************************************************************
			// Education 2
			ObjectsReporsitory.Education_addEducation_btn.click();
			ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_qualification.sendKeys(ConfigFileReader.getEducation_Quallification2());
			List<WebElement> DropdownResult = ObjectsReporsitory.Education_qualification_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getEducation_Quallification2())) {
					webElement.click();
					System.out.println("Qualification:" + ConfigFileReader.getEducation_Quallification2());
					break;
				}
			}

			ObjectsReporsitory.Education_Branch.click();
			ObjectsReporsitory.Education_Branch.sendKeys(ConfigFileReader.getEducation_Branch2());
			List<WebElement> DropdownResult1 = ObjectsReporsitory.Education_Branch_DR;
			for (WebElement webElement : DropdownResult1) {
				if (webElement.getText().equals(ConfigFileReader.getEducation_Branch2())) {
					webElement.click();
					System.out.println("Qualification:" + ConfigFileReader.getEducation_Branch2());
					break;
				}
			}
			Thread.sleep(3000);
			if (ConfigFileReader.getEducation_Quallification2().equals("SCHOOL")) {
				System.out.println("discipiline Not difined for qualification school");
			} else {
				ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Discipiline2());
				System.out.println("Discipiline:" + ConfigFileReader.getEducation_Discipiline2());
			}
			ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_SchoolORCollege2());
			System.out.println("School / College :" + ConfigFileReader.getEducation_SchoolORCollege2());
			ObjectsReporsitory.Education_BoardORUniversity.sendKeys(ConfigFileReader.getEducation_BoardORUniversity2());
			System.out.println("Board/University :" + ConfigFileReader.getEducation_BoardORUniversity2());
			ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year2());
			System.out.println("Year Of Passing 2 : " + ConfigFileReader.getEducation_YearofPassing_Year2());
			ObjectsReporsitory.Education_save.click();
			System.out.println("Education2 details are saved");

			// *********************** Education 3

			ObjectsReporsitory.Education_addEducation_btn.click();
			ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_qualification.sendKeys(ConfigFileReader.getEducation_Quallification3());
			List<WebElement> DropdownResult3 = ObjectsReporsitory.Education_qualification_DR;
			for (WebElement webElement : DropdownResult3) {
				if (webElement.getText().equals(ConfigFileReader.getEducation_Quallification3())) {
					webElement.click();
					System.out.println("Qualification:" + ConfigFileReader.getEducation_Quallification3());
					break;
				}
			}
			ObjectsReporsitory.Education_Branch.click();
			ObjectsReporsitory.Education_Branch.sendKeys(ConfigFileReader.getEducation_Branch3());
			List<WebElement> DropdownResult4 = ObjectsReporsitory.Education_Branch_DR;
			for (WebElement webElement : DropdownResult4) {
				if (webElement.getText().equals(ConfigFileReader.getEducation_Branch3())) {
					webElement.click();
					System.out.println("Qualification:" + ConfigFileReader.getEducation_Branch3());
					break;
				}
			}
			Thread.sleep(3000);
			if (ConfigFileReader.getEducation_Quallification3().equals("SCHOOL")) {
				System.out.println("discipiline Not difined for qualification school");
			} else {
				ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Discipiline3());
				System.out.println("Discipiline:" + ConfigFileReader.getEducation_Discipiline3());
			}
			ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_SchoolORCollege3());
			System.out.println("School / College :" + ConfigFileReader.getEducation_SchoolORCollege3());
			ObjectsReporsitory.Education_BoardORUniversity.sendKeys(ConfigFileReader.getEducation_BoardORUniversity3());
			System.out.println("Board/University :" + ConfigFileReader.getEducation_BoardORUniversity3());
			ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year3());
			System.out.println("Year Of Passing 3 : " + ConfigFileReader.getEducation_YearofPassing_Year3());
			ObjectsReporsitory.Education_save.click();
			System.out.println("Education3 details are saved");

			// *******************************************************************
			// End of add education

			ObjectsReporsitory.Education_Edit.click();
			ObjectsReporsitory.Education_BoardORUniversity.clear();
			ObjectsReporsitory.Education_BoardORUniversity.sendKeys("Edited_BoardorUniv");
			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			System.out.println("Education details are Edited");
		}
	}

	@Then("^Verify user can able to Delete Education$")
	public static void Verify_user_can_able_to_Delete_Education() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_delete.click();
			Basic.PageLoader_Validation();
			// Verify with DB
			System.out.println("Education details are Deleted");
		}
	}

	@Then("^Verify user can able to cancel add Education$")
	public static void Verify_user_can_able_to_cancel_add_Education() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_addEducation_btn.click();
			ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_close.click();
			Basic.PageLoader_Validation();
			System.out.println("Add education details canceled");
		}
	}

	@Then("^Verify user can able to cancel edit Education$")
	public static void Verify_user_can_able_to_cancel_edit_Education() throws Throwable {
		if (ConfigFileReader.getEducation_Applicable().equals("Yes")) {
			ObjectsReporsitory.Education_Edit.click();
			// ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_close.click();
			Basic.PageLoader_Validation();
			System.out.println("Edit education details canceled");
			Screenshot.Screenshotforscenario();
		}
	}
}
