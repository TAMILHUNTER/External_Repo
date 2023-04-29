package stepdefinition.Basic_Details.Create;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import net.bytebuddy.utility.RandomString;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class Personal {

	public static String Selected_Language1;
	public static String Selected_Language2;
	public static String Selected_Language3;
	public static String Selected_Gender;
	public static String Selected_BloodGroup;
	public static String Selected_MaritalStatus;
	public static String Selected_religionStatus;
	public static String Selected_nationalityStatus;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Personal() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner details and navigate to Personal$")
	public static void Fill_Partner_details_and_navigate_to_Personal() throws Throwable {
		stepdefinition.Login.Use_Login_Induction_Basic();
		Partner.Navigate_to_BasicDetails();
		Partner.Verify_user_can_able_to_select_the_Existing_Partner_by_ID();
		Partner.Verify_user_can_able_to_select_the_Worktype();
		// ObjectsReporsitory.partnerbar.click();
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.Personal_workmanName);
		actions.perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Partner_next));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Partner_next);
		// ObjectsReporsitory.Partner_next.click();
		actions.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions.perform();
		System.out.println("Navigated to Basicdetails - Personal");

	}

	@Then("^Verify user can able to enter name and fathername$")
	public static void Verify_user_can_able_to_enter_name_and_fathername() throws Throwable {

		ObjectsReporsitory.Personal_workmanName.sendKeys(ConfigFileReader.getWorkman_name() + RandomString.make(10));
		ObjectsReporsitory.Personal_fatherName
				.sendKeys(ConfigFileReader.getWorkman_Father_name() + RandomString.make(10));
		System.out.println("Workman Name : " + ObjectsReporsitory.Personal_workmanName.getAttribute("value"));
		System.out.println("Workman Father's Name : " + ObjectsReporsitory.Personal_fatherName.getAttribute("value"));

	}

	@Then("^Verify user can able to select DOB$")
	public static void Verify_user_can_able_to_select_DOB() throws Throwable {

		test.kendo_Calender_Robot.kendo_Calender_action_DOB();
		// test.kendo_Calender_Random.kendo_Calender();
		// test.kendo_Calender_Robot.kendo_calender_DOB();
		System.out.println("Workman DOB Entered : " + ObjectsReporsitory.Personal_DOB.getAttribute("value"));
	}

	@Then("^Verify user age auto calculated$")
	public static void Verify_user_age_auto_calculated() throws Throwable {
		// ObjectsReporsitory.Personal_AgeDetail_Years.click();
		System.out.println("Auto Calculated age : " + ObjectsReporsitory.Personal_AgeDetail_Years.getText()
				+ " Years & " + ObjectsReporsitory.Personal_AgeDetail_Months.getText() + " Months");
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println("Date Today: " + date1);
	}

	@Then("^Verify user able to capture image$")
	public static void Verify_user_able_to_capture_image() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_picture));
		ObjectsReporsitory.Personal_picture.click();
		Thread.sleep(5000);
		ObjectsReporsitory.Personal_takeASnapshot.click();
		ObjectsReporsitory.Personal_close.click();
		System.out.println("Workman Image Captured");

	}

	@Then("^Verify user able to add Language$")
	public static void Verify_user_able_to_add_Language() throws Throwable {
		ObjectsReporsitory.Personal_languagesKnown.click();

		// Adding Language 1:

		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				ObjectsReporsitory.Personal_Language_addLanguage);
		// ObjectsReporsitory.Personal_Language_addLanguage.click();
		ObjectsReporsitory.Personal_Language_addLanguage_dr.click();

		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_Language_Languageselect_DR;

		if (ConfigFileReader.getselect_Language_Value().contains("Random")) {
			System.out.println("Selecting Random Language");
			Random rand654 = new Random();
			int Language1 = rand654.nextInt(ObjectsReporsitory.Personal_Language_Languageselect_DR.size());
			Selected_Language1 = ObjectsReporsitory.Personal_Language_Languageselect_DR.get(Language1).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_Language1)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Selected Language 1");
					break;
				}
			}

		}

		else {
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getLanguage1())) {
					webElement.click();
					System.out.println("Language Selected:" + ConfigFileReader.getLanguage1());
					break;
				}
			}
		}

		if (ConfigFileReader.getL1Read().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Read));
			ObjectsReporsitory.Personal_Language_Read.click();
		} else if (ConfigFileReader.getL1Read().equals("True")) {
			System.out.println("Language Read Unchecked");
		}
		if (ConfigFileReader.getL1Write().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Write));
			ObjectsReporsitory.Personal_Language_Write.click();
		} else if (ConfigFileReader.getL1Write().equals("True")) {
			System.out.println("Language Write Unchecked");
		}
		if (ConfigFileReader.getL1speak().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Speak));
			ObjectsReporsitory.Personal_Language_Speak.click();
		} else if (ConfigFileReader.getL1speak().equals("True")) {
			System.out.println("Language Speak Unchecked");
		}
		ObjectsReporsitory.Personal_Language_Save.click();
		System.out.println("Language 1 added successfully");

		// Adding Language 2:
		ObjectsReporsitory.Personal_Language_addLanguage.click();
		ObjectsReporsitory.Personal_Language_addLanguage_dr.click();
		List<WebElement> DropdownResult2 = ObjectsReporsitory.Personal_Language_Languageselect_DR;

		if (ConfigFileReader.getselect_Language_Value().contains("Random")) {
			System.out.println("Selecting Random Language");
			Random rand6542 = new Random();
			int Language2 = rand6542.nextInt(ObjectsReporsitory.Personal_Language_Languageselect_DR.size());
			Selected_Language2 = ObjectsReporsitory.Personal_Language_Languageselect_DR.get(Language2).getText();

			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().equals(Selected_Language2)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Selected Language 2");
					break;
				}
			}

		}

		else {
			for (WebElement webElement : DropdownResult2) {
				if (webElement.getText().equals(ConfigFileReader.getLanguage2())) {
					webElement.click();
					System.out.println("Language Selected:" + ConfigFileReader.getLanguage2());
					break;
				}
			}

		}
		if (ConfigFileReader.getL2Read().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Read));
			ObjectsReporsitory.Personal_Language_Read.click();
		} else if (ConfigFileReader.getL2Read().equals("True")) {
			System.out.println("Language Read Unchecked");
		}
		if (ConfigFileReader.getL2Write().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Write));
			ObjectsReporsitory.Personal_Language_Write.click();
		} else if (ConfigFileReader.getL2Write().equals("True")) {
			System.out.println("Language Write Unchecked");
		}
		if (ConfigFileReader.getL2speak().equals("True")) {
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Speak));
			ObjectsReporsitory.Personal_Language_Speak.click();
		} else if (ConfigFileReader.getL2speak().equals("True")) {
			System.out.println("Language Speak Unchecked");
		}
		ObjectsReporsitory.Personal_Language_Save.click();
		System.out.println("Language 2 added successfully");

