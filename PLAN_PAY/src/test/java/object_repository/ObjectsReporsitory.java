package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectsReporsitory {

	// **Login Elements**

	@FindBy(how = How.LINK_TEXT, using = "Employee")
	public static WebElement Login_employee;

	@FindBy(how = How.LINK_TEXT, using = "Other User")
	public static WebElement Login_otherUser;

	@FindBy(how = How.ID, id = "username")
	public static WebElement Login_Username;

	@FindBy(how = How.ID, id = "password-field")
	public static WebElement Login_Password;

	@FindBy(how = How.XPATH, using = "//a[@title='Access Based Menu']")
	public static WebElement menu;

	@FindBy(how = How.XPATH, using = "//span[text()='Supply Chain Mgmt']/parent::a")
	public static WebElement SCM;

	@FindBy(how = How.ID, using = "login-submit")
	public static WebElement Login_loginSubmit;

	@FindBy(how = How.XPATH, using = "//span[text()='Warehouse']")
	public static WebElement WareHouse;

	@FindBy(how = How.XPATH, using = "//span[text()='Surplus Stock Declaration']")
	public static WebElement SSD;

	@FindBy(how = How.XPATH, using = "//div[text()='Surplus Declaration']")
	public static WebElement SD;

	@FindBy(how = How.ID, using = "ddljob")
	public static WebElement SD_Job;

	@FindBy(how = How.ID, using = "ddlwareHouse")
	public static WebElement SD_WareHouse;

	@FindBy(how = How.XPATH, using = "//i[@title='Cart']")
	public static WebElement Add_Card;

//	Job_Name

//	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']"
//			+ ""
//			+ "")
//	public static WebElement Job_Name;
	
	// Test
	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']")
	public static WebElement Job_Name;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[3]")
	public static WebElement Job_WareHouse;

	
//	Selection_Process

	@FindBy(how = How.ID, using = "multi-select-input-acMatCategory")
	public static WebElement Material_Category;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public static WebElement MC_SelectAll;

	
	@FindBy(how = How.ID, using = "multi-select-input-acMatGrp")
	public static WebElement Material_Group;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public static WebElement MG_SelectAll;

	@FindBy(how = How.ID, using = "multi-select-input-msMovType")
	public static WebElement Movement_Type;

	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public static WebElement MT_SelectAll;

	@FindBy(how = How.ID, using = "ddldays")
	public static WebElement Days;

	@FindBy(how = How.XPATH, using = "//span[text()='Last 180 Days']")
	public static WebElement Days_Selection;

	@FindBy(how = How.XPATH, using = "//input[@ng-reflect-placeholder='enter min of 5 char and press ']")
	public static WebElement Material_search_text;
	
	@FindBy(how = How.ID, using = "(//mat-selection-list[@class='mat-selection-list mat-list-base'])[2]")
	public static WebElement Empty_Text;

	@FindBy(how = How.XPATH, using = "(//button[text()='Post'])[2]")
	public static WebElement Post;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-checkbox-inner-container']")
	public static WebElement Mark;

	@FindBy(how = How.XPATH, using = "(//input[@type='submit'])[2]")
	public static WebElement MA_Submit;

// Material NAme

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-list-text'])[1]")
	public static WebElement Material_Name;

	@FindBy(how = How.XPATH, using = "//div[text()=' 1FOEM005D000000 - TEAPOY;MOC:-WOODEN;SIZE:-2.5 FT x 1.5 FT ']")
	public static WebElement Material_Name1;

	@FindBy(how = How.XPATH, using = "//button[@title='Select']")
	public static WebElement Moveclick;

	@FindBy(how = How.XPATH, using = "//span[text()='All Materials']")
	public static WebElement Allmaterial;

//Sign_Out
	@FindBy(how = How.XPATH, using = "//i[@id='profiledropdownbtn']")
	public static WebElement Sign_Out_Icon;

	@FindBy(how = How.XPATH, using = "//a[text()='Sign Out']")
	public static WebElement Sign_Out;

//Verifier	

	@FindBy(how = How.XPATH, using = "//input[@id='btnGo']")
	public static WebElement GO;

	@FindBy(how = How.ID, using = "k-grid1-checkbox0")
	public static WebElement V_CheckBox;

	@FindBy(how = How.ID, using = "Verify")
	public static WebElement verify;

//Approve
	@FindBy(how = How.XPATH, using = "//i[@id='Approval']")
	public static WebElement Approve_Click;

//View Successfully submit Material Checking 			

	@FindBy(how = How.XPATH, using = "//span[@title='clear']")
	public static WebElement XmarkClick;
	
	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[2]")
	public static WebElement XmarkClick2;

	@FindBy(how = How.ID, using = "ddlmovement")
	public static WebElement View_Material_Type;

	@FindBy(how = How.XPATH, using = "//i[@title='Close' or @class='fa fa-times-circle pull-right']")
	public static WebElement close;
	
	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[4]")
	public static WebElement dayClose;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Last 60 Days']")
	public static WebElement Day60;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Last 90 Days']")
	public static WebElement day90;

	// Add to card pop
	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-times eip-messagebox-close' or @title='close']")
	public static WebElement close1;
	
	
	//Editing Material Quantity 
	
	@FindBy(how = How.XPATH, using = "//td//div//i[@title='View']")
	public static WebElement view;
	
	@FindBy(how = How.XPATH, using = "//div[@class='k-grid-content k-virtual-content']")
	public static WebElement mouseOver_View;
	
	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[2]")
	public static WebElement currentQTY;
	
	@FindBy(how = How.XPATH, using = "(//input[@class='k-input k-formatted-value'])[4]")
	public static WebElement currentQTY1;
	
	@FindBy(how = How.XPATH, using = "//div//input[@id='btnSave']")
	public static WebElement save;
	
	@FindBy(how = How.ID, using = "imgReject")
	public static WebElement Reject;
	
	@FindBy(how = How.ID, using = "mat-input-0")
	public static WebElement search_bar;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnYes']")
	public static WebElement RejectYes;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-sm cursor-pointer']")
	public static WebElement Rejectpopok;
	
	@FindBy(how = How.XPATH, using = "//textarea[@type='text']")
	public static WebElement Text_Pass_Reject;
	
	
//Editing 
	
	@FindBy(how = How.XPATH, using = "//textarea[@type='text']")
	public static WebElement X;
	
	@FindBy(how = How.CSS, using ="<::before></::before>")
	public static WebElement css_selecter;
	
	@FindBy(how = How.XPATH, using = "//i[@title='Filter']")
	public static WebElement filter;
	
	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper'])[1]//input")
	public static WebElement filter_D_Code;
	
	@FindBy(how = How.XPATH, using = "(//kendo-grid-string-filter-cell[@class='k-filtercell ng-star-inserted']//input)[2]")
	public static WebElement Verification_filter_D_Code;
	
// Inprogress
	
	@FindBy(how = How.XPATH, using = "//div[@class='ng-star-inserted ' or text()='Inprogress']")
	public static WebElement Inprogress_Icon;
	
	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-cancel ng-star-inserted'])[1]")
	public static WebElement cancel;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-sm cursor-pointer' or text()='Yes']")
	public static WebElement Pop_cancel;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='k-grid-column-right ng-star-inserted'])[7]")
	public static WebElement verification_mouseover;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ng-star-inserted' and text()='Rejected']")
	public static WebElement Reject_icon;
	
	
	// Surplus view
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='ng-star-inserted' and text()='Surplus View']")
	public static WebElement Surplus_View;

