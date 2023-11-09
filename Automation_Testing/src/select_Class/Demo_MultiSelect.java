package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement DropDD = driver.findElement(By.name("Month"));
		
		Select select = new Select(DropDD);
		
		if(select.isMultiple()) {
			for (int i = 0; i < select.getOptions().size(); i++) {
				select.selectByIndex(i);
				Thread.sleep(2000);
		}

	}
	}
}
