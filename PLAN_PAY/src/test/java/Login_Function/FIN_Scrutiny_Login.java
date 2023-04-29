package Login_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.FIN_Scrutiny_Coding;
import stepdefinition.DatabaseConnection;
import stepdefinition.Webdriver;

public class FIN_Scrutiny_Login extends Baseclass{
	
	// Read Configuration
		public static ConfigFileReader configFileReader;

		// Common Imports
		static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
		
		public static void loginFunction() {

			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Webdriver.driver.manage().deleteAllCookies();
			Webdriver.driver.get(ConfigFileReader.getEnvironment());
			try {
				FIN_Scrutiny_Coding.Login_otherUser.click();
			} catch (Exception e) {
				toclick(FIN_Scrutiny_Coding.Login_otherUser);
			}
			FIN_Scrutiny_Coding.Login_Username.sendKeys(ConfigFileReader.getFIN_Username());
			FIN_Scrutiny_Coding.Login_Password.sendKeys(ConfigFileReader.getDMS_Password());
			FIN_Scrutiny_Coding.Login_loginSubmit.click();
		}
		
		public static void Menu_to_Scrutiny() {

			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			FIN_Scrutiny_Coding.menu.click();
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Scrutiny_Coding.Finance));
			movetoElemt(FIN_Scrutiny_Coding.Finance);
			System.out.println("Menu =" + FIN_Scrutiny_Coding.Finance.getText());
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Scrutiny_Coding.Account_payable));
			movetoElemt(FIN_Scrutiny_Coding.Account_payable);
			System.out.println("Menu =" + FIN_Scrutiny_Coding.Account_payable.getText());
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Scrutiny_Coding.Invoice_process));
			movetoElemt(FIN_Scrutiny_Coding.Invoice_process);
			System.out.println("Menu =" +FIN_Scrutiny_Coding.Invoice_process.getText());
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Scrutiny_Coding.Scrutiny));
			moveToClick(FIN_Scrutiny_Coding.Scrutiny);
			System.out.println("Menu =" +FIN_Scrutiny_Coding.Scrutiny.getText());

		}
		
		public static void Filter_icon () throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(5000);
			try {
				FIN_Scrutiny_Coding.Filter_Icon.click();
			} catch (Exception e) {
				toclick(FIN_Scrutiny_Coding.Filter_Icon);
			}	
			
		}
		
		public static void Pass_Invoice_No() throws Throwable {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			try {
				FIN_Scrutiny_Coding.Invoice_Regs_No.click();
			} catch (Exception e) {
				toclick(FIN_Scrutiny_Coding.Invoice_Regs_No);
			}
			Thread.sleep(2000);
			DatabaseConnection.SendScrutinyFromDB();
			
			
		}
		
		public static void Edit() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(3000);
			
			movetoElemt(FIN_Scrutiny_Coding.Edit);
			Thread.sleep(1000);
			moveToClick(FIN_Scrutiny_Coding.Edit);
		}
		
		public static void WO_No() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			
			Thread.sleep(3000);
			movetoElemt(FIN_Scrutiny_Coding.WO_Number);
			System.err.println("Work Order No =" +FIN_Scrutiny_Coding.WO_Number.getText());
		}
		
		public static void Approve() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			
			try {
				FIN_Scrutiny_Coding.Finance_Approve.click();
			} catch (Exception e) {
				toclick(FIN_Scrutiny_Coding.Finance_Approve);
			}
			Thread.sleep(2000);
			try {
				FIN_Scrutiny_Coding.OK_Button.click();
			} catch (Exception e) {
				FIN_Scrutiny_Coding.Close_Button.click();
			}
			System.out.println("Successfully Approved Scrutiny");
//			Thread.sleep(2000);
//			try {
//				FIN_Scrutiny_Coding.Close_page.click();
//			} catch (Exception e) {
//				toclick(FIN_Scrutiny_Coding.Close_page);
//			}
			
		}
		
		public static void Signout() throws InterruptedException {
			
			Thread.sleep(2000);
			try {
				FIN_Scrutiny_Coding.Sign_out_Icon.click();
			} catch (Exception e) {
				toclick(FIN_Scrutiny_Coding.Sign_out_Icon);
			}
			Thread.sleep(1000);
			try {
				FIN_Scrutiny_Coding.Signout.click();
			} catch (Exception e) {
				toclick(FIN_Scrutiny_Coding.Signout);
			}
		
		}

}
