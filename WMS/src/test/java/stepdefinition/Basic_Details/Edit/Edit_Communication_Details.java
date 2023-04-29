package stepdefinition.Basic_Details.Edit;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Basic_Details.Create.Communication;
import test.DataBaseConnection;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Edit_Communication_Details {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Communication_Details() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);

	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Communication$")
	public static void Select_Workman_and_Navigate_to_Communication() throws Throwable {
		Edit_Personal_Details.Select_Workman_and_Navigate_to_personal();
		Actions actions131 = new Actions(DriverFactory.driver);
		actions131.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
		actions131.perform();
		ObjectsReporsitory.Induction_communication.click();
		System.out.println("Navigated to Communication");
	}

	@Then("^Verify user can able to update mobile number$")
	public static void Verify_user_can_able_to_update_mobile_number() throws Throwable {
		ObjectsReporsitory.communication_Mobilenumber.clear();
		ObjectsReporsitory.communication_Mobilenumber.sendKeys(ConfigFileReader.getMobilenumber_update());
		// ***************************************************************************

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdatemobilenumber();

	}

	@Then("^Verify user can able to update Permanent Address Pincode$")
	public static void Verify_user_can_able_to_update_Permanent_Address_Pincode() throws Throwable {

		Actions actions132 = new Actions(DriverFactory.driver);
		actions132.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
		actions132.perform();
		ObjectsReporsitory.Induction_communication.click();
		ObjectsReporsitory.Communication_pincode.clear();
		ObjectsReporsitory.Communication_pincode.sendKeys(ConfigFileReader.getPermanent_Address_pincode_update());
		Actions actions133 = new Actions(DriverFactory.driver);
		actions133.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions133.perform();
		ObjectsReporsitory.Communication_villageTown_clear.click();
		ObjectsReporsitory.Communication_villageTown.click();
		ObjectsReporsitory.Communication_villageTown.sendKeys(ConfigFileReader.getPermanent_Address_Village_update());

		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().contains(ConfigFileReader.getPermanent_Address_Village_update())) {
				webElement.click();
				System.out
						.println("Permanent Address Village:" + ConfigFileReader.getPermanent_Address_Village_update());
				break;
			}
		}
		Communication.Verify_address_autofetched_based_on_pincode_entered();
		// ***************************************************************************

		Edit_Communication_Details.Verify_user_can_able_to_update_Permanent_Address_city();
		
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdatePermanentAddressPincode();
	}

	@Then("^Verify user can able to update Permanent Address$")
	public static void Verify_user_can_able_to_update_Permanent_Addre() throws Throwable {

		Actions actions134 = new Actions(DriverFactory.driver);
		actions134.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
		actions134.perform();
		ObjectsReporsitory.Induction_communication.click();
		ObjectsReporsitory.Communication_Address.clear();
		ObjectsReporsitory.Communication_Address.sendKeys(ConfigFileReader.getPermanent_Address_update2());
		// ***************************************************************************

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdatePermanentAddress();
	}

	@Then("^Verify user can able to update Permanent Address city$")
	public static void Verify_user_can_able_to_update_Permanent_Address_city() throws Throwable {

		Actions actions135 = new Actions(DriverFactory.driver);
		actions135.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
		actions135.perform();
		ObjectsReporsitory.Induction_communication.click();
		Actions actions136 = new Actions(DriverFactory.driver);
		actions136.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions136.perform();
		ObjectsReporsitory.Communication_villageTown_clear.click();
		ObjectsReporsitory.Communication_villageTown.click();
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getPermanent_Address_Village_update2())) {
				webElement.click();
				System.out.println(
						"Permanent Address Village:" + ConfigFileReader.getPermanent_Address_Village_update2());
				break;
			}
		}
		// ***************************************************************************

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdatePermanentAddresscity();
	}

