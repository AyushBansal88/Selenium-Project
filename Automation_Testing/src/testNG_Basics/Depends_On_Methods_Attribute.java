package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods_Attribute {

	@Test
	public void register() {
		Reporter.log("Executing register....",true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("Executing login test",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void search() {
		Reporter.log("Executing search test",true);
	}

}
