package stepdefinition;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	public static Statement stmt;
	public static String DB_Url, DB_User, DB_Pwd;
	public static Connection con;
	public static String finalResult;
	// static finalResult;

	public static void dataBaseConnectionPDSS(String Query) throws SQLException, NumberFormatException, IOException {
		DB_Url = "jdbc:sqlserver://172.31.61.105:1433;databaseName=EIPPDSS;";
		DB_User = "EIP20LOGIN";
		DB_Pwd = "QA@#eip20Login";
		con = DriverManager.getConnection(DB_Url, DB_User, DB_Pwd);
		stmt = con.createStatement();
		ResultSet results = stmt.executeQuery(Query);

		while (results.next()) {

			String myName = results.getString(1);
			FileOutputStream file = new FileOutputStream("./Reference/DbOutPut.txt");
			byte[] strToBytes = myName.getBytes();
			file.write(strToBytes);
			file.close();

		}

	}

	public static void databaseConnectionClose() throws SQLException {
		con.close();
	}

	public static void resultSet() throws SQLException {

		ResultSet results = stmt.executeQuery("SELECT TOP 5 * FROM WHS.IND_H_Indent_Request");
		ResultSetMetaData rsMetaData = results.getMetaData();
		int count = rsMetaData.getColumnCount();
		while (results.next()) {
			for (int i = 1; i < count; i++) {
				String Column = rsMetaData.getColumnName(i);

				System.out.print(Column);

				System.out.println(":" + results.getString(i));

			}
			System.out.println("==========================");
		}

	}

	public static void main(String args[]) throws SQLException, NumberFormatException, IOException {
		dataBaseConnectionPDSS(null);
		resultSet();
		databaseConnectionClose();
	}
}
