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
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Webdriver;

public class Settings {

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
	public static String Selected_List_Drag_Random;

	// Page Factory
	public Settings() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void Verify_User_can_be_able_to_Freeze_Order_No_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_OrderNo).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_OrderNo));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_OrderNo.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();

		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Thread.sleep(3000);

		Screenshot.Screenshotforscenario();

		System.out.println("Order No Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Order_Date_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_OrderDate).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_OrderDate));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_OrderDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order Date Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Type_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Type).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Type));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Type.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Type Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Currency_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Currency).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Currency));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Currency.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Currency Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Order_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Order_Amount).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Order_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Order_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order Amount Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Tolarance_Amount)
				.perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Tolarance_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Tolarance_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order Amount Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Tolarance_MRN_or_Bill_Count_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_MRN_or_Bill_Count)
				.perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_MRN_or_Bill_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_MRN_or_Bill_Count.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("MRN_or_Bill_Count Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Invoice_Regn_Count_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Invoice_Regn_Count)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Invoice_Regn_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Invoice_Regn_Count.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Invoice_Regn_Count Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_number_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_number).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_number));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_number.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println(" Cheque Number Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_Date_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_Date).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_Date.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Cheque Date Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_Amount).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Cheque_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Cheque Date Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Payment_Transaction_Ref_No_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200
				.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Ref_No)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Ref_No.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Payment Transaction Reference Number Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_NEFT_Unique_Ref_No_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_NEFT_Unique_Ref_No)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_NEFT_Unique_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_NEFT_Unique_Ref_No.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("NEFT_Unique_Ref_No Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Payment_Transaction_Date_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Date)
				.perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Date.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Payment_Transaction_Date Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Payment_Mode_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Mode).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Mode));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Payment_Mode.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Payment Mode Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_NEFT_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_NEFT_Amount).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_NEFT_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_NEFT_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("NEFT_Amount Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Freeze_Claim_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Claim).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Claim));
		ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Claim.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Claim Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

//Unfreeze

	public static void Verify_User_can_be_able_to_Un_Freeze_Order_No_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_OrderNo));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_OrderNo.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order No Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

//Unfreeze

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Order_Date_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_OrderDate));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_OrderDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order Date Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Type_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Type));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Type.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Type Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Currency_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Currency));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Currency.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Currency Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Order_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Order_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Order_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order Amount Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Tolarance_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Tolarance_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Order Amount Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_MRN_or_Bill_Count_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_MRN_or_Bill_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_MRN_or_Bill_Count.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("MRN_or_Bill_Count Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Invoice_Regn_Count_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Invoice_Regn_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Invoice_Regn_Count.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Invoice_Regn_Count Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_number_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Cheque_number));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Cheque_number.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println(" Cheque Number Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_Date_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Cheque_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Cheque_Date.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Cheque Date Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_Amount_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Cheque_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Cheque_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Cheque Date Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Payment_Transaction_Ref_No_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Payment_Transaction_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Payment_Transaction_Ref_No.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Payment Transaction Reference Number Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_NEFT_Unique_Ref_No_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_NEFT_Unique_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_NEFT_Unique_Ref_No.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("NEFT_Unique_Ref_No Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Payment_Transaction_Date_Column_in_the_List()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Payment_Transaction_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Payment_Transaction_Date.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Payment_Transaction_Date Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Payment_Mode_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Payment_Mode));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Payment_Mode.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Payment Mode Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_NEFT_Amount_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_NEFT_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_NEFT_Amount.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("NEFT_Amount Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Claim_Column_in_the_List() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Claim));
		ObjectsReporsitory.Invoice_Registration_Settings_column_UnFreeze_Claim.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Claim Column unFreezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

