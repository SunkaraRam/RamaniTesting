package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Twitter_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.get("https://www.bing.com/search?q=https%3A%2F%2Ftwitter.com%2Flogin&qs=n&form=QBRE&sp=-1&lq=0&pq=&sc=0-0&sk=&cvid=FE064CF57A7645C395ACE73DF8F4163D&ghsh=0&ghacc=0&ghpl=");
	
	driver.findElement(By.xpath("//input[@class='b_searchbox']")).sendKeys("twitter login");
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@name='identifier']")).click();
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("twitter name");
	
	driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("2345");

	
	driver.navigate().back();
	

	driver.findElement(By.xpath("//*[text()='Instagram']/ancestor::div[8]")).click();
	Thread.sleep(2000);

	
		
	}

}
