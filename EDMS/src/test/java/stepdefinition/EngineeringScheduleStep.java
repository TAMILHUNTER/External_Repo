package stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Locators.EngineeringSchedule;
import object_repository.Locators.EngineeringSchedule;

public class EngineeringScheduleStep {

	public static String selectedDiscipline;
	WebDriverWait wait = new WebDriverWait(Webdriver.driver, 100);
	public static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;

	static boolean status;

	public EngineeringScheduleStep() {
		PageFactory.initElements(Webdriver.driver, EngineeringSchedule.class);
	}

	@Then("^as a user i should able to click the home page main menu$")
	public void as_a_user_i_should_able_to_click_the_home_page_main_menu() throws Throwable {
		Actions actions = new Actions(Webdriver.driver);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MenuEng));
		actions.moveToElement(EngineeringSchedule.MenuEng);
		actions.build().perform();
//		EngineeringSchedule.MenuEng.click();
//		actions.perform();
		System.out.println("Home page Main Menu is enabled");
	}

	@Then("^user should able to Click Engineering Schedule in Main Menu$")
	public void user_should_able_to_Click_Engineering_Schedule_in_Main_Menu() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EngineeringSchedu));
		if (EngineeringSchedule.EngineeringSchedu.isEnabled()) {
			EngineeringSchedule.EngineeringSchedu.click();
			Reporter.addScenarioLog("Engineering Schedule page is enabled");
			System.out.println("Engineering Schedule page is enabled");
			wait.until(ExpectedConditions.textToBePresentInElement(EngineeringSchedule.sCHEDULEDOCUMENT, "SCHEDULE DOCUMENTS"));
			assertEquals("SCHEDULE DOCUMENTS", EngineeringSchedule.sCHEDULEDOCUMENT.getText());
			System.out.println("Main Menu SCHEDULE DOCUMENTS is enabled");
		} else {
			System.out.println("Engineering Schedule page is not enabled");
		}
		
		
	}

	@Then("^as a user i should able to click all tab$")
	public void as_a_user_i_should_able_to_click_all_tab() throws Throwable {
		/*wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Alltab));
		EngineeringSchedule.Alltab.click();
		status = EngineeringSchedule.Alltab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule page Alltab is enabled");
		System.out.println("Engineering Schedule page Alltab is enabled");*/
		
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Alltab));
		if (EngineeringSchedule.Alltab.equals(" All ")) {
			try {
				EngineeringSchedule.Alltab.click();
				 
			}catch (Exception e) {

				js.executeScript("arguments[0].click();",EngineeringSchedule.Alltab);
			}
		}
		Thread.sleep(1000);
		Reporter.addScenarioLog("Engineering Schedule page Alltab is enabled");
		System.out.println("Engineering Schedule page Alltab is enabled");
		  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule page Alltab is enabled Visited.");
		 
		
	}

	@Then("^user should able to click create icon$")
	public void user_should_able_to_click_create_icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Create));
		EngineeringSchedule.Create.click();
		status = EngineeringSchedule.Create.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule page Create button is enabled");
		System.out.println("Engineering Schedule page Create button is enabled");
	}

	
	@Then("^user should able to Switch and Select to KKNPP Project$")
	public void user_should_able_to_Switch_and_Select_to_KKNPP_Project() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectClr));
		status = EngineeringSchedule.ProjectClr.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule Document Create page ResetBTn is enabled");
		EngineeringSchedule.ProjectClr.click();
		System.out.println("Engineering Schedule Document Create page ProjectClr is enabled");
		Thread.sleep(2000);
List<WebElement> listofOptions= EngineeringSchedule.OptionList;
		for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Project = "+ webElement.getText());
			Thread.sleep(3000);
			if(webElement.getText().contains("O17092 - KKNPP 3 & 4 Main Plant")){
				System.out.println("Selected Project Name is :" + webElement.getText());
				webElement.getText();
				webElement.click();
				break;
				}else {
					System.out.println("Above Selected Project Name it is not O17092 - KKNPP 3 & 4 Main Plant Project");
					}
				}	
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.InfoChangeYes));
		EngineeringSchedule.InfoChangeYes.click();
		System.out.println("Engineering Schedule Document page InfoChangeYes is enabled");
		Thread.sleep(4000);
		
	}
	
	
	@Then("^user should able to Switch and Select to Project Gandhi in Repo$")
	public void user_should_able_to_Switch_and_Select_to_Project_Gandhi_in_Repo() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectClr));
		status = EngineeringSchedule.ProjectClr.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule Document Create page ResetBTn is enabled");
		EngineeringSchedule.ProjectClr.click();
		System.out.println("Engineering Schedule Document Create page ProjectClr is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectName));
		EngineeringSchedule.ProjectName.sendKeys("O21534");
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.GandhiProject));
		EngineeringSchedule.GandhiProject.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.InfoChangeYes));
		EngineeringSchedule.InfoChangeYes.click();
		System.out.println("O21534 - Project Gandhi for JRS India Corporation Private Limited  is available in Project name List");

		Thread.sleep(6000);
		if(EngineeringSchedule.Alltab.equals(" All ")) {
			try {
				EngineeringSchedule.Alltab.click();
				 
			}catch (Exception e) {
			
				js.executeScript("arguments[0].click();",EngineeringSchedule.Alltab);
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
	
	
	@Then("^user should able to select Discipline$")
	public void user_should_able_to_select_Discipline() throws Throwable {
		status = EngineeringSchedule.Descipline.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Descipline));
		Reporter.addScenarioLog("Engineering Schedule Create page Descipline button is enabled");
		EngineeringSchedule.Descipline.click();
		System.out.println("Engineering Schedule Create page Descipline button is enabled");
		chooseListOption();
		EngineeringSchedule.Descipline.getText();
		System.out.println("Selected Item List is =" +EngineeringSchedule.Descipline.getText());
		Thread.sleep(2000);
	}

	/*@Then("^user should able to capture Civil Discipline$")
	public void user_should_able_to_capture_Civil_Discipline() throws Throwable {
		status = EngineeringSchedule.OptionList.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.OptionList));
		Reporter.addScenarioLog("Engineering Schedule Create page Civil Descipline is enabled");
		EngineeringSchedule.OptionList.click();
		System.out.println("Engineering Schedule Create page Civil Descipline is enabled");
	}*/
	
	public void chooseListOption() throws Throwable {
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.OptionList));
		List<WebElement> listofOption= EngineeringSchedule.OptionList;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
		System.out.println(listofOption);
		Thread.sleep(2000);
		listofOption.get(randnMumber).click();
		System.out.println("Selected Item Random Number is = "+randnMumber);
	
	}
	
	

	@Then("^user should able to select Structure$")
	public void user_should_able_to_select_Structure() throws Throwable {
		status = EngineeringSchedule.Structure.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Structure));
		Reporter.addScenarioLog("Engineering Schedule Create page Structure is enabled");
		System.out.println("Engineering Schedule Create page Structure is enabled");
		EngineeringSchedule.Structure.click();
		chooseListOption();
	}

/*	@Then("^user should able to capture Structure as Electric Tower$")
	public void user_should_able_to_capture_Structure_as_Electric_Tower() throws Throwable {
		status = EngineeringSchedule.Electrictwr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Electrictwr));
		Reporter.addScenarioLog("Engineering Schedule Create page Electrictwr Structure is enabled");
		System.out.println("Engineering Schedule Create page Electrictwr Structure is enabled");
		EngineeringSchedule.Electrictwr.click();
	}*/

	// ===========================================JUST=================================//

	/*@Then("^user should able to clear the default category$")
	public void user_should_able_to_clear_the_default_category() throws Throwable {
		status = EngineeringSchedule.categoryclr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.categoryclr));
		Reporter.addScenarioLog("Engineering Schedule category clear is enabled");
		System.out.println("Engineering Schedule category clear is enabled");
		EngineeringSchedule.categoryclr.click();
	}*/

	/*@Then("^user should able to select the default category stn$")
	public void user_should_able_to_select_the_default_category_stn() throws Throwable {
		status = EngineeringSchedule.categorystn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.categorystn));
		EngineeringSchedule.categorystn.click();
		Reporter.addScenarioLog("Engineering Schedule categorystn is enabled");
		System.out.println("Engineering Schedule categorystn is enabled");
	}*/

	@Then("^user should able to select the Area$")
	public void user_should_able_to_select_the_Area() throws Throwable {
		status = EngineeringSchedule.Area.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Area));
		Reporter.addScenarioLog("Engineering Schedule Create page Area is enabled");
		System.out.println("Engineering Schedule Create page Area is enabled");
		EngineeringSchedule.Area.click();
		chooseListOption();
	}

/*	@Then("^user should able to capture Surat as Area$")
	public void user_should_able_to_capture_Surat_as_Area() throws Throwable {
		status = EngineeringSchedule.AreaSurat.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AreaSurat));
		Reporter.addScenarioLog("Engineering Schedule Create page AreaSurat in Area is enabled");
		System.out.println("Engineering Schedule Create page AreaSurat in Area is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.AreaSurat.click();
	}*/

	@Then("^user should able to select Document DWG$")
	public void user_should_able_to_select_Document_DWG() throws Throwable {
		status = EngineeringSchedule.DocumentDWG.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocumentDWG));
		Reporter.addScenarioLog("Engineering Schedule Create page DocumentDWG is enabled");
		System.out.println("Engineering Schedule Create page DocumentDWG is enabled");
		EngineeringSchedule.DocumentDWG.click();
		chooseListOption();
	}

	/*@Then("^user should able to capture Doc DoC$")
	public void user_should_able_to_capture_Doc_DoC() throws Throwable {
		status = EngineeringSchedule.DocDoC.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocDoC));
		Reporter.addScenarioLog("Engineering Schedule Create page DocDoC is enabled");
		System.out.println("Engineering Schedule Create page DocDoC is enabled");
		EngineeringSchedule.DocDoC.click();
	}*/

	@Then("^user should able to select Doc Type$")
	public void user_should_able_to_select_Doc_Type() throws Throwable {
		status = EngineeringSchedule.DocType.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocType));
		Reporter.addScenarioLog("Engineering Schedule Create page DocType is enabled");
		System.out.println("Engineering Schedule Create page DocType is enabled");
		EngineeringSchedule.DocType.click();
		chooseListOption();
	}

	/*@Then("^user should able to capture Doc typeDC$")
	public void user_should_able_to_capture_Doc_typeDC() throws Throwable {
		status = EngineeringSchedule.DoctypeDC.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DoctypeDC));
		Reporter.addScenarioLog("Engineering Schedule Create page DoctypeDC in DocType is enabled");
		System.out.println("Engineering Schedule Create page DoctypeDC in DocType is enabled");
		EngineeringSchedule.DoctypeDC.click();
	}*/

	@Then("^user should able to select Print Size$")
	public void user_should_able_to_select_Print_Size() throws Throwable {
		status = EngineeringSchedule.PrintSize.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PrintSize));
		Reporter.addScenarioLog("Engineering Schedule Create page PrintSize is enabled");
		System.out.println("Engineering Schedule Create page PrintSize is enabled");
		EngineeringSchedule.PrintSize.click();
		chooseListOption();
	}

	/*@Then("^user should able to capture Print Size A1$")
	public void user_should_able_to_capture_Print_Size_A1() throws Throwable {
		status = EngineeringSchedule.PrintSizeA1.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PrintSizeA1));
		Reporter.addScenarioLog("Engineering Schedule Create page PrintSizeA1 in PrintSize is enabled");
		System.out.println("Engineering Schedule Create page PrintSizeA1 in PrintSize is enabled");
		EngineeringSchedule.PrintSizeA1.click();
	}*/

	@Then("^user should able to capture Title$")
	public void user_should_able_to_capture_Title() throws Throwable {
		status = EngineeringSchedule.Title.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Title));
		Reporter.addScenarioLog("Engineering Schedule Create page Title is enabled");
		System.out.println("Engineering Schedule Create page Title is enabled");
		EngineeringSchedule.Title.click();
		EngineeringSchedule.Title.sendKeys(ConfigFileReader.getTitle());
	}

	@Then("^user should able to select Revision category$")
	public void user_should_able_to_select_Revision_category() throws Throwable {
		status = EngineeringSchedule.Revcategory.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Revcategory));
		Reporter.addScenarioLog("Engineering Schedule Create page Revcategory is enabled");
		System.out.println("Engineering Schedule Create page Revcategory is enabled");
		EngineeringSchedule.Revcategory.click();
		chooseListOption();
	}

	/*@Then("^user should able to capture Major as Revision category$")
	public void user_should_able_to_capture_Major_as_Revision_category() throws Throwable {
		status = EngineeringSchedule.RevMajor.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.RevMajor));
		Reporter.addScenarioLog("Engineering Schedule Create page Major as Revcategory is enabled");
		System.out.println("Engineering Schedule Create page Major as Revcategory is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.RevMajor.click();
	}*/

	@Then("^user should able to capture EnggMan Hrs$")
	public void user_should_able_to_capture_EnggMan_Hrs() throws Throwable {
		status = EngineeringSchedule.EnggManHrs.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EnggManHrs));
		Reporter.addScenarioLog("Engineering Schedule Create page EnggManHrs is enabled");
		System.out.println("Engineering Schedule Create page EnggManHrs is enabled");
		EngineeringSchedule.EnggManHrs.click();
		EngineeringSchedule.EnggManHrs.sendKeys(ConfigFileReader.getEnggManHr());
	}

	@Then("^user should able to capture DraftMan Hrs$")
	public void user_should_able_to_capture_DraftMan_Hrs() throws Throwable {
		status = EngineeringSchedule.DraftManHrs.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DraftManHrs));
		Reporter.addScenarioLog("Engineering Schedule Create page DraftManHrs is enabled");
		System.out.println("Engineering Schedule Create page DraftManHrs is enabled");
		EngineeringSchedule.DraftManHrs.click();
		EngineeringSchedule.DraftManHrs.sendKeys(ConfigFileReader.getDraftManHrs());
	}

	@Then("^user should able to capture Weightage$")
	public void user_should_able_to_capture_Weightage() throws Throwable {
		status = EngineeringSchedule.Weightage.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Weightage));
		Reporter.addScenarioLog("Engineering Schedule Create page Weightage is enabled");
		System.out.println("Engineering Schedule Create page Weightage is enabled");
		EngineeringSchedule.Weightage.click();
		EngineeringSchedule.Weightage.sendKeys(ConfigFileReader.getWeightage());
	}

	@Then("^user should able to select ApproBy$")
	public void user_should_able_to_select_ApproBy() throws Throwable {
		status = EngineeringSchedule.ApproBy.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApproBy));
		Reporter.addScenarioLog("Engineering Schedule Create page ApproBy is enabled");
		System.out.println("Engineering Schedule Create page ApproBy is enabled");
		EngineeringSchedule.ApproBy.click();
		Thread.sleep(2000);
		chooseListOption();
		String gettext=EngineeringSchedule.ApproBy.getText();
		System.out.println(gettext);
	}
	
	/*@Then("^user should able to capture ApproBy for$")
	public void user_should_able_to_capture_ApproBy_for() throws Throwable {
		status = EngineeringSchedule.ApproBy.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApproBy));
		Reporter.addScenarioLog("Engineering Schedule Create page ApproBy is enabled");
		System.out.println("Engineering Schedule Create page ApproBy is enabled");
		chooseListOption();
		EngineeringSchedule.ApproBy.getText();
	}*/

