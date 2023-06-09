package stepdefinition.Configuration.Regulatory_Compliance;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.ArrayList;

public class Regulatory_Compliance {

	public static String Selected_LA;
	public static int Random_E_ID;
	public static String Selected_State;
	public static String Selected_Zone;
	public static int Random_StatutoryAct;
	public static String Selected_Job;

	// Page Factory
	public Regulatory_Compliance() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************
	public static ConfigFileReader configFileReader;

	@Given("^Login and Navigate to Configuration$")
	public static void Login_and_Navigate_to_Configuration() throws Throwable {

		stepdefinition.Login.Configuration_login();

		// Navigate to Configuration

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		// ObjectsReporsitory.Menu_Navigation_Open.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS40));
		ObjectsReporsitory.WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_sidenav));
		ObjectsReporsitory.WMS_Configuration_sidenav.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_saveAuthorityBtn));
		System.out.println("Navigated to Configuration");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to select Job$")
	public static void Verify_User_can_be_able_to_select_Job() throws Throwable {
		System.out.println("Selecting Job for Configuration");
		System.out.println("---------------------------------------");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_Jobcode));
		ObjectsReporsitory.WMS_Configuration_Jobcode.click();
		List<WebElement> DropdownResultdasdas4 = ObjectsReporsitory.WMS_Configuration_Jobcode_DR;

		if (ConfigFileReader.getRegulatory_Compliance_Job_selection_type().contains("Random")) {

			Random rand6547daadss = new Random();
			int Job = rand6547daadss.nextInt(ObjectsReporsitory.WMS_Configuration_Jobcode_DR.size());
			Selected_Job = ObjectsReporsitory.WMS_Configuration_Jobcode_DR.get(Job).getText();

			for (WebElement webElement : DropdownResultdasdas4) {
				if (webElement.getText().equals(Selected_Job)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(
							"Job Selected :" + ObjectsReporsitory.WMS_Configuration_Jobcode.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}
		} else {
			ObjectsReporsitory.WMS_Configuration_Jobcode.sendKeys(ConfigFileReader.getconfigurationjob());
			Thread.sleep(2000);
			for (WebElement webElement : DropdownResultdasdas4) {
				if (webElement.getText().contains(ConfigFileReader.getconfigurationjob())) {
					webElement.click();
					System.out.println(
							"Job Selected :" + ObjectsReporsitory.WMS_Configuration_Jobcode.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_Jobcode_Go));
		ObjectsReporsitory.WMS_Configuration_Jobcode_Go.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Regulatory_Compliance));
		
	}

	@Then("^Verify User can be able to select Regulatory Compliance License Authority of Authority$")
	public static void Verify_User_can_be_able_to_select_Regulatory_Compliance_License_Authority_of_Authority()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Regulatory_Compliance));
		ObjectsReporsitory.WMS_Configuration_tab_Regulatory_Compliance.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority));
		ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority.click();

		List<WebElement> DropdownResult4rea = ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority_DR;

		if (ConfigFileReader.getconfigurationLASelection().contains("Input")) {
			for (WebElement webElement : DropdownResult4rea) {
				if (webElement.getText().contains(ConfigFileReader.getconfigurationLAinputvalue())) {
					webElement.click();
					System.out.println("License Authority Selected :"
							+ ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		} else if (ConfigFileReader.getconfigurationLASelection().contains("Random")) {

			Random rand6547das = new Random();
			int LA = rand6547das.nextInt(ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority_DR.size());
			Selected_LA = ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority_DR.get(LA).getText();

			for (WebElement webElement : DropdownResult4rea) {
				if (webElement.getText().equals(Selected_LA)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("License Authority Selected :"
							+ ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}

		} else {
			for (WebElement webElement : DropdownResult4rea) {
				if (webElement.getText().contains(ConfigFileReader.getconfigurationLAinputvalue())) {
					webElement.click();
					System.out.println("License Authority Selected :"
							+ ObjectsReporsitory.WMS_Configuration_RC_Authority_LCAuthority.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		}
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify User can be able to enter Regulatory Compliance Establishment ID of Authority$")
	public static void Verify_User_can_be_able_to_enter_Regulatory_Compliance_Establishment_ID_of_Authority()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Regulatory_Compliance));
		ObjectsReporsitory.WMS_Configuration_tab_Regulatory_Compliance.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_Authority_EstablishmentID));
		ObjectsReporsitory.WMS_Configuration_RC_Authority_EstablishmentID.click();
		ObjectsReporsitory.WMS_Configuration_RC_Authority_EstablishmentID.clear();
		ObjectsReporsitory.WMS_Configuration_RC_Authority_EstablishmentID.click();
		String randomString = Basic.RandomStringGenerator.generateRandomAlphaNumeric(10);
		ObjectsReporsitory.WMS_Configuration_RC_Authority_EstablishmentID.sendKeys(randomString);
		System.out.println("Establishment ID : " + randomString);
		System.out.println("---------------------------------------");
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify User can be able to View Minimum Wage Applicable Zone for Location$")
	public static void Verify_User_can_be_able_to_View_Minimum_Wage_Applicable_Zone_for_Location() throws Throwable {

		System.out.println("View Minimum Wage Applicable Zone for Location");
		System.out.println("---------------------------------------");
		System.out.println(ObjectsReporsitory.WMS_Configuration_RC_minwage.getText());
		System.out.println("---------------------------------------");
	}

	@Then("^Verify User can be able to select Regulatory Compliance State in Location$")
	public static void Verify_User_can_be_able_to_select_Regulatory_Compliance_State_in_Location() throws Throwable {

		System.out.println("Selecting State");
		System.out.println("---------------------------------------");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_State));
		ObjectsReporsitory.WMS_Configuration_RC_State.click();

		List<WebElement> DropdownResultasd4 = ObjectsReporsitory.WMS_Configuration_RC_State_DR;

		if (ConfigFileReader.getconfigurationLocationStateSelection().contains("Input")) {
			for (WebElement webElement : DropdownResultasd4) {
				if (webElement.getText().contains(ConfigFileReader.getgetconfigurationstateInput())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("State Selected :" + ObjectsReporsitory.WMS_Configuration_RC_State.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		} else if (ConfigFileReader.getconfigurationLocationStateSelection().contains("Random")) {

			Random rand6547dadass = new Random();
			int State = rand6547dadass.nextInt(ObjectsReporsitory.WMS_Configuration_RC_State_DR.size());
			Selected_State = ObjectsReporsitory.WMS_Configuration_RC_State_DR.get(State).getText();

			for (WebElement webElement : DropdownResultasd4) {
				if (webElement.getText().equals(Selected_State)) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("State Selected :" + ObjectsReporsitory.WMS_Configuration_RC_State.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}

		} else {
			for (WebElement webElement : DropdownResultasd4) {
				if (webElement.getText().contains(ConfigFileReader.getgetconfigurationstateInput())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("State Selected :" + ObjectsReporsitory.WMS_Configuration_RC_State.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		}
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify User can be able to select Regulatory Compliance Zone in Location$")
	public static void Verify_User_can_be_able_to_select_Regulatory_Compliance_Zone_in_Location() throws Throwable {

		System.out.println("Selecting Zone");
		System.out.println("---------------------------------------");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_Zone));
		ObjectsReporsitory.WMS_Configuration_RC_Zone.click();

		List<WebElement> DropdownResultasd4 = ObjectsReporsitory.WMS_Configuration_RC_Zone_DR;

		if (ConfigFileReader.getconfigurationLocationZoneSelection().contains("Input")) {
			for (WebElement webElement : DropdownResultasd4) {
				if (webElement.getText().contains(ConfigFileReader.getgetconfigurationZoneInput())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("Zone Selected :" + ObjectsReporsitory.WMS_Configuration_RC_Zone.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		} else if (ConfigFileReader.getconfigurationLocationZoneSelection().contains("Random")) {

			Random rand6547dadass = new Random();
			int Zone = rand6547dadass.nextInt(ObjectsReporsitory.WMS_Configuration_RC_Zone_DR.size());
			Selected_Zone = ObjectsReporsitory.WMS_Configuration_RC_Zone_DR.get(Zone).getText();

			for (WebElement webElement : DropdownResultasd4) {
				if (webElement.getText().equals(Selected_Zone)) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("Zone Selected :" + ObjectsReporsitory.WMS_Configuration_RC_Zone.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}

		} else {
			for (WebElement webElement : DropdownResultasd4) {
				if (webElement.getText().contains(ConfigFileReader.getgetconfigurationZoneInput())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("Zone Selected :" + ObjectsReporsitory.WMS_Configuration_RC_Zone.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		}
		
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify User can be able to Add Regulatory Compliance Location$")
	public static void Verify_User_can_be_able_to_Add_Regulatory_Compliance_Location() throws Throwable {

		System.out.println("Adding Regulatory Compliance Location");
		System.out.println("---------------------------------------");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_Add_location));
		ObjectsReporsitory.WMS_Configuration_RC_Add_location.click();
		Thread.sleep(3000);
		Screenshot.Screenshotforscenario();
		System.out.println("Regulatory Compliance Location Added");
		System.out.println("---------------------------------------");

	}

	@Then("^Verify User can be able to view Regulatory Compliance all Statutory Act$")
	public static void Verify_User_can_be_able_to_view_Regulatory_Compliance_all_Statutory_Act() throws Throwable {
		System.out.println("View all Statutory Act");
		System.out.println("**************************************");

		for (WebElement elementName : ObjectsReporsitory.WMS_Configuration_RC_StatutoryAct_List) {
			String StatutoryAct = elementName.getText();
			System.out.println("Statutory Act : " + StatutoryAct);

		}
		System.out.println("**************************************");
	}

	@Then("^Verify User can be able to select Regulatory Compliance Statutory Act$")
	public static void Verify_User_can_be_able_to_select_Regulatory_Compliance_Statutory_Act() throws Throwable {

		System.out.println("Selecting Regulatory Compliance Statutory Act");
		System.out.println("---------------------------------------");

		int Total_StatutoryAct = ObjectsReporsitory.WMS_Configuration_RC_StatutoryAct_List.size();

		int min_StatutoryAct = 1;
		int max_StatutoryAct = Total_StatutoryAct;
		Random rand7 = new Random();
		Random_StatutoryAct = rand7.nextInt(max_StatutoryAct - min_StatutoryAct) + min_StatutoryAct;

		System.out.println("Selecting Random Statutory Act");
		List<WebElement> elements = ObjectsReporsitory.WMS_Configuration_RC_StatutoryAct_List;

		// Generate random indices
		Random random = new Random();
		List<Integer> randomIndices = new ArrayList<>();
		int listSize = elements.size();
		while (randomIndices.size() < Random_StatutoryAct) {
			int randomIndex = random.nextInt(listSize);
			if (!randomIndices.contains(randomIndex)) {
				randomIndices.add(randomIndex);
			}
		}

		// Click on the random elements
		for (int index : randomIndices) {
			WebElement element = elements.get(index);
			element.click();
		}

		Screenshot.Screenshotforscenario();
		
		System.out.println("Regulatory Compliance Statutory Act selected");
		System.out.println("---------------------------------------");
	}

	@Then("^Verify User can be able to upload Regulatory Compliance Project Manager Signature$")
	public static void Verify_User_can_be_able_to_upload_Regulatory_Compliance_Project_Manager_Signature()
			throws Throwable {

		System.out.println("uploading Regulatory Compliance Project Manager Signature");
		System.out.println("---------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_PM_Sign));
		ObjectsReporsitory.WMS_Configuration_PM_Sign
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getPMSign_File());
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		System.out.println("uploading Completed");
		System.out.println("---------------------------------------");

	}

	@Then("^Verify User can be able to upload Regulatory Compliance Project Director Signature$")
	public static void Verify_User_can_be_able_to_upload_Regulatory_Compliance_Project_Director_Signature()
			throws Throwable {

		System.out.println("uploading Regulatory Compliance Project Manager Signature");
		System.out.println("---------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_PD_Sign));
		ObjectsReporsitory.WMS_Configuration_PD_Sign
				.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getPDSign_File());
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		System.out.println("uploading Completed");
		System.out.println("---------------------------------------");

	}

	@Then("^Verify User can be able to save Regulatory Compliance details$")
	public static void Verify_User_can_be_able_to_save_Regulatory_Compliance_details() throws Throwable {

		System.out.println("Saving Regulatory Compliance Details");
		System.out.println("---------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RC_saveAuthorityBtn));
		ObjectsReporsitory.WMS_Configuration_RC_saveAuthorityBtn.click();
		Thread.sleep(5000);
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Thread.sleep(2000);
		Basic.popup_validation();
		System.out.println("Regulatory Compliance Details are saved");
		System.out.println("---------------------------------------");

	}

}
