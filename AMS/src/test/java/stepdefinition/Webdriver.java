package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import dataProviders.ConfigFileReader;


public class Webdriver {
//testing
	public static WebDriver driver;
	public static ConfigFileReader configFileReader;
	
	public static void driver() {
			configFileReader = new ConfigFileReader();
			if(ConfigFileReader.getBrowser().equals("Chrome")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Browser");
				System.setProperty("webdriver.chrome.driver", ConfigFileReader.getDriverPath_Chrome());
				ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                driver = new ChromeDriver(options);
				
			}
			else if(ConfigFileReader.getBrowser().equals("Firefox")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Browser");
				System.setProperty("webdriver.gecko.driver", ConfigFileReader.getDriverPath_Firefox());
				WebDriver driver = new FirefoxDriver();
				driver = new FirefoxDriver();
				}
			else if(ConfigFileReader.getBrowser().equals("Edge")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Browser");
				System.setProperty("webdriver.edge.driver", ConfigFileReader.getDriverPath_Edge());
				WebDriver driver = new EdgeDriver();
				driver = new EdgeDriver();
				}
			else{
				System.out.println("Browser not defined");
				//driver.quit();
			}
			int implicitWaitTime=(10);
			driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
	
}