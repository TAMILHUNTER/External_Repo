package stepdefinition;
 
import cucumber.api.java.en.Given;
import repository.Actions.MenuTraverseActions;
 
  
public class MenuTraverse {
	MenuTraverseActions menuAction=new MenuTraverseActions(); 
	@Given("^user should able to click main menu$")  
	public void user_should_able_to_click_main_menu() throws Throwable {
		MenuTraverseActions.mainMenu();	  
	}  
	@Given("^user should able to enter main menu$")
	public void user_should_able_to_enter_main_menu() throws Throwable {
		MenuTraverseActions.clickMainMenu();	       
	}
	@Given("^user should able to navigate to Supply Chain Management$")
	public void user_should_able_to_navigate_to_Supply_Chain_Management() throws Throwable {
		MenuTraverseActions.supplychainManagement();	       
	}   
	@Given("^user should able to navigate to submenu Logistics$")
	public void user_should_able_to_navigate_to_submenu_Logistics() throws Throwable {
		MenuTraverseActions.Logistics();	      
	} 
	@Given("^user should able to navigate to submenu Master$")
	public void user_should_able_to_navigate_to_submenu_Master() throws Throwable {
		MenuTraverseActions.Masters();	      
	}  

	@Given("^user should landed in Rate Contract$")
	public void user_should_landed_in_Rate_Contractt() throws Throwable {
		MenuTraverseActions.rateContract();	      
	}	
}