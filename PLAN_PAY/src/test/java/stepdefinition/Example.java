package stepdefinition;

import dataProviders.ConfigFileReader;
import object_repository.Login_Objects;

public class Example {

	public static void login(String username) {
		Login_Objects.Otheruser.click();
		Login_Objects.Username.sendKeys(username);
		Login_Objects.Password.sendKeys(ConfigFileReader.getApprover_password());
		Login_Objects.Login.click();
		
	}
	

}
