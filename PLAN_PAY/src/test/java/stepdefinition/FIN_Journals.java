package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import object_repository.FIN_Journals_Coding;

public class FIN_Journals {
	
	public FIN_Journals() { 
		PageFactory.initElements(Webdriver.driver, FIN_Journals_Coding.class);
	}
	
	@Given("^Login Function Journals$")
	public void login_Function_Journals() throws Throwable {
		Login_Function.FIN_Journals_login.loginFunction_Journals();
	}
	
	@Given("^Navigate Menu From Journals$")
	public void navigate_Menu_From_Journals() throws Throwable {
	    Login_Function.FIN_Journals_login.Menu_to_Journals();
	}
	
	@Given("^Click on Filter Icon Journals$")
	public void click_on_Filter_Icon_Journals() throws Throwable {
	    Login_Function.FIN_Journals_login.Filter_Icon_Journals();
	}

	@Given("^Pass Invoice Regs No From DB Connection$")
	public void pass_Invoice_Regs_No_From_DB_Connection() throws Throwable {
	    Login_Function.FIN_Journals_login.Pass_Ivoice_No();
	}

	@Given("^Edit Journals Material$")
	public void edit_Journals_Material() throws Throwable {
	    Login_Function.FIN_Journals_login.Edit();
	}

	@Given("^Check Work Order No in page$")
	public void check_Work_Order_No_in_page() throws Throwable {
	    Login_Function.FIN_Journals_login.WO_NO();
	}

	@Given("^Submit Journals$")
	public void submit_Journals() throws Throwable {
	    Login_Function.FIN_Journals_login.Approve();
	}

	@Given("^signout Function$")
	public void signout_Function() throws Throwable {
	    Login_Function.FIN_Journals_login.signout();
	}
	
	
	

}
