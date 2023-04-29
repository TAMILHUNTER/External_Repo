//Author : Tamil
package object_repository.Tamil;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectsReporsitory {

//**Login Elements**

	@FindBy(how = How.LINK_TEXT, using = "Employee")
	public static WebElement Login_employee;

	@FindBy(how = How.LINK_TEXT, using = "Other User")
	public static WebElement Login_otherUser;

	@FindBy(how = How.ID, id = "username")
	public static WebElement Login_Username;

	@FindBy(how = How.ID, id = "password-field")
	public static WebElement Login_Password;

	@FindBy(how = How.ID, using = "login-submit")
	public static WebElement Login_loginSubmit;

	@FindBy(how = How.CLASS_NAME, using = "unlk-acnt")
	public static WebElement Login_unlockAccount;

	@FindBy(how = How.CLASS_NAME, using = "frgt-pwd")
	public static WebElement Login_forgotPassword;

	@FindBy(how = How.TAG_NAME, using = "h1")
	public static WebElement Login_OldSessionerror;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement Login_OldSessionok;

	@FindBy(how = How.XPATH, using = "//span[@title='close']")
	public static WebElement Login_OldSessionclose;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"home\"]/div[1]/div/div/div/p)")
	public static WebElement Landing_Page;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"home\"]/div[3]/div/section/div[3]/div/div/div[2]/h5/span[1])")
	public static WebElement Landing_Page_Counter;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"home\"]/div[3]/div/section/div[3]/div/div/div[2]/div)")
	public static WebElement Landing_Page2;

	@FindBy(how = How.XPATH, using = "(//header//i)[1]")
	public static WebElement Profile_Dropdown;

	@FindBy(how = How.XPATH, using = "(//header//a)[6]")
	public static WebElement Profile_Signout;

//**HomePage Elements**

	@FindBy(how = How.CLASS_NAME, using = "user_name")
	public static WebElement Home_Loggedin_User;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'col-6 col-sm-6')]//a)[2]")
	public static WebElement Home_accessBasedMenu;

	@FindBy(how = How.XPATH, using = "//a[@title='All Menu']")
	public static WebElement Home_All_Menu;

	@FindBy(how = How.TAG_NAME, using = "input")
	public static WebElement Home_searchMenu;

	@FindBy(how = How.ID, using = "NotificationiconID")
	public static WebElement Home_notifications;

	@FindBy(how = How.ID, using = "profiledropdownbtn")
	public static WebElement Home_Profiledropdownbtn;

	@FindBy(how = How.CLASS_NAME, using = "currentdatetime")
	public static WebElement Home_Date_Time;
//**Popup**		
	@FindBy(how = How.XPATH, using = "//eipmessagebox")
	public static WebElement popup;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//div//p")
	public static WebElement popup_text;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static WebElement popup_head;

	@FindBy(how = How.XPATH, using = "//*[@title='close']")
	public static WebElement Popup_Close;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-dialog-title-0']//h1[1]")
	public static List<WebElement> basic_popup_validation;

	@FindBy(how = How.CLASS_NAME, using = "introjs-tooltip-title")
	public static List<WebElement> Popup_dashboardtips;

	@FindBy(how = How.CLASS_NAME, using = "introjs-tooltip-title")
	public static WebElement Popup_dashboardtips_Head;

	@FindBy(how = How.XPATH, using = "//div[@class='introjs-tooltiptext']")
	public static WebElement Popup_dashboardtips_Message;

	@FindBy(how = How.XPATH, using = "//a[text()='Next']")
	public static WebElement Popup_dashboardtips_Next;

	@FindBy(how = How.XPATH, using = "//a[text()='Back']")
	public static WebElement Popup_dashboardtips_Back;

	@FindBy(how = How.XPATH, using = "//a[text()='Done']")
	public static WebElement Popup_dashboardtips_Done;

	@FindBy(how = How.CLASS_NAME, using = "introjs-skipbutton")
	public static WebElement Popup_dashboardtips_Skip;

	@FindBy(how = How.XPATH, using = "//input[@value='Yes']")
	public static WebElement Popup_dashboardtips_Showtips_again_Yes;

	@FindBy(how = How.XPATH, using = "//input[@value='No']")
	public static WebElement Popup_dashboardtips_Showtips_again_No;

	@FindBy(how = How.XPATH, using = "//p[text()=' Do not show the Tips again ? ']")
	public static List<WebElement> Popup_dashboardtips_Showtips_again;

