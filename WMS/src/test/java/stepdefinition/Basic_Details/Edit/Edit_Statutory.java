package stepdefinition.Basic_Details.Edit;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic;
import stepdefinition.Basic_Details.Create.Statutory;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Edit_Statutory {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Statutory() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Statutory Details$")
	public static void Select_Workman_and_Navigate_to_Statutory_Details() throws Throwable {

		Edit_Experience.Select_Workman_and_Navigate_to_Experience();
		ObjectsReporsitory.Induction_statutoryDetails.click();
		System.out.println("Navigated to StatutoryDetails");
		Thread.sleep(3000);
	}

	@Then("^Verify User can able to Edit Aadhaar$")
	public static void Verify_User_can_able_to_Edit_Aadhaar() throws Throwable {
		ObjectsReporsitory.statutoryDetails_Aadhaar.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(3285);
		ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("" + number1 + number2);
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getAadhaarUpdate();
	}

	@Then("^Verify User can able to Edit Driving License$")
	public static void Verify_User_can_able_to_Edit_Driving_License() throws Throwable {
		ObjectsReporsitory.statutoryDetails_DL.clear();
		Random rnd = new Random();
		long number1 = rnd.nextInt(1235467891);
		long number2 = rnd.nextInt(32821);
		ObjectsReporsitory.statutoryDetails_DL.sendKeys("" + RandomString.make(2) + number1 + number2);
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getDrivingLicenseUpdate();
	}

	@Then("^Verify User can able to Edit PAN card$")
	public static void Verify_User_can_able_to_Edit_PAN_card() throws Throwable {
		ObjectsReporsitory.statutoryDetails_pan.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(99999);
		ObjectsReporsitory.statutoryDetails_pan.sendKeys("" + RandomString.make(5) + number1 + RandomString.make(1));
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getPANUpdate();
	}

	@Then("^Verify User can able to Edit PF No$")
	public static void Verify_User_can_able_to_Edit_PF_No() throws Throwable {
		ObjectsReporsitory.statutoryDetails_PF.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1235467891);
		long number2 = rnd.nextInt(328225691);
		ObjectsReporsitory.statutoryDetails_PF.sendKeys("" + RandomString.make(5) + number1 + number2);
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getPFUpdate();
	}

	@Then("^Verify User can able to Edit UAN No$")
	public static void Verify_User_can_able_to_Edit_UAN_No() throws Throwable {
		ObjectsReporsitory.statutoryDetails_UAN.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(3281);
		ObjectsReporsitory.statutoryDetails_UAN.sendKeys("" + number1 + number2);
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getUANUpdate();
	}

	@Then("^Verify User can able to Edit ESI No$")
	public static void Verify_User_can_able_to_Edit_ESI_No() throws Throwable {
		ObjectsReporsitory.statutoryDetails_ESI.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_ESI.sendKeys("" + number1 + number2);
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getESIUpdate();
	}

	// ****************
	@Then("^Verify User can able to Edit Workpermit No$")
	public static void Verify_User_can_able_to_Add_Workpermit_No() throws Throwable {
		ObjectsReporsitory.statutoryDetails_WorkPermit.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit.clear();
		ObjectsReporsitory.statutoryDetails_WorkPermit.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_WorkPermit.sendKeys("" + number1 + number2);
		System.out
				.println("Work Permit Number :" + ObjectsReporsitory.statutoryDetails_WorkPermit.getAttribute("value"));
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getWorkpermitUpdate();

	}

	@Then("^Verify User can able to Edit Workpermit expiry$")
	public static void Verify_User_can_able_to_Add_Workpermit_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit_expiry));

		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.sendKeys(ConfigFileReader.getWorkpermit_Expiry_Date_Month_edit());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry
				.sendKeys(ConfigFileReader.getWorkpermit_Expiry_Year_edit());
		Thread.sleep(2000);

		System.out.println("Workpermit Expiry Date : "
				+ ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.getAttribute("value"));
		Thread.sleep(5000);
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getWorkpermitExpiryUpdate();

	}

	@Then("^Verify User can able to Edit Labourcard No$")
	public static void Verify_User_can_able_to_Add_Labourcard_No() throws Throwable {

		ObjectsReporsitory.statutoryDetails_labour.click();
		ObjectsReporsitory.statutoryDetails_labour.clear();
		ObjectsReporsitory.statutoryDetails_labour.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_labour.sendKeys("" + number1 + number2);
		System.out.println("Labour Card Number :" + ObjectsReporsitory.statutoryDetails_labour.getAttribute("value"));

		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getLabourCardUpdate();

	}

	@Then("^Verify User can able to Edit Labourcard expiry$")
	public static void Verify_User_can_able_to_Add_Labourcard_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour_expiry));
		ObjectsReporsitory.statutoryDetails_labour_expiry.click();

		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.statutoryDetails_labour_expiry
				.sendKeys(ConfigFileReader.getLabourcard_Expiry_Date_Month_edit());
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.statutoryDetails_labour_expiry.sendKeys(ConfigFileReader.getLabourcard_Expiry_Year_edit());
		Thread.sleep(2000);

		System.out.println(
				"Labourcard Expiry Date  : " + ObjectsReporsitory.statutoryDetails_labour_expiry.getAttribute("value"));

		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getLabourCardExpiryUpdate();

	}

	// ****************

	@Then("^Verify User can able Edit PF Nominee NameUpdate$")
	public static void Verify_User_can_able_to_Edit_PF_Nominee_Name_update() throws Throwable {
		String NomineecountReslut = ObjectsReporsitory.statutory_PF_Nominee_recordscount_text.getText();

		if (NomineecountReslut.contains("No records")) {

			Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
			Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();

			// Name
			ObjectsReporsitory.statutory_PF_Nominee_Edit1.click();
			ObjectsReporsitory.statutory_PF_Nominee_Name.click();
			ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
			ObjectsReporsitory.statutory_PF_Nominee_Name.click();
			ObjectsReporsitory.statutory_PF_Nominee_Name
					.sendKeys(ConfigFileReader.getPF_Nominee_Name2() + RandomString.make(10));
		} else {

			// Name
			ObjectsReporsitory.statutory_PF_Nominee_Edit1.click();
			ObjectsReporsitory.statutory_PF_Nominee_Name.click();
			ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
			ObjectsReporsitory.statutory_PF_Nominee_Name.click();
			ObjectsReporsitory.statutory_PF_Nominee_Name
					.sendKeys(ConfigFileReader.getPF_Nominee_Name2() + RandomString.make(10));

		}
		System.out.println(
				"PF Nominee Name_updated :" + ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value"));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutory_PF_Nominee_save));
		ObjectsReporsitory.statutory_PF_Nominee_save.click();
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getPFNomineeNameUpdate();
	}

	@Then("^Verify User can able Edit PF Nominee RelationshipUpdate$")
	public static void Verify_User_can_able_to_Edit_PF_Nominee_Relationship_update() throws Throwable {
		String NomineecountReslut = ObjectsReporsitory.statutory_PF_Nominee_recordscount_text.getText();

		if (NomineecountReslut.contains("No records")) {

			Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
			Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();

			// Relationship
			ObjectsReporsitory.statutory_PF_Nominee_Edit1.click();

			String Relatioship = ObjectsReporsitory.statutory_PF_Nominee_Relationship.getAttribute("value");
			if (Relatioship.equals("")) {
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.sendKeys("Mother");
				List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Mother")) {
						webElement.click();
						break;
					}
				}
			} else if (Relatioship.equals("Mother")) {
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.clear();
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.sendKeys("Father");
				List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Father")) {
						webElement.click();
						break;
					}
				}
			} else {
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.clear();
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.sendKeys("Sister");
				List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Sister")) {
						webElement.click();
						break;
					}
				}
			}
		} else {

			// Relationship
			ObjectsReporsitory.statutory_PF_Nominee_Edit1.click();

			String Relatioship = ObjectsReporsitory.statutory_PF_Nominee_Relationship.getAttribute("value");
			if (Relatioship.equals("")) {
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.sendKeys("Mother");
				List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Mother")) {
						webElement.click();
						break;
					}
				}
			} else if (Relatioship.equals("Mother")) {
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.clear();
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.sendKeys("Father");
				List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Father")) {
						webElement.click();
						break;
					}
				}
			} else {
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.clear();
				ObjectsReporsitory.statutory_PF_Nominee_Relationship.sendKeys("Sister");
				List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().equals("Sister")) {
						webElement.click();
						break;
					}
				}
			}

		}

		System.out.println("PF Nominee Name_updated :"
				+ ObjectsReporsitory.statutory_PF_Nominee_Relationship.getAttribute("value"));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutory_PF_Nominee_save));
		ObjectsReporsitory.statutory_PF_Nominee_save.click();
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getPFNomineeRelationshipUpdate();
	}

	@Then("^Verify User can able Edit PF Nominee Allocation PercentageUpdate$")
	public static void Verify_User_can_able_to_Edit_PF_Nominee_Allocation_Percentageupdate() throws Throwable {

		String NomineecountReslut = ObjectsReporsitory.statutory_PF_Nominee_recordscount_text.getText();

		if (NomineecountReslut.contains("No records")) {

			Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
			Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();

			ObjectsReporsitory.statutory_PF_Nominee_Edit1.click();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys("100");
		} else {

			ObjectsReporsitory.statutory_PF_Nominee_Edit1.click();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.click();
			ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys("100");

		}
		System.out.println("PF Nominee Allocation Percentage_Updated :"
				+ ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value"));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutory_PF_Nominee_save));
		ObjectsReporsitory.statutory_PF_Nominee_save.click();
		Actions actions153 = new Actions(DriverFactory.driver);
		actions153.moveToElement(ObjectsReporsitory.Bank_Header);
		actions153.perform();
		ObjectsReporsitory.statutoryDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getPFNomineepercentageUpdate();

	}

}