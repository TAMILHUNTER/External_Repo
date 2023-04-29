package stepdefinition.Wage.Create;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic_Details.Create.Submit_Workman_Details;
import stepdefinition.EHS.Create.EHS_Create;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import stepdefinition.MedicalTest.Create.MedicalTest_Create;
import stepdefinition.Paramedics.Create.Paramedics_Create;
import stepdefinition.SkillAnalysis.Create.Skill_Analysis_Create;
import stepdefinition.Workmen_Search.Workman_Search;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Wage_Create {

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
	public Wage_Create() {
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

	@Given("^Login and Navigate to Wage$")
	public static void Login_and_Navigate_to_Wage() throws Throwable {

		Login.Use_Login_Induction_Wage();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_wage));
		Thread.sleep(5000);
		// Wage_Count =
		// Integer.parseInt(ObjectsReporsitory.Dashboard_Wage_Count.getText());
		ObjectsReporsitory.Induction_wage.click();
		Wage_Card_Count = Skill_Analysis_Objects.Wage_All_cards.size();
		System.out.println("Workmen Count in Wage : " + Wage_Card_Count);

		if (Wage_Card_Count > 0) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_First_card));
			System.out.println("Navigated to Wage");
		}

//IF NOT FOUND IN Wage		

		else {

			System.out.println("No Workmen Found in Wage");
			System.out.println("Enrolling Workmen for Wage from EHS");
			ObjectsReporsitory.WMS_induction.click();

			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
			Thread.sleep(5000);
			EHS_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_EHS_Count.getText());
			ObjectsReporsitory.Induction_eHS.click();
			EHS_Card_Count = Skill_Analysis_Objects.Dashboard_EHS_Card.size();
			System.out.println("Workmen Count in EHS : " + EHS_Card_Count);
			if (EHS_Count == EHS_Card_Count) {
				System.out.println("EHS Count & Workman Cards Count Matched");
			} else {
				System.out.println("EHS Count & Workman Cards Count Not - Matched");
			}

			if (EHS_Card_Count > 0) {
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
				System.out.println("Navigated to EHS");
				EHS_Create.Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training();
				EHS_Create.Verify_user_can_be_able_to_select_Training_Program();
				EHS_Create.Verify_user_can_be_able_to_Submit_Trainings();
				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction));
				ObjectsReporsitory.WMS_induction.click();

				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_wage));
				Thread.sleep(5000);
				ObjectsReporsitory.Induction_wage.click();
				Wage_Card_Count = Skill_Analysis_Objects.Wage_All_cards.size();
				System.out.println("Workmen Count in Wage : " + Wage_Card_Count);

				if (Wage_Card_Count > 0) {
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_First_card));
					System.out.println("Navigated to Wage");
				} else {
					System.out.println("** Error ** Completed EHS Workmen Not displayed in Wage");
					// fail();
				}

			}

