package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Practice {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
				WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

Thread.sleep(3000);

driver.findElement(By.xpath("//label[text()='First Name ']")).sendKeys("keerthi");

driver.findElement(By.xpath("//label[text()='Last Name']")).sendKeys("ramani");

//driver.findElement(By.id("//label[text()='Email']/following-sibling::input[1]")).sendKeys("keerthi@gmail.com");

driver.findElement(By.xpath("//label[text()='Email']")).sendKeys("keerthi@gmail.com");


	
	driver.findElement(By.xpath("//td[text()='Maria Anders']")).click();
	
	driver.findElement(By.xpath("//td[text()='Francisco Chang']")).click();
	
	
	}

}
