package stepdefinition.Basic_Details.Create;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import io.cucumber.java.en.Given;

public class Communication {

	// Read Configuration

	public static ConfigFileReader configFileReader;
	public static String select_Random_Labour_Camp_ID_size;
	public static String select_Random_Labour_Structure_size;
	public static String select_Random_Labour_Room_size;
	public static String Selected_EC_Relation;

	// Page Factory
	public Communication() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Fill Partner and Personal details then navigate to communication$")
	public static void Fill_Partner_and_Personal_details_then_navigate_to_communication() throws Throwable {
		Personal.Fill_Partner_details_and_navigate_to_Personal();
		Personal.Verify_user_can_able_to_enter_name_and_fathername();
		Personal.Verify_user_can_able_to_select_DOB();
		Personal.Verify_user_age_auto_calculated();
		Personal.Verify_user_able_to_capture_image();
		Personal.Verify_user_able_to_add_Language();
		Personal.verify_user_can_able_to_select_gender();
		Personal.Verify_user_can_able_to_select_blood_group();
		Personal.verify_user_can_able_to_select_marital_status();
		Personal.verify_user_can_able_to_enter_spouse_name();
		Personal.verify_user_can_able_to_enter_religion();
		Personal.verify_user_can_able_to_enter_Nearest_police_station();
		//Personal.verify_user_can_able_to_select_Police_Verification_Certificate();
		Personal.verify_user_can_able_to_select_Nationality();
		Personal.verify_user_can_able_to_provide_CSTI_and_NAPS();
		Personal.verify_user_can_able_to_save_Personal_details();
	}

	@Then("^Verify user can able to enter mobile number$")
	public static void Verify_user_can_able_to_enter_mobile_number() throws Throwable {
		System.out.println("Communication Details");
		long theRandomNum = (long) (Math.random() * Math.pow(10, 10));
		ObjectsReporsitory.communication_Mobilenumber.sendKeys("" + theRandomNum);
		System.out.println("Mobile_Number : " + ConfigFileReader.getMobilenumber());
	}

	@Then("^Verify user can able to verify mobile number$")
	public static void Verify_user_can_able_to_verify_mobile_number() throws Throwable {
		ObjectsReporsitory.communication_verifyMobilenumber.click();
	}

