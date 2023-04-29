package stepdefinition.FAS_Cash_and_Bank_Voucher.FAS_CBV_Cash_and_Bank_Enhancements;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Sneha.FinancePageObjects;
import stepdefinition.Commoncontrol;
import stepdefinition.Webdriver;

public class Finance_Cash_and_Bank {
	static String DocumentGeneratedID;
//	private static final Class String.Class = null;
	// private static final String JavascriptExecutor = null;
	// public static WebDriver driver;
	public static ConfigFileReader configFileReader;
	static String DocNumber, selectedRegisterType;
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 20);

	// TEST
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;

	public Finance_Cash_and_Bank() {
		PageFactory.initElements(Webdriver.driver, FinancePageObjects.class);

	}

	@Given("^Go to Test Environment$")
	public static void Login() throws InterruptedException {
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());

	}

	@Then("^Select otheruser in EIP40 login page")
	public void Select_otheruser_in_EIP40_login_page() throws Throwable {
		Thread.sleep(900);

		try {
			FinancePageObjects.MUotheruser.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.MUotheruser);

		}
		System.out.println("Select otheruser in EIP40 login page");

	}

	@Then("^Enter Username in EIP40 login page")
	public void Enter_Username_in_EIP40_login_page() throws Throwable {
		Thread.sleep(500);

		FinancePageObjects.TBUsername.sendKeys(ConfigFileReader.getEnter_FIN_Username());

		System.out.println("Enter Username in EIP40 login page");

	}

	@Then("^Enter Password in EIP40 login page")
	public void Enter_Password_in_EIP40_login_page() throws Throwable {
		Thread.sleep(500);

		FinancePageObjects.TBPassword.sendKeys(ConfigFileReader.getEnter_FIN_Password());

		System.out.println("Enter Password in EIP40 login page");

	}

	@Then("^Select Login Button in EIP40 login page")
	public void Select_Login_Button_in_EIP40_login_page() throws Throwable {
		Thread.sleep(500);

		try {
			FinancePageObjects.BULogin.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BULogin);

		}
		System.out.println("Select Login Button in EIP40 login page");

	}

	@Then("^Select Access Based Menu in EIP40 Home Page")
	public void Select_Access_Based_Menu_in_EIP40_Home_Page() throws Throwable {
		Thread.sleep(1500);

		try {
			FinancePageObjects.MUHomeMenu.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.MUHomeMenu);

		}
		System.out.println("Select Access Based Menu in EIP40 Home Page");

	}

	@Then("^Select Finance in Access Based Menu")
	public void Select_Finance_in_Access_Based_Menu() throws Throwable {
		Thread.sleep(1000);

		assertEquals("Finance", FinancePageObjects.MUFinance.getText());
		System.out.println("FIN Menu = " + FinancePageObjects.MUFinance.getText());
		Thread.sleep(1000);

		try {
			FinancePageObjects.MUFinance.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.MUFinance);

		}
		System.out.println("Select Finance in Access Based Menu");

	}

	@Then("^Select Financial Accounts in Access Based Menu")
	public void Select_Financial_Accounts_in_Access_Based_Menu() throws Throwable {
		Thread.sleep(1000);

		assertEquals("Financial Accounts", FinancePageObjects.MUFinancialAccounts.getText());
		System.out.println("FIN Menu = " + FinancePageObjects.MUFinancialAccounts.getText());
		Thread.sleep(1000);

		try {
			FinancePageObjects.MUFinancialAccounts.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.MUFinancialAccounts);

		}
		System.out.println("Select FinancialAccounts in Access Based Menu");

	}

	@Then("^Select GeneralCashBankRequest in Access Based Menu")
	public void Select_Cash_Bank_Request_in_Access_Based_Menu() throws Throwable {
		Thread.sleep(1000);

		assertEquals("General Cash / Bank Request", FinancePageObjects.MUGeneralCashBankRequest.getText());
		System.out.println("FIN Menu = " + FinancePageObjects.MUGeneralCashBankRequest.getText());
		Thread.sleep(1000);

		try {
			FinancePageObjects.MUGeneralCashBankRequest.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.MUGeneralCashBankRequest);

		}
		System.out.println("Select GeneralCashBankRequest in Access Based Menu");

	}

	@Then("^Verify whether the Header of General Cash / Bank Request is displayed in FIN Home page")
	public void Verify_whether_the_Header_of_General_Cash_Bank_Request_is_displayed_in_Home_page() throws Throwable {
		Thread.sleep(1000);

		assertEquals("General Cash / Bank Request", FinancePageObjects.TXGeneralCash.getText());
		System.out.println("FIN Menu = " + FinancePageObjects.TXGeneralCash.getText());

		System.out.println("Verified General Cash Bank Request is Matched in FIN Home page");

	}

	@Then("^Verify whether the Menu of For Action is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Menu_of_For_Action_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("For Action", FinancePageObjects.MUForAction.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.MUForAction.getText());

		System.out.println("Verified ForAction Menu is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Menu of In Progress is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Menu_of_In_Progress_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("In Progress", FinancePageObjects.MUInProgress.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.MUInProgress.getText());

		System.out.println("Verified In Progress Menu is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Menu of Approved is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Menu_of_Approved_is_Available_in_General_Cash_Bank_Request_Page() throws Throwable {
		Thread.sleep(1000);

		assertEquals("Approved", FinancePageObjects.MUApproved.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.MUApproved.getText());

		System.out.println("Verified Approved Menu is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Menu of Rejected is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Menu_of_Rejected_is_Available_in_General_Cash_Bank_Request_Page() throws Throwable {
		Thread.sleep(1000);

		assertEquals("Rejected", FinancePageObjects.MURejected.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.MURejected.getText());

		System.out.println("Verified Rejected Menu is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Menu of Paid and Received is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Menu_of_Paid_and_Received_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Paid/Received", FinancePageObjects.MUPaidReceived.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.MUPaidReceived.getText());

		System.out.println("Verified Paid and Received Menu is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Menu of All is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Menu_of_All_is_Available_in_General_Cash_Bank_Request_Page() throws Throwable {
		Thread.sleep(1000);

		assertEquals("All", FinancePageObjects.MUAll.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.MUAll.getText());

		System.out.println("Verified All Menu is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Text of Details is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_of_Details_is_Available_in_General_Cash_Bank_Request_Page() throws Throwable {
		Thread.sleep(1000);

		assertEquals("Details", FinancePageObjects.TXDetails.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.TXDetails.getText());

		System.out.println(
				"Verified Click Search or Refresh button to retrieve data is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Document No is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Document_No_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Document No.", FinancePageObjects.CLNDocumentNo.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNDocumentNo.getText());

		System.out.println("Verified Column Name of Document No is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Remarks is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Remarks_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Remarks", FinancePageObjects.CLNRemarks.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNRemarks.getText());

		System.out.println("Verified Column Name of Remarks is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Document Type is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Document_Type_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Document Type", FinancePageObjects.CLNDocumentType.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNDocumentType.getText());

		System.out.println("Verified Column Name of Document Type is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Currency is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Currency_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Currency", FinancePageObjects.CLNCurrency.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNCurrency.getText());

		System.out.println("Verified Column Name of Currency is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Total Amount is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Total_Amount_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Total Amount", FinancePageObjects.CLNTotalAmount.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNTotalAmount.getText());

		System.out.println("Verified Column Name of Total Amount is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Mode is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Mode_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Mode", FinancePageObjects.CLNMode.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNMode.getText());

		System.out.println("Verified Column Name of Mode is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Favouring is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Favouring_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Favouring", FinancePageObjects.CLNFavouring.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNFavouring.getText());

		System.out.println("Verified Column Name of Favouring is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Status is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Status_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Status", FinancePageObjects.CLNStatus.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNStatus.getText());

		System.out.println("Verified Column Name of Status is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Due Date is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Due_Date_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Due Date", FinancePageObjects.CLNDueDate.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNDueDate.getText());

		System.out.println("Verified Column Name of Due Date is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of BR Date is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_BR_Date_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("BR Date", FinancePageObjects.CLNBRDate.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNBRDate.getText());

		System.out.println("Verified Column Name of BR Date is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Lock Status is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Lock_Status_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Lock Status", FinancePageObjects.CLNLockStatus.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNLockStatus.getText());

		System.out.println("Verified Column Name of Lock Status is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Column Name of Allocation Status is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Column_Name_of_Allocation_Status_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Allocation Status", FinancePageObjects.CLNAllocationStatus.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.CLNAllocationStatus.getText());

		System.out.println("Verified Column Name of Allocation Status is matched in General Cash Bank Request Page");

	}

	@Then("^Select Create Button in General Cash Bank Request Page")
	public void Select_Create_Button_in_General_Cash_Bank_Request_Page() throws Throwable {

		if (!FinancePageObjects.BUCreate.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUCreate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUCreate);

		}
		System.out.println("Select Create Button in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Text of Create Request is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_of_Create_Request_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Create Request", FinancePageObjects.TXCreateRequest.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.TXCreateRequest.getText());

		System.out.println("Verified Text of Create Request is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Text of  Register Details  is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_of_Register_Details_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Register Details", FinancePageObjects.TXRegisterDetails.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.TXRegisterDetails.getText());

		System.out.println("Verified Text of Register Details is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Text of  Page Details  is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_of_Page_Details_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Details", FinancePageObjects.TXPageDetails.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.TXPageDetails.getText());

		System.out.println("Verified Text of Page Details is matched in General Cash Bank Request Page");

	}

	@Then("^Select Job Cart in General Cash Bank Request Page")
	public void Select_Job_Cart_in_General_Cash_Bank_Request_Page() throws Throwable {

		if (!FinancePageObjects.BUJobCart.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUJobCart.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUJobCart);

		}
		System.out.println("Select Job Cart in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Text of Job Cart is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_of_Job_Cart_is_Available_in_General_Cash_Bank_Request_Page() throws Throwable {
		Thread.sleep(1000);

		assertEquals("Job Cart", FinancePageObjects.TXJobCart.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.TXJobCart.getText());

		System.out.println("Verified Text of Job Cart is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Header of Job Cart is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_Header_of_Job_Cart_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Job Cart", FinancePageObjects.HDJobCart.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.HDJobCart.getText());

		System.out.println("Verified the Header of Job Cart is matched in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Header of Selected Items is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_Header_of_Selected_Items_is_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Selected Items", FinancePageObjects.HDSelectedItems.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.HDSelectedItems.getText());

		System.out.println("Verified the Header of Selected Items is matched in General Cash Bank Request Page");

	}

	@Then("^Select Post Button in General Cash Bank Request Page")
	public void Select_Post_Button_in_General_Cash_Bank_Request_Page() throws Throwable {

		if (!FinancePageObjects.BUPost.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUPost.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUPost);

		}
		System.out.println("Select Post Button in General Cash Bank Request Page");

	}

	@Then("^Verify whether the Text of Validation Message is Available in General Cash Bank Request Page")
	public void Verify_whether_the_Text_Validation_Messageis_Available_in_General_Cash_Bank_Request_Page()
			throws Throwable {
		Thread.sleep(1000);

		assertEquals("Please select atleast one item in the cart", FinancePageObjects.TXValidationMessage.getText());
		System.out.println("FIN CashAndBankPage = " + FinancePageObjects.TXValidationMessage.getText());

		System.out.println("Verified the Validation Message is matched in General Cash Bank Request Page");

	}

	@Then("^Select OK Button in General Cash Bank Request Page")
	public void Select_OK_Button_in_General_Cash_Bank_Request_Page() throws Throwable {

		if (!FinancePageObjects.BUOK.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUOK.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUOK);

		}
		System.out.println("Select OK Button in General Cash Bank Request Page");

	}

	@Then("^Select Close Icon to close the Job Cart")
	public void Select_Close_Icon_to_close_the_Job_Cart() throws Throwable {

		if (!FinancePageObjects.BUClose.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUClose.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUClose);

		}
		System.out.println("Select Close Icon to close the Job Cart");

	}

	@Then("^Select Upload Document in General Cash Bank Request Page")
	public void Select_Upload_Document_in_General_Cash_Bank_Request_Page() throws Throwable {

		if (!FinancePageObjects.BUUploadDocumentIcon.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUUploadDocumentIcon.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUUploadDocumentIcon);

		}
		System.out.println("Select Upload Document in General Cash Bank Request Page");

	}

	@Then("^Select Cancel Icon in Upload Document")
	public void Select_Cancel_Icon_in_Upload_Document() throws Throwable {

		if (!FinancePageObjects.BUCancel.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUCancel.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUCancel);

		}
		System.out.println("Select Cancel Icon in Upload Document");

	}

	@Then("^Select Upload Document Button in Attached Document")
	public void Select_Upload_Document_Button_in_Attached_Document() throws Throwable {

		if (!FinancePageObjects.BUUploadDocuments.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUUploadDocuments.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUUploadDocuments);

		}
		System.out.println("Select Upload Document Button in Attached Document");

	}

	@Then("^Select Close Button in Attached Document")
	public void Select_Close_Button_in_Attached_Document() throws Throwable {

		if (!FinancePageObjects.BUCloseUploadDocument.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		try {
			FinancePageObjects.BUCloseUploadDocument.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", FinancePageObjects.BUCloseUploadDocument);

		}
		System.out.println("Select Close Button in Attached Document");

	}

	@Then("^Select Document type in General Cash Bank Request Page")
	public void Select_Document_type_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(1000);

		FinancePageObjects.DocumentType.click();

		List<WebElement> selectEP = FinancePageObjects.LIDocumentType;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getDocument_Type1_FIN())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
		}
	}

	@Then("^Select Register Type in General Cash Bank Request Page")
	public void Select_Register_Type_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(1000);

		FinancePageObjects.RegisterType.click();

		List<WebElement> selectEP = FinancePageObjects.LIRegisterType;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getRegister_Type1_FIN())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
		}
	}

	@Then("^Select Job Code in General Cash Bank Request Page")
	public void Select_Job_Code_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.ClearJobCode.click();
		Thread.sleep(500);
		FinancePageObjects.JobCode.sendKeys(ConfigFileReader.getJob_Code_FIN());
		Thread.sleep(1000);
		FinancePageObjects.ClickJobCode.click();

	}
	
	@Then("^Select Accounting Center in General Cash Bank Request Page")
	public void Select_Accounting_Center_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.ClearAccountingCenter.click();
		Thread.sleep(2000);
		FinancePageObjects.AccountingCenter.sendKeys(ConfigFileReader.getAccountingCenterFIN());
		Thread.sleep(1000);
		FinancePageObjects.ClickAccountingCenter.click();

	}
	
	@Then("^Select Voucher Amount in General Cash Bank Request Page")
	public void Select_Voucher_Amount_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.ClearVoucherAmount.click();
		Thread.sleep(2000);
		FinancePageObjects.VoucherAmount.sendKeys(ConfigFileReader.getVoucherAmountFIN());
		
	}
	
	@Then("^Select Favouring in General Cash Bank Request Page")
	public void Select_Favouring_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.Favouring.click();
		Thread.sleep(2000);
		FinancePageObjects.Favouring.sendKeys(ConfigFileReader.getFavouringFIN());
		
	}
	
	
	@Then("^Select Purpose in General Cash Bank Request Page")
	public void Select_Purpose_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.Purpose.click();
		Thread.sleep(2000);
		FinancePageObjects.Purpose.sendKeys(ConfigFileReader.getPurposeFIN());
	}
	
	
	@Then("^Select Mode in General Cash Bank Request Page")
	public void Select_Mode_in_General_Cash_Bank_Request_Page() throws Throwable {


		Thread.sleep(1000);

		FinancePageObjects.ModeType.click();

		List<WebElement> selectEP = FinancePageObjects.LIModeTypeCheque;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getModeTypeChequeFIN())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
		}
	}
	
	@Then("^Select Due Date in General Cash Bank Request Page")
	public void Select_Due_Date_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.CalendarIcon.click();
		Thread.sleep(2000);
		//FinancePageObjects.Mode.sendKeys(ConfigFileReader.getClickModeTypeChequeFIN());
		//Thread.sleep(1000);
		FinancePageObjects.SelectTodayDate.click();
		
	}
	
	
	@Then("^Select Job Cart Icon in General Cash Bank Request Page")
	public void Select_Job_Cart_Icon_in_General_Cash_Bank_Request_Page() throws Throwable {

		Thread.sleep(500);

		FinancePageObjects.ClickJobCart.click();
		Thread.sleep(2000);
		
		FinancePageObjects.EnterJobCode.click();
		Thread.sleep(500);
		
		FinancePageObjects.EnterJobCode.sendKeys(ConfigFileReader.getEnterJobCodeFIN(), Keys.TAB);
		Thread.sleep(500);
		
		FinancePageObjects.SelectJobCode.click();
		Thread.sleep(500);

		FinancePageObjects.SelectArrow.click();
		Thread.sleep(500);
		
		FinancePageObjects.ClickPostButton.click();
		Thread.sleep(500);
		
		
		
	}
	
	
	
	
	
	

