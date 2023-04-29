package Login_Function;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.SCM_SR_Coding;
import stepdefinition.Webdriver;

public class SCM_SR_Login extends Baseclass {

	
	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	

	public static void login() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		try {
			SCM_SR_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Login_otherUser);
		}
		SCM_SR_Coding.Login_Username.sendKeys(ConfigFileReader.getConfiguration_username1());
		SCM_SR_Coding.Login_Password.sendKeys(ConfigFileReader.getConfiguration_password1());
		SCM_SR_Coding.Login_loginSubmit.click();
	}

	public static void Menu_to_SR() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.menu.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.SCM));
		movetoElemt(SCM_SR_Coding.SCM);	
		System.out.println("Menu ="+SCM_SR_Coding.SCM.getText());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Request));
		movetoElemt(SCM_SR_Coding.Request);
//		System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
//		System.out.println(ANSI_BLUE +SCM_SR_Coding.Request.getText()+ ANSI_RESET);
		System.out.println("Menu ="+SCM_SR_Coding.Request.getText());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.S_R));
		moveToClick(SCM_SR_Coding.S_R);
		System.out.println("Menu ="+SCM_SR_Coding.S_R.getText());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Service_Icon));
		SCM_SR_Coding.Service_Icon.click();
//		System.out.println("Menu ="+SCM_SR_Coding.Service_Icon.getText());
	}

	public static void Creation() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.creater_Icon));
		try {
			SCM_SR_Coding.creater_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.creater_Icon);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job));
		SCM_SR_Coding.Job.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Select_Job));
		moveToClick(SCM_SR_Coding.Select_Job);
		Thread.sleep(2000);
//		assertEquals("LE180046 - Raheja", SCM_SR_Coding.Job.getAttribute("ng-reflect-model"));
//		System.out.println("Job =" +SCM_SR_Coding.Select_Job.getAttribute("ng-reflect-model"));
		System.out.println();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Payment_Center));
		SCM_SR_Coding.Payment_Center.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Select_payment));
		moveToClick(SCM_SR_Coding.Select_payment);
//		System.out.println("Payment Center ="+SCM_SR_Coding.Payment_Center);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.S_G));
		SCM_SR_Coding.S_G.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Select_S_G));
		moveToClick(SCM_SR_Coding.Select_S_G);
//		System.out.println("Group ="+SCM_SR_Coding.S_G);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Currency));
		SCM_SR_Coding.Currency.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WO_Period));
		SCM_SR_Coding.WO_Period.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WO_Period));
		SCM_SR_Coding.WO_Period.sendKeys(ConfigFileReader.getDate_Formate());
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Select_Today));
//		SCM_SR_Coding.Select_Today.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.S_C));
		SCM_SR_Coding.S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		moveToClick(SCM_SR_Coding.select_S_C);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Group));
		SCM_SR_Coding.Group.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_Group));
		moveToClick(SCM_SR_Coding.select_Group);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.NOS));
		SCM_SR_Coding.NOS.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.NOS));
		Thread.sleep(2000);
		SCM_SR_Coding.NOS.sendKeys(ConfigFileReader.getNOS());
	}

//	Card Values:

	public static void card_Single() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		try {
			SCM_SR_Coding.card.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.card);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		moveToClick(SCM_SR_Coding.select_S_C);
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(2500);
		moveToClick(SCM_SR_Coding.Select_material1);
		System.err.println("Material ="+SCM_SR_Coding.Select_material1.getText());
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single1() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		try {
			SCM_SR_Coding.card.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.card);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(2500);
		moveToClick(SCM_SR_Coding.Select_material2);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single2() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		try {
			SCM_SR_Coding.card.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.card);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(2500);
		moveToClick(SCM_SR_Coding.Select_material3);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single3() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		try {
			SCM_SR_Coding.card.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.card);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(2500);
//			visibletext(SCM_SR_Coding.Select_material3, text);
		moveToClick(SCM_SR_Coding.Select_material4);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single4() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		try {
			SCM_SR_Coding.card.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.card);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(5000);
		moveToClick(SCM_SR_Coding.Select_material1);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single5() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		SCM_SR_Coding.card.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(5000);
		moveToClick(SCM_SR_Coding.Select_material2);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single6() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		SCM_SR_Coding.card.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(5000);
		moveToClick(SCM_SR_Coding.Select_material3);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

	public static void card_Single7() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.card));
		SCM_SR_Coding.card.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.select_S_C));
		SCM_SR_Coding.select_S_C.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Job_group));
		SCM_SR_Coding.Job_group.click();
		SCM_SR_Coding.Search_bar.click();
		SCM_SR_Coding.Search_bar.sendKeys(ConfigFileReader.getSR_Job_Code());
		Thread.sleep(5000);
		moveToClick(SCM_SR_Coding.Select_material4);
		SCM_SR_Coding.move_material.click();
		SCM_SR_Coding.post.click();
		Thread.sleep(2000);

	}

