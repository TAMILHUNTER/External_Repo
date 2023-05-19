package stepdefinition.Management.Camp_Management;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Given;

public class Camp_Management {

	public static int popup_validation;
	public static int length_of_spinner;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************

	@Given("^Create Camp$")
	public static void Create_Camp() throws InterruptedException {

		DriverFactory.driver.get("https://eip4qa.lntecc.com/");
	    DriverFactory.driver.findElement(By.linkText("Other User")).click();
	    DriverFactory.driver.findElement(By.id("username")).clear();
	    DriverFactory.driver.findElement(By.id("username")).sendKeys("arvind_ps");
	    DriverFactory.driver.findElement(By.id("password-field")).clear();
	    DriverFactory.driver.findElement(By.id("password-field")).sendKeys("QA%lnt@23");
	    DriverFactory.driver.findElement(By.id("username")).click();
	    DriverFactory.driver.findElement(By.id("password-field")).click();
	    DriverFactory.driver.findElement(By.id("login-submit")).click();
	    Thread.sleep(5000);
	    DriverFactory.driver.findElement(By.xpath("//a[contains(@href, 'javascript:void(0)')]")).click();
	    Thread.sleep(2000);
	    DriverFactory.driver.findElement(By.cssSelector("span[title=\"Workmen Management\"]")).click();
	    Thread.sleep(2000);
	    DriverFactory.driver.findElement(By.cssSelector("span[title=\"WMS 4.0\"]")).click();
	    Thread.sleep(2000);
	    DriverFactory.driver.findElement(By.xpath("//div[7]/a/span/i")).click();
	    Thread.sleep(2000);
	    DriverFactory.driver.findElement(By.xpath("//div[@id='CampManagement']/div[2]/img")).click();
	    Thread.sleep(2000);
	    DriverFactory.driver.findElement(By.id("AddCamp")).click();
	    Thread.sleep(2000);
	    DriverFactory.driver.findElement(By.id("CampName")).clear();
	    DriverFactory.driver.findElement(By.id("CampName")).sendKeys("Testing 1");
	    DriverFactory.driver.findElement(By.id("Address")).click();
	    DriverFactory.driver.findElement(By.id("Address")).clear();
	    DriverFactory.driver.findElement(By.id("Address")).sendKeys("Testing address");
	    DriverFactory.driver.findElement(By.id("pincode")).clear();
	    DriverFactory.driver.findElement(By.id("pincode")).sendKeys("600001");
	    DriverFactory.driver.findElement(By.xpath("//eipautocomplete[@id='villageCity']/mat-form-field/div/div/div")).click();
	    DriverFactory.driver.findElement(By.id("permVillageCity")).click();
	    DriverFactory.driver.findElement(By.id("submitCamp")).click();
	    DriverFactory.driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']/eipmessagebox/div/div[3]/button")).click();
		
	}

}
