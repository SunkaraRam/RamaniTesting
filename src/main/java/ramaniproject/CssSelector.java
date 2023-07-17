package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
				
	System.out.println(driver.findElement(By.cssSelector("button")).getAttribute("id"));	
		
			driver.findElement(By.cssSelector("#firstName")).sendKeys("keerthiram");	
			driver.findElement(By.cssSelector(".gender")).sendKeys("female");
			
			System.out.println(driver.findElements(By.cssSelector("*")).size());
				
	
			
		
		
				
		
	

	
	
	
	
	}

}
