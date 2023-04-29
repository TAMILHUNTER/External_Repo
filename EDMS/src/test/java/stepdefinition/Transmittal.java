package stepdefinition;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.java.en.Then;
import object_repository.Locators.TransmittalObjects;

public class Transmittal {

	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10000);
	static String fileuploadpath = System.getProperty("user.dir") + "\\src\\main\\upload";
	static String fileName = "\\QA_testing.xlsx";
	static boolean status;
	static Robot robot;
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;

	public Transmittal() {
		PageFactory.initElements(Webdriver.driver, TransmittalObjects.class);
	}

	@Then("^as a user i should able to click main menu in home page TT$")
	public void as_a_user_i_should_able_to_click_main_menu_in_home_page_TT() throws Throwable {
//		TransmittalObjects.MenuEng.click();
		Thread.sleep(2000);
		Actions actions = new Actions(Webdriver.driver);
		System.out.println("In-Moved");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.MenuEng));
		actions.moveToElement(TransmittalObjects.MenuEng);
		System.out.println("Before click");
		actions.build().perform();
		System.out.println("Out-Moved");
//		TransmittalObjects.MenuEng.click();
//		actions.perform();
		System.out.println("Home page Main Menu is enabled");
	}

	@Then("^user should able to Click Transmittal in Main Menu$")
	public void user_should_able_to_Click_Transmittal_in_Main_Menu() throws Throwable {
		status = TransmittalObjects.Transmittal_Menu.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_Menu));
		Reporter.addScenarioLog("Transmittal_Menu Object page is enabled");
		TransmittalObjects.Transmittal_Menu.click();
		System.out.println("Transmittal_Menu Object page is enabled");
	}

	@Then("^user should able to Click Create button in Transmittal page$")
	public void user_should_able_to_Click_Create_button_in_Transmittal_page() throws Throwable {
		status = TransmittalObjects.Transmittal_Create.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_Create));
		Reporter.addScenarioLog("Transmittal_Menu page click Transmittal_Create is enabled");
		TransmittalObjects.Transmittal_Create.click();
		System.out.println("Transmittal_Menu page click Transmittal_Create is enabled");
	}

	@Then("^as a user is should able to Create SD workflow Transmittal Template$")
	public void as_a_user_is_should_able_to_Create_SD_workflow_Transmittal_Template() throws Throwable {
		Actions actions1 = new Actions(Webdriver.driver);

		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.New_Transmittal));
		TransmittalObjects.New_Transmittal.getText();
		TransmittalObjects.New_Transmittal.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.TransmittalTemplate_C4));
		TransmittalObjects.TransmittalTemplate_C4.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Descipline_TT));
		TransmittalObjects.Descipline_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Architecture_Desipline_TT));
		TransmittalObjects.Architecture_Desipline_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.FromOrg_TT));
		TransmittalObjects.FromOrg_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.FromOrg_Org1_TT));
		TransmittalObjects.FromOrg_Org1_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.ToOrg_TT));
		TransmittalObjects.ToOrg_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.ToOrg_LNT_TT));
		TransmittalObjects.ToOrg_LNT_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Confidential_Toggle_TT));
		TransmittalObjects.Confidential_Toggle_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_CC_TT));
		TransmittalObjects.Transmittal_CC_TT.click();