//Enable or Disbale View Column

	public static void Verify_User_can_be_able_to_Disable_Order_No_Column_View__in_the_Document_List_View()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderNo));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderNo.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Order_No_Column_View__in_the_Document_List_View()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderNo));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderNo.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Order_Date_Column_View__in_the_Document_List_View()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderDate));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Order_Date_Column_View__in_the_Document_List_View()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderDate));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_OrderDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Type_Column_View__in_the_Document_List_View()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Type));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Type.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Type_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Type));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Type.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Currency_Column_View__in_the_Document_List_View()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Currency));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Currency.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Currency_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Currency));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Currency.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Disable_Order_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Order_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Order_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Enable_Order_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Order_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Order_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Tolarance_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Tolarance_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Tolarance_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Tolarance_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Tolarance_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Tolarance_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Tolarance_MRN_or_Bill_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_MRN_or_Bill_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_MRN_or_Bill_Count.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Tolarance_MRN_or_Bill_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_MRN_or_Bill_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_MRN_or_Bill_Count.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Tolarance_Invoice_Regn_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Invoice_Regn_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Invoice_Regn_Count.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Tolarance_Invoice_Regn_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Invoice_Regn_Count));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Invoice_Regn_Count.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Tolarance_Cheque_number_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_number));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_number.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Tolarance_Cheque_number_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_number));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_number.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Tolarance_Cheque_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Date.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Tolarance_Cheque_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Date.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Tolarance_Cheque_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Enable_Tolarance_Cheque_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Cheque_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Payment_Transaction_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Ref_No.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Payment_Transaction_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Ref_No.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_NEFT_Unique_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Unique_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Unique_Ref_No.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_NEFT_Unique_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Unique_Ref_No));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Unique_Ref_No.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Disable_Payment_Transaction_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Date.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Payment_Transaction_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions.elementToBeClickable(
				ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Date));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Transaction_Date.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Payment_Mode_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Mode));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Mode.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_Payment_Mode_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Mode));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Payment_Mode.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_NEFT_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Enable_NEFT_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Amount));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_NEFT_Amount.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Claim_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Claim));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Claim.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Enable_Claim_Column_View__in_the_Document_List_View()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		// Change
		// *****************************************************************************************************
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Disable_Claim));
		ObjectsReporsitory.Invoice_Registration_Settings_Disable_Claim.click();
		// Change
		// *****************************************************************************************************

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Freeze_Column_in_the_List_Random() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Last).perform();

		List<WebElement> List_Freeze = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_AllEmenets;
		Random List_Freeze_Random = new Random();
		int List_Freeze_Random_Size = List_Freeze_Random.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_AllEmenets
						.size());
		Selected_List_Freeze_Random = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_AllEmenets
				.get(List_Freeze_Random_Size).getText();
		for (WebElement webElement3 : List_Freeze) {
			if (webElement3.getText().equals(Selected_List_Freeze_Random)) {
				webElement3.click();
				System.out.println("Selected Column to Freeze : " + Selected_List_Freeze_Random);
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();

		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Thread.sleep(3000);

		Screenshot.Screenshotforscenario();

		System.out.println("Column Freezed");
		System.out.println("-------------------------");

		// Search With selected Multiple Jobs

		Settings.Display_Search_Result();

	}

	public static void Verify_User_can_be_able_to_Un_Freeze_Column_in_the_List_Random() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_columnFreeze_Last).perform();

		List<WebElement> List_UnFreeze = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_columnUnFreeze_AllEmenets;
		Random List_UnFreeze_Random = new Random();
		int List_UnFreeze_Random_Size = List_UnFreeze_Random.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_columnUnFreeze_AllEmenets
						.size());
		Selected_List_UnFreeze_Random = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_columnUnFreeze_AllEmenets
				.get(List_UnFreeze_Random_Size).getText();
		for (WebElement webElement3 : List_UnFreeze) {
			if (webElement3.getText().equals(Selected_List_UnFreeze_Random)) {
				webElement3.click();
				System.out.println("Selected Column to UnFreeze : " + Selected_List_UnFreeze_Random);
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();

		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Thread.sleep(3000);

		Screenshot.Screenshotforscenario();

		System.out.println("Column Freezed");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();
	}

	public static void Verify_User_can_be_able_to_Disable_Column_View_in_the_Document_List_View_Random()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_Last).perform();

		List<WebElement> List_View = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_AllElements;
		Random List_View_Random = new Random();
		int List_View_Random_Size = List_View_Random.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_AllElements.size());
		Selected_List_View_Random = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_AllElements
				.get(List_View_Random_Size).getText();
		for (WebElement webElement3 : List_View) {
			if (webElement3.getText().equals(Selected_List_View_Random)) {
				webElement3.click();
				System.out.println("Selected Column to Disable View : " + Selected_List_View_Random);
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Disbaled");
		System.out.println("-------------------------");

	}

	public static void Verify_User_can_be_able_to_Enable_Column_View_in_the_Document_List_View_Random()
			throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();

		Actions action200 = new Actions(Webdriver.driver);
		action200.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_Last).perform();

		List<WebElement> List_View = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_AllElements;
		Random List_View_Random = new Random();
		int List_View_Random_Size = List_View_Random.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_AllElements.size());
		Selected_List_View_Random2 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_ColumnView_AllElements
				.get(List_View_Random_Size).getText();
		for (WebElement webElement3 : List_View) {
			if (webElement3.getText().equals(Selected_List_View_Random2)) {
				webElement3.click();
				System.out.println("Selected Column to Enable View : " + Selected_List_View_Random2);
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();

		Thread.sleep(3000);

//		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
//		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
//		Thread.sleep(3000);
//		Actions action301 = new Actions(Webdriver.driver);
//		action301.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();

		Screenshot.Screenshotforscenario();

		System.out.println("Column View - Enabled");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}

	public static void Display_Search_Result() throws Throwable {

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
	}

	public static void Verify_User_can_be_able_to_Expand_column_view() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Expand));
		ObjectsReporsitory.Invoice_Registration_Expand.click();
		Thread.sleep(3000);

		System.out.println("Column View - Expanded");
		System.out.println("-------------------------");

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
	}

	public static void Verify_User_can_be_able_to_Minimize_column_view() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Expand));
		ObjectsReporsitory.Invoice_Registration_Expand.click();
		Thread.sleep(3000);

		System.out.println("Column View - Minimized");
		System.out.println("-------------------------");

		Settings.Display_Search_Result();

	}
	
	public static void Verify_User_can_be_able_to_Change_Column_Position() throws Throwable {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings));
		ObjectsReporsitory.Invoice_Registration_Settings.click();
		Thread.sleep(3000);

		Actions action100 = new Actions(Webdriver.driver);
		action100.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter).perform();
	
		Actions action201 = new Actions(Webdriver.driver);
		action201.clickAndHold(ObjectsReporsitory.Invoice_Registration_Settings_Drag_first).perform();
		Thread.sleep(3000);
		action201.moveToElement(ObjectsReporsitory.Invoice_Registration_Settings_Drag_3).perform();
		Thread.sleep(3000);
		action201.release(ObjectsReporsitory.Invoice_Registration_Settings_Drag_3).perform(); 

//		Actions builder = new Actions(Webdriver.driver);
//		builder.dragAndDrop(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_Drag_first, object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_Drag_last).build().perform();

//		Actions action206 = new Actions(Webdriver.driver);
//		action206.dragAndDrop(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_Drag_first, object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Settings_Drag_last).build().perform();

		System.out.println("Column Position Changed");
		System.out.println("-----------------------------------------------");
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Settings_Submit));
		ObjectsReporsitory.Invoice_Registration_Settings_Submit.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Filter.click();
		Thread.sleep(3000);
		Actions action101 = new Actions(Webdriver.driver);
		action101.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Filter_Last).perform();
		Screenshot.Screenshotforscenario();

		System.out.println("Column Position Changes Refelected in UI");
		System.out.println("-----------------------------------------------");
		
	}
}
