package object_repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utils.DriverFactory;

public class ObjectsReporsitory {

	// **Login Elements**

	@FindBy(how = How.LINK_TEXT, using = "Employee")
	public static WebElement Login_employee;

	@FindBy(how = How.LINK_TEXT, using = "Other User")
	public static WebElement Login_otherUser;

	@FindBy(how = How.ID, id = "username")
	public static WebElement Login_Username;

	@FindBy(how = How.ID, id = "password-field")
	public static WebElement Login_Password;

	@FindBy(how = How.ID, using = "login-submit")
	public static WebElement Login_loginSubmit;

	@FindBy(how = How.CLASS_NAME, using = "unlk-acnt")
	public static WebElement Login_unlockAccount;

	@FindBy(how = How.CLASS_NAME, using = "frgt-pwd")
	public static WebElement Login_forgotPassword;

	@FindBy(how = How.TAG_NAME, using = "h1")
	public static WebElement Login_OldSessionerror;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement Login_OldSessionok;

	@FindBy(how = How.XPATH, using = "//span[@title='close']")
	public static WebElement Login_OldSessionclose;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"home\"]/div[1]/div/div/div/p)")
	public static WebElement Landing_Page;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"home\"]/div[3]/div/section/div[3]/div/div/div[2]/h5/span[1])")
	public static WebElement Landing_Page_Counter;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"home\"]/div[3]/div/section/div[3]/div/div/div[2]/div)")
	public static WebElement Landing_Page2;

	@FindBy(how = How.XPATH, using = "(//header//i)[1]")
	public static WebElement Profile_Dropdown;

	@FindBy(how = How.XPATH, using = "(//header//a)[7]")
	public static WebElement Profile_Signout;

	// **HomePage Elements**

	@FindBy(how = How.XPATH, using = "//span[text()='Action Taken']")
	public static WebElement Home_actionTaken;

	@FindBy(how = How.XPATH, using = "(//eipheader//div[1]//div[1]//header//div[2]//div[1]//div//div[1]//div[1]//span)")
	public static WebElement Home_Loggedin_User;

	@FindBy(how = How.XPATH, using = "(//wfb-workbench-dashboard/div//mat-panel-title/div/div[2]/button/span)")
	public static WebElement Home_Action;

	@FindBy(how = How.CLASS_NAME, using = "user_name")
	public static WebElement Home_Loggedin_User_name;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'col-6 col-sm-6')]//a)[2]")
	public static WebElement Home_accessBasedMenu;

	@FindBy(how = How.XPATH, using = "//a[@title='All Menu']")
	public static WebElement Home_All_Menu;

	@FindBy(how = How.TAG_NAME, using = "input")
	public static WebElement Home_searchMenu;

	@FindBy(how = How.ID, using = "NotificationiconID")
	public static WebElement Home_notifications;

	@FindBy(how = How.ID, using = "profiledropdownbtn")
	public static WebElement Home_Profiledropdownbtn;

	@FindBy(how = How.CLASS_NAME, using = "currentdatetime")
	public static WebElement Home_Date_Time;

	// **Menu**

	@FindBy(how = How.XPATH, using = "//span[@title='Workmen Management']")
	public static WebElement Menu_workmenManagementSystem;

	@FindBy(how = How.XPATH, using = "//span[@title='WMS 4.0']")
	public static WebElement Menu_workmenManagementSystem_WMS40;

	@FindBy(how = How.XPATH, using = "//div[@class='matNavHeader']//mat-nav-list[1]")
	public static WebElement Menu_Navigation_Open;

	@FindBy(how = How.XPATH, using = "(//mat-nav-list//i)[1]")
	public static WebElement Menu_Navigation_Close;

	// **WMS Elements**

	@FindBy(how = How.XPATH, using = "//span[text()='Dashboard ']")
	public static WebElement WMS_dashboard;

	@FindBy(how = How.XPATH, using = "(//mat-nav-list//a//span//i)[2]")
	public static WebElement WMS_induction;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div/div/span[1]/span/div/a/span")
	public static WebElement WMS40;

	@FindBy(how = How.XPATH, using = "(//mat-nav-list//a//span//i)[2]")
	public static WebElement WMS_induction2;

	@FindBy(how = How.XPATH, using = "//span[text()='Gate Pass ']")
	public static WebElement WMS_gatePass;

	@FindBy(how = How.XPATH, using = "//span[text()='Configuration ']")
	public static WebElement WMS_configuration;

	@FindBy(how = How.XPATH, using = "//span[text()='Attendance ']")
	public static WebElement WMS_attendance;

	@FindBy(how = How.XPATH, using = "//span[text()='Wage ']")
	public static WebElement WMS_wage;

	@FindBy(how = How.XPATH, using = "//span[text()='Management ']")
	public static WebElement WMS_management;

	@FindBy(how = How.XPATH, using = "//span[text()='Workmen Allocation ']")
	public static WebElement WMS_workmenAllocation;

	@FindBy(how = How.XPATH, using = "//span[text()='Report ']")
	public static WebElement WMS_report;

	@FindBy(how = How.XPATH, using = "//span[text()='Notification & Manual ']")
	public static WebElement WMS_notificationManual;

	// **Induction**

	@FindBy(how = How.XPATH, using = "(//app-spinner//span)[1]")
	public static List<WebElement> Spinner;

	@FindBy(how = How.XPATH, using = "(//mat-card-subtitle[contains(@class,'mat-card-subtitle child')])[1]")
	public static WebElement Induction_Jobcode;

	@FindBy(how = How.XPATH, using = "(//mat-card-subtitle)[4]")
	public static WebElement Induction_BU;

	@FindBy(how = How.XPATH, using = "(//mat-card-subtitle)[6]")
	public static WebElement Induction_IC;

	@FindBy(how = How.XPATH, using = "(//i[@title='Edit'])[1]")
	public static WebElement Induction_Edit_job;

	@FindBy(how = How.ID, using = "jobCode")
	public static WebElement Induction_Jobcode_Dashboard;

	@FindBy(how = How.XPATH, using = "//eipautocomplete//div//i")
	public static WebElement Induction_Edit_job_dr;

	@FindBy(how = How.XPATH, using = "//button[@title='Save']")
	public static WebElement Induction_Save_Job;

	@FindBy(how = How.XPATH, using = "//mat-option//span//span")
	public static List<WebElement> Induction_Edit_job_dr_Values;

	@FindBy(how = How.XPATH, using = "//span[text()='ID Type']")
	public static WebElement Induction_iDType;

	@FindBy(how = How.XPATH, using = "//span[text()=' Basic Details']")
	public static WebElement Induction_basicDetails;

	@FindBy(how = How.XPATH, using = "//p[text()=' Skill & Deployment']")
	public static WebElement Induction_skillAnalysis;

	@FindBy(how = How.XPATH, using = "//span[text()='Paramedics']")
	public static WebElement Induction_paramedics;

	@FindBy(how = How.XPATH, using = "//span[text()=' Medical Test']")
	public static WebElement Induction_medicalTest;

	@FindBy(how = How.XPATH, using = "//span[text()='EHS']")
	public static WebElement Induction_eHS;

	@FindBy(how = How.XPATH, using = "//span[text()='Wage']")
	public static WebElement Induction_wage;

	@FindBy(how = How.XPATH, using = "//p[text()=' Final Approval ']")
	public static WebElement Induction_finalApproval;

	@FindBy(how = How.TAG_NAME, using = "button")
	public static WebElement Induction_submit;

	// **Induction**

	// **Side Menu**
	@FindBy(how = How.XPATH, using = "//p[text()=' Partner']")
	public static WebElement Induction_partner;

	@FindBy(how = How.XPATH, using = "//p[text()=' Personal']")
	public static WebElement Induction_personal;

	@FindBy(how = How.XPATH, using = "//p[text()=' Communication']")
	public static WebElement Induction_communication;

	@FindBy(how = How.XPATH, using = "//p[text()=' Skill & Deployment']")
	public static WebElement Induction_skillDeployment;

	@FindBy(how = How.XPATH, using = "//p[text()=' Education & Experience']")
	public static WebElement Induction_educationExperience;

	@FindBy(how = How.XPATH, using = "//p[text()=' Statutory Details']")
	public static WebElement Induction_statutoryDetails;

	@FindBy(how = How.XPATH, using = "//p[text()=' Bank Details']")
	public static WebElement Induction_bankDetails;

	// **Header**
	@FindBy(how = How.XPATH, using = "//p[text()='Partner']")
	public static WebElement Induction_Hearder_partner;

	@FindBy(how = How.XPATH, using = "//p[text()='Personal']")
	public static WebElement Induction_Hearder_personal;

	@FindBy(how = How.XPATH, using = "//p[text()='Communication Details']")
	public static WebElement Induction_Hearder_communicationDetails;

	@FindBy(how = How.XPATH, using = "//p[text()='Skill']")
	public static WebElement Induction_Hearder_skill;

	@FindBy(how = How.XPATH, using = "//p[text()='Deployment']")
	public static WebElement Induction_Hearder_deployment;

	@FindBy(how = How.XPATH, using = "//p[text()='Education & Training']")
	public static WebElement Induction_Hearder_educationTraining;

	@FindBy(how = How.XPATH, using = "//p[text()='Experience']")
	public static WebElement Induction_Hearder_experience;

	@FindBy(how = How.XPATH, using = "//p[text()='Statutory Details']")
	public static WebElement Induction_Hearder_statutoryDetails;

	@FindBy(how = How.XPATH, using = "//p[text()='Bank Details']")
	public static WebElement Induction_Hearder_bankDetails;

	@FindBy(how = How.XPATH, using = "//p[@class='font-weight-bold mb-2']")
	public static WebElement Induction_Workmanname;

	@FindBy(how = How.XPATH, using = "//p[@class='mb-2 aadharNum']")
	public static WebElement Induction_aadhaar;

	@FindBy(how = How.XPATH, using = "//p[@class='mb-2 aadharNum']']/following-sibling::p[1]")
	public static WebElement Induction_workmenID;

	// **Partner**
	@FindBy(how = How.ID, using = "partnerType")
	public static WebElement Partner_partnerType;

	@FindBy(how = How.XPATH, using = "//mat-option[contains(@class,'eip-auto-complete-option mat-option')]")
	public static List<WebElement> Partner_partnerType_DR;

	@FindBy(how = How.ID, using = "lstPartner")
	public static WebElement Partner_partnername;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)[1]")
	public static WebElement Partner_partner_first_Partner;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)")
	public static List<WebElement> Partner_partner_DR;

	@FindBy(how = How.XPATH, using = "//span[@title='clear']")
	public static WebElement Partner_clear;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-select//span)[1]")
	public static WebElement Partner_workType;

	@FindBy(how = How.XPATH, using = "(//span[@ng-reflect-ng-switch]//span)[1]")
	public static WebElement Partner_workType_Edit;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)")
	public static List<WebElement> Partner_workType_DR;

	@FindBy(how = How.XPATH, using = "(//mat-option[@role='option']//span)[1]")
	public static WebElement Partner_workType_Regular_Service_Workmen;

	@FindBy(how = How.XPATH, using = "(//mat-option[@role='option']//span)[2]")
	public static WebElement Partner_workType_PRW_Hired_PM;

	@FindBy(how = How.XPATH, using = "(//mat-option[@role='option']//span)[3]")
	public static WebElement Partner_workType_Specialized_Works;

	@FindBy(how = How.XPATH, using = "//p[@class='font-weight-bold patnerName']")
	public static WebElement Partner_patnerName;

	@FindBy(how = How.XPATH, using = "//p[@class='address']")
	public static WebElement Partner_Address;

	@FindBy(how = How.XPATH, using = "//p[@class='address']/following-sibling::p")
	public static WebElement Partner_Contact;

	@FindBy(how = How.XPATH, using = "(//p[@class='address']/following-sibling::p)[2]")
	public static WebElement Partner_Mail;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-card//p[1])[1]")
	public static WebElement Partner_workManenroled;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-card//p[1])[2]")
	public static WebElement Partner_Current_Jobs;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-card//p[1])[3]")
	public static WebElement Partner_Workmen_Available;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-card//p[1])[4]")
	public static WebElement Partner_Years_at_LT;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-card//p[1])[5]")
	public static WebElement Partner_Work_Orders;

	@FindBy(how = How.XPATH, using = "(//app-partner//mat-card//p[1])[6]")
	public static WebElement Partner_IC_Associated;

	@FindBy(how = How.XPATH, using = "(//app-basic-details//p)[4]")
	public static WebElement partnerbar;

	@FindBy(how = How.XPATH, using = "//button[text()='Next']")
	public static WebElement Partner_next;

	// **Personal**

	@FindBy(how = How.XPATH, using = "//button[text()='Save & Next']")
	public static WebElement Personal_saveNext;

	@FindBy(how = How.XPATH, using = "(//input[@id='txtWorkmenName'])[1]")
	public static WebElement Personal_workmanName;

	@FindBy(how = How.ID, using = "txtfatherName")
	public static WebElement Personal_fatherName;

	@FindBy(how = How.XPATH, using = "//span[@class='k-icon k-i-calendar']")
	public static WebElement Personal_DOB_Calender;

	@FindBy(how = How.XPATH, using = "//td[@ng-reflect-ng-class='k-state-focused k-today']//preceding::span[7670]")
	public static WebElement Personal_DOB_Datepick;

	// Hardcodeed date
	@FindBy(how = How.XPATH, using = "(//app-personal-details//span[@class='k-dateinput-wrap']//input)")
	public static WebElement Kendo_DateField;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-calendar'])[1]")
	public static WebElement Kendo_Calender_DOB;

	@FindBy(how = How.XPATH, using = "//span[text()=' TODAY ']")
	public static WebElement Kendo_Calender_DOB_Today;

	@FindBy(how = How.XPATH, using = "//span[@class='k-dateinput-wrap']//input")
	public static WebElement Personal_DOB;

	// Age details
	@FindBy(how = How.XPATH, using = "//span[@class='ageDetails'][1]")
	public static WebElement Personal_AgeDetail_Years;

	@FindBy(how = How.XPATH, using = "(//span[@class='ageDetails'])[2]")
	public static WebElement Personal_AgeDetail_Months;

	@FindBy(how = How.XPATH, using = "//button[text()=' Picture ']")
	public static WebElement Personal_picture;

	@FindBy(how = How.ID, using = "btnTakeSnap")
	public static WebElement Personal_takeASnapshot;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-image-capture-popup/div[1]/div/i")
	public static WebElement Personal_close;

	@FindBy(how = How.XPATH, using = "(//app-personal-details//*[@class='mat-button-toggle-button mat-focus-indicator'][@aria-pressed='true'])")
	public static WebElement Personal_Gender_Choosen;

	@FindBy(how = How.XPATH, using = "//span[text()='Male ']")
	public static List<WebElement> Personal_Gender_allOptions;

	@FindBy(how = How.XPATH, using = "//span[text()='Male ']")
	public static WebElement Personal_Gender_Male;

	@FindBy(how = How.XPATH, using = "//span[text()='Female ']")
	public static WebElement Personal_Gender_female;

	@FindBy(how = How.XPATH, using = "//span[text()='Others ']")
	public static WebElement Personal_Gender_others;

	@FindBy(how = How.ID, using = "bloodGrp")
	public static WebElement Personal_bloodGroup;

	@FindBy(how = How.XPATH, using = "(//mat-option//span//span)")
	public static List<WebElement> Personal_bloodGroup_DR;

	@FindBy(how = How.ID, using = "btnTCAClose")
	public static WebElement Personal_languagesKnown;

	@FindBy(how = How.XPATH, using = "//button[text()='Add Language']")
	public static WebElement Personal_Language_addLanguage;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-language-knownpopup/div[2]/div/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[1]/div/eipautocomplete/mat-form-field/div/div[1]/div/i")
	public static WebElement Personal_Language_addLanguage_dr;

	@FindBy(how = How.XPATH, using = "//mat-dialog-container[@id='mat-dialog-0']/app-language-knownpopup[1]/div[2]/div[1]/div[1]/kendo-grid[1]/div[1]/kendo-grid-list[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/eipautocomplete[1]/mat-form-field[1]/div[1]/div[1]/div[1]/i[1]")
	public static WebElement Personal_Language_Languageselect;

	@FindBy(how = How.XPATH, using = "//input[@ng-reflect-id='languale']")
	public static WebElement Personal_Language;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)")
	public static List<WebElement> Personal_Language_Languageselect_DR;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	public static WebElement Personal_Language_Read;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
	public static WebElement Personal_Language_Write;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]")
	public static WebElement Personal_Language_Speak;

	@FindBy(how = How.XPATH, using = "(//button[@title='Save'])[1]")
	public static WebElement Personal_Language_Save;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-close')])[2]")
	public static WebElement Personal_Language_cancel;

	@FindBy(how = How.XPATH, using = "//button[@title='Edit']")
	public static WebElement Personal_Language_Edit;

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-trash-o'])[last()]")
	public static WebElement Personal_Language_Delete;

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-trash-o'])[3]")
	public static WebElement Personal_Language_Delete3;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-times-circle')]")
	public static WebElement Personal_Language_closewindow;

	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-select-2\"]/div/div[1]/span/span")
	public static WebElement Personal_maritalStatus_Choosen;

	@FindBy(how = How.XPATH, using = "(//app-basic-details//mat-select)[2]")
	public static WebElement Personal_maritalStatus;

	@FindBy(how = How.XPATH, using = "(//app-basic-details//mat-select)[3]")
	public static WebElement Personal_religion;

	@FindBy(how = How.XPATH, using = "(//*[@id='countryCode'])[1]")
	public static WebElement Personal_nationality;

	// @FindBy(how = How.CLASS_NAME, using="//*[@role='option']//span")
	@FindBy(how = How.XPATH, using = "//mat-option[@role='option']//span")
	public static List<WebElement> Personal_maritalStatus_DR;

	@FindBy(how = How.XPATH, using = "//mat-option[@role='option']//span")
	public static List<WebElement> Personal_religion_DR;

	@FindBy(how = How.XPATH, using = "//mat-option[@role='option']//span")
	public static List<WebElement> Personal_nationality_DR;

	@FindBy(how = How.ID, using = "txtspouseName")
	public static WebElement Personal_guardianSpouse;

	@FindBy(how = How.XPATH, using = "(//*[@id='nearestPoliceStation'])[1]")
	public static WebElement Personal_nearestPoliceStation;

	@FindBy(how = How.XPATH, using = "(//app-basic-details//mat-radio-button)")
	public static List<WebElement> Personal_policeCertificate;

	@FindBy(how = How.CSS, using = "app-personal-details#basicDetails2>div:nth-of-type(2)>div>div:nth-of-type(3)>div:nth-of-type(3)>mat-form-field>div>div>div>input")
	public static WebElement Personal_NoofChilderen;

	@FindBy(how = How.XPATH, using = "(//*[@id='csti-input'])")
	public static WebElement Personal_CSTI;

	@FindBy(how = How.XPATH, using = "(//*[@id='naps-input'])")
	public static WebElement Personal_NAPS;

	@FindBy(how = How.XPATH, using = "//span[text()=' CSTI']")
	public static WebElement Personal_CSTI_label;

	@FindBy(how = How.XPATH, using = "//span[text()='NAPS ']")
	public static WebElement Personal_NAPS_label;

	@FindBy(how = How.ID, using = "txtnapsCertificateNumber")
	public static WebElement Personal_nAPSNumber;

	@FindBy(how = How.ID, using = "txtcstiCertificateNumber")
	public static WebElement Personal_cSTINumber;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div/app-basic-details/div/div[2]/div[2]/app-personal-details/div[2]/div/div[4]/div[2]/div/eiptextbox/mat-form-field/div/div[1]/div[1]/input")
	public static WebElement Personal_certificatenumber;

	@FindBy(how = How.XPATH, using = "//button[text()='Save & Next']")
	public static WebElement partner_saveNext;

	@FindBy(how = How.XPATH, using = "//eipmessagebox")
	public static WebElement popup;

	@FindBy(how = How.XPATH, using = "(//eipmessagebox//div)[1]//p")
	public static WebElement popup_text;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static WebElement popup_head;

	@FindBy(how = How.XPATH, using = "//span[@title='close']")
	public static WebElement partner_WorkmanPopup;

	@FindBy(how = How.XPATH, using = "(//span[@title='Close'])[1]")
	public static WebElement partner_WorkmanPopup1;

	@FindBy(how = How.XPATH, using = "(//span[@title='Close'])[2]")
	public static WebElement partner_WorkmanPopup2;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement WorkmanSearchPopup_ok;

	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	public static WebElement WorkmanSearchPopup_Confirmation_Yes;

	@FindBy(how = How.XPATH, using = "//button[text()='No']")
	public static WebElement WorkmanSearchPopup_Confirmation_No;

	// **communicationDetails**

	@FindBy(how = How.XPATH, using = "//p[text()='Communication Details']")
	public static WebElement communicationDetails_Head;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[1]")
	public static WebElement communication_Mobilenumber;

	@FindBy(how = How.XPATH, using = "//a[@class='verifyText font-weight-bold']")
	public static WebElement communication_verifyMobilenumber;

	@FindBy(how = How.XPATH, using = "(//*[@id='countryCode'])[2]")
	public static WebElement communication_Country_Permanent_Address;

	@FindBy(how = How.XPATH, using = "(//*[@id='countryCode'])[3]")
	public static WebElement communication_Country_Temp_Address;

	@FindBy(how = How.XPATH, using = "(//*[@id='countryCode'])[4]")
	public static WebElement communication_Country_EC_Address;

	@FindBy(how = How.XPATH, using = "(//*[@id='stateCode'])[1]")
	public static WebElement communication_Country_Permanent_Address_State;

	@FindBy(how = How.XPATH, using = "(//*[@id='stateCode'])[2]")
	public static WebElement communication_Country_Temp_Address_State;

	@FindBy(how = How.XPATH, using = "(//*[@id='stateCode'])[3]")
	public static WebElement communication_Country_EC_Address_State;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[3]")
	public static WebElement Communication_pincode;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[4]")
	public static WebElement Communication_Address;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[5]")
	public static WebElement Communication_villageTown;

	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[1]")
	public static WebElement Communication_villageTown_clear;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Communication_villageTown_DR;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)[last()]")
	public static List<WebElement> Communication_Country_Allelements_Domestic;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)[last()]")
	public static List<WebElement> Communication_Country_Allelements;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[2]/div/div/div[5]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_District;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[2]/div/div/div[6]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_State;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container'])[3]")
	public static WebElement sameAsPermanent;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container'])[4]")
	public static WebElement Labour_Camp_Checkbox;

	@FindBy(how = How.ID, using = "campId")
	public static WebElement Labour_Camp_ID;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span[1]")
	public static List<WebElement> Labour_Camp_ID_All_option;

	@FindBy(how = How.ID, using = "structureId")
	public static WebElement Labour_Camp_structure;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span[1]")
	public static List<WebElement> Labour_Camp_structure_All_option;

	@FindBy(how = How.ID, using = "roomId")
	public static WebElement Labour_Camp_room;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span[1]")
	public static List<WebElement> Labour_Camp_room_All_option;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[11]")
	public static WebElement Communication_Temp_pincode;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[12]")
	public static WebElement Communication_Temp_address;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[13]")
	public static WebElement Communication_Temp_villageTown;

	@FindBy(how = How.XPATH, using = "(/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[3]/div/div/div[1]/eipautocomplete/mat-form-field/div/div[1]/div/input)")
	public static WebElement Communication_Temp_country;

	@FindBy(how = How.XPATH, using = "(/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[3]/div/div/div[6]/eipautocomplete/mat-form-field/div/div[1]/div/input)")
	public static WebElement Communication_Temp_state;

	@FindBy(how = How.XPATH, using = "(/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[3]/div/div/div[3]/mat-form-field/div/div[1]/div/input)")
	public static WebElement Communication_Temp_address_international;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[3]/div/div/div[5]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_District;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[3]/div/div/div[6]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_State;

	@FindBy(how = How.XPATH, using = "//mat-option[@role='option']//span")
	public static List<WebElement> Communication_temp_villageTown_DR;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/div[2]/app-communication-details/div[2]/div/div[3]/div/div[2]/div[2]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_Camp_pincode;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/div[2]/app-communication-details/div[2]/div/div[3]/div/div[2]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_Camp_Address;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/div[2]/app-communication-details/div[2]/div/div[3]/div/div[2]/div[4]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_Camp_Village;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/div[2]/app-communication-details/div[2]/div/div[3]/div/div[2]/div[5]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_Camp_District;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/div[2]/app-communication-details/div[2]/div/div[3]/div/div[2]/div[6]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_Temp_Camp_State;

	@FindBy(how = How.XPATH, using = "//p[text()='Emergency Contact ']")
	public static WebElement Communication_emergencyContact_Head;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[17]")
	public static WebElement Communication_EC_name;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[18]")
	public static WebElement Communication_EC_MobileNumber;

	@FindBy(how = How.XPATH, using = "(//a[@class='verifyText font-weight-bold'])[2]")
	public static WebElement Communication_EC_verify_MobileNumber;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[19]")
	public static WebElement Communication_EC_relationshipWithEmployee;

	@FindBy(how = How.XPATH, using = "//*[@role='option']//span//span")
	public static List<WebElement> Communication_EC_relationshipWithEmployee_DR;

	@FindBy(how = How.XPATH, using = "(//app-communication-details//input)[21]")
	public static WebElement Communication_EC_pincode;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[4]/div/div[2]/div[4]/eipautocomplete/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_EC_villageTown;

	@FindBy(how = How.XPATH, using = "(//mat-option[@role='option']//span//span)")
	public static List<WebElement> Communication_EC_villageTown_DR;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[4]/div/div[2]/div[3]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_EC_address;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[4]/div/div[2]/div[5]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_EC_District;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-basic-details/div/div[2]/app-communication-details/div[2]/div/div[4]/div/div[2]/div[6]/mat-form-field/div/div[1]/div/input")
	public static WebElement Communication_EC_state;

	@FindBy(how = How.XPATH, using = "(//button[text()='Save & Next'])[2]")
	public static WebElement Communication_saveNext;

	@FindBy(how = How.XPATH, using = "//span[@title='close']")
	public static WebElement Communication_Successpopup;

	@FindBy(how = How.XPATH, using = "//mat-dialog-container[@id='mat-dialog-1']/eipmessagebox[1]/div[1]/div[2]/p[1]")
	public static WebElement Communication_workMenID;

	// **Skill**

	@FindBy(how = How.XPATH, using = "//p[text()='Skill']")
	public static WebElement skill_header;

	@FindBy(how = How.XPATH, using = "(//app-skill-deployment//mat-form-field//i)[1]")
	public static WebElement skillCategory;

	@FindBy(how = How.XPATH, using = "(//app-skill-deployment//mat-form-field//i)[2]")
	public static WebElement skillGroup;

	@FindBy(how = How.XPATH, using = "(//app-skill-deployment//mat-form-field//i)[3]")
	public static WebElement skillDescription;

	@FindBy(how = How.XPATH, using = "(//app-skill-deployment//mat-form-field//i)[4]")
	public static WebElement skillType;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']/span")
	public static List<WebElement> skillCategory_DR;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> skillGroup_DR;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> skillDescription_DR;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> skillType_DR;

	@FindBy(how = How.XPATH, using = "//button[text()='Generate ID']")
	public static WebElement skill_save;

	@FindBy(how = How.XPATH, using = "(//input[@id='skillCategory'])")
	public static WebElement skillCategory_value;

	@FindBy(how = How.XPATH, using = "(//input[@id='location'])")
	public static WebElement skillGroup_value;

	@FindBy(how = How.XPATH, using = "(//input[@id='skillDescription'])")
	public static WebElement skillDesc_value;

	@FindBy(how = How.XPATH, using = "(//input[@id='skillType'])")
	public static WebElement skillType_value;

	// **Deployment*

	@FindBy(how = How.XPATH, using = "//p[text()='Deployment']")
	public static WebElement deployment_Header;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fas fa-chain')]")
	public static WebElement deployment_Picker;

	@FindBy(how = How.XPATH, using = "//mat-tree-node//mat-checkbox//span")
	public static List<WebElement> deployment_Tree_List;

	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	public static WebElement deployment_save;

	@FindBy(how = How.XPATH, using = "//mat-icon[text()=' expand_more ']")
	public static WebElement deployment_expanded;

	@FindBy(how = How.XPATH, using = "//mat-icon[text()=' chevron_right ']")
	public static WebElement deployment_Notexpanded_A;

	@FindBy(how = How.XPATH, using = "(//mat-icon[text()=' chevron_right '])[2]")
	public static WebElement deployment_Notexpanded_B;

	@FindBy(how = How.XPATH, using = "((//*[@id='checkwbschild']/label/span[1]))[2]")
	public static WebElement deployment_Tree_Checked_First;

	@FindBy(how = How.XPATH, using = "(//*[@id='checkwbschild']/label/span[1])")
	public static List<WebElement> deployment_Tree_Checked;

	// **Education & Training**

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input[@type='checkbox'])[1]")
	public static WebElement Education_Applicable_Checkbox;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input[@type='checkbox'])[2]")
	public static WebElement Experience_Applicable_Checkbox;

	@FindBy(how = How.XPATH, using = "//p[text()=' Education & Experience']")
	public static WebElement Education_Side_educationExperience;

	@FindBy(how = How.XPATH, using = "//p[text()='Education & Training']")
	public static WebElement Education_Header;

	@FindBy(how = How.XPATH, using = "(//td[@colspan='1'])[1]")
	public static WebElement Education_Read_Qualification;

	@FindBy(how = How.XPATH, using = "(//td[@colspan='1'])[2]")
	public static WebElement Education_Read_Branch;

	@FindBy(how = How.XPATH, using = "(//td[@colspan='1'])[3]")
	public static WebElement Education_Read_Discipiline;

	@FindBy(how = How.XPATH, using = "(//td[@colspan='1'])[4]")
	public static WebElement Education_Read_SchoolCollege;

	@FindBy(how = How.XPATH, using = "(//td[@colspan='1'])[5]")
	public static WebElement Education_Read_BoardUniversity;

	@FindBy(how = How.XPATH, using = "(//td[@colspan='1'])[6]")
	public static WebElement Education_Read_YearofPassing;

	@FindBy(how = How.XPATH, using = "//input[@value='Add Education']")
	public static WebElement Education_addEducation_btn;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input)[2]")
	public static WebElement Education_qualification;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Education_qualification_DR;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input)[3]")
	public static WebElement Education_Branch;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Education_Branch_DR;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input)[4]")
	public static WebElement Education_Discipiline;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input)[5]")
	public static WebElement Education_SchoolORCollege;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input)[6]")
	public static WebElement Education_BoardORUniversity;

	@FindBy(how = How.XPATH, using = "//p[text()='Experience']")
	public static WebElement Experience_Head;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div/app-basic-details/div/div[2]/div[2]/app-education-experience/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[6]/eipdatepicker/table/tr/td/kendo-textbox-container/kendo-datepicker/span/kendo-dateinput/span/input")
	public static WebElement Kendo_yearofPassing;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//input)[7]")
	public static WebElement Education_yearofPassing;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-save')]")
	public static WebElement Education_save;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fas fa-edit')])[1]")
	public static WebElement Education_Edit;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fas fa-edit')])[2]")
	public static WebElement Education_Edit2;

	@FindBy(how = How.XPATH, using = "//i[@class='fas fa-trash-o']")
	public static WebElement Education_delete;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-close')]")
	public static WebElement Education_close;

	// **Experience**

	@FindBy(how = How.XPATH, using = "//input[@value='Add Experience']")
	public static WebElement Experience_addExperience_btn;

	@FindBy(how = How.ID, using = "fromYear")
	public static WebElement Experience_durationFrom;

	@FindBy(how = How.ID, using = "toyear")
	public static WebElement Experience_durationTo;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Organisation Location']")
	public static WebElement Experience_organisation_Location;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Project Location']")
	public static WebElement Experience_projectLocation;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Project Code / Name']")
	public static WebElement Experience_projectCode;

	@FindBy(how = How.XPATH, using = "(//input[@ng-reflect-placeholder='Skill Category'])")
	public static WebElement Experience_Skillcatogory;

	@FindBy(how = How.XPATH, using = "(//input[@id='skillCategory'])[2]")
	public static WebElement Experience_Skillcatogory2;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']")
	public static List<WebElement> Experience_Skillcatogory_DR;

	@FindBy(how = How.XPATH, using = "(//input[@ng-reflect-placeholder='Skill Group'])")
	public static WebElement Experience_SkillGroup;

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Skill Group'])[2]")
	public static WebElement Experience_SkillGroup2;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Experience_SkillGroup_DR;

	@FindBy(how = How.XPATH, using = "(//input[@ng-reflect-placeholder='Skill Description'])")
	public static WebElement Experience_Skilldesc;

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Skill Description'])[2]")
	public static WebElement Experience_Skilldesc2;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Experience_SkillDesc_DR;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static WebElement Experience_SkillDesc_DR_first_selection;

	@FindBy(how = How.XPATH, using = "(//*[@id='saveExpDetails'])")
	public static WebElement Experience_addExperience_savebtn;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div/app-basic-details/div/div[2]/div[2]/app-education-experience/div[4]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[7]/div/i[1]")
	public static WebElement Experience_edit;

	@FindBy(how = How.XPATH, using = "((//app-education-experience//tbody[@role='presentation'])[2]//i[contains(@class,'fas fa-edit')])[position()=1]")
	public static WebElement Experience_edit2;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fas fa-edit')]/following-sibling::i[1]")
	public static WebElement Experience_delete;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-times-circle')]")
	public static WebElement Experience_close;

	@FindBy(how = How.XPATH, using = "(//button[text()='Save & Next'])[3]")
	public static WebElement Experience_saveNext;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//td)[8]")
	public static WebElement Experience_OrganisationName_value;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//td)[9]")
	public static WebElement Experience_ProjectLocation_value;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//td)[10]")
	public static WebElement Experience_ProjectName_value;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//td)[11]")
	public static WebElement Experience_SkillCategory_value;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//td)[12]")
	public static WebElement Experience_SkillGroup_value;

	@FindBy(how = How.XPATH, using = "(//app-education-experience//td)[13]")
	public static WebElement Experience_SkillDesc_value;

	// **statutoryDetails**

	@FindBy(how = How.XPATH, using = "//p[text()='Statutory Details']")
	public static WebElement statutoryDetails_Head;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[3]")
	public static WebElement statutoryDetails_Aadhaar;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[4]")
	public static WebElement statutoryDetails_DL;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//span[@class='k-dateinput-wrap']//input)[1]")
	public static WebElement statutoryDetails_DL_expiry;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[6]")
	public static WebElement statutoryDetails_pan;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[7]")
	public static WebElement statutoryDetails_WorkPermit;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[3]")
	public static WebElement statutoryDetails_WorkPermit_international;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//span[@class='k-dateinput-wrap']//input)[2]")
	public static WebElement statutoryDetails_WorkPermit_expiry;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//span[@class='k-dateinput-wrap']//input)[1]")
	public static WebElement statutoryDetails_International_WorkPermit_expiry;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//span[@class='k-dateinput-wrap']//input)[1]")
	public static WebElement statutoryDetails_WorkPermit_expiry_international;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[9]")
	public static WebElement statutoryDetails_labour;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[7]")
	public static WebElement statutoryDetails_Passport;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[5]")
	public static WebElement statutoryDetails_labour_international;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//span[@class='k-dateinput-wrap']//input)[3]")
	public static WebElement statutoryDetails_labour_expiry;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//kendo-datepicker/span/span/span)[2]")
	public static WebElement statutoryDetails_International_labour_expiry;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//kendo-datepicker/span/span/span)[2]")
	public static WebElement statutoryDetails_labour_expiry_international;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[7]")
	public static WebElement Passport_international;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[3]")
	public static WebElement Upload_Passport_international;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//kendo-datepicker/span/span/span)[3]")
	public static WebElement statutoryDetails_Passport_expiry_international;

	@FindBy(how = How.XPATH, using = "((//app-statutory-details//kendo-dateinput//span)[3])")
	public static WebElement statutoryDetails_Passport_expiry_international_value;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[11]")
	public static WebElement statutoryDetails_visaproid;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[12]")
	public static WebElement statutoryDetails_visa;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[13]")
	public static WebElement statutoryDetails_PF;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[14]")
	public static WebElement statutoryDetails_UAN;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//input)[15]")
	public static WebElement statutoryDetails_ESI;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[1]")
	public static WebElement Upload_aadhaar;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[2]")
	public static WebElement Upload_DL;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[3]")
	public static WebElement Upload_PAN;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[4]")
	public static WebElement Upload_WP;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[1]")
	public static WebElement Upload_WP_international;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[5]")
	public static WebElement Upload_labour;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[3]")
	public static WebElement Upload_passport;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[2]")
	public static WebElement Upload_labour_international;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[6]")
	public static WebElement Upload_visapro;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[7]")
	public static WebElement Upload_visa;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[8]")
	public static WebElement Upload_PF;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[9]")
	public static WebElement Upload_UAN;

	@FindBy(how = How.XPATH, using = "(//eipdocumentupload/i)[10]")
	public static WebElement Upload_ESI;

	@FindBy(how = How.XPATH, using = "(//app-documentupload/div//kendo-upload//input)[2]")
	public static WebElement popup_Upload_Attachments;

	@FindBy(how = How.XPATH, using = "((//kendo-grid-list//mat-select)//div//div)[1]")
	public static WebElement popup_Attachment_type;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)")
	public static List<WebElement> popup_Attachment_type_AllOption;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//input)[1]")
	public static WebElement popup_Attachment_Description;

	@FindBy(how = How.XPATH, using = "(//app-documentupload//kendo-grid//div//kendo-grid-list//mat-checkbox//label/span)[1]")
	public static WebElement popup_Attachment_Is_External;

	@FindBy(how = How.XPATH, using = "//button[@title='Upload Documents']")
	public static WebElement popup_Attachment_uploadDocuments;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)[2]")
	public static WebElement popup_Attachment_type_General;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)")
	public static List<WebElement> InvoiceRegistration_Attachment_type_AllOption;

	@FindBy(how = How.XPATH, using = "//p[text()='PF Nominee Details']")
	public static WebElement statutoryDetails_PFNominee_Header;

	@FindBy(how = How.ID, using = "saveSatutory")
	public static WebElement statutoryDetails_save;

	@FindBy(how = How.XPATH, using = "(//button[@id='saveSatutory'])")
	public static WebElement PFNomieeDetails_save;

	@FindBy(how = How.XPATH, using = "//button[text()='Add PF Nominees']")
	public static WebElement statutory_Add_PF_Nominee;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//td[@role='gridcell']//input)[1]")
	public static WebElement statutory_PF_Nominee_Name;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//tbody//td)[1]")
	public static WebElement statutory_PF_Nominee_Name_result;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//tbody//td)[2]")
	public static WebElement statutory_PF_Nominee_relation_result;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//tbody//td)[3]")
	public static WebElement statutory_PF_Nominee_percentage_result;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//td[@role='gridcell']//input)[2]")
	public static WebElement statutory_PF_Nominee_Relationship;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])//span")
	public static List<WebElement> statutory_PF_Nominee_Relationship_DR;

	@FindBy(how = How.XPATH, using = "(//app-Statutory-details//td[@role='gridcell']//input)[3]")
	public static WebElement statutory_PF_Nominee_Percentage;

	@FindBy(how = How.XPATH, using = "//i[@title='Save']")
	public static WebElement statutory_PF_Nominee_save;

	@FindBy(how = How.XPATH, using = "(//i[@title='Save'])[2]")
	public static WebElement statutory_PF_Nominee_Edit_save;

	@FindBy(how = How.XPATH, using = "//i[@title='Cancel']")
	public static WebElement statutory_PF_Nominee_Cancel;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div/app-basic-details/div/div[2]/div[2]/app-statutory-details/div[2]/div/div[2]/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[2]/td[4]/button[1]/i")
	public static WebElement statutory_PF_Nominee_Edit;

	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/div[2]/mat-sidenav-container/mat-sidenav-content/div/div/app-basic-details/div/div[2]/div[2]/app-statutory-details/div[2]/div/div[2]/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[4]/button[1]/i")
	public static WebElement statutory_PF_Nominee_Edit1;

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-trash-o'])[3]")
	public static WebElement statutory_PF_Nominee_Delete;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//tbody//tr//td)[1]")
	public static WebElement statutory_PF_Nominee_recordscount_text;

	@FindBy(how = How.XPATH, using = "(//app-statutory-details//tbody//tr//td)[1]")
	public static List<WebElement> statutory_PF_Nominee_recordscount;

	// **Bank**

	@FindBy(how = How.XPATH, using = "//p[text()='Bank Details']")
	public static WebElement Bank_Header;

	@FindBy(how = How.XPATH, using = "(//app-bank-details//input)[1]")
	public static WebElement Bank_AccountName;

	@FindBy(how = How.XPATH, using = "(//app-bank-details//input)[2]")
	public static WebElement Bank_AccountNumber;

	@FindBy(how = How.XPATH, using = "//span[text()='Domestic']")
	public static WebElement Bank_Account_domestic;

	@FindBy(how = How.XPATH, using = "//span[text()='International']")
	public static WebElement Bank_Account_international;

	@FindBy(how = How.ID, using = "lstIfsc")
	public static WebElement Bank_iFSCCode;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Bank_iFSCCode_Result_DR;

	@FindBy(how = How.XPATH, using = "//span[text()='IBAN']")
	public static WebElement Bank_International_iBAN;

	@FindBy(how = How.XPATH, using = "//span[text()='SWIFT']")
	public static WebElement Bank_International_sWIFT;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']")
	public static List<WebElement> Bank_International_sWIFT_DR;

	@FindBy(how = How.ID, using = "lstIBAN")
	public static WebElement Bank_International_iBANCode;

	@FindBy(how = How.ID, using = "lstSwift")
	public static WebElement Bank_International_sWIFTCode;

	@FindBy(how = How.CSS, using = "app-bank-details#basicDetails7>div:nth-of-type(2)>div>div:nth-of-type(3)>div:nth-of-type(3)>mat-form-field>div>div>div>input")
	public static WebElement Bank_International_BankName;

	@FindBy(how = How.XPATH, using = "//button[text()='Save']")
	public static WebElement Bank_save;

	@FindBy(how = How.XPATH, using = "(//span[@title='clear'])[2]")
	public static WebElement Bank_Ifsc_clear;

	@FindBy(how = How.XPATH, using = "(//app-bank-details//button)[3]")
	public static WebElement saveSubmit;

	// **DashBoard**

	@FindBy(how = How.XPATH, using = "//span[@class='mat-select-arrow-wrapper']//div[1]")
	public static WebElement Dashboard_SearchBy;

	@FindBy(how = How.XPATH, using = "(//mat-select[1]//span)[1]")
	public static WebElement Dashboard_SearchBy_select;

	@FindBy(how = How.XPATH, using = "//mat-card-subtitle[text()='LE140995-Crescent Bay-MEP']")
	public static WebElement Dashboard_JobCode;

	@FindBy(how = How.XPATH, using = "//span[text()=' Workmen Number ']")
	public static WebElement Dashboard_SearchBy_WorkmenID;

	@FindBy(how = How.XPATH, using = "//mat-option//span")
	public static List<WebElement> Dashboard_SearchBy_All_option;

	@FindBy(how = How.XPATH, using = "//span[text()=' VisaProID ']")
	public static WebElement Dashboard_SearchBy_VisaproID;

	@FindBy(how = How.XPATH, using = "(//mat-form-field//input)[1]")
	public static WebElement Dashboard_SearchBy_VisaproID_input;

	@FindBy(how = How.XPATH, using = "(//mat-form-field//input)[1]")
	public static WebElement Dashboard_SearchWorkmen_Passport_input2;

	@FindBy(how = How.XPATH, using = "//span[text()=' Aadhaar ']")
	public static WebElement Dashboard_SearchBy_Aadhar;

	@FindBy(how = How.XPATH, using = "(//mat-select)[1]")
	public static WebElement Dashboard_SearchBy_DD;

	@FindBy(how = How.NAME, using = "employeeId")
	public static WebElement Dashboard_employeeId;

	@FindBy(how = How.XPATH, using = "(//mat-form-field//input)[1]")
	public static WebElement Dashboard_employeeAadhaar;

	@FindBy(how = How.XPATH, using = "//mat-card[contains(@class,'mat-card inductionCardsInprogress')]")
	public static WebElement Dashboard_Inprogress;

	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	public static WebElement Dashboard_submit;

	@FindBy(how = How.XPATH, using = "//span[text()='Language']//following::tr")
	public static List<WebElement> language_Count;

	public static WebElement language(int x) {
		@SuppressWarnings("unused")
		WebElement finalResult;
		return finalResult = DriverFactory.driver
				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[1]"));
	}

	public static WebElement Read(int x) {
		@SuppressWarnings("unused")
		WebElement finalResult;
		return finalResult = DriverFactory.driver
				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[2]"));
	}

	public static WebElement write(int x) {
		@SuppressWarnings("unused")
		WebElement finalResult;
		return finalResult = DriverFactory.driver
				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[3]"));
	}

	public static WebElement speak(int x) {

		@SuppressWarnings("unused")
		WebElement finalResult;
		return finalResult = DriverFactory.driver
				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[4]"));
	}

	// ************************************************************************************************************

