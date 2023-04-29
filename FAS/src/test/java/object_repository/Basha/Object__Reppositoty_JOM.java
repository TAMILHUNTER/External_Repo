package object_repository.Basha;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Object__Reppositoty_JOM {

public @FindBy (linkText = "Other User") static WebElement OtherUser;
public @FindBy (id="username") static WebElement Username;
public @FindBy (id="password-field") static WebElement Password;
public @FindBy (id="login-submit") static WebElement login; 
public @FindBy (xpath="//eipheader//div[3]//input") static WebElement SearchMenu;
public @FindBy (xpath="(//kendo-treeview//li)[4]") static WebElement Jobordermaster;
public @FindBy (xpath="//*[@title='Access Based Menu']") static WebElement AccessBasedMenu;
public @FindBy (xpath="//div[@id='cdk-overlay-0']/div[1]/div[1]/div[2]/span[7]/span[1]/div[1]/a[1]") static WebElement Finance;
public @FindBy (xpath="//*[@title=\'Accounts Receivable\']") static WebElement AccountsReceivable;
public @FindBy (xpath="(//*[@title='Master'])[2]") static WebElement Master;

public @FindBy  (xpath="//*[@title='Job order Master']") static WebElement JOM;

//JOM Creation 

public @FindBy (xpath="//*[@title=\'Create Job Order\']") static WebElement Addbutton;
public @FindBy (xpath="//*[@id='lstJob']") static WebElement Job;
public @FindBy (xpath="//mat-option") static WebElement Job_opt;
public @FindBy (xpath="((//mat-form-field)//div//i)[1]") static WebElement Job_dr;
public @FindBy (xpath="(//mat-option//div)[3]") static WebElement Jobcodenew;
public @FindBy (xpath="//mat-option//span//span") static List<WebElement> Jobcode1;
public @FindBy (xpath="(//mat-form-field//div//i)[2]") static WebElement Customer;
public @FindBy (xpath="//span[text()='VO01186 - VOITH PAPER TECHNOLOGY (I) LIMITED']") static WebElement Customercode;
public @FindBy (xpath="//mat-option//span//span") static List<WebElement> Customercode_DR;
public @FindBy (id="txtCustOrderNo") static WebElement Customerordernumber;
public @FindBy (xpath="(//*[@title='Toggle calendar'])[1]") static WebElement Datepicker;
public @FindBy (xpath="(//kendo-dateinput//span//input)[1]") static WebElement Datepickerenter;
public @FindBy (xpath = "//*[text()=' TODAY ']") static WebElement today;
public @FindBy (xpath= "(//div[@class='mat-form-field-infix']//i)[3]") static WebElement Invoicetype;

public @FindBy (id="mat-input-2") static WebElement Ordervalue;
public @FindBy (xpath = "(//mat-form-field//div//i)[4]") static  WebElement Currency;
public @FindBy (xpath = "//mat-option//span//span") static  List<WebElement> Currency1;
public @FindBy (xpath = "(//mat-form-field//div//i)[5]") static  WebElement Pricing;
public @FindBy (xpath = "//mat-option//span//span") static List<WebElement> Pricing1;
public @FindBy (xpath = "(//mat-button-toggle-group//button)[1]") static WebElement Stage_for_Job;
public @FindBy (xpath = "(//kendo-numerictextbox//span//input)[2]") static WebElement Stage_percentage1;
public @FindBy (xpath ="(//kendo-grid-list)[9]//tbody//td[3]/input") static WebElement Remarks;
public @FindBy (xpath = "(//i[@title='Save'])[7]") static WebElement Save;
public @FindBy (xpath = "(//i[@title='Add'])[8]") static WebElement Add;
public @FindBy (xpath = "(//kendo-numerictextbox//span//input)[2]") static WebElement Stage_percentage2;
public @FindBy (xpath = "(//kendo-grid-list)[9]//tbody//tr//td[3]//input") static WebElement Remarks1;
public @FindBy (xpath = "(//i[@title='Save'])[7]") static WebElement Save1;

public @FindBy (xpath = "(//*[@type='submit'])[3]") static WebElement Okbutton;
public @FindBy (xpath = "(//kendo-grid-toolbar//div//i)[6]") static WebElement Add_icon;
public @FindBy (xpath  = "(//kendo-combobox/span)[2]/span")static WebElement Consignee_name;
public @FindBy (xpath = "(//kendo-combobox/span/kendo-searchbar/input)[2]") static WebElement Consignee_name1;
public @FindBy (xpath = "//i[@title=\"Save\"][1]") static WebElement Save2;
public @FindBy (xpath = "(//i[@title=\"Add\"])[2]") static WebElement Add1;
public @FindBy (xpath = "(//span[@class='k-select'])[3]") static WebElement Group_tag;
public @FindBy (xpath = "(//kendo-grid-list)[3]//tbody//tr//td[2]//input") static WebElement Group_code;
public @FindBy (xpath = "(//kendo-grid-list)[3]//tbody//tr//td[3]//input") static WebElement Group_description;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save3;
public @FindBy (xpath = "(//i[@title='Add'])[1]") static WebElement Add2;
public @FindBy (xpath = "(//kendo-grid-list)[3]//tbody//tr//td[2]//input") static WebElement Group_code1;
public @FindBy (xpath = "(//kendo-grid-list)[3]//tbody//tr//td[3]//input") static WebElement Group_description1;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save4;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[1]//input") static WebElement Percentage;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Event;


public @FindBy (xpath = "(//kendo-multiselect//div)[1]") static WebElement Required_doc;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[4]//input") static WebElement No_of_days;
public @FindBy (xpath = "//td[@ng-reflect-logical-col-index='4']//input") static WebElement Remarks2;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save5;
public @FindBy (xpath = "((//kendo-grid-list)[2]//td)[1]") static WebElement mousehover;
public @FindBy (xpath = "(//i[@title='Add'])[3]") static WebElement Add3;

public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Advance_type;
public @FindBy (xpath = "(//kendo-multiselect//div)[1]") static WebElement Required_doc4;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[3]//input") static WebElement No_of_Installments;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[4]//input") static WebElement Advance_percentage;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[4]") static WebElement Event2;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[7]//input") static WebElement No_of_Credit_days;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save7;

public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr//td[5]//input") static WebElement Advance_amount;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Recovery_type;
public @FindBy (xpath = "(//kendo-grid-list)[6]//tbody//tr/td[2]//input") static WebElement Recovery_percentage;
public @FindBy (xpath = "(//kendo-grid-list)[6]//tbody//tr/td[4]//input") static WebElement Strating_invoice_no;
public @FindBy (xpath = "(//kendo-dateinput)[2]//span") static WebElement Date_send;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save13;
public @FindBy (xpath="(//*[@title='Toggle calendar' or class='k-select'])[2]") static WebElement Datepicker3;
public @FindBy (xpath = "( //kendo-dateinput//span)[2]") static WebElement mousehover37;
public @FindBy (xpath = "//*[text()=' TODAY ']") static WebElement today3;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Type;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[2]//input") static WebElement Percentage3;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[4]//input") static WebElement Strating_invoice_no1;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save9;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr//td//i[3]") static WebElement Add5;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Type1;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[2]//input") static WebElement Percentage4;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[4]//input") static WebElement Strating_invoice_no2;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save10;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Activity;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[3]//input") static WebElement No_of_days2;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[4]//input") static WebElement Remarks4;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save11;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td//i[3]") static WebElement Add6;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Activity1;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[3]//input") static WebElement No_of_days3;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[4]//input") static WebElement Remarks5;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save12;
public @FindBy (xpath ="//input[@id='BtnGO'][1]") static WebElement Save_draft;

//Edit page


public @FindBy (xpath = "(//kendo-grid-toolbar//div)[7]//i") static WebElement Filter;
public @FindBy (xpath = "(//kendo-grid-filter-wrapper-cell//input)[1]") static WebElement JON;
public @FindBy (xpath = "(//kendo-grid-list//tbody//tr)[1]") static WebElement mousehover2;
public @FindBy (xpath = "(//i[@title='Edit'])[1]") static WebElement Edit;
public @FindBy (xpath = "(//mat-form-field[1]//div//input)[1]") static WebElement Customerordernumber1;
public @FindBy (xpath="//span[@class='k-dateinput-wrap']//input[1]") static WebElement Datepickerenter1;
public @FindBy (xpath="(//*[@title='Toggle calendar'])[1]") static WebElement Datepicker1;
public @FindBy (xpath = "//*[text()=' TODAY ']") static WebElement today1;
public @FindBy (xpath = "(//mat-form-field//div)[11]//input") static WebElement Ordervalue1;
public @FindBy (xpath = "(//span[@title='clear'])[3]") static WebElement Clear;
public @FindBy (xpath = "(//mat-form-field//div//i)[2]") static  WebElement Pricing2;
public @FindBy (xpath = "//mat-option//span//span") static List<WebElement> Pricing3;
public @FindBy (xpath = "(//mat-button-toggle-group//button)[1]") static WebElement Stage_for_Job1;
public @FindBy (xpath = "(//kendo-grid-list//tbody//tr)[23]") static WebElement mousehover3;
//public @FindBy (xpath = "(//i[@title='Delete'])[14]") static WebElement Delete;
public @FindBy (xpath = "(//i[@title='Edit'])[19]") static WebElement Edit1;
public @FindBy (xpath = "(//kendo-numerictextbox//span//input)[2]") static WebElement Stage_percentage3;
public @FindBy (xpath ="(//kendo-grid-list)[9]//tbody//td[3]/input") static WebElement Remarks6;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[23]//i[2]") static WebElement Save14;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[24]") static WebElement mousehover4;
public @FindBy (xpath = "(//i[@title='Edit'])[20]") static WebElement Edit2;
//public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[22]//i[3]") static WebElement Add7;
public @FindBy (xpath = "(//kendo-numerictextbox//span//input)[2]") static WebElement Stage_percentage4;
public @FindBy (xpath = "(//kendo-grid-list)[9]//tbody//tr//td[3]//input") static WebElement Remarks7;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[24]//i[2]") static WebElement Save15;
public @FindBy (xpath = "//app-joc-stagedetails/div[3]/div/input") static WebElement Okbutton1;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[11]") static WebElement mousehover5;
public @FindBy (xpath = "(//i[@title='Edit'])[11]") static WebElement Edit3;
public @FindBy (xpath  = "(//kendo-combobox/span)[2]/span")static WebElement Consignee_name2;
public @FindBy (xpath = "(//kendo-combobox/span/kendo-searchbar/input)[2]") static WebElement Consignee_name3;
public @FindBy (xpath = "//i[@title='Save'][1]") static WebElement Save16;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[12]") static WebElement mousehover6;
public @FindBy (xpath = "(//i[@title='Edit'])[12]") static WebElement Edit4;
public @FindBy (xpath = "(//kendo-grid-list)[3]//tbody//tr//td[3]//input") static WebElement Group_description2;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save17;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[13]") static WebElement mousehover7;
public @FindBy (xpath = "(//i[@title='Edit'])[13]") static WebElement Edit5;
public @FindBy (xpath = "(//kendo-grid-list)[3]//tbody//tr//td[3]//input") static WebElement Group_description3;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save18;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[14]") static WebElement mousehover8;
public @FindBy (xpath = "(//i[@title='Edit'])[14]") static WebElement Edit6;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[1]//input") static WebElement Percentage5;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[20]") static WebElement Event4;
public @FindBy (xpath = "(//kendo-multiselect//div)[1]") static WebElement Required_doc8;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[4]//input") static WebElement No_of_days4;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[5]//input") static WebElement Remarks8;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save19;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[6]") static WebElement mousehover9;
public @FindBy (xpath = "(//i[@title='Edit'])[6]") static WebElement Edit7;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[1]//input") static WebElement Percentage6;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[20]") static WebElement Event5;
public @FindBy (xpath = "(//kendo-multiselect//div)[1]") static WebElement Required_doc10;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[4]//input") static WebElement No_of_days5;
public @FindBy (xpath = "(//kendo-grid-list)[4]//tbody//tr//td[5]//input") static WebElement Remarks9;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save20;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[15]") static WebElement mousehover10;
public @FindBy (xpath = "(//i[@title='Edit'])[15]") static WebElement Edit8;

public @FindBy (xpath = "(//kendo-multiselect//div)[1]") static WebElement Required_doc13;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[3]//input") static WebElement No_of_Installments2;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[4]//input") static WebElement Advance_percentage2;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr//td[5]//input") static WebElement Advance_amount2;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[22]") static WebElement Event6;
public @FindBy (xpath = "//td[@ng-reflect-col-index='6']//input[1]") static WebElement No_of_Credit_days2;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save21;
public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[8]") static WebElement mousehover11;
public @FindBy (xpath = "(//i[@title='Edit'])[8]") static WebElement Edit9;
public @FindBy (xpath = "(//kendo-multiselect//div)[1]") static WebElement Required_doc15;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[3]//input") static WebElement No_of_Installments3;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[4]//input") static WebElement Advance_percentage3;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr//td[5]//input") static WebElement Advance_amount3;
public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[22]") static WebElement Event7;
public @FindBy (xpath = "(//kendo-grid-list)[5]//tbody//tr/td[7]//input") static WebElement No_of_Credit_days3;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save22;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[16]") static WebElement mousehover12;
public @FindBy (xpath = "(//i[@title='Edit'])[16]") static WebElement Edit10;

public @FindBy (xpath = "(//kendo-grid-list)[6]//tbody//tr/td[2]//input") static WebElement Recovery_percentage1;
public @FindBy (xpath = "(//kendo-grid-list)[6]//tbody//tr/td[4]//input") static WebElement Strating_invoice_no3;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save23;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[17]") static WebElement mousehover13;
public @FindBy (xpath = "(//i[@title='Edit'])[17]") static WebElement Edit11;

public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[2]//input") static WebElement Percentage7;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[4]//input") static WebElement Strating_invoice_no4;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save24;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[11]") static WebElement mousehover14;
public @FindBy (xpath = "(//i[@title='Edit'])[11]") static WebElement Edit12;

public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[2]//input") static WebElement Percentage8;
public @FindBy (xpath = "(//kendo-grid-list)[7]//tbody//tr/td[4]//input") static WebElement Strating_invoice_no5;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save25;


public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[22]") static WebElement mousehover15;
public @FindBy (xpath = "(//i[@title='Edit'])[18]") static WebElement Edit13;

public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[3]//input") static WebElement No_of_days6;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[4]//input") static WebElement Remarks10;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save26;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[17]") static WebElement mousehover16;
public @FindBy (xpath = "(//i[@title='Edit'])[13]") static WebElement Edit14;

public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[3]//input") static WebElement No_of_days7;
public @FindBy (xpath = "(//kendo-grid-list)[8]//tbody//tr//td[4]//input") static WebElement Remarks11;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save27;

public @FindBy (xpath = "(//mat-dialog-container//div//input)[10]") static WebElement Submit_jom;


public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[1]") static WebElement mousehover17;
public @FindBy (xpath = "(//i[@title='Edit'])[1]") static WebElement Edit15;

public @FindBy (xpath = "(//kendo-grid-filter-wrapper-cell//input)[1]") static WebElement JON1;

public @FindBy (xpath = "(//mat-form-field[1]//div//input)[1]") static WebElement Customerordernumber2;
public @FindBy (xpath="(//*[@title='Toggle calendar'])[1]") static WebElement Datepicker2;
public @FindBy (xpath = "//*[text()=' TODAY ']") static WebElement today2;
public @FindBy (xpath = "(//mat-form-field//div)[11]//input") static WebElement Ordervalue2;
public @FindBy (xpath = "(//span[@title=\"clear\"])[3]") static WebElement Clear1;
public @FindBy (xpath = "(//mat-form-field//div//i)[2]") static  WebElement Pricing4;
public @FindBy (xpath = "//mat-option//span//span") static List<WebElement> Pricing5;
public @FindBy (xpath = "(//mat-button-toggle-group//button)[1]") static WebElement Stage_for_Job2;
public @FindBy (xpath = "(//kendo-grid-list//tbody//tr)[23]") static WebElement mousehover18;
//public @FindBy (xpath = "(//i[@title='Delete'])[14]") static WebElement Delete;
public @FindBy (xpath = "(//i[@title='Edit'])[18]") static WebElement Edit16;
public @FindBy (xpath = "(//kendo-numerictextbox//span//input)[2]") static WebElement Stage_percentage5;
public @FindBy (xpath ="(//kendo-grid-list)[9]//tbody//td[3]/input") static WebElement Remarks12;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save28;

public @FindBy (xpath = "(//kendo-grid-list//tbody//tr)[24]") static WebElement mousehover19;
public @FindBy (xpath = "(//i[@title='Edit'])[19]") static WebElement Edit17;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save29;
public @FindBy (xpath = "(//*[@type='submit'])[2]") static WebElement Okbutton2;


public @FindBy (xpath = "(//kendo-grid-list//tbody//tr)[11]") static WebElement mousehover20;
public @FindBy (xpath = "(//i[@title='Edit'])[11]") static WebElement Edit18;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save30;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[12]") static WebElement mousehover21;
public @FindBy (xpath = "(//i[@title='Edit'])[12]") static WebElement Edit19;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save31;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[13]") static WebElement mousehover22;
public @FindBy (xpath = "(//i[@title='Edit'])[13]") static WebElement Edit20;
public @FindBy (xpath = "(//i[@title='Save'])[1]") static WebElement Save32;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[14]") static WebElement mousehover23;
public @FindBy (xpath = "(//i[@title='Edit'])[14]") static WebElement Edit21;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[14]") static WebElement mousehover24;
public @FindBy (xpath = "(//i[@title='Edit'])[15]") static WebElement Edit22;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[16]") static WebElement mousehover25;
public @FindBy (xpath = "(//i[@title='Edit'])[16]") static WebElement Edit23;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[17]") static WebElement mousehover26;
public @FindBy (xpath = "(//i[@title='Edit'])[17]") static WebElement Edit24;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[18]") static WebElement mousehover27;
public @FindBy (xpath = "(//i[@title='Edit'])[18]") static WebElement Edit25;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[19]") static WebElement mousehover28;
public @FindBy (xpath = "(//i[@title='Edit'])[19]") static WebElement Edit26;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[20]") static WebElement mousehover29;
public @FindBy (xpath = "(//i[@title='Edit'])[20]") static WebElement Edit27;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[25]") static WebElement mousehover30;
public @FindBy (xpath = "(//i[@title='Edit'])[21]") static WebElement Edit28;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[26]") static WebElement mousehover31;
public @FindBy (xpath = "(//i[@title='Edit'])[22]") static WebElement Edit29;

//search and edit

public @FindBy (id="imgAdvanceFilter") static WebElement Search_icon;
public @FindBy (xpath = "(//mat-form-field)[1]//div//input") static WebElement Job_order_master1;
public @FindBy (id="btnSearch") static WebElement Search_button;


public @FindBy (xpath = "(//mat-form-field[1]//div//input)[5]") static WebElement Customerordernumber3;
public @FindBy (xpath = "(//mat-form-field[1]//div//input)[6]")static WebElement Ordervalue3;
public @FindBy (xpath = "(//span[@title=\"clear\"])[3]") static WebElement Clear2;
public @FindBy (xpath = "(//*[@type='submit'])[4]") static WebElement Okbutton3;


public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Event8;

//public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[6]") static WebElement mousehover9;
public @FindBy (xpath = "(//i[@title='Edit'])[6]") static WebElement Edit30;

public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[2]") static WebElement Event9;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[16]") static WebElement mousehover32;
public @FindBy (xpath = "(//i[@title='Edit'])[16]") static WebElement Edit31;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[17]") static WebElement mousehover33;
public @FindBy (xpath = "(//i[@title='Edit'])[17]") static WebElement Edit32;

