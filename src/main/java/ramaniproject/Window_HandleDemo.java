package ramaniproject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_HandleDemo {

	private static String[] handles;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		WebDriver driver = new ChromeDriver(co);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

 String  parentHandle = driver.getWindowHandle();
 
 System.out.println("parent window-"+parentHandle);
 

driver.findElement(By.id("newWindowBtn")).click();
     Set<String>Handles = driver.getWindowHandles();
     
     for(String handle:handles) {
     System.out.println(handle);
     if(!handle.equals(parentHandle));
     driver.switchTo().window(handle);
     driver.findElement(By.id("firstName")).sendKeys("ram");
     
     Thread.sleep(2000);
     driver.close();
     
     
     }
	
	Thread.sleep(3000);
	driver.findElement(By.id("name")).sendKeys("keerthi");
	driver.quit();
	
	
	
	}

}
