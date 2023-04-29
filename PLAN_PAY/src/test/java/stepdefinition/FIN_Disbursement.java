package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import object_repository.FIN_Disbursement_Coding;

public class FIN_Disbursement {

	public FIN_Disbursement() {
		PageFactory.initElements(Webdriver.driver, FIN_Disbursement_Coding.class);
	}
	
	@Given("^Login Function Disbursement$")
	public void login_Function_Disbursement() throws Throwable {
	    Login_Function.FIN_Disbursement_Login.loginFunction();
	}

	@Given("^Navigate Menu From Disbursement$")
	public void navigate_Menu_From_Disbursement() throws Throwable {
		Login_Function.FIN_Disbursement_Login.Menu_to_Disbursement();
	}

	@Given("^Select Document Type$")
	public void select_Document_Type() throws Throwable {
		Login_Function.FIN_Disbursement_Login.Document_Type();
	}

	@Given("^Click on Go Icon$")
	public void click_on_Go_Icon() throws Throwable {
		Login_Function.FIN_Disbursement_Login.GO();
	}

	@Given("^Click  Filter Icon$")
	public void click_Filter_Icon() throws Throwable {
		Login_Function.FIN_Disbursement_Login.Filter();
	}

	@Given("^Pass Document No From DB Connection$")
	public void pass_Document_No_From_DB_Connection() throws Throwable {
		Login_Function.FIN_Disbursement_Login.From_DB();
	}

	@Given("^Click on Disburse$")
	public void click_on_Disburse() throws Throwable {
		Login_Function.FIN_Disbursement_Login.Disburse();
	}

	@Given("^PopHandle in Select Material$")
	public void pophandle_in_Select_Material() throws Throwable {
		Login_Function.FIN_Disbursement_Login.select_material_popup();
	}

	@Given("^Select Bank Name$")
	public void select_Bank_Name() throws Throwable {
		Login_Function.FIN_Disbursement_Login.Bank_Name();
	}

	@Given("^Submit Disbursement$")
	public void submit_Disbursement() throws Throwable {
		Login_Function.FIN_Disbursement_Login.Submit();
	}

	@Given("^Handle Popup Confirmation$")
	public void handle_Popup_Confirmation() throws Throwable {
		Login_Function.FIN_Disbursement_Login.popup_confirmation();
	}

	@Given("^Signout Function Disbursement$")
	public void signout_Function_Disbursement() throws Throwable {
		Login_Function.FIN_Disbursement_Login.signout();
	}
	
}
