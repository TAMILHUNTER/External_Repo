package runner.Basha;

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
						// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/reports/"
						+  "WorkingSuite_FAS_Automation_Test_Report_"+ ".html" 
				 },

		features = { "src\\test\\resources\\featurefile" }, 
		glue = { "stepdefinition" }, 
		monochrome = true, 
		tags = {""
				+ "@Verify_the_user_able_to_Edit_the_job_order_in_job_order_master_page"
				}
		
		)

public class Basha_WorkingSuite {
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());


	
	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("Basha"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Environment", "QA");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}


}
