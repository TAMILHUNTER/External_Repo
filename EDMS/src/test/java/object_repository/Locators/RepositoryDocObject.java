package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RepositoryDocObject {

	@FindBy(how = How.CLASS_NAME, using = "Repository Document")
	public static WebElement RepositoryDocObject;

	@FindBy(how = How.XPATH, using = "//a[@class='modulemenu']")
	public static WebElement MenuRepo;

//	public @FindBy(xpath = "//a[@class='modulemenu']") static WebElement MenuRepo;

	@FindBy(how = How.XPATH, using = "//p[text()='Repository Documents']") //p[text()='Repository Documents']
	public static WebElement repositoryDocument;

	@FindBy(how = How.XPATH, using = "//i[@title='Create']")
	public static WebElement createbtn; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Discipline * '])")
	public static WebElement Discipline; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])")
	public static List<WebElement> OptionList; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[2]")
	public static WebElement Electrical; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Area * '])")
	public static WebElement Area; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement AreaList1; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='DWG / DOC * '])")
	public static WebElement Documenttype; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement DoctypeDC; // pk
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Structure / Package * '])")
	public static WebElement Structure; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement SubjectLT; // pk

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Print Size *'])")
	public static WebElement PrintSize; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[2]")
	public static WebElement PrintSizeA2; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='txtTitle'])")
	public static WebElement Title; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])[1]")
	public static WebElement Calendar; // pk

	@FindBy(how = How.XPATH, using = "(//input[@class='k-input'])[1]")
	public static WebElement Calendartype; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlStatus1'])")
	public static WebElement Status; // pk
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])")
	public static WebElement Status1; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlAuthorisedBy1'])")
	public static WebElement ApprovedForinfo; // pk

	@FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[11]")
	public static WebElement AppBy; // pk

	@FindBy(how = How.XPATH, using = "//mat-option[@title='162095 - Praveenkumar']")
	public static WebElement Praveentxt; // pk

	@FindBy(how = How.XPATH, using = "//mat-option[@title='162077 - Kathiresh Kumar']")
	public static WebElement Kathireshtxt; // pk

	@FindBy(how = How.XPATH, using = "//div[@class='mat-form-field-suffix ng-tns-c21-27 ng-star-inserted']")
	public static WebElement AppTxtClrPk; // pk

	@FindBy(how = How.XPATH, using = "//div[@class='mat-form-field-suffix ng-tns-c21-84 ng-star-inserted']")
	public static WebElement AppTxtClrKathiresh; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='txtRef'])")
	public static WebElement Ref; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='txtComments'])")
	public static WebElement cmnt; // pk

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-slide-toggle-thumb'])[4]")
	public static WebElement QRcode; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-content'])[4]")
	public static WebElement FileLocation; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlLocation1'])")
	public static WebElement Location; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement LocChennai; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlBuilding1'])")
	public static WebElement Building; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='Tower 1'])")
	public static WebElement BuildingTwr; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlFloor1'])")
	public static WebElement Floor; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])[1]")
	public static WebElement floor1; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlRack1'])")
	public static WebElement Rack; // pk

	@FindBy(how = How.XPATH, using = "(//span[text()='QA QC'])")
	public static WebElement RackQA; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='ddlShelf1'])")
	public static WebElement Shelf; // pk

	@FindBy(how = How.XPATH, using = "(//mat-option[@title='63 - 4'])")
	public static WebElement Shelf4; // pk

	@FindBy(how = How.XPATH, using = "(//input[@formcontrolname='txtFileNo'])")
	public static WebElement FileNo; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnsaveAllDocument'])")
	public static WebElement DocSave; // pk

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement TextOk; // pk

//	@FindBy(how = How.XPATH, using="//label[@for='fileDropRef']")
//	public static WebElement DocFileUpload; //pk

