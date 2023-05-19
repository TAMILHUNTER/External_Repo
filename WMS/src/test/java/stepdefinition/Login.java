package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import utils.DriverFactory;
import java.time.Duration;

public class Login {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(30));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);
	// **************** Start import methods for step definition

	public static void Landing() throws InterruptedException {
		DriverFactory.driver.get(System.getProperty("user.dir") + ConfigFileReader.getLanding_Page());
		wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Landing_Page, "ISD-AUTOMATION QA"));
		Thread.sleep(5000);
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.Landing_Page2);
		actions.perform();
		wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Landing_Page_Counter, "10,000"));
		Thread.sleep(3000);
	}

//----------------------------------------------------------------------------------------------------------
	public static void Induction_Approver_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Approver_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Approver_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Creator_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			// DriverFactory.driver.findElement(By.linkText("Other User")).click();
			ObjectsReporsitory.Login_otherUser.click();
			Thread.sleep(2000);
			// ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Creator_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Creator_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfAllElements(ObjectsReporsitory.Home_Loggedin_User));
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Creator_login_internationalJob() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Creator_username_nepal());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Creator_password_nepal());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
			
		}
	}
	
	public static void Configuration_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getConfiguration_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getConfiguration_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Attendance_Creator_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getAttendance_Creator_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getAttendance_Creator_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Attendance_Approver_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getAttendance_Approver_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getAttendance_Approver_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

//----------------------------------------------------------------------------------------------------------
	public static void Induction_Basic_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Creator_username_nepal());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Creator_password_nepal());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}
	
	public static void Induction_Basic_login_InternationalJob() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Creator_username_nepal());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Creator_password_nepal());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Skill_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Skill_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Skill_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Paramedics_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Paramedics_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Paramedics_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Medical_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Medical_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Medical_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_EHS_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_EHS_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_EHS_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Training_Creater_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.get_Training_Creater_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getTraining_Creater_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Training_Master_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.get_Training_Master_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getTraining_Master_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Induction_Wage_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Wage_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Wage_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

	public static void Attendance_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getAttendance_Creator_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getAttendance_Creator_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}

//----------------------------------------------------------------------------------------------------------
	public static void Use_Login_Induction_Basic() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Basic_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Use_Login_Induction_Skill() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Skill_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Use_Login_Induction_Paramedics() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Paramedics_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Use_Login_Induction_Medical_Test() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Medical_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Use_Login_Induction_EHS() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_EHS_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Use_Login_Induction_Wage() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Wage_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Use_Login_Attendance_Creator() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		stepdefinition.Login.Attendance_login();

	}

	public static void Use_Login_Training_Creator() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		stepdefinition.Login.Induction_Training_Creater_login();
	}

	public static void Use_Login_Training_Master() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		stepdefinition.Login.Induction_Training_Master_login();
	}

	public static void Logout() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Profile_Dropdown));
		ObjectsReporsitory.Profile_Dropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Profile_Signout));
		ObjectsReporsitory.Profile_Signout.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Login_otherUser));
	}
	
	public static void Use_Login_for_InternationalJob() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Basic_login_InternationalJob();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login_internationalJob();
		}
	}
	
	public static void Use_Login_Management() throws InterruptedException {
		DriverFactory.driver.manage().deleteAllCookies();
		if (ConfigFileReader.getLogin_type().equals("0")) {
			stepdefinition.Login.Induction_Basic_login();
		} else if (ConfigFileReader.getLogin_type().equals("1")) {
			stepdefinition.Login.Induction_Creator_login();
		}
	}

	public static void Management_login() throws InterruptedException {

		if (ConfigFileReader.getLogin_Landing().equals("Yes")) {
			System.out.println("Automation Landing Page");
			Login.Landing();
		} else {
			DriverFactory.driver.get(ConfigFileReader.getEnvironment());
			// DriverFactory.driver.findElement(By.linkText("Other User")).click();
			ObjectsReporsitory.Login_otherUser.click();
			Thread.sleep(2000);
			// ObjectsReporsitory.Login_otherUser.click();
			ObjectsReporsitory.Login_Username.sendKeys(ConfigFileReader.getInduction_Creator_username());
			ObjectsReporsitory.Login_Password.sendKeys(ConfigFileReader.getInduction_Creator_password());
			ObjectsReporsitory.Login_loginSubmit.click();
			Thread.sleep(5000);
			Basic.PageLoader_Validation();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_actionTaken));
			Basic.PageLoader_Validation();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfAllElements(ObjectsReporsitory.Home_Loggedin_User));
			System.out.println("Logged in as: " + ObjectsReporsitory.Home_Loggedin_User.getText());
		}
	}
}
