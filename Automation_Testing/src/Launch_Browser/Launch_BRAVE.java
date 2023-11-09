package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch_BRAVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("\"C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe\"");
		new ChromeDriver(opt);

	}

}
