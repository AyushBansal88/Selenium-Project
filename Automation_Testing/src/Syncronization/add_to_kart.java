package Syncronization;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class add_to_kart {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.id("Email")).sendKeys("laptopdixt38@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("11223344");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/democart1.png");
		FileHandler.copy(src, dest);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@title='Continue']")).click();
		driver.findElement(By.id("PickUpInStore")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./screenshots/democart.png");
		FileHandler.copy(src2, dest2);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
