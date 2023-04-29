package Login_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.SCM_Bill_Creation_Coding;

import stepdefinition.DatabaseConnection;
import stepdefinition.Webdriver;

public class SCM_Bill_Creation_Login extends Baseclass {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);

	public static void loginFunction() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		Thread.sleep(2000);
		try {
			SCM_Bill_Creation_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(SCM_Bill_Creation_Coding.Login_otherUser);
		}
		SCM_Bill_Creation_Coding.Login_Username.sendKeys(ConfigFileReader.getDMS_Username());
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.Login_Password.sendKeys(ConfigFileReader.getDMS_Password());
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.Login_loginSubmit.click();
		Thread.sleep(4000);
	}

	public static void Menu_to_Bill_Create() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_Bill_Creation_Coding.menu.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.SCM));
		movetoElemt(SCM_Bill_Creation_Coding.SCM);
		System.out.println("Menu =" + SCM_Bill_Creation_Coding.SCM.getText());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Execution));
		movetoElemt(SCM_Bill_Creation_Coding.Execution);
		System.out.println("Menu =" + SCM_Bill_Creation_Coding.Execution.getText());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Bill_Creation));
		moveToClick(SCM_Bill_Creation_Coding.Bill_Creation);

	}

	public static void Filter_Icon() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(5000);
		SCM_Bill_Creation_Coding.Filter_Icon.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Filter_Document_No));
		Thread.sleep(8000);
		SCM_Bill_Creation_Coding.Filter_Document_No.click();
		Thread.sleep(8000);
		DatabaseConnection.GetAssetRequestARCARFirstAndSecondLavelFromDB();

	}

	public static void Bill_Creation() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		movetoElemt(SCM_Bill_Creation_Coding.Creation);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Creation));
		moveToClick(SCM_Bill_Creation_Coding.Creation);

	}

	public static void Measurment() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		try {
			SCM_Bill_Creation_Coding.measurment_Icon.click();
			System.out.println("Measurment Available");
		} catch (Exception e) {
			SCM_Bill_Creation_Coding.PopUp_Close_button.click();
			System.err.println("Measurment Not Available");
		}

	}

	public static void Select_material() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.M_Doc_Select.click();
	}

	public static void Approveqty() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement a = Webdriver.driver.findElement(By.xpath("//span[text()='Account Code']"));
		JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver; 
		js.executeScript("arguments[0].scrollIntoView();",a);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.Approve_qty_Icon.click();

	}

	public static void Approve_Select_material() {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.A_D_Select_1));
		SCM_Bill_Creation_Coding.A_D_Select_1.click();

	}

	public static void This_qty() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.This_qty.click();
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.This_qty));
//		SCM_Bill_Creation_Coding.This_qty.clear();
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.This_qty));
//		SCM_Bill_Creation_Coding.This_qty.sendKeys(ConfigFileReader.getThisqty());

	}

	public static void Measurment_Save() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.A_save_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.PopUp_Close_button));
		SCM_Bill_Creation_Coding.PopUp_Close_button.click();
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Close_button));
//		SCM_Bill_Creation_Coding.Close_button.click();

	}

	public static void close_page_Approve() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Close_button));
		SCM_Bill_Creation_Coding.Close_button.click();

//		try {
//			SCM_Bill_Creation_Coding.Yes_button.click();
//		} catch (Exception e) {
//			SCM_Bill_Creation_Coding.No_button.click();
//		}
	}

	public static void Submit_Billcreation() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(3000);
		SCM_Bill_Creation_Coding.Submit_button.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Yes_button));
		try {
			SCM_Bill_Creation_Coding.Yes_button.click();
		} catch (Exception e) {
			SCM_Bill_Creation_Coding.No_button.click();
		}
		Thread.sleep(1000);
		try {
			SCM_Bill_Creation_Coding.OK_button.click();
		} catch (Exception e) {
			SCM_Bill_Creation_Coding.PopUp_Close_button.click();
		}
