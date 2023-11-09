package workingWithLoacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Link_Text_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.actitime.com/login.do");
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
//		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.linkText("BOOKS")).click();
		

	}

}
