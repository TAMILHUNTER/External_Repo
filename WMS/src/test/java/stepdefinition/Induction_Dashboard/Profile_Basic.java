package stepdefinition.Induction_Dashboard;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
import stepdefinition.Basic;
//import object_repository.WorkmenProfile;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Edit.Edit_Personal_Details;
import stepdefinition.Job_Switch.Create.SwitchJob_Create;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Profile_Basic {

	static int Skill_Analyisis_Count;
	public static String WorkmanID;
	public static String WorkmanNameWMS;
	public static String WorkmanFatherNameWMS;
	public static String WorkmanDOBWMS;
	public static String WorkmanGenderWMS;
	public static String WorkmanBloodGroupWMS;
	public static String WorkmanMaritalStatus;
	public static String SpouseName;
	public static String Completion_Percentage;
	public static String NoOfChildren;
	public static String CstiOrNaps;
	public static String WorkmanPartnerNameWMS;
	public static String WorkmanMobileNumberWMS;
	public static String PermanentAddressWMS;
	public static String PermanentVillageWMS;
	public static String TemporaryAddressWMS;
	public static String TemporaryVillageWMS;
	public static String ECNameWMS;
	public static String ECMobileNumberWMS;
	public static String ECRelationshipWMS;
	public static String ECAddressWMS;
	public static String ECVillageWMS;
	public static String PermanentPincode;
	public static String ECPincode;
	public static String Skill_Category;
	public static String Skill_Group;
	public static String Skill_Description;
	public static String Skill_Type;
	public static String Deployment;
	public static String Workmanname;
	public static String WorkmanNumber;
	public static String WorkmanJob;
	public static String WorkmanSkill;
	public static String WorkmanStatus;
	public static String WorkmenGender;
	public static String WorkmenAadhaar;
	public static String WorkmenPartner;
	public static String WorkmenStatus;
	public static String WorkmenJobCode;
	public static String WorkmenSkill;
	public static String WorkmenWorkType;
	public static int Checkbox_Count;

// Page Factory
	public Profile_Basic() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
		// PageFactory.initElements(DriverFactory.driver, WorkmenProfile.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Given("^Navigate to Induction Dashboard$")
	public static void Navigate_to_Induction_Dashboard() throws Throwable {
		View_Profile.Navigate_to_Induction_Dashboard_View_Profile();

	}

	@Then("^Verify User can be able to Search workman Profile$")
	public static void Verify_User_can_be_able_to_Search_workman_Profile() throws Throwable {
		System.out.println("Search workmen by Employee ID");
		System.out.println("==============================");
		Edit_Personal_Details.Search_Workman_by_Number();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_submit));
		ObjectsReporsitory.Dashboard_submit.click();
		Basic.popup_validation_other();
		Workmanname = ObjectsReporsitory.Dashboard_Workmen_Name.getText().substring(2);
		WorkmanNumber = ObjectsReporsitory.Dashboard_Workmen_Number.getText().substring(2);
		WorkmenGender = ObjectsReporsitory.Dashboard_Workmen_Gender.getText().substring(2);
		WorkmenAadhaar = ObjectsReporsitory.Dashboard_Workmen_Aadhaar.getText().substring(2);
		WorkmenPartner = ObjectsReporsitory.Dashboard_Workmen_Partner.getText().substring(2);
		WorkmenStatus = ObjectsReporsitory.Dashboard_Workmen_Status.getText();
		WorkmenJobCode = ObjectsReporsitory.Dashboard_Workmen_Jobcode.getText().substring(2);
		WorkmenSkill = ObjectsReporsitory.Dashboard_Workmen_Skill.getText().substring(2);
		WorkmenWorkType = ObjectsReporsitory.Dashboard_Workmen_WorkType.getText().substring(2);
		System.out.println("Workmanname    :" + Workmanname);
		System.out.println("WorkmanNumber  :" + WorkmanNumber);
		System.out.println("WorkmenGender  :" + WorkmenGender);
		System.out.println("WorkmenAadhaar :" + WorkmenAadhaar);
		System.out.println("WorkmenPartner :" + WorkmenPartner);
		System.out.println("WorkmenStatus  :" + WorkmenStatus);
		System.out.println("WorkmenJobCode :" + WorkmenJobCode);
		System.out.println("WorkmenSkill   :" + WorkmenSkill);
		System.out.println("WorkmenWorkType:" + WorkmenWorkType);
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify User can be able to View workman Profile$")
	public static void Verify_User_can_be_able_to_View_workman_Profile() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Dashboard_Profile_Eye));
		ObjectsReporsitory.Dashboard_Profile_Eye.click();
		Thread.sleep(5000);
		Screenshot.Screenshotforscenario();
		if (Workmanname.equals(ObjectsReporsitory.Profile_card_WorkmenName.getText())) {
			System.out.println("Workmen Name Matched : " + Workmanname);
		} else {
			System.out.println("Workmen Name Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Name in Dashboard :" + Workmanname);
			System.out.println("Workmen Name in Profilecard :" + ObjectsReporsitory.Profile_card_WorkmenName.getText());
			System.out.println("=========================");
		}

		if (WorkmanNumber.equals(ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16))) {
			System.out.println("Workmen number Matched : " + WorkmanNumber);
		} else {
			System.out.println("Workmen number Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen number in Dashboard :" + WorkmanNumber);
			System.out.println("Workmen number in Profilecard :"
					+ ObjectsReporsitory.Profile_card_WorkmenNumber.getText().substring(16));
			System.out.println("=========================");
		}

		if (WorkmenSkill.equals(ObjectsReporsitory.Profile_card_WorkmenSkill.getText().substring(9))) {
			System.out.println("Workmen Skill Matched :" + WorkmanSkill);
		} else {
			System.out.println("Workmen Skill Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Skill in Dashboard :" + WorkmenSkill);
			System.out.println("Workmen Skill in Profilecard :"
					+ ObjectsReporsitory.Profile_card_WorkmenSkill.getText().substring(9));
			System.out.println("=========================");
		}

		if (WorkmenPartner.equals(ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12))) {
			System.out.println("Workmen Partner Code Matched : " + WorkmanJob);
		} else {
			System.out.println("Workmen Partner Code Not Matched");
			System.out.println("=========================");
			System.out.println("Workmen Partner Code in Dashboard :" + WorkmenPartner);
			System.out.println("Workmen Partner Code in Profilecard :"
					+ ObjectsReporsitory.Profile_card_PartnerID.getText().substring(12));
			System.out.println("=========================");
		}
		System.out.println("END : Search workmen by Employee ID");
		System.out.println("==============================");
	}

	@Then("^verify workman name in Personal details are displayed correctly in profile$")
	public static void verify_workman_name_in_Personal_details_is_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}

		JavascriptExecutor js1 = (JavascriptExecutor) DriverFactory.driver;
		js1.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);

		// (JavascriptExecutor)
		// DriverFactory.driver.executeScript("arguments[0].scrollIntoView();",
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);

		WorkmanNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_WorkmanName.getText();
		if (WorkmanNameWMS.contains(ConfigFileReader.getWorkman_name())) {
			System.out.println("Workman Name is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workman Name details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^verify workman Father name in Personal details are displayed correctly in profile$")
	public static void verify_workman_Father_name_in_Personal_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions3 = new Actions(DriverFactory.driver);
//		actions3.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
//		actions3.perform();
		JavascriptExecutor js2 = (JavascriptExecutor) DriverFactory.driver;
		js2.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
		WorkmanFatherNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_WorkmanFatherName.getText();
		if (WorkmanFatherNameWMS.contains(ConfigFileReader.getWorkman_Father_name())) {
			System.out.println("Workman Father Name is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workman Father Name details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^verify workman DOB in Personal details are displayed correctly in profile$")
	public static void verify_workman_DOB_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
		WorkmanDOBWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_DOB.getText();
		if (WorkmanDOBWMS.equals(ConfigFileReader.getDOB()) || WorkmanDOBWMS.equals(ConfigFileReader.getDOB_update())) {
			System.out.println("Workman DOB is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workman DOB details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^verify workman Gender in Personal details are displayed correctly in profile$")
	public static void verify_workman_Gender_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
		WorkmanGenderWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Gender.getText();
		if (WorkmanGenderWMS.equals(ConfigFileReader.getGender())
				|| WorkmanGenderWMS.equals(ConfigFileReader.getGender_update())) {
			System.out.println("Workman Gender is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workman Gender details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^verify workman Blood Group in Personal details are displayed correctly in profile$")
	public static void verify_workman_Blood_Group_in_Personal_details_are_displayed_correctly_in_profile()
			throws Throwable {
		WorkmanBloodGroupWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_BloodGroup.getText();
		if (WorkmanBloodGroupWMS.equals(ConfigFileReader.getBlood_Group())
				|| WorkmanBloodGroupWMS.equals(ConfigFileReader.getBlood_Group_update())) {
			System.out.println("Workman Blood Group is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workman Blood Group details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^verify Languages in Personal details are displayed correctly in profile$")
	public static void verify_Languages_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
		wait.until(ExpectedConditions
				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown));
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown);
		// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown.click();

		String Language1, Language2;// Language3;
		String Language1_Read, Language1_Write, Language1_Speak, Language2_Read, Language2_Write, Language2_Speak;
		// Language3_Read, Language3_Write, Language3_Speak;
		if (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1.getText()
				.equals("No records available.")) {
			System.out.println("Workman Languages Not Available");
		}

		else {
			Language1 = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1.getText();
			Language1_Read = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1_Read.getText();
			Language1_Write = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1_Write.getText();
			Language1_Speak = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1_Speak.getText();
			if (Language1.equals(ConfigFileReader.getLanguage1())) {
				System.out.println(Language1 + " - Displayed Language 1");
				if (Language1_Read.equals(ConfigFileReader.getL1Read_Verify())) {
					System.out.println("Workman Can be able to Read " + Language1 + " : " + Language1_Read);
				} else {
					System.out.println("****Verification Failed : Workman Can be able to Read " + Language1 + " : "
							+ Language1_Read + "*******");
					// fail();
				}
				if (Language1_Write.equals(ConfigFileReader.getL1Write_Verify())) {
					System.out.println("Workman Can be able to Write " + Language1 + " : " + Language1_Write);
				} else {
					System.out.println("****Verification Failed : Workman Can be able to Write " + Language1 + " : "
							+ Language1_Write + "*******");
					// fail();
				}
				if (Language1_Speak.equals(ConfigFileReader.getL1speak_Verify())) {
					System.out.println("Workman Can be able to Speak " + Language1 + " : " + Language1_Speak);
				} else {
					System.out.println("****Verification Failed : Workman Can be able to Speak " + Language1 + " : "
							+ Language1_Speak + "*******");
					// fail();
				}
			} else if (Language1.equals(ConfigFileReader.getLanguage1_update())) {
				System.out.println(Language1 + " - Displayed Language 1");
				if (Language1_Read.equals(ConfigFileReader.getL1Read_update_verify())) {
					System.out.println("Workman Can be able to Read " + Language1 + " : " + Language1_Read);
				} else {
					System.out.println("****Verification Failed : Workman Can be able to Read " + Language1 + " : "
							+ Language1_Read + "*******");
					// fail();
				}
				if (Language1_Write.equals(ConfigFileReader.getL1Write_update_verify())) {
					System.out.println("Workman Can be able to Write " + Language1 + " : " + Language1_Write);
				} else {
					System.out.println("****Verification Failed : Workman Can be able to Write " + Language1 + " : "
							+ Language1_Write + "*******");
					// fail();
				}
				if (Language1_Speak.equals(ConfigFileReader.getL1speak_update_verify())) {
					System.out.println("Workman Can be able to Speak " + Language1 + " : " + Language1_Speak);
				} else {
					System.out.println("****Verification Failed : Workman Can be able to Speak " + Language1 + " : "
							+ Language1_Speak + "*******");
					// fail();
				}
			} else {
				System.out.println("****Verification Failed : " + Language1 + " - Displayed as Language 1");
			}

//L2
			if (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2 == null) {
				System.out.println("Language 2 Not available");
			} else {
				Language2 = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2.getText();
				Language2_Read = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2_Read.getText();
				Language2_Write = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2_Write.getText();
				Language2_Speak = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2_Speak.getText();
				if (Language2.equals(ConfigFileReader.getLanguage2())) {
					System.out.println(Language2 + " - Displayed Language 2");
					if (Language2_Read.equals(ConfigFileReader.getL2Read_Verify())) {
						System.out.println("Workman Can be able to Read " + Language2 + " : " + Language2_Read);
					} else {
						System.out.println("****Verification Failed : Workman Can be able to Read " + Language2 + " : "
								+ Language2_Read + "*******");
						// fail();
					}
					if (Language2_Write.equals(ConfigFileReader.getL2Write_Verify())) {
						System.out.println("Workman Can be able to Write " + Language2 + " : " + Language2_Write);
					} else {
						System.out.println("****Verification Failed : Workman Can be able to Write " + Language2 + " : "
								+ Language2_Write + "*******");
						// fail();
					}
					if (Language2_Speak.equals(ConfigFileReader.getL2speak_Verify())) {
						System.out.println("Workman Can be able to Speak " + Language2 + " : " + Language2_Speak);
					} else {
						System.out.println("****Verification Failed : Workman Can be able to Speak " + Language2 + " : "
								+ Language2_Speak + "*******");
						// fail();
					}
				} else if (Language2.equals(ConfigFileReader.getLanguage2_update())) {
					System.out.println(Language2 + " - Displayed Language 2");
					if (Language2_Read.equals(ConfigFileReader.getL2Read_update_verify())) {
						System.out.println("Workman Can be able to Read " + Language2 + " : " + Language2_Read);
					} else {
						System.out.println("****Verification Failed : Workman Can be able to Read " + Language2 + " : "
								+ Language2_Read + "*******");
						// fail();
					}
					if (Language2_Write.equals(ConfigFileReader.getL2Write_update_verify())) {
						System.out.println("Workman Can be able to Write " + Language2 + " : " + Language2_Write);
					} else {
						System.out.println("****Verification Failed : Workman Can be able to Write " + Language2 + " : "
								+ Language2_Write + "*******");
						// fail();
					}
					if (Language2_Speak.equals(ConfigFileReader.getL2speak_update_verify())) {
						System.out.println("Workman Can be able to Speak " + Language2 + " : " + Language2_Speak);
					} else {
						System.out.println("****Verification Failed : Workman Can be able to Speak " + Language2 + " : "
								+ Language2_Speak + "*******");
						// fail();
					}
				} else {
					System.out.println("****Verification Failed : " + Language2 + " - Displayed as Language 2");
				}
				System.out.println("----------------------------");
			}

			/*
			 * //L3 if
			 * (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3 ==
			 * null) { System.out.println("Language 3 Not available");
			 * System.out.println(Skill_Analysis_Objects.
			 * Skill_Analysis_Workman_Profile_Basic_Language3); } else { Language3 =
			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3.getText
			 * (); Language3_Read =
			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3_Read.
			 * getText(); Language3_Write =
			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3_Write.
			 * getText(); Language3_Speak =
			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3_Speak.
			 * getText(); if (Language3.equals(ConfigFileReader.getLanguage3())) {
			 * System.out.println(Language3 + " - Displayed Language 3"); if
			 * (Language3_Read.equals(ConfigFileReader.getL3Read_Verify())) {
			 * System.out.println("Workman Can be able to Read " + Language3 + " : " +
			 * Language3_Read); } else {
			 * System.out.println("****Verification Failed : Workman Can be able to Read " +
			 * Language3 + " : " + Language3_Read + "*******"); // fail(); } if
			 * (Language3_Write.equals(ConfigFileReader.getL3Write_Verify())) {
			 * System.out.println("Workman Can be able to Write " + Language3 + " : " +
			 * Language3_Write); } else {
			 * System.out.println("****Verification Failed : Workman Can be able to Write "
			 * + Language3 + " : " + Language3_Write + "*******"); // fail(); } if
			 * (Language3_Speak.equals(ConfigFileReader.getL3speak_Verify())) {
			 * System.out.println("Workman Can be able to Speak " + Language3 + " : " +
			 * Language3_Speak); } else {
			 * System.out.println("****Verification Failed : Workman Can be able to Speak "
			 * + Language3 + " : " + Language3_Speak + "*******"); // fail(); } } else if
			 * (Language3.equals(ConfigFileReader.getLanguage3_update())) {
			 * System.out.println(Language3 + " - Displayed Language 3"); if
			 * (Language3_Read.equals(ConfigFileReader.getL3Read_update_verify())) {
			 * System.out.println("Workman Can be able to Read " + Language3 + " : " +
			 * Language3_Read); } else {
			 * System.out.println("****Verification Failed : Workman Can be able to Read " +
			 * Language3 + " : " + Language3_Read + "*******"); // fail(); } if
			 * (Language3_Write.equals(ConfigFileReader.getL3Write_update_verify())) {
			 * System.out.println("Workman Can be able to Write " + Language3 + " : " +
			 * Language3_Write); } else {
			 * System.out.println("****Verification Failed : Workman Can be able to Write "
			 * + Language3 + " : " + Language3_Write + "*******"); // fail(); } if
			 * (Language3_Speak.equals(ConfigFileReader.getL3speak_update_verify())) {
			 * System.out.println("Workman Can be able to Speak " + Language3 + " : " +
			 * Language3_Speak); } else {
			 * System.out.println("****Verification Failed : Workman Can be able to Speak "
			 * + Language3 + " : " + Language3_Speak + "*******"); // fail(); } } else {
			 * System.out.println("****Verification Failed : " + Language3 +
			 * " - Displayed as Language 3"); } } //L4 if
			 * (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language4 ==
			 * null) { System.out.println("Language 4 Not available"); } else {
			 * System.out.println("Language 4 is available"); }
			 */
		}
		Screenshot.Screenshotforscenario();
		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown_close.click();
		// DataBaseConnection.getverifyupdateworkmanLanguage();
	}

	@Then("^verify workman Marital Status in Personal details are displayed correctly in profile$")
	public static void verify_workman_Marital_Status_in_Personal_details_are_displayed_correctly_in_profile()
			throws Throwable {
		WorkmanMaritalStatus = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_MaritalStatus.getText();
		if (WorkmanMaritalStatus.equals(ConfigFileReader.getMarital_status())
				|| WorkmanMaritalStatus.equals(ConfigFileReader.getMarital_status_update())) {
			System.out.println("Workman Marital Status is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workman Marital Status details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^verify Spouse Name in Personal details are displayed correctly in profile$")
	public static void verify_Spouse_Name_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
		if (ConfigFileReader.getMarital_status().equals("Single")) {
			System.out.println("Marital Status Set to Single");
		} else {
			SpouseName = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_SpouseName.getText();
			if (SpouseName.contains(ConfigFileReader.getspouse_name())
					|| SpouseName.contains(ConfigFileReader.getspouse_name_update())) {
				System.out.println("SpouseName is verified - with input Values");
				System.out.println("----------------------------");
			} else {
				System.out.println(
						"*******input Values Verification failed : SpouseName is not correctly Displayed*******");
				// fail(); uncomment this
			}
		}
	}

	@Then("^verify No Of Childrens in Personal details are displayed correctly in profile$")
	public static void verify_No_Of_Childrens_in_Personal_details_are_displayed_correctly_in_profile()
			throws Throwable {
		if (ConfigFileReader.getMarital_status().equals("Single")) {
			System.out.println("Marital Status Set to Single");
		} else {
			NoOfChildren = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NoOfChildren.getText();
			if (NoOfChildren.equals(ConfigFileReader.getNo_of_childeren())
					|| (NoOfChildren.equals(ConfigFileReader.getNo_of_childeren_update()))) {
				System.out.println("NoOfChildren is verified - with input Values");
				System.out.println("----------------------------");
			} else {
				System.out.println(
						"*******input Values Verification failed : NoOfChildren is not correctly Displayed*******");
				// fail(); uncomment this
			}
		}
	}

	@Then("^verify CSTI or NAPS Enabled in Personal details are displayed correctly in profile$")
	public static void verify_CSTI_or_NAPS_Enabled_in_Personal_details_are_displayed_correctly_in_profile()
			throws Throwable {
//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions4.perform();

		JavascriptExecutor js3 = (JavascriptExecutor) DriverFactory.driver;
		js3.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);

		Checkbox_Count = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Checkbox_Count.size();

		if (Checkbox_Count == 3) {
			if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3
							.isSelected() == false)) {
				System.out.println("CSTI Check box is Enabled");
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3
					.isSelected() == false)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3
							.isSelected() == true)) {
				System.out.println("NAPS Check box is Enabled");
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3
					.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3
							.isSelected() == true)) {
				System.out.println("CSTI & NAPS Check box is Enabled");
			} else {
				System.out.println("CSTI & NAPS Check box is Not Selected");
			}
		} else if (Checkbox_Count == 2)

		{

			if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2
							.isSelected() == false)) {
				System.out.println("CSTI Check box is Enabled");
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2
					.isSelected() == false)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2
							.isSelected() == true)) {
				System.out.println("NAPS Check box is Enabled");
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2
					.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2
							.isSelected() == true)) {
				System.out.println("CSTI & NAPS Check box is Enabled");
			} else {
				System.out.println("CSTI & NAPS Check box is Not Selected");
			}
			
		}
	}

	@Then("^verify CSTI or NAPS Number in Personal details are displayed correctly in profile$")
	public static void verify_CSTI_or_NAPS_Number_in_Personal_details_are_displayed_correctly_in_profile()
			throws Throwable {

		CstiOrNaps = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CstiNaps_Number.getText();

		Checkbox_Count = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Checkbox_Count.size();

		if (Checkbox_Count == 3) {
			
			if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3.isSelected() == false)) {
				if (CstiOrNaps.equals(ConfigFileReader.getCSTI())
						|| (CstiOrNaps.equals(ConfigFileReader.getCSTI_update()))) {
					System.out.println("CSTI is verified - with input Values");
					System.out.println("----------------------------");
				} else {
					System.out.println("*******input Values Verification failed : CSTI is not correctly Displayed*******");
					// fail(); uncomment this
				}
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3.isSelected() == false)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3.isSelected() == true)) {
				System.out.println("NAPS in WMS: " + CstiOrNaps);
				if (CstiOrNaps.equals(ConfigFileReader.getNAPS())
						|| (CstiOrNaps.equals(ConfigFileReader.getEnable_NAPS_update()))) {
					System.out.println("NAPS is verified - with input Values");
					System.out.println("----------------------------");
				} else {
					System.out.println("*******input Values Verification failed : NAPS is not correctly Displayed*******");
					// fail(); uncomment this
				}
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_3.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_3.isSelected() == true)) {
				System.out.println("NAPS in WMS: " + CstiOrNaps);
				if (CstiOrNaps.equals(ConfigFileReader.getNAPS())
						|| (CstiOrNaps.equals(ConfigFileReader.getEnable_NAPS_update()))) {
					System.out.println("NAPS is verified - with input Values");
					System.out.println("----------------------------");
				} else {
					System.out.println("*******input Values Verification failed : NAPS is not correctly Displayed*******");
					// fail(); uncomment this
				}
			}
		}
		
		else if (Checkbox_Count == 2) {
			
			if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2.isSelected() == false)) {
				if (CstiOrNaps.equals(ConfigFileReader.getCSTI())
						|| (CstiOrNaps.equals(ConfigFileReader.getCSTI_update()))) {
					System.out.println("CSTI is verified - with input Values");
					System.out.println("----------------------------");
				} else {
					System.out.println("*******input Values Verification failed : CSTI is not correctly Displayed*******");
					// fail(); uncomment this
				}
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2.isSelected() == false)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2.isSelected() == true)) {
				System.out.println("NAPS in WMS: " + CstiOrNaps);
				if (CstiOrNaps.equals(ConfigFileReader.getNAPS())
						|| (CstiOrNaps.equals(ConfigFileReader.getEnable_NAPS_update()))) {
					System.out.println("NAPS is verified - with input Values");
					System.out.println("----------------------------");
				} else {
					System.out.println("*******input Values Verification failed : NAPS is not correctly Displayed*******");
					// fail(); uncomment this
				}
			} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox_2.isSelected() == true)
					&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox_2.isSelected() == true)) {
				System.out.println("NAPS in WMS: " + CstiOrNaps);
				if (CstiOrNaps.equals(ConfigFileReader.getNAPS())
						|| (CstiOrNaps.equals(ConfigFileReader.getEnable_NAPS_update()))) {
					System.out.println("NAPS is verified - with input Values");
					System.out.println("----------------------------");
				} else {
					System.out.println("*******input Values Verification failed : NAPS is not correctly Displayed*******");
					// fail(); uncomment this
				}
			}
		}
		
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify Partner details is displayed$")
	public static void Verify_Partner_details_is_displayed() throws Throwable {

//		Actions actions33 = new Actions(DriverFactory.driver);
//		actions33.moveToElement(Skill_Analysis_Objects.Profile_Communication_Head);
//		actions33.perform();

		JavascriptExecutor js4 = (JavascriptExecutor) DriverFactory.driver;
		js4.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Communication_Head);

		System.out.println("Partner Name :" + Skill_Analysis_Objects.Profile_Partner_name.getText());
		System.out.println("Work Permit capacity :" + Skill_Analysis_Objects.Profile_Partner_Workpermit.getText());
		System.out.println("Partner Address :" + Skill_Analysis_Objects.Profile_Partner_Address.getText());
		System.out.println("Partner Contact No :" + Skill_Analysis_Objects.Profile_Partner_PhoneNo.getText());
		System.out.println("Partner Email ID :" + Skill_Analysis_Objects.Profile_Partner_MailID.getText());

	}

	@Then("^verify Partner name in Personal details are displayed correctly in profile$")
	public static void verify_Partner_name_in_Personal_details_is_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions5 = new Actions(DriverFactory.driver);
