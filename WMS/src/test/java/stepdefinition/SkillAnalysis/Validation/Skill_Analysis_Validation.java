package stepdefinition.SkillAnalysis.Validation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class Skill_Analysis_Validation {

	static int Skill_Analyisis_Count;
	static int Skill_Card_Count;
	static String Skill_Analyisis_Value;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static String WorkmanName_SkillTable;
	public static String WorkmanNumber_SkillTable;
	public static String SkillDesc_SkillTable;
	public static String WorkmanPartner;
	static int Paramedics_Count;
	public static int TotalQuestiones_allElements;
	public static int TotalAnswer_allElements;
	static int Paramedics_Card_Count;
	static float Percentage;
	static String Paramedics_Value;

// Page Factory
	public Skill_Analysis_Validation() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************
	public static ConfigFileReader configFileReader;

	@Then("^Verify User can be able to select workmen and Proceed to Skill Test$")
	public static void Verify_User_can_be_able_to_select_workmen_and_Proceed_to_Skill_Test() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card));

		// ========================================================
		Skill_Card_Count = Skill_Analysis_Objects.Skill_Analysis_card.size();
		System.out.println("Workmen Available For Skill Analysis :" + Skill_Card_Count);

		System.out.println("Selecting 1 Workmen Profile for Skill Analysis");
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_First_card);
		actions.perform();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_First_card);

		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Go_Next);
		actions2.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Go_Next));
		Skill_Analysis_Objects.Skill_Analysis_Go_Next.click();

	}

	@Then("^Verify User can be able to Validate Total Questions with no input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Questions_with_no_input() throws Throwable {

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Test Status with no input$")
	public static void Verify_User_can_be_able_to_Validate_Test_Status_with_no_input() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1));
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.clear();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.sendKeys("5");
		System.out.println("Total Questions : 5");

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Skill type with no input$")
	public static void Verify_User_can_be_able_to_Validate_Skill_type_with_no_input() throws Throwable {

		System.out.println("Skill Analysis Accept");
		Skill_Analysis_Objects.Skill_Analysis_Accept.click();

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Retest Date with no input$")
	public static void Verify_User_can_be_able_to_Validate_Retest_Date_with_no_input() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Reject));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Reject);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Retest Date with Past Date$")
	public static void Verify_User_can_be_able_to_Validate_Retest_Date_with_Past_Date() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Reject));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Reject);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));

		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(5000);
		Actions actions222 = new Actions(DriverFactory.driver);
		actions222.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_Past);
		actions222.perform();
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_Past));
		Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_Past.click();
		System.out.println("Skill Analysis Retest date selected as 5 Days past from Today");
		Thread.sleep(5000);

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Retest Date with Current Date$")
	public static void Verify_User_can_be_able_to_Validate_Retest_Date_with_Current_Date() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Reject));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Reject);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));

		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(5000);
		Actions actions222 = new Actions(DriverFactory.driver);
		actions222.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_today);
		actions222.perform();
		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_today));
		Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_today.click();
		System.out.println("Skill Analysis Retest date selected as Today");
		Thread.sleep(5000);

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();
	}

	@Then("^Verify User can be able to Validate Correct error message if Total Answers is more then Total Questions$")
	public static void Verify_User_can_be_able_to_Validate_Correct_error_message_if_Total_Answers_is_more_then_Total_Questions()
			throws Throwable {

		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.clear();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.sendKeys("999");

		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Reject));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Reject);
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));

		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(5000);
		Actions actions222 = new Actions(DriverFactory.driver);
		actions222.moveToElement(Skill_Analysis_Objects.Skill_Analysis_DateSelected_after5);
		actions222.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_DateSelected_after5));
		Skill_Analysis_Objects.Skill_Analysis_DateSelected_after5.click();
		Thread.sleep(5000);

		Actions actionsSave = new Actions(DriverFactory.driver);
		actionsSave.moveToElement(Skill_Analysis_Objects.Skill_Analysis_submit);
		actionsSave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_submit));
		Skill_Analysis_Objects.Skill_Analysis_submit.click();
		Verification_Popup_Skill.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Total Questions with max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Questions_with_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1);
		actionsobj.perform();
		
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.clear();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Total Questions Field Value : "+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length());
		if (Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in Total Questions Field");
		} 
		else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length()+ " Length Numeric Value in Total Questions Field");
		}
		else {
			System.out.println("Error : User Can be able to Enter "+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length()+ " Length Numeric Value in Total Questions Field");
		}
	}

	@Then("^Verify User can be able to Validate Total Questions with alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Questions_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1);
		actionsobj.perform();
		
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.clear();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Total Questions Field Value : "+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length());
		if (Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Total Questions Field");
		} 
		else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length()+ " Length alphabets Value in Total Questions Field");
		}
		else {
			System.out.println("Error : User Can be able to Enter "+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length()+ " Length alphabets Value in Total Questions Field");
		}

		
	}

	@Then("^Verify User can be able to Validate Total Questions with Special characters input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Questions_with_Special_characters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1);
		actionsobj.perform();
		
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.clear();
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.click();
		
		Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Total Questions Field Value : "+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length());
		if (Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special characters Value in Total Questions Field");
		} 
		else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length()+ " Length Special characters Value in Total Questions Field");
		}
		else {
			System.out.println("Error : User Can be able to Enter "+ Skill_Analysis_Objects.Skill_Analysis_TotalQuestiones1.getAttribute("value").length()+ " Length Special characters Value in Total Questions Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Total Answers with max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Answers_with_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1);
		actionsobj.perform();
		
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.clear();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Total Answers Field Value : "+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length());
		if (Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Numeric Value in Total Answers Field");
		} 
		else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length()+ " Length Numeric Value in Total Answers Field");
		}
		else {
			System.out.println("Error : User Can be able to Enter "+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length()+ " Length Numeric Value in Total Answers Field");
		}
	}

	@Then("^Verify User can be able to Validate Total Answers with alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Answers_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1);
		actionsobj.perform();
		
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.clear();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Total Answers Field Value : "+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length());
		if (Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any alphabets Value in Total Answers Field");
		} 
		else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length()+ " Length alphabets Value in Total Answers Field");
		}
		else {
			System.out.println("Error : User Can be able to Enter "+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length()+ " Length alphabets Value in Total Answers Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Total Answers with Special characters input$")
	public static void Verify_User_can_be_able_to_Validate_Total_Answers_with_Special_characters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1);
		actionsobj.perform();
		
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.clear();
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.click();
		
		Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Total Answers Field Value : "+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length());
		if (Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length() == 0) {
			System.out.println("Application Not allowing to Enter Any Special characters Value in Total Answers Field");
		} 
		else if (ObjectsReporsitory.Education_Discipiline.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length()+ " Length Special characters Value in Total Answers Field");
		}
		else {
			System.out.println("Error : User Can be able to Enter "+ Skill_Analysis_Objects.Skill_Analysis_CorrectAnswers1.getAttribute("value").length()+ " Length Special characters Value in Total Answers Field");
		}
	}

}
