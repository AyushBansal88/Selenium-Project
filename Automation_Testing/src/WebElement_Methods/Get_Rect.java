package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement male = driver.findElement(By.xpath("//input[@value='Search']"));
		System.out.println(male.getRect());
		System.out.println(male.getRect().getX());
		System.out.println(male.getRect().getY());
		System.out.println(male.getRect().getHeight());
		System.out.println(male.getRect().getWidth());

	}
}
