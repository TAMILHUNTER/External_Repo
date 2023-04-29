package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransmittalObjects {
	
	
	@FindBy(how = How.CLASS_NAME, using="Transmittal")
	public static WebElement Transmittal;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Module Menu']")
	public static WebElement MenuEng; //pk
	
	@FindBy(how = How.XPATH, using = "//a[@title='Transmittal']")
	public static WebElement Transmittal_Menu; //pk
	
//	@FindBy(how = How.XPATH, using="//p[text()='Respond Workflow']")
//	public static WebElement RespondWorkflowMenu; //pk
	
	//========================== New Transmittal Creation  ===========================//
	
	@FindBy(how = How.XPATH, using="//i[@title='Create']")
	public static WebElement Transmittal_Create; //pk
	
//	@FindBy(how = How.XPATH, using="//p[text()='Respond Workflow']")
//	public static WebElement RespondWorkflowMenu; //pk
	
	@FindBy(how = How.XPATH, using="//input[@id= 'transmittalTemplate']")
	public static WebElement New_Transmittal; //pk
	
	@FindBy(how = How.XPATH, using="//span[text()= 'C4 Transmittal']")
	public static WebElement TransmittalTemplate_C4; //pk
	
	
	/*****/
	@FindBy(how = How.XPATH, using = "(//i[@id='ibtINDVCollapseAll'])")
	public static WebElement MailAttachFileMail; // pk

	@FindBy(how = How.XPATH, using = "(//p[@class='eip-pxy-10'])")
	public static WebElement DocSelectAttachMail; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()='Workflow Document'])")
	public static WebElement WorkflowDocMail; // pk

	@FindBy(how = How.XPATH, using = "(//div[text()='Repository Document'])")
	public static WebElement RepositoryDocMail; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid2-checkbox1'])")
	public static WebElement WFDocNoPk; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid2-checkbox0'])")
	public static WebElement WFDocNoKK; // pk

	@FindBy(how = How.XPATH, using = "(//input[@id='k-grid3-checkbox0'])")
	public static WebElement DocNoAttachMail; // pk

	@FindBy(how = How.XPATH, using = "(//button[text()='Submit'])")
	public static WebElement MailAttachSubmit; // pk
	/*************/
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
	
	@FindBy(how = How.XPATH, using="//span[text()=' Kathiresh Kumar ']")
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
	
	@FindBy(how = How.XPATH, using="(//span[@class='fa fa-times cursor-pointer ng-star-inserted'])[9]")
	public static WebElement Category_Clear_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='categoryDist'])")
	public static WebElement Category_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//span[text()='Good For Construction'])")
	public static WebElement Category_GdForConstruction_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@placeholder='Type *'])")
	public static WebElement Type_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//div[@class='mat-checkbox-inner-container'])[1]")
	public static WebElement Type_SelectAll_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//textarea[@id='mat-input-20'])")
	public static WebElement Remarks_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-save icon-size mr-2'])[1]")
	public static WebElement Save_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle icon-size mr-2'])[1]")
	public static WebElement Cancel_CC_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-pencil icon-size mr-2'])[2]")
	public static WebElement AttachDoc_Edit_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='mat-input-21'])")
	public static WebElement AttachDoc_Qty_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//input[@id='category *'])")
	public static WebElement AttachDoc_Category_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//span[text()='For Information'])")
	public static WebElement AttachDoc_Category_FI_TT; //pk
	
	@FindBy(how = How.XPATH, using="(//eipmultiselectautocomplete[@watermarktext='Type *'])")
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
	
	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Choose file'])")
	public static WebElement DocFileUpload;
	
//	@FindBy(how = How.XPATH, using="//label[text()='Browse local file(s)']")
//	public static WebElement DocFileUpload; //pk
	
	@FindBy(how = How.XPATH, using="(//div[text()='Not Applicable'])")
	public static WebElement TenderQty_NotApplicable; //pk
	
	@FindBy(how = How.XPATH, using="(//span[@title='clear'])[10]")
	public static WebElement fileTypeClr; //pk
	
	@FindBy(how = How.XPATH, using="(//span[text()='Support'])")
	public static WebElement UploadFileType; //pk
	
	@FindBy(how = How.XPATH, using="(//button[@class='fa fa-upload btn-upload btn btn-success ng-star-inserted'])")
	public static WebElement uploadDocument; //pk
	
	@FindBy(how = How.XPATH, using="(//i[@class='fa fa-times-circle pull-right'])[2]")
	public static WebElement FileUploadClose; //pk
}
