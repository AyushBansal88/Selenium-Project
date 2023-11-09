package window_Handles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_AddToKart {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub

		// span[@ class='B_NuCI']/../../following-sibling::div[3]/div/div/div[1]
		// span[@ class='B_NuCI']

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
		Thread.sleep(2000);

		for (int i = 1; i < 6; i++) {
			driver.findElement(By.xpath("(//div[@class='_4rR01T'])[" + i + "]")).click();
			Thread.sleep(2000);
			Set<String> allwindow = driver.getWindowHandles();
			allwindow.remove(parent);
			for (String win : allwindow) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//*[local-name() = 'svg' and @class='_1KOMV2']")).click();
				Thread.sleep(3000);
				driver.close();
				driver.switchTo().window(parent);
				Thread.sleep(2000);
			}

		}

		driver.findElement(By.xpath("(//a)[5]")).click();
		Thread.sleep(3000);

		TakesScreenshot screenss = (TakesScreenshot) driver;
		File src = screenss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/flipkart.png");
		FileHandler.copy(src, dest);

		Thread.sleep(3000);

		for (int i = 1; i < 6; i++) {

			driver.findElement(By.xpath("//div[contains(text(),'Remove')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(text(),'Remove')])[2]")).click();

			for (int j = 0; j < 4; j++) {
				Robot robot = new Robot();

				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
			}
			Thread.sleep(4000);
		}

		driver.close();

	}

}
