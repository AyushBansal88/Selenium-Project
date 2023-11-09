package testNG_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel_Execution {

	@Test(invocationCount = 5,threadPoolSize = 5)
	public void register() {
		new ChromeDriver();
		
		Reporter.log("Executing register....",true);
	}
	
}
