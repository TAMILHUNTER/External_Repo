package object_repository.Praveen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class object_repository {

	// **Login Elements**

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

	// **HomePage Elements**

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
	// **Popup**
	@FindBy(how = How.XPATH, using = "//eipmessagebox")
	public static WebElement popup;

	@FindBy(how = How.XPATH, using = "(//eipmessagebox//div)[3]//p")
	public static WebElement popup_text;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static WebElement popup_head;

	@FindBy(how = How.XPATH, using = "(//*[@title='Close'])[1]")
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

	// **Menu**

	@FindBy(how = How.XPATH, using = "//span[text()='Finance']")
	public static WebElement Menu_finance;

	@FindBy(how = How.XPATH, using = "//span[text()='Accounts Payable']")
	public static WebElement Menu_Accounts_Payable;

	@FindBy(how = How.XPATH, using = "//span[text()='Payment - Hold & Release']")
	public static WebElement Menu_Payment_Hold_Release;
	
	// **Grid Tab**
	@FindBy(how = How.XPATH, using = "(//*[text()=' For Action '])")
	public static WebElement Payment_Hold_Release_ForActionTab; //pk
	
	@FindBy(how = How.XPATH, using = "(//*[text()=' In Progress '])")
	public static WebElement Payment_Hold_Release_InProgressTab; //pk
	
	@FindBy(how = How.XPATH, using = "(//*[text()=' All '])")
	public static WebElement Payment_Hold_Release_AllTab; //pk
	
//========== *********  Payment_Hold_Release_ForAction  ************** =============//

	@FindBy(how = How.XPATH, using = "//i[@title='Refresh']")
	public static WebElement Payment_Hold_Release_ForAction_Refresh; //pk

	@FindBy(how = How.XPATH, using = "//i[@title='Download']")
	public static WebElement Payment_Hold_Release_ForAction_DownloadExcel; //pk

	@FindBy(how = How.XPATH, using = "//i[@title='Filter']")
	public static WebElement Payment_Hold_Release_ForAction_Filter; //pk

//'''''
	
	@FindBy(how = How.ID, using = "settingiconID")
	public static WebElement Payment_Hold_Release_ForAction_Setting; //pk

	@FindBy(how = How.XPATH, using = "//i[@id='btnExp']")
	public static WebElement Payment_Hold_Release_ForAction_PageExp; //pk

	@FindBy(how = How.XPATH, using = "//i[@id='ibtnAdvSearch']")
	public static WebElement Payment_Hold_Release_ForAction_Advancesearch; //pk
	
	@FindBy(how = How.XPATH, using = "//i[@id='ibtcreate']")
	public static WebElement Payment_Hold_Release_ForAction_Create; //pk

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload[@title='Attachments'])[1]") 
	public static WebElement Payment_Hold_Release_ForAction_DocAttachment; //pk

	@FindBy(how = How.XPATH, using = "//span[text()='Select files from computer']")
	public static WebElement Payment_Hold_Release_ForAction_AttachFileUpload; //pk
	
	@FindBy(how = How.XPATH, using = "(//eipwftrace[@title='Workflow Trace'])[1]")
	public static WebElement Payment_Hold_Release_ForAction_DocWorkflowTrace; //pk

	@FindBy(how = How.XPATH, using = "(//i[@id='cancel'])[1]")
	public static WebElement Payment_Hold_Release_ForAction_DocCancel; //pk

	@FindBy(how = How.XPATH, using = "(//i[@id='Edit'])[1]")
	public static WebElement Payment_Hold_Release_ForAction_DocEdit; //pk
	
	@FindBy(how = How.XPATH, using = "(//span[text()='HDR - Releasable Deductions'])")
	public static WebElement Payment_Hold_Release_ForAction_Create_ReleasebleDedutions; //pk

	@FindBy(how = How.XPATH, using = "(//span[text()='HDR - Job'])")
	public static WebElement Payment_Hold_Release_ForAction_Create_Job; //pk

	@FindBy(how = How.XPATH, using = "(//span[text()='HDR - Document'])")
	public static WebElement Payment_Hold_Release_ForAction_Create_Document; //pk
	
	@FindBy(how = How.XPATH, using = "(//span[text()='HDR - Vendor'])")
	public static WebElement Payment_Hold_Release_ForAction_Create_Vendor; //pk

	
