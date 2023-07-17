import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Practice {
	
	
	@Test(priority = 3)
	public void testcase1() {
		
		System.out.println("This is testcase1");
		
	}

	@Test(priority = 2)
	public void testcase2() {
		
		System.out.println("This is testcase2");
		
	}

	@Test(priority = 4)
	public void testcase3() {
		
		System.out.println("This is testcase3");
		
	}
	
	@Test(priority = 1)
	public void testcase4() {
		
		System.out.println("This is testcase4");
		
	}
	
	@Test
	public void googleTest() {
		
		System.out.println("Google Testcase");
		
	}
	@Test(enabled=false)
	public void flipkartTest() {
		
		System.out.println("flipkart Testcase");
		
	}
	
	@Test(dependsOnGroups = "regression")
	public void login() {
		
		Assert.assertEquals("This home page", "This home page");
		
		System.out.println("logged in successfully");
	}
	@Test(dependsOnMethods = "login")
	public void homePage() {
		
		System.out.println("User is navigated to home page successfully");
	}
	
	@Test(groups="regression")
	public void registration() {
		
		System.out.println("This is registration");
	}
	@Test(groups="regression")
	public void payment() {
			
			System.out.println("This is payment");
		}
	
	@Test(groups="smoke")
	public void m1() {
		System.out.println("This is smoke testcases from TP");
	}
	
}


