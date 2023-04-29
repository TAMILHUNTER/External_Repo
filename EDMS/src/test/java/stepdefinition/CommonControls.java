//package stepdefinition;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//import java.awt.AWTException;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.vimalselvam.cucumber.listener.Reporter;
//import object_repository.Locators.*;
//
//public class CommonControls {
//
//	static boolean status;	
//	static JavascriptExecutor jse = (JavascriptExecutor) Login.driver;
//	static String transmittalNumber;
//	public static void search_ion() {    	    	
//    	status=repository_document_object.repo_Search.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Search Icon is enabled");
//    	System.out.println("Search Icon Is Enabled");    	    	
//    }
//         
//    public static void view_icon() {    	    	
//    	status=repository_document_object.repo_View.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("View Icon is enabled");
//    	System.out.println("View Icon Is Enabled");
//    }
//     
//    public static void share_icon() {
//    	
//    	status=repository_document_object.repo_Share.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Share Icon is enabled");
//    	System.out.println("Share Icon Is Enabled");
//    }
//    
//    public static void email_icon() {
//    	
//    	status=repository_document_object.repo_Email.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Email Icon is enabled");
//    	System.out.println("Email Icon Is Enabled");
//    }
//    
//    public static void create_icon() {
//    	
//    	status=repository_document_object.repo_Create.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Create Icon is enabled");
//    	System.out.println("Create Icon Is Enabled");
//    }
//    
//    public static void reject_icon() {
//    	
//    	status=repository_document_object.repo_Reject.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Reject Icon is enabled");
//    	System.out.println("Reject Icon Is Enabled");
//    }
//    
//    public static void approve_icon() {
//    	
//    	status=repository_document_object.repo_approve.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Approve Icon is enabled");
//    	System.out.println("Approve Icon Is Enabled");
//    }
//    
//    public static void all_tab() {
//    	
//    	status=repository_document_object.repo_All.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("All Tab is enabled");
//    	System.out.println("All Is Enabled");
//    }
//    
//    public static void for_action_tab() {
//    	
//    	status=repository_document_object.repo_Foraction.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("For Action Tab is enabled");
//    	System.out.println("For Action Is Enabled");
//    }
//    
//    public static void inprogress_tab() {
//    	
//    	status=repository_document_object.repo_InProgress.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("InProgress Tab is enabled");
//    	System.out.println("InProgress Is Enabled");
//    }
//    
//    public static void rejected_tab() {
//    	
//    	status=repository_document_object.repo_Rejected.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Reject Tab is enabled");
//    	System.out.println("Reject Is Enabled");
//    }
//     
//    public static void approve_tab() {
//    	
//    	status=repository_document_object.repo_Approved.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Approved Tab is enabled");
//    	System.out.println("Approved Is Enabled");
//    }
//    
//    public static void latest_revision() {
//    	
//    	status=repository_document_object.repo_revision.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Revision button is enabled");
//    	System.out.println("Revision button Enabled");
//    }
//    
//    public static void recordsperpage() {
//    	
//    	status=repository_document_object.recordsperpage.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Records Perpage is enabled");
//    	System.out.println("Records Perpage button Enabled");
//    }
//    
//    public static void excel_download() {
//    	
//    	status=repository_document_object.download_excel.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Download Excel is enabled");
//    	System.out.println("Download Excel button Enabled");
//    }
//     
//    public static void excel_upload() {
//    	
//    	status=repository_document_object.upload_excel.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Upload Excel is enabled");
//    	System.out.println("Upload Excel button Enabled");
//    }
//    
//    public static void expand() {
//    	
//    	status=repository_document_object.expand.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Expand grid is enabled");
//    	System.out.println("Expand Grid Button Enabled");
//    }
//    
//    public static void last_30days_records() {
//    	
//    	status=repository_document_object.view_lastdaysrecords.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("Last 30 Days Records is enabled");
//    	System.out.println("Last 30 Days Records drop down Enabled");
//    }
//    
//    
//    public static void myDoc() {
//    	
//    	status=repository_document_object.repo_MyDoc.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("My Document is enabled");
//    	System.out.println("My Document is Enabled");
//    }
//    
//    
//    public static void myOrgDoc() {
//    	
//    	status=repository_document_object.repo_MyOrgDoc.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("My Org Document is enabled");
//    	System.out.println("My Org Document is Enabled");
//    }
//    
//    public static void myAllDoc() {
//    	
//    	status=repository_document_object.repo_AllDoc.isEnabled();
//    	assertTrue(status);
//    	Reporter.log("All Org Document is enabled");
//    	System.out.println("All Org Document is Enabled");
//    }
//    
//	public static void template_download() throws InterruptedException {
//    	
//		repository_document_object.engr_excel_template_download.click();
//		String expected_file_name="Edms_excel_upload";
//		File folder = new File(System.getProperty("user.home") + "\\Downloads");
//		Thread.sleep(3000);
//		File[] listOfFiles = folder.listFiles();
//		boolean found = false;
//		//File f = null;
//		 	for (File listOfFile : listOfFiles) {
//		 if (listOfFile.isFile()) {
//		      String fileName = listOfFile.getName();
//		      // System.out.println("File " + listOfFile.getName());
//		       if (fileName.matches("Edms_excel_upload.xlsx")) {
//		    //     f = new File(fileName);
//		           found = true;		           
//		           assertEquals(expected_file_name, "Edms_excel_upload");
//		           Reporter.log("File has been identified.");
//		           System.out.println("File Found = " + expected_file_name);
//		            }
//		        }
//		    }
//		 	
//		 	assertEquals("Downloaded document is not found",found);	
//		
//	  }
//	
//	  public static void fileAttachment(String inputFilePath, String fileName, String fileType) throws AWTException, InterruptedException {
//		PageFactory.initElements(Login.driver, repository_document_object.class);
//		PageFactory.initElements(Login.driver, CommonControlObject.class);
//		Thread.sleep(3000);
//  	    String file=inputFilePath+fileName;
//  	    StringSelection selection=new StringSelection(file);
//  	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//  	    Thread.sleep(3000);
//  	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_V);    	    
//	    robot.keyRelease(KeyEvent.VK_V);    	    
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_ENTER);    	    
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//  	    System.out.println("After robot class");
//	    String actual=fileName;	  
//	    System.out.println("File Name = "+actual+"File Type = "+fileType);	
//	    assertEquals(actual, repository_document_object.attachmentName.getText());
//	    repository_document_object.fileType.sendKeys(fileType);	 
//	    System.out.println("File type sent");
//	    repository_document_object.upload.click();	    
//	    System.out.println("Upload clicked");
//	    Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	    
//	    jse.executeScript("arguments[0].click();", repository_document_object.closingUploadWizard);
//	    Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	    	    
//	    jse.executeScript("arguments[0].click();", CommonControlObject.attachmentVerificationIcon);
//	    System.out.println("Attached file name matached = " + CommonControlObject.attachedFileName.getText());
//	    //WebDriverWait wait = new WebDriverWait(Login.driver, 10);
//    	//wait.until(ExpectedConditions.elementToBeClickable(repository_document_object.closewindow));	    
//	    Reporter.log("File Attachment Successfull");
//	    System.out.println("File Attachment Completed & success");	    
//	  }
//	
//	    public static void loginForVerification(String userName, String password) throws InterruptedException, AWTException{
//	    	PageFactory.initElements(Login.driver, LoginObject.class);
//	    	//Login.chrome();	    	
//	    	//JavascriptExecutor jse = (JavascriptExecutor) Login.driver;
//		    //jse.executeScript("arguments[0].click();", LoginObject.other);
//	    	Login.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    	LoginObject.other.click();
//			System.out.println("EMDS Other employee login tab clicked");		
//	    	LoginObject.username.sendKeys(userName);    	
//	    	LoginObject.password.sendKeys(password);    		    	
//	    	LoginObject.loginbutton.click();
//	    	Reporter.log("Login Success & landed to home page dashboard");
//	    	System.out.println("Login for verification success.");
//	    	//PageFactory.initElements(Login.driver, CommondashboardObject.class);
//	    	Commondashboard.commondashboard();
//	    	}
//	    
//	    public static void mailVerification(String messageNumber) throws InterruptedException, AWTException
//	    {
//	    	    
//	    		Login.driver.close();
//				loginForVerification("Kathiresh-k", "K@thir2323");				
//				Login.driver.navigate().refresh();
//				Login.driver.navigate().to("https://edms4qa.lntecc.com/EdmsUI/communication/communication");
//				PageFactory.initElements(Login.driver, CommonControlObject.class);
//				CommonControlObject.filter.click();
//				System.out.println("Message Number= " + messageNumber);
//				CommonControlObject.inputFilter.sendKeys(messageNumber);
//				String receiverInbox=CommonControlObject.receiverMessageNumber.getText();
//				assertEquals(messageNumber, receiverInbox);
//				Reporter.log("Message Recevied successfully");
//				System.out.println("Message Recevied Successfully");
//				CommonControlObject.profileClick.click();
//				CommonControlObject.profileOut.click();
//				loginForVerification("Vendor_1", "Edms@1234");
//				//Login.driver.close();
//			}
//	    
//	    public static void documentApprove(String documentNumber) throws InterruptedException, AWTException
//	    {	    		
//	    		//JavascriptExecutor executors = (JavascriptExecutor) Login.driver;
//	    		String documentNumberApprove=documentNumber;
//				loginForVerification("Kathiresh-k", "K@thir2323");	
//				System.out.println("Control again to document approval");
//				//Login.driver.navigate().refresh();
//				Login.driver.navigate().to("https://edms4qa.lntecc.com/EdmsUI/documents/document");
//				PageFactory.initElements(Login.driver, CommonControlObject.class);
//				PageFactory.initElements(Login.driver, repository_document_object.class);
//				CommonControlObject.filter.click();
//				System.out.println("Message Number= " + documentNumberApprove);
//				common_controls.filterSearch(documentNumberApprove);
//				String status =repository_document_object.documentStatus.getText();
//				assertEquals(status, "For Action");
//				repository_document_object.repo_Foraction.click();
//				repository_document_object.select_result.click();
//				repository_document_object.approve.click();
//				//JavascriptExecutor executors = (JavascriptExecutor) Login.driver;
//				CommonControlObject.warningMessageClose.click();
//				//executors.executeScript("arguments[0].click();",repository_document_object.repo_All);
//				repository_document_object.repo_All.click();
//				//JavascriptExecutor executors1 = (JavascriptExecutor) Login.driver;
//				//executors.executeScript("arguments[0].click();",CommonControlObject.profileClick);
//				CommonControlObject.profileClick.click();
//				//CommonControlObject.profileClick.click();
//				//JavascriptExecutor executors2 = (JavascriptExecutor) Login.driver;
//				//executors.executeScript("arguments[0].click();",CommonControlObject.profileOut);
//				CommonControlObject.profileOut.click();
//				//executors.executeScript("arguments[0].click();",LoginObject.other);
//				//LoginObject.other.click();				
//				loginForVerification("Vendor_1", "Edms@1234");
//				//Login.driver.close();
//				System.out.println("Approved Completed and returned to creator login.");
//			}
//	    
//	    public static void sharedocumentVerification(String docnumber) throws InterruptedException, AWTException
//	    {
//	    		Login.driver.close();
//				loginForVerification("Kathiresh-k", "K@thir2323");				
//				Login.driver.navigate().refresh();
//				Login.driver.navigate().to("https://edms4qa.lntecc.com/EdmsUI/documents/document");
//				PageFactory.initElements(Login.driver, CommonControlObject.class);
//				CommonControlObject.filter.click();
//				System.out.println("Document Number= " + docnumber);
//				CommonControlObject.inputFilter.sendKeys(docnumber);
//				String receiverdocnumber = CommonControlObject.receiverMessageNumber.getText();
//				assertEquals(docnumber, receiverdocnumber);
//				Reporter.log("Document Recevied successfully");
//				System.out.println("Document Recevied Successfully");
//				CommonControlObject.profileClick.click();
//				CommonControlObject.profileOut.click();
//				Login.driver.close();
//			}	
//	    
//	    public static void viewAllrecords() {
//	    	try {
//	    		CommonControlObject.viewLastAll.click();
//	    		CommonControlObject.viewLastAll.sendKeys("All");
//	    	}
//	    	catch(Exception e){
//	    		CommonControlObject.viewLastAllT.click();
//	    		CommonControlObject.viewLastAllT.sendKeys("All");
//	    		CommonControlObject.viewLastAllT.sendKeys(Keys.RETURN);
//	    	}
//	    }
//	    
//	    public static void viewAllrecordsTransmittal() {
//	    	CommonControlObject.viewLastAllT.click();
//	    	CommonControlObject.viewLastAllT.sendKeys("All");
//	    }
//	    
//	    public static void viewRecordsMonth(String days) {
//	    	CommonControlObject.viewLastAll.click();
//	    	CommonControlObject.viewLastAll.sendKeys(days);	    	
//	    }
//	    
//	    public static void revision(String documentnumber) throws InterruptedException {
//	    	int documetnumbersize=0;
//	    	int size=0;	    	
//	    	CommonControlObject.revision.click();
//	    	CommonControlObject.filter_value.sendKeys(documentnumber);
//	    	CommonControlObject.selectAllRevision.click();
//	    	try {
//	    		CommonControlObject.selectAllRevision.click();
//	    	}catch (Exception e) {
//	    		CommonControlObject.selectAllRevision.click();
//			}
//	    	
//	    	List<WebElement> documentRevisonConfirmation = CommonControlObject.listofdocumentnumber;
//	    	System.out.println("in common controls");	    	
//	    	for (WebElement webElement : documentRevisonConfirmation) {
//					String documentNumbers=webElement.getText();
//					if(documentNumbers.equals(documentnumber))
//					{
//					size+=documetnumbersize+1;
//					System.out.println(size);
//					}	
//					
//			}
//	    	if(size>1) {
//	    		try {
//	    			System.out.println("Document has revision = " + size + "= Revisions Found" );
//		    		Reporter.log("Document has revision = " + size + "= Revisions Found" );	
//	    		}
//	    		catch (Exception e) {
//	    			System.out.println("Document has revision : " + size + " = Revisions Found" );
//		    		Reporter.log("Document has revision : " + size + " = Revisions Found" );	
//				}
//	    		
//	    	}
//	    	else {
//	    		System.out.println("No Revision Found");
//	    		Reporter.log("No revision found");
//	    	}
//	    }
//	    
//	    public static void lastPage() throws InterruptedException {
//	    	boolean lastpagestatus = CommonControlObject.lastpage.isEnabled();
//	    	if(lastpagestatus==true) {
//	    		System.out.println("In Last Page if Conditions");
//	    		// WebDriverWait wait = new WebDriverWait(Login.driver, 3000); 
//	    		// WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.lastpage));
//	    		 //element.click();
//	    		Thread.sleep(3000);	    		
//	    		CommonControlObject.lastpage.click();	    		
//	    		 System.out.println("Page Navigated");
//	    		Reporter.log("Navigated to last page");	    		
//	    	}
//	    }
//	    
//	    public static void firstPage() {
//	    	boolean firstPage = CommonControlObject.firstPage.isEnabled();
//	    	if(firstPage==true) {
//	    	CommonControlObject.firstPage.click();
//	    	Reporter.log("Navigated to first page");
//	    	}
//	    }
//	    
//	    public static void nextPage() {
//	    	boolean nextPage= CommonControlObject.nextPage.isEnabled();
//	    	if(nextPage==true) {
//	    	CommonControlObject.nextPage.click();
//	    	Reporter.log("Navigated to next page");
//	    	}
//	    }
//	    
//	    public static void previousPage(){
//	    	
//	    	boolean previousPage=CommonControlObject.previousPage.isEnabled();
//	    	if(previousPage==true) {
//	    	CommonControlObject.previousPage.click();
//	    	Reporter.log("Navigated to previous page");
//	    	}
//	    }
//	    
//	    public static void filterSearch(String document_No) throws InterruptedException {
//	    	System.out.println("In Filter Search");
//	    	Login.driver.navigate().refresh();	    	
//	    	common_controls.viewRecordsMonthCommunication("all");
//	    	System.out.println("All Records view");
//	    	CommonControlObject.filter.click();
//	    	CommonControlObject.filter_value.sendKeys(document_No);
//	    	System.out.println("Filter actioned");
//	    	CommonControlObject.repo_All.click();	    		
//	    	System.out.println("brfore wait");
//	    	WebDriverWait wait = new WebDriverWait(Login.driver, 20);	
//	    	
//	    	wait.until(ExpectedConditions.textToBePresentInElement(CommonControlObject.filterWaitUntil, "1 - 1 of 1 items"));	    	
//	    	String foundresults = CommonControlObject.foundresult.getText();
//			System.out.println("Found Ressults = " + foundresults);
//					if (document_No.equals(foundresults)) {						
//						CommonControlObject.select_result.click();
//						Reporter.log("Filter Result Found.");
//						System.out.println("File Attached in = "+document_No);
//			    }
//					else {
//						
//						Reporter.log("Filter Result Not Found.");
//					}
//	    	}
//	    
//	    public static void Search(String document_No, String documentType) throws InterruptedException {	
//	    	WebDriverWait wait ;
//	    	wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.searchIcon));	    	    	
//	    	CommonControlObject.searchIcon.click();
//	    	CommonControlObject.searchValue.sendKeys(document_No);
//	    	CommonControlObject.searchingType.click();
//	    	System.out.println("Document type to search = "+ documentType);
//	    	List<WebElement> searchtype = (List<WebElement>) CommonControlObject.searchType;
//	    	for (WebElement webElement : searchtype) {	    		
//				if(webElement.getText().equals(documentType))
//				{
//					webElement.click();
//					System.out.println("Search Type Clicked");
//					break;
//				}
//					
//			}
//	    	
//	    	//jse.executeScript("arguments[0].click();", CommonControlObject.searchButton);
//	    	CommonControlObject.searchButton.click();	   	    	
//	    	System.out.println("Searching operaton started");
//	    	//WebDriverWait wait = new WebDriverWait(Login.driver, 20);
//	    	//wait.until(ExpectedConditions.textToBePresentInElement(repository_document_object.filterWaitUntil, "1 - 1 of 1 items"));	    
//	    	//wait.until(ExpectedConditions.textToBe(repository_document_object.filterWaitUntil2, "1 - 1 of 1 items"));
//	    	System.out.println("After waits");
//	    	String foundresults = CommonControlObject.foundresult.getText();
//			System.out.println("Found Ressults = " + foundresults);
//					if (document_No.equals(foundresults)) {						
//						CommonControlObject.select_result.click();						
//						assertEquals(CommonControlObject.foundresult.getText(), document_No);
//						Reporter.log("Filter Result Found.");
//			    }
//					else {
//						
//						Reporter.log("Filter Result Not Found.");
//					}
//	    	}
//	    
//	    public static void viewRecordsMonthCommunication(String days) {
//	    	System.out.println("Before All comunication");
//	    	WebDriverWait wait;
//			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.repo_All));
//	    	CommonControlObject.repo_All.click();	
//	    	CommonControlObject.viewLastAllC.click();	    	
//	    	CommonControlObject.viewLastAllC.sendKeys(days);
//	    	System.out.println("After All comunication");
//	    }
//	    
//	    public static void date() {
//	        LocalDateTime myDateObj = LocalDateTime.now();  
//	        System.out.println("Before Formatting: " + myDateObj);  
//	        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");  	        
//	        String formattedDate = myDateObj.format(myFormatObj);  
//	        System.out.println("After Formatting: " + formattedDate);  
//	      } 
//	    
//	   /* public static void sendOrRecevieEmail(String categories, String messageNumber, String sentOrReceivedonDate, String subject, String from, String status, String dateOfResponse) {
//	    	String categories=categories; 
//	    	switch(categories) {
//	    	  case inbox:
//	    	    // code block
//	    	    break;
//	    	  case draft:
//	    	    // code block
//	    	    break;
//	    	  case sent:
//	    		  break:
//	    	  case all;
//	    		  break;
//	    	  default:
//	    	    // code block
//	    	}	    	
//	    	
//	    }*/
//	    
//	    public static void noOfRecordsInGrid() throws InterruptedException {
//	    	CommonControlObject.show.click();
//	    	CommonControlObject.show.sendKeys("30");
//	    	CommonControlObject.show.click();
//	    	Thread.sleep(5000);		   	
//	    	CommonControlObject.noOfRecords.getSize();
//	    	//assertEquals(CommonControlObject.noOfRecords.getSize(), 30);
//	    }
//	    
//	    public static void create() {
//	    	CommonControlObject.create.click();
//	    }
//	    
//	    public static void close() {
//	    	CommonControlObject.close.click();
//	    }
//
//		public static void createTransmittal(String Project_Code, String Discipline, String FromOrg, String ToOrg, String Category, String Quantity,
//				String Confidential, String Subject, String From, String To, String CC, String Group_By, String Type, String Remarks) throws AWTException, InterruptedException {			
//			CommonControlObject.projectCode.sendKeys(Project_Code);
//			CommonControlObject.discipline.sendKeys(Discipline);
//			CommonControlObject.fromOrg.sendKeys(FromOrg);
//			CommonControlObject.toOrg.sendKeys(ToOrg);
//			transmittalNumber= CommonControlObject.serialNumberTransmittal.getText();
//			CommonControlObject.category.sendKeys(Category);
//			CommonControlObject.qty.sendKeys(Quantity);
//			if(Confidential.equals("No")) {
//				CommonControlObject.confidential.click();//changed to no
//			}else {
//				CommonControlObject.confidential.click();
//				CommonControlObject.confidential.click();//changed to yes
//			}
//			
//			CommonControlObject.subject.sendKeys(Subject);
//			CommonControlObject.from.sendKeys(From);
//			CommonControlObject.to.sendKeys(To);
//			CommonControlObject.cc.sendKeys(CC);
//			//WebDriverWait wait=new WebDriverWait(Login.driver,3000);
//			//wait.until(ExpectedConditions.elementToBeSelected(CommonControlObject.ccTransmittal));
//			Thread.sleep(3000);
//			CommonControlObject.ccTransmittal.click();
//			Thread.sleep(3000);
//			CommonControlObject.cc.click();
//			CommonControlObject.qty.click();
//			CommonControlObject.noResponseRequired.click();
//			CommonControlObject.groupby.sendKeys(Group_By);
//			CommonControlObject.distributionView.click();
//			assertEquals(CommonControlObject.edit.isEnabled(), true);
//			CommonControlObject.edit.click();
//			assertEquals(CommonControlObject.ccQuantity.getAttribute("value"),CommonControlObject.qty.getAttribute("value"));
//			CommonControlObject.type.sendKeys(Type);
//			CommonControlObject.selectAll.click();
//			CommonControlObject.remarks.sendKeys(Remarks);			
//			CommonControlObject.save.click();			
//		}
//		
//		public static void noAttachment() throws InterruptedException {
//			CommonControlObject.previewTransmittal.click();
//			CommonControlObject.warningMessage.getText();
//			assertEquals(CommonControlObject.warningMessage.getText(), "Warning");
//			Thread.sleep(3000);
//			assertEquals(CommonControlObject.warningMessageBoddy.getText(), "No Documents Attached");
//			CommonControlObject.close.click();
//		}
//		
//		public static void attachment(String AttachmentDocument) {
//			CommonControlObject.Attachment.click();
//			assertEquals(CommonControlObject.attachmentWindow.getText(), "Select Document");
//			CommonControlObject.repositoryDocument.click();
//			CommonControlObject.searchInAll.sendKeys(AttachmentDocument);
//			CommonControlObject.select.click();
//			CommonControlObject.submit.click();
//		}
//		
//		public static void capturefields(String attachment_Type, String attachmentRemarks) {
//			CommonControlObject.editing.click();
//			CommonControlObject.type.sendKeys(attachment_Type);
//			CommonControlObject.selectAll.click();
//			CommonControlObject.remarks.sendKeys(attachmentRemarks);
//			CommonControlObject.save2.click();
//		}
//		
//		public static void sendTransmittal() {
//			CommonControlObject.previewTransmittal.click();
//			CommonControlObject.send.click();
//			assertEquals(CommonControlObject.successMessage.getText(), "Success");
//			CommonControlObject.ok.click();
//			CommonControlObject.mandatoryFieldsOk.click();
//			
//		}
//
//		public static void mandatoryFields() {
//			assertEquals(CommonControlObject.successMessage.getText(), "Warning");
//			assertEquals(CommonControlObject.mandatoryFieldsAreRequried.getText(), "Mandatory fields are required");	
//			CommonControlObject.ok.click();
//		}
//		
////		public static void TakesScreenshot(ITestResult result) throws IOException {
////				/*TakesScreenshot scrShot = ((TakesScreenshot) Login.driver);
////				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
////				File DestFile = new File("E:\\"+".png");
////				FileUtils.copyFile(SrcFile, DestFile);
////				System.out.println("Screenshot for Failed - captured");
////				}*/
////		}		
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
