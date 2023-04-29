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

		plugin = { "pretty",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:src/reports/cucumber-reports/reports/"
						// "com.cucumber.listener.ExtentCucumberFormattetr:target/cucumber-reports/reports/"
						// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/reports/"
						+ "E2E_FAS_Automation_Test_Report_" + ".html" },

		features = "src\\test\\resources\\featurefile", glue = { "stepdefinition" }, monochrome = true, tags = {

// Feature : Tamil				
						"@Invoice_Registration_For_Action_Create ,"

//Feature : Basha					
						+ "@Job_Order_Master,"

//Feature : Sneha					
						+ "@FIN_Validation," 
						+ "@Navigation,"

//Feature : Praveen					
						+ "@Payment_Hold_Release_For_Action_Create,"

		})

public class E2E_TestRunner {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("TAMIL"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}

}
