package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuObjects {

	@FindBy(how = How.CLASS_NAME, using="modulemenu")
	public static WebElement moduleMenu;
	
	@FindBy(how = How.XPATH, using="//span[@title='Supply Chain Mgmt']")
	public static WebElement supplyChainMgmt;
	
	@FindBy(how = How.XPATH, using="//span[@title='Logistics']")
	public static WebElement logistics;
	
	@FindBy(how = How.XPATH, using="//span[@title='Transport Request']")
	public static WebElement transportRequest;
	
	@FindBy(how = How.XPATH, using="//span[@title='Transport Receipt']")
	public static WebElement transportReceipt;

	@FindBy(how = How.XPATH, using="//span[@title='Transport Invoice']")
	public static WebElement transportInvoice;
	
	@FindBy(how = How.XPATH, using="//span[@title='Masters']")
	public static WebElement masters;
	
	@FindBy(how = How.XPATH, using="//span[@title='Rate Contract']")
	public static WebElement rateContract;
	
	@FindBy(how = How.XPATH, using="//div[text()='Transport Request']")
	public static WebElement transportRequestPage;
	
	@FindBy(how = How.XPATH, using="//strong[text()='Transport Rate Contract - Create']")
	private WebElement transportRateContract;
}
