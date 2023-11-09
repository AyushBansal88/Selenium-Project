package workingWithLoacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Register_to_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ayush");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("Bansal");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("ayush1022.be20@chitkarauniversity.edu.in");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("11223344");
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("11223344");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
	}
}
