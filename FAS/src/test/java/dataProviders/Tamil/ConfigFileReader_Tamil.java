package dataProviders.Tamil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader_Tamil {

	private static Properties properties;
	private final String propertyFilePath = "src//main//java//configuration//Configuration.properties";

	public ConfigFileReader_Tamil() {
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


	

}
