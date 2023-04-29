package stepdefinition.Induction_Dashboard;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.ObjectsReporsitory;
import object_repository.Skill_Analysis_Objects;
//import object_repository.WorkmenProfile;
import stepdefinition.Screenshot;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
public class Profile_Wage {

// Page Factory
	public Profile_Wage() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
		PageFactory.initElements(DriverFactory.driver, Skill_Analysis_Objects.class);
		// PageFactory.initElements(DriverFactory.driver, WorkmenProfile.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;

	// **************** Start import methods for step definition
	// ********************

	@Then("^verify Wage details are displayed correctly in profile")
	public static void verify_Wage_details_are_displayed_correctly_in_profile() throws Throwable {
		((JavascriptExecutor) DriverFactory.driver).executeScript("arguments[0].click();",Skill_Analysis_Objects.Profile_Wage); // Skill_Analysis_Objects.Profile_Wage.click();
		Thread.sleep(2000);
		if (Skill_Analysis_Objects.Profile_wage_Desc1.getText().equals("No records available.")) {
			System.out.println("Workmen Wage not filled yet Analysed - Wage Details Not Available");
		} else {
			System.out.println("Wage Description  : " + Skill_Analysis_Objects.Profile_wage_Desc1.getText());
			System.out.println("Wage Amount  : " + Skill_Analysis_Objects.Profile_wage_Amount1.getText());
			System.out.println("Wage Type  : " + Skill_Analysis_Objects.Profile_wage_type1.getText());
			System.out.println("----------------------------");
//			System.out.println("Wage Description  : " + Skill_Analysis_Objects.Profile_wage_Desc2.getText());
//			System.out.println("Wage Amount  : " + Skill_Analysis_Objects.Profile_wage_Amount2.getText());
//			System.out.println("Wage Type  : " + Skill_Analysis_Objects.Profile_wage_type2.getText());
//			System.out.println("----------------------------");
			Screenshot.Screenshotforscenario();
		}
	}

}
