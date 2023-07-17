package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	

	WebDriver driver = new  ChromeDriver(co);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//button")).click();
	
	
	
	
	}

}