/*	@Then("^user should able to capture MetrosBu as ApproBy$")
	public void user_should_able_to_capture_MetrosBu_as_ApproBy() throws Throwable {
		status = EngineeringSchedule.MetrosBu.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MetrosBu));
		Reporter.addScenarioLog("Engineering Schedule Create page MetrosBu as ApproBy is enabled");
		System.out.println("Engineering Schedule Create page MetrosBu as ApproBy is enabled");
		EngineeringSchedule.MetrosBu.click();
	}*/
	
	@Then("^user should able to capture Calender in Respentive Calendar$")
	public void user_should_able_to_capture_Calender_in_Respentive_Calendar() throws Throwable {
		if (EngineeringSchedule.Wf1_CalenderSelect.isEnabled()) {
			status = EngineeringSchedule.Wf1_CalenderSelect.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Wf1_CalenderSelect));
			Reporter.addScenarioLog("Engineering Schedule Create page Wf1_CalenderSelect is enabled");
			System.out.println("Engineering Schedule Create page Wf1_CalenderSelect is enabled");
			EngineeringSchedule.Wf1_CalenderSelect.click();
		} else {
System.out.println("Calendar not Displayed");
		}
		
		
		
	}

	@Then("^user should able to select Doc Workflow$")
	public void user_should_able_to_select_Doc_Workflow() throws Throwable {
		status = EngineeringSchedule.Workflow.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Workflow));
		Reporter.addScenarioLog("Engineering Schedule Create page Workflow is enabled");
		System.out.println("Engineering Schedule Create page Workflow is enabled");
		EngineeringSchedule.Workflow.click();
		chooseListOption();
	}

	/*@Then("^user should able to capture GFC as Doc Workflow$")
	public void user_should_able_to_capture_GFC_as_Doc_Workflow() throws Throwable {
		status = EngineeringSchedule.WorkflowGFC.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WorkflowGFC));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC as Workflow is enabled");
		System.out.println("Engineering Schedule Create page PrintSize WorkflowGFC as Workflow is enabled");
		EngineeringSchedule.WorkflowGFC.click();
	}*/

/*	@Then("^user should able to capture C4template as Doc Workflow$")
	public void user_should_able_to_capture_C4template_as_Doc_Workflow() throws Throwable {
		status = EngineeringSchedule.PipeLineWF.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PipeLineWF));
		Reporter.addScenarioLog("Engineering Schedule Create page PipeLineWF as Workflow is enabled");
		System.out.println("Engineering Schedule Create page PipeLineWF as Workflow is enabled");
		EngineeringSchedule.PipeLineWF.click();
	}*/

	@Then("^user should able to capture Wf Calender in Respentive Calendar$")
	public void user_should_able_to_capture_Wf_Calender_in_Respentive_Calendar() throws Throwable {
		if (EngineeringSchedule.Wf1_CalenderSelect.isDisplayed()) {
			status = EngineeringSchedule.Wf1_CalenderSelect.isEnabled();
			assertTrue(status);
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Wf1_CalenderSelect));
			Reporter.addScenarioLog("Engineering Schedule Create page Wf1_CalenderSelect is enabled");
			System.out.println("Engineering Schedule Create page Wf1_CalenderSelect is enabled");
			EngineeringSchedule.Wf1_CalenderSelect.click();
		} else {
System.out.println("Calendar not Displayed");
		}
		if (EngineeringSchedule.Wf1_CalenderSelect.isDisplayed()) {
			Thread.sleep(2000);
			Reporter.addScenarioLog("Engineering Schedule Create page Wf2_CalenderSelect is enabled");
			System.out.println("Engineering Schedule Create page Wf2_CalenderSelect is enabled");
			EngineeringSchedule.Wf2_CalenderSelect.click();
		} else {
			System.out.println("Calendar not Displayed");

		}
		
		
	}

	@Then("^user should able to view Gfc Calender$")
	public void user_should_able_to_view_Gfc_Calender() throws Throwable {
		status = EngineeringSchedule.GfcCalender.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GfcCalender));
		Reporter.addScenarioLog("Engineering Schedule Create page GfcCalender is enabled");
		System.out.println("Engineering Schedule Create page GfcCalender is enabled");
		EngineeringSchedule.GfcCalender.click();
		Thread.sleep(2000);
		EngineeringSchedule.GfcCalender.click();

	}

	@Then("^choose PipeLineWF eng$")
	public void choose_PipeLineWF_eng() throws Throwable {
		status = EngineeringSchedule.PipeLineWF.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PipeLineWF));
		Reporter.addScenarioLog("Engineering Schedule Create page PipeLineWF as Workflow is enabled");
		System.out.println("Engineering Schedule Create page PipeLineWF as Workflow is enabled");
		EngineeringSchedule.PipeLineWF.click();
	}

	@Then("^user should able to capture Doc Comment$")
	public void user_should_able_to_capture_Doc_Comment() throws Throwable {
		status = EngineeringSchedule.cmntWF.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.cmntWF));
		Reporter.addScenarioLog("Engineering Schedule Create page comment is enabled");
		System.out.println("Engineering Schedule Create page comment is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.cmntWF.click();
		EngineeringSchedule.cmntWF.sendKeys(ConfigFileReader.getComments());
		Thread.sleep(2000);
	}

	@Then("^user should able to click Doc Row$")
	public void user_should_able_to_click_Doc_Row() throws Throwable {
		status = EngineeringSchedule.DocColumn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocColumn));
		Reporter.addScenarioLog("Engineering Schedule Create page DocColumn is enabled");
		System.out.println("Engineering Schedule Create page DocColumn is enabled");
		EngineeringSchedule.DocColumn.click();
		Thread.sleep(2000);
		EngineeringSchedule.DocColumn.click();
	}

	@Then("^user should able to click Doc Revision Toggle$")
	public void user_should_able_to_click_Doc_Revision_Toggle() throws Throwable {
		status = EngineeringSchedule.DocRevToggle.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocRevToggle));
		Reporter.addScenarioLog("Engineering Schedule Create page DocRevToggle is enabled");
		System.out.println("Engineering Schedule Create page DocRevToggle is enabled");
		EngineeringSchedule.DocRevToggle.click();
		Thread.sleep(2000);
		EngineeringSchedule.DocRevToggle.click();
