package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		WebElement scroll = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		Thread.sleep(1000);
		hide.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='ayush'", textbox);
		Thread.sleep(1000);
		show.click();
		
		
		
		
//		WebElement rest = driver.findElement(By.xpath("//h5[text()='Kanpur Restaurants']"));
	}

}
