package stepdefinition;
import static org.junit.Assert.assertTrue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Locators.EngineeringSchedule;
import object_repository.Locators.RepositoryDocObject;

public class RepositoryDocument {

	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 100);
//	static String fileuploadpath = "$(system.defaultworkingdirectory)\\UI\\EDMS\\uploadFile\\Upload Files.txt";
//	static String fileuploadpath = "Downloads\\QA_testing.xlsx";
	static String fileuploadpath = System.getProperty("user.dir")+"\\src\\main\\upload";
//	static String fileName = "\\Upload Files.txt";
	static String fileName = "\\QA_testing.xlsx";
//	static Robot robot;
	static String selectedDiscipline;
//	public static String fileuploadpath;
//	RepositoryDocument cca=new RepositoryDocument();
//	static RepositoryDocObject cco=new RepositoryDocObject();
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	static boolean status;
	public RepositoryDocument() {

		PageFactory.initElements(Webdriver.driver, RepositoryDocObject.class);
	}

	@Then("^user should able to click main menu$")
	public void user_should_able_to_click_main_menu() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.MenuRepo));
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(RepositoryDocObject.MenuRepo);
		actions.perform();
		System.out.println("Home page Main Menu is enabled");
		Thread.sleep(2000);
	}

	@Then("^user should able to enter Repository Doc$")
	public void user_should_able_to_enter_Repository_Doc() throws Throwable {
//			Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.repositoryDocument));
		RepositoryDocObject.repositoryDocument.click();
		System.out.println("Repository Document page is enabled");
	}

	@Then("^As a user i should able to click create button in Repository Doc$")
	public void As_a_user_i_should_able_to_click_create_button_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.createbtn));
		RepositoryDocObject.createbtn.click();
		System.out.println("Repository Document page Create button is enabled");
	}

	@Then("^As a user i should able to Select Discipline button in Repository Doc$")
	public void As_a_user_i_should_able_to_Select_Discipline_button_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Discipline));
		RepositoryDocObject.Discipline.click();
		System.out.println("Repository Document page Discipline is enabled");
		chooseListOption();
	
	}
	//****************************project
	@Then("^user should able to Switch and Select to Project Gandhi$")
	public void user_should_able_to_Switch_and_Select_to_Project_Gandhi() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectClr));
		status = RepositoryDocObject.ProjectClr.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule Document Create page ResetBTn is enabled");
		RepositoryDocObject.ProjectClr.click();
		System.out.println("Engineering Schedule Document Create page ProjectClr is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectName));
		RepositoryDocObject.ProjectName.sendKeys("O21534");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.GandhiProject));
		RepositoryDocObject.GandhiProject.click();
//		System.err.println(EngineeringSchedule.WarngMessage.getText());
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.InfoChangeYes));
		RepositoryDocObject.InfoChangeYes.click();
		System.out.println("O21534 - Project Gandhi for JRS India Corporation Private Limited  is available in Project name List");

		Thread.sleep(6000);
		if(RepositoryDocObject.AllTab.isDisplayed()) {
			try {
				RepositoryDocObject.AllTab.click();
				 
			}catch (Exception e) {
			
				js.executeScript("arguments[0].click();",RepositoryDocObject.AllTab);
			}
			Thread.sleep(1000);
			Reporter.addScenarioLog("Engineering Schedule page Alltab is enabled");
			System.out.println("Engineering Schedule page Alltab is enabled");
			  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule page Alltab is enabled Visited.");
			  }else {			  
				  com.vimalselvam.cucumber.listener.Reporter.addStepLog("There is no Engineering Schedule page Alltab is enabled.");
				  System.out.println("Engineering Schedule page Alltab is not enabled");
			  }
	}
	
	
	
	//*********************
	
	
	public void chooseListOption() throws Throwable {
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.OptionList));
		List<WebElement> listofOption= RepositoryDocObject.OptionList;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
		System.out.println(listofOption);
		listofOption.get(randnMumber).click();
		System.out.println("Selected Item Random Number is = "+randnMumber);
