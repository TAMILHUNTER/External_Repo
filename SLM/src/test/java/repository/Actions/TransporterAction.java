package repository.Actions;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import object_repository.Locators.CommonControlObject;
import object_repository.Locators.TransportRequestObjects;
import object_repository.Locators.TransporterObject;
import stepdefinition.Webdriver;

public class TransporterAction {
public TransporterAction() {
	PageFactory.initElements(Webdriver.driver,TransporterObject.class);
}
public static String transportfrqNumber;

public static void searchFRQ(String frqNumber) throws InterruptedException {
	transportfrqNumber=frqNumber;
	WebDriverWait wait=new WebDriverWait(Webdriver.driver, 3000);
	wait.until(ExpectedConditions.elementToBeClickable(TransporterObject.advanceSearch));
	Thread.sleep(5000);
	TransporterObject.advanceSearch.click();
	TransporterObject.documentNo.sendKeys(transportfrqNumber);
	TransporterObject.go.click();
}

public static void verifyVehicleDetails(String frqNumber,String numberofVehicle, String rate, String fromLocation, String toLocation, String distanceKm) {
	assertEquals(frqNumber,TransporterObject.frqNumber.getText());
	assertEquals(numberofVehicle,TransporterObject.numberOfVehicles.getText());
	String amount=rate;
	 double number = Double.parseDouble(amount);
	 String amt = String.format("%,0f", number);
     System.out.println(amt);
	assertEquals(amt,TransporterObject.rupees.getText()+"00");
	assertEquals("INR-Indian rupee", TransporterObject.currency.getText());
	assertEquals(distanceKm,TransporterObject.kms.getText()+"0000");
	assertEquals(fromLocation, TransporterObject.fromLocation.getText());
	assertEquals(toLocation, TransporterObject.toLocation.getText());
	//assertEquals("test",TransporterObject.frqValue.getText());
}

public static void verifyTheFRQSavedAsDraft() throws InterruptedException {
	LoginEipActions login=new LoginEipActions();
	// CommonControlObject cco=new  CommonControlObject();
	 CommonControlObject.profileIcon.click();
	 CommonControlObject.signOut.click();
	 login.otheruser();
	 login.userNameAndPassword();
	 login.login();
	 MenuTraverseActions.clickMainMenu();
	 MenuTraverseActions.supplychainManagement();
	 MenuTraverseActions.Logistics();
	 TransportRequestObjects.transportRequest.click();	
	 CommonControlActions.allTab();
	 CommonControlActions.clickSearchicon();
	 CommonControlActions.sendDocumentNumber(transportfrqNumber);
	 CommonControlObject.search.click();
	 assertEquals("Draft", CommonControlObject.status.getText());
}
}