//	public static WebElement Read(int x) {
//		@SuppressWarnings("unused")
//		WebElement finalResult;
//		return finalResult = Webdriver.driver
//				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[2]"));
//	}
//
//	public static WebElement write(int x) {
//		@SuppressWarnings("unused")
//		WebElement finalResult;
//		return finalResult = Webdriver.driver
//				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[3]"));
//	}
//
//	public static WebElement speak(int x) {
//
//		@SuppressWarnings("unused")
//		WebElement finalResult;
//		return finalResult = Webdriver.driver
//				.findElement(By.xpath("//span[text()='Language']//following::tr[" + x + "]/td[4]"));
//	}

	// ************************************************************************************************************

	// language_Count = //span[text()='Language']//following::tr
//				 language =//span[text()='Language']//following::tr[1]/td[1]
//			     Read = //span[text()='Language']//following::tr[1]/td[2]
//			     write = //span[text()='Language']//following::tr[1]/td[3]
//			     speak = //span[text()='Language']//following::tr[1]/td[4]

//**Dashboard Elements**				

	@FindBy(how = How.XPATH, using = "(//mat-card-content//strong)[1]")
	public static WebElement Dashboard_Workmen_Head;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fas fa-eye')]")
	public static WebElement Dashboard_Profile_Eye;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[10]")
	public static WebElement Dashboard_Workmen_Name;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[13]")
	public static WebElement Dashboard_Workmen_Number;

	@FindBy(how = How.XPATH, using = "(//app-basic-details//p[3])[1]")
	public static WebElement BasicDetails_Side_Workmen_Number;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[20]")
	public static WebElement Dashboard_Workmen_Gender;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[16]")
	public static WebElement Dashboard_Workmen_Aadhaar;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[23]")
	public static WebElement Dashboard_Workmen_Partner;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[26]")
	public static WebElement Dashboard_Workmen_Partner_Name;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[6]")
	public static WebElement Dashboard_Workmen_Status;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[30]")
	public static WebElement Dashboard_Workmen_Jobcode;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[33]")
	public static WebElement Dashboard_Workmen_Skill;

	@FindBy(how = How.XPATH, using = "((//mat-card-content)[2]//div)[36]")
	public static WebElement Dashboard_Workmen_WorkType;

	@FindBy(how = How.XPATH, using = "(//mat-card-content//p)[3]")
	public static WebElement Dashboard_Profile_Job_Partner_Code;

	@FindBy(how = How.XPATH, using = "(//mat-card-content//p)[4]")
	public static WebElement Dashboard_Profile_Skill;

	@FindBy(how = How.XPATH, using = "(//mat-card-content//p)[5]")
	public static WebElement Dashboard_Profile_Status;

	@FindBy(how = How.XPATH, using = "(//app-workman-profile//p)[1]")
	public static WebElement Profile_card_WorkmenName;

	@FindBy(how = How.XPATH, using = "(//app-workman-profile//p)[2]")
	public static WebElement Profile_card_WorkmenSkill;

	@FindBy(how = How.XPATH, using = "(//app-workman-profile//p)[3]")
	public static WebElement Profile_card_WorkmenNumber;

	@FindBy(how = How.XPATH, using = "(//app-workman-profile//p)[4]")
	public static WebElement Profile_card_PartnerName;

	@FindBy(how = How.XPATH, using = "(//app-workman-profile//p)[5]")
	public static WebElement Profile_card_PartnerID;

