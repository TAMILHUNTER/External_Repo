package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import stepdefinition.DatabaseConnection;

public class FIN_Disbursement_Coding extends DatabaseConnection{
	
	
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
	
	@FindBy(how = How.XPATH, using = "//span[text()='Treasury' or @title='']")
	public static WebElement Treasury;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Collection & Disbursement' or @title='']")
	public static WebElement Collection_Disbursement;
	
	
	@FindBy(how = How.XPATH, using = "(//span[@class='fa fa-times cursor-pointer ng-star-inserted' or @title=''])[1]")
	public static WebElement Clear;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Subcontractor']")
	public static WebElement Select_Document;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-arrow-right-lg eip-link align-self-center' or @title='Go']")
	public static WebElement GO;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-filter' or @title='']")
	public static WebElement Filter;
	
	@FindBy(how = How.XPATH, using = "//*[@id='k-grid0-r1c1']/kendo-grid-string-filter-cell/kendo-grid-filter-wrapper-cell/input")
	public static WebElement Filter_Document_No;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-check cursor-pointer ng-star-inserted' or @title='']")
	public static WebElement Disburse;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='Yes' or @class='']")
	public static WebElement Yes;
	
	@FindBy(how = How.XPATH, using = "//div//button[text()='No' or @class='']")
	public static WebElement No;
	
	@FindBy(how = How.XPATH, using = "//div//input[@class='btn  btn-primary' or @value='Ok']")
	public static WebElement ok;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle' or @title='']")
	public static WebElement close;
	
	@FindBy(how = How.XPATH, using = "//div//input[@id='lstRegType']")
	public static WebElement Bank_Name;
	
	@FindBy(how = How.XPATH, using = "//span[text()=' BANK LIMITED']")
	public static WebElement Select_Bank_Name;
	
	@FindBy(how = How.XPATH, using = "//input[@id='btnSubmit']")
	public static WebElement Submit;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle pull-right']")
	public static WebElement Close_page;
	
	@FindBy(how = How.XPATH, using = "//span//i[@class='fa fa-home']")
	public static WebElement Home_Button;
		
	@FindBy(how = How.XPATH, using = "//i[@id='profiledropdownbtn' or @class='']")
	public static WebElement Sign_out_Icon;
	
	@FindBy(how = How.XPATH, using = "//div//a[text()='Sign Out' or @class='']")
	public static WebElement Signout;
	
	
	

}
