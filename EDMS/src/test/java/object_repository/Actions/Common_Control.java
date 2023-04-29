/*package object_repository.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class Common_Control {

	
	

	//***********************************************************************************************************
		
		//Praveenkumar Raj Added : 08.11.2022
		
		public static void popup_handlepk() throws Throwable {


			wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit));
			status = object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.isEnabled();
			assertTrue(status);
			Reporter.addScenarioLog("InProgress Tab Hold Payment Release option is Enabled");

			Thread.sleep(2000);
				object_repository.Praveen.object_repository.Payment_Hold_ForAction_Create_RD_Submit.click();

			
			if (object_repository.Praveen.object_repository.popup_head.getText().equals("Confirmation ")) {
				System.out.println("Popup Response :" + object_repository.Praveen.object_repository.popup.getText());
				Thread.sleep(2000);
				System.out.println(object_repository.Praveen.object_repository.Payment_Release_PopupMsg + ": Pop-up msg will be handled ");
				System.out.println("00000");
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes));
				object_repository.Praveen.object_repository.Payment_Hold_ForAction_Cnfrm_Yes.click();
			Screenshot.Screenshotforscenario();
			System.out.println("1111");
				System.out.println(object_repository.Praveen.object_repository.popup_text.getText());
	Thread.sleep(3000);
	System.out.println("222222222");
	Screenshot.Screenshotforscenario();
	System.out.println("3333333333");
				wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
				object_repository.Praveen.object_repository.Success_Ok.click();
				System.out.println("*****Details are saved*****");
				System.out.println("44444444");
			}

			 else if (object_repository.Praveen.object_repository.popup_head.getText().equals("Error")) {

					System.out.println("Error : Release Amount Should not be more than Hold Amount ");

					wait.until(ExpectedConditions.elementToBeClickable(object_repository.Praveen.object_repository.Success_Ok));
					object_repository.Praveen.object_repository.Success_Ok.click();
					
				}
		
			}
		//Pk
	//***********************************************************************************************************
		
	
	
	
	
	
	
	
	
	
	
}
*/