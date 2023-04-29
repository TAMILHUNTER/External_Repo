package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuObjects {

	//Main Menu
//	@FindBy(how = How.CLASS_NAME, using="modulemenu")
//	public static WebElement moduleMenu;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Module Menu']")
	public static WebElement moduleMenu;
	
	@FindBy(how = How.XPATH, using="//p[text()='Repository Documents']")
	public static WebElement repositoryDocument;
	
	@FindBy(how = How.XPATH, using="//i[@title='Create']")
	public static WebElement create; //pk
	
	@FindBy(how = How.XPATH, using="//a[@title='Schedule Documents']")//pk
	public static WebElement engineeringSchedule;
	
	@FindBy(how = How.XPATH, using="//p[text()='Respond Workflow']")
	public static WebElement respondWorkflow;
	
	@FindBy(how = How.XPATH, using="(//a[@title='Communication'])")
	public static WebElement communication;
	
	@FindBy(how = How.XPATH, using="//p[text()='Transmittal']")
	public static WebElement transmittal;
	
	@FindBy(how = How.XPATH, using="//p[text()='Project Configuration']")
	public static WebElement projectConfiguration;
	
	@FindBy(how = How.XPATH, using="//p[text()='Master']")
	public static WebElement master;
	
	@FindBy(how = How.XPATH, using="//p[text()='Dashboard & Reports']")
	public static WebElement dashboardReports;
	
	//SubMenu
	@FindBy(how = How.XPATH, using="//a[@title='Schedule Definition']//p[1]")
	public static WebElement scheduleDefintion;
	
	@FindBy(how = How.XPATH, using="//p[text()='Change Control Note']")
	public static WebElement changeControlNote;
	
	@FindBy(how = How.XPATH, using="//a[@title='Standard Drawing']//p[1]")
	public static WebElement Standard_Drawings; //pk
	
	@FindBy(how = How.XPATH, using="//a[@title='Document Workflow Details']//p[1]")
	public static WebElement Doc_WorkflowSts; //pk
	
	
	@FindBy(how = How.XPATH, using="//a[@title='Organization Link']")
	public static WebElement organizationLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Project Members Link']")
	public static WebElement projectMembersLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Role Features Link']")
	public static WebElement roleFeaturesLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Role Members Link']")
	public static WebElement roleMembersLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Role Menu Link']")
	public static WebElement roleMenuLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Element Link']")
	public static WebElement elementLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Element Details Link']")
	public static WebElement elementDetailsLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Member Discipline Details Link']")
	public static WebElement memberDisciplineDetails;
	
	@FindBy(how = How.XPATH, using="//a[@title='Workflow Template']//i[1]")
	public static WebElement workflowTemplate;
	
	@FindBy(how = How.XPATH, using="//a[@title='Checklist']//i[1]")
	public static WebElement checklist;
	
	@FindBy(how = How.XPATH, using="//a[@title='Delegate Access']//i[1]")
	public static WebElement delegateAccess;
	
	@FindBy(how = How.XPATH, using="//a[@title='Document Revision Link']//i[1]")
	public static WebElement documentRevisionLink;
	
	@FindBy(how = How.XPATH, using="//a[@title='Project Tender Quantity Link']//i[1]")
	public static WebElement projectTenderQuantity;
	
	
	//Menu Headings
	@FindBy(how = How.XPATH, using="//span[text()=' REPOSITORY DOCUMENTS ']")
	public static  WebElement rEPOSITORYDOCUMENT;

	@FindBy(how = How.XPATH, using="//span[text()=' SCHEDULE DOCUMENTS ']")
	public static WebElement sCHEDULEDOCUMENT;
	
	

	@FindBy(how = How.XPATH, using="//span[text()=' RESPOND WORKFLOW ']")
	public static WebElement rESPONDWORKFLOW;
	
	@FindBy(how = How.XPATH, using="//span[text()=' COMMUNICATION ']")
	public static WebElement cOMMUNICATION;
	
	@FindBy(how = How.XPATH, using="//span[text()=' TRANSMITTAL ']")
	public static WebElement tRANSMITTAL;
	
	@FindBy(how = How.XPATH, using="//span[text()=' SCHEDULE DEFINITION ']")
	public static WebElement sCHEDULEDEFINITION;
	
	@FindBy(how = How.XPATH, using="//span[text()=' CHANGE CONTROL NOTE ']")
	public static WebElement cHANGECONTROLNOTE;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ORGANIZATION LINK ']")
	public static WebElement oRGANIZATIONLINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' PROJECT MEMBER LINK ']")
	public static WebElement pROJECTMEMBERLINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ROLE FEATURES LINK ']")
	public static WebElement rOLEFEATURESLINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ROLE MEMBERS LINK ']")
	public static WebElement rOLEMEMBERSLINK;

	@FindBy(how = How.XPATH, using="//span[text()=' ROLE MENU LINK ']")
	public static WebElement rOLEMENULINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ELEMENT LINK ']")
	public static WebElement eLEMENTLINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ELEMENT DETAILS LINK ']")
	public static WebElement eLEMENTDETAILSLINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' MEMBER DISCIPLINE DETAILS LINK ']")
	public static WebElement mEMBERDISCIPLINEDETAILS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' WORKFLOW TEMPLATE ']")
	public static WebElement wORKFLOWTEMPLATE;
	
	@FindBy(how = How.XPATH, using="//span[text()=' CHECK LIST ']")
	public static WebElement cHECKLIST;
	
	@FindBy(how = How.XPATH, using="//span[text()=' DELEGATE ACCESS ']")
	public static WebElement dELEGATEACCESS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' DOCUMENT REVISION LINK ']")
	public static WebElement dOCUMENTREVISIONLINK;
	
	@FindBy(how = How.XPATH, using="//span[text()=' PROJECT TENDER QUANTITY LINK ']")
	public static WebElement pROJECTTENDERQUANTITY;
	
	@FindBy(how = How.XPATH, using="//span[text()=' PROJECTS ']")
	public static WebElement pROJECTS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ORGANIZATION - BUSINESS GROUP ']")
	public static WebElement oRGANIZATIONBUSINESS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' MEMBERS ']")
	public static WebElement mEMBERS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ELEMENTS ']")
	public static WebElement eLEMENTS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' ELEMENT DETAILS ']")
	public static WebElement eLEMENTDETAILS;
	
	@FindBy(how = How.XPATH, using="//span[text()=' TRANSMITTAL TEMPLATE ']")
	public static WebElement tRANSMITTALTEMPLATE;
	
	@FindBy(how = How.XPATH, using="//span[text()=' APPLICATION MENU ']")
	public static WebElement aPPLICATIONMENU;
	
	@FindBy(how = How.XPATH, using="//span[text()=' TENDER QUANTITY ']")
	public static WebElement tENDERQUANTITY;
	
	
}
