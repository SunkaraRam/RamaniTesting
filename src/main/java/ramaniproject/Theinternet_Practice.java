package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Theinternet_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		WebDriver  driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		 
		
	String urid="https://"+"admin"+":"+"admin"+"@"+"the-internet.herokuapp.com/basic_auth";
			
			driver.get(urid);
			Thread.sleep(4000);
			String urid1="https://"+":"+"admin"+"admin"+"@"+"the-internet.herokuapp.com/digest_auth";
			driver.get(urid);
			Thread.sleep(4000);
			
			driver.get("https://the-internet.herokuapp.com/");
			
			driver.findElement(By.linkText("A/B Testing")).click();
			
			
			String header = driver.findElement(By.xpath("// h3 ")).getText();
			
			
			
			System.out.println(header);
			
			String paragraph = driver.findElement(By.xpath("//p")).getText();
			
			System.out.println(paragraph);
			
			driver.navigate().back();
			
			driver.findElement(By.linkText("Add/Remove Elements")).click();
			
driver.findElement(By.xpath("//button [@onclick='addElement()']"));


driver.navigate().back();

driver.findElement(By.xpath("//div[@id='hot-spot']"));


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