//Paramedics objects

	@FindBy(how = How.XPATH, using = "(//app-paramedics//p)[1]")
	public static WebElement Paramedics_ProfileCard_Workmenname;

	@FindBy(how = How.XPATH, using = "(//app-paramedics//p)[2]")
	public static WebElement Paramedics_ProfileCard_WorkmenSkill;

	@FindBy(how = How.XPATH, using = "(//app-paramedics//p)[3]")
	public static WebElement Paramedics_ProfileCard_Workmennumber;

	@FindBy(how = How.XPATH, using = "(//app-paramedics//p)[4]")
	public static WebElement Paramedics_ProfileCard_WorkmenPartnerDetails;

	@FindBy(how = How.XPATH, using = "//span[@title='Toggle calendar']//span[1]")
	public static WebElement Datepicker_select_calender;

	@FindBy(how = How.XPATH, using = "(//*[@class='k-calendar-header']//span)[1]")
	public static WebElement Datepicker_select_calender_header;

	@FindBy(how = How.XPATH, using = "(//*[@class='k-calendar-header']//span)[1]")
	public static WebElement Datepicker_print_currect_year;

	@FindBy(how = How.XPATH, using = "(//li[@data-date-index])[1]//span")
	public static WebElement Datepicker_Year_First;

	@FindBy(how = How.XPATH, using = "(//kendo-virtualization//ul//span)[1]")
	public static WebElement Datepicker_Year_First_Element;

	@FindBy(how = How.XPATH, using = "//span[text()='2010']")
	public static WebElement Datepicker_Year_2010;

	@FindBy(how = How.XPATH, using = "//span[text()='Sep']")
	public static WebElement Datepicker_Year_2022;

	@FindBy(how = How.XPATH, using = "//span[text()='1998']")
	public static WebElement Datepicker_Year_1998;

	@FindBy(how = How.XPATH, using = "//li[@data-date-index='0']")
	public static WebElement Datepicker_Scroll_First_element;

	@FindBy(how = How.XPATH, using = "//li[@data-date-index][last()]")
	public static WebElement Datepicker_Scroll_Last_element;

	@FindBy(how = How.XPATH, using = "//li[@data-date-index]")
	public static List<WebElement> Datepicker_Randomyear;

	@FindBy(how = How.XPATH, using = "//kendo-virtualization//ul//li//span")
	public static List<WebElement> Datepicker_year;

	@FindBy(how = How.XPATH, using = "(//td[@data-cell-index]//span)")
	public static List<WebElement> Datepicker_select_Month;

	@FindBy(how = How.XPATH, using = "(//td[@data-cell-index]//span)")
	public static List<WebElement> Datepicker_select_Date;

	@FindBy(how = How.XPATH, using = "(//span[text()='27'])[1]")
	public static WebElement Datepicker_select_Date_27;

	@FindBy(how = How.XPATH, using = "(//span[text()='25'])[1]")
	public static WebElement Datepicker_select_Date_25;

	@FindBy(how = How.XPATH, using = "//td[@ng-reflect-ng-class='k-state-focused k-state-select']//span[1]//preceding::span[7]")
	public static WebElement Datepicker_7Datepreceding;