//IF NOT FOUND IN EHS				

			else {
				System.out.println("No Workmen Found in EHS");
				System.out.println("Enrolling Workmen for EHS from MedicalTest");
				ObjectsReporsitory.WMS_induction.click();

				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
				Thread.sleep(5000);
				MedicalTest_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
				ObjectsReporsitory.Induction_medicalTest.click();
				MedicalTest_Card_Count = Skill_Analysis_Objects.MedicalTest_Card_Count.size();
				System.out.println("Workmen Count in MedicalTest : " + MedicalTest_Card_Count);
				if (MedicalTest_Count == MedicalTest_Card_Count) {
					System.out.println("MedicalTest Count & Workman Cards Count Matched");
				} else {
					System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
				}
				if (MedicalTest_Card_Count > 0) {
					System.out.println("Navigated to MedicalTest");
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
					MedicalTest_Create.Verify_Next_Medical_Examination_due_date_displayed();
					MedicalTest_Create.Verify_the_Paramedics_details_displayed_Medical_Test();
					MedicalTest_Create.Verify_the_user_can_be_able_to_create_medical_certificate();
					MedicalTest_Create.Verify_the_user_can_be_able_to_update_Skin_Temperature();
					MedicalTest_Create.Verify_the_user_can_be_able_to_enter_BP();
					MedicalTest_Create.Verify_the_user_can_be_able_to_provide_workmen_medical_status();
					MedicalTest_Create.Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status();
					MedicalTest_Create.Verify_the_user_can_be_able_to_add_Medical_Officer_Details();
					MedicalTest_Create.Verify_the_user_can_be_able_to_submit_medical_Test_details();
					System.out.println("Medical Test Completed");
					System.out.println("Navigating to EHS");
					ObjectsReporsitory.WMS_induction.click();
					Login.Logout();
					Login.Use_Login_Induction_EHS();
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
					ObjectsReporsitory.Home_accessBasedMenu.click();
					wait.until(
							ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
					ObjectsReporsitory.Menu_workmenManagementSystem.click();
					ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
					ObjectsReporsitory.WMS_induction.click();

					Thread.sleep(5000);
					System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
					String Current_job3 = ObjectsReporsitory.Induction_Jobcode.getText();
					if (Current_job3.equals(ConfigFileReader.getJob_LE180046())) {
						System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
					} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
						SwitchJob_Create.SwitchJob_LE180046();
					}
					wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
					Thread.sleep(5000);
					EHS_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_EHS_Count.getText());
					ObjectsReporsitory.Induction_eHS.click();
					EHS_Card_Count = Skill_Analysis_Objects.Dashboard_EHS_Card.size();
					System.out.println("Workmen Count in EHS : " + EHS_Card_Count);
					if (EHS_Count == EHS_Card_Count) {
						System.out.println("EHS Count & Workman Cards Count Matched");
					} else {
						System.out.println("EHS Count & Workman Cards Count Not - Matched");
					}

					if (EHS_Card_Count > 0) {
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
						System.out.println("Navigated to EHS");
						EHS_Create.Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training();
						EHS_Create.Verify_user_can_be_able_to_select_Training_Program();
						EHS_Create.Verify_user_can_be_able_to_Submit_Trainings();
						Thread.sleep(5000);
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction));
						ObjectsReporsitory.WMS_induction.click();

						Thread.sleep(5000);
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_wage));
						Thread.sleep(5000);
						ObjectsReporsitory.Induction_wage.click();
						Wage_Card_Count = Skill_Analysis_Objects.Wage_All_cards.size();
						System.out.println("Workmen Count in Wage : " + Wage_Card_Count);
						if (Wage_Count == Wage_Card_Count) {
							System.out.println("Wage Count in Dashboard & Wage - Workman Cards Count are Matched");
						} else {
							System.out
									.println("Wage Count in Dashboard & Wage - Workman Cards Count are Not - Matched");
						}

						if (Wage_Card_Count > 0) {
							wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_First_card));
							System.out.println("Navigated to Wage");
						} else {
							System.out.println("No Workmen Found in MedicalTest");
							System.out.println("Error : completed MedicalTest Record is not displayed in EHS");
						}
					}
				}

				// IF NOT FOUND IN Medical Test
				else {

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
						MedicalTest_Card_Count = Skill_Analysis_Objects.MedicalTest_Card_Count.size();
						System.out.println("Workmen Count in MedicalTest : " + MedicalTest_Card_Count);
						if (MedicalTest_Count == MedicalTest_Card_Count) {
							System.out.println("MedicalTest Count & Workman Cards Count Matched");
						} else {
							System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
						}
						if (MedicalTest_Card_Count > 0) {
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));

							System.out.println("Navigated to MedicalTest");
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
							MedicalTest_Create.Verify_Next_Medical_Examination_due_date_displayed();
							MedicalTest_Create.Verify_the_Paramedics_details_displayed_Medical_Test();
							MedicalTest_Create.Verify_the_user_can_be_able_to_create_medical_certificate();
							MedicalTest_Create.Verify_the_user_can_be_able_to_update_Skin_Temperature();
							MedicalTest_Create.Verify_the_user_can_be_able_to_enter_BP();
							MedicalTest_Create.Verify_the_user_can_be_able_to_provide_workmen_medical_status();
							MedicalTest_Create.Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status();
							MedicalTest_Create.Verify_the_user_can_be_able_to_add_Medical_Officer_Details();
							MedicalTest_Create.Verify_the_user_can_be_able_to_submit_medical_Test_details();
							System.out.println("Medical Test Completed");
							System.out.println("Navigating to EHS");
							ObjectsReporsitory.WMS_induction.click();
							Login.Logout();
							Login.Use_Login_Induction_EHS();
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
							ObjectsReporsitory.Home_accessBasedMenu.click();
							wait.until(ExpectedConditions
									.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
							ObjectsReporsitory.Menu_workmenManagementSystem.click();
							ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
							ObjectsReporsitory.WMS_induction.click();

							Thread.sleep(5000);
							System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
							String Current_job3 = ObjectsReporsitory.Induction_Jobcode.getText();
							if (Current_job3.equals(ConfigFileReader.getJob_LE180046())) {
								System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
							} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
								SwitchJob_Create.SwitchJob_LE180046();
							}
							wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
							Thread.sleep(5000);
							EHS_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_EHS_Count.getText());
							ObjectsReporsitory.Induction_eHS.click();
							EHS_Card_Count = Skill_Analysis_Objects.Dashboard_EHS_Card.size();
							System.out.println("Workmen Count in EHS : " + EHS_Card_Count);
							if (EHS_Count == EHS_Card_Count) {
								System.out.println("EHS Count & Workman Cards Count Matched");
							} else {
								System.out.println("EHS Count & Workman Cards Count Not - Matched");
							}

							if (EHS_Card_Count > 0) {
								wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
								System.out.println("Navigated to EHS");
								EHS_Create.Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training();
								EHS_Create.Verify_user_can_be_able_to_select_Training_Program();
								EHS_Create.Verify_user_can_be_able_to_Submit_Trainings();
								Thread.sleep(5000);
								wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction));
								ObjectsReporsitory.WMS_induction.click();

								Thread.sleep(5000);
								wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_wage));
								Thread.sleep(5000);
								ObjectsReporsitory.Induction_wage.click();
								Wage_Card_Count = Skill_Analysis_Objects.Wage_All_cards.size();
								System.out.println("Workmen Count in Wage : " + Wage_Card_Count);
								if (Wage_Count == Wage_Card_Count) {
									System.out.println(
											"Wage Count in Dashboard & Wage - Workman Cards Count are Matched");
								} else {
									System.out.println(
											"Wage Count in Dashboard & Wage - Workman Cards Count are Not - Matched");
								}

								if (Wage_Card_Count > 0) {
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.Wage_First_card));
									System.out.println("Navigated to Wage");
								} else {
									System.out.println("No Workmen Found in MedicalTest");
									System.out.println("Error : completed MedicalTest Record is not displayed in EHS");
								}
							} else {
								System.out.println("No Workmen Found in MedicalTest");
								System.out.println("Error : completed MedicalTest Record is not displayed in EHS");
							}

						} else {
							System.out.println("Navigated to MedicalTest");
							System.out.println("Error : completed Paramedics Records is not displayed in MedicalTest");
						}
					}

					// IF NOT FOUND IN Paramedics
					else {

						System.out.println("No Workmen Found in Paramedics");
						System.out.println("Enrolling Workmen for Paramedics from Skill Analysis");
						ObjectsReporsitory.WMS_induction.click();
						wait.until(ExpectedConditions
								.elementToBeClickable(Skill_Analysis_Objects.Dashboard_Skill_Analysis));
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
							Skill_Analysis_Create
									.Verify_User_can_be_able_to_select_workmen_and_Proceed_to_Manual_Skill_Test();
							Skill_Analysis_Create.Verify_User_can_be_able_to_Enter_Skill_Analysis_Details();
							Skill_Analysis_Create.Verify_User_can_be_able_to_Accept_or_reject_Workmen_Skill_Analysis();
							Thread.sleep(5000);
							System.out.println("Skill Analysis Completed");
							ObjectsReporsitory.WMS_induction.click();
							Login.Logout();
							System.out.println("Navigating to Paramedics");
							Login.Use_Login_Induction_Paramedics();
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
							ObjectsReporsitory.Home_accessBasedMenu.click();
							wait.until(ExpectedConditions
									.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
							ObjectsReporsitory.Menu_workmenManagementSystem.click();
							ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
							ObjectsReporsitory.WMS_induction.click();

							Thread.sleep(5000);
							System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
							String Current_job6 = ObjectsReporsitory.Induction_Jobcode.getText();
							if (Current_job6.equals(ConfigFileReader.getJob_LE180046())) {
								System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
							} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
								SwitchJob_Create.SwitchJob_LE180046();
							}

							Thread.sleep(5000);
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
							Thread.sleep(5000);
							ExpectedConditions
									.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Paramedics_Count);
							ObjectsReporsitory.Induction_paramedics.click();
							Paramedics_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
							System.out.println("Workmen Count in Paramedics : " + Paramedics_Card_Count);
							if (Paramedics_Card_Count > 0) {
								wait.until(ExpectedConditions
										.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
								System.out.println("Navigated to Pramedics");
								Paramedics_Create.Verify_User_can_be_able_to_View_Workmen_profile_Paramedics();
								Paramedics_Create.Verify_User_can_be_able_to_Enter_Medical_Examination_Date();
								Paramedics_Create.Verify_User_can_be_able_to_add_Paramedics_details();
								Paramedics_Create.Verify_User_can_be_able_to_save_Paramedics_details();
								System.out.println("Workmen Paramedics Details are saved");
								System.out.println("Navigating to Medical Test");
								ObjectsReporsitory.WMS_induction.click();

								Thread.sleep(5000);
								wait.until(ExpectedConditions
										.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
								Thread.sleep(5000);
								MedicalTest_Count = Integer
										.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
								ObjectsReporsitory.Induction_medicalTest.click();
								MedicalTest_Card_Count = Skill_Analysis_Objects.MedicalTest_Card_Count.size();
								System.out.println("Workmen Count in MedicalTest : " + MedicalTest_Card_Count);
								if (MedicalTest_Count == MedicalTest_Card_Count) {
									System.out.println("MedicalTest Count & Workman Cards Count Matched");
								} else {
									System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
								}
								if (MedicalTest_Card_Count > 0) {
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));

									System.out.println("Navigated to MedicalTest");
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
									MedicalTest_Create.Verify_Next_Medical_Examination_due_date_displayed();
									MedicalTest_Create.Verify_the_Paramedics_details_displayed_Medical_Test();
									MedicalTest_Create.Verify_the_user_can_be_able_to_create_medical_certificate();
									MedicalTest_Create.Verify_the_user_can_be_able_to_update_Skin_Temperature();
									MedicalTest_Create.Verify_the_user_can_be_able_to_enter_BP();
									MedicalTest_Create.Verify_the_user_can_be_able_to_provide_workmen_medical_status();
									MedicalTest_Create
											.Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status();
									MedicalTest_Create.Verify_the_user_can_be_able_to_add_Medical_Officer_Details();
									MedicalTest_Create.Verify_the_user_can_be_able_to_submit_medical_Test_details();
									System.out.println("Medical Test Completed");
									System.out.println("Navigating to EHS");
									ObjectsReporsitory.WMS_induction.click();
									Login.Logout();
									Login.Use_Login_Induction_EHS();
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
									ObjectsReporsitory.Home_accessBasedMenu.click();
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
									ObjectsReporsitory.Menu_workmenManagementSystem.click();
									ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
									ObjectsReporsitory.WMS_induction.click();

									Thread.sleep(5000);
									System.out
											.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
									String Current_job3 = ObjectsReporsitory.Induction_Jobcode.getText();
									if (Current_job3.equals(ConfigFileReader.getJob_LE180046())) {
										System.out.println(
												"User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
									} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
										SwitchJob_Create.SwitchJob_LE180046();
									}
									wait.until(
											ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
									Thread.sleep(5000);
									EHS_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_EHS_Count.getText());
									ObjectsReporsitory.Induction_eHS.click();
									EHS_Card_Count = Skill_Analysis_Objects.Dashboard_EHS_Card.size();
									System.out.println("Workmen Count in EHS : " + EHS_Card_Count);
									if (EHS_Count == EHS_Card_Count) {
										System.out.println("EHS Count & Workman Cards Count Matched");
									} else {
										System.out.println("EHS Count & Workman Cards Count Not - Matched");
									}

									if (EHS_Card_Count > 0) {
										wait.until(ExpectedConditions
												.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
										System.out.println("Navigated to EHS");
										EHS_Create.Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training();
										EHS_Create.Verify_user_can_be_able_to_select_Training_Program();
										EHS_Create.Verify_user_can_be_able_to_Submit_Trainings();
										Thread.sleep(5000);
										wait.until(ExpectedConditions
												.elementToBeClickable(ObjectsReporsitory.WMS_induction));
										ObjectsReporsitory.WMS_induction.click();

										Thread.sleep(5000);
										wait.until(ExpectedConditions
												.elementToBeClickable(ObjectsReporsitory.Induction_wage));
										Thread.sleep(5000);
										ObjectsReporsitory.Induction_wage.click();
										Wage_Card_Count = Skill_Analysis_Objects.Wage_All_cards.size();
										System.out.println("Workmen Count in Wage : " + Wage_Card_Count);
										if (Wage_Count == Wage_Card_Count) {
											System.out.println(
													"Wage Count in Dashboard & Wage - Workman Cards Count are Matched");
										} else {
											System.out.println(
													"Wage Count in Dashboard & Wage - Workman Cards Count are Not - Matched");
										}

										if (Wage_Card_Count > 0) {
											wait.until(ExpectedConditions
													.elementToBeClickable(ObjectsReporsitory.Wage_First_card));
											System.out.println("Navigated to Wage");
										} else {
											System.out.println("No Workmen Found in MedicalTest");
											System.out.println(
													"Error : completed MedicalTest Record is not displayed in EHS");
										}
									} else {
										System.out.println(
												"Error : completed MedicalTest Record is not displayed in EHS");
									}

								} else {
									System.out.println(
											"Error : completed Paramedics , Medical Test Records is not displayed in EHS");
								}
							}

							else {
								System.out.println(
										"Error : completed Skill , Paramedics , Medical Test Records is not displayed in EHS");
							}

						}
						// IF NOT FOUND IN Skill
						else {
							System.out.println("No Workmen Found in Skill Analysis");
							System.out.println("Enrolling New Workman");
							Login.Logout();
							Submit_Workman_Details
									.Fill_Partner_Personal_communication_Skill_Deployment_Education_Experience_Statutory_bank_details();
							Submit_Workman_Details.Verify_save_and_submit_workman_details();
							System.out.println("Workmen Entrolled");
							Login.Logout();
							System.out.println("Navigating to Skill Analysis");
							Workman_Search.Login_and_Navigate_to_Skill_Analysis();
							Skill_Analysis_Create
									.Verify_User_can_be_able_to_select_workmen_and_Proceed_to_Manual_Skill_Test();
							Skill_Analysis_Create.Verify_User_can_be_able_to_Enter_Skill_Analysis_Details();
							Skill_Analysis_Create.Verify_User_can_be_able_to_Accept_or_reject_Workmen_Skill_Analysis();
							Thread.sleep(5000);
							System.out.println("Skill Analysis Completed");
							Login.Logout();
							Login.Use_Login_Induction_Paramedics();
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
							ObjectsReporsitory.Home_accessBasedMenu.click();
							wait.until(ExpectedConditions
									.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
							ObjectsReporsitory.Menu_workmenManagementSystem.click();
							ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
							ObjectsReporsitory.WMS_induction.click();

							Thread.sleep(5000);
							System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
							String Current_job6 = ObjectsReporsitory.Induction_Jobcode.getText();
							if (Current_job6.equals(ConfigFileReader.getJob_LE180046())) {
								System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
							} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
								SwitchJob_Create.SwitchJob_LE180046();
							}

							Thread.sleep(5000);
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
							Thread.sleep(5000);
							ExpectedConditions
									.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Paramedics_Count);
							ObjectsReporsitory.Induction_paramedics.click();
							Paramedics_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
							System.out.println("Workmen Count in Paramedics : " + Paramedics_Card_Count);
							if (Paramedics_Card_Count > 0) {
								wait.until(ExpectedConditions
										.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
								System.out.println("Navigated to Pramedics");
								Paramedics_Create.Verify_User_can_be_able_to_View_Workmen_profile_Paramedics();
								Paramedics_Create.Verify_User_can_be_able_to_Enter_Medical_Examination_Date();
								Paramedics_Create.Verify_User_can_be_able_to_add_Paramedics_details();
								Paramedics_Create.Verify_User_can_be_able_to_save_Paramedics_details();
								System.out.println("Workmen Paramedics Details are saved");
								System.out.println("Navigating to Medical Test");
								ObjectsReporsitory.WMS_induction.click();

								Thread.sleep(5000);
								wait.until(ExpectedConditions
										.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
								Thread.sleep(5000);
								MedicalTest_Count = Integer
										.parseInt(ObjectsReporsitory.Dashboard_MedicalTest_Count.getText());
								ObjectsReporsitory.Induction_medicalTest.click();
								MedicalTest_Card_Count = Skill_Analysis_Objects.MedicalTest_Card_Count.size();
								System.out.println("Workmen Count in MedicalTest : " + MedicalTest_Card_Count);
								if (MedicalTest_Count == MedicalTest_Card_Count) {
									System.out.println("MedicalTest Count & Workman Cards Count Matched");
								} else {
									System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
								}
								if (MedicalTest_Card_Count > 0) {
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));

									System.out.println("Navigated to MedicalTest");
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));
									MedicalTest_Create.Verify_Next_Medical_Examination_due_date_displayed();
									MedicalTest_Create.Verify_the_Paramedics_details_displayed_Medical_Test();
									MedicalTest_Create.Verify_the_user_can_be_able_to_create_medical_certificate();
									MedicalTest_Create.Verify_the_user_can_be_able_to_update_Skin_Temperature();
									MedicalTest_Create.Verify_the_user_can_be_able_to_enter_BP();
									MedicalTest_Create.Verify_the_user_can_be_able_to_provide_workmen_medical_status();
									MedicalTest_Create
											.Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status();
									MedicalTest_Create.Verify_the_user_can_be_able_to_add_Medical_Officer_Details();
									MedicalTest_Create.Verify_the_user_can_be_able_to_submit_medical_Test_details();
									System.out.println("Medical Test Completed");
									System.out.println("Navigating to EHS");
									ObjectsReporsitory.WMS_induction.click();
									Login.Logout();
									Login.Use_Login_Induction_EHS();
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
									ObjectsReporsitory.Home_accessBasedMenu.click();
									wait.until(ExpectedConditions
											.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
									ObjectsReporsitory.Menu_workmenManagementSystem.click();
									ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
									ObjectsReporsitory.WMS_induction.click();

									Thread.sleep(5000);
									System.out
											.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
									String Current_job3 = ObjectsReporsitory.Induction_Jobcode.getText();
									if (Current_job3.equals(ConfigFileReader.getJob_LE180046())) {
										System.out.println(
												"User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
									} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
										SwitchJob_Create.SwitchJob_LE180046();
									}
									wait.until(
											ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_eHS));
									Thread.sleep(5000);
									EHS_Count = Integer.parseInt(ObjectsReporsitory.Dashboard_EHS_Count.getText());
									ObjectsReporsitory.Induction_eHS.click();
									EHS_Card_Count = Skill_Analysis_Objects.Dashboard_EHS_Card.size();
									System.out.println("Workmen Count in EHS : " + EHS_Card_Count);
									if (EHS_Count == EHS_Card_Count) {
										System.out.println("EHS Count & Workman Cards Count Matched");
									} else {
										System.out.println("EHS Count & Workman Cards Count Not - Matched");
									}

									if (EHS_Card_Count > 0) {
										wait.until(ExpectedConditions
												.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
										System.out.println("Navigated to EHS");
										EHS_Create.Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training();
										EHS_Create.Verify_user_can_be_able_to_select_Training_Program();
										EHS_Create.Verify_user_can_be_able_to_Submit_Trainings();
										Thread.sleep(5000);
										wait.until(ExpectedConditions
												.elementToBeClickable(ObjectsReporsitory.WMS_induction));
										ObjectsReporsitory.WMS_induction.click();

										Thread.sleep(5000);
										wait.until(ExpectedConditions
												.elementToBeClickable(ObjectsReporsitory.Induction_wage));
										Thread.sleep(5000);
										ObjectsReporsitory.Induction_wage.click();
										Wage_Card_Count = Skill_Analysis_Objects.Wage_All_cards.size();
										System.out.println("Workmen Count in Wage : " + Wage_Card_Count);
										if (Wage_Count == Wage_Card_Count) {
											System.out.println(
													"Wage Count in Dashboard & Wage - Workman Cards Count are Matched");
										} else {
											System.out.println(
													"Wage Count in Dashboard & Wage - Workman Cards Count are Not - Matched");
										}

										if (Wage_Card_Count > 0) {
											wait.until(ExpectedConditions
													.elementToBeClickable(ObjectsReporsitory.Wage_First_card));
											System.out.println("Navigated to Wage");
										} else {
											System.out.println("No Workmen Found in MedicalTest");
											System.out.println(
													"Error : completed MedicalTest Record is not displayed in EHS");
										}
									} else {
										System.out.println(
												"Error : completed MedicalTest Records is not displayed in EHS");
									}

								} else {
									System.out.println(
											"Error : completed Paramedics , Medical Test Records is not displayed in EHS");
								}
							}

							// IF NOT FOUND IN Paramedics
							else {
								System.out.println(
										"Error : Entrolled workmen & completed Skill , Paramedics , Medical Test Records is not displayed in EHS");
							}

						}
					}

				}
			}
		}
	}

	@Then("^Verify User can be able to View Workmen profile Wage$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile_Wage() throws Throwable {
		Actions actions333 = new Actions(DriverFactory.driver);
		actions333.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions333.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		String Workmanname = ObjectsReporsitory.Wage_ProfileCard_Workmenname.getText();
		String WorkmanNumber = ObjectsReporsitory.Wage_ProfileCard_Workmennumber.getText();
		String WorkmenPartner = ObjectsReporsitory.Wage_ProfileCard_WorkmenPartnerDetails.getText();
		String WorkmenSkill = ObjectsReporsitory.Wage_ProfileCard_WorkmenSkill.getText();
		System.out.println("Workmen Name : " + Workmanname);
		System.out.println("Workmen Number : " + WorkmanNumber);
		System.out.println("Partner Name : " + WorkmenPartner);
		System.out.println("Workmen Skill : " + WorkmenSkill);
		Screenshot.Screenshotforscenario();
		Actions actions334 = new Actions(DriverFactory.driver);
		actions334.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		actions334.perform();
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

	@Then("^Verify user can be able to select project Location$")
	public static void Verify_user_can_be_able_to_select_project_Location() throws Throwable {

		List<WebElement> Profile_AllCrds = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards;
		Random rand6546 = new Random();
		int Workmen_Card_Size = rand6546.nextInt(Profile_AllCrds.size());
		Actions actions3346 = new Actions(DriverFactory.driver);
		actions3346
				.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));
		actions3346.perform();
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size).click();