//		EngineeringSchedule.DocProToggle.click();
//		Thread.sleep(2000);
//		EngineeringSchedule.DocProToggle.click();
	}

	@Then("^user should able to select Document Status$")
	public void user_should_able_to_select_Document_Status() throws Throwable {
/*		status = EngineeringSchedule.DocStatus.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStatus));
		Reporter.addScenarioLog("Engineering Schedule Create page DocStatus is enabled");
		System.out.println("Engineering Schedule Create page DocStatus is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.DocStatus.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStatus));
		  if(EngineeringSchedule.DocStatus.isEnabled()) {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStatus));
		try {
			EngineeringSchedule.DocStatus.click();
		Thread.sleep(2000);
		
			 
		}catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",EngineeringSchedule.DocStatus);
		}
		chooseListOption();
		Reporter.addScenarioLog("Engineering Schedule page DocStatus is enabled");
		System.out.println("Engineering Schedule page DocStatus is enabled");
		  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule page DocStatus is enabled Visited.");
		  }else {			  
			  com.vimalselvam.cucumber.listener.Reporter.addStepLog("There is no Engineering Schedule page DocStatus is enabled.");
		  }
	}

	/*@Then("^user should able to capture For Approval as Doc Status$")
	public void user_should_able_to_capture_For_Approval_as_Doc_Status() throws Throwable {
		status = EngineeringSchedule.DocStsForApp.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStsForApp));
		Reporter.addScenarioLog("Engineering Schedule Create page DocStsForApp is enabled");
		System.out.println("Engineering Schedule Create page DocStsForApp is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.DocStsForApp.click();

	}*/

	@Then("^user should able to click Doc Revision$")
	public void user_should_able_to_click_Doc_Revision() throws Throwable {
		status = EngineeringSchedule.DocRevision.isEnabled();
//		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocRevision));
		Reporter.addScenarioLog("Engineering Schedule Create page DocRevision is enabled");
		System.out.println("Engineering Schedule Create page DocRevision is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.DocRevision.click();
	}

	@Then("^user should able to select AuthorisedBy$")
	public void user_should_able_to_select_AuthorisedBy() throws Throwable {
		status = EngineeringSchedule.AuthorisedBy.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthorisedBy));
		Reporter.addScenarioLog("Engineering Schedule Create page AuthorisedBy is enabled");
		System.out.println("Engineering Schedule Create page AuthorisedBy is enabled");
	
		choose_AuthorisedBy(); 
	}

	@Then("^user should able to click QR CodeActive$")
	public void user_should_able_to_click_QR_CodeActive() throws Throwable {
		status = EngineeringSchedule.QRCodeActive.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.QRCodeActive));
		Reporter.addScenarioLog("Engineering Schedule Create page QRCodeActive is enabled");
		System.out.println("Engineering Schedule Create page QRCodeActive is enabled");
		EngineeringSchedule.QRCodeActive.click();
		Thread.sleep(2000);
		EngineeringSchedule.QRCodeActive.click();
	}

	@Then("^user should able to capture Document Reference$")
	public void user_should_able_to_capture_Document_Reference() throws Throwable {
		status = EngineeringSchedule.Ref.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Ref));
		Reporter.addScenarioLog("Engineering Schedule Create page Reference is enabled");
		System.out.println("Engineering Schedule Create page Reference is enabled");
		EngineeringSchedule.Ref.click();
		EngineeringSchedule.Ref.sendKeys(ConfigFileReader.getReference());
	}

	@Then("^user should able to capture NoOfSheets in Document$")
	public void user_should_able_to_capture_NoOfSheets_in_Document() throws Throwable {
		status = EngineeringSchedule.NoOfSheets.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.NoOfSheets));
		Reporter.addScenarioLog("Engineering Schedule Create page NoOfSheets is enabled");
		System.out.println("Engineering Schedule Create page NoOfSheets is enabled");
		EngineeringSchedule.NoOfSheets.click();
		EngineeringSchedule.NoOfSheets.sendKeys(ConfigFileReader.getFileNo());
	}

	@Then("^user should able to save the Created Document$")
	public void user_should_able_to_save_the_Created_Document() throws Throwable {
		status = EngineeringSchedule.SaveBtn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		Reporter.addScenarioLog("Engineering Schedule Create page SaveBtn is enabled");
		System.out.println("Engineering Schedule Create page SaveBtn is enabled");
		Thread.sleep(2000);
		EngineeringSchedule.SaveBtn.click();
		Thread.sleep(2000);
//		System.err.println(EngineeringSchedule.WarngMessage.getText()+EngineeringSchedule.SuccessPopupDocOk.getText());

	}

	@Then("^user should able to click DocSaveOk the Created Document$")
	public void user_should_able_to_click_DocSaveOk_the_Created_Document() throws Throwable {
		/*status = EngineeringSchedule.DocSaveOk.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		EngineeringSchedule.DocSaveOk.click();
		Reporter.addScenarioLog("Engineering Schedule Create page DocSaveOk is enabled");*/
		
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		  if(EngineeringSchedule.DocSaveOk.isEnabled()) {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		try {
			 EngineeringSchedule.DocSaveOk.click();
		Thread.sleep(2000);
			 
		}catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",EngineeringSchedule.DocSaveOk);
		}
		Reporter.addScenarioLog("Engineering Schedule Create page DocSaveOk is enabled");
		  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule Create page DocSaveOk Visited.");
		  }else {			  
			  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule Create page DocSaveOk.");
		  }
		
		
		System.out.println("Engineering Schedule Create page DocSaveOk is enabled");
		System.out.println("*************************************************");
		System.out.println("Engineering Schedule Document Created Succefully");
	}

	// ===========================================================//

	@Then("^click ResetBtn eng$")
	public void click_ResetBtn_eng() throws Throwable {
		status = EngineeringSchedule.ResetBtn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ResetBtn));
		Reporter.addScenarioLog("Engineering Schedule Create page ResetBtn is enabled");
		System.out.println("Engineering Schedule Create page ResetBtn is enabled");
		EngineeringSchedule.ResetBtn.click();

	}

	@Then("^choose UpdateBtn eng$")
	public void choose_UpdateBtn_eng() throws Throwable {
		status = EngineeringSchedule.UpdateBtn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.UpdateBtn));
		Reporter.addScenarioLog("Engineering Schedule Create page UpdateBtn is enabled");
		System.out.println("Engineering Schedule Create page UpdateBtn is enabled");
		EngineeringSchedule.UpdateBtn.click();
	}

	@Then("^choose CancelBtn eng$")
	public void choose_CancelBtn_eng() throws Throwable {
		status = EngineeringSchedule.CancelBtn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CancelBtn));
		Reporter.addScenarioLog("Engineering Schedule Create page CancelBtn is enabled");
		System.out.println("Engineering Schedule Create page CancelBtn is enabled");
		EngineeringSchedule.CancelBtn.click();
	}

	@Then("^choose DocView eng$")
	public void choose_DocView_eng() throws Throwable {
		status = EngineeringSchedule.DocView.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocView));
		Reporter.addScenarioLog("Engineering Schedule page DocView is enabled");
		System.out.println("Engineering Schedule page DocView is enabled");
		EngineeringSchedule.DocView.click();
	}

	// ===================================== MAIL
	// ++++++++++++++++++++++++++++++++++++++++//

	@Then("^click Engineering Schedule Page Mandatory field check$")
	public void click_Engineering_Schedule_Page_Mandatory_field_check() throws Throwable {
		System.out.println("Engineering Schedule page document Mandatory field check1 is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PageDocView));
		EngineeringSchedule.PageDocView.click();
		assertEquals("No document is selected",EngineeringSchedule.ErrorDocSelect.getText());
		EngineeringSchedule.ErrorDocSelectHeadline.getText();
		System.err.println(EngineeringSchedule.ErrorDocSelectHeadline.getText()+EngineeringSchedule.ErrorDocSelect.getText());
		Thread.sleep(5000);
		System.out.println("Engineering Schedule page document Mandatory field PageDocView is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocMail));
		EngineeringSchedule.DocMail.click();
		assertEquals("Please Select Atleast One Document",EngineeringSchedule.ErrorDocSelect.getText());
		System.err.println(EngineeringSchedule.ErrorDocSelectHeadline.getText() + EngineeringSchedule.ErrorDocSelect.getText());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Create));
		EngineeringSchedule.Create.click();
		System.out.println("Engineering Schedule page document Mandatory field Create is enabled");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CreateClose));
		EngineeringSchedule.CreateClose.click();
		System.out.println("Engineering Schedule page document Mandatory field CreateClose is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.StartWorkflow));
		EngineeringSchedule.StartWorkflow.click();
	/*	if (EngineeringSchedule.ErrorDocSelect.isDisplayed()) {
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ErrorDocSelect));
			assertEquals("No document is selected",EngineeringSchedule.ErrorDocSelect.getText());
			System.out.println("Engineering Schedule page document Mandatory field Workflow is enabled");
		} else {
			System.out.println("Engineering Schedule page document Mandatory field Workflow not mentioned as mandatory");
		}*/
//	==	System.err.println(EngineeringSchedule.ErrorDocSelectHeadline.getText()+"/n :"+EngineeringSchedule.ErrorDocSelect.getText());
		System.out.println("Engineering Schedule page document Mandatory field StartWorkflow is enabled");
		Thread.sleep(2000);
//				EngineeringSchedule.LatestRev.click();
//				Thread.sleep(2000);
//				EngineeringSchedule.LatestRev.click();
//				Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ForActionTab));
		EngineeringSchedule.ForActionTab.click();
//		assertEquals("For Action",EngineeringSchedule.ForActionTab.getText());
		System.out.println("Engineering Schedule page document Mandatory field ForActionTab is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocApproveTab));
		EngineeringSchedule.DocApproveTab.click();
		Thread.sleep(1000);
		assertEquals("No document is selected",EngineeringSchedule.ErrorDocSelect.getText());
		System.err.println(EngineeringSchedule.ErrorDocSelectHeadline.getText() + EngineeringSchedule.ErrorDocSelect.getText());
//		assertEquals("Approve",EngineeringSchedule.DocApproveTab.getText());
		System.out.println("Engineering Schedule page document Mandatory field DocApproveTab is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocRejectTab));
		EngineeringSchedule.DocRejectTab.click();
		assertEquals("No document is selected",EngineeringSchedule.ErrorDocSelect.getText());
		System.err.println(EngineeringSchedule.ErrorDocSelectHeadline.getText() + EngineeringSchedule.ErrorDocSelect.getText());
//		assertEquals("Reject",EngineeringSchedule.DocRejectTab.getText());
		Thread.sleep(2000);
		System.out.println("Engineering Schedule page document Mandatory field DocRejectTab is enabled");
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApprovedTab));
////		js.executeScript("arguments[0].click();", EngineeringSchedule.ApprovedTab);
//		EngineeringSchedule.ApprovedTab.click();
////		EngineeringSchedule.ApprovedTab.getText();
//		System.out.println("Engineering Schedule page Approved document is enabled");
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		EngineeringSchedule.Doc1Select_Tab.click();
		System.out.println("Engineering Schedule page document Mandatory field Doc1Select_Tab is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocView));
		EngineeringSchedule.DocView.click();
		System.out.println("Engineering Schedule page document Mandatory field DocView is enabled");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocWorkflowHistoryTable));
		EngineeringSchedule.DocWorkflowHistoryTable.click();
		System.out.println("Engineering Schedule page document Mandatory field DocWorkflowHistoryTable is enabled");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.HistoryCloseDoc));
		EngineeringSchedule.HistoryCloseDoc.click();
		System.out.println("Engineering Schedule page document Mandatory field HistoryCloseDoc is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Select_DocClose));
		EngineeringSchedule.Select_DocClose.click();
		System.out.println("Engineering Schedule page document Mandatory field Select_DocClose is enabled");
		Thread.sleep(2000);
		status = EngineeringSchedule.Alltab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Alltab));
		if (EngineeringSchedule.Alltab.equals(" Approved ")) {
			try {
				EngineeringSchedule.Alltab.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", EngineeringSchedule.Alltab);
			}
		} else {
System.out.println("Approved Tab not Displayed");
		}
		
		
	
		System.out.println("Engineering Schedule page Mandatory field ApprovedTab is enabled");
