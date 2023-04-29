//package test;
//
//import java.util.Random;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import dataProviders.ConfigFileReader;
//import object_repository.ObjectsReporsitory;
//import stepdefinition.Webdriver;
//
//public class kendo_Calender_Random {
//	public static int CurrentYear;
//	public static int min_age_year;
//	public static int max_age_year;
//	public static int randomYear;
//	public static int First;
//	public static int Last;
//	public static int First2;
//	public static int Last2;
//	public static int First3;
//	public static int Last3;
//	public static int First4;
//	public static int Last4;
//	public static int randomYearSelection;
//	public static int popup_validation;
//	// Read Configuration
//
//	public static ConfigFileReader configFileReader;
//
//
//	// Page Factory
//	public kendo_Calender_Random() {
//		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
//	}
//
//	// Common Imports
//	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
//	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
//
//	// **************** Start import methods for step definition
//	// ********************
//
//	public static void kendo_Calender() throws Throwable {
//
//		ObjectsReporsitory.Datepicker_select_calender.click();
//		ObjectsReporsitory.Datepicker_select_calender_header.click();
//		CurrentYear = Integer.parseInt(ObjectsReporsitory.Datepicker_print_currect_year.getText()
//				.substring(ObjectsReporsitory.Datepicker_print_currect_year.getText().length() - 4));
//		min_age_year = CurrentYear - 25;
//		max_age_year = CurrentYear - 48;
//		System.out.println("Currect Year :" + CurrentYear);
//		System.out.println("Minimum Age Year " + min_age_year);
//		System.out.println("Maximum Age Year " + max_age_year);
//		Random rand = new Random();
//		randomYear = rand.nextInt(min_age_year - max_age_year) + max_age_year;
//		System.out.println("Random Year : " + randomYear);
//		First = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_First_element.getText());
//		Last = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_Last_element.getText());
//		System.out.println("OnScreen First Element Year: " + First);
//		System.out.println("OnScreen Last Element Year: " + Last);
//		Thread.sleep(3000);
//		if (((First > max_age_year) && (First < min_age_year)) && ((Last > max_age_year) && (Last < min_age_year))) {
//			System.out.println(First + " is greater then " + max_age_year + " and less then " + min_age_year);
//			System.out.println(Last + " is greater then " + max_age_year + " and less then " + min_age_year);
//			Random rand2 = new Random();
//			randomYearSelection = rand2.nextInt(ObjectsReporsitory.Datepicker_Randomyear.size());
//			try {
//				ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//				ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//			}
//			System.out.println("Year selected: " + randomYearSelection);
//		} else {
//			System.out.println(randomYear + " Year is not found in the UI - Scrolling to " +randomYear +" Year");
//			Actions actions = new Actions(Webdriver.driver);
//			actions.moveToElement(ObjectsReporsitory.Datepicker_Scroll_First_element);
//			actions.perform();
//			Thread.sleep(5000);
//
//			First2 = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_First_element.getText());
//			Last2 = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_Last_element.getText());
//			System.out.println("Scrolled - OnScreen First Element Year: " + First2);
//			System.out.println("Scrolled - OnScreen Last Element Year: " + Last2);
//
//			if (((First2 > max_age_year) && (First2 < min_age_year))
//					&& ((Last2 > max_age_year) && (Last2 < min_age_year))) {
//				System.out.println(First2 + " is greater then " + max_age_year + " and less then " + min_age_year);
//				System.out.println(Last2 + " is greater then " + max_age_year + " and less then " + min_age_year);
//				Random rand2 = new Random();
//				randomYearSelection = rand2.nextInt(ObjectsReporsitory.Datepicker_Randomyear.size());
//				try {
//					ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//				} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//					ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//				}
//				System.out.println("Year selected: " + randomYearSelection);
//			} else {
//				System.out.println(randomYear + " Year is not found in the UI - Scrolling to " +randomYear +"Year");
//				Actions actions2 = new Actions(Webdriver.driver);
//				actions2.moveToElement(ObjectsReporsitory.Datepicker_Scroll_First_element);
//				actions2.perform();
//				Thread.sleep(5000);
//				First3 = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_First_element.getText());
//				Last3 = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_Last_element.getText());
//				System.out.println("Scrolled - OnScreen First Element Year: " + First3);
//				System.out.println("Scrolled - OnScreen Last Element Year: " + Last3);
//
//				if (((First3 > max_age_year) && (First3 < min_age_year))
//						&& ((Last3 > max_age_year) && (Last3 < min_age_year))) {
//					System.out.println(First3 + " is greater then " + max_age_year + " and less then " + min_age_year);
//					System.out.println(Last3 + " is greater then " + max_age_year + " and less then " + min_age_year);
//					Random rand2 = new Random();
//					randomYearSelection = rand2.nextInt(ObjectsReporsitory.Datepicker_Randomyear.size());
//					try {
//						ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//					} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//						ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//					}
//					System.out.println("Year selected: " + randomYearSelection);
//				} else {
//					System.out.println(randomYear + " Year is not found in the UI - Scrolling to " +randomYear +"Year");
//					Actions actions3 = new Actions(Webdriver.driver);
//					actions3.moveToElement(ObjectsReporsitory.Datepicker_Scroll_First_element);
//					actions3.perform();
//					Thread.sleep(5000);
//
//					First4 = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_First_element.getText());
//					Last4 = Integer.parseInt(ObjectsReporsitory.Datepicker_Scroll_Last_element.getText());
//					System.out.println("Scrolled - OnScreen First Element Year: " + First4);
//					System.out.println("Scrolled - OnScreen Last Element Year: " + Last4);
//
//					if (((First4 > max_age_year) && (First4 < min_age_year))
//							&& ((Last4 > max_age_year) && (Last4 < min_age_year))) {
//						System.out.println(
//								First4 + " is greater then " + max_age_year + " and less then " + min_age_year);
//						System.out
//								.println(Last4 + " is greater then " + max_age_year + " and less then " + min_age_year);
//						Random rand2 = new Random();
//						randomYearSelection = rand2.nextInt(ObjectsReporsitory.Datepicker_Randomyear.size());
//						try {
//							ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//						} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//							ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).click();
//						}
//						System.out.println("Year selected: "
//								+ ObjectsReporsitory.Datepicker_Randomyear.get(randomYearSelection).getText());
//					} else {
//						System.out.println("Year Not Found");
//					}
//				}
//			}
//			popup_validation=ObjectsReporsitory.basic_popup_validation.size();
//			
//			if(popup_validation>1) {
//				
//				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
//				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
//				
//			}
//			
//		}
//
//		Thread.sleep(4000);
//		int randommonth = rand.nextInt(ObjectsReporsitory.Datepicker_select_Month.size());
//		System.out.println("Month selected : " + randommonth);
//		try {
//			ObjectsReporsitory.Datepicker_select_Month.get(randommonth).click();
//		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//			ObjectsReporsitory.Datepicker_select_Month.get(randommonth).click();
//		}
//		Thread.sleep(4000);
//		int randomDate = rand.nextInt(ObjectsReporsitory.Datepicker_select_Date.size());
//		System.out.println("Date selected : " + randomDate);
//		try {
//			ObjectsReporsitory.Datepicker_select_Date.get(randomDate).click();
//		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//			ObjectsReporsitory.Datepicker_select_Date.get(randomDate).click();
//		}
//		Thread.sleep(4000);
//	}
//}
