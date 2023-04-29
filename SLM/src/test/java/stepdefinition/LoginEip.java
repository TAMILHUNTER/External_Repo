package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import repository.Actions.LoginEipActions;

public class LoginEip {
	
	LoginEipActions login=new LoginEipActions();
	
	@Given("^go to EIP login page$")
	public void go_to_EIP_login_page() throws Throwable {
	    login.logineiphomepage();
	      
	}

	@When("^click eip otheruser login button$")
	public void click_eip_otheruser_login_button() throws Throwable {
	    login.otheruser();
	      
	}

	@When("^enter eip login username and password$")
	public void enter_eip_login_username_and_password() throws Throwable {
	   login.userNameAndPassword();
	      
	}

	@When("^click eip Log in button$")
	public void click_eip_Log_in_button() throws Throwable {
	    login.login();
	      
	}

	@When("^click main menu$")
	public void click_main_menu() throws Throwable {
	    login.mainMenu();
	      
	}

	@When("^click supply chain management$")
	public void click_supply_chain_management() throws Throwable {
	    login.supplyCainManagement();
	      
	}

	@When("^click warehouse$")
	public void click_warehouse() throws Throwable {
	    login.warehouse();
	      
	}

	@When("^click materl receipt note$")
	public void click_materl_receipt_note() throws Throwable {
	    login.materailReceiptNote();
	      
	}
}
