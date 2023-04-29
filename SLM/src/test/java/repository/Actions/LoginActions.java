package repository.Actions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.PageFactory;
import com.vimalselvam.cucumber.listener.Reporter;
import object_repository.Locators.*;
import dataProviders.ConfigFileReader;
import stepdefinition.Webdriver;


public class LoginActions {
	
	
	public LoginActions() {	
		
		PageFactory.initElements(Webdriver.driver, LoginObjects.class);
	}
	
	public  void homepage() {
		Webdriver.driver.get("https://eip4qa.lntecc.com/eiproot/login");
	}
	
	public  void otheruserLogin() throws InterruptedException {
		LoginObjects.other.click();
	}
	
	public   void username_password() {
		
		LoginObjects.username.sendKeys(ConfigFileReader.getUsername());
		LoginObjects.password.sendKeys(ConfigFileReader.getPassword());
		
	}	
	public  void submit() {
		LoginObjects.loginbutton.click();
	}

	public  void verify() {
		assertEquals("KARTHIKEYAN S", LoginObjects.getUserName.getText());
		Reporter.addStepLog("Login Success");
	}

	public static void approver() {
		LoginObjects.username.sendKeys(ConfigFileReader.getApproverName());
		LoginObjects.password.sendKeys(ConfigFileReader.getApproverPassword());	
	}

	public void verifyApprover() {
		assertEquals("RAJASEKARAN K", LoginObjects.getUserName.getText());
		Reporter.addStepLog("Login Success");
		
	}

	public void transporterUserAndPassword() {
		LoginObjects.username.sendKeys("tvslsl");
		LoginObjects.password.sendKeys("LNT%qa22");
		LoginObjects.loginbutton.click();
	}
}