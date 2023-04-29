package stepdefinition;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import helper.SeleniumHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import utils.MyScreenRecorder;

public class Hooks extends DriverFactory {

//	public static String testFailed=ITestResult.class.getName();

	@Before
	public void beforeScenario(Scenario scenario) throws Exception {

//		String timestamp2 = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
//		System.setOut(new PrintStream(new FileOutputStream(System.getProperty("user.dir") + ConfigFileReader.getLoggerPath() + "Logger" + "_" + timestamp2 + ".txt")));

		String Author = System.getProperty("user.name");
		String ScenarioName = scenario.getName();
		System.out.println(ScenarioName + ": Testing Started");
		System.out.println("==================================================================");
		System.out.println(ScenarioName + " : Scenario : Testing Started");
		System.out.println("==================================================================");
		System.out.println("Tested By : " + Author);
		System.out.println("==================================================================");

		driver = getWebdriver();
		wait = waitDriver();
		ObjectsReporsitory = PageFactory.initElements(driver, object_repository.ObjectsReporsitory.class);
		Skill_Analysis_Objects = PageFactory.initElements(driver, object_repository.Skill_Analysis_Objects.class);

		
//#############################################################################################################################################
		if (ConfigFileReader.getEnableHeadless().contains("False")) {
			if (ConfigFileReader.getEnableScreenRecording().contains("True")) {
				MyScreenRecorder.startRecording(scenario.getName());
				System.out.println("Recording Screen");
				System.out.println("===============================");
			}
		}
		else {
			System.out.println("Automation Test Running in Headless : ScreenRecording Will not be saved");
		}
//#############################################################################################################################################		
	}

	@SuppressWarnings("unlikely-arg-type")
	@After()
	public void tearDown(Scenario scenario) {

		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		String fileName = scenario.getName();
		try {
			if (driver != null) {
				if (scenario.isFailed()) {
					SeleniumHelper.captureScreenshot(scenario);
					// scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),
					// "image/png","Failed Screenshot");
					TakesScreenshot scrShot = ((TakesScreenshot) DriverFactory.driver);
					File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
					File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Fail()
							+ fileName + "_" + timestamp + ".png");
					FileUtils.copyFile(SrcFile, DestFile);

					String ScenarioName = scenario.getName();
					System.out.println("==================================================================");
					System.out.println(ScenarioName + " : Scenario : Testing Status : " + scenario.getStatus());
					System.out.println("==================================================================");
					System.out.println(
							scenario.getStatus() + " Screenshot for " + ScenarioName + " Scenario is captured");
					System.out.println("==================================================================");
				}
				if (scenario.getStatus().equals("passed")) {

					TakesScreenshot scrShot = ((TakesScreenshot) DriverFactory.driver);
					File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
					File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Pass()
							+ fileName + "_" + timestamp + ".png");
					FileUtils.copyFile(SrcFile, DestFile);

					String ScenarioName = scenario.getName();
					System.out.println("==================================================================");
					System.out.println(ScenarioName + " : Scenario : Testing Status : " + scenario.getStatus());
					System.out.println("==================================================================");
					System.out.println(
							scenario.getStatus() + " Screenshot for " + ScenarioName + " Scenario is captured");
					System.out.println("==================================================================");
				}

				driver.manage().deleteAllCookies();
				driver.quit();
//#############################################################################################################################################				
				if (ConfigFileReader.getEnableScreenRecording().contains("True")) {
					MyScreenRecorder.stopRecording();
					System.out.println("Screen Recording Stoped");
					System.out.println("===============================");
				}
//#############################################################################################################################################
			}
		} catch (Exception e) {
			System.out.println("Method failed: tearDown(), Exception " + e.getMessage());
		}
	}

}