//Medical Test

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[2]")
	public static WebElement Paramedics_SkinTemp;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[3]")
	public static WebElement Paramedics_colorofEyes;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[4]")
	public static WebElement Paramedics_Complexion;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[5]")
	public static WebElement Paramedics_HeartRate;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[6]")
	public static WebElement Paramedics_Diabetics;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[7]")
	public static WebElement Paramedics_SPO2;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[8]")
	public static WebElement Paramedics_Systolic;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[9]")
	public static WebElement Paramedics_Diastolic;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[10]")
	public static WebElement Paramedics_Height;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[11]")
	public static WebElement Paramedics_weight;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[12]")
	public static WebElement Paramedics_BMI;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[13]")
	public static WebElement Paramedics_IDMark1;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[14]")
	public static WebElement Paramedics_IDMark2;

	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	public static WebElement Paramedics_submit;

	@FindBy(how = How.XPATH, using = "//button[text()='Fetch Data']")
	public static WebElement Paramedics_fetch_data;

//Medical Test Data

	@FindBy(how = How.XPATH, using = "(//mat-card-content)[5]//p[2]")
	public static WebElement Dashboard_MedicalTest_Count;

	@FindBy(how = How.XPATH, using = "(//mat-card-content)[6]//p[2]")
	public static WebElement Dashboard_EHS_Count;

	@FindBy(how = How.XPATH, using = "(//mat-card-content)[8]//p[2]")
	public static WebElement Dashboard_FA_Count;

	@FindBy(how = How.XPATH, using = "(//mat-card-content)[7]//p[2]")
	public static WebElement Dashboard_Wage_Count;

	@FindBy(how = How.XPATH, using = "(//mat-card-content)[8]//p[2]")
	public static WebElement Dashboard_FinalApproval_Count;

	@FindBy(how = How.XPATH, using = "(//div[@class='cardDiv'])[1]")
	public static WebElement MedicalTest_First_card;

	@FindBy(how = How.XPATH, using = "mat-dialog-content eip-messagebox-content')]//p[1]")
	public static WebElement Popup_Response;

	@FindBy(how = How.XPATH, using = "//button[text()='Ok']")
	public static WebElement Popup_Accept;

