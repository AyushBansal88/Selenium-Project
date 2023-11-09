package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_into_View {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement rest = driver.findElement(By.xpath("//h5[text()='Kanpur Restaurants']"));
		js.executeScript("arguments[0].scrollIntoView(true)",rest);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",rest);
		}
	}

