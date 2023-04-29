package object_repository.Locators;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommunicationObject {
//praveen





		@FindBy(how = How.XPATH, xpath="(//*[@class='mat-tab-label-content']//span)[1]")
		public static WebElement inboxCount;
		
		@FindBy(how = How.XPATH, xpath="(//*[@class='mat-tab-label-content']//span)[2]")
		public static WebElement draftCount;
		
		@FindBy(how = How.XPATH, xpath="(//*[@class='mat-tab-label-content']//span)[3]")
		public static WebElement sentCount;
		
		@FindBy(how = How.XPATH, xpath="(//*[@class='mat-tab-label-content']//span)[4]")
		public static WebElement allCount;
		
		@FindBy(how=How.XPATH,xpath="//*[@class='k-grid-table']//tbody/tr[1]//td[2]//span")
		public static WebElement foundresult;
		
		@FindBy(how=How.XPATH, xpath="//*[@class='k-pager-info k-label']")
		public static WebElement filterWaitUntil; 
		
		@FindBy(how = How.XPATH, using="//div[text()=' Inbox ']")
		public static WebElement inbox;
		
		@FindBy(how = How.XPATH, using="//div[text()=' Draft ']")
		public static WebElement draft;
		
		@FindBy(how = How.XPATH, using="//div[text()=' Sent ']")
		public static WebElement sent;
		
		@FindBy(how = How.XPATH, using="//div[text()=' All ']")
		public static WebElement all;
		
		@FindBy(how = How.XPATH, using="//i[@title='Reply']")
		public static WebElement reply;
		
		@FindBy(how = How.XPATH, using="//i[@title='Reply All']")
		public static WebElement replyAll;
		
		@FindBy(how = How.XPATH, using="//i[@title='Forward']")
		public static WebElement forward;
		
		@FindBy(how = How.XPATH, using="//i[@title='View']")
		public static WebElement viewMessage;
		
		@FindBy(how = How.XPATH, using="//i[@title='Create']")
		public static WebElement createMessage;
		
		@FindBy(how = How.XPATH, using="//span[text()=' COMMUNICATION ']")
		public static WebElement pageTitle;
		
		@FindBy(how = How.XPATH, using="//p[@title='Message']")
		public static WebElement writeMessage;
		
		@FindBy(how = How.ID, using="ibtClose")
		public static WebElement writeMessageClose;
		
		@FindBy(how = How.XPATH, using="//*[@class='mat-dialog-title']//p")
		public static WebElement writeMessageWindowTitle;
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='Project Code * ']")
		public static WebElement projectCode;
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='Discipline * ']")
		public static WebElement discipline;
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='From Org * ']")
		public static WebElement fronOrg;
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='To Org * ']")
		public static WebElement toOrg;
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='Mail Type*']")
		public static WebElement mailtype;
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='To *']")
		public static WebElement to;
		
		@FindBy(how = How.XPATH, using="//div[text()='Yes']")
		public static WebElement inputRequiredYes;
		
		@FindBy(how = How.XPATH, using="//div[text()='No']")
		public static WebElement inputRequiredNo;
		
		@FindBy(how = How.XPATH, using="//input[@formcontrolname='ccMembersCtrl']")
		public static WebElement ccMemebersCtrl;
		
		@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
		public static List <WebElement> selectCC;
		
		@FindBy(how = How.XPATH, using="//*[@formcontrolname='bccMembers']")
		public static WebElement bcMemebersCtrl;
		
		@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
		public static List <WebElement> selectBcc;
		
		@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
		public static WebElement selectBccPresents;
		
		
		@FindBy(how = How.XPATH, using="//input[@placeholder='Subject']")
		public static WebElement messageSubject;
		
		@FindBy(how = How.XPATH, using="//span[text()='Select font family']")
		public static WebElement selectFontFamily;
		
		@FindBy(how = How.XPATH, using="//*[@class='ProseMirror']")
		public static WebElement messageBody;
		
		@FindBy(how = How.ID, using="btnsaveAllDocument")
		public static WebElement saveMessage;
		
		@FindBy(how = How.XPATH, using="//eiptoastalert[@class='ng-star-inserted']//h1")
		public static WebElement successMessage;
		
		@FindBy(how = How.XPATH, using="//div[@class='toast-content mat-dialog-content']//p")
		public static WebElement successMessageText;
		
		@FindBy(how = How.XPATH, using="//div[text()='New Message']")
		public static WebElement newMessage;
		
		@FindBy(how = How.ID, using="btnSave")
		public static WebElement sendMessage;
		
		@FindBy(how = How.XPATH, using="//*[@id='accAccountCodeMaster']//mat-label[2]")
		public static WebElement createdMessageNumber;
		
		@FindBy(how = How.XPATH, using="//*[@id='accAccountCodeMaster']//mat-label")
		public static WebElement verifycreatedMessageNumber;
		
		@FindBy(how = How.XPATH, using="//tbody[@role='presentation']//tr//td[2]/span")
		public static WebElement viewSentMessage;
		
		@FindBy(how = How.XPATH, using="//tbody[@role='presentation']//tr//td[3]/span")
		public static WebElement gridSubject;
		
		@FindBy(how = How.XPATH, using="//tbody[@role='presentation']//tr//td[4]/span")
		public static WebElement gridFrom;
		
		@FindBy(how = How.XPATH, using="//tbody[@role='presentation']//tr//td[5]//span[2]")
		public static WebElement gridStatus;
		
		@FindBy(how = How.XPATH, using="//span[@class='user_name ']")
		public static WebElement logedInUserName;
		
		@FindBy(how = How.XPATH, using="(//div[@class='mat-tab-label-content'])[2]")
		public static WebElement headermessageNumber;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[1]//td[2]")
		public static WebElement messageNumber;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[2]//td[2]")
		public static WebElement sentOn;
		
		@FindBy(how = How.XPATH, using="//tbody[@role='presentation']//tr//td[6]")
		public static WebElement sentOnDate;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[3]//td[2]")
		public static WebElement fromPerson;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[4]//td[2]")
		public static WebElement toPerson;
			
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[5]//td[2]")
		public static WebElement ccPerson;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[6]//td[2]")
		public static WebElement mailType;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[7]//td[2]")
		public static WebElement fromOrg;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[8]//td[2]")
		public static WebElement toOrgs;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[9]//td[2]")
		public static WebElement sentDiscipline;
		
		@FindBy(how = How.XPATH, using="//table[@class='table table-striped table-bordered']//tr[10]//td[2]")
		public static WebElement subject;
		
		@FindBy(how = How.XPATH, using="//*[@class='email-body']//div/p")
		public static WebElement bodyMessage;
		
		@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted k-state-selected']//td)[2]")
		public static WebElement attachingDocumentNumber;
		
		@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted k-state-selected']//td)[3]")
		public static WebElement attachingDocumentTitle;
		
		@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted k-state-selected']//td)[4]")
		public static WebElement attachingDocumentRevision;
		
		@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted k-state-selected']//td)[5]")
		public static WebElement attachingDocumentCreatedBy;
		
		@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table)[2]//td[2]")
		public static WebElement attachedDocumentNumber;
		
		@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table)[2]//td[3]")
		public static WebElement attachedDocumentTitle;
		
		@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table)[2]//td[4]")
		public static WebElement attachedDocumentRevision;
		
		@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table)[2]//td[5]")
		public static WebElement attacheDocumentdCreatedBy;
		
		@FindBy(how = How.XPATH, using="(//table[@class='k-grid-table']/following::table)[2]//td[6]")
		public static WebElement attachedActions;
		
		
		@FindBy(how=How.XPATH, using="//*[@id='accAccountCodeMaster']//i")
		public static WebElement attachmentIcon;	
		
		@FindBy(how=How.XPATH, using="//p[@title='Document']")
		public static WebElement attachmentDocument;
		
		@FindBy(how=How.XPATH, using="//p[@title='Message']")
		public static WebElement attachmentMessage;
		
		@FindBy(how=How.XPATH, using="//input[@placeholder='Search in all repository documents...']")
		public static WebElement searchDocumentToAttach;
		
		@FindBy(how=How.XPATH, using="//button[text()='Submit']")
		public static WebElement submitAttachment;
		
		@FindBy(how=How.XPATH, using="//app-document-message-view//p")
		public static WebElement attachmentWindowTitle;
		
		@FindBy(how=How.XPATH, using="//*[@class='k-header text-center k-grid-draggable-header ng-star-inserted']")
		public static WebElement clickAttachmentToAttach; 
		
		@FindBy(how = How.XPATH, using="//p[text()='ATTACHMENT - Documents']")
		public static WebElement aTTACHMENTDocuments;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[1]//td[2])[1]")
		public static WebElement viewMessageNumber;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[2]//td[2])")
		public static WebElement viewSentOn;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[3]//td[2])")
		public static WebElement viewFrom;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[4]//td[2])")
		public static WebElement viewTo;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[5]//td[2])")
		public static WebElement viewCC;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[6]//td[2])")
		public static WebElement viewMailType;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[7]//td[2])")
		public static WebElement viewFromOrg;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[8]//td[2])")
		public static WebElement viewToOrg;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[9]//td[2])")
		public static WebElement viewDisciplie;
		
		@FindBy(how = How.XPATH, xpath="(//table//tr[10]//td[2])")
		public static WebElement viewSubject;
		
		@FindBy(how = How.XPATH, xpath="(//kendo-grid-list//tbody)[2]//td[2]")
		public static WebElement gridAttachmentSearchResult;
		
		@FindBy(how = How.CLASS_NAME, using="user_name")
		public static WebElement senderName;
		
		@FindBy(how = How.XPATH, using="//span[contains(@class,'k-icon k-i-k-icon')]")
		public static WebElement signature;
		
		@FindBy(how = How.XPATH, using="//span[@class='num']/following-sibling::span")
		public static WebElement testsign;
		
		@FindBy(how = How.XPATH, using="//*[@class='email-body']//p[2]")
		public static WebElement viewSignature;
		
		@FindBy(how = How.XPATH, using="//*[@class='email-body']//p[1]")
		public static WebElement viewBody;
		
		@FindBy(how = How.XPATH, using="//*[@title='Edit']")
		public static WebElement editDraft;
		
		@FindBy(how = How.XPATH, using="//p[text()='Discipline']/following-sibling::p")
		public static  WebElement editDiscipline;
		
		@FindBy(how = How.XPATH, using="//p[text()='Project Code']/following-sibling::p")
		public static  WebElement editProjectCode;
		
		@FindBy(how = How.XPATH, using="//p[text()='From Org']/following-sibling::p")
		public static  WebElement editFromOrg;
		
		@FindBy(how = How.XPATH, using="//p[text()='To Org']/following-sibling::p")
		public static  WebElement editToOrg;
		
		@FindBy(how = How.XPATH, using="//input[@formcontrolname='txtMsgSerialNo']")
		public static WebElement editMessageNo;
		
		@FindBy(how = How.XPATH, using="//input[@formcontrolname='txtSerialNo']")
		public static WebElement editMessageNoLastSet;
		
		@FindBy(how = How.XPATH, using="(//eipautocomplete//input[1])[1]")
		public static WebElement editmailType;
		
		@FindBy(how = How.XPATH, using="//*[@textfield='dedDescription']")
		public static WebElement editClickemailType;
		
		@FindBy(how = How.XPATH, using="(//eipautocomplete//input[1])[2]")
		public static WebElement editTo;
		
		@FindBy(how = How.ID, using="btnSend")
		public static WebElement sendIcon;
		
		@FindBy(how = How.ID, using="toMembers")
		public static WebElement toMembers;
		
		@FindBy(how = How.XPATH, using="//i[contains(@class,'fa fa-times-circle')]")
		public static WebElement closeViewMessage;
		
		@FindBy(how = How.XPATH, using="//td[@role='gridcell']//input[1]")
		public static WebElement selectMessageToFrw;
		
		@FindBy(how = How.XPATH, using="//app-reply-message//p")
		public static WebElement replyMessageHeader;
		
		@FindBy(how = How.XPATH, using="//*[@class='k-editor-content ng-star-inserted']")
		public static WebElement messageBodyText;
		
		@FindBy(how = How.XPATH, using="//div[@class='ProseMirror']/p[1]")
		public static WebElement messageBodyTexts;
		
		@FindBy(how = How.XPATH, using="//iframe[@class='k-iframe']")
		public static WebElement frameSwitch;
		
		@FindBy(how = How.XPATH, using="//div[text()='Register Incoming Message']")
		public static WebElement registerIncomingMessage;
		
		@FindBy(how = How.ID, using="ddlMailFrom")
		public static WebElement from;
		
		@FindBy(how = How.XPATH, using="//span[@class='k-icon k-i-calendar']")
		public static WebElement sentOnCalender;
		
		@FindBy(how = How.XPATH, using="//*[@class='k-button k-bare k-title']")
		public static WebElement sentOnMonthSelection;
		
		@FindBy(how = How.XPATH, using="//li[@class='ng-star-inserted']//span")
		public static List <WebElement> sentonYear;
		
		@FindBy(how = How.XPATH, using="//span[@class='k-link']")
		public static List <WebElement> selectYear;
		
		@FindBy(how = How.XPATH, using="//*[@title='Register Incoming Message']")
		public static  WebElement regIncomingMsg;
	}	

	
	

