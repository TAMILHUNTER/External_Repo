package stepdefinition.SkillAnalysis.Create;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Induction_Dashboard.Profile_Basic;
import stepdefinition.Induction_Dashboard.Profile_EHS;
import stepdefinition.Induction_Dashboard.Profile_Medical_test;
import stepdefinition.Induction_Dashboard.Profile_Skill_Analysis;
import stepdefinition.Induction_Dashboard.Profile_Wage;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;

public class Skill_Analysis_Create {

	static int Skill_Analyisis_Count;
	static int Skill_Card_Count;
	static String Skill_Analyisis_Value;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static String WorkmanName_SkillTable;
	public static String WorkmanNumber_SkillTable;
	public static String SkillDesc_SkillTable;
	public static String SearchWorkman_skill;
	public static String SearchWorkman_Name;
	public static String SearchWorkman_Partner_Code;
	public static String WorkmanPartner;
	public static String Selected_skillType_SA;
	static int Paramedics_Count;
	public static int TotalQuestiones_allElements;
	public static int TotalAnswer_allElements;
	static int Paramedics_Card_Count;
	static float Percentage;
	static String Paramedics_Value;

// Page Factory
	public Skill_Analysis_Create() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************
	public static ConfigFileReader configFileReader;

	@Then("^Search Workmen Profile SkillAnalysis$")
	public static void Verify_User_can_be_able_to_search_Workmen_Profile_SkillAnalysis() throws Throwable {

		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);

