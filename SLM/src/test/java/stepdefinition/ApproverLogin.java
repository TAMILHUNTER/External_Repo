package stepdefinition;

import cucumber.api.java.en.Given;
import repository.Actions.CreateRCAction;

public class ApproverLogin {	
	@Given("^As a approver i should able to login the RateContract$")
	public void as_a_approver_i_should_able_to_login_the_RateContract() throws Throwable {
		CreateRCAction.approveRC();
	} 

	@Given("^As a approver i should able to navigate to RateContract$")
	public void As_a_approver_i_should_able_to_navigate_to_RateContract() throws Throwable {
		CreateRCAction.approverMenu();
	}

	@Given("^As a approver i should able to approve the RateContract under foraction tab$")
	public void As_a_approver_i_should_able_to_approve_the_RateContract_under_foraction_tab() throws Throwable {
		CreateRCAction.approveFromForActionTab();
	 }  
}
