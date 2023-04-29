package stepdefinition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.BaseClass;
import object_repository.Login_Objects;

public class Login_Steps extends BaseClass {

	public Login_Steps() {

		PageFactory.initElements(Webdriver.driver, Login_Objects.class);

	}

	@Given("^Navigate to Test Enviroment$")
	public static void Login() throws InterruptedException {

		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(getEnvironment());
		}

	@Then("Click on Other User")
	public static void click_on_Other_User() throws Throwable {

		Click(Otheruser);

	}

	@Then("^Enter user name in AMS$")
	public static void enter_the_Username() throws Throwable {

		Input(Username, Username());
	}

	@Then("^Enter the Password in AMS$")
	public static void enter_the_Password() throws Throwable {

		Input(Password, Password());

	}

	@Then("^Click on Login$")
	public static void click_on_Login() throws Throwable {

		Click(Login);
	}

	@Then("^Click the Asset mgmt in menu$")
	public static void Click_the_Asset_mgmt_in_menu() throws Throwable {

		Click(ClickMenu);
		Click(AssetMgmt);
		Click(AMSo);

	}

	@Then("^Click the Operations and Maintenance in menu$")
	public static void Click_the_Operations_and_Maintenance_in_menu() throws Throwable {

		Click(OAM);
	}

	@Then("^Click the LogSheet in menu$")
	public static void Click_the_LogSheet_in_menu() throws Throwable {

		Click(LogSheet);
	}

	@Then("^Select the JobCode$")
	public static void Enter_the_JobCode_in_the_Job_selection() throws Throwable {

		InputTab(JobCode, JobCode());

	}

	@Then("^Select the owned Asset code$")
	public void select_the_owned_Asset_code() throws Throwable {
		Click(AssetCode);
		InputTab(AssetCode, OwnedAssetCode());

	}

	@Then("^Select the Hired Asset code$")
	public void select_the_Hired_Asset_code() throws Throwable {
		Click(AssetCode);
		InputTab(AssetCode, HiredAssetCode());
	}

	@Then("^Give the dutation$")
	public void give_the_dutation() throws Throwable {

		Input(Duration, Duration());

	}

	@Then("^Give Go$")
	public void give_Go() throws Throwable {

		Click(Go);
		Thread.sleep(3000);
	}

	@Then("^click refresh button$")
	public void click_refresh_button() throws Throwable {

		Click(Refresh);
	}

	@Then("^Click Create new LogSheet button$")
	public void click_Create_new_LogSheet_button() throws Throwable {

		Click(CreateNewLogsheet);
		Thread.sleep(13000);
	}

	@Then("^Move to TimeBased tab$")
	public void move_to_TimeBased_tab() throws Throwable {

		Click(TimeBased);
		Click(ConfirmationYes);
	}

	@Then("^Click Work entry$")
	public void click_Work_entry() throws Throwable {

		Click(Work);
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		Quit();
	}

	@Then("^enter Endmeter reading$")
	public void enter_Endmeter_reading() throws Throwable {

		String number = AddNumber(StartMeterReading, 5);
		Clear(EndMeterReading);
		Input(EndMeterReading, number);
	}

	@Then("^enter Start time$")
	public void enter_Start_time() throws Throwable {

		Click(StartTime);
		Input(StartTime, "2");
		Thread.sleep(5000);
	}

	@Then("^Enter End time$")
	public void enter_End_time() throws Throwable {

		Click(EndTime);
		Input(EndTime, "7");
	}

	@Then("^Click action Save button$")
	public void click_action_Save_button() throws Throwable {
		Thread.sleep(5000);
		Click(ActionSave);
	}

	@Then("^Enter production Quantity$")
	public void enter_production_Quantity() throws Throwable {
		Thread.sleep(5000);
	
		Click(ProductionQty);

		Clear(ProductionQty);

		Thread.sleep(5000);
		InputTab(ProductionQty, "10");
	
	}

	@Then("^Click breakdown hyperlink button$")
	public void click_breakdown_hyperlink_button() throws Throwable {

		Click(BreakDownBtn);
		Thread.sleep(2000);
	}

