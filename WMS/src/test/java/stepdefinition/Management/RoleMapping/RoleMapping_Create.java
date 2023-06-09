package stepdefinition.Management.RoleMapping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import utils.DriverFactory;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import io.cucumber.java.en.Then;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Screenshot;

public class RoleMapping_Create {

	public static String Selected_user;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify user can be able to Navigate to Role Mapping")
	public static void Verify_user_can_be_able_to_Navigate_to_Role_Mapping() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_Timeoffice_sidenav));

	}

	@Then("^Verify user can be able to add Time Office role for user")
	public static void Verify_user_can_be_able_to_add_Time_Office_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_Timeoffice_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_Timeoffice_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");
	}

	@Then("^Verify user can be able to add IR Manager role for user")
	public static void Verify_user_can_be_able_to_add_IR_Manager_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_IRManager_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_IRManager_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to add Accounts role for user")
	public static void Verify_user_can_be_able_to_add_Accounts_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_Accounts_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_Accounts_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to add Skill Approver role for user")
	public static void Verify_user_can_be_able_to_add_Skill_Approver_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_SkillApprover_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_SkillApprover_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to add Paramedics role for user")
	public static void Verify_user_can_be_able_to_add_Paramedics_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_Paramedics_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_Paramedics_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to add Medical Officer role for user")
	public static void Verify_user_can_be_able_to_add_Medical_Officer_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_MedicalOfficer_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_MedicalOfficer_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to add Safety Officer role for user")
	public static void Verify_user_can_be_able_to_add_Safety_Officer_role_for_user() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Mapping.click();
		Basic.PageLoader_Validation();
		System.out.println("Adding Time office Role for User");
		System.out.println("--------------------------------------");
		wait.until(ExpectedConditions
				.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_RM_Safety_Officer_sidenav));
		ObjectsReporsitory.WMS_Configuration_RM_Safety_Officer_sidenav.click();
		Basic.PageLoader_Validation();
		RoleMapping_Create.Role_Mapping();
		System.out.println("Time Office Role Has been successfully added to the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	public static void Role_Mapping() throws Throwable {

		System.out.println("Adding Role");
		System.out.println("-------------------");
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_btn_addRole));
		ObjectsReporsitory.WMS_Configuration_btn_addRole.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_addRole_userID));
		ObjectsReporsitory.WMS_Configuration_addRole_userID.click();
		List<WebElement> addRole_userID_DropdownResult = ObjectsReporsitory.WMS_Configuration_addRole_userID_DR;

		if (ConfigFileReader.getconfiguration_addrole_InputType().contains("Input")) {
			ObjectsReporsitory.WMS_Configuration_addRole_userID.click();
			ObjectsReporsitory.WMS_Configuration_addRole_userID.clear();
			ObjectsReporsitory.WMS_Configuration_addRole_userID.click();
			ObjectsReporsitory.WMS_Configuration_addRole_userID
					.sendKeys(ConfigFileReader.getconfiguration_addrole_userIDInput());
			Thread.sleep(3000);

			for (WebElement webElement : addRole_userID_DropdownResult) {
				if (webElement.getText().contains(ConfigFileReader.getconfiguration_addrole_userIDInput())) {
					webElement.click();
					Thread.sleep(2000);
					System.out.println(
							"User ID Selected :" + ObjectsReporsitory.WMS_Configuration_addRole_userID.getText());
					System.out.println("-----------------------------------");
					break;
				} else {
					System.out.println("User ID Not Found for the selected JOB");
					System.out.println("-----------------------------------");
					System.out.println("Selecting Random User");
					System.out.println("-----------------------------------");

					Random randuser = new Random();
					int user = randuser.nextInt(ObjectsReporsitory.WMS_Configuration_addRole_userID_DR.size());
					Selected_user = ObjectsReporsitory.WMS_Configuration_addRole_userID_DR.get(user).getText();

					for (WebElement webElementuser : addRole_userID_DropdownResult) {
						if (webElementuser.getText().equals(Selected_user)) {
							webElementuser.click();
							Thread.sleep(2000);
							System.out.println(
									"Zone Selected :" + ObjectsReporsitory.WMS_Configuration_addRole_userID.getText());
							System.out.println("-----------------------------------");
							break;
						}
					}

				}
			}

		} else if (ConfigFileReader.getconfiguration_addrole_InputType().contains("Random")) {

			System.out.println("Selecting Random User");
			System.out.println("-----------------------------------");

			Thread.sleep(5000);
			wait.until(
					ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_addRole_userID_first));

			Random randuser = new Random();
			int user = randuser.nextInt(ObjectsReporsitory.WMS_Configuration_addRole_userID_DR.size());
			Selected_user = ObjectsReporsitory.WMS_Configuration_addRole_userID_DR.get(user).getText();

			for (WebElement webElement : addRole_userID_DropdownResult) {
				if (webElement.getText().equals(Selected_user)) {
					webElement.click();
					Thread.sleep(2000);
					System.out
							.println("Zone Selected :" + ObjectsReporsitory.WMS_Configuration_addRole_userID.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}

		} else {
			System.out.println("Selecting Random User");
			System.out.println("-----------------------------------");

			Random randuser = new Random();
			int user = randuser.nextInt(ObjectsReporsitory.WMS_Configuration_addRole_userID_DR.size());
			Selected_user = ObjectsReporsitory.WMS_Configuration_addRole_userID_DR.get(user).getText();

			for (WebElement webElement : addRole_userID_DropdownResult) {
				if (webElement.getText().equals(Selected_user)) {
					webElement.click();
					Thread.sleep(2000);
					System.out
							.println("Zone Selected :" + ObjectsReporsitory.WMS_Configuration_addRole_userID.getText());
					System.out.println("-----------------------------------");
					break;
				}
			}
		}
		Basic.PageLoader_Validation();
		System.out.println("User Details");
		System.out.println("-----------------------------------");
		System.out.println("User Name :  " + ObjectsReporsitory.WMS_Configuration_addRole_Name.getText());
		System.out.println("PS Number :  " + ObjectsReporsitory.WMS_Configuration_addRole_PSNumber.getText());
		System.out.println("User Role :  " + ObjectsReporsitory.WMS_Configuration_addRole_Role.getText());
		System.out.println("Job Code :  " + ObjectsReporsitory.WMS_Configuration_addRole_JOBCODE.getText());
		System.out.println("Mobile Number :  " + ObjectsReporsitory.WMS_Configuration_addRole_MobileNumber.getText());
		System.out.println("Email ID :  " + ObjectsReporsitory.WMS_Configuration_addRole_Email.getText());
		System.out.println("-----------------------------------");
		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_addRole_btn_assignRole));
		Screenshot.Screenshotforscenario();
		ObjectsReporsitory.WMS_Configuration_addRole_btn_assignRole.click();
		Basic.PageLoader_Validation();
		Screenshot.Screenshotforscenario();
		Basic.popup_validation();
		Basic.PageLoader_Validation();

	}

	public static void Role_Removing() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_Configuration_tab_Role_Removing));
		ObjectsReporsitory.WMS_Configuration_tab_Role_Removing.click();
		Basic.PageLoader_Validation();
		Basic.popup_validation_Remove_Role();
		Basic.PageLoader_Validation();

	}

	@Then("^Verify user can be able to Remove Time Office role for user")
	public static void Verify_user_can_be_able_to_Remove_Time_Office_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_Time_Office_role_for_user();
		System.out.println("Removing Time Office Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("Time Office Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");
	}

	@Then("^Verify user can be able to Remove IR Manager role for user")
	public static void Verify_user_can_be_able_to_Remove_IR_Manager_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_IR_Manager_role_for_user();
		System.out.println("Removing IR Manager Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("IR Manager Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to Remove Accounts role for user")
	public static void Verify_user_can_be_able_to_Remove_Accounts_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_Accounts_role_for_user();
		System.out.println("Removing Accounts Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("Accounts Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to Remove Skill Approver role for user")
	public static void Verify_user_can_be_able_to_Remove_Skill_Approver_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_Skill_Approver_role_for_user();
		System.out.println("Removing Skill Approver Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("Skill Approver Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to Remove Paramedics role for user")
	public static void Verify_user_can_be_able_to_Remove_Paramedics_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_Paramedics_role_for_user();
		System.out.println("Removing Paramedics Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("Paramedics Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

	@Then("^Verify user can be able to Remove Medical Officer role for user")
	public static void Verify_user_can_be_able_to_Remove_Medical_Officer_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_Medical_Officer_role_for_user();
		System.out.println("Removing Medical Officer Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("Medical Officer Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");
	}

	@Then("^Verify user can be able to Remove Safety Officer role for user")
	public static void Verify_user_can_be_able_to_Remove_Safety_Officer_role_for_user() throws Throwable {

		RoleMapping_Create.Verify_user_can_be_able_to_add_Safety_Officer_role_for_user();
		System.out.println("Removing Safety Officer Role for the selected User");
		System.out.println("--------------------------------------------------------------------");
		RoleMapping_Create.Role_Removing();
		System.out.println("Safety Officer Role Has been successfully Removed for the selected User");
		System.out.println("--------------------------------------------------------------------");

	}

}
