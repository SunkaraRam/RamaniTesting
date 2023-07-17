package ramaniproject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Sect {

	public static void main(String[] args) throws  InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		

		
		
		WebDriver driver = new  ChromeDriver(co);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for (WebElement link: allLinks) {
				
			String text= link.getText();
			
			System.out.println(text);
			
				      
			if("SQL".equals(text)){				
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
			      
				js.executeScript("arguments[0].scrollIntoView(true);", link);
				
				Thread.sleep(5000);
				
				link.click();
		
				
			}
			
		}

		

 /* WebElement  courseElement = driver.findElement(By.id("course"));
 
 Select coursenameDropdown = new Select (courseElement);
 
   List<WebElement>courseNameDropdownoptions = coursenameDropdown.getOptions();
  
 for(WebElement option:courseNameDropdownoptions) {
	 System.out.println(option.getText());
 }
 
 List<String> li = new ArrayList();
 li.add("Ram");
 li.add("RAvi");
 li.add("Ramani");
 li.add("RAvan");
 
 for (String name:li) {
	
	 System.out.println(name);
}
 

coursenameDropdown.selectByIndex(3);
Thread.sleep(2000);
	coursenameDropdown.selectByValue("net");
	Thread.sleep(2000);
	coursenameDropdown.selectByVisibleText("Javascript");
	
	*/
	
	
	}

}
