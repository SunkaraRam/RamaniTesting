package practice;

public class MathDemo {
	
	public static void main(String[] args) {

		System.out.println(Math.max(10, 30));
		
		System.out.println(Math.min(20, 10));
		
		System.out.println(Math.sqrt(100)); //
		
		System.out.println(Math.abs(-54543)); // 
		
		System.out.println(Math.pow(3, 3));
		
		double d = Math.random()*100;

		System.out.println("Before converting to int = "+d);
		
		int f = (int)d;
		
		System.out.println("After converting to int = "+f);
		
	}

}
