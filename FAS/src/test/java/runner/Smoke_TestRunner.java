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
						+ "Smoke_FAS_Automation_Test_Report_" + ".html" },

		features = "src\\test\\resources\\featurefile", glue = { "stepdefinition" }, monochrome = true, tags = {
		
				// Feature : Tamil				
				  "@Induction_Create_Basic_Details ,"
			 	+ "@Induction_SkillAnalysis ,"
				+ "@Induction_Paramedics,"
				+ "@Induction_MedicalTest,"
				+ "@Induction_EHS,"
				+ "@Induction_Dashboard_View_Workman_Profile,"
				+ "@Induction_Workman_Search,"			
//Feature : Basha					
				+ "@Induction_Workman_Profile_Basic_details,"
				+ "@Induction_Workman_Profile_Skill_Analysis,"
				+ "@Induction_Workman_Profile_Medical_test,"
				+ "@Induction_Workman_Profile_EHS, "
				+ "@Induction_Workman_Profile_Wage"
				
//Feature : Sneha					
				+ "@Induction_Workman_Profile_Basic_details,"
				+ "@Induction_Workman_Profile_Skill_Analysis,"

//Feature : Praveen					
				+ "@Induction_Workman_Profile_Basic_details,"
				+ "@Induction_Workman_Profile_Skill_Analysis,"	

				})

public class Smoke_TestRunner {
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
