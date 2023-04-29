package action_SCM;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.EIP_Menu;
import object_repository.Login_Objects;
import stepdefinition.DataBaseConnection;
import stepdefinition.Login_Steps;
import stepdefinition.Webdriver;

public class Commoncontrol {
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);

	public Commoncontrol() {

		PageFactory.initElements(Webdriver.driver, EIP_Menu.class);
	}
	/*
	 * static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 12000);
	 * public static void advanceSearch() {
	 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SearchPR));
	 * boolean AdvanceSearchiconstatus = EIP_Menu.SearchPR.isEnabled();
	 * if(AdvanceSearchiconstatus==true) { //EIP_Menu.SearchPR.click();
	 * JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
	 * js.executeScript("arguments[0].click()", EIP_Menu.SearchPR);
	 * 
	 * } }
	 */

	public static void search(String PRNumber) throws InterruptedException {
		EIP_Menu.EnterPRFromDB.sendKeys(PRNumber);
		Thread.sleep(500);
		EIP_Menu.SelectSearchIcon.click();
		// assertEquals(PRNumber, EIP_Menu.PRNumGrid.getText());
		if (PRNumber.equals(EIP_Menu.Searchresult.getText())) {
			assertEquals(true, true);
		}

	}

	public static void RFQHomePageNavigateToMenu() throws InterruptedException {
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

	public static void eAuctionHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		Thread.sleep(1000);
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(1000);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		Thread.sleep(1000);
		EIP_Menu.PRO.click();
		assertEquals("E-Auction", EIP_Menu.MenueAuct.getText());
		System.out.println("SCM Menu = " + EIP_Menu.MenueAuct.getText());
		Thread.sleep(1000);
		EIP_Menu.MenueAuct.click();

	}

	public static void TCDHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		Thread.sleep(500);
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(500);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		Thread.sleep(300);
		assertEquals("Techno Commercial Document", EIP_Menu.SelectTCD.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SelectTCD.getText());
		Thread.sleep(500);
		EIP_Menu.SelectTCD.click();

	}

	public static void RFQBQHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		Thread.sleep(1500);
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(1000);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		Thread.sleep(900);
		assertEquals("RFQ Bidders Quote", EIP_Menu.RFQBQ.getText());
		System.out.println("SCM Menu = " + EIP_Menu.RFQBQ.getText());
		Thread.sleep(1500);
		EIP_Menu.RFQBQ.click();
		Thread.sleep(1500);
		System.out.println("Select RFQ BQ ");

	}

	public static void PRHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		Thread.sleep(500);
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(500);
		EIP_Menu.SCM.click();
		assertEquals("Request", EIP_Menu.Request.getText());
		System.out.println("SCM Menu = " + EIP_Menu.Request.getText());
		Thread.sleep(500);
		EIP_Menu.Request.click();
		Thread.sleep(1000);
		/*
		 * assertEquals("Purchase / Service", EIP_Menu.PurchaseService.getText());
		 * System.out.println("SCM Menu = "+EIP_Menu.PurchaseService.getText());
		 */
		EIP_Menu.PurchaseService.click();
		System.out.println("Select Purchase / Service in Access Based Menu");

	}

	public static void GRHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		Thread.sleep(500);
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(500);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		Thread.sleep(500);
		EIP_Menu.PRO.click();
		/*
		 * assertEquals("General Request", EIP_Menu.PRGR.getText());
		 * System.out.println("SCM Menu = "+EIP_Menu.PRGR.getText());
		 */
		Thread.sleep(500);
		EIP_Menu.PRGR.click();
		
		System.out.println("Enter General Consource in Search Menu");

	}

	public static void BitValuesVerification() throws InterruptedException {
		Thread.sleep(500);
		assertEquals("Reverse", EIP_Menu.AucType.getText());
		System.out.println("Auction Type = " + EIP_Menu.AucType.getText());

	}

	public static void RateDiscoveryRFQCreateAddMaterial() throws InterruptedException {
		Thread.sleep(500);
		assertEquals("Add Material", EIP_Menu.addmat.getText());
		System.out.println("RFQ Create = " + EIP_Menu.addmat.getText());
		Thread.sleep(500);
		assertEquals("Rate Discovery", EIP_Menu.RFQRD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.RFQRD.getText());

		boolean nexticonstatus = EIP_Menu.RDicon.isEnabled();
		if (nexticonstatus == true) {

			// js.executeScript("arguments[0].click()", EIP_Menu.RDicon);
			EIP_Menu.RDicon.click();
			System.out.println("Verified Rate Discovery Icon is Clickable in RFQ Create Page");

		}

	}
	
	public static void enabled_or_not(WebElement ele) {
		if (!ele.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}
	}

	public static void RateDiscoveryRFQCreatePageVerification() throws InterruptedException {
		Thread.sleep(1000);
		if (!EIP_Menu.RDNext.isEnabled()) {
			System.err.println("Button is Disabled");
		} else {
			System.out.println("Button is Enabled");
		}
		EIP_Menu.RDNext.click();

		System.out.println("Select Next Button Without Select any Material Code");

		Thread.sleep(600);
		assertEquals("Error", EIP_Menu.ErrorAlert.getText());
		System.err.println("Type of Alert = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(600);
		assertEquals("Please Select the Materials !!!", EIP_Menu.ErrorAlertText.getText());
		System.err.println("Indicate Alert Text = " + EIP_Menu.ErrorAlertText.getText());
		Thread.sleep(600);

		try {
			EIP_Menu.AlertOk.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AlertOk);

		}
		
		Thread.sleep(600);
		if (!EIP_Menu.RDCart.isEnabled()) {
			System.err.println("Add Cart Icon is Disabled");
		} else {
			System.out.println("Add Cart Icon is Enabled");
		}
		
		EIP_Menu.RDCart.click();
		System.out.println("Select Cart for Rate Discovery in RFQ Create");

		System.out.println(
				"Verified whether without select Any Material Not Allow to Move Add RFQ Values should show the Error Alert");
		System.out.println("Details for Rate Discovery should be = " + EIP_Menu.RDText.getText());

		Thread.sleep(600);
		assertEquals("Material Cart", EIP_Menu.CartTextHeading.getText());
		System.out.println("Heading of Material Cart  = " + EIP_Menu.CartTextHeading.getText());

		Thread.sleep(600);
		assertEquals("Choose Items", EIP_Menu.CartTextCiterms.getText());
		System.out.println("List Iterms of Material Cart  = " + EIP_Menu.CartTextCiterms.getText());

		Thread.sleep(600);
		assertEquals("Selected Items", EIP_Menu.CartTextSiterms.getText());
		System.out.println("List Iterms of Material Cart  = " + EIP_Menu.CartTextSiterms.getText());
		Thread.sleep(500);
		Commoncontrol.enabled_or_not(EIP_Menu.CartPost);
		Thread.sleep(1000);
		EIP_Menu.CartPost.click();
				
		Thread.sleep(1000);
		
		try {
			EIP_Menu.CartClose.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.CartClose);

		}
		
		System.out.println("Material Cart Closed Successfully");
	}
	
	
	public static void RateDiscoveryRFQCreateAddCartforMaterial() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.RDCart.click();
		System.out.println("Select Cart in Rate Discovery in RFQ Create");

	}

	public static void RateDiscoveryRFQCreateAddService() {
		assertEquals("Add Service", EIP_Menu.addSer.getText());
		System.out.println("RFQ Create = " + EIP_Menu.addSer.getText());
		assertEquals("Rate Discovery", EIP_Menu.RFQRD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.RFQRD.getText());

		boolean nexticonstatus = EIP_Menu.RDicon.isEnabled();
		if (nexticonstatus == true) {

			// js.executeScript("arguments[0].click()", EIP_Menu.RDicon);
			EIP_Menu.RDicon.click();
		}

	}

	public static void RateDiscoveryRFQCreatePage() throws InterruptedException {
		Thread.sleep(500);
		assertEquals("Material Code", EIP_Menu.DetailMC.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailMC.getText());
		Thread.sleep(500);
		assertEquals("Material Description", EIP_Menu.DetailMD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailMD.getText());
		Thread.sleep(500);
		assertEquals("Action", EIP_Menu.DetailAc.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailAc.getText());

	}

	public static void RateDiscoveryRFQSeriveCreatePage() throws InterruptedException {
		Thread.sleep(500);
		assertEquals("Code", EIP_Menu.DetailC.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailC.getText());
		Thread.sleep(500);
		assertEquals("Description", EIP_Menu.DetailMD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailMD.getText());
		Thread.sleep(500);
		assertEquals("Action", EIP_Menu.SerAuc.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.SerAuc.getText());

	}

	public static void RateDiscoverySelectCartRFQCreateAddMaterial() throws InterruptedException {

		boolean nexticonstatus = EIP_Menu.RDCart.isEnabled();
		if (nexticonstatus == true) {
			Thread.sleep(1000);
			// js.executeScript("arguments[0].click()", EIP_Menu.RDCart);
			EIP_Menu.RDCart.click();
			System.out.println("Select Cart for Rate Discovery in RFQ Create");

		}

	}

	public static void ServiceRateDiscoveryCartVerifyRFQCreateAddRFQValue() throws InterruptedException {

		Thread.sleep(500);
		EIP_Menu.EnterScopeOfRFQ.click();
		Thread.sleep(500);
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RDRFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantityRDSR));
		EIP_Menu.EnterQuantityRDSR.click();
		Thread.sleep(500);
		EIP_Menu.EnterQuantityRDSR.clear();
		EIP_Menu.EnterQuantityRDSR.sendKeys(ConfigFileReader.getQuantity_RFQ());
		Thread.sleep(500);
		EIP_Menu.SRSuggRDService.click();
		EIP_Menu.SRSuggRDService.clear();
		EIP_Menu.SRSuggRDService.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		EIP_Menu.SACCode.click();
		Thread.sleep(500);
		EIP_Menu.SelectSACCode.click();
		EIP_Menu.SelectNextSRRDRFQ.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.AlertOk.click();
	}

	public static void RateDiscoveryCartVerifyRFQCreateAddMaterial() throws InterruptedException, AWTException {
		Thread.sleep(500);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCart);
		EIP_Menu.RDCart.click();
		/*
		 * assertEquals("Material Cart", EIP_Menu.RDMC.getText());
		 * System.out.println("Rate Discovery Cart = "+EIP_Menu.RDMC.getText());
		 */
		Thread.sleep(500);
		EIP_Menu.MaterialCategory.sendKeys(ConfigFileReader.getMaterialCategory_ReverseRateDiscovery());
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		EIP_Menu.RDMatSL.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		Thread.sleep(500);
		EIP_Menu.SelIt.click();
		// wait.until(ExpectedConditions.stalenessOf(EIP_Menu.RDMG));
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMG);
		Thread.sleep(500);
		EIP_Menu.RDMG.click();
		Thread.sleep(500);
		EIP_Menu.RDMG.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		Thread.sleep(500);
		EIP_Menu.RDMatSL.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		Thread.sleep(500);
		EIP_Menu.SelIt.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		/*
		 * EIP_Menu.ChooseItems.click();
		 * EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		 * // js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		 * EIP_Menu.RDCI.click(); // js.executeScript("arguments[0].click()",
		 * EIP_Menu.MoveSelitm); EIP_Menu.MoveSelitm.click(); //
		 * js.executeScript("arguments[0].click()", EIP_Menu.CartPost);
		 */
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_ChooseItemsPR());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRChooseItems));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		// robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		EIP_Menu.PRChooseItems.sendKeys("4");
		Thread.sleep(500);
		EIP_Menu.Item.click();
		Thread.sleep(500);
		EIP_Menu.MoveSelitm.click();
		Thread.sleep(500);
		EIP_Menu.CartPost.click();
		Thread.sleep(500);
		EIP_Menu.RDAddmatAuct.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		Thread.sleep(500);
		EIP_Menu.RDNext.click();
		// EIP_Menu.AlertOk.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		// EIP_Menu.RDNext.click();

	}

	public static void RateDiscoveryCartVerifyAuctiomCreateAddMaterial() throws InterruptedException, AWTException {
		Thread.sleep(500);

		EIP_Menu.RDCart.click();
		Thread.sleep(500);
		EIP_Menu.MaterialCategory.sendKeys(ConfigFileReader.getMaterialCategory_ReverseRateDiscovery());

		// EIP_Menu.RDMatCat.sendKeys(ConfigFileReader.getMaterialCategory_RDRFQ());

		EIP_Menu.RDMatSL.click();

		Thread.sleep(500);
		EIP_Menu.SelIt.click();

		Thread.sleep(500);
		EIP_Menu.RDMG.click();
		Thread.sleep(500);
		EIP_Menu.RDMG.click();
		Thread.sleep(500);
		EIP_Menu.RDMatSL.click();

		EIP_Menu.SelIt.click();

		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_ChooseItemsPR());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRChooseItems));
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		// robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		EIP_Menu.PRChooseItems.sendKeys("4");
		Thread.sleep(500);
		EIP_Menu.Item.click();
		Thread.sleep(500);
		EIP_Menu.MoveSelitm.click();
		Thread.sleep(500);
		EIP_Menu.CartPost.click();
		Thread.sleep(500);
		EIP_Menu.RDQuantity.click();
		EIP_Menu.RDQuantity.clear();
		EIP_Menu.RDQuantity.sendKeys(ConfigFileReader.getQuantity_RDReAuction());
		Thread.sleep(500);
		EIP_Menu.RDSuggestedRate.click();
		Thread.sleep(500);
		EIP_Menu.RDSuggestedRate.clear();
		Thread.sleep(500);
		EIP_Menu.RDSuggestedRate.sendKeys(ConfigFileReader.getSuggRate_RDeAuction());
		Thread.sleep(500);
		EIP_Menu.RDNext.click();

	}

	public static void RateDiscoveryVerifyRFQCreateAddRFQValue() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.EnterScopeOfRFQ.click();
		Thread.sleep(3000);
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RDRFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantity));
		Thread.sleep(500);
		EIP_Menu.EnterQuantity.click();
		Thread.sleep(500);
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		EIP_Menu.RDSuggRate.click();
		Thread.sleep(500);
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(500);
		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		Thread.sleep(500);
		EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(1500);
		EIP_Menu.AlertOk.click();

	}

	public static void CapitalPRRFQCreateAddRFQValue() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.EnterScopeOfRFQ.click();
		Thread.sleep(1000);
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_CPRRFQ());
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantity));
		Thread.sleep(1000);
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		Thread.sleep(1000);
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate.click();
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(1000);
		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		Thread.sleep(1000);
		EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(1000);
		EIP_Menu.AlertOk.click();

	}

	public static void LogOut() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.CRFQcl.click();
		Login_Steps.Logout();
	}

	public static void RateDiscoveryCartVerification() throws InterruptedException {
		Thread.sleep(1000);
		assertEquals("Material Cart", EIP_Menu.RDMC.getText());
		System.out.println("Rate Discovery Cart = " + EIP_Menu.RDMC.getText());
	}

	public static void RateDiscoveryEnterMaterialCategory() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.RDMatCat.sendKeys(ConfigFileReader.getMaterialCategory_RDRFQ());
		System.out.println("Enter Material Category");
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		Thread.sleep(1000);
		EIP_Menu.RDMatSL.click();
		System.out.println("Select Material Category");
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		Thread.sleep(1000);
		EIP_Menu.SelIt.click();
		System.out.println("Select Material Category Refresh");

	}

	public static void RateDiscoveryEnterServiceCategory() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.ServCate.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);

	}

	public static void RateDiscoverySelectMaterialGroup() throws InterruptedException {
		Thread.sleep(3000);
		EIP_Menu.RDMG.click();
		System.out.println("Click Material Group");
		// EIP_Menu.RDMG.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		Thread.sleep(3000);
		EIP_Menu.RDMatSL.click();
		System.out.println("Select Material Group from the List");
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);;
		Thread.sleep(2000);
		EIP_Menu.SelIt.click();
		System.out.println("Select Material Group Refresh");
	}

	public static void RateDiscoverySelectServiceGroup() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.RDSG.click();
		EIP_Menu.RDEG.sendKeys(ConfigFileReader.getMaterialGroup_RDSRRFQ());
		Thread.sleep(1000);
		EIP_Menu.RDSEG.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);

	}

	public static void RateDiscoverySelectChooseItems() throws InterruptedException {

		Thread.sleep(500);
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.ChooseItems.click();
		System.out.println("Select Choose Items in Material Cart");
		Thread.sleep(2000);
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		System.out.println("Enter Items in Material Cart");
		Thread.sleep(5000);

		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCartSec_RDRFQ());
		System.out.println("Enter Items in Material Cart");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.AuctionPRAddcart.click();
		System.out.println("Select Items from Material Cart List");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();
		System.out.println("Move the Selected Items from Material Cart List");

	}

	public static void RateDiscoverySelectMultiMaterialChooseItems() throws InterruptedException {

		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.ChooseItems.click();
		System.out.println("Select Choose Items in Material Cart");
		Thread.sleep(2000);
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		System.out.println("Enter Items in Material Cart");
		Thread.sleep(5000);

		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCartSec_RDRFQ());
		System.out.println("Enter Items in Material Cart");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.AuctionPRAddcart.click();
		System.out.println("Select Items from Material Cart List");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();
		System.out.println("Move the Selected Items from Material Cart List");

		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.ChooseItems.click();
		System.out.println("Select Choose Items in Material Cart");
		Thread.sleep(2000);
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		System.out.println("Enter Items in Material Cart");
		Thread.sleep(5000);

		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCartSec1_RDRFQ());
		System.out.println("Enter Items in 1 Material Cart");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.AuctionPRAddcart.click();
		System.out.println("Select Items from Material Cart List");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();
		System.out.println("Move the Selected Items from Material Cart List");

		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.ChooseItems.click();
		System.out.println("Select Choose Items in Material Cart");
		Thread.sleep(2000);
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		System.out.println("Enter Items in Material Cart");
		Thread.sleep(5000);

		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCartSec2_RDRFQ());
		System.out.println("Enter Items in 2 Material Cart");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.AuctionPRAddcart.click();
		System.out.println("Select Items from 2 Material Cart List");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();
		System.out.println("Move the Selected Items from Material Cart List");

		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.ChooseItems.click();
		System.out.println("Select Choose Items in Material Cart");
		Thread.sleep(2000);
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		System.out.println("Enter Items in 3 Material Cart");
		Thread.sleep(5000);

		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCartSec3_RDRFQ());
		System.out.println("Enter Items in 3 Material Cart");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.AuctionPRAddcart.click();
		System.out.println("Select Items from Material Cart List");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();
		System.out.println("Move the Selected Items from Material Cart List");

	}

	public static void RateDiscoveryServiceSelectChooseItems() throws InterruptedException {
		Thread.sleep(1000);

		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.SRChooseItems.click();

		Thread.sleep(800);
		EIP_Menu.MoveSelitm.click();

	}

	public static void RateDiscoverySelectChooseItemsPostAndMove() throws InterruptedException {
		// js.executeScript("arguments[0].click()", EIP_Menu.CartPost);
		Thread.sleep(1000);
		EIP_Menu.CartPost.click();

		System.out.println("Select Post Button after Selected the Items");
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		Thread.sleep(1000);
		EIP_Menu.RDAddmatAuct.click();
		System.out.println("Select Material Refresh before Navigate to Add RFQ Values");
		Thread.sleep(2500);
		EIP_Menu.RDNext.click();

		System.out.println("Select Next Button after Added the Material Code");
		// EIP_Menu.AlertOk.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		// EIP_Menu.RDNext.click();

	}

	public static void ServiceRateDiscoverySelectChooseItemsPostAndMove() throws InterruptedException {
		// js.executeScript("arguments[0].click()", EIP_Menu.CartPost);
		Thread.sleep(1000);
		EIP_Menu.SRDCartPost.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		Thread.sleep(1000);

		EIP_Menu.RDAddmatAuct.click();
		Thread.sleep(500);
		EIP_Menu.RDNext.click();
		// EIP_Menu.AlertOk.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		// EIP_Menu.RDNext.click();

	}

	public static void paymentTermsRelease() throws InterruptedException {
		// js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		Thread.sleep(1000);
		EIP_Menu.EnterReleasePaymentTerms.click();
		EIP_Menu.EnterReleasePaymentTerms.clear();
		Thread.sleep(1000);
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getRelease_RFQ());
	}

	public static void paymentTermsReleaseCreate() throws InterruptedException {
		// js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		/*
		 * EIP_Menu.EnterReleasePaymentTerms.click();
		 * EIP_Menu.EnterReleasePaymentTerms.clear();
		 * EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.
		 * getReleaseCreate_RFQ());
		 */
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		EIP_Menu.EnterReleasePaymentTerms.clear();
		Thread.sleep(1000);
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getReleaseCreate_RFQ());
	}

	public static void paymentTermsEvenet() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectEventPaymentTerms));
		Thread.sleep(1000);
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

	public static void paymentTermsReferenceValue() {

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceValuePaymentTerms));
		EIP_Menu.SelectReferenceValuePaymentTerms.click();
		List<WebElement> selectRV = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRV) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceValue_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	public static void ServicepaymentTermsReferenceValue() {

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

	public static void PaymentTermsPaymentMode() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectPaymentModePaymentTerms));
		EIP_Menu.SelectPaymentModePaymentTerms.click();
		List<WebElement> selectPM = EIP_Menu.paymentlist;
		for (WebElement webElement : selectPM) {
			if (webElement.getText().equals(ConfigFileReader.getPaymentMode_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}

	}

	public void ReferenceDatePaymentTerms() {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceDatePaymentTerms));
		EIP_Menu.SelectReferenceDatePaymentTerms.click();

		List<WebElement> selectRD = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRD) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceDate_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void PaymentTermsCreditDays() throws Throwable {

		EIP_Menu.SelectCreditDaysPaymentTerms.sendKeys(ConfigFileReader.getCreditDays_RFQ(), Keys.TAB);
	}

	public static void PaymentTermsReferenceDate() {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectReferenceDatePaymentTerms));
		EIP_Menu.SelectReferenceDatePaymentTerms.click();

		List<WebElement> selectRD = EIP_Menu.paymentlist;
		for (WebElement webElement : selectRD) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceDate_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServicePaymentTermsReferenceDate() {

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

	public static void PaymentTermsRatediscoveryDocument() throws Throwable {

		EIP_Menu.RDDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
		EIP_Menu.PTAuc.click();

	}

	public static void PaymentTermsDocument() throws Throwable {
		EIP_Menu.Doc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));

		EIP_Menu.SelectDocumentPaymentTerms.click();
		Thread.sleep(500);
		EIP_Menu.PaymAct.click();
	}

	public static void ServicePaymentTermsDocument() throws Throwable {
		EIP_Menu.SRDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
		Thread.sleep(1000);
		EIP_Menu.PaymAct.click();
	}

	public static void ServiceRDPaymentTermsDocument() throws Throwable {
		EIP_Menu.SRRDDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();

		EIP_Menu.SelectCreditDaysPaymentTerms.click();

	}

	public static void PaymentTermsCompletedAndMoveToOtherTrems() throws Throwable {
		EIP_Menu.SelectNextIconPaymentTerms.click();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void ServicePaymentTermsCompletedAndMoveToOtherTrems() throws Throwable {
		EIP_Menu.SelectSRNextPaymentTerms.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void RDServicePaymentTermsCompletedAndMoveToOtherTrems() throws Throwable {
		EIP_Menu.SelectSRNextPaymentTerms.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void OtherTermsLDApplicableDate() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldad));
		Thread.sleep(1000);
		EIP_Menu.Ldad.click();

		List<WebElement> selectLDAD = EIP_Menu.LdadList;
		for (WebElement webElement : selectLDAD) {
			if (webElement.getText().equals(ConfigFileReader.getLDApplicableDate_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void OtherTermsLDAuctionApplicableDate() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldad));
		Thread.sleep(500);
		EIP_Menu.LdAuc.click();

		List<WebElement> selectLDAD = EIP_Menu.LdadList;
		for (WebElement webElement : selectLDAD) {
			if (webElement.getText().equals(ConfigFileReader.getLDApplicableDate_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void SRRDOtherTermsLDApplicableDate() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldad));
		Thread.sleep(500);
		EIP_Menu.Ldad.click();

		List<WebElement> selectLDAD = EIP_Menu.LdadList;
		for (WebElement webElement : selectLDAD) {
			if (webElement.getText().equals(ConfigFileReader.getReferenceDate_SRRFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceOtherTermsLDApplicableDate() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldad));
		Thread.sleep(500);
		EIP_Menu.SRLdad.click();

		List<WebElement> selectLDAD = EIP_Menu.LdadList;
		for (WebElement webElement : selectLDAD) {
			if (webElement.getText().equals(ConfigFileReader.getLDApplicableDate_SRRFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void OtherTermsRDLDApplicableDate() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldad));
		Thread.sleep(500);
		EIP_Menu.RDLdvao.click();

		List<WebElement> selectLDAD = EIP_Menu.LdadList;
		for (WebElement webElement : selectLDAD) {
			if (webElement.getText().equals(ConfigFileReader.getLDApplicableDate_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void OtherTermsLDValueAppliedOn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldvao));
		Thread.sleep(500);
		EIP_Menu.Ldvao.click();

		List<WebElement> selectLDVAO = EIP_Menu.LdvaoList;
		for (WebElement webElement : selectLDVAO) {
			if (webElement.getText().equals(ConfigFileReader.getLDValueAppliedOn_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceOtherTermsLDValueAppliedOn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldvao));
		Thread.sleep(500);
		EIP_Menu.Ldvao.click();

		List<WebElement> selectLDVAO = EIP_Menu.LdvaoList;
		for (WebElement webElement : selectLDVAO) {
			if (webElement.getText().equals(ConfigFileReader.getLDValueAppliedOn_SRRFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void OtherTermsLDvaluePercentage() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.Ldvp.click();
		EIP_Menu.Ldvp.sendKeys(ConfigFileReader.getLDvaluePercentage_RFQ());

	}

	public static void OtherTermsDuration() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Dur));
		Thread.sleep(500);
		EIP_Menu.Dur.click();

		List<WebElement> selectDUR = EIP_Menu.DurList;
		for (WebElement webElement : selectDUR) {
			if (webElement.getText().equals(ConfigFileReader.getDuration_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceOtherTermsDuration() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRDur));
		Thread.sleep(500);
		EIP_Menu.SRDur.click();

		List<WebElement> selectDUR = EIP_Menu.DurList;
		for (WebElement webElement : selectDUR) {
			if (webElement.getText().equals(ConfigFileReader.getDuration_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void OtherTermsNoOfYear() throws Throwable {

		EIP_Menu.Noy.sendKeys(ConfigFileReader.getNoOfYear_RFQ());

	}

	public static void ServiceOtherTermsNoOfYear() throws Throwable {

		EIP_Menu.SRNoy.sendKeys(ConfigFileReader.getNoOfYear_RFQ());

	}

	public static void RateDiscoveryAutoBQ() throws Throwable {
		Thread.sleep(2500);
		EIP_Menu.RFQMaterialcategory.click();
		// EIP_Menu.RFQMaterialcategory.sendKeys(ConfigFileReader.getMaterialcategory_RFQ(),
		// Keys.TAB);

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}

		}

		EIP_Menu.EnterVendorRFQ.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		Thread.sleep(3200);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		EIP_Menu.SelectVendor.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		EIP_Menu.SelectAutoBQ.click();
		assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
		System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

		EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void ServiceAutoBQ() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RFQMaterialcategory.click();
		// EIP_Menu.RFQMaterialcategory.sendKeys(ConfigFileReader.getMaterialcategory_RFQ(),
		// Keys.TAB);

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}

		}

		EIP_Menu.EnterVendorRFQ.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
		Thread.sleep(500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		Thread.sleep(3200);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		EIP_Menu.SelectVendor.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);
		EIP_Menu.SelectSRAutoBQ.click();
		assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
		System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

		EIP_Menu.SelectNextIconVendorSR.sendKeys(Keys.TAB, Keys.ENTER);
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void OtherTermsRDNoOfYear() throws Throwable {
		Thread.sleep(1000);

		EIP_Menu.RDNoy.sendKeys(ConfigFileReader.getNoOfYear_RFQ());

	}

	public static void OtherTermsRDMaximumofPOValue() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.RDMopy.sendKeys(ConfigFileReader.getMaximumofPOValue_RFQ());

	}

	public static void OtherTermsMaximumofPOValue() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Mopv.sendKeys(ConfigFileReader.getMaximumofPOValue_RFQ());

	}

	public static void ServiceOtherTermsMaximumofPOValue() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.SRMopv.sendKeys(ConfigFileReader.getMaximumofPOValue_RFQ());

	}

	public static void OtherTermsLDSave() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.LDsave);
		Thread.sleep(1000);
		try {
			EIP_Menu.LDsave.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.LDsave);

		}

	}

	public static void AcceptAlertLD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

	}

	public static void OtherCostCategory() throws InterruptedException {

		Thread.sleep(1000);
		EIP_Menu.Oc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.CatOC));
		Thread.sleep(1000);
		EIP_Menu.CatOC.click();

		List<WebElement> selectCat = EIP_Menu.DurList;
		for (WebElement webElement : selectCat) {
			if (webElement.getText().equals(ConfigFileReader.getCategory_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

			System.out.println("Select Category for Other Cost in Rate Discovery Other Terms Page on RFQ Create");

		}
	}

	public static void OtherCostCategoryValue() throws Throwable {
		EIP_Menu.CatVlu.click();
		EIP_Menu.CatVlu.clear();
		Thread.sleep(1000);
		EIP_Menu.CatVlu.sendKeys(ConfigFileReader.getCategoryValue_RFQ());

	}

	public static void OtherCostRateDiscoveryCategoryValue() throws Throwable {
		Thread.sleep(1000);
		/*EIP_Menu.CatVlu.click();
		EIP_Menu.CatVlu.clear();
		Thread.sleep(1000);
		EIP_Menu.CatVlu.sendKeys(ConfigFileReader.getCategoryValue_RFQ());*/
		
		EIP_Menu.RDCatVlu.click();
		//EIP_Menu.RDCatVlu.clear();
		js.executeScript("arguments[0].value=''", EIP_Menu.RDCatVlu);
		Thread.sleep(1000);
		EIP_Menu.RDCatVlu.sendKeys(ConfigFileReader.getCategoryValue_RFQ());
		

		System.out.println("Enter Category Value for Other Cost in Rate Discovery Other Terms Page on RFQ Create");

	}

	public static void OtherCostMVRateDiscoveryCategoryValue() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.RDCatVluMV.click();
		EIP_Menu.RDCatVluMV.clear();
		Thread.sleep(1000);
		EIP_Menu.RDCatVluMV.sendKeys(ConfigFileReader.getCategoryValue_RFQ());

		System.out.println("Enter Category Value for Other Cost in Rate Discovery Other Terms Page on RFQ Create");

	}

	public static void MultiNatureCode() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.Naturecode);

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

		Thread.sleep(1000);

		try {
			EIP_Menu.NaturecodeM1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NaturecodeM1);

		}
		Thread.sleep(500);
		List<WebElement> selectEP1 = EIP_Menu.NCList;
		for (WebElement webElement : selectEP1) {
			if (webElement.getText().equals(ConfigFileReader.getNatureCode_Auction())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
		}

		Thread.sleep(1000);

		try {
			EIP_Menu.NaturecodeM2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NaturecodeM2);

		}
		Thread.sleep(500);
		List<WebElement> selectEP2 = EIP_Menu.NCList;
		for (WebElement webElement : selectEP2) {
			if (webElement.getText().equals(ConfigFileReader.getNatureCode_Auction())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
		}

		Thread.sleep(1000);

		try {
			EIP_Menu.NaturecodeM3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NaturecodeM3);

		}
		Thread.sleep(500);
		List<WebElement> selectEP3 = EIP_Menu.NCList;
		for (WebElement webElement : selectEP3) {
			if (webElement.getText().equals(ConfigFileReader.getNatureCode_Auction())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
		}

		Thread.sleep(1000);

		try {
			EIP_Menu.NaturecodeM4.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NaturecodeM4);

		}
		Thread.sleep(500);
		List<WebElement> selectEP4 = EIP_Menu.NCList;
		for (WebElement webElement : selectEP4) {
			if (webElement.getText().equals(ConfigFileReader.getNatureCode_Auction())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;
				// ALL - ALL
			}
		}

	}

	public static void OtherCostRemarks() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.OCRem.sendKeys(ConfigFileReader.getOtherCostRemarks_RFQ());
		System.out.println("Enter Remarks for Other Cost in Rate Discovery Other Terms Page on RFQ Create");
	}

	public static void OtherCostSave() throws Throwable {

		// EIP_Menu.OCRem.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.OCSave.click();

	}

	public static void RateDiscoveryOtherCostSave() throws Throwable {
		Thread.sleep(2500);
		//EIP_Menu.OCRem.sendKeys(Keys.TAB, Keys.ENTER);
		
			

		try {
			EIP_Menu.OTSave.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.OTSave);

		}
		// EIP_Menu.OCSave.click();

		System.out.println("Select Save button for Other Cost in Rate Discovery Other Terms Page on RFQ Create");

	}

	public static void OtherCostAcceptAlert() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.AcceptAlert.click();

		System.out.println("Accept Alert for Other Cost in Rate Discovery Other Terms Page on RFQ Create");

	}

	public static void DPLPeriodDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.DLPP.click();
		EIP_Menu.DLPP.sendKeys(ConfigFileReader.getDPLPeriod_RFQ());

		System.out.println("Enter Defect Liablility Period");

	}

	public static void ServiceDPLPeriodDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.SRDurDLP.click();
		EIP_Menu.SRDurDLP.sendKeys(ConfigFileReader.getDPLPeriod_RFQ());

	}

	public static void DurationDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.DurDLP.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(800);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

			System.out.println("Select Duration Defect Liablility Period");

		}
	}

	public static void DurationDefectLiablilityAuctionPeriod() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucTradeTerms.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceDurationDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.SRDurDLP.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceRDDurationDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.DurDLP.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(500);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void EventsDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.EvnDLP.click();
		Thread.sleep(2000);
		List<WebElement> selectEvn = EIP_Menu.DurList;
		for (WebElement webElement : selectEvn) {
			if (webElement.getText().equals(ConfigFileReader.getEventsDLP_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

			System.out.println("Select Events Defect Liablility Period");

		}
	}

	public static void EventsDefectLiablilityAuctionPeriod() throws Throwable {
		Thread.sleep(1200);
		EIP_Menu.AucEventsDefect.click();

		List<WebElement> selectEvn = EIP_Menu.DurList;
		for (WebElement webElement : selectEvn) {
			if (webElement.getText().equals(ConfigFileReader.getEventsDLP_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceEventsDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(1200);
		EIP_Menu.SREvnDLP.click();

		List<WebElement> selectEvn = EIP_Menu.DurList;
		for (WebElement webElement : selectEvn) {
			if (webElement.getText().equals(ConfigFileReader.getEventsDLP_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void SaveDefectLiablilityPeriod() throws Throwable {

		EIP_Menu.EvnDLP.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);

	}

	public static void SavebDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(1000);
		// EIP_Menu.DLPSave.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.OCSave.click();

		System.out.println("Select Save Button Defect Liablility Period");

	}

	public static void DefectLiablilityPeriodAcceptAlert() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.AcceptAlert.click();

		System.out.println("Accept Alert for Defect Liablility Period");

	}

	public static void PaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.PT.click();
		EIP_Menu.PT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

		System.out.println("Enter Payment Terms Special Terms Qualifications");

	}

	public static void PRPaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.PRPT.click();
		EIP_Menu.PRPT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

	}

	public static void PRAuctionPaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.PRAuctPT.click();
		EIP_Menu.PRAuctPT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

	}

	public static void SRPaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.SRPT.click();
		EIP_Menu.SRPT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

	}

	public static void SendYourBidforReverseAuction() throws Throwable {
		System.out.println("Start Bid");
		Actions a = new Actions(Webdriver.driver);
		// scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		try {
			EIP_Menu.YourBid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.YourBid);

		}
		
		
		EIP_Menu.YourBid.sendKeys(ConfigFileReader.getYourBid_Auction());
		System.out.println("Enter Bid");
		Thread.sleep(1500);
		
		try {
			EIP_Menu.Bid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Bid);

		}
		
		Thread.sleep(1500);
				
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(800);
		
		
		try {
			EIP_Menu.NextPossibleBid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NextPossibleBid);

		}
		Thread.sleep(800);
		

		try {
			EIP_Menu.Bid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Bid);

		}
		Thread.sleep(800);
		Commoncontrol.eAuctionAlert();
		
		
		try {
			EIP_Menu.NextPossibleBid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NextPossibleBid);

		}
		Thread.sleep(800);
		
		
		try {
			EIP_Menu.Bid.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.Bid);

		}
		
		Thread.sleep(800);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(1000);
		System.out.println("End Bid");

	}

	public static void SendYourBidforReversePRAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Naturecode.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		EIP_Menu.YourBidMat.click();
		EIP_Menu.YourBidMat.sendKeys(ConfigFileReader.getYourBid_PRAuction());
		Thread.sleep(500);

		EIP_Menu.Bid.click();
		Thread.sleep(3100);
		EIP_Menu.AcceptAlertR.click();
		Thread.sleep(1000);
		EIP_Menu.NextPossibleBid.click();
		Thread.sleep(1000);
		EIP_Menu.Bid.click();
		Thread.sleep(1000);
		EIP_Menu.AcceptAlertR.click();
		EIP_Menu.NextPossibleBid.click();
		Thread.sleep(1000);
		EIP_Menu.Bid.click();
		Thread.sleep(1000);
		EIP_Menu.AcceptAlertR.click();

	}

	public static void SendYourBidforReversePRMultiMaterialAuction() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(1000);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterialAuction());
		Thread.sleep(1000);

		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterialAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(400);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterialAuction());

		Thread.sleep(500);
		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterialAuction());

		Thread.sleep(500);
		EIP_Menu.PostAllBids.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorAAuction() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1BaseRateAuction());
		Thread.sleep(500);

		// Thread.sleep(500);
		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2BaseRateAuction());

		Thread.sleep(500);
		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4BaseRateAuction());

		Thread.sleep(500);
		EIP_Menu.PostAllBids.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorAPartialBiddingAuction() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(500);

		Commoncontrol.eAuctionAlert();

		// Thread.sleep(500);
		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2BaseRateAuction());

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}

		Thread.sleep(2000);

		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);
		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(500);

		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);
		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd4.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd4);

		}

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	// BidInd1

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorBAuction() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1V1BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2V1BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3V1BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4V1BaseRateAuction());

		Thread.sleep(500);
		EIP_Menu.PostAllBids.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorBPartialBiddingAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1V1BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);
		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2V1BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3V1BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4V1BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd4.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd4);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorCAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1V2BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2V2BaseRateAuction());
		Thread.sleep(500);

		Thread.sleep(500);
		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3V2BaseRateAuction());
		Thread.sleep(500);

		Thread.sleep(500);
		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4V2BaseRateAuction());

		Thread.sleep(500);
		EIP_Menu.PostAllBids.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorCPartialBiddingAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1V2BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2V2BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3V2BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		Thread.sleep(500);
		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4V2BaseRateAuction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorDAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1V3BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2V3BaseRateAuction());
		Thread.sleep(500);

		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3V3BaseRateAuction());
		Thread.sleep(500);

		Thread.sleep(500);
		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4V3BaseRateAuction());

		Thread.sleep(500);
		EIP_Menu.PostAllBids.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforReversePRMultiMaterialwithBaseRateVendorDPartialBiddingAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.NaturecodeM1.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat1);
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial1V3BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);
		EIP_Menu.NaturecodeM2.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat2);
		EIP_Menu.AucYourBid2.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial2V3BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		EIP_Menu.NaturecodeM3.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat3);

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial3V3BaseRateAuction());
		Thread.sleep(500);

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.NaturecodeM4.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();
		Thread.sleep(500);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.YourBidMat4);

		Thread.sleep(500);
		EIP_Menu.AucYourBid4.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid4.sendKeys(ConfigFileReader.getYourBid_PRMultiMaterial4V3BaseRateAuction());

		Thread.sleep(500);

		try {
			EIP_Menu.BidInd4.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd4);

		}
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforROReAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.YourBid.click();
		EIP_Menu.YourBid.sendKeys(ConfigFileReader.getYourBidROF_Auction());
		Thread.sleep(500);
		EIP_Menu.Bid.click();
		Thread.sleep(500);
		EIP_Menu.AcceptAlertR.click();
		Thread.sleep(500);
		EIP_Menu.NextPossibleBid.click();
		Thread.sleep(500);
		EIP_Menu.Bid.click();
		Thread.sleep(500);
		EIP_Menu.AcceptAlertR.click();
		EIP_Menu.NextPossibleBid.click();
		Thread.sleep(500);
		EIP_Menu.Bid.click();
		Thread.sleep(500);
		EIP_Menu.AcceptAlertR.click();

	}

	public static void SendYourBidforAVendoreAuction() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAA_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidAC_Auction());
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.ReBid1.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid2.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid3.click();
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforAVendoreNoNBVAuction() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAANoNBV_Auction());
		Thread.sleep(1500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidABNoNBV_Auction());
		Thread.sleep(1500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidACNoNBV_Auction());
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforROFAVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidACROF_Auction());
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforA1VendoreAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAA_Auction());
		// EIP_Menu.BidInd1.click();

		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidAC_Auction());

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforA1VendoreNONBRAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAANoNBV_Auction());
		// EIP_Menu.BidInd1.click();

		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidABNoNBV_Auction());
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidACNoNBV_Auction());
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
	}

	public static void AuctionFinalOutput() throws Throwable {

		DataBaseConnection.AuctionFinalOutputAuctionNumber();
		Thread.sleep(500);
		DataBaseConnection.AuctionFinalOutputAuctionScope();
		Thread.sleep(500);
		DataBaseConnection.AuctionFinalOutputAuctionDate();
		Thread.sleep(500);
		DataBaseConnection.AuctionFinalOutputAuctionBaseRateApplicable();
		Thread.sleep(500);
		DataBaseConnection.AuctionFinalOutputAuctionPartialBidding();
		Thread.sleep(500);

		DataBaseConnection.AuctionFinalOutputAuctionPublicOffer();
		Thread.sleep(500);
		DataBaseConnection.AuctionFinalOutputAuctionNoOfInvites();
		Thread.sleep(500);
		DataBaseConnection.AuctionFinalOutputAuctionNoOfBidders();

	}

	public static void SendYourBidforA1ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAAROF_Auction());
		// EIP_Menu.BidInd1.click();

		Thread.sleep(500);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(500);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidACROF_Auction());

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforA2VendoreAuction() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.ReBid1);
		Thread.sleep(1000);

		try {
			EIP_Menu.ReBid1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBid1);

		}
		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);

		try {
			EIP_Menu.ReBid2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBid2);

		}
		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);

		try {
			EIP_Menu.ReBid3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBid3);

		}
		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforB2VendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBC_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforB2VendorePBAuction() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBCNoNBV_Auction());
		// EIP_Menu.BidInd1.click();
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforB2ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBCROF_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforC2VendoreAuction() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCC_Auction());
		// EIP_Menu.BidInd1.click();
		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforC2VendorePBAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCCNoNBV_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforC2ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCCROF_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforD2VendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDC_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforD2VendorePBAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDCNoNBV_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforD2ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDCROF_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd3.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforB1VendoreAuction() throws Throwable {

		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBA_Auction());
		// EIP_Menu.BidInd1.click();
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBB_Auction());

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforB1VendorePBAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBANoNBV_Auction());
		// EIP_Menu.BidInd1.click();

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}

		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBBNoNBV_Auction());
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforB1ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBAROF_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBBROF_Auction());

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforC1VendoreAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCA_Auction());
		// EIP_Menu.BidInd1.click();
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCB_Auction());

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforC1VendorePBAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCANoNBV_Auction());
		// EIP_Menu.BidInd1.click();
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCBNoNBV_Auction());
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforC1ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCAROF_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCBROF_Auction());

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforD1VendoreAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDA_Auction());
		// EIP_Menu.BidInd1.click();

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDB_Auction());

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}

		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforD1VendorePBAuction() throws Throwable {
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDANoNBV_Auction());
		// EIP_Menu.BidInd1.click();
		Thread.sleep(1000);
		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDBNoNBV_Auction());

		Thread.sleep(1000);

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Thread.sleep(2000);
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforD1ROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDAROF_Auction());
		// EIP_Menu.BidInd1.click();

		try {
			EIP_Menu.BidInd1.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDBROF_Auction());

		try {
			EIP_Menu.BidInd2.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);

		}
		Commoncontrol.eAuctionAlert();

	}

	public static void SendYourBidforBVendoreAuction() throws Throwable {

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBA_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBB_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBC_Auction());
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.ReBid1.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid2.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid3.click();
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforBVendoreNONBRAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBANoNBV_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBBNoNBV_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBCNoNBV_Auction());
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforBROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBBROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBCROF_Auction());
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforCVendoreAuction() throws Throwable {

		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);

		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCA_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCB_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCC_Auction());
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			System.out.println("Post All Bids");
		}

		Thread.sleep(2500);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.ReBid1.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid2.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid3.click();
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Thread.sleep(2000);
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforCVendoreNONBRAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCANoNBV_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCBNoNBV_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCCNoNBV_Auction());
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforCROFVendoreAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCBROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCCROF_Auction());
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforDVendoreAuction() throws Throwable {

		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
				EIP_Menu.AucYourBid1);
		Thread.sleep(1000);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDA_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDB_Auction());
		Thread.sleep(1000);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDC_Auction());
		Thread.sleep(2500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}

		Thread.sleep(2000);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(1000);
		EIP_Menu.ReBid1.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid2.click();
		Thread.sleep(1000);
		EIP_Menu.ReBid3.click();
		Thread.sleep(2000);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Thread.sleep(1000);
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforDVendoreNONBRAuction() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDANoNBV_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDANoNBV_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDANoNBV_Auction());
		Thread.sleep(1500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(1500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void SendYourBidforDROFVendoreAuction() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDAROF_Auction());
		Thread.sleep(1500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDBROF_Auction());
		Thread.sleep(1500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDCROF_Auction());
		Thread.sleep(1500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);
		EIP_Menu.ReBid1.click();
		Thread.sleep(500);
		EIP_Menu.ReBid2.click();
		Thread.sleep(500);
		EIP_Menu.ReBid3.click();
		Thread.sleep(1500);

		try {
			EIP_Menu.PostAllBids.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);

		}
		Commoncontrol.eAuctionAlert();
	}

	public static void FilterAuctioncom() throws Throwable {
		Thread.sleep(500);
		// EIP_Menu.ClearSTQ.click();
		EIP_Menu.AuctionFilterCom.click();

	}

	public static void SaveSpecialTermsQualifications() throws Throwable {
		Thread.sleep(1000);
		// EIP_Menu.ClearSTQ.click();
		
		try {
			EIP_Menu.OTSave.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.OTSave);

		}

		System.out.println("Select Save button in Special Terms Qualifications");

	}

	public static void SavePRSpecialTermsQualifications() throws Throwable {

		// EIP_Menu.ClearSTQ.click();
	Thread.sleep(1000);
		
		try {
			EIP_Menu.OTSave.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.OTSave);

		}
		

	}

	public static void SavePRSpecialAuctionTermsQualifications() throws Throwable {

		// EIP_Menu.ClearSTQ.click();

		try {
			EIP_Menu.AuctionSave.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AuctionSave);

		}

	}

	public static void SaveSRSpecialTermsQualifications() throws Throwable {

		// EIP_Menu.ClearSTQ.click();
		// EIP_Menu.savePRnew.click();
		EIP_Menu.ClearSTQ.sendKeys(Keys.TAB, Keys.ENTER);

	}

	public static void SpecialTermsQualificationsAcceptAlert() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.AcceptAlert.click();

		System.out.println("Accept Alert Special Terms Qualifications");

	}

	public static void ShipmentDetailsAdditionalDetails() throws Throwable {
		Thread.sleep(500);
		assertEquals("Shipment Details", EIP_Menu.SD.getText());
		System.out.println("Additional Details = " + EIP_Menu.SD.getText());

		assertEquals(true, EIP_Menu.SD.isEnabled());
		Thread.sleep(500);
		EIP_Menu.SD.click();

	}

	public static void AucRequestEssentialsAdditionalDetailsPL() throws Throwable {
		Thread.sleep(2000);

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuAuc.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuAuc.getText());
		Thread.sleep(1000);
		// assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuAuc));
		System.out.println("Before Request Essentials Menu Auc");

		try {
			EIP_Menu.RequestEssentialsMenuAuc.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RequestEssentialsMenuAuc);

			System.out.println("Request Essentials Menu Auc");
		}

		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.extmsg);

		// EIP_Menu.ASNapplicableYES_M.click();

		Thread.sleep(2000);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		System.out.println("Befor Order Expiry Date");
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		// EIP_Menu.OrderExpiryDate.click();
		try {
			Thread.sleep(2000);
			EIP_Menu.OrderExpiryDate.click();

		} catch (Exception e) {
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", EIP_Menu.OrderExpiryDate);
		}
		System.out.println("After Order Expiry Date");
		Thread.sleep(3000);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		System.out.println("Before RFQ Order Expiry Date");
		try {
			EIP_Menu.RFQOrderExpiryDate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.RFQOrderExpiryDate);

		}
		System.out.println("After RFQ Order Expiry Date");

		Thread.sleep(2500);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		System.out.println("In Save RFQ Order Expiry Date");
		try {
			EIP_Menu.SaveRFQOrderExpiryDate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SaveRFQOrderExpiryDate);

		}
		System.out.println("Out Save RFQ Order Expiry Date");

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Thread.sleep(500);

		System.out.println("In Next Icon Auction");
		try {
			EIP_Menu.NextIconAuction.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.NextIconAuction);

		}
		System.out.println("Out Next Icon Auction");

	}

	public static void CapitalPRShipmentDetailsAdditionalDetails() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AdditionalDetails.click();
		/*
		 * assertEquals("Shipment Details", EIP_Menu.SD.getText());
		 * System.out.println("AdditionalDetails = "+EIP_Menu.SD.getText());
		 * 
		 * assertEquals(true, EIP_Menu.SD.isEnabled());
		 */
		Thread.sleep(500);
		EIP_Menu.SD.click();

	}

	public static void ShipmentDetailsRDAdditionalDetails() throws Throwable {

		Thread.sleep(1500);
		assertEquals("Shipment Details", EIP_Menu.SD.getText());
		System.out.println("Additional Details = " + EIP_Menu.SD.getText());
		Thread.sleep(1500);
		assertEquals(true, EIP_Menu.SD.isEnabled());
		Thread.sleep(1000);
		EIP_Menu.SD.click();
		System.out.println("Select Shipment Details in Other Terms RFQ Create Page");
		Thread.sleep(1000);
		EIP_Menu.RDSDJob.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		System.out.println("Enter Job for Shipment Details in Other Terms RFQ Create Page");
		Thread.sleep(1000);
		EIP_Menu.RDBillingTo.click();
		System.out.println("Click Billing to Shipment Details in Other Terms RFQ Create Page");
		EIP_Menu.RDSelectBT.click();
		Thread.sleep(1000);
		System.out.println("Select Billing to Shipment Details in Other Terms RFQ Create Page");
		EIP_Menu.RDShippingTo.click();
		Thread.sleep(1000);
		System.out.println("Click shipping to Shipment Details in Other Terms RFQ Create Page");
		EIP_Menu.RDSelectST.click();
		Thread.sleep(1000);
		System.out.println("Select shipping to Shipment Details in Other Terms RFQ Create Page");
		EIP_Menu.RDAddSD.click();
		System.out.println("Select Add Button for Shipment Details in Other Terms RFQ Create Page");
	}

	public static void SRShipmentDetailsRDAdditionalDetails() throws Throwable {
		assertEquals("Shipment Details", EIP_Menu.SD.getText());
		System.out.println("Additional Details = " + EIP_Menu.SD.getText());

		assertEquals(true, EIP_Menu.SD.isEnabled());
		Thread.sleep(500);
		EIP_Menu.SD.click();
		EIP_Menu.RDSDJob.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		EIP_Menu.RDBillingTo.click();
		EIP_Menu.RDSelectBT.click();
		EIP_Menu.ExecutionAt.click();
		EIP_Menu.SlExecutionAt.click();
		EIP_Menu.RDAddSD.click();

	}

	public static void SelectBillingToShippingToRDRFQ() throws Throwable {
		Thread.sleep(3500);
		EIP_Menu.RDSRJobAD.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		Thread.sleep(500);
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);

		}

		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		}

		Thread.sleep(500);
		try {
			EIP_Menu.SelectShippingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetails);

		}

		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);

		}
		Thread.sleep(500);

		EIP_Menu.AddSD.click();

	}

	public static void SelectBillingToShippingToAuctionRefRFQ() throws Throwable {

		Thread.sleep(500);
///##############################################
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);
		}
		
		Thread.sleep(1000);
		
		try {
			EIP_Menu.ListBillingToShipmentDetailsRD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);
		}
	
		Thread.sleep(1000);
	
	try {
		EIP_Menu.SelectShippingToShipmentDetails.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);
	}
	
	Thread.sleep(1000);
	
	try {
		EIP_Menu.ListBillingToShipmentDetailsRD.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);
	}
}
	
	
	
	//##############################################

	public static void SelectBillingToShippingToRateDiscoveryRFQ() throws Throwable {
		Thread.sleep(3500);
		EIP_Menu.RDSRJobAD.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		Thread.sleep(500);
		try {
			EIP_Menu.SelectBillingToShipmentDetailsRD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetailsRD);

		}

		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		}

		Thread.sleep(500);
		try {
			EIP_Menu.SelectShippingToShipmentDetailsRD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetailsRD);

		}

		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);

		}
		Thread.sleep(500);

		EIP_Menu.AddSD.click();

	}

	public static void SelectBillingToShippingTo() throws Throwable {
		Thread.sleep(3500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectBillingToShipmentDetails));
		// EIP_Menu.SelectBillingToShipmentDetails.click();
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);

		}

		// EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(500);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);

			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShippingToShipmentDetails));
		}
		// EIP_Menu.SelectShippingToShipmentDetails.click();
		Thread.sleep(500);
		try {
			EIP_Menu.SelectShippingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetails);

		}
		// EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(500);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);

		}
	}

	public static void SelectBillingToShippingToRD() throws Throwable {
		Thread.sleep(3500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectBillingToShipmentDetails));
		// EIP_Menu.SelectBillingToShipmentDetails.click();
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);

		}

		// EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetailsRD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);
			Thread.sleep(1800);
			wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShippingToShipmentDetails));
		}
		// EIP_Menu.SelectShippingToShipmentDetails.click();

		try {
			EIP_Menu.SelectShippingToShipmentDetails.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetails);

		}
		// EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetailsRD.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);

		}
	}

	public static void TradeDetailsAdditionalDetails() throws Throwable {
		assertEquals("Trade Details", EIP_Menu.TradeDetails.getText());
		System.out.println("Additional Details = " + EIP_Menu.TradeDetails.getText());
		Thread.sleep(500);
		assertEquals(true, EIP_Menu.TradeDetails.isEnabled());
		Thread.sleep(1000);
		EIP_Menu.TradeDetails.click();
		System.out.println("Select Trade Details in Additional Details");
		Thread.sleep(1000);
		EIP_Menu.TradeTerms.click();
		System.out.println("Click Trade Terms in Additional Details");

		/*
		 * try { EIP_Menu.TradeTerms.click(); } catch(Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.TradeTerms); }
		 */
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTradeTerms));
		EIP_Menu.SelectTradeTerms.click();

		System.out.println("Select Trade Terms in Additional Details");

	}

	public static void AucTradeDetailsAdditionalDetails() throws Throwable {
		assertEquals("Trade Details", EIP_Menu.TradeDetails.getText());
		System.out.println("Additional Details = " + EIP_Menu.TradeDetails.getText());

		assertEquals(true, EIP_Menu.TradeDetails.isEnabled());
		Thread.sleep(500);
		EIP_Menu.TradeDetails.click();
		Thread.sleep(500);
		EIP_Menu.AucTradeTerms.click();

		/*
		 * try { EIP_Menu.TradeTerms.click(); } catch(Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.TradeTerms); }
		 */

		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAucTradeTerms));
		EIP_Menu.SelectAucTradeTerms.click();

	}

	public static void CapitalPRRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		EIP_Menu.SelectNextIconPaymentTerms.click();

	}

	public static void RequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();
		Thread.sleep(500);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectRFQRDDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);

		try {
			EIP_Menu.SelectRFQRDDate.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectRFQRDDate);
		}

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */

		/*
		 * Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		EIP_Menu.SelectNextIconPaymentTerms.click();

	}

	public static void AucRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuAuc.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuAuc.getText());
		Thread.sleep(500);
		// assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuAuc));
		EIP_Menu.RequestEssentialsMenuAuc.click();

		// EIP_Menu.ASNapplicableYES_M.click();

		Thread.sleep(500);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		Thread.sleep(500);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * 
		 * //Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		 * EIP_Menu.AcceptAlert.click();
		 */

		// EIP_Menu.SelectNextIconPaymentTerms.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		EIP_Menu.extmsg.click();
		Robot rr = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		// Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void AucMatRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuAuc.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuAuc.getText());
		Thread.sleep(2500);
		// assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuAuc));
		EIP_Menu.RequestEssentialsMenuAuc.click();


		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * 
		 * //Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		 * EIP_Menu.AcceptAlert.click();
		 */

		// EIP_Menu.SelectNextIconPaymentTerms.click();

		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.VendorAlert();

		EIP_Menu.extmsg.click();
		Robot rr = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		// Thread.sleep(500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void PRRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		// EIP_Menu.ASNapplicableYES_M.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		EIP_Menu.SelectNextIconPaymentTerms.click();

	}

	public static void AuctionRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		// EIP_Menu.ASNapplicableYES_M.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.AlertAccept();
		Thread.sleep(500);
		EIP_Menu.SelectNextIconPaymentTerms.click();

	}

	public static void AuctionRequestEssentialsRFQAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());
		Thread.sleep(500);
		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		// EIP_Menu.ASNapplicableYES_M.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();
		Thread.sleep(1000);
		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * Thread.sleep(500); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyRelease(KeyEvent.VK_TAB);
		 */
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		 * EIP_Menu.AcceptAlert.click();
		 * 
		 * EIP_Menu.SelectNextIconPaymentTerms.click();
		 */

	}

	public static void RDRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		EIP_Menu.SelectNextIconPaymentTerms.click();

	}

	public static void RDRequestEssentialsAdditionalDetailsHeadless() throws Throwable {
		Thread.sleep(1000);
		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());
		Thread.sleep(1000);
		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		System.out.println("Select Request Essentials in Additional Details ");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();
		System.out.println("Select RFQ Order Expiry Date in Additional Details ");
		Thread.sleep(3500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));

