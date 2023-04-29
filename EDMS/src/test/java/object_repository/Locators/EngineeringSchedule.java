package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EngineeringSchedule {

	@FindBy(how = How.CLASS_NAME, using = "Engineering Schedule")
	public static WebElement EngineeringSchedule;

//	@FindBy(how = How.CLASS_NAME, using="modulemenu")
//	public static WebElement MenuEng;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Module Menu']")
	public static WebElement MenuEng; //pk

	@FindBy(how = How.XPATH, using = "//a[@title='Schedule Documents']")
	public static WebElement EngineeringSchedu; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()=' SCHEDULE DOCUMENTS ']")
	public static WebElement sCHEDULEDOCUMENT;

	@FindBy(how = How.XPATH, using = "//div[@class='mat-tab-label-content']")
	public static WebElement Alltab; // pk 

//	@FindBy(how = How.XPATH, using = "//*[@id='mat-tab-label-1-5']/div")
//	public static WebElement Alltab; // pk 
	
	@FindBy(how = How.XPATH, using = "(//i[@title='Create'])")
	public static WebElement Create; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Discipline * '])")
	public static WebElement Descipline; // pk
	
	@FindBy(how = How.XPATH, using = "//h1")
	public static WebElement WarngMessage; // pk
	
	@FindBy(how = How.XPATH, using = "//div[@class='mat-dialog-content eip-messagebox-content mat-dialog-content']/p")
	public static WebElement ErrorMessage; // pk
	
	@FindBy(how = How.XPATH, using = "//p[@class='toastMessageLength']")
	public static WebElement ErrorDocSelect; // pk

	@FindBy(how = How.XPATH, using = "//h1[@class='toast-title mat-dialog-title']")
	public static WebElement ErrorDocSelectHeadline; // pk
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])")
	public static List<WebElement> OptionList; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='A - Architecture'])")
	public static WebElement Architecture; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Structure / Package * '])")
	public static WebElement Structure; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='3866 - ET 1 - Electric Tower 1'])")
	public static WebElement Electrictwr; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='01 - ENTRANCE'])")
	public static WebElement EntranceStructure; // pk

	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[4]")
	public static WebElement categoryclr; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='233 - STN - Station'])")
	public static WebElement categorystn; // pk

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Area * ']")
	public static WebElement Area; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='236 - 03 - Surat'])")
	public static WebElement AreaSurat; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='04 - Bharuch'])")
	public static WebElement AreaBharuch; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='DWG / DOC * '])")
	public static WebElement DocumentDWG; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='DOC - DOC'])")
	public static WebElement DocDoC; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Doc Type * '])")
	public static WebElement DocType; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='239 - DC - Detailed Design Document'])[1]")
	public static WebElement DoctypeDC; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Print Size *'])")
	public static WebElement PrintSize; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='44 - A1'])")
	public static WebElement PrintSizeA1; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='title'])")
	public static WebElement Title; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='revCategory1'])")
	public static WebElement Revcategory; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='2 - Major'])")
	public static WebElement RevMajor; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='enggManhours'])")
	public static WebElement EnggManHrs; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='draftingManHours'])")
	public static WebElement DraftManHrs; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='weightage'])")
	public static WebElement Weightage; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Approval By *'])")
	public static WebElement ApproBy; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='METROS BU'])")
	public static WebElement MetrosBu; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlWorkflow1'])")
	public static WebElement Workflow; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='28 - GFC'])")
	public static WebElement WorkflowGFC; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public static WebElement Wf1_CalenderSelect; // pk
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[2]")
	public static WebElement Wf2_CalenderSelect; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])")
	public static WebElement GfcCalender; // pk

	// ==================== C4 Template Workflow ======================//
	@FindBy(how = How.XPATH, using="//span[text()='PipeLine']")
	public static WebElement PipeLineWF; //pk

	@FindBy(how = How.XPATH, using = "(//span[text()='C4 Workflow Template'])")
	public static WebElement WorkflowC4template; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])[1]")
	public static WebElement C4templateCalender_SD; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])[2]")
	public static WebElement C4templateCalender_DD; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])[3]")
	public static WebElement C4templateCalender_GFC; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-frame'])[1]")
	public static WebElement C4templateCalenderSelect_SD; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-frame'])[2]")
	public static WebElement C4templateCalenderSelect_DD; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-frame'])[3]")
	public static WebElement C4templateCalenderSelect_GFC; // pk

	// =================== ****** ===================//

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='comments'])")
	public static WebElement cmntWF; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-slide-toggle-thumb-container'])[2]")
	public static WebElement DocRevToggle; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-slide-toggle-thumb-container'])[1]")
	public static WebElement DocProToggle; // pk

	@FindBy(how = How.XPATH, using = "(//mat-panel-title[text()=' Document Revision '])")
	public static WebElement DocColumn; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='dciStatus1'])")
	public static WebElement DocStatus; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='For Information Only'])[2]")
	public static WebElement StatusForInfoOnly; // pk

	@FindBy(how = How.XPATH, using = "//span[text()='Rejected']")
	public static WebElement DocStsRejected; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='50 - For Approval'])")
	public static WebElement DocStsForApp; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='revision'])")
	public static WebElement DocRevision; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='authorisedBy1'])")
	public static WebElement AuthorisedBy; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Praveenkumar'])")
	public static WebElement AuthorisePk; // pk

	@FindBy(how = How.XPATH, using = "//div[@class='mat-form-field-suffix ng-tns-c19-33 ng-star-inserted']")
	public static WebElement AuthoriseClr; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Kathiresh Kumar'])[2]")
	public static WebElement AuthoriseKK; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-slide-toggle-bar'])[3]")
	public static WebElement QRCodeActive; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-11'])")
	public static WebElement Ref; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-12'])")
	public static WebElement NoOfSheets; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnSave'])")
	public static WebElement SaveBtn; // pk

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary btn-sm cursor-pointer']")
	public static WebElement DocSaveOk; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnReset'])")
	public static WebElement ResetBtn; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnUpdate'])")
	public static WebElement UpdateBtn; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnCancel'])")
	public static WebElement CancelBtn; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='View'])[2]")
	public static WebElement DocView; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='View'])[1]")
	public static WebElement PageDocView; // pk

	// ===============================================================================================>
	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement WarningOk; // pk

	@FindBy(how = How.XPATH, using = "//i[@id='ibtClose']")
	public static WebElement CreateClose; // pk

	// ===============================================================================================>

	@FindBy(how = How.XPATH, using = "(//i[@title='Approve'])[2]")
	public static WebElement DocApprove_InForAction; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Approve'])[1]")
	public static WebElement DocApproveTab; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Reject'])[1]")
	public static WebElement DocRejectTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' For Action '])")
	public static WebElement ForActionTab; // pk

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle ml-3 ng-star-inserted']")
	public static WebElement Select_DocClose; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' In Progress '])")
	public static WebElement InProgressTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' Completed '])")
	public static WebElement CompletedTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' Rejected '])")
	public static WebElement RejectedTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' Approved '])")
	public static WebElement ApprovedTab; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid0-checkbox0'])")
	public static WebElement Doc1Select_Tab; // pk

