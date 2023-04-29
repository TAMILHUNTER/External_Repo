package repository.Actions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.Locators.TransportRequestObjects;
import stepdefinition.Webdriver;
public class TransportRequestCreationPageActions {
	static WebDriverWait wait=new WebDriverWait(Webdriver.driver, 50000);
	static String fjob,tojob,fwarehouse,towarehoue,capturedShipmentQty;
	static Actions action = new Actions(Webdriver.driver);
	public  static String status,vehicle, vehiclerate, vehicleuom, vehicledescriptions;
	public static String transporterType;
	public static String frqNumber,docNumbers;
	public TransportRequestCreationPageActions() {
		PageFactory.initElements(Webdriver.driver, TransportRequestObjects.class);	
	}
	
	public static void selectFromjob(String fromJobs) throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.fromJobClick));
		try {
			TransportRequestObjects.fromJobClick.click();
		}
		catch(Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor)Webdriver.driver;
		     executor.executeScript("arguments[0].click();", TransportRequestObjects.fromJobClick);
		}
		List<WebElement> selectFromJob = TransportRequestObjects.fromJob;
		for (WebElement webElement : selectFromJob) {
			Thread.sleep(3000);
			System.out.println("List of jobs = "+ webElement.getText());
			Thread.sleep(2000);
			if(webElement.getText().equals(fromJobs)){
				fjob=webElement.getText();
				webElement.click();
				break;
			}	
		}	
	}

	public static void selectFromWareHouse(String fromwarehosue) throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.fromWarehoueClick));
		TransportRequestObjects.fromWarehoueClick.click();		 
		List<WebElement> selectFromWareHouse = TransportRequestObjects.fromWarehouse;
		for (WebElement webElement : selectFromWareHouse) {
			if(webElement.getText().equals(fromwarehosue)){
				fwarehouse=webElement.getText();
				webElement.click();
				break;
			}
		}		
	}

	public static void selectToJob(String toJob) throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.toJobClick));
		TransportRequestObjects.toJobClick.click();	 
		List<WebElement> selectToJob = TransportRequestObjects.fromWarehouse;
		for (WebElement webElement : selectToJob) {
			if(webElement.getText().equals(toJob)){
				tojob=webElement.getText();
				webElement.click();
				break;
			}	
		}		
	}

	public static void selectToWareHouse(String toWarehouse) throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.toWarehouseClick));