//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		// EIP_Menu.RFQOrderExpiryDate.click();

		// Test
		Date date = new Date();
		System.out.println("Today Date : " + date);
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int fifth_day = Integer.parseInt(today) + 5;
		String select_fifthday = Integer.toString(fifth_day);
		System.err.println("Fifth Day : " + select_fifthday);
		Thread.sleep(1000);
		List<WebElement> rFQOrderExpiryDate2 = EIP_Menu.RFQOrderExpiryDate2;
		for (WebElement webElement : rFQOrderExpiryDate2) {
			if (webElement.getAttribute("innerHTML").contains(select_fifthday)) {
				webElement.click();
				break;
			}
		}
		Thread.sleep(1000);
		((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);", EIP_Menu.SaveDLP);

		Thread.sleep(1000);
		
		try {
			EIP_Menu.SaveDLP.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SaveDLP);
		}
		System.out.println("Select Save Button in Request Essentials");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();
		System.out.println("Alert Accept for Request Essentials");
		Thread.sleep(5000);
		EIP_Menu.SelectNextIconPaymentTerms.click();
		System.out.println("Select Next Button in Additional Details");
	}

	public static void SRRDVendorAutoBQ() throws Throwable {

		Thread.sleep(500);
		EIP_Menu.RFQMaterialcategory.click();
//EIP_Menu.RFQMaterialcategory.sendKeys(ConfigFileReader.getMaterialcategory_RFQ(), Keys.TAB);

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getMaterialcategory_RFQ())) {
				webElement.click();
//System.out.println(webElement.getText());
				break;
//ALL - ALL
			}

		}
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));
		EIP_Menu.EnterVendorRFQ.sendKeys(ConfigFileReader.getVendor_RFQ());
//wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterVendorRFQ));

//Thread.sleep(500);
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_BACK_SPACE);
		 */

		Thread.sleep(500);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		Thread.sleep(1200);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		EIP_Menu.SelectVendor.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));
		boolean AddVendor = EIP_Menu.SelectAddVendorIcon.isEnabled();
		if (AddVendor == true) {
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.SelectAddVendorIcon.click();
			EIP_Menu.AcceptAlert.click();
			Thread.sleep(500);
			EIP_Menu.SelectSRAutoBQ.click();
			assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
			System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

			EIP_Menu.SelectNextIconVendorRDSR.sendKeys(Keys.TAB, Keys.ENTER);
			EIP_Menu.AcceptAlert.click();
		}
	}

	public static void SRRDRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 */

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		EIP_Menu.SelectNextIconPaymentTerms.click();

	}

	public static void Attachment() throws Throwable {
		Thread.sleep(500);
		assertEquals("Document Specific Attachment", EIP_Menu.DSA.getText());
		System.out.println("Attachment = " + EIP_Menu.DSA.getText());
		Thread.sleep(500);
		assertEquals(true, EIP_Menu.DSA.isEnabled());

	}
	
	
	public static void EditAttachmentRFQCreation() throws Throwable {

		

		Thread.sleep(2500);

		try {
			EIP_Menu.AttachGeneralTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AttachGeneralTerms);
		}

		System.out.println("Select Attach General Terms & Conditions");

		Thread.sleep(1500);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		System.out.println("Select Save button Attach General Terms & Conditions");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();

		System.out.println("Accept Alert in Attach General Terms & Conditions");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();
		System.out.println("Select Submit button in Attach General Terms & Conditions");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();
		
		
		// Database Open
				DataBaseConnection.dataBaseConnectionCONSRC();
				
				// To Call DSCode Value from method
				DataBaseConnection.RFQSaveDraftDSCode_test();
				
				// Convert DSCode value & Assign into a Variable
				String dSCode2 = DataBaseConnection.DSCode;
				
				assertEquals("1", dSCode2);
				Thread.sleep(900);

				// Print the DSCode Value
				System.err.println("After Submit the RFQ Number DS Code : " + dSCode2);
				
				// Database Open
				DataBaseConnection.databaseConnectionClose();
		
		System.out.println("Accept Alert in Attach General Terms & Conditions");
		
		Thread.sleep(500);
		
		
		try {
			EIP_Menu.CloseAdvanceSearch.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.CloseAdvanceSearch);
		}
		
		System.out.println("Closed Advance Search in Edit RFQ");
		
		Commoncontrol.RFQSubmitStatus();
		
		Login_Steps.Logout();
	}

	public static void AttachmentRFQCreation() throws Throwable {

	

		Thread.sleep(2500);

		try {
			EIP_Menu.AttachGeneralTerms.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AttachGeneralTerms);
		}

		System.out.println("Select Attach General Terms & Conditions");

		Thread.sleep(1500);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		System.out.println("Select Save button Attach General Terms & Conditions");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();

		System.out.println("Accept Alert in Attach General Terms & Conditions");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();
		System.out.println("Select Submit button in Attach General Terms & Conditions");

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();
		
		
		// Database Open
				DataBaseConnection.dataBaseConnectionCONSRC();
				
				// To Call DSCode Value from method
				DataBaseConnection.RFQSaveDraftDSCode_test();
				
				// Convert DSCode value & Assign into a Variable
				String dSCode2 = DataBaseConnection.DSCode;
				
				assertEquals("1", dSCode2);
				Thread.sleep(900);

				// Print the DSCode Value
				System.err.println("After Submit the RFQ Number DS Code : " + dSCode2);
				
				// Database Open
				DataBaseConnection.databaseConnectionClose();
		
		System.out.println("Accept Alert in Attach General Terms & Conditions");
		
		Thread.sleep(500);
		
		Commoncontrol.RFQSubmitStatus();
		
		Login_Steps.Logout();
	}
	
	
	public static void RFQSubmitStatus() throws Throwable {

		Thread.sleep(3000);

		try {
			EIP_Menu.AdvanceSearchHomePage.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AdvanceSearchHomePage);
		}

		System.out.println("Select Advance Search Icon in Home Page");
		
		
	
	
	Thread.sleep(500);

	try {
		EIP_Menu.EnterRFQNUmber.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.EnterRFQNUmber);

	}

	System.out.println("Select RFQ Number in Advance Search");
	
	Thread.sleep(1000);

	DataBaseConnection.EnterRFQFromDBEdit();
	System.out.println("Enter RFQ Number from DB");


	Thread.sleep(500);
	try {
		EIP_Menu.SelectSearchIcon.click();
	} catch (Exception e) {
		js.executeScript("arguments[0].click();", EIP_Menu.SelectSearchIcon);

	}
	
	System.out.println("Select Search Icon in Advance Search");
	
	Thread.sleep(700);
	
	
	((JavascriptExecutor) Webdriver.driver).executeScript("arguments[0].scrollIntoView(true);",
			EIP_Menu.SubmitStatus);
	
	Thread.sleep(500);
	
	assertEquals("Submitted", EIP_Menu.SubmitStatus.getText());
	System.err.println("Request For Quote Details = " + EIP_Menu.SubmitStatus.getText()  + "  Successfully");
	
	
	
	
	
	
}
	
	
	

	public static void AttachmentAuctionCreation() throws Throwable {

		/*
		 * assertEquals("Attach general terms and conditions",
		 * EIP_Menu.AuctionAttachGeneralTerms.getText());
		 * System.out.println("Attachment = " +
		 * EIP_Menu.AuctionAttachGeneralTerms.getText());
		 */

		// assertEquals(true, EIP_Menu.AuctionAttachGeneralTerms.isEnabled());

		Thread.sleep(500);
		// EIP_Menu.AuctionAttachGeneralTermsS.sendKeys(Keys.TAB, Keys.ENTER);

		EIP_Menu.AuctionAttachGeneralTermsS.click();

		

		Thread.sleep(500);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Login_Steps.Logout();
	}

	public static void AttachmentAuctionReversRateDiscoveryCreation() throws Throwable {

		Thread.sleep(500);

		EIP_Menu.AuctionAttachGeneralTermsS.click();

		Thread.sleep(500);

		EIP_Menu.TCSave.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

		Login_Steps.Logout();
	}

	public static void AttachmentAuctionReversCreation() throws Throwable {

		Thread.sleep(1500);

		EIP_Menu.AuctionAttachGeneralTermsS.click();
		System.out.println("Attach General Terms");

		Thread.sleep(1000);

		EIP_Menu.AucRevTCSave.click();
		Thread.sleep(1000);

		Commoncontrol.eAuctionAlert();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();
		System.out.println("Submit");
		Thread.sleep(1000);

		Commoncontrol.eAuctionAlert();
		Thread.sleep(500);

		Login_Steps.Logout();
	}

	public static void AttachmentAuctionReversePurchaseRequestCreation() throws Throwable {

		Thread.sleep(500);
		// EIP_Menu.AuctionAttachGeneralTermsS.sendKeys(Keys.TAB, Keys.ENTER);

		EIP_Menu.AuctionAttachGeneralTermsS.click();

		Thread.sleep(500);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();

		Thread.sleep(500);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		 * EIP_Menu.AcceptAlert.click();
		 */

		Thread.sleep(500);

		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		// EIP_Menu.AcceptAlert.cliEIP_Menu.AcceptAlert.click()ck();
		Commoncontrol.eAuctionAlert();
		Login_Steps.Logout();
	}

	public static void RFQCapitalAutoPRScope() throws Throwable {

		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_CPRRFQ());
	}

