package stepdefinition;

import static org.junit.Assert.assertTrue;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Locators.RespondWorkflowObject;

public class RespondWorkflow {

		static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10000);
		static String fileuploadpath = System.getProperty("user.dir")+"\\src\\main\\upload";
		static String fileName = "\\QA_testing.xlsx";
		static boolean status;
		static Robot robot;
		static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;

		public RespondWorkflow() {
			PageFactory.initElements(Webdriver.driver, RespondWorkflowObject.class);
		}

		@Then("^as a user i should able to click main menu in home page$")
		public void as_a_user_i_should_able_to_click_main_menu_in_home_page() throws Throwable {
			Thread.sleep(2000);
			Actions actions = new Actions(Webdriver.driver);
			System.out.println("In-Moved");
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.MenuEng));
			actions.moveToElement(RespondWorkflowObject.MenuEng);
			System.out.println("Before click");
			actions.build().perform();
			System.out.println("Home page Main Menu is enabled");
		}

		@Then("^user should able to Click Respond Workflow in Main Menu$")
		public void user_should_able_to_Click_Respond_Workflow_in_Main_Menu() throws Throwable {
			status = RespondWorkflowObject.RespondWorkflowMenu.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.RespondWorkflowMenu));
			Reporter.addScenarioLog("Respond Workflow Object page is enabled");
			RespondWorkflowObject.RespondWorkflowMenu.click();
			System.out.println("Respond Workflow Object page is enabled");
		}

		@Then("^as a user i should able to Select Doc$")
		public void as_a_user_i_should_able_to_Select_Doc() throws Throwable {
			Webdriver.driver.navigate().refresh();
			status = RespondWorkflowObject.Doc_CheckBox1.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc_CheckBox1));
			Reporter.addScenarioLog("RespondWorkflowObject page Doc_CheckBox1 is enabled");
			RespondWorkflowObject.Doc_CheckBox1.click();
			System.out.println("RespondWorkflowObject page Doc_CheckBox1 is enabled");
		}

		@Then("^user should able to click and open the doc$")
		public void user_should_able_to_click_and_open_the_doc() throws Throwable {
			status = RespondWorkflowObject.DocOpen_View.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocOpen_View));
			Reporter.addScenarioLog("RespondWorkflowObject page DocOpen_View is enabled");
			Thread.sleep(1000);
			RespondWorkflowObject.DocOpen_View.click();
			System.out.println("RespondWorkflowObject page DocOpen_View is enabled");
		}

		@Then("^user should able to click Selected Doc Close$")
		public void user_should_able_click_Selected_Doc_Close() throws Throwable {
			status = RespondWorkflowObject.SelectDoc_Close.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.SelectDoc_Close));
			Reporter.addScenarioLog("RespondWorkflow page SelectDoc_Close button is enabled");
			RespondWorkflowObject.SelectDoc_Close.click();
			System.out.println("RespondWorkflow page SelectDoc_Close button is enabled");
		}
		
		@Then("^user should able to click WFAction$")
		public static void user_should_able_to_click_WFAction() {
//			wait.until(ExpectedConditions.visibilityOfAllElements(RespondWorkflowObject.WFAction));
			Webdriver.driver.navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc_CheckBox1));
			RespondWorkflowObject.Doc_CheckBox1.click();
			status = RespondWorkflowObject.WFAction.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WFAction));
			Reporter.addScenarioLog("RespondWorkflow page WFAction button is enabled");
			RespondWorkflowObject.WFAction.click();
			System.out.println("RespondWorkflow page WFAction button is enabled");
		}
			
	@Then("^user should able to Click Respond Workflow C4WfPage GeneralComment$")
	public void user_should_able_to_Click_Respond_Workflow_WfPage_GeneralComment() throws Throwable {
		status = RespondWorkflowObject.WfPage_GeneralComment.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfPage_GeneralComment));
		Reporter.addScenarioLog("Respond Workflow Action page WfPage_GeneralComment is enabled");
		RespondWorkflowObject.WfPage_GeneralComment.sendKeys(ConfigFileReader.getComments());
		System.out.println("Respond Workflow Action page WfPage_GeneralComment is enabled :" + ConfigFileReader.getComments());
	}

	@Then("^as a user i should able to Click WFAttach$")
	public void as_a_user_i_should_able_to_Click_WFAttach() throws Throwable {
		status = RespondWorkflowObject.WFAttach.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WFAttach));
		Reporter.addScenarioLog("RespondWorkflow Action page WFAttach is enabled");
		RespondWorkflowObject.WFAttach.click();
		System.out.println("RespondWorkflow Action page WFAttach is enabled");
	}

	@Then("^user should able to click BrowseFile Upload in Attach$")
	public void user_should_able_to_click_BrowseFile_Upload_in_Attach() throws Throwable {
		Thread.sleep(4000);
		status = RespondWorkflowObject.DocFileUpload.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocFileUpload));
//		RespondWorkflowObject.DocFileUpload.click();
//		Thread.sleep(3000);
//		String file = fileuploadpath+fileName;
////		fileuploadpath=ConfigFileReader.getDocFileUpload();
////		 StringSelection stringSelection = new StringSelection(System.getProperty("user.dir")+fileuploadpath);
//		 StringSelection stringSelection = new StringSelection(file);
//		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		    clipboard.setContents(stringSelection, null);
//		    String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);
//		    System.out.println("String from Clipboard:" + actualCopedText);
//		    robot =new Robot();
//		    robot.keyPress(KeyEvent.VK_CONTROL);
//		    robot.keyPress(KeyEvent.VK_V); 
//		    robot.keyRelease(KeyEvent.VK_V);
//		    robot.keyRelease(KeyEvent.VK_CONTROL);
//		    robot.keyPress(KeyEvent.VK_ENTER);
//		    robot.keyRelease(KeyEvent.VK_ENTER);
//		    robot.delay(200);

