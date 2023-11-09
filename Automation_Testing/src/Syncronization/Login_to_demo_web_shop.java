package Syncronization;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_to_demo_web_shop {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register"))).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName"))).sendKeys("jnvdv");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("LastName"))).sendKeys("vdfvfd");
			Random random = new Random();
			int num = random.nextInt(100);
			String email = "laptopdixt" + num + "@gmail.com";
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email"))).sendKeys(email);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password"))).sendKeys("11223344");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmPassword"))).sendKeys("11223344");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-button"))).click();
			Thread.sleep(3000);
			driver.quit();
			

	}

}
