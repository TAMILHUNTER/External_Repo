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
import dataProviders.Tamil.*;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Webdriver;
import stepdefinition.kendo_Calender_Random;
import test.DBQuery_Tamil.DataBaseConnection;

public class Advance_Search {

	public static String Purchase_Order_Number_from_DB;
	public static String Purchase_Order_Number_from_FrontEnd;
	public static int Multiple_Purchase_Order_Number_from_FrontEnd;
	public static String Work_Order_Number_from_DB;
	public static String Work_Order_Number_from_FrontEnd;
	public static int Multiple_Work_Order_Number_from_FrontEnd;
	public static String MRN_Number_from_DB;
	public static String MRN_Number_from_FrontEnd;
	public static int Search_Result_Count;
	public static String select_Random_job;
	public static String select_Random_job_deselect;
	public static String select_Random_job_deselect_All;
	public static String Order_Number;
	public static String select_Random_Multiple_job;
	public static String Vendor_Name;
	public static String Vendor_Pan;
	public static String Vendor_MobileNo;
	public static String Vendor_TelephoneNo;
	public static String Vendor_FaxNo;
	public static String Vendor_GSTNo;

	// Read Configuration

	public static ConfigFileReader ConfigFileReader;
	public static ConfigFileReader_Tamil ConfigFileReader_Tamil;

