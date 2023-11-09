package workingWithLoacators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ffff {

	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://abhishek-coderr.github.io/My-Personal-Portfolio/");
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.id("main4")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.name("entry.1506107446")).sendKeys("Ayush");
		Thread.sleep(3000);
		
		driver.findElement(By.name("entry.1027507575")).sendKeys("ayush1022.be20@chitkarauniversity.edu.in");
		Thread.sleep(3000);
		driver.findElement(By.name("entry.412938103")).sendKeys("NO subject");
		Thread.sleep(3000);
		driver.findElement(By.name("entry.1372952508")).sendKeys("my msg is nothing!!");
		Thread.sleep(3000);
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("11223344");
		Thread.sleep(3000);

	}

}
