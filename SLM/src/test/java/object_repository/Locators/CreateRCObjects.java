package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateRCObjects {

	@FindBy(how = How.XPATH, using="//h6//strong")
	public static WebElement rcHeading;
	
	@FindBy(how = How.XPATH, using="//i[@title='Create RC']")
	public static WebElement createRC;
	
	@FindBy(how = How.ID, using="jobId")
	public static WebElement job;
	
	@FindBy(how = How.XPATH, using="//*[@class='mat-option-text']//span//span")	
	public static List<WebElement> jobList;
	
	@FindBy(how = How.XPATH, using="//i[@title='Filter']")
	public static WebElement filter;
	
	@FindBy(how = How.ID, using="rateContractorId")
	public static WebElement rateContractorsName;
	
	@FindBy(how = How.XPATH, using="//*[@role='listbox']//span//span")
	public static List <WebElement> rateSelectContractorsName;
	
	@FindBy(how = How.XPATH, using="//input[@id='rcTypeId']")
	public static WebElement rCType;
	
	@FindBy(how = How.XPATH, using="(//*[@title='clear'])[3]")
	public static WebElement rCTypeClear;
	
	@FindBy(how = How.XPATH, using="(//*[@title='clear'])[4]")
	public static WebElement rcScopeClear;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> rcTypeList;
	
	@FindBy(how = How.ID, using="rcScopeId")
	public static WebElement rCScope;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> rCScopeList;
	
	@FindBy(how = How.XPATH, using="//label[text()='RC Scope*']/following::input")
	public static WebElement effectiveDate;
	
	@FindBy(how = How.XPATH, using="//label[text()='Effective Date']/following::input")
	public static WebElement reference;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Currency*']")
	public static WebElement currency;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> currencyList;
	
	@FindBy(how = How.XPATH, using="(//span[@title='clear'])[6]")
	public static WebElement clearTransport;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Transport Mode*']")
	public static WebElement transportMode;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> transportModeList;
	
	@FindBy(how = How.ID, using="txtIntRemarks")
	public static WebElement txtIntRemarks;
	
	@FindBy(how = How.ID, using="txtExtRemarks")
	public static WebElement txtExtRemarks;
	
	@FindBy(how = How.XPATH, using="//p[text()='Additional Charges']/following-sibling::i")
	public static WebElement AdditionalCharges;
	
	@FindBy(how = How.XPATH, using="//p[text()='Additional Charges ']")
	public static WebElement additionalCharges;
	
	@FindBy(how = How.ID, using="GribtAdd")
	public static WebElement addCharges;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Select Charges']")
	public static WebElement selectCharges;
	
	@FindBy(how = How.NAME, using="txtAmount")
	public static WebElement amount;
	
	@FindBy(how = How.NAME, using="txtRemarks")
	public static WebElement enterRemarksHere;
	
	@FindBy(how = How.ID, using="btnPOst")
	public static WebElement post;
	
	@FindBy(how = How.XPATH, using="//p[text()='Special Terms & Condition']/following-sibling::i")
	public static WebElement TermsandCondition;
	
	@FindBy(how = How.XPATH, using="//div[text()='Terms and Conditions ']")
	public static WebElement termsAndConditions;
	
	@FindBy(how = How.XPATH, using="//input[contains(@class,'placeholder mat-input-element')]")
	public static WebElement scopeOfWork;
	
	@FindBy(how = How.XPATH, using="//button[text()='Save']")
	public static WebElement save;
	
	@FindBy(how = How.ID, using="vehicleTypeId")
	public static WebElement vehicleType;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> vehicleTypeList;
	
	@FindBy(how = How.ID, using="minWeightID")
	public static WebElement minGuarantyWeight;
	
	@FindBy(how = How.ID, using="maxWeightID")
	public static WebElement maxWeightCapacity;
	
	@FindBy(how = How.ID, using="fromCountryId")
	public static WebElement fromCountry;
	
	@FindBy(how = How.XPATH, using="(//*[@class='fa fa-times cursor-pointer ng-star-inserted'])[10]")
	public static WebElement fromCountryClose;		
	
	@FindBy(how = How.XPATH, using="(//*[@class='fa fa-times cursor-pointer ng-star-inserted'])[11]")
	public static WebElement toCountryClose;	
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> chooseFromCountry;
	
	@FindBy(how = How.ID, using="toCountryId")
	public static WebElement toCountry;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> chooseToCountry;
	
	@FindBy(how = How.ID, using="fromStateId")
	public static WebElement fromState;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> choosefromState;
	
	@FindBy(how = How.ID, using="toStateId")
	public static WebElement toState;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> choosetoState;
	
	
	@FindBy(how = How.ID, using="fromCityId")
	public static WebElement fromCity;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> choosefromCity;
	
	@FindBy(how = How.ID, using="toCityId")
	public static WebElement toCity;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> choosetoCity;
	
	@FindBy(how = How.ID, using="fromLocationId")
	public static WebElement fromLocation;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> choosefromLocation;
	
	@FindBy(how = How.ID, using="toLocationId")
	public static WebElement toLocation;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> chooseToLocation;
	
	@FindBy(how = How.ID, using="terrainTypeId")
	public static WebElement terrainType;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> chooseterrainType;
	
	@FindBy(how = How.ID, using="approxDistID")
	public static WebElement approxDistanceIn;
	
	@FindBy(how = How.ID, using="rpvID")
	public static WebElement ratePerV;
	
	@FindBy(how = How.ID, using="rateMtID")
	public static WebElement ratePerMTID;
	
	@FindBy(how = How.ID, using="approxHrID")
	public static WebElement approxTransitHour;
	
	@FindBy(how = How.XPATH, using="//div[text()='Rate Per Vehicle ']")
	public static WebElement ratePerVehicle;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Rate per MT ']")
	public static WebElement ratePerMT;
	
	@FindBy(how = How.XPATH, using="//button[text()='Add']")
	public static WebElement add;
	
	@FindBy(how = How.XPATH, using="(//label[text()='Approx Transit Hour']/following::input)[2]")
	public static WebElement paymentRelease;
	
	@FindBy(how = How.XPATH, using="//div[@class='payment-progress-container']//p[1]")
	public static WebElement paymentReleaseMatch;
	
	@FindBy(how = How.XPATH, using="//i[@title='Add']")
	public static WebElement addPayments;
	
	@FindBy(how = How.XPATH, using="//input[@ng-reflect-id='Percent1']")
	public static  WebElement newpaymentRelease;
	
	@FindBy(how = How.XPATH, using="(//i[@title='Delete'])[3]")
	public static WebElement delete;
	
	@FindBy(how = How.XPATH, using="(//label[text()='Approx Transit Hour']/following::input)[3]")
	public static WebElement paymentEvents;
		
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> paymentEventsList;
	
	@FindBy(how = How.ID, using="RefValue0")
	public static WebElement referecneValue;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> referecneValuelist;
	
	@FindBy(how = How.ID, using="creditDays0")
	public static WebElement creditDays;
	
	@FindBy(how = How.ID, using="PaymentMode0")
	public static WebElement PaymentMode;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> PaymentModeList;
	
	@FindBy(how = How.ID, using="RefDateValue0")
	public static WebElement RefDateValue;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List<WebElement> RefDateValueList;
	
	@FindBy(how = How.ID, using="multi-select-input-lstDocumentList0")
	public static WebElement lstDocumentList;
	
	@FindBy(how = How.XPATH, using="//span[text()=' Select All']")
	public static WebElement selectAll;
	
	@FindBy(how = How.ID, using="btnSAVEDRAFT")
	public static WebElement saveDraft;
	
	@FindBy(how = How.TAG_NAME, using="h1")
	public static WebElement success;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//p")
	public static WebElement newrcnumber;
	
	@FindBy(how = How.ID, id="vehicleTypeId")
	public static WebElement selectedVehicle;
	
	@FindBy(how = How.ID, id="terrainTypeId")
	public static WebElement selectedTerrian;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement acceptSuccessMessage;
	
	@FindBy(how = How.XPATH, using="//*[@id='lblRateContract']/div/app-landing/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[9]")
	public static WebElement status;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement ok;
	
	@FindBy(how = How.ID, using="GibtEdit")
	public static WebElement edit;
	
	@FindBy(how = How.XPATH, using="/html/body/app-root/div/div[2]/app-create-edit/div[4]/button[3]")
	public static WebElement submit;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//p")
	public static WebElement ErrorMessage;

	@FindBy(how = How.XPATH, using="/html/body/app-root/div/div[2]/app-create-edit/div[3]/mat-accordion/mat-expansion-panel[1]/div/div/div/div/div[7]/eipautocomplete/mat-form-field/div/div[1]/div[2]/span")
	public static WebElement closeCurrency;
	
	@FindBy(how=How.XPATH, xpath="//eipmessagebox//button[1]")
	public static WebElement ConfirmationYes;
	
	@FindBy(how=How.XPATH, xpath="/html/body/app-root/div/div[2]/app-create-edit/div[3]/mat-accordion/mat-expansion-panel[1]/div/div/div/div/div[3]/eipautocomplete/mat-form-field/div/div[1]/div[2]/span")
	public static WebElement clearRCType;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-weixin']")
	public static WebElement chat;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-attachment-viewer']")
	public static WebElement attachmentViewer;
	
	@FindBy(how = How.ID, using="GibtCancel")
	public static WebElement cancel;
	
	@FindBy(how = How.XPATH, using="//div[text()=' For Action ']")
	public static WebElement forAction;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Inprogress ']")
	public static WebElement inprogress;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Authorized ']")
	public static WebElement authorized;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Expired ']")
	public static WebElement expired;
	
	@FindBy(how = How.XPATH, using="//i[@id='ibtRecall']")
	public static WebElement recall;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-binoculars']")
	public static WebElement viewWorkflow;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[2]//td[1]")
	public static WebElement creater;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[1]//td[2]")
	public static WebElement approver;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[2]//td[5]")
	public static WebElement createrStatus;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[2]//td[6]")
	public static WebElement createrActionStatus;
			
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[2]//td[8]")
	public static WebElement createrActionRemarks;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[1]//td[8]")
	public static WebElement approverActionRemarks;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[1]//td[6]")
	public static WebElement approverActionStatus;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list)[2]//tr[2]//td[5]")
	public static WebElement approverrStatus;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-content']/following-sibling::span[1]")
	public static WebElement workflowHistoryExpand;
	
	@FindBy(how = How.XPATH, using="//i[@title='Refresh']")
	public static WebElement refresh;
	
	@FindBy(how = How.XPATH, using="//mat-panel-title[@class='mat-expansion-panel-header-title']//span")
	public static WebElement workflowHistory;
	
	@FindBy(how = How.ID, using="profiledropdownbtn")
	public static WebElement profileIcon;
	
	@FindBy(how = How.XPATH, using="//a[contains(@class,'loginout-btn btn')]")
	public static WebElement signOut;
	
	@FindBy(how = How.XPATH, using="//i[@title='accept']")
	public static WebElement approveIcon;
	
	@FindBy(how = How.XPATH, using="//i[@title='Reject']")
	public static WebElement rejectIcon;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-binoculars']")
	public static WebElement viewWorkflowIcon;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-weixin']")
	public static WebElement discussion;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-weixin']")
	public static WebElement attachmentView;
	
	@FindBy(how = How.XPATH, using="//input[@id='ibtSearch']")
	public static WebElement search;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[2]")
	public static WebElement landingPageDate;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[3]")
	public static WebElement RateContracter;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[4]")
	public static WebElement RCType;
		
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[5]")
	public static WebElement effectifeFromDate;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[6]")
	public static WebElement effectifeToDate;	
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[7]")
	public static WebElement currencyType;	
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[8]")
	public static WebElement referenceNumber;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[9]")
	public static WebElement landingPageStatus;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Rate per MT ']")
	public static WebElement ratePerMetricTon;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-paperclip']")
	public static WebElement attachment;
		
	@FindBy(how = How.XPATH, using="(//*[@id='uploadDocModal']//div)[3]")
	public static WebElement attachmentWindowTitle;
	
	@FindBy(how = How.XPATH, using="//*[text()='Select files from computer']")
	public static WebElement files;
	
	@FindBy(how = How.XPATH, using="//*[text()='--Select--']")
	public static WebElement viewAttachedFiels;
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-select-arrow'])[1]")
	public static WebElement fileType;
	
	@FindBy(how = How.XPATH, using="(//span[@class='mat-option-text'])")
	public static List <WebElement> selectFileType;
	
	@FindBy(how = How.XPATH, using="//button[@title='Upload Documents']")
	public static WebElement uploadFile;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//h1")
	public static WebElement verifySuccessMessage;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//div//p")
	public static WebElement verifySuccessMessageText;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement verfiedMessage;
	
	@FindBy(how = How.XPATH, using="//*[@title='Upload Documents']")
	public static WebElement uploadDocument;
	
}