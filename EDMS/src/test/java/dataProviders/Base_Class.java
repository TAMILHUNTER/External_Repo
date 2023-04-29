package dataProviders;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import object_repository.Locators.EngineeringSchedule;
import object_repository.Locators.RepositoryDocObject;
import stepdefinition.Webdriver;

public class Base_Class extends ConfigFileReader {

                public static WebDriver driver;
                public static Actions a;
                public static Robot r;
                public static Alert t;
                public static TakesScreenshot s;
                public static JavascriptExecutor j;
                public static Select se;
                public static WebDriverWait wWait;
                public static FluentWait fWait;

                public static void Get_Environment(String url) {
                                Webdriver.driver.manage().deleteAllCookies();
                                driver.manage().window().maximize();
                                Webdriver.driver.get(url);
                }

                public static void Print(String ToPrint) {
                                System.out.println(ToPrint);
                }

                public static void Input(WebElement ele, String value) {

                                ele.sendKeys(value);
                }

                public static void InputTab(WebElement ele, String value) {

                                ele.sendKeys(value, Keys.TAB);
                }

                public static void Click(WebElement ele) {
                                ele.click();
                }

                public static void Clear(WebElement ele) {
                                ele.click();
                                ele.clear();
                }

                public static void Close() {
                                driver.close();
                }

                public static void Quit() {
                                driver.quit();
                }

                public static String GetText(WebElement ele) {
                                String text = ele.getText();
                                Print(text);
                                return text;
                }

                public static void PrintTitle() {
                                System.out.println(driver.getTitle());
                }

                public static String GetAttribute(WebElement ele, String value) {
                                String attribute = ele.getAttribute(value);
                                return attribute;
                }

                public static void PrintAttribute(WebElement ele, String value) {

                                Print(GetAttribute(ele, value));
                }

                public static void MoveTo(WebElement ele) {
                                a = new Actions(driver);
                                a.moveToElement(ele).perform();
                }

                public static void Drag(WebElement source, WebElement target) {
                                a = new Actions(driver);
                                a.dragAndDrop(source, target).perform();
                }

                public static void Doule_Click(WebElement ele) {
                                a = new Actions(driver);
                                a.doubleClick(ele).perform();
                }

                public static void Right_Click(WebElement ele) {
                                a = new Actions(driver);
                                a.contextClick(ele).perform();
                }

                public static void build() {
                                a = new Actions(driver);
                                a.build().perform();
                }

                public static void sKeys(WebElement target, String keys) {
                                a = new Actions(driver);
                                a.sendKeys(target, keys);
                }

                public static void clk() {
                                a.click().perform();
                }

