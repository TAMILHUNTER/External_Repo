package stepdefinition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

import config.ConfigFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import object_repository.CostingProcessRequest;
import object_repository.EIPMenu;
import object_repository.GeneralMasters_Create;
import object_repository.Login;
import object_repository.OrderMaster;
import object_repository.PDSSMenu;
import object_repository.ProductMaster;
import object_repository.ProductionBOM;

public class PDSS extends Common {

	// Read Configuration
	public static ConfigFileReader reader;
	DataBaseConnection dbc = new DataBaseConnection();

	public PDSS() {
		PageFactory.initElements(Webdriver.driver, Login.class);
		PageFactory.initElements(Webdriver.driver, EIPMenu.class);
		PageFactory.initElements(Webdriver.driver, PDSSMenu.class);
		PageFactory.initElements(Webdriver.driver, ProductMaster.class);
		PageFactory.initElements(Webdriver.driver, ProductionBOM.class);
		PageFactory.initElements(Webdriver.driver, OrderMaster.class);
		PageFactory.initElements(Webdriver.driver, CostingProcessRequest.class);
		PageFactory.initElements(Webdriver.driver, GeneralMasters_Create.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 20);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
	public static Actions actions = new Actions(Webdriver.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Go to Test Environment$")
	public static void Login() throws InterruptedException {
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());

	}

	@Then("Click on Other User")
	public void click_on_Other_User() throws Throwable {

		clickElement(Login.Otheruser);

	}

	@Then("^Enter the Username as (.*)$")
	public void enter_the_Username(String Username) throws Throwable {

		enterTestData(Login.Username, Username);

	}

	@Then("^Enter the Password$")
	public void enter_the_Password() throws Throwable {
		Login.Password.sendKeys(ConfigFileReader.getPassword());

	}

	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable {

		clickElement(Login.Login);

	}

	@Then("^Click on Access Based Menu$")
	public void click_on_Access_Based_Menu() throws Throwable {

		clickElement(EIPMenu.Menu);
	}

	@And("Enter the Order Number in Product Master Create Page")
	public void Enter_the_Order_Number() throws Throwable {

		DataBaseConnection.dataBaseConnectionPDSS(
				"SELECT top 1 shjo.HJORD_Order_Number,* FROM PDSSAL.SAL_H_Job_Orders shjo WHERE shjo.HJORD_MU_Code=1649 AND shjo.HJORD_DS_Code=3 ORDER BY shjo.HJORD_Inserted_On DESC");
		String everything;
		BufferedReader br = new BufferedReader(new FileReader("./reference/DbOutPut.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();

		}

		Thread.sleep(5000);
		enterTestData(ProductMaster.ProductMasterCreateOrderNumber, everything);
		clickElement(ProductMaster.ProductMasterSelectOrderNumber);

	}

	@And("Enter the Order Number for BOM as (.*)")
	public void Enter_Order_Number(String Order) throws Throwable {
		Thread.sleep(4000);
		// wait.until(ExpectedConditions.urlContains("Create"));
		enterTestData(ProductMaster.ProductMasterCreateOrderNumber, Order);
		clickElement(ProductMaster.ProductMasterSelectOrderNumber);
	}

	@And("Enter the Order Number in Product Master Edit Page as (.*)")
	public void Enter_the_Edit_Order_Number(String Order) throws Throwable {

		enterTestData(ProductMaster.ProductMasterEditOrderNumber, Order);

		clickElement(ProductMaster.ProductMasterSelectOrderNumber);
	}

	@Then("^Click on PDSS$")
	public void click_on_pdss() throws Throwable {
		clickElement(EIPMenu.PDSS);
	}

	@Then("^Click on Business apps$")
	public void click_on_Business_apps() throws Throwable {
		clickElement(EIPMenu.BusinessApps);
	}

	@Then("Select the Parent Product")
	public void selectParentProduct() throws Throwable {

		clickElement(ProductMaster.ProductMasterClickParentProduct);
		clickElement(ProductMaster.ProductMasterSelectParentProduct);

	}

	@Then("Close the Success Message and Call Planning API")
	public void callAPI() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(OrderMaster.OrderSuccess));
		String OrderSuccess = OrderMaster.OrderSuccess.getText();
		String[] newStr = OrderSuccess.split(" ");
		String Order = newStr[2];
		System.out.println(newStr[2]);

		FileOutputStream file = new FileOutputStream("./reference/CustomerProduct.txt");
		byte[] strToBytes = Order.getBytes();
		file.write(strToBytes);
		file.close();
		if (OrderMaster.OrderSuccess.getText().contains("Created Successfully")) {

			clickElement(ProductMaster.CloseProductMasterCreateSuccessMessage);
		}
	}

	@Then("Close the API Success Message")
	public void closeAPISuccess() throws Throwable {

		clickElement(ProductMaster.CloseProductMasterAPISuccessMessage);
	}

	@Then("^Click on PDSS Menu$")
	public void click_on_PDSSMenu() throws Throwable {
		clickElement(PDSSMenu.PDSSMenu);

	}