//		selectedDiscipline = ((WebElement) RepositoryDocObject.OptionList).getAttribute("value");
//		Thread.sleep(2000);
//		System.out.println("Selected Item List is ="+listofOption);
	
	}

	/*@Then("^choose civil Discipline$")
	public void choose_civil_Discipline() throws Throwable {
		//*************************
		if(RepositoryDocObject.Discipline.isEnabled()) {
			RepositoryDocObject.Discipline.click();
			List<WebElement> selectVehicle = RepositoryDocObject.civil;
			int size = selectVehicle.size();
			int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
			System.out.println("Vehicle Selection = "+randomNumber);
			selectVehicle.get(randomNumber).click();
				for(int i=0;i<=randomNumber;i++) {
					System.out.println("Iteration = "+i);				
					vehicle=listofvehicleCart.get(i).getText();
					System.out.println("Vehicle = "+vehicle);				
				}
				//*************************
		RepositoryDocObject.civil.click();
		System.out.println("Repository Document Create page Civil Descipline is enabled");
	}*/

	@Then("^As a user i should able to Choose Area button in Repository Doc$")
	public void As_a_user_i_should_able_to_Choose_Area_button_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Area));
		RepositoryDocObject.Area.click();
		System.out.println("Repository Document Create page Area is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AreaList1));
		RepositoryDocObject.AreaList1.click();
		System.out.println("Repository Document Create page AreaSurat in Area is enabled");
	}


	@Then("^As a user i should able to capture Document type in Repository Doc$")
	public void As_a_user_i_should_able_to_capture_Document_type_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Documenttype));
		RepositoryDocObject.Documenttype.click();
		System.out.println("Repository Document Create page DocumentDWG is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DoctypeDC));
		RepositoryDocObject.DoctypeDC.click();
	}

	@Then("^As a user i should able to Choose Structure in Repository Doc$")
	public void As_a_user_i_should_able_to_Choose_Structure_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Structure));
		RepositoryDocObject.Structure.clear();
		System.out.println("Repository Document Create page Structure is enabled");
		Thread.sleep(2000);
		chooseListOption();
	}


	@Then("^As a user i should able to select PrintSize button in Repository Doc$")
	public void As_a_user_i_should_able_to_select_PrintSize_button_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.PrintSize));
		RepositoryDocObject.PrintSize.click();
		System.out.println("Repository Document Create page PrintSize is enabled");
		chooseListOption();
	}


	@Then("^As a user i should able to capture Title type in Repository Doc$")
	public void As_a_user_i_should_able_to_capture_Title_type_in_Repository_Doc() throws Throwable {
//				RepositoryDocObject.Title.sendKeys(ConfigFileReader.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Title));
		RepositoryDocObject.Title.click();
		RepositoryDocObject.Title.sendKeys(ConfigFileReader.getTitle());
		System.out.println("Repository Document Create page Title is enabled");
		System.out.println("Title : "+ConfigFileReader.getTitle());
		

	}

	@Then("^As a user i should able to select Calendar Date in Repository Doc$")
	public void As_a_user_i_should_able_to_select_Calendar_Date_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Calendar));
		RepositoryDocObject.Calendar.click();
		System.out.println("Repository Document Create page Calender is enabled");

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	    Date date = new Date();
	    String todate = dateFormat.format(date);
	    System.out.println("Todays Date = "+todate);
	    Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, +65);
	    Date todate1 = cal.getTime();    
	    System.out.println(todate1);
		RepositoryDocObject.Calendartype.click();
	   /* int month = todate1.getMonth();
	    int year = todate1.getYear();
	    int day = todate1.getDate();
	    
	    System.out.println("Month  = "+month);
	    System.out.println();
	    String fromdate = dateFormat.format(todate1);
	    System.out.println("Back dated = "+fromdate);
		*/
		
		
	}



	@Then("^As a user i should able to Choose Status in Repository Doc$")
	public void As_a_user_i_should_able_to_Choose_Status_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Status));
		RepositoryDocObject.Status.click();
		System.out.println("Repository Document Create page DocStatus is enabled");
		try {
			chooseListOption();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Status1));
			RepositoryDocObject.Status1.click();
		}

	}

	@Then("^As a user i should able to select Approved By in Repository Doc$")
	public void As_a_user_i_should_able_to_select_Approved_By_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ApprovedForinfo));
		RepositoryDocObject.ApprovedForinfo.click();
		System.out.println("Repository Document Create page ApprovedForinfo is enabled");
		List<WebElement> listofOptions= RepositoryDocObject.OptionList;
		for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Approved By = "+ webElement.getText());
			Thread.sleep(3000);
			if(webElement.getText().equals("Kathiresh Kumar")){
				System.out.println("Selected Approved By Name is :" + webElement.getText());
				webElement.getText();
				webElement.click();
				break;
				}else {
					System.out.println("Above Mentioned Approved By name is not Kathiresh Kumar");
					}
				}
		
	}

	/*@Then("^click AppBy Btn$")
	public void click_AppBy_Btn() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AppBy));
		RepositoryDocObject.AppBy.click();
		System.out.println("Repository Document Create page AppBy is enabled");

	}*/

	/*@Then("^choose Praveentxt in Repo$")
	public void choose_Praveentxt_in_Repo() throws Throwable {
		RepositoryDocObject.Praveentxt.click();
		RepositoryDocObject.AppTxtClrPk.click();
		Thread.sleep(2000);
		RepositoryDocObject.Kathireshtxt.click();
		System.out.println("Repository Document Create page Kathireshtxt is enabled");

	}*/

//				@Then("^choose Kathireshtxt in Repo$")
//				public void choose_Kathireshtxt_in_Repo() throws Throwable {
//					RepositoryDocObject.Praveentxt.click();
//					RepositoryDocObject.AppTxtClrKathiresh.click();
//					Thread.sleep(2000);
//					RepositoryDocObject.Kathireshtxt.click();
//				}

	@Then("^As a user i should able to capture Reference in Repository Doc$")
	public void As_a_user_i_should_able_to_capture_Reference_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Ref));
		RepositoryDocObject.Ref.click();
		RepositoryDocObject.Ref.sendKeys(ConfigFileReader.getReference());
		System.out.println("Repository Document Create page Ref is enabled");
		System.out.println("Reference : "+ConfigFileReader.getReference());

	}

	@Then("^As a user i should able to capture Comment in Repository Doc$")
	public void As_a_user_i_should_able_to_capture_Comment_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.cmnt));
		RepositoryDocObject.cmnt.click();
		RepositoryDocObject.cmnt.sendKeys(ConfigFileReader.getComments());
		System.out.println("Repository Document Create page cmnt is enabled");
		System.out.println("Comments : "+ConfigFileReader.getComments());
	}

	@Then("^As a user i should able to click QRcode toggle in Repository Doc$")
	public void As_a_user_i_should_able_to_click_QRcode_toggle_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.QRcode));
		RepositoryDocObject.QRcode.click();
		Thread.sleep(2000);
		RepositoryDocObject.QRcode.click();
		System.out.println("Repository Document Create page QRcode is enabled");

	}

	@Then("^choose FileLocColumn in Repo$")
	public void choose_FileLocColumn_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.FileLocation.click();
		System.out.println("Repository Document Create page FileLocation is enabled");
	}

	@Then("^choose Location in Repo$")
	public void choose_Location_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.Location.click();
		System.out.println("Repository Document Create page Location is enabled");
	}

	@Then("^choose LocChennai in Repo$")
	public void choose_LocChennai_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.LocChennai.click();
		System.out.println("Repository Document Create page LocChennai is enabled");
	}

	@Then("^choose Building in Repo$")
	public void choose_Building_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.Building.click();
		System.out.println("Repository Document Create page Building is enabled");
	}

	@Then("^choose BuildingTwr in Repo$")
	public void choose_BuildingTwr_in_Repo() throws Throwable {
		RepositoryDocObject.BuildingTwr.click();
		System.out.println("Repository Document Create page BuildingTwr is enabled");
	}

	@Then("^choose Floor in Repo$")
	public void choose_Floor_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.Floor.click();
		System.out.println("Repository Document Create page Floor is enabled");

	}

	@Then("^select floor1 in Repo$")
	public void select_floor1_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.floor1.click();
		System.out.println("Repository Document Create page floor1 is enabled");

	}

	@Then("^click Rack Btn$")
	public void click_Rack_Btn() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.Rack.click();
		System.out.println("Repository Document Create page Rack is enabled");

	}

	@Then("^choose RackQA in Repo$")
	public void choose_RackQA_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.RackQA.click();
		System.out.println("Repository Document Create page RackQA is enabled");

	}

	@Then("^click Shelf in Repo$")
	public void click_Shelf_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.Shelf.click();
		System.out.println("Repository Document Create page Shelf is enabled");

	}

	@Then("^choose Shelf4 in Repo$")
	public void choose_Shelf4_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.Shelf4.click();
		System.out.println("Repository Document Create page Shelf4 is enabled");

	}

	@Then("^choose FileNo in Repo$")
	public void choose_FileNo_in_Repo() throws Throwable {
		RepositoryDocObject.FileNo.click();
		Thread.sleep(2000);
		RepositoryDocObject.FileNo.sendKeys(ConfigFileReader.getFileNo());
		Thread.sleep(2000);
		System.out.println("Repository Document Create page FileNo is enabled");

	}

	@Then("^As a user i should able to Save Created Doc in Repository Doc$")
	public void As_a_user_i_should_able_to_Save_Created_Doc_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		System.out.println("Repository Document Create page DocSave is enabled");
