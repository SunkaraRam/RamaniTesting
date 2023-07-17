package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_checkboxes_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
				WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("automation");
		
		driver.findElement(By.id("lastName")).sendKeys("program");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("keerthi@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("123344");
		
		driver.findElement(By.id("frenchchbx")).click();
		
		driver.findElement(By.id("latinchbx")).click();

		driver.findElement(By.id("spanishchbx")).click();
	
		driver.findElement(By.id("chinesechbx")).click();
		
		driver.findElement(By.id("hindichbx")).click();
		
		driver.findElement(By.id("englishchbx")).click();
		
		driver.findElement(By.id("registerbtn")).click();
		
	//driver.findElement(By.id("clearbtn")).click();
	
	
	}
	
	
}
	
	


