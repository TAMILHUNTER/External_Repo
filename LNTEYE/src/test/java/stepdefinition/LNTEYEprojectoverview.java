package stepdefinition;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.LNTEYE_DB_Query;
import object_repository.LNTEYE_Objects;

public class LNTEYEprojectoverview extends LNTEYE_Objects {

	public static String OCV1, TableValue, PageValue, RCV, Orginal_Cost, Revised_Estimate, Costs, Cost_As_On_dt,
			Invoice, Outstandingproject, Sales_Over_Invoiceproject, Net_Working_Capitalproject, Time_Completionproject,
			Cost_Completionproject, Invoice_Completionproject, Projected_End_Marginproject, ACE_GMproject,
			JCR_GMproject, project_Revised_Estimateproject, JCR_RCVproject, Actual_Start_Dateproject,
			Contractual_End_Dateproject, Expected_End_Dateproject;

	public LNTEYEprojectoverview() {

		PageFactory.initElements(Webdriver.driver, LNTEYE_Objects.class);

	}

	@Given("^Login to LNTEYE$")
	public void login_to_LNTEYE() throws Throwable {

		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get("https://qa.lnteye.com/LNTEYEUI/home");
		Webdriver.driver.manage().timeouts().implicitlyWait(600, TimeUnit.MINUTES);
		Click(LoginBtn);
		Input(User, "sivask@lntecc.com");
		Click(Next);
		Input(Pass, "test123");
		Click(Signin);
		Thread.sleep(2000);
		try {
			Click(Project);

		} catch (Exception e) {
			
			Click(OK);
			Click(Project);
		}

	}

	@Then("^Go to Project overview page for QAR Job$")
	public void go_to_Project_overview_page_for_QAR_Job() throws Throwable {
		
		Click(Construction);
		Click(ProjectGo);
		Thread.sleep(5000);
		Click(ProjectCode);
		Input(ProjectCode, QARJobCode());
		Click(SelectJob);
		Click(GoProject);
		Click(OverallProject);
	}

	@Then("^Go to Project overview page for INR Job$")
	public void go_to_Project_overview_page_for_INR_Job() throws Throwable {
		
		Click(Construction);
		Click(ProjectGo);
		Thread.sleep(5000);
		Click(ProjectCode);
		Input(ProjectCode, JobCode());
		Click(SelectJob);
		Click(GoProject);
		Click(OverallProject);
		Thread.sleep(10000);
	}

