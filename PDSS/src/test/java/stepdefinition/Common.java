package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common extends DataBaseConnection {

	WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);
	protected static Statement stmt;
	static String DB_Url, DB_User, DB_Pwd;
	static Connection con;
	static String finalResult;

	public void clickElement(WebElement element) throws InterruptedException {
	implicitWait();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", element);
	}

	public void pressDownArrow() throws AWTException {
		Robot robot = new Robot();
		implicitWait();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

	}

	public void pressTab() throws AWTException {
		Robot robot = new Robot();
		implicitWait();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

	}

	public void pressEnter() throws AWTException {
		Robot robot = new Robot();
		implicitWait();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void clickElementAfterTwoSeconds(WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		implicitWait();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", element);
	}

	public void implicitWait() {
		Webdriver.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void enterTestData(WebElement element, String TestData) {
		implicitWait();
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(TestData);
	}
	
	

	public void clickStaleElement(WebElement element) throws InterruptedException {
		Thread.sleep(1000);
		implicitWait();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].click();", element);
	}

	public void scrollWebPageDown() throws InterruptedException {
		implicitWait();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("window.scrollBy(0,750)");
	}

	public void assertVerify(String Expected, WebElement element) {
		Expected = element.getText();
	Assert.assertEquals(Expected, element);
	}

	public void verifyTitle(String expectedTitle) {
		try {
			implicitWait();
			String actualTitle = Webdriver.driver.getTitle();
			if (actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("Title Matched");
			else
				System.out.println("Title didn't match");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
