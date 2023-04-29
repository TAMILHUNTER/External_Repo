package stepdefinition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import object_repository.Locators.RepositoryDocObject;

public class FileUpload {

	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10000);
//	static String fileuploadpath = "$(system.defaultworkingdirectory)\\UI\\EDMS\\uploadFile\\Upload Files.txt";
//	static String fileuploadpath = "Downloads\\QA_testing.xlsx";
	static String fileuploadpath = System.getProperty("user.dir")+"\\src\\main\\upload";
//	static String fileName = "\\Upload Files.txt";
	static String fileName = "\\QA_testing.xlsx";
	static Robot robot;
//	public static String fileuploadpath;
//	RepositoryDocument cca=new RepositoryDocument();
//	static RepositoryDocObject cco=new RepositoryDocObject();
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	
	@Then("^file upload in Repo Sample$")
	public void file_upload_in_Repo_Sample() throws Throwable {
		RepositoryDocObject.AllTab.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocSelectKK.click();
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AttachTable));
		RepositoryDocObject.AttachTable.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DocFileUpload));
		RepositoryDocObject.DocFileUpload.click();
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
//			fileuploadpath=ConfigFileReader.getDocFileUpload();
//			 StringSelection stringSelection = new StringSelection(System.getProperty("user.dir")+fileuploadpath);
		StringSelection stringSelection = new StringSelection(file);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);
		System.out.println("String from Clipboard:" + actualCopedText);

		  Webdriver.driver.getWindowHandles();
//		String parent=Webdriver.driver.getWindowHandle();
//		JavascriptExecutor jss = (JavascriptExecutor) Webdriver.driver;
//		Webdriver.driver.switchTo().window(parent);
		Actions builder = new Actions(Webdriver.driver); 
////		WebElement from = Webdriver.driver.findElement(By.xpath("//label[@for='fileDropRef']"));	
//		
//		//  It will return the parent window name as a String
////	    String mainWindow=Webdriver.driver.getWindowHandle();
////	    // It returns no. of windows opened by WebDriver and will return Set of Strings
////	    Set<String> set =Webdriver.driver.getWindowHandles();
////	    // Using Iterator to iterate with in windows
////	    Iterator<String> itr= set.iterator();
////	    while(itr.hasNext()){
////	    String childWindow=itr.next();
////	    // Compare whether the main windows is not equal to child window. If not equal, we will close.
////	    if(!mainWindow.equals(childWindow)){
////	    	Webdriver.driver.switchTo().window(childWindow).getWindowHandles();
////		    System.out.println("Demo");
//////	    System.out.println(Webdriver.driver.switchTo().window(childWindow).getTitle());
////	    	 Webdriver.driver.switchTo().window(childWindow).getWindowHandles();
////	  System.out.println("Sample");
//		
//		String parent=Webdriver.driver.getWindowHandle();
//		
////		Webdriver.driver.switchTo().window(parent).getWindowHandle();
//		builder.dragAndDropBy(null, 100,100).perform();	
//	//Perform dragAndDropBy 
//			//Building a drag and drop action
//	  WebElement childWindo = RepositoryDocObject.DocFileUpload;
//		builder.dragAndDropBy(childWindo, 50,50).perform();	
		builder.dragAndDropBy(RepositoryDocObject.DocFileUpload, 100, 100).perform();
//			Actions dragAndDrop = builder.clickAndHold();
//			dragAndDrop.moveToElement(childWindo).release().build();
//			//Performing the drag and drop action
//		Webdriver.driver.switchTo().window(parent).getWindowHandle();
//		builder.clickAndHold().dragAndDrop(childWindo, null).build().perform();
//		System.out.println("Dropped");
////		Webdriver.driver.switchTo().window(actualCopedText).getWindowHandles();
		builder.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).build().perform();
		Thread.sleep(2000);
		builder.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Window");
//		Thread.sleep(2000);	
		
//		 // It will return the parent window name as a String
//		    String mainWindow=Webdriver.driver.getWindowHandle();
//		    // It returns no. of windows opened by WebDriver and will return Set of Strings
//		    Set<String> set =Webdriver.driver.getWindowHandles();
//		    // Using Iterator to iterate with in windows
//		    Iterator<String> itr= set.iterator();
//		    while(itr.hasNext()){
//		    String childWindow=itr.next();
//		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
//		    if(!mainWindow.equals(childWindow)){
//		    	Webdriver.driver.switchTo().window(childWindow).getWindowHandles();
//			    System.out.println("Demo");
////		    System.out.println(Webdriver.driver.switchTo().window(childWindow).getTitle());
//		    	 Webdriver.driver.switchTo().window(actualCopedText).getWindowHandles();
//		  System.out.println("Sample");
		  
//		robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.delay(200);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", RepositoryDocObject.fileTypeClr);
		RepositoryDocObject.UploadFileType.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
		RepositoryDocObject.uploadDocument.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FileUploadClose));
		RepositoryDocObject.FileUploadClose.click();
		Thread.sleep(2000);
	 
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
