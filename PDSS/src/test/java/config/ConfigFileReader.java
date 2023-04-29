package config;

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
		BufferedReader reader2;
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
	public static String getScreenshotPath_Scenario(){
		String ScreenshotPath_Scenario = properties.getProperty("ScreenshotPath_Scenario");
		if(ScreenshotPath_Scenario!= null) return ScreenshotPath_Scenario;
		else throw new RuntimeException("ScreenshotPath_Scenario not specified in the Configuration.properties file.");		
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
		//Induction_basicdetails_Partner_TestData
				public static String getpartner_name(){
					String partner_name = properties.getProperty("partner_name");
					if(partner_name!= null) return partner_name;
					else throw new RuntimeException("partner_name not specified in the Configuration.properties file.");		
				}
				public static String getpartner_name_Update(){
					String partner_name_Update = properties.getProperty("partner_name_Update");
					if(partner_name_Update!= null) return partner_name_Update;
					else throw new RuntimeException("partner_name_Update not specified in the Configuration.properties file.");		
				}
				public static String getpartner_id(){
					String partner_id = properties.getProperty("partner_id");
					if(partner_id!= null) return partner_id;
					else throw new RuntimeException("partner_id not specified in the Configuration.properties file.");		
				}
				public static String getpartner_dr_details_name(){
					String partner_dr_details_name = properties.getProperty("partner_dr_details_name");
					if(partner_dr_details_name!= null) return partner_dr_details_name;
					else throw new RuntimeException("partner_dr_details_name not specified in the Configuration.properties file.");		
				}	
				public static String getpartner_dr_details_name_Update(){
					String partner_dr_details_name_Update = properties.getProperty("partner_dr_details_name_Update");
					if(partner_dr_details_name_Update!= null) return partner_dr_details_name_Update;
					else throw new RuntimeException("partner_dr_details_name_Update not specified in the Configuration.properties file.");		
				}
				public static String getpartner_dr_details_ID(){
					String partner_dr_details_ID = properties.getProperty("partner_dr_details_ID");
					if(partner_dr_details_ID!= null) return partner_dr_details_ID;
					else throw new RuntimeException("partner_dr_details_ID not specified in the Configuration.properties file.");		
				}
				public static String getpartner_Worktype(){
					String partner_Worktype = properties.getProperty("partner_Worktype");
					if(partner_Worktype!= null) return partner_Worktype;
					else throw new RuntimeException("partner_Worktype not specified in the Configuration.properties file.");		
				}	
				public static String getpartner_Worktype_Update(){
					String partner_Worktype_Update = properties.getProperty("partner_Worktype_Update");
					if(partner_Worktype_Update!= null) return partner_Worktype_Update;
					else throw new RuntimeException("partner_Worktype_Update not specified in the Configuration.properties file.");		
				}	
//***********************************************************************************************************************//
		//Induction_basicdetails_Personal_TestData
						public static String getWorkman_name(){
							String Workman_name = properties.getProperty("Workman_name");
							if(Workman_name!= null) return Workman_name;
							else throw new RuntimeException("Workman_name not specified in the Configuration.properties file.");		
						}
						public static String getWorkman_Father_name(){
							String Workman_Father_name = properties.getProperty("Workman_Father_name");
							if(Workman_Father_name!= null) return Workman_Father_name;
							else throw new RuntimeException("Workman_Father_name not specified in the Configuration.properties file.");		
						}
						public static String getDOB(){
							String getDOB = properties.getProperty("getDOB");
							if(getDOB!= null) return getDOB;
							else throw new RuntimeException("getDOB not specified in the Configuration.properties file.");		
						}
						
						//Hard coded
						public static String getDOB_Date_Month(){
							String DOB_Date_Month = properties.getProperty("DOB_Date_Month");
							if(DOB_Date_Month!= null) return DOB_Date_Month;
							else throw new RuntimeException("DOB_Date_Month not specified in the Configuration.properties file.");		
						}
						public static String getDOB_Year(){
							String DOB_Year = properties.getProperty("DOB_Year");
							if(DOB_Year!= null) return DOB_Year;
							else throw new RuntimeException("DOB_Year not specified in the Configuration.properties file.");		
						}
						public static String getLanguage1(){
							String Language1 = properties.getProperty("Language1");
							if(Language1!= null) return Language1;
							else throw new RuntimeException("Language1 not specified in the Configuration.properties file.");		
						}
						public static String getL1Read(){
							String L1Read = properties.getProperty("L1Read");
							if(L1Read!= null) return L1Read;
							else throw new RuntimeException("L1Read not specified in the Configuration.properties file.");		
						}
						public static String getL1Write(){
							String L1Write = properties.getProperty("L1Write");
							if(L1Write!= null) return L1Write;
							else throw new RuntimeException("L1Write not specified in the Configuration.properties file.");		
						}
						public static String getL1speak(){
							String L1Speak = properties.getProperty("L1Speak");
							if(L1Speak!= null) return L1Speak;
							else throw new RuntimeException("L1Speak not specified in the Configuration.properties file.");		
						}
						public static String getLanguage2(){
							String Language2 = properties.getProperty("Language2");
							if(Language2!= null) return Language2;
							else throw new RuntimeException("Language2 not specified in the Configuration.properties file.");		
						}
						public static String getL2Read(){
							String L2Read = properties.getProperty("L2Read");
							if(L2Read!= null) return L2Read;
							else throw new RuntimeException("L2Read not specified in the Configuration.properties file.");		
						}
						public static String getL2Write(){
							String L2Write = properties.getProperty("L2Write");
							if(L2Write!= null) return L2Write;
							else throw new RuntimeException("L2Write not specified in the Configuration.properties file.");		
						}
						public static String getL2speak(){
							String L2Speak = properties.getProperty("L2Speak");
							if(L2Speak!= null) return L2Speak;
							else throw new RuntimeException("L2Speak not specified in the Configuration.properties file.");		
						}
						public static String getLanguage3(){
							String Language3 = properties.getProperty("Language3");
							if(Language3!= null) return Language3;
							else throw new RuntimeException("Language3 not specified in the Configuration.properties file.");		
						}
						public static String getL3Read(){
							String L3Read = properties.getProperty("L3Read");
							if(L3Read!= null) return L3Read;
							else throw new RuntimeException("L3Read not specified in the Configuration.properties file.");		
						}
						public static String getL3Write(){
							String L3Write = properties.getProperty("L3Write");
							if(L3Write!= null) return L3Write;
							else throw new RuntimeException("L3Write not specified in the Configuration.properties file.");		
						}
						public static String getL3speak(){
							String L3Speak = properties.getProperty("L3Speak");
							if(L3Speak!= null) return L3Speak;
							else throw new RuntimeException("L3Speak not specified in the Configuration.properties file.");		
						}
						public static String getGender(){
							String Gender = properties.getProperty("Gender");
							if(Gender!= null) return Gender;
							else throw new RuntimeException("Gender not specified in the Configuration.properties file.");		
						}
						public static String getMarital_status(){
							String Marital_status = properties.getProperty("Marital_status");
							if(Marital_status!= null) return Marital_status;
							else throw new RuntimeException("Marital_status not specified in the Configuration.properties file.");		
						}	
						public static String getspouse_name(){
							String spouse_name = properties.getProperty("spouse_name");
							if(spouse_name!= null) return spouse_name;
							else throw new RuntimeException("spouse_name not specified in the Configuration.properties file.");		
						}	
						public static String getNo_of_childeren(){
							String No_of_childeren = properties.getProperty("No_of_childeren");
							if(No_of_childeren!= null) return No_of_childeren;
							else throw new RuntimeException("No_of_childeren not specified in the Configuration.properties file.");		
						}	
						public static String getBlood_Group(){
							String Blood_Group = properties.getProperty("Blood_Group");
							if(Blood_Group!= null) return Blood_Group;
							else throw new RuntimeException("Blood_Group not specified in the Configuration.properties file.");		
						}	
						public static String getCSTI(){
							String CSTI = properties.getProperty("CSTI");
							if(CSTI!= null) return CSTI;
							else throw new RuntimeException("CSTI not specified in the Configuration.properties file.");		
						}	
						public static String getNAPS(){
							String NAPS = properties.getProperty("NAPS");
							if(NAPS!= null) return NAPS;
							else throw new RuntimeException("NAPS not specified in the Configuration.properties file.");		
						}	
						public static String getEnable_CSTI(){
							String Enable_CSTI = properties.getProperty("Enable_CSTI");
							if(Enable_CSTI!= null) return Enable_CSTI;
							else throw new RuntimeException("Enable_CSTI not specified in the Configuration.properties file.");		
						}	
						public static String getEnable_NAPS(){
							String Enable_NAPS = properties.getProperty("Enable_NAPS");
							if(Enable_NAPS!= null) return Enable_NAPS;
							else throw new RuntimeException("Enable_NAPS not specified in the Configuration.properties file.");		
						}
//***********************************************************************************************************************//
						//Induction_basicdetails_Personal_update_TestData
						public static String getWorkman_name_update(){
							String Workman_name_update = properties.getProperty("Workman_name_update");
							if(Workman_name_update!= null) return Workman_name_update;
							else throw new RuntimeException("Workman_name_update not specified in the Configuration.properties file.");		
						}
						public static String getWorkman_Father_name_update(){
							String Workman_Father_name_update = properties.getProperty("Workman_Father_name_update");
							if(Workman_Father_name_update!= null) return Workman_Father_name_update;
							else throw new RuntimeException("Workman_Father_name_update not specified in the Configuration.properties file.");		
						}
						public static String getDOB_update(){
							String getDOB_update = properties.getProperty("getDOB_update");
							if(getDOB_update!= null) return getDOB_update;
							else throw new RuntimeException("getDOB_update not specified in the Configuration.properties file.");		
						}
						
						//Hard coded
						public static String getDOB_Date_Month_update(){
							String DOB_Date_Month_update = properties.getProperty("DOB_Date_Month_update");
							if(DOB_Date_Month_update!= null) return DOB_Date_Month_update;
							else throw new RuntimeException("DOB_Date_Month_update not specified in the Configuration.properties file.");		
						}
						public static String getDOB_Year_update(){
							String DOB_Year_update = properties.getProperty("DOB_Year_update");
							if(DOB_Year_update!= null) return DOB_Year_update;
							else throw new RuntimeException("DOB_Year_update not specified in the Configuration.properties file.");		
						}
						public static String getLanguage1_update(){
							String Language1_update = properties.getProperty("Language1_update");
							if(Language1_update!= null) return Language1_update;
							else throw new RuntimeException("Language1_update not specified in the Configuration.properties file.");		
						}
						public static String getL1Read_update(){
							String L1Read_update = properties.getProperty("L1Read_update");
							if(L1Read_update!= null) return L1Read_update;
							else throw new RuntimeException("L1Read_update not specified in the Configuration.properties file.");		
						}
						public static String getL1Write_update(){
							String L1Write_update = properties.getProperty("L1Write_update");
							if(L1Write_update!= null) return L1Write_update;
							else throw new RuntimeException("L1Write_update not specified in the Configuration.properties file.");		
						}
						public static String getL1speak_update(){
							String L1Speak_update = properties.getProperty("L1Speak_update");
							if(L1Speak_update!= null) return L1Speak_update;
							else throw new RuntimeException("L1Speak_update not specified in the Configuration.properties file.");		
						}
						public static String getLanguage2_update(){
							String Language2_update = properties.getProperty("Language2_update");
							if(Language2_update!= null) return Language2_update;
							else throw new RuntimeException("Language2_update not specified in the Configuration.properties file.");		
						}
						public static String getL2Read_update(){
							String L2Read_update = properties.getProperty("L2Read_update");
							if(L2Read_update!= null) return L2Read_update;
							else throw new RuntimeException("L2Read_update not specified in the Configuration.properties file.");		
						}
						public static String getL2Write_update(){
							String L2Write_update = properties.getProperty("L2Write_update");
							if(L2Write_update!= null) return L2Write_update;
							else throw new RuntimeException("L2Write_update not specified in the Configuration.properties file.");		
						}
						public static String getL2speak_update(){
							String L2Speak_update = properties.getProperty("L2Speak_update");
							if(L2Speak_update!= null) return L2Speak_update;
							else throw new RuntimeException("L2Speak_update not specified in the Configuration.properties file.");		
						}
						public static String getLanguage3_update(){
							String Language3_update = properties.getProperty("Language3_update");
							if(Language3_update!= null) return Language3_update;
							else throw new RuntimeException("Language3_update not specified in the Configuration.properties file.");		
						}
						public static String getL3Read_update(){
							String L3Read_update = properties.getProperty("L3Read_update");
							if(L3Read_update!= null) return L3Read_update;
							else throw new RuntimeException("L3Read_update not specified in the Configuration.properties file.");		
						}
						public static String getL3Write_update(){
							String L3Write_update = properties.getProperty("L3Write_update");
							if(L3Write_update!= null) return L3Write_update;
							else throw new RuntimeException("L3Write_update not specified in the Configuration.properties file.");		
						}
						public static String getL3speak_update(){
							String L3Speak_update = properties.getProperty("L3Speak_update");
							if(L3Speak_update!= null) return L3Speak_update;
							else throw new RuntimeException("L3Speak_update not specified in the Configuration.properties file.");		
						}
						public static String getGender_update(){
							String Gender_update = properties.getProperty("Gender_update");
							if(Gender_update!= null) return Gender_update;
							else throw new RuntimeException("Gender_update not specified in the Configuration.properties file.");		
						}
						public static String getMarital_status_update(){
							String Marital_status_update = properties.getProperty("Marital_status_update");
							if(Marital_status_update!= null) return Marital_status_update;
							else throw new RuntimeException("Marital_status_update not specified in the Configuration.properties file.");		
						}	
						public static String getspouse_name_update(){
							String spouse_name_update = properties.getProperty("spouse_name_update");
							if(spouse_name_update!= null) return spouse_name_update;
							else throw new RuntimeException("spouse_name_update not specified in the Configuration.properties file.");		
						}	
						public static String getNo_of_childeren_update(){
							String No_of_childeren_update = properties.getProperty("No_of_childeren_update");
							if(No_of_childeren_update!= null) return No_of_childeren_update;
							else throw new RuntimeException("No_of_childeren_update not specified in the Configuration.properties file.");		
						}	
						public static String getBlood_Group_update(){
							String Blood_Group_update = properties.getProperty("Blood_Group_update");
							if(Blood_Group_update!= null) return Blood_Group_update;
							else throw new RuntimeException("Blood_Group_update not specified in the Configuration.properties file.");		
						}	
						public static String getCSTI_update(){
							String CSTI_update = properties.getProperty("CSTI_update");
							if(CSTI_update!= null) return CSTI_update;
							else throw new RuntimeException("CSTI_update not specified in the Configuration.properties file.");		
						}	
						public static String getNAPS_update(){
							String NAPS_update = properties.getProperty("NAPS_update");
							if(NAPS_update!= null) return NAPS_update;
							else throw new RuntimeException("NAPS_update not specified in the Configuration.properties file.");		
						}	
						public static String getEnable_CSTI_update(){
							String Enable_CSTI_update = properties.getProperty("Enable_CSTI_update");
							if(Enable_CSTI_update!= null) return Enable_CSTI_update;
							else throw new RuntimeException("Enable_CSTI_update not specified in the Configuration.properties file.");		
						}	
						public static String getEnable_NAPS_update(){
							String Enable_NAPS_update = properties.getProperty("Enable_NAPS_update");
							if(Enable_NAPS_update!= null) return Enable_NAPS_update;
							else throw new RuntimeException("Enable_NAPS_update not specified in the Configuration.properties file.");		
						}
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
						public static String getSame_as_Permanent_Address(){
							String Same_as_Permanent_Address = properties.getProperty("Same_as_Permanent_Address");
							if(Same_as_Permanent_Address!= null) return Same_as_Permanent_Address;
							else throw new RuntimeException("Same_as_Permanent_Address not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Pincode(){
							String Temporary_Address_Pincode = properties.getProperty("Temporary_Address_Pincode");
							if(Temporary_Address_Pincode!= null) return Temporary_Address_Pincode;
							else throw new RuntimeException("Temporary_Address_Pincode not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address(){
							String Temporary_Address = properties.getProperty("Temporary_Address");
							if(Temporary_Address!= null) return Temporary_Address;
							else throw new RuntimeException("Temporary_Address not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Village(){
							String Temporary_Address_Village = properties.getProperty("Temporary_Address_Village");
							if(Temporary_Address_Village!= null) return Temporary_Address_Village;
							else throw new RuntimeException("Temporary_Address_Village not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Name(){
							String Emergency_Contact_Name = properties.getProperty("Emergency_Contact_Name");
							if(Emergency_Contact_Name!= null) return Emergency_Contact_Name;
							else throw new RuntimeException("Emergency_Contact_Name not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Mobile(){
							String Emergency_Contact_Mobile = properties.getProperty("Emergency_Contact_Mobile");
							if(Emergency_Contact_Mobile!= null) return Emergency_Contact_Mobile;
							else throw new RuntimeException("Emergency_Contact_Mobile not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Relation(){
							String Emergency_Contact_Relation = properties.getProperty("Emergency_Contact_Relation");
							if(Emergency_Contact_Relation!= null) return Emergency_Contact_Relation;
							else throw new RuntimeException("Emergency_Contact_Relation not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Pincode(){
							String Emergency_Contact_Pincode = properties.getProperty("Emergency_Contact_Pincode");
							if(Emergency_Contact_Pincode!= null) return Emergency_Contact_Pincode;
							else throw new RuntimeException("Emergency_Contact_Pincode not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Address(){
							String Emergency_Contact_Address = properties.getProperty("Emergency_Contact_Address");
							if(Emergency_Contact_Address!= null) return Emergency_Contact_Address;
							else throw new RuntimeException("Emergency_Contact_Address not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Village(){
							String Emergency_Contact_Village = properties.getProperty("Emergency_Contact_Village");
							if(Emergency_Contact_Village!= null) return Emergency_Contact_Village;
							else throw new RuntimeException("Emergency_Contact_Village not specified in the Configuration.properties file.");		
						}

//***********************************************************************************************************************//
//Induction_basicdetails_Communication_Update_TestData
						
						public static String getMobilenumber_update(){
							String Mobilenumber_update = properties.getProperty("Mobilenumber_update");
							if(Mobilenumber_update!= null) return Mobilenumber_update;
							else throw new RuntimeException("Mobilenumber_update not specified in the Configuration.properties file.");		
						}
						
						public static String getPermanent_Address_pincode_update(){
							String Permanent_Address_pincode_update = properties.getProperty("Permanent_Address_pincode_update");
							if(Permanent_Address_pincode_update!= null) return Permanent_Address_pincode_update;
							else throw new RuntimeException("Permanent_Address_pincode_update not specified in the Configuration.properties file.");		
						}
						public static String getPermanent_Address_update(){
							String Permanent_Address_update = properties.getProperty("Permanent_Address_update");
							if(Permanent_Address_update!= null) return Permanent_Address_update;
							else throw new RuntimeException("Permanent_Address_update not specified in the Configuration.properties file.");		
						}
						public static String getPermanent_Address_update2(){
							String Permanent_Address_update2 = properties.getProperty("Permanent_Address_update2");
							if(Permanent_Address_update2!= null) return Permanent_Address_update2;
							else throw new RuntimeException("Permanent_Address_update2 not specified in the Configuration.properties file.");		
						}
						public static String getPermanent_Address_Village_update(){
							String Permanent_Address_Village_update = properties.getProperty("Permanent_Address_Village_update");
							if(Permanent_Address_Village_update!= null) return Permanent_Address_Village_update;
							else throw new RuntimeException("Permanent_Address_Village_update not specified in the Configuration.properties file.");		
						}
						public static String getPermanent_Address_Village_update2(){
							String Permanent_Address_Village_update2 = properties.getProperty("Permanent_Address_Village_update2");
							if(Permanent_Address_Village_update2!= null) return Permanent_Address_Village_update2;
							else throw new RuntimeException("Permanent_Address_Village_update2 not specified in the Configuration.properties file.");		
						}
						public static String getSame_as_Permanent_Address_update(){
							String Same_as_Permanent_Address_update = properties.getProperty("Same_as_Permanent_Address_update");
							if(Same_as_Permanent_Address_update!= null) return Same_as_Permanent_Address_update;
							else throw new RuntimeException("Same_as_Permanent_Address_update not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Pincode_update(){
							String Temporary_Address_Pincode_update = properties.getProperty("Temporary_Address_Pincode_update");
							if(Temporary_Address_Pincode_update!= null) return Temporary_Address_Pincode_update;
							else throw new RuntimeException("Temporary_Address_Pincode_update not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_update(){
							String Temporary_Address_update = properties.getProperty("Temporary_Address_update");
							if(Temporary_Address_update!= null) return Temporary_Address_update;
							else throw new RuntimeException("Temporary_Address_update not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_update2(){
							String Temporary_Address_update2 = properties.getProperty("Temporary_Address_update2");
							if(Temporary_Address_update2!= null) return Temporary_Address_update2;
							else throw new RuntimeException("Temporary_Address_update2 not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Village_update(){
							String Temporary_Address_Village_update = properties.getProperty("Temporary_Address_Village_update");
							if(Temporary_Address_Village_update!= null) return Temporary_Address_Village_update;
							else throw new RuntimeException("Temporary_Address_Village_update not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Village_update_A(){
							String Temporary_Address_Village_update_A = properties.getProperty("Temporary_Address_Village_update_A");
							if(Temporary_Address_Village_update_A!= null) return Temporary_Address_Village_update_A;
							else throw new RuntimeException("Temporary_Address_Village_update_A not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Village_update2(){
							String Temporary_Address_Village_update2 = properties.getProperty("Temporary_Address_Village_update2");
							if(Temporary_Address_Village_update2!= null) return Temporary_Address_Village_update2;
							else throw new RuntimeException("Temporary_Address_Village_update2 not specified in the Configuration.properties file.");		
						}
						public static String getTemporary_Address_Village_update_B(){
							String Temporary_Address_Village_update_B = properties.getProperty("Temporary_Address_Village_update_B");
							if(Temporary_Address_Village_update_B!= null) return Temporary_Address_Village_update_B;
							else throw new RuntimeException("Temporary_Address_Village_update_B not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Name_update(){
							String Emergency_Contact_Name_update = properties.getProperty("Emergency_Contact_Name_update");
							if(Emergency_Contact_Name_update!= null) return Emergency_Contact_Name_update;
							else throw new RuntimeException("Emergency_Contact_Name_update not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Mobile_Update(){
							String Emergency_Contact_Mobile_Update = properties.getProperty("Emergency_Contact_Mobile_Update");
							if(Emergency_Contact_Mobile_Update!= null) return Emergency_Contact_Mobile_Update;
							else throw new RuntimeException("Emergency_Contact_Mobile_Update not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Relation_update(){
							String Emergency_Contact_Relation_update = properties.getProperty("Emergency_Contact_Relation_update");
							if(Emergency_Contact_Relation_update!= null) return Emergency_Contact_Relation_update;
							else throw new RuntimeException("Emergency_Contact_Relation_update not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Pincode_update(){
							String Emergency_Contact_Pincode_update = properties.getProperty("Emergency_Contact_Pincode_update");
							if(Emergency_Contact_Pincode_update!= null) return Emergency_Contact_Pincode_update;
							else throw new RuntimeException("Emergency_Contact_Pincode_update not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Address_update(){
							String Emergency_Contact_Address_update = properties.getProperty("Emergency_Contact_Address_update");
							if(Emergency_Contact_Address_update!= null) return Emergency_Contact_Address_update;
							else throw new RuntimeException("Emergency_Contact_Address_update not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Address_update2(){
							String Emergency_Contact_Address_update2 = properties.getProperty("Emergency_Contact_Address_update2");
							if(Emergency_Contact_Address_update2!= null) return Emergency_Contact_Address_update2;
							else throw new RuntimeException("Emergency_Contact_Address_update2 not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Village_update(){
							String Emergency_Contact_Village_update = properties.getProperty("Emergency_Contact_Village_update");
							if(Emergency_Contact_Village_update!= null) return Emergency_Contact_Village_update;
							else throw new RuntimeException("Emergency_Contact_Village_update not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Village_update2(){
							String Emergency_Contact_Village_update2 = properties.getProperty("Emergency_Contact_Village_update2");
							if(Emergency_Contact_Village_update2!= null) return Emergency_Contact_Village_update2;
							else throw new RuntimeException("Emergency_Contact_Village_update2 not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Village_update_A(){
							String Emergency_Contact_Village_update_A = properties.getProperty("Emergency_Contact_Village_update_A");
							if(Emergency_Contact_Village_update_A!= null) return Emergency_Contact_Village_update_A;
							else throw new RuntimeException("Emergency_Contact_Village_update_A not specified in the Configuration.properties file.");		
						}
						public static String getEmergency_Contact_Village_update_B(){
							String Emergency_Contact_Village_update_B = properties.getProperty("Emergency_Contact_Village_update_B");
							if(Emergency_Contact_Village_update_B!= null) return Emergency_Contact_Village_update_B;
							else throw new RuntimeException("Emergency_Contact_Village_update_B not specified in the Configuration.properties file.");		
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
						public static String getSkill_Description(){
							String Skill_Description = properties.getProperty("Skill_Description");
							if(Skill_Description!= null) return Skill_Description;
							else throw new RuntimeException("Skill_Description not specified in the Configuration.properties file.");		
						}
						public static String getSkill_Type(){
							String Skill_Type = properties.getProperty("Skill_Type");
							if(Skill_Type!= null) return Skill_Type;
							else throw new RuntimeException("Skill_Type not specified in the Configuration.properties file.");		
						}
						
//***********************************************************************************************************************//
//Induction_basicdetails_Skill_TestData
						
						public static String getSkill_Category_Update(){
							String Skill_Category_Update = properties.getProperty("Skill_Category_Update");
							if(Skill_Category_Update!= null) return Skill_Category_Update;
							else throw new RuntimeException("Skill_Category_Update not specified in the Configuration.properties file.");		
						}
						public static String getSkill_Group_Update(){
							String Skill_Group_Update = properties.getProperty("Skill_Group_Update");
							if(Skill_Group_Update!= null) return Skill_Group_Update;
							else throw new RuntimeException("Skill_Group_Update not specified in the Configuration.properties file.");		
						}
						public static String getSkill_Description_Update(){
							String Skill_Description_Update = properties.getProperty("Skill_Description_Update");
							if(Skill_Description_Update!= null) return Skill_Description_Update;
							else throw new RuntimeException("Skill_Description_Update not specified in the Configuration.properties file.");		
						}
																		
//***********************************************************************************************************************
//Induction_basicdetails_Deployment_TestData
						public static String getDeployment_Tree(){
							String Deployment_Tree = properties.getProperty("Deployment_Tree");
							if(Deployment_Tree!= null) return Deployment_Tree;
							else throw new RuntimeException("Deployment_Tree not specified in the Configuration.properties file.");		
						}
						public static String getDeployment_SubTree(){
							String Deployment_SubTree = properties.getProperty("Deployment_SubTree");
							if(Deployment_SubTree!= null) return Deployment_SubTree;
							else throw new RuntimeException("Deployment_SubTree not specified in the Configuration.properties file.");		
						}
//***********************************************************************************************************************
//Induction_basicdetails_Personal_TestData

						public static String getEducation_Quallification(){
							String Education_Quallification = properties.getProperty("Education_Quallification");
							if(Education_Quallification!= null) return Education_Quallification;
							else throw new RuntimeException("Education_Quallification not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Branch(){
							String Education_Branch = properties.getProperty("Education_Branch");
							if(Education_Branch!= null) return Education_Branch;
							else throw new RuntimeException("Education_Branch not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Discipiline(){
							String Education_Discipiline = properties.getProperty("Education_Discipiline");
							if(Education_Discipiline!= null) return Education_Discipiline;
							else throw new RuntimeException("Education_Discipiline not specified in the Configuration.properties file.");		
						}
						public static String getEducation_SchoolORCollege(){
							String Education_SchoolORCollege = properties.getProperty("Education_SchoolORCollege");
							if(Education_SchoolORCollege!= null) return Education_SchoolORCollege;
							else throw new RuntimeException("Education_SchoolORCollege not specified in the Configuration.properties file.");		
						}
						public static String getEducation_BoardORUniversity(){
							String Education_BoardORUniversity = properties.getProperty("Education_BoardORUniversity");
							if(Education_BoardORUniversity!= null) return Education_BoardORUniversity;
							else throw new RuntimeException("Education_BoardORUniversity not specified in the Configuration.properties file.");		
						}
						public static String getEducation_YearofPassing_Date_Month(){
							String Education_YearofPassing_Date_Month = properties.getProperty("Education_YearofPassing_Date_Month");
							if(Education_YearofPassing_Date_Month!= null) return Education_YearofPassing_Date_Month;
							else throw new RuntimeException("Education_YearofPassing_Date_Month not specified in the Configuration.properties file.");		
						}
						public static String getEducation_YearofPassing_Year(){
							String Education_YearofPassing_Year = properties.getProperty("Education_YearofPassing_Year");
							if(Education_YearofPassing_Year!= null) return Education_YearofPassing_Year;
							else throw new RuntimeException("Education_YearofPassing_Year not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Quallification2(){
							String Education_Quallification2 = properties.getProperty("Education_Quallification2");
							if(Education_Quallification2!= null) return Education_Quallification2;
							else throw new RuntimeException("Education_Quallification2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Branch2(){
							String Education_Branch2 = properties.getProperty("Education_Branch2");
							if(Education_Branch2!= null) return Education_Branch2;
							else throw new RuntimeException("Education_Branch2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Discipiline2(){
							String Education_Discipiline2 = properties.getProperty("Education_Discipiline2");
							if(Education_Discipiline2!= null) return Education_Discipiline2;
							else throw new RuntimeException("Education_Discipiline2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_SchoolORCollege2(){
							String Education_SchoolORCollege2 = properties.getProperty("Education_SchoolORCollege2");
							if(Education_SchoolORCollege2!= null) return Education_SchoolORCollege2;
							else throw new RuntimeException("Education_SchoolORCollege2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_BoardORUniversity2(){
							String Education_BoardORUniversity2 = properties.getProperty("Education_BoardORUniversity2");
							if(Education_BoardORUniversity2!= null) return Education_BoardORUniversity2;
							else throw new RuntimeException("Education_BoardORUniversity2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Quallification3(){
							String Education_Quallification3 = properties.getProperty("Education_Quallification3");
							if(Education_Quallification3!= null) return Education_Quallification3;
							else throw new RuntimeException("Education_Quallification2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Branch3(){
							String Education_Branch3 = properties.getProperty("Education_Branch3");
							if(Education_Branch3!= null) return Education_Branch3;
							else throw new RuntimeException("Education_Branch3 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_SchoolORCollege3(){
							String Education_SchoolORCollege3 = properties.getProperty("Education_SchoolORCollege3");
							if(Education_SchoolORCollege3!= null) return Education_SchoolORCollege3;
							else throw new RuntimeException("Education_SchoolORCollege3 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_Discipiline3(){
							String Education_Discipiline3 = properties.getProperty("Education_Discipiline3");
							if(Education_Discipiline3!= null) return Education_Discipiline3;
							else throw new RuntimeException("Education_Discipiline3 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_BoardORUniversity3(){
							String Education_BoardORUniversity3 = properties.getProperty("Education_BoardORUniversity3");
							if(Education_BoardORUniversity3!= null) return Education_BoardORUniversity3;
							else throw new RuntimeException("Education_BoardORUniversity3 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_YearofPassing_Date_Month2(){
							String Education_YearofPassing_Date_Month2 = properties.getProperty("Education_YearofPassing_Date_Month2");
							if(Education_YearofPassing_Date_Month2!= null) return Education_YearofPassing_Date_Month2;
							else throw new RuntimeException("Education_YearofPassing_Date_Month2 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_YearofPassing_Year2(){
							String Education_YearofPassing_Year2 = properties.getProperty("Education_YearofPassing_Year2");
							if(Education_YearofPassing_Year2!= null) return Education_YearofPassing_Year2;
							else throw new RuntimeException("Education_YearofPassing_Year2 not specified in the Configuration.properties file.");		
						}
						
						public static String getEducation_YearofPassing_Date_Month3(){
							String Education_YearofPassing_Date_Month3 = properties.getProperty("Education_YearofPassing_Date_Month3");
							if(Education_YearofPassing_Date_Month3!= null) return Education_YearofPassing_Date_Month3;
							else throw new RuntimeException("Education_YearofPassing_Date_Month3 not specified in the Configuration.properties file.");		
						}
						public static String getEducation_YearofPassing_Year3(){
							String Education_YearofPassing_Year3 = properties.getProperty("Education_YearofPassing_Year3");
							if(Education_YearofPassing_Year3!= null) return Education_YearofPassing_Year3;
							else throw new RuntimeException("Education_YearofPassing_Year3 not specified in the Configuration.properties file.");		
						}
//***********************************************************************************************************************//
//Induction_basicdetails_Experience_TestData
						
						public static String getExperience1_From_month(){
							String Experience1_From_month = properties.getProperty("Experience1_From_month");
							if(Experience1_From_month!= null) return Experience1_From_month;
							else throw new RuntimeException("Experience1_From_month not specified in the Configuration.properties file.");		
						}
						public static String getExperience1_From_Year(){
							String Experience1_From_Year = properties.getProperty("Experience1_From_Year");
							if(Experience1_From_Year!= null) return Experience1_From_Year;
							else throw new RuntimeException("Experience1_From_Year not specified in the Configuration.properties file.");		
						}
						public static String getExperience1_To_month(){
							String Experience1_To_month = properties.getProperty("Experience1_To_month");
							if(Experience1_To_month!= null) return Experience1_To_month;
							else throw new RuntimeException("Experience1_To_month not specified in the Configuration.properties file.");		
						}
						public static String getExperience1_To_Year(){
							String Experience1_To_Year = properties.getProperty("Experience1_To_Year");
							if(Experience1_To_Year!= null) return Experience1_To_Year;
							else throw new RuntimeException("Experience1_To_Year not specified in the Configuration.properties file.");		
						}
						public static String getExperience_OrgName(){
							String Experience_OrgName = properties.getProperty("Experience_OrgName");
							if(Experience_OrgName!= null) return Experience_OrgName;
							else throw new RuntimeException("Experience_OrgName not specified in the Configuration.properties file.");		
						}
						public static String getExperience_ProjectLocation(){
							String Experience_ProjectLocation = properties.getProperty("Experience_ProjectLocation");
							if(Experience_ProjectLocation!= null) return Experience_ProjectLocation;
							else throw new RuntimeException("Experience_ProjectLocation not specified in the Configuration.properties file.");		
						}
						public static String getExperience_ProjectCode_Name(){
							String Experience_ProjectCode_Name = properties.getProperty("Experience_ProjectCode_Name");
							if(Experience_ProjectCode_Name!= null) return Experience_ProjectCode_Name;
							else throw new RuntimeException("Experience_ProjectCode_Name not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Category(){
							String Experience_Skill_Category = properties.getProperty("Experience_Skill_Category");
							if(Experience_Skill_Category!= null) return Experience_Skill_Category;
							else throw new RuntimeException("Experience_Skill_Category not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Group(){
							String Experience_Skill_Group = properties.getProperty("Experience_Skill_Group");
							if(Experience_Skill_Group!= null) return Experience_Skill_Group;
							else throw new RuntimeException("Experience_Skill_Group not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Description(){
							String Experience_Skill_Description = properties.getProperty("Experience_Skill_Description");
							if(Experience_Skill_Description!= null) return Experience_Skill_Description;
							else throw new RuntimeException("Experience_Skill_Description not specified in the Configuration.properties file.");		
						}
						
						
						public static String getExperience2_From_month(){
							String Experience2_From_month = properties.getProperty("Experience2_From_month");
							if(Experience2_From_month!= null) return Experience2_From_month;
							else throw new RuntimeException("Experience2_From_month not specified in the Configuration.properties file.");		
						}
						public static String getExperience2_From_Year(){
							String Experience2_From_Year = properties.getProperty("Experience2_From_Year");
							if(Experience2_From_Year!= null) return Experience2_From_Year;
							else throw new RuntimeException("Experience2_From_Year not specified in the Configuration.properties file.");		
						}
						public static String getExperience2_To_month(){
							String Experience2_To_month = properties.getProperty("Experience2_To_month");
							if(Experience2_To_month!= null) return Experience2_To_month;
							else throw new RuntimeException("Experience2_To_month not specified in the Configuration.properties file.");		
						}
						public static String getExperience2_To_Year(){
							String Experience2_To_Year = properties.getProperty("Experience2_To_Year");
							if(Experience2_To_Year!= null) return Experience2_To_Year;
							else throw new RuntimeException("Experience2_To_Year not specified in the Configuration.properties file.");		
						}
						public static String getExperience_OrgName2(){
							String Experience_OrgName2 = properties.getProperty("Experience_OrgName2");
							if(Experience_OrgName2!= null) return Experience_OrgName2;
							else throw new RuntimeException("Experience_OrgName2 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_ProjectLocation2(){
							String Experience_ProjectLocation2 = properties.getProperty("Experience_ProjectLocation2");
							if(Experience_ProjectLocation2!= null) return Experience_ProjectLocation2;
							else throw new RuntimeException("Experience_ProjectLocation2 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_ProjectCode_Name2(){
							String Experience_ProjectCode_Name2 = properties.getProperty("Experience_ProjectCode_Name2");
							if(Experience_ProjectCode_Name2!= null) return Experience_ProjectCode_Name2;
							else throw new RuntimeException("Experience_ProjectCode_Name2 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Category2(){
							String Experience_Skill_Category2 = properties.getProperty("Experience_Skill_Category2");
							if(Experience_Skill_Category2!= null) return Experience_Skill_Category2;
							else throw new RuntimeException("Experience_Skill_Category2 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Group2(){
							String Experience_Skill_Group2 = properties.getProperty("Experience_Skill_Group2");
							if(Experience_Skill_Group2!= null) return Experience_Skill_Group2;
							else throw new RuntimeException("Experience_Skill_Group not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Description2(){
							String Experience_Skill_Description2 = properties.getProperty("Experience_Skill_Description2");
							if(Experience_Skill_Description2!= null) return Experience_Skill_Description2;
							else throw new RuntimeException("Experience_Skill_Description2 not specified in the Configuration.properties file.");		
						}
						
						
						
						
						public static String getExperience3_From_month(){
							String Experience3_From_month = properties.getProperty("Experience3_From_month");
							if(Experience3_From_month!= null) return Experience3_From_month;
							else throw new RuntimeException("Experience3_From_month not specified in the Configuration.properties file.");		
						}
						public static String getExperience3_From_Year(){
							String Experience3_From_Year = properties.getProperty("Experience3_From_Year");
							if(Experience3_From_Year!= null) return Experience3_From_Year;
							else throw new RuntimeException("Experience3_From_Year not specified in the Configuration.properties file.");		
						}
						public static String getExperience3_To_month(){
							String Experience3_To_month = properties.getProperty("Experience3_To_month");
							if(Experience3_To_month!= null) return Experience3_To_month;
							else throw new RuntimeException("Experience3_To_month not specified in the Configuration.properties file.");		
						}
						public static String getExperience3_To_Year(){
							String Experience3_To_Year = properties.getProperty("Experience3_To_Year");
							if(Experience3_To_Year!= null) return Experience3_To_Year;
							else throw new RuntimeException("Experience3_To_Year not specified in the Configuration.properties file.");		
						}
						public static String getExperience_OrgName3(){
							String Experience_OrgName3 = properties.getProperty("Experience_OrgName3");
							if(Experience_OrgName3!= null) return Experience_OrgName3;
							else throw new RuntimeException("Experience_OrgName3 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_ProjectLocation3(){
							String Experience_ProjectLocation3 = properties.getProperty("Experience_ProjectLocation3");
							if(Experience_ProjectLocation3!= null) return Experience_ProjectLocation3;
							else throw new RuntimeException("Experience_ProjectLocation3 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_ProjectCode_Name3(){
							String Experience_ProjectCode_Name3 = properties.getProperty("Experience_ProjectCode_Name3");
							if(Experience_ProjectCode_Name3!= null) return Experience_ProjectCode_Name3;
							else throw new RuntimeException("Experience_ProjectCode_Name3 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Category3(){
							String Experience_Skill_Category3 = properties.getProperty("Experience_Skill_Category3");
							if(Experience_Skill_Category3!= null) return Experience_Skill_Category3;
							else throw new RuntimeException("Experience_Skill_Category3 not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Group3(){
							String Experience_Skill_Group3 = properties.getProperty("Experience_Skill_Group3");
							if(Experience_Skill_Group3!= null) return Experience_Skill_Group3;
							else throw new RuntimeException("Experience_Skill_Group not specified in the Configuration.properties file.");		
						}
						public static String getExperience_Skill_Description3(){
							String Experience_Skill_Description3 = properties.getProperty("Experience_Skill_Description3");
							if(Experience_Skill_Description3!= null) return Experience_Skill_Description3;
							else throw new RuntimeException("Experience_Skill_Description3 not specified in the Configuration.properties file.");		
						}
//***********************************************************************************************************************//
//Induction_basicdetails_Experience-Update_TestData	
						
						public static String getExperience_From_month_Update1(){
							String Experience_From_month_Update1 = properties.getProperty("Experience_From_month_Update1");
							if(Experience_From_month_Update1!= null) return Experience_From_month_Update1;
							else throw new RuntimeException("Experience_From_month_Update1 not specified in the Configuration.properties file.");		
						}						
						
						public static String getExperience_From_Year_Update1(){
							String Experience_From_Year_Update1 = properties.getProperty("Experience_From_Year_Update1");
							if(Experience_From_Year_Update1!= null) return Experience_From_Year_Update1;
							else throw new RuntimeException("Experience_From_Year_Update1 not specified in the Configuration.properties file.");		
						}		
						
						public static String getExperience_To_month_Update1(){
							String Experience_To_month_Update1 = properties.getProperty("Experience_To_month_Update1");
							if(Experience_To_month_Update1!= null) return Experience_To_month_Update1;
							else throw new RuntimeException("Experience_To_month_Update1 not specified in the Configuration.properties file.");		
						}		
						
						public static String getExperience_To_Year_Update1(){
							String Experience_To_Year_Update1 = properties.getProperty("Experience_To_Year_Update1");
							if(Experience_To_Year_Update1!= null) return Experience_To_Year_Update1;
							else throw new RuntimeException("Experience_To_Year_Update1 not specified in the Configuration.properties file.");		
						}	
						
						public static String getExperience_From_month_Update2(){
							String Experience_From_month_Update2 = properties.getProperty("Experience_From_month_Update2");
							if(Experience_From_month_Update2!= null) return Experience_From_month_Update2;
							else throw new RuntimeException("Experience_From_month_Update2 not specified in the Configuration.properties file.");		
						}						
						
						public static String getExperience_From_Year_Update2(){
							String Experience_From_Year_Update2 = properties.getProperty("Experience_From_Year_Update2");
							if(Experience_From_Year_Update2!= null) return Experience_From_Year_Update2;
							else throw new RuntimeException("Experience_From_Year_Update2 not specified in the Configuration.properties file.");		
						}		
						
						public static String getExperience_To_month_Update2(){
							String Experience_To_month_Update2 = properties.getProperty("Experience_To_month_Update2");
							if(Experience_To_month_Update2!= null) return Experience_To_month_Update2;
							else throw new RuntimeException("Experience_To_month_Update2 not specified in the Configuration.properties file.");		
						}		
						
						public static String getExperience_To_Year_Update2(){
							String Experience_To_Year_Update2 = properties.getProperty("Experience_To_Year_Update2");
							if(Experience_To_Year_Update2!= null) return Experience_To_Year_Update2;
							else throw new RuntimeException("Experience_To_Year_Update2 not specified in the Configuration.properties file.");		
						}	
//***********************************************************************************************************************//
//Induction_basicdetails_Statutory_TestData	
						
						public static String getStatutory_Aadhaar(){
							String Statutory_Aadhaar = properties.getProperty("Statutory_Aadhaar");
							if(Statutory_Aadhaar!= null) return Statutory_Aadhaar;
							else throw new RuntimeException("Statutory_Aadhaar not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_DL(){
							String Statutory_DL = properties.getProperty("Statutory_DL");
							if(Statutory_DL!= null) return Statutory_DL;
							else throw new RuntimeException("Statutory_DL not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_PAN(){
							String Statutory_PAN = properties.getProperty("Statutory_PAN");
							if(Statutory_PAN!= null) return Statutory_PAN;
							else throw new RuntimeException("Statutory_PAN not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_PF(){
							String Statutory_PF = properties.getProperty("Statutory_PF");
							if(Statutory_PF!= null) return Statutory_PF;
							else throw new RuntimeException("Statutory_PF not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_UAN(){
							String Statutory_UAN = properties.getProperty("Statutory_UAN");
							if(Statutory_UAN!= null) return Statutory_UAN;
							else throw new RuntimeException("Statutory_UAN not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_ESI(){
							String Statutory_ESI = properties.getProperty("Statutory_ESI");
							if(Statutory_ESI!= null) return Statutory_ESI;
							else throw new RuntimeException("Statutory_ESI not specified in the Configuration.properties file.");		
						}
						public static String getPF_Nominee_Name1(){
							String PF_Nominee_Name1 = properties.getProperty("PF_Nominee_Name1");
							if(PF_Nominee_Name1!= null) return PF_Nominee_Name1;
							else throw new RuntimeException("PF_Nominee_Name1 not specified in the Configuration.properties file.");		
						}
						public static String getPF_Nominee_Name2(){
							String PF_Nominee_Name2 = properties.getProperty("PF_Nominee_Name1");
							if(PF_Nominee_Name2!= null) return PF_Nominee_Name2;
							else throw new RuntimeException("PF_Nominee_Name2 not specified in the Configuration.properties file.");		
						}
						public static String getPF_Nominee_Name3(){
							String PF_Nominee_Name3 = properties.getProperty("PF_Nominee_Name3");
							if(PF_Nominee_Name3!= null) return PF_Nominee_Name3;
							else throw new RuntimeException("PF_Nominee_Name3 not specified in the Configuration.properties file.");		
						}							
						public static String getPF_Nominee_Relation1(){
							String PF_Nominee_Relation1 = properties.getProperty("PF_Nominee_Relation1");
							if(PF_Nominee_Relation1!= null) return PF_Nominee_Relation1;
							else throw new RuntimeException("PF_Nominee_Relation1 not specified in the Configuration.properties file.");		
						}	
						public static String getPF_Nominee_Relation2(){
							String PF_Nominee_Relation2 = properties.getProperty("PF_Nominee_Relation2");
							if(PF_Nominee_Relation2!= null) return PF_Nominee_Relation2;
							else throw new RuntimeException("PF_Nominee_Relation2 not specified in the Configuration.properties file.");		
						}	
						public static String getPF_Nominee_Relation3(){
							String PF_Nominee_Relation3 = properties.getProperty("PF_Nominee_Relation3");
							if(PF_Nominee_Relation3!= null) return PF_Nominee_Relation3;
							else throw new RuntimeException("PF_Nominee_Relation3 not specified in the Configuration.properties file.");		
						}							
						public static String getPF_Nominee_Percentage1(){
							String PF_Nominee_Percentage1 = properties.getProperty("PF_Nominee_Percentage1");
							if(PF_Nominee_Percentage1!= null) return PF_Nominee_Percentage1;
							else throw new RuntimeException("PF_Nominee_Percentage1 not specified in the Configuration.properties file.");		
						}		
						public static String getPF_Nominee_Percentage2(){
							String PF_Nominee_Percentage2 = properties.getProperty("PF_Nominee_Percentage2");
							if(PF_Nominee_Percentage2!= null) return PF_Nominee_Percentage2;
							else throw new RuntimeException("PF_Nominee_Percentage2 not specified in the Configuration.properties file.");		
						}	
						public static String getPF_Nominee_Percentage3(){
							String PF_Nominee_Percentage3 = properties.getProperty("PF_Nominee_Percentage3");
							if(PF_Nominee_Percentage3!= null) return PF_Nominee_Percentage3;
							else throw new RuntimeException("PF_Nominee_Percentage3 not specified in the Configuration.properties file.");		
						}							
						
						
//*******************************************************************************************************************************************
//Induction_basicdetails_Statutory_Update_TestData	
						
						public static String Statutory_Aadhaar_Update(){
							String Statutory_Aadhaar_Update = properties.getProperty("Statutory_Aadhaar_Update");
							if(Statutory_Aadhaar_Update!= null) return Statutory_Aadhaar_Update;
							else throw new RuntimeException("Statutory_Aadhaar_Update not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_DL_Update(){
							String Statutory_DL_Update = properties.getProperty("Statutory_DL_Update");
							if(Statutory_DL_Update!= null) return Statutory_DL_Update;
							else throw new RuntimeException("Statutory_DL_Update not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_PAN_Update(){
							String Statutory_PAN_Update = properties.getProperty("Statutory_PAN_Update");
							if(Statutory_PAN_Update!= null) return Statutory_PAN_Update;
							else throw new RuntimeException("Statutory_PAN_Update not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_PF_Update(){
							String Statutory_PF_Update = properties.getProperty("Statutory_PF_Update");
							if(Statutory_PF_Update!= null) return Statutory_PF_Update;
							else throw new RuntimeException("Statutory_PF_Update not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_UAN_Update(){
							String Statutory_UAN_Update = properties.getProperty("Statutory_UAN_Update");
							if(Statutory_UAN_Update!= null) return Statutory_UAN_Update;
							else throw new RuntimeException("Statutory_UAN_Update not specified in the Configuration.properties file.");		
						}
						public static String getStatutory_ESI_Update(){
							String Statutory_ESI_Update = properties.getProperty("Statutory_ESI_Update");
							if(Statutory_ESI_Update!= null) return Statutory_ESI_Update;
							else throw new RuntimeException("Statutory_ESI_Update not specified in the Configuration.properties file.");		
						}
						public static String getPF_Nominee_Name1_Update(){
							String PF_Nominee_Name1_Update = properties.getProperty("PF_Nominee_Name1_Update");
							if(PF_Nominee_Name1_Update!= null) return PF_Nominee_Name1_Update;
							else throw new RuntimeException("PF_Nominee_Name1_Update not specified in the Configuration.properties file.");		
						}
						public static String getPF_Nominee_Name2_Update(){
							String PF_Nominee_Name2_Update = properties.getProperty("PF_Nominee_Name1_Update");
							if(PF_Nominee_Name2_Update!= null) return PF_Nominee_Name2_Update;
							else throw new RuntimeException("PF_Nominee_Name2_Update not specified in the Configuration.properties file.");		
						}
						public static String getPF_Nominee_Name3_Update(){
							String PF_Nominee_Name3_Update = properties.getProperty("PF_Nominee_Name3_Update");
							if(PF_Nominee_Name3_Update!= null) return PF_Nominee_Name3_Update;
							else throw new RuntimeException("PF_Nominee_Name3_Update not specified in the Configuration.properties file.");		
						}							
						public static String getPF_Nominee_Relation1_Update(){
							String PF_Nominee_Relation1_Update = properties.getProperty("PF_Nominee_Relation1_Update");
							if(PF_Nominee_Relation1_Update!= null) return PF_Nominee_Relation1_Update;
							else throw new RuntimeException("PF_Nominee_Relation1_Update not specified in the Configuration.properties file.");		
						}	
						public static String getPF_Nominee_Relation2_Update(){
							String PF_Nominee_Relation2_Update = properties.getProperty("PF_Nominee_Relation2_Update");
							if(PF_Nominee_Relation2_Update!= null) return PF_Nominee_Relation2_Update;
							else throw new RuntimeException("PF_Nominee_Relation2_Update not specified in the Configuration.properties file.");		
						}	
						public static String getPF_Nominee_Relation3_Update(){
							String PF_Nominee_Relation3_Update = properties.getProperty("PF_Nominee_Relation3_Update");
							if(PF_Nominee_Relation3_Update!= null) return PF_Nominee_Relation3_Update;
							else throw new RuntimeException("PF_Nominee_Relation3_Update not specified in the Configuration.properties file.");		
						}							
						public static String getPF_Nominee_Percentage1_Update(){
							String PF_Nominee_Percentage1_Update = properties.getProperty("PF_Nominee_Percentage1_Update");
							if(PF_Nominee_Percentage1_Update!= null) return PF_Nominee_Percentage1_Update;
							else throw new RuntimeException("PF_Nominee_Percentage1_Update not specified in the Configuration.properties file.");		
						}		
						public static String getPF_Nominee_Percentage2_Update(){
							String PF_Nominee_Percentage2_Update = properties.getProperty("PF_Nominee_Percentage2_Update");
							if(PF_Nominee_Percentage2_Update!= null) return PF_Nominee_Percentage2_Update;
							else throw new RuntimeException("PF_Nominee_Percentage2_Update not specified in the Configuration.properties file.");		
						}	
						public static String getPF_Nominee_Percentage3_Update(){
							String PF_Nominee_Percentage3_Update = properties.getProperty("PF_Nominee_Percentage3_Update");
							if(PF_Nominee_Percentage3_Update!= null) return PF_Nominee_Percentage3_Update;
							else throw new RuntimeException("PF_Nominee_Percentage3_Update not specified in the Configuration.properties file.");		
						}							
						
//***********************************************************************************************************************//
//Induction_basicdetails_Bank_TestData	
						
						
						public static String getBank_AccountName(){
							String Bank_AccountName = properties.getProperty("Bank_AccountName");
							if(Bank_AccountName!= null) return Bank_AccountName;
							else throw new RuntimeException("Bank_AccountName not specified in the Configuration.properties file.");		
						}
						public static String getBank_AccountNumber(){
							String Bank_AccountNumber = properties.getProperty("Bank_AccountNumber");
							if(Bank_AccountNumber!= null) return Bank_AccountNumber;
							else throw new RuntimeException("Bank_AccountNumber not specified in the Configuration.properties file.");		
						}
						public static String getBank_Account_Type(){
							String Bank_Account_Type = properties.getProperty("Bank_Account_Type");
							if(Bank_Account_Type!= null) return Bank_Account_Type;
							else throw new RuntimeException("Bank_Account_Type not specified in the Configuration.properties file.");		
						}
						public static String getBank_IFSC_Code_Half(){
							String Bank_IFSC_Code_Half = properties.getProperty("Bank_IFSC_Code_Half");
							if(Bank_IFSC_Code_Half!= null) return Bank_IFSC_Code_Half;
							else throw new RuntimeException("Bank_IFSC_Code_Half not specified in the Configuration.properties file.");		
						}
						public static String getBank_IFSC_Code_full(){
							String Bank_IFSC_Code_full = properties.getProperty("Bank_IFSC_Code_full");
							if(Bank_IFSC_Code_full!= null) return Bank_IFSC_Code_full;
							else throw new RuntimeException("Bank_IFSC_Code_full not specified in the Configuration.properties file.");		
						}
						public static String getBank_InterNationalType(){
							String Bank_InterNationalType = properties.getProperty("Bank_InterNationalType");
							if(Bank_InterNationalType!= null) return Bank_InterNationalType;
							else throw new RuntimeException("Bank_InterNationalType not specified in the Configuration.properties file.");		
						}
						public static String getBank_International_IBANCode_Half(){
							String getBank_International_IBANCode_Half = properties.getProperty("getBank_International_IBANCode_Half");
							if(getBank_International_IBANCode_Half!= null) return getBank_International_IBANCode_Half;
							else throw new RuntimeException("getBank_International_IBANCode_Half not specified in the Configuration.properties file.");		
						}
						public static String getBank_International_IBANCode_full(){
							String Bank_International_IBANCode_full = properties.getProperty("Bank_International_IBANCode_full");
							if(Bank_International_IBANCode_full!= null) return Bank_International_IBANCode_full;
							else throw new RuntimeException("Bank_International_IBANCode_full not specified in the Configuration.properties file.");		
						}
						public static String getBank_International_SWIFTCode_Half(){
							String Bank_International_SWIFTCode_Half = properties.getProperty("Bank_International_SWIFTCode_Half");
							if(Bank_International_SWIFTCode_Half!= null) return Bank_International_SWIFTCode_Half;
							else throw new RuntimeException("Bank_International_SWIFTCode_Half not specified in the Configuration.properties file.");		
						}
						public static String getBank_International_SWIFTCode_full(){
							String Bank_International_SWIFTCode_full = properties.getProperty("Bank_International_SWIFTCode_full");
							if(Bank_International_SWIFTCode_full!= null) return Bank_International_SWIFTCode_full;
							else throw new RuntimeException("Bank_International_SWIFTCode_full not specified in the Configuration.properties file.");		
						}
						public static String getBank_International_BankName(){
							String Bank_International_BankName = properties.getProperty("Bank_International_BankName");
							if(Bank_International_BankName!= null) return Bank_International_BankName;
							else throw new RuntimeException("Bank_International_BankName not specified in the Configuration.properties file.");		
						}
//***********************************************************************************************************************//

//Skill-Analysis-Data
						public static String getSkillWorkman_Name() {
							String getSkillWorkman_Name = properties.getProperty("getSkillWorkman_Name");
							if (getSkillWorkman_Name != null)
								return getSkillWorkman_Name;
							else
								throw new RuntimeException("getSkillWorkman_Name not specified in the Configuration.properties file.");
						}
						
						public static String getSkillWorkman_ID(){
							String getSkillWorkman_ID = properties.getProperty("getSkillWorkman_ID");
							if(getSkillWorkman_ID!= null) return getSkillWorkman_ID;
							else throw new RuntimeException("getSkillWorkman_ID not specified in the Configuration.properties file.");		
						}
						
						public static String getSkillWorkman_skill(){
							String getSkillWorkman_skill = properties.getProperty("getSkillWorkman_skill");
							if(getSkillWorkman_skill!= null) return getSkillWorkman_skill;
							else throw new RuntimeException("getSkillWorkman_skill not specified in the Configuration.properties file.");		
						}
						public static String getSkillWorkman_Partner(){
							String getSkillWorkman_Partner = properties.getProperty("getSkillWorkman_Partner");
							if(getSkillWorkman_Partner!= null) return getSkillWorkman_Partner;
							else throw new RuntimeException("getSkillWorkman_Partner not specified in the Configuration.properties file.");		
						}
						
						
						
}

