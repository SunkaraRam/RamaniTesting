package ramaniproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public

class Demotest {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C://users)//keert//onrDriver");

	WebDriverManager.chromedriver().setup();
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	

	WebDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com");
	driver.navigate().to("http://gmail.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	
	}

}
