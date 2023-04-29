package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard_objects {
	
	//**Dashboard Elements**
	
	@FindBy(how = How.XPATH, using="(//mat-card-content//i)[1]")
	public  static WebElement Dashboard_Profile_Eye;
	
	@FindBy(how = How.XPATH, using="(//mat-card-content//p)[1]")
	public  static WebElement Dashboard_Workmen_Name;
	
	@FindBy(how = How.XPATH, using="(//mat-card-content//p)[2]")
	public  static WebElement Dashboard_Workmen_ID;
	
	@FindBy(how = How.XPATH, using="(//mat-card-content//p)[3]")
	public  static WebElement Dashboard_Profile_Job_Partner_Code;
		
	}