//	@FindBy(how = How.XPATH, using="(//input[@id='k-grid2-checkbox0'])")
//	public static WebElement Doc1Select_ApprTab; //pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Workflow History'])")
	public static WebElement DocWorkflowHistoryTable; // pk

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle pull-right']")
	public static WebElement HistoryCloseDoc; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Reject'])[1]")
	public static WebElement SelectDocReject; // pk

	// ================Common Control====================//

	@FindBy(how = How.XPATH, using = "//button[@icon='file-excel']")
	public static WebElement ExportRepoExcel; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Filter']")
	public static WebElement FilterTab; // pk

	@FindBy(how = How.XPATH, using = "//i[@id='ibtSearch']")
	public static WebElement Search; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Grid Settings']")
	public static WebElement GridSettingsTab; // pk

	@FindBy(how = How.XPATH, using = "//select[@aria-label='items per page']")
	public static WebElement ShowNo; // pk
	
	@FindBy(how = How.XPATH, using = "//option[@class='ng-star-inserted']")
	public static WebElement ItemNo; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Expand']")
	public static WebElement PageExpand; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Collapse']")
	public static WebElement PageCollapse; // pk

	@FindBy(how = How.XPATH, using = "//div[text()='My Doc.']")
	public static WebElement MyDoc; // pk

	@FindBy(how = How.XPATH, using = "//div[text()='My Org Doc.']")
	public static WebElement MyOrgDoc; // pk

	@FindBy(how = How.XPATH, using = "//div[text()='All Doc.']")
	public static WebElement AllDoc; // pk

	@FindBy(how = How.XPATH, using = "//div[@class='mat-slide-toggle-bar']")
	public static WebElement LatestRev; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Download DCI Excel Template']")
	public static WebElement DownldExcel; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Upload Excel']")
	public static WebElement UploadExcel; // pk

	@FindBy(how = How.XPATH, using = "//span[@class='k-icon k-i-arrow-s']")
	public static WebElement Viewdays; // pk

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times']")
	public static WebElement ProjectClr; // pk
	
	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-0']")
	public static WebElement ProjectName; // pk
	
	@FindBy(how = How.XPATH, using = "//span[text()=' O21534 - Project Gandhi for JRS India Corporation Private Limited ']")
	public static WebElement GandhiProject; // pk

	@FindBy(how = How.XPATH, using = "//span[text()=' O20361 - MAHSR C-4 ']")
	public static WebElement MahsrProject; // pk

	@FindBy(how = How.XPATH, using = "//span[text()=' LE160665 - LIC Investment Building at EM Bypass, Kolkata ']")
	public static WebElement LICProject; // pk

	@FindBy(how = How.XPATH, using = "//span[text()=' PTND01 - PTND Project ']")
	public static WebElement PTNDProject; // pk

	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	public static WebElement InfoChangeYes; // pk

	@FindBy(how = How.XPATH, using = "//button[text()='No']")
	public static WebElement InfoChangeNo; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Edit'])[1]")
	public static WebElement DocEdit_Tab; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnUpdate'])")
	public static WebElement Doc_Update; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Supersede'])[1]")
	public static WebElement DocSuperSede; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Yes'])")
	public static WebElement CnfrmYes; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='No'])")
	public static WebElement CnfrmNo; // pk

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-times-circle pull-right'])")
	public static WebElement DocAttach_Close; // pk

	@FindBy(how = How.XPATH, using = "//i[@id='settingiconID']")
	public static WebElement GridSettings; // pk

