package stepdefinition.Workmen_Search;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Basic_Details.Create.Submit_Workman_Details;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Workman_Search {

	public static int Skill_Analyisis_Count;
	public static int Skill_Card_Count;
	public static String Skill_Analyisis_Value;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static int Paramedics_Count;
	public static int Paramedics_Card_Count;
	public static String Paramedics_Value;

// Page Factory
	public Workman_Search() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login and Navigate to Skill Analysis$")
	public static void Login_and_Navigate_to_Skill_Analysis() throws Throwable {
		DriverFactory.driver.manage().deleteAllCookies();
		Login.Use_Login_Induction_Skill();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		ObjectsReporsitory.WMS_induction2.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
			Basic.PageLoader_Validation();
		}
		Basic.PageLoader_Validation();
		Thread.sleep(5000);
		 wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Skill_Analysis_Count));
		Skill_Analyisis_Count = Integer.parseInt(Skill_Analysis_Objects.Dashboard_Skill_Analysis_Count.getText());
		Skill_Analysis_Objects.Dashboard_Skill_Analysis.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		Skill_Card_Count = Skill_Analysis_Objects.Skill_Analysis_card.size();
		System.out.println("Skill Analysis Count in Dashboard : " + Skill_Analyisis_Count);
		System.out.println("Workmen Count in Skill Analysis : " + Skill_Card_Count);
		if (Skill_Analyisis_Count == Skill_Card_Count) {
			System.out.println("Skill Count & Workman Cards Count Matched");
		} else {
			System.out.println("Skill Count & Workman Cards Count Not - Matched");
		}
		if (Skill_Card_Count > 0) {
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_First_card));
		} else {
			System.out.println("No Workmen Found in Skill Analysis-e");
			System.out.println("Enrolling New Workman");
			Login.Logout();
			Submit_Workman_Details
					.Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_Statutory_bank_details();
			Submit_Workman_Details.Verify_save_and_submit_workman_details();
			Login.Logout();
			Login_and_Navigate_to_Skill_Analysis();
		}
	}

	@Then("^Verify User can able to search Workman by Name$")
	public static void Verify_User_can_able_to_search_Workmen_by_Name() throws Throwable {
		System.out.println("Navigated to Skill Analysis");
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		System.out.println("Workmen Search Input :" + ConfigFileReader.getSkillWorkman_Name());
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(ConfigFileReader.getSkillWorkman_Name());
		Thread.sleep(3000);
		System.out
				.println("Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_WorkmanName.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_WorkmanName.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_WorkmanName;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_Name()) == true) {
					System.out.println("Workman Name After Search : " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman name");
		} else {
			System.out.println("Workman Not Found for the given Workman name");
		}
	}

	@Then("^Verify User can able to search Workman by ID$")
	public static void Verify_User_can_able_to_search_Workman_by_ID() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Worknen ID")) {
				webElement.click();
				System.out.println("Search by Worknen ID Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_search();
		Thread.sleep(3000);
		System.out.println("Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_ID()) == true) {
					System.out.println("After Search : " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman ID");
		} else {
			System.out.println("Workman Not Found for the given Workman ID");
		}
	}

	@Then("^Verify User can able to search Workman by ID SkillAnalysis$")
	public static void Verify_User_can_able_to_search_Workman_by_ID_SkillAnalysis() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Worknen ID")) {
				webElement.click();
				System.out.println("Search by Worknen ID Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_search();
		Thread.sleep(3000);
		System.out.println("Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_ID()) == true) {
					System.out.println("After Search : " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman ID");
		} else {
			System.out.println("Workman Not Found for the given Workman ID");
		}
	}

	public static void Verify_User_can_able_to_search_Workman_by_ID_Paramedics() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Worknen ID")) {
				webElement.click();
				System.out.println("Search by Worknen ID Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_Paramedics_search();
		Thread.sleep(3000);
		System.out.println("Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_ID()) == true) {
					System.out.println("After Search : " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman ID");
		} else {
			System.out.println("Workman Not Found for the given Workman ID");
		}
	}

	public static void Verify_User_can_able_to_search_Workman_by_ID_MedicalTest() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Worknen ID")) {
				webElement.click();
				System.out.println("Search by Worknen ID Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_MedicalTest_search();
		Thread.sleep(3000);
		System.out.println("Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_ID()) == true) {
					System.out.println("After Search : " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman ID");
		} else {
			System.out.println("Workman Not Found for the given Workman ID");
		}
	}

	public static void Verify_User_can_able_to_search_Workman_by_ID_EHS() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Worknen ID")) {
				webElement.click();
				System.out.println("Search by Worknen ID Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_EHS_search();
		Thread.sleep(3000);
		System.out.println("Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_WorkmanID;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_ID()) == true) {
					System.out.println("After Search : " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman ID");
		} else {
			System.out.println("Workman Not Found for the given Workman ID");
		}
	}

	@Then("^Verify User can able to search Workman by Skill$")
	public static void Verify_User_can_able_to_search_Workman_by_Skill() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Skill")) {
				webElement.click();
				System.out.println("Search by Skill Selected");
				break;
			}
		}
		System.out.println("Workman Search Input :" + ConfigFileReader.getSkillWorkman_skill());
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(ConfigFileReader.getSkillWorkman_skill());
		Thread.sleep(3000);
		System.out.println(
				"Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_Workman_Skill.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_Workman_Skill.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_Workman_Skill;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_skill()) == true) {
					System.out.println("Workman Skill After Search: " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman Skill");
		} else {
			System.out.println("Workman Not Found for the given Workman Skill");
		}
	}

	@Then("^Verify User can able to search Workman by Partner Name$")
	public static void Verify_User_can_able_to_search_Workman_by_Partner_Name() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// Skill_Analysis_Objects.Skill_Analysis_searchBy.click();
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Partner Name")) {
				webElement.click();
				System.out.println("Search by Partner Name Selected");
				break;
			}
		}
		System.out.println("Workman Search Input :" + ConfigFileReader.getSkillWorkman_Partner());
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(ConfigFileReader.getSkillWorkman_Partner());
		Thread.sleep(3000);
		System.out.println(
				"Workman Count after Search:" + Skill_Analysis_Objects.Skill_Analysis_card_Workman_Partner.size());
		if (Skill_Analysis_Objects.Skill_Analysis_card_Workman_Partner.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Skill_Analysis_card_Workman_Partner;
			for (WebElement webElement : searchResult) {
				if (webElement.getText().contains(ConfigFileReader.getSkillWorkman_Partner()) == true) {
					System.out.println("Workman Partner details After Search: " + webElement.getText());
				}
			}
			System.out.println("Workman can be able to search by Workman Partner Name /ID");
		} else {
			System.out.println("Workman Not Found for the given Workman Partner Name /ID");
		}
	}

}
