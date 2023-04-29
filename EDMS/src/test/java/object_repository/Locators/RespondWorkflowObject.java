package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RespondWorkflowObject {
	
	@FindBy(how = How.CLASS_NAME, using="Respond Workflow")
	public static WebElement RespondWorkflow;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Module Menu']")
	public static WebElement MenuEng; //pk
	
	@FindBy(how = How.XPATH, using = "//a[@title='Engineering Schedule']")
	public static WebElement EngineeringSchedu; //pk
	
	@FindBy(how = How.XPATH, using="//p[text()='Respond Workflow']")
	public static WebElement RespondWorkflowMenu; //pk
	
	@FindBy(how = How.XPATH, using="(//span[@class='no-wrap eip-link ng-star-inserted'])[1]")
	public static WebElement DocOpen_View; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='k-grid0-checkbox0'])")
	public static WebElement Doc_CheckBox1; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle ml-3 ng-star-inserted'])")
	public static WebElement SelectDoc_Close; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@title='Action'])[1]")
	public static WebElement WFAction; //pk
	
	@FindBy(how = How.XPATH, using="//*[@id='mat-input-1']")
	public static WebElement WfPage_GeneralComment; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='mat-input-1'])")
	public static WebElement GFCWfPage_GeneralComment; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@title='Attachment'])")
	public static WebElement WFAttach; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@title='Expand'])")
	public static WebElement DocExpand; //pk
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Choose file'])")
	public static WebElement DocFileUpload; //pk
	
	@FindBy(how = How.XPATH, using="(//div[text()='Not Applicable'])")
	public static WebElement TenderQty_NotApplicable; //pk
	
	@FindBy(how = How.XPATH, using="(//span[@title='clear'])[2]")
	public static WebElement fileTypeClr; //pk
	
	@FindBy(how = How.XPATH, using="(//span[text()='Support'])")
	public static WebElement UploadFileType; //pk
	
	@FindBy(how = How.XPATH, using="(//button[@class='fa fa-upload btn-upload btn btn-success ng-star-inserted'])")
	public static WebElement uploadDocument; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle pull-right'])")
	public static WebElement FileUploadClose; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@placeholder='Document Category*'])")
	public static WebElement DocCategory; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()='Approved']")
	public static WebElement DocApproved_category; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()='For Action']")
	public static WebElement DocForAction_Category; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@title='Approve'])")
	public static WebElement WfApprove; //pk
	
	@FindBy(how = How.XPATH, using="(//button[text()='Yes'])")
	public static WebElement CnfrmYes; //pk
			
	@FindBy(how = How.XPATH, using="//button[text()= 'Reassign & Proceed']")
	public static WebElement WF_ReassignProceed; //pk
	
	@FindBy(how = How.XPATH, using="//div[text()= ' Workflow Action ']")
	public static WebElement Wf_head; //pk
	
	@FindBy(how = How.XPATH, using="//i[@class= 'fa fa-times-circle pull-right']")
	public static WebElement WF_SubmitPopup_Close; //pk
	
	@FindBy(how = How.XPATH, using="//i[@title= 'Revert']")
	public static WebElement WF_Revert; //pk
	
	
	//========================== New Transmittal Creation  ===========================//
	
	
	@FindBy(how = How.XPATH, using="//input[@id= 'transmittalTemplate']")
	public static WebElement New_Transmittal; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()= 'C4 Transmittal']")
	public static WebElement TransmittalTemplate_C4; //pk
	
	@FindBy(how = How.XPATH, using="//input[@placeholder= 'Discipline * ']")
	public static WebElement Descipline_TT; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()= 'A - Architecture']")
	public static WebElement Architecture_Desipline_TT; //pk
	
	@FindBy(how = How.XPATH, using="//input[@placeholder= 'From Org * ']")
	public static WebElement FromOrg_TT; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()= 'O1 - Organization 1']")
	public static WebElement FromOrg_Org1_TT; //pk
	
	@FindBy(how = How.XPATH, using="//input[@placeholder= 'To Org * ']")
	public static WebElement ToOrg_TT; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()= 'LNT - LNT Construction']")
	public static WebElement ToOrg_LNT_TT; //pk
	
	@FindBy(how = How.XPATH, using="//mat-slide-toggle[@id= 'mat-slide-toggle-1']")
	public static WebElement Confidential_Toggle_TT; //pk
	
	@FindBy(how = How.XPATH, using="//input[@id= 'mat-chip-list-input-0']")
	public static WebElement Transmittal_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class= 'mat-checkbox-inner-container'])[8]")
	public static WebElement CC_Praveen_TT; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()= ' PALANISAMY A ']")
	public static WebElement CC_Palani_TT; //pk
	
	@FindBy(how = How.XPATH, using="//div[text()= 'Yes']")
	public static WebElement Transmittal_ResponseYES_TT; //pk
	
	@FindBy(how = How.XPATH, using="//div[text()= 'No']")
	public static WebElement Transmittal_ResponseNO_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@type= 'number'])[2]")
	public static WebElement CC_GroupBy_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//button[@id= 'btnGroupView'])")
	public static WebElement CC_GroupBy_Distribution_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-pencil icon-size mr-2'])[1]")
	public static WebElement CC_GroupBy_EDIT_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//span[@class='fa fa-times cursor-pointer ng-star-inserted'])[10]")
	public static WebElement Category_Clear_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='categoryDist'])")
	public static WebElement Category_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//span[text()='Good For Construction'])")
	public static WebElement Category_GdForConstruction_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@placeholder='Type *'])")
	public static WebElement Type_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container'])[1]")
	public static WebElement Type_SelectAll_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//textarea[@id='mat-input-24'])")
	public static WebElement Remarks_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-save icon-size mr-2'])[1]")
	public static WebElement Save_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@placeholder='Customer Reference Number'])")
	public static WebElement CustomerRefNum_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle icon-size mr-2'])[1]")
	public static WebElement Cancel_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-pencil icon-size mr-2'])[2]")
	public static WebElement AttachDoc_Edit_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='mat-input-41'])")
	public static WebElement AttachDoc_Qty_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='category *'])")
	public static WebElement AttachDoc_Category_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//span[text()='For Information'])")
	public static WebElement AttachDoc_Category_FI_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@placeholder='Type *'])")
	public static WebElement AttachDoc_Type_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='typeDist'])")
	public static WebElement AttachDoc_TypeBox_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container'])[2]")
	public static WebElement AttachDoc_TypeBox2_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container'])[4]")
	public static WebElement AttachDoc_TypeBox3_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container'])[3]")
	public static WebElement AttachDoc_TypeBox4_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//textarea[@id='attachmentRemarks'])")
	public static WebElement Attach_Remarks_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@mattooltip='Bulk Upload'])")
	public static WebElement AttachDoc_BulkUpload_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@mattooltip='Bulk Save'])")
	public static WebElement AttachDoc_BulkSave_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@mattooltip='Save'])[2]")
	public static WebElement AttachDoc_Save_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@mattooltip='Browse'])")
	public static WebElement AttachDoc_Attach_TT; //pk	
	
	@FindBy(how = How.XPATH, using="(//button[@id='btnsaveAllDocument'])")
	public static WebElement PreviewSubmit_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//span[@class='fa fa-times cursor-pointer ng-star-inserted'])[10]")
	public static WebElement Attach_CategoryClr_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-paperclip fs-16 eip-mr-5'])")
	public static WebElement Transmittal_AttachView_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@id='btnDownload'])[2]")
	public static WebElement Transmittal_AttachDownload_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle pull-right'])[2]")
	public static WebElement Transmittal_AttachClose_TT; //pk	
	
	
	@FindBy(how = How.XPATH, using="(//button[text()='Send'])")
	public static WebElement Transmittal_Send_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//button[text()='Ok'])")
	public static WebElement Transmittal_PopupOK_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//th[text()='Name'])")
	public static WebElement Name_TT_Preview; //pk
	
