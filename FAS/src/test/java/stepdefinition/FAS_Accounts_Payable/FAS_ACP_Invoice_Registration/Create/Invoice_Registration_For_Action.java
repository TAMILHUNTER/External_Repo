package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Webdriver;
import stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Advance_Search;
import stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Filter;
import stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.List;
import stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Pagination;
import stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Settings;

public class Invoice_Registration_For_Action {

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Invoice_Registration_For_Action() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify User can be able to Read Dashboard Tips$")
	public static void Verify_User_can_be_able_to_Read_Dashboard_Tips() throws Throwable {

		Basic.popup_DashboardTips();

	}

	@Then("^Verify User can be able to Skip Dashboard Tips$")
	public static void Verify_User_can_be_able_to_Skip_Dashboard_Tips() throws Throwable {

		Webdriver.driver.navigate().refresh();
		Basic.popup_DashboardTips_Skip();
		Basic.popup_DashboardTips_ShowTips_Again();

	}

	@Then("^Verify User can be able to search Invoices by Document Purchase Order for PO Advance$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Document_Purchase_Order_for_PO_Advance()
			throws Throwable {

		Advance_Search.search_Invoices_by_Document_Purchase_Order_for_PO_Advance();

	}
	@Then("^Verify User can be able to search Invoices by Document Purchase Order for PO Advance_Create$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Document_Purchase_Order_for_PO_Advance_Create()
			throws Throwable {

		Advance_Search.search_Invoices_by_Document_Purchase_Order_for_PO_Advance_Create();

	}

	@Then("^Verify User can be able to search Invoices by Document Purchase Order for MRN$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Document_Purchase_Order_for_MRN()
			throws Throwable {

		Advance_Search.search_Invoices_by_Document_Purchase_Order_For_MRN();

	}

	@Then("^Verify User can be able to search Invoices by Document Work Order$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Document_Work_Order() throws Throwable {

		Advance_Search.search_Invoices_by_Document_Work_Order();

	}

	@Then("^Verify User can be able to search Invoices by Document MRN$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Document_MRN() throws Throwable {

		Advance_Search.search_Invoices_by_Document_MRN();

	}

	@Then("^Verify User can be able to search Invoices by Job$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Job() throws Throwable {

		Advance_Search.search_Invoices_by_job();

	}

	@Then("^Verify User can be able to search Invoices by Selecting Multiple job$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Selecting_Multiple_job() throws Throwable {

		Advance_Search.search_Invoices_by_Multiple_job();

	}

	@Then("^Verify User can be able to Deselecting the job$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Deselecting_job() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Deselecting_job();

	}

	@Then("^Verify User can be able to search Invoices by Selecting All job$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Selecting_All_job() throws Throwable {

		Advance_Search.search_Invoices_by_All_job();

	}

	@Then("^Verify User can be able to Deselecting All job$")
	public static void Verify_User_can_be_able_to_Deselecting_All_job() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_Deselecting_All_job();

	}

	@Then("^Verify User can be able to search Invoices by Vendor$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Vendor() throws Throwable {

		Advance_Search.search_Invoices_by_Vendor();

	}

	@Then("^Verify Vendor Details are displayed correctly$")
	public static void Verify_Vendor_Details_are_displayed_correctly() throws Throwable {

		Advance_Search.Verify_Vendor_Details_are_displayed_correctly();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Independent Company$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Independent_Company()
			throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Independent_Company();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Strategic Bussiness Group$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Strategic_Bussiness_Group()
			throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Strategic_Bussiness_Group();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Bussiness Unit$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Bussiness_Unit()
			throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Bussiness_Unit();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Segment$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Segment() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Segment();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Cluster Office$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Cluster_Office()
			throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Cluster_Office();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Region$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Region() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Region();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Location$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Location() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Location();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Zone$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Zone() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Zone();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Area$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Area() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Area();

	}

	@Then("^Verify User can be able to search Invoices by Cluster Elements Combined$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Combined() throws Throwable {

		Advance_Search.Verify_User_can_be_able_to_search_Invoices_by_Cluster_Elements_Combined();

	}

	@Then("^Verify User can be able to search Invoices by Date$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Date() throws Throwable {

		Advance_Search.search_Invoices_by_Date();

	}

	@Then("^Verify User can be able to search Invoices by Manual Date$")
	public static void Verify_User_can_be_able_to_search_Invoices_by_Manual_Date() throws Throwable {

		Advance_Search.search_Invoices_by_Manual_Date();

	}
	
	@Then("^Verify User can be able to Change Column Position$")
	public static void Verify_User_can_be_able_to_Change_Column_Position() throws Throwable {

		Settings.Verify_User_can_be_able_to_Change_Column_Position();

	}

	@Then("^Verify User can be able to Change List of Records for the past days$")
	public static void Verify_User_can_be_able_to_Change_List_of_Records_for_the_past_days() throws Throwable {

		List.search_Invoices_by_Manual_Date();

	}

	@Then("^Verify User can be able to Change List of Records displayed per page$")
	public static void Verify_User_can_be_able_to_Change_List_of_Records_displayed_per_page() throws Throwable {

		List.Verify_User_can_be_able_to_Change_List_of_Records_displayed_per_page();

	}

	@Then("^Verify User can be able to Refresh List Records$")
	public static void Verify_User_can_be_able_to_Refresh_List_Records() throws Throwable {

		List.Verify_User_can_be_able_to_Refresh_List_Records();

	}

	@Then("^Verify User can be able to Filter List of Records by Order No$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_No() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_No();

	}

	@Then("^Verify User can be able to Filter List of Records by Order Type$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Type() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Type();

	}

	@Then("^Verify User can be able to Filter List of Records by Order Date$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Date() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Date();

	}

	@Then("^Verify User can be able to Filter List of Records by Type$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Type() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Type();

	}

	@Then("^Verify User can be able to Filter List of Records by Currency$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Currency() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Currency();

	}

	@Then("^Verify User can be able to Filter List of Records by Order Amount$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Amount() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Order_Amount();

	}

	@Then("^Verify User can be able to Filter List of Records by Tolarance Amount$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Amount() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Amount();

	}

	@Then("^Verify User can be able to Filter List of Records by Tolarance MRN or Bill Count$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_MRN_or_Bill_Count()
			throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_MRN_or_Bill_Count();

	}

	@Then("^Verify User can be able to Filter List of Records by Tolarance Invoice Regn Count$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Invoice_Regn_Count()
			throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Invoice_Regn_Count();

	}

	@Then("^Verify User can be able to Filter List of Records by Tolarance Cheque number$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_number() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_number();

	}

	@Then("^Verify User can be able to Filter List of Records by Tolarance Cheque Date$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_Date() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_Date();

	}

	@Then("^Verify User can be able to Filter List of Records by Tolarance Cheque Amount$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_Amount() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Tolarance_Cheque_Amount();

	}

	@Then("^Verify User can be able to Filter List of Records by Payment Transaction Ref No$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Transaction_Ref_No()
			throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Transaction_Ref_No();

	}

	@Then("^Verify User can be able to Filter List of Records by NEFT Unique Ref No$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_NEFT_Unique_Ref_No() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_NEFT_Unique_Ref_No();

	}

	@Then("^Verify User can be able to Filter List of Records by Payment Transaction Date$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Transaction_Date()
			throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Transaction_Date();

	}

	@Then("^Verify User can be able to Filter List of Records by Payment Mode$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Mode() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Payment_Mode();

	}

	@Then("^Verify User can be able to Filter List of Records by NEFT Amount$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_NEFT_Amount() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_NEFT_Amount();

	}

	@Then("^Verify User can be able to Filter List of Records by Claim$")
	public static void Verify_User_can_be_able_to_Filter_List_of_Records_by_Claim() throws Throwable {

		Filter.Verify_User_can_be_able_to_Filter_List_of_Records_by_Claim();

	}

	@Then("^Verify User can be able to Freeze Order No Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Order_No_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Order_No_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Order Date Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Order_Date_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Order_Date_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Type Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Type_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Type_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Currency Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Currency_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Currency_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Order Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Order_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Order_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Tolarance Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Tolarance_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Tolarance MRN or Bill Count Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Tolarance_MRN_or_Bill_Count_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Tolarance_MRN_or_Bill_Count_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Tolarance Invoice Regn Count Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Invoice_Regn_Count_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Tolarance_Invoice_Regn_Count_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Tolarance Cheque number Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_number_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_number_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Tolarance Cheque Date Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_Date_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_Date_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Tolarance Cheque Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Tolarance_Cheque_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Payment Transaction Ref No Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Payment_Transaction_Ref_No_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Payment_Transaction_Ref_No_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze NEFT Unique Ref No Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_NEFT_Unique_Ref_No_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_NEFT_Unique_Ref_No_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Payment Transaction Date Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Payment_Transaction_Date_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Payment_Transaction_Date_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Payment Mode Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Payment_Mode_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Payment_Mode_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze NEFT Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_NEFT_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_NEFT_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Freeze Claim Column in the List$")
	public static void Verify_User_can_be_able_to_Freeze_Claim_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Claim_Column_in_the_List();

	}
	
	@Then("^Verify User can be able to Freeze Column in the List_Random$")
	public static void Verify_User_can_be_able_to_Freeze_Column_in_the_List_Random() throws Throwable {

		Settings.Verify_User_can_be_able_to_Freeze_Column_in_the_List_Random();

	}
	
	@Then("^Verify User can be able to Un Freeze Column in the List_Random$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Column_in_the_List_Random() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Column_in_the_List_Random();

	}

	

	@Then("^Verify User can be able to Un Freeze Order No Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Order_No_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Order_No_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Order Date Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Order_Date_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Order_Date_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Type Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Type_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Type_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Currency Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Currency_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Currency_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Order Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Order_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Order_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Tolarance Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Tolarance_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Tolarance MRN or Bill Count Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_MRN_or_Bill_Count_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Tolarance_MRN_or_Bill_Count_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Tolarance Invoice Regn Count Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Invoice_Regn_Count_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Tolarance_Invoice_Regn_Count_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Tolarance Cheque number Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_number_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_number_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Tolarance Cheque Date Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_Date_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_Date_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Tolarance Cheque Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_Amount_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Tolarance_Cheque_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Payment Transaction Ref No Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Payment_Transaction_Ref_No_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Payment_Transaction_Ref_No_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze NEFT Unique Ref No Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_NEFT_Unique_Ref_No_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_NEFT_Unique_Ref_No_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Payment Transaction Date Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Payment_Transaction_Date_Column_in_the_List()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Payment_Transaction_Date_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Payment Mode Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Payment_Mode_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Payment_Mode_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze NEFT Amount Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_NEFT_Amount_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_NEFT_Amount_Column_in_the_List();

	}

	@Then("^Verify User can be able to Un Freeze Claim Column in the List$")
	public static void Verify_User_can_be_able_to_Un_Freeze_Claim_Column_in_the_List() throws Throwable {

		Settings.Verify_User_can_be_able_to_Un_Freeze_Claim_Column_in_the_List();

	}

	@Then("^Verify User can be able to Disable Order No Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Order_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Order_No_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Order No Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Order_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Order_No_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Order Date Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Order_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Order_Date_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Order Date Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Order_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Order_Date_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Type Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Type_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Type_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Type Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Type_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Type_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Currency Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Currency_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Currency_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Currency Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Currency_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Currency_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Order Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Order_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Order_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Order Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Order_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Order_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Tolarance Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Tolarance_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Tolarance_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Tolarance Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Tolarance_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Tolarance_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Tolarance MRN or Bill Count Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Tolarance_MRN_or_Bill_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Tolarance_MRN_or_Bill_Count_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Tolarance MRN or Bill Count Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Tolarance_MRN_or_Bill_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Tolarance_MRN_or_Bill_Count_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Tolarance Invoice Regn Count Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Tolarance_Invoice_Regn_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Tolarance_Invoice_Regn_Count_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Tolarance Invoice Regn Count Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Tolarance_Invoice_Regn_Count_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Tolarance_Invoice_Regn_Count_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Tolarance Cheque number Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Tolarance_Cheque_number_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Tolarance_Cheque_number_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Tolarance Cheque number Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Tolarance_Cheque_number_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Tolarance_Cheque_number_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Tolarance Cheque Date Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Tolarance_Cheque_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Tolarance_Cheque_Date_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Tolarance Cheque Date Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Tolarance_Cheque_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Tolarance_Cheque_Date_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Tolarance Cheque Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Tolarance_Cheque_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Tolarance_Cheque_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Tolarance Cheque Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Tolarance_Cheque_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Tolarance_Cheque_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Payment Transaction Ref No Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Payment_Transaction_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Payment_Transaction_Ref_No_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Payment Transaction Ref No Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Payment_Transaction_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Payment_Transaction_Ref_No_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable NEFT Unique Ref No Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_NEFT_Unique_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_NEFT_Unique_Ref_No_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable NEFT Unique Ref No Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_NEFT_Unique_Ref_No_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_NEFT_Unique_Ref_No_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Payment Transaction Date Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Payment_Transaction_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Payment_Transaction_Date_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Payment Transaction Date Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Payment_Transaction_Date_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Payment_Transaction_Date_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Payment Mode Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Payment_Mode_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Payment_Mode_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Payment Mode Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Payment_Mode_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Payment_Mode_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable NEFT Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_NEFT_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_NEFT_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable NEFT Amount Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_NEFT_Amount_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_NEFT_Amount_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Claim Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Disable_Claim_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Claim_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Enable Claim Column View  in the Document List View$")
	public static void Verify_User_can_be_able_to_Enable_Claim_Column_View__in_the_Document_List_View()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Claim_Column_View__in_the_Document_List_View();

	}

