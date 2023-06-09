package test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import object_repository.ObjectsReporsitory;

public class DataBaseConnection {

	static Statement stmt;
	static String DB_Url, DB_User, DB_Pwd;
	static Connection con;
	static String finalResult;
	public static String Workmannumber;
	public static String WorkmannID_Camp;
	public static String Workmaname;
	public static String WorkmaFathername;
	public static String WorkmaPassportNumber;
	public static String WorkmanFatherName_verification;
	public static String WorkmanID;
	public static String Workmannname_verification;
	public static String WorkmanPassport_Switch;
	public static String WorkmanAadhar;
	public static String WMP_Jobcode;
	public static String WorkmanAadhar_Switch;
	public static String Workmannname_verification_set;
	public static String WorkmanName;
	public static String FatherName;
	public static String WMP_DOB;
	public static String Language;
	public static String Gender;
	public static String BloodGroup;
	public static String MaritalStatus;
	public static String spousename;
	public static String NoOfChildren;
	public static String WMP_Certificate_Number;
	public static String WMC_Mobile_No;
	public static String PermanentAddressPincode;
	public static String GMP_Pincode;
	public static String PermanentAddress;
	public static String PermanentAddresscity;
	public static String TemporaryAddressPincode;
	public static String TemporaryAddress;
	public static String TemporaryAddressCity;
	public static String EmergencyContactName;
	public static String EmergencyContactMobileNumber;
	public static String EmergencyContactRelation;
	public static String EmergencyContactPincode;
	public static String EmergencyContactAddress;
	public static String EmergencyContactAddressVillage;
	public static String SkillType;
	public static String SkillCategory;
	public static String SkillGroup;
	public static String SkillDesc;
	public static String Partner_Code;
	public static String Qualification;
	public static String Branch;
	public static String Discipiline;
	public static String School;
	public static String Board;
	public static String YearOfPassing;
	public static String DurationFrom;
	public static String DurationTo;
	public static String OrganisationName;
	public static String ProjectLocation;
	public static Long Current_workmenNumber;
	public static int Current_workmenid;
	public static String ProjectName;
	public static String ExperienceSkillCategory;
	public static String ExperienceSkillGroup;
	public static String ExperienceSkillDesc;
	public static String Aadhaar;
	public static String DrivingLicense;
	public static String PAN;
	public static String PF;
	public static String UAN;
	public static String ESI;
	public static String PFNomineeName;
	public static String PFNomineeRelationship;
	public static String PFNomineepercentage;
	public static String MedicalDate;
	public static String WorkmanNumber_gatepass;
	public static String WorkPermitNumber;
	public static String WorkPermitExpiry;
	public static String LabourCard;
	public static String LabourCardExpiry;
	public static String WMD_WBS_Code;
	public static String WMB_Name_As_In_Bank;
	public static String WMB_Acount_Number;
	public static String WMB_Is_Domestic;
	public static String WMB_IFSC_IBAN_SWIFT;
	public static String Workmannumber_Domestic;
	public static int AttendanceDate;
	public static int Attendancemonth;
	public static int AttendanceYear;

	static List<String> MultipleCol = new ArrayList<String>();

	// **************************************************Main
	// Method*************************************************

//	  public static void main(String args[]) throws SQLException {
//		  dataBaseConnectionWMS();
//		ResultSet results = stmt.executeQuery(
//					"SELECT top 1 WMP_Workmen_ID FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_COMMUNICATION ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WPR_M_COMMUNICATION.WMC_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Dscode='41' and WMP_Jobcode='LE140995' and WMP_Vendor_Code='PI1101008792000' order by WMP_Inserted_On desc");
//			while (results.next()) {
//				WorkmanID = results.getString(1);
//				System.out.println(WorkmanID);
//				
//			}
//			databaseConnectionClose();
//		}

