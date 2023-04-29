package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProviders.ConfigFileReader;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:src/reports/cucumber-reports/reports/"
				// plugin =
				// {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reports/"
				+ "" + "Automation Test Report_" + ".html" }, features = "src\\test\\resources\\featurefile", 
						glue = {"stepdefinition" }, monochrome = true, dryRun = false,
					
						tags = { "@Menus" })

public class TestRunnerNew {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
		Reporter.setSystemInfo("Tester Name : ", "Praveenkumar Raj");
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}
