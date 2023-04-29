package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonControlObject {
	
	@FindBy(how = How.ID, using="ibtAdvanceSearch")
	public static WebElement advanceSearch;
	
	@FindBy(how = How.XPATH, using="(//*[@id='ibtSearch']//input)[5]")
	public static WebElement docNo;
	
	@FindBy(how = How.XPATH, using="//input[@id='ibtSearch']")
	public static WebElement search;
	
	@FindBy(how = How.ID, using="btnClear")
	public static WebElement clear;
	
	@FindBy(how = How.XPATH, using="//div[text()=' All ']")
	public static WebElement all;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Expired ']")
	public static WebElement expired;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Authorized ']")
	public static WebElement authorized;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Inprogress ']")
	public static WebElement inprogress;
	
	@FindBy(how = How.XPATH, using="//div[text()=' For Action ']")
	public static WebElement forAction;
	
	
	@FindBy(how = How.XPATH, using="//td[@role='gridcell']//div")
	public static WebElement searchDocNumber;
	
	@FindBy(how = How.XPATH, using="//tbody//tr[1]//td[2]//div")
	public static WebElement searchDocNumberApproveorReject;
	
	
	@FindBy(how = How.XPATH, using="//i[@title='Refresh']")
	public static WebElement refresh;
	
	@FindBy(how = How.XPATH, using="//i[@title='Filter']")
	public static WebElement filter;
	
	@FindBy(how = How.XPATH, using="(//input)[2]")
	public static WebElement docfilternumber;
	
	@FindBy(how = How.XPATH, using="//*[@title='Go to the last page']")
	public static WebElement lastPage;
	
	@FindBy(how = How.XPATH, using="//*[@title='Go to the next page']")
	public static WebElement nextPage;
	
	@FindBy(how = How.XPATH, using="//*[@title='Go to the previous page']")
	public static WebElement previousPage;
	
	@FindBy(how = How.XPATH, using="//*[@title='Go to the first page']")
	public static WebElement firstPage;
	
	@FindBy(how = How.XPATH, using="//*[@class='k-pager-info k-label']")
	public static WebElement pageNumberSzie;
	
	@FindBy(how = How.ID, using="profiledropdownbtn") 
	public static WebElement  profileIcon;
	
	@FindBy(how = How.LINK_TEXT, using="Sign Out")
	public static WebElement signOut;
	
	@FindBy(how = How.XPATH, using="//*[@id='lblRateContract']/div/app-landing/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[9]")
	public static WebElement status;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement ok;
	
	@FindBy(how = How.XPATH, using="//li[@class='active ng-star-inserted']//a[1]")
	public static WebElement landingPageTitle;
	
	@FindBy(how = How.TAG_NAME, using="select")
	public static WebElement show;
	
	@FindBy(how = How.XPATH, using="//select/option")
	public static List <WebElement> selectNumberofItems;
	
	@FindBy(how = How.TAG_NAME, using="kendo-pager-info")
	public static WebElement pageInfo;
	
	@FindBy(how = How.XPATH, using="//i[@title='Expand']")
	public static WebElement expand;
	
	@FindBy(how = How.XPATH, using="//i[@title='Collapse']")
	public static WebElement collapse;
	
	@FindBy(how = How.XPATH, using="//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	public static WebElement selectDocument;
	
	@FindBy(how = How.ID, using="ibtAccept")
	public static WebElement approve;
	
	@FindBy(how = How.ID, using="ibtReject")
	public static WebElement reject;
	
	@FindBy(how = How.TAG_NAME, using="textarea")
	public static WebElement approverConfirmationMessage;
	
	@FindBy(how = How.XPATH, using="//button[text()='Yes']")
	public static WebElement yes;
	
	@FindBy(how = How.XPATH, using="(//label[@class='mat-checkbox-layout']//div)[1]")
	public static WebElement selectDocToApprove;
	
	@FindBy(how = How.XPATH, using="//textarea[@placeholder='Remarks']")
	public static WebElement approverRemarks;
	
	@FindBy(how = How.XPATH, using="//eipconfirmationlistmessagebox//p")
	public static WebElement confirmation;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//h1")
	public static WebElement confirmationHeader;
	
	
	@FindBy(how = How.XPATH, using="//eipconfirmationlistmessagebox//h1")
	public static WebElement confirmationHeaderApprover;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//h1")
	public static WebElement successTitle;
	
	@FindBy(how = How.XPATH, using="//eipconfirmationlistmessagebox//p")
	public static WebElement confirmationHeaderBodyrText;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//p")
	public static WebElement successBody;
	
	@FindBy(how = How.CLASS_NAME, using="modulemenu")
	public static WebElement moduleMenu;
	
	@FindBy(how = How.XPATH, using="//span[@title='Supply Chain Mgmt']")
	public static WebElement supplyChainMgmt;
	
	@FindBy(how = How.XPATH, using="//span[@title='Logistics']")
	public static WebElement logistics;
	
	@FindBy(how = How.XPATH, using="//span[@title='Transport Request']")
	public static WebElement transportRequest;
	
	@FindBy(how = How.XPATH, using="//span[@title='Transport Receipt']")
	public static WebElement transportReceipt;

	@FindBy(how = How.XPATH, using="//span[@title='Transport Invoice']")
	public static WebElement transportInvoice;
	
	@FindBy(how = How.XPATH, using="//span[@title='Masters']")
	public static WebElement masters;
	
	@FindBy(how = How.XPATH, using="//span[@title='Rate Contract']")
	public static WebElement rateContract;
	
	@FindBy(how = How.XPATH, using="//div[text()='Transport Request']")
	public static WebElement transportRequestPage;
	
	@FindBy(how = How.ID, id="GribtAttachmentViewer")
	public static WebElement attachmentView;
		
	@FindBy(how = How.XPATH, using="(//i[@title='Document View'])[2]")
	public static WebElement attachmentViewDownload;
	
	@FindBy(how = How.XPATH, xpath="//div[@id='eip-document-viewer']//div[@class='mat-dialog-title']")
	public static WebElement attachmentWindowTitle;
	
	@FindBy(how = How.XPATH, xpath="//*[@class='document-viewer-name']")
	public static WebElement attachedDocumentName;
	
	@FindBy(how = How.XPATH, using="//strong[text()='Transport Rate Contract - Create']")
	private WebElement transportRateContract;
	
}
