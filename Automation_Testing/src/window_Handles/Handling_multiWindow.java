package window_Handles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ayush/OneDrive/Desktop/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(4000);
		
		String parent = driver.getWindowHandle();
		Set<String> allWindowid = driver.getWindowHandles();

		allWindowid.remove(parent);
		for (String WindowID : allWindowid) {
			driver.switchTo().window(WindowID);

			System.out.println(driver.getTitle());
				driver.close();
		}
	}
}
