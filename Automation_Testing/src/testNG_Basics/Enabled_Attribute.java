package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_Attribute {

	@Test
	public void register() {
		Reporter.log("Executing register....",true);
	}
	
	@Test(priority = 1,dependsOnMethods = "register")
	public void login() {
		Reporter.log("Executing login test",true);
	}
	
	@Test(enabled = false)
	public void search() {
		Reporter.log("Executing search test",true);
	}

}