// Date Format
	
	@FindBy(how = How.XPATH, using = "//td[@class='ng-star-inserted'and @title='Thursday, September 1, 2022']")
	public static WebElement Strating_Date;
	
	@FindBy(how = How.XPATH, using = "//span[@class='k-today' or text()=' TODAY ']")
	public static WebElement Today_Date;
	
	@FindBy(how = How.XPATH, using = "//span[@class='k-button k-bare k-title']")
	public static WebElement Object_SEP_OCT;
	
	@FindBy(how = How.XPATH, using = "//td[@role='gridcell' and @title='2023']")
	public static WebElement Year_Click;
	
	@FindBy(how = How.XPATH, using = "//td[@class='ng-star-inserted' and @title='2023 Jan']")
	public static WebElement End_Month;
	
	@FindBy(how = How.XPATH, using = "//td[@class='ng-star-inserted' and @title='Thursday, January 5, 2023']")
	public static WebElement End_Month_days;
	
	@FindBy(how = How.XPATH, using = "//td[@class='ng-star-inserted'and @title='Thursday, September 1, 2022']")
	public static WebElement calendar_Format;
	
	@FindBy(how = How.XPATH, using = "(//input[@class='CCDPClass k-input ng-pristine ng-valid ng-touched' or @type='text'])[3]")
	public static WebElement calendar;
	
	
}
