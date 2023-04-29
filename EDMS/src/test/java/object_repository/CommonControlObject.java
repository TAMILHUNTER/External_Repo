package object_repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonControlObject {
	
	//**Login Elements**
	
	//OtherUser
		@FindBy(how=How.XPATH,xpath="(//a[@data-toggle='pill'])[2]")
		public  static WebElement otheruser_button;
		
	//UserName
		@FindBy(how=How.ID,id="username")
		public  static WebElement Username;
    //Password
		@FindBy(how=How.ID,id="password-field")
		public  static WebElement Password;
	//Login
		@FindBy(how=How.ID,id="login-submit")
		public  static WebElement Login_Button;
		
		@FindBy(how=How.ID,id="login-submitaaaaa")
		public  static WebElement Login_ButtonAAA;
		
	//**Home Page Element**
	
	//MenuButton
		@FindBy(how=How.XPATH,xpath="//a[@title='Access Based Menu']")
		public  static WebElement Menu;
//material receipt
		
		@FindBy(how=How.XPATH,xpath="//*[@placeholder='Search Menu']")
			public  static WebElement searchInput;
			
			@FindBy(how = How.XPATH, using="//span[@class='ng-star-inserted']")
			public static List<WebElement> searchResult;
			
			@FindBy(how = How.XPATH, using="(//div[@class='mat-tab-label-content'])[2]")
			public static WebElement forAction;
			
			@FindBy(how = How.XPATH, using="(//div[@class='mat-tab-label-content'])[3]")
			public static WebElement inProgress;
			
			@FindBy(how = How.XPATH, using="//div[text()=' Approved ']")
			public static WebElement approved;
			
			@FindBy(how = How.XPATH, using="//div[text()=' All ']")
			public static WebElement all;
			
			@FindBy(how = How.XPATH, using="//div[@class='icon-wrap']//i")
			public static WebElement referesh;
			
			@FindBy(how = How.ID, using="ibtGINfilter")
			public static WebElement filter;
			
			@FindBy(how = How.ID, using="ibtAdd")
			public static WebElement create;
			
			@FindBy(how = How.ID, using="ibtSearch")
			public static WebElement search;
			
			@FindBy(how = How.XPATH, using="//i[@class='fa fa-expand']")
			public static WebElement expand;
			
			@FindBy(how = How.ID, using="settingiconID")
			public static WebElement settings;
			
			@FindBy(how = How.XPATH, using="//kendo-pager-page-sizes[@class='k-pager-sizes k-label']//select[1]")
			public static WebElement show;
			
			@FindBy(how = How.CLASS_NAME, using="k-input")
			public static WebElement viewList;
			
			@FindBy(how = How.XPATH, using="//i[@class='fa fa-paperclip']")
			public static WebElement attachment;
			
			@FindBy(how = How.XPATH, using="//i[@title='Document View']")
			public static WebElement attachmentView;
			
			@FindBy(how = How.XPATH, using="//i[@class='fa fa-binoculars']")
			public static WebElement workflowView;
			
			@FindBy(how = How.XPATH, using="//i[@title='Edit']")
			public static WebElement eidt;
			
			@FindBy(how = How.XPATH, using="//i[@title='Print']")
			public static WebElement print;
			
			@FindBy(how = How.ID, using="settingbtnAdd")
			public static WebElement settingSubmit;
			
			@FindBy(how = How.XPATH, using="//i[@id='lockCol']")
			public static WebElement columnFreeze;
			
			@FindBy(how = How.XPATH, using="//i[@id='viewCol']")
			public static WebElement columnView;
			
			@FindBy(how = How.XPATH, using="//i[@title='Drag Here']")
			public static WebElement columnDrag;
			
			@FindBy(how = How.XPATH, using="//input[@class='k-checkbox ng-star-inserted']")
			public static WebElement checkbox;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'create-popup-hover cursor-pointer')]//span)[1]")
			public static WebElement directPurchase;
			
			@FindBy(how = How.ID, using="lblJosssb")
			public static WebElement jobId;
			
			@FindBy(how = How.ID, using="lblwarehouse")
			public static WebElement wareHouse;
			
			@FindBy(how = How.ID, using="lblRequiredFor")
			public static WebElement requiredFor;
			
			@FindBy(how = How.XPATH, using="//i[@title='Received From']")
			public static WebElement receivedFrom;
			
			@FindBy(how = How.NAME, using="search")
			public static WebElement vendorCode;
			
			/*@FindBy(how = How.XPATH, using="//button[@title='Minimum 5 characters required']")
			public static WebElement search;
			
			@FindBy(how = How.XPATH, using="(//input[@type='checkbox'])[1]")
			public static WebElement checkbox;*/
			
			@FindBy(how = How.XPATH, using="//button[text()='OK']")
			public static WebElement ok;
			
			@FindBy(how = How.ID, using="lblAddress")
			public static WebElement address;
			
			@FindBy(how = How.ID, using="lblPincode")
			public static WebElement pinCode;
			
			@FindBy(how = How.XPATH, using="//div[contains(@class,'mat-form-field-suffix ng-tns-c29-1511')]//span[1]")
			public static WebElement clear;
			
			@FindBy(how = How.ID, using="lblConsignorCountry")
			public static WebElement countryInput;
			
			@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")	
			public static List<WebElement> countrySelection;
			
			@FindBy(how = How.ID, using="lblConsignorState")
			public static WebElement state;
			
			@FindBy(how = How.XPATH, using="//input[@id='lblVertical']")
			public static WebElement vertical;
			
			@FindBy(how = How.ID, using="lblTaxtype")
			public static WebElement taxtaxType;
			
			@FindBy(how = How.ID, using="lblMobileNumber")
			public static WebElement mobileNumber;
			
			@FindBy(how = How.ID, using="lblBankName")
			public static WebElement bankName;
			
			@FindBy(how = How.ID, using="lblIfscCode")
			public static WebElement ifscCode;
			
			@FindBy(how = How.ID, using="lblBranch")
			public static WebElement brachName;
			@FindBy(how = How.XPATH, using="//input[@placeholder='Materials']")
			public static WebElement materialInput;
			
			@FindBy(how = How.XPATH, using="(//ul[@ng-reflect-klass='k-list k-reset']//li)[2]")
			public static WebElement materialClick;
			
			@FindBy(how = How.XPATH, using="(//input[@role='spinbutton'])[2]")
			public static WebElement mrnQty;
			
			@FindBy(how = How.XPATH, using="(//label[text()='Bank A/C No']/following::input)[3]")	
			public static WebElement costPackage;
			
			@FindBy(how = How.XPATH, using="(//input[@role='spinbutton'])[3]")
			public static WebElement rate;
			
			@FindBy(how = How.XPATH, using="//input[@dir='ltr']")
			public static WebElement hsnNumber;
			
			@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='Bill/DC Number']")
			public static WebElement billNumber;
			
			@FindBy(how = How.XPATH, using="(//span[@class='k-select']//span)[2]")
			public static WebElement billdate;
			
			@FindBy(how = How.XPATH, using="//td[@data-cell-index='2:3']//span[1]")
			public static WebElement billdateSelection;
			
			@FindBy(how = How.XPATH, using="//input[@ng-reflect-placeholder='Batch Number']")
			public static WebElement batchNumber;
			
			@FindBy(how = How.XPATH, using="//textarea[@placeholder='Remarks/Scope']")
			public static WebElement remarksScope;
			
			@FindBy(how = How.ID, using="btnSubmit")
			public static WebElement submit;
			
			@FindBy(how = How.XPATH, using="//span[text()=' 72112340 - GST - 28.00%']")
			public static WebElement clickHsnNumber;
			
			
			@FindBy(how=How.XPATH,xpath="(//i[@title='Create'])")
			public  static WebElement repo_Create;
			
			@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-times-circle')]")
			public static WebElement CloseT;
				
			@FindBy(how=How.XPATH,xpath="(//i[@title='Reject'])[1]")
			public  static WebElement repo_Reject;
			
			@FindBy(how=How.XPATH,xpath="(//i[@title='Approve'])[1]")
			public  static WebElement repo_approve;
			
			@FindBy(how=How.XPATH,xpath="(//i[@title='Mail'])[1]")
			public  static WebElement repo_Email;
			
			@FindBy(how=How.XPATH,xpath="(//i[@title='Share'])[1]")
			public  static WebElement repo_Share;
			
			@FindBy(how=How.XPATH,xpath="//app-employee-cart-dialog//div[@class='d-flex justify-content-between']")
			public static WebElement cartPageTitle;
			
			@FindBy(how=How.XPATH,xpath="(//*[@placeholder='Search...'])[1]")
			public static WebElement selectPersonToShare;
			
			@FindBy(how=How.XPATH,xpath="//*[@class='mat-list-text']")
			public static List<WebElement> mailList;
			
			@FindBy(how=How.XPATH,xpath="(//button[@class='btn btn-default job-selector'])[1]")
			public static WebElement moveUser;
			
				
			@FindBy(how=How.XPATH,xpath="(//i[@title='Share'])[2]")
			public  static WebElement repo_Share1;
			
			@FindBy(how=How.XPATH,xpath="//*[@class='d-none d-md-block']//i[@title='View']")
			public  static WebElement repo_View;
			
			@FindBy(how=How.ID,id="ibtSearch")
			public  static WebElement repo_Search;
			
			@FindBy(how=How.XPATH,xpath="//div[text()=' Approved ']")
			public static WebElement repo_Approved;
			
			@FindBy(how=How.XPATH,xpath="//div[text()=' Rejected ']")
			public static WebElement repo_Rejected;
			
			@FindBy(how=How.XPATH,xpath="//div[text()=' In Progress ']")
			public static WebElement repo_InProgress;
			
			@FindBy(how=How.XPATH,xpath="//div[text()=' For Action ']")
			public static WebElement repo_Foraction;
			
			@FindBy(how=How.XPATH,xpath="//div[text()=' All ']")	
			public static WebElement repo_All;
			
			@FindBy(how=How.XPATH,xpath="//div[@class='mat-slide-toggle-thumb']")
			public static WebElement repo_revision;	
			
			@FindBy(how=How.ID,id="ddlRecordsperPage")
			public static WebElement recordsperpage;	
			
			@FindBy(how=How.XPATH,xpath="//i[@title='Download Excel']")
			public static WebElement download_excel;
			
			@FindBy(how=How.XPATH,xpath="//i[@title='Upload Excel']")
			public static WebElement upload_excel;
			