	@Then("^Verify user can able to Select Country$")
	public static void Verify_user_can_able_to_Select_Country() throws Throwable {

		if (ConfigFileReader.getPermanent_Address_Country_Type().equals("Domestic")) {
			ObjectsReporsitory.communication_Country_Permanent_Address.click();
			Thread.sleep(2000);
			ObjectsReporsitory.communication_Country_Permanent_Address.clear();
			Thread.sleep(2000);
			ObjectsReporsitory.communication_Country_Permanent_Address
					.sendKeys(ConfigFileReader.getPermanent_Address_Country_Domestic());
			Thread.sleep(2000);
			List<WebElement> DropdownResult = ObjectsReporsitory.Communication_Country_Allelements_Domestic;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getPermanent_Address_Country_Domestic())) {
					webElement.click();
					System.out.println("Country :" + ConfigFileReader.getPermanent_Address_Country_Domestic());
					break;
				}
			}

			Thread.sleep(2000);
			System.out.println("Entering Pincode");
			ObjectsReporsitory.Communication_pincode.sendKeys(ConfigFileReader.getPermanent_Address_pincode());
		} else if (ConfigFileReader.getPermanent_Address_Country_Type().equals("International")) {

			ObjectsReporsitory.communication_Country_Permanent_Address
					.sendKeys(ConfigFileReader.getPermanent_Address_Country_International());
			Thread.sleep(2000);
			List<WebElement> DropdownResult = ObjectsReporsitory.Communication_Country_Allelements;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getPermanent_Address_Country_International())) {
					webElement.click();
					System.out.println("Country :" + ConfigFileReader.getPermanent_Address_Country_International());
					break;
				}
			}

			ObjectsReporsitory.communication_Country_Permanent_Address_State.click();
			Thread.sleep(2000);
			ObjectsReporsitory.communication_Country_Permanent_Address_State.clear();
			Thread.sleep(2000);
			ObjectsReporsitory.communication_Country_Permanent_Address_State
					.sendKeys(ConfigFileReader.getPermanent_Address_Country_International_State());
			Thread.sleep(2000);
			Thread.sleep(2000);
			List<WebElement> DropdownResult3 = ObjectsReporsitory.Communication_Country_Allelements;
			for (WebElement webElement2 : DropdownResult3) {
				if (webElement2.getText().equals(ConfigFileReader.getPermanent_Address_Country_International_State())) {
					webElement2.click();
					System.out.println("State :" + ConfigFileReader.getPermanent_Address_Country_International_State());
					break;
				}
			}
		}

	}

	@Then("^Verify address autofetched based on pincode entered$")

	public static void Verify_address_autofetched_based_on_pincode_entered() throws Throwable {
		if (ConfigFileReader.getPermanent_Address_Country_Type().equals("Domestic"))

		{
			System.out.println("Pincode: " + ConfigFileReader.getPermanent_Address_pincode());
			Thread.sleep(3000);
			ObjectsReporsitory.communication_Mobilenumber.click();
			wait.until(ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Communication_District,
					"ng-reflect-model"));
			String District = ObjectsReporsitory.Communication_District.getAttribute("ng-reflect-model");
			String State = ObjectsReporsitory.Communication_State.getAttribute("ng-reflect-model");
			System.out.println("District: " + District);
			System.out.println("State: " + State);
		} else {
			System.out.println("International Country COde selected");
		}

	}

	@Then("^Verify user can able to enter address and select villege$")
	public static void Verify_user_can_able_to_enter_address_and_select_villege() throws Throwable {
		ObjectsReporsitory.Communication_Address.sendKeys(ConfigFileReader.getPermanent_Address() +" "+ RandomString.make(10) );
		Thread.sleep(2000);
		System.out.println("Permanent Address: " + ObjectsReporsitory.Communication_Address.getAttribute("value"));
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions.perform();
		ObjectsReporsitory.Communication_villageTown.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains(ConfigFileReader.getPermanent_Address_Village())) {
				webElement.click();
				System.out.println("Permanent Address Village:" + ConfigFileReader.getPermanent_Address_Village());
				break;
			}
		}
		Thread.sleep(3000);
	}

	@Then("^Verify user can able to enter Temporary address$")
	public static void Verify_user_can_able_to_enter_Temporary_address() throws Throwable {
		if (ConfigFileReader.getSame_as_Permanent_Address().equals("True")) {
			ObjectsReporsitory.sameAsPermanent.click();
			wait.until(ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Communication_Temp_District,
					"ng-reflect-model"));
			String Temp_District = ObjectsReporsitory.Communication_Temp_District.getAttribute("ng-reflect-model");
			String Temp_State = ObjectsReporsitory.Communication_Temp_State.getAttribute("ng-reflect-model");
			System.out.println("Temp_Address_District: " + Temp_District);
			System.out.println("Temp_Address_State: " + Temp_State);

		}

		else if (ConfigFileReader.getSame_as_Permanent_Address().equals("false")) {
			Actions actions = new Actions(DriverFactory.driver);
			actions.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
			actions.perform();
			wait.until(ExpectedConditions.textToBePresentInElement(
					ObjectsReporsitory.Communication_emergencyContact_Head, "Emergency Contact"));
			ObjectsReporsitory.Communication_Temp_pincode.sendKeys(ConfigFileReader.getTemporary_Address_Pincode());
			Actions actions1 = new Actions(DriverFactory.driver);
			actions1.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
			actions1.perform();
			Thread.sleep(2000);
			System.out.println("Temp_Address_Pincode: " + ConfigFileReader.getTemporary_Address_Pincode());
			Thread.sleep(5000);
			String Temp_District = ObjectsReporsitory.Communication_Temp_District.getAttribute("ng-reflect-model");
			String Temp_State = ObjectsReporsitory.Communication_Temp_State.getAttribute("ng-reflect-model");
			System.out.println("Temp_Address_District: " + Temp_District);
			System.out.println("Temp_Address_State: " + Temp_State);
			ObjectsReporsitory.Communication_Temp_address.sendKeys(ConfigFileReader.getTemporary_Address()+" "+ RandomString.make(10));
			Thread.sleep(2000);
			System.out.println("Temporary Address: " + ObjectsReporsitory.Communication_Temp_address.getAttribute("value"));
			// Error in this line
			ObjectsReporsitory.Communication_Temp_villageTown.click();
			List<WebElement> DropdownResult = ObjectsReporsitory.Communication_temp_villageTown_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getTemporary_Address_Village())) {
					webElement.click();
					System.out.println("Temporary Address Village:" + ConfigFileReader.getTemporary_Address_Village());
					break;
				}
			}
		} else if (ConfigFileReader.getSame_as_Permanent_Address().equals("camp")) {

			ObjectsReporsitory.Labour_Camp_Checkbox.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Labour_Camp_ID));
			ObjectsReporsitory.Labour_Camp_ID.click();

			List<WebElement> DropdownResult_Labour_Camp_ID = ObjectsReporsitory.Labour_Camp_ID_All_option;
			Random Random_Labour_Camp_ID = new Random();
			int Random_Labour_Camp_ID_size = Random_Labour_Camp_ID
					.nextInt(ObjectsReporsitory.Labour_Camp_ID_All_option.size());
			select_Random_Labour_Camp_ID_size = ObjectsReporsitory.Labour_Camp_ID_All_option
					.get(Random_Labour_Camp_ID_size).getText();
			for (WebElement webElement : DropdownResult_Labour_Camp_ID) {
				if (webElement.getText().equals(select_Random_Labour_Camp_ID_size)) {
					webElement.click();
					System.out.println("Selected Labour Camp : " + select_Random_Labour_Camp_ID_size);
					break;
				}
			}
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Labour_Camp_structure));
			ObjectsReporsitory.Labour_Camp_structure.click();
			List<WebElement> DropdownResult_Labour_Structure = ObjectsReporsitory.Labour_Camp_structure_All_option;
			Random Random_Labour_Structure = new Random();
			int Random_Labour_Structure_size = Random_Labour_Structure
					.nextInt(ObjectsReporsitory.Labour_Camp_structure_All_option.size());
			select_Random_Labour_Structure_size = ObjectsReporsitory.Labour_Camp_structure_All_option
					.get(Random_Labour_Structure_size).getText();
			for (WebElement webElement : DropdownResult_Labour_Structure) {
				if (webElement.getText().equals(select_Random_Labour_Camp_ID_size)) {
					webElement.click();
					System.out.println("Selected Labour Camp Structure : " + select_Random_Labour_Camp_ID_size);
					break;
				}
			}
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Labour_Camp_room));
			ObjectsReporsitory.Labour_Camp_room.click();
			List<WebElement> DropdownResult_Labour_Room = ObjectsReporsitory.Labour_Camp_structure_All_option;
			Random Random_Labour_Room = new Random();
			int Random_Labour_Room_size = Random_Labour_Room
					.nextInt(ObjectsReporsitory.Labour_Camp_structure_All_option.size());
			select_Random_Labour_Room_size = ObjectsReporsitory.Labour_Camp_structure_All_option
					.get(Random_Labour_Room_size).getText();
			for (WebElement webElement : DropdownResult_Labour_Room) {
				if (webElement.getText().equals(select_Random_Labour_Camp_ID_size)) {
					webElement.click();
					System.out.println("Selected Labour Camp Room : " + select_Random_Labour_Camp_ID_size);
					break;
				}
			}
			String Temp_Pincode = ObjectsReporsitory.Communication_Temp_Camp_pincode.getAttribute("ng-reflect-model");
			String Temp_Address = ObjectsReporsitory.Communication_Temp_Camp_District.getAttribute("ng-reflect-model");
			String Temp_Village = ObjectsReporsitory.Communication_Temp_Camp_Village.getAttribute("ng-reflect-model");
			String Temp_District = ObjectsReporsitory.Communication_Temp_Camp_District.getAttribute("ng-reflect-model");
			String Temp_State = ObjectsReporsitory.Communication_Temp_Camp_State.getAttribute("ng-reflect-model");
			System.out.println("Temporary Address as Labour Camp - PinCode: " + Temp_Pincode);
			System.out.println("Temporary Address as Labour Camp - Address: " + Temp_Address);
			System.out.println("Temporary Address as Labour Camp - Village/Town/City: " + Temp_Village);
			System.out.println("Temporary Address as Labour Camp - District: " + Temp_District);
			System.out.println("Temporary Address as Labour Camp - State: " + Temp_State);

		}
	}

	@Then("^Verify user can able to enter Emergency Contact Name and number$")
	public static void Verify_user_can_able_to_enter_Emergency_Contact_Name_and_number() throws Throwable {
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name.clear();
		ObjectsReporsitory.Communication_EC_name.click();
		ObjectsReporsitory.Communication_EC_name
				.sendKeys(ConfigFileReader.getEmergency_Contact_Name() +" "+ RandomString.make(10));
		Thread.sleep(2000);
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		ObjectsReporsitory.Communication_EC_MobileNumber.clear();
		ObjectsReporsitory.Communication_EC_MobileNumber.click();
		long theRandomNum2 = (long) (Math.random() * Math.pow(10, 10));
		ObjectsReporsitory.Communication_EC_MobileNumber.sendKeys("" + theRandomNum2);
		System.out.println("Emergency Contact Name : " + ObjectsReporsitory.Communication_EC_name.getAttribute("value"));
		System.out.println(
				"Emergency Contact Number : " + ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value"));
	}

	@Then("^Verify user can able to select relationship with employee$")
	public static void Verify_user_can_able_to_select_relationship_with_employee() throws Throwable {
		ObjectsReporsitory.Communication_EC_relationshipWithEmployee.click();
		Thread.sleep(2000);

		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_relationshipWithEmployee_DR;
		
		if (ConfigFileReader.getselect_EC_Relation_Value().contains("Random")) {
			System.out.println("Selecting relationship with employee");
			Random rand654 = new Random();
			int EC_Relation = rand654.nextInt(ObjectsReporsitory.Communication_EC_relationshipWithEmployee_DR.size());
			Selected_EC_Relation = ObjectsReporsitory.Communication_EC_relationshipWithEmployee_DR.get(EC_Relation).getText();

			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(Selected_EC_Relation)) {
					webElement.click();
					Thread.sleep(3000);
					System.out.println("Selected relationship with employee :" + ObjectsReporsitory.Communication_EC_relationshipWithEmployee.getAttribute("value"));
					break;
				}
			}

		}

		else {
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getEmergency_Contact_Relation())) {
					webElement.click();
					System.out.println("Emergency contact relation with employee: "
							+ ConfigFileReader.getEmergency_Contact_Relation());
					break;
				}
			}
		}

	}

	@Then("^Verify user can able to enter Emergency Contact address pincode$")
	public static void Verify_user_can_able_to_enter_Emergency_Contact_address_pincode() throws Throwable {
		ObjectsReporsitory.Communication_EC_pincode.sendKeys(ConfigFileReader.getEmergency_Contact_Pincode());
	}

	@Then("^Verify address autofetched based on pincode entered for Emergency Contact$")
	public static void Verify_address_autofetched_based_on_pincode_entered_for_Emergency_Contact() throws Throwable {
		ObjectsReporsitory.Communication_EC_District.click();
		System.out.println("Emergency Contact_Address_Pincode: " + ConfigFileReader.getEmergency_Contact_Pincode());
		Thread.sleep(5000);
		String EC_District = ObjectsReporsitory.Communication_EC_District.getAttribute("ng-reflect-model");
		String EC_State = ObjectsReporsitory.Communication_EC_state.getAttribute("ng-reflect-model");
		System.out.println("Emergency Contact District: " + EC_District);
		System.out.println("Emergency Contact State: " + EC_State);
		// Need to verify with DB
	}

	@Then("^Verify user can able to enter address and select villege for Emergency Contact$")
	public static void Verify_user_can_able_to_enter_address_and_select_villege_for_Emergency_Contact()
			throws Throwable {
		Actions actions = new Actions(DriverFactory.driver);
		actions.moveToElement(ObjectsReporsitory.skill_header);
		actions.perform();
		ObjectsReporsitory.Communication_EC_address.click();
		ObjectsReporsitory.Communication_EC_address.clear();
		ObjectsReporsitory.Communication_EC_address.click();
		ObjectsReporsitory.Communication_EC_address.sendKeys(ConfigFileReader.getEmergency_Contact_Address() +" "+ RandomString.make(10) );
		Thread.sleep(2000);
		System.out.println("Emergency Contact Address: " + ObjectsReporsitory.Communication_EC_address.getAttribute("value"));
		ObjectsReporsitory.Communication_EC_villageTown.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains(ConfigFileReader.getEmergency_Contact_Village())) {
				webElement.click();
				System.out.println("Emergency Contact Village:" + ConfigFileReader.getEmergency_Contact_Village());
				break;
			}
		}

	}

	@Then("^Verify user can able to save communication details$")
	public static void Verify_user_can_able_to_save_communication_details() throws Throwable {
		ObjectsReporsitory.Communication_saveNext.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_handle();
		Basic.PageLoader_Validation();

	}
}
