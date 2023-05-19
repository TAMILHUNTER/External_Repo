package stepdefinition.Paramedics.Create;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic_Details.Create.Submit_Workman_Details;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import stepdefinition.SkillAnalysis.Create.Skill_Analysis_Create;
import stepdefinition.Basic;
import stepdefinition.Login;
import stepdefinition.Screenshot;
import stepdefinition.Workmen_Search.Workman_Search;
import utils.DriverFactory;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import io.cucumber.java.en.Given;

public class Paramedics_Create {

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
	public Paramedics_Create() {
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

	@Given("^Login and Navigate to Paramedics$")
	public static void Login_and_Navigate_to_Paramedics() throws Throwable {

		Login.Use_Login_Induction_Paramedics();
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
		} else {
			System.out.println("No Workmen Found in Paramedics");
			System.out.println("Enroll Workmen for Paramedics from Skill Analysis");
			ObjectsReporsitory.WMS_induction.click();
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Dashboard_Skill_Analysis));
			Skill_Analyisis_Count = Integer.parseInt(Skill_Analysis_Objects.Dashboard_Skill_Analysis_Count.getText());
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
				ObjectsReporsitory.WMS_induction.click();
				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_paramedics));
				Thread.sleep(5000);
				ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Dashboard_Paramedics_Count);
				ObjectsReporsitory.Induction_paramedics.click();
				Paramedics_Card_Count = Skill_Analysis_Objects.Dashboard_Paramedics_Card.size();
				System.out.println("Workmen Count in Paramedics : " + Paramedics_Card_Count);
				if (Paramedics_Card_Count > 0) {
					wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_First_card));
					System.out.println("Navigated to Pramedics");
				} else {
					System.out.println("Error : completed SKill Analysis Records is not displayed in Paramedics");
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
				Login.Logout();
				Login.Use_Login_Induction_Paramedics();
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
				ObjectsReporsitory.Home_accessBasedMenu.click();
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
				ObjectsReporsitory.Menu_workmenManagementSystem.click();
				ObjectsReporsitory.Menu_workmenManagementSystem_WMS40.click();
				ObjectsReporsitory.WMS_induction.click();
				Thread.sleep(5000);
				System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
				String Current_job1 = ObjectsReporsitory.Induction_Jobcode.getText();
				if (Current_job1.equals(ConfigFileReader.getJob_LE180046())) {
					System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
				} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
					SwitchJob_Create.SwitchJob_LE180046();
				}
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
				} else {
					System.out.println(
							"Error : Entrolled workmen and completed SKill Analysis Records is not displayed in Paramedics");
					// fail();
				}
			}
		}
	}

	@Then("^Verify User can be able to View Workmen profile_Paramedics$")
	public static void Verify_User_can_be_able_to_View_Workmen_profile_Paramedics() throws Throwable {

		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		String Workmanname = ObjectsReporsitory.Paramedics_ProfileCard_Workmenname.getText();
		String WorkmanNumber = ObjectsReporsitory.Paramedics_ProfileCard_Workmennumber.getText();
		String WorkmenPartner = ObjectsReporsitory.Paramedics_ProfileCard_WorkmenPartnerDetails.getText();
		String WorkmenSkill = ObjectsReporsitory.Paramedics_ProfileCard_WorkmenSkill.getText();
		System.out.println("Workmen Name : " + Workmanname);
		System.out.println("Workmen Number : " + WorkmanNumber);
		System.out.println("Partner Name : " + WorkmenPartner);
		System.out.println("Workmen Skill : " + WorkmenSkill);
		Screenshot.Screenshotforscenario();
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye);
		Basic.PageLoader_Validation();
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
//		Actions actions_Keys = new Actions(DriverFactory.driver);
//		actions_Keys.sendKeys(Keys.ESCAPE);	actions_Keys.perform();

		wait.until(
				ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Close.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();

	}

	@Then("^Verify User can be able to Enter Medical Examination Date$")
	public static void Verify_User_can_be_able_to_Enter_Medical_Examination_Date() throws Throwable {
//		Actions actions545 = new Actions(DriverFactory.driver);
//		actions545.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card_Para);
//		actions545.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card_Para.click();
		Thread.sleep(4000);
		Skill_Analysis_Objects.Skill_Analysis_RetestDate_calender.click();
		Thread.sleep(4000);
		if (Skill_Analysis_Objects.Paramedics_MedicalTestDate_Size.size() > 0) {
			Actions actions222 = new Actions(DriverFactory.driver);
			actions222.moveToElement(Skill_Analysis_Objects.Paramedics_MedicalTestDate);
			actions222.perform();
			wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Paramedics_MedicalTestDate));
			Skill_Analysis_Objects.Paramedics_MedicalTestDate.click();
			System.out.println("Medical Exam date selected from 15 Days after Today");
		} else if (Skill_Analysis_Objects.Paramedics_MedicalTestDate_Size.size() == 0) {
			if (Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week_Size.size() > 0) {
				Actions actions222 = new Actions(DriverFactory.driver);
				actions222.moveToElement(Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week);
				actions222.perform();
				wait.until(ExpectedConditions
						.elementToBeClickable(Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week));
				Skill_Analysis_Objects.Paramedics_MedicalTestDate_Week.click();
				System.out.println("Medical Exam date selected from 15 Days after Today");
			}
		}

	}

	@Then("^Verify User can be able to add paramedics details$")
	public static void Verify_User_can_be_able_to_add_Paramedics_details() throws Throwable {

		int min_skintemp = 96;
		int max_skintemp = 102;
		Random rand = new Random();
		Random_skintemp = rand.nextInt(max_skintemp - min_skintemp) + min_skintemp;

		int min_diabetics = 140;
		int max_diabetics = 200;
		Random rand2 = new Random();
		Random_diabetics = rand2.nextInt(max_diabetics - min_diabetics) + min_diabetics;

		int min_spo2 = 80;
		int max_spo2 = 100;
		Random rand3 = new Random();
		Random_spo2 = rand3.nextInt(max_spo2 - min_spo2) + min_spo2;

		int min_systolic = 80;
		int max_systolic = 120;
		Random rand4 = new Random();
		Random_systolic = rand4.nextInt(max_systolic - min_systolic) + min_systolic;

		int min_diastolic = 60;
		int max_diastolic = 90;
		Random rand5 = new Random();
		Random_diastolic = rand5.nextInt(max_diastolic - min_diastolic) + min_diastolic;

		int min_Height = 145;
		int max_Height = 180;
		Random rand6 = new Random();
		Random_Height = rand6.nextInt(max_Height - min_Height) + min_Height;

		int min_Weight = 50;
		int max_Weight = 90;
		Random rand7 = new Random();
		Random_Weight = rand7.nextInt(max_Weight - min_Weight) + min_Weight;

		double height_meter = Random_Height / 100;

		double BMI = Random_Weight / (height_meter * height_meter);

		int min_heartrate = 60;
		int max_heartrate = 170;
		Random rand8 = new Random();
		Random_heartrate = rand8.nextInt(max_heartrate - min_heartrate) + min_heartrate;

		ObjectsReporsitory.Paramedics_SkinTemp.sendKeys(Random_skintemp + "°F");
		ObjectsReporsitory.Paramedics_colorofEyes
				.sendKeys(ConfigFileReader.getcolorsofeyes() + " " + RandomString.make(10));
		ObjectsReporsitory.Paramedics_Complexion
				.sendKeys(ConfigFileReader.getcomplexion() + " " + RandomString.make(10));
		ObjectsReporsitory.Paramedics_HeartRate.sendKeys(Random_heartrate + "bpm");
		ObjectsReporsitory.Paramedics_Diabetics.sendKeys(Random_diabetics + "mg/dL");
		ObjectsReporsitory.Paramedics_SPO2.sendKeys(Random_spo2 + "%");
		ObjectsReporsitory.Paramedics_Systolic.sendKeys(Random_systolic + "mm Hg");
		ObjectsReporsitory.Paramedics_Diastolic.sendKeys(Random_diastolic + "mm Hg");
		ObjectsReporsitory.Paramedics_Height.sendKeys(Random_Height + "cm");
		ObjectsReporsitory.Paramedics_weight.sendKeys(Random_Weight + "kg");
		ObjectsReporsitory.Paramedics_BMI.sendKeys(BMI + "kg/m2");
		ObjectsReporsitory.Paramedics_IDMark1
				.sendKeys(ConfigFileReader.getidendificationmark1() + " " + RandomString.make(10));
		ObjectsReporsitory.Paramedics_IDMark2
				.sendKeys(ConfigFileReader.getidendificationmark2() + " " + RandomString.make(10));

		System.out.println("Paramedics_Skin Temp : " + Random_skintemp + "°F");
		System.out.println("Color of Eyes : " + ObjectsReporsitory.Paramedics_colorofEyes.getAttribute("value"));
		System.out.println("Complexion : " + ObjectsReporsitory.Paramedics_Complexion.getAttribute("value"));
		System.out.println("Paramedics_Diabetics : " + Random_diabetics + "mg/dL");
		System.out.println("Paramedics_SPO2 : " + Random_spo2 + "%");
		System.out.println("Paramedics_Systolic : " + Random_systolic + "mm Hg");
		System.out.println("Paramedics_Diastolic : " + Random_diastolic + "mm Hg");
		System.out.println("Paramedics_Height : " + Random_Height + "cm");
		System.out.println("Paramedics_weight : " + Random_Weight + "kg");
		System.out.println("Paramedics_BMI : " + BMI + "kg/m2");
		System.out.println("Paramedics_IDMark1 : " + ObjectsReporsitory.Paramedics_IDMark1.getAttribute("value"));
		System.out.println("Paramedics_IDMark2 : " + ObjectsReporsitory.Paramedics_IDMark2.getAttribute("value"));
		System.out.println("Paramedics_HeartRate : " + Random_heartrate + "bpm");

	}

	@Then("^Verify User can be able to save paramedics details$")
	public static void Verify_User_can_be_able_to_save_Paramedics_details() throws Throwable {
		Screenshot.Screenshotforscenario();
		ObjectsReporsitory.Paramedics_submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.PageLoader_Validation();
		Basic.popup_handle();
		Thread.sleep(5000);
	}

	@Then("^Verify User can be able to fetch paramedics details$")
	public static void Verify_User_can_be_able_to_fetch_Paramedics_details() throws Throwable {
		Thread.sleep(3000);
		Actions actions5456 = new Actions(DriverFactory.driver);
		actions5456.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions5456.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		Thread.sleep(4000);
		ObjectsReporsitory.Paramedics_fetch_data.click();
		System.out.println("Skin Temperature : " + ObjectsReporsitory.Paramedics_SkinTemp.getText());
		System.out.println("Color of Eyes" + ObjectsReporsitory.Paramedics_colorofEyes.getText());
		System.out.println("Complexion" + ObjectsReporsitory.Paramedics_Complexion.getText());
		System.out.println("Diabetics: " + ObjectsReporsitory.Paramedics_Diabetics.getText());
		System.out.println("SPO2: " + ObjectsReporsitory.Paramedics_SPO2.getText());
		System.out.println("Systolic: " + ObjectsReporsitory.Paramedics_Systolic.getText());
		System.out.println("Diastolic: " + ObjectsReporsitory.Paramedics_Diastolic.getText());
		System.out.println("Height: " + ObjectsReporsitory.Paramedics_Height.getText());
		System.out.println("weight: " + ObjectsReporsitory.Paramedics_weight.getText());
		System.out.println("BMI: " + ObjectsReporsitory.Paramedics_BMI.getText());
		System.out.println("IDMark1: " + ObjectsReporsitory.Paramedics_IDMark1.getText());
		System.out.println("IDMark2: " + ObjectsReporsitory.Paramedics_IDMark2.getText());
		System.out.println("HeartRate: " + ObjectsReporsitory.Paramedics_HeartRate.getText());
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify User can be able to Select Workmen Profile for Paramedics$")
	public static void Verify_User_can_be_able_to_Select_Workmen_Profile_for_Paramedics() throws Throwable {
		Actions actions545 = new Actions(DriverFactory.driver);
		actions545.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card);
		actions545.perform();
		wait.until(ExpectedConditions.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Eye));
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Last_Card.click();
		Thread.sleep(4000);
	}
}
