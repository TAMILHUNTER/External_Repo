package object_repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Skill_Analysis_Objects {

		//**Skill Analysis**
	
	@FindBy(how = How.XPATH, using="//span[text()='Skill Analysis']")
			public static WebElement Dashboard_Skill_Analysis;
			
			@FindBy(how = How.XPATH, using="(//mat-select//div//span)[1]")
			public static WebElement Skill_Analysis_searchBy;
			
			@FindBy(how = How.XPATH, using="(//app-induction//mat-card/mat-card-content/p[2])[1]")
			public static WebElement Dashboard_Skill_Analysis_Count;
				
			@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']")
			public  static List <WebElement> Skill_Analysis_searchBy_DR;
						
			@FindBy(how = How.XPATH, using="//span[text()=' Workmen Name ']")
			public static WebElement Skill_Analysis_searchBy_ID;
			
			@FindBy(how = How.XPATH, using="//span[text()=' Skill ']")
			public static WebElement Skill_Analysis_searchBy_Skill;
			
			@FindBy(how = How.XPATH, using="//span[text()=' Partner Name ']")
			public static WebElement Skill_Analysis_searchBy_Partner_Name;
			
			@FindBy(how = How.XPATH, using="//button[text()='Load More']")
			public static WebElement Skill_Analysis_loadMore;
			
			@FindBy(how = How.XPATH, using="(//mat-form-field//div//input)[1]")
			public static WebElement Skill_Analysis_search;
			
			@FindBy(how = How.XPATH, using="(//*[@id='searchBtn'])")
			public static WebElement Skill_Analysis_search_btn;
			
			@FindBy(how = How.XPATH, using="(//*[@id='clearBtn'])")
			public static WebElement Skill_Analysis_Clear_btn;
			
			@FindBy(how = How.XPATH, using="(//mat-form-field//input)[2]")
			public static WebElement GatePass_search_input;
			
			@FindBy(how = How.XPATH, using="(//div[@class='cardDiv'])[1]")
			public static WebElement Skill_Analysis_First_card;
			
			@FindBy(how = How.XPATH, using="(//div[@class='cardDiv'])[2]")
			public static WebElement Skill_Analysis_secound_card;
			
			@FindBy(how = How.XPATH, using="(//div[@class='cardDiv'])")
			public static List <WebElement> Skill_Analysis_card;		
					
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])//div[2]//p[1]")
			public static List <WebElement> Skill_Analysis_card_WorkmanName;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])//div[2]//p[3]")
			public static List <WebElement> Skill_Analysis_card_WorkmanID;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])//div[2]//p[2]")
			public static List <WebElement> Skill_Analysis_card_Workman_Skill;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])//div[2]//p[4]")
			public static List <WebElement> Skill_Analysis_card_Workman_Partner;
			
			@FindBy(how = How.XPATH, using="(//app-profile-card)")
			public static WebElement Skill_Analysis_Profile_card;
			
			@FindBy(how = How.XPATH, using="(//div[@class='cardDiv'])")
			public static List <WebElement> Skill_Analysis_Workman_Profile_All_Cards;
			
			@FindBy(how = How.XPATH, using="//i[contains(@class,'fas fa-eye')][last()]")
			public static WebElement Skill_Analysis_Workman_Profile_Last_Eye_Card;
			
			@FindBy(how = How.XPATH, using="(//div[@class='cardDiv'])[last()]")
			public static WebElement Skill_Analysis_Workman_Profile_Last_Card;
			
			@FindBy(how = How.XPATH, using="(//div[@class='row cardRow'])[last()]")
			public static WebElement Skill_Analysis_Workman_Profile_Last_Card_Para;
			
			@FindBy(how = How.XPATH, using="(//div[@class='cardDiv'])")
			public static List <WebElement> Skill_Analysis_Workman_Profile_all_Card;
			
			@FindBy(how = How.XPATH, using="//i[contains(@class,'fas fa-eye')][last()]")
			public static WebElement Skill_Analysis_Workman_Profile_Eye;
			
			@FindBy(how = How.XPATH, using="(//i[contains(@class,'fas fa-eye')])[last()]")
			public static WebElement GatePass_Workman_Profile_Eye;
			
			@FindBy(how = How.XPATH, using="//i[contains(@class,'fas fa-eye')][1]")
			public static WebElement  Skill_Analysis_Workman_Profile_All_Crads_Eye;
			

