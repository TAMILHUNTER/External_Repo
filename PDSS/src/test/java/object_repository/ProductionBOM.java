package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductionBOM {
	//Create
	public @FindBy(id = "OrderNumber") static WebElement BOMCreateOrderNumber;
	public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']//li[1]") static WebElement SelectBOMCreateOrderNumber;
	public @FindBy(id = "Create") static WebElement BOMCreate;
	public @FindBy(xpath = "//span[@aria-activedescendant='ProductCode_option_selected']/span") static WebElement clickProduct;
	public @FindBy(xpath = "//ul[@id='ProductCode_listbox']/li[2]") static WebElement selectProduct;
	public @FindBy(xpath = "//a[@data-value='excelUpload']/i") static WebElement clickExcelUpload;
	public @FindBy(xpath = "//a[@data-value='copyBom']/i") static WebElement clickCopyBOM;
	public @FindBy(xpath = "//fieldset[@id='excelfieldset']/div/div/div/span") static WebElement clickBrowseFile;
	public @FindBy(xpath = "//div[@data-role='popup']/span/input") static WebElement pCode;
	public @FindBy(xpath = "//a[@class='bottom showroles']/i") static WebElement profileLogout;
	public @FindBy(xpath = "//a[@class='sClear']//img[1]") static WebElement Logout;
	
	//Create Copy BOM
	public @FindBy(id = "OrderNumberSource") static WebElement CopyBOM_Order_Number;
	public @FindBy(xpath = "//ul[@id='OrderNumberSource_listbox']/li[1]") static WebElement CopyBOM_select_Order_Number;
	public @FindBy(xpath = "//span[text()='Select the Product Code']") static WebElement CopyBOM_click_Product_Code;
	public @FindBy(xpath = "//input[@aria-owns='ProductCodeSource_listbox']") static WebElement CopyBOM_enter_Product_Code;
	public @FindBy(xpath = "//ul[@id='ProductCodeSource_listbox']/li[2]") static WebElement CopyBOM_select_Product_Code;
	public @FindBy(id = "sourceSubmit") static WebElement CopyBOM_Submit;
	public @FindBy(xpath = "(//a[contains(@class,'k-window-action k-link')])[5]") static WebElement closeErrorMessageinPM;
	public @FindBy(xpath = "//label[@id='lblwindowmsg']") static WebElement windowMsg;
	
	
	
	
	
	
	
	
	//View
		public @FindBy(id = "OrderNumber") static WebElement BOMViewOrderNumber;
		public @FindBy(xpath = "//ul[@id='OrderNumber_listbox']//li[1]") static WebElement SelectBOMViewOrderNumber;
		public @FindBy(xpath = "//span[text()='Select the Product Code']") static WebElement clickProductCodeView;
		
		public @FindBy(xpath="//span[text()='Part Details']") static WebElement ViewClickPartDetails;
		public @FindBy(xpath="//span[text()='Drawing Details']") static WebElement ViewClickDrawingDetails;
		public @FindBy(xpath="//span[text()='Finished Component']") static WebElement ViewClickFCDetails;
		public @FindBy(xpath="//span[text()='Accessories']") static WebElement ViewClickAccessoriesDetails;
		public @FindBy(xpath="//span[text()='BOM Association']") static WebElement ViewClickBOMAssoDetails;
		
		
	


}