//Medical Test
	@FindBy(how = How.XPATH, using = "(//app-medical-test-profile//p)[1]")
	public static WebElement MedicalTest_ProfileCard_Workmenname;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-profile//p)[2]")
	public static WebElement MedicalTest_ProfileCard_WorkmenSkill;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-profile//p)[3]")
	public static WebElement MedicalTest_ProfileCard_Workmennumber;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-profile//p)[4]")
	public static WebElement MedicalTest_ProfileCard_WorkmenPartnerDetails;

	@FindBy(how = How.XPATH, using = "//app-medical-test-params//b")
	public static WebElement MedicalTest_Next_Medical_Examination_due;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//input)[1]")
	public static WebElement MedicalTest_Skin_Temperature;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//input)[2]")
	public static WebElement MedicalTest_ColorOfEyes;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//input)[3]")
	public static WebElement MedicalTest_Complextion;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//input)[4]")
	public static WebElement MedicalTest_BP;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[4]")
	public static WebElement MedicalTest_Heart_Rate;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[5]")
	public static WebElement MedicalTest_Diabetics;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[6]")
	public static WebElement MedicalTest_SPO2;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[7]")
	public static WebElement MedicalTest_Systolic;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[8]")
	public static WebElement MedicalTest_Diastolic;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[9]")
	public static WebElement MedicalTest_Height;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[10]")
	public static WebElement MedicalTest_Weight;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[11]")
	public static WebElement MedicalTest_BMI;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[12]")
	public static WebElement MedicalTest_Identification_Marks_1;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//div[3]//p[2])[13]")
	public static WebElement MedicalTest_Identification_Marks_2;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//mat-form-field//div//input)[1]")
	public static WebElement MedicalTest_updateskintemp;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//mat-form-field//div//input)[2]")
	public static WebElement MedicalTest_update_ColorofEyes;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//mat-form-field//div//input)[3]")
	public static WebElement MedicalTest_update_complextion;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//mat-form-field//div//input)[4]")
	public static WebElement MedicalTest_updateBP;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//mat-form-field//div//input)[5]")
	public static WebElement MedicalTest_MedicalofficerName;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//mat-form-field//div//input)[6]")
	public static WebElement MedicalTest_RegistrationNumber;

	@FindBy(how = How.XPATH, using = "//*[@id='getMedicalTestData']")
	public static WebElement MedicalTest_CreateMedicalCertiicate;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[1]//mat-button-toggle")
	public static List<WebElement> MedicalTest_Varicose_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[2]//mat-button-toggle")
	public static List<WebElement> MedicalTest_Seizure_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[3]//mat-button-toggle")
	public static List<WebElement> MedicalTest_Vertigo_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[4]//mat-button-toggle")
	public static List<WebElement> MedicalTest_Acrophobia_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[5]//mat-button-toggle")
	public static List<WebElement> MedicalTest_Diabetes_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[6]//mat-button-toggle")
	public static List<WebElement> MedicalTest_Stroke_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[7]//mat-button-toggle")
	public static List<WebElement> MedicalTest_HeartDisease_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[8]//mat-button-toggle")
	public static List<WebElement> MedicalTest_MajorIllnessorSurgery_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[9]//mat-button-toggle")
	public static List<WebElement> MedicalTest_RespiratoryDiseases_options;

	@FindBy(how = How.XPATH, using = "(//mat-button-toggle-group)[10]//mat-button-toggle")
	public static List<WebElement> MedicalTest_FitnessStatus_options;

	@FindBy(how = How.XPATH, using = "(//button[@aria-pressed='true'])[10]")
	public static WebElement MedicalTest_FitnessStatus_Enabled;

	@FindBy(how = How.XPATH, using = "((//mat-button-toggle-group)[10]//mat-button-toggle)[1]")
	public static WebElement MedicalTest_FitnessStatus_Fit;

	@FindBy(how = How.XPATH, using = "((//mat-button-toggle-group)[10]//mat-button-toggle)[2]")
	public static WebElement MedicalTest_FitnessStatus_UnFit;

	@FindBy(how = How.XPATH, using = "//*[@id='SaveMedicalTest']")
	public static WebElement MedicalTest_Submit;

	@FindBy(how = How.XPATH, using = "(//app-medical-test-params//i)[3]")
	public static WebElement MedicalTest_DownloadMedicalCertificate;

//EHS
	@FindBy(how = How.XPATH, using = "(//app-ehs-profile//p[1])[1]")
	public static WebElement EHS_First_card;

	@FindBy(how = How.XPATH, using = "(//app-ehs-profile//p[1])[2]")
	public static WebElement EHS_secound_card;

	@FindBy(how = How.XPATH, using = "(//app-ehs-profile//p)[1]")
	public static WebElement EHS_ProfileCard_Workmenname;

	@FindBy(how = How.XPATH, using = "(//app-ehs-profile//p)[2]")
	public static WebElement EHS_ProfileCard_WorkmenSkill;

	@FindBy(how = How.XPATH, using = "(//app-ehs-profile//p)[3]")
	public static WebElement EHS_ProfileCard_Workmennumber;

	@FindBy(how = How.XPATH, using = "(//app-ehs-profile//p)[4]")
	public static WebElement EHS_ProfileCard_WorkmenPartnerDetails;

	@FindBy(how = How.CLASS_NAME, using = "mat-checkbox-layout")
	public static WebElement EHS_ProfileCard_SelectAll;

	@FindBy(how = How.XPATH, using = "(//span[@ng-reflect-ng-class='row ml-1 cardRowSelected'][last()])")
	public static WebElement EHS_ProfileCard_lastcard_selected;

	@FindBy(how = How.XPATH, using = "//eipmessagebox//h1")
	public static List<WebElement> basic_popup_validation;

	@FindBy(how = How.XPATH, using = "//mat-dialog-container//h1")
	public static List<WebElement> basic_popup_validation_IC;

	@FindBy(how = How.XPATH, using = "//input[@value='Select Training Program']")
	public static WebElement EHS_SelectTrainingProgram;

	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'row ml-1 cardRowSelected')])")
	public static List<WebElement> EHS_SelectedWorkmenProfile;

	@FindBy(how = How.XPATH, using = "//div[@class='k-grid-toolbar-content d-flex']//div[1]")
	public static WebElement EHS_Selected_Workmen_Count_tab;

	@FindBy(how = How.XPATH, using = "//span[text()='Trainings']")
	public static List<WebElement> EHS_TrainingProgram_tab;

	@FindBy(how = How.XPATH, using = "(//td//input[@type='checkbox'])")
	public static List<WebElement> EHS_TrainingProgram_CheckBox;

	@FindBy(how = How.XPATH, using = "(//*[@id='saveEhs'])")
	public static WebElement EHS_Submit_taining;

	@FindBy(how = How.XPATH, using = "//span[text()='Training History']")
	public static WebElement EHS_training_history;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-col-index='1'])")
	public static List<WebElement> EHS_TrainingHistory_Skill_Description;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-col-index='2'])")
	public static List<WebElement> EHS_TrainingHistory_Job;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-col-index='3'])")
	public static List<WebElement> EHS_TrainingHistory_TrainingDate;

//Wage
	@FindBy(how = How.XPATH, using = "(//div[@class='cardDiv'])[1]")
	public static WebElement Wage_First_card;

	@FindBy(how = How.XPATH, using = "(//app-wage-profile//p)[1]")
	public static WebElement Wage_ProfileCard_Workmenname;

	@FindBy(how = How.XPATH, using = "(//app-wage-profile//p)[2]")
	public static WebElement Wage_ProfileCard_WorkmenSkill;

	@FindBy(how = How.XPATH, using = "(//app-wage-profile//p)[3]")
	public static WebElement Wage_ProfileCard_Workmennumber;

	@FindBy(how = How.XPATH, using = "(//app-wage-profile//p)[4]")
	public static WebElement Wage_ProfileCard_WorkmenPartnerDetails;

	@FindBy(how = How.XPATH, using = "//input[@ng-reflect-id='location']")
	public static WebElement Wage_Project_Location;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Wage_Project_Location_options;

	@FindBy(how = How.XPATH, using = "//input[@ng-reflect-id='zone']")
	public static WebElement Wage_Zone;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Wage_Zone_options;

	@FindBy(how = How.XPATH, using = "//button[@type='button']//span")
	public static List<WebElement> Wage_Payout_options;

	@FindBy(how = How.XPATH, using = "//button[@type='button'][@aria-pressed='true']//span")
	public static WebElement Wage_Payout_options_selected;

	@FindBy(how = How.XPATH, using = "(//label[text()='Basic']/following::input)[1]")
	public static WebElement Wage_Earnings_Basic;

	@FindBy(how = How.XPATH, using = "(//label[text()='HRA']/following::input)[1]")
	public static WebElement Wage_Earnings_HRA;

	@FindBy(how = How.LINK_TEXT, using = "Other Allowances")
	public static WebElement Wage_otherAllowances;

	@FindBy(how = How.LINK_TEXT, using = "Other Recoveries")
	public static WebElement Wage_otherrecoveries;

	@FindBy(how = How.XPATH, using = "(//app-other-allowances//input)[1]")
	public static WebElement Wage_otherAllowances_Reason;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> Wage_otherAllowances_Reason_allEmelemnts;

	@FindBy(how = How.XPATH, using = "(//button[@type='button']//span)[3]")
	public static WebElement Wage_otherAllowances_Type_Fixed;

	@FindBy(how = How.XPATH, using = "(//button[@type='button']//span)[4]")
	public static WebElement Wage_otherAllowances_Type_Percentage;

	@FindBy(how = How.XPATH, using = "((//mat-button-toggle-group)[2]//button[@type='button']//span)")
	public static List<WebElement> Wage_otherAllowances_Type;

	@FindBy(how = How.XPATH, using = "(//app-other-allowances//mat-select)[1]")
	public static WebElement Wage_otherAllowances_dependent;

	@FindBy(how = How.XPATH, using = "//mat-option//span")
	public static List<WebElement> Wage_otherAllowances_dependent_allEmelemnts;

	@FindBy(how = How.XPATH, using = "(//app-other-allowances//input)[2]")
	public static WebElement Wage_otherAllowances_value;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-col-index='4'])[1]")
	public static WebElement Wage_otherAllowances_Amount;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-col-index='4'])")
	public static List<WebElement> Wage_otherAllowances_Amount_Calculated_AllAmount;

	@FindBy(how = How.XPATH, using = "(//app-other-allowances//div//span)[11]")
	public static WebElement Wage_OtherAllowances_Total_Amount;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-col-index='4'])")
	public static List<WebElement> Wage_otherAllowances_All_Amount;

	@FindBy(how = How.XPATH, using = "//span[text()='Total Cost :']/following-sibling::span")
	public static WebElement Wage_otherAllowances_Total;

	@FindBy(how = How.XPATH, using = "//i[@title='Add']")
	public static WebElement Wage_otherAllowances_action__add;

	@FindBy(how = How.XPATH, using = "//i[@title='Delete'][1]")
	public static WebElement Wage_otherAllowances_action__Delete;

	@FindBy(how = How.XPATH, using = "//i[@title='Delete']")
	public static List<WebElement> Wage_otherAllowances_action__Delete_all;

	@FindBy(how = How.XPATH, using = "//button[text()='Post']")
	public static WebElement Wage_otherAllowances_post;

	@FindBy(how = How.XPATH, using = "//span[text()='Domestic']")
	public static WebElement WorkmenSearch_Domestic;

	@FindBy(how = How.XPATH, using = "//span[text()='International']")
	public static WebElement WorkmenSearch_International;

	@FindBy(how = How.XPATH, using = "//p[text()='No DLR entry found for Today. Kindly enter the DLR for Today and proceed for Induction.']")
	public static List<WebElement> WorkmenSearch_NoDLREntry;

	@FindBy(how = How.XPATH, using = "(//th[contains(@class,'LT_CampStrength CampStrength')])[3]")
	public static WebElement Wage_otherAllowances_Total_Provisional;

	@FindBy(how = How.XPATH, using = "(//th[contains(@class,'LT_CampStrength CampStrength')])[4]")
	public static WebElement Wage_Total_Provisional;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container']//input)[1]")
	public static WebElement Wage_Deductions_PF_Checkbox;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container']//input)[2]")
	public static WebElement Wage_Deductions_ESI_Checkbox;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-inner-container']//input)[3]")
	public static WebElement Wage_Deductions_PT_Checkbox;

	@FindBy(how = How.XPATH, using = "(//input)[7]")
	public static WebElement Wage_Deduction_PF;

	@FindBy(how = How.XPATH, using = "(//input)[9]")
	public static WebElement Wage_Deduction_ESI;

	@FindBy(how = How.XPATH, using = "(//input)[11]")
	public static WebElement Wage_Deduction_PT;