//Workman Profile
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Close;
			
			@FindBy(how = How.XPATH, using="(//app-skill-test-history//i)[1]")
			public static WebElement Skill_Analysis_SkillTestHistory_Close;
			
			@FindBy(how = How.XPATH, using="(//app-ehs-training-view//i)[1]")
			public static WebElement EHS_TrainingHistory_Close;
			
			@FindBy(how = How.XPATH, using="//p[text()='Basic Details ']")
			public static WebElement Skill_Analysis_Workman_Profile_Titile_BasicDetails;
			
			@FindBy(how = How.XPATH, using="//p[text()='Skill Analysis ']")
			public static WebElement Skill_Analysis_Workman_Profile_Titile_SkillAnalysis;
			
			@FindBy(how = How.XPATH, using="//p[text()='Medical Test']")
			public static WebElement Skill_Analysis_Workman_Profile_Titile_MedicalTest;
			
			@FindBy(how = How.XPATH, using="//p[text()='EHS']")
			public static WebElement Skill_Analysis_Workman_Profile_Titile_EHS;
			
			@FindBy(how = How.XPATH, using="//p[text()='Wage']")
			public static WebElement Skill_Analysis_Workman_Profile_Titile_wage;
			
			@FindBy(how = How.XPATH, using="//p[text()='Personal']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_personal;
			
			@FindBy(how = How.XPATH, using="//p[text()='Partner']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_partner;
			
			@FindBy(how = How.XPATH, using="//p[text()='Communication Details']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_communicationDetails;
			
			@FindBy(how = How.XPATH, using="//p[text()='Skill']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_skill;
			
			@FindBy(how = How.XPATH, using="//p[text()='Deployment']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_deployment;
			
			@FindBy(how = How.XPATH, using="//p[text()='Education & Training']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_educationTraining;
			
			@FindBy(how = How.XPATH, using="//p[text()='Experience']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_experience;
			
			@FindBy(how = How.XPATH, using="//p[text()='Statutory Details']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_statutoryDetails;
			
			@FindBy(how = How.XPATH, using="//p[text()='PF Nominee Details']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_pFNomineeDetails;
			
			@FindBy(how = How.XPATH, using="//p[text()='Bank Details']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Header_bankDetails;
			
			@FindBy(how = How.XPATH, using="((//app-workman-profile//div[2])[1]//div[2]//p[3])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_WorkmanID;
			
			@FindBy(how = How.XPATH, using="(//app-personal-detail-view//p)[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_WorkmanName;
			
			@FindBy(how = How.XPATH, using="(//app-personal-detail-view//p)[5]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_WorkmanFatherName;
			
			@FindBy(how = How.XPATH, using="//p[text()='Date Of Birth']/following-sibling::p")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_DOB;
			
			@FindBy(how = How.XPATH, using="((//app-personal-detail-view)//div[2]//div//div//div//div//div)[4]//span[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_DOB_Year;
			
			@FindBy(how = How.XPATH, using="((//app-personal-detail-view)//div[2]//div//div//div//div//div)[4]//span[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_DOB_Months;
			
			@FindBy(how = How.XPATH, using="//p[text()='Gender']/following-sibling::p")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Gender;
			
			@FindBy(how = How.XPATH, using="//p[text()='Blood Group']/following-sibling::p")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_BloodGroup;
			
			@FindBy(how = How.XPATH, using="//input[@value='Languages Known']")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_languagesKnown;
			
			@FindBy(how = How.XPATH, using="(//app-language-knownpopup//i)[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_languagesKnown_close;
			
			@FindBy(how = How.XPATH, using="//p[text()='Marital Status']/following-sibling::p")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_MaritalStatus;
			
			@FindBy(how = How.XPATH, using="//p[text()='Father / Spouse Name']/following-sibling::p")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_SpouseName;
			
			@FindBy(how = How.XPATH, using="(//app-personal-detail-view//div//p)[18]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_NoOfChildren;
			
			@FindBy(how = How.XPATH, using="(//mat-checkbox//span[@class='mat-checkbox-inner-container'])")
			public static List <WebElement>  Skill_Analysis_Workman_Profile_Checkbox_Count;
			
			
			@FindBy(how = How.XPATH, using="(//mat-checkbox//span[@class='mat-checkbox-inner-container'])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3;
			
			@FindBy(how = How.XPATH, using="(//mat-checkbox//span[@class='mat-checkbox-inner-container'])[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3;
			
			@FindBy(how = How.XPATH, using="(//mat-checkbox//span[@class='mat-checkbox-inner-container'])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2;
			
			@FindBy(how = How.XPATH, using="(//mat-checkbox//span[@class='mat-checkbox-inner-container'])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//div[2])[16]//p[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_CstiNaps_Number;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[1])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language1;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[1])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language2;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[1])[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language3;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[1])[4]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language4;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[2])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language1_Read;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[2])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language2_Read;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[2])[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language3_Read;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[2])[4]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language4_Read;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[3])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language1_Write;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[3])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language2_Write;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[3])[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language3_Write;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[3])[4]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language4_Write;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[4])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language1_Speak;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[4])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language2_Speak;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[4])[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language3_Speak;
			
			@FindBy(how = How.XPATH, using="((//app-language-knownpopup)//td[4])[4]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Language4_Speak;
			
			@FindBy(how = How.XPATH, using="((//app-partner-detail-view)//div[2]//p)[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Partner_Name;
			
			@FindBy(how = How.XPATH, using="((//app-partner-detail-view)//div[2]//p)[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Partner_Address;
			
			@FindBy(how = How.XPATH, using="((//app-partner-detail-view)//div[2]//p)[4]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Partner_ContactNumber;
			
			@FindBy(how = How.XPATH, using="((//app-partner-detail-view)//div[2]//p)[5]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Partner_MailID;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[3]//p[1])")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[2])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_MobileNumber;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[2])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Address;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[3])[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Village;
								
			@FindBy(how = How.XPATH, using="(((//app-communication-details-view)//p[4]))[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_District;
			
			@FindBy(how = How.XPATH, using="(((//app-communication-details-view)//p[5]))[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_State;
			
			@FindBy(how = How.XPATH, using="(((//app-communication-details-view)//p[6]))[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Pincode;
			
			@FindBy(how = How.XPATH, using="(((//app-communication-details-view)//p[7]))[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Pincode;
			
			@FindBy(how = How.XPATH, using="(((//app-communication-details-view)//p[6]))[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Pincode;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[2])[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Address;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[3])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Village;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[4])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_District;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[5])[2]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_State;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p[2])[4]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_Name;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p)[17]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_Relation;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p)[18]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_MobileNumber;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p)[19]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_Address;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p)[20]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_Village;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p)[21]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_District;
			
			@FindBy(how = How.XPATH, using="((//app-communication-details-view)//div[2]//p)[22]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Communication_EC_State;
					
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//p)[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Skill_Head;
			
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//p)[10]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Deployment_Head;
			
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//p)[3]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Skill_Category;
			
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//p)[5]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Skill_Group;
			
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//p)[7]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Skill_Description;
			
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//p)[9]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Skill_Type;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//p)[1]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Education_Head;
			
			@FindBy(how = How.XPATH, using="(//app-skill-and-deployment-view//div)[15]")
			public static WebElement Skill_Analysis_Workman_Profile_Basic_Deployment;
			
			@FindBy(how = How.XPATH, using="(//mat-sidenav-content//div/div[1]//div/p[1])[1]")
			public static WebElement Skill_Analysis_Profile_WorkmenName;
			
			@FindBy(how = How.XPATH, using="(//mat-sidenav-content//div/div[1]//div/p[2])[1]")
			public static WebElement Skill_Analysis_Profile_WorkmenSkill;
			
			@FindBy(how = How.XPATH, using="(//mat-sidenav-content//div/div[1]//div/p[3])[1]")
			public static WebElement Skill_Analysis_Profile_WorkmenNumber;
			
			@FindBy(how = How.XPATH, using="(//mat-sidenav-content//div/div[1]//div/p[4])[1]")
			public static WebElement Skill_Analysis_Profile_Partner;
			
			@FindBy(how = How.XPATH, using="(//mat-sidenav-content//div/div[1]//div/p[5])[1]")
			public static WebElement Skill_Analysis_Profile_Partner_EHS;
			
			
			
			@FindBy(how = How.XPATH, using="((//div[@class='cardDiv'])[last()]//p)[1]")
			public static WebElement GatePass_Profile_WorkmenName_lastCard;
			
			@FindBy(how = How.XPATH, using="((//div[@class='cardDiv'])[last()]//p)[2]")
			public static WebElement GatePass_Profile_WorkmenSkill_lastCard;
			
			@FindBy(how = How.XPATH, using="((//div[@class='cardDiv'])[last()]//p)[3]")
			public static WebElement GatePass_Profile_WorkmenNumber_lastCard;
			
			@FindBy(how = How.XPATH, using="((//div[@class='cardDiv'])[last()]//p)[4]")
			public static WebElement GatePass_Profile_Partner_lastCard;
			

			
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//div//i)[1]")
			public static WebElement Workmen_Profile_Close;
			
			@FindBy(how = How.XPATH, using="(//app-communication-details-view//div//p)[1]") 
			public  static WebElement Profile_Communication_Head;
			
			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[2]") 
			public  static WebElement Profile_Partner_name;
			
			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[3]") 
			public  static WebElement Profile_Partner_Workpermit;
		
			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[4]") 
			public  static WebElement Profile_Partner_Address;
			
			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[5]") 
			public  static WebElement Profile_Partner_PhoneNo;
			
			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[6]") 
			public  static WebElement Profile_Partner_MailID;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[1]") 
			public  static WebElement Profile_Education_Qualification;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[2]") 
			public  static WebElement Profile_Education_Branch;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[3]") 
			public  static WebElement Profile_Education_Discipline;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[4]") 
			public  static WebElement Profile_Education_SchoolORCollege;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[5]") 
			public  static WebElement Profile_Education_BoardORuniversity;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[6]") 
			public  static WebElement Profile_Education_YearOfPassing;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//div)[13]") 
			public  static WebElement Profile_Experience_Head;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//br)[1]") 
			public  static WebElement Profile_Statutory_Head;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[7]")
			public  static WebElement Profile_Experience_Org_Name;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[8]") 
			public  static WebElement Profile_Experience_Project_location;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[9]") 
			public  static WebElement Profile_Experience_ProjectCodeOrName;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[10]") 
			public  static WebElement Profile_Experience_SkillCategory;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[11]") 
			public  static WebElement Profile_Experience_SkillGroup;
			
			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[12]") 
			public  static WebElement Profile_Experience_SkillDesc;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[14]") 
			public  static WebElement Profile_PF_Nominee_Details_Head;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[3]") 
			public  static WebElement Profile_Statutory_Aadhar;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[5]") 
			public  static WebElement Profile_Statutory_DrivingLicense;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[7]") 
			public  static WebElement Profile_Statutory_PanCard;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[9]") 
			public  static WebElement Profile_Statutory_PFNo;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[11]") 
			public  static WebElement Profile_Statutory_UANNo;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[13]") 
			public  static WebElement Profile_Statutory_ESINo;
			
			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[1]") 
			public  static WebElement Profile_Bank_Head;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//td)[1]") 
			public  static WebElement Profile_PF_nominee_Name;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//td)[2]") 
			public  static WebElement Profile_PF_nominee_Relationship;
			
			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//td)[3]") 
			public  static WebElement Profile_PF_nominee_Allocation_Percentage;
			
			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[6]") 
			public  static WebElement Profile_bank_end;
			
			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[3]") 
			public  static WebElement Profile_bank_Account_Name;
			
			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[5]") 
			public  static WebElement Profile_bank_Account_no;
			
			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[6]") 
			public  static WebElement Profile_bank_IFSC_Or_IBAN_or_SWIFT_Code;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[4]") 
			public  static WebElement Profile_Skill_Analysis;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[1]") 
			public  static WebElement Profile_Skill_Description;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[2]") 
			public  static WebElement Profile_Skill_Project_Description;

			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[3]") 
			public  static WebElement Profile_Skill_SkillType;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[4]") 
			public  static WebElement Profile_Skill_Percentage;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[5]") 
			public  static WebElement Profile_Skill_TestTakenOn;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[6]") 
			public  static WebElement Profile_Skill_Status;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[7]") 
			public  static WebElement Profile_Skill_RetestDate;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[5]") 
			public  static WebElement Profile_Medical_Test;
			
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[6]") 
			public  static WebElement Profile_EHS;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[7]") 
			public  static WebElement Profile_Wage;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[17]") 
			public  static WebElement Profile_Medical_NextDue;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[19]") 
			public  static WebElement Profile_Medical_Fitness_Status;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[21]") 
			public  static WebElement Profile_Medical_Skin_Temperature;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[23]") 
			public  static WebElement Profile_Medical_colorofEyes;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[25]") 
			public  static WebElement Profile_Medical_Complexion;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[27]") 
			public  static WebElement Profile_Medical_Heart_Rate;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[29]") 
			public  static WebElement Profile_Medical_Diabetics;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[31]") 
			public  static WebElement Profile_Medical_SPO2;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[33]") 
			public  static WebElement Profile_Medical_Systolic;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[35]") 
			public  static WebElement Profile_Medical_Diastolic;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[37]") 
			public  static WebElement Profile_Medical_Height;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[39]") 
			public  static WebElement Profile_Medical_Weight;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[41]") 
			public  static WebElement Profile_Medical_BMI;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[43]") 
			public  static WebElement Profile_Medical_Identification_Marks_1;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[45]") 
			public  static WebElement Profile_Medical_Identification_Marks_2;
			
			
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[47]") 
			public  static WebElement Profile_Medical_Skin_Temperature2;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[49]") 
			public  static WebElement Profile_MedicalTest_colorofEyes;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[51]") 
			public  static WebElement Profile_MedicalTest_complextion;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[53]") 
			public  static WebElement Profile_Medical_BP;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[55]") 
			public  static WebElement Profile_Medical_Varicose;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[57]") 
			public  static WebElement Profile_Medical_Seizure;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[59]") 
			public  static WebElement Profile_Medical_Vertigo;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[61]") 
			public  static WebElement Profile_Medical_Acrophobia;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[63]") 
			public  static WebElement Profile_Medical_Diabetes;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[65]") 
			public  static WebElement Profile_Medical_Stroke;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[67]") 
			public  static WebElement Profile_Medical_Heart_Disease;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[69]") 
			public  static WebElement Profile_Medical_Major_Illness_or_Surgery;
						
			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[71]") 
			public  static WebElement Profile_Medical_Respiratory_Diseases;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[1]") 
			public  static WebElement Profile_EHS_Skill_desc;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[2]") 
			public  static WebElement Profile_EHS_job;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[3]") 
			public  static WebElement Profile_EHS_TrainingDate;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[1]") 
			public  static WebElement Profile_wage_Desc1;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[4]") 
			public  static WebElement Profile_wage_Desc2;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[2]") 
			public  static WebElement Profile_wage_Amount1;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[5]") 
			public  static WebElement Profile_wage_Amount2;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[3]") 
			public  static WebElement Profile_wage_type1;
			
			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[6]") 
			public  static WebElement Profile_wage_type2;
			
			@FindBy(how = How.XPATH, using="(//label[@class='mat-checkbox-layout']//div)[1]")
			public  static WebElement Skill_Analysis_selectAllWorkmen;
			
			@FindBy(how = How.XPATH, using="//button[text()='Go Next']")
			public  static WebElement Skill_Analysis_Go_Next;
			
			@FindBy(how = How.XPATH, using="(//app-skill-analysis-data//td)[1]")
			public  static WebElement Skill_Analysis_table_workmenName;
			
			@FindBy(how = How.XPATH, using="(//app-skill-analysis-data//td)[2]")
			public  static WebElement Skill_Analysis_table_workmenNumber;
			
			@FindBy(how = How.XPATH, using="(//app-skill-analysis-data//td)[3]//mat-form-field//input")
			public  static WebElement Skill_Analysis_table_Skill_Desc;
			
			@FindBy(how = How.XPATH, using="(//input[@ng-reflect-placeholder='Questions'])")
			public  static List <WebElement> Skill_Analysis_TotalQuestiones_allElements;
			
			@FindBy(how = How.XPATH, using="(//input[@placeholder='Answers'])")
			public  static List <WebElement> Skill_Analysis_CorrectAnswers_allElements;
						
			@FindBy(how = How.XPATH, using="((//app-skill-analysis-data//mat-form-field//input)[2])")
			public  static WebElement Skill_Analysis_TotalQuestiones1;
			
			@FindBy(how = How.XPATH, using="(//app-skill-analysis-data//mat-form-field//input)[2]")
			public  static WebElement Skill_Analysis_TotalQuestiones2;
			
			@FindBy(how = How.XPATH, using="(//app-skill-analysis-data//mat-form-field//input)[3]")
			public  static List <WebElement> Skill_Analysis_CorrectAnswers_AllElements;
			
			@FindBy(how = How.XPATH, using="(//mat-form-field//input)[3]")
			public  static WebElement Skill_Analysis_CorrectAnswers1;
			
			@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted']//td)[2]")
			public  static WebElement Skill_Analysis_CorrectAnswers1_workmenID;
			
			@FindBy(how = How.XPATH, using="(//tr[@class='ng-star-inserted']//td)[12]")
			public  static WebElement Skill_Analysis_CorrectAnswers2_workmenID;
			
			@FindBy(how = How.XPATH, using="(//input[@placeholder='Answers'])[2]")
			public  static WebElement Skill_Analysis_CorrectAnswers2;
			
			@FindBy(how = How.XPATH, using="(//input[@placeholder='Answers'])")
			public  static List <WebElement> Skill_Analysis_Answers_AllElemets;
			
			@FindBy(how = How.XPATH, using="(//app-skill-analysis-data//td)[6]")
			public  static WebElement Skill_Analysis_Percentage;
			
			@FindBy(how = How.XPATH, using="(//input[@placeholder='Answers'])")
			public  static List <WebElement> Skill_Analysis_Percentage_AllElemets;
			
			@FindBy(how = How.XPATH, using="(//span[@class='mat-button-toggle-label-content'])[1]")
			public  static WebElement Skill_Analysis_Accept;
			
			@FindBy(how = How.XPATH, using="(//span[@class='mat-button-toggle-label-content'])[2]")
			public  static WebElement Skill_Analysis_Reject;
			
			@FindBy(how = How.ID, using="skillDescription")
			public  static WebElement Skill_Analysis_skillDescription;
			
			@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
			public  static List <WebElement> Skill_Analysis_skillDescription_dr;
			
			@FindBy(how = How.ID, using="skillType")
			public  static WebElement Skill_Analysis_skillType;
			
			@FindBy(how = How.XPATH, using="//span[@class='mat-option-text']//span")
			public  static List <WebElement> Skill_Analysis_skillType_dr;
			
			@FindBy(how = How.XPATH, using="//button[text()='Submit']")
			public  static WebElement Skill_Analysis_submit;
			
			@FindBy(how = How.XPATH, using="//span[@title='Toggle calendar']//span[1]")
			public  static WebElement Skill_Analysis_RetestDate_calender;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-today']//span[1])//following::span[15]")
			public  static WebElement Skill_Analysis_Select_RetestDate;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-today']//span[1])//preceding::span[5]")
			public  static WebElement Skill_Analysis_Select_RetestDate_Past;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-today']//span[1])//following::span[15]")
			public  static WebElement Paramedics_MedicalTestDate;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-today k-week']//span[1])//following::span[15]")
			public  static WebElement Paramedics_MedicalTestDate_Week;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-today']//span[1])//following::span[15]")
			public static List <WebElement> Paramedics_MedicalTestDate_Size;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-today k-week']//span[1])//following::span[15]")
			public static List <WebElement> Paramedics_MedicalTestDate_Week_Size;
			
			@FindBy(how = How.XPATH, using="//td[@ng-reflect-ng-class='k-state-focused k-today']//span[1]")
			public  static WebElement Skill_Analysis_DateSelected;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-ng-class='k-state-focused k-state-select']//span[1])//following::span[5]")
			public  static WebElement Skill_Analysis_DateSelected_after5;
			
			@FindBy(how = How.XPATH, using="//span[text()=' TODAY ']")
			public  static WebElement Skill_Analysis_Select_RetestDate_today;
			
			@FindBy(how = How.XPATH, using="//span[@title='Skill History']//i[1]")
			public  static WebElement Skill_Analysis_skillTestHistory;
			
			@FindBy(how = How.XPATH, using="//eipdocumentupload[@title='Attachment']//i[1]")
			public  static WebElement Skill_Analysis_UploadDocument;
			
			@FindBy(how = How.XPATH, using="//span[@title='Print Profile']//i[1]")
			public  static WebElement Skill_Analysis_Profile_table;
			
			@FindBy(how = How.XPATH, using="//span[@title='Remove']//i[1]")
			public  static WebElement Skill_Analysis_Remove;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='0'])") 
			public static List <WebElement>  Profile_Skill_History_Description;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='1'])")  
			public static List <WebElement> Profile_Skill_History_Project_Description;

			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='2'])") 
			public static List <WebElement> Profile_Skill_History_SkillType;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='3'])") 
			public static List <WebElement> Profile_Skill_History_Percentage;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='4'])") 
			public static List <WebElement> Profile_Skill_History_TestTakenOn;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='5'])") 
			public static List <WebElement>  Profile_Skill_History_Status;
			
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='6'])") 
			public static List <WebElement> Profile_Skill_History_RetestDate;
		
			@FindBy(how = How.XPATH, using="(//td[@ng-reflect-col-index='7'])") 
			public static List <WebElement> Profile_Skill_History_Action;

			@FindBy(how = How.XPATH, using="(//mat-card-content)[4]//p[2]")
			public static WebElement Dashboard_Paramedics_Count;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])")
			public static List <WebElement> Dashboard_Paramedics_Card;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])")
			public static List <WebElement> MedicalTest_Card_Count;
			
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])[1]")
			public static WebElement Paramedics_First_card;
			

			
//EHS
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])")
			public static List <WebElement> Dashboard_EHS_Card;
			
//Wage
			@FindBy(how = How.XPATH, using="(//div[contains(@class,'row ml-1')])")
			public static List <WebElement> Wage_All_cards;
			
}