//			@FindBy(how=How.XPATH,xpath="//i[@title='Expand']")
//			public static WebElement expand;
			
			@FindBy(how=How.ID,id="lblViewingLastDaysRecords")
			public static WebElement view_lastdaysrecords;
			
			@FindBy(how=How.XPATH,xpath="(//*[@role='listbox'])[2]//span)")
			public static WebElement viewAllRecords;
			
			@FindBy(how=How.XPATH,xpath="//*[@Title='Download Excel']")
			public  static WebElement engr_excel_template_download;
			
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Select']")
			public static WebElement project_name_select;
			
			@FindBy(how=How.XPATH,xpath="//div[@class='cdk-overlay-container']//span")
			public static WebElement project_names;
			
			@FindBy(how=How.XPATH,xpath="//div[@class='mat-dialog-title']//p")
			public static WebElement Create_window_title;
			
			@FindBy(how=How.ID,id="ibtClose")
			public static WebElement close_create_window;
			
			@FindBy(how=How.XPATH,xpath="//mat-option/span/span/span")
			public static List<WebElement> project_code_list;
			
			@FindBy(how=How.XPATH,xpath="//*[@value='MyDocuments']//button")
			public static WebElement repo_MyDoc;
			@FindBy(how=How.XPATH,xpath="//*[@value='MyOrg']//button")
			public static WebElement repo_MyOrgDoc;
			@FindBy(how=How.XPATH,xpath="//*[@value='Project']")
			public static WebElement repo_AllDoc;	
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Project Code * ']")
			public static WebElement projectCode;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Area * ']")
			public static WebElement Area;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Discipline * ']")
			public static WebElement discipline;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Category * ']")
			public static WebElement Category;
			
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Document Type * ']")
			public static WebElement DocumentType;
			
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='lblIsConfidential']")
			public static WebElement doc_Confidential;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Print Size *']")
			public static WebElement print_Size;
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='txtTitle']")
			public static WebElement repo_title;
			@FindBy(how=How.XPATH,xpath="//div[@class='mat-slide-toggle-thumb-container']//div")
			public static WebElement revision;
			@FindBy(how=How.XPATH,xpath="//span[text()='Auto ']")
			public static WebElement autoRevision;
			
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Status *']")
			public static WebElement repo_status;
			@FindBy(how=How.XPATH,xpath="//*[@class='k-dateinput-wrap']//input")
			public static WebElement revision_date;
			@FindBy(how=How.ID,id="ddlAuthorisedBy1")
			public static WebElement approvedBy;
			@FindBy(how=How.XPATH,xpath="//input[@formcontrolname='txtRef']")
			public static WebElement reference;
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='txtQRCode']")
			public static WebElement qrCode;
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Location']")
			public static WebElement fileLocation;
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Building']")
			public static WebElement building;
			
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Floor']")
			public static WebElement floor;
			
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Rack']")
			public static WebElement rack;
			
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Shelf']")
			public static WebElement shelf;
			
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='txtFileNo']")
			public static WebElement fileNumber;
			
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='txtComments']")
			public static WebElement fileComments;
			
			@FindBy(how=How.ID,id="btnReset")
			public static WebElement reset;
			
			@FindBy(how=How.ID,id="btnsaveAllDocument")
			public static WebElement save;
			
			@FindBy(how=How.ID,id="btnCancel")
			public static WebElement cancel;
			
			@FindBy(how=How.ID,id="mat-expansion-panel-header-11")
			public static WebElement file_location_expand;
			
			@FindBy(how=How.XPATH,xpath="//*[@id='mat-dialog-2']/eipmessagebox/div/div[2]/p")
			public static WebElement success_Messagebox;
			
			
			@FindBy(how=How.XPATH,xpath="//*[@id='mat-dialog-2']//div/div[3]/button")
			public static WebElement success_Messagebutton;
			
			@FindBy(how=How.XPATH,xpath="//eipmessagebox//h1")
			public static WebElement success_Message;
			
			@FindBy(how=How.XPATH,xpath="//eiptoastalert/div/div/p")
			//@FindBy(how=How.XPATH,xpath="//p[@class='toastMessageLength']")
			public static WebElement mandatory_fields;
			
			@FindBy(how=How.XPATH,xpath="//*[@id=\"documentLandingGrid\"]/kendo-grid-toolbar/div/div[3]")
			public static WebElement pendingfor_attachment;
			
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='ctrlSearchText']")
			public static WebElement searchDocument;
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Type *']")
			public static WebElement searchType;
			@FindBy(how=How.XPATH,xpath="//input[@value='Search']")
			public static WebElement searchbutton;
			@FindBy(how=How.XPATH,xpath="//*[@class='date-range']//span//input")
			public static WebElement daterange;
			@FindBy(how=How.XPATH,xpath="//table/tbody/tr/td[2]/span")
			public static List<WebElement> searchresult_DocumentNumber;
			@FindBy(how=How.XPATH,xpath="//table/tbody/tr/td[3]/span")
			public static List<WebElement> searchresult_Title;
			@FindBy(how=How.XPATH,xpath="//table/tbody/tr/td[4]/span")
			public static List<WebElement> searchresult_revisionNumber;
			@FindBy(how=How.ID,id="BtnClear")
			public static WebElement clear_Search_terms;
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='RevisionNo']")
			public static WebElement revisonNumber_search;
			@FindBy(how=How.XPATH,xpath="//button[text()='Save & Search']")
			public static WebElement save_search;
			@FindBy(how=How.XPATH,xpath="//*[text()=' Save Search Filter As ']")
			public static WebElement title_search_alert;
			@FindBy(how=How.XPATH,xpath="//input[@formcontrolname='ctrlInputText']")
			public static WebElement search_name;
			@FindBy(how=How.XPATH,xpath="//div[@class='mat-dialog-actions']//button")
			public static WebElement save_search_name;
			@FindBy(how=How.XPATH,xpath="//*[@class='toastMessageLength']")
			public static WebElement status;
			@FindBy(how=How.XPATH,xpath="//div[@class='search-row']//p")
			public static List<WebElement> search_list;
			@FindBy(how=How.XPATH,xpath="//div[@class='search-row']//p//i[2]")
			public static List<WebElement> search_list_delete;
			@FindBy(how=How.XPATH,xpath="//button[@class='savesearch ng-star-inserted']")
			public static WebElement searchlist;		
			@FindBy(how=How.XPATH,xpath="//span[@class='fa fa-question confirmation']")
			public static WebElement delete_confirmation_window;
			@FindBy(how=How.XPATH,xpath="//eipmessagebox[@class='ng-star-inserted']//button[1]")
			public static WebElement delete_confirmation_yes;
			@FindBy(how=How.XPATH,xpath="//eipmessagebox[@class='ng-star-inserted']//button[2]")
			public static WebElement delete_confirmation_no;
