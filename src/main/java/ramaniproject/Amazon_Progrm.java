package ramaniproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Progrm {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
	

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/s?k=amazon+login&crid=BGBTEV2TAUU1&sprefix=amazon+login%2Caps%2C397&ref=nb_sb_noss_1");


	
		
		JavascriptExecutor js = (JavascriptExecutor)  driver;
	WebElement searchbox= driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
	searchbox.click();
	
	driver.navigate().back();
	
	driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).sendKeys("ramani login");

	driver.close();
	
	js.executeScript("arguments[0].click();",driver.findElement(By.name("(//a[text()='Best Sellers'])[1]")));
	
	
//js.executeScript("arguments[0].value='amazon login';",searchbox);
	
	
	
	js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//span[contains(text(),'Kindle Unlimited')]")));
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	js.executeScript("arguments[0].click();",driver .findElement(By.name("//a[text()='Sell']"))); 
	
	js.executeScript("arguments[0].click();",driver.findElement(By.name("(//a[text()='Best Sellers'])[1]")));
	



	
	}

}
