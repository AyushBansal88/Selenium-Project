package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(3000);
		
		//ACTIONS Class FOR USING RIGHT CLICK
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(element).perform();
		
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Edit']"));
		action.click(element2).perform();
		Thread.sleep(2000);
		
		//js -- ALERT HANDLING
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		action.contextClick(element).perform();
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Cut']"));
		action.click(element3).perform();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		action.contextClick(element).perform();
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Copy']"));
		action.click(element4).perform();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		action.contextClick(element).perform();
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//span[text()='Paste']"));
		action.click(element5).perform();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		action.contextClick(element).perform();
		Thread.sleep(2000);
		WebElement element6 = driver.findElement(By.xpath("//span[text()='Delete']"));
		action.click(element6).perform();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		action.contextClick(element).perform();
		Thread.sleep(2000);
		WebElement element7 = driver.findElement(By.xpath("//span[text()='Quit']"));
		action.click(element7).perform();
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();

	}
}
