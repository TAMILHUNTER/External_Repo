package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import object_repository.SCM_Bill_Creation_Coding;

public class SCM_Bill_Creation_Single_Material {

	public SCM_Bill_Creation_Single_Material() { 
		PageFactory.initElements(Webdriver.driver, SCM_Bill_Creation_Coding.class);
	}
	
	@Given("^Login UserName and Password For Bill Creation$")
	public void login_UserName_and_Password_For_Bill_Creation() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.loginFunction();
	}

	@Given("^Navigate From Menu to Bill Create$")
	public void navigate_From_Menu_to_Bill_Create() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Menu_to_Bill_Create();
	}

	@Given("^Click on Filter Icon To Pass value$")
	public void click_on_Filter_Icon_To_Pass_value() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Filter_Icon();
	}

	@Given("^Create to Bill Create$")
	public void create_to_Bill_Create() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Bill_Creation();
	}

	@Given("^Click On Measurment Details$")
	public void click_On_Measurment_Details() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Measurment();
	}

	@Given("^Select Material in Radio Box$")
	public void select_Material_in_Radio_Box() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Select_material();
	}

	@Given("^Approve Qty$")
	public void approve_Qty() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Approveqty();
	}

	@Given("^Select On Measurment Material$")
	public void select_On_Measurment_Material() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Approve_Select_material();
	}

	@Given("^This Qty Change$")
	public void this_Qty_Change() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.This_qty();
	}

	@Given("^Save Measurement Approve Qty$")
	public void save_Measurement_Approve_Qty() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Measurment_Save();
	}

	@Given("^Close to Page Measurment in This Qty$")
	public void close_to_Page_Measurment_in_This_Qty() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.close_page_Approve();
	}

	@Given("^Submit Measurment and Pop Handle$")
	public void submit_Measurment_and_Pop_Handle() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Submit_Billcreation();
	}

	@When("^Login UserName and Password For Bill Deduction$")
	public void login_UserName_and_Password_For_Bill_Deduction() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.login_Bill_deduction();
	}

	@When("^Navigate From Menu to Bill Deduction$")
	public void navigate_From_Menu_to_Bill_Deduction() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Menu_to_Bill_Create();
	}

	@When("^Click on Inprogess to Select Material$")
	public void click_on_Inprogess_to_Select_Material() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Click_Inprogess();
	}

	@When("^MouseOver to Click on Bill Deduction Icon$")
	public void mouseover_to_Click_on_Bill_Deduction_Icon() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Bill_Deduction();
	}

	@When("^TDS Update Click to Select to selection$")
	public void tds_Update_Click_to_Select_to_selection() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.TDS_Update();
	}

	@When("^save to TDS Update$")
	public void save_to_TDS_Update() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Save_TDS();
	}

	@When("^Sub contractor Invoice Value Pass$")
	public void sub_contractor_Invoice_Value_Pass() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Sub_Contractor_Invoice();
	}

	@When("^Invoice Date Select$")
	public void invoice_Date_Select() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Invoice_Date();
	}

	@When("^Select on Payment Type$")
	public void select_on_Payment_Type() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Payment_Type();
	}

	@When("^Submit to Bill Deduction$")
	public void submit_to_Bill_Deduction() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Submit_Bill_Deduction();
	}

	@Then("^Login UserName and Password For Bill Approve$")
	public void login_UserName_and_Password_For_Bill_Approve() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Login_Bill_Approve();
	}

	@Then("^Click to Filter Icon$")
	public void click_to_Filter_Icon() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Click_Filter();
	}

	@Then("^Click Document No and pass value$")
	public void click_Document_No_and_pass_value() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Filter_Document();
	}

	@Then("^MouseOver to Document No$")
	public void mouseover_to_Document_No() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.MouseOver();
	}

	@Then("^Approve to Bill$")
	public void approve_to_Bill() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Approve();
	}
	@Given("^Sign Out$")
	public void sign_Out() throws Throwable {
		 Login_Function.SCM_Bill_Creation_Login.Signout();
		 System.out.println("Successfully Created");
	}

	@When("^Sign Out1$")
	public void sign_Out1() throws Throwable {
		 Login_Function.SCM_Bill_Creation_Login.Signout();
		 System.out.println("Successfully Deduction");
	}

	@Then("^Sign Out2$")
	public void sign_Out2() throws Throwable {
	    Login_Function.SCM_Bill_Creation_Login.Signout();
	    System.out.println("Successfully Approved");
	}

	
	
}
