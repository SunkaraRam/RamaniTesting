package ramaniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ramani_maven {

	public static void main(String[] args) throws InterruptedException {  
		
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ramani");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9892839222");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ram.sunkara@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6565sdf");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//input[@id='female']")).click();
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		driver.findElement(By.xpath("//input[@id='thursday']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		driver.findElement(By.xpath("//input[@id='saturday']")).click();
		driver.findElement(By.xpath("//input[@id='sunday'] ")).click();
		
		
		WebElement drp = driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",drp );
		
		Select slc = new Select(drp);
		
		slc.selectByIndex(1);
		
		Thread.sleep(5000);
		
		slc.selectByValue("8");
		
		Thread.sleep(5000);
		
		slc.selectByVisibleText("Potugal");
		
		
		
		
		driver.findElement(By.xpath("//label[@for='2years']")).click();
		driver.findElement(By.xpath("//label[@for='selenium']")).click();
		
		driver.findElement(By.xpath("//label[text()='Cucumber']")).click();
		driver.findElement(By.xpath("//label[text()='TestNG']")).click();
		driver.findElement(By.xpath("//label[text()='Serenity BDD']")).click();
		driver.findElement(By.xpath("//label[text()='Mabl']")).click();
		driver.findElement(By.xpath("//label[text()='Testim']")).click();
//	     driver.findElement(By.xpath("")).click();
	   //  driver.findElement(By.xpath("")).click();
	  //   driver.findElement(By.xpath("")).click();
	
	
	
		 Thread.sleep(5000);
		 
		 driver.close();


		
		
	}

}