//		TransportRequestObjects.toWarehouseClick.click(); 
		//
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.toWarehouseClick));
		try {
			TransportRequestObjects.toWarehouseClick.click();
		}
		catch(Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor)Webdriver.driver;
		     executor.executeScript("arguments[0].click();", TransportRequestObjects.toWarehouseClick);
		}
		//
		List<WebElement> selectToWareHouse = TransportRequestObjects.fromWarehouse;
		for (WebElement webElement : selectToWareHouse) {
			Thread.sleep(3000);
//			System.out.println("List of ToWareHouse = "+ webElement.getText());
			if(webElement.getText().equals(toWarehouse)){
				towarehoue=webElement.getText();
				webElement.click();
				break;
			}
			System.out.println("Selected To WareHouse :"+webElement);
		}
		
	}

	public static void verifyFromAndTojobs() {
		WebElement ele = TransportRequestObjects.fromJobs;		
		action.moveToElement(ele).perform();
//		System.out.println(TransportRequestObjects.toolTips.getText());
//		assertEquals(fjob.substring(11), TransportRequestObjects.toolTips.getText());
		WebElement ele1 = TransportRequestObjects.toJobs;
		Actions action1 = new Actions(Webdriver.driver);
		action1.moveToElement(ele1).perform();	
//		assertEquals(tojob.substring(11),TransportRequestObjects.toolTips.getText());	
	}

	public static void viewConsignorandViewConsignee() {
		TransportRequestObjects.consignor.click();	
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.consignorDetails));
		assertEquals("Consignor Details",TransportRequestObjects.consignorDetails.getText());
		assertEquals(fwarehouse.substring(7), TransportRequestObjects.headQuarters.getText());
		TransportRequestObjects.close.click();
		TransportRequestObjects.consignee.click();
		System.out.println(TransportRequestObjects.consigneeDetails.getText());
		assertEquals("Consignee Details", TransportRequestObjects.consigneeDetails.getText());
		assertEquals(towarehoue.substring(7), TransportRequestObjects.cONSTRUCTIONOFCF.getText());
		TransportRequestObjects.close.click();
	}

	public static void documentType() throws InterruptedException {
		assertEquals("Intercarting",TransportRequestObjects.documentViewType.getText());		
	}

	public static void Create() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.create));
		TransportRequestObjects.create.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.transportRequestCreation));
		//Need to be Check
		assertEquals("Transport Request Creation", TransportRequestObjects.transportRequestCreation.getText());		
	}
	public static void currencyType() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.currency));
		assertEquals("INR - Indian rupee", TransportRequestObjects.currency.getText());		
	}

	public static void captureMaterials() throws InterruptedException {
		Thread.sleep(3000);
		assertEquals("Material Cart",TransportRequestObjects.materialCartTitle.getText());
		TransportRequestObjects.materialCategory.click();
		TransportRequestObjects.serviceCategory.sendKeys("Reinfor");
		TransportRequestObjects.selectallitems.click();
		TransportRequestObjects.materialCartTitle.click();
		TransportRequestObjects.materialGroup.click();
		TransportRequestObjects.materialGrops.sendKeys("Reinfor");
		TransportRequestObjects.selectallitems.click();
		TransportRequestObjects.materialCartTitle.click();	
		TransportRequestObjects.searchItems.sendKeys("6CA2M004N000001");
		Thread.sleep(3000);
		boolean status = TransportRequestObjects.materialselect.isEnabled();
		if(status==true) {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.materialselect));
			try {
				TransportRequestObjects.materialselect.click();
			} catch (Exception e) {
				JavascriptExecutor executor = (JavascriptExecutor)Webdriver.driver;
			     executor.executeScript("arguments[0].click();", TransportRequestObjects.materialselect);
			}
			
			
			
			if(TransportRequestObjects.unSelect.isEnabled()) {
				List<WebElement> selectedItems = TransportRequestObjects.selectedItesmAre;
				for (WebElement webElement : selectedItems) {
					if(webElement.getText().concat("6CA2M004N000001").equals("6CA2M004N000001")){
						webElement.click();
						
					}
					break;
				}
				wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.postItems));
				TransportRequestObjects.postItems.click();
				System.out.println("Assert Successful");
			}
		}
	}

	public static void captureDocumentReference(List<String> documentNos) {		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		TransportRequestObjects.documentNo.sendKeys(documentNos.get(0)+dtf.format(now));		
	}

	public static void SkipMaterial() {
		if(TransportRequestObjects.next.isEnabled()) {
			TransportRequestObjects.next.click();
			wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.successMessageOkButton));
			assertEquals("Please enter material details", TransportRequestObjects.errorMessage.getText());
			TransportRequestObjects.closingErrorMessage.click();
		}
	}
  
	
	public static void shipmentQuantity()  throws InterruptedException {
		action.moveToElement(TransportRequestObjects.selectedItemsverification).perform();
		System.out.println(TransportRequestObjects.toolTips.getText());	
		boolean shipMentQty = TransportRequestObjects.shipMentQty.isEnabled();
		System.out.println("Enabled");
		if(shipMentQty==true) {	  
				TransportRequestObjects.shipMentQty.sendKeys("-100");
				TransportRequestObjects.transportRequestCreation.click();
				System.out.println(TransportRequestObjects.shipMentQty.getAttribute("value"));
				if(TransportRequestObjects.shipMentQty.getAttribute("value").equals("100.000")) {
					assertEquals("100.000", TransportRequestObjects.shipMentQty.getAttribute("value"));
					capturedShipmentQty=TransportRequestObjects.shipMentQty.getAttribute("value");
					System.out.println("-Ve Value not captured.");
				}	
			}
			else {
				System.out.println("shipment not captured");
			}			
		}
	
	public static void saleOrder() throws InterruptedException {
		
		if(TransportRequestObjects.saleOrder.isEnabled()==true) {
			String uom=TransportRequestObjects.uom.getText();
			TransportRequestObjects.saleOrder.click();
			wait.until(ExpectedConditions.visibilityOf(TransportRequestObjects.saleOrderTitle));	
			
			if(TransportRequestObjects.saleOrderTitle.getText().equals("Sale Order Details")) {
				System.out.println("Sale Order Title Matched");
				if(TransportRequestObjects.currentShipmentQty.isDisplayed()==true) {
					System.out.println("currentShipmentQty");
					if(TransportRequestObjects.balanceShipmentQty.isDisplayed()==true) {
						System.out.println("balanceShipmentQty");
						if(TransportRequestObjects.totalShipmentQty.isDisplayed()==true) {
							System.out.println("totalShipmentQty");
							if(TransportRequestObjects.saleOrderSerialNumber.isDisplayed()==true) {
								System.out.println("saleOrderSerialNumber");
								TransportRequestObjects.saleOrderSerialNumber.sendKeys("SLNO01");
									TransportRequestObjects.saleOrderQty.clear();
									TransportRequestObjects.saleOrderQty.sendKeys("100");
									assertEquals(uom, TransportRequestObjects.saleOrderUom.getText());
									TransportRequestObjects.addSaleOrder.click();
									TransportRequestObjects.saleordeerserialNumber2.sendKeys("SLNO02");
									TransportRequestObjects.saleorderqty2.sendKeys("200");
									TransportRequestObjects.post.click();
									Thread.sleep(3000);
									System.out.println("Error Message = "+TransportRequestObjects.errorMessage.getText());
									//wait.until(ExpectedConditions.textToBePresentInElement(TransportRequestObjects.errorMessage, "Sale order quantity cannot exceed Shipment Quantity"));
									if(TransportRequestObjects.errorMessage.getText().equals("Sale order quantity cannot exceed shipment quantity"))
									{
										System.out.println("Inside if condition");
									TransportRequestObjects.errorClosing.click();
									TransportRequestObjects.delete.click();
									wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.post));
									TransportRequestObjects.post.click();
									}else {
										System.out.println("out side if condition");
									}
								}
							}
							}
						}
					}
			}
			TransportRequestObjects.remarks.sendKeys("Materials Remarks");
			TransportRequestObjects.next.click();
	}
	public static void packing() throws InterruptedException {
		if(TransportRequestObjects.packingSlipNo.isEnabled()==true) {
			TransportRequestObjects.packingSlipNo.sendKeys("PSNO01");
		}
		
		TransportRequestObjects.packingTypeclick.click();
		List<WebElement> packingtypeSelection = TransportRequestObjects.packingType;
		for (WebElement webElement : packingtypeSelection) {
			if(webElement.getText().equals("Slotted Partitions")) {
				webElement.click();
				break;
			}
		}
		TransportRequestObjects.packingQty.sendKeys("10");
		TransportRequestObjects.grossWeight.sendKeys("-");
		if(TransportRequestObjects.grossWeight.getAttribute("value").equals("0")) {
				TransportRequestObjects.grossWeight.sendKeys("1236.000");
		}
		TransportRequestObjects.netWeight.sendKeys("-");		
		TransportRequestObjects.dimenstion.click();
		List<WebElement> dimentionsSelection = TransportRequestObjects.dimenstionUom;
		for (WebElement webElement : dimentionsSelection) {
			if(webElement.getText().equals("Centimeter")) {
				webElement.click();
				break;
			}
		}
		TransportRequestObjects.dimenstionHeight.clear();
		TransportRequestObjects.dimenstionHeight.sendKeys("100");
		TransportRequestObjects.dimenstionLenght.clear();
		TransportRequestObjects.dimenstionLenght.sendKeys("100");
		TransportRequestObjects.dimenstionWidth.clear();
		TransportRequestObjects.dimenstionWidth.sendKeys("100");
		TransportRequestObjects.packingRemarks.sendKeys("Packing Remarks");
		if(TransportRequestObjects.netWeight.getAttribute("value").equals("0.000")) {
			TransportRequestObjects.netWeight.sendKeys("900");
		}
		TransportRequestObjects.next.click();
	}
	
	public static void location(String transportType) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.transportType));
		TransportRequestObjects.transportType.click();
		List<WebElement> selecttransporttype = TransportRequestObjects.transportTypeList;
		for (WebElement webElement : selecttransporttype) {
			if(webElement.getText().equals("5 - Non Rate Contract")) {
				transporterType=webElement.getText();
				webElement.click();
				break;
			}
		}
		
		
		if(TransportRequestObjects.transportTypeSelect.getAttribute("value").equals("4 - Rate Contract")) {

			TransportRequestObjects.fromState.click();
			List<WebElement> selectfromState = TransportRequestObjects.select;
			for (WebElement webElement : selectfromState) {
				if(webElement.getText().matches("Tamil Nadu")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.fromCity.click();
			List<WebElement> selectfromCity = TransportRequestObjects.select;
			for (WebElement webElement : selectfromCity) {
				if(webElement.getText().matches("CUDDALORE")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.fromLocation.click();
			List<WebElement> selectfromLocation = TransportRequestObjects.select;
			for (WebElement webElement : selectfromLocation) {
				if(webElement.getText().matches("ARIYALUR")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.fromArea.sendKeys("Ariyalur");
			TransportRequestObjects.toState.click();
			List<WebElement> selecttoState = TransportRequestObjects.select;
			for (WebElement webElement : selecttoState) {
				if(webElement.getText().matches("Puducherry")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.toCity.click();
			List<WebElement> selecttoCity = TransportRequestObjects.select;
			for (WebElement webElement : selecttoCity) {
				if(webElement.getText().matches("KARAIKAL")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.toLocation.click();
			List<WebElement> selecttoLocation = TransportRequestObjects.select;
			for (WebElement webElement : selecttoLocation) {
				if(webElement.getText().matches("KARAIKAL")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.toArea.sendKeys("KARAIKAL");
			TransportRequestObjects.terrain.click();
			List<WebElement> terrainType = TransportRequestObjects.select;
			for (WebElement webElement : terrainType) {
				if(webElement.getText().matches("Plain")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.distanceInKm.sendKeys("349");
			Webdriver.driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			String strDate= formatter.format(date.getTime() + (1000 * 60 * 60 * 24));
			System.out.println("Date To Be Captured =" + strDate);
			
			selectKendoDate(strDate);
			
		}else if(TransportRequestObjects.transportTypeSelect.getAttribute("value").equals("5 - Non Rate Contract")){

			TransportRequestObjects.fromState.click();
			List<WebElement> selectfromState = TransportRequestObjects.select;
			for (WebElement webElement : selectfromState) {
				if(webElement.getText().matches("Tamil Nadu")) {
					webElement.click();
					break;
				}
			}
			
			TransportRequestObjects.fromArea.sendKeys("Ariyalur");
			
			TransportRequestObjects.toState.click();
			List<WebElement> selecttoState = TransportRequestObjects.select;
			for (WebElement webElement : selecttoState) {
				if(webElement.getText().matches("Puducherry")) {
					webElement.click();
					break;
				}
			}
			
			TransportRequestObjects.toArea.sendKeys("KARAIKAL");
			
			TransportRequestObjects.terrain.click();
			List<WebElement> terrainType = TransportRequestObjects.select;
			for (WebElement webElement : terrainType) {
				if(webElement.getText().matches("Plain")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.distanceInKm.sendKeys("349");
			
			
			   /*List<WebElement> elements = driver.findElements(By.cssSelector(".ng-isolate-scope>table>tbody>tr"));
			    int rowcount = elements.size();
			    System.out.println("Number of Rows in Calendar = " +rowcount);
			    outerloop:{
			        for (WebElement webElement : elements) {
			            List<WebElement> dates = webElement.findElements(By.cssSelector(".ng-isolate-scope>table>tbody>tr>td[id]"));
			            for (WebElement click : dates) {
			                if (click.getText().equals("13")) {
			                    System.out.println("Selecting the Date");
			                    click.click();
			                    break outerloop;
			                }
			                System.out.println("End of Date Column Loop");
			            }
			        }
			        System.out.println("End of Calendar Date Selection");
			    }*/
			
					
			Webdriver.driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
			
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			String strDate= formatter.format(date.getTime() + (1000 * 60 * 60 * 24));
			System.out.println("Date To Be Captured =" + strDate);
			selectKendoDate(strDate);
		}
		TransportRequestObjects.next.click();
	}	
	
	/// <summary>
	/// Method to select date from Kendo date picker
	/// </summary>
	/// <param name="expDate"> Format : Date-Month-Year</param>
	public static void selectKendoDate(String expDate) throws InterruptedException
	{
		System.out.println("Date To Be Captured = "+expDate);
		//splitting date
		String[] Date = expDate.split("-");
		String expDay = null;
		if (Date[0].substring(0,1)=="0")
		{
			expDay = Date[0].replace("0", "");
		}
		else
		{
			expDay = Date[0];
		}
		String expMonth = Date[1];
		String expYear = Date[2];
		Thread.sleep(3000);
		clickCalendarYear(expYear);
		Thread.sleep(3000);
		clickCalendarMonth(expMonth);
		Thread.sleep(3000);
		clickCalendarDate(expDay);
		Thread.sleep(3000);
	}
	
	private static void clickCalendarDate(String expDay) throws InterruptedException {//Date
		Thread.sleep(3000);
		
		
		List<WebElement> calendarLinks = Webdriver.driver.findElements(By.xpath("//kendo-virtualization//table//td"));
		
		for (WebElement webElement : calendarLinks) {
			if(webElement.getText().equals(expDay)) {
				webElement.click();
				break;
			}
		}
}

	private static void clickCalendarMonth(String expMonth) {//month
		List<String> months = new ArrayList<String>();
		String[] monthsList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		months.addAll(Arrays.asList(monthsList));
		List<WebElement> calendarLinks = Webdriver.driver.findElements(By.xpath("//kendo-virtualization//table//td//span"));
		for (WebElement webElement : calendarLinks) {
			System.out.println("Month = " + webElement.getText());
			if(webElement.getText().equals(monthsList[Integer.parseInt(expMonth) - 1])) {
				System.out.println("Month = " + webElement.getText());
				webElement.click();
				break;
			}
		}
	}

	private static void clickCalendarYear(String expYear) throws InterruptedException {//This will get execute till system start year.
		
		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();
		
		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();
		
		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();
		
		Thread.sleep(3000);//Select years from sys start date
		Webdriver.driver.findElements(By.xpath("//td//span[@class='k-link']"));
		List<WebElement> calendarLinks = Webdriver.driver.findElements(By.xpath("//td//span[@class='k-link']"));
		for (WebElement webElement : calendarLinks)
		{
			if ((Integer.parseInt(webElement.getText())- Integer.parseInt(expYear))>=-9)
			{
				webElement.click();
				break;
			}
		}
		
		calendarLinks = Webdriver.driver.findElements(By.xpath("//td//span[@class='k-link']"));//year selection
		for (WebElement dates : calendarLinks)
		{ 
			if (Integer.parseInt(dates.getText()) == Integer.parseInt(expYear))
			{
				dates.click();
				break;
			}
		}		
	}

	public static void vechile(String rateType) throws AWTException, InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.transporter));
		Thread.sleep(3000);
		TransportRequestObjects.transporter.click();
		if(transporterType.equals("4 - Rate Contract")) {
			List<WebElement> transporterType = TransportRequestObjects.select;
			for (WebElement webElement : transporterType) {
				if(webElement.getText().matches("S0025398 - TVS SUPPLY CHAIN SOLUTIONS LIMITED")) {
					webElement.click();
					break;
				}
			}
			TransportRequestObjects.rateType.click();
			List<WebElement> rateTypeSelection = TransportRequestObjects.select;
			for (WebElement webElement : rateTypeSelection) {
				if(webElement.getText().matches(rateType)) {
					webElement.click();
					break;
				}
			}
		}else if(transporterType.equals("5 - Non Rate Contract")) {
			TransportRequestObjects.transporter.click();
			TransportRequestObjects.transporter.sendKeys("S0025398 - TVS SUPPLY CHAIN SOLUTIONS LIMITED"+KeyEvent.VK_DOWN+KeyEvent.VK_ENTER);
			TransportRequestObjects.rfqNumber.sendKeys("RFQ NO " + System.currentTimeMillis());
			TransportRequestObjects.bqNumber.sendKeys("BQ No " + System.currentTimeMillis());
			
		    /*Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);*/
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.rateType));
		    TransportRequestObjects.rateType.click();
		    Thread.sleep(2000);
		List<WebElement> rateTypeSelection = TransportRequestObjects.select;
		for (WebElement webElement : rateTypeSelection) {
			if(webElement.getText().matches(rateType)) {
				webElement.click();
				break;
			}
		}
		
		TransportRequestObjects.searchVechile.click();
		if(TransportRequestObjects.informationPopup.getText().equals("Information")) {
			TransportRequestObjects.successMessageOkButton.click();
			TransportRequestObjects.vehicleCart.click();
		}/*else {

			TransportRequestObjects.vehicleCart.click();
		
		}
*/	}

		if(transporterType.equals("4 - Rate Contract")) {
			TransportRequestObjects.vehicleCart.click();
			List<WebElement> selectVehicle = TransportRequestObjects.randomVechicleSelectCheckBox;
			int size = selectVehicle.size();
			int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
			System.out.println("Vehicle Selection = "+randomNumber);
			selectVehicle.get(randomNumber).click();
			List<WebElement> listofvehicleCart = TransportRequestObjects.randomVechicleSelect;
			List<WebElement> vehicleRates = TransportRequestObjects.vehicleRate;
			List<WebElement> uomList = TransportRequestObjects.uomList;
			List<WebElement> vehicleDescription = TransportRequestObjects.vehicleDesc;
				for(int i=0;i<=randomNumber;i++) {
					System.out.println("Iteration = "+i);				
					vehicle=listofvehicleCart.get(i).getText();
					System.out.println("Vehicle = "+vehicle);				
				}//Vehicle Type 
			
			
		
				for(int j=0;j<=randomNumber;j++) {
					vehiclerate=vehicleRates.get(j).getText();
					
				}
			
				for(int j=0;j<=randomNumber;j++) {
					vehicleuom=uomList.get(j).getText();
					
				}
			
				for(int j=0;j<=randomNumber;j++) {
					vehicledescriptions=vehicleDescription.get(j).getText();
					
				}
				TransportRequestObjects.saveVechile.click();
				//assertEquals(vehicle.substring(0,6)+"-"+vehicledescriptions.substring(7), TransportRequestObjects.vehicledescription.getText());
				assertEquals(vehicleuom, TransportRequestObjects.vehicleUom.getText());
				assertEquals("INR", TransportRequestObjects.currencyType.getText());
				assertEquals(vehiclerate, TransportRequestObjects.rateperVehicle.getText());
				TransportRequestObjects.materialQtyVechilePage.sendKeys("750");
				TransportRequestObjects.numberofVechile.sendKeys("2");
				
				if(TransportRequestObjects.rateType.getAttribute("value").equals(rateType)) 
				{
				float result=Float.parseFloat(TransportRequestObjects.numberofVechile.getAttribute("value"))*Float.parseFloat(TransportRequestObjects.rate.getText());
				if(Float.parseFloat(TransportRequestObjects.totalAmount.getText())==result) {
					assertTrue(true);
				}
				}else if((TransportRequestObjects.rateType.getAttribute("value").equals(rateType))){
					float result=Float.parseFloat(TransportRequestObjects.numberofQty.getAttribute("value"))*Float.parseFloat(TransportRequestObjects.rate.getText());
					if(Float.parseFloat(TransportRequestObjects.totalAmount.getText())==result) {
						assertTrue(true);
					}
				}
		}else if(transporterType.equals("5 - Non Rate Contract")) {
			//TransportRequestObjects.vehicleCart.click();
			List<WebElement> selectVehicle = TransportRequestObjects.randomVechicleSelectCheckBox;
			int size = selectVehicle.size();
			int randomNumber = ThreadLocalRandom.current().nextInt(0, size);
			System.out.println("Vehicle Selection = "+randomNumber);
			selectVehicle.get(randomNumber).click();
			List<WebElement> listofvehicleCart = TransportRequestObjects.randomVechicleSelect;
			List<WebElement> vehicleRates = TransportRequestObjects.vehicleRate;
			List<WebElement> uomList = TransportRequestObjects.uomList;
			List<WebElement> vehicleDescription = TransportRequestObjects.vehicleDesc;
			
			
				for(int i=0;i<=randomNumber;i++) {
					System.out.println("Iteration = "+i);				
					vehicle=listofvehicleCart.get(i).getText();
								
				}//Vehicle Type 
				for(int j=0;j<=randomNumber;j++) {
					System.out.println("Iteration 1 = "+j);	
					vehicleuom=uomList.get(j).getText();
				}
			
				for(int k=0;k<=randomNumber;k++) {
					System.out.println("Iteration 2 = "+k);	
					Thread.sleep(3000);
//					vehicledescriptions=vehicleDescription.get(k).getText();
				}
				TransportRequestObjects.saveVechile.click();
				TransportRequestObjects.enterRate.sendKeys("200");
				System.out.println("Vehicle 1st substring = " + vehicle.substring(0,7));
				System.out.println("Vehicle 2nd subsrting = " + vehicle.substring(0,8));
				assertEquals(vehicle.substring(0, 5), TransportRequestObjects.vehicledescription.getText().substring(0, 5));
				assertEquals(vehicleuom, TransportRequestObjects.vehicleUom.getText());
				assertEquals("INR", TransportRequestObjects.currencyType.getText());
				Thread.sleep(3000);
//				TransportRequestObjects.materialQtyVechilePage.click(); //pk
				//Need to be verify pk
				TransportRequestObjects.materialQtyVechilePage.sendKeys("750");
				Thread.sleep(3000);
//				TransportRequestObjects.numberofVechile.click(); //pk
				TransportRequestObjects.numberofVechile.sendKeys("2");
				
				if(TransportRequestObjects.rateType.getAttribute("value").equals(rateType)) 
				{
				float result=Float.parseFloat(TransportRequestObjects.numberofVechile.getAttribute("value"))*Float.parseFloat(TransportRequestObjects.nonrate.getAttribute("ng-reflect-model"));
				if(Float.parseFloat(TransportRequestObjects.totalAmount.getText())==result) {
					assertTrue(true);
				}
				}else if((TransportRequestObjects.rateType.getAttribute("value").equals(rateType))){
					float result=Float.parseFloat(TransportRequestObjects.numberofQty.getAttribute("value"))*Float.parseFloat(TransportRequestObjects.nonrate.getAttribute("ng-reflect-model"));
					if(Float.parseFloat(TransportRequestObjects.totalAmount.getText())==result) {
						assertTrue(true);
					}
				}
		}
			
		/*System.out.println("Selected vehicle type is : "+ vehicle);
		System.out.println("Selected vehicle Description is : "+ vehicledescriptions);		
		System.out.println("Selected Vehicle UOM is : "+ vehicleuom);		
		System.out.println("Selected Vehicle Rate is : "+ vehiclerate);	
		System.out.println("Captured Vehicle is = "+TransportRequestObjects.vehicletype.getAttribute("value"));*/
		//assertEquals(vehicledescriptions.substring(7), TransportRequestObjects.vehicletype.getAttribute("ng-reflect-model"));		
		
		TransportRequestObjects.odctag.click();
		TransportRequestObjects.vechileRemarks.sendKeys("Vechile Remakrs");
		TransportRequestObjects.submit.click();
		String successMessages = TransportRequestObjects.successMessage.getText();		
		if(successMessages.equals("Success")) {
			frqNumber=TransportRequestObjects.createdFrqNumber.getText().substring(25,50);
			System.out.println("FRQ = "+frqNumber);
			Robot close=new Robot();
			close.keyPress(KeyEvent.VK_ESCAPE);
			close.keyRelease(KeyEvent.VK_ESCAPE);
		}		
	}
	
	public static void verifingStatus() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.inProgress));
		try {
			TransportRequestObjects.inProgress.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor)Webdriver.driver;
		     executor.executeScript("arguments[0].click();", TransportRequestObjects.inProgress);
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.filter));
		try {
			TransportRequestObjects.filter.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor)Webdriver.driver;
		     executor.executeScript("arguments[0].click();", TransportRequestObjects.filter);
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.documentNumberToFilter));
		TransportRequestObjects.documentNumberToFilter.sendKeys(frqNumber);
		wait.until(ExpectedConditions.textToBePresentInElement(TransportRequestObjects.pageNavigation, "1 - 1 of 1 items"));
		status=TransportRequestObjects.documentNumberStatus.getText();
		if(status.equals("Created")) {
			assertTrue(true);
			WebElement ele = TransportRequestObjects.documentNumberStatus;		
			action.moveToElement(ele).perform();
			Thread.sleep(3000);
			assertEquals(true, TransportRequestObjects.recall.isEnabled());
			assertEquals(true, TransportRequestObjects.attachment.isEnabled());
			assertEquals(true, TransportRequestObjects.viewAttachment.isEnabled());
			assertEquals(true, TransportRequestObjects.cancel.isEnabled());
			assertEquals(true, TransportRequestObjects.discussionIcon.isEnabled());	
			System.out.println("Transport Request Doc Creation Success");
			Thread.sleep(3000);
		}
	}
	
	public static void materilGrid() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.expand));
		TransportRequestObjects.expand.click();
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.compress));
		TransportRequestObjects.compress.click();
	}

	public static void filterMaterials() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.filter));
		TransportRequestObjects.filter.click();		
	}

	public static void captureTermsAndConditions() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.termsandconditions));
		TransportRequestObjects.termsandconditions.click();
	}

	public static void searchDocument(String docNumber) {
		docNumbers=docNumber;
		TransportRequestObjects.documentNo.sendKeys(docNumbers);	
	}

	public static void verifySearchedDoc() {
		
		assertEquals(docNumbers, TransportRequestObjects.searchedDocnumber.getText());
		System.out.println("FRQ Number Search Completed");
	}

	public static void clearSearchParameter() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.clear));
		TransportRequestObjects.clear.click();
		assertEquals(null, TransportRequestObjects.documentNo.getAttribute("Value"));
		}

	public static void clickcalendar() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.callendar));
		TransportRequestObjects.callendar.click();
	}

	
	public static void selectDateRange() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	    Date date = new Date();
	    String todate = dateFormat.format(date);
	    System.out.println("Todays Date = "+todate);
	    Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -65);
	    Date todate1 = cal.getTime();    
	    
	   /* int month = todate1.getMonth();
	    int year = todate1.getYear();
	    int day = todate1.getDate();
	    
	    System.out.println("Month  = "+month);
	    System.out.println();
	    String fromdate = dateFormat.format(todate1);
	    System.out.println("Back dated = "+fromdate);
		*/
	    wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.dateSelection));
		TransportRequestObjects.dateSelection.click();
	}
	public static void recall() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.recall));
		TransportRequestObjects.recall.click();
		wait.until(ExpectedConditions.textToBePresentInElement(TransportRequestObjects.confirmationMessage, "Confirmation"));
		if(TransportRequestObjects.confirmationMessage.getText().equals("Confirmation")) {
			TransportRequestObjects.confirmationText.sendKeys("Test Recalling");
			TransportRequestObjects.confirmationYes.click();
			//wait.until(ExpectedConditions.elementToBeSelected(TransportRequestObjects.successAlert));
			TransportRequestObjects.successAlert.getText().equals("Success");
			assertEquals("recalled successfully.",TransportRequestObjects.successAlertMessage.getText().substring(26,48));
			assertEquals(frqNumber,TransportRequestObjects.successAlertMessage.getText().substring(0, 25));
		}
	}

	public static void cancell() {
		wait.until(ExpectedConditions.elementToBeClickable(TransportRequestObjects.cancel));
		TransportRequestObjects.cancel.click();
		wait.until(ExpectedConditions.textToBePresentInElement(TransportRequestObjects.confirmationMessage, "Confirmation"));
		if(TransportRequestObjects.confirmationMessage.getText().equals("Confirmation")) {
			TransportRequestObjects.confirmationText.sendKeys("Test Cancel");
			TransportRequestObjects.confirmationYes.click();
			TransportRequestObjects.successAlert.getText().equals("Success");
			assertEquals("cancelled successfully.", TransportRequestObjects.successAlertMessage.getText().substring(26,49));
			assertEquals(frqNumber, TransportRequestObjects.successAlertMessage.getText().substring(0, 25));
	}
}
}