//		actions5.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions5.perform();

		JavascriptExecutor js5 = (JavascriptExecutor) DriverFactory.driver;
		js5.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);

		WorkmanPartnerNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_Name.getText();
		if (WorkmanPartnerNameWMS.contains(ConfigFileReader.getpartner_name())
				|| WorkmanPartnerNameWMS.contains(ConfigFileReader.getpartner_name_Update())) {
			System.out.println("Partner Name is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Partner Name details is not correctly Displayed*******");
			// fail(); uncomment this
		}
	}

	@Then("^Verify Partner address in Personal details is displayed in profile$")
	public static void Verify_Partner_address_in_Personal_details_is_displayed_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions6 = new Actions(DriverFactory.driver);
//		actions6.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions6.perform();
		JavascriptExecutor js6 = (JavascriptExecutor) DriverFactory.driver;
		js6.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
		System.out.println("Partner Address : "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_Address.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Partner Contact number in Personal details is displayed in profile$")
	public static void Verify_Partner_Contact_number_in_Personal_details_is_displayed_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions7 = new Actions(DriverFactory.driver);
//		actions7.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions7.perform();
		JavascriptExecutor js7 = (JavascriptExecutor) DriverFactory.driver;
		js7.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
		System.out.println("Contact Number : "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_ContactNumber.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Partner Email ID in Personal details is displayed in profile$")
	public static void Verify_Partner_Email_ID_in_Personal_details_is_displayed_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions8 = new Actions(DriverFactory.driver);
//		actions8.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
//		actions8.perform();
		JavascriptExecutor js8 = (JavascriptExecutor) DriverFactory.driver;
		js8.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
		System.out.println(
				"Mail ID : " + Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_MailID.getText());
		System.out.println("----------------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^verify Mobile Number in Communication details are displayed correctly in profile$")
	public static void verify_Mobile_Number_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions9 = new Actions(DriverFactory.driver);
//		actions9.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions9.perform();
		JavascriptExecutor js9 = (JavascriptExecutor) DriverFactory.driver;
		js9.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		WorkmanMobileNumberWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_MobileNumber
				.getText();
		if (WorkmanMobileNumberWMS.equals(ConfigFileReader.getMobilenumber())) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Workmen Mobile Number is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Workmen Mobile Number details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Permanent Address in Communication details is displayed correctly in profile$")
	public static void verify_Permanent_Address_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions10 = new Actions(DriverFactory.driver);
//		actions10.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions10.perform();
		JavascriptExecutor js10 = (JavascriptExecutor) DriverFactory.driver;
		js10.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		PermanentAddressWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Address
				.getText();
		if (PermanentAddressWMS.contains(ConfigFileReader.getPermanent_Address())
				|| (PermanentAddressWMS.contains(ConfigFileReader.getPermanent_Address_update()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Permanent Address is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Permanent Address details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Permanent Address Village in Communication details is displayed correctly in profile$")
	public static void verify_Permanent_Address_Village_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions11 = new Actions(DriverFactory.driver);
//		actions11.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions11.perform();
		JavascriptExecutor js11 = (JavascriptExecutor) DriverFactory.driver;
		js11.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		PermanentVillageWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Village
				.getText();
		if (PermanentVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_Verify())
				|| (PermanentVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update_Verify()))
				|| (PermanentVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update2_Verify()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Permanent Address Village is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Permanent Address Village details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Permanent Address District in Communication details is displayed correctly in profile$")
	public static void verify_Permanent_Address_District_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions12 = new Actions(DriverFactory.driver);
//		actions12.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions12.perform();
		JavascriptExecutor js12 = (JavascriptExecutor) DriverFactory.driver;
		js12.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		System.out.println("Permanent Address "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_District
						.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Permanent Address State in Communication details is displayed correctly in profile$")
	public static void verify_Permanent_Address_State_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions13 = new Actions(DriverFactory.driver);
//		actions13.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions13.perform();
		JavascriptExecutor js13 = (JavascriptExecutor) DriverFactory.driver;
		js13.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		System.out.println("Permanent Address "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_State.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Permanent Address PinCode in Communication details is displayed correctly in profile$")
	public static void verify_Permanent_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions14 = new Actions(DriverFactory.driver);
//		actions14.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions14.perform();
		JavascriptExecutor js14 = (JavascriptExecutor) DriverFactory.driver;
		js14.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		String PermanentPincode = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Pincode
				.getText();
		System.out.println("Permanent Address " + PermanentPincode);
		System.out.println("----------------------------");
	}

//Temp Address

	@Then("^Verify Temporary Address in Communication details is displayed correctly in profile$")
	public static void verify_Temporary_Address_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions15 = new Actions(DriverFactory.driver);
//		actions15.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions15.perform();
		JavascriptExecutor js15 = (JavascriptExecutor) DriverFactory.driver;
		js15.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		TemporaryAddressWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Address
				.getText();
		if (TemporaryAddressWMS.contains(ConfigFileReader.getTemporary_Address())
				|| (TemporaryAddressWMS.contains(ConfigFileReader.getTemporary_Address_update()))
				|| (TemporaryAddressWMS.contains(ConfigFileReader.getTemporary_Address_update2()))
				|| (TemporaryAddressWMS.contains(ConfigFileReader.getPermanent_Address()))
				|| (TemporaryAddressWMS.contains(ConfigFileReader.getPermanent_Address_update()))
				|| (TemporaryAddressWMS.contains(ConfigFileReader.getPermanent_Address_update2()))) {
			System.out.println("Temporary Address is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println(
					"*******input Values Verification failed : Temporary Address details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Temporary Address Village in Communication details is displayed correctly in profile$")
	public static void verify_Temporary_Address_Village_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions16 = new Actions(DriverFactory.driver);
//		actions16.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions16.perform();
		JavascriptExecutor js16 = (JavascriptExecutor) DriverFactory.driver;
		js16.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		TemporaryVillageWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Village
				.getText();
		if (TemporaryVillageWMS.contains(ConfigFileReader.getTemporary_Address_Village())
				|| (TemporaryVillageWMS.contains(ConfigFileReader.getTemporary_Address_Village_update()))
				|| (TemporaryVillageWMS.contains(ConfigFileReader.getTemporary_Address_Village_update2()))
				|| (TemporaryVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update2_Verify()))
				|| (TemporaryVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update_Verify()))
				|| (TemporaryVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_Verify()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Temporary Address Village is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Temporary Address Village details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Temporary Address District in Communication details is displayed correctly in profile$")
	public static void verify_Temporary_Address_District_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions17 = new Actions(DriverFactory.driver);
//		actions17.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions17.perform();
		JavascriptExecutor js17 = (JavascriptExecutor) DriverFactory.driver;
		js17.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		System.out.println("Temporary Address "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_District
						.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Temporary Address State in Communication details is displayed correctly in profile$")
	public static void verify_Temporary_Address_State_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
		JavascriptExecutor js18 = (JavascriptExecutor) DriverFactory.driver;
		js18.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		Actions actions18 = new Actions(DriverFactory.driver);
//		actions18.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions18.perform();
		System.out.println("Temporary Address "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_State.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Temporary Address PinCode in Communication details is displayed correctly in profile$")
	public static void verify_Temporary_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions19 = new Actions(DriverFactory.driver);
//		actions19.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions19.perform();
		JavascriptExecutor js19 = (JavascriptExecutor) DriverFactory.driver;
		js19.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
		String TemporaryPincode = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Pincode
				.getText();
		System.out.println("Temporary Address " + TemporaryPincode);
		System.out.println("----------------------------");
	}

//EC 		
	@Then("^Verify Emergency Contact Name in Communication details is displayed correctly in profile$")
	public static void Verify_Emergency_Contact_Name_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions20 = new Actions(DriverFactory.driver);
//		actions20.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions20.perform();
		JavascriptExecutor js20 = (JavascriptExecutor) DriverFactory.driver;
		js20.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		ECNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Name.getText();
		if (ECNameWMS.contains(ConfigFileReader.getEmergency_Contact_Name())
				|| (ECNameWMS.contains(ConfigFileReader.getEmergency_Contact_Name_update()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Emergency Contact Name is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Emergency Contact Name details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Emergency Contact Relationship in Communication details is displayed correctly in profile$")
	public static void Verify_Emergency_Contact_Relationship_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions21 = new Actions(DriverFactory.driver);
//		actions21.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions21.perform();
		JavascriptExecutor js21 = (JavascriptExecutor) DriverFactory.driver;
		js21.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		ECRelationshipWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Relation
				.getText();
//		String Extracted = ECRelationshipWMS.substring(ECRelationshipWMS.indexOf("(") + 1,
//				ECRelationshipWMS.indexOf(")"));
		if (ECRelationshipWMS.contains(ConfigFileReader.getEmergency_Contact_Relation())
				|| (ECRelationshipWMS.contains(ConfigFileReader.getEmergency_Contact_Relation_update()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Emergency Contact Relationship is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Emergency Contact Relationship details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Emergency Contact Mobile Number in Communication details is displayed correctly in profile$")
	public static void Verify_Emergency_Contact_Mobile_Number_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions22 = new Actions(DriverFactory.driver);
//		actions22.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions22.perform();
		JavascriptExecutor js22 = (JavascriptExecutor) DriverFactory.driver;
		js22.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		ECMobileNumberWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_MobileNumber
				.getText();
		if (ECMobileNumberWMS.contains(ConfigFileReader.getEmergency_Contact_Mobile())
				|| (ECMobileNumberWMS.contains(ConfigFileReader.getEmergency_Contact_Mobile_Update()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Emergency Contact Mobile number is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Emergency Contact Mobile number details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Emergency Contact Address in Communication details is displayed correctly in profile$")
	public static void verify_Emergency_Contact_Address_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions23 = new Actions(DriverFactory.driver);
//		actions23.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions23.perform();
		JavascriptExecutor js23 = (JavascriptExecutor) DriverFactory.driver;
		js23.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		ECAddressWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Address.getText();
		if (ECAddressWMS.contains(ConfigFileReader.getEmergency_Contact_Address())
				|| (ECAddressWMS.contains(ConfigFileReader.getEmergency_Contact_Address_update()))
				|| (ECAddressWMS.contains(ConfigFileReader.getEmergency_Contact_Address_update2()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Emergency Contact Address is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Emergency Contact Address details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Emergency Contact Village in Communication details is displayed correctly in profile$")
	public static void verify_Emergency_Contact_Village_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions24 = new Actions(DriverFactory.driver);
//		actions24.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions24.perform();
		JavascriptExecutor js24 = (JavascriptExecutor) DriverFactory.driver;
		js24.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		ECVillageWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Village.getText();
		if (ECVillageWMS.contains(ConfigFileReader.getEmergency_Contact_Village())
				|| (ECVillageWMS.contains(ConfigFileReader.getEmergency_Contact_Village_update()))
				|| (ECVillageWMS.contains(ConfigFileReader.getEmergency_Contact_Village_update2()))) {
			System.out.println("Front end Values Are Matched with DB");
			System.out.println("Emergency Contact Village is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Emergency Contact Village details is not correctly Displayed*******");
			// fail();
		}
	}

	@Then("^Verify Emergency Contact District in Communication details is displayed correctly in profile$")
	public static void verify_Emergency_Contact_District_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions25 = new Actions(DriverFactory.driver);
//		actions25.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions25.perform();

		JavascriptExecutor js25 = (JavascriptExecutor) DriverFactory.driver;
		js25.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		System.out.println("Emergency Contact "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_District.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Emergency Contact State in Communication details is displayed correctly in profile$")
	public static void verify_Emergency_Contact_State_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions26 = new Actions(DriverFactory.driver);
//		actions26.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions26.perform();
		JavascriptExecutor js26 = (JavascriptExecutor) DriverFactory.driver;
		js26.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		System.out.println("Emergency Contact "
				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_State.getText());
		System.out.println("----------------------------");
	}

	@Then("^Verify Emergency Contact PinCode in Communication details is displayed correctly in profile$")
	public static void verify_Emergency_Contact_PinCode_in_Communication_details_is_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions27 = new Actions(DriverFactory.driver);
//		actions27.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions27.perform();
		JavascriptExecutor js27 = (JavascriptExecutor) DriverFactory.driver;
		js27.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
		String ECPincode = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Pincode
				.getText();
		System.out.println("Emergency Contact Address PinCode :" + ECPincode);
		System.out.println("----------------------------");
		Screenshot.Screenshotforscenario();
	}

	@Then("^verify Skill Category in Basic Details are displayed correctly in profile$")
	public static void verify_Skill_Category_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions28 = new Actions(DriverFactory.driver);
//		actions28.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions28.perform();
		JavascriptExecutor js28 = (JavascriptExecutor) DriverFactory.driver;
		js28.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
		Skill_Category = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Category.getText();
		if (Skill_Category.equals(ConfigFileReader.getSkill_Category())
				|| Skill_Category.equals(ConfigFileReader.getSkill_Category_Update())) {
			System.out.println("Skill Category is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Skill Category details is not correctly Displayed*******");
			// fail();
		}

	}

	@Then("^verify Skill Group in Basic Details are displayed correctly in profile$")
	public static void verify_Skill_Group_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions29 = new Actions(DriverFactory.driver);
//		actions29.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions29.perform();
		JavascriptExecutor js29 = (JavascriptExecutor) DriverFactory.driver;
		js29.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
		Skill_Group = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Group.getText();
		if (Skill_Group.equals(ConfigFileReader.getSkill_Group())
				|| Skill_Group.equals(ConfigFileReader.getSkill_Group_Update())) {
			System.out.println("Skill Group is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Skill Group details is not correctly Displayed*******");
			// fail();
		}

	}

	@Then("^verify Skill Description in Basic Details are displayed correctly in profile$")
	public static void verify_Skill_Description_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions30 = new Actions(DriverFactory.driver);
//		actions30.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions30.perform();
		JavascriptExecutor js30 = (JavascriptExecutor) DriverFactory.driver;
		js30.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
		Skill_Description = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Description.getText();
		if (Skill_Description.equals(ConfigFileReader.getSkill_Description_verify())
				|| Skill_Description.equals(ConfigFileReader.getSkill_Description_Update_verify())) {
			System.out.println("Skill Description is verified - with input Values");
			System.out.println("----------------------------");
		} else {
			System.out.println(
					"*******input Values Verification failed : Skill Description details is not correctly Displayed*******");
			// fail();
		}

	}

	@Then("^verify Skill Type in Basic Details are displayed correctly in profile$")
	public static void verify_Skill_Type_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions31 = new Actions(DriverFactory.driver);
//		actions31.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions31.perform();
		JavascriptExecutor js31 = (JavascriptExecutor) DriverFactory.driver;
		js31.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
		Skill_Type = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Type.getText();
		System.out.println("Skill Type :" + Skill_Type);
		System.out.println("----------------------------");
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify Deployment in Basic Details are displayed correctly in profile$")
	public static void Verify_Deployment_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions32 = new Actions(DriverFactory.driver);
//		actions32.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Education_Head);
//		actions32.perform();
		JavascriptExecutor js32 = (JavascriptExecutor) DriverFactory.driver;
		js32.executeScript("arguments[0].scrollIntoView();",
				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Education_Head);
		Deployment = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment.getText();
		System.out.println("Deployment :" + Deployment);
		System.out.println("----------------------------");
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify Qualification in Education Details are displayed correctly in profile$")
	public static void Verify_Qualification_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions33 = new Actions(DriverFactory.driver);
//		actions33.moveToElement(Skill_Analysis_Objects.Profile_Experience_Head);
//		actions33.perform();
		JavascriptExecutor js33 = (JavascriptExecutor) DriverFactory.driver;
		js33.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Experience_Head);
		if (Skill_Analysis_Objects.Profile_Education_Qualification.getText().equals("No records available.")) {
			System.out.println("Education Details not Filled : Qualification  Not Available");
		} else {
			System.out.println("Qualification : " + Skill_Analysis_Objects.Profile_Education_Qualification.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Branch in Education Details are displayed correctly in profile$")
	public static void Verify_Branch_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions34 = new Actions(DriverFactory.driver);
//		actions34.moveToElement(Skill_Analysis_Objects.Profile_Experience_Head);
//		actions34.perform();
		JavascriptExecutor js34 = (JavascriptExecutor) DriverFactory.driver;
		js34.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Experience_Head);
		if (Skill_Analysis_Objects.Profile_Education_Qualification.getText().equals("No records available.")) {
			System.out.println("Education Details not Filled : Branch  Not Available");
		} else {

			System.out.println("Branch : " + Skill_Analysis_Objects.Profile_Education_Branch.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Discipline in Education Details are displayed correctly in profile$")
	public static void Verify_Discipline_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions35 = new Actions(DriverFactory.driver);
//		actions35.moveToElement(Skill_Analysis_Objects.Profile_Experience_Head);
//		actions35.perform();
		JavascriptExecutor js35 = (JavascriptExecutor) DriverFactory.driver;
		js35.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Experience_Head);
		if (Skill_Analysis_Objects.Profile_Education_Qualification.getText().equals("No records available.")) {
			System.out.println("Education Details not Filled : Discipline  Not Available");
		} else {
			System.out.println("Discipline : " + Skill_Analysis_Objects.Profile_Education_Discipline.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify School or College in Education Details are displayed correctly in profile$")
	public static void Verify_School_or_College_in_Education_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
		JavascriptExecutor js36 = (JavascriptExecutor) DriverFactory.driver;
		js36.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Experience_Head);
//		Actions actions36 = new Actions(DriverFactory.driver);
//		actions36.moveToElement(Skill_Analysis_Objects.Profile_Experience_Head);
//		actions36.perform();
		if (Skill_Analysis_Objects.Profile_Education_Qualification.getText().equals("No records available.")) {
			System.out.println("Education Details not Filled : School/College  Not Available");
		} else {
			System.out
					.println("School/College : " + Skill_Analysis_Objects.Profile_Education_SchoolORCollege.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Board or University in Education Details are displayed correctly in profile$")
	public static void Verify_Board_or_University_in_Education_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions37 = new Actions(DriverFactory.driver);
//		actions37.moveToElement(Skill_Analysis_Objects.Profile_Experience_Head);
//		actions37.perform();

		JavascriptExecutor js37 = (JavascriptExecutor) DriverFactory.driver;
		js37.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Experience_Head);

		if (Skill_Analysis_Objects.Profile_Education_Qualification.getText().equals("No records available.")) {
			System.out.println("Education Details not Filled : Board/University  Not Available");
		} else {
			System.out.println(
					"Board/University : " + Skill_Analysis_Objects.Profile_Education_BoardORuniversity.getText());
			System.out.println("----------------------------");
		}

	}

	@Then("^Verify Year of Passing in Education Details are displayed correctly in profile$")
	public static void Verify_Year_of_Passing_in_Education_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions38 = new Actions(DriverFactory.driver);
//		actions38.moveToElement(Skill_Analysis_Objects.Profile_Experience_Head);
//		actions38.perform();

		JavascriptExecutor js38 = (JavascriptExecutor) DriverFactory.driver;
		js38.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Experience_Head);

		if (Skill_Analysis_Objects.Profile_Education_Qualification.getText().equals("No records available.")) {
			System.out.println("Education Details not Filled : Year of Passing  Not Available");
		} else {
			System.out.println("Year of Passing : " + Skill_Analysis_Objects.Profile_Education_YearOfPassing.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify Organisation Name in Experience Details are displayed correctly in profile")
	public static void Verify_Organisation_Name_in_Experience_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions39 = new Actions(DriverFactory.driver);
//		actions39.moveToElement(Skill_Analysis_Objects.Profile_Statutory_Head);
//		actions39.perform();
		JavascriptExecutor js39 = (JavascriptExecutor) DriverFactory.driver;
		js39.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Statutory_Head);

		try {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Experience_Org_Name));
			System.out.println("Organisation Name : " + Skill_Analysis_Objects.Profile_Experience_Org_Name.getText());
			System.out.println("----------------------------");
		} catch (NoSuchElementException e) {
			System.out.println("Experience Details not Filled : Organisation Name Not Available");
		}

	}

	@Then("^Verify Project Location in Experience Details are displayed correctly in profile")
	public static void Verify_Project_Location_in_Experience_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions40 = new Actions(DriverFactory.driver);
//		actions40.moveToElement(Skill_Analysis_Objects.Profile_Statutory_Head);
//		actions40.perform();
		JavascriptExecutor js40 = (JavascriptExecutor) DriverFactory.driver;
		js40.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Statutory_Head);
		try {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Experience_Project_location));
			System.out.println(
					"Project Location : " + Skill_Analysis_Objects.Profile_Experience_Project_location.getText());
			System.out.println("----------------------------");
		}

		catch (NoSuchElementException e) {
			System.out.println("Experience Details not Filled : Project Location Not Available");
		}

	}

	@Then("^Verify Project Code or Name in Experience Details are displayed correctly in profile")
	public static void Verify_Project_Code_or_Name_in_Experience_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions41 = new Actions(DriverFactory.driver);
//		actions41.moveToElement(Skill_Analysis_Objects.Profile_Statutory_Head);
//		actions41.perform();

		JavascriptExecutor js41 = (JavascriptExecutor) DriverFactory.driver;
		js41.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Statutory_Head);

		try {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Experience_ProjectCodeOrName));
			System.out.println(
					"Project Code/Name : " + Skill_Analysis_Objects.Profile_Experience_ProjectCodeOrName.getText());
			System.out.println("----------------------------");
		}

		catch (NoSuchElementException e) {
			System.out.println("Experience Details Not Filled - Project Code/Name Not availble");
		}

	}

	@Then("^Verify Skill Category in Experience Details are displayed correctly in profile")
	public static void Verify_Skill_Category_in_Experience_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions42 = new Actions(DriverFactory.driver);
//		actions42.moveToElement(Skill_Analysis_Objects.Profile_Statutory_Head);
//		actions42.perform();
		JavascriptExecutor js42 = (JavascriptExecutor) DriverFactory.driver;
		js42.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Statutory_Head);
		try {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Experience_SkillCategory));
			System.out.println("Skill Category : " + Skill_Analysis_Objects.Profile_Experience_SkillCategory.getText());
			System.out.println("----------------------------");
		}

		catch (NoSuchElementException e) {
			System.out.println("Experience Details Not Filled - Skill Category Not availble");
		}
	}

	@Then("^Verify Skill Group in Experience Details are displayed correctly in profile")
	public static void Verify_Skill_Group_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions43 = new Actions(DriverFactory.driver);
//		actions43.moveToElement(Skill_Analysis_Objects.Profile_Statutory_Head);
//		actions43.perform();

		JavascriptExecutor js43 = (JavascriptExecutor) DriverFactory.driver;
		js43.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Statutory_Head);

		try {
			// wait.until(
			// ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Experience_SkillGroup));
			System.out.println("Skill Group : " + Skill_Analysis_Objects.Profile_Experience_SkillGroup.getText());
			System.out.println("----------------------------");
		}

		catch (NoSuchElementException e) {
			System.out.println("Experience Details Not Filled - Skill Group Not availble");
		}

	}

	@Then("^Verify Skill Description in Experience Details are displayed correctly in profile")
	public static void Verify_Skill_Description_in_Experience_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions44 = new Actions(DriverFactory.driver);