		// ******************** Workmen Search Start ********************
		// ******************** Search By Workmen Name ********************
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains("Workmen Number")) {
				webElement.click();
				System.out.println("Search by Workmen Number Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_search();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Skill ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult112 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult112) {
			if (webElement.getText().contains("Skill")) {
				webElement.click();
				System.out.println("Search by Skill Selected");
				break;
			}
		}

		SearchWorkman_skill = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenSkill.getText();
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_skill);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);
		// ******************** Search By Workmen Partner Code ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult1 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().contains("Partner Code")) {
				webElement.click();
				System.out.println("Search by Partner Code Selected");
				break;
			}
		}
		SearchWorkman_Partner_Code = Skill_Analysis_Objects.Skill_Analysis_Profile_Partner.getText().substring(0, 16);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Partner_Code);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Name ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().contains("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		SearchWorkman_Name = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenName.getText();
		System.out.println("Workmen Search Input :" + SearchWorkman_Name);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Name);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
		Thread.sleep(3000);
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		System.out.println("Navigated to Skill Analysis");
	}

	// ******************** End Workmen Search ********************
	@Then("^Verify User can be able to search Workmen Profile Paramedics$")
	public static void Verify_User_can_be_able_to_search_Workmen_Profile_Paramedics() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// ******************** Workmen Search Start ********************
		// ******************** Search By Workmen Name ********************
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains("Workmen Number")) {
				webElement.click();
				System.out.println("Search by Workmen Number Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_Paramedics_search();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Skill ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult112 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult112) {
			if (webElement.getText().contains("Skill")) {
				webElement.click();
				System.out.println("Search by Skill Selected");
				break;
			}
		}

		Thread.sleep(3000);
		SearchWorkman_skill = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenSkill.getText();
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_skill);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);
		// ******************** Search By Workmen Partner Code ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult1 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().contains("Partner Code")) {
				webElement.click();
				System.out.println("Search by Partner Code Selected");
				break;
			}
		}
		SearchWorkman_Partner_Code = Skill_Analysis_Objects.Skill_Analysis_Profile_Partner.getText().substring(0, 16);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Partner_Code);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Name ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().contains("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		SearchWorkman_Name = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenName.getText();
		System.out.println("Workmen Search Input :" + SearchWorkman_Name);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Name);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		System.out.println("Navigated to Skill Analysis");
	}

	// ******************** End Workmen Search ********************

	@Then("^Verify User can be able to search Workmen Profile Medical Test$")
	public static void Verify_User_can_be_able_to_search_Workmen_Profile_Medical_Test() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// ******************** Workmen Search Start ********************
		// ******************** Search By Workmen Name ********************
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains("Workmen Number")) {
				webElement.click();
				System.out.println("Search by Workmen Number Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_MedicalTest_search();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Skill ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult112 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult112) {
			if (webElement.getText().contains("Skill")) {
				webElement.click();
				System.out.println("Search by Skill Selected");
				break;
			}
		}

		SearchWorkman_skill = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenSkill.getText();
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_skill);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);
		// ******************** Search By Workmen Partner Code ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult1 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().contains("Partner Code")) {
				webElement.click();
				System.out.println("Search by Partner Code Selected");
				break;
			}
		}
		SearchWorkman_Partner_Code = Skill_Analysis_Objects.Skill_Analysis_Profile_Partner.getText().substring(0, 16);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Partner_Code);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Name ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().contains("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		SearchWorkman_Name = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenName.getText();
		System.out.println("Workmen Search Input :" + SearchWorkman_Name);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Name);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		System.out.println("Navigated to Skill Analysis");

		// ******************** End Workmen Search ********************
	}

	@Then("^Verify User can be able to search Workmen Profile EHS$")
	public static void Verify_User_can_be_able_to_search_Workmen_Profile_EHS() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// ******************** Workmen Search Start ********************
		// ******************** Search By Workmen Name ********************
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains("Workmen Number")) {
				webElement.click();
				System.out.println("Search by Workmen Number Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_EHS_search();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Skill ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult112 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult112) {
			if (webElement.getText().contains("Skill")) {
				webElement.click();
				System.out.println("Search by Skill Selected");
				break;
			}
		}

		SearchWorkman_skill = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenSkill.getText();
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_skill);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);
		// ******************** Search By Workmen Partner Code ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult1 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().contains("Partner Code")) {
				webElement.click();
				System.out.println("Search by Partner Code Selected");
				break;
			}
		}
		SearchWorkman_Partner_Code = Skill_Analysis_Objects.Skill_Analysis_Profile_Partner_EHS.getText().substring(0,
				16);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Partner_Code);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Name ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().contains("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		SearchWorkman_Name = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenName.getText();
		System.out.println("Workmen Search Input :" + SearchWorkman_Name);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Name);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		System.out.println("Navigated to Skill Analysis");

		// ******************** End Workmen Search ********************
	}

	@Then("^Verify User can be able to search Workmen Profile Wage$")
	public static void Verify_User_can_be_able_to_search_Workmen_Profile_Wage() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		// ******************** Workmen Search Start ********************
		// ******************** Search By Workmen Name ********************
		List<WebElement> DropdownResult = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains("Workmen Number")) {
				webElement.click();
				System.out.println("Search by Workmen Number Selected");
				break;
			}
		}
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		DataBaseConnection.getworkmenID_Wage_search();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Skill ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult112 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult112) {
			if (webElement.getText().contains("Skill")) {
				webElement.click();
				System.out.println("Search by Skill Selected");
				break;
			}
		}

		SearchWorkman_skill = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenSkill.getText();
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_skill);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);
		// ******************** Search By Workmen Partner Code ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult1 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().contains("Partner Code")) {
				webElement.click();
				System.out.println("Search by Partner Code Selected");
				break;
			}
		}
		SearchWorkman_Partner_Code = Skill_Analysis_Objects.Skill_Analysis_Profile_Partner.getText().substring(0, 16);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Partner_Code);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		// ******************** Search By Workmen Name ********************
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().contains("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		SearchWorkman_Name = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenName.getText();
		System.out.println("Workmen Search Input :" + SearchWorkman_Name);
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(SearchWorkman_Name);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_search_btn));
		Skill_Analysis_Objects.Skill_Analysis_search_btn.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Clear_btn));
		Skill_Analysis_Objects.Skill_Analysis_Clear_btn.click();
		Thread.sleep(3000);

		System.out.println("Navigated to Skill Analysis");

		// ******************** End Workmen Search ********************
	}

	@Then("^Verify User can be able to View Workmen profile$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile() throws Throwable {

		Skill_Analysis_Objects.Skill_Analysis_search.click();
		Skill_Analysis_Objects.Skill_Analysis_search.clear();
		Skill_Analysis_Objects.Skill_Analysis_search.click();

		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions.perform();
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();

		String Workmanname = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenName.getText();
		String WorkmanNumber = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenNumber.getText();
		String WorkmenPartner = Skill_Analysis_Objects.Skill_Analysis_Profile_Partner.getText();
		String WorkmenSkill = Skill_Analysis_Objects.Skill_Analysis_Profile_WorkmenSkill.getText();
		System.out.println("Workmen Name : " + Workmanname);
		System.out.println("Workmen Number : " + WorkmanNumber);
		System.out.println("Partner Name : " + WorkmenPartner);
		System.out.println("Workmen Skill : " + WorkmenSkill);
		Screenshot.Screenshotforscenario();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmenPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		Actions actions_Keys = new Actions(DriverFactory.driver);
		actions_Keys.sendKeys(Keys.ESCAPE);
		actions_Keys.perform();
//		wait.until(
//				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
//		Thread.sleep(3000);
	}

	@Then("^Verify Basic details in Workmen profile are displayed correctly$")
	public static void Verify_Basic_in_details_Workmen_profile_are_displayed_correctly() throws Throwable {

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		actions2.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye.click();
		Profile_Basic.verify_workman_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Father_name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_DOB_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Gender_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Blood_Group_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Languages_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Marital_Status_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Spouse_Name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_No_Of_Childrens_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Enabled_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Number_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_details_is_displayed();
		Profile_Basic.verify_Partner_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_address_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Contact_number_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Email_ID_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.verify_Mobile_Number_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Emergency_Contact_Name_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Relationship_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Mobile_Number_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Address_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Village_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_District_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_State_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_PinCode_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Category_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Group_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Description_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Type_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Deployment_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Qualification_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Branch_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Discipline_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_School_or_College_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Board_or_University_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Year_of_Passing_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Organisation_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Location_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Code_or_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Category_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Group_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Description_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Aadhar_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Driving_License_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PAN_Card_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PF_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_UAN_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_ESI_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Name_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Relationship_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Allocation_Percentage_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_Name_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_No_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_IFSC_Or_IBAN_or_SWIFT_Code_in_Bank_Details_are_displayed_correctly_in_profile();

	}

	@Then("^Verify Skill Analysis in Workmen profile are displayed correctly$")
	public static void Verify_Skill_Analysis_in_Workmen_profile_are_displayed_correctly() throws Throwable {
		Profile_Skill_Analysis.verify_Skill_Description_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Project_Description_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Skill_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Percentage_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Test_Taken_on_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Status_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Restest_Date_in_Skill_Analysis_are_displayed_correctly_in_profile();

	}

	@Then("^Verify Medical Test in Workmen profile are displayed correctly$")
	public static void Verify_Medical_Test_in_Workmen_profile_are_displayed_correctly() throws Throwable {
		Profile_Medical_test.verify_Medicaltest_Due_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Skin_Temperature_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Color_of_Eyes_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Complexion_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Heart_Rate_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diabetics_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_SPO2_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Systolic_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diastolic_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Height_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Weight_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_BMI_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Identification_Marks_1_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Identification_Marks_2_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_the_secound_Skin_Temperature_in_Medical_Test_is_displayed_correctly_in_profile();
		Profile_Medical_test.verify_the_secound_color_of_Eyes_in_Medical_Test_is_displayed_correctly_in_profile();
		Profile_Medical_test.verify_the_secound_Complexion_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_BP_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Varicose_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Seizure_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Vertigo_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Acrophobia_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diabetes_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Stroke_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Heart_Disease_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Major_Illness_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Respiratory_Diseases_in_Medical_Test_are_displayed_correctly_in_profile();

	}

	@Then("^Verify EHS in Workmen profile are displayed correctly$")
	public static void Verify_EHS_in_Workmen_profile_are_displayed_correctly() throws Throwable {
		Profile_EHS.verify_Skill_Description_in_EHS_are_displayed_correctly_in_profile();
		Profile_EHS.verify_job_in_EHS_are_displayed_correctly_in_profile();
		Profile_EHS.verify_Training_Date_in_EHS_are_displayed_correctly_in_profile();
	}

	@Then("^Verify Wage in Workmen profile are displayed correctly$")
	public static void Verify_Wage_in_Workmen_profile_are_displayed_correctly() throws Throwable {
		Profile_Wage.verify_Wage_details_are_displayed_correctly_in_profile();
//		Actions actions = new Actions(DriverFactory.driver);
//		actions.sendKeys(Keys.ESCAPE);
//		actions.perform();

//		wait.until(
//				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();

		Actions actions_Keystest = new Actions(DriverFactory.driver);
		actions_Keystest.sendKeys(Keys.ESCAPE);
		actions_Keystest.perform();

		Thread.sleep(3000);
		Basic.PageLoader_Validation();

	}

	@Then("^Verify User can be able to select workmen and Proceed to Skill Test Manual$")
	public static void Verify_User_can_be_able_to_select_workmen_and_Proceed_to_Manual_Skill_Test() throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));

		// ========================================================
		Skill_Card_Count = Skill_Analysis_Objects.Skill_Analysis_card.size();
		System.out.println("Workmen Available For Skill Analysis :" + Skill_Card_Count);

		if (ConfigFileReader.getSkillAnalysis_all().equals("No")) {
			if (Skill_Card_Count > 3) {
//				System.out.println("Selecting 2 Workmen Profile for Skill Analysis");
//				Actions actions = new Actions(DriverFactory.driver);
//				actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_First_card);
//				actions.perform();
//				((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
//						Skill_Analysis_Objects.Skill_Analysis_First_card);
//				((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
//						Skill_Analysis_Objects.Skill_Analysis_secound_card);

				System.out.println("Selecting 1 Workmen Profile for Skill Analysis");
				Actions actions = new Actions(DriverFactory.driver);
				actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_First_card);
				actions.perform();
				((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
						Skill_Analysis_Objects.Skill_Analysis_First_card);

			} else {
				System.out.println("Selecting 1 Workmen Profile for Skill Analysis");
				Actions actions = new Actions(DriverFactory.driver);
				actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_First_card);
				actions.perform();
				((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
						Skill_Analysis_Objects.Skill_Analysis_First_card);
			}
		} else if (ConfigFileReader.getSkillAnalysis_all().equals("Yes")) {
			System.out.println("Selecting All Workmen Profile for Skill Analysis");
			ObjectsReporsitory.WMS_induction.click();

			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Dashboard_Skill_Analysis));
			Thread.sleep(5000);
			Skill_Analysis_Objects.Dashboard_Skill_Analysis.click();
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_First_card));
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_selectAllWorkmen));
			Skill_Analysis_Objects.Skill_Analysis_selectAllWorkmen.click();
			// This Should be changed - temp implentation
			if (Skill_Card_Count > 20) {
				System.out.println(
						"Workmen Count for skill analysis is more then 20 - Selecting Workmen Profile Manually ");
				Basic.popup_handle();
				wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_First_card));
				List<WebElement> listElements = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_all_Card;
				for (int i = 0; i < 20; i++) {
					listElements.get(i).click();
				}
			} else {
				System.out.println("All Workmen Selected");
			}
			// This Should be changed - temp implentation
		} else {
			System.out.println("Unable to Select Workmen");
		}
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Go_Next);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Go_Next));
		Skill_Analysis_Objects.Skill_Analysis_Go_Next.click();
	}

	@Then("^Verify User can be able verify Skill Analysis Details$")
	public static void Verify_User_can_be_able_verify_Skill_Analysis_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Accept));
		WorkmanName_SkillTable = Skill_Analysis_Objects.Skill_Analysis_table_workmenName.getText();
		WorkmanNumber_SkillTable = Skill_Analysis_Objects.Skill_Analysis_table_workmenNumber.getText();
		SkillDesc_SkillTable = Skill_Analysis_Objects.Skill_Analysis_table_Skill_Desc.getAttribute("value");
		System.out.println("Workmen Name : " + WorkmanName_SkillTable);
		System.out.println("Workmen Number : " + WorkmanNumber_SkillTable);
		System.out.println("Skill Description : " + SkillDesc_SkillTable);
	}

	@Then("^Verify User can be able to Enter Skill Analysis Details$")
	public static void Verify_User_can_be_able_to_Enter_Skill_Analysis_Details() throws Throwable {

		if (ConfigFileReader.getSkillAnalysis_all().equals("No")) {
			if (Skill_Card_Count > 3) {
				wait.until(ExpectedConditions
						.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1));
				Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.clear();
				Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.sendKeys("999");
				System.out.println("Total Questions : 999");
				Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.clear();
				Random rnd = new Random();
				long number1 = rnd.nextInt(927);
				Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.sendKeys("" + number1);
				System.out.println(Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1_workmenID.getText()
						+ " : Correct Answer = " + number1);

			} else {

				wait.until(ExpectedConditions
						.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1));
				Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.clear();
				Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.sendKeys("999");
				System.out.println("Total Questions : 999");
				Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.clear();
				Random rnd = new Random();
				long number1 = rnd.nextInt(927);
				Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.sendKeys("" + number1);
				System.out.println(Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1_workmenID.getText()
						+ " : Correct Answer = " + number1);
			}
		} else if (ConfigFileReader.getSkillAnalysis_all().equals("Yes")) {

			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1));

			TotalQuestiones_allElements = Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones_allElements.size();
			List<WebElement> TotalQue_listElements = Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones_allElements;
			for (int i = 0; i < TotalQuestiones_allElements; i++) {
				TotalQue_listElements.get(i).sendKeys("999");
			}

			TotalAnswer_allElements = Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers_AllElements.size();
			List<WebElement> Answers_listElements = Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones_allElements;
			for (int i = 0; i < TotalQuestiones_allElements; i++) {
				Answers_listElements.get(i).clear();
				Random RandomNumber = new Random();
				long Mark = RandomNumber.nextInt(927);
				Answers_listElements.get(i).sendKeys("" + Mark);
				System.out.println("Correct Answer : " + i + " : " + Mark);
			}

		}

		else {
			System.out.println("No Workmen Available");
		}

	}

	@Then("^Verify User can be able to Accept or Reject Workmen Skill Analysis$")
	public static void Verify_User_can_be_able_to_Accept_or_reject_Workmen_Skill_Analysis() throws Throwable {

		Percentage = Float.parseFloat(Skill_Analysis_Objects.Skill_Analysis_Percentage.getText());
		System.out.println("Manual Test Percentage : " + Percentage);
		if (Percentage > 40) {
			System.out.println("Skill Analysis Accept");
			Skill_Analysis_Objects.Skill_Analysis_Accept.click();
//			Skill_Analysis_Objects.Skill_Analysis_skillDescription.click();
//			List<WebElement> DropdownResult = ObjectsReporsitory.Personal_Language_Languageselect_DR;
//			for (WebElement webElement : DropdownResult) {
//				if (webElement.getText().equals(ConfigFileReader.getSkillDesciprion())) {
//					webElement.click();
//					System.out.println("Skill Description : " + ConfigFileReader.getSkillDesciprion());
//					break;
//				}
//			}

			Skill_Analysis_Objects.Skill_Analysis_skillType.click();
			List<WebElement> DropdownResult2 = Skill_Analysis_Objects.Skill_Analysis_skillType_dr;
			if (ConfigFileReader.getselect_skillType_Value().contains("Random")) {
				System.out.println("Selecting Random skillType");
				Random rand78523 = new Random();
				int skillType_SA = rand78523.nextInt(ObjectsReporsitory.skillType_DR.size());
				Selected_skillType_SA = ObjectsReporsitory.skillType_DR.get(skillType_SA).getText();

				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals(Selected_skillType_SA)) {
						webElement.click();
						Thread.sleep(3000);
						System.out.println(Skill_Analysis_Objects.Skill_Analysis_skillType.getAttribute("value")
								+ " : skillType Selected ");
						break;
					}
				}

			} else {

				for (WebElement webElement : DropdownResult2) {
					if (webElement.getText().equals(ConfigFileReader.getSkillType())) {
						webElement.click();
						System.out.println("Skill Type : " + ConfigFileReader.getSkillType());
						break;
					}
				}
			}

		} else {
			System.out.println("Skill Analysis Reject");
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Reject));
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Reject);
			// Skill_Analysis_Objects.Skill_Analysis_Reject.click();
			wait.until(
					ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));
			Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
			Thread.sleep(5000);

			if (Skill_Analysis_Objects.Paramedics_MedicalTestDate_Size.size() > 0) {
				Actions actions222 = new Actions(DriverFactory.driver);
				actions222.moveToElement(Skill_Analysis_Objects.Paramedics_MedicalTestDate);
				actions222.perform();
				wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_MedicalTestDate));
				Skill_Analysis_Objects.Paramedics_MedicalTestDate.click();
				System.out.println("Retest date selected from 15 Days after Today");
			} else if (Skill_Analysis_Objects.Paramedics_MedicalTestDate_Size.size() == 0) {
				if (Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week_Size.size() > 0) {
					Actions actions222 = new Actions(DriverFactory.driver);
					actions222.moveToElement(Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week);
					actions222.perform();
					wait.until(ExpectedConditions
							.elementToBeClickable(Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week));
					Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week.click();
					System.out.println("Retest date selected from 15 Days after Today");
				}
			}
			Thread.sleep(5000);
			// System.out.println("Next Examination Date :
			// "+Skill_Analysis_Objects.Skill_Analysis_DateSelected.getText());
		}
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		Basic.PageLoader_Validation();

	}

	@Then("^Verify User can be able to View Skill Test History$")
	public static void Verify_User_can_be_able_to_View_Skill_Test_History() throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));
		System.out.println("Selecting 1 Workmen Profile for Skill Analysis - Skill Test History");
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_First_card);
		actions.perform();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_First_card);

		Actions actions200 = new Actions(DriverFactory.driver);
		actions200.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Go_Next);
		actions200.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Go_Next));
		Skill_Analysis_Objects.Skill_Analysis_Go_Next.click();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_skillTestHistory));
		Skill_Analysis_Objects.Skill_Analysis_skillTestHistory.click();
		Thread.sleep(2000);

		// =============================
		System.out
				.println("Skill Test History Count:" + Skill_Analysis_Objects.Profile_Skill_History_Description.size());

		if (Skill_Analysis_Objects.Profile_Skill_History_Description.size() > 0) {
			List<WebElement> searchResult = Skill_Analysis_Objects.Profile_Skill_History_Description;
			String Skill_Description = searchResult.get((searchResult.size() - 1)).getText();
			System.out.println("Skill Description : " + Skill_Description);

			List<WebElement> searchResult2 = Skill_Analysis_Objects.Profile_Skill_History_Project_Description;
			String Skill_Description2 = searchResult.get((searchResult2.size() - 1)).getText();
			System.out.println("Skill History Project Description : " + Skill_Description2);

			List<WebElement> searchResult3 = Skill_Analysis_Objects.Profile_Skill_History_SkillType;
			String Skill_Description3 = searchResult.get((searchResult3.size() - 1)).getText();
			System.out.println("Skill History Skill Type : " + Skill_Description3);

			List<WebElement> searchResult4 = Skill_Analysis_Objects.Profile_Skill_History_Percentage;
			String Skill_Description4 = searchResult.get((searchResult4.size() - 1)).getText();
			System.out.println("Skill History Test Percentage : " + Skill_Description4);

			List<WebElement> searchResult5 = Skill_Analysis_Objects.Profile_Skill_History_TestTakenOn;
			String Skill_Description5 = searchResult.get((searchResult5.size() - 1)).getText();
			System.out.println("Skill History Test Taken on : " + Skill_Description5);

			List<WebElement> searchResult6 = Skill_Analysis_Objects.Profile_Skill_History_Status;
			String Skill_Description6 = searchResult.get((searchResult6.size() - 1)).getText();
			System.out.println("Skill History Status : " + Skill_Description6);

			List<WebElement> searchResult7 = Skill_Analysis_Objects.Profile_Skill_History_RetestDate;
			String Skill_Description7 = searchResult.get((searchResult7.size() - 1)).getText();
			System.out.println("Skill History Retest Date : " + Skill_Description7);

			List<WebElement> searchResult8 = Skill_Analysis_Objects.Profile_Skill_History_Action;
			String Skill_Description8 = searchResult.get((searchResult8.size() - 1)).getText();
			System.out.println("Skill History Retest Date : " + Skill_Description8);

		} else {
			System.out.println("Workmen Skill not yet Analysed - Skill Description Not Available");
		}

		Screenshot.Screenshotforscenario();
		Skill_Analysis_Objects.Skill_Analysis_SkillTestHistory_Close.click();
		Thread.sleep(5000);
	}

	@Then("^Verify User can be able to add attachment$")
	public static void Verify_User_can_be_able_to_add_attachment() throws Throwable {

		Skill_Analysis_Objects.Skill_Analysis_UploadDocument.click();
		// Error ** Need to implement after Fix
	}

	@Then("^Verify User can be able to view Workmen profile table$")
	public static void Verify_User_can_be_able_to_view_Workmen_profile_table() throws Throwable {
		Skill_Analysis_Objects.Skill_Analysis_Profile_table.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails));
		// Basic Details
		Profile_Basic.verify_workman_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Father_name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_DOB_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Gender_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Blood_Group_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Languages_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Marital_Status_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Spouse_Name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_No_Of_Childrens_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Enabled_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Number_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_details_is_displayed();
		Profile_Basic.verify_Partner_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_address_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Contact_number_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Email_ID_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.verify_Mobile_Number_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Emergency_Contact_Name_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Relationship_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Mobile_Number_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Address_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Village_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_District_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_State_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_PinCode_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Category_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Group_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Description_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Type_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Deployment_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Qualification_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Branch_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Discipline_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_School_or_College_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Board_or_University_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Year_of_Passing_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Organisation_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Location_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Code_or_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Category_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Group_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Description_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Aadhar_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Driving_License_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PAN_Card_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PF_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_UAN_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_ESI_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Name_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Relationship_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Allocation_Percentage_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_Name_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_No_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_IFSC_Or_IBAN_or_SWIFT_Code_in_Bank_Details_are_displayed_correctly_in_profile();
		// Skill Analysis
		Profile_Skill_Analysis.verify_Skill_Description_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Project_Description_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Skill_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Percentage_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Test_Taken_on_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Status_in_Skill_Analysis_are_displayed_correctly_in_profile();
		Profile_Skill_Analysis.verify_Restest_Date_in_Skill_Analysis_are_displayed_correctly_in_profile();
		// Medical Test
		Profile_Medical_test.verify_Medicaltest_Due_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Skin_Temperature_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diabetics_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_SPO2_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Systolic_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diastolic_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Height_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Weight_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_BMI_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Identification_Marks_1_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Identification_Marks_2_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Heart_Rate_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_the_secound_Skin_Temperature_in_Medical_Test_is_displayed_correctly_in_profile();
		Profile_Medical_test.verify_BP_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Varicose_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Seizure_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Vertigo_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Acrophobia_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Diabetes_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Stroke_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Heart_Disease_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Major_Illness_in_Medical_Test_are_displayed_correctly_in_profile();
		Profile_Medical_test.verify_Respiratory_Diseases_in_Medical_Test_are_displayed_correctly_in_profile();
		// EHS
		Profile_EHS.verify_Skill_Description_in_EHS_are_displayed_correctly_in_profile();
		Profile_EHS.verify_job_in_EHS_are_displayed_correctly_in_profile();
		Profile_EHS.verify_Training_Date_in_EHS_are_displayed_correctly_in_profile();
		// Wage
		Profile_Wage.verify_Wage_details_are_displayed_correctly_in_profile();
		Actions actions_Keys = new Actions(DriverFactory.driver);
		actions_Keys.sendKeys(Keys.ESCAPE);
		actions_Keys.perform();
