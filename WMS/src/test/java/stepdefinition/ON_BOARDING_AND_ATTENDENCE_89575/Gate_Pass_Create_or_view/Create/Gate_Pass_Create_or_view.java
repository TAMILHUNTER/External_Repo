package stepdefinition.ON_BOARDING_AND_ATTENDENCE_89575.Gate_Pass_Create_or_view.Create;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import stepdefinition.Wage.Validation.Verification_Popup_Wage;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import test.DataBaseConnection;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Gate_Pass_Create_or_view {

	public static int Skill_Analyisis_Count;
	public static int popup_validation;

// Page Factory
	public Gate_Pass_Create_or_view() {
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

	@Then("^Verify User can be able to search Workmen Profile Gate Pass$")
	public static void Verify_User_can_be_able_to_search_Workmen_Profile_Medical_Test() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Issue");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Issue")) {
				webElement.click();
				System.out.println("Selected Gate Pass Issue");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
//		Workman_Search.Verify_User_can_able_to_search_Workman_by_ID_MedicalTest();

//wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));

// Workmen Search By Workmen Name Partner Name 		
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		List<WebElement> DropdownResult1 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().equals("Partner Code")) {
				webElement.click();
				System.out.println("Search by Partner Name Selected");
				break;
			}
		}
		System.out.println("Workman Search Input :" + ConfigFileReader.getSkillWorkman_Partner());
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.clear();
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.sendKeys(ConfigFileReader.getSkillWorkman_Partner());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
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

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
		ObjectsReporsitory.GatePass_Clear.click();

// Workmen Search By Workmen Name 		
		// Workman_Search.Verify_User_can_able_to_search_Workmen_by_Name();
//		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().equals("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		System.out.println("Workmen Search Input :" + ConfigFileReader.getSkillWorkman_Name());
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.clear();
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.sendKeys(ConfigFileReader.getSkillWorkman_Name());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
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

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
		ObjectsReporsitory.GatePass_Clear.click();