//	@FindBy(how = How.XPATH, using="(//input[@id='mat-slide-toggle-4-input'])")
//	public static WebElement LatestRev; //pk

//==================================Mail ==============================\\
	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid0-checkbox0'])") // -- > Pk I'D
	public static WebElement DocSelectPk; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid1-checkbox0'])") // -- > Pk I'D
	public static WebElement DocSelectKK; // pk

	@FindBy(how = How.XPATH, using = "(//td[@class='ng-star-inserted'])[1]") // -- > Pk I'D
	public static WebElement Doc1SelectKK; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Mail'])[1]")
	public static WebElement DocMail; // pk

	@FindBy(how = How.XPATH, using = "(//i[@id='ibtINDVCollapseAll'])")
	public static WebElement MailAttachFileMail; // pk

	@FindBy(how = How.XPATH, using = "(//p[@class='eip-pxy-10'])")
	public static WebElement DocSelectAttachMail; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()='Workflow Document'])")
	public static WebElement WorkflowDocMail; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()='Repository Document'])")
	public static WebElement RepositoryDocMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid5-checkbox1'])")
	public static WebElement WFDocNoPk; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid6-checkbox2'])")
	public static WebElement WFDocNoKK; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid3-checkbox0'])")
	public static WebElement DocNoAttachMail; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])")
	public static WebElement MailAttachSubmit; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Project Code * '])")
	public static WebElement ProjectCodeMail; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Demo - EDMS Demo Project'])")
	public static WebElement DemoProjectMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Discipline * '])")
	public static WebElement DisciplineMail; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='A - Architecture'])")
	public static WebElement DisciplineArchiMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='From Org * '])")
	public static WebElement FromOrgMail; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='LNT - LNT Construction'])")
	public static WebElement FromOrgLNTMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='To Org * '])")
	public static WebElement ToOrgMail; // pk

