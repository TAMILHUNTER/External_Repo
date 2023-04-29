package stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
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
import object_repository.SCM_Purchase_Request;

public class SCM_Purchase_Request_Create extends BaseClass {

	// Read Configuration
	public static ConfigFileReader configFileReader;
	JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;

	public SCM_Purchase_Request_Create() {
		PageFactory.initElements(Webdriver.driver, EIP_Menu.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);
	public static JavascriptExecutor jse = (JavascriptExecutor) Webdriver.driver;
	public static Actions actions = new Actions(Webdriver.driver);

	// **************** Start import methods for step definition
	// ********************

	/*
	 * @Then("^Enter Purchase in Search Menu as$") public void
	 * Enter_Purchase_in_Search_Menu_as(String SM) throws Throwable { // Write code
	 * here that turns the phrase above into concrete actions
	 * 
	 * EIP_Menu.EnterPerchase.sendKeys("purchase"); }
	 */

	@Then("^Enter Purchase in Search Menu as (.*)$")
	public void Enter_Purchase_in_Search_Menu_as(String SM) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		EIP_Menu.EnterPerchase.sendKeys(SM);
	}

	@Then("^Enter General Consource in Search Menu$")
	public void Enter_General_Consource_in_Search_Menu_as() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		Commoncontrol.GRHomePageNavigateToMenu();
	}

	@Then("^Enter the Username as (.*)$")
	public void Enter_the_Username_as(String Username) throws Throwable {
		/*
		 * Login_Objects.Otheruser.click(); Login_Objects.Username.sendKeys(Username);
		 * Login_Steps.enter_the_Password(); Login_Objects.Login.click();
		 */
		Thread.sleep(2000);
		Example.login(Username);

	}

	@Then("^Select Purchase or Service in Search Menu$")
	public void Select_Purchase_menu() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPS));
		Thread.sleep(4000);
		EIP_Menu.SelectPS.click();
	}

	@Then("^Select General Consource in Search Menu$")
	public void Select_General_Consource_in_menu() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectGC));
		EIP_Menu.SelectGC.click();
	}

	@Then("^Select Advance Search$")
	public void Select_Advance_Search() throws Throwable {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRAdvanceSearch));
		
		try {
			EIP_Menu.PRAdvanceSearch.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PRAdvanceSearch);

		}
		
		
		System.out.println("Select Advance Search");
	}

	@Then("^Select Advance Search GC$")
	public void Select_Advance_Search_GC() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AdvanceSearchGC));
		Thread.sleep(2500);
		
		try {
			EIP_Menu.AdvanceSearchGC.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AdvanceSearchGC);

		}
		
		System.out.println("Select Advance Search in General Consource");
		
	}

	@Then("^Enter Doc No from DB$")
	public void Enter_Doc_No_from_DB() throws Throwable {
		Thread.sleep(4000);

		DataBaseConnection.SendPRFromDB();
	}

	@Then("^Enter Domestic Job Doc No from DB$")
	public void Enter_Domestic_Job_Doc_No_from_DB() throws Throwable {
		Thread.sleep(4000);

		DataBaseConnection.SendDJPRFromDB();
		
		System.out.println("Enter Domestic Job Doc No from DB");
	}

	@Then("^Enter Domestic Job SR No from DB$")
	public void Enter_Domestic_Job_SR_No_from_DB() throws Throwable {
		Thread.sleep(4000);

		DataBaseConnection.SendSRFromDB();
	}

	@Then("^Send PR No from DB in Allocation$")
	public void Send_PR_No_from_DB_in_Allocation() throws Throwable {
		Thread.sleep(4000);

		DataBaseConnection.SendPRAllocation();
	}

	@Then("^Send Domestic Job PR No from DB in Allocation$")
	public void Send_Domestic_Job_PR_No_from_DB_in_Allocation() throws Throwable {
		Thread.sleep(4000);

		DataBaseConnection.SendDJPRAllocation();
	}

	@Then("^Select Material in Purchases$")
	public void Select_Material_in_Purchases() throws Throwable {
	wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectMaterial));
	Thread.sleep(2000);
		EIP_Menu.SelectMaterial.click();
	//	ClickUsingTryCatch(SelectMaterial);
		System.out.println("Select Material in Purchases");
	}

	@Then("^Select Service in Purchases$")
	public void Select_Service_in_Purchases() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectServiceSR));
		Thread.sleep(2000);
		EIP_Menu.SelectServiceSR.click();
	}

	@Then("^Select Search Icon in Workbench For Action$")
	public void Select_Search_Icon_in_Workbench_For_Action() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchIcon));
		Thread.sleep(3000);
		EIP_Menu.SearchIcon.click();
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.Sdown);
	}

	@Then("^Select Search Icon in final Approval$")
	public void Select_Search_Icon_in_final_Approval() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchIcon));
		Thread.sleep(3000);
		
		try {
			EIP_Menu.TCDSearch.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDSearch);

		}
		System.out.println("Select Search Icon in Advance Search");
	}
	
	
	
	
	@Then("^Select Search Icon in Advance Search$")
	public void Select_Search_Icon_in_Advance_Search() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchIcon));
		Thread.sleep(3500);
		
		try {
			EIP_Menu.TCDSearch.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDSearch);

		}
		System.out.println("Select Search Icon in Advance Search");
	}

	

	@Then("^Click Create Request Icon in Purchases$")
	public void Click_Create_Request_Icon_in_Purchases() throws Throwable {
		 wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ClickCreateRequest));
		Thread.sleep(3000);
		
		//ClickUsingJSTryCatch(ClickCreateRequest);
		
		EIP_Menu.ClickCreateRequest.click();
		
		
		System.out.println("Select Purchases Create Icon in Material Purchases Page");
	}

	@Then("^Click Create Request Icon in Service$")
	public void Click_Create_Request_Icon_in_Service() throws Throwable {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ClickCreateRequest));
		Thread.sleep(4000);
				ClickUsingTryCatch(SRCreate);
	}

	@Then("^Enter Job in Request Essentials$")
	public void Enter_Job_in_Request_Essentials_as() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		EIP_Menu.EnterJob.sendKeys(ConfigFileReader.getPR_Job());
		System.out.println("Enter Job in Request Essentials");
	}

	@Then("^Enter Job in Request Essentials SR$")
	public void Enter_Job_in_Request_Essentials_SR() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		EIP_Menu.EnterSRJob.sendKeys(ConfigFileReader.getPR_Job(), Keys.TAB);
	}

	@Then("^Select Payment Centre$")
	public void Select_Payment_Centre() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		EIP_Menu.PaymentCentre.sendKeys(ConfigFileReader.getSR_PaymentCentre(), Keys.TAB);
	}

	@Then("^Select Service Group$")
	public void Select_Service_Group() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		EIP_Menu.SRServiceGroup.click();
		Thread.sleep(4000);
		EIP_Menu.SelSRServiceGroup.click();

		// EIP_Menu.SRServiceGroup.sendKeys(ConfigFileReader.getSR_ServiceGroup(),
		// Keys.TAB);
	}

	@Then("^Select WO Period$")
	public void Select_WO_Period() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EIP_Menu.WOPeriod.click();

		Thread.sleep(4000);
		EIP_Menu.Date.click();

	}

	@Then("^Select Service Category in Create Service Request Page$")
	public void Select_Service_Category_in_Create_Service_Request_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EIP_Menu.ServiceCategorySR.click();

		Thread.sleep(4000);
		EIP_Menu.SelectSCSR.click();

	}

	@Then("^Select Group in Create Service Request Page$")
	public void Select_Group_in_Create_Service_Request_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EIP_Menu.SRGroup.click();

		Thread.sleep(4000);
		EIP_Menu.SelectSCSR.click();

	}

	@Then("^Enter Nature of scope in Create Service Request Page$")
	public void Enter_Nature_of_scope_in_Create_Service_Request_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		EIP_Menu.NatureofscopeSR.click();
		Thread.sleep(2000);
		EIP_Menu.NatureofscopeSR.sendKeys(ConfigFileReader.getSR_Natureofscope());

	}

	@Then("^Select Cart in Create Service Request Page$")
	public void Select_Cart_in_Create_Service_Request_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		EIP_Menu.SRCart.click();

	}

	@Then("^Select Warehouse in Request Essentials$")

	public void Select_Warehouse_in_Request_Essentials_as() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.Warehouse.click();
		Thread.sleep(2000);
		EIP_Menu.Warehouse.sendKeys(ConfigFileReader.getPR_Warehouse(), Keys.ENTER);
	}

	@Then("^Select Warehouse in Request Essentials domestic Job$")

	public void Select_Warehouse_in_Request_Essentials_domestic_Job_as() throws Throwable {
		
		//ClickUsingTryCatch(Warehouse);
		Thread.sleep(2000);
		EIP_Menu.Warehouse.click();
		
		Thread.sleep(1000);
		EIP_Menu.Warehouse.sendKeys(ConfigFileReader.getPR_Warehouse(), Keys.TAB);
		
		
		
System.out.println("Select Warehouse in Request Essentials domestic Job");
	}

	@Then("^Select Warehouse in Request Essentials as$")

	public void Select_Warehouse_in_Request_Essentials() throws Throwable {
		 Thread.sleep(3000);
		EIP_Menu.Warehouse.click();
		//ClickUsingTryCatch(Warehouse);
		Thread.sleep(2000);
		EIP_Menu.Warehouse.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}

	@Then("^Enter Purchase Group in Request Essentials$")
	public void Enter_Purchase_Group_in_Request_Essentials() throws Throwable {
		 Thread.sleep(2000);
		 
		 //ClickUsingTryCatch(PurchaseGroup);
		 EIP_Menu.PurchaseGroup.click();
		
				 List<WebElement> selectEP = EIP_Menu.NCList;
	        for (WebElement webElement : selectEP) {
	            if (webElement.getText().equals(ConfigFileReader.getPR_PurchaseGroup())) {
	                webElement.click();
	                
	                break;



	           }
	            System.out.println("Select Purchase Group in Request Essentials");
	        }
	}

		
		
	/*	@Then("^Select Event Payment Terms RFQ Create as (.*)$")
	    public void Select_Event_Payment_Terms() throws Throwable {
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


		System.out.println("Enter Purchase Group in Request Essentials");

	}*/

	@Then("^Enter planning Category in Request Essentials$")
	public void Enter_planning_Category_in_Request_Essentials() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.planningCategory.click();
		
		       List<WebElement> selectEP = EIP_Menu.paymentlist;
	        for (WebElement webElement : selectEP) {
	            if (webElement.getText().equals(ConfigFileReader.getPR_planningCategory())) {
	                webElement.click();
	                // System.out.println(webElement.getText());
	                break;



	           }



	       }


		System.out.println("Enter planning Category in Request Essentials");

	}
	
	@Then("^Select Supply at in Request Essentials$")
	public void Select_Supply_at_in_Request_Essentials() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.Supplyat.click();
		
		       List<WebElement> selectEP = EIP_Menu.LISupplyat;
	        for (WebElement webElement : selectEP) {
	            if (webElement.getText().equals(ConfigFileReader.getPR_Supplyat())) {
	                webElement.click();
	                // System.out.println(webElement.getText());
	                break;



	           }



	       }


		System.out.println("Select Supply at in Request Essentials");

	}
	
	


	

	@Then("^Enter Remarks in Request Essentials$")
	public void Enter_Remarks_in_Request_Essentials_as() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		EIP_Menu.Remarks.sendKeys(ConfigFileReader.getPR_Remarks());
		System.out.println("Enter Remarks in Request Essentials");
	}

	@Then("^Choose your buyers in Need To Allocate$")
	public void Choose_your_buyers_in_Need_To_Allocate() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Chooseyourbuyers));
		Thread.sleep(4000);
		EIP_Menu.Chooseyourbuyers.click();
	}

	@Then("^Choose Domestic Job buyers in Need To Allocate$")
	public void Choose_Domestic_Job_buyers_in_Need_To_Allocate() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Chooseyourbuyers));
		Thread.sleep(4000);

		
		try {
			EIP_Menu.ChooseyourbuyersDomesticJob.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ChooseyourbuyersDomesticJob);

		}
		
		System.out.println("Choose Domestic Job buyers in Need To Allocate");
	}

	@Then("^Select Allocate in Need To Allocate$")
	public void Select_Allocate_in_Need_To_Allocate() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAllocate));
		Thread.sleep(3000);
	
		try {
			EIP_Menu.SelectAllocate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectAllocate);

		}
		System.out.println("Select Allocate in Need To Allocate");
	}

	@Then("^Enter Buyer Name in Need To Allocate$")
	public void Enter_Buyer_Name_in_Need_To_Allocate_as() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2500);
		EIP_Menu.SearchBuyerName.sendKeys(ConfigFileReader.getGC_BuyerName());
		System.out.println("Enter Buyer Name in Need To Allocate");
	}

	@Then("^Select cart after fill the Request Essentials in Purchase Request$")
	public void Select_cart_in_Request_Essentials() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);