//		Actions actions334 = new Actions(DriverFactory.driver);
//		actions334.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
//		actions334.perform();
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Crads_Eye));
//		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_All_Cards.get(Workmen_Card_Size));

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Project_Location));
		ObjectsReporsitory.Wage_Project_Location.click();
		ObjectsReporsitory.Wage_Project_Location.clear();
		ObjectsReporsitory.Wage_Project_Location.click();

		List<WebElement> DropdownResult = ObjectsReporsitory.Wage_Project_Location_options;
		Random rand654 = new Random();
		int Project_Location = rand654.nextInt(ObjectsReporsitory.Wage_Project_Location_options.size());
		Selected_Project_Location = ObjectsReporsitory.Wage_Project_Location_options.get(Project_Location).getText();

		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(Selected_Project_Location)) {
				webElement.click();
				System.out.println("Project Location :" + Selected_Project_Location);
				break;
			}
		}

	}

	@Then("^Verify user can be able to select project Zone$")
	public static void Verify_user_can_be_able_to_select_project_Zone() throws Throwable {
		Actions actions335 = new Actions(DriverFactory.driver);
		actions335.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions335.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Zone));
		ObjectsReporsitory.Wage_Zone.click();
		ObjectsReporsitory.Wage_Zone.clear();
		ObjectsReporsitory.Wage_Zone.click();

		List<WebElement> DropdownResult_zone = ObjectsReporsitory.Wage_Zone_options;
		Random rand_zone = new Random();
		int Zone = rand_zone.nextInt(ObjectsReporsitory.Wage_Zone_options.size());
		Selected_Zone = ObjectsReporsitory.Wage_Zone_options.get(Zone).getText();

		for (WebElement webElement : DropdownResult_zone) {
			if (webElement.getText().equals(Selected_Zone)) {
				webElement.click();
				System.out.println("Zone :" + Selected_Zone);
				break;
			}
		}

	}

	@Then("^Verify user can be able to select Payout Duration$")
	public static void Verify_user_can_be_able_to_select_Payout_Duration() throws Throwable {
		Actions actions336 = new Actions(DriverFactory.driver);
		actions336.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions336.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

		Random rand_payout = new Random();
		int PayoutOption = rand_payout.nextInt(ObjectsReporsitory.Wage_Payout_options.size());
		ObjectsReporsitory.Wage_Payout_options.get(PayoutOption).click();
		Wage_Payout_options = ObjectsReporsitory.Wage_Payout_options.get(PayoutOption).getText();
		System.out.println("Wage will be Processed by  : " + Wage_Payout_options);
	}

	@Then("^Verify user can be able to enter Basic Earnings$")
	public static void Verify_user_can_be_able_to_enter_Basic_Earnings() throws Throwable {
		Actions actions337 = new Actions(DriverFactory.driver);
		actions337.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions337.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

		Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();

		if (Wage_Payout_options_selected.equals("Daily")) {
			int min = 100;
			int max = 1000;
			Random rand_Daily_payout_Basic = new Random();
			Daily_payout_Basic = rand_Daily_payout_Basic.nextInt(max - min) + min;
			ObjectsReporsitory.Wage_Earnings_Basic.click();
			ObjectsReporsitory.Wage_Earnings_Basic.clear();
			ObjectsReporsitory.Wage_Earnings_Basic.click();
			ObjectsReporsitory.Wage_Earnings_Basic.sendKeys("" + Daily_payout_Basic);
			System.out.println("Daily Basic Pay :" + Daily_payout_Basic);
			Screenshot.Screenshotforscenario();
		}

		if (Wage_Payout_options_selected.equals("Monthly")) {
			ObjectsReporsitory.Wage_Earnings_Basic.click();
			ObjectsReporsitory.Wage_Earnings_Basic.clear();
			ObjectsReporsitory.Wage_Earnings_Basic.click();
			Random rand_Monthly_payout_Basic = new Random();
			long Monthly_payout_Basic = rand_Monthly_payout_Basic.nextInt(123456);
			ObjectsReporsitory.Wage_Earnings_Basic.sendKeys("" + Monthly_payout_Basic);
			System.out.println("Monthly Basic Pay :" + Monthly_payout_Basic);
			Screenshot.Screenshotforscenario();
		}
	}

	@Then("^Verify user can be able to enter HRA Earnings$")
	public static void Verify_user_can_be_able_to_enter_HRA_Earnings() throws Throwable {
		Actions actions338 = new Actions(DriverFactory.driver);
		actions338.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions338.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

		Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();

		if (Wage_Payout_options_selected.equals("Daily")) {
			int min = 10;
			int max = 200;
			Random rand_Daily_payout_Basic = new Random();
			Daily_payout_HRA = rand_Daily_payout_Basic.nextInt(max - min) + min;
			ObjectsReporsitory.Wage_Earnings_HRA.click();
			ObjectsReporsitory.Wage_Earnings_HRA.clear();
			ObjectsReporsitory.Wage_Earnings_HRA.click();
			ObjectsReporsitory.Wage_Earnings_HRA.sendKeys("" + Daily_payout_HRA);
			System.out.println("Daily HRA Pay :" + Daily_payout_HRA);
			Screenshot.Screenshotforscenario();
		}

		if (Wage_Payout_options_selected.equals("Monthly")) {
			ObjectsReporsitory.Wage_Earnings_HRA.click();
			ObjectsReporsitory.Wage_Earnings_HRA.clear();
			ObjectsReporsitory.Wage_Earnings_HRA.click();
			Random rand_Monthly_payout_HRA = new Random();
			long Monthly_payout_HRA = rand_Monthly_payout_HRA.nextInt(123);
			ObjectsReporsitory.Wage_Earnings_HRA.sendKeys("" + Monthly_payout_HRA);
			System.out.println("Monthly HRA Pay :" + Monthly_payout_HRA);
			Screenshot.Screenshotforscenario();
		}
	}

	@Then("^Verify user can be able to enter Fixed Other Allowances in Earnings$")
	public static void Verify_user_can_be_able_to_enter_Fixed_Other_Allowances_in_Earnings() throws Throwable {
		Actions actions339 = new Actions(DriverFactory.driver);
		actions339.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions339.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

		Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
		ObjectsReporsitory.Wage_otherAllowances.click();

		Thread.sleep(5000);
		if (Wage_Payout_options_selected.equals("Daily")) {

			int Record_Count = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size();
			System.out.println("Record Count Size : " + Record_Count);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_Reason));
			System.out.println("Entering Daily Fixed Other Allowance Reason");
			System.out.println("================================");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			ObjectsReporsitory.Wage_otherAllowances_Reason.clear();
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();

			List<WebElement> Wage_otherAllowances_Reason_allEmelemnts = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts;
			Random rand_otherAllowances_Reason = new Random();
			int otherAllowances_Reason = rand_otherAllowances_Reason
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts.size());
			Selected_otherAllowances_Reason = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts
					.get(otherAllowances_Reason).getText();

			for (WebElement webElement : Wage_otherAllowances_Reason_allEmelemnts) {
				if (webElement.getText().equals(Selected_otherAllowances_Reason)) {
					webElement.click();
					System.out.println("Daily Fixed Other Allowance for :" + Selected_otherAllowances_Reason);
					System.out.println("=========================================================");
					break;
				}
			}

			Thread.sleep(3000);
			System.out.println("Selecting Daily Fixed Other Allowance Type as : Fixed");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Type_Fixed.click();
			System.out.println("Daily Fixed Other Allowance Type as Fixed selected");
			System.out.println("================================");
			Thread.sleep(3000);
			System.out.println("Selecting Daily Fixed Other Allowance Dependent");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_dependent.click();

			List<WebElement> Wage_otherAllowances_dependent_allElements = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts;
			Random rand_otherAllowances_dependent = new Random();
			int otherAllowances_dependent = rand_otherAllowances_dependent
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size());
			Selected_otherAllowances_dependent = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts
					.get(otherAllowances_dependent).getText();

			for (WebElement webElement : Wage_otherAllowances_dependent_allElements) {
				if (webElement.getText().equals(Selected_otherAllowances_dependent)) {
					webElement.click();
					System.out
							.println("Daily Fixed Other Allowance Dependent of :" + Selected_otherAllowances_dependent);
					System.out.println("=========================================================");
					break;
				}
			}

			System.out.println("Entering Daily Fixed other Allowances Value");
			System.out.println("================================");

			int min = 10;
			int max = 500;
			Random rand_Daily_otherAllowances = new Random();
			Daily_Fixed_OtherAllowances = rand_Daily_otherAllowances.nextInt(max - min) + min;
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.clear();
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.sendKeys("" + Daily_Fixed_OtherAllowances);
			System.out.println("Daily Fixed Other Allowances Value : " + Daily_Fixed_OtherAllowances);
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			Thread.sleep(3000);
			Daily_Fixed_OtherAllowances_Input = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value"));
			Daily_Fixed_OtherAllowances_Amount_calculated = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Amount.getText());

			if (Daily_Fixed_OtherAllowances_Amount_calculated == Daily_Fixed_OtherAllowances_Input) {
				System.out.println("Daily Fixed Other Allowance Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println("Daily Fixed Other Allowance Value Calculated : "
						+ Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("Daily Fixed Values Are matched : Amount Calculated Correctly ");
				System.out.println("================================");

			} else {
				System.out.println("Daily Fixed Other Allowance Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println("Daily Fixed Other Allowance Value Calculated : "
						+ Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("****Error : Values are Not matched : Amount Not Calculated Correctly ");
				System.out.println("================================");
				// fail();
			}

			// Need to Implement
//			List<WebElement> Wage_otherAllowances_Amount_Calculated_AllAmount = ObjectsReporsitory.Wage_otherAllowances_Amount_Calculated_AllAmount;
//			for(int i = 0 ; i <Wage_otherAllowances_Amount_Calculated_AllAmount.size() ; i ++) {
//				
//			}
//			
			// Daily_Fixed_OtherAllowances_Total=ObjectsReporsitory.Wage_otherAllowances_All_Amount.getText();

			Daily_Fixed_OtherAllowances_Total = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Total.getText());
			System.out.println("****Daily Fixed Other Allowances Total : " + Daily_Fixed_OtherAllowances_Total);
			System.out.println("================================");
			Screenshot.Screenshotforscenario();

		} else if (Wage_Payout_options_selected.equals("Monthly")) {
			int Record_Count = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size();
			System.out.println("Record Count Size : " + Record_Count);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_Reason));
			System.out.println("Entering Monthly Fixed Other Allowance Reason ");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			ObjectsReporsitory.Wage_otherAllowances_Reason.clear();
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();

			List<WebElement> Wage_otherAllowances_Reason_allEmelemnts = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts;
			Random rand_otherAllowances_Reason = new Random();
			int otherAllowances_Reason = rand_otherAllowances_Reason
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts.size());
			Selected_otherAllowances_Reason = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts
					.get(otherAllowances_Reason).getText();

			for (WebElement webElement : Wage_otherAllowances_Reason_allEmelemnts) {
				if (webElement.getText().equals(Selected_otherAllowances_Reason)) {
					webElement.click();
					System.out.println("Monthly Fixed Other Allowance for :" + Selected_otherAllowances_Reason);
					System.out.println("=========================================================");
					break;
				}
			}

			Thread.sleep(3000);
			System.out.println("Selecting Monthly Fixed Other Allowance Type as Fixed");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Type_Fixed.click();
			System.out.println("Monthly Fixed Other Allowance Type as Fixed selected");
			System.out.println("================================");
			Thread.sleep(3000);
			System.out.println("Selecting Monthly Fixed Other Allowance Dependent");
			System.out.println("================================");

			ObjectsReporsitory.Wage_otherAllowances_dependent.click();

			List<WebElement> Wage_otherAllowances_dependent_allElements = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts;
			Random rand_otherAllowances_dependent = new Random();
			int otherAllowances_dependent = rand_otherAllowances_dependent
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size());
			Selected_otherAllowances_dependent = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts
					.get(otherAllowances_dependent).getText();

			for (WebElement webElement : Wage_otherAllowances_dependent_allElements) {
				if (webElement.getText().equals(Selected_otherAllowances_dependent)) {
					webElement.click();
					System.out.println(
							"Monthly Fixed Other Allowance Dependent of :" + Selected_otherAllowances_dependent);
					System.out.println("=========================================================");
					break;
				}
			}

			System.out.println("Entering Fixed Monthly other Allowances");
			System.out.println("================================");

			int min = 10;
			int max = 500;
			Random rand_Daily_otherAllowances = new Random();
			Daily_Fixed_OtherAllowances = rand_Daily_otherAllowances.nextInt(max - min) + min;
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.clear();
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.sendKeys("" + Daily_Fixed_OtherAllowances);
			System.out.println("Monthly Fixed Other Allowances : " + Daily_Fixed_OtherAllowances);
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			Thread.sleep(3000);
			Daily_Fixed_OtherAllowances_Input = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value"));
			Daily_Fixed_OtherAllowances_Amount_calculated = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Amount.getText());

			if (Daily_Fixed_OtherAllowances_Amount_calculated == Daily_Fixed_OtherAllowances_Input) {
				System.out
						.println("Monthly Fixed Other Allowance Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println(
						"Monthly Other Allowance Value Calculated : " + Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("Values Are matched : Amount Calculated Correctly ");
				System.out.println("================================");

			} else {
				System.out.println("Monthly Other Allowance Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println(
						"Monthly Other Allowance Value Calculated : " + Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("****Error : Values are Not matched : Amount Not Calculated Correctly ");
				System.out.println("================================");
				// fail();
			}

			// Need to Implement
			// Daily_Fixed_OtherAllowances_Total=ObjectsReporsitory.Wage_otherAllowances_All_Amount.getText();

			Daily_Fixed_OtherAllowances_Total = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Total.getText());
			System.out.println("****Monthly Fixed Other Allowances Total : " + Daily_Fixed_OtherAllowances_Total);
			System.out.println("================================");

			Screenshot.Screenshotforscenario();

		}

		else {

			System.out.println("Wage ");
			Actions actions_Keys_esc = new Actions(DriverFactory.driver);
			actions_Keys_esc.sendKeys(Keys.ESCAPE);
			actions_Keys_esc.perform();
		}

		Thread.sleep(3000);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_post));
		ObjectsReporsitory.Wage_otherAllowances_post.click();

	}

	@Then("^Verify Total Provisional Earnings is displayed correctly$")
	public static void Verify_Total_Provisional_Earnings_is_displayed_correctly() throws Throwable {

		Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));
		Total_HRA = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_HRA.getAttribute("value"));
		Total_Provisional_Allowances = Integer
				.parseInt(ObjectsReporsitory.Wage_otherAllowances_Total_Provisional.getText());
		Wage_Total_Provisional = Integer.parseInt(ObjectsReporsitory.Wage_Total_Provisional.getText());

		Calculation = Total_Basic_Earnings + Total_HRA + Total_Provisional_Allowances;

		if (Calculation == Wage_Total_Provisional) {
			System.out.println("Total Provisional Earnings are calculated correctly");
			System.out.println("-------------------------------------------");
			System.out.println("Total Calculated Provisional Earnings :" + Calculation);
			System.out.println("Total Provisional Earnings displayed  :" + Wage_Total_Provisional);
			System.out.println("Total Provisional Earnings are calculated correctly");
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("Error : Provisional Earnings are not calculated correctly");
			System.out.println("Total Calculated Provisional Earnings :" + Calculation);
			System.out.println("Total Provisional Earnings displayed  :" + Wage_Total_Provisional);
			System.out.println("-------------------------------------------");
			// fail();
		}

	}

	@Then("^Verify user can be able to enter PF Deduction$")
	public static void Verify_user_can_be_able_to_enter_PF_Deduction() throws Throwable {

		Thread.sleep(5000);
		String checkbox_PF = ObjectsReporsitory.Wage_Deductions_PF_Checkbox.getAttribute("value");

		if (ConfigFileReader.getEnable_PF().equals("Yes")) {

			if (checkbox_PF.equals("true")) {

				System.out.println("PF is Enabled");
				System.out.println("----------------------------");

				Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
				Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));

				if (Wage_Payout_options_selected.equals("Daily")) {
					// float Daily_PF = (Daily_payout_Basic * 12) / 100;
					int min = 20;
					int max = 200;
					Random Daily_PF_random = new Random();
					int Daily_PF = Daily_PF_random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.clear();
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.sendKeys("" + Daily_PF);
					System.out.println("Daily PF Deduction :" + Daily_PF);
					Screenshot.Screenshotforscenario();
				}

				if (Wage_Payout_options_selected.equals("Monthly")) {
					// float Monthly_PF = (Monthly_payout_Basic * 12) / 100;
					int min = 50;
					int max = 400;
					Random Monthly_PF_Random = new Random();
					int Monthly_PF = Monthly_PF_Random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.clear();
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.sendKeys("" + Monthly_PF);
					System.out.println("Daily PF Deduction :" + Monthly_PF);
					Screenshot.Screenshotforscenario();
				}

			} else {
				System.out.println("PF is Not Enabled - Enabling PF");
				System.out.println("---------------------------------------");
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
				ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
				System.out.println("PF is Enabled");
				System.out.println("---------------------------------------");
				Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
				Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));

				if (Wage_Payout_options_selected.equals("Daily")) {
					// float Daily_PF = (Daily_payout_Basic * 12) / 100;
					int min = 20;
					int max = 200;
					Random Daily_PF_random = new Random();
					int Daily_PF = Daily_PF_random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.clear();
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.sendKeys("" + Daily_PF);
					System.out.println("Daily PF Deduction :" + Daily_PF);
					Screenshot.Screenshotforscenario();
				}

				if (Wage_Payout_options_selected.equals("Monthly")) {
					// float Monthly_PF = (Monthly_payout_Basic * 12) / 100;
					int min = 50;
					int max = 400;
					Random Monthly_PF_Random = new Random();
					int Monthly_PF = Monthly_PF_Random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.clear();
					ObjectsReporsitory.Wage_Deduction_PF.click();
					ObjectsReporsitory.Wage_Deduction_PF.sendKeys("" + Monthly_PF);
					System.out.println("Daily PF Deduction :" + Monthly_PF);
					Screenshot.Screenshotforscenario();
				}
			}

		} else {
			if (checkbox_PF.equals("true")) {
				System.out.println("PF is Enabled - Un-Checking PF");
				System.out.println("---------------------------------------");
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
				ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
				System.out.println("PF is Un-Checked");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("PF is Un-Checked");
				System.out.println("---------------------------------------");
			}

		}

		System.out.println("PF value Entered");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify user can be able to enter ESI Deduction$")
	public static void Verify_user_can_be_able_to_enter_ESI_Deduction() throws Throwable {
		String checkbox_ESI = ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.getAttribute("value");
		if (ConfigFileReader.getEnable_ESI().equals("Yes")) {

			if (checkbox_ESI.equals("true")) {

				System.out.println("ESI is Enabled");
				System.out.println("----------------------------");

				Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
				Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));

				if (Wage_Payout_options_selected.equals("Daily")) {
					// float Daily_ESI = (Daily_payout_Basic * 3) / 100;
					int min = 10;
					int max = 20;
					Random Daily_ESI_random = new Random();
					int Daily_ESI = Daily_ESI_random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.clear();
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.sendKeys("" + Daily_ESI);
					System.out.println("Daily PF Deduction :" + Daily_ESI);
					Screenshot.Screenshotforscenario();
				}

				if (Wage_Payout_options_selected.equals("Monthly")) {
					// float Monthly_ESI = (Monthly_payout_Basic * 3) / 100;
					int min = 10;
					int max = 20;
					Random Monthly_ESI_random = new Random();
					int Monthly_ESI = Monthly_ESI_random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.clear();
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.sendKeys("" + Monthly_ESI);
					System.out.println("Daily ESI Deduction :" + Monthly_ESI);
					Screenshot.Screenshotforscenario();
				}

			} else {
				System.out.println("ESI is Not Enabled - Enabling ESI");
				System.out.println("---------------------------------------");
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_ESI_Checkbox));
				ObjectsReporsitory.Wage_Deductions_ESI_Checkbox.click();
				System.out.println("ESI is Enabled");
				System.out.println("---------------------------------------");
				Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
				Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));

				if (Wage_Payout_options_selected.equals("Daily")) {
					// float Daily_ESI = (Daily_payout_Basic * 3) / 100;
					int min = 10;
					int max = 20;
					Random Daily_ESI_random = new Random();
					int Daily_ESI = Daily_ESI_random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.clear();
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.sendKeys("" + Daily_ESI);
					System.out.println("Daily PF Deduction :" + Daily_ESI);
					Screenshot.Screenshotforscenario();
				}

				if (Wage_Payout_options_selected.equals("Monthly")) {
					// float Monthly_ESI = (Monthly_payout_Basic * 3) / 100;
					int min = 10;
					int max = 20;
					Random Monthly_ESI_random = new Random();
					int Monthly_ESI = Monthly_ESI_random.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.clear();
					ObjectsReporsitory.Wage_Deduction_ESI.click();
					ObjectsReporsitory.Wage_Deduction_ESI.sendKeys("" + Monthly_ESI);
					System.out.println("Daily ESI Deduction :" + Monthly_ESI);
					Screenshot.Screenshotforscenario();
				}

			}

		} else {

			if (checkbox_ESI.equals("true")) {
				System.out.println("ESI is Enabled - Un-Checking PF");
				System.out.println("---------------------------------------");
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
				ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
				System.out.println("ESI is Un-Checked");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("ESI is Un-Checked");
				System.out.println("---------------------------------------");
			}
		}

		System.out.println("ESI value ENtered");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify user can be able to enter Professional Tax Deduction$")
	public static void Verify_user_can_be_able_to_enter_PT_Deduction() throws Throwable {
		String checkbox_PT = ObjectsReporsitory.Wage_Deductions_PT_Checkbox.getAttribute("value");
		if (ConfigFileReader.getEnable_ProfessionalTax().equals("Yes")) {

			if (checkbox_PT.equals("true")) {

				System.out.println("ProfessionalTax is Enabled");
				System.out.println("----------------------------");

				Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
				Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));

				if (Wage_Payout_options_selected.equals("Daily")) {
					int min = 2;
					int max = 20;
					Random Professional_Tax = new Random();
					Daily_Professional_Tax = Professional_Tax.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.clear();
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.sendKeys("" + Daily_Professional_Tax);
					System.out.println("Daily Professional Tax Deduction :" + Daily_Professional_Tax);
					Screenshot.Screenshotforscenario();
				}

				if (Wage_Payout_options_selected.equals("Monthly")) {
					int min = 20;
					int max = 200;
					Random Professional_Tax = new Random();
					Monthly_Professional_Tax = Professional_Tax.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.clear();
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.sendKeys("" + Monthly_Professional_Tax);
					System.out.println("Monthly Professional Tax Deduction :" + Monthly_Professional_Tax);
					Screenshot.Screenshotforscenario();
				}
			} else {
				System.out.println("Professional Tax is Not Enabled - Enabling PT");
				System.out.println("---------------------------------------");
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PT_Checkbox));
				ObjectsReporsitory.Wage_Deductions_PT_Checkbox.click();
				System.out.println("Professional Tax is Enabled");
				System.out.println("---------------------------------------");
				Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
				Total_Basic_Earnings = Integer.parseInt(ObjectsReporsitory.Wage_Earnings_Basic.getAttribute("value"));

				if (Wage_Payout_options_selected.equals("Daily")) {
					int min = 2;
					int max = 20;
					Random Professional_Tax = new Random();
					Daily_Professional_Tax = Professional_Tax.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.clear();
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.sendKeys("" + Daily_Professional_Tax);
					System.out.println("Daily Professional Tax Deduction :" + Daily_Professional_Tax);
					Screenshot.Screenshotforscenario();
				}

				if (Wage_Payout_options_selected.equals("Monthly")) {
					int min = 20;
					int max = 200;
					Random Professional_Tax = new Random();
					Monthly_Professional_Tax = Professional_Tax.nextInt(max - min) + min;
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.clear();
					ObjectsReporsitory.Wage_Deduction_PT.click();
					ObjectsReporsitory.Wage_Deduction_PT.sendKeys("" + Monthly_Professional_Tax);
					System.out.println("Monthly Professional Tax Deduction :" + Monthly_Professional_Tax);
					Screenshot.Screenshotforscenario();
				}
			}

		} else {

			if (checkbox_PT.equals("true")) {
				System.out.println("Professional Tax Checkbox is Enabled - Un-Checking PF");
				System.out.println("---------------------------------------");
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Deductions_PF_Checkbox));
				ObjectsReporsitory.Wage_Deductions_PF_Checkbox.click();
				System.out.println("Professional Tax Checkbox is Un-Checked");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("Professional Tax Checkbox is Un-Checked");
				System.out.println("---------------------------------------");
			}
		}
		System.out.println("Professional tax value ENtered");
		System.out.println("----------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify user can be able to Other Recoveries in Deduction$")
	public static void Verify_user_can_be_able_to_Other_Recoveries_in_Deduction() throws Throwable {

		Actions actions1239 = new Actions(DriverFactory.driver);
		actions1239.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions1239.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

		Wage_Payout_options_selected = ObjectsReporsitory.Wage_Payout_options_selected.getText();
		ObjectsReporsitory.Wage_otherrecoveries.click();
		Thread.sleep(5000);

		if (Wage_Payout_options_selected.equals("Daily")) {

			int Record_Count = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size();
			System.out.println("Record Count Size : " + Record_Count);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_Reason));
			System.out.println("Entering Daily Fixed Other Recoveries Reason");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			ObjectsReporsitory.Wage_otherAllowances_Reason.clear();
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();

			List<WebElement> Wage_otherAllowances_Reason_allEmelemnts = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts;
			Random rand_otherAllowances_Reason = new Random();
			int otherAllowances_Reason = rand_otherAllowances_Reason
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts.size());
			Selected_otherAllowances_Reason = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts
					.get(otherAllowances_Reason).getText();

			for (WebElement webElement : Wage_otherAllowances_Reason_allEmelemnts) {
				if (webElement.getText().equals(Selected_otherAllowances_Reason)) {
					webElement.click();
					System.out.println("Daily Fixed Other Recoveries for :" + Selected_otherAllowances_Reason);
					System.out.println("=========================================================");
					break;
				}
			}

			Thread.sleep(3000);
			System.out.println("Selecting Daily Fixed Other Recoveries Type as : Fixed");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Type_Fixed.click();
			System.out.println("Daily Fixed Other Recoveries Type as Fixed selected");
			System.out.println("================================");
			Thread.sleep(3000);
			System.out.println("Selecting Daily Fixed Other Recoveries Dependent");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_dependent.click();

			List<WebElement> Wage_otherAllowances_dependent_allElements = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts;
			Random rand_otherAllowances_dependent = new Random();
			int otherAllowances_dependent = rand_otherAllowances_dependent
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size());
			Selected_otherAllowances_dependent = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts
					.get(otherAllowances_dependent).getText();

			for (WebElement webElement : Wage_otherAllowances_dependent_allElements) {
				if (webElement.getText().equals(Selected_otherAllowances_dependent)) {
					webElement.click();
					System.out.println(
							"Daily Fixed Other Recoveries Dependent of :" + Selected_otherAllowances_dependent);
					System.out.println("=========================================================");
					break;
				}
			}

			System.out.println("Entering Daily Fixed other Recoveries Value");
			System.out.println("================================");

			int min = 10;
			int max = 100;
			Random rand_Daily_otherAllowances = new Random();
			Daily_Fixed_OtherAllowances = rand_Daily_otherAllowances.nextInt(max - min) + min;
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.clear();
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.sendKeys("" + Daily_Fixed_OtherAllowances);
			System.out.println("Daily Fixed Other Recoveries Value : " + Daily_Fixed_OtherAllowances);
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			Thread.sleep(3000);
			Daily_Fixed_OtherAllowances_Input = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value"));
			Daily_Fixed_OtherAllowances_Amount_calculated = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Amount.getText());

			if (Daily_Fixed_OtherAllowances_Amount_calculated == Daily_Fixed_OtherAllowances_Input) {
				System.out.println("Daily Fixed Other Allowance Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println("Daily Fixed Other Allowance Value Calculated : "
						+ Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println(
						"Daily Fixed other Recoveries Values Are matched : Recoveries Amount Calculated Correctly ");
				System.out.println("================================");

			} else {
				System.out.println("Daily Fixed Other Allowance Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println("Daily Fixed Other Allowance Value Calculated : "
						+ Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("****Error : Values are Not matched : Recoveries Amount Not Calculated Correctly ");
				System.out.println("================================");
				// fail();
			}

			// Need to Implement
//			List<WebElement> Wage_otherAllowances_Amount_Calculated_AllAmount = ObjectsReporsitory.Wage_otherAllowances_Amount_Calculated_AllAmount;
//			for(int i = 0 ; i <Wage_otherAllowances_Amount_Calculated_AllAmount.size() ; i ++) {
//				
//			}
//			
			// Daily_Fixed_OtherAllowances_Total=ObjectsReporsitory.Wage_otherAllowances_All_Amount.getText();

			Daily_Fixed_OtherAllowances_Total = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Total.getText());
			System.out.println("****Daily Fixed Other Recoveries Total : " + Daily_Fixed_OtherAllowances_Total);
			System.out.println("================================");
			Screenshot.Screenshotforscenario();

		} else if (Wage_Payout_options_selected.equals("Monthly")) {
			int Record_Count = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size();
			System.out.println("Record Count Size : " + Record_Count);

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_Reason));
			System.out.println("Entering Monthly Fixed Other Recoveries Reason ");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			ObjectsReporsitory.Wage_otherAllowances_Reason.clear();
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();

			List<WebElement> Wage_otherAllowances_Reason_allEmelemnts = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts;
			Random rand_otherAllowances_Reason = new Random();
			int otherAllowances_Reason = rand_otherAllowances_Reason
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts.size());
			Selected_otherAllowances_Reason = ObjectsReporsitory.Wage_otherAllowances_Reason_allEmelemnts
					.get(otherAllowances_Reason).getText();

			for (WebElement webElement : Wage_otherAllowances_Reason_allEmelemnts) {
				if (webElement.getText().equals(Selected_otherAllowances_Reason)) {
					webElement.click();
					System.out.println("Monthly Fixed Other Recoveries for :" + Selected_otherAllowances_Reason);
					System.out.println("=========================================================");
					break;
				}
			}

			Thread.sleep(3000);
			System.out.println("Selecting Monthly Fixed Other Recoveries Type as Fixed");
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Type_Fixed.click();
			System.out.println("Monthly Fixed Other Recoveries Type as Fixed selected");
			System.out.println("================================");
			Thread.sleep(3000);
			System.out.println("Selecting Monthly Fixed Other Recoveries Dependent");
			System.out.println("================================");

			ObjectsReporsitory.Wage_otherAllowances_dependent.click();

			List<WebElement> Wage_otherAllowances_dependent_allElements = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts;
			Random rand_otherAllowances_dependent = new Random();
			int otherAllowances_dependent = rand_otherAllowances_dependent
					.nextInt(ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts.size());
			Selected_otherAllowances_dependent = ObjectsReporsitory.Wage_otherAllowances_dependent_allEmelemnts
					.get(otherAllowances_dependent).getText();

			for (WebElement webElement : Wage_otherAllowances_dependent_allElements) {
				if (webElement.getText().equals(Selected_otherAllowances_dependent)) {
					webElement.click();
					System.out.println(
							"Monthly Fixed Other Recoveries Dependent of :" + Selected_otherAllowances_dependent);
					System.out.println("=========================================================");
					break;
				}
			}

			System.out.println("Entering Fixed Monthly other Recoveriess");
			System.out.println("================================");

			int min = 10;
			int max = 500;
			Random rand_Daily_otherAllowances = new Random();
			Daily_Fixed_OtherAllowances = rand_Daily_otherAllowances.nextInt(max - min) + min;
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.clear();
			ObjectsReporsitory.Wage_otherAllowances_value.click();
			ObjectsReporsitory.Wage_otherAllowances_value.sendKeys("" + Daily_Fixed_OtherAllowances);
			System.out.println("Monthly Fixed Other Recoveries : " + Daily_Fixed_OtherAllowances);
			System.out.println("================================");
			ObjectsReporsitory.Wage_otherAllowances_Reason.click();
			Thread.sleep(3000);
			Daily_Fixed_OtherAllowances_Input = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_value.getAttribute("value"));
			Daily_Fixed_OtherAllowances_Amount_calculated = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Amount.getText());

			if (Daily_Fixed_OtherAllowances_Amount_calculated == Daily_Fixed_OtherAllowances_Input) {
				System.out
						.println("Monthly Fixed Other Recoveries Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println(
						"Monthly Other Recoveries Value Calculated : " + Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("Values Are matched : Amount Calculated Correctly ");
				System.out.println("================================");

			} else {
				System.out.println("Monthly Other Recoveries Value Entered : " + Daily_Fixed_OtherAllowances_Input);
				System.out.println(
						"Monthly Other Recoveries Value Calculated : " + Daily_Fixed_OtherAllowances_Amount_calculated);
				System.out.println("****Error : Values are Not matched : Recoveries Amount Not Calculated Correctly ");
				System.out.println("================================");
				// fail();
			}

			// Need to Implement
			// Daily_Fixed_OtherAllowances_Total=ObjectsReporsitory.Wage_otherAllowances_All_Amount.getText();

			Daily_Fixed_OtherAllowances_Total = Integer
					.parseInt(ObjectsReporsitory.Wage_otherAllowances_Total.getText());
			System.out.println("****Monthly Fixed Other Recoveries Total : " + Daily_Fixed_OtherAllowances_Total);
			System.out.println("================================");

			Screenshot.Screenshotforscenario();

		}

		else {

			System.out.println("Wage ");
			Actions actions_Keys_esc = new Actions(DriverFactory.driver);
			actions_Keys_esc.sendKeys(Keys.ESCAPE);
			actions_Keys_esc.perform();
		}

		Thread.sleep(3000);
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_otherAllowances_post));
		ObjectsReporsitory.Wage_otherAllowances_post.click();

	}

	@Then("^Verify Total Provisional Deductions is displayed correctly$")
	public static void Verify_Total_Provisional_Deductions_is_displayed_correctly() throws Throwable {

		Total_PF = Integer.parseInt(ObjectsReporsitory.Wage_Deduction_PF_value.getAttribute("value"));
		Total_ESI = Integer.parseInt(ObjectsReporsitory.Wage_Deduction_ESI_value.getAttribute("value"));
		Total_PT = Integer.parseInt(ObjectsReporsitory.Wage_Deduction_PT_value.getAttribute("value"));
		Total_Recoveries = Integer.parseInt(ObjectsReporsitory.Wage_Deduction_Other_Recoveries_value.getText());
		Provisional_Deductions = Integer
				.parseInt(ObjectsReporsitory.Wage_Deduction_Professional_Deduction_value.getText());

		Calculation = Total_PF + Total_ESI + Total_PT + Total_Recoveries;

		if (Calculation == Provisional_Deductions) {
			System.out.println("Total Provisional Deduction are calculated correctly");
			System.out.println("-------------------------------------------");
			System.out.println("Total Calculated Provisional Deduction :" + Calculation);
			System.out.println("Total Provisional Deduction displayed  :" + Provisional_Deductions);
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("Error : Provisional Deductions are not calculated correctly");
			System.out.println("Total Calculated Provisional Deduction :" + Calculation);
			System.out.println("Total Provisional Deduction displayed  :" + Provisional_Deductions);
			System.out.println("-------------------------------------------");
			// fail();
		}
	}

	@Then("^Verify Total Wage amount is displayed correctly$")
	public static void Verify_Total_Wage_amount_is_displayed_correctly() throws Throwable {

		Wage_Total_Provisional2 = Integer.parseInt(ObjectsReporsitory.Wage_Total_Provisional.getText());
		Provisional_Deductions2 = Integer
				.parseInt(ObjectsReporsitory.Wage_Deduction_Professional_Deduction_value.getText());
		Wage_Total = Integer.parseInt(ObjectsReporsitory.Wage_Total.getText());

		Calculation2 = Wage_Total_Provisional2 - Provisional_Deductions2;

		if (Calculation2 == Wage_Total) {
			System.out.println("Total Wage Amount is calculated correctly");
			System.out.println("-------------------------------------------");
			System.out.println("Total Wage Amount :" + Wage_Total);
			System.out.println("Total Calculated Provisional Earnings :" + Wage_Total_Provisional2);
			System.out.println("Total Calculated Provisional Deduction :" + Provisional_Deductions2);
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("Total Wage Amount is not calculated correctly");
			System.out.println("Total Wage Amount :" + Wage_Total);
			System.out.println("Total Calculated Provisional Deduction :" + Calculation);
			System.out.println("Total Provisional Deduction displayed  :" + Provisional_Deductions);
			System.out.println("-------------------------------------------");
			// fail();
		}

	}

	@Then("^Verify user can be able to save Wage details$")
	public static void Verify_user_can_be_able_to_save_Wage_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Wage_Submit));
		ObjectsReporsitory.Wage_Submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_Handle2();

	}

	@Then("^Verify user can be able to select workmen profile for Wage Validation$")
	public static void Verify_User_can_be_able_to_select_workmen_for_wage_Validation() throws Throwable {

		Actions actions333 = new Actions(DriverFactory.driver);
		actions333.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions333.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);

	}

}
