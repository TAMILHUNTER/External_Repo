package stepdefinition;

import static org.junit.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import action_SCM.Commoncontrol;

import cucumber.api.java.en.Then;
import dataProviders.BaseClass;
import dataProviders.ConfigFileReader;
import object_repository.EIP_Menu;
import object_repository.Login_Objects;
import object_repository.SCM_CPRS_Page;
import object_repository.SCM_Purchase_Request;

public class RFQ_PR_Creation extends BaseClass {
	String errorMessage, errorMessageHeader;
	// Read Configuration
	public static ConfigFileReader configFileReader;
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_RESET = "\u001B[0m";
	

	public RFQ_PR_Creation() {
		PageFactory.initElements(Webdriver.driver, EIP_Menu.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^Enter RFQ in Search Menu as (.*)$")
	public void click_on_search_menu(String RFQ) throws Throwable {
		EIP_Menu.SearchMenu.sendKeys(RFQ);
	}

	@Then("^Verify To list RFQ menu after Enter RFQ in Search Menu$")
	public void Verify_To_Navigate_the_RFQ_Home_Page_so_Enter_RFQ_in_Search_Menu() throws Throwable {
		EIP_Menu.SearchMenu.sendKeys(ConfigFileReader.getSearchMenu_RFQ());
	}

	@Then("^Verify RFQ Navication menu$")
	public void Verify_RFQ_Navication_menu() throws Throwable {
		Commoncontrol.RFQHomePageNavigateToMenu();
	}
	
	@Then("^Verify ASN Navication menu$")
	public void Verify_ASN_Navication_menu() throws Throwable {
	
	EIP_Menu.HomeMenu.click();
	System.out.println(ANSI_GREEN_BACKGROUND + "Select Access Based Menu" + ANSI_RESET);
	Thread.sleep(1500);
	assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
	System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
	Thread.sleep(500);
	EIP_Menu.SCM.click();
	Thread.sleep(500);
	assertEquals("ASN", EIP_Menu.ASN.getText());
	System.out.println("SCM Menu = " + EIP_Menu.ASN.getText());
	EIP_Menu.ASN.click();
	
	}
	
	@Then("^Select filter button in ASN Page to filter latest POA Number$")
	public void Select_filter_button_in_ASN_Page_to_filter_latest_POA_Number() throws Throwable{
		
		Thread.sleep(3000);
		
		EIP_Menu.ASNFilter.click();
//		Commoncontrol.eAuctionAlert();
		
		System.out.println("Select filter button in ASN Page to filter latest POA Number");
	}
	
	
	@Then("^Enter PO Number in ASN Page to filter latest POA Number$")
	public void Enter_PO_Number_in_ASN_Page_to_filter_latest_POA_Number() throws Throwable{
		
		Thread.sleep(4000);
		EIP_Menu.AuctionFilterPR.click();
		Thread.sleep(7000);
		DataBaseConnection.EnterPOFromDB();
		System.out.println("Select filter button in ASN Page to filter latest POA Number");
	}
	
	@Then("^Select Create Icon in latest POA Number$")
	public void Select_Create_Icon_in_latest_POA_Number() throws Throwable{
		
		
		Thread.sleep(2500);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.ASNCreate);
		Thread.sleep(3000);
		actions.perform();
		Thread.sleep(2000);
		EIP_Menu.ICASNCreate.click();
		
		System.out.println("Select Create Icon in latest POA Number");
	}
	
	@Then("^Enter POA Exp quantity in latest POA Details$")
	public void Enter_POA_Exp_quantity_in_latest_POA_Details() throws Throwable{
		
		ScrollUsingJaveScript(POAExpQty);
		Thread.sleep(1000);
		EIP_Menu.POAExpQty.click();
		EIP_Menu.POAExpQty.clear();
		Thread.sleep(300);
		DataBaseConnection.EnterPOAPendingQty();
		
		System.out.println("Enter POA Exp quantity in latest POA Details");
	}
	
	
	@Then("^Select Submit button in latest POA Details$")
	public void Select_Submit_button_in_latest_POA_Details() throws Throwable{
		Thread.sleep(1000);
		ScrollUsingJaveScript(SelectPOA);
		Thread.sleep(1000);
		
		
		
		try {
			EIP_Menu.SelectPOA.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectPOA);

		}
		
		Thread.sleep(1000);
		EIP_Menu.POASubmit.click();
		
		
		System.out.println("Select Submit button in latest POA Details");
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
		
	}
	
	@Then("^Enter Invoice No in Supplier Invoice Details$")
	public void Enter_Invoice_No_in_Supplier_Invoice_Details() throws Throwable{
		Thread.sleep(1000);
		EIP_Menu.POAInvoiceNo.sendKeys(ConfigFileReader.getInvoiceNo_POA());
		
		System.out.println("Enter Invoice No in Supplier Invoice Details");
		
		
	}
	