//		js.executeScript("window.scrollBy(0,350)", TransmittalObjects.CC_Praveen_TT);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_Praveen_TT));
		TransmittalObjects.CC_Praveen_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_ResponseYES_TT));
		TransmittalObjects.Transmittal_ResponseYES_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_ResponseNO_TT));
		TransmittalObjects.Transmittal_ResponseNO_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_GroupBy_TT));
		TransmittalObjects.CC_GroupBy_TT.click();
		TransmittalObjects.CC_GroupBy_TT.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_GroupBy_Distribution_TT));
		TransmittalObjects.CC_GroupBy_Distribution_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_GroupBy_EDIT_TT));
		TransmittalObjects.CC_GroupBy_EDIT_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Category_Clear_CC_TT));
		TransmittalObjects.Category_Clear_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Category_CC_TT));
		TransmittalObjects.Category_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Category_GdForConstruction_CC_TT));
		TransmittalObjects.Category_GdForConstruction_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Type_CC_TT));
		TransmittalObjects.Type_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Type_SelectAll_CC_TT));
		TransmittalObjects.Type_SelectAll_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Remarks_CC_TT));
		TransmittalObjects.Remarks_CC_TT.click();
		TransmittalObjects.Remarks_CC_TT.sendKeys("Transmittal Template - Automation");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Save_CC_TT));
		TransmittalObjects.Save_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Cancel_CC_TT));
		TransmittalObjects.Cancel_CC_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Edit_TT));
		TransmittalObjects.AttachDoc_Edit_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Qty_TT));
		TransmittalObjects.AttachDoc_Qty_TT.click();
		TransmittalObjects.AttachDoc_Qty_TT.sendKeys("2");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Category_TT));
		TransmittalObjects.AttachDoc_Category_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Category_FI_TT));
		TransmittalObjects.AttachDoc_Category_FI_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Type_TT));
		TransmittalObjects.AttachDoc_Type_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox_TT));
		TransmittalObjects.AttachDoc_TypeBox_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox2_TT));
		TransmittalObjects.AttachDoc_TypeBox2_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox3_TT));
		TransmittalObjects.AttachDoc_TypeBox3_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox4_TT));
		TransmittalObjects.AttachDoc_TypeBox4_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Attach_Remarks_TT));
		TransmittalObjects.Attach_Remarks_TT.click();
		TransmittalObjects.Attach_Remarks_TT.sendKeys("EDMS Automation Testing");
