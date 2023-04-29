package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Login_Objects;

public class Login_Steps {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Login_Steps() {
		PageFactory.initElements(Webdriver.driver, Login_Objects.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
	public static Actions actions = new Actions(Webdriver.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Go to Test Environment$")
	public static void Login() throws InterruptedException {
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());

	}

	@Then("Click on Other User")
	public static void click_on_Other_User() throws Throwable {
		Thread.sleep(2000);
		Login_Objects.Otheruser.click();

		
	}
	
	
	
		
	
	
	 @Then("^Enter EIP QA Username$") public static void
	 Enter_EIP_QA_Username_as() throws Throwable {
		 Thread.sleep(2000);
	 Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
	 
	 }
	 

	@Then("^Enter the Username from db (.*)$")
	public static void Enter_the_Username_from_db(String documentType) throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("DB:"+documentType);
		DatabaseConnection.approver(documentType); 
		
	}

	@Then("^Enter the Password$") 
	public static void enter_the_Password() throws Throwable {
		// DatabaseConnection.approver();
		Thread.sleep(2000);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());

	}

	@Then("^Click on Login$")
	public static void click_on_Login() throws Throwable {
		Thread.sleep(2000);
		Login_Objects.Login.click();
	}
	

	public static void Logout() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.Home));
		Login_Objects.Home.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.profileDr));
		Login_Objects.profileDr.click();
		Thread.sleep(2000);
		Login_Objects.Signout.click();

	}
	public static void SRLogout() throws InterruptedException {
		Thread.sleep(500);
	/*	wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.Home));
		Login_Objects.Home.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.profilSR));
		Thread.sleep(2000);
		Login_Objects.profilSR.click();
		Thread.sleep(2000);
		Login_Objects.Signout.click();

	}
	
	

}
