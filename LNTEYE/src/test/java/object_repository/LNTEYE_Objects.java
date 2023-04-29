package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dataProviders.BaseClass;

public class LNTEYE_Objects extends BaseClass {

	//L&T EYE project -->overall project performance  -->  Project overview //
	
	public @FindBy(xpath = "//a[text()='Login']") static WebElement LoginBtn;
	public @FindBy(xpath = "//input[@formcontrolname='firstName']") static WebElement User;
	public @FindBy(xpath = "//input[@value='NEXT']") static WebElement Next;
	public @FindBy(xpath = "//input[@formcontrolname='password']") static WebElement Pass;
	public @FindBy(xpath = "//input[@type='submit']") static WebElement Signin;
	public @FindBy(xpath = "//button[text()='Ok']") static WebElement OK;
	public @FindBy(xpath = "//div[@class='projects cursor-pointer']") static WebElement Project;
	public @FindBy(xpath = "(//div[@class='card-1 cursor-pointer d-flex justify-content-center align-items-center ng-star-inserted'])[1]") static WebElement Construction;
	public @FindBy(xpath = "(//img[@class='cursor-pointer'])[1]") static WebElement ProjectGo;
	public @FindBy(xpath = "//p[text()='Overall Project ']") static WebElement OverallProject;
	public @FindBy(xpath = "(//input[@type='text'])[1]") static WebElement ProjectCode;
	public @FindBy(xpath = "//span[@class='highlightText']") static WebElement SelectJob;
	public @FindBy(xpath = "(//span//following::img)[1]") static WebElement profile;
	public @FindBy(linkText = "Sign Out") static WebElement logout;

	public @FindBy(xpath = "//img[@src='assets/Dashboard/Go-btn.png']") static WebElement GoProject;
	public @FindBy(xpath = "(//p[@class='r-r fs-14 text-color-labels text-left ellipsis-15']//following::span)[1]") static WebElement OCV_Value;
	public @FindBy(xpath = "(//p[text()=' RCV : ']//following::span)[1]") static WebElement RCV_Value;
	public @FindBy(xpath = "(//p[text()='Orginal Cost *']//preceding::p)[24]") static WebElement Orginal_Costs;
	public @FindBy(xpath = "(//p[text()='Revised Estimate']//preceding::p)[26]") static WebElement Revised_Estimates;
	public @FindBy(xpath = "(//p[text()='Cost - AUG 2022 PMS']//preceding::p)[28]") static WebElement Cost;
	public @FindBy(xpath = "(//p[text()='Cost As On Date']//preceding::p)[30]") static WebElement Cost_As_On_Date;
	public @FindBy(xpath = "(//p[text()='Invoiced - AUG 2022 PMS ']//preceding::p)[34]") static WebElement Invoiced;
	public @FindBy(xpath = "(//p[text()='Outstanding']//preceding::p)[36]") static WebElement Outstanding;
	public @FindBy(xpath = "(//p[text()='Sales Over Invoice']//preceding::p)[38]") static WebElement Sales_Over_Invoice;
	public @FindBy(xpath = "(//p[text()='Net Working Capital']//preceding::p)[40]") static WebElement Net_Working_Capital;
	public @FindBy(xpath = "(//p[text()='Time Completion']//preceding::p)[22]") static WebElement Time_Completion;
	public @FindBy(xpath = "(//p[text()='Cost Completion']//preceding::p)[32]") static WebElement Cost_Completion;
	public @FindBy(xpath = "(//p[text()='Invoice Completion']//preceding::p)[42]") static WebElement Invoice_Completion;
	public @FindBy(xpath = "(//p[text()='Projected End Margin']//preceding::p)[52]") static WebElement Projected_End_Margin;
	public @FindBy(xpath = "(//p[text()='ACE GM *']//preceding::p)[44]") static WebElement ACE_GM;
	public @FindBy(xpath = "(//p[text()='JCR GM *']//preceding::p)[46]") static WebElement JCR_GM;
	public @FindBy(xpath = "(//p[text()='Revised Estimate * ']//preceding::p)[48]") static WebElement project_Revised_Estimate;
	public @FindBy(xpath = "(//p[text()='JCR RCV * ']//preceding::p)[50]") static WebElement JCR_RCV;
	public @FindBy(xpath = "(//p[text()='Actual Start Date']//preceding::p)[14]") static WebElement Actual_Start_Date;
	public @FindBy(xpath = "(//p[text()='Contractual End Date']//preceding::p)[16]") static WebElement Contractual_End_Date;
	public @FindBy(xpath = "(//p[text()='Expected End Date']//preceding::p)[18]") static WebElement Expected_End_Date;
	
