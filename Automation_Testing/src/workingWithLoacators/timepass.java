package workingWithLoacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timepass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Python')])[9]")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
