package stepdefinition.SkillAnalysis.Validation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
public class Verification_Popup_Skill {

	public static int popup_validation;
	public static String Popup_Message;

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

				if (ObjectsReporsitory.popup_text.getText().contains("Enter Total Questions For")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}
				
				else if (ObjectsReporsitory.popup_text.getText().contains("Select Test Status Accept/Reject for")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}
				
				else if (ObjectsReporsitory.popup_text.getText().contains("Select Skill Type for")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}
				
				else if (ObjectsReporsitory.popup_text.getText().contains("Correct answers should be <= Total number of qeustions for")) {

					Screenshot.Screenshotforscenario();
					System.out.println("Popup Status : " + ObjectsReporsitory.popup_head.getText());
					System.out.println("Popup Message : " + ObjectsReporsitory.popup_text.getText());
					Actions actioneww = new Actions(DriverFactory.driver);
					actioneww.sendKeys(Keys.ESCAPE).build().perform();
					System.out.println("Error Handled : Validation Message is displayed");
					System.out.println("--------------------------------------------------------");

				}
				
				else if (ObjectsReporsitory.popup_text.getText().contains("Invalid Retest Date for")) {

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