//**Menu**

	@FindBy(how = How.XPATH, using = "//span[text()='Finance']")
	public static WebElement Menu_finance;

	@FindBy(how = How.XPATH, using = "//span[text()='Accounts Payable']")
	public static WebElement Menu_Accounts_Payable;

	@FindBy(how = How.XPATH, using = "//span[text()='Invoice Registration']")
	public static WebElement Menu_Invoice_Registration;

//**Invoice Registration**			

	@FindBy(how = How.ID, using = "btnrefresh")
	public static WebElement Invoice_Registration_For_Action_Refresh;

	@FindBy(how = How.ID, using = "btnAdvSearch1")
	public static WebElement Invoice_Registration_Advance_Search;

	@FindBy(how = How.XPATH, using = "(//input)[2]")
	public static WebElement Invoice_Registration_Advance_Search_by_Document;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Invoice_Registration_Advance_Search_by_AllOptions;

	@FindBy(how = How.XPATH, using = "//span[text()='Purchase Order']")
	public static WebElement Invoice_Registration_Advance_Search_by_Document_Purchase_Order;

	@FindBy(how = How.XPATH, using = "//span[text()='Work Order']")
	public static WebElement Invoice_Registration_Advance_Search_by_Document_Work_Order;

	@FindBy(how = How.XPATH, using = "//span[text()='MRN']")
	public static WebElement Invoice_Registration_Advance_Search_by_Document_MRN;

	@FindBy(how = How.XPATH, using = "//span[text()='Bill']")
	public static WebElement Invoice_Registration_Advance_Search_by_Document_Bill;

	@FindBy(how = How.ID, using = "txtCertificate")
	public static WebElement Invoice_Registration_Advance_Search_by_Document_Purchase_Order_input;

	@FindBy(how = How.XPATH, using = "//input[@value='Search']")
	public static WebElement Invoice_Registration_Advance_Search_Button;

	@FindBy(how = How.XPATH, using = "//app-acp-order-view-label")
	public static WebElement Invoice_Registration_Advance_Search_Single_Result;

	@FindBy(how = How.XPATH, using = "//app-acp-order-view-label")
	public static List<WebElement> Invoice_Registration_Advance_Search_multiple_Result;

	@FindBy(how = How.XPATH, using = "//kendo-pager-info[@class='k-pager-info k-label']")
	public static WebElement Invoice_Registration_Advance_Search_Result_Count;

	@FindBy(how = How.ID, using = "btnClose")
	public static WebElement Invoice_Registration_Advance_Search_Close;

	@FindBy(how = How.ID, using = "btnClear")
	public static WebElement Invoice_Registration_Advance_Search_Clear;

	@FindBy(how = How.XPATH, using = "//i[@title='Clear Advance Search']")
	public static WebElement Invoice_Registration_clearAdvanceSearch;

	@FindBy(how = How.ID, using = "ddlJob")
	public static WebElement Invoice_Registration_Advance_Search_by_job;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Invoice_Registration_Advance_Search_job_All_options;

	@FindBy(how = How.ID, using = "ddlVendor")
	public static WebElement Invoice_Registration_Advance_Search_by_vendor;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix']//i)[3]")
	public static WebElement Invoice_Registration_Advance_Search_by_vendor_dr;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Invoice_Registration_Advance_Search_by_vendor_AllOptions;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-shopping-cart')]")
	public static WebElement Invoice_Registration_Advance_Search_JobCrat;

	@FindBy(how = How.XPATH, using = "(//app-fsi-invoice-cart//input)[2]")
	public static WebElement Invoice_Registration_Advance_Search_JobCart_input;

	@FindBy(how = How.XPATH, using = "(//button[@title='Select']//i[1])[1]")
	public static WebElement Invoice_Registration_Advance_Search_JobCart_Select;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-list-text']")
	public static List<WebElement> Invoice_Registration_Advance_Search_JobCart_AllElements;

	@FindBy(how = How.XPATH, using = "(//button[@title='Select all']//i[1])[1]")
	public static WebElement Invoice_Registration_Advance_Search_JobCart_SelectAll;

	@FindBy(how = How.XPATH, using = "((//button[text()='Post'])[2])[1]")
	public static WebElement Invoice_Registration_Advance_Search_JobCart_Post;

	@FindBy(how = How.XPATH, using = "//button[@title='Unselect all']//i[1]")
	public static WebElement Invoice_Registration_Advance_Search_JobCart_UnSelect_All;

	@FindBy(how = How.XPATH, using = "//button[@title='Unselect']//i[1]")
	public static WebElement Invoice_Registration_Advance_Search_JobCart_UnSelect;

	@FindBy(how = How.XPATH, using = "//div[@class='job-cart-box job-cart-box1']//mat-list-option//div[@class='mat-list-text']")
	public static List<WebElement> Invoice_Registration_Advance_Search_by_Multiple_Job_Selected_AllOptions;

	@FindBy(how = How.XPATH, using = "//div[@class='job-cart-box']//mat-list-option//div[@class='mat-list-text']")
	public static List<WebElement> Invoice_Registration_Advance_Search_by_Multiple_Job_YettoSelect_AllOptions;

	@FindBy(how = How.ID, using = "ddlVendor")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor;

	@FindBy(how = How.XPATH, using = "(//mat-form-field//div//i)[3]")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_dr;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-info-circle')])[1]")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details;

	@FindBy(how = How.XPATH, using = "(//*[@id='Vendor'])[1]")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details_Vendor;

	@FindBy(how = How.XPATH, using = "//*[@id='pannumber']")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details_Pan;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSearch']//div[2]//div[3]//div//kendo-popup//div//div//div//div[6]//label")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details_MobileNo;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSearch']//div[2]//div[3]//div//kendo-popup//div//div//div//div[8]//label")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details_TelephoneNo;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSearch']//div[2]//div[3]//div//kendo-popup//div//div//div//div[10]//label")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details_Fax;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSearch']//div[2]//div[3]//div//kendo-popup//div//div//div//div[12]//label")
	public static WebElement Invoice_Registration_Advance_Search_By_vendor_details_GSTNo;

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'fa fa-calendar')]")
	public static WebElement Invoice_Registration_Advance_Search_By_Date;

	@FindBy(how = How.XPATH, using = "(//input)[6]")
	public static WebElement Invoice_Registration_Advance_Search_By_Date_Field;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'k-button k-bare')]")
	public static WebElement Invoice_Registration_Advance_Search_By_Date_Month_Header;

	@FindBy(how = How.XPATH, using = "//span[contains(@class,'k-button k-bare')]")
	public static WebElement Invoice_Registration_Advance_Search_By_Date_Year_Header;

	@FindBy(how = How.XPATH, using = "//span[@class='k-link']")
	public static List<WebElement> Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-link'])")
	public static List<WebElement> Invoice_Registration_Advance_Search_By_DateRange_Year_All_Elements_Text;

	@FindBy(how = How.XPATH, using = "//span[@class='k-link']")
	public static List<WebElement> Invoice_Registration_Advance_Search_By_DateRange_month_All_Elements;

	@FindBy(how = How.XPATH, using = "//span[@class='k-link']")
	public static List<WebElement> Invoice_Registration_Advance_Search_By_DateRange_Date_All_Elements;

	@FindBy(how = How.CLASS_NAME, using = "k-today")
	public static WebElement Invoice_Registration_Advance_Search_By_DateRange_tODAY;

	@FindBy(how = How.XPATH, using = "//*[@id='btnSearch']//div[2]//div[4]//form//eipclusterelement//div")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements;

	@FindBy(how = How.ID, using = "lstIC")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_independentCompany;

	@FindBy(how = How.ID, using = "lstSBG")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_SBG;

	@FindBy(how = How.ID, using = "lstBusinessUnit")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_BU;

	@FindBy(how = How.ID, using = "lstSegment")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Segment;

	@FindBy(how = How.ID, using = "lstClusterOffice")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_ClusterOffice;

	@FindBy(how = How.ID, using = "lstRegion")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Region;

	@FindBy(how = How.ID, using = "lstLocation")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Location;

	@FindBy(how = How.ID, using = "lstZone")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Zone;

	@FindBy(how = How.ID, using = "lstArea")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Area;

	@FindBy(how = How.XPATH, using = "//button[text()='Close']")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Close;

	@FindBy(how = How.XPATH, using = "//button[text()='Post']")
	public static WebElement Invoice_Registration_Advance_Search_By_clusterElements_Post;

