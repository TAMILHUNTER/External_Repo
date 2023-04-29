//package stepdefinition.Induction_Dashboard;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import dataProviders.ConfigFileReader;
//import object_repository.ObjectsReporsitory;
//import object_repository.Skill_Analysis_Objects;
//import object_repository.WorkmenProfile;
//import stepdefinition.Screenshot;
//import stepdefinition.Webdriver;
//
//public class Profile_Basic_bkp {
//
//	static int Skill_Analyisis_Count;
//	public static String WorkmanID;
//	public static String WorkmanNameWMS;
//	public static String WorkmanFatherNameWMS;
//	public static String WorkmanDOBWMS;
//	public static String WorkmanGenderWMS;
//	public static String WorkmanBloodGroupWMS;
//	public static String WorkmanMaritalStatus;
//	public static String SpouseName;
//	public static String NoOfChildren;
//	public static String CstiOrNaps;
//	public static String WorkmanPartnerNameWMS;
//	public static String WorkmanMobileNumberWMS;
//	public static String PermanentAddressWMS;
//	public static String PermanentVillageWMS;
//	public static String TemporaryAddressWMS;
//	public static String TemporaryVillageWMS;
//	public static String ECNameWMS;
//	public static String ECMobileNumberWMS;
//	public static String ECRelationshipWMS;
//	public static String ECAddressWMS;
//	public static String ECVillageWMS;
//	public static String PermanentPincode;
//	public static String ECPincode;
//	public static String Skill_Category;
//	public static String Skill_Group;
//	public static String Skill_Description;
//	public static String Skill_Type;
//	public static String Deployment;
//
//// Page Factory
//	public Profile_Basic_bkp() {
//		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
//		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
//		PageFactory.initElements(DriverFactory.driver, WorkmenProfile.class);
//	}
//
//	// Common Imports
//	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, 30);
//	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
//
//	// **************** Start import methods for step definition
//	// ********************
//
//	@Given("^Navigate to Induction Dashboard and search workmen and View workman Profile$")
//	public static void Navigate_to_Induction_Dashboard_and_search_workmen_and_View_workman_Profile() throws Throwable {
//		View_Profile.Navigate_to_Induction_Dashboard();
//		View_Profile.Search_workmen_by_Employee_ID();
//		View_Profile.Verify_User_can_able_to_View_workman_Profile();
//	}
//
//	@Then("^verify workman name in Personal details are displayed correctly in profile$")
//	public static void verify_workman_name_in_Personal_details_is_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions2 = new Actions(DriverFactory.driver);
//		actions2.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
//		actions2.perform();
//		WorkmanNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_WorkmanName.getText();
//		if (WorkmanNameWMS.contains(ConfigFileReader.getWorkman_name())) {
//			System.out.println("Workman Name is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workman Name details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^verify workman Father name in Personal details are displayed correctly in profile$")
//	public static void verify_workman_Father_name_in_Personal_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions3 = new Actions(DriverFactory.driver);
//		actions3.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
//		actions3.perform();
//		WorkmanFatherNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_WorkmanFatherName.getText();
//		if (WorkmanFatherNameWMS.contains(ConfigFileReader.getWorkman_Father_name())) {
//			System.out.println("Workman Father Name is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workman Father Name details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^verify workman DOB in Personal details are displayed correctly in profile$")
//	public static void verify_workman_DOB_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
//		WorkmanDOBWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_DOB.getText();
//		if (WorkmanDOBWMS.equals(ConfigFileReader.getDOB()) || WorkmanDOBWMS.equals(ConfigFileReader.getDOB_update())) {
//			System.out.println("Workman DOB is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workman DOB details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^verify workman Gender in Personal details are displayed correctly in profile$")
//	public static void verify_workman_Gender_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
//		WorkmanGenderWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Gender.getText();
//		if (WorkmanGenderWMS.equals(ConfigFileReader.getGender())
//				|| WorkmanGenderWMS.equals(ConfigFileReader.getGender_update())) {
//			System.out.println("Workman Gender is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workman Gender details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^verify workman Blood Group in Personal details are displayed correctly in profile$")
//	public static void verify_workman_Blood_Group_in_Personal_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//		WorkmanBloodGroupWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_BloodGroup.getText();
//		if (WorkmanBloodGroupWMS.equals(ConfigFileReader.getBlood_Group())
//				|| WorkmanBloodGroupWMS.equals(ConfigFileReader.getBlood_Group_update())) {
//			System.out.println("Workman Blood Group is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workman Blood Group details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^verify Languages in Personal details are displayed correctly in profile$")
//	public static void verify_Languages_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
//		wait.until(ExpectedConditions
//				.elementToBeClickable(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown));
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown.click();
//
//		String Language1, Language2;// Language3;
//		String Language1_Read, Language1_Write, Language1_Speak, Language2_Read, Language2_Write, Language2_Speak;
//		// Language3_Read, Language3_Write, Language3_Speak;
//		if (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1.getText()
//				.equals("No records available.")) {
//			System.out.println("Workman Languages Not Available");
//		}
//
//		else {
//			Language1 = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1.getText();
//			Language1_Read = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1_Read.getText();
//			Language1_Write = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1_Write.getText();
//			Language1_Speak = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language1_Speak.getText();
//			if (Language1.equals(ConfigFileReader.getLanguage1())) {
//				System.out.println(Language1 + " - Displayed Language 1");
//				if (Language1_Read.equals(ConfigFileReader.getL1Read_Verify())) {
//					System.out.println("Workman Can be able to Read " + Language1 + " : " + Language1_Read);
//				} else {
//					System.out.println("****Verification Failed : Workman Can be able to Read " + Language1 + " : "
//							+ Language1_Read + "*******");
//					// fail();
//				}
//				if (Language1_Write.equals(ConfigFileReader.getL1Write_Verify())) {
//					System.out.println("Workman Can be able to Write " + Language1 + " : " + Language1_Write);
//				} else {
//					System.out.println("****Verification Failed : Workman Can be able to Write " + Language1 + " : "
//							+ Language1_Write + "*******");
//					// fail();
//				}
//				if (Language1_Speak.equals(ConfigFileReader.getL1speak_Verify())) {
//					System.out.println("Workman Can be able to Speak " + Language1 + " : " + Language1_Speak);
//				} else {
//					System.out.println("****Verification Failed : Workman Can be able to Speak " + Language1 + " : "
//							+ Language1_Speak + "*******");
//					// fail();
//				}
//			} else if (Language1.equals(ConfigFileReader.getLanguage1_update())) {
//				System.out.println(Language1 + " - Displayed Language 1");
//				if (Language1_Read.equals(ConfigFileReader.getL1Read_update_verify())) {
//					System.out.println("Workman Can be able to Read " + Language1 + " : " + Language1_Read);
//				} else {
//					System.out.println("****Verification Failed : Workman Can be able to Read " + Language1 + " : "
//							+ Language1_Read + "*******");
//					// fail();
//				}
//				if (Language1_Write.equals(ConfigFileReader.getL1Write_update_verify())) {
//					System.out.println("Workman Can be able to Write " + Language1 + " : " + Language1_Write);
//				} else {
//					System.out.println("****Verification Failed : Workman Can be able to Write " + Language1 + " : "
//							+ Language1_Write + "*******");
//					// fail();
//				}
//				if (Language1_Speak.equals(ConfigFileReader.getL1speak_update_verify())) {
//					System.out.println("Workman Can be able to Speak " + Language1 + " : " + Language1_Speak);
//				} else {
//					System.out.println("****Verification Failed : Workman Can be able to Speak " + Language1 + " : "
//							+ Language1_Speak + "*******");
//					// fail();
//				}
//			} else {
//				System.out.println("****Verification Failed : " + Language1 + " - Displayed as Language 1");
//			}
//
////L2
//			if (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2 == null) {
//				System.out.println("Language 2 Not available");
//			} else {
//				Language2 = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2.getText();
//				Language2_Read = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2_Read.getText();
//				Language2_Write = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2_Write.getText();
//				Language2_Speak = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language2_Speak.getText();
//				if (Language2.equals(ConfigFileReader.getLanguage2())) {
//					System.out.println(Language2 + " - Displayed Language 2");
//					if (Language2_Read.equals(ConfigFileReader.getL2Read_Verify())) {
//						System.out.println("Workman Can be able to Read " + Language2 + " : " + Language2_Read);
//					} else {
//						System.out.println("****Verification Failed : Workman Can be able to Read " + Language2 + " : "
//								+ Language2_Read + "*******");
//						// fail();
//					}
//					if (Language2_Write.equals(ConfigFileReader.getL2Write_Verify())) {
//						System.out.println("Workman Can be able to Write " + Language2 + " : " + Language2_Write);
//					} else {
//						System.out.println("****Verification Failed : Workman Can be able to Write " + Language2 + " : "
//								+ Language2_Write + "*******");
//						// fail();
//					}
//					if (Language2_Speak.equals(ConfigFileReader.getL2speak_Verify())) {
//						System.out.println("Workman Can be able to Speak " + Language2 + " : " + Language2_Speak);
//					} else {
//						System.out.println("****Verification Failed : Workman Can be able to Speak " + Language2 + " : "
//								+ Language2_Speak + "*******");
//						// fail();
//					}
//				} else if (Language2.equals(ConfigFileReader.getLanguage2_update())) {
//					System.out.println(Language2 + " - Displayed Language 2");
//					if (Language2_Read.equals(ConfigFileReader.getL2Read_update_verify())) {
//						System.out.println("Workman Can be able to Read " + Language2 + " : " + Language2_Read);
//					} else {
//						System.out.println("****Verification Failed : Workman Can be able to Read " + Language2 + " : "
//								+ Language2_Read + "*******");
//						// fail();
//					}
//					if (Language2_Write.equals(ConfigFileReader.getL2Write_update_verify())) {
//						System.out.println("Workman Can be able to Write " + Language2 + " : " + Language2_Write);
//					} else {
//						System.out.println("****Verification Failed : Workman Can be able to Write " + Language2 + " : "
//								+ Language2_Write + "*******");
//						// fail();
//					}
//					if (Language2_Speak.equals(ConfigFileReader.getL2speak_update_verify())) {
//						System.out.println("Workman Can be able to Speak " + Language2 + " : " + Language2_Speak);
//					} else {
//						System.out.println("****Verification Failed : Workman Can be able to Speak " + Language2 + " : "
//								+ Language2_Speak + "*******");
//						// fail();
//					}
//				} else {
//					System.out.println("****Verification Failed : " + Language2 + " - Displayed as Language 2");
//				}
//				System.out.println("----------------------------");
//			}
//
//			/*
//			 * //L3 if
//			 * (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3 ==
//			 * null) { System.out.println("Language 3 Not available");
//			 * System.out.println(Skill_Analysis_Objects.
//			 * Skill_Analysis_Workman_Profile_Basic_Language3); } else { Language3 =
//			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3.getText
//			 * (); Language3_Read =
//			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3_Read.
//			 * getText(); Language3_Write =
//			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3_Write.
//			 * getText(); Language3_Speak =
//			 * Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language3_Speak.
//			 * getText(); if (Language3.equals(ConfigFileReader.getLanguage3())) {
//			 * System.out.println(Language3 + " - Displayed Language 3"); if
//			 * (Language3_Read.equals(ConfigFileReader.getL3Read_Verify())) {
//			 * System.out.println("Workman Can be able to Read " + Language3 + " : " +
//			 * Language3_Read); } else {
//			 * System.out.println("****Verification Failed : Workman Can be able to Read " +
//			 * Language3 + " : " + Language3_Read + "*******"); // fail(); } if
//			 * (Language3_Write.equals(ConfigFileReader.getL3Write_Verify())) {
//			 * System.out.println("Workman Can be able to Write " + Language3 + " : " +
//			 * Language3_Write); } else {
//			 * System.out.println("****Verification Failed : Workman Can be able to Write "
//			 * + Language3 + " : " + Language3_Write + "*******"); // fail(); } if
//			 * (Language3_Speak.equals(ConfigFileReader.getL3speak_Verify())) {
//			 * System.out.println("Workman Can be able to Speak " + Language3 + " : " +
//			 * Language3_Speak); } else {
//			 * System.out.println("****Verification Failed : Workman Can be able to Speak "
//			 * + Language3 + " : " + Language3_Speak + "*******"); // fail(); } } else if
//			 * (Language3.equals(ConfigFileReader.getLanguage3_update())) {
//			 * System.out.println(Language3 + " - Displayed Language 3"); if
//			 * (Language3_Read.equals(ConfigFileReader.getL3Read_update_verify())) {
//			 * System.out.println("Workman Can be able to Read " + Language3 + " : " +
//			 * Language3_Read); } else {
//			 * System.out.println("****Verification Failed : Workman Can be able to Read " +
//			 * Language3 + " : " + Language3_Read + "*******"); // fail(); } if
//			 * (Language3_Write.equals(ConfigFileReader.getL3Write_update_verify())) {
//			 * System.out.println("Workman Can be able to Write " + Language3 + " : " +
//			 * Language3_Write); } else {
//			 * System.out.println("****Verification Failed : Workman Can be able to Write "
//			 * + Language3 + " : " + Language3_Write + "*******"); // fail(); } if
//			 * (Language3_Speak.equals(ConfigFileReader.getL3speak_update_verify())) {
//			 * System.out.println("Workman Can be able to Speak " + Language3 + " : " +
//			 * Language3_Speak); } else {
//			 * System.out.println("****Verification Failed : Workman Can be able to Speak "
//			 * + Language3 + " : " + Language3_Speak + "*******"); // fail(); } } else {
//			 * System.out.println("****Verification Failed : " + Language3 +
//			 * " - Displayed as Language 3"); } } //L4 if
//			 * (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Language4 ==
//			 * null) { System.out.println("Language 4 Not available"); } else {
//			 * System.out.println("Language 4 is available"); }
//			 */
//		}
//		Screenshot.Screenshotforscenario();
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_languagesKnown_close.click();
//		// DataBaseConnection.getverifyupdateworkmanLanguage();
//	}
//
//	@Then("^verify workman Marital Status in Personal details are displayed correctly in profile$")
//	public static void verify_workman_Marital_Status_in_Personal_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//		WorkmanMaritalStatus = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_MaritalStatus.getText();
//		if (WorkmanMaritalStatus.equals(ConfigFileReader.getMarital_status())
//				|| WorkmanMaritalStatus.equals(ConfigFileReader.getMarital_status_update())) {
//			System.out.println("Workman Marital Status is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workman Marital Status details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^verify Spouse Name in Personal details are displayed correctly in profile$")
//	public static void verify_Spouse_Name_in_Personal_details_are_displayed_correctly_in_profile() throws Throwable {
//		if (ConfigFileReader.getMarital_status().equals("Single")) {
//			System.out.println("Marital Status Set to Single");
//		} else {
//			SpouseName = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_SpouseName.getText();
//			if (SpouseName.contains(ConfigFileReader.getspouse_name())
//					|| SpouseName.contains(ConfigFileReader.getspouse_name_update())) {
//				System.out.println("SpouseName is verified - with input Values");
//				System.out.println("----------------------------");
//			} else {
//				System.out.println(
//						"*******input Values Verification failed : SpouseName is not correctly Displayed*******");
//				// fail(); uncomment this
//			}
//		}
//	}
//
//	@Then("^verify No Of Childrens in Personal details are displayed correctly in profile$")
//	public static void verify_No_Of_Childrens_in_Personal_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//		if (ConfigFileReader.getMarital_status().equals("Single")) {
//			System.out.println("Marital Status Set to Single");
//		} else {
//			NoOfChildren = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NoOfChildren.getText();
//			if (NoOfChildren.equals(ConfigFileReader.getNo_of_childeren())
//					|| (NoOfChildren.equals(ConfigFileReader.getNo_of_childeren_update()))) {
//				System.out.println("NoOfChildren is verified - with input Values");
//				System.out.println("----------------------------");
//			} else {
//				System.out.println(
//						"*******input Values Verification failed : NoOfChildren is not correctly Displayed*******");
//				// fail(); uncomment this
//			}
//		}
//	}
//
//	@Then("^verify CSTI or NAPS Enabled in Personal details are displayed correctly in profile$")
//	public static void verify_CSTI_or_NAPS_Enabled_in_Personal_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//		Actions actions4 = new Actions(DriverFactory.driver);
//		actions4.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions4.perform();
//		if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox.isSelected() == true)
//				&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox.isSelected() == false)) {
//			System.out.println("CSTI Check box is Enabled");
//		} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox.isSelected() == false)
//				&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox.isSelected() == true)) {
//			System.out.println("NAPS Check box is Enabled");
//		} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox.isSelected() == true)
//				&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox.isSelected() == true)) {
//			System.out.println("CSTI & NAPS Check box is Enabled");
//		} else {
//			System.out.println("CSTI & NAPS Check box is Not Selected");
//		}
//	}
//
//	@Then("^verify CSTI or NAPS Number in Personal details are displayed correctly in profile$")
//	public static void verify_CSTI_or_NAPS_Number_in_Personal_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		CstiOrNaps = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CstiNaps_Number.getText();
//
//		if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox.isSelected() == true)
//				&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox.isSelected() == false)) {
//			if (CstiOrNaps.equals(ConfigFileReader.getCSTI())
//					|| (CstiOrNaps.equals(ConfigFileReader.getCSTI_update()))) {
//				System.out.println("CSTI is verified - with input Values");
//				System.out.println("----------------------------");
//			} else {
//				System.out.println("*******input Values Verification failed : CSTI is not correctly Displayed*******");
//				// fail(); uncomment this
//			}
//		} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox.isSelected() == false)
//				&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox.isSelected() == true)) {
//			System.out.println("NAPS in WMS: " + CstiOrNaps);
//			if (CstiOrNaps.equals(ConfigFileReader.getNAPS())
//					|| (CstiOrNaps.equals(ConfigFileReader.getEnable_NAPS_update()))) {
//				System.out.println("NAPS is verified - with input Values");
//				System.out.println("----------------------------");
//			} else {
//				System.out.println("*******input Values Verification failed : NAPS is not correctly Displayed*******");
//				// fail(); uncomment this
//			}
//		} else if ((Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_NAPS_Checkbox.isSelected() == true)
//				&& (Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_CSTI_Checkbox.isSelected() == true)) {
//			System.out.println("NAPS in WMS: " + CstiOrNaps);
//			if (CstiOrNaps.equals(ConfigFileReader.getNAPS())
//					|| (CstiOrNaps.equals(ConfigFileReader.getEnable_NAPS_update()))) {
//				System.out.println("NAPS is verified - with input Values");
//				System.out.println("----------------------------");
//			} else {
//				System.out.println("*******input Values Verification failed : NAPS is not correctly Displayed*******");
//				// fail(); uncomment this
//			}
//		}
//		Screenshot.Screenshotforscenario();
//	}
//
//	@Then("^Verify Partner details is displayed$")
//	public static void Verify_Partner_details_is_displayed() throws Throwable {
//
//		Actions actions33 = new Actions(DriverFactory.driver);
//		actions33.moveToElement(WorkmenProfile.Profile_Communication_Head);
//		actions33.perform();
//		System.out.println("Partner Name :" + WorkmenProfile.Profile_Partner_name.getText());
//		System.out.println("Work Permit capacity :" + WorkmenProfile.Profile_Partner_Workpermit.getText());
//		System.out.println("Partner Address :" + WorkmenProfile.Profile_Partner_Address.getText());
//		System.out.println("Partner Contact No :" + WorkmenProfile.Profile_Partner_PhoneNo.getText());
//		System.out.println("Partner Email ID :" + WorkmenProfile.Profile_Partner_MailID.getText());
//
//	}
//
//	@Then("^verify Partner name in Personal details are displayed correctly in profile$")
//	public static void verify_Partner_name_in_Personal_details_is_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions5 = new Actions(DriverFactory.driver);
//		actions5.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions5.perform();
//		WorkmanPartnerNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_Name.getText();
//		if (WorkmanPartnerNameWMS.contains(ConfigFileReader.getpartner_name())
//				|| WorkmanPartnerNameWMS.contains(ConfigFileReader.getpartner_name_Update())) {
//			System.out.println("Partner Name is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Partner Name details is not correctly Displayed*******");
//			// fail(); uncomment this
//		}
//	}
//
//	@Then("^Verify Partner address in Personal details is displayed in profile$")
//	public static void Verify_Partner_address_in_Personal_details_is_displayed_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions6 = new Actions(DriverFactory.driver);
//		actions6.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions6.perform();
//		System.out.println("Partner Address : "
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_Address.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Partner Contact number in Personal details is displayed in profile$")
//	public static void Verify_Partner_Contact_number_in_Personal_details_is_displayed_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions7 = new Actions(DriverFactory.driver);
//		actions7.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_partner);
//		actions7.perform();
//		System.out.println("Contact Number : "
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_ContactNumber.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Partner Email ID in Personal details is displayed in profile$")
//	public static void Verify_Partner_Email_ID_in_Personal_details_is_displayed_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions8 = new Actions(DriverFactory.driver);
//		actions8.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Header_personal);
//		actions8.perform();
//		System.out.println(
//				"Mail ID : " + Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Partner_MailID.getText());
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//	}
//
//	@Then("^verify Mobile Number in Communication details are displayed correctly in profile$")
//	public static void verify_Mobile_Number_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions9 = new Actions(DriverFactory.driver);
//		actions9.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions9.perform();
//		WorkmanMobileNumberWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_MobileNumber
//				.getText();
//		if (WorkmanMobileNumberWMS.equals(ConfigFileReader.getMobilenumber())) {
//			System.out.println("Workmen Mobile Number is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Workmen Mobile Number details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Permanent Address in Communication details is displayed correctly in profile$")
//	public static void verify_Permanent_Address_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions10 = new Actions(DriverFactory.driver);
//		actions10.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions10.perform();
//		PermanentAddressWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Address
//				.getText();
//		if (PermanentAddressWMS.contains(ConfigFileReader.getPermanent_Address())
//				|| (PermanentAddressWMS.contains(ConfigFileReader.getPermanent_Address_update()))) {
//			System.out.println("Permanent Address is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Permanent Address details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Permanent Address Village in Communication details is displayed correctly in profile$")
//	public static void verify_Permanent_Address_Village_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions11 = new Actions(DriverFactory.driver);
//		actions11.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions11.perform();
//		PermanentVillageWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_Village
//				.getText();
//		if (PermanentVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_Verify())
//				|| (PermanentVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update_Verify()))
//				|| (PermanentVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update2_Verify()))) {
//			System.out.println("Permanent Address Village is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Permanent Address Village details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Permanent Address District in Communication details is displayed correctly in profile$")
//	public static void verify_Permanent_Address_District_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions12 = new Actions(DriverFactory.driver);
//		actions12.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions12.perform();
//		System.out.println("Permanent Address District :"
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_District
//						.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Permanent Address State in Communication details is displayed correctly in profile$")
//	public static void verify_Permanent_Address_State_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions13 = new Actions(DriverFactory.driver);
//		actions13.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions13.perform();
//		System.out.println("Permanent Address State :"
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_State.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Permanent Address PinCode in Communication details is displayed correctly in profile$")
//	public static void verify_Permanent_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions14 = new Actions(DriverFactory.driver);
//		actions14.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions14.perform();
//		String PermanentPincode = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Permanent_State
//				.getText();
//		System.out.println("Permanent Address PinCode :" + PermanentPincode.substring(PermanentPincode.length() - 6));
//		System.out.println("----------------------------");
//	}
//
////Temp Address
//
//	@Then("^Verify Temporary Address in Communication details is displayed correctly in profile$")
//	public static void verify_Temporary_Address_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions15 = new Actions(DriverFactory.driver);
//		actions15.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions15.perform();
//		TemporaryAddressWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Address
//				.getText();
//		if (TemporaryAddressWMS.contains(ConfigFileReader.getTemporary_Address())
//				|| (TemporaryAddressWMS.contains(ConfigFileReader.getTemporary_Address_update()))
//				|| (TemporaryAddressWMS.contains(ConfigFileReader.getTemporary_Address_update2()))
//				|| (TemporaryAddressWMS.contains(ConfigFileReader.getPermanent_Address()))
//				|| (TemporaryAddressWMS.contains(ConfigFileReader.getPermanent_Address_update()))
//				|| (TemporaryAddressWMS.contains(ConfigFileReader.getPermanent_Address_update2()))) {
//			System.out.println("Temporary Address is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Temporary Address details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Temporary Address Village in Communication details is displayed correctly in profile$")
//	public static void verify_Temporary_Address_Village_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions16 = new Actions(DriverFactory.driver);
//		actions16.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions16.perform();
//		TemporaryVillageWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_Village
//				.getText();
//		if (TemporaryVillageWMS.contains(ConfigFileReader.getTemporary_Address_Village())
//				|| (TemporaryVillageWMS.contains(ConfigFileReader.getTemporary_Address_Village_update()))
//				|| (TemporaryVillageWMS.contains(ConfigFileReader.getTemporary_Address_Village_update2()))
//				|| (TemporaryVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update2_Verify()))
//				|| (TemporaryVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_update_Verify()))
//				|| (TemporaryVillageWMS.contains(ConfigFileReader.getPermanent_Address_Village_Verify()))) {
//			System.out.println("Temporary Address Village is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Temporary Address Village details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Temporary Address District in Communication details is displayed correctly in profile$")
//	public static void verify_Temporary_Address_District_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions17 = new Actions(DriverFactory.driver);
//		actions17.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions17.perform();
//		System.out.println("Temporary Address District :"
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_District
//						.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Temporary Address State in Communication details is displayed correctly in profile$")
//	public static void verify_Temporary_Address_State_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions18 = new Actions(DriverFactory.driver);
//		actions18.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions18.perform();
//		System.out.println("Temporary Address State :"
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_State.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Temporary Address PinCode in Communication details is displayed correctly in profile$")
//	public static void verify_Temporary_Address_PinCode_in_Communication_details_are_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions19 = new Actions(DriverFactory.driver);
//		actions19.moveToElement(
//				Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Emergency_Contact_Head);
//		actions19.perform();
//		String TemporaryPincode = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_Temporary_State
//				.getText();
//		System.out.println("Temporary Address PinCode :" + TemporaryPincode.substring(TemporaryPincode.length() - 6));
//		System.out.println("----------------------------");
//	}
//
////EC 		
//	@Then("^Verify Emergency Contact Name in Communication details is displayed correctly in profile$")
//	public static void Verify_Emergency_Contact_Name_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions20 = new Actions(DriverFactory.driver);
//		actions20.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions20.perform();
//		ECNameWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Name.getText();
//		if (ECNameWMS.contains(ConfigFileReader.getEmergency_Contact_Name())
//				|| (ECNameWMS.contains(ConfigFileReader.getEmergency_Contact_Name_update()))) {
//			System.out.println("Emergency Contact Name is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Emergency Contact Name details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Emergency Contact Relationship in Communication details is displayed correctly in profile$")
//	public static void Verify_Emergency_Contact_Relationship_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions21 = new Actions(DriverFactory.driver);
//		actions21.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions21.perform();
//		ECRelationshipWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Relation
//				.getText();
//		String Extracted = ECRelationshipWMS.substring(ECRelationshipWMS.indexOf("(") + 1,
//				ECRelationshipWMS.indexOf(")"));
//		if (Extracted.contains(ConfigFileReader.getEmergency_Contact_Relation())
//				|| (Extracted.contains(ConfigFileReader.getEmergency_Contact_Relation_update()))) {
//			System.out.println("Emergency Contact Relationship is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Emergency Contact Relationship details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Emergency Contact Mobile Number in Communication details is displayed correctly in profile$")
//	public static void Verify_Emergency_Contact_Mobile_Number_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions22 = new Actions(DriverFactory.driver);
//		actions22.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions22.perform();
//		ECMobileNumberWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_MobileNumber
//				.getText();
//		if (ECMobileNumberWMS.contains(ConfigFileReader.getEmergency_Contact_Mobile())
//				|| (ECMobileNumberWMS.contains(ConfigFileReader.getEmergency_Contact_Mobile_Update()))) {
//			System.out.println("Emergency Contact Mobile number is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Emergency Contact Mobile number details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Emergency Contact Address in Communication details is displayed correctly in profile$")
//	public static void verify_Emergency_Contact_Address_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions23 = new Actions(DriverFactory.driver);
//		actions23.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions23.perform();
//		ECAddressWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Address.getText();
//		if (ECAddressWMS.contains(ConfigFileReader.getEmergency_Contact_Address())
//				|| (ECAddressWMS.contains(ConfigFileReader.getEmergency_Contact_Address_update()))
//				|| (ECAddressWMS.contains(ConfigFileReader.getEmergency_Contact_Address_update2()))) {
//			System.out.println("Emergency Contact Address is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Emergency Contact Address details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Emergency Contact Village in Communication details is displayed correctly in profile$")
//	public static void verify_Emergency_Contact_Village_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions24 = new Actions(DriverFactory.driver);
//		actions24.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions24.perform();
//		ECVillageWMS = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_Village.getText();
//		if (ECVillageWMS.contains(ConfigFileReader.getEmergency_Contact_Village())
//				|| (ECVillageWMS.contains(ConfigFileReader.getEmergency_Contact_Village_update()))
//				|| (ECVillageWMS.contains(ConfigFileReader.getEmergency_Contact_Village_update2()))) {
//			System.out.println("Emergency Contact Village is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Emergency Contact Village details is not correctly Displayed*******");
//			// fail();
//		}
//	}
//
//	@Then("^Verify Emergency Contact District in Communication details is displayed correctly in profile$")
//	public static void verify_Emergency_Contact_District_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions25 = new Actions(DriverFactory.driver);
//		actions25.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions25.perform();
//		System.out.println("Emergency Contact District :"
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_District.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Emergency Contact State in Communication details is displayed correctly in profile$")
//	public static void verify_Emergency_Contact_State_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions26 = new Actions(DriverFactory.driver);
//		actions26.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions26.perform();
//		System.out.println("Emergency Contact State :"
//				+ Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_State.getText());
//		System.out.println("----------------------------");
//	}
//
//	@Then("^Verify Emergency Contact PinCode in Communication details is displayed correctly in profile$")
//	public static void verify_Emergency_Contact_PinCode_in_Communication_details_is_displayed_correctly_in_profile()
//			throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions27 = new Actions(DriverFactory.driver);
//		actions27.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Head);
//		actions27.perform();
//		String ECPincode = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Communication_EC_State.getText();
//		System.out.println("Emergency Contact Address PinCode :" + ECPincode.substring(ECPincode.length() - 6));
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//	}
//
//	@Then("^verify Skill Category in Basic Details are displayed correctly in profile$")
//	public static void verify_Skill_Category_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions28 = new Actions(DriverFactory.driver);
//		actions28.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions28.perform();
//		Skill_Category = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Category.getText();
//		if (Skill_Category.equals(ConfigFileReader.getSkill_Category())
//				|| Skill_Category.equals(ConfigFileReader.getSkill_Category_Update())) {
//			System.out.println("Skill Category is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Skill Category details is not correctly Displayed*******");
//			// fail();
//		}
//
//	}
//
//	@Then("^verify Skill Group in Basic Details are displayed correctly in profile$")
//	public static void verify_Skill_Group_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions29 = new Actions(DriverFactory.driver);
//		actions29.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions29.perform();
//		Skill_Group = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Group.getText();
//		if (Skill_Group.equals(ConfigFileReader.getSkill_Group())
//				|| Skill_Group.equals(ConfigFileReader.getSkill_Group_Update())) {
//			System.out.println("Skill Group is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Skill Group details is not correctly Displayed*******");
//			// fail();
//		}
//
//	}
//
//	@Then("^verify Skill Description in Basic Details are displayed correctly in profile$")
//	public static void verify_Skill_Description_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions30 = new Actions(DriverFactory.driver);
//		actions30.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions30.perform();
//		Skill_Description = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Description.getText();
//		if (Skill_Description.equals(ConfigFileReader.getSkill_Description_verify())
//				|| Skill_Description.equals(ConfigFileReader.getSkill_Description_Update_verify())) {
//			System.out.println("Skill Description is verified - with input Values");
//			System.out.println("----------------------------");
//		} else {
//			System.out.println(
//					"*******input Values Verification failed : Skill Description details is not correctly Displayed*******");
//			// fail();
//		}
//
//	}
//
//	@Then("^verify Skill Type in Basic Details are displayed correctly in profile$")
//	public static void verify_Skill_Type_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions31 = new Actions(DriverFactory.driver);
//		actions31.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment_Head);
//		actions31.perform();
//		Skill_Type = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Skill_Type.getText();
//		System.out.println("Skill Type :" + Skill_Type);
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//
//	}
//
//	@Then("^Verify Deployment in Basic Details are displayed correctly in profile$")
//	public static void Verify_Deployment_in_Basic_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions32 = new Actions(DriverFactory.driver);
//		actions32.moveToElement(Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Education_Head);
//		actions32.perform();
//		Deployment = Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Basic_Deployment.getText();
//		System.out.println("Deployment :" + Deployment);
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//
//	}
//
//	@Then("^Verify Qualification in Education Details are displayed correctly in profile$")
//	public static void Verify_Qualification_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions33 = new Actions(DriverFactory.driver);
//		actions33.moveToElement(WorkmenProfile.Profile_Experience_Head);
//		actions33.perform();	
//		System.out.println("Qualification : " + WorkmenProfile.Profile_Education_Qualification.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Branch in Education Details are displayed correctly in profile$")
//	public static void Verify_Branch_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions34 = new Actions(DriverFactory.driver);
//		actions34.moveToElement(WorkmenProfile.Profile_Experience_Head);
//		actions34.perform();	
//		System.out.println("Branch : " + WorkmenProfile.Profile_Education_Branch.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Discipline in Education Details are displayed correctly in profile$")
//	public static void Verify_Discipline_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions35 = new Actions(DriverFactory.driver);
//		actions35.moveToElement(WorkmenProfile.Profile_Experience_Head);
//		actions35.perform();	
//		System.out.println("Discipline : " + WorkmenProfile.Profile_Education_Discipline.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify School or College in Education Details are displayed correctly in profile$")
//	public static void Verify_School_or_College_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions36 = new Actions(DriverFactory.driver);
//		actions36.moveToElement(WorkmenProfile.Profile_Experience_Head);
//		actions36.perform();	
//		System.out.println("School/College : " + WorkmenProfile.Profile_Education_SchoolORCollege.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Board or University in Education Details are displayed correctly in profile$")
//	public static void Verify_Board_or_University_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions37 = new Actions(DriverFactory.driver);
//		actions37.moveToElement(WorkmenProfile.Profile_Experience_Head);
//		actions37.perform();	
//		System.out.println("Board/University : " + WorkmenProfile.Profile_Education_BoardORuniversity.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Year of Passing in Education Details are displayed correctly in profile$")
//	public static void Verify_Year_of_Passing_in_Education_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions38 = new Actions(DriverFactory.driver);
//		actions38.moveToElement(WorkmenProfile.Profile_Experience_Head);
//		actions38.perform();	
//		System.out.println("Year of Passing : " + WorkmenProfile.Profile_Education_YearOfPassing.getText());
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//
//	}
//	
//	@Then("^Verify Organisation Name in Experience Details are displayed correctly in profile")
//	public static void Verify_Organisation_Name_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions39 = new Actions(DriverFactory.driver);
//		actions39.moveToElement(WorkmenProfile.Profile_Statutory_Head);
//		actions39.perform();	
//		System.out.println("Organisation Name : " + WorkmenProfile.Profile_Experience_Org_Name.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Project Location in Experience Details are displayed correctly in profile")
//	public static void Verify_Project_Location_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions40 = new Actions(DriverFactory.driver);
//		actions40.moveToElement(WorkmenProfile.Profile_Statutory_Head);
//		actions40.perform();	
//		System.out.println("Project Location : " + WorkmenProfile.Profile_Experience_Project_location.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Project Code or Name in Experience Details are displayed correctly in profile")
//	public static void Verify_Project_Code_or_Name_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions41 = new Actions(DriverFactory.driver);
//		actions41.moveToElement(WorkmenProfile.Profile_Statutory_Head);
//		actions41.perform();	
//		System.out.println("Project Code/Name : " + WorkmenProfile.Profile_Experience_ProjectCodeOrName.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Skill Category in Experience Details are displayed correctly in profile")
//	public static void Verify_Skill_Category_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions42 = new Actions(DriverFactory.driver);
//		actions42.moveToElement(WorkmenProfile.Profile_Statutory_Head);
//		actions42.perform();	
//		System.out.println("Skill Category : " + WorkmenProfile.Profile_Experience_SkillCategory.getText());
//		System.out.println("----------------------------");
//
//	}
//	@Then("^Verify Skill Group in Experience Details are displayed correctly in profile")
//	public static void Verify_Skill_Group_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions43 = new Actions(DriverFactory.driver);
//		actions43.moveToElement(WorkmenProfile.Profile_Statutory_Head);
//		actions43.perform();	
//		System.out.println("Skill Group : " + WorkmenProfile.Profile_Experience_SkillGroup.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Skill Description in Experience Details are displayed correctly in profile")
//	public static void Verify_Skill_Description_in_Experience_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions44 = new Actions(DriverFactory.driver);
//		actions44.moveToElement(WorkmenProfile.Profile_Statutory_Head);
//		actions44.perform();	
//		System.out.println("Skill Description : " + WorkmenProfile.Profile_Experience_SkillDesc.getText());
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//
//	}
//	
//	@Then("^Verify Aadhar No in Statutory Details are displayed correctly in profile")
//	public static void Verify_Aadhar_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions45 = new Actions(DriverFactory.driver);
//		actions45.moveToElement(WorkmenProfile.Profile_PF_Nominee_Details_Head);
//		actions45.perform();	
//		System.out.println("Aadhar No : " + WorkmenProfile.Profile_Statutory_Aadhar.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify Driving License No in Statutory Details are displayed correctly in profile")
//	public static void Verify_Driving_License_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions46 = new Actions(DriverFactory.driver);
//		actions46.moveToElement(WorkmenProfile.Profile_PF_Nominee_Details_Head);
//		actions46.perform();	
//		System.out.println("Driving License No : " + WorkmenProfile.Profile_Statutory_DrivingLicense.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify PAN Card No in Statutory Details are displayed correctly in profile")
//	public static void Verify_PAN_Card_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions47 = new Actions(DriverFactory.driver);
//		actions47.moveToElement(WorkmenProfile.Profile_PF_Nominee_Details_Head);
//		actions47.perform();	
//		System.out.println("PAN Card No : " + WorkmenProfile.Profile_Statutory_PanCard.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify PF No in Statutory Details are displayed correctly in profile")
//	public static void Verify_PF_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions48 = new Actions(DriverFactory.driver);
//		actions48.moveToElement(WorkmenProfile.Profile_PF_Nominee_Details_Head);
//		actions48.perform();	
//		System.out.println("PF No : " + WorkmenProfile.Profile_Statutory_PFNo.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify UAN No in Statutory Details are displayed correctly in profile")
//	public static void Verify_UAN_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions49 = new Actions(DriverFactory.driver);
//		actions49.moveToElement(WorkmenProfile.Profile_PF_Nominee_Details_Head);
//		actions49.perform();	
//		System.out.println("UAN No : " + WorkmenProfile.Profile_Statutory_UANNo.getText());
//		System.out.println("----------------------------");
//
//	}
//	
//	@Then("^Verify ESI No in Statutory Details are displayed correctly in profile")
//	public static void Verify_ESI_No_in_Statutory_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions50 = new Actions(DriverFactory.driver);
//		actions50.moveToElement(WorkmenProfile.Profile_PF_Nominee_Details_Head);
//		actions50.perform();	
//		System.out.println("ESI No : " + WorkmenProfile.Profile_Statutory_ESINo.getText());
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//
//	}
//	
//	@Then("^Verify Name in PF Nominee Details are displayed correctly in profile")
//	public static void Verify_Name_in_PF_Nominee_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions51 = new Actions(DriverFactory.driver);
//		actions51.moveToElement(WorkmenProfile.Profile_Bank_Head);
//		actions51.perform();	
//		System.out.println("PF Nominee Name : " + WorkmenProfile.Profile_PF_nominee_Name.getText());
//		System.out.println("----------------------------");
//	}
//	
//	@Then("^Verify Relationship in PF Nominee Details are displayed correctly in profile")
//	public static void Verify_Relationship_in_PF_Nominee_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions52 = new Actions(DriverFactory.driver);
//		actions52.moveToElement(WorkmenProfile.Profile_Bank_Head);
//		actions52.perform();	
//		System.out.println("PF Nominee Relationship : " + WorkmenProfile.Profile_PF_nominee_Relationship.getText());
//		System.out.println("----------------------------");
//	}
//	
//	@Then("^Verify Allocation Percentage in PF Nominee Details are displayed correctly in profile")
//	public static void Verify_Allocation_Percentage_in_PF_Nominee_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions53 = new Actions(DriverFactory.driver);
//		actions53.moveToElement(WorkmenProfile.Profile_Bank_Head);
//		actions53.perform();	
//		System.out.println("PF Nominee Allocation Percentage : " + WorkmenProfile.Profile_PF_nominee_Allocation_Percentage.getText());
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//	}
//	
//	@Then("^Verify Account Name in Bank Details are displayed correctly in profile")
//	public static void Verify_Account_Name_in_Bank_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions54 = new Actions(DriverFactory.driver);
//		actions54.moveToElement(WorkmenProfile.Profile_bank_end);
//		actions54.perform();	
//		System.out.println("Bank Account Name : " + WorkmenProfile.Profile_bank_Account_Name.getText());
//		System.out.println("----------------------------");
//	}
//	
//	@Then("^Verify Account No in Bank Details are displayed correctly in profile")
//	public static void Verify_Account_No_in_Bank_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions55 = new Actions(DriverFactory.driver);
//		actions55.moveToElement(WorkmenProfile.Profile_bank_end);
//		actions55.perform();	
//		System.out.println("Bank Account No : " + WorkmenProfile.Profile_bank_Account_no.getText());
//		System.out.println("----------------------------");
//	}
//	
//	@Then("^Verify IFSC Or IBAN or SWIFT Code in Bank Details are displayed correctly in profile")
//	public static void Verify_IFSC_Or_IBAN_or_SWIFT_Code_in_Bank_Details_are_displayed_correctly_in_profile() throws Throwable {
//
//		Skill_Analysis_Objects.Skill_Analysis_Workman_Profile_Titile_BasicDetails.click();
//		Actions actions56 = new Actions(DriverFactory.driver);
//		actions56.moveToElement(WorkmenProfile.Profile_bank_end);
//		actions56.perform();	
//		System.out.println("IFSC/IBAN/SWIFT Code : " + WorkmenProfile.Profile_bank_IFSC_Or_IBAN_or_SWIFT_Code.getText());
//		System.out.println("----------------------------");
//		Screenshot.Screenshotforscenario();
//	}
//}
