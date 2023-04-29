package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderMaster {
	
	public @FindBy(xpath = "//span[text()='<--Select the Order Type-->']") static WebElement ClickOrderType;
	public @FindBy(xpath = "//ul[@id='JobOrders_OrderTypeCode_listbox']/li[2]") static WebElement SelectOrderType;
	public @FindBy(id = "JobOrders_OrderDescription") static WebElement OrderDescription;
	public @FindBy(id = "JobOrders_JobCode") static WebElement EnterJobCode;
	public @FindBy(xpath = "//ul[@id='JobOrders_JobCode_listbox']/li[1]") static WebElement SelectJobCode;
	public @FindBy(id = "JobOrders_CustomerCode") static WebElement Customer;
	public @FindBy(xpath = "//ul[@id='JobOrders_CustomerCode_listbox']/li[1]") static WebElement selectCustomer;
	public @FindBy(xpath = "//span[text()='Select Customer branch']") static WebElement ClickCustomerBranch;
	public @FindBy(xpath = "//ul[@id='JobOrders_CustomerBranchCode_listbox']/li[2]") static WebElement SelectCustomerBranch;
	public @FindBy(id = "JobOrders_ClientOrderNumber") static WebElement ClientOrderNumber;
	public @FindBy(id = "JobOrders.TenderRefNumber") static WebElement TenderReferenceNumber;
	public @FindBy(id = "JobOrders.TenderDescription") static WebElement TenderDescription;
	public @FindBy(id = "JobOrders.ReferenceNumber") static WebElement OurRefNumber;
	public @FindBy(xpath = "//button[@data-value='OrderDespatch']") static WebElement ClickDespatch;
	public @FindBy(id = "txtDescription") static WebElement EnterInvoiceMessage;
	public @FindBy(xpath = "//button[@value='OrderDespatch']") static WebElement DespatchOk;
	public @FindBy(xpath = "//button[@data-value='OrderDespatch']/following::button") static WebElement ClickCommercial;
	public @FindBy(xpath = "//span[text()='<--Select Billing Type-->']") static WebElement ClickBillingType;
	public @FindBy(xpath = "//ul[@id='CommercialDetails_BillingTypeCode_listbox']/li[2]") static WebElement ChooseDirectBilling;
	public @FindBy(xpath = "//input[@placeholder='Enter Order Value']") static WebElement ClickOrderValue;
	public @FindBy(xpath = "//label[@for='OrderValue']/following::input") static WebElement OrderValue;
	public @FindBy(xpath = "//span[text()='INR-Indian rupee']") static WebElement Currency;
	
	public @FindBy(xpath = "//span[@aria-controls='JobOrders_ExpiryDate_dateview']") static WebElement ExpiryDate;
	public @FindBy(xpath = "//span[@aria-controls='JobOrders_ClientOrderDate_dateview']") static WebElement OrderRefDate;
	public @FindBy(xpath = "//div[@class='lti-alert-msg']/label") static WebElement OrderSuccess;
	public @FindBy(xpath = "//a[contains(@class, 'k-nav-prev')]") static WebElement PreviousYear;
	public @FindBy(xpath = "//a[contains(@class, 'k-nav-fast')]") static WebElement CurrentYear;
	public @FindBy(xpath = "//a[contains(@class, 'k-nav-next')]") static WebElement NextYear;
	public @FindBy(id = "JobOrders_OrderValue") static WebElement ClearAndEnterOrderValue;
	public @FindBy(xpath = "//button[@value='Commercial']") static WebElement CommericialOk;
	public @FindBy(xpath = "//button[@value='submit']") static WebElement Submit;
	public @FindBy(xpath = "//a[contains(@class,'k-window-action k-link')]") static WebElement CloseOrderMasterCreateSuccessMessage;
	//=====================Approval======================//
	
	public @FindBy(xpath = "//input[@id='update']") static WebElement Edit;
	public @FindBy(xpath = "//span[@aria-controls='SearchFilter_FromDate_dateview']") static WebElement orderApprovalFromDate;
	//=====================Approval======================//
	public @FindBy(id = "authorize") static WebElement Approval;
	public @FindBy(xpath = "//input[@placeholder='Enter the Order Number']") static WebElement ApprovalOrderNumber;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']/li[1]") static WebElement SelectApprovalOrderNumber;
	public @FindBy(xpath = "//input[@data-val='Approval']/following::button") static WebElement GoApproval;
	public @FindBy(xpath = "//a[@class='ShowEdit']/following::input") static WebElement selectCheckBox;
	public @FindBy(xpath = "(//a[@class='ShowEdit']/following::input)[3]") static WebElement selectSecondCheckBox;
		public @FindBy(xpath = "(//a[@class='ShowEdit']/following::input)[2]") static WebElement selectRejectCheckBox;
	public @FindBy(xpath = "//button[@id='Cancel']") static WebElement SubmitApproval;
	
	
	//=====================Cancel======================//
	public @FindBy(id = "cancel") static WebElement Cancel;
	public @FindBy(xpath = "//input[@data-original-title='Cancel']/following::input[6]") static WebElement CancelOrderNumber;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']/li[1]") static WebElement SelectCancelOrderNumber;
	public @FindBy(id = "submit") static WebElement GoCancel;
	public @FindBy(xpath = "//a[@class='ShowEdit']/following::input") static WebElement selectCancelCheckBox;
	public @FindBy(xpath = "(//a[@class='ShowEdit']/following::input)[2]") static WebElement selectSecondCancelCheckBox;
	public @FindBy(xpath = "//button[@id='Cancel']") static WebElement SubmitCancel;
	
	//=====================Close======================//
	public @FindBy(id = "close") static WebElement Close;
	public @FindBy(xpath = "//input[@data-original-title='Close']/following::input[4]") static WebElement CloseOrderNumber;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']/li[1]") static WebElement SelectCloseOrderNumber;
	public @FindBy(id = "submit") static WebElement GoClose;
	public @FindBy(xpath = "//a[@class='ShowEdit']/following::input") static WebElement selectCloseCheckBox;
	public @FindBy(xpath = "(//a[@class='ShowEdit']/following::input)[2]") static WebElement selectSecondCloseCheckBox;
	public @FindBy(xpath = "//button[@id='Close']") static WebElement SubmitClose;
	

}