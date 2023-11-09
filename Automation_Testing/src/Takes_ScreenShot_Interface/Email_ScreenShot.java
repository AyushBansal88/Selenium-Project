package Takes_ScreenShot_Interface;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Email_ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Reg')]")).click();
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		WebElement element = driver.findElement(By.xpath("(//a)[2]"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/emailid"+num+".png");
		FileHandler.copy(src, dest);

		Thread.sleep(3000);
		driver.quit();
	}
}
