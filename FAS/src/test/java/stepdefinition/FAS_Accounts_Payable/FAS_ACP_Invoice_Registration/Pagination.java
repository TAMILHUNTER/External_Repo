package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration;

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
import dataProviders.Tamil.ConfigFileReader_Tamil;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Webdriver;

public class Pagination {

	// Read Configuration

	public static ConfigFileReader configFileReader;
	public static String select_Random_Past_Date;
	public static int Search_Result_Count;
	public static String select_Random_Per_Page;
	public static String Order_Number;
	public static String Selected_List_Freeze_Random;
	public static String Selected_List_UnFreeze_Random;
	public static String Selected_List_View_Random;
	public static String Selected_List_View_Random2;
	public static int Total_Pages;
	public static int Random_Page;
	public static int ManualPage;

	// Page Factory
	public Pagination() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void Verify_User_can_be_able_to_Go_to_Next_Page() throws Throwable {

		Actions action245 = new Actions(Webdriver.driver);
		action245.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println(
				"Current Page No : " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_GotToNextPage));
		ObjectsReporsitory.Invoice_Registration_GotToNextPage.click();
		Thread.sleep(3000);
		System.out.println("Switched to Next Page");
		System.out.println("-------------------------");
		Actions action246 = new Actions(Webdriver.driver);
		action246.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println("New Page No: " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Go_to_Previous_Page() throws Throwable {

		Actions action245 = new Actions(Webdriver.driver);
		action245.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_GotToLastPage));
		ObjectsReporsitory.Invoice_Registration_GotToLastPage.click();
		System.out.println(
				"Current Page No : " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_GotToPreviousPage));
		ObjectsReporsitory.Invoice_Registration_GotToPreviousPage.click();
		Thread.sleep(3000);
		System.out.println("Switched to Previous Page");
		System.out.println("-------------------------");
		Actions action246 = new Actions(Webdriver.driver);
		action246.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println("New Page No: " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Go_to_Last_Page() throws Throwable {

		Actions action245 = new Actions(Webdriver.driver);
		action245.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println(
				"Current Page No : " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_GotToLastPage));
		ObjectsReporsitory.Invoice_Registration_GotToLastPage.click();
		Thread.sleep(3000);
		System.out.println("Switched to Last Page");
		System.out.println("-------------------------");
		Actions action246 = new Actions(Webdriver.driver);
		action246.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println("New Page No: " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Go_to_First_Page() throws Throwable {

		Actions action245 = new Actions(Webdriver.driver);
		action245.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_GotToLastPage));
		ObjectsReporsitory.Invoice_Registration_GotToLastPage.click();
		System.out.println(
				"Current Page No : " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_GotToFirstPage));
		ObjectsReporsitory.Invoice_Registration_GotToFirstPage.click();
		Thread.sleep(3000);
		System.out.println("Switched to First Page");
		System.out.println("-------------------------");
		Actions action246 = new Actions(Webdriver.driver);
		action246.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println("New Page No: " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Go_to_Random_Page() throws Throwable {

		Actions action245 = new Actions(Webdriver.driver);
		action245.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		Total_Pages = Integer.parseInt(ObjectsReporsitory.Invoice_Registration_TotalPage.getText().substring(8));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_CurrentPage));
		int min_Page = (Total_Pages/2);
		int max_Page = (Total_Pages);
		Random rand_Page = new Random();
		Random_Page = rand_Page.nextInt(max_Page-min_Page) + min_Page;
		ObjectsReporsitory.Invoice_Registration_CurrentPage.click();
		ObjectsReporsitory.Invoice_Registration_CurrentPage.clear();
		ObjectsReporsitory.Invoice_Registration_CurrentPage.click();
		ObjectsReporsitory.Invoice_Registration_CurrentPage.sendKeys(Random_Page+"");
		System.out.println("Random Page No :" + Random_Page);
		Actions actions_Keys1 = new Actions(Webdriver.driver);
		actions_Keys1.sendKeys(Keys.ENTER);
		actions_Keys1.perform();
		System.out.println("Switched to Page No :" + Random_Page);
		System.out.println("-------------------------");
		Actions action246 = new Actions(Webdriver.driver);
		action246.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		System.out.println("New Page No: " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
		System.out.println("-------------------------");
		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Go_to_Custom_Page() throws Throwable {

		Actions action245 = new Actions(Webdriver.driver);
		action245.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
		Total_Pages = Integer.parseInt(ObjectsReporsitory.Invoice_Registration_TotalPage.getText().substring(8));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_CurrentPage));
		ManualPage = Integer.parseInt(ConfigFileReader.getInvoice_Registration_Pagination());
		ObjectsReporsitory.Invoice_Registration_CurrentPage.click();
		ObjectsReporsitory.Invoice_Registration_CurrentPage.clear();
		ObjectsReporsitory.Invoice_Registration_CurrentPage.click();
		ObjectsReporsitory.Invoice_Registration_CurrentPage.sendKeys(""+ManualPage);
		if (Total_Pages < ManualPage) {
			System.out.println("Entered Page Not Found : Kindly Try with Valid Input");
		} else {
			Actions actions_Keys1 = new Actions(Webdriver.driver);
			actions_Keys1.sendKeys(Keys.ENTER);
			actions_Keys1.perform();
			System.out.println("Switched to Page No :" + Random_Page);
			System.out.println("-------------------------");
			Actions action246 = new Actions(Webdriver.driver);
			action246.moveToElement(ObjectsReporsitory.Invoice_Registration_CurrentPage).perform();
			System.out.println(
					"New Page No: " + ObjectsReporsitory.Invoice_Registration_CurrentPage.getAttribute("value"));
			System.out.println("-------------------------");
			Settings.Display_Search_Result();
		}

	}
}
