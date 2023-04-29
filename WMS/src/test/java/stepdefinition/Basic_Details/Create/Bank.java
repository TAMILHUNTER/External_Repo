package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import io.cucumber.java.en.Given;
import java.util.List;
import java.util.Random;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;

public class Bank {

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Bank() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner Personal communication Skill Deployment Education Experience Statutory details then navigate to bank$")
	public static void Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_Statutory_details_then_navigate_to_bank()
			throws Throwable {

		Statutory.Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_details_then_navigate_to_Statutory();
		Statutory.Verify_User_can_able_to_Add_Aadhaar();
		Statutory.Verify_User_can_able_to_upload_attachment_for_Aadhaar();
		Statutory.Verify_User_Can_able_to_Add_Driving_License();
		Statutory.Verify_User_can_able_to_upload_attachment_for_Driving_License();
		Statutory.Verify_User_can_able_to_add_Driving_License_expiry();
		Statutory.Verify_User_can_able_to_Add_PAN_card();
		Statutory.Verify_User_can_able_to_upload_attachment_for_PAN_card();
		Statutory.Verify_User_can_able_to_Add_Workpermit_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_Workpermit();
		Statutory.Verify_User_can_able_to_Add_Workpermit_expiry();
		Statutory.Verify_User_can_able_to_Add_Labourcard_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_Labourcard();
		Statutory.Verify_User_can_able_to_Add_Labourcard_expiry();
		Statutory.Verify_User_can_able_to_Add_VisaProID();
		Statutory.Verify_User_can_able_to_upload_attachment_for_VisaProID();
		Statutory.Verify_User_can_able_to_Add_Visa_number();
		Statutory.Verify_User_can_able_to_upload_attachment_for_visa();
		Statutory.Verify_User_can_able_to_Add_PF_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_PF();
		Statutory.Verify_User_can_able_to_Add_UAN_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_UAN();
		Statutory.Verify_User_can_able_to_Add_ESI_No();
		Statutory.Verify_User_can_able_to_upload_attachment_for_ESI();
		Statutory.Verify_User_can_able_save_Statutory_Details();
		Statutory.Verify_User_can_able_Add_PF_Nominee_Details();
		Statutory.Verify_User_can_able_Submit_PF_Nominee_Details();
		ObjectsReporsitory.Induction_bankDetails.click();
		System.out.println("Navigated to Bank");
		Thread.sleep(3000);

	}

	@Then("^Verify user can able to add Bank Account name$")
	public static void Verify_user_can_able_to_add_Bank_Account_name() throws Throwable {
		ObjectsReporsitory.Bank_AccountName.sendKeys(ConfigFileReader.getBank_AccountName()+RandomString.make(5));
		System.out.println("Bank Name:" + ObjectsReporsitory.Bank_AccountName.getAttribute("value"));

	}

	@Then("^Verify user can able to add Bank Account Number$")
	public static void Verify_user_can_able_to_add_Bank_Account_Number() throws Throwable {
		Random rnd = new Random();
		long number1 = rnd.nextInt(623);
		long number2 = rnd.nextInt(456);
		long number3 = rnd.nextInt(223);
		long number4 = rnd.nextInt(625);
		ObjectsReporsitory.Bank_AccountNumber.sendKeys("9" + number1 + number2 + number3 + number4);
		System.out.println("Bank Account Number:" + ObjectsReporsitory.Bank_AccountNumber.getAttribute("value"));

	}

	@Then("^Verify user can able to add Bank Account Type$")
	public static void Verify_user_can_able_to_add_Bank_Account_Type() throws Throwable {
		if (ConfigFileReader.getBank_Account_Type().equals("Domestic")) {
			ObjectsReporsitory.Bank_Account_domestic.click();
			System.out.println("Bank Account Type:" + ConfigFileReader.getBank_Account_Type());
		} else if (ConfigFileReader.getBank_Account_Type().equals("International")) {
			ObjectsReporsitory.Bank_Account_international.click();
			System.out.println("Bank Account Type:" + ConfigFileReader.getBank_Account_Type());
		}
	}

	@Then("^Verify user can able to add Bank Account Details$")
	public static void Verify_user_can_able_to_add_Bank_Account_Details() throws Throwable {
		if (ConfigFileReader.getBank_Account_Type().equals("Domestic")) {
			ObjectsReporsitory.Bank_iFSCCode.sendKeys(ConfigFileReader.getBank_IFSC_Code_Half());
			Thread.sleep(2000);
			List<WebElement> DropdownResult = ObjectsReporsitory.Bank_iFSCCode_Result_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getBank_IFSC_Code_full())) {
					webElement.click();
					System.out.println("IFSC Code:" + ConfigFileReader.getBank_IFSC_Code_full());
					break;
				}
			}
		} else if (ConfigFileReader.getBank_Account_Type().equals("International")) {
			System.out.println("Selected Bank Account Type As:" + ConfigFileReader.getBank_Account_Type());
			if (ConfigFileReader.getBank_InterNationalType().equals("IBAN")) {
				ObjectsReporsitory.Bank_International_iBAN.click();
				ObjectsReporsitory.Bank_International_iBANCode
						.sendKeys(ConfigFileReader.getBank_International_IBANCode_Half());
				// Need to implement for dropdown values select
			} else if (ConfigFileReader.getBank_InterNationalType().equals("SWIFT")) {
				ObjectsReporsitory.Bank_International_sWIFT.click();
				ObjectsReporsitory.Bank_International_sWIFTCode
						.sendKeys(ConfigFileReader.getBank_International_SWIFTCode_Half());
				// Need to implement for dropdown values select
			}
		}
	}
}
