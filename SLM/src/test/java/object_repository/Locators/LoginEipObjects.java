package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginEipObjects {

	@FindBy(how = How.LINK_TEXT, using="Other User")
	public static WebElement otheruser;
	
	@FindBy(how = How.ID, using="username")
	public static WebElement username;
	
	@FindBy(how = How.NAME, using="password")
	public static WebElement password;
	
	@FindBy(how = How.ID, using="login-submit")
	public static WebElement login;
	
	@FindBy(how = How.CLASS_NAME, using="modulemenu")
	public static WebElement accessBasedMenu;
	
	@FindBy(how = How.XPATH, using="//span[text()='Supply Chain Mgmt']")
	public static WebElement supplyChainMgmt;
	
	@FindBy(how = How.XPATH, using="//span[text()='Warehouse']")
	public static WebElement warehouse;
	
	@FindBy(how = How.XPATH, using="//span[text()='Material Receipt Note']")
	public static WebElement materialReceiptNote;
	
	
}
