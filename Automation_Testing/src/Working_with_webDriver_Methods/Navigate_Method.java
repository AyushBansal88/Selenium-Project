package Working_with_webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
		driver.navigate().to("file:///C:/Users/ayush/OneDrive/Desktop/New%20folder/web.html");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();	
	}
}
