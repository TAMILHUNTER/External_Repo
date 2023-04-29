package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Webdriver;

public class Filter {

	// Read Configuration

	public static ConfigFileReader configFileReader;
	public static String select_Random_Past_Date;
	public static int Search_Result_Count;
	public static String select_Random_Per_Page;
	public static String Order_Number;

	// Page Factory
	public Filter() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_No() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Order_No());
		Thread.sleep(3000);

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_No_Filter_Clear.click();
	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Type() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Order_Type());
		Thread.sleep(3000);
		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type_Filter_Clear));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Type_Filter_Clear.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Date() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
//		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
//				ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter);

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Date));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Date.click();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();

		Thread.sleep(3000);
		// Selecting From Date for Search

		// Select From Year
		List<WebElement> DropdownResult_Year = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement1 : DropdownResult_Year) {
			if (webElement1.getText()
					.equals(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Year())) {
				webElement1.click();
				System.out.println("Selected Year for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Year());
				break;
			}
		}
		Thread.sleep(3000);

		// Select From Month
		List<WebElement> DropdownResult_Month = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement2 : DropdownResult_Month) {
			if (webElement2.getText()
					.equals(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Month())) {
				webElement2.click();
				System.out.println("Selected Month for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Month());
				break;
			}
		}
		Thread.sleep(3000);

		// Select From Date
		List<WebElement> DropdownResult_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement3 : DropdownResult_Date) {
			if (webElement3.getText()
					.equals(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Date())) {
				webElement3.click();
				System.out.println("Selected Date for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Date());
				break;
			}
		}
		Thread.sleep(3000);

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Date_Filter_Clear));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Date_Filter_Clear.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh.click();
	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Type() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
//		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
//				ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter);
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Type());
		Thread.sleep(3000);
		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Type_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Currency() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Currency());
		Thread.sleep(3000);
		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Amount() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Amount)
				.perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Amount));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Amount.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Order_Amount
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Order_Amount());
		Thread.sleep(3000);
		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Amount() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Amount());
		Thread.sleep(3000);
		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_MRN_or_Bill_Count()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100
				.moveToElement(
						ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count.sendKeys(
				ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Invoice_Regn_Count()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action100 = new Actions(Webdriver.driver);
		action100
				.moveToElement(
						ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count.sendKeys(
				ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_number() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100
				.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_Date() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100
				.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_calender));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_calender.click();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();

		Thread.sleep(3000);
		// Selecting From Date for Search

		// Select From Year
		List<WebElement> DropdownResult_Year = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement1 : DropdownResult_Year) {
			if (webElement1.getText().equals(
					ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year())) {
				webElement1.click();
				System.out.println("Selected Year for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year());
				break;
			}
		}
		Thread.sleep(3000);

		// Select From Month
		List<WebElement> DropdownResult_Month = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement2 : DropdownResult_Month) {
			if (webElement2.getText().equals(
					ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month())) {
				webElement2.click();
				System.out.println("Selected Month for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month());
				break;
			}
		}
		Thread.sleep(3000);

		// Select From Date
		List<WebElement> DropdownResult_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement3 : DropdownResult_Date) {
			if (webElement3.getText().equals(
					ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date())) {
				webElement3.click();
				System.out.println("Selected Date for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date());
				break;
			}
		}
		Thread.sleep(3000);

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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
		Actions action102 = new Actions(Webdriver.driver);
		action102
				.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount)
				.perform();
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Filter_Clear));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Filter_Clear.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_Amount() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100
				.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Transaction_Ref_No()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100
				.moveToElement(
						ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No.sendKeys(
				ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_NEFT_Unique_Ref_No() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Transaction_Date()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Calender));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Calender.click();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();

		Thread.sleep(3000);
		// Selecting From Date for Search

		// Select From Year
		List<WebElement> DropdownResult_Year = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement1 : DropdownResult_Year) {
			if (webElement1.getText().equals(
					ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year())) {
				webElement1.click();
				System.out.println("Selected Year for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year());
				break;
			}
		}
		Thread.sleep(3000);

		// Select From Month
		List<WebElement> DropdownResult_Month = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement2 : DropdownResult_Month) {
			if (webElement2.getText().equals(
					ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month())) {
				webElement2.click();
				System.out.println("Selected Month for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month());
				break;
			}
		}
		Thread.sleep(3000);

		// Select From Date
		List<WebElement> DropdownResult_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;
		for (WebElement webElement3 : DropdownResult_Date) {
			if (webElement3.getText().equals(ConfigFileReader
					.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date())) {
				webElement3.click();
				System.out.println("Selected Date for Filter : " + dataProviders.ConfigFileReader
						.getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date());
				break;
			}
		}
		Thread.sleep(3000);

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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();

		Actions action106 = new Actions(Webdriver.driver);
		action106.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode)
				.perform();
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Filter_Clear));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Filter_Clear.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Mode() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode)
				.perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Payment_Mode
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Payment_Mode());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_NEFT_Amount() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_NEFT_Amount());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Claim() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Claim).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Claim));

		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Claim.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Claim.clear();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Claim.click();
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Claim
				.sendKeys(ConfigFileReader.getInvoice_Registration_Advance_Search_Filter_by_Claim());
		Thread.sleep(3000);
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
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed : ");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();
//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear.click();

	}

}
