package stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.support.PageFactory;

import object_repository.EIP_Menu;
import object_repository.FIN_Disbursement_Coding;
import object_repository.FIN_Journals_Coding;
import object_repository.FIN_Scrutiny_Coding;
import object_repository.Login_Objects;
//import object_repository.SCM_ASN_Page;
//import object_repository.SCM_CPRS_Page;
import object_repository.SCM_Bill_Creation_Coding;

public class DatabaseConnection {

	public DatabaseConnection() {
		PageFactory.initElements(Webdriver.driver, Login_Steps.class);
	}

	static Statement stmt, stmt1, stmt3, stmt4, stmt5, stmtEPM;
	static String DB_Url, DB_User, DB_Pwd;
	static Connection con;
	static String finalResult;
	static String requestNumber;
	static String username;
	static String PRNumber;
	static String RFQNumber;
	static String Documentnum;
	static String TCDNumber;
	static String ARCARNumber;
	static String ARPRNumber;
	static String CapitalPRRFQNumber;
	static String AuctionStartDateUpdateNumber;
	static String AuctionPRNumber;
	static String DJRFQNumber;
	static String DJPRNumber;
	static String AuctionNumber;
	static String AuctionScope;
	static String FinalResult;
	static String AuctionPartialBidding;
	static String AuctionPublicOffer;
	static String AuctionNoOfInvites;
	static String AuctionDate;
	static String AuctionBaseRateApplicable;
	static String AuctionNoOfBidders;
	static String Service;
	static String SRNumber;
	static ResultSet results;
	static String CPRSNumber;
	static String Measurment_WO;
	static String Bill_NO;
	static String FIN;
	static String FINS;
	static String Meas;

	// static finalResult;

	public static void Updatequrey_DB() {

		try {

			DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
			DB_User = "SCM4login";
			DB_Pwd = "SCM4LOGIN@@qa";
			con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
			stmt = con.createStatement();
			System.out.println("Connection success");
			String sql = ("update EIP40SCM.WHS.WRH_t_Warehouse_Stock set WTWS_QTY = 0 where WtWS_Material_Code = '1ACNM001M000000'\r\n"
					+ "and WtWS_Job_Code = 'LE180046' and WtWS_Warehouse_Code = 5477");
			stmt.executeUpdate(sql);

		} catch (Exception e) {
			System.out.println("InCompleted Succesfully");
		}

	}

	public static void Qty_Update() {
		try {

			DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
			DB_User = "SCM4login";
			DB_Pwd = "SCM4LOGIN@@qa";
			con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
			stmt = con.createStatement();
			System.out.println("Connection success");
			String sql = ("update EIP40SCM.WHS.WRH_t_Warehouse_Stock set WTWS_QTY = 30 where WtWS_Material_Code = '1ACNM001M000000'\r\n"
					+ "and WtWS_Job_Code = 'LE180046' and WtWS_Warehouse_Code = 5477");

			stmt.executeUpdate(sql);

		} catch (Exception e) {
			System.out.println("InCompleted Succesfully");
		}

	}

