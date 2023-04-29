package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SCM_ASN_Page {
	
	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static  WebElement EnterASN;
	public @FindBy(xpath = "//*[text()=' ASN ']")	static  WebElement SelectASN;
	public @FindBy(xpath = "(//*[contains(@class, 'eip-link ng-star-inserted')])[1]") static  WebElement PONO;
	public @FindBy(xpath = "(//*[contains(@id, 'GibtIDNAdd')])[1]") static  WebElement CreateASN;
	public @FindBy(xpath = "(//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]") static  WebElement SelectPO;
	public @FindBy(xpath = "(//*[@class='k-grid-content k-virtual-content'])[1]") static  WebElement MoveScarl;	
	public @FindBy(xpath = "(//*[@id='gibtexpandlist'])") static  WebElement SelectExpandList;
	public @FindBy(xpath = "(//*[@class='k-icon k-i-calendar'])") static  WebElement SelectCalendar;
	public @FindBy(xpath = "(//*[@class = 'k-link'])[21]") static  WebElement SelectDate;
	public @FindBy(xpath = "(//*[@class='k-icon k-i-calendar'])[2]") static  WebElement SelectCalendarEDD;
	public @FindBy(xpath = "(//*[@class = 'k-link'])[28]") static  WebElement SelectDateEDD;
	public @FindBy(xpath = "//*[@class='k-input k-formatted-value']") static  WebElement ExpQty;
	public @FindBy(xpath = "//*[text()='Submit']") static  WebElement Submit;
	public @FindBy(xpath = "//*[text()='Save & Next'") static  WebElement SelectSaveandNext;
	public @FindBy(xpath = "//*[text()='Yes']") static  WebElement Yes;
	public @FindBy(xpath = "//*[@id='lblInvoiceNo']") static  WebElement InvoiceNo;
	public @FindBy(xpath = "(//*[@class='k-icon k-i-calendar'])[3]") static  WebElement SelectCalendarIVD;
	public @FindBy(xpath = "(//*[@class = 'k-link'])[21]") static  WebElement SelectDateIVD;
	public @FindBy(xpath = "(//*[@class='k-input k-formatted-value'])[3]") static  WebElement  InvoiceValue;
	public @FindBy(xpath = "//*[@id='lblSupplierAsnReferenceNo']") static  WebElement SupplierAsnReferenceNo;
	public @FindBy(xpath = "(//*[@class='k-icon k-i-calendar'])[4]") static  WebElement SelectCalendarSASND;
	public @FindBy(xpath = "(//*[@class = 'k-link'])[21]") static  WebElement SelectDateSASND;
	public @FindBy(xpath = "//*[@placeholder='Packing List No.']") static  WebElement PackingListNo;
	public @FindBy(xpath = "(//*[@id='lblRemarks'])") static  WebElement Remarks;
	public @FindBy(xpath = "//*[@class='fa fa-users cart-cursor-pointer add-consignee-icon']") static  WebElement Transporter;
	public @FindBy(xpath = "//*[@placeholder='Search with Vendor Code / Name']") static  WebElement VendorCode;
	public @FindBy(xpath = "//*[text()='Search']") static  WebElement Search;
	public @FindBy(xpath = "(//*[@type='checkbox'])[4]") static  WebElement CheckBox;
	public @FindBy(xpath = "//*[text()='OK']") static  WebElement OK;
	public @FindBy(xpath = "//*[@id='actTxtPortLoading']") static  WebElement PortAirportofLoading;
	public @FindBy(xpath = "//*[@id='actTxtPortDischarge']") static  WebElement PortAirportofDischarge;
	public @FindBy(xpath = "//*[@placeholder='Transhipment Port / Airport']") static  WebElement TranshipmentPortAirport;
	public @FindBy(xpath = "//*[@placeholder='Method of Dispatch']") static  WebElement MethodofDispatch;
	public @FindBy(xpath = "//*[@placeholder='Carrier Name']") static  WebElement CarrierName;
	public @FindBy(xpath = "//*[@placeholder='Vessel / Flight No.']") static  WebElement VesselFlightNo;
	public @FindBy(xpath = "//*[@placeholder='Bill of Lading / Airway Bill No']") static  WebElement BillofLadingAirwayBillNo;
	public @FindBy(xpath = "(//*[@class='k-icon k-i-calendar'])[3]") static  WebElement DateofBOLAWBCal;
	public @FindBy(xpath = "(//*[@class = 'k-link'])[28]") static  WebElement SelectDateBOL;
	public @FindBy(xpath = "//*[@placeholder='Freight Forwarders Details']") static  WebElement FreightForwardersDetails;
	public @FindBy(xpath = "//*[@placeholder='Freight Forwarders Tracking No.']") static  WebElement  FreightForwardersTrackingNo;
	public @FindBy(xpath = "//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched']") static  WebElement  PackageCodeSlipNo;
	public @FindBy(xpath = "//*[@id='packingType0']") static  WebElement PackingType;
	public @FindBy(xpath = "(//*[@class='k-input k-formatted-value'])[4]") static  WebElement GrossWeight;
	public @FindBy(xpath = "(//*[@class='k-input k-formatted-value'])[5]") static  WebElement NetWeight;
	public @FindBy(xpath = "(//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-valid ng-touched'])[4]") static  WebElement DimensionUOM;
	public @FindBy(xpath = "(//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched'])[11]") static  WebElement DimensionsL;
	public @FindBy(xpath = "(//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched'])[12]") static  WebElement DimensionsB;
	public @FindBy(xpath = "(//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-valid ng-dirty ng-touched'])[13]") static  WebElement DimensionsH;
	public @FindBy(xpath = "//*[@id='actxtSMDCountry']") static  WebElement CountryofOrigin;
	public @FindBy(xpath = "//*[@title = 'Show Advance Search']") static  WebElement AdvanceSearch;
	public @FindBy(xpath = "//*[@id='actxtConsigneejob']") static  WebElement ConsigneeJob;
	public @FindBy(xpath = "//*[@id='actxtDocumentType']") static  WebElement DocumentType;
	public @FindBy(xpath = "//*[@id='actxtDocumentNo']") static  WebElement  DocumentNum;
	
	
	
	
	
	

	
	 
	
	 
	
	
	
	 
	
	
	 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
