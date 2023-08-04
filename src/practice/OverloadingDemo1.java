package practice;

public class OverloadingDemo1 {
	
	
	public static void main(String[] args) {
		
		OverloadingDemo1 od = new OverloadingDemo1();
		
		od.m1(34.03f);
			
	}
	
	
	public void m1() {
		System.out.println("No - args");
	}
	
	public void m1(int i) {
		System.out.println("Int args");
	}
	public void m1(double d) {
		System.out.println("double args");
	}
	
	public void m1(float f) {
		System.out.println("float args");
	}


}
