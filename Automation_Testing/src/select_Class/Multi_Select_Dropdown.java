package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		driver.get("file:///D:/demo.html");
		driver.get("file:///C:/Users/ayush/OneDrive/Desktop/demo.html");

		// Step:1 create the object of Select class
		WebElement DropDD = driver.findElement(By.id("multiple_cars"));
		Select select = new Select(DropDD);
		select.getOptions();
		for (int i = 0; i < select.getOptions().size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(2000);
		}
		for (int i = 0; i < select.getOptions().size(); i++) {
			select.deselectByIndex(i);
			Thread.sleep(2000);
		}
	}

}
