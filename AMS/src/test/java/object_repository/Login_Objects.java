package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dataProviders.ConfigFileReader;

public class Login_Objects {
	
	//Login
	public @FindBy(linkText = "Other User") static WebElement Otheruser;
	public @FindBy(id = "username") static WebElement Username;
	public @FindBy(id = "password-field") static WebElement Password;
	public @FindBy(id = "login-submit") static WebElement Login;
	public @FindBy(xpath = "//i[@class='fa fa-home']") static WebElement Home;
	public @FindBy(id = "profiledropdownbtn") static WebElement profileDr;
	public @FindBy(linkText = "Sign Out") static WebElement Signout;
	
	//Navigation
	public @FindBy(xpath = "//*[@class='modulemenu']") static WebElement ClickMenu;
	public @FindBy(xpath = "//*[text()='Asset Mgmt']") static WebElement AssetMgmt;
	public @FindBy(xpath = "//*[text()='Asset Mgmt.']") static WebElement AssetMgmts;
	public @FindBy(xpath = "//*[text()='AMS 4.0']") static WebElement AMSo;
	public @FindBy(xpath = "//*[text()='Operations & Maintenance']") static WebElement OAM;
	public @FindBy(xpath = "(//*[text()='Access & Master'])[1]") static WebElement AccessMaster;
	public @FindBy(xpath = "(//*[text()='Access Control'])[1]") static WebElement AccessControl;
	public @FindBy(xpath = "(//*[text()='Workflow'])[1]") static WebElement Workflow;
	public @FindBy(xpath = "(//*[text()='WorkBench'])[1]") static WebElement WorkBench;
	
	
	
	//LogSheet landing Page
	public @FindBy(xpath = "//*[text()='Log Sheet']") static WebElement LogSheet;
	public @FindBy(xpath = "//*[@data-placeholder='Job']") static WebElement JobCode;
	public @FindBy(xpath = "//input[@ng-reflect-placeholder='Asset Code']") static WebElement AssetCode;
	public @FindBy(xpath = "(//*[@id=\"icon-rightdateRange_Kendo\"])[1]") static WebElement Duration;
	public @FindBy(xpath = "//i[@title='Go']") static WebElement Go;
	public @FindBy(xpath = "//i[@title='Refresh']") static WebElement Refresh;
	public @FindBy(xpath = "//i[@title='Create New Logsheet']") static WebElement CreateNewLogsheet;
	