	public static void dataBaseConnectionWMS() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40WMS;";
		DB_User = "WMS4LOGIN";
		DB_Pwd = "WMS!LogiN#qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Data Base Connection success");
	}

	public static void dataBasEWMS() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40WMS;";
		DB_User = "WMS4LOGIN";
		DB_Pwd = "WMS!LogiN#qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
	}

	public static void dataBaseConnectionAWM() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40AWM;";
		DB_User = "AWM4LOGIN";
		DB_Pwd = "AWM!LogiN#qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Data Base Connection success");
	}

	public static void dataBaseConnectionFAS() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40FIN;";
		DB_User = "FIN4LOGIN";
		DB_Pwd = "FIN4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Data Base Connection success");
		System.out.println("******************************");
	}

	public static void dataBaseConnectionSCM() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
		DB_User = "SCM4login";
		DB_Pwd = "SCM4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Data Base Connection success");
		System.out.println("******************************");
	}

	public static void dataBaseConnectionGLM() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40GLM;";
		DB_User = "GLM4LOGIN";
		DB_Pwd = "GLM4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Data Base Connection success");
		System.out.println("******************************");
	}

	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}

	public static void test() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select WMP_Workmen_ID from IND.WPR_M_PERSONAL where WMP_Workmen_ID='20315401' order by WMP_Inserted_On desc");
		ResultSetMetaData rsMetaData = results.getMetaData();
		int count = rsMetaData.getColumnCount();
		while (results.next()) {
			for (int i = 1; i < count; i++) {
				String Column = rsMetaData.getColumnName(i);

				System.out.print(Column);

				System.out.println(":" + results.getString(i));

			}
			System.out.println("======================================================================");
		}

	}

	public static void GetworkmanIDquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_COMMUNICATION ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WPR_M_COMMUNICATION.WMC_Workmen_ID  order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanID = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmanID() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		databaseConnectionClose();

	}

	public static void GetworkmanID_gatePassquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select top 1 WMP_Workmen_Number  from   IND.WPR_M_PERSONAL where WMP_Gate_Pass_Type is NULL order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanNumber_gatepass = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmanID_gatePass() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanID_gatePassquery();
		SendDBValue.SendWorkmanNumber_gatepass(WorkmanNumber_gatepass);
		databaseConnectionClose();

	}

	public static void Getworkmannumberquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID order by WMST_Inserted_On desc");
		while (results.next()) {
			Workmannumber = results.getString(1);
			System.out.println("Workman Number : " + Workmannumber);
		}
		GetWorkmanID();

	}

	public static void GetWorkmannumber() throws SQLException {
		dataBaseConnectionWMS();
		Getworkmannumberquery();
		SendDBValue.SendWorkmanNumber(Workmannumber);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	public static void Getworkmannumberquery_international() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID  where IND.WPR_M_PERSONAL.WMP_Jobcode='LE20D146' order by WMP_Inserted_On desc");
		while (results.next()) {
			Workmannumber = results.getString(1);
			System.out.println("Workman Number : " + Workmannumber);
		}
		GetWorkmanID();

	}

	public static void GetWorkmannumber_international() throws SQLException {
		dataBaseConnectionWMS();
		Getworkmannumberquery_international();
		SendDBValue.SendWorkmanNumber(Workmannumber);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	public static void GetworkmanAadharquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMST_Statutory_Number FROM IND.WPR_M_Statutory INNER JOIN IND.WPR_M_PERSONAL ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_Statutory.WMST_Statutory_Code=1 order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanAadhar = results.getString("WMST_Statutory_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmanAadhar() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		GetworkmanAadharquery();
		SendDBValue.SendWorkamnAadhaar(WorkmanAadhar);
		databaseConnectionClose();

	}

	// ***********************************************************************************

	public static void GetworkmanAadharquery_domestic() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMST_Statutory_Number FROM IND.WPR_M_Statutory INNER JOIN IND.WPR_M_PERSONAL ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_Statutory.WMST_Statutory_Code=1 and IND.WPR_M_PERSONAL.WMP_Jobcode='LE180046' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanAadhar = results.getString("WMST_Statutory_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetworkmanIDquery_domestic() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_COMMUNICATION ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WPR_M_COMMUNICATION.WMC_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Jobcode='LE180046' order by WMP_Inserted_On desc");
		while (results.next()) {
			Workmannumber_Domestic = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmannumber_Domestic() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery_domestic();
		SendDBValue.SendWorkmanNumber(Workmannumber_Domestic);
		databaseConnectionClose();

	}

	public static void GetWorkmanAadhar_domestic() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery_domestic();
		GetworkmanAadharquery_domestic();
		SendDBValue.SendWorkamnAadhaar(WorkmanAadhar);
		databaseConnectionClose();

	}

	// *******************************************************************************

	public static void verifyupdateworkmanname() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt
				.executeQuery("select top 1 WMP_Workmen_Name  from IND.WPR_M_PERSONAL where WMP_Workmen_Number="
						+ Current_workmenNumber);
		while (results.next()) {
			WorkmanName = results.getString("WMP_Workmen_Name");
			// System.out.println(WorkmanID);

		}

	}

	public static void getverifyupdateworkmanname() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanname();
		SendDBValue.verifyupdateworkmanname_DB(WorkmanName);
		databaseConnectionClose();

	}

	public static void verifyupdateworkmanfathername() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt
				.executeQuery("select top 1 WMP_Father_Name  from IND.WPR_M_PERSONAL where WMP_Workmen_Number="
						+ Current_workmenNumber);
		while (results.next()) {
			FatherName = results.getString(1);

		}

	}

	public static void getverifyupdateworkmanfathername() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanfathername();
		SendDBValue.verifyupdateworkmanfathername_DB(FatherName);
		databaseConnectionClose();

	}

	public static void verifyupdateworkmanDOB() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt.executeQuery(
				"select top 1 WMP_DOB from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results.next()) {
			WMP_DOB = results.getString("WMP_DOB");
			// System.out.println(WorkmanID);

		}

	}

	public static void getverifyupdateworkmanDOB() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanDOB();
		SendDBValue.verifyupdateworkmanDOB_DB(WMP_DOB);
		databaseConnectionClose();

	}

	public static void verifyupdateworkmanGender() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt.executeQuery(
				"SELECT COM.CWM_M_Transaction_Details.CMTD_Detail_Desc As Gender FROM COM.CWM_M_Transaction_Details INNER JOIN IND.WPR_M_PERSONAL ON COM.CWM_M_Transaction_Details.CMTD_Detail_Code= IND.WPR_M_PERSONAL.WMP_Gender where IND.WPR_M_PERSONAL.WMP_Workmen_Number="
						+ Current_workmenNumber);
		while (results.next()) {
			Gender = results.getString("Gender");

		}

	}

	public static void getverifyupdateworkmanGender() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanGender();
		SendDBValue.verifyupdateworkmanGender_DB(Gender);
		databaseConnectionClose();

	}

	public static void getverifyupdateworkmanLanguage() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		List<String> Db_List = DataBaseConnection.dbConnection_MutltipleColumns("WMS",
				"SELECT COM.GEM_M_LANGUAGE.GML_Desc,IND.WPR_M_LANGUAGE.WML_Language_Read,IND.WPR_M_LANGUAGE.WML_Language_Speak,IND.WPR_M_LANGUAGE.WML_Language_Write FROM COM.GEM_M_LANGUAGE INNER JOIN IND.WPR_M_LANGUAGE ON COM.GEM_M_LANGUAGE.GML_Code= IND.WPR_M_LANGUAGE.WML_Language_Code where IND.WPR_M_LANGUAGE.WML_Workmen_ID="
						+ Current_workmenNumber);
		int value = 0;
		System.out.println("UI list count :" + MultipleCol.size());
		System.out.println("DB list count :" + Db_List.size());
		System.out.println("Languages saved in DB ");
		System.out.println("----------------------------------------");
		// if (MultipleCol.size() == Db_List.size()) {
		while (Db_List.size() > value) {
			System.out.println(Db_List.get(value));
			assertEquals(Db_List.get(value), MultipleCol.get(value));
			value++;

		}
	}

	public static List<String> dbConnection_MutltipleColumns(String domain, String querystatement) throws SQLException {
		if (domain == "WMS") {
			dataBasEWMS();
		}
		stmt = con.createStatement();
		System.out.println("Connection success");
		try {

			ResultSet results3 = stmt.executeQuery(querystatement);
			java.sql.ResultSetMetaData rsMetaData = results3.getMetaData();
			int count = rsMetaData.getColumnCount();

			while (results3.next()) {
				for (int i = 1; i <= count; i++) {
					MultipleCol.add(results3.getString(i));
				}
			}
		} catch (Exception e) {

			System.out.printf("DB Execption", e);
		} finally {
			con.close();
		}
		return MultipleCol;
	}

	public static void verifyupdateworkmanBloodGroup() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);

		}

		ResultSet results = stmt.executeQuery(
				"SELECT COM.GEM_M_Blood_Group.GMBD_Desc As BloodGroup FROM COM.GEM_M_Blood_Group INNER JOIN IND.WPR_M_PERSONAL ON COM.GEM_M_Blood_Group.GMBD_Code= IND.WPR_M_PERSONAL.WMP_Blood_Group_Id where IND.WPR_M_PERSONAL.WMP_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			BloodGroup = results.getString("BloodGroup");

		}

	}

	public static void getverifyupdateworkmanBloodGroup() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanBloodGroup();
		SendDBValue.verifyupdateworkmanBloodGroup_DB(BloodGroup);
		databaseConnectionClose();

	}

	public static void verifyupdateworkmanMaritalStatus() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"SELECT COM.CWM_M_Transaction_Details.CMTD_Detail_Desc As MaritalStatus FROM COM.CWM_M_Transaction_Details INNER JOIN IND.WPR_M_PERSONAL ON COM.CWM_M_Transaction_Details.CMTD_Detail_Code= IND.WPR_M_PERSONAL.WMP_Marital_Status where IND.WPR_M_PERSONAL.WMP_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			MaritalStatus = results.getString("MaritalStatus");
			// System.out.println(Workmannumber);

		}

	}

	public static void getverifyupdateworkmanMaritalStatus() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanMaritalStatus();
		SendDBValue.verifyupdateworkmanMaritalStatus_DB(MaritalStatus);
		databaseConnectionClose();

	}

	// Spouse name
	public static void verifyupdateworkmanspousename() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt.executeQuery(
				"select WMP_Spouse_Name from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results.next()) {
			spousename = results.getString("WMP_Spouse_Name");

		}

	}

	public static void getverifyupdateworkmanspousename() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanspousename();
		SendDBValue.verifyupdateworkmanspousename(spousename);
		databaseConnectionClose();

	}

	// No Of Children
	// Spouse name
	public static void verifyupdateworkmanNoofChilderen() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt.executeQuery(
				"select WMP_No_Of_Children from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results.next()) {
			NoOfChildren = results.getString("WMP_No_Of_Children");

		}

	}

	public static void getverifyupdateworkmanNoofChilderen() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateworkmanNoofChilderen();
		SendDBValue.verifyupdateworkmanNoofChilderen(NoOfChildren);
		databaseConnectionClose();

	}