//********************************************************************************************************************************//	
	// Common Control

	@Then("^EIP 4 0 Login Page")
	public void EIP_4_0_Login_Page() throws Throwable {
		Thread.sleep(1000);

		Commoncontrol.EIPLoginPage();

		System.out.println("Navigate to General Cash Bank Request Page Successfully");

	}

	@Then("^Navigate to General Cash Bank Request Page")
	public void Navigate_to_General_Cash_Bank_Request_Page() throws Throwable {
		Thread.sleep(1000);

		Commoncontrol.NavigateToGeneralCashBankRequest();

		System.out.println("Navigate to General Cash Bank Request Page Successfully");

	}
}

/*
 * @Then("^Select Document type in General Cash Bank Request Page") public void
 * Select_Document_type_in_General_Cash_Bank_Request_Page() throws Throwable {
 * 
 * Thread.sleep(1000);
 * 
 * FinancePageObjects.DocumentType.click();
 * 
 * 
 * 
 * List<WebElement> selectEP = FinancePageObjects.LIDocumentType; for
 * (WebElement webElement : selectEP) { if
 * (webElement.getText().equals(ConfigFileReader.getDocument_Type_FIN())) {
 * webElement.click(); // System.out.println(webElement.getText()); break;
 * 
 * } } } }
 */