//ClickUsingTryCatch(AddCart);

EIP_Menu.AddCart.click();
		

		
		System.out.println("Select Material cart after fill the Request Essentials in Purchase Request");
	}

	@Then("^Select Add To Cart after fill the eSource Allocation$")
	public void Select_Add_To_Cart_in_eSource_Allocation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AddToCart));
				
		ScrollUsingJaveScript(AddToCart);
				
		ClickUsingTryCatch(AddToCart);
		
		
		System.out.println("Select Add To Cart after fill the eSource Allocation");
	}

	@Then("^Select Cart in eSource Allocation$")
	public void Select_Cart_in_eSource_Allocation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectCart));
		
		ClickUsingTryCatch(SelectCart);
		
		
		System.out.println("Select Cart in eSource Allocation");
	}

	@Then("^Select eSource Allocation$")
	public void Select_eSource_Allocation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.eSourceAllocation));
		
		//ClickUsingTryCatch(eSourceAllocation);
		//EIP_Menu.eSourceAllocation.click();
		
		try {
			EIP_Menu.eSourceAllocation.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.eSourceAllocation);

		}
		
			
		System.out.println("Select eSource Allocation");
	}

	@Then("^Select Material Group PR in Material Cart$")
	public void Select_Material_Group_PR_in_Material_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRMaterialGroup));
		
		//ClickUsingTryCatch(PRMaterialGroup);
		Thread.sleep(2000);
		EIP_Menu.PRMaterialGroup.click();
		
		System.out.println("Select Material Group PR in Material Cart");
	}

	@Then("^Select All Material Group in Material Cart$")
	public void Select_All_Material_Group_in_Material_Cart() throws Throwable {
		
		//ClickUsingTryCatch(SALLMaterialGroup);
		
		Thread.sleep(2000);
		EIP_Menu.SALLMaterialGroup.click();
				
		System.out.println("Select All the Material Group in Material Cart");
	}

	@Then("^Enter Choose Items PR in Material Cart as (.*)$")
	public void Enter_Choose_Items_PR_in_Material_Cart_as(String ChooseItemsPR) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EIP_Menu.ChooseItems.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		Thread.sleep(2000);
		EIP_Menu.ChooseItems.sendKeys(ChooseItemsPR);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRChooseItems));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		// robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(4000);
		EIP_Menu.PRChooseItems.sendKeys("1");

		
	}

	@Then("^Enter Choose Items PR domestic Job in Material Cart$")
	public void Enter_Choose_Items_PR_domestic_Job_in_Material_Cart() throws Throwable {
		
		
		//ClickUsingTryCatch(PRChooseItems);
		Thread.sleep(2000);
		EIP_Menu.PRChooseItems.click();
					
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_ChooseItemsPR());
		
		System.out.println("Enter Choose Items PR domestic Job in Material Cart");
		
		Thread.sleep(3500);
		
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_ChooseItemsRePR());
		
		System.out.println("Enter Choose Items PR domestic Job in Material Cart");
		
	}

	@Then("^Enter Choose Items PR domestic Multiple material in Material Cart$")
	public void Enter_Choose_Items_PR_domestic_Multiple_material_in_Material_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// EIP_Menu.ChooseItems.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_MultiMaterialChooseItemsPR());
			Thread.sleep(4000);
			/*Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			*/
			Thread.sleep(3000);
			EIP_Menu.PRChooseItems.sendKeys("2");
			Thread.sleep(3000);
			EIP_Menu.AuctionPRAddcart.click();
			
			Thread.sleep(4000);
			EIP_Menu.PRMoveToSelectedItems.click();
			
	}
			@Then("^Enter Choose Items PR domestic Multiple material in Material1 Cart$")
			public void Enter_Choose_Items_PR_domestic_Multiple_material_in_Material1_Cart() throws Throwable {

			JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
			js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
			Thread.sleep(4000);
			EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_MultiMaterialChooseItemsPR());
								
				Thread.sleep(3000);
				EIP_Menu.PRChooseItems.sendKeys("3");
				Thread.sleep(3000);
				EIP_Menu.AuctionPRAddcart.click();
				
				Thread.sleep(4000);
				EIP_Menu.PRMoveToSelectedItems.click();
		
		
	}
			
			@Then("^Enter Choose Items PR domestic Multiple material in Material2 Cart$")
			public void Enter_Choose_Items_PR_domestic_Multiple_material_in_Material2_Cart() throws Throwable {

			JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
			js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
			Thread.sleep(4000);
			EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_MultiMaterialChooseItemsPR());
								
				Thread.sleep(3000);
				EIP_Menu.PRChooseItems.sendKeys("4");
				Thread.sleep(3000);
				EIP_Menu.AuctionPRAddcart.click();
				
				Thread.sleep(4000);
				EIP_Menu.PRMoveToSelectedItems.click();
		
		
	}
			
			@Then("^Enter Choose Items PR domestic Multiple material in Material3 Cart$")
			public void Enter_Choose_Items_PR_domestic_Multiple_material_in_Material3_Cart() throws Throwable {

			JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
			js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
			Thread.sleep(4000);
			EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_MultiMaterialChooseItemsPR());
								
				Thread.sleep(3000);
				EIP_Menu.PRChooseItems.sendKeys("5");
				Thread.sleep(3000);
				EIP_Menu.AuctionPRAddcart.click();
				
				Thread.sleep(4000);
				EIP_Menu.PRMoveToSelectedItems.click();
		
		
	}

	@Then("^Enter Choose Items SR domestic Job in Service Cart$")
	public void Enter_Choose_Items_SR_domestic_Job_in_Material_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EIP_Menu.SISR.click();
		Thread.sleep(4000);

		// EIP_Menu.ChooseItems.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getSR_ChooseItemsSR());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRChooseItems));
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		// robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.PRChooseItems.sendKeys("7");

		
	}

	@Then("^Select Item Material Group PR in Material Cart$")
	public void Select_Item_Material_Group_PR_in_Material_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Item));
