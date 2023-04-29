package object_repository.Actions;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.Locators.MenuObjects;
import stepdefinition.Webdriver;

public class MenuTraverseActions {
	WebDriverWait wait=new WebDriverWait(Webdriver.driver, 100);
	public static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	public MenuTraverseActions() {
		PageFactory.initElements(Webdriver.driver, MenuObjects.class);
		
	}
	
	public void mainMenu() throws InterruptedException {	
		Actions actions = new Actions(Webdriver.driver);
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.moduleMenu));
		actions.moveToElement(MenuObjects.moduleMenu);
		actions.build().perform();
		System.out.println("Home page Main Menu is enabled");
		Thread.sleep(1000);
//		MenuObjects.moduleMenu.click();
//		MenuObjects.moduleMenu.click();
	}
	public void  repositoryDocument() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.repositoryDocument));
		MenuObjects.repositoryDocument.click();
//		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.rEPOSITORYDOCUMENT, " REPOSITORY DOCUMENTS "));
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.rEPOSITORYDOCUMENT));
//		assertEquals(" REPOSITORY DOCUMENTS ", MenuObjects.rEPOSITORYDOCUMENT.getText());
		System.out.println("Main Menu REPOSITORY DOCUMENTS is enabled");
	}
	public   void  engineeringSchedule() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.engineeringSchedule));
		MenuObjects.engineeringSchedule.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.sCHEDULEDOCUMENT, "SCHEDULE DOCUMENTS"));
		assertEquals("SCHEDULE DOCUMENTS", MenuObjects.sCHEDULEDOCUMENT.getText());
		System.out.println("Main Menu SCHEDULE DOCUMENTS is enabled");
	}
	public   void  respondWorkflow() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.respondWorkflow));
		MenuObjects.respondWorkflow.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.rESPONDWORKFLOW, "RESPOND WORKFLOW"));
		assertEquals("RESPOND WORKFLOW", MenuObjects.rESPONDWORKFLOW.getText());
		System.out.println("Main Menu RESPOND WORKFLOW is enabled");
	}
	public   void  communication() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.communication));
		MenuObjects.communication.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.cOMMUNICATION, "COMMUNICATION"));
		assertEquals("COMMUNICATION", MenuObjects.cOMMUNICATION.getText());
		System.out.println("Main Menu COMMUNICATION is enabled");
		}
	public   void  transmittal() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.transmittal));
		MenuObjects.transmittal.click();
		wait.until(ExpectedConditions.textToBePresentInElement(MenuObjects.tRANSMITTAL, "TRANSMITTAL"));
		assertEquals("TRANSMITTAL", MenuObjects.tRANSMITTAL.getText());
		System.out.println("Main Menu TRANSMITTAL is enabled");
	}
	public   void  projectConfiguration() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.projectConfiguration));
		
		try {
			MenuObjects.projectConfiguration.click();	
		} catch (Exception e) {
			js.executeScript("arguments[0].click();",MenuObjects.projectConfiguration);
		}
		
		System.out.println("Main Menu projectConfiguration is enabled");
	}
	public   void  master() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.master));
		try {
			MenuObjects.master.click();	
		} catch (Exception e) {
			js.executeScript("arguments[0].click();",MenuObjects.master);
		}
		System.out.println("Main Menu master is enabled");
	}
	public   void  dashboardReports() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.dashboardReports));
		try {
			MenuObjects.dashboardReports.click();	
		} catch (Exception e) {
			js.executeScript("arguments[0].click();",MenuObjects.dashboardReports);
		}
		
		System.out.println("Main Menu dashboardReports is enabled");
		
	}

}
