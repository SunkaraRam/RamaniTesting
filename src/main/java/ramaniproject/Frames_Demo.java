package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Demo {

	
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	

	
	
	WebDriver driver = new  ChromeDriver(co);
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	
	driver.get("https://the-internet.herokuapp.com/");
		
	driver.findElement(By.linkText("Frames")).click();
	
	driver.findElement(By.linkText("Nested Frames")).click();
	
	driver.switchTo().frame("frame-top");
	
	driver.switchTo().frame("frame-middle");
	
	WebElement we = driver.findElement(By.xpath("//div[text()='MIDDLE']"));
	
	Actions act = new Actions(driver);
	
	act.doubleClick(we).build().perform();
	
	Thread.sleep(2000);
	
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().frame("frame-left");
			
	WebElement we1 = driver.findElement(By.xpath("(//body)[1][contains(text(),'LEFT')]"));
	
	act.doubleClick(we1).build().perform();
	
	
	driver.switchTo().parentFrame();
			
	driver.switchTo().frame("frame-right");

	//			
	WebElement we2 = driver.findElement(By.xpath("	"));

	act.doubleClick(we2).build().perform();
		
	driver.switchTo().defaultContent();

	driver.switchTo().frame("frame-bottom");
	
	WebElement we3 = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));

	act.doubleClick(we3).build().perform();	
	

	
	int i = 0;
	
	while (i<10) {
		System.out.println(i);
		
		i++;
	}
	}

}
