package dataProviders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import object_repository.AMS_locators;
import stepdefinition.Webdriver;

public class DataBaseConnection {

	static Statement stmt;
	static String DB_Url, DB_User, DB_Pwd, DERNumber;
	static Connection con;

	public DataBaseConnection() {
		PageFactory.initElements(Webdriver.driver, AMS_locators.class);
	}

	public static void dataBaseConnectionAlm() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40ALM;";
		DB_User = "ALM4LOGIN";
		DB_Pwd = "QA@Adm#Alm4";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Connection success");
	}

	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}

	public static String DERNumber() throws SQLException {

		dataBaseConnectionAlm();

		ResultSet executeQuery = stmt
				.executeQuery("select * from oam.WRK_D_Logsheet where DLS_Asset_Code='0121085H' and DLS_Work_Type='i' and DLS_Inserted_On >= '2022-06-24 00:00:00' and DLS_Inserted_On <='2022-07-12 00:00:00'");
		List<String> dernumber_list = new ArrayList<String>(); 
		while (executeQuery.next()) {
			DERNumber = executeQuery.getString(8);			
			dernumber_list.add(DERNumber);			
		}
		int derNumber_int = 0, sum = 0;
		
		System.out.println("DER Number: "+dernumber_list);
		for (String string : dernumber_list) {
			float derNumber_float = Float.parseFloat(string);
			derNumber_int = (int)derNumber_float;				
			System.out.println("Database Value: "+derNumber_int);

			List<Integer> Total_der_list = new ArrayList<Integer>();
			Total_der_list.add(derNumber_int);
			 for (int i = 0; i < Total_der_list.size(); i++)
		            sum += Total_der_list.get(i);
			
		}
        System.out.println("sum-> " + sum);
		
		return DERNumber;
	}

//	public static void resultSet() throws Throwable {
//		/*
//		 * ResultSet results = stmt.executeQuery(
//		 * "SELECT top 1 TVCR_Request_Number FROM PTR.PTR_T_Variation_Claim_Request order by TVCR_Inserted_On desc"
//		 * );
//		 */
//
//		ResultSet results = stmt.executeQuery(
//				"SELECT top 1 TVCR_Request_Number FROM PTR.PTR_T_Variation_Claim_Request where TVCR_Status_Id = 4 order by TVCR_Inserted_On desc");
//
//		while (results.next()) {
//			requestNumber = results.getString(1);
//			System.out.println("Recent Request Number = " + requestNumber);
//		}
//		ResultSet results1 = stmt.executeQuery(
//				"SELECT top 1 MEMP_Psno FROM PTR.PTR_T_Document_Workflow INNER JOIN PPinterface.MAS.GEN_M_Users ON (MU_User_Id=TDW_Receiver_User_Id) inner join MAS.GEN_M_Employees on (MEMP_Psno =MU_Login_Name)WHERE TDW_Reference_Id = '"
//						+ requestNumber + "'");
//		while (results1.next()) {
//			psNumber = results1.getString(1);
//			System.out.println("Ps Number from PP database = " + psNumber);
//		}
//	}

//	public static void approverLogin() throws Throwable {
//		dataBaseConnectionPP();
//		resultSet();
//		databaseConnectionClose();
//		dataBaseConnectioneipAwm();
//		getUserName();
//		databaseConnectionClose();
//	}

//	public static String getUserName() throws SQLException {
//		ResultSet userName = stmt
//				.executeQuery("select top 1 MUSER_Login_Name from EIP40AWM. acs.ACS_M_Users where MUSER_Reference_ID='"
//						+ psNumber + "'");
//		while (userName.next()) {
//			username = userName.getString(1);
//			System.out.println("Approver User Name = " + username);
//		}
//		return username;
//	}

	public static void main(String args[]) throws Throwable {
		dataBaseConnectionAlm();
		DERNumber();
		databaseConnectionClose();
	}
}
