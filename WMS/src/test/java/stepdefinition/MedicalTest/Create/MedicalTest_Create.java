package stepdefinition.MedicalTest.Create;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic_Details.Create.Submit_Workman_Details;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import stepdefinition.Paramedics.Create.Paramedics_Create;
import stepdefinition.SkillAnalysis.Create.Skill_Analysis_Create;
import stepdefinition.Workmen_Search.Workman_Search;
import test.DataBaseConnection;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class MedicalTest_Create {

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
	public MedicalTest_Create() {
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

	@Given("^Login and Navigate to MedicalTest$")
	public static void Login_and_Navigate_to_Paramedics() throws Throwable {

		Login.Use_Login_Induction_Medical_Test();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		ObjectsReporsitory.WMS_induction.click();
		Thread.sleep(5000);
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
		Thread.sleep(5000);
		MedicalTest_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
		ObjectsReporsitory.Induction_medicalTest.click();
		MedicalTest_Card_Count = Skill_Analysis_Objects.MedicalTest_Card_Count.size();
		System.out.println("Workmen Count in Medical Test : " + MedicalTest_Card_Count);
		if (MedicalTest_Count == MedicalTest_Card_Count) {
			System.out.println("MedicalTest Count & Workman Cards Count Matched");
		} else {
			System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
		}
		if (MedicalTest_Card_Count > 0) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
			System.out.println("Navigated to MedicalTest");
		} else {
			System.out.println("No Workmen Found in MedicalTest");
			System.out.println("Enrolling Workmen for MedicalTest from Paramedics");
			ObjectsReporsitory.WMS_induction.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
			Thread.sleep(5000);
			Paramedics_Count = Integer.parseInt(Skill_Analysis_Objects.Dashboard_Paramedics_Count.getText());
			ObjectsReporsitory.Induction_paramedics.click();
			Paramedics_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
			System.out.println("Workmen Count in Paramedics : " + Paramedics_Card_Count);
			if (Paramedics_Count == Paramedics_Card_Count) {
				System.out.println("Paramedics Count & Workman Cards Count Matched");
			} else {
				System.out.println("Paramedics Count & Workman Cards Count Not - Matched");
			}
			if (Paramedics_Card_Count > 0) {
				wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
				System.out.println("Navigated to Pramedics");
				Paramedics_Create.Verify_User_can_be_able_to_View_Workmen_profile_Paramedics();
				Paramedics_Create.Verify_User_can_be_able_to_Enter_Medical_Examination_Date();
				Paramedics_Create.Verify_User_can_be_able_to_add_Paramedics_details();
				Paramedics_Create.Verify_User_can_be_able_to_save_Paramedics_details();
				System.out.println("Workmen Paramedics Details are saved");
				System.out.println("Navigating to Medical Test");
				ObjectsReporsitory.WMS_induction.click();
				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
				Thread.sleep(5000);
				MedicalTest_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
				ObjectsReporsitory.Induction_medicalTest.click();
				MedicalTest_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
				System.out.println("Workmen Count in Paramedics : " + MedicalTest_Card_Count);
				if (MedicalTest_Count == MedicalTest_Card_Count) {
					System.out.println("MedicalTest Count & Workman Cards Count Matched");
				} else {
					System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
				}
				if (MedicalTest_Card_Count > 0) {
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
					System.out.println("Navigated to MedicalTest");
				} else {
					System.out.println("Navigated to MedicalTest");
					System.out.println("Error : completed Paramedics Records is not displayed in MedicalTest");
				}
			} else {
				System.out.println("No Workmen Found in Paramedics");
				System.out.println("Enrolling Workmen for Paramedics from Skill Analysis");
				ObjectsReporsitory.WMS_induction.click();
				wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Dashboard_Skill_Analysis));
				Skill_Analyisis_Count = Integer
						.parseInt(Skill_Analysis_Objects.Dashboard_Skill_Analysis_Count.getText());
				Skill_Analysis_Objects.Dashboard_Skill_Analysis.click();
				Skill_Card_Count = Skill_Analysis_Objects.Skill_Analysis_card.size();
				System.out.println("Skill Analysis Count in Dashboard : " + Skill_Analyisis_Count);
				System.out.println("Workmen Count in Skill Analysis : " + Skill_Card_Count);
				if (Skill_Analyisis_Count == Skill_Card_Count) {
					System.out.println("Skill Count & Workman Cards Count Matched");
				} else {
					System.out.println("Skill Count & Workman Cards Count Not - Matched");
				}
				if (Skill_Card_Count > 0) {
					Skill_Analysis_Create.Verify_User_can_be_able_to_select_workmen_and_Proceed_to_Manual_Skill_Test();
					Skill_Analysis_Create.Verify_User_can_be_able_to_Enter_Skill_Analysis_Details();
					Skill_Analysis_Create.Verify_User_can_be_able_to_Accept_or_reject_Workmen_Skill_Analysis();
					Thread.sleep(5000);
					System.out.println("Skill Analysis Completed");
					System.out.println("Navigating to Paramedics");
					ObjectsReporsitory.WMS_induction.click();

					Thread.sleep(5000);
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
					Thread.sleep(5000);
					ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Paramedics_Count);
					ObjectsReporsitory.Induction_paramedics.click();
					Paramedics_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
					System.out.println("Workmen Count in Paramedics : " + Paramedics_Card_Count);
					if (Paramedics_Card_Count > 0) {

						wait.until(
								ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
						System.out.println("Navigated to Pramedics");
						Paramedics_Create.Verify_User_can_be_able_to_View_Workmen_profile_Paramedics();
						Paramedics_Create.Verify_User_can_be_able_to_Enter_Medical_Examination_Date();
						Paramedics_Create.Verify_User_can_be_able_to_add_Paramedics_details();
						Paramedics_Create.Verify_User_can_be_able_to_save_Paramedics_details();
						System.out.println("Workmen Paramedics Details are saved");
						System.out.println("Navigating to Medical Test");
						ObjectsReporsitory.WMS_induction.click();

						Thread.sleep(5000);
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
						Thread.sleep(5000);
						MedicalTest_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
						ObjectsReporsitory.Induction_medicalTest.click();
						MedicalTest_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
						System.out.println("Workmen Count in Paramedics : " + MedicalTest_Card_Count);
						if (MedicalTest_Count == MedicalTest_Card_Count) {
							System.out.println("MedicalTest Count & Workman Cards Count Matched");
						} else {
							System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
						}
						if (MedicalTest_Card_Count > 0) {
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
							System.out.println("Navigated to MedicalTest");
						} else {
							System.out.println("Navigated to MedicalTest");
							System.out.println("Error : completed Paramedics Records is not displayed in MedicalTest");
						}

					} else {
						System.out.println(
								"Error : completed SKill Analysis & Paramedics Records is not displayed in Medical Test");
						// fail();
					}
				} else {
					System.out.println("No Workmen Found in Skill Analysis");
					System.out.println("Enrolling New Workman");
					Login.Logout();
					Submit_Workman_Details
							.Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_Statutory_bank_details();
					Submit_Workman_Details.Verify_save_and_submit_workman_details();
					System.out.println("Workmen Entrolled");
					Login.Logout();
					System.out.println("Completing Skill Analysis");
					Workman_Search.Login_and_Navigate_to_Skill_Analysis();
					Skill_Analysis_Create.Verify_User_can_be_able_to_select_workmen_and_Proceed_to_Manual_Skill_Test();
					Skill_Analysis_Create.Verify_User_can_be_able_to_Enter_Skill_Analysis_Details();
					Skill_Analysis_Create.Verify_User_can_be_able_to_Accept_or_reject_Workmen_Skill_Analysis();
					Thread.sleep(5000);
					System.out.println("Skill Analysis Completed");
					System.out.println("Navigating to Paramedics");
					ObjectsReporsitory.WMS_induction.click();

					Thread.sleep(5000);
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
					Thread.sleep(5000);
					Paramedics_Count = Integer.parseInt(Skill_Analysis_Objects.Dashboard_Paramedics_Count.getText());
					ObjectsReporsitory.Induction_paramedics.click();
					wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
					Thread.sleep(5000);
					Paramedics_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
					System.out.println("Workmen Count in Paramedics : " + Paramedics_Card_Count);
					if (Paramedics_Count == Paramedics_Card_Count) {
						System.out.println("Paramedics Count & Workman Cards Count Matched");
					} else {
						System.out.println("Paramedics Count & Workman Cards Count Not - Matched");
					}
					if (Paramedics_Card_Count > 0) {
						wait.until(
								ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
						System.out.println("Navigated to Pramedics");
						wait.until(
								ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
						System.out.println("Navigated to Pramedics");
						Paramedics_Create.Verify_User_can_be_able_to_View_Workmen_profile_Paramedics();
						Paramedics_Create.Verify_User_can_be_able_to_Enter_Medical_Examination_Date();
						Paramedics_Create.Verify_User_can_be_able_to_add_Paramedics_details();
						Paramedics_Create.Verify_User_can_be_able_to_save_Paramedics_details();
						ObjectsReporsitory.WMS_induction.click();

						Thread.sleep(5000);
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
						Thread.sleep(5000);
						MedicalTest_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
						ObjectsReporsitory.Induction_medicalTest.click();
						MedicalTest_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
						System.out.println("Workmen Count in Paramedics : " + MedicalTest_Card_Count);
						if (MedicalTest_Count == MedicalTest_Card_Count) {
							System.out.println("MedicalTest Count & Workman Cards Count Matched");
						} else {
							System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
						}
						if (MedicalTest_Card_Count > 0) {
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
							System.out.println("Navigated to MedicalTest");
						} else {
							System.out.println("Error : completed Paramedics Records is not displayed in MedicalTest");
						}
					} else {
						System.out.println(
								"Error : Entrolled workmen and completed SKill Analysis , Paramedics Records is not displayed in Medical Test");
						// fail();
					}
				}
			}
		}

	}

	@Then("^Verify User can be able to View Workmen profile medical Test$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile_medical_Test() throws Throwable {
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		String Workmanname = ObjectsReporsitory.MedicalTest_ProfileCard_Workmenname.getText();
		String WorkmanNumber = ObjectsReporsitory.MedicalTest_ProfileCard_Workmennumber.getText();
		String WorkmenPartner = ObjectsReporsitory.MedicalTest_ProfileCard_WorkmenPartnerDetails.getText();
		String WorkmenSkill = ObjectsReporsitory.MedicalTest_ProfileCard_WorkmenSkill.getText();
		System.out.println("Workmen Name : " + Workmanname);
		System.out.println("Workmen Number : " + WorkmanNumber);
		System.out.println("Partner Name : " + WorkmenPartner);
		System.out.println("Workmen Skill : " + WorkmenSkill);
		Screenshot.Screenshotforscenario();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched");
			System.out.println("=====================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Card : " + Workmanname);
			System.out
					.println("Workmen Name in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen Number Matched");
			System.out.println("=====================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Number in Card : " + WorkmanNumber);
			System.out.println("Workmen Number in Profilecard : "
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText())) {
			System.out.println("Workmen Skill Matched");
			System.out.println("=====================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Card : " + WorkmenSkill);
			System.out.println(
					"Workmen Skill in Profilecard : " + ObjectsReporsitory.Profile_card_WorkmenSkill.getText());
			System.out.println("=========================");
		}

		if (WorkmenPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Partner ID Matched");
			System.out.println("=====================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		} else {
			System.out.println("Partner ID Not Matched");
			System.out.println("=========================");
			System.out.println("Partner ID in Card : " + WorkmenPartner);
			System.out.println(
					"Partner ID in Profilecard : " + ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		Actions actions_Keys = new Actions(DriverFactory.driver);
		actions_Keys.sendKeys(Keys.ESCAPE);
		actions_Keys.perform();
//		wait.until(
//				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
//		Thread.sleep(3000);

	}

	@Then("^Verify Next Medical Examination due date displayed$")
	public static void Verify_Next_Medical_Examination_due_date_displayed() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		Thread.sleep(5000);
		Medical_test_date = ObjectsReporsitory.MedicalTest_Next_Medical_Examination_due.getText();
		System.out.println("Next Medical Examination due on :" + Medical_test_date);
		DataBaseConnection.getNextMedicalexamdate();

	}

	@Then("^Verify the Paramedics details displayed Medical Test$")
	public static void Verify_the_Paramedics_details_displayed_Medical_Test() throws Throwable {
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Skin_Temperature.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Skin Temperature Details Not Available");
		}

		else {
			System.out.println("Skin Temperature : " + ObjectsReporsitory.MedicalTest_Skin_Temperature.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_ColorOfEyes.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Color of Eyes Details Not Available");
		}

		else {
			System.out.println("Color of Eyes : " + ObjectsReporsitory.MedicalTest_ColorOfEyes.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Complextion.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Complexion Details Not Available");
		}

		else {
			System.out.println("Complexion : " + ObjectsReporsitory.MedicalTest_Complextion.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Heart_Rate.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- HeartRate Details Not Available");
		}

		else {
			System.out.println("HeartRate : " + ObjectsReporsitory.MedicalTest_Heart_Rate.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Diabetics.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Diabetics Details Not Available");
		}

		else {
			System.out.println("Diabetics : " + ObjectsReporsitory.MedicalTest_Diabetics.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_SPO2.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- SPO2 Details Not Available");
		}

		else {
			System.out.println("SPO2 : " + ObjectsReporsitory.MedicalTest_SPO2.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Systolic.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Systolic Details Not Available");
		}

		else {
			System.out.println("Systolic : " + ObjectsReporsitory.MedicalTest_Systolic.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Diastolic.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Diastolic Details Not Available");
		}

		else {
			System.out.println("Diastolic : " + ObjectsReporsitory.MedicalTest_Diastolic.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Height.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Height Details Not Available");
		}

		else {
			System.out.println("Height : " + ObjectsReporsitory.MedicalTest_Height.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Weight.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- weight Details Not Available");
		}

		else {
			System.out.println("weight : " + ObjectsReporsitory.MedicalTest_Weight.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_BMI.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- BMI Details Not Available");
		}

		else {
			System.out.println("BMI : " + ObjectsReporsitory.MedicalTest_BMI.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Identification_Marks_1.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- IDMark1 Details Not Available");
		}

		else {
			System.out.println("IDMark1 : " + ObjectsReporsitory.MedicalTest_Identification_Marks_1.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
		if (ObjectsReporsitory.MedicalTest_Identification_Marks_2.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- IDMark2 Details Not Available");
		}

		else {
			System.out.println("IDMark2 : " + ObjectsReporsitory.MedicalTest_Identification_Marks_2.getText());
			System.out.println("----------------------------");
		}
		// ************************************************************************************************************
	}

	@Then("^Verify the user can be able to create medical certificate$")
	public static void Verify_the_user_can_be_able_to_create_medical_certificate() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_CreateMedicalCertiicate));
		ObjectsReporsitory.MedicalTest_CreateMedicalCertiicate.click();
		Thread.sleep(3000);

	}

	@Then("^Verify the user can be able to update Skin Temperature$")
	public static void Verify_the_user_can_be_able_to_update_Skin_Temperature() throws Throwable {

		ObjectsReporsitory.MedicalTest_updateskintemp.click();
		ObjectsReporsitory.MedicalTest_updateskintemp.clear();
		int min_skintemp = 96;
		int max_skintemp = 102;
		Random rand2 = new Random();
		Random_skintemp = rand2.nextInt(max_skintemp - min_skintemp) + min_skintemp;
		ObjectsReporsitory.MedicalTest_updateskintemp.sendKeys(Random_skintemp + "°F");
		System.out.println("Updated Skin Temp :" + Random_skintemp);

	}

	@Then("^Verify the user can be able to update Color of Eyes$")
	public static void Verify_the_user_can_be_able_to_update_Color_of_Eyes() throws Throwable {

		ObjectsReporsitory.MedicalTest_update_ColorofEyes.click();
		ObjectsReporsitory.MedicalTest_update_ColorofEyes.clear();
		ObjectsReporsitory.MedicalTest_update_ColorofEyes.click();
		ObjectsReporsitory.MedicalTest_update_ColorofEyes.sendKeys("Updated " + ConfigFileReader.getcolorsofeyes());
	}

	@Then("^Verify the user can be able to update Complextion$")
	public static void Verify_the_user_can_be_able_to_update_Complextion() throws Throwable {

		ObjectsReporsitory.MedicalTest_update_complextion.click();
		ObjectsReporsitory.MedicalTest_update_complextion.clear();
		ObjectsReporsitory.MedicalTest_update_complextion.click();
		ObjectsReporsitory.MedicalTest_update_complextion.sendKeys("Updated " + ConfigFileReader.getcomplexion());
	}

	@Then("^Verify the user can be able to enter BP$")
	public static void Verify_the_user_can_be_able_to_enter_BP() throws Throwable {

		ObjectsReporsitory.MedicalTest_updateBP.click();
		ObjectsReporsitory.MedicalTest_updateBP.clear();
		int min_BP = 60;
		int max_BP = 120;
		Random rand3 = new Random();
		Random_BP = rand3.nextInt(max_BP - min_BP) + min_BP;
		ObjectsReporsitory.MedicalTest_updateBP.sendKeys(Random_BP + "mmHg");
		System.out.println("Updated BP :" + Random_BP);

	}

	@Then("^Verify the user can be able to provide workmen medical status$")
	public static void Verify_the_user_can_be_able_to_provide_workmen_medical_status() throws Throwable {

		Random rand4 = new Random();
		int Varicose_Status = rand4.nextInt(ObjectsReporsitory.MedicalTest_Varicose_options.size());
		ObjectsReporsitory.MedicalTest_Varicose_options.get(Varicose_Status).click();
		Varicose_Status_v = ObjectsReporsitory.MedicalTest_Varicose_options.get(Varicose_Status).getText();
		System.out.println("Varicose Status : " + Varicose_Status_v);

		Random rand5 = new Random();
		int Seizure_Status = rand5.nextInt(ObjectsReporsitory.MedicalTest_Varicose_options.size());
		ObjectsReporsitory.MedicalTest_Seizure_options.get(Seizure_Status).click();
		Seizure_Status_v = ObjectsReporsitory.MedicalTest_Seizure_options.get(Seizure_Status).getText();
		System.out.println("Seizure Status : " + Seizure_Status_v);

		Random rand6 = new Random();
		int Vertigo_Status = rand6.nextInt(ObjectsReporsitory.MedicalTest_Vertigo_options.size());
		ObjectsReporsitory.MedicalTest_Vertigo_options.get(Vertigo_Status).click();
		Vertigo_Status_v = ObjectsReporsitory.MedicalTest_Vertigo_options.get(Vertigo_Status).getText();
		System.out.println("Vertigo Status : " + Vertigo_Status_v);

		Random rand7 = new Random();
		int Acrophobia_Status = rand7.nextInt(ObjectsReporsitory.MedicalTest_Acrophobia_options.size());
		ObjectsReporsitory.MedicalTest_Acrophobia_options.get(Acrophobia_Status).click();
		Acrophobia_Status_v = ObjectsReporsitory.MedicalTest_Acrophobia_options.get(Acrophobia_Status).getText();
		System.out.println("Acrophobia Status : " + Acrophobia_Status_v);

		Random rand8 = new Random();
		int Diabetes_Status = rand8.nextInt(ObjectsReporsitory.MedicalTest_Diabetes_options.size());
		ObjectsReporsitory.MedicalTest_Diabetes_options.get(Diabetes_Status).click();
		Diabetes_Status_v = ObjectsReporsitory.MedicalTest_Diabetes_options.get(Diabetes_Status).getText();
		System.out.println("Diabetes Status : " + Diabetes_Status_v);

		Random rand9 = new Random();
		int Stroke_Status = rand9.nextInt(ObjectsReporsitory.MedicalTest_Stroke_options.size());
		ObjectsReporsitory.MedicalTest_Stroke_options.get(Stroke_Status).click();
		Stroke_Status_v = ObjectsReporsitory.MedicalTest_Stroke_options.get(Stroke_Status).getText();
		System.out.println("Stroke Status : " + Stroke_Status_v);

		Random rand10 = new Random();
		int Heart_Disease_Status = rand10.nextInt(ObjectsReporsitory.MedicalTest_HeartDisease_options.size());
		ObjectsReporsitory.MedicalTest_HeartDisease_options.get(Heart_Disease_Status).click();
		HeartDisease_Status_v = ObjectsReporsitory.MedicalTest_HeartDisease_options.get(Heart_Disease_Status).getText();
		System.out.println("Heart Disease Status : " + HeartDisease_Status_v);

		Random rand11 = new Random();
		int MajorIllnessorSurgery_Status = rand11
				.nextInt(ObjectsReporsitory.MedicalTest_MajorIllnessorSurgery_options.size());
		ObjectsReporsitory.MedicalTest_MajorIllnessorSurgery_options.get(MajorIllnessorSurgery_Status).click();
		MajorIllnessorSurgery_Status_v = ObjectsReporsitory.MedicalTest_MajorIllnessorSurgery_options
				.get(MajorIllnessorSurgery_Status).getText();
		System.out.println("Major Illness or Surgery Status : " + MajorIllnessorSurgery_Status_v);

		Random rand12 = new Random();
		int RespiratoryDiseases_Status = rand12
				.nextInt(ObjectsReporsitory.MedicalTest_RespiratoryDiseases_options.size());
		ObjectsReporsitory.MedicalTest_RespiratoryDiseases_options.get(RespiratoryDiseases_Status).click();
		RespiratoryDiseases_Status_v = ObjectsReporsitory.MedicalTest_RespiratoryDiseases_options
				.get(RespiratoryDiseases_Status).getText();
		System.out.println("Respiratory Diseases Status : " + RespiratoryDiseases_Status_v);

	}

	@Then("^Verify the user can be able to add workmen medical fitness status$")
	public static void Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status() throws Throwable {

		if ((Stroke_Status_v.equals("Yes")) || (HeartDisease_Status_v.equals("Yes"))
				|| (MajorIllnessorSurgery_Status_v.equals("Yes")) || (RespiratoryDiseases_Status_v.equals("Yes"))) {

			ObjectsReporsitory.MedicalTest_FitnessStatus_UnFit.click();
			MedicalTestFitness_Status_v = ObjectsReporsitory.MedicalTest_FitnessStatus_Enabled.getText();
			System.out.println("Workmen Fitness Status : " + MedicalTestFitness_Status_v);

		} else {

			ObjectsReporsitory.MedicalTest_FitnessStatus_Fit.click();
			MedicalTestFitness_Status_v = ObjectsReporsitory.MedicalTest_FitnessStatus_Enabled.getText();
			System.out.println("Workmen Fitness Status : " + MedicalTestFitness_Status_v);
		}

	}

	@Then("^Verify the user can be able to add Medical Officer Details$")
	public static void Verify_the_user_can_be_able_to_add_Medical_Officer_Details() throws Throwable {

		ObjectsReporsitory.MedicalTest_MedicalofficerName.click();
		Thread.sleep(3000);
		ObjectsReporsitory.MedicalTest_MedicalofficerName.sendKeys("MedicalOfficer" + RandomString.make(10));
		Thread.sleep(3000);
		Random rnd = new Random();
		long number1 = rnd.nextInt(54321);
		// int randomNo = ThreadLocalRandom.current().nextInt(1, 20);
		// System.out.println("A Random number between 1 to 20 is: " + randomNo);

		ObjectsReporsitory.MedicalTest_RegistrationNumber.sendKeys("RegNo" + number1);
		Thread.sleep(3000);

	}

	@Then("^Verify the user can be able to submit medical Test details$")
	public static void Verify_the_user_can_be_able_to_submit_medical_Test_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_Submit));
		ObjectsReporsitory.MedicalTest_Submit.click();
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_handle();

	}

	@Then("^Verify the user can be able to download medical certificate$")
	public static void Verify_the_user_can_be_able_to_download_medical_certificate() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_DownloadMedicalCertificate));
		ObjectsReporsitory.MedicalTest_DownloadMedicalCertificate.click();
		Thread.sleep(5000);

	}

	@Then("^Select Workmen for Medical Test Verification$")
	public static void Select_Workmen_for_Medical_Test_Verification() throws Throwable {
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		Thread.sleep(5000);

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_CreateMedicalCertiicate));
		ObjectsReporsitory.MedicalTest_CreateMedicalCertiicate.click();
		Thread.sleep(3000);

	}
}
