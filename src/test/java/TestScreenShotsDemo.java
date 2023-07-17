

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import bsh.Interpreter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenShotsDemo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	

	WebDriver driver = new ChromeDriver();//3
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();//1
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//2
	
	driver.get("https://www.google.com");
	
	//File
	TakesScreenshot ts = (TakesScreenshot)driver;//5
	File sourcefile = ts.getScreenshotAs(OutputType.FILE);//4
	File destFile = new File("C:\\Users\\keert\\OneDrive\\Pictures\\Screenshots\\img1.jpg");//6sss
	FileUtils.copyFile(sourcefile, destFile);
	System.out.println("Screenshot saved successfully");
	
	driver.quit();
	
	}

}
