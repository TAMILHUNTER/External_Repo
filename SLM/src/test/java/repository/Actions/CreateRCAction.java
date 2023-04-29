package repository.Actions;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.Locators.CommonControlObject;
import object_repository.Locators.CreateRCObjects;
import stepdefinition.Webdriver;

public class CreateRCAction {
	static String RCNumber;
	static String selectedVehicle;
	static String selectedTerrianType;
	static String existingRCNumber;
	static WebDriverWait wait=new WebDriverWait(Webdriver.driver, 10000);	
	static String fileLocation = System.getProperty("user.dir")+"\\uploadFile";	
	static String downloadLocation = System.getProperty("user.dir")+"\\src\\main\\download";
	static String fileName = "\\SLM.pdf";
	static Robot robot;
	CommonControlActions cca=new CommonControlActions();
	static CommonControlObject cco=new CommonControlObject();
	 static JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	public CreateRCAction() throws AWTException {			
		PageFactory.initElements(Webdriver.driver, CreateRCObjects.class);
		 
	}
	 
	public static void createRC() throws InterruptedException, AWTException {
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.createRC));	
		((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", CreateRCObjects.createRC);
//		uploadAttachment();	
	}
	public static void selectJob() throws InterruptedException {		
		wait.until(ExpectedConditions.elementToBeClickable((CreateRCObjects.job)));
		 CreateRCObjects.job.click();	
		 CreateRCObjects.job.sendKeys(ConfigFileReader.getJob());	
		 wait.until(ExpectedConditions.visibilityOfAllElements((CreateRCObjects.jobList)));		
		 List<WebElement> jobselection = CreateRCObjects.jobList;
		for (WebElement webElement : jobselection) {			
			if(webElement.getText().equals(ConfigFileReader.getJob())) {
				break;
			}				
		}
		wait.until(ExpectedConditions.elementToBeClickable((CreateRCObjects.submit)));
	}

	public static void selectRateContractorsName() throws InterruptedException {	
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.rateContractorsName));
		CreateRCObjects.rateContractorsName.click();
		CreateRCObjects.rateContractorsName.sendKeys(ConfigFileReader.RateContractorsNameId());