//		assertEquals("Success ",RepositoryDocObject.WarngMessage.getText());
		System.err.println(RepositoryDocObject.WarngMessage.getText()+RepositoryDocObject.SuccessPopupDocOk.getText());
		
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.TextOk));
		RepositoryDocObject.TextOk.click();
		System.out.println("Repository Document Create page TextOk is enabled");

	}
	
	private void popupTxt() {
		
		System.err.println(RepositoryDocObject.WarngMessage.getText()+RepositoryDocObject.SuccessPopupDocOk.getText());

	}
	
	@Then("^user i should able to close the FileUpload popup in Repo$")
	public void user_i_should_able_to_close_the_FileUpload_popup_in_Repo() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FileUploadClose));
		RepositoryDocObject.FileUploadClose.click();
		System.err.println(RepositoryDocObject.WarngMessage.getText());
		Thread.sleep(3000);
		System.out.println("Repository Document Create page Doc FileUploadClose is enabled");

	}

	@Then("^As a user i should able to Upload File Againt Created Doc in Repository Doc$")
	public void As_a_user_i_should_able_to_Upload_File_Againt_Created_Doc_in_Repository_Doc() throws Throwable {
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.));
//		RepositoryDocObject.DocFileUpload.click();
//		Thread.sleep(2000);
//		String file = fileuploadpath + fileName;
////				fileuploadpath=ConfigFileReader.getDocFileUpload();
////				 StringSelection stringSelection = new StringSelection(System.getProperty("user.dir")+fileuploadpath);
//		StringSelection stringSelection = new StringSelection(file);
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		clipboard.setContents(stringSelection, null);
//		String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);
//		System.out.println("String from Clipboard:" + actualCopedText);
//		robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.delay(200);
//		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
//		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", RepositoryDocObject.fileTypeClr);
//		RepositoryDocObject.UploadFileType.click();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
//		RepositoryDocObject.uploadDocument.click();
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FileUploadClose));
//		RepositoryDocObject.FileUploadClose.click();
		// Test Karthik
//		String file = fileuploadpath+fileName;
		System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		Thread.sleep(2000);
	
		js.executeScript("arguments[0].setAttribute('display', 'block')",RepositoryDocObject.DocFileUpload);
		RepositoryDocObject.DocFileUpload.sendKeys(file);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('display', 'none')",RepositoryDocObject.DocFileUpload);
		
//		RepositoryDocObject.DocFileUpload.sendKeys(file);
		
//		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DocFileUpload));
//		RepositoryDocObject.DocFileUpload.click();
//		Thread.sleep(3000);
//		String file = fileuploadpath+fileName;
////		fileuploadpath=ConfigFileReader.getDocFileUpload();
////		 StringSelection stringSelection = new StringSelection(System.getProperty("user.dir")+fileuploadpath);
//		 StringSelection stringSelection = new StringSelection(file);
//		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		    clipboard.setContents(stringSelection, null);
//		    String actualCopedText = (String) clipboard.getData(DataFlavor.stringFlavor);
//		    System.out.println("String from Clipboard:" + actualCopedText);
//		    Actions actions = new Actions(Webdriver.driver);
//		    actions.sendKeys(Keys.CONTROL);actions.perform();
//		    actions.sendKeys("V");actions.perform();
//		    actions.sendKeys(Keys.ENTER);actions.perform();
		    /*robot =new Robot();
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V); 
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.delay(200);*/
		    wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.fileTypeClr));
		    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", RepositoryDocObject.fileTypeClr);		
		    wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.UploadFileType));
		    RepositoryDocObject.UploadFileType.click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
			RepositoryDocObject.uploadDocument.click();	
			
//assertEquals("Success",RepositoryDocObject.ErrorDocSelect.getText());
RepositoryDocObject.WarngMessage.getText();
		System.err.println(RepositoryDocObject.WarngMessage.getText()+RepositoryDocObject.ErrorDocSelect.getText());
		
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FileUploadClose));
			RepositoryDocObject.FileUploadClose.click();
//			assertTrue("Success ",RepositoryDocObject.ErrorDocSelect.getText());
			RepositoryDocObject.WarngMessage.getText();
					System.err.println(RepositoryDocObject.WarngMessage.getText()+RepositoryDocObject.ErrorDocSelect.getText());
					
			Thread.sleep(5000);