//		//Adding Language 3:
//			ObjectsReporsitory.Personal_Language_addLanguage.click();
//			ObjectsReporsitory.Personal_Language_addLanguage_dr.click();
//			List<WebElement> DropdownResult3 = ObjectsReporsitory.Personal_Language_Languageselect_DR;
//			for (WebElement webElement : DropdownResult3) {
//				if (webElement.getText().equals(ConfigFileReader.getLanguage3())) {
//					webElement.click();
//					System.out.println("Language Selected:"+ConfigFileReader.getLanguage3());
//					break;
//				}
//			}
//			if(ConfigFileReader.getL3Read().equals("True")){
//				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Read));
//				ObjectsReporsitory.Personal_Language_Read.click();
//			}
//			else if (ConfigFileReader.getL3Read().equals("True")){
//				System.out.println("Language Read Unchecked");
//			}
//			if(ConfigFileReader.getL3Write().equals("True")){
//				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Write));
//				ObjectsReporsitory.Personal_Language_Write.click();
//			}
//			else if (ConfigFileReader.getL3Write().equals("True")){
//				System.out.println("Language Write Unchecked");
//			}
//			if(ConfigFileReader.getL3speak().equals("True")){
//				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Speak));
//				ObjectsReporsitory.Personal_Language_Speak.click();
//			}
//			else if (ConfigFileReader.getL3speak().equals("True")){
//				System.out.println("Language Speak Unchecked");
//			}
//			ObjectsReporsitory.Personal_Language_Save.click();
//			
//			System.out.println("Language " +ConfigFileReader.getLanguage3()+" added successfully");
		ObjectsReporsitory.Personal_Language_closewindow.click();

	}

	@Then("^Verify user able to Edit Language$")
	public static void Verify_user_able_to_Edit_Language() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_languagesKnown));
		ObjectsReporsitory.Personal_languagesKnown.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Edit));
		ObjectsReporsitory.Personal_Language_Edit.click();
		ObjectsReporsitory.Personal_Language_Read.click();
		ObjectsReporsitory.Personal_Language_Save.click();
		System.out.println("Language Edited successfully");
		ObjectsReporsitory.Personal_Language_closewindow.click();
	}

	@Then("^Verify user able to Delete Language$")
	public static void Verify_user_able_to_delete_Language() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_languagesKnown));
		ObjectsReporsitory.Personal_languagesKnown.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_Delete));
		ObjectsReporsitory.Personal_Language_Delete.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_Language_closewindow));
		ObjectsReporsitory.Personal_Language_closewindow.click();
		System.out.println("Language Deleted successfully");
	}

	@Then("^verify user can able to select gender$")
	public static void verify_user_can_able_to_select_gender() throws Throwable {

		List<WebElement> Gender_all_options = ObjectsReporsitory.Personal_Gender_allOptions;

		if (ConfigFileReader.getselect_Language_Value().contains("Random")) {
			System.out.println("Selecting Random Gender");
			Random rand65442 = new Random();
			int Gender = rand65442.nextInt(ObjectsReporsitory.Personal_Gender_allOptions.size());
			Selected_Gender = ObjectsReporsitory.Personal_Gender_allOptions.get(Gender).getText();

			for (WebElement webElement : Gender_all_options) {
				if (webElement.getText().equals(Selected_Gender)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Gender Selected");
					break;
				}
			}

		}

		else {
			String Gender = ConfigFileReader.getGender();
			if (Gender.equals("Male")) {
				ObjectsReporsitory.Personal_Gender_Male.click();
			}
			if (Gender.equals("Female")) {
				ObjectsReporsitory.Personal_Gender_female.click();
			}
			if (Gender.equals("Others")) {
				ObjectsReporsitory.Personal_Gender_others.click();
			}
			System.out.println(Gender + " Gender Selected");

		}

	}

	@Then("^Verify user can able to select blood group$")
	public static void Verify_user_can_able_to_select_blood_group() throws Throwable {
		ObjectsReporsitory.Personal_bloodGroup.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_bloodGroup_DR;

		if (ConfigFileReader.getselect_BloodGroup_Value().contains("Random")) {
			System.out.println("Selecting Random BloodGroup");
			Random rand7852 = new Random();
			int BloodGroup = rand7852.nextInt(ObjectsReporsitory.Personal_bloodGroup_DR.size());
			Selected_BloodGroup = ObjectsReporsitory.Personal_bloodGroup_DR.get(BloodGroup).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_BloodGroup)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println(
							ObjectsReporsitory.Personal_bloodGroup.getAttribute("value") + " : Blood Group Selected ");
					break;
				}
			}

		} else {

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getBlood_Group())) {
					webElement.click();
					System.out.println("Blood Group Selected:" + ConfigFileReader.getBlood_Group());
					break;
				}
			}
		}
	}

	@Then("^verify user can able to select marital status$")
	public static void verify_user_can_able_to_select_marital_status() throws Throwable {
		ObjectsReporsitory.Personal_maritalStatus.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_maritalStatus_DR;

		if (ConfigFileReader.getselect_Marital_Value().contains("Random")) {
			System.out.println("Selecting Random Marital Status");
			Random rand78522 = new Random();
			int MaritalStatus = rand78522.nextInt(ObjectsReporsitory.Personal_maritalStatus_DR.size());
			Selected_MaritalStatus = ObjectsReporsitory.Personal_maritalStatus_DR.get(MaritalStatus).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_MaritalStatus)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Workmen is " + ObjectsReporsitory.Personal_maritalStatus.getText());
					break;
				}
			}

		} else {

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getMarital_status())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println("Marital_Status set as : " + ConfigFileReader.getMarital_status());
					System.out.println("Marital Status: " + ConfigFileReader.getMarital_status() + " Selected");
					break;
				}
			}
		}

	}

	@Then("^verify user can able to enter spouse name$")
	public static void verify_user_can_able_to_enter_spouse_name() throws Throwable {
		String Marital_Status = ObjectsReporsitory.Personal_maritalStatus.getText();
		if (Marital_Status.contains("Single")) {
		} else if (Marital_Status.contains("Married") || Marital_Status.contains("Divorced")
				|| Marital_Status.contains("Widowed") || Marital_Status.contains("Separated")) {
			ObjectsReporsitory.Personal_guardianSpouse
					.sendKeys(ConfigFileReader.getspouse_name() + RandomString.make(10));
			System.out.println("guardian / Spouse Name:" + ObjectsReporsitory.Personal_guardianSpouse.getText());

			int min = 0;
			int max = 9;
			Random rand_No_of_childeren = new Random();
			int No_of_childeren = rand_No_of_childeren.nextInt(max - min) + min;

			ObjectsReporsitory.Personal_NoofChilderen.sendKeys("" + No_of_childeren);
			System.out.println("No. of Children:" + ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value"));
		} else {
			System.out.println("Invalid Marital status");
		}
	}

	@Then("^verify user can able to enter religion$")
	public static void verify_user_can_able_to_enter_religion() throws Throwable {

		ObjectsReporsitory.Personal_religion.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_religion_DR;

		System.out.println("Selecting Religion Status");
		Random rand78522a = new Random();
		int religion = rand78522a.nextInt(ObjectsReporsitory.Personal_religion_DR.size());
		Selected_religionStatus = ObjectsReporsitory.Personal_religion_DR.get(religion).getText();

		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(Selected_religionStatus)) {
				webElement.click();
				Thread.sleep(3000);
				System.out.println("Workmen's Religion is " + ObjectsReporsitory.Personal_religion.getText());
				break;
			}
		}

	}

	@Then("^verify user can able to enter Nearest police station$")
	public static void verify_user_can_able_to_enter_Nearest_police_station() throws Throwable {
		ObjectsReporsitory.Personal_nearestPoliceStation.click();
		ObjectsReporsitory.Personal_nearestPoliceStation.clear();
		ObjectsReporsitory.Personal_nearestPoliceStation.click();
		ObjectsReporsitory.Personal_nearestPoliceStation
				.sendKeys(ConfigFileReader.getnearestpolicestation() + RandomString.make(10));
		System.out.println("Nearest police Station " + ObjectsReporsitory.Personal_nearestPoliceStation.getText());
	}

	@Then("^verify user can able to select Police Verification Certificate$")
	public static void verify_user_can_able_to_select_Police_Verification_Certificate() throws Throwable {

		Random rand124 = new Random();
		int policecertificate_Status = rand124.nextInt(ObjectsReporsitory.Personal_policeCertificate.size());
		ObjectsReporsitory.Personal_policeCertificate.get(policecertificate_Status).click();
		System.out.println("Police Certificate Status Selected ");
		Basic.popup_validation();

	}
	@Then("^verify user can able to select Nationality$")
	public static void verify_user_can_able_to_select_Nationality() throws Throwable {

		ObjectsReporsitory.Personal_nationality.click();
		Thread.sleep(3000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Personal_nationality_DR;

		System.out.println("Selecting Nationality Status");
		Random rand785223a = new Random();
		int nationality = rand785223a.nextInt(ObjectsReporsitory.Personal_nationality_DR.size());
		Selected_nationalityStatus = ObjectsReporsitory.Personal_nationality_DR.get(nationality).getText();

		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(Selected_nationalityStatus)) {
				webElement.click();
				Thread.sleep(3000);
				System.out.println("Workmen's Nationality is " + ObjectsReporsitory.Personal_nationality.getText());
				break;
			}
		}
	}

	@Then("^verify user can able to provide CSTI and NAPS$")
	public static void verify_user_can_able_to_provide_CSTI_and_NAPS() throws Throwable {
		String CSTI_Enable = ConfigFileReader.getEnable_CSTI();
		String NAPS_Enable = ConfigFileReader.getEnable_NAPS();
		Actions actions = new Actions(DriverFactory.driver);
		if (CSTI_Enable.equals("True") && NAPS_Enable.equals("True")) {
			actions.moveToElement(ObjectsReporsitory.communicationDetails_Head);
			actions.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_CSTI));
			ObjectsReporsitory.Personal_CSTI_label.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_NAPS));
			ObjectsReporsitory.Personal_NAPS_label.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_nAPSNumber));
			String input = RandomStringUtils.randomAlphanumeric(8);
			ObjectsReporsitory.Personal_nAPSNumber.sendKeys(input);
			// ObjectsReporsitory.Personal_nAPSNumber.sendKeys(ConfigFileReader.getNAPS());
			System.out.println("NAPS:" + ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value"));
		} else if (CSTI_Enable.equals("False") && NAPS_Enable.equals("True")) {
			actions.moveToElement(ObjectsReporsitory.communicationDetails_Head);
			actions.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_NAPS));
			ObjectsReporsitory.Personal_NAPS_label.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_nAPSNumber));
			String input2 = RandomStringUtils.randomAlphanumeric(8);
			ObjectsReporsitory.Personal_nAPSNumber.sendKeys(input2);
			// ObjectsReporsitory.Personal_NAPS.sendKeys(ConfigFileReader.getNAPS());
			System.out.println("NAPS:" + ObjectsReporsitory.Personal_nAPSNumber.getAttribute("value"));
		} else if (CSTI_Enable.equals("True") && NAPS_Enable.equals("False")) {
			actions.moveToElement(ObjectsReporsitory.communicationDetails_Head);
			actions.perform();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_CSTI));
			ObjectsReporsitory.Personal_CSTI_label.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_cSTINumber));
			String input3 = RandomStringUtils.randomAlphanumeric(8);
			ObjectsReporsitory.Personal_cSTINumber.sendKeys(input3);
			// ObjectsReporsitory.Personal_cSTINumber.sendKeys(ConfigFileReader.getCSTI());
			System.out.println("NAPS:" + ObjectsReporsitory.Personal_cSTINumber.getAttribute("value"));
		} else {
			System.out.println("Invalid CSTI and NAPS");
		}

		Screenshot.Screenshotforscenario();
	}

	@Then("^verify user can able to save Personal details$")
	public static void verify_user_can_able_to_save_Personal_details() throws Throwable {
		ObjectsReporsitory.Personal_saveNext.click();
		Basic.PageLoader_Validation();
		System.out.println("Personal Details are saved ");
	}

}
