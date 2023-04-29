package object_repository.Actions;

import static org.junit.Assert.assertTrue;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.vimalselvam.cucumber.listener.Reporter;
import dataProviders.ConfigFileReader;
import object_repository.Locators.EngineeringSchedule;
import object_repository.Locators.LoginObjects;
import stepdefinition.Webdriver;

public class LoginActions {
	public static WebDriver driver;
	public static Robot r;
	static boolean status;
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 100);

	public LoginActions() {

		PageFactory.initElements(Webdriver.driver, LoginObjects.class);
	}

	public void otheruserLogin() throws InterruptedException {
		System.out.println("Before other click");
		wait.until(ExpectedConditions.elementToBeClickable(LoginObjects.other));
		LoginObjects.other.click();
		System.out.println("After other click");
	}

	public void username_password() {
		LoginObjects.username.sendKeys(ConfigFileReader.getUsername());
		LoginObjects.password.sendKeys(ConfigFileReader.getPassword());
	}

	public void usernamePk() {
		LoginObjects.username.sendKeys(ConfigFileReader.getUsernamePk());
		LoginObjects.password.sendKeys(ConfigFileReader.getPasswordPk());
	}

	public void usernameInvalid() throws InterruptedException {
		Thread.sleep(3000);
		LoginObjects.username.clear();
		wait.until(ExpectedConditions.elementToBeClickable(LoginObjects.username));
		LoginObjects.username.sendKeys("Praveen");
		LoginObjects.password.sendKeys(ConfigFileReader.getPasswordPk());

	}

	public void userPassInvalid() throws InterruptedException {
		Thread.sleep(3000);
		LoginObjects.username.clear();
		wait.until(ExpectedConditions.elementToBeClickable(LoginObjects.username));
		LoginObjects.username.sendKeys(ConfigFileReader.getUsernamePk());
		LoginObjects.password.sendKeys("Kumar5");
	}

	public void username_userPass_Invalid() throws InterruptedException {
		Thread.sleep(3000);
		LoginObjects.username.clear();
		wait.until(ExpectedConditions.elementToBeClickable(LoginObjects.username));
		LoginObjects.username.sendKeys("Praveen");
		LoginObjects.password.sendKeys("Kumar5");

	}

	public void submit() throws InterruptedException, AWTException {
		LoginObjects.loginbutton.click(); 
//		if (LoginObjects.loginbutton.isDisplayed()==true) {	
//			LoginObjects.loginbutton.click(); 
//			System.out.println("Moved to HomePage");
//			if (LoginObjects.popup.isDisplayed()==true) {
//				LoginObjects.popup.click();
//				System.out.println("Login other user");
//		}else {
//			if (LoginObjects.popup.isDisplayed()==false) {
//			System.out.println("Login other user");
//	}
//			
//		}
//	}else {System.out.println("Moved");} 
//		Actions builder = new Actions(driver);        
//		builder.sendKeys(Keys.ESCAPE);
//		Thread.sleep(2000);
//		LoginObjects.popup.click();
//		r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		 Alert a = driver.switchTo().alert();
//		 LoginObjects.popup.click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
//	driver.switchTo().alert().accept();
//		if (LoginObjects.loginbutton.isDisplayed()==true) {
//			LoginObjects.loginbutton.click(); 
//			System.out.println("Moved to HomePage");
//			if (LoginObjects.popup.isDisplayed()==false) {	
//				System.out.println("Moved");
//			}else if (LoginObjects.popup.isDisplayed()==true) {
//					LoginObjects.popup.click();
//					System.out.println("Login other user");
//			}
//			}else {
//				System.out.println("Login Failed");
//			}
//		if (LoginObjects.loginbutton.isDisplayed()==true) {
//			LoginObjects.loginbutton.click();
//			if (LoginObjects.popup != null) {
//				LoginObjects.popup.click();
//				
//				if (LoginObjects.popup == null) {
//					System.out.println("Login Succesfully");
//				}			
//	
//			}
//		} 
//		else if (LoginObjects.popup.isDisplayed()==true) {
//			LoginObjects.popup.click();
//		}
		System.out.println("Login Successfully");
	}

	public void logout() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElements(LoginObjects.LogOut));
//		Actions actions = new Actions(Webdriver.driver);
//		actions.moveToElement(LoginObjects.LogOut).click().build().perform();
		status = LoginObjects.LogOut.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("EDMS page LogOut is enabled");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfAllElements(LoginObjects.LogOut));
		LoginObjects.LogOut.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(LoginObjects.SignOut));
		LoginObjects.SignOut.click();
		System.out.println("LogOut Successfully");

	}

}