//		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_BulkUpload_TT));
//		TransmittalObjects.AttachDoc_BulkUpload_TT.click();
//		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Attach_TT));
//		TransmittalObjects.AttachDoc_Attach_TT.click();

		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Attach_TT));
		status = TransmittalObjects.AttachDoc_Attach_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_Attach_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_Attach_TT in Transmittal page is enabled");
		Thread.sleep(3000);
		System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'block')", TransmittalObjects.DocFileUpload);
		TransmittalObjects.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')", TransmittalObjects.DocFileUpload);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.uploadDocument));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", TransmittalObjects.fileTypeClr);
		TransmittalObjects.UploadFileType.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.uploadDocument));
		TransmittalObjects.uploadDocument.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.FileUploadClose));
		TransmittalObjects.FileUploadClose.click();
		Reporter.addScenarioLog("RespondWorkflow Action page BrowseFile is enabled");
		Thread.sleep(1000);
		System.out.println("RespondWorkflow Action page File Uploaded Successfully");

		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Save_TT));
		TransmittalObjects.AttachDoc_Save_TT.click();

		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.PreviewSubmit_TT));
		TransmittalObjects.PreviewSubmit_TT.click();

		actions1.moveToElement(TransmittalObjects.Name_TT_Preview).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Name_TT_Preview));
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachView_TT));
		TransmittalObjects.Transmittal_AttachView_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachDownload_TT));
		TransmittalObjects.Transmittal_AttachDownload_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachClose_TT));
		TransmittalObjects.Transmittal_AttachClose_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_Send_TT));
		TransmittalObjects.Transmittal_Send_TT.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_PopupOK_TT));
		TransmittalObjects.Transmittal_PopupOK_TT.click();

		System.out.println("Menu's Tranmittal page New Transmittal Document has been Created Successfully");
	}

	// ================== Transmittal ===============================//

	@Then("^user should able to Click New Transmittal in Transmittal page$")
	public void user_should_able_to_Click_New_Transmittal_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.New_Transmittal));
		TransmittalObjects.New_Transmittal.getText();
		TransmittalObjects.New_Transmittal.click();
		status = TransmittalObjects.New_Transmittal.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page click New Transmittal is enabled");
		System.out.println("Transmittal_Menu page click New Transmittal is enabled");
	}

	@Then("^user should able to Click TransmittalTemplate C4 in Transmittal page$")
	public void user_should_able_to_Click_TransmittalTemplate_C4_in_Transmittal_page() throws Throwable {
		status = TransmittalObjects.TransmittalTemplate_C4.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.TransmittalTemplate_C4));
		TransmittalObjects.TransmittalTemplate_C4.click();
		Reporter.addScenarioLog("Transmittal_Menu page click TransmittalTemplate_C4 in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click TransmittalTemplate_C4 in Transmittal page is enabled");
	}

	@Then("^as a user is should able to click AttachFile in Transmittal$")
	public void as_a_user_is_should_able_to_click_AttachFile_in_Transmittal() throws Throwable {
		status = TransmittalObjects.MailAttachFileMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.MailAttachFileMail));
		Reporter.addScenarioLog("Transmittal created Doc Mail page MailAttachFileMail is enabled");
		System.out.println("Transmittal created Doc Mail page MailAttachFileMail is enabled");
		Thread.sleep(3000);
		TransmittalObjects.MailAttachFileMail.click();
	}

	/*@Then("^as a user is should able to select Document in AttachFile Transmittal$")
	public void as_a_user_is_should_able_to_select_Document_in_AttachFile_Transmittal() throws Throwable {
//		status = EngineeringSchedule.DocSelectAttachMail.isEnabled();
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.search));
//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page PrintSize is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.DocSelectAttachMail));
		TransmittalObjects.DocSelectAttachMail.click();
		System.out.println("Transmittal created Doc Mail page PrintSize is enabled");
	}*/

	@Then("^as a user is should able to select Document Num in AttachFile Transmittal$")
	public void as_a_user_is_should_able_to_select_Document_Num_in_AttachFile_Transmittal() throws Throwable {
		status = TransmittalObjects.RepositoryDocMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.RepositoryDocMail));
		Reporter.addScenarioLog("Transmittal created Doc Mail page RepositoryDocMail is enabled");
		System.out.println("Transmittal created Doc Mail page RepositoryDocMail is enabled");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.WorkflowDocMail));
		TransmittalObjects.WorkflowDocMail.click();
		System.out.println("Transmittal created Doc Repository is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.RepositoryDocMail));
		TransmittalObjects.RepositoryDocMail.click();
		System.out.println("Transmittal created Doc Attach WorkflowDocMail is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.WorkflowDocMail));
		TransmittalObjects.WorkflowDocMail.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.WFDocNoPk));
		TransmittalObjects.WFDocNoPk.click();
		System.out.println("Transmittal created Doc can attach document is enabled");
	}

	@Then("^as a user is should able to click Submit the AttachFile Transmittal$")
	public void as_a_user_is_should_able_to_click_Submit_the_AttachFile_Transmittal() throws Throwable {
		status = TransmittalObjects.MailAttachSubmit.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.MailAttachSubmit));
		Reporter.addScenarioLog("Transmittal created Doc Mail page MailAttachSubmit is enabled");
		System.out.println("Transmittal created Doc Mail page MailAttachSubmit is enabled");
		Thread.sleep(3000);
		TransmittalObjects.MailAttachSubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	/****************************************/
	
	
	
	@Then("^user should able to select Descipline TT in Transmittal page$")
	public void user_should_able_to_select_Descipline_TT_in_Transmittal_page() throws Throwable {
		
		status = TransmittalObjects.Descipline_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Descipline_TT));
		TransmittalObjects.Descipline_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page click Descipline_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Descipline_TT in Transmittal page is enabled");
	}

	@Then("^user should able to capture Architecture Desipline in Transmittal page$")
	public void user_should_able_to_capture_Architecture_Desipline_in_Transmittal_page() throws Throwable {
		
		status = TransmittalObjects.Architecture_Desipline_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Architecture_Desipline_TT));
		TransmittalObjects.Architecture_Desipline_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page click Architecture_Desipline_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Architecture_Desipline_TT in Transmittal page is enabled");
	}

	@Then("^user should able to select FromOrg in Transmittal page$")
	public void user_should_able_to_select_FromOrg_in_Transmittal_page() throws Throwable {
		
		status = TransmittalObjects.FromOrg_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.FromOrg_TT));
		TransmittalObjects.FromOrg_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page click FromOrg_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click FromOrg_TT Transmittal page is enabled");
	}

	@Then("^user should able to capture FromOrg Org1 in Transmittal page$")
	public void user_should_able_to_capture_FromOrg_Org1_in_Transmittal_page() throws Throwable {
		
		status = TransmittalObjects.FromOrg_Org1_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.FromOrg_Org1_TT));
		TransmittalObjects.FromOrg_Org1_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page capture FromOrg_Org1_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture FromOrg_Org1_TT in Transmittal page is enabled");
	}

	@Then("^user should able to select ToOrg in Transmittal page$")
	public void user_should_able_to_select_ToOrg_in_Transmittal_page() throws Throwable {
		
		status = TransmittalObjects.ToOrg_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.ToOrg_TT));
		TransmittalObjects.ToOrg_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page select ToOrg_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select ToOrg_TT in Transmittal page is enabled");
	}

	@Then("^user should able to capture ToOrg LNT in Transmittal page$")
	public void user_should_able_to_capture_ToOrg_LNT_in_Transmittal_page() throws Throwable {
		status = TransmittalObjects.ToOrg_LNT_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.ToOrg_LNT_TT));
		TransmittalObjects.ToOrg_LNT_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page capture ToOrg_LNT_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture ToOrg_LNT_TT in Transmittal page is enabled");
	}

	// '''''''''''''''''''''''''''

	@Then("^user should able to click Confidential Toggle in Transmittal page$")
	public void user_should_able_to_click_Confidential_Toggle_in_Transmittal_page() throws Throwable {
		status = TransmittalObjects.Confidential_Toggle_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Confidential_Toggle_TT));
		TransmittalObjects.Confidential_Toggle_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page click Confidential_Toggle_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Confidential_Toggle_TT Transmittal page is enabled");
	}

	@Then("^user should able to select Transmittal CC in Transmittal page$")
	public void user_should_able_to_select_Transmittal_CC_in_Transmittal_page() throws Throwable {	
		status = TransmittalObjects.Transmittal_CC_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_CC_TT));
		TransmittalObjects.Transmittal_CC_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page select Transmittal_CC_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select Transmittal_CC_TT in Transmittal page is enabled");
	}

	@Then("^user should able to select CC Praveen in Transmittal page$")
	public void user_should_able_to_select_CC_Praveen_in_Transmittal_page() throws Throwable {
//		Actions action=new Actions(Webdriver.driver);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
//		action.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", TransmittalObjects.PreviewSubmit_TT);
		status = TransmittalObjects.CC_Praveen_TT.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_Praveen_TT));
		TransmittalObjects.CC_Praveen_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page select CC_Praveen_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select CC_Praveen_TT in Transmittal page is enabled");
	}

	@Then("^user should able to click Transmittal ResponseYES in Transmittal page$")
	public void user_should_able_to_click_Transmittal_ResponseYES_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_ResponseYES_TT));
		status = TransmittalObjects.Transmittal_ResponseYES_TT.isEnabled();
		assertTrue(status);
		Thread.sleep(3000);
		try {
			TransmittalObjects.Transmittal_ResponseYES_TT.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", TransmittalObjects.Transmittal_ResponseYES_TT);
		}
		
		Reporter.addScenarioLog(
				"Transmittal_Menu page click Transmittal_ResponseYES_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Transmittal_ResponseYES_TT in Transmittal page is enabled");
	}

	// '''''''''''''''''''''''''''

	@Then("^user should able to click Transmittal ResponseNO in Transmittal page$")
	public void user_should_able_to_click_Transmittal_ResponseNO_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_ResponseNO_TT));
		TransmittalObjects.Transmittal_ResponseNO_TT.click();
		status = TransmittalObjects.Transmittal_ResponseNO_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page click Transmittal_ResponseNO_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Transmittal_ResponseNO_TT Transmittal page is enabled");
	}

	@Then("^user should able to capture CC GroupBy in Transmittal page$")
	public void user_should_able_to_capture_CC_GroupBy_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_GroupBy_TT));
		TransmittalObjects.CC_GroupBy_TT.click();
		TransmittalObjects.CC_GroupBy_TT.sendKeys("1");
		status = TransmittalObjects.CC_GroupBy_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page capture CC_GroupBy_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture CC_GroupBy_TT in Transmittal page is enabled");
		
		
	}

	@Then("^user should able to select CC GroupBy Distribution in Transmittal page$")
	public void user_should_able_to_select_CC_GroupBy_Distribution_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_GroupBy_Distribution_TT));
		TransmittalObjects.CC_GroupBy_Distribution_TT.click();
		status = TransmittalObjects.CC_GroupBy_Distribution_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog(
				"Transmittal_Menu page select CC_GroupBy_Distribution_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select CC_GroupBy_Distribution_TT in Transmittal page is enabled");
	}

	@Then("^user should able to click CC GroupBy EDIT in Transmittal page$")
	public void user_should_able_to_click_CC_GroupBy_EDIT_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.CC_GroupBy_EDIT_TT));
		TransmittalObjects.CC_GroupBy_EDIT_TT.click();
		status = TransmittalObjects.CC_GroupBy_EDIT_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page click CC_GroupBy_EDIT_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click CC_GroupBy_EDIT_TT in Transmittal page is enabled");

	}

	@Then("^user should able to capture Category CC in Transmittal page$")
	public void user_should_able_to_capture_Category_CC_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Category_Clear_CC_TT));
		TransmittalObjects.Category_Clear_CC_TT.click();
		Thread.sleep(2000);
		System.out.println("Transmittal_Menu page capture Category_CC Transmittal page is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Category_CC_TT));
		TransmittalObjects.Category_CC_TT.click();
		status = TransmittalObjects.Category_CC_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page capture Category_CC in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture Category_CC Transmittal page is enabled");
	}

	@Then("^user should able to capture Category GdForConstruction CC in Transmittal page$")
	public void user_should_able_to_capture_Category_GdForConstruction_CC_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Category_GdForConstruction_CC_TT));
		status = TransmittalObjects.Category_GdForConstruction_CC_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.Category_GdForConstruction_CC_TT.click();
		Reporter.addScenarioLog(
				"Transmittal_Menu page capture Category_GdForConstruction_CC_TT in Transmittal page is enabled");
		System.out.println(
				"Transmittal_Menu page capture Category_GdForConstruction_CC_TT in Transmittal page is enabled");
	}

	@Then("^user should able to capture Type CC TT in Transmittal page$")
	public void user_should_able_to_capture_Type_CC_TT_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Type_CC_TT));
		TransmittalObjects.Type_CC_TT.click();
		status = TransmittalObjects.Type_CC_TT.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Transmittal_Menu page capture Type_CC_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture Type_CC_TT in Transmittal page is enabled");
	}

	@Then("^user should able to capture Type SelectAll CC in Transmittal page$")
	public void user_should_able_to_capture_Type_SelectAll_CC_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Type_SelectAll_CC_TT));
		status = TransmittalObjects.Type_SelectAll_CC_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.Type_SelectAll_CC_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page capture Type_SelectAll_CC_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture Type_SelectAll_CC_TT in Transmittal page is enabled");
	}

	// ''''''''''''''''''''''''''' ';';';';

	@Then("^user should able to capture Remarks CC in Transmittal page$")
	public void user_should_able_to_capture_Remarks_CC_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Remarks_CC_TT));
		status = TransmittalObjects.Remarks_CC_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.Remarks_CC_TT.click();
		TransmittalObjects.Remarks_CC_TT.sendKeys("Transmittal Template - Automation");
		Reporter.addScenarioLog("Transmittal_Menu page capture Remarks_CC_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture Remarks_CC_TT Transmittal page is enabled");
	}

	@Then("^user should able to click Save button CC in Transmittal page$")
	public void user_should_able_to_click_Save_button_CC_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Save_CC_TT));
		status = TransmittalObjects.Save_CC_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.Save_CC_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page click Save button in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Save button in Transmittal page is enabled");
	}

	@Then("^user should able to click Cancel CC in Transmittal page$")
	public void user_should_able_to_click_Cancel_CC_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Cancel_CC_TT));
		status = TransmittalObjects.Cancel_CC_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.Cancel_CC_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page click Cancel_CC_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page click Cancel_CC_TT in Transmittal page is enabled");
	}

	@Then("^user should able to select AttachDoc TT in Transmittal page$")
	public void user_should_able_to_select_AttachDoc_TT_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Edit_TT));
		status = TransmittalObjects.AttachDoc_Edit_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Edit_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_Edit_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_Edit_TT in Transmittal page is enabled");
	}

	// ''''''''''''''''''''''''''' ';';';';545

	@Then("^user should able to capture AttachDoc Qty in Transmittal page$")
	public void user_should_able_to_capture_AttachDoc_Qty_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Qty_TT));
		status = TransmittalObjects.AttachDoc_Qty_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Qty_TT.click();
		/*TransmittalObjects.AttachDoc_Qty_TT.clear();
		Thread.sleep(2000);
		TransmittalObjects.AttachDoc_Qty_TT.sendKeys("2");*/
		Reporter.addScenarioLog("Transmittal_Menu page capture AttachDoc_Qty_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture AttachDoc_Qty_TT Transmittal page is enabled");
	}

	@Then("^user should able to AttachDoc Category in Transmittal page$")
	public void user_should_able_to_AttachDoc_Category_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Category_TT));
		status = TransmittalObjects.AttachDoc_Category_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Category_TT.click();
		
		Reporter.addScenarioLog(
				"Transmittal_Menu page capture AttachDoc_Category_TT button in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture AttachDoc_Category_TT button in Transmittal page is enabled");
	}

	@Then("^user should able to select AttachDoc Category FI in Transmittal page$")
	public void user_should_able_to_select_AttachDoc_Category_FI_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Category_FI_TT));
		status = TransmittalObjects.AttachDoc_Category_FI_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Category_FI_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_Category_FI_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_Category_FI_TT in Transmittal page is enabled");
	}

	@Then("^user should able to select AttachDoc Type in Transmittal page$")
	public void user_should_able_to_select_AttachDoc_Type_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Type_TT));
		status = TransmittalObjects.AttachDoc_Type_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Type_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_Type_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_Type_TT in Transmittal page is enabled");
	}

	// ''''''''''''''''''''''''''' ';';';';

	@Then("^user should able to capture AttachDoc TypeBox in Transmittal page$")
	public void user_should_able_to_capture_AttachDoc_TypeBox_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox_TT));
		status = TransmittalObjects.AttachDoc_TypeBox_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page capture AttachDoc_TypeBox_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture AttachDoc_TypeBox_TT Transmittal page is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox2_TT));
		status = TransmittalObjects.AttachDoc_TypeBox2_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox2_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_TypeBox2_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_TypeBox2_TT in Transmittal page is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox3_TT));
		status = TransmittalObjects.AttachDoc_TypeBox3_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox3_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_TypeBox3_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_TypeBox3_TT in Transmittal page is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox4_TT));
		status = TransmittalObjects.AttachDoc_TypeBox4_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox4_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_TypeBox4_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_TypeBox4_TT in Transmittal page is enabled");
	}

	/*@Then("^user should able to select AttachDoc TypeBox2 in Transmittal page$")
	public void user_should_able_to_select_AttachDoc_TypeBox2_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox2_TT));
		status = TransmittalObjects.AttachDoc_TypeBox2_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox2_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_TypeBox2_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_TypeBox2_TT in Transmittal page is enabled");
	}*/

	/*@Then("^user should able to select AttachDoc TypeBox3 in Transmittal page$")
	public void user_should_able_to_select_AttachDoc_TypeBox3_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox3_TT));
		status = TransmittalObjects.AttachDoc_TypeBox3_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox3_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_TypeBox3_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_TypeBox3_TT in Transmittal page is enabled");
	}*/