//	Costpackage:

	public static void WBS_Costpackage() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_1));
		moveToClick(SCM_SR_Coding.CP_1);
//		System.out.println("Cost Package ="+SCM_SR_Coding.CP_1.getText());
		SCM_SR_Coding.WBS.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_1));
		moveToClick(SCM_SR_Coding.WBS_1);
//		System.out.println("WBS ="+SCM_SR_Coding.WBS_1.getText());

	}

	public static void WBS_Costpackage2() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_1));
		moveToClick(SCM_SR_Coding.CP_1);
		SCM_SR_Coding.WBS2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_2));
		moveToClick(SCM_SR_Coding.WBS_2);

	}

	public static void WBS_Costpackage3() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_1));
		moveToClick(SCM_SR_Coding.CP_1);
		SCM_SR_Coding.WBS3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_3));
		moveToClick(SCM_SR_Coding.WBS_3);

	}

	public static void WBS_Costpackage4() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_1));
		moveToClick(SCM_SR_Coding.CP_1);
		SCM_SR_Coding.WBS4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_4));
		moveToClick(SCM_SR_Coding.WBS_4);

	}

	public static void WBS_Costpackage5() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_1));
		moveToClick(SCM_SR_Coding.CP_1);
		SCM_SR_Coding.WBS.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_1));
		moveToClick(SCM_SR_Coding.WBS_1);

	}

	public static void WBS_Costpackage6() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_2));
		moveToClick(SCM_SR_Coding.CP_2);
		SCM_SR_Coding.WBS2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_2));
		moveToClick(SCM_SR_Coding.WBS_2);

	}

	public static void WBS_Costpackage7() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_3));
		moveToClick(SCM_SR_Coding.CP_3);
		SCM_SR_Coding.WBS3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_1));
		moveToClick(SCM_SR_Coding.WBS_3);

	}

	public static void WBS_Costpackage8() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Cost_package4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.CP_4));
		moveToClick(SCM_SR_Coding.CP_4);
		SCM_SR_Coding.WBS4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.WBS_3));
		moveToClick(SCM_SR_Coding.WBS_3);

	}
//  Qunatiy :

	public static void Quantiy_Rate() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy.sendKeys(ConfigFileReader.getSR_Quantiy1());
//		assertEquals("13", SCM_SR_Coding.Quantiy.getText());
//		System.out.println("Quantiy ="+SCM_SR_Coding.Quantiy.getText());
		SCM_SR_Coding.Rate.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate.sendKeys(ConfigFileReader.getSR_Rate());
//		assertEquals("1232.46", SCM_SR_Coding.Rate.getText());
//		System.out.println("Quantiy ="+SCM_SR_Coding.Rate.getText());
	}

	public static void Quantiy_Rate2() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy2.sendKeys(ConfigFileReader.getSR_Quantiy2());
		SCM_SR_Coding.Rate2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate2.sendKeys(ConfigFileReader.getSR_Rate1());
	}

	public static void Quantiy_Rate3() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy3.sendKeys(ConfigFileReader.getSR_Quantiy3());
		SCM_SR_Coding.Rate3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate3.sendKeys(ConfigFileReader.getSR_Rate1());
	}

	public static void Quantiy_Rate4() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy4.sendKeys(ConfigFileReader.getSR_Quantiy1());
		SCM_SR_Coding.Rate4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate4.sendKeys(ConfigFileReader.getSR_Rate2());
	}

//	
	public static void Quantiy_Rate5() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy.sendKeys(ConfigFileReader.getSR_Quantiy2());
		SCM_SR_Coding.Rate.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate.sendKeys(ConfigFileReader.getSR_Rate());
	}

	public static void Quantiy_Rate6() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy2.sendKeys(ConfigFileReader.getSR_Quantiy3());
		SCM_SR_Coding.Rate2.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate2.sendKeys(ConfigFileReader.getSR_Rate());
	}

	public static void Quantiy_Rate7() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy3.sendKeys(ConfigFileReader.getSR_Quantiy1());
		SCM_SR_Coding.Rate3.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate3.sendKeys(ConfigFileReader.getSR_Rate());
	}

	public static void Quantiy_Rate8() {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_SR_Coding.Quantiy4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Quantiy));
		SCM_SR_Coding.Quantiy4.sendKeys(ConfigFileReader.getSR_Quantiy3());
		SCM_SR_Coding.Rate4.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate4.sendKeys(ConfigFileReader.getSR_Rate());
	}

