package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMS_locators {
	// Common
			public @FindBy(xpath = "//html") static WebElement initialnode;

			/* Login Page Start */
			public @FindBy(xpath = "//a[text()='Other User']") static WebElement Otheruser;
			public @FindBy(xpath = "//input[@id='username']") static WebElement Username;
			public @FindBy(xpath = "//input[@id='password-field']") static WebElement Password;
			public @FindBy(xpath = "//button[@id='login-submit']") static WebElement Loginbtn;
			public @FindBy(id = "profiledropdownbtn") static WebElement profileDr;
			public @FindBy(linkText = "Sign Out") static WebElement Signout;
			//public @FindBy(xpath = "//a[@class='modulemenu']") static WebElement Menubtn;
			//public @FindBy(xpath = "//span[text()='Asset Mgmt']") static WebElement assetmgmt;
			public @FindBy(xpath = "//*[@class='modulemenu']") static WebElement ClickMenu;
			public @FindBy(xpath = "//*[text()='Asset Mgmt']") static WebElement AssetMgmt;
			//public @FindBy(xpath = "//*[text()='Asset Mgmt.']") static WebElement AssetMgmts;
			public @FindBy(xpath = "//*[text()='AMS 4.0']") static WebElement AMSo;
			public @FindBy(xpath = "//*[text()='Operations & Maintenance']") static WebElement OAM;
			public @FindBy(xpath = "//*[text()='Log Sheet']") static WebElement LogSheet;
			//public @FindBy(xpath = "//*[text()='Break Down Entry']") static WebElement BreakDownEntry;
			public @FindBy(xpath = "//*[@data-placeholder='Job']") static WebElement JobCode;
			public @FindBy(xpath = "//*[@id=\"lsAssetCode\"]") static WebElement AssetCode;
			public @FindBy(xpath = "(//*[@id=\"icon-rightdateRange_Kendo\"])[1]") static WebElement Duration;
			public @FindBy(xpath = "//i[@title='Go']") static WebElement Go;
			public @FindBy(xpath = "//i[@title='Refresh']") static WebElement Refresh;
			public @FindBy(id = "ibtAssetInfo") static WebElement iicon;
			public @FindBy(id="ibtIOTSensorInfo") static WebElement iotbtn;
			public @FindBy(xpath="//table/tbody/tr/td[7]") static WebElement workcolumn;
			public @FindBy(xpath="//table/thead/tr[2]/th[8]") static WebElement idlecolumn;
			public @FindBy(xpath="//table/thead/tr[2]/th[9]") static WebElement breakdowncolumn;
			public @FindBy(xpath="//table/thead/tr[2]/th[10]") static WebElement otcolumn;
			public @FindBy(xpath="//table/thead/tr[2]/th[11]") static WebElement fuelcolumn;
			
			

			public @FindBy(xpath="//table/tbody/tr/td[7]") static List<WebElement> workcol;
			
}