	@Then("^Select breakdown type$")
	public void select_breakdown_type() throws Throwable {
		
		Click(BreakdownTypeClear);
		
		InputTab(BreakDownType, BreakDownType());
		
		Tab();

	}

	@Then("^Give breakdown from Date$")
	public void give_breakdown_from_Date() throws Throwable {

		kendo_calender(BreakdownFromDateCalender, BreakdownFromDate());
	}

	@Then("^Give Breakdown time$")
	public void give_Breakdown_time() throws Throwable {
//		Thread.sleep(5000);
//		Click(BreakdownFromTime);
//		Print(3);
//		Click(SelectBreakdownFromTime);
//		Print(4);
	}

	@Then("^Give Nature of Defects$")
	public void give_Nature_of_Defects() throws Throwable {

		InputTab(NatureOfDefect, NatureOfDefect());

	}

	@Then("^Give Exp\\.Commissioning Date$")
	public void give_Exp_Commissioning_Date() throws Throwable {

		Click(calndr2);
		Click(month);
		Click(Day);
	}

	@Then("^Give Exp\\.Commissioning time$")
	public void give_Exp_Commissioning_time() throws Throwable {
		DERNumber();
//		Click(ExpCommissioningTime);
//		Click(SelectExpCommissioningTime);

	}

	@Then("^Give Remarks for Breakdown$")
	public void give_Remarks_for_Breakdown() throws Throwable {

		Input(BreakdownRemarks, BreakdownRemarks());
		Tab();

	}

	@Then("^Click Submit$")
	public void click_Submit() throws Throwable {

		Click(BreakdownSubmit);
		Thread.sleep(5000);
		Click(Ok);
	}

	@Then("^Click the BreakDownEntry in menu$")
	public void click_the_BreakDownEntry_in_menu() throws Throwable {
		Click(BreakDownEntry);
		Thread.sleep(5000);

	}

	@Then("^Select the BreakDownJobCode$")
	public void select_the_BreakDownJobCode() throws Throwable {

		InputTab(BreakDownJobCode, BreakDownJobCode());
		Thread.sleep(5000);
	}

	@Then("^Select the BreakDown Asset code$")
	public void select_the_BreakDown_Asset_code() throws Throwable {
		InputTab(BreakDownAssetCode, BreakDownAssetCode());

	}

	@Then("^Give the BreakDown dutation$")
	public void give_the_BreakDown_dutation() throws Throwable {
		Input(BreakDownDuration, BreakDownDuration());

	}

	@Then("^Give Search$")
	public void give_Search() throws Throwable {
		Click(Search);

	}

	@Then("^Click Breakdown Asset$")
	public void click_Breakdown_Asset() throws Throwable {

		Click(BreakDownAsset);
		Thread.sleep(10000);

	}

	@Then("^Click Commissiong tab$")
	public void click_Commissiong_tab() throws Throwable {
		Thread.sleep(15000);
		Click(CommisioningTab);

	}

	@Then("^Enter Commissioning Date$")
	public void enter_Commissioning_Date() throws Throwable {
		Thread.sleep(15000);
		Click(calndr1);
		Click(month);
		Click(Day);
//		Click(CommisioningTime);
//		Click(SelectCommissioningTime);
	}

	@Then("^Enter Next Maintanence Date$")
	public void enter_Next_Maintanence_Date() throws Throwable {

		Click(NextMaintanenceDate);
		Click(Day);

	}

	@Then("^Give Failure Investigation$")
	public void give_Failure_Investigation() throws Throwable {

		Input(FailureInvestigation, FailureInvestigation());
	}

	@Then("^Give Save as Draft$")
	public void give_Save_as_Draft() throws Throwable {
		Click(DERSaveasDraft);
	}

	@Then("^Select Done by$")
	public void select_Done_by() throws Throwable {
		Click(Own);

	}

	@Then("^Give P&M Incharge$")
	public void give_P_M_Incharge() throws Throwable {
		Click(PM_Incharge);
		InputTab(PM_Incharge, PM_Incharge());

	}

	@Then("^Give Work Done$")
	public void give_Work_Done() throws Throwable {

		Input(WorkDone, WorkDone());

	}