//				assertEquals("File Upload Title Verification", "Attach Documents", RepositoryDocObject.attachmentWindowTitle.getText());
//				Actions action = new Actions(Webdriver.driver);
//				action.moveToElement(RepositoryDocObject.DocFileUpload);
//				action.click().build().perform();
//				Thread.sleep(5000);
//				System.out.println(fileLocation);
//				StringSelection stringSelection = new StringSelection(fileLocation + fileName);
//			    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//			    clipboard.setContents(stringSelection, stringSelection);	   
//			    Thread.sleep(5000);
//		    robot =new Robot();
//		    RepositoryDocObject.DocFileUpload.sendKeys(ConfigFileReader.getDocFileUpload());
////			    robot.keyPress(KeyEvent.VK_CONTROL);
////			    robot.keyPress(KeyEvent.VK_V);
////			    robot.keyRelease(KeyEvent.VK_V);
////			    robot.keyRelease(KeyEvent.VK_CONTROL);
//		    
//			    robot.keyPress(KeyEvent.VK_ENTER);
//			    robot.keyRelease(KeyEvent.VK_ENTER);
//			    wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
//			    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", RepositoryDocObject.fileTypeClr);		
//				RepositoryDocObject.UploadFileType.click();
//				for (WebElement webElement : fileTypeSelection) {
//					if(webElement.getText().equals("Rate Contract Documents")) {
//						webElement.click();
//						break;
//					}
//				}	
//				if(RepositoryDocObject.uploadDocument.isEnabled()) {
//					RepositoryDocObject.uploadDocument.click();
//				}
//				wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ok));
//				assertEquals("Success", RepositoryDocObject.verifySuccessMessage.getText());
//				assertEquals("Document(s) uploaded successfully", RepositoryDocObject.verifySuccessMessageText.getText());
//				RepositoryDocObject.ok.click();	

		System.out.println("File is Uploaded Successfully");
	}
	// ========================= Reset & Cancel==========================

	@Then("^As a user i should able to Reset the Created Doc in Repository Doc$")
	public void As_a_user_i_should_able_to_Reset_the_Againt_Created_Doc_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ResetBTn));
		status = RepositoryDocObject.ResetBTn.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ResetBTn is enabled");
		RepositoryDocObject.ResetBTn.click();
		Thread.sleep(2000);
		System.out.println("Repository Document Create page ResetBTn is enabled");
	}

	@Then("^As a user i should able to click Cancel Button in Repository Doc$")
	public void As_a_user_i_should_able_to_click_Cancel_Button_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.CancelBtn));
		status = RepositoryDocObject.CancelBtn.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page CancelBtn is enabled");
		RepositoryDocObject.CancelBtn.click();
		System.out.println("Repository Document Create page CancelBtn is enabled");
	}

	// ================================== NEW
	// ========================================
	@Then("^As a user i should able to Navigate ApprovedTab in Repository Doc$")
	public void As_a_user_i_should_able_to_Navigate_ApprovedTab_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ApprovedTab));
		status = RepositoryDocObject.ApprovedTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ApprovedTab is enabled");
		RepositoryDocObject.ApprovedTab.click();
		System.out.println("Repository Document Create page ApprovedTab is enabled");
	}

	@Then("^As a user i should able to Navigate RejectTab in Repository Doc$")
	public void As_a_user_i_should_able_to_Navigate_RejectTab_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.RejectTab));
		status = RepositoryDocObject.RejectTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page RejectTab is enabled");
		RepositoryDocObject.RejectTab.click();
		System.out.println("Repository Document Create page RejectTab is enabled");
	}

	@Then("^As a user i should able to Navigate ForActionTab in Repository Doc$")
	public void As_a_user_i_should_able_to_Navigate_ForActionTab_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ForActionTab));
		status = RepositoryDocObject.ForActionTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ForActionTab is enabled");
		RepositoryDocObject.ForActionTab.click();
		System.out.println("Repository Document Create page ForActionTab is enabled");

	}

	@Then("^As a user i should able to Navigate InprogressTab in Repository Doc$")
	public void As_a_user_i_should_able_to_Navigate_InprogressTab_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.InprogressTab));
		status = RepositoryDocObject.InprogressTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page InprogressTab is enabled");
		RepositoryDocObject.InprogressTab.click();
		System.out.println("Repository Document Create page InprogressTab is enabled");
	}

	@Then("^As a user i should able to Navigate AllTab in Repository Doc$")
	public void As_a_user_i_should_able_to_Navigate_AllTab_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AllTab));
		status = RepositoryDocObject.AllTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page AllTab is enabled");
		RepositoryDocObject.AllTab.click();
		Thread.sleep(2000);
		System.out.println("Repository Document Create page AllTab is enabled");
	}

	@Then("^Verify User can be able to Filter List of Records in Repository Doc$")
	public void Verify_User_can_be_able_to_Filter_List_of_Records_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FilterTab));
		status = RepositoryDocObject.FilterTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page FilterTab is enabled");
		RepositoryDocObject.FilterTab.click();
		Thread.sleep(4000);
		RepositoryDocObject.FilterTab.click();
		System.out.println("Repository Document Create page FilterTab is enabled");
	}

	@Then("^Verify User can be able to Search List of Records in Repository Doc$")
	public void Verify_User_can_be_able_to_Search_List_of_Records_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Search));
		status = RepositoryDocObject.Search.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Search is enabled");
		RepositoryDocObject.Search.click();
		Thread.sleep(1000);
		RepositoryDocObject.Search.click();
		System.out.println("Repository Document Create page Search is enabled");
	}

	@Then("^As a user i should able to switch MyDoc in Repository Doc$")
	public void As_a_user_i_should_able_to_switch_MyDoc_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.MyDoc));
		status = RepositoryDocObject.MyDoc.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page MyDoc is enabled");
		RepositoryDocObject.MyDoc.click();
		System.out.println("Repository Document Create page MyDoc is enabled");
	}

	@Then("^As a user i should able to switch MyOrgDoc in Repository Doc$")
	public void As_a_user_i_should_able_to_switch_MyOrgDoc_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.MyOrgDoc));
		status = RepositoryDocObject.MyOrgDoc.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page MyOrgDoc is enabled");
		RepositoryDocObject.MyOrgDoc.click();
		System.out.println("Repository Document Create page MyOrgDoc is enabled");
	}

	@Then("^As a user i should able to switch AllDoc in Repository Doc$")
	public void As_a_user_i_should_able_to_switch_AllDoc_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AllDoc));
		status = RepositoryDocObject.AllDoc.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page AllDoc is enabled");
		try {
			RepositoryDocObject.AllDoc.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", RepositoryDocObject.AllDoc);
		}
		
		System.out.println("Repository Document Create page AllDoc is enabled");
		}

	@Then("^As a user i should able to Click Latest Revision toggle in Repository Doc$")
	public void As_a_user_i_should_able_to_Click_Latest_Revision_toggle_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.LatestRev));
		status = RepositoryDocObject.LatestRev.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page LatestRev is enabled");
		RepositoryDocObject.LatestRev.click();
		System.out.println("Repository Document Create page LatestRev is enabled");

	}

	@Then("^As a user i should able to Download Excel sheet for Repository Doc$")
	public void As_a_user_i_should_able_to_Download_Excel_sheet_for_Repository_Doc() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DownldExcel));
		status = RepositoryDocObject.DownldExcel.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page DownldExcel is enabled");
		RepositoryDocObject.DownldExcel.click();
		System.out.println("Repository Document Create page DownldExcel is enabled");
	}
