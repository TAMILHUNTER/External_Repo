package stepdefinition;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

import dataProviders.ConfigFileReader;
import stepdefinition.Webdriver;

public class Basic {

	public static int popup_validation;
	public static int Popup_dashboardtips;
	public static int Popup_dashboardtips_showtips_again;
	static boolean status;
	public static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);

	// **************** Start import methods for step definition
	// ********************
	// DataBase Connection

//	public static void DB_Connection() throws SQLException, ClassNotFoundException {
//		Connection con = DriverManager.getConnection(ConfigFileReader.getDB_Url(), ConfigFileReader.getDB_User(),
//				ConfigFileReader.getDB_Pwd());
//		Class.forName(ConfigFileReader.getDB_Loading_Class());
//		Statement stmt = con.createStatement();
//
//		// Query1
//		ResultSet a = stmt.executeQuery(ConfigFileReader.getSQL_Query1_Table());
//		System.out.println("Connection success:" + "DataBase results");
//		while (a.next()) {
//			String Column = a.getString(ConfigFileReader.getSQL_Query1_Column());
//			System.out.println(Column);
//		}
//
//	}

	public static void popup_handle() {

		System.out.println("Popup Response :" + object_repository.Tamil.ObjectsReporsitory.popup.getText());

		if (object_repository.Tamil.ObjectsReporsitory.popup_head.getText().equals("Success")) {
			// System.out.println(ObjectsReporsitory.popup_text.getText().substring(17,
			// 29));
			System.out.println(object_repository.Tamil.ObjectsReporsitory.popup_text.getText());
			object_repository.Tamil.ObjectsReporsitory.Popup_Close.click();
			System.out.println("*****Details are saved*****");

		} else if (object_repository.Tamil.ObjectsReporsitory.popup_head.getText().equals("Error")) {
			System.out.println("*****Failed to Save Details - Error Message : "
					+ object_repository.Tamil.ObjectsReporsitory.popup_text.getText() + "*****");
			object_repository.Tamil.ObjectsReporsitory.Popup_Close.click();
			// fail();uncomment this

		} else {

			System.out.println("*****Popup Message : " + object_repository.Tamil.ObjectsReporsitory.popup_text.getText()
					+ "*****");
			object_repository.Tamil.ObjectsReporsitory.Popup_Close.click();
			// fail();uncomment this
		}

	}

	public static void popup_validation() {

		popup_validation = object_repository.Tamil.ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 1) {

			System.out.println("Popup Status : " + object_repository.Tamil.ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + object_repository.Tamil.ObjectsReporsitory.popup_text.getText());

		}

	}

	public static void popup_DashboardTips() throws IOException {

		Popup_dashboardtips = object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips.size();

		if (Popup_dashboardtips > 0) {

			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Heading : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Head.getText());
			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Message : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Message.getText());
			System.out.println(
					"========================================================================================================");
			System.out.println("Proceeding Next Tips ");
			wait.until(ExpectedConditions
					.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Next));
			object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Next.click();
			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Heading : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Head.getText());
			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Message : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Message.getText());
			System.out.println(
					"========================================================================================================");
			System.out.println("Verifying Previous Tips ");
			wait.until(ExpectedConditions
					.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Back));
			object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Back.click();
			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Heading : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Head.getText());
			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Message : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Message.getText());
			System.out.println(
					"========================================================================================================");
			System.out.println("Finish Reading Tips");
			wait.until(ExpectedConditions
					.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Next));
			object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Next.click();
			System.out.println(
					"========================================================================================================");
			System.out.println("Dashboard Tips Heading : "
					+ object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Head.getText());
			System.out.println(
					"========================================================================================================");
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Done));
			Screenshot.Screenshotforscenario();
			object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Done.click();
			Basic.popup_DashboardTips_ShowTips_Again();
		} else {
			System.out.println("Dashboard Tips Not Displayed");
			System.out.println("========================================================================================================");
		}

	}

	public static void popup_DashboardTips_Skip() throws IOException {

		Popup_dashboardtips = object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips.size();
		if (Popup_dashboardtips > 0) {

			System.out.println("Skiping Dashboard Tips");
			System.out.println("========================================================================================================");
			wait.until(ExpectedConditions
					.elementToBeClickable(object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Skip));
			Screenshot.Screenshotforscenario();
			object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Skip.click();

		} else {
			System.out.println("Dashboard Tips Not Displayed");
			System.out.println("========================================================================================================");
		}

	}
	
	public static void popup_DashboardTips_ShowTips_Again() throws IOException {
		Popup_dashboardtips_showtips_again = object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again
				.size();
		if (Popup_dashboardtips_showtips_again > 0) {
			Screenshot.Screenshotforscenario();
			if (ConfigFileReader.getshow_tips_Again().equals("Yes")) {
				System.out.println("Selecting Show Tips Again : Yes");
				try {
					
					wait.until(ExpectedConditions.elementToBeClickable(
							object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_Yes));
					object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_Yes.click();
				} catch (org.openqa.selenium.StaleElementReferenceException ex) {
					
					wait.until(ExpectedConditions.elementToBeClickable(
							object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_Yes));
					object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_Yes.click();
				}
				System.out.println("========================================================================================================");
			} else if (ConfigFileReader.getshow_tips_Again().equals("No")) {
				System.out.println("Selecting Show Tips Again : No");
				try {
					
					wait.until(ExpectedConditions.elementToBeClickable(
							object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_No));
					object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_No.click();
				} catch (org.openqa.selenium.StaleElementReferenceException ex) {
					
					wait.until(ExpectedConditions.elementToBeClickable(
							object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_No));
					object_repository.Tamil.ObjectsReporsitory.Popup_dashboardtips_Showtips_again_No.click();
				}
				System.out.println("========================================================================================================");
			}

		} else {
			System.out.println("Show Dashboard Tips Again popup Not Displayed");
			System.out.println("========================================================================================================");
		}
	}

//***********************************************************************************************************
	
	//Praveenkumar Raj Added : 08.11.2022
	
	public static void popup_handlepk() throws Throwable {


		/*wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
		status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");

		Thread.sleep(2000);
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();*/

		
		if (object_repository.Praveen.object_repository.popup_head.getText().equals("Confirmation ")) {
			System.out.println("Popup Response :" + object_repository.Praveen.object_repository.popup.getText());
			Thread.sleep(2000);
			System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
			System.out.println("00000");
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes));
			object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
		Screenshot.Screenshotforscenario();
		System.out.println("1111");
			System.out.println(object_repository.Praveen.object_repository.popup_text.getText());
Thread.sleep(3000);
System.out.println("222222222");
Screenshot.Screenshotforscenario();
System.out.println("3333333333");
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
			object_repository.Praveen.object_repository.Success_Ok.click();
			System.out.println("*****Details are saved*****");
			System.out.println("44444444");
		}

		 else if (object_repository.Praveen.object_repository.popup_head.getText().equals("Error")) {

				System.out.println("Error : Release Amount Should not be more than Hold Amount ");

				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
				object_repository.Praveen.object_repository.Success_Ok.click();
				
			}
	
		}
	//Pk
//***********************************************************************************************************
	
	
	
	
	
	
	
	
	
}