	//L&T EYE project -->overall project performance  -->  Resources //
	
	public @FindBy(xpath = "//span[text()='Resources']") static WebElement Resource;
	public @FindBy(xpath = "(//p[text()='Material Planned Cost ']//preceding::p)[14]") static WebElement Material_Planned_Cost;
	public @FindBy(xpath = "(//p[text()='PO Commitment Made ']//preceding::p)[16]") static WebElement PO_Commitment_Made;
	public @FindBy(xpath = "(//p[text()='Material Received ']//preceding::p)[18]") static WebElement Material_Received;
	public @FindBy(xpath = "(//p[text()='Stock < 90 days ']//preceding::p)[20]") static WebElement Stock_90_days;
	public @FindBy(xpath = "(//p[text()='Stock > 90 days ']//preceding::p)[22]") static WebElement Stock_days;
	public @FindBy(xpath = "(//p[text()='Service Planned Cost ']//preceding::p)[24]") static WebElement Service_Planned_Cost ;
	public @FindBy(xpath = "(//p[text()='WO Commitment Made ']//preceding::p)[26]") static WebElement WO_Commitment_Made  ;
	public @FindBy(xpath = "(//p[text()='Work done/Billed ']//preceding::p)[28]") static WebElement Work_done_Billed;
	public @FindBy(xpath = "(//p[text()='P&M Planned Cost ']//preceding::p)[30]") static WebElement PM_Planned_Cost;
	public @FindBy(xpath = "(//p[text()='P&M Spend as on Date ']//preceding::p)[32]") static WebElement PM_Spend_Date;
	public @FindBy(xpath = "(//p[text()='# of Assets Deployed ']//preceding::p)[34]") static WebElement Assets_Deployed;
	public @FindBy(xpath = "(//p[text()='# of Surplus Asset ']//preceding::p)[36]") static WebElement Surplus_Asset;
	public @FindBy(xpath = "(//p[text()='Staff Planned Cost']//preceding::p)[38]") static WebElement Staff_Planned_Cost;
	public @FindBy(xpath = "(//p[text()='Staff Spend as on Date']//preceding::p)[40]") static WebElement Staff_Spend_Date;
	public @FindBy(xpath = "(//p[text()='# of Staff Employed']//preceding::p)[42]") static WebElement Staff_Employed;
	public @FindBy(xpath = "(//p[text()='# of Workmen Employed *']//preceding::p)[44]") static WebElement Workmen_Employed ;
	public @FindBy(xpath = "(//p[text()='Provisional Cost ']//preceding::p)[46]") static WebElement Provisional_Cost;
	
	//L&T EYE project -->overall project performance  -->  SCM  //
	public @FindBy(xpath = "//span[text()='Supply Chain']") static WebElement supplychain;
	public @FindBy(xpath = "//p[@class='project-count ff-3']") static WebElement materialvalue;
	public @FindBy(xpath  ="(//input[@role='combobox'])[5]") static WebElement material;
	public @FindBy(xpath  = "(//label[text()='INR ']/following::input)[2]") static WebElement materiallist;
	public @FindBy(xpath = "//img[@alt='Go btn']") static WebElement search_button;
	public @FindBy(xpath = "//span[text()=' Page ']") static WebElement Page;
	public @FindBy(xpath = "//span[@class='mat-checkbox-inner-container']") static WebElement material_checkbox;
	public @FindBy(xpath = "//select[@name='reason']") static WebElement Unit;
	
}
