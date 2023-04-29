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
		
		System.out.println("Click on Other User in EIP Login Page");

		
	}
	
	
	
		
	
	
	 @Then("^Enter EIP QA Username$") public static void
	 Enter_EIP_QA_Username_as() throws Throwable {
		 Thread.sleep(2000);
	 Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
	 
	 System.out.println("Enter User Name in EIP Login Page");
	 
	 }
	 
	 @Then("^Enter EIP QA RFQ Username$") public static void
	 Enter_EIP_QA_RFQ_Username() throws Throwable {
		 Thread.sleep(2000);
	 Login_Objects.Username.sendKeys(ConfigFileReader.getRFQUsername());
	 
	 System.out.println("Enter RFQ User Name in EIP Login Page");
	 
	 }
	 
/*
	@Then("^Enter the Username from db (.*)$")
	public static void Enter_the_Username_from_db(String documentType) throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("Enter User Name from Data Base:"+documentType);
		DataBaseConnection.approver(documentType); 
		
	}
	*/
	@Then("^Enter the Username from db$")
	public static void Enter_the_Username_from_db1() throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("Enter User Name from Data Base:"+ConfigFileReader.getPR_documentType());
		DataBaseConnection.approver(ConfigFileReader.getPR_documentType()); 
		
	}
	
	@Then("^Enter the Username for TCD from db$")
	public static void Enter_the_Username_for_TCD_from_db() throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("Enter User Name from Data Base:"+ ConfigFileReader.getTCD_documentType());
		DataBaseConnection.approver(ConfigFileReader.getTCD_documentType()); 
		
	}
	

	@Then("^Enter the Password$") 
	public static void enter_the_Password() throws Throwable {
		// DataBaseConnection.approver();
		Thread.sleep(2000);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		
		 System.out.println("Enter Password in EIP Login Page");

	}

	@Then("^Click on Login$")
	public static void click_on_Login() throws Throwable {
		Thread.sleep(2000);
		Login_Objects.Login.click();
		
		 System.out.println("Select Login button in EIP Login Page");
	}

	public static void Logout() throws InterruptedException {
		
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				Login_Objects.Home);
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.Home));
		Login_Objects.Home.click();
		
		 System.out.println("Select Home Icon in EIP Page");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.profileDr));
		Login_Objects.profileDr.click();
		System.out.println("Select Profile Icon in EIP Page");
		Thread.sleep(2000);
		Login_Objects.Signout.click();
		System.out.println("Select Sign Out button in EIP Page");

	}
	public static void SRLogout() throws InterruptedException {
		Thread.sleep(500);
	/*	wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.Home));
		Login_Objects.Home.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(Login_Objects.profilSR));
		Thread.sleep(2000);
		Login_Objects.profilSR.click();
		System.out.println("Select Profile Icon in EIP Page");
		Thread.sleep(2000);
		Login_Objects.Signout.click();
		System.out.println("Select Sign Out button in EIP Page");


	}

}
