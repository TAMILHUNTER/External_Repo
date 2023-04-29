package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import object_repository.SCM_SR_Coding;

public class SCM_SR {

//  Stright Flow:
	@Given("^Login Stright Flow username and Pasword$")
	public void login_Stright_Flow_username_and_Pasword() throws Throwable {
		Login_Function.SCM_SR_Login.login();
	}

	@Given("^Navigate From Menu to SR In Stright Flow$")
	public void navigate_From_Menu_to_SR_In_Stright_Flow() throws Throwable {
		Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@Given("^Creation from SR Stright Flow$")
	public void creation_from_SR_Stright_Flow() throws Throwable {
		Login_Function.SCM_SR_Login.Creation();
	}

	@Given("^Stright Material Card$")
	public void stright_Material_Card() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single();
	}

	@Given("^Stright WBS and Cost Package$")
	public void stright_WBS_and_Cost_Package() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage();
	}

	@Given("^Stright Quantiy and Rate$")
	public void stright_Quantiy_and_Rate() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate();
	}

	@Given("^Submit Card material in Stright$")
	public void submit_Card_material_in_Stright() throws Throwable {
		Login_Function.SCM_SR_Login.submit();
	}

	@Given("^Signout in Stright$")
	public void signout_in_Stright() throws Throwable {
		Login_Function.SCM_SR_Login.SignOut();
	}

//	In Progress:
	@Given("^Login Stright Flow Inprogress Username and Password$")
	public void login_Stright_Flow_Inprogress_Username_and_Password() throws Throwable {
		Login_Function.SCM_SR_Login.login();
	}

	@Given("^Navigate From Menu to SR Inprogress$")
	public void navigate_From_Menu_to_SR_Inprogress() throws Throwable {
		Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@Given("^Checking on Inprogress Flow$")
	public void checking_on_Inprogress_Flow() throws Throwable {
		Login_Function.SCM_SR_Login.Inprogess();
	}

	@Given("^Checking on WorkFlow Trace$")
	public void checking_on_WorkFlow_Trace() throws Throwable {
		Login_Function.SCM_SR_Login.WorkFlow_Trace();
	}
	
	@Given("^Checking All Tab Creation in Stright Case$")
	public void Checking_All_Tab_Creation_in_Stright_Case() throws Throwable {
		Login_Function.SCM_SR_Login.All_Tab_Checking();
	}

	@Given("^Click in Signout$")
	public void click_in_Signout() throws Throwable {
		Login_Function.SCM_SR_Login.SignOut();
	}
	
//	Approver Full Flow In Stright Cases:
	@When("^Login Stright Flow Approver Username nd Password$")
	public void login_Stright_Flow_Approver_Username_nd_Password() throws Throwable {
	    Login_Function.SCM_SR_Login.Approver_login();
	}

	@When("^Approver Stright Flow Navigate From Menu to SR$")
	public void approver_Stright_Flow_Navigate_From_Menu_to_SR() throws Throwable {
	    Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@When("^Checking ForAction Function Full Flow Stright Case$")
	public void checking_ForAction_Function_Full_Flow_Stright_Case() throws Throwable {
	    Login_Function.SCM_SR_Login.Approver();
	}

	@When("^Checking All Function in Approver Fro Stright Flow$")
	public void checking_All_Function_in_Approver_Fro_Stright_Flow() throws Throwable {
	    Login_Function.SCM_SR_Login.All_Tab_Checking_Approver();
	}

	@When("^Sign out Approver Stright Flow$")
	public void sign_out_Approver_Stright_Flow() throws Throwable {
	    Login_Function.SCM_SR_Login.SignOut();
	}

//	 Single Material Multiple WBS
	public static ConfigFileReader configFileReader;

	public SCM_SR() {
		PageFactory.initElements(Webdriver.driver, SCM_SR_Coding.class);
	}

	@Given("^Login vailed Username and Password$")
	public void login_Username_and_Password() throws Throwable {
		Login_Function.SCM_SR_Login.login();
	}

	@Given("^Navigate From Menu to SR$")
	public void navigate_From_Menu_to_SR() throws Throwable {
		Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@Given("^Creation From SR$")
	public void creation_From_SR() throws Throwable {
		Login_Function.SCM_SR_Login.Creation();
	}

	@Given("^Single material Card1$")
	public void single_material_Card1() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single();
	}

	@Given("^Single material Card2$")
	public void single_material_Card2() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single1();
	}

	@Given("^Single material Card3$")
	public void single_material_Card3() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single2();
	}

//	@Given("^Single material Card4$")
//	public void single_material_Card4() throws Throwable {
//		Login_Function.SCM_SR_Login.card_Single3();
//	}

	@Given("^Submit Card Material from Multiple WBS$")
	public void Submit_Card_Material_from_Multiple_WBS() throws Throwable {
		Login_Function.SCM_SR_Login.submit();
	}
	
	@Given("^Sign Out From Multiple WBS$")
	public void Sign_Out_From_Multiple_WBS() throws Throwable {
		Login_Function.SCM_SR_Login.SignOut();
	}
	
	
//  Single Material Multiple cost package 	
	
	@Given("^Login vailed Username and Password in Multiple Costpackage$")
	public void login_Username_and_Password_in_Multiple_Costpackage() throws Throwable {
		Login_Function.SCM_SR_Login.login();
	}

	@Given("^Navigate From Menu to SR in Multiple Costpackage$")
	public void navigate_From_Menu_to_SR_in_Multiple_Costpackage() throws Throwable {
		Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@Given("^Creation From SR in Multiple Costpackage$")
	public void creation_From_SR_in_Multiple_Costpackage() throws Throwable {
		Login_Function.SCM_SR_Login.Creation();
	}
	
	
	@Given("^Single material Card5$")
	public void single_material_Card5() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single4();
	}

	@Given("^Single material Card6$")
	public void single_material_Card6() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single5();
	}

	@Given("^Single material Card7$")
	public void single_material_Card7() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single6();
	}

	@Given("^Single material Card8$")
	public void single_material_Card8() throws Throwable {
		Login_Function.SCM_SR_Login.card_Single7();
	}
	
