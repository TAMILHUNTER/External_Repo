package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransportRequestObjects {

	@FindBy(how = How.XPATH, using="//span[@title='Transport Request']")
	public static WebElement transportRequest;
	
	@FindBy(how = How.XPATH, using="//div[text()='Transport Request']")
	public static WebElement transportRequestTitle;
	
	@FindBy(how = How.XPATH, using="//input[@id='docTy']")
	public static WebElement documentType;
	
	@FindBy(how = How.XPATH, using="//span[@title='clear']")
	public static WebElement Clear_Doctype;
	
	@FindBy(how = How.XPATH, using="//p[@id='docty']")
	public static WebElement documentViewType;
	
	@FindBy(how = How.XPATH, using="//div[text()=' All ']")
	public static WebElement all;
	
	@FindBy(how = How.XPATH, using="//div[text()=' In Progress ']")
	public static WebElement inProgress;
	
	@FindBy(how = How.XPATH, using="//div[text()=' For Action ']")
	public static WebElement forAction;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Source ']")
	public static WebElement source;
	
	@FindBy(how = How.CLASS_NAME, using="k-input")
	public static WebElement numberofdays;
	
	@FindBy(how = How.CLASS_NAME, using="//li[@index]")
	public static List <WebElement> numberofdaysSelect;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[3]")
	public static WebElement getDate;
	
	@FindBy(how = How.XPATH, using="//kendo-pager-page-sizes[@id='ddlRecordsperPage']//select[1]")
	public static WebElement show;
	
	@FindBy(how = How.XPATH, using="//kendo-pager-info[@class='k-pager-info k-label']")
	public static WebElement pageRecordView;
	
	/*@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='Document No']")
	public static WebElement documentNo;*/
	
	@FindBy(how = How.ID, using="ibtAdvanceSearch")
	public static WebElement advanceSearch;
	
	@FindBy(how = How.ID, using="btnSearch")
	public static WebElement search;
	
	@FindBy(how = How.XPATH, xpath="//table[@class='k-grid-table']/tbody[1]/tr[1]/td[1]/span[1]/span[1]")
	public static WebElement result;
	
	@FindBy(how = How.ID, using="BtnClear")
	public static WebElement clear;
	
	@FindBy(how = How.ID, using="//span[@class='k-textbox k-space-right']")
	public static WebElement TRCalendar;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-expand']")
	public static WebElement expand;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-compress']")
	public static WebElement compress;
	
	@FindBy(how = How.XPATH, using="//span[@class='eip-link ng-star-inserted']//span")
	public static List <WebElement> matchresult;
	
	@FindBy(how = How.XPATH, using="//mat-checkbox")
	public static WebElement selected;
	
	@FindBy(how = How.XPATH, using="//mat-checkbox")
	public static List <WebElement> selectSourceRecord;
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")									 
	public static WebElement selectAll;
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])")
	public static List <WebElement> verifyselectAll;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> documentTypeSelection;
			
	@FindBy(how = How.XPATH, using="//*[@id='docTy']/mat-form-field/div/div[1]/div[2]/span")
	public static WebElement cleardocumentType;
	
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> fromJob;
	
	@FindBy(how = How.XPATH, using="//input[@id='frFromJob']")
	public static  WebElement fromJobClick;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> fromWarehouse;
	
	@FindBy(how = How.XPATH, using="//input[@id='frFromWarehouse']")
	public static  WebElement fromWarehoueClick;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> toJob;
	
	@FindBy(how = How.XPATH, using="//input[@id='frToJob']")
	public static  WebElement toJobClick;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> toWarehouse;
	
	@FindBy(how = How.XPATH, using="//input[@id='frToWarehouse']")
	public static  WebElement toWarehouseClick;
	
	@FindBy(how = How.ID, using="ibtASRAdd")
	public static WebElement create;
	
	@FindBy(how = How.XPATH, using="//div[text()='Transport Request Creation']")
	public static WebElement transportRequestCreation;
	
	@FindBy(how = How.XPATH, using="//p[@id='docty']")
	public static WebElement intercarting;
	
	@FindBy(how = How.XPATH, using="(//*[@id='tojb']/span)[1]")
	public static WebElement fromJobs;
	
	@FindBy(how = How.XPATH, using="(//*[@id='tojb']/span)[2]")
	public static WebElement toJobs;
	
	@FindBy(how = How.XPATH, using="/html/body/span")
	public static WebElement toolTips;
	
	@FindBy(how = How.XPATH, using="(//label[text()='To Warehouse']/following::input)[2]")
	public static WebElement documentNumber;
	
	@FindBy(how = How.XPATH, using="//i[@title='Consignor']")
	public static WebElement consignor;
	
	@FindBy(how = How.XPATH, using="//i[@title='Consignee']")
	public static WebElement consignee;
	
	@FindBy(how = How.XPATH, using="//div[text()='Consignor Details']")
	public static WebElement consignorDetails;
	
	@FindBy(how = How.XPATH, using="//div[text()=' Consignee Details']")
	public static WebElement consigneeDetails;
	
	@FindBy(how = How.XPATH, using="//th[text()='Name:']/following-sibling::td")
	public static WebElement headQuarters;
	
	@FindBy(how = How.XPATH, using="//th[text()='Name:']/following-sibling::td")
	public static WebElement cONSTRUCTIONOFCF;
	
	@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-cart-plus')]")
	public static WebElement materialcart;
	
	@FindBy(how = How.XPATH, using="//p[@id='lblCompanyCurrency']/following-sibling::p")
	public static WebElement currency;
	
	@FindBy(how = How.XPATH, using="(//i[@id='ibtClose'])[2]")
	public static WebElement close;
	
	@FindBy(how = How.XPATH, using="//p[text()=' Material Cart ']")
	public static WebElement materialCartTitle;
	
	@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='Material Category']")
	public static WebElement materialCategory;
	
	@FindBy(how = How.ID, using="lstServiceCategory")
	public static WebElement serviceCategory;
	
	@FindBy(how = How.XPATH, using="//span[text()=' Select All']")
	public static WebElement selectallitems;
	
	@FindBy(how = How.XPATH, using="//input[@ng-reflect-id='multi-select-input-lstMatGroup']")
	public static WebElement materialGroup;
	
	@FindBy(how = How.ID, using="lstMatGroup")
	public static WebElement materialGrops;
	
	@FindBy(how = How.ID, using="leftSearchText")
	public static WebElement searchItems;
	
	@FindBy(how = How.ID, using="/html/body/span")
	public static WebElement fromJobTip;
	
	@FindBy(how = How.XPATH, using="//button[@title='Select all']//i[1]")
	public static WebElement materialselect;
	
	@FindBy(how = How.XPATH, using="//button[@title='Unselect all']//i[1]")
	public static WebElement unSelect;
	
	@FindBy(how = How.XPATH, using="//mat-list-option//div[2]")
	public static List <WebElement> listofselectedItems;
	
	@FindBy(how = How.XPATH, using="//*[text()='Post']")
	public static WebElement postItems;
	
	@FindBy(how = How.XPATH, using="(//mat-selection-list)[2]//div//div[2]")
	public static List <WebElement> selectedItesmAre;
	
	@FindBy(how = How.XPATH, using="(//td[@role='gridcell']//span)[1]")
	public static WebElement selectedItemsverification;
	
	@FindBy(how = How.XPATH, using="(//input[@role='spinbutton'])[1]")
	public static WebElement shipMentQty;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//p")
	public static WebElement errorMessage;
	
	@FindBy(how = How.XPATH, using="//input[@value='Next']")
	public static WebElement next;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//h1")
	public static WebElement informationPopup;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement closingErrorMessage;
	
	@FindBy(how = How.ID, using="imgGridFilter")
	public static WebElement saleOrder;
	
	@FindBy(how = How.XPATH, xpath="//*[@class='mat-dialog-title']")
	public static WebElement saleOrderTitle;
	
	@FindBy(how = How.ID, using="lbldocno")
	public static  WebElement saleOrderSerialNumber;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1'])[3]")
	public static WebElement uom;
	
	@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table)[5]//td[2]")
	public static WebElement saleOrderUom;
	
	@FindBy(how = How.ID, using="lblsaleqty")
	public static WebElement saleOrderQty;
	
	@FindBy(how = How.XPATH, using="//input[@title='Post']")
	public static WebElement post;
	
	@FindBy(how = How.ID, id="remarks")
	public static WebElement remarks;
	
	
	@FindBy(how = How.XPATH, using="//span[text()='Packing Details ']/following::input")
	public static WebElement packingSlipNo;		
	
	@FindBy(how = How.XPATH,using="//input[@id='packingType0']")
	public static WebElement packingTypeclick;	
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> packingType;
	
	@FindBy(how = How.XPATH, using="//label[text()='Units']/following::input")
	public static WebElement packingQty;
	
	@FindBy(how = How.XPATH, using="(//label[text()='Units']/following::input)[2]")
	public static WebElement grossWeight;
	
	@FindBy(how = How.XPATH, using="(//label[text()='Units']/following::input)[3]")
	public static WebElement netWeight;
	
	@FindBy(how = How.ID, using="dimeuom0")
	public static WebElement dimenstion;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> dimenstionUom;
	
	@FindBy(how = How.XPATH, using="((//table)[4]//input)[7]")
	public static WebElement dimenstionHeight;
	
	@FindBy(how = How.XPATH, using="((//table)[4]//input)[8]")
	public static WebElement dimenstionWidth;
	
	@FindBy(how = How.XPATH, using="((//table)[4]//input)[9]")
	public static WebElement dimenstionLenght;
		
	@FindBy(how = How.XPATH, using="(//td//div[@class='mat-form-field-infix']//input)[8]")
	public static WebElement packingRemarks;	
			
	@FindBy(how = How.XPATH, using="(//*[@title='Add Row'])[2]")
	public static WebElement addSaleOrder;
	
	@FindBy(how = How.XPATH, using="(//input[@id='lbldocno'])[2]")
	public static WebElement saleordeerserialNumber2;
	
	@FindBy(how = How.XPATH, using="(//input[@id='lblsaleqty'])[2]")
	public static WebElement saleorderqty2;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement errorClosing;
	
	@FindBy(how = How.XPATH, using="(//i[@id='ibtMatDelete'])[3]")
	public static WebElement delete;
	
	@FindBy(how = How.ID, using="lblTotalShipmentQty")
	public static WebElement totalShipmentQty;
	
	@FindBy(how = How.ID, using="lblCurrentShipmentQty")
	public static WebElement currentShipmentQty;
	
	@FindBy(how = How.ID, using="lblBalanceShipmentQty")
	public static WebElement balanceShipmentQty;
	
	@FindBy(how = How.XPATH, using="//p[text()='Description-Code']/following-sibling::span")
	public static WebElement descriptionCode;
	
	
	@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='Transport Type']")
	public static  WebElement transportType;
	
	@FindBy(how = How.XPATH, using="//mat-option[@role='option']//span")
	public static List <WebElement> transportTypeList;
	
	@FindBy(how = How.XPATH, using="//*[@placeholder='Transport Type']")
	public static WebElement transportTypeSelect;
	
	@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='From C‌ountry']")
	public static WebElement fromCountry;
	
	@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='From Stat‌e']")
	public static WebElement fromState;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='From Ci‌ty']")
	public static WebElement fromCity;
	
	@FindBy(how = How.XPATH, using="//p[text()='From Area']/following-sibling::input")
	public static WebElement fromArea;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='From Locat‌ion']")
	public static WebElement fromLocation;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='To Count‌ry']")
	public static WebElement toCountry;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='To Stat‌e']")
	public static WebElement toState;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='To C‌ity']")
	public static WebElement toCity;
		
	@FindBy(how = How.XPATH, using="//input[@placeholder='To Locatio‌n']")
	public static  WebElement toLocation;
	
	
	@FindBy(how = How.XPATH, using="//p[text()='To Area']/following-sibling::input")
	public static WebElement toArea;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Terrain']")
	public static WebElement terrain;
	
	@FindBy(how = How.XPATH, using="//p[text()='Distance in Kms']/following-sibling::input")
	public static WebElement distanceInKm;
	
	@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
	public static List <WebElement> select;
	
	
	@FindBy(how = How.XPATH, using="//*[@placeholder='RFQ No.']")
	public static WebElement rfqNumber;
	
	@FindBy(how = How.XPATH, using="//*[@placeholder='BQ No.']")
	public static WebElement bqNumber;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Transporter']")
	public static WebElement transporter;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Rate Type']")
	public static WebElement rateType;
	
	@FindBy(how = How.XPATH, using="//i[@title='Vehicle Cart']")
	public static WebElement vehicleCart;
	
	@FindBy(how = How.XPATH, using="(//*[@class='k-grid-table'])[4]//td[2]//label")
	public static List <WebElement> randomVechicleSelect;	
	
	
	
	@FindBy(how = How.XPATH, using="(//*[@class='k-grid-table'])[4]//td[1]//label")
	public static List <WebElement> randomVechicleSelectCheckBox;	
	
	@FindBy(how = How.XPATH, using="(//*[@class='k-grid-table'])[4]//td[5]//label")
	public static List <WebElement> vehicleRate;
	
	@FindBy(how = How.XPATH, using="(//*[@class='k-grid-table'])[4]//td[4]//label")
	public static List <WebElement> uomList;
	
	@FindBy(how = How.XPATH, using="(//*[@class='k-grid-table'])[4]//td[3]//label")
	public static List <WebElement> vehicleDesc;	
	
	
	@FindBy(how = How.XPATH, using="//*[@textfield='vehicle_Description']//div//input")
	public static WebElement vehicletype;
	
	@FindBy(how = How.XPATH, using="(//table)[7]//td[2]//label")
	public static WebElement vehicledescription;
	
	@FindBy(how = How.XPATH, using="(//table[@role='presentation']//td//label)[4]")
	public static WebElement vehicleUom;
	
	@FindBy(how = How.XPATH, using="(//table[@role='presentation']//td//label)[5]")
	public static WebElement currencyType;
	
	@FindBy(how = How.XPATH, using="(//table[@role='presentation']//td//label)[6]")
	public static WebElement rateperVehicle;						
			
	@FindBy(how = How.XPATH, using="//input[@value='Search']")
	public static WebElement searchVechile;
	
	@FindBy(how = How.XPATH, using="(//mat-checkbox)[2]")
	public static WebElement vechileSelection;
	
	@FindBy(how = How.XPATH, using="//input[@value='Save']")
	public static WebElement saveVechile;
	
	@FindBy(how = How.XPATH, using="//input[@id='mat-input-37']")
	public static WebElement materialQtyVechilePage;
	
	@FindBy(how = How.XPATH, using="//input[@id='mat-input-38']")
	public static WebElement numberofVechile;
	
	@FindBy(how = How.XPATH, using="(//label[text()='INR']/following::input)[1]")
	public static WebElement enterRate;
	
	@FindBy(how = How.XPATH, using="(//label[text()='MT']/following::input)[1]")
	public static WebElement numberofQty;
	
	@FindBy(how = How.XPATH, using="//td[@data-kendo-grid-column-index='7']//label[1]")
	public static WebElement rate;
	
	@FindBy(how = How.XPATH, using="((//kendo-grid-list)[3]//input)[4]")
	public static WebElement nonrate;		
	
	
	@FindBy(how = How.XPATH, using="//td[@data-kendo-grid-column-index='8']//label[1]")
	public static WebElement totalAmount;
	
	@FindBy(how = How.XPATH, using="//label[@class='mat-checkbox-layout']//div")
	public static WebElement odctag;
	
	
	@FindBy(how = How.ID, id="txtUsername")
	public static WebElement txtUsername;
	
	@FindBy(how = How.CLASS_NAME, className="input")
	public static WebElement Username;
	
	@FindBy(how = How.LINK_TEXT, linkText="Contact")
	public static WebElement UsernameT;
	
	
	@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table[5]//input)[5]")
	public static WebElement vechileRemarks;
	
	@FindBy(how = How.XPATH, using="//input[@value='Submit']")
	public static WebElement submit;
	
	@FindBy(how = How.XPATH, using="//*[@value='Save Draft']")
	public static WebElement saveDraft;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//h1")
	public static WebElement successMessage;
	
	@FindBy(how = How.XPATH, using="//eipconfirmationlistmessagebox//h1")
	public static WebElement confirmationMessage;
	
	@FindBy(how = How.XPATH, using="//eipconfirmationlistmessagebox//textarea")
	public static WebElement confirmationText;
		
	@FindBy(how = How.XPATH, using="//eipconfirmationlistmessagebox//button[text()='Yes']")
	public static WebElement confirmationYes;
	
	
	@FindBy(how = How.XPATH, using="//eiptoastalert//h1")
	public static WebElement successAlert;
	
	@FindBy(how = How.XPATH, using="//kendo-pager-info")
	public static WebElement pageNavigation;
	
	@FindBy(how = How.XPATH, using="//eiptoastalert//p")
	public static WebElement successAlertMessage;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement successMessageOkButton;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//p")
	public static WebElement createdFrqNumber;
	
	@FindBy(how = How.ID, using="ibtISSfilter")
	public static WebElement filter;
	
	@FindBy(how = How.XPATH, using="//*[@title='Terms and Conditions']")
	public static WebElement termsandconditions;
	
	@FindBy(how = How.XPATH, using="//label[text()='DocumentType']/following::input")
	public static WebElement documentNumberToFilter;
	
	@FindBy(how = How.XPATH, using="(//tr)[3]//td[1]//span//span")
	public static WebElement getFiltereddocumentNumber;
	
	@FindBy(how = How.XPATH, using="(//*[@role='presentation']//td[8])[2]")
	public static WebElement documentNumberStatus;
	
	@FindBy(how = How.XPATH, using="//kendo-grid-list")
	public static WebElement scroll;
	
	@FindBy(how = How.XPATH, using="//i[@title='Recall']")
	public static WebElement recall;
	
	@FindBy(how = How.XPATH, using="//i[@class='fa fa-paperclip']")
	public static WebElement attachment;
	
	@FindBy(how = How.XPATH, using="//i[@title='Document View']")
	public static WebElement viewAttachment;
	
	@FindBy(how = How.ID, using="GribtCancel1")
	public static WebElement cancel;
	
	@FindBy(how = How.XPATH, using="//button[@class='discussion-main-icon']//i[1]")
	public static WebElement discussionIcon;
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-expand'])[1]")
	public static WebElement materialGridExpand;
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-compress'])")
	public static WebElement materialGridCompress;
	
	@FindBy(how = How.XPATH, using="//app-saleorder//i[@id='ibtClose']")
	public static WebElement closeSaleOrder;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Document No']")
	public static WebElement documentNo;
	
	@FindBy(how = How.ID, using="btnSearch")
	public static WebElement searchButton;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list//td//span//span)[1]")
	public static WebElement searchedDocnumber;
	
	@FindBy(how = How.XPATH, using="//a[contains(@class,'fa fa-calendar')]")
	public static WebElement callendar;
	
	@FindBy(how = How.XPATH, using="//kendo-calendar-header[@class='k-calendar-header']//span[1]")
	public static WebElement dateSelection;
	
	
}