/*	@Then("^user should able to select AttachDoc TypeBox4 in Transmittal page$")
	public void user_should_able_to_select_AttachDoc_TypeBox4_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_TypeBox4_TT));
		status = TransmittalObjects.AttachDoc_TypeBox4_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_TypeBox4_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_TypeBox4_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_TypeBox4_TT in Transmittal page is enabled");
	}*/

	// ''''''''''''''''''''''''''' ';';';';545

	@Then("^user should able to capture Attach Remarks in Transmittal page$")
	public void user_should_able_to_capture_Attach_Remarks_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Attach_Remarks_TT));
		status = TransmittalObjects.Attach_Remarks_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.Attach_Remarks_TT.click();
		TransmittalObjects.Attach_Remarks_TT.sendKeys("EDMS Automation Testing");
		
		Reporter.addScenarioLog("Transmittal_Menu page capture Attach_Remarks_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page capture Attach_Remarks_TT Transmittal page is enabled");
	}

	@Then("^user should able to Click AttachDoc BulkUpload in Transmittal page$")
	public void user_should_able_to_Click_AttachDoc_BulkUpload_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_BulkUpload_TT));
		status = TransmittalObjects.AttachDoc_BulkUpload_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_BulkUpload_TT.click();
		
		Reporter.addScenarioLog(
				"Transmittal_Menu page capture AttachDoc_BulkUpload_TT button in Transmittal page is enabled");
		System.out
				.println("Transmittal_Menu page capture AttachDoc_BulkUpload_TT button in Transmittal page is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachClose_TT));
		TransmittalObjects.Transmittal_AttachClose_TT.click();
	
	}

	@Then("^user should able to Upload AttachDoc in Transmittal page$")
	public void user_should_able_to_Upload_AttachDoc_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Attach_TT));
		status = TransmittalObjects.AttachDoc_Attach_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Attach_TT.click();
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_Attach_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_Attach_TT in Transmittal page is enabled");

