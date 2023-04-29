package runner;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\test\\resources\\featurefile" }, 
		glue = {"stepdefinition" }, 
		monochrome = true, 
		publish = true, 
		tags = 
		
										  "@Induction_Create_Basic_Details"
								+ "@Induction_Edit_Basic_Details"
								+ "@Induction_Basic_Details_Partner_Validations_Create"
								+ "@Induction_Basic_Details_Personal_Validations_Create"
								+ "@Induction_Basic_Details_Communication_Validations_Create"
								+ "@Induction_Basic_Details_Skill_Validations_Create"
								+ "@Induction_Basic_Details_Deployment_Validations_Create"
//								+ "@Induction_Basic_Details_Education_Validations_Create"        #Issue Reported
								+ "@Induction_Basic_Details_Experience_Validations_Create"
								+ "@Induction_Basic_Details_Statutory_Validations_Create"
								+ "@Induction_Basic_Details_Bank_Validations_Create"
							 	+ "@Induction_SkillAnalysis_Create"
							 	+ "@Induction_SkillAnalysis_Validation"
								+ "@Induction_Paramedics"
								+ "@Induction_Paramedics_Validation"
								+ "@Induction_MedicalTest"
								+ "@Induction_MedicalTest_Verification"
								+ "@Induction_EHS"
								+ "@Induction_EHS_Validation"
								+ "@Induction_Wage"
								+ "@Induction_Wage_Validation"
								+ "@Induction_Final_Approval"
								+ "@Induction_Dashboard_View_Workman_Profile"
								+ "@Induction_Dashboard_search_workmen_Verification"
								+ "@Induction_Workman_Search"	
								+ "@Induction_Job_Switch"	
								+ "@Induction_Job_Switch_Verification"	
								
	
 //Feature : Workforce Allocation					
 
								+ "@Workforce_Allocation_Workman_Search"
								+ "@Workforce_Allocation_Workman_Profile_Basic_details"
								+ "@Workforce_Allocation_Workman_Profile_Skill_Analysis"
								+ "@Workforce_Allocation_Workman_Profile_Medical_test"
								+ "@Workforce_Allocation_Workman_Profile_EHS"
								+ "@Workforce_Allocation_Workman_Profile_Wage"
								
//Feature : On-Boarding & Attendance
								+ "@GatePass"
								+ "@Gate_Pass_Status_update_Validation"
								+ "@Daily_Attendance"
								+ "@Daily_Attendance_Validation"
								+ "@Attendance_Summery"
								
 //Feature : Change Requests					
 
								+ "@DLR"
							//	+ "@Camp_Management"
		

		
,
		plugin = { "pretty", 
				"html:src/reports/Junit-Cucumber/cucumber.html",
				"json:src/reports/Junit-Cucumber/cucumber.json", 
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

		})
public class E2E_TestRunner {

	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	@AfterClass
	public static void writeExtentReport() throws IOException {

		
	}

}
