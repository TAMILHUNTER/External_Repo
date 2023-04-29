package dataProviders.Praveen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader_Praveen {

	private static Properties properties;
	private final String propertyFilePath = "src//main//java//configuration//Configuration.properties";

	public ConfigFileReader_Praveen() {
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
			
			public static String getHold_Value() {
				String Hold_Value = properties.getProperty("Hold_Value");
				if (Hold_Value != null) // Pk
					return Hold_Value;
				else
					throw new RuntimeException("Hold_Value not specified in the Configuration.properties file.");
			}
			
			public static String getRemarks_Pk() {
				String Remarks_Pk = properties.getProperty("Remarks_Pk");
				if (Remarks_Pk != null) // Pk
					return Remarks_Pk;
				else
					throw new RuntimeException("Remarks_Pk not specified in the Configuration.properties file.");
			}
			
			public static String getHold_Type() {
				String Hold_Type = properties.getProperty("Hold_Type");
				if (Hold_Type != null) // Pk
					return Hold_Type;
				else
					throw new RuntimeException("Hold_Type not specified in the Configuration.properties file.");
			}
			
			
			}
