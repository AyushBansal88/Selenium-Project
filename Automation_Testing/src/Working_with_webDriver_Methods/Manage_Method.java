package Working_with_webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
//		int height = driver.manage().window().getSize().getHeight();
//		System.out.println(height);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(10000);
		driver.manage().window().minimize();
		int x = driver.manage().window().getPosition().getX();
		System.out.println(x);
		driver.quit();
	}
}
