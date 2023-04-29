import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Project\\EDMS Automation\\src\\main\\resources\\driver\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(("www.google.com"));
	}
}