System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'block')",RespondWorkflowObject.DocFileUpload);
		RespondWorkflowObject.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')",RespondWorkflowObject.DocFileUpload);
		    wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
		    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", RespondWorkflowObject.fileTypeClr);		
		    RespondWorkflowObject.UploadFileType.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
			RespondWorkflowObject.uploadDocument.click();	
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.FileUploadClose));
			RespondWorkflowObject.FileUploadClose.click();
		Reporter.addScenarioLog("RespondWorkflow Action page BrowseFile is enabled");
		Thread.sleep(1000);
		System.out.println("RespondWorkflow Action page File Uploaded Successfully");
	}

	@Then("^user should able to click TenderQty NotApplicable$")
	public void user_should_able_click_TenderQty_NotApplicable() throws Throwable {
		status = RespondWorkflowObject.TenderQty_NotApplicable.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.TenderQty_NotApplicable));
		Reporter.addScenarioLog("RespondWorkflow Action page TenderQty_NotApplicable button is enabled");
		RespondWorkflowObject.TenderQty_NotApplicable.click();
		System.out.println("RespondWorkflow Action page TenderQty_NotApplicable button is enabled");
	}		
			
	@Then("^user should able to Click Respond Workflow DocCategory$")
	public void user_should_able_to_Click_Respond_Workflow_DocCategory() throws Throwable {
		status = RespondWorkflowObject.DocCategory.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocCategory));
		Reporter.addScenarioLog("Respond Workflow Action page DocCategory is enabled");
		RespondWorkflowObject.DocCategory.click();
		System.out.println("Respond Workflow Action page DocCategory is enabled");
	}

	@Then("^as a user i should able to Select DocApproved in DocCategory$")
	public void as_a_user_i_should_able_to_Select_DocApproved_in_DocCategory() throws Throwable {
		status = RespondWorkflowObject.DocApproved_category.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocApproved_category));
		Reporter.addScenarioLog("RespondWorkflow Action page DocApproved in DocCategory is enabled");
		RespondWorkflowObject.DocApproved_category.click();
		System.out.println("RespondWorkflow Action page DocApproved in DocCategory is enabled");
	}

	@Then("^user should able to click WfApprove$")
	public void user_should_able_to_click_WfApprove() throws Throwable {
		status = RespondWorkflowObject.WfApprove.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfApprove));
		Reporter.addScenarioLog("RespondWorkflow Action page WfApprove is enabled");
		Thread.sleep(3000);
		RespondWorkflowObject.WfApprove.click();
		RespondWorkflowObject.WfApprove.click();
		System.out.println("RespondWorkflow Action page WfApprove is enabled");
	}

	@Then("^user should able to click CnfrmYes$")
	public void user_should_able_to_click_CnfrmYes() throws Throwable {
		status = RespondWorkflowObject.CnfrmYes.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		Reporter.addScenarioLog("RespondWorkflow Action page CnfrmYes button is enabled");
		RespondWorkflowObject.CnfrmYes.click();
		System.out.println("RespondWorkflow Action page CnfrmYes button is enabled");
	}
	
	@Then("^user should able to Click Engineering Schedule in Main Menu WF$")
	public void user_should_able_to_Click_Engineering_Schedule_in_Main_Menu_WF() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.EngineeringSchedu));
		Reporter.addScenarioLog("Engineering Schedule page is enabled");
		RespondWorkflowObject.EngineeringSchedu.click();
		status = RespondWorkflowObject.EngineeringSchedu.isEnabled();
		assertTrue(status);	
		System.out.println("Engineering Schedule page is enabled");
	} 
	@Then("^as a user i should able to click all tab WF$")
	public void as_a_user_i_should_able_to_click_all_tab_WF() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Alltab));
		Reporter.addScenarioLog("Engineering Schedule page Alltab is enabled");
		status = RespondWorkflowObject.Alltab.isEnabled();
		assertTrue(status);
		if (RespondWorkflowObject.Alltab.isEnabled()) {
			try {
				RespondWorkflowObject.Alltab.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].scrollIntoView();", RespondWorkflowObject.Alltab);
			}
			
		}
		System.out.println("Engineering Schedule page Alltab is enabled");
	}
	
	@Then("^user should able to click create icon WF$")
	public void user_should_able_to_click_create_icon_WF() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Create));
		Reporter.addScenarioLog("Engineering Schedule page Create button is enabled");
		RespondWorkflowObject.Create.click();
		status = RespondWorkflowObject.Create.isEnabled();
		assertTrue(status);
		System.out.println("Engineering Schedule page Create button is enabled");
	}
	
	@Then("^user should able to create Engineering Schedule Doc With C4 Template Workflow WF$")
	public void user_should_able_to_create_Engineering_Schedule_Doc_With_C4_Template_Workflow_WF() throws Throwable {
		RespondWorkflowObject.Descipline.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Descipline.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Civil.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Structure.click();
		Thread.sleep(3000);
		RespondWorkflowObject.EntranceStructure.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		RespondWorkflowObject.Area.click();
		Thread.sleep(2000);
		RespondWorkflowObject.AreaBharuch.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocumentDWG.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocDoC.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocType.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DoctypeDC.click();
		Thread.sleep(2000);
		RespondWorkflowObject.PrintSize.click();
		Thread.sleep(2000);
		RespondWorkflowObject.PrintSizeA1.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Title.click();
		RespondWorkflowObject.Title.sendKeys(ConfigFileReader.getTitle());
		Thread.sleep(2000);
		RespondWorkflowObject.Revcategory.click();
		RespondWorkflowObject.RevMajor.click();
		Thread.sleep(2000);
		RespondWorkflowObject.EnggManHrs.click();
		RespondWorkflowObject.EnggManHrs.sendKeys(ConfigFileReader.getEnggManHr());
		Thread.sleep(2000);
		RespondWorkflowObject.DraftManHrs.click();
		RespondWorkflowObject.DraftManHrs.sendKeys(ConfigFileReader.getDraftManHrs());
		Thread.sleep(2000);
		RespondWorkflowObject.Weightage.click();
		RespondWorkflowObject.Weightage.sendKeys(ConfigFileReader.getWeightage());
		Thread.sleep(2000);
		RespondWorkflowObject.ApproBy.click();
		Thread.sleep(2000);
		RespondWorkflowObject.MetrosBu.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Workflow.click();
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowC4template.click();
		Thread.sleep(3000);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(RespondWorkflowObject.C4templateCalenderSelect_SD).click().build().perform();
//		RespondWorkflowObject.C4templateCalenderSelect_SD.click();
//		Thread.sleep(2000);
		RespondWorkflowObject.C4templateCalender_SD.click();
		Thread.sleep(2000);
		RespondWorkflowObject.C4templateCalender_SD.click();
		Thread.sleep(3000);
		actions.moveToElement(RespondWorkflowObject.C4templateCalenderSelect_DD).click().build().perform();
		RespondWorkflowObject.C4templateCalender_DD.click();
		Thread.sleep(2000);
		RespondWorkflowObject.C4templateCalender_DD.click();
		Thread.sleep(2000);
		actions.moveToElement(RespondWorkflowObject.C4templateCalenderSelect_GFC).click().build().perform();
		Thread.sleep(2000);
		RespondWorkflowObject.C4templateCalender_GFC.click();
		Thread.sleep(3000);
		RespondWorkflowObject.C4templateCalender_GFC.click();
		Thread.sleep(2000);
		RespondWorkflowObject.cmntWF.click();
		RespondWorkflowObject.cmntWF.sendKeys(ConfigFileReader.getComments());
		Thread.sleep(2000);
		RespondWorkflowObject.DocColumn.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocColumn.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocRevToggle.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocStatus.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocStsForApp.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocRevision.click();
		Thread.sleep(2000);
		RespondWorkflowObject.AuthorisedBy.click();
		RespondWorkflowObject.AuthorisePk.click();
		Thread.sleep(2000);
		RespondWorkflowObject.AuthoriseClr.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		RespondWorkflowObject.AuthorisedBy.click();
		RespondWorkflowObject.AuthoriseKK.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Ref.click();
		RespondWorkflowObject.Ref.sendKeys(ConfigFileReader.getReference());
		Thread.sleep(2000);
		RespondWorkflowObject.NoOfSheets.click();
		RespondWorkflowObject.NoOfSheets.sendKeys(ConfigFileReader.getFileNo());
		Thread.sleep(2000);
		RespondWorkflowObject.DocStatus.click();
		Thread.sleep(2000);
		RespondWorkflowObject.SaveBtn.click();
		Thread.sleep(2000);
		status = RespondWorkflowObject.DocSaveOk.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocSaveOk));
		Reporter.addScenarioLog("Engineering Schedule page we can create Engineering Schedule Doc");
		System.out.println("Engineering Schedule page We can create Engineering Schedule Doc");

		RespondWorkflowObject.DocSaveOk.click();
		Thread.sleep(3000);

		// RespondWorkflowObject.DocApprove_InForAction.click();

	}
	
	
	//************************
	
	@Then("^user should able to create Engineering Schedule Doc With GFC Workflow WF$")
	public void user_should_able_to_create_Engineering_Schedule_Doc_With_GFC_Workflow_WF() throws Throwable {
		RespondWorkflowObject.Descipline.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Descipline.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Civil.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Structure.click();
		Thread.sleep(3000);
		RespondWorkflowObject.EntranceStructure.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		RespondWorkflowObject.Area.click();
		Thread.sleep(2000);
		RespondWorkflowObject.AreaBharuch.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocumentDWG.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocDoC.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocType.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DoctypeDC.click();
		Thread.sleep(2000);
		RespondWorkflowObject.PrintSize.click();
		Thread.sleep(2000);
		RespondWorkflowObject.PrintSizeA1.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Title.click();
		RespondWorkflowObject.Title.sendKeys(ConfigFileReader.getTitle());
		Thread.sleep(2000);
		RespondWorkflowObject.Revcategory.click();
		RespondWorkflowObject.RevMajor.click();
		Thread.sleep(2000);
		RespondWorkflowObject.EnggManHrs.click();
		RespondWorkflowObject.EnggManHrs.sendKeys(ConfigFileReader.getEnggManHr());
		Thread.sleep(2000);
		RespondWorkflowObject.DraftManHrs.click();
		RespondWorkflowObject.DraftManHrs.sendKeys(ConfigFileReader.getDraftManHrs());
		Thread.sleep(2000);
		RespondWorkflowObject.Weightage.click();
		RespondWorkflowObject.Weightage.sendKeys(ConfigFileReader.getWeightage());
		Thread.sleep(2000);
		RespondWorkflowObject.ApproBy.click();
		Thread.sleep(2000);
		RespondWorkflowObject.MetrosBu.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Workflow.click();
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowGFC.click();
		Thread.sleep(3000);
		Actions actions = new Actions(Webdriver.driver);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfGfcCalenderSelect));
		actions.moveToElement(RespondWorkflowObject.WfGfcCalenderSelect).click().build().perform();
