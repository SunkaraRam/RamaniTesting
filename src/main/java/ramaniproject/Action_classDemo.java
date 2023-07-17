package ramaniproject;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_classDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	

	WebDriver driver = new ChromeDriver(co);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	/*
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement from = driver.findElement(By.xpath("//a[text() =' BANK '] "));
	WebElement to = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	Actions acn1 = new Actions(driver);
	acn1.dragAndDrop(from,to);
	acn1.build().perform();
	
	WebElement from1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement to1 = driver.findElement(By.xpath("(//li[@class='placeholder']) [1]"));
	
	Actions acn2 = new Actions(driver);
	acn2.dragAndDrop(from1, to1);
	acn2.build().perform();
	
	WebElement from2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement to2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

	Actions acn3 = new Actions(driver);
	acn3.dragAndDrop(from2, to2);
	acn3.build().perform();
	
	
	WebElement from3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement to3 = driver.findElement(By.xpath("//li[@class='placeholder']"));
	
	Actions ancn4 = new Actions(driver);
	ancn4.dragAndDrop(from3, to3);
	ancn4.build().perform();
	
	*/
	
	driver.get("https://demoqa.com/text-box");
    
    // Enter the Full Name
    WebElement fullName = driver.findElement(By.id("userName"));
    fullName.sendKeys("Mr.Peter Haynes");
    
    //Enter the Email
    WebElement email=driver.findElement(By.id("userEmail"));
    email.sendKeys("PeterHaynes@toolsqa.com");
    
    // Enter the Current Address
    WebElement currentAddress=driver.findElement(By.id("currentAddress"));
    currentAddress.sendKeys("43 School Lane London EC71 9GO");
    
    // Copy the Current Address
    Actions act = new Actions(driver);
    
    act.keyDown(currentAddress, Keys.CONTROL);
    act.sendKeys(currentAddress, "A");
    act.keyDown(currentAddress, Keys.CONTROL);
    act.sendKeys(currentAddress,"C");
//    act.sendKeys(currentAddress,Keys.TAB);
    act.keyDown(currentAddress,Keys.CONTROL);
    act.sendKeys(currentAddress,"V");
    act.build().perform();
//    currentAddress.sendKeys(Keys.CONTROL);
//    currentAddress.sendKeys("A");
//    currentAddress.sendKeys(Keys.CONTROL);
//    currentAddress.sendKeys("C");
    
    //Press the TAB Key to Switch Focus to Permanent Address
////    currentAddress.sendKeys(Keys.TAB);
//    Actions act1 = new Actions(driver);
//    //Paste the Address in the Permanent Address field
//    WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
//    act1.keyDown(permanentAddress,Keys.CONTROL);
//    act1.sendKeys(permanentAddress,"V");
////    act.sendKeys(permanentAddress,Keys.CONTROL);
////    act.sendKeys(permanentAddress,"V");
//    act1.build().perform();
//    permanentAddress.sendKeys(Keys.CONTROL);
//    permanentAddress.sendKeys("V");
    
    //Compare Text of current Address and Permanent Address
    //Assert.assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
    
	
	 
	
	
	
	
	
	
	}

}
