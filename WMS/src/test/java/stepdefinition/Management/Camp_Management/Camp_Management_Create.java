package stepdefinition.Management.Camp_Management;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import utils.DriverFactory;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import test.DataBaseConnection;

public class Camp_Management_Create {

	public static int popup_validation;
	public static int length_of_spinner;
	public static String Selected_Village;
	public static int Random_room;
	public static int Random_room_size;
	public static int Random_area_size;
	public static int WorkmenCount_in_Room;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************

	@Given("^Login and Navigate to Camp Management$")
	public static void Login_and_Navigate_to_Camp_Management() throws Throwable {

		stepdefinition.Login.Use_Login_Camp_Management();

		// Navigate to Induction & Switch Job

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_accessBasedMenu));
		ObjectsReporsitory.Home_accessBasedMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Menu_workmenManagementSystem));
		ObjectsReporsitory.Menu_workmenManagementSystem.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS40));
		ObjectsReporsitory.WMS40.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		Thread.sleep(3000);
		Basic.popup_Handle_IC_dash();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
		ObjectsReporsitory.WMS_induction2.click();
		Thread.sleep(3000);
		Basic.PageLoader_Validation();
		// ObjectsReporsitory.Menu_Navigation_Close.click();
		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.equals(ConfigFileReader.getJob_LE180046())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getJob_LE180046());
		} else if (ConfigFileReader.getUser_job().equals("LE180046")) {
			SwitchJob_Create.SwitchJob_LE180046();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmenSearch_Domestic));

		// Navigate to Camp Management

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_sidenav));
		ObjectsReporsitory.WMS_Management_sidenav.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt));
		ObjectsReporsitory.WMS_Management_Camp_Mngt.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp));
		System.out.println("Navigated to Camp Management");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to add camp name")
	public static void Verify_User_can_be_able_to_add_camp_name() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp.click();
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_campName));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_campName.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_campName.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_campName.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_campName
				.sendKeys(RandomString.make(5) + ConfigFileReader.getcamp_name());
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_address));
		System.out.println("Camp Name added successfully");
		System.out.println("------------------------------");

	}

	@Then("^Verify User can be able to add camp address$")
	public static void Verify_User_can_be_able_to_add_camp_address() throws Throwable {

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_address));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_address.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_address.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_address.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_address
				.sendKeys(RandomString.make(5) + ConfigFileReader.getcamp_address());
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_pincode));
		System.out.println("Camp Address added successfully");
		System.out.println("------------------------------");

	}

	@Then("^Verify User can be able to add camp Pincode$")
	public static void Verify_User_can_be_able_to_add_camp_Pincode() throws Throwable {
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_pincode));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_pincode.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_pincode.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_pincode.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_pincode.sendKeys(ConfigFileReader.getcamp_pincode());

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_village));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_village.click();
		Thread.sleep(3000);

		List<WebElement> DropdownResult4 = ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_village_DR;

		Random rand6547 = new Random();
		int Camp_village = rand6547.nextInt(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_village_DR.size());
		Selected_Village = ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_village_DR.get(Camp_village).getText();

		for (WebElement webElement : DropdownResult4) {
			if (webElement.getText().equals(Selected_Village)) {
				webElement.click();
				Thread.sleep(3000);
				break;
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Submit));
		System.out.println("Camp Address Pincode added successfully");
		System.out.println("------------------------------");
	}

	@Then("^Verify User can be able to save camp details$")
	public static void Verify_User_can_be_able_to_save_camp_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Submit));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp));
		System.out.println("Camp details saved successfully");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to Add Camp Structure name$")
	public static void Verify_User_can_be_able_to_add_camp_structure_name() throws Throwable {

		if (ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_allele.size() == 0) {
			System.out.println("No Camp Found - Adding New Camp");
			System.out.println("---------------------------------");
			Camp_Management_Create.Verify_User_can_be_able_to_add_camp_name();
			Camp_Management_Create.Verify_User_can_be_able_to_add_camp_address();
			Camp_Management_Create.Verify_User_can_be_able_to_add_camp_Pincode();
			Camp_Management_Create.Verify_User_can_be_able_to_save_camp_details();
			Camp_Management_Create.Verify_User_can_be_able_to_add_camp_structure_name();
		} else if (ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_allele.size() > 0) {
			System.out.println("Adding camp Structure");
			System.out.println("---------------------------------");
			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_First));
			ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_First.click();
			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Name));
			ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Name.click();
			ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Name.clear();
			ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Name.click();
			ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Name
					.sendKeys(RandomString.make(5) + ConfigFileReader.getcamp_Structure_name());
			System.out.println("Camp Structure Name Added");
			System.out.println("---------------------------------");
			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room));

		} else {
			System.out.println("Invalid Camp entries - Kindly Check");
			System.out.println("---------------------------------------");
		}

	}

	@Then("^Verify User can be able to Add Room count to Camp Structure$")
	public static void Verify_User_can_be_able_to_Add_Room_count_to_Camp_Structure() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room.click();

		int min_room = 1;
		int max_room = 25;
		Random rand6dsa = new Random();
		Random_room = rand6dsa.nextInt(max_room - min_room) + min_room;

		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room.sendKeys("" + Random_room);

		System.out.println("Room count added for Camp Structure");
		System.out.println("---------------------------------");
	}

	@Then("^Verify User can be able to save camp Structure details$")
	public static void Verify_User_can_be_able_to_save_camp_Structure_details() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room_submit));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp_Structure_Room_submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp));
		System.out.println("Camp Structure details saved successfully");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to Add Camp room name$")
	public static void Verify_User_can_be_able_to_add_room_name() throws Throwable {

		if (ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_allele.size() == 0) {
			System.out.println("No Camp Structure Found - Adding New Camp Structure");
			System.out.println("---------------------------------");
			Camp_Management_Create.Verify_User_can_be_able_to_add_camp_structure_name();
			Camp_Management_Create.Verify_User_can_be_able_to_Add_Room_count_to_Camp_Structure();
			Camp_Management_Create.Verify_User_can_be_able_to_save_camp_Structure_details();
			Camp_Management_Create.Verify_User_can_be_able_to_add_room_name();

		}

		else if (ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_allele.size() > 0) {
			System.out.println("Adding new room details");
			System.out.println("---------------------------------");
			wait.until(
					ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_first));
			ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_first.click();
			wait.until(
					ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_name));
			ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_name.click();
			ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_name.clear();
			ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_name.click();
			ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_name
					.sendKeys(RandomString.make(5) + ConfigFileReader.getcamp_Structure_name());
			System.out.println("Camp Room Name Added");
			System.out.println("---------------------------------");
			wait.until(ExpectedConditions
					.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable));

		} else {
			System.out.println("Invalid Camp entries - Kindly Check");
			System.out.println("---------------------------------------");
		}

	}

	@Then("^Verify User can be able to Add max bed count in room$")
	public static void Verify_User_can_be_able_max_bed_count_in_room() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable.click();

		int min_room = 1;
		int max_room = 10;
		Random rand6dsadas = new Random();
		Random_room_size = rand6dsadas.nextInt(max_room - min_room) + min_room;

		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable.sendKeys("" + Random_room_size);

		System.out.println("Max Room count added");
		System.out.println("---------------------------------");

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Areainsqmeters));

	}

	@Then("^Verify User can be able to Add area size of room$")
	public static void Verify_User_can_be_able_to_Add_area_size_of_room() throws Throwable {

		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Areainsqmeters));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Areainsqmeters.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Areainsqmeters.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Areainsqmeters.click();

		int min_Size = 1;
		int max_Size = 10;
		Random rand6dsadas = new Random();
		Random_area_size = rand6dsadas.nextInt(max_Size - min_Size) + min_Size;

		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Areainsqmeters.sendKeys("" + Random_area_size);

		System.out.println("area size in sq.meters added");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to save camp room details$")
	public static void Verify_User_can_be_able_to_save_camp_room_details() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Submit));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_Addroom_Submit.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_AddCamp));
		System.out.println("Room details saved successfully");
		System.out.println("---------------------------------");

	}

	@Then("^Verify User can be able to select room$")
	public static void Verify_User_can_be_able_to_select_room() throws Throwable {
		if (ObjectsReporsitory.WMS_Management_Camp_Mngt_roomtab_allele.size() == 0) {
			System.out.println("No Rooms Found - Adding New room to Camp Structure");
			System.out.println("---------------------------------");
			Camp_Management_Create.Verify_User_can_be_able_to_add_room_name();
			Camp_Management_Create.Verify_User_can_be_able_max_bed_count_in_room();
			Camp_Management_Create.Verify_User_can_be_able_to_Add_area_size_of_room();
			Camp_Management_Create.Verify_User_can_be_able_to_save_camp_room_details();
			Camp_Management_Create.Verify_User_can_be_able_to_select_room();

		} else if (ObjectsReporsitory.WMS_Management_Camp_Mngt_roomtab_allele.size() > 0) {
			System.out.println("Selecting Camp room");
			System.out.println("---------------------------------");
			wait.until(
					ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_roomtab_first));
			ObjectsReporsitory.WMS_Management_Camp_Mngt_roomtab_first.click();
			wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_room_WMID));
			System.out.println("Camp room selected");
			System.out.println("---------------------------------");
		} else {
			System.out.println("Invalid Camp entries - Kindly Check");
			System.out.println("---------------------------------------");
		}
	}

	@Then("^Verify User can be able to Add workmen to room$")
	public static void Verify_User_can_be_able_to_Add_workmen_to_room() throws Throwable {

		System.out.println("Adding Workmen to Camp room");
		System.out.println("---------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_roomtab_last));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_roomtab_last.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_room_WMID));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_room_WMID.click();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_room_WMID.clear();
		ObjectsReporsitory.WMS_Management_Camp_Mngt_room_WMID.click();
		DataBaseConnection.GetWorkmenIDforCamp();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Management_Camp_Mngt_room_workmen_Addbtn));
		ObjectsReporsitory.WMS_Management_Camp_Mngt_room_workmen_Addbtn.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation();
		System.out.println("Workmen Has been added to the selected camp room");
		System.out.println("---------------------------------------");

	}

	@Then("^Verify User can be able to view workmen details in room$")
	public static void Verify_User_can_be_able_to_view_workmen_details_in_room() throws Throwable {

		System.out.println("View Workmen Details in Selected Room");
		System.out.println("---------------------------------");
		WorkmenCount_in_Room = ObjectsReporsitory.WMS_Management_Camp_Mngt_workmen_count_in_room.size();
		System.out.println("Total Workmen in Selected Room : " + WorkmenCount_in_Room);

		if (WorkmenCount_in_Room == 0) {
			System.out.println("No Workmen Available in selected Room");
			System.out.println("---------------------------------------");
		} else if (WorkmenCount_in_Room > 0) {

			for (WebElement elementName : ObjectsReporsitory.WMS_Management_Camp_Mngt_workmen_Name_in_room) {
				String WorkmenName = elementName.getText();
				System.out.println("Workmen Name : " + WorkmenName);
				System.out.println("---------------------------------------");
			}

			for (WebElement elementSkill : ObjectsReporsitory.WMS_Management_Camp_Mngt_workmen_Skill_in_room) {
				String WorkmenSkill = elementSkill.getText();
				System.out.println("Workmen Skill : " + WorkmenSkill);
				System.out.println("---------------------------------------");
			}

			for (WebElement elementNumber : ObjectsReporsitory.WMS_Management_Camp_Mngt_workmen_Number_in_room) {
				String WorkmenNumber = elementNumber.getText();
				System.out.println(WorkmenNumber);
				System.out.println("---------------------------------------");
			}

			for (WebElement elementPartnerID : ObjectsReporsitory.WMS_Management_Camp_Mngt_workmen_PartnerID_in_room) {
				String WorkmenPartnerID = elementPartnerID.getText();
				System.out.println(WorkmenPartnerID);
				System.out.println("---------------------------------------");
			}

			for (WebElement elementOccupied : ObjectsReporsitory.WMS_Management_Camp_Mngt_workmen_Occupied_in_room) {
				String WorkmenOccupied = elementOccupied.getText();
				System.out.println(WorkmenOccupied);
				System.out.println("---------------------------------------");
			}

		} else {
			System.out.println("Invalid Camp entries - Kindly Check");
			System.out.println("---------------------------------------");
		}

	}
}