	@Then("^Select Invoice Date in Supplier Invoice Details$")
	public void Select_Invoice_Date_in_Supplier_Invoice_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.InvoiceDate.click();
		Thread.sleep(700);
		EIP_Menu.Date.click();
		System.out.println("Select Invoice Date in Supplier Invoice Details");
		
		
	}
	
	
	@Then("^Enter Invoice Value in Supplier Invoice Details$")
	public void Enter_Invoice_Value_in_Supplier_Invoice_Details() throws Throwable{
		Thread.sleep(1000);
		
		EIP_Menu.InvoiceValue.click();
		
		EIP_Menu.InvoiceValue.clear();
		EIP_Menu.InvoiceValue.sendKeys(ConfigFileReader.getInvoiceValue_POA());
		System.out.println("Enter Invoice Value in Supplier Invoice Details");
		
		
	}
	
	@Then("^Enter Supplier ASN Reference Number in Supplier Invoice Details$")
	public void Enter_Supplier_ASN_Reference_Number_in_Supplier_Invoice_Details() throws Throwable{
		Thread.sleep(1000);
		
		EIP_Menu.SupplierASNRefNo.click();
		
		EIP_Menu.SupplierASNRefNo.sendKeys(ConfigFileReader.getSupplierASNRefNo_ASN());
		System.out.println("Enter Supplier ASN Reference Number in Supplier Invoice Details");
		
		
	}
	
	@Then("^Select Supplier ASN Reference Date in Supplier Invoice Details$")
	public void Select_Supplier_ASN_Reference_Date_in_Supplier_Invoice_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.SupplierASNRefDate.click();
		Thread.sleep(700);
		EIP_Menu.Date.click();
		System.out.println("Select Supplier ASN Reference Date in Supplier Invoice Details");
		
		
	}
	
	@Then("^Enter Remarks in Supplier Invoice Details$")
	public void Enter_Remarks_in_Supplier_Invoice_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.SUPPRemarks.click();
		Thread.sleep(700);
		EIP_Menu.SUPPRemarks.sendKeys(ConfigFileReader.getSupplierInvoiceDetails_ASN());
		
		System.out.println("Enter Remarks in Supplier Invoice Details");
		
		
	}
	
	@Then("^Enter DC Number in DC Details$")
	public void Enter_DC_Number_in_DC_Details() throws Throwable{
		
		ScrollUsingJaveScript(DCNumber);
		Thread.sleep(1000);
		EIP_Menu.DCNumber.click();
		Thread.sleep(700);
		EIP_Menu.DCNumber.sendKeys(ConfigFileReader.getSupplierInvoiceDetails_ASN());
		
		System.out.println("Enter Remarks in Supplier Invoice Details");
		
			}
	
	
	@Then("^Enter DC Date in DC Details$")
	public void Enter_DC_Date_in_DC_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.DCDate.click();
		Thread.sleep(700);
		EIP_Menu.Date.click();
		System.out.println("Enter DC Date in DC Details");
		
		
	}
	
	@Then("^Enter Delivery Order Number in DC Details$")
	public void Enter_Delivery_Order_Number_in_DC_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.DeliveryOrderNumber.click();
		EIP_Menu.DeliveryOrderNumber.sendKeys(ConfigFileReader.getDeliveryOrderNumber_ASN());
		System.out.println("Enter Delivery Order Number in DC Details");
		
		
	}
	
	@Then("^Enter Delivery Order Date in DC Details$")
	public void Enter_Delivery_Order_Date_in_DC_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.DODDate.click();
		Thread.sleep(700);
		EIP_Menu.Date.click();
		System.out.println("Enter Delivery Order Date in DC Details");
		
			}
	
	@Then("^Enter Transporter in Transportation Details$")
	public void Enter_Transporter_in_Transportation_Details() throws Throwable{
		Thread.sleep(500);
		ScrollUsingJaveScript(Transporter);
		Thread.sleep(1500);
		
		EIP_Menu.Transporter.click();
		System.out.println("Select Transporter in Transportation Details");
		Thread.sleep(700);
		EIP_Menu.EnterVendor.sendKeys(ConfigFileReader.getEnterVendor_ASN());
		System.out.println("Enter vendor in Transportation Details");
		Thread.sleep(500);
		EIP_Menu.ASNVendorSearch.click();
		System.out.println("Select Search in Transportation Details");
		Thread.sleep(500);
		EIP_Menu.SelectASNVendor.click();
		System.out.println("Select ASN Vendor in Transportation Details");
		Thread.sleep(500);
		try {
			EIP_Menu.VendorInfoOk.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.VendorInfoOk);

		}
		
		System.out.println("Enter Transporter in Transportation Details");
		
			}
	
	@Then("^Enter Vehicle Number in Transportation Details$")
	public void Enter_Vehicle_Number_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.VehicleNumber.click();
	Thread.sleep(500);
	EIP_Menu.VehicleNumber.sendKeys(ConfigFileReader.getVehicleNumber_ASN());
	
	System.out.println("Enter Vehicle Number in Transportation Details");
	
	}
	
	@Then("^Enter VR GC Number in Transportation Details$")
	public void Enter_VR_GC_Number_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.LRGCNNumber.click();
	Thread.sleep(500);
	EIP_Menu.LRGCNNumber.sendKeys(ConfigFileReader.getVRGCNNumber_ASN());
	
	System.out.println("Enter VR GC Number in Transportation Details");
	
	}
	
	@Then("^Enter VR GCN RR Date in Transportation Details$")
	public void Enter_VR_GCN_RR_Date_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.LRGCNDate.click();
		Thread.sleep(700);
		EIP_Menu.Date.click();
		System.out.println("Enter VR GCN RR Date in Transportation Details");
		
	}
	
	
	@Then("^Enter Town in Transportation Details$")
	public void Enter_Town_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.ASNTown.click();
	Thread.sleep(500);
	EIP_Menu.ASNTown.sendKeys(ConfigFileReader.getVRGCNNumber_ASN());
	
	System.out.println("Enter VR GC Number in Transportation Details");
	
	}
	
	@Then("^Enter Pin in Transportation Details$")
	public void Enter_Pin_in_Transportation_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.ASNPin.click();
	EIP_Menu.ASNPin.clear();
	Thread.sleep(500);
	EIP_Menu.ASNPin.sendKeys(ConfigFileReader.getPin_ASN());
	
	System.out.println("Enter Pin in Transportation Details");
	
	}
	
	@Then("^Enter E-Way Bill number in Transportation Details$")
	public void Enter_E_Way_Bill_number_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.ASNWayBill.click();
	Thread.sleep(500);
	EIP_Menu.ASNWayBill.sendKeys(ConfigFileReader.getEwayBillNumber_ASN());
	
	System.out.println("Enter E-Way Bill number in Transportation Details");
	
	}
	
	@Then("^Enter E-Way Bill Date in Transportation Details$")
	public void Enter_E_Way_Date_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
		
		EIP_Menu.EWayDate.click();
		Thread.sleep(700);
		EIP_Menu.Date.click();
		System.out.println("Enter E-Way Bill Date in Transportation Details");
		
	}
	
	@Then("^Enter Vendor Mobile number in Transportation Details$")
	public void Enter_Vendor_Mobile_number_in_Transportation_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.VendorMovilenum.click();
	Thread.sleep(500);
	EIP_Menu.VendorMovilenum.sendKeys(ConfigFileReader.getVendorMobileNumber_ASN());
	
	System.out.println("Enter Vendor Mobile number in Transportation Details");
	
	}
	
	
	@Then("^Enter Weighment Type in Weighment Details$")
	public void Enter_Weighment_in_Weighment_Details() throws Throwable{
		
		Thread.sleep(500);
	ScrollUsingJaveScript(WeighmentType);	
		Thread.sleep(1500);
	
	EIP_Menu.WeighmentType.click();
	Thread.sleep(500);
	EIP_Menu.SelAuctionHSN.click();
	
	System.out.println("Enter Weighment Type in Weighment Details");
	
	}
	
	@Then("^Enter Weightment Slip No in Weighment Details$")
	public void Enter_Weightment_Slip_No_in_Weighment_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.WeightmentSlipNo.click();
	Thread.sleep(500);
	EIP_Menu.WeightmentSlipNo.sendKeys(ConfigFileReader.getWeightmentSlipNo_ASN());
	
	System.out.println("Enter Weightment Slip No in Weighment Details");
	
	}
	
	@Then("^Enter Gross Weight in Weighment Details$")
	public void Enter_Gross_Weight_in_Weighment_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.GrossWeight.click();
	Thread.sleep(500);
	EIP_Menu.GrossWeight.sendKeys(ConfigFileReader.getGrossWeight_ASN());
	
	System.out.println("Enter Gross Weight in Weighment Details");
	
	}
	
	@Then("^Enter Tare Weight in Weighment Details$")
	public void Enter_Tare_Weight_in_Weighment_Details() throws Throwable{
		Thread.sleep(1500);
	
	EIP_Menu.TareWeight.click();
	Thread.sleep(500);
	EIP_Menu.TareWeight.sendKeys(ConfigFileReader.getTareWeight_ASN());
	
	System.out.println("Enter Tare Weight in Weighment Details");
	
	}
	
	
	@Then("^Enter Date in Weighment Details$")
	public void Enter_Date_in_Weighment_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.DateIn.click();
	Thread.sleep(500);
	EIP_Menu.Date.click();
	
	System.out.println("Enter Date in Weighment Details");
	
	}
	
	@Then("^Enter Toggle Tile List in Weighment Details$")
	public void Enter_Toggle_Tile_List_in_Weighment_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.DateInTime.click();
	Thread.sleep(500);
	EIP_Menu.InTime.click();
	
	System.out.println("Enter Toggle Tile List in Weighment Details");
	
	}
	
	@Then("^Enter Date Out in  Weighment Details$")
	public void Enter_Date_Out_in_Weighment_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.DateOut.click();
	Thread.sleep(500);
	EIP_Menu.Date.click();
	
	System.out.println("Enter Date Out in  Weighment Details");
	
	}
	
	@Then("^Enter Out Toggle Tile List in Weighment Details$")
	public void Enter_Out_Toggle_Tile_List_in_Weighment_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.DateOutTime.click();
	Thread.sleep(2000);
	EIP_Menu.InTime.click();
	
	System.out.println("Enter Out Toggle Tile List in Weighment Details");
	
	}
	
	@Then("^Enter Package Code Slip No in Packing Details$")
	public void Enter_Package_Code_Slip_No_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.PackageCode.click();
	Thread.sleep(1000);
	EIP_Menu.PackageCode.sendKeys(ConfigFileReader.getPackageCodeNumber_ASN());
	
	System.out.println("Enter Package Code Slip No in Packing Details");
	
	}
	
	@Then("^Select Package Type  in Packing Details$")
	public void Enter_Package_Type_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.PackageType.click();
	Thread.sleep(500);
	List<WebElement> selectEP = EIP_Menu.BQHSNlist;
	for (WebElement webElement : selectEP) {
		if (webElement.getText().equals(ConfigFileReader.getPackingType_ASN())) {
			webElement.click();
			// System.out.println(webElement.getText());
			break;
	
		}
	
	
	System.out.println("Select Package Type  in Packing Details");
	
	}
	}
	

	@Then("^Enter Package Quantity in Packing Details$")
	public void Enter_Package_Quantity_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.PackageQuantity.click();
	Thread.sleep(500);
	EIP_Menu.PackageQuantity.sendKeys(ConfigFileReader.getPackageQuantity_ASN());
	
	
	System.out.println("Enter Package Quantity in Packing Details");
	
	}
	
	
	@Then("^Enter Package Gross Weight KG in Packing Details$")
	public void Enter_Package_Gross_Weight_KG_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.PackageGrossWeight.click();
	Thread.sleep(500);
	EIP_Menu.PackageGrossWeight.sendKeys(ConfigFileReader.getGrossWeightKG_ASN());
	
	
	System.out.println("Enter Package Gross Weight KG in Packing Details");
	
	}
	
	@Then("^Enter Package Net Weight KG in Packing Details$")
	public void Enter_Package_Net_Weight_KG_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.PackageNetWeight.click();
	Thread.sleep(500);
	EIP_Menu.PackageNetWeight.sendKeys(ConfigFileReader.getNetWeightKG_ASN());
	
	
	System.out.println("Enter Package Net Weight KG in Packing Details");
	
	}
	
	
	@Then("^Select Dimension UOM in Packing Details$")
	public void Enter_Dimension_UOM_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.DimensionUOM.click();
	Thread.sleep(500);
	List<WebElement> selectEP = EIP_Menu.BQHSNlist;
	for (WebElement webElement : selectEP) {
		if (webElement.getText().equals(ConfigFileReader.getDimensionUOM_ASN())) {
			webElement.click();
			// System.out.println(webElement.getText());
			break;
	
		}
	
	
	System.out.println("Select Dimension UOM in Packing Details");
	
	}
	}
	
	
	@Then("^Enter Package Dimensions LBH in Packing Details$")
	public void Enter_Package_Dimensions_LBH_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
	EIP_Menu.DimensionsLBH.click();
	Thread.sleep(500);
	EIP_Menu.DimensionsLBH.sendKeys(ConfigFileReader.getDimensionsLBH_ASN());
	
	
	System.out.println("Enter Package Dimensions LBH in Packing Details");
	
	}
	
	@Then("^Enter Package Dimensions L in Packing Details$")
	public void Enter_Package_Dimensions_L_in_Packing_Details() throws Throwable{
		Thread.sleep(500);
	
		ScrollUsingJaveScript(AuctionMove);
		Thread.sleep(500);
	EIP_Menu.DimensionsLBH.click();
	Thread.sleep(500);
	EIP_Menu.DimensionsLBH.sendKeys(ConfigFileReader.getDimensionsLBH_ASN());
	
	
	System.out.println("Enter Package Dimensions LBH in Packing Details");
	
	}
	
	
	@Then("^Enter Package Dimensions B in Packing Details$")
	public void Enter_Package_Dimensions_B_in_Packing_Details() throws Throwable{
		ScrollUsingJaveScript(AuctionMove);
		Thread.sleep(1000);
	
		
	EIP_Menu.DimensionsB.click();
	Thread.sleep(500);
	EIP_Menu.DimensionsB.sendKeys(ConfigFileReader.getDimensionsB_ASN());
	
	
	System.out.println("Enter Package Dimensions B in Packing Details");
	
	}
	
	@Then("^Enter Package Dimensions H in Packing Details$")
	public void Enter_Package_Dimensions_H_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
		
	EIP_Menu.DimensionsH.click();
	Thread.sleep(500);
	EIP_Menu.DimensionsH.sendKeys(ConfigFileReader.getDimensionsH_ASN());
	
	
	System.out.println("Enter Package Dimensions H in Packing Details");
	
	}
	
	@Then("^Enter Package Dimensions Remarks in Packing Details$")
	public void Enter_Package_Dimensions_Remarks_in_Packing_Details() throws Throwable{
		Thread.sleep(1000);
	
		
	EIP_Menu.DimensionsRemarks.click();
	Thread.sleep(500);
	EIP_Menu.DimensionsRemarks.sendKeys(ConfigFileReader.getDimensionsRemarks_ASN());
	
	
	System.out.println("Enter Package Dimensions Remarks in Packing Details");
	
	}
	
	@Then("^Enter Material Quantity in Material Details$")
	public void Enter_Material_Quantity_in_Material_Details() throws Throwable{
		
		
		Thread.sleep(500);
		
		ScrollUsingJaveScript(MaterialQuantity);
		Thread.sleep(500);
	
		
	EIP_Menu.MaterialQuantity.click();
	Thread.sleep(500);
	EIP_Menu.MaterialQuantity.sendKeys(ConfigFileReader.getPackageQuantity_ASN());
	
	
	System.out.println("Enter Material Quantity in Material Details");
	
	}
	
	
	
	
	@Then("^Select Post Shipment Details in Packing Details$")
	public void Select_Post_Shipment_Details_in_Packing_Details() throws Throwable{
		Thread.sleep(2000);
	
		try {
			EIP_Menu.PSD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PSD);

		}
	
		System.out.println("Select Post Shipment Details in Packing Details");
		
		Commoncontrol.eAuctionAlert();
	
	}
	
	@Then("^Select ASN Submit button$")
	public void Select_ASN_Submit_Button() throws Throwable{
		Thread.sleep(2000);
	
		try {
			EIP_Menu.ASNSubmit.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ASNSubmit);

		}
	
		System.out.println("Select ASN Submit button");
		
		Commoncontrol.eAuctionAlert();
		
		Commoncontrol.eAuctionAlert();
		
		Commoncontrol.eAuctionAlert();
		
	
	}
	
	
	
	
	@Then("^Select Expand List in latest POA Details$")
	public void Select_Expand_List_in_latest_POA_Details() throws Throwable{
		
		Thread.sleep(2000);
		EIP_Menu.POAExpandList.click();
		
		System.out.println("Select Expand List in latest POA Details");
	}
	
	@Then("^Select Exp Delivery Date Toggle calendar in latest POA Details$")
	public void Select_Exp_Delivery_Date_Toggle_calendar_in_latest_POA_Details() throws Throwable{
		
		Thread.sleep(2000);
		EIP_Menu.POATogglecalendar.click();
		
		Date date = new Date();
		System.out.println("Today Date : " + date);
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int fifth_day = Integer.parseInt(today) + 5;
		String select_fifthday = Integer.toString(fifth_day);
		System.err.println("Fifth Day : " + select_fifthday);
		Thread.sleep(1000);
		List<WebElement> rFQOrderExpiryDate2 = EIP_Menu.POAExpDeliveryDate;
		for (WebElement webElement : rFQOrderExpiryDate2) {
			if (webElement.getAttribute("innerHTML").contains(select_fifthday)) {
				webElement.click();
				break;
			}
		}
		
		System.out.println("Select Exp Delivery Date Toggle calendar in latest POA Details");
	}
	
	
	
	
	
	
	

	@Then("^Verify eAuction Navication menu$")
	public void Verify_eAuction_Navication_menu() throws Throwable {
		Commoncontrol.eAuctionHomePageNavigateToMenu();
		Commoncontrol.eAuctionHomePageAddIcon();
	}

	@Then("^Verify eAuction Navication menu Package$")
	public void Verify_eAuction_Navication_menu_Package() throws Throwable {
		Commoncontrol.eAuctionHomePageNavigateToMenu();
		Thread.sleep(500);
		Commoncontrol.eAuctionHomePackage();
		Thread.sleep(500);
		Commoncontrol.eAuctionHomePageAddIcon();
	}

	@Then("^Verify eAuction Navication menu Material$")
	public void Verify_eAuction_Navication_menu_Material() throws Throwable {
		Commoncontrol.eAuctionHomePageNavigateToMenu();
		Thread.sleep(500);
		Commoncontrol.eAuctionHomePageAddIcon();
	}

	@Then("^Verify eAuction Navication to Package All Menu$")
	public void Verify_eAuction_Navication_to_Package_All_Menu() throws Throwable {
		Commoncontrol.eAuctionHomePageNavigateToMenu();
		Thread.sleep(500);
		Commoncontrol.eAuctionHomePackage();
		Thread.sleep(1500);

		EIP_Menu.al.click();
	}

	@Then("^Verify eAuction Navication to Material All Menu$")
	public void Verify_eAuction_Navication_to_Material_All_Menu() throws Throwable {
		Commoncontrol.eAuctionHomePageNavigateToMenu();
		// Commoncontrol.eAuctionHomePackage();
		Thread.sleep(500);

		EIP_Menu.al.click();
	}

	@Then("^Refresh eAuction Navication to Package$")
	public void Refresh_eAuction_Navication_to_Package() throws Throwable {

		Thread.sleep(2500);
		EIP_Menu.auctInpro.click();

		Thread.sleep(3000);
		EIP_Menu.al.click();
		Thread.sleep(500);
	}

	@Then("^Select RFQ$")
	public void click_on_RFQ() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectRFQ));
		EIP_Menu.SelectRFQ.click();
	}

	@Then("^Verify to Navigate the Request For Quote Home Page after select RFQ in Search Menu Result$")
	public void Verify_to_Navigate_the_Request_For_Quote_Home_Page_after_select_RFQ_in_Search_Menu_Result()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectRFQ));
		EIP_Menu.SelectRFQ.click();
	}

	@Then("^Verify to Navigate the eAuction Home Page after select Auction in Search Menu Result$")
	public void Verify_to_Navigate_the_eAuction_Home_Page_after_select_Auction_in_Search_Menu_Result()
			throws Throwable {

	}

	@Then("^Select Techno Commercial Document$")
	public void Select_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTCD));
		EIP_Menu.SelectTCD.click();
	}

	@Then("^Verify the Request For Quote Home Page$")
	public void Verify_the_Request_For_Quote_Home_Page() throws Throwable {

	}

	@Then("^Select Material in Techno Commercial Document$")
	public void Select_Material_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectMaterialTCD));
		Thread.sleep(700);
		try {
			EIP_Menu.SelectMaterialTCD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectMaterialTCD);

		}
		System.out.println("Select Material in Techno Commercial Document");

	}
	
	
	@Then("^Select For Auction in Material Techno Commercial Document$")
	public void Select_For_Auction_Material_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.foract));
		Thread.sleep(2000);
		try {
			EIP_Menu.foract.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.foract);

		}
		System.out.println("Select For Auction in Material Techno Commercial Document");

	}
	
	
	
	
	
	@Then("^Select Rejected Menu in Techno Commercial Document for Re Create TCD$")
	public void Select_Rejected_Menu_in_Techno_Commercial_Document_for_Re_Create_TCD() throws Throwable {
		
		Thread.sleep(2000);
		try {
			EIP_Menu.SelectRejectedTCD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectRejectedTCD);

		}
		System.out.println("Select Rejected Menu in Techno Commercial Document for Re Create TCD");

	
	
	Thread.sleep(1000);
	try {
		EIP_Menu.SelectRefreshTCD.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.SelectRefreshTCD);

	}
	System.out.println("Select Rejected Menu in Techno Commercial Document for Re Create TCD");

}


	
	
	
	
	
	

	@Then("^Select Capital in Techno Commercial Document$")
	public void Select_Capital_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.CapitalTCD));
		EIP_Menu.CapitalTCD.click();
	}

	@Then("^Select Capital in Techno Commercial Document TCC$")
	public void Select_Capital_in_Techno_Commercial_Document_TCC() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectCapitalTCD));
		EIP_Menu.SelectCapitalTCD.click();
	}

	@Then("^Select RFQ Add Icon$")
	public void click_on_RFQAddIcon() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddIcon));
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddIcon));
		// EIP_Menu.SelectAddIcon.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.SelectAddIcon);
	}

	@Then("^Search PR$")
	public void Search_PR() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.SearchPR.click();
	}

	@Then("^Select Advanced search TCD$")
	public void Select_Advanced_search_TCD() throws Throwable {
		EIP_Menu.Advancedsearch.click();
	}

	@Then("^Select Filter Icon in Techno Commercial Document Page$")
	public void Select_filter_in_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.filter));

		Thread.sleep(2500);

		try {
			EIP_Menu.filter.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.filter);

		}

		System.out.println("Select Filter Icon in Techno Commercial Document Page");
	}

	@Then("^Enter RFQ No in filter TCD Page$")
	public void Enter_RFQ_No_in_filter_TCD_Page(String RFQNo) throws Throwable {
		EIP_Menu.RFQNoTCD.sendKeys(RFQNo);
	}

	@Then("^Enter PR from DB$")
	public void Enter_PR_from_DB() throws Throwable {
		DataBaseConnection.EnterPRFromDB();
	}

	@Then("^Enter Domestic Job PR from DB$")
	public void Enter_Domestic_Job_PR_from_DB() throws Throwable {
		DataBaseConnection.EnterDomesticJobPRFromDB();
	}

	@Then("^Enter Capital PR from DB$")
	public void Enter_Capital_PR_from_DB() throws Throwable {
		DataBaseConnection.EnterCapitalPRfromDB();
	}

	@Then("^Allocation Date$")
	public void Allocation_Date() throws Throwable {
		EIP_Menu.AllocationDate.clear();
	}

	@Then("^Enter Allocation Date as (.*)$")
	public void Enter_Allocation_Date(String AllocationDate) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterAllocationDate));
		EIP_Menu.EnterAllocationDate.sendKeys(AllocationDate);
	}

	@Then("^Select Search Icon$")
	public void Select_Search_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectSearchIcon));
		Thread.sleep(1500);
		try {
			EIP_Menu.SelectSearchIcon.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectSearchIcon);

		}

		System.out.println("Select Search Icon in Advance Search");

	}

	@Then("^Select PR$")
	public void Select_PR() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPR));
		Thread.sleep(500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPR));
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.SelectPR);

		// EIP_Menu.SelectPR.click();
	}

	@Then("^Select Next Icon$")
	public void Select_Next_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextIcon));
		// EIP_Menu.SelectNextIcon.click();
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.SelectNextIcon);
	}

	@Then("^Select Yes in Confirmation Alert$")
	public void Select_Yes_in_Confirmation_Alert() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ConfirmationAlert));
		// EIP_Menu.SelectNextIcon.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.ConfirmationAlert);
	}

	@Then("^Select Next Icon SR$")
	public void Select_Next_Icon_SR() throws Throwable {
		EIP_Menu.SelectNextIconSR.click();
	}

	@Then("^Enter Scope Of RFQ as (.*)$")
	public void Enter_Scope_Of_RFQ(String ScopeOfRFQ) throws Throwable {
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ScopeOfRFQ);
	}

	@Then("^Enter Quantity as (.*)$")
	public void Enter_Quantity(String Quantity) throws Throwable {
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(Quantity);
	}

	@Then("^Enter Quantity In Service as (.*)$")
	public void Enter_Quantity_Service(String Quantity) throws Throwable {
		EIP_Menu.EnterQuantitySR.click();
		EIP_Menu.EnterQuantitySR.clear();
		EIP_Menu.EnterQuantitySR.sendKeys(Quantity);
	}

	@Then("^Select Expand List$")
	public void ExpandList() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandList));
		EIP_Menu.ExpandList.click();
	}

	@Then("^Select Expand List in Service$")
	public void ExpandList_SR() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandListSR));
		EIP_Menu.ExpandListSR.click();
	}

	@Then("^Select Del Schedule$")
	public void Del_Schedule() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DelSchedule));
		EIP_Menu.DelSchedule.click();
	}

	@Then("^Enter Delivery Qty as (.*)$")
	public void Enter_Delivery_Qty(String DeliveryQty) throws Throwable {
		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(DeliveryQty);
	}

	@Then("^Select Save and Close Icon$")
	public void Select_Save_and_Close_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandClose));
		EIP_Menu.SaveandClose.click();
	}

	@Then("^Select Save and Close Icon in Service$")
	public void Select_Save_and_Close_Icon_SR() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandCloseSR));
		EIP_Menu.SaveandCloseSR.click();
	}

	@Then("^Enter HSN RFQ Create as (.*)$")
	public void Enter_HSN_RFQ_Create_as(String HSN) throws Throwable {
		/* wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterHSN)); */
		// Webdriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterHSN));
		EIP_Menu.EnterHSN.click();

		EIP_Menu.EnterHSN.sendKeys(HSN, Keys.TAB);

		/*
		 * Robot rob= new Robot(); rob.keyPress(KeyEvent.VK_TAB);
		 * rob.keyRelease(KeyEvent.VK_TAB); rob.keyPress(KeyEvent.VK_2);
		 */
	}

	@Then("^Select Next Icon RFQ Create$")
	public void Select_Next_Icon_RFQ_Create() throws Throwable {
		EIP_Menu.SelectNextIconRFQCreate.click();
	}

	@Then("^Accept Alert$")
	public void Accept_Alert_1() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		Thread.sleep(2000);
		// EIP_Menu.AlertBQAccept.click();
		Commoncontrol.eAuctionAlert();
		// Login_Steps.Logout();
		System.out.println("Accept Alert");
	}

	@Then("^Accept Alert Validation$")
	public void Accept_Alert_Validation() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDBQEditAcceptAlert));
		Thread.sleep(500);

		try {
			EIP_Menu.TCDBQEditAcceptAlert.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDBQEditAcceptAlert);

		}

		// Login_Steps.Logout();

	}

	@Then("^Accept Alert Import Job$")
	public void Accept_Alert_Import_Job() throws Throwable {
		String importtag = EIP_Menu.importTag_NO_M.getText();
		System.out.println(importtag);
		if (importtag.contains(
				"Ship To and Bill From is Cross Country and Import Tag selected as NO. Please select the Proper Import tag and proceed")) {
			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
			Thread.sleep(600);
			// EIP_Menu.AlertBQAccept.click();
			Commoncontrol.eAuctionAlert();
			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Import_Yesbtn_M));
			Thread.sleep(600);
			EIP_Menu.Import_Yesbtn_M.click();
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
			Thread.sleep(600);
			// EIP_Menu.AlertBQAccept.click();
			Commoncontrol.eAuctionAlert();
			// Login_Steps.Logout();

		}

	}

	@Then("^Logout$")
	public void Logout() throws Throwable {
		Thread.sleep(500);
		Login_Steps.Logout();
	}

	@Then("^Close and Logout$")
	public void Close_and_Logout() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.CRFQcl.click();
		Thread.sleep(500);
		Login_Steps.Logout();
	}

	@Then("^Accept Alert in RFQ Create Complete$")
	public void Accept_Alert_in_RFQ_Create_Complete() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Login_Steps.Logout();
	}

	@Then("^Accept Alert TCD Approval$")
	public void Accept_Alert_TCD_Approval() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptTCD));
		// EIP_Menu.AcceptTCD.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.AcceptTCD);
		// Login_Steps.Logout();
	}

	@Then("^Select filter icon in TCD Approval$")
	public void Select_filter_icon_in_TCD_Approval() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.FilterTCD));
		EIP_Menu.FilterTCD.click();
	}

	@Then("^Select Advance Search TCD$")
	public void Select_Advance_Search_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AdvanceSearch));
		EIP_Menu.AdvanceSearch.click();
	}

	@Then("^Enter TCD No from DB$")
	public void Enter_TCD_No_from_DB() throws Throwable {

		DataBaseConnection.GetTCDFromDB();
	}

	@Then("^Enter TCD No from DB First Level$")
	public void Enter_TCD_No_from_DB_First_Level() throws Throwable {

		DataBaseConnection.GetTCDFromDBFirstLevel();
	}

	@Then("^Select Search icon in TCD$")
	public void Select_Search_icon_in_TCD() throws Throwable {
		EIP_Menu.TCDSearch.click();
	}
	
	@Then("^Select Search icon for Search RFQ in Advance Search$")
	public void Select_Search_icon_for_Search_RFQ_in_Advance_Search() throws Throwable {
		EIP_Menu.TCDSearch.click();
		
		System.out.println("Select Search icon for Search RFQ in Advance Search");
	}

	@Then("^Enter Vendor RFQ Create as (.*)$")
	public void Enter_Vendor(String Ven) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(Ven);

	}

	@Then("^Select Vendor RFQ Create$")
	public void Select_Vendor() throws Throwable {
		EIP_Menu.SelectVendor.click();
	}

	@Then("^Select Add Vendor Icon RFQ Create$")
	public void Select_Add_Vendor_Icon() throws Throwable {
		EIP_Menu.SelectAddVendorIcon.click();
	}

	@Then("^Select Auto BQ Required$")
	public void Select_Auto_BQ_Required() throws Throwable {
		EIP_Menu.AutoBQRequired.click();
	}

	@Then("^Select Next Icon Vendor$")
	public void Select_Next_Icon_Vendor() throws Throwable {
		EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);

	}

	@Then("^Enter Release Payment Terms as (.*)$")
	public void Enter_Release_Payment_Terms(String Release) throws Throwable {
		// EIP_Menu.EnterReleasePaymentTerms.click()
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		EIP_Menu.EnterReleasePaymentTerms.clear();
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(Release);

	}

	@Then("^Select Event Payment Terms RFQ Create as (.*)$")
	public void Select_Event_Payment_Terms(String Event) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectEventPaymentTerms));
		EIP_Menu.SelectEventPaymentTerms.click();

		List<WebElement> selectEP = EIP_Menu.paymentlist;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(Event)) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	@Then("^Select Event Payment Terms RFQ Create Service$")
	public void Select_Event_Payment_Terms_Service() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectEventPaymentTerms));
		EIP_Menu.SelectEventPaymentTerms.click();
		EIP_Menu.SelectEventPaymentTerms.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Reference Value Payment Terms RFQ Create as (.*)$")
	public void Select_Reference_Value_Payment_Terms(String ReferenceValue) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceValuePaymentTerms));
		EIP_Menu.SelectReferenceValuePaymentTerms.click();
		List<WebElement> selectRV = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRV) {
			if (webElement.getText().equals(ReferenceValue)) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	@Then("^Select Reference Value Payment Terms RFQ Create Service$")
	public void Select_Reference_Value_Payment_Terms_Service() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceValuePaymentTerms));
		EIP_Menu.SelectReferenceValuePaymentTerms.click();
		EIP_Menu.SelectReferenceValuePaymentTerms.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Credit Days Payment Terms as (.*)$")
	public void Select_Credit_Days_Payment_Terms(String CreditDays) throws Throwable {

		EIP_Menu.SelectCreditDaysPaymentTerms.sendKeys(CreditDays, Keys.TAB);
	}

	@Then("^Select Payment Mode Payment Terms as (.*)$")
	public void Select_Payment_Mode_Payment_Terms(String PaymentMode) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPaymentModePaymentTerms));
		EIP_Menu.SelectPaymentModePaymentTerms.click();
		List<WebElement> selectPM = EIP_Menu.paymentlist;
		for (WebElement webElement : selectPM) {
			if (webElement.getText().equals(PaymentMode)) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	@Then("^Select Reference Date Payment Terms as (.*)$")
	public void Select_Reference_Date_Payment_Terms(String ReferenceDate) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceDatePaymentTerms));
		EIP_Menu.SelectReferenceDatePaymentTerms.click();

		List<WebElement> selectRD = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRD) {
			if (webElement.getText().equals(ReferenceDate)) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	@Then("^Select Document Payment Terms$")
	public void Select_Document_Payment_Terms() throws Throwable {
		EIP_Menu.Doc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Document Payment Terms Auction$")
	public void Select_Document_Payment_Terms_Auction() throws Throwable {
		EIP_Menu.AucDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Document Payment Terms Reverse Auction$")
	public void Select_Document_Payment_Terms_Reverse_Auction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucRevDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		Thread.sleep(500);
		EIP_Menu.SelectDocumentPaymentTerms.click();
		
		System.out.println("Select Document Payment Terms Reverse Auction");
	}

	@Then("^Select Document Payment Terms Multi Reverse Auction$")
	public void Select_Document_Payment_Terms_Multi_Reverse_Auction() throws Throwable {
		EIP_Menu.AucRevMulRDDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Document Payment Terms Reverse Rate Discovery Auction$")
	public void Select_Document_Payment_Terms_Reverse_Rate_Discovery_Auction() throws Throwable {
		EIP_Menu.AucRevRDDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Document Payment Terms Reverse Purchase Request Auction$")
	public void Select_Document_Payment_Terms_Reverse_Purchase_Request_Auction() throws Throwable {
		EIP_Menu.AucRevPRDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Document Payment Terms Reverse Purchase Request Multi Vendor Auction$")
	public void Select_Document_Payment_Terms_Reverse_Purchase_Request_Multi_Vendor_Auction() throws Throwable {
		EIP_Menu.PRPaymentDocument.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Service Document Payment Terms$")
	public void Select_Service_Document_Payment_Terms() throws Throwable {
		EIP_Menu.SRDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Service Document Payment Terms RD$")
	public void Select_Service_Document_Payment_Terms_RD() throws Throwable {
		EIP_Menu.SRRDDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
	}

	@Then("^Select Rate Discovery Document Payment Terms$")
	public void Select_Rate_Discovery_Document_Payment_Terms() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.RDDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
		System.out.println("Select Rate Discovery Document Payment Terms");
	}

	@Then("^Select Rate Discovery Document Payment Terms for multi material$")
	public void Select_Rate_Discovery_Document_Payment_Terms_for_multi_material() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.RDDocMultiMate.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
		System.out.println("Select Rate Discovery Document Payment Terms for multi material");
	}

	@Then("^Click Conform Payment Terms$")
	public void Click_And_Conform_Payment_Terms() throws Throwable {
		EIP_Menu.ClickAndConform.click();
	}

	@Then("^Select Next Icon Payment Terms$")
	public void Select_Next_Icon_Payment_Terms() throws Throwable {
		EIP_Menu.SelectNextIconPaymentTerms.click();
	}

	@Then("^Select Additional Details in Other Terms$")
	public void Select_Additional_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAdditionalDetails));
		EIP_Menu.SelectAdditionalDetails.click();
	}

	@Then("^Select Additional Details Service in Other Terms$")
	public void Select_Additional_Details_Service() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAdditionalDetailsSR));
		EIP_Menu.SelectAdditionalDetailsSR.click();
	}

	@Then("^Select Shipment Details in Additional Details$")
	public void Select_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShipmentDetails));
		EIP_Menu.SelectShipmentDetails.click();
	}

	@Then("^Select Billing To Shipment Details$")
	public void Select_Billing_To_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectBillingToShipmentDetails));
		EIP_Menu.SelectBillingToShipmentDetails.click();
		EIP_Menu.SelectBillingToShipmentDetails.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Shipping To Shipment Details$")
	public void Select_shipping_To_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShippingToShipmentDetails));
		EIP_Menu.SelectShippingToShipmentDetails.click();
		EIP_Menu.SelectShippingToShipmentDetails.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Click Trade Details in Other Terms$")
	public void Click_Trade_Details() throws Throwable {
		EIP_Menu.TradeDetails.click();
	}

	@Then("^Click Trade Terms in Other Terms$")
	public void Click_Trade_Terms() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TradeTerms));
		EIP_Menu.TradeTerms.click();
	}

	@Then("^Select Trade Terms in Other Terms$")
	public void Select_Trade_Terms() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTradeTerms));
		EIP_Menu.SelectTradeTerms.click();
	}

	@Then("^Select Request Essentials Menu BQ$")
	public void Select_Request_Essentials_Menu_BQ() throws Throwable {
		EIP_Menu.RequestEssentialsMenu.click();
	}

	@Then("^Select Request Essentials Menu$")
	public void Select_Request_Essentials_Menu() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		/*
		 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		 * js.executeScript("arguments[0].click()", EIP_Menu.RequestEssentialsMenuRFQ);
		 */
	}

	@Then("^Click Order Expiry Date$")
	public void Order_Expiry_Date() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();
	}

	@Then("^Click Last Shipment Details$")
	public void Click_Last_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.LastShipmentDetails));
		EIP_Menu.LastShipmentDetails.click();
	}

	@Then("^Select Last Shipment Details$")
	public void Select_Last_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectLastShipmentDetails));
		EIP_Menu.SelectLastShipmentDetails.click();
	}

	@Then("^Select RFQ Order Expiry Date$")
	public void Select_RFQ_Order_Expiry_Date() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
		// EIP_Menu.RFQOrderExpiryDate.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
	}

	@Then("^Select Save icon$")
	public void Select_Save_Icon() throws Throwable {

		// EIP_Menu.SaveDraft.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN,
		// Keys.DOWN, Keys.DOWN);
		// Thread.sleep(500);
		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		 * js.executeScript("arguments[0].click()", EIP_Menu.OTSave);
		 */
	}

	@Then("^Select Save icon in Shipment Details$")
	public void Select_Save_icon_in_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveSD));
		EIP_Menu.SaveSD.click();
	}

	@Then("^Select Save icon in Shipment Details BQ$")
	public void Select_Save_icon_in_Shipment_Details_BQ() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveSD));
		Thread.sleep(1000);
		EIP_Menu.OTSave.click();

		System.out.println("Select Save icon in Shipment Details BQ Shipment Details");
	}

	@Then("^Select Attach General Terms Conditions$")
	public void Select_Attach_General_Terms_Conditions() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AttachGeneralTerms));
		Thread.sleep(500);
		EIP_Menu.AttachGeneralTerms.click();
	}

	@Then("^Select Save icon in BQ$")
	public void Select_Save_icon_in_BQ() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OTSave));

		// wait.until(ExpectedConditions.textToBePresentInElement(EIP_Menu.EnterReleasePaymentTerms,
		// "100.00"));
		// ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
		// EIP_Menu.OTSave);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		 * js.executeScript("arguments[0].click()", EIP_Menu.OTSave);
		 */

		EIP_Menu.OTSave.click();
	}

	@Then("^Select TC Save icon$")
	public void Select_TC_Save_Icon() throws Throwable {
		// EIP_Menu.TCSave.click();
		Thread.sleep(900);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCSave));

		try {
			EIP_Menu.TCSave.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCSave);

		}

		System.out.println("Select " + EIP_Menu.TCSave.getText() + "Button in Trade Details");
	}

	@Then("^Select Submit Icon$")
	public void Select_Submit_Icon() throws Throwable {
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.RFQSubmit);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));

		Thread.sleep(5000);
		// EIP_Menu.Submit.sendKeys(Keys.TAB, Keys.ENTER);

		try {
			EIP_Menu.RFQSubmit.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RFQSubmit);

		}
		System.out.println("Select Submit Icon in RFQ BQ");

	}

	@Then("^Select RFQ Submit Icon$")
	public void Select_RFQ_Submit_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		EIP_Menu.RFQSubmit.click();

	}

	@Then("^Select RFQ Bidders Quote in Search Menu$")
	public void Select_RFQ_Bidders_Quote() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectRFQBQ));
		EIP_Menu.SelectRFQBQ.click();
	}

	@Then("^Page Down RFQ Bidders Quote$")
	public void Page_Down_RFQ_Bidders_Quote() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledge);
	}

	@Then("^Enter HSN in Creation Bidders Quote$")
	public void Enter_HSN_in_Creation_Bidders_Quote_as() throws Throwable {

		Thread.sleep(3000);
		System.out.println("Before HSN in Creation Bidders Quote Click");
		EIP_Menu.BQCHSN.click();

		List<WebElement> selectBQHSN = EIP_Menu.BQHSNlist;
		// System.out.println("after hsn click");
		Thread.sleep(3000);
		for (WebElement webElement : selectBQHSN) {
			System.out.println("HSN Number = " + webElement.getText().substring(0, 8));
			if (webElement.getText().substring(0, 8).equals(ConfigFileReader.getBQHSN())) {
				webElement.click();

				break;

			}
			System.out.println("After HSN in Creation Bidders Quote Click");

		}

	}

	@Then("^Enter Multi HSN in Creation Bidders Quote$")
	public void Enter_Multi_HSN_in_Creation_Bidders_Quote_as() throws Throwable {

		Thread.sleep(3000);
		System.out.println("Before HSN in Creation Bidders Quote Click");
		EIP_Menu.BQCHSN.click();

		List<WebElement> selectBQHSN = EIP_Menu.BQHSNlist;
		// System.out.println("after hsn click");
		Thread.sleep(3000);
		for (WebElement webElement : selectBQHSN) {
			System.out.println("HSN Number = " + webElement.getText().substring(0, 8));
			if (webElement.getText().substring(0, 8).equals(ConfigFileReader.getBQHSN())) {
				webElement.click();

				break;

			}
			System.out.println("After HSN in Creation Bidders Quote Click");

		}

	}

	@Then("^Select Filter icon$")
	public void Select_Filter_icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AuctionFilterCom));
		Thread.sleep(6500);

		try {
			js.executeScript("arguments[0].click();", EIP_Menu.AuctionFilterCom);

		} catch (Exception e) {

			EIP_Menu.AuctionFilterCom.click();
		}

		System.out.println("Select Filter icon in RFQ Home Page");
	}

	@Then("^Enter Domestic Job RFQ No from DB TCC$")
	public void Enter_Domestic_Job_Doc_No_from_DB_TCC() throws Throwable {
		Thread.sleep(3500);
		DataBaseConnection.EnterDomesticJobRFQFromDBTCC();
		System.out.println("Enter Domestic Job RFQ No from DB TCC");
	}

	@Then("^Enter TAN Request Essentials$")
	public void Enter_TAN_Request_Essentials() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.TAN.click();
		System.out.println("Select TAN Request Essentials");
		Thread.sleep(500);
		EIP_Menu.TAN.sendKeys(ConfigFileReader.getTAN());

		System.out.println("Enter TAN Request Essentials");
	}

	@Then("^Enter Rate in Material Details$")
	public void Enter_Rate() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Rate));

		Thread.sleep(2000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.OthercostBQ);
		Thread.sleep(4000);
		 EIP_Menu.Rate.click();

		/*try {
			EIP_Menu.Rate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Rate);

		}*/

		System.out.println("Select Rate in Material Details");

		Thread.sleep(3000);
		EIP_Menu.Rate.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.Rate.sendKeys(ConfigFileReader.getRate());
		System.out.println("Enter Rate in Material Details");

		// EIP_Menu.Rate.clear();
		/*
		 * Actions actions = new Actions(Webdriver.driver);
		 * actions.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
		 * actions.perform();
		 */

	}

	@Then("^Enter Multi Rate in Material Details$")
	public void Enter_Multi_Rate_in_Material_Details() throws Throwable {

		Thread.sleep(4000);

		try {
			EIP_Menu.Rate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Rate);

		}

		System.out.println("Select Rate in Material Details");

		Thread.sleep(3000);
		EIP_Menu.Rate.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.Rate.sendKeys(ConfigFileReader.getRate());
		System.out.println("Enter Rate in Material Details");

		Thread.sleep(4000);

		try {
			EIP_Menu.Rate1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Rate1);

		}

		System.out.println("Select 1 Rate in Material Details");

		Thread.sleep(3000);
		EIP_Menu.Rate1.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.Rate1.sendKeys(ConfigFileReader.getRate());
		System.out.println("Enter Rate in Material Details");

		Thread.sleep(4000);

		try {
			EIP_Menu.Rate2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Rate2);

		}

		System.out.println("Select Rate in Material Details");

		Thread.sleep(3000);
		EIP_Menu.Rate2.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.Rate2.sendKeys(ConfigFileReader.getRate());
		System.out.println("Enter Rate in Material Details");

		Thread.sleep(4000);

		try {
			EIP_Menu.Rate3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Rate3);

		}

		System.out.println("Select Rate in Material Details");

		Thread.sleep(3000);
		EIP_Menu.Rate3.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.Rate3.sendKeys(ConfigFileReader.getRate());
		System.out.println("Enter Rate in Material Details");

	}

	@Then("^Edit RFQ Number$")
	public void Edit_RFQ_Number() throws Throwable {
		Thread.sleep(700);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.RFQNumber);

		Thread.sleep(2000);

		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.RFQNumber);
		Thread.sleep(3000);
		actions.perform();

		EIP_Menu.RFQEdit.click();

		System.out.println("Select Edit button in For Auction Page");
		Thread.sleep(7000);

		try {
			EIP_Menu.SelectNextIconPaymentTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIconPaymentTerms);

			System.out.println("Select Advance Search in RFQ BQ");

		}

		System.out.println("Select Next button in RFQ Edit Page");
		Thread.sleep(1000);
		// EIP_Menu.AlertOk.click();
		Commoncontrol.eAuctionAlert();

		System.out.println("Accept Alert in RFQ Edit Add RFQ Values Page");
	}

	@Then("^Page Down RFQ Bidders Quote SD$")
	public void Page_Down_RFQ_Bidders_Quote_SD() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);

		System.out.println("Page Down RFQ Bidders Quote");
	}

	@Then("^Page Down RFQ Bidders Quote Multi Material$")
	public void Page_Down_RFQ_Bidders_Quote_Multi_Material() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.SaveDraft);

		System.out.println("Page Down RFQ Bidders Quote Multi Material");
	}

	@Then("^Page Down RFQ Bidders Quote InProgress$")
	public void Page_Down_RFQ_Bidders_Quote_InProgress() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.Submit);

		System.out.println("Page Down RFQ Bidders Quote InProgress");
	}

	@Then("^Page Down RFQ Bidders Quote Shipment Details$")
	public void Page_Down_RFQ_Bidders_Quote_Shipment_Details() throws Throwable {
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.RequestEssentialsMenu);
	}

	@Then("^Select Other Cost in RFQ BQ Additional Details$")
	public void Select_Other_Cost_in_RFQ_BQ_Additional_Details() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.OtherCostBQ.click();
		System.out.println("Select Other Cost in RFQ BQ Additional Details");
	}

	@Then("^Select Category Other Cost in RFQ BQ Other Cost Details$")
	public void Select_Category_Other_Cost_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.OtherCostCategory.click();
		System.out.println("Select Category Other Cost in RFQ BQ Other Cost Details");
	}

	@Then("^Select Category From the list Other Cost in RFQ BQ Other Cost Details$")
	public void Select_Category_From_the_list_Other_Cost_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(2500);

		List<WebElement> selectEP = EIP_Menu.NCList;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getFreightCharges_BQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
			System.out.println("Select Category From the list Other Cost in RFQ BQ Other Cost Details");
		}
	}

	@Then("^Select Other Cost Option in RFQ BQ Other Cost Details$")
	public void Select_Other_Cost_Option_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.OtherCostOption.click();
		System.out.println("Click Other Cost Option in RFQ BQ Other Cost Details");
		Thread.sleep(3500);

		List<WebElement> selectEP = EIP_Menu.LdadList;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getOtherCostOption_BQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}

			System.out.println("Select Other Cost Option in RFQ BQ");
		}

	}

	@Then("^Select Lumpsum Other Cost Option in RFQ BQ Page$")
	public void Select_Lumpsum_Other_Cost_Option_in_RFQ_BQ_Page() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.OtherCostOption.click();
		Thread.sleep(3500);

		List<WebElement> selectEP = EIP_Menu.LdadList;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getOtherCostOptionLum_BQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
		}

	}

	@Then("^Enter Unit Value Other Cost in RFQ BQ Other Cost Details$")
	public void Enter_Unit_Value_Other_Cost_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.UnitValue.sendKeys(ConfigFileReader.getUnitValuePercentage_BQ());
		System.out.println("Enter Unit Value Other Cost in RFQ BQ Other Cost Details");
	}

	@Then("^Enter Unit Value Lumpsum Other Cost in RFQ BQ Other Cost Details$")
	public void Enter_Unit_Value_Lumpsum_Other_Cost_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.UnitValue.sendKeys(ConfigFileReader.getUnitValueLumpsum_BQ());
		System.out.println("Enter Unit Value Lumpsum Other Cost in RFQ BQ Other Cost Details");
	}

	@Then("^Enter Unit Value Other Cost Lum in RFQ BQ Page$")
	public void Enter_Unit_Value_Other_Cost_Lum_in_RFQ_BQ_Page() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.UnitValue.sendKeys(ConfigFileReader.getUnitValuePercentage_BQ());
		System.out.println("Enter Unit Value Other Cost Lum in RFQ BQ Page");
	}

	@Then("^Enter Remarks Other Cost in RFQ BQ Other Cost Details$")
	public void Enter_Remarks_Other_Cost_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(2500);
		EIP_Menu.UnitValue.sendKeys(ConfigFileReader.getUnitValueRemarks_BQ());
		System.out.println("Enter Remarks Other Cost in RFQ BQ Other Cost Details");
	}

	@Then("^Select Post Other Cost in RFQ BQ Other Cost Details$")
	public void Select_Post_Other_Cost_in_RFQ_BQ_Other_Cost_Details() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.PostOthercostBQ.click();
		System.out.println("Select Post Other Cost in RFQ BQ Other Cost Details");
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
		System.out.println("Accept Alert after Select Post Other Cost in RFQ BQ Other Cost Details");
	}

	@Then("^Page Down RFQ Bidders Quote Request Essentials$")
	public void Page_Down_RFQ_Bidders_Quote_Request_Essentials() throws Throwable {
		Thread.sleep(1500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.RESave);
		

		System.out.println("Page Down RFQ Bidders Quote Request Essentials");
	}

	@Then("^Page Up RFQ Bidders Quote$")
	public void Page_Up_RFQ_Bidders_Quote() throws Throwable {
		Thread.sleep(1500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.Close);
		
		System.out.println("Page Up RFQ Bidders Quote");
	}

	@Then("^Select Show Advance Search$")
	public void Select_Show_Advance_Search() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AdvanceSearch));
		Thread.sleep(5000);

		// EIP_Menu.AdvanceSearch.click();

		/*try {
			js.executeScript("arguments[0].click();", EIP_Menu.AdvanceSearch);
			
		} catch (Exception e) {

			EIP_Menu.AdvanceSearch.click();
					}*/
		
		EIP_Menu.AdvanceSearch.click();
		
		System.out.println("Select Advance Search in RFQ BQ");

	}

	@Then("^Select InProgress Auction VB Page$")
	public void Select_InProgress_Auction_VB_Page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.InProgress.click();
	}

	@Then("^Select ReBid Auction VB Page$")
	public void Select_ReBid_Auction_VB_Page() throws Throwable {
		Thread.sleep(1500);
		// EIP_Menu.ReBidInd.click();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.SDPlaveBid);
		Thread.sleep(1500);
		try {
			EIP_Menu.ReBidInd.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBidInd);

		}
	}

	@Then("^Enter RFQ No from DB$")
	public void Enter_Doc_No_from_DB() throws Throwable {

		DataBaseConnection.EnterRFQFromDB();
	}

	@Then("^Enter RFQ No from DB in Refrence RFQ Field$")
	public void Enter_Doc_No_from_DB_in_Refrence_RFQ_Field() throws Throwable {
		Thread.sleep(500);
		DataBaseConnection.EnterRFQFromDBInRefrenceRFQ();

		Thread.sleep(1000);

		EIP_Menu.ReferenceRFQ.clear();

		Thread.sleep(2000);
		DataBaseConnection.EnterRFQFromDBInRefrenceRFQ();

	}

	@Then("^Select RFQ No from List in Refrence RFQ Field$")
	public void Select_Doc_No_from_List_in_Refrence_RFQ_Field() throws Throwable {

		Thread.sleep(500);

		try {
			EIP_Menu.SelectRFQRefrenceRFQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectRFQRefrenceRFQ);

		}
	}

	@Then("^Enter Domestic Job RFQ No from DB$")
	public void Enter_Domestic_Job_Doc_No_from_DB() throws Throwable {
		Thread.sleep(1000);
		DataBaseConnection.EnterDomesticJobRFQFromDB();
		System.out.println("Enter Domestic Job RFQ No from DB");
	}

	@Then("^Select Advance Search Icon in Home Page$")
	public void Select_Advance_Search_Icon_ine_Home_Page() throws Throwable {
		Thread.sleep(7000);

		try {
			EIP_Menu.AdvanceSearchHomePage.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AdvanceSearchHomePage);
		}

		System.out.println("Select Advance Search Icon in Home Page");
	}

	@Then("^Select RFQ Number for Edit$")
	public void Select_RFQ_Number_from_DB_for_Edit() throws Throwable {
		Thread.sleep(1500);

		try {
			EIP_Menu.EnterRFQNUmber.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.EnterRFQNUmber);

		}

		System.out.println("Select RFQ Number for Edit");
	}

	@Then("^Enter RFQ Number from DB for Edit$")
	public void Enter_RFQ_Number_from_DB_for_Edit() throws Throwable {
		Thread.sleep(1000);

		DataBaseConnection.EnterRFQFromDBEdit();
		System.out.println("Enter RFQ Number from DB for Edit");

	}

	@Then("^Enter Domestic Job Auction No from DB$")
	public void Enter_Domestic_Job_Auction_No_from_DB() throws Throwable {
		Thread.sleep(2500);
		DataBaseConnection.EnterAuctionNumber();
	}

	@Then("^Enter Reverse eAuction No from DB$")
	public void Enter_Reverse_eAuction_No_from_DB() throws Throwable {
		Commoncontrol.FilterAuctioncom();
		Thread.sleep(500);
		DataBaseConnection.EnterReverseAuctionNumber();
	}

	@Then("^Text Verification Before TCC$")
	public void Text_Verification_Before_TCC() throws Throwable {
		Thread.sleep(500);
		assertEquals("Completed", EIP_Menu.TCCText.getText());
		System.out.println("Before TCC = " + EIP_Menu.TCCText.getText());
	}

	@Then("^Text Verification After TCC$")
	public void Text_Verification_After_TCC() throws Throwable {
		Thread.sleep(500);
		assertEquals("Closed", EIP_Menu.TCCText.getText());
		System.out.println("After TCC = " + EIP_Menu.TCCText.getText());
	}
	
	@Then("^Select In Progress_Auction$")
	public void Select_In_Progress_Auction() throws Throwable {
		
	
	Thread.sleep(2000);
	
	try {
		EIP_Menu.Inpro.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.Inpro);

	}
	System.out.println("Select In Progress for Refresh");
	Thread.sleep(2000);
	}
	
	
	@Then("^Select Re Bid Auction$")
	public void Select_Re_Bid_Auction() throws Throwable {
	
	
	Thread.sleep(1500);

	// USe Old
	// EIP_Menu.SearchBQ.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);

	try {
		EIP_Menu.AdSearchBQ.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.AdSearchBQ);
	}
	
	ScrollUsingJaveScript(ReBidInd);
	
	ClickUsingTryCatch(ReBidInd);
	}
	
	
	

	@Then("^Auction Start Date update$")
	public void Auction_Start_Date_update() throws Throwable {
		Thread.sleep(1000);
		DataBaseConnection.UpdateStartDateAuction();

		Thread.sleep(2000);
		
		try {
			EIP_Menu.Inpro.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Inpro);

		}
		System.out.println("Select In Progress for Refresh");
		Thread.sleep(2000);
		
		try {
			EIP_Menu.foract.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.foract);

		}
		System.out.println("Select For Auction for Refresh");
	}

	@Then("^Enter Your Bid value in Reverse Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Auction() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReverseAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Auction() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_Auction() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor A Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_A_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorAAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor A Partial Bidding Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_A_Partial_Bidding_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorAPartialBiddingAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor B Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_B_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorBAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor B Partial Bidding Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_B_Partial_Bidding_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorBPartialBiddingAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor C Partial Bidding Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_C_Partial_Bidding_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorCPartialBiddingAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor D Partial Bidding Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_D_Partial_Bidding_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorDPartialBiddingAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor C Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_C_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorCAuction();
	}

	@Then("^Enter Your Bid value in Reverse Purchase Request Multi Material with Base Rate Vendor D Auction$")
	public void Enter_Your_Bid_value_in_Reverse_Purchase_Request_Multi_Material_with_Base_Rate_Vendor_D_Auction()
			throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforReversePRMultiMaterialwithBaseRateVendorDAuction();
	}

	@Then("^Enter Your Bid value in Rank Order Forward Auction$")
	public void Enter_Your_Bid_value_in_Rank_Order_Forward_Auction() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforROReAuction();
	}

	@Then("^Enter Your Bid value in Forward Auction$")
	public void Enter_Your_Bid_value_in_Forward_Auction() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforROReAuction();
	}

	@Then("^Enter Your Bid value Vendor A$")
	public void Enter_Your_Bid_value_Vendor_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforAVendoreAuction();
	}

	@Then("^Enter Your Bid value Post All Bids for Vendor A$")
	public void Enter_Your_Bid_value_Post_All_Bids_for_Vendor_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforAVendoreNoNBVAuction();
	}

	@Then("^Enter Your Bid value Vendor ROF A$")
	public void Enter_Your_Bid_value_Vendor_ROF_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforROFAVendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single A$")
	public void Enter_Your_Bid_value_Vendor_First_Single_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA1VendoreAuction();
		// Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Partial Bidding Vendor First Single A$")
	public void Enter_Your_Bid_value_Partial_Bidding_Vendor_First_Single_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA1VendoreNONBRAuction();
		// Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single ROF A$")
	public void Enter_Your_Bid_value_Vendor_First_Single_ROF_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA1ROFVendoreAuction();
		// Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single B$")
	public void Enter_Your_Bid_value_Vendor_First_Single_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforB1VendoreAuction();
		Commoncontrol.SendYourBidforB2VendoreAuction();
	}

	@Then("^Enter Your Bid value Partial Bidding Vendor First Single B$")
	public void Enter_Your_Bid_value_Partial_Bidding_Vendor_First_Single_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforB1VendorePBAuction();
		Commoncontrol.SendYourBidforB2VendorePBAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single ROF B$")
	public void Enter_Your_Bid_value_Vendor_First_Single_ROF_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforB1ROFVendoreAuction();
		Commoncontrol.SendYourBidforB2ROFVendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single C$")
	public void Enter_Your_Bid_value_Vendor_First_Single_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforC1VendoreAuction();
		Commoncontrol.SendYourBidforC2VendoreAuction();
	}

	@Then("^Enter Your Bid value Partial Bidding Vendor First Single C$")
	public void Enter_Your_Bid_value_Partial_Bidding_Vendor_First_Single_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforC1VendorePBAuction();
		Commoncontrol.SendYourBidforC2VendorePBAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single ROF C$")
	public void Enter_Your_Bid_value_Vendor_First_Single_ROF_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforC1ROFVendoreAuction();
		Commoncontrol.SendYourBidforC2ROFVendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single D$")
	public void Enter_Your_Bid_value_Vendor_First_Single_D() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforD1VendoreAuction();
		Commoncontrol.SendYourBidforD2VendoreAuction();
	}

	@Then("^Enter Your Bid value Partial Bidding Vendor First Single D$")
	public void Enter_Your_Bid_value_Partial_Bidding_Vendor_First_Single_D() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforD1VendorePBAuction();
		Commoncontrol.SendYourBidforD2VendorePBAuction();
	}

	@Then("^Enter Your Bid value Vendor First Single ROF D$")
	public void Enter_Your_Bid_value_Vendor_First_Single_ROF_D() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforD1ROFVendoreAuction();
		Commoncontrol.SendYourBidforD2ROFVendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor Second Single A$")
	public void Enter_Your_Bid_value_Vendor_Second_Single_A() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor Second Single B$")
	public void Enter_Your_Bid_value_Vendor_Second_Single_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor Second Single C$")
	public void Enter_Your_Bid_value_Vendor_Second_Single_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor Second Single D$")
	public void Enter_Your_Bid_value_Vendor_Second_Single_D() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforA2VendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor B$")
	public void Enter_Your_Bid_value_Vendor_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforBVendoreAuction();
	}

	@Then("^Enter Your Bid value Post All Bids for Vendor B$")
	public void Enter_Your_Bid_value_Post_All_Bids_for_Vendor_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforBVendoreNONBRAuction();
	}

	@Then("^Enter Your Bid value Vendor ROF B$")
	public void Enter_Your_Bid_value_Vendor_ROF_B() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforBROFVendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor C$")
	public void Enter_Your_Bid_value_Vendor_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforCVendoreAuction();
	}

	@Then("^Enter Your Bid value Post All Bids for Vendor C$")
	public void Enter_Your_Bid_value_Post_All_Bids_for_Vendor_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforCVendoreNONBRAuction();
	}

	@Then("^Enter Your Bid value Vendor ROF C$")
	public void Enter_Your_Bid_value_Vendor_ROF_C() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforCROFVendoreAuction();
	}

	@Then("^Enter Your Bid value Vendor D$")
	public void Enter_Your_Bid_value_Vendor_D() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforDVendoreAuction();
	}

	@Then("^Enter Your Bid value Post All Bids for Vendor D$")
	public void Enter_Your_Bid_value_Post_All_Bids_for_Vendor_D() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.SendYourBidforDVendoreNONBRAuction();
	}

	@Then("^Enter Your Bid value Vendor ROF D$")
	public void Enter_Your_Bid_value_Vendor_ROF_D() throws Throwable {
		Thread.sleep(1500);

		Commoncontrol.SendYourBidforDROFVendoreAuction();
	}

	@Then("^Auction End Date update$")
	public void Auction_End_Date_update() throws Throwable {
		Thread.sleep(3000);
		DataBaseConnection.UpdateEndDateAuction();
	}

	@Then("^Auction Final Result DB$")
	public void Auction_Final_Result_DB() throws Throwable {
		Thread.sleep(3000);
		Commoncontrol.AuctionFinalOutput();
	}

	@Then("^Enter PR number from DB for Auction$")
	public void Enter_PR_number_from_DB_for_Auction() throws Throwable {
		// Thread.sleep(500);

		Commoncontrol.eAuctionFilter();
	}

	@Then("^Bid Values Verification for Auction create$")
	public void Bid_Values_Verification_for_Auction_create() throws Throwable {
		Commoncontrol.BitValuesVerification();
	}

	@Then("^Enter Capital PR RFQ Number From DB$")
	public void Enter_Capital_PR_RFQ_Number_From_DB() throws Throwable {

		DataBaseConnection.EnterCapitalPRRFQNumberFromDB();
	}

	@Then("^Enter RFQ No from DB TCC$")
	public void Enter_Doc_No_from_DB_TCC() throws Throwable {

		DataBaseConnection.EnterRFQFromDBTCC();
	}
	
	
	@Then("^Enter RFQ No from DB For Auction RFQ Home Page$")
	public void Enter_Doc_No_from_DB_For_Auction_RFQ_Home_Page() throws Throwable {

		DataBaseConnection.EnterRFQFromDBTCC();
	}

	@Then("^Enter RFQ No from DB TCD AS$")
	public void Enter_Doc_No_from_DB_TCD_AS() throws Throwable {

		DataBaseConnection.EnterRFQNoTCDAS();
	}

	@Then("^Enter RFQ No from DB TCD$")
	public void Enter_Doc_No_from_DB_TCD() throws Throwable {

		DataBaseConnection.EnterRFQNoTCD();

		System.out.println("Enter RFQ No from DB to Create TCD");
	}

	@Then("^Select Buyer in Bidders Quote as (.*)$")
	public void Select_Buyer_in_Bidders_Quote(String Buyer) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchBQ));
		Thread.sleep(500);
		// EIP_Menu.SearchBQ.click();

		EIP_Menu.SearchBQ.click();
		Thread.sleep(3000);
		EIP_Menu.SearchBQ.sendKeys(Buyer, Keys.TAB);

	}

	@Then("^Select Search icon in Bidders Quote$")
	public void Select_Search_icon_in_Bidders_Quote() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ASearchBQ));
		// EIP_Menu.SearchBQ.click();
		Thread.sleep(2500);
		//EIP_Menu.ASearchBQ.click();
		
		try {
			EIP_Menu.ASearchBQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ASearchBQ);
		}
		/*
		 * Thread.sleep(2000); EIP_Menu.SearchBQ.sendKeys(Keys.TAB, Keys.TAB,
		 * Keys.ENTER);
		 */

		System.out.println("Select Search icon in Bidders Quote");

	}

	@Then("^Select Search icon in Bidders Quote TCC$")
	public void Select_Search_icon_in_Bidders_Quote_TCC() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchTCC));
		Thread.sleep(2000);
		EIP_Menu.SearchTCC.click();
	}

	@Then("^Select Advance Search icon in Bidders Quote TCD$")
	public void Select_Advance_Search_icon_in_Bidders_Quote_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ASearchTCD));
		Thread.sleep(2000);
		EIP_Menu.ASearchTCD.click();
	}

	@Then("^Select Acknowledge in Bidders Quote$")
	public void Select_Acknowledge() throws Throwable {
		Thread.sleep(500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Acknowledge));
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.SDPlaveBid);

		Thread.sleep(3500);

		try {
			EIP_Menu.Acknowledge.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Acknowledge);
		}

		System.out.println("Selected Acknowledge Button");
	}

	// EIP_Menu.Acknowledge.click();
	/*
	 * JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	 * js.executeScript("arguments[0].click()", EIP_Menu.Acknowledge); }
	 */

	@Then("^Select Place Bid in Bidders Quote$")
	public void Select_BQ_Place_Bid() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.BQPlaceBid));
		// EIP_Menu.BQPlaceBid.click();
		Thread.sleep(1500);

		// USe Old
		// EIP_Menu.SearchBQ.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);

		try {
			EIP_Menu.AdSearchBQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AdSearchBQ);
		}

		System.out.println("Select Search button in Advance Search");
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.BQPlaceBid);
		Thread.sleep(2500);
		System.out.println("Move down Advance Search");
		Thread.sleep(2500);

		
		
		try {
			EIP_Menu.BQPlaceBid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BQPlaceBid);
		}
		/*
		 * try { EIP_Menu.BQPlaceBid.click(); } catch (Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.BQPlaceBid);
		 */
		System.out.println("Select Place Bid in Bidders Quote");
	}

	// }

	@Then("^Select Nature code in Bidders Quote$")
	public void Select_BQ_Nature_code() throws Throwable {

		Thread.sleep(1000);

		try {
			EIP_Menu.Naturecode.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Naturecode);

		}
		Thread.sleep(500);
		List<WebElement> selectEP = EIP_Menu.NCList;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getNatureCode_Auction())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
		}

	}

	@Then("^Select Multi Nature code in Bidders Quote$")
	public void Select_Multi_Nature_code_in_Bidders_Quote() throws Throwable {
		Commoncontrol.MultiNatureCode();
	}

	@Then("^Select agree terms in Bidders Quote$")
	public void Select_agreeterms() throws Throwable {
		Thread.sleep(3000);
		//EIP_Menu.agreeterms.click();
		
		try {
			EIP_Menu.agreeterms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.agreeterms);

		}

		System.out.println("Select agree terms in Bidders Quote");
	}

	@Then("^Select Submit icon in Bidders Quote$")
	public void Select_Submit() throws Throwable {
		Thread.sleep(1000);
		//EIP_Menu.BQSubmit.click();
		
		try {
			EIP_Menu.BQSubmit.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BQSubmit);

		}

		System.out.println("Select Submit icon in Bidders Quote");
	}

	@Then("^Enter Rate in Material Details as (.*)$")
	public void Enter_Rate(String Rate) throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Rate));
		Thread.sleep(4000);
		// EIP_Menu.Rate.click();

		try {
			EIP_Menu.Rate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Rate);

		}

		System.out.println("");
		Thread.sleep(3000);
		EIP_Menu.Rate.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.Rate.sendKeys(Rate);
		// EIP_Menu.Rate.clear();
		/*
		 * Actions actions = new Actions(Webdriver.driver);
		 * actions.moveToElement(ObjectsReporsitory.statutoryDetails_Head);
		 * actions.perform();
		 */

	}

	@Then("^Enter Nature Code in Material Details$")
	public void Enter_Nature_Code() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.NatureCode));
		Thread.sleep(3000);
		EIP_Menu.NatureCode.click();
		Thread.sleep(3000);
		EIP_Menu.NatureCode.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Enter HSN in Creation Bidders Quote as (.*)$")
	public void Enter_HSN_in_Creation_Bidders_Quote_as(String BQHSN) throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectEventPaymentTerms));
		Thread.sleep(3000);
		System.out.println("Before click HSN in Creation Bidders Quote");
		EIP_Menu.BQCHSN.click();

		List<WebElement> selectBQHSN = EIP_Menu.BQHSNlist;
		// System.out.println("after hsn click");
		Thread.sleep(3000);
		for (WebElement webElement : selectBQHSN) {
			System.out.println("HSN Number = " + webElement.getText().substring(0, 8));
			if (webElement.getText().substring(0, 8).equals(BQHSN)) {
				webElement.click();
				// System.out.println(webElement.getText());

				break;

			}
			System.out.println("After click HSN in Creation Bidders Quote");

		}

	}
	// 04011000

	/*
	 * @Then("^Select Nature code in BQ)$") public void Select_Nature_code_in_BQ()
	 * throws Throwable {
	 * 
	 * Thread.sleep(500);
	 * 
	 * EIP_Menu.Naturecode.click(); Thread.sleep(300);
	 * EIP_Menu.NaturecodeBQ.click(); }
	 */
	@Then("^Nature code in Material Details BQ$")
	public void Nature_code_in_Material_Details_BQ() throws Throwable {
		Thread.sleep(2000);

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.movenc);

		System.out.println("Move to Nature code in Material Details BQ");

		Thread.sleep(1500);

		EIP_Menu.Naturecode.click();
		System.out.println("Click to Nature code in Material Details BQ");
		Thread.sleep(1300);
		EIP_Menu.NaturecodeBQ.click();
		System.out.println("Select to Nature code in Material Details BQ");
	}

	@Then("^Page down in Material Details BQ PT$")
	public void Page_down_in_Material_Details_BQ_PT() throws Throwable {
		Thread.sleep(2500);

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.BQSave);
		System.out.println("Page down");
		
		System.out.println("Page down in Material Details BQ PT");