//	@FindBy(how = How.XPATH, using="(//i[@id='btnDownload'])[2]")
//	public static WebElement Transmittal_AttachDownload_TT; //pk
//	
//	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle pull-right'])[2]")
//	public static WebElement Transmittal_AttachClose_TT; //pk	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	










	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-tab-label-content'])[3]")
	public static WebElement PendingActionTab; //pk
	
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-tab-label-content'])[4]")
	public static WebElement ActionTakenTab; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-tab-label-content'])[5]")
	public static WebElement AllTab; //pk
	
	@FindBy(how = How.XPATH, using="//i[@title='Filter']")
	public static WebElement FilterTab; //pk
	
	
	@FindBy(how = How.XPATH, using="//i[@id='ibtSearch']")
	public static WebElement Search; //pk
	
	@FindBy(how = How.XPATH, using="//button[@icon='file-excel']")
	public static WebElement ExcelUpload; //pk
	
	@FindBy(how = How.XPATH, using="//select[@aria-label='items per page']")
	public static WebElement ShowNo; //pk
	
	@FindBy(how = How.XPATH, using="//i[@title='Expand']")
	public static WebElement PageExpand; //pk

	
	@FindBy(how = How.XPATH, using="//i[@title='Collapse']")
	public static WebElement PageCollapse; //pk
	
	
	@FindBy(how = How.XPATH, using="//input[@id='DisciplineID']")
	public static WebElement DisciplineID; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()='C - Civil']")
	public static WebElement CivilDescipline; //pk

	
	@FindBy(how = How.XPATH, using="//input[@id='StructureId']")
	public static WebElement StructureId; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()='ET 1 - Electric Tower 1']")
	public static WebElement ElectricTwr; //pk
	
	@FindBy(how = How.XPATH, using="//button[text()='Search']")
	public static WebElement Searchbtn; //pk

	
	@FindBy(how = How.XPATH, using="//div[text()='Delegate Documents']")
	public static WebElement DelegateDoc; //pk
	
	@FindBy(how = How.XPATH, using="//div[text()='All Workflow']")
	public static WebElement AllWorkflow; //pk
	
	@FindBy(how = How.XPATH, using="//span[@class='k-select']")
	public static WebElement Viewdays; //pk

	//===================== > DTN Preparation===============================//
	
	@FindBy(how = How.XPATH, using="//i[@title='DTN Preparation']")
	public static WebElement DtnPreparation; //pk
	
	
	@FindBy(how = How.XPATH, using="//input[@id='wfList']")
	public static WebElement WorkflowDtn; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()='GFC']")
	public static WebElement GfcDtn; //pk

	
	@FindBy(how = How.XPATH, using="//input[@id='disciplinelist']")
	public static WebElement DisciplineDtn; //pk

	
	@FindBy(how = How.XPATH, using="//span[text()='Civil']")
	public static WebElement DesciplineCivilDtn; //pk
	
	@FindBy(how = How.XPATH, using="//input[@id='stageList']")
	public static WebElement StageDtn; //pk

	
	@FindBy(how = How.XPATH, using="//span[text()='Good For Construction']")
	public static WebElement StageGfcDtn; //pk
	
	@FindBy(how = How.XPATH, using="//input[@id='taskList']")
	public static WebElement TaskDtn; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()='Ready to Release']")
	public static WebElement TaskRtoR; //pk

	
	@FindBy(how = How.XPATH, using="(//button[text()='Search'])[2]")
	public static WebElement SearchDtn; //pk
	
	@FindBy(how = How.XPATH, using="(//button[text()='Ok'])")
	public static WebElement DtnWarningOk; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@id='ibtClose'])")
	public static WebElement CloseDtn; //pk

	
	@FindBy(how = How.XPATH, using="(//i[@title='DTN Release'])")
	public static WebElement DtnRelease; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='dtnList'])")
	public static WebElement TransmittalDtn; //pk
	
	@FindBy(how = How.XPATH, using="(//span[@class='mat-option-text'])[1]")
	public static WebElement TransmitalnumDtn; //pk

	
	@FindBy(how = How.XPATH, using="(//button[@id='btnGenerateDTN'])")
	public static WebElement GenerateDtn; //pk
	
	//=====================
	
	@FindBy(how = How.XPATH, using="(//input[@class='k-checkbox ng-star-inserted'])[2]"+"(//input[@class='k-checkbox ng-star-inserted'])[4]"+"(//input[@class='k-checkbox ng-star-inserted'])[7]")
	public static WebElement DocNoSelect; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@title='Bulk Action'])")
	public static WebElement DocBulkAction; //pk

	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle ml-3 ng-star-inserted'])[1]")
	public static WebElement ResWorkflowClose; //pk
	
	
	
	
	
	
	
	
	
	
	
	
	//=============     ENGINEERING SCHEDULE OBJECTS    ===========================
	
	@FindBy(how = How.XPATH, using = "(//div[@class='mat-tab-label-content'])[7]")
	public static WebElement Alltab; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Create'])")
	public static WebElement Create; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Discipline * '])")
	public static WebElement Descipline; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='32 - C - Civil'])")
	public static WebElement Civil; // pk

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

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Document Type * '])")
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

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])")
	public static WebElement WfGfcCalenderSelect; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])")
	public static WebElement GfcCalender; // pk
	
	@FindBy(how = How.XPATH, using = "//p[text()='Previous Step Action Detail']")
	public static WebElement just_movecursor; // pk

	// ==================== C4 Template Workflow ======================//

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

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-form-field-suffix ng-tns-c19-33 ng-star-inserted'])")
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

	@FindBy(how = How.XPATH, using = "(//i[@title='Workflow History'])[1]")
	public static WebElement DocWorkflowHistoryTable; // pk

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle pull-right']")
	public static WebElement CloseDoc; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Reject'])[1]")
	public static WebElement SelectDocReject; // pk

	// ================Common Control====================//

	@FindBy(how = How.XPATH, using = "//button[@icon='file-excel']")
	public static WebElement ExportRepoExcel; // pk

//	@FindBy(how = How.XPATH, using = "//i[@title='Filter']")
//	public static WebElement FilterTab; // pk
//
//	@FindBy(how = How.XPATH, using = "//i[@id='ibtSearch']")
//	public static WebElement Search; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Grid Settings']")
	public static WebElement GridSettingsTab; // pk

//	@FindBy(how = How.XPATH, using = "//select[@aria-label='items per page']")
//	public static WebElement ShowNo; // pk

//	@FindBy(how = How.XPATH, using = "//i[@title='Expand']")
//	public static WebElement PageExpand; // pk
//
//	@FindBy(how = How.XPATH, using = "//i[@title='Collapse']")
//	public static WebElement PageCollapse; // pk

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

//	@FindBy(how = How.XPATH, using = "//span[@class='k-icon k-i-arrow-s']")
//	public static WebElement Viewdays; // pk

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times']")
	public static WebElement ProjectClr; // pk

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

//	@FindBy(how = How.XPATH, using = "(//button[text()='Yes'])")
//	public static WebElement CnfrmYes; // pk

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

	// ============================ Workflow Initiated  =================================\\

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
	
	//===================== GFC Workflow ================================//
	
	
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
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
