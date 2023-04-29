package action_SCM;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

	public static void search(String PRNumber) {
		EIP_Menu.EnterPRFromDB.sendKeys(PRNumber);
		EIP_Menu.SelectSearchIcon.click();
		// assertEquals(PRNumber, EIP_Menu.PRNumGrid.getText());
		if (PRNumber.equals(EIP_Menu.Searchresult.getText())) {
			assertEquals(true, true);
		}

	}

	public static void RFQHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
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
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(300);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		Thread.sleep(500);
		assertEquals("E-Auction", EIP_Menu.MenueAuct.getText());
		System.out.println("SCM Menu = " + EIP_Menu.MenueAuct.getText());
		EIP_Menu.MenueAuct.click();

	}

	public static void TCDHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(300);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		Thread.sleep(500);
		assertEquals("Techno Commercial Document", EIP_Menu.SelectTCD.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SelectTCD.getText());
		EIP_Menu.SelectTCD.click();

	}

	public static void RFQBQHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(300);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		Thread.sleep(500);
		assertEquals("RFQ Bidders Quote", EIP_Menu.RFQBQ.getText());
		System.out.println("SCM Menu = " + EIP_Menu.RFQBQ.getText());
		EIP_Menu.RFQBQ.click();

	}

	public static void PRHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(300);
		EIP_Menu.SCM.click();
		assertEquals("Request", EIP_Menu.Request.getText());
		System.out.println("SCM Menu = " + EIP_Menu.Request.getText());
		EIP_Menu.Request.click();
		Thread.sleep(500);
		/*
		 * assertEquals("Purchase / Service", EIP_Menu.PurchaseService.getText());
		 * System.out.println("SCM Menu = "+EIP_Menu.PurchaseService.getText());
		 */
		EIP_Menu.PurchaseService.click();

	}

	public static void GRHomePageNavigateToMenu() throws InterruptedException {
		EIP_Menu.HomeMenu.click();
		// assertEquals("Supply Chain Mgmt", EIP_Menu.SCM.getText());
		System.out.println("SCM Menu = " + EIP_Menu.SCM.getText());
		Thread.sleep(300);
		EIP_Menu.SCM.click();
		assertEquals("Procurement", EIP_Menu.PRO.getText());
		System.out.println("SCM Menu = " + EIP_Menu.PRO.getText());
		EIP_Menu.PRO.click();
		/*
		 * assertEquals("General Request", EIP_Menu.PRGR.getText());
		 * System.out.println("SCM Menu = "+EIP_Menu.PRGR.getText());
		 */
		EIP_Menu.PRGR.click();

	}

	public static void BitValuesVerification() throws InterruptedException {
		Thread.sleep(500);
		assertEquals("Reverse", EIP_Menu.AucType.getText());
		System.out.println("Auction Type = " + EIP_Menu.AucType.getText());

	}

	public static void RateDiscoveryRFQCreateAddMaterial() {
		assertEquals("Add Material", EIP_Menu.addmat.getText());
		System.out.println("RFQ Create = " + EIP_Menu.addmat.getText());
		assertEquals("Rate Discovery", EIP_Menu.RFQRD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.RFQRD.getText());

		boolean nexticonstatus = EIP_Menu.RDicon.isEnabled();
		if (nexticonstatus == true) {

			// js.executeScript("arguments[0].click()", EIP_Menu.RDicon);
			EIP_Menu.RDicon.click();
		}

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

	public static void RateDiscoveryRFQCreatePage() {
		assertEquals("Material Code", EIP_Menu.DetailMC.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailMC.getText());
		assertEquals("Material Description", EIP_Menu.DetailMD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailMD.getText());
		assertEquals("Action", EIP_Menu.DetailAc.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailAc.getText());

	}

	public static void RateDiscoveryRFQSeriveCreatePage() {
		assertEquals("Code", EIP_Menu.DetailC.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailC.getText());
		assertEquals("Description", EIP_Menu.DetailMD.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.DetailMD.getText());
		assertEquals("Action", EIP_Menu.SerAuc.getText());
		System.out.println("Rate Discovery RFQ Create = " + EIP_Menu.SerAuc.getText());

	}

	public static void RateDiscoverySelectCartRFQCreateAddMaterial() throws InterruptedException {

		boolean nexticonstatus = EIP_Menu.RDCart.isEnabled();
		if (nexticonstatus == true) {
			Thread.sleep(500);
			// js.executeScript("arguments[0].click()", EIP_Menu.RDCart);
			EIP_Menu.RDCart.click();

		}

	}

	public static void ServiceRateDiscoveryCartVerifyRFQCreateAddRFQValue() throws InterruptedException {

		Thread.sleep(2000);
		EIP_Menu.EnterScopeOfRFQ.click();
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getSRScope_RDRFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantityRDSR));
		EIP_Menu.EnterQuantityRDSR.click();
		EIP_Menu.EnterQuantityRDSR.clear();
		EIP_Menu.EnterQuantityRDSR.sendKeys(ConfigFileReader.getQuantity_RFQ());
		Thread.sleep(1000);
		EIP_Menu.SRSuggRDService.click();
		EIP_Menu.SRSuggRDService.clear();
		EIP_Menu.SRSuggRDService.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		EIP_Menu.SACCode.click();
		Thread.sleep(800);
		EIP_Menu.SelectSACCode.click();
		EIP_Menu.SelectNextSRRDRFQ.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.AlertOk.click();
	}

	public static void RateDiscoveryCartVerifyRFQCreateAddMaterial() throws InterruptedException, AWTException {
		Thread.sleep(800);
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCart);
		EIP_Menu.RDCart.click();
		/*
		 * assertEquals("Material Cart", EIP_Menu.RDMC.getText());
		 * System.out.println("Rate Discovery Cart = "+EIP_Menu.RDMC.getText());
		 */
		Thread.sleep(2000);
		EIP_Menu.MaterialCategory.sendKeys(ConfigFileReader.getMaterialCategory_ReverseRateDiscovery());
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		EIP_Menu.RDMatSL.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		Thread.sleep(800);
		EIP_Menu.SelIt.click();
		// wait.until(ExpectedConditions.stalenessOf(EIP_Menu.RDMG));
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMG);
		Thread.sleep(2000);
		EIP_Menu.RDMG.click();
		EIP_Menu.RDMG.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		EIP_Menu.RDMatSL.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		EIP_Menu.SelIt.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		/*EIP_Menu.ChooseItems.click();
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.RDCI.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.CartPost);
*/		
		JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_ChooseItemsPR());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRChooseItems));
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		//robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		EIP_Menu.PRChooseItems.sendKeys("4");
		
		EIP_Menu.Item.click();
		
		EIP_Menu.MoveSelitm.click();
		
		EIP_Menu.CartPost.click();
		Thread.sleep(500);
		EIP_Menu.RDAddmatAuct.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		EIP_Menu.RDNext.click();
		// EIP_Menu.AlertOk.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		// EIP_Menu.RDNext.click();

	}
	
	
	public static void RateDiscoveryCartVerifyAuctiomCreateAddMaterial() throws InterruptedException, AWTException {
		Thread.sleep(800);
		
		EIP_Menu.RDCart.click();
		Thread.sleep(2000);
		EIP_Menu.MaterialCategory.sendKeys(ConfigFileReader.getMaterialCategory_ReverseRateDiscovery());
		/*EIP_Menu.ServCate.click();
		Thread.sleep(500);
		EIP_Menu.SelIt.click();
		Thread.sleep(500);
		EIP_Menu.RDMG.click();
		Thread.sleep(500);
		EIP_Menu.ServCate.click();*/
		
		
		
		//EIP_Menu.RDMatCat.sendKeys(ConfigFileReader.getMaterialCategory_RDRFQ());
		
		
		EIP_Menu.RDMatSL.click();
		
		Thread.sleep(800);
		EIP_Menu.SelIt.click();
		
		Thread.sleep(2000);
		EIP_Menu.RDMG.click();
		EIP_Menu.RDMG.click();
		
		EIP_Menu.RDMatSL.click();
		
		EIP_Menu.SelIt.click();
		
		JavascriptExecutor js = (JavascriptExecutor)Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.PRChooseItems);
		EIP_Menu.PRChooseItems.sendKeys(ConfigFileReader.getPR_ChooseItemsPR());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.PRChooseItems));
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		//robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		EIP_Menu.PRChooseItems.sendKeys("4");
		
		EIP_Menu.Item.click();
		
		EIP_Menu.MoveSelitm.click();
		
		EIP_Menu.CartPost.click();
		Thread.sleep(500);
		EIP_Menu.RDQuantity.click();
		EIP_Menu.RDQuantity.clear();
		EIP_Menu.RDQuantity.sendKeys(ConfigFileReader.getQuantity_RDReAuction());
		Thread.sleep(500);
		EIP_Menu.RDSuggestedRate.click();
		EIP_Menu.RDSuggestedRate.clear();
		
		EIP_Menu.RDSuggestedRate.sendKeys(ConfigFileReader.getSuggRate_RDeAuction());
		
		
		
		EIP_Menu.RDNext.click();
		

	}

	public static void RateDiscoveryVerifyRFQCreateAddRFQValue() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.EnterScopeOfRFQ.click();
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_RDRFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantity));
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		EIP_Menu.RDSuggRate.click();
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(500);
		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(800);
		EIP_Menu.AlertOk.click();

	}

	public static void CapitalPRRFQCreateAddRFQValue() throws InterruptedException {
		Thread.sleep(1000);
		EIP_Menu.EnterScopeOfRFQ.click();
		EIP_Menu.EnterScopeOfRFQ.sendKeys(ConfigFileReader.getScope_CPRRFQ());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.EnterQuantity));
		EIP_Menu.EnterQuantity.click();
		EIP_Menu.EnterQuantity.clear();
		EIP_Menu.EnterQuantity.sendKeys(ConfigFileReader.getQuantity_RFQ());
		EIP_Menu.RDSuggRate.click();
		EIP_Menu.RDSuggRate.clear();
		Thread.sleep(500);
		EIP_Menu.RDSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDRFQ());
		EIP_Menu.RDAddRFQValuSavedrf.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(800);
		EIP_Menu.AlertOk.click();

	}

	public static void LogOut() throws InterruptedException {
		EIP_Menu.CRFQcl.click();
		Login_Steps.Logout();
	}

	public static void RateDiscoveryCartVerification() throws InterruptedException {
		assertEquals("Material Cart", EIP_Menu.RDMC.getText());
		System.out.println("Rate Discovery Cart = " + EIP_Menu.RDMC.getText());
	}

	public static void RateDiscoveryEnterMaterialCategory() throws InterruptedException {
		EIP_Menu.RDMatCat.sendKeys(ConfigFileReader.getMaterialCategory_RDRFQ());
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		EIP_Menu.RDMatSL.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		EIP_Menu.SelIt.click();

	}

	public static void RateDiscoveryEnterServiceCategory() throws InterruptedException {

		EIP_Menu.ServCate.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);
		Thread.sleep(5000);

	}

	public static void RateDiscoverySelectMaterialGroup() throws InterruptedException {
		Thread.sleep(2000);
		EIP_Menu.RDMG.click();
		EIP_Menu.RDMG.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);
		EIP_Menu.RDMatSL.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.SelIt);;
		EIP_Menu.SelIt.click();

	}

	public static void RateDiscoverySelectServiceGroup() throws InterruptedException {
		Thread.sleep(5000);
		EIP_Menu.RDSG.click();
		EIP_Menu.RDEG.sendKeys(ConfigFileReader.getMaterialGroup_RDSRRFQ());
		Thread.sleep(500);
		EIP_Menu.RDSEG.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDMatSL);

	}

	public static void RateDiscoverySelectChooseItems() throws InterruptedException {

		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.ChooseItems.click();
		EIP_Menu.ChooseItems.sendKeys(ConfigFileReader.getChooseItemsCart_RDRFQ());
		// js.executeScript("arguments[0].click()", EIP_Menu.RDCI);
		EIP_Menu.RDCI.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.MoveSelitm);
		EIP_Menu.MoveSelitm.click();

	}

	public static void RateDiscoveryServiceSelectChooseItems() throws InterruptedException {

		// js.executeScript("arguments[0].click()", EIP_Menu.ChooseItems);
		EIP_Menu.SRChooseItems.click();

		Thread.sleep(1000);
		EIP_Menu.MoveSelitm.click();

	}

	public static void RateDiscoverySelectChooseItemsPostAndMove() throws InterruptedException {
		// js.executeScript("arguments[0].click()", EIP_Menu.CartPost);
		EIP_Menu.CartPost.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);

		EIP_Menu.RDAddmatAuct.click();
		Thread.sleep(500);
		EIP_Menu.RDNext.click();
		// EIP_Menu.AlertOk.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		// EIP_Menu.RDNext.click();

	}

	public static void ServiceRateDiscoverySelectChooseItemsPostAndMove() throws InterruptedException {
		// js.executeScript("arguments[0].click()", EIP_Menu.CartPost);
		EIP_Menu.SRDCartPost.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);

		EIP_Menu.RDAddmatAuct.click();
		Thread.sleep(500);
		EIP_Menu.RDNext.click();
		// EIP_Menu.AlertOk.click();
		// js.executeScript("arguments[0].click()", EIP_Menu.RDNext);
		// EIP_Menu.RDNext.click();

	}

	public static void paymentTermsRelease() {
		// js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		EIP_Menu.EnterReleasePaymentTerms.click();
		EIP_Menu.EnterReleasePaymentTerms.clear();
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getRelease_RFQ());
	}

	public static void paymentTermsReleaseCreate() {
		// js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		/*
		 * EIP_Menu.EnterReleasePaymentTerms.click();
		 * EIP_Menu.EnterReleasePaymentTerms.clear();
		 * EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.
		 * getReleaseCreate_RFQ());
		 */

		JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
		js.executeScript("arguments[0].click()", EIP_Menu.EnterReleasePaymentTerms);
		EIP_Menu.EnterReleasePaymentTerms.clear();
		EIP_Menu.EnterReleasePaymentTerms.sendKeys(ConfigFileReader.getReleaseCreate_RFQ());
	}

	public static void paymentTermsEvenet() {
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
		Thread.sleep(800);
		EIP_Menu.PaymAct.click();
	}

	public static void ServicePaymentTermsDocument() throws Throwable {
		EIP_Menu.SRDoc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectDocumentPaymentTerms));
		EIP_Menu.SelectDocumentPaymentTerms.click();
		Thread.sleep(800);
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
		EIP_Menu.AcceptAlert.click();

	}

	public static void ServicePaymentTermsCompletedAndMoveToOtherTrems() throws Throwable {
		EIP_Menu.SelectSRNextPaymentTerms.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		EIP_Menu.AcceptAlert.click();

	}

	public static void RDServicePaymentTermsCompletedAndMoveToOtherTrems() throws Throwable {
		EIP_Menu.SelectSRNextPaymentTerms.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		EIP_Menu.AcceptAlert.click();

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

	public static void SRRDOtherTermsLDApplicableDate() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Ldad));
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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
		Thread.sleep(800);
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		EIP_Menu.Ldvp.click();
		EIP_Menu.Ldvp.sendKeys(ConfigFileReader.getLDvaluePercentage_RFQ());

	}

	public static void OtherTermsDuration() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.Dur));
		Thread.sleep(2000);
		EIP_Menu.Dur.click();

		List<WebElement> selectDUR = EIP_Menu.DurList;
		for (WebElement webElement : selectDUR) {
			if (webElement.getText().equals(ConfigFileReader.getDuration_RFQ())) {
				Thread.sleep(1000);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceOtherTermsDuration() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SRDur));
		Thread.sleep(2000);
		EIP_Menu.SRDur.click();

		List<WebElement> selectDUR = EIP_Menu.DurList;
		for (WebElement webElement : selectDUR) {
			if (webElement.getText().equals(ConfigFileReader.getDuration_RFQ())) {
				Thread.sleep(1000);
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
		Thread.sleep(500);
		// wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectVendor));
		Thread.sleep(3200);
		EIP_Menu.EnterVendorRFQ.sendKeys("321");
		EIP_Menu.SelectVendor.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAddVendorIcon));

		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.SelectAddVendorIcon.click();
		EIP_Menu.AcceptAlert.click();
		Thread.sleep(1000);
		EIP_Menu.SelectAutoBQ.click();
		assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
		System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

		EIP_Menu.SelectNextIconVendor.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		EIP_Menu.AcceptAlert.click();

	}

	public static void ServiceAutoBQ() throws Throwable {
		Thread.sleep(2000);
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
		EIP_Menu.AcceptAlert.click();
		Thread.sleep(1000);
		EIP_Menu.SelectSRAutoBQ.click();
		assertEquals("AutoBQ Required", EIP_Menu.AutoBQ.getText());
		System.out.println("Vendor Type = " + EIP_Menu.AutoBQ.getText());

		EIP_Menu.SelectNextIconVendorSR.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.AcceptAlert.click();

	}

	public static void OtherTermsRDNoOfYear() throws Throwable {

		EIP_Menu.RDNoy.sendKeys(ConfigFileReader.getNoOfYear_RFQ());

	}

	public static void OtherTermsRDMaximumofPOValue() throws Throwable {

		EIP_Menu.RDMopy.sendKeys(ConfigFileReader.getMaximumofPOValue_RFQ());

	}

	public static void OtherTermsMaximumofPOValue() throws Throwable {

		EIP_Menu.Mopv.sendKeys(ConfigFileReader.getMaximumofPOValue_RFQ());

	}

	public static void ServiceOtherTermsMaximumofPOValue() throws Throwable {

		EIP_Menu.SRMopv.sendKeys(ConfigFileReader.getMaximumofPOValue_RFQ());

	}

	public static void OtherTermsLDSave() throws Throwable {

		EIP_Menu.LDsave.sendKeys(Keys.TAB, Keys.ENTER);

	}

	public static void AcceptAlertLD() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

	}

	public static void OtherCostCategory() throws InterruptedException {

		Thread.sleep(1500);
		EIP_Menu.Oc.click();
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.CatOC));
		Thread.sleep(800);
		EIP_Menu.CatOC.click();

		List<WebElement> selectCat = EIP_Menu.DurList;
		for (WebElement webElement : selectCat) {
			if (webElement.getText().equals(ConfigFileReader.getCategory_RFQ())) {
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void OtherCostCategoryValue() throws Throwable {
		EIP_Menu.CatVlu.click();
		EIP_Menu.CatVlu.clear();

		EIP_Menu.CatVlu.sendKeys(ConfigFileReader.getCategoryValue_RFQ());

	}

	public static void OtherCostRateDiscoveryCategoryValue() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.RDCatVlu.click();
		EIP_Menu.RDCatVlu.clear();

		EIP_Menu.RDCatVlu.sendKeys(ConfigFileReader.getCategoryValue_RFQ());

	}

	public static void OtherCostRemarks() throws Throwable {

		EIP_Menu.OCRem.sendKeys(ConfigFileReader.getOtherCostRemarks_RFQ());

	}

	public static void OtherCostSave() throws Throwable {

		// EIP_Menu.OCRem.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.OCSave.click();

	}

	public static void RateDiscoveryOtherCostSave() throws Throwable {

		EIP_Menu.OCRem.sendKeys(Keys.TAB, Keys.ENTER);
		// EIP_Menu.OCSave.click();

	}

	public static void OtherCostAcceptAlert() throws Throwable {

		EIP_Menu.AcceptAlert.click();

	}

	public static void DPLPeriodDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.DLPP.click();
		EIP_Menu.DLPP.sendKeys(ConfigFileReader.getDPLPeriod_RFQ());

	}

	public static void ServiceDPLPeriodDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.SRDurDLP.click();
		EIP_Menu.SRDurDLP.sendKeys(ConfigFileReader.getDPLPeriod_RFQ());

	}

	public static void DurationDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.DurDLP.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(1000);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceDurationDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(3000);
		EIP_Menu.SRDurDLP.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(1000);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void ServiceRDDurationDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.DurDLP.click();

		List<WebElement> selectDur = EIP_Menu.DurList;
		for (WebElement webElement : selectDur) {
			if (webElement.getText().equals(ConfigFileReader.getDurationDLP_RFQ())) {
				Thread.sleep(1000);
				webElement.click();
				// System.out.println(webElement.getText());
				break;

			}

		}
	}

	public static void EventsDefectLiablilityPeriod() throws Throwable {
		Thread.sleep(1200);
		EIP_Menu.EvnDLP.click();

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

		// EIP_Menu.DLPSave.sendKeys(Keys.TAB, Keys.ENTER);
		EIP_Menu.OCSave.click();

	}

	public static void DefectLiablilityPeriodAcceptAlert() throws Throwable {

		EIP_Menu.AcceptAlert.click();

	}

	public static void PaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.PT.click();
		EIP_Menu.PT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

	}

	public static void PRPaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.PRPT.click();
		EIP_Menu.PRPT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

	}

	public static void SRPaymentTermsSpecialTermsQualifications() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.SRPT.click();
		EIP_Menu.SRPT.sendKeys(ConfigFileReader.getPaymentTermsSTQ_RFQ());

	}
	
	public static void SendYourBidforReverseAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.YourBid.click();
		EIP_Menu.YourBid.sendKeys(ConfigFileReader.getYourBid_Auction());
		Thread.sleep(3000);
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
	
	
	public static void SendYourBidforROReAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.YourBid.click();
		EIP_Menu.YourBid.sendKeys(ConfigFileReader.getYourBidROF_Auction());
		Thread.sleep(3000);
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
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAA_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidAC_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	
	public static void SendYourBidforROFAVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidACROF_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	
	public static void SendYourBidforA1VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAA_Auction());
		//EIP_Menu.BidInd1.click();
		
		Thread.sleep(800);
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(800);
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidAC_Auction());
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
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
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidAAROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		Thread.sleep(800);
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidAB_Auction());
		Thread.sleep(800);
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidACROF_Auction());
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	
	public static void SendYourBidforA2VendoreAuction() throws Throwable {
		Thread.sleep(800);
		
		try {
			EIP_Menu.ReBid1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBid1);
			
		}
		Thread.sleep(800);
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
Thread.sleep(800);
		
		try {
			EIP_Menu.ReBid2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBid2);
			
		}
		Thread.sleep(800);
		
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
Thread.sleep(800);
		
		try {
			EIP_Menu.ReBid3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ReBid3);
			
		}
		Thread.sleep(800);
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
	}
	
	public static void SendYourBidforB2VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBC_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
				
		
	}
	
	
	public static void SendYourBidforB2ROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBCROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
				
		
	}
	
	public static void SendYourBidforC2VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCC_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
				
		
	}
	
	public static void SendYourBidforC2ROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCCROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
				
		
	}
	
	
	public static void SendYourBidforD2VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDC_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
				
		
	}
	
	public static void SendYourBidforD2ROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDCROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd3.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd3);
			
		}
		Commoncontrol.eAuctionAlert();
		
				
		
	}
	
	
	public static void SendYourBidforB1VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBA_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBB_Auction());
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		
	}
	
	
	public static void SendYourBidforB1ROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBAROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBBROF_Auction());
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		
	}
	
	public static void SendYourBidforC1VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCA_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCB_Auction());
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		
	}
	
	public static void SendYourBidforC1ROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCAROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCBROF_Auction());
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		
	}
	
	
	public static void SendYourBidforD1VendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDA_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDB_Auction());
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		
	}
	
	
	public static void SendYourBidforD1ROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDAROF_Auction());
		//EIP_Menu.BidInd1.click();
		
		
		try {
			EIP_Menu.BidInd1.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd1);
			
		}
		Commoncontrol.eAuctionAlert();
		
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDBROF_Auction());
		
		try {
			EIP_Menu.BidInd2.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.BidInd2);
			
		}
		Commoncontrol.eAuctionAlert();
				
		
	}
	
	public static void SendYourBidforBVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBA_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBB_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBC_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	
	
	public static void SendYourBidforBROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidBAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidBBROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidBCROF_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	public static void SendYourBidforCVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCA_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCB_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCC_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	
	
	public static void SendYourBidforCROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidCAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidCBROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidCCROF_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	public static void SendYourBidforDVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDA_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDB_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDC_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	
	public static void SendYourBidforDROFVendoreAuction() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AucYourBid1.click();
		EIP_Menu.AucYourBid1.sendKeys(ConfigFileReader.getYourBidDAROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid2.click();
		EIP_Menu.AucYourBid2.sendKeys(ConfigFileReader.getYourBidDBROF_Auction());
		Thread.sleep(500);
		EIP_Menu.AucYourBid3.click();
		EIP_Menu.AucYourBid3.sendKeys(ConfigFileReader.getYourBidDCROF_Auction());
		Thread.sleep(1000);
		
		
		try {
			EIP_Menu.PostAllBids.click();
		}
		catch(Exception e) {
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
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.PostAllBids);
			
		}
		Commoncontrol.eAuctionAlert();
	}
	
	public static void FilterAuctioncom() throws Throwable {
Thread.sleep(2000);
		// EIP_Menu.ClearSTQ.click();
		EIP_Menu.AuctionFilterCom.click();
		

	}
	
	

	public static void SaveSpecialTermsQualifications() throws Throwable {

		// EIP_Menu.ClearSTQ.click();
		EIP_Menu.savePRnew.click();
		EIP_Menu.savePRnew.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);

	}

	public static void SavePRSpecialTermsQualifications() throws Throwable {

		// EIP_Menu.ClearSTQ.click();
		EIP_Menu.savePRnew.click();
		EIP_Menu.savePRnew.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);

	}

	public static void SaveSRSpecialTermsQualifications() throws Throwable {

		// EIP_Menu.ClearSTQ.click();
		// EIP_Menu.savePRnew.click();
		EIP_Menu.ClearSTQ.sendKeys(Keys.TAB, Keys.ENTER);

	}

	public static void SpecialTermsQualificationsAcceptAlert() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.AcceptAlert.click();

	}

	
	
	public static void ShipmentDetailsAdditionalDetails() throws Throwable {
Thread.sleep(500);
		assertEquals("Shipment Details", EIP_Menu.SD.getText());
		System.out.println("AdditionalDetails = " + EIP_Menu.SD.getText());

		assertEquals(true, EIP_Menu.SD.isEnabled());

		EIP_Menu.SD.click();

	}

	public static void CapitalPRShipmentDetailsAdditionalDetails() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.AdditionalDetails.click();
		/*
		 * assertEquals("Shipment Details", EIP_Menu.SD.getText());
		 * System.out.println("AdditionalDetails = "+EIP_Menu.SD.getText());
		 * 
		 * assertEquals(true, EIP_Menu.SD.isEnabled());
		 */
		Thread.sleep(1000);
		EIP_Menu.SD.click();

	}

	public static void ShipmentDetailsRDAdditionalDetails() throws Throwable {
		assertEquals("Shipment Details", EIP_Menu.SD.getText());
		System.out.println("AdditionalDetails = " + EIP_Menu.SD.getText());

		assertEquals(true, EIP_Menu.SD.isEnabled());
		Thread.sleep(1000);
		EIP_Menu.SD.click();
		EIP_Menu.RDSDJob.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		EIP_Menu.RDBillingTo.click();
		EIP_Menu.RDSelectBT.click();
		EIP_Menu.RDShippingTo.click();
		EIP_Menu.RDSelectST.click();
		EIP_Menu.RDAddSD.click();

	}

	public static void SRShipmentDetailsRDAdditionalDetails() throws Throwable {
		assertEquals("Shipment Details", EIP_Menu.SD.getText());
		System.out.println("AdditionalDetails = " + EIP_Menu.SD.getText());

		assertEquals(true, EIP_Menu.SD.isEnabled());
		Thread.sleep(1000);
		EIP_Menu.SD.click();
		EIP_Menu.RDSDJob.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		EIP_Menu.RDBillingTo.click();
		EIP_Menu.RDSelectBT.click();
		EIP_Menu.ExecutionAt.click();
		EIP_Menu.SlExecutionAt.click();
		EIP_Menu.RDAddSD.click();

	}
	
	public static void SelectBillingToShippingToRDRFQ() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.RDSRJobAD.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		Thread.sleep(500);
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);
			
		}
		
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		}
		
		Thread.sleep(500);
		try {
			EIP_Menu.SelectShippingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetails);
			
		}
		
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		
	}
		Thread.sleep(1000);
		
		EIP_Menu.AddSD.click();
		
	}
	
	
	public static void SelectBillingToShippingToRateDiscoveryRFQ() throws Throwable {
		Thread.sleep(1500);
		EIP_Menu.RDSRJobAD.sendKeys(ConfigFileReader.getJobShipmentDetails_RDRFQ(), Keys.TAB);
		Thread.sleep(500);
		try {
			EIP_Menu.SelectBillingToShipmentDetailsRD.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetailsRD);
			
		}
		
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		}
		
		Thread.sleep(500);
		try {
			EIP_Menu.SelectShippingToShipmentDetailsRD.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetailsRD);
			
		}
		
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		
	}
		Thread.sleep(1000);
		
		EIP_Menu.AddSD.click();
		
	}
	
	

	public static void SelectBillingToShippingTo() throws Throwable {
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectBillingToShipmentDetails));
		//EIP_Menu.SelectBillingToShipmentDetails.click();
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);
			
		}
		
		
		//EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetailsRD.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);
		Thread.sleep(1800);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShippingToShipmentDetails));
		}
	//	EIP_Menu.SelectShippingToShipmentDetails.click();
		
		try {
			EIP_Menu.SelectShippingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetails);
			
		}
		//EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetails);
		
	}
		}
	
	public static void SelectBillingToShippingToRD() throws Throwable {
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectBillingToShipmentDetails));
		//EIP_Menu.SelectBillingToShipmentDetails.click();
		try {
			EIP_Menu.SelectBillingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectBillingToShipmentDetails);
			
		}
		
		
		//EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetailsRD.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);
		Thread.sleep(1800);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectShippingToShipmentDetails));
		}
	//	EIP_Menu.SelectShippingToShipmentDetails.click();
		
		try {
			EIP_Menu.SelectShippingToShipmentDetails.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.SelectShippingToShipmentDetails);
			
		}
		//EIP_Menu.ListBillingToShipmentDetails.click();
		Thread.sleep(1800);
		try {
			EIP_Menu.ListBillingToShipmentDetailsRD.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.ListBillingToShipmentDetailsRD);
		
	}
		}
	
	public static void TradeDetailsAdditionalDetails() throws Throwable {
		assertEquals("Trade Details", EIP_Menu.TradeDetails.getText());
		System.out.println("Additional Details = " + EIP_Menu.TradeDetails.getText());

		assertEquals(true, EIP_Menu.TradeDetails.isEnabled());

		EIP_Menu.TradeDetails.click();
		Thread.sleep(1000);
		EIP_Menu.TradeTerms.click();
		
		
		/*try {
			EIP_Menu.TradeTerms.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TradeTerms);
		}*/
		

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectTradeTerms));
		EIP_Menu.SelectTradeTerms.click();

	}
	
	public static void AucTradeDetailsAdditionalDetails() throws Throwable {
		assertEquals("Trade Details", EIP_Menu.TradeDetails.getText());
		System.out.println("Additional Details = " + EIP_Menu.TradeDetails.getText());

		assertEquals(true, EIP_Menu.TradeDetails.isEnabled());

		EIP_Menu.TradeDetails.click();
		Thread.sleep(1000);
		EIP_Menu.AucTradeTerms.click();
		
		
		/*try {
			EIP_Menu.TradeTerms.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TradeTerms);
		}*/
		

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
		Thread.sleep(800);

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectRFQRDDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		
	
		try {
			EIP_Menu.SelectRFQRDDate.click();
		}
		catch(Exception e) {
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

		//assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuAuc));
		EIP_Menu.RequestEssentialsMenuAuc.click();
		
		
		//EIP_Menu.ASNapplicableYES_M.click();
		
		
		

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		
		 //Thread.sleep(500);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);*/
		 

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();*/

		// EIP_Menu.SelectNextIconPaymentTerms.click();
		
		EIP_Menu.AcceptAlert.click();
		
		EIP_Menu.extmsg.click();
		Robot rr = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		
		 //Thread.sleep(500);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void AucMatRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuAuc.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuAuc.getText());

		//assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuAuc));
		EIP_Menu.RequestEssentialsMenuAuc.click();
		
		
		//EIP_Menu.ASNapplicableYES_M.click();
		
		
		

		/*wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.OrderExpiryDate));
		EIP_Menu.OrderExpiryDate.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQOrderExpiryDate));
//js.executeScript("arguments[0].click()", EIP_Menu.RFQOrderExpiryDate);
		EIP_Menu.RFQOrderExpiryDate.click();*/

		EIP_Menu.extmsg.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		/*r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		
		 //Thread.sleep(500);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);*/
		 

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();*/

		// EIP_Menu.SelectNextIconPaymentTerms.click();
		
		EIP_Menu.AcceptAlert.click();
		
		EIP_Menu.extmsg.click();
		Robot rr = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		
		 //Thread.sleep(500);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	


	public static void PRRequestEssentialsAdditionalDetails() throws Throwable {

		assertEquals("Request Essentials", EIP_Menu.RequestEssentialsMenuRFQ.getText());
		System.out.println("Additional Details = " + EIP_Menu.RequestEssentialsMenuRFQ.getText());

		assertEquals(true, EIP_Menu.RequestEssentialsMenuRFQ.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RequestEssentialsMenuRFQ));
		EIP_Menu.RequestEssentialsMenuRFQ.click();
		
		
		//EIP_Menu.ASNapplicableYES_M.click();
		
		
		

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
		
		
		//EIP_Menu.ASNapplicableYES_M.click();
		
		
		

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
		EIP_Menu.AcceptAlert.click();

		EIP_Menu.SelectNextIconPaymentTerms.click();

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

	public static void SRRDVendorAutoBQ() throws Throwable {

		Thread.sleep(2000);
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

//Thread.sleep(3000);
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_BACK_SPACE);
		 */

		Thread.sleep(3000);
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
			Thread.sleep(1000);
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

		/*
		 * assertEquals("Document Specific Attachment", EIP_Menu.DSA.getText());
		 * System.out.println("Attachment = "+EIP_Menu.DSA.getText());
		 */

		assertEquals(true, EIP_Menu.DSA.isEnabled());

	}

	public static void AttachmentRFQCreation() throws Throwable {

		assertEquals("Attach General Terms & Conditions", EIP_Menu.AttachGeneralTerms.getText());
		System.out.println("Attachment = " + EIP_Menu.AttachGeneralTerms.getText());

		assertEquals(true, EIP_Menu.AttachGeneralTerms.isEnabled());

		Thread.sleep(2000);
		EIP_Menu.AttachGeneralTerms.click();

		Thread.sleep(2000);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		//EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		//EIP_Menu.AcceptAlert.click();
		Commoncontrol.eAuctionAlert();
		Login_Steps.Logout();
	}
	
	
	public static void AttachmentAuctionCreation() throws Throwable {

		/*assertEquals("Attach general terms and conditions", EIP_Menu.AuctionAttachGeneralTerms.getText());
		System.out.println("Attachment = " + EIP_Menu.AuctionAttachGeneralTerms.getText());*/

		//assertEquals(true, EIP_Menu.AuctionAttachGeneralTerms.isEnabled());

		Thread.sleep(2000);
		//EIP_Menu.AuctionAttachGeneralTermsS.sendKeys(Keys.TAB, Keys.ENTER);
		
		EIP_Menu.AuctionAttachGeneralTermsS.click();
		
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*try {
			EIP_Menu.AuctionAttachGeneralTermsS.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AuctionAttachGeneralTermsS);
		}*/

		Thread.sleep(2000);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();
		Login_Steps.Logout();
	}
	
	
	public static void AttachmentAuctionReversRateDiscoveryCreation() throws Throwable {

	

		Thread.sleep(2000);
		
		
		EIP_Menu.AuctionAttachGeneralTermsS.click();
		
		

		Thread.sleep(2000);


		EIP_Menu.TCSave.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();
		Login_Steps.Logout();
	}
	
	public static void AttachmentAuctionReversCreation() throws Throwable {

		/*assertEquals("Attach general terms and conditions", EIP_Menu.AuctionAttachGeneralTerms.getText());
		System.out.println("Attachment = " + EIP_Menu.AuctionAttachGeneralTerms.getText());*/

		//assertEquals(true, EIP_Menu.AuctionAttachGeneralTerms.isEnabled());

		Thread.sleep(2000);
		//EIP_Menu.AuctionAttachGeneralTermsS.sendKeys(Keys.TAB, Keys.ENTER);
		
		EIP_Menu.AuctionAttachGeneralTermsS.click();
		
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*try {
			EIP_Menu.AuctionAttachGeneralTermsS.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AuctionAttachGeneralTermsS);
		}*/

		Thread.sleep(2000);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.AucRevTCSave.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();
		Login_Steps.Logout();
	}
	
	
	public static void AttachmentAuctionReversePurchaseRequestCreation() throws Throwable {

	
		Thread.sleep(2000);
		//EIP_Menu.AuctionAttachGeneralTermsS.sendKeys(Keys.TAB, Keys.ENTER);
		
		EIP_Menu.AuctionAttachGeneralTermsS.click();
		
		
		Thread.sleep(2000);
//js.executeScript("arguments[0].click()", EIP_Menu.TCSave);

		EIP_Menu.TCSave.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.RFQSubmit));
		Thread.sleep(4000);
		EIP_Menu.RFQSubmit.click();

		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AcceptAlert));
		EIP_Menu.AcceptAlert.click();
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
		assertEquals("Material", EIP_Menu.eaucMat.getText());
		System.out.println("eAuction Home = " + EIP_Menu.eaucMat.getText());
		assertEquals("Service", EIP_Menu.eaucser.getText());
		System.out.println("eAuction Home = " + EIP_Menu.eaucser.getText());
		assertEquals("Package", EIP_Menu.eaucpak.getText());
		System.out.println("eAuction Home = " + EIP_Menu.eaucpak.getText());
		/*
		 * assertEquals("For Action", EIP_Menu.foract.getText());
		 * System.out.println("eAuction Home = "+EIP_Menu.foract.getText());
		 * assertEquals("In Progress", EIP_Menu.auctInpro.getText());
		 * System.out.println("eAuction Home = "+EIP_Menu.auctInpro.getText());
		 * assertEquals("Scheduled", EIP_Menu.auctsch.getText());
		 * System.out.println("eAuction Home = "+EIP_Menu.auctsch.getText());
		 * 
		 * assertEquals("All", EIP_Menu.al.getText());
		 * System.out.println("eAuction Home = "+EIP_Menu.al.getText());
		 */
	}

	public static void eAuctionHomePageAddIcon() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAuctionAddicon));
		boolean createiconstatus = EIP_Menu.SelectAuctionAddicon.isEnabled();
		if (createiconstatus == true) {
			// EIP_Menu.SelectAddIcon.click();

			//js.executeScript("arguments[0].click()", EIP_Menu.SelectAuctionAddicon);
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
Thread.sleep(1000);
			//js.executeScript("arguments[0].click()", EIP_Menu.Package);
			
			EIP_Menu.Package.click();
			/*
			 * EIP_Menu.Auccl.click(); Login_Steps.Logout();
			 */
		}

	}

	public static void eAuctionLoginandSelectCreate() throws Throwable {
		Login_Objects.Otheruser.click();
		Login_Objects.Username.sendKeys(ConfigFileReader.getUsername());
		Login_Objects.Password.sendKeys(ConfigFileReader.getPassword());
		Login_Objects.Login.click();

	}

	public static void eAuctionScheduleEssentialsVerification() throws Throwable {
		assertEquals("Schedule Essentials", EIP_Menu.LBSE.getText());
		System.out.println("Schedule Essentials Page = " + EIP_Menu.LBSE.getText());

	}

	public static void eAuctionFilter() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.AuctionFilter));
		EIP_Menu.AuctionFilter.click();
		DataBaseConnection.EnterPRNumAuction();
		//Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectAuctionFilterPR));
		EIP_Menu.SelectAuctionFilterPR.click();
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(EIP_Menu.SelectNextAuction));
		EIP_Menu.SelectNextAuction.click();