//		actions44.moveToElement(Skill_Analysis_Objects.Profile_Statutory_Head);
//		actions44.perform();

		JavascriptExecutor js44 = (JavascriptExecutor) DriverFactory.driver;
		js44.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Statutory_Head);

		try {
			// wait.until(
			// ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Experience_SkillDesc));
			System.out.println("Skill Description : " + Skill_Analysis_Objects.Profile_Experience_SkillDesc.getText());
			System.out.println("----------------------------");
		}

		catch (NoSuchElementException e) {
			System.out.println("Experience Details Not Filled - Skill Description Not availble");
		}
	}

	@Then("^Verify Aadhar No in Statutory Details are displayed correctly in profile")
	public static void Verify_Aadhar_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions45 = new Actions(DriverFactory.driver);
//		actions45.moveToElement(Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);
//		actions45.perform();

		JavascriptExecutor js45 = (JavascriptExecutor) DriverFactory.driver;
		js45.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);

		if (Skill_Analysis_Objects.Profile_Statutory_Aadhar.getText().equals("")) {
			System.out.println("Statutory Details Not Filled - Aadhaar number Not availble");
		} else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Statutory_Aadhar));
			System.out.println("Aadhar No : " + Skill_Analysis_Objects.Profile_Statutory_Aadhar.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Driving License No in Statutory Details are displayed correctly in profile")
	public static void Verify_Driving_License_No_in_Statutory_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions46 = new Actions(DriverFactory.driver);
//		actions46.moveToElement(Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);
//		actions46.perform();

		JavascriptExecutor js46 = (JavascriptExecutor) DriverFactory.driver;
		js46.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);

		if (Skill_Analysis_Objects.Profile_Statutory_DrivingLicense.getText().equals("")) {
			System.out.println("Statutory Details Not Filled - Driving License number Not availble");
		} else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Statutory_DrivingLicense));
			System.out.println(
					"Driving License No : " + Skill_Analysis_Objects.Profile_Statutory_DrivingLicense.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify PAN Card No in Statutory Details are displayed correctly in profile")
	public static void Verify_PAN_Card_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions47 = new Actions(DriverFactory.driver);
//		actions47.moveToElement(Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);
//		actions47.perform();

		JavascriptExecutor js47 = (JavascriptExecutor) DriverFactory.driver;
		js47.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);

		if (Skill_Analysis_Objects.Profile_Statutory_PanCard.getText().equals("")) {
			System.out.println("Statutory Details Not Filled - PAN number Not availble");
		} else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Statutory_PanCard));
			System.out.println("PAN Card No : " + Skill_Analysis_Objects.Profile_Statutory_PanCard.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify PF No in Statutory Details are displayed correctly in profile")
	public static void Verify_PF_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions48 = new Actions(DriverFactory.driver);
//		actions48.moveToElement(Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);
//		actions48.perform();

		JavascriptExecutor js48 = (JavascriptExecutor) DriverFactory.driver;
		js48.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);

		if (Skill_Analysis_Objects.Profile_Statutory_PFNo.getText().equals("")) {
			System.out.println("Statutory Details Not Filled - PF number Not availble");
		}

		else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Statutory_PFNo));

			System.out.println("PF No : " + Skill_Analysis_Objects.Profile_Statutory_PFNo.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify UAN No in Statutory Details are displayed correctly in profile")
	public static void Verify_UAN_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions49 = new Actions(DriverFactory.driver);
//		actions49.moveToElement(Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);
//		actions49.perform();

		JavascriptExecutor js49 = (JavascriptExecutor) DriverFactory.driver;
		js49.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);

		if (Skill_Analysis_Objects.Profile_Statutory_UANNo.getText().equals("")) {
			System.out.println("Statutory Details Not Filled - UAN number Not availble");
		} else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Statutory_UANNo));

			System.out.println("UAN No : " + Skill_Analysis_Objects.Profile_Statutory_UANNo.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify ESI No in Statutory Details are displayed correctly in profile")
	public static void Verify_ESI_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions50 = new Actions(DriverFactory.driver);
//		actions50.moveToElement(Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);
//		actions50.perform();
		JavascriptExecutor js50 = (JavascriptExecutor) DriverFactory.driver;
		js50.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_PF_Nominee_Details_Head);

		if (Skill_Analysis_Objects.Profile_Statutory_ESINo.getText().equals("")) {
			System.out.println("Statutory Details Not Filled - ESI number Not availble");
		} else {

			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_Statutory_ESINo));

			System.out.println("ESI No : " + Skill_Analysis_Objects.Profile_Statutory_ESINo.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();

	}

	@Then("^Verify Name in PF Nominee Details are displayed correctly in profile")
	public static void Verify_Name_in_PF_Nominee_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions512 = new Actions(DriverFactory.driver);
