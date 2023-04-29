package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Webdriver;

public class Invoice_Registration_For_Action_Create {

	public static int popup_validation;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Invoice_Registration_For_Action_Create() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify User can be able to Create Invoice Registration against PO Number$")
	public static void Verify_User_can_be_able_to_Create_Invoice_Registration_against_PO_Number() throws Throwable {

		Actions action1342 = new Actions(Webdriver.driver);
		action1342.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result).perform();
		Thread.sleep(3000);

		Actions action1347 = new Actions(Webdriver.driver);
		action1347.moveToElement(ObjectsReporsitory.Invoice_Registration_create).perform();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_create));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Invoice_Registration_create);

		popup_validation = object_repository.Tamil.ObjectsReporsitory.popup_head3.size();

		System.out.println("Checking Popup Count : " + popup_validation);
		if (popup_validation == 1) {

			System.out.println("Popup Status : " + object_repository.Tamil.ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + object_repository.Tamil.ObjectsReporsitory.popup_text.getText());
			System.out.println("-----------------------------------------------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Ok2));
			((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.Popup_Ok2);
			System.out.println(
					"claim not applicable for this order : Kindly choose another Purchase order to create Invoice");
			System.out.println("-----------------------------------------------------------------------------------");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_Close));
			((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();",
					ObjectsReporsitory.InvoiceRegistration_Close);

		} else {
			System.out.println("User Can be able to Register Invoice Against the selected PO");
			System.out.println("-----------------------------------------------------------------------------------");
		}

	}

	@Then("^Verify User can be able to View Details of PO Number$")
	public static void Verify_User_can_be_able_to_View_Details_of_PO_Number() throws Throwable {

		Actions action1342 = new Actions(Webdriver.driver);
		action1342.moveToElement(ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result2).perform();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result2));
		ObjectsReporsitory.Invoice_Registration_Advance_Search_Single_Result2.click();
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_Chat));
		
		System.out.println("Navigated to PO Details View");
		System.out.println("------------------------------");
		

	}
}
