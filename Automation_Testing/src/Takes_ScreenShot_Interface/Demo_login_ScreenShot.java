package Takes_ScreenShot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo_login_ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("jnvdv");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("vdfvfd");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("aucjdskjsk.laptiovdkjvndfkjvdf.edu.in");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("11223344");
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("11223344");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		
		
		// Typecasting driver control to TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Used to take the screenshot and store in RAM/Local memory
		File src = ts.getScreenshotAs(OutputType.FILE);

		// Setting the path, where we want to store the screenshot
		File dest = new File("./screenshots/demoLogin.jpeg");

		// Copying screenshot from RAM to system memory
		FileHandler.copy(src, dest);
	}
}
