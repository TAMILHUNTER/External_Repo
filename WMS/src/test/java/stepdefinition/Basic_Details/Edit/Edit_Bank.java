package stepdefinition.Basic_Details.Edit;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic;
import stepdefinition.Basic_Details.Create.Bank;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Edit_Bank {

	
	public static Long Current_workmenNumber;
	
	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Bank() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Bank$")
	public static void Select_Workman_and_Navigate_to_Bank_Details() throws Throwable {

		Edit_Statutory.Select_Workman_and_Navigate_to_Statutory_Details();
		ObjectsReporsitory.Induction_bankDetails.click();
		System.out.println("Navigated to Bank");
		Thread.sleep(3000);
	}

	@Then("^Verify User can able to Edit Domestic Account Details_Update$")
	public static void Verify_User_can_able_to_Edit_Domestic_Account_Details_Update() throws Throwable {

		Current_workmenNumber=Long.parseLong(ObjectsReporsitory.Current_workmenNumber.getText().substring(16));
		
		if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").equals("")) {
			System.out.println("Bank details Not Found");
			System.out.println("-----------------------------");
			System.out.println("Creating Bank Record");
			System.out.println("-----------------------------");
			Bank.Verify_user_can_able_to_add_Bank_Account_name();
			Bank.Verify_user_can_able_to_add_Bank_Account_Number();
			Bank.Verify_user_can_able_to_add_Bank_Account_Type();
			Bank.Verify_user_can_able_to_add_Bank_Account_Details();
			//Submit_Workman_Details.Verify_save_and_submit_workman_details();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountName));
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.clear();
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.sendKeys("update" + ConfigFileReader.getBank_AccountName());
			System.out.println("Bank Name:" + ConfigFileReader.getBank_AccountName());
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountNumber));
			Random rnd = new Random();
			long number1 = rnd.nextInt(623);
			long number2 = rnd.nextInt(456);
			long number3 = rnd.nextInt(223);
			long number4 = rnd.nextInt(625);
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.clear();
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.sendKeys("9" + number1 + number2 + number3 + number4);
			System.out.println("Bank Account Number:" + ConfigFileReader.getBank_AccountNumber());
			
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_domestic));
			ObjectsReporsitory.Bank_Account_domestic.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_iFSCCode));
				ObjectsReporsitory.Bank_iFSCCode.click();
				ObjectsReporsitory.Bank_iFSCCode.clear();
				ObjectsReporsitory.Bank_iFSCCode.click();
				ObjectsReporsitory.Bank_iFSCCode.sendKeys(ConfigFileReader.getBank_IFSC_Code_Half_update());
				Thread.sleep(2000);
				List<WebElement> DropdownResult = ObjectsReporsitory.Bank_iFSCCode_Result_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().contains(ConfigFileReader.getBank_IFSC_Code_full_update())) {
						webElement.click();
						System.out.println("IFSC Code Updated:" + ConfigFileReader.getBank_IFSC_Code_full_update());
						break;
					}
				}
			
			

		} else {
		
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountName));
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.clear();
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.sendKeys("update" + ConfigFileReader.getBank_AccountName());
			System.out.println("Bank Name:" + ConfigFileReader.getBank_AccountName());
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountNumber));
			Random rnd = new Random();
			long number1 = rnd.nextInt(623);
			long number2 = rnd.nextInt(456);
			long number3 = rnd.nextInt(223);
			long number4 = rnd.nextInt(625);
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.clear();
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.sendKeys("9" + number1 + number2 + number3 + number4);
			System.out.println("Bank Account Number:" + ConfigFileReader.getBank_AccountNumber());
			
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_domestic));
			ObjectsReporsitory.Bank_Account_domestic.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_iFSCCode));
				ObjectsReporsitory.Bank_iFSCCode.click();
				ObjectsReporsitory.Bank_iFSCCode.clear();
				ObjectsReporsitory.Bank_iFSCCode.click();
				ObjectsReporsitory.Bank_iFSCCode.sendKeys(ConfigFileReader.getBank_IFSC_Code_Half_update());
				Thread.sleep(2000);
				List<WebElement> DropdownResult = ObjectsReporsitory.Bank_iFSCCode_Result_DR;
				for (WebElement webElement : DropdownResult) {
					if (webElement.getText().contains(ConfigFileReader.getBank_IFSC_Code_full_update())) {
						webElement.click();
						System.out.println("IFSC Code Updated:" + ConfigFileReader.getBank_IFSC_Code_full_update());
						break;
					}
				}
			
		}

		Actions actions10322 = new Actions(DriverFactory.driver);
		actions10322.moveToElement(ObjectsReporsitory.Bank_Header);
		actions10322.perform();
		ObjectsReporsitory.saveSubmit.click();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		DataBaseConnection.getbankaccountdetails(Current_workmenNumber);
		

	}

	

	@Then("^Verify user can be able to change bank account type$")
	public static void Verify_User_can_able_to_Edit_bank_account_type() throws Throwable {

		if (ObjectsReporsitory.Bank_Account_domestic.isSelected() == true) {

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_international));
			ObjectsReporsitory.Bank_Account_international.click();

		} else if (ObjectsReporsitory.Bank_Account_international.isSelected() == true) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_domestic));
			ObjectsReporsitory.Bank_Account_domestic.click();
		}

		System.out.println("Bank Account Type Changed");

	}

	@Then("^Verify User can able to Edit International Bank Type Swift$")
	public static void Verify_User_can_able_to_Edit_International_Bank_Type_Swift() throws Throwable {

		if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").equals("")) {
			Bank.Verify_user_can_able_to_add_Bank_Account_name();
			Bank.Verify_user_can_able_to_add_Bank_Account_Number();
			Bank.Verify_user_can_able_to_add_Bank_Account_Type();
			Bank.Verify_user_can_able_to_add_Bank_Account_Details();
			//Submit_Workman_Details.Verify_save_and_submit_workman_details();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountName));
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.clear();
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.sendKeys("update" + ConfigFileReader.getBank_AccountName());
			System.out.println("Bank Name:" + ConfigFileReader.getBank_AccountName());
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountNumber));
			Random rnd = new Random();
			long number1 = rnd.nextInt(623);
			long number2 = rnd.nextInt(456);
			long number3 = rnd.nextInt(223);
			long number4 = rnd.nextInt(625);
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.clear();
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.sendKeys("9" + number1 + number2 + number3 + number4);
			System.out.println("Bank Account Number:" + ConfigFileReader.getBank_AccountNumber());
		}
		else {
			
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_international));
		ObjectsReporsitory.Bank_Account_international.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_International_sWIFT));
		ObjectsReporsitory.Bank_International_sWIFT.click();

		ObjectsReporsitory.Bank_International_sWIFTCode.click();
		ObjectsReporsitory.Bank_International_sWIFTCode.clear();
		ObjectsReporsitory.Bank_International_sWIFTCode.click();
		ObjectsReporsitory.Bank_International_sWIFTCode
				.sendKeys(ConfigFileReader.getBank_International_SWIFTCode_Half());
		}