//		EngineeringSchedule.ApprovedTab.click();
		Reporter.addScenarioLog("Engineering Schedule page Mandatory field is enabled");
		System.out.println("Engineering Schedule page Mandatory field is enabled");
	}

	@Then("^Verify Engineering Schedule Doc Mandatory field check$")
	public void Verify_Engineering_Schedule_Doc_Mandatory_field_check() throws Throwable {
		System.out.println("Engineering Schedule page Mandatory field check3 is enabled");
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Alltab));
//		js.executeScript("arguments[0].click();", EngineeringSchedule.Alltab);
//		System.out.println("Engineering Schedule page DOC Mandatory field Alltab is enabled");	
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Create));
		EngineeringSchedule.Create.click();
		System.out.println("Engineering Schedule page DOC Mandatory field Create is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		System.out.println("Engineering Schedule page DOC Mandatory field SaveBtn is enabled");
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		System.out.println("Engineering Schedule page DOC Mandatory field WarningOk is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Descipline));
		Thread.sleep(2000);
		EngineeringSchedule.Descipline.click();
		System.out.println("Engineering Schedule page DOC Mandatory field Descipline is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		System.out.println("Engineering Schedule page DOC Mandatory field before ErrorMessage is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Descipline));
		EngineeringSchedule.Descipline.click();
		System.out.println("Engineering Schedule page DOC Mandatory field Descipline is enabled");
		Thread.sleep(2000);
		chooseListOption();
		System.out.println("Engineering Schedule page DOC Mandatory field Civil is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field SaveBtn is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Structure));
		EngineeringSchedule.Structure.click();
		System.out.println("Engineering Schedule page DOC Mandatory field Structure is enabled");
		chooseListOption();
		Thread.sleep(2000);
		System.out.println("Engineering Schedule page DOC Mandatory field Electrictwr is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		// EngineeringSchedule.Electrictwr.click();
//    Thread.sleep(2000);
//    EngineeringSchedule.categoryclr.click();
//    EngineeringSchedule.Electrictwr.click();
//    Thread.sleep(2000);
//    EngineeringSchedule.SaveBtn.click();
//    EngineeringSchedule.WarningOk.click();
//	Thread.sleep(2000);
//	EngineeringSchedule.categoryclr.click();
//    EngineeringSchedule.categorystn.click();
//    Thread.sleep(2000);
//    EngineeringSchedule.SaveBtn.click();
//    EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Area));
		EngineeringSchedule.Area.click();
		System.out.println("Engineering Schedule page DOC Mandatory field Area is enabled");
		Thread.sleep(2000);
		chooseListOption();
		System.out.println("Engineering Schedule page DOC Mandatory field AreaSurat is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		System.out.println("Engineering Schedule page DOC Mandatory field SaveBtn is enabled");
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocumentDWG));
		EngineeringSchedule.DocumentDWG.click();
		System.out.println("Engineering Schedule page DOC Mandatory field DocumentDWG is enabled");
		Thread.sleep(2000);
		chooseListOption();
		System.out.println("Engineering Schedule page DOC Mandatory field DocDoC is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocType));
		EngineeringSchedule.DocType.click();
		System.out.println("Engineering Schedule page DOC Mandatory field DocType is enabled");
		chooseListOption();
		System.out.println("Engineering Schedule page DOC Mandatory field DoctypeDC is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		System.out.println("Engineering Schedule page DOC Mandatory field SaveBtn is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PrintSize));
		EngineeringSchedule.PrintSize.click();
		System.out.println("Engineering Schedule page DOC Mandatory field PrintSize is enabled");
		Thread.sleep(2000);
	chooseListOption();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Title));
		EngineeringSchedule.Title.click();
		EngineeringSchedule.Title.sendKeys(ConfigFileReader.getTitle());
		Thread.sleep(2000);
		System.out.println("Engineering Schedule page DOC Mandatory field Title is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Revcategory));
		EngineeringSchedule.Revcategory.click();
		System.out.println("Engineering Schedule page DOC Mandatory field Revcategory is enabled");
		chooseListOption();
		System.out.println("Engineering Schedule page DOC Mandatory field RevMajor is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		status = EngineeringSchedule.SaveBtn.isEnabled();
		assertTrue(status);
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		Reporter.addScenarioLog("Engineering Schedule page Doc Mandatory field WarningOk is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		System.out.println("Engineering Schedule page 2nd Doc Mandatory field is enabled");

	}

	@Then("^Verify Engineering Schedule Doc Schedule Mandatory field check$")
	public void Verify_Engineering_Schedule_Doc_Schedule_Mandatory_field_check() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApproBy));
		EngineeringSchedule.ApproBy.click();
		Thread.sleep(2000);
		chooseListOption();
		System.out.println("Engineering Schedule page Doc Schedule Mandatory MetrosBu is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Workflow));
		EngineeringSchedule.Workflow.click();
		System.out.println("Engineering Schedule page Doc Schedule Mandatory Workflow is enabled");
		chooseListOption();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GfcCalender));
		EngineeringSchedule.GfcCalender.click();
		System.out.println("Engineering Schedule page Doc Schedule Mandatory GfcCalender is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GfcCalender));
		EngineeringSchedule.GfcCalender.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Wf1_CalenderSelect));
		EngineeringSchedule.Wf1_CalenderSelect.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("1 - Mandatory fields are missing",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.cmntWF));
		EngineeringSchedule.cmntWF.click();
		EngineeringSchedule.cmntWF.sendKeys(ConfigFileReader.getComments());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		status = EngineeringSchedule.SaveBtn.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
//		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		Reporter.addScenarioLog("Engineering Schedule page Doc Schedule Mandatory field is enabled");
		System.out.println("Engineering Schedule page Doc Schedule Mandatory field is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();

	}

	@Then("^Verify Engineering Schedule Doc Revision Mandatory field check$")
	public void Verify_Engineering_Schedule_Doc_Revision_Mandatory_field_check() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocColumn));
		EngineeringSchedule.DocColumn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocColumn));
		EngineeringSchedule.DocColumn.click();
		Thread.sleep(2000);
//     EngineeringSchedule.SaveBtn.click();
//     EngineeringSchedule.WarningOk.click();
//     Thread.sleep(2000);
//     EngineeringSchedule.DocRevToggle.click();
//     Thread.sleep(2000);
//     EngineeringSchedule.SaveBtn.click();
//     EngineeringSchedule.WarningOk.click();
//     Thread.sleep(2000);
//		status = EngineeringSchedule.CreateClose.isEnabled(); assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStatus));
		EngineeringSchedule.DocStatus.click();
		Thread.sleep(3000);
		EngineeringSchedule.DocStatus.clear();
		EngineeringSchedule.DocStatus.sendKeys(Keys.TAB);
//		Thread.sleep(3000);
//		EngineeringSchedule.DocStatus.click();
		Thread.sleep(2000);
		Reporter.addScenarioLog("Engineering Schedule page Doc Revision Mandatory field DocStsForApp is enabled");
		System.out.println("Engineering Schedule page Doc Revision Mandatory field is enabled");
		System.out.println("Verify Engineering Schedule Mandatory field check successfully completed");
		System.out.println("Verify Engineering Schedule Mandatory field check DocStsForApp");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		assertEquals("1 - Mandatory fields are missing",EngineeringSchedule.ErrorMessage.getText());
		System.err.println(EngineeringSchedule.WarngMessage.getText() + EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Verify Engineering Schedule Mandatory field check SaveBtn");
//		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WarningOk));
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
//     EngineeringSchedule.DocRevision.click();
//     Thread.sleep(2000);
//     EngineeringSchedule.SaveBtn.click();
//     EngineeringSchedule.WarningOk.click();
//     Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthorisedBy));
		EngineeringSchedule.AuthorisedBy.click();
		EngineeringSchedule.AuthorisedBy.sendKeys("Kathiresh Kumar");
		System.out.println("Verify Engineering Schedule Mandatory field check AuthorisedBy");
		chooseListOption();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		System.out.println("Verify Engineering Schedule Mandatory field check SaveBtn");
		Thread.sleep(1000);
//		System.err.println(EngineeringSchedule.WarngMessage.getText()+EngineeringSchedule.ErrorDocSelect.getText());

//		assertEquals("Kindly select atleast one stage.",EngineeringSchedule.ErrorMessage.getText());
		/*System.out.println("Engineering Schedule page DOC Mandatory field after ErrorMessage is enabled");
		EngineeringSchedule.WarningOk.click();
		Thread.sleep(2000);
		choose_AuthorisedBy();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CreateClose));
		EngineeringSchedule.CreateClose.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		  if(EngineeringSchedule.DocSaveOk.isEnabled()) {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		try {
			 EngineeringSchedule.DocSaveOk.click();
		Thread.sleep(2000);
			 
		}catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",EngineeringSchedule.DocSaveOk);
		}
		Reporter.addScenarioLog("Engineering Schedule Create page DocSaveOk is enabled");
		  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule Create page DocSaveOk Visited.");
		  }else {			  
			  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Engineering Schedule Create page DocSaveOk.");
		  }
		System.out.println("*************************************************");
		System.out.println("Engineering Schedule Document Created Succefully");
		System.out.println("Verify Engineering Schedule Mandatory field check successfully completed");
		System.out.println("Mandatory Field Verified successfully");
	}

	private void getText() throws InterruptedException {
//			int randnMumber = ThreadLocalRandom.current().nextInt(0, listofOption.size());
//			System.out.println(listofOption);
//			Thread.sleep(2000);
//			listofOption.get(randnMumber).click();
//			System.out.println("Selected Item Random Number is = "+randnMumber);
System.out.println(EngineeringSchedule.InputGetText.getAttribute("value"));

	}



	@Then("^user should able to create Engineering Schedule Doc With C4 Template Workflow$")
	public void user_should_able_to_create_Engineering_Schedule_Doc_With_C4_Template_Workflow() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Descipline));
		EngineeringSchedule.Descipline.click();
		chooseListOption();
		getText();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Structure));
		EngineeringSchedule.Structure.click();
chooseListOption();
getText();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Area));
		EngineeringSchedule.Area.click();
		chooseListOption();
		getText();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocumentDWG));
		EngineeringSchedule.DocumentDWG.click();
		chooseListOption();
//		System.err.println(EngineeringSchedule.InputGetText.getText());
		/*wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocDoC));
		EngineeringSchedule.DocDoC.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocType));
		EngineeringSchedule.DocType.click();
		chooseListOption();
		/*wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DoctypeDC));
		EngineeringSchedule.DoctypeDC.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PrintSize));
		EngineeringSchedule.PrintSize.click();
		/*wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PrintSizeA1));
		EngineeringSchedule.PrintSizeA1.click();*/
		chooseListOption();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Title));
		EngineeringSchedule.Title.click();
		EngineeringSchedule.Title.sendKeys(ConfigFileReader.getTitle());
		System.out.println("Title : "+ConfigFileReader.getTitle());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Revcategory));
		EngineeringSchedule.Revcategory.click();
		chooseListOption();
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.RevMajor));
//		EngineeringSchedule.RevMajor.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EnggManHrs));
		EngineeringSchedule.EnggManHrs.click();
		EngineeringSchedule.EnggManHrs.sendKeys(ConfigFileReader.getEnggManHr());
		System.out.println("Engg Man Hrs : "+ConfigFileReader.getEnggManHr());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DraftManHrs));
		EngineeringSchedule.DraftManHrs.click();
		EngineeringSchedule.DraftManHrs.sendKeys(ConfigFileReader.getDraftManHrs());
		System.out.println("Draft Man Hrs : "+ConfigFileReader.getDraftManHrs());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Weightage));
		EngineeringSchedule.Weightage.click();
		EngineeringSchedule.Weightage.sendKeys(ConfigFileReader.getWeightage());
		System.out.println("Weightage : "+ConfigFileReader.getWeightage());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApproBy));
		EngineeringSchedule.ApproBy.click();
		chooseListOption();
		EngineeringSchedule.ApproBy.getText();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MetrosBu));
//		EngineeringSchedule.MetrosBu.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Workflow));
		EngineeringSchedule.Workflow.click();
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PipeLineWF));
//		EngineeringSchedule.PipeLineWF.click();
		chooseListOption();
		Thread.sleep(3000);
		Actions actions = new Actions(Webdriver.driver);
		if (EngineeringSchedule.C4templateCalenderSelect_SD.isDisplayed()) {
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalenderSelect_SD));
			actions.moveToElement(EngineeringSchedule.C4templateCalenderSelect_SD).click().build().perform();
//			EngineeringSchedule.C4templateCalenderSelect_SD.click();
//			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_SD));
			EngineeringSchedule.C4templateCalender_SD.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_SD));
			EngineeringSchedule.C4templateCalender_SD.click();
			Thread.sleep(3000);
		} else {
System.out.println("Calendar not Displayed");
		}
		//******************************
		
		try{
		    while(true) {
		    	new WebDriverWait(Webdriver.driver, 5).ignoring(ElementNotVisibleException.class, NoSuchElementException.class);
					actions.moveToElement(EngineeringSchedule.C4templateCalenderSelect_DD).click().build().perform();
					wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_DD));
					EngineeringSchedule.C4templateCalender_DD.click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_DD));
					EngineeringSchedule.C4templateCalender_DD.click();
					Thread.sleep(2000);
					break;
				
		    }
		} catch (Exception ignored){ }
		
		
		//********************
		
		
		/*if (EngineeringSchedule.C4templateCalender_DD.isDisplayed()) {
			actions.moveToElement(EngineeringSchedule.C4templateCalenderSelect_DD).click().build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_DD));
			EngineeringSchedule.C4templateCalender_DD.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_DD));
			EngineeringSchedule.C4templateCalender_DD.click();
			Thread.sleep(2000);
		} else {
			System.out.println("Calendar not Displayed");
		}*/
	
		/*wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalenderSelect_GFC));
		actions.moveToElement(EngineeringSchedule.C4templateCalenderSelect_GFC).click().build().perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4templateCalender_GFC));
		EngineeringSchedule.C4templateCalender_GFC.click();
		Thread.sleep(3000);
		EngineeringSchedule.C4templateCalender_GFC.click();*/
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.cmntWF));
		EngineeringSchedule.cmntWF.click();
		EngineeringSchedule.cmntWF.sendKeys(ConfigFileReader.getComments());
		System.out.println("Comment : "+ConfigFileReader.getComments());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocColumn));
		EngineeringSchedule.DocColumn.click();
		Thread.sleep(2000);
		EngineeringSchedule.DocColumn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocRevToggle));
		EngineeringSchedule.DocRevToggle.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStatus));
		EngineeringSchedule.DocStatus.clear();
		chooseListOption();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStsForApp));
