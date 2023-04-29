package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import object_repository.FIN_Scrutiny_Coding;


public class FIN_Scrutiny {
	
	
	public FIN_Scrutiny() { 
		PageFactory.initElements(Webdriver.driver, FIN_Scrutiny_Coding.class);
	}
	
	@Given("^Login Function$")
	public void login_Function() throws Throwable {
		Login_Function.FIN_Scrutiny_Login.loginFunction();
	}

	@Given("^Navigate Menu From Scrutiny$")
	public void navigate_Menu_From_Scrutiny() throws Throwable {
	    Login_Function.FIN_Scrutiny_Login.Menu_to_Scrutiny();
	}

	@Given("^Click on Filter Icon$")
	public void click_on_Filter_Icon() throws Throwable {
	    Login_Function.FIN_Scrutiny_Login.Filter_icon();
	}

	@Given("^Pass Invoice Reg No From DB Connection$")
	public void pass_Invoice_Reg_No_From_DB_Connection() throws Throwable {
	    Login_Function.FIN_Scrutiny_Login.Pass_Invoice_No();
	}

	@Given("^Edit Scrutinize Material$")
	public void edit_Scrutinize_Material() throws Throwable {
	    Login_Function.FIN_Scrutiny_Login.Edit();
	}

	@Given("^Get Work Order No In Text$")
	public void get_Work_Order_No_In_Text() throws Throwable {
		Login_Function.FIN_Scrutiny_Login.WO_No();
	}

	@Given("^Submit Scrutinize$")
	public void submit_Scrutinize() throws Throwable {
		Login_Function.FIN_Scrutiny_Login.Approve();
	}

	@Given("^Signout Function$")
	public void signout_Function() throws Throwable {
		Login_Function.FIN_Scrutiny_Login.Signout();
	}

}