//		RespondWorkflowObject.C4templateCalenderSelect_SD.click();
//		Thread.sleep(2000);
		RespondWorkflowObject.WfGfcCalenderSelect.click();
		Thread.sleep(2000);
		RespondWorkflowObject.WfGfcCalenderSelect.click();
		RespondWorkflowObject.cmntWF.click();
		RespondWorkflowObject.cmntWF.sendKeys(ConfigFileReader.getComments());
		Thread.sleep(2000);
		RespondWorkflowObject.DocColumn.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocColumn.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocRevToggle.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocStatus.click();
		Thread.sleep(2000);
		RespondWorkflowObject.DocStsForApp.click();
		Thread.sleep(2000);
//		RespondWorkflowObject.DocRevision.click();
//		Thread.sleep(2000);
		RespondWorkflowObject.AuthorisedBy.click();
		Thread.sleep(2000);
		RespondWorkflowObject.AuthorisePk.click();
		Thread.sleep(2000);
		RespondWorkflowObject.AuthoriseClr.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		RespondWorkflowObject.AuthorisedBy.click();
		RespondWorkflowObject.AuthoriseKK.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Ref.click();
		RespondWorkflowObject.Ref.sendKeys(ConfigFileReader.getReference());
		Thread.sleep(2000);
		RespondWorkflowObject.NoOfSheets.click();
		RespondWorkflowObject.NoOfSheets.sendKeys(ConfigFileReader.getFileNo());
		Thread.sleep(2000);
		RespondWorkflowObject.DocStatus.click();
		Thread.sleep(2000);
		RespondWorkflowObject.SaveBtn.click();
		Thread.sleep(2000);
		status = RespondWorkflowObject.DocSaveOk.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocSaveOk));
		Reporter.addScenarioLog("Engineering Schedule page we can create Engineering Schedule Doc");
		System.out.println("Engineering Schedule page We can create Engineering Schedule Doc");
		RespondWorkflowObject.DocSaveOk.click();
		Thread.sleep(3000);

		// RespondWorkflowObject.DocApprove_InForAction.click();

	}
	
	@Then("^user should able to Initiate GFC Workflow In WF page$")
	public void user_should_able_to_Initiate_GFC_Workflow() throws Throwable {
		Thread.sleep(3000);
		/*wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ForActionTab));
		RespondWorkflowObject.ForActionTab.click();
		status = RespondWorkflowObject.Doc1Select_Tab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		Reporter.addScenarioLog("Engineering Schedule Create page Doc1Select_Tab is enabled");
		System.out.println("Engineering Schedule Create page Doc1Select_Tab is enabled");
		RespondWorkflowObject.Doc1Select_Tab.click();
		status = RespondWorkflowObject.DocApprove_InForAction.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocApprove_InForAction));
		Reporter.addScenarioLog("Engineering Schedule Create page DocApprove_InForAction is enabled");
		System.out.println("Engineering Schedule Create page DocApprove_InForAction is enabled");
		RespondWorkflowObject.DocApprove_InForAction.click();
		status = RespondWorkflowObject.ApprovedTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ApprovedTab));
		Reporter.addScenarioLog("Engineering Schedule Create page ApprovedTab is enabled");
		System.out.println("Engineering Schedule Create page ApprovedTab is enabled");
		Thread.sleep(3000);
		RespondWorkflowObject.ApprovedTab.click();*/
		Webdriver.driver.navigate().refresh();
		status = RespondWorkflowObject.Doc1Select_Tab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		Reporter.addScenarioLog("Engineering Schedule Create page Doc1Select_Tab is enabled");
		System.out.println("Engineering Schedule Create page Doc1Select_Tab is enabled");
		RespondWorkflowObject.Doc1Select_Tab.click();
		status = RespondWorkflowObject.StartWorkflow.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.StartWorkflow));
		Reporter.addScenarioLog("Engineering Schedule Create page StartWorkflow as Workflow is enabled");
		System.out.println("Engineering Schedule Create page StartWorkflow as Workflow is enabled");
		RespondWorkflowObject.StartWorkflow.click();
		status = RespondWorkflowObject.CnfrmYes.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		Reporter.addScenarioLog("Engineering Schedule Create page CnfrmYes is enabled");
		System.out.println("Engineering Schedule Create page CnfrmYes is enabled");
		RespondWorkflowObject.CnfrmYes.click();
		status = RespondWorkflowObject.GFC_WF_CCNType1.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCNType1));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType1 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType1 is enabled");
		RespondWorkflowObject.GFC_WF_CCNType1.click();
		status = RespondWorkflowObject.GFC_WF_CCNTag1.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCNTag1));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag1 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag1 is enabled");
		RespondWorkflowObject.GFC_WF_CCNTag1.click();
		status = RespondWorkflowObject.GFC_WF_CCNType2.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCNType2));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType2 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType2 is enabled");
		RespondWorkflowObject.GFC_WF_CCNType2.click();
		status = RespondWorkflowObject.GFC_WF_CCNTag2.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCNTag2));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag2 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag2 is enabled");
		RespondWorkflowObject.GFC_WF_CCNTag2.click();
		status = RespondWorkflowObject.GFC_WF_CCN_DocStatus.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_DocStatus));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DocStatus is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DocStatus is enabled");
		RespondWorkflowObject.GFC_WF_CCN_DocStatus.click();
		status = RespondWorkflowObject.GFC_WF_CCN_StatusAprrovedN.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_StatusAprrovedN));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_StatusAprrovedN is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_StatusAprrovedN is enabled");
		RespondWorkflowObject.GFC_WF_CCN_StatusAprrovedN.click();
		status = RespondWorkflowObject.GFC_WF_CCN_Size.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_Size));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Size is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Size is enabled");
		RespondWorkflowObject.GFC_WF_CCN_Size.click();
		status = RespondWorkflowObject.GFC_WF_CCN_SizeA2.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_SizeA2));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_SizeA2 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_SizeA2 is enabled");
		RespondWorkflowObject.GFC_WF_CCN_SizeA2.click();
		status = RespondWorkflowObject.GFC_WF_CCN_category.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_category));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_category is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_category is enabled");
		RespondWorkflowObject.GFC_WF_CCN_category.click();
		status = RespondWorkflowObject.GFC_WF_CCN_categoryGFC.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_categoryGFC));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_categoryGFC is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_categoryGFC is enabled");
		RespondWorkflowObject.GFC_WF_CCN_categoryGFC.click();
