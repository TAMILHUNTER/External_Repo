package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SCM_SR_Coding {

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

	@FindBy(how = How.XPATH, using = "(//span[text()='Request' or @title='Request'])")
	public static WebElement Request;

	@FindBy(how = How.XPATH, using = "(//span[@title='Purchase / Service' or text()='Purchase / Service'])")
	public static WebElement S_R;

	@FindBy(how = How.XPATH, using = "(//div[text()='Service ' or @class='mat-button-toggle-label-content'])[2]")
	public static WebElement Service_Icon;

// Creation

	@FindBy(how = How.XPATH, using = "//i[@title='Create' or @class='fa fa-plus-circle ng-star-inserted']")
	public static WebElement creater_Icon;

	@FindBy(how = How.ID, using = "lstJob")
	public static WebElement Job;

	@FindBy(how = How.XPATH, using = "//input[@id='paymentId']")
	public static WebElement Payment_Center;

	@FindBy(how = How.XPATH, using = "//input[@id='lstSerCat']")
	public static WebElement S_G;

	@FindBy(how = How.XPATH, using = "//input[@id='currencyId']")
	public static WebElement Currency;

	@FindBy(how = How.XPATH, using = "//input[@class='CCDPClass k-input ng-untouched ng-pristine ng-valid']")
	public static WebElement WO_Period;

	@FindBy(how = How.XPATH, using = "//input[@id='multi-select-input-lblSRGroupApproval']")
	public static WebElement S_C;

	@FindBy(how = How.XPATH, using = "//input[@id='multi-select-input-']")
	public static WebElement Group;

	@FindBy(how = How.XPATH, using = "(//div//div[@class='mat-form-field-infix' ])//textarea")
	public static WebElement NOS;

	@FindBy(how = How.XPATH, using = "(//div[text()='Copy' or @class='mat-button-toggle-label-content'])[2]")
	public static WebElement Created_type_copy;

	@FindBy(how = How.XPATH, using = "(//div[text()='Copy' or @class='mat-button-toggle-label-content'])[4]")
	public static WebElement Created_Type_capital;

	@FindBy(how = How.XPATH, using = "//a//i[@class='fa fa-cart-plus cart-cursor-pointer']")
	public static WebElement card;

// Material Selection	

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[3]//span")
	public static WebElement Select_Job;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static WebElement Select_payment;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[2]//span")
	public static WebElement Select_S_G;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public static WebElement select_S_C;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public static WebElement select_Group;

	@FindBy(how = How.XPATH, using = "//span[@class='k-today']")
	public static WebElement Select_Today;

	@FindBy(how = How.XPATH, using = "(//div[@class='ng-star-inserted'])")
	public static java.util.List<WebElement> Select_material;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'110300000082498')]")
	public static WebElement Select_material1;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[3]")
	public static WebElement Select_material2;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[5]")
	public static WebElement Select_material3;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[7]")
	public static WebElement Select_material4;
//
	
	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[9]")
	public static WebElement Select_material5;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[11]")
	public static WebElement Select_material6;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[13]")
	public static WebElement Select_material7;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'110300000082497')])[15]")
	public static WebElement Select_material8;

	@FindBy(how = How.ID, using = "multi-select-input-lstMatGroup")
	public static WebElement Job_group;

	@FindBy(how = How.ID, using = "leftSearchText")
	public static WebElement Search_bar;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-angle-right font-weight-bold']")
	public static WebElement move_material;

// card

	@FindBy(how = How.XPATH, using = "//button[text()='Ok' or @class='btn btn-primary btn-sm cursor-pointer']")
	public static WebElement ok_button;

	@FindBy(how = How.XPATH, using = "//span[@title='close' or @class='fa fa-times eip-messagebox-close']")
	public static WebElement Close_pop;

//	WBS:
	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[8]")
	public static WebElement WBS;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[10]")
	public static WebElement WBS2;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[12]")
	public static WebElement WBS3;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[14]")
	public static WebElement WBS4;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[16]")
	public static WebElement WBS5;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[18]")
	public static WebElement WBS6;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[20]")
	public static WebElement WBS7;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[22]")
	public static WebElement WBS8;

//	Costpackage:
	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[7]")
	public static WebElement Cost_package;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[9]")
	public static WebElement Cost_package2;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[11]")
	public static WebElement Cost_package3;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[13]")
	public static WebElement Cost_package4;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[7]")
	public static WebElement Cost_package5;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[3]")
	public static WebElement Cost_package6;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[19]")
	public static WebElement Cost_package7;

	@FindBy(how = How.XPATH, using = "(//input[@id='cpCode0' or @ng-reflect-type='text' ])[21]")
	public static WebElement Cost_package8;

//	Quantiy:
	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[1]")
	public static WebElement Quantiy;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[3]")
	public static WebElement Quantiy2;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[5]")
	public static WebElement Quantiy3;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[7]")
	public static WebElement Quantiy4;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[9]")
	public static WebElement Quantiy5;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[11]")
	public static WebElement Quantiy6;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[13]")
	public static WebElement Quantiy7;

	@FindBy(how = How.XPATH, using = "(//input[@role='spinbutton'])[15]")
	public static WebElement Quantiy8;

//	Rate:
	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[1]")
	public static WebElement Rate;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[2]")
	public static WebElement Rate2;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[3]")
	public static WebElement Rate3;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[4]")
	public static WebElement Rate4;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[5]")
	public static WebElement Rate5;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[6]")
	public static WebElement Rate6;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[7]")
	public static WebElement Rate7;

	@FindBy(how = How.XPATH, using = "(//input[@type='number'])[8]")
	public static WebElement Rate8;