//DownPaymentTerms
	}

	@Then("^Select Save draft in Material Details$")
	public void Select_Save_draft() throws Throwable {
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveDraft));
		EIP_Menu.SaveDraft.click();

		System.out.println("Select Save draft in Material Details");
	}

	@Then("^Select Save draft in Material Details BQ$")
	public void Select_Save_draft_in_Material_Details_BQ() throws Throwable {

		Thread.sleep(3000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.DownPaymentTerms);
		System.out.println("Move to Save Button");
		Thread.sleep(3000);
		//EIP_Menu.BQSave.click();
		
		try { 
			EIP_Menu.BQSave.click(); 
			} catch (Exception e) {
			 js.executeScript("arguments[0].click();", EIP_Menu.BQSave);
			  
			  }
		System.out.println("Select Save draft in Material Details BQ");
	}

	@Then("^Select Save icon in Payment Terms$")
	public void Select_Save_icon_in_Payment_Terms() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.BQSave.click();
		System.out.println("Select Save icon in Payment Terms");
	}

	@Then("^Select Techno Commercials in Creation Bidders Quote$")
	public void Select_Techno_Commercials() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TechnoCommercials));
		Thread.sleep(3000);
		// EIP_Menu.TechnoCommercials.click();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.TechnoCommercials);

		System.out.println("Move to Techno Commercials in Creation Bidders Quote");
		Thread.sleep(4000);
		EIP_Menu.TechnoCommercials.click();
		/*
		 * try { EIP_Menu.TechnoCommercials.click(); } catch (Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.TechnoCommercials);
		 * 
		 * }
		 */
		System.out.println("Select Techno Commercials in Creation Bidders Quote");
	}

	@Then("^Select Additional Details in Techno Commercials$")
	public void Select_Additional_Details_TC() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AdditionalDetails));
		Thread.sleep(1000);
		System.out.println("Before Select Additional Details in Techno Commercials");

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AdditionalDetails);

		Thread.sleep(3500);

		try {
			EIP_Menu.AdditionalDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AdditionalDetails);

			System.out.println("After Select Additional Details in Techno Commercials");
		}
	}

	@Then("^Select Save button in BQ Trade details Techno Commercials$")
	public void Select_Save_button_in_BQ_Trade_details_Techno_Commercials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TDSaveBQ));
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.TDSaveBQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TDSaveBQ);

		}
		
		System.out.println("Select Save button in BQ Trade details Techno Commercials");
	}

	@Then("^Select Save button in BQ Request Essentials Techno Commercials$")
	public void Select_Save_button_in_BQ_Request_Essentials_Techno_Commercials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RESaveBQ));
		Thread.sleep(3000);
		
		
		try {
			EIP_Menu.RESaveBQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RESaveBQ);

		}
		
		System.out.println("Select Save button in BQ Request Essentials Techno Commercials");
	}

	@Then("^Select Save button in BQ Shipment Details Techno Commercials$")
	public void Select_Save_button_in_BQ_Shipment_Details_Techno_Commercials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SMSaveBQ));
		Thread.sleep(3000);
		
		
		try {
			EIP_Menu.SMSaveBQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SMSaveBQ);

		}
		
		System.out.println("Select Save button in BQ Shipment Details Techno Commercials");
	}

	@Then("^Select Bill From in Shipment Details$")
	public void Select_Bill_From() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.BillFrom));

		Thread.sleep(1000);
		
		try {
			EIP_Menu.BillFrom.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BillFrom);

		}

		System.out.println("Select Bill From in Shipment Details");

		Thread.sleep(1000);
		EIP_Menu.ListBillingToShipmentDetailsRD.click();
		System.out.println("Select Bill From in Shipment Details List");
	}

	@Then("^Select Bill From in Vendors Shipment Details$")
	public void Select_Bill_From_in_Vendors_Shipment_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.BillFrom));
		// Thread.sleep(500);
		// EIP_Menu.BillFromClear.click();
		Thread.sleep(1000);
		EIP_Menu.BillFrom.click();
		Thread.sleep(1000);
		EIP_Menu.ListBillingToShipmentDetailsRD.click();
	}
	
	

	@Then("^Select GST Register No in Shipment Details$")
	public void Select_GST_Register_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.GSTRegisterNo));
		Thread.sleep(500);
		EIP_Menu.GSTRegisterNo.click();
		System.out.println("Click GST Register No in Shipment Details");
		Thread.sleep(3000);
		EIP_Menu.GSTRegisterNo.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		System.out.println("Select GST Register No in Shipment Details");

	}

	@Then("^Select Close in Creation Bidders Quote$")
	public void Select_Close_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Close));
		// EIP_Menu.Close.click();
		Thread.sleep(3000);
		Login_Steps.Logout();
		System.out.println("Select Close in Creation Bidders Quote");

	}

	@Then("^Select Close in Creation Bidders Quote For Auction$")
	public void Select_Close_in_Creation_Bidders_Quote_For_Auction() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Close));
		Thread.sleep(3000);
		
		try {
			EIP_Menu.Close.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Close);

		}
		System.out.println("Select Close in Creation Bidders Quote For Auction");
		// Login_Steps.Logout();

	}

	@Then("^Select Close in Creation Bidders Quote For Reverse Auction$")
	public void Select_Close_in_Creation_Bidders_Quote_For_Reverse_Auction() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AuctionClose));
		System.out.println("Before Bid Closed");
		Thread.sleep(2000);
		
		ScrollUsingJaveScript(AuctionClose);
		Thread.sleep(1000);

				EIP_Menu.AuctionClose.click();
		//ClickUsingJSTryCatch(AuctionClose);

		System.out.println("Bid Closed");
		// Login_Steps.Logout();

	}

	@Then("^Select In Progress in Bidders Quote$")
	public void Select_In_Progress() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.InProgress));
		Thread.sleep(2500);
		EIP_Menu.InProgress.click();

		System.out.println("Select In Progress in Bidders Quote");

	}

	@Then("^Select Request Essentials in Techno Commercials$")
	public void Select_Request_Essentials() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.RequestEssentials.click();

	}

	@Then("^Click Trade Details in Techno Commercials$")
	public void Click_Trade_Details_Techno_Commercials() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.TCTradeDetails.click();
		System.out.println("Click Trade Details in Techno Commercials");
	}

	@Then("^Select Yes in Import Purchase$")
	public void Select_Yes_in_Import_Purchase() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.ImportPurchase.click();
	}

	@Then("^Click Trade Terms in Techno Commercials$")
	public void Click_Trade_Terms_Techno_Commercials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCTradeTerms));
		Thread.sleep(500);
		EIP_Menu.TCTradeTerms.click();
	}

	@Then("^Click Trade Terms in Auction Techno Commercials$")
	public void Click_Trade_Terms_Auction_Techno_Commercials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AuctionTradeTerms));
		Thread.sleep(500);
		EIP_Menu.AuctionTradeTerms.click();
	}

	@Then("^Click Trade Terms in Techno Commercials FJ$")
	public void Click_Trade_Terms_Techno_Commercials_FJ() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCTradeTerms));
		Thread.sleep(3000);
		EIP_Menu.TCTradeTerms.click();
		Thread.sleep(3000);
		EIP_Menu.TCTradeTerms.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Tentative Loading Port$")
	public void Select_Tentative_Loading_Port() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TentativeLoadingPort));
		Thread.sleep(3000);
		EIP_Menu.TentativeLoadingPort.click();
		// Thread.sleep(300);
		Thread.sleep(3000);
		EIP_Menu.TentativeLoadingPort.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Discharge Port$")
	public void Select_Discharge_Port() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DischargePort));
		Thread.sleep(3000);
		EIP_Menu.DischargePort.click();
		Thread.sleep(3000);
		// Thread.sleep(300);
		EIP_Menu.DischargePort.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Click Request Essentials in Techno Commercials$")
	public void Click_Request_Essentials_Techno_Commercials() throws Throwable {
		Thread.sleep(3000);
		
		
		try {
			EIP_Menu.RequestEssentials.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RequestEssentials);

		}

		System.out.println("Click Request Essentials in Techno Commercials");
	}

	@Then("^Page down in Techno Commercials$")
	public void Page_down_in_Techno_Commercials() throws Throwable {
		// Thread.sleep(500);
		Thread.sleep(3000);

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.RequestEssentials);

	}

	@Then("^Enter TAN Request Essentials as (.*)$")
	public void Enter_TAN_Request_Essentials(String TAN) throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.TAN.sendKeys(TAN);
		
		System.out.println("Enter TAN Request Essentials");

	}
	
	@Then("^Enter TAN Request Essentials Auction$")
	public void Enter_TAN_Request_Essentials_Auction() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.TAN.sendKeys(ConfigFileReader.getTAN_VBAuction());
		
		System.out.println("Enter TAN Request Essentials");

	}

	@Then("^Click Save in  Request Essentials$")
	public void Click_Save_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RESave));
		Thread.sleep(3000);
		EIP_Menu.RESave.click();

		System.out.println("Click Save in  Request Essentials");
	}

	@Then("^Select Trade Terms in Additional Details$")
	public void Select_Trade_Terms_AD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTradeTerms));
		Thread.sleep(500);
		EIP_Menu.SelectTradeTerms.click();
	}

	@Then("^Select Auction Trade Terms in Additional Details$")
	public void Select_Auction_Trade_Terms_in_Additional_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAuctionTradeTerms));
		Thread.sleep(500);
		// EIP_Menu.SelectAuctionTradeTerms.click();
	}

	@Then("^Select TCClose in Creation Bidders Quote$")
	public void Select_TCClose_Icon() throws Throwable {
		Thread.sleep(3500);
		EIP_Menu.TCClose.click();

		System.out.println("Select Close in Creation Bidders Quote");

	}

	@Then("^Mouseover in RFQ Numner$")
	public void Mouseover_RFQ_Numner() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQ));
		Thread.sleep(3000);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.RFQ);
		Thread.sleep(3000);
		actions.perform();

	}

	@Then("^Select Edit icon in For Auction Saved RFQ Number at TCD$")
	public void Select_Edit_icon_in_For_Auction_Saved_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AfSDTCD));
		Thread.sleep(2500);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.AfSDTCD);
		Thread.sleep(3000);
		actions.perform();
		System.out.println("Mouseover in Saved RFQ");
		
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.EditTCD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.EditTCD);

		}
		
		System.out.println("Select Edit icon in Saved RFQ Number");

	}
	
	@Then("^Mouseover in RFQ Numner TCC$")
	public void Mouseover_RFQ_Numner_TCC() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQTCC));
		Thread.sleep(2500);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.RFQTCC);
		Thread.sleep(3000);
		actions.perform();
		System.out.println("Mouseover in RFQ Numner TCC");

	}
	
	
	

	@Then("^Mouseover TCD Numner in Approval$")
	public void Mouseover_TCD_Numner_in_Approval() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DocNo));
		Thread.sleep(500);
		Actions actions = new Actions(Webdriver.driver);
		Thread.sleep(3000);
		actions.moveToElement(EIP_Menu.DocNo);
		actions.perform();

	}

	@Then("^Select Approval Icon in TCD$")
	public void Select_Approval_Icon_in_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Approve));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.Approve);

	}

	@Then("^Mouseover in TCD Numner$")
	public void Mouseover_TCD_Numner() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCD));
		Thread.sleep(3000);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.TCD);
		Thread.sleep(500);
		actions.perform();

		System.out.println("Mouseover in TCD Numner to Select TCD Create Icon");

	}

	@Then("^Mouseover TCD Numner in Approval_Level$")
	public void Mouseover_TCD_Numner_in_Approval_First() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCD));
		Thread.sleep(3000);
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.TCD);
		Thread.sleep(3000);
		actions.perform();

	}

	@Then("^Select Comparison in Request For Quote$")
	public void Select_Comparison_Icon() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Comparison));
		// EIP_Menu.TCCStatus.getText();
		//System.out.println("RFQ TCC Status = " + EIP_Menu.TCCStatus.getText());

		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.Comparison.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Comparison);

		}

		System.out.println("Select Comparison in Request For Quote");

	}

	@Then("^Verify the Status after close the TCC in Request For Quote$")
	public void Verify_the_Status_after_close_the_TCC_in_Request_For_Quote() throws Throwable {

		Thread.sleep(3500);
		System.out.println("RFQ TCC Status = " + EIP_Menu.TCCStatusAC.getText());

	}

	@Then("^Select TCC Close in Techno Commercial Comparison$")
	public void Select_TCC_Close_Icon() throws Throwable {
		
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.TCCClose);
		
		Thread.sleep(5000);
		
		
		try {
			EIP_Menu.TCCClose.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCCClose);

		}
		
		System.out.println("Select the TCC Close");
		// EIP_Menu.TCCStatus.getText();

	}

	@Then("^Select Rate Discovery in Create RFQ$")
	public void Select_Rate_Discovery() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RateDiscovery));
		Thread.sleep(3000);
		EIP_Menu.RateDiscovery.click();

	}

	@Then("^Select Choose Material in Create RFQ$")
	public void Select_Choose_Material() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ChooseMaterial));
		Thread.sleep(3000);
		EIP_Menu.ChooseMaterial.click();

	}

	@Then("^Enter Material Category in Material Cart as (.*)$")
	public void Enter_Material_Category(String MaterialCategory) throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.MaterialCategory.sendKeys(MaterialCategory);
	}

	@Then("^Enter Service Category in Material Cart as (.*)$")
	public void Enter_Service_Category(String MaterialCategory) throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.ServiceCategory.sendKeys(MaterialCategory);
	}

	@Then("^Select Material Category in Material Cart$")
	public void Select_Material_Category() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectMaterialCategory));
		Thread.sleep(3000);
		EIP_Menu.SelectMaterialCategory.click();

	}

	@Then("^Select Material Group in Material Cart$")
	public void Select_Material_Group() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.MaterialGroup.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.MaterialGroup));
		Thread.sleep(3000);
		EIP_Menu.MaterialGroup.click();

	}

	@Then("^Select Service Group in Material Cart$")
	public void Select_Service_Group() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.ServiceGroup.click();
	}

	@Then("^Select Material Group From List in Material Cart$")
	public void Select_Material_Group_List() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectMaterialGroup));
		Thread.sleep(3000);
		EIP_Menu.SelectMaterialGroup.click();

	}

	@Then("^Select Material Group I From List in Material Cart$")
	public void Select_Refer_List() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Refer));
		Thread.sleep(3000);
		EIP_Menu.Refer.click();

	}

	@Then("^Enter Choose Items in Material Cart as (.*)$")
	public void Enter_Choose_Items(String ChooseItems) throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.ChooseItems.sendKeys(ChooseItems);
	}

	@Then("^Select Item in Cart$")
	public void Select_Item_Cart() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectItems));
		Thread.sleep(3000);
		EIP_Menu.SelectItems.click();

	}

	@Then("^Select Items in Cart$")
	public void Select_Item_II_Cart() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectItemss));
		Thread.sleep(3000);
		EIP_Menu.SelectItemss.click();

	}

	@Then("^Select Move To Choose Items in Cart$")
	public void Select_Move_To_Choose() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.MoveToSelectedItems));
		Thread.sleep(3000);
		EIP_Menu.MoveToSelectedItems.click();

	}

	@Then("^Select Post Icon in Cart$")
	public void Select_Post_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Post));
		Thread.sleep(3000);
		EIP_Menu.Post.click();

	}

	@Then("^Select SR Post Icon in Cart$")
	public void Select_SR_Post_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRPost));
		Thread.sleep(3000);
		EIP_Menu.SRPost.click();

	}

	@Then("^Select Next Icon in Cart$")
	public void Select_Next_Icon_Cart() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Next));
		Thread.sleep(3000);
		EIP_Menu.Next.click();

	}

	@Then("^Enter Quantity in Create RFQ as (.*)$")
	public void Enter_Quantity_Cr_RFQ(String Quantity) throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.Quantity.clear();
		// EIP_Menu.Quantity.sendKeys(Keys.DELETE ,Keys.DELETE,Keys.DELETE,Keys.DELETE
		// );
		Thread.sleep(3000);
		EIP_Menu.Quantity.sendKeys(Quantity);
	}

	@Then("^Enter Service Quantity in Create RFQ as (.*)$")
	public void Enter_Service_Quantity_Cr_RFQ(String Quantity) throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.SRQuantity.clear();
		// EIP_Menu.Quantity.sendKeys(Keys.DELETE ,Keys.DELETE,Keys.DELETE,Keys.DELETE
		// );
		Thread.sleep(3000);
		EIP_Menu.SRQuantity.sendKeys(Quantity);
	}

	@Then("^Enter Sugg Rate in Create RFQ as (.*)$")
	public void Enter_SuggRate_Cr_RFQ(String SuggRate) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SuggRate));
		Thread.sleep(3000);
		EIP_Menu.SuggRate.clear();
		// EIP_Menu.Quantity.sendKeys(Keys.DELETE ,Keys.DELETE,Keys.DELETE,Keys.DELETE
		// );
		Thread.sleep(3000);
		EIP_Menu.SuggRate.sendKeys(SuggRate);
	}

	@Then("^Enter Service Sugg Rate in Create RFQ as (.*)$")
	public void Enter_Service_SuggRate_Cr_RFQ(String SuggRate) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRSuggRate));
		Thread.sleep(3000);
		EIP_Menu.SRSuggRate.clear();
		// EIP_Menu.Quantity.sendKeys(Keys.DELETE ,Keys.DELETE,Keys.DELETE,Keys.DELETE
		// );
		Thread.sleep(3000);
		EIP_Menu.SRSuggRate.sendKeys(SuggRate);
	}

	@Then("^Click HSN DD in Create RFQ$")
	public void Select_HSN() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RDHSN));
		Thread.sleep(3000);
		EIP_Menu.RDHSN.click();
		// Thread.sleep(200);
		Thread.sleep(3000);
		EIP_Menu.RDHSN.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Enter HSN in RFQ BQ as(.*)$")
	public void Enter_HSN_in_RFQ_BQ_as(String BQHSN) throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RDHSN));
		Thread.sleep(3000);
		EIP_Menu.RDHSN.click();
		// Thread.sleep(200);
		Thread.sleep(3000);
		EIP_Menu.RDHSN.sendKeys(BQHSN, Keys.TAB);
	}

	@Then("^Select Shipment Details in Other Terms$")
	public void Select_Shipment_Details_() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ShipmentDetails));
		Thread.sleep(3000);
		EIP_Menu.ShipmentDetails.click();

	}

	@Then("^Enter SD Job in Create RFQ as (.*)$")
	public void Enter_Job_RFQ_Create(String JobSD) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.JobSD));
		// EIP_Menu.Quantity.sendKeys(Keys.DELETE ,Keys.DELETE,Keys.DELETE,Keys.DELETE
		// );
		Thread.sleep(3000);
		EIP_Menu.JobSD.sendKeys(JobSD, Keys.TAB);
	}

	@Then("^Select Billing To Shipment Details For RD$")
	public void Select_Billing_To_Shipment_Details_RD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectBillingToShipmentDetailsRD));
		Thread.sleep(3000);
		EIP_Menu.SelectBillingToShipmentDetailsRD.click();
		Thread.sleep(3000);
		EIP_Menu.SelectBillingToShipmentDetailsRD.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Shipping To Shipment Details RD$")
	public void Select_shipping_To_Shipment_Details_RD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShippingToShipmentDetailsRD));
		Thread.sleep(3000);
		EIP_Menu.SelectShippingToShipmentDetailsRD.click();
		Thread.sleep(3000);
		EIP_Menu.SelectShippingToShipmentDetailsRD.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Add button in Shipment Details$")
	public void Select_Add_Shipment_Details_RD() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.AddSD.click();

	}

	@Then("^Select Reference RFQ in Create RFQ$")
	public void Select_Reference_RFQ() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ReferenceRFQ));
		Thread.sleep(3000);
		EIP_Menu.ReferenceRFQ.click();
		Thread.sleep(3000);
		EIP_Menu.ReferenceRFQ.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Yes in Confirmation Alert to Accept$")
	public void Select_Yes_Confirmation() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Confirmation));
		Thread.sleep(3000);
		EIP_Menu.Confirmation.click();

	}

	@Then("^Select Service Item View in Create RFQ$")
	public void click_Service_Item_View() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ServiceItemView));
		Thread.sleep(3000);
		EIP_Menu.ServiceItemView.click();

	}

	@Then("^Select SR Number View in Based On$")
	public void click_SR_Number_View() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.SRNumber.click();
	}

	@Then("^Select SR Number View in Add Service$")
	public void Select_SR_Number() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.SelectSRNumber.click();
	}

	@Then("^Select Service Button in RFQ Create$")
	public void Select_Service_Button() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.SelectService.click();
	}

	@Then("^Select SAC in Add RFQ Values$")
	public void Select_Service_SAC_Button() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.SelectSAC.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectSAC));
		Thread.sleep(3000);
		EIP_Menu.SelectSAC.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Select Next Icon Choose Vendor$")
	public void Select_Next_Icon_Choose_Vendor() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextIconSR));
		Thread.sleep(3000);
		EIP_Menu.SelectNextIconSR.click();
		// EIP_Menu.SelectNextIconChooseVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);

	}

	@Then("^Select Create Button in TCD Create$")
	public void Select_Create_Button() throws Throwable {
		// EIP_Menu.SelectCreate.click();
		Thread.sleep(500);

		try {
			EIP_Menu.SelectCreate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectCreate);

		}

		System.out.println("Select Create Button in TCD Create");
	}

	@Then("^Select TCD Job in Techno Commercial Document$")
	public void Select_TCD_Job_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDJob));
		Thread.sleep(1000);

		try {
			EIP_Menu.TCDJob.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDJob);

		}

		System.out.println("Select TCD Job in Techno Commercial Document");

	}

	@Then("^Select TCD Vendor in Techno Commercial Document$")
	public void Select_TCD_Vendor_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDVendor));
		Thread.sleep(1000);

		try {
			EIP_Menu.TCDVendor.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDVendor);

		}

		System.out.println("Select TCD Vendor in Techno Commercial Document");

	}

	@Then("^Select TCD Job from the list in Techno Commercial Document$")
	public void Select_TCD_Job_from_the_list_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTCDJob));
		Thread.sleep(2000);

		try {
			EIP_Menu.SelectTCDJob.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectTCDJob);

		}

		System.out.println("Select TCD Job from the list in Techno Commercial Document");
	}

	@Then("^Select TCD Vendor from the list in Techno Commercial Document$")
	public void Select_TCD_Vendor_from_the_list_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTCDVendor));
		Thread.sleep(1000);

		try {
			EIP_Menu.SelectTCDVendor.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectTCDVendor);

		}

		System.out.println("Select TCD Vendor from the list in Techno Commercial Document");

	}

	@Then("^Select Go icon in Techno Commercial Document$")
	public void Select_Go_Icon_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectGo));
		Thread.sleep(1000);

		try {
			EIP_Menu.SelectGo.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectGo);

		}

		System.out.println("Select Go icon in Techno Commercial Document");
	}

	@Then("^Select BQ Edit icon in Techno Commercial Document$")
	public void Select_BQ_Edit_Icon_in_Techno_Commercial_Document() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectGo));
		Thread.sleep(500);
		EIP_Menu.TCDBQEdit.click();
		Thread.sleep(500);
		// EIP_Menu.TCDBQEditAcceptAlert.click();
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Enter Alloc Qty in Techno Commercial Allocation$")
	public void Enter_Alloc_Qty_in_Techno_Commercial_Allocation() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterAllocQty));

		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.TCDVendorCheckBox);

		System.out.println("Moved to Alloc Qty location");

		Thread.sleep(4000);
		EIP_Menu.EnterAllocQty.click();
		/*
		try {
			EIP_Menu.EnterAllocQty.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.EnterAllocQty);

		}
*/
		System.out.println("Select Alloc Qty location");

		Thread.sleep(500);

		
		EIP_Menu.EnterAllocQty.clear();
		/*try {
			js.executeScript("arguments[0].value = '';", EIP_Menu.EnterAllocQty);
			// EIP_Menu.EnterAllocQty.clear();
		} catch (Exception e) {
			EIP_Menu.EnterAllocQty.clear();
			// EIP_Menu.EnterAllocQty.sendKeys(Keys.DELETE);
		}*/

		System.out.println("Clear Alloc Qty ");

		Thread.sleep(1000);
		try {
			EIP_Menu.EnterAllocQty.sendKeys(ConfigFileReader.getAllocQty_TCD());
		}catch(Exception e) {
			js.executeScript("arguments[0]. value='"+ConfigFileReader.getAllocQty_TCD()+"';", EIP_Menu.EnterAllocQty);
		}

		System.out.println("Enter Alloc Qty in Techno Commercial Allocation Page");
	}

	@Then("^Select Delivery Schedule$")
	public void Select_Delivery_Schedule() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExtDate));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.ExtDate);
	}

	@Then("^Select Delivery Schedule Calendar$")
	public void Select_Delivery_Schedule_Calendar() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliverBetweenCal));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.DeliverBetweenCal);
	}

	@Then("^Select Current Date Delivery Schedule Calendar$")
	public void Select_Current_Date_Delivery_Schedule_Calendar() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliverBetweenDate));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.DeliverBetweenDate);

		Thread.sleep(3000);
		EIP_Menu.TCDAction.click();
		Thread.sleep(500);
		EIP_Menu.DeliverBetweenCal.click();
		Thread.sleep(500);
		EIP_Menu.DeliverBetweenDate.click();
	}

	@Then("^Select Save Icon Delivery Schedule$")
	public void Select_Save_Icon_Delivery_Schedule() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Save));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(1000);
				
		try {
			EIP_Menu.Save.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Save);

		}
	}

	@Then("^Click Payment Center in Job Details$")
	public void Click_Payment_Center_in_Job_Details() throws Throwable {
		
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PaymentCenter);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PaymentCenter));
		Thread.sleep(2000);
	
		try {
			EIP_Menu.PaymentCenter.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PaymentCenter);

		}
		
	}

	@Then("^Select Payment Center in Job Details$")
	public void Select_Payment_Center_in_Job_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPaymentCenter));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.SelectPaymentCenter);
	}

	@Then("^Select Calendar in Job Details$")
	public void Select_Calendar_in_Job_Details() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectCalendar));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.SelectCalendar);
	}

	@Then("^Select date in Calendar$")
	public void Select_date_in_Calendar() throws Throwable {
		
		Thread.sleep(2500);
		/*wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTCDDate));
		// EIP_Menu.SelectPaymentCenter.click();
		
		 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		 * js.executeScript("arguments[0].click()", EIP_Menu.SelectDate);
		 

		
		 * Date date = new Date();
		 * 
		 * SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		 * 
		 * String strDate = formatter.format(date.getTime() + (1000 * 60 * 60 * 240));
		 * 
		 * System.out.println("Date To Be Captured =" + strDate);
		 * 
		 * selectKendoDate(strDate);
		 

		Thread.sleep(500);

		try {
			EIP_Menu.SelectTCDDate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectTCDDate);

		}	*/
		//#############################################################################
		
		// Test
		Date date = new Date();
		System.out.println("Today Date : " + date);
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int fifth_day = Integer.parseInt(today) + 5;
		String select_fifthday = Integer.toString(fifth_day);
		System.err.println("Fifth Day : " + select_fifthday);
		Thread.sleep(1000);
		List<WebElement> rFQOrderExpiryDate2 = EIP_Menu.TCDClaDate;
		for (WebElement webElement : rFQOrderExpiryDate2) {
			if (webElement.getAttribute("innerHTML").contains(select_fifthday)) {
				webElement.click();
				break;
			}
		}
		
		
		
		

	}

	@Then("^Select Post button in constzon view$")
	public void Select_Post_button_in_constzon_view() throws Throwable {
		Thread.sleep(2500);
		EIP_Menu.constzonview.click();
	}

	@Then("^Enter Comments in Techno Commercial Allocation$")
	public void Enter_Comments_in_Techno_Commercial_Allocation() throws Throwable {

		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PaymentCenter);
		
		Thread.sleep(2000);
		EIP_Menu.Comments.sendKeys(ConfigFileReader.getComments_TCD());

		System.out.println("Enter Comments in Techno Commercial Allocation");
	}

	@Then("^Select Submit in TCD$")
	public void Select_Submit_in_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDSubmit));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(2000);
		
		try {
			EIP_Menu.TCDSubmit.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDSubmit);

		}
		
		System.out.println("Select Submit Button in TCD");
		
	
	}
	
	
	@Then("^Select Save Draft Button in TCD$")
	public void Select_Save_Draft_Button_in_TCD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDSubmit));
		// EIP_Menu.SelectPaymentCenter.click();
		Thread.sleep(2000);
		
		try {
			EIP_Menu.TCDSaveDraft.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDSaveDraft);

		}
		
		System.out.println("Select Save Draft Button in TCD");
		
				
		
	}
	

	@Then("^DS Code Verify after Save Draft the TCD$")
	public void DS_Code_Verify_after_Save_Draft_the_TCD() throws Throwable {
	
	
	// Database Open
			DataBaseConnection.dataBaseConnectionSCM();
			
			// To Call DSCode Value from method
			DataBaseConnection.SDTCDDSCode();
			
			// Convert DSCode value & Assign into a Variable
			String TCDdSCode = DataBaseConnection.SDTCDDSCode;
			
			assertEquals("41", TCDdSCode);
			Thread.sleep(900);

			// Print the DSCode Value
			System.err.println("After Save Draft the TCD Number DS Code : " + TCDdSCode);
			
			// Database Open
			DataBaseConnection.databaseConnectionClose();
			
			System.out.println("DS Verifyed Successfully");
			
	}
	
	
	@Then("^DS Code Verify after Submit the TCD$")
	public void DS_Code_Verify_after_Submit_the_TCD() throws Throwable {
	
	
	// Database Open
			DataBaseConnection.dataBaseConnectionSCM();
			
			// To Call DSCode Value from method
			DataBaseConnection.SDTCDDSCode();
			
			// Convert DSCode value & Assign into a Variable
			String TCDdSCode = DataBaseConnection.SDTCDDSCode;
			
			assertEquals("1", TCDdSCode);
			Thread.sleep(900);

			// Print the DSCode Value
			System.err.println("After Submit the TCD Number DS Code : " + TCDdSCode);
			
			// Database Open
			DataBaseConnection.databaseConnectionClose();
			
			System.out.println("DS Verifyed Successfully");
			
	}
	
	@Then("^DS Code Verify after Reject TCD$")
	public void DS_Code_Verify_after_Reject_and_Submit_the_TCD() throws Throwable {
	
	
	// Database Open
	DataBaseConnection.dataBaseConnectionSCM();
	
	// To Call DSCode Value from method
	DataBaseConnection.SDTCDDSCode();
	
	// Convert DSCode value & Assign into a Variable
	String TCDdSCode = DataBaseConnection.SDTCDDSCode;
	
	assertEquals("13", TCDdSCode);
	Thread.sleep(900);

	// Print the DSCode Value
	System.err.println("After Submit the TCD Number DS Code : " + TCDdSCode);
	
	// Database Open
	DataBaseConnection.databaseConnectionClose();
	
	System.out.println("DS Verifyed Successfully");
	
	}
	
	@Then("^DS Code Verify First Level Approval the TCD$")
	public void DS_Code_Verify_First_level_Approval_the_TCD() throws Throwable {
	
	
	// Database Open
	DataBaseConnection.dataBaseConnectionSCM();
	
	// To Call DSCode Value from method
	DataBaseConnection.SDTCDDSCode();
	
	// Convert DSCode value & Assign into a Variable
	String TCDdSCode = DataBaseConnection.SDTCDDSCode;
	
	assertEquals("2", TCDdSCode);
	Thread.sleep(900);

	// Print the DSCode Value
	System.err.println("After Submit the TCD Number DS Code : " + TCDdSCode);
	
	// Database Open
	DataBaseConnection.databaseConnectionClose();
	
	System.out.println("DS Verifyed Successfully");
	
	}
	
	@Then("^DS Code Verify Second Level Approval the TCD$")
	public void DS_Code_Verify_Second_Level_Approval_the_TCD() throws Throwable {
	
	
	// Database Open
	DataBaseConnection.dataBaseConnectionSCM();
	
	// To Call DSCode Value from method
	DataBaseConnection.SDTCDDSCode();
	
	// Convert DSCode value & Assign into a Variable
	String TCDdSCode = DataBaseConnection.SDTCDDSCode;
	
	assertEquals("3", TCDdSCode);
	Thread.sleep(900);

	// Print the DSCode Value
	System.err.println("After Submit the TCD Number DS Code : " + TCDdSCode);
	
	// Database Open
	DataBaseConnection.databaseConnectionClose();
	
	System.out.println("DS Verifyed Successfully");
	
	}

	@Then("^TCD Information Alert Accept$")
	public void TCD_Information_Alert_Accept() throws Throwable {

		// EIP_Menu.SelectPaymentCenter.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDInformationAlertAccept));
		Thread.sleep(2000);
		/*JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.TCDInformationAlertAccept);*/
		

		try {
			EIP_Menu.TCDInformationAlertAccept.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDInformationAlertAccept);

		}
		
		System.out.println("TCD Information Alert Accept");
		// Login_Steps.Logout();
		
		Login_Steps.Logout();
	}

	@Then("^TCD Approval Alert Accept$")
	public void TCD_Approal_Alert_Accept() throws Throwable {

		// EIP_Menu.SelectPaymentCenter.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.TCDAppAlert));
		Thread.sleep(3000);
		
		try {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDAppAlert);
			
		} catch (Exception e) {

			EIP_Menu.TCDAppAlert.click();
		}
		Login_Steps.Logout();
	}

	// ************************************************************************************************//
	@Then("^Request For Quote Home Page Verification$")
	public void Request_For_Quote_home_page_verification() throws Throwable {
		Thread.sleep(900);
		assertEquals("Request For Quote", EIP_Menu.RFQvf.getText());
		System.out.println("RFQ Home = " + EIP_Menu.RFQvf.getText());
		Thread.sleep(900);
		assertEquals("Material", EIP_Menu.mat.getText());
		System.out.println("RFQ Home = " + EIP_Menu.mat.getText());
		Thread.sleep(900);
		assertEquals("Service", EIP_Menu.ser.getText());
		System.out.println("RFQ Home = " + EIP_Menu.ser.getText());
		Thread.sleep(000);
		assertEquals("Package", EIP_Menu.pak.getText());
		System.out.println("RFQ Home = " + EIP_Menu.pak.getText());
		Thread.sleep(2000);
		/*
		 * assertEquals("For Action", EIP_Menu.foract.getText());
		 * System.out.println("RFQ Home = " + EIP_Menu.foract.getText());
		 * Thread.sleep(500); assertEquals("In Progress", EIP_Menu.Inpro.getText());
		 * System.out.println("RFQ Home = " + EIP_Menu.Inpro.getText());
		 * Thread.sleep(500); assertEquals("All", EIP_Menu.al.getText());
		 * System.out.println("RFQ Home = " + EIP_Menu.al.getText());
		 */

	}

	@Then("^Request For Quote Choose Vendors Page Verification$")
	public void Request_For_Quote_Choose_Vendors_Page_verification() throws Throwable {
		Thread.sleep(1000);
		assertEquals("Choose Vendors", EIP_Menu.Cven.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.Cven.getText());
		Thread.sleep(1000);
		assertEquals("Public Offer", EIP_Menu.PubOffer.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.PubOffer.getText());
		Thread.sleep(1000);
		assertEquals("Partner Code", EIP_Menu.DetPC.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetPC.getText());
		Thread.sleep(1000);
		assertEquals("Partner Name", EIP_Menu.DetPN.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetPN.getText());

		/*
		 * assertEquals("Vendor Type", EIP_Menu.DetVT.getText());
		 * System.out.println("Choose Vendors Page = "+EIP_Menu.DetVT.getText());
		 */
		/*
		 * assertEquals("M.Category", EIP_Menu.DetMC.getText());
		 * System.out.println("Choose Vendors Page = " + EIP_Menu.DetMC.getText());
		 * Thread.sleep(2000); assertEquals("AutoBQ Required",
		 * EIP_Menu.DetABQR.getText()); System.out.println("Choose Vendors Page = " +
		 * EIP_Menu.DetABQR.getText()); Thread.sleep(2000); assertEquals("Contact Name",
		 * EIP_Menu.DetCN.getText()); System.out.println("Choose Vendors Page = " +
		 * EIP_Menu.DetCN.getText());
		 */

	}

	@Then("^Service Request For Quote Choose Vendors Page Verification$")
	public void Service_Request_For_Quote_Choose_Vendors_Page_verification() throws Throwable {
		assertEquals("Choose Vendors", EIP_Menu.Cven.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.Cven.getText());
		Thread.sleep(500);
		assertEquals("Public Offer", EIP_Menu.PubOffer.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.PubOffer.getText());
		Thread.sleep(500);
		assertEquals("Partner Code", EIP_Menu.DetPC.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetPC.getText());
		Thread.sleep(500);
		assertEquals("Partner Name", EIP_Menu.DetPN.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetPN.getText());
		/*
		 * assertEquals("Vendor Type", EIP_Menu.DetVT.getText());
		 * System.out.println("Choose Vendors Page = "+EIP_Menu.DetVT.getText());
		 */
		assertEquals("S.Category", EIP_Menu.DetSC.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetSC.getText());
		Thread.sleep(500);
		assertEquals("AutoBQ Required", EIP_Menu.DetABQR.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetABQR.getText());
		Thread.sleep(500);
		assertEquals("Contact Name", EIP_Menu.DetCN.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetCN.getText());

	}

	@Then("^Service Request For Quote RD Choose Vendors Page Verification$")
	public void Service_Request_For_Quote_RD_Choose_Vendors_Page_verification() throws Throwable {
		assertEquals("Choose Vendors", EIP_Menu.Cven.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.Cven.getText());
		Thread.sleep(500);
		assertEquals("Public Offer", EIP_Menu.PubOffer.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.PubOffer.getText());
		Thread.sleep(500);
		assertEquals("Partner Code", EIP_Menu.DetPC.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetPC.getText());
		Thread.sleep(500);
		assertEquals("Partner Name", EIP_Menu.DetPN.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetPN.getText());
		Thread.sleep(500);
		assertEquals("Vendor Type", EIP_Menu.DetVT.getText());
		System.out.println("Choose Vendors Page = " + EIP_Menu.DetVT.getText());
		/*
		 * Thread.sleep(500); assertEquals("S.Category", EIP_Menu.DetSC.getText());
		 * System.out.println("Choose Vendors Page = "+EIP_Menu.DetSC.getText());
		 * Thread.sleep(500); assertEquals("AutoBQ Required",
		 * EIP_Menu.DetABQR.getText());
		 * System.out.println("Choose Vendors Page = "+EIP_Menu.DetABQR.getText());
		 * Thread.sleep(500); assertEquals("Contact Name", EIP_Menu.DetCN.getText());
		 * System.out.println("Choose Vendors Page = "+EIP_Menu.DetCN.getText());
		 */

	}

	@Then("^Select Service in Request For Quote$")
	public void Select_Service_in_Request_For_Quote() throws Throwable {
		Thread.sleep(500);
		js.executeScript("arguments[0].click()", EIP_Menu.RFQService);
		// EIP_Menu.RFQService.click();

	}

	@Then("^Verify to Select Request For Quote Create icon$")
	public void Verify_to_Select_Request_For_Quote_Create_icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddIcon));

		Thread.sleep(1000);

		if (!EIP_Menu.SelectAddIcon.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}
		// EIP_Menu.SelectAddIcon.click();
		
		
		Thread.sleep(4500);

		try {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectAddIcon);
			
		} catch (Exception e) {

			EIP_Menu.SelectAddIcon.click();
		}

		System.out.println("Select Request For Quote Create icon");

	}

	@Then("^Close and Logout RFQ Page$")
	public void Close_and_Logout_RFQ_Page() throws Throwable {
		Thread.sleep(500);
		Commoncontrol.LogOut();

	}

	// ************************************************************************************************//
	// Home Page method
	@Then("^Request For Quote Login and Select RFQ Create$")
	public void Request_For_Quote_Login_and_Select_RFQ_Create() throws Throwable {
		Login_Objects.Otheruser.click();
		Thread.sleep(500);
		Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
		Thread.sleep(500);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Thread.sleep(500);
		Login_Objects.Login.click();
		Thread.sleep(500);
		Commoncontrol.RFQHomePageNavigateToMenu();
		js.executeScript("arguments[0].click()", EIP_Menu.SelectAddIcon);

	}

	@Then("^Request For Quote Login and Select RFQ Create Service$")
	public void Request_For_Quote_Login_and_Select_RFQ_Create_Service() throws Throwable {
		Login_Objects.Otheruser.click();
		Thread.sleep(500);
		Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
		Thread.sleep(500);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Thread.sleep(500);
		Login_Objects.Login.click();
		Thread.sleep(500);
		Commoncontrol.RFQHomePageNavigateToMenu();
		Thread.sleep(500);
		// EIP_Menu.RFQService.click();
		js.executeScript("arguments[0].click()", EIP_Menu.RFQService);
		Thread.sleep(500);
		js.executeScript("arguments[0].click()", EIP_Menu.SelectAddIcon);

	}

	@Then("^Request For Quote Login and Select Navigate to RFQ Home Page$")
	public void Request_For_Quote_Login_and_Select_Navigate_to_RFQ_Home_Page() throws Throwable {

		Commoncontrol.RFQHomePageNavigateToMenu();
	}

	@Then("^Request For Quote Login for TCC$")
	public void Request_For_Quote_Login_TCC() throws Throwable {
		Thread.sleep(900);
		Login_Objects.Otheruser.click();
		System.out.println("Select Other User in Eip Login Page");
		Thread.sleep(800);
		Login_Objects.Username.sendKeys(ConfigFileReader.getTCCUsername());
		System.out.println("Enter User Name in Eip Login Page");
		Thread.sleep(600);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Enter Password in Eip Login Page");
		Thread.sleep(500);
		Login_Objects.Login.click();
		System.out.println("Select Login Button in Eip Login Page");
		Thread.sleep(700);
		Commoncontrol.RFQHomePageNavigateToMenu();
	}
	
	

	@Then("^Request For Quote Login for RFQ TCC$")
	public void Request_For_Quote_Login_RFQ_TCC() throws Throwable {
		Thread.sleep(900);
		Login_Objects.Otheruser.click();
		System.out.println("Select Other User in Eip Login Page");
		Thread.sleep(800);
		Login_Objects.Username.sendKeys(ConfigFileReader.getRFQTCCUsername());
		System.out.println("Enter User Name in Eip Login Page");
		Thread.sleep(600);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Enter Password in Eip Login Page");
		Thread.sleep(500);
		Login_Objects.Login.click();
		System.out.println("Select Login Button in Eip Login Page");
		Thread.sleep(700);
		Commoncontrol.RFQHomePageNavigateToMenu();
	}

	@Then("^Request For Quote Login for TCD$")
	public void Request_For_Quote_Login_TCD() throws Throwable {
		Login_Objects.Otheruser.click();
		System.out.println("Select Other User in Eip Login Page");
		Thread.sleep(500);
		Login_Objects.Username.sendKeys(ConfigFileReader.getRFQTCCUsername());
		System.out.println("Enter User Name in Eip Login Page");
		Thread.sleep(500);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Enter Password in Eip Login Page");
		Thread.sleep(500);
		Login_Objects.Login.click();
		System.out.println("Select Login Button in Eip Login Page");
		Thread.sleep(500);
		Commoncontrol.TCDHomePageNavigateToMenu();
	}

	// Home Page method
	@Then("^RFQ Bidders Quote Login$")
	public void RFQ_Bidders_Quote() throws Throwable {
		Thread.sleep(900);
		Login_Objects.Otheruser.click();
		System.out.println("Select Other User in Eip Login Page");
		Thread.sleep(800);
		Login_Objects.Username.sendKeys(ConfigFileReader.getBQUsername());
		System.out.println("Enter Vendor User Name in Eip Login Page");
		Thread.sleep(800);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		System.out.println("Enter Vendor Password in Eip Login Page");
		Thread.sleep(800);
		Login_Objects.Login.click();
		System.out.println("Select Login Button in Eip Login Page");
		Thread.sleep(1000);
		Commoncontrol.RFQBQHomePageNavigateToMenu();

	}

	@Then("^RFQ Bidders Quote Vendor THOMPSONENG Login$")
	public void RFQ_Bidders_Quote_Vendor_THOMPSONENG_Login() throws Throwable {
		Login_Objects.Otheruser.click();
		Thread.sleep(500);
		Login_Objects.Username.sendKeys(ConfigFileReader.getBQVendorTHUsername());
		Thread.sleep(500);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Thread.sleep(500);
		Login_Objects.Login.click();
		Thread.sleep(500);
		Commoncontrol.RFQBQHomePageNavigateToMenu();

	}

	@Then("^RFQ Bidders Quote Vendor CHENNAIAGENCIES Login$")
	public void RFQ_Bidders_Quote_Vendor_CHENNAIAGENCIES_Login() throws Throwable {
		Login_Objects.Otheruser.click();
		Login_Objects.Username.sendKeys(ConfigFileReader.getBQVendorCHUsername());
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Login_Objects.Login.click();
		Commoncontrol.RFQBQHomePageNavigateToMenu();

	}

	@Then("^RFQ Bidders Quote Vendor dpind Login$")
	public void RFQ_Bidders_Quote_Vendor_dpind_Login() throws Throwable {
		Login_Objects.Otheruser.click();
		Login_Objects.Username.sendKeys(ConfigFileReader.getBQVendorDPUsername());
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Login_Objects.Login.click();
		Commoncontrol.RFQBQHomePageNavigateToMenu();

	}

	@Then("^Request For Quote Edit Login and Select RFQ Create$")
	public void Request_For_Quote_Edit_Login_and_Select_RFQ_Create() throws Throwable {
		Login_Objects.Otheruser.click();
		Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Login_Objects.Login.click();
		Commoncontrol.RFQHomePageNavigateToMenu();

	}

	@Then("^After Login Request For Quote Add Material page$")
	public void Request_For_Quote_After_Login_Add_Material_page() throws Throwable {
		EIP_Menu.SearchPR.click();
		DataBaseConnection.EnterPRFromDB();
		js.executeScript("arguments[0].click()", EIP_Menu.SelectSearchIcon);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPR));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", EIP_Menu.SelectPR);
		js.executeScript("arguments[0].click()", EIP_Menu.SelectNextIcon);

	}

	@Then("^After Login Service Request For Quote Add Service page$")
	public void After_Login_Service_Request_For_Quote_Add_Service_page() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ServiceItemView));
		EIP_Menu.ServiceItemView.click();

		EIP_Menu.SRNumber.click();
		EIP_Menu.SRfilter.click();
		EIP_Menu.FilterSRNo.click();
		Thread.sleep(500);
		DataBaseConnection.EnterSRFromDB();
		Thread.sleep(500);
		EIP_Menu.SelectSRNo.click();
		Thread.sleep(500);

		js.executeScript("arguments[0].click()", EIP_Menu.AfterSelectSRNext);

	}

	@Then("^Add RFQ Values from Request For Quote Create Page$")
	public void Add_RFQ_Values_from_Request_For_Quote_Create_Page() throws Throwable {
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RFQ());
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandList));
		js.executeScript("arguments[0].click()", EIP_Menu.ExpandList);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DelSchedule));
		EIP_Menu.DelSchedule.click();

		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getDeliveryQty_RFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandClose));
		Thread.sleep(500);
		EIP_Menu.SaveandClose.click();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);
		EIP_Menu.SelectNextIconRFQCreate.click();
		Thread.sleep(500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();
	}

	@Then("^Add RFQ Values from SR Request For Quote Create Page$")
	public void Add_RFQ_Values_from_SR_Request_For_Quote_Create_Page() throws Throwable {

		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RFQ());

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterSRQuantity));
		EIP_Menu.EnterSRQuantity.click();
		EIP_Menu.EnterSRQuantity.clear();
		EIP_Menu.EnterSRQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandSRList));
		// EIP_Menu.ExpandList.click();
		// Thread.sleep(3000);
		js.executeScript("arguments[0].click()", EIP_Menu.ExpandSRList);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DelSchedule));
		EIP_Menu.DelSchedule.click();

		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getDeliveryQty_RFQ());

		Thread.sleep(500);
		EIP_Menu.SaveandCloseSR.click();
		// EIP_Menu.AlertOk.click();

		Thread.sleep(500);
		EIP_Menu.ServiceRequestAccept.click();
		Thread.sleep(500);
		EIP_Menu.SACCode.click();
		Thread.sleep(500);
		EIP_Menu.SelectSACCode.click();

		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Savedrf));
		 * 
		 * EIP_Menu.Savedrf.click();
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AlertOk));
		 * EIP_Menu.AlertOk.click();
		 */

		EIP_Menu.SelectNextSRRFQ.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ServiceRequestAccept));
		EIP_Menu.ServiceRequestAccept.click();
	}

	@Then("^Add Capital Auto PR RFQ Values from Request For Quote Create Page$")
	public void Add_Capital_Auto_PR_RFQ_Values_from_Request_For_Quote_Create_Page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_CPRRFQ());
		Thread.sleep(500);
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandList));
		js.executeScript("arguments[0].click()", EIP_Menu.ExpandList);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DelSchedule));
		EIP_Menu.DelSchedule.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliveryQty));
		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getDeliveryQty_RFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandClose));
		Thread.sleep(500);
		EIP_Menu.SaveandClose.click();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		EIP_Menu.SelectNextIconRFQCreate.click();
		Thread.sleep(500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		Commoncontrol.eAuctionAlert();
		// EIP_Menu.AcceptAlert.click();
	}

	@Then("^Verify to Enter Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms$")
	public void Verify_to_Enter_Vendor_RFQ_Create_page_and_Add_the_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {

		Thread.sleep(3000);

		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		// EIP_Menu.AcceptAlert.click();
		EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Verify to Edit Vendor RFQ Create page and Add the Vendor Type then Move to Payment Terms$")
	public void Verify_to_Edit_Vendor_RFQ_Create_page_and_Add_the_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.PTAuc);
		Thread.sleep(3000);
		EIP_Menu.DelVendor.click();
		System.out.println("Removed the Added Vendor in RFQ Edit Page");
		Thread.sleep(3000);

		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
		Thread.sleep(3000);
		System.out.println("Enter the Vendor code");
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		System.out.println("Select the Vendor from RFQ Edit Page");

		Thread.sleep(1200);

		// EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		System.out.println("Select Add Vendor button from RFQ Edit Page");
		Thread.sleep(2000);
		/*
		 * // Commoncontrol.eAuctionAlert(); // EIP_Menu.AcceptAlert.click();
		 * EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER); //
		 * EIP_Menu.AcceptAlert.click();
		 * 
		 * 
		 */
		System.out.println("Select Next button from Choose Vendor RFQ Edit Page");
		EIP_Menu.SelectNextIconPaymentTerms.click();
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
		System.out.println("Accept Alert for After Add vendor in Choose Vendor RFQ Edit Page");
		Thread.sleep(2500);
		EIP_Menu.SelectNextIconPaymentTerms.click();

		System.out.println("Select Next button in Choose Vendor RFQ Edit Page");
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		System.out.println("Accept Alert for in Choose Vendor RFQ Edit Page");

	}
	
	
	@Then("^Verify to Edit Vendor RFQ Create page and Add New Vendor Type then Move to Payment Terms$")
	public void Verify_to_Edit_Vendor_RFQ_Create_page_and_Add_New_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {

		
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
		Thread.sleep(3000);
		System.out.println("Enter the Vendor code");
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		
		ClickUsingTryCatch(SelectVendor);
		System.out.println("Select the Vendor from RFQ Edit Page");

		Thread.sleep(1200);

		
		
		ClickUsingTryCatch(SelectAddVendorIcon);
		System.out.println("Select Add Vendor button from RFQ Edit Page");
		Thread.sleep(2000);
		
		System.out.println("Select Next button from Choose Vendor RFQ Edit Page");
	
		ClickUsingTryCatch(SelectNextIconPaymentTerms);
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
		System.out.println("Accept Alert for After Add vendor in Choose Vendor RFQ Edit Page");
		Thread.sleep(2500);
		
		ClickUsingTryCatch(SelectNextIconPaymentTerms);

		System.out.println("Select Next button in Choose Vendor RFQ Edit Page");
		
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		System.out.println("Accept Alert for in Choose Vendor RFQ Edit Page");

	}

	@Then("^Verify to Enter Vendor Service RFQ Create page and Add the Vendor Type then Move to Payment Terms$")
	public void Verify_to_Enter_Vendor_Service_RFQ_Create_page_and_Add_the_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {

		Thread.sleep(3000);
		/*
		 * EIP_Menu.RFQMaterialcategory.click(); //
		 * EIP_Menu.RFQMaterialcategory.sendKeys(ConfigFileReader.
		 * getMaterialcategory_RFQ(), // Keys.TAB);
		 * 
		 * List<WebElement> selectEP = EIP_Menu.listMaterialcategory; for (WebElement
		 * webElement : selectEP) { if
		 * (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
		 * webElement.click(); // System.out.println(webElement.getText()); break; //
		 * ALL - ALL }
		 * 
		 * }
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		 */
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());

		Thread.sleep(3000);
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_BACK_SPACE);
		 */

		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		EIP_Menu.SelectNextIconVendorSR.sendKeys(Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Verify to Enter Vendor Service RD RFQ Create page and Add the Vendor Type then Move to Payment Terms$")
	public void Verify_to_Enter_Vendor_Service_RD_RFQ_Create_page_and_Add_the_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {

		Thread.sleep(3000);
		/*
		 * EIP_Menu.RFQMaterialcategory.click(); //
		 * EIP_Menu.RFQMaterialcategory.sendKeys(ConfigFileReader.
		 * getMaterialcategory_RFQ(), // Keys.TAB);
		 * 
		 * List<WebElement> selectEP = EIP_Menu.listMaterialcategory; for (WebElement
		 * webElement : selectEP) { if
		 * (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
		 * webElement.click(); // System.out.println(webElement.getText()); break; //
		 * ALL - ALL }
		 * 
		 * }
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		 */
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());

		Thread.sleep(3000);
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_BACK_SPACE);
		 */

		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		EIP_Menu.SelectNextSRRDRFQ.sendKeys(Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Verify to Enter Vendor RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms$")
	public void Verify_to_Enter_Vendor_RFQ_Create_page_and_Add_the_Auto_BQ_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {
		Commoncontrol.RateDiscoveryAutoBQ();
	}

	@Then("^Verify to Enter Vendor Service RFQ Create page and Add the Auto BQ Vendor Type then Move to Payment Terms$")
	public void Verify_to_Enter_Vendor_Service_RFQ_Create_page_and_Add_the_Auto_BQ_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {
		Commoncontrol.ServiceAutoBQ();
	}

	@Then("^Verify to Enter Payment Terms RFQ Create page$")
	public void Verify_to_Enter_Payment_Terms_RFQ_Create() throws Throwable {
		/*
		 * js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		 * EIP_Menu.EnterReleasePaymentTerms.clear();
		 * EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getRelease_RFQ())
		 * ; js.executeScript("arguments[0].click()",
		 * EIP_Menu.EnterReleasePaymentTerms);
		 * EIP_Menu.EnterReleasePaymentTerms.clear();
		 * EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getRelease_RFQ())
		 * ;
		 */

		// submit
		errorMessageHeader = EIP_Menu.ErrorAlert.getText();
		errorMessage = EIP_Menu.ErrorAlertText.getText();
		assertEquals("Error", errorMessageHeader);
		assertEquals("Payment Terms should not be less than 100 %", errorMessage);
		// ok
		Commoncontrol.paymentTermsRelease();
		// submit
		errorMessageHeader = EIP_Menu.ErrorAlert.getText();
		errorMessage = EIP_Menu.ErrorAlertText.getText();
		assertEquals("Error", errorMessageHeader);
		assertEquals("Please select reference value", errorMessage);
		// ok

		Commoncontrol.paymentTermsEvenet();

	}

	// submit
	// alert handle

	@Then("^Enter Payment Terms  Rate discovery RFQ Create page$")
	public void Enter_Payment_Terms_Rate_discovery_RFQ_Create_Page() throws Throwable {

		Commoncontrol.paymentTermsReleaseCreate();
		Commoncontrol.paymentTermsEvenet();
		Commoncontrol.paymentTermsReferenceValue();
		Commoncontrol.PaymentTermsCreditDays();
		Commoncontrol.PaymentTermsPaymentMode();
		Commoncontrol.PaymentTermsReferenceDate();
		Commoncontrol.PaymentTermsRatediscoveryDocument();
		Commoncontrol.PaymentTermsCompletedAndMoveToOtherTrems();

	}

	@Then("^Enter Payment Terms RFQ Create page$")
	public void Enter_Payment_Terms_RFQ_Create_Page() throws Throwable {

		Commoncontrol.paymentTermsReleaseCreate();
		Commoncontrol.paymentTermsEvenet();
		Commoncontrol.paymentTermsReferenceValue();
		Commoncontrol.PaymentTermsCreditDays();
		Commoncontrol.PaymentTermsPaymentMode();
		Commoncontrol.PaymentTermsReferenceDate();
		Commoncontrol.PaymentTermsDocument();
		Commoncontrol.PaymentTermsCompletedAndMoveToOtherTrems();

	}

	@Then("^Enter Service Payment Terms RFQ Create page$")
	public void Enter_Service_Payment_Terms_RFQ_Create_Page() throws Throwable {

		Commoncontrol.paymentTermsReleaseCreate();
		Commoncontrol.paymentTermsEvenet();
		Commoncontrol.ServicepaymentTermsReferenceValue();
		Commoncontrol.PaymentTermsCreditDays();
		Commoncontrol.PaymentTermsPaymentMode();
		Commoncontrol.ServicePaymentTermsReferenceDate();
		Commoncontrol.ServicePaymentTermsDocument();
		Commoncontrol.ServicePaymentTermsCompletedAndMoveToOtherTrems();

	}

	@Then("^Enter RD Service Payment Terms RFQ Create page$")
	public void Enter_RD_Service_Payment_Terms_RFQ_Create_Page() throws Throwable {

		Commoncontrol.paymentTermsReleaseCreate();
		Commoncontrol.paymentTermsEvenet();
		Commoncontrol.ServicepaymentTermsReferenceValue();
		Commoncontrol.PaymentTermsCreditDays();
		Commoncontrol.PaymentTermsPaymentMode();
		Commoncontrol.ServicePaymentTermsReferenceDate();
		Commoncontrol.ServiceRDPaymentTermsDocument();
		Commoncontrol.RDServicePaymentTermsCompletedAndMoveToOtherTrems();

	}

	// *****************************************************************************************************//

	@Then("^Add Material Verification in RFQ Create$")
	public void Add_Material_Verification_in_RFQ_Create() throws Throwable {
		assertEquals("Add Material", EIP_Menu.addmat.getText());
		System.out.println("RFQ Create = " + EIP_Menu.addmat.getText());

	}

	@Then("^Add RFQ Values Verification in RFQ Create$")
	public void Add_RFQ_Values_Verification_in_RFQ_Create() throws Throwable {
		assertEquals("Add RFQ Values", EIP_Menu.AdRfqVal.getText());
		System.out.println("RFQ Create = " + EIP_Menu.AdRfqVal.getText());

	}

	@Then("^Verify Error Alert to Select Next Icon without Allocation No$")
	public void Verify_Error_Alert_to_Select_Next_Icon_without_Allocation_No() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextIcon));

		if (!EIP_Menu.SelectNextIcon.isEnabled()) {
			System.err.println("Next Icon Button is Disabled");
		} else {
			System.out.println("Next Icon  Button is Enabled");
		}
		Thread.sleep(1000);

		try {
			EIP_Menu.SelectNextIcon.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIcon);

		}

		System.out.println("Select Next Icon without Allocation No");
	}

	@Then("^Verify Error Alert to Select Next Icon without Allocation No in Service RFQ$")
	public void Verify_Error_Alert_to_Select_Next_Icon_without_Allocation_No_in_Service_RFQ() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRNext));
		boolean nexticonstatus = EIP_Menu.SRNext.isEnabled();
		if (nexticonstatus == true) {
			JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
			js.executeScript("arguments[0].click()", EIP_Menu.SRNext);
		}
	}

	@Then("^Error Alert Verification in Add Material$")
	public void Error_Alert_Verification_in_Add_Material() throws Throwable {
		Thread.sleep(600);
		assertEquals("Error", EIP_Menu.ErrorAlert.getText());
		System.err.println("Alert Type = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(600);
		assertEquals("Please Select the Materials !!!", EIP_Menu.ErrorAlertText.getText());
		System.err.println("Add Material Alert Text = " + EIP_Menu.ErrorAlertText.getText());
		Thread.sleep(600);
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AlertOk));
		 * boolean alerticonstatus = EIP_Menu.AlertOk.isEnabled(); if (alerticonstatus
		 * == true) {
		 */

		if (!EIP_Menu.AcceptAlertR.isEnabled()) {
			System.err.println("Alert Button is Disabled");
		} else {
			System.out.println("Alert Button is Enabled");
		}

		Thread.sleep(1000);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		 * js.executeScript("arguments[0].click()", EIP_Menu.AlertOk);
		 */
		EIP_Menu.AcceptAlertR.click();

		System.out.println(
				"Verified whether without select Any Purchase Number or Rate Discovery Not Allow to Move Add RFQ Values it show Error Alert");
	}

	@Then("^Verify to select Advance Search in RFQ Create Page$")
	public void Verify_to_select_Advance_Search_in_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchPR));
		Thread.sleep(1000);
		EIP_Menu.SearchPR.click();

		System.out.println("Select Advance Search in RFQ Create Page");
	}

	@Then("^Verify to select Filter in RFQ Create Page$")
	public void Verify_to_select_Filter_in_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRfilter));
		boolean AdvanceSearchiconstatus = EIP_Menu.SRfilter.isEnabled();
		if (AdvanceSearchiconstatus == true) {
			EIP_Menu.SRfilter.click();
		}
	}

	@Then("^Verify to Enter Latest Purchase Request from DB in the Advance Search$")
	public void Verify_to_Enter_Latest_Purchase_Request_from_DB_in_the_Advance_Search() throws Throwable {
		DataBaseConnection.EnterPRFromDB();
	}

	@Then("^Verify to Enter Latest Service Request from DB in Filter$")
	public void Verify_to_Enter_Latest_Service_Request_from_DB_in_Filter() throws Throwable {
		DataBaseConnection.EnterSRFromDB();
	}

	@Then("^Verify that after select Search Icon to list the Latest Purchase Request number in Grid$")
	public static void Verify_that_after_select_Search_Icon_to_list_the_Latest_Purchase_Request_number_in_Grid()
			throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectSearchIcon));
		{
			Thread.sleep(1500);
			try {
				EIP_Menu.SelectSearchIcon.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", EIP_Menu.SelectSearchIcon);

			}
			System.out.println("select Search Icon to list the Latest Purchase Request number in Grid");
		}
	}

	@Then("^Verify that Select Purchase Request number in the Grid$")
	public void Verify_that_Select_Purchase_Request_number_in_the_Grid() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPR));
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.SelectPR);

		Thread.sleep(500);

		try {
			EIP_Menu.SelectPR.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectPR);

		}

	}

	@Then("^Select Multi HSN Purchase Request$")
	public void Select_Multi_HSN_Purchase_Request() throws Throwable {

		Thread.sleep(500);

		EIP_Menu.AucRevHSN0.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);

		EIP_Menu.AucRevHSN1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);

		EIP_Menu.AucRevHSN2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);

		EIP_Menu.AucRevHSN3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);

	}

	@Then("^Select Reverse Purchase Request$")
	public void Select_Reverse_Purchase_Request() throws Throwable {

		Thread.sleep(500);

		Commoncontrol.SelecteAuctionReversePurchaseRequest();

	}

	@Then("^Verify that Select Service Request number in the Grid$")
	public void Verify_that_Select_Service_Request_number_in_the_Grid() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectSRNo));
		boolean SelectPRnumstatus = EIP_Menu.SelectSRNo.isEnabled();
		if (SelectPRnumstatus == true) {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
			 * js.executeScript("arguments[0].click()", EIP_Menu.SelectPR);
			 */
			Thread.sleep(500);
			EIP_Menu.SelectSRNo.click();
			Thread.sleep(500);
			JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
			js.executeScript("arguments[0].click()", EIP_Menu.AfterSelectSRNext);
		}
	}

	@Then("^Verify that Select Next Icon with Allocation No navigate to Add RFQ Values$")
	public void Verify_that_Select_Next_Icon_with_Allocation_No_navigate_to_Add_RFQ_Values() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextIcon));
		{
			Thread.sleep(1000);

			try {
				EIP_Menu.SelectNextIcon.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIcon);

			}

			System.out.println("Select Next Icon with Allocation No navigate to Add RFQ Values");
		}
	}

	@Then("^Verify that Select Previous Icon navigate to Add Material Page$")
	public void Verify_that_Select_Previous_Icon_navigate_to_Add_Material_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Pre));

		Thread.sleep(1000);
		try {
			EIP_Menu.Pre.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Pre);

		}

		System.out.println("Select Previous Icon navigate to Add Material Page");
	}

	@Then("^Select Next Icon navigate to Bit Values$")
	public void Select_Next_Icon_navigate_to_Bit_Values() throws Throwable {
		Thread.sleep(900);

		// EIP_Menu.AuctionAttachGeneralTerms.sendKeys(Keys.TAB, Keys.ENTER);
		try {
			EIP_Menu.SelectNextAuction.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextAuction);

		}

	}

	@Then("^Accept Alert in eAuction$")
	public void Accept_Alert_in_eAuction() throws Throwable {
		/*
		 * Thread.sleep(500); System.out.println("Auction Alert Type = " +
		 * EIP_Menu.AlertType.getText()); Thread.sleep(500);
		 * System.out.println("Auction Alert Message = " +
		 * EIP_Menu.ErrorAlertText.getText());
		 */

		EIP_Menu.AlertBQAccept.click();

	}

	//

	@Then("^Select Next Icon After select HSN$")
	public void Select_Next_Icon_After_select_HSN() throws Throwable {

		EIP_Menu.SelectNextAuction.click();
		Thread.sleep(900);
		EIP_Menu.AlertBQAccept.click();
	}

	@Then("^Select HSN Next Icon navigate to Choose Vendor$")
	public void Select_Next_Icon_navigate_to_Choose_Vendor() throws Throwable {

		Commoncontrol.SelecteAuctionHSNReversePurchaseRequest();
	}

	@Then("^Verify that Select Next Icon navigate to Add RFQ Values$")
	public void Verify_that_Select_Next_Icon_navigate_to_Add_RFQ_Values() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextIcon));

		{

			try {
				EIP_Menu.SelectNextIcon.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIcon);

			}
		}

		System.out.println("Select Next Icon navigate to Add RFQ Values");

	}

	@Then("^Enter Latest Rate Discovery RFQ Number in Refrence RFQ field at Crate RFQ Page")
	public void Enter_Latest_Rate_Discovery_RFQ_Number_in_Refrence_RFQ_field_at_Crate_RFQ_Page() throws Throwable {
		// EIP_Menu.ReferenceRFQ.
	}

	@Then("^Verify that Scope Of RFQ Enter in Crate RFQ Page")
	public void Verify_that_Scope_Of_RFQ_Enter_in_Crate_RFQ_Page() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RFQ());

		System.out.println("Enter the Scope for RFQ Crate Page");

	}

	@Then("^Verify that Service Scope Of RFQ Enter in Crate RFQ Page")
	public void Verify_that_Service_Scope_Of_RFQ_Enter_in_Crate_RFQ_Page() throws Throwable {
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RFQ());
	}

	@Then("^Verify that Service Scope Of RFQ Enter in Crate RD RFQ Page")
	public void Verify_that_Service_Scope_Of_RFQ_Enter_in_Crate_RD_RFQ_Page() throws Throwable {
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RFQ());
	}

	@Then("^Verify the Scope Of RFQ Enter in Crate RFQ Page")
	public void Verify_the_Scope_Of_RFQ_Enter_in_Crate_RFQ_Page() throws Throwable {
		Thread.sleep(5000);
		EIP_Menu.EnterScopeOfRFQ.click();
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RDRFQ());
	}

	@Then("^Verify the Scope Of RFQ Enter in Crate Service RD RFQ Page")
	public void Verify_the_Scope_Of_RFQ_Enter_in_Crate_Service_RD_RFQ_Page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.EnterScopeOfRFQ.click();
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RDRFQ());
	}

	@Then("^Verify the Scope Of Rate Discovery RFQ Enter in Crate RFQ Page")
	public void Verify_the_Scope_Of_Rate_Discovery_RFQ_Enter_in_Crate_RFQ_Page() throws Throwable {
		Thread.sleep(900);

		// EIP_Menu.EnterScopeOfRFQ.click();

		try {
			EIP_Menu.EnterScopeOfRFQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.EnterScopeOfRFQ);

		}
		System.out.println("Select Scope Of RFQ in RFQ Create Page");
		Thread.sleep(500);
		// EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RDRFQ());
		try {
			EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RDRFQ());
		} catch (Exception e) {
			jse.executeScript("arguments[0].value='RFQ Create Using Rate Discovery';", EIP_Menu.EnterScopeOfRFQ);

		}
		System.out.println("Enter Scope Of RFQ in RFQ Create Page");

		// jse.executeScript("arguments[0].value='RFQ Create Using Rate Discovery';",
		// EIP_Menu.EnterScopeOfRFQ);

	}

	@Then("^Enter Sugg Rate in RFQ Create Page")
	public void Enter_Sugg_Rate_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate);

		}

		System.out.println("Select Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(1000);

		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter Sugg Rate in RFQ Create Page");

		Thread.sleep(2000);

		try {
			EIP_Menu.SelectNextIconPaymentTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIconPaymentTerms);

		}

		Thread.sleep(1000);

		Commoncontrol.eAuctionAlert();

	}

	@Then("^Verify Save Deaft RFQ after Enter Sugg Rate in RFQ Create Page")
	public void Verify_Save_Deaft_RFQ_after_Enter_Sugg_Rate_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate);

		}

		System.out.println("Select Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(1000);

		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter Sugg Rate in RFQ Create Page");

		Thread.sleep(1000);

		try {
			EIP_Menu.SelectNextSRRDRFQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextSRRDRFQ);

		}
		Thread.sleep(600);
		assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		System.out.println("Alert Type = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(600);
		System.out.println("Alert Message = " + EIP_Menu.ErrorAlertText.getText());
		Thread.sleep(600);

		Commoncontrol.eAuctionAlert();

		System.out.println("Succefully: Accept Alert for Save Deaft RFQ after Enter Sugg Rate in RFQ Create Page");

		Thread.sleep(1000);

		// Test

		// Database Open
		DataBaseConnection.dataBaseConnectionCONSRC();

		// To Call DSCode Value from method
		DataBaseConnection.RFQSaveDraftDSCode_test();

		// Convert DSCode value & Assign into a Variable
		String dSCode2 = DataBaseConnection.DSCode;

		assertEquals("41", dSCode2);
		Thread.sleep(900);

		// Print the DSCode Value
		System.err.println("After Save Draft the RFQ Number DS Code : " + dSCode2);

		// Database Open
		DataBaseConnection.databaseConnectionClose();

		Thread.sleep(3000);

		try {
			EIP_Menu.CloseSavedtaft.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.CloseSavedtaft);

		}

		System.out.println("After Save Draft close the Create Page");

	}

	@Then("^Verify Save Deaft RFQ after Enter Multi Sugg Rate in RFQ Create Page")

	public void Verify_Save_Deaft_RFQ_after_Enter_Multi_Sugg_Rate_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate);

		}

		System.out.println("Select Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(1000);

		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter Sugg Rate in RFQ Create Page");

		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate1);

		}
		// RDSuggRate1

		System.out.println("Select 2 Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate1.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate1.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter 1 Sugg Rate in RFQ Create Page");

		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate2);

		}
		// RDSuggRate1

		System.out.println("Select 2 Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate2.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate2.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter 2 Sugg Rate in RFQ Create Page");
		Thread.sleep(2000);

		try {
			EIP_Menu.RDSuggRate3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate3);

		}
		// RDSuggRate1

		System.out.println("Select 3 Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate3.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate3.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter 3 Sugg Rate in RFQ Create Page");
		Thread.sleep(2000);

		try {
			EIP_Menu.SelectNextSRRDRFQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextSRRDRFQ);

		}

		// Test

		// Database Open
		DataBaseConnection.dataBaseConnectionCONSRC();

		// To Call DSCode Value from method
		DataBaseConnection.RFQSaveDraftDSCode_test();

		// Convert DSCode value & Assign into a Variable
		String dSCode2 = DataBaseConnection.DSCode;

		assertEquals("41", dSCode2);
		Thread.sleep(900);

		// Print the DSCode Value
		System.err.println("After Save Draft the RFQ Number DS Code : " + dSCode2);

		// Database Open
		DataBaseConnection.databaseConnectionClose();

		Thread.sleep(2500);

		try {
			js.executeScript("arguments[0].click();", EIP_Menu.CloseSavedtaft);
		} catch (Exception e) {
			
			EIP_Menu.CloseSavedtaft.click();
		}

		System.out.println("After Save Draft close the Create Page");

	}

	@Then("^Enter Multi Sugg Rate in RFQ Create Page")
	public void Enter_Multi_Sugg_Rate_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate);

		}

		System.out.println("Select Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(1000);

		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter Sugg Rate in RFQ Create Page");

		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate1);

		}
		// RDSuggRate1

		System.out.println("Select 2 Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate1.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate1.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter 1 Sugg Rate in RFQ Create Page");

		Thread.sleep(1000);

		try {
			EIP_Menu.RDSuggRate2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate2);

		}
		// RDSuggRate1

		System.out.println("Select 2 Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate2.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate2.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter 2 Sugg Rate in RFQ Create Page");
		Thread.sleep(2000);

		try {
			EIP_Menu.RDSuggRate3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDSuggRate3);

		}
		// RDSuggRate1

		System.out.println("Select 3 Sugg Rate in RFQ Create Page");
		EIP_Menu.RDSuggRate3.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate3.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		System.out.println("Enter 3 Sugg Rate in RFQ Create Page");
		Thread.sleep(2000);

		try {
			EIP_Menu.SelectNextIconPaymentTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIconPaymentTerms);

		}

		Thread.sleep(1000);

		Commoncontrol.eAuctionAlert();

	}

	@Then("^Edit Sugg Rate in RFQ Create Page")
	public void Edit_Sugg_Rate_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(4000);

		try {
			EIP_Menu.EditRDSuggRate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.EditRDSuggRate);

		}
		System.out.println("Edit Sugg Rate in RFQ Edit Page");
		Thread.sleep(1000);
		EIP_Menu.EditRDSuggRate.clear();
		Thread.sleep(1000);
		// jse.executeScript("arguments[0].value='ConfigFileReader.getSuggRate_RDRFQ()';",
		// EIP_Menu.RDSuggRate);
		EIP_Menu.EditRDSuggRate.sendKeys(ConfigFileReader.getEditSuggRate_RDRFQ());
		System.out.println("Enter Sugg Rate in RFQ Edit Page");
		Thread.sleep(2000);
		// EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		EIP_Menu.SelectNextIconPaymentTerms.click();

		System.out.println("Select Next button in RFQ Edit Page");
		Thread.sleep(2000);
		EIP_Menu.AlertOk.click();

		System.out.println("Accept Alert in RFQ Edit Add RFQ Values Page");

	}

	@Then("^Edit Sugg Rate in PR RFQ Create Page")
	public void Edit_Sugg_Rate_in_PR_RFQ_Create_Page() throws Throwable {
		Thread.sleep(4000);

		try {
			EIP_Menu.EditRDSuggRate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.EditRDSuggRate);

		}
		System.out.println("Edit Sugg Rate in RFQ Edit Page");
		Thread.sleep(1000);
		EIP_Menu.EditRDSuggRate.clear();
		Thread.sleep(1000);
		// jse.executeScript("arguments[0].value='ConfigFileReader.getSuggRate_RDRFQ()';",
		// EIP_Menu.RDSuggRate);
		EIP_Menu.EditRDSuggRate.sendKeys(ConfigFileReader.getEditSuggRate_RDRFQ());
		System.out.println("Enter Sugg Rate in RFQ Edit Page");
		Thread.sleep(2000);
		// EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		EIP_Menu.SelectNextIconPaymentTerms.click();

		System.out.println("Select Next button in RFQ Edit Page");
		Thread.sleep(2000);
		EIP_Menu.AlertOk.click();

		System.out.println("Accept Alert in RFQ Edit Add RFQ Values Page");

	}

	@Then("^Enter Quantity in RFQ Create Page")
	public void Enter_Quantity_in_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantity));
		Thread.sleep(1000);
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter Quantity in RFQ Create Page");
	}

	@Then("^Enter Quantity in Purchase Request RFQ Create Page1")
	public void Enter_Quantity_in_Purchase_Request_RFQ_Create_Page1() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQQuantity));
		Thread.sleep(3000);
		System.out.println("Before Select Quantity in Purchase Request RFQ Create Page");

		try {
			EIP_Menu.RFQQuantity.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RFQQuantity);

		}
		System.out.println("After Enter Quantity in Purchase Request RFQ Create Page");

		EIP_Menu.RFQQuantity.clear();
		EIP_Menu.RFQQuantity.sendKeys(ConfigFileReader.getQuantity_PRRFQ());
		System.out.println("Enter Quantity in RFQ Create Page");
	}

	@Then("^Enter Multi Quantity in RFQ Create Page")
	public void Enter_Multi_Quantity_in_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantity));
		Thread.sleep(1000);
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter Quantity in RFQ Create Page");

		Thread.sleep(1000);
		EIP_Menu.EnterQuantity1.click();
		EIP_Menu.EnterQuantity1.clear();
		EIP_Menu.EnterQuantity1.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter 1 material Quantity in RFQ Create Page");

		Thread.sleep(1000);
		EIP_Menu.EnterQuantity2.click();
		EIP_Menu.EnterQuantity2.clear();
		EIP_Menu.EnterQuantity2.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter 2 material Quantity in RFQ Create Page");

		Thread.sleep(1000);
		EIP_Menu.EnterQuantity3.click();
		EIP_Menu.EnterQuantity3.clear();
		EIP_Menu.EnterQuantity3.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter 3 material Quantity in RFQ Create Page");

	}

	@Then("^Enter RD Service Quantity in RFQ Create Page")
	public void Enter_RD_Service_Quantity_in_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantityRDSR));
		Thread.sleep(1000);
		EIP_Menu.EnterQuantityRDSR.click();
		EIP_Menu.EnterQuantityRDSR.clear();
		EIP_Menu.EnterQuantityRDSR.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter Quantity in RFQ Create Page");
	}

	@Then("^Enter Quantity in eAuction Create Page")
	public void Enter_Quantity_in_eAuction_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.bidvaluQnty));
		Thread.sleep(500);
		EIP_Menu.bidvaluQnty.click();
		EIP_Menu.bidvaluQnty.clear();
		EIP_Menu.bidvaluQnty.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter Quantity in eAuction Create Page");
	}

	@Then("^Enter Service Quantity in RFQ Create Page")
	public void Enter_Service_Quantity_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantitySR));
		EIP_Menu.EnterQuantitySR.click();
		EIP_Menu.EnterQuantitySR.clear();
		EIP_Menu.EnterQuantitySR.sendKeys(ConfigFileReader.getQuantity_RFQ());
		System.out.println("Enter Quantity in RFQ Create Page");
	}

	@Then("^Edit the Rate discovery RFQ Number")
	public void Edit_the_Rate_discovery_RFQ_Number() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RDFirstRFQToEdit));
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.RDFirstRFQToEdit);
		actions.perform();
		EIP_Menu.RDRFQEdit.click();

	}

	@Then("^Enter Quantity in Edit RFQ Create Page")
	public void Enter_Quantity_in_Edit_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RDEditEnterQuantity));
		EIP_Menu.RDEditEnterQuantity.click();
		EIP_Menu.RDEditEnterQuantity.clear();
		EIP_Menu.RDEditEnterQuantity.sendKeys(ConfigFileReader.getEditQuantity_RFQ());
	}

	@Then("^Enter Sugg Rate and Save Draft in RFQ Create Page")
	public void Enter_Sugg_Rate_and_Save_Draft_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RDSuggRate.click();
		EIP_Menu.RDSuggRate.clear();
		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.AlertOk.click();
		EIP_Menu.CRFQcl.click();
		Login_Steps.Logout();
	}

	@Then("^Enter SR RD Sugg Rate and Save Draft in RFQ Create Page")
	public void Enter_SR_RD_Sugg_Rate_and_Save_Draft_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.SRSuggRDService.click();
		EIP_Menu.SRSuggRDService.clear();
		EIP_Menu.SRSuggRDService.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		/*
		 * EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		 * EIP_Menu.AlertOk.click(); EIP_Menu.CRFQcl.click(); Login_Steps.Logout();
		 */
	}

	@Then("^Enter Edit Sugg Rate and Save Draft in RFQ Create Page")
	public void Enter_Edit_Sugg_Rate_and_Save_Draft_in_RFQ_Create_Page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RDEditSuggRate.click();
		EIP_Menu.RDEditSuggRate.clear();
		EIP_Menu.RDEditSuggRate.sendKeys(ConfigFileReader.getEditSuggRate_RDRFQ());
		// EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.ENTER);
		// EIP_Menu.AlertOk.click();
		EIP_Menu.ExpandListRD.click();
		EIP_Menu.RDDelSch.click();
		Thread.sleep(500);
		EIP_Menu.RDEditQlty.click();
		EIP_Menu.RDEditQlty.clear();

		EIP_Menu.RDEditQlty.sendKeys(ConfigFileReader.getRDEditQuantity_RDRFQ());
		EIP_Menu.RDEdirSaveDraft.click();
		EIP_Menu.AlertOk.click();
		Thread.sleep(500);
		EIP_Menu.RDAddmatEditAuct.click();
		Thread.sleep(500);
		EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		EIP_Menu.AlertOk.click();
		/*
		 * EIP_Menu.CRFQcl.click(); Login_Steps.Logout();
		 */
	}

	@Then("^To Complete the Rate Discovery Edit RFQ Creation")
	public void To_Complete_the_Rate_Discovery_Edit_RFQ_Creation() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.RDEditPageDown);

		Thread.sleep(500);
		EIP_Menu.RDNextEdit.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER, Keys.ENTER);
		Thread.sleep(500);
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Commoncontrol.PaymentTermsCompletedAndMoveToOtherTrems();
		Thread.sleep(500);
		EIP_Menu.SelectNextIconPaymentTerms.click();
		Thread.sleep(3000);
		EIP_Menu.RFQSubmit.click();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Enter Add RFQ Values and Naveigate to Choos Vendor Page in RFQ Create Page")
	public void Enter_Add_RFQ_Values_and_Naveigate_to_Choos_Vendor_Page_in_RFQ_Create_Page() throws Throwable {
		Commoncontrol.RateDiscoveryVerifyRFQCreateAddRFQValue();
	}

	@Then("^Select Next Icon in Auction Refer RFQ$")
	public void Select_Next_Icon_in_Auction_Refer_RFQ() throws Throwable {
		Commoncontrol.SelecteAuctionReverseRFQNext();

	}

	@Then("^Select Next Icon in Auction Payment$")
	public void Select_Next_Icon_in_Auction_Payment() throws Throwable {
		Thread.sleep(500);
		// EIP_Menu.AuctionAttachGeneralTerms.sendKeys(Keys.TAB, Keys.ENTER);

		try {
			EIP_Menu.SelectNextAuction.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextAuction);

		}

		/*
		 * Thread.sleep(500);
		 * 
		 * EIP_Menu.SelectNextAuction.click();
		 */

		// EIP_Menu.AcceptAlert.click();

	}

	@Then("^Select Next Icon in Schedule Essentials Auction Payment$")
	public void Select_Next_Icon_in_Schedule_Essentials_Auction_Payment() throws Throwable {
		Thread.sleep(8000);
		/* EIP_Menu.AuctionAttachGeneralTerms.sendKeys(Keys.TAB, Keys.ENTER); */

		try {
			EIP_Menu.SelectNextAuction.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextAuction);

		}

		/*
		 * Thread.sleep(500);
		 * 
		 * EIP_Menu.SelectNextAuction.click();
		 */

		// EIP_Menu.AcceptAlert.click();

	}

	@Then("^Select Next Icon in Payment Terms Auction Payment$")
	public void Select_Next_Icon_in_Payment_Terms_Auction_Payment() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.AuctionAttachGeneralTerms.sendKeys(Keys.TAB, Keys.ENTER);

		/*
		 * try { EIP_Menu.SelectNextAuction.click(); } catch(Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.SelectNextAuction);
		 */
	}

	@Then("^Select Next Icon in Auction Bid Values$")
	public void Select_Next_Icon_in_Auction_Bid_Values() throws Throwable {
		/*
		 * EIP_Menu.AuctionReferRFQHSN.click();
		 * 
		 * 
		 * List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList; for (WebElement
		 * webElement : DropdownResult) { if (webElement.getText().equals("09011119")) {
		 * webElement.click(); System.out.println("Selected the Auction Source"); break;
		 * } }
		 */

		Thread.sleep(500);
		EIP_Menu.BidValues.click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("^Select Next Icon in Auction Vendors$")
	public void Select_Next_Icon_in_Auction_Vendors() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Vendor.click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("^Verify to Enter Vendor RFQ Create page and Add the Vendor Type$")
	public void Verify_to_Enter_Vendor_RFQ_Create_page_and_Add_the_Vendor_Type() throws Throwable {
		Thread.sleep(1500);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorTh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		System.out.println("Enter Vendor Code in Choose Vendors");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		System.out.println("Select Vendor Code in Choose Vendors");

	}

	@Then("^Verify to Enter Multi Vendor RFQ Create page and Add the Vendor Type$")
	public void Verify_to_Enter_Multi_Vendor_RFQ_Create_page_and_Add_the_Vendor_Type() throws Throwable {
		Thread.sleep(1500);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
		System.out.println("Enter First Vendor");
		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		System.out.println("Enter First Vendor1");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		System.out.println("Select First Vendor");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			// EIP_Menu.SelectAddVendorIcon.click();
			Thread.sleep(2500);
			EIP_Menu.SelectAddVendorIcon.click();
			System.out.println("Add First Vendor");

			Thread.sleep(1000);
			EIP_Menu.RFQVendorClear.click();
			System.out.println("Clear First Vendor");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
			EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorTh_RFQ());
			System.out.println("Enter Second Vendor");

			Thread.sleep(3000);
			EIP_Menu.EnterVendorRFQ.sendKeys("006");
			System.out.println("Enter Second Vendor1");
			Thread.sleep(1200);
			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
			EIP_Menu.SelectVendor.click();
			System.out.println("Select Second Vendor");

			// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

			Thread.sleep(1000);
			EIP_Menu.SelectAddVendorIcon.click();
			System.out.println("Add Second Vendor");
			Thread.sleep(2000);
			// EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
			EIP_Menu.SelectNextIconPaymentTerms.click();
			System.out.println("Select Next Button in Choose Vendor");
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(2000);
			Commoncontrol.eAuctionAlert();

			System.out.println("Accept Alert After select Next Button in Choose Vendor");

		}

	}

	@Then("^Verify to Enter Vendor eAuction Create page and Add the Vendor Type$")
	public void Verify_to_Enter_Vendor_eAuction_Create_page_and_Add_the_Vendor_Type() throws Throwable {
		Thread.sleep(3500);

		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
		System.out.println("Enter Vendor in eAuction create Page");
		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		System.out.println("Enter Vendor eAuction Create page and Add the Vendor Type");

	}

	@Then("^Verify to Enter Vendor eAuction Create page and Add the Multi Vendor Type$")
	public void Verify_to_Enter_Vendor_eAuction_Create_page_and_Add_the_Multi_Vendor_Type() throws Throwable {
		Thread.sleep(3000);
		/*
		 * EIP_Menu.RFQMaterialcategory.click();
		 * 
		 * List<WebElement> selectEP = EIP_Menu.listMaterialcategory; for (WebElement
		 * webElement : selectEP) { if
		 * (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
		 * webElement.click();
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			// EIP_Menu.SelectAddVendorIcon.click();
			Thread.sleep(500);
			EIP_Menu.SelectAddVendorIcon.click();
			// Commoncontrol.eAuctionAlert();
			// EIP_Menu.AcceptAlert.click();
			/*
			 * EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER); //
			 * EIP_Menu.AcceptAlert.click();x Commoncontrol.eAuctionAlert();
			 */

		}

		Thread.sleep(3000);
		EIP_Menu.VendorClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorTh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		// EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(2500);
		EIP_Menu.SelectAddVendorIcon.click();
		// Commoncontrol.eAuctionAlert();
		// EIP_Menu.AcceptAlert.click();
		// EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		// Thread.sleep(1000);
		// Commoncontrol.eAuctionAlert();

		Thread.sleep(3000);
		EIP_Menu.VendorClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorCh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("593");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		// EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		EIP_Menu.SelectAddVendorIcon.click();
		// Commoncontrol.eAuctionAlert();

		Thread.sleep(3000);
		EIP_Menu.VendorClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorDp_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		/*
		 * Thread.sleep(500); EIP_Menu.SelectAddVendorIcon.click(); Thread.sleep(500);
		 * EIP_Menu.SelectAddVendorIcon.click(); Commoncontrol.eAuctionAlert();
		 */

	}

	@Then("^Verify to Enter Multi Vendor Type in Material eAuction Create page$")
	public void Verify_to_Enter_Multi_Vendor_Type_in_Material_eAuction_Create_page() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RFQMaterialcategory.click();

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
				webElement.click();

				break;

			}

		}
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			// EIP_Menu.SelectAddVendorIcon.click();
			Thread.sleep(500);
			EIP_Menu.SelectAddVendorIcon.click();
			// Commoncontrol.eAuctionAlert();
			// EIP_Menu.AcceptAlert.click();
			/*
			 * EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER); //
			 * EIP_Menu.AcceptAlert.click();x Commoncontrol.eAuctionAlert();
			 */

		}

		Thread.sleep(3000);
		EIP_Menu.VendorMaterialClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorTh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		// EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		EIP_Menu.SelectAddVendorIcon.click();

		Thread.sleep(500);
		Commoncontrol.VendorAlert();
		// Commoncontrol.eAuctionAlert();
		// EIP_Menu.AcceptAlert.click();
		// EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		// Commoncontrol.eAuctionAlert();

		Thread.sleep(3000);
		EIP_Menu.VendorMaterialClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorCh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("593");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		// EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		EIP_Menu.SelectAddVendorIcon.click();
		// Commoncontrol.eAuctionAlert();

		Thread.sleep(3000);
		EIP_Menu.VendorMaterialClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorDp_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		/*
		 * Thread.sleep(500); EIP_Menu.SelectAddVendorIcon.click(); Thread.sleep(500);
		 * EIP_Menu.SelectAddVendorIcon.click(); Commoncontrol.eAuctionAlert();
		 */

	}

	@Then("^Verify to Enter Multi Vendor Type in PR Material eAuction Create page$")
	public void Verify_to_Enter_Multi_Vendor_Type_in_PR_Material_eAuction_Create_page() throws Throwable {
		Thread.sleep(3000);
		/*
		 * EIP_Menu.RFQMaterialcategory.click();
		 * 
		 * List<WebElement> selectEP = EIP_Menu.listMaterialcategory; for (WebElement
		 * webElement : selectEP) { if
		 * (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
		 * webElement.click();
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		 */
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			// EIP_Menu.SelectAddVendorIcon.click();
			Thread.sleep(500);
			EIP_Menu.SelectAddVendorIcon.click();

		}

		Thread.sleep(3000);
		EIP_Menu.VendorMaterialPRClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorTh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		Thread.sleep(1200);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		// EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		Commoncontrol.VendorAlert();

		Thread.sleep(3000);
		EIP_Menu.VendorMaterialPRClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorCh_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("593");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		// EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		EIP_Menu.SelectAddVendorIcon.click();
		// Commoncontrol.eAuctionAlert();

		Thread.sleep(3000);
		EIP_Menu.VendorMaterialPRClear.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendorDp_RFQ());

		Thread.sleep(3000);
		EIP_Menu.EnterVendorRFQ.sendKeys("006");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		/*
		 * Thread.sleep(500); EIP_Menu.SelectAddVendorIcon.click(); Thread.sleep(500);
		 * EIP_Menu.SelectAddVendorIcon.click(); Commoncontrol.eAuctionAlert();
		 */

	}

	@Then("^Verify to Edit Vendor Button in RFQ Create$")
	public void Verify_to_Edit_Vendor_Button_in_RFQ_Create() throws Throwable {

		Thread.sleep(3000);
		EIP_Menu.SelectAddVendorIcon.click();

		System.out.println("Select to Add Vendor Button in Choose Vendors RFQ Create");

		Thread.sleep(2000);

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.PTAuc);
		Thread.sleep(3000);
		EIP_Menu.DelVendor.click();
		System.out.println("Removed the Added Vendor in RFQ Edit Page");

		Thread.sleep(2000);

		try {
			EIP_Menu.VendorClear.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.VendorClear);

		}
		System.out.println("Clear Vendor");

		Thread.sleep(3000);

		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
		Thread.sleep(3000);
		System.out.println("Enter the Vendor code");
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();
		System.out.println("Select the Vendor from RFQ Edit Page");

		Thread.sleep(1200);

		// EIP_Menu.SelectAddVendorIcon.click();
		// EIP_Menu.SelectAddVendorIcon.click();

		Thread.sleep(1000);

		try {
			EIP_Menu.SelectAddVendorIcon.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectAddVendorIcon);

		}
		System.out.println("Select Add Vendor button from RFQ Edit Page");
		Thread.sleep(1000);

		try {
			EIP_Menu.SelectNextIconPaymentTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIconPaymentTerms);

		}

		System.out.println("Select to Next Button in Choose Vendors RFQ Create");
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(2000);
		Commoncontrol.eAuctionAlert();
		System.out.println("Accept Alert in Choose Vendors RFQ Create");

	}
	
	@Then("^Verify to select Save Deaft RFQ Number$")
	public void Verify_to_Add_Save_Deaft_RFQ_Number() throws Throwable {
		

		if (!EIP_Menu.SelectNextSRRDRFQ.isEnabled()) {
			System.err.println("Save Draft Button is Disabled");
		} else {
			System.out.println("Save Draft Button is Enabled");
		}
		
		try {
			EIP_Menu.SelectNextSRRDRFQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextSRRDRFQ);

		}
		
		System.out.println("select Save Deaft RFQ Number");
		
		Commoncontrol.eAuctionAlert();
		
		ScrollUsingJaveScript(Close);
		Thread.sleep(1000);
		EIP_Menu.Close.click();
		System.out.println("Closed Create - RFQ Page");

	}
	

	@Then("^Verify to Add Vendor Button in RFQ Create$")
	public void Verify_to_Add_Vendor_Button_in_RFQ_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		if (!EIP_Menu.SelectAddVendorIcon.isEnabled()) {
			System.err.println("Add Vendor Button is Disabled");
		} else {
			System.out.println("Add Vendor Button is Enabled");
		}

		{
			Thread.sleep(3000);
			
			
			ClickUsingTryCatch(SelectAddVendorIcon);

			System.out.println("Select to Add Vendor Button in Choose Vendors RFQ Create");
			
			Thread.sleep(2000);
			// Commoncontrol.eAuctionAlert();
			ClickUsingTryCatch(RDNext);
			//EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
			System.out.println("Select to Next Button in Choose Vendors RFQ Create");
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(2000);
			Commoncontrol.eAuctionAlert();
			System.out.println("Accept Alert in Choose Vendors RFQ Create");

		}
	}
	
	@Then("^Verify to Add Vendor Button and Select Auto BQ in RFQ Create$")
	public void Verify_to_Add_Vendor_Button_and_Select_Auto_BQ_in_RFQ_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		if (!EIP_Menu.SelectAddVendorIcon.isEnabled()) {
			System.err.println("Add Vendor Button is Disabled");
		} else {
			System.out.println("Add Vendor Button is Enabled");
		}

		{
			Thread.sleep(3500);
			
			
			ClickUsingTryCatch(SelectAddVendorIcon);

			System.out.println("Select to Add Vendor Button in Choose Vendors RFQ Create");
			
			Thread.sleep(1000);
			
			ClickUsingTryCatch(SelectAutoBQ);
			assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
			System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());
			
			Thread.sleep(2000);
			// Commoncontrol.eAuctionAlert();
			ClickUsingTryCatch(RDNext);
			//EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
			System.out.println("Select to Next Button in Choose Vendors RFQ Create");
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(2000);
			Commoncontrol.eAuctionAlert();
			System.out.println("Accept Alert in Choose Vendors RFQ Create");

		}
	}
	
	


	@Then("^Verify to Add Vendor Button in eAuction Create$")
	public void Verify_to_Add_Vendor_Button_in_eAuction_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			Thread.sleep(500);

			try {
				EIP_Menu.SelectAddVendorIcon.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", EIP_Menu.SelectAddVendorIcon);
				System.out.println("Add Vendor Icon in eAuction Create");
			}
			Thread.sleep(2000);
			// EIP_Menu.SelectAddVendorIcon.click();
			// Commoncontrol.eAuctionAlert();
			// EIP_Menu.AcceptAlert.click();
			EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
			System.out.println("Next icon in eAuction Create");
			// EIP_Menu.AcceptAlert.click();x
			Thread.sleep(1000);
			Commoncontrol.eAuctionAlert();
			

		}
	}

	@Then("^Verify to Add Vendor Button in eAuction Reverse Rate Discovery Create$")
	public void Verify_to_Add_Vendor_Button_in_eAuction_Reverse_Rate_Discovery_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			Thread.sleep(2000);
			/*
			 * EIP_Menu.SelectAddVendorIcon.click(); Commoncontrol.eAuctionAlert();
			 */
			// EIP_Menu.AcceptAlert.click();
			EIP_Menu.AuctionAttachGeneralTerms.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(1000);
			Commoncontrol.eAuctionAlert();

		}
	}

	@Then("^Verify to Add Vendor Button in Reverse Purchase Request eAuction Create$")
	public void Verify_to_Add_Vendor_Button_in_Reverse_Purchase_Request_eAuction_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			Thread.sleep(500);
			/*
			 * EIP_Menu.SelectAddVendorIcon.click(); Commoncontrol.eAuctionAlert();
			 */
			Thread.sleep(500);
			EIP_Menu.SelectNextAuction.click();

			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();

		}
	}

	@Then("^Verify to Add Vendor Button in Service RFQ Create$")
	public void Verify_to_Add_Vendor_Button_in_Service_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.SelectAddVendorIcon.click();
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			EIP_Menu.SelectNextIconVendorSR.sendKeys(Keys.TAB, Keys.ENTER);
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();

		}
	}

	@Then("^Verify to Add Vendor Button in Service RD RFQ Create$")
	public void Verify_to_Add_Vendor_Button_in_Service_RD_RFQ_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.SelectAddVendorIcon.click();
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			EIP_Menu.SelectNextSRRDRFQ.sendKeys(Keys.TAB, Keys.ENTER);
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();

		}
	}

	@Then("^Verify to Add Vendor Button in Auto BQ RFQ Create$")
	public void Verify_to_Add_Vendor_Button_in_Auto_BQ_RFQ_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.SelectAddVendorIcon.click();
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			Thread.sleep(500);
			EIP_Menu.SelectAutoBQ.click();
			assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
			System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

			EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.ENTER);
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			/*
			 * EIP_Menu.CloseVen.click(); Login_Steps.Logout();
			 */

		}
	}

	@Then("^Verify to Add Vendor Button in Auto SR BQ RFQ Create$")
	public void Verify_to_Add_Vendor_Button_in_Auto_SR_BQ_RFQ_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.SelectAddVendorIcon.click();
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			Thread.sleep(500);
			EIP_Menu.SelectSRAutoBQ.click();
			assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
			System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

			EIP_Menu.SelectNextIconVendorSR.sendKeys(Keys.TAB, Keys.ENTER);
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			/*
			 * EIP_Menu.CloseVen.click(); Login_Steps.Logout();
			 */

		}
	}

	@Then("^Verify to Add Vendor Button in Auto BQ SR RD RFQ Create$")
	public void Verify_to_Add_Vendor_Button_in_Auto_BQ_SR_RD_RFQ_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.SelectAddVendorIcon.click();
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			Thread.sleep(500);
			EIP_Menu.SelectSRAutoBQ.click();
			assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
			System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

			EIP_Menu.SelectNextIconVendorRDSR.sendKeys(Keys.TAB, Keys.ENTER);
			// EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			Commoncontrol.eAuctionAlert();
			/*
			 * EIP_Menu.CloseVen.click(); Login_Steps.Logout();
			 */

		}
	}

	@Then("^Verify to Enter Vendor Service RD RFQ Auto BQCreate page and Add the Vendor Type then Move to Payment Terms$")
	public void Verify_to_Enter_Vendor_Service_RD_RFQ_Auto_BQCreate_page_and_Add_the_Vendor_Type_then_Move_to_Payment_Terms()
			throws Throwable {
		Commoncontrol.SRRDVendorAutoBQ();
	}

	@Then("^Verify Add Vendor Values in Draft$")
	public void Verify_Add_Vendor_Values_in_Draft() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.LatRfq));
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.LatRfq);
		actions.perform();
		EIP_Menu.RfqEdit.click();
		js.executeScript("arguments[0].click()", EIP_Menu.SelectNextIcon);
		js.executeScript("arguments[0].click()", EIP_Menu.RFQAlert);

		EIP_Menu.CRFQcl.click();
		Login_Steps.Logout();

	}

	@Then("^Select Expand List in Details of RFQ Value$")
	public void Select_Expand_List_and_change_the_Delivery_Schedule_Quantity() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandList));
		// EIP_Menu.ExpandList.click();
		// Thread.sleep(3000);
		js.executeScript("arguments[0].click()", EIP_Menu.ExpandList);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);

	}

	@Then("^Select Expand List in Details of SR RFQ Value$")
	public void Select_Expand_List_in_Details_of_SR_RFQ_Value() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ExpandSRList));
		Thread.sleep(500);
		// EIP_Menu.ExpandList.click();
		// Thread.sleep(3000);
		js.executeScript("arguments[0].click()", EIP_Menu.ExpandSRList);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);

	}

	@Then("^Select Expand List in Details of eAuction Reverse$")
	public void Select_Expand_List_in_Details_of_eAuction_Reverse() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.explist));
		// ((JavascriptExecutor)Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
		// EIP_Menu.explist);
		Thread.sleep(500);
		// EIP_Menu.ExpandList.click();
		// Thread.sleep(3000);
		js.executeScript("arguments[0].click()", EIP_Menu.explist);
	}

	@Then("^Select Delivery Schedule in bit values eAuction Reverse$")
	public void Select_Delivery_Schedule_in_bit_values_eAuction_Reverse() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AucRevdelschedule));
		Thread.sleep(500);
		EIP_Menu.AucRevdelschedule.click();

	}

	@Then("^Enter Quality at Delivery Schedule in Details of eAuction$")
	public void Enter_Quality_at_Delivery_Schedule_in_Details_of_eAuction() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliveryQty));
		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getDeliveryQty_RFQ());
		Thread.sleep(500);
		EIP_Menu.SaveAucRevdelschedule.click();

	}

	@Then("^Select HSN in bit values of eAuction$")
	public void Select_HSN_in_bit_values_of_eAuction() throws Throwable {

		EIP_Menu.AucHSN.click();
		Thread.sleep(500);
		EIP_Menu.selectAucHSN.click();
	}

	@Then("^Select Next button in bit values of eAuction$")
	public void Select_Next_button_in_bit_values_of_eAuction() throws Throwable {

		EIP_Menu.NextBitvalue.sendKeys(Keys.TAB, Keys.ENTER);

	}

	@Then("^Alert Accept in eAuction$")
	public void Alert_Accept_in_eAuction() throws Throwable {

		Commoncontrol.eAuctionAlert();

	}

	@Then("^Select Delivery Schedule in Details of RFQ Value$")
	public void Select_Delivery_Schedule_and_change_the_Delivery_Schedule_Quantity() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DelSchedule));
		EIP_Menu.DelSchedule.click();

	}

	@Then("^Select Service Delivery Schedule in Details of RFQ Value$")
	public void Select_Service_Delivery_Schedule_and_change_the_Delivery_Schedule_Quantity() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.PageDownAcknowledgeBQ);
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DelSchedule));
		EIP_Menu.DelSchedule.click();

	}

	@Then("^Enter Quality at Delivery Schedule in Details of RFQ Value$")
	public void Enter_Quality_at_Delivery_Schedule_in_Details_of_RFQ_Value() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliveryQty));
		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getDeliveryQty_RFQ());

	}

	@Then("^Verify to Enter Quality at Delivery Schedule in Details of PR RFQ Value$")
	public void Enter_Quality_at_Delivery_Schedule_in_Details_of_PR_RFQ_Value() throws Throwable {

		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliveryQty));
		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getNotEqualQuantity_PRRFQ());

		System.out.println("Enter Not Equal Quality at Delivery Schedule in Details of PR RFQ Value");

		Thread.sleep(500);
		try {
			EIP_Menu.RDEdirSaveDraft.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDEdirSaveDraft);

		}

		System.out.println("Select Save & Close Button in Delivery Schedule");
		Thread.sleep(1000);
		assertEquals("Error", EIP_Menu.ErrorAlert.getText());
		System.err.println("Alert Type = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(900);
		assertEquals("Quantity value should be equal to Total Quantity", EIP_Menu.ErrorAlertText.getText());
		System.err.println("Add Quantity Alert Text = " + EIP_Menu.ErrorAlertText.getText());
		Thread.sleep(500);
		if (!EIP_Menu.AcceptAlertR.isEnabled()) {
			System.err.println("Alert Button is Disabled");
		} else {
			System.out.println("Alert Button is Enabled");
		}

		Thread.sleep(1000);

		Commoncontrol.eAuctionAlert();
		System.out.println("Quantity value should be equal to Total Quantity Alert Message Appearing when given Not eaqule Quntity");

		Thread.sleep(900);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.DeliveryQty));
		EIP_Menu.DeliveryQty.click();
		EIP_Menu.DeliveryQty.clear();
		EIP_Menu.DeliveryQty.sendKeys(ConfigFileReader.getQuantity_PRRFQ());

		System.out.println("Enter Quality at Delivery Schedule in Details of PR RFQ Value");

		Thread.sleep(900);
		try {
			EIP_Menu.RDEdirSaveDraft.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RDEdirSaveDraft);

		}

		System.out.println("Select Save & Close Button in Delivery Schedule");

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		System.out.println("Accept Alert When give Valide Quantity");

	}

	@Then("^Select Save and Close Button then Accept Alert in Delivery Schedule$")
	public void Select_Save_and_Close_Button_in_Delivery_Schedule() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandClose));
		EIP_Menu.SaveandClose.click();
		EIP_Menu.AlertOk.click();
		EIP_Menu.AdRfqVal.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Savedrf));
		EIP_Menu.Savedrf.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AlertOk));
		EIP_Menu.AlertOk.click();
		EIP_Menu.CRFQcl.click();
	}

	@Then("^Select SR Save and Close Button then Accept Alert in Delivery Schedule$")
	public void Select_SR_Save_and_Close_Button_in_Delivery_Schedule() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandCloseSR));
		EIP_Menu.SaveandCloseSR.click();
		EIP_Menu.AlertOk.click();
		EIP_Menu.AdRfqVal.click();
		Thread.sleep(500);

	}

	@Then("^Select HSN in Purchase Request RFQ Create Page$")
	public void Select_HSN_in_Purchase_Request_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.HSN));
		Thread.sleep(3000);
		EIP_Menu.HSN.click();
		Thread.sleep(1000);
		EIP_Menu.SelectVendor.click();
		System.out.println("Select HSN in Purchase Request RFQ Create Page");

		Thread.sleep(2000);

		try {
			EIP_Menu.SelectNextIconPaymentTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextIconPaymentTerms);

		}

		System.out.println("Accept Alert after Select HSN in Purchase Request RFQ Create Page");

		Commoncontrol.eAuctionAlert();

	}

	@Then("^Select SAC Code in SR RFQ Create$")
	public void Select_SAC_Code_in_SR_RFQ_Create() throws Throwable {
		EIP_Menu.SACCode.click();
		Thread.sleep(500);
		EIP_Menu.SelectSACCode.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Savedrf));

		EIP_Menu.Savedrf.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AlertOk));
		EIP_Menu.AlertOk.click();
		EIP_Menu.CRFQcl.click();
		Login_Steps.Logout();

	}

	@Then("^Select SAC Code in Service RD RFQ Create$")
	public void Select_SAC_Code_in_Service_RD_RFQ_Create() throws Throwable {
		EIP_Menu.SACCode.click();
		Thread.sleep(500);
		EIP_Menu.SelectSACCode.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Savedrf));

		EIP_Menu.Savedrf.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AlertOk));
		EIP_Menu.AlertOk.click();
		EIP_Menu.CRFQcl.click();

	}

	@Then("^Verify Add RFQ Values in Draft$")
	public void Verify_Add_RFQ_Values_in_Draft() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.LatRfq));
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.LatRfq);
		actions.perform();
		EIP_Menu.RfqEdit.click();
	}

	@Then("^Verify Scope of RFQ Values in Draft$")
	public void Verify_Scope_of_RFQ_Values_in_Draft() throws Throwable {

		EIP_Menu.getScopeofRFQ.getAttribute("Value");

		System.out.println(EIP_Menu.getScopeofRFQ.getAttribute("Value"));
		// System.out.println("Scope of RFQ = "+EIP_Menu.getScopeofRFQ.getText());

		EIP_Menu.CRFQcl.click();
		Login_Steps.Logout();

	}

	@Then("^Select Save and Close Button then Accept Alert in Delivery Schedule then Move to Vendor Page$")
	public void Select_Save_and_Close_Button_in_Delivery_Schedule_then_Move_to_Vendor_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SaveandClose));
		EIP_Menu.SaveandClose.click();
		EIP_Menu.AlertOk.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Savedrf));
		EIP_Menu.Savedrf.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AlertOk));
		EIP_Menu.AlertOk.click();
		EIP_Menu.SelectNextIconRFQCreate.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
	}

	@Then("^Verify the Payment Terms in RFQ Create Page$")
	public void Verify_the_Payment_Terms_in_RFQ_Create_Page() throws Throwable {

	}

	@Then("^Enter Release in Payment Terms Page$")
	public void Enter_Release_in_Payment_Terms_Page() throws Throwable {
		// EIP_Menu.EnterReleasePaymentTerms.click()
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		EIP_Menu.EnterReleasePaymentTerms.clear();
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getRelease_RFQ());
		System.out.println("Enter Release in Payment Terms Page");

	}

	@Then("^Enter Release in Payment Terms Auction Page$")
	public void Enter_Release_in_Payment_Terms_Auction_Page() throws Throwable {
		// EIP_Menu.EnterReleasePaymentTerms.click()
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		EIP_Menu.EnterReleasePaymentTerms.clear();
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getRelease_Auction());

	}

	@Then("^Other Cost Verificaction$")
	public void Other_Cost_Verificaction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.OverviewBQ);
		System.out.println("Move to Over View BQ");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OverviewBQ));

		try {
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", EIP_Menu.OverviewBQ);
		} catch (Exception e) {
			Thread.sleep(2000);
			EIP_Menu.OverviewBQ.click();
		}

		System.out.println("Select Over veiw in BQ");

		String OtherCost_value = EIP_Menu.OverviewOthercostValueBQ.getText();
		System.out.println("Other Cost :" + OtherCost_value);

		Thread.sleep(1000);

		try {
			EIP_Menu.OthercostBQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.OthercostBQ);

		}

		System.out.println("Select Other Cost in RFQ BQ");
		Thread.sleep(2500);
		String OtherCost_valuesummary = EIP_Menu.OthercostValueBQ.getText();
		System.out.println("Other Cost Summary :" + OtherCost_valuesummary);
		Thread.sleep(1000);
		String OtherCost_substringvalue = OtherCost_valuesummary.substring(0, 6);
		System.out.println("Substring Value : " + OtherCost_substringvalue);

		if (!OtherCost_value.equals(OtherCost_substringvalue)) {
			System.out.println("Other Cost value not equal to Other Cost Summary");
		} else {
			System.out.println("Other Cost value equal to Other Cost Summary");
		}

	}

	@Then("^Other Cost Multi vendor Verificaction$")
	public void Other_Cost_Multi_vendor_Verificaction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.OverviewBQ);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OverviewBQ));

		try {
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", EIP_Menu.OverviewBQ);
		} catch (Exception e) {
			Thread.sleep(2000);
			EIP_Menu.OverviewBQ.click();
		}

		String OtherCost_value = EIP_Menu.OverviewOthercostValueOneBQ.getText();
		System.out.println("Other Cost :" + OtherCost_value);

		Thread.sleep(1000);
		EIP_Menu.OthercostBQ.click();
		Thread.sleep(1000);
		String OtherCost_valuesummary = EIP_Menu.OthercostValueOneBQ.getText();
		System.out.println("Other Cost Summary :" + OtherCost_valuesummary);
		String OtherCost_substringvalue = OtherCost_valuesummary.substring(0, 6);
		System.out.println("Substring Value : " + OtherCost_substringvalue);

		if (!OtherCost_value.equals(OtherCost_substringvalue)) {
			System.out.println("Other Cost value not equal to Other Cost Summary");
		} else {
			System.out.println("Other Cost value equal to Other Cost Summary");
		}

	}

	@Then("^Other Cost Multi Next vendor Verificaction$")
	public void Other_Cost_Multi_Next_vendor_Verificaction() throws Throwable {
		Thread.sleep(2000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.OverviewBQ);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OverviewBQ));

		try {
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", EIP_Menu.OverviewBQ);
		} catch (Exception e) {
			Thread.sleep(2000);
			EIP_Menu.OverviewBQ.click();
		}

		Thread.sleep(2000);
		String OtherCost_valuetwo = EIP_Menu.OverviewOthercostValuetwoBQ.getText();
		System.out.println("Other Cost two :" + OtherCost_valuetwo);

		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.OthercostBQ);

		/*
		 * Thread.sleep(1000); EIP_Menu.OthercostBQ.click();
		 */
		Thread.sleep(1000);
		String OtherCost_valuesummary = EIP_Menu.OthercostValuetwoBQ.getText();
		System.out.println("Other Cost Summary :" + OtherCost_valuesummary);
		String OtherCost_substringvalue = OtherCost_valuesummary.substring(0, 6);
		System.out.println("Substring Value : " + OtherCost_substringvalue);

		if (!OtherCost_valuetwo.equals(OtherCost_substringvalue)) {
			System.out.println("Other Cost value not equal to Other Cost Summary");
		} else {
			System.out.println("Other Cost value equal to Other Cost Summary");
		}

	}

	@Then("^Select Event Payment Terms RFQ Create$")
	public void Select_Event_Payment_Terms_RFQ_Create() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectEventPaymentTerms));
		Thread.sleep(500);
		EIP_Menu.SelectEventPaymentTerms.click();

		List<WebElement> selectEP = EIP_Menu.paymentlist;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getEvent_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
			System.out.println("Select Event Payment Terms RFQ Create");

		}

	}

	@Then("^Select Event Payment Terms Auction Create$")
	public void Select_Event_Payment_Terms_Auction_Create() {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectEventPaymentTerms));
		EIP_Menu.SelectEventPaymentTerms.click();

		List<WebElement> selectEP = EIP_Menu.paymentlist;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getEvent_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	@Then("^Select Reference Value in Payment Terms RFQ Create Page$")
	public void Select_Reference_in_Value_Payment_Terms_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceValuePaymentTerms));
		Thread.sleep(500);
		EIP_Menu.SelectReferenceValuePaymentTerms.click();
		List<WebElement> selectRV = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRV) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceValue_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
			System.out.println("Select Reference Value in Payment Terms RFQ Create Page");
		}

	}

	@Then("^Select Reference Value in Payment Terms Auction Create Page$")
	public void Select_Reference_in_Value_Payment_Terms_Auction_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceValuePaymentTerms));
		Thread.sleep(500);
		EIP_Menu.SelectReferenceValuePaymentTerms.click();
		List<WebElement> selectRV = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRV) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceValue_Auc())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

			System.out.println("Select Reference Value in Payment Terms Auction Create Page");
		}

	}

	@Then("^Select Service Reference Value in Payment Terms RFQ Create Page$")
	public void Select_Service_Reference_in_Value_Payment_Terms_RFQ_Create_Page() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceValuePaymentTerms));
		EIP_Menu.SelectReferenceValuePaymentTerms.click();
		List<WebElement> selectRV = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRV) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceValue_SRRFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	@Then("^Enter Credit Days in Payment Terms RFQ Create$")
	public void Enter_Credit_Days_Payment_Terms_RFQ_Create() throws Throwable {

		EIP_Menu.SelectCreditDaysPaymentTerms.sendKeys(ConfigFileReader.getCreditDays_RFQ(), Keys.TAB);
		System.out.println("Enter Credit Days in Payment Terms RFQ Create");
	}

	@Then("^Enter Credit Days in Payment Terms Auction Create$")
	public void Enter_Credit_Days_Payment_Terms_Auction_Create() throws Throwable {

		EIP_Menu.SelectCreditDaysPaymentTerms.sendKeys(ConfigFileReader.getCreditDays_RFQ(), Keys.TAB);
		
		System.out.println("Enter Credit Days in Payment Terms Auction Create");
	}

	@Then("^Select Payment Mode in Payment Terms RFQ Create$")
	public void Select_Payment_Mode_Payment_Terms() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPaymentModePaymentTerms));
		EIP_Menu.SelectPaymentModePaymentTerms.click();
		List<WebElement> selectPM = EIP_Menu.paymentlist;
		for (WebElement webElement : selectPM) {
			if (webElement.getText().equals(ConfigFileReader.getPaymentMode_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

			System.out.println("Select Payment Mode in Payment Terms RFQ Create");

		}

	}

	@Then("^Select Payment Mode in Payment Terms Auction Create$")
	public void Select_Payment_Mode_in_Payment_Terms_Auction_Create() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPaymentModePaymentTerms));
		Thread.sleep(500);
		EIP_Menu.SelectPaymentModePaymentTerms.click();
		List<WebElement> selectPM = EIP_Menu.paymentlist;
		for (WebElement webElement : selectPM) {
			if (webElement.getText().equals(ConfigFileReader.getPaymentMode_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
System.out.println("Select Payment Mode in Payment Terms Auction Create");
		}

	}

	@Then("^Select Reference Date in Payment Terms RFQ Create$")
	public void Select_Reference_Date_in_Payment_Terms_RFQ_Create() {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceDatePaymentTerms));
		EIP_Menu.SelectReferenceDatePaymentTerms.click();

		List<WebElement> selectRD = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRD) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceDate_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
			System.out.println("Select Reference Date in Payment Terms RFQ Create");
		}
	}

	@Then("^Select Reference Date in Payment Terms Auction Create$")
	public void Select_Reference_Date_in_Payment_Terms_Auction_Create() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceDatePaymentTerms));
		Thread.sleep(500);
		EIP_Menu.SelectReferenceDatePaymentTerms.click();

		List<WebElement> selectRD = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRD) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceDate_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}