//******************************************************************************************************************************************
// Invoice Registration _ For Action - Advance Search - Details

	@FindBy(how = How.XPATH, using = "//span[@class='k-icon k-i-arrow-s']")
	public static WebElement Invoice_Registration_Advance_Search_Deatils_Past_date;

	@FindBy(how = How.XPATH, using = "//input[@dir='ltr']")
	public static WebElement Invoice_Registration_Advance_Search_Deatils_Past_date_Input;

	@FindBy(how = How.XPATH, using = "//li[@ng-reflect-klass='k-item']")
	public static List<WebElement> Invoice_Registration_Advance_Search_Deatils_Past_date_All_Elements;

	@FindBy(how = How.XPATH, using = "//kendo-pager-page-sizes[@class='k-pager-sizes k-label']//select[1]")
	public static WebElement Invoice_Registration_Advance_Search_Records_Per_Page;

	@FindBy(how = How.XPATH, using = "//kendo-pager-page-sizes[@class='k-pager-sizes k-label']//select[1]//option")
	public static List<WebElement> Invoice_Registration_Advance_Search_Records_Per_Page_All_Elements;

	@FindBy(how = How.ID, using = "btnrefresh")
	public static WebElement Invoice_Registration_Advance_Search_Records_refresh;

	// ******************************************************************************************************************************************
	// Invoice Registration _ Filter

	@FindBy(how = How.ID, using = "btnfunnel")
	public static WebElement Invoice_Registration_Advance_Search_Records_Filter;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[1]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_No;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[2]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_Type;

	@FindBy(how = How.XPATH, using = "(//span[@title='Toggle Calendar']//span)[1]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_Date;

	@FindBy(how = How.XPATH, using = "(//span[@title='Toggle Calendar']//span)[2]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_calender;

	@FindBy(how = How.XPATH, using = "(//span[@title='Toggle Calendar']//span)[3]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Calender;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[4]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Type;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[5]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Currency;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[6]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_Amount;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[7]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[8]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[9]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[10]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[11]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[12]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[13]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[14]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[15]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[16]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Mode;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[17]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[18]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Claim;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-filter-wrapper-cell[@class='k-filtercell-wrapper']//input)[last()]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_Last;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[1]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_No_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[2]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_Type_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[3]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_Date_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[4]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Type_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[5]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Currency_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[6]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Order_Amount_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[7]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Amount_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[8]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_MRN_or_Bill_Count_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[9]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Invoice_Regn_Count_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[10]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_number_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[11]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Date_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[12]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Tolarance_Cheque_Amount_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[13]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Ref_No_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[14]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_NEFT_Unique_Ref_No_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[15]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Transaction_Date_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[16]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Payment_Mode_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[17]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_NEFT_Amount_Filter_Clear;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-filter-clear'])[18]")
	public static WebElement Invoice_Registration_Advance_Search_Filter_by_Claim_Filter_Clear;

	@FindBy(how = How.ID, using = "btnExp")
	public static WebElement Invoice_Registration_Advance_Search_expand;

// Settings 

	@FindBy(how = How.ID, using = "settingiconID")
	public static WebElement Invoice_Registration_Settings;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[last()]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Last;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])")
	public static List<WebElement> Invoice_Registration_Settings_columnFreeze_AllEmenets;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])")
	public static List<WebElement> Invoice_Registration_Settings_columnUnFreeze_AllEmenets;

	@FindBy(how = How.ID, using = "settingbtnAdd")
	public static WebElement Invoice_Registration_Settings_Submit;

	@FindBy(how = How.XPATH, using = "//i[@id='viewCol']")
	public static WebElement Invoice_Registration_Settings_ColumnView;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])")
	public static List<WebElement> Invoice_Registration_Settings_ColumnView_AllElements;

	@FindBy(how = How.XPATH, using = "//eipgridsettings//span[4]//i")
	public static List<WebElement> Invoice_Registration_Settings_Drag_AllElements;

	@FindBy(how = How.XPATH, using = "(//i[@title='Drag Here'])[1]")
	public static WebElement Invoice_Registration_Settings_Drag_first;

	@FindBy(how = How.XPATH, using = "(//i[@title='Drag Here'])[3]")
	public static WebElement Invoice_Registration_Settings_Drag_3;

	@FindBy(how = How.XPATH, using = "(//i[@title='Drag Here'])[last()]")
	public static WebElement Invoice_Registration_Settings_Drag_last;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[last()]")
	public static WebElement Invoice_Registration_Settings_ColumnView_Last;

	@FindBy(how = How.XPATH, using = "(//span[@id='spnCol'])")
	public static List<WebElement> Invoice_Registration_Settings_AllCoumn;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'setting-usermenu cdk-drag')]")
	public static List<WebElement> Invoice_Registration_Settings_AllCoumn_Drag;

	@FindBy(how = How.XPATH, using = "//span[@title='Order No']")
	public static WebElement Invoice_Registration_Settings_Column_OrderNo;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[1]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_OrderNo;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[2]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_OrderDate;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[3]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Type;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[4]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Currency;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[5]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Order_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[6]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Tolarance_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[7]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_MRN_or_Bill_Count;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[8]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Invoice_Regn_Count;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[9]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Cheque_number;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[10]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Cheque_Date;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[11]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Cheque_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[12]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[13]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_NEFT_Unique_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[14]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Payment_Transaction_Date;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[15]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Payment_Mode;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[16]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_NEFT_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-unlock'])[17]")
	public static WebElement Invoice_Registration_Settings_columnFreeze_Claim;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_OrderNo;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_OrderDate;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Type;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Currency;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Order_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Tolarance_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_MRN_or_Bill_Count;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Invoice_Regn_Count;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Cheque_number;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Cheque_Date;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Cheque_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Payment_Transaction_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_NEFT_Unique_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Payment_Transaction_Date;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Payment_Mode;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_NEFT_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-lock'])[1]")
	public static WebElement Invoice_Registration_Settings_column_UnFreeze_Claim;

	@FindBy(how = How.XPATH, using = "//i[@id='viewCol'][1]")
	public static WebElement Invoice_Registration_Settings_Disable_OrderNo;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[2]")
	public static WebElement Invoice_Registration_Settings_Disable_OrderDate;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[3]")
	public static WebElement Invoice_Registration_Settings_Disable_Type;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[4]")
	public static WebElement Invoice_Registration_Settings_Disable_Currency;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[5]")
	public static WebElement Invoice_Registration_Settings_Disable_Order_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[6]")
	public static WebElement Invoice_Registration_Settings_Disable_Tolarance_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[7]")
	public static WebElement Invoice_Registration_Settings_Disable_MRN_or_Bill_Count;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[8]")
	public static WebElement Invoice_Registration_Settings_Disable_Invoice_Regn_Count;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[9]")
	public static WebElement Invoice_Registration_Settings_Disable_Cheque_number;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[10]")
	public static WebElement Invoice_Registration_Settings_Disable_Cheque_Date;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[11]")
	public static WebElement Invoice_Registration_Settings_Disable_Cheque_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[12]")
	public static WebElement Invoice_Registration_Settings_Disable_Payment_Transaction_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[13]")
	public static WebElement Invoice_Registration_Settings_Disable_NEFT_Unique_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[14]")
	public static WebElement Invoice_Registration_Settings_Disable_Payment_Transaction_Date;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[15]")
	public static WebElement Invoice_Registration_Settings_Disable_Payment_Mode;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[16]")
	public static WebElement Invoice_Registration_Settings_Disable_NEFT_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[17]")
	public static WebElement Invoice_Registration_Settings_Disable_Claim;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[1]")
	public static WebElement Invoice_Registration_Settings_Enable_OrderNo;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[2]")
	public static WebElement Invoice_Registration_Settings_Enable_OrderDate;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[3]")
	public static WebElement Invoice_Registration_Settings_Enable_Type;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[4]")
	public static WebElement Invoice_Registration_Settings_Enable_Currency;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[5]")
	public static WebElement Invoice_Registration_Settings_Enable_Order_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[6]")
	public static WebElement Invoice_Registration_Settings_Enable_Tolarance_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[7]")
	public static WebElement Invoice_Registration_Settings_Enable_MRN_or_Bill_Count;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[8]")
	public static WebElement Invoice_Registration_Settings_Enable_Invoice_Regn_Count;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[9]")
	public static WebElement Invoice_Registration_Settings_Enable_Cheque_number;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[10]")
	public static WebElement Invoice_Registration_Settings_Enable_Cheque_Date;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[11]")
	public static WebElement Invoice_Registration_Settings_Enable_Cheque_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[12]")
	public static WebElement Invoice_Registration_Settings_Enable_Payment_Transaction_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[13]")
	public static WebElement Invoice_Registration_Settings_Enable_NEFT_Unique_Ref_No;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[14]")
	public static WebElement Invoice_Registration_Settings_Enable_Payment_Transaction_Date;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[15]")
	public static WebElement Invoice_Registration_Settings_Enable_Payment_Mode;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[16]")
	public static WebElement Invoice_Registration_Settings_Enable_NEFT_Amount;

	@FindBy(how = How.XPATH, using = "(//i[@id='viewCol'])[17]")
	public static WebElement Invoice_Registration_Settings_Enable_Claim;

	@FindBy(how = How.ID, using = "btnExp")
	public static WebElement Invoice_Registration_Expand;

	@FindBy(how = How.ID, using = "btnExp")
	public static WebElement Invoice_Registration_Minimize;