//Update CSTI or NAPS

	public static void verifyupdateCSTIOrNAPS() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results = stmt
				.executeQuery("select WMP_Certificate_Number from IND.WPR_M_PERSONAL where WMP_Workmen_Number="
						+ Current_workmenNumber);
		while (results.next()) {
			WMP_Certificate_Number = results.getString("WMP_Certificate_Number");

		}

	}

	public static void getverifyupdateCSTIOrNAPS() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateCSTIOrNAPS();
		SendDBValue.verifyupdateCSTIOrNAPS(WMP_Certificate_Number);
		databaseConnectionClose();

	}
//Update Mobile Number

	public static void verifyupdatemobilenumber() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select WMC_Mobile_No from IND.WPR_M_COMMUNICATION where WMC_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			WMC_Mobile_No = results.getString("WMC_Mobile_No");

		}

	}

	public static void getverifyupdatemobilenumber() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdatemobilenumber();
		SendDBValue.verifyupdatemobilenumber(WMC_Mobile_No);
		databaseConnectionClose();

	}

//Update Permanent Address Pincode

	public static void verifyupdatePermanentAddressPincode() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"SELECT GMP_Pincode FROM COM.GEM_M_POSTOFFICE INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_POSTOFFICE.GMP_Post_Id = IND.WPR_M_COMMUNICATION.WMC_Permanent_Pincode_Code where IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			PermanentAddressPincode = results.getString("GMP_Pincode");

		}

	}

	public static void getverifyupdatePermanentAddressPincode() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdatePermanentAddressPincode();
		SendDBValue.verifyupdatePermanentAddressPincode(PermanentAddressPincode);
		databaseConnectionClose();

	}
//Update From Here *****************************************************************************************************
//Update Permanent Address

	public static void verifyupdatePermanentAddress() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select WMC_Permanent_Address from IND.WPR_M_COMMUNICATION where WMC_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			PermanentAddress = results.getString("WMC_Permanent_Address");

		}

	}

	public static void getverifyupdatePermanentAddress() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdatePermanentAddress();
		SendDBValue.verifyupdatePermanentAddress(PermanentAddress);
		databaseConnectionClose();

	}

//Update Permanent Address village

	public static void verifyupdatePermanentAddresscity() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"SELECT GMP_City_Town FROM COM.GEM_M_POSTOFFICE INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_POSTOFFICE.GMP_Post_Id = IND.WPR_M_COMMUNICATION.WMC_Permanent_Pincode_Code where IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			PermanentAddresscity = results.getString("GMP_City_Town");

		}

	}

	public static void getverifyupdatePermanentAddresscity() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdatePermanentAddresscity();
		SendDBValue.verifyupdatePermanentAddresscity(PermanentAddresscity);
		databaseConnectionClose();

	}
//Update Temporary Address pincode

	public static void verifyupdateTemporaryAddressPincode() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"SELECT GMP_Pincode FROM COM.GEM_M_POSTOFFICE INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_POSTOFFICE.GMP_Post_Id = IND.WPR_M_COMMUNICATION.WMC_Temporary_Pincode_Code where IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			TemporaryAddressPincode = results.getString("GMP_Pincode");

		}

	}

	public static void getverifyupdateTemporaryAddressPincode() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateTemporaryAddressPincode();
		SendDBValue.verifyupdateTemporaryAddresspincode(TemporaryAddressPincode);
		databaseConnectionClose();

	}
//Update Temporary Address 

	public static void verifyTemporaryupdateAddress() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMC_Temporary_Address from IND.WPR_M_COMMUNICATION where WMC_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			TemporaryAddress = results.getString("WMC_Temporary_Address");

		}

	}

	public static void getverifyTemporaryupdateAddress() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyTemporaryupdateAddress();
		SendDBValue.verifyTemporaryupdateAddress(TemporaryAddress);
		databaseConnectionClose();

	}

//Update Temporary Address City

	public static void verifyupdateTemporaryAddresscity() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"SELECT GMP_City_Town FROM COM.GEM_M_POSTOFFICE INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_POSTOFFICE.GMP_Post_Id = IND.WPR_M_COMMUNICATION.WMC_Temporary_Pincode_Code where IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			TemporaryAddressCity = results.getString("GMP_City_Town");

		}

	}

	public static void getverifyupdateTemporaryAddresscity() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateTemporaryAddresscity();
		SendDBValue.verifyupdateTemporaryAddresscity(TemporaryAddressCity);
		databaseConnectionClose();

	}
//Update Emergency Contact Name

	public static void verifyupdateEmergencyContactName() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMC_EmgCnt_Name from IND.WPR_M_COMMUNICATION where WMC_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			EmergencyContactName = results.getString("WMC_EmgCnt_Name");

		}

	}

	public static void getverifyupdateEmergencyContactName() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateEmergencyContactName();
		SendDBValue.verifyupdateEmergencyContactName(EmergencyContactName);
		databaseConnectionClose();

	}
