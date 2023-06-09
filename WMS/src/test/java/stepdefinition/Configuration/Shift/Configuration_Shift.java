package stepdefinition.Configuration.Shift;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;

public class Configuration_Shift {

	public static String Selected_Random_hour;
	public static String Selected_Random_Minute;
	public static String SM_Shift_Code;
	public static String SM_Desc;
	public static String SM_Shift_hr_fr;
	public static String SM_Shift_hr_to;
	public static String SM_Break_hr_fr;
	public static String SM_Break_hr_to;
	public static String Selected_Random_dele;
	public static int Random_Shift;
	public static int Random_Shift_status;
	public static int Random_Shift_job;
	public static int Random_Shift_delete;
	public static int Random_rand_Shift_Fr_Hr;
	public static int Random_rand_Shift_To_Hr;

	public static int Random_rand_Break_Fr_Hr;
	public static int Random_rand_Break_Fr_Min;
	public static int Random_rand_Break_To_Hr;
	public static int Random_rand_Break_To_Min;

	// Page Factory
	public Configuration_Shift() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************
	public static ConfigFileReader configFileReader;

	@Then("^Verify user can be able to Navigate to Shift")
	public static void Verify_user_can_be_able_to_Navigate_to_Shift() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Shift));
		ObjectsReporsitory.WMS_Configuration_tab_Shift.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		System.out.println("Navigated to Shift");
		System.out.println("--------------------------");

	}

	@Then("^Verify user can be able to view exhisting Shift for the selected job")
	public static void Verify_user_can_be_able_to_view_exhisting_Shift_for_the_selected_job() throws Throwable {

		System.out.println("view exhisting Shift for the selected job");
		System.out.println("_____________________________________________________________");

		if (ObjectsReporsitory.WMS_config_shift_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available for the seleted Job");
			System.out.println("_____________________________________________________________");
		}

		else {

			System.out.println("Shift Code");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code : " + shiftcode);

			}
			System.out.println("**************************************");

			System.out.println("Shift Description");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description : " + shiftDesc);

			}
			System.out.println("**************************************");

			System.out.println("Shift Hours From");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From : " + shiftHrFrom);

			}
			System.out.println("**************************************");

			System.out.println("Shift Hours To");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To : " + shiftHrTo);

			}
			System.out.println("**************************************");

			System.out.println("Break Hours From");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From : " + BreakHrFrom);

			}
			System.out.println("**************************************");

			System.out.println("Break Hours To");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To : " + BreakHrTo);

			}
			System.out.println("**************************************");
		}
		Screenshot.Screenshotforscenario();
		System.out.println("Exhisting Shift for the selected job Displayed");
		System.out.println("_____________________________________________________________");
	}

	@Then("^Verify user can be able to view Shifts available in master")
	public static void Verify_user_can_be_able_to_view_Shifts_available_in_master() throws Throwable {

		System.out.println("view Shifts available in master");
		System.out.println("_____________________________________________________________");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		ObjectsReporsitory.WMS_config_shift_openMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_master_saveShift));

		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
		}

		else {

			// ***********************************************************************************************************************
			System.out.println("Shift Code in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code in Shift-Master : " + shiftcode);

			}
			System.out.println("**************************************");

			// ***********************************************************************************************************************

			System.out.println("Shift Description in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description in Shift-Master : " + shiftDesc);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From in Shift-Master : " + shiftHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To in Shift-Master : " + shiftHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From in Shift-Master : " + BreakHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To in Shift-Master : " + BreakHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Status in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Status) {
				String ShiftStatus = elementName.getText();
				System.out.println("Shift Status in Shift-Master : " + ShiftStatus);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************

		}

		Screenshot.Screenshotforscenario();
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
		ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		System.out.println("view Shifts available Displayed");
		System.out.println("_____________________________________________________________");

	}

	@Then("^Verify user can be able to Add Shift Code to add Shift in master")
	public static void Verify_user_can_be_able_to_Add_Shift_Code_to_add_Shift_in_master() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		ObjectsReporsitory.WMS_config_shift_openMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_addNewShift));
		ObjectsReporsitory.WMS_config_shift_Master_addNewShift.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shiftcode_input));
		ObjectsReporsitory.WMS_config_shift_Master_shiftcode_input.click();
		Random rnd = new Random();
		long number1 = rnd.nextInt(9999);
		ObjectsReporsitory.WMS_config_shift_Master_shiftcode_input.sendKeys("" + number1);
		System.out.println("Shift Code In Shift Master : "
				+ ObjectsReporsitory.WMS_config_shift_Master_shiftcode_input.getAttribute("value"));
		System.out.println("_____________________________________________________________");
	}

	@Then("^Verify user can be able to Add Shift Description to add Shift in master")
	public static void Verify_user_can_be_able_to_Add_Shift_Description_to_add_Shift_in_master() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input));
		ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input.click();
		ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input
				.sendKeys(ConfigFileReader.getshift_Master_shiftDesc_input() + RandomString.make(10));
		System.out.println("Shift Description In Shift Master : "
				+ ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input.getAttribute("value"));
		System.out.println("_____________________________________________________________");

	}

	@Then("^Verify user can be able to Add Shift From Hour to add Shift in master")
	public static void Verify_user_can_be_able_to_Add_Shift_From_Hour_to_add_Shift_in_master() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_Fr_timer));
		ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_Fr_timer.click();
		// Configuration_Shift.Select_Random_Timer();

		// ********************************************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));

		System.out.println("Selecting Random Hour");
		List<WebElement> DropdownResult_Hour = ObjectsReporsitory.WMS_config_shift_Master_timer_Hour;

		int min_Shift_Fr_Hr = 10;
		int max_Shift_Fr_Hr = 15;
		Random rand_Shift_Fr_Hr = new Random();
		Random_rand_Shift_Fr_Hr = rand_Shift_Fr_Hr.nextInt(max_Shift_Fr_Hr - min_Shift_Fr_Hr) + min_Shift_Fr_Hr;

		String Selected_Random_Shift_Fr_Hr = String.valueOf(Random_rand_Shift_Fr_Hr);

		for (WebElement webElement : DropdownResult_Hour) {
			if (webElement.getText().contains(Selected_Random_Shift_Fr_Hr)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Hour Selected");
				break;
			}
		}

		// _______________________________________________________________________________________________________________________________________

		System.out.println("_____________________________");
		System.out.println("Selecting Random Minute ");
		List<WebElement> DropdownResult_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute;

		Random randMinute = new Random();
		int rand_Minute = randMinute.nextInt(ObjectsReporsitory.WMS_config_shift_Master_timer_minute.size());
		Selected_Random_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute.get(rand_Minute).getText();

		for (WebElement webElement : DropdownResult_Minute) {
			if (webElement.getText().contains(Selected_Random_Minute)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Minute Selected");
				break;
			}
		}
		System.out.println("_____________________________");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));
		ObjectsReporsitory.WMS_config_shift_Master_timer_setTime.click();

		// ********************************************************************************************************************************
		System.out.println("Shift From Hour selected ");
		System.out.println("______________________________");
	}

	@Then("^Verify user can be able to Add Shift To Hour to add Shift in master")
	public static void Verify_user_can_be_able_to_Add_Shift_To_Hour_to_add_Shift_in_master() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To_timer));
		ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To_timer.click();
		// Configuration_Shift.Select_Random_Timer();

		// ********************************************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));

		System.out.println("Selecting Random Hour");
		List<WebElement> DropdownResult_Hour = ObjectsReporsitory.WMS_config_shift_Master_timer_Hour;

		int min_Shift_To_Hr = Random_rand_Shift_Fr_Hr + 8;
		int max_Shift_To_Hr = 23;
		Random rand_Shift_To_Hr = new Random();
		Random_rand_Shift_To_Hr = rand_Shift_To_Hr.nextInt(max_Shift_To_Hr - min_Shift_To_Hr) + min_Shift_To_Hr;

		String Selected_Random_Shift_To_Hr = String.valueOf(Random_rand_Shift_To_Hr);

		for (WebElement webElement : DropdownResult_Hour) {
			if (webElement.getText().contains(Selected_Random_Shift_To_Hr)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Hour Selected");
				break;
			}
		}

		// _______________________________________________________________________________________________________________________________________

		System.out.println("_____________________________");
		System.out.println("Selecting Random Minute ");
		List<WebElement> DropdownResult_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute;

		Random randMinute = new Random();
		int rand_Minute = randMinute.nextInt(ObjectsReporsitory.WMS_config_shift_Master_timer_minute.size());
		Selected_Random_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute.get(rand_Minute).getText();

		for (WebElement webElement : DropdownResult_Minute) {
			if (webElement.getText().contains(Selected_Random_Minute)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Minute Selected");
				break;
			}
		}
		System.out.println("_____________________________");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));
		ObjectsReporsitory.WMS_config_shift_Master_timer_setTime.click();

		// ********************************************************************************************************************************

		System.out.println("Shift To Hour selected ");
		System.out.println("______________________________");
	}

	@Then("^Verify user can be able to Add Break From Hour to add Shift in master")
	public static void Verify_user_can_be_able_to_Add_Break_From_Hour_to_add_Shift_in_master() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_Fr_timer));
		ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_Fr_timer.click();
		// Configuration_Shift.Select_Random_Timer();
		// ********************************************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));

		System.out.println("Selecting Random Hour");
		List<WebElement> DropdownResult_Hour = ObjectsReporsitory.WMS_config_shift_Master_timer_Hour;

		int min_Break_Fr_Hr = Random_rand_Shift_Fr_Hr + 1;
		int max_Break_Fr_Hr = Random_rand_Shift_To_Hr - 2;
		Random rand_Break_Fr_Hr = new Random();
		Random_rand_Break_Fr_Hr = rand_Break_Fr_Hr.nextInt(max_Break_Fr_Hr - min_Break_Fr_Hr) + min_Break_Fr_Hr;

		String Selected_Random_Break_Fr_Hr = String.valueOf(Random_rand_Break_Fr_Hr);

		for (WebElement webElement : DropdownResult_Hour) {
			if (webElement.getText().contains(Selected_Random_Break_Fr_Hr)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Hour Selected");
				break;
			}
		}

		// _______________________________________________________________________________________________________________________________________

		System.out.println("_____________________________");
		System.out.println("Selecting Random Minute ");
		List<WebElement> DropdownResult_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute;

		Random randMinute = new Random();
		int rand_Minute = randMinute.nextInt(ObjectsReporsitory.WMS_config_shift_Master_timer_minute.size());
		Selected_Random_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute.get(rand_Minute).getText();

		for (WebElement webElement : DropdownResult_Minute) {
			if (webElement.getText().contains(Selected_Random_Minute)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Minute Selected");
				break;
			}
		}
		System.out.println("_____________________________");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));
		ObjectsReporsitory.WMS_config_shift_Master_timer_setTime.click();

		// ********************************************************************************************************************************

		System.out.println("Break From Hour selected ");
		System.out.println("______________________________");
	}

	@Then("^Verify user can be able to Add Break To Hour to add Shift in master")
	public static void Verify_user_can_be_able_to_Add_Break_To_Hour_to_add_Shift_in_master() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To_timer));
		ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To_timer.click();
		// Configuration_Shift.Select_Random_Timer();
		// ********************************************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));

		System.out.println("Selecting Random Hour");
		List<WebElement> DropdownResult_Hour = ObjectsReporsitory.WMS_config_shift_Master_timer_Hour;

		int min_Break_To_Hr = Random_rand_Break_Fr_Hr + 1;
		int max_Break_To_Hr = Random_rand_Shift_To_Hr - 1;
		Random rand_Break_To_Hr = new Random();
		Random_rand_Break_To_Hr = rand_Break_To_Hr.nextInt(max_Break_To_Hr - min_Break_To_Hr) + min_Break_To_Hr;

		String Selected_Random_Break_To_Hr = String.valueOf(Random_rand_Break_To_Hr);

		for (WebElement webElement : DropdownResult_Hour) {
			if (webElement.getText().contains(Selected_Random_Break_To_Hr)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Hour Selected");
				break;
			}
		}

		// _______________________________________________________________________________________________________________________________________

		System.out.println("_____________________________");
		System.out.println("Selecting Random Minute ");
		List<WebElement> DropdownResult_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute;

		Random randMinute = new Random();
		int rand_Minute = randMinute.nextInt(ObjectsReporsitory.WMS_config_shift_Master_timer_minute.size());
		Selected_Random_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute.get(rand_Minute).getText();

		for (WebElement webElement : DropdownResult_Minute) {
			if (webElement.getText().contains(Selected_Random_Minute)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Minute Selected");
				break;
			}
		}
		System.out.println("_____________________________");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));
		ObjectsReporsitory.WMS_config_shift_Master_timer_setTime.click();

		// ********************************************************************************************************************************
		System.out.println("Break To Hour selected ");
		System.out.println("______________________________");
	}

	@Then("^Verify user can be able to Add Shift to Shift Master")
	public static void Verify_user_can_be_able_to_Add_Shift_to_Shift_Master() throws Throwable {

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shift_Details_Save));
		ObjectsReporsitory.WMS_config_shift_Master_shift_Details_Save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation_Shift();
		Basic.PageLoader_Validation();
		System.out.println("Shift Details Saved in Shift Master ");
		System.out.println("______________________________");

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
		ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));

	}

	public static void Select_Random_Timer() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));

		System.out.println("Selecting Random Hour ");
		List<WebElement> DropdownResult_Hour = ObjectsReporsitory.WMS_config_shift_Master_timer_Hour;

		Random randhour = new Random();
		int rand_hour = randhour.nextInt(ObjectsReporsitory.WMS_config_shift_Master_timer_Hour.size());
		Selected_Random_hour = ObjectsReporsitory.WMS_config_shift_Master_timer_Hour.get(rand_hour).getText();

		for (WebElement webElement : DropdownResult_Hour) {
			if (webElement.getText().contains(Selected_Random_hour)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Hour Selected");
				break;
			}
		}

		System.out.println("_____________________________");
		System.out.println("Selecting Random Minute ");
		List<WebElement> DropdownResult_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute;

		Random randMinute = new Random();
		int rand_Minute = randMinute.nextInt(ObjectsReporsitory.WMS_config_shift_Master_timer_minute.size());
		Selected_Random_Minute = ObjectsReporsitory.WMS_config_shift_Master_timer_minute.get(rand_Minute).getText();

		for (WebElement webElement : DropdownResult_Minute) {
			if (webElement.getText().contains(Selected_Random_Minute)) {
				Actions actions2323 = new Actions(DriverFactory.driver);
				actions2323.moveToElement(webElement);
				actions2323.perform();
				webElement.click();
				Thread.sleep(2000);
				System.out.println("Minute Selected");
				break;
			}
		}
		System.out.println("_____________________________");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_timer_setTime));
		ObjectsReporsitory.WMS_config_shift_Master_timer_setTime.click();

	}

	@Then("^Verify user can be able to Add Shift to Job")
	public static void Verify_user_can_be_able_to_Add_Shift_Code_to_add_Add_Shift_to_Job() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		ObjectsReporsitory.WMS_config_shift_openMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_master_saveShift));

		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
			System.out.println("Adding New Shift to Master");
			System.out.println("_____________________________________________________________");

			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
			ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));

			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_Code_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_Description_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_From_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_To_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Break_From_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Break_To_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_to_Shift_Master();

			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
			ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_Code_to_add_Add_Shift_to_Job();
		}

		else {

			System.out.println("Adding New Shift to Job");
			System.out.println("_____________________________________________________________");
			System.out.println("Filtering Active Jobs");
			System.out.println("_____________________________________________________________");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter));
			ObjectsReporsitory.WMS_config_shift_Master_Filter.click();
			wait.until(
					ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter_Status));
			ObjectsReporsitory.WMS_config_shift_Master_Filter_Status.click();

			List<WebElement> DropdownResultdasdas4 = ObjectsReporsitory.WMS_config_shift_Master_Filter_Status_DR;

			for (WebElement webElement : DropdownResultdasdas4) {
				if (webElement.getText().equals("Active")) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Status Selected :"
							+ ObjectsReporsitory.WMS_config_shift_Master_Filter_Current_Status.getAttribute("value"));
					System.out.println("-----------------------------------");
					break;
				}
			}

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_HideFilter));
			ObjectsReporsitory.WMS_config_shift_Master_HideFilter.click();

			if (ConfigFileReader.getaddshiftjob().contains("All")) {
				System.out.println("Selecting All Job");
				System.out.println("-----------------------------------");
				wait.until(ExpectedConditions
						.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_select_all_Shift));
				ObjectsReporsitory.WMS_config_shift_Master_select_all_Shift.click();
			} else if (ConfigFileReader.getaddshiftjob().contains("Random")) {
				System.out.println("Selecting Random Shifts");
				System.out.println("-----------------------------------");

				int Total_Shift = ObjectsReporsitory.WMS_config_shift_Master_Shift_List.size();

				if (Total_Shift < 2) {
					System.out.println("Selecting First Shift");
					System.out.println("-----------------------------------");
					wait.until(ExpectedConditions
							.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Shift_First));
					ObjectsReporsitory.WMS_config_shift_Master_Shift_First.click();
					Thread.sleep(3000);
				} else {
					int min_Shift = 1;
					int max_Shift = Total_Shift;
					Random rand7 = new Random();
					Random_Shift = rand7.nextInt(max_Shift - min_Shift) + min_Shift;

					List<WebElement> elements = ObjectsReporsitory.WMS_config_shift_Master_Shift_List;

					// Generate random indices
					Random random = new Random();
					List<Integer> randomIndices = new ArrayList<>();
					int listSize = elements.size();
					while (randomIndices.size() < Random_Shift) {
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
				}
			} else {

				System.out.println("Selecting First Shift");
				System.out.println("-----------------------------------");
				wait.until(ExpectedConditions
						.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Shift_First));
				ObjectsReporsitory.WMS_config_shift_Master_Shift_First.click();
				Thread.sleep(3000);

			}
		}
		System.out.println("Shifts Selected ");
		System.out.println("_____________________________________________________________");

	}

	@Then("^Verify user can be able to save Shift for the selected job")
	public static void Verify_user_can_be_able_to_Add_Shift_for_the_selected_job() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_saveShift));
		ObjectsReporsitory.WMS_config_shift_Master_saveShift.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation_Shift();
		Basic.PageLoader_Validation();
		System.out.println("selected Shifts added to the Job ");
		System.out.println("______________________________");
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
		ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));

	}

	@Then("^Verify user can be able to Verify Shift Master Records")
	public static void Verify_user_can_be_able_to_verify_shift_master_records() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		ObjectsReporsitory.WMS_config_shift_openMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_master_saveShift));

		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
			System.out.println("Adding New Shift to Master");
			System.out.println("_____________________________________________________________");

			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
			ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));

			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_Code_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_Description_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_From_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_To_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Break_From_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Break_To_Hour_to_add_Shift_in_master();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_to_Shift_Master();

			Configuration_Shift.Verify_user_can_be_able_to_verify_shift_master_records();
		}

		else {

			System.out.println("Shift Records Available");
			System.out.println("_____________________________________________________________");

		}

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
		ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
	}

	@Then("^Verify user can be able to filter records by Shift code in master")
	public static void Verify_user_can_be_able_to_records_Shift_code_in_master() throws Throwable {

		SM_Shift_Code = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Code.getText();
		SM_Desc = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Desc.getText();
		SM_Shift_hr_fr = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Hr_Fr.getText();
		SM_Shift_hr_to = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Hr_To.getText();
		SM_Break_hr_fr = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Break_Hr_Fr.getText();
		SM_Break_hr_to = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Break_Hr_To.getText();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter));
		ObjectsReporsitory.WMS_config_shift_Master_Filter.click();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Code));
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Code.click();
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Code.clear();
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Code.click();
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Code.sendKeys(SM_Shift_Code);

		Thread.sleep(3000);

		// ***************************************************************************************************************************************
		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
		}

		else {

			// ***********************************************************************************************************************
			System.out.println("Shift Code in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code in Shift-Master : " + shiftcode);

			}
			System.out.println("**************************************");

			// ***********************************************************************************************************************

			System.out.println("Shift Description in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description in Shift-Master : " + shiftDesc);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From in Shift-Master : " + shiftHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To in Shift-Master : " + shiftHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From in Shift-Master : " + BreakHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To in Shift-Master : " + BreakHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Status in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Status) {
				String ShiftStatus = elementName.getText();
				System.out.println("Shift Status in Shift-Master : " + ShiftStatus);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************

		}
		// **************************************************************************************************************************************************

		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Shift_Code));
		ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Shift_Code.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_HideFilter));
		ObjectsReporsitory.WMS_config_shift_Master_HideFilter.click();

		System.out.println("User can be able to Filter Shift in Master By Shift Code");
		System.out.println("_______________________________________________________________________________________");

	}

	@Then("^Verify user can be able to filter records by Shift Desc in master")
	public static void Verify_user_can_be_able_to_records_Shift_Desc_in_master() throws Throwable {

		SM_Shift_Code = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Code.getText();
		SM_Desc = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Desc.getText();
		SM_Shift_hr_fr = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Hr_Fr.getText();
		SM_Shift_hr_to = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Shift_Hr_To.getText();
		SM_Break_hr_fr = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Break_Hr_Fr.getText();
		SM_Break_hr_to = ObjectsReporsitory.WMS_config_shift_Master_First_Value_Break_Hr_To.getText();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter));
		ObjectsReporsitory.WMS_config_shift_Master_Filter.click();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Desc));
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Desc.click();
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Desc.clear();
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Desc.click();
		ObjectsReporsitory.WMS_config_shift_Master_Filter_input_Shift_Desc.sendKeys(SM_Desc);

		Thread.sleep(3000);

		// ***************************************************************************************************************************************
		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
		}

		else {

			// ***********************************************************************************************************************
			System.out.println("Shift Code in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code in Shift-Master : " + shiftcode);

			}
			System.out.println("**************************************");

			// ***********************************************************************************************************************

			System.out.println("Shift Description in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description in Shift-Master : " + shiftDesc);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From in Shift-Master : " + shiftHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To in Shift-Master : " + shiftHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From in Shift-Master : " + BreakHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To in Shift-Master : " + BreakHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Status in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Status) {
				String ShiftStatus = elementName.getText();
				System.out.println("Shift Status in Shift-Master : " + ShiftStatus);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************

		}
		// **************************************************************************************************************************************************
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Shift_Desc));
		ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Shift_Desc.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_HideFilter));
		ObjectsReporsitory.WMS_config_shift_Master_HideFilter.click();

		System.out.println("User can be able to Filter Shift in Master By Shift Desc");
		System.out.println("_______________________________________________________________________________________");

	}

	@Then("^Verify user can be able to filter records by Shift From Hour in master")
	public static void Verify_user_can_be_able_to_records_by_Shift_From_Hour_in_master() throws Throwable {

	}

	@Then("^Verify user can be able to filter records by Shift To Hour in master")
	public static void Verify_user_can_be_able_to_records_by_Shift_To_Hour_in_master() throws Throwable {

	}

	@Then("^Verify user can be able to filter records by Break From Hour in master")
	public static void Verify_user_can_be_able_to_records_by_Break_From_Hour_in_master() throws Throwable {

	}

	@Then("^Verify user can be able to filter records by Break To Hour in master")
	public static void Verify_user_can_be_able_to_records_by_Break_To_Hour_in_master() throws Throwable {

	}

	@Then("^Verify user can be able to filter records by Status in master")
	public static void Verify_user_can_be_able_to_records_by_Status_in_master() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter));
		ObjectsReporsitory.WMS_config_shift_Master_Filter.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter_Status));
		ObjectsReporsitory.WMS_config_shift_Master_Filter_Status.click();

		List<WebElement> DropdownResultdasdas4 = ObjectsReporsitory.WMS_config_shift_Master_Filter_Status_DR;

		for (WebElement webElement : DropdownResultdasdas4) {
			if (webElement.getText().equals("Active")) {
				webElement.click();
				Thread.sleep(3000);
				System.out.println("Status Selected :"
						+ ObjectsReporsitory.WMS_config_shift_Master_Filter_Current_Status.getAttribute("value"));
				System.out.println("-----------------------------------");
				break;
			}
		}

		Thread.sleep(2000);

		// ***************************************************************************************************************************************
		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
		}

		else {

			// ***********************************************************************************************************************
			System.out.println("Shift Code in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code in Shift-Master : " + shiftcode);

			}
			System.out.println("**************************************");

			// ***********************************************************************************************************************

			System.out.println("Shift Description in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description in Shift-Master : " + shiftDesc);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From in Shift-Master : " + shiftHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To in Shift-Master : " + shiftHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From in Shift-Master : " + BreakHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To in Shift-Master : " + BreakHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Status in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Status) {
				String ShiftStatus = elementName.getText();
				System.out.println("Shift Status in Shift-Master : " + ShiftStatus);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************

		}
		// **************************************************************************************************************************************************
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Status));
		ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Status.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_HideFilter));
		ObjectsReporsitory.WMS_config_shift_Master_HideFilter.click();

		System.out.println("User can be able to Filter Shift in Master By Shift Active Status");
		System.out.println("_______________________________________________________________________________________");

		// Inactive

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter));
		ObjectsReporsitory.WMS_config_shift_Master_Filter.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Filter_Status));
		ObjectsReporsitory.WMS_config_shift_Master_Filter_Status.click();

		List<WebElement> dasdasdda = ObjectsReporsitory.WMS_config_shift_Master_Filter_Status_DR;

		for (WebElement webElement : dasdasdda) {
			if (webElement.getText().equals("inActive")) {
				webElement.click();
				Thread.sleep(3000);
				System.out.println("Status Selected :"
						+ ObjectsReporsitory.WMS_config_shift_Master_Filter_Current_Status.getAttribute("value"));
				System.out.println("-----------------------------------");
				break;
			}
		}

		Thread.sleep(2000);

		// ***************************************************************************************************************************************
		if (ObjectsReporsitory.WMS_config_shift_master_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available in Master");
			System.out.println("_____________________________________________________________");
		}

		else {

			// ***********************************************************************************************************************
			System.out.println("Shift Code in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code in Shift-Master : " + shiftcode);

			}
			System.out.println("**************************************");

			// ***********************************************************************************************************************

			System.out.println("Shift Description in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description in Shift-Master : " + shiftDesc);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From in Shift-Master : " + shiftHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To in Shift-Master : " + shiftHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours From in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From in Shift-Master : " + BreakHrFrom);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Break Hours To in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To in Shift-Master : " + BreakHrTo);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************
			System.out.println("Shift Status in Shift-Master");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Master_Status) {
				String ShiftStatus = elementName.getText();
				System.out.println("Shift Status in Shift-Master : " + ShiftStatus);

			}
			System.out.println("**************************************");
			// ***********************************************************************************************************************

		}
		// **************************************************************************************************************************************************
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Status));
		ObjectsReporsitory.WMS_config_shift_Master_Clear_Filter_Status.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_HideFilter));
		ObjectsReporsitory.WMS_config_shift_Master_HideFilter.click();

		System.out.println("User can be able to Filter Shift in Master By Shift Active Status");
		System.out.println("_______________________________________________________________________________________");

	}

	@Then("^Verify user can be able to delete Shift from Master")
	public static void Verify_user_can_be_able_to_delete_Shift_from_Master() throws Throwable {

		List<WebElement> dele_all_rec = ObjectsReporsitory.WMS_config_shift_Master_Shift_List;

		int Total_Shift_dele = ObjectsReporsitory.WMS_config_shift_Master_Shift_List.size();

		if (Total_Shift_dele > 2) {

			Random randdelete = new Random();
			int rand_dele = randdelete.nextInt(ObjectsReporsitory.WMS_config_shift_Master_Shift_List.size());
			Selected_Random_dele = ObjectsReporsitory.WMS_config_shift_Master_Shift_List.get(rand_dele).getText();
			for (WebElement webElement : dele_all_rec) {
				if (webElement.getText().contains(Selected_Random_dele)) {
					Actions actions2323 = new Actions(DriverFactory.driver);
					actions2323.moveToElement(webElement);
					actions2323.perform();
					webElement.click();
					Thread.sleep(2000);
					break;
				}

			}
		} else {

			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_delete_shift_last));
			ObjectsReporsitory.WMS_config_shift_Master_delete_shift_last.click();
		}
		Screenshot.Screenshotforscenario();
		Basic.popup_validation_Shift_delete();
		Screenshot.Screenshotforscenario();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
		ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		System.out.println("Shift Master Record Deleted Successfully");
		System.out.println("_____________________________________________________________");
	}

	@Then("^Verify user can be able to select Shift record from Master for Edit Shift record")
	public static void Verify_user_can_be_able_to_select_Shift_record_from_Master_for_Edit_Shift_record()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		ObjectsReporsitory.WMS_config_shift_openMaster.click();

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Edit_shift_First));
		ObjectsReporsitory.WMS_config_shift_Master_Edit_shift_First.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input));

		System.out.println("Shift Record selected for Edit");
		System.out.println("_____________________________________________________________");

	}

	@Then("^Verify user can be able to Edit Shift Description from Master")
	public static void Verify_user_can_be_able_to_Edit_Shift_Description_from_Master() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input));
		ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input.click();
		ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input.clear();
		ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input.click();
		ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input
				.sendKeys(ConfigFileReader.getshift_Master_shiftDesc_input() + RandomString.make(10));
		System.out.println("Shift Description In Shift Master : "
				+ ObjectsReporsitory.WMS_config_shift_Master_shiftDesc_input.getAttribute("value"));
		System.out.println("_____________________________________________________________");

	}

	@Then("^Verify user can be able to Edit Shift From Hour from Master")
	public static void Verify_user_can_be_able_to_Edit_Shift_From_Hour_from_Master() throws Throwable {
		Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_From_Hour_to_add_Shift_in_master();
	}

	@Then("^Verify user can be able to Edit Shift To Hour from Master")
	public static void Verify_user_can_be_able_to_Edit_Shift_To_Hour_from_Master() throws Throwable {
		Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_To_Hour_to_add_Shift_in_master();
	}

	@Then("^Verify user can be able to Edit Break From Hour from Master")
	public static void Verify_user_can_be_able_to_Edit_Break_From_Hour_from_Master() throws Throwable {
		Configuration_Shift.Verify_user_can_be_able_to_Add_Break_From_Hour_to_add_Shift_in_master();
	}

	@Then("^Verify user can be able to Edit Break To Hour from Master")
	public static void Verify_user_can_be_able_to_Edit_Break_To_Hour_from_Master() throws Throwable {
		Configuration_Shift.Verify_user_can_be_able_to_Add_Break_To_Hour_to_add_Shift_in_master();
	}

	@Then("^Verify user can be able to Edit Shift Status")
	public static void Verify_user_can_be_able_to_Edit_Shift_Status() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
		ObjectsReporsitory.WMS_config_shift_openMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_master_saveShift));

		Screenshot.Screenshotforscenario();

		int Total_Shift = ObjectsReporsitory.WMS_config_shift_Master_Status_all_ele.size();

		if (Total_Shift < 2) {
			System.out.println("Editing status of Last Shift");
			System.out.println("-----------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Status_last));
			ObjectsReporsitory.WMS_config_shift_Master_Status_last.click();
			System.out.println("Shift Status Changed");
			System.out.println("------------------------");
			Thread.sleep(3000);

		} else if (Total_Shift > 2) {

			System.out.println("Selecting Random Shifts");
			System.out.println("-----------------------------------");
			int min_Shift = 1;
			int max_Shift = Total_Shift;
			Random rand7 = new Random();
			Random_Shift_status = rand7.nextInt(max_Shift - min_Shift) + min_Shift;

			List<WebElement> elements = ObjectsReporsitory.WMS_config_shift_Master_Status_all_ele;

			// Generate random indices
			Random random = new Random();
			List<Integer> randomIndices = new ArrayList<>();
			int listSize = elements.size();
			while (randomIndices.size() < Random_Shift_status) {
				int randomIndex = random.nextInt(listSize);
				if (!randomIndices.contains(randomIndex)) {
					randomIndices.add(randomIndex);
				}
			}

			// Click on the random elements
			for (int index : randomIndices) {
				WebElement element = elements.get(index);
				element.click();
				Thread.sleep(3000);
				System.out.println("Shift Status Changed");
				System.out.println("------------------------");
			}

		} else {
			System.out.println("Editing status of Last Shift");
			System.out.println("-----------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_Status_last));
			ObjectsReporsitory.WMS_config_shift_Master_Status_last.click();
			System.out.println("Shift Status Changed");
			System.out.println("------------------------");
			Thread.sleep(3000);
		}

		Screenshot.Screenshotforscenario();
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster));
		ObjectsReporsitory.WMS_config_shift_Master_closeShiftMaster.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_shift_openMaster));
	}

	@Then("^Verify user can be able to Verify exhisting Shift for the selected job")
	public static void Verify_user_can_be_able_to_Verify_exhisting_Shift_for_the_selected_job() throws Throwable {

		System.out.println("view exhisting Shift for the selected job");
		System.out.println("_____________________________________________________________");

		if (ObjectsReporsitory.WMS_config_shift_allelement.getText().contains("No records available")) {

			System.out.println("No Shift record available for the seleted Job");
			System.out.println("_____________________________________________________________");
			System.out.println("Adding Shift to Job From Master");
			System.out.println("_____________________________________________________________");
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_Code_to_add_Add_Shift_to_Job();
			Configuration_Shift.Verify_user_can_be_able_to_Add_Shift_for_the_selected_job();
			Configuration_Shift.Verify_user_can_be_able_to_view_exhisting_Shift_for_the_selected_job();

		}

		else {
			System.out.println("Shift Code");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_code) {
				String shiftcode = elementName.getText();
				System.out.println("Shift Code : " + shiftcode);

			}
			System.out.println("**************************************");

			System.out.println("Shift Description");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_Desc) {
				String shiftDesc = elementName.getText();
				System.out.println("Shift Description : " + shiftDesc);

			}
			System.out.println("**************************************");

			System.out.println("Shift Hours From");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_Hour_from) {
				String shiftHrFrom = elementName.getText();
				System.out.println("Shift Hours From : " + shiftHrFrom);

			}
			System.out.println("**************************************");

			System.out.println("Shift Hours To");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_shift_Hour_To) {
				String shiftHrTo = elementName.getText();
				System.out.println("Shift Hours To : " + shiftHrTo);

			}
			System.out.println("**************************************");

			System.out.println("Break Hours From");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Break_Hour_from) {
				String BreakHrFrom = elementName.getText();
				System.out.println("Break Hours From : " + BreakHrFrom);

			}
			System.out.println("**************************************");

			System.out.println("Break Hours To");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_config_shift_Break_Hour_To) {
				String BreakHrTo = elementName.getText();
				System.out.println("Break Hours To : " + BreakHrTo);

			}
			System.out.println("**************************************");
		}
		Screenshot.Screenshotforscenario();
		System.out.println("Exhisting Shift for the selected job Displayed");
		System.out.println("_____________________________________________________________");

	}

	@Then("^Verify user can be able to Remove Shift from job")
	public static void Verify_user_can_be_able_to_Remove_Shift_from_job() throws Throwable {

		int Total_Shift_job = ObjectsReporsitory.WMS_config_Job_shift_delete_allele.size();

		if (Total_Shift_job < 2) {

			System.out.println("Selecting Job Shift to delete");
			System.out.println("-----------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_Job_shift_delete_first));
			ObjectsReporsitory.WMS_config_Job_shift_delete_first.click();
			Basic.PageLoader_Validation();
			Basic.popup_validation_Shift_delete();
			Basic.PageLoader_Validation();
			System.out.println("Selecting Job Shift deleted");
			System.out.println("-----------------------------------");
		} else if (Total_Shift_job > 2) {

			System.out.println("Selecting Random Shifts to delete");
			System.out.println("-----------------------------------");
			int min_Shift_job = 1;
			int max_Shift_job = Total_Shift_job;
			Random rand7 = new Random();
			Random_Shift_job = rand7.nextInt(max_Shift_job - min_Shift_job) + min_Shift_job;

			List<WebElement> elements = ObjectsReporsitory.WMS_config_Job_shift_delete_allele;

			// Generate random indices
			Random random = new Random();
			List<Integer> randomIndices = new ArrayList<>();
			int listSize = elements.size();
			while (randomIndices.size() < Random_Shift_job) {
				int randomIndex = random.nextInt(listSize);
				if (!randomIndices.contains(randomIndex)) {
					randomIndices.add(randomIndex);
				}
			}

			// Click on the random elements
			for (int index : randomIndices) {
				WebElement element = elements.get(index);
				element.click();
				Basic.PageLoader_Validation();
				Basic.popup_validation_Shift_delete();
				Basic.PageLoader_Validation();
				Thread.sleep(3000);
				System.out.println("Job Shift deleted");
				System.out.println("------------------------");
			}
		} else {

			System.out.println("Selecting Job Shift to delete");
			System.out.println("-----------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_config_Job_shift_delete_first));
			ObjectsReporsitory.WMS_config_Job_shift_delete_first.click();
			Basic.PageLoader_Validation();
			Basic.popup_validation_Shift_delete();
			Basic.PageLoader_Validation();
			System.out.println("Selecting Job Shift deleted");
			System.out.println("-----------------------------------");
		}
	}
}