	@Then("^Validate whether the user is able to click on Costing$")
	public void click_on_costing() throws Throwable {
		clickElement(PDSSMenu.Costing);
	}

	@Then("^Click on Costing Entry$")
	public void click_on_costingentry() throws Throwable {
		clickElement(PDSSMenu.CostingEntry);
	}

	@Then("Validate whether the user is able to click the Costing Process Request")
	public void click_on_costing_process_request() throws Throwable {

		clickElement(CostingProcessRequest.CostingProcessRequest);

	}

	@Then("^Click on General Masters$")
	public void click_on_general_masters() throws Throwable {
		clickElement(PDSSMenu.GeneralMasters);
	}

	@Then("^Click on Machines$")
	public void click_on_machines() throws Throwable {
		clickElement(PDSSMenu.Machines);
	}

	@Then("^Verify whether the landing page of Machine$")
	public void verify_on_machines() throws Throwable {

		Thread.sleep(5000);

		String currentTitle = Webdriver.driver.getTitle();

		Assert.assertEquals("MOLViewUI", currentTitle);
	}

	@Then("^Click on Create button in the Machine$")
	public void click_on_machines_create() throws Throwable {
		clickElement(GeneralMasters_Create.MachinesCreatePage);
	}

	@Then("^Click on Save button in the Machine$")
	public void click_on_machines_save() throws Throwable {
		clickElement(GeneralMasters_Create.MachinesSaveButton);

	}

	@Then("^Validate the Mandatory field of Description in the Create page of Machine$")
	public void verify_validation_msg_machine() throws Throwable {
		String mandatoryText = GeneralMasters_Create.MachinesValidationPopUp.getText();
		Thread.sleep(3000);
		if (mandatoryText.startsWith("Desc")) {
			System.out.println("Desc is validated");
		}

	}

	@Then("^Validate the Mandatory field of Short Description in the Create page of Machine$")
	public void verify_validation_short_desc_msg_machine() throws Throwable {
		String mandatoryText = GeneralMasters_Create.MachinesValidationPopUp.getText();
		Thread.sleep(3000);
		if (mandatoryText.contains("ShortDesc")) {
			System.out.println("Short Desc is validated");
		}

	}

	@Then("^Validate the Mandatory field of Machine Group in the Create page of Machine$")
	public void verify_validation_machine_group_msg_machine() throws Throwable {
		String mandatoryText = GeneralMasters_Create.MachinesValidationPopUp.getText();
		Thread.sleep(3000);
		if (mandatoryText.contains("Machine Group")) {
			System.out.println("Machine Group is validated");
		}

	}

	@Then("Validate the Title name of Costing Process Landing Page")
	public void verify_Costing_Process_title() throws Throwable {
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.titleContains("Costing Request"));
		String currentTitle = Webdriver.driver.getTitle();