//Update Emergency Contact MobileNumber

	public static void verifyupdateEmergencyContactMobileNumber() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMC_EmgCnt_MobileNo from IND.WPR_M_COMMUNICATION where WMC_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			EmergencyContactMobileNumber = results.getString("WMC_EmgCnt_MobileNo");

		}

	}

	public static void getverifyupdateEmergencyContactMobileNumber() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateEmergencyContactMobileNumber();
		SendDBValue.verifyupdateEmergencyContactMobileNumber(EmergencyContactMobileNumber);
		databaseConnectionClose();

	}

//Update Emergency Contact Relation

	public static void verifyupdateEmergencyContactRelation() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select GMR_Desc from COM.GEM_M_Relationship INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_Relationship.GMR_Code = IND.WPR_M_COMMUNICATION.WMC_EmgCnt_Rel where  IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			EmergencyContactRelation = results.getString("GMR_Desc");

		}

	}

	public static void getverifyupdateEmergencyContactRelation() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateEmergencyContactRelation();
		SendDBValue.verifyupdateEmergencyContactRelation(EmergencyContactRelation);
		databaseConnectionClose();

	}

//Update Emergency Contact Pincode

	public static void verifyupdateEmergencyContactPincode() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"SELECT GMP_Pincode FROM COM.GEM_M_POSTOFFICE INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_POSTOFFICE.GMP_Post_Id = IND.WPR_M_COMMUNICATION.WMC_EmgCnt_Pincode_Code where IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			EmergencyContactPincode = results.getString("GMP_Pincode");

		}

	}

	public static void getverifyupdateEmergencyContactPincode() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateEmergencyContactPincode();
		SendDBValue.verifyupdateEmergencyContactPincode(EmergencyContactPincode);
		databaseConnectionClose();

	}

//Update Emergency Contact Address

	public static void verifyupdateEmergencyAddressUpdate() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMC_EmgCnt_Address from IND.WPR_M_COMMUNICATION where WMC_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			EmergencyContactAddress = results.getString("WMC_EmgCnt_Address");

		}

	}

	public static void getverifyupdateEmergencyAddressUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateEmergencyAddressUpdate();
		SendDBValue.verifyupdateEmergencyAddressUpdate(EmergencyContactAddress);
		databaseConnectionClose();

	}

//Update Emergency Contact village

	public static void verifyupdateEmergencyAddressVillageUpdate() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"SELECT GMP_City_Town FROM COM.GEM_M_POSTOFFICE INNER JOIN IND.WPR_M_COMMUNICATION ON COM.GEM_M_POSTOFFICE.GMP_Post_Id = IND.WPR_M_COMMUNICATION.WMC_EmgCnt_Pincode_Code where IND.WPR_M_COMMUNICATION.WMC_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			EmergencyContactAddressVillage = results.getString("GMP_City_Town");

		}

	}

	public static void getverifyupdateEmergencyAddressVillageUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdateEmergencyAddressVillageUpdate();
		SendDBValue.verifyupdateEmergencyAddressVillageUpdate(EmergencyContactAddressVillage);
		databaseConnectionClose();

	}

//Update Skill Type 

	public static void SkillTypeUpdate() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select CMTD_Detail_Desc from COM.CWM_M_Transaction_Details INNER JOIN IND.WPR_M_SKILL on COM.CWM_M_Transaction_Details.CMTD_Detail_Code = IND.WPR_M_SKILL.WMSK_Skill_TYPE_Code where IND.WPR_M_SKILL.WMSK_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			SkillType = results.getString("CMTD_Detail_Desc");

		}

	}

	public static void getSkillTypeUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		SkillTypeUpdate();
		SendDBValue.SkillTypeUpdate(SkillType);
		databaseConnectionClose();

	}

//Update Skill Category 

	public static void SkillCategoryUpdate() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select MSC_Category_Desc from COM.GEM_M_Skill_Category INNER JOIN IND.WPR_M_SKILL on COM.GEM_M_Skill_Category.MSC_Category_Code =  IND.WPR_M_SKILL.WMSK_Skill_Category_Code where WMSK_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			SkillCategory = results.getString("MSC_Category_Desc");

		}

	}

	public static void getSkillCategoryUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		SkillCategoryUpdate();
		SendDBValue.SkillCategoryUpdate(SkillCategory);
		databaseConnectionClose();

	}

//Update Skill Group 
	public static void SkillGroupUpdate() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select MSG_Group_Desc from COM.GEM_M_Skill_Group INNER JOIN IND.WPR_M_SKILL on COM.GEM_M_Skill_Group.MSG_Group_Code =  IND.WPR_M_SKILL.WMSK_Skill_Group_Code where WMSK_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			SkillGroup = results.getString("MSG_Group_Desc");

		}

	}

	public static void getSkillGroupUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		SkillGroupUpdate();
		SendDBValue.SkillGroupUpdate(SkillGroup);
		databaseConnectionClose();

	}

//Update Skill Desc 
	public static void SkillDescUpdate() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select MSK_Skill_Desc from COM.GEM_M_Skills INNER JOIN IND.WPR_M_SKILL on COM.GEM_M_Skills.MSK_Skill_Code =  IND.WPR_M_SKILL.WMSK_Skill_Code where IND.WPR_M_SKILL.WMSK_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			SkillDesc = results.getString("MSK_Skill_Desc");

		}

	}

	public static void getSkillDescUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		SkillDescUpdate();
		SendDBValue.SkillDescUpdate(SkillDesc);
		databaseConnectionClose();

	}

//Update Partner Details 
	public static void verifyupdatePartnerDetails() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select WMP_Vendor_Code from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenid);
		while (results.next()) {
			Partner_Code = results.getString(1);

		}

	}

	public static void getverifyupdatePartnerDetails() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		verifyupdatePartnerDetails();
		SendDBValue.verifyupdatePartnerDetails(Partner_Code);
		databaseConnectionClose();

	}

//Update Qualification
	public static void UpdateQualification() throws SQLException {

		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);

		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}

		ResultSet results = stmt.executeQuery(
				"select GMQ_TYPE from COM.GEM_M_Qualification INNER JOIN IND.WPR_M_EDUCATION on COM.GEM_M_Qualification.GMQ_ID=IND.WPR_M_EDUCATION.WMED_Qualification_Id where IND.WPR_M_EDUCATION.WMED_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			Qualification = results.getString("GMQ_TYPE");

		}

	}

	public static void getUpdateQualification() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateQualification();
		SendDBValue.UpdateQualification(Qualification);
		databaseConnectionClose();

	}

