package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import object_repository.Login_Objects;

public class ConfigFileReader extends Login_Objects {

	private static Properties properties;
	private final String propertyFilePath = "src//main//java//configuration//Configuration.properties";

	public ConfigFileReader() {
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

	public static String getEnvironment() {
		String Environment = properties.getProperty("Environment");
		if (Environment != null)
			return Environment;
		else
			throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}

	public static String Username() {
		String Username = properties.getProperty("Username");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}

	public static String Password() {
		String Password = properties.getProperty("Password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
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

	public static String getReportPath() {
		String ReportPath = properties.getProperty("ReportPath");
		if (ReportPath != null)
			return ReportPath;
		else
			throw new RuntimeException("ReportPath not specified in the Configuration.properties file.");
	}

	
	public static String JobCode() {
		String JobCode = properties.getProperty("JobCode");
		if (JobCode != null)
			return JobCode;
		else
			throw new RuntimeException("JobCode not specified in the Configuration.properties file.");

	}

public static String HiredAssetCode() {
		String HiredAssetCode= properties.getProperty("HiredAssetCode");
		if (HiredAssetCode!= null)
			return HiredAssetCode;
		else
			throw new RuntimeException("HiredAssetCode not specified in the Configuration.properties file.");

	}
public static String OwnedAssetCode() {
	String OwnedAssetCode= properties.getProperty("OwnedAssetCode");
	if (OwnedAssetCode!= null)
		return OwnedAssetCode;
	else
		throw new RuntimeException("OwnedAssetCode not specified in the Configuration.properties file.");

}
public static String Duration() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");

	}

public static String BreakDownType() {
	String BreakDownType = properties.getProperty("BreakDownType");
	if (BreakDownType != null)
		return BreakDownType;
	else
		throw new RuntimeException("BreakDownType not specified in the Configuration.properties file.");

}

public static String NatureOfDefect() {
	String NatureOfDefect = properties.getProperty("NatureOfDefect");
	if (NatureOfDefect != null)
		return NatureOfDefect;
	else
		throw new RuntimeException("NatureOfDefect not specified in the Configuration.properties file.");

}
public static String BreakdownFromDate() {
	String BreakdownFromDate = properties.getProperty("BreakdownFromDate");
	if (BreakdownFromDate != null)
		return BreakdownFromDate;
	else
		throw new RuntimeException("BreakdownFromDate not specified in the Configuration.properties file.");

}
public static String BreakdownFromTime() {
	String BreakdownFromTime = properties.getProperty("BreakdownFromTime");
	if (BreakdownFromTime != null)
		return BreakdownFromTime;
	else
		throw new RuntimeException("BreakdownFromTime not specified in the Configuration.properties file.");

}
public static String ExpCommissioningDate() {
	String ExpCommissioningDate = properties.getProperty("ExpCommissioningDate");
	if (ExpCommissioningDate != null)
		return ExpCommissioningDate;
	else
		throw new RuntimeException("ExpCommissioningDate not specified in the Configuration.properties file.");

}
public static String ExpCommissioningTime() {
	String ExpCommissioningTime = properties.getProperty("ExpCommissioningTime");
	if (ExpCommissioningTime != null)
		return ExpCommissioningTime;
	else
		throw new RuntimeException("ExpCommissioningTime not specified in the Configuration.properties file.");

}
public static String BreakdownRemarks() {
	String BreakdownRemarks = properties.getProperty("BreakdownRemarks");
	if (BreakdownRemarks != null)
		return BreakdownRemarks;
	else
		throw new RuntimeException("BreakdownRemarks not specified in the Configuration.properties file.");

}
public static String CommisioningDate() {
	String CommisioningDate = properties.getProperty("CommisioningDate");
	if (CommisioningDate != null)
		return CommisioningDate;
	else
		throw new RuntimeException("CommisioningDate not specified in the Configuration.properties file.");

}
public static String NextMaintanenceDate() {
	String NextMaintanenceDate = properties.getProperty("NextMaintanenceDate");
	if (NextMaintanenceDate != null)
		return NextMaintanenceDate;
	else
		throw new RuntimeException("NextMaintanenceDate not specified in the Configuration.properties file.");

}
public static String FailureInvestigation() {
	String FailureInvestigation = properties.getProperty("FailureInvestigation");
	if (FailureInvestigation != null)
		return FailureInvestigation;
	else
		throw new RuntimeException("FailureInvestigation not specified in the Configuration.properties file.");

}
public static String PM_Incharge() {
	String PM_Incharge = properties.getProperty("PM_Incharge");
	if (PM_Incharge != null)
		return PM_Incharge;
	else
		throw new RuntimeException("PM_Incharge not specified in the Configuration.properties file.");

}
public static String WorkDone() {
	String WorkDone = properties.getProperty("WorkDone");
	if (WorkDone != null)
		return WorkDone;
	else
		throw new RuntimeException("WorkDone not specified in the Configuration.properties file.");

}
public static String CommissioningRemarks() {
	String CommissioningRemarks = properties.getProperty("CommissioningRemarks");
	if (CommissioningRemarks != null)
		return CommissioningRemarks;
	else
		throw new RuntimeException("CommissioningRemarks not specified in the Configuration.properties file.");

}
public static String CauseOfFailure() {
	String CauseOfFailure = properties.getProperty("CauseOfFailure");
	if (CauseOfFailure != null)
		return CauseOfFailure;
	else
		throw new RuntimeException("CauseOfFailure not specified in the Configuration.properties file.");

}
public static String SubAssembly() {
	String SubAssembly = properties.getProperty("SubAssembly");
	if (SubAssembly != null)
		return SubAssembly;
	else
		throw new RuntimeException("SubAssembly not specified in the Configuration.properties file.");

}
public static String AgencyName() {
	String AgencyName = properties.getProperty("AgencyName");
	if (AgencyName != null)
		return AgencyName;
	else
		throw new RuntimeException("AgencyName not specified in the Configuration.properties file.");

}
public static String NatureOfRepair() {
	String NatureOfRepair = properties.getProperty("NatureOfRepair");
	if (NatureOfRepair != null)
		return NatureOfRepair;
	else
		throw new RuntimeException("NatureOfRepair not specified in the Configuration.properties file.");

}
public static String SparesCost() {
	String SparesCost = properties.getProperty("SparesCost");
	if (SparesCost != null)
		return SparesCost;
	else
		throw new RuntimeException("SparesCost not specified in the Configuration.properties file.");

}
public static String LabourCost() {
	String LabourCost = properties.getProperty("LabourCost");
	if (LabourCost != null)
		return LabourCost;
	else
		throw new RuntimeException("LabourCost not specified in the Configuration.properties file.");

}
public static String OilCost() {
	String OilCost = properties.getProperty("OilCost");
	if (OilCost != null)
		return OilCost;
	else
		throw new RuntimeException("OilCost not specified in the Configuration.properties file.");

}
public static String ConsumableCost() {
	String ConsumableCost = properties.getProperty("ConsumableCost");
	if (ConsumableCost != null)
		return ConsumableCost;
	else
		throw new RuntimeException("ConsumableCost not specified in the Configuration.properties file.");

}
public static String AgencyRepairCost() {
	String AgencyRepairCost = properties.getProperty("AgencyRepairCost");
	if (AgencyRepairCost != null)
		return AgencyRepairCost;
	else
		throw new RuntimeException("AgencyRepairCost not specified in the Configuration.properties file.");

}
public static String OthersCost() {
	String OthersCost = properties.getProperty("OthersCost");
	if (OthersCost != null)
		return OthersCost;
	else
		throw new RuntimeException("OthersCost not specified in the Configuration.properties file.");

}
public static String Materials() {
	String Materials = properties.getProperty("Materials");
	if (Materials != null)
		return Materials;
	else
		throw new RuntimeException("Materials not specified in the Configuration.properties file.");

}
public static String PartNo() {
	String PartNo = properties.getProperty("PartNo");
	if (PartNo != null)
		return PartNo;
	else
		throw new RuntimeException("PartNo not specified in the Configuration.properties file.");

}
public static String PartName() {
	String PartName = properties.getProperty("PartName");
	if (PartName != null)
		return PartName;
	else
		throw new RuntimeException("PartName not specified in the Configuration.properties file.");

}
public static String Quantity() {
	String Quantity = properties.getProperty("Quantity");
	if (Quantity != null)
		return Quantity;
	else
		throw new RuntimeException("Quantity not specified in the Configuration.properties file.");

}
public static String Amount() {
	String Amount = properties.getProperty("Amount");
	if (Amount != null)
		return Amount;
	else
		throw new RuntimeException("Amount not specified in the Configuration.properties file.");

}
public static String MajorSparesRemarks() {
	String MajorSparesRemarks = properties.getProperty("MajorSparesRemarks");
	if (MajorSparesRemarks != null)
		return MajorSparesRemarks;
	else
		throw new RuntimeException("MajorSparesRemarks not specified in the Configuration.properties file.");

}
public static String Currency() {
	String Currency = properties.getProperty("Currency");
	if (Currency != null)
		return Currency;
	else
		throw new RuntimeException("Currency not specified in the Configuration.properties file.");

}
public static String BreakDownJobCode() {
	String BreakDownJobCode = properties.getProperty("BreakDownJobCode");
	if (BreakDownJobCode != null)
		return BreakDownJobCode;
	else
		throw new RuntimeException("BreakDownJobCode not specified in the Configuration.properties file.");

}
public static String BreakDownAssetCode() {
	String BreakDownAssetCode = properties.getProperty("BreakDownAssetCode");
	if (BreakDownAssetCode != null)
		return BreakDownAssetCode;
	else
		throw new RuntimeException("BreakDownAssetCode not specified in the Configuration.properties file.");

}
public static String BreakDownDuration() {
	String BreakDownDuration = properties.getProperty("BreakDownDuration");
	if (BreakDownDuration != null)
		return BreakDownDuration;
	else
		throw new RuntimeException("BreakDownDuration not specified in the Configuration.properties file.");

}

public static String Approver1() {
	String Approver1 = properties.getProperty("Approver1");
	if (Approver1 != null)
		return Approver1;
	else
		throw new RuntimeException("Approver1 not specified in the Configuration.properties file.");

}
public static String Approver2() {
	String Approver2 = properties.getProperty("Approver2");
	if (Approver2 != null)
		return Approver2;
	else
		throw new RuntimeException("Approver2 not specified in the Configuration.properties file.");

}

	


public static String getUsername(){
	String Username = properties.getProperty("Username");
	if(Username!= null) return Username;
	else throw new RuntimeException("Username not specified in the Configuration.properties file.");		
}

public static String getPassword(){
	String Password = properties.getProperty("Password");
	if(Password!= null) return Password;
	else throw new RuntimeException("Username not specified in the Configuration.properties file.");		
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
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static String getLogjob(){
		String job = properties.getProperty("JobCode");
		if(job!= null) return job;
		else throw new RuntimeException("job_code not specified in the Configuration.properties file.");		
	}
	
	public static String getLogAsset(){
		String Asset = properties.getProperty("AssetCode");
		if(Asset!= null) return Asset;
		else throw new RuntimeException("Assetcode not specified in the Configuration.properties file.");		
	}
	
	public static String getEndmeter(){
		String Endmeter = properties.getProperty("Endmeter");
		if(Endmeter!= null) return Endmeter;
		else throw new RuntimeException("Endmeter not specified in the Configuration.properties file.");		
	}
	
	public static String getQuantity(){
		String Quantity = properties.getProperty("Quantity");
		if(Quantity!= null) return Quantity;
		else throw new RuntimeException("Quantity not specified in the Configuration.properties file.");		
	}
	
	public static String getTQuantity(){
		String TQuantity = properties.getProperty("TQuantity");
		if(TQuantity!= null) return TQuantity;
		else throw new RuntimeException("TQuantity not specified in the Configuration.properties file.");		
	}
	public static String getMOT(){
		String MOT = properties.getProperty("MOT");
		if(MOT!= null) return MOT;
		else throw new RuntimeException("Maintenance Over Time not specified in the Configuration.properties file.");		
	}
	
	public static String getMQuantity(){
		String MQuantity = properties.getProperty("MQuantity");
		if(MQuantity!= null) return MQuantity;
		else throw new RuntimeException("MQuantity not specified in the Configuration.properties file.");		
	}
	
	public static String getHIdle(){
		String HIdle = properties.getProperty("HIdle");
		if(HIdle!= null) return HIdle;
		else throw new RuntimeException("Hired Idle Hours not specified in the Configuration.properties file.");		
	}
	public static String getHBreakDown(){
		String HBreakDown = properties.getProperty("HBreakDown");
		if(HBreakDown!= null) return HBreakDown;
		else throw new RuntimeException("Hired BreakDown Hours not specified in the Configuration.properties file.");		
	}
	
	

	public static String Environment() {
		String Environment = properties.getProperty("Environment");
		System.out.println("Test Environment = " + Environment);
		if (Environment != null)
			return Environment;
		else
			throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}

//	public static String getUsername() {
//		String Username = properties.getProperty("Username");
//		if (Username != null)
//			return Username;
//		else
//			throw new RuntimeException("Username not specified in the Configuration.properties file.");
//	}
	public static String getUname() {
		String Username = properties.getProperty("Username");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username not specified in the Configuration.properties file.");
	}

//	public static String getPassword() {
//		String Password = properties.getProperty("Password");
//		if (Password != null)
//			return Password;
//		else
//			throw new RuntimeException("Username not specified in the Configuration.properties file.");
//	}
								//**************************************//
	public static String getPword() {
		String Password = properties.getProperty("Password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("Password not specified in the Configuration.properties file.");
	}
	public static String getjobcode() {
		String Jobcode = properties.getProperty("JobCode");
		if (Jobcode != null)
			return Jobcode;
		else
			throw new RuntimeException("Jobcode not specified in the Configuration.properties file.");
	}
	public static String getassetcode() {
		String Assetcode = properties.getProperty("AssetCode");
		if (Assetcode != null)
			return Assetcode;
		else
			throw new RuntimeException("Assetcode not specified in the Configuration.properties file.");
	}
	public static String getduration() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");
	}
	public static String getworkdata() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");
	}
	public static String getidledata() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");
	}
	public static String getbreakdowndata() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");
	}
	public static String getotdata() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");
	}
	public static String getfueldata() {
		String Duration = properties.getProperty("Duration");
		if (Duration != null)
			return Duration;
		else
			throw new RuntimeException("Duration not specified in the Configuration.properties file.");
	}


	
}




