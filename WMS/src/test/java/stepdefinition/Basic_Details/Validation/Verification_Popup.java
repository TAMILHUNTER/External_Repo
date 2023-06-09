package stepdefinition.Basic_Details.Validation;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import stepdefinition.Basic_Details.Create.Statutory;
import utils.DriverFactory;
import java.time.Duration;

public class Verification_Popup {

	public static int popup_validation;
	public static String Popup_Message;
	public static int Aadhaar_Number;

	// Read Configuration
	public static ConfigFileReader configFileReader;

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));

	// **************** Start import methods for step definition
	// ********************
	// DataBase Connection

	public static void Validation_popup_handle() throws Throwable {

		Thread.sleep(3000);
		popup_validation = ObjectsReporsitory.basic_popup_validation.size();
		System.out.println("Popup : " + popup_validation);

		if (popup_validation == 0) {
			System.out.println("popup Message is not displayed");
			System.out.println("--------------------------------------------------------");
		} else {

			Popup_Message = ObjectsReporsitory.popup_text.getText();

			if (ObjectsReporsitory.popup_head.getText().equals("Success")) {
				System.out.println(ObjectsReporsitory.popup_text.getText());
				wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.WorkmanSearchPopup_ok));
				ObjectsReporsitory.WorkmanSearchPopup_ok.click();
				System.out.println("-------------Details are Saved----------------");

			} else if (ObjectsReporsitory.popup_head.getText().equals("Error")) {

				if (ObjectsReporsitory.popup_text.getText().contains("Please select the Partner")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}
				else if (ObjectsReporsitory.popup_text.getText().contains("Please select Partner ID")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Work Type")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Work Type")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please select nationality")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("police")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Religion")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Workmen Name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Father Name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Date of birth")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("DOB should be within the range of")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Gender")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Marital Status")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Blood Group")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Please upload Workmen Photo")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Spouse")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Language details")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Enter The CSTI Number")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Enter The NAPS Number")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Workmen Number already exists")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Permanent Address")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Permanent Pincode")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Permanent Village")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Temporary Address")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Temporary Pincode")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Temporary Village")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Emergency Contact Address")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Emergency Contact Mobile No")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Emergency Contact Name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Emergency Contact Pincode")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Emergency Contact Village")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Relation with Workmen")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Mobile Number")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText()
						.contains("Please fill all mandatory fields in Skill")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

//Failed Case
				else if (ObjectsReporsitory.popup_text.getText().contains("Deployment")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Enter Qualification")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Enter branch")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Enter institution")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Skill category")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Select Skill")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Invalid Start Date")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Invalid End Date")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Enter organization name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Enter organization name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Enter Project name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Enter project location")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Please enter valid period from")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Please enter valid period to")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter Valid Aadhaar")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}
				
				else if (ObjectsReporsitory.popup_text.getText().contains("Aadhaar field is required")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Work permit expiry")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				} else if (ObjectsReporsitory.popup_text.getText().contains("Labour Card expiry")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Enter Nominee Name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Enter Relationship")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Allocation percentage should be 100")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Invalid Aadhar number")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

					for (int k = 0; k > 1; k++) {
						System.out
								.println("Error : Generated Aadhaar number Not Valid - Trying Another Aadhaar Number");
						// ObjectsReporsitory.partner_WorkmanPopup.click();

						Actions actions_Keys3 = new Actions(DriverFactory.driver);
						actions_Keys3.sendKeys(Keys.ESCAPE);
						actions_Keys3.perform();

						// Statutory.Verify_User_can_able_to_Add_Aadhaar();
						ObjectsReporsitory.statutoryDetails_Aadhaar.click();
						ObjectsReporsitory.statutoryDetails_Aadhaar.clear();
						ObjectsReporsitory.statutoryDetails_Aadhaar.click();

						Random rnd = new Random();
						long number1 = rnd.nextInt(623);
						long number2 = rnd.nextInt(328);
						long number3 = rnd.nextInt(65);
						long number4 = rnd.nextInt(652);
						ObjectsReporsitory.statutoryDetails_Aadhaar
								.sendKeys("64" + number1 + number2 + number3 + number4);
						Aadhaar_Number = ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value").length();
						System.out.println("Length of the Aadhaar Number : " + Aadhaar_Number);
						if (Aadhaar_Number < 12) {
							ObjectsReporsitory.statutoryDetails_Aadhaar.click();

							Actions actions_key1 = new Actions(DriverFactory.driver);
							actions_key1.sendKeys(Keys.END);
							actions_key1.perform();
							ObjectsReporsitory.statutoryDetails_Aadhaar.sendKeys("5");
							System.out.println("Aadhaar Number :"
									+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
						} else if (Aadhaar_Number > 12) {
							ObjectsReporsitory.statutoryDetails_Aadhaar.click();
							Actions actions_key2 = new Actions(DriverFactory.driver);
							actions_key2.sendKeys(Keys.END);
							actions_key2.perform();
							Actions actions_key3 = new Actions(DriverFactory.driver);
							actions_key3.sendKeys(Keys.BACK_SPACE);
							actions_key3.perform();
							System.out.println("Aadhaar Number :"
									+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
						} else {
							System.out.println("Aadhaar Number :"
									+ ObjectsReporsitory.statutoryDetails_Aadhaar.getAttribute("value"));
						}

						Statutory.Verify_User_can_able_save_Statutory_Details();

					}
				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Enter Account Name")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please enter account number")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Enter IFSC Code")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Enter SWIFT Code")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

				else if (ObjectsReporsitory.popup_text.getText().contains("Please Enter IBAN Code")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}

			}
		}
	}
}