//		status = RespondWorkflowObject.GFC_WF_CCNCalendar.isEnabled();
//		assertTrue(status);
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCNCalendar));
//		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNCalendar is enabled");
//		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNCalendar is enabled");
//		RespondWorkflowObject.GFC_WF_CCNCalendar.click();
		// Calendar
		Thread.sleep(2000);
		RespondWorkflowObject.Datepicker_select_calender.click();
		RespondWorkflowObject.Datepicker_select_calender_header.click();
		Actions actions2 = new Actions(Webdriver.driver);
		actions2.moveToElement(RespondWorkflowObject.Datepicker_select_year);
		actions2.perform();
		Thread.sleep(3000);
		Actions actions3 = new Actions(Webdriver.driver);
		actions3.moveToElement(RespondWorkflowObject.Datepicker_select_year);
		actions3.perform();
		Thread.sleep(3000);
		Actions actions4 = new Actions(Webdriver.driver);
		actions4.moveToElement(RespondWorkflowObject.Datepicker_select_year);
		actions4.perform();
		Thread.sleep(3000);
		Random rand = new Random();
//		int randomYear = rand.nextInt(RespondWorkflowObject.Datepicker_year.size());
//		System.out.println("Year selected : " + randomYear);
//		RespondWorkflowObject.Datepicker_year.get(randomYear).click();
		Thread.sleep(3000);
		int randommonth = rand.nextInt(RespondWorkflowObject.Datepicker_select_Month.size());
		System.out.println("Month selected : " + randommonth);
		Thread.sleep(2000);
		RespondWorkflowObject.Datepicker_select_Month.get(randommonth).click();
		Thread.sleep(2000);
		int randomDate = rand.nextInt(RespondWorkflowObject.Datepicker_select_Date.size());
		System.out.println("Date selected : " + randomDate);
		Thread.sleep(2000);
		RespondWorkflowObject.Datepicker_select_Date.get(randomDate).click();
		Thread.sleep(2000);