	@Then("^Give remarks$")
	public void give_remarks() throws Throwable {
		Input(CommissioningRemarks, CommissioningRemarks());

	}

	@Then("^Check and print the Primary Engine Meter Type$")
	public void check_and_print_the_Primary_Engine_Meter_Type() throws Throwable {
		GetText(PrimaryEngineMeterType);

	}

	@Then("^Click Commissioning Submit$")
	public void click_Commissioning_Submit() throws Throwable {
		Click(CommissioningSubmit);
		Thread.sleep(5000);
		Click(Ok);

	}

	@Then("^Give add breakdown$")
	public void give_add_breakdown() throws Throwable {

		Click(AddBreakDown);
		Thread.sleep(5000);
	}

	@Then("^Close the popup$")
	public void close_the_popup() throws Throwable {

		Click(Ok);
	}

	@Then("^Click Detailed Estimatimation Tab$")
	public void click_Detailed_Estimatimation_Tab() throws Throwable {

		Click(DetailedEstimationTab);
	}

	@Then("^Give Failure Investigation / Cause\\(s\\) of failure$")
	public void give_Failure_Investigation_Cause_s_of_failure() throws Throwable {

		Input(FailureInvestigation, FailureInvestigation());
	}

	@Then("^Go to sub Assembly$")
	public void go_to_sub_Assembly() throws Throwable {

		Click(SubAssemblyTab);
	}

	@Then("^Give Sub Assembly$")
	public void give_Sub_Assembly() throws Throwable {

		Click(SubAssemblyDropDown);
		Click(SubAssembly);
	}

	@Then("^Give Agency name$")
	public void give_Agency_name() throws Throwable {
		Click(AgencyName);
		Input(AgencyName, AgencyName());
		Click(SelectAgencyName);
		Tab();

	}

	@Then("^Give Nature of repair$")
	public void give_Nature_of_repair() throws Throwable {
		Click(NatureOfRepair);
		Input(NatureOfRepair, NatureOfRepair());

	}

	@Then("^Enter Spares Cost$")
	public void enter_Spares_Cost() throws Throwable {

		Input(SparesCost, SparesCost());

	}

	@Then("^Give Save$")
	public void give_Save() throws Throwable {

		Click(SubAssemblySave);
	}

	@Then("^Give Submit$")
	public void give_Submit() throws Throwable {
		Thread.sleep(5000);
		
		Click(DetailedEstimateSubmit);
		
		Thread.sleep(5000);
		Click(Ok);
		

	}

	@Then("^Give CauseOfFailure$")
	public void give_CauseOfFailure() throws Throwable {

		Input(CauseOfFailure, CauseOfFailure());
	}

	@Then("^Enter First level Approver user ID in AMS$")
	public void enter_First_level_Approver_user_ID_in_AMS() throws Throwable {
		Input(Username, Approver1());
	}

	@Then("^Enter second level Approver user ID in AMS$")
	public void enter_second_level_Approver_user_ID_in_AMS() throws Throwable {

		Input(Username, Approver2());

	}

	@Then("^Open DB$")
	public void open_DB() throws Throwable {

//		Connection connection = DriverManager.getConnection("jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM",
//				"SCM4login", "SCM4LOGIN@@qa");
//		Statement createStatement = connection.createStatement();
//
//		results = createStatement.executeQuery(
//				"SELECT  top 1 hpr_pr_number FROM EIP40SCM.PRC.REQ_H_Purchase_Request where HPR_Inserted_By = '210668' order by HPR_Inserted_On desc");
//		while (results.next()) {
//			requestNumber = results.getString(1);
//			System.out.println(requestNumber);

		// }

	}

	@Then("^Go to Approver WworkBench$")
	public void go_to_Approver_WworkBench() throws Throwable {

//		Click(ClickMenu);
//	    Click(AccessMaster);
//	    Click(AccessControl);
//	    Click(Workflow);
//	    Click(WorkBench);
	}

	@Then("^Click filter to find current DER$")
	public void click_filter_to_find_current_DER() throws Throwable {

		Click(Filter);
		Thread.sleep(5000);
		Click(DocumentNo);
		InputTab(DocumentNo, DERNumber());
		Thread.sleep(5000);
	}

