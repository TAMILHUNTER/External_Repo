//package test;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import dataProviders.ConfigFileReader;
//import object_repository.ObjectsReporsitory;
//
//public class kendo_Calender_Robot {
//
//	public static void kendo_calender_DOB  () throws InterruptedException, AWTException {
//		Robot robot=new Robot();	
//		ObjectsReporsitory.Kendo_DateField.click();
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_HOME);
//		robot.keyRelease(KeyEvent.VK_HOME);
//		Thread.sleep(2000);
//		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month());
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year());
//		Thread.sleep(2000);
//		}
//	public static void kendo_calender_DOB_update  () throws InterruptedException, AWTException {
//		Robot robot=new Robot();	
//		ObjectsReporsitory.Kendo_DateField.click();
//		robot.keyPress(KeyEvent.VK_HOME);
//		robot.keyRelease(KeyEvent.VK_HOME);
//		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month_update());
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year_update());
//		}
//	public static void kendo_calender_Skill_Release_Date  () throws InterruptedException, AWTException {
//		Robot robot=new Robot();	
//		ObjectsReporsitory.Kendo_DateField.click();
//		robot.keyPress(KeyEvent.VK_HOME);
//		robot.keyRelease(KeyEvent.VK_HOME);
//		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Date_Month_update());
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		ObjectsReporsitory.Kendo_DateField.sendKeys(ConfigFileReader.getDOB_Year_update());
//		}
//	/*public static void kendo_calender_YearofPassing  () throws InterruptedException, AWTException {
//		Robot robot=new Robot();	
//		ObjectsReporsitory.Kendo_yearofPassing.click();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_DELETE);
//		robot.keyRelease(KeyEvent.VK_DELETE);
//		robot.keyPress(KeyEvent.VK_HOME);
//		robot.keyRelease(KeyEvent.VK_HOME);
//		ObjectsReporsitory.Kendo_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Date_Month());
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		ObjectsReporsitory.Kendo_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year());
//		}	
//	public static void kendo_calender_YearofPassing2  () throws InterruptedException, AWTException {
//		Robot robot=new Robot();	
//		ObjectsReporsitory.Kendo_yearofPassing.click();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_DELETE);
//		robot.keyRelease(KeyEvent.VK_DELETE);
//		robot.keyPress(KeyEvent.VK_HOME);
//		robot.keyRelease(KeyEvent.VK_HOME);
//		ObjectsReporsitory.Kendo_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Date_Month2());
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		ObjectsReporsitory.Kendo_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year2());
//		}
//	public static void kendo_calender_YearofPassing3  () throws InterruptedException, AWTException {
//		Robot robot=new Robot();	
//		ObjectsReporsitory.Kendo_yearofPassing.click();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_DELETE);
//		robot.keyRelease(KeyEvent.VK_DELETE);
//		robot.keyPress(KeyEvent.VK_HOME);
//		robot.keyRelease(KeyEvent.VK_HOME);
//		ObjectsReporsitory.Kendo_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Date_Month3());
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		ObjectsReporsitory.Kendo_yearofPassing.sendKeys(ConfigFileReader.getEducation_YearofPassing_Year3());
//		}*/
//	
//		}
