package ramaniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("https://github.com/login");
	Thread.sleep(30);
WebElement usernametext	 = driver.findElement(By.id("login_field"));
	
	if(usernametext.isDisplayed()) {
		if(usernametext.isEnabled()) {
			usernametext.sendKeys("ghf");
			String entertext = usernametext.getAttribute("value");
			System.out.println(entertext);
			usernametext.clear();
		}
		else 
		System.out.println("user  textbox is not enabled");
	}
	else
		System.out.println("user textbox is not displayed");
	}
	}