//		@Then("^choose UploadExcel in Repo$")
//		public void choose_UploadExcel_in_Repo() throws Throwable {
//			Thread.sleep(2000);
//		    RepositoryDocObject.UploadExcel.click();
//		    Thread.sleep(2000);
//		}

	@Then("^As a user i should able to capture Viewdays in Repository Doc$")
	public void As_a_user_i_should_able_to_capture_Viewdays_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Viewdays));
		status = RepositoryDocObject.Viewdays.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Viewdays is enabled");
		Thread.sleep(4000);
//		RepositoryDocObject.Viewdays.click();
//		Thread.sleep(2000);
//		RepositoryDocObject.Viewdays.click();
		System.out.println("Repository Document Create page Viewdays is enabled");
	}
	// ===============================

	@Then("^As a user i should able to Export Excel sheet for Repository Doc$")
	public void As_a_user_i_should_able_to_Export_Excel_sheet_for_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ExportRepoExcel));
		status = RepositoryDocObject.ExportRepoExcel.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ExportRepoExcel is enabled");
		RepositoryDocObject.ExportRepoExcel.click();
		Thread.sleep(2000);
		System.out.println("Repository Document Create page ExportRepoExcel is enabled");
	}

	@Then("^As a user i should able to click ShowNo Button in Repository Doc$")
	public void As_a_user_i_should_able_to_click_ShowNo_Button_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ShowNo));
		status = RepositoryDocObject.ShowNo.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ShowNo is enabled");
		RepositoryDocObject.ShowNo.click();
		System.out.println("Repository Document Create page ShowNo is enabled");
	}

	@Then("^As a user i should able to capture PageExpand in Repository Doc$")
	public void As_a_user_i_should_able_to_capture_PageExpand_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.PageExpand));
		status = RepositoryDocObject.PageExpand.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page PageExpand is enabled");
		RepositoryDocObject.PageExpand.click();
		System.out.println("Repository Document Create page PageExpand is enabled");
	Webdriver.driver.navigate().refresh();
	}

	@Then("^choose PageCollapse in Repo$")
	public void choose_PageCollapse_in_Repo() throws Throwable {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.PageCollapse));
		status = RepositoryDocObject.PageCollapse.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page PageCollapse is enabled");
		RepositoryDocObject.PageCollapse.click();
//		js.executeScript("arguments[0].click();", RepositoryDocObject.PageCollapse);
		System.out.println("Repository Document Create page PageCollapse is enabled");
	}

	// ================================

	

	@Then("^Verify As a user i should able to choose and switch Project in Repository Doc$")
	public void Verify_As_a_user_i_should_able_to_choose_and_switch_Project_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectClr));
		status = RepositoryDocObject.ProjectClr.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ResetBTn is enabled");
		RepositoryDocObject.ProjectClr.click();
		System.out.println("Repository Document Create page ProjectClr is enabled");
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.CommonProjectSD));
//		System.out.println("Repository Document page LICProject is enabled");
//		RepositoryDocObject.CommonProjectSD.click();
		
		//***************************

List<WebElement> listofOptions= RepositoryDocObject.OptionList;
		for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Project = "+ webElement.getText());
			Thread.sleep(3000);
			if(webElement.getText().contains("EDMS Common Project")){
				System.out.println("Selected Project Name is :" + webElement.getText());
				webElement.getText();
				webElement.click();
				break;
				}else {
					System.out.println("Above Selected Project Name it is not Common - EDMS Common Project");
					}
				}	
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.InfoChangeYes));
		RepositoryDocObject.InfoChangeYes.click();
		System.out.println("Repository Document page InfoChangeYes is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectClr));
		Thread.sleep(2000);
		RepositoryDocObject.ProjectClr.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectName));
		RepositoryDocObject.ProjectName.sendKeys("O21534");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.GandhiProject));
		RepositoryDocObject.GandhiProject.click();
		
	/*	for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Project = "+ webElement.getText());
			Thread.sleep(3000);
			if(webElement.getText().contains("O21534")){
				System.out.println("Selected Project Name is :" + webElement.getText());
				webElement.getText();
				webElement.click();
				break;
				}else {
					System.out.println("O21534 - Project Gandhi for JRS India Corporation Private Limited  is not available in Project name List");
					}
				}	*/
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.InfoChangeNo));
		RepositoryDocObject.InfoChangeNo.click();
		System.out.println("Repository Document page InfoChangeNo is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectClr));
		RepositoryDocObject.ProjectClr.click();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DemoProject));
