package stepdefinition.Wage.Validation;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
public class Wage_Validation {

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
	public static int Paramedics_Count;
	public static int TotalQuestiones_allElements;
	public static int TotalAnswer_allElements;
	static int Paramedics_Card_Count;
	static float Percentage;
	static String Paramedics_Value;
	public static int Wage_Count;
	public static int Wage_Card_Count;
	public static int MedicalTest_Card_Count;
	public static int MedicalTest_Count;
	public static String Medical_test_date;
	public static String Workmanname_profile;
	public static int Random_skintemp;
	public static int Random_BP;
	public static String Varicose_Status_v;
	public static String Seizure_Status_v;
	public static String Vertigo_Status_v;
	public static String Acrophobia_Status_v;
	public static String Diabetes_Status_v;
	public static String Stroke_Status_v;
	public static String HeartDisease_Status_v;
	public static String MajorIllnessorSurgery_Status_v;
	public static String RespiratoryDiseases_Status_v;
	public static String MedicalTestFitness_Status_v;
	public static int EHS_Count;
	public static int EHS_Card_Count;
	public static int EHS_SelectedProfileforTraining;
	public static int EHS_Selected_Workmen_Count;
	public static String Selected_Project_Location;
	public static String Selected_Zone;
	public static String Wage_Payout_options;
	public static String Wage_Payout_options_selected;
	public static int Daily_payout_Basic;
	public static int Daily_payout_HRA;
	public static int Daily_payout_PF;
	public static int Daily_payout_ESI;
	public static int Daily_payout_Professional_Tax;
	public static int Monthly_payout_Basic;
	public static int Monthly_payout_HRA;
	public static int Monthly_payout_PF;
	public static int Monthly_payout_ESI;
	public static int Monthly_payout_Professional_Tax;
	public static String Selected_otherAllowances_Reason;
	public static String Selected_otherAllowances_dependent;
	public static int Daily_Fixed_OtherAllowances;
	public static int Daily_Fixed_OtherAllowances_Amount_calculated;
	public static int Daily_Fixed_OtherAllowances_Input;
	public static int Daily_Fixed_OtherAllowances_Total;
	public static int Record_Count;
	public static int Daily_Fixed_OtherAllowances_Total_Amount;
	public static int Wage_otherAllowances_Amount_Calculated_AllAmount;
	public static int Total_Basic_Earnings;
	public static int Total_HRA;
	public static int Total_Provisional_Allowances;
	public static int Wage_Total_Provisional;
	public static int Wage_Total_Provisional2;
	public static int Calculation;
	public static int Calculation2;
	public static int Daily_Professional_Tax;
	public static int Monthly_Professional_Tax;
	public static int Total_PF;
	public static int Total_ESI;
	public static int Total_PT;
	public static int Total_Recoveries;
	public static int Provisional_Deductions;
	public static int Provisional_Deductions2;
	public static int Wage_Total;

// Page Factory
	public Wage_Validation() {
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

	@Then("^Verify user can be able to Validate Basic Earnings with no input$")
	public static void Verify_user_can_be_able_to_Validate_Basic_Earnings_with_no_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		ObjectsReporsitory.Wage_Earnings_Basic.clear();
		
		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.Wage_Submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Submit));
		ObjectsReporsitory.Wage_Submit.click();
		Verification_Popup_Wage.Validation_popup_handle();
	}

	@Then("^Verify user can be able to Validate HRA Earnings with no input$")
	public static void Verify_user_can_be_able_to_Validate_HRA_Earnings_with_no_input() throws Throwable {
		//*********************************************************************************
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		//*********************************************************************************		
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		ObjectsReporsitory.Wage_Earnings_Basic.clear();
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		int min = 100;
		int max = 1000;
		Random rand_Daily_payout_Basic = new Random();
		Daily_payout_Basic = rand_Daily_payout_Basic.nextInt(max - min) + min;
		ObjectsReporsitory.Wage_Earnings_Basic.sendKeys("" + Daily_payout_Basic);
		System.out.println("Basic Pay :" + Daily_payout_Basic);
		
		
		//*********************************************************************************
		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.Wage_Submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Submit));
		ObjectsReporsitory.Wage_Submit.click();
		Verification_Popup_Wage.Validation_popup_handle();
		//*********************************************************************************
	}

	@Then("^Verify user can be able to Validate other allowance Value with no input$")
	public static void Verify_user_can_be_able_to_Validate_other_allowance_with_no_input() throws Throwable {
		
		//*********************************************************************************
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		//*********************************************************************************		
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		ObjectsReporsitory.Wage_Earnings_Basic.clear();
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		int min = 100;
		int max = 1000;
		Random rand_Daily_payout_Basic = new Random();
		Daily_payout_Basic = rand_Daily_payout_Basic.nextInt(max - min) + min;
		ObjectsReporsitory.Wage_Earnings_Basic.sendKeys("" + Daily_payout_Basic);
		System.out.println("Basic Pay :" + Daily_payout_Basic);
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances));
		ObjectsReporsitory.Wage_otherAllowances.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_post));
		ObjectsReporsitory.Wage_otherAllowances_post.click();
		Verification_Popup_Wage.Validation_popup_handle();
		//*********************************************************************************
		
	}

	@Then("^Verify user can be able to Validate other allowance with dependent not selected$")
	public static void Verify_user_can_be_able_to_Validate_other_allowance_with_dependent_not_selected()
			throws Throwable {
	}

	@Then("^Verify user can be able to Validate if PF Deduction is enabled$")
	public static void Verify_user_can_be_able_to_Validate_if_PF_Deduction_is_enabled() throws Throwable {
	}

	@Then("^Verify user can be able to Validate if ESI Deduction is enabled$")
	public static void Verify_user_can_be_able_to_Validate_if_ESI_Deduction_is_enabled() throws Throwable {
	}

	@Then("^Verify user can be able to Validate if Professional Tax Deduction is enabled$")
	public static void Verify_user_can_be_able_to_Validate_if_Professional_Tax_Deduction_is_enabled() throws Throwable {
	}

	@Then("^Verify user can be able to Validate other recoveries with no input$")
	public static void Verify_user_can_be_able_to_Validate_other_recoveries_with_no_input() throws Throwable {
		
		//*********************************************************************************
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		//*********************************************************************************		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherrecoveries));
		ObjectsReporsitory.Wage_otherrecoveries.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_post));
		ObjectsReporsitory.Wage_otherAllowances_post.click();
		Verification_Popup_Wage.Validation_popup_handle();
		//*********************************************************************************		
	}

	@Then("^Verify user can be able to Validate other recoveries with dependent not selected$")
	public static void Verify_user_can_be_able_to_Validate_other_recoveries_with_dependent_not_selected()
			throws Throwable {
	}

	@Then("^Verify user can be able to Validate Basic Earnings with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_Basic_Earnings_with_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		ObjectsReporsitory.Wage_Earnings_Basic.clear();
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		
		ObjectsReporsitory.Wage_Earnings_Basic.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Basic Field Value : "+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Basic Field");
		} 
		else if (ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length()+ " Length Numeric Value in Basic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length()+ " Length Numeric Value in Basic Field");
		}
		
	}

	@Then("^Verify user can be able to Validate Basic Earnings with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_Basic_Earnings_with_alphabets_input() throws Throwable {
		

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		ObjectsReporsitory.Wage_Earnings_Basic.clear();
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		
		ObjectsReporsitory.Wage_Earnings_Basic.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Basic Field Value : "+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Basic Field");
		} 
		else if (ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length()+ " Length alphabets Value in Basic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length()+ " Length alphabets Value in Basic Field");
		}
		
	}

	@Then("^Verify user can be able to Validate Basic Earnings with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_Basic_Earnings_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_Basic);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		ObjectsReporsitory.Wage_Earnings_Basic.clear();
		ObjectsReporsitory.Wage_Earnings_Basic.click();
		
		ObjectsReporsitory.Wage_Earnings_Basic.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Basic Field Value : "+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Basic Field");
		} 
		else if (ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length()+ " Length Special Charecters Value in Basic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value").length()+ " Length Special Charecters Value in Basic Field");
		}
	}

	@Then("^Verify user can be able to Validate HRA Earnings with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_HRA_Earnings_with_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_HRA);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_HRA.click();
		ObjectsReporsitory.Wage_Earnings_HRA.clear();
		ObjectsReporsitory.Wage_Earnings_HRA.click();
		
		ObjectsReporsitory.Wage_Earnings_HRA.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the HRA Field Value : "+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in HRA Field");
		} 
		else if (ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length()+ " Length Numeric Value in HRA Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length()+ " Length Numeric Value in HRA Field");
		}
	}

	@Then("^Verify user can be able to Validate HRA Earnings with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_HRA_Earnings_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_HRA);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_HRA.click();
		ObjectsReporsitory.Wage_Earnings_HRA.clear();
		ObjectsReporsitory.Wage_Earnings_HRA.click();
		
		ObjectsReporsitory.Wage_Earnings_HRA.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the HRA Field Value : "+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in HRA Field");
		} 
		else if (ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length()+ " Length alphabets Value in HRA Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length()+ " Length alphabets Value in HRA Field");
		}
		
	}

	@Then("^Verify user can be able to Validate HRA Earnings with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_HRA_Earnings_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Earnings_HRA);
		actionsobj.perform();
		
		ObjectsReporsitory.Wage_Earnings_HRA.click();
		ObjectsReporsitory.Wage_Earnings_HRA.clear();
		ObjectsReporsitory.Wage_Earnings_HRA.click();
		
		ObjectsReporsitory.Wage_Earnings_HRA.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the HRA Field Value : "+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in HRA Field");
		} 
		else if (ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length()+ " Length Special Charecters Value in HRA Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value").length()+ " Length Special Charecters Value in HRA Field");
		}
	}

	@Then("^Verify user can be able to Validate other allowance with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_other_allowance_with_max_numeric_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_otherAllowances);
		actionsobj.perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances));
		ObjectsReporsitory.Wage_otherAllowances.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_value));
		ObjectsReporsitory.Wage_otherAllowances_value.click();
		ObjectsReporsitory.Wage_otherAllowances_value.clear();
		ObjectsReporsitory.Wage_otherAllowances_value.click();
		
		ObjectsReporsitory.Wage_otherAllowances_value.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the other allowance value Field Value : "+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in other allowance value Field");
		} 
		else if (ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length()+ " Length Numeric Value in other allowance value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length()+ " Length Numeric Value in other allowance value Field");
		}
		
		Actions actionsesc = new Actions(DriverFactory.driver);
		actionsesc.sendKeys(Keys.ESCAPE);
		actionsesc.perform();
		
	}

	@Then("^Verify user can be able to Validate other allowance with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_other_allowance_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_otherAllowances);
		actionsobj.perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances));
		ObjectsReporsitory.Wage_otherAllowances.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_value));
		ObjectsReporsitory.Wage_otherAllowances_value.click();
		ObjectsReporsitory.Wage_otherAllowances_value.clear();
		ObjectsReporsitory.Wage_otherAllowances_value.click();
		
		ObjectsReporsitory.Wage_otherAllowances_value.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the other allowance value Field Value : "+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in other allowance value Field");
		} 
		else if (ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length()+ " Length alphabets Value in other allowance value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length()+ " Length alphabets Value in other allowance value Field");
		}
		
		Actions actionsesc = new Actions(DriverFactory.driver);
		actionsesc.sendKeys(Keys.ESCAPE);
		actionsesc.perform();
		
	}

	@Then("^Verify user can be able to Validate other allowance with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_other_allowance_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_otherAllowances);
		actionsobj.perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances));
		ObjectsReporsitory.Wage_otherAllowances.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_value));
		ObjectsReporsitory.Wage_otherAllowances_value.click();
		ObjectsReporsitory.Wage_otherAllowances_value.clear();
		ObjectsReporsitory.Wage_otherAllowances_value.click();
		
		ObjectsReporsitory.Wage_otherAllowances_value.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the other allowance value Field Value : "+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in other allowance value Field");
		} 
		else if (ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length()+ " Length Special Charecters Value in other allowance value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value").length()+ " Length Special Charecters Value in other allowance value Field");
		}
		
		Actions actionsesc = new Actions(DriverFactory.driver);
		actionsesc.sendKeys(Keys.ESCAPE);
		actionsesc.perform();
	}

	@Then("^Verify user can be able to Validate PF Deduction with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_PF_Deduction_with_max_numeric_input() throws Throwable {
		
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_PF);
		actionsobj.perform();
		
		boolean checkbox_PF = ObjectsReporsitory.Wage_Deductions_PF_Checkbox.isSelected();
		
		if(checkbox_PF==true) {
			System.out.println("PF Checkbox is selected");
		}
		else if(checkbox_PF==false) {
			System.out.println("PF Checkbox is Not selected");
			System.out.println("Selecting PF Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
			ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PF));
		ObjectsReporsitory.Wage_Deduction_PF.click();
		ObjectsReporsitory.Wage_Deduction_PF.clear();
		ObjectsReporsitory.Wage_Deduction_PF.click();
		
		ObjectsReporsitory.Wage_Deduction_PF.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the PF Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in PF Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length()+ " Length Numeric Value in PF Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length()+ " Length Numeric Value in PF Deduction value Field");
		}
		
	}

	@Then("^Verify user can be able to Validate PF Deduction with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_PF_Deduction_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_PF);
		actionsobj.perform();
		
		boolean checkbox_PF = ObjectsReporsitory.Wage_Deductions_PF_Checkbox.isSelected();
		
		if(checkbox_PF==true) {
			System.out.println("PF Checkbox is selected");
		}
		else if(checkbox_PF==false) {
			System.out.println("PF Checkbox is Not selected");
			System.out.println("Selecting PF Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
			ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PF));
		ObjectsReporsitory.Wage_Deduction_PF.click();
		ObjectsReporsitory.Wage_Deduction_PF.clear();
		ObjectsReporsitory.Wage_Deduction_PF.click();
		
		ObjectsReporsitory.Wage_Deduction_PF.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the PF Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in PF Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length()+ " Length alphabets Value in PF Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length()+ " Length alphabets Value in PF Deduction value Field");
		}
		
	}

	@Then("^Verify user can be able to Validate PF Deduction with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_PF_Deduction_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_PF);
		actionsobj.perform();
		
		boolean checkbox_PF = ObjectsReporsitory.Wage_Deductions_PF_Checkbox.isSelected();
		
		if(checkbox_PF==true) {
			System.out.println("PF Checkbox is selected");
		}
		else if(checkbox_PF==false) {
			System.out.println("PF Checkbox is Not selected");
			System.out.println("Selecting PF Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
			ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PF));
		ObjectsReporsitory.Wage_Deduction_PF.click();
		ObjectsReporsitory.Wage_Deduction_PF.clear();
		ObjectsReporsitory.Wage_Deduction_PF.click();
		
		ObjectsReporsitory.Wage_Deduction_PF.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the PF Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in PF Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length()+ " Length Special Charecters Value in PF Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_PF.getAttribute("value").length()+ " Length Special Charecters Value in PF Deduction value Field");
		}
	}

	@Then("^Verify user can be able to Validate if ESI Deduction with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_if_ESI_Deduction_with_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_ESI);
		actionsobj.perform();
		
		boolean checkbox_ESI = ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.isSelected();
		
		if(checkbox_ESI==true) {
			System.out.println("ESI Checkbox is selected");
		}
		else if(checkbox_ESI==false) {
			System.out.println("ESI Checkbox is Not selected");
			System.out.println("Selecting ESI Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_ESI_Checkbox));
			ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PF));
		ObjectsReporsitory.Wage_Deduction_ESI.click();
		ObjectsReporsitory.Wage_Deduction_ESI.clear();
		ObjectsReporsitory.Wage_Deduction_ESI.click();
		
		ObjectsReporsitory.Wage_Deduction_ESI.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the ESI Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in ESI Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length()+ " Length Numeric Value in ESI Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length()+ " Length Numeric Value in ESI Deduction value Field");
		}
	}

	@Then("^Verify user can be able to Validate if ESI Deduction with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_if_ESI_Deduction_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_ESI);
		actionsobj.perform();
		
		boolean checkbox_ESI = ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.isSelected();
		
		if(checkbox_ESI==true) {
			System.out.println("ESI Checkbox is selected");
		}
		else if(checkbox_ESI==false) {
			System.out.println("ESI Checkbox is Not selected");
			System.out.println("Selecting ESI Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_ESI_Checkbox));
			ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PF));
		ObjectsReporsitory.Wage_Deduction_ESI.click();
		ObjectsReporsitory.Wage_Deduction_ESI.clear();
		ObjectsReporsitory.Wage_Deduction_ESI.click();
		
		ObjectsReporsitory.Wage_Deduction_ESI.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the ESI Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in ESI Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length()+ " Length alphabets Value in ESI Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length()+ " Length alphabets Value in ESI Deduction value Field");
		}
	}

	@Then("^Verify user can be able to Validate if ESI Deduction with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_if_ESI_Deduction_with_Special_Charecters_input()
			throws Throwable {
		
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_ESI);
		actionsobj.perform();
		
		boolean checkbox_ESI = ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.isSelected();
		
		if(checkbox_ESI==true) {
			System.out.println("ESI Checkbox is selected");
		}
		else if(checkbox_ESI==false) {
			System.out.println("ESI Checkbox is Not selected");
			System.out.println("Selecting ESI Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_ESI_Checkbox));
			ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PF));
		ObjectsReporsitory.Wage_Deduction_ESI.click();
		ObjectsReporsitory.Wage_Deduction_ESI.clear();
		ObjectsReporsitory.Wage_Deduction_ESI.click();
		
		ObjectsReporsitory.Wage_Deduction_ESI.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the ESI Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in ESI Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length()+ " Length Special Charecters Value in ESI Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_ESI.getAttribute("value").length()+ " Length Special Charecters Value in ESI Deduction value Field");
		}
		
	}

	@Then("^Verify user can be able to Validate if Professional Tax Deduction with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_if_Professional_Tax_Deduction_with_max_numeric_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_PT);
		actionsobj.perform();
		
		boolean checkbox_PT = ObjectsReporsitory.Wage_Deductions_PT_Checkbox.isSelected();
		
		if(checkbox_PT==true) {
			System.out.println("PT Checkbox is selected");
		}
		else if(checkbox_PT==false) {
			System.out.println("PT Checkbox is Not selected");
			System.out.println("Selecting PT Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PT_Checkbox));
			ObjectsReporsitory.Wage_Deductions_PT_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PT));
		ObjectsReporsitory.Wage_Deduction_PT.click();
		ObjectsReporsitory.Wage_Deduction_PT.clear();
		ObjectsReporsitory.Wage_Deduction_PT.click();
		
		ObjectsReporsitory.Wage_Deduction_PT.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the PT Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any numeric Value in PT Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length()+ " Length numeric Value in PT Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length()+ " Length numeric Value in PT Deduction value Field");
		}
		
	}

	@Then("^Verify user can be able to Validate if Professional Tax Deduction with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_if_Professional_Tax_Deduction_with_alphabets_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_PT);
		actionsobj.perform();
		
		boolean checkbox_PT = ObjectsReporsitory.Wage_Deductions_PT_Checkbox.isSelected();
		
		if(checkbox_PT==true) {
			System.out.println("PT Checkbox is selected");
		}
		else if(checkbox_PT==false) {
			System.out.println("PT Checkbox is Not selected");
			System.out.println("Selecting PT Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PT_Checkbox));
			ObjectsReporsitory.Wage_Deductions_PT_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PT));
		ObjectsReporsitory.Wage_Deduction_PT.click();
		ObjectsReporsitory.Wage_Deduction_PT.clear();
		ObjectsReporsitory.Wage_Deduction_PT.click();
		
		ObjectsReporsitory.Wage_Deduction_PT.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the PT Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in PT Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length()+ " Length alphabets Value in PT Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length()+ " Length alphabets Value in PT Deduction value Field");
		}
		
	}

	@Then("^Verify user can be able to Validate if Professional Tax Deduction with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_if_Professional_Tax_Deduction_with_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_Deduction_PT);
		actionsobj.perform();
		
		boolean checkbox_PT = ObjectsReporsitory.Wage_Deductions_PT_Checkbox.isSelected();
		
		if(checkbox_PT==true) {
			System.out.println("PT Checkbox is selected");
		}
		else if(checkbox_PT==false) {
			System.out.println("PT Checkbox is Not selected");
			System.out.println("Selecting PT Checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PT_Checkbox));
			ObjectsReporsitory.Wage_Deductions_PT_Checkbox.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_PT));
		ObjectsReporsitory.Wage_Deduction_PT.click();
		ObjectsReporsitory.Wage_Deduction_PT.clear();
		ObjectsReporsitory.Wage_Deduction_PT.click();
		
		ObjectsReporsitory.Wage_Deduction_PT.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the PT Deduction value Field Value : "+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in PT Deduction value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length()+ " Length Special Charecters Value in PT Deduction value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_PT.getAttribute("value").length()+ " Length Special Charecters Value in PT Deduction value Field");
		}
	}

	@Then("^Verify user can be able to Validate other recoveries with max numeric input$")
	public static void Verify_user_can_be_able_to_Validate_other_recoveries_with_max_numeric_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_otherrecoveries);
		actionsobj.perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherrecoveries));
		ObjectsReporsitory.Wage_otherrecoveries.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value));
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.click();
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.clear();
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.click();
		
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the other recoveries value Field Value : "+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in other recoveries value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length()+ " Length Numeric Value in other recoveries value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length()+ " Length Numeric Value in other recoveries value Field");
		}
		
		Actions actionsesc = new Actions(DriverFactory.driver);
		actionsesc.sendKeys(Keys.ESCAPE);
		actionsesc.perform();
		
	}

	@Then("^Verify user can be able to Validate other recoveries with alphabets input$")
	public static void Verify_user_can_be_able_to_Validate_other_recoveries_with_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_otherrecoveries);
		actionsobj.perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherrecoveries));
		ObjectsReporsitory.Wage_otherrecoveries.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value));
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.click();
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.clear();
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.click();
		
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the other recoveries value Field Value : "+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in other recoveries value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length()+ " Length alphabets Value in other recoveries value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length()+ " Length alphabets Value in other recoveries value Field");
		}
		
		Actions actionsesc = new Actions(DriverFactory.driver);
		actionsesc.sendKeys(Keys.ESCAPE);
		actionsesc.perform();
	}

	@Then("^Verify user can be able to Validate other recoveries with Special Charecters input$")
	public static void Verify_user_can_be_able_to_Validate_other_recoveries_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Wage_otherrecoveries);
		actionsobj.perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherrecoveries));
		ObjectsReporsitory.Wage_otherrecoveries.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value));
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.click();
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.clear();
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.click();
		
		ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the other recoveries value Field Value : "+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length());
		if (ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in other recoveries value Field");
		} 
		else if (ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length()+ " Length Special Charecters Value in other recoveries value Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getAttribute("value").length()+ " Length Special Charecters Value in other recoveries value Field");
		}
		
		Actions actionsesc = new Actions(DriverFactory.driver);
		actionsesc.sendKeys(Keys.ESCAPE);
		actionsesc.perform();
	}

}
