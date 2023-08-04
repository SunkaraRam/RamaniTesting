package practice;

public class PolymorpismDemo1 {

	public static void main(String[] args) {
		
		PolymorpismDemo1 pl = new PolymorpismDemo1();
		
		pl.m1(10,2,2);
		pl.m1(12,2);
		pl.m1(2);
		
		
	}
	

	public  void m1(int a , int b , int c) 
	{
		
		int d  = a+b+c;
		
		System.out.println("Addition of 3 number  = "+d);
	}
	
	public void m1(int a , int b) 
	{
			
			int c  = a*b;
	
			System.out.println("Multiplication of 2 number  = "+c);
			
	}
	
	public void m1(int[] x) 
	{
		
		System.out.println("int method with single orguments");
		
	}
	
	public void m1(int x) 
	{
		System.out.println("int method with  orguments");
			
	}

}