//		RepositoryDocObject.DemoProject.click();
		for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Project = "+ webElement.getText());
			Thread.sleep(3000);
			if(webElement.getText().contains("EDMS Demo Project")){
				System.out.println("Selected Project Name is :" + webElement.getText());
				webElement.getText();
				webElement.click();
				break;
				}else {
					System.out.println("Above selected Project Name is not Demo - EDMS Demo Project");
					}
				}	
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.InfoChangeYes));
		RepositoryDocObject.InfoChangeYes.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectClr));
		Thread.sleep(2000);
		RepositoryDocObject.ProjectClr.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ProjectName));
		RepositoryDocObject.ProjectName.sendKeys("O21534");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.GandhiProject));
		RepositoryDocObject.GandhiProject.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.InfoChangeYes));
		RepositoryDocObject.InfoChangeYes.click();
		Thread.sleep(6000);
	}

	
//		
//		@Then("^choose InfoChangeYes in Repo$")
//		public void choose_InfoChangeYes_in_Repo() throws Throwable {
//			Thread.sleep(2000);
//		    RepositoryDocObject.InfoChangeYes.click();
//		    }
//		
//		@Then("^choose InfoChangeNo in Repo$")
//		public void choose_InfoChangeNo_in_Repo() throws Throwable {
//			Thread.sleep(2000);
//		    RepositoryDocObject.InfoChangeNo.click();
//		}

//		@Then("^choose InfoChangeYes in Repo$")
//		public void choose_InfoChangeYes_in_Repo() throws Throwable {
//			Thread.sleep(2000);
//		    RepositoryDocObject.InfoChangeYes.click();
//		    }

	@Then("^As a user i should able to Verify Document Mandatory field check in Repository Doc$")
	public void As_a_user_i_should_able_to_Verify_Document_Mandatory_field_check_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Discipline));
		status = RepositoryDocObject.Discipline.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Discipline is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Discipline));
		RepositoryDocObject.Discipline.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		status = RepositoryDocObject.DocSave.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page DocSave is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Discipline));
		status = RepositoryDocObject.Discipline.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Discipline is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Discipline));
		RepositoryDocObject.Discipline.click();
		System.out.println("Repository Document Create page Descipline button is enabled");
		chooseListOption();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Area));
		status = RepositoryDocObject.Area.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Area is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Area));
		RepositoryDocObject.Area.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Area));
		RepositoryDocObject.Area.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.AreaList1));
		RepositoryDocObject.AreaList1.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Documenttype));
		status = RepositoryDocObject.Documenttype.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Documenttype is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Documenttype));
		RepositoryDocObject.Documenttype.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Documenttype));
		RepositoryDocObject.Documenttype.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DoctypeDC));
		RepositoryDocObject.DoctypeDC.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Structure));
		status = RepositoryDocObject.Structure.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Structure is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Structure));
		RepositoryDocObject.Structure.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Structure));
		RepositoryDocObject.Structure.click();
		chooseListOption();
//		RepositoryDocObject.StructureLT.click();
	/*	Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.PrintSize));
		RepositoryDocObject.PrintSize.click();*/
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.PrintSize));
		status = RepositoryDocObject.PrintSize.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page PrintSize is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.PrintSize));
		RepositoryDocObject.PrintSize.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.PrintSizeA2));
		RepositoryDocObject.PrintSizeA2.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Title));
		status = RepositoryDocObject.Title.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Title is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Title));
		RepositoryDocObject.Title.click();
		RepositoryDocObject.Title.sendKeys(ConfigFileReader.getTitle());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		status = RepositoryDocObject.DocSave.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page DocSave is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);

	}

	@Then("^As a user i should able to Verify Document Revision field check in Repository Doc$")
	public void As_a_user_i_should_able_to_Verify_Document_Revision_field_check_in_Repository_Doc() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Status));
		status = RepositoryDocObject.Status.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page Status is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.Status));
		RepositoryDocObject.Status.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Status));
		RepositoryDocObject.Status.click();
		System.out.println("Repository Document Create page DocStatus is enabled");
		try {
			chooseListOption();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.Status1));
			RepositoryDocObject.Status1.click();
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ApprovedForinfo));
		status = RepositoryDocObject.ApprovedForinfo.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ApprovedForinfo is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.ApprovedForinfo));
		RepositoryDocObject.ApprovedForinfo.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.ApprovedForinfo));
		RepositoryDocObject.ApprovedForinfo.click();
		System.out.println("Repository Document Create page ApprovedForinfo is enabled");
		List<WebElement> listofOptions= RepositoryDocObject.OptionList;
		for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Approved By = "+ webElement.getText());
			Thread.sleep(3000);
			if(webElement.getText().equals("Kathiresh Kumar")){
				System.out.println("Selected Approved By Name is :" + webElement.getText());
				webElement.getText();
				webElement.click();
				break;
				}else {
					System.out.println("Above Mentioned Approved By name is not Kathiresh Kumar");
					}
				}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.DocSave));
		RepositoryDocObject.DocSave.click();
		System.err.println(RepositoryDocObject.WarngMessage.getText()+RepositoryDocObject.SuccessPopupDocOk.getText());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.TextOk));
		status = RepositoryDocObject.TextOk.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page TextOk is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.TextOk));
		RepositoryDocObject.TextOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(RepositoryDocObject.FileUploadClose));
		RepositoryDocObject.FileUploadClose.click();
