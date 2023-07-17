package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	

	WebDriver driver = new ChromeDriver(co);
	driver.manage().deleteAllCookies();
	driver.manage().window();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://m.facebook.com/?locale=en_gb");
	driver.findElement(By.xpath("//a[@class='_5t3c _28le btn btnS medBtn mfsm touchable']")).click();
	
	driver.findElement(By.xpath("//input[@id='firstname_input']")).sendKeys("ram");
	driver.findElement(By.xpath("//input[@id='lastname_input']")).sendKeys("sunkara ram");
	driver.findElement(By.xpath("(//button[@value='Next'][1])")).click();
	
	Thread.sleep(4000);
	WebElement bday= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select cls = new Select(bday);
	cls.selectByIndex(1);
	
	
    WebElement mnth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
    Select cls1 = new Select(mnth);
    cls1.selectByVisibleText("Mar");
    WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select cls2= new Select (year);
    cls2.selectByValue("2020");
	
	
	}

}
