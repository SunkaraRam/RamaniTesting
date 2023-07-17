package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Xpath {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
				WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );

	driver.get("https://www.flipkart.com/account/login");
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("flipkart lAunch");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("keerthi.ramani 2345@gmail.com");
	
	//driver.findElement(By.xpath("//span[text()='Cart']")).click();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//a[text()='Flights']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//a[text()='Flipkart Wholesale']"));
	Thread.sleep(2000);

	driver.findElement   (By.xpath("//a[text()='Corporate Information']")).click();
	Thread.sleep(2000);

	}

}