//		System.err.println(RepositoryDocObject.WarngMessage.getText());
		Thread.sleep(3000);

	}

	// ==================================Mail===========================================//
	@Then("^click DocMail in Repo$")
	public void click_DocMail_in_Repo() throws Throwable {
		RepositoryDocObject.AllTab.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocSelectKK.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocMail.click();

	}

	@Then("^click AttachFile Mail in Repo$")
	public void click_AttachFile_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailAttachFileMail.click();
	}

	@Then("^select Document for AttachMail in Repo$")
	public void select_Document_for_AttachMail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.DocSelectAttachMail.click();
	}

	@Then("^click DocNumber AttachMail in Repo$")
	public void click_DocNumber_AttachMail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.WorkflowDocMail.click();
		Thread.sleep(3000);
		RepositoryDocObject.RepositoryDocMail.click();
		Thread.sleep(3000);
		RepositoryDocObject.WorkflowDocMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.WFDocNoKK.click();
	}

	@Then("^click MailAttachment Submit in Repo$")
	public void click_MailAttachment_Submit_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailAttachSubmit.click();
	}

	@Then("^select ProjectCode Mail in Repo$")
	public void select_ProjectCode_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.ProjectCodeMail.click();
	}

	@Then("^click DemoProject Mail in Repo$")
	public void click_DemoProject_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.DemoProjectMail.click();
	}

	@Then("^click Discipline Mail in Repo$")
	public void click_Discipline_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.DisciplineMail.click();
	}

	@Then("^select Discipline Architecture Mail in Repo$")
	public void select_Discipline_Architecture_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.DisciplineArchiMail.click();
	}

	@Then("^click FromOrgMail in Repo$")
	public void click_FromOrgMail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.FromOrgMail.click();
	}

	@Then("^click FromOrgLNT Mail in Repo$")
	public void click_FromOrgLNT_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.FromOrgLNTMail.click();
	}

	@Then("^select ToOrg Mail in Repo$")
	public void select_ToOrg_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.ToOrgMail.click();
	}

	@Then("^select ToOrg2 Mail in Repo$")
	public void select_ToOrg2_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.ToOrg2Mail.click();
	}

	@Then("^click MsgSerialNo Mail in Repo$")
	public void click_MsgSerialNo_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MsgSerialNoMail.click();
	}

	@Then("^click SerialNo Mail in Repo$")
	public void click_SerialNo_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.SerialNoMail.click();
	}

	@Then("^select MailType in Repo$")
	public void select_MailType_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailType.click();
	}

	@Then("^click Letter MailType in Repo$")
	public void click_Letter_MailType_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.LetterMailType.click();
	}

	@Then("^click Confidential Toggle Mail in Repo$")
	public void click_Confidential_Toggle_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.ConfidentialToggleMail.click();
	}

	@Then("^select MsgGroup Mail in Repo$")
	public void select_MsgGroup_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MsgGroupMail.click();
	}

	@Then("^click MsgGroupTest Mail in Repo$")
	public void click_MsgGroupTest_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MsgGroupTestMail.click();
	}

	@Then("^click ResToggle Yes Mail in Repo$")
	public void click_ResToggle_Yes_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.ResToggleYesMail.click();
		RepositoryDocObject.ResToggleNoMail.click();
	}
//		
//		@Then("^select ResToggle No Mail in Repo$")
//		public void select_ResToggle_No_Mail_in_Repo() throws Throwable {
//			Thread.sleep(2000);
//		    RepositoryDocObject.ResToggleNoMail.click();
//		    }

	@Then("^select Structure Mail in Repo$")
	public void select_Structure_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.SubjectMail.click();
		RepositoryDocObject.SubjectMail.sendKeys(ConfigFileReader.getSubject());
		Thread.sleep(1000);
