package repository.Actions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.Locators.RateContractViewPageObjects;
import stepdefinition.Webdriver;

public class RateContractViewPageActions {
	WebDriverWait wait=new WebDriverWait(Webdriver.driver, 5000);
	public RateContractViewPageActions() 
	{	
		PageFactory.initElements(Webdriver.driver, RateContractViewPageObjects.class);		
	}	 
	public static void VerifyTheCreatedRC(String rCNumber) throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(Webdriver.driver, 10);
		
		CommonControlActions.sendDocumentNumber(rCNumber);
		CommonControlActions.searchResultbutton();
		CommonControlActions.searchResult();
		CommonControlActions.clickDocumentNumberToView();
		/*wait.until(ExpectedConditions.elementToBeSelected(RateContractViewPageObjects.rcNumber));*/
		assertEquals(rCNumber,RateContractViewPageObjects.rcNumber.getText());
		String job=ConfigFileReader.getJob().substring(0, 7);
		assertEquals(job,RateContractViewPageObjects.viewJob.getText().substring(0, 7));
		RateContractViewPageObjects.viewRCInfo.click();
		assertEquals(ConfigFileReader.RateContractorName().substring(0, 7), RateContractViewPageObjects.viewRcName.getText().substring(0, 7));
		assertEquals(ConfigFileReader.RCType().substring(4, 17), RateContractViewPageObjects.viewRcType.getText());
		assertEquals(ConfigFileReader.Effectivedate(), RateContractViewPageObjects.viewDate.getText());
		assertEquals(ConfigFileReader.ReferenceNumber(), RateContractViewPageObjects.viewReference.getText());
		assertEquals(ConfigFileReader.InternalRemarks(), RateContractViewPageObjects.viewInternalRemarks.getText());
		assertEquals(ConfigFileReader.ExternalRemarks(),RateContractViewPageObjects.viewExternalRemarks.getText());
		RateContractViewPageObjects.viewAdditionalChargesclick.click();
		wait.until(ExpectedConditions.textToBePresentInElement(RateContractViewPageObjects.viewChargeDescription,"Detention Charges" ));
		assertEquals("Additional Charges", RateContractViewPageObjects.viewAdditionalChargesWindowTitle.getText().substring(0, 18));
		assertEquals(ConfigFileReader.AdditionalChargesTitle(), RateContractViewPageObjects.viewChargeDescription.getText());
		assertEquals(ConfigFileReader.AdditionalChargesAmount().substring(0, 5), RateContractViewPageObjects.viewChargeAmount.getText());
		assertEquals(ConfigFileReader.AdditionalChargesRemarks(), RateContractViewPageObjects.viewChargeRemarks.getText());
		RateContractViewPageObjects.viewChargeClose.click();
		RateContractViewPageObjects.viewTermsConditionClick.click();
		assertEquals("Terms and Conditions", RateContractViewPageObjects.viewTermsConditionTitle.getText());
		assertEquals(ConfigFileReader.TermsAndConditions(), RateContractViewPageObjects.viewTermsAndConditions.getText());
		RateContractViewPageObjects.viewTermsConditionTitleClose.click();
		assertEquals(CreateRCAction.selectedVehicle.substring(9),RateContractViewPageObjects.VehicleDescription.getText());		
		assertEquals(ConfigFileReader.FromState().substring(1, 2), RateContractViewPageObjects.FromState.getText().substring(1, 2));
		assertEquals(ConfigFileReader.FromCity(),RateContractViewPageObjects.FromCity.getText());
		assertEquals(ConfigFileReader.FromLocation(),RateContractViewPageObjects.FromLocation.getText());
		assertEquals(ConfigFileReader.ToState(),RateContractViewPageObjects.ToState.getText());
		assertEquals(ConfigFileReader.ToCity(),RateContractViewPageObjects.ToCity.getText());
		assertEquals(ConfigFileReader.ToLocation(),RateContractViewPageObjects.ToLocation.getText());
		if(RateContractViewPageObjects.rateType.getText().equals("Per Vehicle")) {
		assertEquals("Per Vehicle",RateContractViewPageObjects.rateType.getText());
		assertEquals(ConfigFileReader.RatePerVechile(),RateContractViewPageObjects.rate.getText());
	}
		else {
			
			assertEquals("Per MT",RateContractViewPageObjects.ratePerMetricTon.getText());
			assertEquals(ConfigFileReader.RatePerMT(),RateContractViewPageObjects.rate.getText());
		}
		
		assertEquals(CreateRCAction.selectedTerrianType.substring(7, 12),RateContractViewPageObjects.terrainType.getText());
		assertEquals(ConfigFileReader.MinGaranty(),RateContractViewPageObjects.minGaurantyWeight.getText());
		assertEquals(ConfigFileReader.MaxGaranty().substring(0, 4),RateContractViewPageObjects.maxGaurantyWeight.getText());
		assertEquals(ConfigFileReader.Distance(),RateContractViewPageObjects.distance.getText());
		assertEquals(ConfigFileReader.TransportHours(),RateContractViewPageObjects.hours.getText());
		assertEquals(ConfigFileReader.PaymentReleasefinal(),RateContractViewPageObjects.release.getText());
		assertEquals(ConfigFileReader.ReferenceValue(),RateContractViewPageObjects.referenceValue.getText());
		assertEquals(ConfigFileReader.PaymentEvents(),RateContractViewPageObjects.event.getText());
		assertEquals(ConfigFileReader.Paymentmode(),RateContractViewPageObjects.paymentmode.getText());
		assertEquals(ConfigFileReader.Creditdays(),RateContractViewPageObjects.creditDays.getText());
		assertEquals(ConfigFileReader.ReferenceValue1(),RateContractViewPageObjects.referenceDate.getText());
		assertEquals("6 Documents",RateContractViewPageObjects.documents.getText());
		}
}