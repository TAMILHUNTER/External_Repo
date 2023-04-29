package repository.Actions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.Locators.CommonControlObject;
import object_repository.Locators.LoginObjects;
import stepdefinition.Webdriver;

public class ApproverLoginAction {
	
	static LoginActions loginactions=new LoginActions();
	static WebDriverWait wait=new WebDriverWait(Webdriver.driver, 3000);
	public  static void otheruserLogin() throws InterruptedException {
		loginactions.otheruserLogin();
	}
	
	public  static  void username_password(String userName) {
		LoginObjects.username.sendKeys(userName);
		LoginObjects.password.sendKeys("LNT%qa22");
	}	
	public  static void submit() {
		LoginObjects.loginbutton.click();
	}
	public static void rcApprove(String documentNumber) throws InterruptedException {
		CommonControlObject.forAction.click();
		CommonControlActions.clickFilter();
		CommonControlActions.sendDocNumberToFilterApproveDoc(documentNumber);
		wait.until(ExpectedConditions.textToBePresentInElement(CommonControlObject.pageInfo, "1 - 1 of 1 items"));
		assertEquals(documentNumber, CommonControlObject.searchDocNumberApproveorReject.getText());		
		CommonControlObject.selectDocToApprove.click();
		CommonControlObject.approve.click();
		CommonControlActions.wait(CommonControlObject.yes);
		if(CommonControlObject.confirmationHeaderApprover.getText().equals("Confirmation")) {
			assertEquals("Confirmation",CommonControlObject.confirmationHeaderApprover.getText());
			assertEquals("Do you want to Approve Rate Contract?", CommonControlObject.confirmationHeaderBodyrText.getText());
			CommonControlObject.approverRemarks.sendKeys("Good to approve");			
			CommonControlObject.yes.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
		assertEquals("Success", CommonControlObject.successTitle.getText());
		assertEquals("Workflow Completed Successfully", CommonControlObject.successBody.getText());
		CommonControlObject.ok.click();
		CommonControlObject.authorized.click();
		CommonControlActions.clickFilter();
		CommonControlActions.refresh();
		CommonControlActions.sendDocNumberToFilterApproveDoc(documentNumber);
		CommonControlActions.filtersearchResult(documentNumber);
        assertEquals("Authorize",CommonControlObject.status.getText());	
	}
	
	public static void rcReject(String documentNumber) throws InterruptedException {
		CommonControlObject.forAction.click();
		CommonControlActions.clickFilter();
		CommonControlActions.sendDocNumberToFilterApproveDoc(documentNumber);				
		wait.until(ExpectedConditions.textToBePresentInElement(CommonControlObject.pageInfo, "1 - 1 of 1 items"));
		assertEquals(documentNumber, CommonControlObject.searchDocNumberApproveorReject.getText());	
		CommonControlObject.selectDocument.click();
		CommonControlObject.reject.click();
		CommonControlActions.wait(CommonControlObject.yes);
		if(CommonControlObject.confirmationHeaderApprover.getText().equals("Confirmation")) {
			assertEquals("Confirmation",CommonControlObject.confirmationHeaderApprover.getText());
			assertEquals("Do you want to Reject Rate Contract?", CommonControlObject.confirmationHeaderBodyrText.getText());
			CommonControlObject.approverRemarks.sendKeys("Update Rate Contract With New Charges");			
			CommonControlObject.yes.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(CommonControlObject.ok));
		assertEquals("Success", CommonControlObject.successTitle.getText());
		assertEquals("Rejected successfully", CommonControlObject.successBody.getText());
		CommonControlObject.ok.click();
		CommonControlObject.all.click();
		CommonControlActions.refresh();
		CommonControlActions.clickFilter();
		CommonControlActions.sendDocNumberToFilterApproveDoc(documentNumber);
		CommonControlActions.filtersearchResult(documentNumber);
        assertEquals("Rejected",CommonControlObject.status.getText());	
	}
}
