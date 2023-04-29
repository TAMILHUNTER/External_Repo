package Login_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.FIN_Disbursement_Coding;
import stepdefinition.DatabaseConnection;
import stepdefinition.Webdriver;

public class FIN_Disbursement_Login extends Baseclass{
	
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
				FIN_Disbursement_Coding.Login_otherUser.click();
			} catch (Exception e) {
				toclick(FIN_Disbursement_Coding.Login_otherUser);
			}
			FIN_Disbursement_Coding.Login_Username.sendKeys(ConfigFileReader.getFIN_Username());
			FIN_Disbursement_Coding.Login_Password.sendKeys(ConfigFileReader.getDMS_Password());
			FIN_Disbursement_Coding.Login_loginSubmit.click();
		}
		
		public static void Menu_to_Disbursement() {

			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			FIN_Disbursement_Coding.menu.click();
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Disbursement_Coding.Finance));
			movetoElemt(FIN_Disbursement_Coding.Finance);
			System.out.println("Menu =" + FIN_Disbursement_Coding.Finance.getText());
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Disbursement_Coding.Treasury));
			movetoElemt(FIN_Disbursement_Coding.Treasury);
			System.out.println("Menu =" + FIN_Disbursement_Coding.Treasury.getText());
			wait.until(ExpectedConditions.elementToBeClickable(FIN_Disbursement_Coding.Collection_Disbursement));
			moveToClick(FIN_Disbursement_Coding.Collection_Disbursement);
			System.out.println("Menu =" +FIN_Disbursement_Coding.Collection_Disbursement.getText());
			
		}
		
		public static void Document_Type() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(2000);
			FIN_Disbursement_Coding.Clear.click();
			Thread.sleep(1000);
			moveToClick(FIN_Disbursement_Coding.Select_Document);
		}
		
		public static void GO() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(2000);
			FIN_Disbursement_Coding.GO.click();
		}
		
		public static void Filter() throws Throwable {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(5000);
			FIN_Disbursement_Coding.Filter.click();
			Thread.sleep(2000);
			FIN_Disbursement_Coding.Filter_Document_No.click();
			
			
		}
		
		public static void From_DB() throws Throwable {
			
			Thread.sleep(2000);
			DatabaseConnection.SendCollestionFromDB();
			
		}
		
		public static void Disburse() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			movetoElemt(FIN_Disbursement_Coding.Disburse);
			Thread.sleep(1000);
			moveToClick(FIN_Disbursement_Coding.Disburse);
			
		}
		public static void select_material_popup() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(2000);
			try {
				FIN_Disbursement_Coding.Yes.click();
			} catch (Exception e) {
				FIN_Disbursement_Coding.No.click();
			}
		}
		
		public static void Bank_Name() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			FIN_Disbursement_Coding.Bank_Name.click();
			Thread.sleep(2000);
			FIN_Disbursement_Coding.Bank_Name.sendKeys(ConfigFileReader.getBank());
			Thread.sleep(2000);
			moveToClick(FIN_Disbursement_Coding.Select_Bank_Name);
			
			
			
		}
		public static void Submit() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(2000);
			FIN_Disbursement_Coding.Submit.click();
			
		}
		public static void popup_confirmation() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(2000);
			try {
				FIN_Disbursement_Coding.Yes.click();
			} catch (Exception e) {
				FIN_Disbursement_Coding.No.click();
			}finally {
				FIN_Disbursement_Coding.close.click();
			}
			Thread.sleep(2000);
			try {
				FIN_Disbursement_Coding.ok.click();
			} catch (Exception e) {
				FIN_Disbursement_Coding.close.click();
			}
			
		}
		
		
		public static void signout() throws InterruptedException {
			
			int implicitWaitTime = (30);
			Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			Thread.sleep(2000);
			FIN_Disbursement_Coding.Close_page.click();
			
			Thread.sleep(2000);
			
			FIN_Disbursement_Coding.Home_Button.click();
			
			Thread.sleep(2000);
			try {
				FIN_Disbursement_Coding.Sign_out_Icon.click();
			} catch (Exception e) {
				toclick(FIN_Disbursement_Coding.Sign_out_Icon);
			}
			Thread.sleep(1000);
			try {
				FIN_Disbursement_Coding.Signout.click();
			} catch (Exception e) {
				toclick(FIN_Disbursement_Coding.Signout);
			}
		}

}