//		EngineeringSchedule.DocStsForApp.click();
//		Thread.sleep(2000);
//		System.out.println("Doc sts is enabled");
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocRevision));
//		EngineeringSchedule.DocRevision.click();
		
		choose_AuthorisedBy();
		
		/*wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthorisePk));
		EngineeringSchedule.AuthorisePk.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthoriseClr));
		EngineeringSchedule.AuthoriseClr.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthorisedBy));
		EngineeringSchedule.AuthorisedBy.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthoriseKK));
		EngineeringSchedule.AuthoriseKK.click();
		Thread.sleep(2000);*/
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Ref));
		EngineeringSchedule.Ref.click();
		EngineeringSchedule.Ref.sendKeys(ConfigFileReader.getReference());
		System.out.println("Reference : "+ConfigFileReader.getReference());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.NoOfSheets));
		EngineeringSchedule.NoOfSheets.click();
		EngineeringSchedule.NoOfSheets.sendKeys(ConfigFileReader.getFileNo());
		System.out.println("Number of Sheets : "+ConfigFileReader.getFileNo());
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocStatus));
//		EngineeringSchedule.DocStatus.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		status = EngineeringSchedule.DocSaveOk.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocSaveOk));
		Reporter.addScenarioLog("Engineering Schedule page we can able to create Engineering Schedule Doc");
		System.out.println("Engineering Schedule page We can able to create Engineering Schedule Doc");
		EngineeringSchedule.DocSaveOk.click();
		Thread.sleep(5000);
		// EngineeringSchedule.DocApprove_InForAction.click();
	}

	
	
	
	@Then("^as a user is should able to approve In ForAction Tab$")
	public void as_a_user_is_should_able_to_approve_In_ForAction_Tab() throws Throwable {
		Webdriver.driver.navigate().refresh();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ForActionTab));
		try {
			EngineeringSchedule.ForActionTab.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EngineeringSchedule.ForActionTab);
		}
		System.out.println("ForAction Tab is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		EngineeringSchedule.Doc1Select_Tab.click();
		System.out.println("Doc1Select_Tab is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocApprove_InForAction));
		EngineeringSchedule.DocApprove_InForAction.click();
		System.out.println("Selected Document has been approved in ForAction Tab");
		Webdriver.driver.navigate().refresh();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ApprovedTab));
		try {
			EngineeringSchedule.ApprovedTab.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EngineeringSchedule.ApprovedTab);
		}
		System.out.println("Engineering Schedule page Approved document is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		EngineeringSchedule.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocView));
		EngineeringSchedule.DocView.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocWorkflowHistoryTable));
		EngineeringSchedule.DocWorkflowHistoryTable.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.HistoryCloseDoc));
		EngineeringSchedule.HistoryCloseDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Docviewpage_Close));
		EngineeringSchedule.Docviewpage_Close.click();
		status = EngineeringSchedule.ForActionTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ForActionTab));
		Reporter.addScenarioLog("Engineering Schedule page approve In ForAction Tab is enabled");
		System.out.println("Engineering Schedule page approved doc In Approved Tab is enabled");
	}

	@Then("^as a user is should able to click For Action Tab$")
	public void as_a_user_is_should_able_to_click_For_Action_Tab() throws Throwable {	
		try {
			EngineeringSchedule.ForActionTab.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EngineeringSchedule.ForActionTab);
		}
		status = EngineeringSchedule.ForActionTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ForActionTab));
		Reporter.addScenarioLog("Engineering Schedule page For Action Tab is enabled");
		System.out.println("Engineering Schedule page For Action Tab is enabled");
	}

	@Then("^as a user is should able to click InProgress Tab$")
	public void as_a_user_is_should_able_to_click_InProgress_Tab() throws Throwable {
//		EngineeringSchedule.InProgressTab.click();
		js.executeScript("arguments[0].click();", EngineeringSchedule.InProgressTab);
		status = EngineeringSchedule.InProgressTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.InProgressTab));
		Reporter.addScenarioLog("Engineering Schedule page InProgress Tab is enabled");
		System.out.println("Engineering Schedule page InProgress Tab is enabled");

	}

	@Then("^as a user is should able to click Completed Tab$")
	public void as_a_user_is_should_able_to_click_Completed_Tab() throws Throwable {
		EngineeringSchedule.CompletedTab.click();
		status = EngineeringSchedule.CompletedTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CompletedTab));
		Reporter.addScenarioLog("Engineering Schedule page Completed Tab is enabled");
		System.out.println("Engineering Schedule page Completed Tab is enabled");

	}

	@Then("^as a user is should able to click Rejected Tab$")
	public void as_a_user_is_should_able_to_click_Rejected_Tab() throws Throwable {
		status = EngineeringSchedule.RejectedTab.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule page Rejected Tab is enabled");
		System.out.println("Engineering Schedule page Rejected Tab is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.RejectedTab));
		EngineeringSchedule.RejectedTab.click();
		
	}

	@Then("^as a user is should able to click Approved Tab$")
	public void as_a_user_is_should_able_to_click_Approved_Tab() throws Throwable {
		JavascriptExecutor executor = (JavascriptExecutor) Webdriver.driver;
		executor.executeScript("arguments[0].click();", EngineeringSchedule.ApprovedTab);
//		EngineeringSchedule.ApprovedTab.click();
		status = EngineeringSchedule.ApprovedTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApprovedTab));
		Reporter.addScenarioLog("Engineering Schedule page Approved Tab is enabled");
		System.out.println("Engineering Schedule page Approved Tab is enabled");
	}

//	@Then("^choose CreateCalender GFCSelect eng$")
//	public void choose_CreateCalender_GFCSelect_eng() throws Throwable {
//		Thread.sleep(2000);		
//		EngineeringSchedule.CreateCalenderGFCSelect.click();
//			
//	}

	@Then("^as a user is should able to create and Reject Doc$")
	public void as_a_user_is_should_able_to_create_and_Reject_Doc() throws Throwable {
		Webdriver.driver.navigate().refresh();
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ForActionTab));
		try {
			EngineeringSchedule.ForActionTab.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EngineeringSchedule.ForActionTab);
		}
		System.out.println("ForAction tab is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		EngineeringSchedule.Doc1Select_Tab.click();
		System.out.println("Doc1Select_Tab is Enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SelectDocReject));
		EngineeringSchedule.SelectDocReject.click();
		System.out.println("Selected Doc has been Rejected in For Action tab");
		System.err.println(EngineeringSchedule.WarngMessage.getText()  +  EngineeringSchedule.ErrorDocSelect.getText());
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.RejectedTab));
		EngineeringSchedule.RejectedTab.click();
		System.out.println("User should able to navigate to Rejected tab & Verify the rejected document");
		EngineeringSchedule.RejectedTab.getText();
		System.out.println("Engineering Schedule page Rejected a created document");
		status = EngineeringSchedule.RejectedTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.RejectedTab));
		Reporter.addScenarioLog("Engineering Schedule page Reject Doc in ForAction Tab is enabled");
		System.out.println("Engineering Schedule page Reject Doc in ForAction Tab is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		EngineeringSchedule.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocView));
		EngineeringSchedule.DocView.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocWorkflowHistoryTable));
		EngineeringSchedule.DocWorkflowHistoryTable.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.HistoryCloseDoc));
		EngineeringSchedule.HistoryCloseDoc.click();
		Thread.sleep(3000);
	}

	// ========================Common Control=================//

	@Then("^user should able to click the filter icon$")
	public void user_should_able_to_click_the_filter_icon() throws Throwable {
		Thread.sleep(3000);
		EngineeringSchedule.FilterTab.click();
		Thread.sleep(3000);
		EngineeringSchedule.FilterTab.click();
		status = EngineeringSchedule.FilterTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.FilterTab));
		Reporter.addScenarioLog("Engineering Schedule page filter icon is enabled");
		System.out.println("Engineering Schedule page filter icon is enabled");
	}

	@Then("^user should able to click the search button$")
	public void user_should_able_to_click_the_search_button() throws Throwable {
		status = EngineeringSchedule.Search.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Search));
		Reporter.addScenarioLog("Engineering Schedule page Search button is enabled");
		System.out.println("Engineering Schedule page Search button enabled");
		Thread.sleep(3000);
		EngineeringSchedule.Search.click();
		Thread.sleep(1000);
		EngineeringSchedule.Search.click();
	}

	@Then("^user should able to select MyDoc in Eng Page$")
	public void user_should_able_to_select_MyDoc_in_Eng_Page() throws Throwable {
		status = EngineeringSchedule.MyDoc.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MyDoc));
		Reporter.addScenarioLog("Engineering Schedule page MyDoc is enabled");
		System.out.println("Engineering Schedule page MyDoc is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.MyDoc.click();
	}

	@Then("^user should able to select MyOrgDoc in Eng Page$")
	public void user_should_able_to_select_MyOrgDoc_in_Eng_Page() throws Throwable {
		status = EngineeringSchedule.MyOrgDoc.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MyOrgDoc));
		Reporter.addScenarioLog("Engineering Schedule page MyOrgDoc is enabled");
		System.out.println("Engineering Schedule page MyOrgDoc is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.MyOrgDoc.click();
	}

	@Then("^user should able to select AllDoc in Eng Page$")
	public void user_should_able_to_select_AllDoc_in_Eng_Page() throws Throwable {
		status = EngineeringSchedule.AllDoc.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AllDoc));
		Reporter.addScenarioLog("Engineering Schedule page AllDoc is enabled");
		System.out.println("Engineering Schedule page AllDoc is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.AllDoc.click();
	}

	public void choose_AuthorisedBy() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthorisedBy));
		EngineeringSchedule.AuthorisedBy.click();
		Thread.sleep(2000); System.out.println("AuthorisedBy is enabled");
		System.out.println("Repository Document Create page ApprovedForinfo is enabled");
		List<WebElement> listofOptions= EngineeringSchedule.OptionList;
		for (WebElement webElement : listofOptions) {
			Thread.sleep(3000);
			System.out.println("List of Approved By = "+ webElement.getText());
			Thread.sleep(3000); //Kathiresh Kumar //BALAMURUGAN P
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

	@Then("^user should able to click and Download Excel sheet$")
	public void user_should_able_to_click_and_Download_Excel_sheet() throws Throwable {
		status = EngineeringSchedule.DownldExcel.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DownldExcel));
		Reporter.addScenarioLog("Engineering Schedule page DownldExcel is enabled");
		System.out.println("Engineering Schedule page DownldExcel is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.DownldExcel.click();
	}
