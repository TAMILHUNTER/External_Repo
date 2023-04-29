package stepdefinition.Basic_Details.Edit;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import stepdefinition.Basic;
import stepdefinition.Basic_Details.Create.Partner;
import utils.DriverFactory;
import java.time.Duration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
public class Edit_Partner_Details {

	
	
	// Read Configuration
	public static ConfigFileReader configFileReader;

	public Edit_Partner_Details() {
		PageFactory.initElements(DriverFactory.driver, ObjectsReporsitory.class);
	}

	// Common Imports
	static WebDriverWait wait = new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(10));
	public static JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.driver;
	public static Actions actions = new Actions(DriverFactory.driver);

	// **************** Start import methods for step definition
	// ********************

	@Given("^Select Workman and Navigate to Partner$")
	public static void Select_Workman_and_Navigate_to_Partner() throws Throwable {
		Edit_Personal_Details.Navigate_to_Workman_serarch();
		Edit_Personal_Details.Search_Workman_by_Number();
		Edit_Personal_Details.Verify_Workment_Details_fetched_correctly_when_searching_by_Workmen_number();
		// ObjectsReporsitory.Dashboard_submit.click();
		ObjectsReporsitory.Induction_basicDetails.click();
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Personal_workmanName));
		wait.until(ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Personal_workmanName, "ng-reflect-model"));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Induction_partner));
		ObjectsReporsitory.Induction_partner.click();
		wait.until(ExpectedConditions.attributeToBeNotEmpty(ObjectsReporsitory.Partner_partnername, "ng-reflect-model"));
	}

	@Then("^Verify user can able to update Worktype$")
	public static void Verify_user_can_able_to_update_Worktype() throws Throwable {
		ObjectsReporsitory.Partner_workType_Edit.click();
		System.out.println("Current Work Type : " + ObjectsReporsitory.Partner_workType_Edit.getText());
		if (ObjectsReporsitory.Partner_workType_Edit.getText() == null) {
			ObjectsReporsitory.Partner_workType_Regular_Service_Workmen.click();
			System.out.println("WorkType Selected :" + ObjectsReporsitory.Partner_workType_Edit.getText());
		} else if (ObjectsReporsitory.Partner_workType_Edit.getText().equals("Regular Service Workmen")) {
			ObjectsReporsitory.Partner_workType_PRW_Hired_PM.click();
			System.out.println("WorkType Selected :" + ObjectsReporsitory.Partner_workType_Edit.getText());
		} else if (ObjectsReporsitory.Partner_workType_Edit.getText().contains("Hired P&M")) {
			ObjectsReporsitory.Partner_workType_Specialized_Works.click();
			System.out.println("WorkType Selected :" + ObjectsReporsitory.Partner_workType_Edit.getText());
		} else if (ObjectsReporsitory.Partner_workType_Edit.getText().contains("Specialized Works")) {
			ObjectsReporsitory.Partner_workType_Regular_Service_Workmen.click();
			System.out.println("WorkType Selected :" + ObjectsReporsitory.Partner_workType_Edit.getText());
		}
		Actions actions1 = new Actions(DriverFactory.driver);
		actions1.moveToElement(ObjectsReporsitory.Partner_next);
		actions1.perform();
		ObjectsReporsitory.Partner_next.click();
		
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		Thread.sleep(2000);
		
		Actions actions4 = new Actions(DriverFactory.driver);
		actions4.moveToElement(ObjectsReporsitory.skill_save);
		actions4.perform();
		ObjectsReporsitory.skill_save.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		
	}

	@Then("^Verify user can able to update Partner$")
	public static void Verify_user_can_able_to_update_Partner() throws Throwable {
		if (ObjectsReporsitory.Partner_partnername.getAttribute("value").contains("GANESAN")) {
			ObjectsReporsitory.Induction_partner.click();
			ObjectsReporsitory.Partner_partnername.clear();
			ObjectsReporsitory.Partner_partnername.sendKeys(ConfigFileReader.getpartner_name_Update());
			List<WebElement> DropdownResult = ObjectsReporsitory.Partner_partner_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getpartner_dr_details_name_Update())) {
					webElement.click();
					System.out.println(
							"Partner Selected : " + ObjectsReporsitory.Partner_partnername.getAttribute("value"));
					break;
				}
			}
		} else if (ObjectsReporsitory.Partner_partnername.getAttribute("value")
				.contains("Direct Workmen")) {
			ObjectsReporsitory.Induction_partner.click();
			ObjectsReporsitory.Partner_partnername.clear();
			ObjectsReporsitory.Partner_partnername.sendKeys(ConfigFileReader.getpartner_name_Update());
			List<WebElement> DropdownResult = ObjectsReporsitory.Partner_partner_DR;
			for (WebElement webElement : DropdownResult) {
				if (webElement.getText().equals(ConfigFileReader.getpartner_dr_details_name())) {
					webElement.click();
					System.out.println(
							"Partner Selected : " + ObjectsReporsitory.Partner_partnername.getAttribute("value"));
					break;
				}
			}

		}
		Partner.Verify_user_can_able_to_view_partner_details();
		Partner.Verify_user_can_able_to_view_partner_work_details();
		Actions actions1 = new Actions(DriverFactory.driver);
		actions1.moveToElement(ObjectsReporsitory.Partner_next);
		actions1.perform();
		ObjectsReporsitory.Partner_next.click();
		
		Actions actions2 = new Actions(DriverFactory.driver);
		actions2.moveToElement(ObjectsReporsitory.Personal_saveNext);
		actions2.perform();
		ObjectsReporsitory.Personal_saveNext.click();
		
		Actions actions3 = new Actions(DriverFactory.driver);
		actions3.moveToElement(ObjectsReporsitory.Communication_saveNext);
		actions3.perform();
		ObjectsReporsitory.Communication_saveNext.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();
		
		Actions actions4 = new Actions(DriverFactory.driver);
		actions4.moveToElement(ObjectsReporsitory.skill_save);
		actions4.perform();
		ObjectsReporsitory.skill_save.click();
		Thread.sleep(2000);
		Basic.popup_Handle2();

	}

}
