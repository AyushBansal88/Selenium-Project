package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
public static void main(String[] args) throws InterruptedException {
	
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//	Actions action =new Actions(driver);
//	WebElement source = driver.findElement(By.id("draggable"));
//	WebElement Destination = driver.findElement(By.id("droppable"));
//	Thread.sleep(3000);
//	action.dragAndDrop(source, Destination).perform();
//	
//	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions action = new Actions(driver);
	
	WebElement source1 = driver.findElement(By.id("box1"));
	WebElement destination1 = driver.findElement(By.id("box101"));
	action.dragAndDrop(source1, destination1).perform();
	Thread.sleep(2000);
	
	
	WebElement source2 = driver.findElement(By.id("box6"));
	WebElement destination2 = driver.findElement(By.id("box106"));
	action.dragAndDrop(source2, destination2).perform();
	Thread.sleep(2000);
	
	WebElement source3 = driver.findElement(By.id("box7"));
	WebElement destination3 = driver.findElement(By.id("box107"));
	action.dragAndDrop(source3, destination3).perform();
	Thread.sleep(2000);
	
	WebElement source4 = driver.findElement(By.id("box2"));
	WebElement destination4 = driver.findElement(By.id("box102"));
	action.dragAndDrop(source4, destination4).perform();
	Thread.sleep(2000);
	
	WebElement source5 = driver.findElement(By.id("box3"));
	WebElement destination5 = driver.findElement(By.id("box103"));
	action.dragAndDrop(source5, destination5).perform();
	Thread.sleep(2000);
	
	WebElement source6 = driver.findElement(By.id("box5"));
	WebElement destination6 = driver.findElement(By.id("box105"));
	action.dragAndDrop(source6, destination6).perform();
	Thread.sleep(2000);
	
	WebElement source7 = driver.findElement(By.id("box4"));
	WebElement destination7 = driver.findElement(By.id("box104"));
	action.dragAndDrop(source7, destination7).perform();
	Thread.sleep(2000);
	
	for(int i = 1;i<8;i++) {
		WebElement source = driver.findElement(By.id("box"+i));
		WebElement destination = driver.findElement(By.id("capitals"));
		action.dragAndDrop(source, destination).perform();
		Thread.sleep(2000);
	}
	
	
}
}
