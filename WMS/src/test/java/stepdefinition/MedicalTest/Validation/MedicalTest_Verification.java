package stepdefinition.MedicalTest.Validation;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class MedicalTest_Verification {

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
	public static int MedicalTest_Card_Count;
	public static int MedicalTest_Count;
	public static int Paramedics_Card_Count;
	public static int Paramedics_Count;
	public static float Percentage;
	public static String Paramedics_Value;
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

// Page Factory
	public MedicalTest_Verification() {
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

	@Then("^Verify User can be able to Validate Skin Temp field with no input$")
	public static void Verify_User_can_be_able_to_Validate_Skin_Temp_field_with_no_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_Skin_Temperature);
		actionsobj.perform();

		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		ObjectsReporsitory.MedicalTest_updateskintemp.clear();
		ObjectsReporsitory.MedicalTest_updateskintemp.click();

		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.MedicalTest_Submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_Submit));
		ObjectsReporsitory.MedicalTest_Submit.click();
		Verification_Popup_MedicalTest.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate BP field with no input$")
	public static void Verify_User_can_be_able_to_Validate_BP_field_with_no_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_Skin_Temperature);
		actionsobj.perform();

		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		ObjectsReporsitory.MedicalTest_updateskintemp.clear();
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		int min_skintemp = 96;
		int max_skintemp = 102;
		Random rand2 = new Random();
		Random_skintemp = rand2.nextInt(max_skintemp - min_skintemp) + min_skintemp;
		ObjectsReporsitory.MedicalTest_updateskintemp.sendKeys(Random_skintemp + "°F");
		System.out.println("Updated Skin Temp :" + Random_skintemp);

		ObjectsReporsitory.MedicalTest_updateBP.click();
		ObjectsReporsitory.MedicalTest_updateBP.clear();

		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.MedicalTest_Submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_Submit));
		ObjectsReporsitory.MedicalTest_Submit.click();
		Verification_Popup_MedicalTest.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Medical Officer Name field with no input$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Officer_Name_field_with_no_input() throws Throwable {

		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateBP);
		actionsobj.perform();

		ObjectsReporsitory.MedicalTest_updateBP.click();
		ObjectsReporsitory.MedicalTest_updateBP.clear();
		ObjectsReporsitory.MedicalTest_updateBP.click();
		int min_BP = 60;
		int max_BP = 120;
		Random rand3 = new Random();
		Random_BP = rand3.nextInt(max_BP - min_BP) + min_BP;
		ObjectsReporsitory.MedicalTest_updateBP.sendKeys(Random_BP + "mmHg");
		System.out.println("Updated BP :" + Random_BP);

		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.clear();

		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.MedicalTest_Submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_Submit));
		ObjectsReporsitory.MedicalTest_Submit.click();

		Verification_Popup_MedicalTest.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Medical Registration Number field with no input$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Registration_Number_field_with_no_input()
			throws Throwable {

		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.clear();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		Thread.sleep(3000);
		ObjectsReporsitory.MedicalTest_MedicalofficerName.sendKeys("MedicalOfficer" + RandomString.make(10));
		Thread.sleep(3000);

		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.clear();
		Thread.sleep(3000);

		Actions actionssave = new Actions(DriverFactory.driver);
		actionssave.moveToElement(ObjectsReporsitory.MedicalTest_Submit);
		actionssave.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_Submit));
		ObjectsReporsitory.MedicalTest_Submit.click();

		Verification_Popup_MedicalTest.Validation_popup_handle();

	}

	@Then("^Verify User can be able to Validate Skin Temp field with Numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Skin_Temp_field_with_Numeric_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateskintemp);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		ObjectsReporsitory.MedicalTest_updateskintemp.clear();
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		
		ObjectsReporsitory.MedicalTest_updateskintemp.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the SkinTemp Field Value : "+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in SkinTemp Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length()+ " Length Numeric Value in SkinTemp Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length()+ " Length Numeric Value in SkinTemp Field");
		}
	}

	@Then("^Verify User can be able to Validate Skin Temp field with alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Skin_Temp_field_with_alphabets_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateskintemp);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		ObjectsReporsitory.MedicalTest_updateskintemp.clear();
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		
		ObjectsReporsitory.MedicalTest_updateskintemp.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the SkinTemp Field Value : "+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in SkinTemp Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length()+ " Length alphabets Value in SkinTemp Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length()+ " Length alphabets Value in SkinTemp Field");
		}
	}

	@Then("^Verify User can be able to Validate Skin Temp field with Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Skin_Temp_field_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateskintemp);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		ObjectsReporsitory.MedicalTest_updateskintemp.clear();
		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		
		ObjectsReporsitory.MedicalTest_updateskintemp.sendKeys(ConfigFileReader.getVerification_Special_Char_Max());
		Thread.sleep(2000);
		System.out.println("Length of the SkinTemp Field Value : "+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in SkinTemp Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length()+ " Length Special Charecters Value in SkinTemp Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_updateskintemp.getAttribute("value").length()+ " Length Special Charecters Value in SkinTemp Field");
		}
	}

	@Then("^Verify User can be able to Validate BP field with Numeric input$")
	public static void Verify_User_can_be_able_to_Validate_BP_field_with_Numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateBP);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_updateBP.click();
		ObjectsReporsitory.MedicalTest_updateBP.clear();
		ObjectsReporsitory.MedicalTest_updateBP.click();
		
		ObjectsReporsitory.MedicalTest_updateBP.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the BP Field Value : "+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in BP Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length()+ " Length Numeric Value in BP Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length()+ " Length Numeric Value in BP Field");
		}
	}

	@Then("^Verify User can be able to Validate BP field with alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_BP_field_with_alphabets_input() throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateBP);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_updateBP.click();
		ObjectsReporsitory.MedicalTest_updateBP.clear();
		ObjectsReporsitory.MedicalTest_updateBP.click();
		
		ObjectsReporsitory.MedicalTest_updateBP.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the BP Field Value : "+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in BP Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length()+ " Length alphabets Value in BP Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length()+ " Length alphabets Value in BP Field");
		}
	}

	@Then("^Verify User can be able to Validate BP field with Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_BP_field_with_Special_Charecters_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_updateBP);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_updateBP.click();
		ObjectsReporsitory.MedicalTest_updateBP.clear();
		ObjectsReporsitory.MedicalTest_updateBP.click();
		
		ObjectsReporsitory.MedicalTest_updateBP.sendKeys(ConfigFileReader.getVerification_Special_Char_Max());
		Thread.sleep(2000);
		System.out.println("Length of the BP Field Value : "+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in BP Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length()+ " Length Special Charecters Value in BP Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_updateBP.getAttribute("value").length()+ " Length Special Charecters Value in BP Field");
		}
	}

	@Then("^Verify User can be able to Validate Medical Officer field with Numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Officer_field_with_Numeric_input() throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_MedicalofficerName);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.clear();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		
		ObjectsReporsitory.MedicalTest_MedicalofficerName.sendKeys(ConfigFileReader.getEducation_Verification_Max_Numeric());
		Thread.sleep(2000);
		System.out.println("Length of the MedicalofficerName Field Value : "+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in MedicalofficerName Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length()+ " Length Numeric Value in MedicalofficerName Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length()+ " Length Numeric Value in MedicalofficerName Field");
		}
	}

	@Then("^Verify User can be able to Validate Medical Officer field with alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Officer_field_with_alphabets_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_MedicalofficerName);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.clear();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		
		ObjectsReporsitory.MedicalTest_MedicalofficerName.sendKeys(ConfigFileReader.getEducation_Verification_Max_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the MedicalofficerName Field Value : "+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in MedicalofficerName Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length()+ " Length alphabets Value in MedicalofficerName Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length()+ " Length alphabets Value in MedicalofficerName Field");
		}
	}

	@Then("^Verify User can be able to Validate Medical Officer field with Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Medical_Officer_field_with_Special_Charecters_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_MedicalofficerName);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.clear();
		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		
		ObjectsReporsitory.MedicalTest_MedicalofficerName.sendKeys(ConfigFileReader.getVerification_Special_Char_Max());
		Thread.sleep(2000);
		System.out.println("Length of the MedicalofficerName Field Value : "+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in MedicalofficerName Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length()+ " Length Special Charecters Value in MedicalofficerName Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_MedicalofficerName.getAttribute("value").length()+ " Length Special Charecters Value in MedicalofficerName Field");
		}
	}

	@Then("^Verify User can be able to Validate Registration Number field with Numeric input$")
	public static void Verify_User_can_be_able_to_Validate_Registration_Number_field_with_Numeric_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_RegistrationNumber);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.clear();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		
		ObjectsReporsitory.MedicalTest_RegistrationNumber.sendKeys(ConfigFileReader.getVerification_Numeric_Max());
		Thread.sleep(2000);
		System.out.println("Length of the Registration Number Field Value : "+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Numeric Value in Registration Number Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length()+ " Length Numeric Value in Registration Number Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length()+ " Length Numeric Value in Registration Number Field");
		}

	}

	@Then("^Verify User can be able to Validate Registration Number field with alphabets input$")
	public static void Verify_User_can_be_able_to_Validate_Registration_Number_field_with_alphabets_input()
			throws Throwable {
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_RegistrationNumber);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.clear();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		
		ObjectsReporsitory.MedicalTest_RegistrationNumber.sendKeys(ConfigFileReader.getVerification_Numeric_alphabets());
		Thread.sleep(2000);
		System.out.println("Length of the Registration Number Field Value : "+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any alphabets Value in Registration Number Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length()+ " Length alphabets Value in Registration Number Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length()+ " Length alphabets Value in Registration Number Field");
		}
	}

	@Then("^Verify User can be able to Validate Registration Number field with Special Charecters input$")
	public static void Verify_User_can_be_able_to_Validate_Registration_Number_field_with_Special_Charecters_input()
			throws Throwable {
		
		Actions actionsobj = new Actions(DriverFactory.driver);
		actionsobj.moveToElement(ObjectsReporsitory.MedicalTest_RegistrationNumber);
		actionsobj.perform();
		
		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.clear();
		ObjectsReporsitory.MedicalTest_RegistrationNumber.click();
		
		ObjectsReporsitory.MedicalTest_RegistrationNumber.sendKeys(ConfigFileReader.getVerification_Special_Char_Max());
		Thread.sleep(2000);
		System.out.println("Length of the Registration Number Field Value : "+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length());
		if (ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length() == 0) {
			System.out.println("Error : Application Not allowing to Enter Any Special Charecters Value in Registration Number Field");
		} 
		else if (ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length() >10) {
			System.out.println("Error : User Can be able to Enter more then 10"+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length()+ " Length Special Charecters Value in Registration Number Field");
		}
		else {
			System.out.println("User Can be able to Enter "+ ObjectsReporsitory.MedicalTest_RegistrationNumber.getAttribute("value").length()+ " Length Special Charecters Value in Registration Number Field");
		}
	}

}
