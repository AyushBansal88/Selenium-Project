package workingWithLoacators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Relative_xPath_By_Text_Contains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
//    driver.findElement(By.linkText("Log in")).click();
//	Thread.sleep(3000);
//	WebElement text =  driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
//	System.out.println(text.getText());
//	if (text.isDisplayed()) {
//		System.out.println(text.isDisplayed());
//	} else {
//System.out.println("Other page");
//	}
//	
//	System.out.println(text.isDisplayed());

		WebElement text2 = driver.findElement(By.xpath("//a[contains(text(),'Reg')]"));
		System.out.println(text2.getText());
		if (text2.isDisplayed()) {
			System.out.println("we are in correct page");
			Thread.sleep(1000);

			driver.findElement(By.xpath("//a[contains(text(),'Reg')]")).click();
			WebElement text3 = driver.findElement(By.xpath("//h1[contains(text(),'Reg')]"));
			System.out.println(text3.getText());
			if (text3.isDisplayed()) {
				Thread.sleep(1000);

				driver.findElement(By.xpath("//input[@id='gender-male']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("first");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("last");
				Thread.sleep(1000);
				Random random = new Random();
				int num = random.nextInt(10000);
				String email = "laptopdixt" + num + "@gmail.com";
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pass123");
				driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("pass123");
				driver.findElement(By.xpath("//input[@id='register-button']")).click();
				WebElement confirmation = driver.findElement(By.xpath("//div[contains(text(),'Your ')]"));
				System.out.println(confirmation.getText());
				if (confirmation.isDisplayed()) {
					System.out.println("Login is Sucessfull");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@value='Continue']")).click();
					System.out.println("Dashboard");
				} else {
					System.out.println("Error has occured ");
				}

			} else {

			}
		} else {
			System.out.println("We are in wrong page");

		}
		Thread.sleep(7000);
		driver.quit();
	}
}
