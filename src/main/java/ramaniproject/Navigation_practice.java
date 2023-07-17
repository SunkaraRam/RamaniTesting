package ramaniproject;

import java.io.InterruptedIOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.navigate().to("https://www.bing.com/search?q=instagram&filters=ufn%3a%22Instagram%22+sid%3a%22a2113d26-7976-df57-241f-77b7bbb1b4f7%22&asbe=HS&qs=MB&pq=in&sc=10-2&cvid=895A0FFA97DF43A1893C37F59A619F10&FORM=QBRE&sp=1");
	Thread.sleep(2000);
	
	title = driver.getTitle();
	System.out.println(title);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
	driver.close();
	
			

			
	
	
	
	
	
	}

}
