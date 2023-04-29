package dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

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
		String INR_JobCode = properties.getProperty("INR_JobCode");
		if (INR_JobCode != null)
			return INR_JobCode;
		else
			throw new RuntimeException("INR_JobCode not specified in the Configuration.properties file.");

	}

	public static String QARJobCode() {
		String QAR_JobCode = properties.getProperty("QAR_JobCode");
		if (QAR_JobCode != null)
			return QAR_JobCode;
		else
			throw new RuntimeException("QAR_JobCode not specified in the Configuration.properties file.");

	}
	
	//calling the SCM job from congiguration //////////////////
	public static String poJobCode() {
		String poJobCodematerial = properties.getProperty("poJobCode");
		if (poJobCodematerial != null)
			return poJobCodematerial;
		else
			throw new RuntimeException("poJobCodematerial not specified in the Configuration.properties file.");

	}
	
	public static String MaterialCode() {
		String Materil_code = properties.getProperty("Materil_code");
		if (Materil_code != null)
			return Materil_code;
		else
			throw new RuntimeException("Materil_code not specified in the Configuration.properties file.");

	}
	
	public static String pomaterialCode() {
		String pomaterialCode = properties.getProperty("pomaterialCode");
		if (pomaterialCode != null)
			return pomaterialCode;
		else
			throw new RuntimeException("pomaterialCode not specified in the Configuration.properties file.");

	}
	
}




