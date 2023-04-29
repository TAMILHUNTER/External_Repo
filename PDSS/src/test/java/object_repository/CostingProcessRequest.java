package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostingProcessRequest {
	
	

	public @FindBy(xpath = "(//a[contains(text(),'Costing')])[1]") static WebElement Costing;
	public @FindBy(xpath = "//a[text()=' Costing Process Request  ']") static WebElement CostingProcessRequest;
	public @FindBy(id = "btnSubmitReport") static WebElement CostingProcessRequestCreate;
	public @FindBy(id = "btnyes") static WebElement clickOnConfirmationYesCostingCreate;
	
	
	
	
	

}
