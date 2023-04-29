package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMS_Logsheet_Objects {
	
	public @FindBy(xpath = "//*[@id='mat-input-0']") static  WebElement EnterPHRS;
	
	public @FindBy(xpath = "//*[@class='modulemenu']") static WebElement Menu;
	
///////----------------------AMS Log sheet-------------------------------------------------------------------------------------------------------------
	
	public @FindBy(xpath = "//*[text()='Asset Mgmt']") static WebElement AssetMgmt;
	
	public @FindBy(xpath = "//*[text()='AMS 4.0']") static WebElement AMSo;
	
	public @FindBy(xpath = "//*[text()='Operations & Maintenance']") static WebElement OAM;
	public @FindBy(xpath = "//*[text()='Log Sheet']") static WebElement LogSheet;
	
	//public @FindBy(xpath = "//*[@data-placeholder='Job']") static WebElement JobCode;
	
	public @FindBy(xpath = "//*[@id='job']") static WebElement JobCode;
	
	public @FindBy(xpath = "//*[@data-placeholder='Asset Code']") static WebElement AssetCode;
	public @FindBy(xpath = "//button[text()=' Create New Logsheet ']") static WebElement Clickcreate;
	public @FindBy(xpath = "(//input[@role='spinbutton'])[4]") static WebElement EndMeter;
	public @FindBy(xpath = "//span[@class='r-b fs-16']") static WebElement StartMeterReading;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[7]") static WebElement Quantity;
	public @FindBy(xpath = "//*[@id='btnSubmit']") static WebElement submit;
	public @FindBy(xpath = "//*[text()='Time Based']") static WebElement TimeBased;
	public @FindBy(xpath = "//*[text()='Yes']") static WebElement ClickYes;
	public @FindBy(xpath = "//*[@id='btnAddWorkReading']") static WebElement ClickWorkbtn;
	public @FindBy(xpath = "(//span[@class='ng-star-inserted'])[1]") static WebElement TStartmeter;
	public @FindBy(xpath = "((//input[@ng-reflect-events='[object Object]'])[2])") static WebElement TEndMeter;
	public @FindBy(xpath = "(//span[@title='Toggle time list'])[1]") static WebElement StartTime;
	public @FindBy(xpath = "//li[@data-timelist-item-index='9']") static WebElement SelectstartTime;
	public @FindBy(xpath = "(//*[@type='button'])[12]") static WebElement StartTimeSet;
	public @FindBy(xpath = "//p[text()='Production Qty : ']") static WebElement Productionqty;
	public @FindBy(xpath = "(//*[@id=\"icon-rightdateRange_Kendo\"])[1]") static WebElement Duration;
	public @FindBy(xpath = "(//*[@class='k-icon k-i-clock'])[2]") static WebElement EndTime;
	public @FindBy(xpath = "//li[@data-timelist-item-index='12']") static WebElement SelectEndTime;
	public @FindBy(xpath = "//button[text()='Set']") static WebElement EndTimeSet;
	public @FindBy(xpath = "//*[@class='icon-background k-button k-grid-save-command']") static WebElement TSaveIcon;
	public @FindBy(xpath = "(//*[@role='spinbutton'])[2]") static WebElement TQuantity;
	public @FindBy(xpath = "(//*[@class='mat-slide-toggle-thumb'])[1]") static WebElement Maintenance;
	public @FindBy(xpath = "//*[@id='txtOTPrimary']") static WebElement MOverTime;
	public @FindBy(xpath = "(//*[@class='k-input k-formatted-value'])[3]") static WebElement MEndReading;
	public @FindBy(xpath = "(//*[@class='k-input k-formatted-value'])[6]") static WebElement MQuantity;
	public @FindBy(xpath = "(//input[@role=\"spinbutton\"])[2]") static WebElement HiredDayIdle;
	public @FindBy(xpath = "//*[@class='eip-ml-5 history']") static WebElement History;
	public @FindBy(xpath = "(//input[@role='spinbutton'])[6]") static WebElement HireBreakdown;
	public @FindBy(xpath = "//button[@id='btnDeleteEntry']") static WebElement Delete;
	public @FindBy(xpath = "//*[@id='ibtPrevDate']") static WebElement DateLeft;
	public @FindBy(xpath = "//button[@id='btnViewRmks']") static WebElement RemarksBtn;
	
	
	
	
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
