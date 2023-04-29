package stepdefinition.Paramedics.Validation;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
public class Paramedics_Validation {

	public static int Skill_Analyisis_Count;
	public static int Skill_Card_Count;
	public static String Skill_Analyisis_Value;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static int Paramedics_Card_Count;
	public static int Paramedics_Count;
	public static float Percentage;
	public static String Paramedics_Value;
	public static int Random_skintemp;
	public static int Random_diabetics;
	public static int Random_spo2;
	public static int Random_systolic;
	public static int Random_diastolic;
	public static int Random_Height;
	public static int Random_Weight;
	public static int Random_heartrate;

// Page Factory
	public Paramedics_Validation() {
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

	@Then("^Verify User can be able to Validate Medical Exam Date field with no input$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Exam_Date_field_with_no_input() throws Throwable {
		
		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.Paramedics_submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Paramedics_submit));
		ObjectsReporsitory.Paramedics_submit.click();
		Verification_Popup_Paramedics.Validation_popup_handle();
		
		
	}

	@Then("^Verify User can be able to Validate Medical Exam Date field with Past Date$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Exam_Date_field_with_Past_Date() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));
		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(4000);
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_Past);
		actionsobj.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_Past));
		Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_Past.click();
		System.out.println("Medical Exam date selected 5 Days before from Today's date");
		
		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.Paramedics_submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Paramedics_submit));
		ObjectsReporsitory.Paramedics_submit.click();
		Verification_Popup_Paramedics.Validation_popup_handle();
		
	}

	@Then("^Verify User can be able to Validate Medical Exam Date field with Current date$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Exam_Date_field_with_Current_date()
			throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));
		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(4000);
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_today);
		actionsobj.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_today));
		Skill_Analysis_Objects.Skill_Analysis_Select_RetestDate_today.click();
		System.out.println("Medical Exam date selected as Today's date");
		
		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.Paramedics_submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Paramedics_submit));
		ObjectsReporsitory.Paramedics_submit.click();
		Verification_Popup_Paramedics.Validation_popup_handle();
	}

	@Then("^Verify User can be able to Validate SkinTemp field With no input$")
	public static void Verify_User_can_be_able_to_Validate_SkinTemp_field_With_no_input() throws Throwable {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender));
		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(4000);
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(Skill_Analysis_Objects.Paramedics_MedicalTestDate);
		actionsobj.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_MedicalTestDate));
		Skill_Analysis_Objects.Paramedics_MedicalTestDate.click();
		System.out.println("Medical Exam date selected as 15 date after from Today's Date");
		
		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.Paramedics_submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Paramedics_submit));
		ObjectsReporsitory.Paramedics_submit.click();
		Verification_Popup_Paramedics.Validation_popup_handle();
		
	}

	@Then("^Verify User can be able to Validate SPO2 With field no input$")
	public static void Verify_User_can_be_able_to_Validate_SPO2_With_field_no_input() throws Throwable {
	}

	@Then("^Verify User can be able to Validate Diastolic field With no input$")
	public static void Verify_User_can_be_able_to_Validate_Diastolic_field_With_no_input() throws Throwable {
	}

	@Then("^Verify User can be able to Validate Weight field With no input$")
	public static void Verify_User_can_be_able_to_Validate_Weight_field_With_no_input() throws Throwable {
	}

	@Then("^Verify User can be able to Validate Identification Mark1 field With no input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark1_field_With_no_input() throws Throwable {
	}

	@Then("^Verify User can be able to Validate SkinTemp field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_SkinTemp_field_With_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_SkinTemp);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_SkinTemp.click();
		ObjectsReporsitory.Paramedics_SkinTemp.clear();
		ObjectsReporsitory.Paramedics_SkinTemp.click();
		
		ObjectsReporsitory.Paramedics_SkinTemp.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the SkinTemp Field Value : "+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in SkinTemp Field");
		} 
		else if (ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length()+ " Length Numeric Value in SkinTemp Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length()+ " Length Numeric Value in SkinTemp Field");
		}
		
	}

	@Then("^Verify User can be able to Validate SkinTemp field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_SkinTemp_field_With_alphabets_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_SkinTemp);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_SkinTemp.click();
		ObjectsReporsitory.Paramedics_SkinTemp.clear();
		ObjectsReporsitory.Paramedics_SkinTemp.click();
		
		ObjectsReporsitory.Paramedics_SkinTemp.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the SkinTemp Field Value : "+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in SkinTemp Field");
		} 
		else if (ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length()+ " Length alphabets Value in SkinTemp Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length()+ " Length alphabets Value in SkinTemp Field");
		}
	}

	@Then("^Verify User can be able to Validate SkinTemp field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_SkinTemp_field_With_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_SkinTemp);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_SkinTemp.click();
		ObjectsReporsitory.Paramedics_SkinTemp.clear();
		ObjectsReporsitory.Paramedics_SkinTemp.click();
		
		ObjectsReporsitory.Paramedics_SkinTemp.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the SkinTemp Field Value : "+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in SkinTemp Field");
		} 
		else if (ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length()+ " Length Special Charecters Value in SkinTemp Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_SkinTemp.getAttribute("value").length()+ " Length Special Charecters Value in SkinTemp Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Diabetics field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Diabetics_field_With_max_numeric_input() throws Throwable {
		
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Diabetics);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Diabetics.click();
		ObjectsReporsitory.Paramedics_Diabetics.clear();
		ObjectsReporsitory.Paramedics_Diabetics.click();
		
		ObjectsReporsitory.Paramedics_Diabetics.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Diabetics Field Value : "+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Diabetics Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length()+ " Length Numeric Value in Diabetics Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length()+ " Length Numeric Value in Diabetics Field");
		}
		
		
	}

	@Then("^Verify User can be able to Validate Diabetics field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Diabetics_field_With_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Diabetics);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Diabetics.click();
		ObjectsReporsitory.Paramedics_Diabetics.clear();
		ObjectsReporsitory.Paramedics_Diabetics.click();
		
		ObjectsReporsitory.Paramedics_Diabetics.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Diabetics Field Value : "+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Diabetics Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length()+ " Length alphabets Value in Diabetics Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length()+ " Length alphabets Value in Diabetics Field");
		}
	}

	@Then("^Verify User can be able to Validate Diabetics field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Diabetics_field_With_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Diabetics);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Diabetics.click();
		ObjectsReporsitory.Paramedics_Diabetics.clear();
		ObjectsReporsitory.Paramedics_Diabetics.click();
		
		ObjectsReporsitory.Paramedics_Diabetics.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Diabetics Field Value : "+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Diabetics Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length()+ " Length Special Charecters Value in Diabetics Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Diabetics.getAttribute("value").length()+ " Length Special Charecters Value in Diabetics Field");
		}
	}

	@Then("^Verify User can be able to Validate SPO2 With field with max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_SPO2_With_field_with_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_SPO2);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_SPO2.click();
		ObjectsReporsitory.Paramedics_SPO2.clear();
		ObjectsReporsitory.Paramedics_SPO2.click();
		
		ObjectsReporsitory.Paramedics_SPO2.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the SPO2 Field Value : "+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in SPO2 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length()+ " Length Numeric Value in SPO2 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length()+ " Length Numeric Value in SPO2 Field");
		}
		
	}

	@Then("^Verify User can be able to Validate SPO2 With field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_SPO2_With_field_With_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_SPO2);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_SPO2.click();
		ObjectsReporsitory.Paramedics_SPO2.clear();
		ObjectsReporsitory.Paramedics_SPO2.click();
		
		ObjectsReporsitory.Paramedics_SPO2.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the SPO2 Field Value : "+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in SPO2 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length()+ " Length alphabets Value in SPO2 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length()+ " Length alphabets Value in SPO2 Field");
		}
		
	}

	@Then("^Verify User can be able to Validate SPO2 With field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_SPO2_With_field_With_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_SPO2);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_SPO2.click();
		ObjectsReporsitory.Paramedics_SPO2.clear();
		ObjectsReporsitory.Paramedics_SPO2.click();
		
		ObjectsReporsitory.Paramedics_SPO2.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the SPO2 Field Value : "+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in SPO2 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length()+ " Length Special Charecters Value in SPO2 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_SPO2.getAttribute("value").length()+ " Length Special Charecters Value in SPO2 Field");
		}
	}

	@Then("^Verify User can be able to Validate Systolic field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Systolic_field_With_max_numeric_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Systolic);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Systolic.click();
		ObjectsReporsitory.Paramedics_Systolic.clear();
		ObjectsReporsitory.Paramedics_Systolic.click();
		
		ObjectsReporsitory.Paramedics_Systolic.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Systolic Field Value : "+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any numeric Value in Systolic Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length()+ " Length numeric Value in Systolic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length()+ " Length numeric Value in Systolic Field");
		}
	}

	@Then("^Verify User can be able to Validate Systolic field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Systolic_field_With_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Systolic);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Systolic.click();
		ObjectsReporsitory.Paramedics_Systolic.clear();
		ObjectsReporsitory.Paramedics_Systolic.click();
		
		ObjectsReporsitory.Paramedics_Systolic.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Systolic Field Value : "+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Systolic Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length()+ " Length alphabets Value in Systolic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length()+ " Length alphabets Value in Systolic Field");
		}
	}

	@Then("^Verify User can be able to Validate Systolic field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Systolic_field_With_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Systolic);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Systolic.click();
		ObjectsReporsitory.Paramedics_Systolic.clear();
		ObjectsReporsitory.Paramedics_Systolic.click();
		
		ObjectsReporsitory.Paramedics_Systolic.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Systolic Field Value : "+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Systolic Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length()+ " Length Special Charecters Value in Systolic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Systolic.getAttribute("value").length()+ " Length Special Charecters Value in Systolic Field");
		}
	}

	@Then("^Verify User can be able to Validate Diastolic field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Diastolic_field_With_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Diastolic);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Diastolic.click();
		ObjectsReporsitory.Paramedics_Diastolic.clear();
		ObjectsReporsitory.Paramedics_Diastolic.click();
		
		ObjectsReporsitory.Paramedics_Diastolic.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Diastolic Field Value : "+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any numeric Value in Diastolic Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length()+ " Length numeric Value in Diastolic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length()+ " Length numeric Value in Diastolic Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Diastolic field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Diastolic_field_With_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Diastolic);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Diastolic.click();
		ObjectsReporsitory.Paramedics_Diastolic.clear();
		ObjectsReporsitory.Paramedics_Diastolic.click();
		
		ObjectsReporsitory.Paramedics_Diastolic.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Diastolic Field Value : "+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Diastolic Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length()+ " Length alphabets Value in Diastolic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length()+ " Length alphabets Value in Diastolic Field");
		}
	}

	@Then("^Verify User can be able to Validate Diastolic field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Diastolic_field_With_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Diastolic);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Diastolic.click();
		ObjectsReporsitory.Paramedics_Diastolic.clear();
		ObjectsReporsitory.Paramedics_Diastolic.click();
		
		ObjectsReporsitory.Paramedics_Diastolic.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Diastolic Field Value : "+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Diastolic Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length()+ " Length Special Charecters Value in Diastolic Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Diastolic.getAttribute("value").length()+ " Length Special Charecters Value in Diastolic Field");
		}
	}

	@Then("^Verify User can be able to Validate Height field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Height_field_With_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Height);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Height.click();
		ObjectsReporsitory.Paramedics_Height.clear();
		ObjectsReporsitory.Paramedics_Height.click();
		
		ObjectsReporsitory.Paramedics_Height.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Height Field Value : "+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Height.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Height Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Height.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length()+ " Length Numeric Value in Height Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length()+ " Length Numeric Value in Height Field");
		}
	}

	@Then("^Verify User can be able to Validate Height field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Height_field_With_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Height);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Height.click();
		ObjectsReporsitory.Paramedics_Height.clear();
		ObjectsReporsitory.Paramedics_Height.click();
		
		ObjectsReporsitory.Paramedics_Height.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Height Field Value : "+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Height.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Height Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Height.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length()+ " Length alphabets Value in Height Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length()+ " Length alphabets Value in Height Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Height field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Height_field_With_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_Height);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_Height.click();
		ObjectsReporsitory.Paramedics_Height.clear();
		ObjectsReporsitory.Paramedics_Height.click();
		
		ObjectsReporsitory.Paramedics_Height.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Height Field Value : "+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_Height.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Height Field");
		} 
		else if (ObjectsReporsitory.Paramedics_Height.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length()+ " Length Special Charecters Value in Height Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_Height.getAttribute("value").length()+ " Length Special Charecters Value in Height Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Weight field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Weight_field_With_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_weight);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_weight.click();
		ObjectsReporsitory.Paramedics_weight.clear();
		ObjectsReporsitory.Paramedics_weight.click();
		
		ObjectsReporsitory.Paramedics_weight.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Weight Field Value : "+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_weight.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Weight Field");
		} 
		else if (ObjectsReporsitory.Paramedics_weight.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length()+ " Length Numeric Value in Weight Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length()+ " Length Numeric Value in Weight Field");
		}
		
	}

	@Then("^Verify User can be able to Validate Weight field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Weight_field_With_alphabets_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_weight);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_weight.click();
		ObjectsReporsitory.Paramedics_weight.clear();
		ObjectsReporsitory.Paramedics_weight.click();
		
		ObjectsReporsitory.Paramedics_weight.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Weight Field Value : "+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_weight.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Weight Field");
		} 
		else if (ObjectsReporsitory.Paramedics_weight.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length()+ " Length alphabets Value in Weight Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length()+ " Length alphabets Value in Weight Field");
		}
	}

	@Then("^Verify User can be able to Validate Weight field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Weight_field_With_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_weight);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_weight.click();
		ObjectsReporsitory.Paramedics_weight.clear();
		ObjectsReporsitory.Paramedics_weight.click();
		
		ObjectsReporsitory.Paramedics_weight.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Weight Field Value : "+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_weight.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Weight Field");
		} 
		else if (ObjectsReporsitory.Paramedics_weight.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length()+ " Length Special Charecters Value in Weight Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_weight.getAttribute("value").length()+ " Length Special Charecters Value in Weight Field");
		}
		
	}

	@Then("^Verify User can be able to Validate BMI field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_BMI_field_With_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_BMI);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_BMI.click();
		ObjectsReporsitory.Paramedics_BMI.clear();
		ObjectsReporsitory.Paramedics_BMI.click();
		
		ObjectsReporsitory.Paramedics_BMI.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the BMI Field Value : "+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in BMI Field");
		} 
		else if (ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length()+ " Length Numeric Value in BMI Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length()+ " Length Numeric Value in BMI Field");
		}
	}

	@Then("^Verify User can be able to Validate BMI field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_BMI_field_With_alphabets_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_BMI);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_BMI.click();
		ObjectsReporsitory.Paramedics_BMI.clear();
		ObjectsReporsitory.Paramedics_BMI.click();
		
		ObjectsReporsitory.Paramedics_BMI.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the BMI Field Value : "+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in BMI Field");
		} 
		else if (ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length()+ " Length alphabets Value in BMI Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length()+ " Length alphabets Value in BMI Field");
		}
		
	}

	@Then("^Verify User can be able to Validate BMI field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_BMI_field_With_Special_Charecters_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_BMI);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_BMI.click();
		ObjectsReporsitory.Paramedics_BMI.clear();
		ObjectsReporsitory.Paramedics_BMI.click();
		
		ObjectsReporsitory.Paramedics_BMI.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the BMI Field Value : "+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in BMI Field");
		} 
		else if (ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length()+ " Length Special Charecters Value in BMI Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_BMI.getAttribute("value").length()+ " Length Special Charecters Value in BMI Field");
		}
	}

	@Then("^Verify User can be able to Validate Identification Mark1 field With max alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark1_field_With_max_alphabets_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_IDMark1);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_IDMark1.click();
		ObjectsReporsitory.Paramedics_IDMark1.clear();
		ObjectsReporsitory.Paramedics_IDMark1.click();
		
		ObjectsReporsitory.Paramedics_IDMark1.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the ID Mark 1 Field Value : "+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in ID Mark 1 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length()+ " Length alphabets Value in ID Mark 1 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length()+ " Length alphabets Value in ID Mark 1 Field");
		}

	}

	@Then("^Verify User can be able to Validate Identification Mark1 field With numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark1_field_With_numeric_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_IDMark1);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_IDMark1.click();
		ObjectsReporsitory.Paramedics_IDMark1.clear();
		ObjectsReporsitory.Paramedics_IDMark1.click();
		
		ObjectsReporsitory.Paramedics_IDMark1.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the ID Mark 1 Field Value : "+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in ID Mark 1 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length()+ " Length Numeric Value in ID Mark 1 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length()+ " Length Numeric Value in ID Mark 1 Field");
		}
			
	}

	@Then("^Verify User can be able to Validate Identification Mark1 field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark1_field_With_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_IDMark1);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_IDMark1.click();
		ObjectsReporsitory.Paramedics_IDMark1.clear();
		ObjectsReporsitory.Paramedics_IDMark1.click();
		
		ObjectsReporsitory.Paramedics_IDMark1.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the ID Mark 1 Field Value : "+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in ID Mark 1 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length()+ " Length Special Charecters Value in ID Mark 1 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value").length()+ " Length Special Charecters Value in ID Mark 1 Field");
		}
	}

	@Then("^Verify User can be able to Validate Identification Mark2 field With max alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark2_field_With_max_alphabets_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_IDMark2);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_IDMark2.click();
		ObjectsReporsitory.Paramedics_IDMark2.clear();
		ObjectsReporsitory.Paramedics_IDMark2.click();
		
		ObjectsReporsitory.Paramedics_IDMark2.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the ID Mark 2 Field Value : "+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in ID Mark 2 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length()+ " Length alphabets Value in ID Mark 2 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length()+ " Length alphabets Value in ID Mark 2 Field");
		}

	}

	@Then("^Verify User can be able to Validate Identification Mark2 field With numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark2_field_With_numeric_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_IDMark2);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_IDMark2.click();
		ObjectsReporsitory.Paramedics_IDMark2.clear();
		ObjectsReporsitory.Paramedics_IDMark2.click();
		
		ObjectsReporsitory.Paramedics_IDMark2.sendKeys(ConfigFileReader.getEducation_Verification_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the ID Mark 2 Field Value : "+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any numeric Value in ID Mark 2 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length()+ " Length numeric Value in ID Mark 2 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length()+ " Length numeric Value in ID Mark 2 Field");
		}
	}

	@Then("^Verify User can be able to Validate Identification Mark2 field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Identification_Mark2_field_With_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_IDMark2);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_IDMark2.click();
		ObjectsReporsitory.Paramedics_IDMark2.clear();
		ObjectsReporsitory.Paramedics_IDMark2.click();
		
		ObjectsReporsitory.Paramedics_IDMark2.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the ID Mark 2 Field Value : "+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in ID Mark 2 Field");
		} 
		else if (ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length()+ " Length Special Charecters Value in ID Mark 2 Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value").length()+ " Length Special Charecters Value in ID Mark 2 Field");
		}
	}

	@Then("^Verify User can be able to Validate Heartrate field With max numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Heartrate_field_With_max_numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_HeartRate);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_HeartRate.click();
		ObjectsReporsitory.Paramedics_HeartRate.clear();
		ObjectsReporsitory.Paramedics_HeartRate.click();
		
		ObjectsReporsitory.Paramedics_HeartRate.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the Heart Rate Field Value : "+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Heart Rate Field");
		} 
		else if (ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length()+ " Length Numeric Value in Heart Rate Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length()+ " Length Numeric Value in Heart Rate Field");
		}
	}

	@Then("^Verify User can be able to Validate Heartrate field With alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Heartrate_field_With_alphabets_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_HeartRate);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_HeartRate.click();
		ObjectsReporsitory.Paramedics_HeartRate.clear();
		ObjectsReporsitory.Paramedics_HeartRate.click();
		
		ObjectsReporsitory.Paramedics_HeartRate.sendKeys(ConfigFileReader.getEducation_Verification_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Heart Rate Field Value : "+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Heart Rate Field");
		} 
		else if (ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length()+ " Length alphabets Value in Heart Rate Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length()+ " Length alphabets Value in Heart Rate Field");
		}
	}

	@Then("^Verify User can be able to Validate Heartrate field With Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Heartrate_field_With_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.Paramedics_HeartRate);
		actionsobj.perform();
		
		ObjectsReporsitory.Paramedics_HeartRate.click();
		ObjectsReporsitory.Paramedics_HeartRate.clear();
		ObjectsReporsitory.Paramedics_HeartRate.click();
		
		ObjectsReporsitory.Paramedics_HeartRate.sendKeys(ConfigFileReader.getEducation_Verification_Special_Char());
		Thread.sleep(2000);
		System.out.println("Length of the Heart Rate Field Value : "+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length());
		if (ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Heart Rate Field");
		} 
		else if (ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length() >3) {
			System.out.println("Error : User Can be able to Enter mor then 3"+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length()+ " Length Special Charecters Value in Heart Rate Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.Paramedics_HeartRate.getAttribute("value").length()+ " Length Special Charecters Value in Heart Rate Field");
		}
	}

}