	public static void dataBaseConnectionAwm() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40AWM;";
		DB_User = "AWM4LOGIN";
		DB_Pwd = "AWM4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt1 = con.createStatement();
		System.out.println("Connection success");
	}

	public static void dataBaseConnectionSCM() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
		DB_User = "SCM4login";
		DB_Pwd = "SCM4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Connection success");
	}

	public static void dataBaseConnectionCONSRC() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40CONSRC;";
		DB_User = "CSRC4LOGIN";
		DB_Pwd = "CSRC4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt3 = con.createStatement();
		System.out.println("Connection success");
	}

	public static void dataBaseConnectionEIP40EPM() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40EPM;";
		DB_User = "EPM4LOGIN";
		DB_Pwd = "EPm#Login1!Qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmtEPM = con.createStatement();
		System.out.println("Connection success");
	}

	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}

	public static void resultSet(String documentType) throws Throwable {

		if (documentType.equals("pr")) {
			results = stmt.executeQuery(
					"SELECT  top 1 hpr_pr_number FROM EIP40SCM.PRC.REQ_H_Purchase_Request where HPR_Inserted_By = '210668' order by HPR_Inserted_On desc");

		} else if (documentType.equals("tcd")) {
			results = stmt.executeQuery(
					"select top 1 HTC_TCD_Number from eip40scm.prc.REQ_H_Techno_Commercial where HTC_Inserted_By = '128620' order by HTC_Inserted_On desc");

		} else if (documentType.equals("CPRS")) {
			results = stmt.executeQuery(
					"select top 1 HCR_CPR_Number from Eip40scm.CPR.CPR_H_Capital_Request order by HCR_Inserted_On desc");

		} else if (documentType.equals("AR")) {
			results = stmt.executeQuery(
					"select top 1 HMS_WO_Number from eip40scm.wom.ORD_H_Measurements where HMS_Inserted_By ='128620' order by HMS_Inserted_On desc ");

		} else if (documentType.equals("PRCPRS")) {
			results = stmt.executeQuery(
					"SELECT top 1 hpr_pr_number  FROM EIP40SCM.PRC.REQ_H_Purchase_Request where HPR_Inserted_By = 496 order by HPR_Inserted_On desc");

		} else if (documentType.equals("PRDomesticJob")) {
			results = stmt.executeQuery(
					"SELECT  top 1 HPR_PR_Number  FROM EIP40SCM.PRC.REQ_H_Purchase_Request where HPR_Inserted_By ='77304' order by HPR_Inserted_On desc");
		} else if (documentType.equals("SR")) {
			results = stmt.executeQuery(
					"select top 1 HSRQ_SR_Number  from eip40scm.wom.REQ_h_Service_Request  where HSRQ_Inserted_By = '128620' order by HSRQ_Inserted_On desc");
		} else if (documentType.equals("Measurment_WO")) {
			results = stmt.executeQuery(
					"select  top 1 HMS_MS_Number from eip40scm.wom.ORD_H_Measurements where HMS_Inserted_By ='128620' order by HMS_Inserted_On desc ");
		} else if (documentType.equals("Bll_NO")) {
			results = stmt.executeQuery(
					"select top 1 HBILL_Bill_Number from eip40scm.wom.SER_H_Bills where HBILL_Inserted_By ='77304' order by HBILL_Inserted_On desc");
		} else if (documentType.equals("FIN")) {
			results = stmt.executeQuery(
					"Select top 1 HLRV_LR_Number from ACP.FAS_H_Ledger_Register_Vendor where  HLRV_Inserted_By ='169555' order by HLRV_Inserted_On desc");
		} else if (documentType.equals("FINS")) {
			results = stmt.executeQuery(
					"Select top 1 HLRV_LR_Number from ACP.FAS_H_Ledger_Register_Vendor where  HLRV_Inserted_By ='169555' order by HLRV_Inserted_On desc");
		}

		while (results.next()) {
			requestNumber = results.getString(1);
			System.out.println(requestNumber);

			ResultSet results1 = stmt1.executeQuery(
					"SELECT MUSER_Login_Name FROM WFM.WFM_T_Document_Flow INNER JOIN acs.ACS_M_Users ON MUSER_USER_ID=TDF_RECEIVER_UID WHERE TDF_Document_Reference_No = "
							+ "'" + requestNumber + "'" + " and TDF_ISActive = 'Y'");
			while (results1.next()) {
				username = results1.getString(1);
				System.out.println(username);
			}
		}

		databaseConnectionClose();
	}

	public static void Measurment() throws Throwable {

		
		ResultSet Measurment = stmt3.executeQuery(
				"select  top 1 HMS_MS_Number from eip40scm.wom.ORD_H_Measurements where HMS_Inserted_By ='128620' order by HMS_Inserted_On desc ");
		while (Measurment.next()) {
			Measurment_WO = Measurment.getString(1);
			System.out.println(Measurment_WO);
		}
		databaseConnectionClose();
	}

	public static void Bill() throws Throwable {

		ResultSet Bill1 = stmt3.executeQuery(
				"select top 1 HBILL_Bill_Number from eip40scm.wom.SER_H_Bills where HBILL_Inserted_By ='77304' order by HBILL_Inserted_On desc");
		while (Bill1.next()) {
			Bill_NO = Bill1.getString(1);
			System.out.println(Bill_NO);
		}
		databaseConnectionClose();
	}

	public static void Measurment_Wo() throws Throwable {
		dataBaseConnectionSCM();
		Measurment();
		

	}

	public static void Bill_No() throws Throwable {
		dataBaseConnectionSCM();
		Bill();
		SCM_Bill_Creation_Coding.F_BILL_NO.sendKeys(Bill_NO);

	}

	public static void DateUpdate() throws Throwable {

		stmt3.executeUpdate(
				"update EIP40SCM.WHS.WRH_t_Warehouse_Stock set WTWS_QTY = 0 where WtWS_Material_Code = '1ACNM001M000000' and WtWS_Job_Code = 'LE180046' and WtWS_Warehouse_Code = 5477 ");

		databaseConnectionClose();
	}

	public static void resultSet2() throws Throwable {

		ResultSet results = stmt.executeQuery(
				"update EIP40SCM.WHS.WRH_t_Warehouse_Stock set WTWS_QTY = 0 where WtWS_Material_Code = '1ACNM001M000000' and WtWS_Job_Code = 'LE180046' and WtWS_Warehouse_Code = 5477");
		while (results.next()) {
			PRNumber = results.getString(1);
			System.out.println(PRNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSetPRAuction() throws Throwable {

		ResultSet results = stmt3.executeQuery(
				"select top 1 HAlC_Alloction_Number FROM EIP40CONSRC.PRC.CONS_H_ALLOCATION  order by HALC_Inserted_On desc");
		while (results.next()) {
			AuctionPRNumber = results.getString(1);
			System.out.println(AuctionPRNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSetSR() throws Throwable {

		ResultSet results = stmt.executeQuery(
				"select top 1 HSRQ_SR_Number  from eip40scm.wom.REQ_h_Service_Request  where HSRQ_Inserted_By = '128620' order by HSRQ_Inserted_On desc");
		while (results.next()) {
			SRNumber = results.getString(1);
			System.out.println(SRNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet() throws Throwable {

		ResultSet results = stmt.executeQuery(
				"select top 1 HBILL_Bill_Number from eip40scm.wom.SER_H_Bills where HBILL_Job_Code ='LE180046' order by HBILL_Inserted_On desc");
		while (results.next()) {
			ARPRNumber = results.getString(1);
			System.out.println(ARPRNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSetAuction() throws Throwable {

		ResultSet resultAuct = stmt3.executeQuery(
				"SELECT top 1 DSD_Auction_Request_Number FROM [EIP40CONSRC].[AUC].[AUC_D_Shipment_Details]  where DSD_Inserted_By = '62259' order by DSD_Inserted_On desc");
		while (resultAuct.next()) {
			AuctionNumber = resultAuct.getString(1);
			System.out.println(AuctionNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSetAuctionStartDateUpdate() throws Throwable {

		stmt3.executeUpdate(
				"update EIP40SCM.WHS.WRH_t_Warehouse_Stock set WTWS_QTY = 0 where WtWS_Material_Code = '1ACNM001M000000' and WtWS_Job_Code = 'LE180046' and WtWS_Warehouse_Code = 5477");

		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionNumber() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_Auction_Request_Number from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			FinalResult = finalReport.getString(1);
			System.out.println("Action Number : " + FinalResult);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionScope() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_Auction_Scope from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionScope = finalReport.getString(1);
			System.out.println("Action Scope : " + AuctionScope);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionPartialBidding() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_Is_Partial_Bidding from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionPartialBidding = finalReport.getString(1);
			System.out.println("Action Partial Bidding : " + AuctionPartialBidding);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionPublicOffer() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_Is_Public_Offer from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionPublicOffer = finalReport.getString(1);
			System.out.println("Action Public Offer : " + AuctionPublicOffer);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionNoOfInvites() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_No_Of_Invites from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionNoOfInvites = finalReport.getString(1);
			System.out.println("Action No Of Invites : " + AuctionNoOfInvites);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionNoOfBidders() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_No_Of_Bidders from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionNoOfBidders = finalReport.getString(1);
			System.out.println("Action No Of Bidders : " + AuctionNoOfBidders);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionBaseRateApplicable() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_Is_Base_Rate_Applicable from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionBaseRateApplicable = finalReport.getString(1);
			System.out.println("Action Base Rate Applicable : " + AuctionBaseRateApplicable);

		}
		databaseConnectionClose();
	}

	public static void AuctionFinalOutputAuctionDate() throws Throwable {
		dataBaseConnectionCONSRC();
//           System.out.println("hswjsw swskwjsk");
		ResultSet finalReport = stmt3.executeQuery(
				"select top 1  HAR_Auction_Date from  auc.AUC_H_Auction_Request order by HAR_Inserted_On desc");
		while (finalReport.next()) {
			AuctionDate = finalReport.getString(1);
			System.out.println("Action Date : " + AuctionDate);

		}
		databaseConnectionClose();
	}

	public static void resultSetAuctionEndDateUpdate() throws Throwable {
		System.out.println("Before End Time");
		stmt3.executeUpdate(
				"update EIP40CONSRC.auc.AUC_H_Auction_Request set HAR_start_DateTime=GETDATE(), HAR_end_DateTime=GETDATE() where HAR_Auction_Request_Number in (SELECT top 1 DSD_Auction_Request_Number FROM [EIP40CONSRC].[AUC].[AUC_D_Shipment_Details]  where DSD_Inserted_By = '62259' order by DSD_Inserted_On desc)");
		System.out.println("After End Time");
		databaseConnectionClose();
	}

	public static void resultSet4() throws Throwable {

		ResultSet results4 = stmt.executeQuery(
				"select top 1 HPO_PO_Number  from eip40scm.prc.ORD_h_Purchase_Orders where HPO_Inserted_By = '210668'  order by HPO_Inserted_On  desc");
		while (results4.next()) {
			Documentnum = results4.getString(1);
			System.out.println(Documentnum);
		}
		databaseConnectionClose();
	}

	public static void resultSet3() throws Throwable {

		ResultSet results3 = stmt3.executeQuery(
				"select top 1 HRFQ_RFQ_Number FROM EIP40CONSRC.PRC.CONS_H_Request_for_Quote where HRFQ_Company_Code = 1 and HRFQ_Inserted_By = '128620' order by HRFQ_Inserted_On desc");
		while (results3.next()) {
			RFQNumber = results3.getString(1);
			System.out.println(RFQNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet8() throws Throwable {

		ResultSet results8 = stmt3.executeQuery(
				"select top 1 HRFQ_RFQ_Number FROM EIP40CONSRC.PRC.CONS_H_Request_for_Quote where HRFQ_Company_Code = 1 and HRFQ_Inserted_By = '128620' order by HRFQ_Inserted_On desc");
		while (results8.next()) {
			CapitalPRRFQNumber = results8.getString(1);
			System.out.println(CapitalPRRFQNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet5() throws Throwable {

		ResultSet results5 = stmt.executeQuery(
				"select top 1 HTC_TCD_Number from eip40scm.prc.REQ_H_Techno_Commercial where HTC_Inserted_By = '128620' order by HTC_Inserted_On desc");
		while (results5.next()) {
			TCDNumber = results5.getString(1);
			System.out.println(TCDNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet6() throws Throwable {

		ResultSet results6 = stmt.executeQuery(
				"select top 1 HCR_CPR_Number from Eip40scm.CPR.CPR_H_Capital_Request order by HCR_Inserted_On desc");
		while (results6.next()) {
			CPRSNumber = results6.getString(1);
			System.out.println(CPRSNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet7() throws Throwable {

		ResultSet results7 = stmt.executeQuery(
				" select top 1 HWO_WO_Number from eip40scm.wom.ORD_H_Work_Orders where HWO_Job_Code ='LE180046'  order by HWO_Inserted_On desc");
		while (results7.next()) {
			ARCARNumber = results7.getString(1);
			System.out.println(ARCARNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet9() throws Throwable {

		ResultSet results = stmt.executeQuery(
				"SELECT  top 1 HPR_PR_Number  FROM EIP40SCM.PRC.REQ_H_Purchase_Request where HPR_Inserted_By ='77304' order by HPR_Inserted_On desc");
		while (results.next()) {
			DJPRNumber = results.getString(1);
			System.out.println(DJPRNumber);
		}
		databaseConnectionClose();
	}

	public static void resultSet10() throws Throwable {

		ResultSet results10 = stmt3.executeQuery(
				"select top 1 HBILL_Bill_Number from eip40scm.wom.SER_H_Bills where HBILL_Inserted_By ='77304' order by HBILL_Inserted_On desc");
		while (results10.next()) {
			DJRFQNumber = results10.getString(1);
			System.out.println(DJRFQNumber);
		}
		databaseConnectionClose();
	}

	public static void approver(String documentType) throws Throwable {
		System.out.println("PR - SR : " + documentType);
		dataBaseConnectionSCM();
		dataBaseConnectionAwm();
		resultSet(documentType);
		System.out.println(username);
		Login_Objects.Username.sendKeys(username);

	}

	public static void EnterPRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet2();
		EIP_Menu.EnterPRFromDB.sendKeys(PRNumber);
		// RFQ_PR_Creation.verificationResult(PRNumber);

	}

	public static void EnterSRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSetSR();
		EIP_Menu.FilterSRNo.sendKeys(SRNumber);
		Thread.sleep(500);
		EIP_Menu.FilterSRNo.clear();
		Thread.sleep(500);
		EIP_Menu.FilterSRNo.sendKeys(SRNumber);
		// RFQ_PR_Creation.verificationResult(PRNumber);

	}

	public static void EnterDomesticJobPRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet9();
		EIP_Menu.EnterPRFromDB.sendKeys(DJPRNumber);

	}

	public static void EnterPRNumAuction() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSetPRAuction();
		EIP_Menu.AuctionFilterPR.sendKeys(AuctionPRNumber);

	}

	public static void UpdateStartDateAuction() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSetAuctionStartDateUpdate();
		// EIP_Menu.AuctionFilterPR.sendKeys(AuctionPRNumber);

	}

	public static void FilterBillNO() throws Throwable {
		dataBaseConnectionSCM();
		resultSet10();

		SCM_Bill_Creation_Coding.Filter_Bill_No.sendKeys(DJRFQNumber);

	}

	public static void UpdateEndDateAuction() throws Throwable {
		dataBaseConnectionCONSRC();
		Thread.sleep(2000);
		resultSetAuctionEndDateUpdate();

		System.out.println("DB Updated");
		// EIP_Menu.AuctionFilterPR.sendKeys(AuctionPRNumber);

	}

	public static void EnterAuctionNumber() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSetAuction();
		EIP_Menu.EnterRFQFromDB.sendKeys(AuctionNumber);

	}

	public static void EnterReverseAuctionNumber() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSetAuction();
		EIP_Menu.EnterAuctioninFilter.sendKeys(AuctionNumber);

	}

	public static void EnterCapitalPRfromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet();
		SCM_Bill_Creation_Coding.Filter_Bill_No.sendKeys(ARPRNumber);

	}

	public static void EnterCapitalPRfromDB1() throws Throwable {
		dataBaseConnectionSCM();
		resultSet();
		SCM_Bill_Creation_Coding.F_A_D_NO.sendKeys(ARPRNumber);

	}

	public static void EnterRFQFromDB() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet3();
		EIP_Menu.Filter_RFQ_No.sendKeys(RFQNumber);

	}

//              public static void EnterRFQFromDBEdit() throws Throwable {
//                             dataBaseConnectionCONSRC();                
//                              resultSet3(); 
//                             
//                              EIP_Menu.EnterRFQNUmber.sendKeys(RFQNumber);
//                             
//              }

	public static void EnterRFQFromDBInRefrenceRFQ() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet3();
		EIP_Menu.ReferenceRFQ.sendKeys(RFQNumber);

	}

	public static void EnterRFQFromDBAuction() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet3();
		EIP_Menu.SelectRFQforAuction.sendKeys(RFQNumber);

	}

	public static void EnterDomesticJobRFQFromDB() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet10();

		EIP_Menu.EnterRFQFromDB.sendKeys(DJRFQNumber);

	}

	public static void EnterCapitalPRRFQNumberFromDB() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet8();
		EIP_Menu.EnterRFQFromDB.sendKeys(CapitalPRRFQNumber);

	}

	public static void EnterRFQFromDBTCC() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet3();
		EIP_Menu.EnterRFQFromDBTCC.sendKeys(RFQNumber);

	}

	public static void EnterRFQNoTCD() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet3();
		EIP_Menu.RFQNoTCD.sendKeys(RFQNumber);

	}

	public static void EnterCapitalRFQNoTCD() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet3();
		EIP_Menu.RFQNoTCD.sendKeys(RFQNumber);

	}

	public static void EnterRFQNoTCDAS() throws Throwable {
		dataBaseConnectionCONSRC();
		resultSet8();
		Thread.sleep(5000);
		EIP_Menu.FilterCapitalTCD.sendKeys(CapitalPRRFQNumber);

	}

	public static void SendPRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet2();
		EIP_Menu.DocumentNo.sendKeys(PRNumber);

	}

	public static void SendDJPRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet9();
		EIP_Menu.DocumentNo.sendKeys(DJPRNumber);

	}

	public static void SendSRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSetSR();
		EIP_Menu.DocumentNo.sendKeys(SRNumber);

	}

	public static void SendDJPRAllocation() throws Throwable {
		dataBaseConnectionSCM();
		resultSet9();
		EIP_Menu.PRNumAllocation.sendKeys(DJPRNumber);

	}

	public static void AssetRequestPRFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet();
//                              SCM_CPRS_Page.ARDocNum.sendKeys(ARPRNumber);

	}

	public static void SendPRAllocation() throws Throwable {
		dataBaseConnectionSCM();
		resultSet2();
		EIP_Menu.PRNumAllocation.sendKeys(PRNumber);

	}

	public static void SendRFQFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet2();
		EIP_Menu.DocumentNo.sendKeys(PRNumber);

	}

	public static void GetPOFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet4();
//                              SCM_ASN_Page.DocumentNum.sendKeys(Documentnum);

	}

	public static void GetTCDFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet5();
		EIP_Menu.Filter_Doc_No_click.sendKeys(TCDNumber);

	}

	public static void GetTCDFromDBFirstLevel() throws Throwable {
		dataBaseConnectionSCM();
		resultSet5();

		EIP_Menu.DocTCD.sendKeys(TCDNumber);

	}

	public static void GetTCDFromDBApproval() throws Throwable {
		dataBaseConnectionSCM();
		resultSet5();

//                             SCM_CPRS_Page.DocNum.sendKeys(TCDNumber);

	}

	public static void GetCPRSFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet6();
//                              SCM_CPRS_Page.DocNum.sendKeys(CPRSNumber);

	}

	public static void GetCPRSFromDBAR() throws Throwable {
		dataBaseConnectionSCM();
		resultSet6();
//                              SCM_CPRS_Page.ARCPRS.sendKeys(CPRSNumber);

	}

	public static void GetAssetRequestARCARFirstAndSecondLavelFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet7();
		SCM_Bill_Creation_Coding.Filter_Document_No.sendKeys(ARCARNumber);

	}

	public static void GetPRAssetRequestAllocationFromDB() throws Throwable {
		dataBaseConnectionSCM();
		resultSet();
//                              SCM_CPRS_Page.PRNumAllocationAS.sendKeys(ARPRNumber);

	}

	public static void GetAssetRequestARCARFrom() throws Throwable {
		dataBaseConnectionSCM();
		resultSet();
//                              SCM_CPRS_Page.ARDocNum.sendKeys(ARPRNumber);

	}

//	Fin Scrutiny
	public static void dataBaseConnectionFIN() throws SQLException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40FIN;";
		DB_User = "FIN4login";
		DB_Pwd = "FIN4LOGIN@@qa";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		System.out.println("Connection success");
	}

	public static void Fin() throws Throwable {

		
		ResultSet results7 = stmt.executeQuery(
				"Select top 1 HLRV_LR_Number from ACP.FAS_H_Ledger_Register_Vendor where  HLRV_Inserted_By ='169555' order by HLRV_Inserted_On desc");
		while (results7.next()) {
			FIN = results7.getString(1);
			System.out.println(FIN);
		}
		databaseConnectionClose();
	}

	public static void SendScrutinyFromDB() throws Throwable {
		dataBaseConnectionFIN();
		Fin();
		FIN_Scrutiny_Coding.Invoice_Regs_No.sendKeys(FIN);

	}

	public static void FinJR() throws Throwable {

		ResultSet results8 = stmt.executeQuery(
				"Select top 1 HLRV_LR_Number from ACP.FAS_H_Ledger_Register_Vendor where  HLRV_Inserted_By ='169555' order by HLRV_Inserted_On desc");
		while (results8.next()) {
			FINS = results8.getString(1);
			System.out.println(FINS);
		}
		databaseConnectionClose();
	}

	public static void SendJournalsFromDB() throws Throwable {
		dataBaseConnectionFIN();
		FinJR();
		FIN_Journals_Coding.Pass_Invoice_No.sendKeys(FINS);

	}
	public static void SendCollestionFromDB() throws Throwable {
		dataBaseConnectionFIN();
		FinJR();
		FIN_Disbursement_Coding.Filter_Document_No.sendKeys(FINS);

	}
	public static void Measu() throws Throwable {

		dataBaseConnectionSCM();
		ResultSet results7 = stmt.executeQuery(
				"select  top 1 HMS_MS_Number from eip40scm.wom.ORD_H_Measurements where HMS_Inserted_By ='128620' order by HMS_Inserted_On desc ");
		while (results7.next()) {
			Meas = results7.getString(1);
			System.out.println(Meas);
		}
		databaseConnectionClose();
	}
	

}