// Workmen Search By Workmen Name Workmen ID		

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult12 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult12) {
			if (webElement.getText().equals("Workmen Number")) {
				webElement.click();
				System.out.println("Search by Workmen Number Selected");
				break;
			}
		}

		DataBaseConnection.GetWorkmanID_gatePass();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
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

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
		ObjectsReporsitory.GatePass_Clear.click();

	}

	@Then("^Verify User can be able to View Workmen profile Gate Pass$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile() throws Throwable {

		// Workmen Search By Workmen Name
		// Workman_Search.Verify_User_can_able_to_search_Workmen_by_Name();
//				wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_searchBy));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_searchBy);
		Thread.sleep(5000);
		List<WebElement> DropdownResult11 = Skill_Analysis_Objects.Skill_Analysis_searchBy_DR;
		for (WebElement webElement : DropdownResult11) {
			if (webElement.getText().equals("Workmen Name")) {
				webElement.click();
				System.out.println("Search by Workmen Name Selected");
				break;
			}
		}
		System.out.println("Workmen Search Input :" + ConfigFileReader.getSkillWorkman_Name());
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.clear();
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.sendKeys(ConfigFileReader.getSkillWorkman_Name());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));
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

		Actions actions564 = new Actions(DriverFactory.driver);
		actions564.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions564.perform();
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();

		String Workmanname = Skill_Analysis_Objects.GatePass_Profile_WorkmenName_lastCard.getText();
		String WorkmanNumber = Skill_Analysis_Objects.GatePass_Profile_WorkmenNumber_lastCard.getText();
		String WorkmenPartner = Skill_Analysis_Objects.GatePass_Profile_Partner_lastCard.getText();
		String WorkmenSkill = Skill_Analysis_Objects.GatePass_Profile_WorkmenSkill_lastCard.getText();
		System.out.println("Workmen Name : " + Workmanname);
		System.out.println("Workmen Number : " + WorkmanNumber);
		System.out.println("Partner Name : " + WorkmenPartner);
		System.out.println("Workmen Skill : " + WorkmenSkill);
		Screenshot.Screenshotforscenario();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.GatePass_Workman_Profile_Eye);
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

	@Given("^Login and Navigate to Gate Pass$")
	public static void Login_and_Navigate_to_Gate_Pass() throws Throwable {

		Login.Use_Login_Induction_Basic();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS40));
		ObjectsReporsitory.WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
		ObjectsReporsitory.WMS_induction2.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_GatePass));
		ObjectsReporsitory.Menu_GatePass.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		System.out.println("Navigated to Gate Pass");

	}

	@Then("^Verify User can be able to Issue Gate Pass$")
	public static void Verify_User_can_be_able_to_Issue_Gate_Pass() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Issue");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Issue")) {
				webElement.click();
				System.out.println("Selected Gate Pass Issue");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 1) {

			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}

	}

	@Then("^Verify User can be able to Renew Gate Pass No Records$")
	public static void Verify_User_can_be_able_to_Renew_Gate_Pass_No_Records() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Renewal");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Renewal")) {
				webElement.click();
				System.out.println("Selected Gate Pass Renewal");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		DataBaseConnection.getgatepassRenewal_noRecord(); // updating records
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}

	}

	@Then("^Verify User can be able to Renew Gate Pass With Records$")
	public static void Verify_User_can_be_able_to_Renew_Gate_Pass_With_Records() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Renewal");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Renewal")) {
				webElement.click();
				System.out.println("Selected Gate Pass Renewal");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		DataBaseConnection.getgatepassRenewal(); // updating records
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}

	}

	@Then("^Verify User can be able to Blacklist Workmen$")
	public static void Verify_User_can_be_able_to_Blacklist_Workmen() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("BlackList");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("BlackList")) {
				webElement.click();
				System.out.println("Selected Gate Pass BlackList");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_blocklist_Reason));
			ObjectsReporsitory.Gatepass_blocklist_Reason.click();
			ObjectsReporsitory.Gatepass_blocklist_Reason.clear();
			ObjectsReporsitory.Gatepass_blocklist_Reason.click();
			ObjectsReporsitory.Gatepass_blocklist_Reason.sendKeys(ConfigFileReader.getblocklistReason());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Thread.sleep(5000);
			
			
			popup_validation = ObjectsReporsitory.basic_popup_validation.size();
			if (popup_validation == 1) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions
						.elementToBeClickable(ObjectsReporsitory.Gatepass_blocklist_Confirmation_Yes));
				ObjectsReporsitory.Gatepass_blocklist_Confirmation_Yes.click();
				Screenshot.Screenshotforscenario();
				Basic.popup_handle();

			} else if (popup_validation == 0) {
				System.out.println("BlockList Confirmation Not displayed");
			}

			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}

	}

	@Then("^Verify User can be able to Temporary Release Workmen$")
	public static void Verify_User_can_be_able_to_Temporary_Release_Workmen() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Temporary Release");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Temporary Release")) {
				webElement.click();
				System.out.println("Selected Gate Pass Temporary Release");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}

	}

	@Then("^Verify User can be able to Permanent Release Workmen$")
	public static void Verify_User_can_be_able_to_Permanent_Release_Workmen() throws Throwable {

		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Permanent Release");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Permanent Release")) {
				webElement.click();
				System.out.println("Selected Gate Pass Permanent Release");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Basic.popup_handle();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}
		
	}

	@Then("^Verify User can be able to load more workmen profile by clicking Load more option$")
	public static void Verify_User_can_be_able_to_load_more_workmen_profile_by_clicking_Load_more_option() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Temporary Release");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Temporary Release")) {
				webElement.click();
				System.out.println("Selected Gate Pass Temporary Release");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.gatePass_Loadmore);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_Loadmore));
			ObjectsReporsitory.gatePass_Loadmore.click();
			
			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			System.out.println("User can able to load more workmen profile");
			System.out.println("---------------------------------------------");
			System.out.println("Workmen Card : " +Profile_AllCrds);
		}
		
	}

	
	
	@Then("^Verify User can be able to Blacklist Workmen without reason$")
	public static void Verify_User_can_be_able_to_Blacklist_Workmen_without_reason() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("BlackList");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("BlackList")) {
				webElement.click();
				System.out.println("Selected Gate Pass BlackList");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_submit);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_blocklist_Reason));
			ObjectsReporsitory.Gatepass_blocklist_Reason.click();
			ObjectsReporsitory.Gatepass_blocklist_Reason.clear();
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_submit));
			ObjectsReporsitory.Gatepass_submit.click();
			Screenshot.Screenshotforscenario();
			Thread.sleep(5000);
			
			
			Verification_Popup_Wage.Validation_popup_handle();

			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_Clear));
			ObjectsReporsitory.GatePass_Clear.click();
		}

	}
	
	@Then("^Verify User can be able to validate Generate Print from Date field$")
	public static void Verify_User_can_be_able_to_validate_Generate_Print_from_Date_field() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePassType));
		ObjectsReporsitory.gatePassType.click();
		ObjectsReporsitory.gatePassType.clear();
		ObjectsReporsitory.gatePassType.sendKeys("Generate Print");

		List<WebElement> DropdownResult = ObjectsReporsitory.gatePassType_AllOption;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains("Generate Print")) {
				webElement.click();
				System.out.println("Selected Gate Pass Generate Print");
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		
		Verification_Popup_Wage.Validation_popup_handle();
		
	}
	@Then("^Verify User can be able to validate Generate Print To Date field$")
	public static void Verify_User_can_be_able_to_validate_Generate_Print_To_Date_field() throws Throwable {
		
		ObjectsReporsitory.Gatepass_FromDate.click();
		
		Actions action1 = new Actions(DriverFactory.driver);
		Actions action2 = new Actions(DriverFactory.driver);
		Actions action3 = new Actions(DriverFactory.driver);
		Actions action5 = new Actions(DriverFactory.driver);
		
		action1.sendKeys(Keys.LEFT).build().perform();
		action2.sendKeys(Keys.LEFT).build().perform();
		action3.sendKeys(Keys.LEFT).build().perform();
		
		ObjectsReporsitory.Gatepass_FromDate.sendKeys(ConfigFileReader.getGatepass_fromDate());
		Thread.sleep(2000);
		ObjectsReporsitory.Gatepass_FromDate.sendKeys(ConfigFileReader.getGatepass_fromMonth());
		Thread.sleep(2000);
		action5.sendKeys(Keys.RIGHT).build().perform();
		ObjectsReporsitory.Gatepass_FromDate.sendKeys(ConfigFileReader.getGatepass_fromYear());
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		
		Verification_Popup_Wage.Validation_popup_handle();
		Actions actioneww = new Actions(DriverFactory.driver);
		actioneww.sendKeys(Keys.ESCAPE).build().perform();
		
	}
	@Then("^Verify User can be able to validate TimeKeeper field$")
	public static void Verify_User_can_be_able_to_validate_TimeKeeper_field() throws Throwable {
		
		ObjectsReporsitory.Gatepass_FromDate.click();
		
		Actions action1 = new Actions(DriverFactory.driver);
		Actions action2 = new Actions(DriverFactory.driver);
		Actions action3 = new Actions(DriverFactory.driver);
		Actions action5 = new Actions(DriverFactory.driver);
		Actions action6 = new Actions(DriverFactory.driver);
		Actions action8 = new Actions(DriverFactory.driver);
		Actions action9 = new Actions(DriverFactory.driver);
		Actions action10 = new Actions(DriverFactory.driver);
		//Actions action11 = new Actions(DriverFactory.driver);
//		Actions action12 = new Actions(DriverFactory.driver);
//		Actions action13 = new Actions(DriverFactory.driver);
//		Actions action14 = new Actions(DriverFactory.driver);
//		Actions action15 = new Actions(DriverFactory.driver);
//		
		
		
		action1.sendKeys(Keys.LEFT).build().perform();
		action2.sendKeys(Keys.LEFT).build().perform();
		action3.sendKeys(Keys.LEFT).build().perform();
		
		ObjectsReporsitory.Gatepass_FromDate.sendKeys(ConfigFileReader.getGatepass_fromDate());
		Thread.sleep(2000);
		action6.sendKeys(Keys.TAB).build().perform();
		action5.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action10.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.Gatepass_FromDate.sendKeys(ConfigFileReader.getGatepass_fromYear());
		Thread.sleep(2000);
		
		action8.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.Gatepass_ToDate.sendKeys(ConfigFileReader.getGatepass_ToDate());
		Thread.sleep(2000);
		ObjectsReporsitory.Gatepass_ToDate.sendKeys(ConfigFileReader.getGatepass_ToMonth());
		Thread.sleep(2000);
		action9.sendKeys(Keys.TAB).build().perform();
//		action12.sendKeys(Keys.RIGHT).build().perform();
//		action13.sendKeys(Keys.RIGHT).build().perform();
//		action14.sendKeys(Keys.RIGHT).build().perform();
//		action15.sendKeys(Keys.RIGHT).build().perform();
//		action15.sendKeys(Keys.RIGHT).build().perform();
//		action15.sendKeys(Keys.RIGHT).build().perform();
		ObjectsReporsitory.Gatepass_ToDate.sendKeys(ConfigFileReader.getGatepass_ToYear());
		
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.GatePass_fetch));
		ObjectsReporsitory.GatePass_fetch.click();
		Thread.sleep(5000);
		
		
		
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 0) {

			System.out.println("No Records Available");
			System.out.println("============================================================");
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			System.out.println("============================================================");
			Basic.popup_handle();

		} else if (popup_validation == 0) {
			System.out.println("Records Available");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.gatePass_firstCard_Eye));

			List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
			Random rand6546 = new Random();
			int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
			Actions actions3346 = new Actions(DriverFactory.driver);
			actions3346.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
			actions3346.perform();
			Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

			Actions actions3326 = new Actions(DriverFactory.driver);
			actions3326.moveToElement(ObjectsReporsitory.Gatepass_Print);
			actions3326.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Gatepass_Print));
			ObjectsReporsitory.Gatepass_Print.click();
		}
		
		Verification_Popup_Wage.Validation_popup_handle();
		
	}
}
