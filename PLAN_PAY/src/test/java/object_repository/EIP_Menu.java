
package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EIP_Menu {
	
	public @FindBy(xpath = "//input[@placeholder='Search Menu']")	static  WebElement SearchMenu;
	public @FindBy(xpath = "//span[text()=' RFQ ']")	static  WebElement SelectRFQ;
	public @FindBy(xpath = "//*[text()='Techno Commercial Document']")	static  WebElement SelectTCD;
	public @FindBy(xpath = "//*[contains(@title, 'Add RFQ')]")	static  WebElement SelectAddIcon;
	public @FindBy(xpath = "//*[contains(@title, 'Create')]")	static  WebElement SelectAuctionAddicon;
	public @FindBy(xpath = "//*[contains(@title, 'Search PR')]")	static  WebElement SearchPR;
	public @FindBy(xpath = "//*[@placeholder='PR Number']")	static  WebElement EnterPRFromDB;
	public @FindBy(xpath = "//*[contains(@id, 'icon-rightrfqDateRange')]")	static  WebElement AllocationDate;
	public @FindBy(xpath = "//*[contains(@id, 'icon-rightrfqDateRange')]")	static  WebElement EnterAllocationDate;
	public @FindBy(xpath = "//*[contains(@id, 'btn_Search')]")	static  WebElement SelectSearchIcon;
	public @FindBy(xpath = "(//mat-checkbox/label/div)[2]")	static  WebElement SelectPR;
	public @FindBy(xpath = "(//*[@type='button'])[7]")	static  WebElement SelectNextIcon;
	
	
	public @FindBy(xpath = "//*[text()='Yes']")	static  WebElement ConfirmationAlert; 
	public @FindBy(xpath = "//textarea[@id='remarks']")	static  WebElement EnterScopeOfRFQ;
	public @FindBy(xpath = "//*[text()='Last PO Rate']")	static  WebElement AuctionRemarks;
	
	public @FindBy(xpath = "(//*[@id='mat-input-72'])")	static  WebElement EnterQuantity;
	public @FindBy(xpath = "(//td//input)[11]")	static  WebElement EnterSRQuantity;
	public @FindBy(xpath = "//*[@id='gibtexpandlist']")	static  WebElement ExpandSRList;
	public @FindBy(xpath = "(//td//div//input)[1]")	static  WebElement RDEditEnterQuantity;
	public @FindBy(xpath = "(//*[@id='mat-input-22'])")	static  WebElement EnterQuantitySR;
	public @FindBy(xpath = "(//td//input)[2]")	static  WebElement EnterQuantityRDSR;
	public @FindBy(xpath = "(//*[@id='gibtexpandlist'])[2]") static WebElement ExpandList;
	public @FindBy(xpath = "(//app-rfqcreation/div/div/div/button)[2]") static WebElement Savedrf;
	public @FindBy(xpath = "(//app-rfqcreation/div/div/div/button)[1]") static WebElement RDAddRFQValuSavedrf;
	
	public @FindBy(xpath = "(//*[@id='gibtexpandlist'])[10]") static WebElement ExpandListSR;
	public @FindBy(xpath = "//*[@id='gibtexpandlist']") static WebElement ExpandListRD;
	public @FindBy(xpath = "//td//p/u") static WebElement RDDelSch;
	public @FindBy(xpath = "//td//input[@id='dprS_Delivery_Qty']") static WebElement RDEditQlty;
	public @FindBy(xpath = "(//*[@style='cursor: pointer;'])") static WebElement DelSchedule;
	public @FindBy(xpath = "//*[@id='dprS_Delivery_Qty']") static WebElement DeliveryQty;
	public @FindBy(xpath = "(//*[@type='submit'])[2]") static WebElement SaveandClose;
	//public @FindBy(xpath = "//*[@id='ibtDSDelvrySchSave']
	public @FindBy(xpath = "//*[text()='Save & Close']") static WebElement SaveandCloseSR;
	//*[text()='Save & Close'] // //*[@id ='ibtDSDelvrySchSave'])
	public @FindBy(xpath = "//input[@placeholder='HSN']")	static  WebElement EnterHSN;
	public @FindBy(xpath = "(//*[@type='button'])[9]")	static  WebElement SelectNextIconRFQCreate;
	public @FindBy(xpath = "(//*[@type='button'])[16]")	static  WebElement SelectNextSRRFQ;
	public @FindBy(xpath = "(//*[text()='Save Draft'])")	static  WebElement SelectNextSRRDRFQ;
	public @FindBy(xpath = "//eipmessagebox//button")	static  WebElement AcceptAlert;
	public @FindBy(xpath = "//eipmessagebox//button")	static  WebElement 	AlertBQAccept;
	public @FindBy(xpath = "//i[@title='Close']")	static  WebElement CloseVen;
	public @FindBy(xpath = "//*[@id='lstVendor']")	static  WebElement EnterVendorRFQ;
	public @FindBy(xpath = "//*[@id ='lstCategory']")	static  WebElement RFQMaterialcategory;
	public @FindBy(xpath = "//mat-option") static   List <WebElement> listMaterialcategory;
	public @FindBy(xpath = "(//mat-option//span//span)[1]")	static  WebElement SelectVendor;
	public @FindBy(xpath = "(//button[text()='Add'])")	static  WebElement SelectAddVendorIcon;
	public @FindBy(xpath = "(//*[@type='button'])[14]")	static  WebElement SelectNextIconVendor;
	public @FindBy(xpath = "(//*[@type='button'])[25]")	static  WebElement SelectNextIconVendorSR;
	public @FindBy(xpath = "(//*[@type='button'])[18]")	static  WebElement SelectNextIconVendorRDSR;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[6]")	static  WebElement RDNextEdit;
	public @FindBy(xpath = "(//eipnumeric//input)[1]")	static  WebElement EnterReleasePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id,'Event0')]")	static  WebElement SelectEventPaymentTerms;
	public @FindBy(xpath = "//div//mat-option//span//span")	static  List <WebElement> paymentlist;
	public @FindBy(xpath = "//*[@id='mat-autocomplete-5']")	static  List <WebElement> HSNlist;
	public @FindBy(xpath = "//*[@role='listbox']//span//span")	static  List <WebElement> BQHSNlist;
	
	public @FindBy(xpath = "//*[@placeholder='Nature Code']") static WebElement Naturecode;
	public @FindBy(xpath = "(//*[@placeholder='Nature Code'])[1]") static WebElement NaturecodeM1;
	public @FindBy(xpath = "(//*[@placeholder='Nature Code'])[2]") static WebElement NaturecodeM2;
	public @FindBy(xpath = "(//*[@placeholder='Nature Code'])[3]") static WebElement NaturecodeM3;
	public @FindBy(xpath = "(//*[@placeholder='Nature Code'])[4]") static WebElement NaturecodeM4;
	
	public @FindBy(xpath = "(//mat-option)[3]") static WebElement NaturecodeBQ;
	
	public @FindBy(xpath = "//*[text()=' Components']") static WebElement movenc; 
	public @FindBy(xpath = "//*[@id='mat-autocomplete-21']") static  List <WebElement> RVList;
	
	public @FindBy(xpath = "//mat-option//span//span") static  List <WebElement> NCList;
	
	public @FindBy(xpath = "//*[contains(@id,'RefValue0')]")	static  WebElement SelectReferenceValuePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id, 'creditDays0')]")	static  WebElement SelectCreditDaysPaymentTerms;
	public @FindBy(xpath = "//*[contains(@id,'PaymentMode0')]")	static  WebElement SelectPaymentModePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id, 'RefDateValue0')]")	static  WebElement SelectReferenceDatePaymentTerms;
	public @FindBy(xpath = "//*[@id='mat-input-99']") static  WebElement Doc;
	
	public @FindBy(xpath = "//*[@id='mat-input-95']") static  WebElement AucDoc;
	public @FindBy(xpath = "//*[@id='mat-input-85']") static  WebElement AucRevDoc;
	
	public @FindBy(xpath = "//*[@id='mat-input-92']") static  WebElement AucRevRDDoc;
	
	public @FindBy(xpath = "//*[@id='mat-input-103']") static  WebElement AucRevMulRDDoc;
	
	public @FindBy(xpath = "(//*[@title='clear'])[6]") static  WebElement VendorClear;
	
	public @FindBy(xpath = "(//*[@title='clear'])[4]") static  WebElement VendorMaterialClear;
	
	public @FindBy(xpath = "(//*[@title='clear'])[7]") static  WebElement VendorMaterialPRClear;
	
	
	
	
	
	
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-89']") static  WebElement AucRevPRDoc;
	
	
	
	
	public @FindBy(xpath = "(//mat-form-field//input)[12]") static  WebElement SRDoc;
	public @FindBy(xpath = "(//mat-form-field//input)[11]") static  WebElement SRRDDoc;
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-113']") static  WebElement PRPaymentDocument;
	
	
	
	public @FindBy(xpath = "(//mat-form-field//div//div//div[@class='mat-form-field-infix']//input)[10]") static  WebElement RDDoc;
	public @FindBy(xpath = "//span[text() = ' Select All']")	static  WebElement SelectDocumentPaymentTerms;
	
	public @FindBy(xpath = "//mat-panel-title[text() = ' Preview ']")	static  WebElement ClickAndConform;
	public @FindBy(xpath = "//button[text()='Next']")	static  WebElement SelectNextIconPaymentTerms;
	public @FindBy(xpath = "//*[@id='mat-dialog-0']/app-rfq-create-dialog/app-rfqcreation/div[3]/div/div[2]/button[3]")	static  WebElement SelectNextIconPaymentTerms1;
	public @FindBy(xpath = "(//button[text()='Save Draft'])")	static  WebElement SelectNextIconRDPaymentTerms;
	
	public @FindBy(xpath = "(//button[text()='Previous'])")	static  WebElement SelectSRNextPaymentTerms;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-tab-label-content')])[9]")	static  WebElement SelectAdditionalDetails;
	
	public @FindBy(xpath = "//div[text() ='Additional Details']")	static  WebElement SelectAdditionalDetailsSR;
	//public @FindBy(xpath = "(//*[contains(@class, 'mat-expansion-panel-header-title')])[2]")	static  WebElement SelectShipmentDetails;
	public @FindBy(xpath = "//strong[text()='Shipment Details']")	static  WebElement SelectShipmentDetails;
	public @FindBy(xpath = "//*[@id='billingto0']")	static  WebElement SelectBillingToShipmentDetails;
	public @FindBy(xpath = "//*[@id='shippingto0']") static  WebElement SelectShippingToShipmentDetails;
	
	// Karthik for Billing TO/FROM
	public @FindBy(xpath = "(//eipautocomplete[@textfield='maB_Address'])[1]//span[@title='clear']") static  WebElement SelectBillingToShipmentDetails_clear;
	public @FindBy(xpath = "(//eipautocomplete[@textfield='maB_Address'])[2]//span[@title='clear']") static  WebElement SelectShippingToShipmentDetails_clear;
	
	
	public @FindBy(xpath = "(//mat-option//span//span)[3]")	static  WebElement ListBillingToShipmentDetails;
	public @FindBy(xpath = "(//mat-option//span//span)[2]")	static  WebElement ListBillingToShipmentDetailsRD;
	
	public @FindBy(xpath = "//*[text()='Components']")	static  WebElement Components;
	
	public @FindBy(xpath = "(//mat-form-field//span[@title='clear'])[7]")	static  WebElement ShipmentDetailsFromclose;
	public @FindBy(xpath = "(//mat-form-field//span[@title='clear'])[8]")	static  WebElement ShipmentDetailsToclose;
	
	
	public @FindBy(xpath = "(//*[@title='Add'])[1]")	static  WebElement AddComponents;
	
	public @FindBy(xpath = "(//mat-slide-toggle//div)[1]")	static  WebElement PartialBidding;
	
	
	
	
	public @FindBy(xpath = "//*[text() = ' Trade Details']") static  WebElement  TradeDetails;
	
	public @FindBy(xpath = "(//mat-button-toggle//button)[10]") static  WebElement  ASNapplicableYES_M;
	
	public @FindBy(xpath = "//input[@placeholder='Trade Terms']") static  WebElement TradeTerms;
	
	public @FindBy(xpath = "//*[@placeholder='HSN Code']") static  WebElement AuctionReferRFQHSN;
	
	
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[4]") static  WebElement AucTradeTerms;
	
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[5]") static  WebElement AucEventsDefect;
	
	public @FindBy(xpath = "//span[text()='11 - F.O.R. YOUR GODOWN']") static  WebElement SelectTradeTerms;
	public @FindBy(xpath = "(//mat-option)[3]") static  WebElement SelectAuctionTradeTerms;
	
	public @FindBy(xpath = "(//mat-option//span)[1]") static  WebElement SelectAucTradeTerms;
	
	public @FindBy(xpath = "//*[text()='Request Essentials']") static  WebElement RequestEssentialsMenu;
	public @FindBy(xpath = "//*[text()=' Request Essentials']") static  WebElement RequestEssentialsMenuRFQ;
	
	public @FindBy(xpath = "//*[text()='Request Essentials']") static  WebElement RequestEssentialsMenuAuc;
	
	public @FindBy(xpath = "(//*[contains(@id, 'iDtTAGOrdrExpDate')])") static  WebElement OrderExpiryDate;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-calendar-body-today')])") static  WebElement RFQOrderExpiryDate;
	public @FindBy(xpath = "(//*[text()='Save'])[1]") static  WebElement OTSave;
	public @FindBy(xpath = "//*[text()='Save']") static  WebElement SaveSD;
	
	public @FindBy(xpath = "//*[text()=' Stage 1 ']") static  WebElement DownPaymentTerms;
	public @FindBy(xpath = "//textarea[@placeholder='External Message']") static  WebElement extmsg;
	public @FindBy(xpath = "//*[text() ='Attach General Terms & Conditions']") static  WebElement AttachGeneralTerms;
	public @FindBy(xpath = "//*[@id='btnPrevious']") static  WebElement AuctionAttachGeneralTerms;
	
	public @FindBy(xpath = "(//*[@title='Page Number'])[2]") static  WebElement BidValues;
	
	public @FindBy(xpath = "(//*[@title='Page Number'])[3]") static  WebElement Vendor;
	
	
	
	public @FindBy(xpath = "//*[text()='Attach general terms and conditions']") static  WebElement AuctionAttachGeneralTermsS;
	
	public @FindBy(xpath = "(//*[@title='Page Number'])[5]") static  WebElement AuctionAttachGeneralTermsSS;
	
	
	
	
	
	public @FindBy(xpath = "(//button[text()='Save'])[2]") static  WebElement TCSave;
	
	public @FindBy(xpath = "(//button[text()='Save'])[3]") static  WebElement AucRevTCSave;
	
	public @FindBy(xpath = "//*[text()='Document Number']") static  WebElement AucAvsearch;
	
	
	public @FindBy(xpath = "//button[text()='Save Draft']") static  WebElement Submit;
	public @FindBy(xpath = "//*[text()=' RFQ Bidders Quote ']") static  WebElement SelectRFQBQ;
	public @FindBy(xpath = "(//*[text()='1 - 1 of 1 items'])[2]") static  WebElement RDEditPageDown;
	public @FindBy(xpath = "(//*[text()='1 - 1 of 1'])") static  WebElement PageDownAcknowledge;
	public @FindBy(xpath = "(//*[text()='1 - 1 of 1 items'])") static  WebElement PageDownAcknowledgeBQ;
	public @FindBy(xpath = "(//input[@value='Acknowledge'])") static  WebElement Acknowledge;
	public @FindBy(xpath = "(//input[@value='Place Bid'])") static  WebElement BQPlaceBid;
	
	
	public @FindBy(xpath = "//b[text()='I agree to the terms and conditions']") static  WebElement agreeterms;
	public @FindBy(xpath = "//*[@id='btnTCSubmit']") static  WebElement BQSubmit;
	//public @FindBy(xpath = "/html/body/app-root/div/div[2]/app-bqcreationcontainer/lib-eip-bqedit/div/div[2]/app-bqcreatematcardview/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[7]/div/mat-form-field/div/div[1]/div/input[1]") static  WebElement Rate;
	public @FindBy(xpath = "//*[@id='rfqRate']") static  WebElement Rate;
	public @FindBy(xpath = "//*[@placeholder='Nature Code']") static  WebElement NatureCode;
	public @FindBy(xpath = "//button[text() ='Save Draft']") static  WebElement SaveDraft;
	
	public @FindBy(xpath = "//input[@value='Techno Commercials']") static  WebElement TechnoCommercials;
	public @FindBy(xpath = "//div[text()='Additional Details']") static  WebElement AdditionalDetails;
	public @FindBy(xpath = "//*[@id= 'vendorAdress0']") static  WebElement BillFrom;
	public @FindBy(xpath = "//*[@placeholder= 'GST Register No']") static  WebElement GSTRegisterNo;
	public @FindBy(xpath = "(//*[@title='Close'])[1]") static  WebElement Close;
	public @FindBy(xpath = "//vbedit//i[@title='Close']") static  WebElement AuctionClose;
	
	public @FindBy(xpath = "//div[text()=' In Progress ']") static  WebElement InProgress;
	public @FindBy(xpath = "//p[text() = 'Request Essentials']") static  WebElement RequestEssentials;
	public @FindBy(xpath = "(//input[@placeholder='TAN'])") static  WebElement TAN;
	public @FindBy(xpath = "(//button[text()='Save'])[3]") static  WebElement RESave;
	public @FindBy(xpath = "//p[text() = 'Trade Details']") static  WebElement  TCTradeDetails;
	public @FindBy(xpath = "//input[@placeholder='Trade Terms']") static  WebElement TCTradeTerms;
	public @FindBy(xpath = "//mat-select//span") static  WebElement AuctionTradeTerms;
	
	public @FindBy(xpath = "((//i[@title='Close'])[3])") static  WebElement TCClose;
	public @FindBy(xpath = "//button[text()='Submit']") static  WebElement RFQSubmit;
	public @FindBy(xpath = "(//*[contains(@class, 'ng-star-inserted')])[90]") static  WebElement RFQ;
	public @FindBy(xpath = "(//td//a)[1]") static  WebElement RFQTCC;
	public @FindBy(xpath = "(//tr//td)[13]") static  WebElement TCD;
	public @FindBy(xpath = "(//*[@title = 'Comparison'])[1]") static  WebElement Comparison;
	public @FindBy(xpath = "//button[text()='Close TCC']") static  WebElement TCCClose;
	public @FindBy(xpath = "//div[text()='Yes ']") static  WebElement AutoBQRequired;
	public @FindBy(xpath = "(//*[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[1]") static  WebElement RateDiscovery;
	public @FindBy(xpath = "//*[@class='fa fa-cart-plus cart-cursor-pointer']") static  WebElement ChooseMaterial;
	public @FindBy(xpath = "//*[contains(@id, 'lstServiceCategory')]") static  WebElement MaterialCategory;
	public @FindBy(xpath = "//*[contains(@id, 'srCategoryList')]") static  WebElement ServiceCategory;
	public @FindBy(xpath = "//span[text()=' Select All']") static  WebElement SelectMaterialCategory;
	public @FindBy(xpath = "//input[@placeholder='Material Group']") static  WebElement MaterialGroup;
	public @FindBy(xpath = "//input[@placeholder='Group']") static  WebElement ServiceGroup;
	
	public @FindBy(xpath = "//span[text()=' Select All']") static  WebElement SelectMaterialGroup;
	public @FindBy(xpath = "//*[@id='leftSearchText']") static  WebElement ChooseItems;
	public @FindBy(xpath = "(//mat-list-option//div)[1]") static  WebElement SRChooseItems;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-list-text')])[5]") static  WebElement SelectItems;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-list-text')])[6]") static  WebElement SelectItemss;
	public @FindBy(xpath = "(//*[contains(@class, 'fa fa-angle-right font-weight-bold')])") static  WebElement MoveToSelectedItems;
	public @FindBy(xpath = "//button[text()='Post']") static  WebElement Post;
	public @FindBy(xpath = "(//button[text()='Post'])[2]") static  WebElement SRPost;
	public @FindBy(xpath = "//button[text()='Next']") static  WebElement Next;
	public @FindBy(xpath = "//*[@class='mat-selection-list mat-list-base']") static  WebElement Refer;
	public @FindBy(xpath = "//*[@id='mat-input-72']") static  WebElement Quantity;
	public @FindBy(xpath = "//*[@id='mat-input-27']") static  WebElement SRQuantity;
	public @FindBy(xpath = "//*[@id='mat-input-73']") static  WebElement SuggRate;
	public @FindBy(xpath = "//*[@id='mat-input-28']") static  WebElement SRSuggRate;
	public @FindBy(xpath = "//input[@placeholder='HSN']") static  WebElement RDHSN;
	public @FindBy(xpath = "//*[contains(@id, 'lstIc')]") static  WebElement JobSD;
	public @FindBy(xpath = "//strong[text()='Shipment Details']") static  WebElement ShipmentDetails;
	public @FindBy(xpath = "//*[@id='optnSHIPJobBillTo']")	static  WebElement SelectBillingToShipmentDetailsRD;
	public @FindBy(xpath = "//*[@id='optnSHIPPRShipTo']") static  WebElement SelectShippingToShipmentDetailsRD;
	public @FindBy(xpath = "//*[@id='btnSHIPadd']") static  WebElement AddSD;
	public @FindBy(xpath = "(//mat-slide-toggle//label[@class='mat-slide-toggle-label'])[3]") static  WebElement BRA;
	
	public @FindBy(xpath = "//*[@placeholder='Reference RFQ']") static  WebElement ReferenceRFQ;
	public @FindBy(xpath = "//button[text()='Yes']") static  WebElement Confirmation;
	public @FindBy(xpath = "//span[text()='Service Item View']") static  WebElement ServiceItemView;
	public @FindBy(xpath = "(//mat-option//span)[4]") static  WebElement SRNumber;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-checkbox-inner-container')])[1]") static  WebElement SelectSRNumber;
	public @FindBy(xpath = "//div[text()='Service']") static  WebElement SelectService;
	public @FindBy(xpath = "//button[text()='Next']")	static  WebElement SelectNextIconSR;
	public @FindBy(xpath = "//*[@placeholder='SAC']")	static  WebElement SelectSAC;
	public @FindBy(xpath = "//button[text()='Previous']")	static  WebElement SelectNextIconChooseVendor;
	public @FindBy(xpath = "//*[text()=' Material ']") static  WebElement SelectMaterialTCD;
	
	public @FindBy(xpath = "//*[text() = ' Capital '] ") static  WebElement SelectCapitalTCD;
	public @FindBy(xpath = "//div[text()='Yes']") static  WebElement  ImportPurchase;
	public @FindBy(xpath = "//input[@placeholder='Last Shipment Details']") static  WebElement LastShipmentDetails;
	public @FindBy(xpath = "//*[@class='mat-calendar-body-cell-content mat-calendar-body-today']") static  WebElement SelectLastShipmentDetails;
	public @FindBy(xpath = "//input[@placeholder='Tentative Loading Port']") static  WebElement TentativeLoadingPort;
	public @FindBy(xpath = "//input[@placeholder='Discharge Port']") static  WebElement DischargePort;
	public @FindBy(xpath = "(//i[contains(@class,'fa fa-plus')])[2]") static  WebElement SelectCreate;
	public @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[2]") static  WebElement TCDJob;
	public @FindBy(xpath = "(//*[@class='mat-checkbox-inner-container'])[2]") static  WebElement SelectTCDJob;
	public @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[3]") static  WebElement TCDVendor;
	public @FindBy(xpath = "(//*[@class='mat-checkbox-inner-container'])[2]") static  WebElement SelectTCDVendor;
	public @FindBy(xpath = "//*[@id ='btnTCAGo']") static  WebElement SelectGo;
	public @FindBy(xpath = "//*[@title='BQ edit']") static  WebElement TCDBQEdit;
	public @FindBy(xpath = "(//eipmessagebox//button)[1]") static  WebElement TCDBQEditAcceptAlert;
	
	public @FindBy(xpath = "(//td//a[@class='selection-col ng-star-inserted'])[1]") static  WebElement TCCText;
	
	
	public @FindBy(xpath = "//input[contains(@class,'placeholder mat-input-element')]") static  WebElement EnterAllocQty;
	public @FindBy(xpath = "//*[@id='lpopuptrigger']") static  WebElement ExtDate;
	public @FindBy(xpath = "//*[@class='fa fa-calendar ng-star-inserted']") static  WebElement DeliverBetweenCal;
	public @FindBy(xpath = "//*[text()=' TODAY ']") static  WebElement del;
	public @FindBy(xpath = "//*[text()=' TODAY ']") static  WebElement DeliverBetweenDate;
	public @FindBy(xpath = "//*[text()='Action']") static  WebElement  TCDAction;
	public @FindBy(xpath = "(//input[@ng-reflect-autocomplete='[object Object]'])[3]") static  WebElement PaymentCenter;
	public @FindBy(xpath = "//span[text()='LE180540 - Dhaka Metro CP-07']") static  WebElement SelectPaymentCenter;
	public @FindBy(xpath = "//*[@title='Toggle calendar']") static  WebElement SelectCalendar;
	public @FindBy(xpath = "(//*[@class = 'k-link'])[28]") static  WebElement SelectDate;
	
	public @FindBy(xpath = "//td[@ng-reflect-ng-class='k-state-focused k-today']//following::span[15]") static  WebElement SelectTCDDate;
	public @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']//following::div[1]") static  WebElement SelectRFQRDDate;
	
	public @FindBy(xpath = "//mat-option//span[@class='highlightText']") static  WebElement SelectRFQRefrenceRFQ;
	//mat-option//span[@class='highlightText']
	
	//
	
	public @FindBy(xpath = "(//div//button)[2]") static  WebElement constzonview;
	
	public @FindBy(xpath = "//div[contains(@class,'d-flex align-items-center')]/following-sibling::textarea[1]") static  WebElement Comments;
	public @FindBy(xpath = "//*[@id = 'btnTCASUBMIT']") static  WebElement TCDSubmit;
	public @FindBy(xpath = "(//button[text()=' Ok '])")	static  WebElement TCDInformationAlertAccept;
	
	public @FindBy(xpath = "(//app-alertbox//input)[3]")	static  WebElement TCDAppAlert;
	public @FindBy(xpath = "//*[text()='Save']")	static  WebElement Save;
	public @FindBy(xpath = "(//*[contains(@class, 'eip-link ng-star-inserted')])[1]")	static  WebElement oldDocNo;
	public @FindBy(xpath = "//td//a")	static  WebElement DocNo;
	
	public @FindBy(xpath = "(//*[@title='Approve'])[2]")	static  WebElement Approve;
	public @FindBy(xpath = "//*[@class='fa fa-search']")	static  WebElement ShowAdvanceSearch;
	public @FindBy(xpath = "//*[@placeholder='Document Number']")	static  WebElement EnterRFQFromDB;
	public @FindBy(xpath = "//*[@id='buyersName']")	static  WebElement SearchBQ;
	public @FindBy(xpath = "//*[@id='RFQ_Number']")	static  WebElement EnterRFQFromDBTCC;
	public @FindBy(xpath = "//*[@id='btn_Search']")	static  WebElement SearchTCC;
	public @FindBy(xpath = "//*[@id='ibtTCDGO']")	static  WebElement ASearchTCD;
	public @FindBy(xpath = "//*[@id='ibtAdvancedSearchTCD']")	static  WebElement Advancedsearch;
	public @FindBy(xpath = "//*[@id='ibtTCDfilter']") static  WebElement filter;
	public @FindBy(xpath = "(//kendo-grid-filter-wrapper-cell//input)[1]") static  WebElement RFQNoTCD;
	public @FindBy(xpath = "//*[@class='k-textbox ng-pristine ng-valid ng-touched']") static  WebElement FilterCapitalTCD;
	
	public @FindBy(xpath = "FilterCapitalTCD") static  WebElement TCDNUmAdv;
	
	public @FindBy(xpath = "(//*[@id='btnAdd'])[3]") static  WebElement  AcceptTCD;
	public @FindBy(xpath = "//*[@title='Filter']") static  WebElement FilterTCD;
	public @FindBy(xpath = "//*[@class='k-textbox ng-untouched ng-pristine ng-valid']") static  WebElement DocumentTCD;
	public @FindBy(xpath = "//*[@id='txtDocument']") static  WebElement DocTCD;
	public @FindBy(xpath = "//*[@title='Show Advance Search']") static  WebElement AdvanceSearch;
	public @FindBy(xpath = "(//kendo-grid-toolbar//i)[3]") static  WebElement AdvanceSearchTCC;
	public @FindBy(xpath = "//*[@value='Search']") static  WebElement TCDSearch;
	public @FindBy(xpath = "//*[@placeholder='HSN']") static  WebElement BQCHSN;
	public @FindBy(xpath = "//*[text()='Save']") static  WebElement BQSave;
	
	public @FindBy(xpath = "//*[text()='Request For Quote']") static  WebElement RFQvf;
	public @FindBy(xpath = "//*[text()='Material']") static  WebElement mat;
	public @FindBy(xpath = "//*[text()=' Material ']") static  WebElement eaucMat;
	public @FindBy(xpath = "//*[text()='Service']") static  WebElement ser;
	public @FindBy(xpath = "//*[text()=' Service ']") static  WebElement eaucser;
	
	public @FindBy(xpath = "//*[text()='Package']") static  WebElement pak;
	public @FindBy(xpath = "//*[text()=' Package ']") static  WebElement eaucpak;
	
	public @FindBy(xpath = "//*[text()=' For Action ']") static  WebElement foract;
	public @FindBy(xpath = "//*[text()=' In Progress ']") static  WebElement Inpro;
	public @FindBy(xpath = "//*[text()=' In Progress']") static  WebElement auctInpro;
	
	public @FindBy(xpath = "//*[text()=' Scheduled ']") static  WebElement auctsch;
	public @FindBy(xpath = "//*[text()=' All ']") static  WebElement al;
	public @FindBy(xpath = "(//*[contains(@title, 'Close')])[2]") static  WebElement CRFQcl;
	public @FindBy(xpath = "(//*[contains(@title, 'Close')])[1]") static  WebElement Auccl;
	public @FindBy(xpath = "//*[text()='Add Material ']") static  WebElement addmat;
	public @FindBy(xpath = "//*[text()='Add Service']") static  WebElement addSer;
	public @FindBy(xpath = "//*[text()='Add RFQ Values']") static  WebElement AdRfqVal;
	public @FindBy(xpath = "(//*[@id='actxtSacCodes0'])[2]") static  WebElement SACCode;
	public @FindBy(xpath = "(//mat-option)[3]") static  WebElement SelectSACCode;
	public @FindBy(xpath = "//eipmessagebox//div[3]//button[text()='Ok']") static  WebElement AlertOk;
	
	public @FindBy(xpath = "//eipmessagebox//button") static  WebElement AcceptAlertR;
	public @FindBy(xpath = "//eipmessagebox//h1") static  WebElement ErrorAlert;
	public @FindBy(xpath = "//eipmessagebox//h1") static  WebElement AlertType;
	public @FindBy(xpath = "//eipmessagebox//p") static  WebElement ErrorAlertText;
	public @FindBy(xpath = "(//eipmessagebox//div[3]//button)[1]") static  WebElement RDAlty;
	public @FindBy(xpath = "//mat-checkbox//a") static  WebElement PRNumGrid;
	public @FindBy(xpath = "//*[text()='Previous']") static  WebElement Pre;
	public @FindBy(xpath = "//td/a") static  WebElement LatRfq;
	public @FindBy(xpath = "(//*[@title='Edit'])[1]") static  WebElement RfqEdit; 
	public @FindBy(xpath = "//*[@id='remarks']") static  WebElement getScopeofRFQ;
	
	//karthik
	public @FindBy(xpath = "//p[contains(text(), 'Ship To and Bill From is Cross Country and Import Tag selected as NO. Please select the Proper Import tag and proceed')]") static  WebElement importTag_NO_M;
	public @FindBy(xpath = "(//p[text()='Import Purchase']//following::button)[1]") static  WebElement Import_Yesbtn_M;
	
	public @FindBy(xpath = "//*[text()='Choose Vendors']") static  WebElement Cven;
	public @FindBy(xpath = "//*[text()='Public Offer']") static  WebElement PubOffer;
	public @FindBy(xpath = "//*[text()='Partner Code']") static  WebElement DetPC;
	public @FindBy(xpath = "//*[text()='Partner Name']") static  WebElement DetPN;
	public @FindBy(xpath = "(//*[text()='Vendor Type'])[2]") static  WebElement DetVT;
	public @FindBy(xpath = "//*[text()='M.Category']") static  WebElement DetMC;
	public @FindBy(xpath = "(//*[text()='S.Category'])[2]") static  WebElement DetSC;

	public @FindBy(xpath = "//*[text()='AutoBQ Required']") static  WebElement DetABQR;
	public @FindBy(xpath = "//*[text()='Contact Name']") static  WebElement DetCN;
	public @FindBy(xpath = "//eipmessagebox//div/button") static  WebElement RFQAlert;
	public @FindBy(xpath = "//*[@class='payment-progress-container'] ") static  WebElement paymentReleaseMatch;
	public @FindBy(xpath = "//*[@class='payment-button ng-star-inserted']/i") static  WebElement Addpaym;
	public @FindBy(xpath = "//*[@id='Percent1']") static  WebElement Npayrel;
	public @FindBy(xpath = "(//*[@class='payment-button ng-star-inserted']//i)[2]") static  WebElement delete;
	public @FindBy(xpath = "//*[text()='Add Material ']") static  WebElement MoveAddMat;
	
	public @FindBy(xpath = "//*[text()='Schedule Essentials']") static  WebElement AuctionMoveAddMat;
	
	public @FindBy(xpath = "//*[text()='Add Service']") static  WebElement MoveAddSer;
	public @FindBy(xpath = "//*[text()='Liquidity Damage']") static  WebElement Ld;
	public @FindBy(xpath = "//*[text()='Other Cost']") static  WebElement Oc;
	public @FindBy(xpath = "//*[text()='Defect Liablility Period']") static  WebElement Dlp;
	public @FindBy(xpath = "//*[text()='Special Terms & Qualifications']") static  WebElement StQ;
	public @FindBy(xpath = "//*[text()='Additional Details']") static  WebElement Ad;