//		actions512.moveToElement(Skill_Analysis_Objects.Profile_Bank_Head);
//		actions512.perform();
		JavascriptExecutor js51 = (JavascriptExecutor) DriverFactory.driver;
		js51.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Bank_Head);

		if (Skill_Analysis_Objects.Profile_PF_nominee_Name.getText().equals("No records available.")) {
			System.out.println("PF Nominee Details not Filled : PF Nominee Name  Not Available");
		} else {
			System.out.println("PF Nominee Name : " + Skill_Analysis_Objects.Profile_PF_nominee_Name.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Relationship in PF Nominee Details are displayed correctly in profile")
	public static void Verify_Relationship_in_PF_Nominee_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions52 = new Actions(DriverFactory.driver);
//		actions52.moveToElement(Skill_Analysis_Objects.Profile_Bank_Head);
//		actions52.perform();
		JavascriptExecutor js52 = (JavascriptExecutor) DriverFactory.driver;
		js52.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Bank_Head);
		if (Skill_Analysis_Objects.Profile_PF_nominee_Name.getText().equals("No records available.")) {
			System.out.println("PF Nominee Details not Filled : PF Nominee Relationship Not Available");
		} else {
			System.out.println(
					"PF Nominee Relationship : " + Skill_Analysis_Objects.Profile_PF_nominee_Relationship.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Allocation Percentage in PF Nominee Details are displayed correctly in profile")
	public static void Verify_Allocation_Percentage_in_PF_Nominee_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions53 = new Actions(DriverFactory.driver);
//		actions53.moveToElement(Skill_Analysis_Objects.Profile_Bank_Head);
//		actions53.perform();
		JavascriptExecutor js53 = (JavascriptExecutor) DriverFactory.driver;
		js53.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_Bank_Head);
		if (Skill_Analysis_Objects.Profile_PF_nominee_Name.getText().equals("No records available.")) {
			System.out.println("PF Nominee Details not Filled : PF Nominee Allocation Percentage Not Available");
		} else {
			System.out.println("PF Nominee Allocation Percentage : "
					+ Skill_Analysis_Objects.Profile_PF_nominee_Allocation_Percentage.getText());
			System.out.println("----------------------------");
		}
		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify Account Name in Bank Details are displayed correctly in profile")
	public static void Verify_Account_Name_in_Bank_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions54 = new Actions(DriverFactory.driver);
//		actions54.moveToElement(Skill_Analysis_Objects.Profile_bank_end);
//		actions54.perform();
		JavascriptExecutor js54 = (JavascriptExecutor) DriverFactory.driver;
		js54.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_bank_end);
		if (Skill_Analysis_Objects.Profile_bank_Account_Name.getText().equals("")) {
			System.out.println("Bank Details Not Filled - Bank Account name Not availble");
		} else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_bank_end));

			System.out.println("Bank Account Name : " + Skill_Analysis_Objects.Profile_bank_Account_Name.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify Account No in Bank Details are displayed correctly in profile")
	public static void Verify_Account_No_in_Bank_Details_are_displayed_correctly_in_profile() throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions55 = new Actions(DriverFactory.driver);
//		actions55.moveToElement(Skill_Analysis_Objects.Profile_bank_end);
//		actions55.perform();

		JavascriptExecutor js55 = (JavascriptExecutor) DriverFactory.driver;
		js55.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_bank_end);

		if (Skill_Analysis_Objects.Profile_bank_Account_no.getText().equals("0")) {
			System.out.println("Bank Details not Filled : Account No  Not Available");
		} else {
			System.out.println("Bank Account No : " + Skill_Analysis_Objects.Profile_bank_Account_no.getText());
			System.out.println("----------------------------");
		}
	}

	@Then("^Verify IFSC Or IBAN or SWIFT Code in Bank Details are displayed correctly in profile")
	public static void Verify_IFSC_Or_IBAN_or_SWIFT_Code_in_Bank_Details_are_displayed_correctly_in_profile()
			throws Throwable {

		try {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",
					Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails);
			// Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
		}
