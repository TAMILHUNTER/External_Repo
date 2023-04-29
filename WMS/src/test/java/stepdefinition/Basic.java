package stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic_Details.Create.Statutory;
import utils.DriverFactory;
import java.time.Duration;
import net.bytebuddy.utility.RandomString;

public class Basic {

	public static int Aadhaar_Number;
	public static int Random_Aadhaar;

	public static int popup_validation;
	public static int length_of_spinner;
	public static int popup_validation2;
	public static int popup_validation3;
	public static String Popup_Message3;
	public static int popup_validation4;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************
	// DataBase Connection

	public static void DB_Connection() throws SQLException, ClassNotFoundException {
		Connection con = DriverManager.getConnection(ConfigFileReader.getDB_Url(), ConfigFileReader.getDB_User(),
				ConfigFileReader.getDB_Pwd());
		Class.forName(ConfigFileReader.getDB_Loading_Class());
		Statement stmt = con.createStatement();

		// Query1
		ResultSet a = stmt.executeQuery(ConfigFileReader.getSQL_Query1_Table());
		System.out.println("Connection success:" + "DataBase results");
		while (a.next()) {
			String Column = a.getString(ConfigFileReader.getSQL_Query1_Column());
			System.out.println(Column);
		}

	}

	public static void popup_handle() throws Throwable {

		System.out.println("Popup Response :" + ObjectsReporsitory.popup.getText());

		if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
			// System.out.println(ObjectsReporsitory.popup_text.getText().substring(17,
			// 29));
			System.out.println(ObjectsReporsitory.popup_text.getText());
			// ObjectsReporsitory.partner_WorkmanPopup.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();
			System.out.println("*****Details are saved*****");

		} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

