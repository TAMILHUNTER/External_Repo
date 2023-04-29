package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjects {

	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Employee')]")
	public  static WebElement employee;
	@FindBy(how=How.XPATH,xpath="//*[contains(text(),'Other User')]")
	public static WebElement other;
	@FindBy(how=How.ID,id="username")
	public static WebElement username;
	@FindBy(how=How.ID,id="password")
	public static WebElement password;
	@FindBy(how=How.ID,id="externalLogin")
	public static WebElement loginbutton;	
	
	@FindBy(how = How.XPATH, using="//button[text()='Ok']")
	public static WebElement popup; //pk
	
	@FindBy(how=How.XPATH,xpath="//*[area]/area")
	public  static WebElement enterhere;
	@FindBy(how=How.XPATH,xpath="//eipmessagebox//p")
	public  static WebElement invaliduser;
	@FindBy(how=How.XPATH,xpath="//eipmessagebox//span[@title='Close']")
	public  static WebElement close;	
	
	@FindBy(how=How.XPATH,xpath="//i[@id='profiledropdownbtn']")
	public  static WebElement LogOut;
	
	@FindBy(how=How.XPATH,xpath="//a[text()='Sign Out']")
	public  static WebElement SignOut;
	
	
	
}