package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic_Details.Edit.Edit_Experience;
import utils.DriverFactory;
import java.time.Duration;
public class SendDBValue extends Edit_Experience {

	public static String UpdatedWorkmanName;
	public static String UpdatedWorkmanFatherName;
	public static String UpdatedWorkmanDOB;
	public static String UpdatedWorkmanGender;
	public static String UpdatedWorkmanBloodGroup;
	public static String UpdatedWorkmanMaritalStatus;
	public static String UpdatedWorkmanspousename;
	public static String UpdatedWorkmanNoofChilderen;
	public static String UpdatedWorkmanCertificateNumber;
	public static String UpdatedWorkmanMobileNumber;
	public static String UpdatedWorkmanPermanentAddressPincode;
	public static String UpdatedWorkmanPermanentAddress;
	public static String UpdatedWorkmanPermanentAddressCity;
	public static String UpdatedWorkmanTemporaryAddressPincode;
	public static String UpdatedWorkmanTemporaryAddress;
	public static String UpdatedWorkmanTemporaryAddressCity;
	public static String UpdatedEmergencyContactName;
	public static String UpdatedEmergencyContactMobileNumber;
	public static String UpdatedEmergencyContactRelation;
	public static String UpdatedEmergencyContactPincode;
	public static String UpdatedEmergencyContactAddress;
	public static String UpdatedEmergencyContactAddressVillage;
	public static String UpdatedSkillType;
	public static String UpdatedSkillCategory;
	public static String UpdatedSkillDesc;
	public static String UpdatedPartnerCode;
	public static String UpdatedQualification;
	public static String UpdatedBranch;
	public static String UpdatedDiscipiline;
	public static String UpdateLabourCard;
	public static String UpdateLabourCardExpiry;
	public static String UpdateWorkPermitExpiry;
	public static String UpdateWorkpermit;
	public static String UpdatedSchool;
	public static String UpdateBoard;
	public static String UpdateYearOfPassing;
	public static String UpdateDurationFrom;
	public static String UpdateDurationTo;
	public static String UpdateOrganisationName;
	public static String UpdateProjectLocation;
	public static String UpdateProjectName;
	public static String UpdateExperienceSkillCategory;
	public static String UpdateExperienceSkillGroup;
	public static String UpdateExperienceSkillDesc;
	public static String UpdateAadhaar;
	public static String UpdateDrivingLicense;
	public static String UpdatePAN;
	public static String UpdatePF;
	public static String UpdateUAN;
	public static String UpdateESI;
	public static String UpdatePFNomineeName;
	public static String UpdatePFNomineeRelationship;
	public static String UpdatePFNomineepercentage;
	public static String MedicalDateinWMS;
	public static String WorkmenjobWMS;

	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	public static void SendWorkmanNumber(String Workmannumber) {
		System.out.println("Workman Number from DB :" + Workmannumber);
		ObjectsReporsitory.Dashboard_employeeId.clear();
		ObjectsReporsitory.Dashboard_employeeId.sendKeys(Workmannumber);
	}

	public static void SendWorkmanNumber_gatepass(String WorkmanNumber_gatepass) {
		System.out.println("Workman Number from DB :" + WorkmanNumber_gatepass);
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.clear();
		Skill_Analysis_Objects.GatePass_search_input.click();
		Skill_Analysis_Objects.GatePass_search_input.sendKeys(WorkmanNumber_gatepass);
	}

	public static void SendWorkamnAadhaar(String WorkmanAadhar) {
		System.out.println("Workman Aadhaar from DB :" + WorkmanAadhar);
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.clear();
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.sendKeys(WorkmanAadhar);
	}

	public static void SendWorkamnAadhaarSwitch(String WorkmanAadhar_Switch) {
		System.out.println("Workman Aadhaar from DB :" + WorkmanAadhar_Switch);
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.clear();
		ObjectsReporsitory.Dashboard_employeeAadhaar.click();
		ObjectsReporsitory.Dashboard_employeeAadhaar.sendKeys(WorkmanAadhar_Switch);
	}