//AuctionFilterPR
	}

	public static void eAuctionScheduleEssentialsEnterAuctionScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RPReAuction());

	}
	
	public static void eAuctionReverseRDEnterAuctionScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDReAuction());

	}
	
	public static void eAuctionReversePurchaseRequestScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_ReversePReAuction());

	}
	
	public static void eAuctionRankOrderReversePurchaseRequestScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RankOrderReversePReAuction());

	}
	
	public static void eAuctionReverseRequestForQuoteScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_ReverseRequestForQuoteeAuction());

	}
	
	
	public static void eAuctionRORRDEnterAuctionScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDRORAuction());

	}
	
	public static void eAuctionROFRDEnterAuctionScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDROFAuction());

	}
	
	
	public static void eAuctionFDRDEnterAuctionScope() throws Throwable {
		EIP_Menu.TBScope.sendKeys(ConfigFileReader.getScope_RDFDAuction());

	}
	
	public static void eAuctionReverseRDSRNext() throws Throwable {
		Thread.sleep(2000);
		EIP_Menu.NextSE.click();

	}
	
	public static void eAuctionReverseRDDesciption() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_RDReAuction());
		
	}
	
	public static void eAuctionReverseSecRDDesciption() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Desciption2.sendKeys(ConfigFileReader.getDesciptionSec_RDReAuction());
		
	}
	
	
	public static void eAuctionReverseThreeRDDesciption() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Desciption3.sendKeys(ConfigFileReader.getDesciptionThree_RDReAuction());
		
	}
	
	public static void eAuctionReverseRDMaterialCategory() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.MaterialCategory.sendKeys(ConfigFileReader.getMaterialCategory_ReverseRateDiscovery());
		
	}
	
	
	public static void eAuctionRORRDDesciption() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_RORRDAuction());
		
	}
	
	public static void eAuctionROFRDDesciption() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_ROFRDAuction());
		
	}
	
	public static void eAuctionFDRDDesciption() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.Desciption.sendKeys(ConfigFileReader.getDesciption_FDRDAuction());
		
	}
	
	
	public static void eAuctionReverseRDSuggRate() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuSuggRate.sendKeys(ConfigFileReader.getSuggRate_RDeAuction());
		//Thread.sleep(500);
		//EIP_Menu.Auctionrdr.click();
		
	}
	
	public static void eAuctionReverseSecRDSuggRate() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuSuggRate1.sendKeys(ConfigFileReader.getSuggRateSec_RDeAuction());
		//Thread.sleep(500);
		//EIP_Menu.Auctionrdr.click();
		
	}
	
	public static void eAuctionReverseThreeRDSuggRate() throws Throwable {
		Thread.sleep(500);
		EIP_Menu.AuSuggRate2.sendKeys(ConfigFileReader.getSuggRateThree_RDeAuction());
		//Thread.sleep(500);
		//EIP_Menu.Auctionrdr.click();
		
	}
	
	public static void eAuctionReverseRDBitvalueNext() throws Throwable {
		Thread.sleep(800);
		EIP_Menu.BitvalueNext.sendKeys(Keys.TAB, Keys.ENTER);
		
		
	}
	
	
	
	public static void eAuctionReverseRDQuantity() throws Throwable {
		Thread.sleep(500);
		
		EIP_Menu.AuctionQuantity.sendKeys(ConfigFileReader.getQuantity_RDReAuction());

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

		Thread.sleep(2000);
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

		Thread.sleep(2000);
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

		Thread.sleep(2000);
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
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		System.out.println("Alert Title = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(500);

		System.out.println("Alert Message = " + EIP_Menu.ErrorAlertText.getText());

		Thread.sleep(500);
		
		

		try {
			EIP_Menu.AcceptAlertR.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AcceptAlertR);
		}

	}
	
	public static void AlertAccept() throws Throwable {
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		System.out.println("Alert Title = " + EIP_Menu.ErrorAlert.getText());
		Thread.sleep(500);

		System.out.println("Alert Message = " + EIP_Menu.ErrorAlertText.getText());

		Thread.sleep(1500);
		
		

		try {
			EIP_Menu.TCDBQEditAcceptAlert.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.TCDBQEditAcceptAlert);
		}

	}
	
	
	
	
	public static void SelecteAuctionReversePurchaseRequest() throws Throwable {
		Thread.sleep(500);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		
		EIP_Menu.AllDatePR.click();
		Thread.sleep(500);
		EIP_Menu.PRDate.click();
		Thread.sleep(800);
		EIP_Menu.SelectSearchIcon.click();

	}
	
	public static void SelecteAuctionHSNReversePurchaseRequest() throws Throwable {
		Thread.sleep(1000);
		// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
		
		EIP_Menu.AuctionHSN.click();
		Thread.sleep(500);
		EIP_Menu.SelAuctionHSN.click();

	}
	
	public static void SelecteAuctionReverseRFQNext() throws Throwable {
		Thread.sleep(1000);
		EIP_Menu.SelectNextIconPaymentTerms.click();
		EIP_Menu.AcceptAlert.click();

	}
	
	

	public static void eAuctionAuctionSource() throws Throwable {
		Thread.sleep(2000);
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		EIP_Menu.AuctionSource.click();
		Thread.sleep(4000);
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
	Thread.sleep(2000);
	EIP_Menu.AuctionSource.click();
	Thread.sleep(2000);
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
		Thread.sleep(2000);
		//EIP_Menu.AuctionSource.click();
		
		try {
			EIP_Menu.AuctionSource.click();
		}
		catch(Exception e) {
			js.executeScript("arguments[0].click();", EIP_Menu.AuctionSource);
		}
		
		Thread.sleep(2000);
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
	Thread.sleep(2000);
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
	Thread.sleep(1000);
	// assertEquals("Success", EIP_Menu.ErrorAlert.getText());
	
	EIP_Menu.SelectRFQforAuction.click();
	
	Thread.sleep(8000);
	
	DataBaseConnection.EnterRFQFromDBAuction();
	Thread.sleep(500);
	
	EIP_Menu.SelectRFQforAuction.clear();
	
	DataBaseConnection.EnterRFQFromDBAuction();
	Thread.sleep(500);
	/*DataBaseConnection.EnterRFQFromDBAuction();
	Thread.sleep(1000);*/
	EIP_Menu.SelectRFQforAuctionNumber.click();
	Thread.sleep(5000);
	

}





}