System.out.println("Select Reference Date in Payment Terms Auction Create");
		}
	}

	@Then("^Select Service Reference Date in Payment Terms RFQ Create$")
	public void Select_Service_Reference_Date_in_Payment_Terms_RFQ_Create() {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceDatePaymentTerms));
		EIP_Menu.SelectReferenceDatePaymentTerms.click();

		List<WebElement> selectRD = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRD) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceDate_SRRFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	@Then("^Verifiy the Payment Terms in RFQ Create$")
	public void Verifiy_the_Payment_Terms_in_RFQ_Create() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.paymentReleaseMatch);
		EIP_Menu.paymentReleaseMatch.click();
		Thread.sleep(300);
		String paymentMatch = EIP_Menu.paymentReleaseMatch.getText().substring(20, 22);

		System.out.println("Text=" + paymentMatch);
		int matchpaymentrelease = Integer.parseInt(paymentMatch);
		System.out.println("1st payment=" + matchpaymentrelease);
		if (matchpaymentrelease < 100) {
			EIP_Menu.Addpaym.click();
			EIP_Menu.Npayrel.clear();
			EIP_Menu.Npayrel.sendKeys(ConfigFileReader.getNewPaymentRelease_RFQ());
			EIP_Menu.SelectCreditDaysPaymentTerms.click();
			String paymentMatchOne = EIP_Menu.paymentReleaseMatch.getText().substring(20, 23);
			System.out.println("paymentMatch=" + paymentMatchOne);
			int matchpaymentreleaseone = Integer.parseInt(paymentMatchOne);
			System.out.println("Payment release=" + matchpaymentreleaseone);
			if (matchpaymentreleaseone == 100) {
				System.out.println("Inside 100 equals");
				((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
						EIP_Menu.MoveAddMat);
				EIP_Menu.delete.click();
				EIP_Menu.EnterReleasePaymentTerms.clear();
				Thread.sleep(800);
				EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getUDPaymentRelease_RFQ());
				Thread.sleep(800);
				EIP_Menu.SelectCreditDaysPaymentTerms.click();
				Thread.sleep(1000);
				EIP_Menu.SelectNextIconPaymentTerms.click();
				// EIP_Menu.AcceptAlert.click();
				Thread.sleep(1000);
				Commoncontrol.eAuctionAlert();

			}
		} else {
			assertEquals(EIP_Menu.SelectCreditDaysPaymentTerms.getAttribute("value"),
					EIP_Menu.paymentReleaseMatch.getText().subSequence(20, 22));
		}

	}

	@Then("^Verifiy the Payment Terms in Auction Create$")
	public void Verifiy_the_Payment_Terms_in_Auction_Create() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.paymentReleaseMatch);
		EIP_Menu.paymentReleaseMatch.click();
		Thread.sleep(300);
		String paymentMatch = EIP_Menu.paymentReleaseMatch.getText().substring(20, 22);

		System.out.println("Text =" + paymentMatch);
		int matchpaymentrelease = Integer.parseInt(paymentMatch);
		System.out.println("1st payment=" + matchpaymentrelease);
		if (matchpaymentrelease < 100) {
			EIP_Menu.Addpaym.click();
			Thread.sleep(500);
			EIP_Menu.Npayrel.clear();
			Thread.sleep(500);
			EIP_Menu.Npayrel.sendKeys(ConfigFileReader.getNewPaymentRelease_RFQ());
			Thread.sleep(500);
			EIP_Menu.SelectCreditDaysPaymentTerms.click();
			Thread.sleep(500);
			String paymentMatchOne = EIP_Menu.paymentReleaseMatch.getText().substring(20, 23);
			Thread.sleep(500);
			System.out.println("paymentMatch =" + paymentMatchOne);
			int matchpaymentreleaseone = Integer.parseInt(paymentMatchOne);
			System.out.println("Payment release =" + matchpaymentreleaseone);
			Thread.sleep(500);
			if (matchpaymentreleaseone == 100) {
				System.out.println("Inside 100 equals");
				((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
						EIP_Menu.AuctionMoveAddMat);
				Thread.sleep(500);
				EIP_Menu.delete.click();
				Thread.sleep(500);
				EIP_Menu.EnterReleasePaymentTerms.clear();
				Thread.sleep(500);
				EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getUDPaymentRelease_RFQ());
				Thread.sleep(500);
				EIP_Menu.SelectCreditDaysPaymentTerms.click();
				Thread.sleep(500);
				EIP_Menu.SelectNextIconPaymentTerms.click();
				// EIP_Menu.AcceptAlert.click();
				Thread.sleep(500);
				Commoncontrol.eAuctionAlert();

			}
		} else {
			assertEquals(EIP_Menu.SelectCreditDaysPaymentTerms.getAttribute("value"),
					EIP_Menu.paymentReleaseMatch.getText().subSequence(20, 22));
		}

	}

	@Then("^Verifiy the Service Payment Terms in RFQ Create$")
	public void Verifiy_the_Service_Payment_Terms_in_RFQ_Create() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.paymentReleaseMatch);
		EIP_Menu.paymentReleaseMatch.click();
		Thread.sleep(300);
		String paymentMatch = EIP_Menu.paymentReleaseMatch.getText().substring(20, 22);

		System.out.println("Text=" + paymentMatch);
		int matchpaymentrelease = Integer.parseInt(paymentMatch);
		System.out.println("1st payment=" + matchpaymentrelease);
		if (matchpaymentrelease < 100) {
			EIP_Menu.Addpaym.click();
			EIP_Menu.Npayrel.clear();
			EIP_Menu.Npayrel.sendKeys(ConfigFileReader.getNewPaymentRelease_RFQ());
			EIP_Menu.SelectCreditDaysPaymentTerms.click();
			String paymentMatchOne = EIP_Menu.paymentReleaseMatch.getText().substring(20, 23);
			System.out.println("paymentMatch=" + paymentMatchOne);
			int matchpaymentreleaseone = Integer.parseInt(paymentMatchOne);
			System.out.println("Payment release=" + matchpaymentreleaseone);
			if (matchpaymentreleaseone == 100) {
				System.out.println("Inside 100 equals");
				((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
						EIP_Menu.MoveAddSer);
				EIP_Menu.delete.click();
				EIP_Menu.EnterReleasePaymentTerms.clear();
				EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getUDPaymentRelease_RFQ());
				EIP_Menu.SelectCreditDaysPaymentTerms.click();
				EIP_Menu.SelectNextIconPaymentTerms.click();
				// EIP_Menu.AcceptAlert.click();
				Thread.sleep(500);
				Commoncontrol.eAuctionAlert();

			}
		} else {
			assertEquals(EIP_Menu.SelectCreditDaysPaymentTerms.getAttribute("value"),
					EIP_Menu.paymentReleaseMatch.getText().subSequence(20, 22));
		}

	}

	@Then("^Verifiy the Service RD Payment Terms in RFQ Create$")
	public void Verifiy_the_Service_RD_Payment_Terms_in_RFQ_Create() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.paymentReleaseMatch);
		EIP_Menu.paymentReleaseMatch.click();
		Thread.sleep(300);
		String paymentMatch = EIP_Menu.paymentReleaseMatch.getText().substring(20, 22);

		System.out.println("Text=" + paymentMatch);
		int matchpaymentrelease = Integer.parseInt(paymentMatch);
		System.out.println("1st payment=" + matchpaymentrelease);
		if (matchpaymentrelease < 100) {
			EIP_Menu.Addpaym.click();
			EIP_Menu.Npayrel.clear();
			EIP_Menu.Npayrel.sendKeys(ConfigFileReader.getNewPaymentRelease_RFQ());
			EIP_Menu.SelectCreditDaysPaymentTerms.click();
			String paymentMatchOne = EIP_Menu.paymentReleaseMatch.getText().substring(20, 23);
			System.out.println("paymentMatch=" + paymentMatchOne);
			int matchpaymentreleaseone = Integer.parseInt(paymentMatchOne);
			System.out.println("Payment release=" + matchpaymentreleaseone);
			if (matchpaymentreleaseone == 100) {
				System.out.println("Inside 100 equals");
				((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
						EIP_Menu.MoveAddSer);
				EIP_Menu.delete.click();
				EIP_Menu.EnterReleasePaymentTerms.clear();
				EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getUDPaymentRelease_RFQ());
				EIP_Menu.SelectCreditDaysPaymentTerms.click();
				EIP_Menu.SelectNextIconRDPaymentTerms.sendKeys(Keys.TAB, Keys.ENTER);
				// EIP_Menu.AcceptAlert.click();
				Thread.sleep(500);
				Commoncontrol.eAuctionAlert();

			}
		} else {
			assertEquals(EIP_Menu.SelectCreditDaysPaymentTerms.getAttribute("value"),
					EIP_Menu.paymentReleaseMatch.getText().subSequence(20, 22));
		}

	}

	@Then("^Verify the Other Terms Page in RFQ Create$")
	public void Verify_the_Other_Terms_Page_in_RFQ_Create() throws InterruptedException {
		assertEquals("Liquidity Damage", EIP_Menu.Ld.getText());
		System.out.println("Other Terms Page = " + EIP_Menu.Ld.getText());

		assertEquals("Other Cost", EIP_Menu.Oc.getText());
		System.out.println("Other Terms Page = " + EIP_Menu.Oc.getText());

		assertEquals("Defect Liablility Period", EIP_Menu.Dlp.getText());
		System.out.println("Other Terms Page = " + EIP_Menu.Dlp.getText());

		assertEquals("Special Terms & Qualifications", EIP_Menu.StQ.getText());
		System.out.println("Other Terms Page = " + EIP_Menu.StQ.getText());

		assertEquals("Additional Details", EIP_Menu.Ad.getText());
		System.out.println("Other Terms Page = " + EIP_Menu.Ad.getText());
	}

	@Then("^Verify and Fill the LD Details in Other Terms Page on RFQ Create$")
	public void Verify_and_Fill_the_LD_Details_in_Other_Terms_Page_on_RFQ_Create() throws InterruptedException {
		assertEquals("Liquidity Damage", EIP_Menu.Ld.getText());
		System.out.println("Other Terms Page = " + EIP_Menu.Ld.getText());

		Commoncontrol.OtherTermsLDApplicableDate();

	}

	@Then("^Verify and Enter Liquidity Damage in Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Liquidity_Damage_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Commoncontrol.OtherTermsLDApplicableDate();
		Commoncontrol.OtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.OtherTermsDuration();
		Commoncontrol.OtherTermsNoOfYear();
		Commoncontrol.OtherTermsMaximumofPOValue();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

	}

	@Then("^Verify and Enter Liquidity Damage in Service Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Liquidity_Damage_in_Service_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Commoncontrol.ServiceOtherTermsLDApplicableDate();
		Commoncontrol.ServiceOtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.ServiceOtherTermsDuration();
		Commoncontrol.ServiceOtherTermsNoOfYear();
		Commoncontrol.ServiceOtherTermsMaximumofPOValue();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

	}

	@Then("^Verify and Enter Liquidity Damage in RD Service Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Liquidity_Damage_in_RD_Service_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Commoncontrol.SRRDOtherTermsLDApplicableDate();
		Commoncontrol.ServiceOtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.OtherTermsDuration();
		Commoncontrol.OtherTermsRDMaximumofPOValue();
		Commoncontrol.ServiceOtherTermsNoOfYear();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

	}

	@Then("^Verify and Enter Liquidity Damage in Other Terms Page Rate Discovery on RFQ Create$")
	public void Verify_and_Enter_Liquidity_Damage_in_Other_Terms_Page_Rate_Discovery_on_RFQ_Create() throws Throwable {
		Commoncontrol.OtherTermsLDApplicableDate();
		Commoncontrol.OtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.OtherTermsDuration();
		Commoncontrol.OtherTermsRDNoOfYear();
		Commoncontrol.OtherTermsRDMaximumofPOValue();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

	}

	@Then("^Verify and Enter Other Cost in Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Other_Cost_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.OtherCostCategory();
		Commoncontrol.OtherCostCategoryValue();
		Commoncontrol.OtherCostRemarks();
		Commoncontrol.OtherCostSave();
		Commoncontrol.OtherCostAcceptAlert();

	}

	@Then("^Verify and Enter Other Cost in Rate Discovery Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Other_Cost_in_Rate_Discovery_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.OtherCostCategory();
		Commoncontrol.OtherCostRateDiscoveryCategoryValue();
		Commoncontrol.OtherCostRemarks();
		Commoncontrol.RateDiscoveryOtherCostSave();
		Commoncontrol.OtherCostAcceptAlert();

	}

	@Then("^Verify and Enter Other Cost in Rate Discovery Other Terms Page Multi Material on RFQ Create$")
	public void Verify_and_Enter_Other_Cost_in_Rate_Discovery_Other_Terms_Page_Multi_Material_on_RFQ_Create()
			throws Throwable {

		Commoncontrol.OtherCostCategory();
		Commoncontrol.OtherCostMVRateDiscoveryCategoryValue();
		Commoncontrol.OtherCostRemarks();
		Commoncontrol.RateDiscoveryOtherCostSave();
		Commoncontrol.OtherCostAcceptAlert();

	}

	@Then("^Verify and Enter Defect Liablility Period in Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Defect_Liablility_Period_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.DurationDefectLiablilityPeriod();
		Commoncontrol.EventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();

	}

	@Then("^Verify and Enter Defect Liablility Period in Service Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Defect_Liablility_Period_in_Service_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.ServiceDurationDefectLiablilityPeriod();
		Commoncontrol.ServiceEventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();

	}

	@Then("^Verify and Enter Defect Liablility Period in RD Service Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Defect_Liablility_Period_in_RD_Service_Other_Terms_Page_on_RFQ_Create()
			throws Throwable {

		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.ServiceRDDurationDefectLiablilityPeriod();
		Commoncontrol.EventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();

	}

	@Then("^Enter Other Terms Page on RFQ Create$")
	public void Enter_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Commoncontrol.OtherTermsLDApplicableDate();
		Commoncontrol.OtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.OtherTermsDuration();
		Commoncontrol.OtherTermsNoOfYear();
		Commoncontrol.OtherTermsMaximumofPOValue();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();
		Commoncontrol.OtherCostCategory();
		Commoncontrol.OtherCostCategoryValue();
		Commoncontrol.OtherCostRemarks();
		Commoncontrol.OtherCostSave();
		Commoncontrol.OtherCostAcceptAlert();
		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.DurationDefectLiablilityPeriod();
		Commoncontrol.EventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();
		Commoncontrol.PRPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.ClearSTQ);
		Commoncontrol.SaveSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.RequestEssentialsAdditionalDetails();

	}

	@Then("^Enter Other Terms Page on PR RFQ Create$")
	public void Enter_Other_Terms_Page_on_PR_RFQ_Create() throws Throwable {
		Commoncontrol.OtherTermsLDApplicableDate();
		Commoncontrol.OtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.OtherTermsDuration();
		Commoncontrol.OtherTermsNoOfYear();
		Commoncontrol.OtherTermsMaximumofPOValue();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

		Commoncontrol.OtherCostCategory();
		Commoncontrol.OtherCostCategoryValue();
		Commoncontrol.OtherCostRemarks();
		Commoncontrol.OtherCostSave();
		Commoncontrol.OtherCostAcceptAlert();
		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.DurationDefectLiablilityPeriod();
		Commoncontrol.EventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();
		Commoncontrol.PRPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.ClearSTQ);
		Commoncontrol.SavePRSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.PRRequestEssentialsAdditionalDetails();

	}

	@Then("^Enter Other Terms Page on PR Refer RFQ Create$")
	public void Enter_Other_Terms_Page_on_PR_Refer_RFQ_Create() throws Throwable {
		Commoncontrol.OtherTermsLDAuctionApplicableDate();
		Commoncontrol.OtherTermsLDValueAppliedOn();
		/*
		 * Commoncontrol.OtherTermsLDvaluePercentage();
		 * Commoncontrol.OtherTermsDuration(); Commoncontrol.OtherTermsNoOfYear();
		 * Commoncontrol.OtherTermsMaximumofPOValue();
		 */
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

		Commoncontrol.OtherCostCategory();
		/*
		 * Commoncontrol.OtherCostCategoryValue(); Commoncontrol.OtherCostRemarks();
		 */
		Commoncontrol.OtherCostSave();
		Commoncontrol.OtherCostAcceptAlert();
		// Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.DurationDefectLiablilityAuctionPeriod();
		Commoncontrol.EventsDefectLiablilityAuctionPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();
		Commoncontrol.PRAuctionPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AuctionNavigate);
		Commoncontrol.SavePRSpecialAuctionTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.PRRequestEssentialsAdditionalDetails();

	}

	@Then("^Enter Other Terms Page on Auction RFQ Create$")
	public void Enter_Other_Terms_Page_on_Auction_RFQ_Create() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AdditionalDetails.click();
		Thread.sleep(500);
		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.AuctionRequestEssentialsRFQAdditionalDetails();

	}

	@Then("^Enter Other Terms Page on SR RFQ Create$")
	public void Enter_Other_Terms_Page_on_SR_RFQ_Create() throws Throwable {
		Commoncontrol.ServiceOtherTermsLDApplicableDate();
		Commoncontrol.ServiceOtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.ServiceOtherTermsDuration();
		Commoncontrol.ServiceOtherTermsNoOfYear();
		Commoncontrol.ServiceOtherTermsMaximumofPOValue();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.ServiceDurationDefectLiablilityPeriod();
		Commoncontrol.ServiceEventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();

		Commoncontrol.SRPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.ClearSTQ);
		Commoncontrol.SaveSRSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		// Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.PRRequestEssentialsAdditionalDetails();

	}

	@Then("^Enter Other Terms Page on Capital PR RFQ Create$")
	public void Enter_Other_Terms_Page_on_Capital_PR_RFQ_Create() throws Throwable {

		Commoncontrol.CapitalPRShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.CapitalPRRequestEssentialsAdditionalDetails();

	}

	@Then("^Enter Other Terms Rate Discovery Page on RFQ Create$")
	public void Enter_Other_Terms_Rate_Discovery_Page_on_RFQ_Create() throws Throwable {
		/*
		 * Commoncontrol.OtherTermsLDApplicableDate();
		 * Commoncontrol.OtherTermsLDValueAppliedOn();
		 * Commoncontrol.OtherTermsLDvaluePercentage();
		 * Commoncontrol.OtherTermsDuration(); Commoncontrol.OtherTermsRDNoOfYear();
		 * Commoncontrol.OtherTermsRDMaximumofPOValue();
		 * Commoncontrol.OtherTermsLDSave(); Commoncontrol.AcceptAlertLD();
		 */

		/*
		 * Commoncontrol.OtherCostCategory();
		 * Commoncontrol.OtherCostRateDiscoveryCategoryValue();
		 * Commoncontrol.OtherCostRemarks(); Commoncontrol.OtherCostSave();
		 * Commoncontrol.OtherCostAcceptAlert();
		 * Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		 * Commoncontrol.DurationDefectLiablilityPeriod();
		 * Commoncontrol.EventsDefectLiablilityPeriod();
		 * Commoncontrol.SavebDefectLiablilityPeriod();
		 * Commoncontrol.DefectLiablilityPeriodAcceptAlert();
		 * Commoncontrol.PaymentTermsSpecialTermsQualifications();
		 * 
		 * ((JavascriptExecutor)
		 * Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
		 * EIP_Menu.checkCD); Commoncontrol.SaveSpecialTermsQualifications();
		 * Commoncontrol.SpecialTermsQualificationsAcceptAlert();
		 */
		Thread.sleep(500);
		EIP_Menu.Ad.click();
		Thread.sleep(500);
		EIP_Menu.SD.click();
		Thread.sleep(500);
		Commoncontrol.SelectBillingToShippingToRateDiscoveryRFQ();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.RequestEssentialsAdditionalDetails();

	}

	@Then("^Enter Other Terms SR Rate Discovery Page on RFQ Create$")
	public void Enter_Other_Terms_SR_Rate_Discovery_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.SRRDOtherTermsLDApplicableDate();
		Commoncontrol.ServiceOtherTermsLDValueAppliedOn();
		Commoncontrol.OtherTermsLDvaluePercentage();
		Commoncontrol.OtherTermsDuration();
		Commoncontrol.OtherTermsRDMaximumofPOValue();
		Commoncontrol.ServiceOtherTermsNoOfYear();
		Commoncontrol.OtherTermsLDSave();
		Commoncontrol.AcceptAlertLD();

		Commoncontrol.DPLPeriodDefectLiablilityPeriod();
		Commoncontrol.ServiceRDDurationDefectLiablilityPeriod();
		Commoncontrol.EventsDefectLiablilityPeriod();
		Commoncontrol.SavebDefectLiablilityPeriod();
		Commoncontrol.DefectLiablilityPeriodAcceptAlert();

		Commoncontrol.SRPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.ClearSTQ);
		Commoncontrol.SaveSRSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

		Commoncontrol.SRShipmentDetailsRDAdditionalDetails();
		// Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.SRRDRequestEssentialsAdditionalDetails();

	}

	@Then("^Verify and Enter Special Terms Qualifications in Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Special_Terms_Qualifications_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Commoncontrol.PaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.checkCD);
		Commoncontrol.SaveSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

	}

	@Then("^Verify and Enter Special Terms Qualifications in Other Terms Page on PR RFQ Create$")
	public void Verify_and_Enter_Special_Terms_Qualifications_in_Other_Terms_Page_on_PR_RFQ_Create() throws Throwable {
		Commoncontrol.PRPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.checkCD);
		Commoncontrol.SavePRSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

	}

	@Then("^Verify and Enter Special Terms Qualifications in Other Terms Page on SR RFQ Create$")
	public void Verify_and_Enter_Special_Terms_Qualifications_in_Other_Terms_Page_on_SR_RFQ_Create() throws Throwable {
		Commoncontrol.SRPaymentTermsSpecialTermsQualifications();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.ClearSTQ);
		Commoncontrol.SaveSRSpecialTermsQualifications();
		Commoncontrol.SpecialTermsQualificationsAcceptAlert();

	}

	@Then("^Verify and Enter Additional Details in Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Additional_Details_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Ad.click();
		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.RDRequestEssentialsAdditionalDetailsHeadless();

	}

	@Then("^Verify and Enter Additional Details in Other Terms Page on Auction Create$")
	public void Verify_and_Enter_Additional_Details_in_Other_Terms_Page_on_Auction_Create() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Ad.click();
		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		Commoncontrol.AucTradeDetailsAdditionalDetails();
		Commoncontrol.AucRequestEssentialsAdditionalDetails();

	}

	@Then("^Verify and Enter Additional Details in Other Terms Page on Rate Discovery Auction Create$")
	public void Verify_and_Enter_Additional_Details_in_Other_Terms_Page_on_Rate_Discovery_Auction_Create()
			throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Ad.click();
		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingToRD();
		Commoncontrol.AucTradeDetailsAdditionalDetails();
		Commoncontrol.AucRequestEssentialsAdditionalDetailsPL();

	}

	/*
	 * @Then("^Verify and Enter Additional Details in Other Terms Page on Rate Discovery Auction Create$"
	 * ) public void
	 * Verify_and_Enter_Additional_Details_in_Other_Terms_Page_on_Rate_Discovery_Auction_Create
	 * () throws Throwable { Thread.sleep(500); EIP_Menu.Ad.click();
	 * Commoncontrol.ShipmentDetailsAdditionalDetails();
	 * Commoncontrol.SelectBillingToShippingToRD();
	 * Commoncontrol.AucTradeDetailsAdditionalDetails();
	 * Commoncontrol.AucRequestEssentialsAdditionalDetails();
	 * 
	 * }
	 */

	@Then("^Verify and Enter Additional Details in Other Terms Page on Refrence RFQ Auction Create$")
	public void Verify_and_Enter_Additional_Details_in_Other_Terms_Page_on_Refrence_RFQ_Auction_Create()
			throws Throwable {
		Thread.sleep(500);
		// EIP_Menu.Ad.click();
		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingToAuctionRefRFQ();
		Commoncontrol.AucTradeDetailsAdditionalDetails();
		Commoncontrol.AucMatRequestEssentialsAdditionalDetails();

	}

	@Then("^Verify and Enter Additional Details in Service Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Additional_Details_in_Service_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.ShipmentDetailsAdditionalDetails();
		Commoncontrol.SelectBillingToShippingTo();
		// Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.PRRequestEssentialsAdditionalDetails();

	}

	@Then("^Verify and Enter Additional Details in Rate Discovery Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Additional_Details_in_Rate_Discovery_Other_Terms_Page_on_RFQ_Create()
			throws Throwable {

		Commoncontrol.ShipmentDetailsRDAdditionalDetails();
		Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.RDRequestEssentialsAdditionalDetailsHeadless();

	}

	@Then("^Verify and Edit Additional Details in Rate Discovery Other Terms Page on RFQ Create$")
	public void Verify_and_Edit_Additional_Details_in_Rate_Discovery_Other_Terms_Page_on_RFQ_Create() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.Ad.click();
		System.out.println("Select Additional Details in RFQ Edit Page");
		/*
		 * Commoncontrol.ShipmentDetailsRDAdditionalDetails();
		 * Commoncontrol.TradeDetailsAdditionalDetails();
		 * Commoncontrol.RDRequestEssentialsAdditionalDetailsHeadless();
		 */
		Thread.sleep(1500);
		EIP_Menu.OCSave.click();

		System.out.println("Select Save button in Additional Details RFQ Edit Page");
		Thread.sleep(1500);
		EIP_Menu.AlertOk.click();
		System.out.println("Accept Alert in Additional Details RFQ Edit Page");
		Thread.sleep(5000);
		EIP_Menu.SelectNextIconPaymentTerms.click();

		System.out.println("Select Next button in Additional Details RFQ Edit Page");

	}

	@Then("^Verify and Enter Additional Details in SR Rate Discovery Other Terms Page on RFQ Create$")
	public void Verify_and_Enter_Additional_Details_in_SR_Rate_Discovery_Other_Terms_Page_on_RFQ_Create()
			throws Throwable {

		Commoncontrol.SRShipmentDetailsRDAdditionalDetails();
		// Commoncontrol.TradeDetailsAdditionalDetails();
		Commoncontrol.SRRDRequestEssentialsAdditionalDetails();

	}

	@Then("^Verify and Select Attachment in Other Terms Page on RFQ Create$")
	public void Verify_and_Select_Attachment_Details_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.Attachment();
		Commoncontrol.AttachmentRFQCreation();

	}

	@Then("^Verify and Edit Attachment in Other Terms Page on RFQ Create$")
	public void Verify_and_Edit_Attachment_Details_in_Other_Terms_Page_on_RFQ_Create() throws Throwable {

		Commoncontrol.Attachment();
		Commoncontrol.EditAttachmentRFQCreation();

	}

	@Then("^Verify and Select Attachment in Other Terms Page on Auction Create$")
	public void Verify_and_Select_Attachment_Details_in_Other_Terms_Page_on_Auction_Create() throws Throwable {

		// Commoncontrol.Attachment();
		Commoncontrol.AttachmentAuctionCreation();

	}

	@Then("^Verify and Select Attachment in Other Terms Page on Revers Auction Create$")
	public void Verify_and_Select_Attachment_Details_in_Other_Terms_Page_on_Revers_Auction_Create() throws Throwable {

		// Commoncontrol.Attachment();
		Commoncontrol.AttachmentAuctionReversCreation();

	}

	@Then("^Verify and Select Attachment in Other Terms Page on Revers Rate DiscoveryAuction Create$")
	public void Verify_and_Select_Attachment_Details_in_Other_Terms_Page_on_Revers_Rate_Discovery_Auction_Create()
			throws Throwable {

		// Commoncontrol.Attachment();
		Commoncontrol.AttachmentAuctionReversRateDiscoveryCreation();

	}

	@Then("^Verify and Select Attachment in Other Terms Page on Reverse Purchase Request Auction Create$")
	public void Verify_and_Select_Attachment_Details_in_Other_Terms_Page_on_Revers_Purchase_Request_Auction_Create()
			throws Throwable {

		// Commoncontrol.Attachment();
		Commoncontrol.AttachmentAuctionReversePurchaseRequestCreation();

	}

	@Then("^Verify and Select Rate Discovery Button RFQ Create$")
	public void Verify_and_Select_Rate_Discovery_Button_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoveryRFQCreateAddMaterial();

	}

	@Then("^Verify Rate Discovery RFQ Create Page$")
	public void Verify_Rate_Discovery_RFQ_Create_Page() throws Throwable {

		Commoncontrol.RateDiscoveryRFQCreatePageVerification();

	}

	@Then("^Verify and Select Rate Discovery Button Service RFQ Create$")
	public void Verify_and_Select_Rate_Discovery_Button_Service_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoveryRFQCreateAddService();

	}

	@Then("^Verify and Rate Discovery RFQ Create$")
	public void Verify_and_Rate_Discovery_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoveryRFQCreatePage();

	}

	@Then("^Verify Add RFQ Values Page in Rate Discovery RFQ Create$")
	public void Verify_Add_RFQ_Values_Page_in_Rate_Discovery_RFQ_Create() throws Throwable {

		Thread.sleep(1000);

		try {
			EIP_Menu.SelectNextSRRDRFQ.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectNextSRRDRFQ);

		}
		Thread.sleep(600);
		assertEquals("Error", EIP_Menu.ErrorAlert.getText());
		System.err.println("Alert Type = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(600);
		assertEquals("Please Enter the Scope Of RFQ !!!", EIP_Menu.ErrorAlertText.getText());
		System.err.println("Alert Message = " + EIP_Menu.ErrorAlertText.getText());
		Thread.sleep(600);

		Commoncontrol.enabled_or_not(EIP_Menu.AcceptAlertR);
		if (!EIP_Menu.AcceptAlertR.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(1000);

		EIP_Menu.AcceptAlertR.click();

		System.out.println("Verified whether without Enter Scope Not Allow to Save draft it show Error Alert");

	}

	@Then("^Verify and Rate Discovery Service RFQ Create$")
	public void Verify_and_Rate_Discovery_Service_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoveryRFQSeriveCreatePage();

	}

	@Then("^Verify and Select Add Cart Rate Discovery in RFQ Create$")
	public void Verify_and_Select_Add_Cart_Rate_Discovery_in_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoverySelectCartRFQCreateAddMaterial();

	}

	@Then("^Verify and Enter Details on Material Cart in Rate Discovery RFQ Create$")
	public void Verify_and_Enter_Details_on_Material_Cart_in_Rate_Discovery_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoveryCartVerifyRFQCreateAddMaterial();

	}

	@Then("^Verify and Enter Details on Add RFQ Values Cart in Service Rate Discovery RFQ Create$")
	public void Verify_and_Enter_Details_on_Add_RFQ_Values_Cart_in_Service_Rate_Discovery_RFQ_Create()
			throws Throwable {

		Commoncontrol.ServiceRateDiscoveryCartVerifyRFQCreateAddRFQValue();

		/*
		 * Thread.sleep(500); EIP_Menu.EnterScopeOfRFQ.click();
		 * EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RDRFQ());
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantityRDSR
		 * )); EIP_Menu.EnterQuantityRDSR.click(); EIP_Menu.EnterQuantityRDSR.clear();
		 * EIP_Menu.EnterQuantityRDSR.sendKeys(ConfigFileReader.getQuantity_RFQ());
		 * Thread.sleep(500); EIP_Menu.SRSuggRDService.click();
		 * EIP_Menu.SRSuggRDService.clear();
		 * EIP_Menu.SRSuggRDService.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		 * EIP_Menu.SACCode.click(); Thread.sleep(500); EIP_Menu.SelectSACCode.click();
		 */

	}

	@Then("^Verify and Enter Details on Service Cart in Rate Discovery RFQ Create$")
	public void Verify_and_Enter_Details_on_Service_Cart_in_Rate_Discovery_RFQ_Create() throws Throwable {

		Commoncontrol.RateDiscoveryRFQCreateAddService();
		Commoncontrol.RateDiscoveryRFQSeriveCreatePage();
		Commoncontrol.RateDiscoverySelectCartRFQCreateAddMaterial();
		Commoncontrol.RateDiscoveryEnterServiceCategory();
		Commoncontrol.RateDiscoverySelectServiceGroup();
		Commoncontrol.RateDiscoveryServiceSelectChooseItems();
		Commoncontrol.ServiceRateDiscoverySelectChooseItemsPostAndMove();

	}

	@Then("^Rate Discovery Cart Verification$")
	public void Rate_Discovery_Cart_Verification() throws Throwable {

		Commoncontrol.RateDiscoveryCartVerification();

	}

	@Then("^Rate Discovery Material Category Verification$")
	public void Rate_Discovery_Material_Category_Verification() throws Throwable {

		Commoncontrol.RateDiscoveryEnterMaterialCategory();

	}

	@Then("^Rate Discovery Service Category Verification$")
	public void Rate_Discovery_Service_Category_Verification() throws Throwable {

		Commoncontrol.RateDiscoveryEnterServiceCategory();

	}

	@Then("^Rate Discovery Material Group Verification$")
	public void Rate_Discovery_Material_Group_Verification() throws Throwable {

		Commoncontrol.RateDiscoverySelectMaterialGroup();

	}

	@Then("^Rate Discovery Service Group Verification$")
	public void Rate_Discovery_Service_Group_Verification() throws Throwable {

		Commoncontrol.RateDiscoverySelectServiceGroup();

	}

	@Then("^Rate Discovery Choose Items Verification$")
	public void Rate_Discovery_Choose_Items_Verification() throws Throwable {

		Commoncontrol.RateDiscoverySelectChooseItems();

	}

	@Then("^Rate Discovery Multi material Choose Items Verification$")
	public void Rate_Discovery_Multi_material_Choose_Items_Verification() throws Throwable {

		Commoncontrol.RateDiscoverySelectMultiMaterialChooseItems();

	}

	@Then("^Service Rate Discovery Choose Items Verification$")
	public void Service_Rate_Discovery_Choose_Items_Verification() throws Throwable {

		Commoncontrol.RateDiscoveryServiceSelectChooseItems();

	}

	@Then("^Rate Discovery Choose Items Post And Move Verification$")
	public void Rate_Discovery_Choose_Items_Post_And_Move_Verification() throws Throwable {

		Commoncontrol.RateDiscoverySelectChooseItemsPostAndMove();

	}

	@Then("^Service Rate Discovery Choose Items Post And Move Verification$")
	public void Service_Rate_Discovery_Choose_Items_Post_And_Move_Verification() throws Throwable {

		Commoncontrol.ServiceRateDiscoverySelectChooseItemsPostAndMove();

	}

