package test.DBQuery_Tamil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {

	static Statement stmt;
	static String DB_Url, DB_User, DB_Pwd;
	static Connection con;
	static String finalResult;
	public static String Purchase_Order_Number;
	public static String Purchase_Order_Number_Create;
	public static String Work_Order_Number;
	public static String MRN;
	public static String Vendor_code;

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

	public static void dataBaseFAS() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40FIN;";
		DB_User = "FIN4LOGIN";
		DB_Pwd = "FIN4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
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

	public static void GetPurchase_Order_Number_for_PO_Query() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select top 1 hpo_po_number from eip40scm.prc.ord_h_purchase_orders where hpo_ds_code <> 8 order by HPO_Inserted_On desc");
		// "select top 1 hpo_po_number from eip40scm.prc.ord_h_purchase_orders inner
		// join eip40scm.prc.ord_d_po_payment_terms on hpo_po_number = dpopt_po_number
		// Inner Join eip40glm.MDM.GEM_M_PT_Events b On MPTE_Event_Code =
		// dpopt_event_code INNER JOIN eip40glm.MDM.GEM_M_PT_Event_Category as ctgy ON
		// MPTE_Event_Category_Code = ctgy.MPTEC_Event_Category_Code and
		// hpo_company_code =1 and not exists ( select 'x' From
		// EIP40FIN.ACP.FAS_H_Ledger_Register_Vendor where hlrv_po_number =
		// hpo_po_number) order by HPO_Inserted_On desc");
		while (results.next()) {
			Purchase_Order_Number = results.getString("HPO_PO_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetPurchase_Order_Number_for_PO() throws SQLException {
		dataBaseConnectionSCM();
//		dataBaseConnectionFAS();
//		dataBaseConnectionGLM();
		GetPurchase_Order_Number_for_PO_Query();
		SendDBValue.Purchase_Order_Number(Purchase_Order_Number);
		databaseConnectionClose();

	}

	public static void GetPurchase_Order_Number_For_MRN_Query() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select top 1 hpo_po_number from eip40scm.prc.ord_h_purchase_orders where hpo_ds_code <> 8 order by HPO_Inserted_On desc");
		// "select top 1 hpo_po_number from eip40scm.prc.ord_h_purchase_orders inner
		// join eip40scm.prc.ord_d_po_payment_terms on hpo_po_number = dpopt_po_number
		// Inner Join eip40glm.MDM.GEM_M_PT_Events b On MPTE_Event_Code =
		// dpopt_event_code INNER JOIN eip40glm.MDM.GEM_M_PT_Event_Category as ctgy ON
		// MPTE_Event_Category_Code = ctgy.MPTEC_Event_Category_Code where
		// MPTEC_Is_Advance_Category ='E' and dpopt_quantum_code =100 and hpo_ds_code =3
		// and hpo_company_code =1 and not exists ( select 'x' From
		// EIP40FIN.ACP.FAS_H_Ledger_Register_Vendor where hlrv_po_number =
		// hpo_po_number) And Exists(Select Top 1 'x' From EIP40SCM.WHS.WRH_H_MRN Where
		// HMRN_PO_Number = hpo_PO_Number And HMRN_DS_Code = 3 and
		// HMRN_Invoice_Registration_Tag ='N') order by HPO_Inserted_On desc");
		while (results.next()) {
			Purchase_Order_Number = results.getString("HPO_PO_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetPurchase_Order_Number_for_MRN() throws SQLException {
		dataBaseConnectionSCM();
		// dataBaseConnectionFAS();
		// dataBaseConnectionGLM();
		GetPurchase_Order_Number_For_MRN_Query();
		SendDBValue.Purchase_Order_Number(Purchase_Order_Number);
		databaseConnectionClose();

	}

	public static void GetWork_Order_Number_Query() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select top 1 HWO_WO_Number from eip40scm.wom.ord_h_work_orders where hwo_ds_code <> 8 order by HWO_Inserted_On desc");
		while (results.next()) {
			Work_Order_Number = results.getString("HWO_WO_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetWork_Order_Number() throws SQLException {
		dataBaseConnectionSCM();
		// dataBaseConnectionGLM();
		GetWork_Order_Number_Query();
		SendDBValue.Work_Order_Number(Work_Order_Number);
		databaseConnectionClose();

	}

	public static void GetMRN_Number_Query() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select top 1 hmrn_mrn_number from eip40scm.whs.wrh_h_mrn where hmrn_ds_code =3 order by HMRN_Inserted_On desc");
		// "Select top 1 HMRN_MRN_Number From EIP40SCM.WHS.WRH_H_MRN inner join
		// EIP40SCM.WHS.WRH_D_MRN_Payment_Terms on HMRN_MRN_Number=DMRNPT_MRN_Number
		// Inner Join eip40glm.MDM.GEM_M_PT_Events On MPTE_Event_Code =
		// DMRNPT_Event_Code INNER JOIN eip40glm.MDM.GEM_M_PT_Event_Category ON
		// MPTE_Event_Category_Code = MPTEC_Event_Category_Code where
		// MPTEC_Is_Advance_Category ='E' and DMRNPT_Quantum_Code =100 and HMRN_DS_Code
		// =3 and HMRN_Invoice_Registration_Tag ='N' and hmrn_company_code =1 order by
		// HMRN_Inserted_On desc");
		while (results.next()) {
			MRN = results.getString("HMRN_MRN_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetMRN_Number() throws SQLException {
		dataBaseConnectionSCM();
		// dataBaseConnectionGLM();
		GetMRN_Number_Query();
		SendDBValue.MRN_Number(MRN);
		databaseConnectionClose();

	}

	public static void GetVendor_code_Query() throws SQLException {

		ResultSet results = stmt.executeQuery(
				"select top 1 HPO_BA_Code from eip40scm.prc.ord_h_purchase_orders order by HPO_Inserted_On desc");
		while (results.next()) {
			Vendor_code = results.getString("HPO_BA_Code");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetVendor_code() throws SQLException {
		dataBaseConnectionSCM();
		GetVendor_code_Query();
		SendDBValue.Vendor_Code(Vendor_code);
		databaseConnectionClose();

	}

	
	
	
	public static void GetPurchase_Order_Number_for_PO_Create_Query() throws SQLException {

		ResultSet results = stmt.executeQuery(
			//	"select top 1 hpo_po_number from eip40scm.prc.ord_h_purchase_orders inner join  eip40scm.prc.ord_d_po_payment_terms on hpo_po_number = dpopt_po_number   where dpopt_Event_code in (1201,1202 ,1204 ,1206 ,1207 ,1208 ,1209 ,1210 ,1211 ,1214,1215 ,1237 ,1260,1275) and dpopt_quantum_code =100 and hpo_ds_code =3    and hpo_company_code =1 and not exists ( select 'x'  From EIP40FIN.ACP.FAS_H_Ledger_Register_Vendor where hlrv_po_number = hpo_po_number) order by DPOPT_Inserted_On desc");
				"select top 1 hpo_po_number from eip40scm.prc.ord_h_purchase_orders inner join  eip40scm.prc.ord_d_po_payment_terms on hpo_po_number = dpopt_po_number   where dpopt_Event_code in (1201,1202 ,1204 ,1206 ,1207 ,1208 ,1209 ,1210 ,1211 ,1214,1215 ,1237 ,1260,1275) and dpopt_quantum_code =100 and hpo_ds_code =3    and hpo_company_code =1 order by DPOPT_Inserted_On desc");
		while (results.next()) {
			Purchase_Order_Number_Create = results.getString("HPO_PO_Number");
			// System.out.println(WorkmanID);

		}

	}

	public static void GetPurchase_Order_Number_for_PO_Create() throws SQLException {
		dataBaseConnectionSCM();
//		dataBaseConnectionFAS();
//		dataBaseConnectionGLM();
		GetPurchase_Order_Number_for_PO_Create_Query();
		SendDBValue.Purchase_Order_Number_Create(Purchase_Order_Number_Create);
//		SendDBValue.Purchase_Order_Number_Create("LE/LE180046/POD/22/000101");
		databaseConnectionClose();

	}
	
}
