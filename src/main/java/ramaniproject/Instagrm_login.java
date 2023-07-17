package ramaniproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagrm_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		  
		
		WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("keerthi 234532");
		
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("keerthi ramani");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@class='_a3wf _-kb segoe']")).click();
		
		//List<WebElement> allLinks  =  driver.findElements(By.tagName())
		
		//driver.findElement(By.xpath("//*[text()='WhatsApp']")).click();
		
 

	
	
	
	
	
	}

}
