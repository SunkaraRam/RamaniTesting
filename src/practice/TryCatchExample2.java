package practice;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		try {
			
		
		int[] num = {10,20,30,40};
		
		System.out.println(num[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		 finally {  
				System.out.println("finally block is always executed");  
				} 
		System.out.println("Rest of the code");
		
		
	}

}