System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'inline-block')",TransmittalObjects.DocFileUpload);
		TransmittalObjects.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')",TransmittalObjects.DocFileUpload);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.uploadDocument));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", TransmittalObjects.fileTypeClr);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.UploadFileType));
		TransmittalObjects.UploadFileType.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.uploadDocument));
		TransmittalObjects.uploadDocument.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.FileUploadClose));
		try {
			TransmittalObjects.FileUploadClose.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", TransmittalObjects.FileUploadClose);
		}
		
		Thread.sleep(2000);
		Reporter.addScenarioLog("Transmittal page BrowseFile File Upload is enabled");
		Thread.sleep(1000);
		System.out.println("Transmittal page File Uploaded Successfully");

	}

	@Then("^user should able to click AttachDoc Save in Transmittal page$")
	public void user_should_able_to_click_AttachDoc_Save_in_Transmittal_page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.AttachDoc_Save_TT));
		status = TransmittalObjects.AttachDoc_Save_TT.isEnabled();
		assertTrue(status);
		TransmittalObjects.AttachDoc_Save_TT.click();
		
		Reporter.addScenarioLog("Transmittal_Menu page select AttachDoc_Save_TT in Transmittal page is enabled");
		System.out.println("Transmittal_Menu page select AttachDoc_Save_TT in Transmittal page is enabled");
	}
	
	@Then("^user should able to Preview and Submit the Transmittal in Transmittal page$")
	public void user_should_able_to_Preview_and_Submit_the_Transmittal_in_Transmittal_page() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.PreviewSubmit_TT));
		TransmittalObjects.PreviewSubmit_TT.click();
		System.out.println("Transmittal_Menu page select PreviewSubmit_TT in Transmittal page is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Name_TT_Preview));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", TransmittalObjects.Name_TT_Preview);