//	@Then("^choose UploadExcel in eng$")
//	public void choose_UploadExcel_in_eng() throws Throwable {
//		Thread.sleep(3000);
//	    EngineeringSchedule.UploadExcel.click();
//	    Thread.sleep(3000);
//	}

	@Then("^user should able to click the Viewdays button$")
	public void user_should_able_to_click_the_Viewdays_button() throws Throwable {
		Thread.sleep(2000);
		EngineeringSchedule.Viewdays.click();
		

		/*
		 * List<WebElement> allElements=EngineeringSchedule.Viewdays; for (WebElement
		 * webElement : allElements) { webElement.click(); if
		 * (webElement.getText().equals("90")) { webElement.click();
		 * System.out.println("Document View Days : 90"); System.out.println(
		 * "========================================================="); break; }
		 */

		System.out.println("Engineering Schedule page Viewdays is enabled");
	}

	// ===============================

	@Then("^user should able to click and Export Excel sheet$")
	public void user_should_able_to_click_and_Export_Excel_sheet() throws Throwable {
		status = EngineeringSchedule.ExportRepoExcel.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ExportRepoExcel));
		Reporter.addScenarioLog("Engineering Schedule page ExportRepoExcel is enabled");
		System.out.println("Engineering Schedule page ExportRepoExcel is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.ExportRepoExcel.click();
		Thread.sleep(3000);
	}

	@Then("^user should able to click the ShowNo$")
	public void user_should_able_to_click_the_ShowNo() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ShowNo));
		EngineeringSchedule.ShowNo.click();
		status = EngineeringSchedule.ShowNo.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule page ShowNo is enabled");
		System.out.println("Engineering Schedule page ShowNo is enabled");
		EngineeringSchedule.ItemNo.click();
		System.out.println("Engineering Schedule page 40 doc listed is enabled");

	}

	@Then("^user should able to Page Expand the Eng Page$")
	public void user_should_able_to_Page_Expand_the_Eng_Page() throws Throwable {
		status = EngineeringSchedule.PageExpand.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PageExpand));
		Reporter.addScenarioLog("Engineering Schedule page PageExpand is enabled");
		EngineeringSchedule.PageExpand.click();
		System.out.println("Engineering Schedule page PageExpand is enabled");
		Thread.sleep(3000);
		Webdriver.driver.navigate().refresh();
	}

	@Then("^user should able to Page Collapse the Eng Page$")
	public void user_should_able_to_Page_Collapse_the_Eng_Page() throws Throwable {
		status = EngineeringSchedule.PageCollapse.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.PageCollapse));
		Reporter.addScenarioLog("Engineering Schedule page PageCollapse is enabled");
		System.out.println("Engineering Schedule page PageCollapse is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.PageCollapse.click();
	}

	// ================================

	@Then("^user should able to clear the Project$")
	public void user_should_able_to_clear_the_Project() throws Throwable {
		status = EngineeringSchedule.ProjectClr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ProjectClr));
		Reporter.addScenarioLog("Engineering Schedule page ProjectClr is enabled");
		System.out.println("Engineering Schedule page ProjectClr is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.ProjectClr.click();
	}

	@Then("^user should able to change LIC as Project$")
	public void user_should_able_to_change_LIC_as_Project() throws Throwable {
		status = EngineeringSchedule.LICProject.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.LICProject));
		Reporter.addScenarioLog("Engineering Schedule page Project Change is enabled");
		System.out.println("Engineering Schedule page Project change is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.LICProject.click();
		Thread.sleep(3000);
		EngineeringSchedule.InfoChangeYes.click();
		Thread.sleep(3000);
		EngineeringSchedule.ProjectClr.click();
		Thread.sleep(3000);
		EngineeringSchedule.PTNDProject.click();
		Thread.sleep(3000);
		EngineeringSchedule.InfoChangeNo.click();

	}

	@Then("^user should able to change MAHSR as Project$")
	public void user_should_able_to_change_MAHSR_as_Project() throws Throwable {
		EngineeringSchedule.ProjectClr.click();
		Thread.sleep(3000);
		EngineeringSchedule.MahsrProject.click();
		Thread.sleep(2000);
//		status=EngineeringSchedule.MahsrProject.isEnabled();
//    	wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.search));
//    	Reporter.addScenarioLog("Engineering Schedule page MahsrProject is enabled");
		System.out.println("Engineering Schedule page MahsrProject is enabled");
		EngineeringSchedule.InfoChangeYes.click();
		Thread.sleep(3000);
	}

	// ==================================Mail===========================================//
	@Then("^as a user is should able to click Document Mail$")
	public void as_a_user_is_should_able_to_click_Document_Mail() throws Throwable {
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Alltab));
//		status = EngineeringSchedule.Alltab.isEnabled();
//		assertTrue(status);
//		js.executeScript("arguments[0].click();", EngineeringSchedule.Alltab);
//		EngineeringSchedule.Alltab.click();
		Thread.sleep(3000);
//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page Alltab is enabled");
		System.out.println("Engineering Schedule created Doc Mail page Alltab is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocMail));
		EngineeringSchedule.DocMail.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1SelectKK));
		EngineeringSchedule.Doc1SelectKK.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocMail));
		EngineeringSchedule.DocMail.click();

	}

	@Then("^as a user is should able to click AttachFile in Mail$")
	public void as_a_user_is_should_able_to_click_AttachFile_in_Mail() throws Throwable {
		status = EngineeringSchedule.MailAttachFileMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailAttachFileMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailAttachFileMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailAttachFileMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.MailAttachFileMail.click();
	}

	@Then("^as a user is should able to select Document in AttachFile$")
	public void as_a_user_is_should_able_to_select_Document_in_AttachFile() throws Throwable {
//		status = EngineeringSchedule.DocSelectAttachMail.isEnabled();
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.search));
//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page PrintSize is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.DocSelectAttachMail.click();
		System.out.println("Engineering Schedule created Doc Mail page PrintSize is enabled");

	}

	@Then("^as a user is should able to select Document Num in AttachFile Mail$")
	public void as_a_user_is_should_able_to_select_Document_Num_in_AttachFile_Mail() throws Throwable {
		status = EngineeringSchedule.RepositoryDocMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.RepositoryDocMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page RepositoryDocMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page RepositoryDocMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.WorkflowDocMail.click();
		Thread.sleep(3000);
		EngineeringSchedule.RepositoryDocMail.click();
		Thread.sleep(3000);
		EngineeringSchedule.WorkflowDocMail.click();
		Thread.sleep(3000);
		EngineeringSchedule.WFDocNoPk.click();
	}

	@Then("^as a user is should able to click Submit the AttachFile Mail$")
	public void as_a_user_is_should_able_to_click_Submit_the_AttachFile_Mail() throws Throwable {
		status = EngineeringSchedule.MailAttachSubmit.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailAttachSubmit));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailAttachSubmit is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailAttachSubmit is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.MailAttachSubmit.click();
	}

	@Then("^as a user is should able to select ProjectCode Mail$")
	public void as_a_user_is_should_able_to_select_ProjectCode_Mail() throws Throwable {
		status = EngineeringSchedule.ProjectCodeMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ProjectCodeMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page ProjectCodeMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page ProjectCodeMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.ProjectCodeMail.click();
	}

	@Then("^as a user is should able to capture Demo Project Mail$")
	public void as_a_user_is_should_able_to_capture_Demo_Project_Mail() throws Throwable {
		status = EngineeringSchedule.DemoProjectMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DemoProjectMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page DemoProjectMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page DemoProjectMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.DemoProjectMail.click();
	}

	@Then("^as a user is should able to select Discipline in Mail$")
	public void as_a_user_is_should_able_to_select_Discipline_in_Mail() throws Throwable {
		status = EngineeringSchedule.DisciplineMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DisciplineMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page DisciplineMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page DisciplineMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.DisciplineMail.click();
	}

	@Then("^as a user is should able to capture Discipline Architecture in Mail$")
	public void as_a_user_is_should_able_to_capture_Discipline_Architecture_in_Mail() throws Throwable {
		status = EngineeringSchedule.DisciplineArchiMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DisciplineArchiMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page DisciplineArchiMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page DisciplineArchiMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.DisciplineArchiMail.click();
	}

	@Then("^as a user is should able to select FromOrg in Mail$")
	public void as_a_user_is_should_able_to_select_Fro_Org_in_Mail() throws Throwable {
		status = EngineeringSchedule.FromOrgMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.FromOrgMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page FromOrgMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page FromOrgMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.FromOrgMail.click();
	}

	@Then("^as a user is should able to capture FromOrg LNT in Mail$")
	public void as_a_user_is_should_able_to_capture_FromOrg_LNT_in_Mail() throws Throwable {
		status = EngineeringSchedule.FromOrgLNTMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.FromOrgLNTMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page PrintSize is enabled");
		System.out.println("Engineering Schedule created Doc Mail page PrintSize is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.FromOrgLNTMail.click();
	}

	@Then("^as a user is should able to select ToOrg in Mail$")
	public void as_a_user_is_should_able_to_select_ToOrg_in_Mail() throws Throwable {
		status = EngineeringSchedule.ToOrgMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ToOrgMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page ToOrgMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page ToOrgMail is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.ToOrgMail.click();
	}

	@Then("^as a user is should able to capture ToOrg2 in Mail$")
	public void as_a_user_is_should_able_to_capture_ToOrg2_in_Mail() throws Throwable {
//		status = EngineeringSchedule.ToOrg2Mail.isEnabled();
//		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ToOrg2Mail));
//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page ToOrg2Mail is enabled");
		EngineeringSchedule.ToOrg2Mail.click();
		System.out.println("Engineering Schedule created Doc Mail page ToOrg2Mail is enabled");
		Thread.sleep(3000);

	}

	@Then("^as a user is should able to select MsgSerial No in Mail$")
	public void as_a_user_is_should_able_to_select_MsgSerial_No_in_Mail() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MsgSerialNoMail));
		EngineeringSchedule.MsgSerialNoMail.click();
		Thread.sleep(2000);
//		status = EngineeringSchedule.MsgSerialNoMail.isEnabled();

//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MsgSerialNoMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MsgSerialNoMail is enabled");
	}

	@Then("^as a user is should able to select Serial No in Mail$")
	public void as_a_user_is_should_able_to_select_Serial_No_in_Mail() throws Throwable {
//		status = EngineeringSchedule.SerialNoMail.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SerialNoMail));
//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page SerialNoMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page SerialNoMail is enabled");
		EngineeringSchedule.SerialNoMail.click();
		Thread.sleep(3000);
	}

	@Then("^as a user is should able to select Mail Type in Mail$")
	public void as_a_user_is_should_able_to_select_Mail_Type_in_Mail() throws Throwable {
		status = EngineeringSchedule.MailType.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailType));
		EngineeringSchedule.MailType.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailType is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailType is enabled");
		Thread.sleep(3000);

	}

	@Then("^as a user is should able to capture Letter Mail Type in Mail$")
	public void as_a_user_is_should_able_to_capture_Letter_Mail_Type_in_Mail() throws Throwable {
		status = EngineeringSchedule.LetterMailType.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.LetterMailType));
		EngineeringSchedule.LetterMailType.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page LetterMailType is enabled");
		System.out.println("Engineering Schedule created Doc Mail page LetterMailType is enabled");
		Thread.sleep(3000);	
	}

	@Then("^as a user is should able to click Confidential Toggle in Mail$")
	public void as_a_user_is_should_able_to_click_Confidential_Toggle_in_Mail() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ConfidentialToggleMail));
		EngineeringSchedule.ConfidentialToggleMail.click();
		status = EngineeringSchedule.ConfidentialToggleMail.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page ConfidentialToggleMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page ConfidentialToggleMail is enabled");
		Thread.sleep(2000);
		
	}

	@Then("^as a user is should able to select Msg Group in Mail$")
	public void as_a_user_is_should_able_to_select_Msg_Group_in_Mail() throws Throwable {
		status = EngineeringSchedule.MsgGroupMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MsgGroupMail));
		EngineeringSchedule.MsgGroupMail.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MsgGroupMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MsgGroupMail is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to capture Test as Msg Group in Mail$")
	public void as_a_user_is_should_able_to_capture_Test_as_Msg_Group_in_Mail() throws Throwable {
		status = EngineeringSchedule.MsgGroupTestMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MsgGroupTestMail));
		EngineeringSchedule.MsgGroupTestMail.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MsgGroupTestMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MsgGroupTestMail is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to click ResToggle in Mail$")
	public void as_a_user_is_should_able_to_click_ResToggle_in_Mail() throws Throwable {
		status = EngineeringSchedule.ResToggleYesMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ResToggleYesMail));
		EngineeringSchedule.ResToggleYesMail.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ResToggleNoMail));
		EngineeringSchedule.ResToggleNoMail.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page ResToggleYesMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page ResToggleYesMail is enabled");
		Thread.sleep(3000);
		
	}
