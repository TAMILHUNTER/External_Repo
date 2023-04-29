package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import stepdefinition.DatabaseConnection;

public class FIN_Journals_Coding extends DatabaseConnection{
	
	@FindBy(how = How.XPATH, using = "(//a[text()='Other User' or @class='nav-link'])")
	public static WebElement Login_otherUser;

	@FindBy(how = How.ID, id = "username")
	public static WebElement Login_Username;

	@FindBy(how = How.ID, id = "password-field")
	public static WebElement Login_Password;

	@FindBy(how = How.ID, using = "login-submit")
	public static WebElement Login_loginSubmit;

	@FindBy(how = How.XPATH, using = "//a[@title='Access Based Menu']")
	public static WebElement menu;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Finance' or @title='']")
	public static WebElement Finance;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Accounts Payable' or @title='']")
	public static WebElement Account_payable;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Invoice Process' or @title='']")
	public static WebElement Invoice_process;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Journals' or @title='']")
	public static WebElement Journals;
	
	@FindBy(how = How.XPATH, using = "//i[@id='btnfunnel']")
	public static WebElement Filter_Icon;
	
	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/app-journal-voucher/div/div[2]/app-fjv-journal-grid/div/kendo-grid/div/div/div/table/thead/tr[2]/td[1]/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public static WebElement Pass_Invoice_No;
	
	@FindBy(how = How.XPATH, using = "(//app-acp-order-view-label//span[@class='eip-link' or @style=''])[2]")
	public static WebElement WO_No;
	
	@FindBy(how = How.XPATH, using = "//i[@id='Approve' or @class='']")
	public static WebElement Approve;
	
	@FindBy(how = How.XPATH, using = "//i[@id='edit' or @title='']")
	public static WebElement Edit;
	
	@FindBy(how = How.XPATH, using = "//i[@id='profiledropdownbtn' or @class='']")
	public static WebElement Sign_out_Icon;
	
	@FindBy(how = How.XPATH, using = "//div//a[text()='Sign Out' or @class='']")
	public static WebElement Signout;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='Yes' or @class='']")
	public static WebElement Yes_Button;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='No' or @class='']")
	public static WebElement No_Button;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='Ok' or @class='']")
	public static WebElement OK_Button;
	
	@FindBy(how = How.XPATH, using = "//span[@title='Close' or @class='']")
	public static WebElement Close_Button;
	
	@FindBy(how = How.XPATH, using = "(//i[@id='btnClose' or @title='Close'])[2]")
	public static WebElement Close_page;
	

}
