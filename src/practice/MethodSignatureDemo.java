package practice;

public class MethodSignatureDemo {

	
	
	public static void m1(int num) {
		
		System.out.println("Int method");
	}

	public static void m1(boolean name) {
		
		System.out.println("boolean method");
	}


	public static void main(String[] args) {
		
		
		
		m1(1);
		
		m1(true);
		
	}

}