//	        System.out.println("Workman DOB Entered : "+RespondWorkflowObject.Personal_DOB.getAttribute("value"));
		//
		status = RespondWorkflowObject.GFC_WF_CCN_DrafManHr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_DrafManHr));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DrafManHr is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DrafManHr is enabled");
		RespondWorkflowObject.GFC_WF_CCN_DrafManHr.click();
		Thread.sleep(3000);
		RespondWorkflowObject.GFC_WF_CCN_DrafManHr.sendKeys("356.87561");
		status = RespondWorkflowObject.GFC_WF_CCN_DesignManHr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_DesignManHr));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DesignManHr is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DesignManHr is enabled");
		RespondWorkflowObject.GFC_WF_CCN_DesignManHr.click();
		Thread.sleep(3000);
		RespondWorkflowObject.GFC_WF_CCN_DesignManHr.sendKeys("456.9878941");
		status = RespondWorkflowObject.GFC_WF_CCN_Save.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFC_WF_CCN_Save));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Save is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Save is enabled");
		RespondWorkflowObject.GFC_WF_CCN_Save.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFCWorkflowpage_Approver));
		RespondWorkflowObject.GFCWorkflowpage_Approver.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AuthoriseKK));
		RespondWorkflowObject.AuthoriseKK.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFCWorkflowpage_DesignEngineer));
		RespondWorkflowObject.GFCWorkflowpage_DesignEngineer.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AuthoriseKK));
		RespondWorkflowObject.AuthoriseKK.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.SaveBtn));
		RespondWorkflowObject.SaveBtn.click();
		if (RespondWorkflowObject.SaveBtn.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.SaveBtn));
			try {
				RespondWorkflowObject.SaveBtn.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].scrollIntoView();", RespondWorkflowObject.SaveBtn);
			}
		}else {
			
			System.out.println("Save Successfully");
		}
		
		
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		RespondWorkflowObject.CnfrmYes.click();
		Thread.sleep(4000);
		}
	
	
	
	//*********************
	
	@Then("^as a user is should able to approve In ForAction Tab WF$")
	public void as_a_user_is_should_able_to_approve_In_ForAction_Tab_WF() throws Throwable {
		RespondWorkflowObject.ForActionTab.click();
		Thread.sleep(3000);
		RespondWorkflowObject.Doc1Select_Tab.click();
		Thread.sleep(3000);
		RespondWorkflowObject.DocApprove_InForAction.click();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RespondWorkflowObject.ApprovedTab));
		RespondWorkflowObject.ApprovedTab.click();
		System.out.println("Engineering Schedule page Approved document is enabled");
		Thread.sleep(3000);
		RespondWorkflowObject.Doc1Select_Tab.click();
		Thread.sleep(3000);
		RespondWorkflowObject.DocView.click();
		Thread.sleep(4000);
		RespondWorkflowObject.DocWorkflowHistoryTable.click();
		Thread.sleep(3000);
		RespondWorkflowObject.CloseDoc.click();
		Thread.sleep(2000);
		RespondWorkflowObject.Docviewpage_Close.click();
		Thread.sleep(2000);
		status = RespondWorkflowObject.ForActionTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ForActionTab));
		Reporter.addScenarioLog("Engineering Schedule page approve In ForAction Tab is enabled");
		System.out.println("Engineering Schedule page approved doc In Approved Tab is enabled");
	}
	
	@Then("^as a user is should able to click Approved Tab WF$")
	public void as_a_user_is_should_able_to_click_Approved_Tab_WF() throws Throwable {
		status = RespondWorkflowObject.ApprovedTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ApprovedTab));
		Reporter.addScenarioLog("Engineering Schedule page Approved Tab is enabled");
		System.out.println("Engineering Schedule page Approved Tab is enabled");
		RespondWorkflowObject.ApprovedTab.click();
	}
	
	
	// ============   StartWorkflow_SD_DraftingInprgoress  ================
	
	
	@Then("^as a user is should able to Initiate C4 Template Workflow WF$")
	public void as_a_user_is_should_able_to_Initiate_C4_Template_Workflow_WF() throws Throwable {
		Webdriver.driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		RespondWorkflowObject.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.StartWorkflow));
		RespondWorkflowObject.StartWorkflow.click();
		Thread.sleep(3000);
