//package object_repository;
//
//import java.util.List;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//public class WorkmenProfile {
//
//		//**Workmen Profile Elements**
//	
//			@FindBy(how = How.XPATH, using="(//app-communication-details-view//div//p)[1]") 
//			public  static WebElement Profile_Communication_Head;
//			
//			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[2]") 
//			public  static WebElement Profile_Partner_name;
//			
//			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[3]") 
//			public  static WebElement Profile_Partner_Workpermit;
//		
//			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[4]") 
//			public  static WebElement Profile_Partner_Address;
//			
//			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[5]") 
//			public  static WebElement Profile_Partner_PhoneNo;
//			
//			@FindBy(how = How.XPATH, using="(//app-partner-detail-view//p)[6]") 
//			public  static WebElement Profile_Partner_MailID;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[1]") 
//			public  static WebElement Profile_Education_Qualification;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[2]") 
//			public  static WebElement Profile_Education_Branch;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[3]") 
//			public  static WebElement Profile_Education_Discipline;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[4]") 
//			public  static WebElement Profile_Education_SchoolORCollege;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[5]") 
//			public  static WebElement Profile_Education_BoardORuniversity;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[6]") 
//			public  static WebElement Profile_Education_YearOfPassing;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//div)[13]") 
//			public  static WebElement Profile_Experience_Head;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//br)[1]") 
//			public  static WebElement Profile_Statutory_Head;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[7]")
//			public  static WebElement Profile_Experience_Org_Name;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[8]") 
//			public  static WebElement Profile_Experience_Project_location;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[9]") 
//			public  static WebElement Profile_Experience_ProjectCodeOrName;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[10]") 
//			public  static WebElement Profile_Experience_SkillCategory;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[11]") 
//			public  static WebElement Profile_Experience_SkillGroup;
//			
//			@FindBy(how = How.XPATH, using="(//app-education-experience-view//td)[12]") 
//			public  static WebElement Profile_Experience_SkillDesc;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[14]") 
//			public  static WebElement Profile_PF_Nominee_Details_Head;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[3]") 
//			public  static WebElement Profile_Statutory_Aadhar;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[5]") 
//			public  static WebElement Profile_Statutory_DrivingLicense;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[7]") 
//			public  static WebElement Profile_Statutory_PanCard;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[9]") 
//			public  static WebElement Profile_Statutory_PFNo;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[11]") 
//			public  static WebElement Profile_Statutory_UANNo;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//p)[13]") 
//			public  static WebElement Profile_Statutory_ESINo;
//			
//			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[1]") 
//			public  static WebElement Profile_Bank_Head;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//td)[1]") 
//			public  static WebElement Profile_PF_nominee_Name;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//td)[2]") 
//			public  static WebElement Profile_PF_nominee_Relationship;
//			
//			@FindBy(how = How.XPATH, using="(//app-statutory-details-view//td)[3]") 
//			public  static WebElement Profile_PF_nominee_Allocation_Percentage;
//			
//			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[7]") 
//			public  static WebElement Profile_bank_end;
//			
//			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[3]") 
//			public  static WebElement Profile_bank_Account_Name;
//			
//			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[5]") 
//			public  static WebElement Profile_bank_Account_no;
//			
//			@FindBy(how = How.XPATH, using="(//app-bankdetails-view//p)[7]") 
//			public  static WebElement Profile_bank_IFSC_Or_IBAN_or_SWIFT_Code;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[4]") 
//			public  static WebElement Profile_Skill_Analysis;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[1]") 
//			public  static WebElement Profile_Skill_Description;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[2]") 
//			public  static WebElement Profile_Skill_Project_Description;
//
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[3]") 
//			public  static WebElement Profile_Skill_SkillType;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[4]") 
//			public  static WebElement Profile_Skill_Percentage;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[5]") 
//			public  static WebElement Profile_Skill_TestTakenOn;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[6]") 
//			public  static WebElement Profile_Skill_Status;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[7]") 
//			public  static WebElement Profile_Skill_RetestDate;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[5]") 
//			public  static WebElement Profile_Medical_Test;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[6]") 
//			public  static WebElement Profile_EHS;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//i)[7]") 
//			public  static WebElement Profile_Wage;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[17]") 
//			public  static WebElement Profile_Medical_NextDue;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[19]") 
//			public  static WebElement Profile_Medical_Fitness_Status;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[21]") 
//			public  static WebElement Profile_Medical_Skin_Temperature;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[23]") 
//			public  static WebElement Profile_Medical_Diabetics;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[25]") 
//			public  static WebElement Profile_Medical_SPO2;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[27]") 
//			public  static WebElement Profile_Medical_Systolic;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[29]") 
//			public  static WebElement Profile_Medical_Diastolic;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[31]") 
//			public  static WebElement Profile_Medical_Height;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[33]") 
//			public  static WebElement Profile_Medical_Weight;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[35]") 
//			public  static WebElement Profile_Medical_BMI;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[37]") 
//			public  static WebElement Profile_Medical_Identification_Marks_1;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[39]") 
//			public  static WebElement Profile_Medical_Identification_Marks_2;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[41]") 
//			public  static WebElement Profile_Medical_Heart_Rate;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[43]") 
//			public  static WebElement Profile_Medical_Skin_Temperature2;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[45]") 
//			public  static WebElement Profile_Medical_BP;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[47]") 
//			public  static WebElement Profile_Medical_Varicose;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[49]") 
//			public  static WebElement Profile_Medical_Seizure;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[51]") 
//			public  static WebElement Profile_Medical_Vertigo;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[53]") 
//			public  static WebElement Profile_Medical_Acrophobia;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[55]") 
//			public  static WebElement Profile_Medical_Diabetes;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[57]") 
//			public  static WebElement Profile_Medical_Stroke;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[59]") 
//			public  static WebElement Profile_Medical_Heart_Disease;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[61]") 
//			public  static WebElement Profile_Medical_Major_Illness_or_Surgery;
//						
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//p)[63]") 
//			public  static WebElement Profile_Medical_Respiratory_Diseases;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[1]") 
//			public  static WebElement Profile_EHS_Skill_desc;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[2]") 
//			public  static WebElement Profile_EHS_job;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[3]") 
//			public  static WebElement Profile_EHS_TrainingDate;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[1]") 
//			public  static WebElement Profile_wage_Desc1;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[4]") 
//			public  static WebElement Profile_wage_Desc2;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[2]") 
//			public  static WebElement Profile_wage_Amount1;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[5]") 
//			public  static WebElement Profile_wage_Amount2;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[3]") 
//			public  static WebElement Profile_wage_type1;
//			
//			@FindBy(how = How.XPATH, using="(//app-workman-profile//td)[6]") 
//			public  static WebElement Profile_wage_type2;
//			
//	}		
//
//
//
