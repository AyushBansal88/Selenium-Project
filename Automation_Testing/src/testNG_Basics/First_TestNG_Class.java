package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	
	@Test
	public void register() {
		Reporter.log("Executing register....",true);
	}
	
	@Test
	public void login() {
		Reporter.log("Executing login test",true);
	}
	
	@Test
	public void search() {
		Reporter.log("Executing search test");
	}

}
