package window_Handles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrytutorials {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);

		String parent = driver.getWindowHandle();
		Set<String> allWindow1 = driver.getWindowHandles();
		allWindow1.remove(parent);
		for (String windows : allWindow1) {
			driver.switchTo().window(windows);
			driver.close();
			driver.switchTo().window(parent);
		}
		
		driver.findElement(By.id("name")).sendKeys("this is task");
		Thread.sleep(2000);
		
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> allWindow2 = driver.getWindowHandles();
		allWindow2.remove(parent);
		for (String windows : allWindow2) {
			driver.switchTo().window(windows);
			driver.close();
			driver.switchTo().window(parent);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("this is task");
		
		

	}

}
