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
			throw new RuntimeException("Confi.properties not found at " + propertyFilePath);
		}		
	}
	
	public static String getDriverPath_Chrome(){
		String getDriverPath_Chrome = properties.getProperty("DriverPath_Chrome");
		if(getDriverPath_Chrome!= null) return getDriverPath_Chrome;
		else throw new RuntimeException("driverPath_Chrome not specified in the Config.properties file.");		
	}
	public static String getDriverPath_Firefox(){
		String driverPath = properties.getProperty("DriverPath_Firefox");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath_Firefox not specified in the Config.properties file.");		
	}
	public static String getDriverPath_Edge(){
		String DriverPath_Edge = properties.getProperty("DriverPath_Edge");
		if(DriverPath_Edge!= null) return DriverPath_Edge;
		else throw new RuntimeException("DriverPath_Edge not specified in the Config.properties file.");		
	}
	public static String getBrowser(){
		String Browser = properties.getProperty("Browser");
		if(Browser!= null) return Browser;
		else throw new RuntimeException("Browser not specified in the Config.properties file.");		
	}
	
	public static String getEnvironment(){
		String Environment = properties.getProperty("Environment");
		if(Environment!= null) return Environment;
		else throw new RuntimeException("Browser not specified in the Config.properties file.");		
	}
	
	public static String getUsername(){
		String Username = properties.getProperty("Username");
		if(Username!= null) return Username;
		else throw new RuntimeException("Username not specified in the Config.properties file.");		
	}
	
	public static String getPassword(){
		String Password = properties.getProperty("Password");
		if(Password!= null) return Password;
		else throw new RuntimeException("Username not specified in the Config.properties file.");		
	}
	public static String getJob(){
		String Job = properties.getProperty("Job");
		if(Job!= null) return Job;
		else throw new RuntimeException("Job");		
	}
	
	public static String RateContractorsNameId(){
		String RateContractorsNameId = properties.getProperty("RateContractorsNameId");
		if(RateContractorsNameId!= null) return RateContractorsNameId;
		else throw new RuntimeException("RateContractorsNameId");		
	}
	
	public static String RateContractorName(){
		String RateContractorName = properties.getProperty("RateContractorName");
		if(RateContractorName!= null) return RateContractorName;
		else throw new RuntimeException("RateContractorName");		
	}
	
	public static String RCType(){
		String RCType = properties.getProperty("RCType");
		if(RCType!= null) return RCType;
		else throw new RuntimeException("RCType");		
	}
	
	public static String RCScope(){
		String RCScope = properties.getProperty("RCScope");
		if(RCScope!= null) return RCScope;
		else throw new RuntimeException("RCScope");		
	}
	
	public static String Effectivedate(){
		String Effectivedate = properties.getProperty("Effectivedate");
		if(Effectivedate!= null) return Effectivedate;
		else throw new RuntimeException("Effectivedate");		
	}
	
	public static String ReferenceNumber(){
		String ReferenceNumber = properties.getProperty("ReferenceNumber");
		if(ReferenceNumber!= null) return ReferenceNumber;
		else throw new RuntimeException("ReferenceNumber");		
	}
	
	public static String CurrencyType(){
		String CurrencyType = properties.getProperty("CurrencyType");
		if(CurrencyType!= null) return CurrencyType;
		else throw new RuntimeException("CurrencyType");		
	}
	
	public static String TransportMode(){
		String TransportMode = properties.getProperty("TransportMode");
		if(TransportMode!= null) return TransportMode;
		else throw new RuntimeException("TransportMode");		
	}
	
	public static String InternalRemarks(){
		String InternalRemarks = properties.getProperty("InternalRemarks");
		if(InternalRemarks!= null) return InternalRemarks;
		else throw new RuntimeException("InternalRemarks");		
	}
	
	public static String ExternalRemarks(){
		String ExternalRemarks = properties.getProperty("ExternalRemarks");
		if(ExternalRemarks!= null) return ExternalRemarks;
		else throw new RuntimeException("ExternalRemarks");		
	}
	
	public static String AdditionalChargesTitle(){
		String AdditionalChargesTitle = properties.getProperty("AdditionalChargesTitle");
		if(AdditionalChargesTitle!= null) return AdditionalChargesTitle;
		else throw new RuntimeException("AdditionalChargesTitle");		
	}
	
	public static String AdditionalChargesAmount(){
		String AdditionalChargesAmount = properties.getProperty("AdditionalChargesAmount");
		if(AdditionalChargesAmount!= null) return AdditionalChargesAmount;
		else throw new RuntimeException("AdditionalChargesAmount");		
	}
	
	public static String AdditionalChargesRemarks(){
		String AdditionalChargesRemarks = properties.getProperty("AdditionalChargesRemarks");
		if(AdditionalChargesRemarks!= null) return AdditionalChargesRemarks;
		else throw new RuntimeException("AdditionalChargesRemarks");		
	}
	
	public static String TermsAndConditions(){
		String TermsAndConditions = properties.getProperty("TermsAndConditions");
		if(TermsAndConditions!= null) return TermsAndConditions;
		else throw new RuntimeException("TermsAndConditions");		
	}
	
	public static String VechileType(){
		String VechileType = properties.getProperty("VechileType");
		if(VechileType!= null) return VechileType;
		else throw new RuntimeException("VechileType");		
	}
	
	public static String MinGaranty(){
		String MinGaranty = properties.getProperty("MinGaranty");
		if(MinGaranty!= null) return MinGaranty;
		else throw new RuntimeException("MinGaranty");		
	}
	
	public static String MaxGaranty(){
		String MaxGaranty = properties.getProperty("MaxGaranty");
		if(MaxGaranty!= null) return MaxGaranty;
		else throw new RuntimeException("MaxGaranty");		
	}
	
	
	public static String FromCountry(){
		String FromCountry = properties.getProperty("FromCountry");
		if(FromCountry!= null) return FromCountry;
		else throw new RuntimeException("FromCountry");		
	}
	
	public static String ToCountry(){
		String ToCountry = properties.getProperty("ToCountry");
		if(ToCountry!= null) return ToCountry;
		else throw new RuntimeException("ToCountry");		
	}
	
	public static String FromState(){
		String FromState = properties.getProperty("FromState");
		if(FromState!= null) return FromState;
		else throw new RuntimeException("FromState");		
	}
	
	public static String ToState(){
		String ToState = properties.getProperty("ToState");
		if(ToState!= null) return ToState;
		else throw new RuntimeException("ToState");		
	}
	
	public static String ToCity(){
		String ToCity = properties.getProperty("ToCity");
		if(ToCity!= null) return ToCity;
		else throw new RuntimeException("ToCity");		
	}
	
	public static String FromCity(){
		String FromCity = properties.getProperty("FromCity");
		if(FromCity!= null) return FromCity;
		else throw new RuntimeException("FromCity");		
	}
	
	public static String FromLocation(){
		String FromLocation = properties.getProperty("FromLocation");
		if(FromLocation!= null) return FromLocation;
		else throw new RuntimeException("FromLocation");		
	}
	
	public static String ToLocation(){
		String ToLocation = properties.getProperty("ToLocation");
		if(ToLocation!= null) return ToLocation;
		else throw new RuntimeException("ToLocation");		
	}
	
	public static String TerrainType(){
		String TerrainType = properties.getProperty("TerrainType");
		if(TerrainType!= null) return TerrainType;
		else throw new RuntimeException("TerrainType");		
	}
	
	public static String Distance(){
		String Distance = properties.getProperty("Distance");
		if(Distance!= null) return Distance;
		else throw new RuntimeException("Distance");		
	}
	
	public static String RatePerVechile(){
		String RatePerVechile = properties.getProperty("RatePerVechile");
		if(RatePerVechile!= null) return RatePerVechile;
		else throw new RuntimeException("RatePerVechile");		
	}
	
	public static String RatePerMT(){
		String RatePerMT = properties.getProperty("RatePerMT");
		if(RatePerMT!= null) return RatePerMT;
		else throw new RuntimeException("RatePerMT");		
	}
	
	public static String TransportHours(){
		String TransportHours = properties.getProperty("TransportHours");
		if(TransportHours!= null) return TransportHours;
		else throw new RuntimeException("TransportHours");		
	}
	
	public static String PaymentRelease(){
		String PaymentRelease = properties.getProperty("PaymentRelease");
		if(PaymentRelease!= null) return PaymentRelease;
		else throw new RuntimeException("PaymentRelease");		
	}
	
	public static String PaymentEvents(){
		String PaymentEvents = properties.getProperty("PaymentEvents");
		if(PaymentEvents!= null) return PaymentEvents;
		else throw new RuntimeException("PaymentEvents");		
	}
	
	public static String ReferenceValue(){
		String ReferenceValue = properties.getProperty("ReferenceValue");
		if(ReferenceValue!= null) return ReferenceValue;
		else throw new RuntimeException("ReferenceValue");		
	}
	
	public static String Creditdays(){
		String Creditdays = properties.getProperty("Creditdays");
		if(Creditdays!= null) return Creditdays;
		else throw new RuntimeException("Creditdays");		
	}
	
	public static String Paymentmode(){
		String Paymentmode = properties.getProperty("Paymentmode");
		if(Paymentmode!= null) return Paymentmode;
		else throw new RuntimeException("Paymentmode");		
	}
	
	public static String ReferenceValue1(){
		String ReferenceValue1 = properties.getProperty("ReferenceValue1");
		if(ReferenceValue1!= null) return ReferenceValue1;
		else throw new RuntimeException("ReferenceValue1");		
	}
	
	public static String PayementRelease1(){
		String PayementRelease1 = properties.getProperty("PayementRelease1");
		if(PayementRelease1!= null) return PayementRelease1;
		else throw new RuntimeException("PayementRelease1");		
	}
	
	public static String PaymentReleasefinal(){
		String PaymentReleasefinal = properties.getProperty("PaymentReleasefinal");
		if(PaymentReleasefinal!= null) return PaymentReleasefinal;
		else throw new RuntimeException("PaymentReleasefinal");		
	}
	
	public static long getImplicitWaitTime() {		
		String ImplicitWaitTime = properties.getProperty("ImplicitWaitTime");
		if(ImplicitWaitTime != null) return Long.parseLong(ImplicitWaitTime);
		else throw new RuntimeException("ImplicitWaitTime not specified in the Config.properties file.");		
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
		else throw new RuntimeException("ScreenshotPath_Pass not specified in the Config.properties file.");		
	}  
	public static String getScreenshotPath_Fail(){
		String ScreenshotPath_Fail = properties.getProperty("ScreenshotPath_Fail");
		if(ScreenshotPath_Fail!= null) return ScreenshotPath_Fail;
		else throw new RuntimeException("ScreenshotPath_Fail not specified in the Config.properties file.");		
	}	 
	public static String getReportPath(){
		String ReportPath = properties.getProperty("ReportPath");
		if(ReportPath!= null) return ReportPath;
		else throw new RuntimeException("ReportPath not specified in the Config.properties file.");		
	}	
	public static CharSequence getApproverName() {
		String approverUserName = properties.getProperty("ApproverName");
		if(approverUserName!= null) return approverUserName;
		else throw new RuntimeException("approverUserName");
	}
	public static CharSequence getApproverPassword() {
		String ApproverPassword = properties.getProperty("ApproverPassword");
		if(ApproverPassword!= null) return ApproverPassword;
		else throw new RuntimeException("ApproverPassword");
	}
}