		Assert.assertEquals("Costing Request", currentTitle);

	}

	@Then("Click on Create Request to initiate the Process")
	public void create_costing_request() throws Throwable {

		// wait.until(ExpectedConditions.titleContains("Costing Request"));
		clickElement(CostingProcessRequest.CostingProcessRequestCreate);

	}

	@Then("Click on Confirmation Pop Up to start the Process")
	public void click_yes_costing_request() throws Throwable {

		clickElement(CostingProcessRequest.clickOnConfirmationYesCostingCreate);

	}

	@Then("Click on Create in Product Master")
	public void Click_on_Create_in_Product_Creation() throws Throwable {
		clickElement(ProductMaster.ProductMasterCreate);

	}
	
	@Then("Enter the Description ")
	public void enterDescription() throws Throwable {
		
	}
	
	@Then("Enter the Short Description ")
	public void enterShortDescription() throws Throwable {
		
	}
	
	@Then("Select the Machine Group")
	public void machineGroup() throws Throwable {
		
	}

	@Then("Logout")
	public void logout() throws Throwable {
		Thread.sleep(3000);
		clickElement(ProductMaster.clickProfileLogout);
		Thread.sleep(3000);
		clickElement(ProductMaster.Logout);

	}

	@Then("^Click on Document$")
	public void click_on_Document() throws Throwable {

		clickElement(PDSSMenu.Document);

	}

	@Then("^Click on Order and Sales$")
	public void orderSales() throws Throwable {
		clickElement(PDSSMenu.OrderSales);
	}

	@Then("^Click on Manufacturing Orders$")
	public void orderMaster() throws Throwable {
		clickElement(PDSSMenu.OrderMaster);
	}

	@Then("^Click on Approval in Order Master$")
	public void orderMasterApproval() throws Throwable {
		clickElement(OrderMaster.Approval);
	}

	@Then("^Click on Edit in Order Master$")
	public void orderMasterEdit() throws Throwable {
		clickElement(OrderMaster.Edit);
	}

	@Then("^Click on Cancel in Order Master$")
	public void orderMastercancel() throws Throwable {
		clickElement(OrderMaster.Cancel);
	}

	@Then("^Click on Close in Order Master$")
	public void orderMasterclose() throws Throwable {
		clickElement(OrderMaster.Close);
	}

	@Then("^Enter the Order Number in the Approval Page of Order Master$")
	public void ordernumberapproval() throws Throwable {
		DataBaseConnection.dataBaseConnectionPDSS(
				"SELECT top 1 shjo.HJORD_Order_Number,* FROM PDSSAL.SAL_H_Job_Orders shjo WHERE shjo.HJORD_MU_Code=1649 AND shjo.HJORD_DS_Code=1 ORDER BY shjo.HJORD_Inserted_On DESC");
		String everything;
		BufferedReader br = new BufferedReader(new FileReader("./reference/DbOutPut.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();

		}
		wait.until(ExpectedConditions.elementToBeClickable(OrderMaster.ApprovalOrderNumber));
		enterTestData(OrderMaster.ApprovalOrderNumber, everything);
	}

	@Then("^Enter the Order Number in the Cancel Page of Order Master$")
	public void ordernumbercancel() throws Throwable {
		DataBaseConnection.dataBaseConnectionPDSS(
				"SELECT top 1 shjo.HJORD_Order_Number,* FROM PDSSAL.SAL_H_Job_Orders shjo WHERE shjo.HJORD_MU_Code=1649 AND shjo.HJORD_DS_Code=1");
		String everything;
		BufferedReader br = new BufferedReader(new FileReader("./reference/DbOutPut.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();

		}

		// wait.until(ExpectedConditions.urlContains("Cancel"));
		Thread.sleep(4000);
		enterTestData(OrderMaster.CancelOrderNumber, everything);

	}

	@Then("^Enter the Order Number in the Close Page of Order Master$")
	public void ordernumberclose() throws Throwable {
		DataBaseConnection.dataBaseConnectionPDSS(
				"SELECT top 1 shjo.HJORD_Order_Number,* FROM PDSSAL.SAL_H_Job_Orders shjo WHERE shjo.HJORD_MU_Code=1649 AND shjo.HJORD_DS_Code=3 ORDER BY shjo.HJORD_Inserted_On DESC");
		String everything;
		BufferedReader br = new BufferedReader(new FileReader("./reference/DbOutPut.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();

		}
		Thread.sleep(3000);
		/*
		 * String CurrentUrl = Webdriver.driver.getCurrentUrl(); if
		 * (CurrentUrl.contains("Close")) {
		 * wait.until(ExpectedConditions.elementToBeClickable(OrderMaster.
		 * CloseOrderNumber));
		 */
		enterTestData(OrderMaster.CloseOrderNumber, everything);
		/*
		 * } else { wait.until(ExpectedConditions .urlToBe(
		 * "https://eip4qa.lntecc.com/EIPPDSS/OrderMaster/OM/OMClose/OMCloseFilterUI"));
		 * }
		 */

	}

	@Then("^Select the Order Number in the Approval Page of Order Master$")
	public void selectOrderNmr() throws Throwable {
		clickElement(OrderMaster.SelectApprovalOrderNumber);

	}

	@Then("^Select the Order Number in the Cancel Page of Order Master$")
	public void selectCancelOrderNmr() throws Throwable {
		clickElement(OrderMaster.SelectCancelOrderNumber);

	}

	@Then("^Select the Order Number in the Close Page of Order Master$")
	public void selectCloseOrderNmr() throws Throwable {
		clickElement(OrderMaster.SelectCloseOrderNumber);

	}

	@Then("^Click on Go button in the Approval page of Order Master$")
	public void goApproval() throws Throwable {

		Thread.sleep(4000);
		// wait.until(ExpectedConditions.urlContains("Approval"));
		/*
		 * String Date = "27/04/2019"; clickElement(OrderMaster.orderApprovalFromDate);
		 * WebElement Pre =
		 * Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-prev')])"
		 * )); WebElement Cur =
		 * Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-fast')])"
		 * )); WebElement Next =
		 * Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-next')])"
		 * ));
		 * 
		 * String date_dd_MM_yyyy[] = (Date.split(" ")[0]).split("/"); int yearDiff =
		 * Integer.parseInt(date_dd_MM_yyyy[2]) -
		 * Calendar.getInstance().get(Calendar.YEAR); Cur.click(); if (yearDiff != 0) {
		 * if (yearDiff > 0) { for (int i = 0; i < yearDiff; i++) {
		 * 
		 * Next.click(); } } else if (yearDiff < 0) {
		 * 
		 * for (int i = 0; i < (yearDiff * (-1)); i++) {
		 * 
		 * Pre.click(); } }
		 * 
		 * } Thread.sleep(500); List<WebElement> list_AllMonthToBook =
		 * Webdriver.driver.findElements(By.xpath(
		 * "//div[@id='SearchFilter_FromDate_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"
		 * )); list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) -
		 * 1).click();
		 * 
		 * Thread.sleep(500); List<WebElement> list_AllDateToBook =
		 * Webdriver.driver.findElements(By.xpath(
		 * "//div[@id='SearchFilter_FromDate_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"
		 * )); list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();
		 */

		Thread.sleep(3000);
		clickElement(OrderMaster.GoApproval);

	}

	@Then("^Click on Go button in the Close page of Order Master$")
	public void goClose() throws Throwable {

		Thread.sleep(4000);
		// wait.until(ExpectedConditions.urlContains("Close"));
		String Date = "02/01/2022";
		clickElement(OrderMaster.orderApprovalFromDate);
		WebElement Pre = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-prev')])"));
		WebElement Cur = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-fast')])"));
		WebElement Next = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-next')])"));

		String date_dd_MM_yyyy[] = (Date.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		Cur.click();
		if (yearDiff != 0) {
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {

					Next.click();
				}
			} else if (yearDiff < 0) {

				for (int i = 0; i < (yearDiff * (-1)); i++) {

					Pre.click();
				}
			}

		}
		Thread.sleep(500);
		List<WebElement> list_AllMonthToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='SearchFilter_FromDate_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
		list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(500);
		List<WebElement> list_AllDateToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='SearchFilter_FromDate_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();

		clickElement(OrderMaster.GoClose);

	}

	@Then("^Click on Go button in the Cancel page of Order Master$")
	public void goCancel() throws Throwable {

		Thread.sleep(5000);
		String Date = "27/04/2019";
		clickElement(OrderMaster.orderApprovalFromDate);
		WebElement Pre = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-prev')])"));
		WebElement Cur = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-fast')])"));
		WebElement Next = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-next')])"));

		String date_dd_MM_yyyy[] = (Date.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		Cur.click();
		if (yearDiff != 0) {
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {

					Next.click();
				}
			} else if (yearDiff < 0) {

				for (int i = 0; i < (yearDiff * (-1)); i++) {

					Pre.click();
				}
			}

		}
		Thread.sleep(500);
		List<WebElement> list_AllMonthToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='SearchFilter_FromDate_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
		list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(500);
		List<WebElement> list_AllDateToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='SearchFilter_FromDate_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();
		clickElement(OrderMaster.GoCancel);

	}

	@Then("^Click the Check Box in the Approval Page to Approve the Order$")
	public void selectOrderApprove() throws Throwable {

		clickElementAfterTwoSeconds(OrderMaster.selectCheckBox);

	}

	@Then("^Click the Second Check Box in the Approval Page to Approve the Order$")
	public void selectOrderApproveSecond() throws Throwable {
		clickElement(OrderMaster.selectSecondCheckBox);

	}

	@Then("^Click the Check Box in the Close Page to Approve the Order$")
	public void selectOrderClose() throws Throwable {
		clickElement(OrderMaster.selectCloseCheckBox);

	}

	@Then("^Click the Second Check Box in the Close Page to Approve the Order$")
	public void selectOrderCloseSecond() throws Throwable {
		clickElement(OrderMaster.selectSecondCloseCheckBox);

	}

	@Then("^Click the Check Box in the Cancel Page to Approve the Order$")
	public void selectOrderCancel() throws Throwable {
		clickElement(OrderMaster.selectCancelCheckBox);

	}

	@Then("^Click the Second Check Box in the Cancel Page to Approve the Order$")
	public void selectsecondOrderCancel() throws Throwable {
		clickElement(OrderMaster.selectSecondCancelCheckBox);

	}

	@Then("^Click the Reject Check Box in the Approval Page to Approve the Order$")
	public void selectOrderReject() throws Throwable {
		clickElement(OrderMaster.selectRejectCheckBox);

	}

	@Then("^Click on Submit in the Approval Page of Order Master$")
	public void clickSubmitOrdMas() throws Throwable {
		scrollWebPageDown();

		clickElement(OrderMaster.SubmitApproval);

	}

	@Then("^Click on Submit in the Close Page of Order Master$")
	public void clickSubmitOrdMasClose() throws Throwable {
		scrollWebPageDown();

		clickElement(OrderMaster.SubmitClose);

	}

	@Then("^Validate the validation message gets displayed when the user not selected any order for approval$")
	public void validateMsgApp() throws Throwable {

		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		if (SuccessMsg.equalsIgnoreCase("Please Select Document's to Authorize"))
			;
		// Assert.assertEquals(SuccessMsg, "Please Select Document's to Authorize");
		Thread.sleep(3000);
	}

	@Then("^Click on Submit in the Cancel Page of Order Master$")
	public void clickSubmitOrdMasCancel() throws Throwable {
		scrollWebPageDown();

		clickElement(OrderMaster.SubmitCancel);

	}

	@Then("^Validate the validation message gets displayed when the user is not selected the Check Box$")
	public void validateMsg() throws Throwable {

		String OrderSuccess = OrderMaster.OrderSuccess.getText();
		if (OrderSuccess.equalsIgnoreCase("Please Select Document's to Cancel"))
			;

		Thread.sleep(3000);

	}

	@Then("^Verify the Title for Create Page in Order Master$")
	public void createOrderVerifyTitle() throws Throwable {

		String actualTitle = Webdriver.driver.getTitle();
		System.out.println(actualTitle);

	}

	@Then("^Click on Create in Order Master$")
	public void createOrder() throws Throwable {
		clickElement(PDSSMenu.OrderMasterCreate);
	}

	@Then("^Click on Order Type$")
	public void ClickonOrderType() throws Throwable {
		clickElement(OrderMaster.ClickOrderType);
	}

	@Then("^Select the Order Type$")
	public void SelecttheOrderType() throws Throwable {
		clickElement(OrderMaster.SelectOrderType);
	}

	@Then("^Enter the Order Description as (.*)$")
	public void orderDescription(String Desc) throws Throwable {
		enterTestData(OrderMaster.OrderDescription, Desc);
	}

	@Then("^Enter the Job Code as (.*)$")
	public void JobCode(String JobCode) throws Throwable {
		enterTestData(OrderMaster.EnterJobCode, JobCode);
	}

	@Then("^Select the Job Code$")
	public void selectJobCode() throws Throwable {
		clickElement(OrderMaster.SelectJobCode);
	}

	@Then("^Enter the Customer as (.*)$")
	public void Customer(String Customer) throws Throwable {
		enterTestData(OrderMaster.Customer, Customer);
	}

	@Then("^Select the Customer$")
	public void selectCustomer() throws Throwable {
		clickElement(OrderMaster.selectCustomer);
	}

	@Then("^Click the Customer Branch$")
	public void clickCustomerBranch() throws Throwable {
		clickElement(OrderMaster.ClickCustomerBranch);
	}

	@Then("^Select the Customer Branch$")
	public void selectCustomerBranch() throws Throwable {

		for (int i = 0; i <= 2; i++) {
			try {
				clickStaleElement(OrderMaster.SelectCustomerBranch);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Then("^Enter the Order Reference Number as (.*)$")
	public void orderReferenceNumber(String orderReferenceNumber) throws Throwable {
		enterTestData(OrderMaster.ClientOrderNumber, orderReferenceNumber);
	}

	@Then("^Enter the Tender Reference Number as (.*)$")
	public void tenderReferenceNumber(String Tender) throws Throwable {
		enterTestData(OrderMaster.TenderReferenceNumber, Tender);
	}

	@Then("^Enter the Tender Description as (.*)$")
	public void tenderDesc(String desc) throws Throwable {
		enterTestData(OrderMaster.TenderDescription, desc);
	}

	@Then("^Enter the Our Reference Number as (.*)$")
	public void ourRefN(String desc) throws Throwable {
		enterTestData(OrderMaster.OurRefNumber, desc);
	}

	@Then("^Click on Despatch$")
	public void despatch() throws Throwable {
		clickElement(OrderMaster.ClickDespatch);
	}

	@Then("^Enter the Invoice Message as (.*)$")
	public void invoiceMessage(String desc) throws Throwable {
		enterTestData(OrderMaster.EnterInvoiceMessage, desc);
	}

	@Then("^Click on Ok button of Despatch Pop up$")
	public void okDespatch() throws Throwable {
		clickElement(OrderMaster.DespatchOk);
	}

	@Then("^Click on Commercial$")
	public void commercial() throws Throwable {

		clickStaleElement(OrderMaster.ClickCommercial);

	}

	@Then("^Click on Billing Type$")
	public void billing() throws Throwable {
		Thread.sleep(1300);
		clickStaleElement(OrderMaster.ClickBillingType);

	}

	@Then("^Choose the Billing Type as Direct Billing$")
	public void billingType() throws Throwable {
		Thread.sleep(700);
		clickStaleElement(OrderMaster.ChooseDirectBilling);

	}

	@Then("^Enter the Order Value as (.*)$")
	public void OrderValue(String value) throws Throwable {

		enterTestData(OrderMaster.OrderValue, value);

	}

	@Then("^Click on Ok button of Commercial Pop up$")
	public void okCommercial() throws Throwable {

		clickElement(OrderMaster.CommericialOk);

	}

	@Then("^Change the Order Expiry Date$")
	public void expiryDate() throws Throwable {

		clickElement(OrderMaster.ExpiryDate);
		WebElement Pre = Webdriver.driver.findElement(By.xpath("//a[contains(@class, 'k-nav-prev')]"));
		WebElement Cur = Webdriver.driver.findElement(By.xpath("//a[contains(@class, 'k-nav-fast')]"));
		WebElement Next = Webdriver.driver.findElement(By.xpath("//a[contains(@class, 'k-nav-next')]"));
		String Date = "27/04/2028";
		String date_dd_MM_yyyy[] = (Date.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		Cur.click();
		if (yearDiff != 0) {
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {

					Next.click();
				}
			} else if (yearDiff < 0) {

				for (int i = 0; i < (yearDiff * (-1)); i++) {

					Pre.click();
				}
			}

		}
		Thread.sleep(500);
		List<WebElement> list_AllMonthToBook = Webdriver.driver.findElements(By
				.xpath("//div[@id='JobOrders_ExpiryDate_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
		list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(500);
		List<WebElement> list_AllDateToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='JobOrders_ExpiryDate_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();
	}

	@Then("^Set the Order Expiry Date as (.*)$")
	public void expiryDatee(String Date) throws Throwable {

		clickElement(OrderMaster.ExpiryDate);
		WebElement Pre = Webdriver.driver.findElement(By.xpath("//a[contains(@class, 'k-nav-prev')]"));
		WebElement Cur = Webdriver.driver.findElement(By.xpath("//a[contains(@class, 'k-nav-fast')]"));
		WebElement Next = Webdriver.driver.findElement(By.xpath("//a[contains(@class, 'k-nav-next')]"));

		String date_dd_MM_yyyy[] = (Date.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		Cur.click();
		if (yearDiff != 0) {
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {

					Next.click();
				}
			} else if (yearDiff < 0) {

				for (int i = 0; i < (yearDiff * (-1)); i++) {

					Pre.click();
				}
			}

		}
		Thread.sleep(500);
		List<WebElement> list_AllMonthToBook = Webdriver.driver.findElements(By
				.xpath("//div[@id='JobOrders_ExpiryDate_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
		list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(500);
		List<WebElement> list_AllDateToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='JobOrders_ExpiryDate_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();
	}

	@Then("^Select the Order Reference Date as (.*)$")
	public void ordRefDate(String Date) throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("window.scrollBy(0,350)");
		clickElement(OrderMaster.OrderRefDate);
		WebElement Pre = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-prev')])[2]"));
		WebElement Cur = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-fast')])[2]"));
		WebElement Next = Webdriver.driver.findElement(By.xpath("(//a[contains(@class, 'k-nav-next')])[2]"));

		String date_dd_MM_yyyy[] = (Date.split(" ")[0]).split("/");
		int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		Cur.click();
		if (yearDiff != 0) {
			if (yearDiff > 0) {
				for (int i = 0; i < yearDiff; i++) {

					Next.click();
				}
			} else if (yearDiff < 0) {

				for (int i = 0; i < (yearDiff * (-1)); i++) {

					Pre.click();
				}
			}

		}
		Thread.sleep(500);
		List<WebElement> list_AllMonthToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='JobOrders_ClientOrderDate_dateview']//table//tbody//td[not(contains(@class,'k-link'))]"));
		list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();

		Thread.sleep(500);
		List<WebElement> list_AllDateToBook = Webdriver.driver.findElements(By.xpath(
				"//div[@id='JobOrders_ClientOrderDate_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) - 1).click();
	}

	@Then("^Click on Submit button in the Create Page of Order Master$")
	public void Submit() throws Throwable {
		clickElement(OrderMaster.Submit);
		wait.until(ExpectedConditions.elementToBeClickable(OrderMaster.OrderSuccess));
		String OrderSuccess = OrderMaster.OrderSuccess.getText();
		String[] newStr = OrderSuccess.split(" ");
		String Order = newStr[1];
		System.out.println(newStr[1]);

		FileOutputStream file = new FileOutputStream("./Reference/Order.txt");
		byte[] strToBytes = Order.getBytes();
		file.write(strToBytes);
		file.close();

	}

	@Then("^Click on Submit button$")
	public void SubmitOnly() throws Throwable {
		clickElement(OrderMaster.Submit);

	}

	@Then("^Check the validation message for Order Expiry Date when it is greater than start date$")
	public void validationForExpiry() throws Throwable {
		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		Assert.assertEquals(SuccessMsg, "ExpiryDate Date should be greater than Start Date");

	}

	@Then("^Check the validation message for Order Expiry Date when it is lesser than finish date$")
	public void validationForExpiryFinish() throws Throwable {
		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		Assert.assertEquals(SuccessMsg, "ExpiryDate Date should be greater than Finish Date");
		Thread.sleep(3000);

	}

	@Then("^Check the validation message for Order Reference Date should be lesser than or equal to Order date$")
	public void validationForRefFinish() throws Throwable {

		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		Assert.assertEquals(SuccessMsg, "Order ref Date should be equal or less than order date");
		Thread.sleep(3000);

	}

	@Then("^Click on Planning$")
	public void click_on_Planning() throws Throwable {
		PDSSMenu.Planning.click();
	}

	@Then("^Click on Plate Nesting$")
	public void click_on_Plate_Nesting() throws Throwable {
		PDSSMenu.PlateNesting.click();

	}

	@Then("^Click on Design$")
	public void click_on_Design() throws Throwable {
		PDSSMenu.Design.click();

	}

	@Then("Click on Products")
	public void Products() throws Throwable {

		PDSSMenu.Products.click();
	}

	@Then("Click on Edit in Product Master")
	public void edit_product() throws Throwable {

		ProductMaster.ProductMasterEdit.click();
	}

	@Then("Click on Go button in the Edit page of Product Master")
	public void edit_product_go() throws Throwable {

		ProductMaster.ProductMasterEditGo.click();
	}

	@Then("Click on Edit icon in the Grid for the respective Product")
	public void enter_Order_Edit() throws Throwable {
		clickElement(ProductMaster.EditIcon);

	}

	@And("Update the Required Quantity as (.*)")
	public void Update_the_Required_Quantity(String num) throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.ProductMasterCreateRequiredQuantity));
		ProductMaster.ProductMasterCreateRequiredQuantity.clear();
		ProductMaster.ProductMasterCreateRequiredQuantity.sendKeys(num);
	}

	@Then("Click on update in the Edit page of Product Master")
	public void update_product_go() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("window.scrollBy(0,1000)");
		ProductMaster.ProductMasterEditUpdate.click();
	}

	@Then("Validate whether Product is Successfully updated")
	public void validate_product_update_success() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.CloseProductMasterCreateSuccessMessage));
		implicitWait();
		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg_Redirect']")).getText();
		Assert.assertEquals(SuccessMsg, " Product Code SM403D001 Updated Successfully");
		implicitWait();
		Thread.sleep(5000);
		clickElement(ProductMaster.CloseProductMasterCreateSuccessMessage);
	}

	@Then("^Click on Production BOM$")
	public void click_on_ProductionBOM() throws Throwable {
		PDSSMenu.ProductionBOM.click();

	}

	@Then("^Click on Create in Production BOM$")
	public void click_on_create_ProductionBOM() throws Throwable {
		ProductionBOM.BOMCreate.click();

	}

	@Then("^Enter the Order Number in Create Page of Production BOM as (.*)$")
	public void enter_order_in_Create_BOM(String Order) throws Throwable {
		Thread.sleep(5000);
//wait.until(ExpectedConditions.urlContains("Create"));
		enterTestData(ProductionBOM.BOMCreateOrderNumber, Order);
		// ProductionBOM.BOMCreateOrderNumber.sendKeys(Order);
		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.SelectBOMCreateOrderNumber));

		ProductionBOM.SelectBOMCreateOrderNumber.click();

	}

	@Then("^Click on the Product Code in Create Page of Production BOM$")
	public void clickProductCodeCreateBOM() throws Throwable {

		clickElement(ProductionBOM.clickProduct);

	}

	@Then("^Click on Profile to logout$")
	public void clickProfileLogout() throws Throwable {

		clickElement(ProductionBOM.profileLogout);

	}

	@Then("^Click on Logout$")
	public void logOut() throws Throwable {

		clickElement(ProductionBOM.Logout);

	}

	@Then("^Enter the Product Code in Create Page of Production BOM$")
	public void enterProductCodeCreateBOM() throws Throwable {

		String everything;
		BufferedReader br = new BufferedReader(new FileReader("./reference/CustomerProduct.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();

		}

		enterTestData(ProductionBOM.pCode, everything);

	}

	@Then("^Select the Product Code in Create Page of Production BOM$")
	public void selectProductCodeCreateBOM() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.selectProduct));
		clickElement(ProductionBOM.selectProduct);

	}

	@Then("^Click on Excel Upload in Create Page of Production BOM$")
	public void clickExcel() throws Throwable {

		clickElement(ProductionBOM.clickExcelUpload);

	}

	@Then("^Click on Copy BOM in Create Page of Production BOM$")
	public void clickCopyBOM() throws Throwable {

		clickElement(ProductionBOM.clickCopyBOM);

	}

	@Then("^Enter the Source Order Number in the Create Page of Production BOM as (.*)$")
	public void enterSourceOrder(String Order) throws Throwable {

		enterTestData(ProductionBOM.CopyBOM_Order_Number, Order);

	}

	@Then("^Select the Source Order Number in the Create Page of Production BOM$")
	public void selectSourceOrder() throws Throwable {

		Thread.sleep(1000);
		clickElement(ProductionBOM.CopyBOM_select_Order_Number);

	}

	@Then("^Click on the Source Product Code in the Create Page of Production BOM$")
	public void clickProductSrc() throws Throwable {

		clickElement(ProductionBOM.CopyBOM_click_Product_Code);

	}

	@Then("^Enter the Source Product Code in the Create Page of Production BOM as (.*)$")
	public void enterProductSrc(String Product) throws Throwable {

		enterTestData(ProductionBOM.CopyBOM_enter_Product_Code, Product);

	}

	@Then("^Select the Source Product Code in the Create Page of Production BOM$")
	public void selectProductSrc() throws Throwable {

		clickElement(ProductionBOM.CopyBOM_select_Product_Code);

	}

	@Then("^Click on Submit to do Copy BOM$")
	public void clickSubmitSrc() throws Throwable {

		clickElement(ProductionBOM.CopyBOM_Submit);

	}

	@Then("^Validate the success message for Copy BOM$")
	public void copyBOM() throws Throwable {

		assertVerify("BOM Copied Successfully. 1 Parts Inserted", OrderMaster.OrderSuccess);
	}

	@Then("^Validate the error message for Copy BOM as Product should be of same type$")
	public void sameTypecopyBOM() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.closeErrorMessageinPM));

		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		Assert.assertEquals(SuccessMsg, "Product Type should be same");

	}

	@Then("^Check whether the Excel Template is getting downloaded in Create Page of Production BOM$")
	public void clickDownload() throws Throwable {
		Webdriver.driver.findElement(By.id("downloadTemplate")).click();

	}

	@Then("^Click on Browse file in the Create Page of Production BOM$")
	public void clickExcelUpload() throws Throwable {
		System.out.println("Before Browse");
		Thread.sleep(2000);
		clickElement(ProductionBOM.clickBrowseFile);

	}

	@Then("^Enter the Order Number in View Page of Production BOM as (.*)$")
	public void enter_order_in_View_BOM(String Order) throws Throwable {

		Thread.sleep(2000);
		ProductionBOM.BOMViewOrderNumber.sendKeys(Order);
		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.SelectBOMViewOrderNumber));

		ProductionBOM.SelectBOMCreateOrderNumber.click();

	}

	@Then("^Click on Part Details in the View Page of Production BOM$")
	public void click_View_Part_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.ViewClickPartDetails));
		ProductionBOM.ViewClickPartDetails.click();

	}

	@Then("^Click on Drawing Details in the View Page of Production BOM$")
	public void click_View_Drawing_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.ViewClickDrawingDetails));
		ProductionBOM.ViewClickDrawingDetails.click();

	}

	@Then("^Click on Finished Components Details in the View Page of Production BOM$")
	public void click_View_FC_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.ViewClickFCDetails));
		ProductionBOM.ViewClickFCDetails.click();

	}

	@Then("^Click on Accessories Details in the View Page of Production BOM$")
	public void click_View_AC_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.ViewClickAccessoriesDetails));
		ProductionBOM.ViewClickAccessoriesDetails.click();

	}

	@Then("^Click on BOM Association Details in the View Page of Production BOM$")
	public void click_View_BOM_details() throws Throwable {
		scrollWebPageDown();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.ViewClickBOMAssoDetails));
		ProductionBOM.ViewClickBOMAssoDetails.click();

	}

	@Then("^Select the Product Code in View Page of Production BOM$")
	public void enter_product_in_View_BOM() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.clickProductCodeView));
		ProductionBOM.clickProductCodeView.click();
		pressDownArrow();
		pressEnter();

	}

	@Then("^Select the Product Code in Create Page of Production BOM as (.*)$")
	public void select_product_bom_create(String Order) throws Throwable {

		ProductionBOM.BOMCreateOrderNumber.sendKeys(Order);
		wait.until(ExpectedConditions.elementToBeClickable(ProductionBOM.SelectBOMCreateOrderNumber));
		ProductionBOM.SelectBOMCreateOrderNumber.click();

	}

	@Then("^Enter the Product Name in the Product Master Create as (.*)")
	public void Enter_the_Product_Name(String Product) throws Throwable {
		Random r = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz123456789";
		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.ProductMasterEnterProductCode));
		ProductMaster.ProductMasterEnterProductCode.sendKeys(Product + (alphabet.charAt(r.nextInt(alphabet.length()))));
	}

	@And("Enter the Required Quantity as (.*)")
	public void Enter_the_Required_Quantity(String num) throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.ProductMasterCreateRequiredQuantity));
		ProductMaster.ProductMasterCreateRequiredQuantity.sendKeys(num);
	}

	@Then("Click on Submit in the Create page of Product Master")
	public void submit() throws Throwable {

		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.ProductMasterCreateRequiredQuantity));
		ProductMaster.ProductMasterCreateSubmit.click();

	}

	@Then("Validate whether Customer Product is not getting created with 2 characters")
	public void validate_product_success() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.CloseProductMasterCreateSuccessMessage));
		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		Assert.assertEquals(SuccessMsg, "Min. 3 characters Mandatory for Product Code");
		clickElement(ProductMaster.CloseProductMasterCreateSuccessMessage);

	}

	@Then("Validate whether Design Product is not getting created with 2 characters")
	public void validate_cproduct_success() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.CloseProductMasterCreateSuccessMessage));
		String SuccessMsg = Webdriver.driver.findElement(By.xpath("//label[@id='lblwindowmsg']")).getText();
		Assert.assertEquals(SuccessMsg, "Min. 3 characters Mandatory for Product Code");
		clickElement(ProductMaster.CloseProductMasterCreateSuccessMessage);
	}

	@And("Enter the Product Description as (.*)")
	public void Enter_the_Product_Description(String ProdDesc) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ProductMaster.ProductMasterProductDescription));
		ProductMaster.ProductMasterProductDescription.sendKeys(ProdDesc);
	}

	@Then("Select the Product Type as (.*)")
	public void Select_the_Product_Type(String PType) throws Throwable {

		Webdriver.driver.findElement(By.xpath("(//input[@type='radio'])[" + PType + "]")).click();

	}

	@Then("^Click on Intra Stock Transfer$")
	public void click_on_Intra_Stock_Transfer() throws Throwable {

		PDSSMenu.IntraStockTransfer.click();
	}

	@Then("^Click on Outsourcing$")
	public void click_on_Outsourcing() throws Throwable {
		PDSSMenu.Outsourcing.click();
	}

	@Then("^Click on Vendor Outsourcing Advice$")
	public void click_on_Vendor_Outsourcing_Advice() throws Throwable {
		PDSSMenu.VOA.click();
	}

}
