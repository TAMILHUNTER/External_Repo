package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMS_PHRS_Page {
	
	public @FindBy(xpath = "//*[@id='mat-input-0']") static  WebElement EnterPHRS;
	
	//span[text()=' PHR / PHER / PHPCR (Creation) ']") static  WebElement SelectPHRS;
	
	
	//public @FindBy(xpath = "//*[@class='modulemenu']") static  WebElement menu;
	public @FindBy(xpath = "//*[@class='modulemenu']") static WebElement Menu;
	public @FindBy(xpath = "//*[text()='Asset Mgmt']") static WebElement AssetMgmt;
	public @FindBy(xpath = "//*[text()='Asset Mgmt.']") static WebElement AssetTree;
	public @FindBy(xpath = "//*[text()='AMS - Document']") static WebElement AMSDocument;
	public @FindBy(xpath = "//*[text()='P&M Hiring']") static WebElement PMHiring;
	public @FindBy(xpath = "//*[text()='PHR / PHER / PHPCR (Creation)']") static WebElement PHRCreation;
	public @FindBy(xpath = "//*[@name='ctl00$ContentPlaceHolder1$txtjobcode']") static WebElement JobCode;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[7]") static WebElement SelectJobCode;
	public @FindBy(xpath = "//*[@value='Get List']") static WebElement GetList;
	public @FindBy(xpath = "(//*[text()='Raise Request'])[1]") static WebElement RaiseRequest;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[7]") static WebElement AssetDescription;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[8]") static WebElement Quantity;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[11]") static WebElement Specification;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[12]") static WebElement Capacity;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[13]") static WebElement EquipmentAge;
	
	public @FindBy(xpath = "(//select)[1]//option") static List <WebElement> job; 
	
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[16]") static WebElement NormalWorkhoursDay;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[18]") static WebElement NoofOTHourssDay;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[22]") static WebElement OperatorChargesMonth;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[19]") static WebElement NoofOTHoursMonth;
	
	
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[29]") static WebElement ReasonforHiring;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[30]") static WebElement ScopeofWork;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[31]") static WebElement ScopeOfWorkQtyEquipment;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[32]") static WebElement Month;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[33]") static WebElement Specificrequirments;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[34]") static WebElement SendEmailTo;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[35]") static WebElement SendEmailCC;
	public @FindBy(xpath = "(//*[@class='TextVerdanaNavy8'])[37]") static WebElement SubmitRequest;
	
	public @FindBy(xpath = "(//*[@class='TextVerdanaBlack10px'])[1]") static WebElement FilterText;
	public @FindBy(xpath = "(//*[@class='TextVerdanaBlack10px'])[2]") static WebElement Employees;
	public @FindBy(xpath = "//*[@id='lboUserId']//option") static WebElement EmployeeName;
	
	public @FindBy(xpath = "//*[@id='txtSendMsg']") static WebElement MessageText;
	public @FindBy(xpath = "//*[@id='btnSend']") static WebElement ClickSend;
	public @FindBy(xpath = "//*[@value='-9738736']") static WebElement SelectBaneswar;
	public @FindBy(xpath = "//*[@name='btnDone']") static WebElement ClickDone;
	
	public @FindBy(xpath = "(//*[@class='eip-link ng-star-inserted'])[1]") static WebElement SelectPHRSDoc;
	
	
	
	public @FindBy(xpath = "//*[@title='Show Advance Search']") static WebElement AdvanceSearchIcon;
	public @FindBy(xpath = "//*[@id='txtDocument']") static WebElement DocumentNo;
	public @FindBy(xpath = "//*[@value='Search']") static WebElement ClickSearch;
	public @FindBy(xpath = "(//div/a)[8]") static WebElement SelectPHRSnum;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtVendorCode']") static WebElement Vendorcode;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlVendorcode']") static WebElement SelectVendorcode;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlVendorcode']") static WebElement VendorcodeDesc;
	
	
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtContactPerson']") static WebElement ContactPerson;
	
	
	/*public @FindBy(xpath = "((//table)[15]//td)[11]//input")
	static WebElement ContactPerson;*/
	
	
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtContactNo']") static WebElement ContactNo;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtMake']") static WebElement Make;	
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtModel']") static WebElement Model;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtCapacity']") static WebElement EquipmentCapacity;
	
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtOTperRate']") static WebElement OTRateFixedwith;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl02_txtWorkinghrperday']") static WebElement WorkingHoursday;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl02_txtWorkHrsMonth']") static WebElement WorkingHoursmonth;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl02_txtOTexpectedhr']") static WebElement OTexpectedhrmonth;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl03_txtWorkinghrperday']") static WebElement SWorkingHoursday;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl03_txtWorkHrsMonth']") static WebElement SWorkingHoursmonth;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl03_txtOTexpectedhr']") static WebElement SExpectedOThoursmonth;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_grvHireRate_ctl02_txtOTexpectedhr']") static WebElement ExpectedOThoursmonth;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_ddlOperatorcharges']") static WebElement Operatorcharges;
	public @FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_dllAccommodation']") static WebElement AccommodationCharges;
	
	public @FindBy(xpath = "(//*[@id='ctl00_ContentPlaceHolder1_dllAccommodation']/option)[2]") static List <WebElement> AccommodationChargesforOM;
	
	public @FindBy(xpath = "//*[text()='Hire Terms - Operator Details']") static WebElement HireTermOperatorDetails;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
