package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Baseclass;
import cucumber.api.java.en.Given;
import dataProviders.ConfigFileReader;
import object_repository.SCM_Mesu_Coding;

public class SCM_Mesurement_SF extends Baseclass   {

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	
	 public SCM_Mesurement_SF() { 
		PageFactory.initElements(Webdriver.driver, SCM_Mesu_Coding.class);
	}
	
	
	@Given("^Login Function Measurement$")
	public void login_Function_Measurement() throws Throwable {
	    
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.getEnvironment());
		try {
			SCM_Mesu_Coding.Login_otherUser.click();
		} catch (Exception e) {
			toclick(SCM_Mesu_Coding.Login_otherUser);
		}
		SCM_Mesu_Coding.Login_Username.sendKeys(ConfigFileReader.getConfiguration_username1());
		SCM_Mesu_Coding.Login_Password.sendKeys(ConfigFileReader.getConfiguration_password1());
		SCM_Mesu_Coding.Login_loginSubmit.click();
	
		
	}

	@Given("^Navigate From Menu to Mesurement$")
	public void navigate_From_Menu_to_Mesurement() throws Throwable {
	    
		int implicitWaitTime = (30);
		Webdriver.driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		SCM_Mesu_Coding.menu.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.SCM));
		movetoElemt(SCM_Mesu_Coding.SCM);
		System.out.println("Menu =" +SCM_Mesu_Coding.SCM.getText());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Execution));
		movetoElemt(SCM_Mesu_Coding.Execution);
		System.out.println("Menu =" +SCM_Mesu_Coding.Execution.getText());
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Measurment));
		moveToClick(SCM_Mesu_Coding.Measurment);
//		System.out.println("Menu ="+SCM_Mesu_Coding.Measurment.getText());
		
	}

	@Given("^Click on creation Icon$")
	public void click_on_creation_Icon() throws Throwable {
	    Thread.sleep(1000);
//	    try {
//	    	SCM_Mesu_Coding.Close_Button.click();
//		} catch (Exception e) {
//			toclick(SCM_Mesu_Coding.Close_Button);
//		}
	    Thread.sleep(6000);
	    wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Create));
		try {
			SCM_Mesu_Coding.Create.click();
		} catch (Exception e) {
			toclick(SCM_Mesu_Coding.Create);
		}
	}

	@Given("^Work Order Details From Job$")
	public void work_Order_Details_From_Job() throws Throwable {
	    
		SCM_Mesu_Coding.job.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.job_Search));
		SCM_Mesu_Coding.job_Search.click();
		Thread.sleep(2000);
		SCM_Mesu_Coding.job_Search.sendKeys(ConfigFileReader.getJob_LE180046());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.select_Job));
		moveToClick(SCM_Mesu_Coding.select_Job);
//		assertEquals("LE180046 - Raheja", SCM_Mesu_Coding.select_Job.getText());	
//		System.out.println("Job Name "+SCM_Mesu_Coding.select_Job.getText());
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Click_Empty));
		SCM_Mesu_Coding.Click_Empty.click();
	}

	@Given("^Work Order Details From Group$")
	public void work_Order_Details_From_Group() throws Throwable {
	    
		SCM_Mesu_Coding.Group.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.select_Group));
		moveToClick(SCM_Mesu_Coding.select_Group);
//		assertEquals("101 - Service", SCM_Mesu_Coding.select_Group.getText());
//		System.out.println("Group Name ="+SCM_Mesu_Coding.select_Group.getText());
		SCM_Mesu_Coding.Click_Empty.click();
	}

	@Given("^Work Order Details From Vendor$")
	public void work_Order_Details_From_Vendor() throws Throwable {
	    
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.vendor));
		SCM_Mesu_Coding.vendor.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.vendor));
		Thread.sleep(2000);
		try {
			SCM_Mesu_Coding.vendor_Name.sendKeys(ConfigFileReader.getVendor_RFQ());
		} catch (Exception e) {
			System.out.println("Not Send Value");
		}
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.select_vendor));
		moveToClick(SCM_Mesu_Coding.select_vendor);
	}

	@Given("^Work Order Details Search$")
	public void work_Order_Details_Search() throws Throwable {
	   
		SCM_Mesu_Coding.search_Button.click();
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Mouseover_create));
		movetoElemt(SCM_Mesu_Coding.Mouseover_create);
		moveToClick(SCM_Mesu_Coding.Mouseover_create);
	}

	@Given("^Select Material$")
	public void select_Material() throws Throwable {
	    
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.select_material));
		SCM_Mesu_Coding.select_material.click();
	}

	@Given("^Measurement From Date Select$")
	public void measurement_From_Date_Select() throws Throwable {
		
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.calender_click));
		SCM_Mesu_Coding.calender_click.click();
		
		SCM_Mesu_Coding.select_Today.click();
