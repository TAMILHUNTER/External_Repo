package stepdefinition;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import dataProviders.ConfigFileReader;


public class Webdriver {
//testing
	public static WebDriver driver;
	public static ConfigFileReader configFileReader;
	
	public static void driver() {
			configFileReader = new ConfigFileReader();
			if(ConfigFileReader.getBrowser().equalsIgnoreCase("Chrome")){
				System.out.println("Testing will be proceed in "+ConfigFileReader.getBrowser()+" Bowser");
				System.out.println("********************************************");
				System.setProperty("webdriver.chrome.driver", ConfigFileReader.getDriverPath_Chrome());
				ChromeOptions options = new ChromeOptions();
				options.addArguments("use-fake-ui-for-media-stream");
				options.addArguments("headless");
				options.addArguments("start-maximized");
				Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("credentials_enable_service", false);
                prefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", prefs);
				options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
				driver = new ChromeDriver(options);
				//Resize the current window to the given dimension
				Dimension d = new Dimension(1920,1080);
				driver.manage().window().setSize(d);

			}
			/*if(ConfigFileReader.getBrowser().equalsIgnoreCase("Firefox")){
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
			else{
				System.out.println("Browser not defined");
				//driver.quit();
			}*/
			int implicitWaitTime=(30);
			driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
	
}