//==== ****  Create_ReleasebleDedutions  **** ====//
	
	@FindBy(how = How.XPATH, using = "(//input[@id='ddlVendor'])")  //VYT00006
	public static WebElement Payment_Hold_ForAction_Create_ReleasebleDedutions_Vendor; //pk

	@FindBy(how = How.ID, using = "icon-right")
	public static WebElement RD_Date;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lstCurrency']")
	public static WebElement Payment_Hold_ForAction_Create_ReleasebleDedutions_currency; //pk
	
	@FindBy(how = How.XPATH, using = "//span[text()='INR - Indian rupee']")
	public static WebElement Payment_Hold_ForAction_Create_ReleasebleDedutions_Indcurrency; //pk

	@FindBy(how = How.XPATH, using = "//input[@id='txtDocNo']")
	public static WebElement Payment_Hold_ForAction_Create_ReleasebleDedutions_DocumentNo; //pk

	@FindBy(how = How.XPATH, using = "//input[@id='btnSubmit']")
	public static WebElement Payment_Hold_ForAction_Create_RD_SearchBtn; //pk

	
	//********************  CREATE NEW  **************************//
	
	@FindBy(how = How.XPATH, using = "//input[@id='btnNext']")
	public static WebElement Payment_Hold_ForAction_Create_RD_Next; //pk
	
	@FindBy(how = How.NAME, using = "Create New ")
	public static WebElement Payment_Hold_ForAction_RD_CreateNew; //pk

//	@FindBy(how = How.XPATH, using = "//i[@title='Cart']")
//	public static WebElement Payment_Hold_ForAction_Create_RD_Cart; //pk
	
	@FindBy(how = How.XPATH, using = "//i[@id='imgDownload-job']")
	public static WebElement Payment_Hold_ForAction_CN_ExlDwnld; //pk
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-file-excel-upload-o']")
	public static WebElement Payment_Hold_ForAction_RD_ExlUpld; //pk

	//@FindBy(how = How.XPATH, using = "//i[@title='Cart']")
//	public static WebElement Payment_Hold_ForAction_Create_RD_Card; //pk
	
	
	
	
	//**********************//
	
	@FindBy(how = How.XPATH, using = "(//label[text()='Search...'])[1]")
	public static WebElement Payment_Hold_ForAction_Create_RD_ItemsSearchBox; //pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-list-text'])[1]")
	public static WebElement Payment_Hold_ForAction_Create_RD_ItemsSearchNo1; //pk 
	