//		RespondWorkflowObject.InfoChangeYes.click();
//		Thread.sleep(1000);
		status = RespondWorkflowObject.WorkflowTab.isEnabled();
		RespondWorkflowObject.WorkflowTab.getText();
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WorkflowTab));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow action is enabled");
		System.out.println("Engineering Schedule page initiated Workflow Action is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_DraftingPerson));
		RespondWorkflowObject.C4Workflowpage1_DraftingPerson.click();
		status = RespondWorkflowObject.C4Workflowpage1_DraftingPerson.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_DraftingPerson));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_DraftingPerson is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_DraftingPerson is enabled");
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		Thread.sleep(1000);
		// RespondWorkflowObject.StartWorkflowPage_Click.click();
		Thread.sleep(2000);
		RespondWorkflowObject.C4Workflowpage1_Checker.click();
		status = RespondWorkflowObject.C4Workflowpage1_Checker.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_Checker));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_Checker is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_Checker is enabled");
		RespondWorkflowObject.C4Workflowpage1_Checker.getText();
//		System.out.println("Engineering Schedule page Approved document is enabled");
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		Thread.sleep(3000);
		// RespondWorkflowObject.StartWorkflowPage_Click.click();
		Thread.sleep(1000);
		RespondWorkflowObject.C4Workflowpage1_StationIncharge.click();
		status = RespondWorkflowObject.C4Workflowpage1_StationIncharge.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_StationIncharge));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_StationIncharge is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_StationIncharge is enabled");
		Thread.sleep(4000);
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		Thread.sleep(3000);
		// RespondWorkflowObject.StartWorkflowPage_Click.click();
		Thread.sleep(1000);
		RespondWorkflowObject.C4Workflowpage1_SectionHead.click();
		Thread.sleep(3000);
		status = RespondWorkflowObject.C4Workflowpage1_SectionHead.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_SectionHead));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_SectionHead is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_SectionHead is enabled");
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		RespondWorkflowObject.C4Workflowpage1_DesignEngineer.click();
		status = RespondWorkflowObject.C4Workflowpage1_DesignEngineer.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_DesignEngineer));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_DesignEngineer is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_DesignEngineer is enabled");
		RespondWorkflowObject.C4Workflowpage1_DesignEngineer.getText();
		System.out.println("Engineering Schedule page Approved document is enabled");
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		Thread.sleep(3000);
		// RespondWorkflowObject.StartWorkflowPage_Click.click();
		RespondWorkflowObject.C4Workflowpage1_Approver.click();
		status = RespondWorkflowObject.C4Workflowpage1_Approver.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_Approver is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_Approver is enabled");
		RespondWorkflowObject.WorkflowInitiated_PK.click();
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		Thread.sleep(1000);
		RespondWorkflowObject.C4Workflowpage1_ISD.click();
		status = RespondWorkflowObject.C4Workflowpage1_ISD.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_ISD is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_ISD is enabled");
		Thread.sleep(4000);
		RespondWorkflowObject.WorkflowInitiated_KK.click();
		Thread.sleep(3000);
		RespondWorkflowObject.WorkflowTab.getText();
		RespondWorkflowObject.WorkflowTab.click();
		Thread.sleep(1000);
		RespondWorkflowObject.workflow_save.click();
		Thread.sleep(1000);
		RespondWorkflowObject.CnfrmYes.click();
		Thread.sleep(4000);