//		No Data Found 

//		Actions actions10322 = new Actions(DriverFactory.driver);
//		actions10322.moveToElement(ObjectsReporsitory.Bank_Header);
//		actions10322.perform();
//		ObjectsReporsitory.saveSubmit.click();
//		Screenshot.Screenshotforscenario();
//		Basic.popup_handle();
	}

	@Then("^Verify User can able to Edit International Bank Type IBAN$")
	public static void Verify_User_can_able_to_Edit_International_Bank_Type_IBAN() throws Throwable {

		if (ObjectsReporsitory.Bank_AccountName.getAttribute("value").equals("")) {
			Bank.Verify_user_can_able_to_add_Bank_Account_name();
			Bank.Verify_user_can_able_to_add_Bank_Account_Number();
			Bank.Verify_user_can_able_to_add_Bank_Account_Type();
			Bank.Verify_user_can_able_to_add_Bank_Account_Details();
			//Submit_Workman_Details.Verify_save_and_submit_workman_details();

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountName));
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.clear();
			ObjectsReporsitory.Bank_AccountName.click();
			ObjectsReporsitory.Bank_AccountName.sendKeys("update" + ConfigFileReader.getBank_AccountName());
			System.out.println("Bank Name:" + ConfigFileReader.getBank_AccountName());
			
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_AccountNumber));
			Random rnd = new Random();
			long number1 = rnd.nextInt(623);
			long number2 = rnd.nextInt(456);
			long number3 = rnd.nextInt(223);
			long number4 = rnd.nextInt(625);
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.clear();
			ObjectsReporsitory.Bank_AccountNumber.click();
			ObjectsReporsitory.Bank_AccountNumber.sendKeys("9" + number1 + number2 + number3 + number4);
			System.out.println("Bank Account Number:" + ConfigFileReader.getBank_AccountNumber());
		}
		else {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_Account_international));
		ObjectsReporsitory.Bank_Account_international.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bank_International_iBAN));
		ObjectsReporsitory.Bank_International_iBAN.click();

		ObjectsReporsitory.Bank_International_iBANCode.click();
		ObjectsReporsitory.Bank_International_iBANCode.clear();
		ObjectsReporsitory.Bank_International_iBANCode.click();
		ObjectsReporsitory.Bank_International_iBANCode.sendKeys(ConfigFileReader.getBank_International_IBANCode_Half());
		}
//		No Data Found	

//		Actions actions10322 = new Actions(DriverFactory.driver);
//		actions10322.moveToElement(ObjectsReporsitory.Bank_Header);
//		actions10322.perform();
//		ObjectsReporsitory.saveSubmit.click();
//		Screenshot.Screenshotforscenario();
//		Basic.popup_handle();

	}

}