//  Submit:	
	public static void submit() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.submit));
		try {
			SCM_SR_Coding.submit.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.submit);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.ok_button));
		Thread.sleep(1000);
		SCM_SR_Coding.ok_button.click();
		Thread.sleep(3000);
		System.out.println("Successfully Created");
		
			
		
	}

//  Signout :

	public static void SignOut() throws InterruptedException {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(5000);
		try {
			SCM_SR_Coding.Sign_Out_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Sign_Out_Icon);
		}
		try {
			SCM_SR_Coding.Sign_Out.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Sign_Out);
		}
	}

//	Inprogress Full Flow In Stright Case:
	public static void Inprogess() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		try {
			SCM_SR_Coding.Inprogress_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Inprogress_Icon);
		}
		movetoElemt(SCM_SR_Coding.Mouse_Over);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Edit_Icon);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Cancel_Icon);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Recall_Icon);
		Thread.sleep(2000);
	}
	
	public static void Click_Cancel() throws Throwable {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		moveToClick(SCM_SR_Coding.Cancel_Icon);
		SCM_SR_Coding.Remark_Cancel.sendKeys(ConfigFileReader.gettest_Pass_Reject());
		try {
//			SCM_SR_Coding.yes_Click.click();
			SCM_SR_Coding.No_Click.click();
		} catch (Exception e) {
			SCM_SR_Coding.No_Click.click();
		}
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.ALL_Button));
		try {
			SCM_SR_Coding.ALL_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.ALL_Button);
		}
		Thread.sleep(2000);
			
	}
	public static void Recall_Material() throws Throwable {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		try {
			SCM_SR_Coding.Inprogress_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Inprogress_Icon);
		}
		moveToClick(SCM_SR_Coding.Recall_Icon);
		SCM_SR_Coding.Remark_Cancel.sendKeys(ConfigFileReader.gettest_Pass_Reject());
		try {
//			SCM_SR_Coding.yes_Click.click();
			SCM_SR_Coding.No_Click.click();
		} catch (Exception e) {
			SCM_SR_Coding.No_Click.click();
		}	
	}
	
	public static void Foraction_Move() throws InterruptedException {
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		try {
			SCM_SR_Coding.ForAction_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.ForAction_Button);
		}
		
		movetoElemt(SCM_SR_Coding.Mouse_Over);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Edit_Button);
		
		
		
	}
	
	public static void Edit_Material() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.empty_place1));
		try {
			SCM_SR_Coding.empty_place1.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.empty_place1);
		}
		SCM_SR_Coding.Rate.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Rate));
		SCM_SR_Coding.Rate.sendKeys(ConfigFileReader.getSR_Rate1());
	
	}
	
	public static void Reject_Material() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		movetoElemt(SCM_SR_Coding.Mouse_Over);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Edit_Button);
	}

	
	public static void WorkFlow_Trace() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Mouse_Over);
		Thread.sleep(2000);
		moveToClick(SCM_SR_Coding.WorkFlow_Trace_Icon);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Workflow_Approver_Name);
		Thread.sleep(2000);
		try {
			SCM_SR_Coding.empty_place.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.empty_place);
		}
	}
	

	public static void All_Tab_Checking() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Approver_Button));
		SCM_SR_Coding.empty_place.click();
		try {
			SCM_SR_Coding.Approver_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Approver_Button);
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Reject_Button));
		try {
			SCM_SR_Coding.Reject_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Reject_Button);
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.ALL_Button));
		try {
			SCM_SR_Coding.ALL_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.ALL_Button);
		}
		Thread.sleep(2000);

	}

//	Approver FullFlow:

	public static void Approver_login() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		try {
			SCM_SR_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Login_otherUser);
		}
		SCM_SR_Coding.Login_Username.sendKeys(ConfigFileReader.get_Approver_username());
		SCM_SR_Coding.Login_Password.sendKeys(ConfigFileReader.get_Approver_password());
		SCM_SR_Coding.Login_loginSubmit.click();
	}

	public static void Approver() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		movetoElemt(SCM_SR_Coding.Hold_Icon);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Reject_Icon);
		Thread.sleep(2000);
		movetoElemt(SCM_SR_Coding.Approver_Icon);

