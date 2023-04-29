package BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.ObjectsReporsitory;
import stepdefinition.Webdriver;


public class Baseclass {
	
	
		public static WebDriver driver;
		public static Alert a;
		
		public static void launchBrowers() {
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}
		
		public static void url(String name) {
			driver.get(name);
			
		}
		public static void maximum() {
			driver.manage().window().maximize();
		}
		public static void wait(int sec) {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		public static void title() {
			String title = driver.getTitle();
			System.out.println(title);

		}
		public static void currenturl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);

		}
		public static void senttext(WebElement loc,String name) {
			loc.sendKeys(name);

		}
		public static void click(WebElement clc) {
			clc.click();
		}
		public static void screenshot(String name) throws IOException {
			TakesScreenshot t=(TakesScreenshot)driver;
			File screenshotAs = t.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\praveen\\eclipse-workspace\\Demo\\ScreenShot\\"+name+".png");
			FileUtils.copyDirectory(screenshotAs, des);
	    }
		public static void accept() {
			a= driver.switchTo().alert();
			a.accept();
		}
		public static void dimiss() {
			a=driver.switchTo().alert();
			a.dismiss();
		}
		public static void sendkey(String name) {
			a=driver.switchTo().alert();
			a.sendKeys(name);
		}
		public static void gettext() {
			a=driver.switchTo().alert();
			a.getText();
		}
		public static void movetoElemt(Object name ) {
			Actions b=new Actions(Webdriver.driver);
			b.moveToElement((WebElement) name).build().perform();
				
		}
		public static void moveToClick(Object name) {
			Actions a= new Actions(Webdriver.driver);
			a.moveToElement((WebElement) name).click().perform();
		}
		public static void draganddrop( WebElement source ,WebElement target) {
			Actions a=new Actions(Webdriver.driver);
			a.dragAndDrop(source, target).perform();
			
		}
		public static void doubleclick() {
			Actions a=new Actions(driver);
			a.doubleClick().perform();
		}
		
		public static void dclickelement(Object name) {
			Actions a=new Actions(Webdriver.driver);
			a.doubleClick((WebElement) name).build().perform();
		}
		public static void findxpath(String location) {
			driver.findElement(By.name(location));

		}
		 	
		public static void quit (WebDriver q) {
			q.quit();
		}
		public static void close() {
			Webdriver.driver.close();
		}
		public static void context(WebElement name) {
			Actions a=new Actions(driver);
			a.contextClick(name);
		}
		public static void contextelement(WebElement name) {
			Actions a=new Actions(driver);
			a.contextClick(name);
		}
		
		public static void javascript(String key,WebElement args) {
			JavascriptExecutor j=(JavascriptExecutor)(WebDriver)driver;
			j.executeScript(key, args);
		}
		public static void javascriptsendkey(WebElement args ) {
			JavascriptExecutor j= (JavascriptExecutor)(WebDriver)driver;
			j.executeScript( "arguments[0].setAttribute('value','name');", args);
		}
		public static void javascriptgettext(WebElement args) {
			JavascriptExecutor j=(JavascriptExecutor)(WebDriver)driver;
			j.executeScript("arguments[0].get Attribute('value');", args);
		}
		public static void toclick(WebElement args) {
			JavascriptExecutor j=(JavascriptExecutor) (WebDriver)driver;
			j.executeScript("arguments[0].click();", args);
		}
		public static void toscroll(WebElement args) {
			JavascriptExecutor j=(JavascriptExecutor)(WebDriver) driver;
			j.executeScript("arguments[0].scrollIntoView(true);", args);
		}
		public static void scrollbottom(WebElement args) {
			JavascriptExecutor j=(JavascriptExecutor)(WebDriver)driver;
			j.executeScript("arguments[0].scrollIntoView(false);", args);
		}
		public static void key(WebElement robo) throws AWTException {
			Robot r = new Robot();
			for (int i = 0; i <=4; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void byvalue(WebElement name ,String value ) {
			Select s=new Select(name);
			s.selectByValue(value);
			
		}
		public static void visibletext(WebElement name , String text) {
			Select s=new Select(name);
			s.selectByVisibleText(text);
		}
		public static void byindex(WebElement name,int index) {
			Select s=new Select((WebElement) name);
			s.selectByIndex(index); 
		}
		public static void deselectindex(WebElement name,int index) {
			Select s=new Select(name);
			s.deselectByIndex(index); 
		}
		public static void deselectvalue(WebElement name,String value) {
			Select s=new Select(name);
			s.deselectByValue(value);
		}
		public static void deselectvisible(WebElement name,String text) {
			Select s=new Select(name);
			s.deselectByVisibleText(text);
		}
		public static void deselectAll(WebElement name) {
			Select s=new Select(name);
			s.deselectAll();
		}
		public static void windowhandle() {
			driver.getWindowHandle();
		}
		public static void windowhandles() {
			driver.getWindowHandles();
		}
		public static void Tab_key() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		public static void WareHouse_Select(WebElement ware) throws AWTException {
			Robot r = new Robot();
			for (int i = 0; i <=8; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void Material_Select() throws AWTException {
			Robot r = new Robot();
			for (int i = 0; i <=8; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void Action_Sent() {
			
			for (int i = 0; i <=16; i++) {
				
				ObjectsReporsitory.Material_Name.sendKeys(Keys.SHIFT);
				ObjectsReporsitory.Material_Name.sendKeys(Keys.CONTROL);
				ObjectsReporsitory.Material_Name.sendKeys(Keys.ARROW_RIGHT);
				ObjectsReporsitory.Material_Name.sendKeys("C");
				
			}	
		}
		
		public static void Control_V() {
			
			ObjectsReporsitory.Material_search_text.sendKeys(Keys.CONTROL);
			ObjectsReporsitory.Material_search_text.sendKeys("V");
		}
		
		public static void Action_Tab_key(WebElement tab) {
			
			tab.sendKeys(Keys.TAB);
		}
		public static void Refresh() {
			driver.navigate().refresh();
		}
		
		public static void Forward() {
			driver.navigate().forward();
		}
		public static void Backward() {
			driver.navigate().back();
				
		}
		public static void jsrefresh() {
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("location.reload()");
		}
		public static void PressF5() {
			Actions actions = new Actions(driver);
//			actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
			actions.keyDown(Keys.F5).perform();
			actions.keyUp(Keys.F5).perform();
//			actions.sendKeys(Keys.CONTROL).perform();
//			
//			actions.sendKeys("R");
	
		}
		public static void F5 () {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		}
		public static void Refreshclick() {
			
			driver.findElement(By.xpath("//body")).click();
		
		}
		public static void clear(WebElement c) {
			c.clear();
		}
		
		public static void Update_Excel(String Sheetname, int rowno, int cellno) throws IOException {
			
//				File f=new File("");
//				FileInputStream fi=new FileInputStream(f);
//				Workbook book=new XSSFWorkbook(fi);
//				Sheet sheet = book.getSheet(Sheetname);
//				Row row = sheet.getRow(rowno);
//				Cell cell = row.getCell(cellno);
//			 int type = cell.getCellType();
//				String name="";
//				
//				if (type==1) {
//					 name = cell.getStringCellValue();
//					
//				}else if (DateUtil.isCellDateFormatted(cell)) {
//					 Date d = cell.getDateCellValue();
//					 
//					 SimpleDateFormat s=new SimpleDateFormat("dd MMM YYY");
//					  name = s.format(d);
//				}
//				else {
//					double d = cell.getNumericCellValue();
//					long l=(long)d;
//				     name = String.valueOf(0);
//				}
//				return; 
		}
		public static void Tab_Click() throws Throwable {
			
			for (int i = 0; i <=31; i++) {
				
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				
			}
			
		}
		
		public static void Multiple_job(int c, java.util.List<WebElement> list) {
			
			Actions a=new Actions((WebDriver) driver);
//			java.util.List<WebElement> list = driver.findElements(By.xpath("(//div[@class='ng-star-inserted'])"));
			a.keyDown(Keys.CONTROL)
			.click(list.get(c))
			.build()
			.perform();
			
		
		}
		
		public static void Upload_File(String path) throws Throwable {
			
//			Copy path
			Robot r=new Robot();
			r.delay(2000);
			StringSelection s=new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			
//			past path
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
//			Enter path
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			
		}
		
		//
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";
		
		//
		
		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
		
		public static void ToRight(WebElement a) {
			
			JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver; 
			js.executeScript("arguments[0].scrollIntoView();",a);
		}

		
		
	
}
