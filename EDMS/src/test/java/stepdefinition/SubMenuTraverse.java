package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object_repository.Actions.SubMenuTraverseActions;
import object_repository.Actions.MenuTraverseActions;

public class SubMenuTraverse {
	
	SubMenuTraverseActions subMenu=new SubMenuTraverseActions();
	MenuTraverseActions menuActions=new MenuTraverseActions();
	
	@Then("^as a user i should able to mouse hover Engineering Schedule in main menu$")
	public void as_a_user_i_should_able_to_mouse_hover_Engineering_Schedule_in_main_menu() throws Throwable {
		menuActions.mainMenu();
		Thread.sleep(2000);
		subMenu.engrSchedule();
	}

	@Then("^as a user i should able to select Schedule Definition in main menu$")
	public void as_a_user_i_should_able_to_select_Schedule_Definition_in_main_menu() throws Throwable {
		System.out.println(" Schedule Definition");
	    subMenu.scheduleDefinition();
	    System.out.println("Schedule Definition Completed");
	    
	}

	@Then("^as a user i should able to select Change Control Note in main menu$")
	public void as_a_user_i_should_able_to_select_Change_Control_Note_in_main_menu() throws Throwable {
//		menuActions.mainMenu();
//		Thread.sleep(2000);
		System.out.println("Change Control note");
	    subMenu.changeControlNote();
	    System.out.println("Change Control note Completed");
	}
	
	@Then("^as a user i should able to mouse hover Project Configuration in main menu$")
	public void as_a_user_i_should_able_to_mouse_hover_Project_Configuration_in_main_menu() throws Throwable {
//		menuActions.mainMenu();
//		Thread.sleep(2000);
		subMenu.projectConig();
	    
	}

	@Then("^as a user i should able to select Organization Link in main menu$")
	public void as_a_user_i_should_able_to_select_Organization_Link_in_main_menu() throws Throwable {
	   subMenu.organizationLink();
	    
	}
	
	@Then("^as a user i should able to select Project Member Link in main menu$")
	public void as_a_user_i_should_able_to_select_Project_Member_Link_in_main_menu() throws Throwable {
	      subMenu.projectMembersLink();
	      
	}

	@Then("^as a user i should able to select role feature in main menu$")
	public void as_a_user_i_should_able_to_select_role_feature_in_main_menu() throws Throwable {
	      subMenu.roleFeature();
	}
	
	@Then("^as a user i should able to select role member in main menu$")
	public void as_a_user_i_should_able_to_select_role_member_in_main_menu() throws Throwable {
	      subMenu.roleMembersLink();
	}
	
	@Then("^as a user i should able to select role menu in main menu$")
	public void as_a_user_i_should_able_to_select_role_menu_in_main_menu() throws Throwable {
	      subMenu.roleMenuLink();
	      
	}
	
	@Then("^as a user i should able to select element link in main menu$")
	public void as_a_user_i_should_able_to_select_element_link_in_main_menu() throws Throwable {
	      subMenu.elementLink();
	}
	
	@Then("^as a user i should able to select element details link in main menu$")
	public void as_a_user_i_should_able_to_select_element_details_link_in_main_menu() throws Throwable {
	      subMenu.elementDetailsLink();
	      
	}
	
	@Then("^as a user i should able to select member discipline in main menu$")
	public void as_a_user_i_should_able_to_select_member_discipline_in_main_menu() throws Throwable {
	      subMenu.memberDiscipline();
	      
	}

	@Then("^as a user should able to click workflow template in main menu$")
	public void as_a_user_should_able_to_click_workflow_template_in_main_menu() throws Throwable {
	      subMenu.workFlowTemplate();
	      
	}

	@Then("^user should able to click delegate in Main menu$")
	public void user_should_able_to_click_delegate_in_Main_menu() throws Throwable {
	      subMenu.delegateAccess();
	}

	@Then("^user should able to select document Revision Link in Main menu$")
	public void user_should_able_to_select_document_Revision_Link_in_Main_menu() throws Throwable {
	      subMenu.documentRevisionLink();
	}
	
	@Then("^user should able to select project tender quantity Link in Main menu$")
	public void user_should_able_to_select_project_tender_quantity_Link_in_Main_menu() throws Throwable {
	      subMenu.projectTenderQuantity();
	}
}
