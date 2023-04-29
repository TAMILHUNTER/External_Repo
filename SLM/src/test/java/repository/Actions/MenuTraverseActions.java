package repository.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.Locators.MenuObjects;
import stepdefinition.Webdriver;

public class MenuTraverseActions {
	static WebDriverWait wait=new WebDriverWait(Webdriver.driver, 5000);
	
	public MenuTraverseActions() {
		PageFactory.initElements(Webdriver.driver, MenuObjects.class);
	}
	public static void mainMenu() {
		MenuObjects.moduleMenu.isEnabled();
	}
	public static  void clickMainMenu() {
		MenuObjects.moduleMenu.click();
	}
	public  static void supplychainManagement() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.supplyChainMgmt));
		MenuObjects.supplyChainMgmt.click();
		}
	public static  void Logistics() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.logistics));
		MenuObjects.logistics.click();	
	}
	public static  void Masters() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.masters));
		MenuObjects.masters.click();
	}
	public static void rateContract() {
		wait.until(ExpectedConditions.elementToBeClickable(MenuObjects.rateContract));
		MenuObjects.rateContract.click();		
	}
}