//		RespondWorkflowObject.WF_ReassignProceed.click();
//		Thread.sleep(1000);
//		RespondWorkflowObject.Wf_head.getText();
//		RespondWorkflowObject.WF_SubmitPopup_Close.click();
//		status=RespondWorkflowObject.WorkflowInitiated_KK.isEnabled();
//		assertTrue(status);
//		Reporter.addScenarioLog("Engineering Schedule page approve In ForAction Tab is enabled");
//		System.out.println("Engineering Schedule page approved doc In Approved Tab is enabled");
		
	}	
	@Then("^as a user is should able to check workflow history WF$")
	public void as_a_user_is_should_able_to_check_workflow_history_WF() throws Throwable {
		Webdriver.driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		RespondWorkflowObject.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocWorkflowHistoryTable));
		RespondWorkflowObject.DocWorkflowHistoryTable.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CloseDoc));
		RespondWorkflowObject.CloseDoc.click();
	}
		

	
	//===================== Checking Inprogress SD Workflow ==================== //
	@Then("^as a user is should able to Checking Inprogress SD workflow Revert WF$")
	public void as_a_user_is_should_able_to_Checking_Inprogress_SD_workflow_Revert_WF() throws Throwable {
		System.out.println("Schema Design Checking Inprogress workflow Action");
		Webdriver.driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		RespondWorkflowObject.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ActionTakenTab));
		RespondWorkflowObject.WFAction.click();
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocCategory));
//		RespondWorkflowObject.DocCategory.click();
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocForAction_Category));
//		RespondWorkflowObject.DocForAction_Category.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfPage_GeneralComment));
		Thread.sleep(3000);
		RespondWorkflowObject.WfPage_GeneralComment.click();
		RespondWorkflowObject.WfPage_GeneralComment.sendKeys("Checking Inprogress SD Workflow Revert using Automation");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WF_Revert));
		RespondWorkflowObject.WF_Revert.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		RespondWorkflowObject.CnfrmYes.click();	
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ResWorkflowClose));
		RespondWorkflowObject.CloseDoc.click();
		System.out.println("Schema Design Checking Inprogress workflow Revert Action has been completed");
	}
		
	@Then("^as a user is should able to Drafting Inprogress SD workflow WF$")
	public void as_a_user_is_should_able_to_Drafting_Inprogress_SD_WF() throws Throwable {
		System.out.println("Schema Design Drafting Inprogress workflow Action");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		RespondWorkflowObject.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocForAction_Category));
		RespondWorkflowObject.WFAction.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocCategory));
		RespondWorkflowObject.DocCategory.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocApproved_category));
		RespondWorkflowObject.DocApproved_category.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfPage_GeneralComment));
		RespondWorkflowObject.WfPage_GeneralComment.click();
		RespondWorkflowObject.WfPage_GeneralComment.sendKeys("Checking Inprogress SD Workflow - Automation");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.TenderQty_NotApplicable));
		RespondWorkflowObject.TenderQty_NotApplicable.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.C4Workflowpage1_Approver));
		RespondWorkflowObject.C4Workflowpage1_Approver.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		RespondWorkflowObject.CnfrmYes.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WF_ReassignProceed));
		RespondWorkflowObject.WF_ReassignProceed.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WF_SubmitPopup_Close));
		RespondWorkflowObject.WF_SubmitPopup_Close.click();
			
	}
		
	@Then("^as a user is should able to Checking Inprogress SD workflow WF$")
	public void as_a_user_is_should_able_to_Checking_Inprogress_SD_workflow_WF() throws Throwable {
		System.out.println("Schema Design Checking Inprogress workflow Action");
		Webdriver.driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		RespondWorkflowObject.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ActionTakenTab));
		RespondWorkflowObject.WFAction.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocCategory));
		RespondWorkflowObject.DocCategory.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocApproved_category));
		RespondWorkflowObject.DocApproved_category.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfPage_GeneralComment));
		RespondWorkflowObject.WfPage_GeneralComment.click();
		RespondWorkflowObject.WfPage_GeneralComment.sendKeys("Checking Inprogress SD Workflow Action Approved using Automation");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfApprove));
		RespondWorkflowObject.WfApprove.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		RespondWorkflowObject.CnfrmYes.click();	
		
	}
	
	// =========================== Transmittal Template ==============================//
		
	@Then("^as a user is should able to Create SD workflow Transmittal Template WF$")
	public void as_a_user_is_should_able_to_Create_SD_workflow_Transmittal_Template_WF() throws Throwable {
		Actions actions1 = new Actions(Webdriver.driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.New_Transmittal));
		RespondWorkflowObject.New_Transmittal.getText();
		RespondWorkflowObject.New_Transmittal.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.TransmittalTemplate_C4));
		RespondWorkflowObject.TransmittalTemplate_C4.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Descipline_TT));
		RespondWorkflowObject.Descipline_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Architecture_Desipline_TT));
		RespondWorkflowObject.Architecture_Desipline_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.FromOrg_TT));
		RespondWorkflowObject.FromOrg_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.FromOrg_Org1_TT));
		RespondWorkflowObject.FromOrg_Org1_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ToOrg_TT));
		RespondWorkflowObject.ToOrg_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.ToOrg_LNT_TT));
		RespondWorkflowObject.ToOrg_LNT_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Confidential_Toggle_TT));
		RespondWorkflowObject.Confidential_Toggle_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CustomerRefNum_TT));
		RespondWorkflowObject.CustomerRefNum_TT.click();
		RespondWorkflowObject.CustomerRefNum_TT.sendKeys("PS001");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_CC_TT));
		RespondWorkflowObject.Transmittal_CC_TT.click();
//		js.executeScript("arguments[0].scrollIntoView();", RespondWorkflowObject.CC_Praveen_TT);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CC_Praveen_TT));
		RespondWorkflowObject.CC_Praveen_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_ResponseYES_TT));
		RespondWorkflowObject.Transmittal_ResponseYES_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_ResponseNO_TT));
		RespondWorkflowObject.Transmittal_ResponseNO_TT.click();
		actions1.moveToElement(RespondWorkflowObject.CC_GroupBy_EDIT_TT).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CC_GroupBy_TT));
		RespondWorkflowObject.CC_GroupBy_TT.click();
		RespondWorkflowObject.CC_GroupBy_TT.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CC_GroupBy_Distribution_TT));
		RespondWorkflowObject.CC_GroupBy_Distribution_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CC_GroupBy_EDIT_TT));
		RespondWorkflowObject.CC_GroupBy_EDIT_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Category_Clear_CC_TT));
		RespondWorkflowObject.Category_Clear_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Category_CC_TT));
		RespondWorkflowObject.Category_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Category_GdForConstruction_CC_TT));
		RespondWorkflowObject.Category_GdForConstruction_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Type_CC_TT));
		RespondWorkflowObject.Type_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Type_SelectAll_CC_TT));
		RespondWorkflowObject.Type_SelectAll_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Remarks_CC_TT));
		RespondWorkflowObject.Remarks_CC_TT.click();
		RespondWorkflowObject.Remarks_CC_TT.sendKeys("Transmittal Template - Automation");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Save_CC_TT));
		RespondWorkflowObject.Save_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Cancel_CC_TT));
		RespondWorkflowObject.Cancel_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Edit_TT));
		RespondWorkflowObject.AttachDoc_Edit_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Qty_TT));
		RespondWorkflowObject.AttachDoc_Qty_TT.click();
		RespondWorkflowObject.AttachDoc_Qty_TT.sendKeys("2");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Category_TT));
		RespondWorkflowObject.AttachDoc_Category_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Category_FI_TT));
		RespondWorkflowObject.AttachDoc_Category_FI_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Type_TT));
		RespondWorkflowObject.AttachDoc_Type_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_TypeBox_TT));
		RespondWorkflowObject.AttachDoc_TypeBox_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_TypeBox2_TT));
		RespondWorkflowObject.AttachDoc_TypeBox2_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_TypeBox3_TT));
		RespondWorkflowObject.AttachDoc_TypeBox3_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_TypeBox4_TT));
		RespondWorkflowObject.AttachDoc_TypeBox4_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Attach_Remarks_TT));
		RespondWorkflowObject.Attach_Remarks_TT.click();
		RespondWorkflowObject.Attach_Remarks_TT.sendKeys("EDMS Automation Testing");
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_BulkUpload_TT));
//		RespondWorkflowObject.AttachDoc_BulkUpload_TT.click();
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Attach_TT));
//		RespondWorkflowObject.AttachDoc_Attach_TT.click();

		Thread.sleep(4000);
		status = RespondWorkflowObject.AttachDoc_Attach_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Attach_TT));
		RespondWorkflowObject.AttachDoc_Attach_TT.click();
		Thread.sleep(3000);