//Update Branch
	public static void UpdateBranch() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select GMQB_Branch_DESC from COM.GEM_M_Qual_Branch  INNER JOIN IND.WPR_M_EDUCATION on COM.GEM_M_Qual_Branch.GMQB_ID = IND.WPR_M_EDUCATION.WMED_Qualification_Id and WMED_Branch_id = GMQB_Branch_ID where IND.WPR_M_EDUCATION.WMED_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			Branch = results.getString("GMQB_Branch_DESC");

		}

	}

	public static void getUpdateBranch() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateBranch();
		SendDBValue.UpdateBranch(Branch);
		databaseConnectionClose();

	}

//Update Discipiline
	public static void UpdateDiscipiline() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMED_Discipline from IND.WPR_M_EDUCATION where WMED_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			Discipiline = results.getString("WMED_Discipline");

		}

	}

	public static void getUpdateDiscipiline() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateDiscipiline();
		SendDBValue.UpdateDiscipiline(Discipiline);
		databaseConnectionClose();

	}

//Update School
	public static void UpdateSchool() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMED_Institution from IND.WPR_M_EDUCATION where WMED_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			School = results.getString("WMED_Institution");

		}

	}

	public static void getUpdateSchool() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateSchool();
		SendDBValue.UpdateSchool(School);
		databaseConnectionClose();

	}

//Update Board
	public static void UpdateBoard() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMED_University from IND.WPR_M_EDUCATION where WMED_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			Board = results.getString("WMED_University");

		}

	}

	public static void getUpdateBoard() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateBoard();
		SendDBValue.UpdateBoard(Board);
		databaseConnectionClose();

	}

//Update Year Of Passing 
	public static void UpdateYearOfPassing() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMED_Passed_out_Year from IND.WPR_M_EDUCATION where WMED_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			YearOfPassing = results.getString("WMED_Passed_out_Year");

		}

	}

	public static void getUpdateYearOfPassing() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateYearOfPassing();
		SendDBValue.YearOfPassing(YearOfPassing);
		databaseConnectionClose();

	}

//Update Org Name
	public static void UpdateOrganisationName() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WME_Organization_Name from IND.WPR_M_EXPERIENCE where WME_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			OrganisationName = results.getString("WME_Organization_Name");

		}

	}

	public static void getUpdateOrganisationName() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateOrganisationName();
		SendDBValue.UpdateOrganisationName(OrganisationName);
		databaseConnectionClose();

	}

//Update ProjectLocation
	public static void UpdateProjectLocation() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WME_Project_Location from IND.WPR_M_EXPERIENCE where WME_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			ProjectLocation = results.getString("WME_Project_Location");

		}

	}

	public static void getUpdateProjectLocation() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateProjectLocation();
		SendDBValue.UpdateProjectLocation(ProjectLocation);
		databaseConnectionClose();

	}

//Update ProjectName
	public static void UpdateProjectName() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WME_Project_Name from IND.WPR_M_EXPERIENCE where WME_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			ProjectName = results.getString("WME_Project_Name");

		}

	}

	public static void getUpdateProjectName() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateProjectName();
		SendDBValue.UpdateProjectName(ProjectName);
		databaseConnectionClose();

	}

//Update Experience Skill Category
	public static void UpdateExperienceSkillCategory() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select MSC_Category_Desc from COM.GEM_M_Skill_Category INNER JOIN IND.WPR_M_EXPERIENCE on COM.GEM_M_Skill_Category.MSC_Category_Code =  IND.WPR_M_EXPERIENCE.WME_Skill_Category_Code where IND.WPR_M_EXPERIENCE.WME_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			ExperienceSkillCategory = results.getString("MSC_Category_Desc");

		}

	}

	public static void getUpdateExperienceSkillCategory() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateExperienceSkillCategory();
		SendDBValue.UpdateExperienceSkillCategory(ExperienceSkillCategory);
		databaseConnectionClose();

	}

//Update Experience Skill Group
	public static void UpdateExperienceSkillGroup() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select MSG_Group_Desc from COM.GEM_M_Skill_Group INNER JOIN IND.WPR_M_EXPERIENCE on COM.GEM_M_Skill_Group.MSG_Group_Code =  IND.WPR_M_EXPERIENCE.WME_Skill_Group_Code where IND.WPR_M_EXPERIENCE.WME_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			ExperienceSkillGroup = results.getString(1);

		}

	}

	public static void getUpdateExperienceSkillGroup() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateExperienceSkillGroup();
		SendDBValue.UpdateExperienceSkillGroup(ExperienceSkillGroup);
		databaseConnectionClose();

	}

//Update Experience Skill Desc
	public static void UpdateExperienceSkillDesc() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select MSK_Skill_Desc from COM.GEM_M_Skills INNER JOIN IND.WPR_M_EXPERIENCE on COM.GEM_M_Skills.MSK_Skill_Code =  IND.WPR_M_EXPERIENCE.WME_Skill_Code where IND.WPR_M_EXPERIENCE.WME_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			ExperienceSkillDesc = results.getString(1);

		}

	}

	public static void getUpdateExperienceSkillDesc() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UpdateExperienceSkillDesc();
		SendDBValue.UpdateExperienceSkillDesc(ExperienceSkillDesc);
		databaseConnectionClose();

	}

	// Update Aadhaar Update
	public static void AadhaarUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='1' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			Aadhaar = results.getString(1);

		}

	}

	public static void getAadhaarUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		AadhaarUpdate();
		SendDBValue.AadhaarUpdate(Aadhaar);
		databaseConnectionClose();

	}

//Update DL Update
	public static void DrivingLicenseUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='2' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			DrivingLicense = results.getString(1);

		}

	}

	public static void getDrivingLicenseUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		DrivingLicenseUpdate();
		SendDBValue.DrivingLicenseUpdate(DrivingLicense);
		databaseConnectionClose();

	}

//Update PAN Update
	public static void PANUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='3' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			PAN = results.getString(1);

		}

	}

	public static void getPANUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		PANUpdate();
		SendDBValue.PANUpdate(PAN);
		databaseConnectionClose();

	}

//Update PF
	public static void PFUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='4' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			PF = results.getString(1);

		}

	}

	public static void getPFUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		PFUpdate();
		SendDBValue.PFUpdate(PF);
		databaseConnectionClose();

	}

//Update UAN
	public static void UANUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='5' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			UAN = results.getString(1);

		}

	}

	public static void getUANUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		UANUpdate();
		SendDBValue.UANUpdate(UAN);
		databaseConnectionClose();

	}

