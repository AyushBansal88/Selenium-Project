package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.get("file:///C:/Users/ayush/OneDrive/Desktop/my%20web%20page%20testing/demo.html");

		// Step:1 create the object of Select class
		WebElement DropDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(DropDD);

//		DropDD.click();
		// Step:2 use the methods using reference variables of Select class

		// Select by index
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByIndex(4);
//
//		// Select by value
//		select.selectByValue("jgr");
//		Thread.sleep(2000);
//		select.selectByValue("nin");
//		
//		//Select by visible text
//		select.selectByVisibleText("Mercedes");

	}

}
