package stepdefinition.Training.Training_Dashboard.View;

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
import stepdefinition.Login;
import stepdefinition.Screenshot;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Training_Dashboard_View {

	// Page Factory
	public Training_Dashboard_View() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************
	public static ConfigFileReader configFileReader;

	@Given("^Login as Training Creator and Navigate to Training$")
	public static void Login_as_Training_Creator_and_Navigate_to_Training() throws Throwable {

		Login.Use_Login_Training_Creator();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		ObjectsReporsitory.WMS_induction.click();
		
		Thread.sleep(5000);
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management));
		ObjectsReporsitory.WMS_Management.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training));
		ObjectsReporsitory.WMS_Training.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Menu));
		System.out.println("Navigated to Training Page");
		System.out.println("------------------------------");

	}

	@Given("^Login as Training Master and Navigate to Training$")
	public static void Login_as_Training_Master_and_Navigate_to_Training() throws Throwable {

		Login.Use_Login_Training_Master();
		;
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		ObjectsReporsitory.WMS_induction.click();
		
		Thread.sleep(5000);
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management));
		ObjectsReporsitory.WMS_Management.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training));
		ObjectsReporsitory.WMS_Training.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Menu));
		System.out.println("Navigated to Training Page");
		System.out.println("------------------------------");

	}

	@Then("^Verify user can be able to select IC$")
	public static void Verify_user_can_be_able_to_select_IC() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC));
		ObjectsReporsitory.WMS_Training_IC.click();
		Thread.sleep(3000);
		if (ConfigFileReader.getTraining_Search_By().equals("All")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		} else if (ConfigFileReader.getTraining_Search_By().equals("Random")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			Random rand = new Random();
			int Training_IC = rand.nextInt(ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.size());
			System.out.println("Random IC : " + Training_IC);
			ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.get(Training_IC).click();

		} else if (ConfigFileReader.getTraining_Search_By().equals("Input")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_Input));
			ObjectsReporsitory.WMS_Training_IC_Input.click();
			ObjectsReporsitory.WMS_Training_IC_Input.clear();
			ObjectsReporsitory.WMS_Training_IC_Input.click();
			ObjectsReporsitory.WMS_Training_IC_Input.sendKeys(ConfigFileReader.getTraining_Search_By_Input_IC());
			Thread.sleep(2000);
			List<WebElement> DropdownResult2 = ObjectsReporsitory.WMS_Training_IC_Input_All_Options;
			Thread.sleep(3000);
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().contains(ConfigFileReader.getTraining_Search_By_Input_IC())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("IC Selected : " + ConfigFileReader.getTraining_Search_By_Input_IC());
					break;
				}
			}

		} else {
			System.out.println("No Input Provided");
			System.out.println("Selecting All IC");
			System.out.println("----------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		}

	}

	@Then("^Verify user can be able to select SBG$")
	public static void Verify_user_can_be_able_to_select_SBG() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_SBG));
		ObjectsReporsitory.WMS_Training_SBG.click();
		Thread.sleep(3000);
		if (ConfigFileReader.getTraining_Search_By().equals("All")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		} else if (ConfigFileReader.getTraining_Search_By().equals("Random")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			Random rand = new Random();
			int Training_SBG = rand.nextInt(ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.size());
			System.out.println("Random SBG : " + Training_SBG);
			ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.get(Training_SBG).click();

		} else if (ConfigFileReader.getTraining_Search_By().equals("Input")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_SBG_Input));
			ObjectsReporsitory.WMS_Training_SBG_Input.click();
			ObjectsReporsitory.WMS_Training_SBG_Input.clear();
			ObjectsReporsitory.WMS_Training_SBG_Input.click();
			ObjectsReporsitory.WMS_Training_SBG_Input.sendKeys(ConfigFileReader.getTraining_Search_By_Input_SBG());
			Thread.sleep(2000);
			List<WebElement> DropdownResult2 = ObjectsReporsitory.WMS_Training_IC_Input_All_Options;
			Thread.sleep(3000);
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().contains(ConfigFileReader.getTraining_Search_By_Input_SBG())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("SBG Selected : " + ConfigFileReader.getTraining_Search_By_Input_SBG());
					break;
				}
			}

		} else {
			System.out.println("No Input Provided");
			System.out.println("Selecting All BU");
			System.out.println("----------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		}
	}

	@Then("^Verify user can be able to select BU$")
	public static void Verify_user_can_be_able_to_select_BU() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_BU));
		ObjectsReporsitory.WMS_Training_BU.click();
		Thread.sleep(3000);
		if (ConfigFileReader.getTraining_Search_By().equals("All")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		} else if (ConfigFileReader.getTraining_Search_By().equals("Random")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			Random rand = new Random();
			int Training_BU = rand.nextInt(ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.size());
			System.out.println("Random BU : " + Training_BU);
			ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.get(Training_BU).click();

		} else if (ConfigFileReader.getTraining_Search_By().equals("Input")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_BU_Input));
			ObjectsReporsitory.WMS_Training_BU_Input.click();
			ObjectsReporsitory.WMS_Training_BU_Input.clear();
			ObjectsReporsitory.WMS_Training_BU_Input.click();
			ObjectsReporsitory.WMS_Training_BU_Input.sendKeys(ConfigFileReader.getTraining_Search_By_Input_BU());
			Thread.sleep(2000);
			List<WebElement> DropdownResult2 = ObjectsReporsitory.WMS_Training_IC_Input_All_Options;
			Thread.sleep(3000);
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().contains(ConfigFileReader.getTraining_Search_By_Input_BU())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("BU Selected : " + ConfigFileReader.getTraining_Search_By_Input_BU());
					break;
				}
			}

		} else {
			System.out.println("No Input Provided");
			System.out.println("Selecting All BU");
			System.out.println("----------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		}
	}

	@Then("^Verify user can be able to select Cluster$")
	public static void Verify_user_can_be_able_to_select_Cluster() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Cluster));
		ObjectsReporsitory.WMS_Training_Cluster.click();
		Thread.sleep(3000);
		if (ConfigFileReader.getTraining_Search_By().equals("All")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		} else if (ConfigFileReader.getTraining_Search_By().equals("Random")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			Random rand = new Random();
			int Training_Cluster = rand.nextInt(ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.size());
			System.out.println("Random Cluster : " + Training_Cluster);
			ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.get(Training_Cluster).click();

		} else if (ConfigFileReader.getTraining_Search_By().equals("Input")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Cluster_Input));
			ObjectsReporsitory.WMS_Training_Cluster_Input.click();
			ObjectsReporsitory.WMS_Training_Cluster_Input.clear();
			ObjectsReporsitory.WMS_Training_Cluster_Input.click();
			ObjectsReporsitory.WMS_Training_Cluster_Input
					.sendKeys(ConfigFileReader.getTraining_Search_By_Input_Cluster());
			Thread.sleep(2000);
			List<WebElement> DropdownResult2 = ObjectsReporsitory.WMS_Training_IC_Input_All_Options;
			Thread.sleep(3000);
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().contains(ConfigFileReader.getTraining_Search_By_Input_Cluster())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("Cluster Selected : " + ConfigFileReader.getTraining_Search_By_Input_Cluster());
					break;
				}
			}

		} else {
			System.out.println("No Input Provided");
			System.out.println("Selecting All Cluster");
			System.out.println("----------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		}
	}

	@Then("^Verify user can be able to select Job$")
	public static void Verify_user_can_be_able_to_select_Job() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Job));
		ObjectsReporsitory.WMS_Training_Job.click();
		Thread.sleep(3000);
		if (ConfigFileReader.getTraining_Search_By().equals("All")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		} else if (ConfigFileReader.getTraining_Search_By().equals("Random")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
			Random rand = new Random();
			int Training_Job = rand.nextInt(ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.size());
			System.out.println("Random job : " + Training_Job);
			ObjectsReporsitory.WMS_Training_IC_All_Checkbox_Elements.get(Training_Job).click();

		} else if (ConfigFileReader.getTraining_Search_By().equals("Input")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Job_Input));
			ObjectsReporsitory.WMS_Training_Job_Input.click();
			ObjectsReporsitory.WMS_Training_Job_Input.clear();
			ObjectsReporsitory.WMS_Training_Job_Input.click();
			ObjectsReporsitory.WMS_Training_Job_Input.sendKeys(ConfigFileReader.getTraining_Search_By_Input_Job());
			Thread.sleep(2000);
			List<WebElement> DropdownResult2 = ObjectsReporsitory.WMS_Training_IC_Input_All_Options;
			Thread.sleep(3000);
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().contains(ConfigFileReader.getTraining_Search_By_Input_Job())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("Job Selected : " + ConfigFileReader.getTraining_Search_By_Input_Job());
					break;
				}
			}

		} else {
			System.out.println("No Input Provided");
			System.out.println("Selecting All Job");
			System.out.println("----------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_IC_SelectAll));
			ObjectsReporsitory.WMS_Training_IC_SelectAll.click();
		}
	}

	@Then("^Verify user can be able to select Date$")
	public static void Verify_user_can_be_able_to_select_Date() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Training_Date_Input));
		if (ConfigFileReader.getTraining_Date_Select_By().equals("Calender")) {

		} else if (ConfigFileReader.getTraining_Date_Select_By().equals("Random")) {

		} else if (ConfigFileReader.getTraining_Date_Select_By().equals("Input")) {
			ObjectsReporsitory.WMS_Training_Date_Input.click();
			ObjectsReporsitory.WMS_Training_Date_Input.clear();
			ObjectsReporsitory.WMS_Training_Date_Input.click();
			ObjectsReporsitory.WMS_Training_Date_Input.sendKeys(ConfigFileReader.getTraining_Date_Input_value());
			Thread.sleep(2000);
			ObjectsReporsitory.WMS_Training_Date_Input.click();

		} else {
			System.out.println("No Input Provided for Date");
			System.out.println("Selecting Random Date");
			System.out.println("----------------------------------------");

		}

		Thread.sleep(2000);
		Screenshot.Screenshotforscenario();

	}
}
