package window_Handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_childWindow {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//span[@ class='B_NuCI']/../../following-sibling::div[3]/div/div/div[1]
		//span[@ class='B_NuCI']
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		String current = driver.getWindowHandle();
		   Set<String> allwindow = driver.getWindowHandles();
allwindow.remove(current);
		   
		   for (String windows : allwindow) {
			driver.switchTo().window(windows);

		
		
		String name = driver.findElement(By.xpath("//span[@ class='B_NuCI']")).getText();
		System.out.println(name);
		
		WebElement price = driver.findElement(By.xpath("//span[@ class='B_NuCI']/../../following-sibling::div[3]/div/div/div[1]"));
		System.out.println(price.getText());
		Thread.sleep(2000);
		   }
	}

}
