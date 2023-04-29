package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import dataProviders.ConfigFileReader;

public class Screenshot {

	public static ConfigFileReader configFileReader;

	public Screenshot() {
		Webdriver.driver();
	}
	
	public static void Screenshotforscenario () throws IOException {
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		
		TakesScreenshot scrShot = ((TakesScreenshot) Webdriver.driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir") + ConfigFileReader.getScreenshotPath_Scenario() + "_" + timestamp + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("Screenshot Captured");
		System.out.println("-------------------");

	}
}