//		actions1.moveToElement(TransmittalObjects.Name_TT_Preview).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachView_TT));
		TransmittalObjects.Transmittal_AttachView_TT.click();
		System.out.println("Transmittal_Menu page select Transmittal_AttachView_TT in Transmittal page is enabled");
		Thread.sleep(2000);
		if (TransmittalObjects.Transmittal_AttachDownload_TT.isEnabled()) {
			
			try {
				wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachDownload_TT));
				TransmittalObjects.Transmittal_AttachDownload_TT.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", TransmittalObjects.Transmittal_AttachDownload_TT);
			}
			System.out.println("User Can be able to download Transmittal attachment in Transmittal page is enabled");
		} else {
			System.out.println("User Cannot be able to download Transmittal attachment in Transmittal page");
		}
		Thread.sleep(2000);
		if (TransmittalObjects.Transmittal_AttachClose_TT.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_AttachClose_TT));
			TransmittalObjects.Transmittal_AttachClose_TT.click();
			System.out.println("Transmittal_Menu page select Transmittal_AttachClose_TT in Transmittal page is enabled");
		} else {
			System.out.println("Transmittal_Menu page select Transmittal_AttachClose_TT in Transmittal page is not enabled");
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_Send_TT));
		TransmittalObjects.Transmittal_Send_TT.click();
		System.out.println("Transmittal Send Successfully");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(TransmittalObjects.Transmittal_PopupOK_TT));
		TransmittalObjects.Transmittal_PopupOK_TT.click();

		System.out.println("Menu's Tranmittal page New Transmittal Document has been Created Successfully");
	}

	
	
	
	
	
}