			if (ObjectsReporsitory.popup_text.getText().equals("Please select the Partner")) {
				System.out.println("Error : Partner Details Not Saved ");
				// ObjectsReporsitory.partner_WorkmanPopup.click();
				Actions actions_Keys2 = new Actions(DriverFactory.driver);
				actions_Keys2.sendKeys(Keys.ESCAPE);
				actions_Keys2.perform();
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_partner));
				ObjectsReporsitory.Induction_partner.click();
				Actions actions = new Actions(DriverFactory.driver);
				actions.moveToElement(ObjectsReporsitory.Partner_partnername);
				actions.perform();
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_partnername));
				ObjectsReporsitory.Partner_partnername.click();
				ObjectsReporsitory.Partner_partnername.clear();
				ObjectsReporsitory.Partner_partnername.sendKeys("0 - Direct Workmen");
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_partner_first_Partner));
				ObjectsReporsitory.Partner_partner_first_Partner.click();
				Actions actions2 = new Actions(DriverFactory.driver);
				actions2.moveToElement(ObjectsReporsitory.Partner_next);
				actions2.perform();
				ObjectsReporsitory.Partner_next.click();
				System.out.println("Partner details are Saved as Direct Workmen");
				ObjectsReporsitory.Induction_personal.click();
				Actions actions3 = new Actions(DriverFactory.driver);
				actions3.moveToElement(ObjectsReporsitory.Personal_saveNext);
				actions3.perform();
				ObjectsReporsitory.Personal_saveNext.click();

				ObjectsReporsitory.Induction_communication.click();
				Actions actions4 = new Actions(DriverFactory.driver);
				actions4.moveToElement(ObjectsReporsitory.Communication_saveNext);
				actions4.perform();
				ObjectsReporsitory.Communication_saveNext.click();

				if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
					// System.out.println(ObjectsReporsitory.popup_text.getText().substring(17,
					// 29));
					System.out.println(ObjectsReporsitory.popup_text.getText());
					// ObjectsReporsitory.partner_WorkmanPopup.click();
					ObjectsReporsitory.WorkmanSearchPopup_ok.click();
					System.out.println("*****Details are saved*****");

				} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {
					System.out.println("*****Failed to Save Details - Error Message : "
							+ ObjectsReporsitory.popup_text.getText() + "*****");
					ObjectsReporsitory.WorkmanSearchPopup_ok.click();
					// ObjectsReporsitory.partner_WorkmanPopup.click();
					// fail();uncomment this

				}

			} else if (ObjectsReporsitory.popup_text.getText().equals("Invalid Aadhar number")) {
				System.out.println("Error : Generated Aadhaar number Not Valid - Trying Another Aadhaar Number");
				// ObjectsReporsitory.partner_WorkmanPopup.click();

				Actions actions_Keys3 = new Actions(DriverFactory.driver);
				actions_Keys3.sendKeys(Keys.ESCAPE);
				actions_Keys3.perform();

				// Statutory.Verify_User_can_able_to_Add_Aadhaar();
				ObjectsReporsitory.statutoryDetails_Aadhaar.click();
				ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
				ObjectsReporsitory.statutoryDetails_Aadhaar.click();

				Random rnd = new Random();
				long number1 = rnd.nextInt(623);
				long number2 = rnd.nextInt(328);
				long number3 = rnd.nextInt(65);
				long number4 = rnd.nextInt(652);
				ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("64" + number1 + number2 + number3 + number4);
				Aadhaar_Number = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length();
				System.out.println("Length of the Aadhaar Number : " + Aadhaar_Number);
				if (Aadhaar_Number < 12) {
					ObjectsReporsitory.statutoryDetails_Aadhaar.click();

					Actions actions_key1 = new Actions(DriverFactory.driver);
					actions_key1.sendKeys(Keys.END);
					actions_key1.perform();
					ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("5");
					System.out.println(
							"Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
				} else if (Aadhaar_Number > 12) {
					ObjectsReporsitory.statutoryDetails_Aadhaar.click();
					Actions actions_key2 = new Actions(DriverFactory.driver);
					actions_key2.sendKeys(Keys.END);
					actions_key2.perform();
					Actions actions_key3 = new Actions(DriverFactory.driver);
					actions_key3.sendKeys(Keys.BACK_SPACE);
					actions_key3.perform();
					System.out.println(
							"Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
				} else {
					System.out.println(
							"Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
				}

				Statutory.Verify_User_can_able_save_Statutory_Details();

			}

			else {
				System.out.println("*****Failed to Save Details - Error Message : "
						+ ObjectsReporsitory.popup_text.getText() + "*****");
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				// ObjectsReporsitory.partner_WorkmanPopup.click();
				// fail();uncomment this
			}

		}

		else {

			System.out.println("*****Popup Message : " + ObjectsReporsitory.popup_text.getText() + "*****");
			// ObjectsReporsitory.partner_WorkmanPopup.click();
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();
			// fail();uncomment this
		}

	}

	public static void popup_validation() throws Throwable {

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 1) {

			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			Basic.popup_handle();

		} else {
			System.out.println("Records Available");
		}

	}

	public static void popup_Handle2() throws Throwable {

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup Message : " + popup_validation);
		if (popup_validation > 0) {

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("------------------------------");
			} else {
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("------------------------------");
			}

		}

		else {
			System.out.println("Popup Message Not displayed");
			System.out.println("------------------------------");
		}

	}

	public static void popup_Handle_IC_dash() throws Throwable {

		popup_validation = ObjectsReporsitory.basic_popup_validation_IC.size();
		System.out.println("Popup Message : " + popup_validation);
		if (popup_validation > 0) {

			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());

			if (ObjectsReporsitory.popup_text.getText().contains("Sub contructor capacity for absent workmen")) {
				Actions actionewwesc = new Actions(DriverFactory.driver);
				actionewwesc.sendKeys(Keys.ESCAPE).build().perform();
				Basic.popup_Handle_IC_dash();
			}
			else if(ObjectsReporsitory.popup_text.getText().contains("Sub contructor capacity: undefined")) {
				Actions actionewwssesc = new Actions(DriverFactory.driver);
				actionewwssesc.sendKeys(Keys.ESCAPE).build().perform();
				Basic.popup_Handle_IC_dash();
			}
			
		} 
		else {
			System.out.println("IC Dashboard Displayed");
			System.out.println("------------------------------");
		}

	}

	public static void popup_validation_Attendance_upload() throws Throwable {

		popup_validation = ObjectsReporsitory.basic_popup_validation.size();

		if (popup_validation > 1) {

			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			Basic.popup_handle();
			Basic.popup_validation_Attendance_upload();

		} else {
			System.out.println("Records Added");
		}

	}

	public static void get_Month() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MMMMMMMMM");
		System.out.println(formatter.format(date));

	}

	// Added by Tamil 18-11-2022

	public static void Error_popup_validation() throws Throwable {

		Thread.sleep(3000);
		popup_validation2 = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation2);

		if (popup_validation2 == 0) {
			System.out.println("Failed : Error Not Handled : Popup Message is not displayed");
			System.out.println("------------------------------------------------------------");
			// fail();
		}

		else {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
			ObjectsReporsitory.WorkmanSearchPopup_ok.click();
			System.out.println("Error Handled : Validation Message is displayed");
			System.out.println("--------------------------------------------------------");

		}

	}

	public static void Error_popup_validation_Reg() throws Throwable {

		Thread.sleep(3000);
		popup_validation3 = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation3);

		if (popup_validation3 == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
			// fail();
		}

		else if (popup_validation3 > 0) {
			Popup_Message3 = ObjectsReporsitory.popup_text.getText();
			if (popup_validation3 > 0 && Popup_Message3.contains("Workmen Number is not available")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0 && Popup_Message3.contains("No Records Found")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0 && Popup_Message3.contains("Please Enter Name")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.Error_popup_validation_Reg();
			}

			else if (popup_validation3 > 0 && Popup_Message3.contains("Please Enter Visapro")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0 && Popup_Message3.contains("Please Enter Workmen ID")) {

				Screenshot.Screenshotforscenario();
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Error Handled : Validation Message is displayed");
				System.out.println("--------------------------------------------------------");
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0 && Popup_Message3.contains("Given Passport Number is not available")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0
					&& Popup_Message3.contains("No Workmen Found, Click Yes to Process for New Workmen")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0 && Popup_Message3.contains("Please Enter Passport Number")) {

				Screenshot.Screenshotforscenario();
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Error Handled : Validation Message is displayed");
				System.out.println("--------------------------------------------------------");
				Basic.Error_popup_validation_Reg();
			} else if (popup_validation3 > 0 && Popup_Message3.contains("Please Enter Aadhaar")) {

				Screenshot.Screenshotforscenario();
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				System.out.println("Error Handled : Validation Message is displayed");
				System.out.println("--------------------------------------------------------");
				Basic.Error_popup_validation_Reg();
			}
		} else {

			Screenshot.Screenshotforscenario();
			System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
			System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
			Actions actioneww = new Actions(DriverFactory.driver);
			actioneww.sendKeys(Keys.ESCAPE).build().perform();
			System.out.println("Error Handled : Validation Message is displayed");
			System.out.println("--------------------------------------------------------");
			Basic.Error_popup_validation_Reg();

		}

	}

	public static void popup_validation_other() throws Throwable {

		Thread.sleep(3000);
		popup_validation4 = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation4);

		if (popup_validation4 == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
			// fail();
		}

		else if (popup_validation4 > 0) {
			Popup_Message3 = ObjectsReporsitory.popup_text.getText();
			if (popup_validation3 > 0 && Popup_Message3.contains("Workmen is not yet released")) {

				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.popup_validation_other();
			} else {
				System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
				System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
				Actions actioneww = new Actions(DriverFactory.driver);
				actioneww.sendKeys(Keys.ESCAPE).build().perform();
				Basic.popup_validation_other();
			}
		}
	}

	public static void PageLoader_Validation() throws InterruptedException {

		length_of_spinner = ObjectsReporsitory.Spinner.size();
		if (length_of_spinner > 0) {
			System.out.println("Page is Loading - Kindly Wait");
			Thread.sleep(2000);
			Basic.PageLoader_Validation();
		} else {
			System.out.println("Page Load Complete - Element is clickable now");
		}

	}

	public static void Set_Expiry() throws Throwable {

		// ObjectsReporsitory.Datepicker_select_calender.click();
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Datepicker_Expiry_select_year);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_Expiry_select_year));
		Thread.sleep(3000);
		ObjectsReporsitory.Datepicker_Expiry_select_year.click();
		Thread.sleep(5000);
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Datepicker_Expiry_select_year);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Datepicker_Expiry_select_year));
		Thread.sleep(3000);
		ObjectsReporsitory.Datepicker_Expiry_select_year.click();
		Thread.sleep(5000);

		Random rand = new Random();
		int randomYear = rand.nextInt(ObjectsReporsitory.Datepicker_Expiry_year.size());
		System.out.println("Year selected : " + randomYear);
		ObjectsReporsitory.Datepicker_Expiry_year.get(randomYear).click();
		Thread.sleep(2000);

		int randommonth = rand.nextInt(ObjectsReporsitory.Datepicker_Expiry_select_Month.size());
		System.out.println("Month selected : " + randommonth);
		ObjectsReporsitory.Datepicker_Expiry_select_Month.get(randommonth).click();
		Thread.sleep(2000);

		int randomDate = rand.nextInt(ObjectsReporsitory.Datepicker_Expiry_select_Date.size());
		System.out.println("Date selected : " + randomDate);
		ObjectsReporsitory.Datepicker_Expiry_select_Date.get(randomDate).click();
		Thread.sleep(4000);

	}

	public static void Upload_Document() throws Throwable {

		// wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.popup_Upload_Attachments));

		Thread.sleep(3000);

		if (ConfigFileReader.getUpload_Doc_type().contains("PDF")) {
			ObjectsReporsitory.popup_Upload_Attachments
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getUpload_Statutory_File_pdf());
		} else if (ConfigFileReader.getUpload_Doc_type().contains("Excel")) {
			ObjectsReporsitory.popup_Upload_Attachments
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getUpload_Statutory_File_Excel());
		} else if (ConfigFileReader.getUpload_Doc_type().contains("TXT")) {
			ObjectsReporsitory.popup_Upload_Attachments
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getUpload_Statutory_File_TXT());
		} else if (ConfigFileReader.getUpload_Doc_type().contains("JPEG")) {
			ObjectsReporsitory.popup_Upload_Attachments
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getUpload_Statutory_File_JPEG());
		} else {
			System.out.println("Upload Doc type Not configured , So uploading default PDf File");
			ObjectsReporsitory.popup_Upload_Attachments
					.sendKeys(System.getProperty("user.dir") + ConfigFileReader.getUpload_Statutory_File_pdf());
		}

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.popup_Attachment_type));
		System.out.println("Document uploaded Successfully");
		System.out.println("-------------------------------");
		System.out.println("Selecting Document type");
		System.out.println("-------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.popup_Attachment_type));
		ObjectsReporsitory.popup_Attachment_type.click();
		List<WebElement> popup_Alloption = ObjectsReporsitory.popup_Attachment_type_AllOption;
		for (WebElement webElement : popup_Alloption) {
			if (webElement.getText().contains(ConfigFileReader.getAttachmenttype())) {
				webElement.click();
				System.out.println("Uploaded Document Type Selected :" + ConfigFileReader.getAttachmenttype());
				break;
			}
		}
		System.out.println("Description");
		System.out.println("-------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.popup_Attachment_Description));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.popup_Attachment_Description);
		ObjectsReporsitory.popup_Attachment_Description.clear();
		ObjectsReporsitory.popup_Attachment_Description.sendKeys("Attachment Desc " + RandomString.make(5));

		System.out.println("Is External");
		System.out.println("-------------------------------");

		if (ConfigFileReader.getAttachment_isExternal().equals("Yes")) {

			ObjectsReporsitory.popup_Attachment_Is_External.click();
			System.out.println("Attachment is a External document");
			System.out.println("-------------------------------");
		} else {
			System.out.println("Attachment is a Internal document");
			System.out.println("-------------------------------");
		}

		System.out.println("Upload Document");
		System.out.println("-------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.popup_Attachment_uploadDocuments));
		ObjectsReporsitory.popup_Attachment_uploadDocuments.click();
		Thread.sleep(5000);
		Basic.popup_handle();

	}
}