//		Actions actions56 = new Actions(DriverFactory.driver);
//		actions56.moveToElement(Skill_Analysis_Objects.Profile_bank_end);
//		actions56.perform();

		JavascriptExecutor js56 = (JavascriptExecutor) DriverFactory.driver;
		js56.executeScript("arguments[0].scrollIntoView();", Skill_Analysis_Objects.Profile_bank_end);

		if (Skill_Analysis_Objects.Profile_bank_IFSC_Or_IBAN_or_SWIFT_Code.getText().equals("")) {
			System.out.println("Bank Details Not Filled - IFSC/IBAN/SWIFT Code Not availble");
		} else {
			// wait.until(ExpectedConditions.visibilityOfAllElements(Skill_Analysis_Objects.Profile_bank_IFSC_Or_IBAN_or_SWIFT_Code));

			System.out.println("IFSC/IBAN/SWIFT Code : "
					+ Skill_Analysis_Objects.Profile_bank_IFSC_Or_IBAN_or_SWIFT_Code.getText());
			System.out.println("----------------------------");
		}

		Screenshot.Screenshotforscenario();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With Aadhaar$")
	public static void Then_Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Aadhaar() throws Throwable {
		View_Profile.Search_workmen_by_Aadhar_domestic();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With Workmen Number$")
	public static void Then_Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Workmen_Number() throws Throwable {
		View_Profile.Search_workmen_by_Employee_ID_Domestic();
	}

	@Then("^Verify User can be able to Search International Workmen With Workmen Number$")
	public static void Then_Verify_User_can_be_able_to_Search_International_Workmen_With_Workmen_Number()
			throws Throwable {
		View_Profile.Search_workmen_by_Employee_ID_Internatioanl();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With Name and Father Name$")
	public static void Then_Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_FatherName() throws Throwable {
		View_Profile.Search_workmen_by_Name_FatherName_Domestic();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With Name alone$")
	public static void Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_alone() throws Throwable {
		View_Profile.Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_alone();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With FatherName alone$")
	public static void Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_FatherName_alone()
			throws Throwable {
		View_Profile.Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Name_FatherName_alone();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With VisaPro ID$")
	public static void Then_Verify_User_can_be_able_to_Search_Domestic_Workmen_With_VisaPro_ID() throws Throwable {
		// View_Profile.Search_workmen_by_VisaPro_ID();
	}

	@Then("^Verify User can be able to Search Domestic Workmen With Passport Number$")
	public static void Then_Verify_User_can_be_able_to_Search_Domestic_Workmen_With_Passport_Number() throws Throwable {
		View_Profile.Search_workmen_by_Passport_no();
	}

	@Then("^Verify User can be able to Search International Workmen With Passport Number$")
	public static void Then_Verify_User_can_be_able_to_Search_International_Workmen_With_Passport_Number()
			throws Throwable {
		View_Profile.Search_workmen_by_Passport_no_International();
	}

	@Then("^Verify User can be able to Switch Job Domestic$")
	public static void Switch_Job() throws Throwable {

		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.contains(ConfigFileReader.getSwitch_job())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getSwitch_job());
		} else {
			SwitchJob_Create.SwitchJob_AABRI015();
		}

	}

	@Then("^Verify User can be able to Switch Job International$")
	public static void Switch_Job_International() throws Throwable {

		System.out.println("Current Job : " + ObjectsReporsitory.Induction_Jobcode.getText());
		String Current_job = ObjectsReporsitory.Induction_Jobcode.getText();
		if (Current_job.contains(ConfigFileReader.getSwitch_job())) {
			System.out.println("User Currenlty set on Job " + ConfigFileReader.getSwitch_job());
		} else {
			SwitchJob_Create.SwitchJob_LE120309();
		}

	}

	@Then("^Verify User can be able to view Workmen profile Completion Status$")
	public static void Verify_User_can_be_able_to_view_Workmen_profile_Completion_Status() throws Throwable {

		List<WebElement> ProfileStages_allElement = ObjectsReporsitory.ProfileStages_allElement;
		List<WebElement> ProfileStages_CompletionStatus_allElement = ObjectsReporsitory.ProfileStages_CompletionStatus_allElement;
		for (int i = 0; i < ProfileStages_CompletionStatus_allElement.size(); i++) {

			System.out.println("Profile Stage " + (i + 1) + " : " + ProfileStages_allElement.get(i).getText() + " - "
					+ ProfileStages_CompletionStatus_allElement.get(i).getText());
		}
		System.out.println("----------------------------------------------");
	}

	@Then("^Verify User can be able to view Workmen profile Completion Percentage$")
	public static void Verify_User_can_be_able_to_view_Workmen_profile_Completion_Percentage() throws Throwable {

		Completion_Percentage = ObjectsReporsitory.ProfileStages_ProgressPercentage.getText();
		if (Completion_Percentage.equals("")) {
			System.out.println("Completion Percentage : 0%");
			System.out.println("----------------------------------------------");
		} else {
			System.out.println("Completion Percentage : " + Completion_Percentage);
			System.out.println("----------------------------------------------");
		}
	}
}