//eAuction
	@Then("^Verify to list eAuction in Search Menu and Navigate the eAuction Home Page after select Auction in Search Menu Result$")
	public void Verify_To_list_eAuction_in_menu_after_Enter_Auction_in_Search_Menu() throws Throwable {
		Commoncontrol.eAuctionHomePageSearchMenu();
	}

	@Then("^eAuction Home Page Verification$")
	public void eAuction_home_page_verification() throws Throwable {
		Commoncontrol.eAuctionHomePageVerification();

	}

	@Then("^Verify to Select eAuction Create icon$")
	public void Verify_to_Select_eAuction_Create_icon() throws Throwable {
		Commoncontrol.eAuctionHomePageAddIcon();
	}

	@Then("^eAuction Login and Select Auction Create$")
	public void eAuction_Login_and_Select_Auction_Create() throws Throwable {
		Commoncontrol.eAuctionLoginandSelectCreate();
		// Commoncontrol.eAuctionHomePageSearchMenu();

	}

	@Then("^Verify Schedule Essentials in eAuction Create$")
	public void Verify_Schedule_Essentials_in_eAuction_Create() throws Throwable {
		Commoncontrol.eAuctionScheduleEssentialsVerification();
	}

	@Then("^Enter Scope Of eAuction Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionScheduleEssentialsEnterAuctionScope();

	}

	@Then("^Enter Scope Of eAuction Reverse Purchase Request Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_Reverse_Purchase_Request_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionReversePurchaseRequestScope();

	}

	@Then("^Enter Scope Of eAuction Rank Order Reverse Purchase Request Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_Rank_Order_Reverse_Purchase_Request_Create_Schedule_Essentials()
			throws Throwable {

		Commoncontrol.eAuctionRankOrderReversePurchaseRequestScope();

	}

	@Then("^Enter Scope Of eAuction Reverse Request For Quote Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_Reverse_Request_For_Quote_Create_Schedule_Essentials() throws Throwable {
		Thread.sleep(500);
		Commoncontrol.eAuctionReverseRequestForQuoteScope();

	}

	@Then("^Enter Scope Of eAuction RRD Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_RRD_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionReverseRDEnterAuctionScope();

		System.out.println("Enter Scope Of eAuction RRD Create Schedule Essentials");
	}

	@Then("^Select Partial Bidding Create eAuction")
	public void Select_Partial_Bidding_Create_eAuction() throws Throwable {

		Thread.sleep(1500);

		try {
			EIP_Menu.PartialBidding.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PartialBidding);

		}

	}

	@Then("^Enter Scope Of eAuction RORRD Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_RORRD_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionRORRDEnterAuctionScope();

	}

	@Then("^Enter Scope Of eAuction ROFRD Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_ROFRD_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionROFRDEnterAuctionScope();

	}

	@Then("^Enter Scope Of eAuction FDRD Create Schedule Essentials")
	public void Enter_Scope_Of_eAuction_FDRD_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionFDRDEnterAuctionScope();

	}

	@Then("^Select Package eAuction Create Schedule Essentials")
	public void Select_Package_eAuction_Create_Schedule_Essentials() throws Throwable {

		EIP_Menu.Package.click();

	}

	@Then("^Select Auction Source for eAuction Create")
	public void Select_Auction_Source_for_eAuction_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionAuctionSource();

	}

	@Then("^Select Auction Source Reverse for eAuction Create")
	public void Select_Auction_Source_Reverse_for_eAuction_Create_Schedule_Essentials() throws Throwable {

		Commoncontrol.eAuctionReverseAuctionSource();
		Commoncontrol.eAuctionReverseRDSRNext();
		
		System.out.println("Select Auction Source Reverse for eAuction Create");

	}

	@Then("^Select Base Rate Applicable for eAuction Create")
	public void Select_Base_Rate_Applicable_for_eAuction_Create_Schedule_Essentials() throws Throwable {

		Thread.sleep(2500);
		EIP_Menu.BRA.click();

	}

	@Then("^Select eAuction Reverse Purchase Request for eAuction Create")
	public void Select_eAuction_Reverse_Purchase_Request_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionReversPurchaseRequest();

	}

	@Then("^Select eAuction Rank Order Reverse Purchase Request for eAuction Create")
	public void Select_eAuction_Rank_Order_Reverse_Purchase_Request_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionRankOrderReversePurchaseRequest();

		// Commoncontrol.eAuctionReverseRDSRNext();

	}

	@Then("^Select eAuction Reverse Request For Quote for eAuction Create")
	public void Select_eAuction_Reverse_Request_For_Quote_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionReverseRequestForQuote();
		Commoncontrol.SelecteAuctionRequestForQuote();

	}

	@Then("^Select Auction Type Rank Order Reverse for eAuction Create")
	public void Select_Auction_Type_Rank_Order_Reverse_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionRORAuctionType();
		Commoncontrol.eAuctionReverseAuctionSource();
		Commoncontrol.eAuctionReverseRDSRNext();

	}

	@Then("^Select Auction Type Rank Order Forward for eAuction Create")
	public void Select_Auction_Type_Rank_Order_Forward_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionROFAuctionType();
		Commoncontrol.eAuctionReverseAuctionSource();
		Commoncontrol.eAuctionReverseRDSRNext();

	}

	@Then("^Select Auction Type Rank Order Reverse Purchase Request for eAuction Create")
	public void Select_Auction_Type_Rank_Order_Reverse_Purchase_Request_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionRORAuctionType();

	}

	@Then("^Select Auction Type Forward for eAuction Create")
	public void Select_Auction_Type_Forward_for_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionFDAuctionType();
		Commoncontrol.eAuctionReverseAuctionSource();
		Commoncontrol.eAuctionReverseRDSRNext();

	}

	@Then("^Select Material Cart and Auction Material Category and Material Groujp in Bid Values")
	public void Select_Material_Cart_and_Auction_Material_Category_and_Material_Groujp_in_Bid_Values()
			throws Throwable {

		Commoncontrol.RateDiscoveryCartVerifyAuctiomCreateAddMaterial();

	}

	@Then("^Enter Desciption Reverse Rate discovery for Bid Values eAuction Create")
	public void Enter_Desciption_Reverse_Rate_discovery_for_Bid_Values_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionReverseRDDesciption();
		Commoncontrol.eAuctionReverseRDQuantity();
		// 1
		Commoncontrol.RRDUOM();
		Commoncontrol.eAuctionReverseRDSuggRate();
		Commoncontrol.eAuctionReverseRDBitvalueNext();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlertR.click();
		Commoncontrol.eAuctionAlert();
		
		System.out.println("Enter Desciption Reverse Rate discovery for Bid Values eAuction Create");

	}

	@Then("^Enter Desciption Reverse Rate discovery for Bid Values eAuction Add Create")
	public void Enter_Desciption_Reverse_Rate_discovery_for_Bid_Values_eAuction_Add_Create() throws Throwable {

		Commoncontrol.eAuctionReverseRDDesciption();
		Commoncontrol.eAuctionReverseRDNewQuantity();
		Commoncontrol.RRDUOM();
		Commoncontrol.eAuctionReverseRDSuggRate();
		Commoncontrol.eAuctionReverseRDBitvalueNext();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlertR.click();
		Commoncontrol.eAuctionAlert();
		
		System.out.println("Enter Desciption Reverse Rate discovery for Bid Values eAuction Add Create");

	}

	@Then("^Enter Desciption Reverse Rate discovery for Multi material Bid Values eAuction Create")
	public void Enter_Desciption_Reverse_Rate_discovery_for_Multi_material_Bid_Values_eAuction_Create()
			throws Throwable {

		Commoncontrol.eAuctionReverseRDDesciption();
		Commoncontrol.eAuctionReverseRDQuantity();
		Commoncontrol.RRDUOM();
		Commoncontrol.eAuctionReverseRDSuggRate();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.Components);
		Thread.sleep(500);
		EIP_Menu.AddComponents.click();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.Desciption);

		Commoncontrol.eAuctionReverseSecRDDesciption();
		Commoncontrol.eAuctionReverseSecRDQuantity();
		Commoncontrol.RRDUOMSec();
		Commoncontrol.eAuctionReverseSecRDSuggRate();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.Components);
		Thread.sleep(500);
		EIP_Menu.AddComponents.click();

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.Desciption);

		Commoncontrol.eAuctionReverseThreeRDDesciption();
		Commoncontrol.eAuctionReverseThreeRDQuantity();
		Commoncontrol.RRDUOMThr();
		Commoncontrol.eAuctionReverseThreeRDSuggRate();

		Commoncontrol.eAuctionReverseRDBitvalueNext();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlertR.click();
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Enter Desciption Rank Order Reverse Rate discovery for Bid Values eAuction Create")
	public void Enter_Desciption_Rank_Order_Reverse_Rate_discovery_for_Bid_Values_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionRORRDDesciption();
		Commoncontrol.eAuctionReverseRDQuantity();
		Commoncontrol.RRDUOM();
		Commoncontrol.eAuctionReverseRDSuggRate();
		Commoncontrol.eAuctionReverseRDBitvalueNext();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlertR.click();
		Commoncontrol.eAuctionAlert();

	}

	@Then("^Enter Desciption Rank Order Forward Rate discovery for Bid Values eAuction Create")
	public void Enter_Desciption_Rank_Order_Forward_Rate_discovery_for_Bid_Values_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionROFRDDesciption();
		Commoncontrol.eAuctionReverseRDQuantity();
		Commoncontrol.RRDUOM();
		Commoncontrol.eAuctionReverseRDSuggRate();
		Commoncontrol.eAuctionReverseRDBitvalueNext();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlertR.click();
		Commoncontrol.eAuctionAlert();
	}

	@Then("^Enter Desciption Forward Rate discovery for Bid Values eAuction Create")
	public void Enter_Desciption_Forward_Rate_discovery_for_Bid_Values_eAuction_Create() throws Throwable {

		Commoncontrol.eAuctionFDRDDesciption();
		Commoncontrol.eAuctionReverseRDQuantity();
		Commoncontrol.RRDUOM();
		Commoncontrol.eAuctionReverseRDSuggRate();
		Commoncontrol.eAuctionReverseRDBitvalueNext();
		Thread.sleep(500);
		// EIP_Menu.AcceptAlertR.click();
		Commoncontrol.eAuctionAlert();

	}

	public static void selectKendoDate(String expDate) throws InterruptedException {
//splitting date
		String[] Date = expDate.split("-");
		String expDay = null;
		if (Date[0].substring(0, 1) == "0") {
			expDay = Date[0].replace("0", "");
		} else {
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

	private static void clickCalendarDate(String expDay) throws InterruptedException {// Date
		Thread.sleep(3000);

		List<WebElement> calendarLinks = Webdriver.driver.findElements(By.xpath("//kendo-virtualization//table//td"));

		for (WebElement webElement : calendarLinks) {
			if (webElement.getText().equals(expDay)) {
				webElement.click();
				break;
			}
		}
	}

	private static void clickCalendarMonth(String expMonth) {// month
		List<String> months = new ArrayList<String>();
		String[] monthsList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		months.addAll(Arrays.asList(monthsList));
		List<WebElement> calendarLinks = Webdriver.driver
				.findElements(By.xpath("//kendo-virtualization//table//td//span"));
		for (WebElement webElement : calendarLinks) {
			System.out.println("Month = " + webElement.getText());
			if (webElement.getText().equals(monthsList[Integer.parseInt(expMonth) - 1])) {
				System.out.println("Month = " + webElement.getText());
				webElement.click();
				break;
			}
		}
	}

	private static void clickCalendarYear(String expYear) throws InterruptedException {// This will get execute till
																						// system start year.

		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();

		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();

		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();

		Thread.sleep(3000);// Select years from sys start date
		Webdriver.driver.findElements(By.xpath("//td//span[@class='k-link']"));
		List<WebElement> calendarLinks = Webdriver.driver.findElements(By.xpath("//td//span[@class='k-link']"));
		for (WebElement webElement : calendarLinks) {
			if ((Integer.parseInt(webElement.getText()) - Integer.parseInt(expYear)) >= -9) {
				webElement.click();
				break;
			}
		}

		calendarLinks = Webdriver.driver.findElements(By.xpath("//td//span[@class='k-link']"));// year selection
		for (WebElement dates : calendarLinks) {
			if (Integer.parseInt(dates.getText()) == Integer.parseInt(expYear)) {
				dates.click();
				break;
			}
		}
	}


//****************************************************************************************************************************************//
	@Then("^Verify to Navigate Material Request for Quote Home Page")
	public void Verify_to_Navigate_Material_Request_for_Quote_Home_Page() throws Throwable {
		
		Thread.sleep(700);
		EIP_Menu.HomeMenu.click();
		System.out.println("Select Access Based Menu");
		Thread.sleep(1500);
		assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(300);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		Thread.sleep(500);
		assertEquals("RFQ", EIP_Menu.MenuRFQ.getText());
		System.out.println("SCM Menu = " + EIP_Menu.MenuRFQ.getText());
		EIP_Menu.MenuRFQ.click();
	
	}
	
@Then("^Verify Request for Quote Home Page")
public void Verify_Request_for_Quote_Home_Page() throws Throwable {
	
	Thread.sleep(700);
	EIP_Menu.HomeMenu.click();
	System.out.println("Select Access Based Menu");
	Thread.sleep(1500);
	assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
	System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
	Thread.sleep(300);
	EIP_Menu.SCM.click();
	assertEquals("Procurement", EIP_Menu.PRO.getText());
	System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
	EIP_Menu.PRO.click();
	Thread.sleep(500);
	assertEquals("RFQ", EIP_Menu.MenuRFQ.getText());
	System.out.println("SCM Menu = " + EIP_Menu.MenuRFQ.getText());
	EIP_Menu.MenuRFQ.click();
	
	Thread.sleep(700);
	assertEquals("Request For Quote", EIP_Menu.RFQvf.getText());
	System.out.println("RFQ Home = " + EIP_Menu.RFQvf.getText());
	Thread.sleep(900);
	assertEquals("Material", EIP_Menu.mat.getText());
	System.out.println("RFQ Home = " + EIP_Menu.mat.getText());
	Thread.sleep(900);
	assertEquals("Service", EIP_Menu.ser.getText());
	System.out.println("RFQ Home = " + EIP_Menu.ser.getText());
	Thread.sleep(900);
	assertEquals("Package", EIP_Menu.pak.getText());
	System.out.println("RFQ Home = " + EIP_Menu.pak.getText());
	Thread.sleep(2000);
	/*assertEquals("For Action", EIP_Menu.foract.getText());
	System.out.println("RFQ Home = " + EIP_Menu.foract.getText());
	Thread.sleep(900);
	Thread.sleep(500); assertEquals("In Progress", EIP_Menu.Inpro.getText());
	System.out.println("RFQ Home = " + EIP_Menu.Inpro.getText());
	Thread.sleep(900);
	Thread.sleep(500); assertEquals("All", EIP_Menu.al.getText());
	System.out.println("RFQ Home = " + EIP_Menu.al.getText());*/
	Thread.sleep(500);
	if (!EIP_Menu.AdvanceSearchHomePage.isEnabled()) {
		System.err.println("Advance Serarch Icon is Disabled");
	} else {
		System.out.println("Advance Serarch Icon is Enabled");
	}
	
	Thread.sleep(500);
	if (!EIP_Menu.SelectAddIcon.isEnabled()) {
		System.err.println("RFQ Create Icon is Disabled");
	} else {
		System.out.println("RFQ Create Icon is Enabled");
	}
	
	
	Thread.sleep(500);
	if (!EIP_Menu.AdvanceSearchTCC.isEnabled()) {
		System.err.println("Filter Icon is Disabled");
	} else {
		System.out.println("Filter Icon is Enabled");
	}
	 	
	
System.out.println("Direct to Request for Quote page verify the options like Toggle button , details view selection , search icon,  Add button , 3 types of charts projecting RFQ status");


}

@Then("^Verify to select Service in Request for Quote Home Page")
public void Verify_to_select_Service_in_Request_for_Quote_Home_Page() throws Throwable {
	
	Thread.sleep(700);
	EIP_Menu.HomeMenu.click();
	System.out.println("Select Access Based Menu");
	Thread.sleep(1500);
	assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
	System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
	Thread.sleep(300);
	EIP_Menu.SCM.click();
	assertEquals("Procurement", EIP_Menu.PRO.getText());
	System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
	EIP_Menu.PRO.click();
	Thread.sleep(500);
	assertEquals("RFQ", EIP_Menu.MenuRFQ.getText());
	System.out.println("SCM Menu = " + EIP_Menu.MenuRFQ.getText());
	EIP_Menu.MenuRFQ.click();
	
	Thread.sleep(500);
	if (!EIP_Menu.SelectService.isEnabled()) {
		System.err.println("Service Icon is Disabled");
	} else {
		System.out.println("Service Icon is Enabled");
	}
	 
Thread.sleep(500);

EIP_Menu.SelectService.click();

System.out.println("Ensure toggle button should be selected as material by default and also user can have the option to select 'Service also'");
}




@Then("^Verify to check user able to view RFQ status Graphical view in Request for Quote Home Page")
public void Verify_to_check_user_able_to_view_RFQ_status_Graphical_view_in_Request_for_Quote_Home_Page() throws Throwable {
	
	Thread.sleep(500);
	if (!EIP_Menu.ChartView.isEnabled()) {
		System.err.println("Chart View Icon is Disabled");
	} else {
		System.out.println("Chart View Icon is Enabled");
	}
	Thread.sleep(500);
	EIP_Menu.ChartView.click();
	
	System.out.println("Select Chart View Icon in Request for Quote Home Page");
	Thread.sleep(500);
	ScrollUsingJaveScript(View);
	Thread.sleep(500);
	if (!EIP_Menu.View.isEnabled()) {
		System.err.println("View Icon is Disabled");
	} else {
		System.out.println(" View Icon is Enabled");
	}
	Thread.sleep(500);
	EIP_Menu.View.click();
	System.out.println("Select View Icon in Chart View");
	Thread.sleep(500);
	ScrollUsingJaveScript(Auccl);
	Thread.sleep(500);
	EIP_Menu.Auccl.click();
	
	System.out.println("Select Close Icon in Chart View");
	

System.out.println("Check user able to view RFQ status by selecting the view as 'Graphical view'");
}




@Then("^Verify Graphical view should display three graphs Graphical view in Request for Quote Home Page")
public void Verify_Graphical_view_should_display_three_graphs_Graphical_view_in_Request_for_Quote_Home_Page() throws Throwable {
	
	Thread.sleep(500);
	if (!EIP_Menu.ChartView.isEnabled()) {
		System.err.println("Chart View Icon is Disabled");
	} else {
		System.out.println("Chart View Icon is Enabled");
	}
	Thread.sleep(500);
	EIP_Menu.ChartView.click();
	
	System.out.println("Select Chart View Icon in Request for Quote Home Page");
	Thread.sleep(500);
	assertEquals("For Action", EIP_Menu.ForAuction.getText());
	System.out.println("Graphical view = " + EIP_Menu.ForAuction.getText());
	
	Thread.sleep(500);
	assertEquals("In Progress", EIP_Menu.GVInProgress.getText());
	System.out.println("Graphical view = " + EIP_Menu.GVInProgress.getText());
	
	Thread.sleep(500);
	assertEquals("All", EIP_Menu.all.getText());
	System.out.println("Graphical view = " + EIP_Menu.all.getText());
	Thread.sleep(900);
	EIP_Menu.GridView.click();
	
	System.out.println("Ensure Graphical view should display three graphs For Action,  Inprogress and All");
	

}

}
