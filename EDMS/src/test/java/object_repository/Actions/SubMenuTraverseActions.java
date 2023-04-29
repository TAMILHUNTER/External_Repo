package object_repository.Actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import object_repository.Locators.MenuObjects;
import stepdefinition.Webdriver;

public class SubMenuTraverseActions {
	
	WebDriverWait wait=new WebDriverWait(Webdriver.driver, 10000);
	
	public SubMenuTraverseActions() {
		PageFactory.initElements(Webdriver.driver, MenuObjects.class);
	}
	
	public void engrSchedule() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.engineeringSchedule));
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(MenuObjects.engineeringSchedule).build().perform();
		
	}
	
	public void projectConig() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.projectConfiguration));
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(MenuObjects.projectConfiguration).build().perform();
		
	}
	
	public void master() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.master));
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(MenuObjects.master).build().perform();
		
	}
	
	public void dashboard() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.dashboardReports));
		WebElement ele = MenuObjects.dashboardReports;
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(ele).build().perform();
		
	}
	
	public void scheduleDefinition() {
		
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.scheduleDefintion));
		System.out.println("Action page before scheduleDefintion");
		MenuObjects.scheduleDefintion.click();
		System.out.println("Action page after scheduleDefintion");
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.sCHEDULEDEFINITION, "SCHEDULE DEFINITION"));
		assertEquals("SCHEDULE DEFINITION", MenuObjects.sCHEDULEDEFINITION.getText());
		System.out.println("Schedule Definition Click Successufully ");
	}

	public void changeControlNote() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.changeControlNote));
		MenuObjects.changeControlNote.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.cHANGECONTROLNOTE, "CHANGE CONTROL NOTE"));
		assertEquals("CHANGE CONTROL NOTE", MenuObjects.cHANGECONTROLNOTE.getText());
		System.out.println("Change Control Note");
		
	}
	
	public void organizationLink() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.organizationLink));
		MenuObjects.organizationLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.oRGANIZATIONLINK, "ORGANIZATION LINK"));
		assertEquals("ORGANIZATION LINK", MenuObjects.oRGANIZATIONLINK.getText());
		System.out.println("Organization Link");
	}
	
	public void projectMembersLink() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.projectMembersLink));
		MenuObjects.projectMembersLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.pROJECTMEMBERLINK, "PROJECT MEMBER LINK"));
		assertEquals("PROJECT MEMBER LINK", MenuObjects.pROJECTMEMBERLINK.getText());
	}
	
	public void roleFeature() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.roleFeaturesLink));
		MenuObjects.roleFeaturesLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.rOLEFEATURESLINK, "ROLE FEATURES LINK"));
		assertEquals("ROLE FEATURES LINK", MenuObjects.rOLEFEATURESLINK.getText());
		System.out.println("Assertion Completed");
	}
	
	public void roleMembersLink() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.roleMembersLink));
		MenuObjects.roleMembersLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.rOLEMEMBERSLINK, "ROLE MEMBERS LINK"));
		assertEquals("ROLE MEMBERS LINK", MenuObjects.rOLEMEMBERSLINK.getText());
	}
	
	public void roleMenuLink() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.roleMenuLink));
		MenuObjects.roleMenuLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.rOLEMENULINK, "ROLE MENU LINK"));
		assertEquals("ROLE MENU LINK", MenuObjects.rOLEMENULINK.getText());
	}
	
	public void elementLink() {
		
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.elementLink));
		MenuObjects.elementLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.eLEMENTLINK, "ELEMENT LINK"));
		assertEquals("ELEMENT LINK", MenuObjects.eLEMENTLINK.getText());
		System.out.println("Element Completed");
	}
	
	public void elementDetailsLink() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.elementDetailsLink));
		MenuObjects.elementDetailsLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.eLEMENTDETAILSLINK, "ELEMENT DETAILS LINK"));
		assertEquals("ELEMENT DETAILS LINK", MenuObjects.eLEMENTDETAILSLINK.getText());
	}
	
	public void memberDiscipline() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.memberDisciplineDetails));
		MenuObjects.memberDisciplineDetails.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.mEMBERDISCIPLINEDETAILS, "MEMBER DISCIPLINE DETAILS LINK"));
		assertEquals("MEMBER DISCIPLINE DETAILS LINK", MenuObjects.mEMBERDISCIPLINEDETAILS.getText());
	}
	
	public void workFlowTemplate() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.workflowTemplate));
		MenuObjects.workflowTemplate.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.wORKFLOWTEMPLATE, "WORKFLOW TEMPLATE"));
		assertEquals("WORKFLOW TEMPLATE", MenuObjects.wORKFLOWTEMPLATE.getText());
	}
	
	public void checkLists() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.checklist));
		MenuObjects.checklist.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.cHECKLIST, "CHECK LIST"));
		assertEquals("CHECK LIST", MenuObjects.cHECKLIST.getText());
	}
	
	public void delegateAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.delegateAccess));
		MenuObjects.delegateAccess.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.dELEGATEACCESS, "DELEGATE ACCESS"));
		assertEquals("DELEGATE ACCESS", MenuObjects.dELEGATEACCESS.getText());
	}
	
	public void documentRevisionLink() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.documentRevisionLink));
		MenuObjects.documentRevisionLink.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.dOCUMENTREVISIONLINK, "DOCUMENT REVISION LINK"));
		assertEquals("DOCUMENT REVISION LINK", MenuObjects.dOCUMENTREVISIONLINK.getText());
	}

	public void projectTenderQuantity() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.projectTenderQuantity));
		MenuObjects.projectTenderQuantity.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.pROJECTTENDERQUANTITY, "PROJECT TENDER QUANTITY LINK"));
		assertEquals("PROJECT TENDER QUANTITY LINK", MenuObjects.pROJECTTENDERQUANTITY.getText());
	}
}