//******************************************************

	@Then("^Verify user can able to update Temporary Address Pincode$")
	public static void Verify_user_can_able_to_update_Temporary_Address_Pincode() throws Throwable {

		if (ConfigFileReader.getSame_as_Permanent_Address_update().equals("True")) {
			ObjectsReporsitory.Induction_communication.click();
			ObjectsReporsitory.sameAsPermanent.click();
			wait.until(ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Communication_Temp_District,
					"ng-reflect-model"));
			String Temp_District = ObjectsReporsitory.Communication_Temp_District.getAttribute("ng-reflect-model");
			String Temp_State = ObjectsReporsitory.Communication_Temp_State.getAttribute("ng-reflect-model");
			System.out.println("Updated Temp_Address_District: " + Temp_District);
			System.out.println("Updated Temp_Address_State: " + Temp_State);

		}

		else if (ConfigFileReader.getSame_as_Permanent_Address_update().equals("False")) {
			ObjectsReporsitory.Induction_communication.click();
			Actions actions137 = new Actions(DriverFactory.driver);
			actions137.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
			actions137.perform();
			// wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Communication_emergencyContact_Head,
			// "Emergency Contact"));
			ObjectsReporsitory.Communication_Temp_pincode.click();
			ObjectsReporsitory.Communication_Temp_pincode.clear();
			ObjectsReporsitory.Communication_Temp_pincode
					.sendKeys(ConfigFileReader.getTemporary_Address_Pincode_update());
			ObjectsReporsitory.Communication_Temp_address.click();
			Actions actions1 = new Actions(DriverFactory.driver);
			actions1.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
			actions1.perform();
			Thread.sleep(2000);
			System.out.println("Updated Temp_Address_Pincode: "
					+ ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value"));
			String Temp_District = ObjectsReporsitory.Communication_Temp_District.getAttribute("ng-reflect-model");
			String Temp_State = ObjectsReporsitory.Communication_Temp_State.getAttribute("ng-reflect-model");
			System.out.println("Updated Temp_Address_District: " + Temp_District);
			System.out.println("Updated Temp_Address_State: " + Temp_State);
			ObjectsReporsitory.Communication_Temp_address.click();
			ObjectsReporsitory.Communication_Temp_address.clear();
			ObjectsReporsitory.Communication_Temp_address.sendKeys(ConfigFileReader.getTemporary_Address_update());
			System.out.println("Updated Temporary Address: " + ConfigFileReader.getTemporary_Address_update());
			ObjectsReporsitory.Communication_Temp_villageTown.clear();
			ObjectsReporsitory.Communication_Temp_villageTown.click();
			ObjectsReporsitory.Communication_Temp_villageTown
					.sendKeys(ConfigFileReader.getTemporary_Address_Village_update_A());
			Thread.sleep(2000);
			List<WebElement> DropdownResult = ObjectsReporsitory.Communication_temp_villageTown_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getAttribute("title").equals(ConfigFileReader.getTemporary_Address_Village_update())) {
					webElement.click();
					System.out.println("Temporary Address Village:"
							+ ObjectsReporsitory.Communication_Temp_address.getAttribute("value"));
					break;
				}
			}
		}
		// ***************************************************************************

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateTemporaryAddressPincode();
	}

	@Then("^Verify user can able to update Temporary Address$")
	public static void Verify_user_can_able_to_update_Permanent_Address() throws Throwable {

		ObjectsReporsitory.Induction_communication.click();
		Actions actions138 = new Actions(DriverFactory.driver);
		actions138.moveToElement(ObjectsReporsitory.Induction_Hearder_communicationDetails);
		actions138.perform();
		Actions actions139 = new Actions(DriverFactory.driver);
		actions139.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions139.perform();
		wait.until(ExpectedConditions.textToBePresentInElement(ObjectsReporsitory.Communication_emergencyContact_Head,
				"Emergency Contact"));
		ObjectsReporsitory.Communication_Temp_address.clear();
		ObjectsReporsitory.Communication_Temp_address.sendKeys(ConfigFileReader.getTemporary_Address_update2());
		// ***************************************************************************

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyTemporaryupdateAddress();
	}

	@Then("^Verify user can able to update Temporary Address city$")
	public static void Verify_user_can_able_to_update_Temporary_Address_city() throws Throwable {

		ObjectsReporsitory.Induction_communication.click();
		Actions actions140 = new Actions(DriverFactory.driver);
		actions140.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions140.perform();
		ObjectsReporsitory.Communication_Temp_villageTown.clear();
		ObjectsReporsitory.Communication_Temp_villageTown.click();
		ObjectsReporsitory.Communication_Temp_villageTown
				.sendKeys(ConfigFileReader.getTemporary_Address_Village_update_B());
		Thread.sleep(2000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_temp_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getAttribute("title").equals(ConfigFileReader.getTemporary_Address_Village_update2())) {
				webElement.click();
				System.out.println("Updated Temporary Address Village:"
						+ ObjectsReporsitory.Communication_Temp_address.getAttribute("value"));
				break;
			}
		}
		// ***************************************************************************

		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateTemporaryAddresscity();
	}

	@Then("^Verify user can able to update Emergency Contact Name$")
	public static void Verify_user_can_able_to_update_Emergency_Contact_Name() throws Throwable {
		ObjectsReporsitory.Induction_communication.click();
		Actions actions141 = new Actions(DriverFactory.driver);
		actions141.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions141.perform();
		ObjectsReporsitory.Communication_EC_name.clear();
		ObjectsReporsitory.Communication_EC_name.sendKeys(ConfigFileReader.getEmergency_Contact_Name_update());
		System.out.println(
				"Updated Emergency Contact Name: " + ObjectsReporsitory.Communication_EC_name.getAttribute("value"));
		// ***************************************************************************
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateEmergencyContactName();

	}

	@Then("^Verify user can able to update Emergency Contact Mobile Number$")
	public static void Verify_user_can_able_to_update_Emergency_Contact_Mobile_Number() throws Throwable {
		ObjectsReporsitory.Induction_communication.click();
		Actions actions142 = new Actions(DriverFactory.driver);
		actions142.moveToElement(ObjectsReporsitory.Communication_emergencyContact_Head);
		actions142.perform();
		ObjectsReporsitory.Communication_EC_MobileNumber.clear();
		ObjectsReporsitory.Communication_EC_MobileNumber
				.sendKeys(ConfigFileReader.getEmergency_Contact_Mobile_Update());
		System.out.println("Updated Emergency Contact MobileNumber: "
				+ ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value"));
		// ***************************************************************************
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateEmergencyContactMobileNumber();

	}

	@Then("^Verify user can able to update Emergency Contact Relationship$")
	public static void Verify_user_can_able_to_update_Emergency_Contact_Relationship() throws Throwable {
		ObjectsReporsitory.Induction_communication.click();
		Actions actions143 = new Actions(DriverFactory.driver);
		actions143.moveToElement(ObjectsReporsitory.skill_header);
		actions143.perform();
		ObjectsReporsitory.Communication_EC_relationshipWithEmployee.click();
		ObjectsReporsitory.Communication_EC_relationshipWithEmployee.clear();
		ObjectsReporsitory.Communication_EC_relationshipWithEmployee
				.sendKeys(ConfigFileReader.getEmergency_Contact_Relation_update());

		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_relationshipWithEmployee_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals(ConfigFileReader.getEmergency_Contact_Relation_update())) {
				webElement.click();
				System.out.println("Updated Emergency contact relation with employee: "
						+ ObjectsReporsitory.Communication_EC_relationshipWithEmployee.getAttribute("value"));
				break;
			}
		}

		// ***************************************************************************
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateEmergencyContactRelation();

	}

	// **********************

	@Then("^Verify user can able to update Emergency Contact Pincode$")
	public static void Verify_user_can_able_to_update_Emergency_Contact_Pincode() throws Throwable {

		ObjectsReporsitory.Induction_communication.click();
		Actions actions144 = new Actions(DriverFactory.driver);
		actions144.moveToElement(ObjectsReporsitory.skill_header);
		actions144.perform();
		ObjectsReporsitory.Communication_EC_pincode.click();
		ObjectsReporsitory.Communication_EC_pincode.clear();
		ObjectsReporsitory.Communication_EC_pincode.sendKeys(ConfigFileReader.getEmergency_Contact_Pincode_update());
		ObjectsReporsitory.Communication_EC_address.click();
		Thread.sleep(2000);
		System.out.println("Updated Emergency Contact Pincode: "
				+ ObjectsReporsitory.Communication_EC_pincode.getAttribute("value"));
		String Temp_District = ObjectsReporsitory.Communication_EC_District.getAttribute("ng-reflect-model");
		String Temp_State = ObjectsReporsitory.Communication_EC_state.getAttribute("ng-reflect-model");
		System.out.println("Updated Emergency Contact District: " + Temp_District);
		System.out.println("Updated Emergency Contact State: " + Temp_State);
		ObjectsReporsitory.Communication_EC_address.click();
		ObjectsReporsitory.Communication_EC_address.clear();
		ObjectsReporsitory.Communication_EC_address.sendKeys(ConfigFileReader.getEmergency_Contact_Address_update());
		System.out.println("Updated Emergency Contact Address: "
				+ ObjectsReporsitory.Communication_EC_address.getAttribute("value"));
		ObjectsReporsitory.Communication_EC_villageTown.clear();
		ObjectsReporsitory.Communication_EC_villageTown.click();
		ObjectsReporsitory.Communication_EC_villageTown
				.sendKeys(ConfigFileReader.getEmergency_Contact_Village_update());
		Thread.sleep(2000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getAttribute("title").equals(ConfigFileReader.getEmergency_Contact_Village_update_A())) {
				webElement.click();
				System.out.println("Updated Emergency Contact Village:"
						+ ObjectsReporsitory.Communication_EC_villageTown.getAttribute("value"));
				break;
			}
		}

		// ***************************************************************************
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateEmergencyContactPincode();
	}

	@Then("^Verify user can able to update Emergency Contact Address$")
	public static void Verify_user_can_able_to_update_Emergency_Contact_Address() throws Throwable {

		//ObjectsReporsitory.Induction_communication.click();
		Actions actions145 = new Actions(DriverFactory.driver);
		actions145.moveToElement(ObjectsReporsitory.skill_header);actions145.perform();
		Thread.sleep(3000);
		ObjectsReporsitory.Communication_EC_address.click();
		ObjectsReporsitory.Communication_EC_address.clear();
		ObjectsReporsitory.Communication_EC_address.sendKeys(ConfigFileReader.getEmergency_Contact_Address_update2());
		System.out.println("Updated Emergency Contact Address: "
				+ ObjectsReporsitory.Communication_EC_address.getAttribute("value"));
		// ***************************************************************************
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateEmergencyAddressUpdate();
	}

	@Then("^Verify user can able to update Emergency Contact Address city$")
	public static void Verify_user_can_able_to_update_Emergency_Contact_Address_city() throws Throwable {

		//ObjectsReporsitory.Induction_communication.click();
		Actions actions146 = new Actions(DriverFactory.driver);
		actions146.moveToElement(ObjectsReporsitory.skill_header);
		actions146.perform();
		ObjectsReporsitory.Communication_EC_villageTown.clear();
		ObjectsReporsitory.Communication_EC_villageTown.click();
		ObjectsReporsitory.Communication_EC_villageTown
				.sendKeys(ConfigFileReader.getEmergency_Contact_Village_update2());
		Thread.sleep(2000);
		List<WebElement> DropdownResult = ObjectsReporsitory.Communication_EC_villageTown_DR;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getAttribute("title").equals(ConfigFileReader.getEmergency_Contact_Village_update_B())) {
				webElement.click();
				System.out.println("Emergency Contact Address Village:"
						+ ObjectsReporsitory.Communication_EC_villageTown.getAttribute("value"));
				break;
			}
		}
		// ***************************************************************************
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);

//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(ObjectsReporsitory.skill_save);
//		actions4.perform();
//		ObjectsReporsitory.skill_save.click();
//		Thread.sleep(2000);
//		Screenshot.Screenshotforscenario();
//		Basic.popup_Handle2();
		// ***************************************************************************
		DataBaseConnection.getverifyupdateEmergencyAddressVillageUpdate();

	}

}