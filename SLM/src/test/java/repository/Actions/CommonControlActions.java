package repository.Actions;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.Locators.CommonControlObject;
import stepdefinition.Webdriver;

public class CommonControlActions {
	static JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	static String documentNumbers;
	static WebDriverWait wait=new WebDriverWait(Webdriver.driver, 30);
	public CommonControlActions() 
	{			
		PageFactory.initElements(Webdriver.driver, CommonControlObject.class);		
	}

	public static void clickSearchicon() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.all));	
		 CommonControlObject.all.click();
		 wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.refresh));	
		 CommonControlObject.refresh.click();
		 wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.advanceSearch));	
		 Thread.sleep(2000);
		 CommonControlObject.advanceSearch.click();	 
	}
	public static void sendDocumentNumber(String documentNumber) throws InterruptedException {		
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.docNo)); 
		documentNumbers=documentNumber;
		CommonControlObject.docNo.sendKeys(documentNumbers);
	}
	public static void searchResultbutton() {
		System.out.println("search button clicked");
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.search));	
		  CommonControlObject.search.click();
		  wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.refresh));
		  CommonControlObject.refresh.click();
		  System.out.println("refereshed");
	}
	public static void searchResult() {
		wait.until(ExpectedConditions.textToBePresentInElement(CommonControlObject.pageNumberSzie, "1 - 1 of 1 items"));
		  assertEquals(documentNumbers, CommonControlObject.searchDocNumber.getText());
		  Actions action = new Actions(Webdriver.driver);
			action.moveToElement(CommonControlObject.searchDocNumber).perform();		
		  System.out.println(CommonControlObject.searchDocNumber.getText());
	} 
	public static void clickFilter() {
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.filter));
		try {
			CommonControlObject.filter.click();
		}catch (Exception e) {
			js.executeScript("arguments[0].click();", CommonControlObject.filter);
		}
		 
	}

	public static void sendDocNumberToFilter(String number) throws InterruptedException {
		  wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.docfilternumber));
		  Thread.sleep(3000);
		  CommonControlObject.docfilternumber.sendKeys(number);
		  refresh();
	}
		 
	
	public static void sendDocNumberToFilterApproveDoc(String number) {
		 wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.docfilternumber));
		  CommonControlObject.docfilternumber.sendKeys(number);		 
	}
	public static void refresh() {
		 try {
				CommonControlObject.refresh.click();
			}catch (Exception e) {
				js.executeScript("arguments[0].click();", CommonControlObject.refresh);
			}
	
	}

	public static void filtersearchResult(String documentNumbers) throws InterruptedException {	
		CommonControlActions.allTab();
		wait.until(ExpectedConditions.textToBePresentInElement(CommonControlObject.pageInfo, "1 - 1 of 1 items"));
		assertEquals(documentNumbers, CommonControlObject.searchDocNumber.getText());		
	}

	public static void allTab() throws InterruptedException {
		 boolean status = CommonControlObject.all.isEnabled();		  
		  if(status==true) {
			  wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.all));
			  
			  try {
				  Thread.sleep(2000);
				  CommonControlObject.all.click(); //testpk
			} catch (Exception e) {
				Thread.sleep(2000);
				js.executeScript("arguments[0].click();", CommonControlObject.all);
			}
			  refresh();
		  }
	}
	public static void lastPage() throws InterruptedException {	
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(CommonControlObject.lastPage);	
		actions.click().build().perform();		
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.lastPage));
		  if(CommonControlObject.lastPage.isEnabled()) {
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.lastPage));
		try {
			Thread.sleep(2000);
			 CommonControlObject.lastPage.click();			 
		}catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", CommonControlObject.lastPage); //testpk
		}
		  
		  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Last Page Visited.");
		  }else {			  
			  com.vimalselvam.cucumber.listener.Reporter.addStepLog("There is no next page.");
		  }
	}

	public static void firstPage() throws InterruptedException {
		Thread.sleep(4000);
		  if(CommonControlObject.firstPage.isEnabled()) {
			 
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.firstPage));
				  try {
					  CommonControlObject.firstPage.click();
					  
				  }catch (Exception e) {
					  
					  js.executeScript("arguments[0].click();", CommonControlObject.firstPage);
					  }
				  System.out.println("Moved to firstPage ");
		  }
			  
			  
	}

	public static void nextPage() {
		if(CommonControlObject.nextPage.isEnabled()) {
				wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.nextPage));
				  try {
					  CommonControlObject.nextPage.click();
					  
				  }catch (Exception e) {
					  
					  js.executeScript("arguments[0].click();", CommonControlObject.nextPage);
					  }
				  System.out.println("Moved to nextPage ");
		  }	
	}

	public static void previousPage() {
		if(CommonControlObject.previousPage.isEnabled()) {
//			  CommonControlObject.previousPage.click();
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.previousPage));
			  try {
				  CommonControlObject.previousPage.click();
				  
			  }catch (Exception e) {
				  
				  js.executeScript("arguments[0].click();", CommonControlObject.previousPage);
				 
				 
			} System.out.println("Moved to previousPage ");
			  
			  
	}}

	public static void forActionTab() {
		boolean status = CommonControlObject.forAction.isEnabled();		  
		  if(status==true) {
			  try {
				  CommonControlObject.forAction.click();
				  CommonControlActions.refresh();
			  }catch (Exception e) {
				  System.out.println("Foraction in catch block");
				  js.executeScript("arguments[0].click();", CommonControlObject.forAction);
				  System.out.println("forAction clicked");
				  CommonControlActions.refresh();
			}
			 
		  }
	}

	public static void inProgressTab() {
		boolean status = CommonControlObject.inprogress.isEnabled();	
		  if(status==true) {
			  try {
				  System.out.println("Recall Executed in try");
				  CommonControlObject.inprogress.click();
				  CommonControlActions.refresh();
			  }catch (Exception e) {
				  System.out.println("Inprogress in catch block");
				  js.executeScript("arguments[0].click();", CommonControlObject.inprogress);
				  System.out.println("Inprogress clicked");
				  CommonControlActions.refresh();
			}
			  
		  }
	}

	public static void authorizedTab() {
		boolean status = CommonControlObject.authorized.isEnabled();		  
		  if(status==true) {
			  CommonControlObject.authorized.click();
			  CommonControlObject.refresh.click();
		  }	
	}

	public static void expiredTab() {
		boolean status = CommonControlObject.expired.isEnabled();		  
		  if(status==true) {
			  CommonControlObject.expired.click();	
			  CommonControlObject.refresh.click();
		  }
	}

	public static void NumberOfItems() throws InterruptedException {
		CommonControlObject.show.sendKeys("20");
		wait.until(ExpectedConditions.textToBePresentInElement(CommonControlObject.pageInfo, "20"));
		assertEquals("20", CommonControlObject.pageInfo.getText().substring(4,6));
	}

	public static void gridMinAndMax() {
		CommonControlObject.expand.click();
		if(CommonControlObject.collapse.isEnabled()) {
			CommonControlObject.collapse.click();
		}
	}	
	
	public static WebDriverWait wait(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));	
		return wait;
	}
	public static void clickDocumentNumberToView() {
		CommonControlObject.searchDocNumber.click();
		
	}

	public static void fileUpload() throws InterruptedException, AWTException {
		CommonControlActions.clickFilter();
		CommonControlActions.sendDocNumberToFilter(documentNumbers);
		CommonControlActions.filtersearchResult(documentNumbers);
		CreateRCAction.verifyCreatedRC();
		CreateRCAction.uploadAttachment();		
	}

	public static void fileDownload() throws AWTException {
		Actions actions = new Actions(Webdriver.driver);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.attachmentViewDownload));
		CommonControlObject.attachmentViewDownload.click();
		assertEquals("Attachment Viewer", CommonControlObject.attachmentWindowTitle.getText());
		actions.moveToElement(CommonControlObject.attachedDocumentName).click().build().perform();	
		assertEquals("Upload Files.txt", CommonControlObject.attachedDocumentName.getAttribute("title"));		
		Robot close=new Robot();
		close.keyPress(KeyEvent.VK_ESCAPE);
		close.keyRelease(KeyEvent.VK_ESCAPE);
	}
}