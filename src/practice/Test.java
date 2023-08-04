package practice;

public class Test {
	
	static int count=0;
	
	{
		count ++;
	}
	
	
	int number;
	double salary;
	float tax;
	Test(){
		
		System.out.println("Default constructor");
	}
	 Test(int input){
		this.number=input;
		System.out.println("countrustor with int orgument ");
		
	}
	Test(double d){
		this.salary=d;
		System.out.println("countrustor with double orgument");
	}
	Test(float f){
		this.tax=f;
		System.out.println("countrustor with double orgument");
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		Test t2 = new Test(10);
		
		System.out.println("EmployeeID "+t2.number);
				
		Test t3 = new Test(10.232d);
		
		System.out.println("Salary "+t3.salary);
		
		Test t4 = new Test(75.8f);
		System.out.println("Tax "+t4.tax);

		t1.m1();
		
		
		
		
		System.out.println("The number of Objects created "+count);
		

		
		
		
	}
	
	private static void m1() { // method
		
		System.out.println("Static method");
		
	}
	
}