	@Then("^Verify User can be able to Disable Column View in the Document List View_Random$")
	public static void Verify_User_can_be_able_to_Disable_Column_View_in_the_Document_List_View_Random()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Disable_Column_View_in_the_Document_List_View_Random();

	}
	
	@Then("^Verify User can be able to Enable Column View in the Document List View_Random$")
	public static void Verify_User_can_be_able_to_Enable_Column_View_in_the_Document_List_View_Random()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Enable_Column_View_in_the_Document_List_View_Random();

	}
	
	@Then("^Verify User can be able to Expand column view$")
	public static void Verify_User_can_be_able_to_Expand_column_view()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Expand_column_view();

	}
		
	@Then("^Verify User can be able to Minimize column view$")
	public static void Verify_User_can_be_able_to_Minimize_column_view()
			throws Throwable {

		Settings.Verify_User_can_be_able_to_Minimize_column_view();

	}
	
	
	@Then("^Verify User can be able to Go to Next Page$")
	public static void Verify_User_can_be_able_to_Go_to_Next_Page()
			throws Throwable {

		Pagination.Verify_User_can_be_able_to_Go_to_Next_Page();

	}
	
	@Then("^Verify User can be able to Go to Previous Page$")
	public static void Verify_User_can_be_able_to_Go_to_Previous_Page()
			throws Throwable {

		Pagination.Verify_User_can_be_able_to_Go_to_Previous_Page();

	}
	
	@Then("^Verify User can be able to Go to First Page$")
	public static void Verify_User_can_be_able_to_Go_to_First_Page()
			throws Throwable {

		Pagination.Verify_User_can_be_able_to_Go_to_First_Page();

	}
	
	@Then("^Verify User can be able to Go to Last Page$")
	public static void Verify_User_can_be_able_to_Go_to_Last_Page()
			throws Throwable {

		Pagination.Verify_User_can_be_able_to_Go_to_Last_Page();

	}
	@Then("^Verify User can be able to Go to Random Page$")
	public static void Verify_User_can_be_able_to_Go_to_Random_Page()
			throws Throwable {

		Pagination.Verify_User_can_be_able_to_Go_to_Random_Page();

	}
	@Then("^Verify User can be able to Go to Custom Page$")
	public static void Verify_User_can_be_able_to_Go_to_Custom_Page()
			throws Throwable {

		Pagination.Verify_User_can_be_able_to_Go_to_Custom_Page();

	}
}
