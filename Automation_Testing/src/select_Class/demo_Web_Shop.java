package select_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_Web_Shop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");


driver.findElement(By.xpath("(//a)[6]")).click();
WebElement options = driver.findElement(By.id("products-orderby"));
Select select = new Select(options);
		

for(int i = 0 ; i < select.getOptions().size();i++) {
	select.selectByIndex(i);
	Thread.sleep(2000);
	select=new Select(driver.findElement(By.id("products-orderby")));
}

	}

}