// DLR

	@FindBy(how = How.ID, using = "jobCode")
	public static WebElement DLR_job;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)")
	public static List<WebElement> DLR_job_All_Elements;

	@FindBy(how = How.CLASS_NAME, using = "k-today")
	public static WebElement Calender_Date_TODAY;

	@FindBy(how = How.XPATH, using = "(//td[@ng-reflect-ng-class='k-state-focused k-state-select']//span[1])//preceding::span[1]")
	public static WebElement Calender_Date_Yesterday;

	@FindBy(how = How.XPATH, using = "//button[text()='Search']")
	public static WebElement DLR_search;

	@FindBy(how = How.XPATH, using = "//button[text()='Save']")
	public static WebElement DLR_Save;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-backward')]")
	public static WebElement DLR_Back;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[4]")
	public static WebElement DLR_Shift_Total_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[5]")
	public static WebElement DLR_Shift_Total_Dept_Workmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[6]")
	public static WebElement DLR_Shift_Total_SC_Workmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[7]")
	public static WebElement DLR_Shift_Total_Security;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[9]")
	public static WebElement DLR_Day_Total_total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[10]//input")
	public static WebElement DLR_Day_Dept_Workmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[11]//input")
	public static WebElement DLR_Day_SC_Workmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[12]//input")
	public static WebElement DLR_Day_Security;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[14]")
	public static WebElement DLR_Night_Total_total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[15]//input")
	public static WebElement DLR_Night_Dept_Workmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[16]//input")
	public static WebElement DLR_Night_SC_Workmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[17]//input")
	public static WebElement DLR_Night_Security;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[19]//input")
	public static WebElement DLR_Breakup_Workmen_Strength_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[20]//input")
	public static WebElement DLR_Breakup_Workmen_Strength_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[21]//input")
	public static WebElement DLR_Breakup_Workmen_Strength_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[22]")
	public static WebElement DLR_Breakup_Workmen_Strength_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[24]//input")
	public static WebElement DLR_Breakup_Workmen_AtSite_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[25]//input")
	public static WebElement DLR_Breakup_Workmen_AtSite_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[26]//input")
	public static WebElement DLR_Breakup_Workmen_AtSite_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[27]")
	public static WebElement DLR_Breakup_Workmen_AtSite_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[29]//input")
	public static WebElement DLR_Breakup_Workmen_Inducted_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[30]//input")
	public static WebElement DLR_Breakup_Workmen_Inducted_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[31]//input")
	public static WebElement DLR_Breakup_Workmen_Inducted_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[32]")
	public static WebElement DLR_Breakup_Workmen_Inducted_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[34]//input")
	public static WebElement DLR_Breakup_Workmen_Released_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[35]//input")
	public static WebElement DLR_Breakup_Workmen_Released_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[36]//input")
	public static WebElement DLR_Breakup_Workmen_Released_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[37]")
	public static WebElement DLR_Breakup_Workmen_Released_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[39]//input")
	public static WebElement DLR_Breakup_Expected_to_Release_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[40]//input")
	public static WebElement DLR_Breakup_Expected_to_Release_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[41]//input")
	public static WebElement DLR_Breakup_Expected_to_Release_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[42]")
	public static WebElement DLR_Breakup_Expected_to_Release_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[44]//input")
	public static WebElement DLR_Breakup_Workmen_under_Quarantine_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[45]//input")
	public static WebElement DLR_Breakup_Workmen_under_Quarantine_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[46]//input")
	public static WebElement DLR_Breakup_Workmen_under_Quarantine_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[47]")
	public static WebElement DLR_Breakup_Workmen_under_Quarantine_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[49]//input")
	public static WebElement DLR_Breakup_Workmen_Affected_by_Covid_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[50]//input")
	public static WebElement DLR_Breakup_Workmen_Affected_by_Covid_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[51]//input")
	public static WebElement DLR_Breakup_Workmen_Affected_by_Covid_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[52]")
	public static WebElement DLR_Breakup_Workmen_Affected_by_Covid_Total;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[54]//input")
	public static WebElement DLR_Breakup_Remarks_LTCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[55]//input")
	public static WebElement DLR_Breakup_Remarks_SCCamp;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[56]//input")
	public static WebElement DLR_Breakup_Remarks_LocalWorkmen;

	@FindBy(how = How.XPATH, using = "(//app-dlr-component//table//td)[57]")
	public static WebElement DLR_Breakup_Remarks_Total;

	@FindBy(how = How.XPATH, using = "(//*[@class='image-holder'])[6]")
	public static WebElement Management_DLR;

	@FindBy(how = How.XPATH, using = "(//table//tbody//tr//th//input)[4]")
	public static WebElement Wage_Deduction_PF_value;

	@FindBy(how = How.XPATH, using = "(//table//tbody//tr//th//input)[6]")
	public static WebElement Wage_Deduction_ESI_value;

	@FindBy(how = How.XPATH, using = "(//table//tbody//tr//th//input)[8]")
	public static WebElement Wage_Deduction_PT_value;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//div//kendo-grid-list//div//div[1]//table//tbody//tr//td[4]//input)")
	public static WebElement Wage_Deduction_Other_Recoveries_value;

	@FindBy(how = How.XPATH, using = "(//table//tbody//tr//th)[18]")
	public static WebElement Wage_Deduction_Professional_Deduction_value;

	@FindBy(how = How.XPATH, using = "(//div//h3//b)[1]")
	public static WebElement Wage_Total;

	@FindBy(how = How.ID, using = "submit")
	public static WebElement Wage_Submit;

	@FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
	public static WebElement Wage_Cancel;

// Final Approval
	@FindBy(how = How.XPATH, using = "//table//tbody//tr//td[2]")
	public static List<WebElement> FA_Workmen_Count_AllElements;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-expand']")
	public static WebElement FA_Expand;

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-compress']")
	public static WebElement FA_collapse;

	@FindBy(how = How.XPATH, using = "//table//tbody//tr//td[6]//div//i")
	public static List<WebElement> FA_Workmen_Prifile_Eye_AllElements;

	@FindBy(how = How.XPATH, using = "//table//tbody//tr//td[1]//mat-checkbox")
	public static List<WebElement> FA_Workmen_Prifile_AllElements;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-toolbar//div//div)[1]")
	public static WebElement FA_Workmen_Prifile_Selected;

	@FindBy(how = How.XPATH, using = "//button[text()='Submit']")
	public static WebElement FA_Submit;

//Gate Pass
	@FindBy(how = How.XPATH, using = "(//mat-nav-list//div//a//span//i)[3]")
	public static WebElement Menu_GatePass;

	@FindBy(how = How.XPATH, using = "//span[text()='Gate Pass ']")
	public static WebElement Menu_GatePass_New;

	@FindBy(how = How.XPATH, using = "(//mat-nav-list//div//a//span//i)[5]")
	public static WebElement Menu_Attendance;

	@FindBy(how = How.XPATH, using = "//button[text()='Fetch']")
	public static WebElement GatePass_fetch;

	@FindBy(how = How.XPATH, using = "//input[@value='Clear']")
	public static WebElement GatePass_Clear;

	@FindBy(how = How.ID, using = "gatepasstype")
	public static WebElement gatePassType;

	@FindBy(how = How.XPATH, using = "//input[@value='Submit']")
	public static WebElement Gatepass_submit;

	@FindBy(how = How.NAME, using = "strReleaseReason")
	public static WebElement Gatepass_blocklist_Reason;

	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	public static WebElement Gatepass_blocklist_Confirmation_Yes;

	@FindBy(how = How.XPATH, using = "//button[text()='No']")
	public static WebElement Gatepass_blocklist_Confirmation_No;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> gatePassType_AllOption;

	@FindBy(how = How.XPATH, using = "//span[text()='Issue']")
	public static WebElement gatePassType_AllOption_Issue;

	@FindBy(how = How.XPATH, using = "//span[text()='Renewal']")
	public static WebElement gatePassType_AllOption_Renewal;

	@FindBy(how = How.XPATH, using = "//span[text()='BlackList']")
	public static WebElement gatePassType_AllOption_BlackList;

	@FindBy(how = How.XPATH, using = "//span[text()='Temporary Release']")
	public static WebElement gatePassType_AllOption_Temporary_Release;

	@FindBy(how = How.XPATH, using = "//span[text()='Permanent Release']")
	public static WebElement gatePassType_AllOption_Permanent_Release;

	@FindBy(how = How.XPATH, using = "//span[text()='Generate Print']")
	public static WebElement gatePassType_AllOption_Generate_Print;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fas fa-eye')])[1]")
	public static WebElement gatePass_firstCard_Eye;

	@FindBy(how = How.XPATH, using = "//button[text()='Load More']")
	public static WebElement gatePass_Loadmore;

	@FindBy(how = How.ID, using = "file")
	public static WebElement Attendance_uploadCAP;

	@FindBy(how = How.XPATH, using = "//span[@class='k-icon k-i-calendar']")
	public static WebElement AttendanceDate;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[1]")
	public static WebElement Attendance_Summery_data;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[1]")
	public static WebElement Attendance_Summery_WorkmenNumber;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[1]")
	public static WebElement Attendance_Summery_WorkmenName;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[2]")
	public static WebElement Attendance_Summery_SubContractor;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[3]")
	public static WebElement Attendance_Summery_Shitcode;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[4]")
	public static WebElement Attendance_Summery_InTime;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[5]")
	public static WebElement Attendance_Summery_OutTime;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[6]")
	public static WebElement Attendance_Summery_CostPackage;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[7]")
	public static WebElement Attendance_Summery_Source;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[8]")
	public static WebElement Attendance_Summery_ServerName;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[9]")
	public static WebElement Attendance_Summery_MachineID;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td)[10]")
	public static WebElement Attendance_Summery_LogUserID;

	// Added by Tamil 17-11-2022

	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Workmen Number']")
	public static WebElement Dashboard_SearchWorkmen_Number;

	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Name']")
	public static WebElement Dashboard_SearchWorkmen_Name;

	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Father Name']")
	public static WebElement Dashboard_SearchWorkmenFather_Name;

	@FindBy(how = How.XPATH, using = "//span[text()=' Passport Number ']")
	public static WebElement Dashboard_SearchWorkmen_Passport;

	@FindBy(how = How.XPATH, using = "//input[@data-placeholder='Passport ']")
	public static WebElement Dashboard_SearchWorkmen_Passport_input;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[3]//div//a)")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenNumber_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[1])")
	public static WebElement Dashboard_SearchWorkmen_Name_WorkmenList_First;

	@FindBy(how = How.XPATH, using = "(//ngb-modal-window//button//span)[1]")
	public static WebElement Dashboard_SearchWorkmen_Name_WorkmenList_close;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[1]//div//a)")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_Addhaar_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[2])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenName_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[4])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenJob_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[5])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenStatus_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[6])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenSkill_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[7])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenFatherName_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[8])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenGender_AllElemet;

	@FindBy(how = How.XPATH, using = "(//kendo-grid-list//td[9])")
	public static List<WebElement> Dashboard_SearchWorkmen_Name_WorkmenList_WorkmenWorkType_AllElemet;

	@FindBy(how = How.XPATH, using = "//p[@class='ng-star-inserted']//b")
	public static List<WebElement> ProfileStages_CompletionStatus_allElement;

	@FindBy(how = How.XPATH, using = "(//mat-card//mat-card-content//p//span)")
	public static List<WebElement> ProfileStages_allElement;

	@FindBy(how = How.XPATH, using = "//span[@role='progressbar']")
	public static List<WebElement> ProfileStages_ProgressPercentage_list;

	@FindBy(how = How.XPATH, using = "//span[@role='progressbar']")
	public static WebElement ProfileStages_ProgressPercentage;

	@FindBy(how = How.CLASS_NAME, using = "workmenId")
	public static WebElement Current_workmenNumber;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[1])")
	public static List<WebElement> Attendacne_WorkmenNumber;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[2])")
	public static List<WebElement> Attendacne_WorkmenName;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[3])")
	public static List<WebElement> Attendacne_subcontractor;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[4])")
	public static List<WebElement> Attendacne_shiftcode;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[5])")
	public static List<WebElement> Attendacne_inTime;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[6])")
	public static List<WebElement> Attendacne_outtime;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[7])")
	public static List<WebElement> Attendacne_costpackage;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[8])")
	public static List<WebElement> Attendacne_source;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[9])")
	public static List<WebElement> Attendacne_servername;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[10])")
	public static List<WebElement> Attendacne_machineID;

	@FindBy(how = How.XPATH, using = "(//tbody//tr//td[11])")
	public static List<WebElement> Attendacne_LoguserID;

	@FindBy(how = How.XPATH, using = "//tbody//tr//td[1]")
	public static WebElement Attendacne_record;

	@FindBy(how = How.XPATH, using = "(//input[@ng-reflect-type='date'])[1]")
	public static WebElement Gatepass_FromDate;

	@FindBy(how = How.XPATH, using = "(//input[@ng-reflect-type='date'])[2]")
	public static WebElement Gatepass_ToDate;

	@FindBy(how = How.XPATH, using = "//button[text()=' Print ']")
	public static WebElement Gatepass_Print;

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-1']//span[1]")
	public static WebElement Dashboard_SearchBy_option;

	@FindBy(how = How.XPATH, using = "(//mat-option[@role='option']//span)")
	public static List<WebElement> Dashboard_SearchBy_option_Dr_All_Elements;

