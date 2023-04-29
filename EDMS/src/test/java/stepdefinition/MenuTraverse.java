package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object_repository.Actions.MenuTraverseActions;

public class MenuTraverse {
	
	MenuTraverseActions menuActions=new MenuTraverseActions();
	
	@And ("^as a user i should able to click EDMS home page main menu$")
	public void as_a_user_i_should_able_to_click_EDMS_home_page_main_menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
	}
	@Then("^user should able to select Engineering Schedule Doc in Main Menu$")
	public void user_should_able_to_select_Engineering_Schedule_Doc_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.engineeringSchedule();
	}

	@Then("^user should able to select Respond Workflow in Main Menu$")
	public void user_should_able_to_select_Respond_Workflow_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.respondWorkflow();
	}

	@Then("^user should able to select Communication in Main Menu$")
	public void user_should_able_to_select_Communication_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.communication();
	}

	@Then("^user should able to select Transmittal in Main Menu$")
	public void user_should_able_to_select_Transmittal_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.transmittal();
	}

	@Then("^user should able to select Project Configuration in Main Menu$")
	public void user_should_able_to_select_Project_Configuration_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.projectConfiguration();
	}

	@Then("^user should able to select Masters in Main Menu$")
	public void user_should_able_to_select_Masters_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.master();
	}

	@Then("^user should able to select Dashboard Reports in Main Menu$")
	public void user_should_able_to_select_Dashboard_Reports_in_Main_Menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		menuActions.dashboardReports();
	}
	
	@Then("^user should able to select Repository Document in Main Menu$")
	public void user_should_able_to_select_Repository_Document_in_Main_Menu() throws Throwable {
		
		menuActions.repositoryDocument();
	}

}

