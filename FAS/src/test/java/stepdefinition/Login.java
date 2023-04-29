package stepdefinition;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import stepdefinition.Webdriver;

public class Login {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);

	// **************** Start import methods for step definition
	// ********************

	public static void Landing() throws InterruptedException {
		Webdriver.driver.get(System.getProperty("user.dir") + ConfigFileReader.getLanding_Page());
		wait.until(ExpectedConditions.textToBePresentInElement(object_repository.Tamil.ObjectsReporsitory.Landing_Page, "ISD-AUTOMATION QA"));
		Thread.sleep(5000);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(object_repository.Tamil.ObjectsReporsitory.Landing_Page2);
		actions.perform();
		wait.until(ExpectedConditions.textToBePresentInElement(object_repository.Tamil.ObjectsReporsitory.Landing_Page_Counter, "10,000"));
		Thread.sleep(3000);
	}

//----------------------------------------------------------------------------------------------------------
	public static void Partner_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("FAS Automation Landing Page");
			System.out.println("****************************");
			Login.Landing();
		} else {
			Webdriver.driver.get(ConfigFileReader.getEnvironment());
			object_repository.Tamil.ObjectsReporsitory.Login_otherUser.click();
			object_repository.Tamil.ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getPartner_username());
			object_repository.Tamil.ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getPartner_password());
			object_repository.Tamil.ObjectsReporsitory.Login_loginSubmit.click();
			System.out.println("Logged in as: " + object_repository.Tamil.ObjectsReporsitory.Home_Loggedin_User.getText());
			System.out.println("****************************");
		}
	}
	
	public static void Employee_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("FAS Automation Landing Page");
			System.out.println("****************************");
			Login.Landing();
		} else {
			Webdriver.driver.get(ConfigFileReader.getEnvironment());
			object_repository.Tamil.ObjectsReporsitory.Login_otherUser.click();
			object_repository.Tamil.ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getEmployee_username());
			object_repository.Tamil.ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getEmployee_password());
			object_repository.Tamil.ObjectsReporsitory.Login_loginSubmit.click();
			System.out.println("Logged in as: " + object_repository.Tamil.ObjectsReporsitory.Home_Loggedin_User.getText());
			System.out.println("****************************");
		}
	}
	
	public static void EIP_User_Login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("FAS Automation Landing Page");
			System.out.println("****************************");
			Login.Landing();
		} else {
			Webdriver.driver.get(ConfigFileReader.getEnvironment());
			object_repository.Tamil.ObjectsReporsitory.Login_otherUser.click();
			object_repository.Tamil.ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getEIP_User_username());
			object_repository.Tamil.ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getEIP_User_password());
			object_repository.Tamil.ObjectsReporsitory.Login_loginSubmit.click();
			System.out.println("Logged in as: " + object_repository.Tamil.ObjectsReporsitory.Home_Loggedin_User.getText());
			System.out.println("****************************");
		}
	}
	
	public static void Logout() throws InterruptedException {

		object_repository.Tamil.ObjectsReporsitory.Profile_Dropdown.click();
		object_repository.Tamil.ObjectsReporsitory.Profile_Signout.click();
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Login_otherUser));
		System.out.println("Logged out Successfully");
		System.out.println("****************************");
	}

}
