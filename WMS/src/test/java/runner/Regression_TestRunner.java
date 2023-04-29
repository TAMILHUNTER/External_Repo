//package runner;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.junit.AfterClass;
//import org.junit.runner.RunWith;
//import com.vimalselvam.cucumber.listener.Reporter;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import dataProviders.ConfigFileReader;
//
//@RunWith(Cucumber.class)
//
//@CucumberOptions(
//
//		plugin = { "pretty",
//				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:src/reports/cucumber-reports/reports/"
//						// "com.cucumber.listener.ExtentCucumberFormattetr:target/cucumber-reports/reports/"
//						// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/reports/"
//						+ "Regression_WMS_Automation_Test_Report_" + ".html" },
//
//		features = "src\\test\\resources\\featurefile", glue = { "stepdefinition" }, monochrome = true, tags = {
//		
//// Feature : Induction				
//				
//				// Feature : Induction				
//												  "@Induction_Create_Basic_Details ,"
//												+ "@Induction_Edit_Basic_Details ,"
////												+ "@Induction_Basic_Details_Partner_Validations_Create ,"
////												+ "@Induction_Basic_Details_Personal_Validations_Create ,"
////												+ "@Induction_Basic_Details_Communication_Validations_Create ,"
////												+ "@Induction_Basic_Details_Skill_Validations_Create ,"
////												+ "@Induction_Basic_Details_Deployment_Validations_Create ,"
////												+ "@Induction_Basic_Details_Education_Validations_Create ,"
////												+ "@Induction_Basic_Details_Experience_Validations_Create ,"
////												+ "@Induction_Basic_Details_Statutory_Validations_Create ,"
////												+ "@Induction_Basic_Details_Bank_Validations_Create ,"
//											 	+ "@Induction_SkillAnalysis_Create ,"
////											 	+ "@@Induction_SkillAnalysis_Validation ,"
//												+ "@Induction_Paramedics,"
////												+ "@Induction_Paramedics_Validation,"
//												+ "@Induction_MedicalTest,"
////												+ "@Induction_MedicalTest_Verification,"
//												+ "@Induction_EHS,"
////												+ "@Induction_EHS_Validation,"
//												+ "@Induction_Wage,"
////												+ "@Induction_Wage_Validation,"
//												+ "@Induction_Final_Approval"
//												+ "@Induction_Dashboard_View_Workman_Profile,"
////												+ "@Induction_Dashboard_search_workmen_Verification,"
//												+ "@Induction_Workman_Search,"	
//												//+ "@Induction_Job_Switch,"	
//												//+ "@Induction_Job_Switch_Verification,"	
//												
//					
//				 //Feature : Workforce Allocation					
//				 
//												+ "@Workforce_Allocation_Workman_Search,"
//												+ "@Workforce_Allocation_Workman_Profile_Basic_details,"
//												+ "@Workforce_Allocation_Workman_Profile_Skill_Analysis,"
//												+ "@Workforce_Allocation_Workman_Profile_Medical_test,"
//												+ "@Workforce_Allocation_Workman_Profile_EHS, "
//												+ "@Workforce_Allocation_Workman_Profile_Wage"
//												
//				//Feature : On-Boarding & Attendance
//												+ "@GatePass,"
////												+ "@Gate_Pass_Status_update_Validation,"
//												+ "@Daily_Attendance,"
////												+ "@Daily_Attendance_Validation,"
//												+ "@Attendance_Summery"
//												
//				 //Feature : Change Requests					
//				 
//												+ "@DLR"
//											//	+ "@Camp_Management"
//													
//
//								
//
//				})
//
//public class Regression_TestRunner {
//	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//
//	@AfterClass
//	public static void writeExtentReport() {
//
//		Reporter.loadXMLConfig(new File(ConfigFileReader.getReportConfigPath()));
//		Reporter.setSystemInfo("User Name", System.getProperty("TAMIL"));
//		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
//		Reporter.setSystemInfo("Java Version", "1.8.0_151");
//
//	}
//
//}
