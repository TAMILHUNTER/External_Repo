package stepdefinition.EHS.Validation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.MedicalTest.Validation.Verification_Popup_MedicalTest;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class EHS_Validation {

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
	public static int EHS_Count;
	public static int EHS_Card_Count;
	public static int EHS_SelectedProfileforTraining;
	public static int EHS_Selected_Workmen_Count;

// Page Factory
	public EHS_Validation() {
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
	
	@Then("^Verify user can be able to Validate if no training selected$")
	public static void Verify_user_can_be_able_to_Validate_if_no_training_selected() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_Submit_taining));
		ObjectsReporsitory.EHS_Submit_taining.click();
		Verification_Popup_MedicalTest.Validation_popup_handle();
		
	}

}