//		wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.rateSelectContractorsName));
		Thread.sleep(4000);
		List<WebElement> listofContractorName = CreateRCObjects.rateSelectContractorsName;
		for (WebElement webElement : listofContractorName) {
			if(webElement.getText().equals(ConfigFileReader.RateContractorName())) {
				webElement.click();				
				break;
			}		
		}			
	}

	public static void selectRCType() {		 
		CommonControlActions.wait(CreateRCObjects.rCType);
		//CreateRCObjects.rCType.clear();
		CreateRCObjects.rCTypeClear.click();
		CreateRCObjects.rCType.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.rcTypeList));
		List<WebElement> listofrctype = CreateRCObjects.rcTypeList;
		for (WebElement webElement : listofrctype) {
			if(webElement.getText().equals(ConfigFileReader.RCType())) {
				webElement.click();
			}
		}		
	}

	public static void selectRcScope() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.rCScope));
		//CreateRCObjects.rCScope.clear();
		CreateRCObjects.rcScopeClear.click();
		CreateRCObjects.rCScope.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.rCScopeList));
		List<WebElement> listofrcScope = CreateRCObjects.rCScopeList;
		for (WebElement webElement : listofrcScope) {
			if(webElement.getText().equals(ConfigFileReader.RCScope())) {
				webElement.click();
			}
		}		
	}

	public static void selectEffectiveDate() {
		CommonControlActions.wait(CreateRCObjects.effectiveDate);
		CreateRCObjects.effectiveDate.sendKeys(ConfigFileReader.Effectivedate());			
	}

	public static void captureReferenceNumber() {
		CommonControlActions.wait(CreateRCObjects.reference);
		CreateRCObjects.reference.sendKeys(ConfigFileReader.ReferenceNumber());
	}
	public static void selectCurrencyType() {
		CreateRCObjects.closeCurrency.click();
		CreateRCObjects.currency.click(); 
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.currencyList));
		 List<WebElement> listofCurrency = CreateRCObjects.currencyList;
			for (WebElement webElement : listofCurrency) {
				if(webElement.getText().equals(ConfigFileReader.CurrencyType())) {
					webElement.click();
					break;
				} 
			}
	}

	public static void selectTransportMode() throws InterruptedException {
		CreateRCObjects.clearTransport.click();
		 wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.transportMode));
		CreateRCObjects.transportMode.click();		
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.transportModeList));
		List<WebElement> listoftransportMode= CreateRCObjects.transportModeList;
		for (WebElement webElement : listoftransportMode) {
			if(webElement.getText().equals(ConfigFileReader.TransportMode())) {
				webElement.click();
				break;
			} 
		}
	}
	
	public static void captureTheInternalRemarks() {
		CommonControlActions.wait(CreateRCObjects.txtIntRemarks);
		 CreateRCObjects.txtIntRemarks.sendKeys(ConfigFileReader.InternalRemarks());		
	}

	public static void captureExternalRemarks() {
		CommonControlActions.wait(CreateRCObjects.txtExtRemarks);
		 CreateRCObjects.txtExtRemarks.sendKeys(ConfigFileReader.ExternalRemarks());
		 System.out.println("Captured");
	}
	
	public static void additionCharges() {
		CreateRCObjects.AdditionalCharges.click();
		assertEquals("Additional Charges", CreateRCObjects.additionalCharges.getText());
		CreateRCObjects.addCharges.click();
		CreateRCObjects.selectCharges.sendKeys(ConfigFileReader.AdditionalChargesTitle());
		CreateRCObjects.amount.clear();
		CreateRCObjects.amount.sendKeys(ConfigFileReader.AdditionalChargesAmount());
		CreateRCObjects.enterRemarksHere.sendKeys(ConfigFileReader.AdditionalChargesRemarks());
		CreateRCObjects.post.click();
	}
	
	public static void termsandCondition() {
		CreateRCObjects.TermsandCondition.click();
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.save));
		assertEquals("Terms and Conditions",CreateRCObjects.termsAndConditions.getText());
		CreateRCObjects.scopeOfWork.sendKeys(ConfigFileReader.TermsAndConditions());
		CreateRCObjects.save.click();
	}
	
	public static void vehicleType() {
		
		CreateRCObjects.vehicleType.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.vehicleTypeList));
		List<WebElement> listofvehicleTypeList= CreateRCObjects.vehicleTypeList;
		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofvehicleTypeList.size());
		listofvehicleTypeList.get(randnMumber).click();
		selectedVehicle = CreateRCObjects.selectedVehicle.getAttribute("value");
		System.out.println("Selected Vehicle List is ="+selectedVehicle);
		/*for (WebElement webElement : listofvehicleTypeList) {
				
			if(webElement.getText().equals(ConfigFileReader.VechileType())) {
				webElement.click();
				break;
			}
			 
		}*/
		
	}
	
	public static void minGuarantyWeight() {
		CreateRCObjects.minGuarantyWeight.clear();
		CreateRCObjects.minGuarantyWeight.sendKeys(ConfigFileReader.MinGaranty());
	}
	
	public static void maxWeightCapacity() {
		CreateRCObjects.maxWeightCapacity.clear();
		CreateRCObjects.maxWeightCapacity.sendKeys(ConfigFileReader.MaxGaranty());
	}
	
	public static void fromCounty() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.fromCountryClose));
		CreateRCObjects.fromCountryClose.click();
		CreateRCObjects.fromCountry.sendKeys("100");
		CreateRCObjects.fromCountry.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.chooseFromCountry));
		List<WebElement> listofcountry= CreateRCObjects.chooseFromCountry;
		for (WebElement webElement : listofcountry) {
			System.out.println("From Country = "+webElement.getText());
			if(webElement.getText().equals(ConfigFileReader.FromCountry())) {
				webElement.click();
				break;
			}			 
		}		
	}
	
	public static void toCountry() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.toCountryClose));
		CreateRCObjects.toCountryClose.click();
		CreateRCObjects.toCountry.sendKeys("100");
		CreateRCObjects.toCountry.click();		
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.chooseToCountry));
		List<WebElement> listoftocountry= CreateRCObjects.chooseToCountry;
		for (WebElement webElement : listoftocountry) {
			if(webElement.getText().equals(ConfigFileReader.ToCountry())) {
				webElement.click();
				break;
			}
		}
	}
		
	public static void fromState() {
		CreateRCObjects.fromState.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.choosefromState));
		List<WebElement> listofState= CreateRCObjects.choosefromState;
	/*int randnMumber = ThreadLocalRandom.current().nextInt(0, listofState.size());
	listofState.get(randnMumber).click();*/
		for (WebElement webElement : listofState) {
			if(webElement.getText().equals(ConfigFileReader.FromState())) {
				System.out.println("From State = "+webElement.getText());
				webElement.click();
				break;
			}
		}
	}
	
	public static void toState() {
		CreateRCObjects.toState.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.choosetoState));
		List<WebElement> listoftostate= CreateRCObjects.choosetoState;
