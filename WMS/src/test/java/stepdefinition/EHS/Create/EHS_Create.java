package stepdefinition.EHS.Create;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic_Details.Create.Submit_Workman_Details;
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

public class EHS_Create {

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
	public EHS_Create() {
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

	@Given("^Login and Navigate to EHS$")
	public static void Login_and_Navigate_to_Paramedics() throws Throwable {

		Login.Use_Login_Induction_EHS();
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
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
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
				} else {
					System.out.println("No Workmen Found in MedicalTest");
					System.out.println("Error : completed MedicalTest Record is not displayed in EHS");
				}

			}
//IF NOT FOUND IN Medical Test		
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
					MedicalTest_Card_Count = Skill_Analysis_Objects.MedicalTest_Card_Count.size();
					System.out.println("Workmen Count in MedicalTest : " + MedicalTest_Card_Count);
					if (MedicalTest_Count == MedicalTest_Card_Count) {
						System.out.println("MedicalTest Count & Workman Cards Count Matched");
					} else {
						System.out.println("MedicalTest Count & Workman Cards Count Not - Matched");
					}
					if (MedicalTest_Card_Count > 0) {
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MedicalTest_First_card));

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
						} else {
							System.out.println("No Workmen Found in MedicalTest");
							System.out.println("Error : completed MedicalTest Record is not displayed in EHS");
						}

					} else {
						System.out.println("Navigated to MedicalTest");
						System.out.println("Error : completed Paramedics Records is not displayed in MedicalTest");
					}
				}

//IF NOT FOUND IN Paramedics				
				else {

					System.out.println("No Workmen Found in Paramedics");
					System.out.println("Enrolling Workmen for Paramedics from Skill Analysis");
					ObjectsReporsitory.WMS_induction.click();
					wait.until(
							ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Dashboard_Skill_Analysis));
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
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
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
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
						Thread.sleep(5000);
						ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Paramedics_Count);
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
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
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
								MedicalTest_Create.Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status();
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
								System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
								String Current_job3 = ObjectsReporsitory.Induction_Jobcode.getText();
								if (Current_job3.equals(ConfigFileReader.getJob_LE180046())) {
									System.out
											.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
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
									wait.until(
											ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
									System.out.println("Navigated to EHS");
								} else {
									System.out.println("Error : completed MedicalTest Record is not displayed in EHS");
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
//IF NOT FOUND IN Skill	
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
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
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
						wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
						Thread.sleep(5000);
						ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Paramedics_Count);
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
							wait.until(
									ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_medicalTest));
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
								MedicalTest_Create.Verify_the_user_can_be_able_to_add_workmen_medical_fitness_status();
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
								System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
								String Current_job3 = ObjectsReporsitory.Induction_Jobcode.getText();
								if (Current_job3.equals(ConfigFileReader.getJob_LE180046())) {
									System.out
											.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
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
									wait.until(
											ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
									System.out.println("Navigated to EHS");
								} else {
									System.out.println("Error : completed MedicalTest Records is not displayed in EHS");
								}

							} else {
								System.out.println(
										"Error : completed Paramedics , Medical Test Records is not displayed in EHS");
							}
						}

//IF NOT FOUND IN Paramedics				
						else {
							System.out.println(
									"Error : Entrolled workmen & completed Skill , Paramedics , Medical Test Records is not displayed in EHS");
						}

					}
				}
			}
		}
	}

	@Then("^Verify User can be able to View Workmen profile EHS$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile_EHS() throws Throwable {
		Actions actions108 = new Actions(DriverFactory.driver);
		actions108.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions108.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		String Workmanname = ObjectsReporsitory.EHS_ProfileCard_Workmenname.getText();
		String WorkmanNumber = ObjectsReporsitory.EHS_ProfileCard_Workmennumber.getText();
		String WorkmenPartner = ObjectsReporsitory.EHS_ProfileCard_WorkmenPartnerDetails.getText();
		String WorkmenSkill = ObjectsReporsitory.EHS_ProfileCard_WorkmenSkill.getText();
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

		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);

	}

	@Then("^Verify user can be able to select workmen profile for EHS training$")
	public static void Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training() throws Throwable {
		if (ConfigFileReader.getEHS_training_all().equals("No")) {
			if (EHS_Card_Count > 3) {
				Basic.PageLoader_Validation();
				System.out.println("Selecting 2 Workmen Profile for EHS Training");
				Actions actions109 = new Actions(DriverFactory.driver);
				actions109.moveToElement(ObjectsReporsitory.EHS_First_card);
				actions109.perform();
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
				((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
						ObjectsReporsitory.EHS_First_card);
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_secound_card));
				((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
						ObjectsReporsitory.EHS_secound_card);
				Thread.sleep(3000);
			} else {
				Basic.PageLoader_Validation();
				System.out.println("Selecting 1 Workmen Profile for EHS Training");
				Actions actions110 = new Actions(DriverFactory.driver);
				actions110.moveToElement(ObjectsReporsitory.EHS_First_card);
				actions110.perform();
				// ((JavascriptExecutor)
				// DriverFactory.driver).executeScript("arguments[0].click();",ObjectsReporsitory.EHS_First_card);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_First_card));
				ObjectsReporsitory.EHS_First_card.click();
			}
		} else if (ConfigFileReader.getEHS_training_all().equals("Yes")) {

			Basic.PageLoader_Validation();
			System.out.println("Selecting All Workmen Profile for EHS Training");
			Actions actions111 = new Actions(DriverFactory.driver);
			actions111.moveToElement(ObjectsReporsitory.EHS_ProfileCard_SelectAll);
			actions111.perform();
//			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
//					ObjectsReporsitory.EHS_ProfileCard_SelectAll);
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_ProfileCard_SelectAll));
			ObjectsReporsitory.EHS_ProfileCard_SelectAll.click();
			// ObjectsReporsitory.EHS_ProfileCard_SelectAll.click();
			wait.until(ExpectedConditions.visibilityOf(ObjectsReporsitory.Menu_workmenManagementSystem));
		} else {
			System.out.println("Unable to Select Workmen");
		}
		EHS_SelectedProfileforTraining = ObjectsReporsitory.EHS_SelectedWorkmenProfile.size();
		System.out.println(EHS_SelectedProfileforTraining + " Workmen is Slected for Trainig Program");

	}

	@Then("^Verify user can be able to select Training Program$")
	public static void Verify_user_can_be_able_to_select_Training_Program() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_SelectTrainingProgram));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.EHS_SelectTrainingProgram);
		// ObjectsReporsitory.EHS_SelectTrainingProgram.click();
		// EHS_Selected_Workmen_Count=
		// Integer.parseInt(ObjectsReporsitory.EHS_Selected_Workmen_Count_tab.getText().substring(ObjectsReporsitory.EHS_Selected_Workmen_Count_tab.getText().length()
		// - 1));
		// System.out.println("Selected Workmen Count : " + EHS_Selected_Workmen_Count);
		System.out.println(ObjectsReporsitory.EHS_Selected_Workmen_Count_tab.getText());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_Submit_taining));
