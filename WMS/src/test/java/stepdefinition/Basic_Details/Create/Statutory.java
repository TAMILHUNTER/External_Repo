package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import net.bytebuddy.utility.RandomString;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Statutory {

	public static String Selected_PF_Nominee_Relation;
	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Statutory() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication Skill Deployment Education Experience details then navigate to Statutory$")
	public static void Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_details_then_navigate_to_Statutory()
			throws Throwable {

		Experience.Fill_Partner_Personal_communication_Skill_Deployment_Education_details_then_navigate_to_Experience();
		Experience.Verify_user_can_able_to_add_Experience();
		Experience.Verify_user_can_able_to_add_Duration();
		Experience.Verify_user_can_able_to_add_Project_details();
		Experience.Verify_user_can_able_to_add_Project_Skill();
		Experience.Verify_user_can_able_to_add_Experience_details();
		Experience.Verify_user_can_able_to_view_Previous_Job_Experience_details();
		Experience.Verify_user_can_able_to_save_Experience_details();
		ObjectsReporsitory.Induction_statutoryDetails.click();
		Actions actions101 = new Actions(DriverFactory.driver);
		actions101.moveToElement(ObjectsReporsitory.statutoryDetails_PFNominee_Header);
		actions101.perform();
		System.out.println("Navigated to Statutory");
	}

	@Then("^Verify User can able to Add Aadhaar$")
	public static void Verify_User_can_able_to_Add_Aadhaar() throws Throwable {

		System.out.println("Aadhaar Number :" + ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment for Aadhaar$")
	public static void Verify_User_can_able_to_upload_attachment_for_Aadhaar() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_aadhaar));
		ObjectsReporsitory.Upload_aadhaar.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Aadhaar Card Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add Driving License$")
	public static void Verify_User_Can_able_to_Add_Driving_License() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_DL));
		ObjectsReporsitory.statutoryDetails_DL.clear();
		Random rnd = new Random();
		long number1 = rnd.nextInt(1235467891);
		long number2 = rnd.nextInt(32821);
		ObjectsReporsitory.statutoryDetails_DL.sendKeys("" + RandomString.make(2) + number1 + number2);
		System.out.println("Driving License Number :" + ObjectsReporsitory.statutoryDetails_DL.getAttribute("value"));
	}

	@Then("^Verify User can able to upload attachment for Driving License$")
	public static void Verify_User_can_able_to_upload_attachment_for_Driving_License() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_DL));
		ObjectsReporsitory.Upload_DL.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Driving License Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to add Driving License expiry$")
	public static void Verify_User_can_able_to_add_Driving_License_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_DL_expiry));
		ObjectsReporsitory.statutoryDetails_DL_expiry.click();
		Basic.Set_Expiry();
		System.out.println("Driving License Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_DL_expiry.getText());
	}

	@Then("^Verify User can able to Add PAN card$")
	public static void Verify_User_can_able_to_Add_PAN_card() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_pan));
		ObjectsReporsitory.statutoryDetails_pan.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(99999);
		ObjectsReporsitory.statutoryDetails_pan.sendKeys("" + RandomString.make(5) + number1 + RandomString.make(1));
		System.out.println("PAN Number :" + ObjectsReporsitory.statutoryDetails_pan.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment PAN card$")
	public static void Verify_User_can_able_to_upload_attachment_for_PAN_card() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_PAN));
		ObjectsReporsitory.Upload_PAN.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("PAN Card Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add Workpermit No$")
	public static void Verify_User_can_able_to_Add_Workpermit_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit));
		ObjectsReporsitory.statutoryDetails_WorkPermit.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit.clear();
		ObjectsReporsitory.statutoryDetails_WorkPermit.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_WorkPermit.sendKeys("" + number1 + number2);
		System.out
				.println("Work Permit Number :" + ObjectsReporsitory.statutoryDetails_WorkPermit.getAttribute("value"));

	}
	
	@Then("^Verify User can able to Add international Workpermit No$")
	public static void Verify_User_can_able_to_Add_international_Workpermit_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit_international));
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.click();
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.clear();
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_WorkPermit_international.sendKeys("" + number1 + number2);
		System.out
				.println("Work Permit Number :" + ObjectsReporsitory.statutoryDetails_WorkPermit_international.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment for Workpermit$")
	public static void Verify_User_can_able_to_upload_attachment_for_Workpermit() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_WP));
		ObjectsReporsitory.Upload_WP.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Workpermit Document Upload Successfully");
		System.out.println("-------------------------------------");
	}
	@Then("^Verify User can able to upload attachment for international Workpermit$")
	public static void Verify_User_can_able_to_upload_attachment_for_international_Workpermit() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_WP_international));
		ObjectsReporsitory.Upload_WP_international.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Workpermit Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add Workpermit expiry$")
	public static void Verify_User_can_able_to_Add_Workpermit_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit_expiry));
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.click();
		Basic.Set_Expiry();
		System.out.println("Workpermit Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.getText());
	}

	@Then("^Verify User can able to Add international Workpermit expiry$")
	public static void Verify_User_can_able_to_Add_international_Workpermit_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_WorkPermit_expiry_international));
		ObjectsReporsitory.statutoryDetails_WorkPermit_expiry_international.click();
		Basic.Set_Expiry();
		System.out.println("Workpermit Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_WorkPermit_expiry_international.getText());
	}

	@Then("^Verify User can able to Add Labourcard No$")
	public static void Verify_User_can_able_to_Add_Labourcard_No() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour));

		ObjectsReporsitory.statutoryDetails_labour.click();
		ObjectsReporsitory.statutoryDetails_labour.clear();
		ObjectsReporsitory.statutoryDetails_labour.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_labour.sendKeys("" + number1 + number2);
		System.out.println("Labour Card Number :" + ObjectsReporsitory.statutoryDetails_labour.getAttribute("value"));

	}
	
	@Then("^Verify User can able to Add international Labourcard No$")
	public static void Verify_User_can_able_to_Add_international_Labourcard_No() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour_international));

		ObjectsReporsitory.statutoryDetails_labour_international.click();
		ObjectsReporsitory.statutoryDetails_labour_international.clear();
		ObjectsReporsitory.statutoryDetails_labour_international.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_labour_international.sendKeys("" + number1 + number2);
		System.out.println("Labour Card Number :" + ObjectsReporsitory.statutoryDetails_labour_international.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment for Labourcard$")
	public static void Verify_User_can_able_to_upload_attachment_for_Labourcard() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_labour));
		ObjectsReporsitory.Upload_labour.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Labour card Document Upload Successfully");
		System.out.println("-------------------------------------");
	}
	
	@Then("^Verify User can able to upload attachment for international Labourcard$")
	public static void Verify_User_can_able_to_upload_attachment_for_international_Labourcard() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_labour_international));
		ObjectsReporsitory.Upload_labour_international.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Labour card Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add Labourcard expiry$")
	public static void Verify_User_can_able_to_Add_Labourcard_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour_expiry));
		ObjectsReporsitory.statutoryDetails_labour_expiry.click();
		Basic.Set_Expiry();
		System.out.println("Labour card Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_labour_expiry.getText());

	}
	
	@Then("^Verify User can able to Add International Labourcard expiry$")
	public static void Verify_User_can_able_to_Add_International_Labourcard_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_labour_expiry_international));
		ObjectsReporsitory.statutoryDetails_labour_expiry_international.click();
		Basic.Set_Expiry();
		System.out.println("Labour card Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_labour_expiry_international.getText());

	}
	
	
	
	
	
	@Then("^Verify User can able to Add passport No$")
	public static void Verify_User_can_able_to_Add_passport_No() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_Passport));

		ObjectsReporsitory.statutoryDetails_Passport.click();
		ObjectsReporsitory.statutoryDetails_Passport.clear();
		ObjectsReporsitory.statutoryDetails_Passport.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_Passport.sendKeys("" + number1 + number2);
		System.out.println("Paasport Number :" + ObjectsReporsitory.statutoryDetails_Passport.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment for Passport$")
	public static void Verify_User_can_able_to_upload_attachment_for_Passport() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_passport));
		ObjectsReporsitory.Upload_passport.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Passport Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add passport expiry$")
	public static void Verify_User_can_able_to_Add_passport_expiry() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_Passport_expiry_international));
		ObjectsReporsitory.statutoryDetails_Passport_expiry_international.click();
		Basic.Set_Expiry();
		System.out.println("passport Expiry Date  : "
				+ ObjectsReporsitory.statutoryDetails_Passport_expiry_international_value.getText());

	}
	

	@Then("^Verify User can able to Add VisaProID$")
	public static void Verify_User_can_able_to_Add_VisaProID() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_visaproid));
		ObjectsReporsitory.statutoryDetails_visaproid.click();
		ObjectsReporsitory.statutoryDetails_visaproid.clear();
		ObjectsReporsitory.statutoryDetails_visaproid.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_visaproid.sendKeys("" + number1 + number2);
		System.out.println("VisaPro ID Number :" + ObjectsReporsitory.statutoryDetails_visaproid.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment for VisaProID$")
	public static void Verify_User_can_able_to_upload_attachment_for_VisaProID() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_visapro));
		ObjectsReporsitory.Upload_visapro.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("VisaPro ID Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add Visa number$")
	public static void Verify_User_can_able_to_Add_Visa_number() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_visa));
		ObjectsReporsitory.statutoryDetails_visa.click();
		ObjectsReporsitory.statutoryDetails_visa.clear();
		ObjectsReporsitory.statutoryDetails_visa.click();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_visa.sendKeys("" + number1 + number2);
		System.out.println("Visa Number :" + ObjectsReporsitory.statutoryDetails_visa.getAttribute("value"));

	}

	@Then("^Verify User can able to upload attachment for Visa$")
	public static void Verify_User_can_able_to_upload_attachment_for_visa() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_visa));
		ObjectsReporsitory.Upload_visa.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("Visa Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add PF No$")
	public static void Verify_User_can_able_to_Add_PF_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_PF));
		ObjectsReporsitory.statutoryDetails_PF.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1235467891);
		long number2 = rnd.nextInt(328225691);
		ObjectsReporsitory.statutoryDetails_PF.sendKeys("" + RandomString.make(5) + number1 + number2);
		System.out.println("PF Number :" + ObjectsReporsitory.statutoryDetails_PF.getAttribute("value"));

	}
	
	@Then("^Verify User can able to upload attachment for PF$")
	public static void Verify_User_can_able_to_upload_attachment_for_PF() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_PF));
		ObjectsReporsitory.Upload_PF.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("PF Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add UAN No$")
	public static void Verify_User_can_able_to_Add_UAN_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_UAN));
		ObjectsReporsitory.statutoryDetails_UAN.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(3281);
		ObjectsReporsitory.statutoryDetails_UAN.sendKeys("" + number1 + number2);
		System.out.println("UAN Number :" + ObjectsReporsitory.statutoryDetails_UAN.getAttribute("value"));

	}
	@Then("^Verify User can able to upload attachment for UAN$")
	public static void Verify_User_can_able_to_upload_attachment_for_UAN() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_UAN));
		ObjectsReporsitory.Upload_UAN.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("UAN Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	@Then("^Verify User can able to Add ESI No$")
	public static void Verify_User_can_able_to_Add_ESI_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_ESI));
		ObjectsReporsitory.statutoryDetails_ESI.clear();

		Random rnd = new Random();
		long number1 = rnd.nextInt(1234567892);
		long number2 = rnd.nextInt(328525641);
		ObjectsReporsitory.statutoryDetails_ESI.sendKeys("" + number1 + number2);
		System.out.println("ESI Number :" + ObjectsReporsitory.statutoryDetails_ESI.getAttribute("value"));

	}
	
	@Then("^Verify User can able to upload attachment for ESI$")
	public static void Verify_User_can_able_to_upload_attachment_for_ESI() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Upload_ESI));
		ObjectsReporsitory.Upload_ESI.click();
		Thread.sleep(5000);
		Basic.Upload_Document();
		System.out.println("ESI Document Upload Successfully");
		System.out.println("-------------------------------------");
	}

	// ****************


	@Then("^Verify User can able save Statutory Details$")
	public static void Verify_User_can_able_save_Statutory_Details() throws Throwable {

		
		Actions actions102 = new Actions(DriverFactory.driver);
		actions102.moveToElement(ObjectsReporsitory.Bank_Header);
		actions102.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.statutoryDetails_save));
		ObjectsReporsitory.statutoryDetails_save.click();
		Screenshot.Screenshotforscenario();

		Basic.popup_handle();

	}

	@Then("^Verify User can able Add PF Nominee Details$")
	public static void Verify_User_can_able_Add_PF_Nominee_Details() throws Throwable {
		// Name
		Actions actions103 = new Actions(DriverFactory.driver);
		actions103.moveToElement(ObjectsReporsitory.statutoryDetails_PFNominee_Header);
		actions103.perform();
		ObjectsReporsitory.statutory_Add_PF_Nominee.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name
				.sendKeys(ConfigFileReader.getPF_Nominee_Name1() + " " + RandomString.make(10));
		System.out.println("PF Nominee Name1 :" + ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value"));
		// Relationship
		ObjectsReporsitory.statutory_PF_Nominee_Relationship.click();
		Thread.sleep(5000);
		List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;

		if (ConfigFileReader.getPF_Nominee_Relation_values().contains("Random")) {
			System.out.println("Selecting Random PF Nominee Relation");
			Random rand56456456 = new Random();
			int PF_Nominee_Relation = rand56456456.nextInt(ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR.size());
			Selected_PF_Nominee_Relation = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR
					.get(PF_Nominee_Relation).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_PF_Nominee_Relation)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Selected PF Nominee Relation");
					break;
				}
			}

		}

		else {

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getPF_Nominee_Relation1())) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Relationship Selected1 : " + ConfigFileReader.getPF_Nominee_Relation1());
					break;
				}
			}
		}
		// Percentage
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys(ConfigFileReader.getPF_Nominee_Percentage1());
		System.out.println(
				"PF Nominee Percentage1 : " + ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value"));
		ObjectsReporsitory.statutory_PF_Nominee_save.click();
	}

	@Then("^Verify User can able Submit PF Nominee Details$")
	public static void Verify_User_can_able_Submit_PF_Nominee_Details() throws Throwable {
		Actions actions104 = new Actions(DriverFactory.driver);
		actions104.moveToElement(ObjectsReporsitory.Bank_Header);
		actions104.perform();
		ObjectsReporsitory.PFNomieeDetails_save.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
	}

	@Then("^Verify User can able Edit PF Nominee Details_Edit$")
	public static void Verify_User_can_able_Edit_PF_Nominee_Details_Edit() throws Throwable {

		// Add 2nd Nominee

		Actions actions105 = new Actions(DriverFactory.driver);
		actions105.moveToElement(ObjectsReporsitory.statutoryDetails_PFNominee_Header);
		actions105.perform();
		ObjectsReporsitory.statutory_Add_PF_Nominee.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name
				.sendKeys(ConfigFileReader.getPF_Nominee_Name2() + RandomString.make(10));
		System.out.println("PF Nominee Name2 :" + ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value"));
		// Relationship2
		ObjectsReporsitory.statutory_PF_Nominee_Relationship.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getPF_Nominee_Relation2())) {
				webElement.click();
				System.out.println("Relationship Selected2 : " + ConfigFileReader.getPF_Nominee_Relation2());
				break;
			}
		}
		// Percentage2

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys(ConfigFileReader.getPF_Nominee_Percentage2());
		System.out.println(
				"PF Nominee Percentage2 :" + ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value"));
		ObjectsReporsitory.statutory_PF_Nominee_save.click();

		// Add 3rd Nominee
		Actions actions106 = new Actions(DriverFactory.driver);
		actions106.moveToElement(ObjectsReporsitory.statutoryDetails_PFNominee_Header);
		actions106.perform();
		ObjectsReporsitory.statutory_Add_PF_Nominee.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name
				.sendKeys(ConfigFileReader.getPF_Nominee_Name3() + RandomString.make(10));
		System.out.println("PF Nominee Name3 :" + ObjectsReporsitory.statutory_PF_Nominee_Name.getAttribute("value"));
		// Relationship3
		ObjectsReporsitory.statutory_PF_Nominee_Relationship.click();
		List<WebElement> DropdownResult1 = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
		for (WebElement webElement : DropdownResult1) {
			if (webElement.getText().equals(ConfigFileReader.getPF_Nominee_Relation3())) {
				webElement.click();
				System.out.println("Relationship Selected3 : " + ConfigFileReader.getPF_Nominee_Relation3());
				break;
			}
		}
		// Percentage3
		ObjectsReporsitory.statutory_PF_Nominee_Percentage.sendKeys(ConfigFileReader.getPF_Nominee_Percentage3());
		System.out.println(
				"PF Nominee Percentage3 :" + ObjectsReporsitory.statutory_PF_Nominee_Percentage.getAttribute("value"));
		ObjectsReporsitory.statutory_PF_Nominee_save.click();

		// Edit

		ObjectsReporsitory.statutory_PF_Nominee_Edit.click();
		ObjectsReporsitory.statutory_PF_Nominee_Name.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Name
				.sendKeys(ConfigFileReader.getPF_Nominee_Name1_Update() + RandomString.make(10));
		ObjectsReporsitory.statutory_PF_Nominee_Relationship.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Relationship.click();
		List<WebElement> DropdownResult2 = ObjectsReporsitory.statutory_PF_Nominee_Relationship_DR;
		for (WebElement webElement : DropdownResult2) {
			if (webElement.getText().equals(ConfigFileReader.getPF_Nominee_Relation1_Update())) {
				webElement.click();
				System.out.println("Relationship After Edit: " + ConfigFileReader.getPF_Nominee_Relation1_Update());
				break;
			}
		}

		ObjectsReporsitory.statutory_PF_Nominee_Percentage.clear();
		ObjectsReporsitory.statutory_PF_Nominee_Percentage
				.sendKeys(ConfigFileReader.getPF_Nominee_Percentage1_Update());
		ObjectsReporsitory.statutory_PF_Nominee_Edit_save.click();
		Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();

	}

	@Then("^Verify User can able Delete PF Nominee Details$")
	public static void Verify_User_can_able_Delete_PF_Nominee_Details() throws Throwable {

		ObjectsReporsitory.statutory_PF_Nominee_Delete.click();
		Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();

	}

}
