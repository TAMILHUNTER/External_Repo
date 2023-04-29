package Login_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.FIN_Journals_Coding;
import stepdefinition.DatabaseConnection;
import stepdefinition.Webdriver;

public class FIN_Journals_login extends Baseclass {
	
	
	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	
	public static void loginFunction_Journals() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		try {
			FIN_Journals_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(FIN_Journals_Coding.Login_otherUser);
		}
		FIN_Journals_Coding.Login_Username.sendKeys(ConfigFileReader.getFIN_Username());
		FIN_Journals_Coding.Login_Password.sendKeys(ConfigFileReader.getDMS_Password());
		FIN_Journals_Coding.Login_loginSubmit.click();
	}
	
	public static void Menu_to_Journals() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		FIN_Journals_Coding.menu.click();
		wait.until(ExpectedConditions.elementToBeClickable(FIN_Journals_Coding.Finance));
		movetoElemt(FIN_Journals_Coding.Finance);
		System.out.println("Menu =" + FIN_Journals_Coding.Finance.getText());
		wait.until(ExpectedConditions.elementToBeClickable(FIN_Journals_Coding.Account_payable));
		movetoElemt(FIN_Journals_Coding.Account_payable);
		System.out.println("Menu =" + FIN_Journals_Coding.Account_payable.getText());
		wait.until(ExpectedConditions.elementToBeClickable(FIN_Journals_Coding.Invoice_process));
		movetoElemt(FIN_Journals_Coding.Invoice_process);
		System.out.println("Menu =" +FIN_Journals_Coding.Invoice_process.getText());
		wait.until(ExpectedConditions.elementToBeClickable(FIN_Journals_Coding.Journals));
		moveToClick(FIN_Journals_Coding.Journals);
		System.out.println("Menu =" +FIN_Journals_Coding.Journals.getText());

	}
	
	public static void Filter_Icon_Journals() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		try {
			FIN_Journals_Coding.Filter_Icon.click();
			
		} catch (Exception e) {
			toclick(FIN_Journals_Coding.Filter_Icon);
		}
	}
	
	public static void Pass_Ivoice_No() throws Throwable {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		try {
			FIN_Journals_Coding.Pass_Invoice_No.click();
		} catch (Exception e) {
			toclick(FIN_Journals_Coding.Pass_Invoice_No);
		}
		Thread.sleep(2000);
		DatabaseConnection.SendJournalsFromDB();
		
	}
	public static void WO_NO() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		movetoElemt(FIN_Journals_Coding.WO_No);
		System.err.println("Work Order No = "+FIN_Journals_Coding.WO_No.getText());
	}
	
	public static void Edit() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		movetoElemt(FIN_Journals_Coding.Edit);
		Thread.sleep(1000);
		moveToClick(FIN_Journals_Coding.Edit);
	}
	
	public static void Approve() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		
		try {
			FIN_Journals_Coding.Approve.click();
		} catch (Exception e) {
			toclick(FIN_Journals_Coding.Approve);
		}
		Thread.sleep(2000);
		try {
			FIN_Journals_Coding.Yes_Button.click();
		} catch (Exception e) {
			FIN_Journals_Coding.No_Button.click();
		}
		Thread.sleep(2000);
		try {
			FIN_Journals_Coding.OK_Button.click();
		} catch (Exception e) {
			FIN_Journals_Coding.Close_Button.click();
		}
		System.out.println("Successfully Approved Journals");
//		Thread.sleep(2000);
//		try {
//			FIN_Journals_Coding.Close_page.click();
//		} catch (Exception e) {
//			toclick(FIN_Journals_Coding.Close_page);
//		}
	}
	
	public static void signout() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		try {
			FIN_Journals_Coding.Sign_out_Icon.click();
		} catch (Exception e) {
			toclick(FIN_Journals_Coding.Sign_out_Icon);
		}
		Thread.sleep(1000);
		try {
			FIN_Journals_Coding.Signout.click();
		} catch (Exception e) {
			toclick(FIN_Journals_Coding.Signout);
		}
	}

}