//		    Actions actions = new Actions(Webdriver.driver);
//	        actions.moveToElement(RepositoryDocObject.CmntMail);
//	        actions.perform();
//	        System.out.println("Moved to mail cmnt");

		// RepositoryDocObject.DropDownCmnt.click();
	}

	@Then("^click Cmnt Mail in Repo$")
	public void click_Cmnt_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.CmntMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.CmntMail.sendKeys("EDMS Automation");
	}

	@Then("^click Doc_DeleteIn Mail in Repo$")
	public void click_Doc_DeleteIn_Mail_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.DocDeleteInMail.click();
	}

	@Then("^select Mail Send in Repo$")
	public void select_Mail_Send_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
	}

	@Then("^click MailSave Draft in Repo$")
	public void click_MailSave_Draft_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailSaveDraft.click();
	}

	@Then("^click Mail AttachFiles in Repo$")
	public void click_Mail_AttachFiles_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailAttachFiles.click();
	}

	@Then("^select Email DocTable in Repo$")
	public void select_Email_DocTable_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.EmailDocTable.click();
	}

	@Then("^click EMail Page in Repo$")
	public void click_EMail_Page_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.EMailPage.click();
	}

	@Then("^click Mail_in_Email in Repo$")
	public void click_Mail_in_Email_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.MailinEmail.click();
	}

	@Then("^select Email_Transmittal in Repo$")
	public void select_Email_Transmittal_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.EmailTransmittal.click();
	}

	@Then("^select Email_Close in Repo$")
	public void select_Email_Close_in_Repo() throws Throwable {
		Thread.sleep(2000);
		RepositoryDocObject.EmailClose.click();
	}

	// ================Mandatory Field Check================//

	@Then("^Verify Mail Mandatory field check$")
	public void Verify_Mail_Mandatory_field_check() throws Throwable {
		RepositoryDocObject.AllTab.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocSelectKK.click();
		Thread.sleep(2000);
		RepositoryDocObject.DocMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailAttachFileMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailAttachFileMail.click();
//		    RepositoryDocObject.DocSelectAttachMail.click();
//		    Thread.sleep(2000);
//			RepositoryDocObject.WorkflowDocMail.click();
//			Thread.sleep(2000);
//		    RepositoryDocObject.WFDocNoKK.click();
//		    Thread.sleep(2000);
//		    RepositoryDocObject.MailAttachSubmit.click();
//		    Thread.sleep(2000);
//		    RepositoryDocObject.MailSend.click();
//		    Thread.sleep(2000);
		RepositoryDocObject.ProjectCodeMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.DemoProjectMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		  Actions actions = new Actions(Webdriver.driver);
			actions.moveToElement( RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.DisciplineMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.DisciplineArchiMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.FromOrgMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.FromOrgLNTMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.ToOrgMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.ToOrg2Mail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.MsgSerialNoMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.SerialNoMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.MailType.click();
		Thread.sleep(2000);
		RepositoryDocObject.LetterMailType.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.ConfidentialToggleMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MsgGroupMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MsgGroupTestMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.SubjectMail.click();
		Thread.sleep(2000);
		RepositoryDocObject.MailSend.click();
		actions.moveToElement(RepositoryDocObject.PageHead).click().build().perform();
		Thread.sleep(2000);
		RepositoryDocObject.SubjectMail.click();
		RepositoryDocObject.SubjectMail.sendKeys(ConfigFileReader.getSubject());
		Thread.sleep(1000);
		RepositoryDocObject.DocDeleteInMail.click();
		Thread.sleep(2000);
		System.out.println("Mail Mandatory field check Verified successfully");

	}

	// ================Doc Approve =======================================//
//	    public static void documentApprove(String documentNumber) throws InterruptedException, AWTException
//	    {	    		
//	    		//JavascriptExecutor executors = (JavascriptExecutor) Login.driver;
//	    		String documentNumberApprove=documentNumber;
//	    		LoginActions.username_password("Kathiresh-k", "K@thir2323");	
//				System.out.println("Control again to document approval");
//				//Login.driver.navigate().refresh();
//				Login.driver.navigate().to("https://edms4qa.lntecc.com/EdmsUI/documents/document");
//				PageFactory.initElements(Login.driver, CommonControlObject.class);
//				PageFactory.initElements(Login.driver, RepositoryDocObject.class);
//				RepositoryDocObject.FilterTab.click();
//				System.out.println("Message Number= " + documentNumberApprove);
//				RepositoryDocObject.FilterTab(documentNumberApprove);
//				String status =RepositoryDocObject.documentStatus.getText();
//				assertEquals(status, "For Action");
//				RepositoryDocObject.repo_Foraction.click();
//				RepositoryDocObject.select_result.click();
//				RepositoryDocObject.approve.click();
//				//JavascriptExecutor executors = (JavascriptExecutor) Login.driver;
//				CommonControlObject.warningMessageClose.click();
//				//executors.executeScript("arguments[0].click();",repository_document_object.repo_All);
//				RepositoryDocObject.repo_All.click();
//				//JavascriptExecutor executors1 = (JavascriptExecutor) Login.driver;
//				//executors.executeScript("arguments[0].click();",CommonControlObject.profileClick);
//				CommonControlObject.profileClick.click();
//				//CommonControlObject.profileClick.click();
//				//JavascriptExecutor executors2 = (JavascriptExecutor) Login.driver;
//				//executors.executeScript("arguments[0].click();",CommonControlObject.profileOut);
//				CommonControlObject.profileOut.click();
//				//executors.executeScript("arguments[0].click();",LoginObject.other);
//				//LoginObject.other.click();				
//				LoginActions.username_password("Vendor_1", "Edms@1234");
//				//Login.driver.close();
//				System.out.println("Approved Completed and returned to creator login.");
//			}
//		
	@Then("^Verify As a user i should able to Upload File Againt Created Doc in Repository Doc$")
	public void Verify_As_a_user_i_should_able_to_Upload_File_Againt_Created_Doc_in_Repository_Doc() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.InprogressTab));
		RepositoryDocObject.InprogressTab.click();
		System.out.println("Respond Workflow page InProgress tab is Enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DocSelectKK));
		RepositoryDocObject.DocSelectKK.click();
		System.out.println("Respond Workflow page DocSelectKK is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AttachTable));
		RepositoryDocObject.AttachTable.click();
		System.out.println("Respond Workflow page AttachTable is Enabled");
		System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		
//		js.executeScript("arguments[0].setAttribute('display', 'block')",RepositoryDocObject.DocFileUpload);
		RepositoryDocObject.DocFileUpload.sendKeys(file);
		Thread.sleep(4000);
//		js.executeScript("arguments[0].setAttribute('display', 'none')",RepositoryDocObject.DocFileUpload);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.fileTypeClr));
		try {
			RepositoryDocObject.fileTypeClr.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", RepositoryDocObject.fileTypeClr);
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.UploadFileType));
		RepositoryDocObject.UploadFileType.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocument));
		RepositoryDocObject.uploadDocument.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FileUploadClose));
		try {
			RepositoryDocObject.FileUploadClose.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", RepositoryDocObject.FileUploadClose);
		}
		Thread.sleep(6000);
		System.out.println("Repository Document Page In-Progress -- >  Created Doc Againt File Uploaded Successfully");
	    }

	
	
	@Then("^Verify As a user i should able to Reject Upload File Againt Created Doc in Repository Doc$")
	public void Verify_As_a_user_i_should_able_to_Reject_Upload_File_Againt_Created_Doc_in_Repository_Doc() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.InprogressTab));
		RepositoryDocObject.InprogressTab.click();
		System.out.println("Respond Workflow page InProgress tab is Enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.DocSelectKK));
		RepositoryDocObject.DocSelectKK.click();
		System.out.println("Respond Workflow page DocSelectKK is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.AttachTable));
		RepositoryDocObject.AttachTable.click();
		System.out.println("Respond Workflow page AttachTable is Enabled");
		System.err.println("TEST FOR UPLOAD");
		Thread.sleep(2000);
		String file = fileuploadpath + fileName;
		
//		js.executeScript("arguments[0].setAttribute('display', 'block')",RepositoryDocObject.DocFileUpload);
		RepositoryDocObject.DocFileUpload.sendKeys(file);
		Thread.sleep(4000);
//		js.executeScript("arguments[0].setAttribute('display', 'none')",RepositoryDocObject.DocFileUpload);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.fileTypeClr));
		try {
			RepositoryDocObject.fileTypeClr.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", RepositoryDocObject.fileTypeClr);
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.UploadFileType));
		RepositoryDocObject.UploadFileType.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.uploadDocumentReject));
		RepositoryDocObject.uploadDocumentReject.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(RepositoryDocObject.FileUploadClose));
		try {
			RepositoryDocObject.FileUploadClose.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", RepositoryDocObject.FileUploadClose);
		}
		Thread.sleep(6000);
		System.out.println("Repository Document Page In-Progress -- >  Created Doc Againt Uploaded has been Rejected Successfully");
	    }
}