//	
//	@Then("^select ResToggle No Mail in eng$")
//	public void select_ResToggle_No_Mail_in_eng() throws Throwable {
//		Thread.sleep(3000);
//	    EngineeringSchedule.ResToggleNoMail.click();
//	    }

	@Then("^as a user is should able to capture Subject in Mail$")
	public void as_a_user_is_should_able_to_capture_Subject_in_Mail() throws Throwable {
		status = EngineeringSchedule.SubjectMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SubjectMail));
		EngineeringSchedule.SubjectMail.click();
		EngineeringSchedule.SubjectMail.sendKeys(ConfigFileReader.getSubject());
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page SubjectMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page SubjectMail is enabled");
		Thread.sleep(2000);
//	    Actions actions = new Actions(Webdriver.driver);
//        actions.moveToElement(EngineeringSchedule.CmntMail);
//        actions.perform();
//        System.out.println("Moved to mail cmnt");

		// EngineeringSchedule.DropDownCmnt.click();
	}

	@Then("^as a user is should able to capture Comment in Mail$")
	public void as_a_user_is_should_able_to_capture_Comment_in_Mail() throws Throwable {
		status = EngineeringSchedule.CmntMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CmntMail));
		EngineeringSchedule.CmntMail.click();
		Thread.sleep(1000);
		EngineeringSchedule.CmntMail.sendKeys("EDMS Automation");
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page CmntMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page CmntMail is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to selected Doc Delete in Mail$")
	public void as_a_user_is_should_able_to_selected_Doc_Delete_in_Mail() throws Throwable {
		status = EngineeringSchedule.DocDeleteInMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocDeleteInMail));
		EngineeringSchedule.DocDeleteInMail.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page DocDeleteInMail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page DocDeleteInMail is enabled");
		Thread.sleep(3000);
	}

	@Then("^as a user is should able to cilck Send in Mail$")
	public void as_a_user_is_should_able_to_cilck_Send_in_Mail() throws Throwable {
		status = EngineeringSchedule.MailSend.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailSend is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailSend is enabled");
		Thread.sleep(3000);
	}

	@Then("^as a user is should able to cilck Save as Draft in Mail$")
	public void as_a_user_is_should_able_to_cilck_Save_as_Draft_in_Mail() throws Throwable {
		status = EngineeringSchedule.MailSaveDraft.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSaveDraft));
		EngineeringSchedule.MailSaveDraft.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailSaveDraft is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailSaveDraft is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to select Attachment File in Mail$")
	public void as_a_user_is_should_able_to_select_Attachment_File_in_Mail() throws Throwable {
		status = EngineeringSchedule.MailAttachFiles.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailAttachFiles));
		EngineeringSchedule.MailAttachFiles.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailAttachFiles is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailAttachFiles is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to select Document Email in table$")
	public void as_a_user_is_should_able_to_select_Document_Email_in_table() throws Throwable {
		status = EngineeringSchedule.EmailDocTable.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EmailDocTable));
		EngineeringSchedule.EmailDocTable.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page EmailDocTable is enabled");
		System.out.println("Engineering Schedule created Doc Mail page EmailDocTable is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to select Email in Page$")
	public void as_a_user_is_should_able_to_select_Email_in_Page() throws Throwable {
		status = EngineeringSchedule.EMailPage.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EMailPage));
		EngineeringSchedule.EMailPage.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page EMailPage is enabled");
		System.out.println("Engineering Schedule created Doc Mail page EMailPage is enabled");
		Thread.sleep(3000);
	
	}

	@Then("^as a user is should able to select Mail in Email Page$")
	public void as_a_user_is_should_able_to_select_Mail_in_Email_Page() throws Throwable {
		status = EngineeringSchedule.MailinEmail.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailinEmail));
		EngineeringSchedule.MailinEmail.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page MailinEmail is enabled");
		System.out.println("Engineering Schedule created Doc Mail page MailinEmail is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to select Email in Transmittal$")
	public void as_a_user_is_should_able_to_select_Email_in_Transmittal() throws Throwable {
		status = EngineeringSchedule.EmailTransmittal.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EmailTransmittal));
		EngineeringSchedule.EmailTransmittal.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page EmailTransmittal is enabled");
		System.out.println("Engineering Schedule created Doc Mail page EmailTransmittal is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to click close in Mail$")
	public void as_a_user_is_should_able_to_click_close_in_Mail() throws Throwable {
		status = EngineeringSchedule.EmailClose.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.EmailClose));
		EngineeringSchedule.EmailClose.click();
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page EmailClose is enabled");
		System.out.println("Engineering Schedule created Doc Mail page EmailClose is enabled");
		Thread.sleep(3000);
		
	}

	@Then("^as a user is should able to Verify Mail Mandatory field check$")
	public void as_a_user_is_should_able_to_Verify_Mail_Mandatory_field_check() throws Throwable {
//		EngineeringSchedule.Alltab.click();
		Thread.sleep(2000);
		status = EngineeringSchedule.DocMail.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocMail));
		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page Verified Mail Mandatory field check");
		System.out.println("Engineering Schedule created Doc Mail page Verified Mail Mandatory field check");
		EngineeringSchedule.DocMail.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1SelectKK));
		EngineeringSchedule.Doc1SelectKK.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocMail));
		EngineeringSchedule.DocMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailAttachFileMail));
		EngineeringSchedule.MailAttachFileMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailAttachFileMail));
		EngineeringSchedule.MailAttachFileMail.click();
//	    EngineeringSchedule.DocSelectAttachMail.click();
//	    Thread.sleep(2000);
//		EngineeringSchedule.WorkflowDocMail.click();
//		Thread.sleep(3000);
//	    EngineeringSchedule.WFDocNoKK.click();
//	    Thread.sleep(2000);
//	    EngineeringSchedule.MailAttachSubmit.click();
//	    Thread.sleep(2000);
//	    EngineeringSchedule.MailSend.click();
//	    Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ProjectCodeMail));
		EngineeringSchedule.ProjectCodeMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DemoProjectMail));
		EngineeringSchedule.DemoProjectMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DisciplineMail));
		EngineeringSchedule.DisciplineMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DisciplineArchiMail));
		EngineeringSchedule.DisciplineArchiMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.FromOrgMail));
		EngineeringSchedule.FromOrgMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.FromOrgLNTMail));
		EngineeringSchedule.FromOrgLNTMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ToOrgMail));
		EngineeringSchedule.ToOrgMail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ToOrg2Mail));
		EngineeringSchedule.ToOrg2Mail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MsgSerialNoMail));
//		EngineeringSchedule.MsgSerialNoMail.click();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SerialNoMail));
//		EngineeringSchedule.SerialNoMail.click();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
//		EngineeringSchedule.MailSend.click();
//		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailType));
		EngineeringSchedule.MailType.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.LetterMailType));
		EngineeringSchedule.LetterMailType.click();
		System.out.println("TEst 1");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		System.out.println("TEst 2");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ConfidentialToggleMail));
		EngineeringSchedule.ConfidentialToggleMail.click();
		System.out.println("TEst 1");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MsgGroupMail));
		EngineeringSchedule.MsgGroupMail.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MsgGroupTestMail));
		EngineeringSchedule.MsgGroupTestMail.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SubjectMail));
		EngineeringSchedule.SubjectMail.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.MailSend));
		EngineeringSchedule.MailSend.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SubjectMail));
		EngineeringSchedule.SubjectMail.click();
		EngineeringSchedule.SubjectMail.sendKeys(ConfigFileReader.getSubject());
		System.out.println("Subject : "+ConfigFileReader.getSubject());
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocDeleteInMail));
		EngineeringSchedule.DocDeleteInMail.click();
//		status = EngineeringSchedule.DocDeleteInMail.isEnabled();search
//		Reporter.addScenarioLog("Engineering Schedule created Doc Mail page Verified Mail Mandatory field check");
		System.out.println("Engineering Schedule created Doc Mail page Verified Mail Mandatory field check");

	}

//	
//	@Then("^as a user is should able to cilck Send in Mail$")
//	public void as_a_user_is_should_able_to_cilck_Send_in_Mail() throws Throwable {
//		Thread.sleep(3000);
//	    EngineeringSchedule.MailSend.click();
//	    }

	// ============================ WORKFLOW
	// INITIATED===============================//

	@Then("^as a user is should able to Initiate C4 Template Workflow$")
	public void as_a_user_is_should_able_to_Initiate_C4_Template_Workflow() throws Throwable {
		Webdriver.driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		EngineeringSchedule.Doc1Select_Tab.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.StartWorkflow));
		EngineeringSchedule.StartWorkflow.click();
		Thread.sleep(3000);
//		EngineeringSchedule.InfoChangeYes.click();
//		Thread.sleep(1000);
		status = EngineeringSchedule.WorkflowTab.isEnabled();
		EngineeringSchedule.WorkflowTab.getText();
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WorkflowTab));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow action is enabled");
		System.out.println("Engineering Schedule page initiated Workflow Action is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4Workflowpage1_DraftingPerson));
		EngineeringSchedule.C4Workflowpage1_DraftingPerson.click();
		status = EngineeringSchedule.C4Workflowpage1_DraftingPerson.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4Workflowpage1_DraftingPerson));
		Reporter.addScenarioLog(
				"Engineering Schedule page initiated Workflow C4Workflowpage1_DraftingPerson is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_DraftingPerson is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.WorkflowInitiated_KK.click();
		Thread.sleep(1000);
		// EngineeringSchedule.StartWorkflowPage_Click.click();
		Thread.sleep(2000);
		EngineeringSchedule.C4Workflowpage1_Checker.click();
		status = EngineeringSchedule.C4Workflowpage1_Checker.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4Workflowpage1_Checker));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_Checker is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_Checker is enabled");
		EngineeringSchedule.C4Workflowpage1_Checker.getText();
//		System.out.println("Engineering Schedule page Approved document is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.WorkflowInitiated_KK.click();
		Thread.sleep(3000);
		// EngineeringSchedule.StartWorkflowPage_Click.click();
		Thread.sleep(1000);
		EngineeringSchedule.C4Workflowpage1_StationIncharge.click();
		status = EngineeringSchedule.C4Workflowpage1_StationIncharge.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4Workflowpage1_StationIncharge));
		Reporter.addScenarioLog(
				"Engineering Schedule page initiated Workflow C4Workflowpage1_StationIncharge is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_StationIncharge is enabled");
		Thread.sleep(4000);
		EngineeringSchedule.WorkflowInitiated_KK.click();
		Thread.sleep(3000);
		// EngineeringSchedule.StartWorkflowPage_Click.click();
		Thread.sleep(1000);
		EngineeringSchedule.C4Workflowpage1_SectionHead.click();
		Thread.sleep(3000);
		status = EngineeringSchedule.C4Workflowpage1_SectionHead.isEnabled();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.C4Workflowpage1_SectionHead));
		Reporter.addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_SectionHead is enabled");
		System.out.println("Engineering Schedule page initiated Workflow C4Workflowpage1_SectionHead is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WorkflowInitiated_KK));
		EngineeringSchedule.WorkflowInitiated_KK.click();
		/*
		 * EngineeringSchedule.C4Workflowpage1_DesignEngineer.click(); status =
		 * EngineeringSchedule.C4Workflowpage1_DesignEngineer.isEnabled();
		 * wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.
		 * C4Workflowpage1_DesignEngineer)); Reporter.
		 * addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_DesignEngineer is enabled"
		 * ); System.out.
		 * println("Engineering Schedule page initiated Workflow C4Workflowpage1_DesignEngineer is enabled"
		 * ); EngineeringSchedule.C4Workflowpage1_DesignEngineer.getText();
		 * System.out.println("Engineering Schedule page Approved document is enabled");
		 * Thread.sleep(3000); EngineeringSchedule.WorkflowInitiated_KK.click();
		 * Thread.sleep(3000); // EngineeringSchedule.StartWorkflowPage_Click.click();
		 * EngineeringSchedule.C4Workflowpage1_Approver.click(); status =
		 * EngineeringSchedule.C4Workflowpage1_Approver.isEnabled(); assertTrue(status);
		 * Reporter.
		 * addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_Approver is enabled"
		 * ); System.out.
		 * println("Engineering Schedule page initiated Workflow C4Workflowpage1_Approver is enabled"
		 * ); EngineeringSchedule.WorkflowInitiated_PK.click(); Thread.sleep(3000);
		 * EngineeringSchedule.WorkflowInitiated_KK.click(); Thread.sleep(1000);
		 * EngineeringSchedule.C4Workflowpage1_ISD.click(); status =
		 * EngineeringSchedule.C4Workflowpage1_ISD.isEnabled(); assertTrue(status);
		 * Reporter.
		 * addScenarioLog("Engineering Schedule page initiated Workflow C4Workflowpage1_ISD is enabled"
		 * ); System.out.
		 * println("Engineering Schedule page initiated Workflow C4Workflowpage1_ISD is enabled"
		 * ); Thread.sleep(4000); EngineeringSchedule.WorkflowInitiated_KK.click();
		 * Thread.sleep(3000);
		 */
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.WorkflowTab));
		EngineeringSchedule.WorkflowTab.getText();
		EngineeringSchedule.WorkflowTab.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.workflow_save));
		EngineeringSchedule.workflow_save.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.workflow_save));
		  if(EngineeringSchedule.workflow_save.isEnabled()) {
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.workflow_save));
		try {
			 EngineeringSchedule.workflow_save.click();
		Thread.sleep(2000);
			 
		}catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",EngineeringSchedule.workflow_save);
		}
		  
		  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Workflow initiated Visited.");
		  }else {			  
			  com.vimalselvam.cucumber.listener.Reporter.addStepLog("Workflow initiated.");
		  }
		  
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CnfrmYes));
		EngineeringSchedule.CnfrmYes.click();
		Thread.sleep(4000);