//  Costpackage:
	
	
	
	@Given("^Material WBS and Cost package$")
	public void material_WBS_and_Cost_package() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage();
	}

	@Given("^Material WBS and Cost package2$")
	public void material_WBS_and_Cost_package2() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage2();
	}

	@Given("^Material WBS and Cost package3$")
	public void material_WBS_and_Cost_package3() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage3();
	}

//	@Given("^Material WBS and Cost package4$")
//	public void material_WBS_and_Cost_package4() throws Throwable {
//		Login_Function.SCM_SR_Login.WBS_Costpackage4();
//	}

	@Given("^Material WBS and Cost package5$")
	public void material_WBS_and_Cost_package5() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage5();
	}

	@Given("^Material WBS and Cost package6$")
	public void material_WBS_and_Cost_package6() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage6();
	}

	@Given("^Material WBS and Cost package7$")
	public void material_WBS_and_Cost_package7() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage7();
	}

	@Given("^Material WBS and Cost package8$")
	public void material_WBS_and_Cost_package8() throws Throwable {
		Login_Function.SCM_SR_Login.WBS_Costpackage8();
	}
	
	@Given("^Submit Card Material from Multiple CostPackage$")
	public void Submit_Card_Material_from_Multiple_Costpackage() throws Throwable {
		Login_Function.SCM_SR_Login.submit();
	}
	
	@Given("^Sign Out From Multiple Costpackage$")
	public void Sign_Out_From_Multiple_Costpackage() throws Throwable {
		Login_Function.SCM_SR_Login.SignOut();
	}

//	Quantiy and Rate
	
	@Given("^Quantiy and Rate2$")
	public void quantiy_and_Rate2() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate2();
	}

	@Given("^Quantiy and Rate$")
	public void quantiy_and_Rate() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate();
	}

	@Given("^Quantiy and Rate3$")
	public void quantiy_and_Rate3() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate3();
	}

//	@Given("^Quantiy and Rate4$")
//	public void quantiy_and_Rate4() throws Throwable {
//		Login_Function.SCM_SR_Login.Quantiy_Rate4();
//	}

	@Given("^Quantiy and Rate5$")
	public void quantiy_and_Rate5() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate5();
	}

	@Given("^Quantiy and Rate6$")
	public void quantiy_and_Rate6() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate6();
	}

	@Given("^Quantiy and Rate7$")
	public void quantiy_and_Rate7() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate7();
	}

	@Given("^Quantiy and Rate8$")
	public void quantiy_and_Rate8() throws Throwable {
		Login_Function.SCM_SR_Login.Quantiy_Rate8();
	}

	@Given("^Submit card Material$")
	public void submit_card_Material() throws Throwable {
		Login_Function.SCM_SR_Login.submit();
	}

	@Given("^signout$")
	public void signout() throws Throwable {
		Login_Function.SCM_SR_Login.SignOut();
	}
	
//	Document And Process:
	
	@Then("^Login Document View and Process Username nd Password$")
	public void login_Document_View_and_Process_Username_nd_Password() throws Throwable {
		Login_Function.SCM_SR_Login.login();
	}

	@Then("^Navigate From Menu to SR Document View and Process$")
	public void navigate_From_Menu_to_SR_Document_View_and_Process() throws Throwable {
		Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@Then("^Document View$")
	public void document_View() throws Throwable {
	    Login_Function.SCM_SR_Login.Document_view();
	}

	@Then("^Process Flow Details$")
	public void process_Flow_Details() throws Throwable {
	    Login_Function.SCM_SR_Login.Process_flow();
	}

	@Then("^Sign Out For Flow Details$")
	public void sign_Out_For_Flow_Details() throws Throwable {
		Login_Function.SCM_SR_Login.SignOut();
	}
	
//	Inprogess:
	@Given("^Cancel in Material$")
	public void cancel_in_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.Click_Cancel();
	}

	@Given("^Recall Material$")
	public void recall_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.Recall_Material();
	}

	@Given("^Foraction in Edit Material$")
	public void foraction_in_Edit_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.Foraction_Move();
	}

	@Given("^Change Rate in Material$")
	public void change_Rate_in_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.Edit_Material();
	}

	@Given("^Submit Edit Material$")
	public void submit_Edit_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.submit();
	}
	
//	Reject:
	@When("^Creater Login Username and Password$")
	public void creater_Login_Username_and_Password() throws Throwable {
	    Login_Function.SCM_SR_Login.login();
	}

	@When("^Reject Navigate From Menu to SR$")
	public void reject_Navigate_From_Menu_to_SR() throws Throwable {
	    Login_Function.SCM_SR_Login.Menu_to_SR();
	}

	@When("^Checking Reject Material$")
	public void checking_Reject_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.Reject_Material();
	}

	@When("^Edit Reject Material$")
	public void edit_Reject_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.Edit_Material();
	}

	@When("^Submit Reject Material$")
	public void submit_Reject_Material() throws Throwable {
	    Login_Function.SCM_SR_Login.submit();
	}
	@When("^Sign out Reject$")
	public void sign_out_Reject() throws Throwable {
	    Login_Function.SCM_SR_Login.SignOut();
	}

}