//Update ESI
	public static void ESIUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='6' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			ESI = results.getString(1);

		}

	}

	public static void getESIUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		ESIUpdate();
		SendDBValue.ESIUpdate(ESI);
		databaseConnectionClose();

	}

//Update Workpermit	
	public static void GetWorkpermitUpdatequery() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='7' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			WorkPermitNumber = results.getString(1);

		}

	}

	public static void getWorkpermitUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkpermitUpdatequery();
		SendDBValue.WorkPermitNumberUpdate(WorkPermitNumber);
		databaseConnectionClose();

	}

//Update Workpermit	Expiry
	public static void GetWorkpermitExpiryUpdatequery() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='10' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			WorkPermitExpiry = results.getString(1);

		}

	}

	public static void getWorkpermitExpiryUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkpermitExpiryUpdatequery();
		SendDBValue.WorkPermitExpiryUpdate(WorkPermitExpiry);
		databaseConnectionClose();

	}

//Update LabourCard	
	public static void GetLabourCardUpdatequery() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='7' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			LabourCard = results.getString(1);

		}

	}

	public static void getLabourCardUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetLabourCardUpdatequery();
		SendDBValue.LabourCardUpdate(LabourCard);
		databaseConnectionClose();

	}

//Update LabourCardExppiry
	public static void GetLabourCardExpiryUpdatequery() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMST_Statutory_Number from IND.WPR_M_Statutory where WMST_Statutory_Code='11' and WMST_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			LabourCardExpiry = results.getString(1);

		}

	}

	public static void getLabourCardExpiryUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetLabourCardExpiryUpdatequery();
		SendDBValue.LabourCardExpiryUpdate(LabourCardExpiry);
		databaseConnectionClose();

	}

//Update getPFNomineeNameUpdate
	public static void PFNomineeNameUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMN_Nominee_Name from IND.WPR_M_Nominee where WMN_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			PFNomineeName = results.getString(1);

		}

	}

	public static void getPFNomineeNameUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		PFNomineeNameUpdate();
		SendDBValue.PFNomineeNameUpdate(PFNomineeName);
		databaseConnectionClose();
	}

//Update getPFNomineeRelationshipUpdate
	public static void PFNomineeRelationshipUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select GMR_Desc from COM.GEM_M_Relationship INNER JOIN IND.WPR_M_Nominee ON COM.GEM_M_Relationship.GMR_Code = IND.WPR_M_Nominee.WMN_Relationship_Code where  IND.WPR_M_Nominee.WMN_Workmen_ID="
						+ Current_workmenid);
		while (results.next()) {
			PFNomineeRelationship = results.getString(1);

		}

	}

	public static void getPFNomineeRelationshipUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		PFNomineeRelationshipUpdate();
		SendDBValue.PFNomineeRelationshipUpdate(PFNomineeRelationship);
		databaseConnectionClose();
	}

//Update getPFNomineepercentageUpdate
	public static void PFNomineepercentageUpdate() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMN_Allocation_Percentage from IND.WPR_M_Nominee where WMN_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			PFNomineepercentage = results.getString(1);

		}

	}

	public static void getPFNomineepercentageUpdate() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		PFNomineepercentageUpdate();
		SendDBValue.PFNomineepercentageUpdate(PFNomineepercentage);
		databaseConnectionClose();
	}

//Workmen Search
	public static void getworkmenID_search() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		SendDBValue.workmenID_search(WorkmanID);
		databaseConnectionClose();
	}

	public static void GetworkmanIDquery_Paramedics() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where IND.WPR_M_PERSONAL.WMP_Dscode='5' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanID = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void getworkmenID_Paramedics_search() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery_Paramedics();
		SendDBValue.workmenID_search(WorkmanID);
		databaseConnectionClose();
	}

	public static void GetworkmanIDquery_MedicalTest() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_COMMUNICATION ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WPR_M_COMMUNICATION.WMC_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Dscode='6' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanID = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void getworkmenID_MedicalTest_search() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery_MedicalTest();
		SendDBValue.workmenID_search(WorkmanID);
		databaseConnectionClose();
	}

	public static void GetworkmanIDquery_EHS() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_COMMUNICATION ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WPR_M_COMMUNICATION.WMC_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Dscode='7' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanID = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void getworkmenID_EHS_search() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery_EHS();
		SendDBValue.workmenID_search(WorkmanID);
		databaseConnectionClose();
	}

	public static void GetworkmanIDquery_Wage() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_COMMUNICATION ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WPR_M_COMMUNICATION.WMC_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Dscode='8' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanID = results.getString("WMP_Workmen_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void getworkmenID_Wage_search() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery_Wage();
		SendDBValue.workmenID_search(WorkmanID);
		databaseConnectionClose();
	}

//Next Medical Exam Date				
	public static void NextMedicalexamdate() throws SQLException {

		ResultSet results = stmt
				.executeQuery("SELECT top 1 WMP_NextMedDueOn FROM IND.WPR_M_PERSONAL where WMP_Workmen_Name ='"
						+ ObjectsReporsitory.MedicalTest_ProfileCard_Workmenname.getText() + "'");
		while (results.next()) {
			MedicalDate = results.getString("WMP_NextMedDueOn");
			// System.out.println(WMP_NextMedDueOn);

		}

	}

	public static void getNextMedicalexamdate() throws SQLException {
		dataBaseConnectionWMS();
		NextMedicalexamdate();
		SendDBValue.NextMedicalexamdate(MedicalDate);
		databaseConnectionClose();
	}

	// Next Medical Exam Date
	public static void removeDLRrcord() throws SQLException {

		stmt.execute("delete from ATT.WMS_T_DLR_Entry");
		stmt.execute("delete from ATT.WMS_T_DLR_Breakup");

	}

	public static void getremoveDLRrcord() throws SQLException {
		dataBaseConnectionWMS();
		removeDLRrcord();
		databaseConnectionClose();
	}

	// GatePass Renewal no Records

	public static void gatepassRenewal_noRecords() throws SQLException {

		stmt.execute("update IND.WPR_M_PERSONAL set WMP_Gate_Pass_Type = NULL");
		stmt.execute("update IND.WPR_M_PERSONAL set WMP_Gate_Pass_Date= NULL");

	}
	// GatePass Renewal With Records

	public static void getgatepassRenewal_noRecord() throws SQLException {
		dataBaseConnectionWMS();
		gatepassRenewal_noRecords();
		databaseConnectionClose();
	}

	public static void gatepassRenewal() throws SQLException {

		stmt.execute(
				"update IND.WPR_M_PERSONAL set WMP_Gate_Pass_Type='1126' where WMP_Workmen_Number in (select top (10) WMP_Workmen_Number from IND.WPR_M_PERSONAL order by WMP_Inserted_On desc )");
		stmt.execute(
				"update IND.WPR_M_PERSONAL set WMP_Gate_Pass_Date='2021-10-25 15:53:57.840' where WMP_Workmen_Number in (select top (10) WMP_Workmen_Number from IND.WPR_M_PERSONAL order by WMP_Inserted_On desc )");

	}

	public static void getgatepassRenewal() throws SQLException {
		dataBaseConnectionWMS();
		gatepassRenewal();
		databaseConnectionClose();
	}