//		status=EngineeringSchedule.WorkflowInitiated_KK.isEnabled();
//		assertTrue(status);
//		Reporter.addScenarioLog("Engineering Schedule page approve In ForAction Tab is enabled");
//		System.out.println("Engineering Schedule page approved doc In Approved Tab is enabled");
	}

	@Then("^user should able to Initiate GFC Workflow$")
	public void user_should_able_to_Initiate_GFC_Workflow() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ForActionTab));
		EngineeringSchedule.ForActionTab.click();
		status = EngineeringSchedule.Doc1Select_Tab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		Reporter.addScenarioLog("Engineering Schedule Create page Doc1Select_Tab is enabled");
		System.out.println("Engineering Schedule Create page Doc1Select_Tab is enabled");
		EngineeringSchedule.Doc1Select_Tab.click();
		status = EngineeringSchedule.DocApprove_InForAction.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.DocApprove_InForAction));
		Reporter.addScenarioLog("Engineering Schedule Create page DocApprove_InForAction is enabled");
		System.out.println("Engineering Schedule Create page DocApprove_InForAction is enabled");
		EngineeringSchedule.DocApprove_InForAction.click();
		status = EngineeringSchedule.ApprovedTab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.ApprovedTab));
		Reporter.addScenarioLog("Engineering Schedule Create page ApprovedTab is enabled");
		System.out.println("Engineering Schedule Create page ApprovedTab is enabled");
		Thread.sleep(3000);
		EngineeringSchedule.ApprovedTab.click();
		status = EngineeringSchedule.Doc1Select_Tab.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.Doc1Select_Tab));
		Reporter.addScenarioLog("Engineering Schedule Create page Doc1Select_Tab is enabled");
		System.out.println("Engineering Schedule Create page Doc1Select_Tab is enabled");
		EngineeringSchedule.Doc1Select_Tab.click();
		status = EngineeringSchedule.StartWorkflow.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.StartWorkflow));
		Reporter.addScenarioLog("Engineering Schedule Create page StartWorkflow as Workflow is enabled");
		System.out.println("Engineering Schedule Create page StartWorkflow as Workflow is enabled");
		EngineeringSchedule.StartWorkflow.click();
		status = EngineeringSchedule.CnfrmYes.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CnfrmYes));
		Reporter.addScenarioLog("Engineering Schedule Create page CnfrmYes is enabled");
		System.out.println("Engineering Schedule Create page CnfrmYes is enabled");
		EngineeringSchedule.CnfrmYes.click();
		status = EngineeringSchedule.GFC_WF_CCNType1.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCNType1));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType1 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType1 is enabled");
		EngineeringSchedule.GFC_WF_CCNType1.click();
		status = EngineeringSchedule.GFC_WF_CCNTag1.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCNTag1));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag1 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag1 is enabled");
		EngineeringSchedule.GFC_WF_CCNTag1.click();
		status = EngineeringSchedule.GFC_WF_CCNType2.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCNType2));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType2 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNType2 is enabled");
		EngineeringSchedule.GFC_WF_CCNType2.click();
		status = EngineeringSchedule.GFC_WF_CCNTag2.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCNTag2));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag2 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNTag2 is enabled");
		EngineeringSchedule.GFC_WF_CCNTag2.click();
		status = EngineeringSchedule.GFC_WF_CCN_DocStatus.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_DocStatus));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DocStatus is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DocStatus is enabled");
		EngineeringSchedule.GFC_WF_CCN_DocStatus.click();
		status = EngineeringSchedule.GFC_WF_CCN_StatusAprrovedN.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_StatusAprrovedN));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_StatusAprrovedN is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_StatusAprrovedN is enabled");
		EngineeringSchedule.GFC_WF_CCN_StatusAprrovedN.click();
		status = EngineeringSchedule.GFC_WF_CCN_Size.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_Size));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Size is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Size is enabled");
		EngineeringSchedule.GFC_WF_CCN_Size.click();
		status = EngineeringSchedule.GFC_WF_CCN_SizeA2.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_SizeA2));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_SizeA2 is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_SizeA2 is enabled");
		EngineeringSchedule.GFC_WF_CCN_SizeA2.click();
		status = EngineeringSchedule.GFC_WF_CCN_category.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_category));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_category is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_category is enabled");
		EngineeringSchedule.GFC_WF_CCN_category.click();
		status = EngineeringSchedule.GFC_WF_CCN_categoryGFC.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_categoryGFC));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_categoryGFC is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_categoryGFC is enabled");
		EngineeringSchedule.GFC_WF_CCN_categoryGFC.click();
//		status = EngineeringSchedule.GFC_WF_CCNCalendar.isEnabled();
//		assertTrue(status);
//		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCNCalendar));
//		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNCalendar is enabled");
//		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCNCalendar is enabled");
//		EngineeringSchedule.GFC_WF_CCNCalendar.click();
		// Calendar
		Thread.sleep(2000);
		EngineeringSchedule.Datepicker_select_calender.click();
		EngineeringSchedule.Datepicker_select_calender_header.click();
		Actions actions2 = new Actions(Webdriver.driver);
		actions2.moveToElement(EngineeringSchedule.Datepicker_select_year);
		actions2.perform();
		Thread.sleep(3000);
		Actions actions3 = new Actions(Webdriver.driver);
		actions3.moveToElement(EngineeringSchedule.Datepicker_select_year);
		actions3.perform();
		Thread.sleep(3000);
		Actions actions4 = new Actions(Webdriver.driver);
		actions4.moveToElement(EngineeringSchedule.Datepicker_select_year);
		actions4.perform();
		Thread.sleep(3000);
		Random rand = new Random();
		int randomYear = rand.nextInt(EngineeringSchedule.Datepicker_year.size());
		System.out.println("Year selected : " + randomYear);
		EngineeringSchedule.Datepicker_year.get(randomYear).click();
		Thread.sleep(3000);
		int randommonth = rand.nextInt(EngineeringSchedule.Datepicker_select_Month.size());
		System.out.println("Month selected : " + randommonth);
		Thread.sleep(2000);
		EngineeringSchedule.Datepicker_select_Month.get(randommonth).click();
		Thread.sleep(2000);
		int randomDate = rand.nextInt(EngineeringSchedule.Datepicker_select_Date.size());
		System.out.println("Date selected : " + randomDate);
		Thread.sleep(2000);
		EngineeringSchedule.Datepicker_select_Date.get(randomDate).click();
		Thread.sleep(2000);
//	        System.out.println("Workman DOB Entered : "+EngineeringSchedule.Personal_DOB.getAttribute("value"));
		//
		status = EngineeringSchedule.GFC_WF_CCN_DrafManHr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_DrafManHr));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DrafManHr is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DrafManHr is enabled");
		EngineeringSchedule.GFC_WF_CCN_DrafManHr.click();
		Thread.sleep(3000);
		EngineeringSchedule.GFC_WF_CCN_DrafManHr.sendKeys("356.87561");
		status = EngineeringSchedule.GFC_WF_CCN_DesignManHr.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_DesignManHr));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DesignManHr is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_DesignManHr is enabled");
		EngineeringSchedule.GFC_WF_CCN_DesignManHr.click();
		Thread.sleep(3000);
		EngineeringSchedule.GFC_WF_CCN_DesignManHr.sendKeys("456.9878941");
		status = EngineeringSchedule.GFC_WF_CCN_Save.isEnabled();
		assertTrue(status);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFC_WF_CCN_Save));
		Reporter.addScenarioLog("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Save is enabled");
		System.out.println("Engineering Schedule Create page WorkflowGFC GFC_WF_CCN_Save is enabled");
		EngineeringSchedule.GFC_WF_CCN_Save.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFCWorkflowpage_Approver));
		EngineeringSchedule.GFCWorkflowpage_Approver.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthoriseKK));
		EngineeringSchedule.AuthoriseKK.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.GFCWorkflowpage_DesignEngineer));
		EngineeringSchedule.GFCWorkflowpage_DesignEngineer.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.AuthoriseKK));
		EngineeringSchedule.AuthoriseKK.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.SaveBtn));
		EngineeringSchedule.SaveBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(EngineeringSchedule.CnfrmYes));
		EngineeringSchedule.CnfrmYes.click();
		Thread.sleep(4000);
	}
	
	
	@Then("^Verify As a user i should able to choose and switch Project in Engineering Schedule Doc$")
	public void Verify_As_a_user_i_should_able_to_choose_and_switch_Project_in_Repository_Doc() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectClr));
		status = EngineeringSchedule.ProjectClr.isEnabled();
		assertTrue(status);
		Reporter.addScenarioLog("Repository Document Create page ResetBTn is enabled");
		EngineeringSchedule.ProjectClr.click();
		System.out.println("Repository Document Create page ProjectClr is enabled");
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.CommonProjectSD));
//		System.out.println("Repository Document page LICProject is enabled");
//		EngineeringSchedule.CommonProjectSD.click();
		
		//***************************

List<WebElement> listofOptions= EngineeringSchedule.OptionList;
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
		System.err.println(EngineeringSchedule.WarngMessage.getText());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.InfoChangeYes));
		EngineeringSchedule.InfoChangeYes.click();
	
		System.out.println("Engineering Schedule doc page InfoChangeYes is enabled");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectClr));
		Thread.sleep(2000);
		EngineeringSchedule.ProjectClr.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectName));
		EngineeringSchedule.ProjectName.sendKeys("O21534");
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.GandhiProject));
		EngineeringSchedule.GandhiProject.click();
		
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
		System.err.println(EngineeringSchedule.WarngMessage.getText());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.InfoChangeNo));
		EngineeringSchedule.InfoChangeNo.click();
		System.out.println("Engineering Schedule doc page InfoChangeNo is enabled");
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectClr));
		EngineeringSchedule.ProjectClr.click();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.DemoProject));
//		EngineeringSchedule.DemoProject.click();
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
				}	System.err.println(EngineeringSchedule.WarngMessage.getText());
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.InfoChangeYes));
		EngineeringSchedule.InfoChangeYes.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectClr));
		Thread.sleep(2000);
		EngineeringSchedule.ProjectClr.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.ProjectName));
		EngineeringSchedule.ProjectName.sendKeys("O21534");
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.GandhiProject));
		EngineeringSchedule.GandhiProject.click();
		System.err.println(EngineeringSchedule.WarngMessage.getText());
		wait.until(ExpectedConditions.visibilityOfAllElements(EngineeringSchedule.InfoChangeYes));
		EngineeringSchedule.InfoChangeYes.click();
		Thread.sleep(6000);
	}
	
	
	
	
	
	
	
	
	

}
