package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import utils.DriverFactory;
import java.time.Duration;

public class kendo_Calender_Robot {

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	public static void kendo_calender_DOB() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		ObjectsReporsitory.Kendo_DateField.click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_HOME);
		Thread.sleep(2000);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month());
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year_V8());
		Thread.sleep(2000);
	}

	public static void kendo_Calender_action_DOB() throws InterruptedException, AWTException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Kendo_DateField));
		ObjectsReporsitory.Kendo_DateField.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year_V13());
		Thread.sleep(2000);

	}

	public static void kendo_Calender_action_DOB_Today() throws InterruptedException, AWTException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Kendo_Calender_DOB));
		ObjectsReporsitory.Kendo_Calender_DOB.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Kendo_Calender_DOB_Today));
		ObjectsReporsitory.Kendo_Calender_DOB_Today.click();
	}

	public static void kendo_Calender_action_DOB_more_then_Statudary_norms() throws InterruptedException, AWTException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Kendo_DateField));
		ObjectsReporsitory.Kendo_DateField.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_MoreYear());
		Thread.sleep(2000);
	}

	public static void kendo_calender_DOB_update() throws InterruptedException, AWTException {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Kendo_DateField));
		ObjectsReporsitory.Kendo_DateField.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month_update());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year_update());
		Thread.sleep(2000);

	}

	public static void kendo_calender_Skill_Release_Date() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		ObjectsReporsitory.Kendo_DateField.click();
		robot.keyPress(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_HOME);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month_update());
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year_update());
	}

}
