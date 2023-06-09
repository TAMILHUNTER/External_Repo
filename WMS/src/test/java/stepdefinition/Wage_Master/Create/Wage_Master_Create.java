package stepdefinition.Wage_Master.Create;

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
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Wage_Master_Create {

	public static String Selected_State;
	public static String Selected_Shedule_of_employment;

// Page Factory
	public Wage_Master_Create() {
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

	@Given("^Login and Navigate to Main Wage$")
	public static void Login_and_Navigate_to_Main_Wage() throws Throwable {

		stepdefinition.Login.Main_Wage_login();

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
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_sidenav));
		ObjectsReporsitory.WMS_MainWage_sidenav.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_getdata));
		System.out.println("Navigated to Wage");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to select State$")
	public static void Verify_User_can_be_able_to_select_State() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_getdata));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_Select_State));
		ObjectsReporsitory.WMS_MainWage_Select_State.click();

		List<WebElement> DropdownResultdasdas4 = ObjectsReporsitory.WMS_MainWage_Select_State_Dr;

		if (ConfigFileReader.getWagemster_State_Type().contains("Random")) {

			Random rand6547daadss = new Random();
			int Job = rand6547daadss.nextInt(ObjectsReporsitory.WMS_MainWage_Select_State_Dr.size());
			Selected_State = ObjectsReporsitory.WMS_MainWage_Select_State_Dr.get(Job).getText();

			for (WebElement webElement : DropdownResultdasdas4) {
				if (webElement.getText().contains(Selected_State)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(
							"State Selected :" + ObjectsReporsitory.WMS_MainWage_Select_State.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}
		} else {
			for (WebElement webElement : DropdownResultdasdas4) {
				if (webElement.getText().contains(ConfigFileReader.getWagemster_State())) {
					webElement.click();
					System.out.println(
							"State Selected :" + ObjectsReporsitory.WMS_MainWage_Select_State.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}
		}

	}

	@Then("^Verify User can be able to select Shedule of Employment$")
	public static void Verify_User_can_be_able_to_select_Shedule_of_Employment() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_getdata));
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement));
		ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement.click();

		List<WebElement> DropdownResultasdad = ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement_dr;

		if (ConfigFileReader.getWagemster_SheduleOfEmployment_Type().contains("Random")) {

			Random rand6547daadss = new Random();
			int Job = rand6547daadss.nextInt(ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement_dr.size());
			Selected_Shedule_of_employment = ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement_dr.get(Job)
					.getText();

			for (WebElement webElement : DropdownResultasdad) {
				if (webElement.getText().contains(Selected_Shedule_of_employment)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Shedule of Employment Selected :"
							+ ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}
		} else {
			for (WebElement webElement : DropdownResultasdad) {
				if (webElement.getText().contains(ConfigFileReader.getWagemster_SheduleOfEmployment())) {
					webElement.click();
					System.out.println("Shedule of Employment Selected :"
							+ ObjectsReporsitory.WMS_MainWage_Select_SheduleofEmployement.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}
		}

	}

	@Then("^Verify User can be able to Get Wage Data$")
	public static void Verify_User_can_be_able_to_Get_Wage_Data() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_MainWage_getdata));
		ObjectsReporsitory.WMS_MainWage_getdata.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		System.out.println("Wage Master Data Displayed");
		System.out.println("__________________________________");

	}
}