//	// Test Karthik
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Choose file'])[2]")
	public static WebElement DocFileUpload;

	@FindBy(how = How.XPATH, using = "(//i[@title='Attachment'])[1]")
	public static WebElement AttachTable; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' Approved '])")
	public static WebElement ApprovedTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' Rejected '])")
	public static WebElement RejectTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' For Action '])")
	public static WebElement ForActionTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' All '])")
	public static WebElement AllTab; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()=' In Progress '])")
	public static WebElement InprogressTab; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Filter']")
	public static WebElement FilterTab; // pk

	@FindBy(how = How.XPATH, using = "//i[@id='ibtSearch']")
	public static WebElement Search; // pk

	@FindBy(how = How.XPATH, using = "//button[@icon='file-excel']")
	public static WebElement ExportRepoExcel; // pk

	@FindBy(how = How.XPATH, using = "//select[@aria-label='items per page']")
	public static WebElement ShowNo; // pk

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

	@FindBy(how = How.XPATH, using = "//i[@title='Download Excel']")
	public static WebElement DownldExcel; // pk

	@FindBy(how = How.XPATH, using = "//i[@title='Upload Excel']")
	public static WebElement UploadExcel; // pk

	@FindBy(how = How.XPATH, using = "//span[@class='k-select']")
	public static WebElement Viewdays; // pk

	@FindBy(how = How.XPATH, using = "//i[@aria-label='Clear']")
	public static WebElement ProjectClr; // pk

	@FindBy(how = How.XPATH, using = "//span[text()=' Demo - EDMS Demo Project ']")
	public static WebElement DemoProject; // pk

	@FindBy(how = How.XPATH, using = "//span[text()=' Common - EDMS Common Project ']")
	public static WebElement CommonProjectSD; // pk

	@FindBy(how = How.XPATH, using = "//span[text()=' O21534 - Project Gandhi for JRS India Corporation Private Limited ']")
	public static WebElement GandhiProject; // pk
	
	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	public static WebElement InfoChangeYes; // pk

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-0']")
	public static WebElement ProjectName; // pk

	@FindBy(how = How.XPATH, using = "//button[text()='No']")
	public static WebElement InfoChangeNo; // pk

	@FindBy(how = How.XPATH, using = "//a[@title='Go to the last page']")
	public static WebElement NextPage; // pk

	@FindBy(how = How.XPATH, using = "//a[@title='Go to the first page']")
	public static WebElement FirstPage; // pk

	@FindBy(how = How.XPATH, using = "(//i[@id='ibtClose'])")
	public static WebElement CloseTab; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='View'])")
	public static WebElement DocView; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Share'])[1]")
	public static WebElement DocShare; // pk

	// Document Under Grid

	@FindBy(how = How.XPATH, using = "(//i[@title='Attachment'])[1]")
	public static WebElement DocAttachmntTable; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Mail'])[2]")
	public static WebElement TableMail; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Share'])[2]")
	public static WebElement TableShare; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Shared History'])[1]")
	public static WebElement TableHistory; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Edit'])[1]")
	public static WebElement TableEdit; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Delete'])[1]")
	public static WebElement TableDelete; // pk

	@FindBy(how = How.XPATH, using = "(//span[@class='no-wrap eip-link ng-star-inserted'])[1]")
	public static WebElement DocNo1; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Reject'])[1]")
	public static WebElement DocReject; // pk

	@FindBy(how = How.XPATH, using = "(//i[@title='Approve'])[1]")
	public static WebElement DocApprove; // pk

	@FindBy(how = How.XPATH, using = "(//span[@style='transform: rotate(0deg);'])[1]")
	public static WebElement DocRotateOn; // pk

	@FindBy(how = How.XPATH, using = "(//span[@style='transform: rotate(180deg);'])")
	public static WebElement DocRotateOff; // pk

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-times-circle ml-3 ng-star-inserted'])")
	public static WebElement DocClose; // pk

	@FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[2]")
	public static WebElement DocSelectAll; // pk

	@FindBy(how = How.XPATH, using = "(//i[@class='fa fa-home'])")
	public static WebElement HomePage; // pk

//	@FindBy(how = How.XPATH, using="(//mat-panel-title[@class='mat-expansion-panel-header-title'])[3]")
//	public static WebElement FileLocColumn; //pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnReset'])")
	public static WebElement ResetBTn; // pk

	@FindBy(how = How.XPATH, using = "(//button[@id='btnCancel'])")
	public static WebElement CancelBtn; // pk

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle pull-right']")
	public static WebElement FileUploadClose; // pk
	// =====================================================================================================================================================================\\
//	
//	@FindBy(how = How.XPATH, using="(//input[@type='checkbox'])[3]")
//	public static WebElement DocCheckboxClick; //pk
//	
//	@FindBy(how = How.XPATH, using="(//button[@id='btnReset'])")
//	public static WebElement ResetBTn; //pk
//	
//	
//	@FindBy(how = How.XPATH, using="(//button[@id='btnCancel'])")
//	public static WebElement CancelBtn; //pk
//	
//	
//	@FindBy(how = How.XPATH, using="//i[@class='fa fa-times-circle pull-right']")
//	public static WebElement FileUploadClose; //pk
//	

	// =============== Mail ============================================//
	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid0-checkbox0'])") // -- > Pk I'D
	public static WebElement DocSelectPk; // pk

	@FindBy(how = How.XPATH, using = "//*[@id='k-grid0-checkbox0']") // -- > Pk I'D
	public static WebElement DocSelectKK; // pk

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

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid5-checkbox0'])")
	public static WebElement WFDocNoPk; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid6-checkbox2'])")
	public static WebElement WFDocNoKK; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid3-checkbox0'])")
	public static WebElement DocNoAttachMail; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])")
	public static WebElement MailAttachSubmit; // pk

	@FindBy(how = How.XPATH, using = "//div[text()='New Message']")
	public static WebElement PageHead; // pk

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

	@FindBy(how = How.XPATH, using = "//div[text()=' File Upload Wizard ']")
	public static WebElement attachmentWindowTitle; // pk

	@FindBy(how = How.XPATH, using = "//button[@class='fa fa-upload btn-upload btn btn-success ng-star-inserted']")
	public static WebElement uploadDocument; // pk

	@FindBy(how = How.XPATH, using = "//button[@class='fa fa-remove btn-upload btn btn-danger eip-ml-5 ng-star-inserted']")
	public static WebElement uploadDocumentReject;

	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-times cursor-pointer ng-star-inserted']")
	public static WebElement fileTypeClr; // pk

	@FindBy(how = How.XPATH, using = "//span[text()='Support']")
	public static WebElement UploadFileType; // pk
	
	@FindBy(how = How.XPATH, using = "//p[@class='toastMessageLength']")
	public static WebElement ErrorDocSelect; // pk
	
	@FindBy(how = How.XPATH, using = "//*/eipmessagebox/div/div/p")
	public static WebElement SuccessPopupDocOk; // pk
	
	@FindBy(how = How.XPATH, using = "//h1")
	public static WebElement WarngMessage; // pk
	
	

}
