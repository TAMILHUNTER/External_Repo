package stepdefinition.Basic_Details.Edit;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class Edit_Experience {

	public static String OrgName;
	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Experience() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Experience$")
	public static void Select_Workman_and_Navigate_to_Experience() throws Throwable {

		Edit_Skill.Select_Workman_and_Navigate_to_Skill();
		ObjectsReporsitory.Induction_educationExperience.click();
		Actions actions151 = new Actions(DriverFactory.driver);
		actions151.moveToElement(ObjectsReporsitory.Experience_saveNext);
		actions151.perform();
		System.out.println("Navigated to Education & Experience");
		Thread.sleep(5000);
	}

	@Then("^Verify user can able to Edit Duration$")
	public static void Verify_user_can_able_to_Edit_Duration() throws Throwable {

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {

			Actions actions1512 = new Actions(DriverFactory.driver);
			actions1512.moveToElement(ObjectsReporsitory.Experience_edit2);
			actions1512.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_edit2));
			ObjectsReporsitory.Experience_edit2.click();

			ObjectsReporsitory.Experience_durationFrom.click();
			ObjectsReporsitory.Experience_durationFrom
					.sendKeys(ConfigFileReader.getExperience_From_month_Update1() + Keys.TAB);
			ObjectsReporsitory.Experience_durationFrom.sendKeys(ConfigFileReader.getExperience_From_Year_Update1());
			System.out.println(
					"Experience 1- Worked From :" + ObjectsReporsitory.Experience_durationFrom.getAttribute("value"));
			ObjectsReporsitory.Experience_durationTo
					.sendKeys(ConfigFileReader.getExperience_To_month_Update1() + Keys.TAB);
			ObjectsReporsitory.Experience_durationTo.sendKeys(ConfigFileReader.getExperience_To_Year_Update1());
			System.out.println(
					"Experience 1- Worked To :" + ObjectsReporsitory.Experience_durationTo.getAttribute("value"));

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_addExperience_savebtn));
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Thread.sleep(3000);
			Actions actions1528 = new Actions(DriverFactory.driver);
			actions1528.moveToElement(ObjectsReporsitory.Experience_saveNext);
			actions1528.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_saveNext));
			ObjectsReporsitory.Experience_saveNext.click();
			Actions actions152 = new Actions(DriverFactory.driver);
			actions152.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			// DataBaseConnection.getUpdateYearOfPassing();
		} else {
			System.out.println("Experience Details Not available");
		}
	}

	@Then("^Verify user can able to Edit Organisation Name$")
	public static void Verify_user_can_able_to_Edit_Organisation_Name() throws Throwable {

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {
			ObjectsReporsitory.Experience_edit2.click();
			ObjectsReporsitory.Experience_organisation_Location.clear();
			OrgName = "ORGN_" + RandomString.make(10);
			ObjectsReporsitory.Experience_organisation_Location.sendKeys(OrgName);
			Thread.sleep(2000);
			System.out.println("cate:" + ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
			System.out.println("group:" + ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
			System.out.println("desc:" + ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value"));
			if (ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value").equals("")) {
				ObjectsReporsitory.Experience_Skillcatogory2.click();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						break;
					}
				}
			} else if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value").equals("")) {
				if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("Admin Assitant")) {
					ObjectsReporsitory.Experience_Skilldesc2.click();
					ObjectsReporsitory.Experience_Skilldesc2.sendKeys("1 - Junior Assistant");
					List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
					for (WebElement webElement : DropdownResult2) {
						if (webElement.getText().equals("1 - Junior Assistant")) {
							webElement.click();
							break;
						}
					}
				}
			}

			Thread.sleep(2000);
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Basic.PageLoader_Validation();
			Actions actions152 = new Actions(DriverFactory.driver);
			actions152.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Screenshot.Screenshotforscenario();
			Basic.PageLoader_Validation();
			Basic.popup_handle();
			DataBaseConnection.getUpdateOrganisationName();
		} else {
			System.out.println("Experience Details Not available");
		}
	}

	@Then("^Verify user can able to Edit Project Location$")
	public static void Verify_user_can_able_to_Edit_Project_Location() throws Throwable {

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {

			ObjectsReporsitory.Experience_edit2.click();
			ObjectsReporsitory.Experience_projectLocation.clear();
			ObjectsReporsitory.Experience_projectLocation.sendKeys("PLOC_" + RandomString.make(10));
			if (ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value").equals("")) {
				ObjectsReporsitory.Experience_Skillcatogory2.click();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						break;
					}
				}
			}
			if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
			}
			if (ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value").equals("")) {
				if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("Admin Assitant")) {
					ObjectsReporsitory.Experience_Skilldesc2.click();
					ObjectsReporsitory.Experience_Skilldesc2.sendKeys("1 - Junior Assistant");
					List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
					for (WebElement webElement : DropdownResult2) {
						if (webElement.getText().equals("1 - Junior Assistant")) {
							webElement.click();
							break;
						}
					}
				}
			}
			Thread.sleep(2000);
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Basic.PageLoader_Validation();
			Actions actions152 = new Actions(DriverFactory.driver);
			actions152.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Screenshot.Screenshotforscenario();
			Basic.PageLoader_Validation();
			Basic.popup_handle();
			DataBaseConnection.getUpdateProjectLocation();
		} else {
			System.out.println("Experience Details Not available");
		}
	}

	@Then("^Verify user can able to Edit Project Code$")
	public static void Verify_user_can_able_to_Edit_Project_Code() throws Throwable {
		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {

			ObjectsReporsitory.Experience_edit2.click();
			ObjectsReporsitory.Experience_projectCode.clear();
			ObjectsReporsitory.Experience_projectCode.sendKeys("PCOD_" + RandomString.make(10));
			if (ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value").equals("")) {
				ObjectsReporsitory.Experience_Skillcatogory2.click();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						break;
					}
				}
			}
			if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
			}
			if (ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value").equals("")) {
				if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("Admin Assitant")) {
					ObjectsReporsitory.Experience_Skilldesc2.click();
					ObjectsReporsitory.Experience_Skilldesc2.sendKeys("1 - Junior Assistant");
					List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
					for (WebElement webElement : DropdownResult2) {
						if (webElement.getText().equals("1 - Junior Assistant")) {
							webElement.click();
							break;
						}
					}
				}
			}
			Thread.sleep(2000);
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Basic.PageLoader_Validation();
			Actions actions152 = new Actions(DriverFactory.driver);
			actions152.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateProjectName();
		} else {
			System.out.println("Experience Details Not available");
		}
	}

	@Then("^Verify user can able to Edit Skill Category$")
	public static void Verify_user_can_able_to_Edit_Skill_Category() throws Throwable {

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {

			ObjectsReporsitory.Experience_edit2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_Skillcatogory2));
			String Skillcatogory = ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value");
			System.out.println("check:" + Skillcatogory);
			if (Skillcatogory.equals("Accounts and Admin")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("P&M");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("P&M")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
			} else if (Skillcatogory.equals("P&M")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
			} else {
				System.out.println("Skill Catogory Not defined yet");
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}

			}
			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Basic.PageLoader_Validation();
			Actions actions152 = new Actions(DriverFactory.driver);
			actions152.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateExperienceSkillCategory();

		} else {
			System.out.println("Experience Details Not available");
		}
	}

	@Then("^Verify user can able to Edit Skill Group$")
	public static void Verify_user_can_able_to_Edit_Skill_Group() throws Throwable {

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {

			ObjectsReporsitory.Experience_edit2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_SkillGroup2));
			String SkillGroup = ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value");
			String Skillcatogory = ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value");
			if (SkillGroup.equals("Admin Assitant")) {
				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Mech Operator");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Mech Operator")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}
			} else if (SkillGroup.equals("Mech Operator")) {
				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Admin Assitant");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Admin Assitant")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}
			}

			else if (Skillcatogory.equals("P&M") && SkillGroup.equals("Mech Operator")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Admin Assitant");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Admin Assitant")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}
			} else if (Skillcatogory.equals("P&M") && SkillGroup.equals("Admin Assitant")) {
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Mech Operator");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Mech Operator")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}
			} else {
				System.out.println("Skill Group Not defined yet");
				ObjectsReporsitory.Experience_Skillcatogory2.clear();
				ObjectsReporsitory.Experience_Skillcatogory2.sendKeys("Accounts and Admin");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_Skillcatogory_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Accounts and Admin")) {
						webElement.click();
						System.out.println("Experience Skill Category:"
								+ ObjectsReporsitory.Experience_Skillcatogory2.getAttribute("value"));
						break;
					}
				}
				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Admin Assitant");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Admin Assitant")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}
			}

			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Basic.PageLoader_Validation();
			Actions actions152 = new Actions(DriverFactory.driver);
			actions152.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();

			DataBaseConnection.getUpdateExperienceSkillGroup();
		} else {
			System.out.println("Experience Details Not available");
		}
	}

	@Then("^Verify user can able to Edit Skill Description$")
	public static void Verify_user_can_able_to_Edit_Skill_Description() throws Throwable {

		if (ObjectsReporsitory.Experience_Applicable_Checkbox.isSelected() == true) {

			ObjectsReporsitory.Experience_edit2.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Experience_Skilldesc2));
			String SkillDesc = ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value");
			System.out.println("Skill Desc: " + SkillDesc);
			if (SkillDesc.equals("1 - Junior Assistant")) {

				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Mech Operator");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("Mech Operator")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}

				ObjectsReporsitory.Experience_Skilldesc2.clear();
				ObjectsReporsitory.Experience_Skilldesc2.sendKeys("2 - Crane Heavy Vehicle");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("2 - Crane Heavy Vehicle")) {
						webElement.click();
						System.out.println("Experience Skill Desc:"
								+ ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value"));
						break;
					}
				}
			} else if (SkillDesc.equals("2 - Crane Heavy Vehicle")) {

				ObjectsReporsitory.Experience_SkillGroup2.clear();
				ObjectsReporsitory.Experience_SkillGroup2.sendKeys("Admin Assitant");
				List<WebElement> DropdownResult = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Admin Assitant")) {
						webElement.click();
						System.out.println("Experience Skill Group:"
								+ ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value"));
						break;
					}
				}

				ObjectsReporsitory.Experience_Skilldesc2.clear();
				ObjectsReporsitory.Experience_Skilldesc2.sendKeys("1 - Junior Assistant");
				List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals("1 - Junior Assistant")) {
						webElement.click();
						System.out.println("Experience Skill Desc:"
								+ ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value"));
						break;
					}
				}
			} else if (ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value").equals("")) {
				if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("Admin Assitant")) {
					ObjectsReporsitory.Experience_Skilldesc2.sendKeys("1 - Junior Assistant");
					List<WebElement> DropdownResult2 = ObjectsReporsitory.Experience_SkillGroup_DR;
					for (WebElement webElement : DropdownResult2) {
						if (webElement.getText().equals("1 - Junior Assistant")) {
							webElement.click();
							System.out.println("Experience Skill Desc:"
									+ ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value"));
							break;
						}
					}
				} else if (ObjectsReporsitory.Experience_SkillGroup2.getAttribute("value").equals("Mech Operator")) {
					ObjectsReporsitory.Experience_Skilldesc2.sendKeys("2 - Crane Heavy Vehicle");
					List<WebElement> DropdownResult = ObjectsReporsitory.Experience_SkillGroup_DR;
					for (WebElement webElement : DropdownResult) {
						if (webElement.getText().equals("2 - Crane Heavy Vehicle")) {
							webElement.click();
							System.out.println("Experience Skill Desc:"
									+ ObjectsReporsitory.Experience_Skilldesc2.getAttribute("value"));
							break;
						}
					}
				}
			}

			ObjectsReporsitory.Experience_addExperience_savebtn.click();
			Basic.PageLoader_Validation();
			Actions actions152wqe = new Actions(DriverFactory.driver);
			actions152wqe.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
			actions152wqe.perform();
			ObjectsReporsitory.Experience_saveNext.click();
			Basic.PageLoader_Validation();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			DataBaseConnection.getUpdateExperienceSkillDesc();

		} else {
			System.out.println("Experience Details Not available");
		}
	}
}