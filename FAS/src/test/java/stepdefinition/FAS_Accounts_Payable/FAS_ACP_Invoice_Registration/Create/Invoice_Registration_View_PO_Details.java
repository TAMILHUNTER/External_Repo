package stepdefinition.FAS_Accounts_Payable.FAS_ACP_Invoice_Registration.Create;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Then;
import dataProviders.ConfigFileReader;
import object_repository.Tamil.ObjectsReporsitory;
import stepdefinition.Webdriver;

public class Invoice_Registration_View_PO_Details {

	public static int popup_validation;

	// Read Configuration

	public static ConfigFileReader configFileReader;

	// Page Factory
	public Invoice_Registration_View_PO_Details() {
		PageFactory.initElements(Webdriver.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 10);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^Verify User can be able to View Process Folow of PO$")
	public static void Verify_User_can_be_able_to_View_Process_Folow_of_PO() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_Chat));

		List<WebElement> listElement_ProcessFlow = object_repository.Tamil.ObjectsReporsitory.InvoiceRegistration_ProcessFlow_AllElements;
		for (int i = 0; i < listElement_ProcessFlow.size(); i++) {
			Actions action13425 = new Actions(Webdriver.driver);
			action13425.moveToElement(
					Webdriver.driver.findElement(By.xpath("(//span[@class='pf-trace-level'])[" + (i + 1) + "]")))
					.perform();
			System.out.println("Purchase Order Process Flow  " + i + " : " + listElement_ProcessFlow.get(i).getText());
		}

		Thread.sleep(3000);
		System.out.println("Process Flow Displayed for Purchase order");
		System.out.println("-------------------------------------------");

	}

	@Then("^Verify User can be able to View PO Details$")
	public static void Verify_User_can_be_able_to_View_PO_Details() throws Throwable {

		Thread.sleep(3000);

		System.out.println("PO Number : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_PO_Number_Data.getText());
		System.out.println("PO Date : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_PO_Date.getText());
		System.out.println("TCD No : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_TCD_No.getText());

		Actions action134251 = new Actions(Webdriver.driver);
		action134251.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_job_Info).perform();

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_job_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_job_Info.click();
		Thread.sleep(3000);
		System.out.println("Job Name: " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_JOB_Name.getText());
		System.out.println("Job Address : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_JOB_Address.getText());
		Actions action1342512 = new Actions(Webdriver.driver);
		action1342512.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_job_Info).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_job_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_job_Info.click();

		Actions action13425122 = new Actions(Webdriver.driver);
		action13425122.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info).perform();

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info.click();

		System.out.println("Vendor Name : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Name.getText());
		System.out.println(
				"Vendor Address : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Address.getText());
		System.out.println("Vendor - Contact Person : "
				+ ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Contact_Person.getText());
		System.out.println("Vendor Contact Number : "
				+ ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Contact_Number.getText());
		System.out.println(
				"Vendor Email ID : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Email_ID.getText());

		Actions action134251322 = new Actions(Webdriver.driver);
		action134251322.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info).perform();

		wait.until(
				ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info.click();
		
		
		Actions action300 = new Actions(Webdriver.driver);
		action300.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Payment_Center_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_Payment_Center_Info.click();
		
		System.out.println("Payment Center Name : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Payment_Centre_Name.getText());
		System.out.println("Payment Center Address : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Payment_Centre_Address.getText());
		
		Actions action301 = new Actions(Webdriver.driver);
		action301.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Vendor_Info).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Payment_Center_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_Payment_Center_Info.click();
		
		Actions action302 = new Actions(Webdriver.driver);
		action302.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_WareHouse_Info).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_WareHouse_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_WareHouse_Info.click();
		
		System.out.println("Warehouse Name : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Warehouse_Name.getText());
		System.out.println("Warehouse Address : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Warehouse_Address.getText());
		
		Actions action303 = new Actions(Webdriver.driver);
		action303.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_WareHouse_Info).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_WareHouse_Info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_WareHouse_Info.click();
		
		System.out.println("Amendment No : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_AmendmentNo.getText());
		System.out.println("Expiry Date : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Expiry_Date.getText());
		System.out.println("PO Type : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_PO_Type.getText());
		System.out.println(
				"Purchase Group : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_PurchaseGroup.getText());
		System.out.println("PO Value : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_PO_Value.getText());
		System.out.println("Currency : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Currency.getText());
		System.out.println(
				"Del. Start Date : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Del_Start_Date.getText());
		System.out.println("Del. End Date : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Del_End_Date.getText());
		System.out.println("Document Reference No. : "
				+ ObjectsReporsitory.InvoiceRegistration_PO_Detail_Document_Reference_No.getText());

		System.out.println("Purchase order Details Displayed");
		System.out.println("-------------------------------------------");
	}

	@Then("^Verify User can be able to View Material List of PO$")
	public static void Verify_User_can_be_able_to_View_Material_List_of_PO() throws Throwable {
		
		Actions action304 = new Actions(Webdriver.driver);
		action304.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Count).perform();
		System.out.println(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Count.getText());
		
		Actions action305 = new Actions(Webdriver.driver);
		action305.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Desc_Code).perform();
		System.out.println("Material Desc. Code : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Desc_Code.getText());
		
		
		Actions action306 = new Actions(Webdriver.driver);
		action306.moveToElement(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Component_Details_info).perform();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Component_Details_info));
		ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Component_Details_info.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Component_Details_left_arrow));
		System.out.println("Material Desc. Code : " + ObjectsReporsitory.InvoiceRegistration_PO_Detail_Material_Desc_Code.getText());
		
		

	}

	@Then("^Verify User can be able to View Payment Terms of PO$")
	public static void Verify_User_can_be_able_to_View_Payment_Terms_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Liquidity Damage of PO$")
	public static void Verify_User_can_be_able_to_View_Liquidity_Damage_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Other Cost of PO$")
	public static void Verify_User_can_be_able_to_View_Other_Cost_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Defect Liability Period of PO$")
	public static void Verify_User_can_be_able_to_View_Defect_Liability_Period_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Additional Terms and Conditions of PO$")
	public static void Verify_User_can_be_able_to_View_Additional_Terms_and_Conditions_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Tax Details of PO$")
	public static void Verify_User_can_be_able_to_View_Tax_Details_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Shipment Details of PO$")
	public static void Verify_User_can_be_able_to_View_Shipment_Details_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Trade Details of PO$")
	public static void Verify_User_can_be_able_to_View_Trade_Details_of_PO() throws Throwable {
	}

	@Then("^Verify User can be able to View Essential Details of PO$")
	public static void Verify_User_can_be_able_to_View_Essential_Details_of_PO() throws Throwable {
	}

}
