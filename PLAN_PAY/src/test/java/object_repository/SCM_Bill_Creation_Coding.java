package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import stepdefinition.DatabaseConnection;

public class SCM_Bill_Creation_Coding extends DatabaseConnection {
	
	@FindBy(how = How.XPATH, using = "(//a[text()='Other User' or @class='nav-link'])")
	public static WebElement Login_otherUser;

	@FindBy(how = How.ID, id = "username")
	public static WebElement Login_Username;

	@FindBy(how = How.ID, id = "password-field")
	public static WebElement Login_Password;

	@FindBy(how = How.ID, using = "login-submit")
	public static WebElement Login_loginSubmit;

	@FindBy(how = How.XPATH, using = "//a[@title='Access Based Menu']")
	public static WebElement menu;

	@FindBy(how = How.XPATH, using = "//span[text()='Supply Chain Mgmt']/parent::a")
	public static WebElement SCM;

	@FindBy(how = How.XPATH, using = "(//a[@class='mat-menu-item mat-menu-item-submenu-trigger ng-star-inserted'] | //span[text()='Execution'])[5]")
	public static WebElement Execution;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Bill Creation' or @title='']")
	public static WebElement Bill_Creation;
	
	@FindBy(how = How.XPATH, using = "(//div//i[@id='ibtFilter' or @title='Filter'])[2]")
	public static WebElement Filter_Icon;
	
	@FindBy(how = How.XPATH, using = "(//div//i[@id='ibtFilter' or @title='Filter'])")
	public static WebElement Filter_Icon_A;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"TablblBillSource\"]/div/kendo-grid/div/div/div/table/thead/tr[2]/td[2]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public static WebElement Filter_Document_No;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"k-grid1-r1c0\"]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public static WebElement Filter_Bill_No;
	
	
	@FindBy(how = How.XPATH, using = "//div//i[@id='GribtAdd' or @title='']")
	public static WebElement Creation;
	
	@FindBy(how = How.XPATH, using = "(//div//div[@class='mat-tab-label-content'])[8]")
	public static WebElement measurment_Icon;
	
	@FindBy(how = How.XPATH, using = "//*[@id='mat-checkbox-3']/label/div")
	public static WebElement M_Doc_Select;
	
	@FindBy(how = How.XPATH, using = "(//table//tr//td//i[@id='GrJobInfo' or @title='Measurement Details'])[3]")
	public static WebElement Approve_qty_Icon;
	
	@FindBy(how = How.XPATH, using = "(//table//td//label//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
	public static WebElement A_D_Select_1;
	
	@FindBy(how = How.XPATH, using = "(//input[@class='k-input k-formatted-value' or id='k-9ca02193-1459-4348-910b-327835cc66eb'])[2]")
	public static WebElement This_qty;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='Save' or @id='']")
	public static WebElement A_save_button;
	
	@FindBy(how = How.XPATH, using = "//i[@title='Close' or @class='']")
	public static WebElement Close_button;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-bill-source-creation/div[2]/div/button[2]")
	public static WebElement Submit_button;
	
	@FindBy(how = How.XPATH, using = "//*[@id='btnSubmit']")
	public static WebElement Submit_button1;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='Yes' or @class='']")
	public static WebElement Yes_button;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='No' or @class='']")
	public static WebElement No_button;
	
	@FindBy(how = How.XPATH, using = "//span[@title='close' or @class='']")
	public static WebElement PopUp_Close_button;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='Ok' or @class='']")
	public static WebElement OK_button;
	
	@FindBy(how = How.XPATH, using = "//i[@id='serviceAllocation' or @title='']")
	public static WebElement Bill_Deduction_Icon;
	
	@FindBy(how = How.XPATH, using = "//div//input[@id='mat-input-1' or @ondrop='return false']")
	public static WebElement Sub_C_Invoice_no;
	
	@FindBy(how = How.XPATH, using = "//span//span[@class='k-icon k-i-calendar']")
	public static WebElement Calender_icon_button;
	
	@FindBy(how = How.XPATH, using = "//span[text()=' TODAY ' or @class='']")
	public static WebElement Today_Click;
	
	@FindBy(how = How.XPATH, using = "(//div[text()=' In Progress ' or @class='mat-tab-label-content' ])[4]")
	public static WebElement Inprogess_Icon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"k-grid1-r1c0\"]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public static WebElement F_BILL_NO;
	
	@FindBy(how = How.XPATH, using = "//div//input[@id='ActxtboxPaymentType' or @placeholder='Payment Type']")
	public static WebElement payment_type;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement P_T_Select;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='TDS Update' or @class='']")
	public static WebElement TDS_update;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement TDS_select;
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/app-workbenchtab/div/div[4]/kendo-grid/div/div/div/table/thead/tr[2]/td[3]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public static WebElement F_A_D_NO;
	
	@FindBy(how = How.XPATH, using = "//div//a[@class='eip-link ng-star-inserted']")
	public static WebElement Approve_Document;
	
	@FindBy(how = How.XPATH, using = "(//div//i[@id='accept' or @title=''])[2]")
	public static WebElement Approve_icon;
	
	@FindBy(how = How.XPATH, using = "//div//textarea[@id='mat-input-6' or @class='']")
	public static WebElement Text_Approve;
	
	@FindBy(how = How.XPATH, using = "//i[@id='profiledropdownbtn' or @class='']")
	public static WebElement Sign_out_Icon;
	
	@FindBy(how = How.XPATH, using = "//div//a[text()='Sign Out' or @class='']")
	public static WebElement Signout;
	
//	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
//	public static WebElement TDS_select;
//	
//	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
//	public static WebElement TDS_select;
	
	


}