//		if(EHS_Selected_Workmen_Count==EHS_SelectedProfileforTraining) {
//			System.out.println("Workmen selected for Training Program is Count matched ");
//		}
//		else {
//			System.out.println("Error : Workmen selected for Training Program is Not matched ");
//			System.out.println("************************************************************* ");
//			//fail();
//		}

	}

	@Then("^Verify user can be able to Submit Trainings$")
	public static void Verify_user_can_be_able_to_Submit_Trainings() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_Submit_taining));
		Thread.sleep(5000);
		Random rand = new Random();
		int Training_Program = rand.nextInt(ObjectsReporsitory.EHS_TrainingProgram_CheckBox.size());
		ObjectsReporsitory.EHS_TrainingProgram_CheckBox.get(Training_Program).click();
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_Submit_taining));
		ObjectsReporsitory.EHS_Submit_taining.click();
		Basic.PageLoader_Validation();
		Basic.popup_handle();
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify user can be able to view Trainig Program$")
	public static void Verify_user_can_be_able_to_view_Trainig_Program() throws Throwable {

		if (EHS_Card_Count == 0) {

			System.out.println("No Workmen Available for EHS Training ");

		} else {

			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_training_history));
			ObjectsReporsitory.EHS_training_history.click();

			// ********************

			System.out.println(
					"EHS Training History Count:" + Skill_Analysis_Objects.Profile_Skill_History_Description.size());

			if (ObjectsReporsitory.EHS_TrainingHistory_Skill_Description.size() > 0) {

				List<WebElement> searchResult = ObjectsReporsitory.EHS_TrainingHistory_Skill_Description;
				String Skill_Description = searchResult.get((searchResult.size() - 1)).getText();
				System.out.println("EHS Training History Skill Description : " + Skill_Description);

				List<WebElement> searchResult2 = ObjectsReporsitory.EHS_TrainingHistory_Job;
				String Job = searchResult2.get((searchResult2.size() - 1)).getText();
				System.out.println("Job : " + Job);

				List<WebElement> searchResult3 = ObjectsReporsitory.EHS_TrainingHistory_TrainingDate;
				String Skill_Description3 = searchResult3.get((searchResult3.size() - 1)).getText();
				System.out.println("Training Date : " + Skill_Description3);

			} else {
				System.out.println("Workmen EHS Training Not completed Yet ");
			}
			Screenshot.Screenshotforscenario();
			Skill_Analysis_Objects.EHS_TrainingHistory_Close.click();
			Thread.sleep(5000);
		}

	}

	@Then("^Verify user can be able to select workmen profile for EHS safty training Validation$")
	public static void Verify_user_can_be_able_to_select_workmen_profile_for_EHS_training_Validation()
			throws Throwable {

		System.out.println("Selecting 1 Workmen Profile for EHS Training");
		Actions actions110 = new Actions(DriverFactory.driver);
		actions110.moveToElement(ObjectsReporsitory.EHS_First_card);
		actions110.perform();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.EHS_First_card);

		EHS_SelectedProfileforTraining = ObjectsReporsitory.EHS_SelectedWorkmenProfile.size();
		System.out.println(EHS_SelectedProfileforTraining + " Workmen is Slected for Trainig Program");

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_SelectTrainingProgram));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.EHS_SelectTrainingProgram);

		System.out.println("Selected Workmen Count : " + ObjectsReporsitory.EHS_Selected_Workmen_Count_tab.getText());
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.EHS_Submit_taining));
	}
}