public @FindBy (xpath = "(//kendo-dropdownlist/span/span)[4]") static WebElement Event10;

public @FindBy (xpath = "(//i[@title='Add'])[2]") static WebElement Add8;

public @FindBy (xpath = "(//kendo-grid//div//tbody//tr)[14]//i[3]") static WebElement Add9;

public @FindBy (id="BtnGO") static WebElement Update;

public @FindBy (xpath = "(//mat-dialog-container//div//button") static WebElement Okbutton4;

public @FindBy (xpath = "//li[@index='0']") static WebElement Main_group_tag;
public @FindBy (xpath = "//li[@index='1']") static WebElement Sub_group_tag;


public @FindBy (xpath = "//li[@index='0']") static WebElement Advance_Invoice;
public @FindBy (xpath = "//li[@index='1']") static WebElement Invoice_Certification;
public @FindBy (xpath = "//li[@index='2']") static WebElement Invoice_claim;
public @FindBy (xpath = "//li[@index='3']") static WebElement On_Submission_of_bill;
public @FindBy (xpath = "//li[@index='4']") static WebElement On_Supply_of_material;

public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Invoices_List;
public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Required_doc_list;
public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Advance_type_list;
public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Recovery_type_List;
public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Type_List;
public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Activity_List;
public @FindBy (xpath = "//mat-option//span//span") static List <WebElement> Invoicetypename_List;
public @FindBy (xpath = "//mat-option//span//span") static List <WebElement> Jobcodelist;
public @FindBy (xpath = "//mat-option//span//span") static List <WebElement> Currecnylist;
public @FindBy (xpath = "//mat-option//span//span") static List <WebElement> Pricinglist;
public @FindBy (xpath = "//ul[@role='listbox']//li") static List <WebElement> Event_List;
public @FindBy (xpath="//ul[@role='listbox']//li") static List<WebElement> Consignee_list;


public @FindBy (xpath = "(//input[@role='spinbutton'])[3]") static WebElement Date_picker_enter;
public @FindBy (xpath = "(//input[@role='spinbutton'])[4]") static WebElement Date_picker_enter1;
public @FindBy (xpath = "//span[contains(@class,'k-button k-bare')]") static WebElement datepickerclick;

public @FindBy (xpath = "//span[@class='k-link']") static List<WebElement> Year_selection;
public @FindBy (xpath = "//span[@class='k-link']") static List<WebElement> Month_list;
public @FindBy (xpath = "//span[@class='k-link']") static List<WebElement> Date_list;

public @FindBy (xpath = "//input[@value='Submit']") static WebElement Submit_edit;




//Verify the unathorized user can able to create a job order master

public @FindBy (id="username") static WebElement view_access_Username;

public @FindBy (xpath = "//td[1][@ng-reflect-logical-row-index]//span") static WebElement ViewJOM;






}
