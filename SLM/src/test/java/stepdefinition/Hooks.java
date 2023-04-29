package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProviders.ConfigFileReader;
import object_repository.Locators.CommonControlObject;

public class Hooks {

	public static ConfigFileReader configFileReader;
	public static ErrorCollector collector;
	public Hooks() {
		Webdriver.driver();
		PageFactory.initElements(Webdriver.driver, CommonControlObject.class);
	}
	@Rule
	public static void errorCollector(Throwable e) {
		 collector = new ErrorCollector();
		 collector.addError(e);
	} 
	@Before
	public void beforeScenario(Scenario scenario) {
		String ScenarioName = scenario.getName();
		System.out.println(ScenarioName + ": Testing Started");
	}

	@After
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		String fileName = scenario.getName();
		if (scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Fail() + "_" + fileName + "_" + timestamp + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			Reporter.addScreenCaptureFromPath(DestFile.toString());
			System.out.println("Screenshot for Failed - captured");
		}
 
		if (scenario.getStatus() == "passed") {
			System.out.println(scenario.getStatus());
			TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Pass() + "_" + fileName + "_" + timestamp + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			System.out.println("Screenshot for Pass - captured");
		}
		String ScenarioName = scenario.getName();
		System.out.println("Scenario " + ScenarioName + " : Testing Ended");
		System.out.println("Scenario " + ScenarioName + " : Test Status " + scenario.getStatus());
		WebDriverWait wait=new WebDriverWait(Webdriver.driver, 10000);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.profileIcon));
		if (CommonControlObject.profileIcon.isEnabled()) {
			try {
				CommonControlObject.profileIcon.click();
			} catch (Exception e) {
				((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", CommonControlObject.profileIcon);		
			}
		} else {
System.out.println("ProfileIcon not displayed");
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.signOut));
		if (CommonControlObject.signOut.isEnabled()) {
			try {
				CommonControlObject.signOut.click();
			} catch (Exception e) {
				((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", CommonControlObject.signOut);		
			}
		} else {
System.out.println("signOut not displayed");
		}
		Webdriver.driver.close();
		System.out.println("driver Closed");
	}
}