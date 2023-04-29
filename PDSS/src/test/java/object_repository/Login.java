package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	
	public @FindBy(linkText = "Other User")	static  WebElement Otheruser;
	public @FindBy(id = "username") static WebElement Username;
	public @FindBy(id = "password-field") static WebElement Password;
	public @FindBy(id = "login-submit") static WebElement Login;
	public @FindBy(id = "login-sumit") static WebElement Logins;
	public @FindBy(xpath = "//a[@title='Access Based Menu']") static WebElement Menu;
	
	
}
