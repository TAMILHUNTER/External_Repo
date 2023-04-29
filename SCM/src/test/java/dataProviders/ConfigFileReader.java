package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import object_repository.EIP_Menu;

public class ConfigFileReader extends EIP_Menu{
	
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
	
	public static String getRFQUsername(){
		String RFQUsername = properties.getProperty("RFQUsername");
		if(RFQUsername!= null) return RFQUsername;
		else throw new RuntimeException("RFQUsername not specified in the Configuration.properties file.");		
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
	
	public static String getRFQTCCUsername(){
		String RFQ_TCCUsername = properties.getProperty("RFQ_TCCUsername");
		if(RFQ_TCCUsername!= null) return RFQ_TCCUsername;
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

public static String getQuantity_PRRFQ(){
	String Quantity_PRRFQ = properties.getProperty("Quantity_PRRFQ");
	if(Quantity_PRRFQ!= null) return Quantity_PRRFQ;
	else throw new RuntimeException("Quantity_PRRFQ not specified in the Configuration.properties file.");		
}

public static String getNotEqualQuantity_PRRFQ(){
	String NotEqualQuantity_PRRFQ = properties.getProperty("NotEqualQuantity_PRRFQ");
	if(NotEqualQuantity_PRRFQ!= null) return NotEqualQuantity_PRRFQ;
	else throw new RuntimeException("NotEqualQuantity_PRRFQ not specified in the Configuration.properties file.");		
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

public static String getBQHSN(){
	String BQHSN = properties.getProperty("BQHSN");
	if(BQHSN!= null) return BQHSN;
	else throw new RuntimeException("BQHSN not specified in the Configuration.properties file.");		
}

public static String getTAN(){
	String TAN = properties.getProperty("TAN");
	if(TAN!= null) return TAN;
	else throw new RuntimeException("TAN not specified in the Configuration.properties file.");		
}



public static String getRate(){
	String Rate = properties.getProperty("Rate");
	if(Rate!= null) return Rate;
	else throw new RuntimeException("Rate not specified in the Configuration.properties file.");		
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

public static String getChooseItemsCartSec_RDRFQ(){
	String ChooseItemsCartSec_RDRFQ = properties.getProperty("ChooseItemsCartSec_RDRFQ");
	if(ChooseItemsCartSec_RDRFQ!= null) return ChooseItemsCartSec_RDRFQ;
	else throw new RuntimeException("ChooseItemsCartSec_RDRFQ specified in the Configuration.properties file.");		
}


public static String getChooseItemsCartSec1_RDRFQ(){
	String ChooseItemsCartSec1_RDRFQ = properties.getProperty("ChooseItemsCartSec1_RDRFQ");
	if(ChooseItemsCartSec1_RDRFQ!= null) return ChooseItemsCartSec1_RDRFQ;
	else throw new RuntimeException("ChooseItemsCartSec1_RDRFQ specified in the Configuration.properties file.");		
}

public static String getChooseItemsCartSec2_RDRFQ(){
	String ChooseItemsCartSec2_RDRFQ = properties.getProperty("ChooseItemsCartSec2_RDRFQ");
	if(ChooseItemsCartSec2_RDRFQ!= null) return ChooseItemsCartSec2_RDRFQ;
	else throw new RuntimeException("ChooseItemsCartSec2_RDRFQ specified in the Configuration.properties file.");		
}

public static String getChooseItemsCartSec3_RDRFQ(){
	String ChooseItemsCartSec3_RDRFQ = properties.getProperty("ChooseItemsCartSec3_RDRFQ");
	if(ChooseItemsCartSec3_RDRFQ!= null) return ChooseItemsCartSec3_RDRFQ;
	else throw new RuntimeException("ChooseItemsCartSec3_RDRFQ specified in the Configuration.properties file.");		
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

public static String getFreightCharges_BQ(){
	String FreightCharges_BQ = properties.getProperty("FreightCharges_BQ");
	if(FreightCharges_BQ!= null) return FreightCharges_BQ;
	else throw new RuntimeException("FreightCharges_BQ not specified in the Configuration.properties file.");		
}

public static String getOtherCostOption_BQ(){
	String OtherCostOption_BQ = properties.getProperty("OtherCostOption_BQ");
	if(OtherCostOption_BQ!= null) return OtherCostOption_BQ;
	else throw new RuntimeException("OtherCostOption_BQ not specified in the Configuration.properties file.");		
}

public static String getUnitValuePercentage_BQ(){
	String UnitValuePercentage = properties.getProperty("UnitValuePercentage");
	if(UnitValuePercentage!= null) return UnitValuePercentage;
	else throw new RuntimeException("UnitValuePercentage not specified in the Configuration.properties file.");		
}

public static String getOtherCostOptionLum_BQ(){
	String OtherCostOptionLum_BQ = properties.getProperty("OtherCostOptionLum_BQ");
	if(OtherCostOptionLum_BQ!= null) return OtherCostOptionLum_BQ;
	else throw new RuntimeException("OtherCostOptionLum_BQ not specified in the Configuration.properties file.");		
}

public static String getUnitValueLumpsum_BQ(){
	String UnitValueLumpsum = properties.getProperty("UnitValueLumpsum");
	if(UnitValueLumpsum!= null) return UnitValueLumpsum;
	else throw new RuntimeException("UnitValueLumpsum not specified in the Configuration.properties file.");		
}

public static String getUnitValueRemarks_BQ(){
	String UnitValueRemarks_BQ = properties.getProperty("UnitValueRemarks_BQ");
	if(UnitValueRemarks_BQ!= null) return UnitValueRemarks_BQ;
	else throw new RuntimeException("UnitValueRemarks_BQ not specified in the Configuration.properties file.");		
}

public static String getJobShipmentDetails_RDRFQ(){
	String JobShipmentDetails_RDRFQ = properties.getProperty("JobShipmentDetails_RDRFQ");
	if(JobShipmentDetails_RDRFQ!= null) return JobShipmentDetails_RDRFQ;
	else throw new RuntimeException("JobShipmentDetails_RDRFQ not specified in the Configuration.properties file.");		
}

public static String getAllocQty_TCD(){
	String AllocQty_TCD = properties.getProperty("AllocQty_TCD");
	if(AllocQty_TCD!= null) return AllocQty_TCD;
	else throw new RuntimeException("AllocQty_TCD not specified in the Configuration.properties file.");		
}

public static String getInvoiceNo_POA(){
	String InvoiceNo_POA = properties.getProperty("InvoiceNo_POA");
	if(InvoiceNo_POA!= null) return InvoiceNo_POA;
	else throw new RuntimeException("InvoiceNo_POA not specified in the Configuration.properties file.");		
}

public static String getInvoiceValue_POA(){
	String InvoiceValue_POA = properties.getProperty("InvoiceValue_POA");
	if(InvoiceValue_POA!= null) return InvoiceValue_POA;
	else throw new RuntimeException("InvoiceValue_POA not specified in the Configuration.properties file.");		
}

public static String getSupplierASNRefNo_ASN(){
	String SupplierASNRefNo_ASN = properties.getProperty("SupplierASNRefNo_ASN");
	if(SupplierASNRefNo_ASN!= null) return SupplierASNRefNo_ASN;
	else throw new RuntimeException("SupplierASNRefNo_ASN not specified in the Configuration.properties file.");		
}

public static String getSupplierInvoiceDetails_ASN(){
	String SupplierInvoiceDetails_ASN = properties.getProperty("SupplierInvoiceDetails_ASN");
	if(SupplierInvoiceDetails_ASN!= null) return SupplierInvoiceDetails_ASN;
	else throw new RuntimeException("SupplierInvoiceDetails_ASN not specified in the Configuration.properties file.");		
}

public static String getDCNumber_ASN(){
	String DCNumber_ASN = properties.getProperty("DCNumber_ASN");
	if(DCNumber_ASN!= null) return DCNumber_ASN;
	else throw new RuntimeException("DCNumber_ASN not specified in the Configuration.properties file.");		
}


public static String getDeliveryOrderNumber_ASN(){
	String DeliveryOrderNumber_ASN = properties.getProperty("DeliveryOrderNumber_ASN");
	if(DeliveryOrderNumber_ASN!= null) return DeliveryOrderNumber_ASN;
	else throw new RuntimeException("DeliveryOrderNumber_ASN not specified in the Configuration.properties file.");		
}

public static String getEnterVendor_ASN(){
	String EnterVendor_ASN = properties.getProperty("EnterVendor_ASN");
	if(EnterVendor_ASN!= null) return EnterVendor_ASN;
	else throw new RuntimeException("EnterVendor_ASN not specified in the Configuration.properties file.");		
}


public static String getVehicleNumber_ASN(){
	String VehicleNumber_ASN = properties.getProperty("VehicleNumber_ASN");
	if(VehicleNumber_ASN!= null) return VehicleNumber_ASN;
	else throw new RuntimeException("VehicleNumber_ASN not specified in the Configuration.properties file.");		
}


public static String getVRGCNNumber_ASN(){
	String VRGCNNumber_ASN = properties.getProperty("VRGCNNumber_ASN");
	if(VRGCNNumber_ASN!= null) return VRGCNNumber_ASN;
	else throw new RuntimeException("VRGCNNumber_ASN not specified in the Configuration.properties file.");		
}


public static String getPackingType_ASN(){
	String PackingType_ASN = properties.getProperty("PackingType_ASN");
	if(PackingType_ASN!= null) return PackingType_ASN;
	else throw new RuntimeException("PackingType_ASN not specified in the Configuration.properties file.");		
}



public static String getPackageQuantity_ASN(){
	String PackageQuantity_ASN = properties.getProperty("PackageQuantity_ASN");
	if(PackageQuantity_ASN!= null) return PackageQuantity_ASN;
	else throw new RuntimeException("PackageQuantity_ASN not specified in the Configuration.properties file.");		
}


public static String getGrossWeightKG_ASN(){
	String GrossWeight_ASN = properties.getProperty("GrossWeightKG_ASN");
	if(GrossWeight_ASN!= null) return GrossWeight_ASN;
	else throw new RuntimeException("GrossWeight_ASN not specified in the Configuration.properties file.");		
}

public static String getNetWeightKG_ASN(){
	String NetWeightKG_ASN = properties.getProperty("NetWeightKG_ASN");
	if(NetWeightKG_ASN!= null) return NetWeightKG_ASN;
	else throw new RuntimeException("NetWeightKG_ASN not specified in the Configuration.properties file.");		
}

public static String getDimensionUOM_ASN(){
	String DimensionUOM_ASN = properties.getProperty("DimensionUOM_ASN");
	if(DimensionUOM_ASN!= null) return DimensionUOM_ASN;
	else throw new RuntimeException("DimensionUOM_ASN not specified in the Configuration.properties file.");		
}

public static String getDimensionsLBH_ASN(){
	String DimensionsLBH_ASN = properties.getProperty("DimensionsLBH_ASN");
	if(DimensionsLBH_ASN!= null) return DimensionsLBH_ASN;
	else throw new RuntimeException("DimensionsLBH_ASN not specified in the Configuration.properties file.");		
}

public static String getDimensionsB_ASN(){
	String DimensionsB_ASN = properties.getProperty("DimensionsB_ASN");
	if(DimensionsB_ASN!= null) return DimensionsB_ASN;
	else throw new RuntimeException("DimensionsB_ASN not specified in the Configuration.properties file.");		
}

public static String getDimensionsH_ASN(){
	String DimensionsH_ASN = properties.getProperty("DimensionsH_ASN");
	if(DimensionsH_ASN!= null) return DimensionsH_ASN;
	else throw new RuntimeException("DimensionsH_ASN not specified in the Configuration.properties file.");		
}

public static String getDimensionsRemarks_ASN(){
	String DimensionsRemarks_ASN = properties.getProperty("DimensionsRemarks_ASN");
	if(DimensionsRemarks_ASN!= null) return DimensionsRemarks_ASN;
	else throw new RuntimeException("DimensionsRemarks_ASN not specified in the Configuration.properties file.");		
}

public static String getPackageCodeNumber_ASN(){
	String PackageCodeNumber_ASN = properties.getProperty("PackageCodeNumber_ASN");
	if(PackageCodeNumber_ASN!= null) return PackageCodeNumber_ASN;
	else throw new RuntimeException("PackageCodeNumber_ASN not specified in the Configuration.properties file.");		
}


public static String getTown_ASN(){
	String Town_ASN = properties.getProperty("Town_ASN");
	if(Town_ASN!= null) return Town_ASN;
	else throw new RuntimeException("Town_ASN not specified in the Configuration.properties file.");		
}


public static String getPin_ASN(){
	String Pin_ASN = properties.getProperty("Pin_ASN");
	if(Pin_ASN!= null) return Pin_ASN;
	else throw new RuntimeException("Pin_ASN not specified in the Configuration.properties file.");		
}

public static String getEwayBillNumber_ASN(){
	String EwayBillNumber_ASN = properties.getProperty("EwayBillNumber_ASN");
	if(EwayBillNumber_ASN!= null) return EwayBillNumber_ASN;
	else throw new RuntimeException("EwayBillNumber_ASN not specified in the Configuration.properties file.");		
}

public static String getVendorMobileNumber_ASN(){
	String VendorMobileNumber_ASN = properties.getProperty("VendorMobileNumber_ASN");
	if(VendorMobileNumber_ASN!= null) return VendorMobileNumber_ASN;
	else throw new RuntimeException("VendorMobileNumber_ASN not specified in the Configuration.properties file.");		
}

public static String getWeightmentSlipNo_ASN(){
	String WeightmentSlipNo_ASN = properties.getProperty("WeightmentSlipNo_ASN");
	if(WeightmentSlipNo_ASN!= null) return WeightmentSlipNo_ASN;
	else throw new RuntimeException("WeightmentSlipNo_ASN not specified in the Configuration.properties file.");		
}

public static String getGrossWeight_ASN(){
	String GrossWeight_ASN = properties.getProperty("GrossWeight_ASN");
	if(GrossWeight_ASN!= null) return GrossWeight_ASN;
	else throw new RuntimeException("GrossWeight_ASN not specified in the Configuration.properties file.");		
}

public static String getTareWeight_ASN(){
	String TareWeight_ASN = properties.getProperty("TareWeight_ASN");
	if(TareWeight_ASN!= null) return TareWeight_ASN;
	else throw new RuntimeException("TareWeight_ASN not specified in the Configuration.properties file.");		
}




public static String getComments_TCD(){
	String Comments_TCD = properties.getProperty("Comments_TCD");
	if(Comments_TCD!= null) return Comments_TCD;
	else throw new RuntimeException("Comments_TCD not specified in the Configuration.properties file.");		
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

public static String getTAN_VBAuction(){
	String TAN_VBAuction = properties.getProperty("TAN_VBAuction");
	if(TAN_VBAuction!= null) return TAN_VBAuction;
	else throw new RuntimeException("TAN_VBAuction not specified in the Configuration.properties file.");		
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

public static String getPR_Supplyat(){
	String PR_Supplyat = properties.getProperty("PR_Supplyat");
	if(PR_Supplyat!= null) return PR_Supplyat;
	else throw new RuntimeException("PR_Supplyat not specified in the Configuration.properties file.");		
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

public static String getPR_ChooseItemsRePR(){
	String PR_ChooseItemsRePR = properties.getProperty("PR_ChooseItemsRePR");
	if(PR_ChooseItemsRePR!= null) return PR_ChooseItemsRePR;
	else throw new RuntimeException("PR_ChooseItemsRePR not specified in the Configuration.properties file.");		
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

public static String getPRNext_Cost(){
	String getPRNext_Cost = properties.getProperty("CostNext_PRCreate");
	if(getPRNext_Cost!= null) return getPRNext_Cost;
	else throw new RuntimeException("CostNext_PRCreate not specified in the Configuration.properties file.");		
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
	String documentType = properties.getProperty("documentType");
	if(documentType!= null) return documentType;
	else throw new RuntimeException("documentType not specified in the Configuration.properties file.");		
}


public static String getTCD_documentType(){
	String TCD_documentType = properties.getProperty("TCD_documentType");
	if(TCD_documentType!= null) return TCD_documentType;
	else throw new RuntimeException("TCD_documentType not specified in the Configuration.properties file.");		
}


public static String getPOA_Expquantity(){
	String POA_Expquantity = properties.getProperty("POA_Expquantity");
	if(POA_Expquantity!= null) return POA_Expquantity;
	else throw new RuntimeException("POA_Expquantity not specified in the Configuration.properties file.");		
}


public static String getTCD_RejectRemarks(){
	String TCD_RejectRemarks = properties.getProperty("TCD_RejectRemarks");
	if(TCD_RejectRemarks!= null) return TCD_RejectRemarks;
	else throw new RuntimeException("TCD_RejectRemarks not specified in the Configuration.properties file.");		
}

public static String getGC_BuyerName(){
	String GC_BuyerName = properties.getProperty("GC_BuyerName");
	if(GC_BuyerName!= null) return GC_BuyerName;
	else throw new RuntimeException("GC_BuyerName not specified in the Configuration.properties file.");		
}




}