//	public @FindBy(xpath = "//*[text()='LD Applicable Date']") static  WebElement Ldad;
	public @FindBy(xpath = "(//mat-select//span)[1]") static  WebElement Ldad;
	
	public @FindBy(xpath = "//mat-select//span[@class='mat-select-placeholder ng-tns-c46-92 ng-star-inserted']") static  WebElement LdAuc;
	
	
	public @FindBy(xpath = "//*[@id='mat-select-0']/div/div[1]/span") static  WebElement SRLdad;
	
	public @FindBy(xpath = "//mat-option//span") static  List<WebElement> LdadList;
	public @FindBy(xpath = "(//app-liquidity//div//mat-select)[2]") static  WebElement Ldvao;
	public @FindBy(xpath = "(//app-liquidity//div[@class='mat-form-field-infix']//input)[1]") static  WebElement RDLdvao;
	public @FindBy(xpath = "//mat-option//span") static  List<WebElement> LdvaoList;
	public @FindBy(xpath = "//input[@placeholder='LD value/Percentage']") static  WebElement Ldvp;
	public @FindBy(xpath = "(//mat-select//span)[5]") static  WebElement Dur;
	public @FindBy(xpath = "(//mat-select//span)[7]") static  WebElement SRDur;
	public @FindBy(xpath = "//mat-option//span") static  List<WebElement> DurList;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[17]") static  WebElement Noy;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[14]") static  WebElement SRNoy;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[12]") static  WebElement RDNoy;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[13]") static  WebElement RDMopy;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[18]") static  WebElement Mopv;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[15]") static  WebElement SRMopv;
	public @FindBy(xpath = "//*[text()='Clear']") static  WebElement LDsave;
	public @FindBy(xpath = "(//*[text()='Action'])[2]") static  WebElement PaymAct;
	public @FindBy(xpath = "//*[@id='optCategoryList0']") static  WebElement CatOC;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[17]") static  WebElement CatVlu;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[12]") static  WebElement RDCatVlu;
	public @FindBy(xpath = "//*[@placeholder='Job']") static  WebElement RDSDJob;
	public @FindBy(xpath = "//*[@placeholder='Billing To']") static  WebElement RDBillingTo;
	public @FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[3]") static  WebElement RDSelectBT;
	public @FindBy(xpath = "//*[@placeholder='Shipping To']") static  WebElement RDShippingTo;
	public @FindBy(xpath = "//*[@placeholder='Execution At']") static  WebElement ExecutionAt;
	public @FindBy(xpath = "(//mat-option//span)[3]") static  WebElement SlExecutionAt;
	public @FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[4]") static  WebElement RDSelectST;
	public @FindBy(xpath = "//*[@id='btnSHIPadd']") static  WebElement RDAddSD;
	
	
	
	public @FindBy(xpath = "(//*[@id='remarks'])[2]") static  WebElement OCRem;
	public @FindBy(xpath = "//*[text()='Save']") static  WebElement OCSave;
	public @FindBy(xpath = "//button[text()='Clear']") static  WebElement DLPSave;
	public @FindBy(xpath = "//*[@placeholder = 'DLP Period']") static  WebElement DLPP;
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[1]") static  WebElement DurDLP;
	public @FindBy(xpath = "(//mat-select//span)[3]") static  WebElement SRDurDLP;
	//public @FindBy(xpath = "(//mat-form-field//input)[13]") static  WebElement SRDurDLP;
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[2]") static  WebElement EvnDLP;
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[3]") static  WebElement SREvnDLP;
	public @FindBy(xpath = "//button[text()='Save']") static  WebElement  SaveDLP;
	public @FindBy(xpath = "//*[@id='mat-input-24']") static  WebElement PT;
	
	public @FindBy(xpath = "(//mat-form-field//input)[20]") static  WebElement PRPT;
	
	public @FindBy(xpath = "(//mat-form-field//input)[22]") static  WebElement PRAuctPT;
	
	
	
	public @FindBy(xpath = "(//mat-form-field//input)[13]") static  WebElement SRPT;
	public @FindBy(xpath = "//*[text()='Clear']") static  WebElement ClearSTQ;
	
	public @FindBy(xpath = "(//mat-form-field//input)[20]") static  WebElement AuctionNavigate;
	
	
	public @FindBy(xpath = "(//*[text()=' Checked'])[2]") static  WebElement checkCD;
	
	public @FindBy(xpath = "//*[@id='mat-input-60']") static  WebElement savePR;
	public @FindBy(xpath = "//*[@id='mat-input-63']") static  WebElement savePRnew;
	
	public @FindBy(xpath = "(//lib-app-otherterms//button)[3]") static  WebElement AuctionSave;
	
	public @FindBy(xpath = "//*[text()='Previous']") static  WebElement RDSTQSave;
	public @FindBy(xpath = "//*[text()='Shipment Details']") static  WebElement SD;
	public @FindBy(xpath = "//mat-checkbox//span//a") static  WebElement Searchresult;
	
	public @FindBy(xpath = "//*[text()='Document Specific Attachment']") static  WebElement DSA;
	public @FindBy(xpath = "//*[@title = 'Access Based Menu']") static  WebElement HomeMenu;
	public @FindBy(xpath = "//*[text()='Supply Chain Mgmt']") static  WebElement SCM;
	public @FindBy(xpath = "//*[text()='Procurement']") static  WebElement PRO;
	public @FindBy(xpath = "//*[text()='RFQ']") static  WebElement MenuRFQ;
	public @FindBy(xpath = "//*[text()='E-Auction']") static  WebElement MenueAuct;
	
	public @FindBy(xpath = "//*[text()='RFQ Bidders Quote']") static  WebElement RFQBQ;
	public @FindBy(xpath = "//*[text()='Rate Discovery']") static  WebElement RFQRD;
	public @FindBy(xpath = "(//mat-slide-toggle//div)[2]") static  WebElement RDicon;
	public @FindBy(xpath = "(//th//span[@class='k-link ng-star-inserted'])[9]") static  WebElement DetailMC;
	public @FindBy(xpath = "//*[text()='Code']") static  WebElement DetailC;
	public @FindBy(xpath = "(//th//span[@class='k-link ng-star-inserted'])[10]") static  WebElement DetailMD;
	public @FindBy(xpath = "(//*[@class='k-header ng-star-inserted'])[3]") static  WebElement DetailAc;
	public @FindBy(xpath = "(//*[text()='Action'])[1]") static  WebElement SerAuc;
	public @FindBy(xpath = "(//*[text()=' Select All'])") static  WebElement ServCate;
	public @FindBy(xpath = "//eipcart//a//i") static  WebElement RDCart;
	public @FindBy(xpath = "//eip-cartview//div//p[@class='mb-0']") static  WebElement RDMC;
	public @FindBy(xpath = "//mat-form-field//div//div//div//input[@id='lstServiceCategory']") static  WebElement RDMatCat;
	public @FindBy(xpath = "//*[text()=' Select All']") static  WebElement RDMatSL;
	public @FindBy(xpath = "//*[text()='Selected Items']") static  WebElement SelIt;
	public @FindBy(xpath = "//*[@placeholder='Material Group']") static  WebElement RDMG;
	public @FindBy(xpath = "//*[@placeholder = 'Group']") static  WebElement RDSG;
	public @FindBy(xpath = "(//mat-form-field//input)[12]") static  WebElement RDEG;
	public @FindBy(xpath = "//*[text()=' - P&M Hiring']") static  WebElement RDSEG;
	public @FindBy(xpath = "//button//i[@class='fa fa-angle-right font-weight-bold']") static  WebElement MoveSelitm;
	public @FindBy(xpath = "//button[@class='btn btn-primary']") static  WebElement CartPost;
	public @FindBy(xpath = "(//eipgeneralcart//button)[6]") static  WebElement SRDCartPost;
	
	public @FindBy(xpath = "(//mat-list-option//div[2])[5]") static  WebElement RDCI;
	
	public @FindBy(xpath = "//*[text()='Next']") static  WebElement RDNext;
	public @FindBy(xpath = "//td//div//input[@id='mat-input-73']") static  WebElement RDSuggRate;
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-75']") static  WebElement RDQuantity;
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-76']") static  WebElement RDSuggestedRate;
	
	
	
	public @FindBy(xpath = "(//td//div//input)[2]") static  WebElement RDEditSuggRate;
	public @FindBy(xpath = "(//td//input)[3]") static  WebElement SRSuggRDService;
	
	public @FindBy(xpath = "(//*[text()='Action'])[3]") static  WebElement PTAuc;
	public @FindBy(xpath = "//*[text()='AutoBQ Required']") static  WebElement AutoBQ;
	
	public @FindBy(xpath = "(//mat-button-toggle//button//div)[8]") static  WebElement SelectAutoBQ;
	public @FindBy(xpath = "(//mat-button-toggle//button)[11]") static  WebElement SelectSRAutoBQ;
	public @FindBy(xpath = "(//*[text()='Action'])[1]") static  WebElement RDAddmatAuct;
	public @FindBy(xpath = "(//*[text()='Action'])[2]") static  WebElement RDAddmatEditAuct;
	
	public @FindBy(xpath = "(//td//a)[1]") static  WebElement RDFirstRFQToEdit;
	public @FindBy(xpath = "(//*[@title='Approve'])[2]") static  WebElement SelectAppBut; 
	public @FindBy(xpath = "(//i[@title='Edit'])[1]") static  WebElement RDRFQEdit;
	public @FindBy(xpath = "//*[@id='ibtDSDelvrySchSaveClose']") static  WebElement RDEdirSaveDraft;
	public @FindBy(xpath = "//*[text()='Request']") static  WebElement Request;
	public @FindBy(xpath = "//*[text()='Purchase / Service']") static  WebElement PurchaseService;
	public @FindBy(xpath = "//*[@id='ibtTCDToggleCapital']") static  WebElement CapitalTCD;
	
	//RFQ Service
	
	public @FindBy(xpath = "//*[text()='Service']") static  WebElement RFQService;
	//public @FindBy(xpath = "//*[text()='Service Item View']") static  WebElement ServiceItemView;
	public @FindBy(xpath = "(//button[@type='button'])[8]") static  WebElement SRNext;
	public @FindBy(xpath = "(//kendo-grid-toolbar//i)[7]") static  WebElement SRfilter;
	public @FindBy(xpath = "(//td//input)[1]") static  WebElement FilterSRNo;
	public @FindBy(xpath = "(//mat-checkbox//div)[1]") static  WebElement SelectSRNo;
	public @FindBy(xpath = "(//button[@type='button'])[14]") static  WebElement AfterSelectSRNext;
	
	
	//(//mat-tab-header//div//div//div//div//div)[5]
	
	//Auction
	
	public @FindBy(xpath = "//*[text()=' E-Auction ']") static  WebElement auct;
	public @FindBy(xpath = "//*[@id='lblEAuction']") static  WebElement auc;
	public @FindBy(xpath = "//*[text()='Schedule Essentials']") static  WebElement LBSE;
	public @FindBy(xpath = "//*[@placeholder='Auction Scope']") static  WebElement TBScope;
	public @FindBy(xpath = "(//mat-select//span)[3]") static  WebElement AuctionSource;
	public @FindBy(xpath = "//mat-option") static  List<WebElement> AuctionSourceList;
	public @FindBy(xpath = "(//kendo-grid-toolbar//i)[9]") static  WebElement AuctionFilter;
	public @FindBy(xpath = "(//kendo-grid-filter-wrapper-cell//input)[1]") static  WebElement AuctionFilterPR;
	public @FindBy(xpath = "(//mat-checkbox//label)[2]") static  WebElement SelectAuctionFilterPR;
	public @FindBy(xpath = "//*[@id='btnNext']") static  WebElement SelectNextAuction;
	public @FindBy(xpath = "(//app-eabidvaluessearch//p)[2]") static  WebElement AucType;
	public @FindBy(xpath = "//td//input[@id='mat-input-61']") static  WebElement bidvaluQnty;
	public @FindBy(xpath = "//td//i[@id='gibtexpandlist']") static  WebElement explist;
	public @FindBy(xpath = "//td//p") static  WebElement AucRevdelschedule;
	
	public @FindBy(xpath = "//*[@id='actxtHsnCodes0']") static  WebElement AucRevHSN0;
	public @FindBy(xpath = "//*[@id='actxtHsnCodes1']") static  WebElement AucRevHSN1;
	public @FindBy(xpath = "//*[@id='actxtHsnCodes2']") static  WebElement AucRevHSN2;
	public @FindBy(xpath = "//*[@id='actxtHsnCodes3']") static  WebElement AucRevHSN3;
	
	
	public @FindBy(xpath = "//*[@id='btnSaveDraft']") static  WebElement NextBitvalue;
	public @FindBy(xpath = "//*[@id='ibtDSDelvrySchSave']") static  WebElement SaveAucRevdelschedule;
	public @FindBy(xpath = "(//mat-form-field//input)[3]") static  WebElement AucHSN;
	public @FindBy(xpath = "(//mat-option)[1]") static  WebElement selectAucHSN;
	
	public @FindBy(xpath = "//*[text()=' Package ']") static  WebElement Package;
	
	public @FindBy(xpath = "//*[@id='btnNext']") static  WebElement NextSE;
	
	public @FindBy(xpath = "//*[@id='materialDesc']") static  WebElement Desciption;
	
	public @FindBy(xpath = "(//*[@id='materialDesc'])[2]") static  WebElement Desciption2;
	public @FindBy(xpath = "(//*[@id='materialDesc'])[3]") static  WebElement Desciption3;
	
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-17']") static  WebElement AuctionQuantityNew;
	
	public @FindBy(xpath = "(//td[@data-kendo-grid-column-index='2'])[11]//input") static  WebElement AuctionQuantity;
	
	public @FindBy(xpath = "(//td[@data-kendo-grid-column-index='2'])[12]//input") static  WebElement AuctionQuantity2;
	
	public @FindBy(xpath = "(//td[@data-kendo-grid-column-index='2'])[13]//input") static  WebElement AuctionQuantity3;
	
	
	public @FindBy(xpath = "//*[@id='uomCode0']") static  WebElement UOM;
	
	public @FindBy(xpath = "//*[@id='uomCode1']") static  WebElement UOM1;
	
	public @FindBy(xpath = "//*[@id='uomCode2']") static  WebElement UOM2;
	
	
	
	public @FindBy(xpath = "(//td[@data-kendo-grid-column-index='4'])[11]//input") static  WebElement AuSuggRate;
	
	public @FindBy(xpath = "(//td[@data-kendo-grid-column-index='4'])[12]//input") static  WebElement AuSuggRate1;
	
	public @FindBy(xpath = "(//td[@data-kendo-grid-column-index='4'])[13]//input") static  WebElement AuSuggRate2;
	
	
	
	public @FindBy(xpath = "(//*[text()='Action'])[1]") static  WebElement Auctionrdr;
	
	public @FindBy(xpath = "//*[@id='btnSaveDraft']") static  WebElement BitvalueNext;
	
	public @FindBy(xpath = "(//div//button[text()='Save'])[1]") static  WebElement SMSaveBQ;
	public @FindBy(xpath = "(//div//button[text()='Save'])[2]") static  WebElement TDSaveBQ;
	public @FindBy(xpath = "(//div//button[text()='Save'])[3]") static  WebElement RESaveBQ;
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-22']") static  WebElement YourBid;
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-4']") static  WebElement YourBidMat;
	public @FindBy(xpath = "(//mat-card-actions//input[@class='btn btn-primary eip-ml-xs-0'])[1]") static  WebElement YourBidMat1;
	public @FindBy(xpath = "(//mat-card-actions//input[@class='btn btn-primary eip-ml-xs-0'])[2]") static  WebElement YourBidMat2;
	public @FindBy(xpath = "(//mat-card-actions//input[@class='btn btn-primary eip-ml-xs-0'])[3]") static  WebElement YourBidMat3;
	public @FindBy(xpath = "(//mat-card-actions//input[@class='btn btn-primary eip-ml-xs-0'])[4]") static  WebElement YourBidMat4;
	
	
	
	public @FindBy(xpath = "(//*[@placeholder = 'Your Bid'])[1]") static  WebElement AucYourBid1;
	public @FindBy(xpath = "(//*[@placeholder = 'Your Bid'])[2]") static  WebElement AucYourBid2;
	public @FindBy(xpath = "(//*[@placeholder = 'Your Bid'])[3]") static  WebElement AucYourBid3;
	public @FindBy(xpath = "(//*[@placeholder = 'Your Bid'])[4]") static  WebElement AucYourBid4;
	
	public @FindBy(xpath = "//*[text()='Post all bids']") static  WebElement PostAllBids;
	
	public @FindBy(xpath = "(//mat-card-content//p[@class='cv-view-data  eip-link'])[1]") static  WebElement ReBid1;
	public @FindBy(xpath = "(//mat-card-content//p[@class='cv-view-data  eip-link'])[2]") static  WebElement ReBid2;
	public @FindBy(xpath = "(//mat-card-content//p[@class='cv-view-data  eip-link'])[3]") static  WebElement ReBid3;
	
	
	
	
	
	
	public @FindBy(xpath = "//*[@value='Bid']") static  WebElement Bid;
	
	public @FindBy(xpath = "//mat-card-content//p[@class='cv-view-data  eip-link']") static  WebElement NextPossibleBid;
	public @FindBy(xpath = "//kendo-grid-toolbar//i[@title='Filter']") static  WebElement AuctionFilterCom;
	public @FindBy(xpath = "(//kendo-grid-filter-wrapper-cell//input)[1]") static  WebElement EnterAuctioninFilter;
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[1]") static  WebElement RORAuctionType;
	
	public @FindBy(xpath = "//mat-form-field//span[@class='fa fa-times cursor-pointer ng-star-inserted']") static  WebElement BillFromClear;
	
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[1]") static  WebElement BidInd1;
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[2]") static  WebElement BidInd2;
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[3]") static  WebElement BidInd3;
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[4]") static  WebElement BidInd4;
	
	public @FindBy(xpath = "//*[@value='Re Bid']") static  WebElement ReBidInd;
	
	
	
	
	
	
	
	
	//eipmessagebox//button
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public @FindBy(xpath = "//*[@id='lstIc']") static  WebElement RDSRJobAD;
	
	
	//PR
	
	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static  WebElement EnterPerchase;
	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static  WebElement GeneralConsource;
	public @FindBy(xpath = "//*[text()=' Purchase / Service ']")	static  WebElement SelectPS;
	public @FindBy(xpath = "//span[text()=' General - Consource ']") static  WebElement SelectGC;
	public @FindBy(xpath = "//*[@title='Show Advance Search']") static  WebElement PRAdvanceSearch;
	public @FindBy(xpath = "//*[@class='fa fa-search']") static  WebElement AdvanceSearchGC;
	public @FindBy(xpath = "//*[@placeholder='PR Number']") static  WebElement PRNumAllocation;
	public @FindBy(xpath = "//*[@id='txtDocument']") static  WebElement  DocumentNo;
	public @FindBy(xpath = "//*[text()=' Material']")	static  WebElement SelectMaterial;
	
	public @FindBy(xpath = "//*[text()='Service ']") static WebElement SelectServiceSR;
	public @FindBy(xpath = "//*[@title='Create']") static WebElement SRCreate;
	public @FindBy(xpath = "//*[contains(@id, 'ibtAddButton')]")	static  WebElement ClickCreateRequest;
	public @FindBy(xpath = "//*[@id='lstSerCat']")	static  WebElement SRServiceGroup;
	
	public @FindBy(xpath = "(//mat-option//span)[3]")	static  WebElement SelSRServiceGroup;
	
	public @FindBy(xpath = "(//*[@id='icon-rightdateRange_Kendo'])[2]")	static  WebElement WOPeriod;
	
	
	public @FindBy(xpath = "//*[contains(@id, 'jobId')]") static  WebElement EnterJob;
	public @FindBy(xpath = "//*[@id='lstJob']") static  WebElement EnterSRJob;
	public @FindBy(xpath = "//*[@id='paymentId']") static  WebElement PaymentCentre;
	public @FindBy(xpath = "//*[contains(@id, 'lstWareHouse')]") static  WebElement Warehouse;
	public @FindBy(xpath = "//*[contains(@id, 'ActxtboxPOAPurchaseGroup')]") static  WebElement PurchaseGroup;
	public @FindBy(xpath = "//*[contains(@id, 'lstplanningCategory')]") static  WebElement planningCategory;
	public @FindBy(xpath = "//*[contains(@id, 'txtRate')]") static  WebElement Remarks;
	public @FindBy(xpath = "//*[contains(@class,'fa fa-cart-plus cart-cursor-pointer')]") static  WebElement AddCart;
	public @FindBy(xpath = "//*[text()='Add To Cart']") static  WebElement AddToCart;
	public @FindBy(xpath = "//*[@Class='fa fa-shopping-cart']") static  WebElement SelectCart;
	public @FindBy(xpath = "//*[@placeholder='Search buyer name']") static  WebElement SearchBuyerName;
	public @FindBy(xpath = "//*[text()='20055918 - PRABHU U']") static  WebElement Chooseyourbuyers;
	public @FindBy(xpath = "//*[text()='Allocate']") static  WebElement SelectAllocate;
	public @FindBy(xpath = "//*[@id='multi-select-input-lstMatGroup']") static  WebElement PRMaterialGroup;
	public @FindBy(xpath = "//*[text()=' Select All']") static  WebElement SALLMaterialGroup;
	public @FindBy(xpath = "//*[@id='leftSearchText']") static  WebElement PRChooseItems;
	public @FindBy(xpath = "//*[@class='mat-list-text']") static  WebElement Item;
	public @FindBy(xpath = "(//*[contains(@class, 'fa fa-angle-right font-weight-bold')])") static  WebElement PRMoveToSelectedItems;
	public @FindBy(xpath = "//button[text()='Post']") static  WebElement PRPost;
	public @FindBy(xpath = "//*[@id='k-grid1-r1c1']") static  WebElement CostPackage;
	public @FindBy(xpath = "//*[@id='cpCode0']") static  WebElement SRCostPackage;
	public @FindBy(xpath = "//*[@id='wbsCode0']") static  WebElement WBS;
	public @FindBy(xpath = "(//*[@class='k-input'])[2]") static  WebElement EnterCostPackage;
	public @FindBy(xpath = "(//mat-list-option//div[@class='mat-list-text'])[1]") static  WebElement AuctionPRAddcart;
	
	public @FindBy(xpath = "//*[@id='mat-input-14']") static  WebElement PRQuantity;
	// public @FindBy(xpath = "(//*[@class='k-grid-column-right ng-star-inserted'])[5]") static  WebElement PR2Quantity;
	public @FindBy(xpath = "(//td//div[@class='k-grid-column-right ng-star-inserted'])[7]") static  WebElement PR3Quantity;
	public @FindBy(xpath = "//*[text()='Quantity']") static  WebElement AuctionQuantityMAt;
	
	// TEST XPATH
	public @FindBy(xpath = "(//td//div[@class='k-grid-column-right ng-star-inserted'])[3]") static  WebElement PR2Quantity;
	
	public @FindBy(xpath = "(//input[contains(@class, appdecimalnumber)])[11]") static  WebElement PR22Quantity;
		
	public @FindBy(xpath = "(//td//div[@class='k-grid-column-right ng-star-inserted'])[11]") static  WebElement PR4Quantity;
	
	
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[1]") static  WebElement SRCQuantity;
	public @FindBy(xpath = "//*[@id='mat-input-15']") static  WebElement PRSuggRate;
	public @FindBy(xpath = "(//td//input)[4]") static  WebElement SRCSuggRate;
	public @FindBy(xpath = "//*[@id='icon-rightdateRange_Kendo']") static  WebElement DeliveryDate;
	public @FindBy(xpath = "//button[text()='Submit']") static  WebElement PRSubmit;
	public @FindBy(xpath = "//eipmessagebox//button")	static  WebElement PurchasesRequestAccept;
	public @FindBy(xpath = "//eipmessagebox//button")	static  WebElement ServiceRequestAccept;
	public @FindBy(xpath = "(//*[contains(@class, 'eip-link ng-star-inserted')])") static  WebElement PR;
	public @FindBy(xpath = "(//*[@title='Approve'])[2]")	static  WebElement PRApprove;
	public @FindBy(xpath = "(//*[@id='btnAdd'])[3]")	static  WebElement ApprovalSucess;
	public @FindBy(xpath = "//*[@class = 'mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") static  WebElement eSourceAllocation;
	public @FindBy(xpath = "//*[text()='Add To Cart']") static  WebElement AllocationAddToCart;
	public @FindBy(xpath = "//*[@value='Clear']") static  WebElement SearchIcon;
	public @FindBy(xpath = "//*[@class='k-icon k-i-x']") static  WebElement closeiconAllocate;
	public @FindBy(xpath = "//*[text()='1 - 1 of 1 items']")	static  WebElement Sdown;
	public @FindBy(xpath = "//*[text()=' 163234 - ARULSELVAN ']") static  WebElement ChooseyourbuyersDomesticJob;
	public @FindBy(xpath = "//*[@placeholder ='Service Category ']") static  WebElement ServiceCategorySR;
	public @FindBy(xpath = "//*[text()=' Select All']") static  WebElement SelectSCSR;
	public @FindBy(xpath = "//*[@placeholder ='Nature of scope(Optional)']") static  WebElement NatureofscopeSR;
	
	public @FindBy(xpath = "//eipcart//i") static  WebElement SRCart;
	public @FindBy(xpath = "//*[text()='Selected Items']") static  WebElement SISR;
	
	public @FindBy(xpath = "//mat-list-option//span") static  WebElement CISR;	
	
	public @FindBy(xpath = "//*[@placeholder ='Group (optional)']") static  WebElement SRGroup;
	
	public @FindBy(xpath = "(//*[@id='icon-rightdateRange_Kendo'])[2]") static  WebElement PRDeliveryDate;
	public @FindBy(xpath = "//*[text()=' TODAY ']") static  WebElement Date;
	public @FindBy(xpath = "//*[text()='General - Consource']") static  WebElement PRGR;
	
