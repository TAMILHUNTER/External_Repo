package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration;

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
import object_repository.Tamil.ObjectsReporsitory;

public class List {

	// Read Configuration

	public static ConfigFileReader configFileReader;
	public static String select_Random_Past_Date;
	public static int Search_Result_Count;
	public static String select_Random_Per_Page;
	public static String Order_Number;

	// Page Factory
	public List() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void search_Invoices_by_Manual_Date() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date);
		if (ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection().equals("Random")) {

			java.util.List<WebElement> DropdownResult_Past_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_All_Elements;
			Random Random_Past_Date = new Random();
			int Random_job_size = Random_Past_Date.nextInt(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_All_Elements
							.size());
			select_Random_Past_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_All_Elements
					.get(Random_job_size).getText();
			for (WebElement webElement : DropdownResult_Past_Date) {
				if (webElement.getText().equals(select_Random_Past_Date)) {
					webElement.click();
					System.out
							.println("Search Result Details list for the Past : " + select_Random_Past_Date + " Days");
					break;
				}
			}

			Screenshot.Screenshotforscenario();

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
				System.out.println("Search Completed :");
				System.out.println("-----------------------------------------------------------------------");

			} else if (Search_Result_Count > 1) {
				System.out.println("Multiple Results Found");
				java.util.List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
				for (int i = 0; i < listElement_Search_Results.size(); i++) {
					System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
				}
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("Search Completed :");
				System.out.println("-----------------------------------------------------------------------");
			}
			Screenshot.Screenshotforscenario();

		} else if (ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection().equals("Manual")) {

			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_Input
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_Input
					.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_Input
					.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_Input
					.sendKeys(ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Manual());
			Thread.sleep(3000);
			Screenshot.Screenshotforscenario();
			Actions actions1222 = new Actions(Webdriver.driver);
			actions1222.sendKeys(Keys.ENTER);
			actions1222.build().perform();
			System.out.println("Search Result Details list for the Past : "
					+ ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Manual() + " Days");
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
				System.out.println("Search Completed :");
				System.out.println("-----------------------------------------------------------------------");

			} else if (Search_Result_Count > 1) {
				System.out.println("Multiple Results Found");
				java.util.List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
				for (int i = 0; i < listElement_Search_Results.size(); i++) {
					System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
				}
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("Search Completed :");
				System.out.println("-----------------------------------------------------------------------");
			}
			Screenshot.Screenshotforscenario();

		} else {

			System.out.println("List of records for the past Days Not Specified");
			System.out.println("-----------------------------------------------");
			System.out.println("Slecting Random Days");
			System.out.println("-----------------------------------------------");
			java.util.List<WebElement> DropdownResult_Past_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Deatils_Past_date_All_Elements;
			Random Random_Past_Date = new Random();
			int Random_job_size = Random_Past_Date.nextInt(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
							.size());
			select_Random_Past_Date = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_job_All_options
					.get(Random_job_size).getText();
			for (WebElement webElement : DropdownResult_Past_Date) {
				if (webElement.getText().equals(select_Random_Past_Date)) {
					webElement.click();
					System.out
							.println("Search Result Details list for the Past : " + select_Random_Past_Date + " Days");
					break;
				}
			}

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
				System.out.println("Search Completed :");
				System.out.println("-----------------------------------------------------------------------");

			} else if (Search_Result_Count > 1) {
				System.out.println("Multiple Results Found");
				java.util.List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
				for (int i = 0; i < listElement_Search_Results.size(); i++) {
					System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
				}
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("Search Completed :");
				System.out.println("-----------------------------------------------------------------------");
			}
			Screenshot.Screenshotforscenario();
		}

	}

	public static void Verify_User_can_be_able_to_Change_List_of_Records_displayed_per_page() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Per_Page));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Per_Page);

		java.util.List<WebElement> DropdownResult_Per_Page = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Per_Page_All_Elements;
		Random Random_Per_Page = new Random();
		int Random_Per_Page_size = Random_Per_Page.nextInt(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Per_Page_All_Elements
						.size());
		select_Random_Per_Page = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_Per_Page_All_Elements
				.get(Random_Per_Page_size).getText();
		for (WebElement webElement : DropdownResult_Per_Page) {
			if (webElement.getText().equals(select_Random_Per_Page)) {
				webElement.click();
				System.out.println("Search Result Details list Per Page : " + select_Random_Per_Page + " Records");
				break;
			}
		}

		Screenshot.Screenshotforscenario();

		System.out.println("Search Result Details list for the Past : "
				+ ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Manual() + " Days");
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
			System.out.println("Search Completed :");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			java.util.List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed :");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();

	}

	public static void Verify_User_can_be_able_to_Refresh_List_Records() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_Records_refresh);

		System.out.println("Search Result Details list for the Past : "
				+ ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Manual() + " Days");
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
			System.out.println("Search Completed :");
			System.out.println("-----------------------------------------------------------------------");

		} else if (Search_Result_Count > 1) {
			System.out.println("Multiple Results Found");
			java.util.List<WebElement> listElement_Search_Results = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_multiple_Result;
			for (int i = 0; i < listElement_Search_Results.size(); i++) {
				System.out.println("Order Number " + i + " : " + listElement_Search_Results.get(i).getText());
			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Search Completed :");
			System.out.println("-----------------------------------------------------------------------");
		}
		Screenshot.Screenshotforscenario();

	}

}
