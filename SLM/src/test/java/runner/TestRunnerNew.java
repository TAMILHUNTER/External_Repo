package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		
		plugin = { "pretty",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:src/reports/cucumber-reports/reports/"
						// "com.cucumber.listener.ExtentCucumberFormattetr:target/cucumber-reports/reports/"
						// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/reports/"
	 					+ "" + "SLM AUTOMATION TEST REPORT" + ".html" },
		features = "src\\test\\resources\\featurefile", 
						glue = {"stepdefinition" }, 
						monochrome = true,
						dryRun = false,
					tags = {"@RegressionTesting"})
						
public class TestRunnerNew {
	 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	@AfterClass
	public static void writeExtentReport() {	
		Reporter.loadXMLConfig(new File("src\\main\\resources\\reports\\extent-config.xml"));
		Reporter.setSystemInfo("Tester Name : ", "Praveenkumar Raj");
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}	
}










