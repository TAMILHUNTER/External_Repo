package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SCM_Mesu_Coding {
	
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
	
	@FindBy(how = How.XPATH, using = "(//a[@class='mat-menu-item mat-menu-item-submenu-trigger ng-star-inserted'] | //span[text()='Execution'])[5]")
	public static WebElement Execution;
	
//	@FindBy(how = How.XPATH, using = "(//a[@class='leafnodelink mat-menu-item ng-star-inserted'] | //span[text()='Measurement'])[8]")
//	public static WebElement Measurment;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Measurement']")
	public static WebElement Measurment;
	
	@FindBy(how = How.XPATH, using = "//i[@id='ibtAdd' or @title='']")
	public static WebElement Create;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='multi-select-input-lblSRGroupApproval'])[1]")
	public static WebElement job;
	
//	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='lblSRGroupApproval'])[5]")
//	public static WebElement job_Search;
	
	// Test
	@FindBy(how = How.XPATH, using = "//input[@id='lblSRGroupApproval']")
	public static WebElement job_Search;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container']//input[@type='checkbox'])[2]")
	public static WebElement select_Job;
	
	@FindBy(how = How.XPATH, using = "//span[@id='lblRecentlyCreatedMeasurments']")
	public static WebElement Click_Empty;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix']//input[@id='multi-select-input-lblServiceGroup'])")
	public static WebElement Group;
	
	@FindBy(how = How.XPATH, using = "(//label[@class='mat-checkbox-layout'] | //span[text()='101 - Service'])[3]")
	public static WebElement select_Group;
	
	@FindBy(how = How.XPATH, using = "( //input[@id='lstVendor'] | //div[@class='mat-form-field-infix'] )[3]")
	public static WebElement vendor;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lstVendor']")
	public static WebElement vendor_Name;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'] | //span[text()='321 - KNOWELL INTERNATIONAL PRIVATE LIMITED'])[1]")
	public static WebElement select_vendor;
	
	@FindBy(how = How.XPATH, using = "//div//button[@id='BtnSearch' or @type='']")
	public static WebElement search_Button;
	
	@FindBy(how = How.XPATH, using = "//div//i[@title='Create' or @class='']")
	public static WebElement Mouseover_create;
	
	@FindBy(how = How.XPATH, using = "//div[@class='row recent-mesurment cart-cursor-pointer']//span[1]")
	public static WebElement select_material;
	
	@FindBy(how = How.XPATH, using = "//span//span[@class='k-icon k-i-calendar']")
	public static WebElement calender_click;

	
	@FindBy(how = How.XPATH, using = "//span[@class='k-today' or text()=' TODAY ']")
	public static WebElement select_Today;

	
	@FindBy(how = How.XPATH, using = "//button[text()='Ok' or @class='']")
	public static WebElement OK_Button;

	
	@FindBy(how = How.XPATH, using = "//span[@title='close' or @class='']")
	public static WebElement Close_Button;
	
	@FindBy(how = How.XPATH, using = "//div//i[@title='Close' or @class='']")
	public static WebElement Close_Page;

	@FindBy(how = How.XPATH, using = "//div//button[text()='Yes' or @class='']")
	public static WebElement yes_Button;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='No' or @class='']")
	public static WebElement No_Button;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='lstStgsdd'])[1]")
	public static WebElement cost_package;
	
	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static WebElement selectcost_package;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='lstStgwada'])[2]")
	public static WebElement WBS;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static WebElement Select_WBS;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='lstStg'])[4]")
	public static WebElement Shape;
	

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)[1]")
	public static WebElement Select_shape;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='A'])[5]")
	public static WebElement A;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='A'])")
	public static WebElement A_Text;
	

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-infix'] | //input[@id='lstStgsatge'])[3]")
	public static WebElement stage_type;
	

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)[1]")
	public static WebElement Select_stagetype;
	

	@FindBy(how = How.XPATH, using = "//div//button[text()='Save' or @id='']")
	public static WebElement Save_Button;
	

	@FindBy(how = How.XPATH, using = "//div//button[text()='Submit' or @id='']")
	public static WebElement Submit_Button;
	

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-home']")
	public static WebElement Home;
	
	@FindBy(how = How.XPATH, using = "//i[@id='profiledropdownbtn' or @class='dropdowntrigger fa fa-angle-down']")
	public static WebElement Sign_Out_Icon;

	@FindBy(how = How.XPATH, using = "//a[text()='Sign Out']")
	public static WebElement Sign_Out;

	
	


}
