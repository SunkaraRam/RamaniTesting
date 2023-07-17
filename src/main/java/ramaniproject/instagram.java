package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class instagram {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		WebDriver driver= new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("9100238625");
		
		
driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("keerthi ramani");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ravi");
driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("543643");

Thread.sleep(3000);
	
String error=	
driver.findElement(By.xpath("//p[@id='ssfErrorAlert']")).getText();
System.out.println("A user with that username already exists");	 
	
	}
	
}


