package stepdefinition.FAS_Account_Receivables_JOM;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import stepdefinition.Webdriver;
import stepdefinition.FAS_Cash_and_Bank_Voucher.FAS_CBV_Cash_and_Bank_Enhancements.Finance_Cash_and_Bank;

public class Job_Order_Master {

	public static String select_Random_Customer_list;
	public static String select_Random_Job;
	public static String select_Random_List_job;
	public static String select_Random_List_invoicetype;
	public static String select_Random_List_Currency;
	public static String select_Random_List_Pricing;
	public static String select_Random_List_Event;
	public static String select_Random_List_Advancetype;
	public static String select_Random_List_Recoveytype;
	public static String select_Random_List_Type;
	public static String select_Random_List_Activity;
	public static String select_Random_List_Consignee;
	public static String select_Random_List_Date;
	public static String Selected_Random_Month;
	public static String Selected_Random_Date;
	public static String Selected_Random_Year;

	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);

	public Job_Order_Master() {
		PageFactory.initElements(Webdriver.driver, object_repository.Basha.Object__Reppositoty_JOM.class);

	}

	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	@Given("^Verify the user can be able to Login EIP4 with valid credentails$")
	public static void Verify_the_user_can_be_able_to_Login_EIP4_with_valid_credentails() throws Throwable {
		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

	}

	@Given("^Verify the user can be unable to Login EIP4 with invalid username$")
	public static void Verify_the_user_can_be_unable_to_Login_EIP4_with_invalid_username() throws Throwable {
		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getInvalidusername());
		System.out.println("Selected Username:" + ConfigFileReader.getInvalidusername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

	}

	@Given("^Verify the user can be unable to Login EIP4 with invalid Password$")
	public static void Verify_the_user_can_be_unable_to_Login_EIP4_with_invalid_Password() throws Throwable {
		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getInvalidPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getInvalidPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

	}

	@Given("^Verify the user if given incorrect username and password then the validation popup should shows like invalid credentials$")
	public static void Verify_the_user_if_given_incorrect_username_and_password_then_the_validation_popup_should_shows_like_invalid_credentials()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getInvalidusername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getInvalidPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getInvalidPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

	}

	@Given("^Verify user can be able to Login and navigate to JOM through Search manu$")
	public static void Verify_user_can_be_able_to_Login_and_navigate_to_JOM_through_Search_manu() throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.click();
		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.sendKeys("Job Order Master");
		Thread.sleep(3000);

		object_repository.Basha.Object__Reppositoty_JOM.Jobordermaster.click();
		Thread.sleep(5000);
	}

	@Given("^Verify search manu need to search based on the valid inputs given by user$")
	public static void Verify_search_manu_need_to_search_based_on_the_valid_inputs_given_by_user() throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.click();
		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.sendKeys("Job Order Master");
		Thread.sleep(3000);

		object_repository.Basha.Object__Reppositoty_JOM.Jobordermaster.click();
		Thread.sleep(5000);
	}

	@Given("^Verify search manu should not search if user given invalid inputs$")
	public static void Verify_search_manu_should_not_search_if_user_given_invalid_inputs() throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.click();
		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.sendKeys("thgdj");
		Thread.sleep(3000);

	}

	@Given("^Verify user can be able to Login and navigate to Finance through Access based manu$")
	public static void Verify_user_can_be_able_to_Login_and_navigate_to_Finance_through_Access_based_manu()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccessBasedMenu.click();

		object_repository.Basha.Object__Reppositoty_JOM.Finance.click();

	}

	@Given("^Verify whether the user can be able to navigate the Accountsreceivable through Access based manu$")
	public static void Verify_user_can_be_able_to_Login_and_navigate_to_Accountsreceivable_through_Access_based_manu()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccessBasedMenu.click();

		object_repository.Basha.Object__Reppositoty_JOM.Finance.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccountsReceivable.click();

	}

	@Given("^Verify whether the user can be able to navigate the Master through Access based manu$")
	public static void Verify_user_can_be_able_to_Login_and_navigate_to_Master_through_Access_based_manu()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccessBasedMenu.click();

		object_repository.Basha.Object__Reppositoty_JOM.Finance.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccountsReceivable.click();

		object_repository.Basha.Object__Reppositoty_JOM.Master.click();
	}

	@Given("^Verify whether the user can be able to navigate the Job Order Master page through Access based manu$")
	public static void Verify_user_can_be_able_to_Login_and_navigate_to_Job_Order_Master_page_through_Access_based_manu()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccessBasedMenu.click();

		object_repository.Basha.Object__Reppositoty_JOM.Finance.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccountsReceivable.click();

		object_repository.Basha.Object__Reppositoty_JOM.Master.click();

		object_repository.Basha.Object__Reppositoty_JOM.JOM.click();
		Thread.sleep(4000);
	}

	@Given("^Verify whether the user can be able select the job value in job order creation dropdown$")
	public static void Verify_whether_the_user_can_be_able_select_the_job_value_in_job_order_creation_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Addbutton.click();
		Thread.sleep(4000);

		object_repository.Basha.Object__Reppositoty_JOM.Job_dr.click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Job_opt));
		Thread.sleep(4000);
		object_repository.Basha.Object__Reppositoty_JOM.Job.click();

		object_repository.Basha.Object__Reppositoty_JOM.Job_dr.click();

		Thread.sleep(4000);
		if (ConfigFileReader.getJob_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult = object_repository.Basha.Object__Reppositoty_JOM.Jobcode1;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getJobcode1())) {
					webElement.click();
					System.out.println("Job Code selected:" + ConfigFileReader.getJobcode1());
					break;
				}
			}
		} else if (ConfigFileReader.getJob_Random_selection().equals("Random")) {

			List<WebElement> DropdownResult_job = object_repository.Basha.Object__Reppositoty_JOM.Jobcodelist;
			Random Random_job = new Random();
			int Random_job_size = Random_job
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Jobcodelist.size());
			select_Random_List_job = object_repository.Basha.Object__Reppositoty_JOM.Jobcodelist.get(Random_job_size)
					.getText();
			for (WebElement webElement : DropdownResult_job) {
				if (webElement.getText().equals(select_Random_List_job)) {
					webElement.click();
					System.out.println("Selected job : " + select_Random_List_job);
					break;
				}
			}
			Thread.sleep(4000);

		}

	}

	@Given("^Verify user should be able to select the customer value based on the job dropdown$")
	public static void Verify_user_should_be_able_to_select_the_customer_value_based_on_the_job_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Customer.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getCustomer_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult2 = object_repository.Basha.Object__Reppositoty_JOM.Customercode_DR;
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().equals(ConfigFileReader.getcustomer_code())) {
					webElement.click();
					System.out.println("Customer selected:" + ConfigFileReader.getcustomer_code());
					break;
				}
			}
		} else if (ConfigFileReader.getCustomer_Random_selection().equals("Random")) {

			List<WebElement> DropdownResult_customer = object_repository.Basha.Object__Reppositoty_JOM.Customercode_DR;
			Random Random_customer = new Random();
			int Random_customer_size = Random_customer
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Customercode_DR.size());
			select_Random_Customer_list = object_repository.Basha.Object__Reppositoty_JOM.Customercode_DR
					.get(Random_customer_size).getText();
			for (WebElement webElement : DropdownResult_customer) {
				if (webElement.getText().equals(select_Random_Customer_list)) {
					webElement.click();
					System.out.println("Selected customer : " + select_Random_Customer_list);
					break;
				}
			}
		}

	}

	@Given("^Verify the user able to enter the customer order no value$")
	public static void Verify_the_user_able_to_enter_the_customer_order_no_value() throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Customerordernumber.click();
		object_repository.Basha.Object__Reppositoty_JOM.Customerordernumber
				.sendKeys(ConfigFileReader.getCustomer_order_number());

	}

	@Given("^Verify the user able to select the customer order date$")
	public static void Verify_the_user_able_to_select_the_customer_order_date() throws Throwable {

		if (ConfigFileReader.getDate_Random_selection().equals("Manual")) {
			object_repository.Basha.Object__Reppositoty_JOM.Datepickerenter.click();
			Thread.sleep(3000);

			wait.until(ExpectedConditions
					.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Datepickerenter));
			object_repository.Basha.Object__Reppositoty_JOM.Datepickerenter.click();
			Actions actions1 = new Actions(Webdriver.driver);
			actions1.sendKeys(Keys.HOME);
			actions1.perform();
			Actions actions2 = new Actions(Webdriver.driver);
			actions2.sendKeys(Keys.NUMPAD1);
			actions2.perform();
			Actions actions3 = new Actions(Webdriver.driver);
			actions3.sendKeys(Keys.TAB);
			actions3.perform();
			Actions actions4 = new Actions(Webdriver.driver);
			actions4.sendKeys(Keys.NUMPAD1);
			actions4.perform();
			Actions actions5 = new Actions(Webdriver.driver);
			actions5.sendKeys(Keys.TAB);
			actions5.perform();
			Actions actions6 = new Actions(Webdriver.driver);
			actions6.sendKeys(Keys.NUMPAD2);
			actions6.perform();
			Actions actions7 = new Actions(Webdriver.driver);
			actions7.sendKeys(Keys.NUMPAD0);
			actions7.perform();
			Actions actions8 = new Actions(Webdriver.driver);
			actions8.sendKeys(Keys.NUMPAD1);
			actions8.perform();
			Actions actions9 = new Actions(Webdriver.driver);
			actions9.sendKeys(Keys.NUMPAD9);
			actions9.perform();
			System.out.println("Customer order date Date has been entered");

		} else if (ConfigFileReader.getDate_Random_selection().equals("Random")) {
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Datepicker));
			object_repository.Basha.Object__Reppositoty_JOM.Datepicker.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.datepickerclick));
			object_repository.Basha.Object__Reppositoty_JOM.datepickerclick.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.datepickerclick));
			object_repository.Basha.Object__Reppositoty_JOM.datepickerclick.click();


			Thread.sleep(3000);
			List<WebElement> DropdownResult_Year = object_repository.Basha.Object__Reppositoty_JOM.Year_selection;
			Random Random_Year = new Random();
			int Random_Year_size = Random_Year
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Month_list.size());
			Selected_Random_Year = object_repository.Basha.Object__Reppositoty_JOM.Month_list.get(Random_Year_size)
					.getText();
			for (WebElement webElement11 : DropdownResult_Year) {
				if (webElement11.getText().equals(Selected_Random_Year)) {
					webElement11.click();
					System.out.println("Selected Year : " + Selected_Random_Year);
					break;
				}
			}
			
			Thread.sleep(3000);
			List<WebElement> DropdownResult_Month = object_repository.Basha.Object__Reppositoty_JOM.Month_list;
			Random Random_Month = new Random();
			int Random_Month_size = Random_Month
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Month_list.size());
			Selected_Random_Month = object_repository.Basha.Object__Reppositoty_JOM.Month_list.get(Random_Month_size)
					.getText();
			for (WebElement webElement2 : DropdownResult_Month) {
				if (webElement2.getText().equals(Selected_Random_Month)) {
					webElement2.click();
					System.out.println("Selected Month : " + Selected_Random_Month);
					break;
				}
			}

			Thread.sleep(3000);
			List<WebElement> DropdownResult_Date = object_repository.Basha.Object__Reppositoty_JOM.Date_list;
			Random Random_Date = new Random();
			int Random_Date_size = Random_Date
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Date_list.size());
			Selected_Random_Date = object_repository.Basha.Object__Reppositoty_JOM.Date_list.get(Random_Date_size)
					.getText();
			for (WebElement webElement3 : DropdownResult_Date) {
				if (webElement3.getText().equals(Selected_Random_Date)) {
					webElement3.click();
					System.out.println("Selected Date : " + Selected_Random_Date);
					break;
				}
			}
		}

	}

	@Given("^Verify the user able to select the invoice type value by using the invoice type dropdown$")
	public static void Verify_the_user_able_to_select_the_invoice_type_value_by_using_the_invoice_type_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Invoicetype.click();
		Thread.sleep(5000);

		if (ConfigFileReader.getInvoicetype_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult2 = object_repository.Basha.Object__Reppositoty_JOM.Invoicetypename_List;
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().equals(ConfigFileReader.getInvoicetypename())) {
					webElement.click();
					System.out.println("Selected Invoicetype:" + ConfigFileReader.getInvoicetypename());
					break;
				}
			}
		}

		else if (ConfigFileReader.getInvoicetype_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_Invoicetype = object_repository.Basha.Object__Reppositoty_JOM.Invoicetypename_List;
			Random Random_Invoicetype = new Random();
			int Random_Invoicetype_size = Random_Invoicetype
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Invoicetypename_List.size());
			select_Random_List_invoicetype = object_repository.Basha.Object__Reppositoty_JOM.Invoicetypename_List
					.get(Random_Invoicetype_size).getText();
			for (WebElement webElement : DropdownResult_Invoicetype) {
				if (webElement.getText().equals(select_Random_List_invoicetype)) {
					webElement.click();
					System.out.println("Selected Invoicetype : " + select_Random_List_invoicetype);
					break;
				}
			}
		}

	}

	@Given("^Verify the user can be able to enter the order value$")
	public static void Verify_the_user_can_be_able_to_enter_the_order_value() throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue.click();
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue.sendKeys(ConfigFileReader.getOrder_value());

	}

	@Given("^Verify the user can be able to select the currency type by using the currency type dropdown$")
	public static void Verify_the_user_can_be_able_to_select_the_currency_type_by_using_the_currency_type_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Currency.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getCurrency_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult3 = object_repository.Basha.Object__Reppositoty_JOM.Currecnylist;
			for (WebElement webElement : DropdownResult3) {
				if (webElement.getText().equals(ConfigFileReader.getCurrency1())) {
					webElement.click();
					System.out.println("Currency Selected:" + ConfigFileReader.getCurrency1());
					break;
				}
			}
		}

		else if (ConfigFileReader.getCurrency_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_Currency = object_repository.Basha.Object__Reppositoty_JOM.Currecnylist;
			Random Random_Currency = new Random();
			int Random_Currency_size = Random_Currency
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Currecnylist.size());
			select_Random_List_Currency = object_repository.Basha.Object__Reppositoty_JOM.Currecnylist
					.get(Random_Currency_size).getText();
			for (WebElement webElement : DropdownResult_Currency) {
				if (webElement.getText().equals(select_Random_List_Currency)) {
					webElement.click();
					System.out.println("Selected Currency : " + select_Random_List_Currency);
					break;
				}
			}
		}

	}

	@Given("^Verify the user can be able to select the pricing type by using the pricing type dropdown$")
	public static void Verify_the_user_can_be_able_to_select_the_pricing_type_by_using_the_pricing_type_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Pricing.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getPricing_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult4 = object_repository.Basha.Object__Reppositoty_JOM.Pricinglist;
			for (WebElement webElement : DropdownResult4) {
				if (webElement.getText().equals(ConfigFileReader.getPricing1())) {
					webElement.click();
					System.out.println("Pricing Selected:" + ConfigFileReader.getPricing1());
					break;
				}
			}
		}

		else if (ConfigFileReader.getPricing_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_Pricing = object_repository.Basha.Object__Reppositoty_JOM.Pricinglist;
			Random Random_Pricing = new Random();
			int Random_Pricing_size = Random_Pricing
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Pricinglist.size());
			select_Random_List_Pricing = object_repository.Basha.Object__Reppositoty_JOM.Pricinglist
					.get(Random_Pricing_size).getText();
			for (WebElement webElement : DropdownResult_Pricing) {
				if (webElement.getText().equals(select_Random_List_Pricing)) {
					webElement.click();
					System.out.println("Selected pricing : " + select_Random_List_Pricing);
					break;
				}
			}
		}

	}

	// Stage for job details

	@Given("^Verify whether the user can be able to create stage for job details$")
	public static void Verify_whether_the_user_can_be_able_to_create_stage_for_job_details() throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Stage_for_Job.click();

		object_repository.Basha.Object__Reppositoty_JOM.Stage_percentage1
				.sendKeys(ConfigFileReader.getStage_percentage1());

		object_repository.Basha.Object__Reppositoty_JOM.Remarks.click();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks.sendKeys(ConfigFileReader.getStage_Remarks1());

		object_repository.Basha.Object__Reppositoty_JOM.Save.click();

		object_repository.Basha.Object__Reppositoty_JOM.Add.click();

		object_repository.Basha.Object__Reppositoty_JOM.Stage_percentage2
				.sendKeys(ConfigFileReader.getStage_percentage2());

		object_repository.Basha.Object__Reppositoty_JOM.Remarks1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks1.sendKeys(ConfigFileReader.getStage_Remarks2());

		object_repository.Basha.Object__Reppositoty_JOM.Save1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Okbutton.click();

	}

	// Consignee link details

	@Given("^Verify whether the user can be able to create consigneelink details$")
	public static void Verify_whether_the_user_can_be_able_to_create_consigneelink_details() throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Add_icon.click();
		object_repository.Basha.Object__Reppositoty_JOM.Consignee_name1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Consignee_name1.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Consignee_name1.click();

		object_repository.Basha.Object__Reppositoty_JOM.Consignee_name1.sendKeys(ConfigFileReader.getConsignee_name1());

		if (ConfigFileReader.getConsignee_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult44 = object_repository.Basha.Object__Reppositoty_JOM.Consignee_list;
			for (WebElement webElement : DropdownResult44) {
				if (webElement.getText().equals(ConfigFileReader.getConsignee_name())) {
					webElement.click();
					System.out.println("Selected Consignee link details:" + ConfigFileReader.getConsignee_name());
					break;
				}
			}
		}

		else if (ConfigFileReader.getConsignee_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_consignee = object_repository.Basha.Object__Reppositoty_JOM.Consignee_list;
			Random Random_consignee = new Random();
			int Random_consignee_size = Random_consignee
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Consignee_list.size());
			select_Random_List_Consignee = object_repository.Basha.Object__Reppositoty_JOM.Consignee_list
					.get(Random_consignee_size).getText();
			for (WebElement webElement : DropdownResult_consignee) {
				if (webElement.getText().equals(select_Random_List_Consignee)) {
					webElement.click();
					System.out.println("Selected Consignee link details : " + select_Random_List_Consignee);
					break;
				}
			}
		}
		Actions action123 = new Actions(Webdriver.driver);
		action123.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover);
		action123.build().perform();
		object_repository.Basha.Object__Reppositoty_JOM.Save2.click();

	}

	// main group details for invoice group details

	@Given("^Verify whether the user can be able to select the main group by using group tag in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_main_group_by_using_group_tag_in_invoice_group_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Add1.click();

		object_repository.Basha.Object__Reppositoty_JOM.Group_tag.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Main_group_tag));
		object_repository.Basha.Object__Reppositoty_JOM.Main_group_tag.click();

		System.out.println("Main Group");

	}

	@Given("^Verify whether the user can be able to enter the group code for main group in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_group_code_for_main_group_in_invoice_group_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Group_code.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_code.sendKeys(ConfigFileReader.getGroup_code());
		System.out.println("Entered group code:" + ConfigFileReader.getGroup_code());
	}

	@Given("^Verify whether the user can be able to enter the group description for main group in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_group_description_for_main_group_in_invoice_group_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Group_description.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description
				.sendKeys(ConfigFileReader.getGroup_description());
		System.out.println("Entered group description:" + ConfigFileReader.getGroup_description());

		object_repository.Basha.Object__Reppositoty_JOM.Save3.click();
		System.out.println("Invoice Group details has been saved for main group");
	}

	// sup group details for invoice group details

	@Given("^Verify whether the user can be able to select the sub group by using group tag in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_sub_group_by_using_group_tag_in_invoice_group_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Add2.click();
		Thread.sleep(2000);
		object_repository.Basha.Object__Reppositoty_JOM.Group_tag.click();
		wait.until(
				ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Sub_group_tag));
		object_repository.Basha.Object__Reppositoty_JOM.Sub_group_tag.click();
		System.out.println("Sub Group");

	}

	@Given("^Verify whether the user can be able to enter the group code for sub group in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_group_code_for_sub_group_in_invoice_group_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Group_code1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_code1.sendKeys(ConfigFileReader.getGroup_code1());
		System.out.println("Entered group code:" + ConfigFileReader.getGroup_code1());
	}

	@Given("^Verify whether the user can be able to enter the group description for sub group in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_group_description_for_sub_group_in_invoice_group_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Group_description1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description1
				.sendKeys(ConfigFileReader.getGroup_description1());
		System.out.println("Entered group description:" + ConfigFileReader.getGroup_description1());

		object_repository.Basha.Object__Reppositoty_JOM.Save4.click();
		System.out.println("Invoice Group details has been saved for sub group");
	}

	// Payment terms-other then advance

	@Given("^Verify whether the user can be able to enter the percentage for payment terms-other then advance details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_percentage_for_payment_terms_other_then_advance_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Percentage.click();
		object_repository.Basha.Object__Reppositoty_JOM.Percentage.sendKeys(ConfigFileReader.getPercentage());
		System.out.println("Entered percentage for payment terms:" + ConfigFileReader.getPercentage());

	}

	@Given("^Verify whether the user can be able to select the event for payment terms-other then advance details by using event dropdown$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_event_for_payment_terms_other_then_advance_details_by_using_event_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Event.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getEvent_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult5 = object_repository.Basha.Object__Reppositoty_JOM.Event_List;
			for (WebElement webElement : DropdownResult5) {
				if (webElement.getText().equals(ConfigFileReader.getEvent())) {
					webElement.click();
					System.out.println("Selected Event for payment terms:" + ConfigFileReader.getEvent());
					break;
				}
			}
		}

		else if (ConfigFileReader.getEvent_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_event = object_repository.Basha.Object__Reppositoty_JOM.Event_List;
			Random Random_event = new Random();
			int Random_event_size = Random_event
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Event_List.size());
			select_Random_List_Event = object_repository.Basha.Object__Reppositoty_JOM.Event_List.get(Random_event_size)
					.getText();
			for (WebElement webElement : DropdownResult_event) {
				if (webElement.getText().equals(select_Random_List_Event)) {
					webElement.click();
					System.out.println("Selected Event : " + select_Random_List_Event);
					break;
				}
			}
		}

	}

	@Given("^Verify whether the user can be able to select the Required document for payment terms-other then advance details by using Required document checkbox$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_Required_document_for_payment_terms_other_then_advance_details_by_using_Required_document_checkbox()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Required_doc.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult6 = object_repository.Basha.Object__Reppositoty_JOM.Required_doc_list;
		for (WebElement webElement : DropdownResult6) {
			if (webElement.getText().equals(ConfigFileReader.getRequired_doc())) {
				webElement.click();
				System.out.println("Selected Required doc for payment terms:" + ConfigFileReader.getRequired_doc());
				break;
			}
		}

	}

	@Given("^Verify whether the user can be able to enter the no.of.days for payment terms-other then advance details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_no_of_days_for_payment_terms_other_then_advance_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.No_of_days.click();
		object_repository.Basha.Object__Reppositoty_JOM.No_of_days.sendKeys(ConfigFileReader.getNo_of_days());
		System.out.println("Entered no.of.days for payment terms:" + ConfigFileReader.getNo_of_days());

	}

	@Given("^Verify whether the user can be able to enter the remarks for payment terms-other then advance details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_remarks_for_payment_terms_other_then_advance_details()
			throws Throwable {

		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Remarks2));
		object_repository.Basha.Object__Reppositoty_JOM.Remarks2.click();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks2.sendKeys(ConfigFileReader.getRemarks2());
		System.out.println("Entered remarks for payment terms:" + ConfigFileReader.getRemarks2());

		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Remarks2.click();
		object_repository.Basha.Object__Reppositoty_JOM.Save4.click();
		System.out.println("Payment terms other then advance details has been saved");

	}

	// Contract terms - advance

	@Given("^Verify whether the user can be able to select the Advance type for contract terms-advance details by using Advance type dropdown$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_Advance_type_for_contract_terms_advance_details_by_using_Advance_type_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Add3.click();
		object_repository.Basha.Object__Reppositoty_JOM.Advance_type.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getAdvancetype_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult7 = object_repository.Basha.Object__Reppositoty_JOM.Advance_type_list;
			for (WebElement webElement : DropdownResult7) {
				if (webElement.getText().equals(ConfigFileReader.getAdvance_type())) {
					webElement.click();
					System.out.println(
							"Selected Advance_type for contract trems details:" + ConfigFileReader.getAdvance_type());
					break;
				}
			}
		}

		else if (ConfigFileReader.getAdvancetype_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_Advancetype = object_repository.Basha.Object__Reppositoty_JOM.Advance_type_list;
			Random Random_Advancetype = new Random();
			int Random_Advancetype_size = Random_Advancetype
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Advance_type_list.size());
			select_Random_List_Advancetype = object_repository.Basha.Object__Reppositoty_JOM.Advance_type_list
					.get(Random_Advancetype_size).getText();
			for (WebElement webElement : DropdownResult_Advancetype) {
				if (webElement.getText().equals(select_Random_List_Advancetype)) {
					webElement.click();
					System.out.println("Selected Advance type : " + select_Random_List_Advancetype);
					break;
				}
			}
		}

	}

	@Given("^Verify whether the user can be able to select the Required document for contract terms-advance details by using Required document checkbox$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_Required_document_for_contract_terms_advance_details_by_using_Required_document_checkbox()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Required_doc4.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult8 = object_repository.Basha.Object__Reppositoty_JOM.Required_doc_list;
		for (WebElement webElement : DropdownResult8) {
			if (webElement.getText().equals(ConfigFileReader.getRequired_doc4())) {
				webElement.click();
				System.out.println(
						"Selected Required doc for contract terms details:" + ConfigFileReader.getRequired_doc4());
				break;
			}
		}
	}

	@Given("^Verify whether the user can be able to enter the no.of.installments for contract terms-advance details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_no_of_installments_for_contract_terms_advance_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.No_of_Installments.click();
		object_repository.Basha.Object__Reppositoty_JOM.No_of_Installments
				.sendKeys(ConfigFileReader.getNo_of_Installments());
		System.out.println(
				"Entered no.of.installments for contract terms details:" + ConfigFileReader.getNo_of_Installments());
	}

	@Given("^Verify whether the user can be able to enter the Advance percentage or amount for contract terms-advance details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_Advance_percentage_or_amount_for_contract_terms_advance_details()
			throws Throwable {

		if (ConfigFileReader.getAdvance_amount_type().equals("Percentage")) {
			object_repository.Basha.Object__Reppositoty_JOM.Advance_percentage.click();
			object_repository.Basha.Object__Reppositoty_JOM.Advance_percentage
					.sendKeys(ConfigFileReader.getAdvance_percentage());
		} else if (ConfigFileReader.getAdvance_amount_type().equals("Amount")) {
			object_repository.Basha.Object__Reppositoty_JOM.Advance_amount.click();
			object_repository.Basha.Object__Reppositoty_JOM.Advance_amount
					.sendKeys(ConfigFileReader.getAdvance_amount());
		}

	}

	@Given("^Verify whether the user can be able to select the event for contract terms-advance details by using event dropdown$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_event_for_contract_terms_advance_details_by_using_event_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Event2.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getEvent_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult9 = object_repository.Basha.Object__Reppositoty_JOM.Event_List;
			for (WebElement webElement : DropdownResult9) {
				if (webElement.getText().equals(ConfigFileReader.getEvent())) {
					webElement.click();
					System.out.println("Selected Event for contract terms details:" + ConfigFileReader.getEvent());
					break;
				}
			}
		}

		else if (ConfigFileReader.getEvent_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_event = object_repository.Basha.Object__Reppositoty_JOM.Event_List;
			Random Random_event = new Random();
			int Random_event_size = Random_event
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Event_List.size());
			select_Random_List_Event = object_repository.Basha.Object__Reppositoty_JOM.Event_List.get(Random_event_size)
					.getText();
			for (WebElement webElement : DropdownResult_event) {
				if (webElement.getText().equals(select_Random_List_Event)) {
					webElement.click();
					System.out.println("Selected Event for contract terms details : " + select_Random_List_Event);
					break;
				}
			}
		}

		object_repository.Basha.Object__Reppositoty_JOM.Event2.click();

	}

	@Given("^Verify whether the user can be able to enter the no.of.credit days for contract terms-advance details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_no_of_credit_days_for_contract_terms_advance_details()
			throws Throwable {

		Actions actions = new Actions(Webdriver.driver);
		actions.sendKeys(Keys.TAB);

		object_repository.Basha.Object__Reppositoty_JOM.No_of_Credit_days
				.sendKeys(ConfigFileReader.getNo_of_Credit_days());
		System.out.println(
				"Entered no.of.credit days for contract terms details:" + ConfigFileReader.getNo_of_Credit_days());

		Actions action222 = new Actions(Webdriver.driver);
		action222.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.Save7);
		action222.perform();
		Thread.sleep(2000);
		object_repository.Basha.Object__Reppositoty_JOM.Save7.click();
		System.out.println("Contract terms-advance details has been saved");

	}

	// Contract terms - recovery (releasable)

	@Given("^Verify whether the user can be able to select the recovery type for contract terms-recovery releasable details by using recovery type dropdown$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_recovery_type_for_contract_terms_recovery_releasable_details_by_using_recovery_type_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Recovery_type.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getRecoverytype_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult10 = object_repository.Basha.Object__Reppositoty_JOM.Recovery_type_List;
			for (WebElement webElement : DropdownResult10) {
				if (webElement.getText().equals(ConfigFileReader.getRecovery_type())) {
					webElement.click();
					System.out.println("Selected Recovery type for contract terms-recovery releasable details:"
							+ ConfigFileReader.getRecovery_type());
					break;
				}
			}
		}

		else if (ConfigFileReader.getRecoverytype_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_Recovery = object_repository.Basha.Object__Reppositoty_JOM.Recovery_type_List;
			Random Random_Recovery = new Random();
			int Random_Recovery_size = Random_Recovery
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Recovery_type_List.size());
			select_Random_List_Recoveytype = object_repository.Basha.Object__Reppositoty_JOM.Recovery_type_List
					.get(Random_Recovery_size).getText();
			for (WebElement webElement : DropdownResult_Recovery) {
				if (webElement.getText().equals(select_Random_List_Recoveytype)) {
					webElement.click();
					System.out.println(
							"Selected Recocvery for contract terms details : " + select_Random_List_Recoveytype);
					break;
				}
			}
		}

	}

	@Given("^Verify whether the user can be able to enter the Recovery percentage for contract terms-recovery releasable details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_Recovery_percentage_for_contract_terms_recovery_releasable_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Recovery_percentage.click();
		object_repository.Basha.Object__Reppositoty_JOM.Recovery_percentage
				.sendKeys(ConfigFileReader.getRecovery_percentage());
		System.out.println("Entered Recovery percentage for contract terms-recovery releasable details:"
				+ ConfigFileReader.getRecovery_percentage());

	}

	@Given("^Verify whether the user can be able to enter the starting invoice number for contract terms-recovery releasable details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_starting_invoice_number_for_contract_terms_recovery_releasable_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Strating_invoice_no.click();
		object_repository.Basha.Object__Reppositoty_JOM.Strating_invoice_no
				.sendKeys(ConfigFileReader.getStrating_invoice_no());
		System.out.println("Entered starting invoice number for contract terms-recovery releasable details:"
				+ ConfigFileReader.getStrating_invoice_no());

	}

	@Given("^Verify whether the user can be able to enter the Releasable date for contract terms-recovery releasable details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_Releasable_date_for_contract_terms_recovery_releasable_details()
			throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Date_picker_enter));
		object_repository.Basha.Object__Reppositoty_JOM.Date_picker_enter.click();
		Actions actions1 = new Actions(Webdriver.driver);
		actions1.sendKeys(Keys.HOME);
		actions1.perform();
		Actions actions2 = new Actions(Webdriver.driver);
		actions2.sendKeys(Keys.NUMPAD1);
		actions2.perform();
		Actions actions3 = new Actions(Webdriver.driver);
		actions3.sendKeys(Keys.TAB);
		actions3.perform();
		Actions actions4 = new Actions(Webdriver.driver);
		actions4.sendKeys(Keys.NUMPAD1);
		actions4.perform();
		Actions actions5 = new Actions(Webdriver.driver);
		actions5.sendKeys(Keys.TAB);
		actions5.perform();
		Actions actions6 = new Actions(Webdriver.driver);
		actions6.sendKeys(Keys.NUMPAD2);
		actions6.perform();
		Actions actions7 = new Actions(Webdriver.driver);
		actions7.sendKeys(Keys.NUMPAD0);
		actions7.perform();
		Actions actions8 = new Actions(Webdriver.driver);
		actions8.sendKeys(Keys.NUMPAD2);
		actions8.perform();
		Actions actions9 = new Actions(Webdriver.driver);
		actions9.sendKeys(Keys.NUMPAD3);
		actions9.perform();
		System.out.println("Entered the releasable date for contract terms-recovery releasable details");

		Actions action22 = new Actions(Webdriver.driver);
		action22.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.Save13);
		action22.perform();
		Thread.sleep(2000);
		object_repository.Basha.Object__Reppositoty_JOM.Save13.click();
		object_repository.Basha.Object__Reppositoty_JOM.Save13.click();
		System.out.println("Contract terms-recovery (releasable) details has been saved");

	}

	// Contract terms - recovery (Non-releasable)/ Addition

	@Given("^Verify whether the user can be able to select the type for contract terms-recovery non releasable details by using type dropdown$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_type_for_contract_terms_recovery_non_releasable_details_by_using_type_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Type.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getType_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult11 = object_repository.Basha.Object__Reppositoty_JOM.Type_List;
			for (WebElement webElement : DropdownResult11) {
				if (webElement.getText().equals(ConfigFileReader.getType())) {
					webElement.click();
					System.out.println("Selected Type for contract terms-recovery Non releasable details:"
							+ ConfigFileReader.getType());

					break;
				}
			}
		}

		else if (ConfigFileReader.getType_Random_selection().equals("Random")) {
			
			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Percentage3));
			Thread.sleep(5000);
			List<WebElement> DropdownResult_Type = object_repository.Basha.Object__Reppositoty_JOM.Type_List;
			Random Random_Type = new Random();
			int Random_Type_size = Random_Type
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Type_List.size());
			select_Random_List_Type = object_repository.Basha.Object__Reppositoty_JOM.Type_List.get(Random_Type_size)
					.getText();
			for (WebElement webElement : DropdownResult_Type) {
				if (webElement.getText().equals(select_Random_List_Type)) {
					webElement.click();
					System.out.println("Selected Type for contract terms details : " + select_Random_List_Type);
					break;
				}
			}
		}

	}

	@Given("^Verify whether the user can be able to enter the percentage for contract terms-recovery non releasable details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_percentage_for_contract_terms_recovery_non_releasable_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Percentage3.click();
		object_repository.Basha.Object__Reppositoty_JOM.Percentage3.sendKeys(ConfigFileReader.getPercentage3());
		System.out.println("Entered percentage for contract terms-recovery Non releasable details:"
				+ ConfigFileReader.getPercentage3());

	}

	@Given("^Verify whether the user can be able to enter the starting invoice number for contract terms-recovery non releasable details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_starting_invoice_number_for_contract_terms_recovery_non_releasable_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Strating_invoice_no1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Strating_invoice_no1
				.sendKeys(ConfigFileReader.getStrating_invoice_no1());
		System.out.println("Entered starting invoice number for contract terms-recovery releasable details:"
				+ ConfigFileReader.getStrating_invoice_no1());

		Actions action23 = new Actions(Webdriver.driver);
		action23.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.Save9);
		action23.perform();
		Thread.sleep(2000);
		object_repository.Basha.Object__Reppositoty_JOM.Save9.click();
		System.out.println("Contract terms-recovery (non releasable) details has been saved");

	}

	// Invoice process cycle details

	@Given("^Verify whether the user can be able to select the Activity for invoice process cycle details by using type Activity dropdown$")
	public static void Verify_whether_the_user_can_be_able_to_select_the_Activity_for_invoice_process_cycle_details_by_using_Activity_dropdown()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.Activity.click();
		Thread.sleep(3000);

		if (ConfigFileReader.getActivity_Random_selection().equals("Manual")) {
			List<WebElement> DropdownResult12 = object_repository.Basha.Object__Reppositoty_JOM.Activity_List;
			for (WebElement webElement : DropdownResult12) {
				if (webElement.getText().equals(ConfigFileReader.getActivity())) {
					webElement.click();
					System.out.println(
							"Selected Activity for Invoice process cycle details:" + ConfigFileReader.getActivity());
					break;
				}
			}
		}

		else if (ConfigFileReader.getActivity_Random_selection().equals("Random")) {
			List<WebElement> DropdownResult_Activity = object_repository.Basha.Object__Reppositoty_JOM.Activity_List;
			Random Random_Activity = new Random();
			int Random_Activity_size = Random_Activity
					.nextInt(object_repository.Basha.Object__Reppositoty_JOM.Activity_List.size());
			select_Random_List_Activity = object_repository.Basha.Object__Reppositoty_JOM.Activity_List
					.get(Random_Activity_size).getText();
			for (WebElement webElement : DropdownResult_Activity) {
				if (webElement.getText().equals(select_Random_List_Activity)) {
					webElement.click();
					System.out.println(
							"Selected Activity for Invoice process cycle details : " + select_Random_List_Activity);
					break;
				}
			}
		}

	}

	@Given("^Verify whether the user can be able to enter the no.of.days for invoice process cycle details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_no_of_days_for_invoice_process_cycle_details()
			throws Throwable {

		object_repository.Basha.Object__Reppositoty_JOM.No_of_days2.click();
		object_repository.Basha.Object__Reppositoty_JOM.No_of_days2.sendKeys(ConfigFileReader.getNo_of_days2());
		System.out.println("Entered no.of.days for invoice process cycle details:" + ConfigFileReader.getNo_of_days2());

	}

	@Given("^Verify whether the user can be able to enter the remarks for invoice process cycle details$")
	public static void Verify_whether_the_user_can_be_able_to_enter_the_remarks_for_invoice_process_cycle_details()
			throws Throwable {

		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Remarks4.click();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks4.sendKeys(ConfigFileReader.getRemarks4());
		System.out.println("Entered Remarks for invoice process cycle details:" + ConfigFileReader.getRemarks4());
		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Save11.click();
		System.out.println("Invoice process cycle details has been saved");

	}

	@Given("^Verify whether the user can be able to save the entire job order created details by using the save as draft$")
	public static void Verify_whether_the_user_can_be_able_to_save_the_entire_job_order_created_details_by_using_the_save_as_draft()
			throws Throwable {

		Thread.sleep(3000);

		object_repository.Basha.Object__Reppositoty_JOM.Save_draft.click();
		System.out.println("Job order details has been created and the details are saved as draft");

		Thread.sleep(3000);

	}

	@Then("^Verify whether the user can be able to save and submit the entire job order created details by using the submit button$")
	public static void Verify_whether_the_user_can_be_able_to_save_and_submit_the_entire_job_order_created_details_by_using_the_submit_button()
			throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Submit_jom.click();
		System.out.println("Job order master successfully submitted");

	}

	@Given("^Verify user can be able to Login and create the Job order through Search manu$")
	public static void Verify_user_can_be_able_to_Login_and_create_the_Job_order_through_Search_manu()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.click();
		object_repository.Basha.Object__Reppositoty_JOM.SearchMenu.sendKeys("Job Order Master");
		Thread.sleep(3000);

		object_repository.Basha.Object__Reppositoty_JOM.Jobordermaster.click();
		Thread.sleep(5000);
	}

	@Given("^Verify user can be able to Login and create the Job order through Access based manu$")
	public static void Verify_user_can_be_able_to_Login_and_create_the_Job_order_through_Access_based_manu()
			throws Throwable {

		Finance_Cash_and_Bank.Login();
		object_repository.Basha.Object__Reppositoty_JOM.OtherUser.click();
		System.out.println("OtherUser entered");

		object_repository.Basha.Object__Reppositoty_JOM.Username.sendKeys(ConfigFileReader.getUsername());
		System.out.println("Selected Username:" + ConfigFileReader.getUsername());

		object_repository.Basha.Object__Reppositoty_JOM.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Selected Password:" + ConfigFileReader.getPassword());

		object_repository.Basha.Object__Reppositoty_JOM.login.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccessBasedMenu.click();

		object_repository.Basha.Object__Reppositoty_JOM.Finance.click();

		object_repository.Basha.Object__Reppositoty_JOM.AccountsReceivable.click();

		object_repository.Basha.Object__Reppositoty_JOM.Master.click();

		object_repository.Basha.Object__Reppositoty_JOM.JOM.click();
		Thread.sleep(4000);
	}

	// Verify the user able to edit the job order in job order master page

	@Given("^Verify whether the user can be able to filter the created job order by using job order number$")
	public static void Verify_whether_the_user_can_be_able_to_filter_the_created_job_order_by_using_job_order_number()
			throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Filter.click();
		Thread.sleep(3000);
	}

	@Given("^Verify whether the user can be able to enter the created job order number$")
	public static void click_on_JON() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.JON.click();
		object_repository.Basha.Object__Reppositoty_JOM.JON.sendKeys(ConfigFileReader.getJON());
		System.out.println("Entered created job order number :" + ConfigFileReader.getJON());
		Thread.sleep(3000);

	}

	@Then("^Verify whether the user can be able to edit the created job order by using job order number$")
	public static void Verify_whether_the_user_can_be_able_to_edit_the_created_job_order_by_using_job_order_number()
			throws Throwable {
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover2).perform();
		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Edit.click();

	}

	@Then("^Verify whether the user can be able to edit the customer order number in job order$")
	public static void click_on_Customer_Order_Number1() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Customerordernumber1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Customerordernumber1.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Customerordernumber1
				.sendKeys(ConfigFileReader.getCustomer_order_number1());
		System.out.println("Entered edit customer order number :" + ConfigFileReader.getCustomer_order_number1());

	}

	@Given("^Verify the user able to edit the customer order date in job order$")
	public static void Verify_the_user_able_to_edit_the_customer_order_date_in_job_order() throws Throwable {
		Actions action1 = new Actions(Webdriver.driver);
		action1.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.Datepickerenter1).perform();
		wait.until(ExpectedConditions
				.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Datepickerenter1));
		Actions actions322 = new Actions(Webdriver.driver);
		actions322.sendKeys(Keys.TAB);
		actions322.build().perform();
		Actions actions323 = new Actions(Webdriver.driver);
		actions323.sendKeys(Keys.DELETE);
		actions323.build().perform();
		Actions actions1 = new Actions(Webdriver.driver);
		actions1.sendKeys(Keys.HOME);
		actions1.perform();
		Actions actions2 = new Actions(Webdriver.driver);
		actions2.sendKeys(Keys.NUMPAD1);
		actions2.perform();
		Actions actions3 = new Actions(Webdriver.driver);
		actions3.sendKeys(Keys.TAB);
		actions3.perform();
		Actions actions4 = new Actions(Webdriver.driver);
		actions4.sendKeys(Keys.NUMPAD1);
		actions4.perform();
		Actions actions5 = new Actions(Webdriver.driver);
		actions5.sendKeys(Keys.TAB);
		actions5.perform();
		Actions actions6 = new Actions(Webdriver.driver);
		actions6.sendKeys(Keys.NUMPAD2);
		actions6.perform();
		Actions actions7 = new Actions(Webdriver.driver);
		actions7.sendKeys(Keys.NUMPAD0);
		actions7.perform();
		Actions actions8 = new Actions(Webdriver.driver);
		actions8.sendKeys(Keys.NUMPAD2);
		actions8.perform();
		Actions actions9 = new Actions(Webdriver.driver);
		actions9.sendKeys(Keys.NUMPAD1);
		actions9.perform();
		System.out.println("Date has been entered");

	}

	@Given("^Verify the user can be able to edit the order value in job order$")
	public static void Verify_the_user_can_be_able_to_edit_the_order_value_in_job_order() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue1.click();
		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue1.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue1.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue1.click();
		object_repository.Basha.Object__Reppositoty_JOM.Ordervalue1.sendKeys(ConfigFileReader.getOrder_value1());
		System.out.println("Entered edit order value :" + ConfigFileReader.getOrder_value1());
	}

	@Given("^Verify the user can be able to clear the pricing value in job order$")
	public static void Verify_the_user_can_be_able_to_clear_the_pricing_value_in_job_order() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Clear.click();
		Thread.sleep(3000);
	}

	@Given("^Verify the user can be able to edit the pricing value by using pricing dropdown in job order$")
	public static void Verify_the_user_can_be_able_to_edit_the_pricing_value_by_using_pricing_dropdown_in_job_order()
			throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Pricing2.click();
		Thread.sleep(3000);
	}

	@Given("^Verify the user can be able to edit the pricing value in job order$")
	public static void Verify_the_user_can_be_able_to_edit_the_pricing_value_in_job_order() throws Throwable {
		List<WebElement> DropdownResult = object_repository.Basha.Object__Reppositoty_JOM.Pricing3;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getPricing3())) {
				webElement.click();
				System.out.println("Enter edited pricing value:" + ConfigFileReader.getPricing3());
				break;
			}
		}
	}

	// Edited Stage for job details

	@Given("^Verify whether the user can be able to Edit stage for job details$")
	public static void Verify_whether_the_user_can_be_able_to_Edit_stage_for_job_details() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Stage_for_Job1.click();
		Thread.sleep(3000);
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover3).perform();
		object_repository.Basha.Object__Reppositoty_JOM.Edit1.click();

	}

	@Given("^Verify whether the user can be able to edit percentage for stage details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_percentage_for_stage_details() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Stage_percentage3
				.sendKeys(ConfigFileReader.getStage_percentage3());
		System.out.println("Edited stage percentage:" + ConfigFileReader.getStage_percentage3());

	}

	@Given("^Verify whether the user can be able to edit remarks for stage details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_remarks_for_stage_details() throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Remarks6.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks6.click();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks6.sendKeys(ConfigFileReader.getStage_Remarks6());
		System.out.println("Edited stage remarks:" + ConfigFileReader.getStage_Remarks6());
		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Save14.click();
		Thread.sleep(3000);
		System.out.println("Edited Stage details has been saved");

	}

	@Given("^Verify whether the user can be able to edit percentages for stage details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_percentages_for_stage_details() throws Throwable {
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover4).perform();
		// object_repository.Basha.Object__Reppositoty_JOM.Delete.click();
		object_repository.Basha.Object__Reppositoty_JOM.Edit2.click();
		object_repository.Basha.Object__Reppositoty_JOM.Stage_percentage4
				.sendKeys(ConfigFileReader.getStage_percentage4());
		System.out.println("Edited stage percentage:" + ConfigFileReader.getStage_percentage4());

	}

	@Given("^Verify whether the user can be able to edit remarks and save for stage details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_remarks_and_save_for_stage_details()
			throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Remarks7.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks7.click();
		object_repository.Basha.Object__Reppositoty_JOM.Remarks7.sendKeys(ConfigFileReader.getStage_Remarks7());
		System.out.println("Edited stage remarks:" + ConfigFileReader.getStage_Remarks7());
		Thread.sleep(3000);
		object_repository.Basha.Object__Reppositoty_JOM.Save15.click();
		Thread.sleep(3000);
		System.out.println("Edited Stage details has been saved");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.Basha.Object__Reppositoty_JOM.Okbutton1));
		object_repository.Basha.Object__Reppositoty_JOM.Okbutton1.click();

	}

	// Edit consignee details

	@Given("^Verify whether the user can be able to edit consigneelink details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_consigneelink_details() throws Throwable {

		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover5).perform();
		object_repository.Basha.Object__Reppositoty_JOM.Edit3.click();
		Thread.sleep(2000);
		object_repository.Basha.Object__Reppositoty_JOM.Consignee_name2.click();
		System.out.println("Consingnee name dropdown clicked");
		object_repository.Basha.Object__Reppositoty_JOM.Consignee_name3.sendKeys(ConfigFileReader.getConsignee_name3());
		Thread.sleep(2000);
		object_repository.Basha.Object__Reppositoty_JOM.Save16.click();
		System.out.println("Consingnee name has been saved");

	}

	// Edit Main and sub group description details

	@Given("^Verify whether the user can be able to edit the group description for main group in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_the_group_description_for_main_group_in_invoice_group_details()
			throws Throwable {
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover6).perform();
		object_repository.Basha.Object__Reppositoty_JOM.Edit4.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description2.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description2.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description2
				.sendKeys(ConfigFileReader.getGroup_description2());
		System.out.println("Edited group description for main group:" + ConfigFileReader.getGroup_description2());
		object_repository.Basha.Object__Reppositoty_JOM.Save17.click();
		System.out.println("Invoice main group edited details has been saved");

	}

	@Given("^Verify whether the user can be able to edit the group description for sub group in invoice group details$")
	public static void Verify_whether_the_user_can_be_able_to_edit_the_group_description_for_sub_group_in_invoice_group_details()
			throws Throwable {
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(object_repository.Basha.Object__Reppositoty_JOM.mousehover7).perform();
		object_repository.Basha.Object__Reppositoty_JOM.Edit5.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description3.click();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description3.clear();
		object_repository.Basha.Object__Reppositoty_JOM.Group_description3
				.sendKeys(ConfigFileReader.getGroup_description3());
		System.out.println("Edited group description for sub group:" + ConfigFileReader.getGroup_description3());
		object_repository.Basha.Object__Reppositoty_JOM.Save18.click();
		System.out.println("Invoice sub group edited details has been saved");

	}
	
	@Then("^Verify whether the user can be able to save and submit the entire job order Edited details by using the submit button$")
	public static void Verify_whether_the_user_can_be_able_to_save_and_submit_the_entire_job_order_Edited_details_by_using_the_submit_button()
			throws Throwable {
		object_repository.Basha.Object__Reppositoty_JOM.Submit_edit.click();
		System.out.println("Job order master edited details has been successfully submitted");

	}

}
