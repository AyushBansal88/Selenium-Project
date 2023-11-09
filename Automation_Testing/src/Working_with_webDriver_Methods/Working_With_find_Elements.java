package Working_with_webDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_find_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
		for (WebElement mobiles : mobileList) {
			String mobileName = mobiles.getText();
			String xPath = "//div[text()='" + mobileName + "']/ancestor::div[3]//div[contains(@class,'_WHN1')]";
			WebElement price = driver.findElement(By.xpath(xPath));
			System.out.println(mobileName);
			System.out.println(price.getText());
			System.out.println();
		}
		Thread.sleep(50000);

		driver.quit();

	}

}
