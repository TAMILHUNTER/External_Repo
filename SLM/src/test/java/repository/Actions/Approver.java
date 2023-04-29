package repository.Actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Approver {
	static Statement stmt;
	static String DB_Url,DB_User,DB_Pwd;
	static Connection con;
	static String finalResult;
	public static  void dataBaseConnectionEdms() throws SQLException {
		   DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40EDMS;";
		   DB_User = "EDMS4LOGIN";
		   DB_Pwd = "LogiN#qa!EDM";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmt = con.createStatement();
	}
	
	public static  void dataBaseConnectionSCM() throws SQLException {
		   DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
		   DB_User = "SCM4login";
		   DB_Pwd = "SCM4LOGIN@@qa";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmt = con.createStatement();
	}
	
	public static  void dataBaseConnectionAwm() throws SQLException {
		  DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40AWM;";
		   DB_User = "AWM4LOGIN";
		   DB_Pwd = "AWM4LOGIN@@qa";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmt = con.createStatement();
	}
	
	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}
	public static void resultSet() throws SQLException, InterruptedException {
		
		ResultSet results = stmt.executeQuery("Select * from TLM.TLM_H_Rate_Contract order by HRC_Updated_On desc");
		
		while(results.next()) {
			finalResult=results.getString("HRC_Document_Number");
			CommonControlActions.clickFilter();
			CommonControlActions.sendDocNumberToFilter(finalResult);
			CommonControlActions.filtersearchResult(finalResult);
		}		
	}
	
	public static void getapproverLogin(String documentNumber) throws SQLException, InterruptedException {
		ResultSet results = stmt.executeQuery("SELECT MUSER_Login_Name FROM WFM.WFM_T_Document_Flow INNER JOIN acs.ACS_M_Users ON (MUSER_USER_ID=TDF_RECEIVER_UID) WHERE TDF_Document_Reference_No = '"+documentNumber+"' and TDF_ISActive = 'Y'");		
		while(results.next()) {
			String approverName=results.getString("MUSER_Login_Name");
			ApproverLoginAction.otheruserLogin();
			ApproverLoginAction.username_password(approverName);
			ApproverLoginAction.submit();	
		}		
	}
	public static void getapproverLogintoReject(String documentNumber) throws SQLException, InterruptedException {
		ResultSet results = stmt.executeQuery("SELECT MUSER_Login_Name FROM WFM.WFM_T_Document_Flow INNER JOIN acs.ACS_M_Users ON (MUSER_USER_ID=TDF_RECEIVER_UID) WHERE TDF_Document_Reference_No = '"+documentNumber+"' and TDF_ISActive = 'Y'");		
		while(results.next()) {
		String approverName=results.getString("MUSER_Login_Name");
		ApproverLoginAction.otheruserLogin();
		ApproverLoginAction.username_password(approverName);
		ApproverLoginAction.submit();	
	}	
}
	/*public static void deleteExistingRateContract(String documentNumber) throws SQLException {
		
		 stmt.executeUpdate("Delete from TLM.TLM_D_Rate_Contract where DRC_Document_Number='"+documentNumber+"'"+"");
		 stmt.executeUpdate("Delete from TLM.TLM_D_RC_PT_Reference_Document where DRCPD_Document_Number='"+documentNumber+"'"+"");
		 stmt.executeUpdate("Delete from TLM.TLM_D_RC_Payment_Terms where DRCPT_Document_Number='"+documentNumber+"'"+"");
		
		 stmt.executeUpdate("Delete from TLM.TLM_D_RC_Other_Charges where DRCOC_Document_Number='"+documentNumber+"'"+"");
		 stmt.executeUpdate("Delete from TLM.TLM_D_RC_Terms where DRCT_Document_Number='"+documentNumber+"'"+"");
		 stmt.executeUpdate("Delete from TLM.TLM_H_Rate_Contract where HRC_Document_Number='"+documentNumber+"'"+"");		
		 stmt.executeUpdate("Delete from TLM.TLM_L_Rate_Contract where LRC_Document_Number='"+documentNumber+"'"+"");
		 
	}*/
	 public static void approve(String documentNumber) throws SQLException, InterruptedException {
		 dataBaseConnectionAwm();
		 getapproverLogin(documentNumber);		 
		 databaseConnectionClose();
		 }	
	 public static void reject(String documentNumber) throws SQLException, InterruptedException {
		 dataBaseConnectionAwm();
		 getapproverLogintoReject(documentNumber);		 
		 databaseConnectionClose();
	 }

	public static void updateRCtoExpiry(String existingRCNumber) throws SQLException {
		dataBaseConnectionSCM();
		updateToExpiry(existingRCNumber);
		databaseConnectionClose();
	}

	public static void updateToExpiry(String existingRCNumber) throws SQLException {
		stmt.executeUpdate("UPDATE TLM.TLM_H_Rate_Contract SET HRC_Contract_End_Date='2000-01-01' WHERE HRC_Document_Number = '"+existingRCNumber+"'");		
			
	}

	/*public static void deleteRC(String existingRCNumber) throws SQLException {
		System.out.println("Searched RC Already Exist under RC Number = "+existingRCNumber);
		dataBaseConnectionSCM();
		deleteExistingRateContract(existingRCNumber);
		dataBaseConnectionClose();
		
	}	*/
	
	/*public static void main(String args[]) throws SQLException, InterruptedException {
		dataBaseConnectionSCM();		
		updateRCtoExpiry("LE/LE180046/TRC/22/000394");
		System.out.println("Record Updated");
		databaseConnectionClose();
		
	}*/
}
