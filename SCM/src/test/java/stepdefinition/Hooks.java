package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProviders.ConfigFileReader;

public class Hooks {

	public static ConfigFileReader configFileReader;

	public Hooks() {
		Webdriver.driver();
	}
	

	@Before
	public void beforeScenario(Scenario scenario) {
		String ScenarioName = scenario.getName();
		System.out.println(ScenarioName + ": Testing Started");
	}

	@After
	public void afterScenario(Scenario scenario) throws Throwable {

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		String fileName = scenario.getName();

		if (scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(
					ConfigFileReader.getScreenshotPath_Fail() + "_" + fileName + "_" + timestamp + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			Reporter.addScreenCaptureFromPath(DestFile.toString());
			System.out.println("Screenshot for Failed - captured");
		}

		if (scenario.getStatus() == "passed") {

			System.out.println(scenario.getStatus());
			TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(
			ConfigFileReader.getScreenshotPath_Pass() + "_" + fileName + "_" + timestamp + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			System.out.println("Screenshot for Pass - captured");	
		}
		String ScenarioName = scenario.getName();
		System.out.println("*****Scenario - " + ScenarioName + " : Testing Ended" + " & Test Status : " + scenario.getStatus()+"*****");
		Webdriver.driver.close();
		System.out.println("==================================================================");
	}
}