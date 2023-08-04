package Pages;

import practice.Student;

public class CheckProtectedAccess extends Student{
	
	public static void main(String[] args) {
		
		showName();
		
		
	}
	
	public void method1() {
		
		showMobileName();
	}

public static void addN(int a,int b) {
		
		int c = a+b;
		
		System.out.println("Addition of two numbers : "+c);
		
	}
	
}