	// Page Factory
	public Advance_Search() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void search_Invoices_by_Document_Purchase_Order_for_PO_Advance() throws Throwable {

		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_clearAdvanceSearch.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		// object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document
				.sendKeys("Purchase Orde");
		List<WebElement> DropdownResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_AllOptions;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Purchase Order")) {
				webElement.click();
				System.out.println("Search Document By : Purchase Order (PO - Advance)");
				System.out.println("====================================");
				break;
			}
		}
		if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("Manual")) {
			System.out.println("Search input By : Manual");
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
					.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_Purchase_Order());
		} else if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("DB")) {
			System.out.println("Search input By : Data Base");
			DataBaseConnection.GetPurchase_Order_Number_for_PO();
		}

		Purchase_Order_Number_from_DB = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
				.getAttribute("value");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();

		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();

		System.out.println("Search Result Count : " + Search_Result_Count);

		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Purchase_Order_Number_from_FrontEnd = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println(
					"Purchase Order Number from Front End After Search: " + Purchase_Order_Number_from_FrontEnd);

			if (Purchase_Order_Number_from_FrontEnd.equals(Purchase_Order_Number_from_DB)) {
				System.out.println("DB & Front End - Values are matched");
				System.out.println("Search Completed : User Can be able to search by Purchase Order Number");
				System.out.println("-----------------------------------------------------------------------");
			} else {
				System.out.println("Error DB & Front End - Values are Not matched");
			}

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Purchase Orders Found");
			List<WebElement> listElement = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement.size(); i++) {
				System.out.println("Purchase Order Number " + i + " : " + listElement.get(i).getText());
			}
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();
	}

	public static void search_Invoices_by_Document_Purchase_Order_For_MRN() throws Throwable {

		// object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_clearAdvanceSearch.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document
				.sendKeys("Purchase Orde");
		List<WebElement> DropdownResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_AllOptions;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Purchase Order")) {
				webElement.click();
				System.out.println("Search Document By : Purchase Order (For MRN)");
				System.out.println("====================================");
				break;
			}
		}
		if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("Manual")) {
			System.out.println("Search input By : Manual");
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
					.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_Purchase_Order());
		} else if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("DB")) {
			System.out.println("Search input By : Data Base");
			DataBaseConnection.GetPurchase_Order_Number_for_MRN();
		}

		Purchase_Order_Number_from_DB = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
				.getAttribute("value");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();

		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();

		System.out.println("Search Result Count : " + Search_Result_Count);

		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Purchase_Order_Number_from_FrontEnd = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println(
					"Purchase Order Number from Front End After Search: " + Purchase_Order_Number_from_FrontEnd);

			if (Purchase_Order_Number_from_FrontEnd.equals(Purchase_Order_Number_from_DB)) {
				System.out.println("DB & Front End - Values are matched");
				System.out.println("Search Completed : User Can be able to search by Purchase Order Number");
				System.out.println("-----------------------------------------------------------------------");
			} else {
				System.out.println("Error DB & Front End - Values are Not matched");
			}

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Purchase Orders Found");
			List<WebElement> listElement = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement.size(); i++) {
				System.out.println("Purchase Order Number " + i + " : " + listElement.get(i).getText());
			}
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();
	}

	public static void search_Invoices_by_Document_Work_Order() throws Throwable {
		// object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_clearAdvanceSearch.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document
				.sendKeys("Work Orde");
		List<WebElement> DropdownResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_AllOptions;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Work Order")) {
				webElement.click();
				System.out.println("Search Document By : Work Order");
				System.out.println("====================================");
				break;
			}
		}
		if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("Manual")) {
			System.out.println("Search input By : Manual");
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
					.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_WorkOrder());
		} else if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("DB")) {

			System.out.println("Search input By : Data Base");
			DataBaseConnection.GetWork_Order_Number();
		}
		Work_Order_Number_from_DB = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
				.getAttribute("value");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();

		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();

		System.out.println("Search Result Count : " + Search_Result_Count);

		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Work_Order_Number_from_FrontEnd = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Work Order Number from Front End After Search: " + Work_Order_Number_from_FrontEnd);

			if (Work_Order_Number_from_FrontEnd.equals(Work_Order_Number_from_DB)) {
				System.out.println("DB & Front End - Values are matched");
				System.out.println("Search Completed : User Can be able to search by Work Order Number");
				System.out.println("-----------------------------------------------------------------------");
			} else {
				System.out.println("Error DB & Front End - Values are Not matched");
			}

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Work_Order Found");
			List<WebElement> listElement = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement.size(); i++) {
				System.out.println("Work Order Number " + i + " : " + listElement.get(i).getText());
			}
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();
	}

	public static void search_Invoices_by_Document_MRN() throws Throwable {
		// object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_clearAdvanceSearch.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.sendKeys("MR");
		List<WebElement> DropdownResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_AllOptions;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("MRN")) {
				webElement.click();
				System.out.println("Search Document By : MRN");
				System.out.println("====================================");
				break;
			}
		}
		if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("Manual")) {
			System.out.println("Search input By : Manual");
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
					.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_MRN_Number());
		} else if (dataProviders.ConfigFileReader.getadvance_search_Input_by().equals("DB")) {
			System.out.println("Search input By : Data Base");
			DataBaseConnection.GetMRN_Number();
		}
		MRN_Number_from_DB = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
				.getAttribute("value");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();

		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();

		System.out.println("Search Result Count : " + Search_Result_Count);

		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			MRN_Number_from_FrontEnd = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("MRN Number from Front End After Search: " + MRN_Number_from_FrontEnd);

			if (MRN_Number_from_FrontEnd.equals(MRN_Number_from_DB)) {
				System.out.println("DB & Front End - Values are matched");
				System.out.println("Search Completed : User Can be able to search by MRN Number");
				System.out.println("-----------------------------------------------------------------------");
			} else {
				System.out.println("Error DB & Front End - Values are Not matched");
			}

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple MRN Found");
			List<WebElement> listElement = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement.size(); i++) {
				System.out.println("MRN Number " + i + " : " + listElement.get(i).getText());
			}
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();
	}

	public static void search_Invoices_by_job() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_job));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_job.click();
		List<WebElement> DropdownResult_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options;
		Random Random_job = new Random();
		int Random_job_size = Random_job.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options.size());
		select_Random_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
				.get(Random_job_size).getText();
		for (WebElement webElement : DropdownResult_job) {
			if (webElement.getText().equals(select_Random_job)) {
				webElement.click();
				System.out.println("Selected job for Advance Search : " + select_Random_job);
				break;
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void search_Invoices_by_Multiple_job() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat);
		Screenshot.Screenshotforscenario();
		// Selecting First Job
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1());
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		List<WebElement> DropdownResult_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements;
//		Random Random_Multiple_job = new Random();
//		int Random_Multiple_job_size = Random_Multiple_job.nextInt(
//				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements
//						.size());
//		select_Random_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
//				.get(Random_Multiple_job_size).getText();
		for (WebElement webElement : DropdownResult_Multiple_job) {
			if (webElement.getText().contains(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1())) {
				webElement.click();
				System.out.println("Selected job for Advance Search 1: "
						+ dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1());
				break;
			} else {
				System.out.println("No Records Found");
			}

		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("Job1 added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
//Selecting Secound Job
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode2());
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		List<WebElement> DropdownResult_Multiple_job2 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements;
//		Random Random_Multiple_job = new Random();
//		int Random_Multiple_job_size = Random_Multiple_job.nextInt(
//				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements
//						.size());
//		select_Random_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
//				.get(Random_Multiple_job_size).getText();
		for (WebElement webElement : DropdownResult_Multiple_job2) {
			if (webElement.getText().contains(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode2())) {
				webElement.click();
				System.out.println("Selected job for Advance Search 2: "
						+ dataProviders.ConfigFileReader.getadvance_search_Input_jobCode2());
				break;
			} else {
				System.out.println("No Records Found");
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("Job2 added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();

		// Search With selected Multiple Jobs

		System.out.println("No of Job Selected for Search:"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("After Search : " + webElement.getText());
			}
		} else {
			System.out.println("No job Selected for Advanced Search");
		}

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post.click();

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Deselecting_job() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat);
		Screenshot.Screenshotforscenario();
		// Selecting First Job
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1());
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		List<WebElement> DropdownResult_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements;
//		Random Random_Multiple_job = new Random();
//		int Random_Multiple_job_size = Random_Multiple_job.nextInt(
//				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements
//						.size());
//		select_Random_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
//				.get(Random_Multiple_job_size).getText();
		for (WebElement webElement : DropdownResult_Multiple_job) {
			if (webElement.getText().contains(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1())) {
				webElement.click();
				System.out.println("Selected job for Advance Search 1: "
						+ dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1());
				break;
			} else {
				System.out.println("No Records Found");
			}

		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("Job1 added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
//Selecting Secound Job
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode2());
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		List<WebElement> DropdownResult_Multiple_job2 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements;
//		Random Random_Multiple_job = new Random();
//		int Random_Multiple_job_size = Random_Multiple_job.nextInt(
//				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements
//						.size());
//		select_Random_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
//				.get(Random_Multiple_job_size).getText();
		for (WebElement webElement : DropdownResult_Multiple_job2) {
			if (webElement.getText().contains(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode2())) {
				webElement.click();
				System.out.println("Selected job for Advance Search 2: "
						+ dataProviders.ConfigFileReader.getadvance_search_Input_jobCode2());
				break;
			} else {
				System.out.println("No Records Found");
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("Job2 added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
		System.out.println("No of Job Listed for Search After added :"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("Selected Jobs: " + webElement.getText());
			}
		} else {
			System.out.println("No Jobs Selected for Advanced Search : ");
		}

		List<WebElement> DropdownResult_job_Deselect = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;
		Random Random_job_Deselect = new Random();
		int Random_job_size_Deselect = Random_job_Deselect.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
						.size());
		select_Random_job_deselect = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
				.get(Random_job_size_Deselect).getText();
		for (WebElement webElement : DropdownResult_job_Deselect) {
			if (webElement.getText().equals(select_Random_job_deselect)) {
				webElement.click();
				System.out.println("UnSelected job for Advance Search : " + select_Random_job_deselect);
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_UnSelect));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_UnSelect.click();
		Thread.sleep(3000);
		System.out.println("Job Unselected from the Cart");
		System.out.println("No of Job Listed for Search After job Unselected :"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("Selected Jobs: " + webElement.getText());
			}
		} else {
			System.out.println("No Jobs Selected for Advanced Search : ");
		}

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post.click();

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void search_Invoices_by_All_job() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat);
		Screenshot.Screenshotforscenario();
		// Selecting First Job
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode_for_All());
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("No of Job Listed for Search Before added:"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("Search Result: " + webElement.getText());
			}
		} else {
			System.out.println("Jobs Listed for Advanced Search: ");
			System.out.println("====================================");
		}
		Thread.sleep(2000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_SelectAll);
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		System.out.println("No of Job Listed for Search After added :"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("Selected Jobs: " + webElement.getText());
			}
		} else {
			System.out.println("Jobs Selected for Advanced Search : ");
		}

		System.out.println("All Jobs added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post.click();
		Thread.sleep(5000);

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_Deselecting_All_job() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCrat);
		Screenshot.Screenshotforscenario();
		// Selecting First Job
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode_for_All());
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("No of Job Listed for Search Before added:"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("Search Result: " + webElement.getText());
			}
		} else {
			System.out.println("Jobs Listed for Advanced Search: ");
			System.out.println("====================================");
		}
		Thread.sleep(2000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_SelectAll);
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		System.out.println("No of Job Listed for Search After added :"
				+ object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
						.size());
		if (object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions
				.size() > 0) {
			List<WebElement> searchResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;
			for (WebElement webElement : searchResult) {
				System.out.println("Selected Jobs: " + webElement.getText());
			}
		} else {
			System.out.println("Jobs Selected for Advanced Search : ");
		}

		System.out.println("All Jobs added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();

		Thread.sleep(5000);

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_UnSelect_All));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_UnSelect_All.click();
		Thread.sleep(3000);
		System.out.println("All Jobs Unselected from the Cart");
		// Selecting First Job
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_input
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1());
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		List<WebElement> DropdownResult_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements;
//		Random Random_Multiple_job = new Random();
//		int Random_Multiple_job_size = Random_Multiple_job.nextInt(
//				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_AllElements
//						.size());
//		select_Random_Multiple_job = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
//				.get(Random_Multiple_job_size).getText();
		for (WebElement webElement : DropdownResult_Multiple_job) {
			if (webElement.getText().contains(dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1())) {
				webElement.click();
				System.out.println("Selected job for Advance Search 1: "
						+ dataProviders.ConfigFileReader.getadvance_search_Input_jobCode1());
				break;
			} else {
				System.out.println("No Records Found");
			}

		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Select.click();
		Thread.sleep(3000);
		System.out.println("Job1 added to Cart");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_JobCart_Post.click();
		Thread.sleep(5000);

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void search_Invoices_by_Vendor() throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_vendor());
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_dr));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_dr.click();
		Thread.sleep(3000);
		// Search With Vendor Code
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_Vendor_Details_are_displayed_correctly() throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor
				.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Input_vendor());
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_dr));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_dr.click();
		Thread.sleep(3000);
		Actions action1 = new Actions(Webdriver.driver);
		action1.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details).perform();
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details.click();
		Vendor_Name = ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details_Vendor.getText();
		Vendor_Pan = ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details_Pan.getText();
		Vendor_MobileNo = ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details_MobileNo.getText();
		Vendor_TelephoneNo = ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details_TelephoneNo
				.getText();
		Vendor_FaxNo = ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details_Fax.getText();
		Vendor_GSTNo = ObjectsReporsitory.Invoice_Registration_Advance_Search_By_vendor_details_GSTNo.getText();
		System.out.println("-----------------------------------");

		if (Vendor_Name.contains(", , , ,")) {
			System.out.println("Error : Vendor Name Displayed incorrectly");
			System.out.println("Vendor Name : " + Vendor_Name);
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Vendor Name Displayed Correctly");
			System.out.println("Vendor Name : " + Vendor_Name);
			System.out.println("-----------------------------------");
		}

		if (Vendor_Pan.isEmpty()) {
			System.out.println("Error : Vendor Pan Displayed incorrectly");
			System.out.println("Vendor Pan : " + Vendor_Pan);
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Vendor Pan Displayed Correctly");
			System.out.println("Vendor Pan : " + Vendor_Pan);
			System.out.println("-----------------------------------");
		}

		if (Vendor_MobileNo.isEmpty()) {
			System.out.println("Error : Vendor Mobile Number Displayed incorrectly");
			System.out.println("Vendor Mobile Number : " + Vendor_MobileNo);
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Vendor Mobile Number Displayed Correctly");
			System.out.println("Vendor Mobile Number : " + Vendor_MobileNo);
			System.out.println("-----------------------------------");
		}

		if (Vendor_TelephoneNo.isEmpty()) {
			System.out.println("Error : Vendor Telephone Number Displayed incorrectly");
			System.out.println("Vendor Telephone Number : " + Vendor_TelephoneNo);
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Vendor Telephone Number Displayed Correctly");
			System.out.println("Vendor Telephone Number : " + Vendor_TelephoneNo);
			System.out.println("-----------------------------------");
		}

		if (Vendor_FaxNo.isEmpty()) {
			System.out.println("Error : Vendor Fax Number Displayed incorrectly");
			System.out.println("Vendor Fax Number : " + Vendor_FaxNo);
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Vendor Fax Number Displayed Correctly");
			System.out.println("Vendor Fax Number : " + Vendor_FaxNo);
			System.out.println("-----------------------------------");
		}

		if (Vendor_GSTNo.isEmpty()) {
			System.out.println("Error : Vendor GST Number Displayed incorrectly");
			System.out.println("Vendor GST Number : " + Vendor_GSTNo);
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Vendor GST Number Displayed Correctly");
			System.out.println("Vendor GST Number : " + Vendor_GSTNo);
			System.out.println("-----------------------------------");
		}
		Screenshot.Screenshotforscenario();
		Actions actions1212 = new Actions(Webdriver.driver);
		actions1212.sendKeys(Keys.ESCAPE);
		actions1212.build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void search_Invoices_by_Date() throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		kendo_Calender_Random.kendo_Calender_double_date_Picker_random();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}
	
	
	public static void search_Invoices_by_Manual_Date() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		kendo_Calender_Random.kendo_Calender_double_date_Picker_Manual_Date();

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Independent_Company()
			throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getIC().equals("")) {

			System.out.println("IC Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.sendKeys(dataProviders.ConfigFileReader.getIC());
			System.out.println(
					"Cluster Element - IC Value for Advance Search : " + dataProviders.ConfigFileReader.getIC());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Strategic_Bussiness_Group()
			throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getSBG().equals("")) {

			System.out.println("BU Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.sendKeys(dataProviders.ConfigFileReader.getSBG());
			System.out.println(
					"Cluster Element - SBG Value for Advance Search : " + dataProviders.ConfigFileReader.getSBG());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Bussiness_Unit()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getBU().equals("")) {

			System.out.println("BU Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.sendKeys(dataProviders.ConfigFileReader.getBU());
			System.out.println(
					"Cluster Element - BU Value for Advance Search : " + dataProviders.ConfigFileReader.getBU());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Segment() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getSegment().equals("")) {

			System.out.println("Segment Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.sendKeys(dataProviders.ConfigFileReader.getSegment());
			System.out.println("Cluster Element - Segment Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getSegment());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Cluster_Office()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getClusterOffice().equals("")) {

			System.out.println("Cluster Office Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.sendKeys(dataProviders.ConfigFileReader.getClusterOffice());
			System.out.println("Cluster Element - Cluster Office Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getClusterOffice());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Region() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getRegion().equals("")) {

			System.out.println("Cluster Region Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.sendKeys(dataProviders.ConfigFileReader.getRegion());
			System.out.println("Cluster Element - Cluster Region Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getRegion());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Location() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getLocation().equals("")) {

			System.out.println("Cluster Location Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.sendKeys(dataProviders.ConfigFileReader.getLocation());
			System.out.println("Cluster Element - Cluster Location Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getLocation());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Zone() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getZone().equals("")) {

			System.out.println("Cluster Zone Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.sendKeys(dataProviders.ConfigFileReader.getZone());
			System.out.println("Cluster Element - Cluster Zone Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getZone());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Area() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getArea().equals("")) {

			System.out.println("Cluster Area Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.sendKeys(dataProviders.ConfigFileReader.getArea());
			System.out.println("Cluster Element - Cluster Area Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getArea());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}

	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Combined() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements.click();

		if (dataProviders.ConfigFileReader.getIC().equals("")) {

			System.out.println("IC Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_independentCompany
					.sendKeys(dataProviders.ConfigFileReader.getIC());
			System.out.println(
					"Cluster Element - IC Value for Advance Search : " + dataProviders.ConfigFileReader.getIC());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getSBG().equals("")) {

			System.out.println("BU Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_SBG
					.sendKeys(dataProviders.ConfigFileReader.getSBG());
			System.out.println(
					"Cluster Element - SBG Value for Advance Search : " + dataProviders.ConfigFileReader.getSBG());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getBU().equals("")) {

			System.out.println("BU Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_BU
					.sendKeys(dataProviders.ConfigFileReader.getBU());
			System.out.println(
					"Cluster Element - BU Value for Advance Search : " + dataProviders.ConfigFileReader.getBU());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getSegment().equals("")) {

			System.out.println("Segment Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Segment
					.sendKeys(dataProviders.ConfigFileReader.getSegment());
			System.out.println("Cluster Element - Segment Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getSegment());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getClusterOffice().equals("")) {

			System.out.println("Cluster Office Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice
					.sendKeys(dataProviders.ConfigFileReader.getClusterOffice());
			System.out.println("Cluster Element - Cluster Office Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getClusterOffice());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getRegion().equals("")) {

			System.out.println("Cluster Region Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Region
					.sendKeys(dataProviders.ConfigFileReader.getRegion());
			System.out.println("Cluster Element - Cluster Region Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getRegion());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getLocation().equals("")) {

			System.out.println("Cluster Location Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Location
					.sendKeys(dataProviders.ConfigFileReader.getLocation());
			System.out.println("Cluster Element - Cluster Location Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getLocation());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getZone().equals("")) {

			System.out.println("Cluster Zone Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Zone
					.sendKeys(dataProviders.ConfigFileReader.getZone());
			System.out.println("Cluster Element - Cluster Zone Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getZone());
			System.out.println("----------------------------------------------------------");
		}

		if (dataProviders.ConfigFileReader.getArea().equals("")) {

			System.out.println("Cluster Area Details Not Specified");
			System.out.println("-------------------------");
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Area
					.sendKeys(dataProviders.ConfigFileReader.getArea());
			System.out.println("Cluster Element - Cluster Area Value for Advance Search : "
					+ dataProviders.ConfigFileReader.getArea());
			System.out.println("----------------------------------------------------------");
		}
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_clusterElements_Post.click();

		// Search With selected Multiple Jobs

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();
		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();
		System.out.println("Search Result Count : " + Search_Result_Count);
		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Order_Number = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println("Order Number from Front End After Searching By Job : " + Order_Number);
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : User Can be able to search by Job Code");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Close.click();

	}
	
	
	public static void search_Invoices_by_Document_Purchase_Order_for_PO_Advance_Create() throws Throwable {

		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_clearAdvanceSearch.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search);
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear);
		// object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Clear.click();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document));
		Thread.sleep(5000);
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.clear();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document.click();
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document
				.sendKeys("Purchase Orde");
		List<WebElement> DropdownResult = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_AllOptions;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Purchase Order")) {
				webElement.click();
				System.out.println("Search Document By : Purchase Order (PO - Advance)");
				System.out.println("====================================");
				break;
			}
		}
		
			DataBaseConnection.GetPurchase_Order_Number_for_PO_Create();


		Purchase_Order_Number_from_DB = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input
				.getAttribute("value");
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Button.click();

		Search_Result_Count = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result
				.size();

		System.out.println("Search Result Count : " + Search_Result_Count);

		if (Search_Result_Count == 0) {
			System.out.println("Fail : No Records Found");
			System.out.println("-----------------------------------------------------------------------");
			// fail();
		} else if (Search_Result_Count == 1) {
			Purchase_Order_Number_from_FrontEnd = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result
					.getText();
			System.out.println(
					"Purchase Order Number from Front End After Search: " + Purchase_Order_Number_from_FrontEnd);

			if (Purchase_Order_Number_from_FrontEnd.equals(Purchase_Order_Number_from_DB)) {
				System.out.println("DB & Front End - Values are matched");
				System.out.println("Search Completed : User Can be able to search by Purchase Order Number");
				System.out.println("-----------------------------------------------------------------------");
			} else {
				System.out.println("Error DB & Front End - Values are Not matched");
			}

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Purchase Orders Found");
			List<WebElement> listElement = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement.size(); i++) {
				System.out.println("Purchase Order Number " + i + " : " + listElement.get(i).getText());
			}
		}
		Screenshot.Screenshotforscenario();
	}

}
