package stepdefinition;



import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Then;
import object_repository.Locators.CommonControlObject;
import object_repository.Locators.TransporterObject;
import repository.Actions.GetFrq;
import repository.Actions.LoginActions;
import repository.Actions.TransporterAction;

public class Transporter {
	LoginActions loginactions=new LoginActions();
	
	public Transporter() {
		PageFactory.initElements(Webdriver.driver, TransporterObject.class);	
	}

	@Then("^Login to the transporter login$")
	public void login_to_the_transporter_login() throws Throwable {
		 CommonControlObject.profileIcon.click();
		 CommonControlObject.signOut.click();
		 loginactions.homepage();
		 loginactions.otheruserLogin();
		 loginactions.transporterUserAndPassword();
		 TransporterObject.searchMenu.click();
		 TransporterObject.searchMenu.sendKeys("Shipment Details");
		 List<WebElement> menuSelect = TransporterObject.menuOptions;
		 for (WebElement webElement : menuSelect) {
			 if(webElement.getText().equals("Shipment Details")) {
				 webElement.click();
					break;
			 }			
		}
	}

	@Then("^Search the FRQ number under for action tab$")
	public void search_the_FRQ_number_under_for_action_tab() throws Throwable {
		
		GetFrq.getFrq();
	    
	    
	}

	@Then("^Verify the From, to, number of vehicles, currency, distance, send back and acknowledge details are visible$")
	public void verify_the_From_to_number_of_vehicles_currency_distance_send_back_and_acknowledge_details_are_visible() throws Throwable {
	    GetFrq.getVehicleDetails();
	}

	@Then("^Verify transporter able to send back the transport request$")
	public void verify_transporter_able_to_send_back_the_transport_request() throws Throwable {
		TransporterObject.sendBack.click();
			WebDriverWait wait=new WebDriverWait(Webdriver.driver, 3000);
			wait.until(ExpectedConditions.elementToBeClickable(TransporterObject.yesConfirmation));
		if("Confirmation".equals(TransporterObject.confirmationTitle.getText())) {
			TransporterObject.sendBackReason.click();
			List<WebElement> sendBackReason = TransporterObject.selectReason;
			int size = sendBackReason.size();
			int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
			sendBackReason.get(randomNumber).click();
			TransporterObject.remarks.sendKeys("SendBack For Changes");
			TransporterObject.yesConfirmation.click();
	}
}

	@Then("^Verify the send back request displayed under for action in creator login$")
	public void verify_the_send_back_request_displayed_under_for_action_in_creator_login() throws Throwable {
		TransporterAction.verifyTheFRQSavedAsDraft();
	}
}