Thread.sleep(2000);
		//ClickUsingTryCatch(Item);
		EIP_Menu.Item.click();
				
		System.out.println("Select Material Item in  Material Group PR in Material Cart");
	}

	@Then("^Select Item Service Group SR in Service Cart$")
	public void Select_Item_Material_Group_SR_in_Service_Cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.CISR));
		Thread.sleep(2000);
		EIP_Menu.CISR.click();
	}

	@Then("^Select Arrow To Move Choose Items in Cart$")
	public void Select_Arrow_To_Move_Choose_Items_in_Cart() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRMoveToSelectedItems));
		//ClickUsingTryCatch(PRMoveToSelectedItems);
		Thread.sleep(2000);
		EIP_Menu.PRMoveToSelectedItems.click();
				
		System.out.println("Select Arrow To Move Choose Items in Cart");

	}

	@Then("^Select Post Icon To Post the Selected Items in Cart$")
	public void Select_Post_Icon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRPost));
		
		//ClickUsingTryCatch(PRPost);
		Thread.sleep(2000);
		EIP_Menu.PRPost.click();
		
		System.out.println("Select Post Icon To Post the Selected Items in Cart");

	}

	@Then("^Select Cost Package in Request Essentials$")
	public void Select_Cost_Package_in_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.CostPackage));
		ScrollUsingJaveScript(Sdown);
		
		
		Thread.sleep(1000);
		//ClickUsingTryCatch(CostPackage);
		
		EIP_Menu.CostPackage.click();
		
		
		System.out.println("Select Cost Package in Request Essentials");

	}

	@Then("^Select Cost Package in SR Request Essentials$")
	public void Select_Cost_Package_in_SR_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCostPackage));
		Thread.sleep(2000);
		EIP_Menu.SRCostPackage.click();

	}
	
	@Then("^Select Cost Next Package in SR Request Essentials$")
	public void Select_Cost_Next_Package_in_SR_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCostPackageNext));
		Thread.sleep(2000);
		EIP_Menu.SRCostPackageNext.click();

	}


	@Then("^Enter Cost Package in Request Essentials$")
	public void Enter_Cost_Package_in_Request_Essentials() throws Throwable {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterCostPackage));
		Thread.sleep(2000);
		EIP_Menu.EnterCostPackage.sendKeys(ConfigFileReader.getPR_Cost());
		// System.out.println(Cost);
		Thread.sleep(2000);
		EIP_Menu.EnterCostPackage.sendKeys(Keys.HOME, Keys.DELETE);
		Thread.sleep(2000);
		EIP_Menu.EnterCostPackage.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		System.out.println("Enter Cost Package in Request Essentials");

	}

	@Then("^Enter Cost Package in SR Request Essentials$")
	public void Enter_Cost_Package_in_SR_Request_Essentials() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.SRCostPackage.clear();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCostPackage));
		Thread.sleep(2000);
		EIP_Menu.SRCostPackage.sendKeys(ConfigFileReader.getPR_Cost(), Keys.TAB);
		
		Thread.sleep(4000);
		EIP_Menu.WBS.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

	}
	
	@Then("^Enter Next Cost Package in SR Request Essentials$")
	public void Enter_Next_Cost_Package_in_SR_Request_Essentials() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.SRCostPackage.clear();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCostPackage));
		Thread.sleep(2000);
		EIP_Menu.SRCostPackage.sendKeys(ConfigFileReader.getPRNext_Cost(), Keys.TAB);
		
		Thread.sleep(4000);
		EIP_Menu.WBS.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

	}

	@Then("^Enter Quantity in Request Essentials$")
	public void Enter_Quantity_in_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRQuantity));
		ClickUsingTryCatch(PRQuantity);
		Thread.sleep(500);
		//EIP_Menu.PRQuantity.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		
		EIP_Menu.PRQuantity.sendKeys(Keys.DELETE);
		/*Thread.sleep(500);
		ClickUsingTryCatch(PRQuantity);
		Thread.sleep(900);
		ClearUsingTryCatch(PRQuantity)*/;
		
		Thread.sleep(1000);
		EIP_Menu.PRQuantity.sendKeys(ConfigFileReader.getPR_Quantity());
		System.out.println("Enter Quantity in Request Essentials");
	}
	
	/*@Then("^Enter Quantity in Request Essentials$")
	public void Enter_Quantity_in_Request_Essentials() throws Throwable {
	
		Thread.sleep(2000);
		
		try {
			EIP_Menu.PRQuantity.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PRQuantity);

		}
		Thread.sleep(500);
		
		try {
			EIP_Menu.PRQuantity.clear();
		} catch (Exception e) {
			js.executeScript("arguments[0].clear();", EIP_Menu.PRQuantity);

		}
		
		Thread.sleep(500);
		EIP_Menu.PRQuantity.sendKeys(ConfigFileReader.getPR_Quantity());
		
System.out.println("Enter Quantity in Request Essentials");
	}*/

	@Then("^Enter Second Quantity in Request Essentials$")
	public void Enter_Second_Quantity_in_Request_Essentials() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AuctionQuantityMAt);
		Thread.sleep(4000);

		EIP_Menu.PR2Quantity.click();
		// EIP_Menu.PR2Quantity.click();

		Thread.sleep(4000);
	
		
		// Thread.sleep(200);
		EIP_Menu.PR22Quantity.sendKeys(ConfigFileReader.getPR_Quantity(), Keys.TAB);
		// EIP_Menu.PRQuantity.sendKeys(Keys.TAB);

	}
	
	
	@Then("^Enter Third Quantity in Request Essentials$")
	public void Enter_Third_Quantity_in_Request_Essentials() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AuctionQuantityMAt);
		Thread.sleep(4000);

		EIP_Menu.PR3Quantity.click();
		

		Thread.sleep(4000);
	
		
		
		EIP_Menu.PR22Quantity.sendKeys(ConfigFileReader.getPR_Quantity(), Keys.TAB);

	}

	@Then("^Enter Fourth Quantity in Request Essentials$")
	public void Enter_Fourth_Quantity_in_Request_Essentials() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AuctionQuantityMAt);
		
		Thread.sleep(4000);

		EIP_Menu.PR4Quantity.click();
		

		Thread.sleep(4000);
	
		
		
		EIP_Menu.PR22Quantity.sendKeys(ConfigFileReader.getPR_Quantity(), Keys.TAB);

	}

	@Then("^Enter SR Quantity in Request Essentials$")
	public void Enter_SR_Quantity_in_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCQuantity));
		Thread.sleep(3000);
		EIP_Menu.SRCQuantity.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
				Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.SRCQuantity.sendKeys(ConfigFileReader.getPR_Quantity());
	}
	
	@Then("^Enter SR Next Quantity in Request Essentials$")
	public void Enter_SR_Next_Quantity_in_Request_Essentials() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCQuantity));
		Thread.sleep(3000);
		EIP_Menu.SRCQuantityNext.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
				Keys.BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.SRCQuantityNext.sendKeys(ConfigFileReader.getPR_Quantity());
	}
	
	
	

	@Then("^Enter Sugg Rate in Request Essentials$")
	public void Enter_Sugg_Rate_in_Request_Essentials() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.PRSuggRate.clear();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRSuggRate));
		Thread.sleep(3000);
		EIP_Menu.PRSuggRate.sendKeys(ConfigFileReader.getPR_SuggRate());

	}
	
	
	@Then("^Enter Sugg Rate in Request Essentials first Material$")
	public void Enter_Sugg_Rate_in_Request_Essentials_first_Material() throws Throwable {

		EIP_Menu.PRSuggRate.clear();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRSuggRate));
		 Thread.sleep(3000);
		EIP_Menu.PRSuggRate.sendKeys(ConfigFileReader.getPR_FirstMaterialSuggRate());

	}

	@Then("^Enter SR Sugg Rate in Request Essentials$")
	public void Enter_SR_Sugg_Rate_in_Request_Essentials() throws Throwable {

		EIP_Menu.SRCSuggRate.clear();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCSuggRate));
		 Thread.sleep(3000);
		EIP_Menu.SRCSuggRate.sendKeys(ConfigFileReader.getPR_SuggRate());

	}
	
	
	@Then("^Enter SR Next Sugg Rate in Request Essentials$")
	public void Enter_SR_Next_Sugg_Rate_in_Request_Essentials() throws Throwable {

		EIP_Menu.SRCSuggRateNext.clear();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRCSuggRateNext));
		 Thread.sleep(3000);
		EIP_Menu.SRCSuggRateNext.sendKeys(ConfigFileReader.getPR_SuggRate());

	}
	
	

	@Then("^Enter DeliveryDate in Request Essentials$")
	public void Enter_DeliveryDate_in_Request_Essentials() throws Throwable {
		Thread.sleep(500);
		
		ScrollUsingJaveScript(PRDeliveryDate);
		//ClickUsingTryCatch(PRDeliveryDate);
		Thread.sleep(2000);
		EIP_Menu.PRDeliveryDate.click();
		Thread.sleep(1000);
		EIP_Menu.Date.click();
		//ClickUsingTryCatch(Date);
		Thread.sleep(4000);
		//ClickUsingTryCatch(AuctionRemarks);
		EIP_Menu.AuctionRemarks.click();

	
	}

	@Then("^Select DeliveryDate in Request Essentials as(.*)$")
	public static void selectKendoDate(String expDate) throws InterruptedException {
		// splitting date
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
		 Thread.sleep(3000);
		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();
		 Thread.sleep(3000);
		Webdriver.driver.findElement(By.xpath("//*[@class='k-button k-bare k-title']")).click();
		 Thread.sleep(3000);
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

	@Then("^Select Submit in Request Essentials$")
	public void Select_Submit_in_Request_Essentials() throws Throwable {
		 Thread.sleep(2000);
			//ClickUsingTryCatch(PRSubmit);
			EIP_Menu.PRSubmit.click();
			
		System.out.println("Select Submit in Request Essentials");
	}

	@Then("^Purchases Request Accept$")
	public void Purchases_Request_Accept() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PurchasesRequestAccept));
		Thread.sleep(2000);
		//EIP_Menu.PurchasesRequestAccept.click();
		Commoncontrol.eAuctionAlert();
		System.out.println("Accept Purchases Request Alert");
		Login_Steps.Logout();
	}

	@Then("^Service Request Accept$")
	public void Service_Request_Accept() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.ServiceRequestAccept));
		Thread.sleep(4000);
		// EIP_Menu.ServiceRequestAccept.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.ServiceRequestAccept);

	}

	@Then("^Request Created Successfully and Accepted$")
	public void Request_Created_Successfully_and_Accepted() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PurchasesRequestAccept));
		Thread.sleep(6000);
		//EIP_Menu.PurchasesRequestAccept.click();
		
		try {
			EIP_Menu.PurchasesRequestAccept.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PurchasesRequestAccept);

		}
		
		System.out.println("Request Created Successfully and Accepted");
	}

	@Then("^Mouseover in PR Numner$")
	public static void Mouseover_in_PR_Numner() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.Sdown);
		 Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PR));
		Actions actions = new Actions(Webdriver.driver);
		actions.moveToElement(EIP_Menu.PR);
		 
		actions.perform();
		
		System.out.println("Mouseover on PR Numner, to Approve the Purchases Request");

	}

