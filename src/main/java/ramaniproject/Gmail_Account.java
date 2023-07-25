package ramaniproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Account {

	private static Object child;

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);    
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AeAAQh7cK-uOVROd8g5tVc4QTCGxWe4OrNaqsDHJVXSuETTJRwSJzbksFGbX1CahLqF-XDJB3hR-&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[text()='Help']")).click();
	driver.switchTo().window(parent);
	
	driver.findElement(By.xpath("//a[text()='Privacy']")).click();
	driver.switchTo().window(parent);
	//Fixed xpath for the below elements
	driver.findElement(By.xpath("//a[text()='Terms']")).click();
	driver.switchTo().window(parent);
	
	Set<String>allwindows=driver.getWindowHandles();
	 Iterator itr = allwindows.iterator();
	 while(itr.hasNext()) {
		 
	 String child = (String) itr.next();
	 
	 if(!parent.equals(child)) {
			
			driver.switchTo().window(child);

			String childTitle=driver.getTitle();

			System.out.println(childTitle);
			
			driver.close();


	 }
	

	 
	 
}	 
	 
	 
	
	
	
	
	
	
	}

}
