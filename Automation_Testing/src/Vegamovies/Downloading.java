package Vegamovies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Downloading {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("\"C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe\"");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://vegamovies.zip/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		//Thread.sleep(5000);
		String mname = "Iron Man";
		driver.findElement(By.id("s")).sendKeys(mname, Keys.ENTER);
		//Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Vegamovies.screenshot/movie.png");
		FileHandler.copy(src, dest);
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'" + mname + "')])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[3]")).click();
		//Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);
		for (String neww : allwindow) {
			driver.switchTo().window(neww);
			driver.findElement(By.xpath("//a//button[contains(text(),'V-Cloud')]")).click();
			//Thread.sleep(3000);
		}
		Set<String> allwindow2 = driver.getWindowHandles();
		allwindow2.remove(parent);
		allwindow2.removeAll(allwindow);

		for (String string : allwindow2) {
			driver.switchTo().window(string);
			driver.findElement(By.id("download")).click();
		}

		//Thread.sleep(10000);

		String pagetitle = driver.getTitle();
		String title1 = "courselinkfree.us - Google Search"; // for link
		String title2 = "courselinkfree.us - Search"; // for link
		String title3 = "courselinkfree.us - Brave Search"; // for link
		String title4 = "courselinkfree.us - Yahoo Search Results"; // for link +switch
		String title5 = "site:courselinkfree.us, Ask.com"; // for link + switch
		String title6 = "AioTechnical.com"; // for verification
		String title7 = "aiotechnical.com - Google Search"; // for link
		// Course Link Free - Daily Course News and Info//for verification+ switch

		if (pagetitle.equals(title1)) {
			// xpath //h3
			driver.findElement(By.xpath("//h3")).click();
		} else if (pagetitle.equals(title2)) {
			// xpath (//a)[74] //a[text()='Course Link Free - Daily Course News and Info']
			driver.findElement(By.xpath("//a[text()='Course Link Free - Daily Course News and Info']")).click();
		} else if (pagetitle.equals(title3)) {
			// xpath (//div)[16]
			driver.findElement(By.xpath("(//div)[16]")).click();
		} else if (pagetitle.equals(title4)) {

		} else if (pagetitle.equals(title5)) {
			// xpath //a[@target='_blank'] + switch
			driver.findElement(By.xpath("//a[@target='_blank']")).click();
			Set<String> verification = driver.getWindowHandles();
			verification.remove(parent);
			verification.removeAll(allwindow);
			verification.removeAll(allwindow2);

		} else if (pagetitle.equals(title6)) {
			// do nothing
			System.out.println("it directly opened");
		} else if (pagetitle.equals(title7)) {
			driver.findElement(By.xpath("(//h3)[1]")).click();
		}

		//Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='top_nav']")).click();
		//Thread.sleep(20000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Continue »']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='top_nav']")).click();
		//Thread.sleep(17000);
		for (int i = 1; i < 8; i++) {
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			//Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//a[text()='Continue »']")).click();
		//Thread.sleep(9000);
		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Generate Link »']")).click();
		//Thread.sleep(16000);
		driver.findElement(By.xpath("//a[text()='Go to Link »']")).click();

	}

}
