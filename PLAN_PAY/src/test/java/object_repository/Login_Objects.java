package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Objects { 
	
	public @FindBy(linkText = "Other User")	static  WebElement Otheruser;
	public @FindBy(id = "username") static WebElement Username;
	public @FindBy(id = "password-field") static WebElement Password;
	public @FindBy(id = "login-submit") static WebElement Login;
	public @FindBy(xpath = "//i[@class='fa fa-home']") static WebElement Home;
	public @FindBy(id = "profiledropdownbtn") static WebElement profileDr;
	public @FindBy(xpath = "//*[@id='profiledropdownbtn']") static WebElement profilSR;
	public @FindBy(linkText = "Sign Out") static WebElement Signout;
	
}
