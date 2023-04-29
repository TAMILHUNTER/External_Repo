package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	public @FindBy(xpath = "(//kendo-grid-list//input)[1]")	static  WebElement EnterQuantity;
	
	public @FindBy(xpath = "(//*[contains(@class, 'k-textbox-border')])[1]")	static  WebElement RFQQuantity;
	
	
	public @FindBy(xpath = "(//kendo-grid-list//input)[5]")	static  WebElement EnterQuantity1;
	public @FindBy(xpath = "(//kendo-grid-list//input)[9]")	static  WebElement EnterQuantity2;
	public @FindBy(xpath = "(//kendo-grid-list//input)[13]")	static  WebElement EnterQuantity3;
	
	
	
	
	
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
	
	public @FindBy(xpath = "(//*[text()='Supply at'])[1]") static WebElement Supplyat; 
	
	
	public @FindBy(xpath = "//mat-option//span//span") static  List <WebElement> NCList;
	// public @FindBy(xpath = "//mat-option//span//span") static  WebElement NCList;
	public @FindBy(xpath = "//*[contains(@id,'RefValue0')]")	static  WebElement SelectReferenceValuePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id, 'creditDays0')]")	static  WebElement SelectCreditDaysPaymentTerms;
	public @FindBy(xpath = "//*[contains(@id,'PaymentMode0')]")	static  WebElement SelectPaymentModePaymentTerms;
	public @FindBy(xpath = "//*[contains(@id, 'RefDateValue0')]")	static  WebElement SelectReferenceDatePaymentTerms;
	public @FindBy(xpath = "//*[@id='mat-input-99']") static  WebElement Doc;
	
	public @FindBy(xpath = "//*[@id='mat-input-95']") static  WebElement AucDoc;
	public @FindBy(xpath = "//*[@id='mat-input-85']") static  WebElement AucRevDoc;
	
	public @FindBy(xpath = "//*[@id='mat-input-92']") static  WebElement AucRevRDDoc;
	
	public @FindBy(xpath = "//*[@id='mat-input-103']") static  WebElement AucRevMulRDDoc;
	
	//public @FindBy(xpath = "(//mat-form-field//div//div//span)[13]") static  WebElement VendorClear;
	
	//test RFQ Vendor close
	
	public @FindBy(xpath = "(//button[text()='Add'])/preceding::eipautocomplete[1]//span[@title='clear']") static  WebElement VendorClear;
	
	
	public @FindBy(xpath = "(//mat-form-field//span[@title='clear'])[4]") static  WebElement RFQVendorClear;
	
	
	
	public @FindBy(xpath = "(//*[@title='clear'])[4]") static  WebElement VendorMaterialClear;
	
	public @FindBy(xpath = "(//*[@title='clear'])[7]") static  WebElement VendorMaterialPRClear;
	
	public @FindBy(xpath = "(//mat-dialog-container//i)[2]") static  WebElement CloseSavedtaft;
	
	public @FindBy(xpath = "//mat-dialog-container//button[text()='Next']") static  WebElement VendorNext;
	
	
	
	
	
	
	
	
	
	
	
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-89']") static  WebElement AucRevPRDoc;
	
	
	
	
	public @FindBy(xpath = "(//mat-form-field//input)[12]") static  WebElement SRDoc;
	public @FindBy(xpath = "(//mat-form-field//input)[11]") static  WebElement SRRDDoc;
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-113']") static  WebElement PRPaymentDocument;
	
	
	
	//public @FindBy(xpath = "(//mat-form-field//div//div//div[@class='mat-form-field-infix']//input)[10]") static  WebElement RDDoc;
	
	public @FindBy(xpath = "//*[@class='payment-button ng-star-inserted']/i/preceding::eipmultiselectautocomplete[1]//input") static  WebElement RDDoc;
	
	
	
	public @FindBy(xpath = "(//mat-form-field//div//div//div[@class='mat-form-field-infix']//input)[13]") static  WebElement RDDocMultiMate;
	
	
	public @FindBy(xpath = "//span[text() = ' Select All']")	static  WebElement SelectDocumentPaymentTerms;
	
	public @FindBy(xpath = "//mat-panel-title[text() = ' Preview ']")	static  WebElement ClickAndConform;
	public @FindBy(xpath = "//button[text()='Next']")	static  WebElement SelectNextIconPaymentTerms;
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
	
	public @FindBy(xpath = "(//mat-horizontal-stepper//button)[6]")	static  WebElement SaveOthercost;
	
	
	
	
	
	
	
	public @FindBy(xpath = "//*[text() = ' Trade Details']") static  WebElement  TradeDetails;
	
	public @FindBy(xpath = "(//mat-button-toggle//button)[10]") static  WebElement  ASNapplicableYES_M;
	
	public @FindBy(xpath = "//input[@placeholder='Trade Terms']") static  WebElement TradeTerms;
	
	public @FindBy(xpath = "//*[@placeholder='HSN Code']") static  WebElement AuctionReferRFQHSN;
	
	
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[4]") static  WebElement AucTradeTerms;
	
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[5]") static  WebElement AucEventsDefect;
	
	public @FindBy(xpath = "//span[text()='11 - F.O.R. YOUR GODOWN']") static  WebElement SelectTradeTerms;
	public @FindBy(xpath = "(//mat-option)[3]") static  WebElement SelectAuctionTradeTerms;
	
	public @FindBy(xpath = "(//mat-option//span)[1]") static  WebElement SelectAucTradeTerms;
	
	public @FindBy(xpath = "(//mat-option//span)[1]") static  List<WebElement> LISupplyat;
	
	public @FindBy(xpath = "//*[text()='Request Essentials']") static  WebElement RequestEssentialsMenu;
	public @FindBy(xpath = "//*[text()=' Request Essentials']") static  WebElement RequestEssentialsMenuRFQ;
	
	public @FindBy(xpath = "//*[text()='Request Essentials']") static  WebElement RequestEssentialsMenuAuc;
	
	public @FindBy(xpath = "(//*[contains(@id, 'iDtTAGOrdrExpDate')])") static  WebElement OrderExpiryDate;
	public @FindBy(xpath = "(//*[contains(@class, 'mat-calendar-body-today')])") static  WebElement RFQOrderExpiryDate;
	
	// Test
	public @FindBy(xpath = "//div[@class='mat-calendar-body-cell-content']/parent::td") static  List<WebElement> RFQOrderExpiryDate2;
	
	public @FindBy(xpath = "//*[@class='k-link']/parent::td") static  List<WebElement> POAExpDeliveryDate;
	
	
	
	
	
	public @FindBy(xpath = "(//tbody[@kendocalendarview])[3]/tr/td[@aria-disabled='false']") static  List<WebElement> TCDClaDate;
	
	
	
	
	
	public @FindBy(xpath = "//button[contains(@class, 'btn btn-primary buttonspace-container eip-ml-20')]") static  WebElement SaveRFQOrderExpiryDate;
	public @FindBy(xpath = "//button[contains(@id, 'btnNext')]") static  WebElement NextIconAuction;
	public @FindBy(xpath = "(//*[text()='Save'])[1]") static  WebElement OTSave;
	public @FindBy(xpath = "//*[text()='Save']") static  WebElement SaveSD;
	
	public @FindBy(xpath = "//*[text()=' Submitted ']") static  WebElement SubmitStatus;
	
	
	
	public @FindBy(xpath = "//*[text()=' Stage 1 ']") static  WebElement DownPaymentTerms;
	public @FindBy(xpath = "//textarea[@placeholder='External Message']") static  WebElement extmsg;
	public @FindBy(xpath = "//*[text() ='Attach General Terms & Conditions']") static  WebElement AttachGeneralTerms;
	public @FindBy(xpath = "//*[@id='btnPrevious']") static  WebElement AuctionAttachGeneralTerms;
	
	public @FindBy(xpath = "(//*[@title='Page Number'])[2]") static  WebElement BidValues;
	
	public @FindBy(xpath = "(//*[@title='Page Number'])[3]") static  WebElement Vendor;
	
	
	
	public @FindBy(xpath = "//*[text()='Attach general terms and conditions']") static  WebElement AuctionAttachGeneralTermsS;
	
	public @FindBy(xpath = "(//*[@title='Page Number'])[5]") static  WebElement AuctionAttachGeneralTermsSS;
	
	public @FindBy(xpath = "//*[text()='Items per page:']") static  WebElement SDPlaveBid;
	
	public @FindBy(xpath = "(//app-bqsearchcomponent//input[@type='submit'])[2]") static  WebElement SearchAuction;
	
	
	
	
	
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
	public @FindBy(xpath = "(//*[@id='rfqRate'])[2]") static  WebElement Rate1;
	public @FindBy(xpath = "(//*[@id='rfqRate'])[3]") static  WebElement Rate2;
	public @FindBy(xpath = "(//*[@id='rfqRate'])[4]") static  WebElement Rate3;
	
	public @FindBy(xpath = "//*[@placeholder='Nature Code']") static  WebElement NatureCode;
	public @FindBy(xpath = "//button[text() ='Save Draft']") static  WebElement SaveDraft;
	
	public @FindBy(xpath = "//mat-card-actions//input") static  WebElement TechnoCommercials;
	public @FindBy(xpath = "//*[text()='Additional Details']") static  WebElement AdditionalDetails;
	public @FindBy(xpath = "//*[@id= 'vendorAdress0']") static  WebElement BillFrom;
	public @FindBy(xpath = "//*[@placeholder= 'GST Register No']") static  WebElement GSTRegisterNo;
	public @FindBy(xpath = "(//*[@title='Close'])[1]") static  WebElement Close;
	public @FindBy(xpath = "//mat-dialog-container//i[@title='Close']") static  WebElement AuctionClose;
	
	//public @FindBy(xpath = "//*[text()='e-Auction']/following::i[@title='Close']") static  WebElement AuctionClose;
	
	
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
	
	public @FindBy(xpath = "//*[text()=' Rejected ']") static  WebElement SelectRejectedTCD;
	
	public @FindBy(xpath = "//*[@title='Refresh']") static  WebElement SelectRefreshTCD;
	
	public @FindBy(xpath = "//*[@title='Chart View']") static  WebElement ChartView;
	public @FindBy(xpath = "(//*[text()=' View '])[1]") static  WebElement View;
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	public @FindBy(xpath = "//*[@id='txtQty']") static  WebElement EnterAllocQty;
	
	public @FindBy(xpath = "(//*[@class='mat-checkbox-frame'])[1]") static  WebElement TCDVendorCheckBox;
	
	
	public @FindBy(xpath = "//*[@id='lpopuptrigger']") static  WebElement ExtDate;
	public @FindBy(xpath = "//*[@class='fa fa-calendar ng-star-inserted']") static  WebElement DeliverBetweenCal;
	public @FindBy(xpath = "//*[text()=' TODAY ']") static  WebElement del;
	public @FindBy(xpath = "//*[text()=' TODAY ']") static  WebElement DeliverBetweenDate;
	public @FindBy(xpath = "//*[text()='Action']") static  WebElement  TCDAction;
	public @FindBy(xpath = "(//input[@ng-reflect-autocomplete='[object Object]'])[3]") static  WebElement PaymentCenter;
	public @FindBy(xpath = "//mat-option//span//span") static  WebElement SelectPaymentCenter;
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
	
	public @FindBy(xpath = "//*[@id='btnTCASaveDraft']")	static  WebElement TCDSaveDraft;
	
	
	
	public @FindBy(xpath = "//*[text()='Save']")	static  WebElement Save;
	public @FindBy(xpath = "(//*[contains(@class, 'eip-link ng-star-inserted')])[1]")	static  WebElement oldDocNo;
	public @FindBy(xpath = "//td//a")	static  WebElement DocNo;
	
	public @FindBy(xpath = "(//*[@title='Approve'])[2]")	static  WebElement Approve;
	public @FindBy(xpath = "//*[@class='fa fa-search']")	static  WebElement ShowAdvanceSearch;
	public @FindBy(xpath = "//*[@placeholder='Document Number']")	static  WebElement EnterRFQFromDB;
	public @FindBy(xpath = "//*[@id='buyersName']")	static  WebElement SearchBQ;
	
	public @FindBy(xpath = "//app-bqsearchcomponent//input[@class='btn btn-primary']")	static  WebElement ASearchBQ;
	
	
	public @FindBy(xpath = "//input[@class='btn btn-primary']")	static  WebElement AdSearchBQ;
	
	public @FindBy(xpath = "//*[@id='RFQ_Number']")	static  WebElement EnterRFQFromDBTCC;
	public @FindBy(xpath = "//*[@id='btn_Search']")	static  WebElement SearchTCC;
	public @FindBy(xpath = "//*[@id='ibtTCDGO']")	static  WebElement ASearchTCD;
	public @FindBy(xpath = "//*[@id='ibtAdvancedSearchTCD']")	static  WebElement Advancedsearch;
	public @FindBy(xpath = "//*[@id='ibtTCDfilter']") static  WebElement filter;
	
	public @FindBy(xpath = "(//kendo-grid-string-filter-cell//input)[1]") static  WebElement TCDRejectfilter;
	public @FindBy(xpath = "(//kendo-grid-list//tr//td)[4]") static  WebElement MOTCDRejectfilter;
	public @FindBy(xpath = "//*[@id='ibtTCFEdit']") static  WebElement EditTCD;
	
	public @FindBy(xpath = "//*[@placeholder='Vendor']") static  WebElement SelectVendorEditTCD;
	
	
	
	
	
	
	
	
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
	
	public @FindBy(xpath = "(//eipmessagebox//button)[1]") static  WebElement AcceptAlertR;
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

	public @FindBy(xpath = "//span[text()='AutoBQ Required' and @class='k-link ng-star-inserted']") static  WebElement DetABQR;
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
	
	
	public @FindBy(xpath = "(//mat-select//span)[3]") static  WebElement SRLdad;
	
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
	//public @FindBy(xpath = "(//mat-form-field//input)[15]") static  WebElement RDNoy;
	
	public @FindBy(xpath = "//*[contains(@placeholder, 'Maximum')]/preceding::mat-form-field[1]//input") static  WebElement RDNoy;
	
	
	public @FindBy(xpath = "//*[contains(@placeholder, 'Maximum')]") static  WebElement RDMopy;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[18]") static  WebElement Mopv;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[15]") static  WebElement SRMopv;
	public @FindBy(xpath = "//*[text()='Save']") static  WebElement LDsave;
	public @FindBy(xpath = "(//*[text()='Action'])[2]") static  WebElement PaymAct;
	public @FindBy(xpath = "//*[@id='optCategoryList0']") static  WebElement CatOC;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[17]") static  WebElement CatVlu;
	public @FindBy(xpath = "(//mat-form-field//div//div//div//input)[12]") static  WebElement RDCatVluC;
	
	public @FindBy(xpath = "((//*[@id='remarks'])[2]/preceding::mat-form-field[2]//div//div)[1]//input") static  WebElement RDCatVlu;
	
	public @FindBy(xpath = "(//mat-form-field//input)[15]") static  WebElement RDCatVluMV;
	
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
	public @FindBy(xpath = "//*[text()='Preview']/preceding::mat-select[1]//div//div//span") static  WebElement EvnDLP;
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[3]") static  WebElement SREvnDLP;
	public @FindBy(xpath = "//button[text()='Save']") static  WebElement  SaveDLP;
	public @FindBy(xpath = "(//mat-form-field//input)[18]") static  WebElement PT;
	
	public @FindBy(xpath = "(//mat-form-field//input)[20]") static  WebElement PRPT;
	
	public @FindBy(xpath = "(//mat-form-field//input)[22]") static  WebElement PRAuctPT;
	
	
	
	
	
	
	public @FindBy(xpath = "(//mat-form-field//input)[13]") static  WebElement SRPT;
	public @FindBy(xpath = "//*[text()='Clear']") static  WebElement ClearSTQ;
	
	public @FindBy(xpath = "(//mat-form-field//input)[20]") static  WebElement AuctionNavigate;
	
	
	public @FindBy(xpath = "(//*[text()=' Checked'])[2]") static  WebElement checkCD;
	
	public @FindBy(xpath = "//*[@id='mat-input-60']") static  WebElement savePR;
	public @FindBy(xpath = "(//mat-horizontal-stepper//button)[6]") static  WebElement savePRnew;
	
	public @FindBy(xpath = "(//lib-app-otherterms//button)[3]") static  WebElement AuctionSave;
	
	public @FindBy(xpath = "//*[text()='Previous']") static  WebElement RDSTQSave;
	public @FindBy(xpath = "//*[text()='Shipment Details']") static  WebElement SD;
	public @FindBy(xpath = "//mat-checkbox//span//a") static  WebElement Searchresult;
	
	public @FindBy(xpath = "//*[text()='Document Specific Attachment']") static  WebElement DSA;
	public @FindBy(xpath = "//*[@title = 'Access Based Menu']") static  WebElement HomeMenu;
	public @FindBy(xpath = "//*[text()='Supply Chain Mgmt']") static  WebElement SCM;
	public @FindBy(xpath = "//*[text()='Procurement']") static  WebElement PRO;
	public @FindBy(xpath = "//*[text()='RFQ']") static  WebElement MenuRFQ;
	public @FindBy(xpath = "//a//span[text()='E-Auction']") static  WebElement MenueAuct;
	
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
	
	// Test 
	public @FindBy(xpath = "//button[@class='btn btn-primary']") static  WebElement CartPost1;
	
	public @FindBy(xpath = "(//eipgeneralcart//button)[6]") static  WebElement SRDCartPost;
	
	public @FindBy(xpath = "(//mat-list-option//div[2])[5]") static  WebElement RDCI;
	
	public @FindBy(xpath = "//*[text()='Next']") static  WebElement RDNext;
	public @FindBy(xpath = "(//kendo-grid-list//input)[2]") static  WebElement RDSuggRate;
	
	public @FindBy(xpath = "(//kendo-grid-list//input)[6]") static  WebElement RDSuggRate1;
	public @FindBy(xpath = "(//kendo-grid-list//input)[10]") static  WebElement RDSuggRate2;
	public @FindBy(xpath = "(//kendo-grid-list//input)[14]") static  WebElement RDSuggRate3;
	
	public @FindBy(xpath = "(//eip-cartview//i)[1]") static  WebElement CartClose;
	public @FindBy(xpath = "(//kendo-grid-list//i)[2]") static  WebElement eAuctionTCCClosed;
	
	public @FindBy(xpath = "//*[@id='hsn0']") static  WebElement HSN;
	
	
	
	
	
			
					
	
	
	
	
	
	public @FindBy(xpath = "(//kendo-grid-list//input)[2]") static  WebElement EditRDSuggRate;
	
	
	
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-75']") static  WebElement RDQuantity;
	public @FindBy(xpath = "//mat-form-field//input[@id='mat-input-76']") static  WebElement RDSuggestedRate;
	
	
	
	public @FindBy(xpath = "(//td//div//input)[2]") static  WebElement RDEditSuggRate;
	public @FindBy(xpath = "(//td//input)[3]") static  WebElement SRSuggRDService;
	
	public @FindBy(xpath = "(//*[text()='Action'])[3]") static  WebElement PTAuc;
	
	public @FindBy(xpath = "//kendo-grid-list//i[@class='fa fa-trash ng-star-inserted']") static  WebElement DelVendor;
	
	
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
	
	public @FindBy(xpath = "(//*[text()='Other Cost'])[2]") static  WebElement OtherCostBQ;
	public @FindBy(xpath = "//*[@id='actxtAssetGroup-0']") static  WebElement OtherCostCategory;
	public @FindBy(xpath = "//mat-select//div//span") static  WebElement OtherCostOption;
	public @FindBy(xpath = "//*[@id='unitvalue-0']") static  WebElement UnitValue;
	public @FindBy(xpath = "//*[@id='remarks-0']") static  WebElement RemarksOthercostBQ;
	
	public @FindBy(xpath = "//*[text()='Post']") static  WebElement PostOthercostBQ;
	
	
	public @FindBy(xpath = "//*[text()='Overview']/ancestor::mat-expansion-panel-header") static  WebElement OverviewBQ;	
	public @FindBy(xpath = "(//app-tcoverview//b)[3]") static  WebElement OverviewOthercostBQ;
	public @FindBy(xpath = "//*[text()='Techno Commercial Comparison']") static  WebElement TCDBQ;
	public @FindBy(xpath = "(//tr//td[@class='ng-star-inserted'])[21]") static  WebElement OverviewOthercostValueBQ;
	public @FindBy(xpath = "//*[text()='Other Cost']") static  WebElement OthercostBQ;
	public @FindBy(xpath = "(//tr//td[@class='ng-star-inserted'])[27]") static  WebElement OthercostValueBQ;
	
	public @FindBy(xpath = "(//*[text()='Status']//following::td[text()=' Submitted '])[1]") static  WebElement TCCStatus;
	
	public @FindBy(xpath = "(//*[text()='Status']//following::td[text()=' Closed '])[1]") static  WebElement TCCStatusAC;
	
	
	
	
	public @FindBy(xpath = "//*[text()=' Other Cost']/following::td[1]") static  WebElement OverviewOthercostValueOneBQ;
	public @FindBy(xpath = "//*[text()=' Other Cost']/following::td[2]") static  WebElement OverviewOthercostValuetwoBQ;
	
	public @FindBy(xpath = "//th[text()=' Attribute ']/ancestor::thead/following::tr[2]/td[3]") static  WebElement OthercostValueOneBQ;
	public @FindBy(xpath = "//th[text()=' Attribute ']/ancestor::thead/following::tr[2]/td[4]") static  WebElement OthercostValuetwoBQ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public @FindBy(xpath = "//kendo-grid-list//tr//td//div//span") static  WebElement ASNCreate;
	public @FindBy(xpath = "(//*[@id='GibtIDNAdd'])[1]") static  WebElement ICASNCreate;
	
	public @FindBy(xpath = "(//*[@id='gibtexpandlist'])[1]") static  WebElement POAExpandList;
	public @FindBy(xpath = "//*[@title='Toggle calendar']") static  WebElement POATogglecalendar;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[2]") static  WebElement InvoiceDate;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[3]") static  WebElement SupplierASNRefDate;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[4]") static  WebElement DCDate;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[5]") static  WebElement DODDate;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[6]") static  WebElement LRGCNDate;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[7]") static  WebElement EWayDate;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[8]") static  WebElement DateIn;
	public @FindBy(xpath = "(//*[@title='Toggle calendar'])[9]") static  WebElement DateOut;
	
	
	
	public @FindBy(xpath = "//*[@class='fa fa-users cart-cursor-pointer add-consignee-icon']") static  WebElement Transporter;
	public @FindBy(xpath = "//*[@placeholder='Search with Vendor Code / Name']") static  WebElement EnterVendor;
	public @FindBy(xpath = "//*[text()='Search']") static  WebElement ASNVendorSearch;
	public @FindBy(xpath = "(//*[@type='checkbox'])[4]") static  WebElement SelectASNVendor;
	public @FindBy(xpath = "(//*[@type='button'])[7]") static  WebElement VendorInfoOk;
	public @FindBy(xpath = "//*[@placeholder='Vehicle Number']") static  WebElement VehicleNumber;
	public @FindBy(xpath = "//*[@placeholder='LR/GCN/RR No.']") static  WebElement LRGCNNumber;
	public @FindBy(xpath = "//*[@placeholder='Town']") static  WebElement ASNTown;
	public @FindBy(xpath = "//*[@placeholder='PIN']") static  WebElement ASNPin;
	public @FindBy(xpath = "//*[@placeholder='E-Way Bill No.']") static  WebElement ASNWayBill;
	public @FindBy(xpath = "//*[@placeholder='Mobile No.']") static  WebElement VendorMovilenum;
	public @FindBy(xpath = "//*[@id='actxtSMDWeighmentType']") static  WebElement WeighmentType;
	public @FindBy(xpath = "//*[@id='GrlblWeightmentSlipNo']") static  WebElement WeightmentSlipNo;
	public @FindBy(xpath = "(//*[@title='Toggle time list'])[1]") static  WebElement DateInTime;
	public @FindBy(xpath = "(//*[@title='Toggle time list'])[2]") static  WebElement DateOutTime;
	public @FindBy(xpath = "(//*[@title='Select now'])[1]") static  WebElement InTime;
	public @FindBy(xpath = "(//mat-form-field//input[@onpaste='return true'])[16]") static  WebElement PackageCode;
	public @FindBy(xpath = "//*[@id='packingType0']") static  WebElement PackageType;
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[4]") static  WebElement MaterialQuantity;
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[7]") static  WebElement PackageQuantity;
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[8]") static  WebElement PackageGrossWeight;
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[9]") static  WebElement PackageNetWeight;
	public @FindBy(xpath = "//*[@id='uomType0']") static  WebElement DimensionUOM;
	public @FindBy(xpath = "(//mat-form-field//div//div//input)[26]") static  WebElement DimensionsLBH;
	public @FindBy(xpath = "(//mat-form-field//div//div//input)[27]") static  WebElement DimensionsB;
	public @FindBy(xpath = "(//mat-form-field//div//div//input)[28]") static  WebElement DimensionsH;
	public @FindBy(xpath = "(//mat-form-field//div//div//input)[29]") static  WebElement DimensionsRemarks;
	public @FindBy(xpath = "(//*[@class='fa fa-plus ng-star-inserted'])[2]") static  WebElement AuctionMove;
	public @FindBy(xpath = "//*[text()='Post Shipment Details']") static  WebElement PSD;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public @FindBy(xpath = "//*[@id='lblRemarks']") static  WebElement SUPPRemarks;
	public @FindBy(xpath = "//*[@placeholder='DC Number']") static  WebElement DCNumber;
	public @FindBy(xpath = "//*[@placeholder='Delivery Order Number']") static  WebElement DeliveryOrderNumber;
	
	
	
	
	
	
	
	
	
	public @FindBy(xpath = "(//*[@role='spinbutton'])[2]") static  WebElement POAExpQty;
	
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[3]") static  WebElement InvoiceValue;
	public @FindBy(xpath = "//*[@id='lblSupplierAsnReferenceNo']") static  WebElement SupplierASNRefNo;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[12]") static  WebElement GrossWeight;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[13]") static  WebElement TareWeight;
	
	
	
	
	public @FindBy(xpath = "(//mat-checkbox//label//div[@class='mat-checkbox-frame'])[2]") static  WebElement SelectPOA;
	
	
	public @FindBy(xpath = "//*[@id='lblInvoiceNo']") static  WebElement POAInvoiceNo;
	public @FindBy(xpath = "//*[text()='Submit']") static  WebElement POASubmit;
	public @FindBy(xpath = "(//*[text()='Submit'])[2]") static  WebElement ASNSubmit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	public @FindBy(xpath = "//mat-form-field//input[@placeholder = 'Your Bid']") static  WebElement YourBid;
	
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
	public @FindBy(xpath = "//kendo-grid-toolbar//i[@class='fa fa-filter']") static  WebElement AuctionFilterCom;
	public @FindBy(xpath = "(//kendo-grid-filter-wrapper-cell//input)[1]") static  WebElement EnterAuctioninFilter;
	public @FindBy(xpath = "(//mat-select//div[@class='mat-select-value'])[1]") static  WebElement RORAuctionType;
	
	public @FindBy(xpath = "//mat-form-field//span[@class='fa fa-times cursor-pointer ng-star-inserted']") static  WebElement BillFromClear;
	
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[1]") static  WebElement BidInd1;
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[2]") static  WebElement BidInd2;
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[3]") static  WebElement BidInd3;
	public @FindBy(xpath = "(//mat-card-actions//input[@value='Bid'])[4]") static  WebElement BidInd4;
	
	public @FindBy(xpath = "//*[@value='Re Bid']") static  WebElement ReBidInd;
	
	public @FindBy(xpath = "//kendo-grid-list//a") static  WebElement RFQNumber;
	
	public @FindBy(xpath = "//*[@title='Edit']") static  WebElement RFQEdit;
	
	public @FindBy(xpath = "(//kendo-grid-list//tr[@class='k-grid-norecords ng-star-inserted'])[1]//td") static  WebElement RDText;
	
	public @FindBy(xpath = "(//mat-dialog-container//p)[9]") static  WebElement CartTextHeading;
	public @FindBy(xpath = "(//mat-dialog-container//p)[10]") static  WebElement CartTextCiterms;
	public @FindBy(xpath = "(//mat-dialog-container//p)[11]") static  WebElement CartTextSiterms;
	
	public @FindBy(xpath = "(//kendo-grid-list//tr//td)[7]") static  WebElement AfSDTCD;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	//public @FindBy(xpath = "(//mat-dialog-container//button//i)[2]") static  WebElement Item;
	
	public @FindBy(xpath = "(//mat-dialog-container//button//i)[2]") static  WebElement PRMoveToSelectedItems;
	public @FindBy(xpath = "//button[text()='Post']") static  WebElement PRPost;
	 public @FindBy(xpath = "//*[@id='k-grid1-r1c1']") static  WebElement CostPackage;
	//public @FindBy(xpath = "(//kendo-grid-list//input)[1]") static  WebElement CostPackage;
	
	public @FindBy(xpath = "//*[@id='cpCode0']") static  WebElement SRCostPackage;
	public @FindBy(xpath = "//*[@id='cpCode1']") static  WebElement SRCostPackageNext;
	
	
	public @FindBy(xpath = "//*[@id='wbsCode0']") static  WebElement WBS;
	//using enter Cost package
	public @FindBy(xpath = "(//*[@class='k-input'])[2]") static  WebElement EnterCostPackage;
	public @FindBy(xpath = "(//mat-list-option//div[@class='mat-list-text'])[1]") static  WebElement AuctionPRAddcart;
	//Using old pr quantity
	//public @FindBy(xpath = "//*[@id='mat-input-14']") static  WebElement PRQuantity;
	public @FindBy(xpath = "(//kendo-grid-list//input)[3]") static  WebElement PRQuantity;
	
	
	// public @FindBy(xpath = "(//*[@class='k-grid-column-right ng-star-inserted'])[5]") static  WebElement PR2Quantity;
	public @FindBy(xpath = "(//td//div[@class='k-grid-column-right ng-star-inserted'])[7]") static  WebElement PR3Quantity;
	public @FindBy(xpath = "//*[text()='Quantity']") static  WebElement AuctionQuantityMAt;
	
	// TEST XPATH
	public @FindBy(xpath = "(//td//div[@class='k-grid-column-right ng-star-inserted'])[3]") static  WebElement PR2Quantity;
	
	public @FindBy(xpath = "(//input[contains(@class, appdecimalnumber)])[11]") static  WebElement PR22Quantity;
		
	public @FindBy(xpath = "(//td//div[@class='k-grid-column-right ng-star-inserted'])[11]") static  WebElement PR4Quantity;
	
	
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[1]") static  WebElement SRCQuantity;
	public @FindBy(xpath = "(//kendo-numerictextbox//input)[3]") static  WebElement SRCQuantityNext;
	
	
	public @FindBy(xpath = "//*[@id='mat-input-15']") static  WebElement PRSuggRate;
	public @FindBy(xpath = "(//td//input)[4]") static  WebElement SRCSuggRate;
	public @FindBy(xpath = "(//td//input)[12]") static  WebElement SRCSuggRateNext;
	
	public @FindBy(xpath = "//*[@id='icon-rightdateRange_Kendo']") static  WebElement DeliveryDate;
	public @FindBy(xpath = "//button[text()='Submit']") static  WebElement PRSubmit;
	public @FindBy(xpath = "//eipmessagebox//button")	static  WebElement PurchasesRequestAccept;
	public @FindBy(xpath = "//eipmessagebox//button")	static  WebElement ServiceRequestAccept;
	public @FindBy(xpath = "(//*[contains(@class, 'eip-link ng-star-inserted')])") static  WebElement PR;
	
	//(//kendo-grid-list//tr//div)[1]
	public @FindBy(xpath = "(//*[@title='Approve'])[2]")	static  WebElement PRApprove;
	public @FindBy(xpath = "(//*[@id='btnAdd'])[3]")	static  WebElement ApprovalSucess;
	public @FindBy(xpath = "//*[@class = 'mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") static  WebElement eSourceAllocation;
	public @FindBy(xpath = "//*[text()='Add To Cart']") static  WebElement AllocationAddToCart;
	public @FindBy(xpath = "//*[@value='Clear']") static  WebElement SearchIcon;
	public @FindBy(xpath = "//*[@class='k-icon k-i-x']") static  WebElement closeiconAllocate;
	public @FindBy(xpath = "//*[text()='1 - 1 of 1 items']")	static  WebElement Sdown;
	public @FindBy(xpath = "//*[text()=' 80560 - Pradeep Ku ']") static  WebElement ChooseyourbuyersDomesticJob;
	public @FindBy(xpath = "//*[@placeholder ='Service Category ']") static  WebElement ServiceCategorySR;
	public @FindBy(xpath = "//*[text()=' Select All']") static  WebElement SelectSCSR;
	public @FindBy(xpath = "//*[@placeholder ='Nature of scope(Optional)']") static  WebElement NatureofscopeSR;
	
	public @FindBy(xpath = "//eipcart//i") static  WebElement SRCart;
	
	public @FindBy(xpath = "//*[text()='ASN']") static  WebElement ASN;
	public @FindBy(xpath = "//*[@id='ibtGINfilter']") static  WebElement ASNFilter;
	
	
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
	
	public @FindBy(xpath = "//*[@title='Close Search RFQ']")	static  WebElement AdvanceSearchHomePage;
	public @FindBy(xpath = "//*[@placeholder='RFQ Number']")	static  WebElement EnterRFQNUmber;
	
	public @FindBy(xpath = "//*[@title = 'Close Search RFQ']")	static  WebElement CloseAdvanceSearch;
	
	public @FindBy(xpath = "//*[text()='For Action']")	static  WebElement ForAuction;
	public @FindBy(xpath = "//*[text()='In Progress']")	static  WebElement GVInProgress;
	public @FindBy(xpath = "//*[text()='All']")	static  WebElement all;
	public @FindBy(xpath = "//*[@title='Grid View']")	static  WebElement GridView;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	 
	
	
	
	 
	
	
	 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
