package practice;

public class OverridingChild extends OverridingParent1{

	public void marry() {
		
		System.out.println("Charan");
	}
	
	public void add(int a , int b) {
		
		int c = a*b;
		
		System.out.println("Multiplication of two numbers = "+c);
		
	}
	
	public static void mul(int a , int b) {
		
		int c = a+b;
		
		System.out.println("Multiplication of two numbers = "+c);
		
	}
	
	
	public static void main(String[] args) {
		
		OverridingChild ov = new OverridingChild();
		
		ov.add(10, 2);
		
		OverridingParent1 ovp = new OverridingParent1();
		
		ovp.add(10, 2);
		
		OverridingParent1 ovp1 = new OverridingChild();
		
		ovp1.add(12, 2);
		
		ovp1.mul(10, 10);
		
		
	}
	
	
	
}
