package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Webdriver;

public class Login_And_Navigation {

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Login_And_Navigation() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login as EIP User$")
	public static void Login_as_EIP_User() throws Throwable {

		stepdefinition.Login.EIP_User_Login();
	}
	
	@Given("^Login as Partner$")
	public static void Login_as_Partner() throws Throwable {

		stepdefinition.Login.Partner_login();
	}
	
	@Given("^Login as Employee$")
	public static void Login_as_Employee() throws Throwable {

		stepdefinition.Login.Employee_login();
	}

	@Then("^Navigate to Invoice Registration$")
	public static void Navigate_to_Invoice_Registration() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Home_accessBasedMenu));
		object_repository.Tamil.ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Menu_finance));
		object_repository.Tamil.ObjectsReporsitory.Menu_finance.click();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Menu_Accounts_Payable));
		object_repository.Tamil.ObjectsReporsitory.Menu_Accounts_Payable.click();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Menu_Invoice_Registration));
		object_repository.Tamil.ObjectsReporsitory.Menu_Invoice_Registration.click();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Invoice_Registration_For_Action_Refresh));
		System.out.println("Navigated to Invoice Registration Page");
		Screenshot.Screenshotforscenario();
	}

}
