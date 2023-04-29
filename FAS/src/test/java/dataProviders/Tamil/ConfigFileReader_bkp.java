package dataProviders.Tamil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader_bkp {

	private static Properties properties;
	private final String propertyFilePath = "src//main//java//configuration//Configuration.properties";

	public ConfigFileReader_bkp() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

//***********************************************************************************************************************//
//Added By : Tamil	
// Common File Readed Methods	

	public static String getLoggerPath() {
		String LoggerPath = properties.getProperty("LoggerPath");
		if (LoggerPath != null)
			return LoggerPath;
		else
			throw new RuntimeException("LoggerPath not specified in the Configuration.properties file.");
	}

	public static String getDriverPath_Chrome() {
		String getDriverPath_Chrome = properties.getProperty("DriverPath_Chrome");
		if (getDriverPath_Chrome != null)
			return getDriverPath_Chrome;
		else
			throw new RuntimeException("driverPath_Chrome not specified in the Configuration.properties file.");
	}

	public static String getDriverPath_Firefox() {
		String driverPath = properties.getProperty("DriverPath_Firefox");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath_Firefox not specified in the Configuration.properties file.");
	}

	public static String getDriverPath_Edge() {
		String DriverPath_Edge = properties.getProperty("DriverPath_Edge");
		if (DriverPath_Edge != null)
			return DriverPath_Edge;
		else
			throw new RuntimeException("DriverPath_Edge not specified in the Configuration.properties file.");
	}

	public static String getBrowser() {
		String Browser = properties.getProperty("Browser");
		if (Browser != null)
			return Browser;
		else
			throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}

	public static String getLanding_Page() {
		String Landing_Page = properties.getProperty("Landing_Page");
		if (Landing_Page != null)
			return Landing_Page;
		else
			throw new RuntimeException("Landing_Page not specified in the Configuration.properties file.");
	}

	public static String getEnvironment() {
		String Environment = properties.getProperty("Environment");
		if (Environment != null)
			return Environment;
		else
			throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}

	public static long getImplicitWaitTime() {
		String ImplicitWaitTime = properties.getProperty("ImplicitWaitTime");
		if (ImplicitWaitTime != null)
			return Long.parseLong(ImplicitWaitTime);
		else
			throw new RuntimeException("ImplicitWaitTime not specified in the Configuration.properties file.");
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public static String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public static String getScreenshotPath_Pass() {
		String ScreenshotPath_Pass = properties.getProperty("ScreenshotPath_Pass");
		if (ScreenshotPath_Pass != null)
			return ScreenshotPath_Pass;
		else
			throw new RuntimeException("ScreenshotPath_Pass not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_Fail() {
		String ScreenshotPath_Fail = properties.getProperty("ScreenshotPath_Fail");
		if (ScreenshotPath_Fail != null)
			return ScreenshotPath_Fail;
		else
			throw new RuntimeException("ScreenshotPath_Fail not specified in the Configuration.properties file.");
	}

	public static String getScreenshotPath_Scenario() {
		String ScreenshotPath_Scenario = properties.getProperty("ScreenshotPath_Scenario");
		if (ScreenshotPath_Scenario != null)
			return ScreenshotPath_Scenario;
		else
			throw new RuntimeException("ScreenshotPath_Scenario not specified in the Configuration.properties file.");
	}

	public static String getReportPath() {
		String ReportPath = properties.getProperty("ReportPath");
		if (ReportPath != null)
			return ReportPath;
		else
			throw new RuntimeException("ReportPath not specified in the Configuration.properties file.");
	}

	public static String getDB_Url() {
		String DB_Url = properties.getProperty("DB_Url");
		if (DB_Url != null)
			return DB_Url;
		else
			throw new RuntimeException("DB_Url not specified in the Configuration.properties file.");
	}

	public static String getDB_User() {
		String DB_User = properties.getProperty("DB_User");
		if (DB_User != null)
			return DB_User;
		else
			throw new RuntimeException("DB_User not specified in the Configuration.properties file.");
	}

	public static String getDB_Pwd() {
		String DB_Pwd = properties.getProperty("DB_Pwd");
		if (DB_Pwd != null)
			return DB_Pwd;
		else
			throw new RuntimeException("DB_Pwd not specified in the Configuration.properties file.");
	}

	public static String getDB_Loading_Class() {
		String DB_Loading_Class = properties.getProperty("DB_Loading_Class");
		if (DB_Loading_Class != null)
			return DB_Loading_Class;
		else
			throw new RuntimeException("DB_Pwd not specified in the Configuration.properties file.");
	}

	public static String getskip_session() {
		String skip_session = properties.getProperty("skip_session");
		if (skip_session != null)
			return skip_session;
		else
			throw new RuntimeException("skip_session not specified in the Configuration.properties file.");
	}

	// Switch Job
	public static String getUser_job() {
		String User_job = properties.getProperty("User_job");
		if (User_job != null)
			return User_job;
		else
			throw new RuntimeException("User_job not specified in the Configuration.properties file.");
	}

	public static String getJob_LE180046() {
		String Job_LE180046 = properties.getProperty("Job_LE180046");
		if (Job_LE180046 != null)
			return Job_LE180046;
		else
			throw new RuntimeException("Job_LE180046 not specified in the Configuration.properties file.");
	}

	public static String getLogin_Landing() {
		String Login_Landing = properties.getProperty("Login_Landing");
		if (Login_Landing != null)
			return Login_Landing;
		else
			throw new RuntimeException("Login_Landing not specified in the Configuration.properties file.");
	}

//***********************************************************************************************************************//

//Login Test-Data-RoleBase

	public static String getEmployee_username() {
		String Employee_username = properties.getProperty("Employee_username");
		if (Employee_username != null)
			return Employee_username;
		else
			throw new RuntimeException("Employee_username not specified in the Configuration.properties file.");
	}

	public static String getEmployee_password() {
		String Employee_password = properties.getProperty("Employee_password");
		if (Employee_password != null)
			return Employee_password;
		else
			throw new RuntimeException("Employee_password not specified in the Configuration.properties file.");
	}

	public static String getEmployee2_username() {
		String Employee2_username = properties.getProperty("Employee2_username");
		if (Employee2_username != null)
			return Employee2_username;
		else
			throw new RuntimeException("Employee2_username not specified in the Configuration.properties file.");
	}

	public static String getEmployee2_password() {
		String Employee2_password = properties.getProperty("Employee2_password");
		if (Employee2_password != null)
			return Employee2_password;
		else
			throw new RuntimeException("Employee2_password not specified in the Configuration.properties file.");
	}

	public static String getPartner_username() {
		String Partner_username = properties.getProperty("Partner_username");
		if (Partner_username != null)
			return Partner_username;
		else
			throw new RuntimeException("Partner_username not specified in the Configuration.properties file.");
	}

	public static String getPartner_password() {
		String Partner_password = properties.getProperty("Partner_password");
		if (Partner_password != null)
			return Partner_password;
		else
			throw new RuntimeException("Partner_password not specified in the Configuration.properties file.");
	}

	public static String getEIP_User_username() {
		String EIP_User_username = properties.getProperty("EIP_User_username");
		if (EIP_User_username != null)
			return EIP_User_username;
		else
			throw new RuntimeException("EIP_User_username not specified in the Configuration.properties file.");
	}

	public static String getEIP_User_password() {
		String EIP_User_password = properties.getProperty("EIP_User_password");
		if (EIP_User_password != null)
			return EIP_User_password;
		else
			throw new RuntimeException("EIP_User_password not specified in the Configuration.properties file.");
	}

	public static String getshow_tips_Again() {
		String show_tips_Again = properties.getProperty("show_tips_Again");
		if (show_tips_Again != null)
			return show_tips_Again;
		else
			throw new RuntimeException("show_tips_Again not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Input_by() {
		String advance_search_Input_by = properties.getProperty("advance_search_Input_by");
		if (advance_search_Input_by != null)
			return advance_search_Input_by;
		else
			throw new RuntimeException("advance_search_Input_by not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Input_Purchase_Order() {
		String advance_search_Input_Purchase_Order = properties.getProperty("advance_search_Input_Purchase_Order");
		if (advance_search_Input_Purchase_Order != null)
			return advance_search_Input_Purchase_Order;
		else
			throw new RuntimeException(
					"advance_search_Input_Purchase_Order not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Input_WorkOrder() {
		String advance_search_Input_WorkOrder = properties.getProperty("advance_search_Input_WorkOrder");
		if (advance_search_Input_WorkOrder != null)
			return advance_search_Input_WorkOrder;
		else
			throw new RuntimeException(
					"advance_search_Input_WorkOrder not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Input_MRN_Number() {
		String advance_search_Input_MRN_Number = properties.getProperty("advance_search_Input_MRN_Number");
		if (advance_search_Input_MRN_Number != null)
			return advance_search_Input_MRN_Number;
		else
			throw new RuntimeException(
					"advance_search_Input_MRN_Number not specified in the Configuration.properties file.");
	}

//	***********************************************************************************************************************
	// ****************************************************************************************************************************

	// Basha Config file reader date as on 17-10-2022

	public static String getCustomer_order_number() {
		String Customer_order_number = properties.getProperty("Customer_order_number");
		if (Customer_order_number != null)
			return Customer_order_number;
		else
			throw new RuntimeException("Customer_order_number not specified in the Configuration.properties file.");
	}

	public static String getDate_picker() {
		String Date_picker = properties.getProperty("Date picker");
		if (Date_picker != null)
			return Date_picker;
		else
			throw new RuntimeException("Date_picker not specified in the Configuration.properties file.");
	}

	public static String gettoday() {
		String today = properties.getProperty("today");
		if (today != null)
			return today;
		else
			throw new RuntimeException("today not specified in the Configuration.properties file.");
	}
	/*
	 * public static String getInvoice_type(){ String Invoive_type =
	 * properties.getProperty("Invoice type"); if(Invoice_type!= null) return
	 * Invoice_type; else throw new
	 * RuntimeException("Invoice_type not specified in the Configuration.properties file."
	 * ); }
	 */

	public static String getOrder_value() {
		String Order_value = properties.getProperty("Order_value");
		if (Order_value != null)
			return Order_value;
		else
			throw new RuntimeException("Order_value not specified in the Configuration.properties file.");
	}

	public static String getcustomer_code() {
		String customer_code = properties.getProperty("customer_code");
		if (customer_code != null)
			return customer_code;
		else
			throw new RuntimeException("customer_code not specified in the Configuration.properties file.");
	}

	public static String getJobcode1() {
		String Jobcode1 = properties.getProperty("Jobcode1");
		if (Jobcode1 != null)
			return Jobcode1;
		else
			throw new RuntimeException("Jobcode1 not specified in the Configuration.properties file.");
	}

	public static String getCurrency1() {
		String Currency1 = properties.getProperty("Currency1");
		if (Currency1 != null)
			return Currency1;
		else
			throw new RuntimeException("Currency1 not specified in the Configuration.properties file.");
	}

	public static String getInvoicetypename() {
		String Invoicetypename = properties.getProperty("Invoicetypename");
		if (Invoicetypename != null)
			return Invoicetypename;
		else
			throw new RuntimeException("Invoicetypename not specified in the Configuration.properties file.");
	}

	public static String getPricing1() {
		String Pricing1 = properties.getProperty("Pricing1");
		if (Pricing1 != null)
			return Pricing1;
		else
			throw new RuntimeException("Pricing1 not specified in the Configuration.properties file.");
	}

	public static String getStage_percentage1() {
		String Stage_percentage1 = properties.getProperty("Stage_percentage1");
		if (Stage_percentage1 != null)
			return Stage_percentage1;
		else
			throw new RuntimeException("Stage_percentage1 not specified in the Configuration.properties file.");
	}

	public static String getStage_Remarks1() {
		String Stage_Remarks1 = properties.getProperty("Stage_Remarks1");
		if (Stage_Remarks1 != null)
			return Stage_Remarks1;
		else
			throw new RuntimeException("Stage_Remarks1 not specified in the Configuration.properties file.");
	}

	public static String getStage_percentage2() {
		String Stage_percentage2 = properties.getProperty("Stage_percentage2");
		if (Stage_percentage2 != null)
			return Stage_percentage2;
		else
			throw new RuntimeException("Stage_percentag2 not specified in the Configuration.properties file.");
	}

	public static String getStage_Remarks2() {
		String Stage_Remarks2 = properties.getProperty("Stage_Remarks2");
		if (Stage_Remarks2 != null)
			return Stage_Remarks2;
		else
			throw new RuntimeException("Stage_Remarks2 not specified in the Configuration.properties file.");
	}

	public static String getConsignee_name1() {
		String Consignee_name1 = properties.getProperty("Consignee_name1");
		if (Consignee_name1 != null)
			return Consignee_name1;
		else
			throw new RuntimeException("Consignee_name1 not specified in the Configuration.properties file.");
	}

	public static String getGroup_tag() {
		String Group_tag = properties.getProperty("Group_tag");
		if (Group_tag != null)
			return Group_tag;
		else
			throw new RuntimeException("Group_tag not specified in the Configuration.properties file.");
	}

	public static String getGroup_code() {
		String Group_code = properties.getProperty("Group_code");
		if (Group_code != null)
			return Group_code;
		else
			throw new RuntimeException("Group_code not specified in the Configuration.properties file.");
	}

	public static String getGroup_description() {
		String Group_description = properties.getProperty("Group_description");
		if (Group_description != null)
			return Group_description;
		else
			throw new RuntimeException("Group_description not specified in the Configuration.properties file.");
	}

	public static String getGroup_code1() {
		String Group_code1 = properties.getProperty("Group_code1");
		if (Group_code1 != null)
			return Group_code1;
		else
			throw new RuntimeException("Group_code1 not specified in the Configuration.properties file.");
	}

	public static String getGroup_description1() {
		String Group_description1 = properties.getProperty("Group_description1");
		if (Group_description1 != null)
			return Group_description1;
		else
			throw new RuntimeException("Group_description1 not specified in the Configuration.properties file.");
	}

	public static String getPercentage() {
		String Percentage = properties.getProperty("Percentage");
		if (Percentage != null)
			return Percentage;
		else
			throw new RuntimeException("Percentage not specified in the Configuration.properties file.");
	}

	public static String getEvent() {
		String Event = properties.getProperty("Event");
		if (Event != null)
			return Event;
		else
			throw new RuntimeException("Event not specified in the Configuration.properties file.");
	}

	public static String getRequired_doc() {
		String Required_doc = properties.getProperty("Required_doc");
		if (Required_doc != null)
			return Required_doc;
		else
			throw new RuntimeException("Required_doc not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days() {
		String No_of_days = properties.getProperty("No_of_days");
		if (No_of_days != null)
			return No_of_days;
		else
			throw new RuntimeException("No_of_days not specified in the Configuration.properties file.");
	}

	public static String getRemarks2() {
		String Remarks2 = properties.getProperty("Remarks2");
		if (Remarks2 != null)
			return Remarks2;
		else
			throw new RuntimeException("Remarks2 not specified in the Configuration.properties file.");
	}

	public static String getPercentage1() {
		String Percentage1 = properties.getProperty("Percentage1");
		if (Percentage1 != null)
			return Percentage1;
		else
			throw new RuntimeException("Percentage1 not specified in the Configuration.properties file.");
	}

	public static String getEvent1() {
		String Event1 = properties.getProperty("Event1");
		if (Event1 != null)
			return Event1;
		else
			throw new RuntimeException("Event1 not specified in the Configuration.properties file.");
	}

	public static String getRequired_doc2() {
		String Required_doc2 = properties.getProperty("Required_doc2");
		if (Required_doc2 != null)
			return Required_doc2;
		else
			throw new RuntimeException("Required_doc2 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days1() {
		String No_of_days1 = properties.getProperty("No_of_days1");
		if (No_of_days1 != null)
			return No_of_days1;
		else
			throw new RuntimeException("No_of_days1 not specified in the Configuration.properties file.");
	}

	public static String getRemarks3() {
		String Remarks3 = properties.getProperty("Remarks3");
		if (Remarks3 != null)
			return Remarks3;
		else
			throw new RuntimeException("Remarks3 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_type() {
		String Advance_type = properties.getProperty("Advance_type");
		if (Advance_type != null)
			return Advance_type;
		else
			throw new RuntimeException("Advance_type not specified in the Configuration.properties file.");
	}

	public static String getRequired_doc4() {
		String Required_doc4 = properties.getProperty("Required_doc4");
		if (Required_doc4 != null)
			return Required_doc4;
		else
			throw new RuntimeException("Required_doc4 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Installments() {
		String No_of_Installments = properties.getProperty("No_of_Installments");
		if (No_of_Installments != null)
			return No_of_Installments;
		else
			throw new RuntimeException("No_of_Installments not specified in the Configuration.properties file.");
	}

	public static String getAdvance_percentage() {
		String Advance_percentage = properties.getProperty("Advance_percentage");
		if (Advance_percentage != null)
			return Advance_percentage;
		else
			throw new RuntimeException("Advance_percentage not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount() {
		String Advance_amount = properties.getProperty("Advance_amount");
		if (Advance_amount != null)
			return Advance_amount;
		else
			throw new RuntimeException("Advance_amount not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount1() {
		String Advance_amount1 = properties.getProperty("Advance_amount1");
		if (Advance_amount1 != null)
			return Advance_amount1;
		else
			throw new RuntimeException("Advance_amount1 not specified in the Configuration.properties file.");
	}

	public static String getEvent2() {
		String Event2 = properties.getProperty("Event2");
		if (Event2 != null)
			return Event2;
		else
			throw new RuntimeException("Event2 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Credit_days() {
		String No_of_Credit_days = properties.getProperty("No_of_Credit_days");
		if (No_of_Credit_days != null)
			return No_of_Credit_days;
		else
			throw new RuntimeException("No_of_Credit_days not specified in the Configuration.properties file.");
	}

	public static String getAdvance_type1() {
		String Advance_type1 = properties.getProperty("Advance_type1");
		if (Advance_type1 != null)
			return Advance_type1;
		else
			throw new RuntimeException("Advance_type1 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Installments1() {
		String No_of_Installments1 = properties.getProperty("No_of_Installments1");
		if (No_of_Installments1 != null)
			return No_of_Installments1;
		else
			throw new RuntimeException("No_of_Installments1 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_percentage1() {
		String Advance_percentage1 = properties.getProperty("Advance_percentage1");
		if (Advance_percentage1 != null)
			return Advance_percentage1;
		else
			throw new RuntimeException("Advance_percentage1 not specified in the Configuration.properties file.");
	}

	public static String getEvent3() {
		String Event3 = properties.getProperty("Event3");
		if (Event3 != null)
			return Event3;
		else
			throw new RuntimeException("Event3 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Credit_days1() {
		String No_of_Credit_days1 = properties.getProperty("No_of_Credit_days1");
		if (No_of_Credit_days1 != null)
			return No_of_Credit_days1;
		else
			throw new RuntimeException("No_of_Credit_days1 not specified in the Configuration.properties file.");
	}

	public static String getRecovery_type() {
		String Recovery_type = properties.getProperty("Recovery_type");
		if (Recovery_type != null)
			return Recovery_type;
		else
			throw new RuntimeException("Recovery_type not specified in the Configuration.properties file.");
	}

	public static String getRecovery_percentage() {
		String Recovery_percentage = properties.getProperty("Recovery_percentage");
		if (Recovery_percentage != null)
			return Recovery_percentage;
		else
			throw new RuntimeException("Recovery_percentage not specified in the Configuration.properties file.");
	}

	public static String getStrating_invoice_no() {
		String Strating_invoice_no = properties.getProperty("Strating_invoice_no");
		if (Strating_invoice_no != null)
			return Strating_invoice_no;
		else
			throw new RuntimeException("Strating_invoice_no not specified in the Configuration.properties file.");
	}

	public static String getType() {
		String Type = properties.getProperty("Type");
		if (Type != null)
			return Type;
		else
			throw new RuntimeException("Type not specified in the Configuration.properties file.");
	}

	public static String getPercentage3() {
		String Percentage3 = properties.getProperty("Percentage3");
		if (Percentage3 != null)
			return Percentage3;
		else
			throw new RuntimeException("Percentage3 not specified in the Configuration.properties file.");
	}

	public static String getStrating_invoice_no1() {
		String Strating_invoice_no1 = properties.getProperty("Strating_invoice_no1");
		if (Strating_invoice_no1 != null)
			return Strating_invoice_no1;
		else
			throw new RuntimeException("Strating_invoice_no1 not specified in the Configuration.properties file.");
	}

	public static String getType1() {
		String Type1 = properties.getProperty("Type1");
		if (Type1 != null)
			return Type1;
		else
			throw new RuntimeException("Type1 not specified in the Configuration.properties file.");
	}

	public static String getPercentage4() {
		String Percentage4 = properties.getProperty("Percentage4");
		if (Percentage4 != null)
			return Percentage4;
		else
			throw new RuntimeException("Percentage4 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount_type() {
		String Advance_amount_type = properties.getProperty("Advance_amount_type");
		if (Advance_amount_type != null)
			return Advance_amount_type;
		else
			throw new RuntimeException("Advance_amount_type not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount_type1() {
		String Advance_amount_type1 = properties.getProperty("Advance_amount_type1");
		if (Advance_amount_type1 != null)
			return Advance_amount_type1;
		else
			throw new RuntimeException("Advance_amount_type1 not specified in the Configuration.properties file.");
	}

	public static String getStrating_invoice_no2() {
		String Strating_invoice_no2 = properties.getProperty("Strating_invoice_no2");
		if (Strating_invoice_no2 != null)
			return Strating_invoice_no2;
		else
			throw new RuntimeException("Strating_invoice_no2 not specified in the Configuration.properties file.");
	}

	public static String getActivity() {
		String Activity = properties.getProperty("Activity");
		if (Activity != null)
			return Activity;
		else
			throw new RuntimeException("Activity not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days2() {
		String No_of_days2 = properties.getProperty("No_of_days2");
		if (No_of_days2 != null)
			return No_of_days2;
		else
			throw new RuntimeException("No_of_days2 not specified in the Configuration.properties file.");
	}

	public static String getRemarks4() {
		String Remarks4 = properties.getProperty("Remarks4");
		if (Remarks4 != null)
			return Remarks4;
		else
			throw new RuntimeException("Remarks4 not specified in the Configuration.properties file.");
	}

	public static String getActivity1() {
		String Activity1 = properties.getProperty("Activity1");
		if (Activity1 != null)
			return Activity1;
		else
			throw new RuntimeException("Activity1 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days3() {
		String No_of_days3 = properties.getProperty("No_of_days3");
		if (No_of_days3 != null)
			return No_of_days3;
		else
			throw new RuntimeException("No_of_days3 not specified in the Configuration.properties file.");
	}

	public static String getRemarks5() {
		String Remarks5 = properties.getProperty("Remarks5");
		if (Remarks5 != null)
			return Remarks5;
		else
			throw new RuntimeException("Remarks5 not specified in the Configuration.properties file.");
	}

	public static String getJON() {
		String JON = properties.getProperty("JON");
		if (JON != null)
			return JON;
		else
			throw new RuntimeException("JON not specified in the Configuration.properties file.");
	}

	public static String getCustomer_order_number1() {
		String Customer_order_number1 = properties.getProperty("Customer_order_number1");
		if (Customer_order_number1 != null)
			return Customer_order_number1;
		else
			throw new RuntimeException("Customer_order_number1 not specified in the Configuration.properties file.");
	}

	public static String getDate_picker_enter() {
		String Date_picker_enter = properties.getProperty("Date_picker_enter");
		if (Date_picker_enter != null)
			return Date_picker_enter;
		else
			throw new RuntimeException("Date_picker_enter not specified in the Configuration.properties file.");
	}

	public static String getOrder_value1() {
		String Order_value1 = properties.getProperty("Order_value1");
		if (Order_value1 != null)
			return Order_value1;
		else
			throw new RuntimeException("Order_value1 not specified in the Configuration.properties file.");
	}

	public static String getPricing3() {
		String Pricing3 = properties.getProperty("Pricing3");
		if (Pricing3 != null)
			return Pricing3;
		else
			throw new RuntimeException("Pricing3 not specified in the Configuration.properties file.");
	}

	public static String getStage_percentage3() {
		String Stage_percentage3 = properties.getProperty("Stage_percentage3");
		if (Stage_percentage3 != null)
			return Stage_percentage3;
		else
			throw new RuntimeException("Stage_percentage3 not specified in the Configuration.properties file.");
	}

	public static String getStage_Remarks6() {
		String Stage_Remarks6 = properties.getProperty("Stage_Remarks6");
		if (Stage_Remarks6 != null)
			return Stage_Remarks6;
		else
			throw new RuntimeException("Stage_Remarks6 not specified in the Configuration.properties file.");
	}

	public static String getStage_percentage4() {
		String Stage_percentage4 = properties.getProperty("Stage_percentage4");
		if (Stage_percentage4 != null)
			return Stage_percentage4;
		else
			throw new RuntimeException("Stage_percentage4 not specified in the Configuration.properties file.");
	}

	public static String getStage_Remarks7() {
		String Stage_Remarks7 = properties.getProperty("Stage_Remarks7");
		if (Stage_Remarks7 != null)
			return Stage_Remarks7;
		else
			throw new RuntimeException("Stage_Remarks7 not specified in the Configuration.properties file.");
	}

	public static String getConsignee_name3() {
		String Consignee_name3 = properties.getProperty("Consignee_name3");
		if (Consignee_name3 != null)
			return Consignee_name3;
		else
			throw new RuntimeException("Consignee_name3 not specified in the Configuration.properties file.");
	}

	public static String getGroup_tag1() {
		String Group_tag1 = properties.getProperty("Group_tag1");
		if (Group_tag1 != null)
			return Group_tag1;
		else
			throw new RuntimeException("Group_tag1 not specified in the Configuration.properties file.");
	}

	public static String getGroup_code2() {
		String Group_code2 = properties.getProperty("Group_code2");
		if (Group_code2 != null)
			return Group_code2;
		else
			throw new RuntimeException("Group_code2 not specified in the Configuration.properties file.");
	}

	public static String getGroup_description2() {
		String Group_description2 = properties.getProperty("Group_description2");
		if (Group_description2 != null)
			return Group_description2;
		else
			throw new RuntimeException("Group_description2 not specified in the Configuration.properties file.");
	}

	public static String getGroup_code3() {
		String Group_code3 = properties.getProperty("Group_code3");
		if (Group_code3 != null)
			return Group_code3;
		else
			throw new RuntimeException("Group_code3 not specified in the Configuration.properties file.");
	}

	public static String getGroup_description3() {
		String Group_description3 = properties.getProperty("Group_description3");
		if (Group_description3 != null)
			return Group_description3;
		else
			throw new RuntimeException("Group_description3 not specified in the Configuration.properties file.");
	}

	public static String getPercentage5() {
		String Percentage5 = properties.getProperty("Percentage5");
		if (Percentage5 != null)
			return Percentage5;
		else
			throw new RuntimeException("Percentage5 not specified in the Configuration.properties file.");
	}

	public static String getEvent4() {
		String Event4 = properties.getProperty("Event4");
		if (Event4 != null)
			return Event4;
		else
			throw new RuntimeException("Event4 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days4() {
		String No_of_days4 = properties.getProperty("No_of_days4");
		if (No_of_days4 != null)
			return No_of_days4;
		else
			throw new RuntimeException("No_of_days4 not specified in the Configuration.properties file.");
	}

	public static String getRemarks8() {
		String Remarks8 = properties.getProperty("Remarks8");
		if (Remarks8 != null)
			return Remarks8;
		else
			throw new RuntimeException("Remarks8 not specified in the Configuration.properties file.");
	}

	public static String getPercentage6() {
		String Percentage6 = properties.getProperty("Percentage6");
		if (Percentage6 != null)
			return Percentage6;
		else
			throw new RuntimeException("Percentage6 not specified in the Configuration.properties file.");
	}

	public static String getEvent5() {
		String Event5 = properties.getProperty("Event5");
		if (Event5 != null)
			return Event5;
		else
			throw new RuntimeException("Event5 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days5() {
		String No_of_days5 = properties.getProperty("No_of_days5");
		if (No_of_days5 != null)
			return No_of_days5;
		else
			throw new RuntimeException("No_of_days5 not specified in the Configuration.properties file.");
	}

	public static String getRemarks9() {
		String Remarks9 = properties.getProperty("Remarks9");
		if (Remarks9 != null)
			return Remarks9;
		else
			throw new RuntimeException("Remarks9 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Installments2() {
		String No_of_Installments2 = properties.getProperty("No_of_Installments2");
		if (No_of_Installments2 != null)
			return No_of_Installments2;
		else
			throw new RuntimeException("No_of_Installments2 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_percentage2() {
		String Advance_percentage2 = properties.getProperty("Advance_percentage2");
		if (Advance_percentage2 != null)
			return Advance_percentage2;
		else
			throw new RuntimeException("Advance_percentage2 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount2() {
		String Advance_amount2 = properties.getProperty("Advance_amount2");
		if (Advance_amount2 != null)
			return Advance_amount2;
		else
			throw new RuntimeException("Advance_amount2 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount_type2() {
		String Advance_amount_type2 = properties.getProperty("Advance_amount_type2");
		if (Advance_amount_type2 != null)
			return Advance_amount_type2;
		else
			throw new RuntimeException("Advance_amount_type2 not specified in the Configuration.properties file.");
	}

	public static String getEvent6() {
		String Event6 = properties.getProperty("Event6");
		if (Event6 != null)
			return Event6;
		else
			throw new RuntimeException("Event6 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Credit_days2() {
		String No_of_Credit_days2 = properties.getProperty("No_of_Credit_days2");
		if (No_of_Credit_days2 != null)
			return No_of_Credit_days2;
		else
			throw new RuntimeException("No_of_Credit_days2 not specified in the Configuration.properties file.");
	}

	public static String getRequired_doc13() {
		String Required_doc13 = properties.getProperty("Required_doc13");
		if (Required_doc13 != null)
			return Required_doc13;
		else
			throw new RuntimeException("Required_doc13 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Installments3() {
		String No_of_Installments3 = properties.getProperty("No_of_Installments3");
		if (No_of_Installments3 != null)
			return No_of_Installments3;
		else
			throw new RuntimeException("No_of_Installments3 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_percentage3() {
		String Advance_percentage3 = properties.getProperty("Advance_percentage3");
		if (Advance_percentage3 != null)
			return Advance_percentage3;
		else
			throw new RuntimeException("Advance_percentage3 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount3() {
		String Advance_amount3 = properties.getProperty("Advance_amount3");
		if (Advance_amount3 != null)
			return Advance_amount3;
		else
			throw new RuntimeException("Advance_amount3 not specified in the Configuration.properties file.");
	}

	public static String getAdvance_amount_type3() {
		String Advance_amount_type3 = properties.getProperty("Advance_amount_type3");
		if (Advance_amount_type3 != null)
			return Advance_amount_type3;
		else
			throw new RuntimeException("Advance_amount_type3 not specified in the Configuration.properties file.");
	}

	public static String getEvent7() {
		String Event7 = properties.getProperty("Event7");
		if (Event7 != null)
			return Event7;
		else
			throw new RuntimeException("Event7 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_Credit_days3() {
		String No_of_Credit_days3 = properties.getProperty("No_of_Credit_days3");
		if (No_of_Credit_days3 != null)
			return No_of_Credit_days3;
		else
			throw new RuntimeException("No_of_Credit_days3 not specified in the Configuration.properties file.");
	}

	public static String getRecovery_percentage1() {
		String Recovery_percentage1 = properties.getProperty("Recovery_percentage1");
		if (Recovery_percentage1 != null)
			return Recovery_percentage1;
		else
			throw new RuntimeException("Recovery_percentage1 not specified in the Configuration.properties file.");
	}

	public static String getStrating_invoice_no3() {
		String Strating_invoice_no3 = properties.getProperty("Strating_invoice_no3");
		if (Strating_invoice_no3 != null)
			return Strating_invoice_no3;
		else
			throw new RuntimeException("Strating_invoice_no3 not specified in the Configuration.properties file.");
	}

	public static String getPercentage7() {
		String Percentage7 = properties.getProperty("Percentage7");
		if (Percentage7 != null)
			return Percentage7;
		else
			throw new RuntimeException("Percentage7 not specified in the Configuration.properties file.");
	}

	public static String getStrating_invoice_no4() {
		String Strating_invoice_no4 = properties.getProperty("Strating_invoice_no4");
		if (Strating_invoice_no4 != null)
			return Strating_invoice_no4;
		else
			throw new RuntimeException("Strating_invoice_no4 not specified in the Configuration.properties file.");
	}

	public static String getPercentage8() {
		String Percentage8 = properties.getProperty("Percentage8");
		if (Percentage8 != null)
			return Percentage8;
		else
			throw new RuntimeException("Percentage8 not specified in the Configuration.properties file.");
	}

	public static String getStrating_invoice_no5() {
		String Strating_invoice_no5 = properties.getProperty("Strating_invoice_no5");
		if (Strating_invoice_no5 != null)
			return Strating_invoice_no5;
		else
			throw new RuntimeException("Strating_invoice_no5 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days6() {
		String No_of_days6 = properties.getProperty("No_of_days6");
		if (No_of_days6 != null)
			return No_of_days6;
		else
			throw new RuntimeException("No_of_days6 not specified in the Configuration.properties file.");
	}

	public static String getRemarks10() {
		String Remarks10 = properties.getProperty("Remarks10");
		if (Remarks10 != null)
			return Remarks10;
		else
			throw new RuntimeException("Remarks10 not specified in the Configuration.properties file.");
	}

	public static String getNo_of_days7() {
		String No_of_days7 = properties.getProperty("No_of_days7");
		if (No_of_days7 != null)
			return No_of_days7;
		else
			throw new RuntimeException("No_of_days7 not specified in the Configuration.properties file.");
	}

	public static String getRemarks11() {
		String Remarks11 = properties.getProperty("Remarks11");
		if (Remarks11 != null)
			return Remarks11;
		else
			throw new RuntimeException("Remarks11 not specified in the Configuration.properties file.");
	}

	public static String getJON1() {
		String JON1 = properties.getProperty("JON1");
		if (JON1 != null)
			return JON1;
		else
			throw new RuntimeException("JON1 not specified in the Configuration.properties file.");
	}

	public static String getJob_order_master1() {
		String Job_order_master1 = properties.getProperty("Job_order_master1");
		if (Job_order_master1 != null)
			return Job_order_master1;
		else
			throw new RuntimeException("Job_order_master1 not specified in the Configuration.properties file.");
	}

	public static String getEvent8() {
		String Event8 = properties.getProperty("Event8");
		if (Event8 != null)
			return Event8;
		else
			throw new RuntimeException("Event8 not specified in the Configuration.properties file.");
	}

	public static String getEvent9() {
		String Event9 = properties.getProperty("Event9");
		if (Event9 != null)
			return Event9;
		else
			throw new RuntimeException("Event9 not specified in the Configuration.properties file.");
	}

	public static String getPassword() {
		String Password = properties.getProperty("Password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}

	public static String getUsername() {
		String Username = properties.getProperty("Username");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}

	public static String getInvalidusername() {
		String Invalidusername = properties.getProperty("Invalidusername");
		if (Invalidusername != null)
			return Invalidusername;
		else
			throw new RuntimeException("Invalidusername not specified in the Configuration.properties file.");
	}

	public static String getInvalidPassword() {
		String InvalidPassword = properties.getProperty("InvalidPassword");
		if (InvalidPassword != null)
			return InvalidPassword;
		else
			throw new RuntimeException("InvalidPassword not specified in the Configuration.properties file.");

	}

	public static String getEdit_date() {
		String Edit_date = properties.getProperty("Edit_date");
		if (Edit_date != null)
			return Edit_date;
		else
			throw new RuntimeException("Edit_date not specified in the Configuration.properties file.");

	}

	public static String getJob_Random_selection() {
		String Job_Random_selection = properties.getProperty("Job_Random_selection");
		if (Job_Random_selection != null)
			return Job_Random_selection;
		else
			throw new RuntimeException("Job_Random_selection not specified in the Configuration.properties file.");

	}

	public static String getCustomer_Random_selection() {
		String Customer_Random_selection = properties.getProperty("Customer_Random_selection");
		if (Customer_Random_selection != null)
			return Customer_Random_selection;
		else
			throw new RuntimeException("Customer_Random_selection not specified in the Configuration.properties file.");

	}

	public static String getInvoicetype_Random_selection() {
		String Invoicetype_Random_selection = properties.getProperty("Invoicetype_Random_selection");
		if (Invoicetype_Random_selection != null)
			return Invoicetype_Random_selection;
		else
			throw new RuntimeException(
					"Invoicetype_Random_selection not specified in the Configuration.properties file.");

	}

	public static String getCurrency_Random_selection() {
		String Currency_Random_selection = properties.getProperty("Currency_Random_selection");
		if (Currency_Random_selection != null)
			return Currency_Random_selection;
		else
			throw new RuntimeException("Currency_Random_selection not specified in the Configuration.properties file.");

	}

	public static String getPricing_Random_selection() {
		String Pricing_Random_selection = properties.getProperty("Pricing_Random_selection");
		if (Pricing_Random_selection != null)
			return Pricing_Random_selection;
		else
			throw new RuntimeException("Pricing_Random_selection not specified in the Configuration.properties file.");

	}

// *****************************************************************************************************************
//Added By : Praveen Kumar - Date : 21-10-2022	
	public static String getCreator_login_username() {
		String Creator_login_username = properties.getProperty("Creator_login_username");
		if (Creator_login_username != null)
			return Creator_login_username; // Pk
		else
			throw new RuntimeException("Creator_login_username not specified in the Configuration.properties file.");
	}

	public static String getCreator_login_password() {
		String Creator_login_password = properties.getProperty("Creator_login_password");
		if (Creator_login_password != null) // Pk
			return Creator_login_password;
		else
			throw new RuntimeException("Creator_login_password not specified in the Configuration.properties file.");
	}

	public static String getVendor_Code() {
		String Vendor_Code = properties.getProperty("Vendor_Code");
		if (Vendor_Code != null) // Pk
			return Vendor_Code;
		else
			throw new RuntimeException("Vendor_Code not specified in the Configuration.properties file.");
	}

	public static String getSchedule_Date() {
		String Schedule_Date = properties.getProperty("Schedule_Date");
		if (Schedule_Date != null) // Pk
			return Schedule_Date;
		else
			throw new RuntimeException("Schedule_Date not specified in the Configuration.properties file.");
	}

	public static String getCurrency() {
		String Currency = properties.getProperty("Currency");
		if (Currency != null) // Pk
			return Currency;
		else
			throw new RuntimeException("Currency not specified in the Configuration.properties file.");
	}

	public static String getDocument_No() {
		String Document_No = properties.getProperty("Document_No");
		if (Document_No != null) // Pk
			return Document_No;
		else
			throw new RuntimeException("Document_No not specified in the Configuration.properties file.");
	}
//	***********************************************************************************************************************
// Added by Sneha Date: 13 Oct 2022

	public static String getEnter_FIN_Username() {
		String Enter_FIN_Username = properties.getProperty("Enter_FIN_Username");
		if (Enter_FIN_Username != null)
			return Enter_FIN_Username;
		else
			throw new RuntimeException("Enter_FIN_Username not specified in the Configuration.properties file.");
	}

	public static String getEnter_FIN_Password() {
		String Enter_FIN_Password = properties.getProperty("Enter_FIN_Password");
		if (Enter_FIN_Password != null)
			return Enter_FIN_Password;
		else
			throw new RuntimeException("Enter_FIN_Password not specified in the Configuration.properties file.");
	}

	public static String getDocument_Type1_FIN() {
		String Document_Type1_FIN = properties.getProperty("Document_Type1_FIN");
		if (Document_Type1_FIN != null)
			return Document_Type1_FIN;
		else
			throw new RuntimeException("Document_Type1_FIN not specified in the Configuration.properties file.");
	}

	public static String getRegister_Type1_FIN() {
		String Register_Type1_FIN = properties.getProperty("Register_Type1_FIN");
		if (Register_Type1_FIN != null)
			return Register_Type1_FIN;
		else
			throw new RuntimeException("Register_Type1_FIN not specified in the Configuration.properties file.");
	}

	public static String getJob_Code_FIN() {
		String Job_Code_FIN = properties.getProperty("Job_Code_FIN");
		if (Job_Code_FIN != null)
			return Job_Code_FIN;
		else
			throw new RuntimeException("Job_Code_FIN not specified in the Configuration.properties file.");
	}

//	***********************************************************************************************************************
//Added By : Tamil	 Date : 28-10-2022
// Advance Search	
	public static String getadvance_search_Input_jobCode1() {
		String advance_search_Input_jobCode1 = properties.getProperty("advance_search_Input_jobCode1");
		if (advance_search_Input_jobCode1 != null)
			return advance_search_Input_jobCode1;
		else
			throw new RuntimeException(
					"advance_search_Input_jobCode1 not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Input_jobCode2() {
		String advance_search_Input_jobCode2 = properties.getProperty("advance_search_Input_jobCode2");
		if (advance_search_Input_jobCode2 != null)
			return advance_search_Input_jobCode2;
		else
			throw new RuntimeException(
					"advance_search_Input_jobCode2 not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Input_jobCode_for_All() {
		String advance_search_Input_jobCode_for_All = properties.getProperty("advance_search_Input_jobCode_for_All");
		if (advance_search_Input_jobCode_for_All != null)
			return advance_search_Input_jobCode_for_All;
		else
			throw new RuntimeException(
					"advance_search_Input_jobCode_for_All not specified in the Configuration.properties file.");
	}

//	***********************************************************************************************************************	

//Added By : Tamil	 Date : 28-10-2022
// Advance Search	
	public static String getadvance_search_Input_vendor() {
		String advance_search_Input_vendor = properties.getProperty("advance_search_Input_vendor");
		if (advance_search_Input_vendor != null)
			return advance_search_Input_vendor;
		else
			throw new RuntimeException(
					"advance_search_Input_vendor not specified in the Configuration.properties file.");
	}

//	***********************************************************************************************************************	
	// Added By : Tamil Date : 31-10-2022
	// Advance Search By Date
	public static String getadvance_search_Date_selection() {
		String advance_search_Date_selection = properties.getProperty("advance_search_Date_selection");
		if (advance_search_Date_selection != null)
			return advance_search_Date_selection;
		else
			throw new RuntimeException(
					"advance_search_Date_selection not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Random_To_Date_selection() {
		String advance_search_Random_To_Date_selection = properties
				.getProperty("advance_search_Random_To_Date_selection");
		if (advance_search_Random_To_Date_selection != null)
			return advance_search_Random_To_Date_selection;
		else
			throw new RuntimeException(
					"advance_search_Random_To_Date_selection not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Date_From() {
		String advance_search_Date_From = properties.getProperty("advance_search_Date_From");
		if (advance_search_Date_From != null)
			return advance_search_Date_From;
		else
			throw new RuntimeException(
					"advance_search_Random_To_Date_selection not specified in the Configuration.properties file.");
	}

	public static String getadvance_search_Date_To() {
		String advance_search_Date_To = properties.getProperty("advance_search_Date_To");
		if (advance_search_Date_To != null)
			return advance_search_Date_To;
		else
			throw new RuntimeException("advance_search_Date_To not specified in the Configuration.properties file.");
	}

//		***********************************************************************************************************************	

	// Added By : Tamil Date : 31-10-2022
	// Advance Search - Cluster Elements

	public static String getIC() {
		String IC = properties.getProperty("IC");
		if (IC != null)
			return IC;
		else
			throw new RuntimeException("IC not specified in the Configuration.properties file.");
	}

	public static String getSBG() {
		String SBG = properties.getProperty("SBG");
		if (SBG != null)
			return SBG;
		else
			throw new RuntimeException("SBG not specified in the Configuration.properties file.");
	}

	public static String getBU() {
		String BU = properties.getProperty("BU");
		if (BU != null)
			return BU;
		else
			throw new RuntimeException("advance_search_Date_To not specified in the Configuration.properties file.");
	}

	public static String getSegment() {
		String Segment = properties.getProperty("Segment");
		if (Segment != null)
			return Segment;
		else
			throw new RuntimeException("Segment not specified in the Configuration.properties file.");
	}

	public static String getClusterOffice() {
		String ClusterOffice = properties.getProperty("ClusterOffice");
		if (ClusterOffice != null)
			return ClusterOffice;
		else
			throw new RuntimeException("ClusterOffice not specified in the Configuration.properties file.");
	}

	public static String getRegion() {
		String Region = properties.getProperty("Region");
		if (Region != null)
			return Region;
		else
			throw new RuntimeException("Region not specified in the Configuration.properties file.");
	}

	public static String getLocation() {
		String Location = properties.getProperty("Location");
		if (Location != null)
			return Location;
		else
			throw new RuntimeException("Location not specified in the Configuration.properties file.");
	}

	public static String getZone() {
		String Zone = properties.getProperty("Zone");
		if (Zone != null)
			return Zone;
		else
			throw new RuntimeException("Zone not specified in the Configuration.properties file.");
	}

	public static String getArea() {
		String Area = properties.getProperty("Area");
		if (Area != null)
			return Area;
		else
			throw new RuntimeException("Area not specified in the Configuration.properties file.");
	}

//		***********************************************************************************************************************	

	// Added By : Tamil Date : 02-11-2022
	// Advance Search - List Details - Past Date

	public static String getAdvance_Search_List_Details_Past_Date_Selection() {
		String Advance_Search_List_Details_Past_Date_Selection = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection");
		if (Advance_Search_List_Details_Past_Date_Selection != null)
			return Advance_Search_List_Details_Past_Date_Selection;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Manual() {
		String Advance_Search_List_Details_Past_Date_Selection_Manual = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Manual");
		if (Advance_Search_List_Details_Past_Date_Selection_Manual != null)
			return Advance_Search_List_Details_Past_Date_Selection_Manual;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Manual not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Year() {
		String Advance_Search_List_Details_Past_Date_Selection_Year = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Year");
		if (Advance_Search_List_Details_Past_Date_Selection_Year != null)
			return Advance_Search_List_Details_Past_Date_Selection_Year;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Year not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Month() {
		String Advance_Search_List_Details_Past_Date_Selection_Month = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Month");
		if (Advance_Search_List_Details_Past_Date_Selection_Month != null)
			return Advance_Search_List_Details_Past_Date_Selection_Month;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Month not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Date() {
		String Advance_Search_List_Details_Past_Date_Selection_Date = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Date");
		if (Advance_Search_List_Details_Past_Date_Selection_Date != null)
			return Advance_Search_List_Details_Past_Date_Selection_Date;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Date not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Year_To() {
		String Advance_Search_List_Details_Past_Date_Selection_Year_To = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Year_To");
		if (Advance_Search_List_Details_Past_Date_Selection_Year_To != null)
			return Advance_Search_List_Details_Past_Date_Selection_Year_To;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Year_To not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Month_To() {
		String Advance_Search_List_Details_Past_Date_Selection_Month_To = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Month_To");
		if (Advance_Search_List_Details_Past_Date_Selection_Month_To != null)
			return Advance_Search_List_Details_Past_Date_Selection_Month_To;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Month_To not specified in the Configuration.properties file.");
	}

	public static String getAdvance_Search_List_Details_Past_Date_Selection_Date_To() {
		String Advance_Search_List_Details_Past_Date_Selection_Date_To = properties
				.getProperty("Advance_Search_List_Details_Past_Date_Selection_Date_To");
		if (Advance_Search_List_Details_Past_Date_Selection_Date_To != null)
			return Advance_Search_List_Details_Past_Date_Selection_Date_To;
		else
			throw new RuntimeException(
					"Advance_Search_List_Details_Past_Date_Selection_Date_To not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Order_No() {
		String Invoice_Registration_Advance_Search_Filter_by_Order_No = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Order_No");
		if (Invoice_Registration_Advance_Search_Filter_by_Order_No != null)
			return Invoice_Registration_Advance_Search_Filter_by_Order_No;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Order_No not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Order_Type() {
		String Invoice_Registration_Advance_Search_Filter_by_Order_Type = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Order_Type");
		if (Invoice_Registration_Advance_Search_Filter_by_Order_Type != null)
			return Invoice_Registration_Advance_Search_Filter_by_Order_Type;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Order_Type not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Date() {
		String Invoice_Registration_Advance_Search_Filter_by_Order_Date_Date = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Order_Date_Date");
		if (Invoice_Registration_Advance_Search_Filter_by_Order_Date_Date != null)
			return Invoice_Registration_Advance_Search_Filter_by_Order_Date_Date;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Order_Date_Date not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Month() {
		String Invoice_Registration_Advance_Search_Filter_by_Order_Date_Month = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Order_Date_Month");
		if (Invoice_Registration_Advance_Search_Filter_by_Order_Date_Month != null)
			return Invoice_Registration_Advance_Search_Filter_by_Order_Date_Month;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Order_Date_Month not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Order_Date_Year() {
		String Invoice_Registration_Advance_Search_Filter_by_Order_Date_Year = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Order_Date_Year");
		if (Invoice_Registration_Advance_Search_Filter_by_Order_Date_Year != null)
			return Invoice_Registration_Advance_Search_Filter_by_Order_Date_Year;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Order_Date_Year not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Type() {
		String Invoice_Registration_Advance_Search_Filter_by_Type = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Type");
		if (Invoice_Registration_Advance_Search_Filter_by_Type != null)
			return Invoice_Registration_Advance_Search_Filter_by_Type;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Type not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Order_Amount() {
		String Invoice_Registration_Advance_Search_Filter_by_Order_Amount = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Order_Amount");
		if (Invoice_Registration_Advance_Search_Filter_by_Order_Amount != null)
			return Invoice_Registration_Advance_Search_Filter_by_Order_Amount;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Order_Amount not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Amount() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Date not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Month not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Year not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount() {
		String Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount");
		if (Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount != null)
			return Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No() {
		String Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No");
		if (Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No != null)
			return Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No() {
		String Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No");
		if (Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No != null)
			return Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date() {
		String Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date");
		if (Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date != null)
			return Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Date not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month() {
		String Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month");
		if (Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month != null)
			return Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Month not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year() {
		String Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year");
		if (Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year != null)
			return Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Year not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Payment_Mode() {
		String Invoice_Registration_Advance_Search_Filter_by_Payment_Mode = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Payment_Mode");
		if (Invoice_Registration_Advance_Search_Filter_by_Payment_Mode != null)
			return Invoice_Registration_Advance_Search_Filter_by_Payment_Mode;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Payment_Mode not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_NEFT_Amount() {
		String Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount");
		if (Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount != null)
			return Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Claim() {
		String Invoice_Registration_Advance_Search_Filter_by_Claim = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Claim");
		if (Invoice_Registration_Advance_Search_Filter_by_Claim != null)
			return Invoice_Registration_Advance_Search_Filter_by_Claim;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Claim not specified in the Configuration.properties file.");
	}

	public static String getInvoice_Registration_Advance_Search_Filter_by_Currency() {
		String Invoice_Registration_Advance_Search_Filter_by_Currency = properties
				.getProperty("Invoice_Registration_Advance_Search_Filter_by_Currency");
		if (Invoice_Registration_Advance_Search_Filter_by_Currency != null)
			return Invoice_Registration_Advance_Search_Filter_by_Currency;
		else
			throw new RuntimeException(
					"Invoice_Registration_Advance_Search_Filter_by_Currency not specified in the Configuration.properties file.");
	}

	
}
