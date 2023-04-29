package stepdefinition.FAS_Payment_Hold_Release;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Praveen.object_repository;
import stepdefinition.Login;
import stepdefinition.Webdriver;
public class Payment_Hold_Release_Login {
	
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10000); 
	
	public static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	
	static boolean status;

	//======PK====//
	public Payment_Hold_Release_Login() {

		PageFactory.initElements(Webdriver.driver, object_repository.class);
	}
	
		@Given("^user should be able to login Creator login username$")
		public static void user_should_be_able_to_login_Creator_login_username() throws Throwable {

			if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
				System.out.println("FAS Automation Landing Page");
				System.out.println("****************************");
				Login.Landing();
			} else {
				Webdriver.driver.get(ConfigFileReader.getEnvironment());
				object_repository.Login_otherUser.click();
				object_repository.Login_Username.sendKeys(ConfigFileReader.getCreator_login_username());
				object_repository.Login_Password.sendKeys(ConfigFileReader.getCreator_login_password());
				object_repository.Login_loginSubmit.click();
				System.out.println("Logged in as: " + object_repository.Home_Loggedin_User.getText());
				System.out.println("****************************");
			}
		}
		
		@And("^user should able to Navigate to Menu Accounts Payable$")
		public static void user_should_able_to_Navigate_to_Menu_Accounts_Payable() throws Throwable {
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Home_accessBasedMenu));
			object_repository.Home_accessBasedMenu.click();
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Menu_finance));
			object_repository.Menu_finance.click();
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Menu_Accounts_Payable));
			object_repository.Menu_Accounts_Payable.click();
			System.out.println("Navigated to Menu_Accounts_Payable in Menu");
			Thread.sleep(4000);
		}
		
		@Then("^user should able to Navigate to Account Payment Hold Release page$")
		public static void user_should_able_to_Navigate_to_Account_Payment_Hold_Release_page() throws Throwable {
//			Actions action=new Actions(Webdriver.driver);
//			action.moveToElement(object_repository.Menu_Payment_Hold_Release);
//			action.perform();
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Menu_Payment_Hold_Release));
			object_repository.Menu_Payment_Hold_Release.click();
			System.out.println("Navigated to Menu_Payment_Hold_Release Page");
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Payment_Hold_Release_ForAction_Refresh));
			Thread.sleep(3000);
			try {
				object_repository.Payment_Hold_Release_ForAction_Refresh.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", object_repository.Payment_Hold_Release_ForAction_Refresh);
			}
			
			System.out.println("User should able to Refresh the Payment hold ForAction page");
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
