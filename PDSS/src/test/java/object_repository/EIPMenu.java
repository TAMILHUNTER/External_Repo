package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EIPMenu {
	
	

	public @FindBy(xpath = "//a[@title='Access Based Menu']") static WebElement Menu;
	public @FindBy(xpath = "//span[text()='Business Apps']") static WebElement BusinessApps;
	public @FindBy(xpath = "//span[text()='PDSS 4.0']") static WebElement PDSS;
	
	
	

}
