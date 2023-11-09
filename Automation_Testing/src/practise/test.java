package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Options var1 = driver.manage();
		Window var2 = var1.window();
	    var2.fullscreen();
	}
}