//	int randnMumber = ThreadLocalRandom.current().nextInt(0, listoftostate.size());
//	listoftostate.get(randnMumber).click();
		for (WebElement webElement : listoftostate) {
				
			if(webElement.getText().equals(ConfigFileReader.ToState())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void toCity() {
		CreateRCObjects.toCity.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.choosetoCity));
		List<WebElement> listoftocity= CreateRCObjects.choosetoCity;
//	int randnMumber = ThreadLocalRandom.current().nextInt(0, listoftocity.size());
//	listoftocity.get(randnMumber).click();
		for (WebElement webElement : listoftocity) {
			if(webElement.getText().equals(ConfigFileReader.ToCity())) {
				webElement.click();
				break;
			}			 
		}
	}
	
	public static void fromCity() {
		CreateRCObjects.fromCity.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.choosefromCity));
		List<WebElement> listofFromcity= CreateRCObjects.choosetoCity;
//	int randnMumber = ThreadLocalRandom.current().nextInt(0, listofFromcity.size());
//	listofFromcity.get(randnMumber).click();
		for (WebElement webElement : listofFromcity) {
			if(webElement.getText().equals(ConfigFileReader.FromCity())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void fromLocation() {
		CreateRCObjects.fromLocation.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.choosefromLocation));
		List<WebElement> listoffromlocation= CreateRCObjects.choosefromLocation;
//	int randnMumber = ThreadLocalRandom.current().nextInt(0, listoffromlocation.size());
//	listoffromlocation.get(randnMumber).click();
		for (WebElement webElement : listoffromlocation) {
			if(webElement.getText().equals(ConfigFileReader.FromLocation())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void toLocation() {
		CreateRCObjects.toLocation.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.chooseToLocation));
		List<WebElement> listoftolocation= CreateRCObjects.choosefromLocation;
		for (WebElement webElement : listoftolocation) {
			if(webElement.getText().equals(ConfigFileReader.ToLocation())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void terrainType() {
		CreateRCObjects.terrainType.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.chooseterrainType));
		List<WebElement> listofterrian= CreateRCObjects.chooseterrainType;
		
//		int randnMumber = ThreadLocalRandom.current().nextInt(0, listofterrian.size());
//		listofterrian.get(randnMumber).click();
//		selectedTerrianType = CreateRCObjects.selectedTerrian.getAttribute("value");
//		
		for (WebElement webElement : listofterrian) {
			if(webElement.getText().equals(ConfigFileReader.TerrainType())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void approxDistanceIn() {
		CreateRCObjects.approxDistanceIn.clear();
		CreateRCObjects.approxDistanceIn.sendKeys(ConfigFileReader.Distance());
	}
	
//	public static void ratePerVehicle() {
//		CreateRCObjects.ratePerVehicle.click();
//		CreateRCObjects.ratePerV.clear();
//		CreateRCObjects.ratePerV.sendKeys(ConfigFileReader.RatePerVechile());
//	}
	
	public static void approxTransitHour() {
		CreateRCObjects.approxTransitHour.clear();
		CreateRCObjects.approxTransitHour.sendKeys(ConfigFileReader.TransportHours());
	}
	
	public static void addTransportDetails() {
		CreateRCObjects.add.click();
	}
	
	public static void paymentRelease() {
		CreateRCObjects.paymentRelease.clear();
		CreateRCObjects.paymentRelease.sendKeys(ConfigFileReader.PaymentRelease());
	}
	
	public static void paymentEvents() {
		CreateRCObjects.paymentEvents.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.paymentEventsList));
			List<WebElement> paymentEventslist= CreateRCObjects.paymentEventsList;
			for (WebElement webElement : paymentEventslist) {
				if(webElement.getText().equals(ConfigFileReader.PaymentEvents())) {
					webElement.click();
					break;
				}				 
			}
	}
	
	public static void referecneValue() {
		CreateRCObjects.referecneValue.click();
		 wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.referecneValuelist));
		List<WebElement> referenceValue= CreateRCObjects.referecneValuelist;
		for (WebElement webElement : referenceValue) {
			if(webElement.getText().equals(ConfigFileReader.ReferenceValue())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void creditDays() {
		CreateRCObjects.creditDays.clear();
		CreateRCObjects.creditDays.sendKeys(ConfigFileReader.Creditdays());
	}
	
	public static void PaymentMode() {
		CreateRCObjects.PaymentMode.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.PaymentModeList));
		List<WebElement> PaymentModelist= CreateRCObjects.PaymentModeList;
		for (WebElement webElement : PaymentModelist) {
			if(webElement.getText().equals(ConfigFileReader.Paymentmode())) {
				webElement.click();
				break;
			}
		}
	}
	
	public static void RefDateValue() {
		CreateRCObjects.RefDateValue.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(CreateRCObjects.RefDateValueList));
		List<WebElement> referenceDateValue= CreateRCObjects.RefDateValueList;
		for (WebElement webElement : referenceDateValue) {
			if(webElement.getText().equals(ConfigFileReader.ReferenceValue1())) {
				webElement.click();
				break;
			}
		} 
	}
	
	public static void lstDocumentList() {
		CreateRCObjects.lstDocumentList.click();
	}
	
	public static void selectAll() throws InterruptedException {
		CreateRCObjects.selectAll.click(); 
		String paymentMatch=CreateRCObjects.paymentReleaseMatch.getText().substring(20, 22);
		int matchpaymentrelease=Integer.parseInt(paymentMatch);
		System.out.println("1st payment="+matchpaymentrelease);
		if (matchpaymentrelease<100) {
			CreateRCObjects.addPayments.click();
			CreateRCObjects.newpaymentRelease.clear();
			CreateRCObjects.newpaymentRelease.sendKeys(ConfigFileReader.PayementRelease1());
			CreateRCObjects.creditDays.click();
			String paymentMatchOne=CreateRCObjects.paymentReleaseMatch.getText().substring(20, 23);
			System.out.println("paymentMatch="+paymentMatchOne);
			int matchpaymentreleaseone=Integer.parseInt(paymentMatchOne);
			System.out.println("Payment release="+matchpaymentreleaseone);
			if(matchpaymentreleaseone==100) {
				System.out.println("Inside 100 equals");
				CreateRCObjects.delete.click();
				CreateRCObjects.paymentRelease.clear();
				CreateRCObjects.paymentRelease.sendKeys(ConfigFileReader.PaymentReleasefinal());
				CreateRCObjects.creditDays.click();
			}	
		}else {
			assertEquals(CreateRCObjects.paymentRelease.getAttribute("value"), CreateRCObjects.paymentReleaseMatch.getText().subSequence(20, 22));
		}
		assertEquals(CreateRCObjects.paymentRelease.getAttribute("value"), CreateRCObjects.paymentReleaseMatch.getText().subSequence(20, 23)+".00");
	}
	
	public static void saveDraft() throws InterruptedException, SQLException, AWTException {
		CreateRCObjects.saveDraft.click();
		if(CommonControlObject.confirmationHeader.getText().equals("Success")) {			
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
			String successmeagebody = CreateRCObjects.newrcnumber.getText();
			System.out.println(successmeagebody);
			RCNumber=successmeagebody.substring(28, 53);
			System.out.println("Created RC Number = "+ RCNumber);
			boolean status = CreateRCObjects.newrcnumber.getText().endsWith("Drafted successfully.");
			assertEquals(true, status);
			CreateRCObjects.ok.click();
			CommonControlActions.forActionTab();
			CommonControlObject.filter.click();
			CommonControlActions.sendDocNumberToFilter(RCNumber);
			CommonControlActions.filtersearchResult(RCNumber);
			assertEquals("Draft",CommonControlObject.status.getText());			
		}
		else if(CommonControlObject.confirmationHeader.getText().equals("Error")) {
			System.out.println("For This Combination RC is already avilable");
			String errormeagebody = CreateRCObjects.newrcnumber.getText();
			existingRCNumber=errormeagebody.substring(57,82);
			CreateRCObjects.ok.click();
			Approver.updateRCtoExpiry(existingRCNumber);
			CreateRCObjects.saveDraft.click();
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
			String successmeagebody = CreateRCObjects.newrcnumber.getText();
			System.out.println(successmeagebody);
			RCNumber=successmeagebody.substring(28, 53);
			System.out.println("Created RC Number = "+ RCNumber);
			boolean status = CreateRCObjects.newrcnumber.getText().endsWith("Drafted successfully.");
			assertEquals(true, status);
			CreateRCObjects.ok.click();
			CommonControlActions.forActionTab();
			wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.filter));
			try {
				CommonControlObject.filter.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();",CommonControlObject.filter);
			}
			
			CommonControlActions.sendDocNumberToFilter(RCNumber);
			CommonControlActions.filtersearchResult(RCNumber);
			assertEquals("Draft",CommonControlObject.status.getText());	
		}else {
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
		String successmeagebody = CreateRCObjects.newrcnumber.getText();
		RCNumber=successmeagebody.substring(28, 53);
	}
		
		}

	public static void editCreatedRateContract() throws SQLException, InterruptedException {
		CommonControlActions.clickFilter();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		CommonControlObject.forAction.click();
		CommonControlObject.refresh.click();
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(CommonControlObject.searchDocNumber).perform();
		CreateRCObjects.edit.click();	
	}

	public static void verifyTheCapturedRateContract() {
		assertEquals(ConfigFileReader.getJob(), CreateRCObjects.job.getAttribute("value"));
		assertEquals(ConfigFileReader.RateContractorName(),CreateRCObjects.rateContractorsName.getAttribute("value"));
		assertEquals(ConfigFileReader.RCType(),CreateRCObjects.rCType.getAttribute("value"));
		assertEquals(ConfigFileReader.RCScope(),CreateRCObjects.rCScope.getAttribute("value"));
		assertEquals(ConfigFileReader.Effectivedate(),CreateRCObjects.effectiveDate.getAttribute("value"));
		assertEquals(ConfigFileReader.ReferenceNumber(),CreateRCObjects.reference.getAttribute("value"));
		assertEquals(ConfigFileReader.CurrencyType(),CreateRCObjects.currency.getAttribute("value"));
		assertEquals(ConfigFileReader.TransportMode(),CreateRCObjects.transportMode.getAttribute("value"));
		assertEquals(ConfigFileReader.InternalRemarks(),CreateRCObjects.txtIntRemarks.getAttribute("value"));
		assertEquals(ConfigFileReader.ExternalRemarks(),CreateRCObjects.txtExtRemarks.getAttribute("value"));
		assertEquals(selectedVehicle,CreateRCObjects.vehicleType.getAttribute("value"));
		assertEquals(ConfigFileReader.MinGaranty(), CreateRCObjects.minGuarantyWeight.getAttribute("value"));
		assertEquals(ConfigFileReader.MaxGaranty(),CreateRCObjects.maxWeightCapacity.getAttribute("value"));
		assertEquals(ConfigFileReader.FromCountry(),CreateRCObjects.fromCountry.getAttribute("value"));
		assertEquals(ConfigFileReader.ToCountry(),CreateRCObjects.toCountry.getAttribute("value"));
		assertEquals(ConfigFileReader.FromState(),CreateRCObjects.fromState.getAttribute("value"));
		assertEquals(ConfigFileReader.ToState(),CreateRCObjects.toState.getAttribute("value"));
		assertEquals(ConfigFileReader.FromLocation(),CreateRCObjects.fromLocation.getAttribute("value"));
		assertEquals(ConfigFileReader.ToLocation(),CreateRCObjects.toLocation.getAttribute("value"));
		assertEquals(ConfigFileReader.FromCity(), CreateRCObjects.fromCity.getAttribute("value"));
		assertEquals(ConfigFileReader.ToCity(), CreateRCObjects.toCity.getAttribute("value"));
		assertEquals(selectedTerrianType, CreateRCObjects.terrainType.getAttribute("value"));
		assertEquals(ConfigFileReader.Distance(),CreateRCObjects.approxDistanceIn.getAttribute("value"));
		assertEquals(ConfigFileReader.RatePerVechile(),CreateRCObjects.ratePerV.getAttribute("value"));
		assertEquals(ConfigFileReader.PaymentReleasefinal()+".00",CreateRCObjects.paymentRelease.getAttribute("value"));
		assertEquals(ConfigFileReader.PaymentEvents(),CreateRCObjects.paymentEvents.getAttribute("value"));
		assertEquals(ConfigFileReader.ReferenceValue(),CreateRCObjects.referecneValue.getAttribute("value"));
		assertEquals(ConfigFileReader.Creditdays(),CreateRCObjects.creditDays.getAttribute("value"));
		assertEquals(ConfigFileReader.Paymentmode(),CreateRCObjects.PaymentMode.getAttribute("value"));
		assertEquals(ConfigFileReader.ReferenceValue1(),CreateRCObjects.RefDateValue.getAttribute("value"));
		assertEquals("Selected Count : 6",CreateRCObjects.lstDocumentList.getAttribute("value"));
	}

	public static void submitRateContract() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.lstDocumentList));
		CreateRCObjects.submit.click();
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.ok));
		RCNumber=CreateRCObjects.newrcnumber.getText().substring(28, 53);
		CreateRCObjects.ok.click();
		
	}

	public static void verifySubmitedRateContractStatus() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.all));
		try {
			CommonControlObject.all.click();
		}
		catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)Webdriver.driver;
			jse.executeScript("arguments[0].click();", CommonControlObject.all);
		}
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.refresh));
		JavascriptExecutor jse=(JavascriptExecutor)Webdriver.driver;
		jse.executeScript("arguments[0].click();", CommonControlObject.refresh);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.filter));
		try {
			Thread.sleep(3000);
			CommonControlObject.filter.click();
		}catch (Exception e) {
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", CommonControlObject.filter); //testpk
		}
		Thread.sleep(3000);
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		Thread.sleep(3000);
		CommonControlObject.refresh.click();
		assertEquals("Created",CommonControlObject.status.getText());
	}	
	
	public static void approveRC() throws SQLException, InterruptedException {
		Approver.approve(RCNumber);
	}
	public static void rejectRC() throws SQLException, InterruptedException {
		Approver.reject(RCNumber);
	}
	
	public static void approveFromForActionTab() throws InterruptedException {
		ApproverLoginAction.rcApprove(RCNumber);
	}
	
	public static void rejectFromForActionTab() throws InterruptedException {
		ApproverLoginAction.rcReject(RCNumber);
	}
	public static void cancelRateContract() throws InterruptedException {
				
		/*CommonControlActions.clickFilter();
		CommonControlActions.forActionTab();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		CommonControlActions.forActionTab();
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(CommonControlObject.searchDocNumber).perform();
		CreateRCObjects.cancel.click();	
		CommonControlObject.approverRemarks.sendKeys("Test Cancel");
		CommonControlObject.yes.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));		
		assertEquals("Cancelled Successfully.", CommonControlObject.successBody.getText());
		assertEquals("Success",CommonControlObject.successTitle.getText());
		CommonControlObject.ok.click();
		Webdriver.driver.navigate().refresh();
		CommonControlActions.clickFilter();
		CommonControlObject.all.click();
		CommonControlObject.refresh.click();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		assertEquals("Cancelled", CommonControlObject.status.getText());*/
		
		CommonControlObject.filter.click();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		CommonControlObject.forAction.click();
		CommonControlObject.refresh.click();
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(CommonControlObject.searchDocNumber).perform();
		CreateRCObjects.cancel.click();	
		CommonControlObject.approverRemarks.sendKeys("Test Cancel");
		CommonControlObject.yes.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));		
		assertEquals("Cancelled Successfully.", CommonControlObject.successBody.getText());
		assertEquals("Success",CommonControlObject.successTitle.getText());
		CommonControlObject.ok.click();
		Webdriver.driver.navigate().refresh();
		CommonControlActions.clickFilter();
		CommonControlObject.all.click();
		CommonControlObject.refresh.click();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		assertEquals("Cancelled", CommonControlObject.status.getText());
		
	}

	public static void recall() throws InterruptedException {	
		/*try {
			CommonControlActions.clickFilter();
		}
		catch (Exception e) {
			js.executeScript("arguments[0].click();", CommonControlObject.filter);
			 	// TODO: handle exception
		}
		 
		CommonControlActions.inProgressTab();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		//CommonControlActions.inProgressTab();
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(CommonControlObject.searchDocNumber).perform();
		CreateRCObjects.recall.click();	
		CommonControlObject.approverRemarks.sendKeys("Test recalling");
		CommonControlObject.yes.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
		assertEquals("Document Status Updated Successfully", CommonControlObject.successBody.getText());
		assertEquals("Success",CommonControlObject.successTitle.getText());
		CommonControlObject.ok.click();
		Webdriver.driver.navigate().refresh();
		js.executeScript("arguments[0].click();", CommonControlObject.filter);
		CommonControlActions.allTab();
		CommonControlObject.refresh.click();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		assertEquals("Draft", CommonControlObject.status.getText());
		
		CommonControlObject.ok.click();
		Webdriver.driver.navigate().refresh();
		CommonControlActions.clickFilter();
		CommonControlObject.all.click();
		CommonControlObject.refresh.click();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		assertEquals("Cancelled", CommonControlObject.status.getText());*/
		//Thread.sleep(9000);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.filter));
		try {
			Thread.sleep(2000);
			CreateRCObjects.filter.click();
		}catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", CreateRCObjects.filter); //testpk
		}
		Thread.sleep(2000);
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.inprogress));
		CommonControlObject.inprogress.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.refresh));
		CommonControlObject.refresh.click();
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(CommonControlObject.searchDocNumber).perform();
		CreateRCObjects.recall.click();	
		CommonControlObject.approverRemarks.sendKeys("Test recalling");
		CommonControlObject.yes.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
		assertEquals("Document Status Updated Successfully", CommonControlObject.successBody.getText());
		assertEquals("Success",CommonControlObject.successTitle.getText());
		CommonControlObject.ok.click();
		Webdriver.driver.navigate().refresh();
		CommonControlActions.clickFilter();
		CommonControlObject.all.click();
		CommonControlObject.refresh.click();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		assertEquals("Draft", CommonControlObject.status.getText());
		
		
	}

	public static void approverMenu() {
		CommonControlObject.moduleMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.supplyChainMgmt));
		CommonControlObject.supplyChainMgmt.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.logistics));
		CommonControlObject.logistics.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.masters));
		CommonControlObject.masters.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.rateContract));
		CommonControlObject.rateContract.click();
	}

	public static void landingPageVerification() throws InterruptedException {
		CommonControlActions.allTab();
		CommonControlActions.clickFilter();
		CommonControlActions.sendDocNumberToFilter(RCNumber);
		CommonControlActions.filtersearchResult(RCNumber);
		System.out.println("filter search completed");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = new Date();
		String CreatedDate = formatter.format(date);
		assertEquals(CreatedDate, CreateRCObjects.landingPageDate.getText());
		assertEquals(ConfigFileReader.RateContractorName(), CreateRCObjects.RateContracter.getText());
		assertEquals(ConfigFileReader.RCType().substring(4), CreateRCObjects.RCType.getText());
		assertEquals(ConfigFileReader.Effectivedate().substring(0, 11),CreateRCObjects.effectifeFromDate.getText());
		assertEquals(ConfigFileReader.Effectivedate().substring(14, 25),CreateRCObjects.effectifeToDate.getText());
		assertEquals(ConfigFileReader.CurrencyType().substring(5, 8), CreateRCObjects.currencyType.getText().substring(0,3));
		assertEquals(ConfigFileReader.ReferenceNumber(), CreateRCObjects.referenceNumber.getText());
		assertEquals("Created", CreateRCObjects.landingPageStatus.getText());
	}

	public static void ratePerMT() {
		CreateRCObjects.ratePerMetricTon.click();
		System.out.println(ConfigFileReader.RatePerMT());
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.ratePerMTID));
		CreateRCObjects.ratePerMTID.clear();
		CreateRCObjects.ratePerMTID.sendKeys(ConfigFileReader.RatePerMT());
		System.out.println(ConfigFileReader.RatePerMT());
		
	}
	public static void verifyCreatedRC() throws InterruptedException {
		RateContractViewPageActions.VerifyTheCreatedRC(RCNumber);
	}

	public static void uploadAttachment() throws InterruptedException, AWTException {
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.attachment));
		CreateRCObjects.attachment.click();
		assertEquals("File Upload Title Verification", "Attach Documents", CreateRCObjects.attachmentWindowTitle.getText());
		Actions action = new Actions(Webdriver.driver);
		action.moveToElement(CreateRCObjects.files);
		action.click().build().perform();
		Thread.sleep(5000);
		System.out.println(fileLocation);
		StringSelection stringSelection = new StringSelection(fileLocation + fileName);
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(stringSelection, stringSelection);	   
	    Thread.sleep(5000);
	    robot =new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.uploadDocument));
	    ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].click();", CreateRCObjects.fileType);		
		List<WebElement> fileTypeSelection = CreateRCObjects.selectFileType;
		for (WebElement webElement : fileTypeSelection) {
			if(webElement.getText().equals("Rate Contract Documents")) {
				webElement.click();
				break;
			}
		}	
		if(CreateRCObjects.uploadDocument.isEnabled()) {
			CreateRCObjects.uploadDocument.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(CreateRCObjects.ok));
		assertEquals("Success", CreateRCObjects.verifySuccessMessage.getText());
		assertEquals("Document(s) uploaded successfully", CreateRCObjects.verifySuccessMessageText.getText());
		CreateRCObjects.ok.click();	
	}
	
	public static void downloadAttachment() throws InterruptedException {
		
            String downloadPath = downloadLocation;
            File dir = new File(downloadPath);
            File[] dirContents = dir.listFiles();

            for (int i = 0; i < dirContents.length; i++) {
                if (dirContents[i].getName().equalsIgnoreCase(fileName)) {
                    break;
                }else {
                    Thread.sleep(2000);
                }
            }
            System.out.println("Downlaod File Verification.");
        }
 }