//	=========================

	@FindBy(how = How.XPATH, using = "(//span[text()='O2 - Organization 2'])")
	public static WebElement ToOrg2Mail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='txtMsgSerialNo'])")
	public static WebElement MsgSerialNoMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='txtSerialNo'])")
	public static WebElement SerialNoMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Mail Type*'])")
	public static WebElement MailType; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Letter'])")
	public static WebElement LetterMailType; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-slide-toggle-thumb-container'])[2]")
	public static WebElement ConfidentialToggleMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Message Group'])")
	public static WebElement MsgGroupMail; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Message Group Test'])")
	public static WebElement MsgGroupTestMail; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()='Yes'])")
	public static WebElement ResToggleYesMail; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()='No'])")
	public static WebElement ResToggleNoMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Subject'])")
	public static WebElement SubjectMail; // pk

	@FindBy(how = How.XPATH, using = "//kendo-toolbar[@role='toolbar']")
	public static WebElement DropDownCmnt; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='k-editor-content ng-star-inserted'])")
	public static WebElement CmntMail; // pk

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-trash'])[1]")
	public static WebElement DocDeleteInMail; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Send'])")
	public static WebElement MailSend; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Save as Draft'])")
	public static WebElement MailSaveDraft; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Attach Files'])")
	public static WebElement MailAttachFiles; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Email'])[1]")
	public static WebElement EmailDocTable; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Mail'])[1]")
	public static WebElement EMailPage; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Mail'])[2]")
	public static WebElement MailinEmail; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Transmittal'])")
	public static WebElement EmailTransmittal; // pk

	@FindBy(how = How.XPATH, using = "(//i[@id='ibtClose'])")
	public static WebElement EmailClose; // pk

	// ============================ Workflow Initiated =================================\\

	@FindBy(how = How.XPATH, using = "(//i[@title='Start Workflow'])[2]")
	public static WebElement Doc1StartWorkflow; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Start Workflow'])[1]")
	public static WebElement StartWorkflow; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-1'])")
	public static WebElement SDWorkflowpage1_SectionHead; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Kathiresh Kumar'])[2]")
	public static WebElement WorkflowInitiated_KK; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-3'])")
	public static WebElement SDWorkflowpage1_ISD; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-5'])")
	public static WebElement SDWorkflowpage1_Client; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-7'])")
	public static WebElement SDWorkflowpage1_Approver; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Praveenkumar'])")
	public static WebElement WorkflowInitiated_PK; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class=' fa fa-times pl-1 pr-1 cursor-pointer'])")
	public static WebElement Wkflow_Name_pobupclose; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-1'])")
	public static WebElement C4Workflowpage1_DraftingPerson; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-3'])")
	public static WebElement C4Workflowpage1_Checker; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-5'])")
	public static WebElement C4Workflowpage1_StationIncharge; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-7'])")
	public static WebElement C4Workflowpage1_SectionHead; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-9'])")
	public static WebElement C4Workflowpage1_DesignEngineer; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-11'])")
	public static WebElement C4Workflowpage1_ISD; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-13'])")
	public static WebElement C4Workflowpage1_Approver; // pk //SaveBtn & ResetBtn

	// ====================== ****** =======//

	@FindBy(how = How.XPATH, using = "(//button[@id='btnSave'])")
	public static WebElement workflow_save; // pk

	@FindBy(how = How.XPATH, using = "(//div[@style='margin-top:10%'])")
	public static WebElement StartWorkflowPage_Click; // pk // cnfrmyes & cnfrmNo

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-times-circle ml-3 ng-star-inserted'])")
	public static WebElement Docviewpage_Close; // pk

	@FindBy(how = How.XPATH, using = "//p[text()='Start Workflow']")
	public static WebElement WorkflowTab; // pk
