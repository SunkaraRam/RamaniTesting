package practice;

public abstract class A {
	
	private int rollNumber = 123;

	private String name = "Ram";
	
	public abstract void add(int a,int b);
	
	public abstract void sub(int a,int b);
	
	public abstract void mul(int a,int b);
	
	public void division(int a, int b) {
		
		int c = a/b;
		
		System.out.println("Results = "+c);
		
	}
}
