package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private static Properties properties;
	private final String propertyFilePath= "src//main//java//configuration//Configuration.properties";

	
	public ConfigFileReader(){
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
	public static String getDriverPath_Chrome(){
		String getDriverPath_Chrome = properties.getProperty("DriverPath_Chrome");
		if(getDriverPath_Chrome!= null) return getDriverPath_Chrome;
		else throw new RuntimeException("driverPath_Chrome not specified in the Configuration.properties file.");		
	}
	public static String getDriverPath_Firefox(){
		String driverPath = properties.getProperty("DriverPath_Firefox");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath_Firefox not specified in the Configuration.properties file.");		
	}
	public static String getDriverPath_Edge(){
		String DriverPath_Edge = properties.getProperty("DriverPath_Edge");
		if(DriverPath_Edge!= null) return DriverPath_Edge;
		else throw new RuntimeException("DriverPath_Edge not specified in the Configuration.properties file.");		
	}
	public static String getBrowser(){
		String Browser = properties.getProperty("Browser");
		if(Browser!= null) return Browser;
		else throw new RuntimeException("Browser not specified in the Configuration.properties file.");		
	}
	
	public static String getEnvironment(){
		String Environment = properties.getProperty("Environment");
		if(Environment!= null) return Environment;
		else throw new RuntimeException("Browser not specified in the Configuration.properties file.");		
	}
	
	public static String getUsername(){
		String Username = properties.getProperty("Username");
		if(Username!= null) return Username;
		else throw new RuntimeException("Username not specified in the Configuration.properties file.");		
	}
	
	public static String getBQUsername(){
		String BQUsername = properties.getProperty("BQUsername");
		if(BQUsername!= null) return BQUsername;
		else throw new RuntimeException("BQUsername not specified in the Configuration.properties file.");		
	}
	
	public static String getBQVendorTHUsername(){
		String BQVendorTHUsername = properties.getProperty("BQVendorTHUsername");
		if(BQVendorTHUsername!= null) return BQVendorTHUsername;
		else throw new RuntimeException("BQVendorTHUsername not specified in the Configuration.properties file.");		
	}
	
	public static String getBQVendorCHUsername(){
		String BQVendorCHUsername = properties.getProperty("BQVendorCHUsername");
		if(BQVendorCHUsername!= null) return BQVendorCHUsername;
		else throw new RuntimeException("BQVendorCHUsername not specified in the Configuration.properties file.");		
	}
	
	public static String getBQVendorDPUsername(){
		String BQVendorDPUsername = properties.getProperty("BQVendorDPUsername");
		if(BQVendorDPUsername!= null) return BQVendorDPUsername;
		else throw new RuntimeException("BQVendorDPUsername not specified in the Configuration.properties file.");		
	}
	
	public static String getTCCUsername(){
		String TCCUsername = properties.getProperty("TCCUsername");
		if(TCCUsername!= null) return TCCUsername;
		else throw new RuntimeException("TCCUsername not specified in the Configuration.properties file.");		
	}
	
	public static String getPassword(){
		String Password = properties.getProperty("Password");
		if(Password!= null) return Password;
		else throw new RuntimeException("Username not specified in the Configuration.properties file.");		
	}
	
	public static long getImplicitWaitTime() {		
		String ImplicitWaitTime = properties.getProperty("ImplicitWaitTime");
		if(ImplicitWaitTime != null) return Long.parseLong(ImplicitWaitTime);
		else throw new RuntimeException("ImplicitWaitTime not specified in the Configuration.properties file.");		
	}
	
	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	public static String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	public static String getScreenshotPath_Pass(){
		String ScreenshotPath_Pass = properties.getProperty("ScreenshotPath_Pass");
		if(ScreenshotPath_Pass!= null) return ScreenshotPath_Pass;
		else throw new RuntimeException("ScreenshotPath_Pass not specified in the Configuration.properties file.");		
	}
	public static String getScreenshotPath_Fail(){
		String ScreenshotPath_Fail = properties.getProperty("ScreenshotPath_Fail");
		if(ScreenshotPath_Fail!= null) return ScreenshotPath_Fail;
		else throw new RuntimeException("ScreenshotPath_Fail not specified in the Configuration.properties file.");		
	}
	
	public static String getReportPath(){
		String ReportPath = properties.getProperty("ReportPath");
		if(ReportPath!= null) return ReportPath;
		else throw new RuntimeException("ReportPath not specified in the Configuration.properties file.");		
	}
	
	public static String getDB_Url(){
		String DB_Url = properties.getProperty("DB_Url");
		if(DB_Url!= null) return DB_Url;
		else throw new RuntimeException("DB_Url not specified in the Configuration.properties file.");		
	}

	public static String getDB_User(){
		String DB_User = properties.getProperty("DB_User");
		if(DB_User!= null) return DB_User;
		else throw new RuntimeException("DB_User not specified in the Configuration.properties file.");		
	}
	
	public static String getDB_Pwd(){
		String DB_Pwd = properties.getProperty("DB_Pwd");
		if(DB_Pwd!= null) return DB_Pwd;
		else throw new RuntimeException("DB_Pwd not specified in the Configuration.properties file.");		
	}
	
	public static String getDB_Loading_Class(){
		String DB_Loading_Class = properties.getProperty("DB_Loading_Class");
		if(DB_Loading_Class!= null) return DB_Loading_Class;
		else throw new RuntimeException("DB_Pwd not specified in the Configuration.properties file.");		
	}
//***********************************************************************************************************************//
	//Login Test-Data
		public static String getApprover_username(){
			String Approver_username = properties.getProperty("Approver_username");
			if(Approver_username!= null) return Approver_username;
			else throw new RuntimeException("Approver_username not specified in the Configuration.properties file.");		
		}
		public static String getApprover_password(){ 
			String Approver_password = properties.getProperty("Approver_password");
			if(Approver_password!= null) return Approver_password;
			else throw new RuntimeException("Approver_password not specified in the Configuration.properties file.");		
		}
		public static String getCreator_username(){
			String Creator_username = properties.getProperty("Creator_username");
			if(Creator_username!= null) return Creator_username;
			else throw new RuntimeException("Creator_username not specified in the Configuration.properties file.");		
		}
		public static String getCreator_password(){
			String Creator_password = properties.getProperty("Creator_password");
			if(Creator_password!= null) return Creator_password;
			else throw new RuntimeException("Creator_password not specified in the Configuration.properties file.");		
		}
		public static String getConfiguration_username(){
			String Configuration_username = properties.getProperty("Configuration_username");
			if(Configuration_username!= null) return Configuration_username;
			else throw new RuntimeException("Configuration_username not specified in the Configuration.properties file.");		
		}
		public static String getConfiguration_password(){
			String Configuration_password = properties.getProperty("Configuration_password");
			if(Configuration_password!= null) return Configuration_password;
			else throw new RuntimeException("Configuration_password not specified in the Configuration.properties file.");		
		}
		public static String getskip_session(){
			String skip_session = properties.getProperty("skip_session");
			if(skip_session!= null) return skip_session;
			else throw new RuntimeException("skip_session not specified in the Configuration.properties file.");		
		}
//***********************************************************************************************************************//
		
		//DB_Query
		public static String getSQL_Query1_Table(){
			String SQL_Query1_Table = properties.getProperty("SQL_Query1_Table");
			if(SQL_Query1_Table!= null) return SQL_Query1_Table;
			else throw new RuntimeException("SQL_Query1_Table not specified in the Configuration.properties file.");		
		}
		public static String getSQL_Query1_Column(){
			String SQL_Query1_Column = properties.getProperty("SQL_Query1_Column");
			if(SQL_Query1_Column!= null) return SQL_Query1_Column;
			else throw new RuntimeException("SQL_Query1_Column not specified in the Configuration.properties file.");		
		}
//***********************************************************************************************************************//
		//RFQ Create Page

public static String getSearchMenu_RFQ(){
	String SearchMenu_RFQ = properties.getProperty("RFQ");
	if(SearchMenu_RFQ!= null) return SearchMenu_RFQ;
	else throw new RuntimeException("SearchMenu_RFQ not specified in the Configuration.properties file.");		
}

public static String getSearchMenu_eAuction(){
	String SearchMenu_eAuction = properties.getProperty("eAuction");
	if(SearchMenu_eAuction!= null) return SearchMenu_eAuction;
	else throw new RuntimeException("SearchMenu_eAuction not specified in the Configuration.properties file.");		
}


public static String getScope_RFQ(){
	String Scope_RFQ = properties.getProperty("Scope_RFQ");
	if(Scope_RFQ!= null) return Scope_RFQ;
	else throw new RuntimeException("Scope_RFQ not specified in the Configuration.properties file.");		
}

public static String getSRScope_RFQ(){
	String getSRScope_RFQ = properties.getProperty("SRScope_RFQ");
	if(getSRScope_RFQ!= null) return getSRScope_RFQ;
	else throw new RuntimeException("SRScope_RFQ not specified in the Configuration.properties file.");		
}


public static String getSRScope_RDRFQ(){
	String getSRScope_RDRFQ = properties.getProperty("SR_Scope_RDRFQ");
	if(getSRScope_RDRFQ!= null) return getSRScope_RDRFQ;
	else throw new RuntimeException("SRScope_RFQ not specified in the Configuration.properties file.");		
}

public static String getQuantity_RFQ(){
	String Quantity_RFQ = properties.getProperty("Quantity_RFQ");
	if(Quantity_RFQ!= null) return Quantity_RFQ;
	else throw new RuntimeException("Quantity_RFQ not specified in the Configuration.properties file.");		
}

public static String getEditQuantity_RFQ(){
	String EditQuantity_RFQ = properties.getProperty("EditQuantity_RFQ");
	if(EditQuantity_RFQ!= null) return EditQuantity_RFQ;
	else throw new RuntimeException("EditQuantity_RFQ not specified in the Configuration.properties file.");		
}

public static String getDeliveryQty_RFQ(){
	String DeliveryQty_RFQ = properties.getProperty("DeliveryQty_RFQ");
	if(DeliveryQty_RFQ!= null) return DeliveryQty_RFQ;
	else throw new RuntimeException("DeliveryQty_RFQ not specified in the Configuration.properties file.");		
}

public static String getVendor_RFQ(){
	String Vendor_RFQ = properties.getProperty("getVendor_RFQ");
	if(Vendor_RFQ!= null) return Vendor_RFQ;
	else throw new RuntimeException("Vendor_RFQ not specified in the Configuration.properties file.");		
}

public static String getVendorTh_RFQ(){
	String VendorTh_RFQ = properties.getProperty("VendorTh_RFQ");
	if(VendorTh_RFQ!= null) return VendorTh_RFQ;
	else throw new RuntimeException("VendorTh_RFQ not specified in the Configuration.properties file.");		
}

public static String getVendorCh_RFQ(){
	String VendorCh_RFQ = properties.getProperty("VendorCh_RFQ");
	if(VendorCh_RFQ!= null) return VendorCh_RFQ;
	else throw new RuntimeException("VendorCh_RFQ not specified in the Configuration.properties file.");		
}

public static String getVendorDp_RFQ(){
	String VendorDp_RFQ = properties.getProperty("VendorDp_RFQ");
	if(VendorDp_RFQ!= null) return VendorDp_RFQ;
	else throw new RuntimeException("VendorDp_RFQ not specified in the Configuration.properties file.");		
}

public static String getRelease_RFQ(){
	String Release_RFQ = properties.getProperty("getRelease_RFQ");
	if(Release_RFQ!= null) return Release_RFQ;
	else throw new RuntimeException("getRelease_RFQ not specified in the Configuration.properties file.");		
}

public static String getRelease_Auction(){
	String Release_Auction = properties.getProperty("Release_Auction");
	if(Release_Auction!= null) return Release_Auction;
	else throw new RuntimeException("Release_Auction not specified in the Configuration.properties file.");		
}



public static String getReleaseCreate_RFQ(){
	String Release_RFQ = properties.getProperty("getReleaseCreate_RFQ");
	if(Release_RFQ!= null) return Release_RFQ;
	else throw new RuntimeException("getRelease_RFQ not specified in the Configuration.properties file.");		
}

public static String getEvent_RFQ(){
	String Event_RFQ = properties.getProperty("getEvent_RFQ");
	if(Event_RFQ!= null) return Event_RFQ;
	else throw new RuntimeException("getEvent_RFQ not specified in the Configuration.properties file.");		
}

public static String getReferenceValue_RFQ(){
	String ReferenceValue_RFQ = properties.getProperty("getReferenceValue_RFQ");
	if(ReferenceValue_RFQ!= null) return ReferenceValue_RFQ;
	else throw new RuntimeException("ReferenceValue_RFQ not specified in the Configuration.properties file.");		
}

public static String getReferenceValue_Auc(){
	String ReferenceValue_Auc = properties.getProperty("getReferenceValue_Auc");
	if(ReferenceValue_Auc!= null) return ReferenceValue_Auc;
	else throw new RuntimeException("ReferenceValue_Auc not specified in the Configuration.properties file.");		
}

public static String getReferenceValue_SRRFQ(){
	String ReferenceValue_SRRFQ = properties.getProperty("SR_getReferenceValue_RFQ");
	if(ReferenceValue_SRRFQ!= null) return ReferenceValue_SRRFQ;
	else throw new RuntimeException("SR_ReferenceValue_RFQ not specified in the Configuration.properties file.");		
}

public static String getCreditDays_RFQ(){
	String getCreditDays_RFQ = properties.getProperty("getCreditDays_RFQ");
	if(getCreditDays_RFQ!= null) return getCreditDays_RFQ;
	else throw new RuntimeException("getCreditDays_RFQ not specified in the Configuration.properties file.");		
}

public static String getPaymentMode_RFQ(){
	String getPaymentMode_RFQ = properties.getProperty("PaymentMode_RFQ");
	if(getPaymentMode_RFQ!= null) return getPaymentMode_RFQ;
	else throw new RuntimeException("getCreditDays_RFQ not specified in the Configuration.properties file.");		
}


public static String getReferenceDate_RFQ(){
	String getReferenceDate_RFQ = properties.getProperty("ReferenceDate_RFQ");
	if(getReferenceDate_RFQ!= null) return getReferenceDate_RFQ;
	else throw new RuntimeException("getReferenceDate_RFQ not specified in the Configuration.properties file.");		
}


public static String getReferenceDate_SRRFQ(){
	String getReferenceDate_SRRFQ = properties.getProperty("SR_ReferenceDate_RFQ");
	if(getReferenceDate_SRRFQ!= null) return getReferenceDate_SRRFQ;
	else throw new RuntimeException("getReferenceDate_RFQ not specified in the Configuration.properties file.");		
}

public static String getNewPaymentRelease_RFQ(){
	String getNewPaymentRelease_RFQ = properties.getProperty("NewPaymentRelease_RFQ");
	if(getNewPaymentRelease_RFQ!= null) return getNewPaymentRelease_RFQ;
	else throw new RuntimeException("getReferenceDate_RFQ not specified in the Configuration.properties file.");		
}


public static String getUDPaymentRelease_RFQ(){
	String getUDPaymentRelease_RFQ = properties.getProperty("UpdategetRelease_RFQ");
	if(getUDPaymentRelease_RFQ!= null) return getUDPaymentRelease_RFQ;
	else throw new RuntimeException("UpdategetRelease_RFQ not specified in the Configuration.properties file.");		
}
public static String getLDApplicableDate_RFQ(){
	String getLDApplicableDate_RFQ = properties.getProperty("LDApplicableDate_RFQ");
	if(getLDApplicableDate_RFQ!= null) return getLDApplicableDate_RFQ;
	else throw new RuntimeException("LDApplicableDate_RFQ not specified in the Configuration.properties file.");		
}

public static String getLDApplicableDate_SRRFQ(){
	String getLDApplicableDate_SRRFQ = properties.getProperty("SR_LDApplicableDate_RFQ");
	if(getLDApplicableDate_SRRFQ!= null) return getLDApplicableDate_SRRFQ;
	else throw new RuntimeException("SR_LDApplicableDate_RFQ not specified in the Configuration.properties file.");		
}

public static String getLDValueAppliedOn_RFQ(){
	String getLDValueAppliedOn_RFQ = properties.getProperty("LDValueAppliedOn_RFQ");
	if(getLDValueAppliedOn_RFQ!= null) return getLDValueAppliedOn_RFQ;
	else throw new RuntimeException("LDValueAppliedOn_RFQ not specified in the Configuration.properties file.");		
}

public static String getLDValueAppliedOn_SRRFQ(){
	String getLDValueAppliedOn_SRRFQ = properties.getProperty("SR_LDValueAppliedOn_RFQ");
	if(getLDValueAppliedOn_SRRFQ!= null) return getLDValueAppliedOn_SRRFQ;
	else throw new RuntimeException("SR_LDValueAppliedOn_RFQ not specified in the Configuration.properties file.");		
}


public static String getLDvaluePercentage_RFQ(){
	String getLDvaluePercentage_RFQ = properties.getProperty("LDvaluePercentage_RFQ");
	if(getLDvaluePercentage_RFQ!= null) return getLDvaluePercentage_RFQ;
	else throw new RuntimeException("LDvaluePercentage_RFQ not specified in the Configuration.properties file.");		
}
public static String getDuration_RFQ(){
	String getDuration_RFQ = properties.getProperty("Duration_RFQ");
	if(getDuration_RFQ!= null) return getDuration_RFQ;
	else throw new RuntimeException("getDuration_RFQ not specified in the Configuration.properties file.");		
}

public static String getNoOfYear_RFQ(){
	String getNoOfYear_RFQ = properties.getProperty("NoOfYear_RFQ");
	if(getNoOfYear_RFQ!= null) return getNoOfYear_RFQ;
	else throw new RuntimeException("NoOfYear_RFQ not specified in the Configuration.properties file.");		
}
public static String getMaximumofPOValue_RFQ(){
	String getMaximumofPOValue_RFQ = properties.getProperty("MaximumofPOValue_RFQ");
	if(getMaximumofPOValue_RFQ!= null) return getMaximumofPOValue_RFQ;
	else throw new RuntimeException("getMaximumofPOValue_RFQ specified in the Configuration.properties file.");		
}
public static String getCategory_RFQ(){
	String getCategory_RFQ = properties.getProperty("Category_RFQ");
	if(getCategory_RFQ!= null) return getCategory_RFQ;
	else throw new RuntimeException("getCategory_RFQ specified in the Configuration.properties file.");		
}

public static String getCategoryValue_RFQ(){
	String getCategoryValue_RFQ = properties.getProperty("CategoryValue_RFQ");
	if(getCategoryValue_RFQ!= null) return getCategoryValue_RFQ;
	else throw new RuntimeException("getCategoryValue_RFQ specified in the Configuration.properties file.");		
}

public static String getOtherCostRemarks_RFQ(){
	String getOtherCostRemarks_RFQ = properties.getProperty("OtherCostRemarks_RFQ");
	if(getOtherCostRemarks_RFQ!= null) return getOtherCostRemarks_RFQ;
	else throw new RuntimeException("getOtherCostRemarks_RFQ specified in the Configuration.properties file.");		
}
public static String getDPLPeriod_RFQ(){
	String getDPLPeriod_RFQ = properties.getProperty("DPLPeriod_RFQ");
	if(getDPLPeriod_RFQ!= null) return getDPLPeriod_RFQ;
	else throw new RuntimeException("getDPLPeriod_RFQ specified in the Configuration.properties file.");		
}

public static String getDurationDLP_RFQ(){
	String getDurationDLP_RFQ = properties.getProperty("DurationDLP_RFQ");
	if(getDurationDLP_RFQ!= null) return getDurationDLP_RFQ;
	else throw new RuntimeException("getDPLPeriod_RFQ specified in the Configuration.properties file.");		
}

public static String getEventsDLP_RFQ(){
	String getEventsDLP_RFQ = properties.getProperty("EventsDLP_RFQ");
	if(getEventsDLP_RFQ!= null) return getEventsDLP_RFQ;
	else throw new RuntimeException("getDPLPeriod_RFQ specified in the Configuration.properties file.");		
}
public static String getPaymentTermsSTQ_RFQ(){
	String getPaymentTermsSTQ_RFQ = properties.getProperty("PaymentTermsSTQ_RFQ");
	if(getPaymentTermsSTQ_RFQ!= null) return getPaymentTermsSTQ_RFQ;
	else throw new RuntimeException("getPaymentTermsSTQ_RFQ specified in the Configuration.properties file.");		
}


public static String getYourBid_Auction(){
	String YourBid_Auction = properties.getProperty("YourBid_Auction");
	if(YourBid_Auction!= null) return YourBid_Auction;
	else throw new RuntimeException("YourBid_Auction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRAuction(){
	String YourBid_PRAuction = properties.getProperty("YourBid_PRAuction");
	if(YourBid_PRAuction!= null) return YourBid_PRAuction;
	else throw new RuntimeException("YourBid_PRAuction specified in the Configuration.properties file.");		
}


public static String getYourBid_PRMultiMaterialAuction(){
	String YourBid_PRMultiMaterialAuction = properties.getProperty("YourBid_PRMultiMaterialAuction");
	if(YourBid_PRMultiMaterialAuction!= null) return YourBid_PRMultiMaterialAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterialAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial1BaseRateAuction(){
	String YourBid_PRMultiMaterial1BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial1BaseRateAuction");
	if(YourBid_PRMultiMaterial1BaseRateAuction!= null) return YourBid_PRMultiMaterial1BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial1BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial2BaseRateAuction(){
	String YourBid_PRMultiMaterial2BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial2BaseRateAuction");
	if(YourBid_PRMultiMaterial2BaseRateAuction!= null) return YourBid_PRMultiMaterial2BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial2BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial3BaseRateAuction(){
	String YourBid_PRMultiMaterial3BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial3BaseRateAuction");
	if(YourBid_PRMultiMaterial3BaseRateAuction!= null) return YourBid_PRMultiMaterial3BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial3BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial4BaseRateAuction(){
	String YourBid_PRMultiMaterial4BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial4BaseRateAuction");
	if(YourBid_PRMultiMaterial4BaseRateAuction!= null) return YourBid_PRMultiMaterial4BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial4BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial1V1BaseRateAuction(){
	String YourBid_PRMultiMaterial1V1BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial1V1BaseRateAuction");
	if(YourBid_PRMultiMaterial1V1BaseRateAuction!= null) return YourBid_PRMultiMaterial1V1BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial1V1BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial2V1BaseRateAuction(){
	String YourBid_PRMultiMaterial1V1BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial2V1BaseRateAuction");
	if(YourBid_PRMultiMaterial1V1BaseRateAuction!= null) return YourBid_PRMultiMaterial1V1BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial1V1BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial3V1BaseRateAuction(){
	String YourBid_PRMultiMaterial3V1BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial3V1BaseRateAuction");
	if(YourBid_PRMultiMaterial3V1BaseRateAuction!= null) return YourBid_PRMultiMaterial3V1BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial3V1BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial4V1BaseRateAuction(){
	String YourBid_PRMultiMaterial4V1BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial4V1BaseRateAuction");
	if(YourBid_PRMultiMaterial4V1BaseRateAuction!= null) return YourBid_PRMultiMaterial4V1BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial4V1BaseRateAuction specified in the Configuration.properties file.");		
}


public static String getYourBid_PRMultiMaterial1V2BaseRateAuction(){
	String YourBid_PRMultiMaterial1V2BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial1V2BaseRateAuction");
	if(YourBid_PRMultiMaterial1V2BaseRateAuction!= null) return YourBid_PRMultiMaterial1V2BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial1V2BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial2V2BaseRateAuction(){
	String YourBid_PRMultiMaterial1V2BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial2V2BaseRateAuction");
	if(YourBid_PRMultiMaterial1V2BaseRateAuction!= null) return YourBid_PRMultiMaterial1V2BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial1V2BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial3V2BaseRateAuction(){
	String YourBid_PRMultiMaterial3V2BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial3V2BaseRateAuction");
	if(YourBid_PRMultiMaterial3V2BaseRateAuction!= null) return YourBid_PRMultiMaterial3V2BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial3V2BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial4V2BaseRateAuction(){
	String YourBid_PRMultiMaterial4V2BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial4V2BaseRateAuction");
	if(YourBid_PRMultiMaterial4V2BaseRateAuction!= null) return YourBid_PRMultiMaterial4V2BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial4V2BaseRateAuction specified in the Configuration.properties file.");		
}


public static String getYourBid_PRMultiMaterial1V3BaseRateAuction(){
	String YourBid_PRMultiMaterial1V3BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial1V3BaseRateAuction");
	if(YourBid_PRMultiMaterial1V3BaseRateAuction!= null) return YourBid_PRMultiMaterial1V3BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial1V3BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial2V3BaseRateAuction(){
	String YourBid_PRMultiMaterial2V3BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial2V3BaseRateAuction");
	if(YourBid_PRMultiMaterial2V3BaseRateAuction!= null) return YourBid_PRMultiMaterial2V3BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial2V3BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial3V3BaseRateAuction(){
	String YourBid_PRMultiMaterial3V3BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial3V3BaseRateAuction");
	if(YourBid_PRMultiMaterial3V3BaseRateAuction!= null) return YourBid_PRMultiMaterial3V3BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial3V3BaseRateAuction specified in the Configuration.properties file.");		
}

public static String getYourBid_PRMultiMaterial4V3BaseRateAuction(){
	String YourBid_PRMultiMaterial4V3BaseRateAuction = properties.getProperty("YourBid_PRMultiMaterial4V3BaseRateAuction");
	if(YourBid_PRMultiMaterial4V3BaseRateAuction!= null) return YourBid_PRMultiMaterial4V3BaseRateAuction;
	else throw new RuntimeException("YourBid_PRMultiMaterial4V3BaseRateAuction specified in the Configuration.properties file.");		
}


public static String getYourBidROF_Auction(){
	String YourBidROF_Auction = properties.getProperty("YourBidROF_Auction");
	if(YourBidROF_Auction!= null) return YourBidROF_Auction;
	else throw new RuntimeException("YourBidROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidAA_Auction(){
	String YourBidAA_Auction = properties.getProperty("YourBidAA_Auction");
	if(YourBidAA_Auction!= null) return YourBidAA_Auction;
	else throw new RuntimeException("YourBidAA_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidAAROF_Auction(){
	String YourBidAAROF_Auction = properties.getProperty("YourBidAAROF_Auction");
	if(YourBidAAROF_Auction!= null) return YourBidAAROF_Auction;
	else throw new RuntimeException("YourBidAAROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidAB_Auction(){
	String YourBidAB_Auction = properties.getProperty("YourBidAB_Auction");
	if(YourBidAB_Auction!= null) return YourBidAB_Auction;
	else throw new RuntimeException("YourBidAB_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidAC_Auction(){
	String YourBidAC_Auction = properties.getProperty("YourBidAC_Auction");
	if(YourBidAC_Auction!= null) return YourBidAC_Auction;
	else throw new RuntimeException("YourBidAC_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidACROF_Auction(){
	String YourBidACROF_Auction = properties.getProperty("YourBidACROF_Auction");
	if(YourBidACROF_Auction!= null) return YourBidACROF_Auction;
	else throw new RuntimeException("YourBidACROF_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidBA_Auction(){
	String YourBidBA_Auction = properties.getProperty("YourBidBA_Auction");
	if(YourBidBA_Auction!= null) return YourBidBA_Auction;
	else throw new RuntimeException("YourBidBA_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidBAROF_Auction(){
	String YourBidBAROF_Auction = properties.getProperty("YourBidBAROF_Auction");
	if(YourBidBAROF_Auction!= null) return YourBidBAROF_Auction;
	else throw new RuntimeException("YourBidBAROF_Auction specified in the Configuration.properties file.");		
}



public static String getYourBidBB_Auction(){
	String YourBidBB_Auction = properties.getProperty("YourBidBB_Auction");
	if(YourBidBB_Auction!= null) return YourBidBB_Auction;
	else throw new RuntimeException("YourBidBB_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidBBROF_Auction(){
	String YourBidBBROF_Auction = properties.getProperty("YourBidBBROF_Auction");
	if(YourBidBBROF_Auction!= null) return YourBidBBROF_Auction;
	else throw new RuntimeException("YourBidBBROF_Auction specified in the Configuration.properties file.");		
}



public static String getYourBidBC_Auction(){
	String YourBidBC_Auction = properties.getProperty("YourBidBC_Auction");
	if(YourBidBC_Auction!= null) return YourBidBC_Auction;
	else throw new RuntimeException("YourBidBC_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidBCROF_Auction(){
	String YourBidBCROF_Auction = properties.getProperty("YourBidBCROF_Auction");
	if(YourBidBCROF_Auction!= null) return YourBidBCROF_Auction;
	else throw new RuntimeException("YourBidBCROF_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidCA_Auction(){
	String YourBidCA_Auction = properties.getProperty("YourBidCA_Auction");
	if(YourBidCA_Auction!= null) return YourBidCA_Auction;
	else throw new RuntimeException("YourBidCA_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidCAROF_Auction(){
	String YourBidCAROF_Auction = properties.getProperty("YourBidCAROF_Auction");
	if(YourBidCAROF_Auction!= null) return YourBidCAROF_Auction;
	else throw new RuntimeException("YourBidCAROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidCB_Auction(){
	String YourBidCB_Auction = properties.getProperty("YourBidCB_Auction");
	if(YourBidCB_Auction!= null) return YourBidCB_Auction;
	else throw new RuntimeException("YourBidCB_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidCBROF_Auction(){
	String YourBidCBROF_Auction = properties.getProperty("YourBidCBROF_Auction");
	if(YourBidCBROF_Auction!= null) return YourBidCBROF_Auction;
	else throw new RuntimeException("YourBidCBROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidCC_Auction(){
	String YourBidCC_Auction = properties.getProperty("YourBidCC_Auction");
	if(YourBidCC_Auction!= null) return YourBidCC_Auction;
	else throw new RuntimeException("YourBidCC_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidCCROF_Auction(){
	String YourBidCCROF_Auction = properties.getProperty("YourBidCCROF_Auction");
	if(YourBidCCROF_Auction!= null) return YourBidCCROF_Auction;
	else throw new RuntimeException("YourBidCCROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDA_Auction(){
	String YourBidDA_Auction = properties.getProperty("YourBidDA_Auction");
	if(YourBidDA_Auction!= null) return YourBidDA_Auction;
	else throw new RuntimeException("YourBidDA_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidDAROF_Auction(){
	String YourBidDAROF_Auction = properties.getProperty("YourBidDAROF_Auction");
	if(YourBidDAROF_Auction!= null) return YourBidDAROF_Auction;
	else throw new RuntimeException("YourBidDAROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDB_Auction(){
	String YourBidDB_Auction = properties.getProperty("YourBidDB_Auction");
	if(YourBidDB_Auction!= null) return YourBidDB_Auction;
	else throw new RuntimeException("YourBidDB_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDBROF_Auction(){
	String YourBidDBROF_Auction = properties.getProperty("YourBidDBROF_Auction");
	if(YourBidDBROF_Auction!= null) return YourBidDBROF_Auction;
	else throw new RuntimeException("YourBidDBROF_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDC_Auction(){
	String YourBidDC_Auction = properties.getProperty("YourBidDC_Auction");
	if(YourBidDC_Auction!= null) return YourBidDC_Auction;
	else throw new RuntimeException("YourBidDC_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDCROF_Auction(){
	String YourBidDCROF_Auction = properties.getProperty("YourBidDCROF_Auction");
	if(YourBidDCROF_Auction!= null) return YourBidDCROF_Auction;
	else throw new RuntimeException("YourBidDCROF_Auction specified in the Configuration.properties file.");		
}

public static String getMaterialCategory_RDRFQ(){
	String getMaterialCategory_RDRFQ = properties.getProperty("MaterialCategory_RDRFQ");
	if(getMaterialCategory_RDRFQ!= null) return getMaterialCategory_RDRFQ;
	else throw new RuntimeException("MaterialCategory_RDRFQ specified in the Configuration.properties file.");		
}



public static String getYourBidAANoNBV_Auction(){
	String YourBidAANoNBV_Auction = properties.getProperty("YourBidAANoNBV_Auction");
	if(YourBidAANoNBV_Auction!= null) return YourBidAANoNBV_Auction;
	else throw new RuntimeException("YourBidAANoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidABNoNBV_Auction(){
	String YourBidABNoNBV_Auction = properties.getProperty("YourBidABNoNBV_Auction");
	if(YourBidABNoNBV_Auction!= null) return YourBidABNoNBV_Auction;
	else throw new RuntimeException("YourBidABNoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidACNoNBV_Auction(){
	String YourBidACNoNBV_Auction = properties.getProperty("YourBidACNoNBV_Auction");
	if(YourBidACNoNBV_Auction!= null) return YourBidACNoNBV_Auction;
	else throw new RuntimeException("YourBidACNoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidBBNoNBV_Auction(){
	String YourBidBBNoNBV_Auction = properties.getProperty("YourBidBBNoNBV_Auction");
	if(YourBidBBNoNBV_Auction!= null) return YourBidBBNoNBV_Auction;
	else throw new RuntimeException("YourBidBBNoNBV_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidBCNoNBV_Auction(){
	String YourBidBCNoNBV_Auction = properties.getProperty("YourBidBCNoNBV_Auction");
	if(YourBidBCNoNBV_Auction!= null) return YourBidBCNoNBV_Auction;
	else throw new RuntimeException("YourBidBCNoNBV_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidCBNoNBV_Auction(){
	String YourBidCBNoNBV_Auction = properties.getProperty("YourBidCBNoNBV_Auction");
	if(YourBidCBNoNBV_Auction!= null) return YourBidCBNoNBV_Auction;
	else throw new RuntimeException("YourBidCBNoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidCCNoNBV_Auction(){
	String YourBidCCNoNBV_Auction = properties.getProperty("YourBidCCNoNBV_Auction");
	if(YourBidCCNoNBV_Auction!= null) return YourBidCCNoNBV_Auction;
	else throw new RuntimeException("YourBidCCNoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDANoNBV_Auction(){
	String YourBidDANoNBV_Auction = properties.getProperty("YourBidDANoNBV_Auction");
	if(YourBidDANoNBV_Auction!= null) return YourBidDANoNBV_Auction;
	else throw new RuntimeException("YourBidDANoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDBNoNBV_Auction(){
	String YourBidDBNoNBV_Auction = properties.getProperty("YourBidDBNoNBV_Auction");
	if(YourBidDBNoNBV_Auction!= null) return YourBidDBNoNBV_Auction;
	else throw new RuntimeException("YourBidDBNoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidDCNoNBV_Auction(){
	String YourBidDCNoNBV_Auction = properties.getProperty("YourBidDCNoNBV_Auction");
	if(YourBidDCNoNBV_Auction!= null) return YourBidDCNoNBV_Auction;
	else throw new RuntimeException("YourBidDCNoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getYourBidCANoNBV_Auction(){
	String YourBidCANoNBV_Auction = properties.getProperty("YourBidCANoNBV_Auction");
	if(YourBidCANoNBV_Auction!= null) return YourBidCANoNBV_Auction;
	else throw new RuntimeException("YourBidCANoNBV_Auction specified in the Configuration.properties file.");		
}


public static String getYourBidBANoNBV_Auction(){
	String YourBidBANoNBV_Auction = properties.getProperty("YourBidBANoNBV_Auction");
	if(YourBidBANoNBV_Auction!= null) return YourBidBANoNBV_Auction;
	else throw new RuntimeException("YourBidBANoNBV_Auction specified in the Configuration.properties file.");		
}

public static String getMaterialGroup_RDSRRFQ(){
	String getMaterialGroup_RDSRRFQ = properties.getProperty("SR_ServiceGroup");
	if(getMaterialGroup_RDSRRFQ!= null) return getMaterialGroup_RDSRRFQ;
	else throw new RuntimeException("SR_ServiceGroup specified in the Configuration.properties file.");		
}

public static String getChooseItemsCart_RDRFQ(){
	String getChooseItemsCart_RDRFQ = properties.getProperty("ChooseItemsCart_RDRFQ");
	if(getChooseItemsCart_RDRFQ!= null) return getChooseItemsCart_RDRFQ;
	else throw new RuntimeException("ChooseItemsCart_RDRFQ specified in the Configuration.properties file.");		
}


public static String getSuggRate_RDRFQ(){
	String SuggRate_RDRFQ = properties.getProperty("SuggRate_RDRFQ");
	if(SuggRate_RDRFQ!= null) return SuggRate_RDRFQ;
	else throw new RuntimeException("SuggRate_RDRFQ not specified in the Configuration.properties file.");		
}

public static String getRDEditQuantity_RDRFQ(){
	String RDEditQuantity_RDRFQ = properties.getProperty("EditQuantity_RDRFQ");
	if(RDEditQuantity_RDRFQ!= null) return RDEditQuantity_RDRFQ;
	else throw new RuntimeException("EditQuantity_RDRFQ not specified in the Configuration.properties file.");		
}

public static String getEditSuggRate_RDRFQ(){
	String EditSuggRate_RDRFQ = properties.getProperty("EditSuggRate_RDRFQ");
	if(EditSuggRate_RDRFQ!= null) return EditSuggRate_RDRFQ;
	else throw new RuntimeException("EditSuggRate_RDRFQ not specified in the Configuration.properties file.");		
}

public static String getScope_RDRFQ(){
	String Scope_RDRFQ = properties.getProperty("Scope_RDRFQ");
	if(Scope_RDRFQ!= null) return Scope_RDRFQ;
	else throw new RuntimeException("Scope_RDRFQ not specified in the Configuration.properties file.");		
}

public static String getScope_CPRRFQ(){
	String Scope_CPRRFQ = properties.getProperty("Scope_CPRRFQ");
	if(Scope_CPRRFQ!= null) return Scope_CPRRFQ;
	else throw new RuntimeException("Scope_CPRRFQ not specified in the Configuration.properties file.");		
}


public static String getMaterialcategory_RFQ(){
	String Materialcategory_RFQ = properties.getProperty("Materialcategory_RFQ");
	if(Materialcategory_RFQ!= null) return Materialcategory_RFQ;
	else throw new RuntimeException("Materialcategory_RFQ not specified in the Configuration.properties file.");		
}


public static String getNatureCode_Auction(){
	String NatureCode_Auction = properties.getProperty("NatureCode_Auction");
	if(NatureCode_Auction!= null) return NatureCode_Auction;
	else throw new RuntimeException("NatureCode_Auction not specified in the Configuration.properties file.");		
}


public static String getJobShipmentDetails_RDRFQ(){
	String JobShipmentDetails_RDRFQ = properties.getProperty("JobShipmentDetails_RDRFQ");
	if(JobShipmentDetails_RDRFQ!= null) return JobShipmentDetails_RDRFQ;
	else throw new RuntimeException("JobShipmentDetails_RDRFQ not specified in the Configuration.properties file.");		
}

//eAuction

public static String getScope_RPReAuction(){
	String Scope_eAuction = properties.getProperty("Scope_RPReAuction");
	if(Scope_eAuction!= null) return Scope_eAuction;
	else throw new RuntimeException("Scope_eAuction not specified in the Configuration.properties file.");		
}


public static String getUOM_RPReAuction(){
	String UOM_RPReAuction = properties.getProperty("UOM_RPReAuction");
	if(UOM_RPReAuction!= null) return UOM_RPReAuction;
	else throw new RuntimeException("UOM_RPReAuction not specified in the Configuration.properties file.");		
}


public static String getUOMSec_RPReAuction(){
	String UOMSec_RPReAuction = properties.getProperty("UOMSec_RPReAuction");
	if(UOMSec_RPReAuction!= null) return UOMSec_RPReAuction;
	else throw new RuntimeException("UOMSec_RPReAuction not specified in the Configuration.properties file.");		
}


public static String getUOMThree_RPReAuction(){
	String UOMThree_RPReAuction = properties.getProperty("UOMThree_RPReAuction");
	if(UOMThree_RPReAuction!= null) return UOMThree_RPReAuction;
	else throw new RuntimeException("UOMThree_RPReAuction not specified in the Configuration.properties file.");		
}


public static String getSuggRate_RDeAuction(){
	String SuggRate_RDeAuction = properties.getProperty("SuggRate_RDeAuction");
	if(SuggRate_RDeAuction!= null) return SuggRate_RDeAuction;
	else throw new RuntimeException("SuggRate_RDeAuction not specified in the Configuration.properties file.");		
}


public static String getSuggRateSec_RDeAuction(){
	String SuggRateSec_RDeAuction = properties.getProperty("SuggRateSec_RDeAuction");
	if(SuggRateSec_RDeAuction!= null) return SuggRateSec_RDeAuction;
	else throw new RuntimeException("SuggRateSec_RDeAuction not specified in the Configuration.properties file.");		
}

public static String getSuggRateThree_RDeAuction(){
	String SuggRateThree_RDeAuction = properties.getProperty("SuggRateThree_RDeAuction");
	if(SuggRateThree_RDeAuction!= null) return SuggRateThree_RDeAuction;
	else throw new RuntimeException("SuggRateThree_RDeAuction not specified in the Configuration.properties file.");		
}

public static String getScope_RDReAuction(){
	String Scope_eAuction = properties.getProperty("Scope_RDReAuction");
	if(Scope_eAuction!= null) return Scope_eAuction;
	else throw new RuntimeException("Scope_eAuction not specified in the Configuration.properties file.");		
}

public static String getScope_ReversePReAuction(){
	String Scope_ReversePReAuction = properties.getProperty("Scope_ReversePReAuction");
	if(Scope_ReversePReAuction!= null) return Scope_ReversePReAuction;
	else throw new RuntimeException("Scope_ReversePReAuction not specified in the Configuration.properties file.");		
}

public static String getScope_RankOrderReversePReAuction(){
	String Scope_RankOrderReversePReAuction = properties.getProperty("Scope_RankOrderReversePReAuction");
	if(Scope_RankOrderReversePReAuction!= null) return Scope_RankOrderReversePReAuction;
	else throw new RuntimeException("Scope_RankOrderReversePReAuction not specified in the Configuration.properties file.");		
}

public static String getMaterialCategory_ReverseRateDiscovery(){
	String MaterialCategory_ReverseRateDiscovery = properties.getProperty("MaterialCategory_ReverseRateDiscovery");
	if(MaterialCategory_ReverseRateDiscovery!= null) return MaterialCategory_ReverseRateDiscovery;
	else throw new RuntimeException("MaterialCategory_ReverseRateDiscovery eAuction not specified in the Configuration.properties file.");		
}

public static String getScope_ReverseRequestForQuoteeAuction(){
	String Scope_ReverseRequestForQuoteeAuction = properties.getProperty("Scope_ReverseRequestForQuoteeAuction");
	if(Scope_ReverseRequestForQuoteeAuction!= null) return Scope_ReverseRequestForQuoteeAuction;
	else throw new RuntimeException("Reverse Request For Quote eAuction not specified in the Configuration.properties file.");		
}


public static String getScope_RDRORAuction(){
	String Scope_RDRORAuction = properties.getProperty("Scope_RDRORAuction");
	if(Scope_RDRORAuction!= null) return Scope_RDRORAuction;
	else throw new RuntimeException("Scope_RDRORAuction not specified in the Configuration.properties file.");		
}


public static String getScope_RDROFAuction(){
	String Scope_RDROFAuction = properties.getProperty("Scope_RDROFAuction");
	if(Scope_RDROFAuction!= null) return Scope_RDROFAuction;
	else throw new RuntimeException("Scope_RDROFAuction not specified in the Configuration.properties file.");		
}

public static String getScope_RDFDAuction(){
	String Scope_RDFDAuction = properties.getProperty("Scope_RDFDAuction");
	if(Scope_RDFDAuction!= null) return Scope_RDFDAuction;
	else throw new RuntimeException("Scope_RDFDAuction not specified in the Configuration.properties file.");		
}

public static String getDesciption_RORRDAuction(){
	String Desciption_RORRDAuction = properties.getProperty("Desciption_RORRDAuction");
	if(Desciption_RORRDAuction!= null) return Desciption_RORRDAuction;
	else throw new RuntimeException("Desciption_RORRDAuction not specified in the Configuration.properties file.");		
}

public static String getDesciption_ROFRDAuction(){
	String Desciption_ROFRDAuction = properties.getProperty("Desciption_ROFRDAuction");
	if(Desciption_ROFRDAuction!= null) return Desciption_ROFRDAuction;
	else throw new RuntimeException("Desciption_ROFRDAuction not specified in the Configuration.properties file.");		
}

public static String getDesciption_FDRDAuction(){
	String Desciption_FDRDAuction = properties.getProperty("Desciption_FDRDAuction");
	if(Desciption_FDRDAuction!= null) return Desciption_FDRDAuction;
	else throw new RuntimeException("Desciption_FDRDAuction not specified in the Configuration.properties file.");		
}

public static String getDesciption_RDReAuction(){
	String Desciption_RDReAuction = properties.getProperty("Desciption_RDReAuction");
	if(Desciption_RDReAuction!= null) return Desciption_RDReAuction;
	else throw new RuntimeException("Desciption_RDReAuction not specified in the Configuration.properties file.");		
}


public static String getDesciptionSec_RDReAuction(){
	String DesciptionSec_RDReAuction = properties.getProperty("DesciptionSec_RDReAuction");
	if(DesciptionSec_RDReAuction!= null) return DesciptionSec_RDReAuction;
	else throw new RuntimeException("DesciptionSec_RDReAuction not specified in the Configuration.properties file.");		
}

public static String getDesciptionThree_RDReAuction(){
	String DesciptionThree_RDReAuction = properties.getProperty("DesciptionThree_RDReAuction");
	if(DesciptionThree_RDReAuction!= null) return DesciptionThree_RDReAuction;
	else throw new RuntimeException("DesciptionThree_RDReAuction not specified in the Configuration.properties file.");		
}

public static String getQuantity_RDReAuction(){
	String Quantity_RDReAuction = properties.getProperty("Quantity_RDReAuction");
	if(Quantity_RDReAuction!= null) return Quantity_RDReAuction;
	else throw new RuntimeException("Quantity_RDReAuction not specified in the Configuration.properties file.");		
}

public static String getQuantitySec_RDReAuction(){
	String QuantitySec_RDReAuction = properties.getProperty("QuantitySec_RDReAuction");
	if(QuantitySec_RDReAuction!= null) return QuantitySec_RDReAuction;
	else throw new RuntimeException("QuantitySec_RDReAuction not specified in the Configuration.properties file.");		
}

public static String getQuantityThree_RDReAuction(){
	String QuantityThree_RDReAuction = properties.getProperty("QuantityThree_RDReAuction");
	if(QuantityThree_RDReAuction!= null) return QuantityThree_RDReAuction;
	else throw new RuntimeException("QuantityThree_RDReAuction not specified in the Configuration.properties file.");		
}

//PR
public static String getPR_Username(){
	String Username_PR = properties.getProperty("Username_PR");
	if(Username_PR!= null) return Username_PR;
	else throw new RuntimeException("Username_PR not specified in the Configuration.properties file.");		
}

public static String getPR_Job(){
	String getPR_Job = properties.getProperty("Job_PRCreate");
	if(getPR_Job!= null) return getPR_Job;
	else throw new RuntimeException("getPR_Job not specified in the Configuration.properties file.");		
}

public static String getSR_PaymentCentre(){
	String getSR_PaymentCentre = properties.getProperty("SR_PaymentCentre");
	if(getSR_PaymentCentre!= null) return getSR_PaymentCentre;
	else throw new RuntimeException("getSR_PaymentCentre not specified in the Configuration.properties file.");		
}

public static String getSR_Natureofscope(){
	String getSR_Natureofscope = properties.getProperty("SR_Natureofscope");
	if(getSR_Natureofscope!= null) return getSR_Natureofscope;
	else throw new RuntimeException("getSR_Natureofscope not specified in the Configuration.properties file.");		
}

public static String getSR_ServiceGroup(){
	String getSR_ServiceGroup = properties.getProperty("SR_ServiceGroup");
	if(getSR_ServiceGroup!= null) return getSR_ServiceGroup;
	else throw new RuntimeException("getSR_ServiceGroup not specified in the Configuration.properties file.");		
}



public static String getPR_Warehouse(){
	String getPR_Warehouse = properties.getProperty("Warehouse_PRCreate");
	if(getPR_Warehouse!= null) return getPR_Warehouse;
	else throw new RuntimeException("Warehouse_PRCreate not specified in the Configuration.properties file.");		
}

public static String getPR_PurchaseGroup(){
	String getPR_PurchaseGroup = properties.getProperty("PurchaseGroup_PRCreate");
	if(getPR_PurchaseGroup!= null) return getPR_PurchaseGroup;
	else throw new RuntimeException("PurchaseGroup not specified in the Configuration.properties file.");		
}

public static String getPR_planningCategory(){
	String getPR_planningCategory = properties.getProperty("planningCategory_PRCreate");
	if(getPR_planningCategory!= null) return getPR_planningCategory;
	else throw new RuntimeException("planningCategory not specified in the Configuration.properties file.");		
}

public static String getPR_Remarks(){
	String getPR_Remarks = properties.getProperty("Remarks_PRCreate");
	if(getPR_Remarks!= null) return getPR_Remarks;
	else throw new RuntimeException("Remarks not specified in the Configuration.properties file.");		
}

public static String getPR_ChooseItemsPR(){
	String getPR_ChooseItemsPR = properties.getProperty("ChooseItemsPR_PRCreate");
	if(getPR_ChooseItemsPR!= null) return getPR_ChooseItemsPR;
	else throw new RuntimeException("ChooseItemsPR not specified in the Configuration.properties file.");		
}



public static String getPR_MultiMaterialChooseItemsPR(){
	String ChooseItemsPR_MultiMaterialChooseItemsPR = properties.getProperty("ChooseItemsPR_MultiMaterialChooseItemsPR");
	if(ChooseItemsPR_MultiMaterialChooseItemsPR!= null) return ChooseItemsPR_MultiMaterialChooseItemsPR;
	else throw new RuntimeException("ChooseItemsPR_MultiMaterialChooseItemsPR not specified in the Configuration.properties file.");		
}

public static String getSR_ChooseItemsSR(){
	String getSR_ChooseItemsSR = properties.getProperty("SR_ChooseItems");
	if(getSR_ChooseItemsSR!= null) return getSR_ChooseItemsSR;
	else throw new RuntimeException("ChooseItemsSR not specified in the Configuration.properties file.");		
}
public static String getPR_Cost(){
	String getPR_Cost = properties.getProperty("Cost_PRCreate");
	if(getPR_Cost!= null) return getPR_Cost;
	else throw new RuntimeException("Cost not specified in the Configuration.properties file.");		
}

public static String getPR_Quantity(){
	String getPR_Quantity = properties.getProperty("Quantity_PRCreate");
	if(getPR_Quantity!= null) return getPR_Quantity;
	else throw new RuntimeException("Quantity not specified in the Configuration.properties file.");		
}

public static String getPR_SuggRate(){
	String getPR_SuggRate = properties.getProperty("SuggRate_PRCreate");
	if(getPR_SuggRate!= null) return getPR_SuggRate;
	else throw new RuntimeException("SuggRate not specified in the Configuration.properties file.");		
}


public static String getPR_FirstMaterialSuggRate(){
	String PR_FirstMaterialSuggRate = properties.getProperty("PR_FirstMaterialSuggRate");
	if(PR_FirstMaterialSuggRate!= null) return PR_FirstMaterialSuggRate;
	else throw new RuntimeException("PR_FirstMaterialSuggRate not specified in the Configuration.properties file.");		
}


public static String getPR_documentType(){
	String getPR_documentType = properties.getProperty("documentType_PRApproval");
	if(getPR_documentType!= null) return getPR_documentType;
	else throw new RuntimeException("documentType_PRApproval not specified in the Configuration.properties file.");		
}

//============================================================================================================================

//***********************************************************************************************************************//
//Login Test-Data

public static String getLogin_Landing(){
	String Login_Landing = properties.getProperty("Login_Landing");
	if(Login_Landing!= null) return Login_Landing;
	else throw new RuntimeException("Login_Landing not specified in the Configuration.properties file.");		
}

	public static String getApprover_username1(){
		String Approver_username = properties.getProperty("Approver_username");
		if(Approver_username!= null) return Approver_username;
		else throw new RuntimeException("Approver_username not specified in the Configuration.properties file.");		
	}
	
//***********************************************************************************************************************//
	
			//Switch Job
			public static String getUser_job(){
				String User_job = properties.getProperty("User_job");
				if(User_job!= null) return User_job;
				else throw new RuntimeException("User_job not specified in the Configuration.properties file.");		
			}	
	
			public static String getJob_LE180046(){
				String Job_LE180046 = properties.getProperty("job_Name");
				if(Job_LE180046!= null) return Job_LE180046;
				else throw new RuntimeException("Job_LE180046 not specified in the Configuration.properties file.");		
			}	

//***********************************************************************************************************************//
	


//***********************************************************************************************************************//
//Induction_basicdetails_Communication_TestData
					
					public static String getMobilenumber(){
						String Mobilenumber = properties.getProperty("Mobilenumber");
						if(Mobilenumber!= null) return Mobilenumber;
						else throw new RuntimeException("Mobilenumber not specified in the Configuration.properties file.");		
					}
					
					public static String getPermanent_Address_pincode(){
						String Permanent_Address_pincode = properties.getProperty("Permanent_Address_pincode");
						if(Permanent_Address_pincode!= null) return Permanent_Address_pincode;
						else throw new RuntimeException("Permanent_Address_pincode not specified in the Configuration.properties file.");		
					}
					public static String getPermanent_Address(){
						String Permanent_Address = properties.getProperty("Permanent_Address");
						if(Permanent_Address!= null) return Permanent_Address;
						else throw new RuntimeException("Permanent_Address not specified in the Configuration.properties file.");		
					}
					public static String getPermanent_Address_Village(){
						String Permanent_Address_Village = properties.getProperty("Permanent_Address_Village");
						if(Permanent_Address_Village!= null) return Permanent_Address_Village;
						else throw new RuntimeException("Permanent_Address_Village not specified in the Configuration.properties file.");		
					}
					public static String getPermanent_Address_Village_Verify(){
						String Permanent_Address_Village_Verify = properties.getProperty("Permanent_Address_Village_Verify");
						if(Permanent_Address_Village_Verify!= null) return Permanent_Address_Village_Verify;
						else throw new RuntimeException("Permanent_Address_Village_Verify not specified in the Configuration.properties file.");		
					}
					public static String getPermanent_Address_Village_update_Verify(){
						String Permanent_Address_Village_update_Verify = properties.getProperty("Permanent_Address_Village_update_Verify");
						if(Permanent_Address_Village_update_Verify!= null) return Permanent_Address_Village_update_Verify;
						else throw new RuntimeException("Permanent_Address_Village_update_Verify not specified in the Configuration.properties file.");		
					}
					public static String getPermanent_Address_Village_update2_Verify(){
						String Permanent_Address_Village_update2_Verify = properties.getProperty("Permanent_Address_Village_update2_Verify");
						if(Permanent_Address_Village_update2_Verify!= null) return Permanent_Address_Village_update2_Verify;
						else throw new RuntimeException("Permanent_Address_Village_update2_Verify not specified in the Configuration.properties file.");		
					}
					public static String getSame_as_Permanent_Address(){
						String Same_as_Permanent_Address = properties.getProperty("Same_as_Permanent_Address");
						if(Same_as_Permanent_Address!= null) return Same_as_Permanent_Address;
						else throw new RuntimeException("Same_as_Permanent_Address not specified in the Configuration.properties file.");		
					}
					public static String getDate_Formate_Pincode(){
						String Date_Formate_Pincode = properties.getProperty("Date_Formate_Pincode");
						if(Date_Formate_Pincode!= null) return Date_Formate_Pincode;
						else throw new RuntimeException("Date_Formate_Pincode not specified in the Configuration.properties file.");		
					}
//NOS					
					public static String getNOS(){
						String NOS = properties.getProperty("NOS");
						if(NOS!= null) return NOS;
						else throw new RuntimeException("NOS not specified in the Configuration.properties file.");		
					}
					
//	Date 					
					public static String getDate_Formate(){
						String Date_Formate = properties.getProperty("Date");
						if(Date_Formate!= null) return Date_Formate;
						else throw new RuntimeException("Date_Formate not specified in the Configuration.properties file.");		
					}
					
//SR Quantity					
					public static String getSR_Rate2(){
						String SR_Rate2 = properties.getProperty("rate2");
						if(SR_Rate2!= null) return SR_Rate2;
						else throw new RuntimeException("SR_Rate2 not specified in the Configuration.properties file.");		
					}
					public static String getSR_Rate1(){
						String SR_Rate1 = properties.getProperty("rate1");
						if(SR_Rate1!= null) return SR_Rate1;
						else throw new RuntimeException("SR_Rate1 not specified in the Configuration.properties file.");		
					}
					public static String getSR_Rate(){
						String SR_Rate = properties.getProperty("rate");
						if(SR_Rate!= null) return SR_Rate;
						else throw new RuntimeException("SR_Rate not specified in the Configuration.properties file.");		
					}
					public static String getSR_Quantiy3(){
						String SR_Quantiy3 = properties.getProperty("qty2");
						if(SR_Quantiy3!= null) return SR_Quantiy3;
						else throw new RuntimeException("SR_Quantiy3 not specified in the Configuration.properties file.");		
					}
					public static String getSR_Quantiy2(){
						String SR_Quantiy2 = properties.getProperty("qty1");
						if(SR_Quantiy2!= null) return SR_Quantiy2;
						else throw new RuntimeException("SR_Quantiy2 not specified in the Configuration.properties file.");		
					}
					public static String getSR_Quantiy1(){
						String SR_Quantiy1 = properties.getProperty("qty");
						if(SR_Quantiy1!= null) return SR_Quantiy1;
						else throw new RuntimeException("SR_Quantiy1 not specified in the Configuration.properties file.");		
					}

//***********************************************************************************************************************//
//Induction_basicdetails_Skill_TestData
						
					public static String getSkill_Category(){
						String Skill_Category = properties.getProperty("Skill_Category");
						if(Skill_Category!= null) return Skill_Category;
						else throw new RuntimeException("Skill_Category not specified in the Configuration.properties file.");		
					}
					public static String getSkill_Group(){
						String Skill_Group = properties.getProperty("Skill_Group");
						if(Skill_Group!= null) return Skill_Group;
						else throw new RuntimeException("Skill_Group not specified in the Configuration.properties file.");		
					}
					
//------------------------------------------------------------------------------						
					public static String getSR_Job_Code(){
						String SR_Job_Code = properties.getProperty("job_name");
						if(SR_Job_Code!= null) return SR_Job_Code;
						else throw new RuntimeException("SR_Job_Code not specified in the Configuration.properties file.");		
					}
					
//******************************************************************************************************************						
					public static String getMaterial_name(){
						String Material_name = properties.getProperty("Stock_Material_Code");
						if(Material_name!= null) return Material_name;
						else throw new RuntimeException("Material_name not specified in the Configuration.properties file.");		
					}
					
//*******************************************************************************************************************************
//Reject Text						
					public static String getReject_Text(){
						String Reject_Text = properties.getProperty("Rejected_text");
						if(Reject_Text!= null) return Reject_Text;
						else throw new RuntimeException("Reject_Text not specified in the Configuration.properties file.");		
					}
					
//***********************************************************************************************************************//
//Status Filter
					
					public static String getStatus_Recall(){
						String Status_Recall = properties.getProperty("Status1");
						if(Status_Recall!= null) return Status_Recall;
						else throw new RuntimeException("Status_Recall not specified in the Configuration.properties file.");		
					}
					public static String getStatus_Created(){
						String Status_Created = properties.getProperty("Status2");
						if(Status_Created!= null) return Status_Created;
						else throw new RuntimeException("Status_Created not specified in the Configuration.properties file.");		
					}
					public static String getStatus_Cancelled(){
						String Status_Cancelled = properties.getProperty("Status3");
						if(Status_Cancelled!= null) return Status_Cancelled;
						else throw new RuntimeException("Status_Cancelled not specified in the Configuration.properties file.");		
					}
					public static String getStatus_Authorized(){
						String Status_Authorized = properties.getProperty("Status4");
						if(Status_Authorized!= null) return Status_Authorized;
						else throw new RuntimeException("Status_Authorized not specified in the Configuration.properties file.");		
					}
																	
//***********************************************************************************************************************
//Material qty for DMS(Card)
					public static String getScrap_qty(){
						String Scrap_qty = properties.getProperty("Scrap_Material_qty");
						if(Scrap_qty!= null) return Scrap_qty;
						else throw new RuntimeException("Scrap_qty not specified in the Configuration.properties file.");		
					}
					public static String getExp_qty(){
						String Exp_qty = properties.getProperty("Exp_Material_qty");
						if(Exp_qty!= null) return Exp_qty;
						else throw new RuntimeException("Exp_qty not specified in the Configuration.properties file.");		
					}

					
//*******************************************************************************************************************************************
//Remark	
					
					public static String getRemark(){
						String Remark = properties.getProperty("Remark_Dates");
						if(Remark!= null) return Remark;
						else throw new RuntimeException("Remark not specified in the Configuration.properties file.");		
					}
					
//DMS Login						
					public static String getDMS_Password(){
						String DMS_Password = properties.getProperty("SCM_DMS_password");
						if(DMS_Password!= null) return DMS_Password;
						else throw new RuntimeException("DMS_Password not specified in the Configuration.properties file.");		
					}
					public static String getDMS_Username(){
						String DMS_Username = properties.getProperty("SCM_DMS_username");
						if(DMS_Username!= null) return DMS_Username;
						else throw new RuntimeException("DMS_Username not specified in the Configuration.properties file.");		
					}
					
//Incorrect Login 						
					public static String getIncorrect_password(){
						String Incorrect_password = properties.getProperty("Incorrect_password_Login");
						if(Incorrect_password!= null) return Incorrect_password;
						else throw new RuntimeException("Incorrect_password not specified in the Configuration.properties file.");		
					}
					public static String getIncorrect_username(){
						String Incorrect_username = properties.getProperty("Incorrect_username_Login");
						if(Incorrect_username!= null) return Incorrect_username;
						else throw new RuntimeException("Incorrect_username not specified in the Configuration.properties file.");		
					}
					
					
//material Code In DB Job 0						
					public static String getmaterial_code(){
						String material_code = properties.getProperty("Material_Code");
						if(material_code!= null) return material_code;
						else throw new RuntimeException("material_code not specified in the Configuration.properties file.");		
					}
					
//Surplus Code						
					public static String getsurplus_Code(){
						String surplus_Code = properties.getProperty("Code_Surplus");
						if(surplus_Code!= null) return surplus_Code;
						else throw new RuntimeException("surplus_Code not specified in the Configuration.properties file.");		
					}
					
//Calendar						
					public static String getPrevious_yeare(){
						String Previous_yeare = properties.getProperty("Date_last_year");
						if(Previous_yeare!= null) return Previous_yeare;
						else throw new RuntimeException("Previous_yeare not specified in the Configuration.properties file.");		
					}
					public static String getcurrent_date(){
						String current_date = properties.getProperty("Date_Format");
						if(current_date!= null) return current_date;
						else throw new RuntimeException("current_date not specified in the Configuration.properties file.");		
					}
					
//					
					public static String getmaterial_Group(){
						String material_Group = properties.getProperty("group");
						if(material_Group!= null) return material_Group;
						else throw new RuntimeException("material_Group not specified in the Configuration.properties file.");		
					}	
					
//				_____________________________________________________________________	
					public static String getD_Code(){
						String D_Code = properties.getProperty("Code");
						if(D_Code!= null) return D_Code;
						else throw new RuntimeException("D_Code not specified in the Configuration.properties file.");		
					}	
					
//warehouse						
					public static String getwarehouse_name(){
						String warehouse_name = properties.getProperty("warehouse");
						if(warehouse_name!= null) return warehouse_name;
						else throw new RuntimeException("warehouse_name not specified in the Configuration.properties file.");		
					}	
					
//lessthan No QTY						
					public static String getpass_Lessthan(){
						String pass_Lessthan = properties.getProperty("LessthanText");
						if(pass_Lessthan!= null) return pass_Lessthan;
						else throw new RuntimeException("pass_Lessthan not specified in the Configuration.properties file.");		
					}
					
					
//Text_pass						
					public static String gettest_Pass_Reject(){
						String test_Pass_Reject = properties.getProperty("text_pass");
						if(test_Pass_Reject!= null) return test_Pass_Reject;
						else throw new RuntimeException("test_Pass_Reject not specified in the Configuration.properties file.");		
					}	
//____________________________________________________________________________________________________________________________________________________________________________						
//Sent Text						
					public static String gettext_pass(){
						String text_pass = properties.getProperty("text");
						if(text_pass!= null) return text_pass;
						else throw new RuntimeException("text_pass not specified in the Configuration.properties file.");		
					}
					public static String gettext(){
						String text = properties.getProperty("LessthanText");
						if(text!= null) return text;
						else throw new RuntimeException("text not specified in the Configuration.properties file.");		
					}


//Login Test-Data-RoleBase
					
				
					
					public static String getConfiguration_username1(){
						String Configuration_username = properties.getProperty("Configuration_username");
						if(Configuration_username!= null) return Configuration_username;
						else throw new RuntimeException("Configuration_username not specified in the Configuration.properties file.");		
					}
					public static String getConfiguration_password1(){
						String getConfiguration_password = properties.getProperty("Configuration_password");
						if(getConfiguration_password!= null) return getConfiguration_password;
						else throw new RuntimeException("getConfiguration_password not specified in the Configuration.properties file.");		
					}
					public static String get_verifier_username(){
						String Attendance_Creator_username = properties.getProperty("vercificationconfiguration_username");
						if(Attendance_Creator_username!= null) return Attendance_Creator_username;
						else throw new RuntimeException("vercificationconfiguration_username not specified in the Configuration.properties file.");		
					}
					public static String get_verifier_password(){
						String Attendance_Creator_password = properties.getProperty("vercificationconfiguration_password");
						if(Attendance_Creator_password!= null) return Attendance_Creator_password;
						else throw new RuntimeException("vercificationconfiguration_password not specified in the Configuration.properties file.");		
					}
					public static String get_Approver_username(){
						String Attendance_Approver_username = properties.getProperty("Approveconfiguration_Username");
						if(Attendance_Approver_username!= null) return Attendance_Approver_username;
						else throw new RuntimeException("Approveconfiguration_Username not specified in the Configuration.properties file.");		
					}
					public static String get_Approver_password(){
						String Attendance_Approver_password = properties.getProperty("Approveconfiguration_Password");
						if(Attendance_Approver_password!= null) return Attendance_Approver_password;
						else throw new RuntimeException("Approveconfiguration_Password not specified in the Configuration.properties file.");		
					}
					
					public static String SCM_Approve_Level2(){
						String SCM_Approve_Level2 = properties.getProperty("SCM_Approve_Level2");
						if(SCM_Approve_Level2!= null) return SCM_Approve_Level2;
						else throw new RuntimeException("SCM_Approve_Level2 not specified in the Configuration.properties file.");		
					}

//Search Text 
					
					public static String Search_Text(){
						String EHS_training_all = properties.getProperty("Given_Search_Text");
						if(EHS_training_all!= null) return EHS_training_all;
						else throw new RuntimeException("EHS_training_all not specified in the Configuration.properties file.");		
					}
					
					public static String getScreenshotPath_Scenario(){
						String ScreenshotPath_Scenario = properties.getProperty("ScreenshotPath_Scenario");
						if(ScreenshotPath_Scenario!= null) return ScreenshotPath_Scenario;
						else throw new RuntimeException("ScreenshotPath_Scenario not specified in the Configuration.properties file.");		
					}	
					
					public static String getAllcoQTR(){
						String AllcoQTR = properties.getProperty("AllcoQTR");
						if(AllcoQTR!= null) return AllcoQTR;
						else throw new RuntimeException("AllcoQTR not specified in the Configuration.properties file.");		
					}	
					
					public static String getTDS(){
						String TDS = properties.getProperty("TDS");
						if(TDS!= null) return TDS;
						else throw new RuntimeException("TDS not specified in the Configuration.properties file.");		
					}
					
					public static String getA(){
						String A = properties.getProperty("A");
						if(A!= null) return A;
						else throw new RuntimeException("A not specified in the Configuration.properties file.");		
					}
					public static String getThisqty(){
						String Thisqty = properties.getProperty("Thisqty");
						if(Thisqty!= null) return Thisqty;
						else throw new RuntimeException("Thisqty not specified in the Configuration.properties file.");		
					}
					public static String getTesting(){
						String Testing = properties.getProperty("Testing");
						if(Testing!= null) return Testing;
						else throw new RuntimeException("Testing not specified in the Configuration.properties file.");		
					}
					
					public static String getFIN_Username(){
						String FIN_UserName = properties.getProperty("FIN_UserName");
						if(FIN_UserName!= null) return FIN_UserName;
						else throw new RuntimeException("FIN_UserName not specified in the Configuration.properties file.");		
					}
					public static String getBank(){
						String Bank = properties.getProperty("BANK");
						if(Bank!= null) return Bank;
						else throw new RuntimeException("Bank not specified in the Configuration.properties file.");		
					}
					



				

}