package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SCM_Purchase_Request {
	
	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static  WebElement EnterPerchase;
	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static  WebElement GeneralConsource;
	public @FindBy(xpath = "//*[text()=' Purchase / Service ']")	static  WebElement SelectPS;
	public @FindBy(xpath = "//span[text()=' General - Consource ']") static  WebElement SelectGC;
	public @FindBy(xpath = "//*[@title='Show Advance Search']") static  WebElement AdvanceSearch;
	public @FindBy(xpath = "//*[@class='fa fa-search']") static  WebElement AdvanceSearchGC;
	public @FindBy(xpath = "//*[@placeholder='PR Number']") static  WebElement PRNumAllocation;
	public @FindBy(xpath = "//*[@id='txtDocument']") static  WebElement  DocumentNo;
	public @FindBy(xpath = "//*[text()=' Material']")	static  WebElement SelectMaterial;
	public @FindBy(xpath = "//*[contains(@id, 'ibtAddButton')]")	static  WebElement ClickCreateRequest;
	public @FindBy(xpath = "//*[contains(@id, 'jobId')]") static  WebElement EnterJob;
	public @FindBy(xpath = "//*[contains(@id, 'lstWareHouse')]") static  WebElement Warehouse;
	public @FindBy(xpath = "//*[contains(@id, 'ActxtboxPOAPurchaseGroup')]") static  WebElement PurchaseGroup;
	public @FindBy(xpath = "//*[contains(@id, 'lstplanningCategory')]") static  WebElement planningCategory;
	public @FindBy(xpath = "//*[contains(@id, 'txtRate')]") static  WebElement Remarks;
	public @FindBy(xpath = "//*[contains(@class,'fa fa-cart-plus cart-cursor-pointer')]") static  WebElement AddCart;
	public @FindBy(xpath = "//*[text()='Add To Cart']") static  WebElement AddToCart;
	public @FindBy(xpath = "//*[@Class='fa fa-shopping-cart']") static  WebElement SelectCart;
	public @FindBy(xpath = "//*[@placeholder='Search buyer name']") static  WebElement SearchBuyerName;
	public @FindBy(xpath = "//*[text()='20055918 - PRABHU U']") static  WebElement Chooseyourbuyers;
	public @FindBy(xpath = "//*[text()='Allocate']") static  WebElement SelectAllocate;
	public @FindBy(xpath = "//*[@id='multi-select-input-lstMatGroup']") static  WebElement MaterialGroup;
	public @FindBy(xpath = "//*[text()=' Select All']") static  WebElement SALLMaterialGroup;
	public @FindBy(xpath = "//*[@id='leftSearchText']") static  WebElement ChooseItems;
	public @FindBy(xpath = "//*[@class='mat-list-text']") static  WebElement Item;
	public @FindBy(xpath = "(//*[contains(@class, 'fa fa-angle-right font-weight-bold')])") static  WebElement MoveToSelectedItems;
	public @FindBy(xpath = "//button[text()='Post']") static  WebElement Post;
	public @FindBy(xpath = "//*[@id='k-grid1-r1c1']") static  WebElement CostPackage;
	public @FindBy(xpath = "(//*[@class='k-input'])[2]") static  WebElement EnterCostPackage;
	public @FindBy(xpath = "//*[@id='mat-input-14']") static  WebElement Quantity;
	public @FindBy(xpath = "//*[@id='mat-input-15']") static  WebElement SuggRate;
	public @FindBy(xpath = "//*[@id='icon-rightdateRange_Kendo']") static  WebElement DeliveryDate;
	public @FindBy(xpath = "//button[text()='Submit']") static  WebElement Submit;
	public @FindBy(xpath = "(//button[text()='Ok'])")	static  WebElement PurchasesRequestAccept;
	public @FindBy(xpath = "(//*[contains(@class, 'eip-link ng-star-inserted')])") static  WebElement PR;
	public @FindBy(xpath = "(//*[@title='Approve'])[2]")	static  WebElement Approve;
	public @FindBy(xpath = "(//*[@id='btnAdd'])[3]")	static  WebElement ApprovalSucess;
	public @FindBy(xpath = "//*[@class = 'mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") static  WebElement eSourceAllocation;
	public @FindBy(xpath = "//*[text()='Add To Cart']") static  WebElement AllocationAddToCart;
	public @FindBy(xpath = "//*[@value='Clear']") static  WebElement SearchIcon;
	public @FindBy(xpath = "//*[@class='k-icon k-i-x']") static  WebElement closeiconAllocate;
	public @FindBy(xpath = "//*[text()='1 - 1 of 1 items']")	static  WebElement Sdown;
	public @FindBy(xpath = "//*[text()=' 163234 - ARULSELVAN ']") static  WebElement ChooseyourbuyersDomesticJob;
	
	
	public @FindBy(xpath = "(//*[@id='icon-rightdateRange_Kendo'])[2]") static  WebElement PRDeliveryDate;
	public @FindBy(xpath = "//*[text()='TODAY']") static  WebElement Date;
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	 
	
	 
	
	
	
	 
	
	
	 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
