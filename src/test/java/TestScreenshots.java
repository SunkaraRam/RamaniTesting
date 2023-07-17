import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenshots {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);//3
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//1
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//2
		
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;//5
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);//4
		File destFile = new File("C:\\Users\\keert\\OneDrive\\Pictures\\Screenshots\\img1.jpg");//6sss
		FileUtils.copyFile(sourcefile, destFile);
		System.out.println("Screenshot saved successfully");


	}

}