//		
		Thread.sleep(2000);
		try {
			SCM_SR_Coding.Radio_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Radio_Icon);
		}
		Thread.sleep(2000);
		try {
			SCM_SR_Coding.Approver_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Approver_Icon);
		}
		Thread.sleep(2000);
		SCM_SR_Coding.Remark_Approver.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Remark_Approver));
		try {
			SCM_SR_Coding.Remark_Approver.sendKeys(ConfigFileReader.gettest_Pass_Reject());
		} catch (Exception e) {
			javascriptsendkey(SCM_SR_Coding.Remark_Approver);
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.No_Click));
		try {
			SCM_SR_Coding.yes_Click.click();
//			SCM_SR_Coding.No_Click.click();
		} catch (Exception e) {
			SCM_SR_Coding.No_Click.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Mouse_over_Approve));
		moveToClick(SCM_SR_Coding.Mouse_over_Approve);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.ok_button));
		SCM_SR_Coding.ok_button.click();
		System.out.println("Successfully Approved");
//		Thread.sleep(1000);
//		DatabaseConnection.EnterSRFromDB();

//		

//		Thread.sleep(2000);
//		SCM_SR_Coding.Radio_Icon.click();
//		try {
//			SCM_SR_Coding.Radio_Icon.click();
//		} catch (Exception e) {
//			toclick(SCM_SR_Coding.Radio_Icon);
//		}
//		Thread.sleep(2000);
//		try {
//			SCM_SR_Coding.Hold_Icon.click();
//		} catch (Exception e) {
//			toclick(SCM_SR_Coding.Hold_Icon);
//		}
//		SCM_SR_Coding.Remark_Approver.click();
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Remark_Approver));
//		try {
//			SCM_SR_Coding.Remark_Approver.sendKeys(ConfigFileReader.getReject_Text());
//		} catch (Exception e) {
//			javascriptsendkey(SCM_SR_Coding.Remark_Approver);
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.No_Click));
//		SCM_SR_Coding.No_Click.click();
//		Thread.sleep(2000);
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Recall_Icon));
//		try {
//			SCM_SR_Coding.Radio_Icon.click();
//		} catch (Exception e) {
//			toclick(SCM_SR_Coding.Radio_Icon);
//		}
		try {
			SCM_SR_Coding.Radio_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Radio_Icon);
		}
		try {
			SCM_SR_Coding.Reject_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Reject_Icon);
		}
		SCM_SR_Coding.Remark_Approver.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Remark_Approver));
		Thread.sleep(2000);
		SCM_SR_Coding.Remark_Approver.sendKeys(ConfigFileReader.getReject_Text());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.yes_Click));
		try {
//			SCM_SR_Coding.yes_Click.click();
			SCM_SR_Coding.No_Click.click();
		} catch (Exception e) {
			SCM_SR_Coding.No_Click.click();
		}
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.ok_button));
//		SCM_SR_Coding.ok_button.click();
	}

	public static void All_Tab_Checking_Approver() throws Throwable {

		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Inprogress_Icon));
		try {
			SCM_SR_Coding.Inprogress_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Inprogress_Icon);
		}
		Thread.sleep(4000);
		try {
			SCM_SR_Coding.Approver_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Approver_Button);
		}
		Thread.sleep(4000);
		try {
			SCM_SR_Coding.Reject_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Reject_Button);
		}

		Thread.sleep(4000);
		try {
			SCM_SR_Coding.Hold_Button.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Hold_Button);
		}
		Thread.sleep(4000);
		
		try {
			SCM_SR_Coding.ALL_Icon.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.ALL_Icon);
		}
		Thread.sleep(4000);

	}
	
//	Document And Process:
	public static void Document_view() throws Throwable {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		
		moveToClick(SCM_SR_Coding.Mouse_Over);
		Thread.sleep(2500);
		try {
			SCM_SR_Coding.Document_Name.click();
		} catch (Exception e) {
			moveToClick(SCM_SR_Coding.Document_Name);
		}
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_SR_Coding.Document_Close_pop));
		try {
			SCM_SR_Coding.Document_Close_pop.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Document_Close_pop);
		}
		
	}
	
	public static void Process_flow() throws InterruptedException {
		
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		
		try {
			SCM_SR_Coding.Document_Request_No.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Document_Request_No);
		}
		Thread.sleep(5000);
		try {
			SCM_SR_Coding.Document_move.click();
		} catch (Exception e) {
			toclick(SCM_SR_Coding.Document_move);
		}
		
	}

}
