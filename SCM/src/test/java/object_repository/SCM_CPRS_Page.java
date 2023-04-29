package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SCM_CPRS_Page {
	
	public @FindBy(xpath = "//input[@placeholder='Search Menu']") static  WebElement EnterCPRS;
	public @FindBy(xpath = "//*[text()='Capital Purchase Request']") static  WebElement CPRS;
	public @FindBy(xpath = "//*[text()='Request']") static  WebElement Request;
	public @FindBy(xpath = "(//header//a)[2]") static  WebElement HomeMenu;
	public @FindBy(xpath = "//*[text()='Supply Chain Mgmt']") static  WebElement SCM;
	public @FindBy(xpath = "//*[text()=' Capital Purchase Request ']")	static  WebElement SelectCPRS;
	public @FindBy(xpath = "//*[text()=' Asset Request ']")	static  WebElement SelectAssetRequest;
	public @FindBy(xpath = "//*[@id='ibtAdd']") static  WebElement Create;
	public @FindBy(xpath = "//*[text()=' For Action ']") static  WebElement ForAuction;
	public @FindBy(xpath = "//*[text()=' Rejected ']") static  WebElement Rejet;
	public @FindBy(xpath = "//*[text()=' Approved ']") static  WebElement Approved;
	public @FindBy(xpath = "//*[text()=' All ']") static  WebElement All;
	
	public @FindBy(xpath = "//*[@id='ic']") static  WebElement EnterIC;
	public @FindBy(xpath = "//*[@id='IC']") static  WebElement EnterICAR;
	public @FindBy(xpath = "//*[@id='job']") static  WebElement Job;
	public @FindBy(xpath = "//*[@id='cprscategory']") static  WebElement Category;
	public @FindBy(xpath = "(//*[@id='actxtAssetGroup'])[2]") static  WebElement AssetGroup;
	public @FindBy(xpath = "//*[@id='bgPopupAssetAttributes-1']") static  WebElement  AssetAttributes;
	public @FindBy(xpath = "//*[@id='ActxtboxAssetMake']") static  WebElement AssetMake;
	public @FindBy(xpath = "//*[@id='ActxtboxAssetModel']") static  WebElement AssetModel;
	public @FindBy(xpath = "//*[@id='txtCapacity']") static  WebElement Capacity;
	public @FindBy(xpath = "//*[@id='btnPost']") static  WebElement PostAssetAttributes;
	public @FindBy(xpath = "(//*[@id='actxtPurchaseType'])[2]") static  WebElement PurchaseType;
	public @FindBy(xpath = "//*[@id='lblrequiredQty']") static WebElement RequiredQuantity;
	public @FindBy(xpath = "//*[text()='Add']") static WebElement  DeliverySchedule;
	public @FindBy(xpath = "(//*[@id='actxtwareHouse'])[2]") static WebElement Warehouse;
	public @FindBy(xpath = "//*[@id='warehouse']") static WebElement WarehouseAR;
	public @FindBy(xpath = "//*[@id='lblRequiredQuantity']") static WebElement RequiredQuantityDS;
	public @FindBy(xpath = "//*[@class='fa fa-floppy-o ng-star-inserted']") static WebElement SaveDS;
	public @FindBy(xpath = "//*[text()='Post']") static WebElement  PostDS;
	public @FindBy(xpath = "//*[@id='lblsuggestedRate']") static WebElement SuggestedRate;
	public @FindBy(xpath = "//*[@id='bgPopupAdditionalInformation-1']") static WebElement  AdditionalInformation;
	public @FindBy(xpath = "//*[@placeholder='Procurement Justification']") static WebElement ProcurementJustification;
	public @FindBy(xpath = "//*[text()=' Select All']") static WebElement selectProcurementJustification;
	public @FindBy(xpath = "//*[@id='ActxtboxUnitofMeasurement']") static WebElement UnitofMeasurement;
	
	public @FindBy(xpath = "//*[@id='txtdepWorkAttributes']") static WebElement DeployementWorkAttributes;
	public @FindBy(xpath = "//*[@id='txtScopeofWorkQuantity']") static WebElement ScopeofWorkQuantity;
	public @FindBy(xpath = "//*[@id='btnPost']") static WebElement PostAI;
	public @FindBy(xpath = "//*[@id='lbldepInCurrentJob']") static WebElement  DeploymentInCurrentJob; 
	public @FindBy(xpath = "//*[@id='lbldepInFutureJob']") static WebElement  DeploymentInFutureJob; 
	public @FindBy(xpath = "//*[@id='btnSubmit']") static WebElement Submit;
	public @FindBy(xpath = "//*[text()='Scope of Work ']") static WebElement  MovetoScopeofwork;
	public @FindBy(xpath = "//*[@id='txtScopeofwork']") static WebElement Scopeofwork;
	public @FindBy(xpath = "//*[@class='fa fa-save d-inline ng-star-inserted']") static WebElement SaveAuction;
	public @FindBy(xpath = "//*[@class='btn btn-primary btn-sm cursor-pointer']") static WebElement AlertAcceptCPRSCreate;
	public @FindBy(xpath = "//*[@title='Show Advance Search']") static  WebElement AdvanceSearch;
	public @FindBy(xpath = "//*[@id='txtDocument']") static WebElement DocNum;
	
	
	public @FindBy(xpath = "//*[@class = 'btn btn-primary']") static  WebElement SearchIcon;
	public @FindBy(xpath = "//*[@class = 'btn btn-primary']") static  WebElement ARSearchIcon;
	
	public @FindBy(xpath = "(//*[@title='Reject'])[2]") static  WebElement TCDReject;
	
	public @FindBy(xpath = "//*[text()='Received Date']") static  WebElement MovetoReceivedDate;
	
	public @FindBy(xpath = "//*[@placeholder='Remarks']") static  WebElement TCDRemarks;
	
	public @FindBy(xpath = "(//mat-dialog-container//input[@id='btnAdd'])[4]") static  WebElement TCDRejectAlertAccept;
	
	public @FindBy(xpath = "(//mat-dialog-container//h5)[1]") static  WebElement TCDRejectAlertText;
	
	
	
	
	
	
	
	
	
	
	public @FindBy(xpath = "//*[text()=' Page ']") static  WebElement ViewDetails;
	public @FindBy(xpath = "//*[@class='eip-link ng-star-inserted']") static  WebElement  SelectCPRSNum;
	public @FindBy(xpath = "//*[@class='eip-link ng-star-inserted']") static  WebElement SelectARNum;
	public @FindBy(xpath = "//*[text()='1 - 1 of 1 items']")	static  WebElement MoveToAPP;
	public @FindBy(xpath = "//*[@id='btnApprove']")	static  WebElement CPRSApprove;
	public @FindBy(xpath = "//*[@id='mat-input-6']")	static  WebElement Cmd;
	public @FindBy(xpath = "//*[@class='btn btn-primary eip-ml-10']")	static  WebElement SaveCmd;
	public @FindBy(xpath = "//td//i[@id='bgPopupAllocateQuantityre0']")	static  WebElement  QuantityAllocation;
	//public @FindBy(xpath = "//*[text()=' Additional']")	static  WebElement  QuantityAllocation;
	public @FindBy(xpath = "(//*[@id='txtSanctionQuantity'])[3]")	static  WebElement SanctionQuantity;
	public @FindBy(xpath = "(//*[@type='text'])[6]")	static  WebElement QntRemarks;
	public @FindBy(xpath = "//*[@id='btnSave']") static  WebElement SaveQulAll;
	public @FindBy(xpath = "//*[@class='btn btn-primary btn-sm cursor-pointer']") static WebElement AlertAcceptCPRS;
	public @FindBy(xpath = "//*[@class='fa fa-fund-allotment allocate-quantity fs-16 eip-ml-5 cursor-pointer eip-link ng-star-inserted']") static WebElement BudgetAllocation;
	public @FindBy(xpath = "//*[@id='ActxtboxSanctionReferenceNUmber']") static WebElement  SanctionReferenceNumber;
	public @FindBy(xpath = "(//mat-option)[2]") static WebElement SanctionPM;
	public @FindBy(xpath = "//*[@id='txtEstimateCostofAcquisistionPerEquipment']") static WebElement EstimationCostOfAcquisition;
	public @FindBy(xpath = "//*[@id='ibtCashOutflowQuater']") static WebElement  CashOutflowQuarter; 
	public @FindBy(xpath = "//*[@id='ibtAddRow']") static WebElement AddCashOutflowQuarter;
	public @FindBy(xpath = "//*[@id='ActxtboxCashOutflowQuater']") static WebElement EnterCashOutflowQuarter;
	public @FindBy(xpath = "//*[@id='txtCashOutflowAmount']") static WebElement EnterCashflowAmount;
	public @FindBy(xpath = "//*[@id='btnCashFlowPost']") static WebElement SelectPostCashQuarter;
	public @FindBy(xpath = "//*[@id='btnPOst']") static WebElement SelectPostBudgetAllocation;
	public @FindBy(xpath = "//*[@class='fa fa-technical-evaluator technical-allocate-quantity fs-16 eip-ml-5 cursor-pointer eip-link ng-star-inserted']") static WebElement SelectTechnicalEvaluation;
	public @FindBy(xpath = "//*[@id='bgPopupSuggestedMakeModel0']") static WebElement SuggestedMakeMode;
	public @FindBy(xpath = "(//*[@id='actxtAssetMake'])[2]") static WebElement AssetMakeSuggestedMakeMode;
	public @FindBy(xpath = "//*[@id='ActxtboxAssetModel']") static WebElement AssetModelSuggestedMakeMode;
	public @FindBy(xpath = "//*[@id='txtQuantity']") static WebElement Quantity;
	public @FindBy(xpath = "//*[@id='btnPost']") static  WebElement PostTechnicalEvaluation;
	public @FindBy(xpath = "//*[@id='btnSubmit']") static  WebElement SubmitTechnicalEvaluation;
	public @FindBy(xpath = "//*[@id='txtDecisionCriteria']") static  WebElement DecisionCriteria;
	public @FindBy(xpath = "//*[@id='ibtASRAdd']") static  WebElement AddCreate;
	public @FindBy(xpath = "//*[@id='cprs']") static  WebElement ARCPRS;
	public @FindBy(xpath = "//*[@id='btnGo']") static  WebElement Go;
	public @FindBy(xpath = "(//*[@id='glblASRCAssetGroup'])[2]") static  WebElement ARAssetGroup;
	//public @FindBy(xpath = "(//*[@class='k-input'])[2]") static  WebElement Material;
	public @FindBy(xpath = "(//*[contains(@class, 'k-input')])[3]") static  WebElement Material;
	public @FindBy(xpath = "//kendo-list//li") static List <WebElement> listOfMaterial;
	
	public @FindBy(xpath = "//*[@id='gtxtASRCARQuantity']") static  WebElement ARQuantity;
	public @FindBy(xpath = "//*[text()='Add']") static  WebElement   ARDeliverySchedule;
	public @FindBy(xpath = "//*[@id='lblComments']") static  WebElement ARRequiredQuantity;
	public @FindBy(xpath = "(//*[@class='fa fa-floppy-o ng-star-inserted'])[2]") static  WebElement ARSaveDS;
	public @FindBy(xpath = "//*[text()='Save']") static  WebElement ARRSaveDS;
	public @FindBy(xpath = "//*[@id='lblsuggestedRate']") static  WebElement ARsuggestedRate;
	public @FindBy(xpath = "//*[@id='gibtASRCSave']") static  WebElement SaveAssetRequestDetails;
	
	public @FindBy(xpath = "//*[@id='btnSubmit']") static  WebElement SubmitCreateAssetRequest;
	public @FindBy(xpath = "//*[@id='txtDocument']") static WebElement ARDocNum;
	public @FindBy(xpath = "(//*[@id='btnApprove'])[2]") static WebElement ARApprove;
	public @FindBy(xpath = "//*[@class='fa fa-search']") static  WebElement AdvanceSearchGC;
	public @FindBy(xpath = "//*[@id='PR_Number']") static  WebElement PRNumAllocationAS;
	public @FindBy(xpath = "//*[text()=' 163234 - ARULSELVAN ']") static  WebElement ARChooseyourbuyers;
	
	public @FindBy(xpath = "//mat-option/span/span") static List <WebElement> ICList;
	public @FindBy(xpath = "//mat-option/span/span") static List <WebElement> JobList;
	
	public @FindBy(xpath = "//*[@id='cprssubcategory']") static WebElement subcategory;
	
	
	
	public @FindBy(xpath = "//*[@placeholder='Search Menu']") static  WebElement SearchMenuTCD;
	public @FindBy(xpath = "//*[text()=' Techno Commercial Document ']") static  WebElement selectTCDCD;
	public @FindBy(xpath = "//*[text()=' Material ']") static  WebElement selectmaterialtcd;
	
	public @FindBy(xpath = "//*[@class='modulemenu']") static  WebElement Menu; 
	public @FindBy(xpath = "//*[text()='Asset Mgmt']") static  WebElement AssetMgmt;
	
	public @FindBy(xpath = "//*[text()='Asset Mgmt.']") static  WebElement Assettree;
	public @FindBy(xpath = "//*[text()='AMS - Document']") static  WebElement AMSDoc; 
	public @FindBy(xpath = "//*[text()='Ok']") static  WebElement AcceptAlert; 
	public @FindBy(xpath = "//*[@id='btnGo']") static  WebElement CPRSGo;
	public @FindBy(xpath = "//eipmessagebox//h1") static  WebElement AlertHead;
	public @FindBy(xpath = "//eipmessagebox//p") static  WebElement AlertMessg;
	public @FindBy(xpath = "//eipmessagebox//button") static  WebElement AlertAccept;
	

	
	
	
	

	
	 
	
	 
	
	
	
	 
	
	
	 
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