//	
//	@FindBy(how = How.XPATH, using="(//span[text()='Transmittal'])")
//	public static WebElement EmailTransmittal; //pk
//	
//	@FindBy(how = How.XPATH, using="(//i[@id='ibtClose'])")
//	public static WebElement EmailClose; //pk

	// ========================= STANDARD DRAWINGS =============================\\

	@FindBy(how = How.XPATH, using = "//p[text()='Standard Drawing']")
	public static WebElement StandardDrawing; // pk

	@FindBy(how = How.XPATH, using = "//div[text()='Standard Drawing List']")
	public static WebElement StandardDrawing_Page; // pk

	@FindBy(how = How.XPATH, using = "//div[text()='Linked Document']")
	public static WebElement StandardDrawing_Linked; // pk

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Discipline']")
	public static WebElement SD_Discipline; // pk

	@FindBy(how = How.XPATH, using = "//span[text()='Civil']")
	public static WebElement SD_Discipline_Civil; // pk

	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[1]")
	public static WebElement SD_Discipline_Clear; // pk

	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[2]")
	public static WebElement SD_WF_Clear; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='SD WF'])")
	public static WebElement SD_Wkflow; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid0-checkbox0'])")
	public static WebElement DocSelect1_SD; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-seek-e'])[1]")
	public static WebElement SD_GFLastPage; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid0-checkbox1866'])")
	public static WebElement DocSelect_Last_SD; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Add'])")
	public static WebElement SD_Doc_Add; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='icons-container'])[1]")
	public static WebElement SD_Doc_Filter; // pk

	@FindBy(how = How.XPATH, using = "(//input[@class='k-textbox ng-pristine ng-valid ng-touched'])")
	public static WebElement SD_Filter_PassDoc; // pk
	
	
	
	
	//======================== GFC Workflow ===========================//
	
	@FindBy(how = How.XPATH, using = "(//span[text()='External Change Control'])")
	public static WebElement GFC_WF_CCNTag1; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ccnType'])")
	public static WebElement GFC_WF_CCNType1; // pk
	
	@FindBy(how = How.XPATH, using = "(//input[@id='ccn'])")
	public static WebElement GFC_WF_CCNType2; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Restart Workflow'])")
	public static WebElement GFC_WF_CCNTag2; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='status0'])")
	public static WebElement GFC_WF_CCN_DocStatus; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='49 - Approved as Noted'])")
	public static WebElement GFC_WF_CCN_StatusAprrovedN; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='size0'])")
	public static WebElement GFC_WF_CCN_Size; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='A2'])")
	public static WebElement GFC_WF_CCN_SizeA2; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='category0'])")
	public static WebElement GFC_WF_CCN_category; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Good For Construction(GFC)'])")
	public static WebElement GFC_WF_CCN_categoryGFC; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])")
	public static WebElement GFC_WF_CCNCalendar; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-9'])[1]")
	public static WebElement GFC_WF_CCN_DrafManHr; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-10'])")
	public static WebElement GFC_WF_CCN_DesignManHr; // pk

	@FindBy(how = How.XPATH, using = "//button[text()='Save']")
	public static WebElement GFC_WF_CCN_Save; // pk
	
	
	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-11'])")
	public static WebElement GFCWorkflowpage_DesignEngineer; // pk
	
	@FindBy(how = How.XPATH, using = "(//input[@id='mat-input-13'])")
	public static WebElement GFCWorkflowpage_Approver; // pk
	
	//=========================== Cando Calendar =======================\\
	
	@FindBy(how = How.XPATH, using="//span[@title='Toggle calendar']//span[1]")
    public  static WebElement Datepicker_select_calender;
                    
    @FindBy(how = How.XPATH, using="//kendo-calendar-header[@class='k-calendar-header']//span[1]")
    public  static WebElement Datepicker_select_calender_header;
                
    @FindBy(how = How.XPATH, using="//li[@data-date-index='0']")
    public  static WebElement Datepicker_select_year;
    
    @FindBy(how = How.XPATH, using="//li[@data-date-index]")
    public  static List<WebElement> Datepicker_year;
    
    @FindBy(how = How.XPATH, using="(//td[@data-cell-index]//span)")
    public  static List<WebElement> Datepicker_select_Month;

   @FindBy(how = How.XPATH, using="(//td[@data-cell-index]//span)")
    public  static List<WebElement> Datepicker_select_Date;
//******************************************************************************** //input[@type='text'] (//div[@class='mat-form-field-infix']//input)
   
   @FindBy(how = How.XPATH, using = "//input[@type='text']")
	public static WebElement InputGetText; // pk
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