public @FindBy(xpath = "(//kendo-textbox-container//input)[4]")	static  WebElement PRDate;
	
	public @FindBy(xpath = "//eipdaterangepicker//input[@id='icon-rightrfqDateRange']")	static  WebElement AllDatePR;
	
	public @FindBy(xpath = "//mat-form-field//input[@id='hsn0']")	static  WebElement AuctionHSN;
	public @FindBy(xpath = "(//mat-option//span//span)[1]")	static  WebElement SelAuctionHSN;
	
	public @FindBy(xpath = "(//mat-list-option//div//div[@class='mat-list-item-ripple mat-ripple'])[2]") static  WebElement SelMaterial1;
	
	public @FindBy(xpath = "(//mat-list-option//div//div[@class='mat-list-item-ripple mat-ripple'])[5]") static  WebElement SelMaterial2;
	public @FindBy(xpath = "(//mat-list-option//div//div[@class='mat-list-item-ripple mat-ripple'])[7]") static  WebElement SelMaterial3;
	public @FindBy(xpath = "(//mat-list-option//div//div[@class='mat-list-item-ripple mat-ripple'])[9]") static  WebElement SelMaterial4;
	
	
	
	
	public @FindBy(xpath = "//*[@id='RFQDetails']")	static  WebElement SelectRFQforAuction;
	
	public @FindBy(xpath = "//mat-option//span[@class='highlightText']")	static  WebElement SelectRFQforAuctionNumber;
	
