package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PDSSMenu {
		
	public @FindBy(xpath = "(//i[contains(@class,'PDSSNavigation fa')])[2]") static WebElement PDSSMenu;
	public @FindBy(linkText = "Document") static WebElement Document;
	public @FindBy(linkText = "Planning") static WebElement Planning;
	public @FindBy(linkText = "Plate Nesting") static WebElement PlateNesting;
	public @FindBy(linkText = "General Masters") static WebElement GeneralMasters;
	public @FindBy(linkText = "Machine") static WebElement Machines;
	public @FindBy(linkText = "Costing") static WebElement Costing;
	public @FindBy(linkText = "Cosing Entry") static WebElement CostingEntry;
	public @FindBy(linkText = "Design") static WebElement Design;
	public @FindBy(linkText = "Products") static WebElement Products;
	public @FindBy(linkText = "Production BOM") static WebElement ProductionBOM;
	public @FindBy(linkText = "Intra Stock Transfer") static WebElement IntraStockTransfer;
	public @FindBy(linkText = "Outsourcing") static WebElement Outsourcing;
	public @FindBy(linkText = "Vendor Outsourcing Advice") static WebElement VOA;
	public @FindBy(linkText = "Order and Sales") static WebElement OrderSales;
	public @FindBy(xpath = "//a[@data-document-type=11102]") static WebElement OrderMaster;
	public @FindBy(id = "Create") static WebElement OrderMasterCreate;
}