//Training_Dashboard

	@FindBy(how = How.XPATH, using = "(//mat-nav-list//div//a//span//i)[7]")
	public static WebElement WMS_Management;

	@FindBy(how = How.XPATH, using = "(//*[@class='image-holder'])[2]")
	public static WebElement WMS_Training;

	@FindBy(how = How.XPATH, using = "(//app-landing//img)[1]")
	public static WebElement WMS_Training_Menu;

	@FindBy(how = How.XPATH, using = "(//eipmultiselectautocomplete//input)[1]")
	public static WebElement WMS_Training_IC;

	@FindBy(how = How.XPATH, using = "(//eipmultiselectautocomplete//input)[2]")
	public static WebElement WMS_Training_SBG;

	@FindBy(how = How.XPATH, using = "(//eipmultiselectautocomplete//input)[3]")
	public static WebElement WMS_Training_BU;

	@FindBy(how = How.XPATH, using = "(//eipmultiselectautocomplete//input)[4]")
	public static WebElement WMS_Training_Cluster;

	@FindBy(how = How.XPATH, using = "(//eipmultiselectautocomplete//input)[5]")
	public static WebElement WMS_Training_Job;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])")
	public static List<WebElement> WMS_Training_IC_All_Checkbox_Elements;

	@FindBy(how = How.XPATH, using = "(//div[@class='mat-checkbox-inner-container'])[1]")
	public static WebElement WMS_Training_IC_SelectAll;

	@FindBy(how = How.ID, using = "icCode")
	public static WebElement WMS_Training_IC_Input;

	@FindBy(how = How.ID, using = "sbgCode")
	public static WebElement WMS_Training_SBG_Input;

	@FindBy(how = How.ID, using = "buCode")
	public static WebElement WMS_Training_BU_Input;

	@FindBy(how = How.ID, using = "clusterCode")
	public static WebElement WMS_Training_Cluster_Input;

	@FindBy(how = How.ID, using = "jobCode")
	public static WebElement WMS_Training_Job_Input;

	@FindBy(how = How.XPATH, using = "(//mat-checkbox//span[2])")
	public static List<WebElement> WMS_Training_IC_Input_All_Options;

	@FindBy(how = How.XPATH, using = "(//input[@id='icon-rightdateRange_Kendo'])")
	public static WebElement WMS_Training_Date_Input;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list)[3]//table//tr[1]/td)[1])")
	public static WebElement Experience_Old_Job_Experience_Record;

	@FindBy(how = How.XPATH, using = "((//kendo-grid-list//table)[3]//tbody//tr//td[1])")
	public static List<WebElement> Experience_Old_Job_Experience_List;

	@FindBy(how = How.XPATH, using = "//*[@class='k-button k-bare k-title']")
	public static WebElement Datepicker_Expiry_select_year;

	@FindBy(how = How.XPATH, using = "(//kendo-popup//kendo-calendar/kendo-calendar-viewlist//kendo-virtualization//table//tbody//tr//td//span)")
	public static List<WebElement> Datepicker_Expiry_year;

	@FindBy(how = How.XPATH, using = "(//kendo-popup//kendo-calendar/kendo-calendar-viewlist//kendo-virtualization//table//tbody//tr//td//span)")
	public static List<WebElement> Datepicker_Expiry_select_Month;

	@FindBy(how = How.XPATH, using = "(//kendo-popup//kendo-calendar/kendo-calendar-viewlist//kendo-virtualization//table//tbody//tr//td//span)")
	public static List<WebElement> Datepicker_Expiry_select_Date;

// Management 

// Camp Management

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-compliance-management')])")
	public static WebElement WMS_Management_sidenav;

	@FindBy(how = How.XPATH, using = "(//*[@class='image-holder'])[1]")
	public static WebElement WMS_Management_Camp_Mngt;

	@FindBy(how = How.ID, using = "AddCamp")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp;

	@FindBy(how = How.ID, using = "CampName")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_campName;

	@FindBy(how = How.ID, using = "Address")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_address;

	@FindBy(how = How.ID, using = "pincode")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_pincode;

	@FindBy(how = How.ID, using = "permVillageCity")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_village;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> WMS_Management_Camp_Mngt_AddCamp_village_DR;

	@FindBy(how = How.XPATH, using = "((//app-add-camp//mat-form-field//input)[5])")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_District;

	@FindBy(how = How.XPATH, using = "((//app-add-camp//mat-form-field//input)[6])")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_State;

	@FindBy(how = How.ID, using = "submitCamp")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_Submit;

	@FindBy(how = How.XPATH, using = "(//i[@title='Add Structure'])")
	public static List<WebElement> WMS_Management_Camp_Mngt_AddCamp_Structure_allele;

	@FindBy(how = How.XPATH, using = "(//i[@title='Add Structure'])[1]")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_Structure_First;

	@FindBy(how = How.ID, using = "StructureName")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_Structure_Name;

	@FindBy(how = How.ID, using = "roomAvl")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_Structure_Room;

	@FindBy(how = How.ID, using = "SubmitBtnStructure")
	public static WebElement WMS_Management_Camp_Mngt_AddCamp_Structure_Room_submit;

	@FindBy(how = How.XPATH, using = "(//i[@title='Add Room'])")
	public static List<WebElement> WMS_Management_Camp_Mngt_Addroom_allele;

	@FindBy(how = How.XPATH, using = "(//i[@title='Add Room'])[1]")
	public static WebElement WMS_Management_Camp_Mngt_Addroom_first;

	@FindBy(how = How.ID, using = "RoomName")
	public static WebElement WMS_Management_Camp_Mngt_Addroom_name;

	@FindBy(how = How.ID, using = "MaximumBedsAvailable")
	public static WebElement WMS_Management_Camp_Mngt_Addroom_MaximumBedsAvailable;

	@FindBy(how = How.ID, using = "Areainsqmeters")
	public static WebElement WMS_Management_Camp_Mngt_Addroom_Areainsqmeters;

	@FindBy(how = How.ID, using = "submitRoom")
	public static WebElement WMS_Management_Camp_Mngt_Addroom_Submit;

	@FindBy(how = How.XPATH, using = "(//div[@role='tab']//div)")
	public static List<WebElement> WMS_Management_Camp_Mngt_roomtab_allele;

	@FindBy(how = How.XPATH, using = "(//div[@role='tab']//div)[1]")
	public static WebElement WMS_Management_Camp_Mngt_roomtab_first;

	@FindBy(how = How.XPATH, using = "(//div[@role='tab']//div)[last()]")
	public static WebElement WMS_Management_Camp_Mngt_roomtab_last;

	@FindBy(how = How.XPATH, using = "(//input[@data-placeholder='Enter Workmen ID'])")
	public static WebElement WMS_Management_Camp_Mngt_room_WMID;

	@FindBy(how = How.XPATH, using = "(//div[@role='tab']//div)")
	public static List<WebElement> WMS_Management_Camp_Mngt_room_workmen_list;

	@FindBy(how = How.XPATH, using = "(//mat-tab-body//button[text()='Add'])[1]")
	public static WebElement WMS_Management_Camp_Mngt_room_workmen_Addbtn;

	@FindBy(how = How.XPATH, using = "(//mat-tab-body//*[contains(@class,'userDetails')])")
	public static List<WebElement> WMS_Management_Camp_Mngt_workmen_count_in_room;

	@FindBy(how = How.XPATH, using = "((//mat-tab-body//*[contains(@class,'userDetails')])//p[1])")
	public static List<WebElement> WMS_Management_Camp_Mngt_workmen_Name_in_room;

	@FindBy(how = How.XPATH, using = "((//mat-tab-body//*[contains(@class,'userDetails')])//span[1])")
	public static List<WebElement> WMS_Management_Camp_Mngt_workmen_Skill_in_room;

	@FindBy(how = How.XPATH, using = "((//mat-tab-body//*[contains(@class,'userDetails')])//span[2])")
	public static List<WebElement> WMS_Management_Camp_Mngt_workmen_Number_in_room;

	@FindBy(how = How.XPATH, using = "((//mat-tab-body//*[contains(@class,'userDetails')])//span[3])")
	public static List<WebElement> WMS_Management_Camp_Mngt_workmen_PartnerID_in_room;

	@FindBy(how = How.XPATH, using = "((//mat-tab-body//*[contains(@class,'userDetails')])//span[4])")
	public static List<WebElement> WMS_Management_Camp_Mngt_workmen_Occupied_in_room;

//Configuaration

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-process')])")
	public static WebElement WMS_Configuration_sidenav;

	@FindBy(how = How.ID, using = "jobCode")
	public static WebElement WMS_Configuration_Jobcode;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']//span")
	public static List<WebElement> WMS_Configuration_Jobcode_DR;

	@FindBy(how = How.XPATH, using = "//span[text()='Go']")
	public static WebElement WMS_Configuration_Jobcode_Go;

	@FindBy(how = How.XPATH, using = "(//div[text()='Regulatory Compliance'])")
	public static WebElement WMS_Configuration_tab_Regulatory_Compliance;

	@FindBy(how = How.XPATH, using = "(//div[text()='PF & ESI Compliance'])")
	public static WebElement WMS_Configuration_tab_PF_ESI_Compliance;

	@FindBy(how = How.XPATH, using = "(//div[text()='Role Mapping'])")
	public static WebElement WMS_Configuration_tab_Role_Mapping;

	@FindBy(how = How.XPATH, using = "(//i[@class='fas fa-trash-o'])[last()]")
	public static WebElement WMS_Configuration_tab_Role_Removing;

	@FindBy(how = How.XPATH, using = "(//div[text()='Calendar'])")
	public static WebElement WMS_Configuration_tab_Calendar;

	@FindBy(how = How.XPATH, using = "(//div[text()='Shift'])")
	public static WebElement WMS_Configuration_tab_Shift;

	@FindBy(how = How.XPATH, using = "((((//app-regualtory-compliance//mat-card)[1]//mat-card-content//div)[2])//mat-form-field//mat-select//span)")
	public static WebElement WMS_Configuration_RC_Authority_LCAuthority;

	@FindBy(how = How.XPATH, using = "(//*[@class='mat-option-text'])")
	public static List<WebElement> WMS_Configuration_RC_Authority_LCAuthority_DR;

	@FindBy(how = How.ID, using = "strEstablishmentID")
	public static WebElement WMS_Configuration_RC_Authority_EstablishmentID;

	@FindBy(how = How.XPATH, using = "(((//app-regualtory-compliance//mat-card)[2]//mat-card-content//div//mat-form-field//mat-select))[1]")
	public static WebElement WMS_Configuration_RC_State;

	@FindBy(how = How.XPATH, using = "(//*[@class='mat-option-text'])")
	public static List<WebElement> WMS_Configuration_RC_State_DR;

	@FindBy(how = How.XPATH, using = "(((//app-regualtory-compliance//mat-card)[2]//mat-card-content//div//mat-form-field//mat-select))[2]")
	public static WebElement WMS_Configuration_RC_Zone;

	@FindBy(how = How.XPATH, using = "(//*[@class='mat-option-text'])")
	public static List<WebElement> WMS_Configuration_RC_Zone_DR;

	@FindBy(how = How.XPATH, using = "(//p[text()='Minimum Wage Applicable for: '])")
	public static WebElement WMS_Configuration_RC_minwage;

	@FindBy(how = How.XPATH, using = "//button[text()='Add']")
	public static WebElement WMS_Configuration_RC_Add_location;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-checkbox-label'])")
	public static List<WebElement> WMS_Configuration_RC_StatutoryAct_List;

	@FindBy(how = How.XPATH, using = "(//input[@type='file'])[1]")
	public static WebElement WMS_Configuration_PM_Sign;

	@FindBy(how = How.XPATH, using = "(//input[@type='file'])[2]")
	public static WebElement WMS_Configuration_PD_Sign;

	@FindBy(how = How.XPATH, using = "(//button[@id='saveAuthorityBtn']//span[1])")
	public static WebElement WMS_Configuration_RC_saveAuthorityBtn;

//Role Mapping 

	@FindBy(how = How.XPATH, using = "(//p[text()=' Time Office'])")
	public static WebElement WMS_Configuration_RM_Timeoffice_sidenav;

	@FindBy(how = How.XPATH, using = "(//p[text()=' IR Manager'])")
	public static WebElement WMS_Configuration_RM_IRManager_sidenav;

	@FindBy(how = How.XPATH, using = "(//p[text()=' Accounts'])")
	public static WebElement WMS_Configuration_RM_Accounts_sidenav;

	@FindBy(how = How.XPATH, using = "(//p[text()=' Skill Approver'])")
	public static WebElement WMS_Configuration_RM_SkillApprover_sidenav;

	@FindBy(how = How.XPATH, using = "(//p[text()=' Paramedics'])")
	public static WebElement WMS_Configuration_RM_Paramedics_sidenav;

	@FindBy(how = How.XPATH, using = "(//p[text()=' Medical Officer'])")
	public static WebElement WMS_Configuration_RM_MedicalOfficer_sidenav;

	@FindBy(how = How.XPATH, using = "(//p[text()=' Safety Officer'])")
	public static WebElement WMS_Configuration_RM_Safety_Officer_sidenav;

	@FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-plus-circle')])")
	public static WebElement WMS_Configuration_btn_addRole;

	@FindBy(how = How.ID, using = "userId")
	public static WebElement WMS_Configuration_addRole_userID;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)[1]")
	public static WebElement WMS_Configuration_addRole_userID_first;

	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text']//span)")
	public static List<WebElement> WMS_Configuration_addRole_userID_DR;

	@FindBy(how = How.XPATH, using = "((//app-addrole//div[2]/div[1]/p)[1])")
	public static WebElement WMS_Configuration_addRole_Name;

	@FindBy(how = How.XPATH, using = "((//app-addrole//div[2]/div[1]/p)[2])")
	public static WebElement WMS_Configuration_addRole_PSNumber;

	@FindBy(how = How.XPATH, using = "((//app-addrole//div[2]/div[1]/p)[3])")
	public static WebElement WMS_Configuration_addRole_Role;

	@FindBy(how = How.XPATH, using = "((//app-addrole//div[2]/div[1]/p)[4])")
	public static WebElement WMS_Configuration_addRole_JOBCODE;

	@FindBy(how = How.XPATH, using = "((//app-addrole//div[3]/div[1]/p)[1])")
	public static WebElement WMS_Configuration_addRole_MobileNumber;

	@FindBy(how = How.XPATH, using = "((//app-addrole//div[3]/div[1]/p)[2])")
	public static WebElement WMS_Configuration_addRole_Email;

	@FindBy(how = How.ID, using = "assignRole")
	public static WebElement WMS_Configuration_addRole_btn_assignRole;

