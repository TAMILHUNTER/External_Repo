package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductMaster {
	

		

	
	
	public @FindBy(id = "Create") static WebElement ProductMasterCreate;
	public @FindBy(id = "update") static WebElement ProductMasterEdit;
	public @FindBy(name = "button") static WebElement ProductMasterEditGo;
	public @FindBy(name = "button") static WebElement ProductMasterEditUpdate;
	
	public @FindBy(linkText = "Production BOM") static WebElement ProductionBOM;
	public @FindBy(linkText = "Intra Stock Transfer") static WebElement IntraStockTransfer;
	public @FindBy(linkText = "Outsourcing") static WebElement Outsourcing;
	public @FindBy(linkText = "Vendor Outsourcing Advice") static WebElement VOA;
	public @FindBy(id = "Create") static WebElement BOMCreate;
	public @FindBy(id = "OrderNumber") static WebElement BOMCreateOrderNumber;
	public @FindBy(xpath = "//div[@id='div_Technical']/div/fieldset/legend/following::div/div/following::span/input") static WebElement ProductMasterCreateOrderNumber;
	public @FindBy(xpath = "//form[@id='Product-form']//div/div/fieldset/legend/following::input") static WebElement ProductMasterEditOrderNumber;
	
	public @FindBy(id = "ProductCode") static WebElement ProductMasterEnterProductCode;
	public @FindBy(id = "ProductDescription") static WebElement ProductMasterProductDescription;
	public @FindBy(xpath = "//span[text()='Select Parent Product']") static WebElement ProductMasterClickParentProduct;
	public @FindBy(xpath = "//ul[@id='ParentProductListID_listbox']/li[2]") static WebElement ProductMasterSelectParentProduct;
	public @FindBy(xpath = "//a[contains(@class,'k-window-action k-link')]") static WebElement CloseProductMasterCreateSuccessMessage;
	public @FindBy(xpath = "//a[contains(@class,'k-window-action k-link')]") static WebElement CloseProductMasterAPISuccessMessage;
	
	public @FindBy(id = "ReqQty") static WebElement ProductMasterCreateRequiredQuantity;
	public @FindBy(name = "button") static WebElement ProductMasterCreateSubmit;
	
	public @FindBy(xpath = "//img[@class='EditPM']") static WebElement EditIcon;
	
	
		
	public @FindBy(xpath = "(//ul[@role='listbox']//li)[1]") static WebElement ProductMasterSelectOrderNumber;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']//li[1]") static WebElement SelectBOMCreateOrderNumber;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']//li[1]") static WebElement ClickProductCode;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']//li[1]") static WebElement EnterProductCode;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']//li[1]") static WebElement SelectProductCode;
	public @FindBy(xpath = "//a[@class='bottom showroles']//i[1]") static WebElement clickProfileLogout;
	public @FindBy(xpath = "//a[@data-original-title='logOff']//following::span") static WebElement Logout;

	
	
	public @FindBy(id = "txtSourceOrderNumber") static WebElement SourceOrderNumber;
	public @FindBy(xpath = "//ul[@id='txtSourceOrderNumber_listbox']/li") static WebElement ChooseSourceOrderNumber;
	public @FindBy(id = "txtDestinationOrderNumber") static WebElement DestinationOrderNumber;
	public @FindBy(xpath = "//ul[@id='txtDestinationOrderNumber_listbox']/li") static WebElement ChooseDestinationOrderNumber;
	public @FindBy(xpath = "//span[@aria-owns='ddlSourceLotNumber_listbox']/span/span") static WebElement ClickSourceLotNumber;
	public @FindBy(xpath = "//ul[@id='ddlSourceLotNumber_listbox']/li[2]") static WebElement SelectSourceLotNumber;
	public @FindBy(xpath = "//span[@aria-owns='ddlDestinationLotNumber_listbox']/span/span") static WebElement ClickDestinationLotNumber;
	public @FindBy(xpath = "//ul[@id='ddlDestinationLotNumber_listbox']/li[2]") static WebElement SelectDestinationLotNumber;
	public @FindBy(xpath = "//span[@aria-owns='ddlSourceProductCode_listbox']/span/span") static WebElement ClickSourceProductCode;
	public @FindBy(xpath = "//ul[@id='ddlSourceProductCode_listbox']/li[2]") static WebElement SelectSourceProductCode;
	public @FindBy(xpath = "//span[@aria-owns='ddlDestinationProductCode_listbox']/span/span") static WebElement ClickDestinationProductCode;
	public @FindBy(xpath = "//ul[@id='ddlDestinationProductCode_listbox']/li[2]") static WebElement SelectDestinationProductCode;

}
