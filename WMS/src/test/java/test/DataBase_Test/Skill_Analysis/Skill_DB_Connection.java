package test.DataBase_Test.Skill_Analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import stepdefinition.Induction_Dashboard.Profile_Basic;

public class Skill_DB_Connection extends Profile_Basic{

	static Statement stmt;
	static String DB_Url, DB_User, DB_Pwd;
	static Connection con;
	static String finalResult;
	public static String WorkmanNameDB;
	public static String WorkmanFatherNameDB;
	public static String WorkmanGender;
	public static String WorkmanBloodGroup;
	public static String WorkmanMaritalStatus;
	
	
	static List<String> MultipleCol = new ArrayList<String>();

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

	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}

//SkillAnalysisVerifyWorkmanName
		public static void SkillAnalysisVerifyWorkmanName() throws SQLException {

			ResultSet results = stmt.executeQuery(
					"select WMP_Workmen_Name from IND.WPR_M_PERSONAL where WMP_Workmen_ID="
							+ WorkmanID);
			while (results.next()) {
				WorkmanNameDB = results.getString(1);

			}

		}

		public static void getSkillAnalysisVerifyWorkmanName() throws SQLException {
			dataBaseConnectionWMS();
			SkillAnalysisVerifyWorkmanName();
			Skill_Verify_DB_Values.SkillAnalysisVerifyWorkmanName(WorkmanNameDB);
			databaseConnectionClose();
		}

//SkillAnalysisVerifyWorkmanFatherName
				public static void SkillAnalysisVerifyWorkmanFatherName() throws SQLException {

					ResultSet results = stmt.executeQuery(
							"select WMP_Father_Name from IND.WPR_M_PERSONAL where WMP_Workmen_ID="
									+ WorkmanID);
					while (results.next()) {
						WorkmanFatherNameDB = results.getString(1);

					}

				}

				public static void getSkillAnalysisVerifyFatherName() throws SQLException {
					dataBaseConnectionWMS();
					SkillAnalysisVerifyWorkmanFatherName();
					Skill_Verify_DB_Values.SkillAnalysisVerifyWorkmanFatherName(WorkmanFatherNameDB);
					databaseConnectionClose();
				}		
				
//SkillAnalysisVerifyWorkmanFatherName
				public static void SkillAnalysisVerifyWorkmanGender() throws SQLException {

					ResultSet results = stmt.executeQuery(
							"SELECT COM.CWM_M_Transaction_Details.CMTD_Detail_Desc As Gender FROM COM.CWM_M_Transaction_Details INNER JOIN IND.WPR_M_PERSONAL ON COM.CWM_M_Transaction_Details.CMTD_Detail_Code= IND.WPR_M_PERSONAL.WMP_Gender where IND.WPR_M_PERSONAL.WMP_Workmen_ID="
									+ WorkmanID);
					while (results.next()) {
						WorkmanGender = results.getString(1);

					}

				}

				public static void getSkillAnalysisVerifyWorkmanGender() throws SQLException {
					dataBaseConnectionWMS();
					SkillAnalysisVerifyWorkmanGender();
					Skill_Verify_DB_Values.SkillAnalysisVerifyWorkmanGender(WorkmanGender);
					databaseConnectionClose();
				}
//getSkillAnalysisVerifyBloodGroup	
				public static void SkillAnalysisVerifyBloodGroup() throws SQLException {

					ResultSet results = stmt.executeQuery(
							"SELECT COM.GEM_M_Blood_Group.GMBD_Desc As BloodGroup FROM COM.GEM_M_Blood_Group INNER JOIN IND.WPR_M_PERSONAL ON COM.GEM_M_Blood_Group.GMBD_Code= IND.WPR_M_PERSONAL.WMP_Blood_Group_Id where IND.WPR_M_PERSONAL.WMP_Workmen_ID="
									+ WorkmanID);
					while (results.next()) {
						WorkmanBloodGroup = results.getString(1);

					}

				}

				public static void getSkillAnalysisVerifyBloodGroup() throws SQLException {
					dataBaseConnectionWMS();
					SkillAnalysisVerifyBloodGroup();
					Skill_Verify_DB_Values.SkillAnalysisVerifyBloodGroup(WorkmanBloodGroup);
					databaseConnectionClose();
				}
//getSkillAnalysisVerifyMaritalStatus	
				public static void SkillAnalysisVerifyMaritalStatus() throws SQLException {

					ResultSet results = stmt.executeQuery(
							"SELECT COM.CWM_M_Transaction_Details.CMTD_Detail_Desc As MaritalStatus FROM COM.CWM_M_Transaction_Details INNER JOIN IND.WPR_M_PERSONAL ON COM.CWM_M_Transaction_Details.CMTD_Detail_Code= IND.WPR_M_PERSONAL.WMP_Marital_Status where IND.WPR_M_PERSONAL.WMP_Workmen_ID="
									+ WorkmanID);
					while (results.next()) {
						WorkmanMaritalStatus = results.getString(1);

					}

				}
				public static void getSkillAnalysisVerifyMaritalStatus() throws SQLException {
					dataBaseConnectionWMS();
					SkillAnalysisVerifyMaritalStatus();
					Skill_Verify_DB_Values.SkillAnalysisVerifyMaritalStatus(WorkmanMaritalStatus);
					databaseConnectionClose();				
				}
}
