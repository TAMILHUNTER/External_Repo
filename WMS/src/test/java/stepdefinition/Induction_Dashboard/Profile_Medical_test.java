package stepdefinition.Induction_Dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
//import object_repository.WorkmenProfile;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;

public class Profile_Medical_test {

// Page Factory
	public Profile_Medical_test() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
		// PageFactory.initElements(DriverFactory.driver, WorkmenProfile.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^verify Medicaltest Due in Medical Test are displayed correctly in profile")
	public static void verify_Medicaltest_Due_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_NextDue.getText().equals("No records available.")) {
			System.out.println("Workmen Medical Test not Completed Yet- Medicaltest Due Details Not Available");
		}

		else {
			System.out.println("Medicaltest Due : " + Skill_Analysis_Objects.Profile_Medical_NextDue.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Fitness Status in Medical Test are displayed correctly in profile")
	public static void verify_Fitness_Status_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Fitness_Status.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Fitness Status Details Not Available");
		}

		else {
			System.out.println("Fitness Status : " + Skill_Analysis_Objects.Profile_Medical_Fitness_Status.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Skin Temperature in Medical Test are displayed correctly in profile")
	public static void verify_Skin_Temperature_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Skin_Temperature.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Skin Temperature Details Not Available");
		}

		else {
			System.out
					.println("Skin Temperature : " + Skill_Analysis_Objects.Profile_Medical_Skin_Temperature.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Color of Eyes in Medical Test are displayed correctly in profile")
	public static void verify_Color_of_Eyes_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_colorofEyes.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Color of Eyes details Not Available");
		}

		else {
			System.out.println("Color of Eyes : " + Skill_Analysis_Objects.Profile_Medical_colorofEyes.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Complexion in Medical Test are displayed correctly in profile")
	public static void verify_Complexion_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Complexion.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Complexion details Not Available");
		}

		else {
			System.out.println("Complexion : " + Skill_Analysis_Objects.Profile_Medical_Complexion.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Heart Rate in Medical Test are displayed correctly in profile")
	public static void verify_Heart_Rate_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Heart_Rate.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Heart Rate Details Not Available");
		}

		else {
			System.out.println("Heart Rate : " + Skill_Analysis_Objects.Profile_Medical_Heart_Rate.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();
	}

	@Then("^verify Diabetics in Medical Test are displayed correctly in profile")
	public static void verify_Diabetics_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Diabetics.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Diabetics Details Not Available");
		}

		else {
			System.out.println("Diabetics : " + Skill_Analysis_Objects.Profile_Medical_Diabetics.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify SPO2 in Medical Test are displayed correctly in profile")
	public static void verify_SPO2_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_SPO2.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- SPO2 Details Not Available");
		}

		else {
			System.out.println("SPO2 : " + Skill_Analysis_Objects.Profile_Medical_SPO2.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Systolic in Medical Test are displayed correctly in profile")
	public static void verify_Systolic_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Systolic.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Systolic Details Not Available");
		}

		else {
			System.out.println("Systolic : " + Skill_Analysis_Objects.Profile_Medical_Systolic.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Diastolic in Medical Test are displayed correctly in profile")
	public static void verify_Diastolic_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Diastolic.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Diastolic Details Not Available");
		}

		else {
			System.out.println("Diastolic : " + Skill_Analysis_Objects.Profile_Medical_Diastolic.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Height in Medical Test are displayed correctly in profile")
	public static void verify_Height_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Height.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Height Details Not Available");
		}

		else {
			System.out.println("Height : " + Skill_Analysis_Objects.Profile_Medical_Height.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Weight in Medical Test are displayed correctly in profile")
	public static void verify_Weight_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Weight.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Weight Details Not Available");
		}

		else {
			System.out.println("Weight : " + Skill_Analysis_Objects.Profile_Medical_Weight.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify BMI in Medical Test are displayed correctly in profile")
	public static void verify_BMI_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_BMI.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- BMI Details Not Available");
		}

		else {
			System.out.println("BMI : " + Skill_Analysis_Objects.Profile_Medical_BMI.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Identification Marks 1 in Medical Test are displayed correctly in profile")
	public static void verify_Identification_Marks_1_in_Medical_Test_are_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Identification_Marks_1.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Identification Marks 1 Details Not Available");
		}

		else {
			System.out.println("Identification Marks 1 : "
					+ Skill_Analysis_Objects.Profile_Medical_Identification_Marks_1.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Identification Marks 2 in Medical Test are displayed correctly in profile")
	public static void verify_Identification_Marks_2_in_Medical_Test_are_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_Medical_Identification_Marks_2.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Identification Marks 2 Details Not Available");
		}

		else {
			System.out.println("Identification Marks 2 : "
					+ Skill_Analysis_Objects.Profile_Medical_Identification_Marks_2.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify the secound Skin Temperature in Medical Test is displayed correctly in profile")
	public static void verify_the_secound_Skin_Temperature_in_Medical_Test_is_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Skin_Temperature2.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Skin Temperature2 Details Not Available");
		}

		else {
			System.out.println(
					"Skin Temperature2 : " + Skill_Analysis_Objects.Profile_Medical_Skin_Temperature.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify the secound color of Eyes in Medical Test is displayed correctly in profile")
	public static void verify_the_secound_color_of_Eyes_in_Medical_Test_is_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Profile_MedicalTest_colorofEyes);
		actions.perform();
		if (Skill_Analysis_Objects.Profile_MedicalTest_colorofEyes.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Color of Eyes details Not Available");
		}

		else {
			System.out.println("Color of Eyes2 : " + Skill_Analysis_Objects.Profile_MedicalTest_colorofEyes.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify the secound Complexion in Medical Test are displayed correctly in profile")
	public static void verify_the_secound_Complexion_in_Medical_Test_are_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(Skill_Analysis_Objects.Profile_MedicalTest_complextion);
		actions.perform();
		if (Skill_Analysis_Objects.Profile_MedicalTest_complextion.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Complexion details Not Available");
		}

		else {
			System.out.println("Complexion2 : " + Skill_Analysis_Objects.Profile_MedicalTest_complextion.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify BP in Medical Test are displayed correctly in profile")
	public static void verify_BP_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions2.perform();
		if (Skill_Analysis_Objects.Profile_Medical_BP.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- BP Details Not Available");
		}

		else {
			System.out.println("BP : " + Skill_Analysis_Objects.Profile_Medical_BP.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Varicose in Medical Test are displayed correctly in profile")
	public static void verify_Varicose_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions3.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Varicose.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Varicose Details Not Available");
		}

		else {
			System.out.println("Varicose : " + Skill_Analysis_Objects.Profile_Medical_Varicose.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Seizure in Medical Test are displayed correctly in profile")
	public static void verify_Seizure_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions4 = new Actions(DriverFactory.driver);
		actions4.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions4.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Seizure.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Seizure Details Not Available");
		}

		else {
			System.out.println("Seizure : " + Skill_Analysis_Objects.Profile_Medical_Seizure.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Vertigo in Medical Test are displayed correctly in profile")
	public static void verify_Vertigo_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions5 = new Actions(DriverFactory.driver);
		actions5.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions5.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Vertigo.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Vertigo Details Not Available");
		}

		else {
			System.out.println("Vertigo : " + Skill_Analysis_Objects.Profile_Medical_Vertigo.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Acrophobia in Medical Test are displayed correctly in profile")
	public static void verify_Acrophobia_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions6 = new Actions(DriverFactory.driver);
		actions6.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions6.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Acrophobia.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Acrophobia Details Not Available");
		}

		else {
			System.out.println("Acrophobia : " + Skill_Analysis_Objects.Profile_Medical_Acrophobia.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Diabetes in Medical Test are displayed correctly in profile")
	public static void verify_Diabetes_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions7 = new Actions(DriverFactory.driver);
		actions7.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions7.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Diabetes.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Diabetes Details Not Available");
		}

		else {
			System.out.println("Diabetes : " + Skill_Analysis_Objects.Profile_Medical_Diabetes.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Stroke in Medical Test are displayed correctly in profile")
	public static void verify_Stroke_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions8 = new Actions(DriverFactory.driver);
		actions8.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions8.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Stroke.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Stroke Details Not Available");
		}

		else {
			System.out.println("Stroke : " + Skill_Analysis_Objects.Profile_Medical_Stroke.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Heart Disease in Medical Test are displayed correctly in profile")
	public static void verify_Heart_Disease_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions9 = new Actions(DriverFactory.driver);
		actions9.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions9.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Heart_Disease.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Heart Disease Details Not Available");
		}

		else {
			System.out.println("Heart Disease : " + Skill_Analysis_Objects.Profile_Medical_Heart_Disease.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Major Illness in Medical Test are displayed correctly in profile")
	public static void verify_Major_Illness_in_Medical_Test_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions10 = new Actions(DriverFactory.driver);
		actions10.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions10.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Major_Illness_or_Surgery.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Major Illness Details Not Available");
		}

		else {
			System.out.println("Major Illness/Surgery : "
					+ Skill_Analysis_Objects.Profile_Medical_Major_Illness_or_Surgery.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^verify Respiratory Diseases in Medical Test are displayed correctly in profile")
	public static void verify_Respiratory_Diseases_in_Medical_Test_are_displayed_correctly_in_profile()
			throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Profile_Medical_Test); // Skill_Analysis_Objects.Profile_Medical_Test.click();
		Thread.sleep(2000);
		Actions actions11 = new Actions(DriverFactory.driver);
		actions11.moveToElement(Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases);
		actions11.perform();
		if (Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases.getText().equals("")) {
			System.out.println("Workmen Medical Test not Completed Yet- Respiratory Diseases Details Not Available");
		}

		else {
			System.out.println(
					"Respiratory Diseases : " + Skill_Analysis_Objects.Profile_Medical_Respiratory_Diseases.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();
	}
}