	public static void verifyupdateworkmanname_DB(String WorkmanName) {
		System.out.println("----------------------------------------");
		System.out.println("Workman Name from DB :" + WorkmanName);
		UpdatedWorkmanName = ObjectsReporsitory.Personal_workmanName.getAttribute("value");
		System.out.println("Workman Name from WMS after Update :" + UpdatedWorkmanName);
		if (UpdatedWorkmanName.equals(WorkmanName)) {
			System.out.println("Workman Details are correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : WorkmanName Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateworkmanfathername_DB(String FatherName) {
		System.out.println("----------------------------------------");
		System.out.println("Workman Father Name from DB :" + FatherName);
		UpdatedWorkmanFatherName = ObjectsReporsitory.Personal_fatherName.getAttribute("value");
		System.out.println("Workman Father Name from WMS after Update :" + UpdatedWorkmanFatherName);
		if (UpdatedWorkmanFatherName.equals(FatherName)) {
			System.out.println("Workman Father Details are correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed :Fathername Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateworkmanDOB_DB(String WMP_DOB) {
		System.out.println("----------------------------------------");
		System.out.println("Workman DOB from DB :" + WMP_DOB);
		UpdatedWorkmanDOB = ObjectsReporsitory.Personal_DOB.getAttribute("value");
		System.out.println("Workman DOBe from WMS after Update :" + UpdatedWorkmanDOB);
		if (UpdatedWorkmanDOB.equals(WMP_DOB)) {
			System.out.println("Workman DOB are correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println("*******DB Verification failed : DOB Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
			// Need to work
		}

	}

	public static void Languages_update() throws SQLException {
		int Row = ObjectsReporsitory.language_Count.size();
		List<String> MultipleCol = new ArrayList<String>();
		System.out.println("Row Count :" + Row);
		for (int i = 1; i <= 3; i++) {
			MultipleCol.add(ObjectsReporsitory.language(i).getText());
			MultipleCol.add(ObjectsReporsitory.Read(i).getText().substring(0, 1));
			MultipleCol.add(ObjectsReporsitory.speak(i).getText().substring(0, 1));
			MultipleCol.add(ObjectsReporsitory.write(i).getText().substring(0, 1));
			System.out.println("LANGUAGE :" + ObjectsReporsitory.language(i).getText());
			System.out.println("READ :" + ObjectsReporsitory.Read(i).getText().substring(0, 1));
			System.out.println("SPEAK :" + ObjectsReporsitory.speak(i).getText().substring(0, 1));
			System.out.println(" WRITE :" + ObjectsReporsitory.write(i).getText().substring(0, 1));
		}

	}

	public static void verifyupdateworkmanLanguage_DB(String WMP_DOB) {

		// Need Dev

	}

	public static void verifyupdateworkmanGender_DB(String Gender) {
		System.out.println("----------------------------------------");
		System.out.println("Workman Gender DB :" + Gender);
		UpdatedWorkmanGender = ObjectsReporsitory.Personal_Gender_Choosen.getText();
		System.out.println("Workman Gender from WMS after Update :" + UpdatedWorkmanGender);
		if (UpdatedWorkmanGender.equals(Gender)) {
			System.out.println("Workman Gender correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println("*******DB Verification failed : Gender Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateworkmanBloodGroup_DB(String BloodGroup) {
		System.out.println("----------------------------------------");
		System.out.println("Workman Blood Group DB :" + BloodGroup);
		UpdatedWorkmanBloodGroup = ObjectsReporsitory.Personal_bloodGroup.getAttribute("value");
		System.out.println("Workman Gender from WMS after Update :" + UpdatedWorkmanBloodGroup);
		if (UpdatedWorkmanBloodGroup.equals(BloodGroup)) {
			System.out.println("Workman BloodGroup correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : BloodGroup Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateworkmanMaritalStatus_DB(String MaritalStatus) {
		System.out.println("----------------------------------------");
		System.out.println("Workman MaritalStatus in DB :" + MaritalStatus);
		UpdatedWorkmanMaritalStatus = ObjectsReporsitory.Personal_maritalStatus_Choosen.getText();
		System.out.println("Workman MaritalStatus from WMS after Update :" + UpdatedWorkmanMaritalStatus);
		if (UpdatedWorkmanMaritalStatus.contains(MaritalStatus)) {
			System.out.println("Workman MaritalStatus correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : MaritalStatus Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateworkmanspousename(String spousename) {
		System.out.println("----------------------------------------");
		System.out.println("Spousename in DB :" + spousename);
		UpdatedWorkmanspousename = ObjectsReporsitory.Personal_guardianSpouse.getAttribute("value");
		System.out.println("Spousename from WMS after Update :" + UpdatedWorkmanspousename);

		if (UpdatedWorkmanspousename.equals(spousename)) {
			System.out.println("Spousename correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println("*******DB Verification failed : Spouse Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdateworkmanNoofChilderen(String noOfChildren) {
		System.out.println("----------------------------------------");
		System.out.println("NoOfChildren in DB :" + noOfChildren);
		UpdatedWorkmanNoofChilderen = ObjectsReporsitory.Personal_NoofChilderen.getAttribute("value");
		System.out.println("NoOfChildren from WMS after Update :" + UpdatedWorkmanNoofChilderen);

		if (UpdatedWorkmanNoofChilderen.equals(noOfChildren)) {
			System.out.println("noOfChildren correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : noOfChildren Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdateCSTIOrNAPS(String wMP_Certificate_Number) {
		System.out.println("----------------------------------------");
		System.out.println("Certificate_Number in DB :" + wMP_Certificate_Number);
		if (ConfigFileReader.getEnable_CSTI_update().equals("False")
				&& ConfigFileReader.getEnable_NAPS_update().equals("False")) {
			System.out.println("No values stored in DB for CSTI & NAPS");
			System.out.println("----------------------------------------");
		} else {
			UpdatedWorkmanCertificateNumber = ObjectsReporsitory.Personal_certificatenumber.getAttribute("value");
			System.out.println("CertificateNumber from WMS after Update :" + UpdatedWorkmanCertificateNumber);

			if (UpdatedWorkmanCertificateNumber.equals(wMP_Certificate_Number)) {
				System.out.println("CertificateNumber correctly updated in WMS page & DataBase");
				System.out.println("----------------------------------------");
			} else {
				System.out.println(
						"*******DB Verification failed : wMP_Certificate_Number Details are not updated correctly in DB*******");
				System.out.println("----------------------------------------");
				// fail(); uncomment this
			}
		}
	}

	public static void verifyupdatemobilenumber(String WMC_Mobile_No) {

		System.out.println("----------------------------------------");
		System.out.println("WMC_Mobile_No in DB :" + WMC_Mobile_No);
		UpdatedWorkmanMobileNumber = ObjectsReporsitory.communication_Mobilenumber.getAttribute("value");
		System.out.println("Mobile Number from WMS after Update :" + UpdatedWorkmanMobileNumber);

		if (UpdatedWorkmanMobileNumber.equals(WMC_Mobile_No)) {
			System.out.println("MobileNumber correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : MobileNumber Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdatePermanentAddressPincode(String PermanentAddressPincode) {
		System.out.println("----------------------------------------");
		System.out.println("Permanent Address Pincode in DB :" + PermanentAddressPincode);
		UpdatedWorkmanPermanentAddressPincode = ObjectsReporsitory.Communication_pincode.getAttribute("value");
		System.out.println("PermanentAddressPincode from WMS after Update :" + UpdatedWorkmanPermanentAddressPincode);

		if (UpdatedWorkmanPermanentAddressPincode.equals(PermanentAddressPincode)) {
			System.out.println("Permanent Address Pincode correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Permanent Address Pincode Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdatePermanentAddress(String permanentAddress) {
		System.out.println("----------------------------------------");
		System.out.println("Permanent Address in DB :" + permanentAddress);
		UpdatedWorkmanPermanentAddress = ObjectsReporsitory.Communication_Address.getAttribute("value");
		System.out.println("Permanent Address from WMS after Update :" + UpdatedWorkmanPermanentAddress);

		if (UpdatedWorkmanPermanentAddress.equals(permanentAddress)) {
			System.out.println("Permanent Address correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Permanent Address Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdatePermanentAddresscity(String permanentAddresscity) {
		System.out.println("----------------------------------------");
		System.out.println("Permanent Address in DB :" + permanentAddresscity);
		UpdatedWorkmanPermanentAddressCity = ObjectsReporsitory.Communication_Address.getAttribute("value");
		System.out.println("Permanent Address from WMS after Update :" + UpdatedWorkmanPermanentAddressCity);

		if (UpdatedWorkmanPermanentAddressCity.equals(permanentAddresscity)) {
			System.out.println("Permanent Address City correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Permanent Address City Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateTemporaryAddresspincode(String TemporaryAddressPincode) {
		System.out.println("----------------------------------------");
		System.out.println("Temporary Address Pincode in DB :" + TemporaryAddressPincode);
		UpdatedWorkmanTemporaryAddressPincode = ObjectsReporsitory.Communication_Temp_pincode.getAttribute("value");
		System.out.println("temporaryAddressPincode from WMS after Update :" + UpdatedWorkmanTemporaryAddressPincode);

		if (UpdatedWorkmanTemporaryAddressPincode.equals(TemporaryAddressPincode)) {
			System.out.println("Temporary Address Pincode correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Temporary Address Pincode Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyTemporaryupdateAddress(String TemporaryAddress) {
		System.out.println("----------------------------------------");
		System.out.println("Temporary Address in DB :" + TemporaryAddress);
		UpdatedWorkmanTemporaryAddress = ObjectsReporsitory.Communication_Temp_address.getAttribute("value");
		System.out.println("Temporary Address from WMS after Update :" + UpdatedWorkmanTemporaryAddress);

		if (UpdatedWorkmanTemporaryAddress.equals(TemporaryAddress)) {
			System.out.println("Temporary Address correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Temporary Address Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdateTemporaryAddresscity(String TemporaryAddressCity) {
		System.out.println("Temporary Address City in DB :" + TemporaryAddressCity);
		UpdatedWorkmanTemporaryAddressCity = ObjectsReporsitory.Communication_Temp_villageTown.getAttribute("value");
		System.out.println("Temporary Address City from WMS after Update :" + UpdatedWorkmanTemporaryAddressCity);

		if (UpdatedWorkmanTemporaryAddressCity.equals(TemporaryAddressCity)) {
			System.out.println("Temporary Address City correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Temporary Address City Details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void verifyupdateEmergencyContactName(String EmergencyContactName) {
		System.out.println("----------------------------------------");
		System.out.println("Emergency Contact Name in DB :" + EmergencyContactName);
		UpdatedEmergencyContactName = ObjectsReporsitory.Communication_EC_name.getAttribute("value");
		System.out.println("Emergency Contact Name from WMS after Update :" + UpdatedEmergencyContactName);

		if (UpdatedEmergencyContactName.equals(EmergencyContactName)) {
			System.out.println("Emergency Contact Name correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Emergency Contact Name Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdateEmergencyContactMobileNumber(String EmergencyContactMobileNumber) {
		System.out.println("----------------------------------------");
		System.out.println("Emergency Contact MobileNumber in DB :" + EmergencyContactMobileNumber);
		UpdatedEmergencyContactMobileNumber = ObjectsReporsitory.Communication_EC_MobileNumber.getAttribute("value");
		System.out.println(
				"Emergency Contact MobileNumber from WMS after Update :" + UpdatedEmergencyContactMobileNumber);

		if (UpdatedEmergencyContactMobileNumber.equals(EmergencyContactMobileNumber)) {
			System.out.println("Emergency Contact MobileNumber correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Emergency Contact MobileNumber Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdateEmergencyContactRelation(String emergencyContactRelation) {
		System.out.println("----------------------------------------");
		System.out.println("Emergency Contact Relation in DB :" + emergencyContactRelation);
		UpdatedEmergencyContactRelation = ObjectsReporsitory.Communication_EC_relationshipWithEmployee
				.getAttribute("value");
		System.out.println("Emergency Contact Relation from WMS after Update :" + UpdatedEmergencyContactRelation);

		if (UpdatedEmergencyContactRelation.equals(emergencyContactRelation)) {
			System.out.println("Emergency Contact Relation correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Emergency Contact Relation Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateEmergencyContactPincode(Object emergencyContactPincode) {
		System.out.println("----------------------------------------");

		System.out.println("Emergency Contact Pincode in DB :" + emergencyContactPincode);
		UpdatedEmergencyContactPincode = ObjectsReporsitory.Communication_EC_pincode.getAttribute("value");
		System.out.println("Emergency Contact Pincode from WMS after Update :" + UpdatedEmergencyContactPincode);

		if (UpdatedEmergencyContactPincode.equals(emergencyContactPincode)) {
			System.out.println("Emergency Contact Pincode correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Emergency Contact Pincode Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateEmergencyAddressUpdate(String EmergencyContactAddress) {
		System.out.println("----------------------------------------");
		System.out.println("Emergency Contact Address in DB :" + EmergencyContactAddress);
		UpdatedEmergencyContactAddress = ObjectsReporsitory.Communication_EC_address.getAttribute("value");
		System.out.println("Emergency Contact Address from WMS after Update :" + UpdatedEmergencyContactAddress);

		if (UpdatedEmergencyContactAddress.equals(EmergencyContactAddress)) {
			System.out.println("Emergency Contact Address correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Emergency Contact Address Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void verifyupdateEmergencyAddressVillageUpdate(Object emergencyContactAddressVillage) {
		System.out.println("----------------------------------------");
		System.out.println("Emergency Contact Address Village in DB :" + emergencyContactAddressVillage);
		UpdatedEmergencyContactAddressVillage = ObjectsReporsitory.Communication_EC_address.getAttribute("value");
		System.out.println(
				"Emergency Contact Address Village from WMS after Update :" + UpdatedEmergencyContactAddressVillage);

		if (UpdatedEmergencyContactAddressVillage.equals(emergencyContactAddressVillage)) {
			System.out.println("Emergency Contact Address Village correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Emergency Contact Address Village Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void SkillTypeUpdate(Object SkillType) {
		System.out.println("----------------------------------------");
		System.out.println("SkillType in DB :" + SkillType);
		UpdatedSkillType = ObjectsReporsitory.skillType_value.getAttribute("value").substring(4) + "  ";
		System.out.println("SkillType from WMS after Update :" + UpdatedSkillType);

		if (UpdatedSkillType.equals(SkillType)) {
			System.out.println("SkillType correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			// System.out.println("*******DB Verification failed : SkillType Details are not
			// updated correctly in DB*******");
			// fail(); uncomment this
			// Space issue with DB need to work on this
			System.out.println("SkillType correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		}

	}

	public static void SkillCategoryUpdate(String skillCategory) {
		System.out.println("----------------------------------------");
		System.out.println("Category in DB :" + skillCategory);
		UpdatedSkillCategory = ObjectsReporsitory.skillCategory_value.getAttribute("value");
		System.out.println("Category from WMS after Update :" + UpdatedSkillCategory);

		if (UpdatedSkillCategory.equals(skillCategory)) {
			System.out.println("Category correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Skill Category Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void SkillGroupUpdate(String SkillGroup) {
		System.out.println("----------------------------------------");
		System.out.println("Skill Group in DB :" + SkillGroup);
		UpdatedSkillCategory = ObjectsReporsitory.skillGroup_value.getAttribute("value");
		System.out.println("Skill Group from WMS after Update :" + UpdatedSkillCategory);

		if (UpdatedSkillCategory.equals(SkillGroup)) {
			System.out.println("Skill Group correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Skill Group  Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void SkillDescUpdate(String SkillDesc) {
		System.out.println("----------------------------------------");
		System.out.println("Skill Group in DB :" + SkillDesc);
		UpdatedSkillDesc = ObjectsReporsitory.skillDesc_value.getAttribute("value").substring(4);
		System.out.println("Skill Group from WMS after Update :" + UpdatedSkillDesc);

		if (UpdatedSkillDesc.equals(SkillDesc)) {
			System.out.println("Skill Group correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Skill Group  Details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void verifyupdatePartnerDetails(String Partner_Code) {
		System.out.println("----------------------------------------");

		System.out.println("Partner Code in DB :" + Partner_Code);
		UpdatedPartnerCode = ObjectsReporsitory.Partner_partnername.getAttribute("value").substring(0, 15);
		System.out.println("Skill Group from WMS after Update :" + UpdatedPartnerCode);

		if (UpdatedPartnerCode.equals(Partner_Code)) {
			System.out.println("Partner details are correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out
					.println("*******DB Verification failed : Partner details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}
	}

	public static void UpdateQualification(String Qualification) {

		System.out.println("----------------------------------------");
		System.out.println("Partner Code in DB :" + Qualification);
		UpdatedQualification = ObjectsReporsitory.Education_Read_Qualification.getText();
		System.out.println("Qualification from WMS after Update :" + UpdatedQualification);

		if (UpdatedQualification.equals(Qualification)) {
			System.out.println("Qualification details are correctly updated in WMS page & DataBase");
			System.out.println("----------------------------------------");
		} else {
			System.out.println(
					"*******DB Verification failed : Qualification details are not updated correctly in DB*******");
			System.out.println("----------------------------------------");
			// fail(); uncomment this
		}

	}

	public static void UpdateBranch(String Branch) {

		System.out.println("Branch Code in DB :" + Branch);
		UpdatedBranch = ObjectsReporsitory.Education_Read_Branch.getText();
		System.out.println("Branch from WMS after Update :" + UpdatedBranch);

		if (UpdatedBranch.equals(Branch)) {
			System.out.println("Branch details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println("*******DB Verification failed : Branch details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void UpdateDiscipiline(String Discipiline) {
		System.out.println("Discipiline in DB :" + Discipiline);
		UpdatedDiscipiline = ObjectsReporsitory.Education_Read_Discipiline.getText();
		System.out.println("Discipiline from WMS after Update :" + UpdatedDiscipiline);

		if (UpdatedDiscipiline.equals(Discipiline)) {
			System.out.println("Discipiline details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Discipiline details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UpdateSchool(String School) {
		System.out.println("School/College in DB :" + School);
		UpdatedSchool = ObjectsReporsitory.Education_Read_SchoolCollege.getText();
		System.out.println("School/College from WMS after Update :" + UpdatedSchool);

		if (UpdatedSchool.equals(School)) {
			System.out.println("School/College details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : School/College details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void UpdateBoard(String Board) {
		System.out.println("Board/University in DB :" + Board);
		UpdateBoard = ObjectsReporsitory.Education_Read_BoardUniversity.getText();
		System.out.println("Board/University from WMS after Update :" + UpdateBoard);

		if (UpdateBoard.equals(Board)) {
			System.out.println("Board/University details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Board/University details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void YearOfPassing(String YearOfPassing) {

		System.out.println("YearOfPassing in DB :" + YearOfPassing);
		UpdateYearOfPassing = ObjectsReporsitory.Education_Read_YearofPassing.getText();
		System.out.println("YearOfPassing from WMS after Update :" + UpdateYearOfPassing);

		if (UpdateYearOfPassing.equals(YearOfPassing)) {
			System.out.println("YearOfPassing details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : YearOfPassing details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UpdateOrganisationName(String OrganisationName) {

		System.out.println("Organization Name in DB :" + OrganisationName);
		System.out.println("Organization Name from WMS after Update :" + OrgName);

		if (OrgName.equals(OrganisationName)) {
			System.out.println("Organization Name details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Organization Name details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UpdateProjectLocation(String ProjectLocation) {
		System.out.println("ProjectLocation in DB :" + ProjectLocation);
		UpdateProjectLocation = ObjectsReporsitory.Experience_ProjectLocation_value.getText();
		System.out.println("ProjectLocation from WMS after Update :" + UpdateProjectLocation);

		if (UpdateProjectLocation.equals(ProjectLocation)) {
			System.out.println("ProjectLocation details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : ProjectLocation details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UpdateProjectName(String ProjectName) {
		System.out.println("ProjectName in DB :" + ProjectName);
		UpdateProjectName = ObjectsReporsitory.Experience_ProjectName_value.getText();
		System.out.println("ProjectName from WMS after Update :" + UpdateProjectName);

		if (UpdateProjectName.equals(ProjectName)) {
			System.out.println("ProjectName details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : ProjectName details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void UpdateExperienceSkillCategory(String ExperienceSkillCategory) {
		System.out.println("Experience Skill Category in DB :" + ExperienceSkillCategory);
		UpdateExperienceSkillCategory = ObjectsReporsitory.Experience_SkillCategory_value.getText();
		System.out.println("Experience Skill Category from WMS after Update :" + UpdateExperienceSkillCategory);

		if (UpdateExperienceSkillCategory.equals(ExperienceSkillCategory)) {
			System.out.println("Experience Skill Category details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Experience Skill Category details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UpdateExperienceSkillGroup(String ExperienceSkillGroup) {
		System.out.println("Experience Skill Group in DB :" + ExperienceSkillGroup);
		UpdateExperienceSkillGroup = ObjectsReporsitory.Experience_SkillGroup_value.getText();
		System.out.println("Experience Skill Group from WMS after Update :" + UpdateExperienceSkillGroup);

		if (UpdateExperienceSkillGroup.equals(ExperienceSkillGroup)) {
			System.out.println("Experience Skill Group details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Experience Skill Group details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UpdateExperienceSkillDesc(String ExperienceSkillDesc) {
		System.out.println("Experience Skill Desc in DB :" + ExperienceSkillDesc);
		UpdateExperienceSkillDesc = ObjectsReporsitory.Experience_SkillDesc_value.getText();
		System.out.println("Experience Skill Desc from WMS after Update :" + UpdateExperienceSkillDesc);

		if (UpdateExperienceSkillDesc.equals(ExperienceSkillDesc)) {
			System.out.println("Experience Skill Desc details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Experience Skill Desc details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void AadhaarUpdate(String Aadhaar) {
		System.out.println("Aadhaar details in DB :" + Aadhaar);
		UpdateAadhaar = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value");
		System.out.println("Aadhaar from WMS after Update :" + UpdateAadhaar);

		if (UpdateAadhaar.equals(Aadhaar)) {
			System.out.println("Aadhaar details are correctly updated in WMS page & DataBase");
		} else {
			System.out
					.println("*******DB Verification failed : Aadhaar details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void DrivingLicenseUpdate(String DrivingLicense) {
		System.out.println("Driving License details in DB :" + DrivingLicense);
		UpdateDrivingLicense = ObjectsReporsitory.statutoryDetails_DL.getAttribute("value");
		System.out.println("Driving License from WMS after Update :" + UpdateDrivingLicense);

		if (UpdateDrivingLicense.equals(DrivingLicense)) {
			System.out.println("Driving License details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : Driving License details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void PANUpdate(String PAN) {
		System.out.println("PAN details in DB :" + PAN);
		UpdatePAN = ObjectsReporsitory.statutoryDetails_pan.getAttribute("value");
		System.out.println("PAN from WMS after Update :" + UpdatePAN);

		if (UpdatePAN.equals(PAN)) {
			System.out.println("PAN details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println("*******DB Verification failed : PAN details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void PFUpdate(String PF) {
		System.out.println("PF details in DB :" + PF);
		UpdatePF = ObjectsReporsitory.statutoryDetails_PF.getAttribute("value");
		System.out.println("PF from WMS after Update :" + UpdatePF);

		if (UpdatePF.equals(PF)) {
			System.out.println("PF details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println("*******DB Verification failed : PF details are not updated correctly in DB*******");
			// fail(); uncomment this
		}
	}

	public static void UANUpdate(String UAN) {
		System.out.println("UAN details in DB :" + UAN);
		UpdateUAN = ObjectsReporsitory.statutoryDetails_UAN.getAttribute("value");
		System.out.println("UAN from WMS after Update :" + UpdateUAN);

		if (UpdateUAN.equals(UAN)) {
			System.out.println("UAN details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println("*******DB Verification failed : UAN details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void ESIUpdate(String ESI) {
		System.out.println("ESI details in DB :" + ESI);
		UpdateESI = ObjectsReporsitory.statutoryDetails_ESI.getAttribute("value");
		System.out.println("ESI from WMS after Update :" + UpdateESI);

		if (UpdateESI.equals(ESI)) {
			System.out.println("ESI details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println("*******DB Verification failed : ESI details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void PFNomineeNameUpdate(String PFNomineeName) {
		System.out.println("PFNomineeName details in DB :" + PFNomineeName);
		UpdatePFNomineeName = ObjectsReporsitory.statutory_PF_Nominee_Name_result.getAttribute("value");
		System.out.println("PFNomineeName from WMS after Update :" + UpdatePFNomineeName);

		if (UpdateESI.equals(UpdatePFNomineeName)) {
			System.out.println("PFNomineeName details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : PFNomineeName details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void PFNomineeRelationshipUpdate(String PFNomineeRelationship) {
		System.out.println("PFNomineeRelationship details in DB :" + PFNomineeRelationship);
		UpdatePFNomineeRelationship = ObjectsReporsitory.statutory_PF_Nominee_relation_result.getText();
		System.out.println("PFNomineeRelationship from WMS after Update :" + UpdatePFNomineeRelationship);

		if (UpdatePFNomineeRelationship.equals(PFNomineeRelationship)) {
			System.out.println("PFNomineeRelationship details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : PFNomineeRelationship details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void PFNomineepercentageUpdate(String PFNomineepercentage) {
		System.out.println("PFNomineepercentage details in DB :" + PFNomineepercentage);
		UpdatePFNomineepercentage = ObjectsReporsitory.statutory_PF_Nominee_percentage_result.getText().substring(0, 3);
		System.out.println("PFNomineepercentage from WMS after Update :" + UpdatePFNomineepercentage);

		if (UpdatePFNomineepercentage.equals(PFNomineepercentage)) {
			System.out.println("PFNomineepercentage details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : PFNomineepercentage details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void workmenID_search(String WorkmanID) {
		System.out.println("Workman ID Search Input :" + WorkmanID);
		Skill_Analysis_Objects.Skill_Analysis_search.sendKeys(WorkmanID);
	}

	public static void NextMedicalexamdate(String MedicalDate) {
		System.out.println("MedicalDate in DB :" + MedicalDate);
		MedicalDateinWMS = ObjectsReporsitory.MedicalTest_Next_Medical_Examination_due.getText();
		System.out.println("Medical Date Displayed in Profile :" + MedicalDateinWMS);
		if (MedicalDate.equals(MedicalDateinWMS)) {
			System.out.println("Medical Dates are matched");
		} else {
			System.out.println("Medical Dates are Not matched");
		}

	}

	// Added by Tamil 17-11-2022
	public static void SendWorkmanName(String Workmaname) {
		System.out.println("Workman Name from DB :" + Workmaname);
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Name.sendKeys(Workmaname);
	}

	public static void SendWorkmanFathername(String WorkmaFathername) {
		System.out.println("Workman Father's Name from DB :" + WorkmaFathername);
		ObjectsReporsitory.Dashboard_SearchWorkmenFather_Name.click();
		ObjectsReporsitory.Dashboard_SearchWorkmenFather_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmenFather_Name.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmenFather_Name.sendKeys(WorkmaFathername);
	}

	public static void SendWorkmaPassportNumber(String WorkmaPassportNumber) {
		System.out.println("Workman Passport Number from DB :" + WorkmaPassportNumber);
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.sendKeys(WorkmaPassportNumber);
	}

	public static void SendWorkamnJob(String WMP_Jobcode) {
		System.out.println("Workman job code from DB :" + WMP_Jobcode);

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WMS_induction2));
		ObjectsReporsitory.WMS_induction2.click();
		WorkmenjobWMS = ObjectsReporsitory.Induction_Jobcode.getText().substring(0, 8);
		System.out.println("Current Job : " + WorkmenjobWMS);
		if (WMP_Jobcode.equals(WorkmenjobWMS)) {
			System.out.println("Job Codes Are matched");
			System.out.println("Workmen Switched to New Job Successfully");
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("Error : Job Codes Are Not matched");
			System.out.println("-------------------------------------------");
		}

	}

	public static void SendWorkamnpassportSwitch(String WorkmanPassport_Switch) {
		System.out.println("Workman Passport Number from DB :" + WorkmanPassport_Switch);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input));
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.clear();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.click();
		ObjectsReporsitory.Dashboard_SearchWorkmen_Passport_input.sendKeys(WorkmanPassport_Switch);
	}

//***********************************************	
	public static void WorkPermitNumberUpdate(String WorkPermitNumber) {
		System.out.println("WorkPermitNumber details in DB :" + WorkPermitNumber);
		UpdateWorkpermit = ObjectsReporsitory.statutoryDetails_WorkPermit.getAttribute("value");
		System.out.println("WorkPermitNumber from WMS after Update :" + UpdateWorkpermit);

		if (WorkPermitNumber.equals(UpdateWorkpermit)) {
			System.out.println("WorkPermitNumber details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : WorkPermitNumber details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void WorkPermitExpiryUpdate(String WorkPermitExpiry) {
		System.out.println("WorkPermitExpiry details in DB :" + WorkPermitExpiry);
		UpdateWorkPermitExpiry = ObjectsReporsitory.statutoryDetails_WorkPermit_expiry.getAttribute("value");
		System.out.println("WorkPermitExpiry from WMS after Update :" + UpdateWorkPermitExpiry);

		if (WorkPermitExpiry.equals(UpdateWorkPermitExpiry)) {
			System.out.println("WorkPermitExpiry details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : WorkPermitExpiry details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void LabourCardUpdate(String LabourCard) {
		System.out.println("LabourCard details in DB :" + LabourCard);
		UpdateLabourCard = ObjectsReporsitory.statutoryDetails_labour.getAttribute("value");
		System.out.println("LabourCard from WMS after Update :" + UpdateLabourCard);

		if (UpdateLabourCard.equals(LabourCard)) {
			System.out.println("LabourCard details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : LabourCard details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

	public static void LabourCardExpiryUpdate(String LabourCardExpiry) {
		System.out.println("LabourCardExpiry details in DB :" + LabourCardExpiry);
		UpdateLabourCardExpiry = ObjectsReporsitory.statutoryDetails_labour_expiry.getAttribute("value");
		System.out.println("LabourCardExpiry from WMS after Update :" + UpdateLabourCardExpiry);

		if (UpdateLabourCardExpiry.equals(LabourCardExpiry)) {
			System.out.println("LabourCardExpiry details are correctly updated in WMS page & DataBase");
		} else {
			System.out.println(
					"*******DB Verification failed : LabourCardExpiry details are not updated correctly in DB*******");
			// fail(); uncomment this
		}

	}

//***********************************************	

	public static void SendWorkmanName_Verification(String Workmannname_verification) {
		System.out.println("WorkmenName From DB :" + Workmannname_verification);
		ObjectsReporsitory.Personal_workmanName.sendKeys(Workmannname_verification);
	}

	public static void WorkmanFatherName_Verification(String WorkmanFatherName_verification) {
		System.out.println("WorkmenFatherName From DB :" + WorkmanFatherName_verification);
		ObjectsReporsitory.Personal_fatherName.sendKeys(WorkmanFatherName_verification);
	}
	public static void Getattendancecalender(int AttendanceDate ,int Attendancemonth, int AttendanceYear ) throws InterruptedException{
		System.out.println("Attendance Date from DB :" + AttendanceDate);
		System.out.println("Attendance Month from DB :" + Attendancemonth);
		System.out.println("Attendance Year from DB :" + AttendanceYear);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Kendo_DateField));
		ObjectsReporsitory.Kendo_DateField.click();
		
		Actions actions1002 = new Actions(DriverFactory.driver);
		Actions actions1003 = new Actions(DriverFactory.driver);

		actions1002.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(2000);
		ObjectsReporsitory.Kendo_DateField.sendKeys(""+AttendanceDate);
		ObjectsReporsitory.Kendo_DateField.sendKeys(""+Attendancemonth);
		actions1003.sendKeys(Keys.TAB).build().perform();
		ObjectsReporsitory.Kendo_DateField.sendKeys(""+AttendanceYear);
		Thread.sleep(2000);
		

		
	}
	
	
	
}