//		String file = fileuploadpath+fileName;
////		fileuploadpath=ConfigFileReader.getDocFileUpload();
////		 StringSelection stringSelection = new StringSelection(System.getProperty("user.dir")+fileuploadpath);
//		 StringSelection stringSelection = new StringSelection(file);
//		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		    clipboard.setContents(stringSelection, null);
//		    String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);
//		    System.out.println("String from Clipboard:" + actualCopedText);
//		    robot =new Robot();
//		    robot.keyPress(KeyEvent.VK_CONTROL);
//		    robot.keyPress(KeyEvent.VK_V); 
//		    robot.keyRelease(KeyEvent.VK_V);
//		    robot.keyRelease(KeyEvent.VK_CONTROL);
//		    robot.keyPress(KeyEvent.VK_ENTER);
//		    robot.keyRelease(KeyEvent.VK_ENTER);
//		    robot.delay(200);

System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'block')",RespondWorkflowObject.DocFileUpload);
		RespondWorkflowObject.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')",RespondWorkflowObject.DocFileUpload);
		    wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
		    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", RespondWorkflowObject.fileTypeClr);		
		    RespondWorkflowObject.UploadFileType.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
			RespondWorkflowObject.uploadDocument.click();	
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.FileUploadClose));
			RespondWorkflowObject.FileUploadClose.click();
		Reporter.addScenarioLog("RespondWorkflow Action page BrowseFile is enabled");
		Thread.sleep(1000);
		System.out.println("RespondWorkflow Action page File Uploaded Successfully");
		
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.AttachDoc_Save_TT));
		RespondWorkflowObject.AttachDoc_Save_TT.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.PreviewSubmit_TT));
		RespondWorkflowObject.PreviewSubmit_TT.click();	
		
		actions1.moveToElement(RespondWorkflowObject.Name_TT_Preview).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Name_TT_Preview));
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_AttachView_TT));
		RespondWorkflowObject.Transmittal_AttachView_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_AttachDownload_TT));
		RespondWorkflowObject.Transmittal_AttachDownload_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_AttachClose_TT));
		RespondWorkflowObject.Transmittal_AttachClose_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_Send_TT));
		RespondWorkflowObject.Transmittal_Send_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Transmittal_PopupOK_TT));
		RespondWorkflowObject.Transmittal_PopupOK_TT.click();
		
		System.out.println("Schema Design Checking Inprogress workflow Action page New Transmittal Template has been Created Successfully");
	}
		
	
	
	// ================================= GFC Workflow ================================	
	
	@Then("^user should able to Take GFC CI Workflow Action in WF Page$")
	public void user_should_able_to_Take_GFC_CI_Workflow_Action_in_WF_Page() throws InterruptedException, AWTException, UnsupportedFlavorException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.Doc1Select_Tab));
		RespondWorkflowObject.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WFAction));
		RespondWorkflowObject.WFAction.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocCategory));
		RespondWorkflowObject.DocCategory.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocApproved_category));
		RespondWorkflowObject.DocApproved_category.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFCWfPage_GeneralComment));
		RespondWorkflowObject.GFCWfPage_GeneralComment.click();
		RespondWorkflowObject.GFCWfPage_GeneralComment.sendKeys("GFC Workflow Automation");
		RespondWorkflowObject.WfApprove.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WFAttach));
		RespondWorkflowObject.WFAttach.click();
//		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.DocFileUpload));
		
		//
		
		System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'block')",RespondWorkflowObject.DocFileUpload);
		RespondWorkflowObject.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')",RespondWorkflowObject.DocFileUpload);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", RespondWorkflowObject.fileTypeClr);
		RespondWorkflowObject.UploadFileType.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
		RespondWorkflowObject.uploadDocument.click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.FileUploadClose));
		try {
			RespondWorkflowObject.FileUploadClose.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", RespondWorkflowObject.FileUploadClose);	
		}
		
		
		
		//
		/*System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'block')",RespondWorkflowObject.DocFileUpload);
		RespondWorkflowObject.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')",RespondWorkflowObject.DocFileUpload);
		
		    wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
		    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", RespondWorkflowObject.fileTypeClr);		
		    RespondWorkflowObject.UploadFileType.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.uploadDocument));
			RespondWorkflowObject.uploadDocument.click();	
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.FileUploadClose));
			RespondWorkflowObject.FileUploadClose.click();*/
		Reporter.addScenarioLog("RespondWorkflow Action page BrowseFile is enabled");
		Thread.sleep(1000);
		System.out.println("RespondWorkflow Action page File Uploaded Successfully");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfApprove));
		RespondWorkflowObject.WfApprove.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.CnfrmYes));
		RespondWorkflowObject.CnfrmYes.click();

		
	}
		
	@Then("^user should able to Take GFC Approval Inprogress Workflow Action in WF Page$")
	public void user_should_able_to_Take_GFC_Approval_Inprogress_Workflow_Action_in_WF_Page() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.GFCWfPage_GeneralComment));
		RespondWorkflowObject.GFCWfPage_GeneralComment.click();
		RespondWorkflowObject.GFCWfPage_GeneralComment.sendKeys("GFC Approval InProgress Workflow Automation");
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.just_movecursor));
		RespondWorkflowObject.just_movecursor.click();
		wait.until(ExpectedConditions.elementToBeClickable(RespondWorkflowObject.WfApprove));
		RespondWorkflowObject.WfApprove.click();
		Thread.sleep(4000);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
