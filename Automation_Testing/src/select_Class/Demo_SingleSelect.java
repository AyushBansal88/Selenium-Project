package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_SingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement DropDD = driver.findElement(By.name("country"));
		Select select = new Select(DropDD);

		if (!(select.isMultiple())) {

			for (WebElement element : select.getOptions()) {
				System.out.println(element.getText());
			}
		}

	}

}
