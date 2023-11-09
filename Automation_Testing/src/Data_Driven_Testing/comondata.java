package Data_Driven_Testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility_package.Utility_Class;
public class comondata {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Utility_Class.getPropertyValue("url"));
	
	driver.findElement(By.id("Email")).sendKeys(Utility_Class.getPropertyValue("username"));
	driver.findElement(By.id("Password")).sendKeys(Utility_Class.getPropertyValue("pass"));
	driver.findElement(By.xpath("//input[contains(@class,\"login-button\")]")).click();
	

}
}
