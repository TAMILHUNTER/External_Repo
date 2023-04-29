package repository.Actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class GetFrq {
	static Statement stmt;
	static String DB_Url,DB_User,DB_Pwd;
	static Connection con;
	static String frqNumber,numberofVehicle,rate,fromLocation,toLocation,distanceKm;

	public static  void dataBaseConnectionSCM() throws SQLException {
		   DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIP40SCM;";
		   DB_User = "SCM4login";
		   DB_Pwd = "SCM4LOGIN@@qa";
		   con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		   stmt = con.createStatement();
	}
	
	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}
	
	public static void resultSet() throws SQLException, InterruptedException {
		ResultSet detailTableRequest = stmt.executeQuery("SELECT TOP 1 DFR_Request_number, DFR_No_of_Vehicle_Required, DFR_Item_value FROM TLM.FRT_D_Freight_Request ORDER BY DFR_Inserted_On DESC");
		
		while(detailTableRequest.next()) {
			frqNumber=detailTableRequest.getString("DFR_Request_number");			
			numberofVehicle=detailTableRequest.getString("DFR_No_of_Vehicle_Required");
			rate = detailTableRequest.getString("DFR_Item_value");
			System.out.println("FRQ = "+frqNumber +"\t Number of Vehicle = " +numberofVehicle + "\t Rate ="+rate);
		}
		ResultSet detailTableLocation =stmt.executeQuery("SELECT TOP 1 DFLD_From_Location, DFLD_To_Location, DFLD_Distance_in_KMS  FROM TLM.FRT_D_Freight_Location_Details ORDER BY DFLD_Inserted_On DESC");
		while (detailTableLocation.next()) {
			fromLocation=detailTableLocation.getString("DFLD_From_Location");
			toLocation=detailTableLocation.getString("DFLD_To_Location");
			distanceKm=detailTableLocation.getString("DFLD_Distance_in_KMS");
			System.out.println("From Location =" + fromLocation +"\t To Location ="+ toLocation + "\t Distance in Km = "+ distanceKm);
		}
		TransporterAction.searchFRQ(frqNumber);
		TransporterAction.verifyVehicleDetails(frqNumber,numberofVehicle,rate,fromLocation,toLocation,distanceKm);
	}
	
	public static void getFrq() throws SQLException, InterruptedException {
		dataBaseConnectionSCM();		
		resultSet();
		databaseConnectionClose();
	}
	
	public static void getVehicleDetails() throws SQLException, InterruptedException {
		dataBaseConnectionSCM();		
		resultSet();
		databaseConnectionClose();
	}
	
	/*public static void main(String args[]) throws SQLException, InterruptedException {
		dataBaseConnectionSCM();		
		resultSet();
		databaseConnectionClose();
	}*/
}
