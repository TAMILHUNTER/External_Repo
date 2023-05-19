package stepdefinition.Basic_Details.Edit;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Edit_Education {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Education() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Education$")
	public static void Select_Workman_and_Navigate_to_Education() throws Throwable {

		Edit_Skill.Select_Workman_and_Navigate_to_Skill();
		ObjectsReporsitory.Induction_educationExperience.click();
		System.out.println("Navigated to Education & Experience");
		Thread.sleep(5000);
	}

	@Then("^Verify user can able to Edit Qualification$")
	public static void Verify_user_can_able_to_Edit_Qualification() throws Throwable {

		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {

			System.out.println("Education Details N/A Selected : "
					+ ObjectsReporsitory.Education_Applicable_Checkbox.isSelected());
			ObjectsReporsitory.Education_Applicable_Checkbox.click();

			ObjectsReporsitory.Education_Side_educationExperience.click();
			Actions actions147 = new Actions(DriverFactory.driver);
			actions147.moveToElement(ObjectsReporsitory.Experience_Head);
			actions147.perform();
			ObjectsReporsitory.Education_addEducation_btn.click();

			ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_qualification.clear();
			ObjectsReporsitory.Education_qualification.click();
			ObjectsReporsitory.Education_qualification.sendKeys(ConfigFileReader.getEducation_Quallification());
			List<WebElement> DropdownResult = ObjectsReporsitory.Education_qualification_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getEducation_Quallification())) {
					webElement.click();
					System.out.println("Qualification:" + ConfigFileReader.getEducation_Quallification());
					break;
				}
			}

			ObjectsReporsitory.Education_Branch.click();
			ObjectsReporsitory.Education_Branch.clear();
			ObjectsReporsitory.Education_Branch.click();
			ObjectsReporsitory.Education_Branch.sendKeys(ConfigFileReader.getEducation_Branch());
			List<WebElement> DropdownResult7 = ObjectsReporsitory.Education_Branch_DR;
			for (WebElement webElement7 : DropdownResult7) {
				if (webElement7.getText().equals(ConfigFileReader.getEducation_Branch())) {
					webElement7.click();
					System.out.println("Branch:" + ConfigFileReader.getEducation_Branch());
					break;
				}
			}
			Thread.sleep(3000);
			if (ConfigFileReader.getEducation_Quallification().equals("SCHOOL")) {
				System.out.println("discipiline Not difined for qualification school");
			} else {
				ObjectsReporsitory.Education_Discipiline.sendKeys(ConfigFileReader.getEducation_Discipiline());
				System.out.println("Discipiline:" + ConfigFileReader.getEducation_Discipiline());
			}

			ObjectsReporsitory.Education_SchoolORCollege.click();
			ObjectsReporsitory.Education_SchoolORCollege.clear();
			ObjectsReporsitory.Education_SchoolORCollege.click();
			ObjectsReporsitory.Education_SchoolORCollege.sendKeys(ConfigFileReader.getEducation_SchoolORCollege());
			System.out.println("School / College :" + ConfigFileReader.getEducation_SchoolORCollege());

			ObjectsReporsitory.Education_BoardORUniversity.click();
			ObjectsReporsitory.Education_BoardORUniversity.clear();
			ObjectsReporsitory.Education_BoardORUniversity.click();
			ObjectsReporsitory.Education_BoardORUniversity.sendKeys(ConfigFileReader.getEducation_BoardORUniversity());
			System.out.println("Board/University :" + ConfigFileReader.getEducation_BoardORUniversity());

			ObjectsReporsitory.Education_yearofPassing.click();
			ObjectsReporsitory.Education_yearofPassing.clear();
			ObjectsReporsitory.Education_yearofPassing.click();
			ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year());
			System.out.println("Year Of Passing : " + ConfigFileReader.getEducation_YearofPassing_Year());

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Education_save));
			ObjectsReporsitory.Education_save.click();
			System.out.println("Education details are saved");

			Basic.PageLoader_Validation();
			Actions actions148 = new Actions(DriverFactory.driver);
			actions148.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions148.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateQualification();
		}

		else {
			System.out.println("Education details not available");
		}

	}

	@Then("^Verify user can able to Edit Branch$")
	public static void Verify_user_can_able_to_Edit_Branch() throws Throwable {

		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {
			ObjectsReporsitory.Induction_educationExperience.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Education_Edit2.click();

			if (ObjectsReporsitory.Education_Branch.getAttribute("value").equals("10TH")) {
				ObjectsReporsitory.Education_Branch.clear();
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys("12TH");
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("12TH")) {
						webElement.click();
						System.out
								.println("Qualification:" + ObjectsReporsitory.Education_Branch.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Education_Branch.getAttribute("value").equals("12TH")) {
				ObjectsReporsitory.Education_Branch.clear();
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys("10TH");
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("10TH")) {
						webElement.click();
						System.out
								.println("Qualification:" + ObjectsReporsitory.Education_Branch.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Education_Branch.getAttribute("value").equals("BA")) {
				ObjectsReporsitory.Education_Branch.clear();
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys("BE");
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("BE")) {
						webElement.click();
						System.out
								.println("Qualification:" + ObjectsReporsitory.Education_Branch.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Education_Branch.getAttribute("value").equals("BE")) {
				ObjectsReporsitory.Education_Branch.clear();
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys("BA");
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("BA")) {
						webElement.click();
						System.out
								.println("Qualification:" + ObjectsReporsitory.Education_Branch.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Education_Branch.getAttribute("value").equals("ME")) {
				ObjectsReporsitory.Education_Branch.clear();
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys("MA");
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("MA")) {
						webElement.click();
						System.out
								.println("Qualification:" + ObjectsReporsitory.Education_Branch.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Education_Branch.getAttribute("value").equals("MA")) {
				ObjectsReporsitory.Education_Branch.clear();
				ObjectsReporsitory.Education_Branch.click();
				ObjectsReporsitory.Education_Branch.sendKeys("ME");
				List<WebElement> DropdownResult = ObjectsReporsitory.Education_Branch_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("ME")) {
						webElement.click();
						System.out
								.println("Qualification:" + ObjectsReporsitory.Education_Branch.getAttribute("value"));
						break;
					}
				}
			}
			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			Actions actions148 = new Actions(DriverFactory.driver);
			actions148.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions148.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateBranch();
		}

		else {
			System.out.println("Education details not available");
		}
	}

	@Then("^Verify user can able to Edit Discipiline$")
	public static void Verify_user_can_able_to_Edit_Discipiline() throws Throwable {

		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {

			ObjectsReporsitory.Induction_educationExperience.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Education_Edit2.click();

			if (ObjectsReporsitory.Education_qualification.getAttribute("value").equals("SCHOOL")) {
				System.out.println("Discipiline Not difined for school qualification");
			} else {
				ObjectsReporsitory.Education_Discipiline.clear();
				ObjectsReporsitory.Education_Discipiline
						.sendKeys(ConfigFileReader.getEducation_Discipiline3() + "_" + RandomString.make(10));
				System.out.println("Discipiline:" + ObjectsReporsitory.Education_Discipiline.getAttribute("value"));
			}

			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			Actions actions148 = new Actions(DriverFactory.driver);
			actions148.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions148.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateDiscipiline();
		} else {
			System.out.println("Education details not available");
		}
	}

	@Then("^Verify user can able to Edit School Or College$")
	public static void Verify_user_can_able_to_Edit_School_Or_College() throws Throwable {
		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {
			ObjectsReporsitory.Induction_educationExperience.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Education_Edit2.click();
			ObjectsReporsitory.Education_SchoolORCollege.clear();
			ObjectsReporsitory.Education_SchoolORCollege.sendKeys("UpdateS/C" + "_" + RandomString.make(10));
			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			Actions actions148 = new Actions(DriverFactory.driver);
			actions148.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions148.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateSchool();
		} else {
			System.out.println("Education details not available");
		}
	}

	@Then("^Verify user can able to Edit School Or Board or University$")
	public static void Verify_user_can_able_to_Edit_School_Or_Board_or_University() throws Throwable {

		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {
			ObjectsReporsitory.Induction_educationExperience.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Education_Edit2.click();
			ObjectsReporsitory.Education_BoardORUniversity.clear();
			ObjectsReporsitory.Education_BoardORUniversity.sendKeys("UpdateB/R" + "_" + RandomString.make(10));
			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			Actions actions148 = new Actions(DriverFactory.driver);
			actions148.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions148.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateBoard();
		} else {
			System.out.println("Education details not available");
		}

	}

	@Then("^Verify user can able to Edit School Or Year of Passing$")
	public static void Verify_user_can_able_to_Edit_School_Or_Year_of_Passing() throws Throwable {

		if (ObjectsReporsitory.Education_Applicable_Checkbox.isSelected() == true) {
			ObjectsReporsitory.Induction_educationExperience.click();
			Thread.sleep(2000);
			ObjectsReporsitory.Education_Edit2.click();
			if (ObjectsReporsitory.Education_yearofPassing.getAttribute("value")
					.equals(ConfigFileReader.getEducation_YearofPassing_Year())) {
				ObjectsReporsitory.Education_yearofPassing.clear();
				ObjectsReporsitory.Education_yearofPassing
						.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year3());
			} else {
				ObjectsReporsitory.Education_yearofPassing.clear();
				ObjectsReporsitory.Education_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year());
			}
			ObjectsReporsitory.Education_save.click();
			Basic.PageLoader_Validation();
			Actions actions148 = new Actions(DriverFactory.driver);
			actions148.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions148.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateYearOfPassing();
		} else {
			System.out.println("Education details not available");
		}
	}
}