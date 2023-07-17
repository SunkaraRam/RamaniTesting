import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFlowcheck {
	
	@BeforeSuite
	public void m5() {
		System.out.println("This is before suite");
	}
	
	@BeforeTest
	public void m6() {
		System.out.println("This is before Test");
	}
	
	@BeforeClass
	public void m3() {
		System.out.println("This is before class");
	}
	
	@BeforeMethod
	public void m1() {
		
		System.out.println("This is before method");
	}
	@Test(groups="regression")
	public void testcase1() {
		System.out.println("This is testcase one");
	}

	@Test(groups = "smoke")
	public void testcase2() {
		System.out.println("This is testcase two smoke from TF");
	}
	
	@AfterMethod
	public void m2() {
		
		System.out.println("This is after method");
	}
	@AfterClass
	public void m4() {
		System.out.println("This is after class");
	}
	
	
	@AfterTest
	public void m7() {
		System.out.println("This is After Test");
	}
	
	@AfterSuite
	public void m8() {
		System.out.println("This is After suite");
	}

}