//Calender

	@FindBy(how = How.XPATH, using = "(//button[text()='save'])[1]")
	public static WebElement WMS_Configuration_calender_FN_Holidays_Save;

	@FindBy(how = How.XPATH, using = "(//button[text()='save'])[2]")
	public static WebElement WMS_Configuration_calender_Regular_Holidays_Save;

	@FindBy(how = How.XPATH, using = "(//app-calendar-master//mat-select)[1]")
	public static WebElement WMS_Configuration_calender_Year_master;

	@FindBy(how = How.XPATH, using = "//span[@class='mat-option-text']")
	public static List<WebElement> WMS_Configuration_calender_Year_master_DR;

	@FindBy(how = How.XPATH, using = "//span[@title='Toggle calendar']//span[1]")
	public static WebElement WMS_Configuration_calender_FN_Holidays_Calender;

	@FindBy(how = How.XPATH, using = "(//kendo-calendar-header[@class='k-calendar-header']//span)[1]")
	public static WebElement WMS_Configuration_calender_header;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[1]/tbody/tr/td)[1])")
	public static WebElement WMS_calender_FesORNat_Holidays_Record;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[2]/tbody/tr/td)[1])")
	public static WebElement WMS_calender_Regular_Holidays_Record;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[1]/tbody/tr/td[1]))")
	public static List<WebElement> WMS_calender_FesORNat_Holidays_Date;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[1]/tbody/tr/td[2]))")
	public static List<WebElement> WMS_calender_FesORNat_Holidays_Day;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[1]/tbody/tr/td[3]))")
	public static List<WebElement> WMS_calender_FesORNat_Holidays_Type;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[1]/tbody/tr/td[4]))")
	public static List<WebElement> WMS_calender_FesORNat_Holidays_Desc;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[2]/tbody/tr/td[1]))")
	public static List<WebElement> WMS_calender_Regular_Holidays_Date;

	@FindBy(how = How.XPATH, using = "(((//kendo-grid-list/div/div[1]/table)[2]/tbody/tr/td[2]))")
	public static List<WebElement> WMS_calender_Regular_Holidays_Day;

	@FindBy(how = How.XPATH, using = "(//*[@id='footer']//p//b)[1]")
	public static WebElement WMS_calender_Total_Regular_Holidays;

	@FindBy(how = How.XPATH, using = "(//*[@id='footer']//p//b)[2]")
	public static WebElement WMS_calender_Total_FesORNat_Holidays;

	@FindBy(how = How.XPATH, using = "(//*[@id='footer']//p//b)[3]")
	public static WebElement WMS_calender_Total_Holidays;

	@FindBy(how = How.XPATH, using = "//span[@title='Toggle calendar']//span[1]")
	public static WebElement WMS_calender_FesORNat_Holidays_calender;

	@FindBy(how = How.XPATH, using = "(//*[@class='k-dateinput-wrap'])")
	public static WebElement WMS_calender_FesORNat_Holidays_calender_date_Input;

	@FindBy(how = How.XPATH, using = "(//*[@role='combobox']//span)[3]")
	public static WebElement WMS_calender_FesORNat_Holidays_Type_Input;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)")
	public static List<WebElement> WMS_calender_FesORNat_Holidays_Type_Input_DR;

	@FindBy(how = How.XPATH, using = "(//mat-form-field//input)[2]")
	public static WebElement WMS_calender_FesORNat_Holidays_desc;

	@FindBy(how = How.XPATH, using = "(//*[@id='footer']//button)")
	public static WebElement WMS_calender_submit;

	@FindBy(how = How.XPATH, using = "(//*[@role='combobox']//span)[4]")
	public static WebElement WMS_calender_Regular_Holidays_Type_Input;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)")
	public static List<WebElement> WMS_calender_Regular_Holidays_Type_Input_DR;

	@FindBy(how = How.XPATH, using = "(//*[@role='combobox']//span)[last()]")
	public static WebElement WMS_calender_Regular_Holidays_Day_Input;

	@FindBy(how = How.XPATH, using = "(//mat-option//span)")
	public static List<WebElement> WMS_calender_Regular_Holidays_Day_Input_DR;

	@FindBy(how = How.XPATH, using = "(//kendo-grid)[1]//i[@title='delete']")
	public static List<WebElement> WMS_calender_FesORNat_Holidays_delete;

	@FindBy(how = How.XPATH, using = "(//kendo-grid)[2]//i[@title='delete']")
	public static List<WebElement> WMS_calender_Regular_Holidays_delete;

//Shift

	@FindBy(how = How.XPATH, using = "//span[@title='Open Shift Master']")
	public static WebElement WMS_config_shift_openMaster;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td)[1]")
	public static WebElement WMS_config_shift_allelement;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td[1])")
	public static List<WebElement> WMS_config_shift_shift_code;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td[2])")
	public static List<WebElement> WMS_config_shift_shift_Desc;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td[3])")
	public static List<WebElement> WMS_config_shift_shift_Hour_from;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td[4])")
	public static List<WebElement> WMS_config_shift_shift_Hour_To;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td[5])")
	public static List<WebElement> WMS_config_shift_Break_Hour_from;

	@FindBy(how = How.XPATH, using = "(//kendo-grid//kendo-grid-list//table//tbody/tr/td[6])")
	public static List<WebElement> WMS_config_shift_Break_Hour_To;

	@FindBy(how = How.XPATH, using = "//button[@title='Add Shift']")
	public static WebElement WMS_config_shift_master_saveShift;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[1])")
	public static WebElement WMS_config_shift_master_allelement;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[2])")
	public static List<WebElement> WMS_config_shift_Master_shift_code;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[3])")
	public static List<WebElement> WMS_config_shift_Master_shift_Desc;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[4])")
	public static List<WebElement> WMS_config_shift_Master_shift_Hour_from;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[5])")
	public static List<WebElement> WMS_config_shift_Master_shift_Hour_To;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[6])")
	public static List<WebElement> WMS_config_shift_Master_Break_Hour_from;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[7])")
	public static List<WebElement> WMS_config_shift_Master_Break_Hour_To;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid//kendo-grid-list//table//tbody//tr//td[8])")
	public static List<WebElement> WMS_config_shift_Master_Status;

	@FindBy(how = How.XPATH, using = "(//app-shift//i[@title='Close'])")
	public static WebElement WMS_config_shift_Master_closeShiftMaster;

	@FindBy(how = How.XPATH, using = "//i[@title='addNewShift']")
	public static WebElement WMS_config_shift_Master_addNewShift;

	@FindBy(how = How.XPATH, using = "(//tr[1]//td[@role='gridcell']//input)[1]")
	public static WebElement WMS_config_shift_Master_shiftcode_input;

	@FindBy(how = How.XPATH, using = "(//tr[1]//td[@role='gridcell']//input)[2]")
	public static WebElement WMS_config_shift_Master_shiftDesc_input;

	@FindBy(how = How.XPATH, using = "(//tr[1]//td[@role='gridcell']//input)[3]")
	public static WebElement WMS_config_shift_Master_shift_Hour_Fr_input;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-clock'])[1]")
	public static WebElement WMS_config_shift_Master_shift_Hour_Fr_timer;

	@FindBy(how = How.XPATH, using = "(//tr[1]//td[@role='gridcell']//input)[4]")
	public static WebElement WMS_config_shift_Master_shift_Hour_To_input;

	@FindBy(how = How.XPATH, using = "(//tr[1]//i[@title='Save'])")
	public static WebElement WMS_config_shift_Master_shift_Details_Save;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-clock'])[2]")
	public static WebElement WMS_config_shift_Master_shift_Hour_To_timer;

	@FindBy(how = How.XPATH, using = "(//tr[1]//td[@role='gridcell']//input)[5]")
	public static WebElement WMS_config_shift_Master_Break_hr_Fr_input;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-clock'])[3]")
	public static WebElement WMS_config_shift_Master_Break_Hour_Fr_timer;

	@FindBy(how = How.XPATH, using = "(//tr[1]//td[@role='gridcell']//input)[6]")
	public static WebElement WMS_config_shift_Master_Break_hr_To_input;

	@FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-clock'])[4]")
	public static WebElement WMS_config_shift_Master_Break_Hour_To_timer;

	@FindBy(how = How.XPATH, using = "((//kendo-timelist)[1]//li[@class='k-item ng-star-inserted']//span)")
	public static List<WebElement> WMS_config_shift_Master_timer_Hour;

	@FindBy(how = How.XPATH, using = "((//kendo-timelist)[2]//li[@class='k-item ng-star-inserted']//span)")
	public static List<WebElement> WMS_config_shift_Master_timer_minute;

	@FindBy(how = How.XPATH, using = "//button[@title='Set time']")
	public static WebElement WMS_config_shift_Master_timer_setTime;

	@FindBy(how = How.XPATH, using = "(//app-shift//span[@title='Show Filter'])")
	public static WebElement WMS_config_shift_Master_Filter;

	@FindBy(how = How.XPATH, using = "//span[@title='Hide Filter']")
	public static WebElement WMS_config_shift_Master_HideFilter;

	@FindBy(how = How.XPATH, using = "((//app-shift//*[@role='listbox'])[7]//span)[2]")
	public static WebElement WMS_config_shift_Master_Filter_Status;

	@FindBy(how = How.XPATH, using = "((//app-shift//*[@role='listbox'])[7]//span)[1]")
	public static WebElement WMS_config_shift_Master_Filter_Current_Status;

	@FindBy(how = How.XPATH, using = "(//ul[@role='listbox']//li)")
	public static List<WebElement> WMS_config_shift_Master_Filter_Status_DR;

	@FindBy(how = How.XPATH, using = "(//app-shift//*[@aria-label='Select All Rows'])")
	public static WebElement WMS_config_shift_Master_select_all_Shift;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[1]//*[@type='checkbox'])")
	public static List<WebElement> WMS_config_shift_Master_Shift_List;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[1]//*[@type='checkbox'])[1]")
	public static WebElement WMS_config_shift_Master_Shift_First;

	@FindBy(how = How.XPATH, using = "//button[text()='Save Shift']")
	public static WebElement WMS_config_shift_Master_saveShift;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[2]")
	public static WebElement WMS_config_shift_Master_First_Value_Shift_Code;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[3]")
	public static WebElement WMS_config_shift_Master_First_Value_Shift_Desc;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[4]")
	public static WebElement WMS_config_shift_Master_First_Value_Shift_Hr_Fr;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[5]")
	public static WebElement WMS_config_shift_Master_First_Value_Shift_Hr_To;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[6]")
	public static WebElement WMS_config_shift_Master_First_Value_Break_Hr_Fr;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[7]")
	public static WebElement WMS_config_shift_Master_First_Value_Break_Hr_To;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid-filter-wrapper-cell//input)[1]")
	public static WebElement WMS_config_shift_Master_Filter_input_Shift_Code;

	@FindBy(how = How.XPATH, using = "(//app-shift//kendo-grid-filter-wrapper-cell//input)[2]")
	public static WebElement WMS_config_shift_Master_Filter_input_Shift_Desc;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[4]")
	public static WebElement WMS_config_shift_Master_Filter_input_Shift_Hr_Fr;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[5]")
	public static WebElement WMS_config_shift_Master_Filter_input_Shift_Hr_To;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[6]")
	public static WebElement WMS_config_shift_Master_Filter_input_Break_Hr_Fr;

	@FindBy(how = How.XPATH, using = "(//app-shift//td[@role='gridcell'])[7]")
	public static WebElement WMS_config_shift_Master_Filter_input_Break_Hr_To;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[1]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Shift_Code;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[2]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Shift_Desc;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[3]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Shift_Hr_Fr;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[4]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Shift_Hr_To;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[5]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Break_Hr_Fr;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[6]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Break_Hr_To;

	@FindBy(how = How.XPATH, using = "(//button[@title='Clear']//span)[6]")
	public static WebElement WMS_config_shift_Master_Clear_Filter_Status;

	@FindBy(how = How.XPATH, using = "(//app-shift//i[@title='Delete'])")
	public static List<WebElement> WMS_config_shift_Master_delete_shift_allEle;

	@FindBy(how = How.XPATH, using = "(//app-shift//i[@title='Delete'])[last()]")
	public static WebElement WMS_config_shift_Master_delete_shift_last;

	@FindBy(how = How.XPATH, using = "(//app-shift//i[@title='Edit'])[1]")
	public static WebElement WMS_config_shift_Master_Edit_shift_First;

	@FindBy(how = How.XPATH, using = "(//app-shift//*[contains(@class, 'mat-slide-toggle-bar')])")
	public static List<WebElement> WMS_config_shift_Master_Status_all_ele;

	@FindBy(how = How.XPATH, using = "(//app-shift//*[contains(@class, 'mat-slide-toggle-bar')])[last()]")
	public static WebElement WMS_config_shift_Master_Status_last;

	@FindBy(how = How.XPATH, using = "(//app-jobconfiguration//span[@title='Delete Shift'])")
	public static List<WebElement> WMS_config_Job_shift_delete_allele;

	@FindBy(how = How.XPATH, using = "(//app-jobconfiguration//span[@title='Delete Shift'])[1]")
	public static WebElement WMS_config_Job_shift_delete_first;

// Wage

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-disbursement')]")
	public static WebElement WMS_MainWage_sidenav;

	@FindBy(how = How.XPATH, using="//button[text()=' Get Data']")
	public static WebElement WMS_MainWage_getdata;
	
	@FindBy(how = How.XPATH, using="(//app-wage-master//mat-select)[1]")
	public static WebElement WMS_MainWage_Select_State;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])")
	public static List<WebElement> WMS_MainWage_Select_State_Dr;
	
	@FindBy(how = How.XPATH, using="(//app-wage-master//mat-select)[2]")
	public static WebElement WMS_MainWage_Select_SheduleofEmployement;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='mat-option-text'])")
	public static List<WebElement> WMS_MainWage_Select_SheduleofEmployement_dr;
}