//	==============================================================================================================================================
	
	public @FindBy(xpath = "//button//div[text()=' Service ' or @class='']")	static  WebElement Service;
	public @FindBy(xpath = "//*[@id='ibtTCDfilter']")	static  WebElement Filter_Icon;
	public @FindBy(xpath = "/html/body/app-root/div/div[2]/app-tcd-container/dynamic-tabs/dynamic-tab/div/app-tcd-landingpage/div/div/div[2]/kendo-grid/kendo-grid-toolbar/div/div[4]/div/div[2]/i")	static  WebElement Filter_Icon1;
	public @FindBy(xpath = "/html/body/app-root/div/div[2]/app-workbenchtab/div/div[4]/kendo-grid/kendo-grid-toolbar/div/div[4]/div/div[2]/i")	static  WebElement Filter_Icon_Approve;
	
	public @FindBy(xpath = "//*[@id='k-grid0-r1c0']/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")	static  WebElement Filter_RFQ_No;
	public @FindBy(xpath = "//i[@id='ibtTCDADD' or @title='']")	static  WebElement Create;
	public @FindBy(xpath = "//div//input[@id='multi-select-input-lstJob' or @placeh]")	static  WebElement Select_Job_Click;
	public @FindBy(xpath = "(//span//div//input)[1]")	static  WebElement Select_job;
	public @FindBy(xpath = "//div//input[@id='multi-select-input-lstVendor' or @plac]")	static  WebElement Select_vendor_click;
	public @FindBy(xpath = "(//label//div)[4]")	static  WebElement Select_vendor;
	public @FindBy(xpath = "//input[@id='btnTCAGo' or @title='']")	static  WebElement Go_Button;
	public @FindBy(xpath = "(//label//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'] | //input[@id='ibtChkTCAPRDetail0-input' or @type=''])[2]")	static  WebElement job;
	public @FindBy(xpath = "//input[@id='txtQty' or @typ]")	static  WebElement Alloc_QTY;
	public @FindBy(xpath = "//input[@id='coa0' or @class='']")	static  WebElement Coa_Code;
	public @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")	static  WebElement Coa_Code_Select;
	public @FindBy(xpath = "//input[@id='mat-input-6' or @class='']")	static  WebElement TDS;
	public @FindBy(xpath = "//div//textarea[@class='comment-textarea ng-untouched ng-pristine ng-valid ng-star-inserted' or @row='50']")	static  WebElement Command;
	public @FindBy(xpath = "//div//input[@id='btnTCASUBMIT' or @value='']")	static  WebElement Submit_button;
	public @FindBy(xpath = "//button[text()='POST' or @class='']")	static  WebElement Post_button;
	public @FindBy(xpath = "//div//button[text()=' Ok ']")	static  WebElement OK_button;
	public @FindBy(xpath = "//span[@title='close' or @class='']")	static  WebElement Close_button;
	
// =======================================================================================================	
	
	
	public @FindBy(xpath = "(//kendo-grid-filter-wrapper-cell//input[@class='k-textbox ng-pristine ng-valid ng-touched'])[1]")	static  WebElement Filter_Doc_No;
	
	public @FindBy(xpath = "(//i[@title='Approve' or @class=''])[2]")	static  WebElement Approve_Level1_Icon;
	public @FindBy(xpath = "(//div//input[@id='btnAdd' or @type='submit'])[3]")	static  WebElement OK_Button_Level1;
	public @FindBy(xpath = "(//i[@class='fa fa-times-circle pull-right'])[3]")	static  WebElement Close_Button_Level1;
	public @FindBy(xpath = "/html/body/app-root/div/div[2]/app-workbenchtab/div/div[4]/kendo-grid/div/div/div/table/thead/tr[2]/td[3]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")	static  WebElement Filter_Doc_No_click;

	public @FindBy(xpath = "//div//i[@id='profiledropdownbtn' or @class='']")	static  WebElement Sign_out_Icon;
	public @FindBy(xpath = "//a[text()='Sign Out']")	static  WebElement Sign_out;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-home']")
	public static WebElement Home;
	
	
	
	 
	
	 
	
	
	
	 
	
	
	 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
