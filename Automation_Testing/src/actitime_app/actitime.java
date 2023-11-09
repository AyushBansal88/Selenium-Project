package actitime_app;

import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ayush/login.do");
		Random random = new Random();
		int num = random.nextInt(100);
		String custname = "ICIC"+num+"BANK";
		String projectname = "Payment Application"+num;
		String taskname = "Testing"+num;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(custname, Keys.TAB, "Reputed Private Bank ");
		driver.findElement(By.xpath("//input[@value='Create Customer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		WebElement projectDD = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select select = new Select(projectDD);
		select.selectByVisibleText(custname);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(projectname,Keys.TAB,"Application for users to login and do the transactions and check balance");
		driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open Tasks")).click();
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		WebElement selectcustomertask = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select select2 =new Select(selectcustomertask);
		select2.selectByVisibleText(custname);
		WebElement project = driver.findElement(By.xpath("//select[@name='projectId']"));
		Select select3 = new Select(project);
		select3.selectByVisibleText(projectname);
		driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys(taskname);
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		driver.findElement(By.linkText("Time-Track")).click();
		driver.findElement(By.linkText("Create new tasks")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);
		for (String win : allwindow) {
			driver.switchTo().window(win);
			WebElement customerDD = driver.findElement(By.xpath("//select[@name='customerId']"));
			Select select4 = new Select(customerDD);
			select4.selectByVisibleText(custname);
			WebElement projectDD2 = driver.findElement(By.xpath("//select[@name='projectId']"));
			Select select5 = new Select(projectDD2);
			select5.selectByVisibleText(projectname);
			driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys(taskname);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
			driver.close();
		}
		driver.switchTo().window(parent);

	}

}
