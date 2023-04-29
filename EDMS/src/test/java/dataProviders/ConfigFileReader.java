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
			throw new RuntimeException("Confi.properties not found at " + propertyFilePath);
		}
	}

	public static String getDriverPath_Chrome() {
		String getDriverPath_Chrome = properties.getProperty("DriverPath_Chrome");
		if (getDriverPath_Chrome != null)
			return getDriverPath_Chrome;
		else
			throw new RuntimeException("driverPath_Chrome not specified in the Config.properties file.");
	}

	public static String getDriverPath_Firefox() {
		String driverPath = properties.getProperty("DriverPath_Firefox");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath_Firefox not specified in the Config.properties file.");
	}

	public static String getDriverPath_Edge() {
		String DriverPath_Edge = properties.getProperty("DriverPath_Edge");
		if (DriverPath_Edge != null)
			return DriverPath_Edge;
		else
			throw new RuntimeException("DriverPath_Edge not specified in the Config.properties file.");
	}

	public static String getBrowser() {
		String Browser = properties.getProperty("Browser");
		if (Browser != null)
			return Browser;
		else
			throw new RuntimeException("Browser not specified in the Config.properties file.");
	}

	public static String getEnvironment() {
		String Environment = properties.getProperty("Environment");
		if (Environment != null)
			return Environment;
		else
			throw new RuntimeException("Browser not specified in the Config.properties file.");
	}

	public static String getUsername() {
		String Username = properties.getProperty("Username");
		if (Username != null)
			return Username;
		else
			throw new RuntimeException("Username not specified in the Config.properties file.");
	}

	public static String getUsernamePk() {
		String UsernamePk = properties.getProperty("UsernamePk");
		if (UsernamePk != null)
			return UsernamePk;
		else
			throw new RuntimeException("Username Praveen not specified in the Config.properties file.");
	}

	public static String getPassword() {
		String Password = properties.getProperty("Password");
		if (Password != null)
			return Password;
		else
			throw new RuntimeException("Username not specified in the Config.properties file.");
	}

	public static String getPasswordPk() {
		String PasswordPK = properties.getProperty("PasswordPK");
		if (PasswordPK != null)
			return PasswordPK;
		else
			throw new RuntimeException("PasswordPK not specified in the Config.properties file.");
	}

	public static long getImplicitWaitTime() {
		String ImplicitWaitTime = properties.getProperty("ImplicitWaitTime");
		if (ImplicitWaitTime != null)
			return Long.parseLong(ImplicitWaitTime);
		else
			throw new RuntimeException("ImplicitWaitTime not specified in the Config.properties file.");
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
			throw new RuntimeException("ScreenshotPath_Pass not specified in the Config.properties file.");
	}

	public static String getScreenshotPath_Fail() {
		String ScreenshotPath_Fail = properties.getProperty("ScreenshotPath_Fail");
		if (ScreenshotPath_Fail != null)
			return ScreenshotPath_Fail;
		else
			throw new RuntimeException("ScreenshotPath_Fail not specified in the Config.properties file.");
	}

	public static String getReportPath() {
		String ReportPath = properties.getProperty("ReportPath");
		if (ReportPath != null)
			return ReportPath;
		else
			throw new RuntimeException("ReportPath not specified in the Config.properties file.");
	}

	public static String getTitle() {
		String Title = properties.getProperty("Title");
		if (Title != null)
			return Title;
		else
			throw new RuntimeException("Title not specified in the Config.properties file.");
	}

	public static String getReference() {
		String Reference = properties.getProperty("Reference");
		if (Reference != null)
			return Reference;
		else
			throw new RuntimeException("Reference not specified in the Config.properties file.");
	}

	public static String getComments() {
		String Comments = properties.getProperty("Comments");
		if (Comments != null)
			return Comments;
		else
			throw new RuntimeException("Comments not specified in the Config.properties file.");
	}

	public static String getFileNo() {
		String FileNo = properties.getProperty("FileNo");
		if (FileNo != null)
			return FileNo;
		else
			throw new RuntimeException("FileNo not specified in the Config.properties file.");
	}

	public static String getDocFileUpload() {
		String DocFileUpload = properties.getProperty("DocFileUpload");
		if (DocFileUpload != null)
			return DocFileUpload;
		else
			throw new RuntimeException("DocFileUpload not specified in the Config.properties file.");
	}

	public static String getEnggManHr() {
		String EnggManHr = properties.getProperty("EnggManHr");
		if (EnggManHr != null)
			return EnggManHr;
		else
			throw new RuntimeException("EnggManHr not specified in the Config.properties file.");
	}

	public static String getDraftManHrs() {
		String DraftManHrs = properties.getProperty("DraftManHrs");
		if (DraftManHrs != null)
			return DraftManHrs;
		else
			throw new RuntimeException("DraftManHrs not specified in the Config.properties file.");
	}

	public static String getWeightage() {
		String Weightage = properties.getProperty("Weightage");
		if (Weightage != null)
			return Weightage;
		else
			throw new RuntimeException("Weightage not specified in the Config.properties file.");
	}

	public static String getSubject() {
		String Subject = properties.getProperty("Subject");
		if (Subject != null)
			return Subject;
		else
			throw new RuntimeException("Subject not specified in the Config.properties file.");
	}

	public static String getCommentMail() {
		String CommentMail = properties.getProperty("CommentMail");
		if (CommentMail != null)
			return CommentMail;
		else
			throw new RuntimeException("CommentMail not specified in the Config.properties file.");
	}
	
	
	//-**********************Screenshot
	
	public static String getScreenshotPath_Scenario() {
		String ScreenshotPath_Scenario = properties.getProperty("ScreenshotPath_Scenario");
		if (ScreenshotPath_Scenario != null)
			return ScreenshotPath_Scenario;
		else
			throw new RuntimeException("ScreenshotPath_Scenario not specified in the Configuration.properties file.");
	}

}