                public static void SelectAll() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_CONTROL);
                                r.keyPress(KeyEvent.VK_A);
                                r.keyRelease(KeyEvent.VK_CONTROL);
                                r.keyRelease(KeyEvent.VK_A);
                }

                public static void Cut() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_CONTROL);
                                r.keyPress(KeyEvent.VK_X);
                                r.keyRelease(KeyEvent.VK_CONTROL);
                                r.keyRelease(KeyEvent.VK_X);
                }

                public static void Copy() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_CONTROL);
                                r.keyPress(KeyEvent.VK_C);
                                r.keyRelease(KeyEvent.VK_CONTROL);
                                r.keyRelease(KeyEvent.VK_C);
                }

                public static void Paste() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_CONTROL);
                                r.keyPress(KeyEvent.VK_V);
                                r.keyRelease(KeyEvent.VK_CONTROL);
                                r.keyRelease(KeyEvent.VK_V);
                }

                public static void Tab() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_TAB);
                                r.keyRelease(KeyEvent.VK_TAB);
                }

                public static void Shift() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_SHIFT);
                                r.keyRelease(KeyEvent.VK_SHIFT);
                }

                public static void Enter() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_ENTER);
                                r.keyRelease(KeyEvent.VK_ENTER);
                }

                public static void Delete() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_DELETE);
                                r.keyRelease(KeyEvent.VK_DELETE);
                }

                public static void Home() throws AWTException {
                                r = new Robot();
                                r.keyPress(KeyEvent.VK_HOME);
                                r.keyRelease(KeyEvent.VK_HOME);
                }

                public static void Alert() {
                                t = driver.switchTo().alert();
                }

                public static void Accept_Alert() {
                                t = driver.switchTo().alert();
                                t.accept();
                }

                public static void Dismiss_Alert() {
                                t = driver.switchTo().alert();
                                t.dismiss();
                }

                public static void SendText_Alert(String value) {
                                t = driver.switchTo().alert();
                                t.sendKeys(value);
                }

                public static void GetText_Alert() {
                                t = driver.switchTo().alert();
                                System.out.println(t.getText());
                }

                public static void idFrame(String id) {
                                driver.switchTo().frame(id);
                }

                public static void nameFrame(String name) {
                                driver.switchTo().frame(name);
                }

                public static void intFrame(int index) {
                                driver.switchTo().frame(index);
                }

                public static void webEleFrame(WebElement ref) {
                                driver.switchTo().frame(ref);
                }

                public static void parFrame() {
                                driver.switchTo().parentFrame();
                }

                public static void mainFrame() {
                                driver.switchTo().defaultContent();
                }

                public static void screenshot(String path, String filename) throws IOException {
                                s = (TakesScreenshot) driver;
                                File src = s.getScreenshotAs(OutputType.FILE);
                                File des = new File(path + filename + ".jpg");
                                FileUtils.copyFile(src, des);
                }

                public static void fill(String attribute, String value, WebElement ele) {
                                j = (JavascriptExecutor) driver;
                                j.executeScript("arguments[0].setAttribute('" + attribute + "','" + value + "')", ele);
                }

                public static void jsGetAtt(String attributeName, WebElement ele) {
                                j = (JavascriptExecutor) driver;
                                Object executeScript = j.executeScript("return arguments[0].getAttribute('" + attributeName + "')", ele);
                                String text = executeScript.toString();
                                System.out.println(attributeName + " :" + text);
                }

                public static void jsClk(WebElement ele) {
                                j = (JavascriptExecutor) driver;
                                j.executeScript("arguments[0].click ()", ele);
                }

                public static void jsTop(WebElement ele) {
                                j = (JavascriptExecutor) driver;
                                j.executeScript("arguments[0].scrollIntoView(true)", ele);
                }

                public static void jsBottom(WebElement ele) {
                                j = (JavascriptExecutor) driver;
                                j.executeScript("arguments[0].scrollIntoView(false)", ele);
                }

                public static void jsHighlight(String backgoungColour, int pixel, String broderColour, WebElement ele) {
                                j = (JavascriptExecutor) driver;
                                j.executeScript("arguments[0].setAttribute('style','background:" + backgoungColour + "; border:" + pixel + "px "
                                                                + broderColour + ";');", ele);
                }

                public static void value(WebElement ele, String value) {
                                se = new Select(ele);
                                se.selectByValue(value);
                }

                public static void SelectText(WebElement ele, String text) {
                                se = new Select(ele);
                                se.selectByVisibleText(text);
                }

                public static void index(WebElement ele, int index) {
                                se = new Select(ele);
                                se.selectByIndex(index);
                }

                public static void isMulti(WebElement ele) {
                                se = new Select(ele);
                                se.isMultiple();
                }

                public static void getOption(WebElement ele) {
                                se = new Select(ele);
                                List<WebElement> options = se.getOptions();
                                System.out.println("Number of Options :" + options.size());
                                for (int i = 0; i < options.size(); i++) {
                                                String text = options.get(i).toString();
                                                System.out.println(text);
                                }
                }

                public static void getAllSelectedOptions(WebElement ele) {
                                se = new Select(ele);
                                List<WebElement> options = se.getAllSelectedOptions();
                                System.out.println("Number of Options :" + options.size());
                                for (int i = 0; i < options.size(); i++) {
                                                String text = options.get(i).toString();
                                                System.out.println(text);
                                }
                }

                public static void getFirstSelectedOption(WebElement ele) {
                                se = new Select(ele);
                                WebElement firstSelectedOption = se.getFirstSelectedOption();
                                System.out.println(firstSelectedOption.getText());
                }

                public static void deSelecteAll(WebElement ele) {
                                se = new Select(ele);
                                se.deselectAll();
                }

                public static void deSelectValue(WebElement ele, String value) {
                                se = new Select(ele);
                                se.deselectByValue(value);
                }

                public static void deSelectindex(WebElement ele, int index) {
                                se = new Select(ele);
                                se.deselectByIndex(index);
                }

                public static void deSelecttext(WebElement ele, String text) {
                                se = new Select(ele);
                                se.deselectByVisibleText(text);
                }

                public static void sinWinHandle() {
                                String windowHandle = driver.getWindowHandle();
                                System.out.println(windowHandle);
                }

                public static void multiWindowHandles() {
                                Set<String> windowHandles = driver.getWindowHandles();
                                for (String eachId : windowHandles) {
                                                System.out.println(eachId);
                                }
                }

                public static void switchWindows() {
                                String parentId = driver.getWindowHandle();
                                Set<String> allWindowsId = driver.getWindowHandles();
                                for (String eachId : allWindowsId) {
                                                if (!eachId.equals(allWindowsId)) {
                                                                driver.switchTo().window(eachId);
                                                }
                                }
                }

                public static void Implicit_Wait(int secs) {
                                driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
                }

                public static void Explicit_Wait(int secs) {
                                wWait = new WebDriverWait(driver, secs);
                }

                public static void Refresh() {
                                driver.navigate().refresh();
                }

                public static String AddNumber(WebElement Ele, int Int) {
                                String getText = GetText(Ele);
                                Integer integer = Integer.valueOf(getText);
                                int integer1 = integer + Int;
                                String string2 = String.valueOf(integer1);
                                return string2;
                }

                public static void kendo_calender(WebElement ele, String date) throws InterruptedException, AWTException {

                                Click(ele);
                                String[] Date = date.split("-");
                                SelectAll();
                                Delete();
                                Home();
                                Input(ele, Date[0]);
                                InputTab(ele, Date[1]);
                                InputTab(ele, Date[2]);
                }

                public void setAttributeValue(WebElement elem, String value) {
                                JavascriptExecutor js = (JavascriptExecutor) driver;
                                js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", elem, "value", value);
                }
}
































