package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonControlObject {
	@FindBy(how=How.XPATH,xpath="//i[@title='Filter']")
	public  static WebElement filter;
	
	@FindBy(how=How.XPATH,xpath="//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input")
	public  static WebElement inputFilter;
	
	@FindBy(how=How.XPATH,xpath="//span[@eiptooltipposition='bottom']")
	public static WebElement receiverMessageNumber;
	
	@FindBy(how=How.ID,id="profiledropdownbtn")
	public static WebElement profileClick;
	
	@FindBy(how = How.XPATH, xpath="//a[contains(@class,'loginout-btn btn')]")
	public static WebElement profileOut;
	
	@FindBy(how = How.XPATH, using="(//td[@colspan='1']//i)[3]")
	public static WebElement attachmentVerificationIcon;
	
	@FindBy(how = How.XPATH, using="(//span[@class='no-wrap'])[2]")
	public static WebElement attachedFileName;
	
	@FindBy(how = How.XPATH, using="(//span[@eiptooltipposition='bottom'])[1]")
	public static WebElement documentNumber;
	
	@FindBy(how = How.XPATH, using="(//span[@eiptooltipposition='bottom'])[2]")
	public static WebElement documentTitle;
	
	@FindBy(how = How.XPATH, using="(//span[@role='listbox'])[2]")
	public static WebElement viewLastAll;
	
		
	@FindBy(how = How.XPATH, using="(//span[@role='listbox'])[1]")
	public static WebElement viewLastAllT;
	
	@FindBy(how = How.XPATH, using="(//span[@role='listbox'])[1]")
	public static WebElement viewLastAllRecord;
	
	@FindBy(how = How.XPATH, using="//div[@class='mat-slide-toggle-thumb']")
	public static WebElement revision;
	
	@FindBy(how=How.XPATH,xpath="//*[@role='presentation']//tr[2]//td[2]//input")
	public static WebElement filter_value;
	
	@FindBy(how=How.XPATH,xpath="//tbody//tr//td[2]//span")
	public static java.util.List<WebElement> listofdocumentnumber;
	
	@FindBy(how=How.XPATH,xpath="(//tbody//tr//td[2]//span)[1]")
	public static WebElement documentNumberSearch;
	
	@FindBy(how=How.ID,id="k-grid0-select-all")
	public static WebElement selectAllRevision;
	
	@FindBy(how=How.XPATH, xpath="//*[@title='Go to the last page']")
	public static WebElement lastpage; 
	
	@FindBy(how=How.XPATH, xpath="//*[@title='Go to the first page']")
	public static WebElement firstPage;
		
	@FindBy(how=How.XPATH, xpath="//*[@title='Go to the previous page']")
	public static WebElement previousPage;
	
	@FindBy(how=How.XPATH, xpath="//*[@title='Go to the next page']")
	public static WebElement nextPage;
	
	@FindBy(how=How.XPATH, xpath="((//tbody//td[5])[1])")
	public static WebElement revisionDate;
	
	@FindBy(how=How.XPATH, xpath="((//tbody//td[4])[1])")
	public static WebElement revisionNumber;
	
	@FindBy(how=How.XPATH,xpath="//*[@role='presentation']//tr[2]//td[2]//input")
	public static WebElement filterValue;
	
	@FindBy(how=How.XPATH,xpath="//div[text()=' All ']")	
	public static WebElement repo_All;
	
	@FindBy(how=How.XPATH,xpath="//button[text()='Ok']")
	public static WebElement popupok;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='fa fa-times toast-close']")
	public static WebElement warningMessageClose;	
	
	@FindBy(how=How.XPATH,xpath="//*[@class='fa fa-times eip-messagebox-close']")
	public static WebElement succesMessageClose;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='fa fa-times-circle pull-right']")
	public static WebElement uploadWizardClose;
	
	@FindBy(how=How.ID,id="ibtSearch")
	public static WebElement searchIcon;
	
	@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='ctrlSearchText']")
	public static WebElement searchValue;
	
	@FindBy(how=How.XPATH,xpath="//*[@placeholder='Type *']")
	public static WebElement searchingType;
	
	@FindBy(how=How.XPATH,xpath="(//*[@role='listbox'])[2]//span//span")
	public static List<WebElement> searchType;
	
	@FindBy(how=How.ID,id="btnSearch")
	public static WebElement searchButton;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='k-grid-table']//tbody/tr[1]//td[2]//span")
	public static WebElement foundresult;
	
	@FindBy(how=How.XPATH,xpath="//*[@class='k-grid-table']//tbody/tr[1]//td[1]")
	public static WebElement select_result;	
	
	@FindBy(how = How.XPATH, using="(//span[@role='listbox'])[1]")
	public static WebElement viewLastAllC;
	
	@FindBy(how=How.XPATH, xpath="//*[@class='k-pager-info k-label']")
	public static WebElement filterWaitUntil; 
	
	@FindBy(how = How.XPATH, using="//i[@title='Expand']")
	public static WebElement expand; 
	
	@FindBy(how = How.XPATH, using="//i[@title='Collapse']")
	public static WebElement collapse; 
	
	@FindBy(how = How.XPATH, using="//*[@class='currentdatetime']")
	public static WebElement currentDate; 
	
	@FindBy(how = How.XPATH, using="//kendo-pager-page-sizes[@id='ddlRecordsperPage']//select[1]")
	public static WebElement show;
	
	@FindBy(how = How.XPATH, using="//table[@class='k-grid-table']/tbody[1]//tr")
	public static WebElement noOfRecords;
	
	@FindBy(how = How.XPATH, using="//i[@title='Create']")
	public static WebElement create;
	
	@FindBy(how = How.XPATH, using="//p[text()='New Transmittal']")
	public static WebElement newTransmittal;
	
	@FindBy(how = How.ID, using="ibtClose")
	public static WebElement close;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Project Code * ']")
	public static WebElement projectCode;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Discipline * ']")
	public static WebElement discipline;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='From Org * ']")
	public static WebElement fromOrg;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='To Org * ']")
	public static WebElement toOrg;
	
	@FindBy(how = How.ID, using="categoryTemp")
	public static WebElement category;
	
	@FindBy(how = How.XPATH, using="//input[@formcontrolname='txtquantity']")
	public static WebElement qty;
	
	@FindBy(how = How.CLASS_NAME, using="mat-slide-toggle-thumb")
	public static WebElement confidential;
	
	@FindBy(how = How.XPATH, using="//input[@formcontrolname='txtMailSubject']")
	public static WebElement subject;
	
	@FindBy(how = How.ID, using="fromMembers")
	public static WebElement from;
	
	@FindBy(how = How.ID, using="toMembers")
	public static WebElement to;
	
	@FindBy(how = How.XPATH, using="//input[@formcontrolname='ccMembersCtrl']")
	public static WebElement cc;
	
	@FindBy(how = How.XPATH, using="//div[text()='No']")
	public static WebElement noResponseRequired;
	
	@FindBy(how = How.XPATH, using="(//input[@type='number'])[2]")
	public static WebElement groupby;
	
	@FindBy(how = How.ID, using="btnGroupView")
	public static WebElement distributionView;
	
	@FindBy(how = How.XPATH, using="//i[@mattooltip='Edit']")
	public static WebElement edit;
	
	@FindBy(how = How.XPATH, using="//input[@formcontrolname='quantity']")
	public static WebElement ccQuantity;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Type *']")
	public static WebElement type;
	
	@FindBy(how = How.XPATH, using="//span[text()=' Select All']")
	public static WebElement selectAll;
	
	@FindBy(how = How.XPATH, using="//label[text()='Type *']/following::textarea")
	public static WebElement remarks;
	
	@FindBy(how = How.XPATH, using="//i[@mattooltip='Save']")
	public static WebElement save;
	
	@FindBy(how = How.XPATH, using="(//i[@mattooltip='Save'])[2]")
	public static WebElement save2;
	@FindBy(how = How.XPATH, using="//button[text()='Preview Transmittal']")
	public static WebElement previewTransmittal;
	
	@FindBy(how = How.XPATH, using="//*[@class='toast-title mat-dialog-title']")
	public static WebElement warningMessage;
	
	@FindBy(how = How.XPATH, using="//*[@class='toast-content mat-dialog-content']//p")
	public static WebElement warningMessageBoddy;
	
	@FindBy(how = How.XPATH, using="//label[@class='mat-checkbox-layout']//div")
	public static WebElement ccClick;
	
	@FindBy(how = How.XPATH, using="//mat-panel-title//i[@title='Attachment']")
	public static WebElement Attachment;
	
	@FindBy(how = How.XPATH, using="//p[text()='Select Document']")
	public static WebElement attachmentWindow;
	
	@FindBy(how = How.XPATH, using="//div[text()='Repository Document']")
	public static WebElement repositoryDocument;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Search in all  documents...']")
	public static WebElement searchInAll;
	
	@FindBy(how = How.XPATH, using="(//th[@role='columnheader']//input)[2]")
	public static WebElement select;
	
	@FindBy(how = How.XPATH, using="//button[text()='Submit']")
	public static WebElement submit;
	
	@FindBy(how = How.XPATH, using="(//i[@mattooltip='Edit'])[2]")
	public static WebElement editing;
	
	@FindBy(how = How.XPATH, using="//button[text()='Send']")
	public static WebElement send;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//h1")
	public static WebElement successMessage;
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement ok;
	
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//p")
	public static WebElement mandatoryFieldsAreRequried;
	
	@FindBy(how = How.XPATH, using="//eipmessagebox//button")
	public static WebElement mandatoryFieldsOk;
	
	@FindBy(how = How.XPATH, using="//mat-label[text()='Transmittal Number | ']/following-sibling::mat-label")
	public static WebElement serialNumberTransmittal;
	
	@FindBy(how = How.XPATH, using="//input[@type='checkbox']")
	public static WebElement selectCheckbox;
	
	@FindBy(how = How.XPATH, using="//i[@title='View']")
	public static WebElement viewTransmittal;
	
	@FindBy(how = How.CLASS_NAME, using="mat-checkbox-inner-container")
	public static WebElement ccTransmittal;

	
	
}