/*	@Then("^Select Approve for Purchases Request$")
	public static void Select_Approve_for_Purchases_Request() throws Throwable {
		Thread.sleep(3000);

		EIP_Menu.PRApprove.click();
		
		
	}*/
	
	@Then("^Select Approve for Purchases Request$")
	public void Select_Approve_for_Purchases_Request() throws Throwable {
		 Thread.sleep(2000);
			
		try {
			EIP_Menu.PRApprove.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PRApprove);

		}
		
		System.out.println("Select Approve for Purchases Request");
	}

	@Then("^Select Ok In Approval Sucess Alert$")
	public static void Select_Ok_In_Approval_Sucess_Alert() throws Throwable {
		Thread.sleep(3000);

		EIP_Menu.ApprovalSucess.click();
		Thread.sleep(2000);
		Login_Steps.Logout();
		
		
	}

	@Then("^Select Close icon In Need To Allocate$")
	public static void Select_Close_icon_In_Need_To_Allocate() throws Throwable {
		 Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.closeiconAllocate));
		// EIP_Menu.closeiconAllocate.click();
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.closeiconAllocate);
		// Login_Steps.Logout();
		System.out.println("Select Close icon In Need To Allocate");
		
		Login_Steps.Logout();
		
	}

	@Then("^Second Level approver(.*)$")
	public static void Second_Level_approver(String documentType) throws Throwable {
		// Thread.sleep(3000);
		Login_Steps.Logout();
		Login_Steps.click_on_Other_User();
		//Login_Steps.Enter_the_Username_from_db(documentType);
		Login_Steps.enter_the_Password();
		Login_Steps.click_on_Login();
		SCM_Purchase_Request_Create.Mouseover_in_PR_Numner();
		//SCM_Purchase_Request_Create.Select_Approve_for_Purchases_Request();
		SCM_Purchase_Request_Create.Select_Ok_In_Approval_Sucess_Alert();
		Login_Steps.Logout();

	}

	@Then("^Purchases Request Login$")
	public void Purchases_Request_Login() throws Throwable {
		Login_Objects.Otheruser.click();
		Thread.sleep(2000);
		Login_Objects.Username.sendKeys(ConfigFileReader.getPR_Username());
		Thread.sleep(2000);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Thread.sleep(2000);
		Login_Objects.Login.click();
		Thread.sleep(4000);
		Commoncontrol.PRHomePageNavigateToMenu();
	}
}