	@Then("^Compare both table and page values of OCV$")
	public void compare_both_table_and_page_values_of_OCV() throws Throwable {
		OCV1 = GetText(OCV_Value);
		PageValue = OCV1.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 3);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of RCV$")
	public void compare_both_table_and_page_values_of_RCV() throws Throwable {
		RCV = GetText(RCV_Value);
		PageValue = RCV.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 4);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}

	}

	@Then("^Compare both table and page values of Orginal_Cost$")
	public void compare_both_table_and_page_values_of_Orginal_Cost() throws Throwable {
		Orginal_Cost = GetText(Orginal_Costs);
		PageValue = Orginal_Cost.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 11);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}

	}

	@Then("^Compare both table and page values of Revised_Estimate$")
	public void compare_both_table_and_page_values_of_Revised_Estimate() throws Throwable {
		Revised_Estimate = GetText(Revised_Estimates);
		PageValue = Revised_Estimate.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 17);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}

	}

	@Then("^Compare both table and page values of Cost$")
	public void compare_both_table_and_page_values_of_Cost() throws Throwable {
		Costs = GetText(Cost);
		PageValue = Costs.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 18);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}

	}

	@Then("^Compare both table and page values of Cost_As_On_Date$")
	public void compare_both_table_and_page_values_of_Cost_As_On_Date() throws Throwable {
		Cost_As_On_dt = GetText(Cost_As_On_Date);
		PageValue = Cost_As_On_dt.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 19);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}

	}

	@Then("^Compare both table and page values of Invoiced$")
	public void compare_both_table_and_page_values_of_Invoiced() throws Throwable {
		Invoice = GetText(Invoiced);
		PageValue = Invoice.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 20);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}

	}

	@Then("^Compare both table and page values of Outstanding$")
	public void compare_both_table_and_page_values_of_Outstanding() throws Throwable {
		Outstandingproject = GetText(Outstanding);
		PageValue = Outstandingproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 16);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Sales_Over_Invoice$")
	public void compare_both_table_and_page_values_of_Sales_Over_Invoice() throws Throwable {
		Sales_Over_Invoiceproject = GetText(Sales_Over_Invoice);
		PageValue = Sales_Over_Invoiceproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 15);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Net_Working_Capital$")
	public void compare_both_table_and_page_values_of_Net_Working_Capital() throws Throwable {
		Net_Working_Capitalproject = GetText(Net_Working_Capital);
		PageValue = Net_Working_Capitalproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 21);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Time_Completion$")
	public void compare_both_table_and_page_values_of_Time_Completion() throws Throwable {
		Time_Completionproject = GetText(Time_Completion);
		PageValue = Time_Completionproject.replace(" %", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 14);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Cost_Completion$")
	public void compare_both_table_and_page_values_of_Cost_Completion() throws Throwable {

		Cost_Completionproject = GetText(Cost_Completion);
		PageValue = Cost_Completionproject.replace(" %", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 22);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Invoice_Completion$")
	public void compare_both_table_and_page_values_of_Invoice_Completion() throws Throwable {
		Invoice_Completionproject = GetText(Invoice_Completion);
		PageValue = Invoice_Completionproject.replace(" %", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 23);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Projected_End_Margin$")
	public void compare_both_table_and_page_values_of_Projected_End_Margin() throws Throwable {
		Projected_End_Marginproject = GetText(Projected_End_Margin);
		PageValue = Projected_End_Marginproject.replace(" %", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 24);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of ACE_GM$")
	public void compare_both_table_and_page_values_of_ACE_GM() throws Throwable {
		ACE_GMproject = GetText(ACE_GM);
		PageValue = ACE_GMproject.replace(" %", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 7);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of JCR_GM$")
	public void compare_both_table_and_page_values_of_JCR_GM() throws Throwable {
		JCR_GMproject = GetText(JCR_GM);
		PageValue = JCR_GMproject.replace(" %", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 28);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of project_Revised_Estimate$")
	public void compare_both_table_and_page_values_of_project_Revised_Estimate() throws Throwable {
		project_Revised_Estimateproject = GetText(project_Revised_Estimate);
		PageValue = project_Revised_Estimateproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 17);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of JCR_RCV$")
	public void compare_both_table_and_page_values_of_JCR_RCV() throws Throwable {
		JCR_RCVproject = GetText(JCR_RCV);
		PageValue = JCR_RCVproject.replace(",", "");
		Print("PageValue: " + PageValue);
		String OCV = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 28);
		Double d = Double.valueOf(OCV);
		DecimalFormat df = new DecimalFormat("0.00");
		TableValue = df.format(d);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Actual_Start_Date$")
	public void compare_both_table_and_page_values_of_Actual_Start_Date() throws Throwable {
		Actual_Start_Dateproject = GetText(Actual_Start_Date);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.parse(Actual_Start_Dateproject, format);
		String PageValue = date.toString();
		Print("PageValue: " + PageValue);
		String TableValue = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 8);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Contractual_End_Date$")
	public void compare_both_table_and_page_values_of_Contractual_End_Date() throws Throwable {
		Contractual_End_Dateproject = GetText(Contractual_End_Date);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.parse(Contractual_End_Dateproject, format);
		String PageValue = date.toString();
		Print("PageValue: " + PageValue);
		String TableValue = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 9);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Compare both table and page values of Expected_End_Date$")
	public void compare_both_table_and_page_values_of_Expected_End_Date() throws Throwable {

		Expected_End_Dateproject = GetText(Expected_End_Date);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.parse(Expected_End_Dateproject, format);
		String PageValue = date.toString();
		Print("PageValue: " + PageValue);
		String TableValue = Get_Table_Data(LNTEYE_DB_Query.LNTEYEDBQurey(JobCode()), 10);
		Print("TableValue: " + TableValue);
		if (PageValue.equals(TableValue)) {
			Print("Values are Matching");
		} else {
			Print("Values mismatching");
		}
	}

	@Then("^Logout from LNTEYE$")
	public void logout_from_LNTEYE() throws Throwable {
		Scroll_Up(profile);
		Click(profile);
		Thread.sleep(2000);
		Click(logout);
	}
}
