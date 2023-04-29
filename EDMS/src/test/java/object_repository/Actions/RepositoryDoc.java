//package object_repository.Actions;
//
//import static org.junit.Assert.assertEquals;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import object_repository.Locators.RepositoryDocObject;
//import stepdefinition.Webdriver;
//
//
//public class RepositoryDoc {
//	
//		WebDriverWait wait=new WebDriverWait(Webdriver.driver, 10000);
//		public RepositoryDoc() {
//			PageFactory.initElements(Webdriver.driver, RepositoryDocObject.class);
//			
//		}
//		
//		public void mainMenuRepo() {		
//			WebElement repo = RepositoryDocObject.RepositoryDoc;
//			Actions action = new Actions(Webdriver.driver);
//			action.moveToElement(repo).perform();		
//		}
//		public void  repositoryDocument() {
//			RepositoryDocObject.repositoryDocument.click();
//			wait.until(ExpectedConditions.textToBePresentInElement(RepositoryDocObject.repositoryDocument, "REPOSITORY DOCUMENT"));
//			assertEquals("REPOSITORY DOCUMENT", RepositoryDocObject.repositoryDocument.getText());
//		}
//		public   void  createBtn() {
//			
//			RepositoryDocObject.createbtn.click();
//			wait.until(ExpectedConditions.textToBePresentInElement(RepositoryDocObject.createbtn, "Create Button"));
//			assertEquals("Create Button", RepositoryDocObject.createbtn.getText());
//		}
//		public   void  discipline() {
//			RepositoryDocObject.Discipline.click();
//			wait.until(ExpectedConditions.textToBePresentInElement(RepositoryDocObject.Discipline, "Click Discipline"));
//			assertEquals("Click Discipline", RepositoryDocObject.Discipline.getText());
//		}
//		public   void  civilDiscipline() {
//			RepositoryDocObject.civil.click();
//			wait.until(ExpectedConditions.textToBePresentInElement(RepositoryDocObject.civil, "Civil Disc"));
//			assertEquals("Civil Disc", RepositoryDocObject.civil.getText());
//		}
//		public   void  electricalDisc() {
//			RepositoryDocObject.Electrical.click();
//			wait.until(ExpectedConditions.textToBePresentInElement(RepositoryDocObject.Electrical, "Electrical"));
//			assertEquals("Electrical", RepositoryDocObject.Electrical.getText());
//		}
////		public   void  projectConfiguration() {
////			MenuObjects.projectConfiguration.click();	
////		}
////		public   void  master() {
////			MenuObjects.master.click();
////		}
////		public   void  dashboardReports() {
////			MenuObjects.dashboardReports.click();
////			
////		}
//
//	
//
//	}