//Pagination

	@FindBy(how = How.XPATH, using = "//a[@title='Go to the next page']//span[1]")
	public static WebElement Invoice_Registration_GotToNextPage;

	@FindBy(how = How.XPATH, using = "//a[@title='Go to the last page']//span[1]")
	public static WebElement Invoice_Registration_GotToLastPage;

	@FindBy(how = How.XPATH, using = "//a[@title='Go to the previous page']")
	public static WebElement Invoice_Registration_GotToPreviousPage;

	@FindBy(how = How.XPATH, using = "//a[@title='Go to the first page']//span[1]")
	public static WebElement Invoice_Registration_GotToFirstPage;

	@FindBy(how = How.XPATH, using = "//kendo-pager//input")
	public static WebElement Invoice_Registration_CurrentPage;

	@FindBy(how = How.XPATH, using = "(//kendo-pager-input//span)[1]")
	public static WebElement Invoice_Registration_TotalPage;

// Invoice Registration Create

	@FindBy(how = How.XPATH, using = "//i[@title='Create']")
	public static WebElement Invoice_Registration_create;

	// **Popup2**
	@FindBy(how = How.XPATH, using = "//eipmessagebox")
	public static WebElement popup2;

	@FindBy(how = How.XPATH, using = "(//eipmessagebox//div)[3]//p")
	public static WebElement popup_text2;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static WebElement popup_head2;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static List<WebElement> popup_head3;

	@FindBy(how = How.XPATH, using = "//*[@title='close']")
	public static WebElement Popup_Close2;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement Popup_Ok2;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-dialog-title-0']//h1[1]")
	public static List<WebElement> basic_popup_validation2;

	@FindBy(how = How.CLASS_NAME, using = "introjs-tooltip-title")
	public static List<WebElement> Popup_dashboardtips2;

	@FindBy(how = How.CLASS_NAME, using = "introjs-tooltip-title")
	public static WebElement Popup_dashboardtips_Head2;

	@FindBy(how = How.XPATH, using = "//div[@class='introjs-tooltiptext']")
	public static WebElement Popup_dashboardtips_Message2;

	@FindBy(how = How.XPATH, using = "//a[text()='Next']")
	public static WebElement Popup_dashboardtips_Next2;

	@FindBy(how = How.XPATH, using = "//a[text()='Back']")
	public static WebElement Popup_dashboardtips_Back2;

	@FindBy(how = How.XPATH, using = "//a[text()='Done']")
	public static WebElement Popup_dashboardtips_Done2;

	@FindBy(how = How.CLASS_NAME, using = "introjs-skipbutton")
	public static WebElement Popup_dashboardtips_Skip2;

	@FindBy(how = How.XPATH, using = "//input[@value='Yes']")
	public static WebElement Popup_dashboardtips_Showtips_again_Yes2;

	@FindBy(how = How.XPATH, using = "//input[@value='No']")
	public static WebElement Popup_dashboardtips_Showtips_again_No2;

	@FindBy(how = How.XPATH, using = "//p[text()=' Do not show the Tips again ? ']")
	public static List<WebElement> Popup_dashboardtips_Showtips_again2;

