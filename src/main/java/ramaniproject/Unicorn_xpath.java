package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Unicorn_xpath {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
			
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        driver.get("https://www.unicornsignals.com/");
        
        driver.findElement(By.xpath("//h4[text()='Company']"));
	driver.findElement(By.xpath("//input[@id='news_letter_imput']")).sendKeys("uni123");
	driver.findElement(By.xpath("//button[@id='submit']")).click();
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[@id='submit']")));
	
	
	
	String opt=driver.findElement(By.xpath("//h4[text()='Opportunities']")).getText();
	
	
	WebElement optWeb=driver.findElement(By.xpath("//h4[text()='Opportunities']"));
	
	String opt1 = optWeb.getText();
	
	driver.findElement(By.xpath("//h4[text()='Quick links']"));
	driver.findElement(By.xpath("//h4[text()='Policies']"));
    driver.findElement(By.xpath("//a[@class='nav-link active']/ancestor::div[1]"));
     driver.findElement(By.xpath("//b[text()='Midcap']"));
     driver.findElement(By.xpath("//b[text()='Breakdown']"));
     driver.findElement(By.xpath("//b[text()='Breakout']"));
	 driver.findElement(By.xpath("//b[text()='Nifty']"));
	}

}
