package practice;

public class OverloadingDemo2 {
	
	public static void main(String[] args) {
		
		OverloadingDemo2 od = new OverloadingDemo2();
		
		od.m1(10f); // float args
		
		od.m1(10);// int 
		
		od.m1('a'); // 
			
	}
	
//	public void m1(int i) {
//		System.out.println("Int args");
//	}
	public void m1(double d) {
		System.out.println("double args");
	}
	
	

}
