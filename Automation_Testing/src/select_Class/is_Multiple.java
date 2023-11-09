package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class is_Multiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ayush/OneDrive/Desktop/demo.html");

		WebElement SingleDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(SingleDD);
		System.out.println(select.isMultiple());
		System.out.println();
		WebElement MultipleDD = driver.findElement(By.id("multiple_cars"));
		Select select2 = new Select(MultipleDD);
		System.out.println(select2.isMultiple());
		Thread.sleep(3000);
		driver.quit();

	}

}
