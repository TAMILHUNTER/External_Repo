package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import object_repository.Sneha.FinancePageObjects;
import stepdefinition.Webdriver;



public class Commoncontrol {
	static JavascriptExecutor js = (JavascriptExecutor) Webdriver.driver;
	static WebDriverWait wait = new WebDriverWait(Webdriver.driver, 30);

	public Commoncontrol() {

		PageFactory.initElements(Webdriver.driver, FinancePageObjects.class);
	}
	
	
public static void EIPLoginPage() throws InterruptedException {
		
	 FinancePageObjects.MUotheruser.click();
	 System.out.println("Select otheruser in EIP40 login page");
	 Thread.sleep(500);
	 
	  FinancePageObjects.TBUsername.sendKeys(ConfigFileReader.getEnter_FIN_Username());
	    
      System.out.println("Enter Username in EIP40 login page");
      Thread.sleep(500);

      FinancePageObjects.TBPassword.sendKeys(ConfigFileReader.getEnter_FIN_Password());
  
      System.out.println("Enter Password in EIP40 login page");
      
      Thread.sleep(500);

      try {
             FinancePageObjects.BULogin.click();
         } catch (Exception e) {
             js.executeScript("arguments[0].click();",  FinancePageObjects.BULogin);

        }
         System.out.println("Select Login Button in EIP40 login page");
              
    
           
	 
}
	

	public static void NavigateToGeneralCashBankRequest() throws InterruptedException {
		
		Thread.sleep(1500);

	     try {
	            FinancePageObjects.MUHomeMenu.click();
	        } catch (Exception e) {
	            js.executeScript("arguments[0].click();",  FinancePageObjects.MUHomeMenu);

	       }
	        System.out.println("Select Access Based Menu in EIP40 Home Page");
	     
	
	
	Thread.sleep(1000);

    try {
           FinancePageObjects.MUFinance.click();
       } catch (Exception e) {
           js.executeScript("arguments[0].click();",  FinancePageObjects.MUFinance);

      }
       System.out.println("Select Finance in Access Based Menu");
       
       
       try {
           FinancePageObjects.MUFinancialAccounts.click();
       } catch (Exception e) {
           js.executeScript("arguments[0].click();",  FinancePageObjects.MUFinancialAccounts);

      }
       System.out.println("Select FinancialAccounts in Access Based Menu");
            
       Thread.sleep(1000);

       try {
              FinancePageObjects.MUGeneralCashBankRequest.click();
          } catch (Exception e) {
              js.executeScript("arguments[0].click();",  FinancePageObjects.MUGeneralCashBankRequest);

         }
          System.out.println("Select GeneralCashBankRequest in Access Based Menu");
               
  	
            
	}

	}
		


		
		
		

	

	