package object_repository.Sneha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepdefinition.Webdriver;


public class FinancePageObjects {
	
	
	
	//MU-> Menu
	//BU-> Button
	//TB-> Text box
	//TX-> Text
	//CLN-> Column Name
	// Login locators//
	//HD-Header
	
	public @FindBy(xpath = "//*[text()='Other User']") static  WebElement  MUotheruser;
	public @FindBy(id = "username") static  WebElement  TBUsername;
	public @FindBy(xpath = "//*[@placeholder='Password']") static  WebElement  TBPassword;
	public @FindBy(xpath = "//*[text()=' Login ']") static  WebElement  BULogin;
	public @FindBy(xpath = "//*[@title = 'Access Based Menu']") static  WebElement MUHomeMenu;
	public @FindBy(xpath = "//*[text()='Finance']") static  WebElement MUFinance;
	public @FindBy(xpath ="//*[text()='Financial Accounts']") static  WebElement MUFinancialAccounts;
	public @FindBy(xpath ="//*[text()='General Cash / Bank Request']") static  WebElement MUGeneralCashBankRequest;
	public @FindBy(xpath ="(//*[contains (text(),'General Cash')])[3]") static WebElement TXGeneralCash;
	public @FindBy(xpath = "//*[text()='For Action ']") static  WebElement MUForAction;
	public @FindBy(xpath = "//*[text()='In Progress ']") static  WebElement MUInProgress;
	public @FindBy(xpath = "//*[text()='Approved ']") static  WebElement MUApproved;
	public @FindBy(xpath = "//*[text()='Rejected ']") static  WebElement MURejected;
	public @FindBy(xpath = "//*[text()='Paid/Received ']") static  WebElement MUPaidReceived;
	public @FindBy(xpath = "//*[text()='All ']") static  WebElement MUAll;
	public @FindBy(xpath = "//*[text()='Details']") static  WebElement TXDetails;
	public @FindBy(xpath = "//*[text()='Document No.']") static  WebElement CLNDocumentNo;
	public @FindBy(xpath = "//*[text()='Remarks']") static  WebElement CLNRemarks;
	public @FindBy(xpath = "//*[text()='Document Type']") static  WebElement CLNDocumentType;
	public @FindBy(xpath = "//*[text()='Currency']") static  WebElement CLNCurrency;
	public @FindBy(xpath = "//*[text()='Total Amount']") static  WebElement CLNTotalAmount;
	public @FindBy(xpath = "//*[text()='Mode']") static  WebElement CLNMode;
	public @FindBy(xpath = "//*[text()='Favouring']") static  WebElement CLNFavouring;
	public @FindBy(xpath = "//*[text()='Status']") static  WebElement CLNStatus;
	public @FindBy(xpath = "//*[text()='Due Date']") static  WebElement CLNDueDate;
	public @FindBy(xpath = "//*[text()='BR Date']") static  WebElement CLNBRDate;
	public @FindBy(xpath = "//*[text()='Lock Status']") static  WebElement CLNLockStatus;
	public @FindBy(xpath = "//*[text()='Allocation Status']") static  WebElement CLNAllocationStatus;
	public @FindBy(xpath = "//*[@title='Create']") static  WebElement BUCreate;
	public @FindBy(xpath = "(//payment-receipt-create/div)[1]") static  WebElement TXCreateRequest;
	public @FindBy(xpath = "//mat-expansion-panel-header//div//div") static  WebElement TXRegisterDetails ;
	//public @FindBy(id="accHeader") static  WebElement TXRegisterDetails ;
	public @FindBy(xpath = "(//*[text()='Details'])[2]") static  WebElement TXPageDetails;
	public @FindBy(xpath = "//*[@title='Job Cart']") static  WebElement BUJobCart;
	public @FindBy(xpath = "(//app-payment-job-cart/div/div)[1]") static  WebElement TXJobCart;	
	public @FindBy(xpath = "(//app-payment-job-cart/div/div)[1]") static  WebElement HDJobCart;	
	public @FindBy(xpath = "//*[text()=' Selected Items ']") static  WebElement HDSelectedItems;	
	public @FindBy(xpath = "(//*[text()='Post'])[2]") static  WebElement BUPost;
	public @FindBy(xpath = "(//mat-dialog-container//td)[10]") static  WebElement TXValidationMessage;
	public @FindBy(xpath = "//*[text()='OK']") static  WebElement BUOK;
	public @FindBy(xpath = "(//i[@class='fa fa-times-circle pull-right'])[2]") static  WebElement BUClose;
	public @FindBy(xpath = "//*[@title='Upload Document']") static  WebElement BUUploadDocumentIcon;
	public @FindBy(xpath = "(//app-documentupload/div/div/div/div)[1]") static  WebElement TXAttachDocuments;
	public @FindBy(xpath = "//*[text()='Cancel']") static  WebElement BUCancel;
	public @FindBy(xpath = "//*[text()='Upload Documents']") static  WebElement BUUploadDocuments;
	public @FindBy(xpath = "//*[@title='Close']") static  WebElement BUCloseUploadDocument;
	public @FindBy(xpath = "//*[@id='lstDocType']") static   WebElement DocumentType;
	public @FindBy(xpath = "//mat-option//span//span") static   List<WebElement> LIDocumentType;
	public @FindBy(xpath = "//*[@id='lstRegType']") static   WebElement RegisterType;
	public @FindBy(xpath = "//mat-option//span//span") static   List<WebElement> LIRegisterType;
	public @FindBy(xpath = "(//*[@title='clear'])[4]") static   WebElement ClearJobCode;
	public @FindBy(xpath = "//*[@id='lstJobCode']") static WebElement  JobCode;
	public @FindBy(xpath = "//mat-option//span//span//span") static WebElement  ClickJobCode;
	public @FindBy(xpath = "(//*[@title='clear'])[5]") static   WebElement ClearAccountingCenter;
	public @FindBy(xpath = "//*[@id='lstCBVAcc']") static WebElement  AccountingCenter;
	public @FindBy(xpath = "//mat-option//span//span//span") static WebElement  ClickAccountingCenter;
	public @FindBy(xpath = "(//*[@class='fa fa-times cursor-pointer ng-star-inserted'])[6]") static WebElement ClearVoucherAmount;
	public @FindBy(xpath = "//*[@placeholder='Voucher Amount']") static WebElement  VoucherAmount;
	public @FindBy(xpath = "//*[@placeholder='Favouring']") static WebElement  Favouring;
	public @FindBy(xpath = "//*[@placeholder='Purpose']") static WebElement  Purpose;
	//public @FindBy(xpath = "((//*[text()='Cheque'])[6]") static WebElement  ModeDownArrow;
	public @FindBy(xpath = "//*[@id='lstModeType']") static WebElement  ModeType;
	public @FindBy(xpath = "(//mat-option//span//span)") static List<WebElement>  LIModeTypeCheque;
	public @FindBy(xpath = "//*[@title='Toggle calendar']") static WebElement  CalendarIcon;
	public @FindBy(xpath = "//*[text()=' TODAY ']") static WebElement  SelectTodayDate;
	public @FindBy(xpath = "//*[@id='imgbtnCart']") static WebElement  ClickJobCart;
	public @FindBy(xpath = "//*[contains(@placeholder,'enter min of 3 char')]") static WebElement  EnterJobCode;
	public @FindBy(xpath = "//*[contains (text(),'Shared Services')]") static WebElement  SelectJobCode;
	public @FindBy(xpath = "//*[@title='Select']") static WebElement  SelectArrow;
	public @FindBy(xpath = "(//*[text()='Post'])[2]") static WebElement  ClickPostButton;
	
	
	
}