//		try {
//			SCM_Mesu_Coding.OK_Button.click();
//		} catch (Exception e) {
//			SCM_Mesu_Coding.Close_Button.click();
//		}
	}

	@Given("^Measurement From Cost Package$")
	public void measurement_From_Cost_Package() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.cost_package));
	    SCM_Mesu_Coding.cost_package.click();
	    moveToClick(SCM_Mesu_Coding.selectcost_package);
	}

	@Given("^Measurement From WBS$")
	public void measurement_From_WBS() throws Throwable {
	    
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.WBS));
		SCM_Mesu_Coding.WBS.click();
		moveToClick(SCM_Mesu_Coding.Select_WBS);
	}

	@Given("^Measurement From Stage Type$")
	public void measurement_From_Stage_Type() throws Throwable {
	    
		if (SCM_Mesu_Coding.stage_type.isEnabled()) {
			wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.stage_type));
			SCM_Mesu_Coding.stage_type.click();		
			moveToClick(SCM_Mesu_Coding.Select_stagetype);
		}else {
			System.out.println("Not Present in Stage Type in this Costpackage");
		}
	}

	@Given("^Measurement From Shape$")
	public void measurement_From_Shape() throws Throwable {
	    
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Shape));
		SCM_Mesu_Coding.Shape.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Select_shape));
		moveToClick(SCM_Mesu_Coding.Select_shape);
	}

	@Given("^Measurement From Save$")
	public void measurement_From_Save() throws Throwable {
	    
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.A));
		SCM_Mesu_Coding.A.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.A));
		SCM_Mesu_Coding.A .clear();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.A_Text));
		SCM_Mesu_Coding.A_Text.sendKeys(ConfigFileReader.getA());
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Save_Button));
		SCM_Mesu_Coding.Save_Button.click();
	}

	@Given("^Measurement Submit$")
	public void measurement_Submit() throws Throwable {
	    
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Submit_Button));
		SCM_Mesu_Coding.Submit_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.OK_Button));
		try {
			SCM_Mesu_Coding.OK_Button.click();
		} catch (Exception e) {
			SCM_Mesu_Coding.Close_Button.click();
		}
		Thread.sleep(2000);
		DatabaseConnection.Measu();
		Thread.sleep(2000);
	}

	@Given("^Click to Home Page$")
	public void click_to_Home_Page() throws Throwable {
		
		
		try {
			SCM_Mesu_Coding.Close_Page.click();
		} catch (Exception e) {
			toclick(SCM_Mesu_Coding.Close_Page);
		}
		Thread.sleep(1000);
		try {
			SCM_Mesu_Coding.yes_Button.click();
		} catch (Exception e) {
			SCM_Mesu_Coding.No_Button.click();
		}
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Close_Button));
//		try {
//			SCM_Mesu_Coding.Close_Button.click();
//		} catch (Exception e) {
//			toclick(SCM_Mesu_Coding.Close_Button);
//		}
//		
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Home));
		SCM_Mesu_Coding.Home.click();
	}

	@Given("^Sign Out Function$")
	public void sign_Out_Function() throws Throwable {
	   
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Sign_Out_Icon));
		SCM_Mesu_Coding.Sign_Out_Icon.click();
		wait.until(ExpectedConditions.elementToBeClickable(SCM_Mesu_Coding.Sign_Out));
		SCM_Mesu_Coding.Sign_Out.click();
		System.out.println("Successfully Verified");
		
		
	}
}
