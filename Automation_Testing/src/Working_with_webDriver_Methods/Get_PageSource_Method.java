package Working_with_webDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageSource_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String pagesource= driver.getPageSource();
			System.out.println(pagesource);
	}

}