//====
	
	@FindBy(how = How.XPATH, using = "(//button[@title='Select'])")
	public static WebElement Payment_Hold_ForAction_Create_RD_SelectPass; //pk

	@FindBy(how = How.XPATH, using = "(//button[@title='Select all'])")
	public static WebElement Payment_Hold_ForAction_Create_RD_SelectAllPass; //pk

	@FindBy(how = How.XPATH, using = "(//button[@title='Unselect'])")
	public static WebElement Payment_Hold_ForAction_Create_RD_UnSelectPass; //pk

	@FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary float-right'])")
	public static WebElement Payment_Hold_ForAction_Create_RD_Post; //pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-arrow-s'])[2]")
	public static WebElement Payment_Hold_ForAction_Create_RD_HoldType; //pk
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Hold Amount']")
	public static WebElement Payment_Hold_ForAction_Create_RD_HT_HldAmount; //pk

	@FindBy(how = How.XPATH, using = "//kendo-list//li")
	public static List <WebElement> Payment_Hold_ForAction_Create_RD_HT_dropdown; //pk

	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	public static WebElement Payment_Hold_ForAction_Cnfrm_Yes; //pk

	@FindBy(how = How.XPATH, using = "//button[text()='No']")
	public static WebElement Payment_Hold_ForAction_Cnfrm_No; //pk
	//====
		
		@FindBy(how = How.XPATH, using = "(//input[@class='k-input k-formatted-value'])[2]")
		public static WebElement Payment_Hold_ForAction_Create_RD_HoldValue; //pk

		@FindBy(how = How.XPATH, using = "(//input[@class='ng-untouched ng-pristine ng-valid k-textbox ng-star-inserted'])")
		public static WebElement Payment_Hold_ForAction_Create_RD_Remarks; //pk

		@FindBy(how = How.XPATH, using = "//i[@id='imgDownload-job']")
		public static WebElement Payment_Hold_ForAction_Create_RD_DownloadExcel; //pk

		@FindBy(how = How.XPATH, using = "//i[@class='fa fa-file-excel-upload-o']")
		public static WebElement Payment_Hold_ForAction_Create_RD_UploadExcel; //pk

		@FindBy(how = How.XPATH, using = "//i[@class='fa fa-shopping-cart']")
		public static WebElement Payment_Hold_ForAction_Create_RD_Cart; //pk
		
		
		@FindBy(how = How.XPATH, using = "(//i[@title='Filter'])[2]")
		public static WebElement Payment_Hold_ForAction_Create_RD_Filter; //pk

		@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-expand'])[2]")
		public static WebElement Payment_Hold_ForAction_Create_RD_Expand; //pk

		@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-clipboard'])")
		public static WebElement Payment_Hold_ForAction_Create_RD_Clone; //pk
	
		
		///========''''''''''''''
			
		//====
			
			@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-paperclip'])[8]")
			public static WebElement Payment_Hold_ForAction_Create_RD_Attachments; //pk

			@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-trash'])")
			public static WebElement Payment_Hold_ForAction_Create_RD_Dlt; //pk
			
			@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-trash'])[2]")
			public static WebElement Payment_Hold_ForAction_Create_RD_Dlt2; //pk

			@FindBy(how = How.XPATH, using = "(//input[@class='btn  btn-primary'])")
			public static WebElement Payment_Hold_ForAction_Create_RD_Submit; //pk

			@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-arrow-s'])[3]")
			public static WebElement Payment_Hold_ForAction_Create_RD_Clone_HoldType; //pk

			@FindBy(how = How.XPATH, using = "//input[@id='k-045aa500-49eb-4482-a59e-ba8761df600b']")
			public static WebElement Payment_Hold_ForAction_Create_RD_Clone_HoldValue; //pk
			
			@FindBy(how = How.XPATH, using = "//a[@class='fa fa-calendar ng-star-inserted']")
			public static WebElement Payment_Hold_ForAction_Create_RD_CalendarClick; //pk
			
			@FindBy(how = How.XPATH, using = "(//input[@class='ng-untouched ng-pristine ng-valid k-textbox ng-star-inserted'])[2]")
			public static WebElement Payment_Hold_ForAction_Create_RD_Clone_Remarks; //pk

			@FindBy(how = How.XPATH, using = "(//eipwftrace[@title='Workflow Trace'])[8]")
			public static WebElement Payment_Hold_ForAction_Create_RD_DocWFTrace; //pk

			@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-binoculars'])[11]")
			public static WebElement Payment_Hold_ForAction_Create_RD_DocTraceInfo; //pk
			
			@FindBy(how = How.XPATH, using = "(//i[@title='Close'])[1]")
			public static WebElement Payment_Hold_ForAction_Create_RD_DocWFTrace_Clse; //pk
	
	
	
	
	
	
			//========== *********  Payment_Hold_Release_InProgress  ************** =============//
	
			@FindBy(how = How.XPATH, using = "(//*[@id='checkbox-0'])")
			public static WebElement Payment_Release_InprogressDoc1; //pk
			
			@FindBy(how = How.XPATH, using = "(//*[@kendopopupid='clusterPopUpId'])[1]")
			public static WebElement Payment_Release_DocPopup; //pk
			
			@FindBy(how = How.XPATH, using = "//*[@id=\"k-grid0-r1c2\"]")
			public static WebElement Payment_Release_DocNoTxt; //pk
			
			@FindBy(how = How.XPATH, using = "(//td[@class='ng-star-inserted'])[122]")
			public static WebElement Payment_Release_DocPopup_HoldType; //pk
			
			@FindBy(how = How.XPATH, using = "(//td//span)[92]")
			public static WebElement Payment_Release_DocPopup_HoldValue; //pk
			
			@FindBy(how = How.XPATH, using = "(//td[@class='ng-star-inserted'])[123]")
			public static WebElement Payment_Release_DocPopup_HoldValue1; //pk
			
			@FindBy(how = How.XPATH, using = "(//span[@class='ng-star-inserted'])[4]")
			public static WebElement Payment_Release_DocReference; //pk
			
			@FindBy(how = How.XPATH, using = "(//span[@class='ng-star-inserted'])[5]")
			public static WebElement Payment_Release_DocDate; //pk
			
			@FindBy(how = How.XPATH, using = "(//input[@class='ng-untouched ng-pristine ng-valid k-textbox ng-star-inserted'])[1]")
			public static WebElement Payment_Release_DocRemarks; //pk
			
			@FindBy(how = How.XPATH, using = "(//*[text()='Hold & Release History'])[1]")
			public static String Payment_Release_DocRef_History; //pk
			
			@FindBy(how = How.XPATH, using = "((//span[@class='ng-star-inserted'])//span)[22]")
			public static WebElement Payment_Release_DocRef_HistoryActionBy; //pk
			
	//05.11.2022****************************************
			
		
			@FindBy(how = How.XPATH, using = "//p[text()='Release Amount Should not be more than Hold Amount']")
			public static WebElement Payment_Release_ErrorPopup_Release; //pk
			
			@FindBy(how = How.XPATH, using = "(//i[@id='Release'])[1]")
			public static WebElement Payment_Release_Doc; //pk
			
			@FindBy(how = How.XPATH, using = "(//span[@class='k-numeric-wrap']//input)[2]")
			public static WebElement Payment_ReleaseValue_Amnt; //pk
			
			@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
			public static WebElement Success_Ok;
			
			@FindBy(how = How.XPATH, using = "//p[text()='Are you sure want to submit release request?']")
			public static WebElement Payment_Release_PopupMsg; //pk
			
			@FindBy(how = How.XPATH, using = "(//*[@id='k-grid0-r1c2']/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input)")
			public static WebElement Payment_Release_Filter_Reqno; //pk
			
			@FindBy(how = How.XPATH, using = "(//*[@id='Releasablegrid']/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr/td[4]/div)")
			public static WebElement HoldValue_AmntTxt; //pk
			
			@FindBy(how = How.XPATH, using = "(//*[@id='mat-dialog-0']/app-hdr-release/div[1])")
			public static WebElement Payment_Release_RDtxt; //pk
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