//			@FindBy(how=How.XPATH,xpath="//*[@Title='Filter']")
//			public static WebElement filter;
			@FindBy(how=How.XPATH,xpath="//*[@role='presentation']//tr[2]//td[2]//input")
			public static WebElement filter_value;
			@FindBy(how=How.XPATH,xpath="//*[@class='k-grid-table']//tbody/tr[1]//td[2]//span")
			public static WebElement foundresult;
			@FindBy(how=How.XPATH,xpath="//*[@class='k-grid-table']//tbody/tr[1]//td[1]")
			public static WebElement select_result;	
			@FindBy(how=How.XPATH,xpath="//*[@title='View']")
			public static WebElement view;	
			@FindBy(how=How.XPATH,xpath="//*[@id='mat-tab-label-0-1']/div")
			public static WebElement view_title_name;
			@FindBy(how=How.XPATH,xpath="//*[@class='k-grid-table']//tbody/tr[1]/td[1]")
			public static WebElement norecords;
			@FindBy(how=How.XPATH,xpath="//*[@class='d-flex justify-content-between']")
			public static WebElement employee_cart;
			@FindBy(how=How.XPATH,xpath="//div[@class='job-cart-box']//input")
			public static WebElement employee_name_to_share;	
			@FindBy(how=How.XPATH,xpath="//button[@title='Select all']")
			public static WebElement employee_name_to_share_post;	
			
			@FindBy(how=How.XPATH,xpath="(//button[text()='Post'])[2]")
			public static WebElement shareToPost;
			
			@FindBy(how=How.XPATH,xpath="(//*[@class='job-post-button'])[2]//button")
			public static WebElement employee_name_post;
			@FindBy(how=How.XPATH,xpath="(//kendo-dropdownlist)[2]")
			public static List<WebElement> view_list;
			@FindBy(how=How.XPATH,xpath="(//app-create-message//div//p)[1]")
			public static WebElement new_email;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='From Org * ']")
			public static WebElement from_org;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='To Org * ']")
			public static WebElement to_org;
			@FindBy(how=How.XPATH,xpath="//input[@placeholder='Mail Type*']")
			public static WebElement mail_type;
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='lblIsConfidential']//div[@class='mat-slide-toggle-thumb']")
			public static WebElement confidential;	
			@FindBy(how=How.ID,id="toMembers")
			public static WebElement toMembers;
			@FindBy(how=How.XPATH,xpath="//mat-button-toggle[@value='Yes']//button")
			public static WebElement response_required_yes; 
			@FindBy(how=How.XPATH,xpath="//mat-button-toggle[@value='No']//button")
			public static WebElement response_required_no; 
			@FindBy(how=How.XPATH,xpath="//input[@formcontrolname='ccMembersCtrl']")
			public static WebElement ccMembers;
			
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='bccMembersCtrl']")
			public static WebElement bccMembers;
			
			@FindBy(how=How.XPATH,xpath="//input[@formcontrolname='txtMailSubject']")
			public static WebElement txtMailSubject; 
			@FindBy(how=How.XPATH,xpath="//iframe[@class='k-iframe']")
			public static WebElement txtBody; 
			@FindBy(how=How.XPATH,xpath="(//table[@class=\"k-grid-table\"])[2]//tr//td[2]//span")
			public static WebElement attached_sending_document; 
			@FindBy(how=How.ID,id="btnSave")
			public static WebElement send_repo_doc;
			@FindBy(how=How.ID,id="btnsaveAllDocument")
			public static WebElement save_repo_draft;		
			@FindBy(how=How.XPATH,xpath="//*[@placeholder='Discipline * ']")
			public static WebElement discipline1;
			@FindBy(how=How.XPATH,xpath="//mat-checkbox//div[@class='mat-checkbox-inner-container']")
			public static WebElement cc_checkbox;	
			@FindBy(how=How.XPATH,xpath="//div[contains(text(),'For Action')]//span")
			public static WebElement for_action_count;
			
			@FindBy(how=How.XPATH,xpath="//div[contains(text(),'Approved')]//span")
			public static WebElement approved_count;
			
			@FindBy(how=How.XPATH,xpath="//div[contains(text(),'Rejected')]//span")
			public static WebElement rejected_count;
			
			@FindBy(how=How.XPATH,xpath="//div[contains(text(),'In Progress')]//span")
			public static WebElement in_progress_count;
			
			@FindBy(how=How.XPATH,xpath="//div[contains(text(),'All')]//span")
			public static WebElement all_count;
			
			@FindBy(how=How.XPATH,xpath="//*[@formcontrolname='txtSerialNo']")
			public static WebElement seriallnumber;
			
			
			
			@FindBy(how=How.XPATH,xpath="(//i[@title='Supersede'])[1]")
			public static WebElement supersede;
			
			@FindBy(how = How.XPATH, using="//div[contains(@class,'floating-icon icon-container')]//i[1]")
			public static WebElement attachmentPopUp;
			
			@FindBy(how = How.ID, using="lblHeading")
			public static WebElement uploadWizardTitle;
			
			@FindBy(how = How.XPATH, xpath="//*[@class='file-upload']")
			public static WebElement brouseButton;
			
			@FindBy(how = How.XPATH, using="//span[@class='eip-pl-10 eip-pr-10']")
			public static WebElement attachmentName;
			
			@FindBy(how = How.XPATH, using="//input[@placeholder='Select File Type']")
			public static WebElement fileType;
			
			@FindBy(how = How.XPATH, using="//button[contains(@class,'fa fa-upload')]")
			public static WebElement upload;
			
			@FindBy(how = How.XPATH, using="//div[@id='lblHeading']//i[1]")
			public static WebElement closingUploadWizard;
			
			@FindBy(how = How.XPATH, using="//*[@title='Edit']")
			public static WebElement edit;
			
			@FindBy(how = How.XPATH, using="//div[@class='d-flex justify-content-between']/p")
			public static WebElement editWindowTitle;	
			
			@FindBy(how = How.XPATH, using="//eipmessagebox//p")
			public static WebElement updateSuccessfully; 
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-body']//p[2])[1]")  //projectcode"
			public static WebElement projectCodes;
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-body']//p[2])[2]")
			public static WebElement projecTypeArea;
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-body']//p[2])[3]")
			public static WebElement disciplineType;
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-body']//p[2])[4]")
			public static WebElement structurePackage;
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-body']//p[2])[5]")
			public static WebElement docSerialnumber;
			
			@FindBy(how = How.XPATH,using="((//div[@class='row'])[2]//div[3])[1]//p[2]")
			public static WebElement printSize;
			
			
			@FindBy(how = How.XPATH,using="((//div[@class='row'])[2]//div[4])[1]//p[2]")
			public static WebElement title;
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-header-title'])[2]")
			public static WebElement documentRevision;
			
			@FindBy(how = How.XPATH,using="((//*[@role='region'])[2]//div//p[2])[1]")
			public static WebElement documentstatus;
			
			@FindBy(how = How.XPATH,using="((//*[@role='region'])[2]//div//p[2])[2]")
			public static WebElement documentrevison;
			
			@FindBy(how = How.XPATH,using="((//*[@role='region'])[2]//div//p[2])[3]")
			public static WebElement revisiondate;
			
			@FindBy(how = How.XPATH,using="((//*[@role='region'])[2]//div//p[2])[4]")
			public static WebElement authorizedBy;
			
			@FindBy(how = How.XPATH,using="((//*[@role='region'])[2]//div//p[2])[5]")
			public static WebElement referenceNumber;
			
			@FindBy(how = How.XPATH,using="(//*[@class='mat-expansion-panel-header-title'])[3]")
			public static WebElement storageLocation;
			
			@FindBy(how =How.XPATH,using="((//*[@role='region'])[3]//div//p[2])[1]")
			public static WebElement location;
			
			@FindBy(how =How.XPATH,using="((//*[@role='region'])[3]//div//p[2])[2]")
			public static WebElement locationbuilding;
			
			@FindBy(how =How.XPATH,using="((//*[@role='region'])[3]//div//p[2])[3]")
			public static WebElement buildingfloor;
			
			@FindBy(how =How.XPATH,using="((//*[@role='region'])[3]//div//p[2])[4]")
			public static WebElement documentrack;
					
			@FindBy(how =How.XPATH,using="(//div[@class='row'])[5]//div[1]//p[2]")
			public static WebElement documentShelf;
			
			@FindBy(how =How.XPATH,using="(//div[@class='row'])[5]//div[2]//p[2]")
			public static WebElement documentFileNumber;
			
			@FindBy(how =How.XPATH,using="(//div[@class='row'])[5]//div[3]//p[2]")
			public static WebElement documentComments;
			
			@FindBy(how=How.XPATH,using="(//tbody//td[2])[1]//span")
			public static WebElement documentNumberSelect;
			
			@FindBy(how=How.XPATH,using="//*[@class='k-grid-table']//tbody/tr[1]//td[5]")
			public static WebElement documentRevisiedOnDate;
			
			@FindBy(how=How.XPATH,using="//*[@id='grvStatusList']//table/tbody/tr/td[2]")
			public static List<WebElement> revisionSet;
			
			@FindBy(how=How.XPATH,using="//*[@id='grvStatusList']//table/tbody/tr/td[3]")
			public static List<WebElement> statusSet;
			
			@FindBy(how=How.XPATH,using="//*[@id='grvStatusList']//table/tbody/tr/td[4]")
			public static WebElement createdBySet;
			
			@FindBy(how=How.XPATH,using="//*[@id='grvStatusList']//table/tbody/tr/td[5]")
			public static List<WebElement> approvedBySet;
			
			@FindBy(how=How.XPATH,using="//*[@id='grvStatusList']//table/tbody/tr/td[7]")
			public static List<WebElement> revisionDateSet;
			
			@FindBy(how=How.XPATH, using="//*[@role='tab']/div/i")
			public static WebElement closeViewDoc;
			
			@FindBy(how=How.XPATH, using="(//tbody//td[4])[1]/span")
			public static WebElement revisionClick;
				
			@FindBy(how=How.XPATH, using="//*[@role='presentation']//tbody//tr[1]//td[8]")
			public static WebElement documentStatus;
			
			
			@FindBy(how=How.XPATH, using="(//*[@role='button'])[4]")
			public static WebElement fileLocationSection;
			
			@FindBy(how=How.XPATH, xpath="(//span[@class='mat-content']//i)[2]")
			public static WebElement editWindowAttachment;
			
			@FindBy(how=How.XPATH, xpath="//table//tr[1]//td[10]//i[6]")
			public static WebElement approve;
			
			@FindBy(how=How.XPATH, xpath="(//*[@class='fa fa-times-circle pull-right'])[2]")
			public static WebElement closewindow;
			
			@FindBy(how=How.XPATH, xpath="//*[@class='k-pager-info k-label']")
			public static By filterWaitUntil; 
			
			@FindBy(how = How.XPATH, using="//kendo-pager-info[@class='k-pager-info k-label']")
			public static By filterWaitUntil2; 
			
		}
