package stepdefinition;
import java.awt.Robot;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Actions.LoginActions;
public class Login {

	LoginActions locations = new LoginActions();
	public static Robot r;
	public static WebDriver driver;

	@Given("^as a user i should able to view EDMS home page$")
	public void as_a_user_i_should_able_to_view_EDMS_home_page() throws Throwable {
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		System.out.println("User Navigated to EDMS 4.0 Login Page");
	}

	@Then("^click otheruser login button$")
	public void click_otheruser_login_button() throws Throwable {
		locations.otheruserLogin();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		locations.username_password();
	}

	@Then("^enter Invalid username and Valid password$")
	public void enter_Invalid_username_and_Valid_password() throws Throwable {
		locations.usernameInvalid();
	}

	@Then("^enter Valid username and Invalid password$")
	public void enter_Valid_username_and_Invalid_password() throws Throwable {
		locations.userPassInvalid();
	}

	@Then("^enter Invalid username and Invalid password$")
	public void enter_Invalid_username_and_Invalid_password() throws Throwable {
		locations.username_userPass_Invalid();
	}

	@Then("^enter usernamePk and passwordPk$")
	public void enter_usernamePk_and_passwordPk() throws Throwable {
		locations.usernamePk();
	}

	@Then("^click Log in button$")
	public void click_Log_in_button() throws Throwable {
		locations.submit();
		Thread.sleep(1000);
		Actions actions = new Actions(Webdriver.driver);
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).perform();
//		r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("user should be able to login successfully");
	}

//		if (LoginObjects.popup.isDisplayed()!=true) {
//			LoginObjects.popup.click(); 
//			} else {
//				System.out.println("Login Successufully");
//			}

//	       System.out.println("Popup Response :" + LoginObjects.popup.getText());
//
//	       if (LoginObjects.popup.getText().equalsIgnoreCase("Success")) {
//	    	   
//	    	   LoginObjects.popup.click();
//	       } 

//	            System.out.println(LoginObjects.popup.getText());
//	            locations.popup.click();
//	            System.out.println("*****Details are saved*****");
//
//
//
//	       } else if (LoginObjects.popup.getText().equals("Error")) {
//	            System.out.println("*****Failed to Save Details - Error Message : "
//	                    + LoginObjects.popup.getText() + "*****");
//	            LoginObjects.popup.click();
//	            // fail();uncomment this
//
//
//
//	       }
//		Thread.sleep(5000);
//		RepositoryDocObject.Warning.click();
//	}

	@Then("^user should able to click Logout button$")
	public void user_should_able_to_click_Logout_button() throws Throwable {
		locations.logout();
	}

	@Then("^click Invalid userpass Login button$")
	public void click_Invalid_userpass_Login_button() throws Throwable {
		locations.submit();
//		r = new Robot();
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        Thread.sleep(3000);
		System.out.println("Invalid UserName or Password");
//        wait.until(ExpectedConditions.visibilityOfAllElements(locations.wait()));

//		driver.close();

	}

}