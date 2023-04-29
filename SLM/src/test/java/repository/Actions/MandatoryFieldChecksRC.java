package repository.Actions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import dataProviders.ConfigFileReader;
import object_repository.Locators.CreateRCObjects;
import stepdefinition.Webdriver;

public class MandatoryFieldChecksRC {
	
	static JavascriptExecutor executor = (JavascriptExecutor)Webdriver.driver;
	
	public MandatoryFieldChecksRC() {
		PageFactory.initElements(Webdriver.driver, CreateRCObjects.class);
		
	}

	public static void essentialsDetails() throws InterruptedException {	
		
		essentailDetailsSubmit();
		CreateRCAction.selectJob();	
		
		CreateRCObjects.rateContractorsName.click();
		essentailDetailsSubmit();
		CreateRCAction.selectRateContractorsName();
		
		essentailDetailsSubmit();
		CreateRCAction.selectEffectiveDate();
		
		//CreateRCObjects.RCType.clear(); 
		essentailDetailsSubmit();
		CreateRCAction.selectRCType();
		
		essentailDetailsSubmit();
		CreateRCAction.captureReferenceNumber();
		essentailDetailsSubmit();
		CreateRCAction.captureTheInternalRemarks();
		essentailDetailsSubmit();
		CreateRCAction.captureExternalRemarks();
		
		CreateRCAction.selectRcScope();			
//	    CreateRCObjects.closeCurrency.click();
//	    CommonControlActions.wait(CreateRCObjects.submit);
//	    CreateRCObjects.submit.click();
//		CommonControlActions.wait(CreateRCObjects.ok);
//		assertEquals("Please select Currency", CreateRCObjects.ErrorMessage.getText());
//		CreateRCObjects.ok.click();
//		CreateRCObjects.currency.sendKeys(ConfigFileReader.CurrencyType());	
//		System.out.println("currency captured");
//		//CommonControlActions.wait(CreateRCObjects.ok);
//		CreateRCObjects.ok.click();	
	}
	public static void essentailDetailsSubmit() {
		CreateRCObjects.submit.click();	
		System.out.println("Submit clicked");
		CommonControlActions.wait(CreateRCObjects.ok);
		CreateRCObjects.ok.click();
	}
	public static void TransportDetails() {
		System.out.println("Transport Details");
		CommonControlActions.wait(CreateRCObjects.add);
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select Vehicle Type",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.vehicleType();		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please enter Min Guaranty Weight",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.minGuarantyWeight();
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please enter Max Weight Capacity",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.maxWeightCapacity();
		
		/*CreateRCObjects.fromCountry.click();	    
		CreateRCObjects.fromCountry.clear();		
		CreateRCObjects.fromCountryClose.click();
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select From Country",CreateRCObjects.ErrorMessage.getText());		
		CreateRCObjects.ok.click();
		CreateRCObjects.fromCountry.click();
		CreateRCObjects.fromCountry.sendKeys(ConfigFileReader.FromCountry());
		
		CreateRCObjects.toCountry.click();		
		CreateRCObjects.toCountry.clear();
		CreateRCObjects.toCountryClose.click();
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select To Country",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCObjects.toCountry.click();
		CreateRCObjects.toCountry.sendKeys(ConfigFileReader.ToCountry());*/ //required in future
						
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select From State",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.fromState();
		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select To State",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.toState();	
				
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select From City",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.fromCity();
		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select To City",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.toCity();
		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select From Location",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.fromLocation();
		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select To Location",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.toLocation();
		
		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Please select Terrain Type",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.terrainType();
		
		CreateRCObjects.add.click();
		CommonControlActions.wait(CreateRCObjects.ok);
		assertEquals("Rate can not be 0",CreateRCObjects.ErrorMessage.getText());
		CreateRCObjects.ok.click();
		CreateRCAction.ratePerMT();
		
	}

	public static void paymentTerms() {
		CreateRCAction.paymentRelease();
	}	
	
	
}