	//LogSheet Time based
	public @FindBy(xpath = "//a[text()='Time Based']") static WebElement TimeBased;
	public @FindBy(xpath = "//button[text()='Yes']") static WebElement ConfirmationYes;
	public @FindBy(xpath = "//button[@id='btnAddWorkReading']") static WebElement Work;
	public @FindBy(xpath = "//p[text()='Idle ']") static WebElement Idle;
	public @FindBy(xpath = "//p[text()='Auto Idle ']") static WebElement AutoIdle;
	public @FindBy(xpath = "(//p[text()='Breakdown '])[2]") static WebElement BreakDown;
	public @FindBy(xpath = "//span[@class='ng-star-inserted']") static WebElement StartMeterReading;
	public @FindBy(xpath = "((//input[@ng-reflect-events='[object Object]'])[2])") static WebElement EndMeterReading;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[4]") static WebElement DayEndMeterReading;
	public @FindBy(xpath = "//span[@class='r-b fs-16']") static WebElement DayStartMeterReading;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[6]") static WebElement BreakdownHours;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[7]") static WebElement DayBasedProductionQty;
	public @FindBy(xpath = "(//i[@class='fa fa-plus-circle'])[2]") static WebElement CPWBSEntry;
	
	
	
	
	public @FindBy(xpath = "(//input[@ng-reflect-scope='[object Object]'])[2]") static WebElement StartTime;
	public @FindBy(xpath = "(//input[@ng-reflect-scope='[object Object]'])[3]") static WebElement EndTime;
	public @FindBy(xpath = "(//input[@class='k-input k-formatted-value'])[1]") static WebElement ProductionQty;
	public @FindBy(xpath = "(//button[@dir='ltr'])[3]") static WebElement ActionSave;
	public @FindBy(xpath = "(//button[@dir='ltr'])[4]") static WebElement ActionSave1;
	public @FindBy(xpath = "//*[text()=' Breakdown ']") static WebElement BreakDownBtn;
	public @FindBy(xpath = "//*[text()='Submit']") static WebElement LogSheetSubmit;
	public @FindBy(xpath = "//*[text()='Save']") static WebElement LogSheetSave;
	public @FindBy(xpath = "//*[text()='Back']") static WebElement LogSheetBack;
	
	////LogSheet Day based
	public @FindBy(xpath = "//a[text()='Day Based']") static WebElement DayBased;
	
	//BreakDown
	public @FindBy(xpath = "(//input[@ng-reflect-autocomplete='[object Object]'])[1]") static WebElement BreakDownType;
	public @FindBy(xpath = "//*[@id=\"cdk-accordion-child-0\"]/div/div/div[1]/eipautocomplete/mat-form-field/div/div[1]/div[2]") static WebElement BreakdownTypeClear;
	public @FindBy(xpath = "//*[text()='1 - BREAK-DOWN']") static WebElement SelectBreakDown;
	public @FindBy(xpath = "//*[text()='3 - UPGRADE']") static WebElement SelectUpgrade;
	public @FindBy(xpath = "//*[text()='2 - MAINTENANCE']") static WebElement SelectMaintenance;
	public @FindBy(xpath = "(//input[@ng-reflect-events='[object Object]'])[1]") static WebElement BreakdownFromDate;
	public @FindBy(xpath = "(//kendo-dropdownlist[@dir='ltr'])[1]") static WebElement BreakdownFromTime;
	public @FindBy(xpath = "//li[@index='3']") static WebElement SelectBreakdownFromTime;
	public @FindBy(xpath = "(//input[@ng-reflect-autocomplete='[object Object]'])[2]") static WebElement NatureOfDefect;
	public @FindBy(xpath = "(//input[@role='spinbutton'])[2]") static WebElement ExpCommissioningDate;
	public @FindBy(xpath = "(//kendo-dropdownlist[@dir='ltr'])[2]") static WebElement ExpCommissioningTime;
	public @FindBy(xpath = "//li[text()='04 : 00']") static WebElement SelectExpCommissioningTime;
	public @FindBy(xpath = "//*[@id='remarksInput']") static WebElement BreakdownRemarks;
	public @FindBy(xpath = "(//input[@role='spinbutton'])[1]") static WebElement BreakdownFromDateCalender;
	public @FindBy(xpath = "//button[text()='Submit']") static WebElement BreakdownSubmit;
	public @FindBy(xpath = "//button[text()='Ok']") static WebElement Ok;
	public @FindBy(xpath = "(//span[@class='mat-button-toggle-label-content'])[1]") static WebElement BreakDownTab;
	public @FindBy(xpath = "//div[text()=' Save as Draft ']") static WebElement DERSaveasDraft;
	
	
	
	//Commissioning
	public @FindBy(xpath = "(//span[@class='mat-button-toggle-label-content'])[3]") static WebElement CommisioningTab;
	public @FindBy(xpath = "(//span[@aria-haspopup='listbox'])[1]") static WebElement CommisioningTime;
	public @FindBy(xpath = "//li[text()='04 : 00']") static WebElement SelectCommissioningTime;
	public @FindBy(xpath = "(//span[@aria-label='Toggle calendar'])[2]") static WebElement NextMaintanenceDate;
	public @FindBy(xpath = "//textarea[@id='txtfailureCause']") static WebElement FailureInvestigation;
	public @FindBy(xpath = "(//span[@class='mat-button-toggle-label-content'])[4]") static WebElement Own;
	public @FindBy(xpath = "(//span[@class='mat-button-toggle-label-content'])[5]") static WebElement Agency;
	public @FindBy(xpath = "(//span[@class='mat-button-toggle-label-content'])[6]") static WebElement Both;
	public @FindBy(xpath = "(//input[@class='k-input'])[3]") static WebElement Vendor;
	public @FindBy(xpath = "//*[@id=\"pnmInc\"]") static WebElement PM_Incharge;
	public @FindBy(xpath = "//b[text()='Work Done ']//following::textarea[1]") static WebElement WorkDone;
	public @FindBy(xpath = "//b[text()='Work Done ']//following::textarea[2]") static WebElement CommissioningRemarks;
	public @FindBy(xpath = "//span[@class='ff-3 fs-14']") static WebElement PrimaryEngineMeterType;
	public @FindBy(xpath = "//button[text()='Submit']") static WebElement CommissioningSubmit;
	
	
	public @FindBy(xpath = "//*[text()='Break Down Entry']") static WebElement BreakDownEntry;
	public @FindBy(xpath = "//*[@data-placeholder='Job']") static WebElement BreakDownJobCode;
	public @FindBy(xpath = "//input[@ng-reflect-placeholder='Asset']") static WebElement BreakDownAssetCode;
	public @FindBy(xpath = "//input[@id='icon-rightdateRange_Kendo']") static WebElement BreakDownDuration;
	public @FindBy(xpath = "//button[text()=' Search ']") static WebElement Search;
	public @FindBy(xpath = "(//a[@class='eip-link ng-star-inserted'])[1]") static WebElement BreakDownAsset;
	public @FindBy(xpath = "//i[@title='Add']") static WebElement AddBreakDown;
	
	
	
	//Detailed Estimation
	public @FindBy(xpath = "(//span[@class='mat-button-toggle-label-content'])[2]") static WebElement DetailedEstimationTab;
	//FailureInvestigation
	public @FindBy(xpath = "(//p[@class='ff-3 fs-16 '])[1]") static WebElement FailureInvestigationTab;
	public @FindBy(xpath = "//textarea[@rows='4']") static WebElement CauseOfFailure;
	
	//Sub Assembly
	public @FindBy(xpath = "(//p[@class='ff-3 fs-16 '])[2]") static WebElement SubAssemblyTab;
	public @FindBy(xpath = "(//i[@class='fa fa-caret-down float-right mr-1'])[2]") static WebElement SubAssemblyDropDown;
	public @FindBy(xpath = "//span[text()='2 - ELECTRICAL MOTORS']") static WebElement SubAssembly;	
	public @FindBy(xpath = "//input[@placeholder='Agency Name']") static WebElement AgencyName;
	public @FindBy(xpath = "//li[@index='2']") static WebElement SelectAgencyName;
	
	public @FindBy(xpath = "(//input[@aria-invalid='false'])[4]") static WebElement NatureOfRepair;
	public @FindBy(xpath = "(//input[@type='number'])[1]") static WebElement SparesCost;
	public @FindBy(xpath = "(//input[@type='number'])[2]") static WebElement LabourCost;
	public @FindBy(xpath = "(//input[@type='number'])[3]") static WebElement OilCost;
	public @FindBy(xpath = "(//input[@type='number'])[4]") static WebElement ConsumableCost;
	public @FindBy(xpath = "(//input[@type='number'])[5]") static WebElement AgencyRepairCost;
	public @FindBy(xpath = "(//input[@type='number'])[6]") static WebElement OthersCost;
	public @FindBy(xpath = "//div[text()=' Clear']") static WebElement SubAssemblyClear;
	public @FindBy(xpath = "//div[text()=' Save']") static WebElement SubAssemblySave;

	// Major Spares
	public @FindBy(xpath = "(//p[@class='ff-3 fs-16 '])[3]") static WebElement MajorSparesTab;
	public @FindBy(xpath = "//input[@class='k-input']") static WebElement Materials;
	public @FindBy(xpath = "//li[@index='0']") static WebElement SelectMaterials;
	public @FindBy(xpath = "(//input[@type='text'])[2]") static WebElement PartNo;
	public @FindBy(xpath = "(//input[@type='text'])[3]") static WebElement PartName;
	public @FindBy(xpath = "(//input[@type='number'])[1]") static WebElement Quantity;
	public @FindBy(xpath = "(//input[@type='number'])[2]") static WebElement Amount;
	public @FindBy(xpath = "//textarea[@rows='4']") static WebElement MajorSparesRemarks;
	public @FindBy(xpath = "//div[text()='Clear']") static WebElement MajorSparesClear;
	public @FindBy(xpath = "//div[text()='Save ']") static WebElement MajorSparesSave;
	public @FindBy(xpath = "//div[text()=' Clear ']") static WebElement DetailedEstimateClear;
	public @FindBy(xpath = "//div[text()=' Save as Draft ']") static WebElement DetailedEstimateDraft;
	public @FindBy(xpath = "//div[text()='Submit ']") static WebElement DetailedEstimateSubmit;
	public @FindBy(xpath = "//i[@style='cursor: pointer']") static WebElement WorkflowTrace;
	public @FindBy(xpath = "//i[@Class='fa fa-paperclip']") static WebElement Attachment;
	public @FindBy(xpath = "//i[@title='View all details']") static WebElement View;
	public @FindBy(xpath = "(//input[@ng-reflect-type='text'])[1]") static WebElement Currency;

	//DER Approval
	
	public @FindBy(xpath = "//*[@title='Filter']") static WebElement Filter;
	public @FindBy(xpath = "(//input[@class='k-textbox ng-untouched ng-pristine ng-valid'])[2]") static WebElement DocumentNo;
	public @FindBy(xpath = "(//a[@class='eip-link ng-star-inserted'])[1]") static WebElement SelectDER;
	public @FindBy(xpath = "(//span[@class=\"ng-star-inserted\"]//following::i)[12]") static WebElement ApproveDER;
	public @FindBy(xpath = "(//span[@class=\"ng-star-inserted\"]//following::i)[13]") static WebElement RejectDER;
	public @FindBy(xpath = "//textarea[@placeholder='Remarks']") static WebElement RejectionRemarks;
	public @FindBy(xpath = "//button[text()='Yes']") static WebElement RejectionYes;
	public @FindBy(xpath = "//button[text()='No']") static WebElement RejectionCancel;
	
	public @FindBy(xpath = "(//span[@role='button'])[2]") static WebElement calndr2;
	public @FindBy(xpath = "(//span[@role='button'])[1]") static WebElement calndr1;
	public @FindBy(xpath = "//li[@data-date-index='0']") static WebElement month;
	public @FindBy(xpath = "(//*[@ng-reflect-min]//following::td[@role='gridcell'])[2]") static WebElement Day;
	public @FindBy(xpath = "(//span[@class='k-link'])") static WebElement fromDay;
	
	
	public @FindBy(xpath = "(//i[@class='fa fa-paperclip']") static WebElement UploadDocument;
	public @FindBy(xpath = "(//div[@aria-label='Select files from computer']") static WebElement LocalDocument;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
