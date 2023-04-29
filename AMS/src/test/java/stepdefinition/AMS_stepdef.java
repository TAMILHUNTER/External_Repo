package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import dataProviders.ConfigFileReader;
import dataProviders.DataBaseConnection;
import object_repository.AMS_locators;


public class AMS_stepdef {
	static String fileLocation = System.getProperty("user.dir") + "\\upload";
	static String fileName = "\\dummy-logo.png";
	static String pdffileName = "\\dummy-pdf.pdf";
	static String testimonial_Cmpylogo = "\\dummy-logo.png";
	static String grie_partner_id, grie_jobcode, grie_UIjobcode, grie_reqno, grie_UIreqno, grie_orderno, grie_UIorderno,
			grie_updateddate, grie_UIupdateddate, grie_req_sender;
	static Robot robot;

//		 Read Configuration
	

	public AMS_stepdef() throws AWTException {
		PageFactory.initElements(Webdriver.driver, AMS_locators.class);
		// robot=new Robot();
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
	public static Actions actions = new Actions(Webdriver.driver);

	/**************** Start import methods for step definition ********************/
	@Given("^Go to Test Environments$")

	public static void Go_to_Test_Environments() throws Throwable {

		Webdriver.driver.manage().deleteAllCookies();
		Webdriver.driver.get(ConfigFileReader.Environment());
		System.out.println("Test Environment : " + ConfigFileReader.Environment());

	}

	/* Login Page Start */
	@Then("^clicks the Otheruser button$")
	public void clicks_the_Otheruser_button() throws InterruptedException {

//			System.out.println("Login btn locator : " + Dhivya_locators.Loginbtn);
//			jse.executeScript("arguments[0].click();", Dhivya_locators.Loginbtn);
//			Thread.sleep(3000);
		AMS_locators.Otheruser.click();

	}

//		@Then("^enter username as(.*?)$")
//		public void enters_Username(String arg1) throws Throwable {
//			//Dhivya_locators.Username.sendKeys(arg1);//for the case of scenario outline
//			Dhivya_locators.Username.sendKeys(arg1);
//		    
//		}
//		@Then("^enters Username$")
//		public void enters_Username() throws Throwable {
//		    //Dhivya_locators.Username.sendKeys("piyushgautam");
//			Dhivya_locators.Username.sendKeys(ConfigFileReader.getUname());
//		}

//		@Then("^enters Password$")
//		public void enters_Password() throws Throwable {
//		   //Dhivya_locators.Password.sendKeys("LNT%qa22");
//			Dhivya_locators.Password.sendKeys(ConfigFileReader.getPword());
//		}
//		@Then("^enter password as(.*?)$")
//		public void enters_Password(String arg1) throws Throwable {
//		    Dhivya_locators.Password.sendKeys(arg1);
//		}
//		
//		@Then("^clicks the Login button$")
//		public void clicks_the_Login_button() throws Throwable {
//		    Dhivya_locators.Loginbtn.click();
//		}
	@Then("^enters username$")
	public void enters_username() throws Throwable {
		AMS_locators.Username.sendKeys(ConfigFileReader.getUname());
	}

	@Then("^enters password$")
	public void enters_password() throws Throwable {
		AMS_locators.Password.sendKeys(ConfigFileReader.getPword());
	}

	@Then("^clicks the Login button$")
	public void clicks_the_Login_button() throws Throwable {
		AMS_locators.Loginbtn.click();
	}

	@Then("^clicks the menu button$")
	public void clicks_the_menu_button() throws Throwable {
		AMS_locators.ClickMenu.click();
	}

	@Then("^move to the asset mgmt$")
	public void move_to_the_asset_mgmt() throws Throwable {
		AMS_locators.AssetMgmt.click();
	}

	@Then("^move to the AMS (\\d+)\\.(\\d+)$")
	public void move_to_the_AMS(int arg1, int arg2) throws Throwable {
		AMS_locators.AMSo.click();
	}

	@Then("^move to the Operations & Maintenance$")
	public void move_to_the_Operations_Maintenance() throws Throwable {
		AMS_locators.OAM.click();
	}

	@Then("^move to LogSheet$")
	public void move_to_LogSheet() throws Throwable {
		AMS_locators.LogSheet.click();
	}

	@Then("^select jobcode from dropdown$")
	public void select_jobcode_from_dropdown() throws Throwable {
		AMS_locators.JobCode.sendKeys(ConfigFileReader.getjobcode());
		Thread.sleep(5000);
	}

	@Then("^select assetcode from dropdown$")
	public void select_assetcode_from_dropdown() throws Throwable {
		System.out.println("asset code");
		AMS_locators.AssetCode.sendKeys(ConfigFileReader.getassetcode(), Keys.TAB);
		Thread.sleep(5000);
	}

	@Then("^select date from dropdown$")
	public void select_date_from_dropdown() throws Throwable {
		AMS_locators.Duration.sendKeys(ConfigFileReader.getduration());
	}

	@Then("^clicks go button$")
	public void clicks_go_button() throws Throwable {
		AMS_locators.Go.click();
		Thread.sleep(5000);
	}

	@Then("^clicks refresh button$")
	public void clicks_refresh_button() throws Throwable {
//		try {
//			Thread.sleep(5000);
//			AMS_locators.Refresh.click();
//		} catch (Exception e) {
//			Thread.sleep(5000);
//			jse.executeScript("argument[0].click()", AMS_locators.Refresh);
//		}
		
		Thread.sleep(5000);
		//AMS_locators.Refresh.click();
	}

	@Then("^clicks i icon$")
	public void clicks_i_icon() throws Throwable {
		try {
			Thread.sleep(5000);
			AMS_locators.iicon.click();
			
		}catch(Exception e) {
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", AMS_locators.iicon);
		}
	}

	@Then("^clicks iot icon$")
	public void clicks_iot_icon() throws Throwable {
		AMS_locators.iotbtn.click();
	}

	@Then("^clicks the profile button$")
	public void clicks_the_profile_button() throws Throwable {
		Thread.sleep(5000);
		AMS_locators.profileDr.click();
	}

	@Then("^clicks the signout button$")
	public void clicks_signout_button() throws Throwable {
		AMS_locators.profileDr.click();
	}

	@Then("calculate the values in work column$")
	public void calculate_the_values_in_work_column() throws Throwable {

		ArrayList<String> workItems = new ArrayList<String>();

		List<WebElement> workcolumn = AMS_locators.workcol;
		for (int i = 0; i < workcolumn.size(); i++) {
			String workhours = workcolumn.get(i).getText();
			workItems.add(workhours);
			// System.out.println("Work Hours :"+ workhours);
			/*
			 * if (column_data.get(i)) { System.out.println("Total workdone :" +
			 * column_data); }
			 */
		}
		System.out.println(workItems);

	}

	@Then("^compare the values asset info with db$")
	public void compare_the_values_asset_info_with_db() throws Throwable {
		// DataBaseConnection.dataBaseConnectionAlm();
		String derNumber_str = DataBaseConnection.DERNumber();	
		
		// System.out.println(derNumber_str);
		
//		float derNumber_float = Float.parseFloat(derNumber_str);		
//		int derNumber_int = (int)derNumber_float;
		// System.out.println("Database Value: "+derNumber_int);
	}

	@Then("^close the connection$")
	public void close_the_connection() throws Throwable {
		DataBaseConnection.databaseConnectionClose();
	}

	@Then("close the browser$")
	public void close_the_browser() throws Throwable {

	}
}