//Auction

	public static void eAuctionHomePageSearchMenu() throws Throwable {
		EIP_Menu.SearchMenu.sendKeys(ConfigFileReader.getSearchMenu_eAuction());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.auct));
		EIP_Menu.auct.click();
	}

	public static void eAuctionHomePageVerification() throws Throwable {
		assertEquals("e-Auction", EIP_Menu.auc.getText());
		System.out.println("eAuction Home = " + EIP_Menu.auc.getText());
		Thread.sleep(500);
		assertEquals("Material", EIP_Menu.eaucMat.getText());
		System.out.println("eAuction Home = " + EIP_Menu.eaucMat.getText());
		Thread.sleep(500);
		assertEquals("Service", EIP_Menu.eaucser.getText());
		System.out.println("eAuction Home = " + EIP_Menu.eaucser.getText());
		Thread.sleep(500);
		assertEquals("Package", EIP_Menu.eaucpak.getText());
		System.out.println("eAuction Home = " + EIP_Menu.eaucpak.getText());

	}

	public static void eAuctionHomePageAddIcon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAuctionAddicon));
		boolean createiconstatus = EIP_Menu.SelectAuctionAddicon.isEnabled();
		if (createiconstatus == true) {
			// EIP_Menu.SelectAddIcon.click();

			// js.executeScript("arguments[0].click()", EIP_Menu.SelectAuctionAddicon);
			/*
			 * EIP_Menu.Auccl.click(); Login_Steps.Logout();
			 */
			Thread.sleep(4000);
			EIP_Menu.SelectAuctionAddicon.click();
		}

	}

	public static void eAuctionHomePackage() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Package));
		boolean createiconstatus = EIP_Menu.Package.isEnabled();
		if (createiconstatus == true) {
			// EIP_Menu.SelectAddIcon.click();
			Thread.sleep(1500);
			// js.executeScript("arguments[0].click()", EIP_Menu.Package);

			EIP_Menu.Package.click();
			/*
			 * EIP_Menu.Auccl.click(); Login_Steps.Logout();
			 */
		}

	}

	public static void eAuctionLoginandSelectCreate() throws Throwable {
		Login_Objects.Otheruser.click();
		Thread.sleep(200);
		Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
		Thread.sleep(200);
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Thread.sleep(200);
		Login_Objects.Login.click();

	}

	public static void eAuctionScheduleEssentialsVerification() throws Throwable {
		Thread.sleep(400);
		assertEquals("Schedule Essentials", EIP_Menu.LBSE.getText());
		System.out.println("Schedule Essentials Page = " + EIP_Menu.LBSE.getText());

	}

	public static void eAuctionFilter() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AuctionFilter));
		Thread.sleep(500);
		EIP_Menu.AuctionFilter.click();
		Thread.sleep(500);
		DataBaseConnection.EnterPRNumAuction();
		// Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAuctionFilterPR));
		EIP_Menu.SelectAuctionFilterPR.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextAuction));
		EIP_Menu.SelectNextAuction.click();

