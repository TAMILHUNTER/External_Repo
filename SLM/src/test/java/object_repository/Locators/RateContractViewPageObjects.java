package object_repository.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RateContractViewPageObjects {

	@FindBy(how = How.XPATH, xpath="(//*[@id='lblViewJob'])[1]")
	public static WebElement rcNumber;
	
	@FindBy(how = How.XPATH, xpath="(//i[@id='ibtINDFJobinfo']//following::span)[1]")
	public static WebElement viewJob;
	
	@FindBy(how = How.XPATH, using="(//p[@id='lblViewType']//i)[2]")
	public static WebElement viewRCInfo;
	
	@FindBy(how = How.XPATH, xpath="(//i[@id='ibtINDFJobinfo']//following::span)[2]")
	public static WebElement viewRcName;
	
	@FindBy(how = How.XPATH, xpath="(//*[@id='lblViewJob'])[2]")
	public static WebElement viewRcType;	
	
	@FindBy(how = How.XPATH, xpath="(//*[@id='lblViewJob'])[3]")
	public static WebElement viewDate;
	
	@FindBy(how = How.XPATH, xpath="(//*[@id='lblViewJob'])[4]")
	public static WebElement viewReference;
	
	@FindBy(how = How.XPATH, xpath="(//i[@id='ibtINDFJobinfo']//following::span)[5]//span")
	public static WebElement viewInternalRemarks;
	
	@FindBy(how = How.XPATH, xpath="(//i[@id='ibtINDFJobinfo']//following::span)[7]//span")
	public static WebElement viewExternalRemarks;
	
	@FindBy(how = How.XPATH, xpath="//*[@title='Additional Charges']")
	public static WebElement viewAdditionalChargesclick;
	
	@FindBy(how = How.XPATH, xpath="//*[@class='mat-dialog-title']//div")
	public static WebElement viewAdditionalChargesWindowTitle;
	
	@FindBy(how = How.XPATH, xpath="//*[@role='dialog']//tr//td[1]")
	public static  WebElement viewChargeDescription;
	
	@FindBy(how = How.XPATH, xpath="//*[@role='dialog']//tr//td[2]")
	public static  WebElement viewChargeAmount;
	
	@FindBy(how = How.XPATH, xpath="//*[@role='dialog']//tr//td[3]")
	public static  WebElement viewChargeRemarks;
	
	@FindBy(how = How.XPATH, xpath="//*[@class='fa fa-times-circle pull-right']")
	public static  WebElement viewChargeClose;
	
	@FindBy(how = How.XPATH, xpath="//*[@title='Special Terms & Condition']")
	public static  WebElement viewTermsConditionClick;
	
	@FindBy(how = How.XPATH, xpath="//*[@class='mat-dialog-title']//div")
	public static WebElement viewTermsConditionTitle;
	
	@FindBy(how = How.XPATH, xpath="//*[@class='fa fa-times-circle pull-right']")
	public static WebElement viewTermsConditionTitleClose;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[4]//tr//td[2]")
	public static WebElement viewTermsAndConditions;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[1]")
	public static WebElement VehicleDescription;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[2]")
	public static WebElement FromState;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[3]")
	public static WebElement FromCity;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[4]")
	public static WebElement FromLocation;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[5]")
	public static WebElement ToState;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[6]")
	public static WebElement ToCity;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[7]")
	public static WebElement ToLocation;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[8]")
	public static WebElement rateType;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[9]")
	public static WebElement rate;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[10]")
	public static WebElement terrainType;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[11]")
	public static WebElement minGaurantyWeight;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[12]")
	public static WebElement maxGaurantyWeight;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[13]")
	public static WebElement distance;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[2]//td[14]")
	public static WebElement hours;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[3]")
	public static WebElement release;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[4]")
	public static WebElement referenceValue;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[5]")
	public static WebElement event;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[7]")
	public static WebElement paymentmode;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[8]")
	public static WebElement creditDays;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[9]")
	public static WebElement referenceDate;
	
	@FindBy(how = How.XPATH, xpath="(//tbody[@role='presentation'])[3]//td[10]")
	public static WebElement documents;
	
	@FindBy(how = How.XPATH, using="//td[text()=' Per MT ']")
	public static WebElement ratePerMetricTon;
}
