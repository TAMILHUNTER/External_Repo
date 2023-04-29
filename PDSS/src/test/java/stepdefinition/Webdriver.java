package stepdefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import config.ConfigFileReader;
import org.openqa.selenium.edge.EdgeDriver;


public class Webdriver {
//testing
	public static WebDriver driver;
	public static ConfigFileReader configFileReader;
	
	public static void driver() {
			configFileReader = new ConfigFileReader();
			if(ConfigFileReader.getBrowser().equalsIgnoreCase("Chrome")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Browser");
				System.setProperty("webdriver.chrome.driver", ConfigFileReader.getDriverPath_Chrome());
				ChromeOptions options = new ChromeOptions();
			//	options.addArguments("headless");
				driver = new ChromeDriver(options);
			
			}
			if(ConfigFileReader.getBrowser().equalsIgnoreCase("Firefox")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Bowser");
				System.setProperty("webdriver.gecko.driver", ConfigFileReader.getDriverPath_Firefox());
				WebDriver driver = new FirefoxDriver();
				driver = new FirefoxDriver();
				}
			if(ConfigFileReader.getBrowser().equalsIgnoreCase("Edge")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Bowser");
				System.setProperty("webdriver.edge.driver", ConfigFileReader.getDriverPath_Edge());
				WebDriver driver = new EdgeDriver();
				driver = new EdgeDriver();
				}
		
			int implicitWaitTime=(30);
			driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
	
}