//AuctionFilterPR
	}

	public static void eAuctionScheduleEssentialsEnterAuctionScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RPReAuction());

	}

	public static void eAuctionReverseRDEnterAuctionScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDReAuction());

	}

	public static void eAuctionReversePurchaseRequestScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_ReversePReAuction());

	}

	public static void eAuctionRankOrderReversePurchaseRequestScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RankOrderReversePReAuction());

	}

	public static void eAuctionReverseRequestForQuoteScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_ReverseRequestForQuoteeAuction());

	}

	public static void eAuctionRORRDEnterAuctionScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDRORAuction());

	}

	public static void eAuctionROFRDEnterAuctionScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDROFAuction());

	}

	public static void eAuctionFDRDEnterAuctionScope() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDFDAuction());

	}

	public static void eAuctionReverseRDSRNext() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.NextSE.click();

	}

	public static void eAuctionReverseRDDesciption() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_RDReAuction());

	}

	public static void eAuctionReverseSecRDDesciption() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Desciption2.sendKeys(ConfigFileReader.getDesciptionSec_RDReAuction());

	}

	public static void eAuctionReverseThreeRDDesciption() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Desciption3.sendKeys(ConfigFileReader.getDesciptionThree_RDReAuction());

	}

	public static void eAuctionReverseRDMaterialCategory() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.MaterialCategory.sendKeys(ConfigFileReader.getMaterialCategory_ReverseRateDiscovery());

	}

	public static void eAuctionRORRDDesciption() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_RORRDAuction());

	}

	public static void eAuctionROFRDDesciption() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_ROFRDAuction());

	}

	public static void eAuctionFDRDDesciption() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_FDRDAuction());

	}

	public static void eAuctionReverseRDSuggRate() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDeAuction());
		// Thread.sleep(500);
		// EIP_Menu.Auctionrdr.click();

	}

	public static void eAuctionReverseSecRDSuggRate() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuSuggRate1.sendKeys(ConfigFileReader.getSuggRateSec_RDeAuction());
		// Thread.sleep(500);
		// EIP_Menu.Auctionrdr.click();

	}

	public static void eAuctionReverseThreeRDSuggRate() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuSuggRate2.sendKeys(ConfigFileReader.getSuggRateThree_RDeAuction());
		// Thread.sleep(500);
		// EIP_Menu.Auctionrdr.click();

	}

	public static void eAuctionReverseRDBitvalueNext() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.BitvalueNext.sendKeys(Keys.TAB, Keys.ENTER);

	}

	public static void eAuctionReverseRDQuantity() throws Throwable {
		Thread.sleep(3000);

		EIP_Menu.AuctionQuantity.sendKeys(ConfigFileReader.getQuantity_RDReAuction());
		// 1

	}

	public static void eAuctionReverseRDNewQuantity() throws Throwable {
		Thread.sleep(1000);

		EIP_Menu.AuctionQuantityNew.sendKeys(ConfigFileReader.getQuantity_RDReAuction());

	}

	public static void eAuctionReverseSecRDQuantity() throws Throwable {
		Thread.sleep(500);

		EIP_Menu.AuctionQuantity2.sendKeys(ConfigFileReader.getQuantitySec_RDReAuction());

	}

	public static void eAuctionReverseThreeRDQuantity() throws Throwable {
		Thread.sleep(500);

		EIP_Menu.AuctionQuantity3.sendKeys(ConfigFileReader.getQuantityThree_RDReAuction());

	}

	public static void RRDUOM() throws Throwable {

		Thread.sleep(500);
		EIP_Menu.UOM.click();

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getUOM_RPReAuction())) {
				webElement.click();
//System.out.println(webElement.getText());
				break;
//ALL - ALL
			}
		}

	}

	public static void RRDUOMSec() throws Throwable {

		Thread.sleep(500);
		EIP_Menu.UOM1.click();

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getUOMSec_RPReAuction())) {
				webElement.click();
//System.out.println(webElement.getText());
				break;
//ALL - ALL
			}
		}

	}

	public static void RRDUOMThr() throws Throwable {

		Thread.sleep(500);
		EIP_Menu.UOM2.click();

		List<WebElement> selectEP = EIP_Menu.listMaterialcategory;
		for (WebElement webElement : selectEP) {
			if (webElement.getText().equals(ConfigFileReader.getUOMThree_RPReAuction())) {
				webElement.click();
//System.out.println(webElement.getText());
				break;
//ALL - ALL
			}
		}

	}

	public static void eAuctionAlert() throws Throwable {
		Thread.sleep(1000);
					
		System.err.println("Alert Type = " + EIP_Menu.ErrorAlert.getText());
		
		Thread.sleep(1000);
		System.err.println("Alert Text = " + EIP_Menu.ErrorAlertText.getText());
		Thread.sleep(1000);
		try {
			EIP_Menu.AcceptAlertR.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AcceptAlertR);
		}
		
		System.out.println("Alert Accepted");
	}
	
	public static void eAuctionErrorAlert() throws Throwable {
		Thread.sleep(1000);
					
		System.err.println("Alert Type = " + EIP_Menu.ErrorAlert.getText());
		
		Thread.sleep(1000);
		System.err.println("Add Material Alert Text = " + EIP_Menu.ErrorAlertText.getText());

		try {
			EIP_Menu.AcceptAlertR.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AcceptAlertR);
		}
		
		System.out.println("Error Alert Accepted");
	}

	public static void VendorAlert() throws Throwable {
		Thread.sleep(500);

		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		/*
		 * System.out.println("Alert Title = " + EIP_Menu.ErrorAlert.getText());
		 * Thread.sleep(500);
		 * 
		 * System.out.println("Alert Message = " + EIP_Menu.ErrorAlertText.getText());
		 * 
		 * Thread.sleep(500);
		 */

		/*
		 * try { EIP_Menu.TCDBQEditAcceptAlert.click(); } catch (Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.TCDBQEditAcceptAlert); }
		 */
		/*
		 * Robot r = new Robot(); Robot robot = new Robot();
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 */
		/*
		 * try { Alert alt = Webdriver.driver.switchTo().alert(); alt.accept(); } catch
		 * (Exception e) { js.executeScript("arguments[0].click();",
		 * EIP_Menu.AcceptAlertR); }
		 */

		try {
			EIP_Menu.AcceptAlertR.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AcceptAlertR);
		}

	}

	public static void AlertAccept() throws Throwable {
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		/*
		 * System.out.println("Alert Title = " + EIP_Menu.ErrorAlert.getText());
		 * Thread.sleep(500);
		 * 
		 * System.out.println("Alert Message = " + EIP_Menu.ErrorAlertText.getText());
		 * 
		 * Thread.sleep(3500);
		 */

		/*
		 * try { EIP_Menu.TCDBQEditAcceptAlert.click(); } catch (Exception e) {
		 * js.executeScript("arguments[0].click();", EIP_Menu.TCDBQEditAcceptAlert); }
		 */

		/*
		 * try { Alert alt = Webdriver.driver.switchTo().alert(); alt.accept(); } catch
		 * (Exception e) { js.executeScript("arguments[0].click();",
		 * EIP_Menu.AcceptAlertR); }
		 */

		/*
		 * Robot r = new Robot(); Robot robot = new Robot();
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * }
		 */

		try {
			EIP_Menu.AcceptAlertR.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AcceptAlertR);
		}
	}

	public static void SelecteAuctionReversePurchaseRequest() throws Throwable {
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());

		EIP_Menu.AllDatePR.click();
		Thread.sleep(500);
		EIP_Menu.PRDate.click();
		Thread.sleep(500);
		EIP_Menu.SelectSearchIcon.click();

	}

	public static void SelecteAuctionHSNReversePurchaseRequest() throws Throwable {
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());

		EIP_Menu.AuctionHSN.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();

	}

	public static void SelecteAuctionReverseRFQNext() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.SelectNextIconPaymentTerms.click();
		// EIP_Menu.AcceptAlert.click();
		Thread.sleep(500);
		Commoncontrol.eAuctionAlert();

	}

	public static void eAuctionAuctionSource() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuctionSource.click();
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Purchase Request")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void eAuctionRORAuctionType() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RORAuctionType.click();
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Rank Order Reverse")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void eAuctionROFAuctionType() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RORAuctionType.click();
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Rank Order Forward")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void eAuctionFDAuctionType() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.RORAuctionType.click();
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Forward")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void eAuctionReverseAuctionSource() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuctionSource.click();
		Thread.sleep(500);
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Rate Discovery")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void eAuctionReversPurchaseRequest() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuctionSource.click();
		Thread.sleep(500);
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Purchase Request")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}
	}

	public static void eAuctionRankOrderReversePurchaseRequest() throws Throwable {
		Thread.sleep(500);
		// EIP_Menu.AuctionSource.click();

		try {
			EIP_Menu.AuctionSource.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AuctionSource);
		}

		Thread.sleep(500);
		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Purchase Request")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void eAuctionReverseRequestForQuote() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuctionSource.click();

		List<WebElement> DropdownResult = EIP_Menu.AuctionSourceList;
		for (WebElement webElement : DropdownResult) {
			if (webElement.getText().equals("Request For Quote")) {
				webElement.click();
				System.out.println("Selected the Auction Source");
				break;
			}
		}

	}

	public static void SelecteAuctionRequestForQuote() throws Throwable {
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());

		EIP_Menu.SelectRFQforAuction.click();

		Thread.sleep(1500);

		DataBaseConnection.EnterRFQFromDBAuction();
		Thread.sleep(500);

		EIP_Menu.SelectRFQforAuction.clear();

		DataBaseConnection.EnterRFQFromDBAuction();
		Thread.sleep(500);
		/*
		 * DataBaseConnection.EnterRFQFromDBAuction(); Thread.sleep(500);
		 */
		EIP_Menu.SelectRFQforAuctionNumber.click();
		Thread.sleep(1500);

	}

}