//	 Submit:
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary eip-mr-10 ng-star-inserted']")
	public static WebElement submit;

// Cost package	

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement CP_1;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[2]")
	public static WebElement CP_2;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[3]")
	public static WebElement CP_3;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[4]")
	public static WebElement CP_4;

// WBS

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement WBS_1;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[2]")
	public static WebElement WBS_2;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[3]")
	public static WebElement WBS_3;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[4]")
	public static WebElement WBS_4;

// post

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary' or text()='Post']")
	public static WebElement post;

// Inprogess:
//	(//div[text()=' In Progress ' or @class='mat-tab-label-content'])[3]
	@FindBy(how = How.XPATH, using = "(//div[text()=' In Progress ' or @class=''])[2]")
	public static WebElement Inprogress_Icon;

	@FindBy(how = How.XPATH, using = "(//i[@title='Print' or @class='fa fa-file-pdf-o'])[1]")
	public static WebElement Mouse_Over;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-pencil icon-disable icon-align ng-star-inserted'])[1]")
	public static WebElement Edit_Icon;
	
	@FindBy(how = How.XPATH, using = "(//i[@id='GibtEdit' or @title='Edit'])[1]")
	public static WebElement Edit_Button;

	@FindBy(how = How.XPATH, using = "(//i[@id='GibtCancel' or @title='Cancel'])[1]")
	public static WebElement Cancel_Icon;

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-binoculars'])[1]")
	public static WebElement WorkFlow_Trace_Icon;

	@FindBy(how = How.XPATH, using = "(//i[@id='ibtRecall' or @title='Recall'])[1]")
	public static WebElement Recall_Icon;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-users wfttrace-user-icon']")
	public static WebElement Workflow_Approver_Name;
	
	@FindBy(how = How.XPATH, using = "(//div[text()='  All  ' or @class='mat-tab-label-content'])[6]")
	public static WebElement ALL_Button;
	
//    Sign_Out:
	@FindBy(how = How.XPATH, using = "//i[@id='profiledropdownbtn' or @class='dropdowntrigger fa fa-angle-down']")
	public static WebElement Sign_Out_Icon;

	@FindBy(how = How.XPATH, using = "//a[text()='Sign Out']")
	public static WebElement Sign_Out;
	
//	Approver:
	@FindBy(how = How.XPATH, using = "//i[@title='Approve' or @class='fa fa-check-circle ng-star-inserted']")
	public static WebElement Approver_Icon;
	
	@FindBy(how = How.XPATH, using = "//i[@title='Reject' or @class='fa fa-times-circle ng-star-inserted']")
	public static WebElement Reject_Icon;
	
	@FindBy(how = How.XPATH, using = "//i[@title='Hold' or @class='fa fa-pause-circle ng-star-inserted']")
	public static WebElement Hold_Icon;
	
	@FindBy(how = How.XPATH, using = "(//tr[@class='ng-star-inserted'])[2]//td[1]")
	public static WebElement Radio_Icon;
	
	@FindBy(how = How.XPATH, using = "(//td[@class='ng-star-inserted'])[12]")
	public static WebElement Radio_Icon1;
	
	
	@FindBy(how = How.XPATH, using = "(//div[text()=' Rejected ' or @class='mat-tab-label-content'])[5]")
	public static WebElement Reject_Button;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-tab-label-content' or text()=' For Action '])[2]")
	public static WebElement ForAction_Button;
	
	@FindBy(how = How.XPATH, using = "(//div[text()='  Hold ' or @class='mat-tab-label-content'])[6]")
	public static WebElement Hold_Button;
	
	@FindBy(how = How.XPATH, using = "(//div[text()='  All  ' or @class='mat-tab-label-content'])[7]")
	public static WebElement ALL_Icon;
	
	@FindBy(how = How.XPATH, using = "(//div[text()='   Approved   ' or @class='mat-tab-label-content'])[4]")
	public static WebElement Approver_Button;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-tab-labels'])[1]")
	public static WebElement empty_place;
	
	@FindBy(how = How.XPATH, using = "//div[@class='d-flex justify-content-end icons-container item-cart eip-mr-20']")
	public static WebElement empty_place1;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='eip-messagebox-tab-desc ng-star-inserted'])[2]")
	public static WebElement Mouse_over_Approve;
	
	
//	Remark:
	@FindBy(how = How.XPATH, using = "//div[@class='kp-body eip-mx-20']//textarea")
	public static WebElement Remark_Cancel;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='mat-form-field-infix']//textarea")
	public static WebElement Remark_Approver;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Yes' or @class='']")
	public static WebElement yes_Click;
	
	@FindBy(how = How.XPATH, using = "//button[text()='No' or class='']")
	public static WebElement No_Click;
	
// Document View:
	@FindBy(how = How.XPATH, using = "(//figure[@class='document-viewer-img ng-star-inserted' ] | //i[@class='docIconDV fa fa-file-pdf-o'])[2]")
	public static WebElement Document_Name;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle pull-right cursor-pointer' or @title='close']")
	public static WebElement Document_Close_pop;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='no-wrap eip-link ng-star-inserted'])[1]")
	public static WebElement Document_Request_No;
	
	@FindBy(how = How.XPATH, using = "//button//i[@class='fa fa-angle-right']")
	public static WebElement Document_move;
	
}