//		Skill_Analysis_Objects.Workmen_Profile_Close.click();
	}

	@Then("^Verify User can be able to remove record$")
	public static void Verify_User_can_be_able_to_remove_record() throws Throwable {

		Screenshot.Screenshotforscenario();
		Skill_Analysis_Objects.Skill_Analysis_Remove.click();

		try {
			System.out.println("Accepting Alert to remove skill record");
			DriverFactory.driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify User can be able to Accept Workmen Skill Analysis$")
	public static void Verify_User_can_be_able_to_Accept_Workmen_Skill_Analysis() throws Throwable {

		Percentage = Float.parseFloat(Skill_Analysis_Objects.Skill_Analysis_Percentage.getText());
		System.out.println("Manual Test Percentage : " + Percentage);

		System.out.println("Skill Analysis Accept");
		Skill_Analysis_Objects.Skill_Analysis_Accept.click();
		Skill_Analysis_Objects.Skill_Analysis_skillDescription.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_Language_Languageselect_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getSkillDesciprion())) {
				webElement.click();
				System.out.println("Skill Description : " + ConfigFileReader.getSkillDesciprion());
				break;
			}
		}

		Skill_Analysis_Objects.Skill_Analysis_skillType.click();
		List<WebElement> DropdownResult2 = Skill_Analysis_Objects.Skill_Analysis_skillType_dr;
		for (WebElement webElement : DropdownResult2) {
			if (webElement.getText().equals(ConfigFileReader.getSkillType())) {
				webElement.click();
				System.out.println("Skill Type : " + ConfigFileReader.getSkillType());
				break;
			}
		}

		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Screenshot.Screenshotforscenario();
		Basic.PageLoader_Validation();
		Basic.popup_handle();

	}

	@Then("^Verify User can be able to Reject Workmen Skill Analysis$")
	public static void Verify_User_can_be_able_to_Reject_Workmen_Skill_Analysis() throws Throwable {

		Percentage = Float.parseFloat(Skill_Analysis_Objects.Skill_Analysis_Percentage.getText());
		System.out.println("Manual Test Percentage : " + Percentage);

		System.out.println("Skill Analysis Reject");
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Reject));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Reject);
		// Skill_Analysis_Objects.Skill_Analysis_Reject.click();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));
		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(5000);
		Actions actions222 = new Actions(DriverFactory.driver);
		actions222.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate);
		actions222.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate));
		Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate.click();
		System.out.println("Skill Analysis Retest date selected from 15 Days after Today");
		Thread.sleep(5000);
		// System.out.println("Next Examination Date :
		// "+Skill_Analysis_Objects.Skill_Analysis_DateSelected.getText());

		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Screenshot.Screenshotforscenario();
		Basic.PageLoader_Validation();
		Basic.popup_handle();

	}

	@Then("^Verify User can be able to select multiple workmen and Proceed to Skill Test$")
	public static void Verify_User_can_be_able_to_select_multiple_workmen_and_Proceed_to_Manual_Skill_Test()
			throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));

		// ========================================================
		Skill_Card_Count = Skill_Analysis_Objects.Skill_Analysis_card.size();
		System.out.println("Workmen Available For Skill Analysis :" + Skill_Card_Count);

		if (Skill_Card_Count > 3) {

			System.out.println("Workmen Count for skill analysis is more then 3 - Selecting 2 Workmen Profile");
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_First_card));
			List<WebElement> listElements = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_all_Card;
			for (int i = 0; i < 2; i++) {
				listElements.get(i).click();
			}
		}
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Go_Next);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Go_Next));
		Skill_Analysis_Objects.Skill_Analysis_Go_Next.click();
	}

	@Then("^Verify User can be able to select Single workmen and Proceed to Skill Test$")
	public static void Verify_User_can_be_able_to_select_Single_workmen_and_Proceed_to_Manual_Skill_Test()
			throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));

		// ========================================================
		Skill_Card_Count = Skill_Analysis_Objects.Skill_Analysis_card.size();
		System.out.println("Workmen Available For Skill Analysis :" + Skill_Card_Count);

		System.out.println("Selecting 1 Workmen Profile for Skill Analysis");
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_First_card);
		actions.perform();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_First_card);

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Go_Next);
		actions2.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Go_Next));
		Skill_Analysis_Objects.Skill_Analysis_Go_Next.click();
	}

	@Then("^Verify Basic details in Workmen profile are displayed correctly for medical test$")
	public static void Verify_Basic_in_details_Workmen_profile_are_displayed_correctly_for_medical_test()
			throws Throwable {

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		actions2.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye.click();
		Profile_Basic.verify_workman_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Father_name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_DOB_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Gender_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Blood_Group_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Languages_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_workman_Marital_Status_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Spouse_Name_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_No_Of_Childrens_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Enabled_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_CSTI_or_NAPS_Number_in_Personal_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_details_is_displayed();
		Profile_Basic.verify_Partner_name_in_Personal_details_is_displayed_correctly_in_profile();
		Profile_Basic.Verify_Partner_address_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Contact_number_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.Verify_Partner_Email_ID_in_Personal_details_is_displayed_in_profile();
		Profile_Basic.verify_Mobile_Number_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Permanent_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_Village_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_District_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_State_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Temporary_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Emergency_Contact_Name_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Relationship_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic
				.Verify_Emergency_Contact_Mobile_Number_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Address_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_Village_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_District_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_State_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Emergency_Contact_PinCode_in_Communication_details_is_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Category_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Group_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Description_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.verify_Skill_Type_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Deployment_in_Basic_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Qualification_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Branch_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Discipline_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_School_or_College_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Board_or_University_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Year_of_Passing_in_Education_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Organisation_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Location_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Project_Code_or_Name_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Category_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Group_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Skill_Description_in_Experience_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Aadhar_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Driving_License_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PAN_Card_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_PF_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_UAN_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_ESI_No_in_Statutory_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Name_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Relationship_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Allocation_Percentage_in_PF_Nominee_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_Name_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_Account_No_in_Bank_Details_are_displayed_correctly_in_profile();
		Profile_Basic.Verify_IFSC_Or_IBAN_or_SWIFT_Code_in_Bank_Details_are_displayed_correctly_in_profile();

	}
}
