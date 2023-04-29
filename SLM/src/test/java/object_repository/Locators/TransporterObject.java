package object_repository.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransporterObject {
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Search Menu']")
	public static WebElement searchMenu;
	
	@FindBy(how = How.XPATH, using="//kendo-treeview//span//span")
	public static List <WebElement> menuOptions;
	
	@FindBy(how = How.ID, using="ibtSearch")
	public static WebElement advanceSearch;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Document No']")
	public static WebElement documentNo;
	
	@FindBy(how = How.ID, using="btnSearch")
	public static WebElement go;
	
	/*@FindBy(how = How.XPATH, using="//kendo-treeview//span//span")
	public static WebElement menuOptions;*/
	
	@FindBy(how = How.XPATH, using="(//div[@class='cv-view-info']//span)[1]")
	public static WebElement fromLocation;
	
	@FindBy(how = How.XPATH, using="(//div[@class='cv-view-info']//span)[2]")
	public static WebElement toLocation;
	
	@FindBy(how = How.XPATH, using="//p[text()='No of Vehicles']/following-sibling::p")
	public static WebElement numberOfVehicles;
	
	
	
	
	@FindBy(how = How.XPATH, using="//p[text()='Currency']/following-sibling::p")
	public static WebElement currency;
	
	@FindBy(how = How.XPATH, using="//*[@class='value']")
	public static WebElement rupees;
	
	@FindBy(how = How.XPATH, using="//p[text()='Distance']/following-sibling::p")
	public static WebElement kms;
	
	@FindBy(how = How.XPATH, using="//input[@value='Send Back']")
	public static WebElement sendBack;
	
	@FindBy(how = How.XPATH, using="//h1")
	public static WebElement confirmationTitle;
	
	@FindBy(how = How.XPATH, using="//button")
	public static WebElement yesConfirmation;
	
	@FindBy(how = How.XPATH, using="//*[@placeholder='Send Back Reason']")
	public static WebElement sendBackReason;
	
	@FindBy(how = How.XPATH, using="//mat-checkbox//span")
	public static List <WebElement> selectReason;
	
	@FindBy(how = How.XPATH, using="//*[@placeholder='Remarks']")
	public static WebElement remarks;
		
	@FindBy(how = How.XPATH, using="//input[@value='Acknowledge']")
	public static WebElement acknowledge;
	
	@FindBy(how = How.CLASS_NAME, using="title")
	public static WebElement frqNumber;
	
	@FindBy(how = How.XPATH, using="//span[text()='FR Value']/following-sibling::span")
	public static WebElement frqValue;
		
}