//Added by Tamil 17-11-2022 

	public static void GetWorkmannamequery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Workmen_Name FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID");
		while (results.next()) {
			Workmaname = results.getString(1);
			System.out.println("Workman Name : " + Workmaname);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanname() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmannamequery();
		SendDBValue.SendWorkmanName(Workmaname);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	public static void GetWorkmannamequery_Domestic() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Workmen_Name FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID  where IND.WPR_M_PERSONAL.WMP_Jobcode='LE180046' order by WMP_Inserted_On desc");
		while (results.next()) {
			Workmaname = results.getString(1);
			System.out.println("Workman Name : " + Workmaname);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanname_Domestic() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmannamequery_Domestic();
		SendDBValue.SendWorkmanName(Workmaname);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	// ****************************************************************************************

	public static void GetWorkmannamequery_Multiple_Domestic() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Workmen_Name FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Jobcode='LE180046' order by WMP_Inserted_On desc");
		while (results.next()) {
			Workmaname = results.getString(1);
			System.out.println("Workman Name : " + Workmaname);
		}

	}

	public static void GetWorkmanname_Multiple_Domestic() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmannamequery_Multiple_Domestic();
		SendDBValue.SendWorkmanName(Workmaname);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	public static void GetWorkmanFathernamequery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Father_Name FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID");
		while (results.next()) {
			WorkmaFathername = results.getString(1);
			System.out.println("Workman Fathername : " + WorkmaFathername);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanFathername() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanFathernamequery();
		SendDBValue.SendWorkmanFathername(WorkmaFathername);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	// ****************************************************************************************

	public static void GetWorkmanFathername_Multiple_query() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Father_Name FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Jobcode='LE180046' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmaFathername = results.getString(1).substring(0, 20);
			System.out.println("Workman Fathername : " + WorkmaFathername);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanFathername_Multiple() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanFathername_Multiple_query();
		SendDBValue.SendWorkmanFathername(WorkmaFathername);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	public static void GetWorkmanFathernamequery_Domestic() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Father_Name FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID  where IND.WPR_M_PERSONAL.WMP_Jobcode='LE180046' order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmaFathername = results.getString(1);
			System.out.println("Workman Fathername : " + WorkmaFathername);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanFathername_Domestic() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanFathernamequery_Domestic();
		SendDBValue.SendWorkmanFathername(WorkmaFathername);
		databaseConnectionClose();

	}

	// ****************************************************************************************

	public static void GetWorkmanPassportnumberquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMST_Statutory_Number FROM IND.WPR_M_Statutory INNER JOIN IND.WPR_M_PERSONAL ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_Statutory.WMST_Statutory_Code=12");
		while (results.next()) {
			WorkmaPassportNumber = results.getString(1);
			System.out.println("Workman Passport Number : " + WorkmaPassportNumber);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanPassportnumber() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanPassportnumberquery();
		SendDBValue.SendWorkmaPassportNumber(WorkmaPassportNumber);
		databaseConnectionClose();

	}

	public static void GetWorkmanAadharSwitchquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMST_Statutory_Number FROM IND.WPR_M_Statutory INNER JOIN IND.WPR_M_PERSONAL ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_Statutory.WMST_Statutory_Code=1 and IND.WPR_M_PERSONAL.WMP_Dscode not in('1','3','9') order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanAadhar_Switch = results.getString("WMST_Statutory_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmanAadharSwitch() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		GetWorkmanAadharSwitchquery();
		SendDBValue.SendWorkamnAadhaarSwitch(WorkmanAadhar_Switch);
		databaseConnectionClose();

	}

	public static void GetWorkmanJobquery() throws SQLException {

		String WorkmanNumber = ObjectsReporsitory.BasicDetails_Side_Workmen_Number.getText().substring(16);
		System.out.println("WorkmenNumber : " + WorkmanNumber);

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMP_Jobcode FROM IND.WPR_M_PERSONAL INNER JOIN IND.WMS_T_JOINRELEASE ON IND.WPR_M_PERSONAL.WMP_Workmen_ID = IND.WMS_T_JOINRELEASE.WMT_Workmen_ID where IND.WPR_M_PERSONAL.WMP_Workmen_Number="
						+ WorkmanNumber);
		while (results.next()) {
			WMP_Jobcode = results.getString("WMP_Jobcode");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmanJob() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		GetWorkmanJobquery();
		SendDBValue.SendWorkamnJob(WMP_Jobcode);
		databaseConnectionClose();

	}

	public static void GetWorkmanPassportSwitchquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"SELECT top 1 WMST_Statutory_Number FROM IND.WPR_M_Statutory INNER JOIN IND.WPR_M_PERSONAL ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_Statutory.WMST_Statutory_Code=12 and IND.WPR_M_PERSONAL.WMP_Dscode not in('1','3','9') order by WMP_Inserted_On desc");
		while (results.next()) {
			WorkmanPassport_Switch = results.getString("WMST_Statutory_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWorkmanPassportSwitch() throws SQLException {
		dataBaseConnectionWMS();
		GetworkmanIDquery();
		GetWorkmanPassportSwitchquery();
		SendDBValue.SendWorkamnpassportSwitch(WorkmanPassport_Switch);
		databaseConnectionClose();

	}

	public static void GetWorkmannumber_Internationalquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL INNER JOIN IND.WPR_M_Statutory ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where WMP_Jobcode='LE120309'");
		while (results.next()) {
			Workmannumber = results.getString(1);
			System.out.println("Workman Number : " + Workmannumber);
		}
		GetWorkmanID();

	}

	public static void GetWorkmannumber_International() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmannumber_Internationalquery();
		SendDBValue.SendWorkmanNumber(Workmannumber);
		databaseConnectionClose();

	}

	public static void GetWorkmanPassportnumberinternationalquery() throws SQLException {

		ResultSet results = stmt.executeQuery(
				// "SELECT top 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Dscode='1'
				// and WMP_Workmen_Name like 'Balaji%' order by WMP_Inserted_On desc");
				"SELECT top 1 WMST_Statutory_Number FROM IND.WPR_M_Statutory INNER JOIN IND.WPR_M_PERSONAL ON IND.WPR_M_Statutory.WMST_Workmen_ID = IND.WPR_M_PERSONAL.WMP_Workmen_ID where IND.WPR_M_Statutory.WMST_Statutory_Code=12 and WMP_Jobcode='LE120309'");
		while (results.next()) {
			WorkmaPassportNumber = results.getString(1);
			System.out.println("Workman Passport Number : " + WorkmaPassportNumber);
		}
		GetWorkmanID();

	}

	public static void GetWorkmanPassportnumberinternational() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanPassportnumberinternationalquery();
		SendDBValue.SendWorkmaPassportNumber(WorkmaPassportNumber);
		databaseConnectionClose();

	}

	// Update getPFNomineepercentageUpdate
	public static void Getworkmandeploymentquery() throws SQLException {
		Current_workmenNumber = Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMD_WBS_Code from IND.WPR_M_DEPLOYMENT where WMD_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			WMD_WBS_Code = results.getString(1);
			System.out.println("WMD_WBS_Code : " + WMD_WBS_Code);

		}

	}

	public static void getdeployment() throws SQLException {
		dataBaseConnectionWMS();
		Getworkmandeploymentquery();
		databaseConnectionClose();
	}

	// Update getPFNomineepercentageUpdate
	public static void Getbankaccountdetailsquery(Long Current_workmenNumber) throws SQLException {

		System.out.println("Current Workmen Number : " + Current_workmenNumber);
		ResultSet results2 = stmt.executeQuery(
				"select WMP_Workmen_ID  from IND.WPR_M_PERSONAL where WMP_Workmen_Number=" + Current_workmenNumber);
		while (results2.next()) {
			Current_workmenid = results2.getInt(1);
		}
		ResultSet results = stmt.executeQuery(
				"select WMB_Name_As_In_Bank from IND.WPR_M_BANK where WMB_Workmen_ID=" + Current_workmenid);
		while (results.next()) {
			WMB_Name_As_In_Bank = results.getString(1);
			System.out.println("WMB_Name_As_In_Bank : " + WMB_Name_As_In_Bank);

		}
		ResultSet results3 = stmt
				.executeQuery("select WMB_Acount_Number from IND.WPR_M_BANK where WMB_Workmen_ID=" + Current_workmenid);
		while (results3.next()) {
			WMB_Acount_Number = results3.getString(1);
			System.out.println("WMB_Acount_Number : " + WMB_Acount_Number);

		}
		ResultSet results4 = stmt
				.executeQuery("select WMB_Is_Domestic from IND.WPR_M_BANK where WMB_Workmen_ID=" + Current_workmenid);
		while (results4.next()) {
			WMB_Is_Domestic = results4.getString(1);
			System.out.println("WMB_Is_Domestic : " + WMB_Is_Domestic);

		}
		ResultSet results5 = stmt.executeQuery(
				"select WMB_IFSC_IBAN_SWIFT from IND.WPR_M_BANK where WMB_Workmen_ID=" + Current_workmenid);
		while (results5.next()) {
			WMB_IFSC_IBAN_SWIFT = results5.getString(1);
			System.out.println("WMB_Is_Domestic : " + WMB_IFSC_IBAN_SWIFT);

		}

	}

	public static void getbankaccountdetails(Long Current_workmenNumber) throws SQLException {
		dataBaseConnectionWMS();
		Getbankaccountdetailsquery(Current_workmenNumber);
		databaseConnectionClose();
	}

	public static void GetWorkmanName_Verificationquery() throws SQLException {

		ResultSet results = stmt
				.executeQuery("select  top 1  WMP_Workmen_Name from IND.WPR_M_PERSONAL order by WMP_Inserted_On desc");
		while (results.next()) {
			Workmannname_verification = results.getString(1);
			// System.out.println(WorkmanID);

		}
	}

	public static void GetWorkmanName_Verification() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanName_Verificationquery();
		SendDBValue.SendWorkmanName_Verification(Workmannname_verification);
		databaseConnectionClose();

	}

	public static void GetWorkmanFatherName_Verificationquery() throws SQLException {

		ResultSet results2 = stmt
				.executeQuery("select  top 1  WMP_Workmen_Name from IND.WPR_M_PERSONAL order by WMP_Inserted_On desc");
		while (results2.next()) {
			Workmannname_verification_set = results2.getString(1);
			// System.out.println(WorkmanID);

		}

		ResultSet results = stmt
				.executeQuery("select  top 1  WMP_Father_Name from IND.WPR_M_PERSONAL where WMP_Workmen_Name='"
						+ Workmannname_verification_set + "'");
		while (results.next()) {
			WorkmanFatherName_verification = results.getString(1);
			// System.out.println(WorkmanID);

		}
	}

	public static void GetWorkmanFatherName_Verification() throws SQLException {
		dataBaseConnectionWMS();
		GetWorkmanFatherName_Verificationquery();
		SendDBValue.WorkmanFatherName_Verification(WorkmanFatherName_verification);
		databaseConnectionClose();

	}

