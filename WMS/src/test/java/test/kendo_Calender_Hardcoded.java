package test;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import utils.DriverFactory;
import java.time.Duration;
public class kendo_Calender_Hardcoded {
	public static int CurrentYear;
	public static int min_age_year;
	public static int max_age_year;
	public static int randomYear;
	public static int First;
	public static int Last;
	public static int First2;
	public static int Last2;
	public static int First3;
	public static int Last3;
	public static int First4;
	public static int Last4;
	public static int randomYearSelection;
	public static int popup_validation;
	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public kendo_Calender_Hardcoded() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void kendo_Calender() throws Throwable {

		ObjectsReporsitory.Datepicker_select_calender.click();
		ObjectsReporsitory.Datepicker_select_calender_header.click();
		CurrentYear = Integer.parseInt(ObjectsReporsitory.Datepicker_print_currect_year.getText()
				.substring(ObjectsReporsitory.Datepicker_print_currect_year.getText().length() - 4));
		System.out.println("Currect Year :" + CurrentYear);
		Thread.sleep(5000);
		Actions actions51 = new Actions(DriverFactory.driver);
		actions51.moveToElement(ObjectsReporsitory.Datepicker_Year_First_Element);
		actions51.perform();
		Thread.sleep(3000);
		Actions actions52341 = new Actions(DriverFactory.driver);
		actions52341.moveToElement(ObjectsReporsitory.Datepicker_Year_First_Element);
		actions52341.perform();
		Thread.sleep(3000);
		Actions actions5234121 = new Actions(DriverFactory.driver);
		actions5234121.moveToElement(ObjectsReporsitory.Datepicker_Year_First_Element);
		actions5234121.perform();
		Thread.sleep(3000);
		Actions actions543 = new Actions(DriverFactory.driver);
		actions543.moveToElement(ObjectsReporsitory.Datepicker_Year_1998);
		actions543.perform();
		ObjectsReporsitory.Datepicker_Year_1998.click();
		System.out.println("Year Selected : 1998");
		Random rand = new Random();
		Thread.sleep(4000);
		int randommonth = rand.nextInt(ObjectsReporsitory.Datepicker_select_Month.size());
		System.out.println("Month selected : " + randommonth);
		try {
			Thread.sleep(4000);
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Datepicker_select_Month.get(randommonth));
			// ObjectsReporsitory.Datepicker_select_Month.get(randommonth).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Thread.sleep(4000);
			// ObjectsReporsitory.Datepicker_select_Month.get(randommonth).click();
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Datepicker_select_Month.get(randommonth));
		}
		Thread.sleep(4000);
		int randomDate = rand.nextInt(ObjectsReporsitory.Datepicker_select_Date.size());
		System.out.println("Date selected : " + randomDate);
		try {
			Thread.sleep(4000);
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Datepicker_select_Date.get(randomDate));
			// ObjectsReporsitory.Datepicker_select_Date.get(randomDate).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Thread.sleep(4000);
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Datepicker_select_Date.get(randomDate));
			// ObjectsReporsitory.Datepicker_select_Date.get(randomDate).click();
		}
		Thread.sleep(4000);
	}

	public static void kendo_Calender_Attendance() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_select_calender));
		ObjectsReporsitory.Datepicker_select_calender.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_select_calender_header));
		ObjectsReporsitory.Datepicker_select_calender_header.click();

		// Select Year
		Actions actions50 = new Actions(DriverFactory.driver);
		actions50.moveToElement(ObjectsReporsitory.Datepicker_Year_2022);
		actions50.perform();
		Thread.sleep(5000);
		ObjectsReporsitory.Datepicker_Year_2022.click();
		System.out.println("Year Selected : 2022");

		// Select Month
		Random rand = new Random();
		Thread.sleep(4000);
		int randommonth = rand.nextInt(ObjectsReporsitory.Datepicker_select_Month.size());
		System.out.println("Month selected : " + randommonth);
		try {
			Thread.sleep(4000);
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Datepicker_select_Month.get(randommonth));
			// ObjectsReporsitory.Datepicker_select_Month.get(randommonth).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Thread.sleep(4000);
			// ObjectsReporsitory.Datepicker_select_Month.get(randommonth).click();
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Datepicker_select_Month.get(randommonth));
		}
		Thread.sleep(4000);
		
		// Select Date
		
		int randomDate = rand.nextInt(ObjectsReporsitory.Datepicker_select_Date.size());
		System.out.println("Date selected : " + randomDate);
		try {
			Thread.sleep(4000);
			((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", ObjectsReporsitory.Datepicker_select_Date.get(randomDate));
			//ObjectsReporsitory.Datepicker_select_Date.get(randomDate).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			Thread.sleep(4000);
			((JavascriptExecutor)DriverFactory.driver).executeScript("arguments[0].click();", ObjectsReporsitory.Datepicker_select_Date.get(randomDate));
			//ObjectsReporsitory.Datepicker_select_Date.get(randomDate).click();
		}
		Thread.sleep(4000);
	}
}
