package test.DataBase_Test.Skill_Analysis;

import object_repository.Skill_Analysis_Objects;
import stepdefinition.Induction_Dashboard.Profile_Basic;


public class Skill_Verify_DB_Values extends Profile_Basic {

	
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	
	public static void SkillAnalysisVerifyWorkmanName(String WorkmanNameDB) {
		System.out.println("Workman Name from DB:" + WorkmanNameDB);
		WorkmanNameWMS=Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_WorkmanName.getText();
		System.out.println("Workman Name in WMS: " + WorkmanNameWMS);
		if (WorkmanNameDB.equals(WorkmanNameWMS)) {
			System.out.println("Workman Name is verified");
			System.out.println("====================================");
		} else {
			System.out.println(
					"*******DB Verification failed : Workman Name details is not correctly updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void SkillAnalysisVerifyWorkmanFatherName(String WorkmanFatherNameDB) {
		System.out.println("Workman Father Name from DB:" + WorkmanFatherNameDB);
		WorkmanFatherNameWMS=Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_WorkmanFatherName.getText();
		System.out.println("Workman Father Name in WMS: " + WorkmanFatherNameWMS);
		if (WorkmanFatherNameDB.equals(WorkmanFatherNameWMS)) {
			System.out.println("Workman Father Name is verified");
			System.out.println("====================================");
		} else {
			System.out.println(
					"*******DB Verification failed : Workman Father Name details is not correctly updated correctly in DB*******");
			// fail(); uncomment this
		}
		
	}

	public static void SkillAnalysisVerifyWorkmanGender(String WorkmanGender) {
		System.out.println("Workman Gender from DB:" + WorkmanGender);
		WorkmanGenderWMS=Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Gender.getText();
		System.out.println("Workman Gender in WMS: " + WorkmanGenderWMS);
		if (WorkmanGender.equals(WorkmanGenderWMS)) {
			System.out.println("Workman Gender is verified");
			System.out.println("====================================");
		} else {
			System.out.println(
					"*******DB Verification failed : Workman Gender details is not correctly updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void SkillAnalysisVerifyBloodGroup(String WorkmanBloodGroup) {
		System.out.println("Workman Gender from DB:" + WorkmanBloodGroup);
		WorkmanBloodGroupWMS=Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_BloodGroup.getText();
		System.out.println("Workman Gender in WMS: " + WorkmanBloodGroupWMS);
		if (WorkmanBloodGroup.equals(WorkmanBloodGroupWMS)) {
			System.out.println("Workman Blood Group is verified");
			System.out.println("====================================");
		} else {
			System.out.println(
					"*******DB Verification failed : Workman Blood Group details is not correctly updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void SkillAnalysisVerifyMaritalStatus(String WorkmanMaritalStatus) {
		System.out.println("Workman Marital Status from DB:" + WorkmanMaritalStatus);
		WorkmanBloodGroupWMS=Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_MaritalStatus.getText();
		System.out.println("Workman Marital Status in WMS: " + WorkmanBloodGroupWMS);
		if (WorkmanMaritalStatus.equals(WorkmanBloodGroupWMS)) {
			System.out.println("Workman Marital Status is verified");
			System.out.println("====================================");
		} else {
			System.out.println(
					"*******DB Verification failed : Workman Marital Status details is not correctly updated correctly in DB*******");
			// fail(); uncomment this
		}
		
	}
}
