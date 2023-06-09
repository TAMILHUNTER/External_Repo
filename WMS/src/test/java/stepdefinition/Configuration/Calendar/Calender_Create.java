package stepdefinition.Configuration.Calendar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import utils.DriverFactory;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;

public class Calender_Create {

	public static int CurrentYear;
	public static String Selected_user;
	public static String randomYearSelection;
	public static String randommonthSelection;
	public static String randomdateSelection;
	public static String Selected_Year;
	public static String Selected_FesORNat_Holidays_Type;
	public static String Selected_Regular_Holidays_Type;
	public static String Selected_Regular_Holidays_Day;
	public static int Total_FesORNat_Holidays;
	public static int Total_Regular_Holidays;
	public static int Total_Holidays;
	public static int Random_FesOrNat_Holidays;
	public static int Random_Regular_Holidays;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify user can be able to Navigate to Calender")
	public static void Verify_user_can_be_able_to_Navigate_to_Calender() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Calendar));
		ObjectsReporsitory.WMS_Configuration_tab_Calendar.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_calender_FN_Holidays_Save));
		System.out.println("Navigated to Calender");
		System.out.println("--------------------------");

	}

	@Then("^Verify user can be able to select Year for Calender Master")
	public static void Verify_user_can_be_able_to_select_Year_for_Calender_Master() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_calender_Year_master));
		ObjectsReporsitory.WMS_Configuration_calender_Year_master.click();

		List<WebElement> calender_Year_master_DropdownResult = ObjectsReporsitory.WMS_Configuration_calender_Year_master_DR;

		if (ConfigFileReader.getconfiguration_addrole_InputType().contains("Input")) {

			for (WebElement webElement : calender_Year_master_DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getcalenderyearmaster_Input())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println(
							"Year Selected :" + ObjectsReporsitory.WMS_Configuration_calender_Year_master.getText());
					System.out.println("------------------------------------------------------");
					break;
				}

			}
		} else if (ConfigFileReader.getconfiguration_addrole_InputType().contains("Random")) {

			System.out.println("Selecting Random Year");
			System.out.println("-----------------------------------");

			Random randyear = new Random();
			int year = randyear.nextInt(ObjectsReporsitory.WMS_Configuration_calender_Year_master_DR.size());
			Selected_Year = ObjectsReporsitory.WMS_Configuration_calender_Year_master_DR.get(year).getText();

			for (WebElement webElement : calender_Year_master_DropdownResult) {
				if (webElement.getText().contains(Selected_Year)) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println(
							"Year Selected :" + ObjectsReporsitory.WMS_Configuration_calender_Year_master.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}

		} else {

			System.out.println("Selecting Random Year");
			System.out.println("-----------------------------------");

			Random randyear = new Random();
			int year = randyear.nextInt(ObjectsReporsitory.WMS_Configuration_calender_Year_master_DR.size());
			Selected_Year = ObjectsReporsitory.WMS_Configuration_calender_Year_master_DR.get(year).getText();

			for (WebElement webElement : calender_Year_master_DropdownResult) {
				if (webElement.getText().contains(Selected_Year)) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println(
							"Year Selected :" + ObjectsReporsitory.WMS_Configuration_calender_Year_master.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}

		}
	}

	@Then("^Verify user can be able to view Total Holidays for selected Year")
	public static void Verify_user_can_be_able_to_view_Total_Holidays_for_selected_Year() throws Throwable {

		Total_FesORNat_Holidays = Integer.parseInt(ObjectsReporsitory.WMS_calender_Total_FesORNat_Holidays.getText());
		Total_Regular_Holidays = Integer.parseInt(ObjectsReporsitory.WMS_calender_Total_FesORNat_Holidays.getText());
		Total_Holidays = Integer.parseInt(ObjectsReporsitory.WMS_calender_Total_FesORNat_Holidays.getText());
		System.out.println("_____________________________________________________________");
		System.out.println("Total Regular Holidays : " + Total_Regular_Holidays);
		System.out.println("Total Festival/National Holidays : " + Total_FesORNat_Holidays);
		System.out.println("Total Holidays : " + Total_Holidays);
		System.out.println("_____________________________________________________________");
	}

	@Then("^Verify user can be able to view existing Festival or National Holidays for selected Year")
	public static void Verify_user_can_be_able_to_view_existing_Festival_or_National_Holidays_for_selected_Year()
			throws Throwable {

		if (ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Record.getText().contains("No records available")) {

			System.out.println("No Festival or National Holidays Records Available for the seleted Year");
			System.out.println("_____________________________________________________________");
		}

		else {

			System.out.println("Festival or National Holidays Date");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Date) {
				String FesORNat_Holidays_Date = elementName.getText();
				System.out.println("Festival or National Holidays Date : " + FesORNat_Holidays_Date);

			}
			System.out.println("**************************************");

			System.out.println("Festival or National Holidays Day");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Day) {
				String FesORNat_Holidays_Day = elementName.getText();
				System.out.println("Festival or National Holidays Day : " + FesORNat_Holidays_Day);

			}
			System.out.println("**************************************");

			System.out.println("Festival or National Holidays Type");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type) {
				String FesORNat_Holidays_Type = elementName.getText();
				System.out.println("Festival or National Holidays Type : " + FesORNat_Holidays_Type);

			}
			System.out.println("**************************************");

			System.out.println("Festival or National Holidays Description");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Desc) {
				String FesORNat_Holidays_Desc = elementName.getText();
				System.out.println("Festival or National Holidays Description : " + FesORNat_Holidays_Desc);

			}
			System.out.println("**************************************");

		}

	}

	@Then("^Verify user can be able to view existing Regular Holidays for selected Year")
	public static void Verify_user_can_be_able_to_view_existing_Regular_Holidays_for_selected_Year() throws Throwable {

		if (ObjectsReporsitory.WMS_calender_Regular_Holidays_Record.getText().contains("No records available")) {

			System.out.println("No Regular Holidays Records Available for the seleted Year");
			System.out.println("_____________________________________________________________");
		}

		else {

			System.out.println("Regular Holidays Date");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_calender_Regular_Holidays_Date) {
				String Regular_Holidays_Date = elementName.getText();
				System.out.println("Regular Holidays Date : " + Regular_Holidays_Date);

			}
			System.out.println("**************************************");

			System.out.println("Regular Holidays Day");
			System.out.println("**************************************");

			for (WebElement elementName : ObjectsReporsitory.WMS_calender_Regular_Holidays_Day) {
				String Regular_Holidays_Day = elementName.getText();
				System.out.println("Regular Holidays Day : " + Regular_Holidays_Day);

			}
			System.out.println("**************************************");

		}

	}

	@Then("^Verify user can be able to select Year to add Festival or National Holiday")
	public static void Verify_user_can_be_able_to_select_Year_to_add_Festival_or_National_Holiday() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_calender_FesORNat_Holidays_calender));
		ObjectsReporsitory.WMS_calender_FesORNat_Holidays_calender.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_select_calender_header));
		ObjectsReporsitory.Datepicker_select_calender_header.click();
		CurrentYear = Integer.parseInt(ObjectsReporsitory.Datepicker_print_currect_year.getText()
				.substring(ObjectsReporsitory.Datepicker_print_currect_year.getText().length() - 4));

		ObjectsReporsitory.Datepicker_select_calender_header.click();

		List<WebElement> Year = ObjectsReporsitory.Datepicker_select_Date;

		Random rand6547 = new Random();
		int Random_Year = rand6547.nextInt(ObjectsReporsitory.Datepicker_select_Date.size());
		randomYearSelection = ObjectsReporsitory.Datepicker_select_Date.get(Random_Year).getText();

		for (WebElement webElement : Year) {
			if (webElement.getText().contains(randomYearSelection)) {
				webElement.click();
				break;
			}
		}

		System.out.println("Year Selected");
		System.out.println("________________");
		Thread.sleep(2000);

	}

	@Then("^Verify user can be able to select month to add Festival or National Holiday")
	public static void Verify_user_can_be_able_to_select_month_to_add_Festival_or_National_Holiday() throws Throwable {

		List<WebElement> month = ObjectsReporsitory.Datepicker_select_Date;

		Random rand6547dsa = new Random();
		int Random_month = rand6547dsa.nextInt(ObjectsReporsitory.Datepicker_select_Date.size());
		randommonthSelection = ObjectsReporsitory.Datepicker_select_Date.get(Random_month).getText();

		for (WebElement webElement : month) {
			if (webElement.getText().contains(randommonthSelection)) {
				webElement.click();
				break;
			}
		}

		System.out.println("Month Selected");
		System.out.println("________________");
		Thread.sleep(2000);
	}

	@Then("^Verify user can be able to select date to add Festival or National Holiday")
	public static void Verify_user_can_be_able_to_select_date_to_add_Festival_or_National_Holiday() throws Throwable {

		List<WebElement> date = ObjectsReporsitory.Datepicker_select_Date;

		Random rand6547saddsa = new Random();
		int Random_date = rand6547saddsa.nextInt(ObjectsReporsitory.Datepicker_select_Date.size());
		randomdateSelection = ObjectsReporsitory.Datepicker_select_Date.get(Random_date).getText();

		for (WebElement webElement : date) {
			if (webElement.getText().contains(randomdateSelection)) {
				webElement.click();
				break;
			}
		}

		System.out.println("Date Selected");
		System.out.println("________________");
		Thread.sleep(2000);
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify user can be able to view date selected for Festival or National Holiday")
	public static void Verify_user_can_be_able_to_view_date_selected_for_Festival_or_National_Holiday()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_calender_FesORNat_Holidays_calender_date_Input));
		System.out.println("Date Selected for Festival or National Holiday : "
				+ ObjectsReporsitory.WMS_calender_FesORNat_Holidays_calender_date_Input.getText());
		System.out.println("____________________________________________");

	}

	@Then("^Verify user can be able to select Holiday type")
	public static void Verify_user_can_be_able_to_select_Holiday_type() throws Throwable {

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input));
		ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input.click();

		List<WebElement> DropdownResult_FesORNat_Holidays_Type = ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input_DR;

		if (ConfigFileReader.getFesORNat_Holidays_Type().contains("Random")) {
			System.out.println("Selecting Random Holiday Type");
			Random rand6547 = new Random();
			int FesORNat_Holidays_Type = rand6547
					.nextInt(ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input_DR.size());
			Selected_FesORNat_Holidays_Type = ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input_DR
					.get(FesORNat_Holidays_Type).getText();

			for (WebElement webElement : DropdownResult_FesORNat_Holidays_Type) {
				if (webElement.getText().contains(Selected_FesORNat_Holidays_Type)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(
							"Holiday Type :" + ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input.getText());
					break;
				}
			}
		} else {

			for (WebElement webElement : DropdownResult_FesORNat_Holidays_Type) {
				if (webElement.getText().contains(ConfigFileReader.getFesORNat_Holidays_Type_value())) {
					webElement.click();
					System.out.println(
							"Holiday Type :" + ObjectsReporsitory.WMS_calender_FesORNat_Holidays_Type_Input.getText());
					break;
				}
			}

		}
		System.out.println("____________________________________________________________________");
	}

	@Then("^Verify user can be able to description of Holiday")
	public static void Verify_user_can_be_able_to_description_of_Holiday() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_calender_FesORNat_Holidays_desc));
		ObjectsReporsitory.WMS_calender_FesORNat_Holidays_desc.click();
		ObjectsReporsitory.WMS_calender_FesORNat_Holidays_desc.clear();
		ObjectsReporsitory.WMS_calender_FesORNat_Holidays_desc.click();
		ObjectsReporsitory.WMS_calender_FesORNat_Holidays_desc
				.sendKeys(ConfigFileReader.getFesORNat_Holidays_desc() + " " + RandomString.make(5));
		System.out.println("Holiday Description : "
				+ ObjectsReporsitory.WMS_calender_FesORNat_Holidays_desc.getAttribute("value"));
		System.out.println("____________________________________________");

	}

	@Then("^Verify user can be able to save Holiday")
	public static void Verify_user_can_be_able_to_save_Holiday() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_calender_FN_Holidays_Save));
		ObjectsReporsitory.WMS_Configuration_calender_FN_Holidays_Save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation();
		Basic.PageLoader_Validation();
		System.out.println("Holiday Record is saved");
		System.out.println("____________________________________________");
	}

	@Then("^Verify user can be able to submit saved Holiday list")
	public static void Verify_user_can_be_able_to_submit_saved_Holiday_list() throws Throwable {

		Actions actions2weq = new Actions(DriverFactory.driver);
		actions2weq.moveToElement(ObjectsReporsitory.WMS_calender_submit);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_calender_submit));
		ObjectsReporsitory.WMS_calender_submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Thread.sleep(5000);
		Basic.popup_validation_calender();
		Basic.PageLoader_Validation();
		System.out.println("Holiday Record is Submitted");
		System.out.println("____________________________________________");
		System.out.println("Total Holiday Record after Submitted");
		System.out.println("____________________________________________");
		Calender_Create.Verify_user_can_be_able_to_view_Total_Holidays_for_selected_Year();
	}

	@Then("^Verify user can be able to select Regular Holiday type")
	public static void Verify_user_can_be_able_to_select_Regular_Holiday_type() throws Throwable {

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input));
		ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input.click();

		List<WebElement> DropdownResult_Regular_Holidays_Type = ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input_DR;

		if (ConfigFileReader.getRegular_Holidays_Type().contains("Random")) {
			System.out.println("Selecting Random Regular Holiday Type");
			Random rand6547 = new Random();
			int Regular_Holidays_Type = rand6547
					.nextInt(ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input_DR.size());
			Selected_Regular_Holidays_Type = ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input_DR
					.get(Regular_Holidays_Type).getText();

			for (WebElement webElement : DropdownResult_Regular_Holidays_Type) {
				if (webElement.getText().contains(Selected_Regular_Holidays_Type)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Regular Holiday Type :"
							+ ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input.getText());
					break;
				}
			}
		} else {

			for (WebElement webElement : DropdownResult_Regular_Holidays_Type) {
				if (webElement.getText().contains(ConfigFileReader.getRegular_Holidays_Type_value())) {
					webElement.click();
					System.out.println("Regular Holiday Type :"
							+ ObjectsReporsitory.WMS_calender_Regular_Holidays_Type_Input.getText());
					break;
				}
			}

		}
		System.out.println("____________________________________________________________________");
	}

	@Then("^Verify user can be able to select Regular Holiday Day")
	public static void Verify_user_can_be_able_to_select_Regular_Holiday_Day() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input));
		ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input.click();

		List<WebElement> DropdownResult_Regular_Holidays_Day = ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input_DR;

		if (ConfigFileReader.getRegular_Holidays_Day_Type().contains("Random")) {
			System.out.println("Selecting Random Regular Holiday - Day");
			Random rand6547 = new Random();
			int Regular_Holidays_Type = rand6547
					.nextInt(ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input_DR.size());
			Selected_Regular_Holidays_Day = ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input_DR
					.get(Regular_Holidays_Type).getText();

			for (WebElement webElement : DropdownResult_Regular_Holidays_Day) {
				if (webElement.getText().contains(Selected_Regular_Holidays_Day)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Regular Holiday - Day :"
							+ ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input.getText());
					break;
				}
			}
		} else {

			for (WebElement webElement : DropdownResult_Regular_Holidays_Day) {
				if (webElement.getText().contains(ConfigFileReader.getRegular_Holidays_Day_Type_value())) {
					webElement.click();
					System.out.println("Regular Holiday - Day :"
							+ ObjectsReporsitory.WMS_calender_Regular_Holidays_Day_Input.getText());
					break;
				}
			}

		}
		System.out.println("____________________________________________________________________");

	}

	@Then("^Verify user can be able to save Regular Holiday")
	public static void Verify_user_can_be_able_to_save_Regular_Holiday() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_calender_Regular_Holidays_Save));
		ObjectsReporsitory.WMS_Configuration_calender_Regular_Holidays_Save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		System.out.println("Regular Holiday Record is saved");
		System.out.println("____________________________________________");

	}

	public static void remove_Festival_or_National_Holidays_for_selected_Year() throws Throwable {
		System.out.println("Removing Festival or National Holidays for selected Year");
		System.out.println("_________________________________________________________");

		int Total_FesOrNat_Holidays = ObjectsReporsitory.WMS_calender_FesORNat_Holidays_delete.size();

		int min_FesOrNat_Holidays = 1;
		int max_FesOrNat_Holidays = Total_FesOrNat_Holidays;
		Random rand7das = new Random();
		Random_FesOrNat_Holidays = rand7das.nextInt(max_FesOrNat_Holidays - min_FesOrNat_Holidays)
				+ min_FesOrNat_Holidays;

		System.out.println("Selecting Festival or National Holidays to remove");
		List<WebElement> elements = ObjectsReporsitory.WMS_calender_FesORNat_Holidays_delete;

		// Generate random indices
		Random random = new Random();
		List<Integer> randomIndices = new ArrayList<>();
		int listSize = elements.size();
		while (randomIndices.size() < Random_FesOrNat_Holidays) {
			int randomIndex = random.nextInt(listSize);
			if (!randomIndices.contains(randomIndex)) {
				randomIndices.add(randomIndex);
			}
		}

		// Click on the random elements
		for (int index : randomIndices) {
			WebElement element = elements.get(index);
			Actions actiondass = new Actions(DriverFactory.driver);
			actiondass.moveToElement(element);
			actiondass.perform();
			element.click();
			Thread.sleep(2000);
		}

		System.out.println(" Festival or National Holidays for selected Year removed successfully");
		System.out.println("_________________________________________________________");

	}

	public static void remove_Regular_Holidays_for_selected_Year() throws Throwable {
		System.out.println("Removing Regular Holidays for selected Year");
		System.out.println("_________________________________________________________");

		int Total_Regular_Holidays = ObjectsReporsitory.WMS_calender_Regular_Holidays_delete.size();

		int min_Regular_Holidays = 1;
		int max_Regular_Holidays = Total_Regular_Holidays;
		Random rand7das = new Random();
		Random_Regular_Holidays = rand7das.nextInt(max_Regular_Holidays - min_Regular_Holidays) + min_Regular_Holidays;

		System.out.println("Selecting Regular Holidays to remove");
		List<WebElement> elements = ObjectsReporsitory.WMS_calender_Regular_Holidays_delete;

		// Generate random indices
		Random random = new Random();
		List<Integer> randomIndices = new ArrayList<>();
		int listSize = elements.size();
		while (randomIndices.size() < Random_Regular_Holidays) {
			int randomIndex = random.nextInt(listSize);
			if (!randomIndices.contains(randomIndex)) {
				randomIndices.add(randomIndex);
			}
		}

		// Click on the random elements
		for (int index : randomIndices) {
			WebElement element = elements.get(index);
			Actions actions = new Actions(DriverFactory.driver);
			actions.moveToElement(element);
			actions.perform();
			element.click();
			Thread.sleep(2000);
		}

		System.out.println(" Regular Holidays for selected Year removed successfully");
		System.out.println("_________________________________________________________");

	}

	@Then("^Verify user can be able to Remove existing Festival or National Holidays for selected Year")
	public static void Verify_user_can_be_able_to_Remove_existing_Festival_or_National_Holidays_for_selected_Year()
			throws Throwable {

		Calender_Create.Verify_user_can_be_able_to_view_existing_Festival_or_National_Holidays_for_selected_Year();
		Calender_Create.Verify_user_can_be_able_to_view_existing_Regular_Holidays_for_selected_Year();
		Calender_Create.Verify_user_can_be_able_to_select_Year_to_add_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_select_month_to_add_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_select_date_to_add_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_view_date_selected_for_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_select_Holiday_type();
		Calender_Create.Verify_user_can_be_able_to_description_of_Holiday();
		Calender_Create.Verify_user_can_be_able_to_save_Holiday();
		// 2nd FesOrNat Holiday
		Calender_Create.Verify_user_can_be_able_to_select_Year_to_add_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_select_month_to_add_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_select_date_to_add_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_view_date_selected_for_Festival_or_National_Holiday();
		Calender_Create.Verify_user_can_be_able_to_select_Holiday_type();
		Calender_Create.Verify_user_can_be_able_to_description_of_Holiday();
		Calender_Create.Verify_user_can_be_able_to_save_Holiday();
		Calender_Create.remove_Festival_or_National_Holidays_for_selected_Year();
		// Regular Holiday
		Calender_Create.Verify_user_can_be_able_to_select_Regular_Holiday_type();
		Calender_Create.Verify_user_can_be_able_to_select_Regular_Holiday_Day();
		Calender_Create.Verify_user_can_be_able_to_save_Regular_Holiday();
		Calender_Create.remove_Regular_Holidays_for_selected_Year();
		Calender_Create.Verify_user_can_be_able_to_save_Regular_Holiday();

		Calender_Create.Verify_user_can_be_able_to_submit_saved_Holiday_list();

	}

}
