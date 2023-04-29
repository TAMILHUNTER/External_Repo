package dataProviders.Sneha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader_Sneha {

	private static Properties properties;
	private final String propertyFilePath = "src//main//java//configuration//Configuration.properties";

	public ConfigFileReader_Sneha() {
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

	public static String getAccountingCenterFIN() {
		String getAccountingCenter_FIN = properties.getProperty("AccountingCenter_FIN");
		if (getAccountingCenter_FIN != null)
			return getAccountingCenter_FIN;
		else
			throw new RuntimeException("getAccountingCenter_FIN not specified in the Configuration.properties file.");
	}

	public static String getVoucherAmountFIN() {
		String VoucherAmount_FIN = properties.getProperty("VoucherAmount_FIN");
		if (VoucherAmount_FIN != null)
			return VoucherAmount_FIN;
		else
			throw new RuntimeException("VoucherAmount_FIN not specified in the Configuration.properties file.");
	}

	public static String getFavouringFIN() {
		String Favouring_FIN = properties.getProperty("Favouring_FIN");
		if (Favouring_FIN != null)
			return Favouring_FIN;
		else
			throw new RuntimeException("Favouring_FIN not specified in the Configuration.properties file.");
	}

	public static String getPurposeFIN() {
		String Purpose_FIN = properties.getProperty("Purpose_FIN");
		if (Purpose_FIN != null)
			return Purpose_FIN;
		else
			throw new RuntimeException("Purpose_FIN not specified in the Configuration.properties file.");
	}

	public static String getModeTypeChequeFIN() {
		String ModeTypeCheque_FIN = properties.getProperty("ModeTypeCheque_FIN");
		if (ModeTypeCheque_FIN != null)
			return ModeTypeCheque_FIN;
		else
			throw new RuntimeException("ClickModeTypeCheque_FIN not specified in the Configuration.properties file.");
	}

	public static String getEnterJobCodeFIN() {
		String EnterJobCode_FIN = properties.getProperty("EnterJobCode_FIN");
		if (EnterJobCode_FIN != null)
			return EnterJobCode_FIN;
		else
			throw new RuntimeException("EnterJobCode_FIN not specified in the Configuration.properties file.");
	}
}
