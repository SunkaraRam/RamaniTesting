import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowAutomate {
	
	WebDriver driver;
	
	
	@Test
	public void clrpage() {
		
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		  
		
		WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://chromium.googlesource.com/chromium/src/+log/116.0.5803.0..116.0.5817.0?pretty=fuller&n=10000");
		
		
	}
	
//	@Test
	public  void main() {
		
		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		  
		
		WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://bugs.chromium.org/p/chromium/issues/list?q=OS%3DAndroid%2CAll%20status%3DFixed%20%C2%A0-status%3DDuplicate%2CExternalDependency%20-label%3Achromium-waterfall%2CPerformance-Size%2CPerformance-Sheriff%20-component%3AMobile%3EWebView%2CBuild%2CInfra%3ELabs%2CInfra%3EClient%3EAndroid%2CInfra%3EClient%3EChrome%2CInfra%3EClient%3EChromeOS%2CInfra%3EClient%3EWebRTC%2CSpeed%3ETelemetry%2CInfra%3EClient%2CInternals%3ENetwork%3ELibrary%2CTests%3EFlaky%2CTest%3EAndroid%2CTests%3EDisabled%2CInternals%3EMetrics%2CInfra%20-type%3DLaunch-OWP%2CLaunch%2CFeature%2CTask&can=1&sort=-modified&start=0");
		
		WebElement shadowHost=driver.findElement(By.xpath("//mr-list-page"));
		
		SearchContext shadowRootOne= expandRootElement(driver,shadowHost);
		
		WebElement root2=shadowRootOne.findElement(By.cssSelector("mr-issue-list"));
		
		SearchContext shadowRootTwo= expandRootElement(driver,root2);
		
		List<WebElement> root3 = shadowRootTwo.findElements(By.cssSelector("mr-issue-link"));
		
		for (int i = 0; i < root3.size(); i++) {
			
			SearchContext shadowRootNth = expandRootElement(driver, root3.get(i));
			
			String JiraID = shadowRootNth.findElement(By.cssSelector("#bugLink")).getText();
			
			System.out.println(JiraID);
			
		}
		
		SearchContext shadowRootNth = expandRootElement(driver, root3.get(3));

		String JiraID = shadowRootNth.findElement(By.cssSelector("#bugLink")).getText();
				
		System.out.println(JiraID);	
		
		
			
		}
	
	 public SearchContext expandRootElement (WebDriver driver, WebElement element) {
		    SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver).executeScript (
		    "return arguments[0].shadowRoot", element);
		    return shadowRoot;
		 }
	 
	 public WebDriver getDriver() {
		 
		  driver=this.driver;
		 
		  return driver;
	 }

}
