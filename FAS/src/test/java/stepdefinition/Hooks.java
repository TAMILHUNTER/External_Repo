package stepdefinition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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

	// test

	@Before
	public void beforeScenario(Scenario scenario) throws FileNotFoundException {

//		String timestamp2 = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());	
//		System.setOut(new PrintStream(new FileOutputStream(System.getProperty("user.dir") + ConfigFileReader.getLoggerPath() + "Logger" + "_" + timestamp2 + ".txt")));
		String Author = System.getProperty("user.name");
		Reporter.assignAuthor(Author);
		//Reporter.assignAuthor("Tamil");
		String ScenarioName = scenario.getName();
		System.out.println("==================================================================");
		System.out.println(ScenarioName + " Scenario : Testing Started");
		System.out.println("==================================================================");
		System.out.println("Tested By : " + Author );
		System.out.println("==================================================================");

	}
	

	@After
	public void afterScenario(Scenario scenario) throws IOException {

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		String fileName = scenario.getName();
		
		if (scenario.isFailed()) {
			
			TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Fail() 
					+ fileName + "_" + timestamp + ".png");
			// File DestFile = new File(ConfigFileReader.getScreenshotPath_Fail() + "_" +
			// fileName + "_" + timestamp + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			Reporter.addScreenCaptureFromPath(DestFile.toString());
			String ScenarioName = scenario.getName();
			System.out.println("====================================================================================================================================");
			System.out.println(ScenarioName + " - Scenario : Testing Completed" );
			System.out.println("====================================================================================================================================");
			System.out.println(ScenarioName + " - Testing Status : " + scenario.getStatus());
			System.out.println("====================================================================================================================================");
			System.out.println(scenario.getStatus() + " - Screenshot for - " + ScenarioName + " : Scenario is captured");
			System.out.println("====================================================================================================================================");
		}

		if (scenario.getStatus() == "passed") {
			
			TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Pass() 
					+ fileName + "_" + timestamp + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			// Add screenshot to report for Pass Scenario
			// Reporter.addScreenCaptureFromPath(DestFile.toString());
			String ScenarioName = scenario.getName();
			System.out.println("====================================================================================================================================");
			System.out.println(ScenarioName + " Scenario : Testing Completed" );
			System.out.println("====================================================================================================================================");
			System.out.println(ScenarioName + " Testing Status : " + scenario.getStatus());
			System.out.println("====================================================================================================================================");
			System.out.println(scenario.getStatus() + " Screenshot for " + ScenarioName + " Scenario is captured");
			System.out.println("====================================================================================================================================");
		}
		Webdriver.driver.quit();
	}

}