	@Then("^Click the DER$")
	public void click_the_DER() throws Throwable {

		Click(SelectDER);
		Thread.sleep(5000);
	}

	@Then("^Click Approve$")
	public void click_Approve() throws Throwable {
		Thread.sleep(5000);
		Click(ApproveDER);

		if (Ok.isDisplayed() == true) {
			Click(Ok);
		}
	}

	@Then("^Click Reject button$")
	public void click_Reject_button() throws Throwable {
		Thread.sleep(5000);
		Click(RejectDER);
	}

	@Then("^Give rejection remark$")
	public void give_rejection_remark() throws Throwable {
		Input(RejectionRemarks, "Testing");
	}

	@Then("^Click yes to reject the DER$")
	public void click_yes_to_reject_the_DER() throws Throwable {
		Click(RejectionYes);
	}

	@Then("^Click Breakdown button$")
	public void click_Breakdown_button() throws Throwable {
		Thread.sleep(3000);
		Click(BreakDown);
	}

	@Then("^SignOut from current user$")
	public void signout_from_current_user() throws Throwable {
		Thread.sleep(10000);
		Click(profileDr);
		Click(Signout);
	}

	@Then("^give end time$")
	public void give_end_time() throws Throwable {
		Thread.sleep(3000);
		Click(EndTime);
		InputTab(EndTime, "15");
		Thread.sleep(3000);
	}

	@Then("^Click action save for breakdown entry$")
	public void click_action_save_for_breakdown_entry() throws Throwable {
		Click(ActionSave1);
	}

	@Then("^Click Submit button to submit logsheet$")
	public void click_Submit_button_to_submit_logsheet() throws Throwable {

		Click(LogSheetSubmit);

	}

	@Then("^Give DayBased Endmeter Reading$")
	public void give_DayBased_Endmeter_Reading() throws Throwable {
		String number = AddNumber(DayStartMeterReading, 5);
		Click(DayEndMeterReading);
		Clear(DayEndMeterReading);
		InputTab(DayEndMeterReading, number);
	}

	@Then("^Give breakdown hours$")
	public void give_breakdown_hours() throws Throwable {
		InputTab(BreakdownHours, "5");
	}

	@Then("^Give CPWBS Entry$")
	public void give_CPWBS_Entry() throws Throwable {

		Click(CPWBSEntry);
		Thread.sleep(5000);
	}

	@Then("^Give Day based Production quantity$")
	public void give_Day_based_Production_quantity() throws Throwable {
		InputTab(DayBasedProductionQty, "100");
	}

	@Then("^sample space$")
	public void sample_space() throws Throwable {
		DERNumber();

	}

	@Then("^Click Major Sapres tab$")
	public void click_Major_Sapres_tab() throws Throwable {
		Thread.sleep(15000);
		Click(MajorSparesTab);
	}

	@Then("^Give Materials$")
	public void give_Materials() throws Throwable {
		Click(Materials);
		Input(Materials, Materials());
		Thread.sleep(15000);
		Click(SelectMaterials);

	}

	@Then("^Give Major spares Save$")
	public void give_Major_spares_Save() throws Throwable {

		Click(MajorSparesSave);
	}

	@Then("^Give PartNo$")
	public void give_PartNo() throws Throwable {
		Input(PartNo, PartNo());
	}

	@Then("^Give PartName$")
	public void give_PartName() throws Throwable {
		Input(PartName, PartName());
	}

	@Then("^Give Quantity$")
	public void give_Quantity() throws Throwable {
		Input(Quantity, Quantity());
	}

	@Then("^Enter Amount$")
	public void enter_Amount() throws Throwable {
		Input(Amount, Amount());
	}

	@Then("^Give MajorSparesRemarks$")
	public void give_MajorSparesRemarks() throws Throwable {
		Input(MajorSparesRemarks, MajorSparesRemarks());
	}

	@Then("^Click attachment$")
	public void click_attachment() throws Throwable {
		Click(UploadDocument);
		Click(LocalDocument);
	}

}
