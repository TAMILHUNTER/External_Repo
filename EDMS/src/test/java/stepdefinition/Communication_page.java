/*package stepdefinition;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import object_repository.Locators.CommonControlObject;
import object_repository.Locators.CommunicationObject;
import object_repository.Locators.EngineeringSchedule;


public class Communication_page {

	// Praveen
	WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10000);
	public static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		static String newMessageNumber;
		String projectCode="HMRL - L&T Metro HMRL";
		String discipline="E - Electrical";
		String fromOrg="LNT - LNT Construction"; 
		String toOrg="LNT - LNT Construction";
		String mailtype="Letter";
		String to="Kathiresh Kumar";	
		static String communicationComposedDate;
		
		public Communication_page() {
			PageFactory.initElements(Webdriver.driver, CommunicationObject.class);
		}

		public static void communicationPage() {
			
			Login.driver.navigate().to("https://edms4qa.lntecc.com/EdmsUI/communication/communication");
			PageFactory.initElements(Login.driver, CommunicationObject.class);
			PageFactory.initElements(Login.driver, CommonControlObject.class);
			
					
		}
		
		public static void icons() {
			
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.searchIcon));
			Assert.assertEquals(CommonControlObject.searchIcon.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.reply.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.replyAll.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.forward.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.createMessage.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.viewMessage.isEnabled(), true);
			AssertJUnit.assertEquals(CommonControlObject.expand.isEnabled(), true);
			AssertJUnit.assertEquals(CommonControlObject.filter.isEnabled(), true);
			AssertJUnit.assertEquals(CommonControlObject.lastpage.isEnabled(), true);
			AssertJUnit.assertEquals(CommonControlObject.nextPage.isEnabled(), true);
			AssertJUnit.assertEquals(CommonControlObject.firstPage.isDisplayed(), true);
			AssertJUnit.assertEquals(CommonControlObject.previousPage.isDisplayed(), true);
			AssertJUnit.assertEquals(CommunicationObject.pageTitle.getText(), "COMMUNICATION");		
			
		}
		
		public static void tabs() {
			AssertJUnit.assertEquals(CommunicationObject.inbox.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.draft.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.sent.isEnabled(), true);
			AssertJUnit.assertEquals(CommunicationObject.all.isEnabled(), true);
				
		}
	
		public static void tabcount() {		
			int inboxCount=Integer.parseInt(CommunicationObject.inboxCount.getText());
			int sentCount=Integer.parseInt(CommunicationObject.sentCount.getText());
			int draftCount=Integer.parseInt(CommunicationObject.draftCount.getText());
			int allCount=Integer.parseInt(CommunicationObject.allCount.getText());
			int total=inboxCount+sentCount+draftCount;
			AssertJUnit.assertEquals(allCount, total);
			Reporter.log("All Tab Counts Matched");		
			System.out.println("Tab Count Matched");
		}
		
		//(dependsOnMethods="tabcount")
		public static void expand() {
			CommonControlObject.expand.click();
			boolean expandStatus = CommunicationObject.inbox.isDisplayed();
			AssertJUnit.assertEquals(true, expandStatus);
			Reporter.log("Grid Expanded");
			CommonControlObject.collapse.click();
			Reporter.log("Grid collapsed");		
		}
		
		//(dependsOnMethods="expand")
		public static void pageNavigatoin() throws InterruptedException {
			Login.driver.getCurrentUrl();
			//CommonControlObject.repo_All.click();
			common_controls.viewAllrecords();
			System.out.println("Page Navigation Started.");		
			common_controls.lastPage();
			//common_controls.viewAllrecords();
			common_controls.previousPage();
			//common_controls.viewAllrecords();
			common_controls.nextPage();
			//common_controls.viewAllrecords();
			common_controls.firstPage();
			//common_controls.viewAllrecords();
			System.out.println("Page Navigation Completed");
			}
		
		//(dependsOnMethods="pageNavigatoin")
		public static void search() throws InterruptedException {	
			System.out.println("Search Started");
			common_controls.viewRecordsMonthCommunication("all");	
			System.out.println("All passed");
			common_controls.Search("O20289-C-LNT-LNT-00004", "Message Number");
			System.out.println("Search Operation Completed");
			Reporter.log("Search Results");
		}
		
		//(dependsOnMethods="search")
		public static void filterSearch() throws InterruptedException {
			System.out.println("Filter Search");
			common_controls.viewRecordsMonthCommunication("all");	
			CommunicationObject.sent.click();
			common_controls.filterSearch("Demo-A-LNT-00006");
			System.out.println("After Filter Search");
			Reporter.log("Search Results");
			System.out.println("filter Operation Completed");
		}
		//(dependsOnMethods="filterSearch")
		public static void createCommunicationClose() {
			System.out.println("Create Communication close started");
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.createMessage));
			CommunicationObject.createMessage.click();
			CommunicationObject.writeMessage.click();
			wait.until(ExpectedConditions.visibilityOf(CommunicationObject.writeMessageWindowTitle));
			String title=CommunicationObject.writeMessageWindowTitle.getText();
			AssertJUnit.assertEquals(title, "Create Message");
			CommunicationObject.writeMessageClose.click();
			System.out.println("Create Communication close end");
		}	
		//(dependsOnMethods="createCommunicationClose")
		public static void createCommunicationSaveAsDraft() throws InterruptedException {
			//WebDriverWait wait1=new WebDriverWait(Login.driver, 3000);	
			System.out.println("createCommunicationSaveAsDraft draft started");
			CommunicationObject.createMessage.click();
			CommunicationObject.writeMessage.click();
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.visibilityOf(CommunicationObject.writeMessageWindowTitle));
			String title=CommunicationObject.writeMessageWindowTitle.getText();
			AssertJUnit.assertEquals(title, "Create Message");		
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.projectCode));
			CommunicationObject.projectCode.sendKeys("HMRL - L&T Metro HMRL");
			CommunicationObject.discipline.sendKeys("E - Electrical");
			CommunicationObject.fronOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.toOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.mailtype.sendKeys("Letter");
			CommunicationObject.to.sendKeys("Kathiresh Kumar");
			CommunicationObject.inputRequiredNo.click();		
			newMessageNumber=(String) CommunicationObject.createdMessageNumber.getText();
			System.out.println("Message number to save as draft is = "+newMessageNumber);
			CommunicationObject.saveMessage.click();						
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.successMessage));
			AssertJUnit.assertEquals(CommunicationObject.successMessage.getText(), "Success");		
			AssertJUnit.assertEquals(CommunicationObject.successMessageText.getText(), "Message created Successfully...");
			System.out.println("createCommunicationSaveAsDraft draft end");
			CommonControlObject.warningMessageClose.click();
			}
		//(dependsOnMethods="createCommunicationSaveAsDraft")
			public void editAndVerifyDraft() throws InterruptedException {		
			System.out.println("Message Number to verify is="+ newMessageNumber);
			common_controls.filterSearch(newMessageNumber);
			CommunicationObject.editDraft.click();
			String draftmessageNumber=(String) CommunicationObject.verifycreatedMessageNumber.getText().substring(17, 37);		
			AssertJUnit.assertEquals(draftmessageNumber, newMessageNumber);
			AssertJUnit.assertEquals(CommunicationObject.editDiscipline.getText(), discipline.substring(4));
			AssertJUnit.assertEquals(CommunicationObject.editProjectCode.getText(), projectCode.substring(7));
			AssertJUnit.assertEquals(CommunicationObject.editFromOrg.getText(), fromOrg.substring(6));
			AssertJUnit.assertEquals(CommunicationObject.editToOrg.getText(), toOrg.substring(6));
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.editMessageNoLastSet));
			System.out.println("Expected Number ="+newMessageNumber);		
			System.out.println("Message Number in edit window = "+ CommunicationObject.editMessageNo.getAttribute("value"));
			AssertJUnit.assertEquals(CommunicationObject.editMessageNo.getAttribute("value"),newMessageNumber.substring(0, 14));
			AssertJUnit.assertEquals(CommunicationObject.editMessageNoLastSet.getAttribute("value"),newMessageNumber.substring(15, 20));
			CommunicationObject.editmailType.click();
			System.out.println(CommunicationObject.editmailType.getAttribute("title"));
			AssertJUnit.assertEquals(CommunicationObject.editmailType.getAttribute("value"), mailtype);
			AssertJUnit.assertEquals(CommunicationObject.editTo.getAttribute("value"), to);
			CommunicationObject.writeMessageClose.click();		
			}
		
		//(dependsOnMethods="editAndVerifyDraft")
		public   void createCommunicationSend() throws AWTException, InterruptedException {
			Login.driver.navigate().refresh();
			System.out.println("create Communication Send started");
			CommunicationObject.createMessage.click();
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.writeMessage));
			CommunicationObject.writeMessage.click();
			String title=CommunicationObject.writeMessageWindowTitle.getText();
			AssertJUnit.assertEquals(title, "Create Message");
			AssertJUnit.assertEquals(CommunicationObject.newMessage.getText(), "New Message");
			CommunicationObject.projectCode.sendKeys("HMRL - L&T Metro HMRL");
			CommunicationObject.discipline.sendKeys("E - Electrical");
			CommunicationObject.fronOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.toOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.mailtype.sendKeys("Letter");
			CommunicationObject.to.sendKeys("Kathiresh Kumar");
			CommunicationObject.inputRequiredNo.click();		
			CommunicationObject.ccMemebersCtrl.click();
			List<WebElement> listofcc = CommunicationObject.selectCC;
			for (WebElement webElement : listofcc) {
				
				if(webElement.getText().equals("Vendor 1"))
				{
					webElement.click();
				}
			}
			CommunicationObject.newMessage.click();		
			CommunicationObject.bcMemebersCtrl.click();
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.selectBccPresents));		
			List<WebElement> listbc = CommunicationObject.selectBcc;		 
					for (WebElement webElement : listbc) {
						if(webElement.getText().equals("Vendor 1")) {
							webElement.click();
							
						}
					}
					CommunicationObject.newMessage.click();
			CommunicationObject.messageSubject.click();
			CommunicationObject.messageSubject.sendKeys("Automation Testing Subject");
			CommunicationObject.messageSubject.sendKeys(""+Keys.TAB + Keys.TAB+"Automation Testing Body");//body
			CommunicationObject.signature.click();
			//WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.testsign));
			CommunicationObject.testsign.click();
			newMessageNumber=(String) CommunicationObject.createdMessageNumber.getText();
			CommunicationObject.attachmentIcon.click();
			CommunicationObject.attachmentDocument.click();
			String attachmentWindowTitle=CommunicationObject.attachmentWindowTitle.getText();
			AssertJUnit.assertEquals(attachmentWindowTitle, "Select Document");
			AssertJUnit.assertTrue(CommunicationObject.searchDocumentToAttach.isEnabled());
			CommunicationObject.searchDocumentToAttach.clear();
			CommunicationObject.searchDocumentToAttach.sendKeys("O20361-C-STN-01-DC-");		
			CommunicationObject.searchDocumentToAttach.sendKeys("00005");		
			String attachmentDocNo=CommunicationObject.gridAttachmentSearchResult.getText();
			if(attachmentDocNo.equals("O20361-C-STN-04-DC-00005")) {
				CommunicationObject.gridAttachmentSearchResult.click();	
			}
			//CommunicationObject.clickAttachmentToAttach.click();
			AssertJUnit.assertTrue(CommunicationObject.submitAttachment.isEnabled());
		
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.attachingDocumentNumber));	
			String docnumber=CommunicationObject.attachingDocumentNumber.getText();
			String doctitle=CommunicationObject.attachingDocumentTitle.getText();
			String docrevision=CommunicationObject.attachingDocumentRevision.getText();
			String docreatedby=CommunicationObject.attachingDocumentCreatedBy.getText();
			CommunicationObject.submitAttachment.click();		
			System.out.println("searched attachment = "+ docnumber);
			AssertJUnit.assertEquals(CommunicationObject.aTTACHMENTDocuments.getText(), "ATTACHMENT - Documents");
			AssertJUnit.assertEquals(CommunicationObject.attachedDocumentNumber.getText(), docnumber);
			AssertJUnit.assertEquals(CommunicationObject.attachedDocumentTitle.getText(), doctitle);
			AssertJUnit.assertEquals(CommunicationObject.attachedDocumentRevision.getText(), docrevision);
			AssertJUnit.assertEquals(CommunicationObject.attacheDocumentdCreatedBy.getText(), docreatedby);
			CommunicationObject.sendMessage.click();
			CommunicationObject.successMessage.getText();
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.successMessage));
			AssertJUnit.assertEquals(CommunicationObject.successMessage.getText(), "Success");
			AssertJUnit.assertEquals(CommunicationObject.successMessageText.getText(), "Mail Sent successfully");		
			System.out.println("create Communication Send ended");
			CommonControlObject.warningMessageClose.click();		
			}
		
		
		//(dependsOnMethods="createCommunicationSend")
		public static void createSendIcon() throws AWTException, InterruptedException {
			Login.driver.navigate().refresh();
			communicationComposedDate = CommonControlObject.currentDate.getText().substring(0, 11);
			System.out.println("Date = " + communicationComposedDate);
			System.out.println("create Communication Send started");
			CommunicationObject.createMessage.click();
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.writeMessage));
			CommunicationObject.writeMessage.click();
			String title=CommunicationObject.writeMessageWindowTitle.getText();
			AssertJUnit.assertEquals(title, "Create Message");
			AssertJUnit.assertEquals(CommunicationObject.newMessage.getText(), "New Message");
			CommunicationObject.projectCode.sendKeys("HMRL - L&T Metro HMRL");
			CommunicationObject.discipline.sendKeys("E - Electrical");
			CommunicationObject.fronOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.toOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.mailtype.sendKeys("Letter");
			CommunicationObject.to.sendKeys("Vendor 1");
			CommunicationObject.inputRequiredNo.click();		
			CommunicationObject.ccMemebersCtrl.click();
			List<WebElement> listofcc = CommunicationObject.selectCC;
			for (WebElement webElement : listofcc) {
				
				if(webElement.getText().equals("Kathiresh Kumar"))
				{
					webElement.click();
				}
			}
			CommunicationObject.newMessage.click();		
			CommunicationObject.bcMemebersCtrl.click();
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.selectBccPresents));		
			List<WebElement> listbc = CommunicationObject.selectBcc;		 
					for (WebElement webElement : listbc) {
						if(webElement.getText().equals("Kathiresh Kumar")) {
							webElement.click();
							
						}
					}
					CommunicationObject.newMessage.click();
			CommunicationObject.messageSubject.click();
			CommunicationObject.messageSubject.sendKeys("Automation Testing Subject");
			CommunicationObject.messageSubject.sendKeys(""+Keys.TAB + Keys.TAB+"Automation Testing Body");//body
			newMessageNumber=(String) CommunicationObject.createdMessageNumber.getText();	
			CommunicationObject.signature.click();
			
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.testsign));
			CommunicationObject.testsign.click();
			newMessageNumber=(String) CommunicationObject.createdMessageNumber.getText();
			CommunicationObject.attachmentIcon.click();
			CommunicationObject.attachmentDocument.click();
			String attachmentWindowTitle=CommunicationObject.attachmentWindowTitle.getText();
			AssertJUnit.assertEquals(attachmentWindowTitle, "Select Document");
			AssertJUnit.assertTrue(CommunicationObject.searchDocumentToAttach.isEnabled());
			CommunicationObject.searchDocumentToAttach.clear();
			CommunicationObject.searchDocumentToAttach.sendKeys("O20361-C-STN-04-DC-");		
			CommunicationObject.searchDocumentToAttach.sendKeys("00005");		
			String attachmentDocNo=CommunicationObject.gridAttachmentSearchResult.getText();
			if(attachmentDocNo.equals("O20361-C-STN-04-DC-00005")) {
				CommunicationObject.gridAttachmentSearchResult.click();	
			}
			//CommunicationObject.clickAttachmentToAttach.click();
			AssertJUnit.assertTrue(CommunicationObject.submitAttachment.isEnabled());
			//WebDriverWait waits=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.attachingDocumentNumber));	
			String docnumber=CommunicationObject.attachingDocumentNumber.getText();
			String doctitle=CommunicationObject.attachingDocumentTitle.getText();
			String docrevision=CommunicationObject.attachingDocumentRevision.getText();
			String docreatedby=CommunicationObject.attachingDocumentCreatedBy.getText();
			CommunicationObject.submitAttachment.click();		
			System.out.println("searched attachment = "+ docnumber);
			AssertJUnit.assertEquals(CommunicationObject.aTTACHMENTDocuments.getText(), "ATTACHMENT - Documents");
			AssertJUnit.assertEquals(CommunicationObject.attachedDocumentNumber.getText(), docnumber);
			AssertJUnit.assertEquals(CommunicationObject.attachedDocumentTitle.getText(), doctitle);
			AssertJUnit.assertEquals(CommunicationObject.attachedDocumentRevision.getText(), docrevision);
			AssertJUnit.assertEquals(CommunicationObject.attacheDocumentdCreatedBy.getText(), docreatedby);
			CommunicationObject.sendIcon.click();
			CommunicationObject.successMessage.getText();
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.successMessage));
			AssertJUnit.assertEquals(CommunicationObject.successMessage.getText(), "Success");
			AssertJUnit.assertEquals(CommunicationObject.successMessageText.getText(), "Mail Sent successfully");		
			System.out.println("create Communication Send ended");
			CommonControlObject.warningMessageClose.click();	
			
			}
		
		
		//(dependsOnMethods="createSendIcon")
		public static void verifyingUnderSentCommunication() throws InterruptedException {
			CommunicationObject.sent.click();
			common_controls.viewRecordsMonthCommunication("all");	
			common_controls.Search(newMessageNumber, "Message Number" );
			CommunicationObject.sent.click();
			String sentOnDate=CommunicationObject.sentOnDate.getText();
			CommunicationObject.viewSentMessage.click();
			AssertJUnit.assertEquals(CommunicationObject.headermessageNumber.getText(),newMessageNumber);
			Login.driver.getCurrentUrl();
			AssertJUnit.assertEquals(CommunicationObject.messageNumber.getText(),newMessageNumber);
			AssertJUnit.assertEquals(CommunicationObject.sentOn.getText(),sentOnDate);
			AssertJUnit.assertEquals(CommunicationObject.viewFrom.getText().substring(0, CommunicationObject.viewFrom.getText().indexOf(" -")),CommunicationObject.senderName.getText());
			AssertJUnit.assertEquals(CommunicationObject.viewTo.getText(), "Vendor 1");
			AssertJUnit.assertEquals(CommunicationObject.viewCC.getText(), "Kathiresh Kumar");
			AssertJUnit.assertEquals(CommunicationObject.viewMailType.getText(), "Letter");
			AssertJUnit.assertEquals(CommunicationObject.viewFromOrg.getText(), "LNT Construction");
			AssertJUnit.assertEquals(CommunicationObject.viewToOrg.getText(), "LNT Construction");
			AssertJUnit.assertEquals(CommunicationObject.viewDisciplie.getText(), "Electrical");
			AssertJUnit.assertEquals(CommunicationObject.viewSubject.getText(),"Automation Testing Subject");
			AssertJUnit.assertEquals(CommunicationObject.viewBody.getText(), "Automation Testing Body");
			AssertJUnit.assertEquals(CommunicationObject.viewSignature.getText(), "Thanks & Regards,");		
		}
		//(dependsOnMethods="verifyingUnderSentCommunication")
		public static void gridVerificationSent() throws InterruptedException {	
			Login.driver.navigate().refresh();
			
			common_controls.filterSearch(newMessageNumber);
			CommunicationObject.sent.click();
			AssertJUnit.assertEquals(CommunicationObject.sentOnDate.getText(), communicationComposedDate);
			AssertJUnit.assertEquals(CommunicationObject.gridSubject.getText(), "Automation Testing Subject");		
			AssertJUnit.assertEquals(CommunicationObject.gridFrom.getText(), CommunicationObject.logedInUserName.getText());		
		}
		//(dependsOnMethods="gridVerificationSent")
		public static void gridVerificationInbox() throws InterruptedException {
			Login.driver.navigate().refresh();		
			common_controls.filterSearch("HMRL-E-LNT-LNT-00019");
			CommunicationObject.inbox.click();
			AssertJUnit.assertEquals(CommunicationObject.gridSubject.getText(), "Automation Testing Subject");
			AssertJUnit.assertEquals(CommunicationObject.gridFrom.getText(), "Vendor 1");
			AssertJUnit.assertEquals(CommunicationObject.gridStatus.getText(), "Read");
			AssertJUnit.assertEquals(CommunicationObject.sentOnDate.getText(), "02-Feb-2022");	
		}
		//(dependsOnMethods="gridVerificationInbox")
		public static void forwardMessage() throws InterruptedException {
			Login.driver.navigate().refresh();
			common_controls.Search("HMRL-E-LNT-LNT-00019", "Message Number" );
			CommunicationObject.viewSentMessage.click();		
			String frwsubject=CommunicationObject.viewSubject.getText();
			String frwbody=CommunicationObject.viewBody.getText();
			CommunicationObject.closeViewMessage.click();
			CommunicationObject.selectMessageToFrw.click();
			CommunicationObject.forward.click();
			CommunicationObject.replyMessageHeader.click();
			CommunicationObject.to.sendKeys("Kathiresh Kumar");
			CommunicationObject.ccMemebersCtrl.sendKeys("Kathiresh Kumar");
			CommunicationObject.ccMemebersCtrl.click();		
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.ccMemebersCtrl));
			List<WebElement> listofcc = CommunicationObject.selectCC;
			for (WebElement webElement : listofcc) {
				
				if(webElement.getText().equals("Kathiresh Kumar"))
				{
					webElement.click();
				}
			}
			CommunicationObject.replyMessageHeader.click();
			CommunicationObject.bcMemebersCtrl.sendKeys("Kathiresh Kumar");
			CommunicationObject.bcMemebersCtrl.click();
			//WebDriverWait waitbc=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.bcMemebersCtrl));
			List<WebElement> listbc = CommunicationObject.selectBcc;		 
			for (WebElement webElement : listbc) {
				if(webElement.getText().equals("Kathiresh Kumar")) {
					webElement.click();				
				}
			}
			CommunicationObject.replyMessageHeader.click();
			String verifingSubject=CommunicationObject.messageSubject.getAttribute("value");
			System.out.println(verifingSubject);
			CommunicationObject.messageBodyText.click();
			WebElement iframeMsg = CommunicationObject.frameSwitch;        
			Login.driver.switchTo().frame(iframeMsg);
			WebElement body = CommunicationObject.messageBodyTexts; 
			System.out.println(body.getText());
			String verifingbody=body.getText();//CommunicationObject.messageBodyTexts.getText();
			AssertJUnit.assertEquals(verifingSubject, "FW: " + frwsubject);
			AssertJUnit.assertEquals(verifingbody, frwbody);
			Login.driver.switchTo().parentFrame();
			CommunicationObject.sendMessage.click();
			//WebDriverWait successMessage=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.bcMemebersCtrl));
			AssertJUnit.assertEquals(CommunicationObject.successMessage.getText(), "Success");
			AssertJUnit.assertEquals(CommunicationObject.successMessageText.getText(), "Mail Sent successfully");
		}
	
	//praveen
	
		//
		public static void registerIncomingMessage() throws InterruptedException {
			CommunicationObject.createMessage.click();
			WebDriverWait wait=new WebDriverWait(Login.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(CommunicationObject.regIncomingMsg));
			CommunicationObject.regIncomingMsg.click();
			assertEquals(CommunicationObject.registerIncomingMessage.getText(), "Register Incoming Message");
			CommunicationObject.projectCode.sendKeys("HMRL - L&T Metro HMRL");
			CommunicationObject.discipline.sendKeys("C - Civil");
			CommunicationObject.fromOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.toOrg.sendKeys("LNT - LNT Construction");
			CommunicationObject.mailType.sendKeys("Letter");
			CommunicationObject.from.sendKeys("Kathiresh Kumar");
			CommunicationObject.to.sendKeys("Vendor 1");
			CommunicationObject.ccMemebersCtrl.sendKeys("Vendor");
			CommunicationObject.subject.sendKeys("Register Incoming Message.");
			CommunicationObject.messageBody.sendKeys("Testing Register Incoming Message.");
			CommunicationObject.sentOnCalender.click();
			CommunicationObject.sentOnMonthSelection.click();
			CommunicationObject.sentOnMonthSelection.click();//to select year
			Thread.sleep(3000);
			List<WebElement> year = CommunicationObject.selectYear;
			for (WebElement webElement : year) {
				System.out.println(webElement.getText());
				if(webElement.getText().equals("2022")) {				
					System.out.println("year="+webElement.getText());
					webElement.click();
				}
				
			}
			List<WebElement> month = CommunicationObject.selectYear;
			for (WebElement webElement : month) {
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Dec")) {
					System.out.println("Month="+webElement.getText());
					webElement.click();
				}
			}
			Thread.sleep(3000);
			List<WebElement> day = CommunicationObject.selectYear;
			for (WebElement webElement : day) {
				System.out.println(webElement.getText());
				if(webElement.getText().equals("1")) {
					System.out.println("Day="+webElement.getText());
					webElement.click();
				}
			}
		
			
			


	
	
	
	
	
	
		}	
	
	
	
}
*/