//Get Attendance Date 

	public static void GetattendanceDatequery() throws SQLException {

		ResultSet results = stmt
				.executeQuery("select top 1 WTAB_Access_Date from ATT.WMS_T_ATTN_BASE order by WTAB_Inserted_on desc");
		while (results.next()) {
			AttendanceDate = Integer.parseInt(results.getString(1).substring(9, 10));
			Attendancemonth = Integer.parseInt(results.getString(1).substring(6, 7));
			AttendanceYear = Integer.parseInt(results.getString(1).substring(0, 4));
			// System.out.println(WorkmanID);

		}
	}

	public static void GetattendanceDate() throws SQLException, InterruptedException {
		dataBaseConnectionWMS();
		GetattendanceDatequery();
		SendDBValue.Getattendancecalender(AttendanceDate, Attendancemonth, AttendanceYear);
		databaseConnectionClose();

	}

	// Camp Management

	public static void GetWorkmenIDforCampquery() throws SQLException {

		ResultSet results = stmt
				.executeQuery("SELECT TOP 1 WMP_Workmen_Number FROM IND.WPR_M_PERSONAL where WMP_Jobcode='LE180046' ORDER BY NEWID()");
		while (results.next()) {
			WorkmannID_Camp = results.getString(1);
			// System.out.println(WorkmanID);

		}
	}

	public static void GetWorkmenIDforCamp() throws SQLException, InterruptedException {
		dataBaseConnectionWMS();
		GetWorkmenIDforCampquery();
		SendDBValue.GetWorkmenIDforCamp(WorkmannID_Camp);
		databaseConnectionClose();

	}

}