//		DatabaseConnection.EnterCapitalPRfromDB();
	}

	public static void login_Bill_deduction() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		try {
			SCM_Bill_Creation_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(SCM_Bill_Creation_Coding.Login_otherUser);
		}
		SCM_Bill_Creation_Coding.Login_Username.sendKeys(ConfigFileReader.SCM_Approve_Level2());
		SCM_Bill_Creation_Coding.Login_Password.sendKeys(ConfigFileReader.getDMS_Password());
		SCM_Bill_Creation_Coding.Login_loginSubmit.click();

	}

	public static void Click_Inprogess() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.Inprogess_Icon.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Filter_Icon));
		SCM_Bill_Creation_Coding.Filter_Icon.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Filter_Bill_No));
		SCM_Bill_Creation_Coding.Filter_Bill_No.click();
		Thread.sleep(2000);
		DatabaseConnection.EnterCapitalPRfromDB();

	}

	public static void Bill_Deduction() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		movetoElemt(SCM_Bill_Creation_Coding.Bill_Deduction_Icon);
		moveToClick(SCM_Bill_Creation_Coding.Bill_Deduction_Icon);
	}

	public static void TDS_Update() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(4000);
		SCM_Bill_Creation_Coding.TDS_update.click();
		Thread.sleep(3000);
		SCM_Bill_Creation_Coding.TDS_select.click();

	}

	public static void Save_TDS() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_Bill_Creation_Coding.A_save_button.click();
	}

	public static void Sub_Contractor_Invoice() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2500);
		SCM_Bill_Creation_Coding.Sub_C_Invoice_no.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Sub_C_Invoice_no));
		SCM_Bill_Creation_Coding.Sub_C_Invoice_no.sendKeys(ConfigFileReader.getTesting());
	}

	public static void Invoice_Date() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(1000);
		SCM_Bill_Creation_Coding.Calender_icon_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Today_Click));
		SCM_Bill_Creation_Coding.Today_Click.click();
	}

	public static void Payment_Type() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_Bill_Creation_Coding.payment_type.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.P_T_Select));
		moveToClick(SCM_Bill_Creation_Coding.P_T_Select);
	}

	public static void Submit_Bill_Deduction() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		try {
			SCM_Bill_Creation_Coding.Submit_button1.click();
		} catch (Exception e) {
			toclick(SCM_Bill_Creation_Coding.Submit_button1);
		}
		try {
			SCM_Bill_Creation_Coding.OK_button.click();
		} catch (Exception e) {
			SCM_Bill_Creation_Coding.PopUp_Close_button.click();
		}
//		DatabaseConnection.EnterCapitalPRfromDB();
	}

	public static void Login_Bill_Approve() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		try {
			SCM_Bill_Creation_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(SCM_Bill_Creation_Coding.Login_otherUser);
		}
		SCM_Bill_Creation_Coding.Login_Username.sendKeys(ConfigFileReader.get_Approver_username());
		SCM_Bill_Creation_Coding.Login_Password.sendKeys(ConfigFileReader.getDMS_Password());
		SCM_Bill_Creation_Coding.Login_loginSubmit.click();

	}

	public static void Click_Filter() throws InterruptedException {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.Filter_Icon_A.click();

	}

	public static void Filter_Document() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.F_A_D_NO.click();
		Thread.sleep(2000);
		DatabaseConnection.EnterCapitalPRfromDB1();
	}

	public static void MouseOver() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		movetoElemt(SCM_Bill_Creation_Coding.Approve_Document);
		moveToClick(SCM_Bill_Creation_Coding.Approve_Document);

	}

	public static void Approve() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		SCM_Bill_Creation_Coding.Approve_icon.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Text_Approve));
		SCM_Bill_Creation_Coding.Text_Approve.sendKeys(ConfigFileReader.gettest_Pass_Reject());
		Thread.sleep(2000);
		try {
			SCM_Bill_Creation_Coding.Yes_button.click();
		} catch (Exception e) {
			SCM_Bill_Creation_Coding.No_button.click();
		}
		Thread.sleep(2000);
		try {
			SCM_Bill_Creation_Coding.OK_button.click();
		} catch (Exception e) {
			SCM_Bill_Creation_Coding.PopUp_Close_button.click();
		}

	}

	public static void Signout() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2500);
		SCM_Bill_Creation_Coding.Sign_out_Icon.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Bill_Creation_Coding.Signout));
		SCM_Bill_Creation_Coding.Signout.click();
		
	}

}
