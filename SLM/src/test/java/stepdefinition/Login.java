package stepdefinition;
import cucumber.api.java.en.Given;
import repository.Actions.LoginActions;
public class Login {
	 
	LoginActions loginactions=new LoginActions();
	
	@Given("^As a user i should able to view the home page$") 
	public void as_a_user_i_should_able_to_view_the_home_page() throws Throwable {
		loginactions.homepage();	    
	} 

	@Given("^As user i should able to click otheruser login button$")
	public void as_user_i_should_able_to_click_otheruser_login_button() throws Throwable {
		loginactions.otheruserLogin();
	}  
  
	@Given("^As a user i should able to login$")
	public void as_a_user_i_should_able_to_login() throws Throwable {
	      
	} 
	@Given("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		loginactions.username_password();
	}   

	@Given("^click Log in button$")
	public void click_Log_in_button() throws Throwable {
		loginactions.submit();
	}

	@Given("^user should be able to login successfully$") 
	public void user_should_be_able_to_login_successfully() throws Throwable {
		loginactions.verify();	    
	}
	
	@Given("^approver should be able to login successfully$") 
	public void approver_should_be_able_to_login_successfully() throws Throwable {
		loginactions.verifyApprover();	    
	}
}