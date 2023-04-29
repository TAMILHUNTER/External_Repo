package stepdefinition;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import dataProviders.Tamil.ConfigFileReader_Tamil;
import stepdefinition.Webdriver;

public class kendo_Calender_Random {
	public static int CurrentYear;
	public static String select_Random_List_Year_From;
	public static String select_Random_List_Month_From;
	public static String select_Random_List_Date_From;
	public static String select_Random_List_Year_To;
	public static String select_Random_List_Month_To;
	public static String select_Random_List_Date_To;
	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Read Configuration

	public static ConfigFileReader ConfigFileReader;
	public static ConfigFileReader_Tamil ConfigFileReader_Tamil;

	// Page Factory
	public kendo_Calender_Random() {
		PageFactory.initElements(Webdriver.driver, object_repository.Tamil.ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	public static void kendo_Calender_double_date_Picker_random() throws Throwable {

		if (dataProviders.ConfigFileReader.getadvance_search_Date_selection().equals("Random")) {
			System.out.println("Selecting Random Date for Advanced Search");
			System.out.println("------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date.click();
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Month_Header));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Month_Header.click();
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();

			// Selecting From Date for Search

			// Select From Year
			List<WebElement> List_Year_From = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements;
			Random Random_List_Year_From = new Random();
			int Random_List_Year_From_size = Random_List_Year_From.nextInt(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements
							.size());
			select_Random_List_Year_From = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements
					.get(Random_List_Year_From_size).getText();
			for (WebElement webElement1 : List_Year_From) {
				if (webElement1.getText().equals(select_Random_List_Year_From)) {
					webElement1.click();
					System.out.println("Selected From Year for Advance Search : " + select_Random_List_Year_From);
					break;
				}
			}

			// Select From Month

			List<WebElement> List_Month_From = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements;
			Random Random_List_Month_From = new Random();
			int Random_List_Month_From_size = Random_List_Month_From.nextInt(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
							.size());
			select_Random_List_Month_From = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
					.get(Random_List_Month_From_size).getText();
			for (WebElement webElement2 : List_Month_From) {
				if (webElement2.getText().equals(select_Random_List_Month_From)) {
					webElement2.click();
					System.out.println("Selected From Month for Advance Search : " + select_Random_List_Month_From);
					break;
				}
			}

			// Select From Date

			List<WebElement> List_Date_From = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements;
			Random Random_List_Date_From = new Random();
			int Random_List_Date_From_size = Random_List_Date_From.nextInt(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
							.size());
			select_Random_List_Date_From = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
					.get(Random_List_Date_From_size).getText();
			for (WebElement webElement3 : List_Date_From) {
				if (webElement3.getText().equals(select_Random_List_Month_From)) {
					webElement3.click();
					System.out.println("Selected From Date for Advance Search : " + select_Random_List_Date_From);
					break;
				}
			}

			// Selecting To Date for Search

			if (dataProviders.ConfigFileReader.getadvance_search_Random_To_Date_selection().equals("Random")) {
				// Select To Year
				List<WebElement> List_Year_To = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements;
				Random Random_List_Year_To = new Random();
				int Random_List_Year_To_size = Random_List_Year_To.nextInt(
						object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements
								.size());
				select_Random_List_Year_To = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements
						.get(Random_List_Year_To_size).getText();
				for (WebElement webElement4 : List_Year_To) {
					if (webElement4.getText().equals(select_Random_List_Year_From)) {
						webElement4.click();
						System.out.println("Selected To Year for Advance Search : " + select_Random_List_Year_To);
						break;
					}
				}

				// Select To Month

				List<WebElement> List_Month_To = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements;
				Random Random_List_Month_To = new Random();
				int Random_List_Month_To_size = Random_List_Month_To.nextInt(
						object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
								.size());
				select_Random_List_Month_To = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
						.get(Random_List_Month_To_size).getText();
				for (WebElement webElement5 : List_Month_To) {
					if (webElement5.getText().equals(select_Random_List_Month_From)) {
						webElement5.click();
						System.out.println("Selected To Month for Advance Search : " + select_Random_List_Month_To);
						break;
					}
				}

				// Select To Date
				Thread.sleep(5000);
				List<WebElement> List_Date_To = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements;
				Random Random_List_Date_To = new Random();
				int Random_List_Date_To_size = Random_List_Date_To.nextInt(
						object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
								.size());
				select_Random_List_Date_To = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements
						.get(Random_List_Date_To_size).getText();
				for (WebElement webElement6 : List_Date_To) {
					if (webElement6.getText().equals(select_Random_List_Month_From)) {
						webElement6.click();
						System.out.println("Selected To Date for Advance Search : " + select_Random_List_Date_To);
						break;
					}
				}
			}

			else if (dataProviders.ConfigFileReader.getadvance_search_Random_To_Date_selection().equals("Today")) {
				System.out.println("Selecting Current Date As To date for Search");
				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(
						object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY));
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY
						.click();
			}

			else {
				System.out.println("To Date Not Specified");
				System.out.println("Selecting Current Date As To date for Search");
				wait.until(ExpectedConditions.elementToBeClickable(
						object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY));
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY
						.click();
			}
		} else if (dataProviders.ConfigFileReader.getadvance_search_Date_selection().equals("Manual")) {
			System.out.println("Selecting Manual Date Entered for Advanced Search");
			System.out.println("------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field.clear();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field.click();
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field
					.sendKeys(dataProviders.ConfigFileReader.getadvance_search_Date_From() + " - "
							+ dataProviders.ConfigFileReader.getadvance_search_Date_To());

		}

		else if (dataProviders.ConfigFileReader.getadvance_search_Date_selection().equals("Today")) {
			System.out.println("Selcting Today's Date For advanced Search");
			System.out.println("------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY.click();
			System.out.println("Current Date selected as From Date for Advanced Search");
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY.click();
			System.out.println("Current Date selected as To Date for Advanced Search");

		} else {
			System.out.println("Date Selection Not Specified");
			System.out.println("Selcting Today's Date For advanced Search");
			System.out.println("------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date.click();
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY.click();
			System.out.println("Current Date selected as From Date for Advanced Search");
			wait.until(ExpectedConditions.elementToBeClickable(
					object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY));
			object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_tODAY.click();
			System.out.println("Current Date selected as To Date for Advanced Search");
		}

		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field.click();

	}

	public static void kendo_Calender_double_date_Picker_Manual_Date() throws Throwable {

		System.out.println("Selecting Manual Date Entered for Advanced Search");
		System.out.println("------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Field));
		
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Month_Header));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Month_Header.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header));
		object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_Date_Year_Header.click();

		Thread.sleep(3000);
		// Selecting From Date for Search

		// Select From Year
		List<WebElement> DropdownResult_Year = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;				
		for (WebElement webElement1 : DropdownResult_Year) {
			if (webElement1.getText().equals(dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Year())) {
				webElement1.click();
				System.out.println("Selected From Year for Advance Search : " + dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Year());
				break;
			}
		}
		Thread.sleep(3000);
		List<WebElement> DropdownResult_Year2 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;				
		for (WebElement webElement2 : DropdownResult_Year2) {
			if (webElement2.getText().equals(dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Month())) {
				webElement2.click();
				System.out.println("Selected From Month for Advance Search : " + dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Month());
				break;
			}
		}
		Thread.sleep(3000);
		List<WebElement> DropdownResult_Year3 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;				
		for (WebElement webElement3 : DropdownResult_Year3) {
			if (webElement3.getText().equals(dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Date())) {
				webElement3.click();
				System.out.println("Selected From Date for Advance Search : " + dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Date());
				break;
			}
		}
		Thread.sleep(3000);
//		List<WebElement> DropdownResult_Year4 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;				
//		for (WebElement webElement4 : DropdownResult_Year4) {
//			if (webElement4.getText().equals(dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Year_To())) {
//				webElement4.click();
//				System.out.println("Selected To Year for Advance Search : " + dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Year());
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		List<WebElement> DropdownResult_Year5 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;				
//		for (WebElement webElement5 : DropdownResult_Year5) {
//			if (webElement5.getText().equals(dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Month_To())) {
//				webElement5.click();
//				System.out.println("Selected To Year for Advance Search : " + dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Year());
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		List<WebElement> DropdownResult_Year6 = object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;				
//		for (WebElement webElement6 : DropdownResult_Year6) {
//			if (webElement6.getText().equals(dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Date_To())) {
//				webElement6.click();
//				System.out.println("Selected To Year for Advance Search : " + dataProviders.ConfigFileReader.getAdvance_Search_List_Details_Past_Date_Selection_Year());
//				break;
//			}
//		}
//		Thread.sleep(3000);
	}

}