//Invoice Registration

	@FindBy(how = How.XPATH, using = "(//i[@title='Close'])[2]")
	public static WebElement InvoiceRegistration_Close;

	@FindBy(how = How.XPATH, using = "(//app-acp-order-view-label)[1]")
	public static WebElement Invoice_Registration_Advance_Search_Single_Result2;

	@FindBy(how = How.ID, using = "ibtExpandAll")
	public static WebElement InvoiceRegistration_collapseAll;

	@FindBy(how = How.ID, using = "ibtExpandAll")
	public static WebElement InvoiceRegistration_expandAll;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-weixin']")
	public static WebElement InvoiceRegistration_Chat;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-attachment-viewer'])[2]")
	public static WebElement InvoiceRegistration_documentView;

	@FindBy(how = How.XPATH, using = "//i[@title='Print']")
	public static WebElement InvoiceRegistration_print;

	@FindBy(how = How.XPATH, using = "//eipwftrace[@title='WorkFlow']//i[1]")
	public static WebElement InvoiceRegistration_details;

	@FindBy(how = How.XPATH, using = "//span[@class='pf-trace-level']")
	public static List<WebElement> InvoiceRegistration_ProcessFlow_AllElements;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[1]")
	public static WebElement InvoiceRegistration_PO_Detail_PO_Number_Data;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[2]")
	public static WebElement InvoiceRegistration_PO_Detail_PO_Date;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[3]")
	public static WebElement InvoiceRegistration_PO_Detail_TCD_No;

	@FindBy(how = How.XPATH, using = "//p[text()='Name']/following-sibling::p")
	public static WebElement InvoiceRegistration_PO_Detail_JOB_Name;

	@FindBy(how = How.XPATH, using = "//p[text()='Address']/following-sibling::p")
	public static WebElement InvoiceRegistration_PO_Detail_JOB_Address;

	@FindBy(how = How.XPATH, using = "(//kendo-popup//p)[1]")
	public static WebElement InvoiceRegistration_PO_Detail_Vendor_Name;
	
	@FindBy(how = How.XPATH, using = "(//kendo-popup//p)[2]")
	public static WebElement InvoiceRegistration_PO_Detail_Vendor_Address;
	
	@FindBy(how = How.XPATH, using = "(//kendo-popup//p)[3]")
	public static WebElement InvoiceRegistration_PO_Detail_Vendor_Contact_Person;
	
	@FindBy(how = How.XPATH, using = "(//kendo-popup//p)[4]")
	public static WebElement InvoiceRegistration_PO_Detail_Vendor_Contact_Number;
	
	@FindBy(how = How.XPATH, using = "(//kendo-popup//p)[5]")
	public static WebElement InvoiceRegistration_PO_Detail_Vendor_Email_ID;

	@FindBy(how = How.XPATH, using = "//p[text()='Name']/following-sibling::p")
	public static WebElement InvoiceRegistration_PO_Detail_Payment_Centre_Name;
	
	@FindBy(how = How.XPATH, using = "//p[text()='Address']/following-sibling::p")
	public static WebElement InvoiceRegistration_PO_Detail_Payment_Centre_Address;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[7]")
	public static WebElement InvoiceRegistration_PO_Detail_Warehouse;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[8]")
	public static WebElement InvoiceRegistration_PO_Detail_AmendmentNo;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[9]")
	public static WebElement InvoiceRegistration_PO_Detail_Expiry_Date;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[10]")
	public static WebElement InvoiceRegistration_PO_Detail_PO_Type;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[11]")
	public static WebElement InvoiceRegistration_PO_Detail_PurchaseGroup;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[12]")
	public static WebElement InvoiceRegistration_PO_Detail_PO_Value;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[13]")
	public static WebElement InvoiceRegistration_PO_Detail_Currency;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[14]")
	public static WebElement InvoiceRegistration_PO_Detail_Del_Start_Date;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data'])[15]")
	public static WebElement InvoiceRegistration_PO_Detail_Del_End_Date;

	@FindBy(how = How.XPATH, using = "(//p[@class='view-data eip-link'])[1]")
	public static WebElement InvoiceRegistration_PO_Detail_Document_Reference_No;

	@FindBy(how = How.XPATH, using = "//i[@id='ibtINDFJobinfo']")
	public static WebElement InvoiceRegistration_PO_Detail_job_Info;
	
	@FindBy(how = How.ID, using="ibtINDCPartnerInfo")
	public static WebElement InvoiceRegistration_PO_Detail_Vendor_Info;

	@FindBy(how = How.XPATH, using="(//i[@id='ibtINDFJobinfo'])[2]")
	public static WebElement InvoiceRegistration_PO_Detail_Payment_Center_Info;

	@FindBy(how = How.ID, using="ibtINDFWarehouseinfo")
	public static WebElement InvoiceRegistration_PO_Detail_WareHouse_Info;
	
	@FindBy(how = How.XPATH, using = "//p[text()='Name']/following-sibling::p")
	public static WebElement InvoiceRegistration_PO_Detail_Warehouse_Name;
	
	@FindBy(how = How.XPATH, using = "//p[text()='Address']/following-sibling::p")
	public static WebElement InvoiceRegistration_PO_Detail_Warehouse_Address;
	
	@FindBy(how = How.ID, using="lblPOVMaterialCount")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Count;
	
	@FindBy(how = How.XPATH, using="((//kendo-grid-list)[2]//tr//td//span//span)[1]")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Desc_Code;
	
	@FindBy(how = How.XPATH, using="(//kendo-grid-list//tr//td[3]//div//i)[1]")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Component_Details_info;
	
	@FindBy(how = How.XPATH, using="(//i[contains(@class,'fa fa-angle-left')])[2]")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Component_Details_left_arrow;
	
	@FindBy(how = How.XPATH, using="(//app-purchase-order-component//p)[2]")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Component_Details_Job;
	
	@FindBy(how = How.XPATH, using="(//app-purchase-order-component//p)[4]")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Component_Details_Desc_Code;
	
	@FindBy(how = How.XPATH, using="(//app-purchase-order-component//p)[6]")
	public static WebElement InvoiceRegistration_PO_Detail_Material_Component_Details_Warehouse;
	
	
	
}

